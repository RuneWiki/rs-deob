import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class319 extends class199 {

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
    private int field4979 = 0;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
    private int field4980 = 0;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "I")
    private int field4978 = -1;

    @OriginalMember(owner = "client!sn", name = "H", descriptor = "I")
    private int field4983 = -1;

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "[I")
    private int[] field4982;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "Lba;")
    public static class53 field4981 = new class53(4);

    @OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
    private static int field4984 = -1;

    @OriginalMember(owner = "client!sn", name = "K", descriptor = "[I")
    private static int[] field4986 = new int[4];

    @OriginalMember(owner = "client!sn", name = "L", descriptor = "[F")
    private static float[] field4987 = new float[4];

    @OriginalMember(owner = "client!sn", name = "M", descriptor = "[I")
    private static int[] field4988 = null;

    @OriginalMember(owner = "client!sn", name = "J", descriptor = "I")
    private int field4985;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lsn;Lsn;F)Lsn;", line = 6)
    public final class319 method2164(class319 arg0, class319 arg1, float arg2) {
        GL var4 = class94.field1473;
        class319 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class94.field1511) {
            return var5;
        }
        this.method2166();
        if (field4988 == null || field4984 != class198.field2966) {
            field4988 = new int[2];
            var4.glGenTextures(2, field4988, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class94.method698(field4988[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field4984 = class198.field2966;
        }
        int var7 = arg0.field4983 > arg1.field4983 ? arg0.field4983 : arg1.field4983;
        if (this.field4983 != var7) {
            this.field4983 = var7;
            var4.glBindTexture(34067, this.field4978);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field4983, this.field4983, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method2168();
        arg1.method2168();
        class167.method1199(field4986);
        class167.method1191();
        class151.method1039(class94.method699());
        var4.glPushAttrib(2048);
        class94.method693(false);
        class94.method668(false);
        class94.method696(false);
        class94.method677(1);
        class94.method675(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field4983, 0.0D, (double) this.field4983, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field4983, this.field4983);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field4988[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field4987[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field4987, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method2165(var4, arg0.field4978, var11, arg0.field4983, field4988[0])) {
                var9 = false;
                break;
            }
            if (!method2165(var4, arg1.field4978, var11, arg1.field4983, field4988[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field4978, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class94.method698(field4988[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field4983, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field4983, this.field4983);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field4983);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class94.method696(true);
        class94.method668(true);
        class94.method693(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class151.method1042();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class167.method1201(field4986);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 147)
    private static final boolean method2165(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class94.method698(arg4);
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

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V", line = 305)
    public class319() {
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIIII)V", line = 307)
    private class319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4982 = new int[6];
        this.field4982[0] = arg0;
        this.field4982[1] = arg1;
        this.field4982[2] = arg2;
        this.field4982[3] = arg3;
        this.field4982[4] = arg4;
        this.field4982[5] = arg5;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "()V", line = 165)
    private final void method2166() {
        if (this.field4978 >= 0 && class198.field2966 == this.field4985) {
            return;
        }
        GL var1 = class94.field1473;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field4978 = var2[0];
        var1.glBindTexture(34067, this.field4978);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field4985 = class198.field2966;
        this.field4979 = 0;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "()V", line = 189)
    public static void method2167() {
        field4981 = null;
        field4988 = null;
        field4987 = null;
        field4986 = null;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "()V", line = 199)
    public final void method2168() {
        GL var1 = class94.field1473;
        this.method2166();
        var1.glBindTexture(34067, this.field4978);
        if (this.field4982 == null || this.field4979 == 2) {
            return;
        }
        if (this.method2169()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field4982[var3];
                this.field4983 = class15.field207.method2086(var4, 15374) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field4983;
                } else if (this.field4983 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class15.field207.method2091(var4, false));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class198.field2961 += var6 - this.field4980;
            this.field4980 = var6;
            this.field4979 = 2;
        } else if (this.field4979 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class15.field215, class15.field207.method2085(this.field4982[var7], (byte) -84), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class198.field2961 += 3 - this.field4980;
                this.field4980 = 3;
            }
            this.field4979 = 1;
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "()Z", line = 267)
    private final boolean method2169() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class15.field207.method2078(this.field4982[var1], 1)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sn", name = "finalize", descriptor = "()V", line = 282)
    protected final void finalize() throws Throwable {
        if (this.field4978 != -1) {
            class198.method1404(this.field4978, this.field4980, this.field4985);
            this.field4978 = -1;
            this.field4980 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIII)Lsn;", line = 318)
    public static final class319 method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class319 var8 = (class319) field4981.method443(-2, var6);
        if (var8 == null) {
            class319 var9 = new class319(arg0, arg1, arg2, arg3, arg4, arg5);
            field4981.method439(var9, var6, (byte) 18);
            return var9;
        } else {
            return var8;
        }
    }
}
