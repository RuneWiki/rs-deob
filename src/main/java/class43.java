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

@OriginalClass("client!sg")
public class class43 {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Z")
    private static boolean field643 = true;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Z")
    private static boolean field645 = true;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    private static int field638 = -1;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    private static int field642 = -1;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "F")
    private static float field653 = 0.09765625F;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "Z")
    private static boolean field670 = false;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "Z")
    public static boolean field668 = true;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    private static int field669 = 0;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    private static int field667 = -1;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Z")
    private static boolean field659 = false;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Z")
    private static boolean field657 = true;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "I")
    private static int field684 = 0;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "F")
    private static float field666 = 0.0F;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "[F")
    private static float[] field658 = new float[16];

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "F")
    private static float field661 = 0.0F;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "Z")
    public static boolean field680 = false;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "F")
    private static float field654;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "F")
    private static float field671;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    private static int field640;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    private static int field641;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    private static int field649;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    private static int field655;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    private static int field673;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "I")
    private static int field681;

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    private static int field686;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Ljava/lang/String;")
    private static String field648;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Ljava/lang/String;")
    private static String field652;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field651;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field646;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field677;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Z")
    public static boolean field639;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Z")
    public static boolean field647;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Z")
    public static boolean field650;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Z")
    public static boolean field656;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "Z")
    public static boolean field662;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "Z")
    public static boolean field663;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "Z")
    public static boolean field664;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "Z")
    public static boolean field674;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "Z")
    public static boolean field676;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "Z")
    public static boolean field678;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "Z")
    public static boolean field682;

    @OriginalMember(owner = "client!sg", name = "V", descriptor = "Z")
    public static boolean field685;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 10)
    public static final void method349(int arg0) {
        if (field669 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field651.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field651.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field651.glTexEnvi(8960, 34162, 260);
        }
        field669 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIII)V", line = 29)
    public static final void method350(int arg0, int arg1, int arg2, int arg3) {
        method351(0, 0, field660, field665, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIFFII)V", line = 34)
    public static final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field651.glMatrixMode(5889);
        field651.glLoadIdentity();
        method369((float) var10 * field653, (float) var11 * field653, (float) (-var13) * field653, (float) (-var12) * field653, 50.0F, 3584.0F);
        method356(arg0, field665 - arg1 - arg3, arg2, arg3);
        field651.glMatrixMode(5888);
        field651.glLoadIdentity();
        field651.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field651.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field651.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field659 = false;
        class317.field5033 = var10;
        class321.field5096 = var11;
        class298.field4753 = var12;
        class58.field901 = var13;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 63)
    public static final void method352(boolean arg0) {
        if (field645 == arg0) {
            return;
        }
        if (arg0) {
            field651.glEnable(2896);
        } else {
            field651.glDisable(2896);
        }
        field645 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(IIII)V", line = 76)
    public static final void method353(int arg0, int arg1, int arg2, int arg3) {
        field651.glMatrixMode(5889);
        field651.glLoadIdentity();
        field651.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field651.glMatrixMode(5888);
        field651.glLoadIdentity();
        method356(field683, field644, field660, field665);
        field659 = false;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V", line = 86)
    public static final void method354() {
        field651.glDepthMask(false);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V", line = 89)
    public static final void method355(int arg0, int arg1) {
        field660 = arg0;
        field665 = arg1;
        field659 = false;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(IIII)V", line = 96)
    private static final void method356(int arg0, int arg1, int arg2, int arg3) {
        field673 = arg0;
        field649 = arg1;
        field681 = arg2;
        field640 = arg3;
        method364();
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)V", line = 104)
    public static final void method357(int arg0, int arg1) {
        field683 = arg0;
        field644 = arg1;
        method364();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 110)
    public static final void method358(Canvas arg0) {
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

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(F)V", line = 131)
    public static final void method359(float arg0) {
        method375(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()V", line = 139)
    public static final void method360() {
        field651.glClear(256);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()V", line = 143)
    private static final void method361() {
        int[] var0 = new int[1];
        field651.glGenTextures(1, var0, 0);
        field679 = var0[0];
        field651.glBindTexture(3553, field679);
        field651.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class245.method1722();
        class13.method129(true);
        class16.method158();
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "()V", line = 153)
    public static final void method362() {
        if (class64.field1001) {
            method352(true);
            method380(true);
        } else {
            method352(false);
            method380(false);
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "()V", line = 172)
    public static final void method363() {
        int[] var0 = new int[2];
        field651.glGetIntegerv(3073, var0, 0);
        field651.glGetIntegerv(3074, var0, 1);
        field651.glDrawBuffer(1026);
        field651.glReadBuffer(1024);
        method390(-1);
        field651.glPushAttrib(8192);
        field651.glDisable(2912);
        field651.glDisable(3042);
        field651.glDisable(2929);
        field651.glDisable(3008);
        field651.glRasterPos2i(0, 0);
        field651.glCopyPixels(0, 0, field660, field665, 6144);
        field651.glPopAttrib();
        field651.glDrawBuffer(var0[0]);
        field651.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "()V", line = 190)
    private static final void method364() {
        field651.glViewport(field683 + field673, field649 + field644, field681, field640);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 193)
    public static final void method365(int arg0) {
        field651.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field651.glClear(16384);
        field651.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)V", line = 199)
    public static final void method366(boolean arg0) {
        if (field643 == arg0) {
            return;
        }
        if (arg0) {
            field651.glEnable(2929);
        } else {
            field651.glDisable(2929);
        }
        field643 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "()I", line = 210)
    public static final int method367() {
        if (field664 && (field642 <= 0 || field638 != class151.field2669)) {
            int[] var0 = new int[1];
            field651.glGenFramebuffersEXT(1, var0, 0);
            field638 = class151.field2669;
            field642 = var0[0];
        }
        return field642;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 224)
    public static final void method368(int arg0) {
        if (field684 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field651.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field651.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field651.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field651.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field651.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field651.glTexEnvi(8960, 34161, 34165);
        }
        field684 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFFFFF)V", line = 251)
    private static final void method369(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field658[0] = var6 / (arg1 - arg0);
        field658[1] = 0.0F;
        field658[2] = 0.0F;
        field658[3] = 0.0F;
        field658[4] = 0.0F;
        field658[5] = var6 / (arg3 - arg2);
        field658[6] = 0.0F;
        field658[7] = 0.0F;
        field658[8] = (arg0 + arg1) / (arg1 - arg0);
        field658[9] = (arg2 + arg3) / (arg3 - arg2);
        field658[10] = field654 = -(arg4 + arg5) / (arg5 - arg4);
        field658[11] = -1.0F;
        field658[12] = 0.0F;
        field658[13] = 0.0F;
        field658[14] = field671 = -(arg5 * var6) / (arg5 - arg4);
        field658[15] = 0.0F;
        field651.glLoadMatrixf(field658, 0);
        field661 = 0.0F;
        field666 = 0.0F;
    }

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "()V", line = 273)
    public static void method370() {
        field652 = null;
        field648 = null;
        field651 = null;
        field677 = null;
        field646 = null;
        field658 = null;
    }

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "()V", line = 283)
    public static final void method371() {
        if (field670) {
            field651.glMatrixMode(5890);
            field651.glLoadIdentity();
            field651.glMatrixMode(5888);
            field670 = false;
        }
    }

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "()V", line = 297)
    public static final void method372() {
        class83.method749(0, 0, 98);
        method388();
        method390(-1);
        method352(false);
        method366(false);
        method392(false);
        method371();
    }

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "()V", line = 306)
    public static final void method373() {
        if (field651 != null) {
            try {
                class16.method160();
                class12.method123((byte) -12);
            } catch (Throwable var7) {
            }
            field651 = null;
        }
        if (field646 != null) {
            class151.method1193();
            try {
                if (GLContext.getCurrent() == field646) {
                    field646.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field646.destroy();
            } catch (Throwable var5) {
            }
            field646 = null;
        }
        if (field677 != null) {
            try {
                field677.setRealized(false);
            } catch (Throwable var4) {
            }
            field677 = null;
        }
        class245.method1716();
        field680 = false;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V", line = 360)
    public static final void method374(int arg0) {
        field651.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field651.glClear(16640);
        field651.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FF)V", line = 377)
    public static final void method375(float arg0, float arg1) {
        if (field659 || field661 == arg0 && field666 == arg1) {
            return;
        }
        field661 = arg0;
        field666 = arg1;
        if (arg1 == 0.0F) {
            field658[10] = field654;
            field658[14] = field671;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field671 * (1.0F - var2) / arg1;
            field658[10] = field654 + var4;
            field658[14] = field671 * var3;
        }
        field651.glMatrixMode(5889);
        field651.glLoadMatrixf(field658, 0);
        field651.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "()V", line = 407)
    public static final void method376() {
        field651.glDepthMask(true);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(FFF)V", line = 411)
    public static final void method377(float arg0, float arg1, float arg2) {
        field651.glMatrixMode(5890);
        if (field670) {
            field651.glLoadIdentity();
        }
        field651.glTranslatef(arg0, arg1, arg2);
        field651.glMatrixMode(5888);
        field670 = true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIII)V", line = 423)
    public static final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field660 - arg0;
        int var8 = -arg1;
        int var9 = field665 - arg1;
        field651.glMatrixMode(5889);
        field651.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field651.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method356(0, 0, field660, field665);
        field651.glMatrixMode(5888);
        field651.glLoadIdentity();
        field651.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field659 = false;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 446)
    public static final int method379(Canvas arg0, int arg1) {
        return method389(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)V", line = 453)
    private static final void method380(boolean arg0) {
        if (field668 == arg0) {
            return;
        }
        if (arg0) {
            field651.glEnableClientState(32885);
        } else {
            field651.glDisableClientState(32885);
        }
        field668 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "()F", line = 475)
    public static final float method381() {
        return field661;
    }

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "()F", line = 483)
    public static final float method382() {
        return field666;
    }

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "()V", line = 487)
    public static final void method383() {
        class83.method749(0, 0, 94);
        method388();
        method368(0);
        method349(0);
        method352(false);
        method366(false);
        method392(false);
        method371();
    }

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "()V", line = 513)
    public static final void method384() {
        class83.method749(0, 0, 89);
        method388();
        method368(0);
        method349(0);
        method352(false);
        method366(false);
        method392(false);
        method371();
    }

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "()V", line = 527)
    public static final void method385() {
        try {
            field677.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "()V", line = 538)
    private static final void method386() {
        field659 = false;
        field651.glDisable(3553);
        field667 = -1;
        field651.glTexEnvi(8960, 8704, 34160);
        field651.glTexEnvi(8960, 34161, 8448);
        field684 = 0;
        field651.glTexEnvi(8960, 34162, 8448);
        field669 = 0;
        field651.glEnable(2896);
        field651.glEnable(2912);
        field651.glEnable(2929);
        field645 = true;
        field643 = true;
        field657 = true;
        class179.method1375(0);
        field651.glActiveTexture(33985);
        field651.glTexEnvi(8960, 8704, 34160);
        field651.glTexEnvi(8960, 34161, 8448);
        field651.glTexEnvi(8960, 34162, 8448);
        field651.glActiveTexture(33984);
        field651.setSwapInterval(0);
        field651.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field651.glShadeModel(7425);
        field651.glClearDepth(1.0F);
        field651.glDepthFunc(515);
        method376();
        field651.glMatrixMode(5890);
        field651.glLoadIdentity();
        field651.glPolygonMode(1028, 6914);
        field651.glEnable(2884);
        field651.glCullFace(1029);
        field651.glEnable(3042);
        field651.glBlendFunc(770, 771);
        field651.glEnable(3008);
        field651.glAlphaFunc(516, 0.0F);
        field651.glEnableClientState(32884);
        field651.glEnableClientState(32885);
        field668 = true;
        field651.glEnableClientState(32886);
        field651.glEnableClientState(32888);
        field651.glMatrixMode(5888);
        field651.glLoadIdentity();
        class9.method67();
        class245.method1711();
    }

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "()I", line = 590)
    private static final int method387() {
        int var0 = 0;
        field648 = field651.glGetString(7936);
        field652 = field651.glGetString(7937);
        String var1 = field648.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field651.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field641 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field641 < 12) {
            var0 |= 0x2;
        }
        if (!field651.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field651.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field651.glGetIntegerv(34018, var7, 0);
        field672 = var7[0];
        field651.glGetIntegerv(34929, var7, 0);
        field686 = var7[0];
        field651.glGetIntegerv(34930, var7, 0);
        field655 = var7[0];
        if (field672 < 2 || field686 < 2 || field655 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field639 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field674 = field651.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field676 = field651.isExtensionAvailable("GL_ARB_multisample");
        field647 = field651.isExtensionAvailable("GL_ARB_texture_cube_map");
        field682 = field651.isExtensionAvailable("GL_ARB_vertex_program");
        field664 = field651.isExtensionAvailable("GL_EXT_framebuffer_object");
        field651.isExtensionAvailable("GL_ARB_vertex_shader");
        field663 = field651.isExtensionAvailable("GL_ARB_fragment_shader");
        field678 = field651.isExtensionAvailable("GL_EXT_texture3D");
        field662 = field651.isExtensionAvailable("GL_ARB_texture_rectangle");
        field656 = field651.isExtensionAvailable("GL_ARB_texture_float");
        field650 = true;
        String var8 = field652.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class100.method866(var8.replace('/', ' '), true, ' ');
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class342.method2407(-31, var13.substring(1, 3))) {
                        var10 = true;
                        break;
                    }
                    if (class342.method2407(53, var13.substring(0, 4))) {
                        var9 = class97.method841(var13.substring(0, 4), (byte) -20);
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field674 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field678 = false;
            }
            if (var9 >= 9200 || var10) {
                field656 = false;
            }
            field685 = field674;
            field650 = false;
        }
        if (field674) {
            try {
                int[] var14 = new int[1];
                field651.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "()V", line = 723)
    private static final void method388() {
        if (field659) {
            return;
        }
        field651.glMatrixMode(5889);
        field651.glLoadIdentity();
        field651.glOrtho(0.0D, (double) field660, 0.0D, (double) field665, -1.0D, 1.0D);
        method356(0, 0, field660, field665);
        field651.glMatrixMode(5888);
        field651.glLoadIdentity();
        field659 = true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 742)
    private static final int method389(Canvas arg0, int arg1, GLContext arg2) {
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
            field677 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field677.setRealized(true);
            int var5 = 0;
            while (true) {
                field646 = field677.createContext(arg2);
                try {
                    int var6 = field646.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class142.method1149(1000L, (byte) 127);
            }
            field651 = field646.getGL();
            field680 = true;
            field660 = arg0.getSize().width;
            field665 = arg0.getSize().height;
            int var8 = method387();
            if (var8 != 0) {
                method373();
                return var8;
            }
            method361();
            method386();
            field651.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field677.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method373();
                        return -3;
                    }
                    class142.method1149(100L, (byte) 126);
                }
            }
            field651.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method373();
            return -5;
        }
    }

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V", line = 824)
    public static final void method390(int arg0) {
        if (field667 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field651.glDisable(3553);
        } else {
            if (field667 == -1) {
                field651.glEnable(3553);
            }
            field651.glBindTexture(3553, arg0);
        }
        field667 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "()V", line = 840)
    public static final void method391() {
        class83.method749(0, 0, 103);
        method388();
        method368(1);
        method349(1);
        method352(false);
        method366(false);
        method392(false);
        method371();
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(Z)V", line = 851)
    public static final void method392(boolean arg0) {
        if (field657 == arg0) {
            return;
        }
        if (arg0) {
            field651.glEnable(2912);
        } else {
            field651.glDisable(2912);
        }
        field657 = arg0;
    }
}
