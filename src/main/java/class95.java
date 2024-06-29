import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class95 extends class297 {

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "Lsa;")
    public static class118 field1525 = new class118(0, 0);

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "F")
    public static float field1536;

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    private int field1527;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    private int field1533;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)[[I", line = 11)
    public final int[][] method172(int arg0, byte arg1) {
        int[][] var3 = this.field4767.method1141(arg1 ^ 0xFFFFF94C, arg0);
        if (arg1 != 63) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field4767.field2480) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; var7 < class31.field491; var7++) {
                var4[var7] = this.field1527;
                var6[var7] = this.field1534;
                var5[var7] = this.field1533;
            }
        }
        field1531++;
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILaj;)V", line = 55)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.method773(123, arg2.method4(true));
        }
        field1529++;
        if (arg1 != 255) {
            this.method169(-85, -108, (class1) null);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V", line = 76)
    private class95(int arg0) {
        super(0, false);
        this.method773(125, arg0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V", line = 85)
    private final void method773(int arg0, int arg1) {
        this.field1527 = (arg1 & 0xFF0000) >> 12;
        if (arg0 <= 118) {
            this.field1534 = 118;
        }
        this.field1534 = (arg1 & 0xFF00) >> 4;
        field1528++;
        this.field1533 = (arg1 & 0xFF) << 4;
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V", line = 99)
    public static void method774(int arg0) {
        if (arg0 > -88) {
            field1537 = -73;
        }
        field1525 = null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 109)
    public class95() {
        this(0);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BIII)I", line = 124)
    public static final int method775(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = 92 % ((-arg0 - 24) / 58);
        field1530++;
        if (arg1 == arg2) {
            return arg2;
        } else {
            int var5 = 128 - arg3;
            int var6 = (arg1 & 0xFF00FF) * arg3 + (arg2 & 0xFF00FF) * var5 & 0xFF00FF00;
            int var7 = ((arg1 & 0xFF00FF00) >>> 7) * arg3 + (arg2 >>> 7 & 0x1FE01FE) * var5 & 0xFF00FF00;
            return (var6 >> 7) + var7;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIZILmf;ZIII)V", line = 146)
    public static final void method776(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class53 arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field1526++;
        if (arg7 && !class53.method450(2) && (class332.field5184[0][arg9][arg10] & 0x2) == 0) {
            if ((class332.field5184[arg5][arg9][arg10] & 0x10) != 0) {
                return;
            }
            if (class82.method646(-120, arg5, arg10, arg9) != class310.field4900) {
                return;
            }
        }
        if (arg5 < class116.field1885) {
            class116.field1885 = arg5;
        }
        class101 var11 = class288.method2025(arg0, -1);
        if (class162.field2623 && var11.field1638) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var13 = var11.field1623;
            var12 = var11.field1626;
        } else {
            var12 = var11.field1623;
            var13 = var11.field1626;
        }
        int var14;
        int var15;
        if (arg9 + var13 <= 104) {
            var14 = arg9 + (var13 >> 1);
            var15 = (var13 + 1 >> 1) + arg9;
        } else {
            var14 = arg9;
            var15 = arg9 + 1;
        }
        int var16;
        int var17;
        if (arg10 + var12 <= 104) {
            var16 = (var12 + 1 >> 1) + arg10;
            var17 = (var12 >> 1) + arg10;
        } else {
            var17 = arg10;
            var16 = arg10 + 1;
        }
        int[][] var18 = class85.field1374[arg3];
        int var19 = var18[var14][var16] + var18[var14][var17] + var18[var15][var17] + var18[var15][var16] >> 2;
        int var20 = (arg9 << 7) + (var13 << 6);
        if (arg2 < 114) {
            method775((byte) -108, 4, -86, 126);
        }
        int var21 = 0;
        int var22 = (arg10 << 7) + (var12 << 6);
        if (class162.field2623 && arg3 != 0) {
            int[][] var23 = class85.field1374[0];
            var21 = var19 - (var23[var14][var17] + var23[var15][var17] + var23[var15][var16] + var23[var14][var16] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg4) {
            var24 = class9.field220[0];
        } else if (arg3 < 3) {
            var24 = class85.field1374[arg3 + 1];
        }
        long var25 = (long) (arg1 << 20 | arg8 << 14 | arg10 << 7 | arg9 | 0x40000000);
        if (var11.field1598 == 0 || arg4) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field1635 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field1640) {
            var25 |= 0x80000000L;
        }
        if (var11.method826(3177)) {
            class158.method1167(arg10, arg1, (class86) null, (class92) null, var11, 94, arg9, arg5);
        }
        long var27 = var25 | (long) arg0 << 32;
        boolean var29 = !arg4 & var11.field1637;
        if (arg8 == 22) {
            if (class90.field1436 || var11.field1598 != 0 || var11.field1624 == 1 || var11.field1607) {
                class179 var31;
                if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                    class102 var30 = var11.method822(arg7, (class186) null, var19, 22, arg1, var24, var22, false, var29, var20, var18);
                    if (class162.field2623 && var29) {
                        class295.method2086(var30.field1685, var20, var21, var22);
                    }
                    var31 = var30.field1683;
                } else {
                    var31 = new class155(arg0, 22, arg1, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
                }
                class344.method2391(arg5, arg9, arg10, var19, var31, var27, var11.field1675);
                if (var11.field1624 == 1 && arg6 != null) {
                    arg6.method443(arg10, (byte) -119, arg9);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class179 var73;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var72 = var11.method822(arg7, (class186) null, var19, 10, arg8 == 11 ? arg1 + 4 : arg1, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var72.field1685, var20, var21, var22);
                }
                var73 = var72.field1683;
            } else {
                var73 = new class155(arg0, 10, arg8 == 11 ? arg1 + 4 : arg1, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            if (var73 != null) {
                boolean var74 = class133.method1027(arg5, arg9, arg10, var19, var13, var12, var73, 0, var27);
                if (var11.field1631 && var74 && arg7) {
                    int var75 = 15;
                    if (var73 instanceof class94) {
                        var75 = ((class94) var73).method753() / 4;
                        if (var75 > 30) {
                            var75 = 30;
                        }
                    }
                    for (int var76 = 0; var76 <= var13; var76++) {
                        for (int var77 = 0; var77 <= var12; var77++) {
                            if (var75 > class253.field3745[arg5][arg9 + var76][arg10 + var77]) {
                                class253.field3745[arg5][arg9 + var76][arg10 + var77] = (byte) var75;
                            }
                        }
                    }
                }
            }
            if (var11.field1624 != 0 && arg6 != null) {
                arg6.method435(var12, arg9, (byte) -75, var11.field1660, arg10, var13, !var11.field1658);
            }
        } else if (arg8 >= 12) {
            class179 var71;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var70 = var11.method822(arg7, (class186) null, var19, arg8, arg1, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var70.field1685, var20, var21, var22);
                }
                var71 = var70.field1683;
            } else {
                var71 = new class155(arg0, arg8, arg1, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class133.method1027(arg5, arg9, arg10, var19, 1, 1, var71, 0, var27);
            if (arg7 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg5 > 0 && var11.field1641 != 0) {
                class258.field3829[arg5][arg9][arg10] = class251.method1740(class258.field3829[arg5][arg9][arg10], 4);
            }
            if (var11.field1624 != 0 && arg6 != null) {
                arg6.method435(var12, arg9, (byte) -75, var11.field1660, arg10, var13, !var11.field1658);
            }
        } else if (arg8 == 0) {
            class179 var33;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var32 = var11.method822(arg7, (class186) null, var19, 0, arg1, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var32.field1685, var20, var21, var22);
                }
                var33 = var32.field1683;
            } else {
                var33 = new class155(arg0, 0, arg1, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class161.method1187(arg5, arg9, arg10, var19, var33, (class179) null, class117.field1904[arg1], 0, var27);
            if (arg7) {
                if (arg1 == 0) {
                    if (var11.field1631) {
                        class253.field3745[arg5][arg9][arg10] = 50;
                        class253.field3745[arg5][arg9][arg10 + 1] = 50;
                    }
                    if (var11.field1641 == 1) {
                        class258.field3829[arg5][arg9][arg10] = class251.method1740(class258.field3829[arg5][arg9][arg10], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field1631) {
                        class253.field3745[arg5][arg9][arg10 + 1] = 50;
                        class253.field3745[arg5][arg9 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field1641 == 1) {
                        class258.field3829[arg5][arg9][arg10 + 1] = class251.method1740(class258.field3829[arg5][arg9][arg10 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field1631) {
                        class253.field3745[arg5][arg9 + 1][arg10] = 50;
                        class253.field3745[arg5][arg9 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field1641 == 1) {
                        class258.field3829[arg5][arg9 + 1][arg10] = class251.method1740(class258.field3829[arg5][arg9 + 1][arg10], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field1631) {
                        class253.field3745[arg5][arg9][arg10] = 50;
                        class253.field3745[arg5][arg9 + 1][arg10] = 50;
                    }
                    if (var11.field1641 == 1) {
                        class258.field3829[arg5][arg9][arg10] = class251.method1740(class258.field3829[arg5][arg9][arg10], 2);
                    }
                }
            }
            if (var11.field1624 != 0 && arg6 != null) {
                arg6.method445(arg8, arg10, arg1, var11.field1660, !var11.field1658, (byte) 103, arg9);
            }
            if (var11.field1669 != 16) {
                class216.method1566(arg5, arg9, arg10, var11.field1669);
            }
        } else if (arg8 == 1) {
            class179 var69;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var68 = var11.method822(arg7, (class186) null, var19, 1, arg1, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var68.field1685, var20, var21, var22);
                }
                var69 = var68.field1683;
            } else {
                var69 = new class155(arg0, 1, arg1, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class161.method1187(arg5, arg9, arg10, var19, var69, (class179) null, class111.field1795[arg1], 0, var27);
            if (var11.field1631 && arg7) {
                if (arg1 == 0) {
                    class253.field3745[arg5][arg9][arg10 + 1] = 50;
                } else if (arg1 == 1) {
                    class253.field3745[arg5][arg9 + 1][arg10 + 1] = 50;
                } else if (arg1 == 2) {
                    class253.field3745[arg5][arg9 + 1][arg10] = 50;
                } else if (arg1 == 3) {
                    class253.field3745[arg5][arg9][arg10] = 50;
                }
            }
            if (var11.field1624 != 0 && arg6 != null) {
                arg6.method445(arg8, arg10, arg1, var11.field1660, !var11.field1658, (byte) 98, arg9);
            }
        } else if (arg8 == 2) {
            int var63 = arg1 + 1 & 0x3;
            class179 var65;
            class179 var67;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var64 = var11.method822(arg7, (class186) null, var19, 2, arg1 + 4, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var64.field1685, var20, var21, var22);
                }
                var65 = var64.field1683;
                class102 var66 = var11.method822(arg7, (class186) null, var19, 2, var63, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var66.field1685, var20, var21, var22);
                }
                var67 = var66.field1683;
            } else {
                var65 = new class155(arg0, 2, arg1 + 4, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
                var67 = new class155(arg0, 2, var63, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class161.method1187(arg5, arg9, arg10, var19, var65, var67, class117.field1904[arg1], class117.field1904[var63], var27);
            if (var11.field1641 == 1 && arg7) {
                if (arg1 == 0) {
                    class258.field3829[arg5][arg9][arg10] = class251.method1740(class258.field3829[arg5][arg9][arg10], 1);
                    class258.field3829[arg5][arg9][arg10 + 1] = class251.method1740(class258.field3829[arg5][arg9][arg10 + 1], 2);
                } else if (arg1 == 1) {
                    class258.field3829[arg5][arg9][arg10 + 1] = class251.method1740(class258.field3829[arg5][arg9][arg10 + 1], 2);
                    class258.field3829[arg5][arg9 + 1][arg10] = class251.method1740(class258.field3829[arg5][arg9 + 1][arg10], 1);
                } else if (arg1 == 2) {
                    class258.field3829[arg5][arg9 + 1][arg10] = class251.method1740(class258.field3829[arg5][arg9 + 1][arg10], 1);
                    class258.field3829[arg5][arg9][arg10] = class251.method1740(class258.field3829[arg5][arg9][arg10], 2);
                } else if (arg1 == 3) {
                    class258.field3829[arg5][arg9][arg10] = class251.method1740(class258.field3829[arg5][arg9][arg10], 2);
                    class258.field3829[arg5][arg9][arg10] = class251.method1740(class258.field3829[arg5][arg9][arg10], 1);
                }
            }
            if (var11.field1624 != 0 && arg6 != null) {
                arg6.method445(arg8, arg10, arg1, var11.field1660, !var11.field1658, (byte) 117, arg9);
            }
            if (var11.field1669 != 16) {
                class216.method1566(arg5, arg9, arg10, var11.field1669);
            }
        } else if (arg8 == 3) {
            class179 var35;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var34 = var11.method822(arg7, (class186) null, var19, 3, arg1, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var34.field1685, var20, var21, var22);
                }
                var35 = var34.field1683;
            } else {
                var35 = new class155(arg0, 3, arg1, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class161.method1187(arg5, arg9, arg10, var19, var35, (class179) null, class111.field1795[arg1], 0, var27);
            if (var11.field1631 && arg7) {
                if (arg1 == 0) {
                    class253.field3745[arg5][arg9][arg10 + 1] = 50;
                } else if (arg1 == 1) {
                    class253.field3745[arg5][arg9 + 1][arg10 + 1] = 50;
                } else if (arg1 == 2) {
                    class253.field3745[arg5][arg9 + 1][arg10] = 50;
                } else if (arg1 == 3) {
                    class253.field3745[arg5][arg9][arg10] = 50;
                }
            }
            if (var11.field1624 != 0 && arg6 != null) {
                arg6.method445(arg8, arg10, arg1, var11.field1660, !var11.field1658, (byte) 127, arg9);
            }
        } else if (arg8 == 9) {
            class179 var37;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var36 = var11.method822(arg7, (class186) null, var19, arg8, arg1, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var36.field1685, var20, var21, var22);
                }
                var37 = var36.field1683;
            } else {
                var37 = new class155(arg0, arg8, arg1, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class133.method1027(arg5, arg9, arg10, var19, 1, 1, var37, 0, var27);
            if (var11.field1624 != 0 && arg6 != null) {
                arg6.method435(var12, arg9, (byte) -75, var11.field1660, arg10, var13, !var11.field1658);
            }
            if (var11.field1669 != 16) {
                class216.method1566(arg5, arg9, arg10, var11.field1669);
            }
        } else if (arg8 == 4) {
            class179 var39;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var38 = var11.method822(arg7, (class186) null, var19, 4, arg1, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var38.field1685, var20, var21, var22);
                }
                var39 = var38.field1683;
            } else {
                var39 = new class155(arg0, 4, arg1, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class6.method101(arg5, arg9, arg10, var19, var39, (class179) null, class117.field1904[arg1], 0, 0, 0, var27);
        } else if (arg8 == 5) {
            int var40 = 16;
            long var41 = class55.method470(arg5, arg9, arg10);
            if (var41 != 0L) {
                var40 = class288.method2025((int) (var41 >>> 32) & Integer.MAX_VALUE, -1).field1669;
            }
            class179 var44;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var43 = var11.method822(arg7, (class186) null, var19, 4, arg1, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var43.field1685, var20 - (class339.field5238[arg1] * 8), var21, var22 - class89.field1433[arg1] * 8);
                }
                var44 = var43.field1683;
            } else {
                var44 = new class155(arg0, 4, arg1, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class6.method101(arg5, arg9, arg10, var19, var44, (class179) null, class117.field1904[arg1], 0, class339.field5238[arg1] * var40, class89.field1433[arg1] * var40, var27);
        } else if (arg8 == 6) {
            int var58 = 8;
            long var59 = class55.method470(arg5, arg9, arg10);
            if (var59 != 0L) {
                var58 = class288.method2025((int) (var59 >>> 32) & Integer.MAX_VALUE, -1).field1669 / 2;
            }
            class179 var62;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var61 = var11.method822(arg7, (class186) null, var19, 4, arg1 + 4, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var61.field1685, var20 - class229.field3525[arg1] * 8, var21, var22 - (class296.field4739[arg1] * 8));
                }
                var62 = var61.field1683;
            } else {
                var62 = new class155(arg0, 4, arg1 + 4, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class6.method101(arg5, arg9, arg10, var19, var62, (class179) null, 256, arg1, class229.field3525[arg1] * var58, class296.field4739[arg1] * var58, var27);
        } else if (arg8 == 7) {
            int var55 = arg1 + 2 & 0x3;
            class179 var57;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                class102 var56 = var11.method822(arg7, (class186) null, var19, 4, var55 + 4, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var56.field1685, var20, var21, var22);
                }
                var57 = var56.field1683;
            } else {
                var57 = new class155(arg0, 4, var55 + 4, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class6.method101(arg5, arg9, arg10, var19, var57, (class179) null, 256, var55, 0, 0, var27);
        } else if (arg8 == 8) {
            int var45 = 8;
            long var46 = class55.method470(arg5, arg9, arg10);
            int var48 = arg1 + 2 & 0x3;
            if (var46 != 0L) {
                var45 = class288.method2025(Integer.MAX_VALUE & (int) (var46 >>> 32), -1).field1669 / 2;
            }
            class179 var52;
            class179 var54;
            if (var11.field1671 == -1 && var11.field1672 == null && var11.field1653 == null && !var11.field1673) {
                int var49 = class296.field4739[arg1] * 8;
                int var50 = class229.field3525[arg1] * 8;
                class102 var51 = var11.method822(arg7, (class186) null, var19, 4, arg1 + 4, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var51.field1685, var20 - var50, var21, var22 - var49);
                }
                var52 = var51.field1683;
                class102 var53 = var11.method822(arg7, (class186) null, var19, 4, var48 + 4, var24, var22, false, var29, var20, var18);
                if (class162.field2623 && var29) {
                    class295.method2086(var53.field1685, var20 - var50, var21, var22 - var49);
                }
                var54 = var53.field1683;
            } else {
                var52 = new class155(arg0, 4, arg1 + 4, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
                var54 = new class155(arg0, 4, var48 + 4, arg3, arg9, arg10, -1, var11.field1605, (class179) null);
            }
            class6.method101(arg5, arg9, arg10, var19, var52, var54, 256, arg1, class229.field3525[arg1] * var45, class296.field4739[arg1] * var45, var27);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(ZI)I", line = 802)
    public static final int method777(boolean arg0, int arg1) {
        field1532++;
        if (!arg0) {
            field1525 = (class118) null;
        }
        return arg1 == 16711935 ? -1 : class135.method1038(true, arg1);
    }
}
