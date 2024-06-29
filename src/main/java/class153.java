import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class153 {

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "[F")
    private float[] field2217 = new float[16];

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Lmm;")
    private class182 field2218 = new class182(786336);

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    private int field2226 = class302.method1758(16, 1600);

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    private int field2228 = 0;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "[I")
    private int[] field2227 = new int[1600];

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "[[Lep;")
    private class288[][] field2233 = new class288[1600][64];

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "[[Lep;")
    private class288[][] field2229 = new class288[64][768];

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "[I")
    private int[] field2230 = new int[8191];

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "[I")
    private int[] field2236 = new int[64];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
    public static int[] field2210 = new int[4096];

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "[I")
    public static int[] field2224 = new int[32];

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "[Z")
    public static boolean[] field2231;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "[[I")
    public static int[][] field2235;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "Lfr;")
    public static class282 field2232;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Lgs;")
    private class34 field2221;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lgs;")
    private class34 field2223;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "Lgs;")
    private class34 field2225;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lrg;")
    private class453 field2222;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2224[var1] = var0 - 1;
            var0 += var0;
        }
        field2231 = new boolean[100];
        field2234 = -1;
        field2235 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
        field2232 = new class282(0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lbo;I)V", line = 6)
    public final void method1051(class511 arg0, int arg1) {
        this.field2222 = arg0.method2999(24, -126, true, 196584, null);
        field2211++;
        this.field2225 = new class34(arg0, this.field2222, 5126, 2, 0);
        this.field2221 = new class34(arg0, this.field2222, 5126, 3, 8);
        this.field2223 = new class34(arg0, this.field2222, 5121, 4, 20);
        if (arg1 != 6411) {
            this.method1052(null, null, 90);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lbo;Lpm;I)V", line = 24)
    public final void method1052(class511 arg0, class411 arg1, int arg2) {
        field2213++;
        if (arg2 <= 103) {
            this.field2236 = null;
        }
        if (arg0.field7430 == null) {
            return;
        }
        this.method1055(9, arg0);
        float var4 = arg0.field7430.field1988;
        float var5 = arg0.field7430.field1975;
        float var6 = arg0.field7430.field1963;
        float var7 = arg0.field7430.field1980;
        try {
            if (arg1.field5649) {
                int var8 = arg1.field5650 - arg1.field5657;
                int var9;
                if (var8 + 2 <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = 1 - (this.field2226 - class302.method1758(16, var8));
                    var8 = (var8 >> var9) + 2;
                }
                class503 var10 = arg1.field5648.field1291;
                class503 var11 = var10.field6933;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field2228 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field2227[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field2236[var16] = 0;
                    }
                    while (var10 != var11) {
                        class288 var17 = (class288) var11;
                        if (var14) {
                            var12 = var17.field3764;
                            var14 = false;
                            var13 = var17.field3761;
                        } else if (var17.field3764 != var12 || var17.field3761 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field3762 >> class63.field977) * var6 + (float) (var17.field3769 >> class63.field977) * var4 + (float) (var17.field3767 >> class63.field977) * var5 + var7) - arg1.field5657 >> var9;
                        if (var18 < 1600) {
                            if (this.field2227[var18] < 64) {
                                this.field2233[var18][this.field2227[var18]++] = var17;
                            } else {
                                label201: {
                                    if (this.field2227[var18] == 64) {
                                        if (this.field2228 == 64) {
                                            break label201;
                                        }
                                        this.field2227[var18] += (this.field2228++) + 1;
                                    }
                                    class288[] var10000 = this.field2229[this.field2227[var18] - 64 - 1];
                                    int var10002 = this.field2227[var18] - 65;
                                    int var10004 = this.field2236[this.field2227[var18] - 65];
                                    this.field2236[var10002] = this.field2236[this.field2227[var18] - 65] + 1;
                                    var10000[var10004] = var17;
                                }
                            }
                        }
                        var11 = var11.field6933;
                    }
                    if (var12 >= 0) {
                        arg0.method2980(arg0.field7392.method1566(var12, (byte) 56), 124);
                        arg0.method2976((byte) 108, arg0.field2375.method677(2459, var12).field3642);
                    } else {
                        arg0.method2980(null, 116);
                    }
                    if (var13 && class234.field3152 != arg0.field7524) {
                        arg0.method559(class234.field3152);
                    } else if (arg0.field7524 != 1.0F) {
                        arg0.method559(1.0F);
                    }
                    this.method1054(-1601, var8, arg0);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class503 var22 = arg1.field5648.field1291;
                for (class503 var23 = var22.field6933; var23 != var22; var23 = var23.field6933) {
                    class288 var24 = (class288) var23;
                    int var25 = (int) ((float) (var24.field3762 >> class63.field977) * var6 + (float) (var24.field3769 >> class63.field977) * var4 + (float) (var24.field3767 >> class63.field977) * var5 + var7);
                    if (var21 < var25) {
                        var21 = var25;
                    }
                    this.field2230[var19++] = var25;
                    if (var20 > var25) {
                        var20 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class302.method1758(16, var26) + 1 - this.field2226;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class503 var28 = var22.field6933;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field2228 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field2227[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field2236[var34] = 0;
                    }
                    while (var22 != var28) {
                        class288 var35 = (class288) var28;
                        if (var32) {
                            var32 = false;
                            var30 = var35.field3764;
                            var31 = var35.field3761;
                        }
                        if (var29 > 0 && (var35.field3764 != var30 || var35.field3761 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field2230[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field2227[var36] >= 64) {
                                label151: {
                                    if (this.field2227[var36] == 64) {
                                        if (this.field2228 == 64) {
                                            break label151;
                                        }
                                        this.field2227[var36] += this.field2228++ + 1;
                                    }
                                    this.field2229[this.field2227[var36] - 64 - 1][this.field2236[this.field2227[var36] - 64 - 1]++] = var35;
                                }
                            } else {
                                this.field2233[var36][this.field2227[var36]++] = var35;
                            }
                        }
                        var28 = var28.field6933;
                    }
                    if (var30 < 0) {
                        arg0.method2980(null, 117);
                    } else {
                        arg0.method2980(arg0.field7392.method1566(var30, (byte) 56), 111);
                        arg0.method2976((byte) 51, arg0.field2375.method677(2459, var30).field3642);
                    }
                    if (var31 && class234.field3152 != arg0.field7524) {
                        arg0.method559(class234.field3152);
                    } else if (arg0.field7524 != 1.0F) {
                        arg0.method559(1.0F);
                    }
                    this.method1054(-1601, var26, arg0);
                }
            }
        } catch (Exception var37) {
        }
        this.method1058(arg0, 79);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V", line = 310)
    public static final void method1053(byte arg0) {
        field2216++;
        if (arg0 > -78 || class401.field5381 == null) {
            return;
        }
        if (class401.field5381.field6100 == 1) {
            class401.field5381 = null;
            return;
        }
        if (class401.field5381.field6100 == 2) {
            class390.method2297(2, class497.field6883, 2, class516.field7651);
            class401.field5381 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILbo;)V", line = 338)
    private final void method1054(int arg0, int arg1, class511 arg2) {
        OpenGL.glGetFloatv(2982, this.field2217, 0);
        field2219++;
        float var4 = this.field2217[0];
        float var5 = this.field2217[4];
        float var6 = this.field2217[8];
        float var7 = this.field2217[1];
        float var8 = this.field2217[5];
        float var9 = this.field2217[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        if (arg0 != -1601) {
            field2232 = null;
        }
        float var18 = var9 - var6;
        this.field2218.field5173 = 0;
        if (arg2.field7493) {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field2227[var19] <= 64 ? this.field2227[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class288 var34 = this.field2233[var19][var21];
                        int var35 = var34.field3763;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field3769 >> class63.field977);
                        float var41 = (float) (var34.field3767 >> class63.field977);
                        float var42 = (float) (var34.field3762 >> class63.field977);
                        int var43 = var34.field3768 >> class63.field977;
                        this.field2218.method1194((byte) 107, 0.0F);
                        this.field2218.method1194((byte) -29, 0.0F);
                        this.field2218.method1194((byte) 90, (float) (-var43) * var10 + var40);
                        this.field2218.method1194((byte) -50, (float) (-var43) * var11 + var41);
                        this.field2218.method1194((byte) 111, (float) (-var43) * var12 + var42);
                        this.field2218.method2200(7, var36);
                        this.field2218.method2200(7, var37);
                        this.field2218.method2200(arg0 ^ 0xFFFFF9B8, var38);
                        this.field2218.method2200(7, var39);
                        this.field2218.method1194((byte) -45, 1.0F);
                        this.field2218.method1194((byte) -31, 0.0F);
                        this.field2218.method1194((byte) -34, (float) var43 * var13 + var40);
                        this.field2218.method1194((byte) 92, (float) var43 * var14 + var41);
                        this.field2218.method1194((byte) 127, (float) var43 * var15 + var42);
                        this.field2218.method2200(7, var36);
                        this.field2218.method2200(arg0 + 1608, var37);
                        this.field2218.method2200(7, var38);
                        this.field2218.method2200(arg0 ^ 0xFFFFF9B8, var39);
                        this.field2218.method1194((byte) -51, 1.0F);
                        this.field2218.method1194((byte) -64, 1.0F);
                        this.field2218.method1194((byte) -118, (float) var43 * var10 + var40);
                        this.field2218.method1194((byte) -61, (float) var43 * var11 + var41);
                        this.field2218.method1194((byte) 91, (float) var43 * var12 + var42);
                        this.field2218.method2200(7, var36);
                        this.field2218.method2200(7, var37);
                        this.field2218.method2200(arg0 + 1608, var38);
                        this.field2218.method2200(7, var39);
                        this.field2218.method1194((byte) -103, 0.0F);
                        this.field2218.method1194((byte) -55, 1.0F);
                        this.field2218.method1194((byte) 107, (float) var43 * var16 + var40);
                        this.field2218.method1194((byte) 124, (float) var43 * var17 + var41);
                        this.field2218.method1194((byte) -27, (float) var43 * var18 + var42);
                        this.field2218.method2200(7, var36);
                        this.field2218.method2200(arg0 + 1608, var37);
                        this.field2218.method2200(7, var38);
                        this.field2218.method2200(7, var39);
                    }
                    if (this.field2227[var19] > 64) {
                        int var22 = this.field2227[var19] - 1 - 64;
                        for (int var23 = this.field2236[var22] - 1; var23 >= 0; var23--) {
                            class288 var24 = this.field2229[var22][var23];
                            int var25 = var24.field3763;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field3769 >> class63.field977);
                            float var31 = (float) (var24.field3767 >> class63.field977);
                            float var32 = (float) (var24.field3762 >> class63.field977);
                            int var33 = var24.field3768 >> class63.field977;
                            this.field2218.method1194((byte) 122, 0.0F);
                            this.field2218.method1194((byte) -54, 0.0F);
                            this.field2218.method1194((byte) -59, (float) (-var33) * var10 + var30);
                            this.field2218.method1194((byte) -39, (float) (-var33) * var11 + var31);
                            this.field2218.method1194((byte) 97, (float) (-var33) * var12 + var32);
                            this.field2218.method2200(7, var26);
                            this.field2218.method2200(7, var27);
                            this.field2218.method2200(arg0 + 1608, var28);
                            this.field2218.method2200(7, var29);
                            this.field2218.method1194((byte) -41, 1.0F);
                            this.field2218.method1194((byte) 84, 0.0F);
                            this.field2218.method1194((byte) -48, (float) var33 * var13 + var30);
                            this.field2218.method1194((byte) 115, (float) var33 * var14 + var31);
                            this.field2218.method1194((byte) -28, (float) var33 * var15 + var32);
                            this.field2218.method2200(7, var26);
                            this.field2218.method2200(arg0 ^ 0xFFFFF9B8, var27);
                            this.field2218.method2200(7, var28);
                            this.field2218.method2200(7, var29);
                            this.field2218.method1194((byte) 124, 1.0F);
                            this.field2218.method1194((byte) 117, 1.0F);
                            this.field2218.method1194((byte) 123, (float) var33 * var10 + var30);
                            this.field2218.method1194((byte) 78, (float) var33 * var11 + var31);
                            this.field2218.method1194((byte) -97, (float) var33 * var12 + var32);
                            this.field2218.method2200(7, var26);
                            this.field2218.method2200(arg0 ^ 0xFFFFF9B8, var27);
                            this.field2218.method2200(7, var28);
                            this.field2218.method2200(arg0 + 1608, var29);
                            this.field2218.method1194((byte) 127, 0.0F);
                            this.field2218.method1194((byte) 119, 1.0F);
                            this.field2218.method1194((byte) 126, (float) var33 * var16 + var30);
                            this.field2218.method1194((byte) 82, (float) var33 * var17 + var31);
                            this.field2218.method1194((byte) -30, (float) var33 * var18 + var32);
                            this.field2218.method2200(7, var26);
                            this.field2218.method2200(7, var27);
                            this.field2218.method2200(arg0 + 1608, var28);
                            this.field2218.method2200(7, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field2227[var44] > 64 ? 64 : this.field2227[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class288 var59 = this.field2233[var44][var46];
                        int var60 = var59.field3763;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field3769 >> class63.field977);
                        float var66 = (float) (var59.field3767 >> class63.field977);
                        float var67 = (float) (var59.field3762 >> class63.field977);
                        int var68 = var59.field3768 >> class63.field977;
                        this.field2218.method1197(1495637648, 0.0F);
                        this.field2218.method1197(1495637648, 0.0F);
                        this.field2218.method1197(1495637648, (float) (-var68) * var10 + var65);
                        this.field2218.method1197(1495637648, (float) (-var68) * var11 + var66);
                        this.field2218.method1197(arg0 ^ 0xA6DA672F, (float) (-var68) * var12 + var67);
                        this.field2218.method2200(7, var61);
                        this.field2218.method2200(7, var62);
                        this.field2218.method2200(7, var63);
                        this.field2218.method2200(7, var64);
                        this.field2218.method1197(arg0 + 1495639249, 1.0F);
                        this.field2218.method1197(1495637648, 0.0F);
                        this.field2218.method1197(arg0 ^ 0xA6DA672F, (float) var68 * var13 + var65);
                        this.field2218.method1197(1495637648, (float) var68 * var14 + var66);
                        this.field2218.method1197(1495637648, (float) var68 * var15 + var67);
                        this.field2218.method2200(7, var61);
                        this.field2218.method2200(arg0 ^ 0xFFFFF9B8, var62);
                        this.field2218.method2200(7, var63);
                        this.field2218.method2200(7, var64);
                        this.field2218.method1197(arg0 ^ 0xA6DA672F, 1.0F);
                        this.field2218.method1197(1495637648, 1.0F);
                        this.field2218.method1197(1495637648, (float) var68 * var10 + var65);
                        this.field2218.method1197(arg0 ^ 0xA6DA672F, (float) var68 * var11 + var66);
                        this.field2218.method1197(1495637648, (float) var68 * var12 + var67);
                        this.field2218.method2200(7, var61);
                        this.field2218.method2200(7, var62);
                        this.field2218.method2200(7, var63);
                        this.field2218.method2200(7, var64);
                        this.field2218.method1197(1495637648, 0.0F);
                        this.field2218.method1197(1495637648, 1.0F);
                        this.field2218.method1197(1495637648, (float) var68 * var16 + var65);
                        this.field2218.method1197(1495637648, (float) var68 * var17 + var66);
                        this.field2218.method1197(arg0 + 1495639249, (float) var68 * var18 + var67);
                        this.field2218.method2200(7, var61);
                        this.field2218.method2200(7, var62);
                        this.field2218.method2200(arg0 ^ 0xFFFFF9B8, var63);
                        this.field2218.method2200(7, var64);
                    }
                    if (this.field2227[var44] > 64) {
                        int var47 = this.field2227[var44] - 64 - 1;
                        for (int var48 = this.field2236[var47] - 1; var48 >= 0; var48--) {
                            class288 var49 = this.field2229[var47][var48];
                            int var50 = var49.field3763;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field3769 >> class63.field977);
                            float var56 = (float) (var49.field3767 >> class63.field977);
                            float var57 = (float) (var49.field3762 >> class63.field977);
                            int var58 = var49.field3768 >> class63.field977;
                            this.field2218.method1197(1495637648, 0.0F);
                            this.field2218.method1197(1495637648, 0.0F);
                            this.field2218.method1197(1495637648, (float) (-var58) * var10 + var55);
                            this.field2218.method1197(1495637648, (float) (-var58) * var11 + var56);
                            this.field2218.method1197(1495637648, (float) (-var58) * var12 + var57);
                            this.field2218.method2200(7, var51);
                            this.field2218.method2200(7, var52);
                            this.field2218.method2200(7, var53);
                            this.field2218.method2200(7, var54);
                            this.field2218.method1197(arg0 + 1495639249, 1.0F);
                            this.field2218.method1197(arg0 + 1495639249, 0.0F);
                            this.field2218.method1197(1495637648, (float) var58 * var13 + var55);
                            this.field2218.method1197(arg0 + 1495639249, (float) var58 * var14 + var56);
                            this.field2218.method1197(1495637648, (float) var58 * var15 + var57);
                            this.field2218.method2200(7, var51);
                            this.field2218.method2200(7, var52);
                            this.field2218.method2200(arg0 + 1608, var53);
                            this.field2218.method2200(7, var54);
                            this.field2218.method1197(1495637648, 1.0F);
                            this.field2218.method1197(1495637648, 1.0F);
                            this.field2218.method1197(1495637648, (float) var58 * var10 + var55);
                            this.field2218.method1197(arg0 + 1495639249, (float) var58 * var11 + var56);
                            this.field2218.method1197(1495637648, (float) var58 * var12 + var57);
                            this.field2218.method2200(7, var51);
                            this.field2218.method2200(arg0 ^ 0xFFFFF9B8, var52);
                            this.field2218.method2200(7, var53);
                            this.field2218.method2200(7, var54);
                            this.field2218.method1197(arg0 + 1495639249, 0.0F);
                            this.field2218.method1197(1495637648, 1.0F);
                            this.field2218.method1197(1495637648, (float) var58 * var16 + var55);
                            this.field2218.method1197(1495637648, (float) var58 * var17 + var56);
                            this.field2218.method1197(1495637648, (float) var58 * var18 + var57);
                            this.field2218.method2200(7, var51);
                            this.field2218.method2200(7, var52);
                            this.field2218.method2200(arg0 ^ 0xFFFFF9B8, var53);
                            this.field2218.method2200(arg0 ^ 0xFFFFF9B8, var54);
                        }
                    }
                }
            }
        }
        if (this.field2218.field5173 != 0) {
            this.field2222.method730((byte) 59, this.field2218.field5152, 24, this.field2218.field5173);
            arg2.method2975(this.field2225, this.field2221, null, this.field2223, -121);
            arg2.method3014(7, 768, this.field2218.field5173 / 24, 0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILbo;)V", line = 694)
    private final void method1055(int arg0, class511 arg1) {
        field2214++;
        class234.field3152 = arg1.field7524;
        arg1.method2973((byte) 110);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2951(false, 34018);
        arg1.method2935(47, -2);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        if (arg0 != 9) {
            field2232 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLbo;IIII)Lgk;", line = 712)
    public static final class330 method1056(byte arg0, class511 arg1, int arg2, int arg3, int arg4, int arg5) {
        field2220++;
        if (arg0 < 88) {
            method1057(null, null, -60);
        }
        if (!arg1.field7505 && (!class227.method1418((byte) 29, arg5) || !class227.method1418((byte) 15, arg4))) {
            return arg1.field7460 ? new class330(arg1, 34037, arg2, arg3, arg5, arg4, true) : new class330(arg1, arg2, arg3, arg5, arg4, class321.method1857((byte) 113, arg5), class321.method1857((byte) 113, arg4), true);
        } else {
            return new class330(arg1, 3553, arg2, arg3, arg5, arg4, true);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([[BLcd;I)V", line = 732)
    public static final void method1057(byte[][] arg0, class205 arg1, int arg2) {
        field2212++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field3591; var4++) {
            class88.method641((byte) 112);
            for (int var5 = 0; var5 < class12.field251 >> 3; var5++) {
                for (int var6 = 0; var6 < class289.field3782 >> 3; var6++) {
                    boolean var7 = false;
                    int var8 = class168.field2437[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1.field3592 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0xFFD306) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class149.field2131.length; var14++) {
                                if (class149.field2131[var14] == var13 && arg0[var14] != null) {
                                    class379 var15 = new class379(arg0[var14]);
                                    arg1.method1623(var12, arg2 - 16791588, var6 * 8, var4, class120.field1754, var10, var11, var5 * 8, var9, var15);
                                    arg1.method1316(var10, var15, var3[0] == -1 ? var3 : null, var5 * 8, var6 * 8, var11, var12, class370.field4984, arg2 - 16765702, var4, var9);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg1.method1634((byte) 2, var5 * 8, var4, var6 * 8, 8, 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class121.field1775 = class389.field5280.method652(class520.field7700, var3[3], var3[0], (byte) -69, var3[2], var3[1]);
            class205.field2831 = var3[4];
        }
        if (arg2 != 16765702) {
            method1059(61);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lbo;I)V", line = 820)
    private final void method1058(class511 arg0, int arg1) {
        int var3 = 91 % ((arg1 + 51) / 33);
        arg0.method2951(true, 34018);
        field2215++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class234.field3152 != arg0.field7524) {
            arg0.method559(class234.field3152);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 841)
    public static void method1059(int arg0) {
        field2235 = null;
        field2224 = null;
        field2231 = null;
        field2210 = null;
        if (arg0 != 7) {
            method1056((byte) -11, null, -7, 59, -31, 117);
        }
        field2232 = null;
    }
}
