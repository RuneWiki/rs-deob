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

@OriginalClass("client!vf")
public class class42 {

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "F")
    private static float field610 = 0.09765625F;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Z")
    private static boolean field612 = true;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field609 = 0;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "[F")
    private static float[] field618 = new float[16];

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Z")
    public static boolean field607 = false;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Z")
    public static boolean field620 = true;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "F")
    private static float field614 = 0.0F;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    private static int field611 = -1;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Z")
    private static boolean field615 = false;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    private static int field634 = 0;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    private static int field636 = 0;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    private static int field643 = -1;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "F")
    private static float field630 = 0.0F;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "Z")
    private static boolean field640 = true;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    private static int field642 = -1;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Z")
    private static boolean field613 = true;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "Z")
    private static boolean field650 = false;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "F")
    private static float field628;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "F")
    private static float field635;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    private static int field605;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    private static int field631;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    private static int field632;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    private static int field637;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    private static int field639;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "I")
    private static int field644;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    private static int field649;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Ljava/lang/String;")
    private static String field623;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Ljava/lang/String;")
    private static String field626;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field627;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field629;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field646;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Z")
    public static boolean field604;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Z")
    public static boolean field606;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Z")
    public static boolean field608;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Z")
    public static boolean field617;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Z")
    public static boolean field619;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Z")
    public static boolean field621;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Z")
    public static boolean field624;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Z")
    public static boolean field625;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Z")
    public static boolean field633;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "Z")
    public static boolean field638;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "Z")
    public static boolean field645;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "Z")
    public static boolean field647;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFFFFF)V", line = 18)
    private static final void method269(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field618[0] = var6 / (arg1 - arg0);
        field618[1] = 0.0F;
        field618[2] = 0.0F;
        field618[3] = 0.0F;
        field618[4] = 0.0F;
        field618[5] = var6 / (arg3 - arg2);
        field618[6] = 0.0F;
        field618[7] = 0.0F;
        field618[8] = (arg0 + arg1) / (arg1 - arg0);
        field618[9] = (arg2 + arg3) / (arg3 - arg2);
        field618[10] = field628 = -(arg4 + arg5) / (arg5 - arg4);
        field618[11] = -1.0F;
        field618[12] = 0.0F;
        field618[13] = 0.0F;
        field618[14] = field635 = -(arg5 * var6) / (arg5 - arg4);
        field618[15] = 0.0F;
        field627.glLoadMatrixf(field618, 0);
        field630 = 0.0F;
        field614 = 0.0F;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()V", line = 40)
    public static void method270() {
        field626 = null;
        field623 = null;
        field627 = null;
        field646 = null;
        field629 = null;
        field618 = null;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()I", line = 51)
    public static final int method271() {
        if (field606 && (field643 <= 0 || field642 != class199.field3172)) {
            int[] var0 = new int[1];
            field627.glGenFramebuffersEXT(1, var0, 0);
            field642 = class199.field3172;
            field643 = var0[0];
        }
        return field643;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "()V", line = 64)
    private static final void method272() {
        field627.glViewport(field648 + field639, field644 + field602, field637, field605);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 67)
    public static final void method273(int arg0) {
        if (field611 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field627.glDisable(3553);
        } else {
            if (field611 == -1) {
                field627.glEnable(3553);
            }
            field627.glBindTexture(3553, arg0);
        }
        field611 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 86)
    public static final void method274(int arg0) {
        field627.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field627.glClear(16640);
        field627.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 91)
    public static final void method275(int arg0) {
        if (field634 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field627.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field627.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field627.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field627.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field627.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field627.glTexEnvi(8960, 34161, 34165);
        }
        field634 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "()V", line = 119)
    public static final void method276() {
        class310.method2203(0, 0, 127);
        method281();
        method275(0);
        method277(0);
        method283(false);
        method278(false);
        method286(false);
        method299();
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V", line = 130)
    public static final void method277(int arg0) {
        if (field636 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field627.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field627.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field627.glTexEnvi(8960, 34162, 260);
        }
        field636 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 147)
    public static final void method278(boolean arg0) {
        if (field613 == arg0) {
            return;
        }
        if (arg0) {
            field627.glEnable(2929);
        } else {
            field627.glDisable(2929);
        }
        field613 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "()V", line = 162)
    public static final void method279() {
        field627.glDepthMask(false);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V", line = 165)
    private static final void method280(boolean arg0) {
        if (field620 == arg0) {
            return;
        }
        if (arg0) {
            field627.glEnableClientState(32885);
        } else {
            field627.glDisableClientState(32885);
        }
        field620 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "()V", line = 178)
    private static final void method281() {
        if (field650) {
            return;
        }
        field627.glMatrixMode(5889);
        field627.glLoadIdentity();
        field627.glOrtho(0.0D, (double) field616, 0.0D, (double) field622, -1.0D, 1.0D);
        method285(0, 0, field616, field622);
        field627.glMatrixMode(5888);
        field627.glLoadIdentity();
        field650 = true;
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "()V", line = 191)
    public static final void method282() {
        field627.glDepthMask(true);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(Z)V", line = 200)
    public static final void method283(boolean arg0) {
        if (field640 == arg0) {
            return;
        }
        if (arg0) {
            field627.glEnable(2896);
        } else {
            field627.glDisable(2896);
        }
        field640 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 212)
    private static final int method284(Canvas arg0, int arg1, GLContext arg2) {
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
            field646 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field646.setRealized(true);
            int var5 = 0;
            while (true) {
                field629 = field646.createContext(arg2);
                try {
                    int var6 = field629.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class283.method2076((byte) 9, 1000L);
            }
            field627 = field629.getGL();
            field607 = true;
            field616 = arg0.getSize().width;
            field622 = arg0.getSize().height;
            int var8 = method294();
            if (var8 != 0) {
                method310();
                return var8;
            }
            method309();
            method293();
            field627.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field646.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method310();
                        return -3;
                    }
                    class283.method2076((byte) 82, 100L);
                }
            }
            field627.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method310();
            return -5;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)V", line = 300)
    private static final void method285(int arg0, int arg1, int arg2, int arg3) {
        field639 = arg0;
        field644 = arg1;
        field637 = arg2;
        field605 = arg3;
        method272();
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(Z)V", line = 319)
    public static final void method286(boolean arg0) {
        if (field612 == arg0) {
            return;
        }
        if (arg0) {
            field627.glEnable(2912);
        } else {
            field627.glDisable(2912);
        }
        field612 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "()V", line = 330)
    public static final void method287() {
        if (class3.field36) {
            method283(true);
            method280(true);
        } else {
            method283(false);
            method280(false);
        }
    }

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "()V", line = 352)
    public static final void method288() {
        class310.method2203(0, 0, 67);
        method281();
        method275(0);
        method277(0);
        method283(false);
        method278(false);
        method286(false);
        method299();
    }

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "()V", line = 363)
    public static final void method289() {
        class310.method2203(0, 0, -124);
        method281();
        method273(-1);
        method283(false);
        method278(false);
        method286(false);
        method299();
    }

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "()F", line = 372)
    public static final float method290() {
        return field614;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V", line = 381)
    public static final void method291(int arg0, int arg1) {
        field616 = arg0;
        field622 = arg1;
        field650 = false;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 386)
    public static final int method292(Canvas arg0, int arg1) {
        return method284(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "()V", line = 391)
    private static final void method293() {
        field650 = false;
        field627.glDisable(3553);
        field611 = -1;
        field627.glTexEnvi(8960, 8704, 34160);
        field627.glTexEnvi(8960, 34161, 8448);
        field634 = 0;
        field627.glTexEnvi(8960, 34162, 8448);
        field636 = 0;
        field627.glEnable(2896);
        field627.glEnable(2912);
        field627.glEnable(2929);
        field640 = true;
        field613 = true;
        field612 = true;
        class223.method1694((byte) -125);
        field627.glActiveTexture(33985);
        field627.glTexEnvi(8960, 8704, 34160);
        field627.glTexEnvi(8960, 34161, 8448);
        field627.glTexEnvi(8960, 34162, 8448);
        field627.glActiveTexture(33984);
        field627.setSwapInterval(0);
        field627.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field627.glShadeModel(7425);
        field627.glClearDepth(1.0F);
        field627.glDepthFunc(515);
        method282();
        field627.glMatrixMode(5890);
        field627.glLoadIdentity();
        field627.glPolygonMode(1028, 6914);
        field627.glEnable(2884);
        field627.glCullFace(1029);
        field627.glEnable(3042);
        field627.glBlendFunc(770, 771);
        field627.glEnable(3008);
        field627.glAlphaFunc(516, 0.0F);
        field627.glEnableClientState(32884);
        field627.glEnableClientState(32885);
        field620 = true;
        field627.glEnableClientState(32886);
        field627.glEnableClientState(32888);
        field627.glMatrixMode(5888);
        field627.glLoadIdentity();
        class167.method1295();
        class30.method197();
    }

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "()I", line = 441)
    private static final int method294() {
        int var0 = 0;
        field623 = field627.glGetString(7936);
        field626 = field627.glGetString(7937);
        String var1 = field623.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field627.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field649 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field649 < 12) {
            var0 |= 0x2;
        }
        if (!field627.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field627.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field627.glGetIntegerv(34018, var7, 0);
        field603 = var7[0];
        field627.glGetIntegerv(34929, var7, 0);
        field631 = var7[0];
        field627.glGetIntegerv(34930, var7, 0);
        field632 = var7[0];
        if (field603 < 2 || field631 < 2 || field632 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field625 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field645 = field627.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field604 = field627.isExtensionAvailable("GL_ARB_multisample");
        field621 = field627.isExtensionAvailable("GL_ARB_texture_cube_map");
        field647 = field627.isExtensionAvailable("GL_ARB_vertex_program");
        field606 = field627.isExtensionAvailable("GL_EXT_framebuffer_object");
        field627.isExtensionAvailable("GL_ARB_vertex_shader");
        field633 = field627.isExtensionAvailable("GL_ARB_fragment_shader");
        field617 = field627.isExtensionAvailable("GL_EXT_texture3D");
        field619 = field627.isExtensionAvailable("GL_ARB_texture_rectangle");
        field608 = field627.isExtensionAvailable("GL_ARB_texture_float");
        field638 = true;
        String var8 = field626.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class293.method2114(-94, var8.replace('/', ' '), ' ');
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class216.method1630(false, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class216.method1630(false, var13.substring(0, 4))) {
                        var9 = class130.method996(var13.substring(0, 4), 30958);
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field645 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field617 = false;
            }
            if (var9 >= 9200 || var10) {
                field608 = false;
            }
            field624 = field645;
            field638 = false;
        }
        if (field645) {
            try {
                int[] var14 = new int[1];
                field627.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIFFII)V", line = 572)
    public static final void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field627.glMatrixMode(5889);
        field627.glLoadIdentity();
        method269((float) var10 * field610, (float) var11 * field610, (float) (-var13) * field610, (float) (-var12) * field610, 50.0F, 3584.0F);
        method285(arg0, field622 - arg1 - arg3, arg2, arg3);
        field627.glMatrixMode(5888);
        field627.glLoadIdentity();
        field627.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field627.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field627.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field650 = false;
        class45.field702 = var10;
        class338.field5393 = var11;
        class241.field3987 = var12;
        class338.field5385 = var13;
    }

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "()V", line = 603)
    public static final void method296() {
        try {
            field646.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "()V", line = 616)
    public static final void method297() {
        int[] var0 = new int[2];
        field627.glGetIntegerv(3073, var0, 0);
        field627.glGetIntegerv(3074, var0, 1);
        field627.glDrawBuffer(1026);
        field627.glReadBuffer(1024);
        method273(-1);
        field627.glPushAttrib(8192);
        field627.glDisable(2912);
        field627.glDisable(3042);
        field627.glDisable(2929);
        field627.glDisable(3008);
        field627.glRasterPos2i(0, 0);
        field627.glCopyPixels(0, 0, field616, field622, 6144);
        field627.glPopAttrib();
        field627.glDrawBuffer(var0[0]);
        field627.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(F)V", line = 636)
    public static final void method298(float arg0) {
        method300(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "()V", line = 642)
    public static final void method299() {
        if (field615) {
            field627.glMatrixMode(5890);
            field627.glLoadIdentity();
            field627.glMatrixMode(5888);
            field615 = false;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FF)V", line = 652)
    public static final void method300(float arg0, float arg1) {
        if (field650 || field630 == arg0 && field614 == arg1) {
            return;
        }
        field630 = arg0;
        field614 = arg1;
        if (arg1 == 0.0F) {
            field618[10] = field628;
            field618[14] = field635;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field635 * (1.0F - var2) / arg1;
            field618[10] = field628 + var4;
            field618[14] = field635 * var3;
        }
        field627.glMatrixMode(5889);
        field627.glLoadMatrixf(field618, 0);
        field627.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIII)V", line = 683)
    public static final void method301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field616 - arg0;
        int var8 = -arg1;
        int var9 = field622 - arg1;
        field627.glMatrixMode(5889);
        field627.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field627.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method285(0, 0, field616, field622);
        field627.glMatrixMode(5888);
        field627.glLoadIdentity();
        field627.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field650 = false;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IIII)V", line = 707)
    public static final void method302(int arg0, int arg1, int arg2, int arg3) {
        method295(0, 0, field616, field622, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "()F", line = 714)
    public static final float method303() {
        return field630;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(FFF)V", line = 717)
    public static final void method304(float arg0, float arg1, float arg2) {
        field627.glMatrixMode(5890);
        if (field615) {
            field627.glLoadIdentity();
        }
        field627.glTranslatef(arg0, arg1, arg2);
        field627.glMatrixMode(5888);
        field615 = true;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V", line = 728)
    public static final void method305(int arg0, int arg1) {
        field648 = arg0;
        field602 = arg1;
        method272();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 734)
    public static final void method306(Canvas arg0) {
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

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "()V", line = 755)
    public static final void method307() {
        class310.method2203(0, 0, 113);
        method281();
        method275(1);
        method277(1);
        method283(false);
        method278(false);
        method286(false);
        method299();
    }

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "()V", line = 766)
    public static final void method308() {
        field627.glClear(256);
    }

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "()V", line = 775)
    private static final void method309() {
        int[] var0 = new int[1];
        field627.glGenTextures(1, var0, 0);
        field641 = var0[0];
        field627.glBindTexture(3553, field641);
        field627.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class30.method199();
        class130.method999(0);
        class68.method585();
    }

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "()V", line = 792)
    public static final void method310() {
        if (field627 != null) {
            try {
                class68.method583();
                class179.method1405(112);
            } catch (Throwable var7) {
            }
            field627 = null;
        }
        if (field629 != null) {
            class199.method1527();
            try {
                if (GLContext.getCurrent() == field629) {
                    field629.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field629.destroy();
            } catch (Throwable var5) {
            }
            field629 = null;
        }
        if (field646 != null) {
            try {
                field646.setRealized(false);
            } catch (Throwable var4) {
            }
            field646 = null;
        }
        class30.method213();
        field607 = false;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V", line = 839)
    public static final void method311(int arg0) {
        field627.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field627.glClear(16384);
        field627.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(IIII)V", line = 855)
    public static final void method312(int arg0, int arg1, int arg2, int arg3) {
        field627.glMatrixMode(5889);
        field627.glLoadIdentity();
        field627.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field627.glMatrixMode(5888);
        field627.glLoadIdentity();
        method285(field648, field602, field616, field622);
        field650 = false;
    }
}
