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

@OriginalClass("client!h")
public class class217 {

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Z")
    private static boolean field3520 = true;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "F")
    private static float field3517 = 0.0F;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "[F")
    private static float[] field3528 = new float[16];

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Z")
    public static boolean field3516 = false;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    private static int field3541 = -1;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    private static int field3530 = 0;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Z")
    private static boolean field3529 = false;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Z")
    public static boolean field3534 = true;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "F")
    private static float field3533 = 0.09765625F;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "Z")
    private static boolean field3544 = false;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Lwm;")
    private static class152 field3548 = class157.method1048("radeon", 120);

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Z")
    private static boolean field3524 = true;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "Z")
    private static boolean field3547 = true;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    private static int field3525 = 0;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "F")
    private static float field3549 = 0.0F;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field3521 = 0;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "F")
    private static float field3536;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "F")
    private static float field3539;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    private static int field3519;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    private static int field3540;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!h", name = "E", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    private static int field3550;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Ljava/lang/String;")
    private static String field3527;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Ljava/lang/String;")
    private static String field3532;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field3551;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field3518;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field3542;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Z")
    public static boolean field3522;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Z")
    public static boolean field3526;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Z")
    public static boolean field3535;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Z")
    public static boolean field3537;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Z")
    public static boolean field3538;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "Z")
    public static boolean field3543;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "Z")
    public static boolean field3552;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 10)
    private static final void method1452(boolean arg0) {
        if (field3534 == arg0) {
            return;
        }
        if (arg0) {
            field3551.glEnableClientState(32885);
        } else {
            field3551.glDisableClientState(32885);
        }
        field3534 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V", line = 30)
    public static final void method1453(int arg0, int arg1, int arg2, int arg3) {
        method1480(0, 0, field3546, field3531, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 34)
    public static final void method1454(int arg0) {
        if (field3530 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3551.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field3551.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field3551.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field3551.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field3551.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field3551.glTexEnvi(8960, 34161, 34165);
        }
        field3530 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V", line = 62)
    public static final void method1455() {
        class89.method587(0, 0, -33);
        method1484();
        method1454(0);
        method1475(0);
        method1469(false);
        method1460(false);
        method1473(false);
        method1458();
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()V", line = 72)
    public static final void method1456() {
        class89.method587(0, 0, -53);
        method1484();
        method1457(-1);
        method1469(false);
        method1460(false);
        method1473(false);
        method1458();
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 81)
    public static final void method1457(int arg0) {
        if (field3541 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field3551.glDisable(3553);
        } else {
            if (field3541 == -1) {
                field3551.glEnable(3553);
            }
            field3551.glBindTexture(3553, arg0);
        }
        field3541 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V", line = 97)
    public static final void method1458() {
        if (field3529) {
            field3551.glMatrixMode(5890);
            field3551.glLoadIdentity();
            field3551.glMatrixMode(5888);
            field3529 = false;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 113)
    public static final void method1459(Canvas arg0) {
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

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Z)V", line = 133)
    public static final void method1460(boolean arg0) {
        if (field3524 == arg0) {
            return;
        }
        if (arg0) {
            field3551.glEnable(2929);
        } else {
            field3551.glDisable(2929);
        }
        field3524 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()V", line = 149)
    public static final void method1461() {
        field3551.glDepthMask(true);
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()V", line = 155)
    public static void method1462() {
        field3548 = null;
        field3532 = null;
        field3527 = null;
        field3551 = null;
        field3542 = null;
        field3518 = null;
        field3528 = null;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()V", line = 166)
    public static final void method1463() {
        field3551.glClear(256);
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()V", line = 171)
    public static final void method1464() {
        try {
            field3542.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FF)V", line = 185)
    public static final void method1465(float arg0, float arg1) {
        if (field3544 || field3549 == arg0 && field3517 == arg1) {
            return;
        }
        field3549 = arg0;
        field3517 = arg1;
        if (arg1 == 0.0F) {
            field3528[10] = field3539;
            field3528[14] = field3536;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field3536 * (1.0F - var2) / arg1;
            field3528[10] = field3539 + var4;
            field3528[14] = field3536 * var3;
        }
        field3551.glMatrixMode(5889);
        field3551.glLoadMatrixf(field3528, 0);
        field3551.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!h", name = "h", descriptor = "()F", line = 216)
    public static final float method1466() {
        return field3549;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFF)V", line = 220)
    public static final void method1467(float arg0, float arg1, float arg2) {
        field3551.glMatrixMode(5890);
        if (field3529) {
            field3551.glLoadIdentity();
        }
        field3551.glTranslatef(arg0, arg1, arg2);
        field3551.glMatrixMode(5888);
        field3529 = true;
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "()V", line = 234)
    public static final void method1468() {
        if (field3551 != null) {
            try {
                class148.method931((byte) -11);
            } catch (Throwable var7) {
            }
            field3551 = null;
        }
        if (field3518 != null) {
            class207.method1393();
            try {
                if (GLContext.getCurrent() == field3518) {
                    field3518.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field3518.destroy();
            } catch (Throwable var5) {
            }
            field3518 = null;
        }
        if (field3542 != null) {
            try {
                field3542.setRealized(false);
            } catch (Throwable var4) {
            }
            field3542 = null;
        }
        class24.method207();
        field3516 = false;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(Z)V", line = 286)
    public static final void method1469(boolean arg0) {
        if (field3520 == arg0) {
            return;
        }
        if (arg0) {
            field3551.glEnable(2896);
        } else {
            field3551.glDisable(2896);
        }
        field3520 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V", line = 300)
    public static final void method1470(int arg0, int arg1) {
        field3546 = arg0;
        field3531 = arg1;
        field3544 = false;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V", line = 306)
    public static final void method1471(int arg0) {
        field3551.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field3551.glClear(16640);
        field3551.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "()I", line = 323)
    private static final int method1472() {
        int var0 = 0;
        field3527 = field3551.glGetString(7936);
        field3532 = field3551.glGetString(7937);
        String var1 = field3527.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field3551.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field3540 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field3540 < 12) {
            var0 |= 0x2;
        }
        if (!field3551.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field3551.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field3551.glGetIntegerv(34018, var7, 0);
        field3545 = var7[0];
        field3551.glGetIntegerv(34929, var7, 0);
        field3550 = var7[0];
        field3551.glGetIntegerv(34930, var7, 0);
        field3519 = var7[0];
        if (field3545 < 2 || field3550 < 2 || field3519 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field3537 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field3526 = field3551.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field3535 = field3551.isExtensionAvailable("GL_ARB_multisample");
        field3552 = field3551.isExtensionAvailable("GL_ARB_texture_cube_map");
        field3543 = field3551.isExtensionAvailable("GL_ARB_vertex_program");
        field3538 = field3551.isExtensionAvailable("GL_EXT_texture3D");
        class152 var8 = method1481(field3532).method1023((byte) 78);
        if (var8.method988(field3548, 0) != -1) {
            int var9 = 0;
            class152[] var10 = var8.method1016(47, 90, 32).method993(32, (byte) -3);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class152 var12 = var10[var11];
                if (var12.method1000(0) >= 4 && var12.method1015(0, 19197, 4).method1004((byte) 95)) {
                    var9 = var12.method1015(0, 19197, 4).method998(-112);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field3526 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field3538 = false;
            }
            field3522 = field3526;
        }
        if (field3526) {
            try {
                int[] var13 = new int[1];
                field3551.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(Z)V", line = 436)
    public static final void method1473(boolean arg0) {
        if (field3547 == arg0) {
            return;
        }
        if (arg0) {
            field3551.glEnable(2912);
        } else {
            field3551.glDisable(2912);
        }
        field3547 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "()V", line = 447)
    public static final void method1474() {
        class89.method587(0, 0, -19);
        method1484();
        method1454(0);
        method1475(0);
        method1469(false);
        method1460(false);
        method1473(false);
        method1458();
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V", line = 458)
    public static final void method1475(int arg0) {
        if (field3525 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field3551.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field3551.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field3551.glTexEnvi(8960, 34162, 260);
        }
        field3525 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 475)
    public static final int method1476(Canvas arg0, int arg1) {
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
            field3542 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field3542.setRealized(true);
            int var4 = 0;
            while (true) {
                field3518 = field3542.createContext((GLContext) null);
                try {
                    int var5 = field3518.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class4.method19(0, 1000L);
            }
            field3551 = field3518.getGL();
            new GLU();
            field3516 = true;
            field3546 = arg0.getSize().width;
            field3531 = arg0.getSize().height;
            int var7 = method1472();
            if (var7 != 0) {
                method1468();
                return var7;
            }
            method1485();
            method1486();
            field3551.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field3542.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1468();
                        return -3;
                    }
                    class4.method19(0, 100L);
                }
            }
            field3551.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1468();
            return -5;
        }
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "()V", line = 562)
    public static final void method1477() {
        class89.method587(0, 0, -62);
        method1484();
        method1454(1);
        method1475(1);
        method1469(false);
        method1460(false);
        method1473(false);
        method1458();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIII)V", line = 574)
    public static final void method1478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field3546 - arg0;
        int var8 = -arg1;
        int var9 = field3531 - arg1;
        field3551.glMatrixMode(5889);
        field3551.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field3551.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field3551.glViewport(0, 0, field3546, field3531);
        field3551.glMatrixMode(5888);
        field3551.glLoadIdentity();
        field3551.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field3544 = false;
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "()V", line = 597)
    public static final void method1479() {
        field3551.glDepthMask(false);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIFFII)V", line = 601)
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field3551.glMatrixMode(5889);
        field3551.glLoadIdentity();
        method1487((float) var10 * field3533, (float) var11 * field3533, (float) (-var13) * field3533, (float) (-var12) * field3533, 50.0F, 3584.0F);
        field3551.glViewport(arg0, field3531 - arg1 - arg3, arg2, arg3);
        field3551.glMatrixMode(5888);
        field3551.glLoadIdentity();
        field3551.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field3551.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field3551.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field3544 = false;
        class104.field1496 = var10;
        class100.field1464 = var11;
        class265.field4469 = var12;
        class77.field1092 = var13;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/lang/String;)Lwm;", line = 634)
    private static final class152 method1481(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class117.method775(var1, var1.length, (byte) 66, 0);
    }

    @OriginalMember(owner = "client!h", name = "n", descriptor = "()V", line = 642)
    public static final void method1482() {
        int[] var0 = new int[2];
        field3551.glGetIntegerv(3073, var0, 0);
        field3551.glGetIntegerv(3074, var0, 1);
        field3551.glDrawBuffer(1026);
        field3551.glReadBuffer(1024);
        method1457(-1);
        field3551.glPushAttrib(8192);
        field3551.glDisable(2912);
        field3551.glDisable(3042);
        field3551.glDisable(2929);
        field3551.glDisable(3008);
        field3551.glRasterPos2i(0, 0);
        field3551.glCopyPixels(0, 0, field3546, field3531, 6144);
        field3551.glPopAttrib();
        field3551.glDrawBuffer(var0[0]);
        field3551.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!h", name = "o", descriptor = "()V", line = 660)
    public static final void method1483() {
        if (class81.field1131) {
            method1469(true);
            method1452(true);
        } else {
            method1469(false);
            method1452(false);
        }
    }

    @OriginalMember(owner = "client!h", name = "p", descriptor = "()V", line = 674)
    private static final void method1484() {
        if (field3544) {
            return;
        }
        field3551.glMatrixMode(5889);
        field3551.glLoadIdentity();
        field3551.glOrtho(0.0D, (double) field3546, 0.0D, (double) field3531, -1.0D, 1.0D);
        field3551.glViewport(0, 0, field3546, field3531);
        field3551.glMatrixMode(5888);
        field3551.glLoadIdentity();
        field3544 = true;
    }

    @OriginalMember(owner = "client!h", name = "q", descriptor = "()V", line = 692)
    private static final void method1485() {
        int[] var0 = new int[1];
        field3551.glGenTextures(1, var0, 0);
        field3523 = var0[0];
        field3551.glBindTexture(3553, field3523);
        field3551.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class24.method202();
        class269.method1841(-6770);
    }

    @OriginalMember(owner = "client!h", name = "r", descriptor = "()V", line = 721)
    private static final void method1486() {
        field3544 = false;
        field3551.glDisable(3553);
        field3541 = -1;
        field3551.glTexEnvi(8960, 8704, 34160);
        field3551.glTexEnvi(8960, 34161, 8448);
        field3530 = 0;
        field3551.glTexEnvi(8960, 34162, 8448);
        field3525 = 0;
        field3551.glEnable(2896);
        field3551.glEnable(2912);
        field3551.glEnable(2929);
        field3520 = true;
        field3524 = true;
        field3547 = true;
        class59.method395(105);
        field3551.glActiveTexture(33985);
        field3551.glTexEnvi(8960, 8704, 34160);
        field3551.glTexEnvi(8960, 34161, 8448);
        field3551.glTexEnvi(8960, 34162, 8448);
        field3551.glActiveTexture(33984);
        field3551.setSwapInterval(0);
        field3551.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field3551.glShadeModel(7425);
        field3551.glClearDepth(1.0D);
        field3551.glDepthFunc(515);
        method1461();
        field3551.glMatrixMode(5890);
        field3551.glLoadIdentity();
        field3551.glPolygonMode(1028, 6914);
        field3551.glEnable(2884);
        field3551.glCullFace(1029);
        field3551.glEnable(3042);
        field3551.glBlendFunc(770, 771);
        field3551.glEnable(3008);
        field3551.glAlphaFunc(516, 0.0F);
        field3551.glEnableClientState(32884);
        field3551.glEnableClientState(32885);
        field3534 = true;
        field3551.glEnableClientState(32886);
        field3551.glEnableClientState(32888);
        field3551.glMatrixMode(5888);
        field3551.glLoadIdentity();
        class14.method90();
        class24.method205();
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(FFFFFF)V", line = 768)
    private static final void method1487(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field3528[0] = var6 / (arg1 - arg0);
        field3528[1] = 0.0F;
        field3528[2] = 0.0F;
        field3528[3] = 0.0F;
        field3528[4] = 0.0F;
        field3528[5] = var6 / (arg3 - arg2);
        field3528[6] = 0.0F;
        field3528[7] = 0.0F;
        field3528[8] = (arg0 + arg1) / (arg1 - arg0);
        field3528[9] = (arg2 + arg3) / (arg3 - arg2);
        field3528[10] = field3539 = -(arg4 + arg5) / (arg5 - arg4);
        field3528[11] = -1.0F;
        field3528[12] = 0.0F;
        field3528[13] = 0.0F;
        field3528[14] = field3536 = -(arg5 * var6) / (arg5 - arg4);
        field3528[15] = 0.0F;
        field3551.glLoadMatrixf(field3528, 0);
        field3549 = 0.0F;
        field3517 = 0.0F;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(F)V", line = 790)
    public static final void method1488(float arg0) {
        method1465(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!h", name = "s", descriptor = "()F", line = 794)
    public static final float method1489() {
        return field3517;
    }
}
