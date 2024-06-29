import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class338 {

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[F")
    private float[] field5297 = new float[16];

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lct;")
    private class364 field5295 = new class364(786336);

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    private int field5309 = class54.method376(1600, 32238);

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "[[Lue;")
    private class164[][] field5315 = new class164[64][768];

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "[[Lue;")
    private class164[][] field5316 = new class164[1600][64];

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    private int field5314 = 0;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "[I")
    private int[] field5318 = new int[8191];

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "[I")
    private int[] field5319 = new int[64];

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "[I")
    private int[] field5317 = new int[1600];

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Lvv;")
    public static class313 field5300 = new class313(9, 6);

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "F")
    public static float field5301;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lcn;")
    public static class420 field5296;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lnn;")
    private class45 field5308;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lnn;")
    private class45 field5310;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lnn;")
    private class45 field5313;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "Lig;")
    private class92 field5312;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLih;Ld;)V", line = 4)
    public final void method2132(byte arg0, class214 arg1, class66 arg2) {
        if (arg0 != 43) {
            this.field5316 = null;
        }
        field5294++;
        if (arg1.field3685 == null) {
            return;
        }
        this.method2135(arg1, -2);
        float var4 = arg1.field3685.field4212;
        float var5 = arg1.field3685.field4234;
        float var6 = arg1.field3685.field4222;
        float var7 = arg1.field3685.field4213;
        try {
            if (arg2.field984) {
                int var8 = arg2.field980 - arg2.field981;
                int var9;
                if (var8 + 2 > 1600) {
                    var9 = class54.method376(var8, arg0 + 32195) + 1 - this.field5309;
                    var8 = (var8 >> var9) + 2;
                } else {
                    var8 += 2;
                    var9 = 0;
                }
                class519 var10 = arg2.field976.field6027;
                class519 var11 = var10.field7660;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field5314 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field5317[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field5319[var16] = 0;
                    }
                    while (var10 != var11) {
                        class164 var17 = (class164) var11;
                        if (var14) {
                            var12 = var17.field2601;
                            var14 = false;
                            var13 = var17.field2605;
                        } else if (var17.field2601 != var12 || var17.field2605 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field2595 >> 12) * var6 + (float) (var17.field2602 >> 12) * var5 + (float) (var17.field2599 >> 12) * var4 + var7) - arg2.field981 >> var9;
                        if (var18 < 1600) {
                            if (this.field5317[var18] < 64) {
                                this.field5316[var18][this.field5317[var18]++] = var17;
                            } else {
                                label195: {
                                    if (this.field5317[var18] == 64) {
                                        if (this.field5314 == 64) {
                                            break label195;
                                        }
                                        this.field5317[var18] += this.field5314++ + 1;
                                    }
                                    this.field5315[this.field5317[var18] - 64 - 1][this.field5319[this.field5317[var18] - 1 - 64]++] = var17;
                                }
                            }
                        }
                        var11 = var11.field7660;
                    }
                    if (var12 < 0) {
                        arg1.method1471(true, null);
                    } else {
                        arg1.method1471(true, arg1.field3591.method1125(var12, arg0 ^ 0x55));
                        arg1.method1410(arg1.field7179.method195(var12, (byte) -105).field5036, 7681);
                    }
                    if (var13 && class26.field414 != arg1.field3712) {
                        arg1.method910(class26.field414);
                    } else if (arg1.field3712 != 1.0F) {
                        arg1.method910(1.0F);
                    }
                    this.method2136(var8, arg1, 23431);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class519 var22 = arg2.field976.field6027;
                for (class519 var23 = var22.field7660; var23 != var22; var23 = var23.field7660) {
                    class164 var24 = (class164) var23;
                    int var25 = (int) ((float) (var24.field2595 >> 12) * var6 + (float) (var24.field2602 >> 12) * var5 + (float) (var24.field2599 >> 12) * var4 + var7);
                    this.field5318[var19++] = var25;
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    if (var25 < var20) {
                        var20 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = 1 - (this.field5309 - class54.method376(var26, 32238));
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                int var28 = 0;
                class519 var29 = var22.field7660;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field5314 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field5317[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field5319[var34] = 0;
                    }
                    while (var22 != var29) {
                        class164 var35 = (class164) var29;
                        if (var32) {
                            var32 = false;
                            var31 = var35.field2605;
                            var30 = var35.field2601;
                        }
                        if (var28 > 0 && (var35.field2601 != var30 || var35.field2605 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field5318[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field5317[var36] >= 64) {
                                label145: {
                                    if (this.field5317[var36] == 64) {
                                        if (this.field5314 == 64) {
                                            break label145;
                                        }
                                        this.field5317[var36] += (this.field5314++) + 1;
                                    }
                                    class164[] var10000 = this.field5315[this.field5317[var36] - 64 - 1];
                                    int var10002 = this.field5317[var36] - 65;
                                    int var10004 = this.field5319[this.field5317[var36] - 65];
                                    this.field5319[var10002] = this.field5319[this.field5317[var36] - 65] + 1;
                                    var10000[var10004] = var35;
                                }
                            } else {
                                this.field5316[var36][this.field5317[var36]++] = var35;
                            }
                        }
                        var29 = var29.field7660;
                    }
                    if (var30 >= 0) {
                        arg1.method1471(true, arg1.field3591.method1125(var30, arg0 + 84));
                        arg1.method1410(arg1.field7179.method195(var30, (byte) -105).field5036, 7681);
                    } else {
                        arg1.method1471(true, null);
                    }
                    if (var31 && class26.field414 != arg1.field3712) {
                        arg1.method910(class26.field414);
                    } else if (arg1.field3712 != 1.0F) {
                        arg1.method910(1.0F);
                    }
                    this.method2136(var26, arg1, 23431);
                }
            }
        } catch (Exception var37) {
        }
        this.method2138((byte) 73, arg1);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 290)
    public static void method2133(byte arg0) {
        field5300 = null;
        if (arg0 <= 75) {
            field5301 = -0.5577025F;
        }
        field5296 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 302)
    public static final void method2134(boolean arg0) {
        field5302++;
        class151.field2425 = 0;
        if (arg0) {
            method2134(true);
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class20.field226[var1] = null;
            class506.field7364[var1] = 1;
            class201.field3196[var1] = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lih;I)V", line = 326)
    private final void method2135(class214 arg0, int arg1) {
        field5298++;
        class26.field414 = arg0.field3712;
        arg0.method1445((byte) -81);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method1473(-113, false);
        arg0.method1463(arg1, (byte) 83);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILih;I)V", line = 342)
    private final void method2136(int arg0, class214 arg1, int arg2) {
        field5303++;
        OpenGL.glGetFloatv(2982, this.field5297, 0);
        float var4 = this.field5297[0];
        float var5 = this.field5297[4];
        float var6 = this.field5297[8];
        float var7 = this.field5297[1];
        float var8 = this.field5297[5];
        float var9 = this.field5297[9];
        if (arg2 != 23431) {
            field5301 = -1.4993628F;
        }
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field5295.field301 = 0;
        if (arg1.field3708) {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field5317[var19] <= 64 ? this.field5317[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class164 var34 = this.field5316[var19][var21];
                        int var35 = var34.field2600;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field2599 >> 12);
                        float var41 = (float) (var34.field2602 >> 12);
                        float var42 = (float) (var34.field2595 >> 12);
                        int var43 = var34.field2594 >> 12;
                        this.field5295.method2319(0.0F, 2177);
                        this.field5295.method2319(0.0F, 2177);
                        this.field5295.method2319((float) (-var43) * var10 + var40, arg2 + -21254);
                        this.field5295.method2319((float) (-var43) * var11 + var41, 2177);
                        this.field5295.method2319((float) (-var43) * var12 + var42, 2177);
                        this.field5295.method163(var36, (byte) 49);
                        this.field5295.method163(var37, (byte) 49);
                        this.field5295.method163(var38, (byte) 49);
                        this.field5295.method163(var39, (byte) 49);
                        this.field5295.method2319(1.0F, arg2 ^ 0x5306);
                        this.field5295.method2319(0.0F, 2177);
                        this.field5295.method2319((float) var43 * var13 + var40, 2177);
                        this.field5295.method2319((float) var43 * var14 + var41, 2177);
                        this.field5295.method2319((float) var43 * var15 + var42, 2177);
                        this.field5295.method163(var36, (byte) 49);
                        this.field5295.method163(var37, (byte) 49);
                        this.field5295.method163(var38, (byte) 49);
                        this.field5295.method163(var39, (byte) 49);
                        this.field5295.method2319(1.0F, 2177);
                        this.field5295.method2319(1.0F, arg2 - 21254);
                        this.field5295.method2319((float) var43 * var10 + var40, arg2 + -21254);
                        this.field5295.method2319((float) var43 * var11 + var41, 2177);
                        this.field5295.method2319((float) var43 * var12 + var42, 2177);
                        this.field5295.method163(var36, (byte) 49);
                        this.field5295.method163(var37, (byte) 49);
                        this.field5295.method163(var38, (byte) 49);
                        this.field5295.method163(var39, (byte) 49);
                        this.field5295.method2319(0.0F, 2177);
                        this.field5295.method2319(1.0F, 2177);
                        this.field5295.method2319((float) var43 * var16 + var40, arg2 + -21254);
                        this.field5295.method2319((float) var43 * var17 + var41, arg2 ^ 0x5306);
                        this.field5295.method2319((float) var43 * var18 + var42, 2177);
                        this.field5295.method163(var36, (byte) 49);
                        this.field5295.method163(var37, (byte) 49);
                        this.field5295.method163(var38, (byte) 49);
                        this.field5295.method163(var39, (byte) 49);
                    }
                    if (this.field5317[var19] > 64) {
                        int var22 = this.field5317[var19] - 64 - 1;
                        for (int var23 = this.field5319[var22] - 1; var23 >= 0; var23--) {
                            class164 var24 = this.field5315[var22][var23];
                            int var25 = var24.field2600;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field2599 >> 12);
                            float var31 = (float) (var24.field2602 >> 12);
                            float var32 = (float) (var24.field2595 >> 12);
                            int var33 = var24.field2594 >> 12;
                            this.field5295.method2319(0.0F, 2177);
                            this.field5295.method2319(0.0F, arg2 - 21254);
                            this.field5295.method2319((float) (-var33) * var10 + var30, 2177);
                            this.field5295.method2319((float) (-var33) * var11 + var31, 2177);
                            this.field5295.method2319((float) (-var33) * var12 + var32, 2177);
                            this.field5295.method163(var26, (byte) 49);
                            this.field5295.method163(var27, (byte) 49);
                            this.field5295.method163(var28, (byte) 49);
                            this.field5295.method163(var29, (byte) 49);
                            this.field5295.method2319(1.0F, 2177);
                            this.field5295.method2319(0.0F, arg2 ^ 0x5306);
                            this.field5295.method2319((float) var33 * var13 + var30, 2177);
                            this.field5295.method2319((float) var33 * var14 + var31, 2177);
                            this.field5295.method2319((float) var33 * var15 + var32, 2177);
                            this.field5295.method163(var26, (byte) 49);
                            this.field5295.method163(var27, (byte) 49);
                            this.field5295.method163(var28, (byte) 49);
                            this.field5295.method163(var29, (byte) 49);
                            this.field5295.method2319(1.0F, 2177);
                            this.field5295.method2319(1.0F, arg2 ^ 0x5306);
                            this.field5295.method2319((float) var33 * var10 + var30, 2177);
                            this.field5295.method2319((float) var33 * var11 + var31, 2177);
                            this.field5295.method2319((float) var33 * var12 + var32, 2177);
                            this.field5295.method163(var26, (byte) 49);
                            this.field5295.method163(var27, (byte) 49);
                            this.field5295.method163(var28, (byte) 49);
                            this.field5295.method163(var29, (byte) 49);
                            this.field5295.method2319(0.0F, 2177);
                            this.field5295.method2319(1.0F, 2177);
                            this.field5295.method2319((float) var33 * var16 + var30, arg2 + -21254);
                            this.field5295.method2319((float) var33 * var17 + var31, 2177);
                            this.field5295.method2319((float) var33 * var18 + var32, 2177);
                            this.field5295.method163(var26, (byte) 49);
                            this.field5295.method163(var27, (byte) 49);
                            this.field5295.method163(var28, (byte) 49);
                            this.field5295.method163(var29, (byte) 49);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field5317[var44] > 64 ? 64 : this.field5317[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class164 var59 = this.field5316[var44][var46];
                        int var60 = var59.field2600;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field2599 >> 12);
                        float var66 = (float) (var59.field2602 >> 12);
                        float var67 = (float) (var59.field2595 >> 12);
                        int var68 = var59.field2594 >> 12;
                        this.field5295.method2323(0.0F, (byte) -106);
                        this.field5295.method2323(0.0F, (byte) -72);
                        this.field5295.method2323((float) (-var68) * var10 + var65, (byte) -102);
                        this.field5295.method2323((float) (-var68) * var11 + var66, (byte) -83);
                        this.field5295.method2323((float) (-var68) * var12 + var67, (byte) -76);
                        this.field5295.method163(var61, (byte) 49);
                        this.field5295.method163(var62, (byte) 49);
                        this.field5295.method163(var63, (byte) 49);
                        this.field5295.method163(var64, (byte) 49);
                        this.field5295.method2323(1.0F, (byte) -113);
                        this.field5295.method2323(0.0F, (byte) -76);
                        this.field5295.method2323((float) var68 * var13 + var65, (byte) -120);
                        this.field5295.method2323((float) var68 * var14 + var66, (byte) -125);
                        this.field5295.method2323((float) var68 * var15 + var67, (byte) -116);
                        this.field5295.method163(var61, (byte) 49);
                        this.field5295.method163(var62, (byte) 49);
                        this.field5295.method163(var63, (byte) 49);
                        this.field5295.method163(var64, (byte) 49);
                        this.field5295.method2323(1.0F, (byte) -118);
                        this.field5295.method2323(1.0F, (byte) -75);
                        this.field5295.method2323((float) var68 * var10 + var65, (byte) -113);
                        this.field5295.method2323((float) var68 * var11 + var66, (byte) -90);
                        this.field5295.method2323((float) var68 * var12 + var67, (byte) -64);
                        this.field5295.method163(var61, (byte) 49);
                        this.field5295.method163(var62, (byte) 49);
                        this.field5295.method163(var63, (byte) 49);
                        this.field5295.method163(var64, (byte) 49);
                        this.field5295.method2323(0.0F, (byte) -91);
                        this.field5295.method2323(1.0F, (byte) -107);
                        this.field5295.method2323((float) var68 * var16 + var65, (byte) -106);
                        this.field5295.method2323((float) var68 * var17 + var66, (byte) -62);
                        this.field5295.method2323((float) var68 * var18 + var67, (byte) -112);
                        this.field5295.method163(var61, (byte) 49);
                        this.field5295.method163(var62, (byte) 49);
                        this.field5295.method163(var63, (byte) 49);
                        this.field5295.method163(var64, (byte) 49);
                    }
                    if (this.field5317[var44] > 64) {
                        int var47 = this.field5317[var44] - 64 - 1;
                        for (int var48 = this.field5319[var47] - 1; var48 >= 0; var48--) {
                            class164 var49 = this.field5315[var47][var48];
                            int var50 = var49.field2600;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field2599 >> 12);
                            float var56 = (float) (var49.field2602 >> 12);
                            float var57 = (float) (var49.field2595 >> 12);
                            int var58 = var49.field2594 >> 12;
                            this.field5295.method2323(0.0F, (byte) -71);
                            this.field5295.method2323(0.0F, (byte) -75);
                            this.field5295.method2323((float) (-var58) * var10 + var55, (byte) -101);
                            this.field5295.method2323((float) (-var58) * var11 + var56, (byte) -58);
                            this.field5295.method2323((float) (-var58) * var12 + var57, (byte) -57);
                            this.field5295.method163(var51, (byte) 49);
                            this.field5295.method163(var52, (byte) 49);
                            this.field5295.method163(var53, (byte) 49);
                            this.field5295.method163(var54, (byte) 49);
                            this.field5295.method2323(1.0F, (byte) -91);
                            this.field5295.method2323(0.0F, (byte) -118);
                            this.field5295.method2323((float) var58 * var13 + var55, (byte) -92);
                            this.field5295.method2323((float) var58 * var14 + var56, (byte) -69);
                            this.field5295.method2323((float) var58 * var15 + var57, (byte) -128);
                            this.field5295.method163(var51, (byte) 49);
                            this.field5295.method163(var52, (byte) 49);
                            this.field5295.method163(var53, (byte) 49);
                            this.field5295.method163(var54, (byte) 49);
                            this.field5295.method2323(1.0F, (byte) -61);
                            this.field5295.method2323(1.0F, (byte) -97);
                            this.field5295.method2323((float) var58 * var10 + var55, (byte) -86);
                            this.field5295.method2323((float) var58 * var11 + var56, (byte) -61);
                            this.field5295.method2323((float) var58 * var12 + var57, (byte) -62);
                            this.field5295.method163(var51, (byte) 49);
                            this.field5295.method163(var52, (byte) 49);
                            this.field5295.method163(var53, (byte) 49);
                            this.field5295.method163(var54, (byte) 49);
                            this.field5295.method2323(0.0F, (byte) -111);
                            this.field5295.method2323(1.0F, (byte) -59);
                            this.field5295.method2323((float) var58 * var16 + var55, (byte) -104);
                            this.field5295.method2323((float) var58 * var17 + var56, (byte) -96);
                            this.field5295.method2323((float) var58 * var18 + var57, (byte) -67);
                            this.field5295.method163(var51, (byte) 49);
                            this.field5295.method163(var52, (byte) 49);
                            this.field5295.method163(var53, (byte) 49);
                            this.field5295.method163(var54, (byte) 49);
                        }
                    }
                }
            }
        }
        if (this.field5295.field301 != 0) {
            this.field5312.method516((byte) 79, this.field5295.field302, this.field5295.field301, 24);
            arg1.method1406(32888, this.field5313, null, this.field5310, this.field5308);
            arg1.method1433(0, 7, this.field5295.field301 / 24, (byte) 32);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)[Lud;", line = 705)
    public static final class64[] method2137(byte arg0) {
        if (arg0 >= -4) {
            field5301 = 0.60967666F;
        }
        field5311++;
        return new class64[] { class23.field315, class23.field316, class23.field317, class23.field318, class23.field319, class23.field320, class23.field321, class23.field322, class23.field323, class23.field324, class23.field325, class23.field326 };
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLih;)V", line = 722)
    private final void method2138(byte arg0, class214 arg1) {
        arg1.method1473(-113, true);
        field5304++;
        OpenGL.glEnable(16384);
        if (arg0 != 73) {
            this.field5317 = null;
        }
        OpenGL.glEnable(16385);
        if (class26.field414 != arg1.field3712) {
            arg1.method910(class26.field414);
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V", line = 742)
    public static final void method2139(byte arg0) {
        field5305++;
        if (class337.field5291) {
            return;
        }
        class337.field5291 = true;
        class299.field4804 = true;
        if (class510.field7403.field5116) {
            class509.field7395 = ((int) class509.field7395 + 47 & 0xFFFFFFF0);
        } else {
            class380.field5886 += (12.0F - class380.field5886) / 2.0F;
        }
        if (arg0 >= -108) {
            method2143(79, 23, -11, (byte) 47, 20);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lih;Z)V", line = 766)
    public final void method2140(class214 arg0, boolean arg1) {
        if (arg1) {
            method2137((byte) -92);
        }
        field5299++;
        this.field5312 = arg0.method1442(true, 196584, null, (byte) 124, 24);
        this.field5313 = new class45(this.field5312, 5126, 2, 0);
        this.field5308 = new class45(this.field5312, 5126, 3, 8);
        this.field5310 = new class45(this.field5312, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I", line = 780)
    public static int method2141(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLou;)V", line = 787)
    public static final void method2142(byte arg0, class197 arg1) {
        field5306++;
        if (arg0 >= -98) {
            method2137((byte) -60);
        }
        boolean var2 = false;
        if (class504.field7348 == arg1.field3132 || arg1.field3136 == -1 || arg1.field3098 != 0) {
            var2 = true;
        } else {
            class145 var3 = class130.field2232.method634(-1271654143, arg1.field3136);
            if (var3.field2358 || (arg1.field3083 + 1) > var3.field2375[arg1.field3125]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field3132 - arg1.field3138;
            int var5 = class504.field7348 - arg1.field3138;
            int var6 = arg1.field3114 * 128 + arg1.method1143(0) * 64;
            int var7 = arg1.field3147 * 128 + (arg1.method1143(0) * 64);
            int var8 = arg1.field3082 * 128 + (arg1.method1143(0) * 64);
            int var9 = arg1.field3099 * 128 + (arg1.method1143(0) * 64);
            arg1.field4714 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field4716 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg1.field3155 = 0;
        if (arg1.field3120 == 0) {
            arg1.method1305(16383, false, 8192);
        }
        if (arg1.field3120 == 1) {
            arg1.method1305(16383, false, 12288);
        }
        if (arg1.field3120 == 2) {
            arg1.method1305(16383, false, 0);
        }
        if (arg1.field3120 == 3) {
            arg1.method1305(16383, false, 4096);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIBI)V", line = 842)
    public static final void method2143(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg0 >= arg4) {
            for (int var5 = arg4; var5 < arg0; var5++) {
                class209.field3294[var5][arg1] = arg2;
            }
        } else {
            for (int var6 = arg0; var6 < arg4; var6++) {
                class209.field3294[var6][arg1] = arg2;
            }
        }
        field5307++;
        if (arg3 > -50) {
            method2143(-65, -94, 80, (byte) 47, 102);
        }
    }
}
