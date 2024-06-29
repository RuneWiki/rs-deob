import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class463 {

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "[F")
    private float[] field6401 = new float[16];

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "Lvda;")
    private class183 field6396 = new class183(786336);

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    private int field6413 = class185.method1043(1600, (byte) 31);

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "[[Ltha;")
    private class295[][] field6414 = new class295[1600][64];

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "[I")
    private int[] field6417 = new int[1600];

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "[I")
    private int[] field6419 = new int[64];

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "[I")
    private int[] field6416 = new int[8191];

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "[[Ltha;")
    private class295[][] field6415 = new class295[64][768];

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    private int field6418 = 0;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Ljava/lang/String;")
    public static String field6399 = "";

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "J")
    public static long field6412;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "Lgk;")
    private class475 field6408;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "Lgk;")
    private class475 field6409;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "Lgk;")
    private class475 field6411;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "Lob;")
    private class738 field6407;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILac;B)V")
    private final void method2574(int arg0, class541 arg1, byte arg2) {
        field6402++;
        OpenGL.glGetFloatv(2982, this.field6401, 0);
        float var4 = this.field6401[0];
        float var5 = this.field6401[4];
        float var6 = this.field6401[8];
        float var7 = this.field6401[1];
        float var8 = this.field6401[5];
        float var9 = this.field6401[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        if (arg2 != 52) {
            return;
        }
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field6396.field8520 = 0;
        if (arg1.field7608) {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field6417[var19] <= 64 ? this.field6417[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class295 var34 = this.field6414[var19][var21];
                        int var35 = var34.field3966;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field3964 >> 12);
                        float var41 = (float) (var34.field3965 >> 12);
                        float var42 = (float) (var34.field3963 >> 12);
                        int var43 = var34.field3967 >> 12;
                        this.field6396.method1037((byte) -118, 0.0F);
                        this.field6396.method1037((byte) -123, 0.0F);
                        this.field6396.method1037((byte) -96, (float) (-var43) * var10 + var40);
                        this.field6396.method1037((byte) -1, (float) (-var43) * var11 + var41);
                        this.field6396.method1037((byte) -96, (float) (-var43) * var12 + var42);
                        this.field6396.method3393(var36, -115);
                        this.field6396.method3393(var37, -36);
                        this.field6396.method3393(var38, -90);
                        this.field6396.method3393(var39, 118);
                        this.field6396.method1037((byte) 81, 1.0F);
                        this.field6396.method1037((byte) -121, 0.0F);
                        this.field6396.method1037((byte) 73, (float) var43 * var13 + var40);
                        this.field6396.method1037((byte) 81, (float) var43 * var14 + var41);
                        this.field6396.method1037((byte) -102, (float) var43 * var15 + var42);
                        this.field6396.method3393(var36, 73);
                        this.field6396.method3393(var37, arg2 - 127);
                        this.field6396.method3393(var38, arg2 ^ 0xFFFFFF85);
                        this.field6396.method3393(var39, 106);
                        this.field6396.method1037((byte) -104, 1.0F);
                        this.field6396.method1037((byte) -98, 1.0F);
                        this.field6396.method1037((byte) 66, (float) var43 * var10 + var40);
                        this.field6396.method1037((byte) 45, (float) var43 * var11 + var41);
                        this.field6396.method1037((byte) 126, (float) var43 * var12 + var42);
                        this.field6396.method3393(var36, arg2 ^ 0xFFFFFFAD);
                        this.field6396.method3393(var37, -99);
                        this.field6396.method3393(var38, 103);
                        this.field6396.method3393(var39, -40);
                        this.field6396.method1037((byte) -111, 0.0F);
                        this.field6396.method1037((byte) -126, 1.0F);
                        this.field6396.method1037((byte) 88, (float) var43 * var16 + var40);
                        this.field6396.method1037((byte) 86, (float) var43 * var17 + var41);
                        this.field6396.method1037((byte) 103, (float) var43 * var18 + var42);
                        this.field6396.method3393(var36, -110);
                        this.field6396.method3393(var37, 50);
                        this.field6396.method3393(var38, 126);
                        this.field6396.method3393(var39, 124);
                    }
                    if (this.field6417[var19] > 64) {
                        int var22 = this.field6417[var19] - 65;
                        for (int var23 = this.field6419[var22] - 1; var23 >= 0; var23--) {
                            class295 var24 = this.field6415[var22][var23];
                            int var25 = var24.field3966;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field3964 >> 12);
                            float var31 = (float) (var24.field3965 >> 12);
                            float var32 = (float) (var24.field3963 >> 12);
                            int var33 = var24.field3967 >> 12;
                            this.field6396.method1037((byte) 95, 0.0F);
                            this.field6396.method1037((byte) 30, 0.0F);
                            this.field6396.method1037((byte) -113, (float) (-var33) * var10 + var30);
                            this.field6396.method1037((byte) 43, (float) (-var33) * var11 + var31);
                            this.field6396.method1037((byte) 32, (float) (-var33) * var12 + var32);
                            this.field6396.method3393(var26, -46);
                            this.field6396.method3393(var27, -59);
                            this.field6396.method3393(var28, arg2 ^ 0x9);
                            this.field6396.method3393(var29, 78);
                            this.field6396.method1037((byte) 44, 1.0F);
                            this.field6396.method1037((byte) -113, 0.0F);
                            this.field6396.method1037((byte) -125, (float) var33 * var13 + var30);
                            this.field6396.method1037((byte) 29, (float) var33 * var14 + var31);
                            this.field6396.method1037((byte) -100, (float) var33 * var15 + var32);
                            this.field6396.method3393(var26, 66);
                            this.field6396.method3393(var27, arg2 ^ 0xFFFFFFA7);
                            this.field6396.method3393(var28, -117);
                            this.field6396.method3393(var29, arg2 + 44);
                            this.field6396.method1037((byte) -117, 1.0F);
                            this.field6396.method1037((byte) 115, 1.0F);
                            this.field6396.method1037((byte) 9, (float) var33 * var10 + var30);
                            this.field6396.method1037((byte) -103, (float) var33 * var11 + var31);
                            this.field6396.method1037((byte) 57, (float) var33 * var12 + var32);
                            this.field6396.method3393(var26, 118);
                            this.field6396.method3393(var27, 90);
                            this.field6396.method3393(var28, -61);
                            this.field6396.method3393(var29, arg2 + 71);
                            this.field6396.method1037((byte) 30, 0.0F);
                            this.field6396.method1037((byte) -127, 1.0F);
                            this.field6396.method1037((byte) 51, (float) var33 * var16 + var30);
                            this.field6396.method1037((byte) 42, (float) var33 * var17 + var31);
                            this.field6396.method1037((byte) 80, (float) var33 * var18 + var32);
                            this.field6396.method3393(var26, 43);
                            this.field6396.method3393(var27, arg2 ^ 0xFFFFFFF7);
                            this.field6396.method3393(var28, 85);
                            this.field6396.method3393(var29, arg2 ^ 0xA);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field6417[var44] > 64 ? 64 : this.field6417[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class295 var59 = this.field6414[var44][var46];
                        int var60 = var59.field3966;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field3964 >> 12);
                        float var66 = (float) (var59.field3965 >> 12);
                        float var67 = (float) (var59.field3963 >> 12);
                        int var68 = var59.field3967 >> 12;
                        this.field6396.method1038((byte) -52, 0.0F);
                        this.field6396.method1038((byte) -52, 0.0F);
                        this.field6396.method1038((byte) -52, (float) (-var68) * var10 + var65);
                        this.field6396.method1038((byte) -52, (float) (-var68) * var11 + var66);
                        this.field6396.method1038((byte) -52, (float) (-var68) * var12 + var67);
                        this.field6396.method3393(var61, arg2 - 94);
                        this.field6396.method3393(var62, arg2 ^ 0x65);
                        this.field6396.method3393(var63, 120);
                        this.field6396.method3393(var64, -102);
                        this.field6396.method1038((byte) -52, 1.0F);
                        this.field6396.method1038((byte) -52, 0.0F);
                        this.field6396.method1038((byte) -52, (float) var68 * var13 + var65);
                        this.field6396.method1038((byte) -52, (float) var68 * var14 + var66);
                        this.field6396.method1038((byte) -52, (float) var68 * var15 + var67);
                        this.field6396.method3393(var61, arg2 ^ 0xFFFFFF90);
                        this.field6396.method3393(var62, arg2 ^ 0xFFFFFF83);
                        this.field6396.method3393(var63, arg2 - 164);
                        this.field6396.method3393(var64, -124);
                        this.field6396.method1038((byte) -52, 1.0F);
                        this.field6396.method1038((byte) -52, 1.0F);
                        this.field6396.method1038((byte) -52, (float) var68 * var10 + var65);
                        this.field6396.method1038((byte) -52, (float) var68 * var11 + var66);
                        this.field6396.method1038((byte) -52, (float) var68 * var12 + var67);
                        this.field6396.method3393(var61, arg2 ^ 0x4E);
                        this.field6396.method3393(var62, 64);
                        this.field6396.method3393(var63, 57);
                        this.field6396.method3393(var64, -41);
                        this.field6396.method1038((byte) -52, 0.0F);
                        this.field6396.method1038((byte) -52, 1.0F);
                        this.field6396.method1038((byte) -52, (float) var68 * var16 + var65);
                        this.field6396.method1038((byte) -52, (float) var68 * var17 + var66);
                        this.field6396.method1038((byte) -52, (float) var68 * var18 + var67);
                        this.field6396.method3393(var61, 121);
                        this.field6396.method3393(var62, arg2 - 115);
                        this.field6396.method3393(var63, -52);
                        this.field6396.method3393(var64, -35);
                    }
                    if (this.field6417[var44] > 64) {
                        int var47 = this.field6417[var44] - 1 - 64;
                        for (int var48 = this.field6419[var47] - 1; var48 >= 0; var48--) {
                            class295 var49 = this.field6415[var47][var48];
                            int var50 = var49.field3966;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field3964 >> 12);
                            float var56 = (float) (var49.field3965 >> 12);
                            float var57 = (float) (var49.field3963 >> 12);
                            int var58 = var49.field3967 >> 12;
                            this.field6396.method1038((byte) -52, 0.0F);
                            this.field6396.method1038((byte) -52, 0.0F);
                            this.field6396.method1038((byte) -52, (float) (-var58) * var10 + var55);
                            this.field6396.method1038((byte) -52, (float) (-var58) * var11 + var56);
                            this.field6396.method1038((byte) -52, (float) (-var58) * var12 + var57);
                            this.field6396.method3393(var51, 79);
                            this.field6396.method3393(var52, -56);
                            this.field6396.method3393(var53, -106);
                            this.field6396.method3393(var54, -118);
                            this.field6396.method1038((byte) -52, 1.0F);
                            this.field6396.method1038((byte) -52, 0.0F);
                            this.field6396.method1038((byte) -52, (float) var58 * var13 + var55);
                            this.field6396.method1038((byte) -52, (float) var58 * var14 + var56);
                            this.field6396.method1038((byte) -52, (float) var58 * var15 + var57);
                            this.field6396.method3393(var51, arg2 ^ 0x6F);
                            this.field6396.method3393(var52, -55);
                            this.field6396.method3393(var53, arg2 ^ 0x1A);
                            this.field6396.method3393(var54, -41);
                            this.field6396.method1038((byte) -52, 1.0F);
                            this.field6396.method1038((byte) -52, 1.0F);
                            this.field6396.method1038((byte) -52, (float) var58 * var10 + var55);
                            this.field6396.method1038((byte) -52, (float) var58 * var11 + var56);
                            this.field6396.method1038((byte) -52, (float) var58 * var12 + var57);
                            this.field6396.method3393(var51, 43);
                            this.field6396.method3393(var52, 49);
                            this.field6396.method3393(var53, -51);
                            this.field6396.method3393(var54, arg2 - 155);
                            this.field6396.method1038((byte) -52, 0.0F);
                            this.field6396.method1038((byte) -52, 1.0F);
                            this.field6396.method1038((byte) -52, (float) var58 * var16 + var55);
                            this.field6396.method1038((byte) -52, (float) var58 * var17 + var56);
                            this.field6396.method1038((byte) -52, (float) var58 * var18 + var57);
                            this.field6396.method3393(var51, -102);
                            this.field6396.method3393(var52, arg2 ^ 0xFFFFFFE4);
                            this.field6396.method3393(var53, arg2 - 136);
                            this.field6396.method3393(var54, 124);
                        }
                    }
                }
            }
        }
        if (this.field6396.field8520 != 0) {
            this.field6407.method689(this.field6396.field8520, 7896, this.field6396.field8529, 24);
            arg1.method3011(this.field6409, null, this.field6408, this.field6411, 0);
            arg1.method3053(7, this.field6396.field8520 / 24, false, 0);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Z")
    public static final boolean method2575(int arg0, int arg1, int arg2) {
        field6400++;
        int var3 = 46 % ((43 - arg0) / 32);
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lpf;IILac;)V")
    public final void method2576(class583 arg0, int arg1, int arg2, class541 arg3) {
        field6405++;
        if (arg3.field7559 == null) {
            return;
        }
        if (arg2 < 0) {
            this.method2578(arg3, 5228);
        } else {
            this.method2581(arg3, true, arg2);
        }
        float var5 = arg3.field7559.field3281;
        float var6 = arg3.field7559.field3257;
        float var7 = arg3.field7559.field3252;
        float var8 = arg3.field7559.field3259;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class329 var12 = arg0.field8165.field4247;
            if (arg1 > -40) {
                return;
            }
            for (class329 var13 = var12.field4446; var13 != var12; var13 = var13.field4446) {
                class295 var14 = (class295) var13;
                int var15 = (int) ((float) (var14.field3963 >> 12) * var7 + (float) (var14.field3965 >> 12) * var6 + (float) (var14.field3964 >> 12) * var5 + var8);
                this.field6416[var9++] = var15;
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = 1 - (this.field6413 - class185.method1043(var16, (byte) 31));
                var16 = (var16 >> var17) + 2;
            } else {
                var16 += 2;
                var17 = 0;
            }
            int var18 = 0;
            class329 var19 = var12.field4446;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field6418 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field6417[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field6419[var24] = 0;
                }
                while (var12 != var19) {
                    class295 var25 = (class295) var19;
                    if (var22) {
                        var20 = var25.field3968;
                        var21 = var25.field3962;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field3968 != var20 || var21 != var25.field3962)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field6416[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field6417[var26] >= 64) {
                            label106: {
                                if (this.field6417[var26] == 64) {
                                    if (this.field6418 == 64) {
                                        break label106;
                                    }
                                    this.field6417[var26] += (this.field6418++) + 1;
                                }
                                this.field6415[this.field6417[var26] - 65][this.field6419[this.field6417[var26] - 1 - 64]++] = var25;
                            }
                        } else {
                            this.field6414[var26][this.field6417[var26]++] = var25;
                        }
                    }
                    var19 = var19.field4446;
                }
                if (var20 < 0) {
                    arg3.method2977(-43, -1);
                } else {
                    arg3.method2977(-84, var20);
                }
                if (var21 && class235.field3093 != arg3.field7624) {
                    arg3.method434(class235.field3093);
                } else if (arg3.field7624 != 1.0F) {
                    arg3.method434(1.0F);
                }
                this.method2574(var16, arg3, (byte) 52);
            }
        } catch (Exception var27) {
        }
        this.method2577(arg3, -124);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lac;I)V")
    private final void method2577(class541 arg0, int arg1) {
        field6406++;
        arg0.method3018((byte) -127, true);
        OpenGL.glEnable(16384);
        if (arg1 >= -5) {
            field6412 = -102L;
        }
        OpenGL.glEnable(16385);
        if (class235.field3093 != arg0.field7624) {
            arg0.method434(class235.field3093);
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Lac;I)V")
    private final void method2578(class541 arg0, int arg1) {
        field6410++;
        class235.field3093 = arg0.field7624;
        arg0.method3004(19330);
        if (arg1 != 5228) {
            this.field6414 = null;
        }
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method3018((byte) -127, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Z")
    public static final boolean method2579(int arg0, int arg1) {
        if (arg0 != -4) {
            field6399 = null;
        }
        field6404++;
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLsba;)Lsba;")
    public static final class218 method2580(boolean arg0, class218 arg1) {
        field6397++;
        if (arg1.field2693 != -1) {
            return class357.method2056(arg1.field2693, -9820);
        } else if (arg0) {
            int var2 = arg1.field2708 >>> 16;
            class237 var3 = new class237(class520.field6994);
            for (class526 var4 = (class526) var3.method1432(0); var4 != null; var4 = (class526) var3.method1430(2)) {
                if (var4.field7062 == var2) {
                    return class357.method2056((int) var4.field556, -9820);
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lac;ZI)V")
    private final void method2581(class541 arg0, boolean arg1, int arg2) {
        class235.field3093 = arg0.field7624;
        field6403++;
        arg0.method3033((float) arg2, arg1);
        arg0.method3044((byte) -35);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method3018((byte) -125, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(Lac;I)V")
    public final void method2582(class541 arg0, int arg1) {
        field6398++;
        this.field6407 = arg0.method3021(arg1, true, 24, -51, null);
        this.field6408 = new class475(this.field6407, 5126, 2, 0);
        this.field6411 = new class475(this.field6407, 5126, 3, 8);
        this.field6409 = new class475(this.field6407, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static void method2583(byte arg0) {
        field6399 = null;
        if (arg0 < 25) {
            field6412 = 55L;
        }
    }
}
