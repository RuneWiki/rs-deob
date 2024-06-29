import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class458 {

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[F")
    private float[] field6555 = new float[16];

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lpd;")
    private class231 field6556 = new class231(786336);

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    private int field6561 = class608.method3411((byte) -92, 1600);

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "[[Lag;")
    private class635[][] field6566 = new class635[1600][64];

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "[I")
    private int[] field6569 = new int[8191];

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "[I")
    private int[] field6567 = new int[1600];

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "[I")
    private int[] field6568 = new int[64];

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "[[Lag;")
    private class635[][] field6570 = new class635[64][768];

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    private int field6571 = 0;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Ldg;")
    public static class376 field6551 = new class376(15, -1);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Lgg;")
    public static class158 field6557;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Lcd;")
    private class283 field6564;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Llq;")
    private class512 field6562;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "Llq;")
    private class512 field6563;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Llq;")
    private class512 field6565;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILmo;)Lih;", line = 3)
    public static final class650 method2688(int arg0, class695 arg1) {
        int var2 = -50 % ((32 - arg0) / 54);
        field6559++;
        class31 var3 = class533.method3036(arg1, (byte) -126);
        int var4 = arg1.method3880(8);
        int var5 = arg1.method3880(8);
        return new class650(var3.field485, var3.field479, var3.field489, var3.field481, var3.field487, var3.field480, var3.field482, var3.field484, var3.field477, var4, var5);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 20)
    public static void method2689(int arg0) {
        field6557 = null;
        if (arg0 != -1) {
            method2689(94);
        }
        field6551 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lvi;Lok;II)V", line = 31)
    public final void method2690(class499 arg0, class228 arg1, int arg2, int arg3) {
        field6558++;
        if (arg1.field3434 == null) {
            return;
        }
        if (arg2 < 0) {
            this.method2691((byte) -123, arg1);
        } else {
            this.method2694(80, arg1, arg2);
        }
        float var5 = arg1.field3434.field9829;
        float var6 = arg1.field3434.field9849;
        float var7 = arg1.field3434.field9832;
        float var8 = arg1.field3434.field9841;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class389 var12 = arg0.field7068.field8273;
            for (class389 var13 = var12.field5773; var13 != var12; var13 = var13.field5773) {
                class635 var14 = (class635) var13;
                int var15 = (int) ((float) (var14.field8987 >> 12) * var7 + (float) (var14.field8988 >> 12) * var6 + (float) (var14.field8982 >> 12) * var5 + var8);
                this.field6569[var9++] = var15;
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var11 < var15) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class608.method3411((byte) -94, var16) + 1 - this.field6561;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            int var18 = 0;
            class389 var19 = var12.field5773;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field6571 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field6567[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field6568[var24] = 0;
                }
                while (var12 != var19) {
                    class635 var25 = (class635) var19;
                    if (var22) {
                        var20 = var25.field8990;
                        var22 = false;
                        var21 = var25.field8983;
                    }
                    if (var18 > 0 && (var25.field8990 != var20 || var21 != var25.field8983)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field6569[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field6567[var26] < 64) {
                            this.field6566[var26][this.field6567[var26]++] = var25;
                        } else {
                            label106: {
                                if (this.field6567[var26] == 64) {
                                    if (this.field6571 == 64) {
                                        break label106;
                                    }
                                    this.field6567[var26] += this.field6571++ + 1;
                                }
                                class635[] var10000 = this.field6570[this.field6567[var26] - 1 - 64];
                                int var10002 = this.field6567[var26] - 65;
                                int var10004 = this.field6568[this.field6567[var26] - 65];
                                this.field6568[var10002] = this.field6568[this.field6567[var26] - 65] + 1;
                                var10000[var10004] = var25;
                            }
                        }
                    }
                    var19 = var19.field5773;
                }
                if (var20 >= 0) {
                    arg1.method1510((byte) 125, var20);
                } else {
                    arg1.method1510((byte) -31, -1);
                }
                if (var21 && class486.field6912 != arg1.field3538) {
                    arg1.method132(class486.field6912);
                } else if (arg1.field3538 != 1.0F) {
                    arg1.method132(1.0F);
                }
                this.method2692(var16, arg1, false);
            }
        } catch (Exception var27) {
        }
        this.method2693(arg1, (byte) 126);
        if (arg3 != -1) {
            this.field6555 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLok;)V", line = 201)
    private final void method2691(byte arg0, class228 arg1) {
        field6554++;
        class486.field6912 = arg1.field3538;
        arg1.method1561(1);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method1534(120, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        int var3 = 79 % ((-arg0 - 48) / 47);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILok;Z)V", line = 220)
    private final void method2692(int arg0, class228 arg1, boolean arg2) {
        field6550++;
        OpenGL.glGetFloatv(2982, this.field6555, 0);
        float var4 = this.field6555[0];
        float var5 = this.field6555[4];
        float var6 = this.field6555[8];
        float var7 = this.field6555[1];
        float var8 = this.field6555[5];
        float var9 = this.field6555[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        if (arg2) {
            this.field6556 = null;
        }
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field6556.field9761 = 0;
        float var18 = var9 - var6;
        if (arg1.field3514) {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field6567[var19] > 64 ? 64 : this.field6567[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class635 var34 = this.field6566[var19][var21];
                        int var35 = var34.field8986;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field8982 >> 12);
                        float var41 = (float) (var34.field8988 >> 12);
                        float var42 = (float) (var34.field8987 >> 12);
                        int var43 = var34.field8989 >> 12;
                        this.field6556.method1592(arg2, 0.0F);
                        this.field6556.method1592(false, 0.0F);
                        this.field6556.method1592(false, (float) (-var43) * var10 + var40);
                        this.field6556.method1592(false, (float) (-var43) * var11 + var41);
                        this.field6556.method1592(false, (float) (-var43) * var12 + var42);
                        this.field6556.method3853((byte) 51, var36);
                        this.field6556.method3853((byte) 51, var37);
                        this.field6556.method3853((byte) 51, var38);
                        this.field6556.method3853((byte) 51, var39);
                        this.field6556.method1592(false, 1.0F);
                        this.field6556.method1592(false, 0.0F);
                        this.field6556.method1592(false, (float) var43 * var13 + var40);
                        this.field6556.method1592(false, (float) var43 * var14 + var41);
                        this.field6556.method1592(arg2, (float) var43 * var15 + var42);
                        this.field6556.method3853((byte) 51, var36);
                        this.field6556.method3853((byte) 51, var37);
                        this.field6556.method3853((byte) 51, var38);
                        this.field6556.method3853((byte) 51, var39);
                        this.field6556.method1592(false, 1.0F);
                        this.field6556.method1592(arg2, 1.0F);
                        this.field6556.method1592(false, (float) var43 * var10 + var40);
                        this.field6556.method1592(false, (float) var43 * var11 + var41);
                        this.field6556.method1592(false, (float) var43 * var12 + var42);
                        this.field6556.method3853((byte) 51, var36);
                        this.field6556.method3853((byte) 51, var37);
                        this.field6556.method3853((byte) 51, var38);
                        this.field6556.method3853((byte) 51, var39);
                        this.field6556.method1592(false, 0.0F);
                        this.field6556.method1592(arg2, 1.0F);
                        this.field6556.method1592(false, (float) var43 * var16 + var40);
                        this.field6556.method1592(false, (float) var43 * var17 + var41);
                        this.field6556.method1592(false, (float) var43 * var18 + var42);
                        this.field6556.method3853((byte) 51, var36);
                        this.field6556.method3853((byte) 51, var37);
                        this.field6556.method3853((byte) 51, var38);
                        this.field6556.method3853((byte) 51, var39);
                    }
                    if (this.field6567[var19] > 64) {
                        int var22 = this.field6567[var19] - 64 - 1;
                        for (int var23 = this.field6568[var22] - 1; var23 >= 0; var23--) {
                            class635 var24 = this.field6570[var22][var23];
                            int var25 = var24.field8986;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field8982 >> 12);
                            float var31 = (float) (var24.field8988 >> 12);
                            float var32 = (float) (var24.field8987 >> 12);
                            int var33 = var24.field8989 >> 12;
                            this.field6556.method1592(false, 0.0F);
                            this.field6556.method1592(false, 0.0F);
                            this.field6556.method1592(arg2, (float) (-var33) * var10 + var30);
                            this.field6556.method1592(false, (float) (-var33) * var11 + var31);
                            this.field6556.method1592(arg2, (float) (-var33) * var12 + var32);
                            this.field6556.method3853((byte) 51, var26);
                            this.field6556.method3853((byte) 51, var27);
                            this.field6556.method3853((byte) 51, var28);
                            this.field6556.method3853((byte) 51, var29);
                            this.field6556.method1592(false, 1.0F);
                            this.field6556.method1592(false, 0.0F);
                            this.field6556.method1592(false, (float) var33 * var13 + var30);
                            this.field6556.method1592(arg2, (float) var33 * var14 + var31);
                            this.field6556.method1592(false, (float) var33 * var15 + var32);
                            this.field6556.method3853((byte) 51, var26);
                            this.field6556.method3853((byte) 51, var27);
                            this.field6556.method3853((byte) 51, var28);
                            this.field6556.method3853((byte) 51, var29);
                            this.field6556.method1592(false, 1.0F);
                            this.field6556.method1592(false, 1.0F);
                            this.field6556.method1592(false, (float) var33 * var10 + var30);
                            this.field6556.method1592(false, (float) var33 * var11 + var31);
                            this.field6556.method1592(false, (float) var33 * var12 + var32);
                            this.field6556.method3853((byte) 51, var26);
                            this.field6556.method3853((byte) 51, var27);
                            this.field6556.method3853((byte) 51, var28);
                            this.field6556.method3853((byte) 51, var29);
                            this.field6556.method1592(arg2, 0.0F);
                            this.field6556.method1592(arg2, 1.0F);
                            this.field6556.method1592(false, (float) var33 * var16 + var30);
                            this.field6556.method1592(false, (float) var33 * var17 + var31);
                            this.field6556.method1592(arg2, (float) var33 * var18 + var32);
                            this.field6556.method3853((byte) 51, var26);
                            this.field6556.method3853((byte) 51, var27);
                            this.field6556.method3853((byte) 51, var28);
                            this.field6556.method3853((byte) 51, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field6567[var44] <= 64 ? this.field6567[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class635 var59 = this.field6566[var44][var46];
                        int var60 = var59.field8986;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field8982 >> 12);
                        float var66 = (float) (var59.field8988 >> 12);
                        float var67 = (float) (var59.field8987 >> 12);
                        int var68 = var59.field8989 >> 12;
                        this.field6556.method1593((byte) 26, 0.0F);
                        this.field6556.method1593((byte) 53, 0.0F);
                        this.field6556.method1593((byte) 66, (float) (-var68) * var10 + var65);
                        this.field6556.method1593((byte) 54, (float) (-var68) * var11 + var66);
                        this.field6556.method1593((byte) 104, (float) (-var68) * var12 + var67);
                        this.field6556.method3853((byte) 51, var61);
                        this.field6556.method3853((byte) 51, var62);
                        this.field6556.method3853((byte) 51, var63);
                        this.field6556.method3853((byte) 51, var64);
                        this.field6556.method1593((byte) 107, 1.0F);
                        this.field6556.method1593((byte) 101, 0.0F);
                        this.field6556.method1593((byte) 86, (float) var68 * var13 + var65);
                        this.field6556.method1593((byte) 119, (float) var68 * var14 + var66);
                        this.field6556.method1593((byte) 123, (float) var68 * var15 + var67);
                        this.field6556.method3853((byte) 51, var61);
                        this.field6556.method3853((byte) 51, var62);
                        this.field6556.method3853((byte) 51, var63);
                        this.field6556.method3853((byte) 51, var64);
                        this.field6556.method1593((byte) 85, 1.0F);
                        this.field6556.method1593((byte) 107, 1.0F);
                        this.field6556.method1593((byte) 89, (float) var68 * var10 + var65);
                        this.field6556.method1593((byte) 86, (float) var68 * var11 + var66);
                        this.field6556.method1593((byte) 73, (float) var68 * var12 + var67);
                        this.field6556.method3853((byte) 51, var61);
                        this.field6556.method3853((byte) 51, var62);
                        this.field6556.method3853((byte) 51, var63);
                        this.field6556.method3853((byte) 51, var64);
                        this.field6556.method1593((byte) 98, 0.0F);
                        this.field6556.method1593((byte) 38, 1.0F);
                        this.field6556.method1593((byte) 54, (float) var68 * var16 + var65);
                        this.field6556.method1593((byte) 112, (float) var68 * var17 + var66);
                        this.field6556.method1593((byte) 34, (float) var68 * var18 + var67);
                        this.field6556.method3853((byte) 51, var61);
                        this.field6556.method3853((byte) 51, var62);
                        this.field6556.method3853((byte) 51, var63);
                        this.field6556.method3853((byte) 51, var64);
                    }
                    if (this.field6567[var44] > 64) {
                        int var47 = this.field6567[var44] - 1 - 64;
                        for (int var48 = this.field6568[var47] - 1; var48 >= 0; var48--) {
                            class635 var49 = this.field6570[var47][var48];
                            int var50 = var49.field8986;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field8982 >> 12);
                            float var56 = (float) (var49.field8988 >> 12);
                            float var57 = (float) (var49.field8987 >> 12);
                            int var58 = var49.field8989 >> 12;
                            this.field6556.method1593((byte) 29, 0.0F);
                            this.field6556.method1593((byte) 55, 0.0F);
                            this.field6556.method1593((byte) 116, (float) (-var58) * var10 + var55);
                            this.field6556.method1593((byte) 42, (float) (-var58) * var11 + var56);
                            this.field6556.method1593((byte) 89, (float) (-var58) * var12 + var57);
                            this.field6556.method3853((byte) 51, var51);
                            this.field6556.method3853((byte) 51, var52);
                            this.field6556.method3853((byte) 51, var53);
                            this.field6556.method3853((byte) 51, var54);
                            this.field6556.method1593((byte) 53, 1.0F);
                            this.field6556.method1593((byte) 81, 0.0F);
                            this.field6556.method1593((byte) 106, (float) var58 * var13 + var55);
                            this.field6556.method1593((byte) 89, (float) var58 * var14 + var56);
                            this.field6556.method1593((byte) 54, (float) var58 * var15 + var57);
                            this.field6556.method3853((byte) 51, var51);
                            this.field6556.method3853((byte) 51, var52);
                            this.field6556.method3853((byte) 51, var53);
                            this.field6556.method3853((byte) 51, var54);
                            this.field6556.method1593((byte) 104, 1.0F);
                            this.field6556.method1593((byte) 123, 1.0F);
                            this.field6556.method1593((byte) 101, (float) var58 * var10 + var55);
                            this.field6556.method1593((byte) 34, (float) var58 * var11 + var56);
                            this.field6556.method1593((byte) 78, (float) var58 * var12 + var57);
                            this.field6556.method3853((byte) 51, var51);
                            this.field6556.method3853((byte) 51, var52);
                            this.field6556.method3853((byte) 51, var53);
                            this.field6556.method3853((byte) 51, var54);
                            this.field6556.method1593((byte) 78, 0.0F);
                            this.field6556.method1593((byte) 72, 1.0F);
                            this.field6556.method1593((byte) 81, (float) var58 * var16 + var55);
                            this.field6556.method1593((byte) 91, (float) var58 * var17 + var56);
                            this.field6556.method1593((byte) 31, (float) var58 * var18 + var57);
                            this.field6556.method3853((byte) 51, var51);
                            this.field6556.method3853((byte) 51, var52);
                            this.field6556.method3853((byte) 51, var53);
                            this.field6556.method3853((byte) 51, var54);
                        }
                    }
                }
            }
        }
        if (this.field6556.field9761 != 0) {
            this.field6564.method1143((byte) -125, this.field6556.field9761, 24, this.field6556.field9796);
            arg1.method1562((byte) -12, this.field6563, null, this.field6565, this.field6562);
            arg1.method1532(-22319, 0, this.field6556.field9761 / 24, 7);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lok;B)V", line = 576)
    private final void method2693(class228 arg0, byte arg1) {
        int var3 = -90 / ((47 - arg1) / 40);
        arg0.method1534(41, true);
        field6552++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class486.field6912 != arg0.field3538) {
            arg0.method132(class486.field6912);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILok;I)V", line = 591)
    private final void method2694(int arg0, class228 arg1, int arg2) {
        field6553++;
        class486.field6912 = arg1.field3538;
        arg1.method1511(31313, (float) arg2);
        arg1.method1499(1);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method1534(113, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        if (arg0 <= 58) {
            this.method2693(null, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILok;)V", line = 608)
    public final void method2695(int arg0, class228 arg1) {
        field6560++;
        this.field6564 = arg1.method1573(true, 196584, arg0, false, null);
        this.field6563 = new class512(this.field6564, 5126, 2, 0);
        this.field6562 = new class512(this.field6564, 5126, 3, 8);
        this.field6565 = new class512(this.field6564, 5121, 4, 20);
    }
}
