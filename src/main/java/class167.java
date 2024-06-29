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

@OriginalClass("client!af")
public class class167 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Z")
    public static boolean field2778 = true;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[F")
    private static float[] field2780 = new float[16];

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    private static int field2779 = 0;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Z")
    private static boolean field2783 = true;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "Lbe;")
    private static class283 field2798 = class153.method941(-20, "radeon");

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Z")
    private static boolean field2786 = false;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Z")
    private static boolean field2796 = true;

    @OriginalMember(owner = "client!af", name = "y", descriptor = "F")
    private static float field2799 = 0.09765625F;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field2803 = 0;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    private static int field2793 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "F")
    private static float field2790 = 0.0F;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "Z")
    private static boolean field2802 = false;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Z")
    private static boolean field2788 = false;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Z")
    private static boolean field2777 = true;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "F")
    private static float field2809 = 0.0F;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    private static int field2811 = -1;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "F")
    private static float field2787;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "F")
    private static float field2805;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    private static int field2775;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    private static int field2794;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    private static int field2800;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2784;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2810;

    @OriginalMember(owner = "client!af", name = "F", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field2806;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field2797;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field2807;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Z")
    public static boolean field2785;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Z")
    public static boolean field2789;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Z")
    public static boolean field2791;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Z")
    public static boolean field2792;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Z")
    public static boolean field2795;

    @OriginalMember(owner = "client!af", name = "A", descriptor = "Z")
    public static boolean field2801;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "Z")
    public static boolean field2804;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)V", line = 11)
    public static final void method1024(int arg0, int arg1, int arg2, int arg3) {
        method1026(0, 0, field2776, field2808, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "()V", line = 14)
    public static final void method1025() {
        class284.method1954(0, (byte) -49, 0);
        method1050();
        method1047(5);
        method1055(0);
        method1044(false);
        method1038(false);
        method1036(false);
        method1034();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIFFII)V", line = 28)
    public static final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field2806.glMatrixMode(5889);
        field2806.glLoadIdentity();
        method1059((float) var10 * field2799, (float) var11 * field2799, (float) (-var13) * field2799, (float) (-var12) * field2799, 50.0F, 3584.0F);
        field2806.glViewport(arg0, field2808 - arg1 - arg3, arg2, arg3);
        field2806.glMatrixMode(5888);
        field2806.glLoadIdentity();
        field2806.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field2806.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field2806.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field2786 = false;
        class195.field3324 = var10;
        class138.field2291 = var11;
        class305.field5202 = var12;
        class103.field1762 = var13;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "()V", line = 61)
    public static final void method1027() {
        class284.method1954(0, (byte) -77, 0);
        method1050();
        method1047(0);
        method1055(0);
        method1044(false);
        method1038(false);
        method1036(false);
        method1034();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V", line = 72)
    public static final void method1028(int arg0, int arg1) {
        field2776 = arg0;
        field2808 = arg1;
        field2786 = false;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 77)
    public static final int method1029(Canvas arg0, int arg1) {
        if (!arg0.isDisplayable()) {
            throw new IllegalStateException("Supplied canvas not on screen");
        }
        GLCapabilities var2 = new GLCapabilities();
        if (arg1 > 0) {
            var2.setSampleBuffers(true);
            var2.setNumSamples(arg1);
        }
        GLDrawableFactory var3 = GLDrawableFactory.getFactory();
        field2807 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
        field2807.setRealized(true);
        while (true) {
            field2797 = field2807.createContext((GLContext) null);
            try {
                int var4 = field2797.makeCurrent();
                if (var4 != 0) {
                    break;
                }
            } catch (Exception var10) {
            }
            class2.method11((byte) -20, 1000L);
        }
        field2806 = field2797.getGL();
        new GLU();
        field2776 = arg0.getSize().width;
        field2808 = arg0.getSize().height;
        if (!field2802) {
            int var6 = method1045();
            if (var6 != 0) {
                return var6;
            }
            field2802 = true;
        }
        method1031();
        method1032();
        field2806.glClear(16384);
        int var7 = 0;
        while (var7 < 10) {
            try {
                field2807.swapBuffers();
                break;
            } catch (Exception var9) {
                class2.method11((byte) -20, 100L);
                var7++;
            }
        }
        field2806.glClear(16384);
        return 0;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "()V", line = 147)
    public static void method1030() {
        field2798 = null;
        field2810 = null;
        field2784 = null;
        field2806 = null;
        field2807 = null;
        field2797 = null;
        field2780 = null;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "()V", line = 157)
    private static final void method1031() {
        int[] var0 = new int[1];
        field2806.glGenTextures(1, var0, 0);
        field2781 = var0[0];
        field2806.glBindTexture(3553, field2781);
        field2806.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class143.method900(false);
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "()V", line = 166)
    private static final void method1032() {
        field2786 = false;
        field2806.glDisable(3553);
        field2811 = -1;
        field2806.glTexEnvi(8960, 8704, 34160);
        field2806.glTexEnvi(8960, 34161, 8448);
        field2779 = 0;
        field2806.glTexEnvi(8960, 34162, 8448);
        field2793 = 0;
        field2806.glEnable(2896);
        field2806.glEnable(2912);
        field2806.glEnable(2929);
        field2777 = true;
        field2796 = true;
        field2783 = true;
        class66.method421((byte) 124);
        field2806.glActiveTexture(33985);
        field2806.glTexEnvi(8960, 8704, 34160);
        field2806.glTexEnvi(8960, 34161, 8448);
        field2806.glTexEnvi(8960, 34162, 8448);
        field2806.glActiveTexture(33984);
        field2806.setSwapInterval(0);
        field2806.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field2806.glShadeModel(7425);
        field2806.glClearDepth(1.0D);
        field2806.glDepthFunc(515);
        method1037();
        field2806.glMatrixMode(5890);
        field2806.glLoadIdentity();
        field2806.glPolygonMode(1028, 6914);
        field2806.glEnable(2884);
        field2806.glCullFace(1029);
        field2806.glEnable(3042);
        field2806.glBlendFunc(770, 771);
        field2806.glEnable(3008);
        field2806.glAlphaFunc(516, 0.0F);
        field2806.glEnableClientState(32884);
        field2806.glEnableClientState(32885);
        field2778 = true;
        field2806.glEnableClientState(32886);
        field2806.glEnableClientState(32888);
        field2806.glMatrixMode(5888);
        field2806.glLoadIdentity();
        class59.method390();
        class17.method102();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 215)
    public static final void method1033(int arg0) {
        if (field2811 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field2806.glDisable(3553);
        } else {
            if (field2811 == -1) {
                field2806.glEnable(3553);
            }
            field2806.glBindTexture(3553, arg0);
        }
        field2811 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "()V", line = 231)
    public static final void method1034() {
        if (field2788) {
            field2806.glMatrixMode(5890);
            field2806.glLoadIdentity();
            field2806.glMatrixMode(5888);
            field2788 = false;
        }
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "()V", line = 242)
    public static final void method1035() {
        if (field2806 != null) {
            class135.method839(-28537);
            field2806 = null;
        }
        if (field2797 != null) {
            class101.method673();
            if (GLContext.getCurrent() == field2797) {
                field2797.release();
            }
            field2797.destroy();
            field2797 = null;
        }
        if (field2807 != null) {
            field2807.setRealized(false);
            field2807 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V", line = 268)
    public static final void method1036(boolean arg0) {
        if (field2783 == arg0) {
            return;
        }
        if (arg0) {
            field2806.glEnable(2912);
        } else {
            field2806.glDisable(2912);
        }
        field2783 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "()V", line = 281)
    public static final void method1037() {
        field2806.glDepthMask(true);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V", line = 290)
    public static final void method1038(boolean arg0) {
        if (field2796 == arg0) {
            return;
        }
        if (arg0) {
            field2806.glEnable(2929);
        } else {
            field2806.glDisable(2929);
        }
        field2796 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "i", descriptor = "()V", line = 303)
    public static final void method1039() {
        try {
            field2807.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!af", name = "j", descriptor = "()V", line = 311)
    public static final void method1040() {
        class284.method1954(0, (byte) -124, 0);
        method1050();
        method1047(0);
        method1055(0);
        method1044(false);
        method1038(false);
        method1036(false);
        method1034();
    }

    @OriginalMember(owner = "client!af", name = "k", descriptor = "()V", line = 321)
    public static final void method1041() {
        field2806.glDepthMask(false);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/String;)Lbe;", line = 328)
    private static final class283 method1042(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class219.method1440(159, var1.length, var1, 0);
    }

    @OriginalMember(owner = "client!af", name = "l", descriptor = "()V", line = 338)
    public static final void method1043() {
        if (class44.field601) {
            method1044(true);
            method1046(true);
        } else {
            method1044(false);
            method1046(false);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)V", line = 351)
    public static final void method1044(boolean arg0) {
        if (field2777 == arg0) {
            return;
        }
        if (arg0) {
            field2806.glEnable(2896);
        } else {
            field2806.glDisable(2896);
        }
        field2777 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "m", descriptor = "()I", line = 368)
    private static final int method1045() {
        int var0 = 0;
        field2784 = field2806.glGetString(7936);
        field2810 = field2806.glGetString(7937);
        String var1 = field2784.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field2806.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field2794 = var4 * 10 + var5;
            } catch (NumberFormatException var13) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field2794 < 12) {
            var0 |= 0x2;
        }
        if (!field2806.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field2806.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field2806.glGetIntegerv(34018, var7, 0);
        field2782 = var7[0];
        field2806.glGetIntegerv(34929, var7, 0);
        field2800 = var7[0];
        field2806.glGetIntegerv(34930, var7, 0);
        field2775 = var7[0];
        if (field2782 < 2 || field2800 < 2 || field2775 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field2795 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field2792 = field2806.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field2791 = field2806.isExtensionAvailable("GL_ARB_multisample");
        field2804 = field2806.isExtensionAvailable("GL_ARB_texture_cube_map");
        field2789 = field2806.isExtensionAvailable("GL_ARB_vertex_program");
        field2801 = field2806.isExtensionAvailable("GL_EXT_texture3D");
        class283 var8 = method1042(field2810).method1912(9974);
        if (var8.method1951(field2798, (byte) 22) != -1) {
            int var9 = 0;
            class283[] var10 = var8.method1949(47, 93, 32).method1938((byte) 63, 32);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class283 var12 = var10[var11];
                if (var12.method1925((byte) -44) >= 4 && var12.method1936(-63, 0, 4).method1906(12446)) {
                    var9 = var12.method1936(-63, 0, 4).method1930(10);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field2792 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field2801 = false;
            }
            field2785 = field2792;
        }
        return 0;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(Z)V", line = 465)
    private static final void method1046(boolean arg0) {
        if (field2778 == arg0) {
            return;
        }
        if (arg0) {
            field2806.glEnableClientState(32885);
        } else {
            field2806.glDisableClientState(32885);
        }
        field2778 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 476)
    public static final void method1047(int arg0) {
        if (field2779 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2806.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field2806.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field2806.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field2806.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field2806.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field2806.glTexEnvi(8960, 34161, 34165);
        }
        field2779 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "n", descriptor = "()F", line = 500)
    public static final float method1048() {
        return field2809;
    }

    @OriginalMember(owner = "client!af", name = "o", descriptor = "()V", line = 508)
    public static final void method1049() {
        int[] var0 = new int[2];
        field2806.glGetIntegerv(3073, var0, 0);
        field2806.glGetIntegerv(3074, var0, 1);
        field2806.glDrawBuffer(1026);
        field2806.glReadBuffer(1024);
        method1033(-1);
        field2806.glPushAttrib(8192);
        field2806.glDisable(2912);
        field2806.glDisable(3042);
        field2806.glDisable(2929);
        field2806.glDisable(3008);
        field2806.glRasterPos2i(0, 0);
        field2806.glCopyPixels(0, 0, field2776, field2808, 6144);
        field2806.glPopAttrib();
        field2806.glDrawBuffer(var0[0]);
        field2806.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!af", name = "p", descriptor = "()V", line = 529)
    private static final void method1050() {
        if (field2786) {
            return;
        }
        field2806.glMatrixMode(5889);
        field2806.glLoadIdentity();
        field2806.glOrtho(0.0D, (double) field2776, 0.0D, (double) field2808, -1.0D, 1.0D);
        field2806.glViewport(0, 0, field2776, field2808);
        field2806.glMatrixMode(5888);
        field2806.glLoadIdentity();
        field2786 = true;
    }

    @OriginalMember(owner = "client!af", name = "q", descriptor = "()V", line = 544)
    public static final void method1051() {
        class284.method1954(0, (byte) -85, 0);
        method1050();
        method1033(-1);
        method1044(false);
        method1038(false);
        method1036(false);
        method1034();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(FF)V", line = 564)
    public static final void method1052(float arg0, float arg1) {
        if (field2786 || field2790 == arg0 && field2809 == arg1) {
            return;
        }
        field2790 = arg0;
        field2809 = arg1;
        if (arg1 == 0.0F) {
            field2780[10] = field2805;
            field2780[14] = field2787;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field2787 * (1.0F - var2) / arg1;
            field2780[10] = field2805 + var4;
            field2780[14] = field2787 * var3;
        }
        field2806.glMatrixMode(5889);
        field2806.glLoadMatrixf(field2780, 0);
        field2806.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!af", name = "r", descriptor = "()V", line = 607)
    public static final void method1053() {
        field2806.glClear(256);
    }

    @OriginalMember(owner = "client!af", name = "s", descriptor = "()V", line = 610)
    public static final void method1054() {
        class284.method1954(0, (byte) -52, 0);
        method1050();
        method1047(1);
        method1055(1);
        method1044(false);
        method1038(false);
        method1036(false);
        method1034();
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V", line = 621)
    public static final void method1055(int arg0) {
        if (field2793 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2806.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field2806.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field2806.glTexEnvi(8960, 34162, 260);
        }
        field2793 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "t", descriptor = "()F", line = 636)
    public static final float method1056() {
        return field2790;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V", line = 643)
    public static final void method1057(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field2776 - arg0;
        int var8 = -arg1;
        int var9 = field2808 - arg1;
        field2806.glMatrixMode(5889);
        field2806.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field2806.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field2806.glViewport(0, 0, field2776, field2808);
        field2806.glMatrixMode(5888);
        field2806.glLoadIdentity();
        field2806.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field2786 = false;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(F)V", line = 666)
    public static final void method1058(float arg0) {
        method1052(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(FFFFFF)V", line = 682)
    private static final void method1059(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field2780[0] = var6 / (arg1 - arg0);
        field2780[1] = 0.0F;
        field2780[2] = 0.0F;
        field2780[3] = 0.0F;
        field2780[4] = 0.0F;
        field2780[5] = var6 / (arg3 - arg2);
        field2780[6] = 0.0F;
        field2780[7] = 0.0F;
        field2780[8] = (arg0 + arg1) / (arg1 - arg0);
        field2780[9] = (arg2 + arg3) / (arg3 - arg2);
        field2780[10] = field2805 = -(arg4 + arg5) / (arg5 - arg4);
        field2780[11] = -1.0F;
        field2780[12] = 0.0F;
        field2780[13] = 0.0F;
        field2780[14] = field2787 = -(arg5 * var6) / (arg5 - arg4);
        field2780[15] = 0.0F;
        field2806.glLoadMatrixf(field2780, 0);
        field2790 = 0.0F;
        field2809 = 0.0F;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V", line = 708)
    public static final void method1060(int arg0) {
        field2806.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2806.glClear(16640);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(FFF)V", line = 718)
    public static final void method1061(float arg0, float arg1, float arg2) {
        field2806.glMatrixMode(5890);
        if (field2788) {
            field2806.glLoadIdentity();
        }
        field2806.glTranslatef(arg0, arg1, arg2);
        field2806.glMatrixMode(5888);
        field2788 = true;
    }
}
