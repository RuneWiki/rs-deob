import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class99 extends class472 {

    @OriginalMember(owner = "client!de", name = "s", descriptor = "Log;")
    public static class318 field1399 = new class318();

    @OriginalMember(owner = "client!de", name = "t", descriptor = "[J")
    public static long[] field1400 = new long[32];

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field1402 = 0;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "[I")
    public static int[] field1401 = new int[14];

    @OriginalMember(owner = "client!de", name = "x", descriptor = "[I")
    public static int[] field1404 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!de", name = "y", descriptor = "[I")
    public static int[] field1405 = new int[2];

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Lfn;")
    public static class52 field1403 = new class52(42, -1);

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "Les;")
    public class75 field1394;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lms;III)V", line = 7)
    public static final void method628(class363 arg0, int arg1, int arg2, int arg3) {
        class389.field5485 = arg2;
        int var4 = -104 % ((arg1 - 15) / 36);
        class41.field684 = arg3;
        field1398++;
        class200.field2879 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 19)
    public static void method629(int arg0) {
        field1401 = null;
        if (arg0 != 5) {
            field1401 = null;
        }
        field1399 = null;
        field1403 = null;
        field1405 = null;
        field1404 = null;
        field1400 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Les;IZ)V", line = 37)
    public static final void method630(class75 arg0, int arg1, boolean arg2) {
        field1397++;
        class318 var3 = arg0.method517(-92);
        if (arg0.field1142 == 0) {
            arg0.field1137 = 0;
            class367.field5225 = -1;
            class58.field914 = 0;
            return;
        }
        if (arg1 != 1) {
            field1404 = null;
        }
        if (arg0.field1128 != -1 && arg0.field1110 == 0) {
            class372 var4 = class31.field505.method950(true, arg0.field1128);
            if (arg0.field1138 > 0 && var4.field5258 == 0) {
                class367.field5225 = -1;
                arg0.field1137++;
                class58.field914 = 0;
                return;
            }
            if (arg0.field1138 <= 0 && var4.field5273 == 0) {
                arg0.field1137++;
                class367.field5225 = -1;
                class58.field914 = 0;
                return;
            }
        }
        if (arg0.field1079 != -1 && arg0.field1121 <= class356.field4972) {
            class321 var5 = class163.field2348.method548(arg0.field1079, (byte) 61);
            if (var5.field4392 && var5.field4391 != -1) {
                class372 var6 = class31.field505.method950(true, var5.field4391);
                if (arg0.field1138 > 0 && var6.field5258 == 0) {
                    class367.field5225 = -1;
                    class58.field914 = 0;
                    arg0.field1137++;
                    return;
                }
                if (arg0.field1138 <= 0 && var6.field5273 == 0) {
                    arg0.field1137++;
                    class58.field914 = 0;
                    class367.field5225 = -1;
                    return;
                }
            }
        }
        int var7 = arg0.field6765;
        int var8 = arg0.field6746;
        int var9 = arg0.field1144[arg0.field1142 - 1] * 128 + (arg0.method206(0) * 64);
        int var10 = arg0.field1140[arg0.field1142 - 1] * 128 + arg0.method206(0) * 64;
        if (var9 > var7) {
            if (var10 > var8) {
                arg0.method505(10240, arg1 ^ 0xFFFF82AF);
            } else if (var10 >= var8) {
                arg0.method505(12288, -32082);
            } else {
                arg0.method505(14336, arg1 ^ 0xFFFF82AF);
            }
        } else if (var7 > var9) {
            if (var10 > var8) {
                arg0.method505(6144, -32082);
            } else if (var10 < var8) {
                arg0.method505(2048, -32082);
            } else {
                arg0.method505(4096, -32082);
            }
        } else if (var10 > var8) {
            arg0.method505(8192, arg1 - 32083);
        } else if (var8 > var10) {
            arg0.method505(0, -32082);
        }
        byte var11 = arg0.field1147[arg0.field1142 - 1];
        if (!arg2 && (var9 - var7 > 256 || var9 - var7 < -256 || var10 - var8 > 256 || (var10 - var8) < -256)) {
            arg0.field6746 = var10;
            arg0.field6765 = var9;
            arg0.method511(-14423, arg0.field1075);
            class367.field5225 = -1;
            class58.field914 = 0;
            arg0.field1142--;
            if (arg0.field1138 > 0) {
                arg0.field1138--;
            }
            return;
        }
        int var12 = 4;
        boolean var13 = true;
        if (arg0 instanceof class196) {
            var13 = ((class196) arg0).field2789.field1762;
        }
        if (var13) {
            int var14 = arg0.field1075 - arg0.field1076.field1030;
            if (var14 != 0 && arg0.field1096 == -1 && arg0.field1063 != 0) {
                var12 = 2;
            }
            if (!arg2 && arg0.field1142 > 2) {
                var12 = 6;
            }
            if (!arg2 && arg0.field1142 > 3) {
                var12 = 8;
            }
        } else {
            if (!arg2 && arg0.field1142 > 1) {
                var12 = 6;
            }
            if (!arg2 && arg0.field1142 > 2) {
                var12 = 8;
            }
        }
        if (arg0.field1137 > 0 && arg0.field1142 > 1) {
            arg0.field1137--;
            var12 = 8;
        }
        if (var11 == 2) {
            var12 <<= 0x1;
        } else if (var11 == 0) {
            var12 >>= 0x1;
        }
        class58.field914 = 0;
        if (var3.field4321 != -1) {
            int var15 = var12 << 7;
            if (arg0.field1142 == 1) {
                int var16 = arg0.field1139 * arg0.field1139;
                int var17 = (arg0.field6765 <= var9 ? var9 - arg0.field6765 : arg0.field6765 - var9) << 7;
                int var18 = (arg0.field6746 <= var10 ? var10 - arg0.field6746 : -var10 + arg0.field6746) << 7;
                int var19 = var18 >= var17 ? var18 : var17;
                int var20 = var3.field4321 * 2 * var19;
                if (var16 > var20) {
                    arg0.field1139 /= 2;
                } else if ((var16 / 2) > var19) {
                    arg0.field1139 -= var3.field4321;
                    if (arg0.field1139 < 0) {
                        arg0.field1139 = 0;
                    }
                } else if (var15 > arg0.field1139) {
                    arg0.field1139 += var3.field4321;
                    if (var15 < arg0.field1139) {
                        arg0.field1139 = var15;
                    }
                }
            } else if (arg0.field1139 < var15) {
                arg0.field1139 += var3.field4321;
                if (var15 < arg0.field1139) {
                    arg0.field1139 = var15;
                }
            } else if (arg0.field1139 > 0) {
                arg0.field1139 -= var3.field4321;
                if (arg0.field1139 < 0) {
                    arg0.field1139 = 0;
                }
            }
            var12 = arg0.field1139 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var9 > var7) {
            arg0.field6765 += var12;
            class58.field914 |= 0x4;
            if (var9 < arg0.field6765) {
                arg0.field6765 = var9;
            }
        } else if (var7 > var9) {
            class58.field914 |= 0x8;
            arg0.field6765 -= var12;
            if (var9 > arg0.field6765) {
                arg0.field6765 = var9;
            }
        }
        if (var8 < var10) {
            arg0.field6746 += var12;
            class58.field914 |= 0x1;
            if (arg0.field6746 > var10) {
                arg0.field6746 = var10;
            }
        } else if (var10 < var8) {
            arg0.field6746 -= var12;
            class58.field914 |= 0x2;
            if (var10 > arg0.field6746) {
                arg0.field6746 = var10;
            }
        }
        if (var12 >= 8) {
            class367.field5225 = 2;
        } else {
            class367.field5225 = var11;
        }
        if (arg0.field6765 != var9 || arg0.field6746 != var10) {
            return;
        }
        arg0.field1142--;
        if (arg0.field1138 > 0) {
            arg0.field1138--;
            return;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BIIIIZ)V", line = 342)
    public static final void method631(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1389++;
        if (class455.field6293 == null) {
            class338.field4636.method2860(arg4, arg1, arg2, -16777216, arg3, 1);
        } else if (class2.field21.field6765 >= 0 && class2.field21.field6765 < class200.field2875 * 128 && class2.field21.field6746 >= 0 && class2.field21.field6746 < (class422.field5811 * 128)) {
            class195.field2771++;
            if (class2.field21 != null && (class2.field21.field6765 - ((class2.field21.method206(0) - 1) * 64) >> 7) == class372.field5266 && class2.field21.field6746 + 64 - (class2.field21.method206(0) * 64) >> 7 == class35.field588) {
                class372.field5266 = -1;
                class35.field588 = -1;
                class488.method2869(10);
            }
            class411.method2407(-82);
            if (!arg5) {
                class68.method482(true);
            }
            class181.method1187(114);
            class411.method2409(arg1, arg3, true, arg4, arg2, -334);
            int var6 = class205.field2950;
            int var7 = class254.field3555;
            int var8 = class107.field1536;
            int var9 = class27.field455;
            if (class375.field5312 == 1) {
                int var10 = (int) class356.field4959;
                if (var10 < class272.field3752 >> 8) {
                    var10 = class272.field3752 >> 8;
                }
                if (class269.field3730[4] && var10 < (class417.field5741[4] + 128)) {
                    var10 = class417.field5741[4] + 128;
                }
                int var11 = (int) class418.field5750 + class480.field6795 & 0x3FFF;
                class229.method1444(class222.field3133, var9, -98, class146.field2068, var10, var11, class418.method2441(class2.field21.field6746, class76.field1161, class2.field21.field6765, -16778) - 50, (var10 >> 3) * 3 + 600);
            } else if (class375.field5312 == 4) {
                int var12 = (int) class356.field4959;
                if (var12 < class272.field3752 >> 8) {
                    var12 = class272.field3752 >> 8;
                }
                if (class269.field3730[4] && class417.field5741[4] + 128 > var12) {
                    var12 = class417.field5741[4] + 128;
                }
                int var13 = (int) class418.field5750 & 0x3FFF;
                class229.method1444(class222.field3133, var9, -99, class146.field2068, var12, var13, class418.method2441(class293.field4021, class76.field1161, class299.field4120, -16778) - 50, 600 - -((var12 >> 3) * 3));
            } else if (class375.field5312 == 5) {
                class439.method2550(-110, var9);
            }
            int var14 = class436.field5982;
            int var15 = class183.field2665;
            int var16 = class106.field1525;
            int var17 = class160.field2306;
            int var18 = class200.field2873;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class269.field3730[var19]) {
                    int var22 = (int) ((double) (-class73.field1059[var19]) + Math.random() * (double) (class73.field1059[var19] * 2 + 1) + Math.sin((double) class115.field1629[var19] / 100.0D * (double) class274.field3800[var19]) * (double) class417.field5741[var19]);
                    if (var19 == 1) {
                        class183.field2665 += var22;
                    }
                    if (var19 == 3) {
                        class200.field2873 = class200.field2873 + var22 & 0x3FFF;
                    }
                    if (var19 == 2) {
                        class106.field1525 += var22;
                    }
                    if (var19 == 0) {
                        class436.field5982 += var22;
                    }
                    if (var19 == 4) {
                        class160.field2306 += var22;
                        if (class160.field2306 < 1024) {
                            class160.field2306 = 1024;
                        } else if (class160.field2306 > 3072) {
                            class160.field2306 = 3072;
                        }
                    }
                }
            }
            if (class436.field5982 < 0) {
                class436.field5982 = 0;
            }
            if ((class456.field6299 << 7) - 1 < class436.field5982) {
                class436.field5982 = (class456.field6299 << 7) - 1;
            }
            if (class106.field1525 < 0) {
                class106.field1525 = 0;
            }
            if ((class205.field2946 << 7) - 1 < class106.field1525) {
                class106.field1525 = (class205.field2946 << 7) - 1;
            }
            class245.method1527((byte) -52);
            class373.method2235(10);
            class338.field4636.method1094(var7, var8, var6 + var7, var8 - -var9);
            class338.field4636.method1111();
            int var20 = class7.field120;
            if (class444.field6124 == null) {
                class338.field4636.method1060(var20);
            } else {
                class444.field6124.method852(var9, var8, class160.field2306, var7, class200.field2873, class338.field4636, class78.field1182 << 3, var6, (byte) -127, var20);
            }
            class172.method1155(15547);
            class126.field1740.method1383(class436.field5982, class183.field2665, class106.field1525, -class160.field2306 & 0x3FFF, -class200.field2873 & 0x3FFF, -class259.field3618 & 0x3FFF);
            if (arg0 < -5) {
                class338.field4636.method1071(class126.field1740);
                class338.field4636.method1079(var6 / 2 + var7, var9 / 2 + var8, class155.field2234 << 1, class155.field2234 << 1);
                class304.method1843(var6 / 2 + var7, var9 / 2 + var8, class155.field2234 << 1, true, class155.field2234 << 1);
                class155.method947(class106.field1525, class183.field2665, class436.field5982, -class160.field2306 & 0x3FFF, 0, -class200.field2873 & 0x3FFF, -class259.field3618 & 0x3FFF);
                byte var21 = class372.method2228(-122) == 2 ? (byte) class195.field2771 : 1;
                class287.method1770(class338.field4636, class356.field4972, class459.field6468, class126.field1740, class436.field5982, class183.field2665, class106.field1525, class484.field6821, class435.field5976, class440.field6042, class280.field3862, field1405, class488.field6888, class2.field21.field6766 + 1, var21, class2.field21.field6765 >> 7, class2.field21.field6746 >> 7, !class216.field3069);
                class172.method1155(15547);
                if (class478.field6764 == 30) {
                    class366.method2213(256, 256, var7, var8, var9, var6, -575004671);
                    class327.method1964(256, var7, var6, 256, var9, var8, (byte) -50);
                    class485.method2842(var7, var9, var6, -1, 256, var8, 256);
                    class367.method2216(var6, 4, var8, var7, var9);
                }
                class226.method1427();
                class183.field2665 = var15;
                class106.field1525 = var16;
                class436.field5982 = var14;
                class200.field2873 = var18;
                class160.field2306 = var17;
                if (class393.field5523 && class374.field5299.method2771(4) == 0) {
                    class393.field5523 = false;
                }
                if (class393.field5523) {
                    class338.field4636.method2860(var9, var6, var7, -16777216, var8, 1);
                    class442.method2568(class262.field3662, 0, class480.field6789.method695(-115, class487.field6867), false);
                }
            }
        } else {
            class338.field4636.method2860(arg4, arg1, arg2, -16777216, arg3, 1);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIIII)V", line = 534)
    public static final void method632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != 3) {
            field1402 = -88;
        }
        field1395++;
        if (class56.method431(12449, arg8)) {
            client.method2334(class39.field666[arg8], -1, arg3, arg2, arg7, arg4, arg6, arg0, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 549)
    public static final void method633(boolean arg0) {
        field1396++;
        if (arg0 || class283.field3888 == null) {
            return;
        }
        if (class283.field3888.field5789 == 1) {
            class283.field3888 = null;
            return;
        }
        if (class283.field3888.field5789 == 2) {
            class475.method2785(-105, 2, class159.field2290, class299.field4119);
            class283.field3888 = null;
            return;
        }
    }
}
