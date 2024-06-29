import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class615 {

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "[J")
    private long[] field8265 = new long[8];

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "[J")
    private long[] field8268 = new long[8];

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "[B")
    private byte[] field8267 = new byte[32];

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "[J")
    private long[] field8269 = new long[8];

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "[J")
    private long[] field8273 = new long[8];

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "[J")
    private long[] field8272 = new long[8];

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "[B")
    private byte[] field8275 = new byte[64];

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    private int field8277 = 0;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    private int field8278 = 0;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([BBJ)V", line = 9)
    public final void method3483(byte[] arg0, byte arg1, long arg2) {
        field8276++;
        int var5 = 0;
        int var6 = 8 - ((int) arg2 & 0x7) & 0x7;
        int var7 = this.field8277 & 0x7;
        int var8 = -14 / ((arg1 + 76) / 47);
        long var9 = arg2;
        int var11 = 31;
        int var12 = 0;
        while (var11 >= 0) {
            int var17 = (this.field8267[var11] & 0xFF) + ((int) var9 & 0xFF) + var12;
            this.field8267[var11] = (byte) var17;
            var12 = var17 >>> 8;
            var9 >>>= 0x8;
            var11--;
        }
        while (arg2 > 8L) {
            int var16 = arg0[var5] << var6 & 0xFF | (arg0[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var16 < 0 || var16 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field8275[this.field8278] = (byte) class678.method3817(this.field8275[this.field8278], var16 >>> var7);
            this.field8278++;
            this.field8277 += 8 - var7;
            if (this.field8277 == 512) {
                this.method3486(false);
                this.field8277 = this.field8278 = 0;
            }
            this.field8275[this.field8278] = (byte) class665.method3759(var16 << 8 - var7, 255);
            this.field8277 += var7;
            var5++;
            arg2 -= 8L;
        }
        int var13;
        if (arg2 > 0L) {
            var13 = arg0[var5] << var6 & 0xFF;
            this.field8275[this.field8278] = (byte) class678.method3817(this.field8275[this.field8278], var13 >>> var7);
        } else {
            var13 = 0;
        }
        if ((long) var7 + arg2 < 8L) {
            this.field8277 = (int) ((long) this.field8277 + arg2);
            return;
        }
        this.field8278++;
        long var14 = arg2 - (long) (8 - var7);
        this.field8277 += 8 - var7;
        if (this.field8277 == 512) {
            this.method3486(false);
            this.field8277 = this.field8278 = 0;
        }
        this.field8275[this.field8278] = (byte) class665.method3759(var13 << 8 - var7, 255);
        this.field8277 += (int) var14;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)B", line = 119)
    public static final byte method3484(int arg0, int arg1, int arg2) {
        if (arg0 != 18109) {
            method3484(-94, 125, 54);
        }
        field8266++;
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II[B)V", line = 138)
    public final void method3485(int arg0, int arg1, byte[] arg2) {
        field8270++;
        this.field8275[this.field8278] = (byte) class678.method3817(this.field8275[this.field8278], 0x80 >>> class665.method3759(this.field8277, 7));
        this.field8278++;
        if (this.field8278 > 32) {
            while (true) {
                if (this.field8278 >= 64) {
                    this.method3486(false);
                    this.field8278 = 0;
                    break;
                }
                this.field8275[this.field8278++] = 0;
            }
        }
        while (this.field8278 < 32) {
            this.field8275[this.field8278++] = 0;
        }
        class245.method1646(this.field8267, 0, this.field8275, 32, 32);
        this.method3486(false);
        if (arg1 <= 31) {
            return;
        }
        int var4 = 0;
        int var5 = arg0;
        while (var4 < 8) {
            long var6 = this.field8273[var4];
            arg2[var5] = (byte) ((int) (var6 >>> 56));
            arg2[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg2[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg2[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg2[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg2[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg2[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg2[var5 + 7] = (byte) ((int) var6);
            var5 += 8;
            var4++;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V", line = 191)
    private final void method3486(boolean arg0) {
        field8271++;
        int var2 = 0;
        if (arg0) {
            this.field8273 = null;
        }
        int var3 = 0;
        while (var2 < 8) {
            this.field8268[var2] = class514.method3068(class514.method3068(class514.method3068(class605.method3445(255L, (long) this.field8275[var3 + 5]) << 16, class514.method3068(class514.method3068(class605.method3445(0xFFL << 32, (long) this.field8275[var3 + 3] << 32), class514.method3068(class605.method3445(0xFFL << 40, (long) this.field8275[var3 + 2] << 40), class514.method3068(class605.method3445(255L, (long) this.field8275[var3 + 1]) << 48, (long) this.field8275[var3] << 56))), class605.method3445((long) this.field8275[var3 + 4], 255L) << 24)), class605.method3445(0xFFL << 8, (long) this.field8275[var3 + 6] << 8)), class605.method3445((long) this.field8275[var3 + 7], 255L));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field8272[var4] = class514.method3068(this.field8268[var4], this.field8265[var4] = this.field8273[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field8269[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field8269[var7] = class514.method3068(this.field8269[var7], class729.field10152[var13][class665.method3759((int) (this.field8265[class665.method3759(var7 - var13, 7)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field8265[var8] = this.field8269[var8];
            }
            this.field8265[0] = class514.method3068(this.field8265[0], class729.field10147[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field8269[var9] = this.field8265[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field8269[var9] = class514.method3068(this.field8269[var9], class729.field10152[var11][class665.method3759(255, (int) (this.field8272[class665.method3759(var9 - var11, 7)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field8272[var10] = this.field8269[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field8273[var6] = class514.method3068(this.field8273[var6], class514.method3068(this.field8268[var6], this.field8272[var6]));
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V", line = 298)
    public final void method3487(byte arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field8267[var2] = 0;
        }
        field8274++;
        this.field8277 = this.field8278 = 0;
        this.field8275[0] = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field8273[var3] = 0L;
        }
        if (arg0 != 26) {
            this.field8267 = null;
        }
    }
}
