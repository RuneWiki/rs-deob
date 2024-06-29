import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class611 extends class531 {

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "Z")
    private boolean field8586 = false;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "Z")
    private boolean field8584;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "[Lqba;")
    private class425[] field8583;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    public static int field8585;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!nw", name = "m", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!nw", name = "n", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!nw", name = "o", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!nw", name = "p", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!nw", name = "s", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!nw", name = "t", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!nw", name = "u", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!nw", name = "v", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!nw", name = "r", descriptor = "Loi;")
    private class78 field8593;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILwia;I)Ljd;", line = 7)
    public static final class241 method3549(int arg0, class791 arg1, int arg2) {
        ++field8594;
        if (arg0 != 0) {
            method3551(false, -27, 118);
        }
        class241 var3 = (class241) class582.field8220.method3742((byte) 67, (long) arg2);
        if (var3 == null) {
            if (!class216.field3357) {
                var3 = class97.method702(arg1.method4335(arg2, 0), -2);
            } else {
                var3 = class37.field491.method551(class1.method8(arg1, arg2), true);
            }
            class582.field8220.method3739((long) arg2, (byte) 56, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)Z", line = 30)
    public static final boolean method3550(int arg0, int arg1, int arg2) {
        ++field8597;
        if (arg1 != -17362) {
            return true;
        } else {
            return (52 & arg2) != 0;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZLdca;)V", line = 42)
    public final void method307(int arg0, boolean arg1, class188 arg2) {
        super.field7676.method808((byte) 34, arg2);
        ++field8595;
        if (arg1) {
            method3553(88, (Canvas) null, 42, 13);
        }
        super.field7676.method795(arg0, 34023);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZII)Z", line = 57)
    public static final boolean method3551(boolean arg0, int arg1, int arg2) {
        ++field8587;
        if (!arg0) {
            return true;
        } else {
            return (65536 & arg1) != 0;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(B)V", line = 68)
    private final void method3552(byte arg0) {
        ++field8596;
        this.field8593 = new class78(super.field7676, 2);
        this.field8593.method607(0, false);
        super.field7676.method813((byte) 103, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        if (arg0 >= -112) {
            this.field8584 = true;
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field8584) {
            super.field7676.method802(8448, 11762, 7681);
            super.field7676.method789(34168, 768, 0, (byte) 47);
            super.field7676.method813((byte) 103, 2);
            super.field7676.method802(7681, 11762, 260);
            super.field7676.method789(34168, 768, 0, (byte) 47);
            super.field7676.method789(34168, 770, 1, (byte) 47);
            super.field7676.method745(34167, 13, 770, 0);
        } else {
            super.field7676.method802(7681, 11762, 260);
            super.field7676.method789(5890, 770, 0, (byte) 47);
            super.field7676.method745(34167, -104, 770, 0);
        }
        super.field7676.method813((byte) 103, 0);
        this.field8593.method608(false);
        this.field8593.method607(1, false);
        super.field7676.method813((byte) 103, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field8584) {
            super.field7676.method802(8448, 11762, 8448);
            super.field7676.method789(5890, 768, 0, (byte) 47);
            super.field7676.method813((byte) 103, 2);
            super.field7676.method802(8448, 11762, 8448);
            super.field7676.method789(5890, 768, 0, (byte) 47);
            super.field7676.method789(34168, 768, 1, (byte) 47);
            super.field7676.method745(5890, -108, 770, 0);
        } else {
            super.field7676.method802(8448, 11762, 8448);
            super.field7676.method789(5890, 768, 0, (byte) 47);
            super.field7676.method745(5890, 41, 770, 0);
        }
        super.field7676.method813((byte) 103, 0);
        this.field8593.method608(false);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BII)V", line = 138)
    public final void method311(byte arg0, int arg1, int arg2) {
        ++field8590;
        if (arg0 > -55) {
            this.method3552((byte) -62);
        }
        if (this.field8586) {
            super.field7676.method813((byte) 103, 1);
            super.field7676.method808((byte) 34, this.field8583[arg1 + -1]);
            super.field7676.method813((byte) 103, 0);
        }
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lqfa;)V", line = 155)
    public class611(class106 arg0) {
        super(arg0);
        if (arg0.field1559) {
            this.field8584 = ~arg0.field1544 > -4;
            int var2 = !this.field8584 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 != -2) {
                                if (~var14 != -3) {
                                    if (~var14 != -4) {
                                        if (~var14 != -5) {
                                            var15 = -var11;
                                        } else {
                                            var15 = var11;
                                        }
                                    } else {
                                        var15 = -var12;
                                    }
                                } else {
                                    var15 = var12;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field8583 = new class425[3];
            this.field8583[0] = new class425(super.field7676, 6406, 64, false, var4, 6406);
            this.field8583[1] = new class425(super.field7676, 6406, 64, false, var5, 6406);
            this.field8583[2] = new class425(super.field7676, 6406, 64, false, var3, 6406);
            this.method3552((byte) -118);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Z", line = 269)
    public final boolean method304(int arg0) {
        if (arg0 < 125) {
            this.field8593 = null;
        }
        ++field8582;
        return true;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILjava/awt/Canvas;II)Lub;", line = 281)
    public static final class22 method3553(int arg0, Canvas arg1, int arg2, int arg3) {
        ++field8585;
        try {
            Class var4 = Class.forName("cu");
            if (arg3 != -8344) {
                return null;
            } else {
                class22 var5 = (class22) var4.newInstance();
                var5.method227(arg2, arg3 ^ -8347, arg1, arg0);
                return var5;
            }
        } catch (Throwable var7) {
            class351 var6 = new class351();
            var6.method227(arg2, arg3 + 8357, arg1, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZI)V", line = 304)
    public final void method309(boolean arg0, int arg1) {
        super.field7676.method802(7681, 11762, 8448);
        if (arg1 >= -67) {
            this.method307(18, true, (class188) null);
        }
        ++field8592;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V", line = 318)
    public final void method300(int arg0) {
        ++field8588;
        if (arg0 != 1) {
            this.field8586 = false;
        }
        if (!this.field8586) {
            super.field7676.method745(5890, 60, 770, 0);
        } else {
            if (!this.field8584) {
                super.field7676.method813((byte) 103, 2);
                super.field7676.method808((byte) 34, (class188) null);
            }
            super.field7676.method813((byte) 103, 1);
            super.field7676.method808((byte) 34, (class188) null);
            super.field7676.method813((byte) 103, 0);
            this.field8593.method606(true, '\u0001');
            this.field8586 = false;
        }
        super.field7676.method802(8448, 11762, 8448);
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(ZI)V", line = 350)
    public final void method301(boolean arg0, int arg1) {
        if (arg1 >= -9) {
            this.field8584 = false;
        }
        ++field8591;
        if (this.field8593 != null && arg0) {
            if (!this.field8584) {
                super.field7676.method813((byte) 103, 2);
                super.field7676.method808((byte) 34, super.field7676.field1510);
                super.field7676.method813((byte) 103, 0);
            }
            this.field8593.method606(true, '\u0000');
            this.field8586 = true;
        } else {
            super.field7676.method745(34168, -123, 770, 0);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IILwia;ILjc;IZ)V", line = 376)
    public static final void method3554(int arg0, int arg1, class791 arg2, int arg3, class462 arg4, int arg5, boolean arg6) {
        ++field8589;
        int var7 = 123 % ((-6 - arg5) / 58);
        class370.method2306(arg3, arg1, arg2, arg0, (byte) -84, arg6);
        class161.field2559 = arg4;
    }
}
