import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class298 extends class193 {

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "Z")
    private boolean field3827 = false;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "Z")
    private boolean field3826;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "[Lnn;")
    private class288[] field3841;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "I")
    public static int field3838 = -1;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "Lbu;")
    private class17 field3834;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Ldn;")
    public static class359 field3825;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "[I")
    public static int[] field3837;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
    public static void method1759(byte arg0) {
        field3837 = null;
        int var1 = 71 % ((arg0 - -8) / 50);
        field3825 = null;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
    private final void method1760(byte arg0) {
        this.field3834 = new class17(super.field2498, 2);
        ++field3830;
        this.field3834.method152((byte) 63, 0);
        super.field2498.method2321(1, 25322);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        if (arg0 > -83) {
            this.method1760((byte) 88);
        }
        OpenGL.glMatrixMode(5888);
        if (this.field3826) {
            super.field2498.method2271(-111, 260, 7681);
            super.field2498.method2338(5890, 0, false, 770);
            super.field2498.method2289(770, -14, 0, 34167);
        } else {
            super.field2498.method2271(-121, 7681, 8448);
            super.field2498.method2338(34168, 0, false, 768);
            super.field2498.method2321(2, 25322);
            super.field2498.method2271(71, 260, 7681);
            super.field2498.method2338(34168, 0, false, 768);
            super.field2498.method2338(34168, 1, false, 770);
            super.field2498.method2289(770, -99, 0, 34167);
        }
        super.field2498.method2321(0, 25322);
        this.field3834.method150((byte) 107);
        this.field3834.method152((byte) 63, 1);
        super.field2498.method2321(1, 25322);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field3826) {
            super.field2498.method2271(-35, 8448, 8448);
            super.field2498.method2338(5890, 0, false, 768);
            super.field2498.method2289(770, -96, 0, 5890);
        } else {
            super.field2498.method2271(69, 8448, 8448);
            super.field2498.method2338(5890, 0, false, 768);
            super.field2498.method2321(2, 25322);
            super.field2498.method2271(38, 8448, 8448);
            super.field2498.method2338(5890, 0, false, 768);
            super.field2498.method2338(34168, 1, false, 768);
            super.field2498.method2289(770, -116, 0, 5890);
        }
        super.field2498.method2321(0, 25322);
        this.field3834.method150((byte) 105);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZZ)V")
    public final void method94(boolean arg0, boolean arg1) {
        ++field3828;
        if (!arg0) {
            this.method95(false, true);
        }
        if (this.field3834 != null && arg1) {
            if (!this.field3826) {
                super.field2498.method2321(2, 25322);
                super.field2498.method2322(super.field2498.field5611, 14);
                super.field2498.method2321(0, 25322);
            }
            this.field3834.method149('\u0000', 4864);
            this.field3827 = true;
        } else {
            super.field2498.method2289(770, -2, 0, 34168);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)Z")
    public final boolean method93(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field3829;
            return true;
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(ZZ)V")
    public final void method95(boolean arg0, boolean arg1) {
        ++field3831;
        if (!arg1) {
            this.method99(-85, -42, false);
        }
        super.field2498.method2271(58, 8448, 7681);
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)I")
    public static final int method1761(int arg0) {
        ++field3839;
        if (arg0 != 3) {
            return 93;
        } else {
            if (class233.field2985 == null) {
                if (!class122.field1646 && class2.field24 > 0) {
                    if (class56.field744 && class343.field4392.method834(false, 81) && class2.field24 > 2) {
                        return ((class520) class201.field2616.field268.field5047.field5047).field7509;
                    }
                    return ((class520) class201.field2616.field268.field5047).field7509;
                }
                int var1 = class204.field2664.method1333(7);
                int var2 = class204.field2664.method1337(69);
                int var3 = class325.field4128;
                int var4 = class14.field229;
                int var5 = class117.field1580;
                if (~var1 < ~var3 && var1 < var3 + var5) {
                    int var6 = -1;
                    for (int var7 = 0; ~var7 > ~class2.field24; ++var7) {
                        if (class163.field2075) {
                            int var11 = (class2.field24 - 1 - var7) * 16 + var4 + 33;
                            if (var2 > var11 - 13 && var2 <= var11 + 3) {
                                var6 = var7;
                            }
                        } else {
                            int var12 = (class2.field24 + -1 + -var7) * 16 + var4 + 31;
                            if (var2 > var12 + -13 && var12 + 3 >= var2) {
                                var6 = var7;
                            }
                        }
                    }
                    if (~var6 != 0) {
                        int var8 = 0;
                        class50 var9 = new class50(class201.field2616);
                        for (class520 var10 = (class520) var9.method514(-92); var10 != null; var10 = (class520) var9.method512((byte) -33)) {
                            if (~(var8++) == ~var6) {
                                return var10.field7509;
                            }
                        }
                    }
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    public final void method92(byte arg0) {
        if (arg0 >= -56) {
            field3837 = null;
        }
        ++field3835;
        if (!this.field3827) {
            super.field2498.method2289(770, 87, 0, 5890);
        } else {
            if (!this.field3826) {
                super.field2498.method2321(2, 25322);
                super.field2498.method2322((class119) null, 14);
            }
            super.field2498.method2321(1, 25322);
            super.field2498.method2322((class119) null, 14);
            super.field2498.method2321(0, 25322);
            this.field3834.method149('\u0001', 4864);
            this.field3827 = false;
        }
        super.field2498.method2271(113, 8448, 8448);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILqn;Z)Lli;")
    public static final class297 method1762(int arg0, class47 arg1, boolean arg2) {
        ++field3842;
        byte[] var3 = arg1.method457(arg0, -114);
        if (arg2) {
            method1763(41, -19);
        }
        return var3 == null ? null : new class297(var3);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZ)V")
    public final void method99(int arg0, int arg1, boolean arg2) {
        ++field3836;
        if (arg2) {
            this.field3834 = null;
        }
        if (this.field3827) {
            super.field2498.method2321(1, 25322);
            super.field2498.method2322(this.field3841[arg0 + -1], 14);
            super.field2498.method2321(0, 25322);
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lug;)V")
    public class298(class395 arg0) {
        super(arg0);
        if (arg0.field5622) {
            this.field3826 = arg0.field5575 < 3;
            int var2 = this.field3826 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (var14 == 2) {
                                var15 = var12;
                            } else if (var14 == 3) {
                                var15 = -var12;
                            } else if (var14 == 4) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field3841 = new class288[3];
            this.field3841[0] = new class288(super.field2498, 6406, 64, false, var4, 6406);
            this.field3841[1] = new class288(super.field2498, 6406, 64, false, var5, 6406);
            this.field3841[2] = new class288(super.field2498, 6406, 64, false, var3, 6406);
            this.method1760((byte) -99);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1763(int arg0, int arg1) {
        if (arg1 != 1832341912) {
            method1759((byte) 107);
        }
        ++field3832;
        return (255 & arg0 >> 24) + "." + (arg0 >> 16 & 255) + "." + (arg0 >> 8 & 255) + "." + (arg0 & 255);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lsq;II)V")
    public final void method97(class119 arg0, int arg1, int arg2) {
        ++field3840;
        super.field2498.method2322(arg0, 14);
        if (arg2 == 36) {
            super.field2498.method2305(7681, arg1);
        }
    }
}
