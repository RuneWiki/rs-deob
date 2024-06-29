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

@OriginalClass("client!jl")
public class class265 {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    private static int field4097 = 0;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "F")
    private static float field4121 = 0.0F;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Z")
    private static boolean field4096 = true;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    private static int field4119 = -1;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field4118 = 0;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "F")
    private static float field4122 = 0.0F;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "Z")
    private static boolean field4120 = false;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "Z")
    private static boolean field4124 = true;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "Z")
    public static boolean field4126 = false;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "Z")
    private static boolean field4127 = true;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Z")
    public static boolean field4108 = true;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "F")
    private static float field4130 = 0.09765625F;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    private static int field4103 = 0;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "Z")
    private static boolean field4123 = false;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "[F")
    private static float[] field4128 = new float[16];

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "F")
    private static float field4104;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "F")
    private static float field4113;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    private static int field4102;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    private static int field4112;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    private static int field4125;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Ljava/lang/String;")
    private static String field4100;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "Ljava/lang/String;")
    private static String field4107;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4099;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field4115;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4098;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Z")
    public static boolean field4105;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Z")
    public static boolean field4106;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "Z")
    public static boolean field4109;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "Z")
    public static boolean field4111;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "Z")
    public static boolean field4114;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "Z")
    public static boolean field4117;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "Z")
    public static boolean field4129;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)V", line = 10)
    public static final void method1880(int arg0, int arg1, int arg2, int arg3) {
        method1895(0, 0, field4095, field4101, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(FF)V", line = 13)
    public static final void method1881(float arg0, float arg1) {
        if (field4123 || field4122 == arg0 && field4121 == arg1) {
            return;
        }
        field4122 = arg0;
        field4121 = arg1;
        if (arg1 == 0.0F) {
            field4128[10] = field4104;
            field4128[14] = field4113;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4113 * (1.0F - var2) / arg1;
            field4128[10] = field4104 + var4;
            field4128[14] = field4113 * var3;
        }
        field4099.glMatrixMode(5889);
        field4099.glLoadMatrixf(field4128, 0);
        field4099.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 43)
    public static final void method1882(int arg0, int arg1) {
        field4095 = arg0;
        field4101 = arg1;
        field4123 = false;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()V", line = 48)
    public static final void method1883() {
        if (field4099 != null) {
            try {
                class270.method1946(20);
            } catch (Throwable var7) {
            }
            field4099 = null;
        }
        if (field4115 != null) {
            class214.method1552();
            try {
                if (GLContext.getCurrent() == field4115) {
                    field4115.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field4115.destroy();
            } catch (Throwable var5) {
            }
            field4115 = null;
        }
        if (field4098 != null) {
            try {
                field4098.setRealized(false);
            } catch (Throwable var4) {
            }
            field4098 = null;
        }
        class38.method318();
        field4126 = false;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()V", line = 101)
    public static void method1884() {
        field4107 = null;
        field4100 = null;
        field4099 = null;
        field4098 = null;
        field4115 = null;
        field4128 = null;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "()V", line = 110)
    private static final void method1885() {
        int[] var0 = new int[1];
        field4099.glGenTextures(1, var0, 0);
        field4110 = var0[0];
        field4099.glBindTexture(3553, field4110);
        field4099.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class38.method319();
        class98.method713((byte) -47);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 122)
    public static final int method1886(Canvas arg0, int arg1) {
        try {
            if (!arg0.isDisplayable()) {
                return -1;
            }
            GLCapabilities var2 = new GLCapabilities();
            if (arg1 > 0) {
                var2.setSampleBuffers(true);
                var2.setNumSamples(arg1);
            }
            GLDrawableFactory var3 = GLDrawableFactory.getFactory();
            field4098 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field4098.setRealized(true);
            int var4 = 0;
            while (true) {
                field4115 = field4098.createContext((GLContext) null);
                try {
                    int var5 = field4115.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class279.method1991(103, 1000L);
            }
            field4099 = field4115.getGL();
            new GLU();
            field4126 = true;
            field4095 = arg0.getSize().width;
            field4101 = arg0.getSize().height;
            int var7 = method1909();
            if (var7 != 0) {
                method1883();
                return var7;
            }
            method1885();
            method1916();
            field4099.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field4098.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1883();
                        return -3;
                    }
                    class279.method1991(106, 100L);
                }
            }
            field4099.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1883();
            return -5;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "()V", line = 207)
    public static final void method1887() {
        class308.method2132(0, (byte) -28, 0);
        method1900();
        method1889(-1);
        method1892(false);
        method1905(false);
        method1904(false);
        method1910();
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "()V", line = 218)
    public static final void method1888() {
        int[] var0 = new int[2];
        field4099.glGetIntegerv(3073, var0, 0);
        field4099.glGetIntegerv(3074, var0, 1);
        field4099.glDrawBuffer(1026);
        field4099.glReadBuffer(1024);
        method1889(-1);
        field4099.glPushAttrib(8192);
        field4099.glDisable(2912);
        field4099.glDisable(3042);
        field4099.glDisable(2929);
        field4099.glDisable(3008);
        field4099.glRasterPos2i(0, 0);
        field4099.glCopyPixels(0, 0, field4095, field4101, 6144);
        field4099.glPopAttrib();
        field4099.glDrawBuffer(var0[0]);
        field4099.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 238)
    public static final void method1889(int arg0) {
        if (field4119 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4099.glDisable(3553);
        } else {
            if (field4119 == -1) {
                field4099.glEnable(3553);
            }
            field4099.glBindTexture(3553, arg0);
        }
        field4119 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "()V", line = 263)
    public static final void method1890() {
        class308.method2132(0, (byte) -28, 0);
        method1900();
        method1899(0);
        method1898(0);
        method1892(false);
        method1905(false);
        method1904(false);
        method1910();
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(FFFFFF)V", line = 275)
    private static final void method1891(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field4128[0] = var6 / (arg1 - arg0);
        field4128[1] = 0.0F;
        field4128[2] = 0.0F;
        field4128[3] = 0.0F;
        field4128[4] = 0.0F;
        field4128[5] = var6 / (arg3 - arg2);
        field4128[6] = 0.0F;
        field4128[7] = 0.0F;
        field4128[8] = (arg0 + arg1) / (arg1 - arg0);
        field4128[9] = (arg2 + arg3) / (arg3 - arg2);
        field4128[10] = field4104 = -(arg4 + arg5) / (arg5 - arg4);
        field4128[11] = -1.0F;
        field4128[12] = 0.0F;
        field4128[13] = 0.0F;
        field4128[14] = field4113 = -(arg5 * var6) / (arg5 - arg4);
        field4128[15] = 0.0F;
        field4099.glLoadMatrixf(field4128, 0);
        field4122 = 0.0F;
        field4121 = 0.0F;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 299)
    public static final void method1892(boolean arg0) {
        if (field4127 == arg0) {
            return;
        }
        if (arg0) {
            field4099.glEnable(2896);
        } else {
            field4099.glDisable(2896);
        }
        field4127 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "()V", line = 310)
    public static final void method1893() {
        if (class302.field4753) {
            method1892(true);
            method1894(true);
        } else {
            method1892(false);
            method1894(false);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V", line = 326)
    private static final void method1894(boolean arg0) {
        if (field4108 == arg0) {
            return;
        }
        if (arg0) {
            field4099.glEnableClientState(32885);
        } else {
            field4099.glDisableClientState(32885);
        }
        field4108 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIIFFII)V", line = 342)
    public static final void method1895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4099.glMatrixMode(5889);
        field4099.glLoadIdentity();
        method1891((float) var10 * field4130, (float) var11 * field4130, (float) (-var13) * field4130, (float) (-var12) * field4130, 50.0F, 3584.0F);
        field4099.glViewport(arg0, field4101 - arg1 - arg3, arg2, arg3);
        field4099.glMatrixMode(5888);
        field4099.glLoadIdentity();
        field4099.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4099.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4099.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4123 = false;
        class328.field5079 = var10;
        class190.field3029 = var11;
        class96.field1577 = var12;
        class116.field1891 = var13;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 369)
    public static final void method1896(int arg0) {
        field4099.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4099.glClear(16640);
        field4099.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "()V", line = 377)
    public static final void method1897() {
        field4099.glDepthMask(true);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 381)
    public static final void method1898(int arg0) {
        if (field4103 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4099.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4099.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4099.glTexEnvi(8960, 34162, 260);
        }
        field4103 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 397)
    public static final void method1899(int arg0) {
        if (field4097 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4099.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4099.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4099.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4099.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4099.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4099.glTexEnvi(8960, 34161, 34165);
        }
        field4097 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "()V", line = 424)
    private static final void method1900() {
        if (field4123) {
            return;
        }
        field4099.glMatrixMode(5889);
        field4099.glLoadIdentity();
        field4099.glOrtho(0.0D, (double) field4095, 0.0D, (double) field4101, -1.0D, 1.0D);
        field4099.glViewport(0, 0, field4095, field4101);
        field4099.glMatrixMode(5888);
        field4099.glLoadIdentity();
        field4123 = true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIII)V", line = 438)
    public static final void method1901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4095 - arg0;
        int var8 = -arg1;
        int var9 = field4101 - arg1;
        field4099.glMatrixMode(5889);
        field4099.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4099.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field4099.glViewport(0, 0, field4095, field4101);
        field4099.glMatrixMode(5888);
        field4099.glLoadIdentity();
        field4099.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4123 = false;
    }

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "()F", line = 461)
    public static final float method1902() {
        return field4121;
    }

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "()V", line = 465)
    public static final void method1903() {
        class308.method2132(0, (byte) -28, 0);
        method1900();
        method1899(1);
        method1898(1);
        method1892(false);
        method1905(false);
        method1904(false);
        method1910();
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(Z)V", line = 476)
    public static final void method1904(boolean arg0) {
        if (field4124 == arg0) {
            return;
        }
        if (arg0) {
            field4099.glEnable(2912);
        } else {
            field4099.glDisable(2912);
        }
        field4124 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(Z)V", line = 494)
    public static final void method1905(boolean arg0) {
        if (field4096 == arg0) {
            return;
        }
        if (arg0) {
            field4099.glEnable(2929);
        } else {
            field4099.glDisable(2929);
        }
        field4096 = arg0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(FFF)V", line = 506)
    public static final void method1906(float arg0, float arg1, float arg2) {
        field4099.glMatrixMode(5890);
        if (field4120) {
            field4099.glLoadIdentity();
        }
        field4099.glTranslatef(arg0, arg1, arg2);
        field4099.glMatrixMode(5888);
        field4120 = true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(F)V", line = 516)
    public static final void method1907(float arg0) {
        method1881(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "()V", line = 520)
    public static final void method1908() {
        field4099.glDepthMask(false);
    }

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "()I", line = 524)
    private static final int method1909() {
        int var0 = 0;
        field4100 = field4099.glGetString(7936);
        field4107 = field4099.glGetString(7937);
        String var1 = field4100.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field4099.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field4125 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field4125 < 12) {
            var0 |= 0x2;
        }
        if (!field4099.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field4099.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field4099.glGetIntegerv(34018, var7, 0);
        field4116 = var7[0];
        field4099.glGetIntegerv(34929, var7, 0);
        field4112 = var7[0];
        field4099.glGetIntegerv(34930, var7, 0);
        field4102 = var7[0];
        if (field4116 < 2 || field4112 < 2 || field4102 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field4109 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field4111 = field4099.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field4106 = field4099.isExtensionAvailable("GL_ARB_multisample");
        field4114 = field4099.isExtensionAvailable("GL_ARB_texture_cube_map");
        field4129 = field4099.isExtensionAvailable("GL_ARB_vertex_program");
        field4105 = field4099.isExtensionAvailable("GL_EXT_texture3D");
        String var8 = field4107.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            String[] var10 = class326.method2240(-103, var8.replace('/', ' '), ' ');
            for (int var11 = 0; var11 < var10.length; var11++) {
                String var12 = var10[var11];
                if (var12.length() >= 4 && class310.method2147(var12.substring(0, 4), (byte) -118)) {
                    var9 = class294.method2067(var12.substring(0, 4), (byte) -67);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field4111 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field4105 = false;
            }
            field4117 = field4111;
        }
        if (field4111) {
            try {
                int[] var13 = new int[1];
                field4099.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "()V", line = 654)
    public static final void method1910() {
        if (field4120) {
            field4099.glMatrixMode(5890);
            field4099.glLoadIdentity();
            field4099.glMatrixMode(5888);
            field4120 = false;
        }
    }

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "()F", line = 677)
    public static final float method1911() {
        return field4122;
    }

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "()V", line = 684)
    public static final void method1912() {
        try {
            field4098.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "()V", line = 695)
    public static final void method1913() {
        class308.method2132(0, (byte) -28, 0);
        method1900();
        method1899(0);
        method1898(0);
        method1892(false);
        method1905(false);
        method1904(false);
        method1910();
    }

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "()V", line = 706)
    public static final void method1914() {
        field4099.glClear(256);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 713)
    public static final void method1915(Canvas arg0) {
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

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "()V", line = 736)
    private static final void method1916() {
        field4123 = false;
        field4099.glDisable(3553);
        field4119 = -1;
        field4099.glTexEnvi(8960, 8704, 34160);
        field4099.glTexEnvi(8960, 34161, 8448);
        field4097 = 0;
        field4099.glTexEnvi(8960, 34162, 8448);
        field4103 = 0;
        field4099.glEnable(2896);
        field4099.glEnable(2912);
        field4099.glEnable(2929);
        field4127 = true;
        field4096 = true;
        field4124 = true;
        class269.method1938((byte) -99);
        field4099.glActiveTexture(33985);
        field4099.glTexEnvi(8960, 8704, 34160);
        field4099.glTexEnvi(8960, 34161, 8448);
        field4099.glTexEnvi(8960, 34162, 8448);
        field4099.glActiveTexture(33984);
        field4099.setSwapInterval(0);
        field4099.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4099.glShadeModel(7425);
        field4099.glClearDepth(1.0D);
        field4099.glDepthFunc(515);
        method1897();
        field4099.glMatrixMode(5890);
        field4099.glLoadIdentity();
        field4099.glPolygonMode(1028, 6914);
        field4099.glEnable(2884);
        field4099.glCullFace(1029);
        field4099.glEnable(3042);
        field4099.glBlendFunc(770, 771);
        field4099.glEnable(3008);
        field4099.glAlphaFunc(516, 0.0F);
        field4099.glEnableClientState(32884);
        field4099.glEnableClientState(32885);
        field4108 = true;
        field4099.glEnableClientState(32886);
        field4099.glEnableClientState(32888);
        field4099.glMatrixMode(5888);
        field4099.glLoadIdentity();
        class97.method710();
        class38.method307();
    }
}
