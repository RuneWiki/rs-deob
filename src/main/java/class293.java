import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class293 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[I")
    public static int[] field5013 = null;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field5012 = -1;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field5016 = -1;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "[I")
    public static int[] field5015 = null;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5011;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5017;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Z")
    public static boolean field5014;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()V", line = 9)
    public static final void method2023() {
        if (field5016 != -1) {
            GL var0 = class217.field3551;
            int[] var1 = new int[] { field5016 };
            var0.glDeleteTextures(1, var1, 0);
            field5016 = -1;
            class207.field3385 -= field5017.limit() * 2;
        }
        if (field5015 != null) {
            GL var2 = class217.field3551;
            var2.glDeleteTextures(64, field5015, 0);
            field5015 = null;
            class207.field3385 -= field5017.limit() * 2;
        }
        if (field5012 != -1) {
            GL var3 = class217.field3551;
            int[] var4 = new int[] { field5012 };
            var3.glDeleteTextures(1, var4, 0);
            field5012 = -1;
            class207.field3385 -= field5011.limit() * 2;
        }
        if (field5013 != null) {
            GL var5 = class217.field3551;
            var5.glDeleteTextures(64, field5013, 0);
            field5013 = null;
            class207.field3385 -= field5011.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()V", line = 53)
    private static final void method2024() {
        GL var0 = class217.field3551;
        if (field5014) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field5017.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field5017);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field5016 = var1[0];
            class207.field3385 += field5017.limit() * 2;
            return;
        }
        field5015 = new int[64];
        var0.glGenTextures(64, field5015, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class217.method1457(field5015[var2]);
            field5017.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field5017);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class207.field3385 += field5017.limit() * 2;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()V", line = 89)
    public static void method2025() {
        field5015 = null;
        field5013 = null;
        field5017 = null;
        field5011 = null;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "()V", line = 97)
    public static final void method2026() {
        if (field5017 == null) {
            class166 var0 = new class166();
            byte[] var1 = var0.method1102(64, 64, 64);
            field5017 = ByteBuffer.allocateDirect(var1.length);
            field5017.position(0);
            field5017.put(var1);
            field5017.flip();
        }
        if (field5011 != null) {
            return;
        }
        class177 var2 = new class177();
        byte[] var3 = var2.method1176(64, 64, 64);
        field5011 = ByteBuffer.allocateDirect(var3.length);
        field5011.position(0);
        field5011.put(var3);
        field5011.flip();
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "()V", line = 124)
    private static final void method2027() {
        GL var0 = class217.field3551;
        if (field5014) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field5011.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field5011);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field5012 = var1[0];
            class207.field3385 += field5011.limit() * 2;
            return;
        }
        field5013 = new int[64];
        var0.glGenTextures(64, field5013, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class217.method1457(field5013[var2]);
            field5011.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field5011);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class207.field3385 += field5011.limit() * 2;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "()V", line = 180)
    public static final void method2028() {
        field5014 = class217.field3538;
        method2026();
        method2024();
        method2027();
    }
}
