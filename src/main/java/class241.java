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

@OriginalClass("client!i")
public class class241 {

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Z")
    private static boolean field4008 = false;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "F")
    private static float field4005 = 0.0F;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "Z")
    public static boolean field4016 = false;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Z")
    private static boolean field4004 = true;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "F")
    private static float field4013 = 0.09765625F;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    private static int field3995 = -1;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    private static int field4009 = 0;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Z")
    private static boolean field4025 = true;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "F")
    private static float field4021 = 0.0F;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "[F")
    private static float[] field4034 = new float[16];

    @OriginalMember(owner = "client!i", name = "M", descriptor = "Z")
    private static boolean field4030 = true;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field4024 = 0;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "Z")
    public static boolean field4027 = true;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "Z")
    private static boolean field4037 = false;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "I")
    private static int field4028 = -1;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    private static int field4002 = -1;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    private static int field4038 = 0;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "F")
    private static float field4029;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "F")
    private static float field4031;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    private static int field3996;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    private static int field3998;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    private static int field4006;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    private static int field4018;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    private static int field4023;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    private static int field4033;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    private static int field4035;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Ljava/lang/String;")
    private static String field4010;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "Ljava/lang/String;")
    private static String field4032;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4012;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field3992;

    @OriginalMember(owner = "client!i", name = "I", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4026;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Z")
    public static boolean field3994;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Z")
    public static boolean field3997;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Z")
    public static boolean field3999;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Z")
    public static boolean field4000;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Z")
    public static boolean field4003;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Z")
    public static boolean field4007;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Z")
    public static boolean field4011;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "Z")
    public static boolean field4014;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "Z")
    public static boolean field4017;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "Z")
    public static boolean field4020;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "Z")
    public static boolean field4022;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "Z")
    public static boolean field4036;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 9)
    public static final void method1679() {
        if (field4012 != null) {
            try {
                class163.method1174();
                class13.method132(0);
            } catch (Throwable var7) {
            }
            field4012 = null;
        }
        if (field3992 != null) {
            class239.method1674();
            try {
                if (GLContext.getCurrent() == field3992) {
                    field3992.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field3992.destroy();
            } catch (Throwable var5) {
            }
            field3992 = null;
        }
        if (field4026 != null) {
            try {
                field4026.setRealized(false);
            } catch (Throwable var4) {
            }
            field4026 = null;
        }
        class2.method13();
        field4016 = false;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V", line = 63)
    private static final void method1680() {
        int[] var0 = new int[1];
        field4012.glGenTextures(1, var0, 0);
        field4001 = var0[0];
        field4012.glBindTexture(3553, field4001);
        field4012.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class2.method18();
        class159.method1146(true);
        class163.method1168();
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()I", line = 74)
    public static final int method1681() {
        if (field4036 && (field4002 <= 0 || field3995 != class239.field3974)) {
            int[] var0 = new int[1];
            field4012.glGenFramebuffersEXT(1, var0, 0);
            field3995 = class239.field3974;
            field4002 = var0[0];
        }
        return field4002;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(FFFFFF)V", line = 88)
    private static final void method1682(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field4034[0] = var6 / (arg1 - arg0);
        field4034[1] = 0.0F;
        field4034[2] = 0.0F;
        field4034[3] = 0.0F;
        field4034[4] = 0.0F;
        field4034[5] = var6 / (arg3 - arg2);
        field4034[6] = 0.0F;
        field4034[7] = 0.0F;
        field4034[8] = (arg0 + arg1) / (arg1 - arg0);
        field4034[9] = (arg2 + arg3) / (arg3 - arg2);
        field4034[10] = field4031 = -(arg4 + arg5) / (arg5 - arg4);
        field4034[11] = -1.0F;
        field4034[12] = 0.0F;
        field4034[13] = 0.0F;
        field4034[14] = field4029 = -(arg5 * var6) / (arg5 - arg4);
        field4034[15] = 0.0F;
        field4012.glLoadMatrixf(field4034, 0);
        field4005 = 0.0F;
        field4021 = 0.0F;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 113)
    public static final void method1683() {
        class109.method815(-119, 0, 0);
        method1707();
        method1719(1);
        method1718(1);
        method1716(false);
        method1705(false);
        method1696(false);
        method1702();
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 131)
    public static void method1684() {
        field4010 = null;
        field4032 = null;
        field4012 = null;
        field4026 = null;
        field3992 = null;
        field4034 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 140)
    private static final void method1685(boolean arg0) {
        if (field4027 == arg0) {
            return;
        }
        if (arg0) {
            field4012.glEnableClientState(32885);
        } else {
            field4012.glDisableClientState(32885);
        }
        field4027 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(FFF)V", line = 156)
    public static final void method1686(float arg0, float arg1, float arg2) {
        field4012.glMatrixMode(5890);
        if (field4008) {
            field4012.glLoadIdentity();
        }
        field4012.glTranslatef(arg0, arg1, arg2);
        field4012.glMatrixMode(5888);
        field4008 = true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 166)
    public static final void method1687(int arg0) {
        if (field4028 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4012.glDisable(3553);
        } else {
            if (field4028 == -1) {
                field4012.glEnable(3553);
            }
            field4012.glBindTexture(3553, arg0);
        }
        field4028 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 191)
    private static final void method1688() {
        field4037 = false;
        field4012.glDisable(3553);
        field4028 = -1;
        field4012.glTexEnvi(8960, 8704, 34160);
        field4012.glTexEnvi(8960, 34161, 8448);
        field4009 = 0;
        field4012.glTexEnvi(8960, 34162, 8448);
        field4038 = 0;
        field4012.glEnable(2896);
        field4012.glEnable(2912);
        field4012.glEnable(2929);
        field4030 = true;
        field4025 = true;
        field4004 = true;
        class24.method204(16449);
        field4012.glActiveTexture(33985);
        field4012.glTexEnvi(8960, 8704, 34160);
        field4012.glTexEnvi(8960, 34161, 8448);
        field4012.glTexEnvi(8960, 34162, 8448);
        field4012.glActiveTexture(33984);
        field4012.setSwapInterval(0);
        field4012.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4012.glShadeModel(7425);
        field4012.glClearDepth(1.0F);
        field4012.glDepthFunc(515);
        method1700();
        field4012.glMatrixMode(5890);
        field4012.glLoadIdentity();
        field4012.glPolygonMode(1028, 6914);
        field4012.glEnable(2884);
        field4012.glCullFace(1029);
        field4012.glEnable(3042);
        field4012.glBlendFunc(770, 771);
        field4012.glEnable(3008);
        field4012.glAlphaFunc(516, 0.0F);
        field4012.glEnableClientState(32884);
        field4012.glEnableClientState(32885);
        field4027 = true;
        field4012.glEnableClientState(32886);
        field4012.glEnableClientState(32888);
        field4012.glMatrixMode(5888);
        field4012.glLoadIdentity();
        class259.method1813();
        class2.method25();
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "()V", line = 238)
    public static final void method1689() {
        field4012.glDepthMask(false);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 245)
    public static final void method1690(int arg0, int arg1, int arg2, int arg3) {
        field4012.glMatrixMode(5889);
        field4012.glLoadIdentity();
        field4012.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field4012.glMatrixMode(5888);
        field4012.glLoadIdentity();
        method1692(field4019, field4015, field4039, field3993);
        field4037 = false;
    }

    @OriginalMember(owner = "client!i", name = "h", descriptor = "()V", line = 255)
    public static final void method1691() {
        int[] var0 = new int[2];
        field4012.glGetIntegerv(3073, var0, 0);
        field4012.glGetIntegerv(3074, var0, 1);
        field4012.glDrawBuffer(1026);
        field4012.glReadBuffer(1024);
        method1687(-1);
        field4012.glPushAttrib(8192);
        field4012.glDisable(2912);
        field4012.glDisable(3042);
        field4012.glDisable(2929);
        field4012.glDisable(3008);
        field4012.glRasterPos2i(0, 0);
        field4012.glCopyPixels(0, 0, field4039, field3993, 6144);
        field4012.glPopAttrib();
        field4012.glDrawBuffer(var0[0]);
        field4012.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IIII)V", line = 274)
    private static final void method1692(int arg0, int arg1, int arg2, int arg3) {
        field4018 = arg0;
        field3996 = arg1;
        field4023 = arg2;
        field4006 = arg3;
        method1704();
    }

    @OriginalMember(owner = "client!i", name = "i", descriptor = "()V", line = 284)
    public static final void method1693() {
        try {
            field4026.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!i", name = "j", descriptor = "()V", line = 294)
    public static final void method1694() {
        class109.method815(-117, 0, 0);
        method1707();
        method1687(-1);
        method1716(false);
        method1705(false);
        method1696(false);
        method1702();
    }

    @OriginalMember(owner = "client!i", name = "k", descriptor = "()V", line = 307)
    public static final void method1695() {
        if (class281.field4606) {
            method1716(true);
            method1685(true);
        } else {
            method1716(false);
            method1685(false);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)V", line = 321)
    public static final void method1696(boolean arg0) {
        if (field4004 == arg0) {
            return;
        }
        if (arg0) {
            field4012.glEnable(2912);
        } else {
            field4012.glDisable(2912);
        }
        field4004 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 332)
    public static final void method1697(int arg0) {
        field4012.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4012.glClear(16384);
        field4012.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(FF)V", line = 337)
    public static final void method1698(float arg0, float arg1) {
        if (field4037 || field4005 == arg0 && field4021 == arg1) {
            return;
        }
        field4005 = arg0;
        field4021 = arg1;
        if (arg1 == 0.0F) {
            field4034[10] = field4031;
            field4034[14] = field4029;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4029 * (1.0F - var2) / arg1;
            field4034[10] = field4031 + var4;
            field4034[14] = field4029 * var3;
        }
        field4012.glMatrixMode(5889);
        field4012.glLoadMatrixf(field4034, 0);
        field4012.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(F)V", line = 368)
    public static final void method1699(float arg0) {
        method1698(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!i", name = "l", descriptor = "()V", line = 373)
    public static final void method1700() {
        field4012.glDepthMask(true);
    }

    @OriginalMember(owner = "client!i", name = "m", descriptor = "()V", line = 381)
    public static final void method1701() {
        class109.method815(-122, 0, 0);
        method1707();
        method1719(0);
        method1718(0);
        method1716(false);
        method1705(false);
        method1696(false);
        method1702();
    }

    @OriginalMember(owner = "client!i", name = "n", descriptor = "()V", line = 392)
    public static final void method1702() {
        if (field4008) {
            field4012.glMatrixMode(5890);
            field4012.glLoadIdentity();
            field4012.glMatrixMode(5888);
            field4008 = false;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V", line = 402)
    public static final void method1703(int arg0) {
        field4012.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4012.glClear(16640);
        field4012.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!i", name = "o", descriptor = "()V", line = 407)
    private static final void method1704() {
        field4012.glViewport(field4019 + field4018, field4015 + field3996, field4023, field4006);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(Z)V", line = 413)
    public static final void method1705(boolean arg0) {
        if (field4025 == arg0) {
            return;
        }
        if (arg0) {
            field4012.glEnable(2929);
        } else {
            field4012.glDisable(2929);
        }
        field4025 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "p", descriptor = "()F", line = 426)
    public static final float method1706() {
        return field4021;
    }

    @OriginalMember(owner = "client!i", name = "q", descriptor = "()V", line = 437)
    private static final void method1707() {
        if (field4037) {
            return;
        }
        field4012.glMatrixMode(5889);
        field4012.glLoadIdentity();
        field4012.glOrtho(0.0D, (double) field4039, 0.0D, (double) field3993, -1.0D, 1.0D);
        method1692(0, 0, field4039, field3993);
        field4012.glMatrixMode(5888);
        field4012.glLoadIdentity();
        field4037 = true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V", line = 451)
    public static final void method1708(int arg0, int arg1) {
        field4039 = arg0;
        field3993 = arg1;
        field4037 = false;
    }

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()I", line = 464)
    private static final int method1709() {
        int var0 = 0;
        field4032 = field4012.glGetString(7936);
        field4010 = field4012.glGetString(7937);
        String var1 = field4032.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field4012.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field4035 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field4035 < 12) {
            var0 |= 0x2;
        }
        if (!field4012.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field4012.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field4012.glGetIntegerv(34018, var7, 0);
        field4040 = var7[0];
        field4012.glGetIntegerv(34929, var7, 0);
        field4033 = var7[0];
        field4012.glGetIntegerv(34930, var7, 0);
        field3998 = var7[0];
        if (field4040 < 2 || field4033 < 2 || field3998 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field4007 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field4020 = field4012.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field4022 = field4012.isExtensionAvailable("GL_ARB_multisample");
        field3994 = field4012.isExtensionAvailable("GL_ARB_texture_cube_map");
        field4003 = field4012.isExtensionAvailable("GL_ARB_vertex_program");
        field4036 = field4012.isExtensionAvailable("GL_EXT_framebuffer_object");
        field4012.isExtensionAvailable("GL_ARB_vertex_shader");
        field3999 = field4012.isExtensionAvailable("GL_ARB_fragment_shader");
        field4014 = field4012.isExtensionAvailable("GL_EXT_texture3D");
        field3997 = field4012.isExtensionAvailable("GL_ARB_texture_rectangle");
        field4017 = field4012.isExtensionAvailable("GL_ARB_texture_float");
        field4000 = true;
        String var8 = field4010.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class209.method1444(var8.replace('/', ' '), ' ', false);
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class332.method2352(-85, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class332.method2352(-63, var13.substring(0, 4))) {
                        var9 = class86.method656(var13.substring(0, 4), (byte) -69);
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field4020 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field4014 = false;
            }
            if (var9 >= 9200 || var10) {
                field4017 = false;
            }
            field4011 = field4020;
            field4000 = false;
        }
        if (field4020) {
            try {
                int[] var14 = new int[1];
                field4012.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIFFII)V", line = 596)
    public static final void method1710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4012.glMatrixMode(5889);
        field4012.glLoadIdentity();
        method1682((float) var10 * field4013, (float) var11 * field4013, (float) (-var13) * field4013, (float) (-var12) * field4013, 50.0F, 3584.0F);
        method1692(arg0, field3993 - arg1 - arg3, arg2, arg3);
        field4012.glMatrixMode(5888);
        field4012.glLoadIdentity();
        field4012.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4012.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4012.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4037 = false;
        class22.field559 = var10;
        class349.field5581 = var11;
        class349.field5587 = var12;
        class7.field264 = var13;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V", line = 623)
    public static final void method1711(int arg0, int arg1) {
        field4019 = arg0;
        field4015 = arg1;
        method1704();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 645)
    public static final void method1712(Canvas arg0) {
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

    @OriginalMember(owner = "client!i", name = "s", descriptor = "()V", line = 665)
    public static final void method1713() {
        class109.method815(-128, 0, 0);
        method1707();
        method1719(0);
        method1718(0);
        method1716(false);
        method1705(false);
        method1696(false);
        method1702();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII)V", line = 676)
    public static final void method1714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4039 - arg0;
        int var8 = -arg1;
        int var9 = field3993 - arg1;
        field4012.glMatrixMode(5889);
        field4012.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4012.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method1692(0, 0, field4039, field3993);
        field4012.glMatrixMode(5888);
        field4012.glLoadIdentity();
        field4012.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4037 = false;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 700)
    private static final int method1715(Canvas arg0, int arg1, GLContext arg2) {
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
            field4026 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field4026.setRealized(true);
            int var5 = 0;
            while (true) {
                field3992 = field4026.createContext(arg2);
                try {
                    int var6 = field3992.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class122.method881(53, 1000L);
            }
            field4012 = field3992.getGL();
            field4016 = true;
            field4039 = arg0.getSize().width;
            field3993 = arg0.getSize().height;
            int var8 = method1709();
            if (var8 != 0) {
                method1679();
                return var8;
            }
            method1680();
            method1688();
            field4012.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field4026.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method1679();
                        return -3;
                    }
                    class122.method881(67, 100L);
                }
            }
            field4012.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method1679();
            return -5;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(Z)V", line = 780)
    public static final void method1716(boolean arg0) {
        if (field4030 == arg0) {
            return;
        }
        if (arg0) {
            field4012.glEnable(2896);
        } else {
            field4012.glDisable(2896);
        }
        field4030 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(IIII)V", line = 796)
    public static final void method1717(int arg0, int arg1, int arg2, int arg3) {
        method1710(0, 0, field4039, field3993, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)V", line = 800)
    public static final void method1718(int arg0) {
        if (field4038 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4012.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4012.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4012.glTexEnvi(8960, 34162, 260);
        }
        field4038 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)V", line = 815)
    public static final void method1719(int arg0) {
        if (field4009 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4012.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4012.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4012.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4012.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4012.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4012.glTexEnvi(8960, 34161, 34165);
        }
        field4009 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 855)
    public static final int method1720(Canvas arg0, int arg1) {
        return method1715(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!i", name = "t", descriptor = "()V", line = 858)
    public static final void method1721() {
        field4012.glClear(256);
    }

    @OriginalMember(owner = "client!i", name = "u", descriptor = "()F", line = 865)
    public static final float method1722() {
        return field4005;
    }
}
