import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class234 extends class298 {

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
    private int field3244 = 4;

    @OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
    private int field3247 = 4;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "[I")
    public static int[] field3245 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ir", name = "O", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!ir", name = "P", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ir", name = "Q", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ir", name = "R", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ir", name = "S", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ir", name = "T", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ir", name = "U", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ir", name = "V", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ir", name = "W", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ir", name = "X", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ir", name = "Y", descriptor = "Ljc;")
    public static class414 field3258;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)[[I")
    public final int[][] method157(int arg0, int arg1) {
        ++field3255;
        if (arg0 != -24032) {
            field3249 = -40;
        }
        int[][] var3 = super.field4454.method1638((byte) 87, arg1);
        if (super.field4454.field3886) {
            int var4 = class158.field1877 / this.field3247;
            int var5 = class388.field5561 / this.field3244;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1878(0, class388.field5561 * var6 / var5, arg0 + 24092);
            } else {
                var7 = this.method1878(0, 0, 76);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class158.field1877; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class158.field1877 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIII)V")
    public static final void method1290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class41.field501 = arg1;
        class404.field5745 = arg0;
        class19.field255 = arg4;
        ++field3246;
        class282.field4110 = arg3;
        class88.field1093 = arg5;
        if (class41.field501 >= 100) {
            int var6 = class19.field255 * 128 - -64;
            int var7 = class88.field1093 * 128 + 64;
            int var8 = class375.method2264(arg2 ^ -523, var7, class100.field1217, var6) + -class404.field5745;
            int var9 = -class58.field734 + var6;
            int var10 = -class427.field6145 + var8;
            int var11 = -class351.field5047 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class120.field1490 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var10, (double) var12));
            class13.field193 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 16383;
            class401.field5718 = 0;
            if (class120.field1490 < 1024) {
                class120.field1490 = 1024;
            }
            if (class120.field1490 > 3072) {
                class120.field1490 = 3072;
            }
        }
        if (arg2 != 1024) {
            method1296(-29);
        }
        class358.field5167 = 2;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILab;)I")
    public static final int method1291(int arg0, int arg1, class256 arg2) {
        if (arg0 >= -109) {
            method1292(70, 117);
        }
        ++field3257;
        if (!client.method1660(arg2).method1764(arg1, (byte) 117) && arg2.field3631 == null) {
            return -1;
        } else {
            return arg2.field3613 != null && ~arg1 > ~arg2.field3613.length ? arg2.field3613[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)Z")
    public static final boolean method1292(int arg0, int arg1) {
        ++field3250;
        if (arg0 != 20998) {
            field3245 = null;
        }
        return ~(-arg1 & arg1) == ~arg1;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
    public static final void method1293(int arg0) {
        ++field3252;
        if (class89.field1121 == null) {
            class89.field1121 = new int[65536];
            double var1 = Math.random() * 0.03D - 0.015D + 0.7D;
            int var3 = 0;
            if (arg0 == 10) {
                for (int var4 = 0; var4 < 512; ++var4) {
                    float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                    float var6 = (float) (7 & var4) / 8.0F + 0.0625F;
                    for (int var7 = 0; ~var7 > -129; ++var7) {
                        float var8 = (float) var7 / 128.0F;
                        float var9 = 0.0F;
                        float var10 = 0.0F;
                        float var11 = 0.0F;
                        float var12 = var5 / 60.0F;
                        int var13 = (int) var12;
                        int var14 = var13 % 6;
                        float var15 = var12 - (float) var13;
                        float var16 = (-var6 + 1.0F) * var8;
                        float var17 = (-(var6 * var15) + 1.0F) * var8;
                        float var18 = (-((-var15 + 1.0F) * var6) + 1.0F) * var8;
                        if (~var14 != -1) {
                            if (~var14 != -2) {
                                if (var14 == 2) {
                                    var10 = var8;
                                    var11 = var18;
                                    var9 = var16;
                                } else if (~var14 == -4) {
                                    var9 = var16;
                                    var11 = var8;
                                    var10 = var17;
                                } else if (var14 == 4) {
                                    var11 = var8;
                                    var10 = var16;
                                    var9 = var18;
                                } else if (~var14 == -6) {
                                    var9 = var8;
                                    var10 = var16;
                                    var11 = var17;
                                }
                            } else {
                                var11 = var16;
                                var10 = var8;
                                var9 = var17;
                            }
                        } else {
                            var11 = var16;
                            var9 = var8;
                            var10 = var18;
                        }
                        float var19 = (float) Math.pow((double) var9, var1);
                        float var20 = (float) Math.pow((double) var10, var1);
                        float var21 = (float) Math.pow((double) var11, var1);
                        int var22 = (int) (var19 * 256.0F);
                        int var23 = (int) (var20 * 256.0F);
                        int var24 = (int) (var21 * 256.0F);
                        int var25 = var24 + -16777216 - (-(var22 << 16) + -(var23 << 8));
                        class89.field1121[var3++] = var25;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field3253;
        if (arg0 > -44) {
            this.field3247 = -90;
        }
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                this.field3244 = arg2.method895((byte) -125);
            }
        } else {
            this.field3247 = arg2.method895((byte) -94);
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)V")
    public static final void method1294(int arg0, int arg1) {
        ++field3256;
        class89 var2 = class146.method695(arg1, arg0, (byte) -38);
        var2.method448(13);
    }

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "(B)V")
    public static final void method1295(byte arg0) {
        ++field3251;
        class210 var1 = class189.field2588;
        synchronized (class189.field2588) {
            if (arg0 != 116) {
                method1296(69);
            }
            class189.field2588.method1169(1076);
        }
        class210 var2 = class460.field6497;
        synchronized (class460.field6497) {
            class460.field6497.method1169(1076);
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V")
    public static void method1296(int arg0) {
        field3245 = null;
        if (arg0 != -4) {
            field3249 = 43;
        }
        field3258 = null;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
    public class234() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field3248;
        if (!arg1) {
            field3249 = -48;
        }
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int var4 = class158.field1877 / this.field3247;
            int var5 = class388.field5561 / this.field3244;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method1882(0, -2594, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1882(0, -2594, class388.field5561 * var7 / var5);
            }
            for (int var8 = 0; ~var8 > ~class158.field1877; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class158.field1877 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }
}
