import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class75 extends class36 {

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    private int field1030 = -1;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    private int field1032 = 0;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    private int field1029 = 0;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    private int field1036 = -1;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "[I")
    private int[] field1027;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "Lfm;")
    public static class53 field1031 = new class53(4);

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "[F")
    private static float[] field1034 = new float[4];

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "[I")
    private static int[] field1033 = new int[4];

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "[I")
    private static int[] field1035 = null;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    private static int field1037 = -1;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljavax/media/opengl/GL;IIII)Z", line = 5)
    private static final boolean method552(GL arg0, int arg1, int arg2, int arg3, int arg4) {
        class67.method479(arg4);
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

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIIIII)Ldc;", line = 18)
    public static final class75 method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        long var6 = (long) arg0 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg3 * 986053L ^ (long) arg4 * 32147369L ^ (long) arg5 * 76724863L;
        class75 var8 = (class75) field1031.method365(var6, 35);
        if (var8 == null) {
            class75 var9 = new class75(arg0, arg1, arg2, arg3, arg4, arg5);
            field1031.method369(0, var9, var6);
            return var9;
        } else {
            return var8;
        }
    }

    @OriginalMember(owner = "client!dc", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() throws Throwable {
        if (this.field1030 != -1) {
            class180.method1249(this.field1030, this.field1032, this.field1028);
            this.field1030 = -1;
            this.field1032 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()Z", line = 43)
    private final boolean method554() {
        for (int var1 = 0; var1 < 6; var1++) {
            if (!class184.field2543.method665((byte) -127, this.field1027[var1])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()V", line = 55)
    public static void method555() {
        field1031 = null;
        field1035 = null;
        field1034 = null;
        field1033 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ldc;Ldc;F)Ldc;", line = 69)
    public final class75 method556(class75 arg0, class75 arg1, float arg2) {
        GL var4 = class67.field899;
        class75 var5 = (double) arg2 < 0.5D ? arg0 : arg1;
        if (!class67.field903) {
            return var5;
        }
        this.method558();
        if (field1035 == null || field1037 != class180.field2413) {
            field1035 = new int[2];
            var4.glGenTextures(2, field1035, 0);
            for (int var6 = 0; var6 < 2; var6++) {
                class67.method479(field1035[var6]);
                var4.glTexParameteri(3553, 10241, 9728);
                var4.glTexParameteri(3553, 10240, 9728);
            }
            field1037 = class180.field2413;
        }
        int var7 = arg0.field1036 > arg1.field1036 ? arg0.field1036 : arg1.field1036;
        if (this.field1036 != var7) {
            this.field1036 = var7;
            var4.glBindTexture(34067, this.field1030);
            for (int var8 = 0; var8 < 6; var8++) {
                var4.glTexImage2D(var8 + 34069, 0, 6407, this.field1036, this.field1036, 0, 6407, 5121, (Buffer) null);
            }
            var4.glTexParameteri(34067, 10241, 9729);
            var4.glTexParameteri(34067, 10240, 9729);
        }
        arg0.method557();
        arg1.method557();
        class102.method747(field1033);
        class102.method748();
        class105.method772(class67.method486());
        var4.glPushAttrib(2048);
        class67.method476(false);
        class67.method460(false);
        class67.method459(false);
        class67.method489(1);
        class67.method457(1);
        var4.glDisable(3042);
        var4.glDisable(3008);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glMatrixMode(5889);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glOrtho(0.0D, (double) this.field1036, 0.0D, (double) this.field1036, -1.0D, 1.0D);
        var4.glViewport(0, 0, this.field1036, this.field1036);
        var4.glActiveTexture(33985);
        var4.glBindTexture(3553, field1035[1]);
        var4.glTexEnvi(8960, 34161, 34165);
        var4.glTexEnvi(8960, 34162, 34165);
        field1034[3] = arg2;
        var4.glTexEnvfv(8960, 8705, field1034, 0);
        var4.glEnable(3553);
        var4.glActiveTexture(33984);
        boolean var9 = true;
        for (int var10 = 0; var10 < 6; var10++) {
            int var11 = var10 + 34069;
            if (!method552(var4, arg0.field1030, var11, arg0.field1036, field1035[0])) {
                var9 = false;
                break;
            }
            if (!method552(var4, arg1.field1030, var11, arg1.field1036, field1035[1])) {
                var9 = false;
                break;
            }
            var4.glFramebufferTexture2DEXT(36160, 36064, var11, this.field1030, 0);
            var4.glDrawBuffer(36064);
            int var12 = var4.glCheckFramebufferStatusEXT(36160);
            if (var12 != 36053) {
                var9 = false;
                break;
            }
            class67.method479(field1035[0]);
            var4.glBegin(7);
            var4.glTexCoord2i(0, 0);
            var4.glMultiTexCoord2i(33985, 0, 0);
            var4.glVertex2i(0, 0);
            var4.glTexCoord2i(1, 0);
            var4.glMultiTexCoord2i(33985, 1, 0);
            var4.glVertex2i(this.field1036, 0);
            var4.glTexCoord2i(1, 1);
            var4.glMultiTexCoord2i(33985, 1, 1);
            var4.glVertex2i(this.field1036, this.field1036);
            var4.glTexCoord2i(0, 1);
            var4.glMultiTexCoord2i(33985, 0, 1);
            var4.glVertex2i(0, this.field1036);
            var4.glEnd();
        }
        var4.glPopMatrix();
        var4.glMatrixMode(5888);
        var4.glPopMatrix();
        class67.method459(true);
        class67.method460(true);
        class67.method476(true);
        var4.glEnable(3008);
        var4.glEnable(3042);
        var4.glPopAttrib();
        class105.method770();
        var4.glActiveTexture(33985);
        var4.glTexEnvi(8960, 34161, 8448);
        var4.glTexEnvi(8960, 34162, 8448);
        var4.glDisable(3553);
        var4.glActiveTexture(33984);
        class102.method740(field1033);
        return var9 ? this : var5;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "()V", line = 210)
    public final void method557() {
        GL var1 = class67.field899;
        this.method558();
        var1.glBindTexture(34067, this.field1030);
        if (this.field1027 == null || this.field1029 == 2) {
            return;
        }
        if (this.method554()) {
            int var2 = -1;
            for (int var3 = 0; var3 < 6; var3++) {
                int var4 = this.field1027[var3];
                this.field1036 = class184.field2543.method671((byte) 105, var4) ? 64 : 128;
                if (var3 <= 0) {
                    var2 = this.field1036;
                } else if (this.field1036 != var2) {
                    throw new RuntimeException("");
                }
                IntBuffer var5 = IntBuffer.wrap(class184.field2543.method670(var4, 72));
                var1.glTexImage2D(var3 + 34069, 0, 6407, var2, var2, 0, 32993, 5121, var5);
            }
            var1.glTexParameteri(34067, 10241, 9729);
            var1.glTexParameteri(34067, 10240, 9729);
            int var6 = var2 * var2 * 6 * 3;
            class180.field2412 += var6 - this.field1032;
            this.field1032 = var6;
            this.field1029 = 2;
        } else if (this.field1029 != 1) {
            for (int var7 = 0; var7 < 6; var7++) {
                IntBuffer var8 = IntBuffer.wrap(class184.field2527, class184.field2543.method669(this.field1027[var7], 64), 1);
                var1.glTexImage2D(var7 + 34069, 0, 6407, 1, 1, 0, 32993, 5121, var8);
                class180.field2412 += 3 - this.field1032;
                this.field1032 = 3;
            }
            this.field1029 = 1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 315)
    public class75() {
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIII)V", line = 317)
    private class75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1027 = new int[6];
        this.field1027[0] = arg0;
        this.field1027[1] = arg1;
        this.field1027[2] = arg2;
        this.field1027[3] = arg3;
        this.field1027[4] = arg4;
        this.field1027[5] = arg5;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "()V", line = 288)
    private final void method558() {
        if (this.field1030 >= 0 && class180.field2413 == this.field1028) {
            return;
        }
        GL var1 = class67.field899;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1030 = var2[0];
        var1.glBindTexture(34067, this.field1030);
        var1.glTexParameteri(34067, 32882, 33071);
        var1.glTexParameteri(34067, 10242, 33071);
        var1.glTexParameteri(34067, 10243, 33071);
        this.field1028 = class180.field2413;
        this.field1029 = 0;
    }
}
