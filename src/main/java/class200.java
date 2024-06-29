import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class200 extends class431 implements class185 {

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Z")
    private boolean field3166;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "B")
    private byte field3171;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "B")
    private byte field3161;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "S")
    private short field3157;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "B")
    private byte field3165;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "Z")
    private boolean field3169;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Z")
    private boolean field3156;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Lcd;")
    private class198 field3176;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Lh;")
    private class452 field3160;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field3175 = null;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field3162 = -1;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLqq;)V", line = 3)
    public final void method176(boolean arg0, class318 arg1) {
        ++field3173;
        Object var3 = null;
        class452 var5;
        if (this.field3160 == null && this.field3156) {
            class78 var4 = this.method1243(98, arg1, true, 262144);
            var5 = var4 == null ? null : var4.field1381;
        } else {
            var5 = this.field3160;
            this.field3160 = null;
        }
        if (var5 != null) {
            class90.method668(var5, this.field3161, super.field6346, super.field6339, (boolean[]) null);
        }
        if (!arg0) {
            this.field3169 = false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lqq;Lin;IIIIZIIIII)V", line = 31)
    public class200(class318 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class341.method2105(arg11, arg10, 122));
        super.field6346 = arg3;
        this.field3166 = arg1.field895 != 0 && !arg6;
        this.field3171 = (byte) arg10;
        this.field3161 = (byte) arg2;
        super.field6339 = arg5;
        this.field3157 = (short) arg1.field958;
        this.field3165 = (byte) arg11;
        this.field3169 = arg6;
        this.field3156 = arg0.method1934() && arg1.field921 && !this.field3169 && class463.field7116.field2974 != 0;
        class78 var13 = this.method1243(88, arg0, this.field3156, 2048);
        if (var13 != null) {
            this.field3176 = var13.field1385;
            this.field3160 = var13.field1381;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I", line = 56)
    public final int method173(int arg0) {
        ++field3159;
        if (arg0 != 1438) {
            this.field3169 = false;
        }
        return this.field3165;
    }

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "(I)V", line = 69)
    public static final void method1242(int arg0) {
        ++field3168;
        if (class327.field4907 == null) {
            class327.field4907 = new int[65536];
            double var1 = 0.7D + -0.015D + 0.03D * Math.random();
            for (int var3 = 0; var3 < 65536; ++var3) {
                double var4 = (double) ((var3 & 64606) >> 10) / 64.0D + 0.0078125D;
                double var6 = (double) ((var3 & 1018) >> 7) / 8.0D + 0.0625D;
                double var8 = (double) (var3 & 127) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = (var6 + 1.0D) * var8;
                    } else {
                        var16 = var6 + var8 + -(var6 * var8);
                    }
                    double var18 = var8 * 2.0D - var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 + -0.3333333333333333D;
                    if (var20 * 6.0D < 1.0D) {
                        var10 = (var16 - var18) * 6.0D * var20 + var18;
                    } else if (var20 * 2.0D < 1.0D) {
                        var10 = var16;
                    } else if (!(var20 * 3.0D < 2.0D)) {
                        var10 = var18;
                    } else {
                        var10 = (-var18 + var16) * (-var20 + 0.6666666666666666D) * 6.0D + var18;
                    }
                    if (!(var4 * 6.0D < 1.0D)) {
                        if (!(var4 * 2.0D < 1.0D)) {
                            if (var4 * 3.0D < 2.0D) {
                                var12 = (-var18 + var16) * (-var4 + 0.6666666666666666D) * 6.0D + var18;
                            } else {
                                var12 = var18;
                            }
                        } else {
                            var12 = var16;
                        }
                    } else {
                        var12 = (var16 - var18) * 6.0D * var4 + var18;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (!(var24 * 6.0D < 1.0D)) {
                        if (!(var24 * 2.0D < 1.0D)) {
                            if (var24 * 3.0D < 2.0D) {
                                var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                            } else {
                                var14 = var18;
                            }
                        } else {
                            var14 = var16;
                        }
                    } else {
                        var14 = (-var18 + var16) * 6.0D * var24 + var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var33 << 8) + (var32 << 16) + var34;
                class327.field4907[var3] = var35;
            }
            if (arg0 != 127) {
                method1244(false);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lqq;BII)Z", line = 193)
    public final boolean method162(class318 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -44) {
            return true;
        } else {
            ++field3179;
            class198 var5 = this.method1247(arg0, 131072, -100);
            if (var5 != null) {
                class496 var6 = arg0.method1976();
                var6.method198(super.field6346, super.field6336, super.field6339);
                return var5.method495(arg2, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lqq;ZI)Lcd;", line = 214)
    public final class198 method167(class318 arg0, boolean arg1, int arg2) {
        ++field3182;
        return arg1 ? null : this.method1247(arg0, arg2, -36);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILqq;ZI)Ldi;", line = 226)
    private final class78 method1243(int arg0, class318 arg1, boolean arg2, int arg3) {
        ++field3167;
        if (arg0 <= 58) {
            this.method1243(28, (class318) null, false, -116);
        }
        class56 var5 = class128.field2070.method916((byte) -15, this.field3157 & 65535);
        class343 var6;
        class343 var7;
        if (this.field3169) {
            var6 = class262.field3978[this.field3161];
            var7 = class201.field3195[0];
        } else {
            var6 = class201.field3195[this.field3161];
            if (~this.field3161 <= -4) {
                var7 = null;
            } else {
                var7 = class201.field3195[this.field3161 + 1];
            }
        }
        return var5.method391(this.field3165, super.field6339, true, super.field6346, var7, super.field6336, arg3, this.field3171, arg1, var6, arg2);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z", line = 257)
    public final boolean method161(int arg0) {
        if (arg0 != 15275) {
            return true;
        } else {
            ++field3158;
            return this.field3156;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V", line = 269)
    public static void method1244(boolean arg0) {
        field3175 = null;
        if (arg0) {
            field3162 = -64;
        }
    }

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "(I)V", line = 281)
    public static final void method1245(int arg0) {
        ++field3174;
        int var1 = 0;
        if (class463.field7116.field2972) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
        }
        class332.method2063(var1, (byte) -79);
        class128.field2070.method913(var1, (byte) 63);
        class288.field4362.method3031(arg0, var1);
        class433.field6358.method2692(var1, -115);
        class201.field3192.method1251(true, var1);
        class312.method1866(var1, -69);
        class230.method1386(var1, -112);
        class174.method1094((byte) 119, var1);
        class236.method1420(-127, var1);
        if (client.field2992 != 10) {
            if (~client.field2992 == -31) {
                class189.method1196(25, -12254);
                return;
            }
        } else {
            class189.method1196(28, -12254);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIFFIF)[F", line = 319)
    public static final float[] method1246(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, int arg6, float arg7) {
        ++field3155;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        var8[5] = 0.0F;
        var8[0] = var10;
        var8[2] = var11;
        var8[8] = var10;
        var8[arg0] = 0.0F;
        var8[4] = 1.0F;
        var8[6] = -var11;
        var8[1] = 0.0F;
        var8[3] = 0.0F;
        float var12 = -var10 + 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg6 / 32767.0F;
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (-(var15 * var15) + 1.0F)));
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + arg3 * arg3));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg1 / var19;
                var14 = (float) (-arg3) / var19;
            }
            var13[6] = var14 * var16 * var17;
            var13[0] = var14 * var14 * var17 + var15;
            var13[4] = var15;
            var13[1] = var16 * var18;
            var13[3] = -var16 * var18;
            var13[5] = var14 * var18;
            var13[2] = var14 * var16 * var17;
            var13[8] = var16 * var16 * var17 + var15;
            var13[7] = -var14 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[3] *= arg5;
        var9[6] *= arg4;
        var9[7] *= arg4;
        var9[2] *= arg7;
        var9[1] *= arg7;
        var9[8] *= arg4;
        var9[0] *= arg7;
        var9[4] *= arg5;
        var9[5] *= arg5;
        return var9;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 404)
    public final void method163(int arg0) {
        if (this.field3176 != null) {
            this.field3176.method503();
        }
        ++field3163;
        if (arg0 != 8793) {
            this.field3156 = true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZLqq;)V", line = 418)
    public final void method172(boolean arg0, class318 arg1) {
        ++field3172;
        if (arg0) {
            this.method173(-125);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lqq;I)V", line = 429)
    public final void method171(class318 arg0, int arg1) {
        ++field3170;
        Object var3 = null;
        if (arg1 != 1577) {
            this.field3169 = true;
        }
        class452 var5;
        if (this.field3160 == null && this.field3156) {
            class78 var4 = this.method1243(arg1 + -1511, arg0, true, 262144);
            var5 = var4 != null ? var4.field1381 : null;
        } else {
            var5 = this.field3160;
            this.field3160 = null;
        }
        if (var5 != null) {
            class208.method1275(var5, this.field3161, super.field6346, super.field6339, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)I", line = 462)
    public final int method1099(byte arg0) {
        ++field3177;
        int var2 = 28 % ((arg0 - 16) / 41);
        return this.field3176 == null ? 0 : this.field3176.method492();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)I", line = 473)
    public final int method170(boolean arg0) {
        if (!arg0) {
            this.field3171 = 77;
        }
        ++field3178;
        return this.field3171;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLqq;)Lkm;", line = 484)
    public final class227 method169(byte arg0, class318 arg1) {
        ++field3180;
        if (this.field3176 == null) {
            return null;
        } else {
            class496 var3 = arg1.method1976();
            var3.method198(super.field6346 + super.field6344, super.field6336, super.field6342 + super.field6339);
            class227 var4 = null;
            if (arg0 > -11) {
                this.method170(false);
            }
            if (this.field3166) {
                var4 = class145.method951(1, 0);
            }
            this.field3176.method461(var3, var4 == null ? null : var4.field3476[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I", line = 513)
    public final int method174(byte arg0) {
        if (arg0 < 113) {
            this.method173(0);
        }
        ++field3164;
        return this.field3157 & 65535;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lqq;II)Lcd;", line = 525)
    private final class198 method1247(class318 arg0, int arg1, int arg2) {
        if (arg2 >= -30) {
            this.method172(false, (class318) null);
        }
        ++field3181;
        if (this.field3176 != null && arg0.method1944(this.field3176.method489(), arg1) == 0) {
            return this.field3176;
        } else {
            class78 var4 = this.method1243(59, arg0, false, arg1);
            return var4 != null ? var4.field1385 : null;
        }
    }
}
