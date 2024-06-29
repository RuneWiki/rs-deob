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

@OriginalClass("client!he")
public class class264 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Lck;")
    private static class119 field4289 = class298.method1987((byte) 86, "ATI");

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Z")
    private static boolean field4304 = true;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    private static int field4301 = 0;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Z")
    public static boolean field4292 = true;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Z")
    private static boolean field4311 = true;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "Z")
    private static boolean field4309 = true;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "[F")
    private static float[] field4317 = new float[16];

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lck;")
    private static class119 field4291 = class298.method1987((byte) 59, "8");

    @OriginalMember(owner = "client!he", name = "E", descriptor = "Z")
    private static boolean field4318 = false;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field4319 = 0;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    private static int field4288 = 0;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Z")
    private static boolean field4312 = false;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "F")
    private static float field4316 = 0.09765625F;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "F")
    private static float field4320 = 0.0F;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "Lck;")
    private static class119 field4323 = class298.method1987((byte) 111, "9");

    @OriginalMember(owner = "client!he", name = "f", descriptor = "F")
    private static float field4293 = 0.0F;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Lck;")
    private static class119 field4299 = class298.method1987((byte) 62, "7");

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    private static int field4324 = -1;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "Z")
    private static boolean field4307 = false;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "F")
    private static float field4294;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "F")
    private static float field4295;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    private static int field4302;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    private static int field4321;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    private static int field4326;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Loc;")
    private static class217 field4296;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4313;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field4315;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4325;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Z")
    public static boolean field4297;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Z")
    public static boolean field4300;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Z")
    public static boolean field4303;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "Z")
    public static boolean field4305;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "Z")
    public static boolean field4310;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "Z")
    public static boolean field4314;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "Z")
    public static boolean field4322;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V", line = 12)
    public static final void method1706() {
        if (field4307) {
            field4313.glMatrixMode(5890);
            field4313.glLoadIdentity();
            field4313.glMatrixMode(5888);
            field4307 = false;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V", line = 23)
    public static final void method1707() {
        class103.method677(0, 30359, 0);
        method1721();
        method1719(0);
        method1720(0);
        method1710(false);
        method1726(false);
        method1718(false);
        method1706();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(FFF)V", line = 33)
    public static final void method1708(float arg0, float arg1, float arg2) {
        field4313.glMatrixMode(5890);
        if (field4307) {
            field4313.glLoadIdentity();
        }
        field4313.glTranslatef(arg0, arg1, arg2);
        field4313.glMatrixMode(5888);
        field4307 = true;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIFFII)V", line = 43)
    public static final void method1709(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4313.glMatrixMode(5889);
        field4313.glLoadIdentity();
        method1717((float) var10 * field4316, (float) var11 * field4316, (float) (-var13) * field4316, (float) (-var12) * field4316, 50.0F, 3584.0F);
        field4313.glViewport(arg0, field4290 - arg1 - arg3, arg2, arg3);
        field4313.glMatrixMode(5888);
        field4313.glLoadIdentity();
        field4313.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4313.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4313.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4318 = false;
        class120.field1892 = var10;
        class85.field1276 = var11;
        class124.field1904 = var12;
        class118.field1782 = var13;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V", line = 70)
    public static final void method1710(boolean arg0) {
        if (field4311 == arg0) {
            return;
        }
        if (arg0) {
            field4313.glEnable(2896);
        } else {
            field4313.glDisable(2896);
        }
        field4311 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "()V", line = 82)
    public static final void method1711() {
        try {
            field4325.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)V", line = 90)
    private static final void method1712(boolean arg0) {
        if (field4292 == arg0) {
            return;
        }
        if (arg0) {
            field4313.glEnableClientState(32885);
        } else {
            field4313.glDisableClientState(32885);
        }
        field4292 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "()V", line = 110)
    public static void method1713() {
        field4289 = null;
        field4299 = null;
        field4291 = null;
        field4323 = null;
        field4296 = null;
        field4313 = null;
        field4325 = null;
        field4315 = null;
        field4317 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Z", line = 121)
    private static final boolean method1714(int arg0, int arg1) {
        field4306 = arg0;
        field4290 = arg1;
        field4313 = field4315.getGL();
        new GLU();
        if (!field4312) {
            if (!method1731()) {
                return false;
            }
            field4312 = true;
        }
        int[] var2 = new int[1];
        field4313.glGenTextures(1, var2, 0);
        field4298 = var2[0];
        field4313.glBindTexture(3553, field4298);
        field4313.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class106.method691((byte) -79);
        field4318 = false;
        field4313.glDisable(3553);
        field4324 = -1;
        field4313.glTexEnvi(8960, 8704, 34160);
        field4313.glTexEnvi(8960, 34161, 8448);
        field4288 = 0;
        field4313.glTexEnvi(8960, 34162, 8448);
        field4301 = 0;
        field4313.glEnable(2896);
        field4313.glEnable(2912);
        field4313.glEnable(2929);
        field4311 = true;
        field4304 = true;
        field4309 = true;
        class279.method1857(0);
        field4313.glActiveTexture(33985);
        field4313.glTexEnvi(8960, 8704, 34160);
        field4313.glTexEnvi(8960, 34161, 8448);
        field4313.glTexEnvi(8960, 34162, 8448);
        field4313.glActiveTexture(33984);
        field4313.setSwapInterval(0);
        field4313.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4313.glShadeModel(7425);
        field4313.glClearDepth(1.0D);
        field4313.glDepthFunc(515);
        method1739();
        field4313.glMatrixMode(5890);
        field4313.glLoadIdentity();
        field4313.glPolygonMode(1028, 6914);
        field4313.glEnable(2884);
        field4313.glCullFace(1029);
        field4313.glEnable(3042);
        field4313.glBlendFunc(770, 771);
        field4313.glEnable(3008);
        field4313.glAlphaFunc(516, 0.0F);
        field4313.glEnableClientState(32884);
        field4313.glEnableClientState(32885);
        field4292 = true;
        field4313.glEnableClientState(32886);
        field4313.glEnableClientState(32888);
        field4313.glMatrixMode(5888);
        field4313.glLoadIdentity();
        class178.method1141();
        class125.method833();
        return true;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "()V", line = 191)
    public static final void method1715() {
        class103.method677(0, 30359, 0);
        method1721();
        method1722(-1);
        method1710(false);
        method1726(false);
        method1718(false);
        method1706();
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "()V", line = 202)
    public static final void method1716() {
        class103.method677(0, 30359, 0);
        method1721();
        method1719(1);
        method1720(1);
        method1710(false);
        method1726(false);
        method1718(false);
        method1706();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(FFFFFF)V", line = 215)
    private static final void method1717(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field4317[0] = var6 / (arg1 - arg0);
        field4317[1] = 0.0F;
        field4317[2] = 0.0F;
        field4317[3] = 0.0F;
        field4317[4] = 0.0F;
        field4317[5] = var6 / (arg3 - arg2);
        field4317[6] = 0.0F;
        field4317[7] = 0.0F;
        field4317[8] = (arg0 + arg1) / (arg1 - arg0);
        field4317[9] = (arg2 + arg3) / (arg3 - arg2);
        field4317[10] = field4294 = -(arg4 + arg5) / (arg5 - arg4);
        field4317[11] = -1.0F;
        field4317[12] = 0.0F;
        field4317[13] = 0.0F;
        field4317[14] = field4295 = -(arg5 * var6) / (arg5 - arg4);
        field4317[15] = 0.0F;
        field4313.glLoadMatrixf(field4317, 0);
        field4320 = 0.0F;
        field4293 = 0.0F;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(Z)V", line = 237)
    public static final void method1718(boolean arg0) {
        if (field4309 == arg0) {
            return;
        }
        if (arg0) {
            field4313.glEnable(2912);
        } else {
            field4313.glDisable(2912);
        }
        field4309 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 250)
    public static final void method1719(int arg0) {
        if (field4288 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4313.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4313.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4313.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4313.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4313.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4313.glTexEnvi(8960, 34161, 34165);
        }
        field4288 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 276)
    public static final void method1720(int arg0) {
        if (field4301 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4313.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4313.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4313.glTexEnvi(8960, 34162, 260);
        }
        field4301 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "()V", line = 291)
    private static final void method1721() {
        if (field4318) {
            return;
        }
        field4313.glMatrixMode(5889);
        field4313.glLoadIdentity();
        field4313.glOrtho(0.0D, (double) field4306, 0.0D, (double) field4290, -1.0D, 1.0D);
        field4313.glViewport(0, 0, field4306, field4290);
        field4313.glMatrixMode(5888);
        field4313.glLoadIdentity();
        field4318 = true;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V", line = 303)
    public static final void method1722(int arg0) {
        if (field4324 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4313.glDisable(3553);
        } else {
            if (field4324 == -1) {
                field4313.glEnable(3553);
            }
            field4313.glBindTexture(3553, arg0);
        }
        field4324 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)V", line = 320)
    public static final void method1723(int arg0, int arg1, int arg2, int arg3) {
        method1709(0, 0, field4306, field4290, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!he", name = "h", descriptor = "()F", line = 323)
    public static final float method1724() {
        return field4293;
    }

    @OriginalMember(owner = "client!he", name = "i", descriptor = "()V", line = 327)
    public static final void method1725() {
        field4313.glDepthMask(false);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(Z)V", line = 330)
    public static final void method1726(boolean arg0) {
        if (field4304 == arg0) {
            return;
        }
        if (arg0) {
            field4313.glEnable(2929);
        } else {
            field4313.glDisable(2929);
        }
        field4304 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/awt/Canvas;I)Z", line = 341)
    public static final boolean method1727(Canvas arg0, int arg1) {
        if (!arg0.isDisplayable()) {
            throw new IllegalStateException("Supplied canvas not on screen");
        }
        GLCapabilities var2 = new GLCapabilities();
        if (arg1 > 0) {
            var2.setSampleBuffers(true);
            var2.setNumSamples(arg1);
        }
        GLDrawableFactory var3 = GLDrawableFactory.getFactory();
        field4325 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
        field4325.setRealized(true);
        while (true) {
            field4315 = field4325.createContext((GLContext) null);
            try {
                int var4 = field4315.makeCurrent();
                if (var4 != 0) {
                    break;
                }
            } catch (Exception var9) {
            }
            class232.method1493(1000L, (byte) -51);
        }
        int var6 = arg0.getWidth();
        int var7 = arg0.getHeight();
        boolean var8 = method1714(var6, var7);
        if (var8) {
            field4313.glClear(16384);
            field4325.swapBuffers();
            field4313.glClear(16384);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "j", descriptor = "()V", line = 394)
    public static final void method1728() {
        field4313.glClear(256);
    }

    @OriginalMember(owner = "client!he", name = "k", descriptor = "()V", line = 406)
    public static final void method1729() {
        int[] var0 = new int[2];
        field4313.glGetIntegerv(3073, var0, 0);
        field4313.glGetIntegerv(3074, var0, 1);
        field4313.glDrawBuffer(1026);
        field4313.glReadBuffer(1024);
        method1722(-1);
        field4313.glPushAttrib(8192);
        field4313.glDisable(2912);
        field4313.glDisable(3042);
        field4313.glDisable(2929);
        field4313.glDisable(3008);
        field4313.glRasterPos2i(0, 0);
        field4313.glCopyPixels(0, 0, field4306, field4290, 6144);
        field4313.glPopAttrib();
        field4313.glDrawBuffer(var0[0]);
        field4313.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V", line = 427)
    public static final void method1730(int arg0) {
        field4313.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4313.glClear(16640);
    }

    @OriginalMember(owner = "client!he", name = "l", descriptor = "()Z", line = 435)
    private static final boolean method1731() {
        String var0 = field4313.glGetString(7936).toLowerCase();
        if (var0.indexOf("microsoft") != -1) {
            return false;
        } else if (var0.indexOf("brian paul") == -1 && var0.indexOf("mesa") == -1) {
            String var1 = field4313.glGetString(7938);
            String[] var2 = var1.split("[. ]");
            if (var2.length < 2) {
                return false;
            }
            try {
                int var3 = Integer.parseInt(var2[0]);
                int var4 = Integer.parseInt(var2[1]);
                field4321 = var3 * 10 + var4;
            } catch (NumberFormatException var11) {
                return false;
            }
            if (field4321 < 12) {
                return false;
            } else if (!field4313.isExtensionAvailable("GL_ARB_texture_env_combine")) {
                return false;
            } else if (field4313.isExtensionAvailable("GL_ARB_multitexture")) {
                int[] var6 = new int[1];
                field4313.glGetIntegerv(34018, var6, 0);
                field4308 = var6[0];
                field4313.glGetIntegerv(34929, var6, 0);
                field4302 = var6[0];
                field4313.glGetIntegerv(34930, var6, 0);
                field4326 = var6[0];
                if (field4308 < 2 || field4302 < 2 || field4326 < 2) {
                    return false;
                }
                String var7 = field4313.glGetString(7937);
                byte[] var8;
                try {
                    var8 = var7.getBytes("ISO-8859-1");
                } catch (UnsupportedEncodingException var10) {
                    var8 = var7.getBytes();
                }
                field4296 = class261.method1675((byte) 124, class250.method1615(var8, var8.length, 0, -126));
                field4297 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                field4314 = field4313.isExtensionAvailable("GL_ARB_vertex_buffer_object");
                field4310 = field4313.isExtensionAvailable("GL_ARB_multisample");
                field4305 = field4313.isExtensionAvailable("GL_ARB_texture_cube_map");
                field4300 = field4313.isExtensionAvailable("GL_ARB_vertex_program");
                field4322 = field4313.isExtensionAvailable("GL_EXT_texture3D");
                if (field4296.field3508.method784(field4289, 88)) {
                    if (field4296.field3506.method784(field4299, 115)) {
                        field4314 = false;
                    }
                    if (field4296.field3506.method784(field4299, 57) || field4296.field3506.method784(field4291, 45)) {
                        field4322 = false;
                    } else if (field4296.field3506.method784(field4323, 60) && field4296.field3492 <= 250) {
                        field4322 = false;
                    }
                    field4303 = field4314;
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "m", descriptor = "()V", line = 514)
    public static final void method1732() {
        class103.method677(0, 30359, 0);
        method1721();
        method1719(5);
        method1720(0);
        method1710(false);
        method1726(false);
        method1718(false);
        method1706();
    }

    @OriginalMember(owner = "client!he", name = "n", descriptor = "()V", line = 526)
    public static final void method1733() {
        if (field4315 != null) {
            if (GLContext.getCurrent() == field4315) {
                field4315.release();
            }
            field4315.destroy();
            field4315 = null;
        }
        if (field4325 != null) {
            field4325.setRealized(false);
            field4325 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(FF)V", line = 547)
    public static final void method1734(float arg0, float arg1) {
        if (field4318 || field4320 == arg0 && field4293 == arg1) {
            return;
        }
        field4320 = arg0;
        field4293 = arg1;
        if (arg1 == 0.0F) {
            field4317[10] = field4294;
            field4317[14] = field4295;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4295 * (1.0F - var2) / arg1;
            field4317[10] = field4294 + var4;
            field4317[14] = field4295 * var3;
        }
        field4313.glMatrixMode(5889);
        field4313.glLoadMatrixf(field4317, 0);
        field4313.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIII)V", line = 581)
    public static final void method1735(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4306 - arg0;
        int var8 = -arg1;
        int var9 = field4290 - arg1;
        field4313.glMatrixMode(5889);
        field4313.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4313.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field4313.glViewport(0, 0, field4306, field4290);
        field4313.glMatrixMode(5888);
        field4313.glLoadIdentity();
        field4313.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4318 = false;
    }

    @OriginalMember(owner = "client!he", name = "o", descriptor = "()V", line = 605)
    public static final void method1736() {
        if (class6.field146) {
            method1710(true);
            method1712(true);
        } else {
            method1710(false);
            method1712(false);
        }
    }

    @OriginalMember(owner = "client!he", name = "p", descriptor = "()F", line = 625)
    public static final float method1737() {
        return field4320;
    }

    @OriginalMember(owner = "client!he", name = "q", descriptor = "()V", line = 630)
    public static final void method1738() {
        class103.method677(0, 30359, 0);
        method1721();
        method1719(0);
        method1720(0);
        method1710(false);
        method1726(false);
        method1718(false);
        method1706();
    }

    @OriginalMember(owner = "client!he", name = "r", descriptor = "()V", line = 648)
    public static final void method1739() {
        field4313.glDepthMask(true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(F)V", line = 666)
    public static final void method1740(float arg0) {
        method1734(3000.0F, arg0 * 1.5F);
    }
}
