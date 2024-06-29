import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class223 extends class77 {

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    private int field3343 = -1;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    private int field3351 = 0;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    private int field3349 = -1;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    private int field3352 = 0;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "[I")
    private int[] field3350;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Lg;")
    public static class67 field3342 = new class67(4);

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    private static int field3347 = -1;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "[I")
    private static int[] field3346 = new int[4];

    @OriginalMember(owner = "client!of", name = "C", descriptor = "[F")
    private static float[] field3348 = new float[4];

    @OriginalMember(owner = "client!of", name = "z", descriptor = "[I")
    private static int[] field3345 = null;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    private int field3344;

    @OriginalMember(owner = "client!of", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        if (this.field3349 != -1) {
            class305.method2145(this.field3349, this.field3351, this.field3344);
            this.field3349 = -1;
            this.field3351 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V", line = 17)
    public final void method1632() {
        GL var1 = class141.field2025;
        this.method1636();
        var1.glBindTexture(34067, this.field3349);
        if (this.field3350 == null || this.field3352 == 2) {
            return;
        }
        if (this.method1637()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field3350[var3];
                this.field3343 = class345.field5336.method573(var4, 58) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field3343;
                } else if (this.field3343 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class345.field5336.method570(-20049, var4));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class305.field4570 += var6 - this.field3351;
            this.field3351 = var6;
            this.field3352 = 2;
        } else if (this.field3352 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class345.field5349, class345.field5336.method591(this.field3350[var7], -119), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class305.field4570 += 3 - this.field3351;
                this.field3351 = 3;
            }
            this.field3352 = 1;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()V", line = 81)
    public static void method1633() {
        field3342 = null;
        field3345 = null;
        field3348 = null;
        field3346 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)Lof;", line = 88)
    public static final class223 method1634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class223 var8 = (class223) field3342.method551(0, var6);
        if (var8 == null) {
            class223 var9 = new class223(arg0, arg1, arg2, arg3, arg4, arg5);
            field3342.method547(var6, -1, var9);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lof;Lof;F)Lof;", line = 100)
    public final class223 method1635(class223 arg0, class223 arg1, float arg2) {
        GL var4 = class141.field2025;
        class223 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class141.field2013) {
            return var5;
        }
        this.method1636();
        if (field3345 == null || class305.field4573 != field3347) {
            field3345 = new int[2];
            var4.glGenTextures(2, field3345, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class141.method1000(field3345[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field3347 = class305.field4573;
        }
        int var7 = arg0.field3343 > arg1.field3343 ? arg0.field3343 : arg1.field3343;
        if (this.field3343 != var7) {
            this.field3343 = var7;
            var4.glBindTexture(34067, this.field3349);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field3343, this.field3343, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method1632();
        arg1.method1632();
        class205.method1492(field3346);
        class205.method1489();
        class63.method510(class141.method1003());
        var4.glPushAttrib(2048);
        class141.method1011(false);
        class141.method1021(false);
        class141.method982(false);
        class141.method986(1);
        class141.method1013(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field3343, 0.0D, (double) this.field3343, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field3343, this.field3343);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field3345[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field3348[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field3348, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method1638(var4, arg0.field3349, var11, arg0.field3343, field3345[0])) {
                var9 = false;
                break;
            }
            if (!method1638(var4, arg1.field3349, var11, arg1.field3343, field3345[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field3349, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class141.method1000(field3345[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field3343, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field3343, this.field3343);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field3343);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class141.method982(true);
        class141.method1021(true);
        class141.method1011(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class63.method516();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class205.method1490(field3346);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "()V", line = 253)
    private final void method1636() {
        if (this.field3349 >= 0 && class305.field4573 == this.field3344) {
            return;
        }
        GL var1 = class141.field2025;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3349 = var2[0];
        var1.glBindTexture(34067, this.field3349);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field3344 = class305.field4573;
        this.field3352 = 0;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 321)
    public class223() {
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIII)V", line = 323)
    private class223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3350 = new int[6];
        this.field3350[0] = arg0;
        this.field3350[1] = arg1;
        this.field3350[2] = arg2;
        this.field3350[3] = arg3;
        this.field3350[4] = arg4;
        this.field3350[5] = arg5;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "()Z", line = 281)
    private final boolean method1637() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class345.field5336.method566(6487, this.field3350[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 302)
    private static final boolean method1638(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class141.method1000(arg4);
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
}
