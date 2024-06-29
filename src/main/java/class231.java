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

@OriginalClass("client!gh")
public class class231 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Z")
    public static boolean field4051 = false;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Z")
    private static boolean field4055 = true;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Z")
    public static boolean field4062 = true;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "Lsf;")
    private static class108 field4059 = class140.method973(255, "radeon");

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "F")
    private static float field4064 = 0.09765625F;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    private static int field4058 = -1;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Z")
    private static boolean field4063 = true;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Z")
    private static boolean field4072 = false;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "[F")
    private static float[] field4071 = new float[16];

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field4050 = 0;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    private static int field4049 = 0;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "F")
    private static float field4069 = 0.0F;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "Z")
    private static boolean field4083 = false;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    private static int field4075 = 0;

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "Z")
    private static boolean field4084 = true;

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "F")
    private static float field4074 = 0.0F;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "F")
    private static float field4054;

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "F")
    private static float field4076;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    private static int field4053;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    private static int field4066;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    private static int field4078;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Ljava/lang/String;")
    private static String field4057;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "Ljava/lang/String;")
    private static String field4065;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4052;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field4080;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4056;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Z")
    public static boolean field4060;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Z")
    public static boolean field4061;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Z")
    public static boolean field4068;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "Z")
    public static boolean field4070;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "Z")
    public static boolean field4081;

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "Z")
    public static boolean field4082;

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Z")
    public static boolean field4085;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V", line = 10)
    public static final void method1569(int arg0, int arg1) {
        field4077 = arg0;
        field4079 = arg1;
        field4083 = false;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V", line = 17)
    public static final void method1570() {
        field4052.glDepthMask(true);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()V", line = 20)
    public static final void method1571() {
        class59.method403(0, (byte) -49, 0);
        method1583();
        method1597(-1);
        method1602(false);
        method1604(false);
        method1574(false);
        method1580();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 33)
    public static final void method1572(int arg0) {
        if (field4049 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4052.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4052.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4052.glTexEnvi(8960, 34162, 260);
        }
        field4049 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()V", line = 54)
    public static final void method1573() {
        if (field4052 != null) {
            try {
                class299.method2113(62);
            } catch (Throwable var7) {
            }
            field4052 = null;
        }
        if (field4080 != null) {
            class124.method861();
            try {
                if (GLContext.getCurrent() == field4080) {
                    field4080.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field4080.destroy();
            } catch (Throwable var5) {
            }
            field4080 = null;
        }
        if (field4056 != null) {
            try {
                field4056.setRealized(false);
            } catch (Throwable var4) {
            }
            field4056 = null;
        }
        class267.method1924();
        field4051 = false;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 111)
    public static final void method1574(boolean arg0) {
        if (field4084 == arg0) {
            return;
        }
        if (arg0) {
            field4052.glEnable(2912);
        } else {
            field4052.glDisable(2912);
        }
        field4084 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "()F", line = 123)
    public static final float method1575() {
        return field4069;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 129)
    public static final void method1576(int arg0) {
        field4052.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4052.glClear(16640);
        field4052.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(FFFFFF)V", line = 141)
    private static final void method1577(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field4071[0] = var6 / (arg1 - arg0);
        field4071[1] = 0.0F;
        field4071[2] = 0.0F;
        field4071[3] = 0.0F;
        field4071[4] = 0.0F;
        field4071[5] = var6 / (arg3 - arg2);
        field4071[6] = 0.0F;
        field4071[7] = 0.0F;
        field4071[8] = (arg0 + arg1) / (arg1 - arg0);
        field4071[9] = (arg2 + arg3) / (arg3 - arg2);
        field4071[10] = field4054 = -(arg4 + arg5) / (arg5 - arg4);
        field4071[11] = -1.0F;
        field4071[12] = 0.0F;
        field4071[13] = 0.0F;
        field4071[14] = field4076 = -(arg5 * var6) / (arg5 - arg4);
        field4071[15] = 0.0F;
        field4052.glLoadMatrixf(field4071, 0);
        field4074 = 0.0F;
        field4069 = 0.0F;
    }

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "()V", line = 163)
    public static final void method1578() {
        class59.method403(0, (byte) -94, 0);
        method1583();
        method1589(0);
        method1572(0);
        method1602(false);
        method1604(false);
        method1574(false);
        method1580();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIII)V", line = 174)
    public static final void method1579(int arg0, int arg1, int arg2, int arg3) {
        method1585(0, 0, field4077, field4079, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "()V", line = 184)
    public static final void method1580() {
        if (field4072) {
            field4052.glMatrixMode(5890);
            field4052.glLoadIdentity();
            field4052.glMatrixMode(5888);
            field4072 = false;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(F)V", line = 194)
    public static final void method1581(float arg0) {
        method1593(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 199)
    public static final int method1582(Canvas arg0, int arg1) {
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
            field4056 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field4056.setRealized(true);
            int var4 = 0;
            while (true) {
                field4080 = field4056.createContext((GLContext) null);
                try {
                    int var5 = field4080.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class83.method556(1000L, 122);
            }
            field4052 = field4080.getGL();
            new GLU();
            field4051 = true;
            field4077 = arg0.getSize().width;
            field4079 = arg0.getSize().height;
            int var7 = method1606();
            if (var7 != 0) {
                method1573();
                return var7;
            }
            method1587();
            method1595();
            field4052.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field4056.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1573();
                        return -3;
                    }
                    class83.method556(100L, 125);
                }
            }
            field4052.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1573();
            return -5;
        }
    }

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "()V", line = 282)
    private static final void method1583() {
        if (field4083) {
            return;
        }
        field4052.glMatrixMode(5889);
        field4052.glLoadIdentity();
        field4052.glOrtho(0.0D, (double) field4077, 0.0D, (double) field4079, -1.0D, 1.0D);
        field4052.glViewport(0, 0, field4077, field4079);
        field4052.glMatrixMode(5888);
        field4052.glLoadIdentity();
        field4083 = true;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(FFF)V", line = 294)
    public static final void method1584(float arg0, float arg1, float arg2) {
        field4052.glMatrixMode(5890);
        if (field4072) {
            field4052.glLoadIdentity();
        }
        field4052.glTranslatef(arg0, arg1, arg2);
        field4052.glMatrixMode(5888);
        field4072 = true;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIFFII)V", line = 308)
    public static final void method1585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4052.glMatrixMode(5889);
        field4052.glLoadIdentity();
        method1577((float) var10 * field4064, (float) var11 * field4064, (float) (-var13) * field4064, (float) (-var12) * field4064, 50.0F, 3584.0F);
        field4052.glViewport(arg0, field4079 - arg1 - arg3, arg2, arg3);
        field4052.glMatrixMode(5888);
        field4052.glLoadIdentity();
        field4052.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4052.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4052.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4083 = false;
        class21.field308 = var10;
        class64.field1022 = var11;
        class122.field2080 = var12;
        class299.field5216 = var13;
    }

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "()V", line = 335)
    public static void method1586() {
        field4059 = null;
        field4057 = null;
        field4065 = null;
        field4052 = null;
        field4056 = null;
        field4080 = null;
        field4071 = null;
    }

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "()V", line = 347)
    private static final void method1587() {
        int[] var0 = new int[1];
        field4052.glGenTextures(1, var0, 0);
        field4073 = var0[0];
        field4052.glBindTexture(3553, field4073);
        field4052.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class140.method974(-14316);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;)Lsf;", line = 360)
    private static final class108 method1588(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class304.method2137((byte) 100, 0, var1, var1.length);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V", line = 372)
    public static final void method1589(int arg0) {
        if (field4075 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4052.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4052.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4052.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4052.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4052.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4052.glTexEnvi(8960, 34161, 34165);
        }
        field4075 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "()V", line = 396)
    public static final void method1590() {
        class59.method403(0, (byte) -35, 0);
        method1583();
        method1589(1);
        method1572(1);
        method1602(false);
        method1604(false);
        method1574(false);
        method1580();
    }

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "()V", line = 407)
    public static final void method1591() {
        field4052.glDepthMask(false);
    }

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "()F", line = 410)
    public static final float method1592() {
        return field4074;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(FF)V", line = 413)
    public static final void method1593(float arg0, float arg1) {
        if (field4083 || field4074 == arg0 && field4069 == arg1) {
            return;
        }
        field4074 = arg0;
        field4069 = arg1;
        if (arg1 == 0.0F) {
            field4071[10] = field4054;
            field4071[14] = field4076;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4076 * (1.0F - var2) / arg1;
            field4071[10] = field4054 + var4;
            field4071[14] = field4076 * var3;
        }
        field4052.glMatrixMode(5889);
        field4052.glLoadMatrixf(field4071, 0);
        field4052.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "()V", line = 443)
    public static final void method1594() {
        class59.method403(0, (byte) -83, 0);
        method1583();
        method1589(0);
        method1572(0);
        method1602(false);
        method1604(false);
        method1574(false);
        method1580();
    }

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "()V", line = 457)
    private static final void method1595() {
        field4083 = false;
        field4052.glDisable(3553);
        field4058 = -1;
        field4052.glTexEnvi(8960, 8704, 34160);
        field4052.glTexEnvi(8960, 34161, 8448);
        field4075 = 0;
        field4052.glTexEnvi(8960, 34162, 8448);
        field4049 = 0;
        field4052.glEnable(2896);
        field4052.glEnable(2912);
        field4052.glEnable(2929);
        field4055 = true;
        field4063 = true;
        field4084 = true;
        class232.method1622((byte) -118);
        field4052.glActiveTexture(33985);
        field4052.glTexEnvi(8960, 8704, 34160);
        field4052.glTexEnvi(8960, 34161, 8448);
        field4052.glTexEnvi(8960, 34162, 8448);
        field4052.glActiveTexture(33984);
        field4052.setSwapInterval(0);
        field4052.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4052.glShadeModel(7425);
        field4052.glClearDepth(1.0D);
        field4052.glDepthFunc(515);
        method1570();
        field4052.glMatrixMode(5890);
        field4052.glLoadIdentity();
        field4052.glPolygonMode(1028, 6914);
        field4052.glEnable(2884);
        field4052.glCullFace(1029);
        field4052.glEnable(3042);
        field4052.glBlendFunc(770, 771);
        field4052.glEnable(3008);
        field4052.glAlphaFunc(516, 0.0F);
        field4052.glEnableClientState(32884);
        field4052.glEnableClientState(32885);
        field4062 = true;
        field4052.glEnableClientState(32886);
        field4052.glEnableClientState(32888);
        field4052.glMatrixMode(5888);
        field4052.glLoadIdentity();
        class217.method1490();
        class267.method1931();
    }

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "()V", line = 504)
    public static final void method1596() {
        field4052.glClear(256);
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V", line = 524)
    public static final void method1597(int arg0) {
        if (field4058 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4052.glDisable(3553);
        } else {
            if (field4058 == -1) {
                field4052.glEnable(3553);
            }
            field4052.glBindTexture(3553, arg0);
        }
        field4058 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "()V", line = 541)
    public static final void method1598() {
        try {
            field4056.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "()V", line = 550)
    public static final void method1599() {
        int[] var0 = new int[2];
        field4052.glGetIntegerv(3073, var0, 0);
        field4052.glGetIntegerv(3074, var0, 1);
        field4052.glDrawBuffer(1026);
        field4052.glReadBuffer(1024);
        method1597(-1);
        field4052.glPushAttrib(8192);
        field4052.glDisable(2912);
        field4052.glDisable(3042);
        field4052.glDisable(2929);
        field4052.glDisable(3008);
        field4052.glRasterPos2i(0, 0);
        field4052.glCopyPixels(0, 0, field4077, field4079, 6144);
        field4052.glPopAttrib();
        field4052.glDrawBuffer(var0[0]);
        field4052.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "()V", line = 575)
    public static final void method1600() {
        if (class26.field397) {
            method1602(true);
            method1601(true);
        } else {
            method1602(false);
            method1601(false);
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)V", line = 589)
    private static final void method1601(boolean arg0) {
        if (field4062 == arg0) {
            return;
        }
        if (arg0) {
            field4052.glEnableClientState(32885);
        } else {
            field4052.glDisableClientState(32885);
        }
        field4062 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)V", line = 601)
    public static final void method1602(boolean arg0) {
        if (field4055 == arg0) {
            return;
        }
        if (arg0) {
            field4052.glEnable(2896);
        } else {
            field4052.glDisable(2896);
        }
        field4055 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 613)
    public static final void method1603(Canvas arg0) {
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

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(Z)V", line = 637)
    public static final void method1604(boolean arg0) {
        if (field4063 == arg0) {
            return;
        }
        if (arg0) {
            field4052.glEnable(2929);
        } else {
            field4052.glDisable(2929);
        }
        field4063 = arg0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIII)V", line = 657)
    public static final void method1605(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4077 - arg0;
        int var8 = -arg1;
        int var9 = field4079 - arg1;
        field4052.glMatrixMode(5889);
        field4052.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4052.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field4052.glViewport(0, 0, field4077, field4079);
        field4052.glMatrixMode(5888);
        field4052.glLoadIdentity();
        field4052.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4083 = false;
    }

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "()I", line = 681)
    private static final int method1606() {
        int var0 = 0;
        field4065 = field4052.glGetString(7936);
        field4057 = field4052.glGetString(7937);
        String var1 = field4065.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field4052.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field4078 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field4078 < 12) {
            var0 |= 0x2;
        }
        if (!field4052.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field4052.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field4052.glGetIntegerv(34018, var7, 0);
        field4067 = var7[0];
        field4052.glGetIntegerv(34929, var7, 0);
        field4066 = var7[0];
        field4052.glGetIntegerv(34930, var7, 0);
        field4053 = var7[0];
        if (field4067 < 2 || field4066 < 2 || field4053 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field4068 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field4060 = field4052.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field4082 = field4052.isExtensionAvailable("GL_ARB_multisample");
        field4081 = field4052.isExtensionAvailable("GL_ARB_texture_cube_map");
        field4061 = field4052.isExtensionAvailable("GL_ARB_vertex_program");
        field4085 = field4052.isExtensionAvailable("GL_EXT_texture3D");
        class108 var8 = method1588(field4057).method764(false);
        if (var8.method762(field4059, -126) != -1) {
            int var9 = 0;
            class108[] var10 = var8.method787(32, 47, 17272).method774(32, (byte) -70);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class108 var12 = var10[var11];
                if (var12.method776(0) >= 4 && var12.method750(false, 0, 4).method751(false)) {
                    var9 = var12.method750(false, 0, 4).method771((byte) -128);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field4060 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field4085 = false;
            }
            field4070 = field4060;
        }
        if (field4060) {
            try {
                int[] var13 = new int[1];
                field4052.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }
}
