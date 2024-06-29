import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class391 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[F")
    private float[] field5493 = new float[16];

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Llb;")
    private class322 field5494 = new class322(786336);

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "[I")
    private int[] field5497 = new int[8191];

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "[[Lab;")
    private class401[][] field5499 = new class401[1600][64];

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "[[Lab;")
    private class401[][] field5500 = new class401[64][768];

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "[I")
    private int[] field5502 = new int[64];

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "[I")
    private int[] field5503 = new int[1600];

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    private int field5504 = 0;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Lwi;")
    private class273 field5496;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lwi;")
    private class273 field5501;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "Lwi;")
    private class273 field5505;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lmp;")
    private class454 field5498;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Ljaggl/opengl;")
    private opengl field5495;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lig;I)V", line = 3)
    private final void method2464(class132 arg0, int arg1) {
        this.field5495.glGetFloatv(2982, this.field5493, 0);
        float var3 = this.field5493[0];
        float var4 = this.field5493[4];
        float var5 = this.field5493[8];
        float var6 = this.field5493[1];
        float var7 = this.field5493[5];
        float var8 = this.field5493[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5494.field1880 = 0;
        if (arg0.field1998) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field5503[var18] > 64 ? 64 : this.field5503[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class401 var21 = this.field5499[var18][var20];
                        int var22 = var21.field5634;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field5638 >> class80.field1031);
                        float var28 = (float) (var21.field5627 >> class80.field1031);
                        float var29 = (float) (var21.field5632 >> class80.field1031);
                        int var30 = var21.field5636 >> class80.field1031;
                        this.field5494.method2135((byte) 122, 0.0F);
                        this.field5494.method2135((byte) 122, 0.0F);
                        this.field5494.method2135((byte) 122, (float) (-var30) * var9 + var27);
                        this.field5494.method2135((byte) 122, (float) (-var30) * var10 + var28);
                        this.field5494.method2135((byte) 122, (float) (-var30) * var11 + var29);
                        this.field5494.method831(var23, (byte) 123);
                        this.field5494.method831(var24, (byte) 120);
                        this.field5494.method831(var25, (byte) 117);
                        this.field5494.method831(var26, (byte) 113);
                        this.field5494.method2135((byte) 122, 1.0F);
                        this.field5494.method2135((byte) 122, 0.0F);
                        this.field5494.method2135((byte) 122, (float) var30 * var12 + var27);
                        this.field5494.method2135((byte) 122, (float) var30 * var13 + var28);
                        this.field5494.method2135((byte) 122, (float) var30 * var14 + var29);
                        this.field5494.method831(var23, (byte) 119);
                        this.field5494.method831(var24, (byte) -62);
                        this.field5494.method831(var25, (byte) 120);
                        this.field5494.method831(var26, (byte) -17);
                        this.field5494.method2135((byte) 122, 1.0F);
                        this.field5494.method2135((byte) 122, 1.0F);
                        this.field5494.method2135((byte) 122, (float) var30 * var9 + var27);
                        this.field5494.method2135((byte) 122, (float) var30 * var10 + var28);
                        this.field5494.method2135((byte) 122, (float) var30 * var11 + var29);
                        this.field5494.method831(var23, (byte) 127);
                        this.field5494.method831(var24, (byte) 121);
                        this.field5494.method831(var25, (byte) -38);
                        this.field5494.method831(var26, (byte) 121);
                        this.field5494.method2135((byte) 122, 0.0F);
                        this.field5494.method2135((byte) 122, 1.0F);
                        this.field5494.method2135((byte) 122, (float) var30 * var15 + var27);
                        this.field5494.method2135((byte) 122, (float) var30 * var16 + var28);
                        this.field5494.method2135((byte) 122, (float) var30 * var17 + var29);
                        this.field5494.method831(var23, (byte) -18);
                        this.field5494.method831(var24, (byte) -39);
                        this.field5494.method831(var25, (byte) 122);
                        this.field5494.method831(var26, (byte) 124);
                    }
                    if (this.field5503[var18] > 64) {
                        int var31 = this.field5503[var18] - 64 - 1;
                        for (int var32 = this.field5502[var31] - 1; var32 >= 0; var32--) {
                            class401 var33 = this.field5500[var31][var32];
                            int var34 = var33.field5634;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field5638 >> class80.field1031);
                            float var40 = (float) (var33.field5627 >> class80.field1031);
                            float var41 = (float) (var33.field5632 >> class80.field1031);
                            int var42 = var33.field5636 >> class80.field1031;
                            this.field5494.method2135((byte) 122, 0.0F);
                            this.field5494.method2135((byte) 122, 0.0F);
                            this.field5494.method2135((byte) 122, (float) (-var42) * var9 + var39);
                            this.field5494.method2135((byte) 122, (float) (-var42) * var10 + var40);
                            this.field5494.method2135((byte) 122, (float) (-var42) * var11 + var41);
                            this.field5494.method831(var35, (byte) 110);
                            this.field5494.method831(var36, (byte) -52);
                            this.field5494.method831(var37, (byte) -55);
                            this.field5494.method831(var38, (byte) -103);
                            this.field5494.method2135((byte) 122, 1.0F);
                            this.field5494.method2135((byte) 122, 0.0F);
                            this.field5494.method2135((byte) 122, (float) var42 * var12 + var39);
                            this.field5494.method2135((byte) 122, (float) var42 * var13 + var40);
                            this.field5494.method2135((byte) 122, (float) var42 * var14 + var41);
                            this.field5494.method831(var35, (byte) 115);
                            this.field5494.method831(var36, (byte) -123);
                            this.field5494.method831(var37, (byte) -114);
                            this.field5494.method831(var38, (byte) 116);
                            this.field5494.method2135((byte) 122, 1.0F);
                            this.field5494.method2135((byte) 122, 1.0F);
                            this.field5494.method2135((byte) 122, (float) var42 * var9 + var39);
                            this.field5494.method2135((byte) 122, (float) var42 * var10 + var40);
                            this.field5494.method2135((byte) 122, (float) var42 * var11 + var41);
                            this.field5494.method831(var35, (byte) 114);
                            this.field5494.method831(var36, (byte) -32);
                            this.field5494.method831(var37, (byte) -18);
                            this.field5494.method831(var38, (byte) -59);
                            this.field5494.method2135((byte) 122, 0.0F);
                            this.field5494.method2135((byte) 122, 1.0F);
                            this.field5494.method2135((byte) 122, (float) var42 * var15 + var39);
                            this.field5494.method2135((byte) 122, (float) var42 * var16 + var40);
                            this.field5494.method2135((byte) 122, (float) var42 * var17 + var41);
                            this.field5494.method831(var35, (byte) -88);
                            this.field5494.method831(var36, (byte) -69);
                            this.field5494.method831(var37, (byte) -123);
                            this.field5494.method831(var38, (byte) 110);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field5503[var43] > 64 ? 64 : this.field5503[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class401 var46 = this.field5499[var43][var45];
                        int var47 = var46.field5634;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field5638 >> class80.field1031);
                        float var53 = (float) (var46.field5627 >> class80.field1031);
                        float var54 = (float) (var46.field5632 >> class80.field1031);
                        int var55 = var46.field5636 >> class80.field1031;
                        this.field5494.method2134(-60, 0.0F);
                        this.field5494.method2134(-78, 0.0F);
                        this.field5494.method2134(-97, (float) (-var55) * var9 + var52);
                        this.field5494.method2134(-64, (float) (-var55) * var10 + var53);
                        this.field5494.method2134(-75, (float) (-var55) * var11 + var54);
                        this.field5494.method831(var48, (byte) 126);
                        this.field5494.method831(var49, (byte) -108);
                        this.field5494.method831(var50, (byte) -35);
                        this.field5494.method831(var51, (byte) -83);
                        this.field5494.method2134(-114, 1.0F);
                        this.field5494.method2134(-88, 0.0F);
                        this.field5494.method2134(-103, (float) var55 * var12 + var52);
                        this.field5494.method2134(-85, (float) var55 * var13 + var53);
                        this.field5494.method2134(-74, (float) var55 * var14 + var54);
                        this.field5494.method831(var48, (byte) 116);
                        this.field5494.method831(var49, (byte) -106);
                        this.field5494.method831(var50, (byte) -76);
                        this.field5494.method831(var51, (byte) 114);
                        this.field5494.method2134(-100, 1.0F);
                        this.field5494.method2134(-82, 1.0F);
                        this.field5494.method2134(-69, (float) var55 * var9 + var52);
                        this.field5494.method2134(-125, (float) var55 * var10 + var53);
                        this.field5494.method2134(-101, (float) var55 * var11 + var54);
                        this.field5494.method831(var48, (byte) -32);
                        this.field5494.method831(var49, (byte) -105);
                        this.field5494.method831(var50, (byte) 126);
                        this.field5494.method831(var51, (byte) -21);
                        this.field5494.method2134(-96, 0.0F);
                        this.field5494.method2134(-75, 1.0F);
                        this.field5494.method2134(-110, (float) var55 * var15 + var52);
                        this.field5494.method2134(-59, (float) var55 * var16 + var53);
                        this.field5494.method2134(-125, (float) var55 * var17 + var54);
                        this.field5494.method831(var48, (byte) 120);
                        this.field5494.method831(var49, (byte) 118);
                        this.field5494.method831(var50, (byte) -104);
                        this.field5494.method831(var51, (byte) 123);
                    }
                    if (this.field5503[var43] > 64) {
                        int var56 = this.field5503[var43] - 64 - 1;
                        for (int var57 = this.field5502[var56] - 1; var57 >= 0; var57--) {
                            class401 var58 = this.field5500[var56][var57];
                            int var59 = var58.field5634;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field5638 >> class80.field1031);
                            float var65 = (float) (var58.field5627 >> class80.field1031);
                            float var66 = (float) (var58.field5632 >> class80.field1031);
                            int var67 = var58.field5636 >> class80.field1031;
                            this.field5494.method2134(-107, 0.0F);
                            this.field5494.method2134(-63, 0.0F);
                            this.field5494.method2134(-91, (float) (-var67) * var9 + var64);
                            this.field5494.method2134(-121, (float) (-var67) * var10 + var65);
                            this.field5494.method2134(-69, (float) (-var67) * var11 + var66);
                            this.field5494.method831(var60, (byte) 118);
                            this.field5494.method831(var61, (byte) 118);
                            this.field5494.method831(var62, (byte) 110);
                            this.field5494.method831(var63, (byte) 115);
                            this.field5494.method2134(-110, 1.0F);
                            this.field5494.method2134(-57, 0.0F);
                            this.field5494.method2134(-71, (float) var67 * var12 + var64);
                            this.field5494.method2134(-75, (float) var67 * var13 + var65);
                            this.field5494.method2134(-93, (float) var67 * var14 + var66);
                            this.field5494.method831(var60, (byte) -24);
                            this.field5494.method831(var61, (byte) 125);
                            this.field5494.method831(var62, (byte) 116);
                            this.field5494.method831(var63, (byte) -68);
                            this.field5494.method2134(-108, 1.0F);
                            this.field5494.method2134(-68, 1.0F);
                            this.field5494.method2134(-100, (float) var67 * var9 + var64);
                            this.field5494.method2134(-76, (float) var67 * var10 + var65);
                            this.field5494.method2134(-121, (float) var67 * var11 + var66);
                            this.field5494.method831(var60, (byte) -125);
                            this.field5494.method831(var61, (byte) -61);
                            this.field5494.method831(var62, (byte) -22);
                            this.field5494.method831(var63, (byte) 112);
                            this.field5494.method2134(-62, 0.0F);
                            this.field5494.method2134(-75, 1.0F);
                            this.field5494.method2134(-113, (float) var67 * var15 + var64);
                            this.field5494.method2134(-58, (float) var67 * var16 + var65);
                            this.field5494.method2134(-126, (float) var67 * var17 + var66);
                            this.field5494.method831(var60, (byte) -43);
                            this.field5494.method831(var61, (byte) -31);
                            this.field5494.method831(var62, (byte) -72);
                            this.field5494.method831(var63, (byte) 118);
                        }
                    }
                }
            }
        }
        if (this.field5494.field1880 != 0) {
            this.field5498.method35(24, this.field5494.field1851, this.field5494.field1880);
            arg0.method961(this.field5501, (class273) null, this.field5496, this.field5505);
            arg0.method1020(7, 0, this.field5494.field1880 / 24);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lig;)V", line = 347)
    private final void method2465(class132 arg0) {
        arg0.method969(true);
        this.field5495.glEnable(16384);
        this.field5495.glEnable(16385);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lig;Lrm;)V", line = 353)
    public final void method2466(class132 arg0, class235 arg1) {
        this.field5495 = arg0.field1918;
        if (arg0.field2020 == null) {
            return;
        }
        this.method2467(arg0);
        float var3 = arg0.field2020.field3801;
        float var4 = arg0.field2020.field3803;
        float var5 = arg0.field2020.field3812;
        float var6 = arg0.field2020.field3806;
        try {
            if (arg1.field3461) {
                int var23 = arg1.field3460 - arg1.field3465;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class299 var24 = arg1.field3458.field91;
                class299 var25 = var24.field4339;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field5504 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field5503[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field5502[var29] = 0;
                    }
                    while (var24 != var25) {
                        class401 var30 = (class401) var25;
                        if (var27) {
                            var26 = var30.field5630;
                            var27 = false;
                        } else if (var30.field5630 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field5632 >> class80.field1031) * var5 + (float) (var30.field5638 >> class80.field1031) * var3 + (float) (var30.field5627 >> class80.field1031) * var4 + var6) - arg1.field3465;
                        if (var31 <= 1600) {
                            if (this.field5503[var31] < 64) {
                                this.field5499[var31][this.field5503[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field5503[var31] == 64) {
                                        if (this.field5504 == 64) {
                                            break label188;
                                        }
                                        this.field5503[var31] += this.field5504++ + 1;
                                    }
                                    this.field5500[this.field5503[var31] - 64 - 1][this.field5502[this.field5503[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field4339;
                    }
                    arg0.method888(var26 >= 0 ? arg0.field1921.method628(-26292, var26) : null);
                    this.method2464(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class299 var10 = arg1.field3458.field91;
                for (class299 var11 = var10.field4339; var11 != var10; var11 = var11.field4339) {
                    class401 var12 = (class401) var11;
                    int var13 = (int) ((float) (var12.field5632 >> class80.field1031) * var5 + (float) (var12.field5638 >> class80.field1031) * var3 + (float) (var12.field5627 >> class80.field1031) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field5497[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class299 var15 = var10.field4339;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field5504 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field5503[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field5502[var20] = 0;
                    }
                    while (var10 != var15) {
                        class401 var21 = (class401) var15;
                        if (var18) {
                            var17 = var21.field5630;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field5630 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field5497[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field5503[var22] < 64) {
                                this.field5499[var22][this.field5503[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field5503[var22] == 64) {
                                        if (this.field5504 == 64) {
                                            break label186;
                                        }
                                        this.field5503[var22] += this.field5504++ + 1;
                                    }
                                    this.field5500[this.field5503[var22] - 64 - 1][this.field5502[this.field5503[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field4339;
                    }
                    arg0.method888(var17 >= 0 ? arg0.field1921.method628(-26292, var17) : null);
                    this.method2464(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2465(arg0);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Lig;)V", line = 586)
    private final void method2467(class132 arg0) {
        arg0.method919();
        this.field5495.glDisable(16384);
        this.field5495.glDisable(16385);
        arg0.method969(false);
        arg0.method977(-2);
        this.field5495.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(Lig;)V", line = 594)
    public final void method2468(class132 arg0) {
        this.field5498 = arg0.method915(24, (byte[]) null, 196584, true);
        this.field5505 = new class273(arg0, this.field5498, 5126, 2, 0);
        this.field5501 = new class273(arg0, this.field5498, 5126, 3, 8);
        this.field5496 = new class273(arg0, this.field5498, 5121, 4, 20);
    }
}
