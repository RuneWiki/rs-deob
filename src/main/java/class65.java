import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class65 {

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "[F")
    private float[] field847 = new float[16];

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lqca;")
    private class333 field849 = new class333(786336);

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    private int field855 = class194.method1347(1600, true);

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "[I")
    private int[] field860 = new int[1600];

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "[[Lia;")
    private class165[][] field859 = new class165[1600][64];

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    private int field858 = 0;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "[[Lia;")
    private class165[][] field862 = new class165[64][768];

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "[I")
    private int[] field861 = new int[64];

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "[I")
    private int[] field863 = new int[8191];

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "Ldea;")
    private class375 field854;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Ldea;")
    private class375 field856;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "Ldea;")
    private class375 field857;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Lnk;")
    private class447 field853;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lck;I)V", line = 15)
    private final void method378(class733 arg0, int arg1) {
        field850++;
        class745.field10185 = arg0.field9870;
        arg0.method3950(-106);
        OpenGL.glDisable(arg1);
        OpenGL.glDisable(16385);
        arg0.method3986((byte) -124, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lck;Z)V", line = 35)
    public final void method379(class733 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field843++;
        this.field853 = arg0.method3912(null, true, 196584, 24, 1365);
        this.field857 = new class375(this.field853, 5126, 2, 0);
        this.field854 = new class375(this.field853, 5126, 3, 8);
        this.field856 = new class375(this.field853, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILck;I)V", line = 50)
    private final void method380(int arg0, class733 arg1, int arg2) {
        field845++;
        OpenGL.glGetFloatv(2982, this.field847, 0);
        float var4 = this.field847[0];
        float var5 = this.field847[4];
        float var6 = this.field847[8];
        float var7 = this.field847[1];
        float var8 = this.field847[5];
        float var9 = this.field847[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        if (arg0 != 885) {
            this.method382((byte) -36, null, 58);
        }
        this.field849.field3133 = 0;
        float var18 = var9 - var6;
        if (arg1.field9865) {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field860[var19] > 64 ? 64 : this.field860[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class165 var34 = this.field859[var19][var21];
                        int var35 = var34.field2191;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field2187 >> 12);
                        float var41 = (float) (var34.field2190 >> 12);
                        float var42 = (float) (var34.field2185 >> 12);
                        int var43 = var34.field2192 >> 12;
                        this.field849.method1926((byte) -123, 0.0F);
                        this.field849.method1926((byte) 123, 0.0F);
                        this.field849.method1926((byte) 11, (float) (-var43) * var10 + var40);
                        this.field849.method1926((byte) 69, (float) (-var43) * var11 + var41);
                        this.field849.method1926((byte) 122, (float) (-var43) * var12 + var42);
                        this.field849.method1491(-129, var36);
                        this.field849.method1491(arg0 ^ 0xFFFFFC0A, var37);
                        this.field849.method1491(-129, var38);
                        this.field849.method1491(-129, var39);
                        this.field849.method1926((byte) 68, 1.0F);
                        this.field849.method1926((byte) -128, 0.0F);
                        this.field849.method1926((byte) -124, (float) var43 * var13 + var40);
                        this.field849.method1926((byte) -125, (float) var43 * var14 + var41);
                        this.field849.method1926((byte) 93, (float) var43 * var15 + var42);
                        this.field849.method1491(-129, var36);
                        this.field849.method1491(-129, var37);
                        this.field849.method1491(-129, var38);
                        this.field849.method1491(-129, var39);
                        this.field849.method1926((byte) 100, 1.0F);
                        this.field849.method1926((byte) -122, 1.0F);
                        this.field849.method1926((byte) 31, (float) var43 * var10 + var40);
                        this.field849.method1926((byte) -128, (float) var43 * var11 + var41);
                        this.field849.method1926((byte) 111, (float) var43 * var12 + var42);
                        this.field849.method1491(arg0 - 1014, var36);
                        this.field849.method1491(-129, var37);
                        this.field849.method1491(-129, var38);
                        this.field849.method1491(-129, var39);
                        this.field849.method1926((byte) 102, 0.0F);
                        this.field849.method1926((byte) 119, 1.0F);
                        this.field849.method1926((byte) -123, (float) var43 * var16 + var40);
                        this.field849.method1926((byte) -126, (float) var43 * var17 + var41);
                        this.field849.method1926((byte) -121, (float) var43 * var18 + var42);
                        this.field849.method1491(-129, var36);
                        this.field849.method1491(arg0 - 1014, var37);
                        this.field849.method1491(-129, var38);
                        this.field849.method1491(-129, var39);
                    }
                    if (this.field860[var19] > 64) {
                        int var22 = this.field860[var19] - 64 - 1;
                        for (int var23 = this.field861[var22] - 1; var23 >= 0; var23--) {
                            class165 var24 = this.field862[var22][var23];
                            int var25 = var24.field2191;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field2187 >> 12);
                            float var31 = (float) (var24.field2190 >> 12);
                            float var32 = (float) (var24.field2185 >> 12);
                            int var33 = var24.field2192 >> 12;
                            this.field849.method1926((byte) 102, 0.0F);
                            this.field849.method1926((byte) -128, 0.0F);
                            this.field849.method1926((byte) 73, (float) (-var33) * var10 + var30);
                            this.field849.method1926((byte) -122, (float) (-var33) * var11 + var31);
                            this.field849.method1926((byte) 70, (float) (-var33) * var12 + var32);
                            this.field849.method1491(-129, var26);
                            this.field849.method1491(arg0 ^ 0xFFFFFC0A, var27);
                            this.field849.method1491(-129, var28);
                            this.field849.method1491(-129, var29);
                            this.field849.method1926((byte) -128, 1.0F);
                            this.field849.method1926((byte) -125, 0.0F);
                            this.field849.method1926((byte) -121, (float) var33 * var13 + var30);
                            this.field849.method1926((byte) 104, (float) var33 * var14 + var31);
                            this.field849.method1926((byte) -127, (float) var33 * var15 + var32);
                            this.field849.method1491(arg0 ^ 0xFFFFFC0A, var26);
                            this.field849.method1491(-129, var27);
                            this.field849.method1491(-129, var28);
                            this.field849.method1491(-129, var29);
                            this.field849.method1926((byte) -126, 1.0F);
                            this.field849.method1926((byte) 78, 1.0F);
                            this.field849.method1926((byte) 38, (float) var33 * var10 + var30);
                            this.field849.method1926((byte) 57, (float) var33 * var11 + var31);
                            this.field849.method1926((byte) -127, (float) var33 * var12 + var32);
                            this.field849.method1491(-129, var26);
                            this.field849.method1491(-129, var27);
                            this.field849.method1491(-129, var28);
                            this.field849.method1491(-129, var29);
                            this.field849.method1926((byte) 102, 0.0F);
                            this.field849.method1926((byte) 61, 1.0F);
                            this.field849.method1926((byte) 110, (float) var33 * var16 + var30);
                            this.field849.method1926((byte) -124, (float) var33 * var17 + var31);
                            this.field849.method1926((byte) -124, (float) var33 * var18 + var32);
                            this.field849.method1491(-129, var26);
                            this.field849.method1491(arg0 - 1014, var27);
                            this.field849.method1491(-129, var28);
                            this.field849.method1491(-129, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field860[var44] <= 64 ? this.field860[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class165 var59 = this.field859[var44][var46];
                        int var60 = var59.field2191;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field2187 >> 12);
                        float var66 = (float) (var59.field2190 >> 12);
                        float var67 = (float) (var59.field2185 >> 12);
                        int var68 = var59.field2192 >> 12;
                        this.field849.method1923(0.0F, arg0 - 2061506693);
                        this.field849.method1923(0.0F, -2061505808);
                        this.field849.method1923((float) (-var68) * var10 + var65, arg0 ^ 0x851FE985);
                        this.field849.method1923((float) (-var68) * var11 + var66, -2061505808);
                        this.field849.method1923((float) (-var68) * var12 + var67, -2061505808);
                        this.field849.method1491(-129, var61);
                        this.field849.method1491(-129, var62);
                        this.field849.method1491(-129, var63);
                        this.field849.method1491(-129, var64);
                        this.field849.method1923(1.0F, -2061505808);
                        this.field849.method1923(0.0F, -2061505808);
                        this.field849.method1923((float) var68 * var13 + var65, -2061505808);
                        this.field849.method1923((float) var68 * var14 + var66, -2061505808);
                        this.field849.method1923((float) var68 * var15 + var67, -2061505808);
                        this.field849.method1491(-129, var61);
                        this.field849.method1491(arg0 - 1014, var62);
                        this.field849.method1491(arg0 ^ 0xFFFFFC0A, var63);
                        this.field849.method1491(-129, var64);
                        this.field849.method1923(1.0F, -2061505808);
                        this.field849.method1923(1.0F, -2061505808);
                        this.field849.method1923((float) var68 * var10 + var65, -2061505808);
                        this.field849.method1923((float) var68 * var11 + var66, -2061505808);
                        this.field849.method1923((float) var68 * var12 + var67, -2061505808);
                        this.field849.method1491(-129, var61);
                        this.field849.method1491(arg0 - 1014, var62);
                        this.field849.method1491(-129, var63);
                        this.field849.method1491(-129, var64);
                        this.field849.method1923(0.0F, -2061505808);
                        this.field849.method1923(1.0F, -2061505808);
                        this.field849.method1923((float) var68 * var16 + var65, -2061505808);
                        this.field849.method1923((float) var68 * var17 + var66, arg0 ^ 0x851FE985);
                        this.field849.method1923((float) var68 * var18 + var67, arg0 + -2061506693);
                        this.field849.method1491(-129, var61);
                        this.field849.method1491(arg0 - 1014, var62);
                        this.field849.method1491(-129, var63);
                        this.field849.method1491(-129, var64);
                    }
                    if (this.field860[var44] > 64) {
                        int var47 = this.field860[var44] - 1 - 64;
                        for (int var48 = this.field861[var47] - 1; var48 >= 0; var48--) {
                            class165 var49 = this.field862[var47][var48];
                            int var50 = var49.field2191;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field2187 >> 12);
                            float var56 = (float) (var49.field2190 >> 12);
                            float var57 = (float) (var49.field2185 >> 12);
                            int var58 = var49.field2192 >> 12;
                            this.field849.method1923(0.0F, -2061505808);
                            this.field849.method1923(0.0F, arg0 - 2061506693);
                            this.field849.method1923((float) (-var58) * var10 + var55, -2061505808);
                            this.field849.method1923((float) (-var58) * var11 + var56, -2061505808);
                            this.field849.method1923((float) (-var58) * var12 + var57, -2061505808);
                            this.field849.method1491(arg0 ^ 0xFFFFFC0A, var51);
                            this.field849.method1491(-129, var52);
                            this.field849.method1491(arg0 ^ 0xFFFFFC0A, var53);
                            this.field849.method1491(-129, var54);
                            this.field849.method1923(1.0F, arg0 - 2061506693);
                            this.field849.method1923(0.0F, arg0 - 2061506693);
                            this.field849.method1923((float) var58 * var13 + var55, arg0 ^ 0x851FE985);
                            this.field849.method1923((float) var58 * var14 + var56, -2061505808);
                            this.field849.method1923((float) var58 * var15 + var57, -2061505808);
                            this.field849.method1491(-129, var51);
                            this.field849.method1491(arg0 ^ 0xFFFFFC0A, var52);
                            this.field849.method1491(arg0 - 1014, var53);
                            this.field849.method1491(arg0 ^ 0xFFFFFC0A, var54);
                            this.field849.method1923(1.0F, arg0 - 2061506693);
                            this.field849.method1923(1.0F, arg0 ^ 0x851FE985);
                            this.field849.method1923((float) var58 * var10 + var55, -2061505808);
                            this.field849.method1923((float) var58 * var11 + var56, -2061505808);
                            this.field849.method1923((float) var58 * var12 + var57, arg0 ^ 0x851FE985);
                            this.field849.method1491(-129, var51);
                            this.field849.method1491(arg0 - 1014, var52);
                            this.field849.method1491(-129, var53);
                            this.field849.method1491(arg0 ^ 0xFFFFFC0A, var54);
                            this.field849.method1923(0.0F, arg0 - 2061506693);
                            this.field849.method1923(1.0F, -2061505808);
                            this.field849.method1923((float) var58 * var16 + var55, -2061505808);
                            this.field849.method1923((float) var58 * var17 + var56, -2061505808);
                            this.field849.method1923((float) var58 * var18 + var57, arg0 + -2061506693);
                            this.field849.method1491(-129, var51);
                            this.field849.method1491(arg0 ^ 0xFFFFFC0A, var52);
                            this.field849.method1491(-129, var53);
                            this.field849.method1491(-129, var54);
                        }
                    }
                }
            }
        }
        if (this.field849.field3133 != 0) {
            this.field853.method2561(this.field849.field3193, -124, this.field849.field3133, 24);
            arg1.method3947(this.field854, this.field857, this.field856, null, 32886);
            arg1.method3987(false, this.field849.field3133 / 24, 0, 7);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIBII)V", line = 406)
    public static final void method381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field844++;
        if (class683.method3667(arg1, -57)) {
            int var10 = 0;
            int var11 = 0;
            if (arg6 > 104) {
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                if (class602.field7657) {
                    var11 = class434.field5696;
                    var12 = class406.field5388;
                    var13 = class585.field7409;
                    var10 = class438.field5763;
                    var14 = class737.field9977;
                    class737.field9977 = 1;
                }
                if (class598.field7612[arg1] == null) {
                    class568.method3060(arg3, arg4, arg2, 1, arg7, -1, class647.field8259[arg1], arg8, arg0, arg4 < 0, arg5);
                } else {
                    class568.method3060(arg3, arg4, arg2, 1, arg7, -1, class598.field7612[arg1], arg8, arg0, arg4 < 0, arg5);
                }
                if (class602.field7657) {
                    if (arg4 >= 0 && class737.field9977 == 2) {
                        class548.method2967(class438.field5763, class585.field7409, class434.field5696, (byte) -110, class406.field5388);
                    }
                    class406.field5388 = var12;
                    class438.field5763 = var10;
                    class434.field5696 = var11;
                    class585.field7409 = var13;
                    class737.field9977 = var14;
                }
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class454.field5919[var9] = true;
            }
        } else {
            class454.field5919[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLck;I)V", line = 475)
    private final void method382(byte arg0, class733 arg1, int arg2) {
        class745.field10185 = arg1.field9870;
        field848++;
        arg1.method3968((byte) 84, (float) arg2);
        arg1.method3909(arg0 + 176);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        if (arg0 != -58) {
            this.field859 = null;
        }
        arg1.method3986((byte) -124, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lck;IBLwq;)V", line = 493)
    public final void method383(class733 arg0, int arg1, byte arg2, class705 arg3) {
        field851++;
        if (arg0.field9831 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method382((byte) -58, arg0, arg1);
        } else {
            this.method378(arg0, 16384);
        }
        float var5 = arg0.field9831.field1060;
        float var6 = arg0.field9831.field1063;
        float var7 = arg0.field9831.field1031;
        float var8 = arg0.field9831.field1035;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class411 var12 = arg3.field9317.field2337;
            for (class411 var13 = var12.field5451; var13 != var12; var13 = var13.field5451) {
                class165 var14 = (class165) var13;
                int var15 = (int) ((float) (var14.field2185 >> 12) * var7 + (float) (var14.field2190 >> 12) * var6 + (float) (var14.field2187 >> 12) * var5 + var8);
                if (var15 < var10) {
                    var10 = var15;
                }
                if (var11 < var15) {
                    var11 = var15;
                }
                this.field863[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class194.method1347(var16, true) + (1 - this.field855);
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class411 var19 = var12.field5451;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field858 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field860[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field861[var24] = 0;
                }
                while (var12 != var19) {
                    class165 var25 = (class165) var19;
                    if (var22) {
                        var21 = var25.field2193;
                        var20 = var25.field2186;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field2186 != var20 || var21 != var25.field2193)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field863[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field860[var26] < 64) {
                            this.field859[var26][this.field860[var26]++] = var25;
                        } else {
                            label106: {
                                if (this.field860[var26] == 64) {
                                    if (this.field858 == 64) {
                                        break label106;
                                    }
                                    this.field860[var26] += (this.field858++) + 1;
                                }
                                this.field862[this.field860[var26] - 1 - 64][this.field861[this.field860[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var19 = var19.field5451;
                }
                if (var20 < 0) {
                    arg0.method3935(-1, (byte) -42);
                } else {
                    arg0.method3935(var20, (byte) -42);
                }
                if (var21 && class745.field10185 != arg0.field9870) {
                    arg0.method946(class745.field10185);
                } else if (arg0.field9870 != 1.0F) {
                    arg0.method946(1.0F);
                }
                this.method380(885, arg0, var16);
            }
        } catch (Exception var28) {
        }
        int var27 = 95 / ((33 - arg2) / 50);
        this.method384(125, arg0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILck;)V", line = 657)
    private final void method384(int arg0, class733 arg1) {
        arg1.method3986((byte) -124, true);
        field846++;
        int var3 = -127 / ((42 - arg0) / 60);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class745.field10185 != arg1.field9870) {
            arg1.method946(class745.field10185);
        }
    }
}
