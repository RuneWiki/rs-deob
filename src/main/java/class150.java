import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class150 extends class16 implements class595 {

    @OriginalMember(owner = "client!dfa", name = "N", descriptor = "Lro;")
    private class2 field2581;

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "[I")
    public static int[] field2569 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2577 = null;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "F")
    public static float field2564;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!dfa", name = "C", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!dfa", name = "L", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!dfa", name = "M", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "Lom;")
    public static class344 field2566;

    @OriginalMember(owner = "client!dfa", name = "K", descriptor = "Lom;")
    public static class344 field2578;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2575;

    @OriginalMember(owner = "client!dfa", name = "d", descriptor = "(I)V")
    public static final void method1179(int arg0) {
        class576.field8367 = new class158();
        if (arg0 == 22991) {
            ++field2567;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1180(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field2574;
        if (class257.field3792 == null) {
            class623.field9017.method1267(arg1, arg3, 1, arg2, arg0, -16777216);
        } else if (~class532.field7456.field9806 <= -1 && class532.field7456.field9806 < class675.field9604 * 512 && class532.field7456.field9815 >= 0 && ~class532.field7456.field9815 > ~(class218.field3316 * 512)) {
            ++class705.field9922;
            if (arg4 != -27271) {
                method1179(-77);
            }
            if (class532.field7456 != null && ~(class532.field7456.field9806 + 256 + -(256 * class532.field7456.method3446(arg4 + 27271)) >> 9) == ~class459.field6558 && ~(class532.field7456.field9815 - (-256 + class532.field7456.method3446(0) * 256) >> 9) == ~class51.field1189) {
                class459.field6558 = -1;
                class51.field1189 = -1;
                class703.method3925(94);
            }
            class270.method1753((byte) 20);
            if (!arg5) {
                class193.method1394((byte) -125);
            }
            client.method1807(-1);
            class251.method1683(arg2, arg0, arg1, (byte) 66, arg3, true);
            int var6 = class421.field6070;
            int var7 = class672.field9574;
            int var8 = class673.field9576;
            int var9 = class423.field6117;
            if (~class423.field6123 == -2) {
                int var10 = (int) class27.field926;
                if (class697.field9817 >> 8 > var10) {
                    var10 = class697.field9817 >> 8;
                }
                if (class409.field5926[4] && class679.field9631[4] + 128 > var10) {
                    var10 = class679.field9631[4] + 128;
                }
                int var11 = 16383 & (int) class591.field8509 - -class295.field4422;
                class198.method1421(var10, var9, (var10 >> 3) * 3 + 600 << 2, class369.field5478, var11, class98.field1762, class460.method2757(arg4 + 27271, class532.field7456.field9815, class37.field1046, class532.field7456.field9806) + -200, 90);
            } else if (~class423.field6123 != -5) {
                if (class423.field6123 == 5) {
                    class370.method2339(true, var9);
                }
            } else {
                int var12 = (int) class27.field926;
                if (~var12 > ~(class697.field9817 >> 8)) {
                    var12 = class697.field9817 >> 8;
                }
                if (class409.field5926[4] && var12 < class679.field9631[4] + 128) {
                    var12 = class679.field9631[4] + 128;
                }
                int var13 = 16383 & (int) class591.field8509;
                class198.method1421(var12, var9, (var12 >> 3) * 3 + 600 << 2, class369.field5478, var13, class98.field1762, -200 + class460.method2757(0, class260.field3823, class37.field1046, class112.field2019), 115);
            }
            int var14 = class206.field3158;
            int var15 = class1.field97;
            int var16 = class537.field7518;
            int var17 = class499.field7113;
            int var18 = class517.field7300;
            for (int var19 = 0; ~var19 > -6; ++var19) {
                if (class409.field5926[var19]) {
                    int var22 = (int) ((double) (-class371.field5509[var19]) + (double) (class371.field5509[var19] * 2 + 1) * Math.random() + Math.sin((double) class470.field6650[var19] / 100.0D * (double) class2.field379[var19]) * (double) class679.field9631[var19]);
                    if (~var19 == -5) {
                        class499.field7113 += var22;
                        if (class499.field7113 < 1024) {
                            class499.field7113 = 1024;
                        } else if (class499.field7113 > 3072) {
                            class499.field7113 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class206.field3158 += var22 << 2;
                    }
                    if (~var19 == -3) {
                        class537.field7518 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class517.field7300 = class517.field7300 + var22 & 16383;
                    }
                    if (~var19 == -2) {
                        class1.field97 += var22 << 2;
                    }
                }
            }
            if (~class206.field3158 > -1) {
                class206.field3158 = 0;
            }
            if ((class520.field7369 << 9) + -1 < class206.field3158) {
                class206.field3158 = (class520.field7369 << 9) + -1;
            }
            if (~class537.field7518 > -1) {
                class537.field7518 = 0;
            }
            if (~class537.field7518 < ~((class107.field1852 << 9) + -1)) {
                class537.field7518 = (class107.field1852 << 9) - 1;
            }
            class155.method1198(22575);
            class562.method3261((byte) -123);
            class623.field9017.method142(var7, var6, var7 + var8, var6 + var9);
            class623.field9017.method28();
            int var20 = class527.field7431;
            if (class2.field378 != null) {
                class2.field378.method3312(var7, var6, 4494, var8, class499.field7113, class517.field7300, class124.field2246 << 3, var9, class623.field9017, var20);
            } else {
                class623.field9017.method42(var20);
            }
            class418.method2539(false);
            class608.field8854.method907(class206.field3158, class1.field97, class537.field7518, 16383 & -class499.field7113, 16383 & -class517.field7300, -class596.field8558 & 16383);
            class623.field9017.method145(class608.field8854);
            class623.field9017.method62(var8 / 2 + var7, var6 - -(var9 / 2), class234.field3504 << 1, class234.field3504 << 1);
            class600.method3430(class234.field3504 << 1, var7 - -(var8 / 2), false, class234.field3504 << 1, var9 / 2 + var6);
            class160.method1237(class1.field97, -class499.field7113 & 16383, -class596.field8558 & 16383, 16383 & -class517.field7300, false, class206.field3158, class537.field7518);
            byte var21 = ~class527.field7429.method2820((byte) -110, class90.field1654) == -3 ? (byte) class705.field9922 : 1;
            class519.method3054(class336.field5031, class206.field3158, class1.field97, class537.field7518, class483.field6917, class314.field4643, class263.field3848, class706.field9941, class129.field2341, class70.field1468, class532.field7456.field9814 + 1, var21, class532.field7456.field9806 >> 9, class532.field7456.field9815 >> 9, !class527.field7429.field2633, true);
            class418.method2539(false);
            if (class199.field3098 == 10) {
                class32.method510(15124, var6, 256, var7, var9, 256, var8);
                class16.method381(var8, 256, var6, arg4 ^ -27283, var7, var9, 256);
                class82.method834(var9, var6, 109, 256, var8, 256, var7);
                class649.method3704(var6, var7, var9, var8, -2360);
            }
            class69.method776();
            class1.field97 = var15;
            class206.field3158 = var14;
            class499.field7113 = var17;
            class537.field7518 = var16;
            class517.field7300 = var18;
            if (class144.field2513 && ~class186.field2999.method1483(17580) == -1) {
                class144.field2513 = false;
            }
            if (class144.field2513) {
                class623.field9017.method1267(var6, var9, 1, var8, var7, -16777216);
                class341.method2191(class623.field9017, class265.field3887.method1733(arg4 + 27526, class140.field2466), false, class363.field5394, class612.field8916, (byte) -119);
            }
        } else {
            class623.field9017.method1267(arg1, arg3, arg4 + 27272, arg2, arg0, -16777216);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lom;ILom;Lom;Lom;)V")
    public static final void method1181(class344 arg0, int arg1, class344 arg2, class344 arg3, class344 arg4) {
        class38.field1055 = arg0;
        class588.field8467 = arg2;
        ++field2572;
        class145.field2523 = arg4;
        class156.field2667 = new class545[class38.field1055.method2245(0)][];
        class553.field7840 = new boolean[class38.field1055.method2245(0)];
        if (arg1 != 3078) {
            field2564 = 1.2512457F;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "e", descriptor = "(I)V")
    public static final void method1182(int arg0) {
        if (class27.field926 < 1024.0F) {
            class27.field926 = 1024.0F;
        }
        ++field2580;
        while (class591.field8509 >= 16384.0F) {
            class591.field8509 -= 16384.0F;
        }
        if (class27.field926 > 3072.0F) {
            class27.field926 = 3072.0F;
        }
        while (class591.field8509 < 0.0F) {
            class591.field8509 += 16384.0F;
        }
        int var1 = class98.field1762 >> 9;
        if (arg0 >= -67) {
            field2566 = null;
        }
        int var2 = class369.field5478 >> 9;
        int var3 = class460.method2757(0, class369.field5478, class37.field1046, class98.field1762);
        int var4 = 0;
        if (~var1 < -4 && var2 > 3 && var1 < class675.field9604 + -4 && ~(class218.field3316 + -4) < ~var2) {
            for (int var5 = var1 + -4; var5 <= var1 + 4; ++var5) {
                for (int var6 = var2 - 4; ~var6 >= ~(var2 - -4); ++var6) {
                    int var7 = class37.field1046;
                    if (var7 < 3 && class89.method868(5125, var5, var6)) {
                        ++var7;
                    }
                    int var8 = 0;
                    if (class691.field9754.field2273 != null && class691.field9754.field2273[var7] != null) {
                        var8 = (255 & class691.field9754.field2273[var7][var5][var6]) * 8;
                    }
                    if (class485.field6947 != null && class485.field6947[var7] != null) {
                        int var9 = var3 - class485.field6947[var7].method551(var5, var6, (byte) -107) + var8;
                        if (~var4 > ~var9) {
                            var4 = var9;
                        }
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (~var10 > -262145) {
            var10 = 262144;
        }
        if (class697.field9817 >= var10) {
            if (var10 < class697.field9817) {
                class697.field9817 += (-class697.field9817 + var10) / 80;
                return;
            }
        } else {
            class697.field9817 += (-class697.field9817 + var10) / 24;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V")
    public final void method382(byte arg0) {
        super.method382((byte) 74);
        if (arg0 <= 63) {
            field2577 = null;
        }
        ++field2576;
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Ljq;Lro;Z)V")
    public class150(class475 arg0, class2 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field2581 = arg1;
    }

    @OriginalMember(owner = "client!dfa", name = "f", descriptor = "(I)V")
    public static void method1183(int arg0) {
        field2575 = null;
        field2577 = null;
        field2566 = null;
        field2569 = null;
        field2578 = null;
        if (arg0 != 18653) {
            field2578 = null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)V")
    public static final void method1184(int arg0, int arg1) {
        class601.field8616.method1908(arg1, (byte) -11);
        ++field2568;
        if (arg0 != 671) {
            field2566 = null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Z)Z")
    public final boolean method1185(boolean arg0) {
        ++field2565;
        if (!arg0) {
            this.method380(45, (byte) -85);
        }
        return super.method379(super.field765.field6823, (byte) -52);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I[S)[S")
    public static final short[] method1186(int arg0, short[] arg1) {
        ++field2563;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class692.method3876(arg1, 0, var2, 0, arg1.length);
            if (arg0 != -4) {
                field2566 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(B)Lro;")
    public final class2 method1187(byte arg0) {
        ++field2573;
        return arg0 != 36 ? null : this.field2581;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IB)V")
    public final void method380(int arg0, byte arg1) {
        ++field2570;
        super.method380(this.field2581.field367 * arg0, arg1);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method1188(boolean arg0, boolean arg1) {
        ++field2571;
        return arg0 ? null : super.method388((byte) -102, super.field765.field6823, arg1);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)I")
    public final int method386(int arg0) {
        if (arg0 != 0) {
            return -35;
        } else {
            ++field2579;
            return super.method386(arg0);
        }
    }
}
