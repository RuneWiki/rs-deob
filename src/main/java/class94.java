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

@OriginalClass("client!o")
public class class94 {

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Z")
    private static boolean field1480 = false;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    private static int field1482 = -1;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "[F")
    private static float[] field1481 = new float[16];

    @OriginalMember(owner = "client!o", name = "d", descriptor = "F")
    private static float field1476 = 0.0F;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Z")
    private static boolean field1498 = true;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Z")
    private static boolean field1491 = true;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Z")
    private static boolean field1497 = true;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field1499 = 0;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    private static int field1494 = -1;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "F")
    private static float field1493 = 0.0F;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Z")
    public static boolean field1516 = false;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    private static int field1478 = 0;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    private static int field1479 = 0;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Z")
    private static boolean field1484 = false;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "F")
    private static float field1517 = 0.09765625F;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "Z")
    public static boolean field1520 = true;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    private static int field1519 = -1;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "F")
    private static float field1474;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "F")
    private static float field1508;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    private static int field1489;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    private static int field1492;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    private static int field1503;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    private static int field1505;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    private static int field1506;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    private static int field1509;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    private static int field1514;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Ljava/lang/String;")
    private static String field1475;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Ljava/lang/String;")
    private static String field1483;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field1473;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field1502;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field1487;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Z")
    public static boolean field1490;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Z")
    public static boolean field1495;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "Z")
    public static boolean field1500;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Z")
    public static boolean field1501;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "Z")
    public static boolean field1504;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Z")
    public static boolean field1507;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Z")
    public static boolean field1510;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Z")
    public static boolean field1511;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Z")
    public static boolean field1512;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "Z")
    public static boolean field1515;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "Z")
    public static boolean field1518;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 12)
    private static final int method667(Canvas arg0, int arg1, GLContext arg2) {
        try {
            if (!arg0.isDisplayable()) {
                return -1;
            }
            GLCapabilities var3 = new GLCapabilities();
            if (arg1 > 0) {
                var3.setSampleBuffers(true);
                var3.setNumSamples(arg1);
            }
            GLDrawableFactory var4 = GLDrawableFactory.getFactory();
            field1487 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field1487.setRealized(true);
            int var5 = 0;
            while (true) {
                field1502 = field1487.createContext(arg2);
                try {
                    int var6 = field1502.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class5.method26(0, 1000L);
            }
            field1473 = field1502.getGL();
            new GLU();
            field1516 = true;
            field1486 = arg0.getSize().width;
            field1513 = arg0.getSize().height;
            int var8 = method670();
            if (var8 != 0) {
                method700();
                return var8;
            }
            method682();
            method686();
            field1473.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field1487.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method700();
                        return -3;
                    }
                    class5.method26(0, 100L);
                }
            }
            field1473.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method700();
            return -5;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V", line = 96)
    public static final void method668(boolean arg0) {
        if (field1498 == arg0) {
            return;
        }
        if (arg0) {
            field1473.glEnable(2896);
        } else {
            field1473.glDisable(2896);
        }
        field1498 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 108)
    public static final int method669(Canvas arg0, int arg1) {
        return method667(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()I", line = 112)
    private static final int method670() {
        int var0 = 0;
        field1483 = field1473.glGetString(7936);
        field1475 = field1473.glGetString(7937);
        String var1 = field1483.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field1473.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field1489 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field1489 < 12) {
            var0 |= 0x2;
        }
        if (!field1473.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field1473.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field1473.glGetIntegerv(34018, var7, 0);
        field1477 = var7[0];
        field1473.glGetIntegerv(34929, var7, 0);
        field1514 = var7[0];
        field1473.glGetIntegerv(34930, var7, 0);
        field1503 = var7[0];
        if (field1477 < 2 || field1514 < 2 || field1503 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field1512 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field1507 = field1473.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field1490 = field1473.isExtensionAvailable("GL_ARB_multisample");
        field1515 = field1473.isExtensionAvailable("GL_ARB_texture_cube_map");
        field1501 = field1473.isExtensionAvailable("GL_ARB_vertex_program");
        field1511 = field1473.isExtensionAvailable("GL_EXT_framebuffer_object");
        field1473.isExtensionAvailable("GL_ARB_vertex_shader");
        field1504 = field1473.isExtensionAvailable("GL_ARB_fragment_shader");
        field1500 = field1473.isExtensionAvailable("GL_EXT_texture3D");
        field1518 = field1473.isExtensionAvailable("GL_ARB_texture_rectangle");
        field1510 = field1473.isExtensionAvailable("GL_ARB_texture_float");
        String var8 = field1475.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class208.method1479((byte) 116, var8.replace('/', ' '), ' ');
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class206.method1468((byte) -89, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class206.method1468((byte) -89, var13.substring(0, 4))) {
                        var9 = class112.method832(false, var13.substring(0, 4));
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field1507 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field1500 = false;
            }
            if (var9 >= 9200 || var10) {
                field1510 = false;
            }
            field1495 = field1507;
        }
        if (field1507) {
            try {
                int[] var14 = new int[1];
                field1473.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(F)V", line = 244)
    public static final void method671(float arg0) {
        method680(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()F", line = 248)
    public static final float method672() {
        return field1476;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()V", line = 251)
    public static final void method673() {
        class37.method313(0, 0, 0);
        method678();
        method698(-1);
        method668(false);
        method696(false);
        method693(false);
        method695();
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "()V", line = 265)
    public static final void method674() {
        field1473.glDepthMask(false);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 269)
    public static final void method675(int arg0) {
        if (field1479 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1473.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field1473.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field1473.glTexEnvi(8960, 34162, 260);
        }
        field1479 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 285)
    public static final void method676(int arg0, int arg1) {
        field1486 = arg0;
        field1513 = arg1;
        field1480 = false;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 291)
    public static final void method677(int arg0) {
        if (field1478 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1473.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field1473.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field1473.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field1473.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field1473.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field1473.glTexEnvi(8960, 34161, 34165);
        }
        field1478 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "()V", line = 322)
    private static final void method678() {
        if (field1480) {
            return;
        }
        field1473.glMatrixMode(5889);
        field1473.glLoadIdentity();
        field1473.glOrtho(0.0D, (double) field1486, 0.0D, (double) field1513, -1.0D, 1.0D);
        method685(0, 0, field1486, field1513);
        field1473.glMatrixMode(5888);
        field1473.glLoadIdentity();
        field1480 = true;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 334)
    public static final void method679(int arg0) {
        field1473.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1473.glClear(16384);
        field1473.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FF)V", line = 340)
    public static final void method680(float arg0, float arg1) {
        if (field1480 || field1493 == arg0 && field1476 == arg1) {
            return;
        }
        field1493 = arg0;
        field1476 = arg1;
        if (arg1 == 0.0F) {
            field1481[10] = field1474;
            field1481[14] = field1508;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field1508 * (1.0F - var2) / arg1;
            field1481[10] = field1474 + var4;
            field1481[14] = field1508 * var3;
        }
        field1473.glMatrixMode(5889);
        field1473.glLoadMatrixf(field1481, 0);
        field1473.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "()V", line = 374)
    public static final void method681() {
        class37.method313(0, 0, 0);
        method678();
        method677(1);
        method675(1);
        method668(false);
        method696(false);
        method693(false);
        method695();
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "()V", line = 389)
    private static final void method682() {
        int[] var0 = new int[1];
        field1473.glGenTextures(1, var0, 0);
        field1485 = var0[0];
        field1473.glBindTexture(3553, field1485);
        field1473.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class183.method1319();
        class174.method1253(-18502);
        class277.method1902();
    }

    @OriginalMember(owner = "client!o", name = "h", descriptor = "()V", line = 402)
    public static final void method683() {
        field1473.glDepthMask(true);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 408)
    public static final void method684(Canvas arg0) {
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

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)V", line = 428)
    private static final void method685(int arg0, int arg1, int arg2, int arg3) {
        field1509 = arg0;
        field1506 = arg1;
        field1492 = arg2;
        field1505 = arg3;
        method702();
    }

    @OriginalMember(owner = "client!o", name = "i", descriptor = "()V", line = 443)
    private static final void method686() {
        field1480 = false;
        field1473.glDisable(3553);
        field1519 = -1;
        field1473.glTexEnvi(8960, 8704, 34160);
        field1473.glTexEnvi(8960, 34161, 8448);
        field1478 = 0;
        field1473.glTexEnvi(8960, 34162, 8448);
        field1479 = 0;
        field1473.glEnable(2896);
        field1473.glEnable(2912);
        field1473.glEnable(2929);
        field1498 = true;
        field1491 = true;
        field1497 = true;
        class194.method1380((byte) 46);
        field1473.glActiveTexture(33985);
        field1473.glTexEnvi(8960, 8704, 34160);
        field1473.glTexEnvi(8960, 34161, 8448);
        field1473.glTexEnvi(8960, 34162, 8448);
        field1473.glActiveTexture(33984);
        field1473.setSwapInterval(0);
        field1473.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field1473.glShadeModel(7425);
        field1473.glClearDepth(1.0D);
        field1473.glDepthFunc(515);
        method683();
        field1473.glMatrixMode(5890);
        field1473.glLoadIdentity();
        field1473.glPolygonMode(1028, 6914);
        field1473.glEnable(2884);
        field1473.glCullFace(1029);
        field1473.glEnable(3042);
        field1473.glBlendFunc(770, 771);
        field1473.glEnable(3008);
        field1473.glAlphaFunc(516, 0.0F);
        field1473.glEnableClientState(32884);
        field1473.glEnableClientState(32885);
        field1520 = true;
        field1473.glEnableClientState(32886);
        field1473.glEnableClientState(32888);
        field1473.glMatrixMode(5888);
        field1473.glLoadIdentity();
        class250.method1735();
        class183.method1316();
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(IIII)V", line = 490)
    public static final void method687(int arg0, int arg1, int arg2, int arg3) {
        field1473.glMatrixMode(5889);
        field1473.glLoadIdentity();
        field1473.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field1473.glMatrixMode(5888);
        field1473.glLoadIdentity();
        method685(field1488, field1496, field1486, field1513);
        field1480 = false;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(IIII)V", line = 501)
    public static final void method688(int arg0, int arg1, int arg2, int arg3) {
        method691(0, 0, field1486, field1513, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFFFFF)V", line = 507)
    private static final void method689(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field1481[0] = var6 / (arg1 - arg0);
        field1481[1] = 0.0F;
        field1481[2] = 0.0F;
        field1481[3] = 0.0F;
        field1481[4] = 0.0F;
        field1481[5] = var6 / (arg3 - arg2);
        field1481[6] = 0.0F;
        field1481[7] = 0.0F;
        field1481[8] = (arg0 + arg1) / (arg1 - arg0);
        field1481[9] = (arg2 + arg3) / (arg3 - arg2);
        field1481[10] = field1474 = -(arg4 + arg5) / (arg5 - arg4);
        field1481[11] = -1.0F;
        field1481[12] = 0.0F;
        field1481[13] = 0.0F;
        field1481[14] = field1508 = -(arg5 * var6) / (arg5 - arg4);
        field1481[15] = 0.0F;
        field1473.glLoadMatrixf(field1481, 0);
        field1493 = 0.0F;
        field1476 = 0.0F;
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "()V", line = 534)
    public static final void method690() {
        class37.method313(0, 0, 0);
        method678();
        method677(0);
        method675(0);
        method668(false);
        method696(false);
        method693(false);
        method695();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIFFII)V", line = 545)
    public static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field1473.glMatrixMode(5889);
        field1473.glLoadIdentity();
        method689((float) var10 * field1517, (float) var11 * field1517, (float) (-var13) * field1517, (float) (-var12) * field1517, 50.0F, 3584.0F);
        method685(arg0, field1513 - arg1 - arg3, arg2, arg3);
        field1473.glMatrixMode(5888);
        field1473.glLoadIdentity();
        field1473.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field1473.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field1473.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field1480 = false;
        class325.field5062 = var10;
        class5.field50 = var11;
        class91.field1445 = var12;
        class53.field899 = var13;
    }

    @OriginalMember(owner = "client!o", name = "k", descriptor = "()V", line = 580)
    public static final void method692() {
        if (class208.field3191) {
            method668(true);
            method709(true);
        } else {
            method668(false);
            method709(false);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V", line = 597)
    public static final void method693(boolean arg0) {
        if (field1497 == arg0) {
            return;
        }
        if (arg0) {
            field1473.glEnable(2912);
        } else {
            field1473.glDisable(2912);
        }
        field1497 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "l", descriptor = "()F", line = 608)
    public static final float method694() {
        return field1493;
    }

    @OriginalMember(owner = "client!o", name = "m", descriptor = "()V", line = 611)
    public static final void method695() {
        if (field1484) {
            field1473.glMatrixMode(5890);
            field1473.glLoadIdentity();
            field1473.glMatrixMode(5888);
            field1484 = false;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(Z)V", line = 627)
    public static final void method696(boolean arg0) {
        if (field1491 == arg0) {
            return;
        }
        if (arg0) {
            field1473.glEnable(2929);
        } else {
            field1473.glDisable(2929);
        }
        field1491 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "n", descriptor = "()V", line = 641)
    public static void method697() {
        field1475 = null;
        field1483 = null;
        field1473 = null;
        field1487 = null;
        field1502 = null;
        field1481 = null;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 655)
    public static final void method698(int arg0) {
        if (field1519 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field1473.glDisable(3553);
        } else {
            if (field1519 == -1) {
                field1473.glEnable(3553);
            }
            field1473.glBindTexture(3553, arg0);
        }
        field1519 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "o", descriptor = "()I", line = 675)
    public static final int method699() {
        if (field1511 && (field1494 <= 0 || field1482 != class198.field2966)) {
            int[] var0 = new int[1];
            field1473.glGenFramebuffersEXT(1, var0, 0);
            field1482 = class198.field2966;
            field1494 = var0[0];
        }
        return field1494;
    }

    @OriginalMember(owner = "client!o", name = "p", descriptor = "()V", line = 687)
    public static final void method700() {
        if (field1473 != null) {
            try {
                class277.method1899();
                class280.method1918(-76);
            } catch (Throwable var7) {
            }
            field1473 = null;
        }
        if (field1502 != null) {
            class198.method1411();
            try {
                if (GLContext.getCurrent() == field1502) {
                    field1502.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field1502.destroy();
            } catch (Throwable var5) {
            }
            field1502 = null;
        }
        if (field1487 != null) {
            try {
                field1487.setRealized(false);
            } catch (Throwable var4) {
            }
            field1487 = null;
        }
        class183.method1312();
        field1516 = false;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)V", line = 740)
    public static final void method701(int arg0, int arg1) {
        field1488 = arg0;
        field1496 = arg1;
        method702();
    }

    @OriginalMember(owner = "client!o", name = "q", descriptor = "()V", line = 747)
    private static final void method702() {
        field1473.glViewport(field1509 + field1488, field1506 + field1496, field1492, field1505);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V", line = 757)
    public static final void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field1486 - arg0;
        int var8 = -arg1;
        int var9 = field1513 - arg1;
        field1473.glMatrixMode(5889);
        field1473.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field1473.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method685(0, 0, field1486, field1513);
        field1473.glMatrixMode(5888);
        field1473.glLoadIdentity();
        field1473.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field1480 = false;
    }

    @OriginalMember(owner = "client!o", name = "r", descriptor = "()V", line = 781)
    public static final void method704() {
        int[] var0 = new int[2];
        field1473.glGetIntegerv(3073, var0, 0);
        field1473.glGetIntegerv(3074, var0, 1);
        field1473.glDrawBuffer(1026);
        field1473.glReadBuffer(1024);
        method698(-1);
        field1473.glPushAttrib(8192);
        field1473.glDisable(2912);
        field1473.glDisable(3042);
        field1473.glDisable(2929);
        field1473.glDisable(3008);
        field1473.glRasterPos2i(0, 0);
        field1473.glCopyPixels(0, 0, field1486, field1513, 6144);
        field1473.glPopAttrib();
        field1473.glDrawBuffer(var0[0]);
        field1473.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V", line = 801)
    public static final void method705(int arg0) {
        field1473.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1473.glClear(16640);
        field1473.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!o", name = "s", descriptor = "()V", line = 806)
    public static final void method706() {
        field1473.glClear(256);
    }

    @OriginalMember(owner = "client!o", name = "t", descriptor = "()V", line = 814)
    public static final void method707() {
        class37.method313(0, 0, 0);
        method678();
        method677(0);
        method675(0);
        method668(false);
        method696(false);
        method693(false);
        method695();
    }

    @OriginalMember(owner = "client!o", name = "u", descriptor = "()V", line = 826)
    public static final void method708() {
        try {
            field1487.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(Z)V", line = 843)
    private static final void method709(boolean arg0) {
        if (field1520 == arg0) {
            return;
        }
        if (arg0) {
            field1473.glEnableClientState(32885);
        } else {
            field1473.glDisableClientState(32885);
        }
        field1520 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(FFF)V", line = 857)
    public static final void method710(float arg0, float arg1, float arg2) {
        field1473.glMatrixMode(5890);
        if (field1484) {
            field1473.glLoadIdentity();
        }
        field1473.glTranslatef(arg0, arg1, arg2);
        field1473.glMatrixMode(5888);
        field1484 = true;
    }
}
