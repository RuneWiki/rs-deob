import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Locale;
import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class250 {

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Z")
    public static boolean field3787 = false;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[F")
    private static float[] field3781 = new float[16];

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Z")
    private static boolean field3782 = false;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Z")
    private static boolean field3799 = false;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    private static int field3791 = -1;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Z")
    private static boolean field3789 = true;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "F")
    private static float field3795 = 0.09765625F;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "F")
    private static float field3808 = 0.0F;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    private static int field3811 = 0;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    private static int field3800 = -1;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field3796 = 0;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "Z")
    public static boolean field3815 = true;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    private static int field3819 = 0;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Z")
    private static boolean field3807 = true;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "F")
    private static float field3822 = 0.0F;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "Z")
    private static boolean field3823 = true;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    private static int field3827 = -1;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "F")
    private static float field3783;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "F")
    private static float field3814;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    private static int field3797;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    private static int field3798;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    private static int field3802;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    private static int field3805;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    private static int field3812;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    private static int field3817;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    private static int field3826;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Ljava/lang/String;")
    private static String field3780;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Ljava/lang/String;")
    private static String field3784;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field3818;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field3786;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field3803;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Z")
    public static boolean field3788;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Z")
    public static boolean field3790;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
    public static boolean field3793;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Z")
    public static boolean field3794;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Z")
    public static boolean field3804;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Z")
    public static boolean field3809;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Z")
    public static boolean field3813;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Z")
    public static boolean field3816;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "Z")
    public static boolean field3821;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "Z")
    public static boolean field3824;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Z")
    public static boolean field3825;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 11)
    public static final void method1791() {
        field3818.glDepthMask(true);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)V", line = 14)
    public static final void method1792(int arg0, int arg1, int arg2, int arg3) {
        method1810(0, 0, field3810, field3820, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 21)
    public static final void method1793(int arg0) {
        field3818.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3818.glClear(16640);
        field3818.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method1794(boolean arg0) {
        if (field3807 == arg0) {
            return;
        }
        if (arg0) {
            field3818.glEnable(2929);
        } else {
            field3818.glDisable(2929);
        }
        field3807 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V", line = 37)
    public static final void method1795(int arg0, int arg1) {
        field3810 = arg0;
        field3820 = arg1;
        field3782 = false;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V", line = 43)
    public static final void method1796() {
        int[] var0 = new int[2];
        field3818.glGetIntegerv(3073, var0, 0);
        field3818.glGetIntegerv(3074, var0, 1);
        field3818.glDrawBuffer(1026);
        field3818.glReadBuffer(1024);
        method1806(-1);
        field3818.glPushAttrib(8192);
        field3818.glDisable(2912);
        field3818.glDisable(3042);
        field3818.glDisable(2929);
        field3818.glDisable(3008);
        field3818.glRasterPos2i(0, 0);
        field3818.glCopyPixels(0, 0, field3810, field3820, 6144);
        field3818.glPopAttrib();
        field3818.glDrawBuffer(var0[0]);
        field3818.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 63)
    public static final void method1797(int arg0) {
        if (field3811 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3818.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field3818.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field3818.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field3818.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field3818.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field3818.glTexEnvi(8960, 34161, 34165);
        }
        field3811 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()I", line = 87)
    public static final int method1798() {
        if (field3794 && (field3791 <= 0 || class266.field4192 != field3800)) {
            int[] var0 = new int[1];
            field3818.glGenFramebuffersEXT(1, var0, 0);
            field3800 = class266.field4192;
            field3791 = var0[0];
        }
        return field3791;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()V", line = 99)
    private static final void method1799() {
        field3782 = false;
        field3818.glDisable(3553);
        field3827 = -1;
        field3818.glTexEnvi(8960, 8704, 34160);
        field3818.glTexEnvi(8960, 34161, 8448);
        field3811 = 0;
        field3818.glTexEnvi(8960, 34162, 8448);
        field3819 = 0;
        field3818.glEnable(2896);
        field3818.glEnable(2912);
        field3818.glEnable(2929);
        field3823 = true;
        field3807 = true;
        field3789 = true;
        class309.method2172((byte) -63);
        field3818.glActiveTexture(33985);
        field3818.glTexEnvi(8960, 8704, 34160);
        field3818.glTexEnvi(8960, 34161, 8448);
        field3818.glTexEnvi(8960, 34162, 8448);
        field3818.glActiveTexture(33984);
        field3818.setSwapInterval(0);
        field3818.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field3818.glShadeModel(7425);
        field3818.glClearDepth(1.0D);
        field3818.glDepthFunc(515);
        method1791();
        field3818.glMatrixMode(5890);
        field3818.glLoadIdentity();
        field3818.glPolygonMode(1028, 6914);
        field3818.glEnable(2884);
        field3818.glCullFace(1029);
        field3818.glEnable(3042);
        field3818.glBlendFunc(770, 771);
        field3818.glEnable(3008);
        field3818.glAlphaFunc(516, 0.0F);
        field3818.glEnableClientState(32884);
        field3818.glEnableClientState(32885);
        field3815 = true;
        field3818.glEnableClientState(32886);
        field3818.glEnableClientState(32888);
        field3818.glMatrixMode(5888);
        field3818.glLoadIdentity();
        class64.method402();
        class193.method1334();
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()V", line = 146)
    public static final void method1800() {
        if (class162.field2241) {
            method1819(true);
            method1832(true);
        } else {
            method1819(false);
            method1832(false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "()V", line = 171)
    public static final void method1801() {
        class262.method1886(0, 3, 0);
        method1817();
        method1797(0);
        method1812(0);
        method1819(false);
        method1794(false);
        method1815(false);
        method1834();
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "()F", line = 184)
    public static final float method1802() {
        return field3808;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(FFF)V", line = 187)
    public static final void method1803(float arg0, float arg1, float arg2) {
        field3818.glMatrixMode(5890);
        if (field3799) {
            field3818.glLoadIdentity();
        }
        field3818.glTranslatef(arg0, arg1, arg2);
        field3818.glMatrixMode(5888);
        field3799 = true;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V", line = 196)
    public static final void method1804(int arg0, int arg1) {
        field3785 = arg0;
        field3806 = arg1;
        method1823();
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "()V", line = 202)
    public static final void method1805() {
        if (field3818 != null) {
            try {
                class124.method838();
                class90.method527(93);
            } catch (Throwable var7) {
            }
            field3818 = null;
        }
        if (field3786 != null) {
            class266.method1929();
            try {
                if (GLContext.getCurrent() == field3786) {
                    field3786.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field3786.destroy();
            } catch (Throwable var5) {
            }
            field3786 = null;
        }
        if (field3803 != null) {
            try {
                field3803.setRealized(false);
            } catch (Throwable var4) {
            }
            field3803 = null;
        }
        class193.method1343();
        field3787 = false;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 251)
    public static final void method1806(int arg0) {
        if (field3827 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field3818.glDisable(3553);
        } else {
            if (field3827 == -1) {
                field3818.glEnable(3553);
            }
            field3818.glBindTexture(3553, arg0);
        }
        field3827 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "()I", line = 281)
    private static final int method1807() {
        int var0 = 0;
        field3784 = field3818.glGetString(7936);
        field3780 = field3818.glGetString(7937);
        String var1 = field3784.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field3818.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field3805 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field3805 < 12) {
            var0 |= 0x2;
        }
        if (!field3818.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field3818.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field3818.glGetIntegerv(34018, var7, 0);
        field3801 = var7[0];
        field3818.glGetIntegerv(34929, var7, 0);
        field3826 = var7[0];
        field3818.glGetIntegerv(34930, var7, 0);
        field3812 = var7[0];
        if (field3801 < 2 || field3826 < 2 || field3812 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field3825 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field3809 = field3818.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field3813 = field3818.isExtensionAvailable("GL_ARB_multisample");
        field3788 = field3818.isExtensionAvailable("GL_ARB_texture_cube_map");
        field3793 = field3818.isExtensionAvailable("GL_ARB_vertex_program");
        field3794 = field3818.isExtensionAvailable("GL_EXT_framebuffer_object");
        field3818.isExtensionAvailable("GL_ARB_vertex_shader");
        field3790 = field3818.isExtensionAvailable("GL_ARB_fragment_shader");
        field3821 = field3818.isExtensionAvailable("GL_EXT_texture3D");
        field3816 = field3818.isExtensionAvailable("GL_ARB_texture_rectangle");
        field3804 = field3818.isExtensionAvailable("GL_ARB_texture_float");
        String var8 = field3780.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class319.method2226((byte) -104, var8.replace('/', ' '), ' ');
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class217.method1497(var13.substring(1, 3), 104)) {
                        var10 = true;
                        break;
                    }
                    if (class217.method1497(var13.substring(0, 4), 111)) {
                        var9 = class235.method1672(var13.substring(0, 4), 10);
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field3809 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field3821 = false;
            }
            if (var9 >= 9200 || var10) {
                field3804 = false;
            }
            field3824 = field3809;
        }
        if (field3809) {
            try {
                int[] var14 = new int[1];
                field3818.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 422)
    public static final void method1808(Canvas arg0) {
        try {
            if (!arg0.isDisplayable()) {
                return;
            }
            GLDrawableFactory var1 = GLDrawableFactory.getFactory();
            GLDrawable var2 = var1.getGLDrawable(arg0, (GLCapabilities) null, (GLCapabilitiesChooser) null);
            var2.setRealized(true);
            GLContext var3 = var2.createContext((GLContext) null);
            var3.makeCurrent();
            var3.release();
            var3.destroy();
            var2.setRealized(false);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "()V", line = 445)
    public static final void method1809() {
        try {
            field3803.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIFFII)V", line = 453)
    public static final void method1810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field3818.glMatrixMode(5889);
        field3818.glLoadIdentity();
        method1816((float) var10 * field3795, (float) var11 * field3795, (float) (-var13) * field3795, (float) (-var12) * field3795, 50.0F, 3584.0F);
        method1821(arg0, field3820 - arg1 - arg3, arg2, arg3);
        field3818.glMatrixMode(5888);
        field3818.glLoadIdentity();
        field3818.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field3818.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field3818.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field3782 = false;
        class295.field4604 = var10;
        class310.field4792 = var11;
        class232.field3388 = var12;
        class72.field918 = var13;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 490)
    public static final int method1811(Canvas arg0, int arg1) {
        return method1826(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 497)
    public static final void method1812(int arg0) {
        if (field3819 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3818.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field3818.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field3818.glTexEnvi(8960, 34162, 260);
        }
        field3819 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V", line = 518)
    public static final void method1813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field3810 - arg0;
        int var8 = -arg1;
        int var9 = field3820 - arg1;
        field3818.glMatrixMode(5889);
        field3818.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field3818.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method1821(0, 0, field3810, field3820);
        field3818.glMatrixMode(5888);
        field3818.glLoadIdentity();
        field3818.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field3782 = false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(F)V", line = 543)
    public static final void method1814(float arg0) {
        method1818(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V", line = 546)
    public static final void method1815(boolean arg0) {
        if (field3789 == arg0) {
            return;
        }
        if (arg0) {
            field3818.glEnable(2912);
        } else {
            field3818.glDisable(2912);
        }
        field3789 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(FFFFFF)V", line = 559)
    private static final void method1816(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field3781[0] = var6 / (arg1 - arg0);
        field3781[1] = 0.0F;
        field3781[2] = 0.0F;
        field3781[3] = 0.0F;
        field3781[4] = 0.0F;
        field3781[5] = var6 / (arg3 - arg2);
        field3781[6] = 0.0F;
        field3781[7] = 0.0F;
        field3781[8] = (arg0 + arg1) / (arg1 - arg0);
        field3781[9] = (arg2 + arg3) / (arg3 - arg2);
        field3781[10] = field3783 = -(arg4 + arg5) / (arg5 - arg4);
        field3781[11] = -1.0F;
        field3781[12] = 0.0F;
        field3781[13] = 0.0F;
        field3781[14] = field3814 = -(arg5 * var6) / (arg5 - arg4);
        field3781[15] = 0.0F;
        field3818.glLoadMatrixf(field3781, 0);
        field3822 = 0.0F;
        field3808 = 0.0F;
    }

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "()V", line = 581)
    private static final void method1817() {
        if (field3782) {
            return;
        }
        field3818.glMatrixMode(5889);
        field3818.glLoadIdentity();
        field3818.glOrtho(0.0D, (double) field3810, 0.0D, (double) field3820, -1.0D, 1.0D);
        method1821(0, 0, field3810, field3820);
        field3818.glMatrixMode(5888);
        field3818.glLoadIdentity();
        field3782 = true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(FF)V", line = 595)
    public static final void method1818(float arg0, float arg1) {
        if (field3782 || field3822 == arg0 && field3808 == arg1) {
            return;
        }
        field3822 = arg0;
        field3808 = arg1;
        if (arg1 == 0.0F) {
            field3781[10] = field3783;
            field3781[14] = field3814;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field3814 * (1.0F - var2) / arg1;
            field3781[10] = field3783 + var4;
            field3781[14] = field3814 * var3;
        }
        field3818.glMatrixMode(5889);
        field3818.glLoadMatrixf(field3781, 0);
        field3818.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)V", line = 626)
    public static final void method1819(boolean arg0) {
        if (field3823 == arg0) {
            return;
        }
        if (arg0) {
            field3818.glEnable(2896);
        } else {
            field3818.glDisable(2896);
        }
        field3823 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "()F", line = 643)
    public static final float method1820() {
        return field3822;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIII)V", line = 652)
    private static final void method1821(int arg0, int arg1, int arg2, int arg3) {
        field3817 = arg0;
        field3797 = arg1;
        field3802 = arg2;
        field3798 = arg3;
        method1823();
    }

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "()V", line = 660)
    private static final void method1822() {
        int[] var0 = new int[1];
        field3818.glGenTextures(1, var0, 0);
        field3792 = var0[0];
        field3818.glBindTexture(3553, field3792);
        field3818.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class193.method1345();
        class16.method109((byte) 4);
        class124.method831();
    }

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "()V", line = 671)
    private static final void method1823() {
        field3818.glViewport(field3817 + field3785, field3806 + field3797, field3802, field3798);
    }

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "()V", line = 677)
    public static final void method1824() {
        field3818.glClear(256);
    }

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "()V", line = 683)
    public static final void method1825() {
        class262.method1886(0, 3, 0);
        method1817();
        method1797(1);
        method1812(1);
        method1819(false);
        method1794(false);
        method1815(false);
        method1834();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 700)
    private static final int method1826(Canvas arg0, int arg1, GLContext arg2) {
        try {
            if (!arg0.isDisplayable()) {
                return -1;
            }
            GLCapabilities var3 = new GLCapabilities();
            if (arg1 > 0) {
                var3.setSampleBuffers(true);
                var3.setNumSamples(arg1);
            }
            GLDrawableFactory var4 = GLDrawableFactory.getFactory();
            field3803 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field3803.setRealized(true);
            int var5 = 0;
            while (true) {
                field3786 = field3803.createContext(arg2);
                try {
                    int var6 = field3786.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class81.method485(1000L, 1);
            }
            field3818 = field3786.getGL();
            new GLU();
            field3787 = true;
            field3810 = arg0.getSize().width;
            field3820 = arg0.getSize().height;
            int var8 = method1807();
            if (var8 != 0) {
                method1805();
                return var8;
            }
            method1822();
            method1799();
            field3818.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field3803.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method1805();
                        return -3;
                    }
                    class81.method485(100L, 1);
                }
            }
            field3818.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method1805();
            return -5;
        }
    }

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "()V", line = 783)
    public static final void method1827() {
        field3818.glDepthMask(false);
    }

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "()V", line = 790)
    public static final void method1828() {
        class262.method1886(0, 3, 0);
        method1817();
        method1806(-1);
        method1819(false);
        method1794(false);
        method1815(false);
        method1834();
    }

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "()V", line = 804)
    public static final void method1829() {
        class262.method1886(0, 3, 0);
        method1817();
        method1797(0);
        method1812(0);
        method1819(false);
        method1794(false);
        method1815(false);
        method1834();
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(IIII)V", line = 815)
    public static final void method1830(int arg0, int arg1, int arg2, int arg3) {
        field3818.glMatrixMode(5889);
        field3818.glLoadIdentity();
        field3818.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field3818.glMatrixMode(5888);
        field3818.glLoadIdentity();
        method1821(field3785, field3806, field3810, field3820);
        field3782 = false;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V", line = 832)
    public static final void method1831(int arg0) {
        field3818.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3818.glClear(16384);
        field3818.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(Z)V", line = 838)
    private static final void method1832(boolean arg0) {
        if (field3815 == arg0) {
            return;
        }
        if (arg0) {
            field3818.glEnableClientState(32885);
        } else {
            field3818.glDisableClientState(32885);
        }
        field3815 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "()V", line = 851)
    public static void method1833() {
        field3780 = null;
        field3784 = null;
        field3818 = null;
        field3803 = null;
        field3786 = null;
        field3781 = null;
    }

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "()V", line = 862)
    public static final void method1834() {
        if (field3799) {
            field3818.glMatrixMode(5890);
            field3818.glLoadIdentity();
            field3818.glMatrixMode(5888);
            field3799 = false;
        }
    }
}
