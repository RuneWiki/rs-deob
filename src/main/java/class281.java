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
public class class281 {

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field4810 = 0;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Z")
    private static boolean field4812 = false;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "Z")
    private static boolean field4825 = true;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "Z")
    public static boolean field4827 = false;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "F")
    private static float field4815 = 0.0F;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "Z")
    private static boolean field4831 = false;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "Z")
    private static boolean field4828 = true;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "[F")
    private static float[] field4809 = new float[16];

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "F")
    private static float field4834 = 0.09765625F;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    private static int field4835 = 0;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
    private static int field4844 = 0;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    private static int field4829 = -1;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "Lve;")
    private static class255 field4843 = class87.method607(75, "radeon");

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "F")
    private static float field4840 = 0.0F;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Z")
    private static boolean field4813 = true;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "Z")
    public static boolean field4845 = true;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "F")
    private static float field4821;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "F")
    private static float field4842;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    private static int field4826;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
    private static int field4833;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    private static int field4838;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "Ljava/lang/String;")
    private static String field4837;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "Ljava/lang/String;")
    private static String field4841;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4839;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field4824;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4811;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Z")
    public static boolean field4816;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "Z")
    public static boolean field4819;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "Z")
    public static boolean field4820;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "Z")
    public static boolean field4822;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "Z")
    public static boolean field4830;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "Z")
    public static boolean field4832;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "Z")
    public static boolean field4836;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(F)V", line = 16)
    public static final void method1952(float arg0) {
        method1961(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1953(int arg0) {
        if (field4829 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4839.glDisable(3553);
        } else {
            if (field4829 == -1) {
                field4839.glEnable(3553);
            }
            field4839.glBindTexture(3553, arg0);
        }
        field4829 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V", line = 39)
    public static final void method1954() {
        field4839.glClear(256);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()V", line = 42)
    private static final void method1955() {
        if (field4812) {
            return;
        }
        field4839.glMatrixMode(5889);
        field4839.glLoadIdentity();
        field4839.glOrtho(0.0D, (double) field4818, 0.0D, (double) field4823, -1.0D, 1.0D);
        field4839.glViewport(0, 0, field4818, field4823);
        field4839.glMatrixMode(5888);
        field4839.glLoadIdentity();
        field4812 = true;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V", line = 54)
    private static final void method1956(boolean arg0) {
        if (field4845 == arg0) {
            return;
        }
        if (arg0) {
            field4839.glEnableClientState(32885);
        } else {
            field4839.glDisableClientState(32885);
        }
        field4845 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()V", line = 65)
    public static final void method1957() {
        field4839.glDepthMask(true);
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "()V", line = 72)
    public static final void method1958() {
        field4839.glDepthMask(false);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 76)
    public static final int method1959(Canvas arg0, int arg1) {
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
            field4811 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field4811.setRealized(true);
            int var4 = 0;
            while (true) {
                field4824 = field4811.createContext((GLContext) null);
                try {
                    int var5 = field4824.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class137.method1027(1000L, 0);
            }
            field4839 = field4824.getGL();
            new GLU();
            field4827 = true;
            field4818 = arg0.getSize().width;
            field4823 = arg0.getSize().height;
            int var7 = method1985();
            if (var7 != 0) {
                method1982();
                return var7;
            }
            method1972();
            method1974();
            field4839.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field4811.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1982();
                        return -3;
                    }
                    class137.method1027(100L, 0);
                }
            }
            field4839.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1982();
            return -5;
        }
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "()V", line = 161)
    public static final void method1960() {
        if (field4831) {
            field4839.glMatrixMode(5890);
            field4839.glLoadIdentity();
            field4839.glMatrixMode(5888);
            field4831 = false;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(FF)V", line = 171)
    public static final void method1961(float arg0, float arg1) {
        if (field4812 || field4840 == arg0 && field4815 == arg1) {
            return;
        }
        field4840 = arg0;
        field4815 = arg1;
        if (arg1 == 0.0F) {
            field4809[10] = field4821;
            field4809[14] = field4842;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4842 * (1.0F - var2) / arg1;
            field4809[10] = field4821 + var4;
            field4809[14] = field4842 * var3;
        }
        field4839.glMatrixMode(5889);
        field4839.glLoadMatrixf(field4809, 0);
        field4839.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 202)
    public static final void method1962(Canvas arg0) {
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

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 222)
    public static final void method1963(int arg0) {
        field4839.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4839.glClear(16640);
        field4839.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V", line = 227)
    public static final void method1964(int arg0) {
        if (field4844 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4839.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4839.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4839.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4839.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4839.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4839.glTexEnvi(8960, 34161, 34165);
        }
        field4844 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "()V", line = 252)
    public static final void method1965() {
        int[] var0 = new int[2];
        field4839.glGetIntegerv(3073, var0, 0);
        field4839.glGetIntegerv(3074, var0, 1);
        field4839.glDrawBuffer(1026);
        field4839.glReadBuffer(1024);
        method1953(-1);
        field4839.glPushAttrib(8192);
        field4839.glDisable(2912);
        field4839.glDisable(3042);
        field4839.glDisable(2929);
        field4839.glDisable(3008);
        field4839.glRasterPos2i(0, 0);
        field4839.glCopyPixels(0, 0, field4818, field4823, 6144);
        field4839.glPopAttrib();
        field4839.glDrawBuffer(var0[0]);
        field4839.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "()V", line = 272)
    public static final void method1966() {
        if (class114.field1921) {
            method1986(true);
            method1956(true);
        } else {
            method1986(false);
            method1956(false);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIII)V", line = 290)
    public static final void method1967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4818 - arg0;
        int var8 = -arg1;
        int var9 = field4823 - arg1;
        field4839.glMatrixMode(5889);
        field4839.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4839.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field4839.glViewport(0, 0, field4818, field4823);
        field4839.glMatrixMode(5888);
        field4839.glLoadIdentity();
        field4839.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4812 = false;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(Z)V", line = 316)
    public static final void method1968(boolean arg0) {
        if (field4828 == arg0) {
            return;
        }
        if (arg0) {
            field4839.glEnable(2929);
        } else {
            field4839.glDisable(2929);
        }
        field4828 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFF)V", line = 332)
    public static final void method1969(float arg0, float arg1, float arg2) {
        field4839.glMatrixMode(5890);
        if (field4831) {
            field4839.glLoadIdentity();
        }
        field4839.glTranslatef(arg0, arg1, arg2);
        field4839.glMatrixMode(5888);
        field4831 = true;
    }

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "()F", line = 347)
    public static final float method1970() {
        return field4815;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(Z)V", line = 352)
    public static final void method1971(boolean arg0) {
        if (field4825 == arg0) {
            return;
        }
        if (arg0) {
            field4839.glEnable(2912);
        } else {
            field4839.glDisable(2912);
        }
        field4825 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "()V", line = 371)
    private static final void method1972() {
        int[] var0 = new int[1];
        field4839.glGenTextures(1, var0, 0);
        field4814 = var0[0];
        field4839.glBindTexture(3553, field4814);
        field4839.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class245.method1695(6);
    }

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "()V", line = 381)
    public static final void method1973() {
        try {
            field4811.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "()V", line = 391)
    private static final void method1974() {
        field4812 = false;
        field4839.glDisable(3553);
        field4829 = -1;
        field4839.glTexEnvi(8960, 8704, 34160);
        field4839.glTexEnvi(8960, 34161, 8448);
        field4844 = 0;
        field4839.glTexEnvi(8960, 34162, 8448);
        field4835 = 0;
        field4839.glEnable(2896);
        field4839.glEnable(2912);
        field4839.glEnable(2929);
        field4813 = true;
        field4828 = true;
        field4825 = true;
        class109.method838(-48);
        field4839.glActiveTexture(33985);
        field4839.glTexEnvi(8960, 8704, 34160);
        field4839.glTexEnvi(8960, 34161, 8448);
        field4839.glTexEnvi(8960, 34162, 8448);
        field4839.glActiveTexture(33984);
        field4839.setSwapInterval(0);
        field4839.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4839.glShadeModel(7425);
        field4839.glClearDepth(1.0D);
        field4839.glDepthFunc(515);
        method1957();
        field4839.glMatrixMode(5890);
        field4839.glLoadIdentity();
        field4839.glPolygonMode(1028, 6914);
        field4839.glEnable(2884);
        field4839.glCullFace(1029);
        field4839.glEnable(3042);
        field4839.glBlendFunc(770, 771);
        field4839.glEnable(3008);
        field4839.glAlphaFunc(516, 0.0F);
        field4839.glEnableClientState(32884);
        field4839.glEnableClientState(32885);
        field4845 = true;
        field4839.glEnableClientState(32886);
        field4839.glEnableClientState(32888);
        field4839.glMatrixMode(5888);
        field4839.glLoadIdentity();
        class272.method1904();
        class164.method1205();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFFFFF)V", line = 441)
    private static final void method1975(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field4809[0] = var6 / (arg1 - arg0);
        field4809[1] = 0.0F;
        field4809[2] = 0.0F;
        field4809[3] = 0.0F;
        field4809[4] = 0.0F;
        field4809[5] = var6 / (arg3 - arg2);
        field4809[6] = 0.0F;
        field4809[7] = 0.0F;
        field4809[8] = (arg0 + arg1) / (arg1 - arg0);
        field4809[9] = (arg2 + arg3) / (arg3 - arg2);
        field4809[10] = field4821 = -(arg4 + arg5) / (arg5 - arg4);
        field4809[11] = -1.0F;
        field4809[12] = 0.0F;
        field4809[13] = 0.0F;
        field4809[14] = field4842 = -(arg5 * var6) / (arg5 - arg4);
        field4809[15] = 0.0F;
        field4839.glLoadMatrixf(field4809, 0);
        field4840 = 0.0F;
        field4815 = 0.0F;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIFFII)V", line = 465)
    public static final void method1976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4839.glMatrixMode(5889);
        field4839.glLoadIdentity();
        method1975((float) var10 * field4834, (float) var11 * field4834, (float) (-var13) * field4834, (float) (-var12) * field4834, 50.0F, 3584.0F);
        field4839.glViewport(arg0, field4823 - arg1 - arg3, arg2, arg3);
        field4839.glMatrixMode(5888);
        field4839.glLoadIdentity();
        field4839.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4839.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4839.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4812 = false;
        class298.field5095 = var10;
        class261.field4430 = var11;
        class95.field1637 = var12;
        class295.field5067 = var13;
    }

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "()V", line = 496)
    public static final void method1977() {
        class256.method1795(0, 0, -536);
        method1955();
        method1964(1);
        method1983(1);
        method1986(false);
        method1968(false);
        method1971(false);
        method1960();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;)Lve;", line = 512)
    private static final class255 method1978(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class33.method185(var1, var1.length, 0, false);
    }

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "()V", line = 525)
    public static void method1979() {
        field4843 = null;
        field4837 = null;
        field4841 = null;
        field4839 = null;
        field4811 = null;
        field4824 = null;
        field4809 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIII)V", line = 534)
    public static final void method1980(int arg0, int arg1, int arg2, int arg3) {
        method1976(0, 0, field4818, field4823, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "()V", line = 538)
    public static final void method1981() {
        class256.method1795(0, 0, -536);
        method1955();
        method1953(-1);
        method1986(false);
        method1968(false);
        method1971(false);
        method1960();
    }

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "()V", line = 549)
    public static final void method1982() {
        if (field4839 != null) {
            try {
                class143.method1067((byte) 96);
            } catch (Throwable var7) {
            }
            field4839 = null;
        }
        if (field4824 != null) {
            class139.method1042();
            try {
                if (GLContext.getCurrent() == field4824) {
                    field4824.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field4824.destroy();
            } catch (Throwable var5) {
            }
            field4824 = null;
        }
        if (field4811 != null) {
            try {
                field4811.setRealized(false);
            } catch (Throwable var4) {
            }
            field4811 = null;
        }
        class164.method1207();
        field4827 = false;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V", line = 598)
    public static final void method1983(int arg0) {
        if (field4835 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4839.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4839.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4839.glTexEnvi(8960, 34162, 260);
        }
        field4835 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "()V", line = 613)
    public static final void method1984() {
        class256.method1795(0, 0, -536);
        method1955();
        method1964(0);
        method1983(0);
        method1986(false);
        method1968(false);
        method1971(false);
        method1960();
    }

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "()I", line = 625)
    private static final int method1985() {
        int var0 = 0;
        field4841 = field4839.glGetString(7936);
        field4837 = field4839.glGetString(7937);
        String var1 = field4841.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field4839.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field4838 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field4838 < 12) {
            var0 |= 0x2;
        }
        if (!field4839.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field4839.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field4839.glGetIntegerv(34018, var7, 0);
        field4817 = var7[0];
        field4839.glGetIntegerv(34929, var7, 0);
        field4833 = var7[0];
        field4839.glGetIntegerv(34930, var7, 0);
        field4826 = var7[0];
        if (field4817 < 2 || field4833 < 2 || field4826 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field4816 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field4820 = field4839.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field4819 = field4839.isExtensionAvailable("GL_ARB_multisample");
        field4836 = field4839.isExtensionAvailable("GL_ARB_texture_cube_map");
        field4830 = field4839.isExtensionAvailable("GL_ARB_vertex_program");
        field4832 = field4839.isExtensionAvailable("GL_EXT_texture3D");
        class255 var8 = method1978(field4837).method1777(-157);
        if (var8.method1790((byte) -47, field4843) != -1) {
            int var9 = 0;
            class255[] var10 = var8.method1759(47, 32, 101).method1760((byte) 124, 32);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class255 var12 = var10[var11];
                if (var12.method1774(-41) >= 4 && var12.method1780(4, -10449, 0).method1776((byte) 111)) {
                    var9 = var12.method1780(4, -10449, 0).method1746((byte) 78);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field4820 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field4832 = false;
            }
            field4822 = field4820;
        }
        if (field4820) {
            try {
                int[] var13 = new int[1];
                field4839.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(Z)V", line = 731)
    public static final void method1986(boolean arg0) {
        if (field4813 == arg0) {
            return;
        }
        if (arg0) {
            field4839.glEnable(2896);
        } else {
            field4839.glDisable(2896);
        }
        field4813 = arg0;
    }

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "()F", line = 742)
    public static final float method1987() {
        return field4840;
    }

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "()V", line = 757)
    public static final void method1988() {
        class256.method1795(0, 0, -536);
        method1955();
        method1964(0);
        method1983(0);
        method1986(false);
        method1968(false);
        method1971(false);
        method1960();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)V", line = 768)
    public static final void method1989(int arg0, int arg1) {
        field4818 = arg0;
        field4823 = arg1;
        field4812 = false;
    }
}
