import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class334 {

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field5225 = -1;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field5224 = -1;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "[I")
    public static int[] field5227 = null;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[I")
    public static int[] field5228 = null;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5223;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5226;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Z")
    public static boolean field5229;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 8)
    public static void method2322() {
        field5228 = null;
        field5227 = null;
        field5226 = null;
        field5223 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V", line = 14)
    public static final void method2323() {
        field5229 = class94.field1500;
        method2324();
        method2325();
        method2326();
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 21)
    public static final void method2324() {
        if (field5226 == null) {
            class93 var0 = new class93();
            byte[] var1 = var0.method666(64, 64, 64);
            field5226 = ByteBuffer.allocateDirect(var1.length);
            field5226.position(0);
            field5226.put(var1);
            field5226.flip();
        }
        if (field5223 != null) {
            return;
        }
        class28 var2 = new class28();
        byte[] var3 = var2.method246(64, 64, 64);
        field5223 = ByteBuffer.allocateDirect(var3.length);
        field5223.position(0);
        field5223.put(var3);
        field5223.flip();
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 61)
    private static final void method2325() {
        GL var0 = class94.field1473;
        if (field5229) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field5226.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field5226);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field5224 = var1[0];
            class198.field2961 += field5226.limit() * 2;
            return;
        }
        field5228 = new int[64];
        var0.glGenTextures(64, field5228, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class94.method698(field5228[var2]);
            field5226.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field5226);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class198.field2961 += field5226.limit() * 2;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 101)
    private static final void method2326() {
        GL var0 = class94.field1473;
        if (field5229) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field5223.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field5223);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field5225 = var1[0];
            class198.field2961 += field5223.limit() * 2;
            return;
        }
        field5227 = new int[64];
        var0.glGenTextures(64, field5227, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class94.method698(field5227[var2]);
            field5223.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field5223);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class198.field2961 += field5223.limit() * 2;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 142)
    public static final void method2327() {
        if (field5224 != -1) {
            GL var0 = class94.field1473;
            int[] var1 = new int[] { field5224 };
            var0.glDeleteTextures(1, var1, 0);
            field5224 = -1;
            class198.field2961 -= field5226.limit() * 2;
        }
        if (field5228 != null) {
            GL var2 = class94.field1473;
            var2.glDeleteTextures(64, field5228, 0);
            field5228 = null;
            class198.field2961 -= field5226.limit() * 2;
        }
        if (field5225 != -1) {
            GL var3 = class94.field1473;
            int[] var4 = new int[] { field5225 };
            var3.glDeleteTextures(1, var4, 0);
            field5225 = -1;
            class198.field2961 -= field5223.limit() * 2;
        }
        if (field5227 != null) {
            GL var5 = class94.field1473;
            var5.glDeleteTextures(64, field5227, 0);
            field5227 = null;
            class198.field2961 -= field5223.limit() * 2;
        }
    }
}
