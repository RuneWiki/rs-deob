import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class101 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "[I")
    public static int[] field1466 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "[I")
    public static int[] field1463 = new int[3];

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field1467 = -1;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
    public static final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -31341) {
            return;
        }
        if (class509.field7436 >= arg4 && class37.field393 <= arg1) {
            boolean var6;
            if (class494.field7297 > arg2) {
                var6 = false;
                arg2 = class494.field7297;
            } else if (class445.field6629 < arg2) {
                var6 = false;
                arg2 = class445.field6629;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class494.field7297 > arg3) {
                var7 = false;
                arg3 = class494.field7297;
            } else if (arg3 <= class445.field6629) {
                var7 = true;
            } else {
                var7 = false;
                arg3 = class445.field6629;
            }
            if (class37.field393 > arg4) {
                arg4 = class37.field393;
            } else {
                class415.method2491(arg3, arg2, class339.field4800[arg4++], arg5, -31541);
            }
            if (arg1 <= class509.field7436) {
                class415.method2491(arg3, arg2, class339.field4800[arg1--], arg5, arg0 ^ 0x158);
            } else {
                arg1 = class509.field7436;
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg1; var8++) {
                    int[] var9 = class339.field4800[var8];
                    var9[arg2] = var9[arg3] = arg5;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg1; var10++) {
                    class339.field4800[var10][arg2] = arg5;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg1; var11++) {
                    class339.field4800[var11][arg3] = arg5;
                }
            }
        }
        field1465++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public static void method619(int arg0) {
        field1466 = null;
        field1463 = null;
        if (arg0 != 1024) {
            method618(95, -119, -86, 88, 59, 69);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1464++;
        if (class108.field1553 == null) {
            class348.field5015.method1087(arg3, arg4, 118, arg2, -16777216, arg0);
        } else if (class500.field7365.field1763 >= 0 && class500.field7365.field1763 < class30.field323 * 128 && class500.field7365.field1769 >= 0 && (class182.field2661 * 128) > class500.field7365.field1769) {
            class465.field6883++;
            if (class500.field7365 != null && class500.field7365.field1763 + 64 - (class500.field7365.method847(-1) * 64) >> 7 == class401.field6030 && class500.field7365.field1769 + 64 - (class500.field7365.method847(-1) * 64) >> 7 == class523.field7749) {
                class523.field7749 = -1;
                class401.field6030 = -1;
                class282.method1823(28460);
            }
            class513.method3031(3);
            if (!arg5) {
                class107.method655(-60);
            }
            class193.method1304(false);
            class387.method2360(2, true, arg2, arg4, arg0, arg3);
            int var6 = class364.field5576;
            int var7 = class409.field6154;
            int var8 = class463.field6863;
            int var9 = class11.field142;
            if (arg1 > -81) {
                field1463 = null;
            }
            if (class140.field2103 == 1) {
                int var12 = (int) class24.field262;
                if (var12 < (class378.field5767 >> 8)) {
                    var12 = class378.field5767 >> 8;
                }
                if (class189.field2793[4] && var12 < class441.field6592[4] + 128) {
                    var12 = class441.field6592[4] + 128;
                }
                int var13 = (int) class382.field5792 + class333.field4696 & 0x3FFF;
                class306.method1928(class366.field5598, 34235791, var13, (var12 >> 3) * 3 + 600 << 0, class377.method2316(class500.field7365.field1769, false, class500.field7365.field1763, class79.field1192) - 50, class48.field774, var6, var12);
            } else if (class140.field2103 == 4) {
                int var10 = (int) class24.field262;
                if (class378.field5767 >> 8 > var10) {
                    var10 = class378.field5767 >> 8;
                }
                if (class189.field2793[4] && (class441.field6592[4] + 128) > var10) {
                    var10 = class441.field6592[4] + 128;
                }
                int var11 = (int) class382.field5792 & 0x3FFF;
                class306.method1928(class366.field5598, 34235791, var11, (var10 >> 3) * 3 + 600 << 0, class377.method2316(class367.field5612, false, class94.field1398, class79.field1192) - 50, class48.field774, var6, var10);
            } else if (class140.field2103 == 5) {
                class228.method1563((byte) -3, var6);
            }
            int var14 = class24.field258;
            int var15 = class291.field4175;
            int var16 = class260.field3827;
            int var17 = class18.field195;
            int var18 = class259.field3812;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class189.field2793[var19]) {
                    int var22 = (int) ((double) (class335.field4724[var19] * 2 + 1) * Math.random() + Math.sin((double) class131.field2029[var19] / 100.0D * (double) class5.field69[var19]) * (double) class441.field6592[var19] - (double) class335.field4724[var19]);
                    if (var19 == 2) {
                        class260.field3827 += var22;
                    }
                    if (var19 == 0) {
                        class24.field258 += var22;
                    }
                    if (var19 == 1) {
                        class291.field4175 += var22;
                    }
                    if (var19 == 3) {
                        class259.field3812 = class259.field3812 + var22 & 0x3FFF;
                    }
                    if (var19 == 4) {
                        class18.field195 += var22;
                        if (class18.field195 < 1024) {
                            class18.field195 = 1024;
                        } else if (class18.field195 > 3072) {
                            class18.field195 = 3072;
                        }
                    }
                }
            }
            if (class24.field258 < 0) {
                class24.field258 = 0;
            }
            if (class24.field258 > (class361.field5554 << 7) - 1) {
                class24.field258 = (class361.field5554 << 7) - 1;
            }
            if (class260.field3827 < 0) {
                class260.field3827 = 0;
            }
            if (((class484.field7096 << 7) - 1) < class260.field3827) {
                class260.field3827 = (class484.field7096 << 7) - 1;
            }
            class441.method2662(0);
            class453.method2724(28);
            class348.field5015.method1098(var8, var9, var7 + var8, var6 + var9);
            class348.field5015.method1089();
            int var20 = class242.field3576;
            if (class323.field4623 == null) {
                class348.field5015.method1044(var20);
            } else {
                class323.field4623.method1485(class318.field4562 << 3, class348.field5015, var20, var9, class259.field3812, var7, (byte) 78, var8, class18.field195, var6);
            }
            class110.method675(19315);
            class301.field4266.method900(class24.field258, class291.field4175, class260.field3827, -class18.field195 & 0x3FFF, -class259.field3812 & 0x3FFF, -class296.field4216 & 0x3FFF);
            class348.field5015.method1082(class301.field4266);
            class348.field5015.method1050(var7 / 2 + var8, var6 / 2 + var9, class293.field4188 << 1, class293.field4188 << 1);
            class402.method2425(9180, var9 + (var6 / 2), var7 / 2 + var8, class293.field4188 << 1, class293.field4188 << 1);
            class191.method1298(class260.field3827, -class259.field3812 & 0x3FFF, -class18.field195 & 0x3FFF, -class296.field4216 & 0x3FFF, -3918, class24.field258, class291.field4175);
            byte var21 = class426.field6401.method2524(class170.field2529, -14120) == 2 ? (byte) class465.field6883 : 1;
            class178.method1212(class348.field5015, class317.field4559, class522.field7727, class301.field4266, class24.field258, class291.field4175, class260.field3827, class1.field5, class461.field6850, class515.field7519, class30.field322, class438.field6538, class265.field3875, class500.field7365.field1768 + 1, var21, class500.field7365.field1763 >> 7, class500.field7365.field1769 >> 7, !class426.field6401.field1014);
            class110.method675(19315);
            if (class193.field2832 == 30) {
                class27.method164(var9, 126, 256, 256, var8, var6, var7);
                class527.method3115(65280, var9, var6, 256, var8, 256, var7);
                class422.method2538(256, (byte) -101, var6, var8, var9, 256, var7);
                class102.method623(var9, var6, var8, -16499, var7);
            }
            class374.method2298();
            class259.field3812 = var18;
            class18.field195 = var17;
            class24.field258 = var14;
            class291.field4175 = var15;
            class260.field3827 = var16;
            if (class8.field116 && class62.field949.method270((byte) -24) == 0) {
                class8.field116 = false;
            }
            if (class8.field116) {
                class348.field5015.method1087(var9, var8, 124, var6, -16777216, var7);
                class183.method1254(110, class147.field2181, class237.field3490.method2838(false, class143.field2137), false);
            }
        } else {
            class348.field5015.method1087(arg3, arg4, 126, arg2, -16777216, arg0);
        }
    }
}
