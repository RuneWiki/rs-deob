import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class163 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lrc;")
    public static class9 field2694 = new class9(16);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
    public static int[] field2696;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[I")
    public static int[] field2697;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[[B")
    public static byte[][] field2695;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIZZILeh;I)V")
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7, class101 arg8, int arg9) {
        field2692++;
        byte var10 = 0;
        byte var11 = 0;
        if (arg1 == 1) {
            var11 = 1;
        } else if (arg1 == 2) {
            var10 = 1;
            var11 = 1;
        } else if (arg1 == 3) {
            var10 = 1;
        }
        if (arg4 >= 0 && arg4 < 104 && arg3 >= 0 && arg3 < 104) {
            if (!arg5 && !arg6) {
                class229.field3862[arg9][arg4][arg3] = 0;
            }
            while (true) {
                int var12 = arg8.method669((byte) 36);
                if (var12 == 0) {
                    if (arg5) {
                        class95.field1642[0][arg4 + var10][arg3 + var11] = class78.field1342[0][arg4 + var10][arg3 + var11];
                    } else if (arg9 == 0) {
                        class95.field1642[0][arg4 + var10][arg3 + var11] = -class219.method1452(45365, arg0 + 556238, arg2 + 932731) * 8;
                    } else {
                        class95.field1642[arg9][arg4 + var10][arg3 + var11] = class95.field1642[arg9 - 1][arg4 + var10][arg3 + var11] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg8.method669((byte) 36);
                    if (arg5) {
                        class95.field1642[0][arg4 + var10][arg3 + var11] = var13 * 8 + class78.field1342[0][arg4 + var10][arg3 + var11];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg9 == 0) {
                            class95.field1642[0][arg4 + var10][arg3 + var11] = -var13 * 8;
                        } else {
                            class95.field1642[arg9][arg4 + var10][arg3 + var11] = class95.field1642[arg9 - 1][arg4 + var10][arg3 + var11] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg6) {
                        arg8.method669((byte) 36);
                    } else {
                        class91.field1612[arg9][arg4][arg3] = arg8.method646(-44);
                        class57.field1006[arg9][arg4][arg3] = (byte) ((var12 - 2) / 4);
                        class88.field1566[arg9][arg4][arg3] = (byte) class113.method791(var12 + arg1 - 2, 3);
                    }
                } else if (var12 <= 81) {
                    if (!arg5 && !arg6) {
                        class229.field3862[arg9][arg4][arg3] = (byte) (var12 - 49);
                    }
                } else if (!arg6) {
                    class106.field1887[arg9][arg4][arg3] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg8.method669((byte) 36);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg8.method669((byte) 36);
                    break;
                }
                if (var14 <= 49) {
                    arg8.method669((byte) 36);
                }
            }
        }
        if (arg7 != -924) {
            field2696 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1101(int arg0) {
        field2696 = null;
        if (arg0 != 17) {
            field2697 = null;
        }
        field2695 = null;
        field2697 = null;
        field2694 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIBLnh;)V")
    public static final void method1102(int arg0, int arg1, byte arg2, class288 arg3) {
        field2693++;
        if ((arg1 & 0x8) != 0) {
            arg3.field1426 = class248.field4058.method693(false);
            if (arg3.field1426 == 65535) {
                arg3.field1426 = -1;
            }
        }
        if ((arg1 & 0x2) != 0) {
            int var4 = class248.field4058.method669((byte) 36);
            byte[] var5 = new byte[var4];
            class101 var6 = new class101(var5);
            class248.field4058.method649(var4, 0, (byte) 74, var5);
            class53.field930[arg0] = var6;
            arg3.method1954((byte) -40, var6);
        }
        if ((arg1 & 0x10) != 0) {
            arg3.field1439 = class248.field4058.method641(2);
            arg3.field1438 = class248.field4058.method691((byte) 119);
        }
        if ((arg1 & 0x400) != 0) {
            arg3.field1409 = class248.field4058.method670(arg2 + 28019133);
            arg3.field1452 = class248.field4058.method670(28019224);
            arg3.field1466 = class248.field4058.method638(0);
            arg3.field1414 = class248.field4058.method638(arg2 - 91);
            arg3.field1435 = class248.field4058.method693(false) + class266.field4301;
            arg3.field1469 = class248.field4058.method677(false) + class266.field4301;
            arg3.field1407 = class248.field4058.method669((byte) 36);
            arg3.field1422 = 1;
            arg3.field1448 = 0;
        }
        if ((arg1 & 0x100) != 0) {
            int var7 = class248.field4058.method670(arg2 + 28019133);
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            for (int var11 = 0; var11 < var7; var11++) {
                int var12 = class248.field4058.method641(2);
                if (var12 == 65535) {
                    var12 = -1;
                }
                var8[var11] = var12;
                var9[var11] = class248.field4058.method638(0);
                var10[var11] = class248.field4058.method641(2);
            }
            class65.method409((byte) 56, arg3, var9, var8, var10);
        }
        if (arg2 != 91) {
            method1100(-116, -34, -92, 88, -30, true, false, -125, (class101) null, -26);
        }
        if ((arg1 & 0x20) != 0) {
            arg3.field1462 = class248.field4058.method662((byte) 1);
            if (arg3.field1462.charAt(0) == '~') {
                arg3.field1462 = arg3.field1462.substring(1);
                class97.method612(arg3.field1462, -1, 2, arg3.method1951((byte) -81));
            } else if (class273.field4378 == arg3) {
                class97.method612(arg3.field1462, -1, 2, arg3.method1951((byte) -81));
            }
            arg3.field1425 = 150;
            arg3.field1434 = 0;
            arg3.field1476 = 0;
        }
        if ((arg1 & 0x800) != 0) {
            int var13 = class248.field4058.method692(27029);
            int var14 = class248.field4058.method669((byte) 36);
            arg3.method526(var14, arg2 ^ 0xFFFFFFDF, var13, class266.field4301);
        }
        if ((arg1 & 0x40) != 0) {
            int var15 = class248.field4058.method692(27029);
            int var16 = class248.field4058.method670(28019224);
            arg3.method526(var16, -86, var15, class266.field4301);
            arg3.field1483 = class266.field4301 + 300;
            arg3.field1453 = class248.field4058.method669((byte) 36);
        }
        if ((arg1 & 0x4) != 0) {
            int var17 = class248.field4058.method691((byte) 116);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = class248.field4058.method657(0);
            class26.method176(arg2 ^ 0x5B, arg3, var17, var18);
        }
        if ((arg1 & 0x200) != 0) {
            int var19 = class248.field4058.method693(false);
            int var20 = class248.field4058.method652((byte) 83);
            boolean var21 = true;
            if (var19 == 65535) {
                var19 = -1;
            }
            if (var19 != -1 && arg3.field1396 != -1 && class105.method714(class189.method1243(65536, var19).field2138, (byte) 101).field2744 < class105.method714(class189.method1243(65536, arg3.field1396).field2138, (byte) 2).field2744) {
                var21 = false;
            }
            if (var21) {
                arg3.field1390 = 1;
                arg3.field1385 = class266.field4301 + (var20 & 0xFFFF);
                arg3.field1386 = var20 >> 16;
                arg3.field1463 = 0;
                arg3.field1482 = 0;
                arg3.field1396 = var19;
                if (arg3.field1385 > class266.field4301) {
                    arg3.field1482 = -1;
                }
                if (arg3.field1396 != -1 && class266.field4301 == arg3.field1385) {
                    int var22 = class189.method1243(arg2 ^ 0x1005B, arg3.field1396).field2138;
                    if (var22 != -1) {
                        class167 var23 = class105.method714(var22, (byte) 46);
                        if (var23 != null && var23.field2736 != null) {
                            class112.method786(arg3.field1458, var23, 0, arg3.field1397, (byte) -53, class273.field4378 == arg3);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x1) == 0) {
            return;
        }
        int var24 = class248.field4058.method677(false);
        int var25 = class248.field4058.method669((byte) 36);
        int var26 = class248.field4058.method669((byte) 36);
        int var27 = class248.field4058.field1762;
        boolean var28 = (var24 & 0x8000) != 0;
        if (arg3.field4601 != null && arg3.field4592 != null) {
            long var29 = class103.method702(true, arg3.field4601);
            boolean var31 = false;
            if (var25 <= 1) {
                if (!var28 && (class66.field1108 && !class125.field2196 || class124.field2186)) {
                    var31 = true;
                } else {
                    for (int var32 = 0; var32 < class90.field1589; var32++) {
                        if (class237.field3906[var32] == var29) {
                            var31 = true;
                            break;
                        }
                    }
                }
            }
            if (!var31 && class126.field2211 == 0) {
                class206.field3363.field1762 = 0;
                class248.field4058.method647(-13749, 0, class206.field3363.field1730, var26);
                class206.field3363.field1762 = 0;
                int var33 = -1;
                String var34;
                if (var28) {
                    class239 var35 = class281.method1829(73, class206.field3363);
                    var33 = var35.field3923;
                    var34 = var35.field3922.method838(class206.field3363, (byte) 49);
                    var24 &= 0x7FFF;
                } else {
                    var34 = class244.method1625(class190.method1247(class50.method304(class206.field3363, 32767), arg2 - 111));
                }
                arg3.field1462 = var34.trim();
                arg3.field1476 = var24 & 0xFF;
                arg3.field1425 = 150;
                arg3.field1434 = var24 >> 8;
                if (var25 == 2) {
                    class286.method1909((byte) 71, var34, var33, (String) null, "<img=1>" + arg3.method1951((byte) -81), var28 ? 17 : 1);
                } else if (var25 == 1) {
                    class286.method1909((byte) 40, var34, var33, (String) null, "<img=0>" + arg3.method1951((byte) -81), var28 ? 17 : 1);
                } else {
                    class286.method1909((byte) 71, var34, var33, (String) null, arg3.method1951((byte) -81), var28 ? 17 : 2);
                }
            }
        }
        class248.field4058.field1762 = var26 + var27;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILvh;)V")
    public static final void method1103(int arg0, class108 arg1) {
        class105.field1861 = arg1;
        int var2 = -122 % ((-arg0 - 55) / 51);
        field2691++;
    }
}
