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

@OriginalClass("client!pd")
public class class109 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Z")
    public static boolean field1458 = false;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field1472 = 0;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "F")
    private static float field1479 = 0.09765625F;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "F")
    private static float field1481 = 0.0F;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "Z")
    public static boolean field1485 = true;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    private static int field1461 = -1;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "[F")
    private static float[] field1463 = new float[16];

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "Z")
    private static boolean field1493 = false;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    private static int field1488 = -1;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "F")
    private static float field1484 = 0.0F;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    private static int field1494 = 0;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "Z")
    private static boolean field1498 = false;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "Z")
    private static boolean field1477 = true;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    private static int field1495 = -1;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Z")
    private static boolean field1497 = true;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Z")
    private static boolean field1460 = true;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    private static int field1500 = 0;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "F")
    private static float field1471;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "F")
    private static float field1501;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    private static int field1454;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    private static int field1455;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    private static int field1465;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    private static int field1467;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    private static int field1483;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    private static int field1487;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    private static int field1490;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Ljava/lang/String;")
    private static String field1462;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "Ljava/lang/String;")
    private static String field1466;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field1456;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field1459;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field1478;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Z")
    public static boolean field1457;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Z")
    public static boolean field1464;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Z")
    public static boolean field1469;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Z")
    public static boolean field1470;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Z")
    public static boolean field1473;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Z")
    public static boolean field1475;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Z")
    public static boolean field1480;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Z")
    public static boolean field1486;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "Z")
    public static boolean field1491;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "Z")
    public static boolean field1492;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "Z")
    public static boolean field1496;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()V", line = 10)
    public static final void method739() {
        if (field1456 != null) {
            try {
                class189.method1388();
                class246.method1773(0);
            } catch (Throwable var7) {
            }
            field1456 = null;
        }
        if (field1459 != null) {
            class103.method717();
            try {
                if (GLContext.getCurrent() == field1459) {
                    field1459.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field1459.destroy();
            } catch (Throwable var5) {
            }
            field1459 = null;
        }
        if (field1478 != null) {
            try {
                field1478.setRealized(false);
            } catch (Throwable var4) {
            }
            field1478 = null;
        }
        class176.method1296();
        field1458 = false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V", line = 61)
    public static final void method740(boolean arg0) {
        if (field1477 == arg0) {
            return;
        }
        if (arg0) {
            field1456.glEnable(2912);
        } else {
            field1456.glDisable(2912);
        }
        field1477 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 74)
    private static final int method741(Canvas arg0, int arg1, GLContext arg2) {
        try {
            if (!arg0.isDisplayable()) {
                return -1;
            }
            GLCapabilities var3 = new GLCapabilities();
            if (arg1 > 0) {
                var3.setSampleBuffers(true);
                var3.setNumSamples(arg1);
            }
            var3.setAlphaBits(8);
            GLDrawableFactory var4 = GLDrawableFactory.getFactory();
            field1478 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field1478.setRealized(true);
            int var5 = 0;
            while (true) {
                field1459 = field1478.createContext(arg2);
                try {
                    int var6 = field1459.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class272.method1918((byte) 22, 1000L);
            }
            field1456 = field1459.getGL();
            new GLU();
            field1458 = true;
            field1482 = arg0.getSize().width;
            field1499 = arg0.getSize().height;
            int var8 = method746();
            if (var8 != 0) {
                method739();
                return var8;
            }
            method778();
            method744();
            field1456.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field1478.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method739();
                        return -3;
                    }
                    class272.method1918((byte) 22, 100L);
                }
            }
            field1456.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method739();
            return -5;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V", line = 159)
    public static final void method742(int arg0, int arg1) {
        field1482 = arg0;
        field1499 = arg1;
        field1493 = false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(FFFFFF)V", line = 167)
    private static final void method743(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field1463[0] = var6 / (arg1 - arg0);
        field1463[1] = 0.0F;
        field1463[2] = 0.0F;
        field1463[3] = 0.0F;
        field1463[4] = 0.0F;
        field1463[5] = var6 / (arg3 - arg2);
        field1463[6] = 0.0F;
        field1463[7] = 0.0F;
        field1463[8] = (arg0 + arg1) / (arg1 - arg0);
        field1463[9] = (arg2 + arg3) / (arg3 - arg2);
        field1463[10] = field1471 = -(arg4 + arg5) / (arg5 - arg4);
        field1463[11] = -1.0F;
        field1463[12] = 0.0F;
        field1463[13] = 0.0F;
        field1463[14] = field1501 = -(arg5 * var6) / (arg5 - arg4);
        field1463[15] = 0.0F;
        field1456.glLoadMatrixf(field1463, 0);
        field1484 = 0.0F;
        field1481 = 0.0F;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 189)
    private static final void method744() {
        field1493 = false;
        field1456.glDisable(3553);
        field1495 = -1;
        field1456.glTexEnvi(8960, 8704, 34160);
        field1456.glTexEnvi(8960, 34161, 8448);
        field1494 = 0;
        field1456.glTexEnvi(8960, 34162, 8448);
        field1500 = 0;
        field1456.glEnable(2896);
        field1456.glEnable(2912);
        field1456.glEnable(2929);
        field1497 = true;
        field1460 = true;
        field1477 = true;
        class333.method2323(false);
        field1456.glActiveTexture(33985);
        field1456.glTexEnvi(8960, 8704, 34160);
        field1456.glTexEnvi(8960, 34161, 8448);
        field1456.glTexEnvi(8960, 34162, 8448);
        field1456.glActiveTexture(33984);
        field1456.setSwapInterval(0);
        field1456.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field1456.glShadeModel(7425);
        field1456.glClearDepth(1.0D);
        field1456.glDepthFunc(515);
        method776();
        field1456.glMatrixMode(5890);
        field1456.glLoadIdentity();
        field1456.glPolygonMode(1028, 6914);
        field1456.glEnable(2884);
        field1456.glCullFace(1029);
        field1456.glEnable(3042);
        field1456.glBlendFunc(770, 771);
        field1456.glEnable(3008);
        field1456.glAlphaFunc(516, 0.0F);
        field1456.glEnableClientState(32884);
        field1456.glEnableClientState(32885);
        field1485 = true;
        field1456.glEnableClientState(32886);
        field1456.glEnableClientState(32888);
        field1456.glMatrixMode(5888);
        field1456.glLoadIdentity();
        class115.method810();
        class176.method1310();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(F)V", line = 236)
    public static final void method745(float arg0) {
        method760(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()I", line = 240)
    private static final int method746() {
        int var0 = 0;
        field1462 = field1456.glGetString(7936);
        field1466 = field1456.glGetString(7937);
        String var1 = field1462.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field1456.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field1455 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field1455 < 12) {
            var0 |= 0x2;
        }
        if (!field1456.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field1456.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field1456.glGetIntegerv(34018, var7, 0);
        field1489 = var7[0];
        field1456.glGetIntegerv(34929, var7, 0);
        field1487 = var7[0];
        field1456.glGetIntegerv(34930, var7, 0);
        field1467 = var7[0];
        if (field1489 < 2 || field1487 < 2 || field1467 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field1464 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field1496 = field1456.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field1475 = field1456.isExtensionAvailable("GL_ARB_multisample");
        field1491 = field1456.isExtensionAvailable("GL_ARB_texture_cube_map");
        field1486 = field1456.isExtensionAvailable("GL_ARB_vertex_program");
        field1480 = field1456.isExtensionAvailable("GL_EXT_framebuffer_object");
        field1456.isExtensionAvailable("GL_ARB_vertex_shader");
        field1473 = field1456.isExtensionAvailable("GL_ARB_fragment_shader");
        field1469 = field1456.isExtensionAvailable("GL_EXT_texture3D");
        field1470 = field1456.isExtensionAvailable("GL_ARB_texture_rectangle");
        field1457 = field1456.isExtensionAvailable("GL_ARB_texture_float");
        String var8 = field1466.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class215.method1569(1, var8.replace('/', ' '), ' ');
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class195.method1445(10066, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class195.method1445(10066, var13.substring(0, 4))) {
                        var9 = class192.method1420(var13.substring(0, 4), 10);
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field1496 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field1469 = false;
            }
            if (var9 >= 9200 || var10) {
                field1457 = false;
            }
            field1492 = field1496;
        }
        if (field1496) {
            try {
                int[] var14 = new int[1];
                field1456.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 376)
    public static final void method747(Canvas arg0) {
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

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V", line = 403)
    public static final void method748(int arg0, int arg1, int arg2, int arg3) {
        field1456.glMatrixMode(5889);
        field1456.glLoadIdentity();
        field1456.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field1456.glMatrixMode(5888);
        field1456.glLoadIdentity();
        method765(field1474, field1468, field1482, field1499);
        field1493 = false;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 413)
    public static final void method749(boolean arg0) {
        if (field1497 == arg0) {
            return;
        }
        if (arg0) {
            field1456.glEnable(2896);
        } else {
            field1456.glDisable(2896);
        }
        field1497 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIFFII)V", line = 427)
    public static final void method750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field1456.glMatrixMode(5889);
        field1456.glLoadIdentity();
        method743((float) var10 * field1479, (float) var11 * field1479, (float) (-var13) * field1479, (float) (-var12) * field1479, 50.0F, 3584.0F);
        method765(arg0, field1499 - arg1 - arg3, arg2, arg3);
        field1456.glMatrixMode(5888);
        field1456.glLoadIdentity();
        field1456.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field1456.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field1456.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field1493 = false;
        class11.field206 = var10;
        class259.field4074 = var11;
        class306.field4781 = var12;
        class249.field3925 = var13;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()V", line = 454)
    public static final void method751() {
        if (class220.field3482) {
            method749(true);
            method773(true);
        } else {
            method749(false);
            method773(false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 469)
    public static final void method752(int arg0) {
        if (field1495 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field1456.glDisable(3553);
        } else {
            if (field1495 == -1) {
                field1456.glEnable(3553);
            }
            field1456.glBindTexture(3553, arg0);
        }
        field1495 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)V", line = 493)
    public static final void method753(boolean arg0) {
        if (field1460 == arg0) {
            return;
        }
        if (arg0) {
            field1456.glEnable(2929);
        } else {
            field1456.glDisable(2929);
        }
        field1460 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()V", line = 506)
    public static final void method754() {
        class256.method1855(0, -123, 0);
        method758();
        method766(0);
        method756(0);
        method749(false);
        method753(false);
        method740(false);
        method762();
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "()V", line = 520)
    public static final void method755() {
        field1456.glClear(256);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 530)
    public static final void method756(int arg0) {
        if (field1500 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1456.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field1456.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field1456.glTexEnvi(8960, 34162, 260);
        }
        field1500 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 547)
    public static final void method757(int arg0) {
        field1456.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1456.glClear(16640);
        field1456.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "()V", line = 552)
    private static final void method758() {
        if (field1493) {
            return;
        }
        field1456.glMatrixMode(5889);
        field1456.glLoadIdentity();
        field1456.glOrtho(0.0D, (double) field1482, 0.0D, (double) field1499, -1.0D, 1.0D);
        method765(0, 0, field1482, field1499);
        field1456.glMatrixMode(5888);
        field1456.glLoadIdentity();
        field1493 = true;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V", line = 565)
    public static final void method759(int arg0, int arg1) {
        field1474 = arg0;
        field1468 = arg1;
        method767();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(FF)V", line = 572)
    public static final void method760(float arg0, float arg1) {
        if (field1493 || field1484 == arg0 && field1481 == arg1) {
            return;
        }
        field1484 = arg0;
        field1481 = arg1;
        if (arg1 == 0.0F) {
            field1463[10] = field1471;
            field1463[14] = field1501;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field1501 * (1.0F - var2) / arg1;
            field1463[10] = field1471 + var4;
            field1463[14] = field1501 * var3;
        }
        field1456.glMatrixMode(5889);
        field1456.glLoadMatrixf(field1463, 0);
        field1456.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "()V", line = 605)
    public static final void method761() {
        class256.method1855(0, -112, 0);
        method758();
        method766(1);
        method756(1);
        method749(false);
        method753(false);
        method740(false);
        method762();
    }

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "()V", line = 618)
    public static final void method762() {
        if (field1498) {
            field1456.glMatrixMode(5890);
            field1456.glLoadIdentity();
            field1456.glMatrixMode(5888);
            field1498 = false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIII)V", line = 635)
    public static final void method763(int arg0, int arg1, int arg2, int arg3) {
        method750(0, 0, field1482, field1499, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "()V", line = 647)
    public static final void method764() {
        class256.method1855(0, -113, 0);
        method758();
        method766(0);
        method756(0);
        method749(false);
        method753(false);
        method740(false);
        method762();
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(IIII)V", line = 657)
    private static final void method765(int arg0, int arg1, int arg2, int arg3) {
        field1483 = arg0;
        field1490 = arg1;
        field1454 = arg2;
        field1465 = arg3;
        method767();
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 668)
    public static final void method766(int arg0) {
        if (field1494 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1456.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field1456.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field1456.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field1456.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field1456.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field1456.glTexEnvi(8960, 34161, 34165);
        }
        field1494 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "()V", line = 692)
    private static final void method767() {
        field1456.glViewport(field1483 + field1474, field1490 + field1468, field1454, field1465);
    }

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "()V", line = 695)
    public static final void method768() {
        field1456.glDepthMask(false);
    }

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "()V", line = 699)
    public static final void method769() {
        int[] var0 = new int[2];
        field1456.glGetIntegerv(3073, var0, 0);
        field1456.glGetIntegerv(3074, var0, 1);
        field1456.glDrawBuffer(1026);
        field1456.glReadBuffer(1024);
        method752(-1);
        field1456.glPushAttrib(8192);
        field1456.glDisable(2912);
        field1456.glDisable(3042);
        field1456.glDisable(2929);
        field1456.glDisable(3008);
        field1456.glRasterPos2i(0, 0);
        field1456.glCopyPixels(0, 0, field1482, field1499, 6144);
        field1456.glPopAttrib();
        field1456.glDrawBuffer(var0[0]);
        field1456.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "()V", line = 720)
    public static void method770() {
        field1466 = null;
        field1462 = null;
        field1456 = null;
        field1478 = null;
        field1459 = null;
        field1463 = null;
    }

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "()I", line = 740)
    public static final int method771() {
        if (field1480 && (field1461 <= 0 || field1488 != class103.field1369)) {
            int[] var0 = new int[1];
            field1456.glGenFramebuffersEXT(1, var0, 0);
            field1488 = class103.field1369;
            field1461 = var0[0];
        }
        return field1461;
    }

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "()F", line = 753)
    public static final float method772() {
        return field1481;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(Z)V", line = 756)
    private static final void method773(boolean arg0) {
        if (field1485 == arg0) {
            return;
        }
        if (arg0) {
            field1456.glEnableClientState(32885);
        } else {
            field1456.glDisableClientState(32885);
        }
        field1485 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(FFF)V", line = 767)
    public static final void method774(float arg0, float arg1, float arg2) {
        field1456.glMatrixMode(5890);
        if (field1498) {
            field1456.glLoadIdentity();
        }
        field1456.glTranslatef(arg0, arg1, arg2);
        field1456.glMatrixMode(5888);
        field1498 = true;
    }

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "()V", line = 778)
    public static final void method775() {
        try {
            field1478.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "()V", line = 789)
    public static final void method776() {
        field1456.glDepthMask(true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 796)
    public static final int method777(Canvas arg0, int arg1) {
        return method741(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "()V", line = 810)
    private static final void method778() {
        int[] var0 = new int[1];
        field1456.glGenTextures(1, var0, 0);
        field1476 = var0[0];
        field1456.glBindTexture(3553, field1476);
        field1456.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class176.method1302();
        class269.method1909(2047);
        class189.method1387();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII)V", line = 825)
    public static final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field1482 - arg0;
        int var8 = -arg1;
        int var9 = field1499 - arg1;
        field1456.glMatrixMode(5889);
        field1456.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field1456.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method765(0, 0, field1482, field1499);
        field1456.glMatrixMode(5888);
        field1456.glLoadIdentity();
        field1456.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field1493 = false;
    }

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "()V", line = 851)
    public static final void method780() {
        class256.method1855(0, -119, 0);
        method758();
        method752(-1);
        method749(false);
        method753(false);
        method740(false);
        method762();
    }

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "()F", line = 869)
    public static final float method781() {
        return field1484;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 873)
    public static final void method782(int arg0) {
        field1456.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1456.glClear(16384);
        field1456.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }
}
