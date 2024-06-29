import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class143 extends class305 {

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    private int field2359 = 0;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    private int field2356 = 0;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    private int field2363 = -1;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    private int field2365 = -1;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "[I")
    private int[] field2357;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "Le;")
    public static class342 field2360 = new class342(4);

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "[I")
    private static int[] field2361 = null;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    private static int field2364 = -1;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "[I")
    private static int[] field2366 = new int[4];

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "[F")
    private static float[] field2362 = new float[4];

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    private int field2358;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "()V", line = 7)
    public final void method924() {
        GL var1 = class249.field3898;
        this.method929();
        var1.glBindTexture(34067, this.field2365);
        if (this.field2357 == null || this.field2356 == 2) {
            return;
        }
        if (this.method927()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field2357[var3];
                this.field2363 = class284.field4393.method385(var4, 623) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field2363;
                } else if (this.field2363 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class284.field4393.method408(9, var4));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class258.field4014 += var6 - this.field2359;
            this.field2359 = var6;
            this.field2356 = 2;
        } else if (this.field2356 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class284.field4387, class284.field4393.method388(this.field2357[var7], true), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class258.field4014 += 3 - this.field2359;
                this.field2359 = 3;
            }
            this.field2356 = 1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 71)
    private static final boolean method925(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class249.method1689(arg4);
        arg0.glFramebufferTexture2DEXT(36160, 36064, arg2, arg1, 0);
        arg0.glReadBuffer(36064);
        int var5 = arg0.glCheckFramebufferStatusEXT(36160);
        if (var5 == 36053) {
            arg0.glCopyTexImage2D(3553, 0, 6407, 0, 0, arg3, arg3, 0);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "finalize", descriptor = "()V", line = 84)
    protected final void finalize() throws Throwable {
        if (this.field2365 != -1) {
            class258.method1732(this.field2365, this.field2359, this.field2358);
            this.field2365 = -1;
            this.field2359 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "()V", line = 94)
    public static void method926() {
        field2360 = null;
        field2361 = null;
        field2362 = null;
        field2366 = null;
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "()Z", line = 103)
    private final boolean method927() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class284.field4393.method406(12880, this.field2357[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lih;Lih;F)Lih;", line = 116)
    public final class143 method928(class143 arg0, class143 arg1, float arg2) {
        GL var4 = class249.field3898;
        class143 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class249.field3913) {
            return var5;
        }
        this.method929();
        if (field2361 == null || class258.field4013 != field2364) {
            field2361 = new int[2];
            var4.glGenTextures(2, field2361, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class249.method1689(field2361[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field2364 = class258.field4013;
        }
        int var7 = arg0.field2363 > arg1.field2363 ? arg0.field2363 : arg1.field2363;
        if (this.field2363 != var7) {
            this.field2363 = var7;
            var4.glBindTexture(34067, this.field2365);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field2363, this.field2363, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method924();
        arg1.method924();
        class115.method746(field2366);
        class115.method753();
        class273.method1835(class249.method1680());
        var4.glPushAttrib(2048);
        class249.method1661(false);
        class249.method1648(false);
        class249.method1677(false);
        class249.method1653(1);
        class249.method1681(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field2363, 0.0D, (double) this.field2363, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field2363, this.field2363);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field2361[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field2362[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field2362, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method925(var4, arg0.field2365, var11, arg0.field2363, field2361[0])) {
                var9 = false;
                break;
            }
            if (!method925(var4, arg1.field2365, var11, arg1.field2363, field2361[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field2365, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class249.method1689(field2361[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field2363, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field2363, this.field2363);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field2363);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class249.method1677(true);
        class249.method1648(true);
        class249.method1661(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class273.method1828();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class115.method749(field2366);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "()V", line = 256)
    private final void method929() {
        if (this.field2365 >= 0 && class258.field4013 == this.field2358) {
            return;
        }
        GL var1 = class249.field3898;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2365 = var2[0];
        var1.glBindTexture(34067, this.field2365);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field2358 = class258.field4013;
        this.field2356 = 0;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIII)Lih;", line = 277)
    public static final class143 method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class143 var8 = (class143) field2360.method2367(var6, -12270);
        if (var8 == null) {
            class143 var9 = new class143(arg0, arg1, arg2, arg3, arg4, arg5);
            field2360.method2369(var6, -28759, var9);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 318)
    public class143() {
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIII)V", line = 320)
    private class143(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2357 = new int[6];
        this.field2357[0] = arg0;
        this.field2357[1] = arg1;
        this.field2357[2] = arg2;
        this.field2357[3] = arg3;
        this.field2357[4] = arg4;
        this.field2357[5] = arg5;
    }
}
