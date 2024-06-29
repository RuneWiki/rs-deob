import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class476 extends class518 {

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "Z")
    private boolean field6435 = false;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "Z")
    private boolean field6429;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "[Lcn;")
    private class322[] field6424;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "Lcb;")
    public static class318 field6426 = new class318(37, 5);

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public static int field6436 = 0;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "I")
    public static int field6439 = -1;

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "[J")
    public static long[] field6441 = new long[32];

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "Lhea;")
    private class393 field6431;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)Z", line = 4)
    public final boolean method1131(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field6433;
            return true;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 16)
    private final void method2664(byte arg0) {
        ++field6427;
        this.field6431 = new class393(super.field7145, 2);
        this.field6431.method2339(4864, 0);
        super.field7145.method3488(1, (byte) 23);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field6429) {
            super.field7145.method3499(8448, 34161, 7681);
            super.field7145.method3525(768, 34168, 0, true);
            super.field7145.method3488(2, (byte) 23);
            super.field7145.method3499(7681, 34161, 260);
            super.field7145.method3525(768, 34168, 0, true);
            super.field7145.method3525(770, 34168, 1, true);
            super.field7145.method3557(8960, 770, 0, 34167);
        } else {
            super.field7145.method3499(7681, 34161, 260);
            super.field7145.method3525(770, 5890, 0, true);
            super.field7145.method3557(8960, 770, 0, 34167);
        }
        super.field7145.method3488(0, (byte) 23);
        this.field6431.method2338(-20555);
        this.field6431.method2339(4864, 1);
        super.field7145.method3488(1, (byte) 23);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field6429) {
            super.field7145.method3499(8448, 34161, 8448);
            super.field7145.method3525(768, 5890, 0, true);
            super.field7145.method3557(8960, 770, 0, 5890);
        } else {
            super.field7145.method3499(8448, 34161, 8448);
            super.field7145.method3525(768, 5890, 0, true);
            super.field7145.method3488(2, (byte) 23);
            super.field7145.method3499(8448, 34161, 8448);
            super.field7145.method3525(768, 5890, 0, true);
            super.field7145.method3525(768, 34168, 1, true);
            super.field7145.method3557(8960, 770, 0, 5890);
        }
        super.field7145.method3488(0, (byte) 23);
        this.field6431.method2338(-20555);
        int var2 = 122 % ((arg0 - 75) / 49);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(FIFIFIII)[F", line = 90)
    public static final float[] method2665(float arg0, int arg1, float arg2, int arg3, float arg4, int arg5, int arg6, int arg7) {
        ++field6440;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
        var8[arg1] = 0.0F;
        var8[4] = 1.0F;
        float var12 = 1.0F - var10;
        var8[7] = 0.0F;
        var8[1] = 0.0F;
        var8[0] = var10;
        var8[2] = var11;
        var8[3] = 0.0F;
        var8[8] = var10;
        var8[6] = -var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg6 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -var15 + 1.0F;
        float var18 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var19 = (float) Math.sqrt((double) (arg7 * arg7 - -(arg3 * arg3)));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var16 = (float) arg7 / var19;
                var14 = (float) (-arg3) / var19;
            }
            var13[5] = var14 * var18;
            var13[1] = var16 * var18;
            var13[6] = var14 * var16 * var17;
            var13[0] = var14 * var14 * var17 + var15;
            var13[8] = var16 * var16 * var17 + var15;
            var13[4] = var15;
            var13[2] = var14 * var16 * var17;
            var13[7] = -var14 * var18;
            var13[3] = -var16 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[4] *= arg0;
        var9[2] *= arg4;
        var9[8] *= arg2;
        var9[6] *= arg2;
        var9[0] *= arg4;
        var9[7] *= arg2;
        var9[3] *= arg0;
        var9[1] *= arg4;
        var9[5] *= arg0;
        return var9;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)V", line = 174)
    public final void method1133(boolean arg0, int arg1) {
        ++field6438;
        if (arg1 <= 79) {
            this.method1133(true, -10);
        }
        super.field7145.method3499(7681, 34161, 8448);
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(BI)V", line = 185)
    public static final void method2666(byte arg0, int arg1) {
        class151.field1899.method3129(arg1, 14583);
        ++field6425;
        if (arg0 == 117) {
            class645.field9137.method3129(arg1, arg0 ^ 14466);
            class506.field6852.method3129(arg1, arg0 ^ 14466);
            class48.field655.method3129(arg1, arg0 ^ 14466);
            class620.field8434.method3129(arg1, 14583);
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lpea;)V", line = 208)
    public class476(class641 arg0) {
        super(arg0);
        if (arg0.field8964) {
            this.field6429 = ~arg0.field8979 > -4;
            int var2 = this.field6429 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 != -4) {
                                if (var14 == 4) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = -var12;
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
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field6424 = new class322[3];
            this.field6424[0] = new class322(super.field7145, 6406, 64, false, var4, 6406);
            this.field6424[1] = new class322(super.field7145, 6406, 64, false, var5, 6406);
            this.field6424[2] = new class322(super.field7145, 6406, 64, false, var3, 6406);
            this.method2664((byte) 127);
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)V", line = 324)
    public static final void method2667(int arg0) {
        ++field6432;
        int var1 = 0;
        for (int var2 = 0; ~var2 > ~class588.field8082; ++var2) {
            for (int var3 = 0; ~var3 > ~class12.field113; ++var3) {
                if (class587.method3281(class145.field1841, var1, var2, (byte) -127, true, var3)) {
                    ++var1;
                }
                if (~var1 <= -513) {
                    return;
                }
            }
        }
        if (arg0 != 23057) {
            field6436 = 108;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLwq;I)V", line = 359)
    public final void method1138(byte arg0, class254 arg1, int arg2) {
        super.field7145.method3553((byte) -96, arg1);
        ++field6434;
        if (arg0 != 75) {
            method2665(-0.6821047F, 123, -1.1948029F, 9, 0.42085725F, -23, 81, -90);
        }
        super.field7145.method3524(arg2, arg0 ^ 69);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZI)V", line = 371)
    public final void method1134(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field6435 = true;
        }
        if (this.field6435) {
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) 96, this.field6424[arg0 + -1]);
            super.field7145.method3488(0, (byte) 23);
        }
        ++field6428;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(Z)V", line = 389)
    public static void method2668(boolean arg0) {
        if (!arg0) {
            field6441 = null;
            field6426 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZB)V", line = 400)
    public final void method1139(boolean arg0, byte arg1) {
        if (arg1 != 127) {
            field6436 = -111;
        }
        if (this.field6431 != null && arg0) {
            if (!this.field6429) {
                super.field7145.method3488(2, (byte) 23);
                super.field7145.method3553((byte) -101, super.field7145.field9034);
                super.field7145.method3488(0, (byte) 23);
            }
            this.field6431.method2336((byte) 32, '\u0000');
            this.field6435 = true;
        } else {
            super.field7145.method3557(8960, 770, 0, 34168);
        }
        ++field6437;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 429)
    public final void method1137(int arg0) {
        if (!this.field6435) {
            super.field7145.method3557(8960, 770, 0, 5890);
        } else {
            if (!this.field6429) {
                super.field7145.method3488(2, (byte) 23);
                super.field7145.method3553((byte) 127, (class254) null);
            }
            super.field7145.method3488(1, (byte) 23);
            super.field7145.method3553((byte) -124, (class254) null);
            super.field7145.method3488(0, (byte) 23);
            this.field6431.method2336((byte) 32, '\u0001');
            this.field6435 = false;
        }
        ++field6430;
        super.field7145.method3499(8448, arg0 + 34155, 8448);
        if (arg0 != 6) {
            this.field6429 = false;
        }
    }
}
