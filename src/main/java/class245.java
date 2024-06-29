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

@OriginalClass("client!fd")
public class class245 {

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "F")
    private static float field3859 = 0.0F;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "F")
    private static float field3856 = 0.0F;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Z")
    private static boolean field3852 = false;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Z")
    private static boolean field3866 = false;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "Z")
    private static boolean field3871 = true;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    private static int field3878 = -1;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    private static int field3863 = -1;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
    private static int field3881 = -1;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field3882 = 0;

    @OriginalMember(owner = "client!fd", name = "Q", descriptor = "Z")
    private static boolean field3893 = true;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "Z")
    public static boolean field3886 = false;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "I")
    private static int field3888 = 0;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "Z")
    public static boolean field3877 = true;

    @OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
    private static int field3894 = 0;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "[F")
    private static float[] field3897 = new float[16];

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "F")
    private static float field3898 = 0.09765625F;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "Z")
    private static boolean field3899 = true;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "F")
    private static float field3861;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "F")
    private static float field3865;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    private static int field3851;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    private static int field3864;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
    private static int field3879;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    private static int field3883;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!fd", name = "N", descriptor = "I")
    private static int field3890;

    @OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
    private static int field3892;

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    private static int field3896;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Ljava/lang/String;")
    private static String field3875;

    @OriginalMember(owner = "client!fd", name = "O", descriptor = "Ljava/lang/String;")
    private static String field3891;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field3884;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field3873;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field3880;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
    public static boolean field3854;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Z")
    public static boolean field3855;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Z")
    public static boolean field3858;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Z")
    public static boolean field3860;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Z")
    public static boolean field3867;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "Z")
    public static boolean field3868;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Z")
    public static boolean field3869;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Z")
    public static boolean field3870;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "Z")
    public static boolean field3876;

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "Z")
    public static boolean field3885;

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Z")
    public static boolean field3889;

    @OriginalMember(owner = "client!fd", name = "S", descriptor = "Z")
    public static boolean field3895;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method1703(int arg0, int arg1, int arg2, int arg3) {
        field3884.glMatrixMode(5889);
        field3884.glLoadIdentity();
        field3884.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field3884.glMatrixMode(5888);
        field3884.glLoadIdentity();
        method1731(field3857, field3887, field3872, field3862);
        field3852 = false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "()V", line = 21)
    public static final void method1704() {
        try {
            field3880.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIII)V", line = 33)
    public static final void method1705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field3872 - arg0;
        int var8 = -arg1;
        int var9 = field3862 - arg1;
        field3884.glMatrixMode(5889);
        field3884.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field3884.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method1731(0, 0, field3872, field3862);
        field3884.glMatrixMode(5888);
        field3884.glLoadIdentity();
        field3884.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field3852 = false;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 59)
    private static final int method1706(Canvas arg0, int arg1, GLContext arg2) {
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
            field3880 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field3880.setRealized(true);
            int var5 = 0;
            while (true) {
                field3873 = field3880.createContext(arg2);
                try {
                    int var6 = field3873.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class177.method1246(1000L, -32644);
            }
            field3884 = field3873.getGL();
            field3886 = true;
            field3872 = arg0.getSize().width;
            field3862 = arg0.getSize().height;
            int var8 = method1744();
            if (var8 != 0) {
                method1718();
                return var8;
            }
            method1737();
            method1741();
            field3884.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field3880.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method1718();
                        return -3;
                    }
                    class177.method1246(100L, -32644);
                }
            }
            field3884.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method1718();
            return -5;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "()V", line = 139)
    private static final void method1707() {
        field3884.glViewport(field3857 + field3851, field3892 + field3887, field3883, field3890);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 152)
    private static final void method1708(boolean arg0) {
        if (field3877 == arg0) {
            return;
        }
        if (arg0) {
            field3884.glEnableClientState(32885);
        } else {
            field3884.glDisableClientState(32885);
        }
        field3877 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 163)
    public static final void method1709(int arg0) {
        if (field3894 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3884.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field3884.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field3884.glTexEnvi(8960, 34162, 260);
        }
        field3894 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "()V", line = 184)
    public static final void method1710() {
        if (field3866) {
            field3884.glMatrixMode(5890);
            field3884.glLoadIdentity();
            field3884.glMatrixMode(5888);
            field3866 = false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIFFII)V", line = 195)
    public static final void method1711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field3884.glMatrixMode(5889);
        field3884.glLoadIdentity();
        method1734((float) var10 * field3898, (float) var11 * field3898, (float) (-var13) * field3898, (float) (-var12) * field3898, 50.0F, 3584.0F);
        method1731(arg0, field3862 - arg1 - arg3, arg2, arg3);
        field3884.glMatrixMode(5888);
        field3884.glLoadIdentity();
        field3884.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field3884.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field3884.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field3852 = false;
        class361.field5696 = var10;
        class293.field4861 = var11;
        class296.field4918 = var12;
        class9.field110 = var13;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "()V", line = 222)
    private static final void method1712() {
        if (field3852) {
            return;
        }
        field3884.glMatrixMode(5889);
        field3884.glLoadIdentity();
        field3884.glOrtho(0.0D, (double) field3872, 0.0D, (double) field3862, -1.0D, 1.0D);
        method1731(0, 0, field3872, field3862);
        field3884.glMatrixMode(5888);
        field3884.glLoadIdentity();
        field3852 = true;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "()V", line = 237)
    public static final void method1713() {
        field3884.glDepthMask(false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(F)V", line = 242)
    public static final void method1714(float arg0) {
        method1727(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "()V", line = 246)
    public static final void method1715() {
        int[] var0 = new int[2];
        field3884.glGetIntegerv(3073, var0, 0);
        field3884.glGetIntegerv(3074, var0, 1);
        field3884.glDrawBuffer(1026);
        field3884.glReadBuffer(1024);
        method1729(-1);
        field3884.glPushAttrib(8192);
        field3884.glDisable(2912);
        field3884.glDisable(3042);
        field3884.glDisable(2929);
        field3884.glDisable(3008);
        field3884.glRasterPos2i(0, 0);
        field3884.glCopyPixels(0, 0, field3872, field3862, 6144);
        field3884.glPopAttrib();
        field3884.glDrawBuffer(var0[0]);
        field3884.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "()V", line = 266)
    public static void method1716() {
        field3891 = null;
        field3875 = null;
        field3884 = null;
        field3880 = null;
        field3873 = null;
        field3897 = null;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V", line = 274)
    public static final void method1717(int arg0) {
        field3884.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3884.glClear(16384);
        field3884.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "()V", line = 279)
    public static final void method1718() {
        if (field3884 != null) {
            try {
                class309.method2157();
                class199.method1358(-86);
            } catch (Throwable var7) {
            }
            field3884 = null;
        }
        if (field3873 != null) {
            class173.method1192();
            try {
                if (GLContext.getCurrent() == field3873) {
                    field3873.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field3873.destroy();
            } catch (Throwable var5) {
            }
            field3873 = null;
        }
        if (field3880 != null) {
            try {
                field3880.setRealized(false);
            } catch (Throwable var4) {
            }
            field3880 = null;
        }
        class254.method1804();
        field3886 = false;
    }

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "()V", line = 326)
    public static final void method1719() {
        class7.method53(0, 0, true);
        method1712();
        method1721(0);
        method1709(0);
        method1740(false);
        method1742(false);
        method1743(false);
        method1710();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)V", line = 340)
    public static final void method1720(int arg0, int arg1) {
        field3857 = arg0;
        field3887 = arg1;
        method1707();
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)V", line = 345)
    public static final void method1721(int arg0) {
        if (field3888 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3884.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field3884.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field3884.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field3884.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field3884.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field3884.glTexEnvi(8960, 34161, 34165);
        }
        field3888 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "()F", line = 372)
    public static final float method1722() {
        return field3859;
    }

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "()V", line = 380)
    public static final void method1723() {
        if (class322.field5287) {
            method1740(true);
            method1708(true);
        } else {
            method1740(false);
            method1708(false);
        }
    }

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "()V", line = 393)
    public static final void method1724() {
        field3884.glDepthMask(true);
    }

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "()V", line = 396)
    public static final void method1725() {
        class7.method53(0, 0, true);
        method1712();
        method1721(1);
        method1709(1);
        method1740(false);
        method1742(false);
        method1743(false);
        method1710();
    }

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "()V", line = 409)
    public static final void method1726() {
        class7.method53(0, 0, true);
        method1712();
        method1721(0);
        method1709(0);
        method1740(false);
        method1742(false);
        method1743(false);
        method1710();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FF)V", line = 428)
    public static final void method1727(float arg0, float arg1) {
        if (field3852 || field3856 == arg0 && field3859 == arg1) {
            return;
        }
        field3856 = arg0;
        field3859 = arg1;
        if (arg1 == 0.0F) {
            field3897[10] = field3861;
            field3897[14] = field3865;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field3865 * (1.0F - var2) / arg1;
            field3897[10] = field3861 + var4;
            field3897[14] = field3865 * var3;
        }
        field3884.glMatrixMode(5889);
        field3884.glLoadMatrixf(field3897, 0);
        field3884.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "()I", line = 468)
    public static final int method1728() {
        if (field3889 && (field3863 <= 0 || field3881 != class173.field2703)) {
            int[] var0 = new int[1];
            field3884.glGenFramebuffersEXT(1, var0, 0);
            field3881 = class173.field2703;
            field3863 = var0[0];
        }
        return field3863;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V", line = 486)
    public static final void method1729(int arg0) {
        if (field3878 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field3884.glDisable(3553);
        } else {
            if (field3878 == -1) {
                field3884.glEnable(3553);
            }
            field3884.glBindTexture(3553, arg0);
        }
        field3878 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 502)
    public static final int method1730(Canvas arg0, int arg1) {
        return method1706(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(IIII)V", line = 505)
    private static final void method1731(int arg0, int arg1, int arg2, int arg3) {
        field3851 = arg0;
        field3892 = arg1;
        field3883 = arg2;
        field3890 = arg3;
        method1707();
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V", line = 513)
    public static final void method1732(int arg0) {
        field3884.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3884.glClear(16640);
        field3884.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(IIII)V", line = 518)
    public static final void method1733(int arg0, int arg1, int arg2, int arg3) {
        method1711(0, 0, field3872, field3862, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFFFFF)V", line = 531)
    private static final void method1734(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field3897[0] = var6 / (arg1 - arg0);
        field3897[1] = 0.0F;
        field3897[2] = 0.0F;
        field3897[3] = 0.0F;
        field3897[4] = 0.0F;
        field3897[5] = var6 / (arg3 - arg2);
        field3897[6] = 0.0F;
        field3897[7] = 0.0F;
        field3897[8] = (arg0 + arg1) / (arg1 - arg0);
        field3897[9] = (arg2 + arg3) / (arg3 - arg2);
        field3897[10] = field3861 = -(arg4 + arg5) / (arg5 - arg4);
        field3897[11] = -1.0F;
        field3897[12] = 0.0F;
        field3897[13] = 0.0F;
        field3897[14] = field3865 = -(arg5 * var6) / (arg5 - arg4);
        field3897[15] = 0.0F;
        field3884.glLoadMatrixf(field3897, 0);
        field3856 = 0.0F;
        field3859 = 0.0F;
    }

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "()F", line = 556)
    public static final float method1735() {
        return field3856;
    }

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "()V", line = 559)
    public static final void method1736() {
        field3884.glClear(256);
    }

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "()V", line = 568)
    private static final void method1737() {
        int[] var0 = new int[1];
        field3884.glGenTextures(1, var0, 0);
        field3853 = var0[0];
        field3884.glBindTexture(3553, field3853);
        field3884.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class254.method1796();
        class154.method1115(false);
        class309.method2162();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(FFF)V", line = 578)
    public static final void method1738(float arg0, float arg1, float arg2) {
        field3884.glMatrixMode(5890);
        if (field3866) {
            field3884.glLoadIdentity();
        }
        field3884.glTranslatef(arg0, arg1, arg2);
        field3884.glMatrixMode(5888);
        field3866 = true;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V", line = 588)
    public static final void method1739(int arg0, int arg1) {
        field3872 = arg0;
        field3862 = arg1;
        field3852 = false;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)V", line = 593)
    public static final void method1740(boolean arg0) {
        if (field3871 == arg0) {
            return;
        }
        if (arg0) {
            field3884.glEnable(2896);
        } else {
            field3884.glDisable(2896);
        }
        field3871 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "()V", line = 607)
    private static final void method1741() {
        field3852 = false;
        field3884.glDisable(3553);
        field3878 = -1;
        field3884.glTexEnvi(8960, 8704, 34160);
        field3884.glTexEnvi(8960, 34161, 8448);
        field3888 = 0;
        field3884.glTexEnvi(8960, 34162, 8448);
        field3894 = 0;
        field3884.glEnable(2896);
        field3884.glEnable(2912);
        field3884.glEnable(2929);
        field3871 = true;
        field3899 = true;
        field3893 = true;
        class141.method1000(false);
        field3884.glActiveTexture(33985);
        field3884.glTexEnvi(8960, 8704, 34160);
        field3884.glTexEnvi(8960, 34161, 8448);
        field3884.glTexEnvi(8960, 34162, 8448);
        field3884.glActiveTexture(33984);
        field3884.setSwapInterval(0);
        field3884.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field3884.glShadeModel(7425);
        field3884.glClearDepth(1.0F);
        field3884.glDepthFunc(515);
        method1724();
        field3884.glMatrixMode(5890);
        field3884.glLoadIdentity();
        field3884.glPolygonMode(1028, 6914);
        field3884.glEnable(2884);
        field3884.glCullFace(1029);
        field3884.glEnable(3042);
        field3884.glBlendFunc(770, 771);
        field3884.glEnable(3008);
        field3884.glAlphaFunc(516, 0.0F);
        field3884.glEnableClientState(32884);
        field3884.glEnableClientState(32885);
        field3877 = true;
        field3884.glEnableClientState(32886);
        field3884.glEnableClientState(32888);
        field3884.glMatrixMode(5888);
        field3884.glLoadIdentity();
        class234.method1615();
        class254.method1806();
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)V", line = 653)
    public static final void method1742(boolean arg0) {
        if (field3899 == arg0) {
            return;
        }
        if (arg0) {
            field3884.glEnable(2929);
        } else {
            field3884.glDisable(2929);
        }
        field3899 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(Z)V", line = 676)
    public static final void method1743(boolean arg0) {
        if (field3893 == arg0) {
            return;
        }
        if (arg0) {
            field3884.glEnable(2912);
        } else {
            field3884.glDisable(2912);
        }
        field3893 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "()I", line = 698)
    private static final int method1744() {
        int var0 = 0;
        field3875 = field3884.glGetString(7936);
        field3891 = field3884.glGetString(7937);
        String var1 = field3875.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field3884.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field3896 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field3896 < 12) {
            var0 |= 0x2;
        }
        if (!field3884.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field3884.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field3884.glGetIntegerv(34018, var7, 0);
        field3874 = var7[0];
        field3884.glGetIntegerv(34929, var7, 0);
        field3864 = var7[0];
        field3884.glGetIntegerv(34930, var7, 0);
        field3879 = var7[0];
        if (field3874 < 2 || field3864 < 2 || field3879 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field3895 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field3869 = field3884.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field3858 = field3884.isExtensionAvailable("GL_ARB_multisample");
        field3876 = field3884.isExtensionAvailable("GL_ARB_texture_cube_map");
        field3855 = field3884.isExtensionAvailable("GL_ARB_vertex_program");
        field3889 = field3884.isExtensionAvailable("GL_EXT_framebuffer_object");
        field3884.isExtensionAvailable("GL_ARB_vertex_shader");
        field3867 = field3884.isExtensionAvailable("GL_ARB_fragment_shader");
        field3885 = field3884.isExtensionAvailable("GL_EXT_texture3D");
        field3854 = field3884.isExtensionAvailable("GL_ARB_texture_rectangle");
        field3870 = field3884.isExtensionAvailable("GL_ARB_texture_float");
        field3860 = true;
        String var8 = field3891.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class68.method479(5, ' ', var8.replace('/', ' '));
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class54.method386(10, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class54.method386(10, var13.substring(0, 4))) {
                        var9 = class233.method1608(false, var13.substring(0, 4));
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field3869 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field3885 = false;
            }
            if (var9 >= 9200 || var10) {
                field3870 = false;
            }
            field3868 = field3869;
            field3860 = false;
        }
        if (field3869) {
            try {
                int[] var14 = new int[1];
                field3884.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "()V", line = 831)
    public static final void method1745() {
        class7.method53(0, 0, true);
        method1712();
        method1729(-1);
        method1740(false);
        method1742(false);
        method1743(false);
        method1710();
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 844)
    public static final void method1746(Canvas arg0) {
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
}
