import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class270 {

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "[F")
    private float[] field3828 = new float[16];

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "Lag;")
    private class212 field3823 = new class212(786336);

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "I")
    private int field3834 = class690.method3903(4, 1600);

    @OriginalMember(owner = "client!ida", name = "r", descriptor = "[[Lnb;")
    private class95[][] field3840 = new class95[64][768];

    @OriginalMember(owner = "client!ida", name = "t", descriptor = "[[Lnb;")
    private class95[][] field3842 = new class95[1600][64];

    @OriginalMember(owner = "client!ida", name = "s", descriptor = "[I")
    private int[] field3841 = new int[64];

    @OriginalMember(owner = "client!ida", name = "w", descriptor = "[I")
    private int[] field3845 = new int[1600];

    @OriginalMember(owner = "client!ida", name = "v", descriptor = "I")
    private int field3844 = 0;

    @OriginalMember(owner = "client!ida", name = "u", descriptor = "[I")
    private int[] field3843 = new int[8191];

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "Llc;")
    public static class435 field3829 = new class435(19, 11);

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "I")
    public static int field3837 = -1;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ida", name = "q", descriptor = "Llca;")
    private class52 field3839;

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "Ljaa;")
    private class745 field3835;

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "Ljaa;")
    private class745 field3836;

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "Ljaa;")
    private class745 field3838;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lkw;B)V", line = 6)
    public final void method1762(class346 arg0, byte arg1) {
        field3824++;
        this.field3839 = arg0.method2178(true, 196584, null, 24, true);
        this.field3836 = new class745(this.field3839, 5126, 2, 0);
        this.field3835 = new class745(this.field3839, 5126, 3, 8);
        if (arg1 != 64) {
            this.method1762(null, (byte) -49);
        }
        this.field3838 = new class745(this.field3839, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)V", line = 22)
    public static final void method1763(byte arg0) {
        class675.field9607 = null;
        class662.field9461 = -1;
        class301.field4129 = null;
        class710.field10013 = null;
        class487.field7023 = null;
        class577.field8283 = null;
        field3826++;
        class469.field6680 = null;
        class405.field5774 = -1;
        class571.field8229 = null;
        field3833 = -1;
        class365.field5334 = -1;
        if (arg0 <= 9) {
            field3829 = null;
        }
        class639.field9052.method3855(false);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZLkw;ILeea;)V", line = 51)
    public final void method1764(boolean arg0, class346 arg1, int arg2, class458 arg3) {
        field3827++;
        if (arg1.field4998 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method1766(arg2, -1863710772, arg1);
        } else {
            this.method1769(false, arg1);
        }
        float var5 = arg1.field4998.field5476;
        float var6 = arg1.field4998.field5475;
        float var7 = arg1.field4998.field5499;
        float var8 = arg1.field4998.field5490;
        try {
            if (arg0) {
                return;
            }
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class310 var12 = arg3.field6514.field6354;
            for (class310 var13 = var12.field4188; var13 != var12; var13 = var13.field4188) {
                class95 var14 = (class95) var13;
                int var15 = (int) ((float) (var14.field1378 >> 12) * var7 + (float) (var14.field1377 >> 12) * var5 + (float) (var14.field1374 >> 12) * var6 + var8);
                this.field3843[var9++] = var15;
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var11 < var15) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) > 1600) {
                var17 = 1 - (this.field3834 - class690.method3903(4, var16));
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            class310 var18 = var12.field4188;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field3844 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field3845[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field3841[var24] = 0;
                }
                while (var12 != var18) {
                    class95 var25 = (class95) var18;
                    if (var22) {
                        var22 = false;
                        var21 = var25.field1379;
                        var20 = var25.field1376;
                    }
                    if (var19 > 0 && (var25.field1376 != var20 || var25.field1379 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field3843[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field3845[var26] >= 64) {
                            label111: {
                                if (this.field3845[var26] == 64) {
                                    if (this.field3844 == 64) {
                                        break label111;
                                    }
                                    this.field3845[var26] += this.field3844++ + 1;
                                }
                                this.field3840[this.field3845[var26] - 64 - 1][this.field3841[this.field3845[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field3842[var26][this.field3845[var26]++] = var25;
                        }
                    }
                    var18 = var18.field4188;
                }
                if (var20 >= 0) {
                    arg1.method2176(var20, 75);
                } else {
                    arg1.method2176(-1, -121);
                }
                if (var21 && class399.field5710 != arg1.field5063) {
                    arg1.method271(class399.field5710);
                } else if (arg1.field5063 != 1.0F) {
                    arg1.method271(1.0F);
                }
                this.method1768(var16, (byte) -67, arg1);
            }
        } catch (Exception var27) {
        }
        this.method1765((byte) 123, arg1);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BLkw;)V", line = 220)
    private final void method1765(byte arg0, class346 arg1) {
        field3825++;
        arg1.method2160(true, 52);
        if (arg0 <= 106) {
            this.method1762(null, (byte) 6);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class399.field5710 != arg1.field5063) {
            arg1.method271(class399.field5710);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IILkw;)V", line = 236)
    private final void method1766(int arg0, int arg1, class346 arg2) {
        if (arg1 != -1863710772) {
            return;
        }
        class399.field5710 = arg2.field5063;
        field3831++;
        arg2.method2189(1365, (float) arg0);
        arg2.method2187((byte) -26);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method2160(false, arg1 ^ 0x90EA07F4);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 257)
    public static void method1767(int arg0) {
        field3829 = null;
        if (arg0 >= -111) {
            field3829 = null;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IBLkw;)V", line = 270)
    private final void method1768(int arg0, byte arg1, class346 arg2) {
        OpenGL.glGetFloatv(2982, this.field3828, 0);
        field3830++;
        float var4 = this.field3828[0];
        float var5 = this.field3828[4];
        float var6 = this.field3828[8];
        float var7 = this.field3828[1];
        float var8 = this.field3828[5];
        float var9 = this.field3828[9];
        if (arg1 != -67) {
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
        this.field3823.field6864 = 0;
        if (arg2.field5047) {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field3845[var44] <= 64 ? this.field3845[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class95 var59 = this.field3842[var44][var46];
                        int var60 = var59.field1375;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field1377 >> 12);
                        float var66 = (float) (var59.field1374 >> 12);
                        float var67 = (float) (var59.field1378 >> 12);
                        int var68 = var59.field1381 >> 12;
                        this.field3823.method1502(0.0F, (byte) 94);
                        this.field3823.method1502(0.0F, (byte) 103);
                        this.field3823.method1502((float) (-var68) * var10 + var65, (byte) 125);
                        this.field3823.method1502((float) (-var68) * var11 + var66, (byte) 85);
                        this.field3823.method1502((float) (-var68) * var12 + var67, (byte) 92);
                        this.field3823.method2881(var61, (byte) 123);
                        this.field3823.method2881(var62, (byte) 126);
                        this.field3823.method2881(var63, (byte) 112);
                        this.field3823.method2881(var64, (byte) 118);
                        this.field3823.method1502(1.0F, (byte) 87);
                        this.field3823.method1502(0.0F, (byte) 98);
                        this.field3823.method1502((float) var68 * var13 + var65, (byte) 79);
                        this.field3823.method1502((float) var68 * var14 + var66, (byte) 112);
                        this.field3823.method1502((float) var68 * var15 + var67, (byte) 118);
                        this.field3823.method2881(var61, (byte) 116);
                        this.field3823.method2881(var62, (byte) 113);
                        this.field3823.method2881(var63, (byte) 126);
                        this.field3823.method2881(var64, (byte) 120);
                        this.field3823.method1502(1.0F, (byte) 100);
                        this.field3823.method1502(1.0F, (byte) 75);
                        this.field3823.method1502((float) var68 * var10 + var65, (byte) 106);
                        this.field3823.method1502((float) var68 * var11 + var66, (byte) 122);
                        this.field3823.method1502((float) var68 * var12 + var67, (byte) 112);
                        this.field3823.method2881(var61, (byte) 111);
                        this.field3823.method2881(var62, (byte) 109);
                        this.field3823.method2881(var63, (byte) 123);
                        this.field3823.method2881(var64, (byte) 117);
                        this.field3823.method1502(0.0F, (byte) 114);
                        this.field3823.method1502(1.0F, (byte) 127);
                        this.field3823.method1502((float) var68 * var16 + var65, (byte) 126);
                        this.field3823.method1502((float) var68 * var17 + var66, (byte) 83);
                        this.field3823.method1502((float) var68 * var18 + var67, (byte) 114);
                        this.field3823.method2881(var61, (byte) 125);
                        this.field3823.method2881(var62, (byte) 110);
                        this.field3823.method2881(var63, (byte) 119);
                        this.field3823.method2881(var64, (byte) 116);
                    }
                    if (this.field3845[var44] > 64) {
                        int var47 = this.field3845[var44] - 65;
                        for (int var48 = this.field3841[var47] - 1; var48 >= 0; var48--) {
                            class95 var49 = this.field3840[var47][var48];
                            int var50 = var49.field1375;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field1377 >> 12);
                            float var56 = (float) (var49.field1374 >> 12);
                            float var57 = (float) (var49.field1378 >> 12);
                            int var58 = var49.field1381 >> 12;
                            this.field3823.method1502(0.0F, (byte) 76);
                            this.field3823.method1502(0.0F, (byte) 117);
                            this.field3823.method1502((float) (-var58) * var10 + var55, (byte) 76);
                            this.field3823.method1502((float) (-var58) * var11 + var56, (byte) 122);
                            this.field3823.method1502((float) (-var58) * var12 + var57, (byte) 75);
                            this.field3823.method2881(var51, (byte) 120);
                            this.field3823.method2881(var52, (byte) 112);
                            this.field3823.method2881(var53, (byte) 124);
                            this.field3823.method2881(var54, (byte) 123);
                            this.field3823.method1502(1.0F, (byte) 86);
                            this.field3823.method1502(0.0F, (byte) 101);
                            this.field3823.method1502((float) var58 * var13 + var55, (byte) 81);
                            this.field3823.method1502((float) var58 * var14 + var56, (byte) 119);
                            this.field3823.method1502((float) var58 * var15 + var57, (byte) 115);
                            this.field3823.method2881(var51, (byte) 122);
                            this.field3823.method2881(var52, (byte) 112);
                            this.field3823.method2881(var53, (byte) 111);
                            this.field3823.method2881(var54, (byte) 114);
                            this.field3823.method1502(1.0F, (byte) 119);
                            this.field3823.method1502(1.0F, (byte) 79);
                            this.field3823.method1502((float) var58 * var10 + var55, (byte) 100);
                            this.field3823.method1502((float) var58 * var11 + var56, (byte) 122);
                            this.field3823.method1502((float) var58 * var12 + var57, (byte) 119);
                            this.field3823.method2881(var51, (byte) 125);
                            this.field3823.method2881(var52, (byte) 113);
                            this.field3823.method2881(var53, (byte) 114);
                            this.field3823.method2881(var54, (byte) 110);
                            this.field3823.method1502(0.0F, (byte) 87);
                            this.field3823.method1502(1.0F, (byte) 126);
                            this.field3823.method1502((float) var58 * var16 + var55, (byte) 83);
                            this.field3823.method1502((float) var58 * var17 + var56, (byte) 77);
                            this.field3823.method1502((float) var58 * var18 + var57, (byte) 109);
                            this.field3823.method2881(var51, (byte) 119);
                            this.field3823.method2881(var52, (byte) 120);
                            this.field3823.method2881(var53, (byte) 112);
                            this.field3823.method2881(var54, (byte) 124);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field3845[var19] <= 64 ? this.field3845[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class95 var34 = this.field3842[var19][var21];
                        int var35 = var34.field1375;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field1377 >> 12);
                        float var41 = (float) (var34.field1374 >> 12);
                        float var42 = (float) (var34.field1378 >> 12);
                        int var43 = var34.field1381 >> 12;
                        this.field3823.method1501(0.0F, (byte) -37);
                        this.field3823.method1501(0.0F, (byte) -86);
                        this.field3823.method1501((float) (-var43) * var10 + var40, (byte) -36);
                        this.field3823.method1501((float) (-var43) * var11 + var41, (byte) -127);
                        this.field3823.method1501((float) (-var43) * var12 + var42, (byte) -42);
                        this.field3823.method2881(var36, (byte) 109);
                        this.field3823.method2881(var37, (byte) 123);
                        this.field3823.method2881(var38, (byte) 112);
                        this.field3823.method2881(var39, (byte) 125);
                        this.field3823.method1501(1.0F, (byte) -126);
                        this.field3823.method1501(0.0F, (byte) -69);
                        this.field3823.method1501((float) var43 * var13 + var40, (byte) -79);
                        this.field3823.method1501((float) var43 * var14 + var41, (byte) -124);
                        this.field3823.method1501((float) var43 * var15 + var42, (byte) -44);
                        this.field3823.method2881(var36, (byte) 122);
                        this.field3823.method2881(var37, (byte) 115);
                        this.field3823.method2881(var38, (byte) 117);
                        this.field3823.method2881(var39, (byte) 122);
                        this.field3823.method1501(1.0F, (byte) -124);
                        this.field3823.method1501(1.0F, (byte) -54);
                        this.field3823.method1501((float) var43 * var10 + var40, (byte) -58);
                        this.field3823.method1501((float) var43 * var11 + var41, (byte) -84);
                        this.field3823.method1501((float) var43 * var12 + var42, (byte) -86);
                        this.field3823.method2881(var36, (byte) 113);
                        this.field3823.method2881(var37, (byte) 113);
                        this.field3823.method2881(var38, (byte) 120);
                        this.field3823.method2881(var39, (byte) 117);
                        this.field3823.method1501(0.0F, (byte) -65);
                        this.field3823.method1501(1.0F, (byte) -43);
                        this.field3823.method1501((float) var43 * var16 + var40, (byte) -37);
                        this.field3823.method1501((float) var43 * var17 + var41, (byte) -36);
                        this.field3823.method1501((float) var43 * var18 + var42, (byte) -118);
                        this.field3823.method2881(var36, (byte) 112);
                        this.field3823.method2881(var37, (byte) 109);
                        this.field3823.method2881(var38, (byte) 116);
                        this.field3823.method2881(var39, (byte) 111);
                    }
                    if (this.field3845[var19] > 64) {
                        int var22 = this.field3845[var19] - 64 - 1;
                        for (int var23 = this.field3841[var22] - 1; var23 >= 0; var23--) {
                            class95 var24 = this.field3840[var22][var23];
                            int var25 = var24.field1375;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field1377 >> 12);
                            float var31 = (float) (var24.field1374 >> 12);
                            float var32 = (float) (var24.field1378 >> 12);
                            int var33 = var24.field1381 >> 12;
                            this.field3823.method1501(0.0F, (byte) -36);
                            this.field3823.method1501(0.0F, (byte) -74);
                            this.field3823.method1501((float) (-var33) * var10 + var30, (byte) -93);
                            this.field3823.method1501((float) (-var33) * var11 + var31, (byte) -69);
                            this.field3823.method1501((float) (-var33) * var12 + var32, (byte) -54);
                            this.field3823.method2881(var26, (byte) 115);
                            this.field3823.method2881(var27, (byte) 117);
                            this.field3823.method2881(var28, (byte) 124);
                            this.field3823.method2881(var29, (byte) 114);
                            this.field3823.method1501(1.0F, (byte) -81);
                            this.field3823.method1501(0.0F, (byte) -56);
                            this.field3823.method1501((float) var33 * var13 + var30, (byte) -106);
                            this.field3823.method1501((float) var33 * var14 + var31, (byte) -71);
                            this.field3823.method1501((float) var33 * var15 + var32, (byte) -112);
                            this.field3823.method2881(var26, (byte) 119);
                            this.field3823.method2881(var27, (byte) 117);
                            this.field3823.method2881(var28, (byte) 122);
                            this.field3823.method2881(var29, (byte) 110);
                            this.field3823.method1501(1.0F, (byte) -120);
                            this.field3823.method1501(1.0F, (byte) -55);
                            this.field3823.method1501((float) var33 * var10 + var30, (byte) -56);
                            this.field3823.method1501((float) var33 * var11 + var31, (byte) -110);
                            this.field3823.method1501((float) var33 * var12 + var32, (byte) -90);
                            this.field3823.method2881(var26, (byte) 110);
                            this.field3823.method2881(var27, (byte) 117);
                            this.field3823.method2881(var28, (byte) 123);
                            this.field3823.method2881(var29, (byte) 111);
                            this.field3823.method1501(0.0F, (byte) -103);
                            this.field3823.method1501(1.0F, (byte) -107);
                            this.field3823.method1501((float) var33 * var16 + var30, (byte) -68);
                            this.field3823.method1501((float) var33 * var17 + var31, (byte) -115);
                            this.field3823.method1501((float) var33 * var18 + var32, (byte) -64);
                            this.field3823.method2881(var26, (byte) 123);
                            this.field3823.method2881(var27, (byte) 119);
                            this.field3823.method2881(var28, (byte) 114);
                            this.field3823.method2881(var29, (byte) 110);
                        }
                    }
                }
            }
        }
        if (this.field3823.field6864 != 0) {
            this.field3839.method474(true, 24, this.field3823.field6864, this.field3823.field6800);
            arg2.method2134(this.field3835, this.field3838, this.field3836, null, 32888);
            arg2.method2162(95, 0, 7, this.field3823.field6864 / 24);
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZLkw;)V", line = 634)
    private final void method1769(boolean arg0, class346 arg1) {
        field3832++;
        class399.field5710 = arg1.field5063;
        arg1.method2179(1);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2160(arg0, 122);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
