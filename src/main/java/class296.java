import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class296 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field5129 = -1;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field5130 = -1;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[I")
    public static int[] field5133 = null;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "[I")
    public static int[] field5128 = null;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5131;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5132;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Z")
    public static boolean field5127;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 7)
    public static final void method2068() {
        if (field5130 != -1) {
            GL var0 = class253.field4319;
            int[] var1 = new int[] { field5130 };
            var0.glDeleteTextures(1, var1, 0);
            field5130 = -1;
            class221.field3869 -= field5131.limit() * 2;
        }
        if (field5128 != null) {
            GL var2 = class253.field4319;
            var2.glDeleteTextures(64, field5128, 0);
            field5128 = null;
            class221.field3869 -= field5131.limit() * 2;
        }
        if (field5129 != -1) {
            GL var3 = class253.field4319;
            int[] var4 = new int[] { field5129 };
            var3.glDeleteTextures(1, var4, 0);
            field5129 = -1;
            class221.field3869 -= field5132.limit() * 2;
        }
        if (field5133 != null) {
            GL var5 = class253.field4319;
            var5.glDeleteTextures(64, field5133, 0);
            field5133 = null;
            class221.field3869 -= field5132.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()V", line = 50)
    public static final void method2069() {
        field5127 = class253.field4299;
        method2070();
        method2073();
        method2072();
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()V", line = 58)
    public static final void method2070() {
        if (field5131 == null) {
            class184 var0 = new class184();
            byte[] var1 = var0.method1345(64, 64, 64);
            field5131 = ByteBuffer.allocateDirect(var1.length);
            field5131.position(0);
            field5131.put(var1);
            field5131.flip();
        }
        if (field5132 != null) {
            return;
        }
        class12 var2 = new class12();
        byte[] var3 = var2.method73(64, 64, 64);
        field5132 = ByteBuffer.allocateDirect(var3.length);
        field5132.position(0);
        field5132.put(var3);
        field5132.flip();
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()V", line = 93)
    public static void method2071() {
        field5128 = null;
        field5133 = null;
        field5131 = null;
        field5132 = null;
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "()V", line = 103)
    private static final void method2072() {
        GL var0 = class253.field4319;
        if (field5127) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field5132.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field5132);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field5129 = var1[0];
            class221.field3869 += field5132.limit() * 2;
            return;
        }
        field5133 = new int[64];
        var0.glGenTextures(64, field5133, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class253.method1714(field5133[var2]);
            field5132.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field5132);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class221.field3869 += field5132.limit() * 2;
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "()V", line = 140)
    private static final void method2073() {
        GL var0 = class253.field4319;
        if (field5127) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field5131.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field5131);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field5130 = var1[0];
            class221.field3869 += field5131.limit() * 2;
            return;
        }
        field5128 = new int[64];
        var0.glGenTextures(64, field5128, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class253.method1714(field5128[var2]);
            field5131.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field5131);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class221.field3869 += field5131.limit() * 2;
    }
}
