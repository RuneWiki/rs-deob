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
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class47 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    private static int field588 = 0;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    private static int field594 = -1;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Z")
    private static boolean field591 = true;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "F")
    private static float field617 = 0.0F;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Z")
    public static boolean field619 = true;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Z")
    private static boolean field612 = true;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field625 = 0;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "[F")
    private static float[] field615 = new float[16];

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    private static int field629 = -1;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "Z")
    private static boolean field631 = true;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    private static int field589 = -1;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "Z")
    public static boolean field623 = false;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "F")
    private static float field613 = 0.0F;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "Z")
    private static boolean field627 = false;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "F")
    private static float field632 = 0.09765625F;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "Z")
    private static boolean field611 = false;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    private static int field636 = 0;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "F")
    private static float field595;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "F")
    private static float field616;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    private static int field598;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    private static int field604;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    private static int field610;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    private static int field622;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    private static int field630;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    private static int field634;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    private static int field635;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "Ljava/lang/String;")
    private static String field600;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Ljava/lang/String;")
    private static String field602;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field592;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field605;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field601;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Z")
    public static boolean field593;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Z")
    public static boolean field596;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Z")
    public static boolean field597;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Z")
    public static boolean field603;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "Z")
    public static boolean field606;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Z")
    public static boolean field608;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "Z")
    public static boolean field614;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "Z")
    public static boolean field618;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "Z")
    public static boolean field620;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "Z")
    public static boolean field624;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "Z")
    public static boolean field628;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "Z")
    public static boolean field633;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIFFII)V", line = 11)
    public static final void method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field592.glMatrixMode(5889);
        field592.glLoadIdentity();
        method361((float) var10 * field632, (float) var11 * field632, (float) (-var13) * field632, (float) (-var12) * field632, 50.0F, 3584.0F);
        method340(arg0, field621 - arg1 - arg3, arg2, arg3);
        field592.glMatrixMode(5888);
        field592.glLoadIdentity();
        field592.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field592.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field592.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field611 = false;
        class7.field71 = var10;
        class237.field3432 = var11;
        class124.field1652 = var12;
        class40.field499 = var13;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V", line = 39)
    private static final void method340(int arg0, int arg1, int arg2, int arg3) {
        field610 = arg0;
        field604 = arg1;
        field630 = arg2;
        field634 = arg3;
        method343();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V", line = 51)
    public static final void method341(int arg0, int arg1) {
        field626 = arg0;
        field599 = arg1;
        method343();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V", line = 58)
    public static final void method342() {
        class255.method1781(0, 0, -102);
        method358();
        method357(-1);
        method367(false);
        method345(false);
        method350(false);
        method352();
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "()V", line = 67)
    private static final void method343() {
        field592.glViewport(field626 + field610, field604 + field599, field630, field634);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)V", line = 70)
    public static final void method344(int arg0, int arg1) {
        field607 = arg0;
        field621 = arg1;
        field611 = false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 75)
    public static final void method345(boolean arg0) {
        if (field591 == arg0) {
            return;
        }
        if (arg0) {
            field592.glEnable(2929);
        } else {
            field592.glDisable(2929);
        }
        field591 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "()V", line = 86)
    public static final void method346() {
        field592.glDepthMask(false);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "()V", line = 92)
    public static final void method347() {
        class255.method1781(0, 0, -116);
        method358();
        method354(0);
        method364(0);
        method367(false);
        method345(false);
        method350(false);
        method352();
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "()V", line = 104)
    public static final void method348() {
        field592.glDepthMask(true);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V", line = 109)
    private static final void method349(boolean arg0) {
        if (field619 == arg0) {
            return;
        }
        if (arg0) {
            field592.glEnableClientState(32885);
        } else {
            field592.glDisableClientState(32885);
        }
        field619 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(Z)V", line = 120)
    public static final void method350(boolean arg0) {
        if (field631 == arg0) {
            return;
        }
        if (arg0) {
            field592.glEnable(2912);
        } else {
            field592.glDisable(2912);
        }
        field631 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 132)
    private static final int method351(Canvas arg0, int arg1, GLContext arg2) {
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
            field601 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field601.setRealized(true);
            int var5 = 0;
            while (true) {
                field605 = field601.createContext(arg2);
                try {
                    int var6 = field605.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class177.method1299((byte) 64, 1000L);
            }
            field592 = field605.getGL();
            field623 = true;
            field607 = arg0.getSize().width;
            field621 = arg0.getSize().height;
            int var8 = method373();
            if (var8 != 0) {
                method362();
                return var8;
            }
            method376();
            method381();
            field592.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field601.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method362();
                        return -3;
                    }
                    class177.method1299((byte) 64, 100L);
                }
            }
            field592.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method362();
            return -5;
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "()V", line = 212)
    public static final void method352() {
        if (field627) {
            field592.glMatrixMode(5890);
            field592.glLoadIdentity();
            field592.glMatrixMode(5888);
            field627 = false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "()V", line = 229)
    public static final void method353() {
        class255.method1781(0, 0, -124);
        method358();
        method354(1);
        method364(1);
        method367(false);
        method345(false);
        method350(false);
        method352();
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 239)
    public static final void method354(int arg0) {
        if (field588 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field592.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field592.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field592.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field592.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field592.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field592.glTexEnvi(8960, 34161, 34165);
        }
        field588 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)V", line = 266)
    public static final void method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field607 - arg0;
        int var8 = -arg1;
        int var9 = field621 - arg1;
        field592.glMatrixMode(5889);
        field592.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field592.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method340(0, 0, field607, field621);
        field592.glMatrixMode(5888);
        field592.glLoadIdentity();
        field592.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field611 = false;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(IIII)V", line = 293)
    public static final void method356(int arg0, int arg1, int arg2, int arg3) {
        method339(0, 0, field607, field621, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 297)
    public static final void method357(int arg0) {
        if (field629 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field592.glDisable(3553);
        } else {
            if (field629 == -1) {
                field592.glEnable(3553);
            }
            field592.glBindTexture(3553, arg0);
        }
        field629 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "()V", line = 315)
    private static final void method358() {
        if (field611) {
            return;
        }
        field592.glMatrixMode(5889);
        field592.glLoadIdentity();
        field592.glOrtho(0.0D, (double) field607, 0.0D, (double) field621, -1.0D, 1.0D);
        method340(0, 0, field607, field621);
        field592.glMatrixMode(5888);
        field592.glLoadIdentity();
        field611 = true;
    }

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "()V", line = 328)
    public static void method359() {
        field600 = null;
        field602 = null;
        field592 = null;
        field601 = null;
        field605 = null;
        field615 = null;
    }

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "()V", line = 336)
    public static final void method360() {
        field592.glClear(256);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFFFFF)V", line = 342)
    private static final void method361(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field615[0] = var6 / (arg1 - arg0);
        field615[1] = 0.0F;
        field615[2] = 0.0F;
        field615[3] = 0.0F;
        field615[4] = 0.0F;
        field615[5] = var6 / (arg3 - arg2);
        field615[6] = 0.0F;
        field615[7] = 0.0F;
        field615[8] = (arg0 + arg1) / (arg1 - arg0);
        field615[9] = (arg2 + arg3) / (arg3 - arg2);
        field615[10] = field595 = -(arg4 + arg5) / (arg5 - arg4);
        field615[11] = -1.0F;
        field615[12] = 0.0F;
        field615[13] = 0.0F;
        field615[14] = field616 = -(arg5 * var6) / (arg5 - arg4);
        field615[15] = 0.0F;
        field592.glLoadMatrixf(field615, 0);
        field617 = 0.0F;
        field613 = 0.0F;
    }

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "()V", line = 369)
    public static final void method362() {
        if (field592 != null) {
            try {
                class46.method338();
                class208.method1535(-116);
            } catch (Throwable var7) {
            }
            field592 = null;
        }
        if (field605 != null) {
            class298.method2033();
            try {
                if (GLContext.getCurrent() == field605) {
                    field605.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field605.destroy();
            } catch (Throwable var5) {
            }
            field605 = null;
        }
        if (field601 != null) {
            try {
                field601.setRealized(false);
            } catch (Throwable var4) {
            }
            field601 = null;
        }
        class22.method148();
        field623 = false;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(IIII)V", line = 422)
    public static final void method363(int arg0, int arg1, int arg2, int arg3) {
        field592.glMatrixMode(5889);
        field592.glLoadIdentity();
        field592.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field592.glMatrixMode(5888);
        field592.glLoadIdentity();
        method340(field626, field599, field607, field621);
        field611 = false;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 431)
    public static final void method364(int arg0) {
        if (field636 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field592.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field592.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field592.glTexEnvi(8960, 34162, 260);
        }
        field636 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "()V", line = 447)
    public static final void method365() {
        int[] var0 = new int[2];
        field592.glGetIntegerv(3073, var0, 0);
        field592.glGetIntegerv(3074, var0, 1);
        field592.glDrawBuffer(1026);
        field592.glReadBuffer(1024);
        method357(-1);
        field592.glPushAttrib(8192);
        field592.glDisable(2912);
        field592.glDisable(3042);
        field592.glDisable(2929);
        field592.glDisable(3008);
        field592.glRasterPos2i(0, 0);
        field592.glCopyPixels(0, 0, field607, field621, 6144);
        field592.glPopAttrib();
        field592.glDrawBuffer(var0[0]);
        field592.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FFF)V", line = 479)
    public static final void method366(float arg0, float arg1, float arg2) {
        field592.glMatrixMode(5890);
        if (field627) {
            field592.glLoadIdentity();
        }
        field592.glTranslatef(arg0, arg1, arg2);
        field592.glMatrixMode(5888);
        field627 = true;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(Z)V", line = 497)
    public static final void method367(boolean arg0) {
        if (field612 == arg0) {
            return;
        }
        if (arg0) {
            field592.glEnable(2896);
        } else {
            field592.glDisable(2896);
        }
        field612 = arg0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 510)
    public static final void method368(Canvas arg0) {
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

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "()F", line = 530)
    public static final float method369() {
        return field613;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(F)V", line = 534)
    public static final void method370(float arg0) {
        method378(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "()I", line = 538)
    public static final int method371() {
        if (field614 && (field594 <= 0 || field589 != class298.field4320)) {
            int[] var0 = new int[1];
            field592.glGenFramebuffersEXT(1, var0, 0);
            field589 = class298.field4320;
            field594 = var0[0];
        }
        return field594;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)V", line = 552)
    public static final void method372(int arg0) {
        field592.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field592.glClear(16384);
        field592.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "()I", line = 562)
    private static final int method373() {
        int var0 = 0;
        field602 = field592.glGetString(7936);
        field600 = field592.glGetString(7937);
        String var1 = field602.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field592.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field622 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field622 < 12) {
            var0 |= 0x2;
        }
        if (!field592.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field592.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field592.glGetIntegerv(34018, var7, 0);
        field609 = var7[0];
        field592.glGetIntegerv(34929, var7, 0);
        field635 = var7[0];
        field592.glGetIntegerv(34930, var7, 0);
        field598 = var7[0];
        if (field609 < 2 || field635 < 2 || field598 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field593 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field618 = field592.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field606 = field592.isExtensionAvailable("GL_ARB_multisample");
        field597 = field592.isExtensionAvailable("GL_ARB_texture_cube_map");
        field633 = field592.isExtensionAvailable("GL_ARB_vertex_program");
        field614 = field592.isExtensionAvailable("GL_EXT_framebuffer_object");
        field592.isExtensionAvailable("GL_ARB_vertex_shader");
        field608 = field592.isExtensionAvailable("GL_ARB_fragment_shader");
        field620 = field592.isExtensionAvailable("GL_EXT_texture3D");
        field596 = field592.isExtensionAvailable("GL_ARB_texture_rectangle");
        field628 = field592.isExtensionAvailable("GL_ARB_texture_float");
        field624 = true;
        String var8 = field600.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class91.method655(0, ' ', var8.replace('/', ' '));
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class115.method844(var13.substring(1, 3), (byte) -36)) {
                        var10 = true;
                        break;
                    }
                    if (class115.method844(var13.substring(0, 4), (byte) -36)) {
                        var9 = class16.method118(true, var13.substring(0, 4));
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field618 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field620 = false;
            }
            if (var9 >= 9200 || var10) {
                field628 = false;
            }
            field603 = field618;
            field624 = false;
        }
        if (field618) {
            try {
                int[] var14 = new int[1];
                field592.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)V", line = 692)
    public static final void method374(int arg0) {
        field592.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field592.glClear(16640);
        field592.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "()V", line = 697)
    public static final void method375() {
        if (class67.field856) {
            method367(true);
            method349(true);
        } else {
            method367(false);
            method349(false);
        }
    }

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "()V", line = 711)
    private static final void method376() {
        int[] var0 = new int[1];
        field592.glGenTextures(1, var0, 0);
        field590 = var0[0];
        field592.glBindTexture(3553, field590);
        field592.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class22.method145();
        class67.method486(8);
        class46.method328();
    }

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "()F", line = 722)
    public static final float method377() {
        return field617;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(FF)V", line = 735)
    public static final void method378(float arg0, float arg1) {
        if (field611 || field617 == arg0 && field613 == arg1) {
            return;
        }
        field617 = arg0;
        field613 = arg1;
        if (arg1 == 0.0F) {
            field615[10] = field595;
            field615[14] = field616;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field616 * (1.0F - var2) / arg1;
            field615[10] = field595 + var4;
            field615[14] = field616 * var3;
        }
        field592.glMatrixMode(5889);
        field592.glLoadMatrixf(field615, 0);
        field592.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "()V", line = 766)
    public static final void method379() {
        try {
            field601.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 781)
    public static final int method380(Canvas arg0, int arg1) {
        return method351(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "()V", line = 789)
    private static final void method381() {
        field611 = false;
        field592.glDisable(3553);
        field629 = -1;
        field592.glTexEnvi(8960, 8704, 34160);
        field592.glTexEnvi(8960, 34161, 8448);
        field588 = 0;
        field592.glTexEnvi(8960, 34162, 8448);
        field636 = 0;
        field592.glEnable(2896);
        field592.glEnable(2912);
        field592.glEnable(2929);
        field612 = true;
        field591 = true;
        field631 = true;
        class346.method2398((byte) -2);
        field592.glActiveTexture(33985);
        field592.glTexEnvi(8960, 8704, 34160);
        field592.glTexEnvi(8960, 34161, 8448);
        field592.glTexEnvi(8960, 34162, 8448);
        field592.glActiveTexture(33984);
        field592.setSwapInterval(0);
        field592.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field592.glShadeModel(7425);
        field592.glClearDepth(1.0F);
        field592.glDepthFunc(515);
        method348();
        field592.glMatrixMode(5890);
        field592.glLoadIdentity();
        field592.glPolygonMode(1028, 6914);
        field592.glEnable(2884);
        field592.glCullFace(1029);
        field592.glEnable(3042);
        field592.glBlendFunc(770, 771);
        field592.glEnable(3008);
        field592.glAlphaFunc(516, 0.0F);
        field592.glEnableClientState(32884);
        field592.glEnableClientState(32885);
        field619 = true;
        field592.glEnableClientState(32886);
        field592.glEnableClientState(32888);
        field592.glMatrixMode(5888);
        field592.glLoadIdentity();
        class41.method298();
        class22.method143();
    }

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "()V", line = 853)
    public static final void method382() {
        class255.method1781(0, 0, -61);
        method358();
        method354(0);
        method364(0);
        method367(false);
        method345(false);
        method350(false);
        method352();
    }
}
