import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class89 {

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "[F")
    private float[] field1174 = new float[16];

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "Law;")
    private class616 field1175 = new class616(786336);

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
    private int field1185 = class330.method2080((byte) -94, 1600);

    @OriginalMember(owner = "client!ow", name = "r", descriptor = "[I")
    private int[] field1189 = new int[8191];

    @OriginalMember(owner = "client!ow", name = "x", descriptor = "I")
    private int field1195 = 0;

    @OriginalMember(owner = "client!ow", name = "t", descriptor = "[I")
    private int[] field1191 = new int[64];

    @OriginalMember(owner = "client!ow", name = "v", descriptor = "[[Lis;")
    private class2[][] field1193 = new class2[1600][64];

    @OriginalMember(owner = "client!ow", name = "u", descriptor = "[I")
    private int[] field1192 = new int[1600];

    @OriginalMember(owner = "client!ow", name = "w", descriptor = "[[Lis;")
    private class2[][] field1194 = new class2[64][768];

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "Lvt;")
    public static class344 field1176 = new class344("M", "M", "M", "M");

    @OriginalMember(owner = "client!ow", name = "q", descriptor = "Lbn;")
    public static class371 field1188 = new class371(2, 4, 4, 0);

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "Lee;")
    private class159 field1183;

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "Lcd;")
    private class86 field1184;

    @OriginalMember(owner = "client!ow", name = "o", descriptor = "Lcd;")
    private class86 field1186;

    @OriginalMember(owner = "client!ow", name = "p", descriptor = "Lcd;")
    private class86 field1187;

    @OriginalMember(owner = "client!ow", name = "s", descriptor = "[I")
    public static int[] field1190;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)I")
    public static final int method491(int arg0, int arg1) {
        field1177++;
        return arg1 <= 2 ? -37 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILuq;)V")
    private final void method492(int arg0, class313 arg1) {
        arg1.method1949(true, (byte) 120);
        field1173++;
        if (arg0 != -27582) {
            return;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class339.field4731 != arg1.field4264) {
            arg1.method993(class339.field4731);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
    public static void method493(int arg0) {
        if (arg0 <= 19) {
            method491(72, 72);
        }
        field1190 = null;
        field1176 = null;
        field1188 = null;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZLuq;)V")
    private final void method494(boolean arg0, class313 arg1) {
        field1172++;
        class339.field4731 = arg1.field4264;
        arg1.method1925(arg0);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method1949(false, (byte) 120);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILuq;I)V")
    private final void method495(int arg0, class313 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field1174, 0);
        field1178++;
        float var4 = this.field1174[0];
        float var5 = this.field1174[4];
        float var6 = this.field1174[8];
        float var7 = this.field1174[1];
        float var8 = this.field1174[5];
        int var9 = -99 / (arg0 / 52);
        float var10 = this.field1174[9];
        float var11 = var4 + var7;
        float var12 = var5 + var8;
        float var13 = var6 + var10;
        float var14 = var4 - var7;
        float var15 = var5 - var8;
        float var16 = var6 - var10;
        float var17 = var7 - var4;
        float var18 = var8 - var5;
        float var19 = var10 - var6;
        this.field1175.field7707 = 0;
        if (arg1.field4291) {
            for (int var45 = arg2 - 1; var45 >= 0; var45--) {
                int var46 = this.field1192[var45] <= 64 ? this.field1192[var45] : 64;
                if (var46 > 0) {
                    for (int var47 = var46 - 1; var47 >= 0; var47--) {
                        class2 var60 = this.field1193[var45][var47];
                        int var61 = var60.field7;
                        byte var62 = (byte) (var61 >> 16);
                        byte var63 = (byte) (var61 >> 8);
                        byte var64 = (byte) var61;
                        byte var65 = (byte) (var61 >>> 24);
                        float var66 = (float) (var60.field16 >> 12);
                        float var67 = (float) (var60.field17 >> 12);
                        float var68 = (float) (var60.field14 >> 12);
                        int var69 = var60.field9 >> 12;
                        this.field1175.method3531(1448476952, 0.0F);
                        this.field1175.method3531(1448476952, 0.0F);
                        this.field1175.method3531(1448476952, (float) (-var69) * var11 + var66);
                        this.field1175.method3531(1448476952, (float) (-var69) * var12 + var67);
                        this.field1175.method3531(1448476952, (float) (-var69) * var13 + var68);
                        this.field1175.method3060(var62, -25098);
                        this.field1175.method3060(var63, -25098);
                        this.field1175.method3060(var64, -25098);
                        this.field1175.method3060(var65, -25098);
                        this.field1175.method3531(1448476952, 1.0F);
                        this.field1175.method3531(1448476952, 0.0F);
                        this.field1175.method3531(1448476952, (float) var69 * var14 + var66);
                        this.field1175.method3531(1448476952, (float) var69 * var15 + var67);
                        this.field1175.method3531(1448476952, (float) var69 * var16 + var68);
                        this.field1175.method3060(var62, -25098);
                        this.field1175.method3060(var63, -25098);
                        this.field1175.method3060(var64, -25098);
                        this.field1175.method3060(var65, -25098);
                        this.field1175.method3531(1448476952, 1.0F);
                        this.field1175.method3531(1448476952, 1.0F);
                        this.field1175.method3531(1448476952, (float) var69 * var11 + var66);
                        this.field1175.method3531(1448476952, (float) var69 * var12 + var67);
                        this.field1175.method3531(1448476952, (float) var69 * var13 + var68);
                        this.field1175.method3060(var62, -25098);
                        this.field1175.method3060(var63, -25098);
                        this.field1175.method3060(var64, -25098);
                        this.field1175.method3060(var65, -25098);
                        this.field1175.method3531(1448476952, 0.0F);
                        this.field1175.method3531(1448476952, 1.0F);
                        this.field1175.method3531(1448476952, (float) var69 * var17 + var66);
                        this.field1175.method3531(1448476952, (float) var69 * var18 + var67);
                        this.field1175.method3531(1448476952, (float) var69 * var19 + var68);
                        this.field1175.method3060(var62, -25098);
                        this.field1175.method3060(var63, -25098);
                        this.field1175.method3060(var64, -25098);
                        this.field1175.method3060(var65, -25098);
                    }
                    if (this.field1192[var45] > 64) {
                        int var48 = this.field1192[var45] - 1 - 64;
                        for (int var49 = this.field1191[var48] - 1; var49 >= 0; var49--) {
                            class2 var50 = this.field1194[var48][var49];
                            int var51 = var50.field7;
                            byte var52 = (byte) (var51 >> 16);
                            byte var53 = (byte) (var51 >> 8);
                            byte var54 = (byte) var51;
                            byte var55 = (byte) (var51 >>> 24);
                            float var56 = (float) (var50.field16 >> 12);
                            float var57 = (float) (var50.field17 >> 12);
                            float var58 = (float) (var50.field14 >> 12);
                            int var59 = var50.field9 >> 12;
                            this.field1175.method3531(1448476952, 0.0F);
                            this.field1175.method3531(1448476952, 0.0F);
                            this.field1175.method3531(1448476952, (float) (-var59) * var11 + var56);
                            this.field1175.method3531(1448476952, (float) (-var59) * var12 + var57);
                            this.field1175.method3531(1448476952, (float) (-var59) * var13 + var58);
                            this.field1175.method3060(var52, -25098);
                            this.field1175.method3060(var53, -25098);
                            this.field1175.method3060(var54, -25098);
                            this.field1175.method3060(var55, -25098);
                            this.field1175.method3531(1448476952, 1.0F);
                            this.field1175.method3531(1448476952, 0.0F);
                            this.field1175.method3531(1448476952, (float) var59 * var14 + var56);
                            this.field1175.method3531(1448476952, (float) var59 * var15 + var57);
                            this.field1175.method3531(1448476952, (float) var59 * var16 + var58);
                            this.field1175.method3060(var52, -25098);
                            this.field1175.method3060(var53, -25098);
                            this.field1175.method3060(var54, -25098);
                            this.field1175.method3060(var55, -25098);
                            this.field1175.method3531(1448476952, 1.0F);
                            this.field1175.method3531(1448476952, 1.0F);
                            this.field1175.method3531(1448476952, (float) var59 * var11 + var56);
                            this.field1175.method3531(1448476952, (float) var59 * var12 + var57);
                            this.field1175.method3531(1448476952, (float) var59 * var13 + var58);
                            this.field1175.method3060(var52, -25098);
                            this.field1175.method3060(var53, -25098);
                            this.field1175.method3060(var54, -25098);
                            this.field1175.method3060(var55, -25098);
                            this.field1175.method3531(1448476952, 0.0F);
                            this.field1175.method3531(1448476952, 1.0F);
                            this.field1175.method3531(1448476952, (float) var59 * var17 + var56);
                            this.field1175.method3531(1448476952, (float) var59 * var18 + var57);
                            this.field1175.method3531(1448476952, (float) var59 * var19 + var58);
                            this.field1175.method3060(var52, -25098);
                            this.field1175.method3060(var53, -25098);
                            this.field1175.method3060(var54, -25098);
                            this.field1175.method3060(var55, -25098);
                        }
                    }
                }
            }
        } else {
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
                int var21 = this.field1192[var20] <= 64 ? this.field1192[var20] : 64;
                if (var21 > 0) {
                    for (int var22 = var21 - 1; var22 >= 0; var22--) {
                        class2 var35 = this.field1193[var20][var22];
                        int var36 = var35.field7;
                        byte var37 = (byte) (var36 >> 16);
                        byte var38 = (byte) (var36 >> 8);
                        byte var39 = (byte) var36;
                        byte var40 = (byte) (var36 >>> 24);
                        float var41 = (float) (var35.field16 >> 12);
                        float var42 = (float) (var35.field17 >> 12);
                        float var43 = (float) (var35.field14 >> 12);
                        int var44 = var35.field9 >> 12;
                        this.field1175.method3529(0.0F, -109);
                        this.field1175.method3529(0.0F, -41);
                        this.field1175.method3529((float) (-var44) * var11 + var41, -78);
                        this.field1175.method3529((float) (-var44) * var12 + var42, -41);
                        this.field1175.method3529((float) (-var44) * var13 + var43, -50);
                        this.field1175.method3060(var37, -25098);
                        this.field1175.method3060(var38, -25098);
                        this.field1175.method3060(var39, -25098);
                        this.field1175.method3060(var40, -25098);
                        this.field1175.method3529(1.0F, -121);
                        this.field1175.method3529(0.0F, -100);
                        this.field1175.method3529((float) var44 * var14 + var41, -104);
                        this.field1175.method3529((float) var44 * var15 + var42, -67);
                        this.field1175.method3529((float) var44 * var16 + var43, -120);
                        this.field1175.method3060(var37, -25098);
                        this.field1175.method3060(var38, -25098);
                        this.field1175.method3060(var39, -25098);
                        this.field1175.method3060(var40, -25098);
                        this.field1175.method3529(1.0F, -76);
                        this.field1175.method3529(1.0F, -120);
                        this.field1175.method3529((float) var44 * var11 + var41, -72);
                        this.field1175.method3529((float) var44 * var12 + var42, -88);
                        this.field1175.method3529((float) var44 * var13 + var43, -113);
                        this.field1175.method3060(var37, -25098);
                        this.field1175.method3060(var38, -25098);
                        this.field1175.method3060(var39, -25098);
                        this.field1175.method3060(var40, -25098);
                        this.field1175.method3529(0.0F, -62);
                        this.field1175.method3529(1.0F, -78);
                        this.field1175.method3529((float) var44 * var17 + var41, -101);
                        this.field1175.method3529((float) var44 * var18 + var42, -125);
                        this.field1175.method3529((float) var44 * var19 + var43, -54);
                        this.field1175.method3060(var37, -25098);
                        this.field1175.method3060(var38, -25098);
                        this.field1175.method3060(var39, -25098);
                        this.field1175.method3060(var40, -25098);
                    }
                    if (this.field1192[var20] > 64) {
                        int var23 = this.field1192[var20] - 65;
                        for (int var24 = this.field1191[var23] - 1; var24 >= 0; var24--) {
                            class2 var25 = this.field1194[var23][var24];
                            int var26 = var25.field7;
                            byte var27 = (byte) (var26 >> 16);
                            byte var28 = (byte) (var26 >> 8);
                            byte var29 = (byte) var26;
                            byte var30 = (byte) (var26 >>> 24);
                            float var31 = (float) (var25.field16 >> 12);
                            float var32 = (float) (var25.field17 >> 12);
                            float var33 = (float) (var25.field14 >> 12);
                            int var34 = var25.field9 >> 12;
                            this.field1175.method3529(0.0F, -34);
                            this.field1175.method3529(0.0F, -125);
                            this.field1175.method3529((float) (-var34) * var11 + var31, -84);
                            this.field1175.method3529((float) (-var34) * var12 + var32, -108);
                            this.field1175.method3529((float) (-var34) * var13 + var33, -62);
                            this.field1175.method3060(var27, -25098);
                            this.field1175.method3060(var28, -25098);
                            this.field1175.method3060(var29, -25098);
                            this.field1175.method3060(var30, -25098);
                            this.field1175.method3529(1.0F, -36);
                            this.field1175.method3529(0.0F, -87);
                            this.field1175.method3529((float) var34 * var14 + var31, -116);
                            this.field1175.method3529((float) var34 * var15 + var32, -42);
                            this.field1175.method3529((float) var34 * var16 + var33, -114);
                            this.field1175.method3060(var27, -25098);
                            this.field1175.method3060(var28, -25098);
                            this.field1175.method3060(var29, -25098);
                            this.field1175.method3060(var30, -25098);
                            this.field1175.method3529(1.0F, -88);
                            this.field1175.method3529(1.0F, -123);
                            this.field1175.method3529((float) var34 * var11 + var31, -88);
                            this.field1175.method3529((float) var34 * var12 + var32, -85);
                            this.field1175.method3529((float) var34 * var13 + var33, -78);
                            this.field1175.method3060(var27, -25098);
                            this.field1175.method3060(var28, -25098);
                            this.field1175.method3060(var29, -25098);
                            this.field1175.method3060(var30, -25098);
                            this.field1175.method3529(0.0F, -97);
                            this.field1175.method3529(1.0F, -111);
                            this.field1175.method3529((float) var34 * var17 + var31, -82);
                            this.field1175.method3529((float) var34 * var18 + var32, -123);
                            this.field1175.method3529((float) var34 * var19 + var33, -38);
                            this.field1175.method3060(var27, -25098);
                            this.field1175.method3060(var28, -25098);
                            this.field1175.method3060(var29, -25098);
                            this.field1175.method3060(var30, -25098);
                        }
                    }
                }
            }
        }
        if (this.field1175.field7707 != 0) {
            this.field1183.method866(-3211, this.field1175.field7693, 24, this.field1175.field7707);
            arg1.method1924(this.field1187, 0, this.field1186, null, this.field1184);
            arg1.method1964(this.field1175.field7707 / 24, 0, (byte) 114, 7);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ZLjj;)I")
    public static final int method496(boolean arg0, class66 arg1) {
        field1180++;
        int var2 = arg1.method377(8, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method377(8, 5);
        } else if (var2 == 2) {
            var3 = arg1.method377(8, 8);
        } else {
            var3 = arg1.method377(8, 11);
        }
        if (!arg0) {
            method491(28, 94);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Luq;I)V")
    public final void method497(class313 arg0, int arg1) {
        field1181++;
        this.field1183 = arg0.method1926(8771, null, 24, true, 196584);
        this.field1187 = new class86(this.field1183, 5126, 2, 0);
        this.field1186 = new class86(this.field1183, 5126, 3, 8);
        this.field1184 = new class86(this.field1183, arg1, 4, 20);
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lkw;ILuq;)V")
    public final void method498(class174 arg0, int arg1, class313 arg2) {
        if (arg1 != -1) {
            return;
        }
        field1179++;
        if (arg2.field4323 == null) {
            return;
        }
        this.method494(false, arg2);
        float var4 = arg2.field4323.field5533;
        float var5 = arg2.field4323.field5538;
        float var6 = arg2.field4323.field5521;
        float var7 = arg2.field4323.field5546;
        try {
            if (arg0.field2256) {
                int var8 = arg0.field2255 - arg0.field2257;
                int var9;
                if (var8 + 2 > 1600) {
                    var9 = class330.method2080((byte) -115, var8) + 1 - this.field1185;
                    var8 = (var8 >> var9) + 2;
                } else {
                    var8 += 2;
                    var9 = 0;
                }
                class608 var10 = arg0.field2253.field2529;
                class608 var11 = var10.field8742;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field1195 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field1192[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field1191[var16] = 0;
                    }
                    while (var10 != var11) {
                        class2 var17 = (class2) var11;
                        if (var14) {
                            var14 = false;
                            var13 = var17.field10;
                            var12 = var17.field15;
                        } else if (var17.field15 != var12 || var17.field10 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field14 >> 12) * var6 + (float) (var17.field17 >> 12) * var5 + (float) (var17.field16 >> 12) * var4 + var7) - arg0.field2257 >> var9;
                        if (var18 < 1600) {
                            if (this.field1192[var18] >= 64) {
                                label194: {
                                    if (this.field1192[var18] == 64) {
                                        if (this.field1195 == 64) {
                                            break label194;
                                        }
                                        this.field1192[var18] += (this.field1195++) + 1;
                                    }
                                    this.field1194[this.field1192[var18] - 64 - 1][this.field1191[this.field1192[var18] - 1 - 64]++] = var17;
                                }
                            } else {
                                this.field1193[var18][this.field1192[var18]++] = var17;
                            }
                        }
                        var11 = var11.field8742;
                    }
                    if (var12 < 0) {
                        arg2.method1960(-1, 2);
                    } else {
                        arg2.method1960(var12, 2);
                    }
                    if (var13 && class339.field4731 != arg2.field4264) {
                        arg2.method993(class339.field4731);
                    } else if (arg2.field4264 != 1.0F) {
                        arg2.method993(1.0F);
                    }
                    this.method495(arg1 + 68, arg2, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class608 var22 = arg0.field2253.field2529;
                for (class608 var23 = var22.field8742; var23 != var22; var23 = var23.field8742) {
                    class2 var24 = (class2) var23;
                    int var25 = (int) ((float) (var24.field14 >> 12) * var6 + (float) (var24.field17 >> 12) * var5 + (float) (var24.field16 >> 12) * var4 + var7);
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    this.field1189[var19++] = var25;
                    if (var20 > var25) {
                        var20 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 <= 1600) {
                    var26 += 2;
                    var27 = 0;
                } else {
                    var27 = class330.method2080((byte) -95, var26) + 1 - this.field1185;
                    var26 = (var26 >> var27) + 2;
                }
                int var28 = 0;
                class608 var29 = var22.field8742;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field1195 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field1192[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field1191[var34] = 0;
                    }
                    while (var22 != var29) {
                        class2 var35 = (class2) var29;
                        if (var32) {
                            var30 = var35.field15;
                            var32 = false;
                            var31 = var35.field10;
                        }
                        if (var28 > 0 && (var35.field15 != var30 || var35.field10 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field1189[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field1192[var36] >= 64) {
                                label145: {
                                    if (this.field1192[var36] == 64) {
                                        if (this.field1195 == 64) {
                                            break label145;
                                        }
                                        this.field1192[var36] += this.field1195++ + 1;
                                    }
                                    this.field1194[this.field1192[var36] - 64 - 1][this.field1191[this.field1192[var36] - 64 - 1]++] = var35;
                                }
                            } else {
                                this.field1193[var36][this.field1192[var36]++] = var35;
                            }
                        }
                        var29 = var29.field8742;
                    }
                    if (var30 < 0) {
                        arg2.method1960(-1, 2);
                    } else {
                        arg2.method1960(var30, arg1 + 3);
                    }
                    if (var31 && class339.field4731 != arg2.field4264) {
                        arg2.method993(class339.field4731);
                    } else if (arg2.field4264 != 1.0F) {
                        arg2.method993(1.0F);
                    }
                    this.method495(90, arg2, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method492(-27582, arg2);
    }
}
