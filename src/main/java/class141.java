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

@OriginalClass("client!un")
public class class141 {

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    private static int field2019 = 0;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "Z")
    private static boolean field2020 = true;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "[F")
    private static float[] field2011 = new float[16];

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    private static int field2009 = -1;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Z")
    private static boolean field2010 = true;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "F")
    private static float field2018 = 0.09765625F;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    private static int field2033 = -1;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "Z")
    private static boolean field2027 = false;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "Z")
    public static boolean field2031 = false;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "F")
    private static float field2043 = 0.0F;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    private static int field2026 = -1;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Z")
    private static boolean field2016 = false;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    private static int field2014 = 0;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "Z")
    private static boolean field2034 = true;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "F")
    private static float field2048 = 0.0F;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field2045 = 0;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "Z")
    public static boolean field2051 = true;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "F")
    private static float field2039;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "F")
    private static float field2052;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    private static int field2015;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    private static int field2035;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    private static int field2038;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    private static int field2040;

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    private static int field2046;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "I")
    private static int field2053;

    @OriginalMember(owner = "client!un", name = "T", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!un", name = "U", descriptor = "I")
    private static int field2055;

    @OriginalMember(owner = "client!un", name = "W", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "Ljava/lang/String;")
    private static String field2021;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "Ljava/lang/String;")
    private static String field2023;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field2025;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field2036;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field2029;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Z")
    public static boolean field2012;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "Z")
    public static boolean field2013;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "Z")
    public static boolean field2017;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Z")
    public static boolean field2022;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "Z")
    public static boolean field2024;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "Z")
    public static boolean field2032;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "Z")
    public static boolean field2037;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "Z")
    public static boolean field2042;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "Z")
    public static boolean field2047;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "Z")
    public static boolean field2049;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "Z")
    public static boolean field2050;

    @OriginalMember(owner = "client!un", name = "V", descriptor = "Z")
    public static boolean field2056;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(FF)V", line = 10)
    public static final void method981(float arg0, float arg1) {
        if (field2027 || field2048 == arg0 && field2043 == arg1) {
            return;
        }
        field2048 = arg0;
        field2043 = arg1;
        if (arg1 == 0.0F) {
            field2011[10] = field2052;
            field2011[14] = field2039;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field2039 * (1.0F - var2) / arg1;
            field2011[10] = field2052 + var4;
            field2011[14] = field2039 * var3;
        }
        field2025.glMatrixMode(5889);
        field2025.glLoadMatrixf(field2011, 0);
        field2025.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V", line = 42)
    public static final void method982(boolean arg0) {
        if (field2010 == arg0) {
            return;
        }
        if (arg0) {
            field2025.glEnable(2929);
        } else {
            field2025.glDisable(2929);
        }
        field2010 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "()V", line = 54)
    public static final void method983() {
        if (class98.field1379) {
            method1021(true);
            method1022(true);
        } else {
            method1021(false);
            method1022(false);
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "()V", line = 69)
    public static final void method984() {
        try {
            field2029.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "()V", line = 78)
    private static final void method985() {
        field2027 = false;
        field2025.glDisable(3553);
        field2009 = -1;
        field2025.glTexEnvi(8960, 8704, 34160);
        field2025.glTexEnvi(8960, 34161, 8448);
        field2019 = 0;
        field2025.glTexEnvi(8960, 34162, 8448);
        field2014 = 0;
        field2025.glEnable(2896);
        field2025.glEnable(2912);
        field2025.glEnable(2929);
        field2020 = true;
        field2010 = true;
        field2034 = true;
        class284.method2058(-105);
        field2025.glActiveTexture(33985);
        field2025.glTexEnvi(8960, 8704, 34160);
        field2025.glTexEnvi(8960, 34161, 8448);
        field2025.glTexEnvi(8960, 34162, 8448);
        field2025.glActiveTexture(33984);
        field2025.setSwapInterval(0);
        field2025.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field2025.glShadeModel(7425);
        field2025.glClearDepth(1.0F);
        field2025.glDepthFunc(515);
        method1023();
        field2025.glMatrixMode(5890);
        field2025.glLoadIdentity();
        field2025.glPolygonMode(1028, 6914);
        field2025.glEnable(2884);
        field2025.glCullFace(1029);
        field2025.glEnable(3042);
        field2025.glBlendFunc(770, 771);
        field2025.glEnable(3008);
        field2025.glAlphaFunc(516, 0.0F);
        field2025.glEnableClientState(32884);
        field2025.glEnableClientState(32885);
        field2051 = true;
        field2025.glEnableClientState(32886);
        field2025.glEnableClientState(32888);
        field2025.glMatrixMode(5888);
        field2025.glLoadIdentity();
        class222.method1626();
        class268.method1984();
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 127)
    public static final void method986(int arg0) {
        if (field2019 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2025.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field2025.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field2025.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field2025.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field2025.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field2025.glTexEnvi(8960, 34161, 34165);
        }
        field2019 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "()V", line = 155)
    public static final void method987() {
        if (field2016) {
            field2025.glMatrixMode(5890);
            field2025.glLoadIdentity();
            field2025.glMatrixMode(5888);
            field2016 = false;
        }
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "()F", line = 166)
    public static final float method988() {
        return field2043;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(F)V", line = 170)
    public static final void method989(float arg0) {
        method981(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 174)
    public static final void method990(int arg0) {
        field2025.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2025.glClear(16384);
        field2025.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "()V", line = 179)
    public static final void method991() {
        class2.method9(0, 10691, 0);
        method1018();
        method986(0);
        method1013(0);
        method1021(false);
        method982(false);
        method1011(false);
        method987();
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)V", line = 190)
    private static final void method992(int arg0, int arg1, int arg2, int arg3) {
        field2038 = arg0;
        field2055 = arg1;
        field2046 = arg2;
        field2040 = arg3;
        method995();
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(FFF)V", line = 199)
    public static final void method993(float arg0, float arg1, float arg2) {
        field2025.glMatrixMode(5890);
        if (field2016) {
            field2025.glLoadIdentity();
        }
        field2025.glTranslatef(arg0, arg1, arg2);
        field2025.glMatrixMode(5888);
        field2016 = true;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 208)
    public static final int method994(Canvas arg0, int arg1) {
        return method1024(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "()V", line = 211)
    private static final void method995() {
        field2025.glViewport(field2057 + field2038, field2055 + field2041, field2046, field2040);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(FFFFFF)V", line = 218)
    private static final void method996(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field2011[0] = var6 / (arg1 - arg0);
        field2011[1] = 0.0F;
        field2011[2] = 0.0F;
        field2011[3] = 0.0F;
        field2011[4] = 0.0F;
        field2011[5] = var6 / (arg3 - arg2);
        field2011[6] = 0.0F;
        field2011[7] = 0.0F;
        field2011[8] = (arg0 + arg1) / (arg1 - arg0);
        field2011[9] = (arg2 + arg3) / (arg3 - arg2);
        field2011[10] = field2052 = -(arg4 + arg5) / (arg5 - arg4);
        field2011[11] = -1.0F;
        field2011[12] = 0.0F;
        field2011[13] = 0.0F;
        field2011[14] = field2039 = -(arg5 * var6) / (arg5 - arg4);
        field2011[15] = 0.0F;
        field2025.glLoadMatrixf(field2011, 0);
        field2048 = 0.0F;
        field2043 = 0.0F;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIFFII)V", line = 251)
    public static final void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field2025.glMatrixMode(5889);
        field2025.glLoadIdentity();
        method996((float) var10 * field2018, (float) var11 * field2018, (float) (-var13) * field2018, (float) (-var12) * field2018, 50.0F, 3584.0F);
        method992(arg0, field2044 - arg1 - arg3, arg2, arg3);
        field2025.glMatrixMode(5888);
        field2025.glLoadIdentity();
        field2025.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field2025.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field2025.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field2027 = false;
        class16.field277 = var10;
        class320.field4815 = var11;
        class92.field1289 = var12;
        class279.field4240 = var13;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(IIII)V", line = 279)
    public static final void method998(int arg0, int arg1, int arg2, int arg3) {
        method997(0, 0, field2028, field2044, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "()V", line = 288)
    public static final void method999() {
        if (field2025 != null) {
            try {
                class233.method1732();
                class207.method1513(-64);
            } catch (Throwable var7) {
            }
            field2025 = null;
        }
        if (field2036 != null) {
            class305.method2144();
            try {
                if (GLContext.getCurrent() == field2036) {
                    field2036.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field2036.destroy();
            } catch (Throwable var5) {
            }
            field2036 = null;
        }
        if (field2029 != null) {
            try {
                field2029.setRealized(false);
            } catch (Throwable var4) {
            }
            field2029 = null;
        }
        class268.method1979();
        field2031 = false;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V", line = 338)
    public static final void method1000(int arg0) {
        if (field2009 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field2025.glDisable(3553);
        } else {
            if (field2009 == -1) {
                field2025.glEnable(3553);
            }
            field2025.glBindTexture(3553, arg0);
        }
        field2009 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "i", descriptor = "()V", line = 359)
    public static final void method1001() {
        class2.method9(0, 10691, 0);
        method1018();
        method986(1);
        method1013(1);
        method1021(false);
        method982(false);
        method1011(false);
        method987();
    }

    @OriginalMember(owner = "client!un", name = "j", descriptor = "()V", line = 370)
    public static final void method1002() {
        int[] var0 = new int[2];
        field2025.glGetIntegerv(3073, var0, 0);
        field2025.glGetIntegerv(3074, var0, 1);
        field2025.glDrawBuffer(1026);
        field2025.glReadBuffer(1024);
        method1000(-1);
        field2025.glPushAttrib(8192);
        field2025.glDisable(2912);
        field2025.glDisable(3042);
        field2025.glDisable(2929);
        field2025.glDisable(3008);
        field2025.glRasterPos2i(0, 0);
        field2025.glCopyPixels(0, 0, field2028, field2044, 6144);
        field2025.glPopAttrib();
        field2025.glDrawBuffer(var0[0]);
        field2025.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!un", name = "k", descriptor = "()I", line = 388)
    public static final int method1003() {
        if (field2013 && (field2026 <= 0 || class305.field4573 != field2033)) {
            int[] var0 = new int[1];
            field2025.glGenFramebuffersEXT(1, var0, 0);
            field2033 = class305.field4573;
            field2026 = var0[0];
        }
        return field2026;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V", line = 400)
    public static final void method1004(int arg0, int arg1) {
        field2028 = arg0;
        field2044 = arg1;
        field2027 = false;
    }

    @OriginalMember(owner = "client!un", name = "l", descriptor = "()V", line = 405)
    public static final void method1005() {
        field2025.glClear(256);
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V", line = 409)
    public static final void method1006(int arg0) {
        field2025.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2025.glClear(16640);
        field2025.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIII)V", line = 427)
    public static final void method1007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field2028 - arg0;
        int var8 = -arg1;
        int var9 = field2044 - arg1;
        field2025.glMatrixMode(5889);
        field2025.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field2025.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method992(0, 0, field2028, field2044);
        field2025.glMatrixMode(5888);
        field2025.glLoadIdentity();
        field2025.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field2027 = false;
    }

    @OriginalMember(owner = "client!un", name = "m", descriptor = "()I", line = 452)
    private static final int method1008() {
        int var0 = 0;
        field2023 = field2025.glGetString(7936);
        field2021 = field2025.glGetString(7937);
        String var1 = field2023.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field2025.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field2015 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field2015 < 12) {
            var0 |= 0x2;
        }
        if (!field2025.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field2025.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field2025.glGetIntegerv(34018, var7, 0);
        field2054 = var7[0];
        field2025.glGetIntegerv(34929, var7, 0);
        field2053 = var7[0];
        field2025.glGetIntegerv(34930, var7, 0);
        field2035 = var7[0];
        if (field2054 < 2 || field2053 < 2 || field2035 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field2056 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field2032 = field2025.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field2047 = field2025.isExtensionAvailable("GL_ARB_multisample");
        field2042 = field2025.isExtensionAvailable("GL_ARB_texture_cube_map");
        field2037 = field2025.isExtensionAvailable("GL_ARB_vertex_program");
        field2013 = field2025.isExtensionAvailable("GL_EXT_framebuffer_object");
        field2025.isExtensionAvailable("GL_ARB_vertex_shader");
        field2022 = field2025.isExtensionAvailable("GL_ARB_fragment_shader");
        field2012 = field2025.isExtensionAvailable("GL_EXT_texture3D");
        field2049 = field2025.isExtensionAvailable("GL_ARB_texture_rectangle");
        field2017 = field2025.isExtensionAvailable("GL_ARB_texture_float");
        field2024 = true;
        String var8 = field2021.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class304.method2141(var8.replace('/', ' '), ' ', -123);
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class287.method2072(8, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class287.method2072(8, var13.substring(0, 4))) {
                        var9 = class28.method176((byte) 28, var13.substring(0, 4));
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field2032 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field2012 = false;
            }
            if (var9 >= 9200 || var10) {
                field2017 = false;
            }
            field2050 = field2032;
            field2024 = false;
        }
        if (field2032) {
            try {
                int[] var14 = new int[1];
                field2025.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!un", name = "n", descriptor = "()V", line = 585)
    public static final void method1009() {
        class2.method9(0, 10691, 0);
        method1018();
        method1000(-1);
        method1021(false);
        method982(false);
        method1011(false);
        method987();
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(IIII)V", line = 594)
    public static final void method1010(int arg0, int arg1, int arg2, int arg3) {
        field2025.glMatrixMode(5889);
        field2025.glLoadIdentity();
        field2025.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field2025.glMatrixMode(5888);
        field2025.glLoadIdentity();
        method992(field2057, field2041, field2028, field2044);
        field2027 = false;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)V", line = 606)
    public static final void method1011(boolean arg0) {
        if (field2034 == arg0) {
            return;
        }
        if (arg0) {
            field2025.glEnable(2912);
        } else {
            field2025.glDisable(2912);
        }
        field2034 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "o", descriptor = "()V", line = 619)
    private static final void method1012() {
        int[] var0 = new int[1];
        field2025.glGenTextures(1, var0, 0);
        field2030 = var0[0];
        field2025.glBindTexture(3553, field2030);
        field2025.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class268.method1975();
        class60.method476((byte) -124);
        class233.method1730();
    }

    @OriginalMember(owner = "client!un", name = "e", descriptor = "(I)V", line = 652)
    public static final void method1013(int arg0) {
        if (field2014 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2025.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field2025.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field2025.glTexEnvi(8960, 34162, 260);
        }
        field2014 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 668)
    public static final void method1014(Canvas arg0) {
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

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)V", line = 688)
    public static final void method1015(int arg0, int arg1) {
        field2057 = arg0;
        field2041 = arg1;
        method995();
    }

    @OriginalMember(owner = "client!un", name = "p", descriptor = "()V", line = 693)
    public static void method1016() {
        field2021 = null;
        field2023 = null;
        field2025 = null;
        field2029 = null;
        field2036 = null;
        field2011 = null;
    }

    @OriginalMember(owner = "client!un", name = "q", descriptor = "()V", line = 706)
    public static final void method1017() {
        class2.method9(0, 10691, 0);
        method1018();
        method986(0);
        method1013(0);
        method1021(false);
        method982(false);
        method1011(false);
        method987();
    }

    @OriginalMember(owner = "client!un", name = "r", descriptor = "()V", line = 717)
    private static final void method1018() {
        if (field2027) {
            return;
        }
        field2025.glMatrixMode(5889);
        field2025.glLoadIdentity();
        field2025.glOrtho(0.0D, (double) field2028, 0.0D, (double) field2044, -1.0D, 1.0D);
        method992(0, 0, field2028, field2044);
        field2025.glMatrixMode(5888);
        field2025.glLoadIdentity();
        field2027 = true;
    }

    @OriginalMember(owner = "client!un", name = "s", descriptor = "()F", line = 730)
    public static final float method1019() {
        return field2048;
    }

    @OriginalMember(owner = "client!un", name = "t", descriptor = "()V", line = 735)
    public static final void method1020() {
        field2025.glDepthMask(false);
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(Z)V", line = 757)
    public static final void method1021(boolean arg0) {
        if (field2020 == arg0) {
            return;
        }
        if (arg0) {
            field2025.glEnable(2896);
        } else {
            field2025.glDisable(2896);
        }
        field2020 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "d", descriptor = "(Z)V", line = 768)
    private static final void method1022(boolean arg0) {
        if (field2051 == arg0) {
            return;
        }
        if (arg0) {
            field2025.glEnableClientState(32885);
        } else {
            field2025.glDisableClientState(32885);
        }
        field2051 = arg0;
    }

    @OriginalMember(owner = "client!un", name = "u", descriptor = "()V", line = 780)
    public static final void method1023() {
        field2025.glDepthMask(true);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 785)
    private static final int method1024(Canvas arg0, int arg1, GLContext arg2) {
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
            field2029 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field2029.setRealized(true);
            int var5 = 0;
            while (true) {
                field2036 = field2029.createContext(arg2);
                try {
                    int var6 = field2036.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class184.method1283(1000L, 10);
            }
            field2025 = field2036.getGL();
            field2031 = true;
            field2028 = arg0.getSize().width;
            field2044 = arg0.getSize().height;
            int var8 = method1008();
            if (var8 != 0) {
                method999();
                return var8;
            }
            method1012();
            method985();
            field2025.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field2029.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method999();
                        return -3;
                    }
                    class184.method1283(100L, 10);
                }
            }
            field2025.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method999();
            return -5;
        }
    }
}
