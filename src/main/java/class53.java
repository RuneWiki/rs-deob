import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class53 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "[F")
    private float[] field617 = new float[16];

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lpq;")
    private class104 field618 = new class104(786336);

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
    private int[] field620 = new int[1600];

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "[I")
    private int[] field619 = new int[8191];

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "[I")
    private int[] field623 = new int[64];

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "[[Ltf;")
    private class161[][] field622 = new class161[1600][64];

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "[[Ltf;")
    private class161[][] field626 = new class161[64][768];

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    private int field628 = 0;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lhf;")
    private class224 field624;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Lhf;")
    private class224 field625;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Lhf;")
    private class224 field627;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Lum;")
    private class307 field621;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Ljaggl/opengl;")
    private opengl field616;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lao;Lgm;)V")
    public final void method304(class157 arg0, class63 arg1) {
        this.field616 = arg0.field1927;
        if (arg0.field1977 == null) {
            return;
        }
        this.method308(arg0);
        float var3 = arg0.field1977.field4950;
        float var4 = arg0.field1977.field4954;
        float var5 = arg0.field1977.field4955;
        float var6 = arg0.field1977.field4951;
        try {
            if (arg1.field728) {
                int var23 = arg1.field727 - arg1.field726;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class263 var24 = arg1.field725.field922;
                class263 var25 = var24.field3745;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field628 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field620[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field623[var29] = 0;
                    }
                    while (var24 != var25) {
                        class161 var30 = (class161) var25;
                        if (var27) {
                            var26 = var30.field2128;
                            var27 = false;
                        } else if (var30.field2128 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field2136 >> class300.field4214) * var5 + (float) (var30.field2135 >> class300.field4214) * var4 + (float) (var30.field2124 >> class300.field4214) * var3 + var6) - arg1.field726;
                        if (var31 <= 1600) {
                            if (this.field620[var31] < 64) {
                                this.field622[var31][this.field620[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field620[var31] == 64) {
                                        if (this.field628 == 64) {
                                            break label188;
                                        }
                                        this.field620[var31] += this.field628++ + 1;
                                    }
                                    this.field626[this.field620[var31] - 64 - 1][this.field623[this.field620[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field3745;
                    }
                    arg0.method1003(var26 >= 0 ? arg0.field1921.method2330(var26, 3553) : null);
                    this.method305(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class263 var10 = arg1.field725.field922;
                for (class263 var11 = var10.field3745; var11 != var10; var11 = var11.field3745) {
                    class161 var12 = (class161) var11;
                    int var13 = (int) ((float) (var12.field2136 >> class300.field4214) * var5 + (float) (var12.field2135 >> class300.field4214) * var4 + (float) (var12.field2124 >> class300.field4214) * var3 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field619[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class263 var15 = var10.field3745;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field628 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field620[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field623[var20] = 0;
                    }
                    while (var10 != var15) {
                        class161 var21 = (class161) var15;
                        if (var18) {
                            var17 = var21.field2128;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field2128 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field619[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field620[var22] < 64) {
                                this.field622[var22][this.field620[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field620[var22] == 64) {
                                        if (this.field628 == 64) {
                                            break label186;
                                        }
                                        this.field620[var22] += this.field628++ + 1;
                                    }
                                    this.field626[this.field620[var22] - 64 - 1][this.field623[this.field620[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field3745;
                    }
                    arg0.method1003(var17 >= 0 ? arg0.field1921.method2330(var17, 3553) : null);
                    this.method305(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method306(arg0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lao;I)V")
    private final void method305(class157 arg0, int arg1) {
        this.field616.glGetFloatv(2982, this.field617, 0);
        float var3 = this.field617[0];
        float var4 = this.field617[4];
        float var5 = this.field617[8];
        float var6 = this.field617[1];
        float var7 = this.field617[5];
        float var8 = this.field617[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field618.field3320 = 0;
        if (arg0.field1976) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field620[var18] > 64 ? 64 : this.field620[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class161 var21 = this.field622[var18][var20];
                        int var22 = var21.field2125;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field2124 >> class300.field4214);
                        float var28 = (float) (var21.field2135 >> class300.field4214);
                        float var29 = (float) (var21.field2136 >> class300.field4214);
                        int var30 = var21.field2132 >> class300.field4214;
                        this.field618.method576(239332760, 0.0F);
                        this.field618.method576(239332760, 0.0F);
                        this.field618.method576(239332760, (float) (-var30) * var9 + var27);
                        this.field618.method576(239332760, (float) (-var30) * var10 + var28);
                        this.field618.method576(239332760, (float) (-var30) * var11 + var29);
                        this.field618.method1583(var23, (byte) -66);
                        this.field618.method1583(var24, (byte) -84);
                        this.field618.method1583(var25, (byte) -118);
                        this.field618.method1583(var26, (byte) -49);
                        this.field618.method576(239332760, 1.0F);
                        this.field618.method576(239332760, 0.0F);
                        this.field618.method576(239332760, (float) var30 * var12 + var27);
                        this.field618.method576(239332760, (float) var30 * var13 + var28);
                        this.field618.method576(239332760, (float) var30 * var14 + var29);
                        this.field618.method1583(var23, (byte) -115);
                        this.field618.method1583(var24, (byte) -125);
                        this.field618.method1583(var25, (byte) -85);
                        this.field618.method1583(var26, (byte) -105);
                        this.field618.method576(239332760, 1.0F);
                        this.field618.method576(239332760, 1.0F);
                        this.field618.method576(239332760, (float) var30 * var9 + var27);
                        this.field618.method576(239332760, (float) var30 * var10 + var28);
                        this.field618.method576(239332760, (float) var30 * var11 + var29);
                        this.field618.method1583(var23, (byte) -98);
                        this.field618.method1583(var24, (byte) -59);
                        this.field618.method1583(var25, (byte) -94);
                        this.field618.method1583(var26, (byte) -96);
                        this.field618.method576(239332760, 0.0F);
                        this.field618.method576(239332760, 1.0F);
                        this.field618.method576(239332760, (float) var30 * var15 + var27);
                        this.field618.method576(239332760, (float) var30 * var16 + var28);
                        this.field618.method576(239332760, (float) var30 * var17 + var29);
                        this.field618.method1583(var23, (byte) -88);
                        this.field618.method1583(var24, (byte) -65);
                        this.field618.method1583(var25, (byte) -49);
                        this.field618.method1583(var26, (byte) -80);
                    }
                    if (this.field620[var18] > 64) {
                        int var31 = this.field620[var18] - 64 - 1;
                        for (int var32 = this.field623[var31] - 1; var32 >= 0; var32--) {
                            class161 var33 = this.field626[var31][var32];
                            int var34 = var33.field2125;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field2124 >> class300.field4214);
                            float var40 = (float) (var33.field2135 >> class300.field4214);
                            float var41 = (float) (var33.field2136 >> class300.field4214);
                            int var42 = var33.field2132 >> class300.field4214;
                            this.field618.method576(239332760, 0.0F);
                            this.field618.method576(239332760, 0.0F);
                            this.field618.method576(239332760, (float) (-var42) * var9 + var39);
                            this.field618.method576(239332760, (float) (-var42) * var10 + var40);
                            this.field618.method576(239332760, (float) (-var42) * var11 + var41);
                            this.field618.method1583(var35, (byte) -127);
                            this.field618.method1583(var36, (byte) -105);
                            this.field618.method1583(var37, (byte) -81);
                            this.field618.method1583(var38, (byte) -52);
                            this.field618.method576(239332760, 1.0F);
                            this.field618.method576(239332760, 0.0F);
                            this.field618.method576(239332760, (float) var42 * var12 + var39);
                            this.field618.method576(239332760, (float) var42 * var13 + var40);
                            this.field618.method576(239332760, (float) var42 * var14 + var41);
                            this.field618.method1583(var35, (byte) -59);
                            this.field618.method1583(var36, (byte) -88);
                            this.field618.method1583(var37, (byte) -128);
                            this.field618.method1583(var38, (byte) -91);
                            this.field618.method576(239332760, 1.0F);
                            this.field618.method576(239332760, 1.0F);
                            this.field618.method576(239332760, (float) var42 * var9 + var39);
                            this.field618.method576(239332760, (float) var42 * var10 + var40);
                            this.field618.method576(239332760, (float) var42 * var11 + var41);
                            this.field618.method1583(var35, (byte) -91);
                            this.field618.method1583(var36, (byte) -60);
                            this.field618.method1583(var37, (byte) -126);
                            this.field618.method1583(var38, (byte) -54);
                            this.field618.method576(239332760, 0.0F);
                            this.field618.method576(239332760, 1.0F);
                            this.field618.method576(239332760, (float) var42 * var15 + var39);
                            this.field618.method576(239332760, (float) var42 * var16 + var40);
                            this.field618.method576(239332760, (float) var42 * var17 + var41);
                            this.field618.method1583(var35, (byte) -120);
                            this.field618.method1583(var36, (byte) -88);
                            this.field618.method1583(var37, (byte) -50);
                            this.field618.method1583(var38, (byte) -99);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field620[var43] > 64 ? 64 : this.field620[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class161 var46 = this.field622[var43][var45];
                        int var47 = var46.field2125;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field2124 >> class300.field4214);
                        float var53 = (float) (var46.field2135 >> class300.field4214);
                        float var54 = (float) (var46.field2136 >> class300.field4214);
                        int var55 = var46.field2132 >> class300.field4214;
                        this.field618.method575(false, 0.0F);
                        this.field618.method575(false, 0.0F);
                        this.field618.method575(false, (float) (-var55) * var9 + var52);
                        this.field618.method575(false, (float) (-var55) * var10 + var53);
                        this.field618.method575(false, (float) (-var55) * var11 + var54);
                        this.field618.method1583(var48, (byte) -96);
                        this.field618.method1583(var49, (byte) -97);
                        this.field618.method1583(var50, (byte) -100);
                        this.field618.method1583(var51, (byte) -54);
                        this.field618.method575(false, 1.0F);
                        this.field618.method575(false, 0.0F);
                        this.field618.method575(false, (float) var55 * var12 + var52);
                        this.field618.method575(false, (float) var55 * var13 + var53);
                        this.field618.method575(false, (float) var55 * var14 + var54);
                        this.field618.method1583(var48, (byte) -110);
                        this.field618.method1583(var49, (byte) -80);
                        this.field618.method1583(var50, (byte) -104);
                        this.field618.method1583(var51, (byte) -124);
                        this.field618.method575(false, 1.0F);
                        this.field618.method575(false, 1.0F);
                        this.field618.method575(false, (float) var55 * var9 + var52);
                        this.field618.method575(false, (float) var55 * var10 + var53);
                        this.field618.method575(false, (float) var55 * var11 + var54);
                        this.field618.method1583(var48, (byte) -116);
                        this.field618.method1583(var49, (byte) -111);
                        this.field618.method1583(var50, (byte) -51);
                        this.field618.method1583(var51, (byte) -50);
                        this.field618.method575(false, 0.0F);
                        this.field618.method575(false, 1.0F);
                        this.field618.method575(false, (float) var55 * var15 + var52);
                        this.field618.method575(false, (float) var55 * var16 + var53);
                        this.field618.method575(false, (float) var55 * var17 + var54);
                        this.field618.method1583(var48, (byte) -62);
                        this.field618.method1583(var49, (byte) -100);
                        this.field618.method1583(var50, (byte) -100);
                        this.field618.method1583(var51, (byte) -92);
                    }
                    if (this.field620[var43] > 64) {
                        int var56 = this.field620[var43] - 64 - 1;
                        for (int var57 = this.field623[var56] - 1; var57 >= 0; var57--) {
                            class161 var58 = this.field626[var56][var57];
                            int var59 = var58.field2125;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field2124 >> class300.field4214);
                            float var65 = (float) (var58.field2135 >> class300.field4214);
                            float var66 = (float) (var58.field2136 >> class300.field4214);
                            int var67 = var58.field2132 >> class300.field4214;
                            this.field618.method575(false, 0.0F);
                            this.field618.method575(false, 0.0F);
                            this.field618.method575(false, (float) (-var67) * var9 + var64);
                            this.field618.method575(false, (float) (-var67) * var10 + var65);
                            this.field618.method575(false, (float) (-var67) * var11 + var66);
                            this.field618.method1583(var60, (byte) -118);
                            this.field618.method1583(var61, (byte) -119);
                            this.field618.method1583(var62, (byte) -49);
                            this.field618.method1583(var63, (byte) -86);
                            this.field618.method575(false, 1.0F);
                            this.field618.method575(false, 0.0F);
                            this.field618.method575(false, (float) var67 * var12 + var64);
                            this.field618.method575(false, (float) var67 * var13 + var65);
                            this.field618.method575(false, (float) var67 * var14 + var66);
                            this.field618.method1583(var60, (byte) -112);
                            this.field618.method1583(var61, (byte) -94);
                            this.field618.method1583(var62, (byte) -46);
                            this.field618.method1583(var63, (byte) -86);
                            this.field618.method575(false, 1.0F);
                            this.field618.method575(false, 1.0F);
                            this.field618.method575(false, (float) var67 * var9 + var64);
                            this.field618.method575(false, (float) var67 * var10 + var65);
                            this.field618.method575(false, (float) var67 * var11 + var66);
                            this.field618.method1583(var60, (byte) -87);
                            this.field618.method1583(var61, (byte) -90);
                            this.field618.method1583(var62, (byte) -45);
                            this.field618.method1583(var63, (byte) -46);
                            this.field618.method575(false, 0.0F);
                            this.field618.method575(false, 1.0F);
                            this.field618.method575(false, (float) var67 * var15 + var64);
                            this.field618.method575(false, (float) var67 * var16 + var65);
                            this.field618.method575(false, (float) var67 * var17 + var66);
                            this.field618.method1583(var60, (byte) -103);
                            this.field618.method1583(var61, (byte) -48);
                            this.field618.method1583(var62, (byte) -68);
                            this.field618.method1583(var63, (byte) -116);
                        }
                    }
                }
            }
        }
        if (this.field618.field3320 != 0) {
            this.field621.method1547(24, this.field618.field3364, this.field618.field3320);
            arg0.method985(this.field627, (class224) null, this.field624, this.field625);
            arg0.method986(7, 0, this.field618.field3320 / 24);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lao;)V")
    private final void method306(class157 arg0) {
        arg0.method959(true);
        this.field616.glEnable(16384);
        this.field616.glEnable(16385);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Lao;)V")
    public final void method307(class157 arg0) {
        this.field621 = arg0.method952(24, (byte[]) null, 196584, true);
        this.field625 = new class224(arg0, this.field621, 5126, 2, 0);
        this.field627 = new class224(arg0, this.field621, 5126, 3, 8);
        this.field624 = new class224(arg0, this.field621, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(Lao;)V")
    private final void method308(class157 arg0) {
        arg0.method982();
        this.field616.glDisable(16384);
        this.field616.glDisable(16385);
        arg0.method959(false);
        arg0.method979(-2);
        this.field616.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
