import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 extends class32 {

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "[B")
    public byte[] field2525;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "Lv;")
    public static class146 field2520 = class159.method1226((byte) -37, "<img=0>");

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "[I")
    public static int[] field2522 = new int[5];

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "[I")
    public static int[] field2528 = new int[1000];

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "Lv;")
    private static class146 field2530 = class159.method1226((byte) -37, "You have only just left another world)3");

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "Z")
    public static boolean field2529 = false;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "Lv;")
    public static class146 field2521 = class159.method1226((byte) -37, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field2519 = 10;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Lv;")
    public static class146 field2531 = field2530;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Llc;")
    public static final class79 method852(int arg0, int arg1) {
        field2533++;
        class79 var2 = (class79) class98.field2369.method1045((long) arg1, 113);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field1302.method585(9, 92, arg1);
        class79 var4 = new class79();
        if (arg0 != 8975) {
            return null;
        }
        var4.field1927 = arg1;
        if (var3 != null) {
            var4.method606(new class95(var3), arg0 - 8995);
        }
        var4.method610(-124);
        class98.field2369.method1047(arg0 ^ 0xFFFFDCF0, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)Lwb;")
    public static final class155 method853(byte arg0, int arg1) {
        field2535++;
        if (arg0 < 90) {
            method854(null, null, true, null, null);
        }
        class155 var2 = (class155) class3.field68.method1045((long) arg1, 126);
        if (var2 != null) {
            return var2;
        }
        class155 var3 = class18.method108(false, 0, class75.field1780, class67.field1504, arg1);
        if (var3 != null) {
            class3.field68.method1047(-1, var3, (long) arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lla;Lv;ZLla;Lv;)Lmb;")
    public static final class85 method854(class77 arg0, class146 arg1, boolean arg2, class77 arg3, class146 arg4) {
        field2524++;
        int var5 = arg3.method593(55, arg4);
        if (!arg2) {
            method856(-28);
        }
        int var6 = arg3.method592(arg1, 92, var5);
        return class132.method988(arg3, arg0, var6, 5000, var5);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILwc;Lna;IIIIII)V")
    public static final void method855(int arg0, class156 arg1, class91 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2534++;
        if (class91.field2196 && (class74.field1772[0][arg0][arg4] & 0x2) == 0) {
            if ((class74.field1772[arg7][arg0][arg4] & 0x10) != 0) {
                return;
            }
            if (class46.method320(-122, arg0, arg7, arg4) != class9.field172) {
                return;
            }
        }
        if (arg7 < class157.field3612) {
            class157.field3612 = arg7;
        }
        class69 var9 = class124.method928(-1, arg5);
        int var10;
        int var11;
        if (arg6 == 1 || arg6 == 3) {
            var10 = var9.field1597;
            var11 = var9.field1584;
        } else {
            var10 = var9.field1584;
            var11 = var9.field1597;
        }
        int var12;
        int var13;
        if (arg0 + var10 <= 104) {
            var12 = arg0 + (var10 >> 1);
            var13 = arg0 + (var10 + 1 >> 1);
        } else {
            var12 = arg0;
            var13 = arg0 + 1;
        }
        int var14;
        int var15;
        if (arg4 + var11 > 104) {
            var14 = arg4 + 1;
            var15 = arg4;
        } else {
            var14 = arg4 + (var11 + 1 >> 1);
            var15 = arg4 + (var11 >> 1);
        }
        int[][] var16 = class78.field1891[arg7];
        int var17 = (arg0 << 7) + (var10 << 6);
        int var18 = var16[var12][var15] + var16[var12][var14] + var16[var13][var14] + var16[var13][var15] >> 2;
        int var19 = (arg4 << 7) + (var11 << 6);
        int var20 = (arg4 << 7) + arg0 + (arg5 << 14) + 1073741824;
        if (~var9.field1605 == arg3) {
            var20 += Integer.MIN_VALUE;
        }
        int var21 = (arg6 << 6) + arg8;
        if (var9.field1618 == 1) {
            var21 += 256;
        }
        if (var9.method490((byte) 124)) {
            class38.method257(arg3 ^ 0xFFFFF7EF, var9, arg0, arg6, arg7, arg4);
        }
        if (arg8 == 22) {
            if (!class91.field2196 || var9.field1605 != 0 || var9.field1589 == 1 || var9.field1613) {
                class66 var22;
                if (var9.field1567 == -1 && var9.field1598 == null) {
                    var22 = var9.method495(var19, var18, arg6, arg3 - 923173276, 22, var16, var17);
                } else {
                    var22 = new class138(arg5, 22, arg6, arg7, arg0, arg4, var9.field1567, true, null);
                }
                arg1.method1207(arg7, arg0, arg4, var18, var22, var20, var21);
                if (var9.field1589 == 1 && arg2 != null) {
                    arg2.method726(262144, arg4, arg0);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class66 var45;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var45 = var9.method495(var19, var18, arg6, arg3 - 923173276, 10, var16, var17);
            } else {
                var45 = new class138(arg5, 10, arg6, arg7, arg0, arg4, var9.field1567, true, null);
            }
            if (var45 != null && arg1.method1173(arg7, arg0, arg4, var18, var10, var11, var45, arg8 == 11 ? 256 : 0, var20, var21) && var9.field1590) {
                int var46 = 15;
                if (var45 instanceof class139) {
                    var46 = ((class139) var45).method1042() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (var46 > class100.field2423[arg7][arg0 + var47][arg4 + var48]) {
                            class100.field2423[arg7][arg0 + var47][arg4 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field1589 != 0 && arg2 != null) {
                arg2.method713(var10, var9.field1580, arg3 + 116, arg4, arg0, var11);
            }
        } else if (arg8 >= 12) {
            class66 var23;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var23 = var9.method495(var19, var18, arg6, arg3 - 923173276, arg8, var16, var17);
            } else {
                var23 = new class138(arg5, arg8, arg6, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1173(arg7, arg0, arg4, var18, 1, 1, var23, 0, var20, var21);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg7 > 0) {
                class34.field725[arg7][arg0][arg4] = class127.method943(class34.field725[arg7][arg0][arg4], 2340);
            }
            if (var9.field1589 != 0 && arg2 != null) {
                arg2.method713(var10, var9.field1580, 53, arg4, arg0, var11);
            }
        } else if (arg8 == 0) {
            class66 var24;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var24 = var9.method495(var19, var18, arg6, -923173277, 0, var16, var17);
            } else {
                var24 = new class138(arg5, 0, arg6, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1209(arg7, arg0, arg4, var18, var24, null, class82.field1995[arg6], 0, var20, var21);
            if (arg6 == 0) {
                if (var9.field1590) {
                    class100.field2423[arg7][arg0][arg4] = 50;
                    class100.field2423[arg7][arg0][arg4 + 1] = 50;
                }
                if (var9.field1596) {
                    class34.field725[arg7][arg0][arg4] = class127.method943(class34.field725[arg7][arg0][arg4], 585);
                }
            } else if (arg6 == 1) {
                if (var9.field1590) {
                    class100.field2423[arg7][arg0][arg4 + 1] = 50;
                    class100.field2423[arg7][arg0 + 1][arg4 + 1] = 50;
                }
                if (var9.field1596) {
                    class34.field725[arg7][arg0][arg4 + 1] = class127.method943(class34.field725[arg7][arg0][arg4 + 1], 1170);
                }
            } else if (arg6 == 2) {
                if (var9.field1590) {
                    class100.field2423[arg7][arg0 + 1][arg4] = 50;
                    class100.field2423[arg7][arg0 + 1][arg4 + 1] = 50;
                }
                if (var9.field1596) {
                    class34.field725[arg7][arg0 + 1][arg4] = class127.method943(class34.field725[arg7][arg0 + 1][arg4], 585);
                }
            } else if (arg6 == 3) {
                if (var9.field1590) {
                    class100.field2423[arg7][arg0][arg4] = 50;
                    class100.field2423[arg7][arg0 + 1][arg4] = 50;
                }
                if (var9.field1596) {
                    class34.field725[arg7][arg0][arg4] = class127.method943(class34.field725[arg7][arg0][arg4], 1170);
                }
            }
            if (var9.field1589 != 0 && arg2 != null) {
                arg2.method715(arg0, var9.field1580, arg4, arg3 + 22998, arg6, arg8);
            }
            if (var9.field1593 != 16) {
                arg1.method1166(arg7, arg0, arg4, var9.field1593);
            }
        } else if (arg8 == 1) {
            class66 var25;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var25 = var9.method495(var19, var18, arg6, -923173277, 1, var16, var17);
            } else {
                var25 = new class138(arg5, 1, arg6, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1209(arg7, arg0, arg4, var18, var25, null, class48.field1097[arg6], 0, var20, var21);
            if (var9.field1590) {
                if (arg6 == 0) {
                    class100.field2423[arg7][arg0][arg4 + 1] = 50;
                } else if (arg6 == 1) {
                    class100.field2423[arg7][arg0 + 1][arg4 + 1] = 50;
                } else if (arg6 == 2) {
                    class100.field2423[arg7][arg0 + 1][arg4] = 50;
                } else if (arg6 == 3) {
                    class100.field2423[arg7][arg0][arg4] = 50;
                }
            }
            if (var9.field1589 != 0 && arg2 != null) {
                arg2.method715(arg0, var9.field1580, arg4, 22997, arg6, arg8);
            }
        } else if (arg8 == 2) {
            int var26 = arg6 + 1 & 0x3;
            class66 var27;
            class66 var28;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var27 = var9.method495(var19, var18, arg6 + 4, arg3 + -923173276, 2, var16, var17);
                var28 = var9.method495(var19, var18, var26, -923173277, 2, var16, var17);
            } else {
                var27 = new class138(arg5, 2, arg6 + 4, arg7, arg0, arg4, var9.field1567, true, null);
                var28 = new class138(arg5, 2, var26, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1209(arg7, arg0, arg4, var18, var27, var28, class82.field1995[arg6], class82.field1995[var26], var20, var21);
            if (var9.field1596) {
                if (arg6 == 0) {
                    class34.field725[arg7][arg0][arg4] = class127.method943(class34.field725[arg7][arg0][arg4], 585);
                    class34.field725[arg7][arg0][arg4 + 1] = class127.method943(class34.field725[arg7][arg0][arg4 + 1], 1170);
                } else if (arg6 == 1) {
                    class34.field725[arg7][arg0][arg4 + 1] = class127.method943(class34.field725[arg7][arg0][arg4 + 1], 1170);
                    class34.field725[arg7][arg0 + 1][arg4] = class127.method943(class34.field725[arg7][arg0 + 1][arg4], 585);
                } else if (arg6 == 2) {
                    class34.field725[arg7][arg0 + 1][arg4] = class127.method943(class34.field725[arg7][arg0 + 1][arg4], 585);
                    class34.field725[arg7][arg0][arg4] = class127.method943(class34.field725[arg7][arg0][arg4], 1170);
                } else if (arg6 == 3) {
                    class34.field725[arg7][arg0][arg4] = class127.method943(class34.field725[arg7][arg0][arg4], 1170);
                    class34.field725[arg7][arg0][arg4] = class127.method943(class34.field725[arg7][arg0][arg4], 585);
                }
            }
            if (var9.field1589 != 0 && arg2 != null) {
                arg2.method715(arg0, var9.field1580, arg4, 22997, arg6, arg8);
            }
            if (var9.field1593 != 16) {
                arg1.method1166(arg7, arg0, arg4, var9.field1593);
            }
        } else if (arg8 == 3) {
            class66 var29;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var29 = var9.method495(var19, var18, arg6, -923173277, 3, var16, var17);
            } else {
                var29 = new class138(arg5, 3, arg6, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1209(arg7, arg0, arg4, var18, var29, null, class48.field1097[arg6], 0, var20, var21);
            if (var9.field1590) {
                if (arg6 == 0) {
                    class100.field2423[arg7][arg0][arg4 + 1] = 50;
                } else if (arg6 == 1) {
                    class100.field2423[arg7][arg0 + 1][arg4 + 1] = 50;
                } else if (arg6 == 2) {
                    class100.field2423[arg7][arg0 + 1][arg4] = 50;
                } else if (arg6 == 3) {
                    class100.field2423[arg7][arg0][arg4] = 50;
                }
            }
            if (var9.field1589 != 0 && arg2 != null) {
                arg2.method715(arg0, var9.field1580, arg4, 22997, arg6, arg8);
            }
        } else if (arg8 == 9) {
            class66 var30;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var30 = var9.method495(var19, var18, arg6, arg3 ^ 0x3706819C, arg8, var16, var17);
            } else {
                var30 = new class138(arg5, arg8, arg6, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1173(arg7, arg0, arg4, var18, 1, 1, var30, 0, var20, var21);
            if (var9.field1589 != 0 && arg2 != null) {
                arg2.method713(var10, var9.field1580, -116, arg4, arg0, var11);
            }
            if (var9.field1593 != 16) {
                arg1.method1166(arg7, arg0, arg4, var9.field1593);
            }
        } else if (arg8 == 4) {
            class66 var31;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var31 = var9.method495(var19, var18, arg6, -923173277, 4, var16, var17);
            } else {
                var31 = new class138(arg5, 4, arg6, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1183(arg7, arg0, arg4, var18, var31, null, class82.field1995[arg6], 0, 0, 0, var20, var21);
        } else if (arg8 == 5) {
            int var32 = 16;
            int var33 = arg1.method1168(arg7, arg0, arg4);
            if (var33 != 0) {
                var32 = class124.method928(-1, var33 >> 14 & 0x7FFF).field1593;
            }
            class66 var34;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var34 = var9.method495(var19, var18, arg6, -923173277, 4, var16, var17);
            } else {
                var34 = new class138(arg5, 4, arg6, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1183(arg7, arg0, arg4, var18, var34, null, class82.field1995[arg6], 0, class2.field43[arg6] * var32, class78.field1897[arg6] * var32, var20, var21);
        } else if (arg8 == 6) {
            int var35 = 8;
            int var36 = arg1.method1168(arg7, arg0, arg4);
            if (var36 != 0) {
                var35 = class124.method928(-1, var36 >> 14 & 0x7FFF).field1593 / 2;
            }
            class66 var37;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var37 = var9.method495(var19, var18, arg6 + 4, -923173277, 4, var16, var17);
            } else {
                var37 = new class138(arg5, 4, arg6 + 4, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1183(arg7, arg0, arg4, var18, var37, null, 256, arg6, class22.field369[arg6] * var35, class92.field2214[arg6] * var35, var20, var21);
        } else if (arg8 == 7) {
            int var38 = arg6 + 2 & 0x3;
            class66 var39;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var39 = var9.method495(var19, var18, var38 + 4, -923173277, 4, var16, var17);
            } else {
                var39 = new class138(arg5, 4, var38 + 4, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1183(arg7, arg0, arg4, var18, var39, null, 256, var38, 0, 0, var20, var21);
        } else if (arg8 == 8) {
            int var40 = 8;
            int var41 = arg1.method1168(arg7, arg0, arg4);
            if (var41 != 0) {
                var40 = class124.method928(arg3, var41 >> 14 & 0x7FFF).field1593 / 2;
            }
            int var42 = arg6 + 2 & 0x3;
            class66 var43;
            class66 var44;
            if (var9.field1567 == -1 && var9.field1598 == null) {
                var43 = var9.method495(var19, var18, arg6 + 4, -923173277, 4, var16, var17);
                var44 = var9.method495(var19, var18, var42 + 4, -923173277, 4, var16, var17);
            } else {
                var43 = new class138(arg5, 4, arg6 + 4, arg7, arg0, arg4, var9.field1567, true, null);
                var44 = new class138(arg5, 4, var42 + 4, arg7, arg0, arg4, var9.field1567, true, null);
            }
            arg1.method1183(arg7, arg0, arg4, var18, var43, var44, 256, arg6, class22.field369[arg6] * var40, class92.field2214[arg6] * var40, var20, var21);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "([B)V")
    public class105(byte[] arg0) {
        this.field2525 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    public static void method856(int arg0) {
        if (arg0 != 5) {
            return;
        }
        field2531 = null;
        field2520 = null;
        field2522 = null;
        field2521 = null;
        field2530 = null;
        field2528 = null;
    }
}
