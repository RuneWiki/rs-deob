import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class156 extends class176 {

    @OriginalMember(owner = "client!af", name = "Tb", descriptor = "Le;")
    public static class191 field2662 = class54.method368("<)4col>", 2047);

    @OriginalMember(owner = "client!af", name = "Rb", descriptor = "Le;")
    public static class191 field2660 = class54.method368("", 2047);

    @OriginalMember(owner = "client!af", name = "Xb", descriptor = "Lwd;")
    public static class97 field2666 = new class97(16);

    @OriginalMember(owner = "client!af", name = "ac", descriptor = "Le;")
    public static class191 field2669 = class54.method368(" x ", 2047);

    @OriginalMember(owner = "client!af", name = "Yb", descriptor = "Le;")
    private static class191 field2667 = class54.method368("Prepared sound engine", 2047);

    @OriginalMember(owner = "client!af", name = "bc", descriptor = "Le;")
    public static class191 field2670 = class54.method368("Bitte entfernen Sie ", 2047);

    @OriginalMember(owner = "client!af", name = "Zb", descriptor = "I")
    public static int field2668 = 0;

    @OriginalMember(owner = "client!af", name = "cc", descriptor = "Le;")
    public static class191 field2671 = field2667;

    @OriginalMember(owner = "client!af", name = "Ob", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!af", name = "Pb", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!af", name = "Qb", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!af", name = "Sb", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!af", name = "Wb", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!af", name = "Vb", descriptor = "Lng;")
    public static class121 field2664;

    @OriginalMember(owner = "client!af", name = "Ub", descriptor = "Ldk;")
    public class184 field2663;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)Z")
    public final boolean method489(int arg0) {
        if (arg0 != 50) {
            field2666 = null;
        }
        ++field2659;
        return this.field2663 != null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()I")
    public final int method126() {
        ++field2665;
        return super.field2968;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2657;
        if (this.field2663 != null) {
            class248 var11 = ~super.field3019 != 0 && super.field3016 == 0 ? class67.method445((byte) -61, super.field3019) : null;
            class248 var12 = super.field2977 == -1 || super.field2977 == super.field2974 && var11 != null ? null : class67.method445((byte) -61, super.field2977);
            class251 var13 = this.field2663.method1237(var11, var12, super.field2958, super.field2976, 80);
            if (var13 != null) {
                super.field2968 = var13.method126();
                class184 var14 = this.field2663;
                if (var14.field3225 != null) {
                    var14 = var14.method1245((byte) -123);
                }
                if (class252.field4472 && var14.field3191) {
                    class251 var15 = class111.method713(this.field2663.field3184, var13, super.field2972, super.field2978, (byte) -71, arg0, this.field2663.field3208, this.field2663.field3196, this.field2663.field3219, super.field2949, var12 == null ? super.field2958 : super.field2976, super.field3003, this.field2663.field3183, var12 == null ? var11 : var12);
                    var15.method127(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                }
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                if (this.field2663.field3165 != 0 || ~this.field2663.field3193 != -1) {
                    int var19 = class15.field206[arg0];
                    short var20 = this.field2663.field3165;
                    short var21 = this.field2663.field3193;
                    int var22 = -var20 / 2;
                    int var23 = -var21 / 2;
                    int var24 = class15.field204[arg0];
                    int var25 = var19 * var23 + -(var22 * var24) >> 16;
                    int var26 = var20 / 2;
                    int var27 = var19 * var22 + var23 * var24 >> 16;
                    int var28 = -var21 / 2;
                    int var29 = class222.method1546(class261.field4598, super.field3003 - -var27, super.field2972 - -var25, 247425607);
                    int var30 = var19 * var26 + var24 * var28 >> 16;
                    int var31 = var19 * var28 - var24 * var26 >> 16;
                    int var32 = class222.method1546(class261.field4598, super.field3003 + var30, super.field2972 + var31, 247425607);
                    int var33 = -var20 / 2;
                    int var34 = var20 / 2;
                    int var35 = var21 / 2;
                    int var36 = var19 * var34 + var24 * var35 >> 16;
                    int var37 = var21 / 2;
                    int var38 = var19 * var37 - var24 * var33 >> 16;
                    int var39 = var19 * var35 + -(var24 * var34) >> 16;
                    int var40 = var24 * var37 - -(var19 * var33) >> 16;
                    int var41 = class222.method1546(class261.field4598, super.field3003 - -var40, super.field2972 + var38, 247425607);
                    int var42 = class222.method1546(class261.field4598, super.field3003 + var36, super.field2972 + var39, 247425607);
                    int var43 = ~var32 >= ~var29 ? var32 : var29;
                    int var44 = var42 > var41 ? var41 : var42;
                    int var45 = ~var29 <= ~var41 ? var41 : var29;
                    int var46 = var42 <= var32 ? var42 : var32;
                    int var47 = var29 + var42;
                    if (~var21 != -1) {
                        var16 = 2047 & (int) (Math.atan2((double) (-var44 + var43), (double) var21) * 325.95D);
                        if (~var16 != -1) {
                            var13.method974(var16);
                        }
                    }
                    if (~var20 != -1) {
                        var17 = 2047 & (int) (Math.atan2((double) (-var46 + var45), (double) var20) * 325.95D);
                        if (~var17 != -1) {
                            var13.method948(var17);
                        }
                    }
                    if (var32 - -var41 < var47) {
                        var47 = var32 + var41;
                    }
                    var18 = (var47 >> 1) + -super.field2949;
                    if (~var18 != -1) {
                        var13.method964(0, var18, 0);
                    }
                }
                class251 var48 = null;
                if (~super.field3009 != 0 && ~super.field2959 != 0) {
                    class14 var49 = class47.method323(-4453, super.field3009);
                    var48 = var49.method96(true, super.field2959);
                    if (var48 != null) {
                        var48.method964(0, -super.field2956, 0);
                        if (var49.field185) {
                            if (var16 != 0) {
                                var48.method974(var16);
                            }
                            if (var17 != 0) {
                                var48.method948(var17);
                            }
                            if (~var18 != -1) {
                                var48.method964(0, var18, 0);
                            }
                        }
                    }
                }
                if (var48 != null) {
                    var13 = ((class144) var13).method960(var48);
                }
                if (this.field2663.field3208 == 1) {
                    var13.field4458 = true;
                }
                var13.method127(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public static void method1068(boolean arg0) {
        field2671 = null;
        if (!arg0) {
            field2664 = null;
            field2666 = null;
            field2660 = null;
            field2670 = null;
            field2667 = null;
            field2669 = null;
            field2662 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IS)Z")
    public static final boolean method1069(int arg0, short arg1) {
        ++field2661;
        int var2 = -124 / ((arg0 - -72) / 49);
        if (arg1 != 19 && arg1 != 21 && ~arg1 != -45 && ~arg1 != -29 && arg1 != 22 && ~arg1 != -12 && ~arg1 != -49 && ~arg1 != -9) {
            if (arg1 != 18 && arg1 != 58 && ~arg1 != -1002 && arg1 != 1007) {
                if (~arg1 != -58 && ~arg1 != -40 && ~arg1 != -7 && arg1 != 16 && ~arg1 != -11) {
                    return arg1 == 50 || arg1 == 35 || ~arg1 == -34 || arg1 == 40 || arg1 == 49 || arg1 == 32;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
