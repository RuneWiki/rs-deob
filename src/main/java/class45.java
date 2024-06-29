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

@OriginalClass("client!gm")
public class class45 {

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field660 = 0;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "Z")
    private static boolean field668 = true;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    private static int field665 = 0;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "Z")
    public static boolean field671 = true;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Z")
    private static boolean field659 = false;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "F")
    private static float field670 = 0.09765625F;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "Lma;")
    private static class5 field680 = class12.method119("radeon", (byte) 115);

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Z")
    private static boolean field663 = true;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "Z")
    private static boolean field682 = true;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "F")
    private static float field684 = 0.0F;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    private static int field657 = -1;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "[F")
    private static float[] field676 = new float[16];

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "Z")
    private static boolean field685 = false;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "Z")
    private static boolean field677 = false;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
    private static int field687 = 0;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "F")
    private static float field692 = 0.0F;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "F")
    private static float field664;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "F")
    private static float field679;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    private static int field656;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    private static int field658;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    private static int field666;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "Ljava/lang/String;")
    public static String field681;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "Ljava/lang/String;")
    public static String field691;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field688;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field669;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field661;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "Z")
    public static boolean field672;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "Z")
    public static boolean field673;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "Z")
    public static boolean field674;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "Z")
    public static boolean field675;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "Z")
    public static boolean field686;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "Z")
    public static boolean field689;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "Z")
    public static boolean field690;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 10)
    public static final void method305(int arg0) {
        if (field687 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field688.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field688.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field688.glTexEnvi(8960, 34162, 260);
        }
        field687 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V", line = 26)
    public static final void method306() {
        if (class8.field114) {
            method314(true);
            method337(true);
        } else {
            method314(false);
            method337(false);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 39)
    public static final int method307(Canvas arg0, int arg1) {
        if (!arg0.isDisplayable()) {
            throw new IllegalStateException("Supplied canvas not on screen");
        }
        GLCapabilities var2 = new GLCapabilities();
        if (arg1 > 0) {
            var2.setSampleBuffers(true);
            var2.setNumSamples(arg1);
        }
        GLDrawableFactory var3 = GLDrawableFactory.getFactory();
        field661 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
        field661.setRealized(true);
        while (true) {
            field669 = field661.createContext((GLContext) null);
            try {
                int var4 = field669.makeCurrent();
                if (var4 != 0) {
                    break;
                }
            } catch (Exception var10) {
            }
            class116.method759(-1, 1000L);
        }
        field688 = field669.getGL();
        new GLU();
        field678 = arg0.getSize().width;
        field667 = arg0.getSize().height;
        if (!field685) {
            int var6 = method333();
            if (var6 != 0) {
                return var6;
            }
            field685 = true;
        }
        method311();
        method323();
        field688.glClear(16384);
        int var7 = 0;
        while (var7 < 10) {
            try {
                field661.swapBuffers();
                break;
            } catch (Exception var9) {
                class116.method759(-1, 100L);
                var7++;
            }
        }
        field688.glClear(16384);
        return 0;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()V", line = 111)
    public static final void method308() {
        class264.method1814(0, 0, (byte) 73);
        method327();
        method330(0);
        method305(0);
        method314(false);
        method317(false);
        method332(false);
        method326();
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()V", line = 124)
    public static final void method309() {
        class264.method1814(0, 0, (byte) 80);
        method327();
        method330(0);
        method305(0);
        method314(false);
        method317(false);
        method332(false);
        method326();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIII)V", line = 138)
    public static final void method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field678 - arg0;
        int var8 = -arg1;
        int var9 = field667 - arg1;
        field688.glMatrixMode(5889);
        field688.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field688.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field688.glViewport(0, 0, field678, field667);
        field688.glMatrixMode(5888);
        field688.glLoadIdentity();
        field688.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field659 = false;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "()V", line = 162)
    private static final void method311() {
        int[] var0 = new int[1];
        field688.glGenTextures(1, var0, 0);
        field683 = var0[0];
        field688.glBindTexture(3553, field683);
        field688.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class46.method347((byte) 78);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 170)
    public static final void method312(int arg0) {
        field688.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field688.glClear(16640);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFFFFF)V", line = 179)
    private static final void method313(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field676[0] = var6 / (arg1 - arg0);
        field676[1] = 0.0F;
        field676[2] = 0.0F;
        field676[3] = 0.0F;
        field676[4] = 0.0F;
        field676[5] = var6 / (arg3 - arg2);
        field676[6] = 0.0F;
        field676[7] = 0.0F;
        field676[8] = (arg0 + arg1) / (arg1 - arg0);
        field676[9] = (arg2 + arg3) / (arg3 - arg2);
        field676[10] = field679 = -(arg4 + arg5) / (arg5 - arg4);
        field676[11] = -1.0F;
        field676[12] = 0.0F;
        field676[13] = 0.0F;
        field676[14] = field664 = -(arg5 * var6) / (arg5 - arg4);
        field676[15] = 0.0F;
        field688.glLoadMatrixf(field676, 0);
        field684 = 0.0F;
        field692 = 0.0F;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V", line = 201)
    public static final void method314(boolean arg0) {
        if (field668 == arg0) {
            return;
        }
        if (arg0) {
            field688.glEnable(2896);
        } else {
            field688.glDisable(2896);
        }
        field668 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(F)V", line = 212)
    public static final void method315(float arg0) {
        method324(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFF)V", line = 219)
    public static final void method316(float arg0, float arg1, float arg2) {
        field688.glMatrixMode(5890);
        if (field677) {
            field688.glLoadIdentity();
        }
        field688.glTranslatef(arg0, arg1, arg2);
        field688.glMatrixMode(5888);
        field677 = true;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(Z)V", line = 237)
    public static final void method317(boolean arg0) {
        if (field682 == arg0) {
            return;
        }
        if (arg0) {
            field688.glEnable(2929);
        } else {
            field688.glDisable(2929);
        }
        field682 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "()F", line = 252)
    public static final float method318() {
        return field684;
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "()V", line = 258)
    public static final void method319() {
        if (field669 != null) {
            if (GLContext.getCurrent() == field669) {
                field669.release();
            }
            field669.destroy();
            field669 = null;
        }
        if (field661 != null) {
            field661.setRealized(false);
            field661 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;)Lma;", line = 277)
    private static final class5 method320(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class101.method645(var1, true, 0, var1.length);
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V", line = 284)
    public static final void method321(int arg0) {
        if (field657 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field688.glDisable(3553);
        } else {
            if (field657 == -1) {
                field688.glEnable(3553);
            }
            field688.glBindTexture(3553, arg0);
        }
        field657 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIFFII)V", line = 301)
    public static final void method322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field688.glMatrixMode(5889);
        field688.glLoadIdentity();
        method313((float) var10 * field670, (float) var11 * field670, (float) (-var13) * field670, (float) (-var12) * field670, 50.0F, 3584.0F);
        field688.glViewport(arg0, field667 - arg1 - arg3, arg2, arg3);
        field688.glMatrixMode(5888);
        field688.glLoadIdentity();
        field688.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field688.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field688.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field659 = false;
        class196.field3067 = var10;
        class99.field1476 = var11;
        class280.field4750 = var12;
        class84.field1276 = var13;
    }

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "()V", line = 328)
    private static final void method323() {
        field659 = false;
        field688.glDisable(3553);
        field657 = -1;
        field688.glTexEnvi(8960, 8704, 34160);
        field688.glTexEnvi(8960, 34161, 8448);
        field665 = 0;
        field688.glTexEnvi(8960, 34162, 8448);
        field687 = 0;
        field688.glEnable(2896);
        field688.glEnable(2912);
        field688.glEnable(2929);
        field668 = true;
        field682 = true;
        field663 = true;
        class145.method919((byte) 126);
        field688.glActiveTexture(33985);
        field688.glTexEnvi(8960, 8704, 34160);
        field688.glTexEnvi(8960, 34161, 8448);
        field688.glTexEnvi(8960, 34162, 8448);
        field688.glActiveTexture(33984);
        field688.setSwapInterval(0);
        field688.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field688.glShadeModel(7425);
        field688.glClearDepth(1.0D);
        field688.glDepthFunc(515);
        method341();
        field688.glMatrixMode(5890);
        field688.glLoadIdentity();
        field688.glPolygonMode(1028, 6914);
        field688.glEnable(2884);
        field688.glCullFace(1029);
        field688.glEnable(3042);
        field688.glBlendFunc(770, 771);
        field688.glEnable(3008);
        field688.glAlphaFunc(516, 0.0F);
        field688.glEnableClientState(32884);
        field688.glEnableClientState(32885);
        field671 = true;
        field688.glEnableClientState(32886);
        field688.glEnableClientState(32888);
        field688.glMatrixMode(5888);
        field688.glLoadIdentity();
        class293.method1978();
        class53.method412();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(FF)V", line = 377)
    public static final void method324(float arg0, float arg1) {
        if (field659 || field684 == arg0 && field692 == arg1) {
            return;
        }
        field684 = arg0;
        field692 = arg1;
        if (arg1 == 0.0F) {
            field676[10] = field679;
            field676[14] = field664;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field664 * (1.0F - var2) / arg1;
            field676[10] = field679 + var4;
            field676[14] = field664 * var3;
        }
        field688.glMatrixMode(5889);
        field688.glLoadMatrixf(field676, 0);
        field688.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII)V", line = 407)
    public static final void method325(int arg0, int arg1, int arg2, int arg3) {
        method322(0, 0, field678, field667, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "()V", line = 416)
    public static final void method326() {
        if (field677) {
            field688.glMatrixMode(5890);
            field688.glLoadIdentity();
            field688.glMatrixMode(5888);
            field677 = false;
        }
    }

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "()V", line = 428)
    private static final void method327() {
        if (field659) {
            return;
        }
        field688.glMatrixMode(5889);
        field688.glLoadIdentity();
        field688.glOrtho(0.0D, (double) field678, 0.0D, (double) field667, -1.0D, 1.0D);
        field688.glViewport(0, 0, field678, field667);
        field688.glMatrixMode(5888);
        field688.glLoadIdentity();
        field659 = true;
    }

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "()V", line = 444)
    public static final void method328() {
        class264.method1814(0, 0, (byte) 80);
        method327();
        method330(5);
        method305(0);
        method314(false);
        method317(false);
        method332(false);
        method326();
    }

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "()V", line = 454)
    public static final void method329() {
        class264.method1814(0, 0, (byte) 60);
        method327();
        method321(-1);
        method314(false);
        method317(false);
        method332(false);
        method326();
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V", line = 463)
    public static final void method330(int arg0) {
        if (field665 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field688.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field688.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field688.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field688.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field688.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field688.glTexEnvi(8960, 34161, 34165);
        }
        field665 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "()V", line = 487)
    public static final void method331() {
        class264.method1814(0, 0, (byte) 77);
        method327();
        method330(1);
        method305(1);
        method314(false);
        method317(false);
        method332(false);
        method326();
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(Z)V", line = 500)
    public static final void method332(boolean arg0) {
        if (field663 == arg0) {
            return;
        }
        if (arg0) {
            field688.glEnable(2912);
        } else {
            field688.glDisable(2912);
        }
        field663 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "()I", line = 513)
    private static final int method333() {
        int var0 = 0;
        field691 = field688.glGetString(7936);
        field681 = field688.glGetString(7937);
        String var1 = field691.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field688.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field666 = var4 * 10 + var5;
            } catch (NumberFormatException var13) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field666 < 12) {
            var0 |= 0x2;
        }
        if (!field688.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field688.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field688.glGetIntegerv(34018, var7, 0);
        field662 = var7[0];
        field688.glGetIntegerv(34929, var7, 0);
        field656 = var7[0];
        field688.glGetIntegerv(34930, var7, 0);
        field658 = var7[0];
        if (field662 < 2 || field656 < 2 || field658 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field675 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field674 = field688.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field689 = field688.isExtensionAvailable("GL_ARB_multisample");
        field686 = field688.isExtensionAvailable("GL_ARB_texture_cube_map");
        field672 = field688.isExtensionAvailable("GL_ARB_vertex_program");
        field690 = field688.isExtensionAvailable("GL_EXT_texture3D");
        class5 var8 = method320(field681).method37(-64);
        if (var8.method73(-5069, field680) != -1) {
            int var9 = 0;
            class5[] var10 = var8.method71((byte) -126, 32, 47).method55(0, 32);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class5 var12 = var10[var11];
                if (var12.method36(30673) >= 4 && var12.method76(0, 0, 4).method57(-85)) {
                    var9 = var12.method76(0, 0, 4).method54((byte) -83);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field674 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field690 = false;
            }
            field673 = field674;
        }
        return 0;
    }

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "()V", line = 613)
    public static final void method334() {
        try {
            field661.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "()F", line = 620)
    public static final float method335() {
        return field692;
    }

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "()V", line = 636)
    public static final void method336() {
        int[] var0 = new int[2];
        field688.glGetIntegerv(3073, var0, 0);
        field688.glGetIntegerv(3074, var0, 1);
        field688.glDrawBuffer(1026);
        field688.glReadBuffer(1024);
        method321(-1);
        field688.glPushAttrib(8192);
        field688.glDisable(2912);
        field688.glDisable(3042);
        field688.glDisable(2929);
        field688.glDisable(3008);
        field688.glRasterPos2i(0, 0);
        field688.glCopyPixels(0, 0, field678, field667, 6144);
        field688.glPopAttrib();
        field688.glDrawBuffer(var0[0]);
        field688.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(Z)V", line = 655)
    private static final void method337(boolean arg0) {
        if (field671 == arg0) {
            return;
        }
        if (arg0) {
            field688.glEnableClientState(32885);
        } else {
            field688.glDisableClientState(32885);
        }
        field671 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V", line = 676)
    public static final void method338(int arg0, int arg1) {
        field678 = arg0;
        field667 = arg1;
        field659 = false;
    }

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "()V", line = 687)
    public static void method339() {
        field680 = null;
        field681 = null;
        field691 = null;
        field688 = null;
        field661 = null;
        field669 = null;
        field676 = null;
    }

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "()V", line = 702)
    public static final void method340() {
        field688.glDepthMask(false);
    }

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "()V", line = 710)
    public static final void method341() {
        field688.glDepthMask(true);
    }

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "()V", line = 713)
    public static final void method342() {
        field688.glClear(256);
    }
}
