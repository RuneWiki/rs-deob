import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class116 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[F")
    private float[] field1601 = new float[16];

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "Lbh;")
    private class24 field1603 = new class24(786336);

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "[I")
    private int[] field1605 = new int[1600];

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "[I")
    private int[] field1607 = new int[64];

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "[[Laa;")
    private class281[][] field1612 = new class281[1600][64];

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[[Laa;")
    private class281[][] field1608 = new class281[64][768];

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
    private int[] field1609 = new int[8191];

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    private int field1613 = 0;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lqd;")
    private class259 field1604;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Lqd;")
    private class259 field1606;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lqd;")
    private class259 field1610;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Leb;")
    private class371 field1611;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Ljaggl/opengl;")
    private opengl field1602;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsq;I)V")
    private final void method846(class96 arg0, int arg1) {
        this.field1602.glGetFloatv(2982, this.field1601, 0);
        float var3 = this.field1601[0];
        float var4 = this.field1601[4];
        float var5 = this.field1601[8];
        float var6 = this.field1601[1];
        float var7 = this.field1601[5];
        float var8 = this.field1601[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field1603.field3044 = 0;
        if (arg0.field1280) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field1605[var18] > 64 ? 64 : this.field1605[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class281 var21 = this.field1612[var18][var20];
                        int var22 = var21.field4496;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field4506 >> class142.field2255);
                        float var28 = (float) (var21.field4503 >> class142.field2255);
                        float var29 = (float) (var21.field4494 >> class142.field2255);
                        int var30 = var21.field4505 >> class142.field2255;
                        this.field1603.method160((byte) -123, 0.0F);
                        this.field1603.method160((byte) -89, 0.0F);
                        this.field1603.method160((byte) -80, (float) (-var30) * var9 + var27);
                        this.field1603.method160((byte) 116, (float) (-var30) * var10 + var28);
                        this.field1603.method160((byte) 123, (float) (-var30) * var11 + var29);
                        this.field1603.method1312(var23, -24);
                        this.field1603.method1312(var24, -123);
                        this.field1603.method1312(var25, -69);
                        this.field1603.method1312(var26, -38);
                        this.field1603.method160((byte) 116, 1.0F);
                        this.field1603.method160((byte) -28, 0.0F);
                        this.field1603.method160((byte) 118, (float) var30 * var12 + var27);
                        this.field1603.method160((byte) 123, (float) var30 * var13 + var28);
                        this.field1603.method160((byte) 121, (float) var30 * var14 + var29);
                        this.field1603.method1312(var23, -118);
                        this.field1603.method1312(var24, -112);
                        this.field1603.method1312(var25, -23);
                        this.field1603.method1312(var26, -50);
                        this.field1603.method160((byte) 123, 1.0F);
                        this.field1603.method160((byte) -108, 1.0F);
                        this.field1603.method160((byte) -31, (float) var30 * var9 + var27);
                        this.field1603.method160((byte) -125, (float) var30 * var10 + var28);
                        this.field1603.method160((byte) -32, (float) var30 * var11 + var29);
                        this.field1603.method1312(var23, -99);
                        this.field1603.method1312(var24, -64);
                        this.field1603.method1312(var25, -113);
                        this.field1603.method1312(var26, -102);
                        this.field1603.method160((byte) 120, 0.0F);
                        this.field1603.method160((byte) 126, 1.0F);
                        this.field1603.method160((byte) 118, (float) var30 * var15 + var27);
                        this.field1603.method160((byte) 120, (float) var30 * var16 + var28);
                        this.field1603.method160((byte) -128, (float) var30 * var17 + var29);
                        this.field1603.method1312(var23, -97);
                        this.field1603.method1312(var24, -104);
                        this.field1603.method1312(var25, -112);
                        this.field1603.method1312(var26, -110);
                    }
                    if (this.field1605[var18] > 64) {
                        int var31 = this.field1605[var18] - 64 - 1;
                        for (int var32 = this.field1607[var31] - 1; var32 >= 0; var32--) {
                            class281 var33 = this.field1608[var31][var32];
                            int var34 = var33.field4496;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field4506 >> class142.field2255);
                            float var40 = (float) (var33.field4503 >> class142.field2255);
                            float var41 = (float) (var33.field4494 >> class142.field2255);
                            int var42 = var33.field4505 >> class142.field2255;
                            this.field1603.method160((byte) -71, 0.0F);
                            this.field1603.method160((byte) -22, 0.0F);
                            this.field1603.method160((byte) -59, (float) (-var42) * var9 + var39);
                            this.field1603.method160((byte) 117, (float) (-var42) * var10 + var40);
                            this.field1603.method160((byte) -24, (float) (-var42) * var11 + var41);
                            this.field1603.method1312(var35, -61);
                            this.field1603.method1312(var36, -85);
                            this.field1603.method1312(var37, -23);
                            this.field1603.method1312(var38, -89);
                            this.field1603.method160((byte) 122, 1.0F);
                            this.field1603.method160((byte) -28, 0.0F);
                            this.field1603.method160((byte) 123, (float) var42 * var12 + var39);
                            this.field1603.method160((byte) -38, (float) var42 * var13 + var40);
                            this.field1603.method160((byte) -30, (float) var42 * var14 + var41);
                            this.field1603.method1312(var35, -115);
                            this.field1603.method1312(var36, -71);
                            this.field1603.method1312(var37, -106);
                            this.field1603.method1312(var38, -64);
                            this.field1603.method160((byte) -34, 1.0F);
                            this.field1603.method160((byte) -124, 1.0F);
                            this.field1603.method160((byte) 116, (float) var42 * var9 + var39);
                            this.field1603.method160((byte) 122, (float) var42 * var10 + var40);
                            this.field1603.method160((byte) 120, (float) var42 * var11 + var41);
                            this.field1603.method1312(var35, -45);
                            this.field1603.method1312(var36, -28);
                            this.field1603.method1312(var37, -79);
                            this.field1603.method1312(var38, -27);
                            this.field1603.method160((byte) 115, 0.0F);
                            this.field1603.method160((byte) -30, 1.0F);
                            this.field1603.method160((byte) -117, (float) var42 * var15 + var39);
                            this.field1603.method160((byte) -31, (float) var42 * var16 + var40);
                            this.field1603.method160((byte) -50, (float) var42 * var17 + var41);
                            this.field1603.method1312(var35, -127);
                            this.field1603.method1312(var36, -39);
                            this.field1603.method1312(var37, -112);
                            this.field1603.method1312(var38, -23);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field1605[var43] > 64 ? 64 : this.field1605[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class281 var46 = this.field1612[var43][var45];
                        int var47 = var46.field4496;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field4506 >> class142.field2255);
                        float var53 = (float) (var46.field4503 >> class142.field2255);
                        float var54 = (float) (var46.field4494 >> class142.field2255);
                        int var55 = var46.field4505 >> class142.field2255;
                        this.field1603.method161(0.0F, (byte) 102);
                        this.field1603.method161(0.0F, (byte) 50);
                        this.field1603.method161((float) (-var55) * var9 + var52, (byte) -128);
                        this.field1603.method161((float) (-var55) * var10 + var53, (byte) 120);
                        this.field1603.method161((float) (-var55) * var11 + var54, (byte) -111);
                        this.field1603.method1312(var48, -47);
                        this.field1603.method1312(var49, -107);
                        this.field1603.method1312(var50, -121);
                        this.field1603.method1312(var51, -50);
                        this.field1603.method161(1.0F, (byte) -114);
                        this.field1603.method161(0.0F, (byte) 54);
                        this.field1603.method161((float) var55 * var12 + var52, (byte) -113);
                        this.field1603.method161((float) var55 * var13 + var53, (byte) 123);
                        this.field1603.method161((float) var55 * var14 + var54, (byte) 47);
                        this.field1603.method1312(var48, -56);
                        this.field1603.method1312(var49, -116);
                        this.field1603.method1312(var50, -124);
                        this.field1603.method1312(var51, -57);
                        this.field1603.method161(1.0F, (byte) 123);
                        this.field1603.method161(1.0F, (byte) -107);
                        this.field1603.method161((float) var55 * var9 + var52, (byte) -125);
                        this.field1603.method161((float) var55 * var10 + var53, (byte) 78);
                        this.field1603.method161((float) var55 * var11 + var54, (byte) -109);
                        this.field1603.method1312(var48, -91);
                        this.field1603.method1312(var49, -73);
                        this.field1603.method1312(var50, -77);
                        this.field1603.method1312(var51, -35);
                        this.field1603.method161(0.0F, (byte) -126);
                        this.field1603.method161(1.0F, (byte) -110);
                        this.field1603.method161((float) var55 * var15 + var52, (byte) 52);
                        this.field1603.method161((float) var55 * var16 + var53, (byte) 85);
                        this.field1603.method161((float) var55 * var17 + var54, (byte) -126);
                        this.field1603.method1312(var48, -98);
                        this.field1603.method1312(var49, -22);
                        this.field1603.method1312(var50, -28);
                        this.field1603.method1312(var51, -91);
                    }
                    if (this.field1605[var43] > 64) {
                        int var56 = this.field1605[var43] - 64 - 1;
                        for (int var57 = this.field1607[var56] - 1; var57 >= 0; var57--) {
                            class281 var58 = this.field1608[var56][var57];
                            int var59 = var58.field4496;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field4506 >> class142.field2255);
                            float var65 = (float) (var58.field4503 >> class142.field2255);
                            float var66 = (float) (var58.field4494 >> class142.field2255);
                            int var67 = var58.field4505 >> class142.field2255;
                            this.field1603.method161(0.0F, (byte) -128);
                            this.field1603.method161(0.0F, (byte) -109);
                            this.field1603.method161((float) (-var67) * var9 + var64, (byte) 68);
                            this.field1603.method161((float) (-var67) * var10 + var65, (byte) -115);
                            this.field1603.method161((float) (-var67) * var11 + var66, (byte) 17);
                            this.field1603.method1312(var60, -26);
                            this.field1603.method1312(var61, -122);
                            this.field1603.method1312(var62, -111);
                            this.field1603.method1312(var63, -22);
                            this.field1603.method161(1.0F, (byte) 17);
                            this.field1603.method161(0.0F, (byte) -124);
                            this.field1603.method161((float) var67 * var12 + var64, (byte) -118);
                            this.field1603.method161((float) var67 * var13 + var65, (byte) -112);
                            this.field1603.method161((float) var67 * var14 + var66, (byte) 56);
                            this.field1603.method1312(var60, -86);
                            this.field1603.method1312(var61, -86);
                            this.field1603.method1312(var62, -115);
                            this.field1603.method1312(var63, -64);
                            this.field1603.method161(1.0F, (byte) -111);
                            this.field1603.method161(1.0F, (byte) 119);
                            this.field1603.method161((float) var67 * var9 + var64, (byte) -115);
                            this.field1603.method161((float) var67 * var10 + var65, (byte) 69);
                            this.field1603.method161((float) var67 * var11 + var66, (byte) 93);
                            this.field1603.method1312(var60, -116);
                            this.field1603.method1312(var61, -40);
                            this.field1603.method1312(var62, -83);
                            this.field1603.method1312(var63, -76);
                            this.field1603.method161(0.0F, (byte) -125);
                            this.field1603.method161(1.0F, (byte) 67);
                            this.field1603.method161((float) var67 * var15 + var64, (byte) -122);
                            this.field1603.method161((float) var67 * var16 + var65, (byte) -125);
                            this.field1603.method161((float) var67 * var17 + var66, (byte) 117);
                            this.field1603.method1312(var60, -68);
                            this.field1603.method1312(var61, -106);
                            this.field1603.method1312(var62, -73);
                            this.field1603.method1312(var63, -52);
                        }
                    }
                }
            }
        }
        if (this.field1603.field3044 != 0) {
            this.field1611.method83(24, this.field1603.field3066, this.field1603.field3044);
            arg0.method607(this.field1604, (class259) null, this.field1606, this.field1610);
            arg0.method576(7, 0, this.field1603.field3044 / 24);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsq;Ljp;)V")
    public final void method847(class96 arg0, class198 arg1) {
        this.field1602 = arg0.field1156;
        if (arg0.field1213 == null) {
            return;
        }
        this.method848(arg0);
        float var3 = arg0.field1213.field5125;
        float var4 = arg0.field1213.field5128;
        float var5 = arg0.field1213.field5134;
        float var6 = arg0.field1213.field5127;
        try {
            if (arg1.field3197) {
                int var23 = arg1.field3199 - arg1.field3198;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class135 var24 = arg1.field3189.field5150;
                class135 var25 = var24.field2114;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field1613 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field1605[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field1607[var29] = 0;
                    }
                    while (var24 != var25) {
                        class281 var30 = (class281) var25;
                        if (var27) {
                            var26 = var30.field4495;
                            var27 = false;
                        } else if (var30.field4495 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field4494 >> class142.field2255) * var5 + (float) (var30.field4506 >> class142.field2255) * var3 + (float) (var30.field4503 >> class142.field2255) * var4 + var6) - arg1.field3198;
                        if (var31 <= 1600) {
                            if (this.field1605[var31] < 64) {
                                this.field1612[var31][this.field1605[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field1605[var31] == 64) {
                                        if (this.field1613 == 64) {
                                            break label188;
                                        }
                                        this.field1605[var31] += this.field1613++ + 1;
                                    }
                                    this.field1608[this.field1605[var31] - 64 - 1][this.field1607[this.field1605[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field2114;
                    }
                    arg0.method688(var26 >= 0 ? arg0.field1164.method1158(var26, -1) : null);
                    this.method846(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class135 var10 = arg1.field3189.field5150;
                for (class135 var11 = var10.field2114; var11 != var10; var11 = var11.field2114) {
                    class281 var12 = (class281) var11;
                    int var13 = (int) ((float) (var12.field4494 >> class142.field2255) * var5 + (float) (var12.field4506 >> class142.field2255) * var3 + (float) (var12.field4503 >> class142.field2255) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field1609[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class135 var15 = var10.field2114;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field1613 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field1605[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field1607[var20] = 0;
                    }
                    while (var10 != var15) {
                        class281 var21 = (class281) var15;
                        if (var18) {
                            var17 = var21.field4495;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field4495 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field1609[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field1605[var22] < 64) {
                                this.field1612[var22][this.field1605[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field1605[var22] == 64) {
                                        if (this.field1613 == 64) {
                                            break label186;
                                        }
                                        this.field1605[var22] += this.field1613++ + 1;
                                    }
                                    this.field1608[this.field1605[var22] - 64 - 1][this.field1607[this.field1605[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field2114;
                    }
                    arg0.method688(var17 >= 0 ? arg0.field1164.method1158(var17, -1) : null);
                    this.method846(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method850(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lsq;)V")
    private final void method848(class96 arg0) {
        arg0.method669();
        this.field1602.glDisable(16384);
        this.field1602.glDisable(16385);
        arg0.method592(false);
        arg0.method633(-2);
        this.field1602.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lsq;)V")
    public final void method849(class96 arg0) {
        this.field1611 = arg0.method644(24, (byte[]) null, 196584, true);
        this.field1610 = new class259(arg0, this.field1611, 5126, 2, 0);
        this.field1604 = new class259(arg0, this.field1611, 5126, 3, 8);
        this.field1606 = new class259(arg0, this.field1611, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lsq;)V")
    private final void method850(class96 arg0) {
        arg0.method592(true);
        this.field1602.glEnable(16384);
        this.field1602.glEnable(16385);
    }
}
