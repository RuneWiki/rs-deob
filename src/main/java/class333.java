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

@OriginalClass("client!al")
public class class333 {

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    private static int field5146 = -1;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "[F")
    private static float[] field5159 = new float[16];

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Z")
    private static boolean field5149 = true;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "Z")
    private static boolean field5168 = false;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    private static int field5152 = -1;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "F")
    private static float field5151 = 0.0F;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "F")
    private static float field5171 = 0.09765625F;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "Z")
    private static boolean field5179 = true;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    private static int field5163 = -1;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "Z")
    private static boolean field5181 = false;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public static int field5180 = 0;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "Z")
    public static boolean field5166 = false;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "Z")
    private static boolean field5176 = true;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    private static int field5167 = 0;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    private static int field5156 = 0;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "F")
    private static float field5189 = 0.0F;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "Z")
    public static boolean field5186 = true;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "F")
    private static float field5153;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "F")
    private static float field5154;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    private static int field5145;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    private static int field5148;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    private static int field5155;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    private static int field5158;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "I")
    private static int field5177;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    private static int field5178;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    private static int field5187;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Ljava/lang/String;")
    private static String field5150;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "Ljava/lang/String;")
    private static String field5183;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field5160;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field5173;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field5157;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Z")
    public static boolean field5142;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Z")
    public static boolean field5143;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Z")
    public static boolean field5144;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Z")
    public static boolean field5147;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "Z")
    public static boolean field5164;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "Z")
    public static boolean field5169;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "Z")
    public static boolean field5170;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "Z")
    public static boolean field5172;

    @OriginalMember(owner = "client!al", name = "R", descriptor = "Z")
    public static boolean field5184;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "Z")
    public static boolean field5185;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "Z")
    public static boolean field5188;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V", line = 11)
    public static final void method2280(int arg0) {
        field5160.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field5160.glClear(16640);
        field5160.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V", line = 16)
    public static final void method2281() {
        class174.method1179(0, 0, (byte) 71);
        method2292();
        method2306(0);
        method2285(0);
        method2308(false);
        method2316(false);
        method2312(false);
        method2300();
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 26)
    public static final void method2282(int arg0) {
        if (field5163 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field5160.glDisable(3553);
        } else {
            if (field5163 == -1) {
                field5160.glEnable(3553);
            }
            field5160.glBindTexture(3553, arg0);
        }
        field5163 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIFFII)V", line = 45)
    public static final void method2283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field5160.glMatrixMode(5889);
        field5160.glLoadIdentity();
        method2304((float) var10 * field5171, (float) var11 * field5171, (float) (-var13) * field5171, (float) (-var12) * field5171, 50.0F, 3584.0F);
        method2296(arg0, field5182 - arg1 - arg3, arg2, arg3);
        field5160.glMatrixMode(5888);
        field5160.glLoadIdentity();
        field5160.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field5160.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field5160.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field5181 = false;
        class27.field345 = var10;
        class54.field763 = var11;
        class234.field3757 = var12;
        class6.field65 = var13;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V", line = 72)
    public static final void method2284(int arg0, int arg1) {
        field5175 = arg0;
        field5162 = arg1;
        method2298();
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 77)
    public static final void method2285(int arg0) {
        if (field5167 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field5160.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field5160.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field5160.glTexEnvi(8960, 34162, 260);
        }
        field5167 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "()F", line = 93)
    public static final float method2286() {
        return field5189;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V", line = 98)
    public static final void method2287(int arg0) {
        field5160.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field5160.glClear(16384);
        field5160.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "()V", line = 105)
    private static final void method2288() {
        int[] var0 = new int[1];
        field5160.glGenTextures(1, var0, 0);
        field5161 = var0[0];
        field5160.glBindTexture(3553, field5161);
        field5160.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class147.method1040();
        class24.method182((byte) 22);
        class279.method1835();
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "()V", line = 115)
    public static final void method2289() {
        if (field5160 != null) {
            try {
                class279.method1845();
                class105.method713(-12482);
            } catch (Throwable var7) {
            }
            field5160 = null;
        }
        if (field5173 != null) {
            class301.method1984();
            try {
                if (GLContext.getCurrent() == field5173) {
                    field5173.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field5173.destroy();
            } catch (Throwable var5) {
            }
            field5173 = null;
        }
        if (field5157 != null) {
            try {
                field5157.setRealized(false);
            } catch (Throwable var4) {
            }
            field5157 = null;
        }
        class147.method1025();
        field5166 = false;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "()V", line = 164)
    public static final void method2290() {
        field5160.glDepthMask(false);
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "()V", line = 173)
    public static final void method2291() {
        field5160.glClear(256);
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "()V", line = 180)
    private static final void method2292() {
        if (field5181) {
            return;
        }
        field5160.glMatrixMode(5889);
        field5160.glLoadIdentity();
        field5160.glOrtho(0.0D, (double) field5165, 0.0D, (double) field5182, -1.0D, 1.0D);
        method2296(0, 0, field5165, field5182);
        field5160.glMatrixMode(5888);
        field5160.glLoadIdentity();
        field5181 = true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 194)
    public static final int method2293(Canvas arg0, int arg1) {
        return method2315(arg0, arg1, (GLContext) null);
    }

    @OriginalMember(owner = "client!al", name = "h", descriptor = "()F", line = 198)
    public static final float method2294() {
        return field5151;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V", line = 206)
    private static final void method2295(boolean arg0) {
        if (field5186 == arg0) {
            return;
        }
        if (arg0) {
            field5160.glEnableClientState(32885);
        } else {
            field5160.glDisableClientState(32885);
        }
        field5186 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V", line = 217)
    private static final void method2296(int arg0, int arg1, int arg2, int arg3) {
        field5158 = arg0;
        field5155 = arg1;
        field5187 = arg2;
        field5145 = arg3;
        method2298();
    }

    @OriginalMember(owner = "client!al", name = "i", descriptor = "()V", line = 224)
    public static void method2297() {
        field5183 = null;
        field5150 = null;
        field5160 = null;
        field5157 = null;
        field5173 = null;
        field5159 = null;
    }

    @OriginalMember(owner = "client!al", name = "j", descriptor = "()V", line = 233)
    private static final void method2298() {
        field5160.glViewport(field5175 + field5158, field5162 + field5155, field5187, field5145);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(IIII)V", line = 236)
    public static final void method2299(int arg0, int arg1, int arg2, int arg3) {
        field5160.glMatrixMode(5889);
        field5160.glLoadIdentity();
        field5160.glOrtho((double) arg0, (double) arg1, (double) arg3, (double) arg2, -1.0D, 1.0D);
        field5160.glMatrixMode(5888);
        field5160.glLoadIdentity();
        method2296(field5175, field5162, field5165, field5182);
        field5181 = false;
    }

    @OriginalMember(owner = "client!al", name = "k", descriptor = "()V", line = 247)
    public static final void method2300() {
        if (field5168) {
            field5160.glMatrixMode(5890);
            field5160.glLoadIdentity();
            field5160.glMatrixMode(5888);
            field5168 = false;
        }
    }

    @OriginalMember(owner = "client!al", name = "l", descriptor = "()V", line = 257)
    public static final void method2301() {
        field5160.glDepthMask(true);
    }

    @OriginalMember(owner = "client!al", name = "m", descriptor = "()V", line = 261)
    public static final void method2302() {
        int[] var0 = new int[2];
        field5160.glGetIntegerv(3073, var0, 0);
        field5160.glGetIntegerv(3074, var0, 1);
        field5160.glDrawBuffer(1026);
        field5160.glReadBuffer(1024);
        method2282(-1);
        field5160.glPushAttrib(8192);
        field5160.glDisable(2912);
        field5160.glDisable(3042);
        field5160.glDisable(2929);
        field5160.glDisable(3008);
        field5160.glRasterPos2i(0, 0);
        field5160.glCopyPixels(0, 0, field5165, field5182, 6144);
        field5160.glPopAttrib();
        field5160.glDrawBuffer(var0[0]);
        field5160.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 282)
    public static final void method2303(Canvas arg0) {
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

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(FFFFFF)V", line = 303)
    private static final void method2304(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field5159[0] = var6 / (arg1 - arg0);
        field5159[1] = 0.0F;
        field5159[2] = 0.0F;
        field5159[3] = 0.0F;
        field5159[4] = 0.0F;
        field5159[5] = var6 / (arg3 - arg2);
        field5159[6] = 0.0F;
        field5159[7] = 0.0F;
        field5159[8] = (arg0 + arg1) / (arg1 - arg0);
        field5159[9] = (arg2 + arg3) / (arg3 - arg2);
        field5159[10] = field5153 = -(arg4 + arg5) / (arg5 - arg4);
        field5159[11] = -1.0F;
        field5159[12] = 0.0F;
        field5159[13] = 0.0F;
        field5159[14] = field5154 = -(arg5 * var6) / (arg5 - arg4);
        field5159[15] = 0.0F;
        field5160.glLoadMatrixf(field5159, 0);
        field5189 = 0.0F;
        field5151 = 0.0F;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(F)V", line = 329)
    public static final void method2305(float arg0) {
        method2321(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V", line = 332)
    public static final void method2306(int arg0) {
        if (field5156 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field5160.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field5160.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field5160.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field5160.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field5160.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field5160.glTexEnvi(8960, 34161, 34165);
        }
        field5156 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "n", descriptor = "()V", line = 357)
    public static final void method2307() {
        class174.method1179(0, 0, (byte) 72);
        method2292();
        method2282(-1);
        method2308(false);
        method2316(false);
        method2312(false);
        method2300();
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(Z)V", line = 381)
    public static final void method2308(boolean arg0) {
        if (field5149 == arg0) {
            return;
        }
        if (arg0) {
            field5160.glEnable(2896);
        } else {
            field5160.glDisable(2896);
        }
        field5149 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "o", descriptor = "()V", line = 392)
    public static final void method2309() {
        if (class192.field2903) {
            method2308(true);
            method2295(true);
        } else {
            method2308(false);
            method2295(false);
        }
    }

    @OriginalMember(owner = "client!al", name = "p", descriptor = "()V", line = 407)
    public static final void method2310() {
        class174.method1179(0, 0, (byte) 68);
        method2292();
        method2306(1);
        method2285(1);
        method2308(false);
        method2316(false);
        method2312(false);
        method2300();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V", line = 418)
    public static final void method2311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field5165 - arg0;
        int var8 = -arg1;
        int var9 = field5182 - arg1;
        field5160.glMatrixMode(5889);
        field5160.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field5160.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        method2296(0, 0, field5165, field5182);
        field5160.glMatrixMode(5888);
        field5160.glLoadIdentity();
        field5160.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field5181 = false;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(Z)V", line = 451)
    public static final void method2312(boolean arg0) {
        if (field5176 == arg0) {
            return;
        }
        if (arg0) {
            field5160.glEnable(2912);
        } else {
            field5160.glDisable(2912);
        }
        field5176 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "q", descriptor = "()V", line = 465)
    private static final void method2313() {
        field5181 = false;
        field5160.glDisable(3553);
        field5163 = -1;
        field5160.glTexEnvi(8960, 8704, 34160);
        field5160.glTexEnvi(8960, 34161, 8448);
        field5156 = 0;
        field5160.glTexEnvi(8960, 34162, 8448);
        field5167 = 0;
        field5160.glEnable(2896);
        field5160.glEnable(2912);
        field5160.glEnable(2929);
        field5149 = true;
        field5179 = true;
        field5176 = true;
        class332.method2276((byte) 113);
        field5160.glActiveTexture(33985);
        field5160.glTexEnvi(8960, 8704, 34160);
        field5160.glTexEnvi(8960, 34161, 8448);
        field5160.glTexEnvi(8960, 34162, 8448);
        field5160.glActiveTexture(33984);
        field5160.setSwapInterval(0);
        field5160.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field5160.glShadeModel(7425);
        field5160.glClearDepth(1.0D);
        field5160.glDepthFunc(515);
        method2301();
        field5160.glMatrixMode(5890);
        field5160.glLoadIdentity();
        field5160.glPolygonMode(1028, 6914);
        field5160.glEnable(2884);
        field5160.glCullFace(1029);
        field5160.glEnable(3042);
        field5160.glBlendFunc(770, 771);
        field5160.glEnable(3008);
        field5160.glAlphaFunc(516, 0.0F);
        field5160.glEnableClientState(32884);
        field5160.glEnableClientState(32885);
        field5186 = true;
        field5160.glEnableClientState(32886);
        field5160.glEnableClientState(32888);
        field5160.glMatrixMode(5888);
        field5160.glLoadIdentity();
        class326.method2215();
        class147.method1036();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(FFF)V", line = 514)
    public static final void method2314(float arg0, float arg1, float arg2) {
        field5160.glMatrixMode(5890);
        if (field5168) {
            field5160.glLoadIdentity();
        }
        field5160.glTranslatef(arg0, arg1, arg2);
        field5160.glMatrixMode(5888);
        field5168 = true;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Canvas;ILjavax/media/opengl/GLContext;)I", line = 525)
    private static final int method2315(Canvas arg0, int arg1, GLContext arg2) {
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
            field5157 = var4.getGLDrawable(arg0, var3, (GLCapabilitiesChooser) null);
            field5157.setRealized(true);
            int var5 = 0;
            while (true) {
                field5173 = field5157.createContext(arg2);
                try {
                    int var6 = field5173.makeCurrent();
                    if (var6 != 0) {
                        break;
                    }
                } catch (Exception var13) {
                }
                if (var5++ > 5) {
                    return -2;
                }
                class96.method657(1000L, (byte) -115);
            }
            field5160 = field5173.getGL();
            new GLU();
            field5166 = true;
            field5165 = arg0.getSize().width;
            field5182 = arg0.getSize().height;
            int var8 = method2320();
            if (var8 != 0) {
                method2289();
                return var8;
            }
            method2288();
            method2313();
            field5160.glClear(16384);
            int var9 = 0;
            while (true) {
                try {
                    field5157.swapBuffers();
                    break;
                } catch (Exception var12) {
                    if (var9++ > 5) {
                        method2289();
                        return -3;
                    }
                    class96.method657(100L, (byte) -115);
                }
            }
            field5160.glClear(16384);
            return 0;
        } catch (Throwable var14) {
            method2289();
            return -5;
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(Z)V", line = 615)
    public static final void method2316(boolean arg0) {
        if (field5179 == arg0) {
            return;
        }
        if (arg0) {
            field5160.glEnable(2929);
        } else {
            field5160.glDisable(2929);
        }
        field5179 = arg0;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)V", line = 633)
    public static final void method2317(int arg0, int arg1) {
        field5165 = arg0;
        field5182 = arg1;
        field5181 = false;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(IIII)V", line = 638)
    public static final void method2318(int arg0, int arg1, int arg2, int arg3) {
        method2283(0, 0, field5165, field5182, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!al", name = "r", descriptor = "()V", line = 644)
    public static final void method2319() {
        try {
            field5157.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!al", name = "s", descriptor = "()I", line = 662)
    private static final int method2320() {
        int var0 = 0;
        field5150 = field5160.glGetString(7936);
        field5183 = field5160.glGetString(7937);
        String var1 = field5150.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field5160.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field5178 = var4 * 10 + var5;
            } catch (NumberFormatException var17) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field5178 < 12) {
            var0 |= 0x2;
        }
        if (!field5160.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field5160.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field5160.glGetIntegerv(34018, var7, 0);
        field5174 = var7[0];
        field5160.glGetIntegerv(34929, var7, 0);
        field5148 = var7[0];
        field5160.glGetIntegerv(34930, var7, 0);
        field5177 = var7[0];
        if (field5174 < 2 || field5148 < 2 || field5177 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field5170 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field5188 = field5160.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field5144 = field5160.isExtensionAvailable("GL_ARB_multisample");
        field5185 = field5160.isExtensionAvailable("GL_ARB_texture_cube_map");
        field5143 = field5160.isExtensionAvailable("GL_ARB_vertex_program");
        field5142 = field5160.isExtensionAvailable("GL_EXT_framebuffer_object");
        field5160.isExtensionAvailable("GL_ARB_vertex_shader");
        field5147 = field5160.isExtensionAvailable("GL_ARB_fragment_shader");
        field5184 = field5160.isExtensionAvailable("GL_EXT_texture3D");
        field5169 = field5160.isExtensionAvailable("GL_ARB_texture_rectangle");
        field5172 = field5160.isExtensionAvailable("GL_ARB_texture_float");
        String var8 = field5183.toLowerCase(Locale.ENGLISH);
        if (var8.indexOf("radeon") != -1) {
            int var9 = 0;
            boolean var10 = false;
            String[] var11 = class318.method2163(var8.replace('/', ' '), -62, ' ');
            for (int var12 = 0; var12 < var11.length; var12++) {
                String var13 = var11[var12];
                if (var13.length() >= 4) {
                    if (var13.charAt(0) == 'x' && class139.method944(var13.substring(1, 3), 125)) {
                        var10 = true;
                        break;
                    }
                    if (class139.method944(var13.substring(0, 4), 88)) {
                        var9 = class154.method1073(-123, var13.substring(0, 4));
                        break;
                    }
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field5188 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field5184 = false;
            }
            if (var9 >= 9200 || var10) {
                field5172 = false;
            }
            field5164 = field5188;
        }
        if (field5188) {
            try {
                int[] var14 = new int[1];
                field5160.glGenBuffersARB(1, var14, 0);
            } catch (Throwable var16) {
                return -4;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(FF)V", line = 798)
    public static final void method2321(float arg0, float arg1) {
        if (field5181 || field5189 == arg0 && field5151 == arg1) {
            return;
        }
        field5189 = arg0;
        field5151 = arg1;
        if (arg1 == 0.0F) {
            field5159[10] = field5153;
            field5159[14] = field5154;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field5154 * (1.0F - var2) / arg1;
            field5159[10] = field5153 + var4;
            field5159[14] = field5154 * var3;
        }
        field5160.glMatrixMode(5889);
        field5160.glLoadMatrixf(field5159, 0);
        field5160.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!al", name = "t", descriptor = "()V", line = 836)
    public static final void method2322() {
        class174.method1179(0, 0, (byte) 78);
        method2292();
        method2306(0);
        method2285(0);
        method2308(false);
        method2316(false);
        method2312(false);
        method2300();
    }

    @OriginalMember(owner = "client!al", name = "u", descriptor = "()I", line = 850)
    public static final int method2323() {
        if (field5142 && (field5152 <= 0 || field5146 != class301.field4649)) {
            int[] var0 = new int[1];
            field5160.glGenFramebuffersEXT(1, var0, 0);
            field5146 = class301.field4649;
            field5152 = var0[0];
        }
        return field5152;
    }
}
