import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class251 extends class319 {

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Loe;")
    public static class137 field3891 = new class137();

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "[J")
    public static long[] field3894 = new long[100];

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILya;I)V", line = 13)
    public static final void method1693(int arg0, int arg1, class38 arg2, int arg3) {
        field3892++;
        if (arg1 < 0 || arg0 < 0 || class373.field5552 == 0 || class442.field6494 == 0) {
            return;
        }
        arg2.method268(class502.field7225, class176.field2629, class373.field5552, class442.field6494);
        arg2.method313(class299.field4541, class534.field7853, class373.field5552, class442.field6494);
        class125 var4 = arg2.method291();
        var4.method218(class368.field5408, class189.field3180, class530.field7741, class433.field6409, class366.field5394, class178.field2687);
        arg2.method362(var4);
        if (class289.field4358 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg2.method308();
            int var8 = (arg1 - class502.field7225) * var7 / class373.field5552;
            int var9 = (arg0 - class176.field2629) * var7 / class442.field6494;
            int var10 = arg2.method299();
            int var11 = (arg1 - class502.field7225) * var10 / class373.field5552;
            int var12 = (arg0 - class176.field2629) * var10 / class442.field6494;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method215(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method215(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && class69.field976 > var20 && var22 < class285.field4328) {
                    int var23 = class398.field5947.field5826;
                    if (var23 < 3 && (class476.field6873[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class289.field4358[var23].method412(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class398.field5947.method953(-122) - 1 << 6) >> 7;
                        var6 = (class398.field5947.method953(arg3 ^ 0xFFFFA358) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class245.field3859 && (class366.field5390 & 0x40) != 0) {
                    class114 var24 = class181.method1210(class358.field5318, arg3 - 23768, class371.field5524);
                    if (var24 == null) {
                        class329.method2090(arg3 ^ 0xFFFFA329);
                    } else {
                        class168.method1127(-1, " ->", var5, var6, true, 5, false, class412.field6176, -84, class424.field6317, 0L);
                    }
                } else {
                    if (class86.field1228 == class312.field4691) {
                        class168.method1127(-1, "", var5, var6, true, 50, false, class133.field2036.method1635(class224.field3673, (byte) -116), arg3 - 23835, -1, 0L);
                    }
                    class319.field4807++;
                    class168.method1127(-1, "", var5, var6, true, 8, false, class411.field6113, -69, class259.field3976, 0L);
                }
            }
        }
        class305 var25 = class515.field7496;
        if (arg3 != 23766) {
            field3891 = null;
        }
        for (class484 var26 = (class484) var25.method1958(24); var26 != null; var26 = (class484) var25.method1961(124)) {
            if ((class432.field6404 || class398.field5947.field5826 == var26.field6969) && var26.method2899(arg2, (byte) 88, arg1, arg0)) {
                if (var26.field6960 instanceof class177) {
                    class177 var27 = (class177) var26.field6960;
                    int var28 = var27.method953(-55);
                    if ((var28 & 0x1) == 0 && (var27.field5837 & 0x7F) == 0 && (var27.field5833 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field5837 & 0x7F) == 64 && (var27.field5833 & 0x7F) == 64) {
                        int var29 = var27.field5837 - (var27.method953(-44) - 1 << 6);
                        int var30 = var27.field5833 - (var27.method953(arg3 - 23837) - 1 << 6);
                        for (int var31 = 0; var31 < class167.field2471; var31++) {
                            class116 var38 = class153.field2265[class470.field6797[var31]];
                            if (var38 != null && class475.field6854 != var38.field1972 && var38.field1948) {
                                int var39 = var38.field5837 - (var38.field1763.field494 - 1 << 6);
                                int var40 = var38.field5833 - (var38.field1763.field494 - 1 << 6);
                                if (var29 <= var39 && var38.field1763.field494 <= var27.method953(-36) - (var39 - var29 >> 7) && var40 >= var30 && var38.field1763.field494 <= var27.method953(-97) - (var40 - var30 >> 7)) {
                                    class338.method2134(class398.field5947.field5826 != var26.field6969, var38, (byte) -36);
                                    var38.field1972 = class475.field6854;
                                }
                            }
                        }
                        int var32 = class111.field1558;
                        int[] var33 = class318.field4804;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class177 var35 = class26.field319[var33[var34]];
                            if (var35 != null && class475.field6854 != var35.field1972 && var27 != var35 && var35.field1948) {
                                int var36 = var35.field5837 - (var35.method953(-41) - 1 << 6);
                                int var37 = var35.field5833 - (var35.method953(-119) - 1 << 6);
                                if (var29 <= var36 && var35.method953(arg3 - 23879) <= var27.method953(arg3 ^ 0xFFFFA31F) - (var36 - var29 >> 7) && var37 >= var30 && var35.method953(-128) <= (var27.method953(-84) - (var37 - var30 >> 7))) {
                                    class395.method2482(true, class398.field5947.field5826 != var26.field6969, var35);
                                    var35.field1972 = class475.field6854;
                                }
                            }
                        }
                    }
                    if (class475.field6854 == var27.field1972) {
                        continue;
                    }
                    class395.method2482(true, class398.field5947.field5826 != var26.field6969, var27);
                    var27.field1972 = class475.field6854;
                }
                if (var26.field6960 instanceof class116) {
                    class116 var41 = (class116) var26.field6960;
                    if (var41.field1763 != null) {
                        if ((var41.field1763.field494 & 0x1) == 0 && (var41.field5837 & 0x7F) == 0 && (var41.field5833 & 0x7F) == 0 || (var41.field1763.field494 & 0x1) == 1 && (var41.field5837 & 0x7F) == 64 && (var41.field5833 & 0x7F) == 64) {
                            int var42 = var41.field5837 - (var41.field1763.field494 - 1 << 6);
                            int var43 = var41.field5833 - (var41.field1763.field494 - 1 << 6);
                            for (int var44 = 0; var44 < class167.field2471; var44++) {
                                class116 var51 = class153.field2265[class470.field6797[var44]];
                                if (var51 != null && class475.field6854 != var51.field1972 && var41 != var51 && var51.field1948) {
                                    int var52 = var51.field5837 - (var51.field1763.field494 - 1 << 6);
                                    int var53 = var51.field5833 - (var51.field1763.field494 - 1 << 6);
                                    if (var42 <= var52 && var51.field1763.field494 <= (var41.field1763.field494 - (var52 - var42 >> 7)) && var43 <= var53 && var41.field1763.field494 - (var53 - var43 >> 7) >= var51.field1763.field494) {
                                        class338.method2134(class398.field5947.field5826 != var26.field6969, var51, (byte) 110);
                                        var51.field1972 = class475.field6854;
                                    }
                                }
                            }
                            int var45 = class111.field1558;
                            int[] var46 = class318.field4804;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class177 var48 = class26.field319[var46[var47]];
                                if (var48 != null && class475.field6854 != var48.field1972 && var48.field1948) {
                                    int var49 = var48.field5837 - (var48.method953(arg3 - 23863) - 1 << 6);
                                    int var50 = var48.field5833 - (var48.method953(-89) - 1 << 6);
                                    if (var42 <= var49 && var48.method953(-76) <= var41.field1763.field494 - (var49 - var42 >> 7) && var43 <= var50 && var48.method953(-124) <= (var41.field1763.field494 - (var50 - var43 >> 7))) {
                                        class395.method2482(true, class398.field5947.field5826 != var26.field6969, var48);
                                        var48.field1972 = class475.field6854;
                                    }
                                }
                            }
                        }
                        if (class475.field6854 == var41.field1972) {
                            continue;
                        }
                        class338.method2134(class398.field5947.field5826 != var26.field6969, var41, (byte) 121);
                        var41.field1972 = class475.field6854;
                    }
                }
                if (var26.field6960 instanceof class283) {
                    class433 var54 = (class433) class334.field4985.method2585((byte) 114, (long) (var26.field6965 << 14 | var26.field6969 << 28 | var26.field6966));
                    if (var54 != null) {
                        for (class495 var55 = (class495) var54.field6407.method1002((byte) 36); var55 != null; var55 = (class495) var54.field6407.method1003(false)) {
                            class532 var56 = class390.field5847.method467((byte) -101, var55.field7134);
                            if (!class245.field3859) {
                                if (class398.field5947.field5826 == var26.field6969) {
                                    String[] var58 = var56.field7767;
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        if (var58 != null && var58[var59] != null) {
                                            byte var60 = 0;
                                            if (var59 == 0) {
                                                var60 = 45;
                                            }
                                            int var61 = class273.field4187;
                                            if (var59 == 1) {
                                                var60 = 20;
                                            }
                                            if (var59 == 2) {
                                                var60 = 58;
                                            }
                                            if (var59 == 3) {
                                                var60 = 15;
                                            }
                                            if (var59 == 4) {
                                                var60 = 4;
                                            }
                                            if (var56.field7808 == var59) {
                                                var61 = var56.field7784;
                                            }
                                            if (var56.field7831 == var59) {
                                                var61 = var56.field7771;
                                            }
                                            class119.field1802++;
                                            class168.method1127(-1, "<col=ff9040>" + var56.field7806, var26.field6966, var26.field6965, true, var60, false, var58[var59], arg3 ^ 0xFFFFA358, var61, (long) var55.field7134);
                                        }
                                    }
                                }
                                class168.method1127(-1, "<col=ff9040>" + var56.field7806, var26.field6966, var26.field6965, true, 1003, class398.field5947.field5826 != var26.field6969, class198.field3294.method1635(class224.field3673, (byte) -61), arg3 ^ 0xFFFFA349, class319.field4812, (long) var55.field7134);
                                class9.field134++;
                            } else if (class398.field5947.field5826 == var26.field6969) {
                                class260 var57 = class108.field1514 == -1 ? null : class474.field6839.method3057(class108.field1514, (byte) 66);
                                if ((class366.field5390 & 0x1) != 0 && (var57 == null || var56.method3152(-1591469952, class108.field1514, var57.field3981) != var57.field3981)) {
                                    class168.method1127(-1, class190.field3206 + " -> <col=ff9040>" + var56.field7806, var26.field6966, var26.field6965, true, 10, false, class412.field6176, -109, class424.field6317, (long) var55.field7134);
                                    class88.field1258++;
                                }
                            }
                        }
                    }
                }
                if (var26.field6960 instanceof class164) {
                    class164 var62 = (class164) var26.field6960;
                    class69 var63 = class510.field7458.method2973(arg3 ^ 0xFFFFA35F, var62.method624((byte) -123));
                    if (var63.field906 != null) {
                        var63 = var63.method604((byte) -15, class195.field3271);
                    }
                    if (var63 != null) {
                        if (!class245.field3859) {
                            if (class398.field5947.field5826 == var26.field6969) {
                                String[] var65 = var63.field902;
                                if (var65 != null) {
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        if (var65[var66] != null) {
                                            short var67 = 0;
                                            int var68 = class273.field4187;
                                            if (var66 == 0) {
                                                var67 = 47;
                                            }
                                            if (var66 == 1) {
                                                var67 = 48;
                                            }
                                            if (var66 == 2) {
                                                var67 = 49;
                                            }
                                            if (var66 == 3) {
                                                var67 = 57;
                                            }
                                            if (var66 == 4) {
                                                var67 = 1010;
                                            }
                                            if (var63.field912 == var66) {
                                                var68 = var63.field968;
                                            }
                                            if (var63.field914 == var66) {
                                                var68 = var63.field937;
                                            }
                                            class168.method1127(-1, "<col=00ffff>" + var63.field888, var26.field6966, var26.field6965, true, var67, false, var65[var66], -112, var68, class339.method2138((byte) 109, var26.field6966, var62, var26.field6965));
                                            class112.field1569++;
                                        }
                                    }
                                }
                            }
                            class168.method1127(-1, "<col=00ffff>" + var63.field888, var26.field6966, var26.field6965, true, 1004, class398.field5947.field5826 != var26.field6969, class198.field3294.method1635(class224.field3673, (byte) 17), -107, class319.field4812, (long) var63.field964);
                            class55.field678++;
                        } else if (class398.field5947.field5826 == var26.field6969) {
                            class260 var64 = class108.field1514 == -1 ? null : class474.field6839.method3057(class108.field1514, (byte) 53);
                            if ((class366.field5390 & 0x4) != 0 && (var64 == null || var63.method603((byte) -122, var64.field3981, class108.field1514) != var64.field3981)) {
                                class168.method1127(-1, class190.field3206 + " -> <col=00ffff>" + var63.field888, var26.field6966, var26.field6965, true, 18, false, class412.field6176, -92, class424.field6317, class339.method2138((byte) 109, var26.field6966, var62, var26.field6965));
                                class195.field3267++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)I", line = 474)
    public static final int method1694(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field3893++;
        if (~var4 == arg0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 502)
    public static void method1695(int arg0) {
        field3894 = null;
        if (arg0 == 0) {
            field3891 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLjava/lang/String;)I", line = 513)
    public static final int method1696(byte arg0, String arg1) {
        field3890++;
        if (arg0 != -113) {
            field3894 = null;
        }
        for (int var2 = 0; var2 < class98.field1414.length; var2++) {
            if (class98.field1414[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
