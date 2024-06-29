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

@OriginalClass("client!uf")
public class class21 {

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    private static int field364 = -1;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Z")
    private static boolean field366 = true;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Z")
    public static boolean field360 = true;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Z")
    private static boolean field370 = true;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "Z")
    private static boolean field373 = false;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
    private static boolean field352 = true;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    private static int field353 = 0;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "Z")
    private static boolean field376 = false;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "F")
    private static float field356 = 0.0F;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "F")
    private static float field380 = 0.09765625F;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "[F")
    private static float[] field378 = new float[16];

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lqd;")
    private static class40 field358 = class147.method1106("radeon", (byte) -82);

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    private static int field362 = 0;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Z")
    public static boolean field350 = false;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "F")
    private static float field383 = 0.0F;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field357 = 0;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "F")
    private static float field371;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "F")
    private static float field379;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    private static int field354;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    private static int field355;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    private static int field375;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "Ljava/lang/String;")
    private static String field374;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "Ljava/lang/String;")
    private static String field385;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field377;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field368;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field372;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Z")
    public static boolean field349;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Z")
    public static boolean field359;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Z")
    public static boolean field363;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Z")
    public static boolean field367;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "Z")
    public static boolean field369;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "Z")
    public static boolean field382;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "Z")
    public static boolean field384;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "()V", line = 10)
    private static final void method130() {
        if (field376) {
            return;
        }
        field377.glMatrixMode(5889);
        field377.glLoadIdentity();
        field377.glOrtho(0.0D, (double) field351, 0.0D, (double) field361, -1.0D, 1.0D);
        field377.glViewport(0, 0, field351, field361);
        field377.glMatrixMode(5888);
        field377.glLoadIdentity();
        field376 = true;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "()V", line = 24)
    private static final void method131() {
        int[] var0 = new int[1];
        field377.glGenTextures(1, var0, 0);
        field381 = var0[0];
        field377.glBindTexture(3553, field381);
        field377.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class301.method2057(6);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "()V", line = 36)
    public static final void method132() {
        class60.method504(0, 0, 20789);
        method130();
        method140(-1);
        method136(false);
        method152(false);
        method160(false);
        method137();
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(F)V", line = 46)
    public static final void method133(float arg0) {
        method138(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "()V", line = 59)
    public static final void method134() {
        class60.method504(0, 0, 20789);
        method130();
        method144(1);
        method164(1);
        method136(false);
        method152(false);
        method160(false);
        method137();
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "()V", line = 70)
    public static final void method135() {
        int[] var0 = new int[2];
        field377.glGetIntegerv(3073, var0, 0);
        field377.glGetIntegerv(3074, var0, 1);
        field377.glDrawBuffer(1026);
        field377.glReadBuffer(1024);
        method140(-1);
        field377.glPushAttrib(8192);
        field377.glDisable(2912);
        field377.glDisable(3042);
        field377.glDisable(2929);
        field377.glDisable(3008);
        field377.glRasterPos2i(0, 0);
        field377.glCopyPixels(0, 0, field351, field361, 6144);
        field377.glPopAttrib();
        field377.glDrawBuffer(var0[0]);
        field377.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 88)
    public static final void method136(boolean arg0) {
        if (field370 == arg0) {
            return;
        }
        if (arg0) {
            field377.glEnable(2896);
        } else {
            field377.glDisable(2896);
        }
        field370 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "()V", line = 100)
    public static final void method137() {
        if (field373) {
            field377.glMatrixMode(5890);
            field377.glLoadIdentity();
            field377.glMatrixMode(5888);
            field373 = false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(FF)V", line = 110)
    public static final void method138(float arg0, float arg1) {
        if (field376 || field356 == arg0 && field383 == arg1) {
            return;
        }
        field356 = arg0;
        field383 = arg1;
        if (arg1 == 0.0F) {
            field378[10] = field371;
            field378[14] = field379;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field379 * (1.0F - var2) / arg1;
            field378[10] = field371 + var4;
            field378[14] = field379 * var3;
        }
        field377.glMatrixMode(5889);
        field377.glLoadMatrixf(field378, 0);
        field377.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "()V", line = 140)
    public static void method139() {
        field358 = null;
        field385 = null;
        field374 = null;
        field377 = null;
        field372 = null;
        field368 = null;
        field378 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 152)
    public static final void method140(int arg0) {
        if (field364 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field377.glDisable(3553);
        } else {
            if (field364 == -1) {
                field377.glEnable(3553);
            }
            field377.glBindTexture(3553, arg0);
        }
        field364 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIII)V", line = 169)
    public static final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field351 - arg0;
        int var8 = -arg1;
        int var9 = field361 - arg1;
        field377.glMatrixMode(5889);
        field377.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field377.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field377.glViewport(0, 0, field351, field361);
        field377.glMatrixMode(5888);
        field377.glLoadIdentity();
        field377.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field376 = false;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 197)
    public static final void method142(int arg0) {
        field377.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field377.glClear(16640);
        field377.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(FFF)V", line = 204)
    public static final void method143(float arg0, float arg1, float arg2) {
        field377.glMatrixMode(5890);
        if (field373) {
            field377.glLoadIdentity();
        }
        field377.glTranslatef(arg0, arg1, arg2);
        field377.glMatrixMode(5888);
        field373 = true;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V", line = 218)
    public static final void method144(int arg0) {
        if (field362 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field377.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field377.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field377.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field377.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field377.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field377.glTexEnvi(8960, 34161, 34165);
        }
        field362 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 243)
    public static final void method145(Canvas arg0) {
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

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "()V", line = 267)
    public static final void method146() {
        field377.glClear(256);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIFFII)V", line = 271)
    public static final void method147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field377.glMatrixMode(5889);
        field377.glLoadIdentity();
        method154((float) var10 * field380, (float) var11 * field380, (float) (-var13) * field380, (float) (-var12) * field380, 50.0F, 3584.0F);
        field377.glViewport(arg0, field361 - arg1 - arg3, arg2, arg3);
        field377.glMatrixMode(5888);
        field377.glLoadIdentity();
        field377.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field377.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field377.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field376 = false;
        class186.field3011 = var10;
        class162.field2695 = var11;
        class188.field3042 = var12;
        class218.field3630 = var13;
    }

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "()V", line = 304)
    public static final void method148() {
        class60.method504(0, 0, 20789);
        method130();
        method144(0);
        method164(0);
        method136(false);
        method152(false);
        method160(false);
        method137();
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)V", line = 318)
    private static final void method149(boolean arg0) {
        if (field360 == arg0) {
            return;
        }
        if (arg0) {
            field377.glEnableClientState(32885);
        } else {
            field377.glDisableClientState(32885);
        }
        field360 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "()V", line = 329)
    public static final void method150() {
        field377.glDepthMask(false);
    }

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "()V", line = 341)
    public static final void method151() {
        class60.method504(0, 0, 20789);
        method130();
        method144(0);
        method164(0);
        method136(false);
        method152(false);
        method160(false);
        method137();
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(Z)V", line = 351)
    public static final void method152(boolean arg0) {
        if (field352 == arg0) {
            return;
        }
        if (arg0) {
            field377.glEnable(2929);
        } else {
            field377.glDisable(2929);
        }
        field352 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 363)
    public static final int method153(Canvas arg0, int arg1) {
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
            field372 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
            field372.setRealized(true);
            int var4 = 0;
            while (true) {
                field368 = field372.createContext((GLContext) null);
                try {
                    int var5 = field368.makeCurrent();
                    if (var5 != 0) {
                        break;
                    }
                } catch (Exception var12) {
                }
                if (var4++ > 5) {
                    return -2;
                }
                class160.method1227(1000L, false);
            }
            field377 = field368.getGL();
            new GLU();
            field350 = true;
            field351 = arg0.getSize().width;
            field361 = arg0.getSize().height;
            int var7 = method167();
            if (var7 != 0) {
                method166();
                return var7;
            }
            method131();
            method158();
            field377.glClear(16384);
            int var8 = 0;
            while (true) {
                try {
                    field372.swapBuffers();
                    break;
                } catch (Exception var11) {
                    if (var8++ > 5) {
                        method166();
                        return -3;
                    }
                    class160.method1227(100L, false);
                }
            }
            field377.glClear(16384);
            return 0;
        } catch (Throwable var13) {
            method166();
            return -5;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(FFFFFF)V", line = 451)
    private static final void method154(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field378[0] = var6 / (arg1 - arg0);
        field378[1] = 0.0F;
        field378[2] = 0.0F;
        field378[3] = 0.0F;
        field378[4] = 0.0F;
        field378[5] = var6 / (arg3 - arg2);
        field378[6] = 0.0F;
        field378[7] = 0.0F;
        field378[8] = (arg0 + arg1) / (arg1 - arg0);
        field378[9] = (arg2 + arg3) / (arg3 - arg2);
        field378[10] = field371 = -(arg4 + arg5) / (arg5 - arg4);
        field378[11] = -1.0F;
        field378[12] = 0.0F;
        field378[13] = 0.0F;
        field378[14] = field379 = -(arg5 * var6) / (arg5 - arg4);
        field378[15] = 0.0F;
        field377.glLoadMatrixf(field378, 0);
        field356 = 0.0F;
        field383 = 0.0F;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)V", line = 477)
    public static final void method155(int arg0, int arg1, int arg2, int arg3) {
        method147(0, 0, field351, field361, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "()F", line = 483)
    public static final float method156() {
        return field383;
    }

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "()V", line = 492)
    public static final void method157() {
        if (class1.field8) {
            method136(true);
            method149(true);
        } else {
            method136(false);
            method149(false);
        }
    }

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "()V", line = 507)
    private static final void method158() {
        field376 = false;
        field377.glDisable(3553);
        field364 = -1;
        field377.glTexEnvi(8960, 8704, 34160);
        field377.glTexEnvi(8960, 34161, 8448);
        field362 = 0;
        field377.glTexEnvi(8960, 34162, 8448);
        field353 = 0;
        field377.glEnable(2896);
        field377.glEnable(2912);
        field377.glEnable(2929);
        field370 = true;
        field352 = true;
        field366 = true;
        class96.method717(-102);
        field377.glActiveTexture(33985);
        field377.glTexEnvi(8960, 8704, 34160);
        field377.glTexEnvi(8960, 34161, 8448);
        field377.glTexEnvi(8960, 34162, 8448);
        field377.glActiveTexture(33984);
        field377.setSwapInterval(0);
        field377.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field377.glShadeModel(7425);
        field377.glClearDepth(1.0D);
        field377.glDepthFunc(515);
        method163();
        field377.glMatrixMode(5890);
        field377.glLoadIdentity();
        field377.glPolygonMode(1028, 6914);
        field377.glEnable(2884);
        field377.glCullFace(1029);
        field377.glEnable(3042);
        field377.glBlendFunc(770, 771);
        field377.glEnable(3008);
        field377.glAlphaFunc(516, 0.0F);
        field377.glEnableClientState(32884);
        field377.glEnableClientState(32885);
        field360 = true;
        field377.glEnableClientState(32886);
        field377.glEnableClientState(32888);
        field377.glMatrixMode(5888);
        field377.glLoadIdentity();
        class273.method1887();
        class84.method650();
    }

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "()F", line = 556)
    public static final float method159() {
        return field356;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(Z)V", line = 563)
    public static final void method160(boolean arg0) {
        if (field366 == arg0) {
            return;
        }
        if (arg0) {
            field377.glEnable(2912);
        } else {
            field377.glDisable(2912);
        }
        field366 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "()V", line = 586)
    public static final void method161() {
        try {
            field372.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V", line = 593)
    public static final void method162(int arg0, int arg1) {
        field351 = arg0;
        field361 = arg1;
        field376 = false;
    }

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "()V", line = 607)
    public static final void method163() {
        field377.glDepthMask(true);
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V", line = 610)
    public static final void method164(int arg0) {
        if (field353 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field377.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field377.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field377.glTexEnvi(8960, 34162, 260);
        }
        field353 = arg0;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;)Lqd;", line = 632)
    private static final class40 method165(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class34.method298(var1, -22277, var1.length, 0);
    }

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "()V", line = 640)
    public static final void method166() {
        if (field377 != null) {
            try {
                class142.method1040(true);
            } catch (Throwable var7) {
            }
            field377 = null;
        }
        if (field368 != null) {
            class136.method1010();
            try {
                if (GLContext.getCurrent() == field368) {
                    field368.release();
                }
            } catch (Throwable var6) {
            }
            try {
                field368.destroy();
            } catch (Throwable var5) {
            }
            field368 = null;
        }
        if (field372 != null) {
            try {
                field372.setRealized(false);
            } catch (Throwable var4) {
            }
            field372 = null;
        }
        class84.method639();
        field350 = false;
    }

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "()I", line = 689)
    private static final int method167() {
        int var0 = 0;
        field374 = field377.glGetString(7936);
        field385 = field377.glGetString(7937);
        String var1 = field374.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field377.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field375 = var4 * 10 + var5;
            } catch (NumberFormatException var16) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field375 < 12) {
            var0 |= 0x2;
        }
        if (!field377.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field377.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field377.glGetIntegerv(34018, var7, 0);
        field365 = var7[0];
        field377.glGetIntegerv(34929, var7, 0);
        field354 = var7[0];
        field377.glGetIntegerv(34930, var7, 0);
        field355 = var7[0];
        if (field365 < 2 || field354 < 2 || field355 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field349 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field367 = field377.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field363 = field377.isExtensionAvailable("GL_ARB_multisample");
        field369 = field377.isExtensionAvailable("GL_ARB_texture_cube_map");
        field382 = field377.isExtensionAvailable("GL_ARB_vertex_program");
        field384 = field377.isExtensionAvailable("GL_EXT_texture3D");
        class40 var8 = method165(field385).method337(40);
        if (var8.method358(-127, field358) != -1) {
            int var9 = 0;
            class40[] var10 = var8.method355(47, 32, (byte) -124).method359(32, -1);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class40 var12 = var10[var11];
                if (var12.method350(true) >= 4 && var12.method333(0, 74, 4).method348(-98)) {
                    var9 = var12.method333(0, 76, 4).method349(-34);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field367 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field384 = false;
            }
            field359 = field367;
        }
        if (field367) {
            try {
                int[] var13 = new int[1];
                field377.glGenBuffersARB(1, var13, 0);
            } catch (Throwable var15) {
                return -4;
            }
        }
        return 0;
    }
}
