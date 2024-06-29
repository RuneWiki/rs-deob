import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class102 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "[F")
    private float[] field1302 = new float[16];

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lbp;")
    private class49 field1303 = new class49(786336);

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "[[Lw;")
    private class242[][] field1308 = new class242[1600][64];

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "[I")
    private int[] field1305 = new int[64];

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "[I")
    private int[] field1310 = new int[8191];

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "[I")
    private int[] field1313 = new int[1600];

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "[[Lw;")
    private class242[][] field1314 = new class242[64][768];

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    private int field1307 = 0;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lkd;")
    private class340 field1306;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Lpa;")
    private class352 field1309;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lpa;")
    private class352 field1311;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Lpa;")
    private class352 field1312;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Ljaggl/opengl;")
    private opengl field1304;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lks;I)V")
    private final void method685(class173 arg0, int arg1) {
        this.field1304.glGetFloatv(2982, this.field1302, 0);
        float var3 = this.field1302[0];
        float var4 = this.field1302[4];
        float var5 = this.field1302[8];
        float var6 = this.field1302[1];
        float var7 = this.field1302[5];
        float var8 = this.field1302[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field1303.field3762 = 0;
        if (arg0.field2296) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field1313[var18] > 64 ? 64 : this.field1313[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class242 var21 = this.field1308[var18][var20];
                        int var22 = var21.field3597;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field3593 >> class401.field5798);
                        float var28 = (float) (var21.field3584 >> class401.field5798);
                        float var29 = (float) (var21.field3587 >> class401.field5798);
                        int var30 = var21.field3592 >> class401.field5798;
                        this.field1303.method389(112, 0.0F);
                        this.field1303.method389(54, 0.0F);
                        this.field1303.method389(-100, (float) (-var30) * var9 + var27);
                        this.field1303.method389(19, (float) (-var30) * var10 + var28);
                        this.field1303.method389(-93, (float) (-var30) * var11 + var29);
                        this.field1303.method1727(-128, var23);
                        this.field1303.method1727(-128, var24);
                        this.field1303.method1727(-128, var25);
                        this.field1303.method1727(-128, var26);
                        this.field1303.method389(-84, 1.0F);
                        this.field1303.method389(-83, 0.0F);
                        this.field1303.method389(-74, (float) var30 * var12 + var27);
                        this.field1303.method389(-79, (float) var30 * var13 + var28);
                        this.field1303.method389(61, (float) var30 * var14 + var29);
                        this.field1303.method1727(-128, var23);
                        this.field1303.method1727(-128, var24);
                        this.field1303.method1727(-128, var25);
                        this.field1303.method1727(-128, var26);
                        this.field1303.method389(123, 1.0F);
                        this.field1303.method389(89, 1.0F);
                        this.field1303.method389(74, (float) var30 * var9 + var27);
                        this.field1303.method389(-60, (float) var30 * var10 + var28);
                        this.field1303.method389(-107, (float) var30 * var11 + var29);
                        this.field1303.method1727(-128, var23);
                        this.field1303.method1727(-128, var24);
                        this.field1303.method1727(-128, var25);
                        this.field1303.method1727(-128, var26);
                        this.field1303.method389(-104, 0.0F);
                        this.field1303.method389(-58, 1.0F);
                        this.field1303.method389(88, (float) var30 * var15 + var27);
                        this.field1303.method389(104, (float) var30 * var16 + var28);
                        this.field1303.method389(35, (float) var30 * var17 + var29);
                        this.field1303.method1727(-128, var23);
                        this.field1303.method1727(-128, var24);
                        this.field1303.method1727(-128, var25);
                        this.field1303.method1727(-128, var26);
                    }
                    if (this.field1313[var18] > 64) {
                        int var31 = this.field1313[var18] - 64 - 1;
                        for (int var32 = this.field1305[var31] - 1; var32 >= 0; var32--) {
                            class242 var33 = this.field1314[var31][var32];
                            int var34 = var33.field3597;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field3593 >> class401.field5798);
                            float var40 = (float) (var33.field3584 >> class401.field5798);
                            float var41 = (float) (var33.field3587 >> class401.field5798);
                            int var42 = var33.field3592 >> class401.field5798;
                            this.field1303.method389(105, 0.0F);
                            this.field1303.method389(-76, 0.0F);
                            this.field1303.method389(102, (float) (-var42) * var9 + var39);
                            this.field1303.method389(-117, (float) (-var42) * var10 + var40);
                            this.field1303.method389(-62, (float) (-var42) * var11 + var41);
                            this.field1303.method1727(-128, var35);
                            this.field1303.method1727(-128, var36);
                            this.field1303.method1727(-128, var37);
                            this.field1303.method1727(-128, var38);
                            this.field1303.method389(74, 1.0F);
                            this.field1303.method389(-80, 0.0F);
                            this.field1303.method389(44, (float) var42 * var12 + var39);
                            this.field1303.method389(-78, (float) var42 * var13 + var40);
                            this.field1303.method389(64, (float) var42 * var14 + var41);
                            this.field1303.method1727(-128, var35);
                            this.field1303.method1727(-128, var36);
                            this.field1303.method1727(-128, var37);
                            this.field1303.method1727(-128, var38);
                            this.field1303.method389(-57, 1.0F);
                            this.field1303.method389(62, 1.0F);
                            this.field1303.method389(58, (float) var42 * var9 + var39);
                            this.field1303.method389(-113, (float) var42 * var10 + var40);
                            this.field1303.method389(17, (float) var42 * var11 + var41);
                            this.field1303.method1727(-128, var35);
                            this.field1303.method1727(-128, var36);
                            this.field1303.method1727(-128, var37);
                            this.field1303.method1727(-128, var38);
                            this.field1303.method389(100, 0.0F);
                            this.field1303.method389(-72, 1.0F);
                            this.field1303.method389(119, (float) var42 * var15 + var39);
                            this.field1303.method389(-55, (float) var42 * var16 + var40);
                            this.field1303.method389(18, (float) var42 * var17 + var41);
                            this.field1303.method1727(-128, var35);
                            this.field1303.method1727(-128, var36);
                            this.field1303.method1727(-128, var37);
                            this.field1303.method1727(-128, var38);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field1313[var43] > 64 ? 64 : this.field1313[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class242 var46 = this.field1308[var43][var45];
                        int var47 = var46.field3597;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field3593 >> class401.field5798);
                        float var53 = (float) (var46.field3584 >> class401.field5798);
                        float var54 = (float) (var46.field3587 >> class401.field5798);
                        int var55 = var46.field3592 >> class401.field5798;
                        this.field1303.method388((byte) 56, 0.0F);
                        this.field1303.method388((byte) 56, 0.0F);
                        this.field1303.method388((byte) 56, (float) (-var55) * var9 + var52);
                        this.field1303.method388((byte) 56, (float) (-var55) * var10 + var53);
                        this.field1303.method388((byte) 56, (float) (-var55) * var11 + var54);
                        this.field1303.method1727(-128, var48);
                        this.field1303.method1727(-128, var49);
                        this.field1303.method1727(-128, var50);
                        this.field1303.method1727(-128, var51);
                        this.field1303.method388((byte) 56, 1.0F);
                        this.field1303.method388((byte) 56, 0.0F);
                        this.field1303.method388((byte) 56, (float) var55 * var12 + var52);
                        this.field1303.method388((byte) 56, (float) var55 * var13 + var53);
                        this.field1303.method388((byte) 56, (float) var55 * var14 + var54);
                        this.field1303.method1727(-128, var48);
                        this.field1303.method1727(-128, var49);
                        this.field1303.method1727(-128, var50);
                        this.field1303.method1727(-128, var51);
                        this.field1303.method388((byte) 56, 1.0F);
                        this.field1303.method388((byte) 56, 1.0F);
                        this.field1303.method388((byte) 56, (float) var55 * var9 + var52);
                        this.field1303.method388((byte) 56, (float) var55 * var10 + var53);
                        this.field1303.method388((byte) 56, (float) var55 * var11 + var54);
                        this.field1303.method1727(-128, var48);
                        this.field1303.method1727(-128, var49);
                        this.field1303.method1727(-128, var50);
                        this.field1303.method1727(-128, var51);
                        this.field1303.method388((byte) 56, 0.0F);
                        this.field1303.method388((byte) 56, 1.0F);
                        this.field1303.method388((byte) 56, (float) var55 * var15 + var52);
                        this.field1303.method388((byte) 56, (float) var55 * var16 + var53);
                        this.field1303.method388((byte) 56, (float) var55 * var17 + var54);
                        this.field1303.method1727(-128, var48);
                        this.field1303.method1727(-128, var49);
                        this.field1303.method1727(-128, var50);
                        this.field1303.method1727(-128, var51);
                    }
                    if (this.field1313[var43] > 64) {
                        int var56 = this.field1313[var43] - 64 - 1;
                        for (int var57 = this.field1305[var56] - 1; var57 >= 0; var57--) {
                            class242 var58 = this.field1314[var56][var57];
                            int var59 = var58.field3597;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field3593 >> class401.field5798);
                            float var65 = (float) (var58.field3584 >> class401.field5798);
                            float var66 = (float) (var58.field3587 >> class401.field5798);
                            int var67 = var58.field3592 >> class401.field5798;
                            this.field1303.method388((byte) 56, 0.0F);
                            this.field1303.method388((byte) 56, 0.0F);
                            this.field1303.method388((byte) 56, (float) (-var67) * var9 + var64);
                            this.field1303.method388((byte) 56, (float) (-var67) * var10 + var65);
                            this.field1303.method388((byte) 56, (float) (-var67) * var11 + var66);
                            this.field1303.method1727(-128, var60);
                            this.field1303.method1727(-128, var61);
                            this.field1303.method1727(-128, var62);
                            this.field1303.method1727(-128, var63);
                            this.field1303.method388((byte) 56, 1.0F);
                            this.field1303.method388((byte) 56, 0.0F);
                            this.field1303.method388((byte) 56, (float) var67 * var12 + var64);
                            this.field1303.method388((byte) 56, (float) var67 * var13 + var65);
                            this.field1303.method388((byte) 56, (float) var67 * var14 + var66);
                            this.field1303.method1727(-128, var60);
                            this.field1303.method1727(-128, var61);
                            this.field1303.method1727(-128, var62);
                            this.field1303.method1727(-128, var63);
                            this.field1303.method388((byte) 56, 1.0F);
                            this.field1303.method388((byte) 56, 1.0F);
                            this.field1303.method388((byte) 56, (float) var67 * var9 + var64);
                            this.field1303.method388((byte) 56, (float) var67 * var10 + var65);
                            this.field1303.method388((byte) 56, (float) var67 * var11 + var66);
                            this.field1303.method1727(-128, var60);
                            this.field1303.method1727(-128, var61);
                            this.field1303.method1727(-128, var62);
                            this.field1303.method1727(-128, var63);
                            this.field1303.method388((byte) 56, 0.0F);
                            this.field1303.method388((byte) 56, 1.0F);
                            this.field1303.method388((byte) 56, (float) var67 * var15 + var64);
                            this.field1303.method388((byte) 56, (float) var67 * var16 + var65);
                            this.field1303.method388((byte) 56, (float) var67 * var17 + var66);
                            this.field1303.method1727(-128, var60);
                            this.field1303.method1727(-128, var61);
                            this.field1303.method1727(-128, var62);
                            this.field1303.method1727(-128, var63);
                        }
                    }
                }
            }
        }
        if (this.field1303.field3762 != 0) {
            this.field1306.method373(24, this.field1303.field3764, this.field1303.field3762);
            arg0.method1192(this.field1309, (class352) null, this.field1311, this.field1312);
            arg0.method1180(7, 0, this.field1303.field3762 / 24);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lks;)V")
    public final void method686(class173 arg0) {
        this.field1306 = arg0.method1165(24, (byte[]) null, 196584, true);
        this.field1312 = new class352(arg0, this.field1306, 5126, 2, 0);
        this.field1309 = new class352(arg0, this.field1306, 5126, 3, 8);
        this.field1311 = new class352(arg0, this.field1306, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Lks;)V")
    private final void method687(class173 arg0) {
        arg0.method1189(true);
        this.field1304.glEnable(16384);
        this.field1304.glEnable(16385);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lks;Lci;)V")
    public final void method688(class173 arg0, class400 arg1) {
        this.field1304 = arg0.field2253;
        if (arg0.field2364 == null) {
            return;
        }
        this.method689(arg0);
        float var3 = arg0.field2364.field6227;
        float var4 = arg0.field2364.field6229;
        float var5 = arg0.field2364.field6228;
        float var6 = arg0.field2364.field6219;
        try {
            if (arg1.field5789) {
                int var23 = arg1.field5786 - arg1.field5787;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class36 var24 = arg1.field5781.field5762;
                class36 var25 = var24.field510;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field1307 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field1313[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field1305[var29] = 0;
                    }
                    while (var24 != var25) {
                        class242 var30 = (class242) var25;
                        if (var27) {
                            var26 = var30.field3585;
                            var27 = false;
                        } else if (var30.field3585 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field3587 >> class401.field5798) * var5 + (float) (var30.field3593 >> class401.field5798) * var3 + (float) (var30.field3584 >> class401.field5798) * var4 + var6) - arg1.field5787;
                        if (var31 <= 1600) {
                            if (this.field1313[var31] < 64) {
                                this.field1308[var31][this.field1313[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field1313[var31] == 64) {
                                        if (this.field1307 == 64) {
                                            break label188;
                                        }
                                        this.field1313[var31] += this.field1307++ + 1;
                                    }
                                    this.field1314[this.field1313[var31] - 64 - 1][this.field1305[this.field1313[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field510;
                    }
                    arg0.method1160(var26 >= 0 ? arg0.field2251.method2734(var26, (byte) 120) : null);
                    this.method685(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class36 var10 = arg1.field5781.field5762;
                for (class36 var11 = var10.field510; var11 != var10; var11 = var11.field510) {
                    class242 var12 = (class242) var11;
                    int var13 = (int) ((float) (var12.field3587 >> class401.field5798) * var5 + (float) (var12.field3593 >> class401.field5798) * var3 + (float) (var12.field3584 >> class401.field5798) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field1310[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class36 var15 = var10.field510;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field1307 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field1313[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field1305[var20] = 0;
                    }
                    while (var10 != var15) {
                        class242 var21 = (class242) var15;
                        if (var18) {
                            var17 = var21.field3585;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field3585 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field1310[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field1313[var22] < 64) {
                                this.field1308[var22][this.field1313[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field1313[var22] == 64) {
                                        if (this.field1307 == 64) {
                                            break label186;
                                        }
                                        this.field1313[var22] += this.field1307++ + 1;
                                    }
                                    this.field1314[this.field1313[var22] - 64 - 1][this.field1305[this.field1313[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field510;
                    }
                    arg0.method1160(var17 >= 0 ? arg0.field2251.method2734(var17, (byte) -15) : null);
                    this.method685(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method687(arg0);
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(Lks;)V")
    private final void method689(class173 arg0) {
        arg0.method1135();
        this.field1304.glDisable(16384);
        this.field1304.glDisable(16385);
        arg0.method1189(false);
        arg0.method1133(-2);
        this.field1304.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
