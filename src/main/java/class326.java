import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class326 extends class128 {

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    private int field5191 = -1;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    private int field5190 = -1;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    private int field5194 = 0;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    private int field5200 = 0;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "[I")
    private int[] field5193;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Lnb;")
    public static class341 field5192 = new class341(4);

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "[F")
    private static float[] field5197 = new float[4];

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "[I")
    private static int[] field5196 = null;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "[I")
    private static int[] field5198 = new int[4];

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    private static int field5199 = -1;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    private int field5195;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V", line = 8)
    public final void method2264() {
        GL var1 = class43.field651;
        this.method2269();
        var1.glBindTexture(34067, this.field5191);
        if (this.field5193 == null || this.field5200 == 2) {
            return;
        }
        if (this.method2267()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field5193[var3];
                this.field5190 = class62.field953.method1211(7149, var4) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field5190;
                } else if (this.field5190 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class62.field953.method1227(var4, (byte) 99));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class151.field2671 += var6 - this.field5194;
            this.field5194 = var6;
            this.field5200 = 2;
        } else if (this.field5200 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class62.field955, class62.field953.method1220(this.field5193[var7], -85), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class151.field2671 += 3 - this.field5194;
                this.field5194 = 3;
            }
            this.field5200 = 1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 72)
    private static final boolean method2265(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class43.method390(arg4);
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

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 318)
    public class326() {
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIIIII)V", line = 323)
    private class326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5193 = new int[6];
        this.field5193[0] = arg0;
        this.field5193[1] = arg1;
        this.field5193[2] = arg2;
        this.field5193[3] = arg3;
        this.field5193[4] = arg4;
        this.field5193[5] = arg5;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIII)Ljg;", line = 93)
    public static final class326 method2266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class326 var8 = (class326) field5192.method2400(var6, 99);
        if (var8 == null) {
            class326 var9 = new class326(arg0, arg1, arg2, arg3, arg4, arg5);
            field5192.method2396(0, var6, var9);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "()Z", line = 107)
    private final boolean method2267() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class62.field953.method1222(101, this.field5193[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljg;Ljg;F)Ljg;", line = 120)
    public final class326 method2268(class326 arg0, class326 arg1, float arg2) {
        GL var4 = class43.field651;
        class326 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class43.field664) {
            return var5;
        }
        this.method2269();
        if (field5196 == null || field5199 != class151.field2669) {
            field5196 = new int[2];
            var4.glGenTextures(2, field5196, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class43.method390(field5196[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field5199 = class151.field2669;
        }
        int var7 = arg0.field5190 > arg1.field5190 ? arg0.field5190 : arg1.field5190;
        if (this.field5190 != var7) {
            this.field5190 = var7;
            var4.glBindTexture(34067, this.field5191);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field5190, this.field5190, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method2264();
        arg1.method2264();
        class169.method1326(field5198);
        class169.method1335();
        class19.method196(class43.method367());
        var4.glPushAttrib(2048);
        class43.method392(false);
        class43.method352(false);
        class43.method366(false);
        class43.method368(1);
        class43.method349(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field5190, 0.0D, (double) this.field5190, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field5190, this.field5190);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field5196[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field5197[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field5197, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method2265(var4, arg0.field5191, var11, arg0.field5190, field5196[0])) {
                var9 = false;
                break;
            }
            if (!method2265(var4, arg1.field5191, var11, arg1.field5190, field5196[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field5191, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class43.method390(field5196[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field5190, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field5190, this.field5190);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field5190);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class43.method366(true);
        class43.method352(true);
        class43.method392(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class19.method191();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class169.method1333(field5198);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!jg", name = "finalize", descriptor = "()V", line = 260)
    protected final void finalize() throws Throwable {
        if (this.field5191 != -1) {
            class151.method1190(this.field5191, this.field5194, this.field5195);
            this.field5191 = -1;
            this.field5194 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "()V", line = 274)
    private final void method2269() {
        if (this.field5191 >= 0 && class151.field2669 == this.field5195) {
            return;
        }
        GL var1 = class43.field651;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field5191 = var2[0];
        var1.glBindTexture(34067, this.field5191);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field5195 = class151.field2669;
        this.field5200 = 0;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "()V", line = 297)
    public static void method2270() {
        field5192 = null;
        field5196 = null;
        field5197 = null;
        field5198 = null;
    }
}
