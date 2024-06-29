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

@OriginalClass("client!kc")
public class class36 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "[F")
    private static float[] field506 = new float[16];

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field514 = 0;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Z")
    private static boolean field517 = false;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Z")
    private static boolean field519 = true;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Z")
    private static boolean field507 = true;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "F")
    private static float field516 = 0.09765625F;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "F")
    private static float field511 = 0.0F;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Z")
    private static boolean field532 = true;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Z")
    private static boolean field515 = false;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "Z")
    public static boolean field525 = true;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    private static int field533 = 0;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    private static int field536 = -1;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "F")
    private static float field539 = 0.0F;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    private static int field538 = 0;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "Z")
    public static boolean field534 = false;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "F")
    private static float field512;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "F")
    private static float field530;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private static int field505;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    private static int field528;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    private static int field540;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "Ljava/lang/String;")
    private static String field524;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Ljava/lang/String;")
    private static String field526;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field518;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field508;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field531;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
    public static boolean field509;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
    public static boolean field510;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Z")
    public static boolean field521;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Z")
    public static boolean field523;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Z")
    public static boolean field527;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Z")
    public static boolean field529;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "Z")
    public static boolean field537;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 13)
    public static void method304() {
        field524 = null;
        field526 = null;
        field518 = null;
        field531 = null;
        field508 = null;
        field506 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V", line = 31)
    public static final void method305() {
        field518.glDepthMask(true);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V", line = 35)
    public static final void method306() {
        if (field518 != null) {
            try {
                class57.method515(13128);
            } catch (Throwable var7) {
            }
            field518 = null;
        }
        if (field508 != null) {
            class166.method1217();
            try {
                if (GLContext.getCurrent() == field508) {
                    field508.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field508.destroy();
            } catch (Throwable var5) {
            }
            field508 = null;
        }
        if (field531 != null) {
            try {
                field531.setRealized(false);
            } catch (Throwable var4) {
            }
            field531 = null;
        }
        class286.method2016();
        field534 = false;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()V", line = 84)
    public static final void method307() {
        class309.method2143(0, -103, 0);
        method334();
        method313(0);
        method314(0);
        method337(false);
        method318(false);
        method333(false);
        method320();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)V", line = 98)
    public static final void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field520 - arg0;
        int var8 = -arg1;
        int var9 = field522 - arg1;
        field518.glMatrixMode(5889);
        field518.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field518.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field518.glViewport(0, 0, field520, field522);
        field518.glMatrixMode(5888);
        field518.glLoadIdentity();
        field518.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field515 = false;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()V", line = 122)
    private static final void method309() {
        int[] var0 = new int[1];
        field518.glGenTextures(1, var0, 0);
        field535 = var0[0];
        field518.glBindTexture(3553, field535);
        field518.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class286.method2018();
        class212.method1534(-9217);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 131)
    public static final void method310(int arg0) {
        if (field536 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field518.glDisable(3553);
        } else {
            if (field536 == -1) {
                field518.glEnable(3553);
            }
            field518.glBindTexture(3553, arg0);
        }
        field536 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "()V", line = 154)
    public static final void method311() {
        if (class175.field2589) {
            method337(true);
            method316(true);
        } else {
            method337(false);
            method316(false);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 169)
    public static final int method312(Canvas arg0, int arg1) {
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
            field531 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field531.setRealized(true);
            int var4 = 0;
            while (true) {
                field508 = field531.createContext((GLContext) null);
                try {
                    int var5 = field508.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class97.method768(1000L, 40);
            }
            field518 = field508.getGL();
            new GLU();
            field534 = true;
            field520 = arg0.getSize().width;
            field522 = arg0.getSize().height;
            int var7 = method315();
            if (var7 != 0) {
                method306();
                return var7;
            }
            method309();
            method340();
            field518.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field531.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method306();
                        return -3;
                    }
                    class97.method768(100L, 77);
                }
            }
            field518.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method306();
            return -5;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V", line = 254)
    public static final void method313(int arg0) {
        if (field533 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field518.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field518.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field518.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field518.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field518.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field518.glTexEnvi(8960, 34161, 34165);
        }
        field533 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V", line = 278)
    public static final void method314(int arg0) {
        if (field538 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field518.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field518.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field518.glTexEnvi(8960, 34162, 260);
        }
        field538 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "()I", line = 295)
    private static final int method315() {
        int var0 = 0;
        field526 = field518.glGetString(7936);
        field524 = field518.glGetString(7937);
        String var1 = field526.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field518.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field540 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field540 < 12) {
            var0 |= 0x2;
        }
        if (!field518.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field518.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field518.glGetIntegerv(34018, var7, 0);
        field513 = var7[0];
        field518.glGetIntegerv(34929, var7, 0);
        field528 = var7[0];
        field518.glGetIntegerv(34930, var7, 0);
        field505 = var7[0];
        if (field513 < 2 || field528 < 2 || field505 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field510 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field529 = field518.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field527 = field518.isExtensionAvailable("GL_ARB_multisample");
        field521 = field518.isExtensionAvailable("GL_ARB_texture_cube_map");
        field537 = field518.isExtensionAvailable("GL_ARB_vertex_program");
        field523 = field518.isExtensionAvailable("GL_EXT_texture3D");
        String var8 = field524.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            String[] var10 = class41.method371(true, ' ', var8.replace('/', ' '));
            for (int var11 = 0; var11 < var10.length; var11++) {
                String var12 = var10[var11];
                if (var12.length() >= 4 && class132.method1002(var12.substring(0, 4), true)) {
                    var9 = class28.method194(var12.substring(0, 4), 10);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field529 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field523 = false;
            }
            field509 = field529;
        }
        if (field529) {
            try {
                int[] var13 = new int[1];
                field518.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V", line = 405)
    private static final void method316(boolean arg0) {
        if (field525 == arg0) {
            return;
        }
        if (arg0) {
            field518.glEnableClientState(32885);
        } else {
            field518.glDisableClientState(32885);
        }
        field525 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V", line = 416)
    public static final void method317(int arg0, int arg1) {
        field520 = arg0;
        field522 = arg1;
        field515 = false;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V", line = 421)
    public static final void method318(boolean arg0) {
        if (field532 == arg0) {
            return;
        }
        if (arg0) {
            field518.glEnable(2929);
        } else {
            field518.glDisable(2929);
        }
        field532 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "()V", line = 433)
    public static final void method319() {
        field518.glDepthMask(false);
    }

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "()V", line = 440)
    public static final void method320() {
        if (field517) {
            field518.glMatrixMode(5890);
            field518.glLoadIdentity();
            field518.glMatrixMode(5888);
            field517 = false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "()F", line = 450)
    public static final float method321() {
        return field539;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(FFF)V", line = 453)
    public static final void method322(float arg0, float arg1, float arg2) {
        field518.glMatrixMode(5890);
        if (field517) {
            field518.glLoadIdentity();
        }
        field518.glTranslatef(arg0, arg1, arg2);
        field518.glMatrixMode(5888);
        field517 = true;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIFFII)V", line = 463)
    public static final void method323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field518.glMatrixMode(5889);
        field518.glLoadIdentity();
        method331((float) var10 * field516, (float) var11 * field516, (float) (-var13) * field516, (float) (-var12) * field516, 50.0F, 3584.0F);
        field518.glViewport(arg0, field522 - arg1 - arg3, arg2, arg3);
        field518.glMatrixMode(5888);
        field518.glLoadIdentity();
        field518.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field518.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field518.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field515 = false;
        class288.field4476 = var10;
        class307.field4796 = var11;
        class257.field3834 = var12;
        class142.field2202 = var13;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V", line = 493)
    public static final void method324(int arg0) {
        field518.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field518.glClear(16640);
        field518.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "()V", line = 505)
    public static final void method325() {
        class309.method2143(0, -124, 0);
        method334();
        method313(0);
        method314(0);
        method337(false);
        method318(false);
        method333(false);
        method320();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(FF)V", line = 515)
    public static final void method326(float arg0, float arg1) {
        if (field515 || field511 == arg0 && field539 == arg1) {
            return;
        }
        field511 = arg0;
        field539 = arg1;
        if (arg1 == 0.0F) {
            field506[10] = field512;
            field506[14] = field530;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field530 * (1.0F - var2) / arg1;
            field506[10] = field512 + var4;
            field506[14] = field530 * var3;
        }
        field518.glMatrixMode(5889);
        field518.glLoadMatrixf(field506, 0);
        field518.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "()V", line = 546)
    public static final void method327() {
        try {
            field531.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 554)
    public static final void method328(Canvas arg0) {
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

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "()F", line = 577)
    public static final float method329() {
        return field511;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(F)V", line = 584)
    public static final void method330(float arg0) {
        method326(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(FFFFFF)V", line = 592)
    private static final void method331(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field506[0] = var6 / (arg1 - arg0);
        field506[1] = 0.0F;
        field506[2] = 0.0F;
        field506[3] = 0.0F;
        field506[4] = 0.0F;
        field506[5] = var6 / (arg3 - arg2);
        field506[6] = 0.0F;
        field506[7] = 0.0F;
        field506[8] = (arg0 + arg1) / (arg1 - arg0);
        field506[9] = (arg2 + arg3) / (arg3 - arg2);
        field506[10] = field512 = -(arg4 + arg5) / (arg5 - arg4);
        field506[11] = -1.0F;
        field506[12] = 0.0F;
        field506[13] = 0.0F;
        field506[14] = field530 = -(arg5 * var6) / (arg5 - arg4);
        field506[15] = 0.0F;
        field518.glLoadMatrixf(field506, 0);
        field511 = 0.0F;
        field539 = 0.0F;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)V", line = 621)
    public static final void method332(int arg0, int arg1, int arg2, int arg3) {
        method323(0, 0, field520, field522, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(Z)V", line = 633)
    public static final void method333(boolean arg0) {
        if (field507 == arg0) {
            return;
        }
        if (arg0) {
            field518.glEnable(2912);
        } else {
            field518.glDisable(2912);
        }
        field507 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "()V", line = 645)
    private static final void method334() {
        if (field515) {
            return;
        }
        field518.glMatrixMode(5889);
        field518.glLoadIdentity();
        field518.glOrtho(0.0D, (double) field520, 0.0D, (double) field522, -1.0D, 1.0D);
        field518.glViewport(0, 0, field520, field522);
        field518.glMatrixMode(5888);
        field518.glLoadIdentity();
        field515 = true;
    }

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "()V", line = 658)
    public static final void method335() {
        field518.glClear(256);
    }

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "()V", line = 665)
    public static final void method336() {
        class309.method2143(0, -115, 0);
        method334();
        method310(-1);
        method337(false);
        method318(false);
        method333(false);
        method320();
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(Z)V", line = 689)
    public static final void method337(boolean arg0) {
        if (field519 == arg0) {
            return;
        }
        if (arg0) {
            field518.glEnable(2896);
        } else {
            field518.glDisable(2896);
        }
        field519 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "()V", line = 701)
    public static final void method338() {
        int[] var0 = new int[2];
        field518.glGetIntegerv(3073, var0, 0);
        field518.glGetIntegerv(3074, var0, 1);
        field518.glDrawBuffer(1026);
        field518.glReadBuffer(1024);
        method310(-1);
        field518.glPushAttrib(8192);
        field518.glDisable(2912);
        field518.glDisable(3042);
        field518.glDisable(2929);
        field518.glDisable(3008);
        field518.glRasterPos2i(0, 0);
        field518.glCopyPixels(0, 0, field520, field522, 6144);
        field518.glPopAttrib();
        field518.glDrawBuffer(var0[0]);
        field518.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "()V", line = 719)
    public static final void method339() {
        class309.method2143(0, -101, 0);
        method334();
        method313(1);
        method314(1);
        method337(false);
        method318(false);
        method333(false);
        method320();
    }

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "()V", line = 742)
    private static final void method340() {
        field515 = false;
        field518.glDisable(3553);
        field536 = -1;
        field518.glTexEnvi(8960, 8704, 34160);
        field518.glTexEnvi(8960, 34161, 8448);
        field533 = 0;
        field518.glTexEnvi(8960, 34162, 8448);
        field538 = 0;
        field518.glEnable(2896);
        field518.glEnable(2912);
        field518.glEnable(2929);
        field519 = true;
        field532 = true;
        field507 = true;
        class178.method1293(1516680140);
        field518.glActiveTexture(33985);
        field518.glTexEnvi(8960, 8704, 34160);
        field518.glTexEnvi(8960, 34161, 8448);
        field518.glTexEnvi(8960, 34162, 8448);
        field518.glActiveTexture(33984);
        field518.setSwapInterval(0);
        field518.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field518.glShadeModel(7425);
        field518.glClearDepth(1.0D);
        field518.glDepthFunc(515);
        method305();
        field518.glMatrixMode(5890);
        field518.glLoadIdentity();
        field518.glPolygonMode(1028, 6914);
        field518.glEnable(2884);
        field518.glCullFace(1029);
        field518.glEnable(3042);
        field518.glBlendFunc(770, 771);
        field518.glEnable(3008);
        field518.glAlphaFunc(516, 0.0F);
        field518.glEnableClientState(32884);
        field518.glEnableClientState(32885);
        field525 = true;
        field518.glEnableClientState(32886);
        field518.glEnableClientState(32888);
        field518.glMatrixMode(5888);
        field518.glLoadIdentity();
        class264.method1828();
        class286.method2006();
    }
}
