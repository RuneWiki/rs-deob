import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class729 extends class168 {

    @OriginalMember(owner = "client!aca", name = "s", descriptor = "Z")
    public boolean field10146 = true;

    @OriginalMember(owner = "client!aca", name = "v", descriptor = "Z")
    public boolean field10149 = false;

    @OriginalMember(owner = "client!aca", name = "r", descriptor = "Lkg;")
    public static class275 field10145 = new class275(76, 6);

    @OriginalMember(owner = "client!aca", name = "w", descriptor = "I")
    public static int field10150 = 4;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    public int field10137;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "I")
    public int field10138;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
    public int field10139;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
    public int field10140;

    @OriginalMember(owner = "client!aca", name = "n", descriptor = "I")
    public int field10141;

    @OriginalMember(owner = "client!aca", name = "o", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!aca", name = "p", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
    public int field10144;

    @OriginalMember(owner = "client!aca", name = "t", descriptor = "I")
    public int field10147;

    @OriginalMember(owner = "client!aca", name = "u", descriptor = "I")
    public int field10148;

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "I")
    public int field10153;

    @OriginalMember(owner = "client!aca", name = "A", descriptor = "I")
    public int field10154;

    @OriginalMember(owner = "client!aca", name = "x", descriptor = "Lhga;")
    public static class176 field10151;

    @OriginalMember(owner = "client!aca", name = "y", descriptor = "Ltd;")
    public class456 field10152;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
    public static void method4068(boolean arg0) {
        if (arg0) {
            field10145 = null;
            field10151 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZIIIIZ)V")
    public static final void method4069(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field10142++;
        if (class197.field2689 == null) {
            class386.field4930.method544(-16777216, arg2, arg3, 18553, arg4, arg1);
        } else if (class380.field4847.field5801 >= 0 && (class409.field5183 * 512) > class380.field4847.field5801 && class380.field4847.field5797 >= 0 && class380.field4847.field5797 < class543.field7597 * 512) {
            class762.field10618++;
            if (class380.field4847 != null && class380.field4847.field5801 - (class380.field4847.method82((byte) 49) - 1) * 256 >> 9 == class755.field10539 && class380.field4847.field5797 + 256 - (class380.field4847.method82((byte) 49) * 256) >> 9 == class366.field4727) {
                class366.field4727 = -1;
                class755.field10539 = -1;
                class169.method1180((byte) -15);
            }
            class66.method616(true);
            if (!arg0) {
                class217.method1415(false);
            }
            class370.method2127((byte) 127);
            class526.method3042((byte) -111, arg4, arg2, arg3, arg1, true);
            int var6 = class321.field4144;
            class286.field3600 = class286.field3598;
            int var7 = class162.field2229;
            int var8 = class111.field1608;
            int var9 = class173.field2386;
            if (class650.field9023 == 1) {
                int var12 = (int) class101.field1404;
                if (var12 < class538.field7468 >> 8) {
                    var12 = class538.field7468 >> 8;
                }
                if (class193.field2644[4] && class332.field4237[4] + 128 > var12) {
                    var12 = class332.field4237[4] + 128;
                }
                int var13 = (int) class521.field7309 + class216.field2926 & 0x3FFF;
                class348.method2044((var12 >> 3) * 3 + 600 << 2, class225.method1448(class472.field6329, class380.field4847.field5801, class380.field4847.field5797, (byte) 28) - 200, var6, var12, class758.field10586, var13, 122, class347.field4454);
            } else if (class650.field9023 == 4) {
                int var10 = (int) class101.field1404;
                if (var10 < class538.field7468 >> 8) {
                    var10 = class538.field7468 >> 8;
                }
                if (class193.field2644[4] && class332.field4237[4] + 128 > var10) {
                    var10 = class332.field4237[4] + 128;
                }
                int var11 = (int) class521.field7309 & 0x3FFF;
                class348.method2044((var10 >> 3) * 3 + 600 << 2, class225.method1448(class472.field6329, class289.field3789, class116.field1724, (byte) 28) - 200, var6, var10, class758.field10586, var11, 119, class347.field4454);
            } else if (class650.field9023 == 5) {
                class590.method3349(-2017809272, var6);
            }
            int var14 = class450.field5953;
            int var15 = class66.field954;
            int var16 = class318.field4121;
            int var17 = class33.field544;
            int var18 = class206.field2731;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class193.field2644[var19]) {
                    int var22 = (int) (Math.random() * (double) (class70.field978[var19] * 2 + 1) + Math.sin((double) class356.field4587[var19] / 100.0D * (double) class227.field3011[var19]) * (double) class332.field4237[var19] - (double) class70.field978[var19]);
                    if (var19 == 1) {
                        class66.field954 += var22 << 2;
                    }
                    if (var19 == 0) {
                        class450.field5953 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class318.field4121 += var22 << 2;
                    }
                    if (var19 == 4) {
                        class33.field544 += var22;
                        if (class33.field544 < 1024) {
                            class33.field544 = 1024;
                        } else if (class33.field544 > 3072) {
                            class33.field544 = 3072;
                        }
                    }
                    if (var19 == 3) {
                        class206.field2731 = class206.field2731 + var22 & 0x3FFF;
                    }
                }
            }
            if (class450.field5953 < 0) {
                class450.field5953 = 0;
            }
            if (class318.field4121 < 0) {
                class318.field4121 = 0;
            }
            if (class450.field5953 > (class289.field3784 << 9) - 1) {
                class450.field5953 = (class289.field3784 << 9) - 1;
            }
            if (((class463.field6223 << 9) - 1) < class318.field4121) {
                class318.field4121 = (class463.field6223 << 9) - 1;
            }
            class732.method4086((byte) -126);
            class562.method3243(71);
            class386.field4930.method534(var7, var8, var7 + var9, var6 + var8);
            class297.method1781(true, -127);
            if (class676.field9448) {
                class707.method3956(true, class637.field8786);
                if (class286.field3600 != class140.field1995) {
                    class563.field7924 = true;
                }
                class140.field1995 = class286.field3600;
            } else {
                class386.field4930.method512();
                int var20 = class637.field8786;
                if (class1.field4 == null) {
                    class386.field4930.method462(var20);
                } else {
                    class1.field4.method2337(var20, var9, var7, class206.field2731, class344.field4355 << 3, var6, 1093, class386.field4930, class33.field544, var8);
                }
            }
            class14.method102(true);
            class651.field9066.method592(class450.field5953, class66.field954, class318.field4121, -class33.field544 & 0x3FFF, -class206.field2731 & 0x3FFF, -class115.field1704 & 0x3FFF);
            class386.field4930.method505(class651.field9066);
            class386.field4930.method437(var7 + (var9 / 2), var8 - -(var6 / 2), class555.field7731 << 1, class555.field7731 << 1);
            class242.method1512(class555.field7731 << 1, class555.field7731 << 1, var6 / 2 + var8, var9 / 2 + var7, -2);
            class588.method3340(class66.field954, class318.field4121, -class115.field1704 & 0x3FFF, -class33.field544 & 0x3FFF, -21876, -class206.field2731 & 0x3FFF, class450.field5953);
            byte var21 = class748.field10451.field10393.method1631((byte) 120) == 2 ? (byte) class762.field10618 : 1;
            if (class676.field9448) {
                class732.method4087(-class206.field2731 & 0x3FFF, 127, -class33.field544 & 0x3FFF, -class115.field1704 & 0x3FFF);
                class433.method2474(class232.field3052, class463.field6224, class380.field4847.field5797 >> 9, var21, class66.field954, class748.field10451.field10390.method2246((byte) 117) == 0, class741.field10342, class380.field4847.field5796 + 1, true, class85.field1180, -21228, class286.field3600, class318.field4121, class609.field8449, class450.field5953, class702.field9764, class449.field5944, class380.field4847.field5801 >> 9);
            } else {
                class595.method3372(class463.field6224, class450.field5953, class66.field954, class318.field4121, class232.field3052, class741.field10342, class702.field9764, class609.field8449, class449.field5944, class85.field1180, class380.field4847.field5796 + 1, var21, class380.field4847.field5801 >> 9, class380.field4847.field5797 >> 9, class748.field10451.field10390.method2246((byte) 62) == 0, true, class232.field3053 ? class286.field3600 : -1, 0, false);
            }
            class14.method102(true);
            if (class27.field484 == 10) {
                class360.method2086(256, var7, var6, 256, var8, -16777216, var9);
                class99.method793(var7, 120, var9, var8, 256, var6, 256);
                class296.method1778(1250620353, var9, 256, var7, var6, 256, var8);
                class317.method1874(var8, var7, var6, var9, -62);
            }
            class111.method887();
            class66.field954 = var15;
            class206.field2731 = var18;
            class33.field544 = var17;
            class318.field4121 = var16;
            class450.field5953 = var14;
            if (class526.field7348 && class437.field5817.method4211((byte) -52) == 0) {
                class526.field7348 = false;
            }
            if (class526.field7348) {
                class386.field4930.method544(-16777216, var6, var7, 18553, var9, var8);
                class163.method1139(class372.field4774, class386.field4930, 117, false, class697.field9708, class454.field6015.method2547(-114, class243.field3143));
            }
            class297.method1781(arg5, -127);
        } else {
            class386.field4930.method544(-16777216, arg2, arg3, 18553, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IB)V")
    public static final void method4070(int arg0, byte arg1) {
        field10143++;
        int var2 = -85 / ((arg1 + 23) / 46);
        if (class514.field7217 == 0) {
            class126.field1799.method1384(false, arg0);
        } else {
            class174.field2415 = arg0;
        }
    }
}
