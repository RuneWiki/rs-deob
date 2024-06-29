import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class207 extends class234 {

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    private int field3492 = -1;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    private int field3490 = -32768;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    private int field3511 = -1;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Lrk;")
    private class20 field3498 = null;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    private int field3491;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    private int field3509;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    private int field3486;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    private int field3506;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    private int field3482;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    private int field3499;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Lk;")
    private class215 field3489;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    private int field3483;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    private int field3484;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "Lda;")
    public static class275 field3495 = class255.method1672(112, "Konfig geladen)3");

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "Lda;")
    private static class275 field3505 = class255.method1672(99, "Loaded input handler");

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field3503 = 0;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Lda;")
    public static class275 field3502 = field3505;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Lda;")
    public static class275 field3494 = class255.method1672(96, "Lade)3)3)3");

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Lda;")
    private static class275 field3497 = class255.method1672(117, "M");

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Lda;")
    public static class275 field3493 = field3497;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "Lda;")
    public static class275 field3508 = field3497;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Lma;")
    public static class105 field3488;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3513++;
        class234 var11 = this.method1339(true);
        if (var11 != null) {
            var11.method659(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3490 = var11.method664();
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
    public final void method1335(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3487++;
        this.method1336((byte) 94, ((arg2 - arg3 >> 1) + arg3) * 128 + 64, ((-arg1 + arg4 >> 1) + arg1) * arg0 + 64);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)V")
    private final void method1336(byte arg0, int arg1, int arg2) {
        if (this.field3489 != null) {
            int var4 = class35.field576 - this.field3483;
            if (var4 > 100 && this.field3489.field3664 > 0) {
                int var5 = this.field3489.field3688.length - this.field3489.field3664;
                while (var5 > this.field3484 && var4 > this.field3489.field3667[this.field3484]) {
                    var4 -= this.field3489.field3667[this.field3484];
                    this.field3484++;
                }
                if (this.field3484 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3489.field3688.length; var7++) {
                        var6 += this.field3489.field3667[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (this.field3489.field3667[this.field3484] >= var4) {
                            break label62;
                        }
                        class12.method54(-1797326908, false, arg2, arg1, this.field3484, this.field3489);
                        var4 -= this.field3489.field3667[this.field3484];
                        this.field3484++;
                    } while (this.field3489.field3688.length > this.field3484);
                    this.field3484 -= this.field3489.field3664;
                } while (this.field3484 >= 0 && this.field3484 < this.field3489.field3688.length);
                this.field3489 = null;
            }
            this.field3483 = class35.field576 - var4;
        }
        if (arg0 <= 7) {
            this.field3509 = 103;
        }
        field3496++;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()I")
    public final int method664() {
        field3507++;
        return this.field3490;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLbe;Lbe;)V")
    public static final void method1337(byte arg0, class116 arg1, class116 arg2) {
        if (arg2.field2060 != null) {
            arg2.method843(22610);
        }
        arg2.field2062 = arg1.field2062;
        field3512++;
        arg2.field2060 = arg1;
        arg2.field2060.field2062 = arg2;
        arg2.field2062.field2060 = arg2;
        int var3 = 54 % ((-arg0 - 9) / 49);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method1338(byte arg0) {
        field3495 = null;
        field3497 = null;
        field3505 = null;
        field3493 = null;
        field3494 = null;
        field3508 = null;
        field3488 = null;
        field3502 = null;
        if (arg0 > -77) {
            field3502 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Lak;")
    private final class234 method1339(boolean arg0) {
        field3504++;
        return arg0 ? this.method1340(-1180385114, false) : null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)Lak;")
    private final class234 method1340(int arg0, boolean arg1) {
        field3510++;
        boolean var3 = class92.field1575 != class273.field4725;
        class34 var4 = class146.method1040(126, this.field3499);
        if (var4.field528 != null) {
            var4 = var4.method203(arg0 ^ 0x465B3F05);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field3491 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field559;
            var7 = var4.field526;
        } else {
            var6 = var4.field526;
            var7 = var4.field559;
        }
        int var8 = this.field3482 + (var7 >> 1);
        int var9 = (var7 + 1 >> 1) + this.field3482;
        int var10 = (var6 >> 1) + this.field3486;
        int var11 = (var6 + 1 >> 1) + this.field3486;
        this.method1336((byte) 64, var8 * 128, var10 * 128);
        boolean var12 = !var3 && var4.field542 && (this.field3511 != var4.field508 || this.field3492 != this.field3484 && class240.field4219 >= 2);
        if (arg1 && !var12) {
            return null;
        }
        if (arg0 != -1180385114) {
            field3495 = null;
        }
        int[][] var13 = class92.field1575[this.field3509];
        int var14 = (this.field3482 << 7) + (var7 << 6);
        int var15 = var13[var8][var10] + var13[var9][var10] + var13[var8][var11] + var13[var9][var11] >> 2;
        int var16 = (this.field3486 << 7) + (var6 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class273.field4725[0];
        } else if (this.field3509 < 3) {
            var17 = class92.field1575[this.field3509 + 1];
        }
        boolean var18 = this.field3498 == null;
        class159 var19;
        if (this.field3489 == null) {
            var19 = var4.method193(var13, var17, var18 ? class219.field3706 : this.field3498, this.field3506, var15, var14, var16, false, this.field3491, var12, -50);
        } else {
            var19 = var4.method194(var14, this.field3484, var12, var18 ? class219.field3706 : this.field3498, arg0 + 1180385882, this.field3489, this.field3491, var17, var15, this.field3506, var16, var13);
        }
        return var19 == null ? null : var19.field2788;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIIIZLak;)V")
    public class207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class234 arg8) {
        this.field3491 = arg2;
        this.field3509 = arg3;
        this.field3486 = arg5;
        this.field3506 = arg1;
        this.field3482 = arg4;
        this.field3499 = arg0;
        if (arg6 != -1) {
            this.field3489 = class201.method1321(128, arg6);
            this.field3483 = class35.field576 - 1;
            this.field3484 = 0;
            if (this.field3489.field3671 == 0 && arg8 != null && arg8 instanceof class207) {
                class207 var10 = (class207) arg8;
                if (this.field3489 == var10.field3489) {
                    this.field3483 = var10.field3483;
                    this.field3484 = var10.field3484;
                    return;
                }
            }
            if (arg7 && this.field3489.field3664 != -1) {
                this.field3484 = (int) ((double) this.field3489.field3688.length * Math.random());
                this.field3483 -= (int) ((double) this.field3489.field3667[this.field3484] * Math.random());
                return;
            }
        }
    }
}
