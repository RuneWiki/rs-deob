import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class253 extends class283 {

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "Z")
    private boolean field3651 = false;

    @OriginalMember(owner = "client!mca", name = "o", descriptor = "Z")
    private boolean field3656;

    @OriginalMember(owner = "client!mca", name = "w", descriptor = "[Ldm;")
    private class96[] field3664;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "[[Z")
    public static boolean[][] field3652 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!mca", name = "p", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!mca", name = "q", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!mca", name = "s", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!mca", name = "u", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!mca", name = "v", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!mca", name = "x", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!mca", name = "t", descriptor = "Lpea;")
    public static class457 field3661;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "Ltw;")
    private class523 field3650;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(IZ)V", line = 8)
    public final void method76(int arg0, boolean arg1) {
        ++field3662;
        if (arg0 != -938) {
            field3661 = null;
        }
        if (this.field3650 != null && arg1) {
            if (!this.field3656) {
                super.field3958.method2171(121, 2);
                super.field3958.method2164(arg0 + 944, super.field3958.field5023);
                super.field3958.method2171(113, 0);
            }
            this.field3650.method3185(114, '\u0000');
            this.field3651 = true;
        } else {
            super.field3958.method2136(8960, 34168, 0, 770);
        }
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)V", line = 34)
    public static void method1696(byte arg0) {
        field3661 = null;
        int var1 = 117 / ((-68 - arg0) / 35);
        field3652 = null;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZI)V", line = 45)
    public final void method73(boolean arg0, int arg1) {
        if (arg1 == 2) {
            super.field3958.method2149(-11771, 7681, 8448);
            ++field3657;
        }
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(B)V", line = 57)
    private final void method1697(byte arg0) {
        this.field3650 = new class523(super.field3958, 2);
        ++field3659;
        this.field3650.method3184(0, 96);
        super.field3958.method2171(122, 1);
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
        if (arg0 >= -40) {
            this.method1697((byte) -32);
        }
        if (this.field3656) {
            super.field3958.method2149(-11771, 7681, 260);
            super.field3958.method2167(5890, 770, 10603, 0);
            super.field3958.method2136(8960, 34167, 0, 770);
        } else {
            super.field3958.method2149(-11771, 8448, 7681);
            super.field3958.method2167(34168, 768, 10603, 0);
            super.field3958.method2171(110, 2);
            super.field3958.method2149(-11771, 7681, 260);
            super.field3958.method2167(34168, 768, 10603, 0);
            super.field3958.method2167(34168, 770, 10603, 1);
            super.field3958.method2136(8960, 34167, 0, 770);
        }
        super.field3958.method2171(114, 0);
        this.field3650.method3181(true);
        this.field3650.method3184(1, 94);
        super.field3958.method2171(123, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field3656) {
            super.field3958.method2149(-11771, 8448, 8448);
            super.field3958.method2167(5890, 768, 10603, 0);
            super.field3958.method2171(109, 2);
            super.field3958.method2149(-11771, 8448, 8448);
            super.field3958.method2167(5890, 768, 10603, 0);
            super.field3958.method2167(34168, 768, 10603, 1);
            super.field3958.method2136(8960, 5890, 0, 770);
        } else {
            super.field3958.method2149(-11771, 8448, 8448);
            super.field3958.method2167(5890, 768, 10603, 0);
            super.field3958.method2136(8960, 5890, 0, 770);
        }
        super.field3958.method2171(120, 0);
        this.field3650.method3181(true);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Ljava/lang/String;", line = 126)
    public static final String method1698(int arg0, int arg1) {
        ++field3660;
        if (arg0 != 1) {
            method1696((byte) 85);
        }
        return (255 & arg1 >> 24) + "." + ((16770095 & arg1) >> 16) + "." + ((65526 & arg1) >> 8) + "." + (arg1 & 255);
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lkw;)V", line = 144)
    public class253(class346 arg0) {
        super(arg0);
        if (arg0.field5030) {
            this.field3656 = arg0.field5055 < 3;
            int var2 = this.field3656 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (~var14 == -2) {
                            var15 = var12;
                        } else if (var14 != 2) {
                            if (var14 != 3) {
                                if (var14 == 4) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = -var13;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
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
            this.field3664 = new class96[3];
            this.field3664[0] = new class96(super.field3958, 6406, 64, false, var4, 6406);
            this.field3664[1] = new class96(super.field3958, 6406, 64, false, var5, 6406);
            this.field3664[2] = new class96(super.field3958, 6406, 64, false, var3, 6406);
            this.method1697((byte) -83);
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZII)V", line = 255)
    public final void method79(boolean arg0, int arg1, int arg2) {
        ++field3665;
        if (this.field3651) {
            super.field3958.method2171(124, 1);
            super.field3958.method2164(6, this.field3664[arg2 + -1]);
            super.field3958.method2171(125, 0);
        }
        if (!arg0) {
            this.field3664 = null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lou;II)V", line = 278)
    public final void method75(class158 arg0, int arg1, int arg2) {
        ++field3658;
        super.field3958.method2164(6, arg0);
        if (arg1 == 2) {
            super.field3958.method2120(arg2, 35);
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z", line = 291)
    public final boolean method77(int arg0) {
        ++field3663;
        if (arg0 < 96) {
            this.method76(-74, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)V", line = 302)
    public static final void method1699(int arg0) {
        class39.field672 = 1;
        class544.field7903 = -1;
        ++field3654;
        if (arg0 == 14611) {
            long var1 = 0L;
            if (client.field6418 != null) {
                class479 var3 = new class479(class517.method3147(class265.method1749(client.field6418, (byte) -125), (byte) -20));
                long var4 = var3.method2907(83);
                class499.field7171 = var3.method2907(114);
                class715.method4014((byte) 7, class71.method622((byte) 29, var4), true, "");
            } else {
                class743.method4134(true, 35);
            }
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V", line = 333)
    public final void method74(byte arg0) {
        if (!this.field3651) {
            super.field3958.method2136(8960, 5890, 0, 770);
        } else {
            if (!this.field3656) {
                super.field3958.method2171(118, 2);
                super.field3958.method2164(6, (class158) null);
            }
            super.field3958.method2171(110, 1);
            super.field3958.method2164(6, (class158) null);
            super.field3958.method2171(arg0 + 37, 0);
            this.field3650.method3185(arg0 ^ 43, '\u0001');
            this.field3651 = false;
        }
        ++field3655;
        super.field3958.method2149(-11771, 8448, 8448);
        if (arg0 != 85) {
            this.method76(8, false);
        }
    }
}
