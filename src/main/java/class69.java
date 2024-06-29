import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class69 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[F")
    private float[] field907 = new float[16];

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lpb;")
    private class299 field908 = new class299(786336);

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    private int field917 = class34.method292(1600, 93);

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    private int field924 = 0;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[[Lbq;")
    private class342[][] field923 = new class342[64][768];

    @OriginalMember(owner = "client!w", name = "r", descriptor = "[I")
    private int[] field922 = new int[8191];

    @OriginalMember(owner = "client!w", name = "v", descriptor = "[I")
    private int[] field926 = new int[1600];

    @OriginalMember(owner = "client!w", name = "w", descriptor = "[[Lbq;")
    private class342[][] field927 = new class342[1600][64];

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[I")
    private int[] field928 = new int[64];

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Laa;")
    public static class76 field918 = new class76(47, -1);

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Laa;")
    public static class76 field920 = new class76(37, 7);

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Llm;")
    private class246 field914;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Lvc;")
    public static class291 field925;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Lft;")
    private class426 field915;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lft;")
    private class426 field916;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lft;")
    private class426 field919;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static final void method480(byte arg0) {
        field913++;
        class43.field559.field6830 = 0;
        class305.field4553 = null;
        class400.field5966.field6830 = 0;
        class400.field6033 = null;
        class158.field2386 = 0;
        class104.field1562 = 0;
        class89.field1392 = 0;
        class496.field7360 = null;
        class2.field16 = null;
        class26.method259(76);
        class44.method342(false);
        int var1 = 120 / ((66 - arg0) / 48);
        for (int var2 = 0; var2 < 2048; var2++) {
            class83.field1327[var2] = null;
        }
        class410.field6198 = null;
        for (int var3 = 0; var3 < class88.field1375.length; var3++) {
            class351 var5 = class88.field1375[var3];
            if (var5 != null) {
                var5.field5991 = -1;
            }
        }
        class431.method2545(-116);
        class350.field5388 = 1;
        class526.method3137(9, 2270);
        for (int var4 = 0; var4 < 100; var4++) {
            class147.field2223[var4] = true;
        }
        class45.method346(true);
        class12.field120 = null;
        class397.field5932 = 0L;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lvd;I)V")
    public final void method481(class258 arg0, int arg1) {
        field912++;
        this.field914 = arg0.method1615(-104, null, true, 24, 196584);
        this.field916 = new class426(this.field914, 5126, 2, 0);
        this.field919 = new class426(this.field914, 5126, 3, 8);
        this.field915 = new class426(this.field914, arg1, 4, 20);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lvd;B)V")
    private final void method482(class258 arg0, byte arg1) {
        field911++;
        if (arg1 != -21) {
            field925 = null;
        }
        class282.field4265 = arg0.field3771;
        arg0.method1566((byte) 127);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method1557(18546, false);
        arg0.method1613(-2, -1);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)V")
    public static final void method483(byte arg0, int arg1) {
        class12.field119 = new int[arg1];
        class52.field671 = new int[arg1];
        class170.field2499 = new int[arg1];
        class455.field6666 = new int[arg1];
        if (arg0 == -25) {
            class349.field5380 = new int[arg1];
            field905++;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILpv;Lvd;)V")
    public final void method484(int arg0, class46 arg1, class258 arg2) {
        field910++;
        if (arg2.field3737 == null) {
            return;
        }
        this.method482(arg2, (byte) -21);
        float var4 = arg2.field3737.field6590;
        float var5 = arg2.field3737.field6586;
        float var6 = arg2.field3737.field6568;
        float var7 = arg2.field3737.field6566;
        try {
            if (arg1.field601) {
                int var8 = arg1.field600 - arg1.field598;
                int var9;
                if (var8 + 2 > 1600) {
                    var9 = class34.method292(var8, arg0 - 17873) + 1 - this.field917;
                    var8 = (var8 >> var9) + 2;
                } else {
                    var9 = 0;
                    var8 += 2;
                }
                class514 var10 = arg1.field596.field1564;
                class514 var11 = var10.field7523;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field924 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field926[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field928[var16] = 0;
                    }
                    while (var10 != var11) {
                        class342 var17 = (class342) var11;
                        if (var14) {
                            var12 = var17.field5266;
                            var13 = var17.field5261;
                            var14 = false;
                        } else if (var17.field5266 != var12 || var17.field5261 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field5257 >> class29.field412) * var6 + (float) (var17.field5264 >> class29.field412) * var4 + (float) (var17.field5255 >> class29.field412) * var5 + var7) - arg1.field598 >> var9;
                        if (var18 < 1600) {
                            if (this.field926[var18] < 64) {
                                this.field927[var18][this.field926[var18]++] = var17;
                            } else {
                                label141: {
                                    if (this.field926[var18] == 64) {
                                        if (this.field924 == 64) {
                                            break label141;
                                        }
                                        this.field926[var18] += this.field924++ + 1;
                                    }
                                    this.field923[this.field926[var18] - 64 - 1][this.field928[this.field926[var18] - 64 - 1]++] = var17;
                                }
                            }
                        }
                        var11 = var11.field7523;
                    }
                    if (var12 < 0) {
                        arg2.method1546(-2, null);
                    } else {
                        arg2.method1546(-2, arg2.field3695.method2053(false, var12));
                        arg2.method1582(arg2.field101.method1480(var12, 14270).field2425, true);
                    }
                    if (var13 && class282.field4265 != arg2.field3771) {
                        arg2.method90(class282.field4265);
                    } else if (arg2.field3771 != 1.0F) {
                        arg2.method90(1.0F);
                    }
                    this.method487((byte) -95, var8, arg2);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class514 var22 = arg1.field596.field1564;
                for (class514 var23 = var22.field7523; var23 != var22; var23 = var23.field7523) {
                    class342 var24 = (class342) var23;
                    int var25 = (int) ((float) (var24.field5257 >> class29.field412) * var6 + (float) (var24.field5264 >> class29.field412) * var4 + (float) (var24.field5255 >> class29.field412) * var5 + var7);
                    if (var21 < var25) {
                        var21 = var25;
                    }
                    if (var25 < var20) {
                        var20 = var25;
                    }
                    this.field922[var19++] = var25;
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) <= 1600) {
                    var27 = 0;
                    var26 += 2;
                } else {
                    var27 = class34.method292(var26, 96) + 1 - this.field917;
                    var26 = (var26 >> var27) + 2;
                }
                int var28 = 0;
                class514 var29 = var22.field7523;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field924 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field926[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field928[var34] = 0;
                    }
                    while (var22 != var29) {
                        class342 var35 = (class342) var29;
                        if (var32) {
                            var32 = false;
                            var30 = var35.field5266;
                            var31 = var35.field5261;
                        }
                        if (var28 > 0 && (var35.field5266 != var30 || var35.field5261 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field922[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field926[var36] < 64) {
                                this.field927[var36][this.field926[var36]++] = var35;
                            } else {
                                label185: {
                                    if (this.field926[var36] == 64) {
                                        if (this.field924 == 64) {
                                            break label185;
                                        }
                                        this.field926[var36] += (this.field924++) + 1;
                                    }
                                    this.field923[this.field926[var36] - 65][this.field928[this.field926[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field7523;
                    }
                    if (var30 >= 0) {
                        arg2.method1546(-2, arg2.field3695.method2053(false, var30));
                        arg2.method1582(arg2.field101.method1480(var30, 14270).field2425, true);
                    } else {
                        arg2.method1546(-2, null);
                    }
                    if (var31 && class282.field4265 != arg2.field3771) {
                        arg2.method90(class282.field4265);
                    } else if (arg2.field3771 != 1.0F) {
                        arg2.method90(1.0F);
                    }
                    this.method487((byte) -108, var26, arg2);
                }
            }
            if (arg0 != 17970) {
                this.method481(null, -103);
            }
        } catch (Exception var37) {
        }
        this.method486(false, arg2);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method485(int arg0) {
        if (arg0 != 5866) {
            field925 = null;
        }
        field918 = null;
        field920 = null;
        field925 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLvd;)V")
    private final void method486(boolean arg0, class258 arg1) {
        arg1.method1557(18546, true);
        field909++;
        OpenGL.glEnable(16384);
        if (arg0) {
            method480((byte) -35);
        }
        OpenGL.glEnable(16385);
        if (class282.field4265 != arg1.field3771) {
            arg1.method90(class282.field4265);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BILvd;)V")
    private final void method487(byte arg0, int arg1, class258 arg2) {
        OpenGL.glGetFloatv(2982, this.field907, 0);
        field906++;
        float var4 = this.field907[0];
        float var5 = this.field907[4];
        float var6 = this.field907[8];
        float var7 = this.field907[1];
        float var8 = this.field907[5];
        float var9 = this.field907[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        if (arg0 >= -87) {
            return;
        }
        this.field908.field6830 = 0;
        float var18 = var9 - var6;
        if (arg2.field3821) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field926[var44] <= 64 ? this.field926[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class342 var59 = this.field927[var44][var46];
                        int var60 = var59.field5260;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field5264 >> class29.field412);
                        float var66 = (float) (var59.field5255 >> class29.field412);
                        float var67 = (float) (var59.field5257 >> class29.field412);
                        int var68 = var59.field5251 >> class29.field412;
                        this.field908.method1856(0.0F, 191);
                        this.field908.method1856(0.0F, 191);
                        this.field908.method1856((float) (-var68) * var10 + var65, 191);
                        this.field908.method1856((float) (-var68) * var11 + var66, 191);
                        this.field908.method1856((float) (-var68) * var12 + var67, 191);
                        this.field908.method2754(var61, 5574);
                        this.field908.method2754(var62, 5574);
                        this.field908.method2754(var63, 5574);
                        this.field908.method2754(var64, 5574);
                        this.field908.method1856(1.0F, 191);
                        this.field908.method1856(0.0F, 191);
                        this.field908.method1856((float) var68 * var13 + var65, 191);
                        this.field908.method1856((float) var68 * var14 + var66, 191);
                        this.field908.method1856((float) var68 * var15 + var67, 191);
                        this.field908.method2754(var61, 5574);
                        this.field908.method2754(var62, 5574);
                        this.field908.method2754(var63, 5574);
                        this.field908.method2754(var64, 5574);
                        this.field908.method1856(1.0F, 191);
                        this.field908.method1856(1.0F, 191);
                        this.field908.method1856((float) var68 * var10 + var65, 191);
                        this.field908.method1856((float) var68 * var11 + var66, 191);
                        this.field908.method1856((float) var68 * var12 + var67, 191);
                        this.field908.method2754(var61, 5574);
                        this.field908.method2754(var62, 5574);
                        this.field908.method2754(var63, 5574);
                        this.field908.method2754(var64, 5574);
                        this.field908.method1856(0.0F, 191);
                        this.field908.method1856(1.0F, 191);
                        this.field908.method1856((float) var68 * var16 + var65, 191);
                        this.field908.method1856((float) var68 * var17 + var66, 191);
                        this.field908.method1856((float) var68 * var18 + var67, 191);
                        this.field908.method2754(var61, 5574);
                        this.field908.method2754(var62, 5574);
                        this.field908.method2754(var63, 5574);
                        this.field908.method2754(var64, 5574);
                    }
                    if (this.field926[var44] > 64) {
                        int var47 = this.field926[var44] - 64 - 1;
                        for (int var48 = this.field928[var47] - 1; var48 >= 0; var48--) {
                            class342 var49 = this.field923[var47][var48];
                            int var50 = var49.field5260;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field5264 >> class29.field412);
                            float var56 = (float) (var49.field5255 >> class29.field412);
                            float var57 = (float) (var49.field5257 >> class29.field412);
                            int var58 = var49.field5251 >> class29.field412;
                            this.field908.method1856(0.0F, 191);
                            this.field908.method1856(0.0F, 191);
                            this.field908.method1856((float) (-var58) * var10 + var55, 191);
                            this.field908.method1856((float) (-var58) * var11 + var56, 191);
                            this.field908.method1856((float) (-var58) * var12 + var57, 191);
                            this.field908.method2754(var51, 5574);
                            this.field908.method2754(var52, 5574);
                            this.field908.method2754(var53, 5574);
                            this.field908.method2754(var54, 5574);
                            this.field908.method1856(1.0F, 191);
                            this.field908.method1856(0.0F, 191);
                            this.field908.method1856((float) var58 * var13 + var55, 191);
                            this.field908.method1856((float) var58 * var14 + var56, 191);
                            this.field908.method1856((float) var58 * var15 + var57, 191);
                            this.field908.method2754(var51, 5574);
                            this.field908.method2754(var52, 5574);
                            this.field908.method2754(var53, 5574);
                            this.field908.method2754(var54, 5574);
                            this.field908.method1856(1.0F, 191);
                            this.field908.method1856(1.0F, 191);
                            this.field908.method1856((float) var58 * var10 + var55, 191);
                            this.field908.method1856((float) var58 * var11 + var56, 191);
                            this.field908.method1856((float) var58 * var12 + var57, 191);
                            this.field908.method2754(var51, 5574);
                            this.field908.method2754(var52, 5574);
                            this.field908.method2754(var53, 5574);
                            this.field908.method2754(var54, 5574);
                            this.field908.method1856(0.0F, 191);
                            this.field908.method1856(1.0F, 191);
                            this.field908.method1856((float) var58 * var16 + var55, 191);
                            this.field908.method1856((float) var58 * var17 + var56, 191);
                            this.field908.method1856((float) var58 * var18 + var57, 191);
                            this.field908.method2754(var51, 5574);
                            this.field908.method2754(var52, 5574);
                            this.field908.method2754(var53, 5574);
                            this.field908.method2754(var54, 5574);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field926[var19] > 64 ? 64 : this.field926[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class342 var34 = this.field927[var19][var21];
                        int var35 = var34.field5260;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field5264 >> class29.field412);
                        float var41 = (float) (var34.field5255 >> class29.field412);
                        float var42 = (float) (var34.field5257 >> class29.field412);
                        int var43 = var34.field5251 >> class29.field412;
                        this.field908.method1854((byte) -80, 0.0F);
                        this.field908.method1854((byte) -80, 0.0F);
                        this.field908.method1854((byte) -80, (float) (-var43) * var10 + var40);
                        this.field908.method1854((byte) -80, (float) (-var43) * var11 + var41);
                        this.field908.method1854((byte) -80, (float) (-var43) * var12 + var42);
                        this.field908.method2754(var36, 5574);
                        this.field908.method2754(var37, 5574);
                        this.field908.method2754(var38, 5574);
                        this.field908.method2754(var39, 5574);
                        this.field908.method1854((byte) -80, 1.0F);
                        this.field908.method1854((byte) -80, 0.0F);
                        this.field908.method1854((byte) -80, (float) var43 * var13 + var40);
                        this.field908.method1854((byte) -80, (float) var43 * var14 + var41);
                        this.field908.method1854((byte) -80, (float) var43 * var15 + var42);
                        this.field908.method2754(var36, 5574);
                        this.field908.method2754(var37, 5574);
                        this.field908.method2754(var38, 5574);
                        this.field908.method2754(var39, 5574);
                        this.field908.method1854((byte) -80, 1.0F);
                        this.field908.method1854((byte) -80, 1.0F);
                        this.field908.method1854((byte) -80, (float) var43 * var10 + var40);
                        this.field908.method1854((byte) -80, (float) var43 * var11 + var41);
                        this.field908.method1854((byte) -80, (float) var43 * var12 + var42);
                        this.field908.method2754(var36, 5574);
                        this.field908.method2754(var37, 5574);
                        this.field908.method2754(var38, 5574);
                        this.field908.method2754(var39, 5574);
                        this.field908.method1854((byte) -80, 0.0F);
                        this.field908.method1854((byte) -80, 1.0F);
                        this.field908.method1854((byte) -80, (float) var43 * var16 + var40);
                        this.field908.method1854((byte) -80, (float) var43 * var17 + var41);
                        this.field908.method1854((byte) -80, (float) var43 * var18 + var42);
                        this.field908.method2754(var36, 5574);
                        this.field908.method2754(var37, 5574);
                        this.field908.method2754(var38, 5574);
                        this.field908.method2754(var39, 5574);
                    }
                    if (this.field926[var19] > 64) {
                        int var22 = this.field926[var19] - 1 - 64;
                        for (int var23 = this.field928[var22] - 1; var23 >= 0; var23--) {
                            class342 var24 = this.field923[var22][var23];
                            int var25 = var24.field5260;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field5264 >> class29.field412);
                            float var31 = (float) (var24.field5255 >> class29.field412);
                            float var32 = (float) (var24.field5257 >> class29.field412);
                            int var33 = var24.field5251 >> class29.field412;
                            this.field908.method1854((byte) -80, 0.0F);
                            this.field908.method1854((byte) -80, 0.0F);
                            this.field908.method1854((byte) -80, (float) (-var33) * var10 + var30);
                            this.field908.method1854((byte) -80, (float) (-var33) * var11 + var31);
                            this.field908.method1854((byte) -80, (float) (-var33) * var12 + var32);
                            this.field908.method2754(var26, 5574);
                            this.field908.method2754(var27, 5574);
                            this.field908.method2754(var28, 5574);
                            this.field908.method2754(var29, 5574);
                            this.field908.method1854((byte) -80, 1.0F);
                            this.field908.method1854((byte) -80, 0.0F);
                            this.field908.method1854((byte) -80, (float) var33 * var13 + var30);
                            this.field908.method1854((byte) -80, (float) var33 * var14 + var31);
                            this.field908.method1854((byte) -80, (float) var33 * var15 + var32);
                            this.field908.method2754(var26, 5574);
                            this.field908.method2754(var27, 5574);
                            this.field908.method2754(var28, 5574);
                            this.field908.method2754(var29, 5574);
                            this.field908.method1854((byte) -80, 1.0F);
                            this.field908.method1854((byte) -80, 1.0F);
                            this.field908.method1854((byte) -80, (float) var33 * var10 + var30);
                            this.field908.method1854((byte) -80, (float) var33 * var11 + var31);
                            this.field908.method1854((byte) -80, (float) var33 * var12 + var32);
                            this.field908.method2754(var26, 5574);
                            this.field908.method2754(var27, 5574);
                            this.field908.method2754(var28, 5574);
                            this.field908.method2754(var29, 5574);
                            this.field908.method1854((byte) -80, 0.0F);
                            this.field908.method1854((byte) -80, 1.0F);
                            this.field908.method1854((byte) -80, (float) var33 * var16 + var30);
                            this.field908.method1854((byte) -80, (float) var33 * var17 + var31);
                            this.field908.method1854((byte) -80, (float) var33 * var18 + var32);
                            this.field908.method2754(var26, 5574);
                            this.field908.method2754(var27, 5574);
                            this.field908.method2754(var28, 5574);
                            this.field908.method2754(var29, 5574);
                        }
                    }
                }
            }
        }
        if (this.field908.field6830 != 0) {
            this.field914.method1193(true, this.field908.field6868, this.field908.field6830, 24);
            arg2.method1597(this.field919, this.field915, -1, null, this.field916);
            arg2.method1605(0, this.field908.field6830 / 24, -110, 7);
        }
    }
}
