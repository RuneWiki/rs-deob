import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class116 extends class418 {

    @OriginalMember(owner = "client!br", name = "t", descriptor = "S")
    public short field1512;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "[Z")
    public static boolean[] field1507 = new boolean[8];

    @OriginalMember(owner = "client!br", name = "l", descriptor = "[I")
    public static int[] field1504 = new int[3];

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field1508 = 1;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "[Lul;")
    public static class255[] field1513 = new class255[14];

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "[Z")
    public static boolean[] field1511;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 6)
    public static final void method849(byte arg0) {
        field1505++;
        if (arg0 >= -34 || class73.field1032) {
            return;
        }
        class337.method2191((byte) -56, class189.field2597);
        if (class197.field2727 != null) {
            class337.method2191((byte) -56, class197.field2727);
        }
        class73.field1032 = true;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILtj;J)V", line = 34)
    public static final void method850(int arg0, class298 arg1, long arg2) {
        field1510++;
        class447.field6429 = class113.field1469;
        class227.field3130 = 0;
        class113.field1469 = 0;
        long var4 = class98.method768((byte) 101);
        for (class411 var6 = (class411) class309.field4576.method54((byte) 18); var6 != null; var6 = (class411) class309.field4576.method53((byte) 121)) {
            if (var6.method2605(arg1, arg2)) {
                class227.field3130++;
            }
        }
        if (class395.field5746 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class309.field4576.method49(0) + ", running: " + class227.field3130 + ". Particles: " + class113.field1469 + ". Time taken: " + (class98.method768((byte) -117) - var4) + "ms");
        }
        if (arg0 != 26091) {
            field1504 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(IIIIII)Z", line = 72)
    public static final boolean method851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class301.field4539[arg0][var8][var14] == -class13.field207) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class266.field3950[arg0].method722(arg1, arg3) + arg5;
            if (!class27.method229(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class27.method229(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class27.method229(var9, var11, var13)) {
                return false;
            } else if (class27.method229(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class28.method234(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class27.method229(var6 + 1, class266.field3950[arg0].method722(arg1, arg3) + arg5, var7 + 1) && class27.method229(var6 + 128 - 1, class266.field3950[arg0].method722(arg1 + 1, arg3) + arg5, var7 + 1) && class27.method229(var6 + 128 - 1, class266.field3950[arg0].method722(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class27.method229(var6 + 1, class266.field3950[arg0].method722(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V", line = 135)
    public static void method852(int arg0) {
        field1513 = null;
        if (arg0 != -10800) {
            field1504 = null;
        }
        field1504 = null;
        field1511 = null;
        field1507 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I[BIZIIIILtj;[Lao;II)[I", line = 149)
    public static final int[] method853(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class298 arg8, class280[] arg9, int arg10, int arg11) {
        field1509++;
        int var12 = (arg4 & 0x7) * 8;
        if (arg0 > -10) {
            return null;
        }
        int var13 = (arg11 & 0x7) * 8;
        byte var14;
        if (arg3) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        if (!arg3) {
            class280 var15 = arg9[arg6];
            for (int var16 = 0; var16 < 8; var16++) {
                for (int var17 = 0; var17 < 8; var17++) {
                    int var18 = class210.method1370(var17 & 0x7, var16 & 0x7, 3, arg2) + arg10;
                    int var19 = class6.method34(true, arg2, var17 & 0x7, var16 & 0x7) + arg5;
                    if (var18 > 0 && var18 < class351.field5217 - 1 && var19 > 0 && var19 < (class143.field1815 - 1)) {
                        var15.method1849(var18, 66560, var19);
                    }
                }
            }
        }
        class341 var20 = new class341(arg1);
        int var21 = arg4 & 0x1FFFFFF8 << 3;
        int var22 = (arg11 & 0xFFFFFFF8) << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (arg2 == 1) {
            var24 = 1;
        } else if (arg2 == 2) {
            var23 = 1;
            var24 = 1;
        } else if (arg2 == 3) {
            var23 = 1;
        }
        for (int var25 = 0; var25 < var14; var25++) {
            for (int var58 = 0; var58 < 64; var58++) {
                for (int var59 = 0; var59 < 64; var59++) {
                    if (arg7 != var25 || var12 > var58 || var12 + 8 < var58 || var59 < var13 || (var13 + 8) < var59) {
                        class158.method1052(0, -1, var20, false, -1, 0, 0, 0, 0, 0, arg3, (byte) 21);
                    } else if ((var12 + 8) == var58 || var13 + 8 == var59) {
                        int var66;
                        int var67;
                        if (arg2 == 0) {
                            var66 = arg5 - (var13 - var59);
                            var67 = var58 + arg10 - var12;
                        } else if (arg2 == 1) {
                            var66 = var12 + arg5 + 8 - var58;
                            var67 = var59 + arg10 - var13;
                        } else if (arg2 == 2) {
                            var67 = var12 + arg10 + 8 - var58;
                            var66 = var13 + arg5 - (var59 - 8);
                        } else {
                            var67 = arg10 + var13 + 8 - var59;
                            var66 = arg5 - (var12 - var58);
                        }
                        class158.method1052(var21 + var58, var66, var20, true, var67, 0, arg6, var22 + var59, 0, 0, arg3, (byte) 21);
                    } else {
                        int var60 = arg10 + class210.method1370(var59 & 0x7, var58 & 0x7, 3, arg2);
                        int var61 = arg5 + class6.method34(true, arg2, var59 & 0x7, var58 & 0x7);
                        class158.method1052(var21 + var58, var61, var20, false, var60, arg2, arg6, var22 + var59, var23, var24, arg3, (byte) 21);
                        if (var58 == 63 || var59 == 63) {
                            int var62 = var58 == 63 ? 64 : var58;
                            int var63 = var59 == 63 ? 64 : var59;
                            int var64;
                            int var65;
                            if (arg2 == 0) {
                                var64 = arg10 - (var12 - var62);
                                var65 = var63 + arg5 - var13;
                            } else if (arg2 == 1) {
                                var64 = arg10 + var63 - var13;
                                var65 = arg5 + var12 + 8 - var62;
                            } else if (arg2 == 2) {
                                var64 = var12 - (var62 - arg10 - 8);
                                var65 = arg5 + var13 + 8 - var63;
                            } else {
                                var65 = arg5 + var62 - var12;
                                var64 = arg10 + var13 + 8 - var63;
                            }
                            if (var64 >= 0 && var64 < class351.field5217 && var65 >= 0 && class143.field1815 > var65) {
                                class164.field2231[arg6][var64][var65] = class164.field2231[arg6][var23 + var60][var24 + var61];
                            }
                        }
                    }
                }
            }
        }
        boolean var26 = false;
        boolean var27 = false;
        while (var20.field5049 < var20.field5042.length) {
            int var28 = var20.method2233((byte) 104);
            if (var28 == 128) {
                class108.field1417[0] = var20.method2239(-1076227960);
                class108.field1417[1] = var20.method2212(-2);
                class108.field1417[2] = var20.method2212(-2);
                class108.field1417[3] = var20.method2212(-2);
                var26 = true;
                class108.field1417[4] = var20.method2239(-1076227960);
            } else {
                if (var28 != 129) {
                    var20.field5049--;
                    break;
                }
                if (class386.field5642 == null) {
                    class386.field5642 = new byte[4][][];
                }
                for (int var29 = 0; var29 < 4; var29++) {
                    byte var30 = var20.method2211(255);
                    if (var30 == 0 && class386.field5642[arg6] != null) {
                        if (arg7 >= var29) {
                            int var31 = arg10;
                            int var32 = arg10 + 7;
                            int var33 = arg5;
                            int var34 = arg5 + 7;
                            if (var32 < 0) {
                                var32 = 0;
                            } else if (var32 >= class351.field5217) {
                                var32 = class351.field5217;
                            }
                            if (arg10 < 0) {
                                var31 = 0;
                            } else if (arg10 >= class351.field5217) {
                                var31 = class351.field5217;
                            }
                            if (arg5 < 0) {
                                var33 = 0;
                            } else if (arg5 >= class143.field1815) {
                                var33 = class143.field1815;
                            }
                            if (var34 < 0) {
                                var34 = 0;
                            } else if (class143.field1815 <= var34) {
                                var34 = class143.field1815;
                            }
                            while (var31 < var32) {
                                while (var33 < var34) {
                                    class386.field5642[arg6][var31][var33] = 0;
                                    var33++;
                                }
                                var31++;
                            }
                        }
                    } else if (var30 == 1) {
                        if (class386.field5642[arg6] == null) {
                            class386.field5642[arg6] = new byte[class351.field5217 + 1][class143.field1815 + 1];
                        }
                        for (int var35 = 0; var35 < 64; var35 += 4) {
                            for (int var36 = 0; var36 < 64; var36 += 4) {
                                byte var37 = var20.method2211(255);
                                if (arg7 >= var29) {
                                    for (int var38 = var35; var38 < (var35 + 4); var38++) {
                                        for (int var39 = var36; var39 < (var36 + 4); var39++) {
                                            if (var12 <= var38 && var12 + 8 > var38 && var39 >= var13 && var13 < var13 + 8) {
                                                int var40 = class210.method1370(var39 & 0x7, var38 & 0x7, 3, arg2) + arg10;
                                                int var41 = arg5 + class6.method34(true, arg2, var39 & 0x7, var38 & 0x7);
                                                if (var40 >= 0 && class351.field5217 > var40 && var41 >= 0 && class143.field1815 > var41) {
                                                    class386.field5642[arg6][var40][var41] = var37;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg3) {
            class238 var42 = null;
            while (true) {
                while (var20.field5042.length > var20.field5049) {
                    int var43 = var20.method2233((byte) 104);
                    if (var43 == 0) {
                        var42 = new class238(var20);
                    } else if (var43 == 1) {
                        int var44 = var20.method2233((byte) 104);
                        if (var44 > 0) {
                            for (int var45 = 0; var45 < var44; var45++) {
                                class64 var46 = new class64(var20);
                                if (var46.field965 == 31) {
                                    class25 var47 = class113.method835(var20.method2239(-1076227960), (byte) -60);
                                    var46.method563(4, var47.field442, var47.field443, var47.field446, var47.field452);
                                }
                                int var48 = var46.field264 >> 7;
                                int var49 = var46.field269 >> 7;
                                if (var46.field957 == arg7 && var12 <= var48 && var48 < var12 + 8 && var13 <= var49 && var49 < (var13 + 8)) {
                                    int var50 = class326.method2141((byte) 104, var46.field264 & 0x3FF, arg2, var46.field269 & 0x3FF) + (arg10 << 7);
                                    int var51 = class269.method1797(-282, var46.field264 & 0x3FF, var46.field269 & 0x3FF, arg2) + (arg5 << 7);
                                    var46.field269 = var51;
                                    var46.field264 = var50;
                                    int var52 = var46.field264 >> 7;
                                    int var53 = var46.field269 >> 7;
                                    if (var52 >= 0 && var53 >= 0 && class351.field5217 > var52 && var53 < class143.field1815) {
                                        var46.field272 = class164.field2231[arg7][var52][var53] - var46.field272;
                                        if (arg8.method495() > 0) {
                                            class24.method216(var46);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var43 == 2) {
                        if (var42 == null) {
                            var42 = new class238();
                        }
                        var42.method1549(var20, -113);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var42 != null) {
                    class393.method2528(var42, arg5 >> 3, arg10 >> 3, (byte) 116);
                }
                break;
            }
        }
        if (!var27 && class386.field5642 != null && class386.field5642[arg6] != null) {
            int var54 = arg10 + 7;
            int var55 = arg5 + 7;
            for (int var56 = arg10; var56 < var54; var56++) {
                for (int var57 = arg5; var57 < var55; var57++) {
                    class386.field5642[arg6][var56][var57] = 0;
                }
            }
        }
        if (var26) {
            return class108.field1417;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)I", line = 621)
    public static final int method854(int arg0, int arg1, int arg2) {
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        if (arg2 >= -80) {
            method853(63, (byte[]) null, 97, false, -73, -81, 115, 6, (class298) null, (class280[]) null, -89, -115);
        }
        field1506++;
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V", line = 656)
    public class116() {
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(S)V", line = 658)
    public class116(short arg0) {
        this.field1512 = arg0;
    }
}
