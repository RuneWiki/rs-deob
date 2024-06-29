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

@OriginalClass("client!qm")
public class class56 {

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "Lce;")
    private static class126 field847 = class206.method1445(-7923, "radeon");

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Z")
    public static boolean field846 = false;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    private static int field862 = 0;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Z")
    private static boolean field861 = true;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "Z")
    private static boolean field856 = true;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "Z")
    public static boolean field865 = true;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "F")
    private static float field843 = 0.0F;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    private static int field839 = 0;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "Z")
    private static boolean field869 = false;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field871 = 0;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "Z")
    private static boolean field864 = true;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "[F")
    private static float[] field867 = new float[16];

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    private static int field863 = -1;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "F")
    private static float field857 = 0.09765625F;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "Z")
    private static boolean field874 = false;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "F")
    private static float field873 = 0.0F;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "F")
    private static float field852;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "F")
    private static float field868;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    private static int field841;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    private static int field850;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    private static int field851;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "Ljava/lang/String;")
    private static String field844;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "Ljava/lang/String;")
    private static String field875;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field848;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field853;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field860;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "Z")
    public static boolean field845;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "Z")
    public static boolean field849;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "Z")
    public static boolean field855;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "Z")
    public static boolean field858;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "Z")
    public static boolean field859;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "Z")
    public static boolean field866;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "Z")
    public static boolean field872;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "()V", line = 12)
    private static final void method349() {
        int[] var0 = new int[1];
        field848.glGenTextures(1, var0, 0);
        field854 = var0[0];
        field848.glBindTexture(3553, field854);
        field848.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class100.method676(-123);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V", line = 25)
    private static final void method350(boolean arg0) {
        if (field865 == arg0) {
            return;
        }
        if (arg0) {
            field848.glEnableClientState(32885);
        } else {
            field848.glDisableClientState(32885);
        }
        field865 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 41)
    public static final void method351(int arg0) {
        if (field862 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field848.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field848.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field848.glTexEnvi(8960, 34162, 260);
        }
        field862 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 57)
    public static final void method352(int arg0) {
        field848.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field848.glClear(16640);
        field848.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(FF)V", line = 69)
    public static final void method353(float arg0, float arg1) {
        if (field869 || field843 == arg0 && field873 == arg1) {
            return;
        }
        field843 = arg0;
        field873 = arg1;
        if (arg1 == 0.0F) {
            field867[10] = field852;
            field867[14] = field868;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field868 * (1.0F - var2) / arg1;
            field867[10] = field852 + var4;
            field867[14] = field868 * var3;
        }
        field848.glMatrixMode(5889);
        field848.glLoadMatrixf(field867, 0);
        field848.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V", line = 101)
    public static final void method354(int arg0) {
        if (field863 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field848.glDisable(3553);
        } else {
            if (field863 == -1) {
                field848.glEnable(3553);
            }
            field848.glBindTexture(3553, arg0);
        }
        field863 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(F)V", line = 123)
    public static final void method355(float arg0) {
        method353(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "()V", line = 128)
    public static final void method356() {
        field848.glDepthMask(false);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(FFF)V", line = 139)
    public static final void method357(float arg0, float arg1, float arg2) {
        field848.glMatrixMode(5890);
        if (field874) {
            field848.glLoadIdentity();
        }
        field848.glTranslatef(arg0, arg1, arg2);
        field848.glMatrixMode(5888);
        field874 = true;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "()V", line = 150)
    public static final void method358() {
        int[] var0 = new int[2];
        field848.glGetIntegerv(3073, var0, 0);
        field848.glGetIntegerv(3074, var0, 1);
        field848.glDrawBuffer(1026);
        field848.glReadBuffer(1024);
        method354(-1);
        field848.glPushAttrib(8192);
        field848.glDisable(2912);
        field848.glDisable(3042);
        field848.glDisable(2929);
        field848.glDisable(3008);
        field848.glRasterPos2i(0, 0);
        field848.glCopyPixels(0, 0, field842, field870, 6144);
        field848.glPopAttrib();
        field848.glDrawBuffer(var0[0]);
        field848.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIFFII)V", line = 169)
    public static final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field848.glMatrixMode(5889);
        field848.glLoadIdentity();
        method367((float) var10 * field857, (float) var11 * field857, (float) (-var13) * field857, (float) (-var12) * field857, 50.0F, 3584.0F);
        field848.glViewport(arg0, field870 - arg1 - arg3, arg2, arg3);
        field848.glMatrixMode(5888);
        field848.glLoadIdentity();
        field848.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field848.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field848.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field869 = false;
        class265.field4492 = var10;
        class58.field915 = var11;
        class87.field1370 = var12;
        class269.field4551 = var13;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "()V", line = 196)
    public static final void method360() {
        field848.glDepthMask(true);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V", line = 200)
    public static final void method361(boolean arg0) {
        if (field861 == arg0) {
            return;
        }
        if (arg0) {
            field848.glEnable(2912);
        } else {
            field848.glDisable(2912);
        }
        field861 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "()V", line = 214)
    public static final void method362() {
        field848.glClear(256);
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "()V", line = 223)
    public static final void method363() {
        class51.method325(0, 0, 26604);
        method372();
        method354(-1);
        method384(false);
        method369(false);
        method361(false);
        method382();
    }

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "()V", line = 232)
    public static final void method364() {
        class51.method325(0, 0, 26604);
        method372();
        method381(1);
        method351(1);
        method384(false);
        method369(false);
        method361(false);
        method382();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V", line = 245)
    public static final void method365(int arg0, int arg1) {
        field842 = arg0;
        field870 = arg1;
        field869 = false;
    }

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "()V", line = 250)
    private static final void method366() {
        field869 = false;
        field848.glDisable(3553);
        field863 = -1;
        field848.glTexEnvi(8960, 8704, 34160);
        field848.glTexEnvi(8960, 34161, 8448);
        field839 = 0;
        field848.glTexEnvi(8960, 34162, 8448);
        field862 = 0;
        field848.glEnable(2896);
        field848.glEnable(2912);
        field848.glEnable(2929);
        field856 = true;
        field864 = true;
        field861 = true;
        class46.method284(96);
        field848.glActiveTexture(33985);
        field848.glTexEnvi(8960, 8704, 34160);
        field848.glTexEnvi(8960, 34161, 8448);
        field848.glTexEnvi(8960, 34162, 8448);
        field848.glActiveTexture(33984);
        field848.setSwapInterval(0);
        field848.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field848.glShadeModel(7425);
        field848.glClearDepth(1.0D);
        field848.glDepthFunc(515);
        method360();
        field848.glMatrixMode(5890);
        field848.glLoadIdentity();
        field848.glPolygonMode(1028, 6914);
        field848.glEnable(2884);
        field848.glCullFace(1029);
        field848.glEnable(3042);
        field848.glBlendFunc(770, 771);
        field848.glEnable(3008);
        field848.glAlphaFunc(516, 0.0F);
        field848.glEnableClientState(32884);
        field848.glEnableClientState(32885);
        field865 = true;
        field848.glEnableClientState(32886);
        field848.glEnableClientState(32888);
        field848.glMatrixMode(5888);
        field848.glLoadIdentity();
        class235.method1595();
        class256.method1735();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(FFFFFF)V", line = 298)
    private static final void method367(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field867[0] = var6 / (arg1 - arg0);
        field867[1] = 0.0F;
        field867[2] = 0.0F;
        field867[3] = 0.0F;
        field867[4] = 0.0F;
        field867[5] = var6 / (arg3 - arg2);
        field867[6] = 0.0F;
        field867[7] = 0.0F;
        field867[8] = (arg0 + arg1) / (arg1 - arg0);
        field867[9] = (arg2 + arg3) / (arg3 - arg2);
        field867[10] = field852 = -(arg4 + arg5) / (arg5 - arg4);
        field867[11] = -1.0F;
        field867[12] = 0.0F;
        field867[13] = 0.0F;
        field867[14] = field868 = -(arg5 * var6) / (arg5 - arg4);
        field867[15] = 0.0F;
        field848.glLoadMatrixf(field867, 0);
        field843 = 0.0F;
        field873 = 0.0F;
    }

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "()V", line = 320)
    public static final void method368() {
        if (class249.field4166) {
            method384(true);
            method350(true);
        } else {
            method384(false);
            method350(false);
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(Z)V", line = 333)
    public static final void method369(boolean arg0) {
        if (field864 == arg0) {
            return;
        }
        if (arg0) {
            field848.glEnable(2929);
        } else {
            field848.glDisable(2929);
        }
        field864 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "()I", line = 347)
    private static final int method370() {
        int var0 = 0;
        field844 = field848.glGetString(7936);
        field875 = field848.glGetString(7937);
        String var1 = field844.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field848.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field850 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field850 < 12) {
            var0 |= 0x2;
        }
        if (!field848.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field848.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field848.glGetIntegerv(34018, var7, 0);
        field840 = var7[0];
        field848.glGetIntegerv(34929, var7, 0);
        field851 = var7[0];
        field848.glGetIntegerv(34930, var7, 0);
        field841 = var7[0];
        if (field840 < 2 || field851 < 2 || field841 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field845 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field855 = field848.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field859 = field848.isExtensionAvailable("GL_ARB_multisample");
        field872 = field848.isExtensionAvailable("GL_ARB_texture_cube_map");
        field866 = field848.isExtensionAvailable("GL_ARB_vertex_program");
        field849 = field848.isExtensionAvailable("GL_EXT_texture3D");
        class126 var8 = method375(field875).method838((byte) -69);
        if (var8.method875(field847, -86) != -1) {
            int var9 = 0;
            class126[] var10 = var8.method866(32, 47, -16192).method856(32, -39);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class126 var12 = var10[var11];
                if (var12.method878((byte) -121) >= 4 && var12.method859(4, 109, 0).method841(-22923)) {
                    var9 = var12.method859(4, 100, 0).method836(31252);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field855 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field849 = false;
            }
            field858 = field855;
        }
        if (field855) {
            try {
                int[] var13 = new int[1];
                field848.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "()V", line = 462)
    public static final void method371() {
        try {
            field860.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "()V", line = 470)
    private static final void method372() {
        if (field869) {
            return;
        }
        field848.glMatrixMode(5889);
        field848.glLoadIdentity();
        field848.glOrtho(0.0D, (double) field842, 0.0D, (double) field870, -1.0D, 1.0D);
        field848.glViewport(0, 0, field842, field870);
        field848.glMatrixMode(5888);
        field848.glLoadIdentity();
        field869 = true;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIII)V", line = 484)
    public static final void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field842 - arg0;
        int var8 = -arg1;
        int var9 = field870 - arg1;
        field848.glMatrixMode(5889);
        field848.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field848.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field848.glViewport(0, 0, field842, field870);
        field848.glMatrixMode(5888);
        field848.glLoadIdentity();
        field848.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field869 = false;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 514)
    public static final void method374(Canvas arg0) {
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

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;)Lce;", line = 536)
    private static final class126 method375(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class301.method2021(0, var1.length, var1, false);
    }

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "()F", line = 550)
    public static final float method376() {
        return field843;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIII)V", line = 554)
    public static final void method377(int arg0, int arg1, int arg2, int arg3) {
        method359(0, 0, field842, field870, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "()V", line = 566)
    public static void method378() {
        field847 = null;
        field875 = null;
        field844 = null;
        field848 = null;
        field860 = null;
        field853 = null;
        field867 = null;
    }

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "()F", line = 575)
    public static final float method379() {
        return field873;
    }

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "()V", line = 582)
    public static final void method380() {
        if (field848 != null) {
            try {
                class287.method1909(false);
            } catch (Throwable var7) {
            }
            field848 = null;
        }
        if (field853 != null) {
            class121.method795();
            try {
                if (GLContext.getCurrent() == field853) {
                    field853.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field853.destroy();
            } catch (Throwable var5) {
            }
            field853 = null;
        }
        if (field860 != null) {
            try {
                field860.setRealized(false);
            } catch (Throwable var4) {
            }
            field860 = null;
        }
        class256.method1726();
        field846 = false;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V", line = 633)
    public static final void method381(int arg0) {
        if (field839 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field848.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field848.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field848.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field848.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field848.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field848.glTexEnvi(8960, 34161, 34165);
        }
        field839 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "()V", line = 659)
    public static final void method382() {
        if (field874) {
            field848.glMatrixMode(5890);
            field848.glLoadIdentity();
            field848.glMatrixMode(5888);
            field874 = false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "()V", line = 680)
    public static final void method383() {
        class51.method325(0, 0, 26604);
        method372();
        method381(0);
        method351(0);
        method384(false);
        method369(false);
        method361(false);
        method382();
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(Z)V", line = 690)
    public static final void method384(boolean arg0) {
        if (field856 == arg0) {
            return;
        }
        if (arg0) {
            field848.glEnable(2896);
        } else {
            field848.glDisable(2896);
        }
        field856 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "()V", line = 707)
    public static final void method385() {
        class51.method325(0, 0, 26604);
        method372();
        method381(0);
        method351(0);
        method384(false);
        method369(false);
        method361(false);
        method382();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 718)
    public static final int method386(Canvas arg0, int arg1) {
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
            field860 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field860.setRealized(true);
            int var4 = 0;
            while (true) {
                field853 = field860.createContext((GLContext) null);
                try {
                    int var5 = field853.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class313.method2158(1000L, true);
            }
            field848 = field853.getGL();
            new GLU();
            field846 = true;
            field842 = arg0.getSize().width;
            field870 = arg0.getSize().height;
            int var7 = method370();
            if (var7 != 0) {
                method380();
                return var7;
            }
            method349();
            method366();
            field848.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field860.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method380();
                        return -3;
                    }
                    class313.method2158(100L, true);
                }
            }
            field848.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method380();
            return -5;
        }
    }
}
