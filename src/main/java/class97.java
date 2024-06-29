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

@OriginalClass("client!q")
public class class97 {

    @OriginalMember(owner = "client!q", name = "e", descriptor = "F")
    private static float field1802 = 0.09765625F;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Z")
    private static boolean field1807 = true;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Z")
    private static boolean field1804 = true;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Z")
    private static boolean field1800 = false;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field1816 = 0;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Lud;")
    private static class279 field1819 = class130.method1024("radeon", 255);

    @OriginalMember(owner = "client!q", name = "r", descriptor = "Z")
    private static boolean field1815 = false;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Z")
    private static boolean field1820 = true;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "[F")
    private static float[] field1829 = new float[16];

    @OriginalMember(owner = "client!q", name = "C", descriptor = "F")
    private static float field1826 = 0.0F;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    private static int field1830 = -1;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    private static int field1822 = 0;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "F")
    private static float field1828 = 0.0F;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Z")
    public static boolean field1824 = false;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    private static int field1832 = 0;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "Z")
    public static boolean field1834 = true;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "F")
    private static float field1805;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "F")
    private static float field1823;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    private static int field1817;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    private static int field1827;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    private static int field1833;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Ljava/lang/String;")
    private static String field1798;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Ljava/lang/String;")
    private static String field1803;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field1801;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field1818;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field1825;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Z")
    public static boolean field1799;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Z")
    public static boolean field1806;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Z")
    public static boolean field1808;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Z")
    public static boolean field1810;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
    public static boolean field1811;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "Z")
    public static boolean field1813;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Z")
    public static boolean field1814;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 14)
    public static final void method803(int arg0) {
        if (field1830 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field1801.glDisable(3553);
        } else {
            if (field1830 == -1) {
                field1801.glEnable(3553);
            }
            field1801.glBindTexture(3553, arg0);
        }
        field1830 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIFFII)V", line = 32)
    public static final void method804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field1801.glMatrixMode(5889);
        field1801.glLoadIdentity();
        method819((float) var10 * field1802, (float) var11 * field1802, (float) (-var13) * field1802, (float) (-var12) * field1802, 50.0F, 3584.0F);
        field1801.glViewport(arg0, field1809 - arg1 - arg3, arg2, arg3);
        field1801.glMatrixMode(5888);
        field1801.glLoadIdentity();
        field1801.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field1801.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field1801.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field1800 = false;
        class12.field383 = var10;
        class141.field2568 = var11;
        class222.field3936 = var12;
        class16.field518 = var13;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)V", line = 65)
    public static final void method805(int arg0, int arg1, int arg2, int arg3) {
        method804(0, 0, field1831, field1809, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 73)
    public static final int method806(Canvas arg0, int arg1) {
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
            field1825 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field1825.setRealized(true);
            int var4 = 0;
            while (true) {
                field1818 = field1825.createContext((GLContext) null);
                try {
                    int var5 = field1818.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class204.method1510(1000L, 1);
            }
            field1801 = field1818.getGL();
            new GLU();
            field1824 = true;
            field1831 = arg0.getSize().width;
            field1809 = arg0.getSize().height;
            int var7 = method813();
            if (var7 != 0) {
                method810();
                return var7;
            }
            method828();
            method837();
            field1801.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field1825.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method810();
                        return -3;
                    }
                    class204.method1510(100L, 1);
                }
            }
            field1801.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method810();
            return -5;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V", line = 157)
    public static final void method807() {
        class162.method1279(0, 0, 0);
        method840();
        method835(0);
        method811(0);
        method818(false);
        method839(false);
        method822(false);
        method829();
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "()V", line = 167)
    public static final void method808() {
        if (class126.field2340) {
            method818(true);
            method826(true);
        } else {
            method818(false);
            method826(false);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "()V", line = 180)
    public static final void method809() {
        class162.method1279(0, 0, 0);
        method840();
        method835(0);
        method811(0);
        method818(false);
        method839(false);
        method822(false);
        method829();
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "()V", line = 191)
    public static final void method810() {
        if (field1801 != null) {
            try {
                class169.method1317(1);
            } catch (Throwable var7) {
            }
            field1801 = null;
        }
        if (field1818 != null) {
            class308.method2194();
            try {
                if (GLContext.getCurrent() == field1818) {
                    field1818.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field1818.destroy();
            } catch (Throwable var5) {
            }
            field1818 = null;
        }
        if (field1825 != null) {
            try {
                field1825.setRealized(false);
            } catch (Throwable var4) {
            }
            field1825 = null;
        }
        class30.method284();
        field1824 = false;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 239)
    public static final void method811(int arg0) {
        if (field1832 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1801.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field1801.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field1801.glTexEnvi(8960, 34162, 260);
        }
        field1832 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIII)V", line = 255)
    public static final void method812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field1831 - arg0;
        int var8 = -arg1;
        int var9 = field1809 - arg1;
        field1801.glMatrixMode(5889);
        field1801.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field1801.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field1801.glViewport(0, 0, field1831, field1809);
        field1801.glMatrixMode(5888);
        field1801.glLoadIdentity();
        field1801.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field1800 = false;
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "()I", line = 281)
    private static final int method813() {
        int var0 = 0;
        field1798 = field1801.glGetString(7936);
        field1803 = field1801.glGetString(7937);
        String var1 = field1798.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field1801.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field1827 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field1827 < 12) {
            var0 |= 0x2;
        }
        if (!field1801.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field1801.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field1801.glGetIntegerv(34018, var7, 0);
        field1821 = var7[0];
        field1801.glGetIntegerv(34929, var7, 0);
        field1833 = var7[0];
        field1801.glGetIntegerv(34930, var7, 0);
        field1817 = var7[0];
        if (field1821 < 2 || field1833 < 2 || field1817 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field1808 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field1814 = field1801.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field1811 = field1801.isExtensionAvailable("GL_ARB_multisample");
        field1810 = field1801.isExtensionAvailable("GL_ARB_texture_cube_map");
        field1813 = field1801.isExtensionAvailable("GL_ARB_vertex_program");
        field1799 = field1801.isExtensionAvailable("GL_EXT_texture3D");
        class279 var8 = method815(field1803).method2002((byte) -94);
        if (var8.method1989(field1819, (byte) -72) != -1) {
            int var9 = 0;
            class279[] var10 = var8.method1997(32, 47, false).method1978(32, 0);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class279 var12 = var10[var11];
                if (var12.method1984(8) >= 4 && var12.method2009((byte) -84, 0, 4).method2015(28444)) {
                    var9 = var12.method2009((byte) -84, 0, 4).method2011(10);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field1814 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field1799 = false;
            }
            field1806 = field1814;
        }
        if (field1814) {
            try {
                int[] var13 = new int[1];
                field1801.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "()V", line = 395)
    public static final void method814() {
        class162.method1279(0, 0, 0);
        method840();
        method835(1);
        method811(1);
        method818(false);
        method839(false);
        method822(false);
        method829();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;)Lud;", line = 407)
    private static final class279 method815(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class194.method1457(0, var1.length, var1, false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V", line = 415)
    public static final void method816(int arg0, int arg1) {
        field1831 = arg0;
        field1809 = arg1;
        field1800 = false;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V", line = 422)
    public static final void method817(int arg0) {
        field1801.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1801.glClear(16640);
        field1801.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 427)
    public static final void method818(boolean arg0) {
        if (field1807 == arg0) {
            return;
        }
        if (arg0) {
            field1801.glEnable(2896);
        } else {
            field1801.glDisable(2896);
        }
        field1807 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFFFFF)V", line = 440)
    private static final void method819(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field1829[0] = var6 / (arg1 - arg0);
        field1829[1] = 0.0F;
        field1829[2] = 0.0F;
        field1829[3] = 0.0F;
        field1829[4] = 0.0F;
        field1829[5] = var6 / (arg3 - arg2);
        field1829[6] = 0.0F;
        field1829[7] = 0.0F;
        field1829[8] = (arg0 + arg1) / (arg1 - arg0);
        field1829[9] = (arg2 + arg3) / (arg3 - arg2);
        field1829[10] = field1823 = -(arg4 + arg5) / (arg5 - arg4);
        field1829[11] = -1.0F;
        field1829[12] = 0.0F;
        field1829[13] = 0.0F;
        field1829[14] = field1805 = -(arg5 * var6) / (arg5 - arg4);
        field1829[15] = 0.0F;
        field1801.glLoadMatrixf(field1829, 0);
        field1826 = 0.0F;
        field1828 = 0.0F;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 468)
    public static final void method820(Canvas arg0) {
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

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FFF)V", line = 495)
    public static final void method821(float arg0, float arg1, float arg2) {
        field1801.glMatrixMode(5890);
        if (field1815) {
            field1801.glLoadIdentity();
        }
        field1801.glTranslatef(arg0, arg1, arg2);
        field1801.glMatrixMode(5888);
        field1815 = true;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V", line = 504)
    public static final void method822(boolean arg0) {
        if (field1820 == arg0) {
            return;
        }
        if (arg0) {
            field1801.glEnable(2912);
        } else {
            field1801.glDisable(2912);
        }
        field1820 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "()V", line = 519)
    public static final void method823() {
        try {
            field1825.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "()V", line = 526)
    public static final void method824() {
        field1801.glDepthMask(true);
    }

    @OriginalMember(owner = "client!q", name = "i", descriptor = "()V", line = 529)
    public static void method825() {
        field1819 = null;
        field1803 = null;
        field1798 = null;
        field1801 = null;
        field1825 = null;
        field1818 = null;
        field1829 = null;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(Z)V", line = 540)
    private static final void method826(boolean arg0) {
        if (field1834 == arg0) {
            return;
        }
        if (arg0) {
            field1801.glEnableClientState(32885);
        } else {
            field1801.glDisableClientState(32885);
        }
        field1834 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(FF)V", line = 558)
    public static final void method827(float arg0, float arg1) {
        if (field1800 || field1826 == arg0 && field1828 == arg1) {
            return;
        }
        field1826 = arg0;
        field1828 = arg1;
        if (arg1 == 0.0F) {
            field1829[10] = field1823;
            field1829[14] = field1805;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field1805 * (1.0F - var2) / arg1;
            field1829[10] = field1823 + var4;
            field1829[14] = field1805 * var3;
        }
        field1801.glMatrixMode(5889);
        field1801.glLoadMatrixf(field1829, 0);
        field1801.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!q", name = "j", descriptor = "()V", line = 597)
    private static final void method828() {
        int[] var0 = new int[1];
        field1801.glGenTextures(1, var0, 0);
        field1812 = var0[0];
        field1801.glBindTexture(3553, field1812);
        field1801.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class30.method274();
        class230.method1664(true);
    }

    @OriginalMember(owner = "client!q", name = "k", descriptor = "()V", line = 618)
    public static final void method829() {
        if (field1815) {
            field1801.glMatrixMode(5890);
            field1801.glLoadIdentity();
            field1801.glMatrixMode(5888);
            field1815 = false;
        }
    }

    @OriginalMember(owner = "client!q", name = "l", descriptor = "()F", line = 629)
    public static final float method830() {
        return field1828;
    }

    @OriginalMember(owner = "client!q", name = "m", descriptor = "()V", line = 636)
    public static final void method831() {
        field1801.glDepthMask(false);
    }

    @OriginalMember(owner = "client!q", name = "n", descriptor = "()V", line = 648)
    public static final void method832() {
        field1801.glClear(256);
    }

    @OriginalMember(owner = "client!q", name = "o", descriptor = "()V", line = 657)
    public static final void method833() {
        class162.method1279(0, 0, 0);
        method840();
        method803(-1);
        method818(false);
        method839(false);
        method822(false);
        method829();
    }

    @OriginalMember(owner = "client!q", name = "p", descriptor = "()F", line = 666)
    public static final float method834() {
        return field1826;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V", line = 670)
    public static final void method835(int arg0) {
        if (field1822 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1801.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field1801.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field1801.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field1801.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field1801.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field1801.glTexEnvi(8960, 34161, 34165);
        }
        field1822 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "q", descriptor = "()V", line = 696)
    public static final void method836() {
        int[] var0 = new int[2];
        field1801.glGetIntegerv(3073, var0, 0);
        field1801.glGetIntegerv(3074, var0, 1);
        field1801.glDrawBuffer(1026);
        field1801.glReadBuffer(1024);
        method803(-1);
        field1801.glPushAttrib(8192);
        field1801.glDisable(2912);
        field1801.glDisable(3042);
        field1801.glDisable(2929);
        field1801.glDisable(3008);
        field1801.glRasterPos2i(0, 0);
        field1801.glCopyPixels(0, 0, field1831, field1809, 6144);
        field1801.glPopAttrib();
        field1801.glDrawBuffer(var0[0]);
        field1801.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!q", name = "r", descriptor = "()V", line = 719)
    private static final void method837() {
        field1800 = false;
        field1801.glDisable(3553);
        field1830 = -1;
        field1801.glTexEnvi(8960, 8704, 34160);
        field1801.glTexEnvi(8960, 34161, 8448);
        field1822 = 0;
        field1801.glTexEnvi(8960, 34162, 8448);
        field1832 = 0;
        field1801.glEnable(2896);
        field1801.glEnable(2912);
        field1801.glEnable(2929);
        field1807 = true;
        field1804 = true;
        field1820 = true;
        class132.method1038(-1);
        field1801.glActiveTexture(33985);
        field1801.glTexEnvi(8960, 8704, 34160);
        field1801.glTexEnvi(8960, 34161, 8448);
        field1801.glTexEnvi(8960, 34162, 8448);
        field1801.glActiveTexture(33984);
        field1801.setSwapInterval(0);
        field1801.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field1801.glShadeModel(7425);
        field1801.glClearDepth(1.0D);
        field1801.glDepthFunc(515);
        method824();
        field1801.glMatrixMode(5890);
        field1801.glLoadIdentity();
        field1801.glPolygonMode(1028, 6914);
        field1801.glEnable(2884);
        field1801.glCullFace(1029);
        field1801.glEnable(3042);
        field1801.glBlendFunc(770, 771);
        field1801.glEnable(3008);
        field1801.glAlphaFunc(516, 0.0F);
        field1801.glEnableClientState(32884);
        field1801.glEnableClientState(32885);
        field1834 = true;
        field1801.glEnableClientState(32886);
        field1801.glEnableClientState(32888);
        field1801.glMatrixMode(5888);
        field1801.glLoadIdentity();
        class219.method1604();
        class30.method279();
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(F)V", line = 765)
    public static final void method838(float arg0) {
        method827(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(Z)V", line = 775)
    public static final void method839(boolean arg0) {
        if (field1804 == arg0) {
            return;
        }
        if (arg0) {
            field1801.glEnable(2929);
        } else {
            field1801.glDisable(2929);
        }
        field1804 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "s", descriptor = "()V", line = 787)
    private static final void method840() {
        if (field1800) {
            return;
        }
        field1801.glMatrixMode(5889);
        field1801.glLoadIdentity();
        field1801.glOrtho(0.0D, (double) field1831, 0.0D, (double) field1809, -1.0D, 1.0D);
        field1801.glViewport(0, 0, field1831, field1809);
        field1801.glMatrixMode(5888);
        field1801.glLoadIdentity();
        field1800 = true;
    }
}
