import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class415 {

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "[F")
    private float[] field5810 = new float[16];

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "Lmea;")
    private class427 field5809 = new class427(786336);

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    private int field5821 = class621.method3590(1600, 4);

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "[I")
    private int[] field5827 = new int[8191];

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    private int field5825 = 0;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "[I")
    private int[] field5828 = new int[64];

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "[[Lfa;")
    private class232[][] field5826 = new class232[1600][64];

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "[I")
    private int[] field5829 = new int[1600];

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "[[Lfa;")
    private class232[][] field5824 = new class232[64][768];

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "[I")
    public static int[] field5812 = new int[13];

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field5815 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "Ljw;")
    public static class551 field5814 = new class551(3, 2);

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "Ldda;")
    private class379 field5817;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "Ldda;")
    private class379 field5820;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "Ldda;")
    private class379 field5823;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "Ltda;")
    private class635 field5819;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILoea;)V")
    public final void method2527(int arg0, class594 arg1) {
        this.field5819 = arg1.method3418(true, null, -2, 24, 196584);
        int var3 = -71 / ((33 - arg0) / 60);
        field5811++;
        this.field5820 = new class379(this.field5819, 5126, 2, 0);
        this.field5823 = new class379(this.field5819, 5126, 3, 8);
        this.field5817 = new class379(this.field5819, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Loea;ILoo;I)V")
    public final void method2528(class594 arg0, int arg1, class624 arg2, int arg3) {
        field5816++;
        if (arg0.field8576 == null) {
            return;
        }
        if (arg1 < 0) {
            this.method2530(arg3 ^ 0xFFFFC971, arg0);
        } else {
            this.method2534(arg1, (byte) 107, arg0);
        }
        float var5 = arg0.field8576.field10114;
        float var6 = arg0.field8576.field10120;
        float var7 = arg0.field8576.field10107;
        float var8 = arg0.field8576.field10135;
        try {
            if (arg3 != -14075) {
                this.field5821 = 103;
            }
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class740 var12 = arg2.field8974.field5148;
            for (class740 var13 = var12.field10390; var13 != var12; var13 = var13.field10390) {
                class232 var14 = (class232) var13;
                int var15 = (int) ((float) (var14.field3300 >> 12) * var7 + (float) (var14.field3297 >> 12) * var5 + (float) (var14.field3295 >> 12) * var6 + var8);
                if (var15 > var11) {
                    var11 = var15;
                }
                this.field5827[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) > 1600) {
                var17 = class621.method3590(var16, 4) + 1 - this.field5821;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            int var18 = 0;
            class740 var19 = var12.field10390;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field5825 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field5829[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field5828[var24] = 0;
                }
                while (var12 != var19) {
                    class232 var25 = (class232) var19;
                    if (var22) {
                        var22 = false;
                        var21 = var25.field3299;
                        var20 = var25.field3304;
                    }
                    if (var18 > 0 && (var25.field3304 != var20 || var25.field3299 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field5827[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field5829[var26] < 64) {
                            this.field5826[var26][this.field5829[var26]++] = var25;
                        } else {
                            label105: {
                                if (this.field5829[var26] == 64) {
                                    if (this.field5825 == 64) {
                                        break label105;
                                    }
                                    this.field5829[var26] += this.field5825++ + 1;
                                }
                                this.field5824[this.field5829[var26] - 65][this.field5828[this.field5829[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var19 = var19.field10390;
                }
                if (var20 < 0) {
                    arg0.method3486((byte) 127, -1);
                } else {
                    arg0.method3486((byte) 127, var20);
                }
                if (var21 && class366.field5112 != arg0.field8628) {
                    arg0.method552(class366.field5112);
                } else if (arg0.field8628 != 1.0F) {
                    arg0.method552(1.0F);
                }
                this.method2533(16385, arg0, var16);
            }
        } catch (Exception var27) {
        }
        this.method2529(95, arg0);
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(ILoea;)V")
    private final void method2529(int arg0, class594 arg1) {
        if (arg0 <= 86) {
            return;
        }
        field5818++;
        arg1.method3483(124, true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class366.field5112 != arg1.field8628) {
            arg1.method552(class366.field5112);
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(ILoea;)V")
    private final void method2530(int arg0, class594 arg1) {
        field5822++;
        if (arg0 < 115) {
            this.field5823 = null;
        }
        class366.field5112 = arg1.field8628;
        arg1.method3404(0);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method3483(57, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public static void method2531(int arg0) {
        field5815 = null;
        field5812 = null;
        if (arg0 == 364532460) {
            field5814 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2532(int arg0, String arg1) {
        field5807++;
        if (arg1 == null) {
            return;
        }
        if (!(class425.field5945 < 200 || class406.field5652) || class425.field5945 >= 200) {
            class570.method3327((byte) 113, 4, class281.field3951.method1839((byte) 45, class744.field10426));
            String var2 = class281.field3952.method1839((byte) 45, class744.field10426);
            if (var2 != null) {
                class570.method3327((byte) 58, 4, var2);
            }
            return;
        }
        String var3 = class726.method4041(-1, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class425.field5945; var4++) {
            String var9 = class726.method4041(-1, class583.field8236[var4]);
            if (var9 != null && var9.equals(var3)) {
                class570.method3327((byte) 126, 4, arg1 + class281.field3979.method1839((byte) 45, class744.field10426));
                return;
            }
            if (class111.field1800[var4] != null) {
                String var10 = class726.method4041(-1, class111.field1800[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class570.method3327((byte) 73, 4, arg1 + class281.field3979.method1839((byte) 45, class744.field10426));
                    return;
                }
            }
        }
        int var5 = 0;
        if (arg0 > -121) {
            field5815 = null;
        }
        while (var5 < class222.field3169) {
            String var7 = class726.method4041(-1, class162.field2404[var5]);
            if (var7 != null && var7.equals(var3)) {
                class570.method3327((byte) 110, 4, class281.field3984.method1839((byte) 45, class744.field10426) + arg1 + class281.field3985.method1839((byte) 45, class744.field10426));
                return;
            }
            if (class628.field9029[var5] != null) {
                String var8 = class726.method4041(-1, class628.field9029[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class570.method3327((byte) 102, 4, class281.field3984.method1839((byte) 45, class744.field10426) + arg1 + class281.field3985.method1839((byte) 45, class744.field10426));
                    return;
                }
            }
            var5++;
        }
        if (class726.method4041(-1, class468.field6748.field4939).equals(var3)) {
            class570.method3327((byte) 59, 4, class281.field3982.method1839((byte) 45, class744.field10426));
            return;
        }
        class595.field8707++;
        class135 var6 = class273.method1801(class459.field6629, class495.field7060, 2);
        var6.field2109.method263((byte) 60, class552.method3233((byte) -98, arg1));
        var6.field2109.method287((byte) 0, arg1);
        class539.method3178(var6, -18925);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILoea;I)V")
    private final void method2533(int arg0, class594 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field5810, 0);
        field5808++;
        float var4 = this.field5810[0];
        float var5 = this.field5810[4];
        float var6 = this.field5810[8];
        float var7 = this.field5810[1];
        float var8 = this.field5810[5];
        float var9 = this.field5810[9];
        if (arg0 != 16385) {
            return;
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
        this.field5809.field469 = 0;
        if (arg1.field8682) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field5829[var44] <= 64 ? this.field5829[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class232 var59 = this.field5826[var44][var46];
                        int var60 = var59.field3303;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field3297 >> 12);
                        float var66 = (float) (var59.field3295 >> 12);
                        float var67 = (float) (var59.field3300 >> 12);
                        int var68 = var59.field3305 >> 12;
                        this.field5809.method2597((byte) 46, 0.0F);
                        this.field5809.method2597((byte) 46, 0.0F);
                        this.field5809.method2597((byte) 46, (float) (-var68) * var10 + var65);
                        this.field5809.method2597((byte) 46, (float) (-var68) * var11 + var66);
                        this.field5809.method2597((byte) 46, (float) (-var68) * var12 + var67);
                        this.field5809.method263((byte) -97, var61);
                        this.field5809.method263((byte) -89, var62);
                        this.field5809.method263((byte) -114, var63);
                        this.field5809.method263((byte) 62, var64);
                        this.field5809.method2597((byte) 46, 1.0F);
                        this.field5809.method2597((byte) 46, 0.0F);
                        this.field5809.method2597((byte) 46, (float) var68 * var13 + var65);
                        this.field5809.method2597((byte) 46, (float) var68 * var14 + var66);
                        this.field5809.method2597((byte) 46, (float) var68 * var15 + var67);
                        this.field5809.method263((byte) 69, var61);
                        this.field5809.method263((byte) -79, var62);
                        this.field5809.method263((byte) -118, var63);
                        this.field5809.method263((byte) 75, var64);
                        this.field5809.method2597((byte) 46, 1.0F);
                        this.field5809.method2597((byte) 46, 1.0F);
                        this.field5809.method2597((byte) 46, (float) var68 * var10 + var65);
                        this.field5809.method2597((byte) 46, (float) var68 * var11 + var66);
                        this.field5809.method2597((byte) 46, (float) var68 * var12 + var67);
                        this.field5809.method263((byte) 68, var61);
                        this.field5809.method263((byte) 98, var62);
                        this.field5809.method263((byte) 97, var63);
                        this.field5809.method263((byte) 126, var64);
                        this.field5809.method2597((byte) 46, 0.0F);
                        this.field5809.method2597((byte) 46, 1.0F);
                        this.field5809.method2597((byte) 46, (float) var68 * var16 + var65);
                        this.field5809.method2597((byte) 46, (float) var68 * var17 + var66);
                        this.field5809.method2597((byte) 46, (float) var68 * var18 + var67);
                        this.field5809.method263((byte) -100, var61);
                        this.field5809.method263((byte) 98, var62);
                        this.field5809.method263((byte) -98, var63);
                        this.field5809.method263((byte) -95, var64);
                    }
                    if (this.field5829[var44] > 64) {
                        int var47 = this.field5829[var44] - 1 - 64;
                        for (int var48 = this.field5828[var47] - 1; var48 >= 0; var48--) {
                            class232 var49 = this.field5824[var47][var48];
                            int var50 = var49.field3303;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field3297 >> 12);
                            float var56 = (float) (var49.field3295 >> 12);
                            float var57 = (float) (var49.field3300 >> 12);
                            int var58 = var49.field3305 >> 12;
                            this.field5809.method2597((byte) 46, 0.0F);
                            this.field5809.method2597((byte) 46, 0.0F);
                            this.field5809.method2597((byte) 46, (float) (-var58) * var10 + var55);
                            this.field5809.method2597((byte) 46, (float) (-var58) * var11 + var56);
                            this.field5809.method2597((byte) 46, (float) (-var58) * var12 + var57);
                            this.field5809.method263((byte) 70, var51);
                            this.field5809.method263((byte) 86, var52);
                            this.field5809.method263((byte) -69, var53);
                            this.field5809.method263((byte) -126, var54);
                            this.field5809.method2597((byte) 46, 1.0F);
                            this.field5809.method2597((byte) 46, 0.0F);
                            this.field5809.method2597((byte) 46, (float) var58 * var13 + var55);
                            this.field5809.method2597((byte) 46, (float) var58 * var14 + var56);
                            this.field5809.method2597((byte) 46, (float) var58 * var15 + var57);
                            this.field5809.method263((byte) -91, var51);
                            this.field5809.method263((byte) 116, var52);
                            this.field5809.method263((byte) 111, var53);
                            this.field5809.method263((byte) -82, var54);
                            this.field5809.method2597((byte) 46, 1.0F);
                            this.field5809.method2597((byte) 46, 1.0F);
                            this.field5809.method2597((byte) 46, (float) var58 * var10 + var55);
                            this.field5809.method2597((byte) 46, (float) var58 * var11 + var56);
                            this.field5809.method2597((byte) 46, (float) var58 * var12 + var57);
                            this.field5809.method263((byte) 71, var51);
                            this.field5809.method263((byte) 88, var52);
                            this.field5809.method263((byte) -107, var53);
                            this.field5809.method263((byte) 114, var54);
                            this.field5809.method2597((byte) 46, 0.0F);
                            this.field5809.method2597((byte) 46, 1.0F);
                            this.field5809.method2597((byte) 46, (float) var58 * var16 + var55);
                            this.field5809.method2597((byte) 46, (float) var58 * var17 + var56);
                            this.field5809.method2597((byte) 46, (float) var58 * var18 + var57);
                            this.field5809.method263((byte) 105, var51);
                            this.field5809.method263((byte) 124, var52);
                            this.field5809.method263((byte) -88, var53);
                            this.field5809.method263((byte) -126, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field5829[var19] > 64 ? 64 : this.field5829[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class232 var34 = this.field5826[var19][var21];
                        int var35 = var34.field3303;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field3297 >> 12);
                        float var41 = (float) (var34.field3295 >> 12);
                        float var42 = (float) (var34.field3300 >> 12);
                        int var43 = var34.field3305 >> 12;
                        this.field5809.method2596(119, 0.0F);
                        this.field5809.method2596(115, 0.0F);
                        this.field5809.method2596(122, (float) (-var43) * var10 + var40);
                        this.field5809.method2596(108, (float) (-var43) * var11 + var41);
                        this.field5809.method2596(arg0 ^ 0x405F, (float) (-var43) * var12 + var42);
                        this.field5809.method263((byte) -88, var36);
                        this.field5809.method263((byte) 109, var37);
                        this.field5809.method263((byte) -80, var38);
                        this.field5809.method263((byte) -107, var39);
                        this.field5809.method2596(arg0 - 16310, 1.0F);
                        this.field5809.method2596(97, 0.0F);
                        this.field5809.method2596(117, (float) var43 * var13 + var40);
                        this.field5809.method2596(113, (float) var43 * var14 + var41);
                        this.field5809.method2596(110, (float) var43 * var15 + var42);
                        this.field5809.method263((byte) 118, var36);
                        this.field5809.method263((byte) 120, var37);
                        this.field5809.method263((byte) -113, var38);
                        this.field5809.method263((byte) -67, var39);
                        this.field5809.method2596(arg0 ^ 0x406D, 1.0F);
                        this.field5809.method2596(arg0 ^ 0x4055, 1.0F);
                        this.field5809.method2596(60, (float) var43 * var10 + var40);
                        this.field5809.method2596(73, (float) var43 * var11 + var41);
                        this.field5809.method2596(100, (float) var43 * var12 + var42);
                        this.field5809.method263((byte) 109, var36);
                        this.field5809.method263((byte) 71, var37);
                        this.field5809.method263((byte) 70, var38);
                        this.field5809.method263((byte) -126, var39);
                        this.field5809.method2596(65, 0.0F);
                        this.field5809.method2596(93, 1.0F);
                        this.field5809.method2596(72, (float) var43 * var16 + var40);
                        this.field5809.method2596(arg0 ^ 0x4065, (float) var43 * var17 + var41);
                        this.field5809.method2596(98, (float) var43 * var18 + var42);
                        this.field5809.method263((byte) -99, var36);
                        this.field5809.method263((byte) 106, var37);
                        this.field5809.method263((byte) 119, var38);
                        this.field5809.method263((byte) 110, var39);
                    }
                    if (this.field5829[var19] > 64) {
                        int var22 = this.field5829[var19] - 65;
                        for (int var23 = this.field5828[var22] - 1; var23 >= 0; var23--) {
                            class232 var24 = this.field5824[var22][var23];
                            int var25 = var24.field3303;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field3297 >> 12);
                            float var31 = (float) (var24.field3295 >> 12);
                            float var32 = (float) (var24.field3300 >> 12);
                            int var33 = var24.field3305 >> 12;
                            this.field5809.method2596(62, 0.0F);
                            this.field5809.method2596(84, 0.0F);
                            this.field5809.method2596(126, (float) (-var33) * var10 + var30);
                            this.field5809.method2596(77, (float) (-var33) * var11 + var31);
                            this.field5809.method2596(107, (float) (-var33) * var12 + var32);
                            this.field5809.method263((byte) 109, var26);
                            this.field5809.method263((byte) -96, var27);
                            this.field5809.method263((byte) -91, var28);
                            this.field5809.method263((byte) 107, var29);
                            this.field5809.method2596(123, 1.0F);
                            this.field5809.method2596(78, 0.0F);
                            this.field5809.method2596(91, (float) var33 * var13 + var30);
                            this.field5809.method2596(arg0 - 16279, (float) var33 * var14 + var31);
                            this.field5809.method2596(arg0 ^ 0x4067, (float) var33 * var15 + var32);
                            this.field5809.method263((byte) -66, var26);
                            this.field5809.method263((byte) 109, var27);
                            this.field5809.method263((byte) 63, var28);
                            this.field5809.method263((byte) -95, var29);
                            this.field5809.method2596(arg0 - 16301, 1.0F);
                            this.field5809.method2596(84, 1.0F);
                            this.field5809.method2596(74, (float) var33 * var10 + var30);
                            this.field5809.method2596(87, (float) var33 * var11 + var31);
                            this.field5809.method2596(112, (float) var33 * var12 + var32);
                            this.field5809.method263((byte) 57, var26);
                            this.field5809.method263((byte) 96, var27);
                            this.field5809.method263((byte) -77, var28);
                            this.field5809.method263((byte) -120, var29);
                            this.field5809.method2596(68, 0.0F);
                            this.field5809.method2596(126, 1.0F);
                            this.field5809.method2596(71, (float) var33 * var16 + var30);
                            this.field5809.method2596(arg0 - 16295, (float) var33 * var17 + var31);
                            this.field5809.method2596(80, (float) var33 * var18 + var32);
                            this.field5809.method263((byte) 80, var26);
                            this.field5809.method263((byte) -97, var27);
                            this.field5809.method263((byte) 63, var28);
                            this.field5809.method263((byte) -110, var29);
                        }
                    }
                }
            }
        }
        if (this.field5809.field469 != 0) {
            this.field5819.method2161(24, this.field5809.field469, (byte) -118, this.field5809.field483);
            arg1.method3409(this.field5823, null, this.field5817, this.field5820, (byte) 120);
            arg1.method3470(7, 8, this.field5809.field469 / 24, 0);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBLoea;)V")
    private final void method2534(int arg0, byte arg1, class594 arg2) {
        field5813++;
        class366.field5112 = arg2.field8628;
        arg2.method3424((float) arg0, 3);
        arg2.method3427((byte) 67);
        if (arg1 < 12) {
            method2531(27);
        }
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method3483(101, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
