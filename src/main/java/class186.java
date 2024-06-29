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

@OriginalClass("client!wk")
public class class186 {

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Z")
    public static boolean field2987 = true;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "F")
    private static float field2997 = 0.0F;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Z")
    private static boolean field2983 = true;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    private static int field3001 = 0;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Z")
    public static boolean field2991 = false;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "F")
    private static float field3007 = 0.09765625F;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "Z")
    private static boolean field3009 = false;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    private static int field3000 = -1;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field2993 = 0;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "[F")
    private static float[] field3013 = new float[16];

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "Z")
    private static boolean field3005 = true;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    private static int field3017 = 0;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "Z")
    private static boolean field2996 = true;

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    private static int field3022 = -1;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "F")
    private static float field3011 = 0.0F;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    private static int field3010 = -1;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "Z")
    private static boolean field3026 = false;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "F")
    private static float field3002;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "F")
    private static float field3019;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    private static int field2988;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    private static int field2992;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    private static int field2995;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    private static int field3006;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    private static int field3016;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
    private static int field3021;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
    private static int field3024;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "Ljava/lang/String;")
    private static String field2994;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "Ljava/lang/String;")
    private static String field3025;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field2990;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field3020;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field3015;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Z")
    public static boolean field2981;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
    public static boolean field2984;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Z")
    public static boolean field2989;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Z")
    public static boolean field2998;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "Z")
    public static boolean field2999;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "Z")
    public static boolean field3003;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "Z")
    public static boolean field3004;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "Z")
    public static boolean field3008;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "Z")
    public static boolean field3014;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "Z")
    public static boolean field3023;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "Z")
    public static boolean field3027;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 12)
    public static final void method1274(boolean arg0) {
        if (field2983 == arg0) {
            return;
        }
        if (arg0) {
            field2990.glEnable(2929);
        } else {
            field2990.glDisable(2929);
        }
        field2983 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V", line = 25)
    public static final void method1275() {
        int[] var0 = new int[2];
        field2990.glGetIntegerv(3073, var0, 0);
        field2990.glGetIntegerv(3074, var0, 1);
        field2990.glDrawBuffer(1026);
        field2990.glReadBuffer(1024);
        method1288(-1);
        field2990.glPushAttrib(8192);
        field2990.glDisable(2912);
        field2990.glDisable(3042);
        field2990.glDisable(2929);
        field2990.glDisable(3008);
        field2990.glRasterPos2i(0, 0);
        field2990.glCopyPixels(0, 0, field2986, field2980, 6144);
        field2990.glPopAttrib();
        field2990.glDrawBuffer(var0[0]);
        field2990.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V", line = 43)
    private static final void method1276() {
        field3026 = false;
        field2990.glDisable(3553);
        field3022 = -1;
        field2990.glTexEnvi(8960, 8704, 34160);
        field2990.glTexEnvi(8960, 34161, 8448);
        field3001 = 0;
        field2990.glTexEnvi(8960, 34162, 8448);
        field3017 = 0;
        field2990.glEnable(2896);
        field2990.glEnable(2912);
        field2990.glEnable(2929);
        field3005 = true;
        field2983 = true;
        field2996 = true;
        class66.method435(-92);
        field2990.glActiveTexture(33985);
        field2990.glTexEnvi(8960, 8704, 34160);
        field2990.glTexEnvi(8960, 34161, 8448);
        field2990.glTexEnvi(8960, 34162, 8448);
        field2990.glActiveTexture(33984);
        field2990.setSwapInterval(0);
        field2990.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field2990.glShadeModel(7425);
        field2990.glClearDepth(1.0D);
        field2990.glDepthFunc(515);
        method1289();
        field2990.glMatrixMode(5890);
        field2990.glLoadIdentity();
        field2990.glPolygonMode(1028, 6914);
        field2990.glEnable(2884);
        field2990.glCullFace(1029);
        field2990.glEnable(3042);
        field2990.glBlendFunc(770, 771);
        field2990.glEnable(3008);
        field2990.glAlphaFunc(516, 0.0F);
        field2990.glEnableClientState(32884);
        field2990.glEnableClientState(32885);
        field2987 = true;
        field2990.glEnableClientState(32886);
        field2990.glEnableClientState(32888);
        field2990.glMatrixMode(5888);
        field2990.glLoadIdentity();
        class109.method752();
        class47.method324();
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "()V", line = 90)
    public static final void method1277() {
        try {
            field3015.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "()V", line = 97)
    public static final void method1278() {
        class188.method1328(0, 0, (byte) 110);
        method1292();
        method1281(1);
        method1299(1);
        method1316(false);
        method1274(false);
        method1290(false);
        method1287();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 108)
    public static final int method1279(Canvas arg0, int arg1) {
        return method1308(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V", line = 111)
    private static final void method1280(boolean arg0) {
        if (field2987 == arg0) {
            return;
        }
        if (arg0) {
            field2990.glEnableClientState(32885);
        } else {
            field2990.glDisableClientState(32885);
        }
        field2987 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 125)
    public static final void method1281(int arg0) {
        if (field3001 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2990.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field2990.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field2990.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field2990.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field2990.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field2990.glTexEnvi(8960, 34161, 34165);
        }
        field3001 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(F)V", line = 150)
    public static final void method1282(float arg0) {
        method1306(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(FFFFFF)V", line = 155)
    private static final void method1283(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field3013[0] = var6 / (arg1 - arg0);
        field3013[1] = 0.0F;
        field3013[2] = 0.0F;
        field3013[3] = 0.0F;
        field3013[4] = 0.0F;
        field3013[5] = var6 / (arg3 - arg2);
        field3013[6] = 0.0F;
        field3013[7] = 0.0F;
        field3013[8] = (arg0 + arg1) / (arg1 - arg0);
        field3013[9] = (arg2 + arg3) / (arg3 - arg2);
        field3013[10] = field3019 = -(arg4 + arg5) / (arg5 - arg4);
        field3013[11] = -1.0F;
        field3013[12] = 0.0F;
        field3013[13] = 0.0F;
        field3013[14] = field3002 = -(arg5 * var6) / (arg5 - arg4);
        field3013[15] = 0.0F;
        field2990.glLoadMatrixf(field3013, 0);
        field2997 = 0.0F;
        field3011 = 0.0F;
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "()V", line = 177)
    public static final void method1284() {
        field2990.glDepthMask(false);
    }

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "()V", line = 183)
    public static final void method1285() {
        if (field2990 != null) {
            try {
                class199.method1461();
                class204.method1503(0);
            } catch (Throwable var7) {
            }
            field2990 = null;
        }
        if (field3020 != null) {
            class275.method1963();
            try {
                if (GLContext.getCurrent() == field3020) {
                    field3020.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field3020.destroy();
            } catch (Throwable var5) {
            }
            field3020 = null;
        }
        if (field3015 != null) {
            try {
                field3015.setRealized(false);
            } catch (Throwable var4) {
            }
            field3015 = null;
        }
        class47.method319();
        field2991 = false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(FFF)V", line = 232)
    public static final void method1286(float arg0, float arg1, float arg2) {
        field2990.glMatrixMode(5890);
        if (field3009) {
            field2990.glLoadIdentity();
        }
        field2990.glTranslatef(arg0, arg1, arg2);
        field2990.glMatrixMode(5888);
        field3009 = true;
    }

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "()V", line = 246)
    public static final void method1287() {
        if (field3009) {
            field2990.glMatrixMode(5890);
            field2990.glLoadIdentity();
            field2990.glMatrixMode(5888);
            field3009 = false;
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 257)
    public static final void method1288(int arg0) {
        if (field3022 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field2990.glDisable(3553);
        } else {
            if (field3022 == -1) {
                field2990.glEnable(3553);
            }
            field2990.glBindTexture(3553, arg0);
        }
        field3022 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "()V", line = 279)
    public static final void method1289() {
        field2990.glDepthMask(true);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(Z)V", line = 286)
    public static final void method1290(boolean arg0) {
        if (field2996 == arg0) {
            return;
        }
        if (arg0) {
            field2990.glEnable(2912);
        } else {
            field2990.glDisable(2912);
        }
        field2996 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "()I", line = 298)
    private static final int method1291() {
        int var0 = 0;
        field2994 = field2990.glGetString(7936);
        field3025 = field2990.glGetString(7937);
        String var1 = field2994.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field2990.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field2992 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field2992 < 12) {
            var0 |= 0x2;
        }
        if (!field2990.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field2990.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field2990.glGetIntegerv(34018, var7, 0);
        field2985 = var7[0];
        field2990.glGetIntegerv(34929, var7, 0);
        field2988 = var7[0];
        field2990.glGetIntegerv(34930, var7, 0);
        field3021 = var7[0];
        if (field2985 < 2 || field2988 < 2 || field3021 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field3014 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field3027 = field2990.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field2999 = field2990.isExtensionAvailable("GL_ARB_multisample");
        field3023 = field2990.isExtensionAvailable("GL_ARB_texture_cube_map");
        field2989 = field2990.isExtensionAvailable("GL_ARB_vertex_program");
        field3004 = field2990.isExtensionAvailable("GL_EXT_framebuffer_object");
        field2990.isExtensionAvailable("GL_ARB_vertex_shader");
        field2998 = field2990.isExtensionAvailable("GL_ARB_fragment_shader");
        field3003 = field2990.isExtensionAvailable("GL_EXT_texture3D");
        field3008 = field2990.isExtensionAvailable("GL_ARB_texture_rectangle");
        field2981 = field2990.isExtensionAvailable("GL_ARB_texture_float");
        String var8 = field3025.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class334.method2306(' ', var8.replace('/', ' '), -3);
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class121.method843(10, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class121.method843(10, var13.substring(0, 4))) {
                        var9 = class321.method2244((byte) -19, var13.substring(0, 4));
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field3027 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field3003 = false;
            }
            if (var9 >= 9200 || var10) {
                field2981 = false;
            }
            field2984 = field3027;
        }
        if (field3027) {
            try {
                int[] var14 = new int[1];
                field2990.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "()V", line = 439)
    private static final void method1292() {
        if (field3026) {
            return;
        }
        field2990.glMatrixMode(5889);
        field2990.glLoadIdentity();
        field2990.glOrtho(0.0D, (double) field2986, 0.0D, (double) field2980, -1.0D, 1.0D);
        method1315(0, 0, field2986, field2980);
        field2990.glMatrixMode(5888);
        field2990.glLoadIdentity();
        field3026 = true;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V", line = 454)
    public static final void method1293(int arg0) {
        field2990.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2990.glClear(16640);
        field2990.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "()V", line = 460)
    private static final void method1294() {
        field2990.glViewport(field3018 + field3016, field3012 + field2995, field3006, field3024);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V", line = 474)
    public static final void method1295(int arg0, int arg1) {
        field3018 = arg0;
        field3012 = arg1;
        method1294();
    }

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "()V", line = 480)
    public static final void method1296() {
        class188.method1328(0, 0, (byte) 117);
        method1292();
        method1281(0);
        method1299(0);
        method1316(false);
        method1274(false);
        method1290(false);
        method1287();
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)V", line = 491)
    public static final void method1297(int arg0, int arg1, int arg2, int arg3) {
        method1303(0, 0, field2986, field2980, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "()V", line = 496)
    public static final void method1298() {
        if (class269.field4250) {
            method1316(true);
            method1280(true);
        } else {
            method1316(false);
            method1280(false);
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V", line = 511)
    public static final void method1299(int arg0) {
        if (field3017 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2990.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field2990.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field2990.glTexEnvi(8960, 34162, 260);
        }
        field3017 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "()V", line = 527)
    private static final void method1300() {
        int[] var0 = new int[1];
        field2990.glGenTextures(1, var0, 0);
        field2982 = var0[0];
        field2990.glBindTexture(3553, field2982);
        field2990.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class47.method318();
        class334.method2307((byte) -115);
        class199.method1458();
    }

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "()V", line = 537)
    public static void method1301() {
        field3025 = null;
        field2994 = null;
        field2990 = null;
        field3015 = null;
        field3020 = null;
        field3013 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)V", line = 546)
    public static final void method1302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field2986 - arg0;
        int var8 = -arg1;
        int var9 = field2980 - arg1;
        field2990.glMatrixMode(5889);
        field2990.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field2990.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method1315(0, 0, field2986, field2980);
        field2990.glMatrixMode(5888);
        field2990.glLoadIdentity();
        field2990.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field3026 = false;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIFFII)V", line = 576)
    public static final void method1303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field2990.glMatrixMode(5889);
        field2990.glLoadIdentity();
        method1283((float) var10 * field3007, (float) var11 * field3007, (float) (-var13) * field3007, (float) (-var12) * field3007, 50.0F, 3584.0F);
        method1315(arg0, field2980 - arg1 - arg3, arg2, arg3);
        field2990.glMatrixMode(5888);
        field2990.glLoadIdentity();
        field2990.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field2990.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field2990.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field3026 = false;
        class338.field5244 = var10;
        class131.field1931 = var11;
        class204.field3334 = var12;
        class287.field4527 = var13;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)V", line = 610)
    public static final void method1304(int arg0, int arg1) {
        field2986 = arg0;
        field2980 = arg1;
        field3026 = false;
    }

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "()F", line = 618)
    public static final float method1305() {
        return field2997;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(FF)V", line = 623)
    public static final void method1306(float arg0, float arg1) {
        if (field3026 || field2997 == arg0 && field3011 == arg1) {
            return;
        }
        field2997 = arg0;
        field3011 = arg1;
        if (arg1 == 0.0F) {
            field3013[10] = field3019;
            field3013[14] = field3002;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field3002 * (1.0F - var2) / arg1;
            field3013[10] = field3019 + var4;
            field3013[14] = field3002 * var3;
        }
        field2990.glMatrixMode(5889);
        field2990.glLoadMatrixf(field3013, 0);
        field2990.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "()F", line = 655)
    public static final float method1307() {
        return field3011;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 659)
    private static final int method1308(Canvas arg0, int arg1, GLContext arg2) {
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
            field3015 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field3015.setRealized(true);
            int var5 = 0;
            while (true) {
                field3020 = field3015.createContext(arg2);
                try {
                    int var6 = field3020.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class20.method128(0, 1000L);
            }
            field2990 = field3020.getGL();
            new GLU();
            field2991 = true;
            field2986 = arg0.getSize().width;
            field2980 = arg0.getSize().height;
            int var8 = method1291();
            if (var8 != 0) {
                method1285();
                return var8;
            }
            method1300();
            method1276();
            field2990.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field3015.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method1285();
                        return -3;
                    }
                    class20.method128(0, 100L);
                }
            }
            field2990.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method1285();
            return -5;
        }
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V", line = 750)
    public static final void method1309(int arg0) {
        field2990.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2990.glClear(16384);
        field2990.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 758)
    public static final void method1310(Canvas arg0) {
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

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "()V", line = 783)
    public static final void method1311() {
        class188.method1328(0, 0, (byte) 122);
        method1292();
        method1288(-1);
        method1316(false);
        method1274(false);
        method1290(false);
        method1287();
    }

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "()V", line = 796)
    public static final void method1312() {
        field2990.glClear(256);
    }

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "()V", line = 808)
    public static final void method1313() {
        class188.method1328(0, 0, (byte) 118);
        method1292();
        method1281(0);
        method1299(0);
        method1316(false);
        method1274(false);
        method1290(false);
        method1287();
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIII)V", line = 827)
    public static final void method1314(int arg0, int arg1, int arg2, int arg3) {
        field2990.glMatrixMode(5889);
        field2990.glLoadIdentity();
        field2990.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field2990.glMatrixMode(5888);
        field2990.glLoadIdentity();
        method1315(field3018, field3012, field2986, field2980);
        field3026 = false;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(IIII)V", line = 836)
    private static final void method1315(int arg0, int arg1, int arg2, int arg3) {
        field3016 = arg0;
        field2995 = arg1;
        field3006 = arg2;
        field3024 = arg3;
        method1294();
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(Z)V", line = 844)
    public static final void method1316(boolean arg0) {
        if (field3005 == arg0) {
            return;
        }
        if (arg0) {
            field2990.glEnable(2896);
        } else {
            field2990.glDisable(2896);
        }
        field3005 = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "()I", line = 858)
    public static final int method1317() {
        if (field3004 && (field3010 <= 0 || class275.field4359 != field3000)) {
            int[] var0 = new int[1];
            field2990.glGenFramebuffersEXT(1, var0, 0);
            field3000 = class275.field4359;
            field3010 = var0[0];
        }
        return field3010;
    }
}
