import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class262 {

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[F")
    private float[] field3839 = new float[16];

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Lap;")
    private class111 field3838 = new class111(786336);

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[[Lin;")
    private class113[][] field3841 = new class113[1600][64];

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "[I")
    private int[] field3847 = new int[8191];

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "[I")
    private int[] field3845 = new int[64];

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "[I")
    private int[] field3849 = new int[1600];

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "[[Lin;")
    private class113[][] field3848 = new class113[64][768];

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    private int field3843 = 0;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lkr;")
    private class26 field3844;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Lkr;")
    private class26 field3846;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Lkr;")
    private class26 field3850;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Lmp;")
    private class89 field3842;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Ljaggl/opengl;")
    private opengl field3840;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lse;I)V", line = 5)
    private final void method1753(class282 arg0, int arg1) {
        this.field3840.glGetFloatv(2982, this.field3839, 0);
        float var3 = this.field3839[0];
        float var4 = this.field3839[4];
        float var5 = this.field3839[8];
        float var6 = this.field3839[1];
        float var7 = this.field3839[5];
        float var8 = this.field3839[9];
        float var9 = var3 + var6;
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var3 - var6;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var3;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field3838.field5049 = 0;
        if (arg0.field4232) {
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                int var19 = this.field3849[var18] > 64 ? 64 : this.field3849[var18];
                if (var19 > 0) {
                    for (int var20 = var19 - 1; var20 >= 0; var20--) {
                        class113 var21 = this.field3841[var18][var20];
                        int var22 = var21.field1472;
                        byte var23 = (byte) (var22 >> 16);
                        byte var24 = (byte) (var22 >> 8);
                        byte var25 = (byte) var22;
                        byte var26 = (byte) (var22 >>> 24);
                        float var27 = (float) (var21.field1473 >> class439.field6365);
                        float var28 = (float) (var21.field1462 >> class439.field6365);
                        float var29 = (float) (var21.field1471 >> class439.field6365);
                        int var30 = var21.field1463 >> class439.field6365;
                        this.field3838.method826(0.0F, 2107956560);
                        this.field3838.method826(0.0F, 2107956560);
                        this.field3838.method826((float) (-var30) * var9 + var27, 2107956560);
                        this.field3838.method826((float) (-var30) * var10 + var28, 2107956560);
                        this.field3838.method826((float) (-var30) * var11 + var29, 2107956560);
                        this.field3838.method2204(var23, 8);
                        this.field3838.method2204(var24, 8);
                        this.field3838.method2204(var25, 8);
                        this.field3838.method2204(var26, 8);
                        this.field3838.method826(1.0F, 2107956560);
                        this.field3838.method826(0.0F, 2107956560);
                        this.field3838.method826((float) var30 * var12 + var27, 2107956560);
                        this.field3838.method826((float) var30 * var13 + var28, 2107956560);
                        this.field3838.method826((float) var30 * var14 + var29, 2107956560);
                        this.field3838.method2204(var23, 8);
                        this.field3838.method2204(var24, 8);
                        this.field3838.method2204(var25, 8);
                        this.field3838.method2204(var26, 8);
                        this.field3838.method826(1.0F, 2107956560);
                        this.field3838.method826(1.0F, 2107956560);
                        this.field3838.method826((float) var30 * var9 + var27, 2107956560);
                        this.field3838.method826((float) var30 * var10 + var28, 2107956560);
                        this.field3838.method826((float) var30 * var11 + var29, 2107956560);
                        this.field3838.method2204(var23, 8);
                        this.field3838.method2204(var24, 8);
                        this.field3838.method2204(var25, 8);
                        this.field3838.method2204(var26, 8);
                        this.field3838.method826(0.0F, 2107956560);
                        this.field3838.method826(1.0F, 2107956560);
                        this.field3838.method826((float) var30 * var15 + var27, 2107956560);
                        this.field3838.method826((float) var30 * var16 + var28, 2107956560);
                        this.field3838.method826((float) var30 * var17 + var29, 2107956560);
                        this.field3838.method2204(var23, 8);
                        this.field3838.method2204(var24, 8);
                        this.field3838.method2204(var25, 8);
                        this.field3838.method2204(var26, 8);
                    }
                    if (this.field3849[var18] > 64) {
                        int var31 = this.field3849[var18] - 64 - 1;
                        for (int var32 = this.field3845[var31] - 1; var32 >= 0; var32--) {
                            class113 var33 = this.field3848[var31][var32];
                            int var34 = var33.field1472;
                            byte var35 = (byte) (var34 >> 16);
                            byte var36 = (byte) (var34 >> 8);
                            byte var37 = (byte) var34;
                            byte var38 = (byte) (var34 >>> 24);
                            float var39 = (float) (var33.field1473 >> class439.field6365);
                            float var40 = (float) (var33.field1462 >> class439.field6365);
                            float var41 = (float) (var33.field1471 >> class439.field6365);
                            int var42 = var33.field1463 >> class439.field6365;
                            this.field3838.method826(0.0F, 2107956560);
                            this.field3838.method826(0.0F, 2107956560);
                            this.field3838.method826((float) (-var42) * var9 + var39, 2107956560);
                            this.field3838.method826((float) (-var42) * var10 + var40, 2107956560);
                            this.field3838.method826((float) (-var42) * var11 + var41, 2107956560);
                            this.field3838.method2204(var35, 8);
                            this.field3838.method2204(var36, 8);
                            this.field3838.method2204(var37, 8);
                            this.field3838.method2204(var38, 8);
                            this.field3838.method826(1.0F, 2107956560);
                            this.field3838.method826(0.0F, 2107956560);
                            this.field3838.method826((float) var42 * var12 + var39, 2107956560);
                            this.field3838.method826((float) var42 * var13 + var40, 2107956560);
                            this.field3838.method826((float) var42 * var14 + var41, 2107956560);
                            this.field3838.method2204(var35, 8);
                            this.field3838.method2204(var36, 8);
                            this.field3838.method2204(var37, 8);
                            this.field3838.method2204(var38, 8);
                            this.field3838.method826(1.0F, 2107956560);
                            this.field3838.method826(1.0F, 2107956560);
                            this.field3838.method826((float) var42 * var9 + var39, 2107956560);
                            this.field3838.method826((float) var42 * var10 + var40, 2107956560);
                            this.field3838.method826((float) var42 * var11 + var41, 2107956560);
                            this.field3838.method2204(var35, 8);
                            this.field3838.method2204(var36, 8);
                            this.field3838.method2204(var37, 8);
                            this.field3838.method2204(var38, 8);
                            this.field3838.method826(0.0F, 2107956560);
                            this.field3838.method826(1.0F, 2107956560);
                            this.field3838.method826((float) var42 * var15 + var39, 2107956560);
                            this.field3838.method826((float) var42 * var16 + var40, 2107956560);
                            this.field3838.method826((float) var42 * var17 + var41, 2107956560);
                            this.field3838.method2204(var35, 8);
                            this.field3838.method2204(var36, 8);
                            this.field3838.method2204(var37, 8);
                            this.field3838.method2204(var38, 8);
                        }
                    }
                }
            }
        } else {
            for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                int var44 = this.field3849[var43] > 64 ? 64 : this.field3849[var43];
                if (var44 > 0) {
                    for (int var45 = var44 - 1; var45 >= 0; var45--) {
                        class113 var46 = this.field3841[var43][var45];
                        int var47 = var46.field1472;
                        byte var48 = (byte) (var47 >> 16);
                        byte var49 = (byte) (var47 >> 8);
                        byte var50 = (byte) var47;
                        byte var51 = (byte) (var47 >>> 24);
                        float var52 = (float) (var46.field1473 >> class439.field6365);
                        float var53 = (float) (var46.field1462 >> class439.field6365);
                        float var54 = (float) (var46.field1471 >> class439.field6365);
                        int var55 = var46.field1463 >> class439.field6365;
                        this.field3838.method827(1300078504, 0.0F);
                        this.field3838.method827(1300078504, 0.0F);
                        this.field3838.method827(1300078504, (float) (-var55) * var9 + var52);
                        this.field3838.method827(1300078504, (float) (-var55) * var10 + var53);
                        this.field3838.method827(1300078504, (float) (-var55) * var11 + var54);
                        this.field3838.method2204(var48, 8);
                        this.field3838.method2204(var49, 8);
                        this.field3838.method2204(var50, 8);
                        this.field3838.method2204(var51, 8);
                        this.field3838.method827(1300078504, 1.0F);
                        this.field3838.method827(1300078504, 0.0F);
                        this.field3838.method827(1300078504, (float) var55 * var12 + var52);
                        this.field3838.method827(1300078504, (float) var55 * var13 + var53);
                        this.field3838.method827(1300078504, (float) var55 * var14 + var54);
                        this.field3838.method2204(var48, 8);
                        this.field3838.method2204(var49, 8);
                        this.field3838.method2204(var50, 8);
                        this.field3838.method2204(var51, 8);
                        this.field3838.method827(1300078504, 1.0F);
                        this.field3838.method827(1300078504, 1.0F);
                        this.field3838.method827(1300078504, (float) var55 * var9 + var52);
                        this.field3838.method827(1300078504, (float) var55 * var10 + var53);
                        this.field3838.method827(1300078504, (float) var55 * var11 + var54);
                        this.field3838.method2204(var48, 8);
                        this.field3838.method2204(var49, 8);
                        this.field3838.method2204(var50, 8);
                        this.field3838.method2204(var51, 8);
                        this.field3838.method827(1300078504, 0.0F);
                        this.field3838.method827(1300078504, 1.0F);
                        this.field3838.method827(1300078504, (float) var55 * var15 + var52);
                        this.field3838.method827(1300078504, (float) var55 * var16 + var53);
                        this.field3838.method827(1300078504, (float) var55 * var17 + var54);
                        this.field3838.method2204(var48, 8);
                        this.field3838.method2204(var49, 8);
                        this.field3838.method2204(var50, 8);
                        this.field3838.method2204(var51, 8);
                    }
                    if (this.field3849[var43] > 64) {
                        int var56 = this.field3849[var43] - 64 - 1;
                        for (int var57 = this.field3845[var56] - 1; var57 >= 0; var57--) {
                            class113 var58 = this.field3848[var56][var57];
                            int var59 = var58.field1472;
                            byte var60 = (byte) (var59 >> 16);
                            byte var61 = (byte) (var59 >> 8);
                            byte var62 = (byte) var59;
                            byte var63 = (byte) (var59 >>> 24);
                            float var64 = (float) (var58.field1473 >> class439.field6365);
                            float var65 = (float) (var58.field1462 >> class439.field6365);
                            float var66 = (float) (var58.field1471 >> class439.field6365);
                            int var67 = var58.field1463 >> class439.field6365;
                            this.field3838.method827(1300078504, 0.0F);
                            this.field3838.method827(1300078504, 0.0F);
                            this.field3838.method827(1300078504, (float) (-var67) * var9 + var64);
                            this.field3838.method827(1300078504, (float) (-var67) * var10 + var65);
                            this.field3838.method827(1300078504, (float) (-var67) * var11 + var66);
                            this.field3838.method2204(var60, 8);
                            this.field3838.method2204(var61, 8);
                            this.field3838.method2204(var62, 8);
                            this.field3838.method2204(var63, 8);
                            this.field3838.method827(1300078504, 1.0F);
                            this.field3838.method827(1300078504, 0.0F);
                            this.field3838.method827(1300078504, (float) var67 * var12 + var64);
                            this.field3838.method827(1300078504, (float) var67 * var13 + var65);
                            this.field3838.method827(1300078504, (float) var67 * var14 + var66);
                            this.field3838.method2204(var60, 8);
                            this.field3838.method2204(var61, 8);
                            this.field3838.method2204(var62, 8);
                            this.field3838.method2204(var63, 8);
                            this.field3838.method827(1300078504, 1.0F);
                            this.field3838.method827(1300078504, 1.0F);
                            this.field3838.method827(1300078504, (float) var67 * var9 + var64);
                            this.field3838.method827(1300078504, (float) var67 * var10 + var65);
                            this.field3838.method827(1300078504, (float) var67 * var11 + var66);
                            this.field3838.method2204(var60, 8);
                            this.field3838.method2204(var61, 8);
                            this.field3838.method2204(var62, 8);
                            this.field3838.method2204(var63, 8);
                            this.field3838.method827(1300078504, 0.0F);
                            this.field3838.method827(1300078504, 1.0F);
                            this.field3838.method827(1300078504, (float) var67 * var15 + var64);
                            this.field3838.method827(1300078504, (float) var67 * var16 + var65);
                            this.field3838.method827(1300078504, (float) var67 * var17 + var66);
                            this.field3838.method2204(var60, 8);
                            this.field3838.method2204(var61, 8);
                            this.field3838.method2204(var62, 8);
                            this.field3838.method2204(var63, 8);
                        }
                    }
                }
            }
        }
        if (this.field3838.field5049 == 0) {
            return;
        }
        this.field3842.method714(24, this.field3838.field5042, this.field3838.field5049);
        arg0.method1878(0, this.field3844);
        arg0.method1883(this.field3846);
        arg0.method1902(this.field3850);
        arg0.method1930();
        arg0.method1885(7, 0, this.field3838.field5049 / 24);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lse;)V", line = 352)
    public final void method1754(class282 arg0) {
        this.field3842 = arg0.method1934(24, (byte[]) null, 196584, true);
        this.field3844 = new class26(arg0, this.field3842, 5126, 2, 0);
        this.field3846 = new class26(arg0, this.field3842, 5126, 3, 8);
        this.field3850 = new class26(arg0, this.field3842, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lse;Lai;)V", line = 362)
    public final void method1755(class282 arg0, class305 arg1) {
        this.field3840 = arg0.field4140;
        if (arg0.field4173 == null) {
            return;
        }
        this.method1757(arg0);
        float var3 = arg0.field4173.field547;
        float var4 = arg0.field4173.field543;
        float var5 = arg0.field4173.field542;
        float var6 = arg0.field4173.field544;
        try {
            if (arg1.field4564) {
                int var23 = arg1.field4562 - arg1.field4568;
                if (var23 > 1600) {
                    var23 = 1600;
                }
                class128 var24 = arg1.field4561.field4831;
                class128 var25 = var24.field1663;
                int var26 = -2;
                boolean var27 = true;
                while (var24 != var25) {
                    this.field3843 = 0;
                    for (int var28 = 0; var28 < var23; var28++) {
                        this.field3849[var28] = 0;
                    }
                    for (int var29 = 0; var29 < 64; var29++) {
                        this.field3845[var29] = 0;
                    }
                    while (var24 != var25) {
                        class113 var30 = (class113) var25;
                        if (var27) {
                            var26 = var30.field1459;
                            var27 = false;
                        } else if (var30.field1459 != var26) {
                            var27 = true;
                            break;
                        }
                        int var31 = (int) ((float) (var30.field1471 >> class439.field6365) * var5 + (float) (var30.field1473 >> class439.field6365) * var3 + (float) (var30.field1462 >> class439.field6365) * var4 + var6) - arg1.field4568;
                        if (var31 <= 1600) {
                            if (this.field3849[var31] < 64) {
                                this.field3841[var31][this.field3849[var31]++] = var30;
                            } else {
                                label188: {
                                    if (this.field3849[var31] == 64) {
                                        if (this.field3843 == 64) {
                                            break label188;
                                        }
                                        this.field3849[var31] += this.field3843++ + 1;
                                    }
                                    this.field3848[this.field3849[var31] - 64 - 1][this.field3845[this.field3849[var31] - 64 - 1]++] = var30;
                                }
                            }
                        }
                        var25 = var25.field1663;
                    }
                    arg0.method1915(var26 >= 0 ? arg0.field4149.method2172((byte) -115, var26) : null);
                    this.method1753(arg0, var23);
                }
            } else {
                int var7 = 0;
                int var8 = Integer.MAX_VALUE;
                int var9 = 0;
                class128 var10 = arg1.field4561.field4831;
                for (class128 var11 = var10.field1663; var11 != var10; var11 = var11.field1663) {
                    class113 var12 = (class113) var11;
                    int var13 = (int) ((float) (var12.field1471 >> class439.field6365) * var5 + (float) (var12.field1473 >> class439.field6365) * var3 + (float) (var12.field1462 >> class439.field6365) * var4 + var6);
                    if (var13 > var9) {
                        var9 = var13;
                    }
                    if (var13 < var8) {
                        var8 = var13;
                    }
                    this.field3847[var7++] = var13;
                }
                int var14 = var9 - var8;
                if (var14 > 1600) {
                    var14 = 1600;
                }
                class128 var15 = var10.field1663;
                int var16 = 0;
                int var17 = -2;
                boolean var18 = true;
                while (var10 != var15) {
                    this.field3843 = 0;
                    for (int var19 = 0; var19 < var14; var19++) {
                        this.field3849[var19] = 0;
                    }
                    for (int var20 = 0; var20 < 64; var20++) {
                        this.field3845[var20] = 0;
                    }
                    while (var10 != var15) {
                        class113 var21 = (class113) var15;
                        if (var18) {
                            var17 = var21.field1459;
                            var18 = false;
                        }
                        if (var16 > 0 && var21.field1459 != var17) {
                            var18 = true;
                            break;
                        }
                        int var22 = this.field3847[var16++] - var8;
                        if (var22 <= 1600) {
                            if (this.field3849[var22] < 64) {
                                this.field3841[var22][this.field3849[var22]++] = var21;
                            } else {
                                label186: {
                                    if (this.field3849[var22] == 64) {
                                        if (this.field3843 == 64) {
                                            break label186;
                                        }
                                        this.field3849[var22] += this.field3843++ + 1;
                                    }
                                    this.field3848[this.field3849[var22] - 64 - 1][this.field3845[this.field3849[var22] - 64 - 1]++] = var21;
                                }
                            }
                        }
                        var15 = var15.field1663;
                    }
                    arg0.method1915(var17 >= 0 ? arg0.field4149.method2172((byte) -103, var17) : null);
                    this.method1753(arg0, var14);
                }
            }
        } catch (Exception var33) {
        }
        this.method1756(arg0);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Lse;)V", line = 589)
    private final void method1756(class282 arg0) {
        arg0.method1892(true);
        this.field3840.glEnable(16384);
        this.field3840.glEnable(16385);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(Lse;)V", line = 599)
    private final void method1757(class282 arg0) {
        arg0.method1871();
        this.field3840.glDisable(16384);
        this.field3840.glDisable(16385);
        arg0.method1892(false);
        arg0.method1861(-2);
        this.field3840.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
