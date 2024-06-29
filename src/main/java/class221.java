import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class221 extends class259 {

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public int field3220;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[I")
    public static int[] field3217 = new int[1000];

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field3219 = new String[500];

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3221 = null;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "[Z")
    public static boolean[] field3226 = new boolean[100];

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Lfc;")
    public static class104 field3225;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lca;")
    public static class122 field3222;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)[Llf;")
    public static final class94[] method1537(byte arg0) {
        field3223++;
        if (arg0 != -40) {
            field3225 = null;
        }
        class94[] var1 = new class94[class223.field3270];
        for (int var2 = 0; var2 < class223.field3270; var2++) {
            int var3 = class283.field4559[var2] * class165.field2534[var2];
            byte[] var4 = class280.field4506[var2];
            if (class121.field1994[var2]) {
                byte[] var5 = class124.field2074[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class200.method1408(class301.method2056(var5[var7] << 24, -16777216), class53.field748[class301.method2056(255, var4[var7])]);
                }
                var1[var2] = new class116(class250.field3792, class19.field202, class32.field399[var2], class297.field4765[var2], class165.field2534[var2], class283.field4559[var2], var6);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class53.field748[class301.method2056(var4[var9], 255)];
                }
                var1[var2] = new class148(class250.field3792, class19.field202, class32.field399[var2], class297.field4765[var2], class165.field2534[var2], class283.field4559[var2], var8);
            }
        }
        class137.method1032(-110);
        return var1;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)Lde;")
    public static final class214 method1538(int arg0, int arg1, int arg2) {
        class313 var3 = class223.field3286[arg0][arg1][arg2];
        return var3 == null || var3.field5027 == null ? null : var3.field5027;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public static void method1539(byte arg0) {
        field3221 = null;
        field3226 = null;
        field3219 = null;
        field3222 = null;
        field3225 = null;
        if (arg0 >= 87) {
            field3217 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZILii;ZIIIIII)V")
    public static final void method1540(int arg0, boolean arg1, int arg2, class228 arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3224++;
        if (arg4 && !class273.method1903(100) && (class253.field3806[0][arg5][arg8] & 0x2) == 0) {
            if ((class253.field3806[arg2][arg5][arg8] & 0x10) != 0) {
                return;
            }
            if (class170.method1209(20, arg8, arg5, arg2) != class280.field4510) {
                return;
            }
        }
        if (class259.field4005 > arg2) {
            class259.field4005 = arg2;
        }
        class93 var11 = class48.method297(false, arg7);
        int var12;
        int var13;
        if (arg10 == 1 || arg10 == 3) {
            var12 = var11.field1544;
            var13 = var11.field1557;
        } else {
            var12 = var11.field1557;
            var13 = var11.field1544;
        }
        int var14;
        int var15;
        if ((arg5 + var13) > 104) {
            var14 = arg5 + 1;
            var15 = arg5;
        } else {
            var14 = (var13 + 1 >> 1) + arg5;
            var15 = (var13 >> 1) + arg5;
        }
        int[][] var16 = class103.field1792[arg6];
        int var17 = (arg5 << 7) + (var13 << 6);
        int var18;
        int var19;
        if (arg8 + var12 <= 104) {
            var18 = (var12 + 1 >> 1) + arg8;
            var19 = arg8 + (var12 >> 1);
        } else {
            var19 = arg8;
            var18 = arg8 + 1;
        }
        int var20 = var16[var14][var19] + var16[var15][var19] - (-var16[var15][var18] - var16[var14][var18]) >> 2;
        if (arg9 != 5023) {
            return;
        }
        int var21 = (arg8 << 7) + (var12 << 6);
        long var22 = (long) (arg8 << 7 | arg5 | arg0 << 14 | arg10 << 20 | 0x40000000);
        int[][] var24 = null;
        if (var11.field1540 == 0 || arg1) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field1506 == 1) {
            var22 |= 0x400000L;
        }
        if (arg1) {
            var24 = class297.field4763[0];
        } else if (arg6 < 3) {
            var24 = class103.field1792[arg6 + 1];
        }
        if (var11.field1565) {
            var22 |= 0x80000000L;
        }
        if (var11.method715((byte) 108)) {
            class203.method1439(var11, arg10, arg8, (byte) 123, (class207) null, (class12) null, arg2, arg5);
        }
        boolean var25 = !arg1 & var11.field1515;
        long var26 = var22 | (long) arg7 << 32;
        if (arg0 == 22) {
            if (class225.field3308 || var11.field1540 != 0 || var11.field1574 == 1 || var11.field1497) {
                class4 var29;
                if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                    class230 var28 = var11.method709((class176) null, 22, var24, var20, (byte) 126, arg10, arg4, var25, var21, var17, var16);
                    var29 = var28.field3378;
                } else {
                    var29 = new class222(arg7, 22, arg10, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
                }
                class255.method1751(arg2, arg5, arg8, var20, var29, var26, var11.field1531);
                if (var11.field1574 == 1 && arg3 != null) {
                    arg3.method1590(true, arg5, arg8);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class4 var69;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var68 = var11.method709((class176) null, 10, var24, var20, (byte) -94, arg0 == 11 ? arg10 + 4 : arg10, arg4, var25, var21, var17, var16);
                var69 = var68.field3378;
            } else {
                var69 = new class222(arg7, 10, arg0 == 11 ? arg10 + 4 : arg10, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            if (var69 != null) {
                boolean var70 = class82.method618(arg2, arg5, arg8, var20, var13, var12, var69, 0, var26);
                if (var11.field1552 && var70 && arg4) {
                    int var71 = 15;
                    if (var69 instanceof class58) {
                        var71 = ((class58) var69).method414() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var13; var72++) {
                        for (int var73 = 0; var73 <= var12; var73++) {
                            if (var71 > class192.field2847[arg2][arg5 + var72][arg8 + var73]) {
                                class192.field2847[arg2][arg5 + var72][arg8 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field1574 != 0 && arg3 != null) {
                arg3.method1581(var11.field1538, (byte) 118, var13, arg5, arg8, var12, !var11.field1537);
            }
        } else if (arg0 >= 12) {
            class4 var31;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var30 = var11.method709((class176) null, arg0, var24, var20, (byte) 49, arg10, arg4, var25, var21, var17, var16);
                var31 = var30.field3378;
            } else {
                var31 = new class222(arg7, arg0, arg10, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class82.method618(arg2, arg5, arg8, var20, 1, 1, var31, 0, var26);
            if (arg4 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg2 > 0 && var11.field1516 != 0) {
                class252.field3802[arg2][arg5][arg8] = class200.method1408(class252.field3802[arg2][arg5][arg8], 4);
            }
            if (var11.field1574 != 0 && arg3 != null) {
                arg3.method1581(var11.field1538, (byte) -78, var13, arg5, arg8, var12, !var11.field1537);
            }
        } else if (arg0 == 0) {
            class4 var33;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var32 = var11.method709((class176) null, 0, var24, var20, (byte) 57, arg10, arg4, var25, var21, var17, var16);
                var33 = var32.field3378;
            } else {
                var33 = new class222(arg7, 0, arg10, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class300.method2052(arg2, arg5, arg8, var20, var33, (class4) null, class190.field2813[arg10], 0, var26);
            if (arg4) {
                if (arg10 == 0) {
                    if (var11.field1552) {
                        class192.field2847[arg2][arg5][arg8] = 50;
                        class192.field2847[arg2][arg5][arg8 + 1] = 50;
                    }
                    if (var11.field1516 == 1) {
                        class252.field3802[arg2][arg5][arg8] = class200.method1408(class252.field3802[arg2][arg5][arg8], 1);
                    }
                } else if (arg10 == 1) {
                    if (var11.field1552) {
                        class192.field2847[arg2][arg5][arg8 + 1] = 50;
                        class192.field2847[arg2][arg5 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field1516 == 1) {
                        class252.field3802[arg2][arg5][arg8 + 1] = class200.method1408(class252.field3802[arg2][arg5][arg8 + 1], 2);
                    }
                } else if (arg10 == 2) {
                    if (var11.field1552) {
                        class192.field2847[arg2][arg5 + 1][arg8] = 50;
                        class192.field2847[arg2][arg5 + 1][arg8 + 1] = 50;
                    }
                    if (var11.field1516 == 1) {
                        class252.field3802[arg2][arg5 + 1][arg8] = class200.method1408(class252.field3802[arg2][arg5 + 1][arg8], 1);
                    }
                } else if (arg10 == 3) {
                    if (var11.field1552) {
                        class192.field2847[arg2][arg5][arg8] = 50;
                        class192.field2847[arg2][arg5 + 1][arg8] = 50;
                    }
                    if (var11.field1516 == 1) {
                        class252.field3802[arg2][arg5][arg8] = class200.method1408(class252.field3802[arg2][arg5][arg8], 2);
                    }
                }
            }
            if (var11.field1574 != 0 && arg3 != null) {
                arg3.method1575(1, arg8, !var11.field1537, arg5, arg10, arg0, var11.field1538);
            }
            if (var11.field1559 != 16) {
                class160.method1162(arg2, arg5, arg8, var11.field1559);
            }
        } else if (arg0 == 1) {
            class4 var35;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var34 = var11.method709((class176) null, 1, var24, var20, (byte) -106, arg10, arg4, var25, var21, var17, var16);
                var35 = var34.field3378;
            } else {
                var35 = new class222(arg7, 1, arg10, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class300.method2052(arg2, arg5, arg8, var20, var35, (class4) null, class44.field573[arg10], 0, var26);
            if (var11.field1552 && arg4) {
                if (arg10 == 0) {
                    class192.field2847[arg2][arg5][arg8 + 1] = 50;
                } else if (arg10 == 1) {
                    class192.field2847[arg2][arg5 + 1][arg8 + 1] = 50;
                } else if (arg10 == 2) {
                    class192.field2847[arg2][arg5 + 1][arg8] = 50;
                } else if (arg10 == 3) {
                    class192.field2847[arg2][arg5][arg8] = 50;
                }
            }
            if (var11.field1574 != 0 && arg3 != null) {
                arg3.method1575(1, arg8, !var11.field1537, arg5, arg10, arg0, var11.field1538);
            }
        } else if (arg0 == 2) {
            int var36 = arg10 + 1 & 0x3;
            class4 var38;
            class4 var40;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var37 = var11.method709((class176) null, 2, var24, var20, (byte) 88, arg10 + 4, arg4, var25, var21, var17, var16);
                var38 = var37.field3378;
                class230 var39 = var11.method709((class176) null, 2, var24, var20, (byte) 103, var36, arg4, var25, var21, var17, var16);
                var40 = var39.field3378;
            } else {
                var38 = new class222(arg7, 2, arg10 + 4, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
                var40 = new class222(arg7, 2, var36, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class300.method2052(arg2, arg5, arg8, var20, var38, var40, class190.field2813[arg10], class190.field2813[var36], var26);
            if (var11.field1516 == 1 && arg4) {
                if (arg10 == 0) {
                    class252.field3802[arg2][arg5][arg8] = class200.method1408(class252.field3802[arg2][arg5][arg8], 1);
                    class252.field3802[arg2][arg5][arg8 + 1] = class200.method1408(class252.field3802[arg2][arg5][arg8 + 1], 2);
                } else if (arg10 == 1) {
                    class252.field3802[arg2][arg5][arg8 + 1] = class200.method1408(class252.field3802[arg2][arg5][arg8 + 1], 2);
                    class252.field3802[arg2][arg5 + 1][arg8] = class200.method1408(class252.field3802[arg2][arg5 + 1][arg8], 1);
                } else if (arg10 == 2) {
                    class252.field3802[arg2][arg5 + 1][arg8] = class200.method1408(class252.field3802[arg2][arg5 + 1][arg8], 1);
                    class252.field3802[arg2][arg5][arg8] = class200.method1408(class252.field3802[arg2][arg5][arg8], 2);
                } else if (arg10 == 3) {
                    class252.field3802[arg2][arg5][arg8] = class200.method1408(class252.field3802[arg2][arg5][arg8], 2);
                    class252.field3802[arg2][arg5][arg8] = class200.method1408(class252.field3802[arg2][arg5][arg8], 1);
                }
            }
            if (var11.field1574 != 0 && arg3 != null) {
                arg3.method1575(arg9 - 5022, arg8, !var11.field1537, arg5, arg10, arg0, var11.field1538);
            }
            if (var11.field1559 != 16) {
                class160.method1162(arg2, arg5, arg8, var11.field1559);
            }
        } else if (arg0 == 3) {
            class4 var42;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var41 = var11.method709((class176) null, 3, var24, var20, (byte) 83, arg10, arg4, var25, var21, var17, var16);
                var42 = var41.field3378;
            } else {
                var42 = new class222(arg7, 3, arg10, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class300.method2052(arg2, arg5, arg8, var20, var42, (class4) null, class44.field573[arg10], 0, var26);
            if (var11.field1552 && arg4) {
                if (arg10 == 0) {
                    class192.field2847[arg2][arg5][arg8 + 1] = 50;
                } else if (arg10 == 1) {
                    class192.field2847[arg2][arg5 + 1][arg8 + 1] = 50;
                } else if (arg10 == 2) {
                    class192.field2847[arg2][arg5 + 1][arg8] = 50;
                } else if (arg10 == 3) {
                    class192.field2847[arg2][arg5][arg8] = 50;
                }
            }
            if (var11.field1574 != 0 && arg3 != null) {
                arg3.method1575(1, arg8, !var11.field1537, arg5, arg10, arg0, var11.field1538);
            }
        } else if (arg0 == 9) {
            class4 var44;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var43 = var11.method709((class176) null, arg0, var24, var20, (byte) -123, arg10, arg4, var25, var21, var17, var16);
                var44 = var43.field3378;
            } else {
                var44 = new class222(arg7, arg0, arg10, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class82.method618(arg2, arg5, arg8, var20, 1, 1, var44, 0, var26);
            if (var11.field1574 != 0 && arg3 != null) {
                arg3.method1581(var11.field1538, (byte) 90, var13, arg5, arg8, var12, !var11.field1537);
            }
            if (var11.field1559 != 16) {
                class160.method1162(arg2, arg5, arg8, var11.field1559);
            }
        } else if (arg0 == 4) {
            class4 var46;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var45 = var11.method709((class176) null, 4, var24, var20, (byte) -66, arg10, arg4, var25, var21, var17, var16);
                var46 = var45.field3378;
            } else {
                var46 = new class222(arg7, 4, arg10, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class158.method1153(arg2, arg5, arg8, var20, var46, (class4) null, class190.field2813[arg10], 0, 0, 0, var26);
        } else if (arg0 == 5) {
            int var47 = 16;
            long var48 = class205.method1455(arg2, arg5, arg8);
            if (var48 != 0L) {
                var47 = class48.method297(false, (int) (var48 >>> 32) & Integer.MAX_VALUE).field1559;
            }
            class4 var51;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var50 = var11.method709((class176) null, 4, var24, var20, (byte) -122, arg10, arg4, var25, var21, var17, var16);
                var51 = var50.field3378;
            } else {
                var51 = new class222(arg7, 4, arg10, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class158.method1153(arg2, arg5, arg8, var20, var51, (class4) null, class190.field2813[arg10], 0, class282.field4547[arg10] * var47, class63.field957[arg10] * var47, var26);
        } else if (arg0 == 6) {
            long var52 = class205.method1455(arg2, arg5, arg8);
            int var54 = 8;
            if (var52 != 0L) {
                var54 = class48.method297(false, (int) (var52 >>> 32) & Integer.MAX_VALUE).field1559 / 2;
            }
            class4 var56;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var55 = var11.method709((class176) null, 4, var24, var20, (byte) -78, arg10 + 4, arg4, var25, var21, var17, var16);
                var56 = var55.field3378;
            } else {
                var56 = new class222(arg7, 4, arg10 + 4, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class158.method1153(arg2, arg5, arg8, var20, var56, (class4) null, 256, arg10, class69.field1107[arg10] * var54, class248.field3704[arg10] * var54, var26);
        } else if (arg0 == 7) {
            int var57 = arg10 + 2 & 0x3;
            class4 var59;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var58 = var11.method709((class176) null, 4, var24, var20, (byte) -102, var57 + 4, arg4, var25, var21, var17, var16);
                var59 = var58.field3378;
            } else {
                var59 = new class222(arg7, 4, var57 + 4, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class158.method1153(arg2, arg5, arg8, var20, var59, (class4) null, 256, var57, 0, 0, var26);
        } else if (arg0 == 8) {
            int var60 = 8;
            long var61 = class205.method1455(arg2, arg5, arg8);
            if (var61 != 0L) {
                var60 = class48.method297(false, (int) (var61 >>> 32) & Integer.MAX_VALUE).field1559 / 2;
            }
            int var63 = arg10 + 2 & 0x3;
            class4 var65;
            class4 var67;
            if (var11.field1568 == -1 && var11.field1566 == null && var11.field1528 == null && !var11.field1564) {
                class230 var64 = var11.method709((class176) null, 4, var24, var20, (byte) -102, arg10 + 4, arg4, var25, var21, var17, var16);
                var65 = var64.field3378;
                class230 var66 = var11.method709((class176) null, 4, var24, var20, (byte) 42, var63 + 4, arg4, var25, var21, var17, var16);
                var67 = var66.field3378;
            } else {
                var65 = new class222(arg7, 4, arg10 + 4, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
                var67 = new class222(arg7, 4, var63 + 4, arg6, arg5, arg8, -1, var11.field1509, (class4) null);
            }
            class158.method1153(arg2, arg5, arg8, var20, var65, var67, 256, arg10, class69.field1107[arg10] * var60, class248.field3704[arg10] * var60, var26);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
    public class221(int arg0, int arg1) {
        this.field3218 = arg0;
        this.field3220 = arg1;
    }
}
