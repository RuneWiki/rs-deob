import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class112 {

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "[I")
    private int[] field1856 = new int[8191];

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[[Ltl;")
    private class521[][] field1849 = new class521[1600][64];

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[[Ltl;")
    private class521[][] field1858 = new class521[64][768];

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
    private int[] field1851 = new int[1600];

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[I")
    private int[] field1860 = new int[64];

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    private int field1863 = 0;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lup;")
    private class342 field1850;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lws;")
    private class530 field1854;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "Lsp;")
    private class620 field1862;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "[I")
    public static int[] field1861 = new int[5];

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Lhf;")
    public static class573 field1859 = new class573(0);

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "Liu;")
    public static class517 field1864 = new class517(13, 6);

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field1866 = -1;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILnd;)V")
    private final void method929(int arg0, class632 arg1) {
        field1857++;
        if (arg0 != 1) {
            return;
        }
        class393.field5890 = arg1.field9141;
        arg1.method3594(8);
        arg1.method3575(false, 106);
        arg1.method3623(false, arg0 ^ 0x79);
        arg1.method3621(arg0 - 128);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lnd;BI)V")
    private final void method930(class632 arg0, byte arg1, int arg2) {
        field1847++;
        int var4 = 0;
        class516 var5 = arg0.method3644(arg1 ^ 0x77);
        float var6 = var5.field7177;
        float var7 = var5.field7185;
        float var8 = var5.field7184;
        float var9 = var5.field7168;
        float var10 = var5.field7162;
        if (arg1 != -12) {
            return;
        }
        float var11 = var5.field7171;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field1850.method251(true, (byte) 60);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method3588(var21, (byte) 103);
        if (Stream.method3248()) {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field1851[var48] > 64 ? 64 : this.field1851[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class521 var63 = this.field1849[var48][var50];
                        int var64 = var63.field7235;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field7240 >> 12);
                        float var70 = (float) (var63.field7242 >> 12);
                        float var71 = (float) (var63.field7246 >> 12);
                        int var72 = var63.field7237 >> 12;
                        var22.method3250((float) (-var72) * var12 + var69);
                        var22.method3250((float) (-var72) * var13 + var70);
                        var22.method3250((float) (-var72) * var14 + var71);
                        var22.method3242(var67);
                        var22.method3242(var66);
                        var22.method3242(var65);
                        var22.method3242(var68);
                        var22.method3250(0.0F);
                        var22.method3250(0.0F);
                        var22.method3250((float) var72 * var15 + var69);
                        var22.method3250((float) var72 * var16 + var70);
                        var22.method3250((float) var72 * var17 + var71);
                        var22.method3242(var67);
                        var22.method3242(var66);
                        var22.method3242(var65);
                        var22.method3242(var68);
                        var22.method3250(1.0F);
                        var22.method3250(0.0F);
                        var22.method3250((float) var72 * var12 + var69);
                        var22.method3250((float) var72 * var13 + var70);
                        var22.method3250((float) var72 * var14 + var71);
                        var22.method3242(var67);
                        var22.method3242(var66);
                        var22.method3242(var65);
                        var22.method3242(var68);
                        var22.method3250(1.0F);
                        var22.method3250(1.0F);
                        var22.method3250((float) var72 * var18 + var69);
                        var22.method3250((float) var72 * var19 + var70);
                        var22.method3250((float) var72 * var20 + var71);
                        var22.method3242(var67);
                        var22.method3242(var66);
                        var22.method3242(var65);
                        var22.method3242(var68);
                        var22.method3250(0.0F);
                        var22.method3250(1.0F);
                        var4++;
                    }
                    if (this.field1851[var48] > 64) {
                        int var51 = this.field1851[var48] - 1 - 64;
                        for (int var52 = this.field1860[var51] - 1; var52 >= 0; var52--) {
                            class521 var53 = this.field1858[var51][var52];
                            int var54 = var53.field7235;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field7240 >> 12);
                            float var60 = (float) (var53.field7242 >> 12);
                            float var61 = (float) (var53.field7246 >> 12);
                            int var62 = var53.field7237 >> 12;
                            var22.method3250((float) (-var62) * var12 + var59);
                            var22.method3250((float) (-var62) * var13 + var60);
                            var22.method3250((float) (-var62) * var14 + var61);
                            var22.method3242(var57);
                            var22.method3242(var56);
                            var22.method3242(var55);
                            var22.method3242(var58);
                            var22.method3250(0.0F);
                            var22.method3250(0.0F);
                            var22.method3250((float) var62 * var15 + var59);
                            var22.method3250((float) var62 * var16 + var60);
                            var22.method3250((float) var62 * var17 + var61);
                            var22.method3242(var57);
                            var22.method3242(var56);
                            var22.method3242(var55);
                            var22.method3242(var58);
                            var22.method3250(1.0F);
                            var22.method3250(0.0F);
                            var22.method3250((float) var62 * var12 + var59);
                            var22.method3250((float) var62 * var13 + var60);
                            var22.method3250((float) var62 * var14 + var61);
                            var22.method3242(var57);
                            var22.method3242(var56);
                            var22.method3242(var55);
                            var22.method3242(var58);
                            var22.method3250(1.0F);
                            var22.method3250(1.0F);
                            var22.method3250((float) var62 * var18 + var59);
                            var22.method3250((float) var62 * var19 + var60);
                            var22.method3250((float) var62 * var20 + var61);
                            var22.method3242(var57);
                            var22.method3242(var56);
                            var22.method3242(var55);
                            var22.method3242(var58);
                            var22.method3250(0.0F);
                            var4++;
                            var22.method3250(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field1851[var23] <= 64 ? this.field1851[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class521 var38 = this.field1849[var23][var25];
                        int var39 = var38.field7235;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field7240 >> 12);
                        float var45 = (float) (var38.field7242 >> 12);
                        float var46 = (float) (var38.field7246 >> 12);
                        int var47 = var38.field7237 >> 12;
                        var22.method3247((float) (-var47) * var12 + var44);
                        var22.method3247((float) (-var47) * var13 + var45);
                        var22.method3247((float) (-var47) * var14 + var46);
                        var22.method3242(var42);
                        var22.method3242(var41);
                        var22.method3242(var40);
                        var22.method3242(var43);
                        var22.method3247(0.0F);
                        var22.method3247(0.0F);
                        var22.method3247((float) var47 * var15 + var44);
                        var22.method3247((float) var47 * var16 + var45);
                        var22.method3247((float) var47 * var17 + var46);
                        var22.method3242(var42);
                        var22.method3242(var41);
                        var22.method3242(var40);
                        var22.method3242(var43);
                        var22.method3247(1.0F);
                        var22.method3247(0.0F);
                        var22.method3247((float) var47 * var12 + var44);
                        var22.method3247((float) var47 * var13 + var45);
                        var22.method3247((float) var47 * var14 + var46);
                        var22.method3242(var42);
                        var22.method3242(var41);
                        var22.method3242(var40);
                        var22.method3242(var43);
                        var22.method3247(1.0F);
                        var22.method3247(1.0F);
                        var22.method3247((float) var47 * var18 + var44);
                        var22.method3247((float) var47 * var19 + var45);
                        var22.method3247((float) var47 * var20 + var46);
                        var22.method3242(var42);
                        var22.method3242(var41);
                        var22.method3242(var40);
                        var22.method3242(var43);
                        var22.method3247(0.0F);
                        var4++;
                        var22.method3247(1.0F);
                    }
                    if (this.field1851[var23] > 64) {
                        int var26 = this.field1851[var23] - 65;
                        for (int var27 = this.field1860[var26] - 1; var27 >= 0; var27--) {
                            class521 var28 = this.field1858[var26][var27];
                            int var29 = var28.field7235;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field7240 >> 12);
                            float var35 = (float) (var28.field7242 >> 12);
                            float var36 = (float) (var28.field7246 >> 12);
                            int var37 = var28.field7237 >> 12;
                            var22.method3247((float) (-var37) * var12 + var34);
                            var22.method3247((float) (-var37) * var13 + var35);
                            var22.method3247((float) (-var37) * var14 + var36);
                            var22.method3242(var32);
                            var22.method3242(var31);
                            var22.method3242(var30);
                            var22.method3242(var33);
                            var22.method3247(0.0F);
                            var22.method3247(0.0F);
                            var22.method3247((float) var37 * var15 + var34);
                            var22.method3247((float) var37 * var16 + var35);
                            var22.method3247((float) var37 * var17 + var36);
                            var22.method3242(var32);
                            var22.method3242(var31);
                            var22.method3242(var30);
                            var22.method3242(var33);
                            var22.method3247(1.0F);
                            var22.method3247(0.0F);
                            var22.method3247((float) var37 * var12 + var34);
                            var22.method3247((float) var37 * var13 + var35);
                            var22.method3247((float) var37 * var14 + var36);
                            var22.method3242(var32);
                            var22.method3242(var31);
                            var22.method3242(var30);
                            var22.method3242(var33);
                            var22.method3247(1.0F);
                            var22.method3247(1.0F);
                            var22.method3247((float) var37 * var18 + var34);
                            var22.method3247((float) var37 * var19 + var35);
                            var22.method3247((float) var37 * var20 + var36);
                            var22.method3242(var32);
                            var22.method3242(var31);
                            var22.method3242(var30);
                            var22.method3242(var33);
                            var22.method3247(0.0F);
                            var4++;
                            var22.method3247(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3246();
        if (this.field1850.method245(-11359)) {
            arg0.method114(this.field1854, (byte) -97);
            arg0.method152(0, this.field1850, 119);
            arg0.method134(class12.field118, 0, var4 * 4, var4 * 2, this.field1862, 10, 0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method931(byte arg0) {
        field1859 = null;
        if (arg0 != 96) {
            field1866 = -86;
        }
        field1864 = null;
        field1861 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILsh;Lnd;)V")
    public final void method932(int arg0, class616 arg1, class632 arg2) {
        field1855++;
        if (arg2.field9058 == null) {
            return;
        }
        this.method929(1, arg2);
        float var4 = arg2.field9058.field7169;
        int var5 = 60 / ((44 - arg0) / 40);
        float var6 = arg2.field9058.field7172;
        float var7 = arg2.field9058.field7152;
        float var8 = arg2.field9058.field7151;
        try {
            if (arg1.field8726) {
                int var9 = arg1.field8725 - arg1.field8724;
                int var10;
                if (var9 + 2 <= 1600) {
                    var10 = 0;
                    var9 += 2;
                } else {
                    var10 = class211.method1380(var9, (byte) -47) + 1 - class37.field506;
                    var9 = (var9 >> var10) + 2;
                }
                class327 var11 = arg1.field8719.field6889;
                class327 var12 = var11.field4709;
                int var13 = -2;
                boolean var14 = true;
                boolean var15 = true;
                while (var11 != var12) {
                    this.field1863 = 0;
                    for (int var16 = 0; var16 < var9; var16++) {
                        this.field1851[var16] = 0;
                    }
                    for (int var17 = 0; var17 < 64; var17++) {
                        this.field1860[var17] = 0;
                    }
                    while (var11 != var12) {
                        class521 var18 = (class521) var12;
                        if (var15) {
                            var15 = false;
                            var14 = var18.field7245;
                            var13 = var18.field7243;
                        } else if (var18.field7243 != var13 || var14 != var18.field7245) {
                            var15 = true;
                            break;
                        }
                        int var19 = (int) ((float) (var18.field7246 >> 12) * var7 + (float) (var18.field7242 >> 12) * var6 + (float) (var18.field7240 >> 12) * var4 + var8) - arg1.field8724 >> var10;
                        if (var19 < 1600) {
                            if (this.field1851[var19] < 64) {
                                this.field1849[var19][this.field1851[var19]++] = var18;
                            } else {
                                label193: {
                                    if (this.field1851[var19] == 64) {
                                        if (this.field1863 == 64) {
                                            break label193;
                                        }
                                        this.field1851[var19] += (this.field1863++) + 1;
                                    }
                                    this.field1858[this.field1851[var19] - 65][this.field1860[this.field1851[var19] - 1 - 64]++] = var18;
                                }
                            }
                        }
                        var12 = var12.field4709;
                    }
                    arg2.method3568(var13, 14511, false, false);
                    if (var14 && class393.field5890 != arg2.field9141) {
                        arg2.method569(class393.field5890);
                    } else if (arg2.field9141 != 1.0F) {
                        arg2.method569(1.0F);
                    }
                    this.method930(arg2, (byte) -12, var9);
                }
            } else {
                int var20 = 0;
                int var21 = Integer.MAX_VALUE;
                int var22 = 0;
                class327 var23 = arg1.field8719.field6889;
                for (class327 var24 = var23.field4709; var24 != var23; var24 = var24.field4709) {
                    class521 var25 = (class521) var24;
                    int var26 = (int) ((float) (var25.field7246 >> 12) * var7 + (float) (var25.field7242 >> 12) * var6 + (float) (var25.field7240 >> 12) * var4 + var8);
                    if (var26 > var22) {
                        var22 = var26;
                    }
                    if (var21 > var26) {
                        var21 = var26;
                    }
                    this.field1856[var20++] = var26;
                }
                int var27 = var22 - var21;
                int var28;
                if ((var27 + 2) > 1600) {
                    var28 = class211.method1380(var27, (byte) 112) + 1 - class37.field506;
                    var27 = (var27 >> var28) + 2;
                } else {
                    var27 += 2;
                    var28 = 0;
                }
                class327 var29 = var23.field4709;
                int var30 = 0;
                int var31 = -2;
                boolean var32 = true;
                boolean var33 = true;
                while (var23 != var29) {
                    this.field1863 = 0;
                    for (int var34 = 0; var34 < var27; var34++) {
                        this.field1851[var34] = 0;
                    }
                    for (int var35 = 0; var35 < 64; var35++) {
                        this.field1860[var35] = 0;
                    }
                    while (var23 != var29) {
                        class521 var36 = (class521) var29;
                        if (var33) {
                            var31 = var36.field7243;
                            var32 = var36.field7245;
                            var33 = false;
                        }
                        if (var30 > 0 && (var36.field7243 != var31 || var36.field7245 != var32)) {
                            var33 = true;
                            break;
                        }
                        int var37 = this.field1856[var30++] - var21 >> var28;
                        if (var37 < 1600) {
                            if (this.field1851[var37] < 64) {
                                this.field1849[var37][this.field1851[var37]++] = var36;
                            } else {
                                label143: {
                                    if (this.field1851[var37] == 64) {
                                        if (this.field1863 == 64) {
                                            break label143;
                                        }
                                        this.field1851[var37] += this.field1863++ + 1;
                                    }
                                    this.field1858[this.field1851[var37] - 65][this.field1860[this.field1851[var37] - 64 - 1]++] = var36;
                                }
                            }
                        }
                        var29 = var29.field4709;
                    }
                    arg2.method3568(var31 >= 0 ? var31 : -1, 14511, false, false);
                    if (var32 && class393.field5890 != arg2.field9141) {
                        arg2.method569(class393.field5890);
                    } else if (arg2.field9141 != 1.0F) {
                        arg2.method569(1.0F);
                    }
                    this.method930(arg2, (byte) -12, var27);
                }
            }
        } catch (Exception var38) {
        }
        this.method933((byte) -116, arg2);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLnd;)V")
    private final void method933(byte arg0, class632 arg1) {
        arg1.method3623(true, 118);
        int var3 = -27 / ((arg0 + 2) / 59);
        field1853++;
        arg1.method3575(true, 89);
        if (class393.field5890 != arg1.field9141) {
            arg1.method569(class393.field5890);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(ILnd;)V")
    public final void method934(int arg0, class632 arg1) {
        this.field1850.method1343(24, 196584, (byte) -118);
        field1848++;
        if (arg0 > -45) {
            this.method933((byte) -48, null);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public final void method935(int arg0) {
        field1852++;
        this.field1850.method249(12416);
        if (arg0 > -19) {
            this.field1849 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lnd;)V")
    public class112(class632 arg0) {
        this.field1850 = arg0.method128(16240, true);
        this.field1854 = arg0.method87(false, new class58[] { new class58(new class109[] { class109.field1807, class109.field1817, class109.field1819 }) });
        this.field1862 = arg0.method98(false, (byte) 14);
        this.field1862.method252(57, 49146);
        Buffer var2 = this.field1862.method251(true, (byte) 60);
        if (var2 != null) {
            Stream var3 = arg0.method3588(var2, (byte) -112);
            if (Stream.method3248()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3244(var5);
                    var3.method3244(var5 + 1);
                    var3.method3244(var5 + 2);
                    var3.method3244(var5 + 2);
                    var3.method3244(var5 + 3);
                    var3.method3244(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3238(var7);
                    var3.method3238(var7 + 1);
                    var3.method3238(var7 + 2);
                    var3.method3238(var7 + 2);
                    var3.method3238(var7 + 3);
                    var3.method3238(var7);
                }
            }
            var3.method3246();
            this.field1862.method245(-11359);
        }
    }
}
