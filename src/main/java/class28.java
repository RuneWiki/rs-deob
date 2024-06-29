import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class28 extends class104 {

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    private int field358 = -1;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    private int field361 = 0;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    private int field356 = -1;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    private int field365 = 0;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "[I")
    private int[] field360;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "Lii;")
    public static class227 field357 = new class227(4);

    @OriginalMember(owner = "client!od", name = "u", descriptor = "[I")
    private static int[] field359 = null;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    private static int field362 = -1;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "[F")
    private static float[] field363 = new float[4];

    @OriginalMember(owner = "client!od", name = "B", descriptor = "[I")
    private static int[] field366 = new int[4];

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        if (this.field358 != -1) {
            class266.method1927(this.field358, this.field365, this.field364);
            this.field358 = -1;
            this.field365 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()Z", line = 19)
    private final boolean method171() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class215.field3020.method387(-101, this.field360[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "()V", line = 31)
    private final void method172() {
        if (this.field358 >= 0 && class266.field4192 == this.field364) {
            return;
        }
        GL var1 = class250.field3818;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field358 = var2[0];
        var1.glBindTexture(34067, this.field358);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field364 = class266.field4192;
        this.field361 = 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lod;Lod;F)Lod;", line = 51)
    public final class28 method173(class28 arg0, class28 arg1, float arg2) {
        GL var4 = class250.field3818;
        class28 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class250.field3794) {
            return var5;
        }
        this.method172();
        if (field359 == null || field362 != class266.field4192) {
            field359 = new int[2];
            var4.glGenTextures(2, field359, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class250.method1806(field359[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field362 = class266.field4192;
        }
        int var7 = arg0.field356 > arg1.field356 ? arg0.field356 : arg1.field356;
        if (this.field356 != var7) {
            this.field356 = var7;
            var4.glBindTexture(34067, this.field358);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field356, this.field356, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method177();
        arg1.method177();
        class306.method2147(field366);
        class306.method2143();
        class297.method2101(class250.method1798());
        var4.glPushAttrib(2048);
        class250.method1815(false);
        class250.method1819(false);
        class250.method1794(false);
        class250.method1797(1);
        class250.method1812(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field356, 0.0D, (double) this.field356, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field356, this.field356);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field359[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field363[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field363, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method176(var4, arg0.field358, var11, arg0.field356, field359[0])) {
                var9 = false;
                break;
            }
            if (!method176(var4, arg1.field358, var11, arg1.field356, field359[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field358, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class250.method1806(field359[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field356, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field356, this.field356);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field356);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class250.method1794(true);
        class250.method1819(true);
        class250.method1815(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class297.method2100();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class306.method2142(field366);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)Lod;", line = 197)
    public static final class28 method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class28 var8 = (class28) field357.method1562(0, var6);
        if (var8 == null) {
            class28 var9 = new class28(arg0, arg1, arg2, arg3, arg4, arg5);
            field357.method1565(var6, var9, (byte) 92);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "()V", line = 211)
    public static void method175() {
        field357 = null;
        field359 = null;
        field363 = null;
        field366 = null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 317)
    public class28() {
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIII)V", line = 323)
    private class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field360 = new int[6];
        this.field360[0] = arg0;
        this.field360[1] = arg1;
        this.field360[2] = arg2;
        this.field360[3] = arg3;
        this.field360[4] = arg4;
        this.field360[5] = arg5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 235)
    private static final boolean method176(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class250.method1806(arg4);
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

    @OriginalMember(owner = "client!od", name = "d", descriptor = "()V", line = 254)
    public final void method177() {
        GL var1 = class250.field3818;
        this.method172();
        var1.glBindTexture(34067, this.field358);
        if (this.field360 == null || this.field361 == 2) {
            return;
        }
        if (this.method171()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field360[var3];
                this.field356 = class215.field3020.method376(var4, (byte) -56) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field356;
                } else if (this.field356 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class215.field3020.method377((byte) -111, var4));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class266.field4196 += var6 - this.field365;
            this.field365 = var6;
            this.field361 = 2;
        } else if (this.field361 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class215.field3023, class215.field3020.method375(this.field360[var7], 4964), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class266.field4196 += 3 - this.field365;
                this.field365 = 3;
            }
            this.field361 = 1;
        }
    }
}
