import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class250 extends class30 {

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    private int field3410 = 2048;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    private int field3413 = 0;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    private int field3418 = 10;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "[I")
    public static int[] field3409 = new int[32];

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "Lem;")
    public static class206 field3407 = new class206(5, 12);

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "Lq;")
    public static class392 field3403;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "[I")
    private int[] field3411;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "[I")
    private int[] field3415;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public final void method29(byte arg0) {
        this.method1541(1002030081);
        if (arg0 >= -10) {
            this.field3413 = -74;
        }
        ++field3412;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([BIIIIII)Z")
    public static final boolean method1538(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3406;
        int var7 = arg3 % arg5;
        int var8;
        if (var7 != 0) {
            var8 = -var7 + arg5;
        } else {
            var8 = 0;
        }
        int var9 = -((arg4 - -arg5 + -1) / arg5);
        int var10 = -((arg3 - -arg5 + -1) / arg5);
        if (arg1 != -456) {
            method1539(71);
        }
        for (int var11 = var9; var11 < 0; ++var11) {
            for (int var12 = var10; ~var12 > -1; ++var12) {
                if (~arg0[arg6] == -1) {
                    return true;
                }
                arg6 += arg5;
            }
            int var13 = arg6 - var8;
            if (~arg0[var13 + -1] == -1) {
                return true;
            }
            arg6 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
    public static void method1539(int arg0) {
        field3403 = null;
        if (arg0 != -1) {
            method1539(-23);
        }
        field3409 = null;
        field3407 = null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)Lsr;")
    public static final class228 method1540(int arg0, int arg1) {
        ++field3414;
        if (class184.field2656 && ~class301.field4171 >= ~arg1 && class244.field3325 >= arg1) {
            return arg0 != 24510 ? null : class43.field526[arg1 - class301.field4171];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 < 100) {
            field3407 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field3413 = arg2.method2874((byte) -75);
                }
            } else {
                this.field3410 = arg2.method2845(-1);
            }
        } else {
            this.field3418 = arg2.method2874((byte) -75);
        }
        ++field3408;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field3402;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (arg0 != 1) {
            this.field3410 = -107;
        }
        if (super.field374.field9032) {
            int var4 = class430.field6016[arg1];
            if (this.field3413 != 0) {
                for (int var5 = 0; class31.field399 > var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class48.field568[var5];
                    int var9 = this.field3413;
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = 2048 - -(var4 - 4096 + var8 >> 1);
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field3418 > var10; ++var10) {
                        if (var6 >= this.field3411[var10] && ~var6 > ~this.field3411[var10 - -1]) {
                            if (this.field3415[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field3418; ++var12) {
                    if (~var4 <= ~this.field3411[var12] && ~this.field3411[var12 + 1] < ~var4) {
                        if (~this.field3415[var12] < ~var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class359.method2051(var3, 0, class31.field399, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
    private final void method1541(int arg0) {
        ++field3419;
        int var2 = 0;
        this.field3415 = new int[this.field3418 + 1];
        this.field3411 = new int[this.field3418 - -1];
        int var3 = 4096 / this.field3418;
        int var4 = this.field3410 * var3 >> 12;
        if (arg0 == 1002030081) {
            for (int var5 = 0; var5 < this.field3418; ++var5) {
                this.field3411[var5] = var2;
                this.field3415[var5] = var2 + var4;
                var2 += var3;
            }
            this.field3411[this.field3418] = 4096;
            this.field3415[this.field3418] = this.field3415[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class250() {
        super(0, true);
    }
}
