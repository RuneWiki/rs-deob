import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class607 {

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "[B")
    private byte[] field8474 = new byte[32];

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "[J")
    private long[] field8476 = new long[8];

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "[J")
    private long[] field8477 = new long[8];

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "[J")
    private long[] field8478 = new long[8];

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    private int field8470 = 0;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "[B")
    private byte[] field8481 = new byte[64];

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "[J")
    private long[] field8469 = new long[8];

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "[J")
    private long[] field8480 = new long[8];

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    private int field8473 = 0;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field8468 = 0;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "Lvl;")
    public static class15 field8483 = new class15(14, 1);

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field8471;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
    private final void method3445(int arg0) {
        field8482++;
        int var2 = 0;
        if (arg0 != 8) {
            return;
        }
        int var3 = 0;
        while (var2 < 8) {
            this.field8478[var2] = class439.method2557(class460.method2645(255L, (long) this.field8481[var3 + 7]), class439.method2557(class439.method2557(class439.method2557(class460.method2645(255L, (long) this.field8481[var3 + 4]) << 24, class439.method2557(class439.method2557(class460.method2645(255L, (long) this.field8481[var3 + 2]) << 40, class439.method2557((long) this.field8481[var3] << 56, class460.method2645((long) this.field8481[var3 + 1] << 48, 0xFFL << 48))), class460.method2645(255L, (long) this.field8481[var3 + 3]) << 32)), class460.method2645(0xFFL << 16, (long) this.field8481[var3 + 5] << 16)), class460.method2645((long) this.field8481[var3 + 6] << 8, 0xFFL << 8)));
            var3 += 8;
            var2++;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            this.field8480[var4] = class439.method2557(this.field8478[var4], this.field8477[var4] = this.field8469[var4]);
        }
        for (int var5 = 1; var5 <= 10; var5++) {
            for (int var7 = 0; var7 < 8; var7++) {
                this.field8476[var7] = 0L;
                int var13 = 0;
                int var14 = 56;
                while (var13 < 8) {
                    this.field8476[var7] = class439.method2557(this.field8476[var7], class565.field7996[var13][class204.method1456(255, (int) (this.field8477[class204.method1456(var7 - var13, 7)] >>> var14))]);
                    var13++;
                    var14 -= 8;
                }
            }
            for (int var8 = 0; var8 < 8; var8++) {
                this.field8477[var8] = this.field8476[var8];
            }
            this.field8477[0] = class439.method2557(this.field8477[0], class565.field7994[var5]);
            for (int var9 = 0; var9 < 8; var9++) {
                this.field8476[var9] = this.field8477[var9];
                int var11 = 0;
                int var12 = 56;
                while (var11 < 8) {
                    this.field8476[var9] = class439.method2557(this.field8476[var9], class565.field7996[var11][class204.method1456(255, (int) (this.field8480[class204.method1456(var9 - var11, 7)] >>> var12))]);
                    var12 -= 8;
                    var11++;
                }
            }
            for (int var10 = 0; var10 < 8; var10++) {
                this.field8480[var10] = this.field8476[var10];
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            this.field8469[var6] = class439.method2557(this.field8469[var6], class439.method2557(this.field8478[var6], this.field8480[var6]));
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I[BI)V")
    public final void method3446(int arg0, byte[] arg1, int arg2) {
        this.field8481[this.field8473] = (byte) class530.method3011(this.field8481[this.field8473], 0x80 >>> class204.method1456(7, this.field8470));
        field8467++;
        this.field8473++;
        if (arg0 < this.field8473) {
            while (true) {
                if (this.field8473 >= 64) {
                    this.method3445(8);
                    this.field8473 = 0;
                    break;
                }
                this.field8481[this.field8473++] = 0;
            }
        }
        while (this.field8473 < 32) {
            this.field8481[this.field8473++] = 0;
        }
        class275.method1771(this.field8474, 0, this.field8481, 32, 32);
        this.method3445(arg0 - 24);
        int var4 = 0;
        int var5 = arg2;
        while (var4 < 8) {
            long var6 = this.field8469[var4];
            arg1[var5] = (byte) ((int) (var6 >>> 56));
            arg1[var5 + 1] = (byte) ((int) (var6 >>> 48));
            arg1[var5 + 2] = (byte) ((int) (var6 >>> 40));
            arg1[var5 + 3] = (byte) ((int) (var6 >>> 32));
            arg1[var5 + 4] = (byte) ((int) (var6 >>> 24));
            arg1[var5 + 5] = (byte) ((int) (var6 >>> 16));
            arg1[var5 + 6] = (byte) ((int) (var6 >>> 8));
            arg1[var5 + 7] = (byte) ((int) var6);
            var4++;
            var5 += 8;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
    public static final void method3447(int arg0, int arg1) {
        field8479++;
        if (class469.field6348 == 0) {
            class500.field6844.method3207(arg0, -1);
        } else {
            class752.field10377 = arg0;
        }
        if (arg1 >= -88) {
            field8483 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public static void method3448(boolean arg0) {
        if (arg0) {
            field8483 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
    public final void method3449(byte arg0) {
        for (int var2 = 0; var2 < 32; var2++) {
            this.field8474[var2] = 0;
        }
        field8475++;
        this.field8481[0] = 0;
        this.field8470 = this.field8473 = 0;
        if (arg0 > -79) {
            method3450(-97, -49);
        }
        for (int var3 = 0; var3 < 8; var3++) {
            this.field8469[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)Z")
    public static final boolean method3450(int arg0, int arg1) {
        if (arg1 == -4) {
            field8472++;
            return arg0 == 3 || arg0 == 4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(JB[B)V")
    public final void method3451(long arg0, byte arg1, byte[] arg2) {
        field8471++;
        int var5 = 0;
        if (arg1 != 99) {
            return;
        }
        int var6 = 8 - ((int) arg0 & 0x7) & 0x7;
        int var7 = this.field8470 & 0x7;
        long var8 = arg0;
        int var10 = 31;
        int var11 = 0;
        while (var10 >= 0) {
            int var16 = (this.field8474[var10] & 0xFF) + ((int) var8 & 0xFF) + var11;
            this.field8474[var10] = (byte) var16;
            var8 >>>= 0x8;
            var11 = var16 >>> 8;
            var10--;
        }
        while (arg0 > 8L) {
            int var15 = arg2[var5] << var6 & 0xFF | (arg2[var5 + 1] & 0xFF) >>> 8 - var6;
            if (var15 < 0 || var15 >= 256) {
                throw new RuntimeException("LOGIC ERROR");
            }
            this.field8481[this.field8473] = (byte) class530.method3011(this.field8481[this.field8473], var15 >>> var7);
            this.field8470 += 8 - var7;
            this.field8473++;
            if (this.field8470 == 512) {
                this.method3445(8);
                this.field8470 = this.field8473 = 0;
            }
            this.field8481[this.field8473] = (byte) class204.method1456(var15 << 8 - var7, 255);
            arg0 -= 8L;
            this.field8470 += var7;
            var5++;
        }
        int var12;
        if (arg0 > 0L) {
            var12 = arg2[var5] << var6 & 0xFF;
            this.field8481[this.field8473] = (byte) class530.method3011(this.field8481[this.field8473], var12 >>> var7);
        } else {
            var12 = 0;
        }
        if ((long) var7 + arg0 < 8L) {
            this.field8470 = (int) ((long) this.field8470 + arg0);
            return;
        }
        this.field8473++;
        this.field8470 += 8 - var7;
        long var13 = arg0 - (long) (8 - var7);
        if (this.field8470 == 512) {
            this.method3445(8);
            this.field8470 = this.field8473 = 0;
        }
        this.field8481[this.field8473] = (byte) class204.method1456(var12 << 8 - var7, 255);
        this.field8470 += (int) var13;
    }
}
