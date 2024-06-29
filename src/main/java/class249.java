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

@OriginalClass("client!qj")
public class class249 {

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Z")
    public static boolean field3876 = true;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    private static int field3894 = -1;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "Z")
    public static boolean field3893 = false;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
    private static boolean field3889 = false;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    private static int field3886 = 0;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "F")
    private static float field3871 = 0.0F;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Z")
    private static boolean field3885 = false;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field3892 = 0;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "F")
    private static float field3905 = 0.0F;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    private static int field3896 = -1;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "[F")
    private static float[] field3903 = new float[16];

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "F")
    private static float field3891 = 0.09765625F;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    private static int field3908 = 0;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "Z")
    private static boolean field3897 = true;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    private static int field3911 = -1;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Z")
    private static boolean field3890 = true;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "Z")
    private static boolean field3917 = true;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "F")
    private static float field3902;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "F")
    private static float field3912;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    private static int field3875;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    private static int field3880;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    private static int field3882;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    private static int field3887;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    private static int field3904;

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    private static int field3907;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    private static int field3910;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "Ljava/lang/String;")
    private static String field3899;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "Ljava/lang/String;")
    private static String field3914;

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field3898;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field3873;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field3884;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
    public static boolean field3872;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Z")
    public static boolean field3874;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Z")
    public static boolean field3877;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Z")
    public static boolean field3879;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Z")
    public static boolean field3881;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Z")
    public static boolean field3883;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "Z")
    public static boolean field3900;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "Z")
    public static boolean field3913;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "Z")
    public static boolean field3915;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "Z")
    public static boolean field3916;

    @OriginalMember(owner = "client!qj", name = "Y", descriptor = "Z")
    public static boolean field3918;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "()V", line = 12)
    public static final void method1647() {
        int[] var0 = new int[2];
        field3898.glGetIntegerv(3073, var0, 0);
        field3898.glGetIntegerv(3074, var0, 1);
        field3898.glDrawBuffer(1026);
        field3898.glReadBuffer(1024);
        method1689(-1);
        field3898.glPushAttrib(8192);
        field3898.glDisable(2912);
        field3898.glDisable(3042);
        field3898.glDisable(2929);
        field3898.glDisable(3008);
        field3898.glRasterPos2i(0, 0);
        field3898.glCopyPixels(0, 0, field3901, field3888, 6144);
        field3898.glPopAttrib();
        field3898.glDrawBuffer(var0[0]);
        field3898.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method1648(boolean arg0) {
        if (field3917 == arg0) {
            return;
        }
        if (arg0) {
            field3898.glEnable(2896);
        } else {
            field3898.glDisable(2896);
        }
        field3917 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V", line = 48)
    public static final void method1649(int arg0, int arg1) {
        field3901 = arg0;
        field3888 = arg1;
        field3885 = false;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "()V", line = 53)
    public static final void method1650() {
        field3898.glDepthMask(false);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "()V", line = 65)
    private static final void method1651() {
        int[] var0 = new int[1];
        field3898.glGenTextures(1, var0, 0);
        field3909 = var0[0];
        field3898.glBindTexture(3553, field3909);
        field3898.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class310.method2081();
        class255.method1710((byte) 24);
        class195.method1255();
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "()I", line = 76)
    private static final int method1652() {
        int var0 = 0;
        field3914 = field3898.glGetString(7936);
        field3899 = field3898.glGetString(7937);
        String var1 = field3914.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field3898.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field3887 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field3887 < 12) {
            var0 |= 0x2;
        }
        if (!field3898.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field3898.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field3898.glGetIntegerv(34018, var7, 0);
        field3906 = var7[0];
        field3898.glGetIntegerv(34929, var7, 0);
        field3880 = var7[0];
        field3898.glGetIntegerv(34930, var7, 0);
        field3904 = var7[0];
        if (field3906 < 2 || field3880 < 2 || field3904 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field3916 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field3877 = field3898.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field3900 = field3898.isExtensionAvailable("GL_ARB_multisample");
        field3879 = field3898.isExtensionAvailable("GL_ARB_texture_cube_map");
        field3881 = field3898.isExtensionAvailable("GL_ARB_vertex_program");
        field3913 = field3898.isExtensionAvailable("GL_EXT_framebuffer_object");
        field3898.isExtensionAvailable("GL_ARB_vertex_shader");
        field3872 = field3898.isExtensionAvailable("GL_ARB_fragment_shader");
        field3883 = field3898.isExtensionAvailable("GL_EXT_texture3D");
        field3915 = field3898.isExtensionAvailable("GL_ARB_texture_rectangle");
        field3918 = field3898.isExtensionAvailable("GL_ARB_texture_float");
        String var8 = field3899.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class211.method1428(1, var8.replace('/', ' '), ' ');
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class343.method2377(var13.substring(1, 3), (byte) -128)) {
                        var10 = true;
                        break;
                    }
                    if (class343.method2377(var13.substring(0, 4), (byte) 81)) {
                        var9 = class321.method2236(var13.substring(0, 4), 106);
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field3877 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field3883 = false;
            }
            if (var9 >= 9200 || var10) {
                field3918 = false;
            }
            field3874 = field3877;
        }
        if (field3877) {
            try {
                int[] var14 = new int[1];
                field3898.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 211)
    public static final void method1653(int arg0) {
        if (field3886 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3898.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field3898.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field3898.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field3898.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field3898.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field3898.glTexEnvi(8960, 34161, 34165);
        }
        field3886 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIFFII)V", line = 236)
    public static final void method1654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field3898.glMatrixMode(5889);
        field3898.glLoadIdentity();
        method1663((float) var10 * field3891, (float) var11 * field3891, (float) (-var13) * field3891, (float) (-var12) * field3891, 50.0F, 3584.0F);
        method1687(arg0, field3888 - arg1 - arg3, arg2, arg3);
        field3898.glMatrixMode(5888);
        field3898.glLoadIdentity();
        field3898.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field3898.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field3898.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field3885 = false;
        class39.field760 = var10;
        class329.field5044 = var11;
        class191.field3095 = var12;
        class343.field5334 = var13;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "()V", line = 263)
    public static final void method1655() {
        if (field3898 != null) {
            try {
                class195.method1253();
                class49.method372((byte) 39);
            } catch (Throwable var7) {
            }
            field3898 = null;
        }
        if (field3873 != null) {
            class258.method1731();
            try {
                if (GLContext.getCurrent() == field3873) {
                    field3873.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field3873.destroy();
            } catch (Throwable var5) {
            }
            field3873 = null;
        }
        if (field3884 != null) {
            try {
                field3884.setRealized(false);
            } catch (Throwable var4) {
            }
            field3884 = null;
        }
        class310.method2075();
        field3893 = false;
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "()V", line = 313)
    public static final void method1656() {
        field3898.glClear(256);
    }

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "()V", line = 320)
    public static final void method1657() {
        if (field3889) {
            field3898.glMatrixMode(5890);
            field3898.glLoadIdentity();
            field3898.glMatrixMode(5888);
            field3889 = false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 330)
    public static final void method1658(int arg0) {
        field3898.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3898.glClear(16640);
        field3898.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "()V", line = 337)
    public static final void method1659() {
        field3898.glDepthMask(true);
    }

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "()V", line = 340)
    public static void method1660() {
        field3899 = null;
        field3914 = null;
        field3898 = null;
        field3884 = null;
        field3873 = null;
        field3903 = null;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V", line = 349)
    public static final void method1661(boolean arg0) {
        if (field3890 == arg0) {
            return;
        }
        if (arg0) {
            field3898.glEnable(2912);
        } else {
            field3898.glDisable(2912);
        }
        field3890 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "()V", line = 360)
    private static final void method1662() {
        if (field3885) {
            return;
        }
        field3898.glMatrixMode(5889);
        field3898.glLoadIdentity();
        field3898.glOrtho(0.0D, (double) field3901, 0.0D, (double) field3888, -1.0D, 1.0D);
        method1687(0, 0, field3901, field3888);
        field3898.glMatrixMode(5888);
        field3898.glLoadIdentity();
        field3885 = true;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(FFFFFF)V", line = 373)
    private static final void method1663(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field3903[0] = var6 / (arg1 - arg0);
        field3903[1] = 0.0F;
        field3903[2] = 0.0F;
        field3903[3] = 0.0F;
        field3903[4] = 0.0F;
        field3903[5] = var6 / (arg3 - arg2);
        field3903[6] = 0.0F;
        field3903[7] = 0.0F;
        field3903[8] = (arg0 + arg1) / (arg1 - arg0);
        field3903[9] = (arg2 + arg3) / (arg3 - arg2);
        field3903[10] = field3902 = -(arg4 + arg5) / (arg5 - arg4);
        field3903[11] = -1.0F;
        field3903[12] = 0.0F;
        field3903[13] = 0.0F;
        field3903[14] = field3912 = -(arg5 * var6) / (arg5 - arg4);
        field3903[15] = 0.0F;
        field3898.glLoadMatrixf(field3903, 0);
        field3905 = 0.0F;
        field3871 = 0.0F;
    }

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "()V", line = 402)
    private static final void method1664() {
        field3898.glViewport(field3907 + field3878, field3895 + field3882, field3910, field3875);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 407)
    public static final void method1665(Canvas arg0) {
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

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "()V", line = 429)
    public static final void method1666() {
        if (class334.field5115) {
            method1648(true);
            method1683(true);
        } else {
            method1648(false);
            method1683(false);
        }
    }

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "()V", line = 444)
    private static final void method1667() {
        field3885 = false;
        field3898.glDisable(3553);
        field3911 = -1;
        field3898.glTexEnvi(8960, 8704, 34160);
        field3898.glTexEnvi(8960, 34161, 8448);
        field3886 = 0;
        field3898.glTexEnvi(8960, 34162, 8448);
        field3908 = 0;
        field3898.glEnable(2896);
        field3898.glEnable(2912);
        field3898.glEnable(2929);
        field3917 = true;
        field3897 = true;
        field3890 = true;
        class276.method1857(false);
        field3898.glActiveTexture(33985);
        field3898.glTexEnvi(8960, 8704, 34160);
        field3898.glTexEnvi(8960, 34161, 8448);
        field3898.glTexEnvi(8960, 34162, 8448);
        field3898.glActiveTexture(33984);
        field3898.setSwapInterval(0);
        field3898.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field3898.glShadeModel(7425);
        field3898.glClearDepth(1.0D);
        field3898.glDepthFunc(515);
        method1659();
        field3898.glMatrixMode(5890);
        field3898.glLoadIdentity();
        field3898.glPolygonMode(1028, 6914);
        field3898.glEnable(2884);
        field3898.glCullFace(1029);
        field3898.glEnable(3042);
        field3898.glBlendFunc(770, 771);
        field3898.glEnable(3008);
        field3898.glAlphaFunc(516, 0.0F);
        field3898.glEnableClientState(32884);
        field3898.glEnableClientState(32885);
        field3876 = true;
        field3898.glEnableClientState(32886);
        field3898.glEnableClientState(32888);
        field3898.glMatrixMode(5888);
        field3898.glLoadIdentity();
        class65.method497();
        class310.method2076();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)V", line = 490)
    public static final void method1668(int arg0, int arg1, int arg2, int arg3) {
        field3898.glMatrixMode(5889);
        field3898.glLoadIdentity();
        field3898.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field3898.glMatrixMode(5888);
        field3898.glLoadIdentity();
        method1687(field3878, field3895, field3901, field3888);
        field3885 = false;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)V", line = 505)
    public static final void method1669(int arg0, int arg1) {
        field3878 = arg0;
        field3895 = arg1;
        method1664();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIII)V", line = 512)
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field3901 - arg0;
        int var8 = -arg1;
        int var9 = field3888 - arg1;
        field3898.glMatrixMode(5889);
        field3898.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field3898.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method1687(0, 0, field3901, field3888);
        field3898.glMatrixMode(5888);
        field3898.glLoadIdentity();
        field3898.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field3885 = false;
    }

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "()F", line = 535)
    public static final float method1671() {
        return field3871;
    }

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "()V", line = 541)
    public static final void method1672() {
        class128.method844(0, 0, (byte) -69);
        method1662();
        method1653(0);
        method1681(0);
        method1648(false);
        method1677(false);
        method1661(false);
        method1657();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(FFF)V", line = 554)
    public static final void method1673(float arg0, float arg1, float arg2) {
        field3898.glMatrixMode(5890);
        if (field3889) {
            field3898.glLoadIdentity();
        }
        field3898.glTranslatef(arg0, arg1, arg2);
        field3898.glMatrixMode(5888);
        field3889 = true;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(IIII)V", line = 569)
    public static final void method1674(int arg0, int arg1, int arg2, int arg3) {
        method1654(0, 0, field3901, field3888, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "()F", line = 572)
    public static final float method1675() {
        return field3905;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 580)
    private static final int method1676(Canvas arg0, int arg1, GLContext arg2) {
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
            field3884 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field3884.setRealized(true);
            int var5 = 0;
            while (true) {
                field3873 = field3884.createContext(arg2);
                try {
                    int var6 = field3873.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class127.method843(-49, 1000L);
            }
            field3898 = field3873.getGL();
            new GLU();
            field3893 = true;
            field3901 = arg0.getSize().width;
            field3888 = arg0.getSize().height;
            int var8 = method1652();
            if (var8 != 0) {
                method1655();
                return var8;
            }
            method1651();
            method1667();
            field3898.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field3884.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method1655();
                        return -3;
                    }
                    class127.method843(-30, 100L);
                }
            }
            field3898.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method1655();
            return -5;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V", line = 671)
    public static final void method1677(boolean arg0) {
        if (field3897 == arg0) {
            return;
        }
        if (arg0) {
            field3898.glEnable(2929);
        } else {
            field3898.glDisable(2929);
        }
        field3897 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(F)V", line = 688)
    public static final void method1678(float arg0) {
        method1688(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "()V", line = 704)
    public static final void method1679() {
        class128.method844(0, 0, (byte) -40);
        method1662();
        method1653(1);
        method1681(1);
        method1648(false);
        method1677(false);
        method1661(false);
        method1657();
    }

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "()I", line = 714)
    public static final int method1680() {
        if (field3913 && (field3896 <= 0 || class258.field4013 != field3894)) {
            int[] var0 = new int[1];
            field3898.glGenFramebuffersEXT(1, var0, 0);
            field3894 = class258.field4013;
            field3896 = var0[0];
        }
        return field3896;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 738)
    public static final void method1681(int arg0) {
        if (field3908 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3898.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field3898.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field3898.glTexEnvi(8960, 34162, 260);
        }
        field3908 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "()V", line = 754)
    public static final void method1682() {
        class128.method844(0, 0, (byte) -45);
        method1662();
        method1689(-1);
        method1648(false);
        method1677(false);
        method1661(false);
        method1657();
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(Z)V", line = 763)
    private static final void method1683(boolean arg0) {
        if (field3876 == arg0) {
            return;
        }
        if (arg0) {
            field3898.glEnableClientState(32885);
        } else {
            field3898.glDisableClientState(32885);
        }
        field3876 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "()V", line = 776)
    public static final void method1684() {
        class128.method844(0, 0, (byte) -100);
        method1662();
        method1653(0);
        method1681(0);
        method1648(false);
        method1677(false);
        method1661(false);
        method1657();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 790)
    public static final int method1685(Canvas arg0, int arg1) {
        return method1676(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "()V", line = 800)
    public static final void method1686() {
        try {
            field3884.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(IIII)V", line = 811)
    private static final void method1687(int arg0, int arg1, int arg2, int arg3) {
        field3907 = arg0;
        field3882 = arg1;
        field3910 = arg2;
        field3875 = arg3;
        method1664();
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(FF)V", line = 818)
    public static final void method1688(float arg0, float arg1) {
        if (field3885 || field3905 == arg0 && field3871 == arg1) {
            return;
        }
        field3905 = arg0;
        field3871 = arg1;
        if (arg1 == 0.0F) {
            field3903[10] = field3902;
            field3903[14] = field3912;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field3912 * (1.0F - var2) / arg1;
            field3903[10] = field3902 + var4;
            field3903[14] = field3912 * var3;
        }
        field3898.glMatrixMode(5889);
        field3898.glLoadMatrixf(field3903, 0);
        field3898.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V", line = 848)
    public static final void method1689(int arg0) {
        if (field3911 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field3898.glDisable(3553);
        } else {
            if (field3911 == -1) {
                field3898.glEnable(3553);
            }
            field3898.glBindTexture(3553, arg0);
        }
        field3911 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)V", line = 869)
    public static final void method1690(int arg0) {
        field3898.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3898.glClear(16384);
        field3898.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }
}
