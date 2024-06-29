import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class276 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[F")
    private float[] field4192 = new float[16];

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lob;")
    private class292 field4193 = new class292(786336);

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    private int field4195 = 0;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[[Lft;")
    private class394[][] field4198 = new class394[64][768];

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[[Lft;")
    private class394[][] field4197 = new class394[1600][64];

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
    private int[] field4201 = new int[8191];

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[I")
    private int[] field4203 = new int[1600];

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
    private int[] field4202 = new int[64];

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lec;")
    private class101 field4199;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Ljt;")
    private class377 field4196;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Ljt;")
    private class377 field4200;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Ljt;")
    private class377 field4204;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Ljaggl/opengl;")
    private opengl field4194;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lnm;)V")
    public final void method1791(class254 arg0) {
        this.field4199 = arg0.method1644(24, (byte[]) null, 196584, true);
        this.field4200 = new class377(arg0, this.field4199, 5126, 2, 0);
        this.field4204 = new class377(arg0, this.field4199, 5126, 3, 8);
        this.field4196 = new class377(arg0, this.field4199, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Lnm;)V")
    private final void method1792(class254 arg0) {
        arg0.method1656(true);
        this.field4194.glEnable(16384);
        this.field4194.glEnable(16385);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lnm;I)V")
    private final void method1793(class254 arg0, int arg1) {
        this.field4194.glGetFloatv(2982, this.field4192, 0);
        float var3 = this.field4192[0];
        float var4 = this.field4192[4];
        float var5 = this.field4192[8];
        float var6 = this.field4192[1];
        float var7 = this.field4192[5];
        float var8 = this.field4192[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field4193.field6315 = 0;
        if (arg0.field3742) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field4203[var18] > 64 ? 64 : this.field4203[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class394 var21 = this.field4197[var18][var20];
                        int var22 = var21.field5810;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field5806 >> class73.field982);
                        float var28 = (float) (var21.field5799 >> class73.field982);
                        float var29 = (float) (var21.field5801 >> class73.field982);
                        int var30 = var21.field5807 >> class73.field982;
                        this.field4193.method1842((byte) -64, 0.0F);
                        this.field4193.method1842((byte) -64, 0.0F);
                        this.field4193.method1842((byte) -64, (float) (-var30) * var9 + var27);
                        this.field4193.method1842((byte) -64, (float) (-var30) * var10 + var28);
                        this.field4193.method1842((byte) -64, (float) (-var30) * var11 + var29);
                        this.field4193.method2619((byte) 67, var23);
                        this.field4193.method2619((byte) -125, var24);
                        this.field4193.method2619((byte) 115, var25);
                        this.field4193.method2619((byte) -9, var26);
                        this.field4193.method1842((byte) -64, 1.0F);
                        this.field4193.method1842((byte) -64, 0.0F);
                        this.field4193.method1842((byte) -64, (float) var30 * var12 + var27);
                        this.field4193.method1842((byte) -64, (float) var30 * var13 + var28);
                        this.field4193.method1842((byte) -64, (float) var30 * var14 + var29);
                        this.field4193.method2619((byte) 66, var23);
                        this.field4193.method2619((byte) -120, var24);
                        this.field4193.method2619((byte) -124, var25);
                        this.field4193.method2619((byte) -9, var26);
                        this.field4193.method1842((byte) -64, 1.0F);
                        this.field4193.method1842((byte) -64, 1.0F);
                        this.field4193.method1842((byte) -64, (float) var30 * var9 + var27);
                        this.field4193.method1842((byte) -64, (float) var30 * var10 + var28);
                        this.field4193.method1842((byte) -64, (float) var30 * var11 + var29);
                        this.field4193.method2619((byte) -121, var23);
                        this.field4193.method2619((byte) -128, var24);
                        this.field4193.method2619((byte) -119, var25);
                        this.field4193.method2619((byte) -125, var26);
                        this.field4193.method1842((byte) -64, 0.0F);
                        this.field4193.method1842((byte) -64, 1.0F);
                        this.field4193.method1842((byte) -64, (float) var30 * var15 + var27);
                        this.field4193.method1842((byte) -64, (float) var30 * var16 + var28);
                        this.field4193.method1842((byte) -64, (float) var30 * var17 + var29);
                        this.field4193.method2619((byte) -122, var23);
                        this.field4193.method2619((byte) 123, var24);
                        this.field4193.method2619((byte) -12, var25);
                        this.field4193.method2619((byte) 53, var26);
                    }
                    if (this.field4203[var18] > 64) {
                        int var31 = this.field4203[var18] - 64 - 1;
                        for (int var32 = this.field4202[var31] - 1; var32 >= 0; var32--) {
                            class394 var33 = this.field4198[var31][var32];
                            int var34 = var33.field5810;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field5806 >> class73.field982);
                            float var40 = (float) (var33.field5799 >> class73.field982);
                            float var41 = (float) (var33.field5801 >> class73.field982);
                            int var42 = var33.field5807 >> class73.field982;
                            this.field4193.method1842((byte) -64, 0.0F);
                            this.field4193.method1842((byte) -64, 0.0F);
                            this.field4193.method1842((byte) -64, (float) (-var42) * var9 + var39);
                            this.field4193.method1842((byte) -64, (float) (-var42) * var10 + var40);
                            this.field4193.method1842((byte) -64, (float) (-var42) * var11 + var41);
                            this.field4193.method2619((byte) -125, var35);
                            this.field4193.method2619((byte) 10, var36);
                            this.field4193.method2619((byte) 5, var37);
                            this.field4193.method2619((byte) -7, var38);
                            this.field4193.method1842((byte) -64, 1.0F);
                            this.field4193.method1842((byte) -64, 0.0F);
                            this.field4193.method1842((byte) -64, (float) var42 * var12 + var39);
                            this.field4193.method1842((byte) -64, (float) var42 * var13 + var40);
                            this.field4193.method1842((byte) -64, (float) var42 * var14 + var41);
                            this.field4193.method2619((byte) -121, var35);
                            this.field4193.method2619((byte) 64, var36);
                            this.field4193.method2619((byte) -124, var37);
                            this.field4193.method2619((byte) 99, var38);
                            this.field4193.method1842((byte) -64, 1.0F);
                            this.field4193.method1842((byte) -64, 1.0F);
                            this.field4193.method1842((byte) -64, (float) var42 * var9 + var39);
                            this.field4193.method1842((byte) -64, (float) var42 * var10 + var40);
                            this.field4193.method1842((byte) -64, (float) var42 * var11 + var41);
                            this.field4193.method2619((byte) 70, var35);
                            this.field4193.method2619((byte) 38, var36);
                            this.field4193.method2619((byte) 33, var37);
                            this.field4193.method2619((byte) -128, var38);
                            this.field4193.method1842((byte) -64, 0.0F);
                            this.field4193.method1842((byte) -64, 1.0F);
                            this.field4193.method1842((byte) -64, (float) var42 * var15 + var39);
                            this.field4193.method1842((byte) -64, (float) var42 * var16 + var40);
                            this.field4193.method1842((byte) -64, (float) var42 * var17 + var41);
                            this.field4193.method2619((byte) -125, var35);
                            this.field4193.method2619((byte) -119, var36);
                            this.field4193.method2619((byte) -119, var37);
                            this.field4193.method2619((byte) 86, var38);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field4203[var43] > 64 ? 64 : this.field4203[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class394 var46 = this.field4197[var43][var45];
                        int var47 = var46.field5810;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field5806 >> class73.field982);
                        float var53 = (float) (var46.field5799 >> class73.field982);
                        float var54 = (float) (var46.field5801 >> class73.field982);
                        int var55 = var46.field5807 >> class73.field982;
                        this.field4193.method1841(0.0F, (byte) -77);
                        this.field4193.method1841(0.0F, (byte) -66);
                        this.field4193.method1841((float) (-var55) * var9 + var52, (byte) 120);
                        this.field4193.method1841((float) (-var55) * var10 + var53, (byte) 123);
                        this.field4193.method1841((float) (-var55) * var11 + var54, (byte) 115);
                        this.field4193.method2619((byte) 95, var48);
                        this.field4193.method2619((byte) 104, var49);
                        this.field4193.method2619((byte) -126, var50);
                        this.field4193.method2619((byte) -125, var51);
                        this.field4193.method1841(1.0F, (byte) 116);
                        this.field4193.method1841(0.0F, (byte) -95);
                        this.field4193.method1841((float) var55 * var12 + var52, (byte) -87);
                        this.field4193.method1841((float) var55 * var13 + var53, (byte) 63);
                        this.field4193.method1841((float) var55 * var14 + var54, (byte) 82);
                        this.field4193.method2619((byte) 10, var48);
                        this.field4193.method2619((byte) -127, var49);
                        this.field4193.method2619((byte) -128, var50);
                        this.field4193.method2619((byte) -121, var51);
                        this.field4193.method1841(1.0F, (byte) 69);
                        this.field4193.method1841(1.0F, (byte) 68);
                        this.field4193.method1841((float) var55 * var9 + var52, (byte) -63);
                        this.field4193.method1841((float) var55 * var10 + var53, (byte) 118);
                        this.field4193.method1841((float) var55 * var11 + var54, (byte) -120);
                        this.field4193.method2619((byte) -127, var48);
                        this.field4193.method2619((byte) 107, var49);
                        this.field4193.method2619((byte) 90, var50);
                        this.field4193.method2619((byte) -126, var51);
                        this.field4193.method1841(0.0F, (byte) -84);
                        this.field4193.method1841(1.0F, (byte) -127);
                        this.field4193.method1841((float) var55 * var15 + var52, (byte) 103);
                        this.field4193.method1841((float) var55 * var16 + var53, (byte) -122);
                        this.field4193.method1841((float) var55 * var17 + var54, (byte) 84);
                        this.field4193.method2619((byte) 66, var48);
                        this.field4193.method2619((byte) 109, var49);
                        this.field4193.method2619((byte) -124, var50);
                        this.field4193.method2619((byte) 56, var51);
                    }
                    if (this.field4203[var43] > 64) {
                        int var56 = this.field4203[var43] - 64 - 1;
                        for (int var57 = this.field4202[var56] - 1; var57 >= 0; var57--) {
                            class394 var58 = this.field4198[var56][var57];
                            int var59 = var58.field5810;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field5806 >> class73.field982);
                            float var65 = (float) (var58.field5799 >> class73.field982);
                            float var66 = (float) (var58.field5801 >> class73.field982);
                            int var67 = var58.field5807 >> class73.field982;
                            this.field4193.method1841(0.0F, (byte) -51);
                            this.field4193.method1841(0.0F, (byte) 78);
                            this.field4193.method1841((float) (-var67) * var9 + var64, (byte) -72);
                            this.field4193.method1841((float) (-var67) * var10 + var65, (byte) -109);
                            this.field4193.method1841((float) (-var67) * var11 + var66, (byte) 57);
                            this.field4193.method2619((byte) 110, var60);
                            this.field4193.method2619((byte) -119, var61);
                            this.field4193.method2619((byte) -122, var62);
                            this.field4193.method2619((byte) -121, var63);
                            this.field4193.method1841(1.0F, (byte) -75);
                            this.field4193.method1841(0.0F, (byte) -121);
                            this.field4193.method1841((float) var67 * var12 + var64, (byte) -117);
                            this.field4193.method1841((float) var67 * var13 + var65, (byte) -104);
                            this.field4193.method1841((float) var67 * var14 + var66, (byte) 113);
                            this.field4193.method2619((byte) 117, var60);
                            this.field4193.method2619((byte) 105, var61);
                            this.field4193.method2619((byte) -125, var62);
                            this.field4193.method2619((byte) 3, var63);
                            this.field4193.method1841(1.0F, (byte) -93);
                            this.field4193.method1841(1.0F, (byte) -101);
                            this.field4193.method1841((float) var67 * var9 + var64, (byte) -100);
                            this.field4193.method1841((float) var67 * var10 + var65, (byte) 83);
                            this.field4193.method1841((float) var67 * var11 + var66, (byte) -89);
                            this.field4193.method2619((byte) 42, var60);
                            this.field4193.method2619((byte) 95, var61);
                            this.field4193.method2619((byte) -122, var62);
                            this.field4193.method2619((byte) 82, var63);
                            this.field4193.method1841(0.0F, (byte) 106);
                            this.field4193.method1841(1.0F, (byte) 81);
                            this.field4193.method1841((float) var67 * var15 + var64, (byte) -103);
                            this.field4193.method1841((float) var67 * var16 + var65, (byte) 65);
                            this.field4193.method1841((float) var67 * var17 + var66, (byte) -88);
                            this.field4193.method2619((byte) -128, var60);
                            this.field4193.method2619((byte) 3, var61);
                            this.field4193.method2619((byte) -126, var62);
                            this.field4193.method2619((byte) -124, var63);
                        }
                    }
                }
            }
        }
        if (this.field4193.field6315 != 0) {
            this.field4199.method115(24, this.field4193.field6316, this.field4193.field6315);
            arg0.method1674(this.field4204, (class377) null, this.field4196, this.field4200);
            arg0.method1619(7, 0, this.field4193.field6315 / 24);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lnm;Lim;)V")
    public final void method1794(class254 arg0, class268 arg1) {
        this.field4194 = arg0.field3648;
        if (arg0.field3766 == null) {
            return;
        }
        this.method1795(arg0);
        float var3 = arg0.field3766.field1110;
        float var4 = arg0.field3766.field1111;
        float var5 = arg0.field3766.field1120;
        float var6 = arg0.field3766.field1113;
        try {
            if (arg1.field3971) {
                int var23 = arg1.field3967 - arg1.field3969;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class342 var24 = arg1.field3965.field5876;
                class342 var25 = var24.field5114;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field4195 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field4203[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field4202[var29] = 0;
                    }
                    while (var24 != var25) {
                        class394 var30 = (class394) var25;
                        if (var27) {
                            var26 = var30.field5802;
                            var27 = false;
                        } else if (var30.field5802 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field5801 >> class73.field982) * var5 + (float) (var30.field5806 >> class73.field982) * var3 + (float) (var30.field5799 >> class73.field982) * var4 + var6) - arg1.field3969;
                        if (var31 <= 1600) {
                            if (this.field4203[var31] < 64) {
                                this.field4197[var31][this.field4203[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field4203[var31] == 64) {
                                        if (this.field4195 == 64) {
                                            break label188;
                                        }
                                        this.field4203[var31] += this.field4195++ + 1;
                                    }
                                    this.field4198[this.field4203[var31] - 64 - 1][this.field4202[this.field4203[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field5114;
                    }
                    arg0.method1653(var26 >= 0 ? arg0.field3644.method816(var26, -109) : null);
                    this.method1793(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class342 var10 = arg1.field3965.field5876;
                for (class342 var11 = var10.field5114; var11 != var10; var11 = var11.field5114) {
                    class394 var12 = (class394) var11;
                    int var13 = (int) ((float) (var12.field5801 >> class73.field982) * var5 + (float) (var12.field5806 >> class73.field982) * var3 + (float) (var12.field5799 >> class73.field982) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field4201[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class342 var15 = var10.field5114;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field4195 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field4203[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field4202[var20] = 0;
                    }
                    while (var10 != var15) {
                        class394 var21 = (class394) var15;
                        if (var18) {
                            var17 = var21.field5802;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field5802 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field4201[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field4203[var22] < 64) {
                                this.field4197[var22][this.field4203[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field4203[var22] == 64) {
                                        if (this.field4195 == 64) {
                                            break label186;
                                        }
                                        this.field4203[var22] += this.field4195++ + 1;
                                    }
                                    this.field4198[this.field4203[var22] - 64 - 1][this.field4202[this.field4203[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field5114;
                    }
                    arg0.method1653(var17 >= 0 ? arg0.field3644.method816(var17, -50) : null);
                    this.method1793(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method1792(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(Lnm;)V")
    private final void method1795(class254 arg0) {
        arg0.method1632();
        this.field4194.glDisable(16384);
        this.field4194.glDisable(16385);
        arg0.method1656(false);
        arg0.method1680(-2);
        this.field4194.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
