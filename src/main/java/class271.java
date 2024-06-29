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

@OriginalClass("client!re")
public class class271 {

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4635 = 0;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Z")
    public static boolean field4640 = false;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lok;")
    private static class146 field4629 = class235.method1724(-12908, "radeon");

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    private static int field4626 = -1;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Z")
    private static boolean field4643 = false;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    private static int field4653 = 0;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Z")
    private static boolean field4637 = true;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "Z")
    private static boolean field4650 = true;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "F")
    private static float field4642 = 0.0F;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "F")
    private static float field4648 = 0.0F;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "Z")
    private static boolean field4655 = true;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Z")
    private static boolean field4656 = false;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "[F")
    private static float[] field4659 = new float[16];

    @OriginalMember(owner = "client!re", name = "m", descriptor = "F")
    private static float field4638 = 0.09765625F;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    private static int field4639 = 0;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "Z")
    public static boolean field4661 = true;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "F")
    private static float field4646;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "F")
    private static float field4647;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    private static int field4632;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    private static int field4660;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    private static int field4662;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Ljava/lang/String;")
    private static String field4636;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Ljava/lang/String;")
    private static String field4652;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4641;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field4631;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4645;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Z")
    public static boolean field4630;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "Z")
    public static boolean field4633;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Z")
    public static boolean field4634;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "Z")
    public static boolean field4649;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "Z")
    public static boolean field4651;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "Z")
    public static boolean field4657;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "Z")
    public static boolean field4658;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()V", line = 12)
    public static final void method1952() {
        try {
            field4645.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()V", line = 20)
    public static final void method1953() {
        if (field4643) {
            field4641.glMatrixMode(5890);
            field4641.glLoadIdentity();
            field4641.glMatrixMode(5888);
            field4643 = false;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;)Lok;", line = 32)
    private static final class146 method1954(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class316.method2210(1, var1.length, var1, 0);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(FFF)V", line = 42)
    public static final void method1955(float arg0, float arg1, float arg2) {
        field4641.glMatrixMode(5890);
        if (field4643) {
            field4641.glLoadIdentity();
        }
        field4641.glTranslatef(arg0, arg1, arg2);
        field4641.glMatrixMode(5888);
        field4643 = true;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()V", line = 51)
    public static void method1956() {
        field4629 = null;
        field4652 = null;
        field4636 = null;
        field4641 = null;
        field4645 = null;
        field4631 = null;
        field4659 = null;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()V", line = 62)
    private static final void method1957() {
        int[] var0 = new int[1];
        field4641.glGenTextures(1, var0, 0);
        field4644 = var0[0];
        field4641.glBindTexture(3553, field4644);
        field4641.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class33.method240(-25291);
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "()V", line = 71)
    private static final void method1958() {
        field4656 = false;
        field4641.glDisable(3553);
        field4626 = -1;
        field4641.glTexEnvi(8960, 8704, 34160);
        field4641.glTexEnvi(8960, 34161, 8448);
        field4653 = 0;
        field4641.glTexEnvi(8960, 34162, 8448);
        field4639 = 0;
        field4641.glEnable(2896);
        field4641.glEnable(2912);
        field4641.glEnable(2929);
        field4650 = true;
        field4637 = true;
        field4655 = true;
        class64.method489((byte) 107);
        field4641.glActiveTexture(33985);
        field4641.glTexEnvi(8960, 8704, 34160);
        field4641.glTexEnvi(8960, 34161, 8448);
        field4641.glTexEnvi(8960, 34162, 8448);
        field4641.glActiveTexture(33984);
        field4641.setSwapInterval(0);
        field4641.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4641.glShadeModel(7425);
        field4641.glClearDepth(1.0D);
        field4641.glDepthFunc(515);
        method1963();
        field4641.glMatrixMode(5890);
        field4641.glLoadIdentity();
        field4641.glPolygonMode(1028, 6914);
        field4641.glEnable(2884);
        field4641.glCullFace(1029);
        field4641.glEnable(3042);
        field4641.glBlendFunc(770, 771);
        field4641.glEnable(3008);
        field4641.glAlphaFunc(516, 0.0F);
        field4641.glEnableClientState(32884);
        field4641.glEnableClientState(32885);
        field4661 = true;
        field4641.glEnableClientState(32886);
        field4641.glEnableClientState(32888);
        field4641.glMatrixMode(5888);
        field4641.glLoadIdentity();
        class231.method1691();
        class53.method434();
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(FF)V", line = 117)
    public static final void method1959(float arg0, float arg1) {
        if (field4656 || field4648 == arg0 && field4642 == arg1) {
            return;
        }
        field4648 = arg0;
        field4642 = arg1;
        if (arg1 == 0.0F) {
            field4659[10] = field4647;
            field4659[14] = field4646;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4646 * (1.0F - var2) / arg1;
            field4659[10] = field4647 + var4;
            field4659[14] = field4646 * var3;
        }
        field4641.glMatrixMode(5889);
        field4641.glLoadMatrixf(field4659, 0);
        field4641.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "()V", line = 147)
    public static final void method1960() {
        field4641.glDepthMask(false);
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "()V", line = 151)
    public static final void method1961() {
        int[] var0 = new int[2];
        field4641.glGetIntegerv(3073, var0, 0);
        field4641.glGetIntegerv(3074, var0, 1);
        field4641.glDrawBuffer(1026);
        field4641.glReadBuffer(1024);
        method1978(-1);
        field4641.glPushAttrib(8192);
        field4641.glDisable(2912);
        field4641.glDisable(3042);
        field4641.glDisable(2929);
        field4641.glDisable(3008);
        field4641.glRasterPos2i(0, 0);
        field4641.glCopyPixels(0, 0, field4654, field4628, 6144);
        field4641.glPopAttrib();
        field4641.glDrawBuffer(var0[0]);
        field4641.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 171)
    public static final void method1962(boolean arg0) {
        if (field4655 == arg0) {
            return;
        }
        if (arg0) {
            field4641.glEnable(2912);
        } else {
            field4641.glDisable(2912);
        }
        field4655 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "h", descriptor = "()V", line = 187)
    public static final void method1963() {
        field4641.glDepthMask(true);
    }

    @OriginalMember(owner = "client!re", name = "i", descriptor = "()F", line = 190)
    public static final float method1964() {
        return field4642;
    }

    @OriginalMember(owner = "client!re", name = "j", descriptor = "()V", line = 198)
    public static final void method1965() {
        class140.method1033(0, 0, -5);
        method1966();
        method1974(0);
        method1983(0);
        method1989(false);
        method1971(false);
        method1962(false);
        method1953();
    }

    @OriginalMember(owner = "client!re", name = "k", descriptor = "()V", line = 208)
    private static final void method1966() {
        if (field4656) {
            return;
        }
        field4641.glMatrixMode(5889);
        field4641.glLoadIdentity();
        field4641.glOrtho(0.0D, (double) field4654, 0.0D, (double) field4628, -1.0D, 1.0D);
        field4641.glViewport(0, 0, field4654, field4628);
        field4641.glMatrixMode(5888);
        field4641.glLoadIdentity();
        field4656 = true;
    }

    @OriginalMember(owner = "client!re", name = "l", descriptor = "()V", line = 222)
    public static final void method1967() {
        class140.method1033(0, 0, -5);
        method1966();
        method1974(1);
        method1983(1);
        method1989(false);
        method1971(false);
        method1962(false);
        method1953();
    }

    @OriginalMember(owner = "client!re", name = "m", descriptor = "()V", line = 240)
    public static final void method1968() {
        if (field4641 != null) {
            try {
                class138.method1017((byte) 6);
            } catch (Throwable var7) {
            }
            field4641 = null;
        }
        if (field4631 != null) {
            class68.method508();
            try {
                if (GLContext.getCurrent() == field4631) {
                    field4631.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field4631.destroy();
            } catch (Throwable var5) {
            }
            field4631 = null;
        }
        if (field4645 != null) {
            try {
                field4645.setRealized(false);
            } catch (Throwable var4) {
            }
            field4645 = null;
        }
        class53.method428();
        field4640 = false;
    }

    @OriginalMember(owner = "client!re", name = "n", descriptor = "()I", line = 289)
    private static final int method1969() {
        int var0 = 0;
        field4636 = field4641.glGetString(7936);
        field4652 = field4641.glGetString(7937);
        String var1 = field4636.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field4641.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field4662 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field4662 < 12) {
            var0 |= 0x2;
        }
        if (!field4641.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field4641.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field4641.glGetIntegerv(34018, var7, 0);
        field4627 = var7[0];
        field4641.glGetIntegerv(34929, var7, 0);
        field4632 = var7[0];
        field4641.glGetIntegerv(34930, var7, 0);
        field4660 = var7[0];
        if (field4627 < 2 || field4632 < 2 || field4660 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field4657 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field4634 = field4641.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field4658 = field4641.isExtensionAvailable("GL_ARB_multisample");
        field4633 = field4641.isExtensionAvailable("GL_ARB_texture_cube_map");
        field4651 = field4641.isExtensionAvailable("GL_ARB_vertex_program");
        field4649 = field4641.isExtensionAvailable("GL_EXT_texture3D");
        class146 var8 = method1954(field4652).method1108(true);
        if (var8.method1081(field4629, -1) != -1) {
            int var9 = 0;
            class146[] var10 = var8.method1076(32, true, 47).method1090(32, (byte) 33);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class146 var12 = var10[var11];
                if (var12.method1094((byte) -28) >= 4 && var12.method1078(0, 4, false).method1119((byte) -118)) {
                    var9 = var12.method1078(0, 4, false).method1092(true);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field4634 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field4649 = false;
            }
            field4630 = field4634;
        }
        if (field4634) {
            try {
                int[] var13 = new int[1];
                field4641.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V", line = 409)
    public static final void method1970(int arg0, int arg1) {
        field4654 = arg0;
        field4628 = arg1;
        field4656 = false;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V", line = 414)
    public static final void method1971(boolean arg0) {
        if (field4637 == arg0) {
            return;
        }
        if (arg0) {
            field4641.glEnable(2929);
        } else {
            field4641.glDisable(2929);
        }
        field4637 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V", line = 425)
    public static final void method1972(int arg0, int arg1, int arg2, int arg3) {
        method1973(0, 0, field4654, field4628, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIFFII)V", line = 431)
    public static final void method1973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4641.glMatrixMode(5889);
        field4641.glLoadIdentity();
        method1988((float) var10 * field4638, (float) var11 * field4638, (float) (-var13) * field4638, (float) (-var12) * field4638, 50.0F, 3584.0F);
        field4641.glViewport(arg0, field4628 - arg1 - arg3, arg2, arg3);
        field4641.glMatrixMode(5888);
        field4641.glLoadIdentity();
        field4641.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4641.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4641.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4656 = false;
        class120.field1970 = var10;
        class167.field2822 = var11;
        class137.field2281 = var12;
        class148.field2512 = var13;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 460)
    public static final void method1974(int arg0) {
        if (field4653 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4641.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4641.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4641.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4641.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4641.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4641.glTexEnvi(8960, 34161, 34165);
        }
        field4653 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 490)
    public static final void method1975(int arg0) {
        field4641.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4641.glClear(16640);
        field4641.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!re", name = "o", descriptor = "()F", line = 495)
    public static final float method1976() {
        return field4648;
    }

    @OriginalMember(owner = "client!re", name = "p", descriptor = "()V", line = 511)
    public static final void method1977() {
        class140.method1033(0, 0, -5);
        method1966();
        method1974(0);
        method1983(0);
        method1989(false);
        method1971(false);
        method1962(false);
        method1953();
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V", line = 522)
    public static final void method1978(int arg0) {
        if (field4626 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4641.glDisable(3553);
        } else {
            if (field4626 == -1) {
                field4641.glEnable(3553);
            }
            field4641.glBindTexture(3553, arg0);
        }
        field4626 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(F)V", line = 550)
    public static final void method1979(float arg0) {
        method1959(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 554)
    public static final int method1980(Canvas arg0, int arg1) {
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
            field4645 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field4645.setRealized(true);
            int var4 = 0;
            while (true) {
                field4631 = field4645.createContext((GLContext) null);
                try {
                    int var5 = field4631.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class281.method2041((byte) 127, 1000L);
            }
            field4641 = field4631.getGL();
            new GLU();
            field4640 = true;
            field4654 = arg0.getSize().width;
            field4628 = arg0.getSize().height;
            int var7 = method1969();
            if (var7 != 0) {
                method1968();
                return var7;
            }
            method1957();
            method1958();
            field4641.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field4645.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1968();
                        return -3;
                    }
                    class281.method2041((byte) 102, 100L);
                }
            }
            field4641.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1968();
            return -5;
        }
    }

    @OriginalMember(owner = "client!re", name = "q", descriptor = "()V", line = 637)
    public static final void method1981() {
        if (class102.field1641) {
            method1989(true);
            method1986(true);
        } else {
            method1989(false);
            method1986(false);
        }
    }

    @OriginalMember(owner = "client!re", name = "r", descriptor = "()V", line = 656)
    public static final void method1982() {
        field4641.glClear(256);
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V", line = 668)
    public static final void method1983(int arg0) {
        if (field4639 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4641.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4641.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4641.glTexEnvi(8960, 34162, 260);
        }
        field4639 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "s", descriptor = "()V", line = 690)
    public static final void method1984() {
        class140.method1033(0, 0, -5);
        method1966();
        method1978(-1);
        method1989(false);
        method1971(false);
        method1962(false);
        method1953();
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIII)V", line = 704)
    public static final void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4654 - arg0;
        int var8 = -arg1;
        int var9 = field4628 - arg1;
        field4641.glMatrixMode(5889);
        field4641.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4641.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field4641.glViewport(0, 0, field4654, field4628);
        field4641.glMatrixMode(5888);
        field4641.glLoadIdentity();
        field4641.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4656 = false;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)V", line = 730)
    private static final void method1986(boolean arg0) {
        if (field4661 == arg0) {
            return;
        }
        if (arg0) {
            field4641.glEnableClientState(32885);
        } else {
            field4641.glDisableClientState(32885);
        }
        field4661 = arg0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 742)
    public static final void method1987(Canvas arg0) {
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

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFF)V", line = 763)
    private static final void method1988(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field4659[0] = var6 / (arg1 - arg0);
        field4659[1] = 0.0F;
        field4659[2] = 0.0F;
        field4659[3] = 0.0F;
        field4659[4] = 0.0F;
        field4659[5] = var6 / (arg3 - arg2);
        field4659[6] = 0.0F;
        field4659[7] = 0.0F;
        field4659[8] = (arg0 + arg1) / (arg1 - arg0);
        field4659[9] = (arg2 + arg3) / (arg3 - arg2);
        field4659[10] = field4647 = -(arg4 + arg5) / (arg5 - arg4);
        field4659[11] = -1.0F;
        field4659[12] = 0.0F;
        field4659[13] = 0.0F;
        field4659[14] = field4646 = -(arg5 * var6) / (arg5 - arg4);
        field4659[15] = 0.0F;
        field4641.glLoadMatrixf(field4659, 0);
        field4648 = 0.0F;
        field4642 = 0.0F;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(Z)V", line = 789)
    public static final void method1989(boolean arg0) {
        if (field4650 == arg0) {
            return;
        }
        if (arg0) {
            field4641.glEnable(2896);
        } else {
            field4641.glDisable(2896);
        }
        field4650 = arg0;
    }
}
