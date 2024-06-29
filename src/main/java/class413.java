import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class413 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[F")
    private float[] field5667 = new float[16];

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Lfi;")
    private class160 field5666 = new class160(786336);

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[[Lvm;")
    private class133[][] field5671 = new class133[1600][64];

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "[[Lvm;")
    private class133[][] field5674 = new class133[64][768];

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "[I")
    private int[] field5673 = new int[1600];

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "[I")
    private int[] field5672 = new int[64];

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "[I")
    private int[] field5678 = new int[8191];

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    private int field5670 = 0;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "Lfm;")
    private class170 field5669;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "Lfm;")
    private class170 field5675;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "Lfm;")
    private class170 field5677;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Lpc;")
    private class171 field5676;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Ljaggl/opengl;")
    private opengl field5668;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lfu;I)V")
    private final void method2479(class42 arg0, int arg1) {
        this.field5668.glGetFloatv(2982, this.field5667, 0);
        float var3 = this.field5667[0];
        float var4 = this.field5667[4];
        float var5 = this.field5667[8];
        float var6 = this.field5667[1];
        float var7 = this.field5667[5];
        float var8 = this.field5667[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5666.field2298 = 0;
        if (arg0.field622) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field5673[var18] > 64 ? 64 : this.field5673[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class133 var21 = this.field5671[var18][var20];
                        int var22 = var21.field1869;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field1862 >> class198.field2931);
                        float var28 = (float) (var21.field1863 >> class198.field2931);
                        float var29 = (float) (var21.field1864 >> class198.field2931);
                        int var30 = var21.field1870 >> class198.field2931;
                        this.field5666.method1131(0.0F, -108);
                        this.field5666.method1131(0.0F, -117);
                        this.field5666.method1131((float) (-var30) * var9 + var27, -111);
                        this.field5666.method1131((float) (-var30) * var10 + var28, -118);
                        this.field5666.method1131((float) (-var30) * var11 + var29, -120);
                        this.field5666.method1180((byte) -110, var23);
                        this.field5666.method1180((byte) -110, var24);
                        this.field5666.method1180((byte) -110, var25);
                        this.field5666.method1180((byte) -110, var26);
                        this.field5666.method1131(1.0F, -114);
                        this.field5666.method1131(0.0F, -108);
                        this.field5666.method1131((float) var30 * var12 + var27, -122);
                        this.field5666.method1131((float) var30 * var13 + var28, -109);
                        this.field5666.method1131((float) var30 * var14 + var29, -128);
                        this.field5666.method1180((byte) -110, var23);
                        this.field5666.method1180((byte) -110, var24);
                        this.field5666.method1180((byte) -110, var25);
                        this.field5666.method1180((byte) -110, var26);
                        this.field5666.method1131(1.0F, -117);
                        this.field5666.method1131(1.0F, -113);
                        this.field5666.method1131((float) var30 * var9 + var27, -117);
                        this.field5666.method1131((float) var30 * var10 + var28, -113);
                        this.field5666.method1131((float) var30 * var11 + var29, -122);
                        this.field5666.method1180((byte) -110, var23);
                        this.field5666.method1180((byte) -110, var24);
                        this.field5666.method1180((byte) -110, var25);
                        this.field5666.method1180((byte) -110, var26);
                        this.field5666.method1131(0.0F, -127);
                        this.field5666.method1131(1.0F, -120);
                        this.field5666.method1131((float) var30 * var15 + var27, -124);
                        this.field5666.method1131((float) var30 * var16 + var28, -110);
                        this.field5666.method1131((float) var30 * var17 + var29, -109);
                        this.field5666.method1180((byte) -110, var23);
                        this.field5666.method1180((byte) -110, var24);
                        this.field5666.method1180((byte) -110, var25);
                        this.field5666.method1180((byte) -110, var26);
                    }
                    if (this.field5673[var18] > 64) {
                        int var31 = this.field5673[var18] - 64 - 1;
                        for (int var32 = this.field5672[var31] - 1; var32 >= 0; var32--) {
                            class133 var33 = this.field5674[var31][var32];
                            int var34 = var33.field1869;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field1862 >> class198.field2931);
                            float var40 = (float) (var33.field1863 >> class198.field2931);
                            float var41 = (float) (var33.field1864 >> class198.field2931);
                            int var42 = var33.field1870 >> class198.field2931;
                            this.field5666.method1131(0.0F, -125);
                            this.field5666.method1131(0.0F, -122);
                            this.field5666.method1131((float) (-var42) * var9 + var39, -118);
                            this.field5666.method1131((float) (-var42) * var10 + var40, -124);
                            this.field5666.method1131((float) (-var42) * var11 + var41, -114);
                            this.field5666.method1180((byte) -110, var35);
                            this.field5666.method1180((byte) -110, var36);
                            this.field5666.method1180((byte) -110, var37);
                            this.field5666.method1180((byte) -110, var38);
                            this.field5666.method1131(1.0F, -120);
                            this.field5666.method1131(0.0F, -108);
                            this.field5666.method1131((float) var42 * var12 + var39, -111);
                            this.field5666.method1131((float) var42 * var13 + var40, -109);
                            this.field5666.method1131((float) var42 * var14 + var41, -126);
                            this.field5666.method1180((byte) -110, var35);
                            this.field5666.method1180((byte) -110, var36);
                            this.field5666.method1180((byte) -110, var37);
                            this.field5666.method1180((byte) -110, var38);
                            this.field5666.method1131(1.0F, -118);
                            this.field5666.method1131(1.0F, -117);
                            this.field5666.method1131((float) var42 * var9 + var39, -118);
                            this.field5666.method1131((float) var42 * var10 + var40, -113);
                            this.field5666.method1131((float) var42 * var11 + var41, -122);
                            this.field5666.method1180((byte) -110, var35);
                            this.field5666.method1180((byte) -110, var36);
                            this.field5666.method1180((byte) -110, var37);
                            this.field5666.method1180((byte) -110, var38);
                            this.field5666.method1131(0.0F, -116);
                            this.field5666.method1131(1.0F, -115);
                            this.field5666.method1131((float) var42 * var15 + var39, -113);
                            this.field5666.method1131((float) var42 * var16 + var40, -127);
                            this.field5666.method1131((float) var42 * var17 + var41, -124);
                            this.field5666.method1180((byte) -110, var35);
                            this.field5666.method1180((byte) -110, var36);
                            this.field5666.method1180((byte) -110, var37);
                            this.field5666.method1180((byte) -110, var38);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field5673[var43] > 64 ? 64 : this.field5673[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class133 var46 = this.field5671[var43][var45];
                        int var47 = var46.field1869;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field1862 >> class198.field2931);
                        float var53 = (float) (var46.field1863 >> class198.field2931);
                        float var54 = (float) (var46.field1864 >> class198.field2931);
                        int var55 = var46.field1870 >> class198.field2931;
                        this.field5666.method1132((byte) 87, 0.0F);
                        this.field5666.method1132((byte) 87, 0.0F);
                        this.field5666.method1132((byte) 87, (float) (-var55) * var9 + var52);
                        this.field5666.method1132((byte) 87, (float) (-var55) * var10 + var53);
                        this.field5666.method1132((byte) 87, (float) (-var55) * var11 + var54);
                        this.field5666.method1180((byte) -110, var48);
                        this.field5666.method1180((byte) -110, var49);
                        this.field5666.method1180((byte) -110, var50);
                        this.field5666.method1180((byte) -110, var51);
                        this.field5666.method1132((byte) 87, 1.0F);
                        this.field5666.method1132((byte) 87, 0.0F);
                        this.field5666.method1132((byte) 87, (float) var55 * var12 + var52);
                        this.field5666.method1132((byte) 87, (float) var55 * var13 + var53);
                        this.field5666.method1132((byte) 87, (float) var55 * var14 + var54);
                        this.field5666.method1180((byte) -110, var48);
                        this.field5666.method1180((byte) -110, var49);
                        this.field5666.method1180((byte) -110, var50);
                        this.field5666.method1180((byte) -110, var51);
                        this.field5666.method1132((byte) 87, 1.0F);
                        this.field5666.method1132((byte) 87, 1.0F);
                        this.field5666.method1132((byte) 87, (float) var55 * var9 + var52);
                        this.field5666.method1132((byte) 87, (float) var55 * var10 + var53);
                        this.field5666.method1132((byte) 87, (float) var55 * var11 + var54);
                        this.field5666.method1180((byte) -110, var48);
                        this.field5666.method1180((byte) -110, var49);
                        this.field5666.method1180((byte) -110, var50);
                        this.field5666.method1180((byte) -110, var51);
                        this.field5666.method1132((byte) 87, 0.0F);
                        this.field5666.method1132((byte) 87, 1.0F);
                        this.field5666.method1132((byte) 87, (float) var55 * var15 + var52);
                        this.field5666.method1132((byte) 87, (float) var55 * var16 + var53);
                        this.field5666.method1132((byte) 87, (float) var55 * var17 + var54);
                        this.field5666.method1180((byte) -110, var48);
                        this.field5666.method1180((byte) -110, var49);
                        this.field5666.method1180((byte) -110, var50);
                        this.field5666.method1180((byte) -110, var51);
                    }
                    if (this.field5673[var43] > 64) {
                        int var56 = this.field5673[var43] - 64 - 1;
                        for (int var57 = this.field5672[var56] - 1; var57 >= 0; var57--) {
                            class133 var58 = this.field5674[var56][var57];
                            int var59 = var58.field1869;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field1862 >> class198.field2931);
                            float var65 = (float) (var58.field1863 >> class198.field2931);
                            float var66 = (float) (var58.field1864 >> class198.field2931);
                            int var67 = var58.field1870 >> class198.field2931;
                            this.field5666.method1132((byte) 87, 0.0F);
                            this.field5666.method1132((byte) 87, 0.0F);
                            this.field5666.method1132((byte) 87, (float) (-var67) * var9 + var64);
                            this.field5666.method1132((byte) 87, (float) (-var67) * var10 + var65);
                            this.field5666.method1132((byte) 87, (float) (-var67) * var11 + var66);
                            this.field5666.method1180((byte) -110, var60);
                            this.field5666.method1180((byte) -110, var61);
                            this.field5666.method1180((byte) -110, var62);
                            this.field5666.method1180((byte) -110, var63);
                            this.field5666.method1132((byte) 87, 1.0F);
                            this.field5666.method1132((byte) 87, 0.0F);
                            this.field5666.method1132((byte) 87, (float) var67 * var12 + var64);
                            this.field5666.method1132((byte) 87, (float) var67 * var13 + var65);
                            this.field5666.method1132((byte) 87, (float) var67 * var14 + var66);
                            this.field5666.method1180((byte) -110, var60);
                            this.field5666.method1180((byte) -110, var61);
                            this.field5666.method1180((byte) -110, var62);
                            this.field5666.method1180((byte) -110, var63);
                            this.field5666.method1132((byte) 87, 1.0F);
                            this.field5666.method1132((byte) 87, 1.0F);
                            this.field5666.method1132((byte) 87, (float) var67 * var9 + var64);
                            this.field5666.method1132((byte) 87, (float) var67 * var10 + var65);
                            this.field5666.method1132((byte) 87, (float) var67 * var11 + var66);
                            this.field5666.method1180((byte) -110, var60);
                            this.field5666.method1180((byte) -110, var61);
                            this.field5666.method1180((byte) -110, var62);
                            this.field5666.method1180((byte) -110, var63);
                            this.field5666.method1132((byte) 87, 0.0F);
                            this.field5666.method1132((byte) 87, 1.0F);
                            this.field5666.method1132((byte) 87, (float) var67 * var15 + var64);
                            this.field5666.method1132((byte) 87, (float) var67 * var16 + var65);
                            this.field5666.method1132((byte) 87, (float) var67 * var17 + var66);
                            this.field5666.method1180((byte) -110, var60);
                            this.field5666.method1180((byte) -110, var61);
                            this.field5666.method1180((byte) -110, var62);
                            this.field5666.method1180((byte) -110, var63);
                        }
                    }
                }
            }
        }
        if (this.field5666.field2298 != 0) {
            this.field5676.method467(24, this.field5666.field2262, this.field5666.field2298);
            arg0.method406(this.field5669, (class170) null, this.field5677, this.field5675);
            arg0.method441(7, 0, this.field5666.field2298 / 24);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lfu;)V")
    public final void method2480(class42 arg0) {
        this.field5676 = arg0.method401(24, (byte[]) null, 196584, true);
        this.field5675 = new class170(arg0, this.field5676, 5126, 2, 0);
        this.field5669 = new class170(arg0, this.field5676, 5126, 3, 8);
        this.field5677 = new class170(arg0, this.field5676, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Lfu;)V")
    private final void method2481(class42 arg0) {
        arg0.method290();
        this.field5668.glDisable(16384);
        this.field5668.glDisable(16385);
        arg0.method388(false);
        arg0.method347(-2);
        this.field5668.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lfu;Lpa;)V")
    public final void method2482(class42 arg0, class404 arg1) {
        this.field5668 = arg0.field557;
        if (arg0.field591 == null) {
            return;
        }
        this.method2481(arg0);
        float var3 = arg0.field591.field157;
        float var4 = arg0.field591.field155;
        float var5 = arg0.field591.field152;
        float var6 = arg0.field591.field162;
        try {
            if (arg1.field5530) {
                int var23 = arg1.field5531 - arg1.field5529;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class360 var24 = arg1.field5528.field4710;
                class360 var25 = var24.field4948;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field5670 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field5673[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field5672[var29] = 0;
                    }
                    while (var24 != var25) {
                        class133 var30 = (class133) var25;
                        if (var27) {
                            var26 = var30.field1872;
                            var27 = false;
                        } else if (var30.field1872 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field1864 >> class198.field2931) * var5 + (float) (var30.field1863 >> class198.field2931) * var4 + (float) (var30.field1862 >> class198.field2931) * var3 + var6) - arg1.field5529;
                        if (var31 <= 1600) {
                            if (this.field5673[var31] < 64) {
                                this.field5671[var31][this.field5673[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field5673[var31] == 64) {
                                        if (this.field5670 == 64) {
                                            break label188;
                                        }
                                        this.field5673[var31] += this.field5670++ + 1;
                                    }
                                    this.field5674[this.field5673[var31] - 64 - 1][this.field5672[this.field5673[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field4948;
                    }
                    arg0.method303(var26 >= 0 ? arg0.field556.method2729((byte) -91, var26) : null);
                    this.method2479(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class360 var10 = arg1.field5528.field4710;
                for (class360 var11 = var10.field4948; var11 != var10; var11 = var11.field4948) {
                    class133 var12 = (class133) var11;
                    int var13 = (int) ((float) (var12.field1864 >> class198.field2931) * var5 + (float) (var12.field1863 >> class198.field2931) * var4 + (float) (var12.field1862 >> class198.field2931) * var3 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field5678[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class360 var15 = var10.field4948;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field5670 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field5673[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field5672[var20] = 0;
                    }
                    while (var10 != var15) {
                        class133 var21 = (class133) var15;
                        if (var18) {
                            var17 = var21.field1872;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field1872 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field5678[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field5673[var22] < 64) {
                                this.field5671[var22][this.field5673[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field5673[var22] == 64) {
                                        if (this.field5670 == 64) {
                                            break label186;
                                        }
                                        this.field5673[var22] += this.field5670++ + 1;
                                    }
                                    this.field5674[this.field5673[var22] - 64 - 1][this.field5672[this.field5673[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field4948;
                    }
                    arg0.method303(var17 >= 0 ? arg0.field556.method2729((byte) -127, var17) : null);
                    this.method2479(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2483(arg0);
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(Lfu;)V")
    private final void method2483(class42 arg0) {
        arg0.method388(true);
        this.field5668.glEnable(16384);
        this.field5668.glEnable(16385);
    }
}
