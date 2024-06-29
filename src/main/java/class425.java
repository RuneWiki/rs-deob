import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class425 {

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "[F")
    private float[] field5815 = new float[16];

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Lqd;")
    private class245 field5817 = new class245(786336);

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    private int field5819 = 0;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
    private int[] field5821 = new int[64];

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "[[Lbp;")
    private class56[][] field5822 = new class56[64][768];

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "[I")
    private int[] field5826 = new int[8191];

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[[Lbp;")
    private class56[][] field5827 = new class56[1600][64];

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "[I")
    private int[] field5825 = new int[1600];

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lig;")
    private class205 field5820;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lig;")
    private class205 field5823;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Lig;")
    private class205 field5824;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Lva;")
    private class415 field5818;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Ljaggl/opengl;")
    private opengl field5816;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lh;)V", line = 7)
    public final void method2601(class327 arg0) {
        this.field5818 = arg0.method2106(24, (byte[]) null, 196584, true);
        this.field5824 = new class205(arg0, this.field5818, 5126, 2, 0);
        this.field5820 = new class205(arg0, this.field5818, 5126, 3, 8);
        this.field5823 = new class205(arg0, this.field5818, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lh;Lsk;)V", line = 14)
    public final void method2602(class327 arg0, class291 arg1) {
        this.field5816 = arg0.field4363;
        if (arg0.field4429 == null) {
            return;
        }
        this.method2604(arg0);
        float var3 = arg0.field4429.field1698;
        float var4 = arg0.field4429.field1694;
        float var5 = arg0.field4429.field1692;
        float var6 = arg0.field4429.field1693;
        try {
            if (arg1.field3848) {
                int var23 = arg1.field3850 - arg1.field3851;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class143 var24 = arg1.field3847.field879;
                class143 var25 = var24.field1677;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field5819 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field5825[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field5821[var29] = 0;
                    }
                    while (var24 != var25) {
                        class56 var30 = (class56) var25;
                        if (var27) {
                            var26 = var30.field645;
                            var27 = false;
                        } else if (var30.field645 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field643 >> class419.field5720) * var5 + (float) (var30.field650 >> class419.field5720) * var3 + (float) (var30.field646 >> class419.field5720) * var4 + var6) - arg1.field3851;
                        if (var31 <= 1600) {
                            if (this.field5825[var31] < 64) {
                                this.field5827[var31][this.field5825[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field5825[var31] == 64) {
                                        if (this.field5819 == 64) {
                                            break label188;
                                        }
                                        this.field5825[var31] += this.field5819++ + 1;
                                    }
                                    this.field5822[this.field5825[var31] - 64 - 1][this.field5821[this.field5825[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field1677;
                    }
                    arg0.method2088(var26 >= 0 ? arg0.field4354.method1940(-123, var26) : null);
                    this.method2603(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class143 var10 = arg1.field3847.field879;
                for (class143 var11 = var10.field1677; var11 != var10; var11 = var11.field1677) {
                    class56 var12 = (class56) var11;
                    int var13 = (int) ((float) (var12.field643 >> class419.field5720) * var5 + (float) (var12.field650 >> class419.field5720) * var3 + (float) (var12.field646 >> class419.field5720) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field5826[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class143 var15 = var10.field1677;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field5819 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field5825[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field5821[var20] = 0;
                    }
                    while (var10 != var15) {
                        class56 var21 = (class56) var15;
                        if (var18) {
                            var17 = var21.field645;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field645 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field5826[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field5825[var22] < 64) {
                                this.field5827[var22][this.field5825[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field5825[var22] == 64) {
                                        if (this.field5819 == 64) {
                                            break label186;
                                        }
                                        this.field5825[var22] += this.field5819++ + 1;
                                    }
                                    this.field5822[this.field5825[var22] - 64 - 1][this.field5821[this.field5825[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field1677;
                    }
                    arg0.method2088(var17 >= 0 ? arg0.field4354.method1940(-127, var17) : null);
                    this.method2603(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2605(arg0);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lh;I)V", line = 242)
    private final void method2603(class327 arg0, int arg1) {
        this.field5816.glGetFloatv(2982, this.field5815, 0);
        float var3 = this.field5815[0];
        float var4 = this.field5815[4];
        float var5 = this.field5815[8];
        float var6 = this.field5815[1];
        float var7 = this.field5815[5];
        float var8 = this.field5815[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5817.field3211 = 0;
        if (arg0.field4448) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field5825[var18] > 64 ? 64 : this.field5825[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class56 var21 = this.field5827[var18][var20];
                        int var22 = var21.field641;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field650 >> class419.field5720);
                        float var28 = (float) (var21.field646 >> class419.field5720);
                        float var29 = (float) (var21.field643 >> class419.field5720);
                        int var30 = var21.field640 >> class419.field5720;
                        this.field5817.method1607(0.0F, -11107);
                        this.field5817.method1607(0.0F, -11107);
                        this.field5817.method1607((float) (-var30) * var9 + var27, -11107);
                        this.field5817.method1607((float) (-var30) * var10 + var28, -11107);
                        this.field5817.method1607((float) (-var30) * var11 + var29, -11107);
                        this.field5817.method1593(var23, -124);
                        this.field5817.method1593(var24, -95);
                        this.field5817.method1593(var25, -119);
                        this.field5817.method1593(var26, -109);
                        this.field5817.method1607(1.0F, -11107);
                        this.field5817.method1607(0.0F, -11107);
                        this.field5817.method1607((float) var30 * var12 + var27, -11107);
                        this.field5817.method1607((float) var30 * var13 + var28, -11107);
                        this.field5817.method1607((float) var30 * var14 + var29, -11107);
                        this.field5817.method1593(var23, -114);
                        this.field5817.method1593(var24, -121);
                        this.field5817.method1593(var25, -123);
                        this.field5817.method1593(var26, -112);
                        this.field5817.method1607(1.0F, -11107);
                        this.field5817.method1607(1.0F, -11107);
                        this.field5817.method1607((float) var30 * var9 + var27, -11107);
                        this.field5817.method1607((float) var30 * var10 + var28, -11107);
                        this.field5817.method1607((float) var30 * var11 + var29, -11107);
                        this.field5817.method1593(var23, -105);
                        this.field5817.method1593(var24, -114);
                        this.field5817.method1593(var25, -123);
                        this.field5817.method1593(var26, -119);
                        this.field5817.method1607(0.0F, -11107);
                        this.field5817.method1607(1.0F, -11107);
                        this.field5817.method1607((float) var30 * var15 + var27, -11107);
                        this.field5817.method1607((float) var30 * var16 + var28, -11107);
                        this.field5817.method1607((float) var30 * var17 + var29, -11107);
                        this.field5817.method1593(var23, -103);
                        this.field5817.method1593(var24, -91);
                        this.field5817.method1593(var25, -126);
                        this.field5817.method1593(var26, -108);
                    }
                    if (this.field5825[var18] > 64) {
                        int var31 = this.field5825[var18] - 64 - 1;
                        for (int var32 = this.field5821[var31] - 1; var32 >= 0; var32--) {
                            class56 var33 = this.field5822[var31][var32];
                            int var34 = var33.field641;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field650 >> class419.field5720);
                            float var40 = (float) (var33.field646 >> class419.field5720);
                            float var41 = (float) (var33.field643 >> class419.field5720);
                            int var42 = var33.field640 >> class419.field5720;
                            this.field5817.method1607(0.0F, -11107);
                            this.field5817.method1607(0.0F, -11107);
                            this.field5817.method1607((float) (-var42) * var9 + var39, -11107);
                            this.field5817.method1607((float) (-var42) * var10 + var40, -11107);
                            this.field5817.method1607((float) (-var42) * var11 + var41, -11107);
                            this.field5817.method1593(var35, -106);
                            this.field5817.method1593(var36, -124);
                            this.field5817.method1593(var37, -119);
                            this.field5817.method1593(var38, -94);
                            this.field5817.method1607(1.0F, -11107);
                            this.field5817.method1607(0.0F, -11107);
                            this.field5817.method1607((float) var42 * var12 + var39, -11107);
                            this.field5817.method1607((float) var42 * var13 + var40, -11107);
                            this.field5817.method1607((float) var42 * var14 + var41, -11107);
                            this.field5817.method1593(var35, -104);
                            this.field5817.method1593(var36, -123);
                            this.field5817.method1593(var37, -100);
                            this.field5817.method1593(var38, -117);
                            this.field5817.method1607(1.0F, -11107);
                            this.field5817.method1607(1.0F, -11107);
                            this.field5817.method1607((float) var42 * var9 + var39, -11107);
                            this.field5817.method1607((float) var42 * var10 + var40, -11107);
                            this.field5817.method1607((float) var42 * var11 + var41, -11107);
                            this.field5817.method1593(var35, -103);
                            this.field5817.method1593(var36, -109);
                            this.field5817.method1593(var37, -114);
                            this.field5817.method1593(var38, -96);
                            this.field5817.method1607(0.0F, -11107);
                            this.field5817.method1607(1.0F, -11107);
                            this.field5817.method1607((float) var42 * var15 + var39, -11107);
                            this.field5817.method1607((float) var42 * var16 + var40, -11107);
                            this.field5817.method1607((float) var42 * var17 + var41, -11107);
                            this.field5817.method1593(var35, -100);
                            this.field5817.method1593(var36, -94);
                            this.field5817.method1593(var37, -96);
                            this.field5817.method1593(var38, -119);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field5825[var43] > 64 ? 64 : this.field5825[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class56 var46 = this.field5827[var43][var45];
                        int var47 = var46.field641;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field650 >> class419.field5720);
                        float var53 = (float) (var46.field646 >> class419.field5720);
                        float var54 = (float) (var46.field643 >> class419.field5720);
                        int var55 = var46.field640 >> class419.field5720;
                        this.field5817.method1608(0.0F, 922092592);
                        this.field5817.method1608(0.0F, 922092592);
                        this.field5817.method1608((float) (-var55) * var9 + var52, 922092592);
                        this.field5817.method1608((float) (-var55) * var10 + var53, 922092592);
                        this.field5817.method1608((float) (-var55) * var11 + var54, 922092592);
                        this.field5817.method1593(var48, -94);
                        this.field5817.method1593(var49, -100);
                        this.field5817.method1593(var50, -125);
                        this.field5817.method1593(var51, -112);
                        this.field5817.method1608(1.0F, 922092592);
                        this.field5817.method1608(0.0F, 922092592);
                        this.field5817.method1608((float) var55 * var12 + var52, 922092592);
                        this.field5817.method1608((float) var55 * var13 + var53, 922092592);
                        this.field5817.method1608((float) var55 * var14 + var54, 922092592);
                        this.field5817.method1593(var48, -114);
                        this.field5817.method1593(var49, -127);
                        this.field5817.method1593(var50, -121);
                        this.field5817.method1593(var51, -97);
                        this.field5817.method1608(1.0F, 922092592);
                        this.field5817.method1608(1.0F, 922092592);
                        this.field5817.method1608((float) var55 * var9 + var52, 922092592);
                        this.field5817.method1608((float) var55 * var10 + var53, 922092592);
                        this.field5817.method1608((float) var55 * var11 + var54, 922092592);
                        this.field5817.method1593(var48, -97);
                        this.field5817.method1593(var49, -122);
                        this.field5817.method1593(var50, -107);
                        this.field5817.method1593(var51, -121);
                        this.field5817.method1608(0.0F, 922092592);
                        this.field5817.method1608(1.0F, 922092592);
                        this.field5817.method1608((float) var55 * var15 + var52, 922092592);
                        this.field5817.method1608((float) var55 * var16 + var53, 922092592);
                        this.field5817.method1608((float) var55 * var17 + var54, 922092592);
                        this.field5817.method1593(var48, -111);
                        this.field5817.method1593(var49, -111);
                        this.field5817.method1593(var50, -99);
                        this.field5817.method1593(var51, -124);
                    }
                    if (this.field5825[var43] > 64) {
                        int var56 = this.field5825[var43] - 64 - 1;
                        for (int var57 = this.field5821[var56] - 1; var57 >= 0; var57--) {
                            class56 var58 = this.field5822[var56][var57];
                            int var59 = var58.field641;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field650 >> class419.field5720);
                            float var65 = (float) (var58.field646 >> class419.field5720);
                            float var66 = (float) (var58.field643 >> class419.field5720);
                            int var67 = var58.field640 >> class419.field5720;
                            this.field5817.method1608(0.0F, 922092592);
                            this.field5817.method1608(0.0F, 922092592);
                            this.field5817.method1608((float) (-var67) * var9 + var64, 922092592);
                            this.field5817.method1608((float) (-var67) * var10 + var65, 922092592);
                            this.field5817.method1608((float) (-var67) * var11 + var66, 922092592);
                            this.field5817.method1593(var60, -120);
                            this.field5817.method1593(var61, -113);
                            this.field5817.method1593(var62, -126);
                            this.field5817.method1593(var63, -113);
                            this.field5817.method1608(1.0F, 922092592);
                            this.field5817.method1608(0.0F, 922092592);
                            this.field5817.method1608((float) var67 * var12 + var64, 922092592);
                            this.field5817.method1608((float) var67 * var13 + var65, 922092592);
                            this.field5817.method1608((float) var67 * var14 + var66, 922092592);
                            this.field5817.method1593(var60, -94);
                            this.field5817.method1593(var61, -105);
                            this.field5817.method1593(var62, -128);
                            this.field5817.method1593(var63, -101);
                            this.field5817.method1608(1.0F, 922092592);
                            this.field5817.method1608(1.0F, 922092592);
                            this.field5817.method1608((float) var67 * var9 + var64, 922092592);
                            this.field5817.method1608((float) var67 * var10 + var65, 922092592);
                            this.field5817.method1608((float) var67 * var11 + var66, 922092592);
                            this.field5817.method1593(var60, -122);
                            this.field5817.method1593(var61, -122);
                            this.field5817.method1593(var62, -111);
                            this.field5817.method1593(var63, -104);
                            this.field5817.method1608(0.0F, 922092592);
                            this.field5817.method1608(1.0F, 922092592);
                            this.field5817.method1608((float) var67 * var15 + var64, 922092592);
                            this.field5817.method1608((float) var67 * var16 + var65, 922092592);
                            this.field5817.method1608((float) var67 * var17 + var66, 922092592);
                            this.field5817.method1593(var60, -115);
                            this.field5817.method1593(var61, -91);
                            this.field5817.method1593(var62, -119);
                            this.field5817.method1593(var63, -103);
                        }
                    }
                }
            }
        }
        if (this.field5817.field3211 != 0) {
            this.field5818.method46(24, this.field5817.field3188, this.field5817.field3211);
            arg0.method2070(this.field5820, (class205) null, this.field5823, this.field5824);
            arg0.method2111(7, 0, this.field5817.field3211 / 24);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lh;)V", line = 587)
    private final void method2604(class327 arg0) {
        arg0.method2116();
        this.field5816.glDisable(16384);
        this.field5816.glDisable(16385);
        arg0.method2082(false);
        arg0.method2059(-2);
        this.field5816.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(Lh;)V", line = 595)
    private final void method2605(class327 arg0) {
        arg0.method2082(true);
        this.field5816.glEnable(16384);
        this.field5816.glEnable(16385);
    }
}
