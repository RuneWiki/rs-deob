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

@OriginalClass("client!we")
public class class47 {

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    private static int field750 = 0;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "F")
    private static float field748 = 0.0F;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Z")
    private static boolean field741 = true;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "F")
    private static float field737 = 0.09765625F;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field743 = 0;

    @OriginalMember(owner = "client!we", name = "D", descriptor = "Z")
    private static boolean field766 = false;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    private static int field760 = -1;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
    private static boolean field751 = true;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Z")
    private static boolean field740 = true;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    private static int field755 = 0;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "F")
    private static float field763 = 0.0F;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Z")
    public static boolean field752 = true;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[F")
    private static float[] field738 = new float[16];

    @OriginalMember(owner = "client!we", name = "I", descriptor = "Z")
    private static boolean field771 = false;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "Lwa;")
    private static class75 field765 = class66.method560("radeon", false);

    @OriginalMember(owner = "client!we", name = "J", descriptor = "Z")
    private static boolean field772 = false;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "F")
    private static float field758;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "F")
    private static float field764;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    private static int field742;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    private static int field753;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    private static int field770;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Ljava/lang/String;")
    public static String field744;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Ljava/lang/String;")
    public static String field759;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field739;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field761;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field767;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Z")
    public static boolean field746;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Z")
    public static boolean field747;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Z")
    public static boolean field749;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Z")
    public static boolean field754;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "Z")
    public static boolean field768;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "Z")
    public static boolean field769;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "Z")
    public static boolean field773;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V", line = 10)
    public static final void method309() {
        class140.method1079(0, (byte) 127, 0);
        method343();
        method324(5);
        method337(0);
        method321(false);
        method335(false);
        method320(false);
        method319();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(FFF)V", line = 20)
    public static final void method310(float arg0, float arg1, float arg2) {
        field739.glMatrixMode(5890);
        if (field766) {
            field739.glLoadIdentity();
        }
        field739.glTranslatef(arg0, arg1, arg2);
        field739.glMatrixMode(5888);
        field766 = true;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()V", line = 30)
    public static final void method311() {
        try {
            field767.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()V", line = 37)
    public static final void method312() {
        class140.method1079(0, (byte) 127, 0);
        method343();
        method317(-1);
        method321(false);
        method335(false);
        method320(false);
        method319();
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "()V", line = 46)
    public static void method313() {
        field765 = null;
        field744 = null;
        field759 = null;
        field739 = null;
        field767 = null;
        field761 = null;
        field738 = null;
    }

    @OriginalMember(owner = "client!we", name = "e", descriptor = "()V", line = 57)
    private static final void method314() {
        field771 = false;
        field739.glDisable(3553);
        field760 = -1;
        field739.glTexEnvi(8960, 8704, 34160);
        field739.glTexEnvi(8960, 34161, 8448);
        field755 = 0;
        field739.glTexEnvi(8960, 34162, 8448);
        field750 = 0;
        field739.glEnable(2896);
        field739.glEnable(2912);
        field739.glEnable(2929);
        field751 = true;
        field741 = true;
        field740 = true;
        class166.method1235(10024);
        field739.glActiveTexture(33985);
        field739.glTexEnvi(8960, 8704, 34160);
        field739.glTexEnvi(8960, 34161, 8448);
        field739.glTexEnvi(8960, 34162, 8448);
        field739.glActiveTexture(33984);
        field739.setSwapInterval(0);
        field739.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field739.glShadeModel(7425);
        field739.glClearDepth(1.0D);
        field739.glDepthFunc(515);
        method325();
        field739.glMatrixMode(5890);
        field739.glLoadIdentity();
        field739.glPolygonMode(1028, 6914);
        field739.glEnable(2884);
        field739.glCullFace(1029);
        field739.glEnable(3042);
        field739.glBlendFunc(770, 771);
        field739.glEnable(3008);
        field739.glAlphaFunc(516, 0.0F);
        field739.glEnableClientState(32884);
        field739.glEnableClientState(32885);
        field752 = true;
        field739.glEnableClientState(32886);
        field739.glEnableClientState(32888);
        field739.glMatrixMode(5888);
        field739.glLoadIdentity();
        class239.method1748();
        class209.method1545();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(F)V", line = 105)
    public static final void method315(float arg0) {
        method332(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!we", name = "f", descriptor = "()V", line = 109)
    private static final void method316() {
        int[] var0 = new int[1];
        field739.glGenTextures(1, var0, 0);
        field757 = var0[0];
        field739.glBindTexture(3553, field757);
        field739.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class87.method695(1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 117)
    public static final void method317(int arg0) {
        if (field760 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field739.glDisable(3553);
        } else {
            if (field760 == -1) {
                field739.glEnable(3553);
            }
            field739.glBindTexture(3553, arg0);
        }
        field760 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "g", descriptor = "()I", line = 134)
    private static final int method318() {
        int var0 = 0;
        field759 = field739.glGetString(7936);
        field744 = field739.glGetString(7937);
        String var1 = field759.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field739.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field742 = var4 * 10 + var5;
            } catch (NumberFormatException var13) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field742 < 12) {
            var0 |= 0x2;
        }
        if (!field739.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field739.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field739.glGetIntegerv(34018, var7, 0);
        field756 = var7[0];
        field739.glGetIntegerv(34929, var7, 0);
        field770 = var7[0];
        field739.glGetIntegerv(34930, var7, 0);
        field753 = var7[0];
        if (field756 < 2 || field770 < 2 || field753 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field749 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field768 = field739.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field769 = field739.isExtensionAvailable("GL_ARB_multisample");
        field747 = field739.isExtensionAvailable("GL_ARB_texture_cube_map");
        field773 = field739.isExtensionAvailable("GL_ARB_vertex_program");
        field754 = field739.isExtensionAvailable("GL_EXT_texture3D");
        class75 var8 = method331(field744).method622(0);
        if (var8.method657((byte) -95, field765) != -1) {
            int var9 = 0;
            class75[] var10 = var8.method645(47, (byte) 34, 32).method654(-120, 32);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class75 var12 = var10[var11];
                if (var12.method640(1) >= 4 && var12.method661(87, 0, 4).method643(10)) {
                    var9 = var12.method661(89, 0, 4).method647((byte) -60);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field768 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field754 = false;
            }
            field746 = field768;
        }
        return 0;
    }

    @OriginalMember(owner = "client!we", name = "h", descriptor = "()V", line = 231)
    public static final void method319() {
        if (field766) {
            field739.glMatrixMode(5890);
            field739.glLoadIdentity();
            field739.glMatrixMode(5888);
            field766 = false;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 245)
    public static final void method320(boolean arg0) {
        if (field740 == arg0) {
            return;
        }
        if (arg0) {
            field739.glEnable(2912);
        } else {
            field739.glDisable(2912);
        }
        field740 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V", line = 257)
    public static final void method321(boolean arg0) {
        if (field751 == arg0) {
            return;
        }
        if (arg0) {
            field739.glEnable(2896);
        } else {
            field739.glDisable(2896);
        }
        field751 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V", line = 273)
    public static final void method322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field745 - arg0;
        int var8 = -arg1;
        int var9 = field762 - arg1;
        field739.glMatrixMode(5889);
        field739.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field739.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field739.glViewport(0, 0, field745, field762);
        field739.glMatrixMode(5888);
        field739.glLoadIdentity();
        field739.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field771 = false;
    }

    @OriginalMember(owner = "client!we", name = "i", descriptor = "()V", line = 308)
    public static final void method323() {
        class140.method1079(0, (byte) -76, 0);
        method343();
        method324(0);
        method337(0);
        method321(false);
        method335(false);
        method320(false);
        method319();
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 318)
    public static final void method324(int arg0) {
        if (field755 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field739.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field739.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field739.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field739.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field739.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field739.glTexEnvi(8960, 34161, 34165);
        }
        field755 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "j", descriptor = "()V", line = 351)
    public static final void method325() {
        field739.glDepthMask(true);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(Z)V", line = 354)
    private static final void method326(boolean arg0) {
        if (field752 == arg0) {
            return;
        }
        if (arg0) {
            field739.glEnableClientState(32885);
        } else {
            field739.glDisableClientState(32885);
        }
        field752 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V", line = 367)
    public static final void method327(int arg0) {
        field739.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field739.glClear(16640);
    }

    @OriginalMember(owner = "client!we", name = "k", descriptor = "()V", line = 375)
    public static final void method328() {
        class140.method1079(0, (byte) -8, 0);
        method343();
        method324(1);
        method337(1);
        method321(false);
        method335(false);
        method320(false);
        method319();
    }

    @OriginalMember(owner = "client!we", name = "l", descriptor = "()F", line = 388)
    public static final float method329() {
        return field748;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(FFFFFF)V", line = 395)
    private static final void method330(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field738[0] = var6 / (arg1 - arg0);
        field738[1] = 0.0F;
        field738[2] = 0.0F;
        field738[3] = 0.0F;
        field738[4] = 0.0F;
        field738[5] = var6 / (arg3 - arg2);
        field738[6] = 0.0F;
        field738[7] = 0.0F;
        field738[8] = (arg0 + arg1) / (arg1 - arg0);
        field738[9] = (arg2 + arg3) / (arg3 - arg2);
        field738[10] = field758 = -(arg4 + arg5) / (arg5 - arg4);
        field738[11] = -1.0F;
        field738[12] = 0.0F;
        field738[13] = 0.0F;
        field738[14] = field764 = -(arg5 * var6) / (arg5 - arg4);
        field738[15] = 0.0F;
        field739.glLoadMatrixf(field738, 0);
        field763 = 0.0F;
        field748 = 0.0F;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;)Lwa;", line = 419)
    private static final class75 method331(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class191.method1442(var1.length, (byte) 67, 0, var1);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(FF)V", line = 429)
    public static final void method332(float arg0, float arg1) {
        if (field771 || field763 == arg0 && field748 == arg1) {
            return;
        }
        field763 = arg0;
        field748 = arg1;
        if (arg1 == 0.0F) {
            field738[10] = field758;
            field738[14] = field764;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field764 * (1.0F - var2) / arg1;
            field738[10] = field758 + var4;
            field738[14] = field764 * var3;
        }
        field739.glMatrixMode(5889);
        field739.glLoadMatrixf(field738, 0);
        field739.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIFFII)V", line = 468)
    public static final void method333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field739.glMatrixMode(5889);
        field739.glLoadIdentity();
        method330((float) var10 * field737, (float) var11 * field737, (float) (-var13) * field737, (float) (-var12) * field737, 50.0F, 3584.0F);
        field739.glViewport(arg0, field762 - arg1 - arg3, arg2, arg3);
        field739.glMatrixMode(5888);
        field739.glLoadIdentity();
        field739.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field739.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field739.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field771 = false;
        class253.field4250 = var10;
        class297.field5083 = var11;
        class180.field3021 = var12;
        class2.field5 = var13;
    }

    @OriginalMember(owner = "client!we", name = "m", descriptor = "()V", line = 496)
    public static final void method334() {
        if (class116.field1970) {
            method321(true);
            method326(true);
        } else {
            method321(false);
            method326(false);
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(Z)V", line = 512)
    public static final void method335(boolean arg0) {
        if (field741 == arg0) {
            return;
        }
        if (arg0) {
            field739.glEnable(2929);
        } else {
            field739.glDisable(2929);
        }
        field741 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 526)
    public static final int method336(Canvas arg0, int arg1) {
        if (!arg0.isDisplayable()) {
            throw new IllegalStateException("Supplied canvas not on screen");
        }
        GLCapabilities var2 = new GLCapabilities();
        if (arg1 > 0) {
            var2.setSampleBuffers(true);
            var2.setNumSamples(arg1);
        }
        GLDrawableFactory var3 = GLDrawableFactory.getFactory();
        field767 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
        field767.setRealized(true);
        while (true) {
            field761 = field767.createContext((GLContext) null);
            try {
                int var4 = field761.makeCurrent();
                if (var4 != 0) {
                    break;
                }
            } catch (Exception var10) {
            }
            class235.method1708(90, 1000L);
        }
        field739 = field761.getGL();
        new GLU();
        field745 = arg0.getSize().width;
        field762 = arg0.getSize().height;
        if (!field772) {
            int var6 = method318();
            if (var6 != 0) {
                return var6;
            }
            field772 = true;
        }
        method316();
        method314();
        field739.glClear(16384);
        int var7 = 0;
        while (var7 < 10) {
            try {
                field767.swapBuffers();
                break;
            } catch (Exception var9) {
                class235.method1708(107, 100L);
                var7++;
            }
        }
        field739.glClear(16384);
        return 0;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V", line = 599)
    public static final void method337(int arg0) {
        if (field750 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field739.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field739.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field739.glTexEnvi(8960, 34162, 260);
        }
        field750 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "n", descriptor = "()V", line = 615)
    public static final void method338() {
        int[] var0 = new int[2];
        field739.glGetIntegerv(3073, var0, 0);
        field739.glGetIntegerv(3074, var0, 1);
        field739.glDrawBuffer(1026);
        field739.glReadBuffer(1024);
        method317(-1);
        field739.glPushAttrib(8192);
        field739.glDisable(2912);
        field739.glDisable(3042);
        field739.glDisable(2929);
        field739.glDisable(3008);
        field739.glRasterPos2i(0, 0);
        field739.glCopyPixels(0, 0, field745, field762, 6144);
        field739.glPopAttrib();
        field739.glDrawBuffer(var0[0]);
        field739.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!we", name = "o", descriptor = "()V", line = 633)
    public static final void method339() {
        field739.glClear(256);
    }

    @OriginalMember(owner = "client!we", name = "p", descriptor = "()F", line = 637)
    public static final float method340() {
        return field763;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)V", line = 651)
    public static final void method341(int arg0, int arg1, int arg2, int arg3) {
        method333(0, 0, field745, field762, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 658)
    public static final void method342(int arg0, int arg1) {
        field745 = arg0;
        field762 = arg1;
        field771 = false;
    }

    @OriginalMember(owner = "client!we", name = "q", descriptor = "()V", line = 668)
    private static final void method343() {
        if (field771) {
            return;
        }
        field739.glMatrixMode(5889);
        field739.glLoadIdentity();
        field739.glOrtho(0.0D, (double) field745, 0.0D, (double) field762, -1.0D, 1.0D);
        field739.glViewport(0, 0, field745, field762);
        field739.glMatrixMode(5888);
        field739.glLoadIdentity();
        field771 = true;
    }

    @OriginalMember(owner = "client!we", name = "r", descriptor = "()V", line = 682)
    public static final void method344() {
        class140.method1079(0, (byte) -89, 0);
        method343();
        method324(0);
        method337(0);
        method321(false);
        method335(false);
        method320(false);
        method319();
    }

    @OriginalMember(owner = "client!we", name = "s", descriptor = "()V", line = 695)
    public static final void method345() {
        field739.glDepthMask(false);
    }

    @OriginalMember(owner = "client!we", name = "t", descriptor = "()V", line = 701)
    public static final void method346() {
        if (field739 != null) {
            class156.method1188(3);
            field739 = null;
        }
        if (field761 != null) {
            class119.method908();
            if (GLContext.getCurrent() == field761) {
                field761.release();
            }
            field761.destroy();
            field761 = null;
        }
        if (field767 != null) {
            field767.setRealized(false);
            field767 = null;
        }
    }
}
