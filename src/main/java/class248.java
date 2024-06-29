import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class248 extends class259 {

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    private int field3931 = 0;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    private int field3934 = 0;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    private int field3932 = -1;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    private int field3937 = -1;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "[I")
    private int[] field3935;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "Lqj;")
    public static class280 field3936 = new class280(4);

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "[I")
    private static int[] field3938 = new int[4];

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    private static int field3939 = -1;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "[F")
    private static float[] field3940 = new float[4];

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "[I")
    private static int[] field3941 = null;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    private int field3933;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lti;Lti;F)Lti;", line = 7)
    public final class248 method1757(class248 arg0, class248 arg1, float arg2) {
        GL var4 = class272.field4310;
        class248 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class272.field4270) {
            return var5;
        }
        this.method1759();
        if (field3941 == null || field3939 != class1.field3) {
            field3941 = new int[2];
            var4.glGenTextures(2, field3941, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class272.method1965(field3941[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field3939 = class1.field3;
        }
        int var7 = arg0.field3932 > arg1.field3932 ? arg0.field3932 : arg1.field3932;
        if (this.field3932 != var7) {
            this.field3932 = var7;
            var4.glBindTexture(34067, this.field3937);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field3932, this.field3932, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method1762();
        arg1.method1762();
        class239.method1670(field3938);
        class239.method1656();
        class204.method1429(class272.method1946());
        var4.glPushAttrib(2048);
        class272.method1940(false);
        class272.method1941(false);
        class272.method1934(false);
        class272.method1961(1);
        class272.method1947(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field3932, 0.0D, (double) this.field3932, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field3932, this.field3932);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field3941[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field3940[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field3940, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method1761(var4, arg0.field3937, var11, arg0.field3932, field3941[0])) {
                var9 = false;
                break;
            }
            if (!method1761(var4, arg1.field3937, var11, arg1.field3932, field3941[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field3937, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class272.method1965(field3941[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field3932, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field3932, this.field3932);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field3932);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class272.method1934(true);
        class272.method1941(true);
        class272.method1940(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class204.method1432();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class239.method1671(field3938);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V", line = 288)
    public class248() {
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIII)V", line = 290)
    private class248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3935 = new int[6];
        this.field3935[0] = arg0;
        this.field3935[1] = arg1;
        this.field3935[2] = arg2;
        this.field3935[3] = arg3;
        this.field3935[4] = arg4;
        this.field3935[5] = arg5;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()V", line = 151)
    public static void method1758() {
        field3936 = null;
        field3941 = null;
        field3940 = null;
        field3938 = null;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()V", line = 157)
    private final void method1759() {
        if (this.field3937 >= 0 && class1.field3 == this.field3933) {
            return;
        }
        GL var1 = class272.field4310;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3937 = var2[0];
        var1.glBindTexture(34067, this.field3937);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field3933 = class1.field3;
        this.field3931 = 0;
    }

    @OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V", line = 181)
    protected final void finalize() throws Throwable {
        if (this.field3937 != -1) {
            class1.method4(this.field3937, this.field3934, this.field3933);
            this.field3937 = -1;
            this.field3934 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIII)Lti;", line = 193)
    public static final class248 method1760(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class248 var8 = (class248) field3936.method1998(-1114531641, var6);
        if (var8 == null) {
            class248 var9 = new class248(arg0, arg1, arg2, arg3, arg4, arg5);
            field3936.method2000(var9, (byte) 48, var6);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 204)
    private static final boolean method1761(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class272.method1965(arg4);
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

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()V", line = 222)
    public final void method1762() {
        GL var1 = class272.field4310;
        this.method1759();
        var1.glBindTexture(34067, this.field3937);
        if (this.field3935 == null || this.field3931 == 2) {
            return;
        }
        if (this.method1763()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field3935[var3];
                this.field3932 = class104.field1438.method884(-58, var4) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field3932;
                } else if (this.field3932 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class104.field1438.method881(var4, (byte) 110));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class1.field2 += var6 - this.field3934;
            this.field3934 = var6;
            this.field3931 = 2;
        } else if (this.field3931 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class104.field1440, class104.field1438.method878(-80, this.field3935[var7]), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class1.field2 += 3 - this.field3934;
                this.field3934 = 3;
            }
            this.field3931 = 1;
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "()Z", line = 310)
    private final boolean method1763() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class104.field1438.method888(-231, this.field3935[var1])) {
                return false;
            }
        }
        return true;
    }
}
