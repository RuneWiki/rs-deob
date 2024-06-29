import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class85 {

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[I")
    private int[] field2175 = new int[256];

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "[I")
    private int[] field2166 = new int[256];

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lhb;")
    private static class44 field2171 = class102.method810("Loading wordpack )2 ", -28606);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Lhb;")
    private static class44 field2160 = class102.method810("Enter name of friend to add to list", -28606);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lhb;")
    public static class44 field2173 = class102.method810("Lade Konfig )2 ", -28606);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lhb;")
    public static class44 field2178 = class102.method810("::", -28606);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lhb;")
    public static class44 field2164 = field2160;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Lhb;")
    private static class44 field2183 = class102.method810("Loaded fonts", -28606);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lhb;")
    public static class44 field2158 = field2183;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Lhb;")
    public static class44 field2182 = class102.method810("backhmid2", -28606);

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2176 = 0;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lhb;")
    public static class44 field2184 = field2171;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    private int field2161;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    private int field2162;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    private int field2180;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lpc;")
    public static class93 field2172;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Z")
    public static boolean field2163;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[[[B")
    public static byte[][][] field2169;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 7)
    public static final void method688(byte arg0) {
        field2174++;
        class84.field2156++;
        class92.field2333.method702(true, 155);
        if (class47.field1152 != -1) {
            class116.method884(class47.field1152, (byte) -124);
            class131.field3141 = -1;
            class47.field1152 = -1;
            class88.field2251 = true;
            class101.field2572 = true;
        }
        if (class98.field2496 != -1) {
            class116.method884(class98.field2496, (byte) -119);
            class98.field2496 = -1;
            class16.field306 = true;
            class131.field3141 = -1;
        }
        if (class64.field1632 != -1) {
            class116.method884(class64.field1632, (byte) 39);
            class64.field1632 = -1;
            class131.method1009(30, -92);
        }
        if (class109.field2735 != -1) {
            class116.method884(class109.field2735, (byte) 97);
            class109.field2735 = -1;
        }
        if (class125.field3032 != -1) {
            class116.method884(class125.field3032, (byte) -105);
            class125.field3032 = -1;
        }
        if (arg0 != -25) {
            field2160 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 61)
    public static final void method689(int arg0) {
        while (true) {
            if (class53.field1304.method706(class14.field275, arg0 - 15016) >= 27) {
                int var1 = class53.field1304.method700(15, 91);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class116.field2845[var1] == null) {
                        class116.field2845[var1] = new class46();
                        var2 = true;
                    }
                    class46 var3 = class116.field2845[var1];
                    class100.field2515[class125.field3036++] = var1;
                    var3.field1345 = class2.field73;
                    int var4 = class53.field1304.method700(5, -110);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class34.field835[class53.field1304.method700(3, arg0 ^ 0x3AEC)];
                    if (var2) {
                        var3.field1419 = var5;
                    }
                    int var6 = class53.field1304.method700(5, -96);
                    var3.field1137 = class118.method913(class53.field1304.method700(13, -96), (byte) -117);
                    int var7 = class53.field1304.method700(1, 115);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var8 = class53.field1304.method700(1, 97);
                    if (var8 == 1) {
                        class96.field2446[class81.field2080++] = var1;
                    }
                    var3.field1417 = var3.field1137.field978;
                    var3.field1422 = var3.field1137.field997;
                    var3.field1373 = var3.field1137.field1022;
                    var3.field1391 = var3.field1137.field994;
                    var3.field1388 = var3.field1137.field995;
                    var3.field1370 = var3.field1137.field1020;
                    var3.field1356 = var3.field1137.field1007;
                    if (var3.field1373 == 0) {
                        var3.field1419 = 0;
                    }
                    var3.field1333 = var3.field1137.field1028;
                    var3.field1390 = var3.field1137.field999;
                    var3.method509(8613, var7 == 1, class72.field1820.field1350[0] + var4, class72.field1820.field1355[0] + var6);
                    continue;
                }
            }
            class53.field1304.method704(arg0 - 15141);
            field2165++;
            if (arg0 != 15024) {
                method695((byte) -105);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 137)
    private final void method690(int arg0) {
        field2181++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 != 6182) {
            return;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var62 + var65;
            var6 = var68 ^ var65 >>> 16;
            int var69 = var3 + var6;
            int var70 = var4 + var67;
            int var71 = var65 + var70;
            var5 = var71 ^ var70 << 10;
            int var72 = var69 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var69 >>> 4;
            int var74 = var4 + var61;
            int var75 = var69 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2166[var11 + 2] + var7;
            int var38 = this.field2166[var11 + 7] + var2;
            int var39 = this.field2166[var11 + 1] + var8;
            int var40 = this.field2166[var11 + 6] + var3;
            int var41 = this.field2166[var11] + var9;
            int var42 = this.field2166[var11 + 3] + var6;
            int var43 = this.field2166[var11 + 4] + var5;
            int var44 = var41 ^ var39 << 11;
            int var45 = var37 + var39;
            int var46 = this.field2166[var11 + 5] + var4;
            int var47 = var45 ^ var37 >>> 2;
            int var48 = var43 + var47;
            int var49 = var42 + var44;
            int var50 = var37 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var48 + var49;
            int var53 = var46 + var51;
            var6 = var52 ^ var48 >>> 16;
            int var54 = var6 + var40;
            int var55 = var48 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var5 + var38;
            int var57 = var53 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            int var59 = var4 + var44;
            var3 = var58 ^ var56 << 8;
            int var60 = var56 + var59;
            var8 = var3 + var47;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field2175[var11] = var9;
            this.field2175[var11 + 1] = var8;
            var7 = var2 + var51;
            this.field2175[var11 + 2] = var7;
            this.field2175[var11 + 3] = var6;
            this.field2175[var11 + 4] = var5;
            this.field2175[var11 + 5] = var4;
            this.field2175[var11 + 6] = var3;
            this.field2175[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2175[var12 + 6] + var3;
            int var14 = this.field2175[var12 + 5] + var4;
            int var15 = this.field2175[var12 + 2] + var7;
            int var16 = this.field2175[var12 + 7] + var2;
            int var17 = this.field2175[var12 + 1] + var8;
            int var18 = this.field2175[var12] + var9;
            int var19 = var18 ^ var17 << 11;
            int var20 = var15 + var17;
            int var21 = this.field2175[var12 + 3] + var6;
            int var22 = var19 + var21;
            int var23 = this.field2175[var12 + 4] + var5;
            int var24 = var20 ^ var15 >>> 2;
            int var25 = var15 + var22;
            int var26 = var23 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var14 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var6 + var13;
            int var31 = var26 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var16;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var30 + var32;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var35 = var4 + var19;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field2175[var12] = var9;
            this.field2175[var12 + 1] = var8;
            this.field2175[var12 + 2] = var7;
            this.field2175[var12 + 3] = var6;
            this.field2175[var12 + 4] = var5;
            this.field2175[var12 + 5] = var4;
            this.field2175[var12 + 6] = var3;
            this.field2175[var12 + 7] = var2;
        }
        this.method696(30312);
        this.field2161 = 256;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)[Lne;", line = 292)
    public static final class83[] method691(int arg0) {
        int var1 = 97 / ((-arg0 - 11) / 63);
        field2179++;
        class83[] var2 = new class83[class101.field2570];
        for (int var3 = 0; var3 < class101.field2570; var3++) {
            class83 var4 = var2[var3] = new class83();
            var4.field2126 = class31.field768;
            var4.field2124 = class77.field1935;
            var4.field2128 = class63.field1602[var3];
            var4.field2123 = class84.field2133[var3];
            var4.field2127 = class41.field941[var3];
            var4.field2125 = class63.field1607[var3];
            var4.field2129 = class117.field2861;
            var4.field2122 = class84.field2147[var3];
        }
        class113.method865(false);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V", line = 325)
    public static final void method692(byte arg0) {
        field2177++;
        class14.field276.method72(0);
        for (int var1 = 0; var1 < 32; var1++) {
            class113.field2785[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class81.field2086[var2] = 0L;
        }
        int var3 = 68 / ((arg0 - 78) / 48);
        class81.field2084 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)I", line = 359)
    public final int method693(byte arg0) {
        if (arg0 != 85) {
            field2160 = null;
        }
        if (this.field2161-- == 0) {
            this.method696(arg0 + 30227);
            this.field2161 = 255;
        }
        field2170++;
        return this.field2166[this.field2161];
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLra;I)V", line = 404)
    public static final void method694(int arg0, byte arg1, class103 arg2, int arg3) {
        if ((arg0 & 0x8) != 0) {
            int var4 = class53.field1304.method995(-69);
            byte[] var5 = new byte[var4];
            class131 var6 = new class131(var5);
            class53.field1304.method970(var4, true, 0, var5);
            class105.field2690[arg3] = var6;
            arg2.method812((byte) 79, var6);
        }
        field2167++;
        if ((arg0 & 0x10) != 0) {
            arg2.field1375 = class53.field1304.method1001(65280);
            if (arg2.field1375 == 65535) {
                arg2.field1375 = -1;
            }
        }
        if ((arg0 & 0x100) != 0) {
            int var7 = class53.field1304.method971(true);
            int var8 = class53.field1304.method971(true);
            arg2.method510(var8, class2.field73, var7, (byte) -30);
            arg2.field1342 = class2.field73 + 300;
            arg2.field1392 = class53.field1304.method972((byte) 32);
            arg2.field1367 = class53.field1304.method995(-114);
        }
        if ((arg0 & 0x1) != 0) {
            int var9 = class53.field1304.method991((byte) -85);
            int var10 = class53.field1304.method971(true);
            int var11 = class53.field1304.method972((byte) 67);
            int var12 = class53.field1304.field3182;
            if (arg2.field2651 != null && arg2.field2648 != null) {
                long var13 = arg2.field2651.method407(true);
                boolean var15 = false;
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < class43.field983; var16++) {
                        if (class51.field1235[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && class9.field192 == 0) {
                    class28.field657.field3182 = 0;
                    class53.field1304.method992(0, class28.field657.field3172, 104, var11);
                    class28.field657.field3182 = 0;
                    class44 var17 = class43.method370(arg1 + 32787, class28.field657).method377(12327);
                    arg2.field1387 = var17.method384(true);
                    arg2.field1372 = 150;
                    arg2.field1347 = var9 & 0xFF;
                    arg2.field1341 = var9 >> 8;
                    if (var10 == 2 || var10 == 3) {
                        class49.method460(var17, class117.method903(new class44[] { class48.field1190, arg2.field2651 }, false), (byte) 96, 1);
                    } else if (var10 == 1) {
                        class49.method460(var17, class117.method903(new class44[] { class5.field122, arg2.field2651 }, false), (byte) 119, 1);
                    } else {
                        class49.method460(var17, arg2.field2651, (byte) 92, 2);
                    }
                }
            }
            class53.field1304.field3182 = var11 + var12;
        }
        if ((arg0 & 0x40) != 0) {
            int var18 = class53.field1304.method969(true);
            int var19 = class53.field1304.method1020(arg1 - 94);
            if (var18 == 65535) {
                var18 = -1;
            }
            if (arg2.field1415 == var18 && var18 != -1) {
                int var20 = client.method139(arg1 ^ 0xFFFFFFED, var18).field2899;
                if (var20 == 1) {
                    arg2.field1359 = var19;
                    arg2.field1369 = 0;
                    arg2.field1410 = 0;
                    arg2.field1393 = 0;
                }
                if (var20 == 2) {
                    arg2.field1393 = 0;
                }
            } else if (var18 == -1 || arg2.field1415 == -1 || client.method139(1, var18).field2900 >= client.method139(arg1 ^ 0xFFFFFFED, arg2.field1415).field2900) {
                arg2.field1410 = 0;
                arg2.field1402 = arg2.field1378;
                arg2.field1393 = 0;
                arg2.field1359 = var19;
                arg2.field1369 = 0;
                arg2.field1415 = var18;
            }
        }
        if ((arg0 & 0x2) != 0) {
            int var21 = class53.field1304.method971(true);
            int var22 = class53.field1304.method1020(arg1 - 90);
            arg2.method510(var22, class2.field73, var21, (byte) -30);
            arg2.field1342 = class2.field73 + 300;
            arg2.field1392 = class53.field1304.method971(true);
            arg2.field1367 = class53.field1304.method1020(arg1 ^ 0x69);
        }
        if (arg1 != -20) {
            return;
        }
        if ((arg0 & 0x80) != 0) {
            arg2.field1413 = class53.field1304.method1007((byte) -33);
            arg2.field1380 = class53.field1304.method1007((byte) -33);
        }
        if ((arg0 & 0x200) != 0) {
            arg2.field1344 = class53.field1304.method972((byte) 38);
            arg2.field1383 = class53.field1304.method972((byte) 60);
            arg2.field1412 = class53.field1304.method995(-36);
            arg2.field1366 = class53.field1304.method972((byte) 6);
            arg2.field1409 = class53.field1304.method969(true) + class2.field73;
            arg2.field1374 = class53.field1304.method1007((byte) -33) + class2.field73;
            arg2.field1396 = class53.field1304.method972((byte) 14);
            arg2.method505(-79);
        }
        if ((arg0 & 0x400) != 0) {
            arg2.field1353 = class53.field1304.method1001(arg1 + 65300);
            int var23 = class53.field1304.method973(arg1 ^ 0x10);
            arg2.field1360 = 0;
            arg2.field1362 = class2.field73 + (var23 & 0xFFFF);
            arg2.field1377 = 0;
            if (arg2.field1353 == 65535) {
                arg2.field1353 = -1;
            }
            if (class2.field73 < arg2.field1362) {
                arg2.field1377 = -1;
            }
            arg2.field1363 = var23 >> 16;
        }
        if ((arg0 & 0x4) == 0) {
            return;
        }
        arg2.field1387 = class53.field1304.method976(-121);
        if (arg2.field1387.method385(255, 0) == 126) {
            arg2.field1387 = arg2.field1387.method380(1, (byte) 125);
            class49.method460(arg2.field1387, arg2.field2651, (byte) 97, 2);
        } else if (class72.field1820 == arg2) {
            class49.method460(arg2.field1387, arg2.field2651, (byte) 105, 2);
        }
        arg2.field1372 = 150;
        arg2.field1347 = 0;
        arg2.field1341 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V", line = 643)
    public static void method695(byte arg0) {
        field2169 = null;
        field2184 = null;
        field2171 = null;
        field2160 = null;
        field2183 = null;
        if (arg0 != -125) {
            method691(-70);
        }
        field2172 = null;
        field2158 = null;
        field2182 = null;
        field2178 = null;
        field2173 = null;
        field2164 = null;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([I)V", line = 662)
    public class85(int[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2166[var2] = arg0[var2];
        }
        this.method690(6182);
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V", line = 694)
    private final void method696(int arg0) {
        this.field2159 += ++this.field2180;
        field2168++;
        if (arg0 != 30312) {
            field2164 = null;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2175[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2162 ^= this.field2162 << 13;
                } else {
                    this.field2162 ^= this.field2162 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2162 ^= this.field2162 << 2;
            } else {
                this.field2162 ^= this.field2162 >>> 16;
            }
            this.field2162 += this.field2175[var2 + 128 & 0xFF];
            int var4;
            this.field2175[var2] = var4 = this.field2159 + this.field2175[class118.method914(var3 >> 2, 255)] + this.field2162;
            this.field2166[var2] = this.field2159 = var3 + this.field2175[class118.method914(var4, 261328) >> 8 >> 2];
        }
    }
}
