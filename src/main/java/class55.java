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

@OriginalClass("client!ni")
public class class55 {

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    private static int field800 = -1;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Z")
    private static boolean field804 = false;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "F")
    private static float field807 = 0.09765625F;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "[F")
    private static float[] field809 = new float[16];

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Z")
    private static boolean field810 = true;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "F")
    private static float field802 = 0.0F;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "F")
    private static float field805 = 0.0F;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "Z")
    private static boolean field816 = true;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Z")
    private static boolean field813 = true;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "Z")
    private static boolean field817 = false;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field821 = 0;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Ltl;")
    private static class59 field820 = class85.method639("radeon", 9588);

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Z")
    public static boolean field823 = true;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    private static int field818 = 0;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    private static int field822 = 0;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Z")
    public static boolean field815 = false;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "F")
    private static float field796;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "F")
    private static float field814;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    private static int field797;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    private static int field811;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    private static int field832;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Ljava/lang/String;")
    private static String field803;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "Ljava/lang/String;")
    private static String field830;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field812;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field824;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field829;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Z")
    public static boolean field798;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Z")
    public static boolean field799;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Z")
    public static boolean field801;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "Z")
    public static boolean field819;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "Z")
    public static boolean field826;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "Z")
    public static boolean field827;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "Z")
    public static boolean field831;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V", line = 11)
    public static final void method385(int arg0, int arg1) {
        field808 = arg0;
        field806 = arg1;
        field817 = false;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 16)
    public static final void method386(int arg0) {
        if (field822 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field812.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field812.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field812.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field812.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field812.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field812.glTexEnvi(8960, 34161, 34165);
        }
        field822 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIFFII)V", line = 41)
    public static final void method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field812.glMatrixMode(5889);
        field812.glLoadIdentity();
        method402((float) var10 * field807, (float) var11 * field807, (float) (-var13) * field807, (float) (-var12) * field807, 50.0F, 3584.0F);
        field812.glViewport(arg0, field806 - arg1 - arg3, arg2, arg3);
        field812.glMatrixMode(5888);
        field812.glLoadIdentity();
        field812.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field812.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field812.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field817 = false;
        class268.field4662 = var10;
        class233.field3837 = var11;
        class72.field1130 = var12;
        class286.field4916 = var13;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;)Ltl;", line = 70)
    private static final class59 method388(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class316.method2176(0, var1.length, true, var1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V", line = 78)
    public static final void method389() {
        int[] var0 = new int[2];
        field812.glGetIntegerv(3073, var0, 0);
        field812.glGetIntegerv(3074, var0, 1);
        field812.glDrawBuffer(1026);
        field812.glReadBuffer(1024);
        method407(-1);
        field812.glPushAttrib(8192);
        field812.glDisable(2912);
        field812.glDisable(3042);
        field812.glDisable(2929);
        field812.glDisable(3008);
        field812.glRasterPos2i(0, 0);
        field812.glCopyPixels(0, 0, field808, field806, 6144);
        field812.glPopAttrib();
        field812.glDrawBuffer(var0[0]);
        field812.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()V", line = 96)
    public static final void method390() {
        field812.glDepthMask(false);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(F)V", line = 99)
    public static final void method391(float arg0) {
        method412(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "()V", line = 103)
    private static final void method392() {
        int[] var0 = new int[1];
        field812.glGenTextures(1, var0, 0);
        field828 = var0[0];
        field812.glBindTexture(3553, field828);
        field812.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class84.method630(0);
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "()V", line = 112)
    public static final void method393() {
        if (field812 != null) {
            try {
                class88.method658((byte) -128);
            } catch (Throwable var7) {
            }
            field812 = null;
        }
        if (field824 != null) {
            class104.method789();
            try {
                if (GLContext.getCurrent() == field824) {
                    field824.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field824.destroy();
            } catch (Throwable var5) {
            }
            field824 = null;
        }
        if (field829 != null) {
            try {
                field829.setRealized(false);
            } catch (Throwable var4) {
            }
            field829 = null;
        }
        class135.method984();
        field815 = false;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "()V", line = 160)
    public static final void method394() {
        class131.method963(-12390, 0, 0);
        method401();
        method386(0);
        method405(0);
        method399(false);
        method420(false);
        method417(false);
        method414();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(FFF)V", line = 171)
    public static final void method395(float arg0, float arg1, float arg2) {
        field812.glMatrixMode(5890);
        if (field804) {
            field812.glLoadIdentity();
        }
        field812.glTranslatef(arg0, arg1, arg2);
        field812.glMatrixMode(5888);
        field804 = true;
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "()V", line = 181)
    public static final void method396() {
        field812.glClear(256);
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "()F", line = 185)
    public static final float method397() {
        return field805;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V", line = 188)
    private static final void method398(boolean arg0) {
        if (field823 == arg0) {
            return;
        }
        if (arg0) {
            field812.glEnableClientState(32885);
        } else {
            field812.glDisableClientState(32885);
        }
        field823 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Z)V", line = 207)
    public static final void method399(boolean arg0) {
        if (field810 == arg0) {
            return;
        }
        if (arg0) {
            field812.glEnable(2896);
        } else {
            field812.glDisable(2896);
        }
        field810 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "()I", line = 221)
    private static final int method400() {
        int var0 = 0;
        field830 = field812.glGetString(7936);
        field803 = field812.glGetString(7937);
        String var1 = field830.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field812.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field797 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field797 < 12) {
            var0 |= 0x2;
        }
        if (!field812.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field812.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field812.glGetIntegerv(34018, var7, 0);
        field825 = var7[0];
        field812.glGetIntegerv(34929, var7, 0);
        field832 = var7[0];
        field812.glGetIntegerv(34930, var7, 0);
        field811 = var7[0];
        if (field825 < 2 || field832 < 2 || field811 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field819 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field798 = field812.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field831 = field812.isExtensionAvailable("GL_ARB_multisample");
        field801 = field812.isExtensionAvailable("GL_ARB_texture_cube_map");
        field826 = field812.isExtensionAvailable("GL_ARB_vertex_program");
        field827 = field812.isExtensionAvailable("GL_EXT_texture3D");
        class59 var8 = method388(field803).method466(122);
        if (var8.method478(field820, (byte) -98) != -1) {
            int var9 = 0;
            class59[] var10 = var8.method489(47, 32, (byte) -107).method494(32, false);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class59 var12 = var10[var11];
                if (var12.method495(30) >= 4 && var12.method473(4, 0, (byte) 70).method456(116)) {
                    var9 = var12.method473(4, 0, (byte) 53).method485(92);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field798 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field827 = false;
            }
            field799 = field798;
        }
        if (field798) {
            try {
                int[] var13 = new int[1];
                field812.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "()V", line = 330)
    private static final void method401() {
        if (field817) {
            return;
        }
        field812.glMatrixMode(5889);
        field812.glLoadIdentity();
        field812.glOrtho(0.0D, (double) field808, 0.0D, (double) field806, -1.0D, 1.0D);
        field812.glViewport(0, 0, field808, field806);
        field812.glMatrixMode(5888);
        field812.glLoadIdentity();
        field817 = true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(FFFFFF)V", line = 347)
    private static final void method402(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field809[0] = var6 / (arg1 - arg0);
        field809[1] = 0.0F;
        field809[2] = 0.0F;
        field809[3] = 0.0F;
        field809[4] = 0.0F;
        field809[5] = var6 / (arg3 - arg2);
        field809[6] = 0.0F;
        field809[7] = 0.0F;
        field809[8] = (arg0 + arg1) / (arg1 - arg0);
        field809[9] = (arg2 + arg3) / (arg3 - arg2);
        field809[10] = field796 = -(arg4 + arg5) / (arg5 - arg4);
        field809[11] = -1.0F;
        field809[12] = 0.0F;
        field809[13] = 0.0F;
        field809[14] = field814 = -(arg5 * var6) / (arg5 - arg4);
        field809[15] = 0.0F;
        field812.glLoadMatrixf(field809, 0);
        field802 = 0.0F;
        field805 = 0.0F;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V", line = 375)
    public static final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field808 - arg0;
        int var8 = -arg1;
        int var9 = field806 - arg1;
        field812.glMatrixMode(5889);
        field812.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field812.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field812.glViewport(0, 0, field808, field806);
        field812.glMatrixMode(5888);
        field812.glLoadIdentity();
        field812.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field817 = false;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V", line = 398)
    public static final void method404(int arg0) {
        field812.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field812.glClear(16640);
        field812.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V", line = 403)
    public static final void method405(int arg0) {
        if (field818 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field812.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field812.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field812.glTexEnvi(8960, 34162, 260);
        }
        field818 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 419)
    public static final int method406(Canvas arg0, int arg1) {
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
            field829 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field829.setRealized(true);
            int var4 = 0;
            while (true) {
                field824 = field829.createContext((GLContext) null);
                try {
                    int var5 = field824.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class183.method1360(false, 1000L);
            }
            field812 = field824.getGL();
            new GLU();
            field815 = true;
            field808 = arg0.getSize().width;
            field806 = arg0.getSize().height;
            int var7 = method400();
            if (var7 != 0) {
                method393();
                return var7;
            }
            method392();
            method421();
            field812.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field829.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method393();
                        return -3;
                    }
                    class183.method1360(false, 100L);
                }
            }
            field812.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method393();
            return -5;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V", line = 503)
    public static final void method407(int arg0) {
        if (field800 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field812.glDisable(3553);
        } else {
            if (field800 == -1) {
                field812.glEnable(3553);
            }
            field812.glBindTexture(3553, arg0);
        }
        field800 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 520)
    public static final void method408(Canvas arg0) {
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

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "()V", line = 541)
    public static final void method409() {
        class131.method963(-12390, 0, 0);
        method401();
        method407(-1);
        method399(false);
        method420(false);
        method417(false);
        method414();
    }

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "()V", line = 551)
    public static final void method410() {
        class131.method963(-12390, 0, 0);
        method401();
        method386(1);
        method405(1);
        method399(false);
        method420(false);
        method417(false);
        method414();
    }

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "()V", line = 569)
    public static final void method411() {
        field812.glDepthMask(true);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(FF)V", line = 575)
    public static final void method412(float arg0, float arg1) {
        if (field817 || field802 == arg0 && field805 == arg1) {
            return;
        }
        field802 = arg0;
        field805 = arg1;
        if (arg1 == 0.0F) {
            field809[10] = field796;
            field809[14] = field814;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field814 * (1.0F - var2) / arg1;
            field809[10] = field796 + var4;
            field809[14] = field814 * var3;
        }
        field812.glMatrixMode(5889);
        field812.glLoadMatrixf(field809, 0);
        field812.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "()V", line = 608)
    public static void method413() {
        field820 = null;
        field803 = null;
        field830 = null;
        field812 = null;
        field829 = null;
        field824 = null;
        field809 = null;
    }

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "()V", line = 622)
    public static final void method414() {
        if (field804) {
            field812.glMatrixMode(5890);
            field812.glLoadIdentity();
            field812.glMatrixMode(5888);
            field804 = false;
        }
    }

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "()V", line = 632)
    public static final void method415() {
        class131.method963(-12390, 0, 0);
        method401();
        method386(0);
        method405(0);
        method399(false);
        method420(false);
        method417(false);
        method414();
    }

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "()V", line = 648)
    public static final void method416() {
        try {
            field829.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(Z)V", line = 656)
    public static final void method417(boolean arg0) {
        if (field813 == arg0) {
            return;
        }
        if (arg0) {
            field812.glEnable(2912);
        } else {
            field812.glDisable(2912);
        }
        field813 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "()V", line = 671)
    public static final void method418() {
        if (class308.field5243) {
            method399(true);
            method398(true);
        } else {
            method399(false);
            method398(false);
        }
    }

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "()F", line = 705)
    public static final float method419() {
        return field802;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(Z)V", line = 719)
    public static final void method420(boolean arg0) {
        if (field816 == arg0) {
            return;
        }
        if (arg0) {
            field812.glEnable(2929);
        } else {
            field812.glDisable(2929);
        }
        field816 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "()V", line = 731)
    private static final void method421() {
        field817 = false;
        field812.glDisable(3553);
        field800 = -1;
        field812.glTexEnvi(8960, 8704, 34160);
        field812.glTexEnvi(8960, 34161, 8448);
        field822 = 0;
        field812.glTexEnvi(8960, 34162, 8448);
        field818 = 0;
        field812.glEnable(2896);
        field812.glEnable(2912);
        field812.glEnable(2929);
        field810 = true;
        field816 = true;
        field813 = true;
        class167.method1183(0);
        field812.glActiveTexture(33985);
        field812.glTexEnvi(8960, 8704, 34160);
        field812.glTexEnvi(8960, 34161, 8448);
        field812.glTexEnvi(8960, 34162, 8448);
        field812.glActiveTexture(33984);
        field812.setSwapInterval(0);
        field812.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field812.glShadeModel(7425);
        field812.glClearDepth(1.0D);
        field812.glDepthFunc(515);
        method411();
        field812.glMatrixMode(5890);
        field812.glLoadIdentity();
        field812.glPolygonMode(1028, 6914);
        field812.glEnable(2884);
        field812.glCullFace(1029);
        field812.glEnable(3042);
        field812.glBlendFunc(770, 771);
        field812.glEnable(3008);
        field812.glAlphaFunc(516, 0.0F);
        field812.glEnableClientState(32884);
        field812.glEnableClientState(32885);
        field823 = true;
        field812.glEnableClientState(32886);
        field812.glEnableClientState(32888);
        field812.glMatrixMode(5888);
        field812.glLoadIdentity();
        class141.method1034();
        class135.method979();
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIII)V", line = 778)
    public static final void method422(int arg0, int arg1, int arg2, int arg3) {
        method387(0, 0, field808, field806, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }
}
