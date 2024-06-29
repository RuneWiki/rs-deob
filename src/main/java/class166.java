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

@OriginalClass("client!om")
public class class166 {

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Z")
    public static boolean field2625 = false;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field2630 = 0;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "F")
    private static float field2631 = 0.09765625F;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    private static int field2627 = 0;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "Z")
    private static boolean field2632 = true;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "Z")
    private static boolean field2645 = true;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "F")
    private static float field2646 = 0.0F;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "Z")
    private static boolean field2638 = false;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    private static int field2640 = -1;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    private static int field2624 = 0;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "F")
    private static float field2618 = 0.0F;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "Z")
    private static boolean field2634 = false;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "[F")
    private static float[] field2649 = new float[16];

    @OriginalMember(owner = "client!om", name = "J", descriptor = "Z")
    public static boolean field2652 = true;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "Lok;")
    private static class41 field2653 = class137.method956("radeon", 45);

    @OriginalMember(owner = "client!om", name = "A", descriptor = "Z")
    private static boolean field2643 = true;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "F")
    private static float field2628;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "F")
    private static float field2639;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    private static int field2620;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    private static int field2636;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    private static int field2650;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "Ljava/lang/String;")
    private static String field2637;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "Ljava/lang/String;")
    private static String field2644;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field2648;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field2633;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field2629;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Z")
    public static boolean field2619;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "Z")
    public static boolean field2622;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "Z")
    public static boolean field2623;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "Z")
    public static boolean field2635;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "Z")
    public static boolean field2641;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "Z")
    public static boolean field2642;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "Z")
    public static boolean field2647;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()V", line = 13)
    public static final void method1158() {
        class274.method1934(0, 0, (byte) -124);
        method1191();
        method1160(0);
        method1177(0);
        method1190(false);
        method1174(false);
        method1169(false);
        method1173();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V", line = 23)
    public static final void method1159(int arg0, int arg1) {
        field2626 = arg0;
        field2651 = arg1;
        field2634 = false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 32)
    public static final void method1160(int arg0) {
        if (field2624 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2648.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field2648.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field2648.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field2648.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field2648.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field2648.glTexEnvi(8960, 34161, 34165);
        }
        field2624 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 58)
    public static final void method1161(Canvas arg0) {
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

    @OriginalMember(owner = "client!om", name = "b", descriptor = "()V", line = 84)
    private static final void method1162() {
        int[] var0 = new int[1];
        field2648.glGenTextures(1, var0, 0);
        field2621 = var0[0];
        field2648.glBindTexture(3553, field2621);
        field2648.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class68.method498((byte) -15);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 92)
    private static final void method1163(boolean arg0) {
        if (field2652 == arg0) {
            return;
        }
        if (arg0) {
            field2648.glEnableClientState(32885);
        } else {
            field2648.glDisableClientState(32885);
        }
        field2652 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(F)V", line = 103)
    public static final void method1164(float arg0) {
        method1175(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "()F", line = 106)
    public static final float method1165() {
        return field2618;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIIFFII)V", line = 111)
    public static final void method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field2648.glMatrixMode(5889);
        field2648.glLoadIdentity();
        method1179((float) var10 * field2631, (float) var11 * field2631, (float) (-var13) * field2631, (float) (-var12) * field2631, 50.0F, 3584.0F);
        field2648.glViewport(arg0, field2651 - arg1 - arg3, arg2, arg3);
        field2648.glMatrixMode(5888);
        field2648.glLoadIdentity();
        field2648.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field2648.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field2648.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field2634 = false;
        class174.field2826 = var10;
        class22.field327 = var11;
        class302.field5003 = var12;
        class50.field760 = var13;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V", line = 138)
    public static final void method1167(int arg0, int arg1, int arg2, int arg3) {
        method1166(0, 0, field2626, field2651, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 142)
    public static final void method1168(int arg0) {
        field2648.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2648.glClear(16640);
        field2648.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)V", line = 152)
    public static final void method1169(boolean arg0) {
        if (field2645 == arg0) {
            return;
        }
        if (arg0) {
            field2648.glEnable(2912);
        } else {
            field2648.glDisable(2912);
        }
        field2645 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "()V", line = 168)
    public static void method1170() {
        field2653 = null;
        field2637 = null;
        field2644 = null;
        field2648 = null;
        field2629 = null;
        field2633 = null;
        field2649 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;)Lok;", line = 179)
    private static final class41 method1171(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class213.method1507(var1.length, 0, false, var1);
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "()V", line = 189)
    public static final void method1172() {
        field2648.glDepthMask(true);
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "()V", line = 193)
    public static final void method1173() {
        if (field2638) {
            field2648.glMatrixMode(5890);
            field2648.glLoadIdentity();
            field2648.glMatrixMode(5888);
            field2638 = false;
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(Z)V", line = 204)
    public static final void method1174(boolean arg0) {
        if (field2632 == arg0) {
            return;
        }
        if (arg0) {
            field2648.glEnable(2929);
        } else {
            field2648.glDisable(2929);
        }
        field2632 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(FF)V", line = 218)
    public static final void method1175(float arg0, float arg1) {
        if (field2634 || field2618 == arg0 && field2646 == arg1) {
            return;
        }
        field2618 = arg0;
        field2646 = arg1;
        if (arg1 == 0.0F) {
            field2649[10] = field2639;
            field2649[14] = field2628;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field2628 * (1.0F - var2) / arg1;
            field2649[10] = field2639 + var4;
            field2649[14] = field2628 * var3;
        }
        field2648.glMatrixMode(5889);
        field2648.glLoadMatrixf(field2649, 0);
        field2648.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "()V", line = 252)
    public static final void method1176() {
        class274.method1934(0, 0, (byte) 35);
        method1191();
        method1160(0);
        method1177(0);
        method1190(false);
        method1174(false);
        method1169(false);
        method1173();
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V", line = 264)
    public static final void method1177(int arg0) {
        if (field2627 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2648.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field2648.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field2648.glTexEnvi(8960, 34162, 260);
        }
        field2627 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "()V", line = 282)
    private static final void method1178() {
        field2634 = false;
        field2648.glDisable(3553);
        field2640 = -1;
        field2648.glTexEnvi(8960, 8704, 34160);
        field2648.glTexEnvi(8960, 34161, 8448);
        field2624 = 0;
        field2648.glTexEnvi(8960, 34162, 8448);
        field2627 = 0;
        field2648.glEnable(2896);
        field2648.glEnable(2912);
        field2648.glEnable(2929);
        field2643 = true;
        field2632 = true;
        field2645 = true;
        class60.method426(4);
        field2648.glActiveTexture(33985);
        field2648.glTexEnvi(8960, 8704, 34160);
        field2648.glTexEnvi(8960, 34161, 8448);
        field2648.glTexEnvi(8960, 34162, 8448);
        field2648.glActiveTexture(33984);
        field2648.setSwapInterval(0);
        field2648.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field2648.glShadeModel(7425);
        field2648.glClearDepth(1.0D);
        field2648.glDepthFunc(515);
        method1172();
        field2648.glMatrixMode(5890);
        field2648.glLoadIdentity();
        field2648.glPolygonMode(1028, 6914);
        field2648.glEnable(2884);
        field2648.glCullFace(1029);
        field2648.glEnable(3042);
        field2648.glBlendFunc(770, 771);
        field2648.glEnable(3008);
        field2648.glAlphaFunc(516, 0.0F);
        field2648.glEnableClientState(32884);
        field2648.glEnableClientState(32885);
        field2652 = true;
        field2648.glEnableClientState(32886);
        field2648.glEnableClientState(32888);
        field2648.glMatrixMode(5888);
        field2648.glLoadIdentity();
        class58.method404();
        class179.method1284();
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(FFFFFF)V", line = 330)
    private static final void method1179(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field2649[0] = var6 / (arg1 - arg0);
        field2649[1] = 0.0F;
        field2649[2] = 0.0F;
        field2649[3] = 0.0F;
        field2649[4] = 0.0F;
        field2649[5] = var6 / (arg3 - arg2);
        field2649[6] = 0.0F;
        field2649[7] = 0.0F;
        field2649[8] = (arg0 + arg1) / (arg1 - arg0);
        field2649[9] = (arg2 + arg3) / (arg3 - arg2);
        field2649[10] = field2639 = -(arg4 + arg5) / (arg5 - arg4);
        field2649[11] = -1.0F;
        field2649[12] = 0.0F;
        field2649[13] = 0.0F;
        field2649[14] = field2628 = -(arg5 * var6) / (arg5 - arg4);
        field2649[15] = 0.0F;
        field2648.glLoadMatrixf(field2649, 0);
        field2618 = 0.0F;
        field2646 = 0.0F;
    }

    @OriginalMember(owner = "client!om", name = "i", descriptor = "()V", line = 352)
    public static final void method1180() {
        if (field2648 != null) {
            try {
                class196.method1401(75);
            } catch (Throwable var7) {
            }
            field2648 = null;
        }
        if (field2633 != null) {
            class103.method712();
            try {
                if (GLContext.getCurrent() == field2633) {
                    field2633.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field2633.destroy();
            } catch (Throwable var5) {
            }
            field2633 = null;
        }
        if (field2629 != null) {
            try {
                field2629.setRealized(false);
            } catch (Throwable var4) {
            }
            field2629 = null;
        }
        class179.method1281();
        field2625 = false;
    }

    @OriginalMember(owner = "client!om", name = "j", descriptor = "()V", line = 403)
    public static final void method1181() {
        try {
            field2629.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V", line = 411)
    public static final void method1182(int arg0) {
        if (field2640 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field2648.glDisable(3553);
        } else {
            if (field2640 == -1) {
                field2648.glEnable(3553);
            }
            field2648.glBindTexture(3553, arg0);
        }
        field2640 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "k", descriptor = "()V", line = 436)
    public static final void method1183() {
        int[] var0 = new int[2];
        field2648.glGetIntegerv(3073, var0, 0);
        field2648.glGetIntegerv(3074, var0, 1);
        field2648.glDrawBuffer(1026);
        field2648.glReadBuffer(1024);
        method1182(-1);
        field2648.glPushAttrib(8192);
        field2648.glDisable(2912);
        field2648.glDisable(3042);
        field2648.glDisable(2929);
        field2648.glDisable(3008);
        field2648.glRasterPos2i(0, 0);
        field2648.glCopyPixels(0, 0, field2626, field2651, 6144);
        field2648.glPopAttrib();
        field2648.glDrawBuffer(var0[0]);
        field2648.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!om", name = "l", descriptor = "()V", line = 454)
    public static final void method1184() {
        field2648.glDepthMask(false);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(FFF)V", line = 457)
    public static final void method1185(float arg0, float arg1, float arg2) {
        field2648.glMatrixMode(5890);
        if (field2638) {
            field2648.glLoadIdentity();
        }
        field2648.glTranslatef(arg0, arg1, arg2);
        field2648.glMatrixMode(5888);
        field2638 = true;
    }

    @OriginalMember(owner = "client!om", name = "m", descriptor = "()V", line = 471)
    public static final void method1186() {
        class274.method1934(0, 0, (byte) 127);
        method1191();
        method1182(-1);
        method1190(false);
        method1174(false);
        method1169(false);
        method1173();
    }

    @OriginalMember(owner = "client!om", name = "n", descriptor = "()F", line = 484)
    public static final float method1187() {
        return field2646;
    }

    @OriginalMember(owner = "client!om", name = "o", descriptor = "()V", line = 490)
    public static final void method1188() {
        field2648.glClear(256);
    }

    @OriginalMember(owner = "client!om", name = "p", descriptor = "()V", line = 498)
    public static final void method1189() {
        class274.method1934(0, 0, (byte) -113);
        method1191();
        method1160(1);
        method1177(1);
        method1190(false);
        method1174(false);
        method1169(false);
        method1173();
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(Z)V", line = 521)
    public static final void method1190(boolean arg0) {
        if (field2643 == arg0) {
            return;
        }
        if (arg0) {
            field2648.glEnable(2896);
        } else {
            field2648.glDisable(2896);
        }
        field2643 = arg0;
    }

    @OriginalMember(owner = "client!om", name = "q", descriptor = "()V", line = 537)
    private static final void method1191() {
        if (field2634) {
            return;
        }
        field2648.glMatrixMode(5889);
        field2648.glLoadIdentity();
        field2648.glOrtho(0.0D, (double) field2626, 0.0D, (double) field2651, -1.0D, 1.0D);
        field2648.glViewport(0, 0, field2626, field2651);
        field2648.glMatrixMode(5888);
        field2648.glLoadIdentity();
        field2634 = true;
    }

    @OriginalMember(owner = "client!om", name = "r", descriptor = "()I", line = 553)
    private static final int method1192() {
        int var0 = 0;
        field2644 = field2648.glGetString(7936);
        field2637 = field2648.glGetString(7937);
        String var1 = field2644.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field2648.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field2650 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field2650 < 12) {
            var0 |= 0x2;
        }
        if (!field2648.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field2648.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field2648.glGetIntegerv(34018, var7, 0);
        field2617 = var7[0];
        field2648.glGetIntegerv(34929, var7, 0);
        field2620 = var7[0];
        field2648.glGetIntegerv(34930, var7, 0);
        field2636 = var7[0];
        if (field2617 < 2 || field2620 < 2 || field2636 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field2642 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field2622 = field2648.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field2647 = field2648.isExtensionAvailable("GL_ARB_multisample");
        field2641 = field2648.isExtensionAvailable("GL_ARB_texture_cube_map");
        field2619 = field2648.isExtensionAvailable("GL_ARB_vertex_program");
        field2623 = field2648.isExtensionAvailable("GL_EXT_texture3D");
        class41 var8 = method1171(field2637).method294(1);
        if (var8.method305(-112, field2653) != -1) {
            int var9 = 0;
            class41[] var10 = var8.method272(32, -16387, 47).method289(-3607, 32);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class41 var12 = var10[var11];
                if (var12.method275(false) >= 4 && var12.method308(4, 0, 80).method276(true)) {
                    var9 = var12.method308(4, 0, 80).method301((byte) -103);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field2622 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field2623 = false;
            }
            field2635 = field2622;
        }
        if (field2622) {
            try {
                int[] var13 = new int[1];
                field2648.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 668)
    public static final int method1193(Canvas arg0, int arg1) {
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
            field2629 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field2629.setRealized(true);
            int var4 = 0;
            while (true) {
                field2633 = field2629.createContext((GLContext) null);
                try {
                    int var5 = field2633.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class300.method2068(124, 1000L);
            }
            field2648 = field2633.getGL();
            new GLU();
            field2625 = true;
            field2626 = arg0.getSize().width;
            field2651 = arg0.getSize().height;
            int var7 = method1192();
            if (var7 != 0) {
                method1180();
                return var7;
            }
            method1162();
            method1178();
            field2648.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field2629.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1180();
                        return -3;
                    }
                    class300.method2068(126, 100L);
                }
            }
            field2648.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1180();
            return -5;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIII)V", line = 755)
    public static final void method1194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field2626 - arg0;
        int var8 = -arg1;
        int var9 = field2651 - arg1;
        field2648.glMatrixMode(5889);
        field2648.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field2648.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field2648.glViewport(0, 0, field2626, field2651);
        field2648.glMatrixMode(5888);
        field2648.glLoadIdentity();
        field2648.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field2634 = false;
    }

    @OriginalMember(owner = "client!om", name = "s", descriptor = "()V", line = 782)
    public static final void method1195() {
        if (class66.field1006) {
            method1190(true);
            method1163(true);
        } else {
            method1190(false);
            method1163(false);
        }
    }
}
