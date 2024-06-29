import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class668 {

    @OriginalMember(owner = "client!or", name = "a", descriptor = "[B")
    private byte[] field9165 = new byte[32];

    @OriginalMember(owner = "client!or", name = "b", descriptor = "[J")
    private long[] field9166 = new long[8];

    @OriginalMember(owner = "client!or", name = "e", descriptor = "[J")
    private long[] field9169 = new long[8];

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    private int field9168 = 0;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    private int field9167 = 0;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "[B")
    private byte[] field9171 = new byte[64];

    @OriginalMember(owner = "client!or", name = "n", descriptor = "[J")
    private long[] field9178 = new long[8];

    @OriginalMember(owner = "client!or", name = "h", descriptor = "[J")
    private long[] field9172 = new long[8];

    @OriginalMember(owner = "client!or", name = "k", descriptor = "[J")
    private long[] field9175 = new long[8];

    @OriginalMember(owner = "client!or", name = "i", descriptor = "[[I")
    public static int[][] field9173 = new int[6][];

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field9176;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "I")
    public static int field9177;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "I")
    public static int field9180;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public final void method3748(int arg0) {
        field9177++;
        int var2 = 0;
        if (arg0 != -3192) {
            this.field9167 = -7;
        }
        while (var2 < 32) {
            this.field9165[var2] = 0;
            var2++;
        }
        this.field9171[0] = 0;
        this.field9168 = this.field9167 = 0;
        for (int var3 = 0; var3 < 8; var3++) {
            this.field9172[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
    public static final void method3749(byte arg0) {
        field9180++;
        class134.field1676 = true;
        if (arg0 >= -26) {
            field9173 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
    private final void method3750(int arg0) {
        field9179++;
        int var2 = 0;
        int var3 = 0;
        while (var2 < 8) {
            this.field9178[var2] = class139.method1013(class139.method1013(class227.method1401(0xFFL << 8, (long) this.field9171[var3 + 6] << 8), class139.method1013(class227.method1401(255L, (long) this.field9171[var3 + 5]) << 16, class139.method1013(class227.method1401(0xFFL << 24, (long) this.field9171[var3 + 4] << 24), class139.method1013(class139.method1013(class227.method1401((long) this.field9171[var3 + 2] << 40, 0xFFL << 40), class139.method1013((long) this.field9171[var3] << 56, class227.method1401((long) this.field9171[var3 + 1] << 48, 0xFFL << 48))), class227.method1401((long) this.field9171[var3 + 3] << 32, 0xFFL << 32))))), class227.method1401((long) this.field9171[var3 + 7], 255L));
            var2++;
            var3 += 8;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field9166[var4] = class139.method1013(this.field9178[var4], this.field9169[var4] = this.field9172[var4]);
        }
        int var5 = 1;
        if (arg0 != -10359) {
            this.field9171 = null;
        }
        while (var5 <= 10) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field9175[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field9175[var7] = class139.method1013(this.field9175[var7], class65.field879[var13][class296.method1733((int) (this.field9169[class296.method1733(7, var7 - var13)] >>> var14), 255)]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field9169[var8] = this.field9175[var8];
            }
            this.field9169[0] = class139.method1013(this.field9169[0], class65.field888[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field9175[var9] = this.field9169[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field9175[var9] = class139.method1013(this.field9175[var9], class65.field879[var11][class296.method1733((int) (this.field9166[class296.method1733(7, var9 - var11)] >>> var12), 255)]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field9166[var10] = this.field9175[var10];
            }
            var5++;
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field9172[var6] = class139.method1013(this.field9172[var6], class139.method1013(this.field9178[var6], this.field9166[var6]));
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "([BIB)V")
    public final void method3751(byte[] arg0, int arg1, byte arg2) {
        this.field9171[this.field9167] = (byte) class5.method105(this.field9171[this.field9167], 0x80 >>> class296.method1733(this.field9168, 7));
        field9176++;
        this.field9167++;
        if (this.field9167 > 32) {
            while (true) {
                if (this.field9167 >= 64) {
                    this.method3750(-10359);
                    this.field9167 = 0;
                    break;
                }
                this.field9171[this.field9167++] = 0;
            }
        }
        while (this.field9167 < 32) {
            this.field9171[this.field9167++] = 0;
        }
        class211.method1330(this.field9165, 0, this.field9171, 32, 32);
        this.method3750(-10359);
        int var4 = -21 % ((arg2 + 57) / 43);
        int var5 = 0;
        int var6 = arg1;
        while (var5 < 8) {
            long var7 = this.field9172[var5];
            arg0[var6] = (byte) ((int) (var7 >>> 56));
            arg0[var6 + 1] = (byte) ((int) (var7 >>> 48));
            arg0[var6 + 2] = (byte) ((int) (var7 >>> 40));
            arg0[var6 + 3] = (byte) ((int) (var7 >>> 32));
            arg0[var6 + 4] = (byte) ((int) (var7 >>> 24));
            arg0[var6 + 5] = (byte) ((int) (var7 >>> 16));
            arg0[var6 + 6] = (byte) ((int) (var7 >>> 8));
            arg0[var6 + 7] = (byte) ((int) var7);
            var6 += 8;
            var5++;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BJ[B)V")
    public final void method3752(byte arg0, long arg1, byte[] arg2) {
        field9170++;
        int var5 = 0;
        int var6 = 8 - ((int) arg1 & 0x7) & 0x7;
        if (arg0 != -86) {
            this.field9172 = null;
        }
        int var7 = this.field9168 & 0x7;
        long var8 = arg1;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field9165[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field9165[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg1 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field9171[this.field9167] = (byte) class5.method105(this.field9171[this.field9167], var15 >>> var7);
            this.field9168 += 8 - var7;
            this.field9167++;
            if (this.field9168 == 512) {
                this.method3750(-10359);
                this.field9168 = this.field9167 = 0;
            }
            this.field9171[this.field9167] = (byte) class296.method1733(255, var15 << 8 - var7);
            arg1 -= 8L;
            this.field9168 += var7;
            var5++;
        }
        int var12;
        if (arg1 > 0L) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field9171[this.field9167] = (byte) class5.method105(this.field9171[this.field9167], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if (((long) var7 + arg1) < 8L) {
            this.field9168 = (int) ((long) this.field9168 + arg1);
            return;
        }
        this.field9167++;
        long var13 = arg1 - (long) (8 - var7);
        this.field9168 += 8 - var7;
        if (this.field9168 == 512) {
            this.method3750(-10359);
            this.field9168 = this.field9167 = 0;
        }
        this.field9171[this.field9167] = (byte) class296.method1733(var12 << 8 - var7, 255);
        this.field9168 += (int) var13;
    }

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
    public static void method3753(int arg0) {
        field9173 = null;
        if (arg0 != 2) {
            method3749((byte) 1);
        }
    }
}
