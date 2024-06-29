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

@OriginalClass("client!in")
public class class162 {

    @OriginalMember(owner = "client!in", name = "g", descriptor = "Z")
    private static boolean field2620 = false;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    private static int field2616 = 0;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    private static int field2631 = -1;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "Z")
    public static boolean field2623 = false;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "F")
    private static float field2638 = 0.09765625F;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Z")
    private static boolean field2615 = true;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "F")
    private static float field2630 = 0.0F;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "F")
    private static float field2626 = 0.0F;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "[F")
    private static float[] field2622 = new float[16];

    @OriginalMember(owner = "client!in", name = "o", descriptor = "Z")
    private static boolean field2628 = true;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "Z")
    private static boolean field2649 = false;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Z")
    public static boolean field2614 = true;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    private static int field2652 = -1;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    private static int field2637 = 0;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "Z")
    private static boolean field2632 = true;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    private static int field2657 = -1;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "F")
    private static float field2625;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "F")
    private static float field2653;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    private static int field2621;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    private static int field2629;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    private static int field2633;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    private static int field2648;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    private static int field2650;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!in", name = "U", descriptor = "I")
    private static int field2660;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "I")
    private static int field2661;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "Ljava/lang/String;")
    private static String field2636;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "Ljava/lang/String;")
    private static String field2647;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field2654;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field2651;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field2659;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Z")
    public static boolean field2617;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "Z")
    public static boolean field2624;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "Z")
    public static boolean field2627;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "Z")
    public static boolean field2634;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "Z")
    public static boolean field2635;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "Z")
    public static boolean field2639;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "Z")
    public static boolean field2640;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "Z")
    public static boolean field2642;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "Z")
    public static boolean field2643;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "Z")
    public static boolean field2644;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "Z")
    public static boolean field2655;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(FFFFFF)V", line = 13)
    private static final void method1188(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field2622[0] = var6 / (arg1 - arg0);
        field2622[1] = 0.0F;
        field2622[2] = 0.0F;
        field2622[3] = 0.0F;
        field2622[4] = 0.0F;
        field2622[5] = var6 / (arg3 - arg2);
        field2622[6] = 0.0F;
        field2622[7] = 0.0F;
        field2622[8] = (arg0 + arg1) / (arg1 - arg0);
        field2622[9] = (arg2 + arg3) / (arg3 - arg2);
        field2622[10] = field2653 = -(arg4 + arg5) / (arg5 - arg4);
        field2622[11] = -1.0F;
        field2622[12] = 0.0F;
        field2622[13] = 0.0F;
        field2622[14] = field2625 = -(arg5 * var6) / (arg5 - arg4);
        field2622[15] = 0.0F;
        field2654.glLoadMatrixf(field2622, 0);
        field2630 = 0.0F;
        field2626 = 0.0F;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "()V", line = 35)
    private static final void method1189() {
        field2620 = false;
        field2654.glDisable(3553);
        field2631 = -1;
        field2654.glTexEnvi(8960, 8704, 34160);
        field2654.glTexEnvi(8960, 34161, 8448);
        field2637 = 0;
        field2654.glTexEnvi(8960, 34162, 8448);
        field2616 = 0;
        field2654.glEnable(2896);
        field2654.glEnable(2912);
        field2654.glEnable(2929);
        field2628 = true;
        field2615 = true;
        field2632 = true;
        class209.method1531((byte) 44);
        field2654.glActiveTexture(33985);
        field2654.glTexEnvi(8960, 8704, 34160);
        field2654.glTexEnvi(8960, 34161, 8448);
        field2654.glTexEnvi(8960, 34162, 8448);
        field2654.glActiveTexture(33984);
        field2654.setSwapInterval(0);
        field2654.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field2654.glShadeModel(7425);
        field2654.glClearDepth(1.0D);
        field2654.glDepthFunc(515);
        method1203();
        field2654.glMatrixMode(5890);
        field2654.glLoadIdentity();
        field2654.glPolygonMode(1028, 6914);
        field2654.glEnable(2884);
        field2654.glCullFace(1029);
        field2654.glEnable(3042);
        field2654.glBlendFunc(770, 771);
        field2654.glEnable(3008);
        field2654.glAlphaFunc(516, 0.0F);
        field2654.glEnableClientState(32884);
        field2654.glEnableClientState(32885);
        field2614 = true;
        field2654.glEnableClientState(32886);
        field2654.glEnableClientState(32888);
        field2654.glMatrixMode(5888);
        field2654.glLoadIdentity();
        class261.method1811();
        class219.method1586();
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(F)V", line = 81)
    public static final void method1190(float arg0) {
        method1231(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "()F", line = 84)
    public static final float method1191() {
        return field2630;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "()I", line = 93)
    private static final int method1192() {
        int var0 = 0;
        field2636 = field2654.glGetString(7936);
        field2647 = field2654.glGetString(7937);
        String var1 = field2636.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field2654.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field2661 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field2661 < 12) {
            var0 |= 0x2;
        }
        if (!field2654.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field2654.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field2654.glGetIntegerv(34018, var7, 0);
        field2641 = var7[0];
        field2654.glGetIntegerv(34929, var7, 0);
        field2648 = var7[0];
        field2654.glGetIntegerv(34930, var7, 0);
        field2629 = var7[0];
        if (field2641 < 2 || field2648 < 2 || field2629 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field2624 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field2639 = field2654.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field2635 = field2654.isExtensionAvailable("GL_ARB_multisample");
        field2644 = field2654.isExtensionAvailable("GL_ARB_texture_cube_map");
        field2627 = field2654.isExtensionAvailable("GL_ARB_vertex_program");
        field2655 = field2654.isExtensionAvailable("GL_EXT_framebuffer_object");
        field2654.isExtensionAvailable("GL_ARB_vertex_shader");
        field2617 = field2654.isExtensionAvailable("GL_ARB_fragment_shader");
        field2643 = field2654.isExtensionAvailable("GL_EXT_texture3D");
        field2642 = field2654.isExtensionAvailable("GL_ARB_texture_rectangle");
        field2634 = field2654.isExtensionAvailable("GL_ARB_texture_float");
        String var8 = field2647.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class183.method1334(' ', var8.replace('/', ' '), 0);
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class157.method1165(var13.substring(1, 3), true)) {
                        var10 = true;
                        break;
                    }
                    if (class157.method1165(var13.substring(0, 4), true)) {
                        var9 = class299.method2119(var13.substring(0, 4), (byte) 1);
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field2639 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field2643 = false;
            }
            if (var9 >= 9200 || var10) {
                field2634 = false;
            }
            field2640 = field2639;
        }
        if (field2639) {
            try {
                int[] var14 = new int[1];
                field2654.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V", line = 225)
    public static final void method1193(boolean arg0) {
        if (field2615 == arg0) {
            return;
        }
        if (arg0) {
            field2654.glEnable(2929);
        } else {
            field2654.glDisable(2929);
        }
        field2615 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIII)V", line = 236)
    private static final void method1194(int arg0, int arg1, int arg2, int arg3) {
        field2621 = arg0;
        field2650 = arg1;
        field2660 = arg2;
        field2633 = arg3;
        method1230();
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "()V", line = 248)
    public static final void method1195() {
        class102.method830(0, 14804, 0);
        method1226();
        method1206(1);
        method1211(1);
        method1205(false);
        method1193(false);
        method1207(false);
        method1214();
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "()V", line = 265)
    public static final void method1196() {
        field2654.glDepthMask(false);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(Z)V", line = 269)
    private static final void method1197(boolean arg0) {
        if (field2614 == arg0) {
            return;
        }
        if (arg0) {
            field2654.glEnableClientState(32885);
        } else {
            field2654.glDisableClientState(32885);
        }
        field2614 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 291)
    public static final void method1198(int arg0) {
        field2654.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2654.glClear(16640);
        field2654.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "()V", line = 297)
    public static final void method1199() {
        if (class229.field3531) {
            method1205(true);
            method1197(true);
        } else {
            method1205(false);
            method1197(false);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 311)
    public static final int method1200(Canvas arg0, int arg1) {
        return method1223(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "()V", line = 315)
    public static final void method1201() {
        try {
            field2659.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(FFF)V", line = 322)
    public static final void method1202(float arg0, float arg1, float arg2) {
        field2654.glMatrixMode(5890);
        if (field2649) {
            field2654.glLoadIdentity();
        }
        field2654.glTranslatef(arg0, arg1, arg2);
        field2654.glMatrixMode(5888);
        field2649 = true;
    }

    @OriginalMember(owner = "client!in", name = "h", descriptor = "()V", line = 331)
    public static final void method1203() {
        field2654.glDepthMask(true);
    }

    @OriginalMember(owner = "client!in", name = "i", descriptor = "()V", line = 334)
    public static final void method1204() {
        class102.method830(0, 14804, 0);
        method1226();
        method1206(0);
        method1211(0);
        method1205(false);
        method1193(false);
        method1207(false);
        method1214();
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(Z)V", line = 344)
    public static final void method1205(boolean arg0) {
        if (field2628 == arg0) {
            return;
        }
        if (arg0) {
            field2654.glEnable(2896);
        } else {
            field2654.glDisable(2896);
        }
        field2628 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V", line = 355)
    public static final void method1206(int arg0) {
        if (field2637 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2654.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field2654.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field2654.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field2654.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field2654.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field2654.glTexEnvi(8960, 34161, 34165);
        }
        field2637 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(Z)V", line = 383)
    public static final void method1207(boolean arg0) {
        if (field2632 == arg0) {
            return;
        }
        if (arg0) {
            field2654.glEnable(2912);
        } else {
            field2654.glDisable(2912);
        }
        field2632 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "j", descriptor = "()F", line = 394)
    public static final float method1208() {
        return field2626;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIFFII)V", line = 398)
    public static final void method1209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field2654.glMatrixMode(5889);
        field2654.glLoadIdentity();
        method1188((float) var10 * field2638, (float) var11 * field2638, (float) (-var13) * field2638, (float) (-var12) * field2638, 50.0F, 3584.0F);
        method1194(arg0, field2618 - arg1 - arg3, arg2, arg3);
        field2654.glMatrixMode(5888);
        field2654.glLoadIdentity();
        field2654.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field2654.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field2654.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field2620 = false;
        class8.field198 = var10;
        class179.field2851 = var11;
        class149.field2428 = var12;
        class323.field5064 = var13;
    }

    @OriginalMember(owner = "client!in", name = "k", descriptor = "()V", line = 425)
    public static void method1210() {
        field2647 = null;
        field2636 = null;
        field2654 = null;
        field2659 = null;
        field2651 = null;
        field2622 = null;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V", line = 434)
    public static final void method1211(int arg0) {
        if (field2616 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2654.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field2654.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field2654.glTexEnvi(8960, 34162, 260);
        }
        field2616 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 454)
    public static final void method1212(Canvas arg0) {
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

    @OriginalMember(owner = "client!in", name = "l", descriptor = "()I", line = 476)
    public static final int method1213() {
        if (field2655 && (field2657 <= 0 || class177.field2819 != field2652)) {
            int[] var0 = new int[1];
            field2654.glGenFramebuffersEXT(1, var0, 0);
            field2652 = class177.field2819;
            field2657 = var0[0];
        }
        return field2657;
    }

    @OriginalMember(owner = "client!in", name = "m", descriptor = "()V", line = 501)
    public static final void method1214() {
        if (field2649) {
            field2654.glMatrixMode(5890);
            field2654.glLoadIdentity();
            field2654.glMatrixMode(5888);
            field2649 = false;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIII)V", line = 515)
    public static final void method1215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field2619 - arg0;
        int var8 = -arg1;
        int var9 = field2618 - arg1;
        field2654.glMatrixMode(5889);
        field2654.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field2654.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method1194(0, 0, field2619, field2618);
        field2654.glMatrixMode(5888);
        field2654.glLoadIdentity();
        field2654.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field2620 = false;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V", line = 538)
    public static final void method1216(int arg0, int arg1) {
        field2645 = arg0;
        field2646 = arg1;
        method1230();
    }

    @OriginalMember(owner = "client!in", name = "n", descriptor = "()V", line = 552)
    private static final void method1217() {
        int[] var0 = new int[1];
        field2654.glGenTextures(1, var0, 0);
        field2658 = var0[0];
        field2654.glBindTexture(3553, field2658);
        field2654.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class219.method1587();
        class39.method345(false);
        class54.method464();
    }

    @OriginalMember(owner = "client!in", name = "o", descriptor = "()V", line = 562)
    public static final void method1218() {
        class102.method830(0, 14804, 0);
        method1226();
        method1219(-1);
        method1205(false);
        method1193(false);
        method1207(false);
        method1214();
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V", line = 576)
    public static final void method1219(int arg0) {
        if (field2631 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field2654.glDisable(3553);
        } else {
            if (field2631 == -1) {
                field2654.glEnable(3553);
            }
            field2654.glBindTexture(3553, arg0);
        }
        field2631 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V", line = 593)
    public static final void method1220(int arg0, int arg1) {
        field2619 = arg0;
        field2618 = arg1;
        field2620 = false;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(IIII)V", line = 598)
    public static final void method1221(int arg0, int arg1, int arg2, int arg3) {
        field2654.glMatrixMode(5889);
        field2654.glLoadIdentity();
        field2654.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field2654.glMatrixMode(5888);
        field2654.glLoadIdentity();
        method1194(field2645, field2646, field2619, field2618);
        field2620 = false;
    }

    @OriginalMember(owner = "client!in", name = "p", descriptor = "()V", line = 612)
    public static final void method1222() {
        if (field2654 != null) {
            try {
                class54.method461();
                class284.method1987((byte) 126);
            } catch (Throwable var7) {
            }
            field2654 = null;
        }
        if (field2651 != null) {
            class177.method1305();
            try {
                if (GLContext.getCurrent() == field2651) {
                    field2651.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field2651.destroy();
            } catch (Throwable var5) {
            }
            field2651 = null;
        }
        if (field2659 != null) {
            try {
                field2659.setRealized(false);
            } catch (Throwable var4) {
            }
            field2659 = null;
        }
        class219.method1595();
        field2623 = false;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 664)
    private static final int method1223(Canvas arg0, int arg1, GLContext arg2) {
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
            field2659 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field2659.setRealized(true);
            int var5 = 0;
            while (true) {
                field2651 = field2659.createContext(arg2);
                try {
                    int var6 = field2651.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class245.method1729(125, 1000L);
            }
            field2654 = field2651.getGL();
            new GLU();
            field2623 = true;
            field2619 = arg0.getSize().width;
            field2618 = arg0.getSize().height;
            int var8 = method1192();
            if (var8 != 0) {
                method1222();
                return var8;
            }
            method1217();
            method1189();
            field2654.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field2659.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method1222();
                        return -3;
                    }
                    class245.method1729(126, 100L);
                }
            }
            field2654.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method1222();
            return -5;
        }
    }

    @OriginalMember(owner = "client!in", name = "q", descriptor = "()V", line = 757)
    public static final void method1224() {
        class102.method830(0, 14804, 0);
        method1226();
        method1206(0);
        method1211(0);
        method1205(false);
        method1193(false);
        method1207(false);
        method1214();
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V", line = 771)
    public static final void method1225(int arg0) {
        field2654.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2654.glClear(16384);
        field2654.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!in", name = "r", descriptor = "()V", line = 780)
    private static final void method1226() {
        if (field2620) {
            return;
        }
        field2654.glMatrixMode(5889);
        field2654.glLoadIdentity();
        field2654.glOrtho(0.0D, (double) field2619, 0.0D, (double) field2618, -1.0D, 1.0D);
        method1194(0, 0, field2619, field2618);
        field2654.glMatrixMode(5888);
        field2654.glLoadIdentity();
        field2620 = true;
    }

    @OriginalMember(owner = "client!in", name = "s", descriptor = "()V", line = 792)
    public static final void method1227() {
        field2654.glClear(256);
    }

    @OriginalMember(owner = "client!in", name = "t", descriptor = "()V", line = 796)
    public static final void method1228() {
        int[] var0 = new int[2];
        field2654.glGetIntegerv(3073, var0, 0);
        field2654.glGetIntegerv(3074, var0, 1);
        field2654.glDrawBuffer(1026);
        field2654.glReadBuffer(1024);
        method1219(-1);
        field2654.glPushAttrib(8192);
        field2654.glDisable(2912);
        field2654.glDisable(3042);
        field2654.glDisable(2929);
        field2654.glDisable(3008);
        field2654.glRasterPos2i(0, 0);
        field2654.glCopyPixels(0, 0, field2619, field2618, 6144);
        field2654.glPopAttrib();
        field2654.glDrawBuffer(var0[0]);
        field2654.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(IIII)V", line = 814)
    public static final void method1229(int arg0, int arg1, int arg2, int arg3) {
        method1209(0, 0, field2619, field2618, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!in", name = "u", descriptor = "()V", line = 836)
    private static final void method1230() {
        field2654.glViewport(field2645 + field2621, field2650 + field2646, field2660, field2633);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(FF)V", line = 846)
    public static final void method1231(float arg0, float arg1) {
        if (field2620 || field2630 == arg0 && field2626 == arg1) {
            return;
        }
        field2630 = arg0;
        field2626 = arg1;
        if (arg1 == 0.0F) {
            field2622[10] = field2653;
            field2622[14] = field2625;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field2625 * (1.0F - var2) / arg1;
            field2622[10] = field2653 + var4;
            field2622[14] = field2625 * var3;
        }
        field2654.glMatrixMode(5889);
        field2654.glLoadMatrixf(field2622, 0);
        field2654.glMatrixMode(5888);
    }
}
