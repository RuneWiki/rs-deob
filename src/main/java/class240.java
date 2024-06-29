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

@OriginalClass("client!uk")
public class class240 {

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    private static int field3732 = 0;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Z")
    public static boolean field3737 = false;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Z")
    private static boolean field3738 = true;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    private static int field3723 = -1;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "[F")
    private static float[] field3726 = new float[16];

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    private static int field3742 = 0;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "F")
    private static float field3746 = 0.09765625F;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Z")
    private static boolean field3735 = false;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "F")
    private static float field3733 = 0.0F;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "Z")
    private static boolean field3754 = true;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    private static int field3763 = -1;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
    private static int field3756 = -1;

    @OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
    public static int field3748 = 0;

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "Z")
    private static boolean field3747 = false;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Z")
    public static boolean field3740 = true;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "F")
    private static float field3758 = 0.0F;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "Z")
    private static boolean field3766 = true;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "F")
    private static float field3768;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "F")
    private static float field3770;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    private static int field3734;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    private static int field3736;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    private static int field3743;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    private static int field3753;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "I")
    private static int field3759;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    private static int field3765;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
    private static int field3767;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Ljava/lang/String;")
    private static String field3727;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Ljava/lang/String;")
    private static String field3731;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field3771;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field3751;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field3760;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Z")
    public static boolean field3724;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Z")
    public static boolean field3729;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Z")
    public static boolean field3730;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "Z")
    public static boolean field3739;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "Z")
    public static boolean field3745;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "Z")
    public static boolean field3750;

    @OriginalMember(owner = "client!uk", name = "D", descriptor = "Z")
    public static boolean field3752;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "Z")
    public static boolean field3755;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "Z")
    public static boolean field3757;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "Z")
    public static boolean field3761;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "Z")
    public static boolean field3762;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "Z")
    public static boolean field3764;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(FFFFFF)V", line = 11)
    private static final void method1777(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field3726[0] = var6 / (arg1 - arg0);
        field3726[1] = 0.0F;
        field3726[2] = 0.0F;
        field3726[3] = 0.0F;
        field3726[4] = 0.0F;
        field3726[5] = var6 / (arg3 - arg2);
        field3726[6] = 0.0F;
        field3726[7] = 0.0F;
        field3726[8] = (arg0 + arg1) / (arg1 - arg0);
        field3726[9] = (arg2 + arg3) / (arg3 - arg2);
        field3726[10] = field3768 = -(arg4 + arg5) / (arg5 - arg4);
        field3726[11] = -1.0F;
        field3726[12] = 0.0F;
        field3726[13] = 0.0F;
        field3726[14] = field3770 = -(arg5 * var6) / (arg5 - arg4);
        field3726[15] = 0.0F;
        field3771.glLoadMatrixf(field3726, 0);
        field3733 = 0.0F;
        field3758 = 0.0F;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(FF)V", line = 35)
    public static final void method1778(float arg0, float arg1) {
        if (field3747 || field3733 == arg0 && field3758 == arg1) {
            return;
        }
        field3733 = arg0;
        field3758 = arg1;
        if (arg1 == 0.0F) {
            field3726[10] = field3768;
            field3726[14] = field3770;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field3770 * (1.0F - var2) / arg1;
            field3726[10] = field3768 + var4;
            field3726[14] = field3770 * var3;
        }
        field3771.glMatrixMode(5889);
        field3771.glLoadMatrixf(field3726, 0);
        field3771.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 67)
    public static final void method1779(Canvas arg0) {
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

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V", line = 88)
    public static final void method1780() {
        class211.method1562(0, 0, -112);
        method1818();
        method1814(1);
        method1806(1);
        method1801(false);
        method1807(false);
        method1815(false);
        method1805();
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()V", line = 98)
    public static final void method1781() {
        class211.method1562(0, 0, -74);
        method1818();
        method1814(0);
        method1806(0);
        method1801(false);
        method1807(false);
        method1815(false);
        method1805();
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()F", line = 110)
    public static final float method1782() {
        return field3733;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V", line = 113)
    private static final void method1783(boolean arg0) {
        if (field3740 == arg0) {
            return;
        }
        if (arg0) {
            field3771.glEnableClientState(32885);
        } else {
            field3771.glDisableClientState(32885);
        }
        field3740 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(F)V", line = 129)
    public static final void method1784(float arg0) {
        method1778(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V", line = 134)
    public static final void method1785(int arg0, int arg1, int arg2, int arg3) {
        method1792(0, 0, field3769, field3749, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 142)
    public static final void method1786(int arg0) {
        if (field3763 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field3771.glDisable(3553);
        } else {
            if (field3763 == -1) {
                field3771.glEnable(3553);
            }
            field3771.glBindTexture(3553, arg0);
        }
        field3763 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "()V", line = 162)
    public static final void method1787() {
        try {
            field3760.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "()V", line = 170)
    private static final void method1788() {
        int[] var0 = new int[1];
        field3771.glGenTextures(1, var0, 0);
        field3744 = var0[0];
        field3771.glBindTexture(3553, field3744);
        field3771.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class299.method2150();
        class100.method873(97);
        class357.method2508();
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIII)V", line = 181)
    public static final void method1789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field3769 - arg0;
        int var8 = -arg1;
        int var9 = field3749 - arg1;
        field3771.glMatrixMode(5889);
        field3771.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field3771.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method1795(0, 0, field3769, field3749);
        field3771.glMatrixMode(5888);
        field3771.glLoadIdentity();
        field3771.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field3747 = false;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V", line = 204)
    public static final void method1790(int arg0, int arg1) {
        field3769 = arg0;
        field3749 = arg1;
        field3747 = false;
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "()V", line = 210)
    public static final void method1791() {
        field3771.glDepthMask(false);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIFFII)V", line = 220)
    public static final void method1792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field3771.glMatrixMode(5889);
        field3771.glLoadIdentity();
        method1777((float) var10 * field3746, (float) var11 * field3746, (float) (-var13) * field3746, (float) (-var12) * field3746, 50.0F, 3584.0F);
        method1795(arg0, field3749 - arg1 - arg3, arg2, arg3);
        field3771.glMatrixMode(5888);
        field3771.glLoadIdentity();
        field3771.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field3771.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field3771.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field3747 = false;
        class66.field997 = var10;
        class173.field2752 = var11;
        class79.field1162 = var12;
        class171.field2695 = var13;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 250)
    public static final void method1793(int arg0) {
        field3771.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3771.glClear(16640);
        field3771.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "()V", line = 256)
    private static final void method1794() {
        field3747 = false;
        field3771.glDisable(3553);
        field3763 = -1;
        field3771.glTexEnvi(8960, 8704, 34160);
        field3771.glTexEnvi(8960, 34161, 8448);
        field3742 = 0;
        field3771.glTexEnvi(8960, 34162, 8448);
        field3732 = 0;
        field3771.glEnable(2896);
        field3771.glEnable(2912);
        field3771.glEnable(2929);
        field3754 = true;
        field3738 = true;
        field3766 = true;
        class114.method984(false);
        field3771.glActiveTexture(33985);
        field3771.glTexEnvi(8960, 8704, 34160);
        field3771.glTexEnvi(8960, 34161, 8448);
        field3771.glTexEnvi(8960, 34162, 8448);
        field3771.glActiveTexture(33984);
        field3771.setSwapInterval(0);
        field3771.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field3771.glShadeModel(7425);
        field3771.glClearDepth(1.0F);
        field3771.glDepthFunc(515);
        method1803();
        field3771.glMatrixMode(5890);
        field3771.glLoadIdentity();
        field3771.glPolygonMode(1028, 6914);
        field3771.glEnable(2884);
        field3771.glCullFace(1029);
        field3771.glEnable(3042);
        field3771.glBlendFunc(770, 771);
        field3771.glEnable(3008);
        field3771.glAlphaFunc(516, 0.0F);
        field3771.glEnableClientState(32884);
        field3771.glEnableClientState(32885);
        field3740 = true;
        field3771.glEnableClientState(32886);
        field3771.glEnableClientState(32888);
        field3771.glMatrixMode(5888);
        field3771.glLoadIdentity();
        class103.method888();
        class299.method2144();
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(IIII)V", line = 302)
    private static final void method1795(int arg0, int arg1, int arg2, int arg3) {
        field3753 = arg0;
        field3743 = arg1;
        field3734 = arg2;
        field3759 = arg3;
        method1809();
    }

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "()V", line = 309)
    public static final void method1796() {
        field3771.glClear(256);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V", line = 315)
    public static final void method1797(int arg0, int arg1) {
        field3725 = arg0;
        field3728 = arg1;
        method1809();
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 322)
    private static final int method1798(Canvas arg0, int arg1, GLContext arg2) {
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
            field3760 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field3760.setRealized(true);
            int var5 = 0;
            while (true) {
                field3751 = field3760.createContext(arg2);
                try {
                    int var6 = field3751.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class188.method1443(10, 1000L);
            }
            field3771 = field3751.getGL();
            field3737 = true;
            field3769 = arg0.getSize().width;
            field3749 = arg0.getSize().height;
            int var8 = method1819();
            if (var8 != 0) {
                method1802();
                return var8;
            }
            method1788();
            method1794();
            field3771.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field3760.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method1802();
                        return -3;
                    }
                    class188.method1443(10, 100L);
                }
            }
            field3771.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method1802();
            return -5;
        }
    }

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "()I", line = 414)
    public static final int method1799() {
        if (field3730 && (field3756 <= 0 || class28.field455 != field3723)) {
            int[] var0 = new int[1];
            field3771.glGenFramebuffersEXT(1, var0, 0);
            field3723 = class28.field455;
            field3756 = var0[0];
        }
        return field3756;
    }

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "()V", line = 434)
    public static final void method1800() {
        class211.method1562(0, 0, -47);
        method1818();
        method1786(-1);
        method1801(false);
        method1807(false);
        method1815(false);
        method1805();
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)V", line = 444)
    public static final void method1801(boolean arg0) {
        if (field3754 == arg0) {
            return;
        }
        if (arg0) {
            field3771.glEnable(2896);
        } else {
            field3771.glDisable(2896);
        }
        field3754 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "()V", line = 455)
    public static final void method1802() {
        if (field3771 != null) {
            try {
                class357.method2514();
                class43.method446((byte) 51);
            } catch (Throwable var7) {
            }
            field3771 = null;
        }
        if (field3751 != null) {
            class28.method325();
            try {
                if (GLContext.getCurrent() == field3751) {
                    field3751.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field3751.destroy();
            } catch (Throwable var5) {
            }
            field3751 = null;
        }
        if (field3760 != null) {
            try {
                field3760.setRealized(false);
            } catch (Throwable var4) {
            }
            field3760 = null;
        }
        class299.method2151();
        field3737 = false;
    }

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "()V", line = 504)
    public static final void method1803() {
        field3771.glDepthMask(true);
    }

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "()V", line = 508)
    public static void method1804() {
        field3731 = null;
        field3727 = null;
        field3771 = null;
        field3760 = null;
        field3751 = null;
        field3726 = null;
    }

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "()V", line = 516)
    public static final void method1805() {
        if (field3735) {
            field3771.glMatrixMode(5890);
            field3771.glLoadIdentity();
            field3771.glMatrixMode(5888);
            field3735 = false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V", line = 536)
    public static final void method1806(int arg0) {
        if (field3732 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3771.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field3771.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field3771.glTexEnvi(8960, 34162, 260);
        }
        field3732 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(Z)V", line = 564)
    public static final void method1807(boolean arg0) {
        if (field3738 == arg0) {
            return;
        }
        if (arg0) {
            field3771.glEnable(2929);
        } else {
            field3771.glDisable(2929);
        }
        field3738 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(IIII)V", line = 575)
    public static final void method1808(int arg0, int arg1, int arg2, int arg3) {
        field3771.glMatrixMode(5889);
        field3771.glLoadIdentity();
        field3771.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field3771.glMatrixMode(5888);
        field3771.glLoadIdentity();
        method1795(field3725, field3728, field3769, field3749);
        field3747 = false;
    }

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "()V", line = 586)
    private static final void method1809() {
        field3771.glViewport(field3753 + field3725, field3743 + field3728, field3734, field3759);
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(I)V", line = 591)
    public static final void method1810(int arg0) {
        field3771.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3771.glClear(16384);
        field3771.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(FFF)V", line = 600)
    public static final void method1811(float arg0, float arg1, float arg2) {
        field3771.glMatrixMode(5890);
        if (field3735) {
            field3771.glLoadIdentity();
        }
        field3771.glTranslatef(arg0, arg1, arg2);
        field3771.glMatrixMode(5888);
        field3735 = true;
    }

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "()V", line = 610)
    public static final void method1812() {
        if (class59.field927) {
            method1801(true);
            method1783(true);
        } else {
            method1801(false);
            method1783(false);
        }
    }

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "()V", line = 630)
    public static final void method1813() {
        class211.method1562(0, 0, -112);
        method1818();
        method1814(0);
        method1806(0);
        method1801(false);
        method1807(false);
        method1815(false);
        method1805();
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V", line = 643)
    public static final void method1814(int arg0) {
        if (field3742 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3771.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field3771.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field3771.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field3771.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field3771.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field3771.glTexEnvi(8960, 34161, 34165);
        }
        field3742 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "(Z)V", line = 668)
    public static final void method1815(boolean arg0) {
        if (field3766 == arg0) {
            return;
        }
        if (arg0) {
            field3771.glEnable(2912);
        } else {
            field3771.glDisable(2912);
        }
        field3766 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "()V", line = 680)
    public static final void method1816() {
        int[] var0 = new int[2];
        field3771.glGetIntegerv(3073, var0, 0);
        field3771.glGetIntegerv(3074, var0, 1);
        field3771.glDrawBuffer(1026);
        field3771.glReadBuffer(1024);
        method1786(-1);
        field3771.glPushAttrib(8192);
        field3771.glDisable(2912);
        field3771.glDisable(3042);
        field3771.glDisable(2929);
        field3771.glDisable(3008);
        field3771.glRasterPos2i(0, 0);
        field3771.glCopyPixels(0, 0, field3769, field3749, 6144);
        field3771.glPopAttrib();
        field3771.glDrawBuffer(var0[0]);
        field3771.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "()F", line = 710)
    public static final float method1817() {
        return field3758;
    }

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "()V", line = 713)
    private static final void method1818() {
        if (field3747) {
            return;
        }
        field3771.glMatrixMode(5889);
        field3771.glLoadIdentity();
        field3771.glOrtho(0.0D, (double) field3769, 0.0D, (double) field3749, -1.0D, 1.0D);
        method1795(0, 0, field3769, field3749);
        field3771.glMatrixMode(5888);
        field3771.glLoadIdentity();
        field3747 = true;
    }

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "()I", line = 726)
    private static final int method1819() {
        int var0 = 0;
        field3727 = field3771.glGetString(7936);
        field3731 = field3771.glGetString(7937);
        String var1 = field3727.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field3771.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field3767 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field3767 < 12) {
            var0 |= 0x2;
        }
        if (!field3771.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field3771.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field3771.glGetIntegerv(34018, var7, 0);
        field3741 = var7[0];
        field3771.glGetIntegerv(34929, var7, 0);
        field3765 = var7[0];
        field3771.glGetIntegerv(34930, var7, 0);
        field3736 = var7[0];
        if (field3741 < 2 || field3765 < 2 || field3736 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field3757 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field3764 = field3771.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field3745 = field3771.isExtensionAvailable("GL_ARB_multisample");
        field3724 = field3771.isExtensionAvailable("GL_ARB_texture_cube_map");
        field3752 = field3771.isExtensionAvailable("GL_ARB_vertex_program");
        field3730 = field3771.isExtensionAvailable("GL_EXT_framebuffer_object");
        field3771.isExtensionAvailable("GL_ARB_vertex_shader");
        field3729 = field3771.isExtensionAvailable("GL_ARB_fragment_shader");
        field3762 = field3771.isExtensionAvailable("GL_EXT_texture3D");
        field3761 = field3771.isExtensionAvailable("GL_ARB_texture_rectangle");
        field3750 = field3771.isExtensionAvailable("GL_ARB_texture_float");
        field3739 = true;
        String var8 = field3731.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class231.method1733(var8.replace('/', ' '), 0, ' ');
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class295.method2128(true, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class295.method2128(true, var13.substring(0, 4))) {
                        var9 = class343.method2418(-73, var13.substring(0, 4));
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field3764 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field3762 = false;
            }
            if (var9 >= 9200 || var10) {
                field3750 = false;
            }
            field3755 = field3764;
            field3739 = false;
        }
        if (field3764) {
            try {
                int[] var14 = new int[1];
                field3771.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 859)
    public static final int method1820(Canvas arg0, int arg1) {
        return method1798(arg0, arg1, (GLContext) null);
    }
}
