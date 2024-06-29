import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class703 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[F")
    private float[] field9779 = new float[16];

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lrn;")
    private class267 field9782 = new class267(786336);

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    private int field9792 = class378.method2374((byte) 110, 1600);

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "[I")
    private int[] field9793 = new int[1600];

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "[[Lab;")
    private class668[][] field9797 = new class668[64][768];

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    private int field9795 = 0;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "[[Lab;")
    private class668[][] field9798 = new class668[1600][64];

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "[I")
    private int[] field9796 = new int[8191];

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "[I")
    private int[] field9794 = new int[64];

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lqfa;")
    public static class98 field9784 = new class98(115, 3);

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field9786 = new String[200];

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field9781;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field9783;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field9785;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lqea;")
    private class126 field9791;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lvp;")
    private class186 field9788;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lvp;")
    private class186 field9789;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Lvp;")
    private class186 field9790;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[[Lct;")
    public static class144[][] field9787;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILeea;I)V")
    private final void method3951(int arg0, class131 arg1, int arg2) {
        class123.field1477 = arg1.field1866;
        field9777++;
        arg1.method952((float) arg2, (byte) -89);
        arg1.method910(-17);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(arg0);
        arg1.method881((byte) 87, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILeea;)V")
    private final void method3952(int arg0, class131 arg1) {
        class123.field1477 = arg1.field1866;
        if (arg0 != 4) {
            this.method3956(null, (byte) -99, -5, null);
        }
        field9778++;
        arg1.method939(32);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method881((byte) 87, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lee;B)V")
    public static final void method3953(class675 arg0, byte arg1) {
        field9783++;
        int var2 = arg0.method3693(arg1 + 215);
        class62.field762 = new class439[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class62.field762[var3] = new class439();
            class62.field762[var3].field6253 = arg0.method3693(-100);
            class62.field762[var3].field6248 = arg0.method3726(-74);
        }
        class700.field9766 = arg0.method3693(2);
        class503.field7223 = arg0.method3693(arg1 ^ 0xFFFFFF9A);
        class704.field9802 = arg0.method3693(7);
        class48.field568 = new class287[class503.field7223 + 1 - class700.field9766];
        if (arg1 != -108) {
            method3955(16);
        }
        for (int var4 = 0; var4 < class704.field9802; var4++) {
            int var5 = arg0.method3693(-57);
            class287 var6 = class48.field568[var5] = new class287();
            var6.field2186 = arg0.method3750((byte) 35);
            var6.field2182 = arg0.method3703(120);
            var6.field4067 = class700.field9766 + var5;
            var6.field4068 = arg0.method3726(-46);
            var6.field4062 = arg0.method3726(-106);
        }
        class360.field5115 = arg0.method3703(94);
        class374.field5243 = true;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(ILeea;)V")
    public final void method3954(int arg0, class131 arg1) {
        this.field9791 = arg1.method903(null, 196584, 24, true, (byte) 46);
        field9780++;
        this.field9789 = new class186(this.field9791, 5126, 2, 0);
        if (arg0 > -66) {
            this.method3951(-93, null, 70);
        }
        this.field9788 = new class186(this.field9791, 5126, 3, 8);
        this.field9790 = new class186(this.field9791, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method3955(int arg0) {
        if (arg0 != 64) {
            field9786 = null;
        }
        field9786 = null;
        field9784 = null;
        field9787 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ldm;BILeea;)V")
    public final void method3956(class50 arg0, byte arg1, int arg2, class131 arg3) {
        field9776++;
        if (arg3.field1816 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method3951(16385, arg3, arg2);
        } else {
            this.method3952(4, arg3);
        }
        float var5 = arg3.field1816.field661;
        float var6 = arg3.field1816.field656;
        float var7 = arg3.field1816.field638;
        float var8 = arg3.field1816.field632;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class661 var12 = arg0.field578.field4407;
            if (arg1 < 97) {
                this.method3956(null, (byte) 87, -14, null);
            }
            for (class661 var13 = var12.field9046; var13 != var12; var13 = var13.field9046) {
                class668 var14 = (class668) var13;
                int var15 = (int) ((float) (var14.field9072 >> 12) * var7 + (float) (var14.field9079 >> 12) * var6 + (float) (var14.field9077 >> 12) * var5 + var8);
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
                this.field9796[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class378.method2374((byte) 63, var16) + 1 - this.field9792;
                var16 = (var16 >> var17) + 2;
            }
            class661 var18 = var12.field9046;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field9795 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field9793[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field9794[var24] = 0;
                }
                while (var12 != var18) {
                    class668 var25 = (class668) var18;
                    if (var22) {
                        var20 = var25.field9082;
                        var22 = false;
                        var21 = var25.field9074;
                    }
                    if (var19 > 0 && (var25.field9082 != var20 || var21 != var25.field9074)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field9796[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field9793[var26] < 64) {
                            this.field9798[var26][this.field9793[var26]++] = var25;
                        } else {
                            label106: {
                                if (this.field9793[var26] == 64) {
                                    if (this.field9795 == 64) {
                                        break label106;
                                    }
                                    this.field9793[var26] += this.field9795++ + 1;
                                }
                                this.field9797[this.field9793[var26] - 64 - 1][this.field9794[this.field9793[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field9046;
                }
                if (var20 < 0) {
                    arg3.method922(119, -1);
                } else {
                    arg3.method922(-85, var20);
                }
                if (var21 && class123.field1477 != arg3.field1866) {
                    arg3.method406(class123.field1477);
                } else if (arg3.field1866 != 1.0F) {
                    arg3.method406(1.0F);
                }
                this.method3958(var16, arg3, false);
            }
        } catch (Exception var27) {
        }
        this.method3957(arg3, 16385);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Leea;I)V")
    private final void method3957(class131 arg0, int arg1) {
        arg0.method881((byte) 87, true);
        field9785++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(arg1);
        if (class123.field1477 != arg0.field1866) {
            arg0.method406(class123.field1477);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILeea;Z)V")
    private final void method3958(int arg0, class131 arg1, boolean arg2) {
        field9781++;
        OpenGL.glGetFloatv(2982, this.field9779, 0);
        float var4 = this.field9779[0];
        float var5 = this.field9779[4];
        float var6 = this.field9779[8];
        float var7 = this.field9779[1];
        float var8 = this.field9779[5];
        float var9 = this.field9779[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        if (arg2) {
            this.method3951(109, null, 41);
        }
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field9782.field9146 = 0;
        if (arg1.field1865) {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field9793[var19] > 64 ? 64 : this.field9793[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class668 var34 = this.field9798[var19][var21];
                        int var35 = var34.field9084;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field9077 >> 12);
                        float var41 = (float) (var34.field9079 >> 12);
                        float var42 = (float) (var34.field9072 >> 12);
                        int var43 = var34.field9080 >> 12;
                        this.field9782.method1742(0.0F, -32197);
                        this.field9782.method1742(0.0F, -32197);
                        this.field9782.method1742((float) (-var43) * var10 + var40, -32197);
                        this.field9782.method1742((float) (-var43) * var11 + var41, -32197);
                        this.field9782.method1742((float) (-var43) * var12 + var42, -32197);
                        this.field9782.method3694(var36, -1528071456);
                        this.field9782.method3694(var37, -1528071456);
                        this.field9782.method3694(var38, -1528071456);
                        this.field9782.method3694(var39, -1528071456);
                        this.field9782.method1742(1.0F, -32197);
                        this.field9782.method1742(0.0F, -32197);
                        this.field9782.method1742((float) var43 * var13 + var40, -32197);
                        this.field9782.method1742((float) var43 * var14 + var41, -32197);
                        this.field9782.method1742((float) var43 * var15 + var42, -32197);
                        this.field9782.method3694(var36, -1528071456);
                        this.field9782.method3694(var37, -1528071456);
                        this.field9782.method3694(var38, -1528071456);
                        this.field9782.method3694(var39, -1528071456);
                        this.field9782.method1742(1.0F, -32197);
                        this.field9782.method1742(1.0F, -32197);
                        this.field9782.method1742((float) var43 * var10 + var40, -32197);
                        this.field9782.method1742((float) var43 * var11 + var41, -32197);
                        this.field9782.method1742((float) var43 * var12 + var42, -32197);
                        this.field9782.method3694(var36, -1528071456);
                        this.field9782.method3694(var37, -1528071456);
                        this.field9782.method3694(var38, -1528071456);
                        this.field9782.method3694(var39, -1528071456);
                        this.field9782.method1742(0.0F, -32197);
                        this.field9782.method1742(1.0F, -32197);
                        this.field9782.method1742((float) var43 * var16 + var40, -32197);
                        this.field9782.method1742((float) var43 * var17 + var41, -32197);
                        this.field9782.method1742((float) var43 * var18 + var42, -32197);
                        this.field9782.method3694(var36, -1528071456);
                        this.field9782.method3694(var37, -1528071456);
                        this.field9782.method3694(var38, -1528071456);
                        this.field9782.method3694(var39, -1528071456);
                    }
                    if (this.field9793[var19] > 64) {
                        int var22 = this.field9793[var19] - 65;
                        for (int var23 = this.field9794[var22] - 1; var23 >= 0; var23--) {
                            class668 var24 = this.field9797[var22][var23];
                            int var25 = var24.field9084;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field9077 >> 12);
                            float var31 = (float) (var24.field9079 >> 12);
                            float var32 = (float) (var24.field9072 >> 12);
                            int var33 = var24.field9080 >> 12;
                            this.field9782.method1742(0.0F, -32197);
                            this.field9782.method1742(0.0F, -32197);
                            this.field9782.method1742((float) (-var33) * var10 + var30, -32197);
                            this.field9782.method1742((float) (-var33) * var11 + var31, -32197);
                            this.field9782.method1742((float) (-var33) * var12 + var32, -32197);
                            this.field9782.method3694(var26, -1528071456);
                            this.field9782.method3694(var27, -1528071456);
                            this.field9782.method3694(var28, -1528071456);
                            this.field9782.method3694(var29, -1528071456);
                            this.field9782.method1742(1.0F, -32197);
                            this.field9782.method1742(0.0F, -32197);
                            this.field9782.method1742((float) var33 * var13 + var30, -32197);
                            this.field9782.method1742((float) var33 * var14 + var31, -32197);
                            this.field9782.method1742((float) var33 * var15 + var32, -32197);
                            this.field9782.method3694(var26, -1528071456);
                            this.field9782.method3694(var27, -1528071456);
                            this.field9782.method3694(var28, -1528071456);
                            this.field9782.method3694(var29, -1528071456);
                            this.field9782.method1742(1.0F, -32197);
                            this.field9782.method1742(1.0F, -32197);
                            this.field9782.method1742((float) var33 * var10 + var30, -32197);
                            this.field9782.method1742((float) var33 * var11 + var31, -32197);
                            this.field9782.method1742((float) var33 * var12 + var32, -32197);
                            this.field9782.method3694(var26, -1528071456);
                            this.field9782.method3694(var27, -1528071456);
                            this.field9782.method3694(var28, -1528071456);
                            this.field9782.method3694(var29, -1528071456);
                            this.field9782.method1742(0.0F, -32197);
                            this.field9782.method1742(1.0F, -32197);
                            this.field9782.method1742((float) var33 * var16 + var30, -32197);
                            this.field9782.method1742((float) var33 * var17 + var31, -32197);
                            this.field9782.method1742((float) var33 * var18 + var32, -32197);
                            this.field9782.method3694(var26, -1528071456);
                            this.field9782.method3694(var27, -1528071456);
                            this.field9782.method3694(var28, -1528071456);
                            this.field9782.method3694(var29, -1528071456);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field9793[var44] > 64 ? 64 : this.field9793[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class668 var59 = this.field9798[var44][var46];
                        int var60 = var59.field9084;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field9077 >> 12);
                        float var66 = (float) (var59.field9079 >> 12);
                        float var67 = (float) (var59.field9072 >> 12);
                        int var68 = var59.field9080 >> 12;
                        this.field9782.method1741(-1526311408, 0.0F);
                        this.field9782.method1741(-1526311408, 0.0F);
                        this.field9782.method1741(-1526311408, (float) (-var68) * var10 + var65);
                        this.field9782.method1741(-1526311408, (float) (-var68) * var11 + var66);
                        this.field9782.method1741(-1526311408, (float) (-var68) * var12 + var67);
                        this.field9782.method3694(var61, -1528071456);
                        this.field9782.method3694(var62, -1528071456);
                        this.field9782.method3694(var63, -1528071456);
                        this.field9782.method3694(var64, -1528071456);
                        this.field9782.method1741(-1526311408, 1.0F);
                        this.field9782.method1741(-1526311408, 0.0F);
                        this.field9782.method1741(-1526311408, (float) var68 * var13 + var65);
                        this.field9782.method1741(-1526311408, (float) var68 * var14 + var66);
                        this.field9782.method1741(-1526311408, (float) var68 * var15 + var67);
                        this.field9782.method3694(var61, -1528071456);
                        this.field9782.method3694(var62, -1528071456);
                        this.field9782.method3694(var63, -1528071456);
                        this.field9782.method3694(var64, -1528071456);
                        this.field9782.method1741(-1526311408, 1.0F);
                        this.field9782.method1741(-1526311408, 1.0F);
                        this.field9782.method1741(-1526311408, (float) var68 * var10 + var65);
                        this.field9782.method1741(-1526311408, (float) var68 * var11 + var66);
                        this.field9782.method1741(-1526311408, (float) var68 * var12 + var67);
                        this.field9782.method3694(var61, -1528071456);
                        this.field9782.method3694(var62, -1528071456);
                        this.field9782.method3694(var63, -1528071456);
                        this.field9782.method3694(var64, -1528071456);
                        this.field9782.method1741(-1526311408, 0.0F);
                        this.field9782.method1741(-1526311408, 1.0F);
                        this.field9782.method1741(-1526311408, (float) var68 * var16 + var65);
                        this.field9782.method1741(-1526311408, (float) var68 * var17 + var66);
                        this.field9782.method1741(-1526311408, (float) var68 * var18 + var67);
                        this.field9782.method3694(var61, -1528071456);
                        this.field9782.method3694(var62, -1528071456);
                        this.field9782.method3694(var63, -1528071456);
                        this.field9782.method3694(var64, -1528071456);
                    }
                    if (this.field9793[var44] > 64) {
                        int var47 = this.field9793[var44] - 64 - 1;
                        for (int var48 = this.field9794[var47] - 1; var48 >= 0; var48--) {
                            class668 var49 = this.field9797[var47][var48];
                            int var50 = var49.field9084;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field9077 >> 12);
                            float var56 = (float) (var49.field9079 >> 12);
                            float var57 = (float) (var49.field9072 >> 12);
                            int var58 = var49.field9080 >> 12;
                            this.field9782.method1741(-1526311408, 0.0F);
                            this.field9782.method1741(-1526311408, 0.0F);
                            this.field9782.method1741(-1526311408, (float) (-var58) * var10 + var55);
                            this.field9782.method1741(-1526311408, (float) (-var58) * var11 + var56);
                            this.field9782.method1741(-1526311408, (float) (-var58) * var12 + var57);
                            this.field9782.method3694(var51, -1528071456);
                            this.field9782.method3694(var52, -1528071456);
                            this.field9782.method3694(var53, -1528071456);
                            this.field9782.method3694(var54, -1528071456);
                            this.field9782.method1741(-1526311408, 1.0F);
                            this.field9782.method1741(-1526311408, 0.0F);
                            this.field9782.method1741(-1526311408, (float) var58 * var13 + var55);
                            this.field9782.method1741(-1526311408, (float) var58 * var14 + var56);
                            this.field9782.method1741(-1526311408, (float) var58 * var15 + var57);
                            this.field9782.method3694(var51, -1528071456);
                            this.field9782.method3694(var52, -1528071456);
                            this.field9782.method3694(var53, -1528071456);
                            this.field9782.method3694(var54, -1528071456);
                            this.field9782.method1741(-1526311408, 1.0F);
                            this.field9782.method1741(-1526311408, 1.0F);
                            this.field9782.method1741(-1526311408, (float) var58 * var10 + var55);
                            this.field9782.method1741(-1526311408, (float) var58 * var11 + var56);
                            this.field9782.method1741(-1526311408, (float) var58 * var12 + var57);
                            this.field9782.method3694(var51, -1528071456);
                            this.field9782.method3694(var52, -1528071456);
                            this.field9782.method3694(var53, -1528071456);
                            this.field9782.method3694(var54, -1528071456);
                            this.field9782.method1741(-1526311408, 0.0F);
                            this.field9782.method1741(-1526311408, 1.0F);
                            this.field9782.method1741(-1526311408, (float) var58 * var16 + var55);
                            this.field9782.method1741(-1526311408, (float) var58 * var17 + var56);
                            this.field9782.method1741(-1526311408, (float) var58 * var18 + var57);
                            this.field9782.method3694(var51, -1528071456);
                            this.field9782.method3694(var52, -1528071456);
                            this.field9782.method3694(var53, -1528071456);
                            this.field9782.method3694(var54, -1528071456);
                        }
                    }
                }
            }
        }
        if (this.field9782.field9146 != 0) {
            this.field9791.method851(this.field9782.field9146, 506, 24, this.field9782.field9154);
            arg1.method935(null, this.field9788, this.field9790, (byte) 108, this.field9789);
            arg1.method899(7, this.field9782.field9146 / 24, 0, 39);
        }
    }
}
