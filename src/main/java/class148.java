import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class148 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "[I")
    public static int[] field2327 = null;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field2329 = -1;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[I")
    public static int[] field2328 = null;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field2330 = -1;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2324;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2326;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Z")
    public static boolean field2325;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()V", line = 6)
    public static final void method1086() {
        field2325 = class109.field1469;
        method1091();
        method1090();
        method1087();
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()V", line = 16)
    private static final void method1087() {
        GL var0 = class109.field1456;
        if (field2325) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2324.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2324);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2329 = var1[0];
            class103.field1374 += field2324.limit() * 2;
            return;
        }
        field2328 = new int[64];
        var0.glGenTextures(64, field2328, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class109.method752(field2328[var2]);
            field2324.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2324);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class103.field1374 += field2324.limit() * 2;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()V", line = 52)
    public static final void method1088() {
        if (field2330 != -1) {
            GL var0 = class109.field1456;
            int[] var1 = new int[] { field2330 };
            var0.glDeleteTextures(1, var1, 0);
            field2330 = -1;
            class103.field1374 -= field2326.limit() * 2;
        }
        if (field2327 != null) {
            GL var2 = class109.field1456;
            var2.glDeleteTextures(64, field2327, 0);
            field2327 = null;
            class103.field1374 -= field2326.limit() * 2;
        }
        if (field2329 != -1) {
            GL var3 = class109.field1456;
            int[] var4 = new int[] { field2329 };
            var3.glDeleteTextures(1, var4, 0);
            field2329 = -1;
            class103.field1374 -= field2324.limit() * 2;
        }
        if (field2328 != null) {
            GL var5 = class109.field1456;
            var5.glDeleteTextures(64, field2328, 0);
            field2328 = null;
            class103.field1374 -= field2324.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "()V", line = 97)
    public static void method1089() {
        field2327 = null;
        field2328 = null;
        field2326 = null;
        field2324 = null;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "()V", line = 109)
    private static final void method1090() {
        GL var0 = class109.field1456;
        if (field2325) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2326.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2326);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2330 = var1[0];
            class103.field1374 += field2326.limit() * 2;
            return;
        }
        field2327 = new int[64];
        var0.glGenTextures(64, field2327, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class109.method752(field2327[var2]);
            field2326.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2326);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class103.field1374 += field2326.limit() * 2;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "()V", line = 157)
    public static final void method1091() {
        if (field2326 == null) {
            class93 var0 = new class93();
            byte[] var1 = var0.method671(64, 64, 64);
            field2326 = ByteBuffer.allocateDirect(var1.length);
            field2326.position(0);
            field2326.put(var1);
            field2326.flip();
        }
        if (field2324 != null) {
            return;
        }
        class100 var2 = new class100();
        byte[] var3 = var2.method696(64, 64, 64);
        field2324 = ByteBuffer.allocateDirect(var3.length);
        field2324.position(0);
        field2324.put(var3);
        field2324.flip();
    }
}
