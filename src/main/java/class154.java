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

@OriginalClass("client!dh")
public class class154 {

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    private static int field2457 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Z")
    private static boolean field2456 = false;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Z")
    private static boolean field2458 = false;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2455 = 0;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Z")
    private static boolean field2463 = false;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "Z")
    public static boolean field2478 = true;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "F")
    private static float field2480 = 0.0F;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    private static int field2462 = 0;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "F")
    private static float field2485 = 0.09765625F;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "Z")
    private static boolean field2488 = true;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "F")
    private static float field2466 = 0.0F;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "Z")
    private static boolean field2487 = true;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "Z")
    private static boolean field2482 = true;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "[F")
    private static float[] field2489 = new float[16];

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    private static int field2490 = -1;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Lmh;")
    private static class62 field2474 = class201.method1405(true, "radeon");

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "F")
    private static float field2459;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "F")
    private static float field2475;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    private static int field2467;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    private static int field2470;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    private static int field2483;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "Ljava/lang/String;")
    public static String field2484;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2486;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field2479;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field2476;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field2491;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Z")
    public static boolean field2460;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Z")
    public static boolean field2461;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
    public static boolean field2468;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Z")
    public static boolean field2469;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Z")
    public static boolean field2471;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "Z")
    public static boolean field2473;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Z")
    public static boolean field2477;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "()V", line = 10)
    public static final void method1106() {
        field2479.glDepthMask(false);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "()V", line = 16)
    public static final void method1107() {
        if (field2458) {
            field2479.glMatrixMode(5890);
            field2479.glLoadIdentity();
            field2479.glMatrixMode(5888);
            field2458 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(FF)V", line = 26)
    public static final void method1108(float arg0, float arg1) {
        if (field2463 || field2466 == arg0 && field2480 == arg1) {
            return;
        }
        field2466 = arg0;
        field2480 = arg1;
        if (arg1 == 0.0F) {
            field2489[10] = field2459;
            field2489[14] = field2475;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field2475 * (1.0F - var2) / arg1;
            field2489[10] = field2459 + var4;
            field2489[14] = field2475 * var3;
        }
        field2479.glMatrixMode(5889);
        field2479.glLoadMatrixf(field2489, 0);
        field2479.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 57)
    public static final void method1109(int arg0) {
        field2479.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field2479.glClear(16640);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;)Lmh;", line = 64)
    private static final class62 method1110(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class266.method1833(0, var1.length, var1, 0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIFFII)V", line = 72)
    public static final void method1111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field2479.glMatrixMode(5889);
        field2479.glLoadIdentity();
        method1126((float) var10 * field2485, (float) var11 * field2485, (float) (-var13) * field2485, (float) (-var12) * field2485, 50.0F, 3584.0F);
        field2479.glViewport(arg0, field2464 - arg1 - arg3, arg2, arg3);
        field2479.glMatrixMode(5888);
        field2479.glLoadIdentity();
        field2479.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field2479.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field2479.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field2463 = false;
        class244.field4160 = var10;
        class221.field3804 = var11;
        class24.field263 = var12;
        class8.field90 = var13;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(F)V", line = 108)
    public static final void method1112(float arg0) {
        method1108(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V", line = 111)
    public static final void method1113(boolean arg0) {
        if (field2482 == arg0) {
            return;
        }
        if (arg0) {
            field2479.glEnable(2896);
        } else {
            field2479.glDisable(2896);
        }
        field2482 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "()V", line = 123)
    public static final void method1114() {
        try {
            field2491.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 130)
    public static final void method1115(int arg0) {
        if (field2462 == arg0) {
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
        field2462 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "()V", line = 166)
    public static final void method1116() {
        class135.method1024(0, 31, 0);
        method1124();
        method1115(5);
        method1128(0);
        method1113(false);
        method1137(false);
        method1120(false);
        method1107();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 179)
    public static final int method1117(Canvas arg0, int arg1) {
        if (!arg0.isDisplayable()) {
            throw new IllegalStateException("Supplied canvas not on screen");
        }
        GLCapabilities var2 = new GLCapabilities();
        if (arg1 > 0) {
            var2.setSampleBuffers(true);
            var2.setNumSamples(arg1);
        }
        GLDrawableFactory var3 = GLDrawableFactory.getFactory();
        field2491 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
        field2491.setRealized(true);
        while (true) {
            field2476 = field2491.createContext((GLContext) null);
            try {
                int var4 = field2476.makeCurrent();
                if (var4 != 0) {
                    break;
                }
            } catch (Exception var10) {
            }
            class99.method792(-1, 1000L);
        }
        field2479 = field2476.getGL();
        new GLU();
        field2481 = arg0.getSize().width;
        field2464 = arg0.getSize().height;
        if (!field2456) {
            int var6 = method1131();
            if (var6 != 0) {
                return var6;
            }
            field2456 = true;
        }
        method1136();
        method1138();
        field2479.glClear(16384);
        int var7 = 0;
        while (var7 < 10) {
            try {
                field2491.swapBuffers();
                break;
            } catch (Exception var9) {
                class99.method792(-1, 100L);
                var7++;
            }
        }
        field2479.glClear(16384);
        return 0;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "()V", line = 252)
    public static final void method1118() {
        class135.method1024(0, -123, 0);
        method1124();
        method1115(0);
        method1128(0);
        method1113(false);
        method1137(false);
        method1120(false);
        method1107();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V", line = 262)
    public static final void method1119(int arg0, int arg1, int arg2, int arg3) {
        method1111(0, 0, field2481, field2464, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V", line = 268)
    public static final void method1120(boolean arg0) {
        if (field2488 == arg0) {
            return;
        }
        if (arg0) {
            field2479.glEnable(2912);
        } else {
            field2479.glDisable(2912);
        }
        field2488 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "()V", line = 279)
    public static final void method1121() {
        class135.method1024(0, 95, 0);
        method1124();
        method1115(1);
        method1128(1);
        method1113(false);
        method1137(false);
        method1120(false);
        method1107();
    }

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "()V", line = 291)
    public static final void method1122() {
        if (client.field5162) {
            method1113(true);
            method1135(true);
        } else {
            method1113(false);
            method1135(false);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII)V", line = 305)
    public static final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field2481 - arg0;
        int var8 = -arg1;
        int var9 = field2464 - arg1;
        field2479.glMatrixMode(5889);
        field2479.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field2479.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field2479.glViewport(0, 0, field2481, field2464);
        field2479.glMatrixMode(5888);
        field2479.glLoadIdentity();
        field2479.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field2463 = false;
    }

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "()V", line = 332)
    private static final void method1124() {
        if (field2463) {
            return;
        }
        field2479.glMatrixMode(5889);
        field2479.glLoadIdentity();
        field2479.glOrtho(0.0D, (double) field2481, 0.0D, (double) field2464, -1.0D, 1.0D);
        field2479.glViewport(0, 0, field2481, field2464);
        field2479.glMatrixMode(5888);
        field2479.glLoadIdentity();
        field2463 = true;
    }

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "()V", line = 344)
    public static final void method1125() {
        field2479.glClear(256);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(FFFFFF)V", line = 348)
    private static final void method1126(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field2489[0] = var6 / (arg1 - arg0);
        field2489[1] = 0.0F;
        field2489[2] = 0.0F;
        field2489[3] = 0.0F;
        field2489[4] = 0.0F;
        field2489[5] = var6 / (arg3 - arg2);
        field2489[6] = 0.0F;
        field2489[7] = 0.0F;
        field2489[8] = (arg0 + arg1) / (arg1 - arg0);
        field2489[9] = (arg2 + arg3) / (arg3 - arg2);
        field2489[10] = field2459 = -(arg4 + arg5) / (arg5 - arg4);
        field2489[11] = -1.0F;
        field2489[12] = 0.0F;
        field2489[13] = 0.0F;
        field2489[14] = field2475 = -(arg5 * var6) / (arg5 - arg4);
        field2489[15] = 0.0F;
        field2479.glLoadMatrixf(field2489, 0);
        field2466 = 0.0F;
        field2480 = 0.0F;
    }

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "()V", line = 374)
    public static final void method1127() {
        if (field2479 != null) {
            class90.method676(115);
            field2479 = null;
        }
        if (field2476 != null) {
            class79.method609();
            if (GLContext.getCurrent() == field2476) {
                field2476.release();
            }
            field2476.destroy();
            field2476 = null;
        }
        if (field2491 != null) {
            field2491.setRealized(false);
            field2491 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V", line = 403)
    public static final void method1128(int arg0) {
        if (field2457 == arg0) {
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
        field2457 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "()F", line = 418)
    public static final float method1129() {
        return field2480;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(FFF)V", line = 424)
    public static final void method1130(float arg0, float arg1, float arg2) {
        field2479.glMatrixMode(5890);
        if (field2458) {
            field2479.glLoadIdentity();
        }
        field2479.glTranslatef(arg0, arg1, arg2);
        field2479.glMatrixMode(5888);
        field2458 = true;
    }

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "()I", line = 441)
    private static final int method1131() {
        int var0 = 0;
        field2484 = field2479.glGetString(7936);
        field2486 = field2479.glGetString(7937);
        String var1 = field2484.toLowerCase();
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
                field2483 = var4 * 10 + var5;
            } catch (NumberFormatException var13) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field2483 < 12) {
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
        field2472 = var7[0];
        field2479.glGetIntegerv(34929, var7, 0);
        field2467 = var7[0];
        field2479.glGetIntegerv(34930, var7, 0);
        field2470 = var7[0];
        if (field2472 < 2 || field2467 < 2 || field2470 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field2468 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field2461 = field2479.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field2469 = field2479.isExtensionAvailable("GL_ARB_multisample");
        field2477 = field2479.isExtensionAvailable("GL_ARB_texture_cube_map");
        field2471 = field2479.isExtensionAvailable("GL_ARB_vertex_program");
        field2473 = field2479.isExtensionAvailable("GL_EXT_texture3D");
        class62 var8 = method1110(field2486).method430(11645);
        if (var8.method457(-27773, field2474) != -1) {
            int var9 = 0;
            class62[] var10 = var8.method455(32, 47, (byte) 123).method420((byte) 21, 32);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class62 var12 = var10[var11];
                if (var12.method439(111) >= 4 && var12.method429(4, 0, true).method447((byte) -59)) {
                    var9 = var12.method429(4, 0, true).method431(64);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field2461 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field2473 = false;
            }
            field2460 = field2461;
        }
        return 0;
    }

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "()V", line = 538)
    public static final void method1132() {
        field2479.glDepthMask(true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V", line = 541)
    public static final void method1133(int arg0, int arg1) {
        field2481 = arg0;
        field2464 = arg1;
        field2463 = false;
    }

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "()F", line = 546)
    public static final float method1134() {
        return field2466;
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(Z)V", line = 549)
    private static final void method1135(boolean arg0) {
        if (field2478 == arg0) {
            return;
        }
        if (arg0) {
            field2479.glEnableClientState(32885);
        } else {
            field2479.glDisableClientState(32885);
        }
        field2478 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "()V", line = 571)
    private static final void method1136() {
        int[] var0 = new int[1];
        field2479.glGenTextures(1, var0, 0);
        field2465 = var0[0];
        field2479.glBindTexture(3553, field2465);
        field2479.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class256.method1778(6);
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(Z)V", line = 581)
    public static final void method1137(boolean arg0) {
        if (field2487 == arg0) {
            return;
        }
        if (arg0) {
            field2479.glEnable(2929);
        } else {
            field2479.glDisable(2929);
        }
        field2487 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "()V", line = 592)
    private static final void method1138() {
        field2463 = false;
        field2479.glDisable(3553);
        field2490 = -1;
        field2479.glTexEnvi(8960, 8704, 34160);
        field2479.glTexEnvi(8960, 34161, 8448);
        field2462 = 0;
        field2479.glTexEnvi(8960, 34162, 8448);
        field2457 = 0;
        field2479.glEnable(2896);
        field2479.glEnable(2912);
        field2479.glEnable(2929);
        field2482 = true;
        field2487 = true;
        field2488 = true;
        class222.method1577(0);
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
        method1132();
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
        field2478 = true;
        field2479.glEnableClientState(32886);
        field2479.glEnableClientState(32888);
        field2479.glMatrixMode(5888);
        field2479.glLoadIdentity();
        class179.method1259();
        class117.method912();
    }

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "()V", line = 653)
    public static void method1139() {
        field2474 = null;
        field2486 = null;
        field2484 = null;
        field2479 = null;
        field2491 = null;
        field2476 = null;
        field2489 = null;
    }

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "()V", line = 662)
    public static final void method1140() {
        class135.method1024(0, -107, 0);
        method1124();
        method1141(-1);
        method1113(false);
        method1137(false);
        method1120(false);
        method1107();
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V", line = 677)
    public static final void method1141(int arg0) {
        if (field2490 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field2479.glDisable(3553);
        } else {
            if (field2490 == -1) {
                field2479.glEnable(3553);
            }
            field2479.glBindTexture(3553, arg0);
        }
        field2490 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "()V", line = 694)
    public static final void method1142() {
        int[] var0 = new int[2];
        field2479.glGetIntegerv(3073, var0, 0);
        field2479.glGetIntegerv(3074, var0, 1);
        field2479.glDrawBuffer(1026);
        field2479.glReadBuffer(1024);
        method1141(-1);
        field2479.glPushAttrib(8192);
        field2479.glDisable(2912);
        field2479.glDisable(3042);
        field2479.glDisable(2929);
        field2479.glDisable(3008);
        field2479.glRasterPos2i(0, 0);
        field2479.glCopyPixels(0, 0, field2481, field2464, 6144);
        field2479.glPopAttrib();
        field2479.glDrawBuffer(var0[0]);
        field2479.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "()V", line = 718)
    public static final void method1143() {
        class135.method1024(0, -127, 0);
        method1124();
        method1115(0);
        method1128(0);
        method1113(false);
        method1137(false);
        method1120(false);
        method1107();
    }
}
