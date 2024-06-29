import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class496 {

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "[F")
    private float[] field6206 = new float[16];

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lgm;")
    private class113 field6196 = new class113(786336);

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    private int field6210 = class505.method2756(1600, -65537);

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    private int field6212 = 0;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "[[Lfm;")
    private class688[][] field6214 = new class688[1600][64];

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "[I")
    private int[] field6215 = new int[8191];

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "[[Lfm;")
    private class688[][] field6213 = new class688[64][768];

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "[I")
    private int[] field6216 = new int[1600];

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "[I")
    private int[] field6217 = new int[64];

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Ldr;")
    public static class675 field6200 = new class675(10, 12);

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "Lce;")
    private class288 field6207;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "Lce;")
    private class288 field6208;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "Lce;")
    private class288 field6211;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "Lad;")
    private class393 field6209;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "Lek;")
    public static class474 field6205;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 3)
    public static final void method2701(byte arg0, String arg1, boolean arg2) {
        field6201++;
        if (arg1 == null) {
            return;
        }
        if (class189.field2253 >= 100) {
            class252.method1521(4, class671.field9153.method3726((byte) 91, class71.field912), true);
            return;
        }
        String var3 = class279.method1680(-2415, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class189.field2253; var4++) {
            String var9 = class279.method1680(-2415, class594.field7963[var4]);
            if (var9 != null && var9.equals(var3)) {
                class252.method1521(4, arg1 + class671.field9154.method3726((byte) 105, class71.field912), true);
                return;
            }
            if (class599.field8033[var4] != null) {
                String var10 = class279.method1680(-2415, class599.field8033[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class252.method1521(4, arg1 + class671.field9154.method3726((byte) 79, class71.field912), true);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class284.field3600; var5++) {
            String var7 = class279.method1680(-2415, class136.field1659[var5]);
            if (var7 != null && var7.equals(var3)) {
                class252.method1521(4, class671.field9159.method3726((byte) 114, class71.field912) + arg1 + class671.field9160.method3726((byte) 52, class71.field912), true);
                return;
            }
            if (class392.field5015[var5] != null) {
                String var8 = class279.method1680(-2415, class392.field5015[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class252.method1521(4, class671.field9159.method3726((byte) 47, class71.field912) + arg1 + class671.field9160.method3726((byte) 34, class71.field912), true);
                    return;
                }
            }
        }
        if (arg0 != -49) {
            field6200 = null;
        }
        if (class279.method1680(-2415, class67.field815.field4673).equals(var3)) {
            class252.method1521(4, class671.field9156.method3726((byte) 102, class71.field912), true);
            return;
        }
        class201.field2336++;
        class124 var6 = class336.method1924(class158.field1859, class636.field8620, (byte) -37);
        var6.field1516.method3090(class680.method3757((byte) 60, arg1) + 1, 3);
        var6.field1516.method3050(false, arg1);
        var6.field1516.method3090(arg2 ? 1 : 0, arg0 ^ 0xFFFFFFCC);
        class197.method1156((byte) 110, var6);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILjaa;)V", line = 104)
    private final void method2702(int arg0, class576 arg1) {
        arg1.method3174(true, -32);
        field6199++;
        if (arg0 != 319) {
            this.field6196 = null;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class20.field214 != arg1.field7644) {
            arg1.method449(class20.field214);
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(ILjaa;)V", line = 121)
    public final void method2703(int arg0, class576 arg1) {
        this.field6209 = arg1.method3136(0, null, 196584, 24, true);
        field6204++;
        this.field6208 = new class288(this.field6209, 5126, 2, 0);
        this.field6211 = new class288(this.field6209, 5126, 3, 8);
        this.field6207 = new class288(this.field6209, 5121, 4, 20);
        if (arg0 != 7453) {
            this.field6207 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljaa;I)V", line = 137)
    private final void method2704(class576 arg0, int arg1) {
        class20.field214 = arg0.field7644;
        field6203++;
        arg0.method3122(arg1 + 50);
        OpenGL.glDisable(16384);
        if (arg1 == 64) {
            OpenGL.glDisable(16385);
            arg0.method3174(false, -32);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IC)Z", line = 157)
    public static final boolean method2705(int arg0, char arg1) {
        if (arg0 == -1) {
            field6198++;
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 176)
    public static void method2706(byte arg0) {
        field6205 = null;
        field6200 = null;
        if (arg0 != 65) {
            field6205 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljaa;BLig;)V", line = 187)
    public final void method2707(class576 arg0, byte arg1, class228 arg2) {
        field6197++;
        if (arg0.field7694 == null || arg1 != -56) {
            return;
        }
        this.method2704(arg0, 64);
        float var4 = arg0.field7694.field961;
        float var5 = arg0.field7694.field958;
        float var6 = arg0.field7694.field968;
        float var7 = arg0.field7694.field957;
        try {
            if (arg2.field2945) {
                int var8 = arg2.field2946 - arg2.field2947;
                int var9;
                if ((var8 + 2) <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = class505.method2756(var8, -65537) + 1 - this.field6210;
                    var8 = (var8 >> var9) + 2;
                }
                class634 var10 = arg2.field2940.field6862;
                class634 var11 = var10.field8593;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field6212 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field6216[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field6217[var16] = 0;
                    }
                    while (var10 != var11) {
                        class688 var17 = (class688) var11;
                        if (var14) {
                            var14 = false;
                            var13 = var17.field9481;
                            var12 = var17.field9483;
                        } else if (var17.field9483 != var12 || var17.field9481 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field9475 >> 12) * var6 + (float) (var17.field9480 >> 12) * var5 + (float) (var17.field9471 >> 12) * var4 + var7) - arg2.field2947 >> var9;
                        if (var18 < 1600) {
                            if (this.field6216[var18] >= 64) {
                                label195: {
                                    if (this.field6216[var18] == 64) {
                                        if (this.field6212 == 64) {
                                            break label195;
                                        }
                                        this.field6216[var18] += this.field6212++ + 1;
                                    }
                                    class688[] var10000 = this.field6213[this.field6216[var18] - 64 - 1];
                                    int var10002 = this.field6216[var18] - 65;
                                    int var10004 = this.field6217[this.field6216[var18] - 65];
                                    this.field6217[var10002] = this.field6217[this.field6216[var18] - 65] + 1;
                                    var10000[var10004] = var17;
                                }
                            } else {
                                this.field6214[var18][this.field6216[var18]++] = var17;
                            }
                        }
                        var11 = var11.field8593;
                    }
                    if (var12 >= 0) {
                        arg0.method3171(103, var12);
                    } else {
                        arg0.method3171(108, -1);
                    }
                    if (var13 && class20.field214 != arg0.field7644) {
                        arg0.method449(class20.field214);
                    } else if (arg0.field7644 != 1.0F) {
                        arg0.method449(1.0F);
                    }
                    this.method2708(arg0, -6330, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class634 var22 = arg2.field2940.field6862;
                for (class634 var23 = var22.field8593; var23 != var22; var23 = var23.field8593) {
                    class688 var24 = (class688) var23;
                    int var25 = (int) ((float) (var24.field9475 >> 12) * var6 + (float) (var24.field9480 >> 12) * var5 + (float) (var24.field9471 >> 12) * var4 + var7);
                    this.field6215[var19++] = var25;
                    if (var20 > var25) {
                        var20 = var25;
                    }
                    if (var21 < var25) {
                        var21 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class505.method2756(var26, -65537) + 1 - this.field6210;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                class634 var28 = var22.field8593;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field6212 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field6216[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field6217[var34] = 0;
                    }
                    while (var22 != var28) {
                        class688 var35 = (class688) var28;
                        if (var32) {
                            var31 = var35.field9481;
                            var32 = false;
                            var30 = var35.field9483;
                        }
                        if (var29 > 0 && (var35.field9483 != var30 || var31 != var35.field9481)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field6215[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field6216[var36] < 64) {
                                this.field6214[var36][this.field6216[var36]++] = var35;
                            } else {
                                label145: {
                                    if (this.field6216[var36] == 64) {
                                        if (this.field6212 == 64) {
                                            break label145;
                                        }
                                        this.field6216[var36] += this.field6212++ + 1;
                                    }
                                    this.field6213[this.field6216[var36] - 1 - 64][this.field6217[this.field6216[var36] - 1 - 64]++] = var35;
                                }
                            }
                        }
                        var28 = var28.field8593;
                    }
                    if (var30 >= 0) {
                        arg0.method3171(99, var30);
                    } else {
                        arg0.method3171(108, -1);
                    }
                    if (var31 && class20.field214 != arg0.field7644) {
                        arg0.method449(class20.field214);
                    } else if (arg0.field7644 != 1.0F) {
                        arg0.method449(1.0F);
                    }
                    this.method2708(arg0, -6330, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method2702(319, arg0);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljaa;II)V", line = 469)
    private final void method2708(class576 arg0, int arg1, int arg2) {
        field6202++;
        OpenGL.glGetFloatv(2982, this.field6206, 0);
        float var4 = this.field6206[0];
        float var5 = this.field6206[4];
        float var6 = this.field6206[8];
        float var7 = this.field6206[1];
        float var8 = this.field6206[5];
        float var9 = this.field6206[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        if (arg1 != -6330) {
            this.field6212 = 101;
        }
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field6196.field7313 = 0;
        float var18 = var9 - var6;
        if (arg0.field7643) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field6216[var44] <= 64 ? this.field6216[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class688 var59 = this.field6214[var44][var46];
                        int var60 = var59.field9476;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field9471 >> 12);
                        float var66 = (float) (var59.field9480 >> 12);
                        float var67 = (float) (var59.field9475 >> 12);
                        int var68 = var59.field9469 >> 12;
                        this.field6196.method784(-1585528400, 0.0F);
                        this.field6196.method784(arg1 ^ 0x5E8126F6, 0.0F);
                        this.field6196.method784(arg1 ^ 0x5E8126F6, (float) (-var68) * var10 + var65);
                        this.field6196.method784(-1585528400, (float) (-var68) * var11 + var66);
                        this.field6196.method784(-1585528400, (float) (-var68) * var12 + var67);
                        this.field6196.method3090(var61, 3);
                        this.field6196.method3090(var62, arg1 ^ 0xFFFFE745);
                        this.field6196.method3090(var63, 3);
                        this.field6196.method3090(var64, 3);
                        this.field6196.method784(arg1 - 1585522070, 1.0F);
                        this.field6196.method784(-1585528400, 0.0F);
                        this.field6196.method784(arg1 ^ 0x5E8126F6, (float) var68 * var13 + var65);
                        this.field6196.method784(-1585528400, (float) var68 * var14 + var66);
                        this.field6196.method784(-1585528400, (float) var68 * var15 + var67);
                        this.field6196.method3090(var61, arg1 + 6333);
                        this.field6196.method3090(var62, 3);
                        this.field6196.method3090(var63, 3);
                        this.field6196.method3090(var64, 3);
                        this.field6196.method784(-1585528400, 1.0F);
                        this.field6196.method784(-1585528400, 1.0F);
                        this.field6196.method784(-1585528400, (float) var68 * var10 + var65);
                        this.field6196.method784(-1585528400, (float) var68 * var11 + var66);
                        this.field6196.method784(-1585528400, (float) var68 * var12 + var67);
                        this.field6196.method3090(var61, 3);
                        this.field6196.method3090(var62, 3);
                        this.field6196.method3090(var63, 3);
                        this.field6196.method3090(var64, 3);
                        this.field6196.method784(-1585528400, 0.0F);
                        this.field6196.method784(-1585528400, 1.0F);
                        this.field6196.method784(arg1 - 1585522070, (float) var68 * var16 + var65);
                        this.field6196.method784(-1585528400, (float) var68 * var17 + var66);
                        this.field6196.method784(-1585528400, (float) var68 * var18 + var67);
                        this.field6196.method3090(var61, arg1 ^ 0xFFFFE745);
                        this.field6196.method3090(var62, 3);
                        this.field6196.method3090(var63, 3);
                        this.field6196.method3090(var64, arg1 + 6333);
                    }
                    if (this.field6216[var44] > 64) {
                        int var47 = this.field6216[var44] - 64 - 1;
                        for (int var48 = this.field6217[var47] - 1; var48 >= 0; var48--) {
                            class688 var49 = this.field6213[var47][var48];
                            int var50 = var49.field9476;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field9471 >> 12);
                            float var56 = (float) (var49.field9480 >> 12);
                            float var57 = (float) (var49.field9475 >> 12);
                            int var58 = var49.field9469 >> 12;
                            this.field6196.method784(-1585528400, 0.0F);
                            this.field6196.method784(-1585528400, 0.0F);
                            this.field6196.method784(arg1 - 1585522070, (float) (-var58) * var10 + var55);
                            this.field6196.method784(-1585528400, (float) (-var58) * var11 + var56);
                            this.field6196.method784(-1585528400, (float) (-var58) * var12 + var57);
                            this.field6196.method3090(var51, 3);
                            this.field6196.method3090(var52, 3);
                            this.field6196.method3090(var53, 3);
                            this.field6196.method3090(var54, 3);
                            this.field6196.method784(-1585528400, 1.0F);
                            this.field6196.method784(arg1 - 1585522070, 0.0F);
                            this.field6196.method784(arg1 - 1585522070, (float) var58 * var13 + var55);
                            this.field6196.method784(-1585528400, (float) var58 * var14 + var56);
                            this.field6196.method784(-1585528400, (float) var58 * var15 + var57);
                            this.field6196.method3090(var51, 3);
                            this.field6196.method3090(var52, 3);
                            this.field6196.method3090(var53, 3);
                            this.field6196.method3090(var54, 3);
                            this.field6196.method784(arg1 ^ 0x5E8126F6, 1.0F);
                            this.field6196.method784(arg1 ^ 0x5E8126F6, 1.0F);
                            this.field6196.method784(arg1 ^ 0x5E8126F6, (float) var58 * var10 + var55);
                            this.field6196.method784(arg1 ^ 0x5E8126F6, (float) var58 * var11 + var56);
                            this.field6196.method784(arg1 - 1585522070, (float) var58 * var12 + var57);
                            this.field6196.method3090(var51, arg1 + 6333);
                            this.field6196.method3090(var52, 3);
                            this.field6196.method3090(var53, 3);
                            this.field6196.method3090(var54, 3);
                            this.field6196.method784(-1585528400, 0.0F);
                            this.field6196.method784(arg1 - 1585522070, 1.0F);
                            this.field6196.method784(-1585528400, (float) var58 * var16 + var55);
                            this.field6196.method784(-1585528400, (float) var58 * var17 + var56);
                            this.field6196.method784(-1585528400, (float) var58 * var18 + var57);
                            this.field6196.method3090(var51, 3);
                            this.field6196.method3090(var52, 3);
                            this.field6196.method3090(var53, 3);
                            this.field6196.method3090(var54, 3);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field6216[var19] <= 64 ? this.field6216[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class688 var34 = this.field6214[var19][var21];
                        int var35 = var34.field9476;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field9471 >> 12);
                        float var41 = (float) (var34.field9480 >> 12);
                        float var42 = (float) (var34.field9475 >> 12);
                        int var43 = var34.field9469 >> 12;
                        this.field6196.method782(367967696, 0.0F);
                        this.field6196.method782(367967696, 0.0F);
                        this.field6196.method782(367967696, (float) (-var43) * var10 + var40);
                        this.field6196.method782(arg1 + 367974026, (float) (-var43) * var11 + var41);
                        this.field6196.method782(367967696, (float) (-var43) * var12 + var42);
                        this.field6196.method3090(var36, arg1 + 6333);
                        this.field6196.method3090(var37, arg1 + 6333);
                        this.field6196.method3090(var38, 3);
                        this.field6196.method3090(var39, 3);
                        this.field6196.method782(367967696, 1.0F);
                        this.field6196.method782(367967696, 0.0F);
                        this.field6196.method782(arg1 ^ 0xEA115A96, (float) var43 * var13 + var40);
                        this.field6196.method782(367967696, (float) var43 * var14 + var41);
                        this.field6196.method782(367967696, (float) var43 * var15 + var42);
                        this.field6196.method3090(var36, 3);
                        this.field6196.method3090(var37, 3);
                        this.field6196.method3090(var38, 3);
                        this.field6196.method3090(var39, 3);
                        this.field6196.method782(367967696, 1.0F);
                        this.field6196.method782(367967696, 1.0F);
                        this.field6196.method782(367967696, (float) var43 * var10 + var40);
                        this.field6196.method782(367967696, (float) var43 * var11 + var41);
                        this.field6196.method782(367967696, (float) var43 * var12 + var42);
                        this.field6196.method3090(var36, 3);
                        this.field6196.method3090(var37, 3);
                        this.field6196.method3090(var38, 3);
                        this.field6196.method3090(var39, 3);
                        this.field6196.method782(367967696, 0.0F);
                        this.field6196.method782(367967696, 1.0F);
                        this.field6196.method782(367967696, (float) var43 * var16 + var40);
                        this.field6196.method782(367967696, (float) var43 * var17 + var41);
                        this.field6196.method782(367967696, (float) var43 * var18 + var42);
                        this.field6196.method3090(var36, arg1 + 6333);
                        this.field6196.method3090(var37, 3);
                        this.field6196.method3090(var38, 3);
                        this.field6196.method3090(var39, 3);
                    }
                    if (this.field6216[var19] > 64) {
                        int var22 = this.field6216[var19] - 1 - 64;
                        for (int var23 = this.field6217[var22] - 1; var23 >= 0; var23--) {
                            class688 var24 = this.field6213[var22][var23];
                            int var25 = var24.field9476;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field9471 >> 12);
                            float var31 = (float) (var24.field9480 >> 12);
                            float var32 = (float) (var24.field9475 >> 12);
                            int var33 = var24.field9469 >> 12;
                            this.field6196.method782(367967696, 0.0F);
                            this.field6196.method782(arg1 + 367974026, 0.0F);
                            this.field6196.method782(367967696, (float) (-var33) * var10 + var30);
                            this.field6196.method782(arg1 + 367974026, (float) (-var33) * var11 + var31);
                            this.field6196.method782(367967696, (float) (-var33) * var12 + var32);
                            this.field6196.method3090(var26, 3);
                            this.field6196.method3090(var27, 3);
                            this.field6196.method3090(var28, arg1 ^ 0xFFFFE745);
                            this.field6196.method3090(var29, 3);
                            this.field6196.method782(arg1 ^ 0xEA115A96, 1.0F);
                            this.field6196.method782(367967696, 0.0F);
                            this.field6196.method782(367967696, (float) var33 * var13 + var30);
                            this.field6196.method782(367967696, (float) var33 * var14 + var31);
                            this.field6196.method782(367967696, (float) var33 * var15 + var32);
                            this.field6196.method3090(var26, 3);
                            this.field6196.method3090(var27, 3);
                            this.field6196.method3090(var28, arg1 + 6333);
                            this.field6196.method3090(var29, 3);
                            this.field6196.method782(367967696, 1.0F);
                            this.field6196.method782(367967696, 1.0F);
                            this.field6196.method782(367967696, (float) var33 * var10 + var30);
                            this.field6196.method782(367967696, (float) var33 * var11 + var31);
                            this.field6196.method782(arg1 + 367974026, (float) var33 * var12 + var32);
                            this.field6196.method3090(var26, 3);
                            this.field6196.method3090(var27, arg1 + 6333);
                            this.field6196.method3090(var28, 3);
                            this.field6196.method3090(var29, arg1 + 6333);
                            this.field6196.method782(367967696, 0.0F);
                            this.field6196.method782(arg1 ^ 0xEA115A96, 1.0F);
                            this.field6196.method782(367967696, (float) var33 * var16 + var30);
                            this.field6196.method782(367967696, (float) var33 * var17 + var31);
                            this.field6196.method782(367967696, (float) var33 * var18 + var32);
                            this.field6196.method3090(var26, arg1 + 6333);
                            this.field6196.method3090(var27, 3);
                            this.field6196.method3090(var28, 3);
                            this.field6196.method3090(var29, 3);
                        }
                    }
                }
            }
        }
        if (this.field6196.field7313 != 0) {
            this.field6209.method2231(24, this.field6196.field7313, arg1 + 24779, this.field6196.field7318);
            arg0.method3190(this.field6208, 32885, this.field6207, this.field6211, null);
            arg0.method3120(-107, 0, this.field6196.field7313 / 24, 7);
        }
    }
}
