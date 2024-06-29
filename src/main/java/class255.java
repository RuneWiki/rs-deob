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

@OriginalClass("client!tf")
public class class255 {

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    private static int field4169 = 0;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Z")
    private static boolean field4165 = false;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Z")
    public static boolean field4175 = true;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Z")
    private static boolean field4173 = true;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "Z")
    private static boolean field4182 = true;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Z")
    public static boolean field4184 = false;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    private static int field4180 = -1;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "F")
    private static float field4178 = 0.09765625F;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "[F")
    private static float[] field4185 = new float[16];

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Z")
    private static boolean field4176 = false;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "F")
    private static float field4174 = 0.0F;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4168 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    private static int field4170 = 0;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "F")
    private static float field4171 = 0.0F;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Z")
    private static boolean field4193 = true;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "Lna;")
    private static class26 field4196 = class69.method505("radeon", (byte) -119);

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "F")
    private static float field4164;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "F")
    private static float field4172;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    private static int field4183;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    private static int field4189;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    private static int field4191;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Ljava/lang/String;")
    private static String field4162;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Ljava/lang/String;")
    private static String field4163;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field4181;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field4177;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field4192;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
    public static boolean field4167;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Z")
    public static boolean field4179;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "Z")
    public static boolean field4186;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "Z")
    public static boolean field4190;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "Z")
    public static boolean field4194;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "Z")
    public static boolean field4195;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Z")
    public static boolean field4198;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;)Lna;", line = 12)
    private static final class26 method1760(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class320.method2222(var1, -4114, var1.length, 0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V", line = 24)
    public static final void method1761(int arg0, int arg1, int arg2, int arg3) {
        method1784(0, 0, field4197, field4188, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()V", line = 27)
    public static final void method1762() {
        class281.method1973(0, 0, 0);
        method1776();
        method1796(1);
        method1787(1);
        method1777(false);
        method1771(false);
        method1767(false);
        method1763();
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()V", line = 39)
    public static final void method1763() {
        if (field4165) {
            field4181.glMatrixMode(5890);
            field4181.glLoadIdentity();
            field4181.glMatrixMode(5888);
            field4165 = false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()V", line = 49)
    public static final void method1764() {
        class281.method1973(0, 0, 0);
        method1776();
        method1796(0);
        method1787(0);
        method1777(false);
        method1771(false);
        method1767(false);
        method1763();
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FF)V", line = 59)
    public static final void method1765(float arg0, float arg1) {
        if (field4176 || field4174 == arg0 && field4171 == arg1) {
            return;
        }
        field4174 = arg0;
        field4171 = arg1;
        if (arg1 == 0.0F) {
            field4185[10] = field4164;
            field4185[14] = field4172;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field4172 * (1.0F - var2) / arg1;
            field4185[10] = field4164 + var4;
            field4185[14] = field4172 * var3;
        }
        field4181.glMatrixMode(5889);
        field4181.glLoadMatrixf(field4185, 0);
        field4181.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "()V", line = 93)
    public static final void method1766() {
        try {
            field4192.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V", line = 100)
    public static final void method1767(boolean arg0) {
        if (field4193 == arg0) {
            return;
        }
        if (arg0) {
            field4181.glEnable(2912);
        } else {
            field4181.glDisable(2912);
        }
        field4193 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "()V", line = 114)
    public static final void method1768() {
        class281.method1973(0, 0, 0);
        method1776();
        method1796(0);
        method1787(0);
        method1777(false);
        method1771(false);
        method1767(false);
        method1763();
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "()V", line = 127)
    private static final void method1769() {
        field4176 = false;
        field4181.glDisable(3553);
        field4180 = -1;
        field4181.glTexEnvi(8960, 8704, 34160);
        field4181.glTexEnvi(8960, 34161, 8448);
        field4170 = 0;
        field4181.glTexEnvi(8960, 34162, 8448);
        field4169 = 0;
        field4181.glEnable(2896);
        field4181.glEnable(2912);
        field4181.glEnable(2929);
        field4173 = true;
        field4182 = true;
        field4193 = true;
        class229.method1546(97);
        field4181.glActiveTexture(33985);
        field4181.glTexEnvi(8960, 8704, 34160);
        field4181.glTexEnvi(8960, 34161, 8448);
        field4181.glTexEnvi(8960, 34162, 8448);
        field4181.glActiveTexture(33984);
        field4181.setSwapInterval(0);
        field4181.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field4181.glShadeModel(7425);
        field4181.glClearDepth(1.0D);
        field4181.glDepthFunc(515);
        method1770();
        field4181.glMatrixMode(5890);
        field4181.glLoadIdentity();
        field4181.glPolygonMode(1028, 6914);
        field4181.glEnable(2884);
        field4181.glCullFace(1029);
        field4181.glEnable(3042);
        field4181.glBlendFunc(770, 771);
        field4181.glEnable(3008);
        field4181.glAlphaFunc(516, 0.0F);
        field4181.glEnableClientState(32884);
        field4181.glEnableClientState(32885);
        field4175 = true;
        field4181.glEnableClientState(32886);
        field4181.glEnableClientState(32888);
        field4181.glMatrixMode(5888);
        field4181.glLoadIdentity();
        class289.method2036();
        class226.method1512();
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "()V", line = 173)
    public static final void method1770() {
        field4181.glDepthMask(true);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V", line = 180)
    public static final void method1771(boolean arg0) {
        if (field4182 == arg0) {
            return;
        }
        if (arg0) {
            field4181.glEnable(2929);
        } else {
            field4181.glDisable(2929);
        }
        field4182 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(F)V", line = 193)
    public static final void method1772(float arg0) {
        method1765(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "()V", line = 197)
    public static final void method1773() {
        int[] var0 = new int[2];
        field4181.glGetIntegerv(3073, var0, 0);
        field4181.glGetIntegerv(3074, var0, 1);
        field4181.glDrawBuffer(1026);
        field4181.glReadBuffer(1024);
        method1790(-1);
        field4181.glPushAttrib(8192);
        field4181.glDisable(2912);
        field4181.glDisable(3042);
        field4181.glDisable(2929);
        field4181.glDisable(3008);
        field4181.glRasterPos2i(0, 0);
        field4181.glCopyPixels(0, 0, field4197, field4188, 6144);
        field4181.glPopAttrib();
        field4181.glDrawBuffer(var0[0]);
        field4181.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 223)
    public static final void method1774(Canvas arg0) {
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

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "()V", line = 247)
    public static final void method1775() {
        class281.method1973(0, 0, 0);
        method1776();
        method1790(-1);
        method1777(false);
        method1771(false);
        method1767(false);
        method1763();
    }

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "()V", line = 257)
    private static final void method1776() {
        if (field4176) {
            return;
        }
        field4181.glMatrixMode(5889);
        field4181.glLoadIdentity();
        field4181.glOrtho(0.0D, (double) field4197, 0.0D, (double) field4188, -1.0D, 1.0D);
        field4181.glViewport(0, 0, field4197, field4188);
        field4181.glMatrixMode(5888);
        field4181.glLoadIdentity();
        field4176 = true;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(Z)V", line = 270)
    public static final void method1777(boolean arg0) {
        if (field4173 == arg0) {
            return;
        }
        if (arg0) {
            field4181.glEnable(2896);
        } else {
            field4181.glDisable(2896);
        }
        field4173 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "()V", line = 281)
    public static void method1778() {
        field4196 = null;
        field4163 = null;
        field4162 = null;
        field4181 = null;
        field4192 = null;
        field4177 = null;
        field4185 = null;
    }

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "()F", line = 291)
    public static final float method1779() {
        return field4171;
    }

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "()I", line = 295)
    private static final int method1780() {
        int var0 = 0;
        field4162 = field4181.glGetString(7936);
        field4163 = field4181.glGetString(7937);
        String var1 = field4162.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field4181.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field4189 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field4189 < 12) {
            var0 |= 0x2;
        }
        if (!field4181.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field4181.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field4181.glGetIntegerv(34018, var7, 0);
        field4166 = var7[0];
        field4181.glGetIntegerv(34929, var7, 0);
        field4191 = var7[0];
        field4181.glGetIntegerv(34930, var7, 0);
        field4183 = var7[0];
        if (field4166 < 2 || field4191 < 2 || field4183 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field4167 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field4190 = field4181.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field4186 = field4181.isExtensionAvailable("GL_ARB_multisample");
        field4198 = field4181.isExtensionAvailable("GL_ARB_texture_cube_map");
        field4195 = field4181.isExtensionAvailable("GL_ARB_vertex_program");
        field4179 = field4181.isExtensionAvailable("GL_EXT_texture3D");
        class26 var8 = method1760(field4163).method165(-98);
        if (var8.method182(field4196, 57) != -1) {
            int var9 = 0;
            class26[] var10 = var8.method196(32, 40, 47).method198(32, (byte) -98);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class26 var12 = var10[var11];
                if (var12.method171(-125) >= 4 && var12.method188(4, 0, 0).method174(106)) {
                    var9 = var12.method188(4, 0, 0).method183((byte) -113);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field4190 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field4179 = false;
            }
            field4194 = field4190;
        }
        if (field4190) {
            try {
                int[] var13 = new int[1];
                field4181.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "()V", line = 408)
    public static final void method1781() {
        field4181.glClear(256);
    }

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "()V", line = 415)
    public static final void method1782() {
        if (field4181 != null) {
            try {
                class225.method1499(90);
            } catch (Throwable var7) {
            }
            field4181 = null;
        }
        if (field4177 != null) {
            class197.method1325();
            try {
                if (GLContext.getCurrent() == field4177) {
                    field4177.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field4177.destroy();
            } catch (Throwable var5) {
            }
            field4177 = null;
        }
        if (field4192 != null) {
            try {
                field4192.setRealized(false);
            } catch (Throwable var4) {
            }
            field4192 = null;
        }
        class226.method1510();
        field4184 = false;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFF)V", line = 469)
    public static final void method1783(float arg0, float arg1, float arg2) {
        field4181.glMatrixMode(5890);
        if (field4165) {
            field4181.glLoadIdentity();
        }
        field4181.glTranslatef(arg0, arg1, arg2);
        field4181.glMatrixMode(5888);
        field4165 = true;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIFFII)V", line = 483)
    public static final void method1784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field4181.glMatrixMode(5889);
        field4181.glLoadIdentity();
        method1788((float) var10 * field4178, (float) var11 * field4178, (float) (-var13) * field4178, (float) (-var12) * field4178, 50.0F, 3584.0F);
        field4181.glViewport(arg0, field4188 - arg1 - arg3, arg2, arg3);
        field4181.glMatrixMode(5888);
        field4181.glLoadIdentity();
        field4181.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field4181.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field4181.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field4176 = false;
        class312.field5336 = var10;
        class21.field301 = var11;
        class273.field4571 = var12;
        class218.field3495 = var13;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(Z)V", line = 514)
    private static final void method1785(boolean arg0) {
        if (field4175 == arg0) {
            return;
        }
        if (arg0) {
            field4181.glEnableClientState(32885);
        } else {
            field4181.glDisableClientState(32885);
        }
        field4175 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "()V", line = 533)
    public static final void method1786() {
        if (class25.field360) {
            method1777(true);
            method1785(true);
        } else {
            method1777(false);
            method1785(false);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 553)
    public static final void method1787(int arg0) {
        if (field4169 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4181.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field4181.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field4181.glTexEnvi(8960, 34162, 260);
        }
        field4169 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(FFFFFF)V", line = 570)
    private static final void method1788(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field4185[0] = var6 / (arg1 - arg0);
        field4185[1] = 0.0F;
        field4185[2] = 0.0F;
        field4185[3] = 0.0F;
        field4185[4] = 0.0F;
        field4185[5] = var6 / (arg3 - arg2);
        field4185[6] = 0.0F;
        field4185[7] = 0.0F;
        field4185[8] = (arg0 + arg1) / (arg1 - arg0);
        field4185[9] = (arg2 + arg3) / (arg3 - arg2);
        field4185[10] = field4164 = -(arg4 + arg5) / (arg5 - arg4);
        field4185[11] = -1.0F;
        field4185[12] = 0.0F;
        field4185[13] = 0.0F;
        field4185[14] = field4172 = -(arg5 * var6) / (arg5 - arg4);
        field4185[15] = 0.0F;
        field4181.glLoadMatrixf(field4185, 0);
        field4174 = 0.0F;
        field4171 = 0.0F;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 610)
    public static final void method1789(int arg0) {
        field4181.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field4181.glClear(16640);
        field4181.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V", line = 615)
    public static final void method1790(int arg0) {
        if (field4180 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field4181.glDisable(3553);
        } else {
            if (field4180 == -1) {
                field4181.glEnable(3553);
            }
            field4181.glBindTexture(3553, arg0);
        }
        field4180 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "()V", line = 634)
    public static final void method1791() {
        field4181.glDepthMask(false);
    }

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "()F", line = 637)
    public static final float method1792() {
        return field4174;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 648)
    public static final int method1793(Canvas arg0, int arg1) {
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
            field4192 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field4192.setRealized(true);
            int var4 = 0;
            while (true) {
                field4177 = field4192.createContext((GLContext) null);
                try {
                    int var5 = field4177.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class126.method862(1000L, 64);
            }
            field4181 = field4177.getGL();
            new GLU();
            field4184 = true;
            field4197 = arg0.getSize().width;
            field4188 = arg0.getSize().height;
            int var7 = method1780();
            if (var7 != 0) {
                method1782();
                return var7;
            }
            method1797();
            method1769();
            field4181.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field4192.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1782();
                        return -3;
                    }
                    class126.method862(100L, 64);
                }
            }
            field4181.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1782();
            return -5;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V", line = 731)
    public static final void method1794(int arg0, int arg1) {
        field4197 = arg0;
        field4188 = arg1;
        field4176 = false;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIII)V", line = 738)
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field4197 - arg0;
        int var8 = -arg1;
        int var9 = field4188 - arg1;
        field4181.glMatrixMode(5889);
        field4181.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field4181.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field4181.glViewport(0, 0, field4197, field4188);
        field4181.glMatrixMode(5888);
        field4181.glLoadIdentity();
        field4181.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field4176 = false;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V", line = 765)
    public static final void method1796(int arg0) {
        if (field4170 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field4181.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field4181.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field4181.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field4181.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field4181.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field4181.glTexEnvi(8960, 34161, 34165);
        }
        field4170 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "()V", line = 793)
    private static final void method1797() {
        int[] var0 = new int[1];
        field4181.glGenTextures(1, var0, 0);
        field4187 = var0[0];
        field4181.glBindTexture(3553, field4187);
        field4181.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class226.method1513();
        class293.method2061(6);
    }
}
