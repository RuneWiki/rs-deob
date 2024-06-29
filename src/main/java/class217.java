import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class217 {

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[F")
    private float[] field3184 = new float[16];

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lrk;")
    private class25 field3179 = new class25(786336);

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    private int field3186 = class495.method2972(1600, false);

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[[Lar;")
    private class479[][] field3192 = new class479[1600][64];

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "[I")
    private int[] field3193 = new int[64];

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "[I")
    private int[] field3194 = new int[1600];

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    private int field3195 = 0;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "[[Lar;")
    private class479[][] field3196 = new class479[64][768];

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "[I")
    private int[] field3197 = new int[8191];

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field3180 = -50;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "J")
    public static long field3176 = 0L;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lnc;")
    private class21 field3190;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lbg;")
    private class323 field3187;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lbg;")
    private class323 field3188;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lbg;")
    private class323 field3191;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLod;)V")
    private final void method1507(boolean arg0, class349 arg1) {
        field3182++;
        arg1.method2177(3678, arg0);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class512.field7492 != arg1.field5307) {
            arg1.method1111(class512.field7492);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lod;B)V")
    public final void method1508(class349 arg0, byte arg1) {
        int var3 = 70 % ((arg1 + 14) / 49);
        field3183++;
        this.field3190 = arg0.method2166((byte) -75, 24, 196584, true, null);
        this.field3191 = new class323(this.field3190, 5126, 2, 0);
        this.field3187 = new class323(this.field3190, 5126, 3, 8);
        this.field3188 = new class323(this.field3190, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLpo;Lod;)V")
    public final void method1509(byte arg0, class389 arg1, class349 arg2) {
        field3185++;
        if (arg2.field5320 == null) {
            return;
        }
        this.method1510(arg2, -73);
        if (arg0 != -25) {
            field3180 = 103;
        }
        float var4 = arg2.field5320.field3329;
        float var5 = arg2.field5320.field3352;
        float var6 = arg2.field5320.field3338;
        float var7 = arg2.field5320.field3344;
        try {
            if (arg1.field5873) {
                int var8 = arg1.field5874 - arg1.field5875;
                int var9;
                if (var8 + 2 > 1600) {
                    var9 = class495.method2972(var8, false) + 1 - this.field3186;
                    var8 = (var8 >> var9) + 2;
                } else {
                    var8 += 2;
                    var9 = 0;
                }
                class525 var10 = arg1.field5869.field3052;
                class525 var11 = var10.field7768;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field3195 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field3194[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field3193[var16] = 0;
                    }
                    while (var10 != var11) {
                        class479 var17 = (class479) var11;
                        if (var14) {
                            var12 = var17.field7036;
                            var14 = false;
                            var13 = var17.field7035;
                        } else if (var17.field7036 != var12 || var13 != var17.field7035) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field7031 >> class189.field2799) * var6 + (float) (var17.field7041 >> class189.field2799) * var4 + (float) (var17.field7030 >> class189.field2799) * var5 + var7) - arg1.field5875 >> var9;
                        if (var18 < 1600) {
                            if (this.field3194[var18] >= 64) {
                                label190: {
                                    if (this.field3194[var18] == 64) {
                                        if (this.field3195 == 64) {
                                            break label190;
                                        }
                                        this.field3194[var18] += (this.field3195++) + 1;
                                    }
                                    class479[] var10000 = this.field3196[this.field3194[var18] - 64 - 1];
                                    int var10002 = this.field3194[var18] - 65;
                                    int var10004 = this.field3193[this.field3194[var18] - 65];
                                    this.field3193[var10002] = this.field3193[this.field3194[var18] - 65] + 1;
                                    var10000[var10004] = var17;
                                }
                            } else {
                                this.field3192[var18][this.field3194[var18]++] = var17;
                            }
                        }
                        var11 = var11.field7768;
                    }
                    if (var12 >= 0) {
                        arg2.method2200(arg2.field5220.method2494(-1, var12), (byte) 126);
                        arg2.method2186(arg2.field2379.method838(true, var12).field4592, -104);
                    } else {
                        arg2.method2200(null, (byte) 118);
                    }
                    if (var13 && class512.field7492 != arg2.field5307) {
                        arg2.method1111(class512.field7492);
                    } else if (arg2.field5307 != 1.0F) {
                        arg2.method1111(1.0F);
                    }
                    this.method1511(0, arg2, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class525 var22 = arg1.field5869.field3052;
                for (class525 var23 = var22.field7768; var23 != var22; var23 = var23.field7768) {
                    class479 var24 = (class479) var23;
                    int var25 = (int) ((float) (var24.field7031 >> class189.field2799) * var6 + (float) (var24.field7041 >> class189.field2799) * var4 + (float) (var24.field7030 >> class189.field2799) * var5 + var7);
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    this.field3197[var19++] = var25;
                    if (var20 > var25) {
                        var20 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) <= 1600) {
                    var26 += 2;
                    var27 = 0;
                } else {
                    var27 = class495.method2972(var26, false) + 1 - this.field3186;
                    var26 = (var26 >> var27) + 2;
                }
                class525 var28 = var22.field7768;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field3195 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field3194[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field3193[var34] = 0;
                    }
                    while (var22 != var28) {
                        class479 var35 = (class479) var28;
                        if (var32) {
                            var30 = var35.field7036;
                            var32 = false;
                            var31 = var35.field7035;
                        }
                        if (var29 > 0 && (var35.field7036 != var30 || var35.field7035 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field3197[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field3194[var36] >= 64) {
                                label140: {
                                    if (this.field3194[var36] == 64) {
                                        if (this.field3195 == 64) {
                                            break label140;
                                        }
                                        this.field3194[var36] += this.field3195++ + 1;
                                    }
                                    this.field3196[this.field3194[var36] - 65][this.field3193[this.field3194[var36] - 64 - 1]++] = var35;
                                }
                            } else {
                                this.field3192[var36][this.field3194[var36]++] = var35;
                            }
                        }
                        var28 = var28.field7768;
                    }
                    if (var30 >= 0) {
                        arg2.method2200(arg2.field5220.method2494(-1, var30), (byte) 116);
                        arg2.method2186(arg2.field2379.method838(true, var30).field4592, arg0 - 29);
                    } else {
                        arg2.method2200(null, (byte) 125);
                    }
                    if (var31 && class512.field7492 != arg2.field5307) {
                        arg2.method1111(class512.field7492);
                    } else if (arg2.field5307 != 1.0F) {
                        arg2.method1111(1.0F);
                    }
                    this.method1511(0, arg2, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method1507(true, arg2);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lod;I)V")
    private final void method1510(class349 arg0, int arg1) {
        field3178++;
        class512.field7492 = arg0.field5307;
        arg0.method2142(-2);
        OpenGL.glDisable(16384);
        if (arg1 < -66) {
            OpenGL.glDisable(16385);
            arg0.method2177(3678, false);
            arg0.method2161(84, -2);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILod;I)V")
    private final void method1511(int arg0, class349 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field3184, 0);
        field3181++;
        float var4 = this.field3184[0];
        float var5 = this.field3184[4];
        float var6 = this.field3184[8];
        float var7 = this.field3184[1];
        float var8 = this.field3184[5];
        float var9 = this.field3184[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field3179.field3037 = arg0;
        if (arg1.field5313) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field3194[var44] > 64 ? 64 : this.field3194[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class479 var59 = this.field3192[var44][var46];
                        int var60 = var59.field7039;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field7041 >> class189.field2799);
                        float var66 = (float) (var59.field7030 >> class189.field2799);
                        float var67 = (float) (var59.field7031 >> class189.field2799);
                        int var68 = var59.field7032 >> class189.field2799;
                        this.field3179.method157(0.0F, 103);
                        this.field3179.method157(0.0F, -110);
                        this.field3179.method157((float) (-var68) * var10 + var65, -126);
                        this.field3179.method157((float) (-var68) * var11 + var66, 99);
                        this.field3179.method157((float) (-var68) * var12 + var67, 102);
                        this.field3179.method1410(var61, -27645);
                        this.field3179.method1410(var62, -27645);
                        this.field3179.method1410(var63, -27645);
                        this.field3179.method1410(var64, -27645);
                        this.field3179.method157(1.0F, -117);
                        this.field3179.method157(0.0F, -127);
                        this.field3179.method157((float) var68 * var13 + var65, -99);
                        this.field3179.method157((float) var68 * var14 + var66, 119);
                        this.field3179.method157((float) var68 * var15 + var67, 56);
                        this.field3179.method1410(var61, -27645);
                        this.field3179.method1410(var62, -27645);
                        this.field3179.method1410(var63, arg0 ^ 0xFFFF9403);
                        this.field3179.method1410(var64, -27645);
                        this.field3179.method157(1.0F, arg0 + 48);
                        this.field3179.method157(1.0F, 83);
                        this.field3179.method157((float) var68 * var10 + var65, -99);
                        this.field3179.method157((float) var68 * var11 + var66, -118);
                        this.field3179.method157((float) var68 * var12 + var67, -114);
                        this.field3179.method1410(var61, -27645);
                        this.field3179.method1410(var62, -27645);
                        this.field3179.method1410(var63, -27645);
                        this.field3179.method1410(var64, -27645);
                        this.field3179.method157(0.0F, arg0 ^ 0xFFFFFFA8);
                        this.field3179.method157(1.0F, -65);
                        this.field3179.method157((float) var68 * var16 + var65, -73);
                        this.field3179.method157((float) var68 * var17 + var66, 36);
                        this.field3179.method157((float) var68 * var18 + var67, arg0 ^ 0xFFFFFFBC);
                        this.field3179.method1410(var61, arg0 ^ 0xFFFF9403);
                        this.field3179.method1410(var62, arg0 - 27645);
                        this.field3179.method1410(var63, -27645);
                        this.field3179.method1410(var64, -27645);
                    }
                    if (this.field3194[var44] > 64) {
                        int var47 = this.field3194[var44] - 65;
                        for (int var48 = this.field3193[var47] - 1; var48 >= 0; var48--) {
                            class479 var49 = this.field3196[var47][var48];
                            int var50 = var49.field7039;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field7041 >> class189.field2799);
                            float var56 = (float) (var49.field7030 >> class189.field2799);
                            float var57 = (float) (var49.field7031 >> class189.field2799);
                            int var58 = var49.field7032 >> class189.field2799;
                            this.field3179.method157(0.0F, 73);
                            this.field3179.method157(0.0F, 49);
                            this.field3179.method157((float) (-var58) * var10 + var55, -98);
                            this.field3179.method157((float) (-var58) * var11 + var56, arg0 + 70);
                            this.field3179.method157((float) (-var58) * var12 + var57, arg0 + 74);
                            this.field3179.method1410(var51, -27645);
                            this.field3179.method1410(var52, -27645);
                            this.field3179.method1410(var53, -27645);
                            this.field3179.method1410(var54, -27645);
                            this.field3179.method157(1.0F, 75);
                            this.field3179.method157(0.0F, -97);
                            this.field3179.method157((float) var58 * var13 + var55, -97);
                            this.field3179.method157((float) var58 * var14 + var56, -121);
                            this.field3179.method157((float) var58 * var15 + var57, 84);
                            this.field3179.method1410(var51, -27645);
                            this.field3179.method1410(var52, arg0 - 27645);
                            this.field3179.method1410(var53, -27645);
                            this.field3179.method1410(var54, arg0 - 27645);
                            this.field3179.method157(1.0F, arg0 ^ 0x3F);
                            this.field3179.method157(1.0F, 114);
                            this.field3179.method157((float) var58 * var10 + var55, 112);
                            this.field3179.method157((float) var58 * var11 + var56, -77);
                            this.field3179.method157((float) var58 * var12 + var57, -114);
                            this.field3179.method1410(var51, -27645);
                            this.field3179.method1410(var52, -27645);
                            this.field3179.method1410(var53, -27645);
                            this.field3179.method1410(var54, arg0 ^ 0xFFFF9403);
                            this.field3179.method157(0.0F, 42);
                            this.field3179.method157(1.0F, -75);
                            this.field3179.method157((float) var58 * var16 + var55, -124);
                            this.field3179.method157((float) var58 * var17 + var56, arg0 + 112);
                            this.field3179.method157((float) var58 * var18 + var57, -98);
                            this.field3179.method1410(var51, -27645);
                            this.field3179.method1410(var52, -27645);
                            this.field3179.method1410(var53, arg0 ^ 0xFFFF9403);
                            this.field3179.method1410(var54, -27645);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field3194[var19] > 64 ? 64 : this.field3194[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class479 var34 = this.field3192[var19][var21];
                        int var35 = var34.field7039;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field7041 >> class189.field2799);
                        float var41 = (float) (var34.field7030 >> class189.field2799);
                        float var42 = (float) (var34.field7031 >> class189.field2799);
                        int var43 = var34.field7032 >> class189.field2799;
                        this.field3179.method159(0.0F, (byte) -37);
                        this.field3179.method159(0.0F, (byte) -37);
                        this.field3179.method159((float) (-var43) * var10 + var40, (byte) -37);
                        this.field3179.method159((float) (-var43) * var11 + var41, (byte) -37);
                        this.field3179.method159((float) (-var43) * var12 + var42, (byte) -37);
                        this.field3179.method1410(var36, -27645);
                        this.field3179.method1410(var37, -27645);
                        this.field3179.method1410(var38, -27645);
                        this.field3179.method1410(var39, -27645);
                        this.field3179.method159(1.0F, (byte) -37);
                        this.field3179.method159(0.0F, (byte) -37);
                        this.field3179.method159((float) var43 * var13 + var40, (byte) -37);
                        this.field3179.method159((float) var43 * var14 + var41, (byte) -37);
                        this.field3179.method159((float) var43 * var15 + var42, (byte) -37);
                        this.field3179.method1410(var36, arg0 ^ 0xFFFF9403);
                        this.field3179.method1410(var37, -27645);
                        this.field3179.method1410(var38, -27645);
                        this.field3179.method1410(var39, -27645);
                        this.field3179.method159(1.0F, (byte) -37);
                        this.field3179.method159(1.0F, (byte) -37);
                        this.field3179.method159((float) var43 * var10 + var40, (byte) -37);
                        this.field3179.method159((float) var43 * var11 + var41, (byte) -37);
                        this.field3179.method159((float) var43 * var12 + var42, (byte) -37);
                        this.field3179.method1410(var36, -27645);
                        this.field3179.method1410(var37, -27645);
                        this.field3179.method1410(var38, arg0 - 27645);
                        this.field3179.method1410(var39, arg0 - 27645);
                        this.field3179.method159(0.0F, (byte) -37);
                        this.field3179.method159(1.0F, (byte) -37);
                        this.field3179.method159((float) var43 * var16 + var40, (byte) -37);
                        this.field3179.method159((float) var43 * var17 + var41, (byte) -37);
                        this.field3179.method159((float) var43 * var18 + var42, (byte) -37);
                        this.field3179.method1410(var36, -27645);
                        this.field3179.method1410(var37, -27645);
                        this.field3179.method1410(var38, -27645);
                        this.field3179.method1410(var39, -27645);
                    }
                    if (this.field3194[var19] > 64) {
                        int var22 = this.field3194[var19] - 1 - 64;
                        for (int var23 = this.field3193[var22] - 1; var23 >= 0; var23--) {
                            class479 var24 = this.field3196[var22][var23];
                            int var25 = var24.field7039;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field7041 >> class189.field2799);
                            float var31 = (float) (var24.field7030 >> class189.field2799);
                            float var32 = (float) (var24.field7031 >> class189.field2799);
                            int var33 = var24.field7032 >> class189.field2799;
                            this.field3179.method159(0.0F, (byte) -37);
                            this.field3179.method159(0.0F, (byte) -37);
                            this.field3179.method159((float) (-var33) * var10 + var30, (byte) -37);
                            this.field3179.method159((float) (-var33) * var11 + var31, (byte) -37);
                            this.field3179.method159((float) (-var33) * var12 + var32, (byte) -37);
                            this.field3179.method1410(var26, arg0 - 27645);
                            this.field3179.method1410(var27, -27645);
                            this.field3179.method1410(var28, -27645);
                            this.field3179.method1410(var29, arg0 ^ 0xFFFF9403);
                            this.field3179.method159(1.0F, (byte) -37);
                            this.field3179.method159(0.0F, (byte) -37);
                            this.field3179.method159((float) var33 * var13 + var30, (byte) -37);
                            this.field3179.method159((float) var33 * var14 + var31, (byte) -37);
                            this.field3179.method159((float) var33 * var15 + var32, (byte) -37);
                            this.field3179.method1410(var26, arg0 - 27645);
                            this.field3179.method1410(var27, -27645);
                            this.field3179.method1410(var28, -27645);
                            this.field3179.method1410(var29, -27645);
                            this.field3179.method159(1.0F, (byte) -37);
                            this.field3179.method159(1.0F, (byte) -37);
                            this.field3179.method159((float) var33 * var10 + var30, (byte) -37);
                            this.field3179.method159((float) var33 * var11 + var31, (byte) -37);
                            this.field3179.method159((float) var33 * var12 + var32, (byte) -37);
                            this.field3179.method1410(var26, -27645);
                            this.field3179.method1410(var27, -27645);
                            this.field3179.method1410(var28, arg0 - 27645);
                            this.field3179.method1410(var29, arg0 ^ 0xFFFF9403);
                            this.field3179.method159(0.0F, (byte) -37);
                            this.field3179.method159(1.0F, (byte) -37);
                            this.field3179.method159((float) var33 * var16 + var30, (byte) -37);
                            this.field3179.method159((float) var33 * var17 + var31, (byte) -37);
                            this.field3179.method159((float) var33 * var18 + var32, (byte) -37);
                            this.field3179.method1410(var26, -27645);
                            this.field3179.method1410(var27, -27645);
                            this.field3179.method1410(var28, -27645);
                            this.field3179.method1410(var29, -27645);
                        }
                    }
                }
            }
        }
        if (this.field3179.field3037 != 0) {
            this.field3190.method139(this.field3179.field3036, this.field3179.field3037, 24, 80);
            arg1.method2173((byte) 107, this.field3191, this.field3188, null, this.field3187);
            arg1.method2154(7, 0, this.field3179.field3037 / 24, -113);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class430 var7 = new class430();
        var7.field6421 = arg1 >> class192.field2815;
        var7.field6432 = arg2 >> class192.field2815;
        var7.field6434 = arg3 >> class192.field2815;
        var7.field6429 = arg4 >> class192.field2815;
        var7.field6425 = arg0;
        var7.field6428 = arg1;
        var7.field6420 = arg2;
        var7.field6430 = arg3;
        var7.field6427 = arg4;
        var7.field6436 = arg5;
        var7.field6433 = arg6;
        class210.field3063[class56.field870++] = var7;
    }
}
