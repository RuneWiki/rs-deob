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

@OriginalClass("client!vd")
public class class67 {

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Z")
    private static boolean field884 = true;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Z")
    private static boolean field879 = true;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "F")
    private static float field878 = 0.0F;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    private static int field885 = 0;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "F")
    private static float field877 = 0.0F;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "[F")
    private static float[] field895 = new float[16];

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "F")
    private static float field886 = 0.09765625F;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field900 = 0;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    private static int field889 = -1;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "Z")
    public static boolean field908 = false;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Z")
    private static boolean field890 = true;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "Z")
    private static boolean field911 = false;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "Z")
    public static boolean field917 = true;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    private static int field888 = -1;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "Z")
    private static boolean field904 = false;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    private static int field921 = -1;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    private static int field918 = 0;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "F")
    private static float field882;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "F")
    private static float field901;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    private static int field880;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    private static int field894;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    private static int field896;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    private static int field913;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    private static int field919;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    private static int field920;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    private static int field922;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Ljava/lang/String;")
    private static String field898;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "Ljava/lang/String;")
    private static String field915;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field899;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field905;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field893;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Z")
    public static boolean field883;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Z")
    public static boolean field892;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "Z")
    public static boolean field903;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "Z")
    public static boolean field906;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Z")
    public static boolean field907;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "Z")
    public static boolean field909;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "Z")
    public static boolean field910;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "Z")
    public static boolean field912;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Z")
    public static boolean field914;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Z")
    public static boolean field916;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "Z")
    public static boolean field923;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII)V", line = 10)
    public static final void method451(int arg0, int arg1, int arg2, int arg3) {
        field899.glMatrixMode(5889);
        field899.glLoadIdentity();
        field899.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field899.glMatrixMode(5888);
        field899.glLoadIdentity();
        method480(field887, field891, field902, field897);
        field911 = false;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(FFF)V", line = 21)
    public static final void method452(float arg0, float arg1, float arg2) {
        field899.glMatrixMode(5890);
        if (field904) {
            field899.glLoadIdentity();
        }
        field899.glTranslatef(arg0, arg1, arg2);
        field899.glMatrixMode(5888);
        field904 = true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 31)
    public static final void method453(int arg0) {
        field899.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field899.glClear(16384);
        field899.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(FFFFFF)V", line = 38)
    private static final void method454(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field895[0] = var6 / (arg1 - arg0);
        field895[1] = 0.0F;
        field895[2] = 0.0F;
        field895[3] = 0.0F;
        field895[4] = 0.0F;
        field895[5] = var6 / (arg3 - arg2);
        field895[6] = 0.0F;
        field895[7] = 0.0F;
        field895[8] = (arg0 + arg1) / (arg1 - arg0);
        field895[9] = (arg2 + arg3) / (arg3 - arg2);
        field895[10] = field901 = -(arg4 + arg5) / (arg5 - arg4);
        field895[11] = -1.0F;
        field895[12] = 0.0F;
        field895[13] = 0.0F;
        field895[14] = field882 = -(arg5 * var6) / (arg5 - arg4);
        field895[15] = 0.0F;
        field899.glLoadMatrixf(field895, 0);
        field877 = 0.0F;
        field878 = 0.0F;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V", line = 60)
    public static final void method455() {
        class123.method884(0, 0, -108);
        method463();
        method489(1);
        method457(1);
        method460(false);
        method459(false);
        method476(false);
        method477();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()V", line = 70)
    private static final void method456() {
        field911 = false;
        field899.glDisable(3553);
        field921 = -1;
        field899.glTexEnvi(8960, 8704, 34160);
        field899.glTexEnvi(8960, 34161, 8448);
        field918 = 0;
        field899.glTexEnvi(8960, 34162, 8448);
        field885 = 0;
        field899.glEnable(2896);
        field899.glEnable(2912);
        field899.glEnable(2929);
        field890 = true;
        field884 = true;
        field879 = true;
        class289.method1986(-78);
        field899.glActiveTexture(33985);
        field899.glTexEnvi(8960, 8704, 34160);
        field899.glTexEnvi(8960, 34161, 8448);
        field899.glTexEnvi(8960, 34162, 8448);
        field899.glActiveTexture(33984);
        field899.setSwapInterval(0);
        field899.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field899.glShadeModel(7425);
        field899.glClearDepth(1.0D);
        field899.glDepthFunc(515);
        method482();
        field899.glMatrixMode(5890);
        field899.glLoadIdentity();
        field899.glPolygonMode(1028, 6914);
        field899.glEnable(2884);
        field899.glCullFace(1029);
        field899.glEnable(3042);
        field899.glBlendFunc(770, 771);
        field899.glEnable(3008);
        field899.glAlphaFunc(516, 0.0F);
        field899.glEnableClientState(32884);
        field899.glEnableClientState(32885);
        field917 = true;
        field899.glEnableClientState(32886);
        field899.glEnableClientState(32888);
        field899.glMatrixMode(5888);
        field899.glLoadIdentity();
        class139.method1012();
        class147.method1059();
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 118)
    public static final void method457(int arg0) {
        if (field885 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field899.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field899.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field899.glTexEnvi(8960, 34162, 260);
        }
        field885 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 134)
    public static final void method458(int arg0) {
        field899.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field899.glClear(16640);
        field899.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V", line = 148)
    public static final void method459(boolean arg0) {
        if (field884 == arg0) {
            return;
        }
        if (arg0) {
            field899.glEnable(2929);
        } else {
            field899.glDisable(2929);
        }
        field884 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V", line = 160)
    public static final void method460(boolean arg0) {
        if (field890 == arg0) {
            return;
        }
        if (arg0) {
            field899.glEnable(2896);
        } else {
            field899.glDisable(2896);
        }
        field890 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()V", line = 173)
    private static final void method461() {
        int[] var0 = new int[1];
        field899.glGenTextures(1, var0, 0);
        field876 = var0[0];
        field899.glBindTexture(3553, field876);
        field899.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class147.method1066();
        class127.method918(2);
        class40.method242();
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()V", line = 184)
    public static final void method462() {
        class123.method884(0, 0, 126);
        method463();
        method479(-1);
        method460(false);
        method459(false);
        method476(false);
        method477();
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()V", line = 196)
    private static final void method463() {
        if (field911) {
            return;
        }
        field899.glMatrixMode(5889);
        field899.glLoadIdentity();
        field899.glOrtho(0.0D, (double) field902, 0.0D, (double) field897, -1.0D, 1.0D);
        method480(0, 0, field902, field897);
        field899.glMatrixMode(5888);
        field899.glLoadIdentity();
        field911 = true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 219)
    private static final int method464(Canvas arg0, int arg1, GLContext arg2) {
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
            field893 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field893.setRealized(true);
            int var5 = 0;
            while (true) {
                field905 = field893.createContext(arg2);
                try {
                    int var6 = field905.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class186.method1304(10, 1000L);
            }
            field899 = field905.getGL();
            new GLU();
            field908 = true;
            field902 = arg0.getSize().width;
            field897 = arg0.getSize().height;
            int var8 = method472();
            if (var8 != 0) {
                method469();
                return var8;
            }
            method461();
            method456();
            field899.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field893.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method469();
                        return -3;
                    }
                    class186.method1304(10, 100L);
                }
            }
            field899.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method469();
            return -5;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIII)V", line = 306)
    public static final void method465(int arg0, int arg1, int arg2, int arg3) {
        method492(0, 0, field902, field897, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIII)V", line = 310)
    public static final void method466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field902 - arg0;
        int var8 = -arg1;
        int var9 = field897 - arg1;
        field899.glMatrixMode(5889);
        field899.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field899.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method480(0, 0, field902, field897);
        field899.glMatrixMode(5888);
        field899.glLoadIdentity();
        field899.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field911 = false;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "()V", line = 337)
    public static final void method467() {
        class123.method884(0, 0, -122);
        method463();
        method489(0);
        method457(0);
        method460(false);
        method459(false);
        method476(false);
        method477();
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "()V", line = 348)
    public static final void method468() {
        int[] var0 = new int[2];
        field899.glGetIntegerv(3073, var0, 0);
        field899.glGetIntegerv(3074, var0, 1);
        field899.glDrawBuffer(1026);
        field899.glReadBuffer(1024);
        method479(-1);
        field899.glPushAttrib(8192);
        field899.glDisable(2912);
        field899.glDisable(3042);
        field899.glDisable(2929);
        field899.glDisable(3008);
        field899.glRasterPos2i(0, 0);
        field899.glCopyPixels(0, 0, field902, field897, 6144);
        field899.glPopAttrib();
        field899.glDrawBuffer(var0[0]);
        field899.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "()V", line = 366)
    public static final void method469() {
        if (field899 != null) {
            try {
                class40.method251();
                class36.method205(0);
            } catch (Throwable var7) {
            }
            field899 = null;
        }
        if (field905 != null) {
            class180.method1245();
            try {
                if (GLContext.getCurrent() == field905) {
                    field905.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field905.destroy();
            } catch (Throwable var5) {
            }
            field905 = null;
        }
        if (field893 != null) {
            try {
                field893.setRealized(false);
            } catch (Throwable var4) {
            }
            field893 = null;
        }
        class147.method1070();
        field908 = false;
    }

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "()F", line = 419)
    public static final float method470() {
        return field877;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 422)
    public static final int method471(Canvas arg0, int arg1) {
        return method464(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "()I", line = 426)
    private static final int method472() {
        int var0 = 0;
        field898 = field899.glGetString(7936);
        field915 = field899.glGetString(7937);
        String var1 = field898.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field899.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field880 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field880 < 12) {
            var0 |= 0x2;
        }
        if (!field899.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field899.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field899.glGetIntegerv(34018, var7, 0);
        field881 = var7[0];
        field899.glGetIntegerv(34929, var7, 0);
        field919 = var7[0];
        field899.glGetIntegerv(34930, var7, 0);
        field922 = var7[0];
        if (field881 < 2 || field919 < 2 || field922 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field916 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field914 = field899.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field910 = field899.isExtensionAvailable("GL_ARB_multisample");
        field892 = field899.isExtensionAvailable("GL_ARB_texture_cube_map");
        field909 = field899.isExtensionAvailable("GL_ARB_vertex_program");
        field903 = field899.isExtensionAvailable("GL_EXT_framebuffer_object");
        field899.isExtensionAvailable("GL_ARB_vertex_shader");
        field883 = field899.isExtensionAvailable("GL_ARB_fragment_shader");
        field912 = field899.isExtensionAvailable("GL_EXT_texture3D");
        field923 = field899.isExtensionAvailable("GL_ARB_texture_rectangle");
        field907 = field899.isExtensionAvailable("GL_ARB_texture_float");
        String var8 = field915.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class159.method1150(var8.replace('/', ' '), (byte) -83, ' ');
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class239.method1642(10, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class239.method1642(10, var13.substring(0, 4))) {
                        var9 = class190.method1332(var13.substring(0, 4), (byte) 90);
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field914 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field912 = false;
            }
            if (var9 >= 9200 || var10) {
                field907 = false;
            }
            field906 = field914;
        }
        if (field914) {
            try {
                int[] var14 = new int[1];
                field899.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "()V", line = 558)
    private static final void method473() {
        field899.glViewport(field913 + field887, field894 + field891, field896, field920);
    }

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "()V", line = 569)
    public static void method474() {
        field915 = null;
        field898 = null;
        field899 = null;
        field893 = null;
        field905 = null;
        field895 = null;
    }

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "()V", line = 577)
    public static final void method475() {
        field899.glDepthMask(false);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V", line = 580)
    public static final void method476(boolean arg0) {
        if (field879 == arg0) {
            return;
        }
        if (arg0) {
            field899.glEnable(2912);
        } else {
            field899.glDisable(2912);
        }
        field879 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "()V", line = 592)
    public static final void method477() {
        if (field904) {
            field899.glMatrixMode(5890);
            field899.glLoadIdentity();
            field899.glMatrixMode(5888);
            field904 = false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 603)
    public static final void method478(Canvas arg0) {
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

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V", line = 629)
    public static final void method479(int arg0) {
        if (field921 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field899.glDisable(3553);
        } else {
            if (field921 == -1) {
                field899.glEnable(3553);
            }
            field899.glBindTexture(3553, arg0);
        }
        field921 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IIII)V", line = 646)
    private static final void method480(int arg0, int arg1, int arg2, int arg3) {
        field913 = arg0;
        field894 = arg1;
        field896 = arg2;
        field920 = arg3;
        method473();
    }

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "()V", line = 656)
    public static final void method481() {
        class123.method884(0, 0, -75);
        method463();
        method489(0);
        method457(0);
        method460(false);
        method459(false);
        method476(false);
        method477();
    }

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "()V", line = 671)
    public static final void method482() {
        field899.glDepthMask(true);
    }

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "()V", line = 675)
    public static final void method483() {
        if (class314.field4736) {
            method460(true);
            method484(true);
        } else {
            method460(false);
            method484(false);
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(Z)V", line = 692)
    private static final void method484(boolean arg0) {
        if (field917 == arg0) {
            return;
        }
        if (arg0) {
            field899.glEnableClientState(32885);
        } else {
            field899.glDisableClientState(32885);
        }
        field917 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "()F", line = 708)
    public static final float method485() {
        return field878;
    }

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "()I", line = 713)
    public static final int method486() {
        if (field903 && (field888 <= 0 || field889 != class180.field2413)) {
            int[] var0 = new int[1];
            field899.glGenFramebuffersEXT(1, var0, 0);
            field889 = class180.field2413;
            field888 = var0[0];
        }
        return field888;
    }

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "()V", line = 737)
    public static final void method487() {
        field899.glClear(256);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(F)V", line = 747)
    public static final void method488(float arg0) {
        method491(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V", line = 750)
    public static final void method489(int arg0) {
        if (field918 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field899.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field899.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field899.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field899.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field899.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field899.glTexEnvi(8960, 34161, 34165);
        }
        field918 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "()V", line = 780)
    public static final void method490() {
        try {
            field893.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(FF)V", line = 787)
    public static final void method491(float arg0, float arg1) {
        if (field911 || field877 == arg0 && field878 == arg1) {
            return;
        }
        field877 = arg0;
        field878 = arg1;
        if (arg1 == 0.0F) {
            field895[10] = field901;
            field895[14] = field882;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field882 * (1.0F - var2) / arg1;
            field895[10] = field901 + var4;
            field895[14] = field882 * var3;
        }
        field899.glMatrixMode(5889);
        field899.glLoadMatrixf(field895, 0);
        field899.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIFFII)V", line = 831)
    public static final void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field899.glMatrixMode(5889);
        field899.glLoadIdentity();
        method454((float) var10 * field886, (float) var11 * field886, (float) (-var13) * field886, (float) (-var12) * field886, 50.0F, 3584.0F);
        method480(arg0, field897 - arg1 - arg3, arg2, arg3);
        field899.glMatrixMode(5888);
        field899.glLoadIdentity();
        field899.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field899.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field899.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field911 = false;
        class313.field4731 = var10;
        class324.field4913 = var11;
        class99.field1344 = var12;
        class185.field2556 = var13;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 858)
    public static final void method493(int arg0, int arg1) {
        field902 = arg0;
        field897 = arg1;
        field911 = false;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V", line = 869)
    public static final void method494(int arg0, int arg1) {
        field887 = arg0;
        field891 = arg1;
        method473();
    }
}
