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
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class272 {

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public static int field4280 = 0;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "F")
    private static float field4278 = 0.09765625F;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Z")
    private static boolean field4283 = false;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    private static int field4279 = -1;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[F")
    private static float[] field4274 = new float[16];

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    private static int field4298 = -1;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Z")
    private static boolean field4289 = true;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "Z")
    private static boolean field4296 = true;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    private static int field4300 = 0;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "F")
    private static float field4305 = 0.0F;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "F")
    private static float field4308 = 0.0F;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    private static int field4312 = 0;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    private static int field4315 = -1;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "Z")
    public static boolean field4307 = true;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "Z")
    public static boolean field4317 = false;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Z")
    private static boolean field4281 = true;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "Z")
    private static boolean field4316 = false;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "F")
    private static float field4288;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "F")
    private static float field4292;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    private static int field4282;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    private static int field4284;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    private static int field4285;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    private static int field4286;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    private static int field4290;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    private static int field4294;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    private static int field4295;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Ljava/lang/String;")
    private static String field4277;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "Ljava/lang/String;")
    private static String field4314;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4310;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field4275;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4309;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
    public static boolean field4270;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Z")
    public static boolean field4272;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Z")
    public static boolean field4273;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Z")
    public static boolean field4276;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Z")
    public static boolean field4287;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Z")
    public static boolean field4291;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "Z")
    public static boolean field4293;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "Z")
    public static boolean field4299;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "Z")
    public static boolean field4302;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "Z")
    public static boolean field4304;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Z")
    public static boolean field4306;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "Z")
    public static boolean field4318;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V", line = 9)
    public static final void method1922() {
        field4310.glDepthMask(false);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()I", line = 15)
    private static final int method1923() {
        int var0 = 0;
        field4314 = field4310.glGetString(7936);
        field4277 = field4310.glGetString(7937);
        String var1 = field4314.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field4310.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field4290 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field4290 < 12) {
            var0 |= 0x2;
        }
        if (!field4310.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field4310.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field4310.glGetIntegerv(34018, var7, 0);
        field4297 = var7[0];
        field4310.glGetIntegerv(34929, var7, 0);
        field4295 = var7[0];
        field4310.glGetIntegerv(34930, var7, 0);
        field4294 = var7[0];
        if (field4297 < 2 || field4295 < 2 || field4294 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field4318 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field4302 = field4310.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field4306 = field4310.isExtensionAvailable("GL_ARB_multisample");
        field4299 = field4310.isExtensionAvailable("GL_ARB_texture_cube_map");
        field4276 = field4310.isExtensionAvailable("GL_ARB_vertex_program");
        field4270 = field4310.isExtensionAvailable("GL_EXT_framebuffer_object");
        field4310.isExtensionAvailable("GL_ARB_vertex_shader");
        field4304 = field4310.isExtensionAvailable("GL_ARB_fragment_shader");
        field4287 = field4310.isExtensionAvailable("GL_EXT_texture3D");
        field4273 = field4310.isExtensionAvailable("GL_ARB_texture_rectangle");
        field4291 = field4310.isExtensionAvailable("GL_ARB_texture_float");
        field4293 = true;
        String var8 = field4277.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class60.method369(' ', 1, var8.replace('/', ' '));
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class128.method875(var13.substring(1, 3), 0)) {
                        var10 = true;
                        break;
                    }
                    if (class128.method875(var13.substring(0, 4), 0)) {
                        var9 = class74.method467(-60, var13.substring(0, 4));
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field4302 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field4287 = false;
            }
            if (var9 >= 9200 || var10) {
                field4291 = false;
            }
            field4272 = field4302;
            field4293 = false;
        }
        if (field4302) {
            try {
                int[] var14 = new int[1];
                field4310.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(F)V", line = 147)
    public static final void method1924(float arg0) {
        method1936(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIFFII)V", line = 152)
    public static final void method1925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4310.glMatrixMode(5889);
        field4310.glLoadIdentity();
        method1951((float) var10 * field4278, (float) var11 * field4278, (float) (-var13) * field4278, (float) (-var12) * field4278, 50.0F, 3584.0F);
        method1958(arg0, field4311 - arg1 - arg3, arg2, arg3);
        field4310.glMatrixMode(5888);
        field4310.glLoadIdentity();
        field4310.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4310.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4310.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4316 = false;
        class212.field3212 = var10;
        class253.field4012 = var11;
        class73.field917 = var12;
        class76.field1003 = var13;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()V", line = 183)
    public static final void method1926() {
        if (field4283) {
            field4310.glMatrixMode(5890);
            field4310.glLoadIdentity();
            field4310.glMatrixMode(5888);
            field4283 = false;
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()V", line = 193)
    public static final void method1927() {
        field4310.glClear(256);
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "()V", line = 197)
    public static final void method1928() {
        try {
            field4309.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V", line = 204)
    public static final void method1929(int arg0, int arg1) {
        field4301 = arg0;
        field4311 = arg1;
        field4316 = false;
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "()V", line = 212)
    public static final void method1930() {
        class11.method69(-107, 0, 0);
        method1949();
        method1965(-1);
        method1941(false);
        method1934(false);
        method1940(false);
        method1926();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V", line = 225)
    private static final void method1931(boolean arg0) {
        if (field4307 == arg0) {
            return;
        }
        if (arg0) {
            field4310.glEnableClientState(32885);
        } else {
            field4310.glDisableClientState(32885);
        }
        field4307 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "g", descriptor = "()F", line = 239)
    public static final float method1932() {
        return field4305;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 242)
    public static final int method1933(Canvas arg0, int arg1) {
        return method1943(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V", line = 246)
    public static final void method1934(boolean arg0) {
        if (field4296 == arg0) {
            return;
        }
        if (arg0) {
            field4310.glEnable(2929);
        } else {
            field4310.glDisable(2929);
        }
        field4296 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V", line = 258)
    public static final void method1935(int arg0, int arg1, int arg2, int arg3) {
        field4310.glMatrixMode(5889);
        field4310.glLoadIdentity();
        field4310.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field4310.glMatrixMode(5888);
        field4310.glLoadIdentity();
        method1958(field4271, field4313, field4301, field4311);
        field4316 = false;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(FF)V", line = 267)
    public static final void method1936(float arg0, float arg1) {
        if (field4316 || field4305 == arg0 && field4308 == arg1) {
            return;
        }
        field4305 = arg0;
        field4308 = arg1;
        if (arg1 == 0.0F) {
            field4274[10] = field4288;
            field4274[14] = field4292;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4292 * (1.0F - var2) / arg1;
            field4274[10] = field4288 + var4;
            field4274[14] = field4292 * var3;
        }
        field4310.glMatrixMode(5889);
        field4310.glLoadMatrixf(field4274, 0);
        field4310.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 297)
    public static final void method1937(int arg0) {
        field4310.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4310.glClear(16384);
        field4310.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!le", name = "h", descriptor = "()V", line = 304)
    public static final void method1938() {
        if (class290.field4566) {
            method1941(true);
            method1931(true);
        } else {
            method1941(false);
            method1931(false);
        }
    }

    @OriginalMember(owner = "client!le", name = "i", descriptor = "()V", line = 325)
    public static final void method1939() {
        class11.method69(-108, 0, 0);
        method1949();
        method1961(1);
        method1947(1);
        method1941(false);
        method1934(false);
        method1940(false);
        method1926();
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(Z)V", line = 338)
    public static final void method1940(boolean arg0) {
        if (field4281 == arg0) {
            return;
        }
        if (arg0) {
            field4310.glEnable(2912);
        } else {
            field4310.glDisable(2912);
        }
        field4281 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(Z)V", line = 349)
    public static final void method1941(boolean arg0) {
        if (field4289 == arg0) {
            return;
        }
        if (arg0) {
            field4310.glEnable(2896);
        } else {
            field4310.glDisable(2896);
        }
        field4289 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "j", descriptor = "()V", line = 364)
    public static final void method1942() {
        field4310.glDepthMask(true);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 368)
    private static final int method1943(Canvas arg0, int arg1, GLContext arg2) {
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
            field4309 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field4309.setRealized(true);
            int var5 = 0;
            while (true) {
                field4275 = field4309.createContext(arg2);
                try {
                    int var6 = field4275.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class19.method140(1000L, 16711680);
            }
            field4310 = field4275.getGL();
            field4317 = true;
            field4301 = arg0.getSize().width;
            field4311 = arg0.getSize().height;
            int var8 = method1923();
            if (var8 != 0) {
                method1963();
                return var8;
            }
            method1950();
            method1952();
            field4310.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field4309.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method1963();
                        return -3;
                    }
                    class19.method140(100L, 16711680);
                }
            }
            field4310.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method1963();
            return -5;
        }
    }

    @OriginalMember(owner = "client!le", name = "k", descriptor = "()V", line = 451)
    public static final void method1944() {
        class11.method69(-126, 0, 0);
        method1949();
        method1961(0);
        method1947(0);
        method1941(false);
        method1934(false);
        method1940(false);
        method1926();
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V", line = 463)
    public static final void method1945(int arg0, int arg1) {
        field4271 = arg0;
        field4313 = arg1;
        method1955();
    }

    @OriginalMember(owner = "client!le", name = "l", descriptor = "()I", line = 470)
    public static final int method1946() {
        if (field4270 && (field4279 <= 0 || field4298 != class1.field3)) {
            int[] var0 = new int[1];
            field4310.glGenFramebuffersEXT(1, var0, 0);
            field4298 = class1.field3;
            field4279 = var0[0];
        }
        return field4279;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 484)
    public static final void method1947(int arg0) {
        if (field4312 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4310.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4310.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4310.glTexEnvi(8960, 34162, 260);
        }
        field4312 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)V", line = 500)
    public static final void method1948(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4301 - arg0;
        int var8 = -arg1;
        int var9 = field4311 - arg1;
        field4310.glMatrixMode(5889);
        field4310.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4310.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method1958(0, 0, field4301, field4311);
        field4310.glMatrixMode(5888);
        field4310.glLoadIdentity();
        field4310.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4316 = false;
    }

    @OriginalMember(owner = "client!le", name = "m", descriptor = "()V", line = 526)
    private static final void method1949() {
        if (field4316) {
            return;
        }
        field4310.glMatrixMode(5889);
        field4310.glLoadIdentity();
        field4310.glOrtho(0.0D, (double) field4301, 0.0D, (double) field4311, -1.0D, 1.0D);
        method1958(0, 0, field4301, field4311);
        field4310.glMatrixMode(5888);
        field4310.glLoadIdentity();
        field4316 = true;
    }

    @OriginalMember(owner = "client!le", name = "n", descriptor = "()V", line = 544)
    private static final void method1950() {
        int[] var0 = new int[1];
        field4310.glGenTextures(1, var0, 0);
        field4303 = var0[0];
        field4310.glBindTexture(3553, field4303);
        field4310.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class195.method1364();
        class250.method1781(-126);
        class152.method1114();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(FFFFFF)V", line = 555)
    private static final void method1951(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field4274[0] = var6 / (arg1 - arg0);
        field4274[1] = 0.0F;
        field4274[2] = 0.0F;
        field4274[3] = 0.0F;
        field4274[4] = 0.0F;
        field4274[5] = var6 / (arg3 - arg2);
        field4274[6] = 0.0F;
        field4274[7] = 0.0F;
        field4274[8] = (arg0 + arg1) / (arg1 - arg0);
        field4274[9] = (arg2 + arg3) / (arg3 - arg2);
        field4274[10] = field4288 = -(arg4 + arg5) / (arg5 - arg4);
        field4274[11] = -1.0F;
        field4274[12] = 0.0F;
        field4274[13] = 0.0F;
        field4274[14] = field4292 = -(arg5 * var6) / (arg5 - arg4);
        field4274[15] = 0.0F;
        field4310.glLoadMatrixf(field4274, 0);
        field4305 = 0.0F;
        field4308 = 0.0F;
    }

    @OriginalMember(owner = "client!le", name = "o", descriptor = "()V", line = 578)
    private static final void method1952() {
        field4316 = false;
        field4310.glDisable(3553);
        field4315 = -1;
        field4310.glTexEnvi(8960, 8704, 34160);
        field4310.glTexEnvi(8960, 34161, 8448);
        field4300 = 0;
        field4310.glTexEnvi(8960, 34162, 8448);
        field4312 = 0;
        field4310.glEnable(2896);
        field4310.glEnable(2912);
        field4310.glEnable(2929);
        field4289 = true;
        field4296 = true;
        field4281 = true;
        class100.method633(true);
        field4310.glActiveTexture(33985);
        field4310.glTexEnvi(8960, 8704, 34160);
        field4310.glTexEnvi(8960, 34161, 8448);
        field4310.glTexEnvi(8960, 34162, 8448);
        field4310.glActiveTexture(33984);
        field4310.setSwapInterval(0);
        field4310.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4310.glShadeModel(7425);
        field4310.glClearDepth(1.0F);
        field4310.glDepthFunc(515);
        method1942();
        field4310.glMatrixMode(5890);
        field4310.glLoadIdentity();
        field4310.glPolygonMode(1028, 6914);
        field4310.glEnable(2884);
        field4310.glCullFace(1029);
        field4310.glEnable(3042);
        field4310.glBlendFunc(770, 771);
        field4310.glEnable(3008);
        field4310.glAlphaFunc(516, 0.0F);
        field4310.glEnableClientState(32884);
        field4310.glEnableClientState(32885);
        field4307 = true;
        field4310.glEnableClientState(32886);
        field4310.glEnableClientState(32888);
        field4310.glMatrixMode(5888);
        field4310.glLoadIdentity();
        class26.method192();
        class195.method1368();
    }

    @OriginalMember(owner = "client!le", name = "p", descriptor = "()V", line = 629)
    public static final void method1953() {
        int[] var0 = new int[2];
        field4310.glGetIntegerv(3073, var0, 0);
        field4310.glGetIntegerv(3074, var0, 1);
        field4310.glDrawBuffer(1026);
        field4310.glReadBuffer(1024);
        method1965(-1);
        field4310.glPushAttrib(8192);
        field4310.glDisable(2912);
        field4310.glDisable(3042);
        field4310.glDisable(2929);
        field4310.glDisable(3008);
        field4310.glRasterPos2i(0, 0);
        field4310.glCopyPixels(0, 0, field4301, field4311, 6144);
        field4310.glPopAttrib();
        field4310.glDrawBuffer(var0[0]);
        field4310.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 649)
    public static final void method1954(Canvas arg0) {
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

    @OriginalMember(owner = "client!le", name = "q", descriptor = "()V", line = 669)
    private static final void method1955() {
        field4310.glViewport(field4284 + field4271, field4313 + field4282, field4286, field4285);
    }

    @OriginalMember(owner = "client!le", name = "r", descriptor = "()F", line = 687)
    public static final float method1956() {
        return field4308;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIII)V", line = 698)
    public static final void method1957(int arg0, int arg1, int arg2, int arg3) {
        method1925(0, 0, field4301, field4311, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(IIII)V", line = 702)
    private static final void method1958(int arg0, int arg1, int arg2, int arg3) {
        field4284 = arg0;
        field4282 = arg1;
        field4286 = arg2;
        field4285 = arg3;
        method1955();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(FFF)V", line = 709)
    public static final void method1959(float arg0, float arg1, float arg2) {
        field4310.glMatrixMode(5890);
        if (field4283) {
            field4310.glLoadIdentity();
        }
        field4310.glTranslatef(arg0, arg1, arg2);
        field4310.glMatrixMode(5888);
        field4283 = true;
    }

    @OriginalMember(owner = "client!le", name = "s", descriptor = "()V", line = 721)
    public static void method1960() {
        field4277 = null;
        field4314 = null;
        field4310 = null;
        field4309 = null;
        field4275 = null;
        field4274 = null;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 737)
    public static final void method1961(int arg0) {
        if (field4300 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4310.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4310.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4310.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4310.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4310.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4310.glTexEnvi(8960, 34161, 34165);
        }
        field4300 = arg0;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 770)
    public static final void method1962(int arg0) {
        field4310.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4310.glClear(16640);
        field4310.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!le", name = "t", descriptor = "()V", line = 779)
    public static final void method1963() {
        if (field4310 != null) {
            try {
                class152.method1109();
                class149.method1088(125);
            } catch (Throwable var7) {
            }
            field4310 = null;
        }
        if (field4275 != null) {
            class1.method2();
            try {
                if (GLContext.getCurrent() == field4275) {
                    field4275.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field4275.destroy();
            } catch (Throwable var5) {
            }
            field4275 = null;
        }
        if (field4309 != null) {
            try {
                field4309.setRealized(false);
            } catch (Throwable var4) {
            }
            field4309 = null;
        }
        class195.method1367();
        field4317 = false;
    }

    @OriginalMember(owner = "client!le", name = "u", descriptor = "()V", line = 826)
    public static final void method1964() {
        class11.method69(-98, 0, 0);
        method1949();
        method1961(0);
        method1947(0);
        method1941(false);
        method1934(false);
        method1940(false);
        method1926();
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 846)
    public static final void method1965(int arg0) {
        if (field4315 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4310.glDisable(3553);
        } else {
            if (field4315 == -1) {
                field4310.glEnable(3553);
            }
            field4310.glBindTexture(3553, arg0);
        }
        field4315 = arg0;
    }
}
