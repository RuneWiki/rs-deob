import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class107 extends class121 {

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "[Lle;")
    public class81[] field2613;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lhe;")
    public static class54 field2610 = class6.method58("Keine Antwort vom Server)3", false);

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    public static int field2614 = 0;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    public static int field2615 = 0;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lhe;")
    public static class54 field2612 = class6.method58("Wordpack geladen)3", false);

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "Lhe;")
    public static class54 field2620 = class6.method58("Einloggen", false);

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "Lhe;")
    private static class54 field2623 = class6.method58("Unable to connect)3", false);

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "Lhe;")
    public static class54 field2611 = field2623;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "Lhe;")
    public static class54 field2622 = field2623;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "Leb;")
    public static class31 field2621;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Lhc;")
    public static final class52 method813(int arg0, int arg1) {
        if (arg0 != -23222) {
            field2614 = -32;
        }
        field2609++;
        class52 var2 = (class52) class131.field2978.method991((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class1.field21.method266(13, (byte) 107, arg1);
        class52 var4 = new class52();
        var4.field1263 = arg1;
        if (var3 != null) {
            var4.method369(-40, new class83(var3));
        }
        class131.field2978.method990(true, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIILef;)Z")
    public static final boolean method814(int arg0, int arg1, int arg2, class35 arg3) {
        field2624++;
        if (arg0 != -30384) {
            field2610 = null;
        }
        byte[] var4 = arg3.method266(arg2, (byte) 122, arg1);
        if (var4 == null) {
            return false;
        } else {
            class129.method968(var4, -112);
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLef;)V")
    public static final void method815(byte arg0, class35 arg1) {
        class14.field399 = arg1;
        field2625++;
        if (arg0 != 26) {
            field2615 = -24;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLfb;)V")
    public static final void method816(boolean arg0, class38 arg1) {
        field2618++;
        arg1.field961 = arg1.field969;
        if (arg1.field932 == 0) {
            arg1.field970 = 0;
            return;
        }
        if (arg1.field981 != -1 && arg1.field926 == 0) {
            class142 var2 = class135.method1010(arg1.field981, (byte) -118);
            if (arg1.field940 > 0 && var2.field3230 == 0) {
                arg1.field970++;
                return;
            }
            if (arg1.field940 <= 0 && var2.field3235 == 0) {
                arg1.field970++;
                return;
            }
        }
        int var3 = arg1.field974;
        int var4 = arg1.field971;
        int var5 = arg1.field951[arg1.field932 - 1] * 128 + arg1.field948 * 64;
        int var6 = arg1.field952[arg1.field932 - 1] * 128 + arg1.field948 * 64;
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg1.field974 = var6;
            arg1.field971 = var5;
            return;
        }
        if (var6 <= var3) {
            if (var3 <= var6) {
                if (var5 > var4) {
                    arg1.field921 = 1024;
                } else if (var5 < var4) {
                    arg1.field921 = 0;
                }
            } else if (var5 > var4) {
                arg1.field921 = 768;
            } else if (var5 >= var4) {
                arg1.field921 = 512;
            } else {
                arg1.field921 = 256;
            }
        } else if (var5 > var4) {
            arg1.field921 = 1280;
        } else if (var5 < var4) {
            arg1.field921 = 1792;
        } else {
            arg1.field921 = 1536;
        }
        int var7 = arg1.field973;
        int var8 = arg1.field921 - arg1.field923 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field976;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field955;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field967;
        }
        if (var7 == -1) {
            var7 = arg1.field976;
        }
        arg1.field961 = var7;
        int var9 = 4;
        boolean var10 = true;
        if (arg1 instanceof class120) {
            var10 = ((class120) arg1).field2788.field253;
        }
        if (var10) {
            if (arg1.field923 != arg1.field921 && arg1.field997 == -1 && arg1.field941 != 0) {
                var9 = 2;
            }
            if (arg1.field932 > 2) {
                var9 = 6;
            }
            if (arg1.field932 > 3) {
                var9 = 8;
            }
            if (arg1.field970 > 0 && arg1.field932 > 1) {
                arg1.field970--;
                var9 = 8;
            }
        } else {
            if (arg1.field932 > 1) {
                var9 = 6;
            }
            if (arg1.field932 > 2) {
                var9 = 8;
            }
            if (arg1.field970 > 0 && arg1.field932 > 1) {
                var9 = 8;
                arg1.field970--;
            }
        }
        if (arg1.field993[arg1.field932 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg1.field976 == arg1.field961 && arg1.field978 != -1) {
            arg1.field961 = arg1.field978;
        }
        if (var6 > var3) {
            arg1.field974 += var9;
            if (var6 < arg1.field974) {
                arg1.field974 = var6;
            }
        } else if (var6 < var3) {
            arg1.field974 -= var9;
            if (var6 > arg1.field974) {
                arg1.field974 = var6;
            }
        }
        if (var5 > var4) {
            arg1.field971 += var9;
            if (arg1.field971 > var5) {
                arg1.field971 = var5;
            }
        } else if (var4 > var5) {
            arg1.field971 -= var9;
            if (arg1.field971 < var5) {
                arg1.field971 = var5;
            }
        }
        if (arg1.field974 == var6 && arg1.field971 == var5) {
            arg1.field932--;
            if (arg1.field940 > 0) {
                arg1.field940--;
            }
        }
        if (arg0) {
            field2620 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public static void method817(int arg0) {
        field2612 = null;
        field2610 = null;
        field2621 = null;
        field2623 = null;
        field2620 = null;
        if (arg0 <= 38) {
            field2611 = null;
        }
        field2611 = null;
        field2622 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Z")
    public final boolean method818(byte arg0, int arg1) {
        if (arg0 != 74) {
            field2611 = null;
        }
        field2616++;
        return this.field2613[arg1].field2002;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZLvc;)V")
    public static final void method819(boolean arg0, boolean arg1, class149 arg2) {
        if (class75.field1862 != null) {
            try {
                class75.field1862.method1130(-31709);
            } catch (Exception var8) {
            }
            class75.field1862 = null;
        }
        field2619++;
        class75.field1862 = arg2;
        if (arg1) {
            return;
        }
        class70.method553(122, arg0);
        class147.field3321.field2076 = 0;
        class77.field1874 = null;
        class139.field3187 = 0;
        class67.field1651 = null;
        while (true) {
            class84 var3 = (class84) class99.field2509.method245((byte) 104);
            if (var3 == null) {
                while (true) {
                    class84 var4 = (class84) class72.field1803.method245((byte) -85);
                    if (var4 == null) {
                        if (class15.field460 != 0) {
                            try {
                                class83 var5 = new class83(4);
                                var5.method649((byte) -27, 4);
                                var5.method649((byte) -27, class15.field460);
                                var5.method629(0, 2018779304);
                                class75.field1862.method1132(4, 0, 122, var5.field2055);
                            } catch (IOException var7) {
                                try {
                                    class75.field1862.method1130(-31709);
                                } catch (Exception var6) {
                                }
                                class133.field3002++;
                                class75.field1862 = null;
                            }
                        }
                        class139.field3182 = 0;
                        class14.field414 = class102.method801((byte) -42);
                        return;
                    }
                    class4.field107.method3(var4, 1);
                    class115.field2737.method241(var4, var4.field154, false);
                    class8.field240--;
                    class149.field3386++;
                }
            }
            class75.field1853.method241(var3, var3.field154, false);
            class125.field2872--;
            class63.field1539++;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lef;Lef;IZ)V")
    public class107(class35 arg0, class35 arg1, int arg2, boolean arg3) {
        class130 var5 = new class130();
        int var6 = arg0.method262(arg2, true);
        this.field2613 = new class81[var6];
        int[] var7 = arg0.method270(107, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class143 var9 = null;
            byte[] var10 = arg0.method266(arg2, (byte) 92, var7[var8]);
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            for (class143 var12 = (class143) var5.method979(-126); var12 != null; var12 = (class143) var5.method983(18485)) {
                if (var12.field3265 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method259(var11, (byte) -80, 0);
                } else {
                    var13 = arg1.method259(0, (byte) -81, var11);
                }
                var9 = new class143(var11, var13);
                var5.method976(var9, (byte) -121);
            }
            this.field2613[var7[var8]] = new class81(var10, var9);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([Lac;Ltd;B)V")
    public static final void method820(class4[] arg0, class136 arg1, byte arg2) {
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((class87.field2152[var3][var111][var112] & 0x1) == 1) {
                        int var113 = var3;
                        if ((class87.field2152[1][var111][var112] & 0x2) == 2) {
                            var113 = var3 - 1;
                        }
                        if (var113 >= 0) {
                            arg0[var113].method41(var111, var112, 2097152);
                        }
                    }
                }
            }
        }
        class111.field2675 += (int) (Math.random() * 5.0D) - 2;
        if (class111.field2675 < -8) {
            class111.field2675 = -8;
        }
        class112.field2689 += (int) (Math.random() * 5.0D) - 2;
        field2617++;
        if (class112.field2689 < -16) {
            class112.field2689 = -16;
        }
        if (class112.field2689 > 16) {
            class112.field2689 = 16;
        }
        if (class111.field2675 > 8) {
            class111.field2675 = 8;
        }
        int var4 = 112 % ((arg2 - 59) / 33);
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = class100.field2530[var5];
            int var49 = (int) Math.sqrt(5100.0D);
            int var50 = var49 * 768 >> 8;
            for (int var51 = 1; var51 < 103; var51++) {
                for (int var102 = 1; var102 < 103; var102++) {
                    int var103 = class141.field3211[var5][var102 + 1][var51] - class141.field3211[var5][var102 - 1][var51];
                    int var104 = class141.field3211[var5][var102][var51 + 1] - class141.field3211[var5][var102][var51 - 1];
                    int var105 = (int) Math.sqrt((double) (var103 * var103 + var104 * var104 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var108 * -50 + var106 * -50 + var107 * -10) / var50 + 96;
                    int var110 = (var48[var102][var51 - 1] >> 2) + ((var48[var102 + 1][var51] >> 3) + (var48[var102 - 1][var51] >> 2) - (-(var48[var102][var51 + 1] >> 3) + -(var48[var102][var51] >> 1)));
                    class70.field1727[var102][var51] = var109 - var110;
                }
            }
            for (int var52 = 0; var52 < 104; var52++) {
                class141.field3206[var52] = 0;
                class87.field2151[var52] = 0;
                class132.field2988[var52] = 0;
                class130.field2938[var52] = 0;
                class54.field1318[var52] = 0;
            }
            for (int var53 = -5; var53 < 109; var53++) {
                for (int var56 = 0; var56 < 104; var56++) {
                    int var96 = var53 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < 104) {
                        int var97 = class27.field728[var5][var96][var56] & 0xFF;
                        if (var97 > 0) {
                            class6 var98 = class56.method440(var97 - 1, -7988);
                            class141.field3206[var56] += var98.field201;
                            class87.field2151[var56] += var98.field182;
                            class132.field2988[var56] += var98.field194;
                            class130.field2938[var56] += var98.field200;
                            var10002 = class54.field1318[var56]++;
                        }
                    }
                    int var99 = var53 - 5;
                    if (var99 >= 0 && var99 < 104) {
                        int var100 = class27.field728[var5][var99][var56] & 0xFF;
                        if (var100 > 0) {
                            class6 var101 = class56.method440(var100 - 1, -7988);
                            class141.field3206[var56] -= var101.field201;
                            class87.field2151[var56] -= var101.field182;
                            class132.field2988[var56] -= var101.field194;
                            class130.field2938[var56] -= var101.field200;
                            var10002 = class54.field1318[var56]--;
                        }
                    }
                }
                if (var53 >= 1 && var53 < 103) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 109; var62++) {
                        int var63 = var62 - 5;
                        int var64 = var62 + 5;
                        if (var64 >= 0 && var64 < 104) {
                            var57 += class141.field3206[var64];
                            var61 += class130.field2938[var64];
                            var59 += class132.field2988[var64];
                            var58 += class87.field2151[var64];
                            var60 += class54.field1318[var64];
                        }
                        if (var63 >= 0 && var63 < 104) {
                            var57 -= class141.field3206[var63];
                            var59 -= class132.field2988[var63];
                            var61 -= class130.field2938[var63];
                            var58 -= class87.field2151[var63];
                            var60 -= class54.field1318[var63];
                        }
                        if (var62 >= 1 && var62 < 103 && (!class118.field2768 || (class87.field2152[0][var53][var62] & 0x2) != 0 || (class87.field2152[var5][var53][var62] & 0x10) == 0 && class108.method824(var53, 0, var5, var62) == class94.field2373)) {
                            if (var5 < class39.field1002) {
                                class39.field1002 = var5;
                            }
                            int var65 = class27.field728[var5][var53][var62] & 0xFF;
                            int var66 = class118.field2760[var5][var53][var62] & 0xFF;
                            if (var65 > 0 || var66 > 0) {
                                int var67 = class141.field3211[var5][var53 + 1][var62];
                                int var68 = class141.field3211[var5][var53][var62];
                                int var69 = class141.field3211[var5][var53 + 1][var62 + 1];
                                int var70 = class141.field3211[var5][var53][var62 + 1];
                                int var71 = class70.field1727[var53][var62];
                                int var72 = class70.field1727[var53 + 1][var62];
                                int var73 = class70.field1727[var53 + 1][var62 + 1];
                                int var74 = class70.field1727[var53][var62 + 1];
                                int var75 = -1;
                                int var76 = -1;
                                if (var65 > 0) {
                                    int var77 = var57 * 256 / var61;
                                    int var78 = var58 / var60;
                                    int var79 = var59 / var60;
                                    var75 = class5.method51((byte) -1, var79, var78, var77);
                                    int var80 = class111.field2675 + var77 & 0xFF;
                                    int var81 = class112.field2689 + var79;
                                    if (var81 < 0) {
                                        var81 = 0;
                                    } else if (var81 > 255) {
                                        var81 = 255;
                                    }
                                    var76 = class5.method51((byte) -1, var81, var78, var80);
                                }
                                if (var5 > 0) {
                                    boolean var82 = true;
                                    if (var65 == 0 && class84.field2085[var5][var53][var62] != 0) {
                                        var82 = false;
                                    }
                                    if (var66 > 0 && !class39.method297(var66 - 1, (byte) -112).field1855) {
                                        var82 = false;
                                    }
                                    if (var82 && var67 == var68 && var68 == var69 && var68 == var70) {
                                        class16.field474[var5][var53][var62] = class38.method292(class16.field474[var5][var53][var62], 2340);
                                    }
                                }
                                int var83 = 0;
                                if (var76 != -1) {
                                    var83 = class152.field3415[class123.method945(96, var76, 128)];
                                }
                                if (var66 == 0) {
                                    arg1.method1064(var5, var53, var62, 0, 0, -1, var68, var67, var69, var70, class123.method945(var71, var75, 128), class123.method945(var72, var75, 128), class123.method945(var73, var75, 128), class123.method945(var74, var75, 128), 0, 0, 0, 0, var83, 0);
                                } else {
                                    byte var84 = class84.field2096[var5][var53][var62];
                                    int var85 = class84.field2085[var5][var53][var62] + 1;
                                    class75 var86 = class39.method297(var66 - 1, (byte) -112);
                                    int var87 = var86.field1842;
                                    int var88;
                                    int var89;
                                    if (var87 >= 0) {
                                        var88 = -1;
                                        var89 = class152.field3422.method324(96, var87);
                                    } else if (var86.field1840 == 16711935) {
                                        var88 = -2;
                                        var87 = -1;
                                        var89 = -2;
                                    } else {
                                        var88 = class5.method51((byte) -1, var86.field1844, var86.field1854, var86.field1846);
                                        int var90 = var86.field1844 + class112.field2689;
                                        int var91 = class111.field2675 + var86.field1846 & 0xFF;
                                        if (var90 < 0) {
                                            var90 = 0;
                                        } else if (var90 > 255) {
                                            var90 = 255;
                                        }
                                        var89 = class5.method51((byte) -1, var90, var86.field1854, var91);
                                    }
                                    int var92 = 0;
                                    if (var89 != -2) {
                                        var92 = class152.field3415[class108.method823(var89, (byte) 96, 96)];
                                    }
                                    if (var86.field1838 != -1) {
                                        int var93 = class111.field2675 + var86.field1839 & 0xFF;
                                        int var94 = class112.field2689 + var86.field1843;
                                        if (var94 < 0) {
                                            var94 = 0;
                                        } else if (var94 > 255) {
                                            var94 = 255;
                                        }
                                        int var95 = class5.method51((byte) -1, var94, var86.field1851, var93);
                                        var92 = class152.field3415[class108.method823(var95, (byte) 96, 96)];
                                    }
                                    arg1.method1064(var5, var53, var62, var85, var84, var87, var68, var67, var69, var70, class123.method945(var71, var75, 128), class123.method945(var72, var75, 128), class123.method945(var73, var75, 128), class123.method945(var74, var75, 128), class108.method823(var88, (byte) 96, var71), class108.method823(var88, (byte) 96, var72), class108.method823(var88, (byte) 96, var73), class108.method823(var88, (byte) 96, var74), var83, var92);
                                }
                            }
                        }
                    }
                }
            }
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var55 = 1; var55 < 103; var55++) {
                    arg1.method1021(var5, var55, var54, class108.method824(var55, 0, var5, var54));
                }
            }
            class27.field728[var5] = null;
            class118.field2760[var5] = null;
            class84.field2085[var5] = null;
            class84.field2096[var5] = null;
            class100.field2530[var5] = null;
        }
        arg1.method1042(-50, -10, -50);
        for (int var6 = 0; var6 < 104; var6++) {
            for (int var47 = 0; var47 < 104; var47++) {
                if ((class87.field2152[1][var6][var47] & 0x2) == 2) {
                    arg1.method1026(var6, var47);
                }
            }
        }
        int var7 = 1;
        int var8 = 4;
        int var9 = 2;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var9 <<= 0x3;
                var7 <<= 0x3;
                var8 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= 104; var12++) {
                    for (int var13 = 0; var13 <= 104; var13++) {
                        if ((var7 & class16.field474[var11][var13][var12]) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            while (var14 > 0 && (class16.field474[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            int var16 = var11;
                            while (var15 < 104 && (class16.field474[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label353: while (var16 > 0) {
                                for (int var17 = var14; var17 <= var15; var17++) {
                                    if ((var7 & class16.field474[var16 - 1][var13][var17]) == 0) {
                                        break label353;
                                    }
                                }
                                var16--;
                            }
                            int var18;
                            label341: for (var18 = var11; var18 < var10; var18++) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((var7 & class16.field474[var18 + 1][var13][var19]) == 0) {
                                        break label341;
                                    }
                                }
                            }
                            int var20 = (var15 + 1 - var14) * (var18 + 1 - var16);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = class141.field3211[var18][var13][var14] - var21;
                                int var23 = class141.field3211[var16][var13][var14];
                                class136.method1050(var10, 1, var13 * 128, var13 * 128, var14 * 128, var15 * 128 + 128, var22, var23);
                                for (int var24 = var16; var24 <= var18; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        class16.field474[var24][var13][var25] = class118.method887(class16.field474[var24][var13][var25], ~var7);
                                    }
                                }
                            }
                        }
                        if ((class16.field474[var11][var13][var12] & var9) != 0) {
                            int var26;
                            for (var26 = var13; var26 > 0 && (class16.field474[var11][var26 - 1][var12] & var9) != 0; var26--) {
                            }
                            int var27 = var11;
                            int var28 = var11;
                            int var29;
                            for (var29 = var13; var29 < 104 && (var9 & class16.field474[var11][var29 + 1][var12]) != 0; var29++) {
                            }
                            label407: while (var27 > 0) {
                                for (int var30 = var26; var30 <= var29; var30++) {
                                    if ((var9 & class16.field474[var27 - 1][var30][var12]) == 0) {
                                        break label407;
                                    }
                                }
                                var27--;
                            }
                            label396: while (var10 > var28) {
                                for (int var31 = var26; var31 <= var29; var31++) {
                                    if ((var9 & class16.field474[var28 + 1][var31][var12]) == 0) {
                                        break label396;
                                    }
                                }
                                var28++;
                            }
                            int var32 = (var28 + 1 - var27) * (var29 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = class141.field3211[var28][var26][var12] - var33;
                                int var35 = class141.field3211[var27][var26][var12];
                                class136.method1050(var10, 2, var26 * 128, var29 * 128 + 128, var12 * 128, var12 * 128, var34, var35);
                                for (int var36 = var27; var36 <= var28; var36++) {
                                    for (int var37 = var26; var37 <= var29; var37++) {
                                        class16.field474[var36][var37][var12] = class118.method887(class16.field474[var36][var37][var12], ~var9);
                                    }
                                }
                            }
                        }
                        if ((class16.field474[var11][var13][var12] & var8) != 0) {
                            int var38 = var13;
                            int var39 = var12;
                            int var40 = var13;
                            while (var39 < 104 && (var8 & class16.field474[var11][var13][var39 + 1]) != 0) {
                                var39++;
                            }
                            int var41;
                            for (var41 = var12; var41 > 0 && (var8 & class16.field474[var11][var13][var41 - 1]) != 0; var41--) {
                            }
                            label461: while (var38 > 0) {
                                for (int var42 = var41; var42 <= var39; var42++) {
                                    if ((var8 & class16.field474[var11][var38 - 1][var42]) == 0) {
                                        break label461;
                                    }
                                }
                                var38--;
                            }
                            label450: while (var40 < 104) {
                                for (int var43 = var41; var43 <= var39; var43++) {
                                    if ((class16.field474[var11][var40 + 1][var43] & var8) == 0) {
                                        break label450;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var38) * (-var41 + 1 + var39) >= 4) {
                                int var44 = class141.field3211[var11][var38][var41];
                                class136.method1050(var10, 4, var38 * 128, var40 * 128 + 128, var41 * 128, var39 * 128 + 128, var44, var44);
                                for (int var45 = var38; var45 <= var40; var45++) {
                                    for (int var46 = var41; var46 <= var39; var46++) {
                                        class16.field474[var11][var45][var46] = class118.method887(class16.field474[var11][var45][var46], ~var8);
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
