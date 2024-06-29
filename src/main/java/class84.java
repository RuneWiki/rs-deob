import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class84 {

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Lid;")
    private class78 field1991 = new class78(256);

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Lid;")
    private class78 field1998 = new class78(256);

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Ljc;")
    private class85 field1989;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Ljc;")
    private class85 field1984;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Lgg;")
    public static class63 field1986 = class116.method911(43, "(U5");

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static volatile int field1990 = 0;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field1999 = 0;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lgg;")
    private static class63 field1992 = class116.method911(43, "scroll:");

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Lgg;")
    public static class63 field1997 = field1992;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[Lgg;")
    public static class63[] field2003 = new class63[500];

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Lgg;")
    private static class63 field2006 = class116.method911(43, "red:");

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lgg;")
    public static class63 field2001 = field1992;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lgg;")
    public static class63 field1994 = field2006;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lgg;")
    public static class63 field1995 = class116.method911(43, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lgg;")
    public static class63 field2005 = field2006;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "Lqd;")
    public static class148 field1993 = new class148();

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[I)Lnc;")
    private final class120 method736(int arg0, int arg1, int arg2, int[] arg3) {
        field2007++;
        int var5 = arg2 ^ ((arg0 & 0x10000FFF) << 4 | arg0 >>> 12);
        if (arg1 != -28222) {
            return null;
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class120 var9 = (class120) this.field1998.method694(arg1 ^ 0x3397, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class2 var10 = (class2) this.field1991.method694(arg1 + 4243, var7);
            if (var10 == null) {
                var10 = class2.method7(this.field1984, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field1991.method702((byte) 99, var10, var7);
            }
            class120 var11 = var10.method10(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method1172(-94);
                this.field1998.method702((byte) 99, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method737(int arg0) {
        field1997 = null;
        field1993 = null;
        field2003 = null;
        field1992 = null;
        field2006 = null;
        field1994 = null;
        field2001 = null;
        if (arg0 < 18) {
            method737(78);
        }
        field1995 = null;
        field1986 = null;
        field2005 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[II)Lnc;")
    public final class120 method738(int arg0, int[] arg1, int arg2) {
        if (arg2 > -119) {
            return null;
        }
        field2002++;
        if (this.field1984.method763(0) == 1) {
            return this.method736(0, -28222, arg0, arg1);
        } else if (this.field1984.method759(arg0, false) == 1) {
            return this.method736(arg0, -28222, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I[II)Lnc;")
    public final class120 method739(int arg0, int[] arg1, int arg2) {
        int var4 = 90 % ((arg2 + 1) / 47);
        field1996++;
        if (this.field1989.method763(0) == 1) {
            return this.method741(arg1, 98, arg0, 0);
        } else if (this.field1989.method759(arg0, false) == 1) {
            return this.method741(arg1, 88, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static final void method740(byte arg0) {
        field2004++;
        if (arg0 != -117) {
            field1992 = null;
        }
        if (class124.field2736 == 232) {
            int var1 = class167.field3437.method33(98);
            int var2 = class130.field2842 + (var1 >> 4 & 0x7);
            int var3 = (var1 & 0x7) + class18.field436;
            int var4 = class167.field3437.method40(2);
            int var5 = class167.field3437.method31((byte) -127);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class113 var6 = new class113();
                var6.field2544 = var4;
                var6.field2535 = var5;
                if (class163.field3365[class112.field2528][var2][var3] == null) {
                    class163.field3365[class112.field2528][var2][var3] = new class148();
                }
                class163.field3365[class112.field2528][var2][var3].method1034(0, var6);
                class52.method513(var3, var2, (byte) -126);
            }
            return;
        }
        if (class124.field2736 == 124) {
            int var7 = class167.field3437.method40(2);
            byte var8 = class167.field3437.method17(true);
            int var9 = class167.field3437.method46((byte) 65);
            int var10 = class167.field3437.method33(127);
            int var11 = var10 & 0x3;
            int var12 = var10 >> 2;
            int var13 = class80.field1940[var12];
            int var14 = class167.field3437.method69((byte) 52);
            int var15 = (var14 >> 4 & 0x7) + class130.field2842;
            int var16 = (var14 & 0x7) + class18.field436;
            byte var17 = class167.field3437.method17(true);
            byte var18 = class167.field3437.method73((byte) 29);
            byte var19 = class167.field3437.method39(true);
            int var20 = class167.field3437.method31((byte) -127);
            int var21 = class167.field3437.method36((byte) -71);
            class62 var22;
            if (class50.field1216 == var21) {
                var22 = class3.field72;
            } else {
                var22 = class33.field806[var21];
            }
            if (var22 != null) {
                class37 var23 = class167.method1133(true, var7);
                int var24;
                int var25;
                if (var11 == 1 || var11 == 3) {
                    var25 = var23.field893;
                    var24 = var23.field914;
                } else {
                    var24 = var23.field893;
                    var25 = var23.field914;
                }
                int var26 = (var25 + 1 >> 1) + var15;
                int var27 = var16 + (var24 + 1 >> 1);
                int var28 = (var15 << 7) + (var25 << 6);
                int var29 = var16 + (var24 >> 1);
                int var30 = (var16 << 7) + (var24 << 6);
                int var31 = (var25 >> 1) + var15;
                int[][] var32 = class81.field1948[class112.field2528];
                int var33 = var32[var26][var29] + var32[var31][var29] + var32[var31][var27] + var32[var26][var27] >> 2;
                class36 var34 = var23.method355(var30, var32, var12, var11, var28, var33, 61576003);
                if (var34 != null) {
                    if (var17 > var18) {
                        byte var35 = var17;
                        var17 = var18;
                        var18 = var35;
                    }
                    if (var8 > var19) {
                        byte var36 = var8;
                        var8 = var19;
                        var19 = var36;
                    }
                    class174.method1161(-123, 0, var13, var15, var20 + 1, class112.field2528, var16, -1, 0, var9 + 1);
                    var22.field1549 = var9 + class173.field3571;
                    var22.field1580 = var33;
                    var22.field1577 = var34;
                    var22.field1557 = class173.field3571 + var20;
                    var22.field1576 = var15 * 128 + var25 * 64;
                    var22.field1556 = var15 + var18;
                    var22.field1573 = var16 + var19;
                    var22.field1579 = var8 + var16;
                    var22.field1546 = var16 * 128 + var24 * 64;
                    var22.field1562 = var15 + var17;
                }
            }
        }
        if (class124.field2736 == 102) {
            int var37 = class167.field3437.method34(-857795632);
            int var38 = var37 >> 2;
            int var39 = var37 & 0x3;
            int var40 = class80.field1940[var38];
            int var41 = class167.field3437.method36((byte) -117);
            int var42 = class167.field3437.method33(89);
            int var43 = class130.field2842 + (var42 >> 4 & 0x7);
            int var44 = (var42 & 0x7) + class18.field436;
            if (var43 >= 0 && var44 >= 0 && var43 < 103 && var44 < 103) {
                if (var40 == 0) {
                    class116 var45 = class184.method1214(class112.field2528, var43, var44);
                    if (var45 != null) {
                        int var46 = (int) (var45.field2598 >>> 32) & Integer.MAX_VALUE;
                        if (var38 == 2) {
                            var45.field2603 = new class40(var46, 2, var39 + 4, class112.field2528, var43, var44, var41, false, var45.field2603);
                            var45.field2594 = new class40(var46, 2, var39 + 1 & 0x3, class112.field2528, var43, var44, var41, false, var45.field2594);
                        } else {
                            var45.field2603 = new class40(var46, var38, var39, class112.field2528, var43, var44, var41, false, var45.field2603);
                        }
                    }
                }
                if (var40 == 1) {
                    class109 var47 = class97.method832(class112.field2528, var43, var44);
                    if (var47 != null) {
                        int var48 = (int) (var47.field2449 >>> 32) & Integer.MAX_VALUE;
                        if (var38 == 4 || var38 == 5) {
                            var47.field2467 = new class40(var48, 4, var39, class112.field2528, var43, var44, var41, false, var47.field2467);
                        } else if (var38 == 6) {
                            var47.field2467 = new class40(var48, 4, var39 + 4, class112.field2528, var43, var44, var41, false, var47.field2467);
                        } else if (var38 == 7) {
                            var47.field2467 = new class40(var48, 4, (var39 + 2 & 0x3) + 4, class112.field2528, var43, var44, var41, false, var47.field2467);
                        } else if (var38 == 8) {
                            var47.field2467 = new class40(var48, 4, var39 + 4, class112.field2528, var43, var44, var41, false, var47.field2467);
                            var47.field2463 = new class40(var48, 4, (var39 + 2 & 0x3) + 4, class112.field2528, var43, var44, var41, false, var47.field2463);
                        }
                    }
                }
                if (var40 == 2) {
                    if (var38 == 11) {
                        var38 = 10;
                    }
                    class98 var49 = class121.method930(class112.field2528, var43, var44);
                    if (var49 != null) {
                        var49.field2316 = new class40((int) (var49.field2319 >>> 32) & Integer.MAX_VALUE, var38, var39, class112.field2528, var43, var44, var41, false, var49.field2316);
                    }
                }
                if (var40 == 3) {
                    class41 var50 = class24.method233(class112.field2528, var43, var44);
                    if (var50 != null) {
                        var50.field953 = new class40(Integer.MAX_VALUE & (int) (var50.field961 >>> 32), 22, var39, class112.field2528, var43, var44, var41, false, var50.field953);
                    }
                }
            }
        } else if (class124.field2736 == 229) {
            int var51 = class167.field3437.method34(-857795632);
            int var52 = (var51 >> 4 & 0x7) + class130.field2842;
            int var53 = (var51 & 0x7) + class18.field436;
            int var54 = class167.field3437.method36((byte) -61);
            int var55 = class167.field3437.method31((byte) -127);
            int var56 = class167.field3437.method36((byte) -76);
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && class50.field1216 != var56) {
                class113 var57 = new class113();
                var57.field2544 = var54;
                var57.field2535 = var55;
                if (class163.field3365[class112.field2528][var52][var53] == null) {
                    class163.field3365[class112.field2528][var52][var53] = new class148();
                }
                class163.field3365[class112.field2528][var52][var53].method1034(0, var57);
                class52.method513(var53, var52, (byte) -90);
            }
        } else if (class124.field2736 == 120) {
            int var58 = class167.field3437.method64(31790);
            int var59 = (var58 & 0x7) + class18.field436;
            int var60 = (var58 >> 4 & 0x7) + class130.field2842;
            int var61 = class167.field3437.method46((byte) 65);
            int var62 = class167.field3437.method64(31790);
            int var63 = class167.field3437.method46((byte) 65);
            if (var60 >= 0 && var59 >= 0 && var60 < 104 && var59 < 104) {
                int var64 = var60 * 128 + 64;
                int var65 = var59 * 128 + 64;
                class21 var66 = new class21(var61, class112.field2528, var64, var65, class112.method894(-123, class112.field2528, var64, var65) - var62, var63, class173.field3571);
                class37.field879.method1034(0, var66);
            }
        } else {
            if (class124.field2736 == 163) {
                int var67 = class167.field3437.method64(arg0 ^ 0xFFFF83A5);
                int var68 = (var67 >> 4 & 0x7) + class130.field2842;
                int var69 = (var67 & 0x7) + class18.field436;
                int var70 = class167.field3437.method46((byte) 65);
                int var71 = class167.field3437.method64(31790);
                int var72 = var71 >> 4 & 0xF;
                int var73 = var71 & 0x7;
                int var74 = class167.field3437.method64(31790);
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    int var75 = var72 + 1;
                    if (class3.field72.field1117[0] >= var68 - var75 && class3.field72.field1117[0] <= var68 + var75 && var69 - var75 <= class3.field72.field1164[0] && var69 + var75 >= class3.field72.field1164[0] && class110.field2471 != 0 && var73 > 0 && class161.field3317 < 50) {
                        class43.field1043[class161.field3317] = var70;
                        class21.field498[class161.field3317] = var73;
                        class10.field242[class161.field3317] = var74;
                        class126.field2778[class161.field3317] = null;
                        class136.field2948[class161.field3317] = (var68 << 16) + (var69 << 8) + var72;
                        class161.field3317++;
                    }
                }
            }
            if (class124.field2736 == 105) {
                int var76 = class167.field3437.method64(31790);
                int var77 = (var76 >> 4 & 0x7) + class130.field2842;
                int var78 = (var76 & 0x7) + class18.field436;
                int var79 = class167.field3437.method36((byte) -46);
                if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                    class148 var80 = class163.field3365[class112.field2528][var77][var78];
                    if (var80 != null) {
                        for (class113 var81 = (class113) var80.method1033(0); var81 != null; var81 = (class113) var80.method1035(arg0 ^ 0xFFFFFF8B)) {
                            if ((var79 & 0x7FFF) == var81.field2544) {
                                var81.method1172(-20);
                                break;
                            }
                        }
                        if (var80.method1033(0) == null) {
                            class163.field3365[class112.field2528][var77][var78] = null;
                        }
                        class52.method513(var78, var77, (byte) -93);
                    }
                }
            } else if (class124.field2736 == 28) {
                int var82 = class167.field3437.method64(31790);
                int var83 = (var82 >> 4 & 0x7) + class130.field2842;
                int var84 = (var82 & 0x7) + class18.field436;
                int var85 = class167.field3437.method46((byte) 65);
                int var86 = class167.field3437.method46((byte) 65);
                int var87 = class167.field3437.method46((byte) 65);
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    class148 var88 = class163.field3365[class112.field2528][var83][var84];
                    if (var88 != null) {
                        for (class113 var89 = (class113) var88.method1033(0); var89 != null; var89 = (class113) var88.method1035(0)) {
                            if ((var85 & 0x7FFF) == var89.field2544 && var89.field2535 == var86) {
                                var89.field2535 = var87;
                                break;
                            }
                        }
                        class52.method513(var84, var83, (byte) -122);
                    }
                }
            } else if (class124.field2736 == 26) {
                int var90 = class167.field3437.method69((byte) 52);
                int var91 = var90 >> 2;
                int var92 = class80.field1940[var91];
                int var93 = var90 & 0x3;
                int var94 = class167.field3437.method36((byte) -60);
                int var95 = class167.field3437.method34(arg0 ^ 0x3320EC5B);
                int var96 = (var95 & 0x7) + class18.field436;
                int var97 = (var95 >> 4 & 0x7) + class130.field2842;
                if (var97 >= 0 && var96 >= 0 && var97 < 104 && var96 < 104) {
                    class174.method1161(-117, var91, var92, var97, 0, class112.field2528, var96, var94, var93, -1);
                }
            } else if (class124.field2736 == 37) {
                int var98 = class167.field3437.method64(arg0 ^ 0xFFFF83A5);
                int var99 = (var98 >> 4 & 0x7) + class130.field2842;
                int var100 = (var98 & 0x7) + class18.field436;
                int var101 = var99 + class167.field3437.method73((byte) 29);
                int var102 = var100 + class167.field3437.method73((byte) 29);
                int var103 = class167.field3437.method25(0);
                int var104 = class167.field3437.method46((byte) 65);
                int var105 = class167.field3437.method64(31790) * 4;
                int var106 = class167.field3437.method64(31790) * 4;
                int var107 = class167.field3437.method46((byte) 65);
                int var108 = class167.field3437.method46((byte) 65);
                int var109 = class167.field3437.method64(31790);
                int var110 = class167.field3437.method64(31790);
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104 && var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104 && var104 != 65535) {
                    int var111 = var102 * 128 + 64;
                    int var112 = var100 * 128 + 64;
                    int var113 = var99 * 128 + 64;
                    class203 var114 = new class203(var104, class112.field2528, var113, var112, class112.method894(-106, class112.field2528, var113, var112) - var105, class173.field3571 + var107, class173.field3571 + var108, var109, var110, var103, var106);
                    int var115 = var101 * 128 + 64;
                    var114.method1346(class112.method894(arg0 ^ 0x1A, class112.field2528, var115, var111) - var106, var111, var115, (byte) -127, class173.field3571 + var107);
                    class109.field2450.method1034(0, var114);
                }
            } else if (class124.field2736 == 165) {
                int var116 = class167.field3437.method64(31790);
                int var117 = (var116 >> 4 & 0x7) + class130.field2842;
                int var118 = (var116 & 0x7) + class18.field436;
                int var119 = class167.field3437.method64(arg0 + 31907);
                int var120 = var119 >> 2;
                int var121 = var119 & 0x3;
                int var122 = class80.field1940[var120];
                if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                    class174.method1161(arg0 ^ 0x1C, var120, var122, var117, 0, class112.field2528, var118, -1, var121, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIII)Lnc;")
    private final class120 method741(int[] arg0, int arg1, int arg2, int arg3) {
        field1985++;
        int var5 = (arg3 << 4 & 0xFFF5 | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class120 var9 = (class120) this.field1998.method694(-23979, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class82 var10 = class82.method731(this.field1989, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class120 var11 = var10.method729();
            this.field1998.method702((byte) 84, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field2656.length;
            }
            if (arg1 <= 78) {
                field2005 = null;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ljc;Ljc;)V")
    public class84(class85 arg0, class85 arg1) {
        this.field1989 = arg0;
        this.field1984 = arg1;
    }
}
