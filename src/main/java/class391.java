import jaggl.OpenGL;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class391 {

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[F")
    private float[] field5842 = new float[16];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Ljv;")
    private class583 field5836 = new class583(786336);

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    private int field5844 = class211.method1380(1600, (byte) -5);

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "[I")
    private int[] field5849 = new int[1600];

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
    private int[] field5851 = new int[8191];

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[[Ltl;")
    private class521[][] field5852 = new class521[1600][64];

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    private int field5854 = 0;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "[I")
    private int[] field5850 = new int[64];

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[[Ltl;")
    private class521[][] field5853 = new class521[64][768];

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Las;")
    private class25 field5845;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Las;")
    private class25 field5846;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Las;")
    private class25 field5847;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lpi;")
    private class423 field5848;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljj;I)V", line = 6)
    private final void method2361(class66 arg0, int arg1) {
        arg0.method616(true, arg1 - 1600);
        field5838++;
        if (arg1 != 1600) {
            this.field5844 = -76;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class576.field8223 != arg0.field1209) {
            arg0.method569(class576.field8223);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjj;Z)V", line = 23)
    private final void method2362(int arg0, class66 arg1, boolean arg2) {
        if (!arg2) {
            this.method2364(-7, null);
        }
        field5839++;
        OpenGL.glGetFloatv(2982, this.field5842, 0);
        float var4 = this.field5842[0];
        float var5 = this.field5842[4];
        float var6 = this.field5842[8];
        float var7 = this.field5842[1];
        float var8 = this.field5842[5];
        float var9 = this.field5842[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5836.field3913 = 0;
        float var18 = var9 - var6;
        if (arg1.field1187) {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field5849[var44] > 64 ? 64 : this.field5849[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class521 var59 = this.field5852[var44][var46];
                        int var60 = var59.field7235;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field7240 >> 12);
                        float var66 = (float) (var59.field7242 >> 12);
                        float var67 = (float) (var59.field7246 >> 12);
                        int var68 = var59.field7237 >> 12;
                        this.field5836.method3339(0.0F, -9720);
                        this.field5836.method3339(0.0F, -9720);
                        this.field5836.method3339((float) (-var68) * var10 + var65, -9720);
                        this.field5836.method3339((float) (-var68) * var11 + var66, -9720);
                        this.field5836.method3339((float) (-var68) * var12 + var67, -9720);
                        this.field5836.method1710(var61, 46);
                        this.field5836.method1710(var62, 118);
                        this.field5836.method1710(var63, 24);
                        this.field5836.method1710(var64, 56);
                        this.field5836.method3339(1.0F, -9720);
                        this.field5836.method3339(0.0F, -9720);
                        this.field5836.method3339((float) var68 * var13 + var65, -9720);
                        this.field5836.method3339((float) var68 * var14 + var66, -9720);
                        this.field5836.method3339((float) var68 * var15 + var67, -9720);
                        this.field5836.method1710(var61, 75);
                        this.field5836.method1710(var62, 57);
                        this.field5836.method1710(var63, 66);
                        this.field5836.method1710(var64, 79);
                        this.field5836.method3339(1.0F, -9720);
                        this.field5836.method3339(1.0F, -9720);
                        this.field5836.method3339((float) var68 * var10 + var65, -9720);
                        this.field5836.method3339((float) var68 * var11 + var66, -9720);
                        this.field5836.method3339((float) var68 * var12 + var67, -9720);
                        this.field5836.method1710(var61, 31);
                        this.field5836.method1710(var62, 58);
                        this.field5836.method1710(var63, 96);
                        this.field5836.method1710(var64, 84);
                        this.field5836.method3339(0.0F, -9720);
                        this.field5836.method3339(1.0F, -9720);
                        this.field5836.method3339((float) var68 * var16 + var65, -9720);
                        this.field5836.method3339((float) var68 * var17 + var66, -9720);
                        this.field5836.method3339((float) var68 * var18 + var67, -9720);
                        this.field5836.method1710(var61, 75);
                        this.field5836.method1710(var62, 71);
                        this.field5836.method1710(var63, 34);
                        this.field5836.method1710(var64, 91);
                    }
                    if (this.field5849[var44] > 64) {
                        int var47 = this.field5849[var44] - 64 - 1;
                        for (int var48 = this.field5850[var47] - 1; var48 >= 0; var48--) {
                            class521 var49 = this.field5853[var47][var48];
                            int var50 = var49.field7235;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field7240 >> 12);
                            float var56 = (float) (var49.field7242 >> 12);
                            float var57 = (float) (var49.field7246 >> 12);
                            int var58 = var49.field7237 >> 12;
                            this.field5836.method3339(0.0F, -9720);
                            this.field5836.method3339(0.0F, -9720);
                            this.field5836.method3339((float) (-var58) * var10 + var55, -9720);
                            this.field5836.method3339((float) (-var58) * var11 + var56, -9720);
                            this.field5836.method3339((float) (-var58) * var12 + var57, -9720);
                            this.field5836.method1710(var51, 108);
                            this.field5836.method1710(var52, 81);
                            this.field5836.method1710(var53, 57);
                            this.field5836.method1710(var54, 83);
                            this.field5836.method3339(1.0F, -9720);
                            this.field5836.method3339(0.0F, -9720);
                            this.field5836.method3339((float) var58 * var13 + var55, -9720);
                            this.field5836.method3339((float) var58 * var14 + var56, -9720);
                            this.field5836.method3339((float) var58 * var15 + var57, -9720);
                            this.field5836.method1710(var51, 32);
                            this.field5836.method1710(var52, 119);
                            this.field5836.method1710(var53, 27);
                            this.field5836.method1710(var54, 105);
                            this.field5836.method3339(1.0F, -9720);
                            this.field5836.method3339(1.0F, -9720);
                            this.field5836.method3339((float) var58 * var10 + var55, -9720);
                            this.field5836.method3339((float) var58 * var11 + var56, -9720);
                            this.field5836.method3339((float) var58 * var12 + var57, -9720);
                            this.field5836.method1710(var51, 28);
                            this.field5836.method1710(var52, 66);
                            this.field5836.method1710(var53, 125);
                            this.field5836.method1710(var54, 24);
                            this.field5836.method3339(0.0F, -9720);
                            this.field5836.method3339(1.0F, -9720);
                            this.field5836.method3339((float) var58 * var16 + var55, -9720);
                            this.field5836.method3339((float) var58 * var17 + var56, -9720);
                            this.field5836.method3339((float) var58 * var18 + var57, -9720);
                            this.field5836.method1710(var51, 74);
                            this.field5836.method1710(var52, 124);
                            this.field5836.method1710(var53, 21);
                            this.field5836.method1710(var54, 102);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field5849[var19] <= 64 ? this.field5849[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class521 var34 = this.field5852[var19][var21];
                        int var35 = var34.field7235;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field7240 >> 12);
                        float var41 = (float) (var34.field7242 >> 12);
                        float var42 = (float) (var34.field7246 >> 12);
                        int var43 = var34.field7237 >> 12;
                        this.field5836.method3338(-1325457552, 0.0F);
                        this.field5836.method3338(-1325457552, 0.0F);
                        this.field5836.method3338(-1325457552, (float) (-var43) * var10 + var40);
                        this.field5836.method3338(-1325457552, (float) (-var43) * var11 + var41);
                        this.field5836.method3338(-1325457552, (float) (-var43) * var12 + var42);
                        this.field5836.method1710(var36, 108);
                        this.field5836.method1710(var37, 51);
                        this.field5836.method1710(var38, 52);
                        this.field5836.method1710(var39, 116);
                        this.field5836.method3338(-1325457552, 1.0F);
                        this.field5836.method3338(-1325457552, 0.0F);
                        this.field5836.method3338(-1325457552, (float) var43 * var13 + var40);
                        this.field5836.method3338(-1325457552, (float) var43 * var14 + var41);
                        this.field5836.method3338(-1325457552, (float) var43 * var15 + var42);
                        this.field5836.method1710(var36, 21);
                        this.field5836.method1710(var37, 55);
                        this.field5836.method1710(var38, 72);
                        this.field5836.method1710(var39, 101);
                        this.field5836.method3338(-1325457552, 1.0F);
                        this.field5836.method3338(-1325457552, 1.0F);
                        this.field5836.method3338(-1325457552, (float) var43 * var10 + var40);
                        this.field5836.method3338(-1325457552, (float) var43 * var11 + var41);
                        this.field5836.method3338(-1325457552, (float) var43 * var12 + var42);
                        this.field5836.method1710(var36, 117);
                        this.field5836.method1710(var37, 55);
                        this.field5836.method1710(var38, 91);
                        this.field5836.method1710(var39, 66);
                        this.field5836.method3338(-1325457552, 0.0F);
                        this.field5836.method3338(-1325457552, 1.0F);
                        this.field5836.method3338(-1325457552, (float) var43 * var16 + var40);
                        this.field5836.method3338(-1325457552, (float) var43 * var17 + var41);
                        this.field5836.method3338(-1325457552, (float) var43 * var18 + var42);
                        this.field5836.method1710(var36, 51);
                        this.field5836.method1710(var37, 109);
                        this.field5836.method1710(var38, 42);
                        this.field5836.method1710(var39, 28);
                    }
                    if (this.field5849[var19] > 64) {
                        int var22 = this.field5849[var19] - 64 - 1;
                        for (int var23 = this.field5850[var22] - 1; var23 >= 0; var23--) {
                            class521 var24 = this.field5853[var22][var23];
                            int var25 = var24.field7235;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field7240 >> 12);
                            float var31 = (float) (var24.field7242 >> 12);
                            float var32 = (float) (var24.field7246 >> 12);
                            int var33 = var24.field7237 >> 12;
                            this.field5836.method3338(-1325457552, 0.0F);
                            this.field5836.method3338(-1325457552, 0.0F);
                            this.field5836.method3338(-1325457552, (float) (-var33) * var10 + var30);
                            this.field5836.method3338(-1325457552, (float) (-var33) * var11 + var31);
                            this.field5836.method3338(-1325457552, (float) (-var33) * var12 + var32);
                            this.field5836.method1710(var26, 39);
                            this.field5836.method1710(var27, 65);
                            this.field5836.method1710(var28, 71);
                            this.field5836.method1710(var29, 108);
                            this.field5836.method3338(-1325457552, 1.0F);
                            this.field5836.method3338(-1325457552, 0.0F);
                            this.field5836.method3338(-1325457552, (float) var33 * var13 + var30);
                            this.field5836.method3338(-1325457552, (float) var33 * var14 + var31);
                            this.field5836.method3338(-1325457552, (float) var33 * var15 + var32);
                            this.field5836.method1710(var26, 72);
                            this.field5836.method1710(var27, 89);
                            this.field5836.method1710(var28, 23);
                            this.field5836.method1710(var29, 68);
                            this.field5836.method3338(-1325457552, 1.0F);
                            this.field5836.method3338(-1325457552, 1.0F);
                            this.field5836.method3338(-1325457552, (float) var33 * var10 + var30);
                            this.field5836.method3338(-1325457552, (float) var33 * var11 + var31);
                            this.field5836.method3338(-1325457552, (float) var33 * var12 + var32);
                            this.field5836.method1710(var26, 45);
                            this.field5836.method1710(var27, 106);
                            this.field5836.method1710(var28, 40);
                            this.field5836.method1710(var29, 127);
                            this.field5836.method3338(-1325457552, 0.0F);
                            this.field5836.method3338(-1325457552, 1.0F);
                            this.field5836.method3338(-1325457552, (float) var33 * var16 + var30);
                            this.field5836.method3338(-1325457552, (float) var33 * var17 + var31);
                            this.field5836.method3338(-1325457552, (float) var33 * var18 + var32);
                            this.field5836.method1710(var26, 105);
                            this.field5836.method1710(var27, 109);
                            this.field5836.method1710(var28, 76);
                            this.field5836.method1710(var29, 11);
                        }
                    }
                }
            }
        }
        if (this.field5836.field3913 != 0) {
            this.field5848.method1556(24, this.field5836.field3952, (byte) 88, this.field5836.field3913);
            arg1.method636(this.field5847, false, null, this.field5845, this.field5846);
            arg1.method550(0, 7, this.field5836.field3913 / 24, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Ljj;I)V", line = 378)
    private final void method2363(class66 arg0, int arg1) {
        if (arg1 < 35) {
            method2365(-119, null, -6);
        }
        class576.field8223 = arg0.field1209;
        field5837++;
        arg0.method575((byte) -79);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method616(false, 0);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjj;)V", line = 399)
    public final void method2364(int arg0, class66 arg1) {
        field5840++;
        int var3 = -116 / ((arg0 + 18) / 34);
        this.field5848 = arg1.method570(null, 1, true, 24, 196584);
        this.field5847 = new class25(this.field5848, 5126, 2, 0);
        this.field5846 = new class25(this.field5848, 5126, 3, 8);
        this.field5845 = new class25(this.field5848, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/io/File;I)[B", line = 412)
    public static final byte[] method2365(int arg0, File arg1, int arg2) {
        field5841++;
        try {
            byte[] var3 = new byte[arg0];
            if (arg2 == 0) {
                class515.method2889(false, arg1, arg0, var3);
                return var3;
            } else {
                return null;
            }
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lsh;ILjj;)V", line = 433)
    public final void method2366(class616 arg0, int arg1, class66 arg2) {
        field5843++;
        if (arg2.field1274 == null) {
            return;
        }
        this.method2363(arg2, 104);
        float var4 = arg2.field1274.field3633;
        float var5 = arg2.field1274.field3638;
        if (arg1 != 0) {
            method2365(12, null, -34);
        }
        float var6 = arg2.field1274.field3632;
        float var7 = arg2.field1274.field3628;
        try {
            if (arg0.field8726) {
                int var8 = arg0.field8725 - arg0.field8724;
                int var9;
                if ((var8 + 2) > 1600) {
                    var9 = (class211.method1380(var8, (byte) 119) - this.field5844) + 1;
                    var8 = (var8 >> var9) + 2;
                } else {
                    var9 = 0;
                    var8 += 2;
                }
                class327 var10 = arg0.field8719.field6889;
                class327 var11 = var10.field4709;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field5854 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field5849[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field5850[var16] = 0;
                    }
                    while (var10 != var11) {
                        class521 var17 = (class521) var11;
                        if (var14) {
                            var14 = false;
                            var13 = var17.field7245;
                            var12 = var17.field7243;
                        } else if (var17.field7243 != var12 || var17.field7245 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field7246 >> 12) * var6 + (float) (var17.field7242 >> 12) * var5 + (float) (var17.field7240 >> 12) * var4 + var7) - arg0.field8724 >> var9;
                        if (var18 < 1600) {
                            if (this.field5849[var18] >= 64) {
                                label194: {
                                    if (this.field5849[var18] == 64) {
                                        if (this.field5854 == 64) {
                                            break label194;
                                        }
                                        this.field5849[var18] += (this.field5854++) + 1;
                                    }
                                    this.field5853[this.field5849[var18] - 64 - 1][this.field5850[this.field5849[var18] - 64 - 1]++] = var17;
                                }
                            } else {
                                this.field5852[var18][this.field5849[var18]++] = var17;
                            }
                        }
                        var11 = var11.field4709;
                    }
                    if (var12 >= 0) {
                        arg2.method514(var12, true);
                    } else {
                        arg2.method514(-1, true);
                    }
                    if (var13 && class576.field8223 != arg2.field1209) {
                        arg2.method569(class576.field8223);
                    } else if (arg2.field1209 != 1.0F) {
                        arg2.method569(1.0F);
                    }
                    this.method2362(var8, arg2, true);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class327 var22 = arg0.field8719.field6889;
                for (class327 var23 = var22.field4709; var23 != var22; var23 = var23.field4709) {
                    class521 var24 = (class521) var23;
                    int var25 = (int) ((float) (var24.field7246 >> 12) * var6 + (float) (var24.field7242 >> 12) * var5 + (float) (var24.field7240 >> 12) * var4 + var7);
                    if (var25 < var20) {
                        var20 = var25;
                    }
                    this.field5851[var19++] = var25;
                    if (var25 > var21) {
                        var21 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class211.method1380(var26, (byte) 121) + 1 - this.field5844;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                int var28 = 0;
                class327 var29 = var22.field4709;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field5854 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field5849[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field5850[var34] = 0;
                    }
                    while (var22 != var29) {
                        class521 var35 = (class521) var29;
                        if (var32) {
                            var32 = false;
                            var30 = var35.field7243;
                            var31 = var35.field7245;
                        }
                        if (var28 > 0 && (var35.field7243 != var30 || var35.field7245 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field5851[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field5849[var36] < 64) {
                                this.field5852[var36][this.field5849[var36]++] = var35;
                            } else {
                                label145: {
                                    if (this.field5849[var36] == 64) {
                                        if (this.field5854 == 64) {
                                            break label145;
                                        }
                                        this.field5849[var36] += this.field5854++ + 1;
                                    }
                                    this.field5853[this.field5849[var36] - 64 - 1][this.field5850[this.field5849[var36] - 1 - 64]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field4709;
                    }
                    if (var30 < 0) {
                        arg2.method514(-1, true);
                    } else {
                        arg2.method514(var30, true);
                    }
                    if (var31 && class576.field8223 != arg2.field1209) {
                        arg2.method569(class576.field8223);
                    } else if (arg2.field1209 != 1.0F) {
                        arg2.method569(1.0F);
                    }
                    this.method2362(var26, arg2, true);
                }
            }
        } catch (Exception var37) {
        }
        this.method2361(arg2, arg1 + 1600);
    }
}
