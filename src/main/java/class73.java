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

@OriginalClass("client!ei")
public class class73 {

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Z")
    private static boolean field1054 = false;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "Z")
    public static boolean field1059 = true;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    private static int field1055 = 0;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    private static int field1044 = -1;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "Z")
    public static boolean field1058 = false;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "[F")
    private static float[] field1063 = new float[16];

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "Z")
    private static boolean field1061 = true;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    private static int field1043 = 0;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "F")
    private static float field1048 = 0.0F;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "Z")
    private static boolean field1072 = true;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "Z")
    private static boolean field1082 = false;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "F")
    private static float field1077 = 0.09765625F;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "Z")
    private static boolean field1076 = true;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    private static int field1084 = -1;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field1071 = 0;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    private static int field1068 = -1;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "F")
    private static float field1079 = 0.0F;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "F")
    private static float field1038;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "F")
    private static float field1067;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    private static int field1053;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    private static int field1057;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    private static int field1062;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    private static int field1064;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    private static int field1073;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    private static int field1074;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    private static int field1081;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Ljava/lang/String;")
    private static String field1040;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Ljava/lang/String;")
    private static String field1050;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field1051;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field1052;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field1041;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Z")
    public static boolean field1039;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Z")
    public static boolean field1042;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "Z")
    public static boolean field1045;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "Z")
    public static boolean field1047;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "Z")
    public static boolean field1049;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "Z")
    public static boolean field1056;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "Z")
    public static boolean field1060;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "Z")
    public static boolean field1066;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "Z")
    public static boolean field1069;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "Z")
    public static boolean field1070;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "Z")
    public static boolean field1075;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()F", line = 12)
    public static final float method515() {
        return field1048;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()V", line = 15)
    public static final void method516() {
        class241.method1672(0, -125, 0);
        method540();
        method519(0);
        method548(0);
        method544(false);
        method558(false);
        method531(false);
        method552();
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()V", line = 26)
    public static final void method517() {
        field1051.glClear(256);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(FFF)V", line = 29)
    public static final void method518(float arg0, float arg1, float arg2) {
        field1051.glMatrixMode(5890);
        if (field1082) {
            field1051.glLoadIdentity();
        }
        field1051.glTranslatef(arg0, arg1, arg2);
        field1051.glMatrixMode(5888);
        field1082 = true;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 39)
    public static final void method519(int arg0) {
        if (field1043 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1051.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field1051.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field1051.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field1051.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field1051.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field1051.glTexEnvi(8960, 34161, 34165);
        }
        field1043 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 66)
    public static final void method520(int arg0) {
        field1051.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1051.glClear(16640);
        field1051.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 77)
    public static final void method521(Canvas arg0) {
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

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(F)V", line = 102)
    public static final void method522(float arg0) {
        method524(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "()V", line = 106)
    private static final void method523() {
        int[] var0 = new int[1];
        field1051.glGenTextures(1, var0, 0);
        field1083 = var0[0];
        field1051.glBindTexture(3553, field1083);
        field1051.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class315.method2154();
        class233.method1637(-108);
        class20.method159();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(FF)V", line = 118)
    public static final void method524(float arg0, float arg1) {
        if (field1054 || field1079 == arg0 && field1048 == arg1) {
            return;
        }
        field1079 = arg0;
        field1048 = arg1;
        if (arg1 == 0.0F) {
            field1063[10] = field1038;
            field1063[14] = field1067;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field1067 * (1.0F - var2) / arg1;
            field1063[10] = field1038 + var4;
            field1063[14] = field1067 * var3;
        }
        field1051.glMatrixMode(5889);
        field1051.glLoadMatrixf(field1063, 0);
        field1051.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "()V", line = 148)
    public static final void method525() {
        field1051.glDepthMask(true);
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "()V", line = 154)
    private static final void method526() {
        field1054 = false;
        field1051.glDisable(3553);
        field1084 = -1;
        field1051.glTexEnvi(8960, 8704, 34160);
        field1051.glTexEnvi(8960, 34161, 8448);
        field1043 = 0;
        field1051.glTexEnvi(8960, 34162, 8448);
        field1055 = 0;
        field1051.glEnable(2896);
        field1051.glEnable(2912);
        field1051.glEnable(2929);
        field1061 = true;
        field1072 = true;
        field1076 = true;
        class227.method1610(7);
        field1051.glActiveTexture(33985);
        field1051.glTexEnvi(8960, 8704, 34160);
        field1051.glTexEnvi(8960, 34161, 8448);
        field1051.glTexEnvi(8960, 34162, 8448);
        field1051.glActiveTexture(33984);
        field1051.setSwapInterval(0);
        field1051.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field1051.glShadeModel(7425);
        field1051.glClearDepth(1.0D);
        field1051.glDepthFunc(515);
        method525();
        field1051.glMatrixMode(5890);
        field1051.glLoadIdentity();
        field1051.glPolygonMode(1028, 6914);
        field1051.glEnable(2884);
        field1051.glCullFace(1029);
        field1051.glEnable(3042);
        field1051.glBlendFunc(770, 771);
        field1051.glEnable(3008);
        field1051.glAlphaFunc(516, 0.0F);
        field1051.glEnableClientState(32884);
        field1051.glEnableClientState(32885);
        field1059 = true;
        field1051.glEnableClientState(32886);
        field1051.glEnableClientState(32888);
        field1051.glMatrixMode(5888);
        field1051.glLoadIdentity();
        class179.method1341();
        class315.method2152();
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "()V", line = 206)
    public static void method527() {
        field1040 = null;
        field1050 = null;
        field1051 = null;
        field1041 = null;
        field1052 = null;
        field1063 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 214)
    public static final int method528(Canvas arg0, int arg1) {
        return method530(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "()F", line = 217)
    public static final float method529() {
        return field1079;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 221)
    private static final int method530(Canvas arg0, int arg1, GLContext arg2) {
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
            field1041 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field1041.setRealized(true);
            int var5 = 0;
            while (true) {
                field1052 = field1041.createContext(arg2);
                try {
                    int var6 = field1052.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class324.method2252(-24861, 1000L);
            }
            field1051 = field1052.getGL();
            new GLU();
            field1058 = true;
            field1037 = arg0.getSize().width;
            field1080 = arg0.getSize().height;
            int var8 = method546();
            if (var8 != 0) {
                method542();
                return var8;
            }
            method523();
            method526();
            field1051.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field1041.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method542();
                        return -3;
                    }
                    class324.method2252(-24861, 100L);
                }
            }
            field1051.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method542();
            return -5;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 309)
    public static final void method531(boolean arg0) {
        if (field1076 == arg0) {
            return;
        }
        if (arg0) {
            field1051.glEnable(2912);
        } else {
            field1051.glDisable(2912);
        }
        field1076 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)V", line = 322)
    private static final void method532(int arg0, int arg1, int arg2, int arg3) {
        field1053 = arg0;
        field1062 = arg1;
        field1064 = arg2;
        field1073 = arg3;
        method536();
    }

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "()V", line = 330)
    public static final void method533() {
        class241.method1672(0, -125, 0);
        method540();
        method519(0);
        method548(0);
        method544(false);
        method558(false);
        method531(false);
        method552();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V", line = 342)
    public static final void method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field1037 - arg0;
        int var8 = -arg1;
        int var9 = field1080 - arg1;
        field1051.glMatrixMode(5889);
        field1051.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field1051.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method532(0, 0, field1037, field1080);
        field1051.glMatrixMode(5888);
        field1051.glLoadIdentity();
        field1051.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field1054 = false;
    }

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "()I", line = 366)
    public static final int method535() {
        if (field1039 && (field1068 <= 0 || class80.field1183 != field1044)) {
            int[] var0 = new int[1];
            field1051.glGenFramebuffersEXT(1, var0, 0);
            field1044 = class80.field1183;
            field1068 = var0[0];
        }
        return field1068;
    }

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "()V", line = 382)
    private static final void method536() {
        field1051.glViewport(field1065 + field1053, field1078 + field1062, field1064, field1073);
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V", line = 385)
    public static final void method537(int arg0) {
        if (field1084 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field1051.glDisable(3553);
        } else {
            if (field1084 == -1) {
                field1051.glEnable(3553);
            }
            field1051.glBindTexture(3553, arg0);
        }
        field1084 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "()V", line = 405)
    public static final void method538() {
        field1051.glDepthMask(false);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIII)V", line = 408)
    public static final void method539(int arg0, int arg1, int arg2, int arg3) {
        method554(0, 0, field1037, field1080, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "()V", line = 412)
    private static final void method540() {
        if (field1054) {
            return;
        }
        field1051.glMatrixMode(5889);
        field1051.glLoadIdentity();
        field1051.glOrtho(0.0D, (double) field1037, 0.0D, (double) field1080, -1.0D, 1.0D);
        method532(0, 0, field1037, field1080);
        field1051.glMatrixMode(5888);
        field1051.glLoadIdentity();
        field1054 = true;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(IIII)V", line = 432)
    public static final void method541(int arg0, int arg1, int arg2, int arg3) {
        field1051.glMatrixMode(5889);
        field1051.glLoadIdentity();
        field1051.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field1051.glMatrixMode(5888);
        field1051.glLoadIdentity();
        method532(field1065, field1078, field1037, field1080);
        field1054 = false;
    }

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "()V", line = 445)
    public static final void method542() {
        if (field1051 != null) {
            try {
                class20.method157();
                class220.method1565(113);
            } catch (Throwable var7) {
            }
            field1051 = null;
        }
        if (field1052 != null) {
            class80.method617();
            try {
                if (GLContext.getCurrent() == field1052) {
                    field1052.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field1052.destroy();
            } catch (Throwable var5) {
            }
            field1052 = null;
        }
        if (field1041 != null) {
            try {
                field1041.setRealized(false);
            } catch (Throwable var4) {
            }
            field1041 = null;
        }
        class315.method2158();
        field1058 = false;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 494)
    public static final void method543(int arg0, int arg1) {
        field1065 = arg0;
        field1078 = arg1;
        method536();
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V", line = 500)
    public static final void method544(boolean arg0) {
        if (field1061 == arg0) {
            return;
        }
        if (arg0) {
            field1051.glEnable(2896);
        } else {
            field1051.glDisable(2896);
        }
        field1061 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "()V", line = 512)
    public static final void method545() {
        try {
            field1041.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "()I", line = 524)
    private static final int method546() {
        int var0 = 0;
        field1050 = field1051.glGetString(7936);
        field1040 = field1051.glGetString(7937);
        String var1 = field1050.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field1051.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field1081 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field1081 < 12) {
            var0 |= 0x2;
        }
        if (!field1051.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field1051.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field1051.glGetIntegerv(34018, var7, 0);
        field1046 = var7[0];
        field1051.glGetIntegerv(34929, var7, 0);
        field1057 = var7[0];
        field1051.glGetIntegerv(34930, var7, 0);
        field1074 = var7[0];
        if (field1046 < 2 || field1057 < 2 || field1074 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field1075 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field1066 = field1051.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field1042 = field1051.isExtensionAvailable("GL_ARB_multisample");
        field1070 = field1051.isExtensionAvailable("GL_ARB_texture_cube_map");
        field1049 = field1051.isExtensionAvailable("GL_ARB_vertex_program");
        field1039 = field1051.isExtensionAvailable("GL_EXT_framebuffer_object");
        field1051.isExtensionAvailable("GL_ARB_vertex_shader");
        field1069 = field1051.isExtensionAvailable("GL_ARB_fragment_shader");
        field1045 = field1051.isExtensionAvailable("GL_EXT_texture3D");
        field1060 = field1051.isExtensionAvailable("GL_ARB_texture_rectangle");
        field1047 = field1051.isExtensionAvailable("GL_ARB_texture_float");
        String var8 = field1040.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class32.method250(' ', 0, var8.replace('/', ' '));
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class139.method1046(var13.substring(1, 3), (byte) -41)) {
                        var10 = true;
                        break;
                    }
                    if (class139.method1046(var13.substring(0, 4), (byte) -41)) {
                        var9 = class129.method990(var13.substring(0, 4), 44);
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field1066 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field1045 = false;
            }
            if (var9 >= 9200 || var10) {
                field1047 = false;
            }
            field1056 = field1066;
        }
        if (field1066) {
            try {
                int[] var14 = new int[1];
                field1051.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(Z)V", line = 656)
    private static final void method547(boolean arg0) {
        if (field1059 == arg0) {
            return;
        }
        if (arg0) {
            field1051.glEnableClientState(32885);
        } else {
            field1051.glDisableClientState(32885);
        }
        field1059 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V", line = 670)
    public static final void method548(int arg0) {
        if (field1055 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1051.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field1051.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field1051.glTexEnvi(8960, 34162, 260);
        }
        field1055 = arg0;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(FFFFFF)V", line = 693)
    private static final void method549(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field1063[0] = var6 / (arg1 - arg0);
        field1063[1] = 0.0F;
        field1063[2] = 0.0F;
        field1063[3] = 0.0F;
        field1063[4] = 0.0F;
        field1063[5] = var6 / (arg3 - arg2);
        field1063[6] = 0.0F;
        field1063[7] = 0.0F;
        field1063[8] = (arg0 + arg1) / (arg1 - arg0);
        field1063[9] = (arg2 + arg3) / (arg3 - arg2);
        field1063[10] = field1038 = -(arg4 + arg5) / (arg5 - arg4);
        field1063[11] = -1.0F;
        field1063[12] = 0.0F;
        field1063[13] = 0.0F;
        field1063[14] = field1067 = -(arg5 * var6) / (arg5 - arg4);
        field1063[15] = 0.0F;
        field1051.glLoadMatrixf(field1063, 0);
        field1079 = 0.0F;
        field1048 = 0.0F;
    }

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "()V", line = 721)
    public static final void method550() {
        if (class309.field4812) {
            method544(true);
            method547(true);
        } else {
            method544(false);
            method547(false);
        }
    }

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "()V", line = 736)
    public static final void method551() {
        int[] var0 = new int[2];
        field1051.glGetIntegerv(3073, var0, 0);
        field1051.glGetIntegerv(3074, var0, 1);
        field1051.glDrawBuffer(1026);
        field1051.glReadBuffer(1024);
        method537(-1);
        field1051.glPushAttrib(8192);
        field1051.glDisable(2912);
        field1051.glDisable(3042);
        field1051.glDisable(2929);
        field1051.glDisable(3008);
        field1051.glRasterPos2i(0, 0);
        field1051.glCopyPixels(0, 0, field1037, field1080, 6144);
        field1051.glPopAttrib();
        field1051.glDrawBuffer(var0[0]);
        field1051.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "()V", line = 756)
    public static final void method552() {
        if (field1082) {
            field1051.glMatrixMode(5890);
            field1051.glLoadIdentity();
            field1051.glMatrixMode(5888);
            field1082 = false;
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V", line = 766)
    public static final void method553(int arg0) {
        field1051.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1051.glClear(16384);
        field1051.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIFFII)V", line = 779)
    public static final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field1051.glMatrixMode(5889);
        field1051.glLoadIdentity();
        method549((float) var10 * field1077, (float) var11 * field1077, (float) (-var13) * field1077, (float) (-var12) * field1077, 50.0F, 3584.0F);
        method532(arg0, field1080 - arg1 - arg3, arg2, arg3);
        field1051.glMatrixMode(5888);
        field1051.glLoadIdentity();
        field1051.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field1051.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field1051.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field1054 = false;
        class250.field3768 = var10;
        class231.field3524 = var11;
        class38.field565 = var12;
        class201.field3100 = var13;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V", line = 814)
    public static final void method555(int arg0, int arg1) {
        field1037 = arg0;
        field1080 = arg1;
        field1054 = false;
    }

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "()V", line = 822)
    public static final void method556() {
        class241.method1672(0, -125, 0);
        method540();
        method537(-1);
        method544(false);
        method558(false);
        method531(false);
        method552();
    }

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "()V", line = 835)
    public static final void method557() {
        class241.method1672(0, -125, 0);
        method540();
        method519(1);
        method548(1);
        method544(false);
        method558(false);
        method531(false);
        method552();
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(Z)V", line = 866)
    public static final void method558(boolean arg0) {
        if (field1072 == arg0) {
            return;
        }
        if (arg0) {
            field1051.glEnable(2929);
        } else {
            field1051.glDisable(2929);
        }
        field1072 = arg0;
    }
}
