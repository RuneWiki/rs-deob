import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class616 {

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "[F")
    private float[] field8283 = new float[16];

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lwja;")
    private class283 field8276 = new class283(786336);

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    private int field8288 = class391.method2293((byte) -65, 1600);

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[[Lqg;")
    private class488[][] field8294 = new class488[1600][64];

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    private int field8296 = 0;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "[[Lqg;")
    private class488[][] field8298 = new class488[64][768];

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "[I")
    private int[] field8297 = new int[8191];

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
    private int[] field8295 = new int[1600];

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "[I")
    private int[] field8299 = new int[64];

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "J")
    public static long field8285 = 0L;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lde;")
    public static class558 field8277 = new class558("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "[Lsda;")
    public static class273[] field8293 = new class273[1024];

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lmga;")
    public static class738 field8291 = new class738();

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field8274;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field8278;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field8280;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Len;")
    private class339 field8289;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lsf;")
    private class550 field8287;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lsf;")
    private class550 field8290;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lsf;")
    private class550 field8292;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[Lsn;")
    public static class658[] field8286;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILpc;)V", line = 4)
    private final void method3484(int arg0, class700 arg1) {
        arg1.method3908(true, (byte) 123);
        field8280++;
        OpenGL.glEnable(arg0);
        OpenGL.glEnable(16385);
        if (class587.field7998 != arg1.field9850) {
            arg1.method626(class587.field7998);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lpc;I)V", line = 20)
    private final void method3485(class700 arg0, int arg1) {
        field8278++;
        class587.field7998 = arg0.field9850;
        arg0.method3942((byte) 126);
        OpenGL.glDisable(arg1);
        OpenGL.glDisable(16385);
        arg0.method3908(false, (byte) 124);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lpc;IILaf;)V", line = 35)
    public final void method3486(class700 arg0, int arg1, int arg2, class460 arg3) {
        field8281++;
        if (arg0.field9754 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method3491(arg2, arg0, 103);
        } else {
            this.method3485(arg0, 16384);
        }
        float var5 = arg0.field9754.field6007;
        float var6 = arg0.field9754.field5983;
        float var7 = arg0.field9754.field5977;
        float var8 = arg0.field9754.field5995;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class208 var12 = arg3.field6472.field1810;
            for (class208 var13 = var12.field2467; var13 != var12; var13 = var13.field2467) {
                class488 var14 = (class488) var13;
                int var15 = (int) ((float) (var14.field6821 >> 12) * var7 + (float) (var14.field6817 >> 12) * var6 + (float) (var14.field6812 >> 12) * var5 + var8);
                if (var10 > var15) {
                    var10 = var15;
                }
                this.field8297[var9++] = var15;
                if (var11 < var15) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = (class391.method2293((byte) 124, var16) - this.field8288) + 1;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class208 var19 = var12.field2467;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field8296 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field8295[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field8299[var24] = 0;
                }
                while (var12 != var19) {
                    class488 var25 = (class488) var19;
                    if (var22) {
                        var21 = var25.field6820;
                        var20 = var25.field6814;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field6814 != var20 || var25.field6820 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field8297[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field8295[var26] >= 64) {
                            label109: {
                                if (this.field8295[var26] == 64) {
                                    if (this.field8296 == 64) {
                                        break label109;
                                    }
                                    this.field8295[var26] += (this.field8296++) + 1;
                                }
                                class488[] var28 = this.field8298[this.field8295[var26] - 64 - 1];
                                int var10002 = this.field8295[var26] - 65;
                                int var10004 = this.field8299[this.field8295[var26] - 65];
                                this.field8299[var10002] = this.field8299[this.field8295[var26] - 65] + 1;
                                var28[var10004] = var25;
                            }
                        } else {
                            this.field8294[var26][this.field8295[var26]++] = var25;
                        }
                    }
                    var19 = var19.field2467;
                }
                if (var20 >= 0) {
                    arg0.method3901(var20, false);
                } else {
                    arg0.method3901(-1, false);
                }
                if (var21 && class587.field7998 != arg0.field9850) {
                    arg0.method626(class587.field7998);
                } else if (arg0.field9850 != 1.0F) {
                    arg0.method626(1.0F);
                }
                this.method3487(arg0, -65, var16);
            }
            if (arg1 <= 50) {
                method3489(true);
            }
        } catch (Exception var27) {
        }
        this.method3484(16384, arg0);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lpc;II)V", line = 198)
    private final void method3487(class700 arg0, int arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field8283, 0);
        field8284++;
        float var4 = this.field8283[0];
        float var5 = this.field8283[4];
        float var6 = this.field8283[8];
        float var7 = this.field8283[1];
        float var8 = this.field8283[5];
        if (arg1 != -65) {
            return;
        }
        float var9 = this.field8283[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field8276.field5262 = 0;
        if (arg0.field9772) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field8295[var44] <= 64 ? this.field8295[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class488 var59 = this.field8294[var44][var46];
                        int var60 = var59.field6816;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field6812 >> 12);
                        float var66 = (float) (var59.field6817 >> 12);
                        float var67 = (float) (var59.field6821 >> 12);
                        int var68 = var59.field6819 >> 12;
                        this.field8276.method1628(0.0F, arg1 + 8690);
                        this.field8276.method1628(0.0F, 8625);
                        this.field8276.method1628((float) (-var68) * var10 + var65, 8625);
                        this.field8276.method1628((float) (-var68) * var11 + var66, 8625);
                        this.field8276.method1628((float) (-var68) * var12 + var67, 8625);
                        this.field8276.method2353(-125, var61);
                        this.field8276.method2353(-75, var62);
                        this.field8276.method2353(-79, var63);
                        this.field8276.method2353(111, var64);
                        this.field8276.method1628(1.0F, arg1 ^ 0xFFFFDE0E);
                        this.field8276.method1628(0.0F, 8625);
                        this.field8276.method1628((float) var68 * var13 + var65, 8625);
                        this.field8276.method1628((float) var68 * var14 + var66, 8625);
                        this.field8276.method1628((float) var68 * var15 + var67, arg1 + 8690);
                        this.field8276.method2353(arg1 ^ 0x37, var61);
                        this.field8276.method2353(76, var62);
                        this.field8276.method2353(-76, var63);
                        this.field8276.method2353(110, var64);
                        this.field8276.method1628(1.0F, 8625);
                        this.field8276.method1628(1.0F, 8625);
                        this.field8276.method1628((float) var68 * var10 + var65, 8625);
                        this.field8276.method1628((float) var68 * var11 + var66, arg1 ^ 0xFFFFDE0E);
                        this.field8276.method1628((float) var68 * var12 + var67, 8625);
                        this.field8276.method2353(-98, var61);
                        this.field8276.method2353(-91, var62);
                        this.field8276.method2353(90, var63);
                        this.field8276.method2353(-71, var64);
                        this.field8276.method1628(0.0F, 8625);
                        this.field8276.method1628(1.0F, 8625);
                        this.field8276.method1628((float) var68 * var16 + var65, arg1 + 8690);
                        this.field8276.method1628((float) var68 * var17 + var66, arg1 ^ 0xFFFFDE0E);
                        this.field8276.method1628((float) var68 * var18 + var67, 8625);
                        this.field8276.method2353(-95, var61);
                        this.field8276.method2353(arg1 ^ 0x33, var62);
                        this.field8276.method2353(arg1 + 139, var63);
                        this.field8276.method2353(60, var64);
                    }
                    if (this.field8295[var44] > 64) {
                        int var47 = this.field8295[var44] - 64 - 1;
                        for (int var48 = this.field8299[var47] - 1; var48 >= 0; var48--) {
                            class488 var49 = this.field8298[var47][var48];
                            int var50 = var49.field6816;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field6812 >> 12);
                            float var56 = (float) (var49.field6817 >> 12);
                            float var57 = (float) (var49.field6821 >> 12);
                            int var58 = var49.field6819 >> 12;
                            this.field8276.method1628(0.0F, arg1 ^ 0xFFFFDE0E);
                            this.field8276.method1628(0.0F, 8625);
                            this.field8276.method1628((float) (-var58) * var10 + var55, 8625);
                            this.field8276.method1628((float) (-var58) * var11 + var56, 8625);
                            this.field8276.method1628((float) (-var58) * var12 + var57, 8625);
                            this.field8276.method2353(arg1 ^ 0xFFFFFFE5, var51);
                            this.field8276.method2353(arg1 - 56, var52);
                            this.field8276.method2353(88, var53);
                            this.field8276.method2353(arg1 + 123, var54);
                            this.field8276.method1628(1.0F, 8625);
                            this.field8276.method1628(0.0F, 8625);
                            this.field8276.method1628((float) var58 * var13 + var55, 8625);
                            this.field8276.method1628((float) var58 * var14 + var56, arg1 ^ 0xFFFFDE0E);
                            this.field8276.method1628((float) var58 * var15 + var57, 8625);
                            this.field8276.method2353(111, var51);
                            this.field8276.method2353(arg1 + 134, var52);
                            this.field8276.method2353(105, var53);
                            this.field8276.method2353(95, var54);
                            this.field8276.method1628(1.0F, 8625);
                            this.field8276.method1628(1.0F, 8625);
                            this.field8276.method1628((float) var58 * var10 + var55, 8625);
                            this.field8276.method1628((float) var58 * var11 + var56, 8625);
                            this.field8276.method1628((float) var58 * var12 + var57, arg1 + 8690);
                            this.field8276.method2353(-82, var51);
                            this.field8276.method2353(-73, var52);
                            this.field8276.method2353(115, var53);
                            this.field8276.method2353(arg1 - 36, var54);
                            this.field8276.method1628(0.0F, arg1 ^ 0xFFFFDE0E);
                            this.field8276.method1628(1.0F, arg1 ^ 0xFFFFDE0E);
                            this.field8276.method1628((float) var58 * var16 + var55, 8625);
                            this.field8276.method1628((float) var58 * var17 + var56, 8625);
                            this.field8276.method1628((float) var58 * var18 + var57, 8625);
                            this.field8276.method2353(arg1 - 56, var51);
                            this.field8276.method2353(arg1 + 191, var52);
                            this.field8276.method2353(-88, var53);
                            this.field8276.method2353(107, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field8295[var19] > 64 ? 64 : this.field8295[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class488 var34 = this.field8294[var19][var21];
                        int var35 = var34.field6816;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field6812 >> 12);
                        float var41 = (float) (var34.field6817 >> 12);
                        float var42 = (float) (var34.field6821 >> 12);
                        int var43 = var34.field6819 >> 12;
                        this.field8276.method1626(0.0F, arg1 - 44927543);
                        this.field8276.method1626(0.0F, -44927608);
                        this.field8276.method1626((float) (-var43) * var10 + var40, -44927608);
                        this.field8276.method1626((float) (-var43) * var11 + var41, -44927608);
                        this.field8276.method1626((float) (-var43) * var12 + var42, -44927608);
                        this.field8276.method2353(70, var36);
                        this.field8276.method2353(110, var37);
                        this.field8276.method2353(arg1 + 147, var38);
                        this.field8276.method2353(116, var39);
                        this.field8276.method1626(1.0F, -44927608);
                        this.field8276.method1626(0.0F, -44927608);
                        this.field8276.method1626((float) var43 * var13 + var40, arg1 ^ 0x2AD8A37);
                        this.field8276.method1626((float) var43 * var14 + var41, arg1 ^ 0x2AD8A37);
                        this.field8276.method1626((float) var43 * var15 + var42, -44927608);
                        this.field8276.method2353(arg1 ^ 0x12, var36);
                        this.field8276.method2353(arg1 - 9, var37);
                        this.field8276.method2353(arg1 ^ 0x12, var38);
                        this.field8276.method2353(-59, var39);
                        this.field8276.method1626(1.0F, arg1 - 44927543);
                        this.field8276.method1626(1.0F, -44927608);
                        this.field8276.method1626((float) var43 * var10 + var40, -44927608);
                        this.field8276.method1626((float) var43 * var11 + var41, -44927608);
                        this.field8276.method1626((float) var43 * var12 + var42, -44927608);
                        this.field8276.method2353(118, var36);
                        this.field8276.method2353(-57, var37);
                        this.field8276.method2353(arg1 + 190, var38);
                        this.field8276.method2353(102, var39);
                        this.field8276.method1626(0.0F, -44927608);
                        this.field8276.method1626(1.0F, arg1 ^ 0x2AD8A37);
                        this.field8276.method1626((float) var43 * var16 + var40, arg1 ^ 0x2AD8A37);
                        this.field8276.method1626((float) var43 * var17 + var41, -44927608);
                        this.field8276.method1626((float) var43 * var18 + var42, -44927608);
                        this.field8276.method2353(-127, var36);
                        this.field8276.method2353(arg1 ^ 0xFFFFFFC1, var37);
                        this.field8276.method2353(-100, var38);
                        this.field8276.method2353(-61, var39);
                    }
                    if (this.field8295[var19] > 64) {
                        int var22 = this.field8295[var19] - 1 - 64;
                        for (int var23 = this.field8299[var22] - 1; var23 >= 0; var23--) {
                            class488 var24 = this.field8298[var22][var23];
                            int var25 = var24.field6816;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field6812 >> 12);
                            float var31 = (float) (var24.field6817 >> 12);
                            float var32 = (float) (var24.field6821 >> 12);
                            int var33 = var24.field6819 >> 12;
                            this.field8276.method1626(0.0F, arg1 ^ 0x2AD8A37);
                            this.field8276.method1626(0.0F, -44927608);
                            this.field8276.method1626((float) (-var33) * var10 + var30, arg1 + -44927543);
                            this.field8276.method1626((float) (-var33) * var11 + var31, arg1 ^ 0x2AD8A37);
                            this.field8276.method1626((float) (-var33) * var12 + var32, arg1 + -44927543);
                            this.field8276.method2353(arg1 - 50, var26);
                            this.field8276.method2353(-106, var27);
                            this.field8276.method2353(127, var28);
                            this.field8276.method2353(arg1 + 174, var29);
                            this.field8276.method1626(1.0F, arg1 ^ 0x2AD8A37);
                            this.field8276.method1626(0.0F, -44927608);
                            this.field8276.method1626((float) var33 * var13 + var30, arg1 + -44927543);
                            this.field8276.method1626((float) var33 * var14 + var31, arg1 + -44927543);
                            this.field8276.method1626((float) var33 * var15 + var32, -44927608);
                            this.field8276.method2353(101, var26);
                            this.field8276.method2353(-100, var27);
                            this.field8276.method2353(arg1 ^ 0x25, var28);
                            this.field8276.method2353(106, var29);
                            this.field8276.method1626(1.0F, -44927608);
                            this.field8276.method1626(1.0F, -44927608);
                            this.field8276.method1626((float) var33 * var10 + var30, -44927608);
                            this.field8276.method1626((float) var33 * var11 + var31, arg1 ^ 0x2AD8A37);
                            this.field8276.method1626((float) var33 * var12 + var32, arg1 + -44927543);
                            this.field8276.method2353(-67, var26);
                            this.field8276.method2353(58, var27);
                            this.field8276.method2353(84, var28);
                            this.field8276.method2353(arg1 ^ 0xFFFFFFF8, var29);
                            this.field8276.method1626(0.0F, arg1 ^ 0x2AD8A37);
                            this.field8276.method1626(1.0F, -44927608);
                            this.field8276.method1626((float) var33 * var16 + var30, -44927608);
                            this.field8276.method1626((float) var33 * var17 + var31, -44927608);
                            this.field8276.method1626((float) var33 * var18 + var32, -44927608);
                            this.field8276.method2353(-98, var26);
                            this.field8276.method2353(-84, var27);
                            this.field8276.method2353(arg1 ^ 0x2B, var28);
                            this.field8276.method2353(arg1 ^ 0xFFFFFFD8, var29);
                        }
                    }
                }
            }
        }
        if (this.field8276.field5262 != 0) {
            this.field8289.method467(-99, this.field8276.field5262, 24, this.field8276.field5275);
            arg0.method3935(this.field8287, this.field8292, this.field8290, null, 2407);
            arg0.method3945(this.field8276.field5262 / 24, 7, 3, 0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[S[Ljava/lang/String;BI)V", line = 556)
    public static final void method3488(int arg0, short[] arg1, String[] arg2, byte arg3, int arg4) {
        field8275++;
        if (arg3 >= -100 || arg4 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg4;
        String var7 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var7;
        short var8 = arg1[var5];
        arg1[var5] = arg1[arg0];
        arg1[arg0] = var8;
        for (int var9 = arg4; var9 < arg0; var9++) {
            if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                short var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg2[arg0] = arg2[var6];
        arg2[var6] = var7;
        arg1[arg0] = arg1[var6];
        arg1[var6] = var8;
        method3488(var6 - 1, arg1, arg2, (byte) -125, arg4);
        method3488(arg0, arg1, arg2, (byte) -118, var6 + 1);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 613)
    public static void method3489(boolean arg0) {
        if (arg0) {
            field8293 = null;
            field8277 = null;
            field8286 = null;
            field8291 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Lpc;I)V", line = 626)
    public final void method3490(class700 arg0, int arg1) {
        this.field8289 = arg0.method3904(196584, (byte) 124, true, null, 24);
        field8279++;
        this.field8287 = new class550(this.field8289, 5126, 2, 0);
        this.field8292 = new class550(this.field8289, 5126, 3, 8);
        if (arg1 != 17542) {
            this.method3486(null, 68, -81, null);
        }
        this.field8290 = new class550(this.field8289, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILpc;I)V", line = 645)
    private final void method3491(int arg0, class700 arg1, int arg2) {
        field8273++;
        class587.field7998 = arg1.field9850;
        arg1.method3958(-895270824, (float) arg0);
        arg1.method3934(126);
        int var4 = 84 % ((-arg2 - 86) / 37);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method3908(false, (byte) 118);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIBLha;I)Lka;", line = 667)
    public static final class498 method3492(int arg0, int arg1, int arg2, int arg3, byte arg4, class66 arg5, int arg6) {
        field8274++;
        long var7 = (long) arg2;
        class498 var9 = (class498) class778.field10744.method1684(var7, arg4 ^ 0xFFFFFED1);
        short var10 = 2055;
        if (var9 == null) {
            class496 var11 = class748.method4177(arg2, 0, class733.field10257, 4);
            if (var11 == null) {
                return null;
            }
            if (var11.field6919 < 13) {
                var11.method2934(100, 2);
            }
            var9 = arg5.method567(var11, var10, class115.field1456, 64, 768);
            class778.field10744.method1686(-25638, var7, var9);
        }
        class498 var12 = var9.method364((byte) 2, var10, true);
        if (arg3 != 0) {
            var12.method360(arg3);
        }
        if (arg6 != 0) {
            var12.method398(arg6);
        }
        if (arg4 != 72) {
            method3489(true);
        }
        if (arg1 != 0) {
            var12.method353(arg1);
        }
        if (arg0 != 0) {
            var12.method377(0, arg0, 0);
        }
        return var12;
    }
}
