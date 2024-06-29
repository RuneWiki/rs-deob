import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class324 {

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "[F")
    private float[] field4848 = new float[16];

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Luc;")
    private class23 field4844 = new class23(786336);

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    private int field4852 = class297.method1928(-55, 1600);

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "[I")
    private int[] field4858 = new int[1600];

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "[[Lck;")
    private class456[][] field4859 = new class456[64][768];

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    private int field4860 = 0;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "[I")
    private int[] field4861 = new int[8191];

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "[[Lck;")
    private class456[][] field4862 = new class456[1600][64];

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "[I")
    private int[] field4863 = new int[64];

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field4847 = 0;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "Lwu;")
    private class253 field4850;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "Lgi;")
    private class481 field4853;

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "Lgi;")
    private class481 field4856;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "Lgi;")
    private class481 field4857;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILkd;)V")
    private final void method2058(int arg0, class188 arg1) {
        field4843++;
        arg1.method1294(true, arg0 + 17780);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(arg0);
        if (class366.field5395 != arg1.field3134) {
            arg1.method271(class366.field5395);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)I")
    public static final int method2059(byte arg0, int arg1) {
        field4845++;
        if (arg0 < 10) {
            return 65;
        }
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BLkd;Lkp;)V")
    public final void method2060(byte arg0, class188 arg1, class341 arg2) {
        field4855++;
        if (arg1.field3063 == null) {
            return;
        }
        this.method2063(-13342, arg1);
        if (arg0 <= 74) {
            this.field4852 = -8;
        }
        float var4 = arg1.field3063.field4885;
        float var5 = arg1.field3063.field4884;
        float var6 = arg1.field3063.field4864;
        float var7 = arg1.field3063.field4889;
        try {
            if (arg2.field5075) {
                int var26 = arg2.field5073 - arg2.field5072;
                int var27;
                if ((var26 + 2) <= 1600) {
                    var27 = 0;
                    var26 += 2;
                } else {
                    var27 = class297.method1928(-93, var26) + 1 - this.field4852;
                    var26 = (var26 >> var27) + 2;
                }
                class505 var28 = arg2.field5066.field6456;
                class505 var29 = var28.field7378;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field4860 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field4858[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field4863[var34] = 0;
                    }
                    while (var28 != var29) {
                        class456 var35 = (class456) var29;
                        if (var32) {
                            var30 = var35.field6638;
                            var32 = false;
                            var31 = var35.field6635;
                        } else if (var35.field6638 != var30 || var35.field6635 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field6640 >> class440.field6455) * var6 + (float) (var35.field6633 >> class440.field6455) * var5 + (float) (var35.field6631 >> class440.field6455) * var4 + var7) - arg2.field5072 >> var27;
                        if (var36 < 1600) {
                            if (this.field4858[var36] < 64) {
                                this.field4862[var36][this.field4858[var36]++] = var35;
                            } else {
                                label144: {
                                    if (this.field4858[var36] == 64) {
                                        if (this.field4860 == 64) {
                                            break label144;
                                        }
                                        this.field4858[var36] += (this.field4860++) + 1;
                                    }
                                    class456[] var38 = this.field4859[this.field4858[var36] - 1 - 64];
                                    int var10002 = this.field4858[var36] - 65;
                                    int var10004 = this.field4863[this.field4858[var36] - 65];
                                    this.field4863[var10002] = this.field4863[this.field4858[var36] - 65] + 1;
                                    var38[var10004] = var35;
                                }
                            }
                        }
                        var29 = var29.field7378;
                    }
                    if (var30 < 0) {
                        arg1.method1289(-19391, null);
                    } else {
                        arg1.method1289(-19391, arg1.field3021.method1771((byte) -42, var30));
                        arg1.method1248(arg1.field524.method584(true, var30).field4266, true);
                    }
                    if (var31 && class366.field5395 != arg1.field3134) {
                        arg1.method271(class366.field5395);
                    } else if (arg1.field3134 != 1.0F) {
                        arg1.method271(1.0F);
                    }
                    this.method2064(var26, -29458, arg1);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class505 var11 = arg2.field5066.field6456;
                for (class505 var12 = var11.field7378; var12 != var11; var12 = var12.field7378) {
                    class456 var13 = (class456) var12;
                    int var14 = (int) ((float) (var13.field6640 >> class440.field6455) * var6 + (float) (var13.field6633 >> class440.field6455) * var5 + (float) (var13.field6631 >> class440.field6455) * var4 + var7);
                    if (var9 > var14) {
                        var9 = var14;
                    }
                    if (var14 > var10) {
                        var10 = var14;
                    }
                    this.field4861[var8++] = var14;
                }
                int var15 = var10 - var9;
                int var16;
                if (var15 + 2 <= 1600) {
                    var15 += 2;
                    var16 = 0;
                } else {
                    var16 = class297.method1928(114, var15) + (1 - this.field4852);
                    var15 = (var15 >> var16) + 2;
                }
                int var17 = 0;
                class505 var18 = var11.field7378;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var18) {
                    this.field4860 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field4858[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field4863[var23] = 0;
                    }
                    while (var11 != var18) {
                        class456 var24 = (class456) var18;
                        if (var21) {
                            var21 = false;
                            var19 = var24.field6638;
                            var20 = var24.field6635;
                        }
                        if (var17 > 0 && (var24.field6638 != var19 || var20 != var24.field6635)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field4861[var17++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field4858[var25] >= 64) {
                                label189: {
                                    if (this.field4858[var25] == 64) {
                                        if (this.field4860 == 64) {
                                            break label189;
                                        }
                                        this.field4858[var25] += this.field4860++ + 1;
                                    }
                                    this.field4859[this.field4858[var25] - 1 - 64][this.field4863[this.field4858[var25] - 64 - 1]++] = var24;
                                }
                            } else {
                                this.field4862[var25][this.field4858[var25]++] = var24;
                            }
                        }
                        var18 = var18.field7378;
                    }
                    if (var19 < 0) {
                        arg1.method1289(-19391, null);
                    } else {
                        arg1.method1289(-19391, arg1.field3021.method1771((byte) 120, var19));
                        arg1.method1248(arg1.field524.method584(true, var19).field4266, true);
                    }
                    if (var20 && class366.field5395 != arg1.field3134) {
                        arg1.method271(class366.field5395);
                    } else if (arg1.field3134 != 1.0F) {
                        arg1.method271(1.0F);
                    }
                    this.method2064(var15, -29458, arg1);
                }
            }
        } catch (Exception var37) {
        }
        this.method2058(16385, arg1);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(CBLjava/lang/String;)I")
    public static final int method2061(char arg0, byte arg1, String arg2) {
        field4846++;
        if (arg1 >= -52) {
            return -83;
        }
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg2.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method2062(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class327.field4931 <= arg7 && class184.field2777 >= arg5 && arg6 >= class404.field5987 && class433.field6414 >= arg0) {
            class331.method2095(arg5, arg4, arg3, arg2, arg7, arg0, arg6, (byte) 16);
        } else {
            class468.method2825(arg5, arg6, arg4, arg3, arg2, (byte) 113, arg7, arg0);
        }
        field4842++;
        if (arg1 >= -68) {
            field4847 = 2;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(ILkd;)V")
    private final void method2063(int arg0, class188 arg1) {
        field4841++;
        class366.field5395 = arg1.field3134;
        arg1.method1271(-9744);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        if (arg0 == -13342) {
            arg1.method1294(false, 34165);
            arg1.method1304(-26349, -2);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILkd;)V")
    private final void method2064(int arg0, int arg1, class188 arg2) {
        OpenGL.glGetFloatv(2982, this.field4848, 0);
        field4854++;
        float var4 = this.field4848[0];
        float var5 = this.field4848[4];
        float var6 = this.field4848[8];
        if (arg1 != -29458) {
            this.method2065(null, 9);
        }
        float var7 = this.field4848[1];
        float var8 = this.field4848[5];
        float var9 = this.field4848[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field4844.field3556 = 0;
        if (arg2.field3141) {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field4858[var44] > 64 ? 64 : this.field4858[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class456 var59 = this.field4862[var44][var46];
                        int var60 = var59.field6641;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field6631 >> class440.field6455);
                        float var66 = (float) (var59.field6633 >> class440.field6455);
                        float var67 = (float) (var59.field6640 >> class440.field6455);
                        int var68 = var59.field6632 >> class440.field6455;
                        this.field4844.method173(0.0F, 101127152);
                        this.field4844.method173(0.0F, arg1 ^ 0xF9F89F1E);
                        this.field4844.method173((float) (-var68) * var10 + var65, 101127152);
                        this.field4844.method173((float) (-var68) * var11 + var66, 101127152);
                        this.field4844.method173((float) (-var68) * var12 + var67, 101127152);
                        this.field4844.method1545(var61, -67);
                        this.field4844.method1545(var62, arg1 + 29391);
                        this.field4844.method1545(var63, -76);
                        this.field4844.method1545(var64, -56);
                        this.field4844.method173(1.0F, arg1 ^ 0xF9F89F1E);
                        this.field4844.method173(0.0F, 101127152);
                        this.field4844.method173((float) var68 * var13 + var65, 101127152);
                        this.field4844.method173((float) var68 * var14 + var66, arg1 ^ 0xF9F89F1E);
                        this.field4844.method173((float) var68 * var15 + var67, 101127152);
                        this.field4844.method1545(var61, arg1 ^ 0x7353);
                        this.field4844.method1545(var62, -89);
                        this.field4844.method1545(var63, -37);
                        this.field4844.method1545(var64, -46);
                        this.field4844.method173(1.0F, 101127152);
                        this.field4844.method173(1.0F, 101127152);
                        this.field4844.method173((float) var68 * var10 + var65, 101127152);
                        this.field4844.method173((float) var68 * var11 + var66, 101127152);
                        this.field4844.method173((float) var68 * var12 + var67, 101127152);
                        this.field4844.method1545(var61, -75);
                        this.field4844.method1545(var62, -91);
                        this.field4844.method1545(var63, -39);
                        this.field4844.method1545(var64, -117);
                        this.field4844.method173(0.0F, 101127152);
                        this.field4844.method173(1.0F, arg1 ^ 0xF9F89F1E);
                        this.field4844.method173((float) var68 * var16 + var65, 101127152);
                        this.field4844.method173((float) var68 * var17 + var66, 101127152);
                        this.field4844.method173((float) var68 * var18 + var67, 101127152);
                        this.field4844.method1545(var61, arg1 ^ 0x7361);
                        this.field4844.method1545(var62, -38);
                        this.field4844.method1545(var63, -95);
                        this.field4844.method1545(var64, -32);
                    }
                    if (this.field4858[var44] > 64) {
                        int var47 = this.field4858[var44] - 64 - 1;
                        for (int var48 = this.field4863[var47] - 1; var48 >= 0; var48--) {
                            class456 var49 = this.field4859[var47][var48];
                            int var50 = var49.field6641;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field6631 >> class440.field6455);
                            float var56 = (float) (var49.field6633 >> class440.field6455);
                            float var57 = (float) (var49.field6640 >> class440.field6455);
                            int var58 = var49.field6632 >> class440.field6455;
                            this.field4844.method173(0.0F, 101127152);
                            this.field4844.method173(0.0F, arg1 ^ 0xF9F89F1E);
                            this.field4844.method173((float) (-var58) * var10 + var55, 101127152);
                            this.field4844.method173((float) (-var58) * var11 + var56, arg1 ^ 0xF9F89F1E);
                            this.field4844.method173((float) (-var58) * var12 + var57, 101127152);
                            this.field4844.method1545(var51, -89);
                            this.field4844.method1545(var52, -37);
                            this.field4844.method1545(var53, -44);
                            this.field4844.method1545(var54, arg1 + 29417);
                            this.field4844.method173(1.0F, 101127152);
                            this.field4844.method173(0.0F, 101127152);
                            this.field4844.method173((float) var58 * var13 + var55, arg1 ^ 0xF9F89F1E);
                            this.field4844.method173((float) var58 * var14 + var56, 101127152);
                            this.field4844.method173((float) var58 * var15 + var57, 101127152);
                            this.field4844.method1545(var51, -103);
                            this.field4844.method1545(var52, -94);
                            this.field4844.method1545(var53, -89);
                            this.field4844.method1545(var54, -69);
                            this.field4844.method173(1.0F, 101127152);
                            this.field4844.method173(1.0F, 101127152);
                            this.field4844.method173((float) var58 * var10 + var55, 101127152);
                            this.field4844.method173((float) var58 * var11 + var56, 101127152);
                            this.field4844.method173((float) var58 * var12 + var57, 101127152);
                            this.field4844.method1545(var51, -105);
                            this.field4844.method1545(var52, arg1 + 29426);
                            this.field4844.method1545(var53, -88);
                            this.field4844.method1545(var54, -66);
                            this.field4844.method173(0.0F, arg1 + 101156610);
                            this.field4844.method173(1.0F, 101127152);
                            this.field4844.method173((float) var58 * var16 + var55, 101127152);
                            this.field4844.method173((float) var58 * var17 + var56, 101127152);
                            this.field4844.method173((float) var58 * var18 + var57, 101127152);
                            this.field4844.method1545(var51, -112);
                            this.field4844.method1545(var52, arg1 + 29339);
                            this.field4844.method1545(var53, arg1 + 29361);
                            this.field4844.method1545(var54, arg1 ^ 0x7329);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field4858[var19] <= 64 ? this.field4858[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class456 var34 = this.field4862[var19][var21];
                        int var35 = var34.field6641;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field6631 >> class440.field6455);
                        float var41 = (float) (var34.field6633 >> class440.field6455);
                        float var42 = (float) (var34.field6640 >> class440.field6455);
                        int var43 = var34.field6632 >> class440.field6455;
                        this.field4844.method171(0.0F, (byte) 51);
                        this.field4844.method171(0.0F, (byte) 51);
                        this.field4844.method171((float) (-var43) * var10 + var40, (byte) 51);
                        this.field4844.method171((float) (-var43) * var11 + var41, (byte) 51);
                        this.field4844.method171((float) (-var43) * var12 + var42, (byte) 51);
                        this.field4844.method1545(var36, -101);
                        this.field4844.method1545(var37, -124);
                        this.field4844.method1545(var38, arg1 + 29333);
                        this.field4844.method1545(var39, -54);
                        this.field4844.method171(1.0F, (byte) 51);
                        this.field4844.method171(0.0F, (byte) 51);
                        this.field4844.method171((float) var43 * var13 + var40, (byte) 51);
                        this.field4844.method171((float) var43 * var14 + var41, (byte) 51);
                        this.field4844.method171((float) var43 * var15 + var42, (byte) 51);
                        this.field4844.method1545(var36, arg1 + 29358);
                        this.field4844.method1545(var37, -122);
                        this.field4844.method1545(var38, -122);
                        this.field4844.method1545(var39, -29);
                        this.field4844.method171(1.0F, (byte) 51);
                        this.field4844.method171(1.0F, (byte) 51);
                        this.field4844.method171((float) var43 * var10 + var40, (byte) 51);
                        this.field4844.method171((float) var43 * var11 + var41, (byte) 51);
                        this.field4844.method171((float) var43 * var12 + var42, (byte) 51);
                        this.field4844.method1545(var36, -38);
                        this.field4844.method1545(var37, -84);
                        this.field4844.method1545(var38, arg1 + 29386);
                        this.field4844.method1545(var39, -80);
                        this.field4844.method171(0.0F, (byte) 51);
                        this.field4844.method171(1.0F, (byte) 51);
                        this.field4844.method171((float) var43 * var16 + var40, (byte) 51);
                        this.field4844.method171((float) var43 * var17 + var41, (byte) 51);
                        this.field4844.method171((float) var43 * var18 + var42, (byte) 51);
                        this.field4844.method1545(var36, -50);
                        this.field4844.method1545(var37, arg1 + 29374);
                        this.field4844.method1545(var38, arg1 + 29341);
                        this.field4844.method1545(var39, -49);
                    }
                    if (this.field4858[var19] > 64) {
                        int var22 = this.field4858[var19] - 64 - 1;
                        for (int var23 = this.field4863[var22] - 1; var23 >= 0; var23--) {
                            class456 var24 = this.field4859[var22][var23];
                            int var25 = var24.field6641;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field6631 >> class440.field6455);
                            float var31 = (float) (var24.field6633 >> class440.field6455);
                            float var32 = (float) (var24.field6640 >> class440.field6455);
                            int var33 = var24.field6632 >> class440.field6455;
                            this.field4844.method171(0.0F, (byte) 51);
                            this.field4844.method171(0.0F, (byte) 51);
                            this.field4844.method171((float) (-var33) * var10 + var30, (byte) 51);
                            this.field4844.method171((float) (-var33) * var11 + var31, (byte) 51);
                            this.field4844.method171((float) (-var33) * var12 + var32, (byte) 51);
                            this.field4844.method1545(var26, -38);
                            this.field4844.method1545(var27, -29);
                            this.field4844.method1545(var28, -113);
                            this.field4844.method1545(var29, arg1 + 29367);
                            this.field4844.method171(1.0F, (byte) 51);
                            this.field4844.method171(0.0F, (byte) 51);
                            this.field4844.method171((float) var33 * var13 + var30, (byte) 51);
                            this.field4844.method171((float) var33 * var14 + var31, (byte) 51);
                            this.field4844.method171((float) var33 * var15 + var32, (byte) 51);
                            this.field4844.method1545(var26, -119);
                            this.field4844.method1545(var27, arg1 ^ 0x7339);
                            this.field4844.method1545(var28, -32);
                            this.field4844.method1545(var29, -107);
                            this.field4844.method171(1.0F, (byte) 51);
                            this.field4844.method171(1.0F, (byte) 51);
                            this.field4844.method171((float) var33 * var10 + var30, (byte) 51);
                            this.field4844.method171((float) var33 * var11 + var31, (byte) 51);
                            this.field4844.method171((float) var33 * var12 + var32, (byte) 51);
                            this.field4844.method1545(var26, arg1 + 29390);
                            this.field4844.method1545(var27, arg1 + 29420);
                            this.field4844.method1545(var28, -53);
                            this.field4844.method1545(var29, -108);
                            this.field4844.method171(0.0F, (byte) 51);
                            this.field4844.method171(1.0F, (byte) 51);
                            this.field4844.method171((float) var33 * var16 + var30, (byte) 51);
                            this.field4844.method171((float) var33 * var17 + var31, (byte) 51);
                            this.field4844.method171((float) var33 * var18 + var32, (byte) 51);
                            this.field4844.method1545(var26, -114);
                            this.field4844.method1545(var27, -90);
                            this.field4844.method1545(var28, arg1 ^ 0x736C);
                            this.field4844.method1545(var29, arg1 + 29409);
                        }
                    }
                }
            }
        }
        if (this.field4844.field3556 != 0) {
            this.field4850.method781(this.field4844.field3572, this.field4844.field3556, 24, false);
            arg2.method1267(null, this.field4857, (byte) -122, this.field4853, this.field4856);
            arg2.method1253(1, 0, 7, this.field4844.field3556 / 24);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lkd;I)V")
    public final void method2065(class188 arg0, int arg1) {
        this.field4850 = arg0.method1320(24, true, 105, null, 196584);
        field4849++;
        this.field4857 = new class481(this.field4850, 5126, 2, 0);
        this.field4853 = new class481(this.field4850, 5126, 3, 8);
        if (arg1 > -65) {
            this.field4848 = null;
        }
        this.field4856 = new class481(this.field4850, 5121, 4, 20);
    }
}
