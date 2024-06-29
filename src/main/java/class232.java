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

@OriginalClass("client!sd")
public class class232 {

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[F")
    private static float[] field3697 = new float[16];

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Z")
    private static boolean field3687 = false;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    private static int field3686 = 0;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field3701 = 0;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Z")
    private static boolean field3698 = true;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    private static int field3707 = -1;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Z")
    private static boolean field3711 = true;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    private static int field3717 = -1;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Z")
    public static boolean field3690 = false;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Z")
    private static boolean field3713 = true;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    private static int field3712 = 0;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "F")
    private static float field3714 = 0.0F;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    private static int field3715 = -1;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Z")
    public static boolean field3689 = true;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Z")
    private static boolean field3705 = false;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "F")
    private static float field3725 = 0.09765625F;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "F")
    private static float field3720 = 0.0F;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "F")
    private static float field3684;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "F")
    private static float field3719;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    private static int field3688;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    private static int field3691;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    private static int field3696;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    private static int field3702;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    private static int field3704;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    private static int field3709;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    private static int field3730;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Ljava/lang/String;")
    private static String field3694;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Ljava/lang/String;")
    private static String field3695;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field3716;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field3729;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field3706;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Z")
    public static boolean field3692;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Z")
    public static boolean field3700;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Z")
    public static boolean field3703;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "Z")
    public static boolean field3708;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Z")
    public static boolean field3710;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Z")
    public static boolean field3718;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "Z")
    public static boolean field3722;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "Z")
    public static boolean field3723;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "Z")
    public static boolean field3724;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "Z")
    public static boolean field3726;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "Z")
    public static boolean field3728;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()F", line = 10)
    public static final float method1642() {
        return field3720;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 14)
    public static final int method1643(Canvas arg0, int arg1) {
        return method1667(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)V", line = 19)
    public static final void method1644(int arg0, int arg1, int arg2, int arg3) {
        field3716.glMatrixMode(5889);
        field3716.glLoadIdentity();
        field3716.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field3716.glMatrixMode(5888);
        field3716.glLoadIdentity();
        method1653(field3693, field3727, field3699, field3731);
        field3687 = false;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V", line = 29)
    private static final void method1645() {
        field3716.glViewport(field3696 + field3693, field3727 + field3709, field3730, field3704);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()F", line = 32)
    public static final float method1646() {
        return field3714;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 43)
    public static final void method1647(boolean arg0) {
        if (field3711 == arg0) {
            return;
        }
        if (arg0) {
            field3716.glEnable(2912);
        } else {
            field3716.glDisable(2912);
        }
        field3711 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "()V", line = 56)
    public static final void method1648() {
        if (class322.field4994) {
            method1660(true);
            method1658(true);
        } else {
            method1660(false);
            method1658(false);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 69)
    public static final void method1649(int arg0) {
        field3716.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3716.glClear(16640);
        field3716.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V", line = 92)
    public static final void method1650(int arg0, int arg1) {
        field3693 = arg0;
        field3727 = arg1;
        method1645();
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "()V", line = 98)
    public static final void method1651() {
        class179.method1343(0, 0, -3);
        method1672();
        method1662(-1);
        method1660(false);
        method1674(false);
        method1647(false);
        method1654();
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "()V", line = 107)
    public static final void method1652() {
        class179.method1343(0, 0, -3);
        method1672();
        method1677(1);
        method1664(1);
        method1660(false);
        method1674(false);
        method1647(false);
        method1654();
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIII)V", line = 117)
    private static final void method1653(int arg0, int arg1, int arg2, int arg3) {
        field3696 = arg0;
        field3709 = arg1;
        field3730 = arg2;
        field3704 = arg3;
        method1645();
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "()V", line = 129)
    public static final void method1654() {
        if (field3705) {
            field3716.glMatrixMode(5890);
            field3716.glLoadIdentity();
            field3716.glMatrixMode(5888);
            field3705 = false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIFFII)V", line = 140)
    public static final void method1655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field3716.glMatrixMode(5889);
        field3716.glLoadIdentity();
        method1659((float) var10 * field3725, (float) var11 * field3725, (float) (-var13) * field3725, (float) (-var12) * field3725, 50.0F, 3584.0F);
        method1653(arg0, field3731 - arg1 - arg3, arg2, arg3);
        field3716.glMatrixMode(5888);
        field3716.glLoadIdentity();
        field3716.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field3716.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field3716.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field3687 = false;
        class74.field1050 = var10;
        class99.field1443 = var11;
        class100.field1458 = var12;
        class207.field3414 = var13;
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "()V", line = 167)
    public static void method1656() {
        field3694 = null;
        field3695 = null;
        field3716 = null;
        field3706 = null;
        field3729 = null;
        field3697 = null;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIII)V", line = 177)
    public static final void method1657(int arg0, int arg1, int arg2, int arg3) {
        method1655(0, 0, field3699, field3731, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V", line = 181)
    private static final void method1658(boolean arg0) {
        if (field3689 == arg0) {
            return;
        }
        if (arg0) {
            field3716.glEnableClientState(32885);
        } else {
            field3716.glDisableClientState(32885);
        }
        field3689 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFFFFF)V", line = 195)
    private static final void method1659(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field3697[0] = var6 / (arg1 - arg0);
        field3697[1] = 0.0F;
        field3697[2] = 0.0F;
        field3697[3] = 0.0F;
        field3697[4] = 0.0F;
        field3697[5] = var6 / (arg3 - arg2);
        field3697[6] = 0.0F;
        field3697[7] = 0.0F;
        field3697[8] = (arg0 + arg1) / (arg1 - arg0);
        field3697[9] = (arg2 + arg3) / (arg3 - arg2);
        field3697[10] = field3719 = -(arg4 + arg5) / (arg5 - arg4);
        field3697[11] = -1.0F;
        field3697[12] = 0.0F;
        field3697[13] = 0.0F;
        field3697[14] = field3684 = -(arg5 * var6) / (arg5 - arg4);
        field3697[15] = 0.0F;
        field3716.glLoadMatrixf(field3697, 0);
        field3714 = 0.0F;
        field3720 = 0.0F;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)V", line = 220)
    public static final void method1660(boolean arg0) {
        if (field3713 == arg0) {
            return;
        }
        if (arg0) {
            field3716.glEnable(2896);
        } else {
            field3716.glDisable(2896);
        }
        field3713 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 231)
    public static final void method1661(int arg0) {
        field3716.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3716.glClear(16384);
        field3716.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V", line = 241)
    public static final void method1662(int arg0) {
        if (field3717 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field3716.glDisable(3553);
        } else {
            if (field3717 == -1) {
                field3716.glEnable(3553);
            }
            field3716.glBindTexture(3553, arg0);
        }
        field3717 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "()I", line = 261)
    private static final int method1663() {
        int var0 = 0;
        field3695 = field3716.glGetString(7936);
        field3694 = field3716.glGetString(7937);
        String var1 = field3695.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field3716.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field3688 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field3688 < 12) {
            var0 |= 0x2;
        }
        if (!field3716.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field3716.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field3716.glGetIntegerv(34018, var7, 0);
        field3721 = var7[0];
        field3716.glGetIntegerv(34929, var7, 0);
        field3691 = var7[0];
        field3716.glGetIntegerv(34930, var7, 0);
        field3702 = var7[0];
        if (field3721 < 2 || field3691 < 2 || field3702 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field3718 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field3700 = field3716.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field3728 = field3716.isExtensionAvailable("GL_ARB_multisample");
        field3722 = field3716.isExtensionAvailable("GL_ARB_texture_cube_map");
        field3703 = field3716.isExtensionAvailable("GL_ARB_vertex_program");
        field3692 = field3716.isExtensionAvailable("GL_EXT_framebuffer_object");
        field3716.isExtensionAvailable("GL_ARB_vertex_shader");
        field3724 = field3716.isExtensionAvailable("GL_ARB_fragment_shader");
        field3708 = field3716.isExtensionAvailable("GL_EXT_texture3D");
        field3710 = field3716.isExtensionAvailable("GL_ARB_texture_rectangle");
        field3726 = field3716.isExtensionAvailable("GL_ARB_texture_float");
        String var8 = field3694.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class300.method2139(var8.replace('/', ' '), -12496, ' ');
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class233.method1686(true, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class233.method1686(true, var13.substring(0, 4))) {
                        var9 = class142.method1047(-23595, var13.substring(0, 4));
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field3700 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field3708 = false;
            }
            if (var9 >= 9200 || var10) {
                field3726 = false;
            }
            field3723 = field3700;
        }
        if (field3700) {
            try {
                int[] var14 = new int[1];
                field3716.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V", line = 393)
    public static final void method1664(int arg0) {
        if (field3712 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3716.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field3716.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field3716.glTexEnvi(8960, 34162, 260);
        }
        field3712 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V", line = 409)
    public static final void method1665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field3699 - arg0;
        int var8 = -arg1;
        int var9 = field3731 - arg1;
        field3716.glMatrixMode(5889);
        field3716.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field3716.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method1653(0, 0, field3699, field3731);
        field3716.glMatrixMode(5888);
        field3716.glLoadIdentity();
        field3716.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field3687 = false;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V", line = 432)
    public static final void method1666(int arg0, int arg1) {
        field3699 = arg0;
        field3731 = arg1;
        field3687 = false;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 440)
    private static final int method1667(Canvas arg0, int arg1, GLContext arg2) {
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
            field3706 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field3706.setRealized(true);
            int var5 = 0;
            while (true) {
                field3729 = field3706.createContext(arg2);
                try {
                    int var6 = field3729.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class121.method867((byte) 60, 1000L);
            }
            field3716 = field3729.getGL();
            new GLU();
            field3690 = true;
            field3699 = arg0.getSize().width;
            field3731 = arg0.getSize().height;
            int var8 = method1663();
            if (var8 != 0) {
                method1676();
                return var8;
            }
            method1679();
            method1671();
            field3716.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field3706.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method1676();
                        return -3;
                    }
                    class121.method867((byte) 58, 100L);
                }
            }
            field3716.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method1676();
            return -5;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 530)
    public static final void method1668(Canvas arg0) {
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

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "()V", line = 551)
    public static final void method1669() {
        class179.method1343(0, 0, -3);
        method1672();
        method1677(0);
        method1664(0);
        method1660(false);
        method1674(false);
        method1647(false);
        method1654();
    }

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "()V", line = 561)
    public static final void method1670() {
        field3716.glClear(256);
    }

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "()V", line = 564)
    private static final void method1671() {
        field3687 = false;
        field3716.glDisable(3553);
        field3717 = -1;
        field3716.glTexEnvi(8960, 8704, 34160);
        field3716.glTexEnvi(8960, 34161, 8448);
        field3686 = 0;
        field3716.glTexEnvi(8960, 34162, 8448);
        field3712 = 0;
        field3716.glEnable(2896);
        field3716.glEnable(2912);
        field3716.glEnable(2929);
        field3713 = true;
        field3698 = true;
        field3711 = true;
        class24.method135(-1);
        field3716.glActiveTexture(33985);
        field3716.glTexEnvi(8960, 8704, 34160);
        field3716.glTexEnvi(8960, 34161, 8448);
        field3716.glTexEnvi(8960, 34162, 8448);
        field3716.glActiveTexture(33984);
        field3716.setSwapInterval(0);
        field3716.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field3716.glShadeModel(7425);
        field3716.glClearDepth(1.0D);
        field3716.glDepthFunc(515);
        method1681();
        field3716.glMatrixMode(5890);
        field3716.glLoadIdentity();
        field3716.glPolygonMode(1028, 6914);
        field3716.glEnable(2884);
        field3716.glCullFace(1029);
        field3716.glEnable(3042);
        field3716.glBlendFunc(770, 771);
        field3716.glEnable(3008);
        field3716.glAlphaFunc(516, 0.0F);
        field3716.glEnableClientState(32884);
        field3716.glEnableClientState(32885);
        field3689 = true;
        field3716.glEnableClientState(32886);
        field3716.glEnableClientState(32888);
        field3716.glMatrixMode(5888);
        field3716.glLoadIdentity();
        class87.method590();
        class118.method823();
    }

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "()V", line = 628)
    private static final void method1672() {
        if (field3687) {
            return;
        }
        field3716.glMatrixMode(5889);
        field3716.glLoadIdentity();
        field3716.glOrtho(0.0D, (double) field3699, 0.0D, (double) field3731, -1.0D, 1.0D);
        method1653(0, 0, field3699, field3731);
        field3716.glMatrixMode(5888);
        field3716.glLoadIdentity();
        field3687 = true;
    }

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "()V", line = 643)
    public static final void method1673() {
        field3716.glDepthMask(false);
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(Z)V", line = 649)
    public static final void method1674(boolean arg0) {
        if (field3698 == arg0) {
            return;
        }
        if (arg0) {
            field3716.glEnable(2929);
        } else {
            field3716.glDisable(2929);
        }
        field3698 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "()V", line = 664)
    public static final void method1675() {
        try {
            field3706.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "()V", line = 675)
    public static final void method1676() {
        if (field3716 != null) {
            try {
                class269.method1913();
                class60.method406(-61);
            } catch (Throwable var7) {
            }
            field3716 = null;
        }
        if (field3729 != null) {
            class230.method1628();
            try {
                if (GLContext.getCurrent() == field3729) {
                    field3729.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field3729.destroy();
            } catch (Throwable var5) {
            }
            field3729 = null;
        }
        if (field3706 != null) {
            try {
                field3706.setRealized(false);
            } catch (Throwable var4) {
            }
            field3706 = null;
        }
        class118.method819();
        field3690 = false;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 725)
    public static final void method1677(int arg0) {
        if (field3686 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3716.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field3716.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field3716.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field3716.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field3716.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field3716.glTexEnvi(8960, 34161, 34165);
        }
        field3686 = arg0;
    }

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "()V", line = 749)
    public static final void method1678() {
        class179.method1343(0, 0, -3);
        method1672();
        method1677(0);
        method1664(0);
        method1660(false);
        method1674(false);
        method1647(false);
        method1654();
    }

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "()V", line = 762)
    private static final void method1679() {
        int[] var0 = new int[1];
        field3716.glGenTextures(1, var0, 0);
        field3685 = var0[0];
        field3716.glBindTexture(3553, field3685);
        field3716.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class118.method830();
        class2.method11(112);
        class269.method1907();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(FF)V", line = 772)
    public static final void method1680(float arg0, float arg1) {
        if (field3687 || field3714 == arg0 && field3720 == arg1) {
            return;
        }
        field3714 = arg0;
        field3720 = arg1;
        if (arg1 == 0.0F) {
            field3697[10] = field3719;
            field3697[14] = field3684;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field3684 * (1.0F - var2) / arg1;
            field3697[10] = field3719 + var4;
            field3697[14] = field3684 * var3;
        }
        field3716.glMatrixMode(5889);
        field3716.glLoadMatrixf(field3697, 0);
        field3716.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "()V", line = 802)
    public static final void method1681() {
        field3716.glDepthMask(true);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(F)V", line = 806)
    public static final void method1682(float arg0) {
        method1680(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(FFF)V", line = 815)
    public static final void method1683(float arg0, float arg1, float arg2) {
        field3716.glMatrixMode(5890);
        if (field3705) {
            field3716.glLoadIdentity();
        }
        field3716.glTranslatef(arg0, arg1, arg2);
        field3716.glMatrixMode(5888);
        field3705 = true;
    }

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "()V", line = 839)
    public static final void method1684() {
        int[] var0 = new int[2];
        field3716.glGetIntegerv(3073, var0, 0);
        field3716.glGetIntegerv(3074, var0, 1);
        field3716.glDrawBuffer(1026);
        field3716.glReadBuffer(1024);
        method1662(-1);
        field3716.glPushAttrib(8192);
        field3716.glDisable(2912);
        field3716.glDisable(3042);
        field3716.glDisable(2929);
        field3716.glDisable(3008);
        field3716.glRasterPos2i(0, 0);
        field3716.glCopyPixels(0, 0, field3699, field3731, 6144);
        field3716.glPopAttrib();
        field3716.glDrawBuffer(var0[0]);
        field3716.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "()I", line = 859)
    public static final int method1685() {
        if (field3692 && (field3715 <= 0 || field3707 != class230.field3658)) {
            int[] var0 = new int[1];
            field3716.glGenFramebuffersEXT(1, var0, 0);
            field3707 = class230.field3658;
            field3715 = var0[0];
        }
        return field3715;
    }
}
