import jaggl.OpenGL;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class391 {

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[F")
    private float[] field5360 = new float[16];

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Liw;")
    private class335 field5358 = new class335(786336);

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    private int field5364 = class750.method4165(255, 1600);

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "[I")
    private int[] field5368 = new int[8191];

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "[[Lln;")
    private class400[][] field5370 = new class400[64][768];

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "[I")
    private int[] field5369 = new int[64];

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "[I")
    private int[] field5373 = new int[1600];

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    private int field5372 = 0;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "[[Lln;")
    private class400[][] field5371 = new class400[1600][64];

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lfja;")
    public static class783 field5353 = new class783(116, 7);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lwfa;")
    private class212 field5362;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lnba;")
    private class316 field5365;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lnba;")
    private class316 field5366;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lnba;")
    private class316 field5367;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V", line = 10)
    public static final void method2367(int arg0, int arg1) {
        if (arg1 > -11) {
            method2367(8, 81);
        }
        field5357++;
        if (class111.field1911.field6720.method3404((byte) 62) == 0) {
            arg0 = -1;
        }
        if (class110.field1715 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class613 var2 = class345.field4639.method2649(arg0, (byte) -82);
            class49 var3 = var2.method3471(true);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class630.field8751.method4119(class558.field7896, new Point(var2.field8538, var2.field8537), (byte) -54, var3.method371(), var3.method377(), var3.method369());
                class110.field1715 = arg0;
            }
        }
        if (arg0 == -1 && class110.field1715 != -1) {
            class630.field8751.method4119(class558.field7896, new Point(), (byte) -122, -1, null, -1);
            class110.field1715 = -1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILmf;Lhk;I)V", line = 50)
    public final void method2368(int arg0, class442 arg1, class111 arg2, int arg3) {
        field5354++;
        if (arg2.field1963 == null) {
            return;
        }
        if (arg0 >= 0) {
            this.method2373(arg0, arg2, false);
        } else {
            this.method2371(arg2, arg3 ^ 0x264E);
        }
        float var5 = arg2.field1963.field9770;
        float var6 = arg2.field1963.field9762;
        float var7 = arg2.field1963.field9783;
        float var8 = arg2.field1963.field9765;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class525 var12 = arg1.field5985.field9507;
            class525 var13 = var12.field7133;
            if (arg3 != -30608) {
                return;
            }
            while (var12 != var13) {
                class400 var14 = (class400) var13;
                int var15 = (int) ((float) (var14.field5509 >> 12) * var7 + (float) (var14.field5516 >> 12) * var5 + (float) (var14.field5514 >> 12) * var6 + var8);
                this.field5368[var9++] = var15;
                if (var15 > var11) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
                var13 = var13.field7133;
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) > 1600) {
                var17 = class750.method4165(255, var16) + (1 - this.field5364);
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            int var18 = 0;
            class525 var19 = var12.field7133;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field5372 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field5373[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field5369[var24] = 0;
                }
                while (var12 != var19) {
                    class400 var25 = (class400) var19;
                    if (var22) {
                        var22 = false;
                        var21 = var25.field5519;
                        var20 = var25.field5511;
                    }
                    if (var18 > 0 && (var25.field5511 != var20 || var25.field5519 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field5368[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field5373[var26] < 64) {
                            this.field5371[var26][this.field5373[var26]++] = var25;
                        } else {
                            label98: {
                                if (this.field5373[var26] == 64) {
                                    if (this.field5372 == 64) {
                                        break label98;
                                    }
                                    this.field5373[var26] += this.field5372++ + 1;
                                }
                                class400[] var10000 = this.field5370[this.field5373[var26] - 64 - 1];
                                int var10002 = this.field5373[var26] - 65;
                                int var10004 = this.field5369[this.field5373[var26] - 65];
                                this.field5369[var10002] = this.field5369[this.field5373[var26] - 65] + 1;
                                var10000[var10004] = var25;
                            }
                        }
                    }
                    var19 = var19.field7133;
                }
                if (var20 >= 0) {
                    arg2.method1006(1, var20);
                } else {
                    arg2.method1006(1, -1);
                }
                if (var21 && class532.field7198 != arg2.field1971) {
                    arg2.method480(class532.field7198);
                } else if (arg2.field1971 != 1.0F) {
                    arg2.method480(1.0F);
                }
                this.method2374(arg2, var16, (byte) 77);
            }
        } catch (Exception var27) {
        }
        this.method2370(arg3 + 30616, arg2);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V", line = 224)
    public static void method2369(byte arg0) {
        if (arg0 > 91) {
            field5353 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILhk;)V", line = 235)
    private final void method2370(int arg0, class111 arg1) {
        if (arg0 != 8) {
            return;
        }
        field5359++;
        arg1.method936(true, arg0 ^ 0xFFFFFF88);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class532.field7198 != arg1.field1971) {
            arg1.method480(class532.field7198);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lhk;I)V", line = 252)
    private final void method2371(class111 arg0, int arg1) {
        field5363++;
        if (arg1 != -20930) {
            this.method2373(-14, null, true);
        }
        class532.field7198 = arg0.field1971;
        arg0.method1009(false);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method936(false, -128);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Lhk;I)V", line = 268)
    public final void method2372(class111 arg0, int arg1) {
        field5355++;
        if (arg1 == 8616) {
            this.field5362 = arg0.method962(24, true, null, 196584, 2834);
            this.field5365 = new class316(this.field5362, 5126, 2, 0);
            this.field5367 = new class316(this.field5362, 5126, 3, 8);
            this.field5366 = new class316(this.field5362, 5121, 4, 20);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILhk;Z)V", line = 294)
    private final void method2373(int arg0, class111 arg1, boolean arg2) {
        field5361++;
        class532.field7198 = arg1.field1971;
        arg1.method1014(126, (float) arg0);
        arg1.method985(-17);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method936(arg2, -128);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lhk;IB)V", line = 314)
    private final void method2374(class111 arg0, int arg1, byte arg2) {
        OpenGL.glGetFloatv(2982, this.field5360, 0);
        field5356++;
        float var4 = this.field5360[0];
        float var5 = this.field5360[4];
        float var6 = this.field5360[8];
        float var7 = this.field5360[1];
        float var8 = this.field5360[5];
        if (arg2 != 77) {
            return;
        }
        float var9 = this.field5360[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field5358.field1442 = 0;
        if (arg0.field2000) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field5373[var44] <= 64 ? this.field5373[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class400 var59 = this.field5371[var44][var46];
                        int var60 = var59.field5517;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field5516 >> 12);
                        float var66 = (float) (var59.field5514 >> 12);
                        float var67 = (float) (var59.field5509 >> 12);
                        int var68 = var59.field5518 >> 12;
                        this.field5358.method2098(0.0F, true);
                        this.field5358.method2098(0.0F, true);
                        this.field5358.method2098((float) (-var68) * var10 + var65, true);
                        this.field5358.method2098((float) (-var68) * var11 + var66, true);
                        this.field5358.method2098((float) (-var68) * var12 + var67, true);
                        this.field5358.method754(var61, 35);
                        this.field5358.method754(var62, 86);
                        this.field5358.method754(var63, 99);
                        this.field5358.method754(var64, 55);
                        this.field5358.method2098(1.0F, true);
                        this.field5358.method2098(0.0F, true);
                        this.field5358.method2098((float) var68 * var13 + var65, true);
                        this.field5358.method2098((float) var68 * var14 + var66, true);
                        this.field5358.method2098((float) var68 * var15 + var67, true);
                        this.field5358.method754(var61, 72);
                        this.field5358.method754(var62, 125);
                        this.field5358.method754(var63, arg2 + 18);
                        this.field5358.method754(var64, 23);
                        this.field5358.method2098(1.0F, true);
                        this.field5358.method2098(1.0F, true);
                        this.field5358.method2098((float) var68 * var10 + var65, true);
                        this.field5358.method2098((float) var68 * var11 + var66, true);
                        this.field5358.method2098((float) var68 * var12 + var67, true);
                        this.field5358.method754(var61, 118);
                        this.field5358.method754(var62, 36);
                        this.field5358.method754(var63, 24);
                        this.field5358.method754(var64, arg2 + 18);
                        this.field5358.method2098(0.0F, true);
                        this.field5358.method2098(1.0F, true);
                        this.field5358.method2098((float) var68 * var16 + var65, true);
                        this.field5358.method2098((float) var68 * var17 + var66, true);
                        this.field5358.method2098((float) var68 * var18 + var67, true);
                        this.field5358.method754(var61, 81);
                        this.field5358.method754(var62, 117);
                        this.field5358.method754(var63, 99);
                        this.field5358.method754(var64, 49);
                    }
                    if (this.field5373[var44] > 64) {
                        int var47 = this.field5373[var44] - 64 - 1;
                        for (int var48 = this.field5369[var47] - 1; var48 >= 0; var48--) {
                            class400 var49 = this.field5370[var47][var48];
                            int var50 = var49.field5517;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field5516 >> 12);
                            float var56 = (float) (var49.field5514 >> 12);
                            float var57 = (float) (var49.field5509 >> 12);
                            int var58 = var49.field5518 >> 12;
                            this.field5358.method2098(0.0F, true);
                            this.field5358.method2098(0.0F, true);
                            this.field5358.method2098((float) (-var58) * var10 + var55, true);
                            this.field5358.method2098((float) (-var58) * var11 + var56, true);
                            this.field5358.method2098((float) (-var58) * var12 + var57, true);
                            this.field5358.method754(var51, 24);
                            this.field5358.method754(var52, 33);
                            this.field5358.method754(var53, arg2 + 19);
                            this.field5358.method754(var54, 41);
                            this.field5358.method2098(1.0F, true);
                            this.field5358.method2098(0.0F, true);
                            this.field5358.method2098((float) var58 * var13 + var55, true);
                            this.field5358.method2098((float) var58 * var14 + var56, true);
                            this.field5358.method2098((float) var58 * var15 + var57, true);
                            this.field5358.method754(var51, 44);
                            this.field5358.method754(var52, 97);
                            this.field5358.method754(var53, 40);
                            this.field5358.method754(var54, 43);
                            this.field5358.method2098(1.0F, true);
                            this.field5358.method2098(1.0F, true);
                            this.field5358.method2098((float) var58 * var10 + var55, true);
                            this.field5358.method2098((float) var58 * var11 + var56, true);
                            this.field5358.method2098((float) var58 * var12 + var57, true);
                            this.field5358.method754(var51, 108);
                            this.field5358.method754(var52, 99);
                            this.field5358.method754(var53, 86);
                            this.field5358.method754(var54, 91);
                            this.field5358.method2098(0.0F, true);
                            this.field5358.method2098(1.0F, true);
                            this.field5358.method2098((float) var58 * var16 + var55, true);
                            this.field5358.method2098((float) var58 * var17 + var56, true);
                            this.field5358.method2098((float) var58 * var18 + var57, true);
                            this.field5358.method754(var51, 67);
                            this.field5358.method754(var52, 65);
                            this.field5358.method754(var53, 76);
                            this.field5358.method754(var54, 74);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field5373[var19] > 64 ? 64 : this.field5373[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class400 var34 = this.field5371[var19][var21];
                        int var35 = var34.field5517;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field5516 >> 12);
                        float var41 = (float) (var34.field5514 >> 12);
                        float var42 = (float) (var34.field5509 >> 12);
                        int var43 = var34.field5518 >> 12;
                        this.field5358.method2101(1836032144, 0.0F);
                        this.field5358.method2101(1836032144, 0.0F);
                        this.field5358.method2101(1836032144, (float) (-var43) * var10 + var40);
                        this.field5358.method2101(1836032144, (float) (-var43) * var11 + var41);
                        this.field5358.method2101(1836032144, (float) (-var43) * var12 + var42);
                        this.field5358.method754(var36, arg2 ^ 0x34);
                        this.field5358.method754(var37, 111);
                        this.field5358.method754(var38, 28);
                        this.field5358.method754(var39, 101);
                        this.field5358.method2101(1836032144, 1.0F);
                        this.field5358.method2101(1836032144, 0.0F);
                        this.field5358.method2101(arg2 + 1836032067, (float) var43 * var13 + var40);
                        this.field5358.method2101(1836032144, (float) var43 * var14 + var41);
                        this.field5358.method2101(1836032144, (float) var43 * var15 + var42);
                        this.field5358.method754(var36, 92);
                        this.field5358.method754(var37, 75);
                        this.field5358.method754(var38, arg2 ^ 0x1D);
                        this.field5358.method754(var39, 103);
                        this.field5358.method2101(arg2 ^ 0x6D6FA0DD, 1.0F);
                        this.field5358.method2101(arg2 + 1836032067, 1.0F);
                        this.field5358.method2101(1836032144, (float) var43 * var10 + var40);
                        this.field5358.method2101(arg2 + 1836032067, (float) var43 * var11 + var41);
                        this.field5358.method2101(1836032144, (float) var43 * var12 + var42);
                        this.field5358.method754(var36, 101);
                        this.field5358.method754(var37, arg2 - 8);
                        this.field5358.method754(var38, arg2 + 18);
                        this.field5358.method754(var39, arg2 + 3);
                        this.field5358.method2101(1836032144, 0.0F);
                        this.field5358.method2101(1836032144, 1.0F);
                        this.field5358.method2101(arg2 ^ 0x6D6FA0DD, (float) var43 * var16 + var40);
                        this.field5358.method2101(1836032144, (float) var43 * var17 + var41);
                        this.field5358.method2101(arg2 + 1836032067, (float) var43 * var18 + var42);
                        this.field5358.method754(var36, 35);
                        this.field5358.method754(var37, 113);
                        this.field5358.method754(var38, 124);
                        this.field5358.method754(var39, 100);
                    }
                    if (this.field5373[var19] > 64) {
                        int var22 = this.field5373[var19] - 64 - 1;
                        for (int var23 = this.field5369[var22] - 1; var23 >= 0; var23--) {
                            class400 var24 = this.field5370[var22][var23];
                            int var25 = var24.field5517;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field5516 >> 12);
                            float var31 = (float) (var24.field5514 >> 12);
                            float var32 = (float) (var24.field5509 >> 12);
                            int var33 = var24.field5518 >> 12;
                            this.field5358.method2101(1836032144, 0.0F);
                            this.field5358.method2101(1836032144, 0.0F);
                            this.field5358.method2101(1836032144, (float) (-var33) * var10 + var30);
                            this.field5358.method2101(arg2 ^ 0x6D6FA0DD, (float) (-var33) * var11 + var31);
                            this.field5358.method2101(1836032144, (float) (-var33) * var12 + var32);
                            this.field5358.method754(var26, arg2 ^ 0x79);
                            this.field5358.method754(var27, arg2 ^ 0xE);
                            this.field5358.method754(var28, 119);
                            this.field5358.method754(var29, arg2 - 18);
                            this.field5358.method2101(1836032144, 1.0F);
                            this.field5358.method2101(1836032144, 0.0F);
                            this.field5358.method2101(1836032144, (float) var33 * var13 + var30);
                            this.field5358.method2101(1836032144, (float) var33 * var14 + var31);
                            this.field5358.method2101(1836032144, (float) var33 * var15 + var32);
                            this.field5358.method754(var26, arg2 ^ 0x57);
                            this.field5358.method754(var27, 122);
                            this.field5358.method754(var28, 90);
                            this.field5358.method754(var29, 122);
                            this.field5358.method2101(1836032144, 1.0F);
                            this.field5358.method2101(1836032144, 1.0F);
                            this.field5358.method2101(arg2 + 1836032067, (float) var33 * var10 + var30);
                            this.field5358.method2101(1836032144, (float) var33 * var11 + var31);
                            this.field5358.method2101(arg2 ^ 0x6D6FA0DD, (float) var33 * var12 + var32);
                            this.field5358.method754(var26, 86);
                            this.field5358.method754(var27, 46);
                            this.field5358.method754(var28, arg2 - 54);
                            this.field5358.method754(var29, 123);
                            this.field5358.method2101(1836032144, 0.0F);
                            this.field5358.method2101(1836032144, 1.0F);
                            this.field5358.method2101(1836032144, (float) var33 * var16 + var30);
                            this.field5358.method2101(arg2 ^ 0x6D6FA0DD, (float) var33 * var17 + var31);
                            this.field5358.method2101(1836032144, (float) var33 * var18 + var32);
                            this.field5358.method754(var26, 84);
                            this.field5358.method754(var27, 44);
                            this.field5358.method754(var28, 98);
                            this.field5358.method754(var29, 51);
                        }
                    }
                }
            }
        }
        if (this.field5358.field1442 != 0) {
            this.field5362.method1493(this.field5358.field1413, 24, this.field5358.field1442, arg2 ^ 0xFFFFCCC1);
            arg0.method948(this.field5367, 8448, null, this.field5365, this.field5366);
            arg0.method942(7, this.field5358.field1442 / 24, 0, 127);
        }
    }
}
