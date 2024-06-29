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

@OriginalClass("client!sf")
public class class108 {

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "F")
    private static float field1889 = 0.09765625F;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    private static int field1906 = 0;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field1905 = 0;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "F")
    private static float field1895 = 0.0F;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "[F")
    private static float[] field1893 = new float[16];

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "Z")
    private static boolean field1915 = true;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "Z")
    private static boolean field1914 = false;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    private static int field1912 = -1;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    private static int field1910 = 0;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Z")
    private static boolean field1909 = true;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Z")
    private static boolean field1902 = false;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Z")
    private static boolean field1894 = true;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "F")
    private static float field1918 = 0.0F;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "Z")
    public static boolean field1900 = false;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "Ljf;")
    private static class229 field1898 = class212.method1457((byte) 72, "radeon");

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "Z")
    public static boolean field1917 = true;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "F")
    private static float field1888;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "F")
    private static float field1896;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    private static int field1890;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    private static int field1891;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    private static int field1901;

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "Ljava/lang/String;")
    private static String field1907;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "Ljava/lang/String;")
    private static String field1908;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field1899;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field1920;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field1913;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "Z")
    public static boolean field1897;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Z")
    public static boolean field1903;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "Z")
    public static boolean field1904;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "Z")
    public static boolean field1911;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "Z")
    public static boolean field1919;

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "Z")
    public static boolean field1922;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "Z")
    public static boolean field1923;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()V", line = 12)
    public static final void method735() {
        class257.method1832((byte) 46, 0, 0);
        method738();
        method736(-1);
        method771(false);
        method747(false);
        method768(false);
        method764();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 25)
    public static final void method736(int arg0) {
        if (field1912 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field1899.glDisable(3553);
        } else {
            if (field1912 == -1) {
                field1899.glEnable(3553);
            }
            field1899.glBindTexture(3553, arg0);
        }
        field1912 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()I", line = 43)
    private static final int method737() {
        int var0 = 0;
        field1908 = field1899.glGetString(7936);
        field1907 = field1899.glGetString(7937);
        String var1 = field1908.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field1899.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field1890 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field1890 < 12) {
            var0 |= 0x2;
        }
        if (!field1899.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field1899.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field1899.glGetIntegerv(34018, var7, 0);
        field1921 = var7[0];
        field1899.glGetIntegerv(34929, var7, 0);
        field1891 = var7[0];
        field1899.glGetIntegerv(34930, var7, 0);
        field1901 = var7[0];
        if (field1921 < 2 || field1891 < 2 || field1901 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field1911 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field1904 = field1899.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field1923 = field1899.isExtensionAvailable("GL_ARB_multisample");
        field1919 = field1899.isExtensionAvailable("GL_ARB_texture_cube_map");
        field1922 = field1899.isExtensionAvailable("GL_ARB_vertex_program");
        field1897 = field1899.isExtensionAvailable("GL_EXT_texture3D");
        class229 var8 = method748(field1907).method1608(-199);
        if (var8.method1649(field1898, (byte) -102) != -1) {
            int var9 = 0;
            class229[] var10 = var8.method1635(32, 47, false).method1607(32, -27);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class229 var12 = var10[var11];
                if (var12.method1626(-101) >= 4 && var12.method1639((byte) -20, 4, 0).method1620((byte) -77)) {
                    var9 = var12.method1639((byte) -20, 4, 0).method1629(43);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field1904 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field1897 = false;
            }
            field1903 = field1904;
        }
        if (field1904) {
            try {
                int[] var13 = new int[1];
                field1899.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()V", line = 153)
    private static final void method738() {
        if (field1914) {
            return;
        }
        field1899.glMatrixMode(5889);
        field1899.glLoadIdentity();
        field1899.glOrtho(0.0D, (double) field1887, 0.0D, (double) field1916, -1.0D, 1.0D);
        field1899.glViewport(0, 0, field1887, field1916);
        field1899.glMatrixMode(5888);
        field1899.glLoadIdentity();
        field1914 = true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(FFF)V", line = 168)
    public static final void method739(float arg0, float arg1, float arg2) {
        field1899.glMatrixMode(5890);
        if (field1902) {
            field1899.glLoadIdentity();
        }
        field1899.glTranslatef(arg0, arg1, arg2);
        field1899.glMatrixMode(5888);
        field1902 = true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)V", line = 177)
    public static final void method740(int arg0, int arg1, int arg2, int arg3) {
        method753(0, 0, field1887, field1916, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 181)
    public static final void method741(int arg0) {
        field1899.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1899.glClear(16640);
        field1899.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "()V", line = 193)
    public static final void method742() {
        class257.method1832((byte) 49, 0, 0);
        method738();
        method766(0);
        method765(0);
        method771(false);
        method747(false);
        method768(false);
        method764();
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "()V", line = 205)
    public static final void method743() {
        if (field1899 != null) {
            try {
                class273.method1916(-16294);
            } catch (Throwable var7) {
            }
            field1899 = null;
        }
        if (field1920 != null) {
            class263.method1865();
            try {
                if (GLContext.getCurrent() == field1920) {
                    field1920.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field1920.destroy();
            } catch (Throwable var5) {
            }
            field1920 = null;
        }
        if (field1913 != null) {
            try {
                field1913.setRealized(false);
            } catch (Throwable var4) {
            }
            field1913 = null;
        }
        class216.method1485();
        field1900 = false;
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "()V", line = 253)
    public static final void method744() {
        class257.method1832((byte) 22, 0, 0);
        method738();
        method766(1);
        method765(1);
        method771(false);
        method747(false);
        method768(false);
        method764();
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(FF)V", line = 264)
    public static final void method745(float arg0, float arg1) {
        if (field1914 || field1918 == arg0 && field1895 == arg1) {
            return;
        }
        field1918 = arg0;
        field1895 = arg1;
        if (arg1 == 0.0F) {
            field1893[10] = field1896;
            field1893[14] = field1888;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field1888 * (1.0F - var2) / arg1;
            field1893[10] = field1896 + var4;
            field1893[14] = field1888 * var3;
        }
        field1899.glMatrixMode(5889);
        field1899.glLoadMatrixf(field1893, 0);
        field1899.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 296)
    public static final int method746(Canvas arg0, int arg1) {
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
            field1913 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field1913.setRealized(true);
            int var4 = 0;
            while (true) {
                field1920 = field1913.createContext((GLContext) null);
                try {
                    int var5 = field1920.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class235.method1675((byte) -22, 1000L);
            }
            field1899 = field1920.getGL();
            new GLU();
            field1900 = true;
            field1887 = arg0.getSize().width;
            field1916 = arg0.getSize().height;
            int var7 = method737();
            if (var7 != 0) {
                method743();
                return var7;
            }
            method750();
            method758();
            field1899.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field1913.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method743();
                        return -3;
                    }
                    class235.method1675((byte) -22, 100L);
                }
            }
            field1899.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method743();
            return -5;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 385)
    public static final void method747(boolean arg0) {
        if (field1894 == arg0) {
            return;
        }
        if (arg0) {
            field1899.glEnable(2929);
        } else {
            field1899.glDisable(2929);
        }
        field1894 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/lang/String;)Ljf;", line = 398)
    private static final class229 method748(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class102.method686(var1.length, 0, true, var1);
    }

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "()V", line = 408)
    public static final void method749() {
        int[] var0 = new int[2];
        field1899.glGetIntegerv(3073, var0, 0);
        field1899.glGetIntegerv(3074, var0, 1);
        field1899.glDrawBuffer(1026);
        field1899.glReadBuffer(1024);
        method736(-1);
        field1899.glPushAttrib(8192);
        field1899.glDisable(2912);
        field1899.glDisable(3042);
        field1899.glDisable(2929);
        field1899.glDisable(3008);
        field1899.glRasterPos2i(0, 0);
        field1899.glCopyPixels(0, 0, field1887, field1916, 6144);
        field1899.glPopAttrib();
        field1899.glDrawBuffer(var0[0]);
        field1899.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "()V", line = 427)
    private static final void method750() {
        int[] var0 = new int[1];
        field1899.glGenTextures(1, var0, 0);
        field1892 = var0[0];
        field1899.glBindTexture(3553, field1892);
        field1899.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class295.method2044((byte) 79);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(FFFFFF)V", line = 440)
    private static final void method751(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field1893[0] = var6 / (arg1 - arg0);
        field1893[1] = 0.0F;
        field1893[2] = 0.0F;
        field1893[3] = 0.0F;
        field1893[4] = 0.0F;
        field1893[5] = var6 / (arg3 - arg2);
        field1893[6] = 0.0F;
        field1893[7] = 0.0F;
        field1893[8] = (arg0 + arg1) / (arg1 - arg0);
        field1893[9] = (arg2 + arg3) / (arg3 - arg2);
        field1893[10] = field1896 = -(arg4 + arg5) / (arg5 - arg4);
        field1893[11] = -1.0F;
        field1893[12] = 0.0F;
        field1893[13] = 0.0F;
        field1893[14] = field1888 = -(arg5 * var6) / (arg5 - arg4);
        field1893[15] = 0.0F;
        field1899.glLoadMatrixf(field1893, 0);
        field1918 = 0.0F;
        field1895 = 0.0F;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 464)
    public static final void method752(Canvas arg0) {
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

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIFFII)V", line = 487)
    public static final void method753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field1899.glMatrixMode(5889);
        field1899.glLoadIdentity();
        method751((float) var10 * field1889, (float) var11 * field1889, (float) (-var13) * field1889, (float) (-var12) * field1889, 50.0F, 3584.0F);
        field1899.glViewport(arg0, field1916 - arg1 - arg3, arg2, arg3);
        field1899.glMatrixMode(5888);
        field1899.glLoadIdentity();
        field1899.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field1899.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field1899.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field1914 = false;
        class214.field3688 = var10;
        class324.field5468 = var11;
        class165.field2827 = var12;
        class297.field5079 = var13;
    }

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "()F", line = 518)
    public static final float method754() {
        return field1895;
    }

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "()F", line = 530)
    public static final float method755() {
        return field1918;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(F)V", line = 533)
    public static final void method756(float arg0) {
        method745(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIII)V", line = 537)
    public static final void method757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field1887 - arg0;
        int var8 = -arg1;
        int var9 = field1916 - arg1;
        field1899.glMatrixMode(5889);
        field1899.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field1899.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field1899.glViewport(0, 0, field1887, field1916);
        field1899.glMatrixMode(5888);
        field1899.glLoadIdentity();
        field1899.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field1914 = false;
    }

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "()V", line = 560)
    private static final void method758() {
        field1914 = false;
        field1899.glDisable(3553);
        field1912 = -1;
        field1899.glTexEnvi(8960, 8704, 34160);
        field1899.glTexEnvi(8960, 34161, 8448);
        field1906 = 0;
        field1899.glTexEnvi(8960, 34162, 8448);
        field1910 = 0;
        field1899.glEnable(2896);
        field1899.glEnable(2912);
        field1899.glEnable(2929);
        field1909 = true;
        field1894 = true;
        field1915 = true;
        class18.method180((byte) -51);
        field1899.glActiveTexture(33985);
        field1899.glTexEnvi(8960, 8704, 34160);
        field1899.glTexEnvi(8960, 34161, 8448);
        field1899.glTexEnvi(8960, 34162, 8448);
        field1899.glActiveTexture(33984);
        field1899.setSwapInterval(0);
        field1899.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field1899.glShadeModel(7425);
        field1899.glClearDepth(1.0D);
        field1899.glDepthFunc(515);
        method767();
        field1899.glMatrixMode(5890);
        field1899.glLoadIdentity();
        field1899.glPolygonMode(1028, 6914);
        field1899.glEnable(2884);
        field1899.glCullFace(1029);
        field1899.glEnable(3042);
        field1899.glBlendFunc(770, 771);
        field1899.glEnable(3008);
        field1899.glAlphaFunc(516, 0.0F);
        field1899.glEnableClientState(32884);
        field1899.glEnableClientState(32885);
        field1917 = true;
        field1899.glEnableClientState(32886);
        field1899.glEnableClientState(32888);
        field1899.glMatrixMode(5888);
        field1899.glLoadIdentity();
        class276.method1944();
        class216.method1482();
    }

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "()V", line = 616)
    public static final void method759() {
        try {
            field1913.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 629)
    public static final void method760(int arg0, int arg1) {
        field1887 = arg0;
        field1916 = arg1;
        field1914 = false;
    }

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "()V", line = 637)
    public static final void method761() {
        field1899.glClear(256);
    }

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "()V", line = 640)
    public static final void method762() {
        if (class329.field5607) {
            method771(true);
            method763(true);
        } else {
            method771(false);
            method763(false);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V", line = 656)
    private static final void method763(boolean arg0) {
        if (field1917 == arg0) {
            return;
        }
        if (arg0) {
            field1899.glEnableClientState(32885);
        } else {
            field1899.glDisableClientState(32885);
        }
        field1917 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "()V", line = 678)
    public static final void method764() {
        if (field1902) {
            field1899.glMatrixMode(5890);
            field1899.glLoadIdentity();
            field1899.glMatrixMode(5888);
            field1902 = false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V", line = 691)
    public static final void method765(int arg0) {
        if (field1910 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1899.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field1899.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field1899.glTexEnvi(8960, 34162, 260);
        }
        field1910 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V", line = 706)
    public static final void method766(int arg0) {
        if (field1906 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1899.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field1899.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field1899.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field1899.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field1899.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field1899.glTexEnvi(8960, 34161, 34165);
        }
        field1906 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "()V", line = 733)
    public static final void method767() {
        field1899.glDepthMask(true);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(Z)V", line = 740)
    public static final void method768(boolean arg0) {
        if (field1915 == arg0) {
            return;
        }
        if (arg0) {
            field1899.glEnable(2912);
        } else {
            field1899.glDisable(2912);
        }
        field1915 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "()V", line = 753)
    public static final void method769() {
        field1899.glDepthMask(false);
    }

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "()V", line = 759)
    public static void method770() {
        field1898 = null;
        field1907 = null;
        field1908 = null;
        field1899 = null;
        field1913 = null;
        field1920 = null;
        field1893 = null;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(Z)V", line = 771)
    public static final void method771(boolean arg0) {
        if (field1909 == arg0) {
            return;
        }
        if (arg0) {
            field1899.glEnable(2896);
        } else {
            field1899.glDisable(2896);
        }
        field1909 = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "()V", line = 785)
    public static final void method772() {
        class257.method1832((byte) 87, 0, 0);
        method738();
        method766(0);
        method765(0);
        method771(false);
        method747(false);
        method768(false);
        method764();
    }
}
