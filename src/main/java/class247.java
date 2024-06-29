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

@OriginalClass("client!mm")
public class class247 {

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "F")
    private static float field4236 = 0.0F;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    private static int field4230 = 0;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "Z")
    private static boolean field4244 = false;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "Z")
    public static boolean field4247 = false;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
    public static boolean field4233 = true;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field4243 = 0;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    private static int field4227 = 0;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "F")
    private static float field4256 = 0.0F;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "Z")
    private static boolean field4249 = true;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "Z")
    private static boolean field4242 = true;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "Z")
    private static boolean field4254 = false;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "[F")
    private static float[] field4257 = new float[16];

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "F")
    private static float field4251 = 0.09765625F;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Z")
    private static boolean field4228 = true;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "Lmh;")
    private static class128 field4245 = class22.method156(125, "radeon");

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    private static int field4231 = -1;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "F")
    private static float field4234;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "F")
    private static float field4261;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    private static int field4240;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    private static int field4250;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    private static int field4262;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Ljava/lang/String;")
    private static String field4232;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "Ljava/lang/String;")
    private static String field4237;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4253;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field4255;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4241;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Z")
    public static boolean field4226;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Z")
    public static boolean field4229;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Z")
    public static boolean field4235;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Z")
    public static boolean field4238;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "Z")
    public static boolean field4248;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "Z")
    public static boolean field4252;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "Z")
    public static boolean field4258;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 10)
    public static final void method1681(boolean arg0) {
        if (field4249 == arg0) {
            return;
        }
        if (arg0) {
            field4253.glEnable(2912);
        } else {
            field4253.glDisable(2912);
        }
        field4249 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()V", line = 23)
    public static final void method1682() {
        int[] var0 = new int[2];
        field4253.glGetIntegerv(3073, var0, 0);
        field4253.glGetIntegerv(3074, var0, 1);
        field4253.glDrawBuffer(1026);
        field4253.glReadBuffer(1024);
        method1691(-1);
        field4253.glPushAttrib(8192);
        field4253.glDisable(2912);
        field4253.glDisable(3042);
        field4253.glDisable(2929);
        field4253.glDisable(3008);
        field4253.glRasterPos2i(0, 0);
        field4253.glCopyPixels(0, 0, field4260, field4246, 6144);
        field4253.glPopAttrib();
        field4253.glDrawBuffer(var0[0]);
        field4253.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "()V", line = 41)
    public static final void method1683() {
        class217.method1498((byte) -29, 0, 0);
        method1707();
        method1691(-1);
        method1706(false);
        method1713(false);
        method1681(false);
        method1710();
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "()V", line = 51)
    public static final void method1684() {
        try {
            field4241.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "()V", line = 58)
    public static void method1685() {
        field4245 = null;
        field4237 = null;
        field4232 = null;
        field4253 = null;
        field4241 = null;
        field4255 = null;
        field4257 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 68)
    public static final void method1686(Canvas arg0) {
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

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 92)
    public static final void method1687(int arg0) {
        if (field4230 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4253.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4253.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4253.glTexEnvi(8960, 34162, 260);
        }
        field4230 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "()V", line = 107)
    public static final void method1688() {
        field4253.glDepthMask(false);
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "()V", line = 110)
    public static final void method1689() {
        class217.method1498((byte) -29, 0, 0);
        method1707();
        method1701(1);
        method1687(1);
        method1706(false);
        method1713(false);
        method1681(false);
        method1710();
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V", line = 120)
    private static final void method1690(boolean arg0) {
        if (field4233 == arg0) {
            return;
        }
        if (arg0) {
            field4253.glEnableClientState(32885);
        } else {
            field4253.glDisableClientState(32885);
        }
        field4233 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 132)
    public static final void method1691(int arg0) {
        if (field4231 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4253.glDisable(3553);
        } else {
            if (field4231 == -1) {
                field4253.glEnable(3553);
            }
            field4253.glBindTexture(3553, arg0);
        }
        field4231 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "()V", line = 150)
    public static final void method1692() {
        field4253.glDepthMask(true);
    }

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "()V", line = 155)
    public static final void method1693() {
        field4253.glClear(256);
    }

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "()V", line = 160)
    private static final void method1694() {
        int[] var0 = new int[1];
        field4253.glGenTextures(1, var0, 0);
        field4259 = var0[0];
        field4253.glBindTexture(3553, field4259);
        field4253.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class310.method2112(7);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V", line = 172)
    public static final void method1695(int arg0, int arg1, int arg2, int arg3) {
        method1703(0, 0, field4260, field4246, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "()V", line = 177)
    public static final void method1696() {
        class217.method1498((byte) -29, 0, 0);
        method1707();
        method1701(0);
        method1687(0);
        method1706(false);
        method1713(false);
        method1681(false);
        method1710();
    }

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "()F", line = 189)
    public static final float method1697() {
        return field4236;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(FFF)V", line = 200)
    public static final void method1698(float arg0, float arg1, float arg2) {
        field4253.glMatrixMode(5890);
        if (field4244) {
            field4253.glLoadIdentity();
        }
        field4253.glTranslatef(arg0, arg1, arg2);
        field4253.glMatrixMode(5888);
        field4244 = true;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(FFFFFF)V", line = 215)
    private static final void method1699(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field4257[0] = var6 / (arg1 - arg0);
        field4257[1] = 0.0F;
        field4257[2] = 0.0F;
        field4257[3] = 0.0F;
        field4257[4] = 0.0F;
        field4257[5] = var6 / (arg3 - arg2);
        field4257[6] = 0.0F;
        field4257[7] = 0.0F;
        field4257[8] = (arg0 + arg1) / (arg1 - arg0);
        field4257[9] = (arg2 + arg3) / (arg3 - arg2);
        field4257[10] = field4234 = -(arg4 + arg5) / (arg5 - arg4);
        field4257[11] = -1.0F;
        field4257[12] = 0.0F;
        field4257[13] = 0.0F;
        field4257[14] = field4261 = -(arg5 * var6) / (arg5 - arg4);
        field4257[15] = 0.0F;
        field4253.glLoadMatrixf(field4257, 0);
        field4236 = 0.0F;
        field4256 = 0.0F;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;)Lmh;", line = 240)
    private static final class128 method1700(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class220.method1520(var1.length, (byte) 89, 0, var1);
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 261)
    public static final void method1701(int arg0) {
        if (field4227 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4253.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4253.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4253.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4253.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4253.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4253.glTexEnvi(8960, 34161, 34165);
        }
        field4227 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 286)
    public static final void method1702(int arg0, int arg1) {
        field4260 = arg0;
        field4246 = arg1;
        field4254 = false;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIFFII)V", line = 292)
    public static final void method1703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4253.glMatrixMode(5889);
        field4253.glLoadIdentity();
        method1699((float) var10 * field4251, (float) var11 * field4251, (float) (-var13) * field4251, (float) (-var12) * field4251, 50.0F, 3584.0F);
        field4253.glViewport(arg0, field4246 - arg1 - arg3, arg2, arg3);
        field4253.glMatrixMode(5888);
        field4253.glLoadIdentity();
        field4253.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4253.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4253.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4254 = false;
        class170.field2965 = var10;
        class98.field1704 = var11;
        class262.field4550 = var12;
        class8.field189 = var13;
    }

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "()V", line = 330)
    public static final void method1704() {
        class217.method1498((byte) -29, 0, 0);
        method1707();
        method1701(0);
        method1687(0);
        method1706(false);
        method1713(false);
        method1681(false);
        method1710();
    }

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "()V", line = 341)
    private static final void method1705() {
        field4254 = false;
        field4253.glDisable(3553);
        field4231 = -1;
        field4253.glTexEnvi(8960, 8704, 34160);
        field4253.glTexEnvi(8960, 34161, 8448);
        field4227 = 0;
        field4253.glTexEnvi(8960, 34162, 8448);
        field4230 = 0;
        field4253.glEnable(2896);
        field4253.glEnable(2912);
        field4253.glEnable(2929);
        field4228 = true;
        field4242 = true;
        field4249 = true;
        class215.method1486(-122);
        field4253.glActiveTexture(33985);
        field4253.glTexEnvi(8960, 8704, 34160);
        field4253.glTexEnvi(8960, 34161, 8448);
        field4253.glTexEnvi(8960, 34162, 8448);
        field4253.glActiveTexture(33984);
        field4253.setSwapInterval(0);
        field4253.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4253.glShadeModel(7425);
        field4253.glClearDepth(1.0D);
        field4253.glDepthFunc(515);
        method1692();
        field4253.glMatrixMode(5890);
        field4253.glLoadIdentity();
        field4253.glPolygonMode(1028, 6914);
        field4253.glEnable(2884);
        field4253.glCullFace(1029);
        field4253.glEnable(3042);
        field4253.glBlendFunc(770, 771);
        field4253.glEnable(3008);
        field4253.glAlphaFunc(516, 0.0F);
        field4253.glEnableClientState(32884);
        field4253.glEnableClientState(32885);
        field4233 = true;
        field4253.glEnableClientState(32886);
        field4253.glEnableClientState(32888);
        field4253.glMatrixMode(5888);
        field4253.glLoadIdentity();
        class119.method713();
        class46.method312();
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(Z)V", line = 388)
    public static final void method1706(boolean arg0) {
        if (field4228 == arg0) {
            return;
        }
        if (arg0) {
            field4253.glEnable(2896);
        } else {
            field4253.glDisable(2896);
        }
        field4228 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "()V", line = 411)
    private static final void method1707() {
        if (field4254) {
            return;
        }
        field4253.glMatrixMode(5889);
        field4253.glLoadIdentity();
        field4253.glOrtho(0.0D, (double) field4260, 0.0D, (double) field4246, -1.0D, 1.0D);
        field4253.glViewport(0, 0, field4260, field4246);
        field4253.glMatrixMode(5888);
        field4253.glLoadIdentity();
        field4254 = true;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 429)
    public static final int method1708(Canvas arg0, int arg1) {
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
            field4241 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field4241.setRealized(true);
            int var4 = 0;
            while (true) {
                field4255 = field4241.createContext((GLContext) null);
                try {
                    int var5 = field4255.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class177.method1213(0, 1000L);
            }
            field4253 = field4255.getGL();
            new GLU();
            field4247 = true;
            field4260 = arg0.getSize().width;
            field4246 = arg0.getSize().height;
            int var7 = method1717();
            if (var7 != 0) {
                method1709();
                return var7;
            }
            method1694();
            method1705();
            field4253.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field4241.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1709();
                        return -3;
                    }
                    class177.method1213(0, 100L);
                }
            }
            field4253.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1709();
            return -5;
        }
    }

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "()V", line = 515)
    public static final void method1709() {
        if (field4253 != null) {
            try {
                class61.method401((byte) 116);
            } catch (Throwable var7) {
            }
            field4253 = null;
        }
        if (field4255 != null) {
            class274.method1924();
            try {
                if (GLContext.getCurrent() == field4255) {
                    field4255.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field4255.destroy();
            } catch (Throwable var5) {
            }
            field4255 = null;
        }
        if (field4241 != null) {
            try {
                field4241.setRealized(false);
            } catch (Throwable var4) {
            }
            field4241 = null;
        }
        class46.method311();
        field4247 = false;
    }

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "()V", line = 563)
    public static final void method1710() {
        if (field4244) {
            field4253.glMatrixMode(5890);
            field4253.glLoadIdentity();
            field4253.glMatrixMode(5888);
            field4244 = false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIII)V", line = 577)
    public static final void method1711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4260 - arg0;
        int var8 = -arg1;
        int var9 = field4246 - arg1;
        field4253.glMatrixMode(5889);
        field4253.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4253.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field4253.glViewport(0, 0, field4260, field4246);
        field4253.glMatrixMode(5888);
        field4253.glLoadIdentity();
        field4253.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4254 = false;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V", line = 600)
    public static final void method1712(int arg0) {
        field4253.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4253.glClear(16640);
        field4253.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(Z)V", line = 613)
    public static final void method1713(boolean arg0) {
        if (field4242 == arg0) {
            return;
        }
        if (arg0) {
            field4253.glEnable(2929);
        } else {
            field4253.glDisable(2929);
        }
        field4242 = arg0;
    }

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "()F", line = 627)
    public static final float method1714() {
        return field4256;
    }

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "()V", line = 632)
    public static final void method1715() {
        if (class90.field1536) {
            method1706(true);
            method1690(true);
        } else {
            method1706(false);
            method1690(false);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(FF)V", line = 649)
    public static final void method1716(float arg0, float arg1) {
        if (field4254 || field4236 == arg0 && field4256 == arg1) {
            return;
        }
        field4236 = arg0;
        field4256 = arg1;
        if (arg1 == 0.0F) {
            field4257[10] = field4234;
            field4257[14] = field4261;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4261 * (1.0F - var2) / arg1;
            field4257[10] = field4234 + var4;
            field4257[14] = field4261 * var3;
        }
        field4253.glMatrixMode(5889);
        field4253.glLoadMatrixf(field4257, 0);
        field4253.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "()I", line = 680)
    private static final int method1717() {
        int var0 = 0;
        field4232 = field4253.glGetString(7936);
        field4237 = field4253.glGetString(7937);
        String var1 = field4232.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field4253.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field4250 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field4250 < 12) {
            var0 |= 0x2;
        }
        if (!field4253.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field4253.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field4253.glGetIntegerv(34018, var7, 0);
        field4239 = var7[0];
        field4253.glGetIntegerv(34929, var7, 0);
        field4262 = var7[0];
        field4253.glGetIntegerv(34930, var7, 0);
        field4240 = var7[0];
        if (field4239 < 2 || field4262 < 2 || field4240 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field4235 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field4248 = field4253.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field4229 = field4253.isExtensionAvailable("GL_ARB_multisample");
        field4238 = field4253.isExtensionAvailable("GL_ARB_texture_cube_map");
        field4252 = field4253.isExtensionAvailable("GL_ARB_vertex_program");
        field4226 = field4253.isExtensionAvailable("GL_EXT_texture3D");
        class128 var8 = method1700(field4237).method836((byte) 72);
        if (var8.method823(field4245, true) != -1) {
            int var9 = 0;
            class128[] var10 = var8.method840((byte) -122, 32, 47).method833(32, (byte) 106);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class128 var12 = var10[var11];
                if (var12.method865((byte) -76) >= 4 && var12.method848(0, 117, 4).method821(-3677)) {
                    var9 = var12.method848(0, 124, 4).method845((byte) -124);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field4248 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field4226 = false;
            }
            field4258 = field4248;
        }
        if (field4248) {
            try {
                int[] var13 = new int[1];
                field4253.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(F)V", line = 789)
    public static final void method1718(float arg0) {
        method1716(3000.0F, arg0 * 1.5F);
    }
}
