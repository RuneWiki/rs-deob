import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class683 extends class682 {

    @OriginalMember(owner = "client!vha", name = "n", descriptor = "Z")
    private boolean field9660 = false;

    @OriginalMember(owner = "client!vha", name = "l", descriptor = "Z")
    private boolean field9658;

    @OriginalMember(owner = "client!vha", name = "k", descriptor = "[Ltc;")
    private class351[] field9657;

    @OriginalMember(owner = "client!vha", name = "p", descriptor = "Ldh;")
    public static class320 field9662 = new class320(29, 3);

    @OriginalMember(owner = "client!vha", name = "u", descriptor = "I")
    public static int field9667 = -1;

    @OriginalMember(owner = "client!vha", name = "g", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!vha", name = "h", descriptor = "I")
    public static int field9654;

    @OriginalMember(owner = "client!vha", name = "i", descriptor = "I")
    public static int field9655;

    @OriginalMember(owner = "client!vha", name = "j", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!vha", name = "m", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!vha", name = "q", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!vha", name = "r", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!vha", name = "s", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!vha", name = "t", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!vha", name = "v", descriptor = "I")
    public static int field9668;

    @OriginalMember(owner = "client!vha", name = "o", descriptor = "Lqha;")
    private class102 field9661;

    @OriginalMember(owner = "client!vha", name = "w", descriptor = "[I")
    public static int[] field9669;

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "(I)V", line = 3)
    private final void method3867(int arg0) {
        this.field9661 = new class102(super.field9647, 2);
        ++field9659;
        this.field9661.method705(0, (byte) -123);
        super.field9647.method2545(32886, 1);
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
        if (!this.field9658) {
            super.field9647.method2558(7681, 0, 8448);
            super.field9647.method2626(8960, 768, 0, 34168);
            super.field9647.method2545(32886, 2);
            super.field9647.method2558(260, 0, 7681);
            super.field9647.method2626(8960, 768, 0, 34168);
            super.field9647.method2626(8960, 770, 1, 34168);
            super.field9647.method2630(34166, 0, 770, 34167);
        } else {
            super.field9647.method2558(260, 0, 7681);
            super.field9647.method2626(8960, 770, 0, 5890);
            super.field9647.method2630(34166, 0, 770, 34167);
        }
        super.field9647.method2545(32886, 0);
        this.field9661.method711(22972);
        int var2 = 118 % ((arg0 - -78) / 44);
        this.field9661.method705(1, (byte) 122);
        super.field9647.method2545(32886, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field9658) {
            super.field9647.method2558(8448, 0, 8448);
            super.field9647.method2626(8960, 768, 0, 5890);
            super.field9647.method2545(32886, 2);
            super.field9647.method2558(8448, 0, 8448);
            super.field9647.method2626(8960, 768, 0, 5890);
            super.field9647.method2626(8960, 768, 1, 34168);
            super.field9647.method2630(34166, 0, 770, 5890);
        } else {
            super.field9647.method2558(8448, 0, 8448);
            super.field9647.method2626(8960, 768, 0, 5890);
            super.field9647.method2630(34166, 0, 770, 5890);
        }
        super.field9647.method2545(32886, 0);
        this.field9661.method711(22972);
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Z)Z", line = 73)
    public final boolean method286(boolean arg0) {
        if (!arg0) {
            this.field9657 = null;
        }
        ++field9656;
        return true;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IZ)V", line = 85)
    public final void method287(int arg0, boolean arg1) {
        if (arg0 >= 111) {
            ++field9653;
            super.field9647.method2558(8448, 0, 7681);
        }
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Lnv;)V", line = 96)
    public class683(class417 arg0) {
        super(arg0);
        if (arg0.field5953) {
            this.field9658 = ~arg0.field5963 > -4;
            int var2 = this.field9658 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (var14 == 1) {
                            var15 = var12;
                        } else if (~var14 == -3) {
                            var15 = var13;
                        } else if (~var14 == -4) {
                            var15 = -var13;
                        } else if (var14 == 4) {
                            var15 = var11;
                        } else {
                            var15 = -var11;
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
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field9657 = new class351[3];
            this.field9657[0] = new class351(super.field9647, 6406, 64, false, var4, 6406);
            this.field9657[1] = new class351(super.field9647, 6406, 64, false, var5, 6406);
            this.field9657[2] = new class351(super.field9647, 6406, 64, false, var3, 6406);
            this.method3867(-127);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(BIIIIII)I", line = 209)
    public static final int method3868(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(1 & arg1) == -2) {
            int var7 = arg2;
            arg2 = arg6;
            arg6 = var7;
        }
        ++field9663;
        int var8 = arg5 & 3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg3;
        } else {
            if (arg0 != -36) {
                method3869(true, 87, false, -96);
            }
            return var8 == 2 ? 1 - (arg2 - 7) + -arg4 : -arg3 + 7 + -arg6 + 1;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(BZ)V", line = 241)
    public final void method285(byte arg0, boolean arg1) {
        ++field9665;
        if (this.field9661 != null && arg1) {
            if (!this.field9658) {
                super.field9647.method2545(32886, 2);
                super.field9647.method2621(-2, super.field9647.field6008);
                super.field9647.method2545(arg0 ^ 32834, 0);
            }
            this.field9661.method712('\u0000', 1);
            this.field9660 = true;
        } else {
            super.field9647.method2630(34166, 0, 770, 34168);
        }
        if (arg0 != 52) {
            this.field9661 = null;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Ltha;II)V", line = 273)
    public final void method292(class292 arg0, int arg1, int arg2) {
        if (arg2 != -16997) {
            this.field9657 = null;
        }
        super.field9647.method2621(-2, arg0);
        ++field9664;
        super.field9647.method2573(arg1, false);
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(ZIZI)Loh;", line = 285)
    public static final class404 method3869(boolean arg0, int arg1, boolean arg2, int arg3) {
        ++field9668;
        class199 var4 = null;
        if (class289.field3557 != null) {
            var4 = new class199(arg3, class289.field3557, class439.field6379[arg3], 1000000);
        }
        class24.field224[arg3] = class324.field4141.method1975(arg3, var4, (byte) 70, class723.field10133);
        if (!arg2) {
            method3868((byte) 17, 31, 9, -74, 67, 94, 93);
        }
        class24.field224[arg3].method2141(-2147483647);
        return new class404(class24.field224[arg3], arg0, arg1);
    }

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "(I)V", line = 305)
    public static void method3870(int arg0) {
        field9662 = null;
        if (arg0 <= -14) {
            field9669 = null;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IBI)V", line = 326)
    public final void method289(int arg0, byte arg1, int arg2) {
        if (arg1 >= 72) {
            ++field9655;
            if (this.field9660) {
                super.field9647.method2545(32886, 1);
                super.field9647.method2621(-2, this.field9657[arg0 + -1]);
                super.field9647.method2545(32886, 0);
            }
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V", line = 344)
    public final void method288(int arg0) {
        ++field9654;
        if (this.field9660) {
            if (!this.field9658) {
                super.field9647.method2545(32886, 2);
                super.field9647.method2621(-2, (class292) null);
            }
            super.field9647.method2545(32886, 1);
            super.field9647.method2621(-2, (class292) null);
            super.field9647.method2545(32886, 0);
            this.field9661.method712('\u0001', 1);
            this.field9660 = false;
        } else {
            super.field9647.method2630(34166, 0, 770, 5890);
        }
        super.field9647.method2558(8448, arg0, 8448);
    }
}
