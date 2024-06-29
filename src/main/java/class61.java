import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class61 extends class277 {

    @OriginalMember(owner = "client!oc", name = "Mb", descriptor = "Lp;")
    public static class280 field985 = class18.method140((byte) -127, "");

    @OriginalMember(owner = "client!oc", name = "Pb", descriptor = "Lp;")
    public static class280 field988 = class18.method140((byte) -118, "clignotant2:");

    @OriginalMember(owner = "client!oc", name = "Fb", descriptor = "Lp;")
    public static class280 field978 = class18.method140((byte) -128, "vert:");

    @OriginalMember(owner = "client!oc", name = "Yb", descriptor = "I")
    public static int field997 = 0;

    @OriginalMember(owner = "client!oc", name = "Sb", descriptor = "Lp;")
    private static class280 field991 = class18.method140((byte) -123, "wave2:");

    @OriginalMember(owner = "client!oc", name = "Ub", descriptor = "Lp;")
    public static class280 field993 = field991;

    @OriginalMember(owner = "client!oc", name = "Qb", descriptor = "Lp;")
    public static class280 field989 = field991;

    @OriginalMember(owner = "client!oc", name = "Ib", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field981 = new CRC32();

    @OriginalMember(owner = "client!oc", name = "Gb", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!oc", name = "Hb", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!oc", name = "Jb", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!oc", name = "Kb", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!oc", name = "Lb", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!oc", name = "Nb", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!oc", name = "Rb", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!oc", name = "Tb", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!oc", name = "Vb", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!oc", name = "Xb", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!oc", name = "Zb", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!oc", name = "Ob", descriptor = "Lmi;")
    public class255 field987;

    @OriginalMember(owner = "client!oc", name = "Wb", descriptor = "[I")
    public static int[] field995;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()I")
    public final int method426() {
        ++field986;
        return super.field4810;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIIJILla;)V")
    public final void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class95 arg10) {
        ++field984;
        if (this.field987 != null) {
            class78 var13 = ~super.field4853 != 0 && super.field4821 == 0 ? class207.method1401((byte) -22, super.field4853) : null;
            class78 var14 = super.field4803 == -1 || super.field4834 == super.field4803 && var13 != null ? null : class207.method1401((byte) -22, super.field4803);
            class256 var15 = this.field987.method1725(-1, super.field4830, super.field4825, var13, var14);
            if (var15 != null) {
                super.field4810 = var15.method426();
                class255 var16 = this.field987;
                if (var16.field4516 != null) {
                    var16 = var16.method1717(false);
                }
                if (class215.field3720 && var16.field4514) {
                    class256 var17 = class6.method72(this.field987.field4489, this.field987.field4473, super.field4836, this.field987.field4451, var14 == null ? super.field4830 : super.field4825, this.field987.field4484, arg0, super.field4793, var14 != null ? var14 : var13, var15, true, this.field987.field4478, super.field4791, super.field4841);
                    var17.method427(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field4802);
                }
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                if (~this.field987.field4454 != -1 || this.field987.field4459 != 0) {
                    int var21 = class146.field2545[arg0];
                    int var22 = class146.field2541[arg0];
                    short var23 = this.field987.field4459;
                    short var24 = this.field987.field4454;
                    int var25 = -var23 / 2;
                    int var26 = -var24 / 2;
                    int var27 = var21 * var25 + var22 * var26 >> 16;
                    int var28 = var22 * var25 + -(var21 * var26) >> 16;
                    int var29 = class158.method1123(class231.field4013, super.field4791 + var27, -6230, super.field4793 + var28);
                    int var30 = var24 / 2;
                    int var31 = -var23 / 2;
                    int var32 = var21 * var31 + var22 * var30 >> 16;
                    int var33 = var22 * var31 + -(var21 * var30) >> 16;
                    int var34 = var23 / 2;
                    int var35 = -var24 / 2;
                    int var36 = class158.method1123(class231.field4013, super.field4791 + var32, -6230, super.field4793 - -var33);
                    int var37 = var21 * var34 + var22 * var35 >> 16;
                    int var38 = var22 * var34 + -(var21 * var35) >> 16;
                    int var39 = class158.method1123(class231.field4013, super.field4791 + var37, -6230, super.field4793 + var38);
                    int var40 = var24 / 2;
                    int var41 = var23 / 2;
                    int var42 = var22 * var41 - var21 * var40 >> 16;
                    int var43 = var21 * var41 + var22 * var40 >> 16;
                    int var44 = class158.method1123(class231.field4013, super.field4791 + var43, -6230, super.field4793 + var42);
                    int var45 = var29 - -var44;
                    if (~var45 < ~(var36 + var39)) {
                        var45 = var36 - -var39;
                    }
                    int var46 = var29 >= var36 ? var36 : var29;
                    int var47 = var44 > var36 ? var36 : var44;
                    int var48 = var39 >= var44 ? var44 : var39;
                    if (var23 != 0) {
                        var18 = (int) (Math.atan2((double) (-var48 + var46), (double) var23) * 325.95D) & 2047;
                        if (var18 != 0) {
                            var15.method1602(var18);
                        }
                    }
                    int var49 = var29 < var39 ? var29 : var39;
                    if (~var24 != -1) {
                        var19 = (int) (325.95D * Math.atan2((double) (-var47 + var49), (double) var24)) & 2047;
                        if (~var19 != -1) {
                            var15.method1604(var19);
                        }
                    }
                    var20 = (var45 >> 1) + -super.field4841;
                    if (var20 != 0) {
                        var15.method1600(0, var20, 0);
                    }
                }
                class256 var50 = null;
                if (super.field4827 != -1 && ~super.field4857 != 0) {
                    class241 var51 = class199.method1368(-940, super.field4827);
                    var50 = var51.method1637(super.field4857, -50);
                    if (var50 != null) {
                        var50.method1600(0, -super.field4823, 0);
                        if (var51.field4224) {
                            if (~var18 != -1) {
                                var50.method1602(var18);
                            }
                            if (~var19 != -1) {
                                var50.method1604(var19);
                            }
                            if (var20 != 0) {
                                var50.method1600(0, var20, 0);
                            }
                        }
                    }
                }
                if (var50 != null) {
                    var15 = ((class239) var15).method1625(var50);
                }
                if (~this.field987.field4489 == -2) {
                    var15.field4529 = true;
                }
                var15.method427(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field4802);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)Z")
    public final boolean method428(int arg0) {
        ++field982;
        if (this.field987 == null) {
            return false;
        } else {
            if (arg0 != 700) {
                field995 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V")
    public final void method429(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field994;
        if (this.field987 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(Z)V")
    public static void method430(boolean arg0) {
        field993 = null;
        field991 = null;
        field981 = null;
        field985 = null;
        if (!arg0) {
            field978 = null;
            field995 = null;
            field989 = null;
            field988 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)V")
    public static final void method431(int arg0, int arg1) {
        class8.field167.method1478(arg0, arg1 + 1743);
        class120.field2137.method1478(arg0, 73);
        if (arg1 != -1641) {
            field991 = null;
        }
        ++field992;
    }

    @OriginalMember(owner = "client!oc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field990;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lmi;I)V")
    public final void method432(class255 arg0, int arg1) {
        if (arg1 == 1) {
            this.field987 = arg0;
            ++field979;
            if (super.field4802 != null) {
                super.field4802.method671();
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lrf;I)V")
    public static final void method433(class277 arg0, int arg1) {
        ++field996;
        int var2 = arg0.field4826 - class117.field2104;
        int var3 = arg0.field4856 * 128 - -(64 * arg0.method984((byte) -34));
        int var4 = arg0.field4838 * 128 + arg0.method984((byte) -34) * 64;
        if (~arg0.field4806 == arg1) {
            arg0.field4863 = 1024;
        }
        arg0.field4793 += (-arg0.field4793 + var4) / var2;
        arg0.field4791 += (-arg0.field4791 + var3) / var2;
        arg0.field4833 = 0;
        if (arg0.field4806 == 1) {
            arg0.field4863 = 1536;
        }
        if (arg0.field4806 == 2) {
            arg0.field4863 = 0;
        }
        if (~arg0.field4806 == -4) {
            arg0.field4863 = 512;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZII)I")
    public static final int method434(boolean arg0, int arg1, int arg2) {
        ++field998;
        if (arg0) {
            field995 = null;
        }
        int var3 = 1;
        while (~arg1 < -2) {
            if (~(1 & arg1) != -1) {
                var3 = arg2 * var3;
            }
            arg1 >>= 1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILtg;)V")
    public static final void method435(int arg0, class180 arg1) {
        class16.field298 = arg1;
        ++field980;
        if (arg0 != 0) {
            field988 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILtg;Ltg;)V")
    public static final void method436(int arg0, class180 arg1, class180 arg2) {
        ++field983;
        class181.field3161 = class24.method179(arg2, arg1, arg0 + 83, class259.field4586, 0);
        class264.field4665 = (class281) class181.field3161;
        class101.field1651 = class24.method179(arg2, arg1, arg0 ^ 111, class51.field837, arg0);
        class54.field890 = class24.method179(arg2, arg1, 82, class106.field1762, 0);
    }
}
