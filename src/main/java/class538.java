import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class538 {

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[F")
    private float[] field7456 = new float[16];

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lbga;")
    private class172 field7450 = new class172(786336);

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    private int field7463 = class200.method1219(1600, 8);

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "[I")
    private int[] field7467 = new int[1600];

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    private int field7468 = 0;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "[[Lgia;")
    private class421[][] field7465 = new class421[64][768];

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "[[Lgia;")
    private class421[][] field7469 = new class421[1600][64];

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "[I")
    private int[] field7466 = new int[8191];

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "[I")
    private int[] field7470 = new int[64];

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field7453 = 0;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field7452 = 0;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Lbia;")
    private class411 field7461;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Lss;")
    private class509 field7460;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Lss;")
    private class509 field7462;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Lss;")
    private class509 field7464;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[[I")
    public static int[][] field7454;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ldw;B)V")
    private final void method3185(class664 arg0, byte arg1) {
        class560.field7792 = arg0.field9091;
        field7459++;
        arg0.method3700(-9);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method3684(false, -32);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        if (arg1 != 25) {
            this.field7469 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILlj;)V")
    public static final void method3186(int arg0, int arg1, int arg2, int arg3, class213 arg4) {
        class262 var5 = class670.method3779(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field4410 = (arg1 << class371.field5241) + class292.field4190;
        arg4.field4413 = arg3;
        arg4.field4418 = (arg2 << class371.field5241) + class292.field4190;
        var5.field3838 = arg4;
        int var6 = class433.field6043 == class371.field5240 ? 1 : 0;
        if (arg4.method783(0)) {
            if (arg4.method785(-125)) {
                arg4.field4412 = class333.field4710[var6];
                class333.field4710[var6] = arg4;
                return;
            }
            arg4.field4412 = class234.field3474[var6];
            class234.field3474[var6] = arg4;
            class569.field7870 = true;
            return;
        }
        arg4.field4412 = class204.field2694[var6];
        class204.field2694[var6] = arg4;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZILdw;)V")
    private final void method3187(boolean arg0, int arg1, class664 arg2) {
        OpenGL.glGetFloatv(2982, this.field7456, 0);
        field7449++;
        float var4 = this.field7456[0];
        float var5 = this.field7456[4];
        float var6 = this.field7456[8];
        if (arg0) {
            this.field7469 = null;
        }
        float var7 = this.field7456[1];
        float var8 = this.field7456[5];
        float var9 = this.field7456[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field7450.field956 = 0;
        float var18 = var9 - var6;
        if (arg2.field9051) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field7467[var44] > 64 ? 64 : this.field7467[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class421 var59 = this.field7469[var44][var46];
                        int var60 = var59.field5921;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field5919 >> 12);
                        float var66 = (float) (var59.field5926 >> 12);
                        float var67 = (float) (var59.field5922 >> 12);
                        int var68 = var59.field5920 >> 12;
                        this.field7450.method1102(-732814632, 0.0F);
                        this.field7450.method1102(-732814632, 0.0F);
                        this.field7450.method1102(-732814632, (float) (-var68) * var10 + var65);
                        this.field7450.method1102(-732814632, (float) (-var68) * var11 + var66);
                        this.field7450.method1102(-732814632, (float) (-var68) * var12 + var67);
                        this.field7450.method444(var61, 128);
                        this.field7450.method444(var62, 128);
                        this.field7450.method444(var63, 128);
                        this.field7450.method444(var64, 128);
                        this.field7450.method1102(-732814632, 1.0F);
                        this.field7450.method1102(-732814632, 0.0F);
                        this.field7450.method1102(-732814632, (float) var68 * var13 + var65);
                        this.field7450.method1102(-732814632, (float) var68 * var14 + var66);
                        this.field7450.method1102(-732814632, (float) var68 * var15 + var67);
                        this.field7450.method444(var61, 128);
                        this.field7450.method444(var62, 128);
                        this.field7450.method444(var63, 128);
                        this.field7450.method444(var64, 128);
                        this.field7450.method1102(-732814632, 1.0F);
                        this.field7450.method1102(-732814632, 1.0F);
                        this.field7450.method1102(-732814632, (float) var68 * var10 + var65);
                        this.field7450.method1102(-732814632, (float) var68 * var11 + var66);
                        this.field7450.method1102(-732814632, (float) var68 * var12 + var67);
                        this.field7450.method444(var61, 128);
                        this.field7450.method444(var62, 128);
                        this.field7450.method444(var63, 128);
                        this.field7450.method444(var64, 128);
                        this.field7450.method1102(-732814632, 0.0F);
                        this.field7450.method1102(-732814632, 1.0F);
                        this.field7450.method1102(-732814632, (float) var68 * var16 + var65);
                        this.field7450.method1102(-732814632, (float) var68 * var17 + var66);
                        this.field7450.method1102(-732814632, (float) var68 * var18 + var67);
                        this.field7450.method444(var61, 128);
                        this.field7450.method444(var62, 128);
                        this.field7450.method444(var63, 128);
                        this.field7450.method444(var64, 128);
                    }
                    if (this.field7467[var44] > 64) {
                        int var47 = this.field7467[var44] - 64 - 1;
                        for (int var48 = this.field7470[var47] - 1; var48 >= 0; var48--) {
                            class421 var49 = this.field7465[var47][var48];
                            int var50 = var49.field5921;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field5919 >> 12);
                            float var56 = (float) (var49.field5926 >> 12);
                            float var57 = (float) (var49.field5922 >> 12);
                            int var58 = var49.field5920 >> 12;
                            this.field7450.method1102(-732814632, 0.0F);
                            this.field7450.method1102(-732814632, 0.0F);
                            this.field7450.method1102(-732814632, (float) (-var58) * var10 + var55);
                            this.field7450.method1102(-732814632, (float) (-var58) * var11 + var56);
                            this.field7450.method1102(-732814632, (float) (-var58) * var12 + var57);
                            this.field7450.method444(var51, 128);
                            this.field7450.method444(var52, 128);
                            this.field7450.method444(var53, 128);
                            this.field7450.method444(var54, 128);
                            this.field7450.method1102(-732814632, 1.0F);
                            this.field7450.method1102(-732814632, 0.0F);
                            this.field7450.method1102(-732814632, (float) var58 * var13 + var55);
                            this.field7450.method1102(-732814632, (float) var58 * var14 + var56);
                            this.field7450.method1102(-732814632, (float) var58 * var15 + var57);
                            this.field7450.method444(var51, 128);
                            this.field7450.method444(var52, 128);
                            this.field7450.method444(var53, 128);
                            this.field7450.method444(var54, 128);
                            this.field7450.method1102(-732814632, 1.0F);
                            this.field7450.method1102(-732814632, 1.0F);
                            this.field7450.method1102(-732814632, (float) var58 * var10 + var55);
                            this.field7450.method1102(-732814632, (float) var58 * var11 + var56);
                            this.field7450.method1102(-732814632, (float) var58 * var12 + var57);
                            this.field7450.method444(var51, 128);
                            this.field7450.method444(var52, 128);
                            this.field7450.method444(var53, 128);
                            this.field7450.method444(var54, 128);
                            this.field7450.method1102(-732814632, 0.0F);
                            this.field7450.method1102(-732814632, 1.0F);
                            this.field7450.method1102(-732814632, (float) var58 * var16 + var55);
                            this.field7450.method1102(-732814632, (float) var58 * var17 + var56);
                            this.field7450.method1102(-732814632, (float) var58 * var18 + var57);
                            this.field7450.method444(var51, 128);
                            this.field7450.method444(var52, 128);
                            this.field7450.method444(var53, 128);
                            this.field7450.method444(var54, 128);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field7467[var19] <= 64 ? this.field7467[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class421 var34 = this.field7469[var19][var21];
                        int var35 = var34.field5921;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field5919 >> 12);
                        float var41 = (float) (var34.field5926 >> 12);
                        float var42 = (float) (var34.field5922 >> 12);
                        int var43 = var34.field5920 >> 12;
                        this.field7450.method1100(0.0F, 118);
                        this.field7450.method1100(0.0F, 86);
                        this.field7450.method1100((float) (-var43) * var10 + var40, -121);
                        this.field7450.method1100((float) (-var43) * var11 + var41, 116);
                        this.field7450.method1100((float) (-var43) * var12 + var42, 4);
                        this.field7450.method444(var36, 128);
                        this.field7450.method444(var37, 128);
                        this.field7450.method444(var38, 128);
                        this.field7450.method444(var39, 128);
                        this.field7450.method1100(1.0F, 106);
                        this.field7450.method1100(0.0F, -15);
                        this.field7450.method1100((float) var43 * var13 + var40, 15);
                        this.field7450.method1100((float) var43 * var14 + var41, -120);
                        this.field7450.method1100((float) var43 * var15 + var42, -125);
                        this.field7450.method444(var36, 128);
                        this.field7450.method444(var37, 128);
                        this.field7450.method444(var38, 128);
                        this.field7450.method444(var39, 128);
                        this.field7450.method1100(1.0F, -121);
                        this.field7450.method1100(1.0F, -123);
                        this.field7450.method1100((float) var43 * var10 + var40, -112);
                        this.field7450.method1100((float) var43 * var11 + var41, 76);
                        this.field7450.method1100((float) var43 * var12 + var42, -115);
                        this.field7450.method444(var36, 128);
                        this.field7450.method444(var37, 128);
                        this.field7450.method444(var38, 128);
                        this.field7450.method444(var39, 128);
                        this.field7450.method1100(0.0F, -21);
                        this.field7450.method1100(1.0F, -109);
                        this.field7450.method1100((float) var43 * var16 + var40, 48);
                        this.field7450.method1100((float) var43 * var17 + var41, 90);
                        this.field7450.method1100((float) var43 * var18 + var42, 42);
                        this.field7450.method444(var36, 128);
                        this.field7450.method444(var37, 128);
                        this.field7450.method444(var38, 128);
                        this.field7450.method444(var39, 128);
                    }
                    if (this.field7467[var19] > 64) {
                        int var22 = this.field7467[var19] - 64 - 1;
                        for (int var23 = this.field7470[var22] - 1; var23 >= 0; var23--) {
                            class421 var24 = this.field7465[var22][var23];
                            int var25 = var24.field5921;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field5919 >> 12);
                            float var31 = (float) (var24.field5926 >> 12);
                            float var32 = (float) (var24.field5922 >> 12);
                            int var33 = var24.field5920 >> 12;
                            this.field7450.method1100(0.0F, 92);
                            this.field7450.method1100(0.0F, 72);
                            this.field7450.method1100((float) (-var33) * var10 + var30, -117);
                            this.field7450.method1100((float) (-var33) * var11 + var31, -115);
                            this.field7450.method1100((float) (-var33) * var12 + var32, 7);
                            this.field7450.method444(var26, 128);
                            this.field7450.method444(var27, 128);
                            this.field7450.method444(var28, 128);
                            this.field7450.method444(var29, 128);
                            this.field7450.method1100(1.0F, -121);
                            this.field7450.method1100(0.0F, 124);
                            this.field7450.method1100((float) var33 * var13 + var30, 32);
                            this.field7450.method1100((float) var33 * var14 + var31, -120);
                            this.field7450.method1100((float) var33 * var15 + var32, 115);
                            this.field7450.method444(var26, 128);
                            this.field7450.method444(var27, 128);
                            this.field7450.method444(var28, 128);
                            this.field7450.method444(var29, 128);
                            this.field7450.method1100(1.0F, 4);
                            this.field7450.method1100(1.0F, 118);
                            this.field7450.method1100((float) var33 * var10 + var30, -121);
                            this.field7450.method1100((float) var33 * var11 + var31, 67);
                            this.field7450.method1100((float) var33 * var12 + var32, 64);
                            this.field7450.method444(var26, 128);
                            this.field7450.method444(var27, 128);
                            this.field7450.method444(var28, 128);
                            this.field7450.method444(var29, 128);
                            this.field7450.method1100(0.0F, 122);
                            this.field7450.method1100(1.0F, -109);
                            this.field7450.method1100((float) var33 * var16 + var30, -111);
                            this.field7450.method1100((float) var33 * var17 + var31, -109);
                            this.field7450.method1100((float) var33 * var18 + var32, 88);
                            this.field7450.method444(var26, 128);
                            this.field7450.method444(var27, 128);
                            this.field7450.method444(var28, 128);
                            this.field7450.method444(var29, 128);
                        }
                    }
                }
            }
        }
        if (this.field7450.field956 != 0) {
            this.field7461.method743(this.field7450.field956, 24, 29764, this.field7450.field954);
            arg2.method3725(this.field7464, (byte) 86, this.field7460, null, this.field7462);
            arg2.method3741(this.field7450.field956 / 24, 0, 7, 0);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILdw;ILik;)V")
    public final void method3188(int arg0, class664 arg1, int arg2, class100 arg3) {
        field7451++;
        if (arg1.field9038 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method3190(arg0 - 8799, arg2, arg1);
        } else {
            this.method3185(arg1, (byte) 25);
        }
        float var5 = arg1.field9038.field6692;
        float var6 = arg1.field9038.field6670;
        float var7 = arg1.field9038.field6673;
        float var8 = arg1.field9038.field6700;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            if (arg0 != 7216) {
                return;
            }
            int var11 = 0;
            class61 var12 = arg3.field1384.field7000;
            for (class61 var13 = var12.field880; var13 != var12; var13 = var13.field880) {
                class421 var14 = (class421) var13;
                int var15 = (int) ((float) (var14.field5922 >> 12) * var7 + (float) (var14.field5926 >> 12) * var6 + (float) (var14.field5919 >> 12) * var5 + var8);
                this.field7466[var9++] = var15;
                if (var15 > var11) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) > 1600) {
                var17 = class200.method1219(var16, 8) + 1 - this.field7463;
                var16 = (var16 >> var17) + 2;
            } else {
                var16 += 2;
                var17 = 0;
            }
            int var18 = 0;
            class61 var19 = var12.field880;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field7468 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field7467[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field7470[var24] = 0;
                }
                while (var12 != var19) {
                    class421 var25 = (class421) var19;
                    if (var22) {
                        var22 = false;
                        var20 = var25.field5924;
                        var21 = var25.field5925;
                    }
                    if (var18 > 0 && (var25.field5924 != var20 || var25.field5925 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field7466[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field7467[var26] < 64) {
                            this.field7469[var26][this.field7467[var26]++] = var25;
                        } else {
                            label101: {
                                if (this.field7467[var26] == 64) {
                                    if (this.field7468 == 64) {
                                        break label101;
                                    }
                                    this.field7467[var26] += (this.field7468++) + 1;
                                }
                                this.field7465[this.field7467[var26] - 64 - 1][this.field7470[this.field7467[var26] - 1 - 64]++] = var25;
                            }
                        }
                    }
                    var19 = var19.field880;
                }
                if (var20 < 0) {
                    arg1.method3709((byte) -113, -1);
                } else {
                    arg1.method3709((byte) -102, var20);
                }
                if (var21 && class560.field7792 != arg1.field9091) {
                    arg1.method1457(class560.field7792);
                } else if (arg1.field9091 != 1.0F) {
                    arg1.method1457(1.0F);
                }
                this.method3187(false, var16, arg1);
            }
        } catch (Exception var27) {
        }
        this.method3192(arg1, (byte) -31);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Ldw;B)V")
    public final void method3189(class664 arg0, byte arg1) {
        field7457++;
        this.field7461 = arg0.method3687(true, 24, null, 196584, -122);
        this.field7460 = new class509(this.field7461, 5126, 2, 0);
        this.field7462 = new class509(this.field7461, 5126, 3, 8);
        int var3 = -94 % ((arg1 + 1) / 63);
        this.field7464 = new class509(this.field7461, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILdw;)V")
    private final void method3190(int arg0, int arg1, class664 arg2) {
        field7455++;
        class560.field7792 = arg2.field9091;
        arg2.method3706(3, (float) arg1);
        arg2.method3740((byte) 48);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        if (arg0 != -1583) {
            this.method3188(-37, null, -38, null);
        }
        arg2.method3684(false, arg0 + 1551);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method3191(int arg0) {
        field7454 = null;
        if (arg0 != -20894840) {
            field7452 = -23;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(Ldw;B)V")
    private final void method3192(class664 arg0, byte arg1) {
        arg0.method3684(true, -32);
        field7458++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class560.field7792 != arg0.field9091) {
            arg0.method1457(class560.field7792);
        }
        if (arg1 != -31) {
            this.field7462 = null;
        }
    }
}
