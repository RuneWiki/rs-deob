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

@OriginalClass("client!mi")
public class class90 {

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Z")
    public static boolean field1366 = true;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    private static int field1368 = 0;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "F")
    private static float field1377 = 0.0F;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "Z")
    private static boolean field1381 = false;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "Z")
    private static boolean field1359 = false;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Z")
    private static boolean field1367 = true;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "F")
    private static float field1385 = 0.09765625F;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Luf;")
    private static class168 field1389 = class148.method1019(-1720, "radeon");

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "[F")
    private static float[] field1376 = new float[16];

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    private static int field1371 = -1;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "Z")
    private static boolean field1373 = true;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Z")
    private static boolean field1365 = false;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "Z")
    private static boolean field1392 = true;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    private static int field1382 = 0;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "F")
    private static float field1391 = 0.0F;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "F")
    private static float field1384;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "F")
    private static float field1386;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    private static int field1356;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    private static int field1374;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    private static int field1378;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1364;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1370;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "Ljavax/media/opengl/GL;")
    public static GL field1390;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Ljavax/media/opengl/GLContext;")
    private static GLContext field1361;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "Ljavax/media/opengl/GLDrawable;")
    private static GLDrawable field1380;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Z")
    public static boolean field1357;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "Z")
    public static boolean field1358;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "Z")
    public static boolean field1369;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Z")
    public static boolean field1372;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "Z")
    public static boolean field1375;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "Z")
    public static boolean field1383;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "Z")
    public static boolean field1387;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()F", line = 10)
    public static final float method606() {
        return field1391;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "()F", line = 13)
    public static final float method607() {
        return field1377;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "()V", line = 16)
    public static final void method608() {
        field1390.glClear(256);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 22)
    public static final void method609(int arg0) {
        if (field1368 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1390.glTexEnvi(8960, 34161, 8448);
        }
        if (arg0 == 1) {
            field1390.glTexEnvi(8960, 34161, 7681);
        }
        if (arg0 == 2) {
            field1390.glTexEnvi(8960, 34161, 260);
        }
        if (arg0 == 3) {
            field1390.glTexEnvi(8960, 34161, 34023);
        }
        if (arg0 == 4) {
            field1390.glTexEnvi(8960, 34161, 34164);
        }
        if (arg0 == 5) {
            field1390.glTexEnvi(8960, 34161, 34165);
        }
        field1368 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "()V", line = 47)
    public static final void method610() {
        class284.method1960(0, 0, 15);
        method616();
        method609(1);
        method615(1);
        method624(false);
        method629(false);
        method638(false);
        method632();
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "()V", line = 57)
    public static final void method611() {
        if (field1361 != null) {
            if (GLContext.getCurrent() == field1361) {
                field1361.release();
            }
            field1361.destroy();
            field1361 = null;
        }
        if (field1380 != null) {
            field1380.setRealized(false);
            field1380 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "()V", line = 75)
    public static void method612() {
        field1389 = null;
        field1364 = null;
        field1370 = null;
        field1390 = null;
        field1380 = null;
        field1361 = null;
        field1376 = null;
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "()V", line = 84)
    public static final void method613() {
        class284.method1960(0, 0, 15);
        method616();
        method617(-1);
        method624(false);
        method629(false);
        method638(false);
        method632();
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "()I", line = 99)
    private static final int method614() {
        int var0 = 0;
        field1370 = field1390.glGetString(7936);
        field1364 = field1390.glGetString(7937);
        String var1 = field1370.toLowerCase();
        if (var1.indexOf("microsoft") != -1) {
            var0 |= 0x1;
        }
        if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
            var0 |= 0x1;
        }
        String var2 = field1390.glGetString(7938);
        String[] var3 = var2.split("[. ]");
        if (var3.length >= 2) {
            try {
                int var4 = Integer.parseInt(var3[0]);
                int var5 = Integer.parseInt(var3[1]);
                field1374 = var4 * 10 + var5;
            } catch (NumberFormatException var13) {
                var0 |= 0x4;
            }
        } else {
            var0 |= 0x4;
        }
        if (field1374 < 12) {
            var0 |= 0x2;
        }
        if (!field1390.isExtensionAvailable("GL_ARB_multitexture")) {
            var0 |= 0x8;
        }
        if (!field1390.isExtensionAvailable("GL_ARB_texture_env_combine")) {
            var0 |= 0x20;
        }
        int[] var7 = new int[1];
        field1390.glGetIntegerv(34018, var7, 0);
        field1360 = var7[0];
        field1390.glGetIntegerv(34929, var7, 0);
        field1378 = var7[0];
        field1390.glGetIntegerv(34930, var7, 0);
        field1356 = var7[0];
        if (field1360 < 2 || field1378 < 2 || field1356 < 2) {
            var0 |= 0x10;
        }
        if (var0 != 0) {
            return var0;
        }
        field1369 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        field1383 = field1390.isExtensionAvailable("GL_ARB_vertex_buffer_object");
        field1357 = field1390.isExtensionAvailable("GL_ARB_multisample");
        field1375 = field1390.isExtensionAvailable("GL_ARB_texture_cube_map");
        field1372 = field1390.isExtensionAvailable("GL_ARB_vertex_program");
        field1358 = field1390.isExtensionAvailable("GL_EXT_texture3D");
        class168 var8 = method643(field1364).method1197(-96);
        if (var8.method1196(field1389, 187) != -1) {
            int var9 = 0;
            class168[] var10 = var8.method1168(-12907, 47, 32).method1191(-103, 32);
            for (int var11 = 0; var11 < var10.length; var11++) {
                class168 var12 = var10[var11];
                if (var12.method1167(false) >= 4 && var12.method1187(0, 0, 4).method1192(255)) {
                    var9 = var12.method1187(0, 0, 4).method1200((byte) 124);
                    break;
                }
            }
            if (var9 >= 7000 && var9 <= 7999) {
                field1383 = false;
            }
            if (var9 >= 7000 && var9 <= 9250) {
                field1358 = false;
            }
            field1387 = field1383;
        }
        return 0;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 194)
    public static final void method615(int arg0) {
        if (field1382 == arg0) {
            return;
        }
        if (arg0 == 0) {
            field1390.glTexEnvi(8960, 34162, 8448);
        }
        if (arg0 == 1) {
            field1390.glTexEnvi(8960, 34162, 7681);
        }
        if (arg0 == 2) {
            field1390.glTexEnvi(8960, 34162, 260);
        }
        field1382 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "()V", line = 213)
    private static final void method616() {
        if (field1365) {
            return;
        }
        field1390.glMatrixMode(5889);
        field1390.glLoadIdentity();
        field1390.glOrtho(0.0D, (double) field1363, 0.0D, (double) field1379, -1.0D, 1.0D);
        field1390.glViewport(0, 0, field1363, field1379);
        field1390.glMatrixMode(5888);
        field1390.glLoadIdentity();
        field1365 = true;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 225)
    public static final void method617(int arg0) {
        if (field1371 == arg0) {
            return;
        }
        if (arg0 == -1) {
            field1390.glDisable(3553);
        } else {
            if (field1371 == -1) {
                field1390.glEnable(3553);
            }
            field1390.glBindTexture(3553, arg0);
        }
        field1371 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/awt/Canvas;I)I", line = 245)
    public static final int method618(Canvas arg0, int arg1) {
        if (!arg0.isDisplayable()) {
            throw new IllegalStateException("Supplied canvas not on screen");
        }
        GLCapabilities var2 = new GLCapabilities();
        if (arg1 > 0) {
            var2.setSampleBuffers(true);
            var2.setNumSamples(arg1);
        }
        GLDrawableFactory var3 = GLDrawableFactory.getFactory();
        field1380 = var3.getGLDrawable(arg0, var2, (GLCapabilitiesChooser) null);
        field1380.setRealized(true);
        while (true) {
            field1361 = field1380.createContext((GLContext) null);
            try {
                int var4 = field1361.makeCurrent();
                if (var4 != 0) {
                    break;
                }
            } catch (Exception var10) {
            }
            class300.method2054(10, 1000L);
        }
        field1390 = field1361.getGL();
        new GLU();
        field1363 = arg0.getSize().width;
        field1379 = arg0.getSize().height;
        if (!field1359) {
            int var6 = method614();
            if (var6 != 0) {
                return var6;
            }
            field1359 = true;
        }
        method626();
        method641();
        field1390.glClear(16384);
        int var7 = 0;
        while (var7 < 10) {
            try {
                field1380.swapBuffers();
                break;
            } catch (Exception var9) {
                class300.method2054(10, 100L);
                var7++;
            }
        }
        field1390.glClear(16384);
        return 0;
    }

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "()V", line = 321)
    public static final void method619() {
        field1390.glDepthMask(false);
    }

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "()V", line = 329)
    public static final void method620() {
        class284.method1960(0, 0, 15);
        method616();
        method609(0);
        method615(0);
        method624(false);
        method629(false);
        method638(false);
        method632();
    }

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "()V", line = 343)
    public static final void method621() {
        try {
            field1380.swapBuffers();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(F)V", line = 351)
    public static final void method622(float arg0) {
        method627(3000.0F, arg0 * 1.5F);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V", line = 357)
    public static final void method623(int arg0, int arg1) {
        field1363 = arg0;
        field1379 = arg1;
        field1365 = false;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 362)
    public static final void method624(boolean arg0) {
        if (field1367 == arg0) {
            return;
        }
        if (arg0) {
            field1390.glEnable(2896);
        } else {
            field1390.glDisable(2896);
        }
        field1367 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V", line = 376)
    private static final void method625(boolean arg0) {
        if (field1366 == arg0) {
            return;
        }
        if (arg0) {
            field1390.glEnableClientState(32885);
        } else {
            field1390.glDisableClientState(32885);
        }
        field1366 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "()V", line = 392)
    private static final void method626() {
        int[] var0 = new int[1];
        field1390.glGenTextures(1, var0, 0);
        field1362 = var0[0];
        field1390.glBindTexture(3553, field1362);
        field1390.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
        class198.method1396(63);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FF)V", line = 407)
    public static final void method627(float arg0, float arg1) {
        if (field1365 || field1391 == arg0 && field1377 == arg1) {
            return;
        }
        field1391 = arg0;
        field1377 = arg1;
        if (arg1 == 0.0F) {
            field1376[10] = field1386;
            field1376[14] = field1384;
        } else {
            float var2 = arg0 / (arg0 + arg1);
            float var3 = var2 * var2;
            float var4 = (1.0F - var2) * -field1384 * (1.0F - var2) / arg1;
            field1376[10] = field1386 + var4;
            field1376[14] = field1384 * var3;
        }
        field1390.glMatrixMode(5889);
        field1390.glLoadMatrixf(field1376, 0);
        field1390.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFFFFF)V", line = 439)
    private static final void method628(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        float var6 = arg4 * 2.0F;
        field1376[0] = var6 / (arg1 - arg0);
        field1376[1] = 0.0F;
        field1376[2] = 0.0F;
        field1376[3] = 0.0F;
        field1376[4] = 0.0F;
        field1376[5] = var6 / (arg3 - arg2);
        field1376[6] = 0.0F;
        field1376[7] = 0.0F;
        field1376[8] = (arg0 + arg1) / (arg1 - arg0);
        field1376[9] = (arg2 + arg3) / (arg3 - arg2);
        field1376[10] = field1386 = -(arg4 + arg5) / (arg5 - arg4);
        field1376[11] = -1.0F;
        field1376[12] = 0.0F;
        field1376[13] = 0.0F;
        field1376[14] = field1384 = -(arg5 * var6) / (arg5 - arg4);
        field1376[15] = 0.0F;
        field1390.glLoadMatrixf(field1376, 0);
        field1391 = 0.0F;
        field1377 = 0.0F;
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(Z)V", line = 461)
    public static final void method629(boolean arg0) {
        if (field1373 == arg0) {
            return;
        }
        if (arg0) {
            field1390.glEnable(2929);
        } else {
            field1390.glDisable(2929);
        }
        field1373 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "()V", line = 472)
    public static final void method630() {
        class284.method1960(0, 0, 15);
        method616();
        method609(5);
        method615(0);
        method624(false);
        method629(false);
        method638(false);
        method632();
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)V", line = 483)
    public static final void method631(int arg0, int arg1, int arg2, int arg3) {
        method639(0, 0, field1363, field1379, arg0, arg1, 0.0F, 0.0F, arg2, arg3);
    }

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "()V", line = 486)
    public static final void method632() {
        if (field1381) {
            field1390.glMatrixMode(5890);
            field1390.glLoadIdentity();
            field1390.glMatrixMode(5888);
            field1381 = false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V", line = 496)
    public static final void method633(int arg0) {
        field1390.glClearColor((float) (arg0 >> 16 & 0xFF) / 255.0F, (float) (arg0 >> 8 & 0xFF) / 255.0F, (float) (arg0 & 0xFF) / 255.0F, 0.0F);
        field1390.glClear(16640);
    }

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "()V", line = 512)
    public static final void method634() {
        class284.method1960(0, 0, 15);
        method616();
        method609(0);
        method615(0);
        method624(false);
        method629(false);
        method638(false);
        method632();
    }

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "()V", line = 527)
    public static final void method635() {
        int[] var0 = new int[2];
        field1390.glGetIntegerv(3073, var0, 0);
        field1390.glGetIntegerv(3074, var0, 1);
        field1390.glDrawBuffer(1026);
        field1390.glReadBuffer(1024);
        method617(-1);
        field1390.glPushAttrib(8192);
        field1390.glDisable(2912);
        field1390.glDisable(3042);
        field1390.glDisable(2929);
        field1390.glDisable(3008);
        field1390.glRasterPos2i(0, 0);
        field1390.glCopyPixels(0, 0, field1363, field1379, 6144);
        field1390.glPopAttrib();
        field1390.glDrawBuffer(var0[0]);
        field1390.glReadBuffer(var0[1]);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(FFF)V", line = 545)
    public static final void method636(float arg0, float arg1, float arg2) {
        field1390.glMatrixMode(5890);
        if (field1381) {
            field1390.glLoadIdentity();
        }
        field1390.glTranslatef(arg0, arg1, arg2);
        field1390.glMatrixMode(5888);
        field1381 = true;
    }

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "()V", line = 555)
    public static final void method637() {
        if (class44.field539) {
            method624(true);
            method625(true);
        } else {
            method624(false);
            method625(false);
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(Z)V", line = 576)
    public static final void method638(boolean arg0) {
        if (field1392 == arg0) {
            return;
        }
        if (arg0) {
            field1390.glEnable(2912);
        } else {
            field1390.glDisable(2912);
        }
        field1392 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIFFII)V", line = 591)
    public static final void method639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9) {
        int var10 = (arg0 - arg4 << 8) / arg8;
        int var11 = (arg0 + arg2 - arg4 << 8) / arg8;
        int var12 = (arg1 - arg5 << 8) / arg9;
        int var13 = (arg1 + arg3 - arg5 << 8) / arg9;
        field1390.glMatrixMode(5889);
        field1390.glLoadIdentity();
        method628((float) var10 * field1385, (float) var11 * field1385, (float) (-var13) * field1385, (float) (-var12) * field1385, 50.0F, 3584.0F);
        field1390.glViewport(arg0, field1379 - arg1 - arg3, arg2, arg3);
        field1390.glMatrixMode(5888);
        field1390.glLoadIdentity();
        field1390.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        if (arg6 != 0.0F) {
            field1390.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
        }
        if (arg7 != 0.0F) {
            field1390.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
        }
        field1365 = false;
        class2.field11 = var10;
        class133.field2086 = var11;
        class281.field4720 = var12;
        class287.field4838 = var13;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V", line = 619)
    public static final void method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -arg0;
        int var7 = field1363 - arg0;
        int var8 = -arg1;
        int var9 = field1379 - arg1;
        field1390.glMatrixMode(5889);
        field1390.glLoadIdentity();
        float var10 = (float) arg2 / 512.0F;
        float var11 = 256.0F / (float) arg4 * var10;
        float var12 = 256.0F / (float) arg5 * var10;
        field1390.glOrtho((double) ((float) var6 * var11), (double) ((float) var7 * var11), (double) ((float) (-var9) * var12), (double) ((float) (-var8) * var12), (double) (50 - arg3), (double) (3584 - arg3));
        field1390.glViewport(0, 0, field1363, field1379);
        field1390.glMatrixMode(5888);
        field1390.glLoadIdentity();
        field1390.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        field1365 = false;
    }

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "()V", line = 642)
    private static final void method641() {
        field1365 = false;
        field1390.glDisable(3553);
        field1371 = -1;
        field1390.glTexEnvi(8960, 8704, 34160);
        field1390.glTexEnvi(8960, 34161, 8448);
        field1368 = 0;
        field1390.glTexEnvi(8960, 34162, 8448);
        field1382 = 0;
        field1390.glEnable(2896);
        field1390.glEnable(2912);
        field1390.glEnable(2929);
        field1367 = true;
        field1373 = true;
        field1392 = true;
        class156.method1108((byte) 87);
        field1390.glActiveTexture(33985);
        field1390.glTexEnvi(8960, 8704, 34160);
        field1390.glTexEnvi(8960, 34161, 8448);
        field1390.glTexEnvi(8960, 34162, 8448);
        field1390.glActiveTexture(33984);
        field1390.setSwapInterval(0);
        field1390.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        field1390.glShadeModel(7425);
        field1390.glClearDepth(1.0D);
        field1390.glDepthFunc(515);
        method642();
        field1390.glMatrixMode(5890);
        field1390.glLoadIdentity();
        field1390.glPolygonMode(1028, 6914);
        field1390.glEnable(2884);
        field1390.glCullFace(1029);
        field1390.glEnable(3042);
        field1390.glBlendFunc(770, 771);
        field1390.glEnable(3008);
        field1390.glAlphaFunc(516, 0.0F);
        field1390.glEnableClientState(32884);
        field1390.glEnableClientState(32885);
        field1366 = true;
        field1390.glEnableClientState(32886);
        field1390.glEnableClientState(32888);
        field1390.glMatrixMode(5888);
        field1390.glLoadIdentity();
        class34.method170();
        class257.method1758();
    }

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "()V", line = 691)
    public static final void method642() {
        field1390.glDepthMask(true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Ljava/lang/String;)Luf;", line = 701)
    private static final class168 method643(String arg0) {
        byte[] var1;
        try {
            var1 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var1 = arg0.getBytes();
        }
        return class183.method1302((byte) -10, 0, var1.length, var1);
    }
}
