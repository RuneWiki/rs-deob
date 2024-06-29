import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class62 extends class390 {

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public int field851 = -1;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "Z")
    public boolean field850 = false;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "Lwd;")
    public static class149 field855 = new class149();

    @OriginalMember(owner = "client!co", name = "s", descriptor = "[C")
    public static char[] field857 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!co", name = "u", descriptor = "Z")
    public static boolean field859;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "[[Z")
    public static boolean[][] field861;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    public static int field860;

    static {
        new class442("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field859 = false;
        field861 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V", line = 4)
    public static final void method476(int arg0) {
        class95.method673(false, true);
        field856++;
        class53.field744 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class247.field3495.length; var2++) {
            if (class276.field3839[var2] != -1 && class247.field3495[var2] == null) {
                class247.field3495[var2] = class20.field375.method1745(0, (byte) 61, class276.field3839[var2]);
                if (class247.field3495[var2] == null) {
                    class53.field744++;
                    var1 = false;
                }
            }
            if (class426.field5997[var2] != -1 && class161.field2249[var2] == null) {
                class161.field2249[var2] = class20.field375.method1748(0, class426.field5997[var2], -997, class406.field5776[var2]);
                if (class161.field2249[var2] == null) {
                    class53.field744++;
                    var1 = false;
                }
            }
            if (class268.field3742[var2] != -1 && class446.field6257[var2] == null) {
                class446.field6257[var2] = class20.field375.method1745(0, (byte) 88, class268.field3742[var2]);
                if (class446.field6257[var2] == null) {
                    var1 = false;
                    class53.field744++;
                }
            }
            if (class284.field4005[var2] != -1 && class67.field1014[var2] == null) {
                class67.field1014[var2] = class20.field375.method1745(0, (byte) 56, class284.field4005[var2]);
                if (class67.field1014[var2] == null) {
                    var1 = false;
                    class53.field744++;
                }
            }
            if (class5.field91 != null && class403.field5718[var2] == null && class5.field91[var2] != -1) {
                class403.field5718[var2] = class20.field375.method1748(0, class5.field91[var2], -997, class406.field5776[var2]);
                if (class403.field5718[var2] == null) {
                    class53.field744++;
                    var1 = false;
                }
            }
        }
        if (class282.field3952 == null) {
            if (class388.field5576 == null || !class370.field5203.method1741(class388.field5576.field5748 + "_staticelements", (byte) -26)) {
                class282.field3952 = new class92(0);
            } else if (class370.field5203.method1749(0, class388.field5576.field5748 + "_staticelements")) {
                class282.field3952 = class100.method718(class21.field393, class388.field5576.field5748 + "_staticelements", (byte) 33, class370.field5203);
            } else {
                var1 = false;
                class53.field744++;
            }
        }
        if (!var1) {
            class275.field3831 = 1;
            return;
        }
        if (arg0 != -14694) {
            field857 = null;
        }
        class279.field3919 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class247.field3495.length; var4++) {
            byte[] var20 = class161.field2249[var4];
            if (var20 != null) {
                int var21 = (class155.field2191[var4] >> 8) * 64 - class212.field2968;
                int var22 = (class155.field2191[var4] & 0xFF) * 64 - class447.field6269;
                if (class243.field3452) {
                    var21 = 10;
                    var22 = 10;
                }
                var3 &= class245.method1660(var20, var21, var22, true);
            }
            byte[] var23 = class67.field1014[var4];
            if (var23 != null) {
                int var24 = (class155.field2191[var4] >> 8) * 64 - class212.field2968;
                int var25 = (class155.field2191[var4] & 0xFF) * 64 - class447.field6269;
                if (class243.field3452) {
                    var24 = 10;
                    var25 = 10;
                }
                var3 &= class245.method1660(var23, var24, var25, true);
            }
        }
        if (!var3) {
            class275.field3831 = 2;
            return;
        }
        if (class275.field3831 != 0) {
            class427.method2692(class159.field2234, 111, true, class80.field1149.method2763(58, class210.field2935) + "<br>(100%)");
        }
        class285.method1860(arg0 ^ 0xFFFFC696);
        client.method1095(false);
        boolean var5 = false;
        if (class64.field949.method66() && class171.field2346) {
            for (int var6 = 0; var6 < class247.field3495.length; var6++) {
                if (class67.field1014[var6] != null || class446.field6257[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class54.field755) {
            var7 = class217.field3002[class170.field2326];
        } else {
            var7 = class306.field4232[class170.field2326];
        }
        if (class64.field949.method91()) {
            var7++;
        }
        class66.method509(4, class211.field2954, class290.field4061, var7, var5, class64.field949.method48() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class426.field5999[var8].method532((byte) -95);
        }
        class241.method1638(arg0 ^ 0xFFFFC692);
        class76.method564(false, -23445);
        class89.method626((byte) -92);
        class285.method1860(arg0 + 14706);
        System.gc();
        class95.method673(true, true);
        class109.method771(4, -6805, false);
        int[][] var9 = null;
        if (!class243.field3452) {
            class415.method2601((byte) -118, false);
            class272.method1779(class412.field5841.field5326[0] >> 3, (byte) 69, class412.field5841.field5332[0] >> 3);
            class268.method1769(2651);
            class329.method2123(true, 4, class64.field949, false, (int[][]) null);
            var9 = class57.field783[0];
            class95.method673(true, true);
            class442.method2765(false, 107);
            if (class403.field5718 != null) {
                class160.method1063((byte) -58);
            }
        }
        if (class243.field3452) {
            class399.method2513(arg0 ^ 0xFFFFC6E5, false);
            class272.method1779(class412.field5841.field5326[0] >> 3, (byte) 69, class412.field5841.field5332[0] >> 3);
            class268.method1769(2651);
            class329.method2123(true, 4, class64.field949, false, (int[][]) null);
            var9 = class57.field783[0];
            class95.method673(true, true);
            class258.method1700(123, false);
        }
        client.method1095(false);
        class95.method673(true, true);
        class3.method15(false, (class242) null, 4, class426.field5999, (byte) -4, class64.field949);
        class429.method2710(4, (byte) 10, class64.field949);
        class95.method673(true, true);
        int var10 = class268.field3727;
        if (var10 > class142.field2034) {
            var10 = class142.field2034;
        }
        if (var10 < class142.field2034 - 1) {
            var10 = class142.field2034 - 1;
        }
        if (class51.method428(-1)) {
            class279.method1822(0);
        } else {
            class279.method1822(var10);
        }
        class267.method1733(119);
        if (var5) {
            class445.method2777(true);
            class109.method771(1, -6805, true);
            if (!class243.field3452) {
                class415.method2601((byte) -118, true);
                class329.method2123(true, 1, class64.field949, true, var9);
                class95.method673(true, true);
                class442.method2765(true, 74);
                class429.method2710(1, (byte) 10, class64.field949);
            }
            if (class243.field3452) {
                class399.method2513(127, true);
                class329.method2123(true, 1, class64.field949, true, var9);
                class95.method673(true, true);
                class258.method1700(-58, true);
            }
            client.method1095(false);
            class95.method673(true, true);
            class3.method15(true, class418.field5939[0], 1, class426.field5999, (byte) -4, class64.field949);
            class429.method2710(1, (byte) 10, class64.field949);
            class95.method673(true, true);
            class267.method1733(98);
            class445.method2777(false);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class211.field2954; var18++) {
                for (int var19 = 0; var19 < class290.field4061; var19++) {
                    class328.method2112(arg0 + 14693, var11, var19, var18);
                }
            }
        }
        class163.method1077((byte) 0);
        class285.method1860(12);
        class151.method1021(14);
        client.method1095(false);
        class396.field5667 = false;
        class404.method2530((byte) -105);
        if (class79.field1119 != null && class156.field2207 != null && class446.field6250 == 25) {
            class274.field3803++;
            class46.field648.method1178(63, 151);
            class46.field648.method155(15489, 1057001181);
        }
        if (!class243.field3452) {
            int var12 = (class218.field3021 - (class211.field2954 >> 4)) / 8;
            int var13 = ((class211.field2954 >> 4) + class218.field3021) / 8;
            int var14 = (class316.field4320 - (class290.field4061 >> 4)) / 8;
            int var15 = ((class290.field4061 >> 4) + class316.field4320) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var17 < var14 || var17 > var15) {
                        class20.field375.method1755("m" + var16 + "_" + var17, -1);
                        class20.field375.method1755("l" + var16 + "_" + var17, -1);
                    }
                }
            }
        }
        if (class446.field6250 == 28) {
            class139.method958(10, false);
        } else {
            class139.method958(30, false);
            if (class156.field2207 != null) {
                class46.field648.method1178(63, 197);
            }
        }
        class366.method2358((byte) 101);
        class285.method1860(12);
        class195.method1263((byte) -50);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IZIBI[Lhh;ILuo;I[B)[I", line = 438)
    public static final int[] method477(int arg0, boolean arg1, int arg2, byte arg3, int arg4, class67[] arg5, int arg6, class345 arg7, int arg8, byte[] arg9) {
        field853++;
        if (!arg1) {
            for (int var10 = 0; var10 < 4; var10++) {
                class67 var11 = arg5[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg6 + var12;
                        int var15 = arg4 + var13;
                        if (var14 >= 0 && class211.field2954 > var14 && var15 >= 0 && class290.field4061 > var15) {
                            var11.method517(var15, (byte) -71, var14);
                        }
                    }
                }
            }
        }
        class11 var16 = new class11(arg9);
        int var17 = arg8 + arg6;
        if (arg3 >= -68) {
            field859 = false;
        }
        int var18 = arg2 + arg4;
        for (int var19 = 0; var19 < arg0; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class264.method1728(arg4 + var56, 66, 0, var19, var17 + var55, 0, 0, false, var18 + var56, arg6 + var55, var16, arg1);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field230.length > var16.field191) {
            int var22 = var16.method172((byte) 52);
            if (var22 == 128) {
                class288.field4053[0] = var16.method174(255);
                class288.field4053[1] = var16.method207(7124);
                class288.field4053[2] = var16.method207(7124);
                class288.field4053[3] = var16.method207(7124);
                class288.field4053[4] = var16.method174(255);
                var20 = true;
            } else {
                if (var22 != 129) {
                    var16.field191--;
                    break;
                }
                if (class132.field1889 == null) {
                    class132.field1889 = new byte[4][][];
                }
                for (int var40 = 0; var40 < 4; var40++) {
                    byte var41 = var16.method162(-4436);
                    if (var41 == 0 && class132.field1889[var40] != null) {
                        int var42 = arg6;
                        int var43 = arg6 + 64;
                        int var44 = arg4;
                        if (arg4 < 0) {
                            var44 = 0;
                        } else if (class290.field4061 <= arg4) {
                            var44 = class290.field4061;
                        }
                        if (var43 < 0) {
                            var43 = 0;
                        } else if (var43 >= class211.field2954) {
                            var43 = class211.field2954;
                        }
                        if (arg6 < 0) {
                            var42 = 0;
                        } else if (arg6 >= class211.field2954) {
                            var42 = class211.field2954;
                        }
                        int var45 = arg4 + 64;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (class290.field4061 <= var45) {
                            var45 = class290.field4061;
                        }
                        while (var42 < var43) {
                            while (var44 < var45) {
                                class132.field1889[var40][var42][var44] = 0;
                                var44++;
                            }
                            var42++;
                        }
                    } else if (var41 == 1) {
                        if (class132.field1889[var40] == null) {
                            class132.field1889[var40] = new byte[class211.field2954 + 1][class290.field4061 + 1];
                        }
                        for (int var50 = 0; var50 < 64; var50 += 4) {
                            for (int var51 = 0; var51 < 64; var51 += 4) {
                                byte var52 = var16.method162(-4436);
                                for (int var53 = arg6 + var50; var53 < arg6 + var50 + 4; var53++) {
                                    for (int var54 = var51 + arg4; var54 < arg4 + var51 + 4; var54++) {
                                        if (var53 >= 0 && var53 < class211.field2954 && var54 >= 0 && var54 < class290.field4061) {
                                            class132.field1889[var40][var53][var54] = var52;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var41 == 2) {
                        if (class132.field1889[var40] == null) {
                            class132.field1889[var40] = new byte[class211.field2954 + 1][class290.field4061 + 1];
                        }
                        if (var40 > 0) {
                            int var46 = arg6;
                            int var47 = arg6 + 64;
                            int var48 = arg4;
                            if (arg4 < 0) {
                                var48 = 0;
                            } else if (arg4 >= class290.field4061) {
                                var48 = class290.field4061;
                            }
                            if (arg6 < 0) {
                                var46 = 0;
                            } else if (arg6 >= class211.field2954) {
                                var46 = class211.field2954;
                            }
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (class211.field2954 <= var47) {
                                var47 = class211.field2954;
                            }
                            int var49 = arg4 + 64;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 >= class290.field4061) {
                                var49 = class290.field4061;
                            }
                            while (var46 < var47) {
                                while (var49 > var48) {
                                    class132.field1889[var40][var46][var48] = class132.field1889[var40 - 1][var46][var48];
                                    var48++;
                                }
                                var46++;
                            }
                        }
                    }
                }
                var21 = true;
            }
        }
        if (!arg1) {
            class76 var23 = null;
            while (true) {
                while (var16.field230.length > var16.field191) {
                    int var28 = var16.method172((byte) 52);
                    if (var28 == 0) {
                        var23 = new class76(var16);
                    } else if (var28 == 1) {
                        int var29 = var16.method172((byte) 52);
                        if (var29 > 0) {
                            for (int var30 = 0; var30 < var29; var30++) {
                                class404 var31 = new class404(var16);
                                if (var31.field5739 == 31) {
                                    class17 var32 = class190.method1236(var16.method174(255), -23001);
                                    var31.method2536(var32.field304, var32.field301, var32.field308, -15432, var32.field309);
                                }
                                var31.field407 += arg6 << 7;
                                var31.field408 += arg4 << 7;
                                int var33 = var31.field407 >> 7;
                                int var34 = var31.field408 >> 7;
                                if (var33 >= 0 && var34 >= 0 && class211.field2954 > var33 && class290.field4061 > var34) {
                                    var31.field409 = class57.field783[var31.field5744][var33][var34] - var31.field409;
                                    if (arg7.method48() > 0) {
                                        class48.method417(var31);
                                    }
                                }
                            }
                        }
                    } else if (var28 == 2) {
                        if (var23 == null) {
                            var23 = new class76();
                        }
                        var23.method560(9231, var16);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var23 != null) {
                    for (int var24 = 0; var24 < 8; var24++) {
                        for (int var25 = 0; var25 < 8; var25++) {
                            int var26 = (arg6 >> 3) + var24;
                            int var27 = (arg4 >> 3) + var25;
                            if (var26 >= 0 && (class211.field2954 >> 3) > var26 && var27 >= 0 && class290.field4061 >> 3 > var27) {
                                class370.method2376((byte) 119, var23, var26, var27);
                            }
                        }
                    }
                }
                break;
            }
        }
        if (!var21 && class132.field1889 != null) {
            for (int var35 = 0; var35 < 4; var35++) {
                if (class132.field1889[var35] != null) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        for (int var37 = 0; var37 < 16; var37++) {
                            int var38 = (arg6 >> 2) + var36;
                            int var39 = (arg4 >> 2) + var37;
                            if (var38 >= 0 && var38 < 26 && var39 >= 0 && var39 < 26) {
                                class132.field1889[var35][var38][var39] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class288.field4053;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([JI[IZI)V", line = 882)
    public static final void method478(long[] arg0, int arg1, int[] arg2, boolean arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var9;
            for (int var10 = arg4; var10 < arg1; var10++) {
                if (arg0[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var13 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var13;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var9;
            method478(arg0, var6 - 1, arg2, false, arg4);
            method478(arg0, arg1, arg2, false, var6 + 1);
        }
        field860++;
        if (arg3) {
            field861 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V", line = 937)
    public static void method479(byte arg0) {
        field857 = null;
        field855 = null;
        field861 = null;
        int var1 = -2 % ((arg0 - 12) / 59);
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I)V", line = 968)
    public class62(int arg0) {
        this.field851 = arg0;
    }
}
