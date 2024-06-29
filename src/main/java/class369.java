import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class369 extends class506 implements class248 {

    @OriginalMember(owner = "client!e", name = "H", descriptor = "Lik;")
    public class138 field5584;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "Z")
    private boolean field5597;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field5586 = 0;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "Liv;")
    public static class64 field5588 = new class64(96, 1);

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field5594 = 0;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field5593 = -1;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field5596 = 0;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)I")
    public final int method19(byte arg0) {
        ++field5595;
        return arg0 != -69 ? -45 : this.field5584.field2192;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field5578;
        int var2 = -81 / ((-60 - arg0) / 40);
        return this.field5584.field2215;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLqa;)Lae;")
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field5576;
        class121 var3 = this.field5584.method1033(-4, 2048, true, arg1, super.field7474, arg0, super.field7470);
        if (var3 == null) {
            return null;
        } else {
            class414 var4 = arg1.method240();
            var4.method868(super.field7473 + super.field7470, super.field7472, super.field7474 + super.field7469);
            class163 var5 = null;
            if (this.field5597) {
                var5 = class483.method2876(1, 0);
            }
            if (this.field5584.field2200 == null) {
                var3.method927(var4, var5 == null ? null : var5.field2516[0], 0);
            } else {
                class49 var6 = this.field5584.field2200.method724();
                arg1.method249(var3, var6, var4, var5 != null ? var5.field2516[0] : null, 0);
            }
            int var7 = super.field7470 >> 7;
            int var8 = super.field7474 >> 7;
            this.field5584.method1030(var8, (byte) 86, arg1, var7, var7, true, var3, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILqa;)V")
    public final void method15(int arg0, class162 arg1) {
        ++field5585;
        this.field5584.method1032(arg1, (byte) 9);
        if (arg0 != -13300) {
            field5586 = -112;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)I")
    public final int method12(int arg0) {
        ++field5582;
        if (arg0 != 3765) {
            field5594 = 113;
        }
        return this.field5584.field2203;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lqa;II)Lc;")
    public final class121 method23(class162 arg0, int arg1, int arg2) {
        if (arg1 != 17793) {
            this.method381(-108);
        }
        ++field5577;
        return this.field5584.method1033(-4, arg2, false, arg0, 0, false, 0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
    public static final void method2312(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1226839239) {
            ++field5574;
            if (class380.field5761 != null) {
                long var4 = (long) (arg2 | arg1 << 28 | arg0 << 14);
                class294 var6 = (class294) class433.field6430.method171((byte) -126, var4);
                if (var6 == null) {
                    class514.method3068(arg1, arg2, arg0);
                } else {
                    class223 var7 = (class223) var6.field4192.method2427(115);
                    if (var7 == null) {
                        class514.method3068(arg1, arg2, arg0);
                    } else {
                        class362 var8 = (class362) class514.method3068(arg1, arg2, arg0);
                        if (var8 != null) {
                            var8.field5482 = var8.field5481 = -1;
                        } else {
                            var8 = new class362();
                        }
                        var8.field5494 = var7.field3192;
                        var8.field5495 = var7.field3191;
                        label48: while (true) {
                            class223 var9 = (class223) var6.field4192.method2422(-110);
                            if (var9 == null) {
                                break;
                            }
                            if (~var8.field5495 != ~var9.field3191) {
                                var8.field5482 = var9.field3191;
                                var8.field5487 = var9.field3192;
                                while (true) {
                                    class223 var10 = (class223) var6.field4192.method2422(-123);
                                    if (var10 == null) {
                                        break label48;
                                    }
                                    if (var8.field5495 != var10.field3191 && ~var8.field5482 != ~var10.field3191) {
                                        var8.field5492 = var10.field3192;
                                        var8.field5481 = var10.field3191;
                                    }
                                }
                            }
                        }
                        int var11 = class343.method2188(arg1, (arg2 << 7) - -64, (byte) -102, (arg0 << 7) - -64);
                        class33.method356(arg1, arg2, arg0, var11, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(B)V")
    public static final void method2313(byte arg0) {
        ++field5589;
        if (arg0 <= 24) {
            method2312(-98, -121, 110, -5);
        }
        class363.field5500 = 0;
        class339.field5122.method2419((byte) 118);
        class339.field5122.method2417(45, class448.field6722);
        ++class363.field5500;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lqa;Lgm;IIIIIZIIIIII)V")
    public class369(class162 arg0, class79 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class397.method2453(arg11, -2, arg12));
        this.field5584 = new class138(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field5597 = arg1.field1357 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        ++field5573;
        return arg0 < 94 ? true : this.field5584.method1034(15361);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLqa;)V")
    public final void method25(byte arg0, class162 arg1) {
        ++field5583;
        class121 var3 = this.field5584.method1033(-4, 262144, true, arg1, super.field7474, false, super.field7470);
        if (var3 != null) {
            int var4 = super.field7470 >> 7;
            int var5 = super.field7474 >> 7;
            this.field5584.method1030(var5, (byte) 111, arg1, var4, var4, false, var3, var5);
        }
        int var6 = -8 / ((-45 - arg0) / 48);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) {
        ++field5587;
        int var2 = 91 % ((-46 - arg0) / 44);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILqa;II)Z")
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        ++field5590;
        class121 var5 = this.field5584.method1033(arg0 ^ -131076, arg0, false, arg1, super.field7474, false, super.field7470);
        if (var5 == null) {
            return false;
        } else {
            class414 var6 = arg1.method240();
            var6.method868(super.field7473 + super.field7470, super.field7472, super.field7474 - -super.field7469);
            return var5.method924(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lqa;I)V")
    public final void method9(class162 arg0, int arg1) {
        this.field5584.method1028(arg0, (byte) -18);
        ++field5581;
        if (arg1 > -111) {
            this.method19((byte) -115);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)V")
    public static void method2314(boolean arg0) {
        field5588 = null;
        if (arg0) {
            field5594 = 69;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)I")
    public final int method381(int arg0) {
        ++field5580;
        int var2 = 66 % ((-32 - arg0) / 55);
        return this.field5584.method1037((byte) 10);
    }
}
