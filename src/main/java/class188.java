import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class188 {

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "[I")
    private int[] field3330;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[I")
    private int[] field3328;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lmd;")
    public static class220 field3315 = null;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lqk;")
    public static class207 field3314 = class24.method212(255, "www");

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Lqk;")
    private static class207 field3326 = class24.method212(255, "Loading world list data");

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "[[B")
    public static byte[][] field3329 = new byte[50][];

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lqk;")
    public static class207 field3327 = field3326;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    private int field3316;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    private int field3319;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    private int field3321;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    private int field3322;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "[Luh;")
    public static class100[] field3323;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    private final void method1310(int arg0) {
        field3331++;
        this.field3316 += ++this.field3319;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field3328[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3322 ^= this.field3322 << 13;
                } else {
                    this.field3322 ^= this.field3322 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3322 ^= this.field3322 << 2;
            } else {
                this.field3322 ^= this.field3322 >>> 16;
            }
            this.field3322 += this.field3328[var2 + 128 & 0xFF];
            int var4;
            this.field3328[var2] = var4 = this.field3328[class121.method860(var3 >> 2, 255)] + this.field3322 + this.field3316;
            this.field3330[var2] = this.field3316 = this.field3328[class121.method860(1020, var4 >> 8) >> 2] + var3;
        }
        if (arg0 != 1) {
            this.method1310(-35);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public static final void method1311(int arg0, int arg1) {
        field3318++;
        if (!class98.method697(arg0, 4401)) {
            return;
        }
        class220[] var2 = class227.field4162[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class220 var4 = var2[var3];
            if (var4 != null) {
                var4.field4012 = 1;
                var4.field4017 = 0;
                var4.field4033 = 0;
            }
        }
        if (arg1 != 20404) {
            field3329 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    private final void method1312(int arg0) {
        if (arg0 != -941319573) {
            field3315 = null;
        }
        field3320++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var7 + var64;
            int var66 = var65 ^ var64 << 8;
            int var67 = var4 + var66;
            int var68 = var5 + var63;
            int var69 = var64 + var68;
            var6 = var69 ^ var68 >>> 16;
            int var70 = var67 + var68;
            var5 = var70 ^ var67 << 10;
            int var71 = var3 + var6;
            int var72 = var2 + var5;
            int var73 = var67 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var63;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var66;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3330[var11] + var9;
            int var38 = this.field3330[var11 + 5] + var4;
            int var39 = this.field3330[var11 + 3] + var6;
            int var40 = this.field3330[var11 + 1] + var8;
            int var41 = this.field3330[var11 + 6] + var3;
            int var42 = this.field3330[var11 + 4] + var5;
            int var43 = this.field3330[var11 + 2] + var7;
            int var44 = var37 ^ var40 << 11;
            int var45 = var40 + var43;
            int var46 = var45 ^ var43 >>> 2;
            int var47 = this.field3330[var11 + 7] + var2;
            int var48 = var42 + var46;
            int var49 = var39 + var44;
            int var50 = var43 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var38 + var51;
            int var53 = var48 + var49;
            var6 = var53 ^ var48 >>> 16;
            int var54 = var48 + var52;
            int var55 = var6 + var41;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var47;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var44;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            var8 = var3 + var46;
            int var60 = var56 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field3328[var11] = var9;
            this.field3328[var11 + 1] = var8;
            this.field3328[var11 + 2] = var7;
            this.field3328[var11 + 3] = var6;
            this.field3328[var11 + 4] = var5;
            this.field3328[var11 + 5] = var4;
            this.field3328[var11 + 6] = var3;
            this.field3328[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3328[var12 + 2] + var7;
            int var14 = this.field3328[var12 + 1] + var8;
            int var15 = this.field3328[var12 + 6] + var3;
            int var16 = this.field3328[var12 + 4] + var5;
            int var17 = this.field3328[var12 + 5] + var4;
            int var18 = this.field3328[var12] + var9;
            int var19 = this.field3328[var12 + 7] + var2;
            int var20 = this.field3328[var12 + 3] + var6;
            int var21 = var18 ^ var14 << 11;
            int var22 = var20 + var21;
            int var23 = var13 + var14;
            int var24 = var23 ^ var13 >>> 2;
            int var25 = var16 + var24;
            int var26 = var13 + var22;
            int var27 = var26 ^ var22 << 8;
            int var28 = var22 + var25;
            var6 = var28 ^ var25 >>> 16;
            int var29 = var6 + var15;
            int var30 = var17 + var27;
            int var31 = var25 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var5 + var19;
            int var33 = var29 + var30;
            var4 = var33 ^ var29 >>> 4;
            int var34 = var4 + var21;
            int var35 = var29 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var8 = var3 + var24;
            var9 = var8 + var34;
            this.field3328[var12] = var9;
            var7 = var2 + var27;
            this.field3328[var12 + 1] = var8;
            this.field3328[var12 + 2] = var7;
            this.field3328[var12 + 3] = var6;
            this.field3328[var12 + 4] = var5;
            this.field3328[var12 + 5] = var4;
            this.field3328[var12 + 6] = var3;
            this.field3328[var12 + 7] = var2;
        }
        this.method1310(1);
        this.field3321 = 256;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)I")
    public final int method1313(int arg0) {
        field3324++;
        if (arg0 != -74436944) {
            return -103;
        }
        if (this.field3321-- == 0) {
            this.method1310(1);
            this.field3321 = 255;
        }
        return this.field3330[this.field3321];
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
    public static final void method1314(int arg0) {
        field3317++;
        if (class280.field4915 == 147) {
            int var1 = class17.field262.method1079(13932);
            int var2 = class17.field262.method1073(false);
            int var3 = var2 & 0x3;
            int var4 = var2 >> 2;
            int var5 = class18.field280[var4];
            int var6 = class17.field262.method1045((byte) 101);
            int var7 = class44.field864 + (var6 & 0x7);
            int var8 = ((var6 & 0x70) >> 4) + class134.field2328;
            if (var8 >= 0 && var7 >= 0 && var8 < 104 && var7 < 104) {
                class79.method600(class93.field1645, var4, var5, 0, var8, (byte) -99, var1, -1, var3, var7);
            }
            return;
        }
        if (class280.field4915 == 52) {
            int var9 = class17.field262.method1069((byte) 52);
            byte var10 = class17.field262.method1058(-108);
            int var11 = class17.field262.method1047(78);
            byte var12 = class17.field262.method1046(1271);
            int var13 = class17.field262.method1050(arg0 + 1272006565);
            byte var14 = class17.field262.method1058(123);
            int var15 = class17.field262.method1059(true);
            int var16 = var15 >> 2;
            int var17 = var15 & 0x3;
            int var18 = class17.field262.method1073(false);
            int var19 = (var18 & 0x7) + class44.field864;
            int var20 = ((var18 & 0x79) >> 4) + class134.field2328;
            byte var21 = class17.field262.method1046(arg0 + 1268);
            int var22 = class17.field262.method1062(84);
            class21.method126(var17, var22, var10, var20, var16, (byte) -73, var9, var13, var19, var11, var12, var14, var21);
        }
        if (class280.field4915 == 60) {
            int var23 = class17.field262.method1079(arg0 ^ 0x366F);
            int var24 = class17.field262.method1047(97);
            int var25 = class17.field262.method1072(255);
            int var26 = (var25 & 0x7) + class44.field864;
            int var27 = ((var25 & 0x70) >> 4) + class134.field2328;
            if (var27 >= 0 && var26 >= 0 && var27 < 104 && var26 < 104) {
                class245 var28 = new class245();
                var28.field4447 = var23;
                var28.field4453 = var24;
                if (class276.field4844[class93.field1645][var27][var26] == null) {
                    class276.field4844[class93.field1645][var27][var26] = new class132();
                }
                class276.field4844[class93.field1645][var27][var26].method931(new class242(var28), arg0 + 116);
                class223.method1580(var26, -99999999, var27);
            }
            return;
        }
        if (arg0 != 3) {
            method1314(-52);
        }
        if (class280.field4915 == 98) {
            int var29 = class17.field262.method1045((byte) 104);
            int var30 = ((var29 & 0x7B) >> 4) + class134.field2328;
            int var31 = class44.field864 + (var29 & 0x7);
            int var32 = class17.field262.method1050(arg0 + 1272006565);
            int var33 = class17.field262.method1050(arg0 ^ 0x4BD147AB);
            int var34 = class17.field262.method1050(arg0 ^ 0x4BD147AB);
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                class132 var35 = class276.field4844[class93.field1645][var30][var31];
                if (var35 != null) {
                    for (class242 var36 = (class242) var35.method922((byte) 99); var36 != null; var36 = (class242) var35.method928(-67)) {
                        class245 var37 = var36.field4408;
                        if ((var32 & 0x7FFF) == var37.field4447 && var37.field4453 == var33) {
                            var37.field4453 = var34;
                            break;
                        }
                    }
                    class223.method1580(var31, arg0 ^ 0xFA0A1F02, var30);
                }
            }
        } else if (class280.field4915 == 79) {
            int var38 = class17.field262.method1073(false);
            int var39 = var38 >> 2;
            int var40 = class18.field280[var39];
            int var41 = class17.field262.method1050(1272006568);
            if (var41 == 65535) {
                var41 = -1;
            }
            int var42 = var38 & 0x3;
            int var43 = class17.field262.method1072(arg0 ^ 0xFC);
            int var44 = (var43 >> 4 & 0x7) + class134.field2328;
            int var45 = class44.field864 + (var43 & 0x7);
            class21.method127(var44, var39, var41, var42, class93.field1645, var40, var45, (byte) -85);
        } else if (class280.field4915 == 54) {
            int var46 = class17.field262.method1045((byte) -84);
            int var47 = (var46 & 0x7) + class44.field864;
            int var48 = class134.field2328 + (var46 >> 4 & 0x7);
            int var49 = var48 + class17.field262.method1084((byte) 49);
            int var50 = class17.field262.method1084((byte) 49) + var47;
            int var51 = class17.field262.method1075(65536);
            int var52 = class17.field262.method1050(arg0 ^ 0x4BD147AB);
            int var53 = class17.field262.method1045((byte) -35) * 4;
            int var54 = class17.field262.method1045((byte) -84) * 4;
            int var55 = class17.field262.method1050(1272006568);
            int var56 = class17.field262.method1050(1272006568);
            int var57 = class17.field262.method1045((byte) 85);
            int var58 = class17.field262.method1045((byte) -125);
            if (var57 == 255) {
                var57 = -1;
            }
            if (var48 >= 0 && var47 >= 0 && var48 < 104 && var47 < 104 && var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104 && var52 != 65535) {
                int var59 = var49 * 128 + 64;
                int var60 = var50 * 128 + 64;
                int var61 = var48 * 128 + 64;
                int var62 = var47 * 128 + 64;
                class18 var63 = new class18(var52, class93.field1645, var61, var62, class22.method139(var61, var62, 23979, class93.field1645) - var53, var55 - -class160.field2844, var56 + class160.field2844, var57, var58, var51, var54);
                var63.method108(var60, var59, (byte) -39, class22.method139(var59, var60, 23979, class93.field1645) - var54, class160.field2844 + var55);
                class167.field2933.method931(new class17(var63), 119);
            }
        } else if (class280.field4915 == 106) {
            int var64 = class17.field262.method1045((byte) 99);
            int var65 = ((var64 & 0xFA) >> 4) + class134.field2328 * 2;
            int var66 = (var64 & 0xF) + class44.field864 * 2;
            int var67 = var65 + class17.field262.method1084((byte) 49);
            int var68 = class17.field262.method1084((byte) 49) + var66;
            int var69 = class17.field262.method1075(arg0 ^ 0x10003);
            int var70 = class17.field262.method1075(65536);
            int var71 = class17.field262.method1050(1272006568);
            int var72 = class17.field262.method1084((byte) 49);
            int var73 = class17.field262.method1045((byte) 115) * 4;
            int var74 = class17.field262.method1050(arg0 + 1272006565);
            int var75 = class17.field262.method1050(1272006568);
            int var76 = class17.field262.method1045((byte) 123);
            int var77 = class17.field262.method1045((byte) -39);
            if (var76 == 255) {
                var76 = -1;
            }
            if (var65 >= 0 && var66 >= 0 && var65 < 208 && var66 < 208 && var67 >= 0 && var68 >= 0 && var67 < 208 && var68 < 208 && var71 != 65535) {
                int var78 = var67 * 64;
                int var79 = var65 * 64;
                int var80 = var68 * 64;
                int var81 = var66 * 64;
                if (var69 != 0) {
                    int var84;
                    class286 var85;
                    if (var69 >= 0) {
                        int var82 = var69 - 1;
                        int var83 = var82 & 0x7FF;
                        var84 = (var82 & 0x7921) >> 11;
                        var85 = class79.field1449[var83];
                    } else {
                        int var86 = -var69 - 1;
                        int var87 = var86 & 0x7FF;
                        if (class19.field313 == var87) {
                            var85 = class202.field3565;
                        } else {
                            var85 = class169.field2953[var87];
                        }
                        var84 = var86 >> 11 & 0xF;
                    }
                    if (var85 != null) {
                        class200 var88 = var85.method1947(9);
                        if (var88.field3516 != null && var88.field3516[var84] != null) {
                            var72 -= var88.field3516[var84][1];
                            int var89 = var88.field3516[var84][0];
                            int var90 = var88.field3516[var84][2];
                            int var91 = class257.field4598[var85.field5062];
                            int var92 = class257.field4597[var85.field5062];
                            int var93 = var89 * var92 + var90 * var91 >> 16;
                            int var94 = var90 * var92 - var89 * var91 >> 16;
                            var81 += var94;
                            var79 += var93;
                        }
                    }
                }
                class18 var96 = new class18(var71, class93.field1645, var79, var81, class22.method139(var79, var81, 23979, class93.field1645) - var72, class160.field2844 + var74, var75 + class160.field2844, var76, var77, var70, var73);
                var96.method108(var80, var78, (byte) -39, class22.method139(var78, var80, arg0 + 23976, class93.field1645) - var73, var74 - -class160.field2844);
                class167.field2933.method931(new class17(var96), 123);
            }
        } else if (class280.field4915 == 165) {
            int var97 = class17.field262.method1045((byte) -77);
            int var98 = ((var97 & 0xF6) >> 4) + class134.field2328 * 2;
            int var99 = (var97 & 0xF) + class44.field864 * 2;
            int var100 = class17.field262.method1084((byte) 49) + var98;
            int var101 = class17.field262.method1084((byte) 49) + var99;
            int var102 = class17.field262.method1075(arg0 ^ 0x10003);
            int var103 = class17.field262.method1050(arg0 + 1272006565);
            int var104 = class17.field262.method1045((byte) 97) * 4;
            int var105 = class17.field262.method1045((byte) 117) * 4;
            int var106 = class17.field262.method1050(1272006568);
            int var107 = class17.field262.method1050(arg0 + 1272006565);
            int var108 = class17.field262.method1045((byte) -61);
            int var109 = class17.field262.method1045((byte) 127);
            if (var108 == 255) {
                var108 = -1;
            }
            if (var98 >= 0 && var99 >= 0 && var98 < 208 && var99 < 208 && var100 >= 0 && var101 >= 0 && var100 < 208 && var101 < 208 && var103 != 65535) {
                int var110 = var99 * 64;
                int var111 = var101 * 64;
                int var112 = var98 * 64;
                class18 var113 = new class18(var103, class93.field1645, var112, var110, class22.method139(var112, var110, 23979, class93.field1645) - var104, class160.field2844 + var106, var107 + class160.field2844, var108, var109, var102, var105);
                int var114 = var100 * 64;
                var113.method108(var111, var114, (byte) -39, class22.method139(var114, var111, 23979, class93.field1645) - var105, var106 - -class160.field2844);
                class167.field2933.method931(new class17(var113), 123);
            }
        } else if (class280.field4915 == 208) {
            int var115 = class17.field262.method1047(88);
            int var116 = class17.field262.method1073(false);
            int var117 = ((var116 & 0x7C) >> 4) + class134.field2328;
            int var118 = (var116 & 0x7) + class44.field864;
            if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                class132 var119 = class276.field4844[class93.field1645][var117][var118];
                if (var119 != null) {
                    for (class242 var120 = (class242) var119.method922((byte) 102); var120 != null; var120 = (class242) var119.method928(78)) {
                        if ((var115 & 0x7FFF) == var120.field4408.field4447) {
                            var120.method1346((byte) -16);
                            break;
                        }
                    }
                    if (var119.method922((byte) 75) == null) {
                        class276.field4844[class93.field1645][var117][var118] = null;
                    }
                    class223.method1580(var118, -99999999, var117);
                }
            }
        } else if (class280.field4915 == 186) {
            int var121 = class17.field262.method1045((byte) 92);
            int var122 = (var121 & 0x7) + class44.field864;
            int var123 = class134.field2328 + ((var121 & 0x7F) >> 4);
            int var124 = class17.field262.method1050(1272006568);
            int var125 = class17.field262.method1045((byte) 98);
            int var126 = class17.field262.method1045((byte) -55);
            if (var124 == 65535) {
                var124 = -1;
            }
            int var127 = var125 >> 4 & 0xF;
            int var128 = var125 & 0x7;
            if (var123 >= 0 && var122 >= 0 && var123 < 104 && var122 < 104) {
                int var129 = var127 + 1;
                if (var123 - var129 <= class202.field3565.field5022[0] && var123 + var129 >= class202.field3565.field5022[0] && class202.field3565.field5074[0] >= var122 - var129 && class202.field3565.field5074[0] <= var122 + var129 && class167.field2927 != 0 && var128 > 0 && class242.field4404 < 50 && var124 != -1) {
                    class162.field2868[class242.field4404] = var124;
                    class245.field4435[class242.field4404] = var128;
                    class73.field1344[class242.field4404] = var126;
                    class261.field4656[class242.field4404] = null;
                    class285.field5004[class242.field4404] = (var123 << 16) + (var122 << 8) + var127;
                    class242.field4404++;
                }
            }
        } else if (class280.field4915 == 190) {
            int var130 = class17.field262.method1045((byte) -45);
            int var131 = (var130 >> 4 & 0x7) + class134.field2328;
            int var132 = (var130 & 0x7) + class44.field864;
            int var133 = class17.field262.method1050(1272006568);
            int var134 = class17.field262.method1045((byte) -32);
            int var135 = class17.field262.method1050(1272006568);
            if (var131 >= 0 && var132 >= 0 && var131 < 104 && var132 < 104) {
                int var136 = var131 * 128 + 64;
                int var137 = var132 * 128 + 64;
                class259 var138 = new class259(var133, class93.field1645, var136, var137, class22.method139(var136, var137, arg0 ^ 0x5DA8, class93.field1645) - var134, var135, class160.field2844);
                class43.field838.method931(new class25(var138), 120);
            }
        } else if (class280.field4915 == 231) {
            int var139 = class17.field262.method1047(100);
            int var140 = class17.field262.method1050(1272006568);
            int var141 = class17.field262.method1047(77);
            int var142 = class17.field262.method1072(arg0 + 252);
            int var143 = class134.field2328 + (var142 >> 4 & 0x7);
            int var144 = (var142 & 0x7) + class44.field864;
            if (var143 >= 0 && var144 >= 0 && var143 < 104 && var144 < 104 && class19.field313 != var141) {
                class245 var145 = new class245();
                var145.field4453 = var139;
                var145.field4447 = var140;
                if (class276.field4844[class93.field1645][var143][var144] == null) {
                    class276.field4844[class93.field1645][var143][var144] = new class132();
                }
                class276.field4844[class93.field1645][var143][var144].method931(new class242(var145), arg0 ^ 0x7E);
                class223.method1580(var144, -99999999, var143);
            }
        } else if (class280.field4915 == 194) {
            int var146 = class17.field262.method1072(255);
            int var147 = ((var146 & 0x75) >> 4) + class134.field2328;
            int var148 = (var146 & 0x7) + class44.field864;
            int var149 = class17.field262.method1045((byte) -125);
            int var150 = var149 >> 2;
            int var151 = var149 & 0x3;
            int var152 = class18.field280[var150];
            if (var147 >= 0 && var148 >= 0 && var147 < 104 && var148 < 104) {
                class79.method600(class93.field1645, var150, var152, 0, var147, (byte) -99, -1, -1, var151, var148);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    private class188() {
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "([I)V")
    public class188(int[] arg0) {
        this.field3330 = new int[256];
        this.field3328 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3330[var2] = arg0[var2];
        }
        this.method1312(-941319573);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIII)I")
    public static final int method1315(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 1) {
            field3314 = null;
        }
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        field3325++;
        return (arg2 >> 5 << 7) + (arg3 >> 2 << 10) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public static void method1316(int arg0) {
        field3329 = null;
        field3326 = null;
        field3323 = null;
        if (arg0 == -1) {
            field3315 = null;
            field3314 = null;
            field3327 = null;
        }
    }
}
