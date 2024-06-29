import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class82 extends class90 {

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lrf;")
    public static class163 field1649 = class53.method392(56, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field1648 = 0;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Lrf;")
    public static class163 field1651 = class53.method392(-55, ")3runescape)3com");

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lrf;")
    public static class163 field1652 = class53.method392(59, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!id", name = "J", descriptor = "Lrf;")
    private static class163 field1661 = class53.method392(-52, "Loaded config");

    @OriginalMember(owner = "client!id", name = "K", descriptor = "[I")
    public static int[] field1662 = new int[5];

    @OriginalMember(owner = "client!id", name = "G", descriptor = "Lrf;")
    public static class163 field1658 = field1661;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field1659 = 1;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lpf;")
    public static class145 field1653;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "Lbe;")
    public class16 field1663;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "Lue;")
    public class189 field1654;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "[B")
    public byte[] field1657;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBIIIIILoa;)V")
    public static final void method548(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class131 arg7) {
        field1656++;
        if (class86.field1880 && (class21.field372[0][arg6][arg5] & 0x2) == 0) {
            if ((class21.field372[arg3][arg6][arg5] & 0x10) != 0) {
                return;
            }
            if (class158.method1003(arg6, false, arg3, arg5) != class186.field3713) {
                return;
            }
        }
        if (arg1 != -4) {
            method550((byte) -75);
        }
        if (class132.field2751 > arg3) {
            class132.field2751 = arg3;
        }
        class61 var8 = class199.method1314((byte) 127, arg2);
        int var9;
        int var10;
        if (arg4 == 1 || arg4 == 3) {
            var10 = var8.field1257;
            var9 = var8.field1250;
        } else {
            var9 = var8.field1257;
            var10 = var8.field1250;
        }
        int var11;
        int var12;
        if (arg6 + var9 <= 104) {
            var11 = arg6 + (var9 >> 1);
            var12 = arg6 + (var9 + 1 >> 1);
        } else {
            var11 = arg6;
            var12 = arg6 + 1;
        }
        int[][] var13 = class154.field3199[arg3];
        int var14;
        int var15;
        if (arg5 + var10 > 104) {
            var14 = arg5;
            var15 = arg5 + 1;
        } else {
            var15 = (var10 + 1 >> 1) + arg5;
            var14 = (var10 >> 1) + arg5;
        }
        int var16 = var13[var11][var14] + var13[var12][var15] + var13[var12][var14] + var13[var11][var15] >> 2;
        int var17 = (arg5 << 7) + (var10 << 6);
        long var18 = (long) (arg4 << 20 | arg5 << 7 | arg6 | arg0 << 14 | 0x40000000);
        if (var8.field1243 == 0) {
            var18 |= Long.MIN_VALUE;
        }
        int var20 = (arg6 << 7) + (var9 << 6);
        if (var8.field1298 == 1) {
            var18 |= 0x400000L;
        }
        long var21 = var18 | (long) arg2 << 32;
        if (var8.method445(122)) {
            class175.method1185(arg4, arg3, arg1 ^ 0x61, arg6, arg5, var8);
        }
        if (arg0 == 22) {
            if (!class86.field1880 || var8.field1243 != 0 || var8.field1296 == 1 || var8.field1252) {
                class166 var23;
                if (var8.field1279 == -1 && var8.field1246 == null) {
                    var23 = var8.method441(var20, var17, var16, 22, var13, arg4, (byte) 67);
                } else {
                    var23 = new class56(arg2, 22, arg4, arg3, arg6, arg5, var8.field1279, true, null);
                }
                class172.method1158(arg3, arg6, arg5, var16, var23, var21);
                if (var8.field1296 == 1 && arg7 != null) {
                    arg7.method875(arg5, arg6, true);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class166 var49;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var49 = var8.method441(var20, var17, var16, 10, var13, arg4, (byte) 123);
            } else {
                var49 = new class56(arg2, 10, arg4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            if (var49 != null && class6.method59(arg3, arg6, arg5, var16, var9, var10, var49, arg0 == 11 ? 256 : 0, var21) && var8.field1283) {
                int var50 = 15;
                if (var49 instanceof class91) {
                    var50 = ((class91) var49).method641() / 4;
                    if (var50 > 30) {
                        var50 = 30;
                    }
                }
                for (int var51 = 0; var51 <= var9; var51++) {
                    for (int var52 = 0; var52 <= var10; var52++) {
                        if (var50 > class70.field1473[arg3][arg6 + var51][arg5 + var52]) {
                            class70.field1473[arg3][arg6 + var51][arg5 + var52] = (byte) var50;
                        }
                    }
                }
            }
            if (var8.field1296 != 0 && arg7 != null) {
                arg7.method869(var8.field1272, arg6, (byte) 52, arg5, var9, var10);
            }
        } else if (arg0 >= 12) {
            class166 var24;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var24 = var8.method441(var20, var17, var16, arg0, var13, arg4, (byte) 76);
            } else {
                var24 = new class56(arg2, arg0, arg4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class6.method59(arg3, arg6, arg5, var16, 1, 1, var24, 0, var21);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg3 > 0) {
                class40.field829[arg3][arg6][arg5] = class150.method971(class40.field829[arg3][arg6][arg5], 2340);
            }
            if (var8.field1296 != 0 && arg7 != null) {
                arg7.method869(var8.field1272, arg6, (byte) 52, arg5, var9, var10);
            }
        } else if (arg0 == 0) {
            class166 var25;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var25 = var8.method441(var20, var17, var16, 0, var13, arg4, (byte) 110);
            } else {
                var25 = new class56(arg2, 0, arg4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class57.method412(arg3, arg6, arg5, var16, var25, null, class65.field1386[arg4], 0, var21);
            if (arg4 == 0) {
                if (var8.field1283) {
                    class70.field1473[arg3][arg6][arg5] = 50;
                    class70.field1473[arg3][arg6][arg5 + 1] = 50;
                }
                if (var8.field1263) {
                    class40.field829[arg3][arg6][arg5] = class150.method971(class40.field829[arg3][arg6][arg5], 585);
                }
            } else if (arg4 == 1) {
                if (var8.field1283) {
                    class70.field1473[arg3][arg6][arg5 + 1] = 50;
                    class70.field1473[arg3][arg6 + 1][arg5 + 1] = 50;
                }
                if (var8.field1263) {
                    class40.field829[arg3][arg6][arg5 + 1] = class150.method971(class40.field829[arg3][arg6][arg5 + 1], 1170);
                }
            } else if (arg4 == 2) {
                if (var8.field1283) {
                    class70.field1473[arg3][arg6 + 1][arg5] = 50;
                    class70.field1473[arg3][arg6 + 1][arg5 + 1] = 50;
                }
                if (var8.field1263) {
                    class40.field829[arg3][arg6 + 1][arg5] = class150.method971(class40.field829[arg3][arg6 + 1][arg5], 585);
                }
            } else if (arg4 == 3) {
                if (var8.field1283) {
                    class70.field1473[arg3][arg6][arg5] = 50;
                    class70.field1473[arg3][arg6 + 1][arg5] = 50;
                }
                if (var8.field1263) {
                    class40.field829[arg3][arg6][arg5] = class150.method971(class40.field829[arg3][arg6][arg5], 1170);
                }
            }
            if (var8.field1296 != 0 && arg7 != null) {
                arg7.method879(arg1 + 14932, arg0, arg4, arg5, var8.field1272, arg6);
            }
            if (var8.field1238 != 16) {
                class68.method487(arg3, arg6, arg5, var8.field1238);
            }
        } else if (arg0 == 1) {
            class166 var26;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var26 = var8.method441(var20, var17, var16, 1, var13, arg4, (byte) 94);
            } else {
                var26 = new class56(arg2, 1, arg4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class57.method412(arg3, arg6, arg5, var16, var26, null, class74.field1551[arg4], 0, var21);
            if (var8.field1283) {
                if (arg4 == 0) {
                    class70.field1473[arg3][arg6][arg5 + 1] = 50;
                } else if (arg4 == 1) {
                    class70.field1473[arg3][arg6 + 1][arg5 + 1] = 50;
                } else if (arg4 == 2) {
                    class70.field1473[arg3][arg6 + 1][arg5] = 50;
                } else if (arg4 == 3) {
                    class70.field1473[arg3][arg6][arg5] = 50;
                }
            }
            if (var8.field1296 != 0 && arg7 != null) {
                arg7.method879(14928, arg0, arg4, arg5, var8.field1272, arg6);
            }
        } else if (arg0 == 2) {
            int var27 = arg4 + 1 & 0x3;
            class166 var28;
            class166 var29;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var28 = var8.method441(var20, var17, var16, 2, var13, arg4 + 4, (byte) 123);
                var29 = var8.method441(var20, var17, var16, 2, var13, var27, (byte) 81);
            } else {
                var28 = new class56(arg2, 2, arg4 + 4, arg3, arg6, arg5, var8.field1279, true, null);
                var29 = new class56(arg2, 2, var27, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class57.method412(arg3, arg6, arg5, var16, var28, var29, class65.field1386[arg4], class65.field1386[var27], var21);
            if (var8.field1263) {
                if (arg4 == 0) {
                    class40.field829[arg3][arg6][arg5] = class150.method971(class40.field829[arg3][arg6][arg5], 585);
                    class40.field829[arg3][arg6][arg5 + 1] = class150.method971(class40.field829[arg3][arg6][arg5 + 1], 1170);
                } else if (arg4 == 1) {
                    class40.field829[arg3][arg6][arg5 + 1] = class150.method971(class40.field829[arg3][arg6][arg5 + 1], 1170);
                    class40.field829[arg3][arg6 + 1][arg5] = class150.method971(class40.field829[arg3][arg6 + 1][arg5], 585);
                } else if (arg4 == 2) {
                    class40.field829[arg3][arg6 + 1][arg5] = class150.method971(class40.field829[arg3][arg6 + 1][arg5], 585);
                    class40.field829[arg3][arg6][arg5] = class150.method971(class40.field829[arg3][arg6][arg5], 1170);
                } else if (arg4 == 3) {
                    class40.field829[arg3][arg6][arg5] = class150.method971(class40.field829[arg3][arg6][arg5], 1170);
                    class40.field829[arg3][arg6][arg5] = class150.method971(class40.field829[arg3][arg6][arg5], 585);
                }
            }
            if (var8.field1296 != 0 && arg7 != null) {
                arg7.method879(arg1 + 14932, arg0, arg4, arg5, var8.field1272, arg6);
            }
            if (var8.field1238 != 16) {
                class68.method487(arg3, arg6, arg5, var8.field1238);
            }
        } else if (arg0 == 3) {
            class166 var30;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var30 = var8.method441(var20, var17, var16, 3, var13, arg4, (byte) 71);
            } else {
                var30 = new class56(arg2, 3, arg4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class57.method412(arg3, arg6, arg5, var16, var30, null, class74.field1551[arg4], 0, var21);
            if (var8.field1283) {
                if (arg4 == 0) {
                    class70.field1473[arg3][arg6][arg5 + 1] = 50;
                } else if (arg4 == 1) {
                    class70.field1473[arg3][arg6 + 1][arg5 + 1] = 50;
                } else if (arg4 == 2) {
                    class70.field1473[arg3][arg6 + 1][arg5] = 50;
                } else if (arg4 == 3) {
                    class70.field1473[arg3][arg6][arg5] = 50;
                }
            }
            if (var8.field1296 != 0 && arg7 != null) {
                arg7.method879(14928, arg0, arg4, arg5, var8.field1272, arg6);
            }
        } else if (arg0 == 9) {
            class166 var31;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var31 = var8.method441(var20, var17, var16, arg0, var13, arg4, (byte) 39);
            } else {
                var31 = new class56(arg2, arg0, arg4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class6.method59(arg3, arg6, arg5, var16, 1, 1, var31, 0, var21);
            if (var8.field1296 != 0 && arg7 != null) {
                arg7.method869(var8.field1272, arg6, (byte) 52, arg5, var9, var10);
            }
            if (var8.field1238 != 16) {
                class68.method487(arg3, arg6, arg5, var8.field1238);
            }
        } else if (arg0 == 4) {
            class166 var32;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var32 = var8.method441(var20, var17, var16, 4, var13, arg4, (byte) 94);
            } else {
                var32 = new class56(arg2, 4, arg4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class31.method207(arg3, arg6, arg5, var16, var32, null, class65.field1386[arg4], 0, 0, 0, var21);
        } else if (arg0 == 5) {
            int var33 = 16;
            long var34 = class6.method58(arg3, arg6, arg5);
            if (var34 != 0L) {
                var33 = class199.method1314((byte) 127, Integer.MAX_VALUE & (int) (var34 >>> 32)).field1238;
            }
            class166 var36;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var36 = var8.method441(var20, var17, var16, 4, var13, arg4, (byte) 106);
            } else {
                var36 = new class56(arg2, 4, arg4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class31.method207(arg3, arg6, arg5, var16, var36, null, class65.field1386[arg4], 0, class195.field3876[arg4] * var33, class44.field895[arg4] * var33, var21);
        } else if (arg0 == 6) {
            int var37 = 8;
            long var38 = class6.method58(arg3, arg6, arg5);
            if (var38 != 0L) {
                var37 = class199.method1314((byte) 127, (int) (var38 >>> 32) & Integer.MAX_VALUE).field1238 / 2;
            }
            class166 var40;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var40 = var8.method441(var20, var17, var16, 4, var13, arg4 + 4, (byte) 76);
            } else {
                var40 = new class56(arg2, 4, arg4 + 4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class31.method207(arg3, arg6, arg5, var16, var40, null, 256, arg4, class48.field942[arg4] * var37, class187.field3731[arg4] * var37, var21);
        } else if (arg0 == 7) {
            int var41 = arg4 + 2 & 0x3;
            class166 var42;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var42 = var8.method441(var20, var17, var16, 4, var13, var41 + 4, (byte) 86);
            } else {
                var42 = new class56(arg2, 4, var41 + 4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class31.method207(arg3, arg6, arg5, var16, var42, null, 256, var41, 0, 0, var21);
        } else if (arg0 == 8) {
            int var43 = 8;
            long var44 = class6.method58(arg3, arg6, arg5);
            if (var44 != 0L) {
                var43 = class199.method1314((byte) 126, (int) (var44 >>> 32) & Integer.MAX_VALUE).field1238 / 2;
            }
            int var46 = arg4 + 2 & 0x3;
            class166 var47;
            class166 var48;
            if (var8.field1279 == -1 && var8.field1246 == null) {
                var47 = var8.method441(var20, var17, var16, 4, var13, arg4 + 4, (byte) 70);
                var48 = var8.method441(var20, var17, var16, 4, var13, var46 + 4, (byte) 47);
            } else {
                var47 = new class56(arg2, 4, arg4 + 4, arg3, arg6, arg5, var8.field1279, true, null);
                var48 = new class56(arg2, 4, var46 + 4, arg3, arg6, arg5, var8.field1279, true, null);
            }
            class31.method207(arg3, arg6, arg5, var16, var47, var48, 256, arg4, class48.field942[arg4] * var43, class187.field3731[arg4] * var43, var21);
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static final void method549(int arg0) {
        if (arg0 < 7) {
            method552(31, null, 7, -57);
        }
        for (int var1 = -1; var1 < class112.field2377; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class27.field504[var1];
            }
            class38 var6 = class121.field2553[var5];
            if (var6 != null && var6.field672 > 0) {
                var6.field672--;
                if (var6.field672 == 0) {
                    var6.field686 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class93.field2013; var2++) {
            int var3 = class170.field3459[var2];
            class70 var4 = class187.field3723[var3];
            if (var4 != null && var4.field672 > 0) {
                var4.field672--;
                if (var4.field672 == 0) {
                    var4.field686 = null;
                }
            }
        }
        field1660++;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
    public static final void method550(byte arg0) {
        if (arg0 != 50) {
            method548(-74, (byte) 60, 105, 47, -37, 48, 94, null);
        }
        field1665++;
        class81.field1641.method399(false);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILu;)Z")
    public static final boolean method551(int arg0, int arg1, class184 arg2) {
        field1664++;
        byte[] var3 = arg2.method1246(-89, arg0);
        if (var3 == null) {
            return false;
        }
        class99.method679(var3, (byte) -3);
        if (arg1 != 1) {
            field1659 = 122;
        }
        return true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILu;II)[Lpf;")
    public static final class145[] method552(int arg0, class184 arg1, int arg2, int arg3) {
        field1650++;
        if (class102.method700(arg2, arg1, (byte) -89, arg0)) {
            if (arg3 != 0) {
                method554(null, (byte) -65, null, null, null);
            }
            return class33.method214(arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    public static void method553(int arg0) {
        if (arg0 != -25307) {
            return;
        }
        field1661 = null;
        field1653 = null;
        field1658 = null;
        field1649 = null;
        field1651 = null;
        field1662 = null;
        field1652 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lu;BLu;Lu;Lu;)V")
    public static final void method554(class184 arg0, byte arg1, class184 arg2, class184 arg3, class184 arg4) {
        if (arg1 != -100) {
            return;
        }
        class158.field3232 = arg4;
        class64.field1360 = arg2;
        field1655++;
        class38.field775 = arg3;
        class128.field2629 = arg0;
        class84.field1798 = new class84[class158.field3232.method1245(382)][];
        class136.field2815 = new boolean[class158.field3232.method1245(arg1 ^ 0xFFFFFEE2)];
    }
}
