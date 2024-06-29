import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class149 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "[I")
    public static int[] field2734 = null;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field2735 = -1;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field2736 = -1;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "[I")
    public static int[] field2740 = null;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2737;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2739;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Z")
    public static boolean field2738;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "()V", line = 5)
    public static void method1111() {
        field2740 = null;
        field2734 = null;
        field2739 = null;
        field2737 = null;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "()V", line = 19)
    public static final void method1112() {
        field2738 = class56.field849;
        method1115();
        method1113();
        method1114();
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "()V", line = 30)
    private static final void method1113() {
        GL var0 = class56.field848;
        if (field2738) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2739.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2739);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2735 = var1[0];
            class121.field2025 += field2739.limit() * 2;
            return;
        }
        field2740 = new int[64];
        var0.glGenTextures(64, field2740, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class56.method354(field2740[var2]);
            field2739.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2739);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class121.field2025 += field2739.limit() * 2;
    }

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "()V", line = 68)
    private static final void method1114() {
        GL var0 = class56.field848;
        if (field2738) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2737.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2737);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2736 = var1[0];
            class121.field2025 += field2737.limit() * 2;
            return;
        }
        field2734 = new int[64];
        var0.glGenTextures(64, field2734, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class56.method354(field2734[var2]);
            field2737.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2737);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class121.field2025 += field2737.limit() * 2;
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "()V", line = 107)
    public static final void method1115() {
        if (field2739 == null) {
            class268 var0 = new class268();
            byte[] var1 = var0.method1807(64, 64, 64);
            field2739 = ByteBuffer.allocateDirect(var1.length);
            field2739.position(0);
            field2739.put(var1);
            field2739.flip();
        }
        if (field2737 != null) {
            return;
        }
        class284 var2 = new class284();
        byte[] var3 = var2.method1894(64, 64, 64);
        field2737 = ByteBuffer.allocateDirect(var3.length);
        field2737.position(0);
        field2737.put(var3);
        field2737.flip();
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "()V", line = 133)
    public static final void method1116() {
        if (field2735 != -1) {
            GL var0 = class56.field848;
            int[] var1 = new int[] { field2735 };
            var0.glDeleteTextures(1, var1, 0);
            field2735 = -1;
            class121.field2025 -= field2739.limit() * 2;
        }
        if (field2740 != null) {
            GL var2 = class56.field848;
            var2.glDeleteTextures(64, field2740, 0);
            field2740 = null;
            class121.field2025 -= field2739.limit() * 2;
        }
        if (field2736 != -1) {
            GL var3 = class56.field848;
            int[] var4 = new int[] { field2736 };
            var3.glDeleteTextures(1, var4, 0);
            field2736 = -1;
            class121.field2025 -= field2737.limit() * 2;
        }
        if (field2734 != null) {
            GL var5 = class56.field848;
            var5.glDeleteTextures(64, field2734, 0);
            field2734 = null;
            class121.field2025 -= field2737.limit() * 2;
        }
    }
}
