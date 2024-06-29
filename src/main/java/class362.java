import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class362 {

    @OriginalMember(owner = "client!je", name = "b", descriptor = "[F")
    private float[] field5469 = new float[16];

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Log;")
    private class547 field5475 = new class547(786336);

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    private int field5479 = class730.method4052(1600, 89);

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[I")
    private int[] field5483 = new int[64];

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    private int field5485 = 0;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
    private int[] field5484 = new int[8191];

    @OriginalMember(owner = "client!je", name = "u", descriptor = "[[Lej;")
    private class176[][] field5488 = new class176[64][768];

    @OriginalMember(owner = "client!je", name = "t", descriptor = "[[Lej;")
    private class176[][] field5487 = new class176[1600][64];

    @OriginalMember(owner = "client!je", name = "s", descriptor = "[I")
    private int[] field5486 = new int[1600];

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field5473 = 0;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Ljs;")
    private class170 field5480;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lak;")
    private class497 field5476;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lak;")
    private class497 field5477;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lak;")
    private class497 field5478;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILrs;)V")
    public final void method2299(int arg0, class166 arg1) {
        field5472++;
        this.field5480 = arg1.method1255(516, true, 196584, null, 24);
        this.field5477 = new class497(this.field5480, 5126, 2, 0);
        if (arg0 > -40) {
            this.method2300(null, 83, (byte) -17);
        }
        this.field5478 = new class497(this.field5480, 5126, 3, 8);
        this.field5476 = new class497(this.field5480, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lrs;IB)V")
    private final void method2300(class166 arg0, int arg1, byte arg2) {
        field5470++;
        class734.field10347 = arg0.field2795;
        arg0.method1316((byte) -127, (float) arg1);
        arg0.method1309(25508);
        OpenGL.glDisable(16384);
        if (arg2 != -4) {
            field5468 = 57;
        }
        OpenGL.glDisable(16385);
        arg0.method1263((byte) 104, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lrs;B)V")
    private final void method2301(class166 arg0, byte arg1) {
        field5471++;
        class734.field10347 = arg0.field2795;
        arg0.method1331((byte) -100);
        int var3 = -76 % ((arg1 - 61) / 54);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method1263((byte) 104, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lrs;II)V")
    private final void method2302(class166 arg0, int arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field5469, 0);
        field5474++;
        float var4 = this.field5469[0];
        float var5 = this.field5469[4];
        float var6 = this.field5469[8];
        float var7 = this.field5469[1];
        float var8 = this.field5469[5];
        float var9 = this.field5469[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        if (arg1 < 95) {
            this.method2301(null, (byte) 26);
        }
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5475.field4534 = 0;
        float var18 = var9 - var6;
        if (arg0.field2796) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field5486[var44] > 64 ? 64 : this.field5486[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class176 var59 = this.field5487[var44][var46];
                        int var60 = var59.field3021;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field3015 >> 12);
                        float var66 = (float) (var59.field3022 >> 12);
                        float var67 = (float) (var59.field3016 >> 12);
                        int var68 = var59.field3017 >> 12;
                        this.field5475.method3200(0.0F, 238551736);
                        this.field5475.method3200(0.0F, 238551736);
                        this.field5475.method3200((float) (-var68) * var10 + var65, 238551736);
                        this.field5475.method3200((float) (-var68) * var11 + var66, 238551736);
                        this.field5475.method3200((float) (-var68) * var12 + var67, 238551736);
                        this.field5475.method1926(var61, 65280);
                        this.field5475.method1926(var62, 65280);
                        this.field5475.method1926(var63, 65280);
                        this.field5475.method1926(var64, 65280);
                        this.field5475.method3200(1.0F, 238551736);
                        this.field5475.method3200(0.0F, 238551736);
                        this.field5475.method3200((float) var68 * var13 + var65, 238551736);
                        this.field5475.method3200((float) var68 * var14 + var66, 238551736);
                        this.field5475.method3200((float) var68 * var15 + var67, 238551736);
                        this.field5475.method1926(var61, 65280);
                        this.field5475.method1926(var62, 65280);
                        this.field5475.method1926(var63, 65280);
                        this.field5475.method1926(var64, 65280);
                        this.field5475.method3200(1.0F, 238551736);
                        this.field5475.method3200(1.0F, 238551736);
                        this.field5475.method3200((float) var68 * var10 + var65, 238551736);
                        this.field5475.method3200((float) var68 * var11 + var66, 238551736);
                        this.field5475.method3200((float) var68 * var12 + var67, 238551736);
                        this.field5475.method1926(var61, 65280);
                        this.field5475.method1926(var62, 65280);
                        this.field5475.method1926(var63, 65280);
                        this.field5475.method1926(var64, 65280);
                        this.field5475.method3200(0.0F, 238551736);
                        this.field5475.method3200(1.0F, 238551736);
                        this.field5475.method3200((float) var68 * var16 + var65, 238551736);
                        this.field5475.method3200((float) var68 * var17 + var66, 238551736);
                        this.field5475.method3200((float) var68 * var18 + var67, 238551736);
                        this.field5475.method1926(var61, 65280);
                        this.field5475.method1926(var62, 65280);
                        this.field5475.method1926(var63, 65280);
                        this.field5475.method1926(var64, 65280);
                    }
                    if (this.field5486[var44] > 64) {
                        int var47 = this.field5486[var44] - 65;
                        for (int var48 = this.field5483[var47] - 1; var48 >= 0; var48--) {
                            class176 var49 = this.field5488[var47][var48];
                            int var50 = var49.field3021;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field3015 >> 12);
                            float var56 = (float) (var49.field3022 >> 12);
                            float var57 = (float) (var49.field3016 >> 12);
                            int var58 = var49.field3017 >> 12;
                            this.field5475.method3200(0.0F, 238551736);
                            this.field5475.method3200(0.0F, 238551736);
                            this.field5475.method3200((float) (-var58) * var10 + var55, 238551736);
                            this.field5475.method3200((float) (-var58) * var11 + var56, 238551736);
                            this.field5475.method3200((float) (-var58) * var12 + var57, 238551736);
                            this.field5475.method1926(var51, 65280);
                            this.field5475.method1926(var52, 65280);
                            this.field5475.method1926(var53, 65280);
                            this.field5475.method1926(var54, 65280);
                            this.field5475.method3200(1.0F, 238551736);
                            this.field5475.method3200(0.0F, 238551736);
                            this.field5475.method3200((float) var58 * var13 + var55, 238551736);
                            this.field5475.method3200((float) var58 * var14 + var56, 238551736);
                            this.field5475.method3200((float) var58 * var15 + var57, 238551736);
                            this.field5475.method1926(var51, 65280);
                            this.field5475.method1926(var52, 65280);
                            this.field5475.method1926(var53, 65280);
                            this.field5475.method1926(var54, 65280);
                            this.field5475.method3200(1.0F, 238551736);
                            this.field5475.method3200(1.0F, 238551736);
                            this.field5475.method3200((float) var58 * var10 + var55, 238551736);
                            this.field5475.method3200((float) var58 * var11 + var56, 238551736);
                            this.field5475.method3200((float) var58 * var12 + var57, 238551736);
                            this.field5475.method1926(var51, 65280);
                            this.field5475.method1926(var52, 65280);
                            this.field5475.method1926(var53, 65280);
                            this.field5475.method1926(var54, 65280);
                            this.field5475.method3200(0.0F, 238551736);
                            this.field5475.method3200(1.0F, 238551736);
                            this.field5475.method3200((float) var58 * var16 + var55, 238551736);
                            this.field5475.method3200((float) var58 * var17 + var56, 238551736);
                            this.field5475.method3200((float) var58 * var18 + var57, 238551736);
                            this.field5475.method1926(var51, 65280);
                            this.field5475.method1926(var52, 65280);
                            this.field5475.method1926(var53, 65280);
                            this.field5475.method1926(var54, 65280);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field5486[var19] <= 64 ? this.field5486[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class176 var34 = this.field5487[var19][var21];
                        int var35 = var34.field3021;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field3015 >> 12);
                        float var41 = (float) (var34.field3022 >> 12);
                        float var42 = (float) (var34.field3016 >> 12);
                        int var43 = var34.field3017 >> 12;
                        this.field5475.method3201(-1581865480, 0.0F);
                        this.field5475.method3201(-1581865480, 0.0F);
                        this.field5475.method3201(-1581865480, (float) (-var43) * var10 + var40);
                        this.field5475.method3201(-1581865480, (float) (-var43) * var11 + var41);
                        this.field5475.method3201(-1581865480, (float) (-var43) * var12 + var42);
                        this.field5475.method1926(var36, 65280);
                        this.field5475.method1926(var37, 65280);
                        this.field5475.method1926(var38, 65280);
                        this.field5475.method1926(var39, 65280);
                        this.field5475.method3201(-1581865480, 1.0F);
                        this.field5475.method3201(-1581865480, 0.0F);
                        this.field5475.method3201(-1581865480, (float) var43 * var13 + var40);
                        this.field5475.method3201(-1581865480, (float) var43 * var14 + var41);
                        this.field5475.method3201(-1581865480, (float) var43 * var15 + var42);
                        this.field5475.method1926(var36, 65280);
                        this.field5475.method1926(var37, 65280);
                        this.field5475.method1926(var38, 65280);
                        this.field5475.method1926(var39, 65280);
                        this.field5475.method3201(-1581865480, 1.0F);
                        this.field5475.method3201(-1581865480, 1.0F);
                        this.field5475.method3201(-1581865480, (float) var43 * var10 + var40);
                        this.field5475.method3201(-1581865480, (float) var43 * var11 + var41);
                        this.field5475.method3201(-1581865480, (float) var43 * var12 + var42);
                        this.field5475.method1926(var36, 65280);
                        this.field5475.method1926(var37, 65280);
                        this.field5475.method1926(var38, 65280);
                        this.field5475.method1926(var39, 65280);
                        this.field5475.method3201(-1581865480, 0.0F);
                        this.field5475.method3201(-1581865480, 1.0F);
                        this.field5475.method3201(-1581865480, (float) var43 * var16 + var40);
                        this.field5475.method3201(-1581865480, (float) var43 * var17 + var41);
                        this.field5475.method3201(-1581865480, (float) var43 * var18 + var42);
                        this.field5475.method1926(var36, 65280);
                        this.field5475.method1926(var37, 65280);
                        this.field5475.method1926(var38, 65280);
                        this.field5475.method1926(var39, 65280);
                    }
                    if (this.field5486[var19] > 64) {
                        int var22 = this.field5486[var19] - 64 - 1;
                        for (int var23 = this.field5483[var22] - 1; var23 >= 0; var23--) {
                            class176 var24 = this.field5488[var22][var23];
                            int var25 = var24.field3021;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field3015 >> 12);
                            float var31 = (float) (var24.field3022 >> 12);
                            float var32 = (float) (var24.field3016 >> 12);
                            int var33 = var24.field3017 >> 12;
                            this.field5475.method3201(-1581865480, 0.0F);
                            this.field5475.method3201(-1581865480, 0.0F);
                            this.field5475.method3201(-1581865480, (float) (-var33) * var10 + var30);
                            this.field5475.method3201(-1581865480, (float) (-var33) * var11 + var31);
                            this.field5475.method3201(-1581865480, (float) (-var33) * var12 + var32);
                            this.field5475.method1926(var26, 65280);
                            this.field5475.method1926(var27, 65280);
                            this.field5475.method1926(var28, 65280);
                            this.field5475.method1926(var29, 65280);
                            this.field5475.method3201(-1581865480, 1.0F);
                            this.field5475.method3201(-1581865480, 0.0F);
                            this.field5475.method3201(-1581865480, (float) var33 * var13 + var30);
                            this.field5475.method3201(-1581865480, (float) var33 * var14 + var31);
                            this.field5475.method3201(-1581865480, (float) var33 * var15 + var32);
                            this.field5475.method1926(var26, 65280);
                            this.field5475.method1926(var27, 65280);
                            this.field5475.method1926(var28, 65280);
                            this.field5475.method1926(var29, 65280);
                            this.field5475.method3201(-1581865480, 1.0F);
                            this.field5475.method3201(-1581865480, 1.0F);
                            this.field5475.method3201(-1581865480, (float) var33 * var10 + var30);
                            this.field5475.method3201(-1581865480, (float) var33 * var11 + var31);
                            this.field5475.method3201(-1581865480, (float) var33 * var12 + var32);
                            this.field5475.method1926(var26, 65280);
                            this.field5475.method1926(var27, 65280);
                            this.field5475.method1926(var28, 65280);
                            this.field5475.method1926(var29, 65280);
                            this.field5475.method3201(-1581865480, 0.0F);
                            this.field5475.method3201(-1581865480, 1.0F);
                            this.field5475.method3201(-1581865480, (float) var33 * var16 + var30);
                            this.field5475.method3201(-1581865480, (float) var33 * var17 + var31);
                            this.field5475.method3201(-1581865480, (float) var33 * var18 + var32);
                            this.field5475.method1926(var26, 65280);
                            this.field5475.method1926(var27, 65280);
                            this.field5475.method1926(var28, 65280);
                            this.field5475.method1926(var29, 65280);
                        }
                    }
                }
            }
        }
        if (this.field5475.field4534 != 0) {
            this.field5480.method846(this.field5475.field4543, (byte) 99, 24, this.field5475.field4534);
            arg0.method1329(null, this.field5476, this.field5477, this.field5478, 43);
            arg0.method1252(0, 7, (byte) -102, this.field5475.field4534 / 24);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BLrs;)V")
    private final void method2303(byte arg0, class166 arg1) {
        if (arg0 != -42) {
            return;
        }
        field5481++;
        arg1.method1263((byte) 104, true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class734.field10347 != arg1.field2795) {
            arg1.method328(class734.field10347);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lrs;IILmp;)V")
    public final void method2304(class166 arg0, int arg1, int arg2, class315 arg3) {
        field5482++;
        if (arg0.field2786 == null) {
            return;
        }
        if (arg1 < 0) {
            this.method2301(arg0, (byte) -96);
        } else {
            this.method2300(arg0, arg1, (byte) -4);
        }
        float var5 = arg0.field2786.field2988;
        float var6 = arg0.field2786.field2991;
        float var7 = arg0.field2786.field2965;
        float var8 = arg0.field2786.field2978;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            if (arg2 != 1744197452) {
                return;
            }
            class220 var12 = arg3.field4735.field3325;
            for (class220 var13 = var12.field3589; var13 != var12; var13 = var13.field3589) {
                class176 var14 = (class176) var13;
                int var15 = (int) ((float) (var14.field3016 >> 12) * var7 + (float) (var14.field3022 >> 12) * var6 + (float) (var14.field3015 >> 12) * var5 + var8);
                if (var10 > var15) {
                    var10 = var15;
                }
                this.field5484[var9++] = var15;
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class730.method4052(var16, -106) + 1 - this.field5479;
                var16 = (var16 >> var17) + 2;
            }
            class220 var18 = var12.field3589;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field5485 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field5486[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field5483[var24] = 0;
                }
                while (var12 != var18) {
                    class176 var25 = (class176) var18;
                    if (var22) {
                        var21 = var25.field3024;
                        var20 = var25.field3018;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field3018 != var20 || var25.field3024 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field5484[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field5486[var26] < 64) {
                            this.field5487[var26][this.field5486[var26]++] = var25;
                        } else {
                            label106: {
                                if (this.field5486[var26] == 64) {
                                    if (this.field5485 == 64) {
                                        break label106;
                                    }
                                    this.field5486[var26] += (this.field5485++) + 1;
                                }
                                this.field5488[this.field5486[var26] - 64 - 1][this.field5483[this.field5486[var26] - 1 - 64]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field3589;
                }
                if (var20 >= 0) {
                    arg0.method1327(-53, var20);
                } else {
                    arg0.method1327(arg2 ^ 0x67F6573C, -1);
                }
                if (var21 && class734.field10347 != arg0.field2795) {
                    arg0.method328(class734.field10347);
                } else if (arg0.field2795 != 1.0F) {
                    arg0.method328(1.0F);
                }
                this.method2302(arg0, 117, var16);
            }
        } catch (Exception var27) {
        }
        this.method2303((byte) -42, arg0);
    }
}
