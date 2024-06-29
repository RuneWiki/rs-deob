import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class513 extends class82 {

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    public int field7242 = 1638;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    public int field7239 = 4;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "Z")
    public boolean field7238 = true;

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "[B")
    private byte[] field7253 = new byte[512];

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "I")
    public int field7250 = 4;

    @OriginalMember(owner = "client!ai", name = "V", descriptor = "I")
    public int field7248 = 0;

    @OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
    public int field7246 = 4;

    @OriginalMember(owner = "client!ai", name = "U", descriptor = "Lrg;")
    public static class548 field7247 = new class548(79, 3);

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "[I")
    public static int[] field7254;

    @OriginalMember(owner = "client!ai", name = "W", descriptor = "[S")
    private short[] field7249;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "[S")
    private short[] field7251;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIII)I", line = 5)
    private final int method2942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7240;
        int var8 = arg0 >> 12;
        int var9 = var8 + 1;
        if (~arg1 >= ~var9) {
            var9 = 0;
        }
        int var10 = arg0 & 4095;
        int var11 = var8 & 255;
        int var12 = var10 + -4096;
        int var13 = var9 & 255;
        int var14 = arg3 - 4096;
        int var15 = 3 & this.field7253[arg6 + var11];
        int var16 = class44.field373[var10];
        int var17;
        if (var15 <= 1) {
            var17 = ~var15 != -1 ? arg3 - var10 : arg3 + var10;
        } else {
            var17 = ~var15 != -3 ? -arg3 + -var10 : -arg3 + var10;
        }
        int var18 = 3 & this.field7253[var13 - -arg6];
        int var19;
        if (~var18 >= -2) {
            var19 = var18 == 0 ? var12 - -arg3 : -var12 + arg3;
        } else {
            var19 = var18 == 2 ? -arg3 + var12 : -var12 - arg3;
        }
        if (arg5 <= 69) {
            return 124;
        } else {
            int var20 = this.field7253[arg4 + var11] & 3;
            int var21 = var17 - -((-var17 + var19) * var16 >> 12);
            int var22;
            if (var20 > 1) {
                var22 = var20 == 2 ? var10 - var14 : -var10 - var14;
            } else {
                var22 = var20 != 0 ? var14 - var10 : var10 + var14;
            }
            int var23 = this.field7253[arg4 + var13] & 3;
            int var24;
            if (~var23 < -2) {
                var24 = var23 != 2 ? -var12 - var14 : var12 - var14;
            } else {
                var24 = var23 != 0 ? -var12 + var14 : var12 + var14;
            }
            int var25 = var22 - -((-var22 + var24) * var16 >> 12);
            return ((var25 - var21) * arg2 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILos;)V", line = 79)
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field7243;
        int var4 = 117 / ((arg1 - -69) / 42);
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field7246 = arg2.method2129(-75);
            } else {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field7250 = this.field7239 = arg2.method2129(-108);
                        return;
                    }
                    if (~arg0 == -5) {
                        this.field7248 = arg2.method2129(-91);
                        return;
                    }
                    if (arg0 == 5) {
                        this.field7250 = arg2.method2129(-62);
                        return;
                    }
                    if (~arg0 == -7) {
                        this.field7239 = arg2.method2129(-97);
                        return;
                    }
                } else {
                    this.field7242 = arg2.method2089(true);
                    if (~this.field7242 > -1) {
                        this.field7249 = new short[this.field7246];
                        for (int var6 = 0; ~var6 > ~this.field7246; ++var6) {
                            this.field7249[var6] = (short) arg2.method2089(true);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field7238 = arg2.method2129(-87) == 1;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 253)
    public class513() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V", line = 177)
    private final void method2943(int arg0) {
        if (~this.field7242 >= -1) {
            if (this.field7249 != null && this.field7249.length == this.field7246) {
                this.field7251 = new short[this.field7246];
                for (int var2 = 0; ~this.field7246 < ~var2; ++var2) {
                    this.field7251[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field7249 = new short[this.field7246];
            this.field7251 = new short[this.field7246];
            for (int var3 = 0; var3 < this.field7246; ++var3) {
                this.field7249[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field7242 / 4096.0F), (double) var3)));
                this.field7251[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field7255;
        if (arg0 != 2) {
            this.method201(93, 54);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)[I", line = 217)
    public final int[] method201(int arg0, int arg1) {
        ++field7245;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (arg1 != 12218) {
            this.field7253 = null;
        }
        if (super.field990.field3641) {
            this.method2947(var3, arg0, 11474);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "(I)V", line = 241)
    public static void method2944(int arg0) {
        field7254 = null;
        field7247 = null;
        if (arg0 != 128) {
            method2945(-50);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V", line = 259)
    public final void method438(int arg0) {
        ++field7256;
        this.field7253 = class553.method3237(this.field7248, (byte) -56);
        this.method2943(2);
        for (int var2 = this.field7246 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field7249[var2];
            if (~var3 < -9 || ~var3 > 7) {
                break;
            }
            --this.field7246;
        }
        if (arg0 != -2) {
            this.field7250 = -93;
        }
    }

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "(I)V", line = 288)
    public static final void method2945(int arg0) {
        ++field7252;
        class16 var1 = (class16) class209.field2545.method1050((byte) 73);
        if (arg0 != -1) {
            method2945(123);
        }
        while (var1 != null) {
            class57 var2 = var1.field122;
            if (var2.field513 < class335.field4358) {
                var1.method3187(true);
                var2.method324(122);
            } else if (~var2.field518 >= ~class335.field4358) {
                if (~var2.field535 < -1) {
                    class415 var3 = (class415) class309.field3938.method2645((long) (var2.field535 + -1), (byte) -90);
                    if (var3 != null) {
                        class459 var4 = var3.field5390;
                        if (var4.field8661 >= 0 && ~(class106.field1289 * 128) < ~var4.field8661 && var4.field8652 >= 0 && ~(class422.field5452 * 128) < ~var4.field8652) {
                            var2.method329(var4.field8652, class426.method2400(arg0, var4.field8652, var4.field8661, var2.field8660) + -var2.field500, 17, var4.field8661, class335.field4358);
                        }
                    }
                }
                if (var2.field535 < 0) {
                    int var5 = -var2.field535 + -1;
                    class545 var6;
                    if (class82.field1003 == var5) {
                        var6 = class103.field1265;
                    } else {
                        var6 = class459.field6329[var5];
                    }
                    if (var6 != null && var6.field8661 >= 0 && var6.field8661 < class106.field1289 * 128 && var6.field8652 >= 0 && var6.field8652 < class422.field5452 * 128) {
                        var2.method329(var6.field8652, class426.method2400(-1, var6.field8652, var6.field8661, var2.field8660) - var2.field500, arg0 + 48, var6.field8661, class335.field4358);
                    }
                }
                var2.method331((byte) -61, class590.field8557);
                class380.method2203(var2, true);
            }
            var1 = (class16) class209.field2545.method1047(-7962);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIBIFFF)[F", line = 366)
    public static final float[] method2946(int arg0, int arg1, int arg2, byte arg3, int arg4, float arg5, float arg6, float arg7) {
        ++field7241;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[6] = -var11;
        var8[5] = 0.0F;
        var8[8] = var10;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        float var12 = -var10 + 1.0F;
        var8[0] = var10;
        var8[4] = 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg4 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var18 = -var15 + 1.0F;
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + arg2 * arg2));
        if (arg3 != -98) {
            method2946(-10, 108, -116, (byte) 106, -86, -0.15247028F, 1.8846916F, -0.22207892F);
        }
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg2 / var19;
                var14 = (float) (-arg1) / var19;
            }
            var13[4] = var15;
            var13[5] = var14 * var17;
            var13[7] = -var14 * var17;
            var13[3] = -var16 * var17;
            var13[8] = var16 * var16 * var18 + var15;
            var13[0] = var14 * var14 * var18 + var15;
            var13[1] = var16 * var17;
            var13[2] = var14 * var16 * var18;
            var13[6] = var14 * var16 * var18;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[6] *= arg5;
        var9[4] *= arg7;
        var9[2] *= arg6;
        var9[1] *= arg6;
        var9[8] *= arg5;
        var9[0] *= arg6;
        var9[7] *= arg5;
        var9[5] *= arg7;
        var9[3] *= arg7;
        return var9;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([III)V", line = 461)
    public final void method2947(int[] arg0, int arg1, int arg2) {
        ++field7244;
        int var4 = class85.field1036[arg1] * this.field7239;
        if (~this.field7246 == -2) {
            int var5 = this.field7251[0] << 12;
            short var6 = this.field7249[0];
            int var7 = var4 * var5 >> 12;
            int var8 = this.field7239 * var5 >> 12;
            int var9 = this.field7250 * var5 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 - -1;
            if (var11 >= var8) {
                var11 = 0;
            }
            int var12 = var7 & 4095;
            int var13 = class44.field373[var12];
            int var14 = this.field7253[255 & var11] & 255;
            int var15 = this.field7253[255 & var10] & 255;
            if (!this.field7238) {
                for (int var16 = 0; var16 < class629.field9033; ++var16) {
                    int var17 = class366.field4817[var16] * this.field7250;
                    int var18 = this.method2942(var5 * var17 >> 12, var9, var13, var12, var14, arg2 ^ 11433, var15);
                    arg0[var16] = var6 * var18 >> 12;
                }
            } else {
                for (int var19 = 0; var19 < class629.field9033; ++var19) {
                    int var20 = class366.field4817[var19] * this.field7250;
                    int var21 = this.method2942(var5 * var20 >> 12, var9, var13, var12, var14, 84, var15);
                    int var22 = var6 * var21 >> 12;
                    arg0[var19] = (var22 >> 1) + 2048;
                }
            }
        } else {
            short var23 = this.field7249[0];
            if (~var23 < -9 || var23 < -8) {
                int var24 = this.field7251[0] << 12;
                int var25 = var4 * var24 >> 12;
                int var26 = this.field7250 * var24 >> 12;
                int var27 = this.field7239 * var24 >> 12;
                int var28 = var25 >> 12;
                int var29 = var28 + 1;
                if (~var27 >= ~var29) {
                    var29 = 0;
                }
                int var30 = var25 & 4095;
                int var31 = this.field7253[var28 & 255] & 255;
                int var32 = 255 & this.field7253[255 & var29];
                int var33 = class44.field373[var30];
                for (int var34 = 0; ~class629.field9033 < ~var34; ++var34) {
                    int var54 = class366.field4817[var34] * this.field7250;
                    int var55 = this.method2942(var24 * var54 >> 12, var26, var33, var30, var32, arg2 ^ 11392, var31);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~var35 > ~this.field7246; ++var35) {
                short var36 = this.field7249[var35];
                if (var36 > 8 || var36 < -8) {
                    int var37 = this.field7251[var35] << 12;
                    int var38 = this.field7239 * var37 >> 12;
                    int var39 = this.field7250 * var37 >> 12;
                    int var40 = var4 * var37 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = var41 + 1;
                    if (~var38 >= ~var42) {
                        var42 = 0;
                    }
                    int var43 = var40 & 4095;
                    int var44 = this.field7253[var41 & 255] & 255;
                    int var45 = this.field7253[255 & var42] & 255;
                    int var46 = class44.field373[var43];
                    if (this.field7238 && ~(this.field7246 + -1) == ~var35) {
                        for (int var47 = 0; ~class629.field9033 < ~var47; ++var47) {
                            int var48 = class366.field4817[var47] * this.field7250;
                            int var49 = this.method2942(var37 * var48 >> 12, var39, var46, var43, var45, 85, var44);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = 2048 - -(var50 >> 1);
                        }
                    } else {
                        for (int var51 = 0; class629.field9033 > var51; ++var51) {
                            int var52 = class366.field4817[var51] * this.field7250;
                            int var53 = this.method2942(var37 * var52 >> 12, var39, var46, var43, var45, 82, var44);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
        if (arg2 != 11474) {
            this.field7249 = null;
        }
    }
}
