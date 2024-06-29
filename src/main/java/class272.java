import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class272 extends class548 {

    @OriginalMember(owner = "client!sda", name = "o", descriptor = "F")
    public static float field3957;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!sda", name = "p", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!sda", name = "s", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!sda", name = "t", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!sda", name = "u", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!sda", name = "v", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!sda", name = "w", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "Luq;")
    public static class172 field3959;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)I", line = 3)
    public static final int method1803(int arg0) {
        ++field3958;
        if (arg0 != 33) {
            field3959 = null;
        }
        if (class528.field7306 == null) {
            if (!class677.field9075 && class191.field2474 != null) {
                return class191.field2474.field6711;
            }
            int var1 = class494.field6961.method1652(arg0 ^ 33);
            int var2 = class494.field6961.method1663((byte) 115);
            if (class30.field301) {
                if (class92.field1298 < var1 && class92.field1298 + class677.field9082 > var1) {
                    int var3 = -1;
                    for (int var4 = 0; ~var4 > ~class382.field5558; ++var4) {
                        if (class348.field5048) {
                            int var8 = var4 * 16 + class632.field8551 + 33;
                            if (var8 - 13 < var2 && ~var2 >= ~(var8 + 3)) {
                                var3 = var4;
                            }
                        } else {
                            int var9 = var4 * 16 + class632.field8551 + 31;
                            if (~(var9 + -13) > ~var2 && ~var2 >= ~(var9 + 3)) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class542 var6 = new class542(class716.field9763);
                        for (class641 var7 = (class641) var6.method3133((byte) -71); var7 != null; var7 = (class641) var6.method3134((byte) 54)) {
                            if (var5++ == var3) {
                                return ((class478) var7.field8636.field259.field8885).field6711;
                            }
                        }
                    }
                } else if (class740.field10028 != null && ~class271.field3950 > ~var1 && ~var1 > ~(class588.field8032 + class271.field3950)) {
                    int var10 = -1;
                    for (int var11 = 0; class740.field10028.field8639 > var11; ++var11) {
                        if (!class348.field5048) {
                            int var15 = var11 * 16 + class696.field9241 - -31;
                            if (var2 > var15 + -13 && ~(var15 + 3) <= ~var2) {
                                var10 = var11;
                            }
                        } else {
                            int var16 = class696.field9241 - -(var11 * 16) + 33;
                            if (~(var16 - 13) > ~var2 && var16 + 3 >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (~var10 != 0) {
                        int var12 = 0;
                        class542 var13 = new class542(class740.field10028.field8636);
                        for (class478 var14 = (class478) var13.method3133((byte) -124); var14 != null; var14 = (class478) var13.method3134((byte) 54)) {
                            if (var10 == var12++) {
                                return var14.field6711;
                            }
                        }
                    }
                }
            } else if (~var1 < ~class92.field1298 && ~(class92.field1298 + class677.field9082) < ~var1) {
                int var17 = -1;
                for (int var18 = 0; ~class269.field3929 < ~var18; ++var18) {
                    if (!class348.field5048) {
                        int var22 = class632.field8551 - -((class269.field3929 - var18 + -1) * 16) + 31;
                        if (var2 > var22 + -13 && var22 + 3 >= var2) {
                            var17 = var18;
                        }
                    } else {
                        int var23 = 33 - -((-var18 + -1 + class269.field3929) * 16) + class632.field8551;
                        if (var23 + -13 < var2 && ~(var23 - -3) <= ~var2) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class305 var20 = new class305(class645.field8695);
                    for (class478 var21 = (class478) var20.method1976(false); var21 != null; var21 = (class478) var20.method1977(-52)) {
                        if (~var17 == ~(var19++)) {
                            return var21.field6711;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)Z", line = 199)
    public final boolean method756(boolean arg0) {
        ++field3965;
        return arg0;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZZ)V", line = 210)
    public final void method754(boolean arg0, boolean arg1) {
        ++field3961;
        super.field7571.method1616(875882616, true);
        if (arg1) {
            field3959 = null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZI)V", line = 222)
    public final void method758(boolean arg0, int arg1) {
        if (arg1 != 0) {
            method1805(-28, -84, 37, (class629) null);
        }
        ++field3962;
    }

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)V", line = 232)
    public static void method1804(int arg0) {
        if (arg0 != 19131) {
            method1806(53, (class347) null, 45, 79, (class66) null);
        }
        field3959 = null;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIILcf;)V", line = 243)
    public static final void method1805(int arg0, int arg1, int arg2, class629 arg3) {
        class194 var4 = class782.method4289(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field2519 = arg3;
            int var5 = class737.field10008 == class645.field8694 ? 1 : 0;
            if (arg3.method769(-88)) {
                if (arg3.method777(105)) {
                    arg3.field2808 = class151.field2056[var5];
                    class151.field2056[var5] = arg3;
                    return;
                }
                arg3.field2808 = class737.field10005[var5];
                class737.field10005[var5] = arg3;
                class132.field1818 = true;
                return;
            }
            arg3.field2808 = class570.field7774[var5];
            class570.field7774[var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILofa;IILha;)V", line = 274)
    public static final void method1806(int arg0, class347 arg1, int arg2, int arg3, class66 arg4) {
        ++field3955;
        byte var5 = 63;
        byte var6 = 7;
        int var7 = -22 / ((72 - arg0) / 41);
        for (int var8 = 63; var8 >= 0; --var8) {
            int var9 = 896 & var6 << 7 | (63 & var8) << 10 | 127 & var5;
            class96.method761(true, true, false);
            int var10 = class217.field2836[var9];
            class186.method1251(false, true, (byte) -75);
            arg4.method434(arg3, ((-var8 + 63) * arg1.field4940 >> 6) + arg2, arg1.field4986, (arg1.field4940 >> 6) - -1, var10, 0);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lru;II)V", line = 303)
    public final void method760(class205 arg0, int arg1, int arg2) {
        ++field3956;
        super.field7571.method1595((byte) 96, arg0);
        super.field7571.method1601(25456, arg2);
        if (arg1 != -1) {
            this.method758(false, -24);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V", line = 318)
    public final void method759(int arg0) {
        super.field7571.method1616(875882616, false);
        ++field3964;
        if (arg0 != 3) {
            this.method760((class205) null, -85, 61);
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Llf;)V", line = 329)
    public class272(class250 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)V", line = 334)
    public final void method753(int arg0, int arg1, int arg2) {
        ++field3960;
        if (arg2 != 14106) {
            this.method753(-125, 30, 78);
        }
    }
}
