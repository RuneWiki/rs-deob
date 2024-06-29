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

@OriginalClass("client!mi")
public class class99 {

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    private static int field1664 = 0;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "F")
    private static float field1666 = 0.0F;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "F")
    private static float field1665 = 0.0F;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "[F")
    private static float[] field1667 = new float[16];

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "Z")
    public static boolean field1675 = false;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Z")
    private static boolean field1674 = false;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field1671 = 0;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Z")
    private static boolean field1679 = true;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    private static int field1677 = 0;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Z")
    private static boolean field1683 = false;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "F")
    private static float field1691 = 0.09765625F;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "Z")
    public static boolean field1669 = true;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "Lph;")
    private static class229 field1686 = class266.method1858("radeon", 0);

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "Z")
    private static boolean field1692 = true;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "Z")
    private static boolean field1696 = true;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    private static int field1676 = -1;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "F")
    private static float field1670;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "F")
    private static float field1684;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    private static int field1663;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    private static int field1672;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    private static int field1697;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Ljava/lang/String;")
    private static String field1673;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "Ljava/lang/String;")
    private static String field1693;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field1682;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field1681;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field1698;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Z")
    public static boolean field1662;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Z")
    public static boolean field1668;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Z")
    public static boolean field1678;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "Z")
    public static boolean field1687;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "Z")
    public static boolean field1689;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "Z")
    public static boolean field1690;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Z")
    public static boolean field1695;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 11)
    public static final void method728(Canvas arg0) {
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

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V", line = 32)
    public static final void method729() {
        int[] var0 = new int[2];
        field1682.glGetIntegerv(3073, var0, 0);
        field1682.glGetIntegerv(3074, var0, 1);
        field1682.glDrawBuffer(1026);
        field1682.glReadBuffer(1024);
        method749(-1);
        field1682.glPushAttrib(8192);
        field1682.glDisable(2912);
        field1682.glDisable(3042);
        field1682.glDisable(2929);
        field1682.glDisable(3008);
        field1682.glRasterPos2i(0, 0);
        field1682.glCopyPixels(0, 0, field1680, field1685, 6144);
        field1682.glPopAttrib();
        field1682.glDrawBuffer(var0[0]);
        field1682.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 50)
    public static final void method730(boolean arg0) {
        if (field1679 == arg0) {
            return;
        }
        if (arg0) {
            field1682.glEnable(2896);
        } else {
            field1682.glDisable(2896);
        }
        field1679 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V", line = 62)
    private static final void method731(boolean arg0) {
        if (field1669 == arg0) {
            return;
        }
        if (arg0) {
            field1682.glEnableClientState(32885);
        } else {
            field1682.glDisableClientState(32885);
        }
        field1669 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()V", line = 79)
    public static final void method732() {
        if (field1682 != null) {
            try {
                class51.method358((byte) 72);
            } catch (Throwable var7) {
            }
            field1682 = null;
        }
        if (field1681 != null) {
            class274.method1900();
            try {
                if (GLContext.getCurrent() == field1681) {
                    field1681.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field1681.destroy();
            } catch (Throwable var5) {
            }
            field1681 = null;
        }
        if (field1698 != null) {
            try {
                field1698.setRealized(false);
            } catch (Throwable var4) {
            }
            field1698 = null;
        }
        class62.method428();
        field1675 = false;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()F", line = 131)
    public static final float method733() {
        return field1666;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(Z)V", line = 134)
    public static final void method734(boolean arg0) {
        if (field1692 == arg0) {
            return;
        }
        if (arg0) {
            field1682.glEnable(2929);
        } else {
            field1682.glDisable(2929);
        }
        field1692 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()V", line = 145)
    public static final void method735() {
        class285.method1964(111, 0, 0);
        method762();
        method758(0);
        method765(0);
        method730(false);
        method734(false);
        method736(false);
        method750();
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(Z)V", line = 159)
    public static final void method736(boolean arg0) {
        if (field1696 == arg0) {
            return;
        }
        if (arg0) {
            field1682.glEnable(2912);
        } else {
            field1682.glDisable(2912);
        }
        field1696 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V", line = 174)
    public static final void method737(int arg0, int arg1) {
        field1680 = arg0;
        field1685 = arg1;
        field1674 = false;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;)Lph;", line = 181)
    private static final class229 method738(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class27.method184((byte) 95, var1, var1.length, 0);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FF)V", line = 189)
    public static final void method739(float arg0, float arg1) {
        if (field1674 || field1666 == arg0 && field1665 == arg1) {
            return;
        }
        field1666 = arg0;
        field1665 = arg1;
        if (arg1 == 0.0F) {
            field1667[10] = field1684;
            field1667[14] = field1670;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field1670 * (1.0F - var2) / arg1;
            field1667[10] = field1684 + var4;
            field1667[14] = field1670 * var3;
        }
        field1682.glMatrixMode(5889);
        field1682.glLoadMatrixf(field1667, 0);
        field1682.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFFFFF)V", line = 221)
    private static final void method740(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field1667[0] = var6 / (arg1 - arg0);
        field1667[1] = 0.0F;
        field1667[2] = 0.0F;
        field1667[3] = 0.0F;
        field1667[4] = 0.0F;
        field1667[5] = var6 / (arg3 - arg2);
        field1667[6] = 0.0F;
        field1667[7] = 0.0F;
        field1667[8] = (arg0 + arg1) / (arg1 - arg0);
        field1667[9] = (arg2 + arg3) / (arg3 - arg2);
        field1667[10] = field1684 = -(arg4 + arg5) / (arg5 - arg4);
        field1667[11] = -1.0F;
        field1667[12] = 0.0F;
        field1667[13] = 0.0F;
        field1667[14] = field1670 = -(arg5 * var6) / (arg5 - arg4);
        field1667[15] = 0.0F;
        field1682.glLoadMatrixf(field1667, 0);
        field1666 = 0.0F;
        field1665 = 0.0F;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(F)V", line = 243)
    public static final void method741(float arg0) {
        method739(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "()V", line = 250)
    public static void method742() {
        field1686 = null;
        field1673 = null;
        field1693 = null;
        field1682 = null;
        field1698 = null;
        field1681 = null;
        field1667 = null;
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "()V", line = 260)
    public static final void method743() {
        field1682.glDepthMask(false);
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "()V", line = 265)
    public static final void method744() {
        class285.method1964(117, 0, 0);
        method762();
        method749(-1);
        method730(false);
        method734(false);
        method736(false);
        method750();
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "()V", line = 279)
    public static final void method745() {
        try {
            field1698.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)V", line = 286)
    public static final void method746(int arg0, int arg1, int arg2, int arg3) {
        method763(0, 0, field1680, field1685, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 299)
    public static final void method747(int arg0) {
        field1682.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1682.glClear(16640);
        field1682.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "()V", line = 309)
    private static final void method748() {
        int[] var0 = new int[1];
        field1682.glGenTextures(1, var0, 0);
        field1694 = var0[0];
        field1682.glBindTexture(3553, field1694);
        field1682.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class40.method304(-114);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 320)
    public static final void method749(int arg0) {
        if (field1676 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field1682.glDisable(3553);
        } else {
            if (field1676 == -1) {
                field1682.glEnable(3553);
            }
            field1682.glBindTexture(3553, arg0);
        }
        field1676 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "()V", line = 340)
    public static final void method750() {
        if (field1683) {
            field1682.glMatrixMode(5890);
            field1682.glLoadIdentity();
            field1682.glMatrixMode(5888);
            field1683 = false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "()V", line = 355)
    public static final void method751() {
        field1682.glClear(256);
    }

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "()V", line = 358)
    public static final void method752() {
        class285.method1964(113, 0, 0);
        method762();
        method758(1);
        method765(1);
        method730(false);
        method734(false);
        method736(false);
        method750();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 369)
    public static final int method753(Canvas arg0, int arg1) {
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
            field1698 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field1698.setRealized(true);
            int var4 = 0;
            while (true) {
                field1681 = field1698.createContext((GLContext) null);
                try {
                    int var5 = field1681.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class288.method1976((byte) 75, 1000L);
            }
            field1682 = field1681.getGL();
            new GLU();
            field1675 = true;
            field1680 = arg0.getSize().width;
            field1685 = arg0.getSize().height;
            int var7 = method754();
            if (var7 != 0) {
                method732();
                return var7;
            }
            method748();
            method757();
            field1682.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field1698.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method732();
                        return -3;
                    }
                    class288.method1976((byte) 48, 100L);
                }
            }
            field1682.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method732();
            return -5;
        }
    }

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "()I", line = 474)
    private static final int method754() {
        int var0 = 0;
        field1693 = field1682.glGetString(7936);
        field1673 = field1682.glGetString(7937);
        String var1 = field1693.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field1682.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field1663 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field1663 < 12) {
            var0 |= 0x2;
        }
        if (!field1682.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field1682.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field1682.glGetIntegerv(34018, var7, 0);
        field1688 = var7[0];
        field1682.glGetIntegerv(34929, var7, 0);
        field1697 = var7[0];
        field1682.glGetIntegerv(34930, var7, 0);
        field1672 = var7[0];
        if (field1688 < 2 || field1697 < 2 || field1672 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field1678 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field1689 = field1682.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field1690 = field1682.isExtensionAvailable("GL_ARB_multisample");
        field1662 = field1682.isExtensionAvailable("GL_ARB_texture_cube_map");
        field1695 = field1682.isExtensionAvailable("GL_ARB_vertex_program");
        field1668 = field1682.isExtensionAvailable("GL_EXT_texture3D");
        class229 var8 = method738(field1673).method1616(-985019996);
        if (var8.method1611(field1686, 24104) != -1) {
            int var9 = 0;
            class229[] var10 = var8.method1643(47, 32, (byte) -65).method1637(32, (byte) 101);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class229 var12 = var10[var11];
                if (var12.method1642(62) >= 4 && var12.method1623(0, -30201, 4).method1641(10)) {
                    var9 = var12.method1623(0, -30201, 4).method1619(10);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field1689 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field1668 = false;
            }
            field1687 = field1689;
        }
        if (field1689) {
            try {
                int[] var13 = new int[1];
                field1682.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "()V", line = 581)
    public static final void method755() {
        field1682.glDepthMask(true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V", line = 585)
    public static final void method756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field1680 - arg0;
        int var8 = -arg1;
        int var9 = field1685 - arg1;
        field1682.glMatrixMode(5889);
        field1682.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field1682.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field1682.glViewport(0, 0, field1680, field1685);
        field1682.glMatrixMode(5888);
        field1682.glLoadIdentity();
        field1682.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field1674 = false;
    }

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "()V", line = 618)
    private static final void method757() {
        field1674 = false;
        field1682.glDisable(3553);
        field1676 = -1;
        field1682.glTexEnvi(8960, 8704, 34160);
        field1682.glTexEnvi(8960, 34161, 8448);
        field1677 = 0;
        field1682.glTexEnvi(8960, 34162, 8448);
        field1664 = 0;
        field1682.glEnable(2896);
        field1682.glEnable(2912);
        field1682.glEnable(2929);
        field1679 = true;
        field1692 = true;
        field1696 = true;
        class324.method2224(255);
        field1682.glActiveTexture(33985);
        field1682.glTexEnvi(8960, 8704, 34160);
        field1682.glTexEnvi(8960, 34161, 8448);
        field1682.glTexEnvi(8960, 34162, 8448);
        field1682.glActiveTexture(33984);
        field1682.setSwapInterval(0);
        field1682.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field1682.glShadeModel(7425);
        field1682.glClearDepth(1.0D);
        field1682.glDepthFunc(515);
        method755();
        field1682.glMatrixMode(5890);
        field1682.glLoadIdentity();
        field1682.glPolygonMode(1028, 6914);
        field1682.glEnable(2884);
        field1682.glCullFace(1029);
        field1682.glEnable(3042);
        field1682.glBlendFunc(770, 771);
        field1682.glEnable(3008);
        field1682.glAlphaFunc(516, 0.0F);
        field1682.glEnableClientState(32884);
        field1682.glEnableClientState(32885);
        field1669 = true;
        field1682.glEnableClientState(32886);
        field1682.glEnableClientState(32888);
        field1682.glMatrixMode(5888);
        field1682.glLoadIdentity();
        class117.method882();
        class62.method435();
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 664)
    public static final void method758(int arg0) {
        if (field1677 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1682.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field1682.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field1682.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field1682.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field1682.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field1682.glTexEnvi(8960, 34161, 34165);
        }
        field1677 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "()F", line = 688)
    public static final float method759() {
        return field1665;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFF)V", line = 694)
    public static final void method760(float arg0, float arg1, float arg2) {
        field1682.glMatrixMode(5890);
        if (field1683) {
            field1682.glLoadIdentity();
        }
        field1682.glTranslatef(arg0, arg1, arg2);
        field1682.glMatrixMode(5888);
        field1683 = true;
    }

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "()V", line = 704)
    public static final void method761() {
        class285.method1964(121, 0, 0);
        method762();
        method758(0);
        method765(0);
        method730(false);
        method734(false);
        method736(false);
        method750();
    }

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "()V", line = 714)
    private static final void method762() {
        if (field1674) {
            return;
        }
        field1682.glMatrixMode(5889);
        field1682.glLoadIdentity();
        field1682.glOrtho(0.0D, (double) field1680, 0.0D, (double) field1685, -1.0D, 1.0D);
        field1682.glViewport(0, 0, field1680, field1685);
        field1682.glMatrixMode(5888);
        field1682.glLoadIdentity();
        field1674 = true;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIFFII)V", line = 729)
    public static final void method763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field1682.glMatrixMode(5889);
        field1682.glLoadIdentity();
        method740((float) var10 * field1691, (float) var11 * field1691, (float) (-var13) * field1691, (float) (-var12) * field1691, 50.0F, 3584.0F);
        field1682.glViewport(arg0, field1685 - arg1 - arg3, arg2, arg3);
        field1682.glMatrixMode(5888);
        field1682.glLoadIdentity();
        field1682.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field1682.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field1682.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field1674 = false;
        class26.field340 = var10;
        class208.field3433 = var11;
        class111.field1884 = var12;
        class175.field2874 = var13;
    }

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "()V", line = 756)
    public static final void method764() {
        if (class88.field1483) {
            method730(true);
            method731(true);
        } else {
            method730(false);
            method731(false);
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V", line = 779)
    public static final void method765(int arg0) {
        if (field1664 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1682.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field1682.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field1682.glTexEnvi(8960, 34162, 260);
        }
        field1664 = arg0;
    }
}
