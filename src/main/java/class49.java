import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class49 {

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "[I")
    public static int[] field771 = null;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
    public static int[] field772 = null;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field777 = -1;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field776 = -1;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field773;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field774;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Z")
    public static boolean field775;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()V", line = 8)
    public static final void method361() {
        if (field774 == null) {
            class161 var0 = new class161();
            byte[] var1 = var0.method1093(64, 64, 64);
            field774 = ByteBuffer.allocateDirect(var1.length);
            field774.position(0);
            field774.put(var1);
            field774.flip();
        }
        if (field773 != null) {
            return;
        }
        class111 var2 = new class111();
        byte[] var3 = var2.method781(64, 64, 64);
        field773 = ByteBuffer.allocateDirect(var3.length);
        field773.position(0);
        field773.put(var3);
        field773.flip();
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "()V", line = 40)
    public static final void method362() {
        if (field776 != -1) {
            GL var0 = class255.field4181;
            int[] var1 = new int[] { field776 };
            var0.glDeleteTextures(1, var1, 0);
            field776 = -1;
            class197.field3056 -= field774.limit() * 2;
        }
        if (field772 != null) {
            GL var2 = class255.field4181;
            var2.glDeleteTextures(64, field772, 0);
            field772 = null;
            class197.field3056 -= field774.limit() * 2;
        }
        if (field777 != -1) {
            GL var3 = class255.field4181;
            int[] var4 = new int[] { field777 };
            var3.glDeleteTextures(1, var4, 0);
            field777 = -1;
            class197.field3056 -= field773.limit() * 2;
        }
        if (field771 != null) {
            GL var5 = class255.field4181;
            var5.glDeleteTextures(64, field771, 0);
            field771 = null;
            class197.field3056 -= field773.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "()V", line = 84)
    public static final void method363() {
        field775 = class255.field4179;
        method361();
        method365();
        method366();
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "()V", line = 91)
    public static void method364() {
        field772 = null;
        field771 = null;
        field774 = null;
        field773 = null;
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "()V", line = 102)
    private static final void method365() {
        GL var0 = class255.field4181;
        if (field775) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field774.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field774);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field776 = var1[0];
            class197.field3056 += field774.limit() * 2;
            return;
        }
        field772 = new int[64];
        var0.glGenTextures(64, field772, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class255.method1790(field772[var2]);
            field774.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field774);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class197.field3056 += field774.limit() * 2;
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "()V", line = 139)
    private static final void method366() {
        GL var0 = class255.field4181;
        if (field775) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field773.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field773);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field777 = var1[0];
            class197.field3056 += field773.limit() * 2;
            return;
        }
        field771 = new int[64];
        var0.glGenTextures(64, field771, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class255.method1790(field771[var2]);
            field773.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field773);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class197.field3056 += field773.limit() * 2;
    }
}
