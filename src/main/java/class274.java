import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class274 extends class460 {

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Z")
    private boolean field3470 = false;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Z")
    private boolean field3476;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "[Lgda;")
    private class51[] field3469;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "F")
    public static float field3477;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lqda;")
    private class93 field3472;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)V")
    public final void method17(byte arg0, boolean arg1) {
        if (arg0 <= 100) {
            this.field3470 = true;
        }
        ++field3475;
        super.field5744.method3185(8448, 7681, (byte) -126);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILtj;)V")
    public final void method19(int arg0, int arg1, class185 arg2) {
        int var4 = -98 % ((25 - arg1) / 59);
        ++field3474;
        super.field5744.method3194((byte) 75, arg2);
        super.field5744.method3134(-79, arg0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V")
    public final void method13(boolean arg0, int arg1) {
        if (this.field3472 != null && arg0) {
            if (!this.field3476) {
                super.field5744.method3126(2, -110);
                super.field5744.method3194((byte) 75, super.field5744.field7648);
                super.field5744.method3126(0, arg1 + 32429);
            }
            this.field3472.method688((byte) 75, '\u0000');
            this.field3470 = true;
        } else {
            super.field5744.method3127(0, 770, 34168, 17111);
        }
        if (arg1 != -32460) {
            this.method16(-64);
        }
        ++field3478;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIB)V")
    public final void method18(int arg0, int arg1, byte arg2) {
        if (arg2 > -110) {
            field3477 = 1.9789358F;
        }
        if (this.field3470) {
            super.field5744.method3126(1, -124);
            super.field5744.method3194((byte) 75, this.field3469[arg0 + -1]);
            super.field5744.method3126(0, -41);
        }
        ++field3467;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Z")
    public final boolean method16(int arg0) {
        ++field3471;
        if (arg0 != -24566) {
            this.method19(-52, -55, (class185) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    private final void method1633(boolean arg0) {
        this.field3472 = new class93(super.field5744, 2);
        ++field3468;
        this.field3472.method684(0, (byte) -127);
        super.field5744.method3126(1, -63);
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
        if (!this.field3476) {
            super.field5744.method3185(7681, 8448, (byte) -40);
            super.field5744.method3175(34168, 1, 0, 768);
            super.field5744.method3126(2, -63);
            super.field5744.method3185(260, 7681, (byte) 76);
            super.field5744.method3175(34168, 1, 0, 768);
            super.field5744.method3175(34168, 1, 1, 770);
            super.field5744.method3127(0, 770, 34167, 17111);
        } else {
            super.field5744.method3185(260, 7681, (byte) -97);
            super.field5744.method3175(5890, 1, 0, 770);
            super.field5744.method3127(0, 770, 34167, 17111);
        }
        super.field5744.method3126(0, -79);
        this.field3472.method690(true);
        this.field3472.method684(1, (byte) -126);
        super.field5744.method3126(1, -102);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field3476) {
            super.field5744.method3185(8448, 8448, (byte) 105);
            super.field5744.method3175(5890, 1, 0, 768);
            super.field5744.method3127(0, 770, 5890, 17111);
        } else {
            super.field5744.method3185(8448, 8448, (byte) 60);
            super.field5744.method3175(5890, 1, 0, 768);
            super.field5744.method3126(2, -90);
            super.field5744.method3185(8448, 8448, (byte) 114);
            super.field5744.method3175(5890, 1, 0, 768);
            super.field5744.method3175(34168, 1, 1, 768);
            super.field5744.method3127(0, 770, 5890, 17111);
        }
        super.field5744.method3126(0, -107);
        this.field3472.method690(arg0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public final void method15(int arg0) {
        if (this.field3470) {
            if (!this.field3476) {
                super.field5744.method3126(2, -116);
                super.field5744.method3194((byte) 75, (class185) null);
            }
            super.field5744.method3126(1, -75);
            super.field5744.method3194((byte) 75, (class185) null);
            super.field5744.method3126(0, -109);
            this.field3472.method688((byte) 112, '\u0001');
            this.field3470 = false;
        } else {
            super.field5744.method3127(0, 770, 5890, 17111);
        }
        ++field3473;
        super.field5744.method3185(8448, 8448, (byte) 89);
        if (arg0 != 0) {
            this.field3476 = true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Ljaa;)V")
    public class274(class576 arg0) {
        super(arg0);
        if (arg0.field7628) {
            this.field3476 = arg0.field7717 < 3;
            int var2 = !this.field3476 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 == -4) {
                                var15 = -var12;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = (byte) var16;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var18;
                    }
                    ++var6;
                }
            }
            this.field3469 = new class51[3];
            this.field3469[0] = new class51(super.field5744, 6406, 64, false, var4, 6406);
            this.field3469[1] = new class51(super.field5744, 6406, 64, false, var5, 6406);
            this.field3469[2] = new class51(super.field5744, 6406, 64, false, var3, 6406);
            this.method1633(true);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(CI)Z")
    public static final boolean method1634(char arg0, int arg1) {
        ++field3466;
        if (arg1 != -30677) {
            return true;
        } else {
            return arg0 >= '0' && arg0 <= '9' || ~arg0 <= -66 && ~arg0 >= -91 || arg0 >= 'a' && arg0 <= 'z';
        }
    }
}
