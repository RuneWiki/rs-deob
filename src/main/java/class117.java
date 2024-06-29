import java.awt.Canvas;
import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLCapabilitiesChooser;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class117 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    private static int field2125 = 0;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "F")
    private static float field2149 = 0.09765625F;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Z")
    private static boolean field2134 = false;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "Z")
    private static boolean field2150 = true;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "F")
    private static float field2130 = 0.0F;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "Lbd;")
    private static class162 field2153 = class17.method142(0, "radeon");

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "Z")
    private static boolean field2151 = true;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Z")
    private static boolean field2129 = false;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field2127 = 0;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "[F")
    private static float[] field2140 = new float[16];

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    private static int field2131 = 0;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "Z")
    public static boolean field2154 = true;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    private static int field2146 = -1;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "F")
    private static float field2158 = 0.0F;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "Z")
    private static boolean field2157 = true;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "Z")
    public static boolean field2159 = false;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "F")
    private static float field2147;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "F")
    private static float field2152;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    private static int field2128;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    private static int field2156;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    private static int field2161;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Ljava/lang/String;")
    private static String field2136;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "Ljava/lang/String;")
    private static String field2160;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field2143;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field2133;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field2138;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "Z")
    public static boolean field2132;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Z")
    public static boolean field2135;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Z")
    public static boolean field2139;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Z")
    public static boolean field2141;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Z")
    public static boolean field2144;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Z")
    public static boolean field2145;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "Z")
    public static boolean field2148;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V", line = 16)
    public static final void method932() {
        class116.method913(true, 0, 0);
        method958();
        method961(0);
        method935(0);
        method962(false);
        method956(false);
        method944(false);
        method959();
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V", line = 26)
    public static final void method933(int arg0, int arg1) {
        field2142 = arg0;
        field2126 = arg1;
        field2134 = false;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()F", line = 35)
    public static final float method934() {
        return field2130;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 39)
    public static final void method935(int arg0) {
        if (field2125 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2143.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field2143.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field2143.glTexEnvi(8960, 34162, 260);
        }
        field2125 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(FFFFFF)V", line = 58)
    private static final void method936(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field2140[0] = var6 / (arg1 - arg0);
        field2140[1] = 0.0F;
        field2140[2] = 0.0F;
        field2140[3] = 0.0F;
        field2140[4] = 0.0F;
        field2140[5] = var6 / (arg3 - arg2);
        field2140[6] = 0.0F;
        field2140[7] = 0.0F;
        field2140[8] = (arg0 + arg1) / (arg1 - arg0);
        field2140[9] = (arg2 + arg3) / (arg3 - arg2);
        field2140[10] = field2147 = -(arg4 + arg5) / (arg5 - arg4);
        field2140[11] = -1.0F;
        field2140[12] = 0.0F;
        field2140[13] = 0.0F;
        field2140[14] = field2152 = -(arg5 * var6) / (arg5 - arg4);
        field2140[15] = 0.0F;
        field2143.glLoadMatrixf(field2140, 0);
        field2158 = 0.0F;
        field2130 = 0.0F;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()F", line = 82)
    public static final float method937() {
        return field2158;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()V", line = 86)
    public static final void method938() {
        class116.method913(true, 0, 0);
        method958();
        method939(-1);
        method962(false);
        method956(false);
        method944(false);
        method959();
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 96)
    public static final void method939(int arg0) {
        if (field2146 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field2143.glDisable(3553);
        } else {
            if (field2146 == -1) {
                field2143.glEnable(3553);
            }
            field2143.glBindTexture(3553, arg0);
        }
        field2146 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "()V", line = 113)
    public static void method940() {
        field2153 = null;
        field2136 = null;
        field2160 = null;
        field2143 = null;
        field2138 = null;
        field2133 = null;
        field2140 = null;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 125)
    public static final void method941(int arg0) {
        field2143.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2143.glClear(16640);
        field2143.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "()V", line = 131)
    public static final void method942() {
        int[] var0 = new int[2];
        field2143.glGetIntegerv(3073, var0, 0);
        field2143.glGetIntegerv(3074, var0, 1);
        field2143.glDrawBuffer(1026);
        field2143.glReadBuffer(1024);
        method939(-1);
        field2143.glPushAttrib(8192);
        field2143.glDisable(2912);
        field2143.glDisable(3042);
        field2143.glDisable(2929);
        field2143.glDisable(3008);
        field2143.glRasterPos2i(0, 0);
        field2143.glCopyPixels(0, 0, field2142, field2126, 6144);
        field2143.glPopAttrib();
        field2143.glDrawBuffer(var0[0]);
        field2143.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIFFII)V", line = 150)
    public static final void method943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field2143.glMatrixMode(5889);
        field2143.glLoadIdentity();
        method936((float) var10 * field2149, (float) var11 * field2149, (float) (-var13) * field2149, (float) (-var12) * field2149, 50.0F, 3584.0F);
        field2143.glViewport(arg0, field2126 - arg1 - arg3, arg2, arg3);
        field2143.glMatrixMode(5888);
        field2143.glLoadIdentity();
        field2143.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field2143.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field2143.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field2134 = false;
        class90.field1606 = var10;
        class198.field3367 = var11;
        class23.field403 = var12;
        class80.field1402 = var13;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 178)
    public static final void method944(boolean arg0) {
        if (field2157 == arg0) {
            return;
        }
        if (arg0) {
            field2143.glEnable(2912);
        } else {
            field2143.glDisable(2912);
        }
        field2157 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 191)
    public static final int method945(Canvas arg0, int arg1) {
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
            field2138 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field2138.setRealized(true);
            int var4 = 0;
            while (true) {
                field2133 = field2138.createContext((GLContext) null);
                try {
                    int var5 = field2133.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class177.method1342(1000L, 1);
            }
            field2143 = field2133.getGL();
            new GLU();
            field2159 = true;
            field2142 = arg0.getSize().width;
            field2126 = arg0.getSize().height;
            int var7 = method957();
            if (var7 != 0) {
                method952();
                return var7;
            }
            method950();
            method948();
            field2143.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field2138.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method952();
                        return -3;
                    }
                    class177.method1342(100L, 1);
                }
            }
            field2143.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method952();
            return -5;
        }
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "()V", line = 275)
    public static final void method946() {
        class116.method913(true, 0, 0);
        method958();
        method961(0);
        method935(0);
        method962(false);
        method956(false);
        method944(false);
        method959();
    }

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "()V", line = 290)
    public static final void method947() {
        field2143.glClear(256);
    }

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "()V", line = 295)
    private static final void method948() {
        field2134 = false;
        field2143.glDisable(3553);
        field2146 = -1;
        field2143.glTexEnvi(8960, 8704, 34160);
        field2143.glTexEnvi(8960, 34161, 8448);
        field2131 = 0;
        field2143.glTexEnvi(8960, 34162, 8448);
        field2125 = 0;
        field2143.glEnable(2896);
        field2143.glEnable(2912);
        field2143.glEnable(2929);
        field2151 = true;
        field2150 = true;
        field2157 = true;
        class68.method489((byte) 64);
        field2143.glActiveTexture(33985);
        field2143.glTexEnvi(8960, 8704, 34160);
        field2143.glTexEnvi(8960, 34161, 8448);
        field2143.glTexEnvi(8960, 34162, 8448);
        field2143.glActiveTexture(33984);
        field2143.setSwapInterval(0);
        field2143.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field2143.glShadeModel(7425);
        field2143.glClearDepth(1.0D);
        field2143.glDepthFunc(515);
        method968();
        field2143.glMatrixMode(5890);
        field2143.glLoadIdentity();
        field2143.glPolygonMode(1028, 6914);
        field2143.glEnable(2884);
        field2143.glCullFace(1029);
        field2143.glEnable(3042);
        field2143.glBlendFunc(770, 771);
        field2143.glEnable(3008);
        field2143.glAlphaFunc(516, 0.0F);
        field2143.glEnableClientState(32884);
        field2143.glEnableClientState(32885);
        field2154 = true;
        field2143.glEnableClientState(32886);
        field2143.glEnableClientState(32888);
        field2143.glMatrixMode(5888);
        field2143.glLoadIdentity();
        class108.method878();
        class221.method1602();
    }

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "()V", line = 341)
    public static final void method949() {
        class116.method913(true, 0, 0);
        method958();
        method961(1);
        method935(1);
        method962(false);
        method956(false);
        method944(false);
        method959();
    }

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "()V", line = 352)
    private static final void method950() {
        int[] var0 = new int[1];
        field2143.glGenTextures(1, var0, 0);
        field2155 = var0[0];
        field2143.glBindTexture(3553, field2155);
        field2143.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class238.method1683((byte) -116);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)V", line = 360)
    public static final void method951(int arg0, int arg1, int arg2, int arg3) {
        method943(0, 0, field2142, field2126, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "()V", line = 364)
    public static final void method952() {
        if (field2143 != null) {
            try {
                class137.method1074(3503);
            } catch (Throwable var7) {
            }
            field2143 = null;
        }
        if (field2133 != null) {
            class41.method306();
            try {
                if (GLContext.getCurrent() == field2133) {
                    field2133.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field2133.destroy();
            } catch (Throwable var5) {
            }
            field2133 = null;
        }
        if (field2138 != null) {
            try {
                field2138.setRealized(false);
            } catch (Throwable var4) {
            }
            field2138 = null;
        }
        class221.method1596();
        field2159 = false;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)V", line = 415)
    private static final void method953(boolean arg0) {
        if (field2154 == arg0) {
            return;
        }
        if (arg0) {
            field2143.glEnableClientState(32885);
        } else {
            field2143.glDisableClientState(32885);
        }
        field2154 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/lang/String;)Lbd;", line = 428)
    private static final class162 method954(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class95.method768(var1.length, 0, var1, (byte) 126);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V", line = 439)
    public static final void method955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field2142 - arg0;
        int var8 = -arg1;
        int var9 = field2126 - arg1;
        field2143.glMatrixMode(5889);
        field2143.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field2143.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field2143.glViewport(0, 0, field2142, field2126);
        field2143.glMatrixMode(5888);
        field2143.glLoadIdentity();
        field2143.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field2134 = false;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(Z)V", line = 462)
    public static final void method956(boolean arg0) {
        if (field2150 == arg0) {
            return;
        }
        if (arg0) {
            field2143.glEnable(2929);
        } else {
            field2143.glDisable(2929);
        }
        field2150 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "()I", line = 476)
    private static final int method957() {
        int var0 = 0;
        field2160 = field2143.glGetString(7936);
        field2136 = field2143.glGetString(7937);
        String var1 = field2160.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field2143.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field2128 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field2128 < 12) {
            var0 |= 0x2;
        }
        if (!field2143.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field2143.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field2143.glGetIntegerv(34018, var7, 0);
        field2137 = var7[0];
        field2143.glGetIntegerv(34929, var7, 0);
        field2161 = var7[0];
        field2143.glGetIntegerv(34930, var7, 0);
        field2156 = var7[0];
        if (field2137 < 2 || field2161 < 2 || field2156 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field2135 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field2145 = field2143.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field2141 = field2143.isExtensionAvailable("GL_ARB_multisample");
        field2144 = field2143.isExtensionAvailable("GL_ARB_texture_cube_map");
        field2139 = field2143.isExtensionAvailable("GL_ARB_vertex_program");
        field2132 = field2143.isExtensionAvailable("GL_EXT_texture3D");
        class162 var8 = method954(field2136).method1250(99);
        if (var8.method1244((byte) 23, field2153) != -1) {
            int var9 = 0;
            class162[] var10 = var8.method1259(32, 47, false).method1277(1, 32);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class162 var12 = var10[var11];
                if (var12.method1249((byte) -118) >= 4 && var12.method1283(0, 4, (byte) 124).method1251(false)) {
                    var9 = var12.method1283(0, 4, (byte) 101).method1238(-127);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field2145 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field2132 = false;
            }
            field2148 = field2145;
        }
        if (field2145) {
            try {
                int[] var13 = new int[1];
                field2143.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "()V", line = 587)
    private static final void method958() {
        if (field2134) {
            return;
        }
        field2143.glMatrixMode(5889);
        field2143.glLoadIdentity();
        field2143.glOrtho(0.0D, (double) field2142, 0.0D, (double) field2126, -1.0D, 1.0D);
        field2143.glViewport(0, 0, field2142, field2126);
        field2143.glMatrixMode(5888);
        field2143.glLoadIdentity();
        field2134 = true;
    }

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "()V", line = 601)
    public static final void method959() {
        if (field2129) {
            field2143.glMatrixMode(5890);
            field2143.glLoadIdentity();
            field2143.glMatrixMode(5888);
            field2129 = false;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(FF)V", line = 615)
    public static final void method960(float arg0, float arg1) {
        if (field2134 || field2158 == arg0 && field2130 == arg1) {
            return;
        }
        field2158 = arg0;
        field2130 = arg1;
        if (arg1 == 0.0F) {
            field2140[10] = field2147;
            field2140[14] = field2152;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field2152 * (1.0F - var2) / arg1;
            field2140[10] = field2147 + var4;
            field2140[14] = field2152 * var3;
        }
        field2143.glMatrixMode(5889);
        field2143.glLoadMatrixf(field2140, 0);
        field2143.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V", line = 650)
    public static final void method961(int arg0) {
        if (field2131 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2143.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field2143.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field2143.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field2143.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field2143.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field2143.glTexEnvi(8960, 34161, 34165);
        }
        field2131 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(Z)V", line = 674)
    public static final void method962(boolean arg0) {
        if (field2151 == arg0) {
            return;
        }
        if (arg0) {
            field2143.glEnable(2896);
        } else {
            field2143.glDisable(2896);
        }
        field2151 = arg0;
    }

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "()V", line = 702)
    public static final void method963() {
        field2143.glDepthMask(false);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 715)
    public static final void method964(Canvas arg0) {
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

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "()V", line = 736)
    public static final void method965() {
        try {
            field2138.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "()V", line = 745)
    public static final void method966() {
        if (class92.field1634) {
            method962(true);
            method953(true);
        } else {
            method962(false);
            method953(false);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(FFF)V", line = 758)
    public static final void method967(float arg0, float arg1, float arg2) {
        field2143.glMatrixMode(5890);
        if (field2129) {
            field2143.glLoadIdentity();
        }
        field2143.glTranslatef(arg0, arg1, arg2);
        field2143.glMatrixMode(5888);
        field2129 = true;
    }

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "()V", line = 776)
    public static final void method968() {
        field2143.glDepthMask(true);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(F)V", line = 780)
    public static final void method969(float arg0) {
        method960(3000.0F, arg0 * 1.5F);
    }
}
