import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class81 extends class16 {

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    private int field1078 = 0;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "Z")
    private boolean field1079 = false;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    private int field1081 = 0;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    private int field1084 = 0;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "I")
    private int field1082 = 0;

    @OriginalMember(owner = "client!ut", name = "w", descriptor = "I")
    private int field1098 = 0;

    @OriginalMember(owner = "client!ut", name = "v", descriptor = "Lfd;")
    private class365 field1097;

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "Lps;")
    private class63 field1090;

    @OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
    public static int field1100 = 0;

    @OriginalMember(owner = "client!ut", name = "B", descriptor = "Lgk;")
    public static class331 field1103 = new class331("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
    public static int field1106 = 0;

    @OriginalMember(owner = "client!ut", name = "F", descriptor = "Lsl;")
    public static class318 field1107 = new class318(17, 0);

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ut", name = "z", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!ut", name = "A", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "Lps;")
    private class63 field1083;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ut", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field1108;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(FFFFFFLma;II)V")
    public final void method116(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class10 arg6, int arg7, int arg8) {
        field1080++;
        class63 var10 = ((class95) arg6).field1285;
        if (this.field1079) {
            float var11 = (float) this.method125();
            float var12 = (float) this.method117();
            float var13 = (arg2 - arg0) / var11;
            float var14 = (arg3 - arg1) / var11;
            float var15 = (arg4 - arg0) / var12;
            float var16 = (arg5 - arg1) / var12;
            float var17 = (float) this.field1082 * var15;
            float var18 = (float) this.field1082 * var16;
            float var19 = (float) this.field1098 * var13;
            float var20 = (float) this.field1098 * var14;
            float var21 = (float) this.field1078 * -var13;
            float var22 = (float) this.field1078 * -var14;
            float var23 = (float) this.field1084 * -var15;
            arg1 = arg1 + var20 + var18;
            arg4 = arg4 + var19 + var23;
            arg2 = arg2 + var21 + var17;
            arg3 = arg3 + var22 + var18;
            arg0 = arg0 + var19 + var17;
            float var24 = (float) this.field1084 * -var16;
            arg5 = arg5 + var20 + var24;
        }
        float var25 = arg2 + arg4 - arg0;
        float var26 = arg5 + arg3 - arg1;
        this.field1090.method2421(-107, true);
        this.field1097.method2213(false);
        this.field1097.method2188((byte) 78, this.field1090);
        this.field1097.method2183(7681, 1);
        this.field1097.method2219(1, -118);
        this.field1097.method2188((byte) 78, var10);
        this.field1097.method2195(7681, 8448, true);
        this.field1097.method2228((byte) 79, 0, 768, 34168);
        this.field1097.method2241(103, 1);
        float var27 = var10.field749 / (float) var10.field743;
        float var28 = var10.field746 / (float) var10.field748;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1090.field746);
        OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * var27, var10.field746 - (((float) (-arg8) + arg1) * var28));
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + arg4) * var27, var10.field746 - ((arg5 - (float) arg8) * var28));
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glMultiTexCoord2f(33984, this.field1090.field749, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) (-arg7) + var25) * var27, var10.field746 - (((float) (-arg8) + var26) * var28));
        OpenGL.glVertex2f(var25, var26);
        OpenGL.glMultiTexCoord2f(33984, this.field1090.field749, this.field1090.field746);
        OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * var27, var10.field746 - ((float) (-arg8) + arg3) * var28);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
        this.field1097.method2228((byte) 79, 0, 768, 5890);
        this.field1097.method2183(7681, 0);
        this.field1097.method2188((byte) 78, null);
        this.field1097.method2219(0, -127);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public static void method730(int arg0) {
        field1107 = null;
        int var1 = -7 % ((arg0 + 22) / 62);
        field1103 = null;
    }

    @OriginalMember(owner = "client!ut", name = "la", descriptor = "()I")
    public final int method110() {
        field1089++;
        return this.field1090.field743;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
    private final void method731(byte arg0) {
        field1101++;
        this.field1097.method2219(1, -124);
        if (arg0 < 74) {
            field1103 = null;
        }
        this.field1097.method2188((byte) 78, null);
        this.field1097.method2195(8448, 8448, true);
        this.field1097.method2228((byte) 79, 1, 768, 34168);
        this.field1097.method2237(true, 770, 5890, 0);
        this.field1097.method2219(0, -125);
        this.field1097.method2228((byte) 79, 1, 768, 34168);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIII)V")
    public static final void method732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1099++;
        if (arg3 != -27348) {
            field1100 = -13;
        }
        if (class478.field7044.field3349 != 0 && arg4 != 0 && class388.field5740 < 50 && arg1 != -1) {
            class476.field7011[class388.field5740++] = new class114((byte) 1, arg1, arg4, arg2, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!ut", name = "T", descriptor = "()I")
    public final int method117() {
        field1102++;
        return this.field1090.field748 + this.field1082 + this.field1084;
    }

    @OriginalMember(owner = "client!ut", name = "BA", descriptor = "(III)V")
    public final void method112(int arg0, int arg1, int arg2) {
        field1076++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        this.field1083 = class466.method2789(arg1, this.field1090.field748, arg0, this.field1090.field743, -128, this.field1097);
        this.field1081 = arg2;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "()I")
    public final int method125() {
        field1092++;
        return this.field1090.field743 + this.field1098 + this.field1078;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method733(int arg0, byte[] arg1, int arg2, int arg3) {
        field1077++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg1[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class346.field4804[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        if (arg0 != 11783) {
            field1106 = 48;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ut", name = "ma", descriptor = "()I")
    public final int method126() {
        field1095++;
        return this.field1090.field748;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)V")
    public static final void method734(byte arg0) {
        field1105++;
        int var1 = -53 / ((65 - arg0) / 47);
        for (class161 var2 = (class161) class464.field6825.method1018(100); var2 != null; var2 = (class161) class464.field6825.method1022((byte) -112)) {
            if (class422.field6240 == null) {
                var2.method1525((byte) -51);
            } else if (class263.field3867 >= var2.field2274) {
                int var15 = class185.field2596[var2.field2266];
                if (var15 == 0) {
                    class235 var22 = class344.method2079(var2.field2267, var2.field2259, var2.field2264);
                    if (var22 instanceof class220) {
                        class72.method675(var2.field2267, var2.field2259, var2.field2264);
                        class220 var23 = (class220) var22;
                        if (var23.field3163 != null) {
                            class111.method903(var2.field2267, var2.field2259, var2.field2264, var23.field3163, null);
                        }
                    }
                } else if (var15 == 1) {
                    class386 var20 = class510.method3040(var2.field2267, var2.field2259, var2.field2264);
                    if (var20 instanceof class209) {
                        class346.method2095(var2.field2267, var2.field2259, var2.field2264);
                        class209 var21 = (class209) var20;
                        if (var21.field3024 != null) {
                            class356.method2148(var2.field2267, var2.field2259, var2.field2264, var21.field3024, null);
                        }
                    }
                } else if (var15 == 2) {
                    class431 var18 = class262.method1683(var2.field2267, var2.field2259, var2.field2264, field1108 == null ? (field1108 = method737("f")) : field1108);
                    if (var18 instanceof class450) {
                        class353.method2129(var2.field2267, var2.field2259, var2.field2264, field1108 == null ? (field1108 = method737("f")) : field1108);
                        class450 var19 = (class450) var18;
                        if (var19.field6628 != null) {
                            class322.method1989(var19.field6628, false);
                        }
                    }
                } else if (var15 == 3) {
                    class363 var16 = class282.method1802(var2.field2267, var2.field2259, var2.field2264);
                    if (var16 instanceof class70) {
                        class180.method1267(var2.field2267, var2.field2259, var2.field2264);
                        class70 var17 = (class70) var16;
                        if (var17.field895 != null) {
                            class315.method1966(var2.field2267, var2.field2259, var2.field2264, var17.field895);
                        }
                    }
                }
                var2.method1525((byte) -108);
            } else if (class263.field3867 == var2.field2262) {
                int var3 = class185.field2596[var2.field2266];
                if (var3 == 0) {
                    class235 var13 = class344.method2079(var2.field2267, var2.field2259, var2.field2264);
                    if (var13 instanceof class220) {
                        var2.method1525((byte) -115);
                    } else if (class316.method1973(var2.field2267, var2.field2259, var2.field2264) == null) {
                        class220 var14 = new class220(var2.field2266, var2.field2261, var2.field2269, var2.field2258, var2.field2275, var13);
                        class111.method903(var2.field2267, var2.field2259, var2.field2264, var14, null);
                    } else {
                        var2.method1525((byte) 82);
                    }
                } else if (var3 == 1) {
                    class386 var4 = class510.method3040(var2.field2267, var2.field2259, var2.field2264);
                    if (var4 instanceof class209) {
                        var2.method1525((byte) -35);
                    } else if (class193.method1353(var2.field2267, var2.field2259, var2.field2264) == null) {
                        class209 var5 = new class209(var2.field2266, var2.field2261, var2.field2269, var2.field2258, var2.field2275, var4);
                        class356.method2148(var2.field2267, var2.field2259, var2.field2264, var5, null);
                    } else {
                        var2.method1525((byte) 83);
                    }
                } else if (var3 == 2) {
                    class431 var6 = class262.method1683(var2.field2267, var2.field2259, var2.field2264, field1108 == null ? (field1108 = method737("f")) : field1108);
                    if (var6 instanceof class450) {
                        var2.method1525((byte) -97);
                    } else {
                        class353.method2129(var2.field2267, var2.field2259, var2.field2264, field1108 == null ? (field1108 = method737("f")) : field1108);
                        class222 var7 = class384.field5645.method786(var2.field2265, 0);
                        int var8;
                        int var9;
                        if (var2.field2261 == 1 || var2.field2261 == 3) {
                            var8 = var7.field3206;
                            var9 = var7.field3180;
                        } else {
                            var8 = var7.field3180;
                            var9 = var7.field3206;
                        }
                        class450 var10 = new class450(var2.field2266, var2.field2261, var2.field2267, var2.field2269, var2.field2258, var2.field2275, var2.field2259, var2.field2259 + var9 - 1, var2.field2264, var2.field2264 + var8 - 1, var6);
                        class322.method1989(var10, false);
                    }
                } else if (var3 == 3) {
                    class363 var11 = class282.method1802(var2.field2267, var2.field2259, var2.field2264);
                    if (var11 instanceof class70) {
                        var2.method1525((byte) -33);
                    } else {
                        class70 var12 = new class70(var2.field2269, var2.field2258, var2.field2275, var11);
                        class315.method1966(var2.field2267, var2.field2259, var2.field2264, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(FFFFFFIII)V")
    public final void method115(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field1091++;
        if (this.field1079) {
            float var10 = (float) this.method125();
            float var11 = (float) this.method117();
            float var12 = (arg2 - arg0) / var10;
            float var13 = (arg3 - arg1) / var10;
            float var14 = (arg4 - arg0) / var11;
            float var15 = (arg5 - arg1) / var11;
            float var16 = (float) this.field1082 * var14;
            float var17 = (float) this.field1082 * var15;
            float var18 = (float) this.field1098 * var12;
            float var19 = (float) this.field1098 * var13;
            float var20 = (float) this.field1078 * -var12;
            float var21 = (float) this.field1078 * -var13;
            float var22 = (float) this.field1084 * -var14;
            arg0 = arg0 + var18 + var16;
            arg1 = arg1 + var19 + var17;
            float var23 = (float) this.field1084 * -var15;
            arg2 = arg2 + var20 + var16;
            arg4 = arg4 + var18 + var22;
            arg3 = arg3 + var21 + var17;
            arg5 = arg5 + var19 + var23;
        }
        float var24 = arg2 + arg4 - arg0;
        float var25 = arg5 + arg3 - arg1;
        this.field1090.method2421(-92, true);
        this.field1097.method2213(false);
        this.field1097.method2188((byte) 78, this.field1090);
        this.field1097.method2241(122, arg8);
        this.field1097.method2183(7681, arg6);
        OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
        OpenGL.glVertex2f(arg0, arg1);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(arg4, arg5);
        OpenGL.glTexCoord2f(this.field1090.field749, 0.0F);
        OpenGL.glVertex2f(var24, var25);
        OpenGL.glTexCoord2f(this.field1090.field749, this.field1090.field746);
        OpenGL.glVertex2f(arg2, arg3);
        OpenGL.glEnd();
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IILma;II)V")
    public final void method128(int arg0, int arg1, class10 arg2, int arg3, int arg4) {
        field1087++;
        class95 var6 = (class95) arg2;
        class63 var7 = var6.field1285;
        this.field1090.method2421(-62, false);
        this.field1097.method2213(false);
        this.field1097.method2188((byte) 78, this.field1090);
        this.field1097.method2183(7681, 1);
        this.field1097.method2219(1, -119);
        this.field1097.method2188((byte) 78, var7);
        this.field1097.method2195(7681, 8448, true);
        this.field1097.method2228((byte) 79, 0, 768, 34168);
        this.field1097.method2241(110, 1);
        int var8 = this.field1082 + arg1;
        int var9 = this.field1098 + arg0;
        int var10 = var9 + this.field1090.field743;
        int var11 = var8 + this.field1090.field748;
        float var12 = var7.field749 / (float) var7.field743;
        float var13 = var7.field746 / (float) var7.field748;
        float var14 = (float) (var9 - arg3) * var12;
        float var15 = (float) (var10 - arg3) * var12;
        float var16 = var7.field746 - (float) (var8 - arg4) * var13;
        float var17 = var7.field746 - (float) (var11 - arg4) * var13;
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, this.field1090.field746);
        OpenGL.glMultiTexCoord2f(33985, var14, var16);
        OpenGL.glVertex2i(var9, var8);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var14, var17);
        OpenGL.glVertex2i(var9, var8 + this.field1090.field748);
        OpenGL.glMultiTexCoord2f(33984, this.field1090.field749, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, var15, var17);
        OpenGL.glVertex2i(this.field1090.field743 + var9, this.field1090.field748 + var8);
        OpenGL.glMultiTexCoord2f(33984, this.field1090.field749, this.field1090.field746);
        OpenGL.glMultiTexCoord2f(33985, var15, var16);
        OpenGL.glVertex2i(var9 + this.field1090.field743, var8);
        OpenGL.glEnd();
        this.field1097.method2228((byte) 79, 0, 768, 5890);
        this.field1097.method2183(7681, 0);
        this.field1097.method2188((byte) 78, null);
        this.field1097.method2219(0, -126);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)V")
    private final void method735(byte arg0, int arg1) {
        field1094++;
        this.field1097.method2219(1, -126);
        this.field1097.method2188((byte) 78, this.field1090);
        this.field1097.method2195(this.field1097.method2245(1, arg1), 7681, true);
        this.field1097.method2228((byte) 79, 1, 768, 34167);
        this.field1097.method2237(true, 770, 34168, 0);
        this.field1097.method2219(0, -119);
        this.field1097.method2188((byte) 78, this.field1083);
        this.field1097.method2195(34479, 7681, true);
        this.field1097.method2228((byte) 79, 1, 768, 34166);
        if (arg0 >= -5) {
            this.method125();
        }
        if (this.field1081 == 0) {
            this.field1097.method2196(true, 0.5F, 0.0F, 0.5F, 1.0F);
        } else if (this.field1081 == 1) {
            this.field1097.method2196(true, 1.0F, 0.0F, 0.5F, 0.5F);
        } else if (this.field1081 == 2) {
            this.field1097.method2196(true, 0.5F, 0.0F, 1.0F, 0.5F);
            return;
        } else if (this.field1081 == 3) {
            this.field1097.method2196(true, 128.5F, 0.0F, 128.5F, 128.5F);
            return;
        }
    }

    @OriginalMember(owner = "client!ut", name = "r", descriptor = "(IIIII)V")
    public final void method114(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1104++;
        this.field1090.method2421(-87, false);
        this.field1097.method2213(false);
        this.field1097.method2241(-124, arg4);
        OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
        int var6 = this.field1082 + arg1;
        int var7 = this.field1098 + arg0;
        if (this.field1083 == null) {
            this.field1097.method2188((byte) 78, this.field1090);
            this.field1097.method2183(7681, arg2);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
            OpenGL.glVertex2i(var7, var6);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(var7, this.field1090.field748 + var6);
            OpenGL.glTexCoord2f(this.field1090.field749, 0.0F);
            OpenGL.glVertex2i(this.field1090.field743 + var7, this.field1090.field748 + var6);
            OpenGL.glTexCoord2f(this.field1090.field749, this.field1090.field746);
            OpenGL.glVertex2i(this.field1090.field743 + var7, var6);
            OpenGL.glEnd();
            return;
        }
        this.method735((byte) -88, arg2);
        this.field1083.method2421(-73, false);
        OpenGL.glBegin(7);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1090.field746);
        OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
        OpenGL.glVertex2i(var7, var6);
        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2i(var7, this.field1090.field748 + var6);
        OpenGL.glMultiTexCoord2f(33985, this.field1090.field749, 0.0F);
        OpenGL.glTexCoord2f(this.field1090.field749, 0.0F);
        OpenGL.glVertex2i(this.field1090.field743 + var7, var6 - -this.field1090.field748);
        OpenGL.glMultiTexCoord2f(33985, this.field1090.field749, this.field1090.field746);
        OpenGL.glTexCoord2f(this.field1090.field749, this.field1090.field746);
        OpenGL.glVertex2i(this.field1090.field743 + var7, var6);
        OpenGL.glEnd();
        this.method731((byte) 109);
    }

    @OriginalMember(owner = "client!ut", name = "JA", descriptor = "(IIIIIII)V")
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1088++;
        int var8 = arg0 + arg2;
        this.field1090.method2421(-127, false);
        int var9 = arg1 + arg3;
        this.field1097.method2213(false);
        this.field1097.method2188((byte) 78, this.field1090);
        this.field1097.method2241(-52, arg6);
        this.field1097.method2183(7681, arg4);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1090.field751 && !this.field1079) {
            float var10 = (float) arg3 * this.field1090.field746 / (float) this.field1090.field748;
            float var11 = (float) arg2 * this.field1090.field749 / (float) this.field1090.field743;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, var10);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, var9);
            OpenGL.glTexCoord2f(var11, 0.0F);
            OpenGL.glVertex2i(var8, var9);
            OpenGL.glTexCoord2f(var11, var10);
            OpenGL.glVertex2i(var8, arg1);
            OpenGL.glEnd();
            return;
        }
        OpenGL.glPushMatrix();
        OpenGL.glTranslatef((float) this.field1098, (float) this.field1082, 0.0F);
        int var12 = this.method125();
        int var13 = this.method117();
        int var14 = arg1 + this.field1090.field748;
        OpenGL.glBegin(7);
        int var15 = arg1;
        while (var14 <= var9) {
            int var20 = this.field1090.field743 + arg0;
            int var21 = arg0;
            while (var8 >= var20) {
                OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(this.field1090.field749, 0.0F);
                OpenGL.glVertex2i(var20, var14);
                OpenGL.glTexCoord2f(this.field1090.field749, this.field1090.field746);
                OpenGL.glVertex2i(var20, var15);
                var21 += var12;
                var20 += var12;
            }
            if (var21 < var8) {
                float var22 = (float) (var8 - var21) * this.field1090.field749 / (float) this.field1090.field743;
                OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
                OpenGL.glVertex2i(var21, var15);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(var21, var14);
                OpenGL.glTexCoord2f(var22, 0.0F);
                OpenGL.glVertex2i(var8, var14);
                OpenGL.glTexCoord2f(var22, this.field1090.field746);
                OpenGL.glVertex2i(var8, var15);
            }
            var15 += var13;
            var14 += var13;
        }
        if (var9 > var15) {
            float var16 = (float) (var15 + this.field1090.field748 - var9) * this.field1090.field746 / (float) this.field1090.field748;
            int var17 = arg0 + this.field1090.field743;
            int var18 = arg0;
            while (var17 <= var8) {
                OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(this.field1090.field749, var16);
                OpenGL.glVertex2i(var17, var9);
                OpenGL.glTexCoord2f(this.field1090.field749, this.field1090.field746);
                OpenGL.glVertex2i(var17, var15);
                var17 += var12;
                var18 += var12;
            }
            if (var8 > var18) {
                float var19 = (float) (var8 - var18) * this.field1090.field749 / (float) this.field1090.field743;
                OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
                OpenGL.glVertex2i(var18, var15);
                OpenGL.glTexCoord2f(0.0F, var16);
                OpenGL.glVertex2i(var18, var9);
                OpenGL.glTexCoord2f(var19, var16);
                OpenGL.glVertex2i(var8, var9);
                OpenGL.glTexCoord2f(var19, this.field1090.field746);
                OpenGL.glVertex2i(var8, var15);
            }
        }
        OpenGL.glEnd();
        OpenGL.glPopMatrix();
    }

    @OriginalMember(owner = "client!ut", name = "t", descriptor = "(IIIIII)V")
    public final void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1090.method1879(arg4, (byte) 72, arg5, arg0, arg1, arg3, arg2);
        field1086++;
    }

    @OriginalMember(owner = "client!ut", name = "MA", descriptor = "(IIII)V")
    public final void method113(int arg0, int arg1, int arg2, int arg3) {
        this.field1084 = arg3;
        this.field1098 = arg0;
        this.field1078 = arg2;
        field1096++;
        this.field1082 = arg1;
        this.field1079 = this.field1098 != 0 || this.field1082 != 0 || this.field1078 != 0 || this.field1084 != 0;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIILsd;IIIII)Z")
    public static final boolean method736(int arg0, int arg1, int arg2, int arg3, int arg4, class62 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1093++;
        int var11 = arg10;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg10 - var13;
        class106.field1467[var13][var14] = 99;
        int var16 = arg9 - var14;
        class445.field6584[var13][var14] = 0;
        byte var17 = 0;
        class424.field6262[var17] = arg10;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class342.field4737[var10001] = arg9;
        int[][] var19 = arg5.field721;
        while (var26 != var18) {
            var12 = class342.field4737[var18];
            var11 = class424.field6262[var18];
            int var20 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - arg5.field728;
            int var22 = var11 - var15;
            int var23 = var12 - arg5.field733;
            if (arg2 == -4) {
                if (arg4 == var11 && arg6 == var12) {
                    class474.field6988 = var12;
                    class370.field5493 = var11;
                    return true;
                }
            } else if (arg2 == -3) {
                if (class38.method385(1, arg6, 1, arg8, arg0, var12, var11, arg4, (byte) 120)) {
                    class370.field5493 = var11;
                    class474.field6988 = var12;
                    return true;
                }
            } else if (arg2 == -2) {
                if (arg5.method559(arg4, 0, 1, arg8, var11, arg1, arg6, var12, arg0, 1)) {
                    class370.field5493 = var11;
                    class474.field6988 = var12;
                    return true;
                }
            } else if (arg2 == -1) {
                if (arg5.method555(arg0, 1, arg4, arg1, arg8, arg6, var11, 67, var12)) {
                    class474.field6988 = var12;
                    class370.field5493 = var11;
                    return true;
                }
            } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                if (arg5.method557(var12, arg7, arg6, 1, var11, false, arg4, arg2)) {
                    class370.field5493 = var11;
                    class474.field6988 = var12;
                    return true;
                }
            } else if (arg5.method564(arg7, var11, false, arg2, arg4, var12, arg6, 1)) {
                class474.field6988 = var12;
                class370.field5493 = var11;
                return true;
            }
            int var25 = class445.field6584[var22][var20] + 1;
            if (var22 > 0 && class106.field1467[var22 - 1][var20] == 0 && (var19[var21 - 1][var23] & 0x42240000) == 0) {
                class424.field6262[var26] = var11 - 1;
                class342.field4737[var26] = var12;
                class106.field1467[var22 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class445.field6584[var22 - 1][var20] = var25;
            }
            if (var22 < 127 && class106.field1467[var22 + 1][var20] == 0 && (var19[var21 + 1][var23] & 0x60240000) == 0) {
                class424.field6262[var26] = var11 + 1;
                class342.field4737[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class106.field1467[var22 + 1][var20] = 8;
                class445.field6584[var22 + 1][var20] = var25;
            }
            if (var20 > 0 && class106.field1467[var22][var20 - 1] == 0 && (var19[var21][var23 - 1] & 0x40A40000) == 0) {
                class424.field6262[var26] = var11;
                class342.field4737[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1467[var22][var20 - 1] = 1;
                class445.field6584[var22][var20 - 1] = var25;
            }
            if (var20 < 127 && class106.field1467[var22][var20 + 1] == 0 && (var19[var21][var23 + 1] & 0x48240000) == 0) {
                class424.field6262[var26] = var11;
                class342.field4737[var26] = var12 + 1;
                class106.field1467[var22][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class445.field6584[var22][var20 + 1] = var25;
            }
            if (var22 > 0 && var20 > 0 && class106.field1467[var22 - 1][var20 - 1] == 0 && (var19[var21 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var23] & 0x42240000) == 0 && (var19[var21][var23 - 1] & 0x40A40000) == 0) {
                class424.field6262[var26] = var11 - 1;
                class342.field4737[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1467[var22 - 1][var20 - 1] = 3;
                class445.field6584[var22 - 1][var20 - 1] = var25;
            }
            if (var22 < 127 && var20 > 0 && class106.field1467[var22 + 1][var20 - 1] == 0 && (var19[var21 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var23] & 0x60240000) == 0 && (var19[var21][var23 - 1] & 0x40A40000) == 0) {
                class424.field6262[var26] = var11 + 1;
                class342.field4737[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1467[var22 + 1][var20 - 1] = 9;
                class445.field6584[var22 + 1][var20 - 1] = var25;
            }
            if (var22 > 0 && var20 < 127 && class106.field1467[var22 - 1][var20 + 1] == 0 && (var19[var21 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var23] & 0x42240000) == 0 && (var19[var21][var23 + 1] & 0x48240000) == 0) {
                class424.field6262[var26] = var11 - 1;
                class342.field4737[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1467[var22 - 1][var20 + 1] = 6;
                class445.field6584[var22 - 1][var20 + 1] = var25;
            }
            if (var22 < 127 && var20 < 127 && class106.field1467[var22 + 1][var20 + 1] == 0 && (var19[var21 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var23] & 0x60240000) == 0 && (var19[var21][var23 + 1] & 0x48240000) == 0) {
                class424.field6262[var26] = var11 + 1;
                class342.field4737[var26] = var12 + 1;
                class106.field1467[var22 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class445.field6584[var22 + 1][var20 + 1] = var25;
            }
        }
        class370.field5493 = var11;
        class474.field6988 = var12;
        if (arg3 != -1) {
            method730(-106);
        }
        return false;
    }

    @OriginalMember(owner = "client!ut", name = "s", descriptor = "(IIIIIII)V")
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1085++;
        this.field1090.method2421(90, true);
        this.field1097.method2213(false);
        this.field1097.method2241(-76, arg6);
        OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
        if (this.field1079) {
            float var8 = (float) arg2 / (float) this.method125();
            float var9 = (float) arg3 / (float) this.method117();
            float var10 = (float) this.field1098 * var8 + (float) arg0;
            float var11 = (float) this.field1082 * var9 + (float) arg1;
            float var12 = (float) this.field1090.field743 * var8 + var10;
            float var13 = (float) this.field1090.field748 * var9 + var11;
            if (this.field1083 == null) {
                this.field1097.method2188((byte) 78, this.field1090);
                this.field1097.method2183(7681, arg4);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glTexCoord2f(this.field1090.field749, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glTexCoord2f(this.field1090.field749, this.field1090.field746);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
            } else {
                this.method735((byte) -66, arg4);
                this.field1083.method2421(-4, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1090.field746);
                OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
                OpenGL.glVertex2f(var10, var11);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(var10, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field1090.field749, 0.0F);
                OpenGL.glTexCoord2f(this.field1090.field749, 0.0F);
                OpenGL.glVertex2f(var12, var13);
                OpenGL.glMultiTexCoord2f(33985, this.field1090.field749, this.field1090.field746);
                OpenGL.glTexCoord2f(this.field1090.field749, this.field1090.field746);
                OpenGL.glVertex2f(var12, var11);
                OpenGL.glEnd();
                this.method731((byte) 112);
            }
        } else if (this.field1083 == null) {
            this.field1097.method2188((byte) 78, this.field1090);
            this.field1097.method2183(7681, arg4);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1090.field749, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glTexCoord2f(this.field1090.field749, this.field1090.field746);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
        } else {
            this.method735((byte) -97, arg4);
            this.field1083.method2421(-42, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, this.field1090.field746);
            OpenGL.glTexCoord2f(0.0F, this.field1090.field746);
            OpenGL.glVertex2i(arg0, arg1);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(arg0, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1090.field749, 0.0F);
            OpenGL.glTexCoord2f(this.field1090.field749, 0.0F);
            OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
            OpenGL.glMultiTexCoord2f(33985, this.field1090.field749, this.field1090.field746);
            OpenGL.glTexCoord2f(this.field1090.field749, this.field1090.field746);
            OpenGL.glVertex2i(arg0 + arg2, arg1);
            OpenGL.glEnd();
            this.method731((byte) 115);
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lfd;IIII)V")
    public class81(class365 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1097 = arg0;
        this.field1090 = class466.method2789(arg2, arg4, arg1, arg3, -101, arg0);
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lfd;II[III)V")
    public class81(class365 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field1097 = arg0;
        this.field1090 = class8.method53(arg0, arg2, arg3, false, arg1, -1);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method737(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
