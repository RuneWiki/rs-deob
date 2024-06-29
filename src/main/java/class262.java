import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class262 extends class301 {

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    private int field4309 = 0;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    private int field4314 = -1;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    private int field4310 = -1;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    private int field4318 = 0;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "[I")
    private int[] field4308;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Llj;")
    public static class59 field4311 = new class59(4);

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "[I")
    private static int[] field4313 = null;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "[F")
    private static float[] field4315 = new float[4];

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    private static int field4316 = -1;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "[I")
    private static int[] field4317 = new int[4];

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    private int field4312;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)Lne;", line = 6)
    public static final class262 method1841(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class262 var8 = (class262) field4311.method487(78, var6);
        if (var8 == null) {
            class262 var9 = new class262(arg0, arg1, arg2, arg3, arg4, arg5);
            field4311.method491(var6, -1, var9);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lne;Lne;F)Lne;", line = 18)
    public final class262 method1842(class262 arg0, class262 arg1, float arg2) {
        GL var4 = class241.field4012;
        class262 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class241.field4036) {
            return var5;
        }
        this.method1845();
        if (field4313 == null || field4316 != class239.field3974) {
            field4313 = new int[2];
            var4.glGenTextures(2, field4313, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class241.method1687(field4313[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field4316 = class239.field3974;
        }
        int var7 = arg0.field4314 > arg1.field4314 ? arg0.field4314 : arg1.field4314;
        if (this.field4314 != var7) {
            this.field4314 = var7;
            var4.glBindTexture(34067, this.field4310);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field4314, this.field4314, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method1844();
        arg1.method1844();
        class337.method2379(field4317);
        class337.method2374();
        class247.method1743(class241.method1681());
        var4.glPushAttrib(2048);
        class241.method1696(false);
        class241.method1716(false);
        class241.method1705(false);
        class241.method1719(1);
        class241.method1718(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field4314, 0.0D, (double) this.field4314, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field4314, this.field4314);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field4313[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field4315[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field4315, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method1846(var4, arg0.field4310, var11, arg0.field4314, field4313[0])) {
                var9 = false;
                break;
            }
            if (!method1846(var4, arg1.field4310, var11, arg1.field4314, field4313[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field4310, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class241.method1687(field4313[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field4314, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field4314, this.field4314);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field4314);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class241.method1705(true);
        class241.method1716(true);
        class241.method1696(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class247.method1740();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class337.method2375(field4317);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 159)
    public static void method1843() {
        field4311 = null;
        field4313 = null;
        field4315 = null;
        field4317 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V", line = 168)
    public final void method1844() {
        GL var1 = class241.field4012;
        this.method1845();
        var1.glBindTexture(34067, this.field4310);
        if (this.field4308 == null || this.field4318 == 2) {
            return;
        }
        if (this.method1847()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field4308[var3];
                this.field4314 = class305.field4968.method84((byte) -109, var4) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field4314;
                } else if (this.field4314 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class305.field4968.method79(30854, var4));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class239.field3975 += var6 - this.field4309;
            this.field4309 = var6;
            this.field4318 = 2;
        } else if (this.field4318 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class305.field4956, class305.field4968.method85(this.field4308[var7], (byte) -82), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class239.field3975 += 3 - this.field4309;
                this.field4309 = 3;
            }
            this.field4318 = 1;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()V", line = 232)
    private final void method1845() {
        if (this.field4310 >= 0 && class239.field3974 == this.field4312) {
            return;
        }
        GL var1 = class241.field4012;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field4310 = var2[0];
        var1.glBindTexture(34067, this.field4310);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field4312 = class239.field3974;
        this.field4318 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V", line = 250)
    protected final void finalize() throws Throwable {
        if (this.field4310 != -1) {
            class239.method1671(this.field4310, this.field4309, this.field4312);
            this.field4310 = -1;
            this.field4309 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 267)
    private static final boolean method1846(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class241.method1687(arg4);
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

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 318)
    public class262() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIII)V", line = 320)
    private class262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4308 = new int[6];
        this.field4308[0] = arg0;
        this.field4308[1] = arg1;
        this.field4308[2] = arg2;
        this.field4308[3] = arg3;
        this.field4308[4] = arg4;
        this.field4308[5] = arg5;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()Z", line = 301)
    private final boolean method1847() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class305.field4968.method87(this.field4308[var1], 1)) {
                return false;
            }
        }
        return true;
    }
}
