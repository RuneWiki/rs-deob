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

@OriginalClass("client!ia")
public class class253 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Z")
    public static boolean field4300 = true;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    private static int field4303 = -1;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Z")
    private static boolean field4311 = false;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lke;")
    private static class256 field4309 = class316.method2202("radeon", 27626);

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    private static int field4307 = 0;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[F")
    private static float[] field4317 = new float[16];

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "F")
    private static float field4313 = 0.0F;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "Z")
    private static boolean field4296 = true;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "Z")
    private static boolean field4321 = true;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Z")
    private static boolean field4301 = false;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "F")
    private static float field4310 = 0.09765625F;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Z")
    private static boolean field4314 = true;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "F")
    private static float field4332 = 0.0F;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    private static int field4325 = 0;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "Z")
    public static boolean field4323 = false;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    public static int field4326 = 0;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "F")
    private static float field4298;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "F")
    private static float field4315;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    private static int field4308;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    private static int field4312;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    private static int field4322;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Ljava/lang/String;")
    private static String field4305;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Ljava/lang/String;")
    private static String field4316;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4319;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field4302;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4324;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Z")
    public static boolean field4299;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Z")
    public static boolean field4304;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Z")
    public static boolean field4318;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "Z")
    public static boolean field4320;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Z")
    public static boolean field4327;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Z")
    public static boolean field4330;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "Z")
    public static boolean field4331;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 10)
    public static final void method1703(boolean arg0) {
        if (field4321 == arg0) {
            return;
        }
        if (arg0) {
            field4319.glEnable(2896);
        } else {
            field4319.glDisable(2896);
        }
        field4321 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V", line = 23)
    public static final void method1704(int arg0) {
        if (field4307 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4319.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4319.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4319.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4319.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4319.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4319.glTexEnvi(8960, 34161, 34165);
        }
        field4307 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V", line = 47)
    public static final void method1705() {
        class277.method1910(0, 0, -19856);
        method1726();
        method1704(0);
        method1731(0);
        method1703(false);
        method1730(false);
        method1716(false);
        method1737();
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()F", line = 58)
    public static final float method1706() {
        return field4332;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()V", line = 62)
    public static final void method1707() {
        int[] var0 = new int[2];
        field4319.glGetIntegerv(3073, var0, 0);
        field4319.glGetIntegerv(3074, var0, 1);
        field4319.glDrawBuffer(1026);
        field4319.glReadBuffer(1024);
        method1714(-1);
        field4319.glPushAttrib(8192);
        field4319.glDisable(2912);
        field4319.glDisable(3042);
        field4319.glDisable(2929);
        field4319.glDisable(3008);
        field4319.glRasterPos2i(0, 0);
        field4319.glCopyPixels(0, 0, field4297, field4329, 6144);
        field4319.glPopAttrib();
        field4319.glDrawBuffer(var0[0]);
        field4319.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FFFFFF)V", line = 90)
    private static final void method1708(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
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
        field4317[10] = field4315 = -(arg4 + arg5) / (arg5 - arg4);
        field4317[11] = -1.0F;
        field4317[12] = 0.0F;
        field4317[13] = 0.0F;
        field4317[14] = field4298 = -(arg5 * var6) / (arg5 - arg4);
        field4317[15] = 0.0F;
        field4319.glLoadMatrixf(field4317, 0);
        field4313 = 0.0F;
        field4332 = 0.0F;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "()V", line = 117)
    public static final void method1709() {
        field4319.glDepthMask(false);
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "()F", line = 120)
    public static final float method1710() {
        return field4313;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIII)V", line = 125)
    public static final void method1711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4297 - arg0;
        int var8 = -arg1;
        int var9 = field4329 - arg1;
        field4319.glMatrixMode(5889);
        field4319.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4319.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field4319.glViewport(0, 0, field4297, field4329);
        field4319.glMatrixMode(5888);
        field4319.glLoadIdentity();
        field4319.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4311 = false;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "()V", line = 151)
    public static final void method1712() {
        class277.method1910(0, 0, -19856);
        method1726();
        method1704(1);
        method1731(1);
        method1703(false);
        method1730(false);
        method1716(false);
        method1737();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V", line = 166)
    public static final void method1713(int arg0, int arg1) {
        field4297 = arg0;
        field4329 = arg1;
        field4311 = false;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V", line = 171)
    public static final void method1714(int arg0) {
        if (field4303 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4319.glDisable(3553);
        } else {
            if (field4303 == -1) {
                field4319.glEnable(3553);
            }
            field4319.glBindTexture(3553, arg0);
        }
        field4303 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "()I", line = 189)
    private static final int method1715() {
        int var0 = 0;
        field4316 = field4319.glGetString(7936);
        field4305 = field4319.glGetString(7937);
        String var1 = field4316.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field4319.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field4308 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field4308 < 12) {
            var0 |= 0x2;
        }
        if (!field4319.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field4319.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field4319.glGetIntegerv(34018, var7, 0);
        field4328 = var7[0];
        field4319.glGetIntegerv(34929, var7, 0);
        field4312 = var7[0];
        field4319.glGetIntegerv(34930, var7, 0);
        field4322 = var7[0];
        if (field4328 < 2 || field4312 < 2 || field4322 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field4331 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field4304 = field4319.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field4327 = field4319.isExtensionAvailable("GL_ARB_multisample");
        field4330 = field4319.isExtensionAvailable("GL_ARB_texture_cube_map");
        field4320 = field4319.isExtensionAvailable("GL_ARB_vertex_program");
        field4299 = field4319.isExtensionAvailable("GL_EXT_texture3D");
        class256 var8 = method1727(field4305).method1771(false);
        if (var8.method1779(field4309, (byte) -116) != -1) {
            int var9 = 0;
            class256[] var10 = var8.method1794(47, 32, 127).method1784((byte) 126, 32);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class256 var12 = var10[var11];
                if (var12.method1799(127) >= 4 && var12.method1777(4, 25163, 0).method1785(false)) {
                    var9 = var12.method1777(4, 25163, 0).method1770(0);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field4304 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field4299 = false;
            }
            field4318 = field4304;
        }
        if (field4304) {
            try {
                int[] var13 = new int[1];
                field4319.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)V", line = 299)
    public static final void method1716(boolean arg0) {
        if (field4296 == arg0) {
            return;
        }
        if (arg0) {
            field4319.glEnable(2912);
        } else {
            field4319.glDisable(2912);
        }
        field4296 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIFFII)V", line = 312)
    public static final void method1717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4319.glMatrixMode(5889);
        field4319.glLoadIdentity();
        method1708((float) var10 * field4310, (float) var11 * field4310, (float) (-var13) * field4310, (float) (-var12) * field4310, 50.0F, 3584.0F);
        field4319.glViewport(arg0, field4329 - arg1 - arg3, arg2, arg3);
        field4319.glMatrixMode(5888);
        field4319.glLoadIdentity();
        field4319.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4319.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4319.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4311 = false;
        class105.field1885 = var10;
        class91.field1667 = var11;
        class295.field5122 = var12;
        class49.field890 = var13;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(F)V", line = 339)
    public static final void method1718(float arg0) {
        method1739(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "()V", line = 343)
    private static final void method1719() {
        int[] var0 = new int[1];
        field4319.glGenTextures(1, var0, 0);
        field4306 = var0[0];
        field4319.glBindTexture(3553, field4306);
        field4319.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class284.method1990(-965557044);
    }

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "()V", line = 351)
    public static final void method1720() {
        field4319.glClear(256);
    }

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "()V", line = 356)
    public static final void method1721() {
        if (class193.field3531) {
            method1703(true);
            method1735(true);
        } else {
            method1703(false);
            method1735(false);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V", line = 369)
    public static final void method1722(int arg0) {
        field4319.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4319.glClear(16640);
        field4319.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FFF)V", line = 375)
    public static final void method1723(float arg0, float arg1, float arg2) {
        field4319.glMatrixMode(5890);
        if (field4301) {
            field4319.glLoadIdentity();
        }
        field4319.glTranslatef(arg0, arg1, arg2);
        field4319.glMatrixMode(5888);
        field4301 = true;
    }

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "()V", line = 384)
    public static final void method1724() {
        if (field4319 != null) {
            try {
                class148.method1080(true);
            } catch (Throwable var7) {
            }
            field4319 = null;
        }
        if (field4302 != null) {
            class221.method1522();
            try {
                if (GLContext.getCurrent() == field4302) {
                    field4302.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field4302.destroy();
            } catch (Throwable var5) {
            }
            field4302 = null;
        }
        if (field4324 != null) {
            try {
                field4324.setRealized(false);
            } catch (Throwable var4) {
            }
            field4324 = null;
        }
        class245.method1651();
        field4323 = false;
    }

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "()V", line = 445)
    private static final void method1725() {
        field4311 = false;
        field4319.glDisable(3553);
        field4303 = -1;
        field4319.glTexEnvi(8960, 8704, 34160);
        field4319.glTexEnvi(8960, 34161, 8448);
        field4307 = 0;
        field4319.glTexEnvi(8960, 34162, 8448);
        field4325 = 0;
        field4319.glEnable(2896);
        field4319.glEnable(2912);
        field4319.glEnable(2929);
        field4321 = true;
        field4314 = true;
        field4296 = true;
        class74.method563((byte) 75);
        field4319.glActiveTexture(33985);
        field4319.glTexEnvi(8960, 8704, 34160);
        field4319.glTexEnvi(8960, 34161, 8448);
        field4319.glTexEnvi(8960, 34162, 8448);
        field4319.glActiveTexture(33984);
        field4319.setSwapInterval(0);
        field4319.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4319.glShadeModel(7425);
        field4319.glClearDepth(1.0D);
        field4319.glDepthFunc(515);
        method1728();
        field4319.glMatrixMode(5890);
        field4319.glLoadIdentity();
        field4319.glPolygonMode(1028, 6914);
        field4319.glEnable(2884);
        field4319.glCullFace(1029);
        field4319.glEnable(3042);
        field4319.glBlendFunc(770, 771);
        field4319.glEnable(3008);
        field4319.glAlphaFunc(516, 0.0F);
        field4319.glEnableClientState(32884);
        field4319.glEnableClientState(32885);
        field4300 = true;
        field4319.glEnableClientState(32886);
        field4319.glEnableClientState(32888);
        field4319.glMatrixMode(5888);
        field4319.glLoadIdentity();
        class169.method1234();
        class245.method1645();
    }

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "()V", line = 492)
    private static final void method1726() {
        if (field4311) {
            return;
        }
        field4319.glMatrixMode(5889);
        field4319.glLoadIdentity();
        field4319.glOrtho(0.0D, (double) field4297, 0.0D, (double) field4329, -1.0D, 1.0D);
        field4319.glViewport(0, 0, field4297, field4329);
        field4319.glMatrixMode(5888);
        field4319.glLoadIdentity();
        field4311 = true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/String;)Lke;", line = 511)
    private static final class256 method1727(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class49.method392(var1, (byte) 119, 0, var1.length);
    }

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "()V", line = 519)
    public static final void method1728() {
        field4319.glDepthMask(true);
    }

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "()V", line = 523)
    public static final void method1729() {
        class277.method1910(0, 0, -19856);
        method1726();
        method1704(0);
        method1731(0);
        method1703(false);
        method1730(false);
        method1716(false);
        method1737();
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)V", line = 535)
    public static final void method1730(boolean arg0) {
        if (field4314 == arg0) {
            return;
        }
        if (arg0) {
            field4319.glEnable(2929);
        } else {
            field4319.glDisable(2929);
        }
        field4314 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V", line = 548)
    public static final void method1731(int arg0) {
        if (field4325 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4319.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4319.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4319.glTexEnvi(8960, 34162, 260);
        }
        field4325 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "()V", line = 566)
    public static final void method1732() {
        class277.method1910(0, 0, -19856);
        method1726();
        method1714(-1);
        method1703(false);
        method1730(false);
        method1716(false);
        method1737();
    }

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "()V", line = 596)
    public static final void method1733() {
        try {
            field4324.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "()V", line = 603)
    public static void method1734() {
        field4309 = null;
        field4305 = null;
        field4316 = null;
        field4319 = null;
        field4324 = null;
        field4302 = null;
        field4317 = null;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(Z)V", line = 612)
    private static final void method1735(boolean arg0) {
        if (field4300 == arg0) {
            return;
        }
        if (arg0) {
            field4319.glEnableClientState(32885);
        } else {
            field4319.glDisableClientState(32885);
        }
        field4300 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 628)
    public static final void method1736(Canvas arg0) {
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

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "()V", line = 648)
    public static final void method1737() {
        if (field4301) {
            field4319.glMatrixMode(5890);
            field4319.glLoadIdentity();
            field4319.glMatrixMode(5888);
            field4301 = false;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V", line = 678)
    public static final void method1738(int arg0, int arg1, int arg2, int arg3) {
        method1717(0, 0, field4297, field4329, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FF)V", line = 684)
    public static final void method1739(float arg0, float arg1) {
        if (field4311 || field4313 == arg0 && field4332 == arg1) {
            return;
        }
        field4313 = arg0;
        field4332 = arg1;
        if (arg1 == 0.0F) {
            field4317[10] = field4315;
            field4317[14] = field4298;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4298 * (1.0F - var2) / arg1;
            field4317[10] = field4315 + var4;
            field4317[14] = field4298 * var3;
        }
        field4319.glMatrixMode(5889);
        field4319.glLoadMatrixf(field4317, 0);
        field4319.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 718)
    public static final int method1740(Canvas arg0, int arg1) {
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
            field4324 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field4324.setRealized(true);
            int var4 = 0;
            while (true) {
                field4302 = field4324.createContext((GLContext) null);
                try {
                    int var5 = field4302.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class46.method381(1000L, -113);
            }
            field4319 = field4302.getGL();
            new GLU();
            field4323 = true;
            field4297 = arg0.getSize().width;
            field4329 = arg0.getSize().height;
            int var7 = method1715();
            if (var7 != 0) {
                method1724();
                return var7;
            }
            method1719();
            method1725();
            field4319.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field4324.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1724();
                        return -3;
                    }
                    class46.method381(100L, -112);
                }
            }
            field4319.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1724();
            return -5;
        }
    }
}
