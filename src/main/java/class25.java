import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class25 {

    @OriginalMember(owner = "client!as", name = "d", descriptor = "[F")
    private float[] field211 = new float[16];

    @OriginalMember(owner = "client!as", name = "b", descriptor = "Lnea;")
    private class209 field209 = new class209(786336);

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    private int field220 = class258.method1532(1600, false);

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    private int field226 = 0;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "[I")
    private int[] field228 = new int[8191];

    @OriginalMember(owner = "client!as", name = "v", descriptor = "[I")
    private int[] field229 = new int[1600];

    @OriginalMember(owner = "client!as", name = "w", descriptor = "[I")
    private int[] field230 = new int[64];

    @OriginalMember(owner = "client!as", name = "t", descriptor = "[[Led;")
    private class119[][] field227 = new class119[64][768];

    @OriginalMember(owner = "client!as", name = "x", descriptor = "[[Led;")
    private class119[][] field231 = new class119[1600][64];

    @OriginalMember(owner = "client!as", name = "k", descriptor = "Lbs;")
    public static class215 field218 = new class215();

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "Lut;")
    private class199 field219;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Lhea;")
    private class351 field221;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "Lhea;")
    private class351 field222;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "Lhea;")
    private class351 field225;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "Ltf;")
    public static class701 field217;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lvj;II)V")
    private final void method130(class422 arg0, int arg1, int arg2) {
        class26.field250 = arg0.field5949;
        field212++;
        arg0.method2376((byte) -123, (float) arg1);
        if (arg2 != -1551960848) {
            this.field230 = null;
        }
        arg0.method2432(16);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method2358(false, (byte) -121);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILtf;ILtf;)V")
    public static final void method131(int arg0, class701 arg1, int arg2, class701 arg3) {
        int var4 = 47 % ((-arg2 - 26) / 45);
        class503.field7255 = arg3;
        field214++;
        class140.field1551 = arg1;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IILvj;)V")
    private final void method132(int arg0, int arg1, class422 arg2) {
        OpenGL.glGetFloatv(2982, this.field211, 0);
        field223++;
        float var4 = this.field211[0];
        if (arg1 != 32643) {
            this.field231 = null;
        }
        float var5 = this.field211[4];
        float var6 = this.field211[8];
        float var7 = this.field211[1];
        float var8 = this.field211[5];
        float var9 = this.field211[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field209.field1218 = 0;
        float var18 = var9 - var6;
        if (arg2.field5874) {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field229[var44] > 64 ? 64 : this.field229[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class119 var59 = this.field231[var44][var46];
                        int var60 = var59.field1330;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field1337 >> 12);
                        float var66 = (float) (var59.field1328 >> 12);
                        float var67 = (float) (var59.field1335 >> 12);
                        int var68 = var59.field1333 >> 12;
                        this.field209.method1242(-12989, 0.0F);
                        this.field209.method1242(-12989, 0.0F);
                        this.field209.method1242(-12989, (float) (-var68) * var10 + var65);
                        this.field209.method1242(-12989, (float) (-var68) * var11 + var66);
                        this.field209.method1242(arg1 - 45632, (float) (-var68) * var12 + var67);
                        this.field209.method658(var61, (byte) 126);
                        this.field209.method658(var62, (byte) 104);
                        this.field209.method658(var63, (byte) 112);
                        this.field209.method658(var64, (byte) 74);
                        this.field209.method1242(arg1 ^ 0xFFFFB2C0, 1.0F);
                        this.field209.method1242(-12989, 0.0F);
                        this.field209.method1242(-12989, (float) var68 * var13 + var65);
                        this.field209.method1242(-12989, (float) var68 * var14 + var66);
                        this.field209.method1242(-12989, (float) var68 * var15 + var67);
                        this.field209.method658(var61, (byte) 64);
                        this.field209.method658(var62, (byte) 68);
                        this.field209.method658(var63, (byte) 90);
                        this.field209.method658(var64, (byte) 81);
                        this.field209.method1242(-12989, 1.0F);
                        this.field209.method1242(-12989, 1.0F);
                        this.field209.method1242(-12989, (float) var68 * var10 + var65);
                        this.field209.method1242(-12989, (float) var68 * var11 + var66);
                        this.field209.method1242(-12989, (float) var68 * var12 + var67);
                        this.field209.method658(var61, (byte) 102);
                        this.field209.method658(var62, (byte) 106);
                        this.field209.method658(var63, (byte) 83);
                        this.field209.method658(var64, (byte) 74);
                        this.field209.method1242(-12989, 0.0F);
                        this.field209.method1242(arg1 - 45632, 1.0F);
                        this.field209.method1242(-12989, (float) var68 * var16 + var65);
                        this.field209.method1242(-12989, (float) var68 * var17 + var66);
                        this.field209.method1242(-12989, (float) var68 * var18 + var67);
                        this.field209.method658(var61, (byte) 114);
                        this.field209.method658(var62, (byte) 93);
                        this.field209.method658(var63, (byte) 55);
                        this.field209.method658(var64, (byte) 108);
                    }
                    if (this.field229[var44] > 64) {
                        int var47 = this.field229[var44] - 1 - 64;
                        for (int var48 = this.field230[var47] - 1; var48 >= 0; var48--) {
                            class119 var49 = this.field227[var47][var48];
                            int var50 = var49.field1330;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field1337 >> 12);
                            float var56 = (float) (var49.field1328 >> 12);
                            float var57 = (float) (var49.field1335 >> 12);
                            int var58 = var49.field1333 >> 12;
                            this.field209.method1242(-12989, 0.0F);
                            this.field209.method1242(-12989, 0.0F);
                            this.field209.method1242(-12989, (float) (-var58) * var10 + var55);
                            this.field209.method1242(-12989, (float) (-var58) * var11 + var56);
                            this.field209.method1242(-12989, (float) (-var58) * var12 + var57);
                            this.field209.method658(var51, (byte) 105);
                            this.field209.method658(var52, (byte) 49);
                            this.field209.method658(var53, (byte) 66);
                            this.field209.method658(var54, (byte) 92);
                            this.field209.method1242(-12989, 1.0F);
                            this.field209.method1242(-12989, 0.0F);
                            this.field209.method1242(-12989, (float) var58 * var13 + var55);
                            this.field209.method1242(-12989, (float) var58 * var14 + var56);
                            this.field209.method1242(-12989, (float) var58 * var15 + var57);
                            this.field209.method658(var51, (byte) 125);
                            this.field209.method658(var52, (byte) 104);
                            this.field209.method658(var53, (byte) 63);
                            this.field209.method658(var54, (byte) 73);
                            this.field209.method1242(-12989, 1.0F);
                            this.field209.method1242(arg1 ^ 0xFFFFB2C0, 1.0F);
                            this.field209.method1242(-12989, (float) var58 * var10 + var55);
                            this.field209.method1242(-12989, (float) var58 * var11 + var56);
                            this.field209.method1242(arg1 ^ 0xFFFFB2C0, (float) var58 * var12 + var57);
                            this.field209.method658(var51, (byte) 70);
                            this.field209.method658(var52, (byte) 79);
                            this.field209.method658(var53, (byte) 88);
                            this.field209.method658(var54, (byte) 127);
                            this.field209.method1242(-12989, 0.0F);
                            this.field209.method1242(arg1 ^ 0xFFFFB2C0, 1.0F);
                            this.field209.method1242(arg1 ^ 0xFFFFB2C0, (float) var58 * var16 + var55);
                            this.field209.method1242(-12989, (float) var58 * var17 + var56);
                            this.field209.method1242(-12989, (float) var58 * var18 + var57);
                            this.field209.method658(var51, (byte) 96);
                            this.field209.method658(var52, (byte) 103);
                            this.field209.method658(var53, (byte) 109);
                            this.field209.method658(var54, (byte) 98);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field229[var19] > 64 ? 64 : this.field229[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class119 var34 = this.field231[var19][var21];
                        int var35 = var34.field1330;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field1337 >> 12);
                        float var41 = (float) (var34.field1328 >> 12);
                        float var42 = (float) (var34.field1335 >> 12);
                        int var43 = var34.field1333 >> 12;
                        this.field209.method1243(86, 0.0F);
                        this.field209.method1243(112, 0.0F);
                        this.field209.method1243(45, (float) (-var43) * var10 + var40);
                        this.field209.method1243(55, (float) (-var43) * var11 + var41);
                        this.field209.method1243(52, (float) (-var43) * var12 + var42);
                        this.field209.method658(var36, (byte) 125);
                        this.field209.method658(var37, (byte) 113);
                        this.field209.method658(var38, (byte) 113);
                        this.field209.method658(var39, (byte) 63);
                        this.field209.method1243(49, 1.0F);
                        this.field209.method1243(93, 0.0F);
                        this.field209.method1243(81, (float) var43 * var13 + var40);
                        this.field209.method1243(59, (float) var43 * var14 + var41);
                        this.field209.method1243(arg1 ^ 0x7FE3, (float) var43 * var15 + var42);
                        this.field209.method658(var36, (byte) 61);
                        this.field209.method658(var37, (byte) 90);
                        this.field209.method658(var38, (byte) 95);
                        this.field209.method658(var39, (byte) 88);
                        this.field209.method1243(arg1 - 32584, 1.0F);
                        this.field209.method1243(123, 1.0F);
                        this.field209.method1243(arg1 ^ 0x7FC9, (float) var43 * var10 + var40);
                        this.field209.method1243(126, (float) var43 * var11 + var41);
                        this.field209.method1243(50, (float) var43 * var12 + var42);
                        this.field209.method658(var36, (byte) 118);
                        this.field209.method658(var37, (byte) 112);
                        this.field209.method658(var38, (byte) 103);
                        this.field209.method658(var39, (byte) 76);
                        this.field209.method1243(81, 0.0F);
                        this.field209.method1243(126, 1.0F);
                        this.field209.method1243(59, (float) var43 * var16 + var40);
                        this.field209.method1243(74, (float) var43 * var17 + var41);
                        this.field209.method1243(69, (float) var43 * var18 + var42);
                        this.field209.method658(var36, (byte) 110);
                        this.field209.method658(var37, (byte) 84);
                        this.field209.method658(var38, (byte) 102);
                        this.field209.method658(var39, (byte) 102);
                    }
                    if (this.field229[var19] > 64) {
                        int var22 = this.field229[var19] - 64 - 1;
                        for (int var23 = this.field230[var22] - 1; var23 >= 0; var23--) {
                            class119 var24 = this.field227[var22][var23];
                            int var25 = var24.field1330;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field1337 >> 12);
                            float var31 = (float) (var24.field1328 >> 12);
                            float var32 = (float) (var24.field1335 >> 12);
                            int var33 = var24.field1333 >> 12;
                            this.field209.method1243(118, 0.0F);
                            this.field209.method1243(114, 0.0F);
                            this.field209.method1243(75, (float) (-var33) * var10 + var30);
                            this.field209.method1243(arg1 ^ 0x7FCA, (float) (-var33) * var11 + var31);
                            this.field209.method1243(arg1 ^ 0x7FAB, (float) (-var33) * var12 + var32);
                            this.field209.method658(var26, (byte) 78);
                            this.field209.method658(var27, (byte) 105);
                            this.field209.method658(var28, (byte) 118);
                            this.field209.method658(var29, (byte) 92);
                            this.field209.method1243(111, 1.0F);
                            this.field209.method1243(arg1 ^ 0x7FE9, 0.0F);
                            this.field209.method1243(72, (float) var33 * var13 + var30);
                            this.field209.method1243(127, (float) var33 * var14 + var31);
                            this.field209.method1243(99, (float) var33 * var15 + var32);
                            this.field209.method658(var26, (byte) 112);
                            this.field209.method658(var27, (byte) 61);
                            this.field209.method658(var28, (byte) 61);
                            this.field209.method658(var29, (byte) 85);
                            this.field209.method1243(86, 1.0F);
                            this.field209.method1243(39, 1.0F);
                            this.field209.method1243(96, (float) var33 * var10 + var30);
                            this.field209.method1243(90, (float) var33 * var11 + var31);
                            this.field209.method1243(111, (float) var33 * var12 + var32);
                            this.field209.method658(var26, (byte) 81);
                            this.field209.method658(var27, (byte) 79);
                            this.field209.method658(var28, (byte) 53);
                            this.field209.method658(var29, (byte) 94);
                            this.field209.method1243(arg1 ^ 0x7FDD, 0.0F);
                            this.field209.method1243(78, 1.0F);
                            this.field209.method1243(37, (float) var33 * var16 + var30);
                            this.field209.method1243(arg1 - 32518, (float) var33 * var17 + var31);
                            this.field209.method1243(arg1 ^ 0x7FD6, (float) var33 * var18 + var32);
                            this.field209.method658(var26, (byte) 124);
                            this.field209.method658(var27, (byte) 105);
                            this.field209.method658(var28, (byte) 87);
                            this.field209.method658(var29, (byte) 86);
                        }
                    }
                }
            }
        }
        if (this.field209.field1218 != 0) {
            this.field219.method610(13506, this.field209.field1218, this.field209.field1269, 24);
            arg2.method2419(this.field221, 111, this.field222, this.field225, null);
            arg2.method2378(7, 0, this.field209.field1218 / 24, 0);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIII)V")
    public static final void method133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class360.field4834 >= arg0 && class93.field949 <= arg3) {
            boolean var6;
            if (arg5 < class412.field5526) {
                var6 = false;
                arg5 = class412.field5526;
            } else if (class72.field740 >= arg5) {
                var6 = true;
            } else {
                var6 = false;
                arg5 = class72.field740;
            }
            boolean var7;
            if (arg2 < class412.field5526) {
                var7 = false;
                arg2 = class412.field5526;
            } else if (arg2 > class72.field740) {
                arg2 = class72.field740;
                var7 = false;
            } else {
                var7 = true;
            }
            if (arg0 >= class93.field949) {
                class315.method1809(class557.field7954[arg0++], arg4, -128, arg5, arg2);
            } else {
                arg0 = class93.field949;
            }
            if (class360.field4834 >= arg3) {
                class315.method1809(class557.field7954[arg3--], arg4, -128, arg5, arg2);
            } else {
                arg3 = class360.field4834;
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg3; var8++) {
                    int[] var9 = class557.field7954[var8];
                    var9[arg5] = var9[arg2] = arg4;
                }
            } else if (var6) {
                for (int var10 = arg0; var10 <= arg3; var10++) {
                    class557.field7954[var10][arg5] = arg4;
                }
            } else if (var7) {
                for (int var11 = arg0; var11 <= arg3; var11++) {
                    class557.field7954[var11][arg2] = arg4;
                }
            }
        }
        field210++;
        if (arg1 != 801853752) {
            method134(41);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static void method134(int arg0) {
        if (arg0 > -32) {
            method134(-72);
        }
        field218 = null;
        field217 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BLvj;)V")
    private final void method135(byte arg0, class422 arg1) {
        class26.field250 = arg1.field5949;
        field215++;
        arg1.method2414(-127);
        OpenGL.glDisable(16384);
        if (arg0 != 4) {
            this.field221 = null;
        }
        OpenGL.glDisable(16385);
        arg1.method2358(false, (byte) -96);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILvj;)V")
    public final void method136(int arg0, class422 arg1) {
        field216++;
        this.field219 = arg1.method2438(null, 24, (byte) -75, true, 196584);
        this.field225 = new class351(this.field219, 5126, arg0, 0);
        this.field221 = new class351(this.field219, 5126, 3, 8);
        this.field222 = new class351(this.field219, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lqw;ILvj;I)V")
    public final void method137(class332 arg0, int arg1, class422 arg2, int arg3) {
        field213++;
        if (arg2.field5854 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method130(arg2, arg1, arg3 - 1551960864);
        } else {
            this.method135((byte) 4, arg2);
        }
        float var5 = arg2.field5854.field2102;
        if (arg3 != 16) {
            this.method135((byte) -19, null);
        }
        float var6 = arg2.field5854.field2103;
        float var7 = arg2.field5854.field2101;
        float var8 = arg2.field5854.field2072;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class536 var12 = arg0.field4171.field760;
            for (class536 var13 = var12.field7499; var13 != var12; var13 = var13.field7499) {
                class119 var14 = (class119) var13;
                int var15 = (int) ((float) (var14.field1335 >> 12) * var7 + (float) (var14.field1337 >> 12) * var5 + (float) (var14.field1328 >> 12) * var6 + var8);
                if (var15 < var10) {
                    var10 = var15;
                }
                if (var11 < var15) {
                    var11 = var15;
                }
                this.field228[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = 1 - (this.field220 - class258.method1532(var16, false));
                var16 = (var16 >> var17) + 2;
            }
            class536 var18 = var12.field7499;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field226 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field229[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field230[var24] = 0;
                }
                while (var12 != var18) {
                    class119 var25 = (class119) var18;
                    if (var22) {
                        var21 = var25.field1332;
                        var22 = false;
                        var20 = var25.field1331;
                    }
                    if (var19 > 0 && (var25.field1331 != var20 || var21 != var25.field1332)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field228[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field229[var26] >= 64) {
                            label102: {
                                if (this.field229[var26] == 64) {
                                    if (this.field226 == 64) {
                                        break label102;
                                    }
                                    this.field229[var26] += this.field226++ + 1;
                                }
                                this.field227[this.field229[var26] - 1 - 64][this.field230[this.field229[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field231[var26][this.field229[var26]++] = var25;
                        }
                    }
                    var18 = var18.field7499;
                }
                if (var20 >= 0) {
                    arg2.method2426(arg3 + 91, var20);
                } else {
                    arg2.method2426(113, -1);
                }
                if (var21 && class26.field250 != arg2.field5949) {
                    arg2.method949(class26.field250);
                } else if (arg2.field5949 != 1.0F) {
                    arg2.method949(1.0F);
                }
                this.method132(var16, 32643, arg2);
            }
        } catch (Exception var27) {
        }
        this.method138(arg2, -31812);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lvj;I)V")
    private final void method138(class422 arg0, int arg1) {
        arg0.method2358(true, (byte) -96);
        if (arg1 != -31812) {
            this.field227 = null;
        }
        field208++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class26.field250 != arg0.field5949) {
            arg0.method949(class26.field250);
        }
    }
}
