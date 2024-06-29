import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class286 {

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lma;")
    private static class5 field4824 = class12.method119(" is already on your friend list)3", (byte) 78);

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field4820 = 0;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lma;")
    public static class5 field4817 = class12.method119(": ", (byte) 53);

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field4819 = 0;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[I")
    public static int[] field4816 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lma;")
    public static class5 field4828 = class12.method119(")3)3)3", (byte) 97);

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lma;")
    public static class5 field4827 = field4824;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lje;")
    public static class158 field4830;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Lla;")
    public class178 field4825;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lkb;")
    public class280 field4823;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "[I")
    public static int[] field4829;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([[F[[B[[I[[B[[F[[FI[[I[[I[[BI[[I[[B[[[B[[I)[Lwh;", line = 16)
    public static final class56[] method1926(float[][] arg0, byte[][] arg1, int[][] arg2, byte[][] arg3, float[][] arg4, float[][] arg5, int arg6, int[][] arg7, int[][] arg8, byte[][] arg9, int arg10, int[][] arg11, byte[][] arg12, byte[][][] arg13, int[][] arg14) {
        field4821++;
        int[][] var15 = new int[105][105];
        int var16 = 1;
        if (arg10 != -1) {
            method1928(41, 41, 118, -33);
        }
        while (var16 <= 103) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg1[var16][var17];
                if (var18 == 0) {
                    var18 = arg1[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg1[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg1[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class114 var19 = class260.method1802((var18 & 0xFF) - 1, -32243);
                    var15[var16][var17] = (var19.field1704 + 1 << 16) + var19.field1708;
                }
            }
            var16++;
        }
        class209 var20 = new class209(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg1[var21][var22] != 0) {
                    int[] var23;
                    if (arg3[var21][var22] == 0) {
                        var23 = client.field1759[0];
                    } else {
                        var23 = class213.field3389[arg9[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = var15[var21][var22];
                    int var25 = var15[var21 + 1][var22];
                    int var26 = 0;
                    int var27 = var15[var21 + 1][var22 + 1];
                    if (arg11 != null) {
                        var26 = arg11[var21][var22] & 0xFFFFFF;
                    }
                    long var28 = (long) var26 | (long) var24 << 32;
                    int var30 = var15[var21][var22 + 1];
                    long var31 = (long) var25 << 32 | (long) var26;
                    long var33 = (long) var27 << 32 | (long) var26;
                    long var35 = (long) var30 << 32 | (long) var26;
                    int var37 = var23.length / 2;
                    class56 var38 = (class56) var20.method1372(false, var28);
                    if (var38 == null) {
                        var38 = new class56((var24 >> 16) - 1, (float) (var24 & 0xFFFF), false, arg7 != null, var26);
                        var20.method1376(var28, -1, var38);
                    }
                    var38.field875 += var37;
                    var38.field869++;
                    if (var28 != var31) {
                        class56 var39 = (class56) var20.method1372(false, var31);
                        if (var39 == null) {
                            var39 = new class56((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg7 != null, var26);
                            var20.method1376(var31, -1, var39);
                        }
                        var39.field875 += var37;
                        var39.field869++;
                    }
                    if (var28 != var33 && var31 != var33) {
                        class56 var40 = (class56) var20.method1372(false, var33);
                        if (var40 == null) {
                            var40 = new class56((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg7 != null, var26);
                            var20.method1376(var33, -1, var40);
                        }
                        var40.field875 += var37;
                        var40.field869++;
                    }
                    if (var28 != var35 && var31 != var35 && var33 != var35) {
                        class56 var41 = (class56) var20.method1372(false, var35);
                        if (var41 == null) {
                            var41 = new class56((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg7 != null, var26);
                            var20.method1376(var35, -1, var41);
                        }
                        var41.field869++;
                        var41.field875 += var37;
                    }
                }
            }
        }
        for (class56 var42 = (class56) var20.method1379(true); var42 != null; var42 = (class56) var20.method1380((byte) 66)) {
            var42.method425();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg1[var43][var44] != 0) {
                    int var45 = 128;
                    int var46;
                    if ((arg13[arg6][var43][var44] & 0x8) != 0) {
                        var46 = 0;
                    } else if ((arg13[1][var43][var44] & 0x2) == 2 && arg6 > 0) {
                        var46 = arg6 - 1;
                    } else {
                        var46 = arg6;
                    }
                    int var47 = 0;
                    if (arg11 != null) {
                        var47 = arg11[var43][var44] & 0xFFFFFF;
                        var45 = arg11[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var48 = null;
                    int[] var49;
                    byte var50;
                    if (arg3[var43][var44] == 0) {
                        var49 = client.field1759[0];
                        var50 = 0;
                    } else {
                        var49 = class213.field3389[arg9[var43][var44]];
                        var48 = class8.field116[arg9[var43][var44]];
                        var50 = arg12[var43][var44];
                        if (var49.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43 + 1][var44 + 1];
                    int var52 = var15[var43 + 1][var44];
                    int var53 = var15[var43][var44];
                    int var54 = var15[var43][var44 + 1];
                    long var55 = (long) var53 << 32 | (long) var47;
                    long var57 = (long) var47 | (long) var51 << 32;
                    int var59 = arg14[var43][var44];
                    long var60 = (long) var54 << 32 | (long) var47;
                    int var62 = arg14[var43 + 1][var44 + 1];
                    int var63 = arg14[var43 + 1][var44];
                    long var64 = (long) var52 << 32 | (long) var47;
                    int var66 = arg14[var43][var44 + 1];
                    int var67 = arg2[var43][var44];
                    int var68 = arg2[var43 + 1][var44];
                    int var69 = arg2[var43 + 1][var44 + 1];
                    int var70 = arg2[var43][var44 + 1];
                    int var71 = (var53 >> 16) - 1;
                    int var72 = (var52 >> 16) - 1;
                    int var73 = (var51 >> 16) - 1;
                    int var74 = (var54 >> 16) - 1;
                    class56 var75 = (class56) var20.method1372(false, var55);
                    class206.method1362(var75, var51 >= var53, arg8, var43, var53 >= var53, class149.method937(var67, var71, var59, (byte) -101), var46, class149.method937(var68, var71, var63, (byte) -122), var50, var52 >= var53, class149.method937(var70, var71, var66, (byte) -121), var44, var49, 255, var45, var48, class149.method937(var69, var71, var62, (byte) -80), arg5, arg4, var54 >= var53, arg7, arg0);
                    if (var55 != var64) {
                        class56 var76 = (class56) var20.method1372(false, var64);
                        class206.method1362(var76, var51 >= var52, arg8, var43, var52 <= var53, class149.method937(var67, var72, var59, (byte) -46), var46, class149.method937(var68, var72, var63, (byte) -110), var50, var52 <= var52, class149.method937(var70, var72, var66, (byte) -70), var44, var49, arg10 + 256, var45, var48, class149.method937(var69, var72, var62, (byte) -114), arg5, arg4, var52 <= var54, arg7, arg0);
                    }
                    if (var55 != var57 && var57 != var64) {
                        class56 var77 = (class56) var20.method1372(false, var57);
                        class206.method1362(var77, var51 <= var51, arg8, var43, var51 <= var53, class149.method937(var67, var73, var59, (byte) -48), var46, class149.method937(var68, var73, var63, (byte) -106), var50, var52 >= var51, class149.method937(var70, var73, var66, (byte) -55), var44, var49, 255, var45, var48, class149.method937(var69, var73, var62, (byte) -119), arg5, arg4, var51 <= var54, arg7, arg0);
                    }
                    if (var55 != var60 && var60 != var64 && var57 != var60) {
                        class56 var78 = (class56) var20.method1372(false, var60);
                        class206.method1362(var78, var51 >= var54, arg8, var43, var53 >= var54, class149.method937(var67, var74, var59, (byte) -89), var46, class149.method937(var68, var74, var63, (byte) -106), var50, var54 <= var52, class149.method937(var70, var74, var66, (byte) -126), var44, var49, arg10 + 256, var45, var48, class149.method937(var69, var74, var62, (byte) -77), arg5, arg4, var54 >= var54, arg7, arg0);
                    }
                }
            }
        }
        for (class56 var79 = (class56) var20.method1379(true); var79 != null; var79 = (class56) var20.method1380((byte) 66)) {
            if (var79.field885 == 0) {
                var79.method1997(-27381);
            } else {
                var79.method423();
            }
        }
        int var80 = var20.method1375(12900);
        long[] var81 = new long[var80];
        class56[] var82 = new class56[var80];
        var20.method1374(var82, arg10 - 123);
        for (int var83 = 0; var83 < var80; var83++) {
            var81[var83] = var82[var83].field5004;
        }
        class106.method670(var82, false, var81);
        return var82;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIBILah;)V", line = 351)
    public static final void method1927(int arg0, int arg1, int arg2, byte arg3, int arg4, class150 arg5) {
        field4826++;
        if (arg5.field2173 == -1 && arg5.field2172 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 > arg5.field2157) {
            var6 += arg1 - arg5.field2157;
        } else if (arg5.field2177 > arg1) {
            var6 += arg5.field2177 - arg1;
        }
        if (arg2 > arg5.field2169) {
            var6 += arg2 - arg5.field2169;
        } else if (arg5.field2171 > arg2) {
            var6 += arg5.field2171 - arg2;
        }
        if (arg5.field2168 == 0 || var6 - 64 > arg5.field2168 || class130.field1955 == 0 || arg5.field2170 != arg0) {
            if (arg5.field2163 != null) {
                class235.field3889.method277(arg5.field2163);
                arg5.field2163 = null;
            }
            if (arg5.field2178 != null) {
                class235.field3889.method277(arg5.field2178);
                arg5.field2178 = null;
            }
            return;
        }
        var6 -= 64;
        if (arg3 <= 83) {
            field4817 = (class5) null;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field2168 - var6) * class130.field1955 / arg5.field2168;
        if (arg5.field2163 != null) {
            arg5.field2163.method706(var7);
        } else if (arg5.field2173 >= 0) {
            class6 var8 = class6.method83(class13.field244, arg5.field2173, 0);
            if (var8 != null) {
                class26 var9 = var8.method81().method190(class62.field974);
                class108 var10 = class108.method715(var9, 100, var7);
                var10.method700(-1);
                class235.field3889.method275(var10);
                arg5.field2163 = var10;
            }
        }
        if (arg5.field2178 != null) {
            arg5.field2178.method706(var7);
            if (!arg5.field2178.method2004(true)) {
                arg5.field2178 = null;
            }
        } else if (arg5.field2172 != null && (arg5.field2166 -= arg4) <= 0) {
            int var11 = (int) (Math.random() * (double) arg5.field2172.length);
            class6 var12 = class6.method83(class13.field244, arg5.field2172[var11], 0);
            if (var12 != null) {
                class26 var13 = var12.method81().method190(class62.field974);
                class108 var14 = class108.method715(var13, 100, var7);
                var14.method700(0);
                class235.field3889.method275(var14);
                arg5.field2166 = (int) ((double) (arg5.field2182 - arg5.field2179) * Math.random()) + arg5.field2179;
                arg5.field2178 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)V", line = 482)
    public static final void method1928(int arg0, int arg1, int arg2, int arg3) {
        class174.field2665 = new class198[arg0][arg1][arg2];
        class88.field1318 = new int[arg0][arg1 + 1][arg2 + 1];
        class110.field1635 = new class56[4][];
        class50.method379(false);
        class115.field1721 = arg1;
        class179.field2708 = arg2;
        class74.field1167 = new int[arg0][arg1 + 1][arg2 + 1];
        class217.method1465();
        class147.field2137 = arg3;
        class251.field4166 = new boolean[class147.field2137 + class147.field2137 + 1][class147.field2137 + class147.field2137 + 1];
        class111.field1645 = new boolean[class147.field2137 + class147.field2137 + 2][class147.field2137 + class147.field2137 + 2];
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 498)
    public static void method1929(boolean arg0) {
        field4829 = null;
        field4816 = null;
        field4830 = null;
        field4827 = null;
        field4828 = null;
        if (!arg0) {
            field4824 = null;
            field4817 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lii;I)Luf;", line = 521)
    public static final class175 method1930(class221 arg0, int arg1) {
        field4815++;
        class175 var2 = new class175();
        var2.field2681 = arg0.method1524((byte) 45);
        if (arg1 == 1) {
            var2.field2667 = class91.method600(-124, var2.field2681);
            return var2;
        } else {
            return (class175) null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZB)V", line = 541)
    public static final void method1931(boolean arg0, byte arg1) {
        field4822++;
        if (arg1 != -5) {
            return;
        }
        for (class150 var2 = (class150) class274.field4660.method1475(arg1 + 19); var2 != null; var2 = (class150) class274.field4660.method1486(38)) {
            if (var2.field2163 != null) {
                class235.field3889.method277(var2.field2163);
                var2.field2163 = null;
            }
            if (var2.field2178 != null) {
                class235.field3889.method277(var2.field2178);
                var2.field2178 = null;
            }
            var2.method1997(arg1 - 27376);
        }
        if (!arg0) {
            return;
        }
        for (class150 var3 = (class150) class239.field3953.method1475(14); var3 != null; var3 = (class150) class239.field3953.method1486(arg1 ^ 0xFFFFFFDD)) {
            if (var3.field2163 != null) {
                class235.field3889.method277(var3.field2163);
                var3.field2163 = null;
            }
            var3.method1997(-27381);
        }
        for (class150 var4 = (class150) class86.field1298.method1379(true); var4 != null; var4 = (class150) class86.field1298.method1380((byte) 66)) {
            if (var4.field2163 != null) {
                class235.field3889.method277(var4.field2163);
                var4.field2163 = null;
            }
            var4.method1997(arg1 ^ 0x6AF0);
        }
    }
}
