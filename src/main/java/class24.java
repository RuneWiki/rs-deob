import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 extends class5 {

    @OriginalMember(owner = "client!db", name = "P", descriptor = "[I")
    public int[] field659 = new int[5];

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public int field665 = 0;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "[Ltb;")
    public class134[] field666 = new class134[5];

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "Lsf;")
    public static class131 field658 = new class131(64);

    @OriginalMember(owner = "client!db", name = "U", descriptor = "Lhe;")
    public static class54 field664 = class6.method58("leuchten3:", false);

    @OriginalMember(owner = "client!db", name = "S", descriptor = "[[S")
    public static short[][] field662 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "Lhe;")
    public static class54 field671 = class6.method58("", false);

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "Lhe;")
    public static class54 field675 = class6.method58("Untersuchen", false);

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "Lhe;")
    public static class54 field679 = field671;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "Lsf;")
    public static class131 field678 = new class131(260);

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "Lhe;")
    private static class54 field687 = class6.method58("Loaded fonts", false);

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "Lhe;")
    public static class54 field688 = class6.method58("Bitte geben Sie Ihren Benutzenamen ein)3", false);

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "Lhe;")
    public static class54 field683 = field687;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public int field660;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
    public int field685;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "Lre;")
    public class123 field667;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "Ltc;")
    public class135 field674;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "Lva;")
    public class147 field686;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "Ldb;")
    public class24 field669;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "Lgd;")
    public static class46 field672;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Lha;")
    public class50 field655;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "Lb;")
    public class8 field680;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "Lnf;")
    public class96 field654;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "Z")
    public boolean field653;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "Z")
    public boolean field657;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Z")
    public boolean field661;

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(III)V")
    public class24(int arg0, int arg1, int arg2) {
        this.field663 = arg2;
        this.field670 = arg1;
        this.field682 = this.field677 = arg0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II[Lnc;)V")
    public static final void method187(int arg0, int arg1, class93[] arg2) {
        field676++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class93 var4 = arg2[var3];
            if (var4 != null && var4.field2284 == arg0 && (!var4.field2279 || !class103.method804(110, var4))) {
                if (var4.field2359 == 0) {
                    if (!var4.field2279 && class103.method804(116, var4) && class64.field1551 != var4) {
                        continue;
                    }
                    method187(var4.field2273, arg1, arg2);
                    if (var4.field2316 != null) {
                        method187(var4.field2273, 31, var4.field2316);
                    }
                    class112 var5 = (class112) class63.field1530.method246((byte) 117, (long) var4.field2273);
                    if (var5 != null) {
                        class22.method178(var5.field2691, arg1 ^ 0xFFFFB092);
                    }
                }
                if (var4.field2359 == 6) {
                    if (var4.field2311 != -1 || var4.field2274 != -1) {
                        boolean var6 = class68.method537(var4, 2);
                        int var7;
                        if (var6) {
                            var7 = var4.field2274;
                        } else {
                            var7 = var4.field2311;
                        }
                        if (var7 != -1) {
                            class142 var8 = class135.method1010(var7, (byte) -109);
                            var4.field2342 += class52.field1247;
                            while (var8.field3247[var4.field2254] < var4.field2342) {
                                var4.field2342 -= var8.field3247[var4.field2254];
                                var4.field2254++;
                                if (var4.field2254 >= var8.field3258.length) {
                                    var4.field2254 -= var8.field3249;
                                    if (var4.field2254 < 0 || var8.field3258.length <= var4.field2254) {
                                        var4.field2254 = 0;
                                    }
                                }
                                class134.method1005(var4, arg1 - 31);
                            }
                        }
                    }
                    if (var4.field2346 != 0 && !var4.field2279) {
                        int var9 = var4.field2346 >> 16;
                        int var10 = class52.field1247 * var9;
                        var4.field2314 = var4.field2314 + var10 & 0x7FF;
                        int var11 = var4.field2346 << 16 >> 16;
                        int var12 = class52.field1247 * var11;
                        var4.field2337 = var4.field2337 + var12 & 0x7FF;
                        class134.method1005(var4, arg1 ^ 0x1F);
                    }
                }
            }
        }
        if (arg1 != 31) {
            method189(-35, 104, -116, null, -107, -109, -48, -35, -39);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
    public static final void method188(byte arg0, int arg1) {
        field656++;
        int var2 = -33 / ((15 - arg0) / 38);
        for (class108 var3 = (class108) class129.field2900.method245((byte) -61); var3 != null; var3 = (class108) class129.field2900.method244((byte) -25)) {
            if ((var3.field154 >> 48 & 0xFFFFL) == (long) arg1) {
                var3.method48(-315);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III[Lnc;IIIII)V")
    public static final void method189(int arg0, int arg1, int arg2, class93[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 < 94) {
            field658 = null;
        }
        field651++;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            class93 var10 = arg3[var9];
            if (var10 != null && (!var10.field2279 || var10.field2359 == 0 || var10.field2338 || class105.method810(var10, -22389) != 0 || class115.field2725 == var10) && var10.field2284 == arg8 && (!var10.field2279 || !class103.method804(114, var10))) {
                int var11 = var10.field2313 + arg1;
                int var12 = var10.field2282 + arg0;
                if (class133.field3017 == var10) {
                    class65.field1567 = var12;
                    class38.field991 = var11;
                    class111.field2660 = true;
                }
                int var13;
                int var15;
                int var16;
                int var18;
                if (var10.field2359 == 2) {
                    var16 = arg2;
                    var18 = arg6;
                    var15 = arg5;
                    var13 = arg7;
                } else if (var10.field2359 == 9) {
                    int var19 = var12;
                    int var20 = var10.field2257 + var12;
                    int var21 = var11;
                    int var22 = var11 + var10.field2286;
                    if (var12 > var20) {
                        var19 = var20;
                        var20 = var12;
                    }
                    if (var22 < var11) {
                        var21 = var22;
                        var22 = var11;
                    }
                    var22++;
                    var20++;
                    var15 = arg5 <= var20 ? arg5 : var20;
                    var16 = arg2 < var21 ? var21 : arg2;
                    var18 = arg6 > var22 ? var22 : arg6;
                    var13 = var19 <= arg7 ? arg7 : var19;
                } else {
                    var13 = var12 > arg7 ? var12 : arg7;
                    int var14 = var12 + var10.field2257;
                    var15 = arg5 <= var14 ? arg5 : var14;
                    var16 = var11 <= arg2 ? arg2 : var11;
                    int var17 = var10.field2286 + var11;
                    var18 = arg6 <= var17 ? arg6 : var17;
                }
                if (!var10.field2279 || var13 < var15 && var18 > var16) {
                    if (var10.field2328 == 1337) {
                        class134.method1005(var10, 0);
                    } else if (var10.field2328 == 1338) {
                        class77.method591(var11, var12, 0);
                    } else {
                        if (var10.field2359 == 0) {
                            if (!var10.field2279 && class103.method804(110, var10) && class64.field1551 != var10) {
                                continue;
                            }
                            method189(var12 - var10.field2332, var11 - var10.field2339, var16, arg3, 111, var15, var18, var13, var10.field2273);
                            if (var10.field2316 != null) {
                                method189(var12 - var10.field2332, var11 - var10.field2339, var16, var10.field2316, 106, var15, var18, var13, var10.field2273);
                            }
                            class112 var25 = (class112) class63.field1530.method246((byte) 117, (long) var10.field2273);
                            if (var25 != null) {
                                class9.method74(var12, var15, 0, var25.field2691, var11, var18, var16, var13);
                            }
                        }
                        if (var10.field2279) {
                            boolean var26;
                            if (class71.field1772 >= var13 && var16 <= class7.field211 && var15 > class71.field1772 && var18 > class7.field211) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class124.field2854 == 1 && var13 <= class71.field1763 && var16 <= class21.field582 && var15 > class71.field1763 && class21.field582 < var18) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class22.field620 == 1 && var26) {
                                var28 = true;
                            }
                            if (var27) {
                                class4.method32((byte) 85, class21.field582 - var11, -var12 + class71.field1763, var10);
                            }
                            if (class133.field3017 != null && class133.field3017 != var10 && var26 && class12.method90(class105.method810(var10, -22389), 126)) {
                                class108.field2638 = var10;
                            }
                            if (class115.field2725 == var10) {
                                class3.field82 = var12;
                                class53.field1282 = var11;
                                class65.field1564 = true;
                            }
                            if (var10.field2338) {
                                if (var26 && class6.field184 != 0 && var10.field2270 != null) {
                                    class100 var29 = new class100();
                                    var29.field2537 = var10;
                                    var29.field2535 = class6.field184;
                                    var29.field2522 = var10.field2270;
                                    class5.field148.method976(var29, (byte) -125);
                                }
                                if (class133.field3017 != null || class6.field179 != null || class133.field3007) {
                                    var26 = false;
                                    var27 = false;
                                    var28 = false;
                                }
                                if (!var10.field2233 && var27) {
                                    var10.field2233 = true;
                                    if (var10.field2268 != null) {
                                        class100 var30 = new class100();
                                        var30.field2523 = class71.field1763 - var12;
                                        var30.field2535 = class21.field582 - var11;
                                        var30.field2537 = var10;
                                        var30.field2522 = var10.field2268;
                                        class5.field148.method976(var30, (byte) -118);
                                    }
                                }
                                if (var10.field2233 && var28 && var10.field2322 != null) {
                                    class100 var31 = new class100();
                                    var31.field2522 = var10.field2322;
                                    var31.field2537 = var10;
                                    var31.field2523 = class71.field1772 - var12;
                                    var31.field2535 = class7.field211 - var11;
                                    class5.field148.method976(var31, (byte) -118);
                                }
                                if (var10.field2233 && !var28) {
                                    var10.field2233 = false;
                                    if (var10.field2353 != null) {
                                        class100 var32 = new class100();
                                        var32.field2522 = var10.field2353;
                                        var32.field2537 = var10;
                                        var32.field2535 = class7.field211 - var11;
                                        var32.field2523 = class71.field1772 - var12;
                                        class34.field843.method976(var32, (byte) -125);
                                    }
                                }
                                if (var28 && var10.field2321 != null) {
                                    class100 var33 = new class100();
                                    var33.field2522 = var10.field2321;
                                    var33.field2535 = class7.field211 - var11;
                                    var33.field2537 = var10;
                                    var33.field2523 = class71.field1772 - var12;
                                    class5.field148.method976(var33, (byte) -119);
                                }
                                if (!var10.field2290 && var26) {
                                    var10.field2290 = true;
                                    if (var10.field2366 != null) {
                                        class100 var34 = new class100();
                                        var34.field2535 = class7.field211 - var11;
                                        var34.field2537 = var10;
                                        var34.field2523 = class71.field1772 - var12;
                                        var34.field2522 = var10.field2366;
                                        class5.field148.method976(var34, (byte) -127);
                                    }
                                }
                                if (var10.field2290 && var26 && var10.field2323 != null) {
                                    class100 var35 = new class100();
                                    var35.field2537 = var10;
                                    var35.field2522 = var10.field2323;
                                    var35.field2535 = class7.field211 - var11;
                                    var35.field2523 = class71.field1772 - var12;
                                    class5.field148.method976(var35, (byte) -126);
                                }
                                if (var10.field2290 && !var26) {
                                    var10.field2290 = false;
                                    if (var10.field2283 != null) {
                                        class100 var36 = new class100();
                                        var36.field2522 = var10.field2283;
                                        var36.field2523 = class71.field1772 - var12;
                                        var36.field2537 = var10;
                                        var36.field2535 = class7.field211 - var11;
                                        class34.field843.method976(var36, (byte) -121);
                                    }
                                }
                                if (var10.field2301 != null) {
                                    class100 var37 = new class100();
                                    var37.field2537 = var10;
                                    var37.field2522 = var10.field2301;
                                    class26.field702.method976(var37, (byte) -124);
                                }
                                if (var10.field2360 != null && class150.field3392 > var10.field2241) {
                                    if (var10.field2362 == null || class150.field3392 - var10.field2241 > 32) {
                                        class100 var42 = new class100();
                                        var42.field2522 = var10.field2360;
                                        var42.field2537 = var10;
                                        class5.field148.method976(var42, (byte) -121);
                                    } else {
                                        label379: for (int var38 = var10.field2241; var38 < class150.field3392; var38++) {
                                            int var39 = class52.field1243[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field2362.length; var40++) {
                                                if (var10.field2362[var40] == var39) {
                                                    class100 var41 = new class100();
                                                    var41.field2537 = var10;
                                                    var41.field2522 = var10.field2360;
                                                    class5.field148.method976(var41, (byte) -124);
                                                    break label379;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2241 = class150.field3392;
                                }
                                if (var10.field2256 != null && class17.field508 > var10.field2239) {
                                    if (var10.field2335 == null || class17.field508 - var10.field2239 > 32) {
                                        class100 var47 = new class100();
                                        var47.field2522 = var10.field2256;
                                        var47.field2537 = var10;
                                        class5.field148.method976(var47, (byte) -121);
                                    } else {
                                        label359: for (int var43 = var10.field2239; var43 < class17.field508; var43++) {
                                            int var44 = class2.field25[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field2335.length; var45++) {
                                                if (var10.field2335[var45] == var44) {
                                                    class100 var46 = new class100();
                                                    var46.field2537 = var10;
                                                    var46.field2522 = var10.field2256;
                                                    class5.field148.method976(var46, (byte) -119);
                                                    break label359;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2239 = class17.field508;
                                }
                                if (var10.field2289 != null && var10.field2276 < class146.field3307) {
                                    if (var10.field2331 == null || class146.field3307 - var10.field2276 > 32) {
                                        class100 var52 = new class100();
                                        var52.field2522 = var10.field2289;
                                        var52.field2537 = var10;
                                        class5.field148.method976(var52, (byte) -117);
                                    } else {
                                        label339: for (int var48 = var10.field2276; var48 < class146.field3307; var48++) {
                                            int var49 = class79.field1932[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field2331.length; var50++) {
                                                if (var10.field2331[var50] == var49) {
                                                    class100 var51 = new class100();
                                                    var51.field2537 = var10;
                                                    var51.field2522 = var10.field2289;
                                                    class5.field148.method976(var51, (byte) -122);
                                                    break label339;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2276 = class146.field3307;
                                }
                                if (class134.field3024 > var10.field2341 && var10.field2281 != null) {
                                    class100 var53 = new class100();
                                    var53.field2522 = var10.field2281;
                                    var53.field2537 = var10;
                                    class5.field148.method976(var53, (byte) -128);
                                }
                                if (var10.field2341 < class3.field60 && var10.field2352 != null) {
                                    class100 var54 = new class100();
                                    var54.field2522 = var10.field2352;
                                    var54.field2537 = var10;
                                    class5.field148.method976(var54, (byte) -121);
                                }
                                if (var10.field2341 < class53.field1289 && var10.field2356 != null) {
                                    class100 var55 = new class100();
                                    var55.field2537 = var10;
                                    var55.field2522 = var10.field2356;
                                    class5.field148.method976(var55, (byte) -124);
                                }
                                if (var10.field2341 < class80.field1959 && var10.field2305 != null) {
                                    class100 var56 = new class100();
                                    var56.field2522 = var10.field2305;
                                    var56.field2537 = var10;
                                    class5.field148.method976(var56, (byte) -120);
                                }
                                var10.field2341 = class84.field2084;
                                if (var10.field2231 != null) {
                                    for (int var57 = 0; var57 < class150.field3388; var57++) {
                                        class100 var58 = new class100();
                                        var58.field2537 = var10;
                                        var58.field2528 = class95.field2420[var57];
                                        var58.field2536 = class95.field2409[var57];
                                        var58.field2522 = var10.field2231;
                                        class5.field148.method976(var58, (byte) -118);
                                    }
                                }
                            }
                        }
                        if (!var10.field2279) {
                            if (class133.field3017 != null || class6.field179 != null || class133.field3007) {
                                return;
                            }
                            if ((var10.field2237 >= 0 || var10.field2298 != 0) && class71.field1772 >= var13 && var16 <= class7.field211 && class71.field1772 < var15 && var18 > class7.field211) {
                                if (var10.field2237 >= 0) {
                                    class64.field1551 = arg3[var10.field2237];
                                } else {
                                    class64.field1551 = var10;
                                }
                            }
                            if (var10.field2359 == 8 && var13 <= class71.field1772 && class7.field211 >= var16 && var15 > class71.field1772 && var18 > class7.field211) {
                                class84.field2095 = var10;
                            }
                            if (var10.field2286 < var10.field2307) {
                                class5.method52(class71.field1772, var12 + var10.field2257, 124, var10.field2307, var10.field2286, var10, var11, class7.field211);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
    public static void method190(boolean arg0) {
        field683 = null;
        field658 = null;
        field662 = null;
        field675 = null;
        field671 = null;
        field679 = null;
        field672 = null;
        if (!arg0) {
            method189(108, -47, 67, null, 14, 10, -64, -112, 21);
        }
        field678 = null;
        field664 = null;
        field687 = null;
        field688 = null;
    }
}
