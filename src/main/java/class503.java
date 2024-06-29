import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class503 {

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[F")
    private float[] field7498 = new float[16];

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Lrp;")
    private class455 field7495 = new class455(786336);

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    private int field7507 = class166.method1168(1, 1600);

    @OriginalMember(owner = "client!on", name = "p", descriptor = "[I")
    private int[] field7510 = new int[1600];

    @OriginalMember(owner = "client!on", name = "v", descriptor = "[I")
    private int[] field7516 = new int[64];

    @OriginalMember(owner = "client!on", name = "u", descriptor = "[[Lsv;")
    private class386[][] field7515 = new class386[64][768];

    @OriginalMember(owner = "client!on", name = "q", descriptor = "[I")
    private int[] field7511 = new int[8191];

    @OriginalMember(owner = "client!on", name = "t", descriptor = "[[Lsv;")
    private class386[][] field7514 = new class386[1600][64];

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    private int field7512 = 0;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "Lgf;")
    private class46 field7509;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Lit;")
    private class509 field7503;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "Lit;")
    private class509 field7504;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Lit;")
    private class509 field7505;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIII)V")
    public static final void method3004(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7497++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        if (arg2 <= 5) {
            field7496 = -96;
        }
        int var8 = -1;
        int var9 = class278.method1758(class443.field6591, class396.field6021, arg0 + arg3, -114);
        int var10 = class278.method1758(class443.field6591, class396.field6021, arg0 - arg3, -97);
        class271.method1736(var9, arg1, var10, -11, class23.field356[arg4]);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (var12 >= class410.field6176 && var11 <= class158.field2302) {
                    int var13 = class278.method1758(class443.field6591, class396.field6021, arg0 + var5, 72);
                    int var14 = class278.method1758(class443.field6591, class396.field6021, arg0 - var5, -65);
                    if (var12 <= class158.field2302) {
                        class271.method1736(var13, arg1, var14, -11, class23.field356[var12]);
                    }
                    if (var11 >= class410.field6176) {
                        class271.method1736(var13, arg1, var14, -11, class23.field356[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class410.field6176 && class158.field2302 >= var15) {
                int var17 = class278.method1758(class443.field6591, class396.field6021, arg0 + var6, -69);
                int var18 = class278.method1758(class443.field6591, class396.field6021, arg0 - var6, 100);
                if (class158.field2302 >= var16) {
                    class271.method1736(var17, arg1, var18, -11, class23.field356[var16]);
                }
                if (class410.field6176 <= var15) {
                    class271.method1736(var17, arg1, var18, -11, class23.field356[var15]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3005(int arg0, byte arg1, int arg2) {
        field7499++;
        if (arg1 < 54) {
            field7496 = 25;
        }
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lbv;B)V")
    public final void method3006(class282 arg0, byte arg1) {
        field7508++;
        this.field7509 = arg0.method1812(24, null, 196584, -73, true);
        this.field7504 = new class509(this.field7509, 5126, 2, 0);
        this.field7503 = new class509(this.field7509, 5126, 3, 8);
        this.field7505 = new class509(this.field7509, 5121, 4, 20);
        if (arg1 != -2) {
            field7496 = 51;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(Lbv;B)V")
    private final void method3007(class282 arg0, byte arg1) {
        field7502++;
        class270.field3764 = arg0.field4188;
        arg0.method1782((byte) -65);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method1827(false, -61);
        if (arg1 < 29) {
            this.method3007(null, (byte) -45);
        }
        arg0.method1811(-2, (byte) -87);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lbv;BI)V")
    private final void method3008(class282 arg0, byte arg1, int arg2) {
        field7513++;
        OpenGL.glGetFloatv(2982, this.field7498, 0);
        float var4 = this.field7498[0];
        float var5 = this.field7498[4];
        float var6 = this.field7498[8];
        float var7 = this.field7498[1];
        float var8 = this.field7498[5];
        if (arg1 <= 30) {
            this.method3008(null, (byte) -35, 110);
        }
        float var9 = this.field7498[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field7495.field1292 = 0;
        if (arg0.field4197) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field7510[var44] <= 64 ? this.field7510[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class386 var59 = this.field7514[var44][var46];
                        int var60 = var59.field5883;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field5887 >> class335.field5178);
                        float var66 = (float) (var59.field5874 >> class335.field5178);
                        float var67 = (float) (var59.field5875 >> class335.field5178);
                        int var68 = var59.field5881 >> class335.field5178;
                        this.field7495.method2741(76, 0.0F);
                        this.field7495.method2741(126, 0.0F);
                        this.field7495.method2741(111, (float) (-var68) * var10 + var65);
                        this.field7495.method2741(118, (float) (-var68) * var11 + var66);
                        this.field7495.method2741(69, (float) (-var68) * var12 + var67);
                        this.field7495.method625(var61, false);
                        this.field7495.method625(var62, false);
                        this.field7495.method625(var63, false);
                        this.field7495.method625(var64, false);
                        this.field7495.method2741(71, 1.0F);
                        this.field7495.method2741(118, 0.0F);
                        this.field7495.method2741(120, (float) var68 * var13 + var65);
                        this.field7495.method2741(87, (float) var68 * var14 + var66);
                        this.field7495.method2741(109, (float) var68 * var15 + var67);
                        this.field7495.method625(var61, false);
                        this.field7495.method625(var62, false);
                        this.field7495.method625(var63, false);
                        this.field7495.method625(var64, false);
                        this.field7495.method2741(75, 1.0F);
                        this.field7495.method2741(122, 1.0F);
                        this.field7495.method2741(71, (float) var68 * var10 + var65);
                        this.field7495.method2741(105, (float) var68 * var11 + var66);
                        this.field7495.method2741(125, (float) var68 * var12 + var67);
                        this.field7495.method625(var61, false);
                        this.field7495.method625(var62, false);
                        this.field7495.method625(var63, false);
                        this.field7495.method625(var64, false);
                        this.field7495.method2741(83, 0.0F);
                        this.field7495.method2741(106, 1.0F);
                        this.field7495.method2741(67, (float) var68 * var16 + var65);
                        this.field7495.method2741(95, (float) var68 * var17 + var66);
                        this.field7495.method2741(86, (float) var68 * var18 + var67);
                        this.field7495.method625(var61, false);
                        this.field7495.method625(var62, false);
                        this.field7495.method625(var63, false);
                        this.field7495.method625(var64, false);
                    }
                    if (this.field7510[var44] > 64) {
                        int var47 = this.field7510[var44] - 1 - 64;
                        for (int var48 = this.field7516[var47] - 1; var48 >= 0; var48--) {
                            class386 var49 = this.field7515[var47][var48];
                            int var50 = var49.field5883;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field5887 >> class335.field5178);
                            float var56 = (float) (var49.field5874 >> class335.field5178);
                            float var57 = (float) (var49.field5875 >> class335.field5178);
                            int var58 = var49.field5881 >> class335.field5178;
                            this.field7495.method2741(70, 0.0F);
                            this.field7495.method2741(70, 0.0F);
                            this.field7495.method2741(114, (float) (-var58) * var10 + var55);
                            this.field7495.method2741(80, (float) (-var58) * var11 + var56);
                            this.field7495.method2741(77, (float) (-var58) * var12 + var57);
                            this.field7495.method625(var51, false);
                            this.field7495.method625(var52, false);
                            this.field7495.method625(var53, false);
                            this.field7495.method625(var54, false);
                            this.field7495.method2741(104, 1.0F);
                            this.field7495.method2741(68, 0.0F);
                            this.field7495.method2741(80, (float) var58 * var13 + var55);
                            this.field7495.method2741(119, (float) var58 * var14 + var56);
                            this.field7495.method2741(83, (float) var58 * var15 + var57);
                            this.field7495.method625(var51, false);
                            this.field7495.method625(var52, false);
                            this.field7495.method625(var53, false);
                            this.field7495.method625(var54, false);
                            this.field7495.method2741(114, 1.0F);
                            this.field7495.method2741(104, 1.0F);
                            this.field7495.method2741(74, (float) var58 * var10 + var55);
                            this.field7495.method2741(102, (float) var58 * var11 + var56);
                            this.field7495.method2741(109, (float) var58 * var12 + var57);
                            this.field7495.method625(var51, false);
                            this.field7495.method625(var52, false);
                            this.field7495.method625(var53, false);
                            this.field7495.method625(var54, false);
                            this.field7495.method2741(87, 0.0F);
                            this.field7495.method2741(123, 1.0F);
                            this.field7495.method2741(125, (float) var58 * var16 + var55);
                            this.field7495.method2741(96, (float) var58 * var17 + var56);
                            this.field7495.method2741(105, (float) var58 * var18 + var57);
                            this.field7495.method625(var51, false);
                            this.field7495.method625(var52, false);
                            this.field7495.method625(var53, false);
                            this.field7495.method625(var54, false);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field7510[var19] > 64 ? 64 : this.field7510[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class386 var34 = this.field7514[var19][var21];
                        int var35 = var34.field5883;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field5887 >> class335.field5178);
                        float var41 = (float) (var34.field5874 >> class335.field5178);
                        float var42 = (float) (var34.field5875 >> class335.field5178);
                        int var43 = var34.field5881 >> class335.field5178;
                        this.field7495.method2737(-116, 0.0F);
                        this.field7495.method2737(-79, 0.0F);
                        this.field7495.method2737(-87, (float) (-var43) * var10 + var40);
                        this.field7495.method2737(-90, (float) (-var43) * var11 + var41);
                        this.field7495.method2737(-110, (float) (-var43) * var12 + var42);
                        this.field7495.method625(var36, false);
                        this.field7495.method625(var37, false);
                        this.field7495.method625(var38, false);
                        this.field7495.method625(var39, false);
                        this.field7495.method2737(-94, 1.0F);
                        this.field7495.method2737(-83, 0.0F);
                        this.field7495.method2737(-92, (float) var43 * var13 + var40);
                        this.field7495.method2737(-95, (float) var43 * var14 + var41);
                        this.field7495.method2737(-116, (float) var43 * var15 + var42);
                        this.field7495.method625(var36, false);
                        this.field7495.method625(var37, false);
                        this.field7495.method625(var38, false);
                        this.field7495.method625(var39, false);
                        this.field7495.method2737(-105, 1.0F);
                        this.field7495.method2737(-80, 1.0F);
                        this.field7495.method2737(-99, (float) var43 * var10 + var40);
                        this.field7495.method2737(-119, (float) var43 * var11 + var41);
                        this.field7495.method2737(-108, (float) var43 * var12 + var42);
                        this.field7495.method625(var36, false);
                        this.field7495.method625(var37, false);
                        this.field7495.method625(var38, false);
                        this.field7495.method625(var39, false);
                        this.field7495.method2737(-100, 0.0F);
                        this.field7495.method2737(-126, 1.0F);
                        this.field7495.method2737(-99, (float) var43 * var16 + var40);
                        this.field7495.method2737(-105, (float) var43 * var17 + var41);
                        this.field7495.method2737(-97, (float) var43 * var18 + var42);
                        this.field7495.method625(var36, false);
                        this.field7495.method625(var37, false);
                        this.field7495.method625(var38, false);
                        this.field7495.method625(var39, false);
                    }
                    if (this.field7510[var19] > 64) {
                        int var22 = this.field7510[var19] - 64 - 1;
                        for (int var23 = this.field7516[var22] - 1; var23 >= 0; var23--) {
                            class386 var24 = this.field7515[var22][var23];
                            int var25 = var24.field5883;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field5887 >> class335.field5178);
                            float var31 = (float) (var24.field5874 >> class335.field5178);
                            float var32 = (float) (var24.field5875 >> class335.field5178);
                            int var33 = var24.field5881 >> class335.field5178;
                            this.field7495.method2737(-83, 0.0F);
                            this.field7495.method2737(-85, 0.0F);
                            this.field7495.method2737(-88, (float) (-var33) * var10 + var30);
                            this.field7495.method2737(-88, (float) (-var33) * var11 + var31);
                            this.field7495.method2737(-82, (float) (-var33) * var12 + var32);
                            this.field7495.method625(var26, false);
                            this.field7495.method625(var27, false);
                            this.field7495.method625(var28, false);
                            this.field7495.method625(var29, false);
                            this.field7495.method2737(-109, 1.0F);
                            this.field7495.method2737(-124, 0.0F);
                            this.field7495.method2737(-121, (float) var33 * var13 + var30);
                            this.field7495.method2737(-103, (float) var33 * var14 + var31);
                            this.field7495.method2737(-110, (float) var33 * var15 + var32);
                            this.field7495.method625(var26, false);
                            this.field7495.method625(var27, false);
                            this.field7495.method625(var28, false);
                            this.field7495.method625(var29, false);
                            this.field7495.method2737(-115, 1.0F);
                            this.field7495.method2737(-90, 1.0F);
                            this.field7495.method2737(-91, (float) var33 * var10 + var30);
                            this.field7495.method2737(-103, (float) var33 * var11 + var31);
                            this.field7495.method2737(-79, (float) var33 * var12 + var32);
                            this.field7495.method625(var26, false);
                            this.field7495.method625(var27, false);
                            this.field7495.method625(var28, false);
                            this.field7495.method625(var29, false);
                            this.field7495.method2737(-77, 0.0F);
                            this.field7495.method2737(-112, 1.0F);
                            this.field7495.method2737(-123, (float) var33 * var16 + var30);
                            this.field7495.method2737(-111, (float) var33 * var17 + var31);
                            this.field7495.method2737(-90, (float) var33 * var18 + var32);
                            this.field7495.method625(var26, false);
                            this.field7495.method625(var27, false);
                            this.field7495.method625(var28, false);
                            this.field7495.method625(var29, false);
                        }
                    }
                }
            }
        }
        if (this.field7495.field1292 != 0) {
            this.field7509.method345(83, this.field7495.field1277, this.field7495.field1292, 24);
            arg0.method1790(this.field7504, (byte) 43, this.field7503, null, this.field7505);
            arg0.method1797(7, true, 0, this.field7495.field1292 / 24);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lvo;Lbv;I)V")
    public final void method3009(class258 arg0, class282 arg1, int arg2) {
        field7501++;
        if (arg2 != 10013 || arg1.field4144 == null) {
            return;
        }
        this.method3007(arg1, (byte) 32);
        float var4 = arg1.field4144.field1712;
        float var5 = arg1.field4144.field1718;
        float var6 = arg1.field4144.field1708;
        float var7 = arg1.field4144.field1719;
        try {
            if (arg0.field3607) {
                int var8 = arg0.field3605 - arg0.field3606;
                int var9;
                if ((var8 + 2) <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = (class166.method1168(arg2 ^ 0x271C, var8) - this.field7507) + 1;
                    var8 = (var8 >> var9) + 2;
                }
                class413 var10 = arg0.field3603.field6371;
                class413 var11 = var10.field6211;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field7512 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field7510[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field7516[var16] = 0;
                    }
                    while (var10 != var11) {
                        class386 var17 = (class386) var11;
                        if (var14) {
                            var13 = var17.field5878;
                            var14 = false;
                            var12 = var17.field5885;
                        } else if (var17.field5885 != var12 || var13 != var17.field5878) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field5875 >> class335.field5178) * var6 + (float) (var17.field5887 >> class335.field5178) * var4 + (float) (var17.field5874 >> class335.field5178) * var5 + var7) - arg0.field3606 >> var9;
                        if (var18 < 1600) {
                            if (this.field7510[var18] < 64) {
                                this.field7514[var18][this.field7510[var18]++] = var17;
                            } else {
                                label200: {
                                    if (this.field7510[var18] == 64) {
                                        if (this.field7512 == 64) {
                                            break label200;
                                        }
                                        this.field7510[var18] += this.field7512++ + 1;
                                    }
                                    class386[] var10000 = this.field7515[this.field7510[var18] - 64 - 1];
                                    int var10002 = this.field7510[var18] - 65;
                                    int var10004 = this.field7516[this.field7510[var18] - 65];
                                    this.field7516[var10002] = this.field7516[this.field7510[var18] - 65] + 1;
                                    var10000[var10004] = var17;
                                }
                            }
                        }
                        var11 = var11.field6211;
                    }
                    if (var12 >= 0) {
                        arg1.method1787(arg1.field4071.method3078(-35, var12), (byte) 121);
                        arg1.method1794(arg1.field7256.method1558(var12, (byte) 106).field3666, 66);
                    } else {
                        arg1.method1787(null, (byte) 121);
                    }
                    if (var13 && class270.field3764 != arg1.field4188) {
                        arg1.method1096(class270.field3764);
                    } else if (arg1.field4188 != 1.0F) {
                        arg1.method1096(1.0F);
                    }
                    this.method3008(arg1, (byte) 123, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class413 var22 = arg0.field3603.field6371;
                for (class413 var23 = var22.field6211; var23 != var22; var23 = var23.field6211) {
                    class386 var24 = (class386) var23;
                    int var25 = (int) ((float) (var24.field5875 >> class335.field5178) * var6 + (float) (var24.field5887 >> class335.field5178) * var4 + (float) (var24.field5874 >> class335.field5178) * var5 + var7);
                    this.field7511[var19++] = var25;
                    if (var25 < var20) {
                        var20 = var25;
                    }
                    if (var21 < var25) {
                        var21 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class166.method1168(1, var26) + (1 - this.field7507);
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class413 var28 = var22.field6211;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field7512 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field7510[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field7516[var34] = 0;
                    }
                    while (var22 != var28) {
                        class386 var35 = (class386) var28;
                        if (var32) {
                            var32 = false;
                            var31 = var35.field5878;
                            var30 = var35.field5885;
                        }
                        if (var29 > 0 && (var35.field5885 != var30 || var31 != var35.field5878)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field7511[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field7510[var36] >= 64) {
                                label150: {
                                    if (this.field7510[var36] == 64) {
                                        if (this.field7512 == 64) {
                                            break label150;
                                        }
                                        this.field7510[var36] += this.field7512++ + 1;
                                    }
                                    this.field7515[this.field7510[var36] - 64 - 1][this.field7516[this.field7510[var36] - 64 - 1]++] = var35;
                                }
                            } else {
                                this.field7514[var36][this.field7510[var36]++] = var35;
                            }
                        }
                        var28 = var28.field6211;
                    }
                    if (var30 >= 0) {
                        arg1.method1787(arg1.field4071.method3078(-64, var30), (byte) 121);
                        arg1.method1794(arg1.field7256.method1558(var30, (byte) 120).field3666, 109);
                    } else {
                        arg1.method1787(null, (byte) 121);
                    }
                    if (var31 && class270.field3764 != arg1.field4188) {
                        arg1.method1096(class270.field3764);
                    } else if (arg1.field4188 != 1.0F) {
                        arg1.method1096(1.0F);
                    }
                    this.method3008(arg1, (byte) 97, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method3010(-32241, arg1);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILbv;)V")
    private final void method3010(int arg0, class282 arg1) {
        field7506++;
        arg1.method1827(true, -95);
        if (arg0 != -32241) {
            return;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class270.field3764 != arg1.field4188) {
            arg1.method1096(class270.field3764);
        }
    }
}
