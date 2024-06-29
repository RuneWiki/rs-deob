import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class324 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field5044 = 0;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field5048 = 0;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field5056 = new String[100];

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[I")
    public static int[] field5049;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)I", line = 5)
    public static final int method2222(boolean arg0, byte arg1) {
        field5047++;
        if (arg1 >= -14) {
            field5048 = -128;
        }
        long var2 = class234.method1650((byte) 64);
        for (class58 var4 = arg0 ? (class58) class30.field385.method200(0) : (class58) class30.field385.method202((byte) -64); var4 != null; var4 = (class58) class30.field385.method202((byte) -79)) {
            if (var2 > (var4.field859 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field859 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field3418;
                    class199.field3158[var5] = class45.field706[var5];
                    var4.method1554((byte) -34);
                    return var5;
                }
                var4.method1554((byte) -65);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 60)
    public static final void method2223(int arg0) {
        field5052++;
        if (arg0 != 1) {
            field5049 = (int[]) null;
        }
        class116.field1815.method1428(10935);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLhb;)V", line = 73)
    public static final void method2224(byte arg0, class35 arg1) {
        int var2 = arg1.method241(0);
        class20.field220 = new class80[var2];
        field5046++;
        for (int var3 = 0; var3 < var2; var3++) {
            class20.field220[var3] = new class80();
            class20.field220[var3].field1123 = arg1.method241(0);
            class20.field220[var3].field1116 = arg1.method253(7);
        }
        class289.field4547 = arg1.method241(0);
        class154.field2319 = arg1.method241(0);
        class227.field3516 = arg1.method241(0);
        if (arg0 > -78) {
            field5048 = 20;
        }
        class12.field129 = new class220[class154.field2319 + 1 - class289.field4547];
        for (int var4 = 0; var4 < class227.field3516; var4++) {
            int var5 = arg1.method241(0);
            class220 var6 = class12.field129[var5] = new class220();
            var6.field3474 = arg1.method273(65280);
            var6.field3472 = arg1.method299(-104);
            var6.field3456 = class289.field4547 + var5;
            var6.field3450 = arg1.method253(7);
            var6.field3453 = arg1.method253(7);
        }
        class21.field231 = arg1.method299(-83);
        class10.field105 = true;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 119)
    public static void method2225(int arg0) {
        if (arg0 != -9) {
            field5056 = (String[]) null;
        }
        field5056 = null;
        field5049 = null;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V", line = 130)
    public static final void method2226(int arg0) {
        field5051++;
        class87.field1275.method1428(10935);
        if (arg0 != 8) {
            method2227(true, false);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZZ)V", line = 141)
    public static final void method2227(boolean arg0, boolean arg1) {
        class22.method151(class210.field3314, class319.field4972, (byte) 122, class125.field1972, arg0);
        if (!arg1) {
            method2223(109);
        }
        field5053++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lsk;", line = 155)
    public static final class126 method2228(int arg0, int arg1) {
        field5055++;
        class126 var2 = (class126) class69.field1014.method1432((byte) 119, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class273.field4141.method1507(class258.method1790(arg1, 1023), (byte) -126, class113.method888((byte) 6, arg1));
        class126 var4 = new class126();
        if (var3 != null) {
            var4.method954(new class35(var3), 0);
        }
        if (arg0 != 0) {
            method2226(39);
        }
        class69.field1014.method1436(false, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lek;I)Z", line = 193)
    public static final boolean method2229(class184 arg0, int arg1) {
        field5045++;
        if (arg1 != 16096) {
            field5049 = (int[]) null;
        }
        if (arg0.field2881 == 205) {
            class218.field3427 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZIZLal;IIIIII)V", line = 217)
    public static final void method2230(int arg0, boolean arg1, int arg2, boolean arg3, class323 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5050++;
        if (arg3 && !class252.method1753(-8090) && (class208.field3272[0][arg8][arg9] & 0x2) == 0) {
            if ((class208.field3272[arg10][arg8][arg9] & 0x10) != 0) {
                return;
            }
            if (class269.method1870(arg9, arg8, -30, arg10) != class167.field2507) {
                return;
            }
        }
        if (arg10 < class43.field680) {
            class43.field680 = arg10;
        }
        class101 var11 = class281.method1984(arg0, false);
        if (class36.field534 && var11.field1508) {
            return;
        }
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var13 = var11.field1533;
            var12 = var11.field1524;
        } else {
            var12 = var11.field1533;
            var13 = var11.field1524;
        }
        int var14;
        int var15;
        if (arg8 + var12 <= 104) {
            var14 = arg8 + (var12 >> 1);
            var15 = (var12 + 1 >> 1) + arg8;
        } else {
            var14 = arg8;
            var15 = arg8 + 1;
        }
        int var16;
        int var17;
        if ((arg9 + var13) <= 104) {
            var16 = (var13 >> 1) + arg9;
            var17 = (var13 + 1 >> 1) + arg9;
        } else {
            var16 = arg9;
            var17 = arg9 + 1;
        }
        int[][] var18 = class41.field612[arg6];
        int var19 = var18[var14][var16] + var18[var15][var17] + var18[var15][var16] + var18[var14][var17] >> 2;
        int var20 = (arg8 << 7) + (var12 << 6);
        int var21 = (arg9 << 7) + (var13 << 6);
        int var22 = 0;
        if (class36.field534 && arg6 != 0) {
            int[][] var23 = class41.field612[0];
            var22 = var19 - (var23[var14][var16] + var23[var15][var16] - (-var23[var14][var17] - var23[var15][var17]) >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg1) {
            var24 = class258.field3844[0];
        } else if (arg6 < 3) {
            var24 = class41.field612[arg6 + 1];
        }
        long var25 = (long) (arg2 << 14 | arg8 | arg9 << 7 | arg5 << 20 | 0x40000000);
        if (var11.field1538 == 0 || arg1) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field1539 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field1545) {
            var25 |= 0x80000000L;
        }
        if (var11.method786(-6000)) {
            class51.method468(arg5, (class121) null, arg10, var11, arg9, 128, arg8, (class45) null);
        }
        int var27 = -110 % ((59 - arg7) / 58);
        long var28 = var25 | (long) arg0 << 32;
        boolean var30 = var11.field1572 & !arg1;
        if (arg2 == 22) {
            if (class11.field127 || var11.field1538 != 0 || var11.field1514 == 1 || var11.field1574) {
                class310 var32;
                if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                    class136 var31 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5, arg3, 22);
                    if (class36.field534 && var30) {
                        class247.method1712(var31.field2118, var20, var22, var21);
                    }
                    var32 = var31.field2121;
                } else {
                    var32 = new class30(arg0, 22, arg5, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
                }
                class154.method1131(arg10, arg8, arg9, var19, var32, var28, var11.field1502);
                if (var11.field1514 == 1 && arg4 != null) {
                    arg4.method2204(-13763, arg9, arg8);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class310 var74;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var73 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg2 == 11 ? arg5 + 4 : arg5, arg3, 10);
                if (class36.field534 && var30) {
                    class247.method1712(var73.field2118, var20, var22, var21);
                }
                var74 = var73.field2121;
            } else {
                var74 = new class30(arg0, 10, arg2 == 11 ? arg5 + 4 : arg5, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            if (var74 != null) {
                boolean var75 = class196.method1425(arg10, arg8, arg9, var19, var12, var13, var74, 0, var28);
                if (var11.field1520 && var75 && arg3) {
                    int var76 = 15;
                    if (var74 instanceof class1) {
                        var76 = ((class1) var74).method29() / 4;
                        if (var76 > 30) {
                            var76 = 30;
                        }
                    }
                    for (int var77 = 0; var77 <= var12; var77++) {
                        for (int var78 = 0; var78 <= var13; var78++) {
                            if (var76 > class277.field4260[arg10][arg8 + var77][arg9 + var78]) {
                                class277.field4260[arg10][arg8 + var77][arg9 + var78] = (byte) var76;
                            }
                        }
                    }
                }
            }
            if (var11.field1514 != 0 && arg4 != null) {
                arg4.method2216(var12, var11.field1557, (byte) -125, var13, arg8, arg9);
            }
        } else if (arg2 >= 12) {
            class310 var72;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var71 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5, arg3, arg2);
                if (class36.field534 && var30) {
                    class247.method1712(var71.field2118, var20, var22, var21);
                }
                var72 = var71.field2121;
            } else {
                var72 = new class30(arg0, arg2, arg5, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class196.method1425(arg10, arg8, arg9, var19, 1, 1, var72, 0, var28);
            if (arg3 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg10 > 0) {
                class58.field868[arg10][arg8][arg9] = class147.method1098(class58.field868[arg10][arg8][arg9], 4);
            }
            if (var11.field1514 != 0 && arg4 != null) {
                arg4.method2216(var12, var11.field1557, (byte) -120, var13, arg8, arg9);
            }
        } else if (arg2 == 0) {
            class310 var70;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var69 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5, arg3, 0);
                if (class36.field534 && var30) {
                    class247.method1712(var69.field2118, var20, var22, var21);
                }
                var70 = var69.field2121;
            } else {
                var70 = new class30(arg0, 0, arg5, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class191.method1384(arg10, arg8, arg9, var19, var70, (class310) null, class236.field3615[arg5], 0, var28);
            if (arg3) {
                if (arg5 == 0) {
                    if (var11.field1520) {
                        class277.field4260[arg10][arg8][arg9] = 50;
                        class277.field4260[arg10][arg8][arg9 + 1] = 50;
                    }
                    if (var11.field1516) {
                        class58.field868[arg10][arg8][arg9] = class147.method1098(class58.field868[arg10][arg8][arg9], 1);
                    }
                } else if (arg5 == 1) {
                    if (var11.field1520) {
                        class277.field4260[arg10][arg8][arg9 + 1] = 50;
                        class277.field4260[arg10][arg8 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field1516) {
                        class58.field868[arg10][arg8][arg9 + 1] = class147.method1098(class58.field868[arg10][arg8][arg9 + 1], 2);
                    }
                } else if (arg5 == 2) {
                    if (var11.field1520) {
                        class277.field4260[arg10][arg8 + 1][arg9] = 50;
                        class277.field4260[arg10][arg8 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field1516) {
                        class58.field868[arg10][arg8 + 1][arg9] = class147.method1098(class58.field868[arg10][arg8 + 1][arg9], 1);
                    }
                } else if (arg5 == 3) {
                    if (var11.field1520) {
                        class277.field4260[arg10][arg8][arg9] = 50;
                        class277.field4260[arg10][arg8 + 1][arg9] = 50;
                    }
                    if (var11.field1516) {
                        class58.field868[arg10][arg8][arg9] = class147.method1098(class58.field868[arg10][arg8][arg9], 2);
                    }
                }
            }
            if (var11.field1514 != 0 && arg4 != null) {
                arg4.method2221(arg9, arg2, arg5, 2780, var11.field1557, arg8);
            }
            if (var11.field1556 != 16) {
                class188.method1362(arg10, arg8, arg9, var11.field1556);
            }
        } else if (arg2 == 1) {
            class310 var68;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var67 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5, arg3, 1);
                if (class36.field534 && var30) {
                    class247.method1712(var67.field2118, var20, var22, var21);
                }
                var68 = var67.field2121;
            } else {
                var68 = new class30(arg0, 1, arg5, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class191.method1384(arg10, arg8, arg9, var19, var68, (class310) null, class309.field4807[arg5], 0, var28);
            if (var11.field1520 && arg3) {
                if (arg5 == 0) {
                    class277.field4260[arg10][arg8][arg9 + 1] = 50;
                } else if (arg5 == 1) {
                    class277.field4260[arg10][arg8 + 1][arg9 + 1] = 50;
                } else if (arg5 == 2) {
                    class277.field4260[arg10][arg8 + 1][arg9] = 50;
                } else if (arg5 == 3) {
                    class277.field4260[arg10][arg8][arg9] = 50;
                }
            }
            if (var11.field1514 != 0 && arg4 != null) {
                arg4.method2221(arg9, arg2, arg5, 2780, var11.field1557, arg8);
            }
        } else if (arg2 == 2) {
            int var62 = arg5 + 1 & 0x3;
            class310 var64;
            class310 var66;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var63 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5 + 4, arg3, 2);
                if (class36.field534 && var30) {
                    class247.method1712(var63.field2118, var20, var22, var21);
                }
                var64 = var63.field2121;
                class136 var65 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, var62, arg3, 2);
                if (class36.field534 && var30) {
                    class247.method1712(var65.field2118, var20, var22, var21);
                }
                var66 = var65.field2121;
            } else {
                var64 = new class30(arg0, 2, arg5 + 4, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
                var66 = new class30(arg0, 2, var62, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class191.method1384(arg10, arg8, arg9, var19, var64, var66, class236.field3615[arg5], class236.field3615[var62], var28);
            if (var11.field1516 && arg3) {
                if (arg5 == 0) {
                    class58.field868[arg10][arg8][arg9] = class147.method1098(class58.field868[arg10][arg8][arg9], 1);
                    class58.field868[arg10][arg8][arg9 + 1] = class147.method1098(class58.field868[arg10][arg8][arg9 + 1], 2);
                } else if (arg5 == 1) {
                    class58.field868[arg10][arg8][arg9 + 1] = class147.method1098(class58.field868[arg10][arg8][arg9 + 1], 2);
                    class58.field868[arg10][arg8 + 1][arg9] = class147.method1098(class58.field868[arg10][arg8 + 1][arg9], 1);
                } else if (arg5 == 2) {
                    class58.field868[arg10][arg8 + 1][arg9] = class147.method1098(class58.field868[arg10][arg8 + 1][arg9], 1);
                    class58.field868[arg10][arg8][arg9] = class147.method1098(class58.field868[arg10][arg8][arg9], 2);
                } else if (arg5 == 3) {
                    class58.field868[arg10][arg8][arg9] = class147.method1098(class58.field868[arg10][arg8][arg9], 2);
                    class58.field868[arg10][arg8][arg9] = class147.method1098(class58.field868[arg10][arg8][arg9], 1);
                }
            }
            if (var11.field1514 != 0 && arg4 != null) {
                arg4.method2221(arg9, arg2, arg5, 2780, var11.field1557, arg8);
            }
            if (var11.field1556 != 16) {
                class188.method1362(arg10, arg8, arg9, var11.field1556);
            }
        } else if (arg2 == 3) {
            class310 var61;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var60 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5, arg3, 3);
                if (class36.field534 && var30) {
                    class247.method1712(var60.field2118, var20, var22, var21);
                }
                var61 = var60.field2121;
            } else {
                var61 = new class30(arg0, 3, arg5, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class191.method1384(arg10, arg8, arg9, var19, var61, (class310) null, class309.field4807[arg5], 0, var28);
            if (var11.field1520 && arg3) {
                if (arg5 == 0) {
                    class277.field4260[arg10][arg8][arg9 + 1] = 50;
                } else if (arg5 == 1) {
                    class277.field4260[arg10][arg8 + 1][arg9 + 1] = 50;
                } else if (arg5 == 2) {
                    class277.field4260[arg10][arg8 + 1][arg9] = 50;
                } else if (arg5 == 3) {
                    class277.field4260[arg10][arg8][arg9] = 50;
                }
            }
            if (var11.field1514 != 0 && arg4 != null) {
                arg4.method2221(arg9, arg2, arg5, 2780, var11.field1557, arg8);
            }
        } else if (arg2 == 9) {
            class310 var59;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var58 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5, arg3, arg2);
                if (class36.field534 && var30) {
                    class247.method1712(var58.field2118, var20, var22, var21);
                }
                var59 = var58.field2121;
            } else {
                var59 = new class30(arg0, arg2, arg5, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class196.method1425(arg10, arg8, arg9, var19, 1, 1, var59, 0, var28);
            if (var11.field1514 != 0 && arg4 != null) {
                arg4.method2216(var12, var11.field1557, (byte) -100, var13, arg8, arg9);
            }
            if (var11.field1556 != 16) {
                class188.method1362(arg10, arg8, arg9, var11.field1556);
            }
        } else if (arg2 == 4) {
            class310 var57;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var56 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5, arg3, 4);
                if (class36.field534 && var30) {
                    class247.method1712(var56.field2118, var20, var22, var21);
                }
                var57 = var56.field2121;
            } else {
                var57 = new class30(arg0, 4, arg5, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class277.method1946(arg10, arg8, arg9, var19, var57, (class310) null, class236.field3615[arg5], 0, 0, 0, var28);
        } else if (arg2 == 5) {
            long var51 = class222.method1585(arg10, arg8, arg9);
            int var53 = 16;
            if (var51 != 0L) {
                var53 = class281.method1984((int) (var51 >>> 32) & Integer.MAX_VALUE, false).field1556;
            }
            class310 var55;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var54 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5, arg3, 4);
                if (class36.field534 && var30) {
                    class247.method1712(var54.field2118, var20 - class222.field3477[arg5] * 8, var22, var21 - (class224.field3498[arg5] * 8));
                }
                var55 = var54.field2121;
            } else {
                var55 = new class30(arg0, 4, arg5, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class277.method1946(arg10, arg8, arg9, var19, var55, (class310) null, class236.field3615[arg5], 0, class222.field3477[arg5] * var53, class224.field3498[arg5] * var53, var28);
        } else if (arg2 == 6) {
            int var46 = 8;
            long var47 = class222.method1585(arg10, arg8, arg9);
            if (var47 != 0L) {
                var46 = class281.method1984(Integer.MAX_VALUE & (int) (var47 >>> 32), false).field1556 / 2;
            }
            class310 var50;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var49 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5 + 4, arg3, 4);
                if (class36.field534 && var30) {
                    class247.method1712(var49.field2118, var20 - (class244.field3683[arg5] * 8), var22, var21 - (class294.field4622[arg5] * 8));
                }
                var50 = var49.field2121;
            } else {
                var50 = new class30(arg0, 4, arg5 + 4, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class277.method1946(arg10, arg8, arg9, var19, var50, (class310) null, 256, arg5, class244.field3683[arg5] * var46, class294.field4622[arg5] * var46, var28);
        } else if (arg2 == 7) {
            int var43 = arg5 + 2 & 0x3;
            class310 var45;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                class136 var44 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, var43 + 4, arg3, 4);
                if (class36.field534 && var30) {
                    class247.method1712(var44.field2118, var20, var22, var21);
                }
                var45 = var44.field2121;
            } else {
                var45 = new class30(arg0, 4, var43 + 4, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class277.method1946(arg10, arg8, arg9, var19, var45, (class310) null, 256, var43, 0, 0, var28);
        } else if (arg2 == 8) {
            int var33 = 8;
            long var34 = class222.method1585(arg10, arg8, arg9);
            if (var34 != 0L) {
                var33 = class281.method1984(Integer.MAX_VALUE & (int) (var34 >>> 32), false).field1556 / 2;
            }
            int var36 = arg5 + 2 & 0x3;
            class310 var40;
            class310 var42;
            if (var11.field1565 == -1 && var11.field1542 == null && !var11.field1525) {
                int var37 = class294.field4622[arg5] * 8;
                int var38 = class244.field3683[arg5] * 8;
                class136 var39 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, arg5 + 4, arg3, 4);
                if (class36.field534 && var30) {
                    class247.method1712(var39.field2118, var20 - var38, var22, var21 - var37);
                }
                var40 = var39.field2121;
                class136 var41 = var11.method792(var18, var30, var19, (class70) null, var21, var24, var20, false, var36 + 4, arg3, 4);
                if (class36.field534 && var30) {
                    class247.method1712(var41.field2118, var20 - var38, var22, var21 - var37);
                }
                var42 = var41.field2121;
            } else {
                var40 = new class30(arg0, 4, arg5 + 4, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
                var42 = new class30(arg0, 4, var36 + 4, arg6, arg8, arg9, var11.field1565, var11.field1513, (class310) null);
            }
            class277.method1946(arg10, arg8, arg9, var19, var40, var42, 256, arg5, class244.field3683[arg5] * var33, class294.field4622[arg5] * var33, var28);
        }
    }
}
