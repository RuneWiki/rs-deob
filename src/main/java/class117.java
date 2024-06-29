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

@OriginalClass("client!mm")
public class class117 {

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    private static int field1794 = 0;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "[F")
    private static float[] field1800 = new float[16];

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Z")
    private static boolean field1796 = false;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "Z")
    public static boolean field1797 = true;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Z")
    private static boolean field1792 = true;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Z")
    private static boolean field1786 = true;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    private static int field1814 = 0;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "F")
    private static float field1804 = 0.0F;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "Z")
    public static boolean field1817 = false;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    public static int field1818 = 0;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "F")
    private static float field1813 = 0.0F;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    private static int field1815 = -1;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "F")
    private static float field1820 = 0.09765625F;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "Z")
    private static boolean field1819 = true;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "Z")
    private static boolean field1806 = false;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "F")
    private static float field1793;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "F")
    private static float field1795;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    private static int field1787;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    private static int field1809;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
    private static int field1816;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Ljava/lang/String;")
    private static String field1798;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "Ljava/lang/String;")
    private static String field1812;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field1801;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field1789;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field1808;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Z")
    public static boolean field1790;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "Z")
    public static boolean field1802;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "Z")
    public static boolean field1803;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "Z")
    public static boolean field1805;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "Z")
    public static boolean field1810;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "Z")
    public static boolean field1811;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "Z")
    public static boolean field1821;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(F)V", line = 18)
    public static final void method801(float arg0) {
        method828(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()V", line = 22)
    public static final void method802() {
        field1801.glClear(256);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "()V", line = 25)
    public static final void method803() {
        class204.method1397(-118, 0, 0);
        method811();
        method809(0);
        method823(0);
        method830(false);
        method810(false);
        method818(false);
        method821();
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "()V", line = 36)
    public static final void method804() {
        class204.method1397(-113, 0, 0);
        method811();
        method809(0);
        method823(0);
        method830(false);
        method810(false);
        method818(false);
        method821();
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "()V", line = 46)
    public static void method805() {
        field1798 = null;
        field1812 = null;
        field1801 = null;
        field1808 = null;
        field1789 = null;
        field1800 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V", line = 54)
    public static final void method806(int arg0, int arg1, int arg2, int arg3) {
        method822(0, 0, field1791, field1807, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 58)
    public static final void method807(int arg0) {
        field1801.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1801.glClear(16640);
        field1801.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "()V", line = 65)
    public static final void method808() {
        if (class292.field4447) {
            method830(true);
            method816(true);
        } else {
            method830(false);
            method816(false);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 82)
    public static final void method809(int arg0) {
        if (field1814 == arg0) {
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
        field1814 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 107)
    public static final void method810(boolean arg0) {
        if (field1792 == arg0) {
            return;
        }
        if (arg0) {
            field1801.glEnable(2929);
        } else {
            field1801.glDisable(2929);
        }
        field1792 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "()V", line = 118)
    private static final void method811() {
        if (field1806) {
            return;
        }
        field1801.glMatrixMode(5889);
        field1801.glLoadIdentity();
        field1801.glOrtho(0.0D, (double) field1791, 0.0D, (double) field1807, -1.0D, 1.0D);
        field1801.glViewport(0, 0, field1791, field1807);
        field1801.glMatrixMode(5888);
        field1801.glLoadIdentity();
        field1806 = true;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII)V", line = 136)
    public static final void method812(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field1791 - arg0;
        int var8 = -arg1;
        int var9 = field1807 - arg1;
        field1801.glMatrixMode(5889);
        field1801.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field1801.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field1801.glViewport(0, 0, field1791, field1807);
        field1801.glMatrixMode(5888);
        field1801.glLoadIdentity();
        field1801.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field1806 = false;
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "()I", line = 160)
    private static final int method813() {
        int var0 = 0;
        field1812 = field1801.glGetString(7936);
        field1798 = field1801.glGetString(7937);
        String var1 = field1812.toLowerCase();
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
                field1809 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field1809 < 12) {
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
        field1799 = var7[0];
        field1801.glGetIntegerv(34929, var7, 0);
        field1816 = var7[0];
        field1801.glGetIntegerv(34930, var7, 0);
        field1787 = var7[0];
        if (field1799 < 2 || field1816 < 2 || field1787 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field1811 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field1802 = field1801.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field1821 = field1801.isExtensionAvailable("GL_ARB_multisample");
        field1810 = field1801.isExtensionAvailable("GL_ARB_texture_cube_map");
        field1790 = field1801.isExtensionAvailable("GL_ARB_vertex_program");
        field1803 = field1801.isExtensionAvailable("GL_EXT_texture3D");
        String var8 = field1798.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            String[] var10 = class257.method1745(var8.replace('/', ' '), (byte) -73, ' ');
            for (int var11 = 0; var11 < var10.length; var11++) {
                String var12 = var10[var11];
                if (var12.length() >= 4 && class169.method1175(16, var12.substring(0, 4))) {
                    var9 = class286.method1991(-106, var12.substring(0, 4));
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field1802 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field1803 = false;
            }
            field1805 = field1802;
        }
        if (field1802) {
            try {
                int[] var13 = new int[1];
                field1801.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 271)
    public static final void method814(int arg0) {
        if (field1815 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field1801.glDisable(3553);
        } else {
            if (field1815 == -1) {
                field1801.glEnable(3553);
            }
            field1801.glBindTexture(3553, arg0);
        }
        field1815 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "()V", line = 289)
    public static final void method815() {
        class204.method1397(-65, 0, 0);
        method811();
        method814(-1);
        method830(false);
        method810(false);
        method818(false);
        method821();
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V", line = 300)
    private static final void method816(boolean arg0) {
        if (field1797 == arg0) {
            return;
        }
        if (arg0) {
            field1801.glEnableClientState(32885);
        } else {
            field1801.glDisableClientState(32885);
        }
        field1797 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "()V", line = 314)
    public static final void method817() {
        if (field1801 != null) {
            try {
                class302.method2095(0);
            } catch (Throwable var7) {
            }
            field1801 = null;
        }
        if (field1789 != null) {
            class174.method1211();
            try {
                if (GLContext.getCurrent() == field1789) {
                    field1789.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field1789.destroy();
            } catch (Throwable var5) {
            }
            field1789 = null;
        }
        if (field1808 != null) {
            try {
                field1808.setRealized(false);
            } catch (Throwable var4) {
            }
            field1808 = null;
        }
        class31.method214();
        field1817 = false;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(Z)V", line = 372)
    public static final void method818(boolean arg0) {
        if (field1819 == arg0) {
            return;
        }
        if (arg0) {
            field1801.glEnable(2912);
        } else {
            field1801.glDisable(2912);
        }
        field1819 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 387)
    public static final int method819(Canvas arg0, int arg1) {
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
            field1808 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field1808.setRealized(true);
            int var4 = 0;
            while (true) {
                field1789 = field1808.createContext((GLContext) null);
                try {
                    int var5 = field1789.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class93.method662(-553, 1000L);
            }
            field1801 = field1789.getGL();
            new GLU();
            field1817 = true;
            field1791 = arg0.getSize().width;
            field1807 = arg0.getSize().height;
            int var7 = method813();
            if (var7 != 0) {
                method817();
                return var7;
            }
            method834();
            method837();
            field1801.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field1808.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method817();
                        return -3;
                    }
                    class93.method662(-553, 100L);
                }
            }
            field1801.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method817();
            return -5;
        }
    }

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "()F", line = 474)
    public static final float method820() {
        return field1804;
    }

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "()V", line = 478)
    public static final void method821() {
        if (field1796) {
            field1801.glMatrixMode(5890);
            field1801.glLoadIdentity();
            field1801.glMatrixMode(5888);
            field1796 = false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIFFII)V", line = 489)
    public static final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field1801.glMatrixMode(5889);
        field1801.glLoadIdentity();
        method825((float) var10 * field1820, (float) var11 * field1820, (float) (-var13) * field1820, (float) (-var12) * field1820, 50.0F, 3584.0F);
        field1801.glViewport(arg0, field1807 - arg1 - arg3, arg2, arg3);
        field1801.glMatrixMode(5888);
        field1801.glLoadIdentity();
        field1801.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field1801.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field1801.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field1806 = false;
        class161.field2418 = var10;
        class300.field4591 = var11;
        class169.field2532 = var12;
        class104.field1646 = var13;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V", line = 516)
    public static final void method823(int arg0) {
        if (field1794 == arg0) {
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
        field1794 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "()F", line = 538)
    public static final float method824() {
        return field1813;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(FFFFFF)V", line = 542)
    private static final void method825(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field1800[0] = var6 / (arg1 - arg0);
        field1800[1] = 0.0F;
        field1800[2] = 0.0F;
        field1800[3] = 0.0F;
        field1800[4] = 0.0F;
        field1800[5] = var6 / (arg3 - arg2);
        field1800[6] = 0.0F;
        field1800[7] = 0.0F;
        field1800[8] = (arg0 + arg1) / (arg1 - arg0);
        field1800[9] = (arg2 + arg3) / (arg3 - arg2);
        field1800[10] = field1795 = -(arg4 + arg5) / (arg5 - arg4);
        field1800[11] = -1.0F;
        field1800[12] = 0.0F;
        field1800[13] = 0.0F;
        field1800[14] = field1793 = -(arg5 * var6) / (arg5 - arg4);
        field1800[15] = 0.0F;
        field1801.glLoadMatrixf(field1800, 0);
        field1804 = 0.0F;
        field1813 = 0.0F;
    }

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "()V", line = 565)
    public static final void method826() {
        try {
            field1808.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "()V", line = 577)
    public static final void method827() {
        int[] var0 = new int[2];
        field1801.glGetIntegerv(3073, var0, 0);
        field1801.glGetIntegerv(3074, var0, 1);
        field1801.glDrawBuffer(1026);
        field1801.glReadBuffer(1024);
        method814(-1);
        field1801.glPushAttrib(8192);
        field1801.glDisable(2912);
        field1801.glDisable(3042);
        field1801.glDisable(2929);
        field1801.glDisable(3008);
        field1801.glRasterPos2i(0, 0);
        field1801.glCopyPixels(0, 0, field1791, field1807, 6144);
        field1801.glPopAttrib();
        field1801.glDrawBuffer(var0[0]);
        field1801.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(FF)V", line = 603)
    public static final void method828(float arg0, float arg1) {
        if (field1806 || field1804 == arg0 && field1813 == arg1) {
            return;
        }
        field1804 = arg0;
        field1813 = arg1;
        if (arg1 == 0.0F) {
            field1800[10] = field1795;
            field1800[14] = field1793;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field1793 * (1.0F - var2) / arg1;
            field1800[10] = field1795 + var4;
            field1800[14] = field1793 * var3;
        }
        field1801.glMatrixMode(5889);
        field1801.glLoadMatrixf(field1800, 0);
        field1801.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "()V", line = 633)
    public static final void method829() {
        field1801.glDepthMask(true);
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(Z)V", line = 639)
    public static final void method830(boolean arg0) {
        if (field1786 == arg0) {
            return;
        }
        if (arg0) {
            field1801.glEnable(2896);
        } else {
            field1801.glDisable(2896);
        }
        field1786 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "()V", line = 652)
    public static final void method831() {
        field1801.glDepthMask(false);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 655)
    public static final void method832(int arg0, int arg1) {
        field1791 = arg0;
        field1807 = arg1;
        field1806 = false;
    }

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "()V", line = 660)
    public static final void method833() {
        class204.method1397(-116, 0, 0);
        method811();
        method809(1);
        method823(1);
        method830(false);
        method810(false);
        method818(false);
        method821();
    }

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "()V", line = 673)
    private static final void method834() {
        int[] var0 = new int[1];
        field1801.glGenTextures(1, var0, 0);
        field1788 = var0[0];
        field1801.glBindTexture(3553, field1788);
        field1801.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class31.method208();
        class206.method1416(9);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 692)
    public static final void method835(Canvas arg0) {
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

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(FFF)V", line = 717)
    public static final void method836(float arg0, float arg1, float arg2) {
        field1801.glMatrixMode(5890);
        if (field1796) {
            field1801.glLoadIdentity();
        }
        field1801.glTranslatef(arg0, arg1, arg2);
        field1801.glMatrixMode(5888);
        field1796 = true;
    }

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "()V", line = 739)
    private static final void method837() {
        field1806 = false;
        field1801.glDisable(3553);
        field1815 = -1;
        field1801.glTexEnvi(8960, 8704, 34160);
        field1801.glTexEnvi(8960, 34161, 8448);
        field1814 = 0;
        field1801.glTexEnvi(8960, 34162, 8448);
        field1794 = 0;
        field1801.glEnable(2896);
        field1801.glEnable(2912);
        field1801.glEnable(2929);
        field1786 = true;
        field1792 = true;
        field1819 = true;
        class20.method126(true);
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
        method829();
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
        field1797 = true;
        field1801.glEnableClientState(32886);
        field1801.glEnableClientState(32888);
        field1801.glMatrixMode(5888);
        field1801.glLoadIdentity();
        class280.method1955();
        class31.method205();
    }
}
