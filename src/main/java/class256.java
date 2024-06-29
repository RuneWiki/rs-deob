import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class256 extends class325 {

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    private int field3916 = -1;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    private int field3918 = 0;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    private int field3915 = 0;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    private int field3920 = -1;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "[I")
    private int[] field3914;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "Lfa;")
    public static class98 field3917 = new class98(4);

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    private static int field3921 = -1;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "[F")
    private static float[] field3922 = new float[4];

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "[I")
    private static int[] field3923 = new int[4];

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "[I")
    private static int[] field3924 = null;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    private int field3919;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()V", line = 8)
    public final void method1798() {
        GL var1 = class73.field1051;
        this.method1803();
        var1.glBindTexture(34067, this.field3916);
        if (this.field3914 == null || this.field3918 == 2) {
            return;
        }
        if (this.method1800()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field3914[var3];
                this.field3920 = class164.field2662.method669(var4, 255) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field3920;
                } else if (this.field3920 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class164.field2662.method670(var4, (byte) 122));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class80.field1186 += var6 - this.field3915;
            this.field3915 = var6;
            this.field3918 = 2;
        } else if (this.field3918 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class164.field2659, class164.field2662.method672(-28889, this.field3914[var7]), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class80.field1186 += 3 - this.field3915;
                this.field3915 = 3;
            }
            this.field3918 = 1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "finalize", descriptor = "()V", line = 72)
    protected final void finalize() throws Throwable {
        if (this.field3916 != -1) {
            class80.method625(this.field3916, this.field3915, this.field3919);
            this.field3916 = -1;
            this.field3915 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lkj;Lkj;F)Lkj;", line = 83)
    public final class256 method1799(class256 arg0, class256 arg1, float arg2) {
        GL var4 = class73.field1051;
        class256 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class73.field1039) {
            return var5;
        }
        this.method1803();
        if (field3924 == null || class80.field1183 != field3921) {
            field3924 = new int[2];
            var4.glGenTextures(2, field3924, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class73.method537(field3924[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field3921 = class80.field1183;
        }
        int var7 = arg0.field3920 > arg1.field3920 ? arg0.field3920 : arg1.field3920;
        if (this.field3920 != var7) {
            this.field3920 = var7;
            var4.glBindTexture(34067, this.field3916);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field3920, this.field3920, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method1798();
        arg1.method1798();
        class175.method1324(field3923);
        class175.method1314();
        class186.method1379(class73.method535());
        var4.glPushAttrib(2048);
        class73.method531(false);
        class73.method544(false);
        class73.method558(false);
        class73.method519(1);
        class73.method548(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field3920, 0.0D, (double) this.field3920, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field3920, this.field3920);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field3924[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field3922[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field3922, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method1802(var4, arg0.field3916, var11, arg0.field3920, field3924[0])) {
                var9 = false;
                break;
            }
            if (!method1802(var4, arg1.field3916, var11, arg1.field3920, field3924[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field3916, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class73.method537(field3924[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field3920, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field3920, this.field3920);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field3920);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class73.method558(true);
        class73.method544(true);
        class73.method531(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class186.method1377();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class175.method1312(field3923);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "()Z", line = 225)
    private final boolean method1800() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class164.field2662.method668(this.field3914[var1], -105)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIII)Lkj;", line = 238)
    public static final class256 method1801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class256 var8 = (class256) field3917.method730(var6, (byte) 90);
        if (var8 == null) {
            class256 var9 = new class256(arg0, arg1, arg2, arg3, arg4, arg5);
            field3917.method734((byte) -14, var6, var9);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 317)
    public class256() {
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIII)V", line = 320)
    private class256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3914 = new int[6];
        this.field3914[0] = arg0;
        this.field3914[1] = arg1;
        this.field3914[2] = arg2;
        this.field3914[3] = arg3;
        this.field3914[4] = arg4;
        this.field3914[5] = arg5;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 260)
    private static final boolean method1802(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class73.method537(arg4);
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

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "()V", line = 280)
    private final void method1803() {
        if (this.field3916 >= 0 && class80.field1183 == this.field3919) {
            return;
        }
        GL var1 = class73.field1051;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3916 = var2[0];
        var1.glBindTexture(34067, this.field3916);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field3919 = class80.field1183;
        this.field3918 = 0;
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "()V", line = 308)
    public static void method1804() {
        field3917 = null;
        field3924 = null;
        field3922 = null;
        field3923 = null;
    }
}
