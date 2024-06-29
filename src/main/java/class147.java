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

@OriginalClass("client!tc")
public class class147 {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2481 = 0;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Z")
    public static boolean field2493 = true;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Z")
    public static boolean field2485 = false;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "Lhi;")
    private static class82 field2490 = class95.method664((byte) -65, "radeon");

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "Z")
    private static boolean field2497 = true;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    private static int field2496 = -1;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Z")
    private static boolean field2476 = true;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[F")
    private static float[] field2484 = new float[16];

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "F")
    private static float field2488 = 0.09765625F;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "Z")
    private static boolean field2505 = false;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Z")
    private static boolean field2504 = true;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "Z")
    private static boolean field2477 = false;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    private static int field2502 = 0;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "F")
    private static float field2480 = 0.0F;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "F")
    private static float field2507 = 0.0F;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
    private static int field2511 = 0;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "F")
    private static float field2491;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "F")
    private static float field2501;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    private static int field2492;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    private static int field2499;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    private static int field2508;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljava/lang/String;")
    private static String field2475;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "Ljava/lang/String;")
    private static String field2489;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field2479;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field2503;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field2494;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Z")
    public static boolean field2478;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Z")
    public static boolean field2482;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Z")
    public static boolean field2486;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Z")
    public static boolean field2487;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "Z")
    public static boolean field2500;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "Z")
    public static boolean field2509;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Z")
    public static boolean field2510;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()V", line = 13)
    private static final void method989() {
        if (field2477) {
            return;
        }
        field2479.glMatrixMode(5889);
        field2479.glLoadIdentity();
        field2479.glOrtho(0.0D, (double) field2498, 0.0D, (double) field2495, -1.0D, 1.0D);
        field2479.glViewport(0, 0, field2498, field2495);
        field2479.glMatrixMode(5888);
        field2479.glLoadIdentity();
        field2477 = true;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()V", line = 26)
    public static final void method990() {
        field2479.glClear(256);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 29)
    public static final void method991(int arg0) {
        if (field2502 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2479.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field2479.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field2479.glTexEnvi(8960, 34162, 260);
        }
        field2502 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(FFF)V", line = 49)
    public static final void method992(float arg0, float arg1, float arg2) {
        field2479.glMatrixMode(5890);
        if (field2505) {
            field2479.glLoadIdentity();
        }
        field2479.glTranslatef(arg0, arg1, arg2);
        field2479.glMatrixMode(5888);
        field2505 = true;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()V", line = 60)
    public static final void method993() {
        try {
            field2494.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 69)
    public static final int method994(Canvas arg0, int arg1) {
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
            field2494 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field2494.setRealized(true);
            int var4 = 0;
            while (true) {
                field2503 = field2494.createContext((GLContext) null);
                try {
                    int var5 = field2503.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class290.method2001(1000L, false);
            }
            field2479 = field2503.getGL();
            new GLU();
            field2485 = true;
            field2498 = arg0.getSize().width;
            field2495 = arg0.getSize().height;
            int var7 = method1004();
            if (var7 != 0) {
                method1005();
                return var7;
            }
            method1026();
            method1003();
            field2479.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field2494.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method1005();
                        return -3;
                    }
                    class290.method2001(100L, false);
                }
            }
            field2479.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method1005();
            return -5;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 152)
    public static final void method995(int arg0) {
        field2479.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2479.glClear(16640);
        field2479.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()V", line = 157)
    public static final void method996() {
        class171.method1211(0, 0, false);
        method989();
        method1002(-1);
        method997(false);
        method1016(false);
        method1022(false);
        method1000();
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 166)
    public static final void method997(boolean arg0) {
        if (field2504 == arg0) {
            return;
        }
        if (arg0) {
            field2479.glEnable(2896);
        } else {
            field2479.glDisable(2896);
        }
        field2504 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()V", line = 181)
    public static void method998() {
        field2490 = null;
        field2475 = null;
        field2489 = null;
        field2479 = null;
        field2494 = null;
        field2503 = null;
        field2484 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIFFII)V", line = 196)
    public static final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field2479.glMatrixMode(5889);
        field2479.glLoadIdentity();
        method1013((float) var10 * field2488, (float) var11 * field2488, (float) (-var13) * field2488, (float) (-var12) * field2488, 50.0F, 3584.0F);
        field2479.glViewport(arg0, field2495 - arg1 - arg3, arg2, arg3);
        field2479.glMatrixMode(5888);
        field2479.glLoadIdentity();
        field2479.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field2479.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field2479.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field2477 = false;
        class109.field1951 = var10;
        class287.field4828 = var11;
        class281.field4722 = var12;
        class16.field146 = var13;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "()V", line = 227)
    public static final void method1000() {
        if (field2505) {
            field2479.glMatrixMode(5890);
            field2479.glLoadIdentity();
            field2479.glMatrixMode(5888);
            field2505 = false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "()V", line = 237)
    public static final void method1001() {
        field2479.glDepthMask(false);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V", line = 240)
    public static final void method1002(int arg0) {
        if (field2496 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field2479.glDisable(3553);
        } else {
            if (field2496 == -1) {
                field2479.glEnable(3553);
            }
            field2479.glBindTexture(3553, arg0);
        }
        field2496 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "()V", line = 257)
    private static final void method1003() {
        field2477 = false;
        field2479.glDisable(3553);
        field2496 = -1;
        field2479.glTexEnvi(8960, 8704, 34160);
        field2479.glTexEnvi(8960, 34161, 8448);
        field2511 = 0;
        field2479.glTexEnvi(8960, 34162, 8448);
        field2502 = 0;
        field2479.glEnable(2896);
        field2479.glEnable(2912);
        field2479.glEnable(2929);
        field2504 = true;
        field2476 = true;
        field2497 = true;
        class198.method1386(0);
        field2479.glActiveTexture(33985);
        field2479.glTexEnvi(8960, 8704, 34160);
        field2479.glTexEnvi(8960, 34161, 8448);
        field2479.glTexEnvi(8960, 34162, 8448);
        field2479.glActiveTexture(33984);
        field2479.setSwapInterval(0);
        field2479.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field2479.glShadeModel(7425);
        field2479.glClearDepth(1.0D);
        field2479.glDepthFunc(515);
        method1006();
        field2479.glMatrixMode(5890);
        field2479.glLoadIdentity();
        field2479.glPolygonMode(1028, 6914);
        field2479.glEnable(2884);
        field2479.glCullFace(1029);
        field2479.glEnable(3042);
        field2479.glBlendFunc(770, 771);
        field2479.glEnable(3008);
        field2479.glAlphaFunc(516, 0.0F);
        field2479.glEnableClientState(32884);
        field2479.glEnableClientState(32885);
        field2493 = true;
        field2479.glEnableClientState(32886);
        field2479.glEnableClientState(32888);
        field2479.glMatrixMode(5888);
        field2479.glLoadIdentity();
        class85.method593();
        class2.method16();
    }

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "()I", line = 304)
    private static final int method1004() {
        int var0 = 0;
        field2489 = field2479.glGetString(7936);
        field2475 = field2479.glGetString(7937);
        String var1 = field2489.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field2479.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field2499 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field2499 < 12) {
            var0 |= 0x2;
        }
        if (!field2479.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field2479.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field2479.glGetIntegerv(34018, var7, 0);
        field2506 = var7[0];
        field2479.glGetIntegerv(34929, var7, 0);
        field2492 = var7[0];
        field2479.glGetIntegerv(34930, var7, 0);
        field2508 = var7[0];
        if (field2506 < 2 || field2492 < 2 || field2508 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field2482 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field2510 = field2479.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field2509 = field2479.isExtensionAvailable("GL_ARB_multisample");
        field2486 = field2479.isExtensionAvailable("GL_ARB_texture_cube_map");
        field2478 = field2479.isExtensionAvailable("GL_ARB_vertex_program");
        field2500 = field2479.isExtensionAvailable("GL_EXT_texture3D");
        class82 var8 = method1025(field2475).method538((byte) -80);
        if (var8.method563(122, field2490) != -1) {
            int var9 = 0;
            class82[] var10 = var8.method572(32, 47, (byte) -125).method528(32, 71);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class82 var12 = var10[var11];
                if (var12.method535(true) >= 4 && var12.method573(0, 94, 4).method545((byte) 109)) {
                    var9 = var12.method573(0, 71, 4).method540((byte) -114);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field2510 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field2500 = false;
            }
            field2487 = field2510;
        }
        if (field2510) {
            try {
                int[] var13 = new int[1];
                field2479.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "()V", line = 411)
    public static final void method1005() {
        if (field2479 != null) {
            try {
                class265.method1881(-101);
            } catch (Throwable var7) {
            }
            field2479 = null;
        }
        if (field2503 != null) {
            class6.method39();
            try {
                if (GLContext.getCurrent() == field2503) {
                    field2503.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field2503.destroy();
            } catch (Throwable var5) {
            }
            field2503 = null;
        }
        if (field2494 != null) {
            try {
                field2494.setRealized(false);
            } catch (Throwable var4) {
            }
            field2494 = null;
        }
        class2.method15();
        field2485 = false;
    }

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "()V", line = 461)
    public static final void method1006() {
        field2479.glDepthMask(true);
    }

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "()V", line = 464)
    public static final void method1007() {
        class171.method1211(0, 0, false);
        method989();
        method1012(0);
        method991(0);
        method997(false);
        method1016(false);
        method1022(false);
        method1000();
    }

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "()V", line = 481)
    public static final void method1008() {
        int[] var0 = new int[2];
        field2479.glGetIntegerv(3073, var0, 0);
        field2479.glGetIntegerv(3074, var0, 1);
        field2479.glDrawBuffer(1026);
        field2479.glReadBuffer(1024);
        method1002(-1);
        field2479.glPushAttrib(8192);
        field2479.glDisable(2912);
        field2479.glDisable(3042);
        field2479.glDisable(2929);
        field2479.glDisable(3008);
        field2479.glRasterPos2i(0, 0);
        field2479.glCopyPixels(0, 0, field2498, field2495, 6144);
        field2479.glPopAttrib();
        field2479.glDrawBuffer(var0[0]);
        field2479.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "()F", line = 500)
    public static final float method1009() {
        return field2480;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(FF)V", line = 516)
    public static final void method1010(float arg0, float arg1) {
        if (field2477 || field2480 == arg0 && field2507 == arg1) {
            return;
        }
        field2480 = arg0;
        field2507 = arg1;
        if (arg1 == 0.0F) {
            field2484[10] = field2491;
            field2484[14] = field2501;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field2501 * (1.0F - var2) / arg1;
            field2484[10] = field2491 + var4;
            field2484[14] = field2501 * var3;
        }
        field2479.glMatrixMode(5889);
        field2479.glLoadMatrixf(field2484, 0);
        field2479.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "()F", line = 554)
    public static final float method1011() {
        return field2507;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V", line = 559)
    public static final void method1012(int arg0) {
        if (field2511 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field2479.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field2479.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field2479.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field2479.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field2479.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field2479.glTexEnvi(8960, 34161, 34165);
        }
        field2511 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(FFFFFF)V", line = 585)
    private static final void method1013(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field2484[0] = var6 / (arg1 - arg0);
        field2484[1] = 0.0F;
        field2484[2] = 0.0F;
        field2484[3] = 0.0F;
        field2484[4] = 0.0F;
        field2484[5] = var6 / (arg3 - arg2);
        field2484[6] = 0.0F;
        field2484[7] = 0.0F;
        field2484[8] = (arg0 + arg1) / (arg1 - arg0);
        field2484[9] = (arg2 + arg3) / (arg3 - arg2);
        field2484[10] = field2491 = -(arg4 + arg5) / (arg5 - arg4);
        field2484[11] = -1.0F;
        field2484[12] = 0.0F;
        field2484[13] = 0.0F;
        field2484[14] = field2501 = -(arg5 * var6) / (arg5 - arg4);
        field2484[15] = 0.0F;
        field2479.glLoadMatrixf(field2484, 0);
        field2480 = 0.0F;
        field2507 = 0.0F;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIII)V", line = 608)
    public static final void method1014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field2498 - arg0;
        int var8 = -arg1;
        int var9 = field2495 - arg1;
        field2479.glMatrixMode(5889);
        field2479.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field2479.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field2479.glViewport(0, 0, field2498, field2495);
        field2479.glMatrixMode(5888);
        field2479.glLoadIdentity();
        field2479.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field2477 = false;
    }

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "()V", line = 636)
    public static final void method1015() {
        class171.method1211(0, 0, false);
        method989();
        method1012(1);
        method991(1);
        method997(false);
        method1016(false);
        method1022(false);
        method1000();
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V", line = 651)
    public static final void method1016(boolean arg0) {
        if (field2476 == arg0) {
            return;
        }
        if (arg0) {
            field2479.glEnable(2929);
        } else {
            field2479.glDisable(2929);
        }
        field2476 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V", line = 663)
    public static final void method1017(int arg0, int arg1) {
        field2498 = arg0;
        field2495 = arg1;
        field2477 = false;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(Z)V", line = 671)
    private static final void method1018(boolean arg0) {
        if (field2493 == arg0) {
            return;
        }
        if (arg0) {
            field2479.glEnableClientState(32885);
        } else {
            field2479.glDisableClientState(32885);
        }
        field2493 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "()V", line = 684)
    public static final void method1019() {
        if (class75.field1303) {
            method997(true);
            method1018(true);
        } else {
            method997(false);
            method1018(false);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(F)V", line = 697)
    public static final void method1020(float arg0) {
        method1010(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "()V", line = 700)
    public static final void method1021() {
        class171.method1211(0, 0, false);
        method989();
        method1012(0);
        method991(0);
        method997(false);
        method1016(false);
        method1022(false);
        method1000();
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(Z)V", line = 710)
    public static final void method1022(boolean arg0) {
        if (field2497 == arg0) {
            return;
        }
        if (arg0) {
            field2479.glEnable(2912);
        } else {
            field2479.glDisable(2912);
        }
        field2497 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V", line = 725)
    public static final void method1023(int arg0, int arg1, int arg2, int arg3) {
        method999(0, 0, field2498, field2495, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 729)
    public static final void method1024(Canvas arg0) {
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

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;)Lhi;", line = 767)
    private static final class82 method1025(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class14.method78(var1.length, 126, 0, var1);
    }

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "()V", line = 780)
    private static final void method1026() {
        int[] var0 = new int[1];
        field2479.glGenTextures(1, var0, 0);
        field2483 = var0[0];
        field2479.glBindTexture(3553, field2483);
        field2479.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class81.method518((byte) 93);
    }
}
