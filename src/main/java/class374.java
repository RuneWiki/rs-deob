import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class374 {

    @OriginalMember(owner = "client!go", name = "c", descriptor = "[F")
    private float[] field5458 = new float[16];

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Lfe;")
    private class340 field5456 = new class340(786336);

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    private int field5459 = 0;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "[[Lfa;")
    private class128[][] field5461 = new class128[1600][64];

    @OriginalMember(owner = "client!go", name = "l", descriptor = "[I")
    private int[] field5467 = new int[1600];

    @OriginalMember(owner = "client!go", name = "j", descriptor = "[I")
    private int[] field5465 = new int[8191];

    @OriginalMember(owner = "client!go", name = "i", descriptor = "[[Lfa;")
    private class128[][] field5464 = new class128[64][768];

    @OriginalMember(owner = "client!go", name = "h", descriptor = "[I")
    private int[] field5463 = new int[64];

    @OriginalMember(owner = "client!go", name = "g", descriptor = "Lti;")
    private class254 field5462;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "Lpe;")
    private class363 field5460;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "Lpe;")
    private class363 field5466;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "Lpe;")
    private class363 field5468;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "Ljaggl/opengl;")
    private opengl field5457;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lpo;)V")
    private final void method2346(class332 arg0) {
        arg0.method2063(true);
        this.field5457.glEnable(16384);
        this.field5457.glEnable(16385);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lpo;I)V")
    private final void method2347(class332 arg0, int arg1) {
        this.field5457.glGetFloatv(2982, this.field5458, 0);
        float var3 = this.field5458[0];
        float var4 = this.field5458[4];
        float var5 = this.field5458[8];
        float var6 = this.field5458[1];
        float var7 = this.field5458[5];
        float var8 = this.field5458[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5456.field2888 = 0;
        if (arg0.field4779) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field5467[var18] > 64 ? 64 : this.field5467[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class128 var21 = this.field5461[var18][var20];
                        int var22 = var21.field1795;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field1789 >> class420.field6036);
                        float var28 = (float) (var21.field1792 >> class420.field6036);
                        float var29 = (float) (var21.field1786 >> class420.field6036);
                        int var30 = var21.field1794 >> class420.field6036;
                        this.field5456.method2186(0.0F, 21090);
                        this.field5456.method2186(0.0F, 21090);
                        this.field5456.method2186((float) (-var30) * var9 + var27, 21090);
                        this.field5456.method2186((float) (-var30) * var10 + var28, 21090);
                        this.field5456.method2186((float) (-var30) * var11 + var29, 21090);
                        this.field5456.method1396(21375, var23);
                        this.field5456.method1396(21375, var24);
                        this.field5456.method1396(21375, var25);
                        this.field5456.method1396(21375, var26);
                        this.field5456.method2186(1.0F, 21090);
                        this.field5456.method2186(0.0F, 21090);
                        this.field5456.method2186((float) var30 * var12 + var27, 21090);
                        this.field5456.method2186((float) var30 * var13 + var28, 21090);
                        this.field5456.method2186((float) var30 * var14 + var29, 21090);
                        this.field5456.method1396(21375, var23);
                        this.field5456.method1396(21375, var24);
                        this.field5456.method1396(21375, var25);
                        this.field5456.method1396(21375, var26);
                        this.field5456.method2186(1.0F, 21090);
                        this.field5456.method2186(1.0F, 21090);
                        this.field5456.method2186((float) var30 * var9 + var27, 21090);
                        this.field5456.method2186((float) var30 * var10 + var28, 21090);
                        this.field5456.method2186((float) var30 * var11 + var29, 21090);
                        this.field5456.method1396(21375, var23);
                        this.field5456.method1396(21375, var24);
                        this.field5456.method1396(21375, var25);
                        this.field5456.method1396(21375, var26);
                        this.field5456.method2186(0.0F, 21090);
                        this.field5456.method2186(1.0F, 21090);
                        this.field5456.method2186((float) var30 * var15 + var27, 21090);
                        this.field5456.method2186((float) var30 * var16 + var28, 21090);
                        this.field5456.method2186((float) var30 * var17 + var29, 21090);
                        this.field5456.method1396(21375, var23);
                        this.field5456.method1396(21375, var24);
                        this.field5456.method1396(21375, var25);
                        this.field5456.method1396(21375, var26);
                    }
                    if (this.field5467[var18] > 64) {
                        int var31 = this.field5467[var18] - 64 - 1;
                        for (int var32 = this.field5463[var31] - 1; var32 >= 0; var32--) {
                            class128 var33 = this.field5464[var31][var32];
                            int var34 = var33.field1795;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field1789 >> class420.field6036);
                            float var40 = (float) (var33.field1792 >> class420.field6036);
                            float var41 = (float) (var33.field1786 >> class420.field6036);
                            int var42 = var33.field1794 >> class420.field6036;
                            this.field5456.method2186(0.0F, 21090);
                            this.field5456.method2186(0.0F, 21090);
                            this.field5456.method2186((float) (-var42) * var9 + var39, 21090);
                            this.field5456.method2186((float) (-var42) * var10 + var40, 21090);
                            this.field5456.method2186((float) (-var42) * var11 + var41, 21090);
                            this.field5456.method1396(21375, var35);
                            this.field5456.method1396(21375, var36);
                            this.field5456.method1396(21375, var37);
                            this.field5456.method1396(21375, var38);
                            this.field5456.method2186(1.0F, 21090);
                            this.field5456.method2186(0.0F, 21090);
                            this.field5456.method2186((float) var42 * var12 + var39, 21090);
                            this.field5456.method2186((float) var42 * var13 + var40, 21090);
                            this.field5456.method2186((float) var42 * var14 + var41, 21090);
                            this.field5456.method1396(21375, var35);
                            this.field5456.method1396(21375, var36);
                            this.field5456.method1396(21375, var37);
                            this.field5456.method1396(21375, var38);
                            this.field5456.method2186(1.0F, 21090);
                            this.field5456.method2186(1.0F, 21090);
                            this.field5456.method2186((float) var42 * var9 + var39, 21090);
                            this.field5456.method2186((float) var42 * var10 + var40, 21090);
                            this.field5456.method2186((float) var42 * var11 + var41, 21090);
                            this.field5456.method1396(21375, var35);
                            this.field5456.method1396(21375, var36);
                            this.field5456.method1396(21375, var37);
                            this.field5456.method1396(21375, var38);
                            this.field5456.method2186(0.0F, 21090);
                            this.field5456.method2186(1.0F, 21090);
                            this.field5456.method2186((float) var42 * var15 + var39, 21090);
                            this.field5456.method2186((float) var42 * var16 + var40, 21090);
                            this.field5456.method2186((float) var42 * var17 + var41, 21090);
                            this.field5456.method1396(21375, var35);
                            this.field5456.method1396(21375, var36);
                            this.field5456.method1396(21375, var37);
                            this.field5456.method1396(21375, var38);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field5467[var43] > 64 ? 64 : this.field5467[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class128 var46 = this.field5461[var43][var45];
                        int var47 = var46.field1795;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field1789 >> class420.field6036);
                        float var53 = (float) (var46.field1792 >> class420.field6036);
                        float var54 = (float) (var46.field1786 >> class420.field6036);
                        int var55 = var46.field1794 >> class420.field6036;
                        this.field5456.method2187(0.0F, -16092);
                        this.field5456.method2187(0.0F, -16092);
                        this.field5456.method2187((float) (-var55) * var9 + var52, -16092);
                        this.field5456.method2187((float) (-var55) * var10 + var53, -16092);
                        this.field5456.method2187((float) (-var55) * var11 + var54, -16092);
                        this.field5456.method1396(21375, var48);
                        this.field5456.method1396(21375, var49);
                        this.field5456.method1396(21375, var50);
                        this.field5456.method1396(21375, var51);
                        this.field5456.method2187(1.0F, -16092);
                        this.field5456.method2187(0.0F, -16092);
                        this.field5456.method2187((float) var55 * var12 + var52, -16092);
                        this.field5456.method2187((float) var55 * var13 + var53, -16092);
                        this.field5456.method2187((float) var55 * var14 + var54, -16092);
                        this.field5456.method1396(21375, var48);
                        this.field5456.method1396(21375, var49);
                        this.field5456.method1396(21375, var50);
                        this.field5456.method1396(21375, var51);
                        this.field5456.method2187(1.0F, -16092);
                        this.field5456.method2187(1.0F, -16092);
                        this.field5456.method2187((float) var55 * var9 + var52, -16092);
                        this.field5456.method2187((float) var55 * var10 + var53, -16092);
                        this.field5456.method2187((float) var55 * var11 + var54, -16092);
                        this.field5456.method1396(21375, var48);
                        this.field5456.method1396(21375, var49);
                        this.field5456.method1396(21375, var50);
                        this.field5456.method1396(21375, var51);
                        this.field5456.method2187(0.0F, -16092);
                        this.field5456.method2187(1.0F, -16092);
                        this.field5456.method2187((float) var55 * var15 + var52, -16092);
                        this.field5456.method2187((float) var55 * var16 + var53, -16092);
                        this.field5456.method2187((float) var55 * var17 + var54, -16092);
                        this.field5456.method1396(21375, var48);
                        this.field5456.method1396(21375, var49);
                        this.field5456.method1396(21375, var50);
                        this.field5456.method1396(21375, var51);
                    }
                    if (this.field5467[var43] > 64) {
                        int var56 = this.field5467[var43] - 64 - 1;
                        for (int var57 = this.field5463[var56] - 1; var57 >= 0; var57--) {
                            class128 var58 = this.field5464[var56][var57];
                            int var59 = var58.field1795;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field1789 >> class420.field6036);
                            float var65 = (float) (var58.field1792 >> class420.field6036);
                            float var66 = (float) (var58.field1786 >> class420.field6036);
                            int var67 = var58.field1794 >> class420.field6036;
                            this.field5456.method2187(0.0F, -16092);
                            this.field5456.method2187(0.0F, -16092);
                            this.field5456.method2187((float) (-var67) * var9 + var64, -16092);
                            this.field5456.method2187((float) (-var67) * var10 + var65, -16092);
                            this.field5456.method2187((float) (-var67) * var11 + var66, -16092);
                            this.field5456.method1396(21375, var60);
                            this.field5456.method1396(21375, var61);
                            this.field5456.method1396(21375, var62);
                            this.field5456.method1396(21375, var63);
                            this.field5456.method2187(1.0F, -16092);
                            this.field5456.method2187(0.0F, -16092);
                            this.field5456.method2187((float) var67 * var12 + var64, -16092);
                            this.field5456.method2187((float) var67 * var13 + var65, -16092);
                            this.field5456.method2187((float) var67 * var14 + var66, -16092);
                            this.field5456.method1396(21375, var60);
                            this.field5456.method1396(21375, var61);
                            this.field5456.method1396(21375, var62);
                            this.field5456.method1396(21375, var63);
                            this.field5456.method2187(1.0F, -16092);
                            this.field5456.method2187(1.0F, -16092);
                            this.field5456.method2187((float) var67 * var9 + var64, -16092);
                            this.field5456.method2187((float) var67 * var10 + var65, -16092);
                            this.field5456.method2187((float) var67 * var11 + var66, -16092);
                            this.field5456.method1396(21375, var60);
                            this.field5456.method1396(21375, var61);
                            this.field5456.method1396(21375, var62);
                            this.field5456.method1396(21375, var63);
                            this.field5456.method2187(0.0F, -16092);
                            this.field5456.method2187(1.0F, -16092);
                            this.field5456.method2187((float) var67 * var15 + var64, -16092);
                            this.field5456.method2187((float) var67 * var16 + var65, -16092);
                            this.field5456.method2187((float) var67 * var17 + var66, -16092);
                            this.field5456.method1396(21375, var60);
                            this.field5456.method1396(21375, var61);
                            this.field5456.method1396(21375, var62);
                            this.field5456.method1396(21375, var63);
                        }
                    }
                }
            }
        }
        if (this.field5456.field2888 == 0) {
            return;
        }
        this.field5462.method444(24, this.field5456.field2867, this.field5456.field2888);
        arg0.method2064(0, this.field5466);
        arg0.method2077(this.field5460);
        arg0.method2111(this.field5468);
        arg0.method2114();
        arg0.method2127(7, 0, this.field5456.field2888 / 24);
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(Lpo;)V")
    private final void method2348(class332 arg0) {
        arg0.method2074();
        this.field5457.glDisable(16384);
        this.field5457.glDisable(16385);
        arg0.method2063(false);
        arg0.method2109(-2);
        this.field5457.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(Lpo;)V")
    public final void method2349(class332 arg0) {
        this.field5462 = arg0.method2106(24, (byte[]) null, 196584, true);
        this.field5466 = new class363(arg0, this.field5462, 5126, 2, 0);
        this.field5460 = new class363(arg0, this.field5462, 5126, 3, 8);
        this.field5468 = new class363(arg0, this.field5462, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lpo;Lbg;)V")
    public final void method2350(class332 arg0, class271 arg1) {
        this.field5457 = arg0.field4752;
        if (arg0.field4773 == null) {
            return;
        }
        this.method2348(arg0);
        float var3 = arg0.field4773.field183;
        float var4 = arg0.field4773.field181;
        float var5 = arg0.field4773.field180;
        float var6 = arg0.field4773.field188;
        try {
            if (arg1.field3847) {
                int var23 = arg1.field3848 - arg1.field3846;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class87 var24 = arg1.field3845.field5888;
                class87 var25 = var24.field975;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field5459 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field5467[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field5463[var29] = 0;
                    }
                    while (var24 != var25) {
                        class128 var30 = (class128) var25;
                        if (var27) {
                            var26 = var30.field1788;
                            var27 = false;
                        } else if (var30.field1788 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field1786 >> class420.field6036) * var5 + (float) (var30.field1792 >> class420.field6036) * var4 + (float) (var30.field1789 >> class420.field6036) * var3 + var6) - arg1.field3846;
                        if (var31 <= 1600) {
                            if (this.field5467[var31] < 64) {
                                this.field5461[var31][this.field5467[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field5467[var31] == 64) {
                                        if (this.field5459 == 64) {
                                            break label188;
                                        }
                                        this.field5467[var31] += this.field5459++ + 1;
                                    }
                                    this.field5464[this.field5467[var31] - 64 - 1][this.field5463[this.field5467[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field975;
                    }
                    arg0.method2085(var26 >= 0 ? arg0.field4750.method1537(var26, 128) : null);
                    this.method2347(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class87 var10 = arg1.field3845.field5888;
                for (class87 var11 = var10.field975; var11 != var10; var11 = var11.field975) {
                    class128 var12 = (class128) var11;
                    int var13 = (int) ((float) (var12.field1786 >> class420.field6036) * var5 + (float) (var12.field1792 >> class420.field6036) * var4 + (float) (var12.field1789 >> class420.field6036) * var3 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field5465[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class87 var15 = var10.field975;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field5459 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field5467[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field5463[var20] = 0;
                    }
                    while (var10 != var15) {
                        class128 var21 = (class128) var15;
                        if (var18) {
                            var17 = var21.field1788;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field1788 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field5465[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field5467[var22] < 64) {
                                this.field5461[var22][this.field5467[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field5467[var22] == 64) {
                                        if (this.field5459 == 64) {
                                            break label186;
                                        }
                                        this.field5467[var22] += this.field5459++ + 1;
                                    }
                                    this.field5464[this.field5467[var22] - 64 - 1][this.field5463[this.field5467[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field975;
                    }
                    arg0.method2085(var17 >= 0 ? arg0.field4750.method1537(var17, 128) : null);
                    this.method2347(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method2346(arg0);
    }
}
