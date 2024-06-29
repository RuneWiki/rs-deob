import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class406 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "[F")
    private float[] field5553 = new float[16];

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lbs;")
    private class685 field5554 = new class685(786336);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    private int field5564 = class544.method3197(1600, (byte) -93);

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[[Lgi;")
    private class676[][] field5565 = new class676[64][768];

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    private int field5569 = 0;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[[Lgi;")
    private class676[][] field5567 = new class676[1600][64];

    @OriginalMember(owner = "client!we", name = "r", descriptor = "[I")
    private int[] field5568 = new int[8191];

    @OriginalMember(owner = "client!we", name = "p", descriptor = "[I")
    private int[] field5566 = new int[1600];

    @OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
    private int[] field5571 = new int[64];

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lid;")
    private class583 field5559;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lpw;")
    private class704 field5560;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lpw;")
    private class704 field5561;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lpw;")
    private class704 field5562;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[S")
    public static short[] field5552;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lnv;I)V", line = 3)
    private final void method2495(class417 arg0, int arg1) {
        arg0.method2556(true, arg1 + 24882);
        if (arg1 != -24965) {
            this.method2498(41, (byte) 30, null);
        }
        field5570++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class356.field4558 != arg0.field6058) {
            arg0.method360(class356.field4558);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IBLnv;)V", line = 22)
    private final void method2496(int arg0, byte arg1, class417 arg2) {
        int var4 = 103 % ((arg1 + 16) / 61);
        class356.field4558 = arg2.field6058;
        field5551++;
        arg2.method2574((float) arg0, true);
        arg2.method2557((byte) -57);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method2556(false, -117);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILnv;ILpca;)V", line = 44)
    public final void method2497(int arg0, class417 arg1, int arg2, class713 arg3) {
        field5563++;
        if (arg1.field5943 == null) {
            return;
        }
        if (arg2 < 0) {
            this.method2500(arg1, false);
        } else {
            this.method2496(arg2, (byte) 77, arg1);
        }
        float var5 = arg1.field5943.field8959;
        float var6 = arg1.field5943.field8940;
        float var7 = arg1.field5943.field8962;
        float var8 = arg1.field5943.field8955;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            if (arg0 != 64) {
                this.field5565 = null;
            }
            int var11 = 0;
            class562 var12 = arg3.field10032.field2044;
            for (class562 var13 = var12.field8004; var13 != var12; var13 = var13.field8004) {
                class676 var14 = (class676) var13;
                int var15 = (int) ((float) (var14.field9571 >> 12) * var7 + (float) (var14.field9578 >> 12) * var6 + (float) (var14.field9573 >> 12) * var5 + var8);
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var15 < var10) {
                    var10 = var15;
                }
                this.field5568[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) > 1600) {
                var17 = class544.method3197(var16, (byte) -122) + 1 - this.field5564;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            int var18 = 0;
            class562 var19 = var12.field8004;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field5569 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field5566[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field5571[var24] = 0;
                }
                while (var12 != var19) {
                    class676 var25 = (class676) var19;
                    if (var22) {
                        var22 = false;
                        var20 = var25.field9569;
                        var21 = var25.field9574;
                    }
                    if (var18 > 0 && (var25.field9569 != var20 || var21 != var25.field9574)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field5568[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field5566[var26] < 64) {
                            this.field5567[var26][this.field5566[var26]++] = var25;
                        } else {
                            label111: {
                                if (this.field5566[var26] == 64) {
                                    if (this.field5569 == 64) {
                                        break label111;
                                    }
                                    this.field5566[var26] += this.field5569++ + 1;
                                }
                                class676[] var28 = this.field5565[this.field5566[var26] - 64 - 1];
                                int var10002 = this.field5566[var26] - 65;
                                int var10004 = this.field5571[this.field5566[var26] - 65];
                                this.field5571[var10002] = this.field5571[this.field5566[var26] - 65] + 1;
                                var28[var10004] = var25;
                            }
                        }
                    }
                    var19 = var19.field8004;
                }
                if (var20 < 0) {
                    arg1.method2624(-1, 2);
                } else {
                    arg1.method2624(var20, 2);
                }
                if (var21 && class356.field4558 != arg1.field6058) {
                    arg1.method360(class356.field4558);
                } else if (arg1.field6058 != 1.0F) {
                    arg1.method360(1.0F);
                }
                this.method2498(var16, (byte) 36, arg1);
            }
        } catch (Exception var27) {
        }
        this.method2495(arg1, -24965);
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IBLnv;)V", line = 211)
    private final void method2498(int arg0, byte arg1, class417 arg2) {
        field5557++;
        OpenGL.glGetFloatv(2982, this.field5553, 0);
        float var4 = this.field5553[0];
        float var5 = this.field5553[4];
        float var6 = this.field5553[8];
        float var7 = this.field5553[1];
        float var8 = this.field5553[5];
        float var9 = this.field5553[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        if (arg1 != 36) {
            return;
        }
        float var17 = var8 - var5;
        this.field5554.field2903 = 0;
        float var18 = var9 - var6;
        if (arg2.field5992) {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field5566[var44] <= 64 ? this.field5566[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class676 var59 = this.field5567[var44][var46];
                        int var60 = var59.field9576;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field9573 >> 12);
                        float var66 = (float) (var59.field9578 >> 12);
                        float var67 = (float) (var59.field9571 >> 12);
                        int var68 = var59.field9566 >> 12;
                        this.field5554.method3878((byte) 69, 0.0F);
                        this.field5554.method3878((byte) 69, 0.0F);
                        this.field5554.method3878((byte) 69, (float) (-var68) * var10 + var65);
                        this.field5554.method3878((byte) 69, (float) (-var68) * var11 + var66);
                        this.field5554.method3878((byte) 69, (float) (-var68) * var12 + var67);
                        this.field5554.method1460(var61, arg1 + 24674);
                        this.field5554.method1460(var62, 24710);
                        this.field5554.method1460(var63, arg1 + 24674);
                        this.field5554.method1460(var64, 24710);
                        this.field5554.method3878((byte) 69, 1.0F);
                        this.field5554.method3878((byte) 69, 0.0F);
                        this.field5554.method3878((byte) 69, (float) var68 * var13 + var65);
                        this.field5554.method3878((byte) 69, (float) var68 * var14 + var66);
                        this.field5554.method3878((byte) 69, (float) var68 * var15 + var67);
                        this.field5554.method1460(var61, 24710);
                        this.field5554.method1460(var62, arg1 + 24674);
                        this.field5554.method1460(var63, arg1 + 24674);
                        this.field5554.method1460(var64, 24710);
                        this.field5554.method3878((byte) 69, 1.0F);
                        this.field5554.method3878((byte) 69, 1.0F);
                        this.field5554.method3878((byte) 69, (float) var68 * var10 + var65);
                        this.field5554.method3878((byte) 69, (float) var68 * var11 + var66);
                        this.field5554.method3878((byte) 69, (float) var68 * var12 + var67);
                        this.field5554.method1460(var61, 24710);
                        this.field5554.method1460(var62, 24710);
                        this.field5554.method1460(var63, 24710);
                        this.field5554.method1460(var64, 24710);
                        this.field5554.method3878((byte) 69, 0.0F);
                        this.field5554.method3878((byte) 69, 1.0F);
                        this.field5554.method3878((byte) 69, (float) var68 * var16 + var65);
                        this.field5554.method3878((byte) 69, (float) var68 * var17 + var66);
                        this.field5554.method3878((byte) 69, (float) var68 * var18 + var67);
                        this.field5554.method1460(var61, 24710);
                        this.field5554.method1460(var62, 24710);
                        this.field5554.method1460(var63, 24710);
                        this.field5554.method1460(var64, 24710);
                    }
                    if (this.field5566[var44] > 64) {
                        int var47 = this.field5566[var44] - 64 - 1;
                        for (int var48 = this.field5571[var47] - 1; var48 >= 0; var48--) {
                            class676 var49 = this.field5565[var47][var48];
                            int var50 = var49.field9576;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field9573 >> 12);
                            float var56 = (float) (var49.field9578 >> 12);
                            float var57 = (float) (var49.field9571 >> 12);
                            int var58 = var49.field9566 >> 12;
                            this.field5554.method3878((byte) 69, 0.0F);
                            this.field5554.method3878((byte) 69, 0.0F);
                            this.field5554.method3878((byte) 69, (float) (-var58) * var10 + var55);
                            this.field5554.method3878((byte) 69, (float) (-var58) * var11 + var56);
                            this.field5554.method3878((byte) 69, (float) (-var58) * var12 + var57);
                            this.field5554.method1460(var51, 24710);
                            this.field5554.method1460(var52, arg1 ^ 0x60A2);
                            this.field5554.method1460(var53, 24710);
                            this.field5554.method1460(var54, 24710);
                            this.field5554.method3878((byte) 69, 1.0F);
                            this.field5554.method3878((byte) 69, 0.0F);
                            this.field5554.method3878((byte) 69, (float) var58 * var13 + var55);
                            this.field5554.method3878((byte) 69, (float) var58 * var14 + var56);
                            this.field5554.method3878((byte) 69, (float) var58 * var15 + var57);
                            this.field5554.method1460(var51, arg1 ^ 0x60A2);
                            this.field5554.method1460(var52, 24710);
                            this.field5554.method1460(var53, 24710);
                            this.field5554.method1460(var54, 24710);
                            this.field5554.method3878((byte) 69, 1.0F);
                            this.field5554.method3878((byte) 69, 1.0F);
                            this.field5554.method3878((byte) 69, (float) var58 * var10 + var55);
                            this.field5554.method3878((byte) 69, (float) var58 * var11 + var56);
                            this.field5554.method3878((byte) 69, (float) var58 * var12 + var57);
                            this.field5554.method1460(var51, 24710);
                            this.field5554.method1460(var52, 24710);
                            this.field5554.method1460(var53, 24710);
                            this.field5554.method1460(var54, arg1 ^ 0x60A2);
                            this.field5554.method3878((byte) 69, 0.0F);
                            this.field5554.method3878((byte) 69, 1.0F);
                            this.field5554.method3878((byte) 69, (float) var58 * var16 + var55);
                            this.field5554.method3878((byte) 69, (float) var58 * var17 + var56);
                            this.field5554.method3878((byte) 69, (float) var58 * var18 + var57);
                            this.field5554.method1460(var51, 24710);
                            this.field5554.method1460(var52, 24710);
                            this.field5554.method1460(var53, 24710);
                            this.field5554.method1460(var54, 24710);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field5566[var19] <= 64 ? this.field5566[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class676 var34 = this.field5567[var19][var21];
                        int var35 = var34.field9576;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field9573 >> 12);
                        float var41 = (float) (var34.field9578 >> 12);
                        float var42 = (float) (var34.field9571 >> 12);
                        int var43 = var34.field9566 >> 12;
                        this.field5554.method3880(0.0F, arg1 - 151);
                        this.field5554.method3880(0.0F, -110);
                        this.field5554.method3880((float) (-var43) * var10 + var40, arg1 + 34);
                        this.field5554.method3880((float) (-var43) * var11 + var41, -112);
                        this.field5554.method3880((float) (-var43) * var12 + var42, 64);
                        this.field5554.method1460(var36, 24710);
                        this.field5554.method1460(var37, 24710);
                        this.field5554.method1460(var38, 24710);
                        this.field5554.method1460(var39, 24710);
                        this.field5554.method3880(1.0F, 101);
                        this.field5554.method3880(0.0F, arg1 + 80);
                        this.field5554.method3880((float) var43 * var13 + var40, 98);
                        this.field5554.method3880((float) var43 * var14 + var41, arg1 ^ 0x6C);
                        this.field5554.method3880((float) var43 * var15 + var42, 28);
                        this.field5554.method1460(var36, 24710);
                        this.field5554.method1460(var37, 24710);
                        this.field5554.method1460(var38, arg1 + 24674);
                        this.field5554.method1460(var39, arg1 ^ 0x60A2);
                        this.field5554.method3880(1.0F, arg1 ^ 0xFFFFFFA1);
                        this.field5554.method3880(1.0F, arg1 ^ 0x5F);
                        this.field5554.method3880((float) var43 * var10 + var40, -110);
                        this.field5554.method3880((float) var43 * var11 + var41, -121);
                        this.field5554.method3880((float) var43 * var12 + var42, -119);
                        this.field5554.method1460(var36, 24710);
                        this.field5554.method1460(var37, 24710);
                        this.field5554.method1460(var38, arg1 + 24674);
                        this.field5554.method1460(var39, arg1 ^ 0x60A2);
                        this.field5554.method3880(0.0F, arg1 + 4);
                        this.field5554.method3880(1.0F, 31);
                        this.field5554.method3880((float) var43 * var16 + var40, 85);
                        this.field5554.method3880((float) var43 * var17 + var41, 113);
                        this.field5554.method3880((float) var43 * var18 + var42, 126);
                        this.field5554.method1460(var36, arg1 + 24674);
                        this.field5554.method1460(var37, 24710);
                        this.field5554.method1460(var38, 24710);
                        this.field5554.method1460(var39, 24710);
                    }
                    if (this.field5566[var19] > 64) {
                        int var22 = this.field5566[var19] - 65;
                        for (int var23 = this.field5571[var22] - 1; var23 >= 0; var23--) {
                            class676 var24 = this.field5565[var22][var23];
                            int var25 = var24.field9576;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field9573 >> 12);
                            float var31 = (float) (var24.field9578 >> 12);
                            float var32 = (float) (var24.field9571 >> 12);
                            int var33 = var24.field9566 >> 12;
                            this.field5554.method3880(0.0F, 116);
                            this.field5554.method3880(0.0F, -106);
                            this.field5554.method3880((float) (-var33) * var10 + var30, -119);
                            this.field5554.method3880((float) (-var33) * var11 + var31, arg1 ^ 0xFFFFFFA3);
                            this.field5554.method3880((float) (-var33) * var12 + var32, arg1 + 44);
                            this.field5554.method1460(var26, 24710);
                            this.field5554.method1460(var27, 24710);
                            this.field5554.method1460(var28, arg1 ^ 0x60A2);
                            this.field5554.method1460(var29, 24710);
                            this.field5554.method3880(1.0F, -117);
                            this.field5554.method3880(0.0F, -116);
                            this.field5554.method3880((float) var33 * var13 + var30, arg1 + -6);
                            this.field5554.method3880((float) var33 * var14 + var31, 93);
                            this.field5554.method3880((float) var33 * var15 + var32, arg1 ^ 0x60);
                            this.field5554.method1460(var26, 24710);
                            this.field5554.method1460(var27, 24710);
                            this.field5554.method1460(var28, 24710);
                            this.field5554.method1460(var29, 24710);
                            this.field5554.method3880(1.0F, 36);
                            this.field5554.method3880(1.0F, arg1 + 61);
                            this.field5554.method3880((float) var33 * var10 + var30, -107);
                            this.field5554.method3880((float) var33 * var11 + var31, 25);
                            this.field5554.method3880((float) var33 * var12 + var32, arg1 + -155);
                            this.field5554.method1460(var26, 24710);
                            this.field5554.method1460(var27, arg1 ^ 0x60A2);
                            this.field5554.method1460(var28, 24710);
                            this.field5554.method1460(var29, 24710);
                            this.field5554.method3880(0.0F, 32);
                            this.field5554.method3880(1.0F, 100);
                            this.field5554.method3880((float) var33 * var16 + var30, arg1 ^ 0xFFFFFFAA);
                            this.field5554.method3880((float) var33 * var17 + var31, -111);
                            this.field5554.method3880((float) var33 * var18 + var32, 24);
                            this.field5554.method1460(var26, arg1 ^ 0x60A2);
                            this.field5554.method1460(var27, 24710);
                            this.field5554.method1460(var28, 24710);
                            this.field5554.method1460(var29, arg1 + 24674);
                        }
                    }
                }
            }
        }
        if (this.field5554.field2903 != 0) {
            this.field5559.method16(24, this.field5554.field2912, arg1 ^ 0xFFFFFFA4, this.field5554.field2903);
            arg2.method2589(this.field5560, null, this.field5561, false, this.field5562);
            arg2.method2572(this.field5554.field2903 / 24, 7, 0, (byte) -45);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLnv;)V", line = 568)
    public final void method2499(boolean arg0, class417 arg1) {
        this.field5559 = arg1.method2598(null, 34168, true, 196584, 24);
        field5558++;
        this.field5561 = new class704(this.field5559, 5126, 2, 0);
        if (!arg0) {
            this.field5562 = new class704(this.field5559, 5126, 3, 8);
            this.field5560 = new class704(this.field5559, 5121, 4, 20);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lnv;Z)V", line = 585)
    private final void method2500(class417 arg0, boolean arg1) {
        class356.field4558 = arg0.field6058;
        field5555++;
        arg0.method2566(1);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method2556(arg1, -77);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 599)
    public static void method2501(int arg0) {
        if (arg0 < -63) {
            field5552 = null;
        }
    }
}
