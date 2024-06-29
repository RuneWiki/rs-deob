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

@OriginalClass("client!ab")
public class class257 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Z")
    public static boolean field4390 = false;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "F")
    private static float field4394 = 0.09765625F;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Z")
    private static boolean field4403 = false;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field4407 = 0;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    private static int field4401 = 0;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "Loh;")
    private static class258 field4414 = class153.method1046("radeon", 125);

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    private static int field4413 = 0;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "F")
    private static float field4412 = 0.0F;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Z")
    public static boolean field4406 = true;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "[F")
    private static float[] field4398 = new float[16];

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "Z")
    private static boolean field4418 = true;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "F")
    private static float field4405 = 0.0F;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    private static int field4400 = -1;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Z")
    private static boolean field4391 = true;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Z")
    private static boolean field4408 = true;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "Z")
    private static boolean field4426 = false;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "F")
    private static float field4416;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "F")
    private static float field4424;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    private static int field4410;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    private static int field4422;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    private static int field4425;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Ljava/lang/String;")
    private static String field4411;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Ljava/lang/String;")
    private static String field4420;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4409;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field4397;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4421;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Z")
    public static boolean field4392;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Z")
    public static boolean field4393;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Z")
    public static boolean field4395;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "Z")
    public static boolean field4399;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Z")
    public static boolean field4402;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Z")
    public static boolean field4404;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Z")
    public static boolean field4419;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(FF)V", line = 12)
    public static final void method1728(float arg0, float arg1) {
        if (field4426 || field4405 == arg0 && field4412 == arg1) {
            return;
        }
        field4405 = arg0;
        field4412 = arg1;
        if (arg1 == 0.0F) {
            field4398[10] = field4424;
            field4398[14] = field4416;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4416 * (1.0F - var2) / arg1;
            field4398[10] = field4424 + var4;
            field4398[14] = field4416 * var3;
        }
        field4409.glMatrixMode(5889);
        field4409.glLoadMatrixf(field4398, 0);
        field4409.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 42)
    private static final void method1729(boolean arg0) {
        if (field4406 == arg0) {
            return;
        }
        if (arg0) {
            field4409.glEnableClientState(32885);
        } else {
            field4409.glDisableClientState(32885);
        }
        field4406 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V", line = 53)
    public static final void method1730(boolean arg0) {
        if (field4391 == arg0) {
            return;
        }
        if (arg0) {
            field4409.glEnable(2929);
        } else {
            field4409.glDisable(2929);
        }
        field4391 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V", line = 68)
    public static void method1731() {
        field4414 = null;
        field4420 = null;
        field4411 = null;
        field4409 = null;
        field4421 = null;
        field4397 = null;
        field4398 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I", line = 78)
    private static final int method1732() {
        int var0 = 0;
        field4411 = field4409.glGetString(7936);
        field4420 = field4409.glGetString(7937);
        String var1 = field4411.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field4409.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field4425 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field4425 < 12) {
            var0 |= 0x2;
        }
        if (!field4409.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field4409.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field4409.glGetIntegerv(34018, var7, 0);
        field4415 = var7[0];
        field4409.glGetIntegerv(34929, var7, 0);
        field4410 = var7[0];
        field4409.glGetIntegerv(34930, var7, 0);
        field4422 = var7[0];
        if (field4415 < 2 || field4410 < 2 || field4422 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field4402 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field4393 = field4409.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field4419 = field4409.isExtensionAvailable("GL_ARB_multisample");
        field4395 = field4409.isExtensionAvailable("GL_ARB_texture_cube_map");
        field4404 = field4409.isExtensionAvailable("GL_ARB_vertex_program");
        field4399 = field4409.isExtensionAvailable("GL_EXT_texture3D");
        class258 var8 = method1752(field4420).method1774((byte) 111);
        if (var8.method1808(field4414, 0) != -1) {
            int var9 = 0;
            class258[] var10 = var8.method1812(47, 32, -1809).method1806(false, 32);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class258 var12 = var10[var11];
                if (var12.method1816(false) >= 4 && var12.method1813(4, 0, true).method1794(-17054)) {
                    var9 = var12.method1813(4, 0, true).method1807((byte) 127);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field4393 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field4399 = false;
            }
            field4392 = field4393;
        }
        if (field4393) {
            try {
                int[] var13 = new int[1];
                field4409.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()V", line = 184)
    public static final void method1733() {
        class107.method795(0, 58, 0);
        method1753();
        method1758(0);
        method1750(0);
        method1763(false);
        method1730(false);
        method1745(false);
        method1743();
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()V", line = 195)
    public static final void method1734() {
        if (class4.field62) {
            method1763(true);
            method1729(true);
        } else {
            method1763(false);
            method1729(false);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(F)V", line = 208)
    public static final void method1735(float arg0) {
        method1728(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 211)
    public static final void method1736(int arg0) {
        if (field4400 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4409.glDisable(3553);
        } else {
            if (field4400 == -1) {
                field4409.glEnable(3553);
            }
            field4409.glBindTexture(3553, arg0);
        }
        field4400 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V", line = 233)
    public static final void method1737() {
        class107.method795(0, 58, 0);
        method1753();
        method1736(-1);
        method1763(false);
        method1730(false);
        method1745(false);
        method1743();
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()V", line = 242)
    private static final void method1738() {
        field4426 = false;
        field4409.glDisable(3553);
        field4400 = -1;
        field4409.glTexEnvi(8960, 8704, 34160);
        field4409.glTexEnvi(8960, 34161, 8448);
        field4413 = 0;
        field4409.glTexEnvi(8960, 34162, 8448);
        field4401 = 0;
        field4409.glEnable(2896);
        field4409.glEnable(2912);
        field4409.glEnable(2929);
        field4418 = true;
        field4391 = true;
        field4408 = true;
        class253.method1713((byte) 108);
        field4409.glActiveTexture(33985);
        field4409.glTexEnvi(8960, 8704, 34160);
        field4409.glTexEnvi(8960, 34161, 8448);
        field4409.glTexEnvi(8960, 34162, 8448);
        field4409.glActiveTexture(33984);
        field4409.setSwapInterval(0);
        field4409.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4409.glShadeModel(7425);
        field4409.glClearDepth(1.0D);
        field4409.glDepthFunc(515);
        method1754();
        field4409.glMatrixMode(5890);
        field4409.glLoadIdentity();
        field4409.glPolygonMode(1028, 6914);
        field4409.glEnable(2884);
        field4409.glCullFace(1029);
        field4409.glEnable(3042);
        field4409.glBlendFunc(770, 771);
        field4409.glEnable(3008);
        field4409.glAlphaFunc(516, 0.0F);
        field4409.glEnableClientState(32884);
        field4409.glEnableClientState(32885);
        field4406 = true;
        field4409.glEnableClientState(32886);
        field4409.glEnableClientState(32888);
        field4409.glMatrixMode(5888);
        field4409.glLoadIdentity();
        class304.method2123();
        class267.method1886();
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "()V", line = 288)
    public static final void method1739() {
        class107.method795(0, 58, 0);
        method1753();
        method1758(0);
        method1750(0);
        method1763(false);
        method1730(false);
        method1745(false);
        method1743();
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "()V", line = 299)
    public static final void method1740() {
        int[] var0 = new int[2];
        field4409.glGetIntegerv(3073, var0, 0);
        field4409.glGetIntegerv(3074, var0, 1);
        field4409.glDrawBuffer(1026);
        field4409.glReadBuffer(1024);
        method1736(-1);
        field4409.glPushAttrib(8192);
        field4409.glDisable(2912);
        field4409.glDisable(3042);
        field4409.glDisable(2929);
        field4409.glDisable(3008);
        field4409.glRasterPos2i(0, 0);
        field4409.glCopyPixels(0, 0, field4396, field4423, 6144);
        field4409.glPopAttrib();
        field4409.glDrawBuffer(var0[0]);
        field4409.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 322)
    public static final void method1741(Canvas arg0) {
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

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "()V", line = 347)
    public static final void method1742() {
        class107.method795(0, 58, 0);
        method1753();
        method1758(1);
        method1750(1);
        method1763(false);
        method1730(false);
        method1745(false);
        method1743();
    }

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "()V", line = 357)
    public static final void method1743() {
        if (field4403) {
            field4409.glMatrixMode(5890);
            field4409.glLoadIdentity();
            field4409.glMatrixMode(5888);
            field4403 = false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)V", line = 367)
    public static final void method1744(int arg0, int arg1, int arg2, int arg3) {
        method1760(0, 0, field4396, field4423, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(Z)V", line = 370)
    public static final void method1745(boolean arg0) {
        if (field4408 == arg0) {
            return;
        }
        if (arg0) {
            field4409.glEnable(2912);
        } else {
            field4409.glDisable(2912);
        }
        field4408 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "()V", line = 382)
    public static final void method1746() {
        field4409.glDepthMask(false);
    }

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "()F", line = 389)
    public static final float method1747() {
        return field4405;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V", line = 392)
    public static final void method1748(int arg0, int arg1) {
        field4396 = arg0;
        field4423 = arg1;
        field4426 = false;
    }

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "()V", line = 397)
    public static final void method1749() {
        if (field4409 != null) {
            try {
                class19.method124(-24692);
            } catch (Throwable var7) {
            }
            field4409 = null;
        }
        if (field4397 != null) {
            class196.method1321();
            try {
                if (GLContext.getCurrent() == field4397) {
                    field4397.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field4397.destroy();
            } catch (Throwable var5) {
            }
            field4397 = null;
        }
        if (field4421 != null) {
            try {
                field4421.setRealized(false);
            } catch (Throwable var4) {
            }
            field4421 = null;
        }
        class267.method1895();
        field4390 = false;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 445)
    public static final void method1750(int arg0) {
        if (field4401 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4409.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4409.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4409.glTexEnvi(8960, 34162, 260);
        }
        field4401 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "()V", line = 460)
    public static final void method1751() {
        field4409.glClear(256);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/String;)Loh;", line = 468)
    private static final class258 method1752(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class285.method2004(var1.length, var1, 0, 0);
    }

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "()V", line = 477)
    private static final void method1753() {
        if (field4426) {
            return;
        }
        field4409.glMatrixMode(5889);
        field4409.glLoadIdentity();
        field4409.glOrtho(0.0D, (double) field4396, 0.0D, (double) field4423, -1.0D, 1.0D);
        field4409.glViewport(0, 0, field4396, field4423);
        field4409.glMatrixMode(5888);
        field4409.glLoadIdentity();
        field4426 = true;
    }

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "()V", line = 494)
    public static final void method1754() {
        field4409.glDepthMask(true);
    }

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "()V", line = 498)
    private static final void method1755() {
        int[] var0 = new int[1];
        field4409.glGenTextures(1, var0, 0);
        field4417 = var0[0];
        field4409.glBindTexture(3553, field4417);
        field4409.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class215.method1462(-100);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII)V", line = 510)
    public static final void method1756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4396 - arg0;
        int var8 = -arg1;
        int var9 = field4423 - arg1;
        field4409.glMatrixMode(5889);
        field4409.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4409.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field4409.glViewport(0, 0, field4396, field4423);
        field4409.glMatrixMode(5888);
        field4409.glLoadIdentity();
        field4409.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4426 = false;
    }

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "()F", line = 533)
    public static final float method1757() {
        return field4412;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V", line = 536)
    public static final void method1758(int arg0) {
        if (field4413 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4409.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4409.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4409.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4409.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4409.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4409.glTexEnvi(8960, 34161, 34165);
        }
        field4413 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(FFFFFF)V", line = 561)
    private static final void method1759(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field4398[0] = var6 / (arg1 - arg0);
        field4398[1] = 0.0F;
        field4398[2] = 0.0F;
        field4398[3] = 0.0F;
        field4398[4] = 0.0F;
        field4398[5] = var6 / (arg3 - arg2);
        field4398[6] = 0.0F;
        field4398[7] = 0.0F;
        field4398[8] = (arg0 + arg1) / (arg1 - arg0);
        field4398[9] = (arg2 + arg3) / (arg3 - arg2);
        field4398[10] = field4424 = -(arg4 + arg5) / (arg5 - arg4);
        field4398[11] = -1.0F;
        field4398[12] = 0.0F;
        field4398[13] = 0.0F;
        field4398[14] = field4416 = -(arg5 * var6) / (arg5 - arg4);
        field4398[15] = 0.0F;
        field4409.glLoadMatrixf(field4398, 0);
        field4405 = 0.0F;
        field4412 = 0.0F;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIFFII)V", line = 590)
    public static final void method1760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4409.glMatrixMode(5889);
        field4409.glLoadIdentity();
        method1759((float) var10 * field4394, (float) var11 * field4394, (float) (-var13) * field4394, (float) (-var12) * field4394, 50.0F, 3584.0F);
        field4409.glViewport(arg0, field4423 - arg1 - arg3, arg2, arg3);
        field4409.glMatrixMode(5888);
        field4409.glLoadIdentity();
        field4409.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4409.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4409.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4426 = false;
        class193.field3411 = var10;
        class313.field5321 = var11;
        class301.field5153 = var12;
        class280.field4815 = var13;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 625)
    public static final int method1761(Canvas arg0, int arg1) {
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
            field4421 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field4421.setRealized(true);
            int var4 = 0;
            while (true) {
                field4397 = field4421.createContext((GLContext) null);
                try {
                    int var5 = field4397.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class237.method1628((byte) -88, 1000L);
            }
            field4409 = field4397.getGL();
            new GLU();
            field4390 = true;
            field4396 = arg0.getSize().width;
            field4423 = arg0.getSize().height;
            int var7 = method1732();
            if (var7 != 0) {
                method1749();
                return var7;
            }
            method1755();
            method1738();
            field4409.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field4421.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1749();
                        return -3;
                    }
                    class237.method1628((byte) -88, 100L);
                }
            }
            field4409.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1749();
            return -5;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(FFF)V", line = 729)
    public static final void method1762(float arg0, float arg1, float arg2) {
        field4409.glMatrixMode(5890);
        if (field4403) {
            field4409.glLoadIdentity();
        }
        field4409.glTranslatef(arg0, arg1, arg2);
        field4409.glMatrixMode(5888);
        field4403 = true;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(Z)V", line = 749)
    public static final void method1763(boolean arg0) {
        if (field4418 == arg0) {
            return;
        }
        if (arg0) {
            field4409.glEnable(2896);
        } else {
            field4409.glDisable(2896);
        }
        field4418 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "()V", line = 765)
    public static final void method1764() {
        try {
            field4421.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V", line = 790)
    public static final void method1765(int arg0) {
        field4409.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4409.glClear(16640);
        field4409.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }
}
