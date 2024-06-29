import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class631 {

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "[F")
    private float[] field8686 = new float[16];

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "Lgh;")
    private class548 field8682 = new class548(786336);

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    private int field8688 = class149.method1172(1600, 124);

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "[I")
    private int[] field8694 = new int[8191];

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "[[Ljc;")
    private class441[][] field8693 = new class441[1600][64];

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "[I")
    private int[] field8695 = new int[1600];

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    private int field8696 = 0;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "[[Ljc;")
    private class441[][] field8692 = new class441[64][768];

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "[I")
    private int[] field8697 = new int[64];

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "[F")
    public static float[] field8677 = new float[16];

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Lmn;")
    public static class368 field8684 = new class368();

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "Lhca;")
    private class490 field8689;

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "Lnh;")
    private class744 field8687;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "Lnh;")
    private class744 field8690;

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "Lnh;")
    private class744 field8691;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lqo;II)V", line = 6)
    private final void method3602(class22 arg0, int arg1, int arg2) {
        field8681++;
        class612.field8368 = arg0.field590;
        if (arg2 != 24484) {
            this.method3608(null, -66, 67);
        }
        arg0.method304((byte) -119, (float) arg1);
        arg0.method236(arg2 - 24483);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method205(0, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lqo;B)V", line = 24)
    private final void method3603(class22 arg0, byte arg1) {
        arg0.method205(0, true);
        field8678++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (arg1 != -5) {
            field8677 = null;
        }
        if (class612.field8368 != arg0.field590) {
            arg0.method228(class612.field8368);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lqo;BILmda;)V", line = 44)
    public final void method3604(class22 arg0, byte arg1, int arg2, class266 arg3) {
        field8679++;
        if (arg0.field582 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method3602(arg0, arg2, 24484);
        } else {
            this.method3605(false, arg0);
        }
        float var5 = arg0.field582.field6855;
        float var6 = arg0.field582.field6853;
        float var7 = arg0.field582.field6883;
        float var8 = arg0.field582.field6850;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class409 var12 = arg3.field3774.field7287;
            for (class409 var13 = var12.field5961; var13 != var12; var13 = var13.field5961) {
                class441 var14 = (class441) var13;
                int var15 = (int) ((float) (var14.field6269 >> 12) * var7 + (float) (var14.field6276 >> 12) * var6 + (float) (var14.field6271 >> 12) * var5 + var8);
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
                this.field8694[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) > 1600) {
                var17 = class149.method1172(var16, -86) + 1 - this.field8688;
                var16 = (var16 >> var17) + 2;
            } else {
                var16 += 2;
                var17 = 0;
            }
            int var18 = 0;
            class409 var19 = var12.field5961;
            int var20 = -2;
            if (arg1 > -23) {
                field8684 = null;
            }
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field8696 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field8695[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field8697[var24] = 0;
                }
                while (var12 != var19) {
                    class441 var25 = (class441) var19;
                    if (var22) {
                        var21 = var25.field6274;
                        var20 = var25.field6272;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field6272 != var20 || var25.field6274 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field8694[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field8695[var26] < 64) {
                            this.field8693[var26][this.field8695[var26]++] = var25;
                        } else {
                            label105: {
                                if (this.field8695[var26] == 64) {
                                    if (this.field8696 == 64) {
                                        break label105;
                                    }
                                    this.field8695[var26] += this.field8696++ + 1;
                                }
                                this.field8692[this.field8695[var26] - 64 - 1][this.field8697[this.field8695[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var19 = var19.field5961;
                }
                if (var20 < 0) {
                    arg0.method229(-1, -124);
                } else {
                    arg0.method229(var20, -100);
                }
                if (var21 && class612.field8368 != arg0.field590) {
                    arg0.method228(class612.field8368);
                } else if (arg0.field590 != 1.0F) {
                    arg0.method228(1.0F);
                }
                this.method3608(arg0, var16, 785980556);
            }
        } catch (Exception var27) {
        }
        this.method3603(arg0, (byte) -5);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLqo;)V", line = 208)
    private final void method3605(boolean arg0, class22 arg1) {
        class612.field8368 = arg1.field590;
        field8683++;
        arg1.method293((byte) -62);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method205(0, arg0);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 222)
    public static void method3606(int arg0) {
        field8684 = null;
        field8677 = null;
        if (arg0 != 1489574736) {
            field8684 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILqo;)V", line = 239)
    public final void method3607(int arg0, class22 arg1) {
        if (arg0 != 643267468) {
            return;
        }
        field8685++;
        this.field8689 = arg1.method178(2, true, 24, null, 196584);
        this.field8687 = new class744(this.field8689, 5126, 2, 0);
        this.field8691 = new class744(this.field8689, 5126, 3, 8);
        this.field8690 = new class744(this.field8689, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Lqo;II)V", line = 264)
    private final void method3608(class22 arg0, int arg1, int arg2) {
        field8680++;
        if (arg2 != 785980556) {
            return;
        }
        OpenGL.glGetFloatv(2982, this.field8686, 0);
        float var4 = this.field8686[0];
        float var5 = this.field8686[4];
        float var6 = this.field8686[8];
        float var7 = this.field8686[1];
        float var8 = this.field8686[5];
        float var9 = this.field8686[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field8682.field3109 = 0;
        float var18 = var9 - var6;
        if (arg0.field597) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field8695[var44] > 64 ? 64 : this.field8695[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class441 var59 = this.field8693[var44][var46];
                        int var60 = var59.field6270;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field6271 >> 12);
                        float var66 = (float) (var59.field6276 >> 12);
                        float var67 = (float) (var59.field6269 >> 12);
                        int var68 = var59.field6273 >> 12;
                        this.field8682.method3157(0.0F, (byte) -88);
                        this.field8682.method3157(0.0F, (byte) -96);
                        this.field8682.method3157((float) (-var68) * var10 + var65, (byte) -96);
                        this.field8682.method3157((float) (-var68) * var11 + var66, (byte) -84);
                        this.field8682.method3157((float) (-var68) * var12 + var67, (byte) -119);
                        this.field8682.method1526(false, var61);
                        this.field8682.method1526(false, var62);
                        this.field8682.method1526(false, var63);
                        this.field8682.method1526(false, var64);
                        this.field8682.method3157(1.0F, (byte) -114);
                        this.field8682.method3157(0.0F, (byte) -116);
                        this.field8682.method3157((float) var68 * var13 + var65, (byte) -121);
                        this.field8682.method3157((float) var68 * var14 + var66, (byte) -95);
                        this.field8682.method3157((float) var68 * var15 + var67, (byte) -78);
                        this.field8682.method1526(false, var61);
                        this.field8682.method1526(false, var62);
                        this.field8682.method1526(false, var63);
                        this.field8682.method1526(false, var64);
                        this.field8682.method3157(1.0F, (byte) -128);
                        this.field8682.method3157(1.0F, (byte) -91);
                        this.field8682.method3157((float) var68 * var10 + var65, (byte) -101);
                        this.field8682.method3157((float) var68 * var11 + var66, (byte) -128);
                        this.field8682.method3157((float) var68 * var12 + var67, (byte) -123);
                        this.field8682.method1526(false, var61);
                        this.field8682.method1526(false, var62);
                        this.field8682.method1526(false, var63);
                        this.field8682.method1526(false, var64);
                        this.field8682.method3157(0.0F, (byte) -94);
                        this.field8682.method3157(1.0F, (byte) -101);
                        this.field8682.method3157((float) var68 * var16 + var65, (byte) -84);
                        this.field8682.method3157((float) var68 * var17 + var66, (byte) -87);
                        this.field8682.method3157((float) var68 * var18 + var67, (byte) -120);
                        this.field8682.method1526(false, var61);
                        this.field8682.method1526(false, var62);
                        this.field8682.method1526(false, var63);
                        this.field8682.method1526(false, var64);
                    }
                    if (this.field8695[var44] > 64) {
                        int var47 = this.field8695[var44] - 64 - 1;
                        for (int var48 = this.field8697[var47] - 1; var48 >= 0; var48--) {
                            class441 var49 = this.field8692[var47][var48];
                            int var50 = var49.field6270;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field6271 >> 12);
                            float var56 = (float) (var49.field6276 >> 12);
                            float var57 = (float) (var49.field6269 >> 12);
                            int var58 = var49.field6273 >> 12;
                            this.field8682.method3157(0.0F, (byte) -77);
                            this.field8682.method3157(0.0F, (byte) -103);
                            this.field8682.method3157((float) (-var58) * var10 + var55, (byte) -79);
                            this.field8682.method3157((float) (-var58) * var11 + var56, (byte) -102);
                            this.field8682.method3157((float) (-var58) * var12 + var57, (byte) -79);
                            this.field8682.method1526(false, var51);
                            this.field8682.method1526(false, var52);
                            this.field8682.method1526(false, var53);
                            this.field8682.method1526(false, var54);
                            this.field8682.method3157(1.0F, (byte) -119);
                            this.field8682.method3157(0.0F, (byte) -118);
                            this.field8682.method3157((float) var58 * var13 + var55, (byte) -126);
                            this.field8682.method3157((float) var58 * var14 + var56, (byte) -103);
                            this.field8682.method3157((float) var58 * var15 + var57, (byte) -94);
                            this.field8682.method1526(false, var51);
                            this.field8682.method1526(false, var52);
                            this.field8682.method1526(false, var53);
                            this.field8682.method1526(false, var54);
                            this.field8682.method3157(1.0F, (byte) -128);
                            this.field8682.method3157(1.0F, (byte) -127);
                            this.field8682.method3157((float) var58 * var10 + var55, (byte) -125);
                            this.field8682.method3157((float) var58 * var11 + var56, (byte) -98);
                            this.field8682.method3157((float) var58 * var12 + var57, (byte) -119);
                            this.field8682.method1526(false, var51);
                            this.field8682.method1526(false, var52);
                            this.field8682.method1526(false, var53);
                            this.field8682.method1526(false, var54);
                            this.field8682.method3157(0.0F, (byte) -116);
                            this.field8682.method3157(1.0F, (byte) -116);
                            this.field8682.method3157((float) var58 * var16 + var55, (byte) -124);
                            this.field8682.method3157((float) var58 * var17 + var56, (byte) -83);
                            this.field8682.method3157((float) var58 * var18 + var57, (byte) -80);
                            this.field8682.method1526(false, var51);
                            this.field8682.method1526(false, var52);
                            this.field8682.method1526(false, var53);
                            this.field8682.method1526(false, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field8695[var19] <= 64 ? this.field8695[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class441 var34 = this.field8693[var19][var21];
                        int var35 = var34.field6270;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field6271 >> 12);
                        float var41 = (float) (var34.field6276 >> 12);
                        float var42 = (float) (var34.field6269 >> 12);
                        int var43 = var34.field6273 >> 12;
                        this.field8682.method3156(18291, 0.0F);
                        this.field8682.method3156(18291, 0.0F);
                        this.field8682.method3156(18291, (float) (-var43) * var10 + var40);
                        this.field8682.method3156(18291, (float) (-var43) * var11 + var41);
                        this.field8682.method3156(18291, (float) (-var43) * var12 + var42);
                        this.field8682.method1526(false, var36);
                        this.field8682.method1526(false, var37);
                        this.field8682.method1526(false, var38);
                        this.field8682.method1526(false, var39);
                        this.field8682.method3156(18291, 1.0F);
                        this.field8682.method3156(18291, 0.0F);
                        this.field8682.method3156(18291, (float) var43 * var13 + var40);
                        this.field8682.method3156(18291, (float) var43 * var14 + var41);
                        this.field8682.method3156(18291, (float) var43 * var15 + var42);
                        this.field8682.method1526(false, var36);
                        this.field8682.method1526(false, var37);
                        this.field8682.method1526(false, var38);
                        this.field8682.method1526(false, var39);
                        this.field8682.method3156(18291, 1.0F);
                        this.field8682.method3156(arg2 - 785962265, 1.0F);
                        this.field8682.method3156(18291, (float) var43 * var10 + var40);
                        this.field8682.method3156(18291, (float) var43 * var11 + var41);
                        this.field8682.method3156(arg2 ^ 0x2ED95BFF, (float) var43 * var12 + var42);
                        this.field8682.method1526(false, var36);
                        this.field8682.method1526(false, var37);
                        this.field8682.method1526(false, var38);
                        this.field8682.method1526(false, var39);
                        this.field8682.method3156(18291, 0.0F);
                        this.field8682.method3156(arg2 - 785962265, 1.0F);
                        this.field8682.method3156(18291, (float) var43 * var16 + var40);
                        this.field8682.method3156(18291, (float) var43 * var17 + var41);
                        this.field8682.method3156(arg2 ^ 0x2ED95BFF, (float) var43 * var18 + var42);
                        this.field8682.method1526(false, var36);
                        this.field8682.method1526(false, var37);
                        this.field8682.method1526(false, var38);
                        this.field8682.method1526(false, var39);
                    }
                    if (this.field8695[var19] > 64) {
                        int var22 = this.field8695[var19] - 65;
                        for (int var23 = this.field8697[var22] - 1; var23 >= 0; var23--) {
                            class441 var24 = this.field8692[var22][var23];
                            int var25 = var24.field6270;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field6271 >> 12);
                            float var31 = (float) (var24.field6276 >> 12);
                            float var32 = (float) (var24.field6269 >> 12);
                            int var33 = var24.field6273 >> 12;
                            this.field8682.method3156(arg2 - 785962265, 0.0F);
                            this.field8682.method3156(18291, 0.0F);
                            this.field8682.method3156(arg2 ^ 0x2ED95BFF, (float) (-var33) * var10 + var30);
                            this.field8682.method3156(18291, (float) (-var33) * var11 + var31);
                            this.field8682.method3156(18291, (float) (-var33) * var12 + var32);
                            this.field8682.method1526(false, var26);
                            this.field8682.method1526(false, var27);
                            this.field8682.method1526(false, var28);
                            this.field8682.method1526(false, var29);
                            this.field8682.method3156(18291, 1.0F);
                            this.field8682.method3156(18291, 0.0F);
                            this.field8682.method3156(arg2 ^ 0x2ED95BFF, (float) var33 * var13 + var30);
                            this.field8682.method3156(18291, (float) var33 * var14 + var31);
                            this.field8682.method3156(18291, (float) var33 * var15 + var32);
                            this.field8682.method1526(false, var26);
                            this.field8682.method1526(false, var27);
                            this.field8682.method1526(false, var28);
                            this.field8682.method1526(false, var29);
                            this.field8682.method3156(18291, 1.0F);
                            this.field8682.method3156(arg2 ^ 0x2ED95BFF, 1.0F);
                            this.field8682.method3156(arg2 ^ 0x2ED95BFF, (float) var33 * var10 + var30);
                            this.field8682.method3156(18291, (float) var33 * var11 + var31);
                            this.field8682.method3156(18291, (float) var33 * var12 + var32);
                            this.field8682.method1526(false, var26);
                            this.field8682.method1526(false, var27);
                            this.field8682.method1526(false, var28);
                            this.field8682.method1526(false, var29);
                            this.field8682.method3156(arg2 ^ 0x2ED95BFF, 0.0F);
                            this.field8682.method3156(18291, 1.0F);
                            this.field8682.method3156(arg2 - 785962265, (float) var33 * var16 + var30);
                            this.field8682.method3156(18291, (float) var33 * var17 + var31);
                            this.field8682.method3156(18291, (float) var33 * var18 + var32);
                            this.field8682.method1526(false, var26);
                            this.field8682.method1526(false, var27);
                            this.field8682.method1526(false, var28);
                            this.field8682.method1526(false, var29);
                        }
                    }
                }
            }
        }
        if (this.field8682.field3109 != 0) {
            this.field8689.method960(24, this.field8682.field3109, this.field8682.field3066, -9894);
            arg0.method317(this.field8691, this.field8690, arg2 - 786006967, this.field8687, null);
            arg0.method225(this.field8682.field3109 / 24, 7, 0, 120);
        }
    }
}
