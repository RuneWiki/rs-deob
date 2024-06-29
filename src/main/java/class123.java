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

@OriginalClass("client!cf")
public class class123 {

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[F")
    private static float[] field2209 = new float[16];

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Z")
    private static boolean field2210 = true;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    private static int field2204 = 0;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Z")
    private static boolean field2211 = true;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Lcd;")
    private static class64 field2214 = class44.method335((byte) 71, "radeon");

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "F")
    private static float field2215 = 0.0F;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Z")
    private static boolean field2217 = false;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Z")
    public static boolean field2219 = true;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    private static int field2224 = 0;

    @OriginalMember(owner = "client!cf", name = "E", descriptor = "F")
    private static float field2234 = 0.09765625F;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Z")
    private static boolean field2229 = true;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field2226 = 0;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "F")
    private static float field2223 = 0.0F;

    @OriginalMember(owner = "client!cf", name = "H", descriptor = "Z")
    private static boolean field2237 = false;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    private static int field2225 = -1;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Z")
    public static boolean field2216 = false;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "F")
    private static float field2218;

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "F")
    private static float field2230;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    private static int field2222;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    private static int field2228;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    private static int field2233;

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!cf", name = "F", descriptor = "Ljava/lang/String;")
    private static String field2235;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "Ljava/lang/String;")
    private static String field2240;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field2212;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field2220;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field2205;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Z")
    public static boolean field2206;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Z")
    public static boolean field2213;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Z")
    public static boolean field2221;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Z")
    public static boolean field2227;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "Z")
    public static boolean field2231;

    @OriginalMember(owner = "client!cf", name = "G", descriptor = "Z")
    public static boolean field2236;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
    public static boolean field2239;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V", line = 10)
    public static final void method863() {
        class125.method908(0, -5, 0);
        method880();
        method894(1);
        method881(1);
        method864(false);
        method865(false);
        method895(false);
        method885();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method864(boolean arg0) {
        if (field2229 == arg0) {
            return;
        }
        if (arg0) {
            field2212.glEnable(2896);
        } else {
            field2212.glDisable(2896);
        }
        field2229 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(Z)V", line = 33)
    public static final void method865(boolean arg0) {
        if (field2210 == arg0) {
            return;
        }
        if (arg0) {
            field2212.glEnable(2929);
        } else {
            field2212.glDisable(2929);
        }
        field2210 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()V", line = 45)
    public static final void method866() {
        int[] var0 = new int[2];
        field2212.glGetIntegerv(3073, var0, 0);
        field2212.glGetIntegerv(3074, var0, 1);
        field2212.glDrawBuffer(1026);
        field2212.glReadBuffer(1024);
        method867(-1);
        field2212.glPushAttrib(8192);
        field2212.glDisable(2912);
        field2212.glDisable(3042);
        field2212.glDisable(2929);
        field2212.glDisable(3008);
        field2212.glRasterPos2i(0, 0);
        field2212.glCopyPixels(0, 0, field2208, field2207, 6144);
        field2212.glPopAttrib();
        field2212.glDrawBuffer(var0[0]);
        field2212.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 67)
    public static final void method867(int arg0) {
        if (field2225 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field2212.glDisable(3553);
        } else {
            if (field2225 == -1) {
                field2212.glEnable(3553);
            }
            field2212.glBindTexture(3553, arg0);
        }
        field2225 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V", line = 83)
    public static final void method868(int arg0) {
        field2212.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2212.glClear(16640);
        field2212.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;)Lcd;", line = 91)
    private static final class64 method869(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class292.method2015(0, var1, 0, var1.length);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()V", line = 107)
    public static final void method870() {
        field2212.glClear(256);
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "()V", line = 111)
    private static final void method871() {
        field2237 = false;
        field2212.glDisable(3553);
        field2225 = -1;
        field2212.glTexEnvi(8960, 8704, 34160);
        field2212.glTexEnvi(8960, 34161, 8448);
        field2204 = 0;
        field2212.glTexEnvi(8960, 34162, 8448);
        field2224 = 0;
        field2212.glEnable(2896);
        field2212.glEnable(2912);
        field2212.glEnable(2929);
        field2229 = true;
        field2210 = true;
        field2211 = true;
        class36.method294(79);
        field2212.glActiveTexture(33985);
        field2212.glTexEnvi(8960, 8704, 34160);
        field2212.glTexEnvi(8960, 34161, 8448);
        field2212.glTexEnvi(8960, 34162, 8448);
        field2212.glActiveTexture(33984);
        field2212.setSwapInterval(0);
        field2212.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field2212.glShadeModel(7425);
        field2212.glClearDepth(1.0D);
        field2212.glDepthFunc(515);
        method872();
        field2212.glMatrixMode(5890);
        field2212.glLoadIdentity();
        field2212.glPolygonMode(1028, 6914);
        field2212.glEnable(2884);
        field2212.glCullFace(1029);
        field2212.glEnable(3042);
        field2212.glBlendFunc(770, 771);
        field2212.glEnable(3008);
        field2212.glAlphaFunc(516, 0.0F);
        field2212.glEnableClientState(32884);
        field2212.glEnableClientState(32885);
        field2219 = true;
        field2212.glEnableClientState(32886);
        field2212.glEnableClientState(32888);
        field2212.glMatrixMode(5888);
        field2212.glLoadIdentity();
        class52.method387();
        class177.method1237();
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "()V", line = 164)
    public static final void method872() {
        field2212.glDepthMask(true);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(FFF)V", line = 167)
    public static final void method873(float arg0, float arg1, float arg2) {
        field2212.glMatrixMode(5890);
        if (field2217) {
            field2212.glLoadIdentity();
        }
        field2212.glTranslatef(arg0, arg1, arg2);
        field2212.glMatrixMode(5888);
        field2217 = true;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "()V", line = 177)
    private static final void method874() {
        int[] var0 = new int[1];
        field2212.glGenTextures(1, var0, 0);
        field2232 = var0[0];
        field2212.glBindTexture(3553, field2232);
        field2212.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class301.method2101(-113);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(F)V", line = 185)
    public static final void method875(float arg0) {
        method877(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(FFFFFF)V", line = 190)
    private static final void method876(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field2209[0] = var6 / (arg1 - arg0);
        field2209[1] = 0.0F;
        field2209[2] = 0.0F;
        field2209[3] = 0.0F;
        field2209[4] = 0.0F;
        field2209[5] = var6 / (arg3 - arg2);
        field2209[6] = 0.0F;
        field2209[7] = 0.0F;
        field2209[8] = (arg0 + arg1) / (arg1 - arg0);
        field2209[9] = (arg2 + arg3) / (arg3 - arg2);
        field2209[10] = field2230 = -(arg4 + arg5) / (arg5 - arg4);
        field2209[11] = -1.0F;
        field2209[12] = 0.0F;
        field2209[13] = 0.0F;
        field2209[14] = field2218 = -(arg5 * var6) / (arg5 - arg4);
        field2209[15] = 0.0F;
        field2212.glLoadMatrixf(field2209, 0);
        field2215 = 0.0F;
        field2223 = 0.0F;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(FF)V", line = 212)
    public static final void method877(float arg0, float arg1) {
        if (field2237 || field2215 == arg0 && field2223 == arg1) {
            return;
        }
        field2215 = arg0;
        field2223 = arg1;
        if (arg1 == 0.0F) {
            field2209[10] = field2230;
            field2209[14] = field2218;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field2218 * (1.0F - var2) / arg1;
            field2209[10] = field2230 + var4;
            field2209[14] = field2218 * var3;
        }
        field2212.glMatrixMode(5889);
        field2212.glLoadMatrixf(field2209, 0);
        field2212.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 243)
    public static final void method878(Canvas arg0) {
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

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "()V", line = 270)
    public static final void method879() {
        try {
            field2205.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "()V", line = 278)
    private static final void method880() {
        if (field2237) {
            return;
        }
        field2212.glMatrixMode(5889);
        field2212.glLoadIdentity();
        field2212.glOrtho(0.0D, (double) field2208, 0.0D, (double) field2207, -1.0D, 1.0D);
        field2212.glViewport(0, 0, field2208, field2207);
        field2212.glMatrixMode(5888);
        field2212.glLoadIdentity();
        field2237 = true;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 290)
    public static final void method881(int arg0) {
        if (field2224 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2212.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field2212.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field2212.glTexEnvi(8960, 34162, 260);
        }
        field2224 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "()V", line = 306)
    public static final void method882() {
        class125.method908(0, -5, 0);
        method880();
        method867(-1);
        method864(false);
        method865(false);
        method895(false);
        method885();
    }

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "()F", line = 319)
    public static final float method883() {
        return field2215;
    }

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "()F", line = 323)
    public static final float method884() {
        return field2223;
    }

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "()V", line = 332)
    public static final void method885() {
        if (field2217) {
            field2212.glMatrixMode(5890);
            field2212.glLoadIdentity();
            field2212.glMatrixMode(5888);
            field2217 = false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIFFII)V", line = 347)
    public static final void method886(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field2212.glMatrixMode(5889);
        field2212.glLoadIdentity();
        method876((float) var10 * field2234, (float) var11 * field2234, (float) (-var13) * field2234, (float) (-var12) * field2234, 50.0F, 3584.0F);
        field2212.glViewport(arg0, field2207 - arg1 - arg3, arg2, arg3);
        field2212.glMatrixMode(5888);
        field2212.glLoadIdentity();
        field2212.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field2212.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field2212.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field2237 = false;
        class290.field4964 = var10;
        class181.field3113 = var11;
        class61.field1186 = var12;
        class66.field1307 = var13;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V", line = 378)
    public static final void method887(int arg0, int arg1) {
        field2208 = arg0;
        field2207 = arg1;
        field2237 = false;
    }

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "()V", line = 389)
    public static final void method888() {
        if (class274.field4701) {
            method864(true);
            method896(true);
        } else {
            method864(false);
            method896(false);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V", line = 405)
    public static final void method889(int arg0, int arg1, int arg2, int arg3) {
        method886(0, 0, field2208, field2207, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "()I", line = 419)
    private static final int method890() {
        int var0 = 0;
        field2235 = field2212.glGetString(7936);
        field2240 = field2212.glGetString(7937);
        String var1 = field2235.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field2212.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field2228 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field2228 < 12) {
            var0 |= 0x2;
        }
        if (!field2212.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field2212.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field2212.glGetIntegerv(34018, var7, 0);
        field2238 = var7[0];
        field2212.glGetIntegerv(34929, var7, 0);
        field2222 = var7[0];
        field2212.glGetIntegerv(34930, var7, 0);
        field2233 = var7[0];
        if (field2238 < 2 || field2222 < 2 || field2233 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field2221 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field2227 = field2212.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field2231 = field2212.isExtensionAvailable("GL_ARB_multisample");
        field2213 = field2212.isExtensionAvailable("GL_ARB_texture_cube_map");
        field2239 = field2212.isExtensionAvailable("GL_ARB_vertex_program");
        field2236 = field2212.isExtensionAvailable("GL_EXT_texture3D");
        class64 var8 = method869(field2240).method522(-41);
        if (var8.method500(-124, field2214) != -1) {
            int var9 = 0;
            class64[] var10 = var8.method494(-21158, 47, 32).method504(32, 0);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class64 var12 = var10[var11];
                if (var12.method540(28981) >= 4 && var12.method524(4, (byte) 67, 0).method498((byte) -120)) {
                    var9 = var12.method524(4, (byte) 96, 0).method529((byte) -72);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field2227 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field2236 = false;
            }
            field2206 = field2227;
        }
        if (field2227) {
            try {
                int[] var13 = new int[1];
                field2212.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "()V", line = 528)
    public static final void method891() {
        field2212.glDepthMask(false);
    }

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "()V", line = 532)
    public static final void method892() {
        if (field2212 != null) {
            try {
                class85.method654((byte) -38);
            } catch (Throwable var7) {
            }
            field2212 = null;
        }
        if (field2220 != null) {
            class285.method1975();
            try {
                if (GLContext.getCurrent() == field2220) {
                    field2220.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field2220.destroy();
            } catch (Throwable var5) {
            }
            field2220 = null;
        }
        if (field2205 != null) {
            try {
                field2205.setRealized(false);
            } catch (Throwable var4) {
            }
            field2205 = null;
        }
        class177.method1252();
        field2216 = false;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIII)V", line = 581)
    public static final void method893(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field2208 - arg0;
        int var8 = -arg1;
        int var9 = field2207 - arg1;
        field2212.glMatrixMode(5889);
        field2212.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field2212.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field2212.glViewport(0, 0, field2208, field2207);
        field2212.glMatrixMode(5888);
        field2212.glLoadIdentity();
        field2212.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field2237 = false;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V", line = 606)
    public static final void method894(int arg0) {
        if (field2204 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2212.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field2212.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field2212.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field2212.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field2212.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field2212.glTexEnvi(8960, 34161, 34165);
        }
        field2204 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(Z)V", line = 641)
    public static final void method895(boolean arg0) {
        if (field2211 == arg0) {
            return;
        }
        if (arg0) {
            field2212.glEnable(2912);
        } else {
            field2212.glDisable(2912);
        }
        field2211 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(Z)V", line = 663)
    private static final void method896(boolean arg0) {
        if (field2219 == arg0) {
            return;
        }
        if (arg0) {
            field2212.glEnableClientState(32885);
        } else {
            field2212.glDisableClientState(32885);
        }
        field2219 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "()V", line = 679)
    public static void method897() {
        field2214 = null;
        field2240 = null;
        field2235 = null;
        field2212 = null;
        field2205 = null;
        field2220 = null;
        field2209 = null;
    }

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "()V", line = 688)
    public static final void method898() {
        class125.method908(0, -5, 0);
        method880();
        method894(0);
        method881(0);
        method864(false);
        method865(false);
        method895(false);
        method885();
    }

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "()V", line = 698)
    public static final void method899() {
        class125.method908(0, -5, 0);
        method880();
        method894(0);
        method881(0);
        method864(false);
        method865(false);
        method895(false);
        method885();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 709)
    public static final int method900(Canvas arg0, int arg1) {
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
            field2205 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field2205.setRealized(true);
            int var4 = 0;
            while (true) {
                field2220 = field2205.createContext((GLContext) null);
                try {
                    int var5 = field2220.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class267.method1871(10, 1000L);
            }
            field2212 = field2220.getGL();
            new GLU();
            field2216 = true;
            field2208 = arg0.getSize().width;
            field2207 = arg0.getSize().height;
            int var7 = method890();
            if (var7 != 0) {
                method892();
                return var7;
            }
            method874();
            method871();
            field2212.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field2205.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method892();
                        return -3;
                    }
                    class267.method1871(10, 100L);
                }
            }
            field2212.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method892();
            return -5;
        }
    }
}
