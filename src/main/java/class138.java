import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class138 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "[I")
    public static int[] field2431 = null;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field2430 = -1;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
    public static int[] field2432 = null;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field2434 = -1;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2433;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field2436;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Z")
    public static boolean field2435;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()V", line = 6)
    private static final void method946() {
        GL var0 = class231.field4052;
        if (field2435) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2436.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2436);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2434 = var1[0];
            class124.field2103 += field2436.limit() * 2;
            return;
        }
        field2431 = new int[64];
        var0.glGenTextures(64, field2431, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class231.method1597(field2431[var2]);
            field2436.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2436);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class124.field2103 += field2436.limit() * 2;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()V", line = 44)
    public static final void method947() {
        if (field2430 != -1) {
            GL var0 = class231.field4052;
            int[] var1 = new int[] { field2430 };
            var0.glDeleteTextures(1, var1, 0);
            field2430 = -1;
            class124.field2103 -= field2433.limit() * 2;
        }
        if (field2432 != null) {
            GL var2 = class231.field4052;
            var2.glDeleteTextures(64, field2432, 0);
            field2432 = null;
            class124.field2103 -= field2433.limit() * 2;
        }
        if (field2434 != -1) {
            GL var3 = class231.field4052;
            int[] var4 = new int[] { field2434 };
            var3.glDeleteTextures(1, var4, 0);
            field2434 = -1;
            class124.field2103 -= field2436.limit() * 2;
        }
        if (field2431 != null) {
            GL var5 = class231.field4052;
            var5.glDeleteTextures(64, field2431, 0);
            field2431 = null;
            class124.field2103 -= field2436.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "()V", line = 96)
    private static final void method948() {
        GL var0 = class231.field4052;
        if (field2435) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field2433.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field2433);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field2430 = var1[0];
            class124.field2103 += field2433.limit() * 2;
            return;
        }
        field2432 = new int[64];
        var0.glGenTextures(64, field2432, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class231.method1597(field2432[var2]);
            field2433.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field2433);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class124.field2103 += field2433.limit() * 2;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "()V", line = 140)
    public static final void method949() {
        if (field2433 == null) {
            class309 var0 = new class309();
            byte[] var1 = var0.method2160(64, 64, 64);
            field2433 = ByteBuffer.allocateDirect(var1.length);
            field2433.position(0);
            field2433.put(var1);
            field2433.flip();
        }
        if (field2436 != null) {
            return;
        }
        class241 var2 = new class241();
        byte[] var3 = var2.method1671(64, 64, 64);
        field2436 = ByteBuffer.allocateDirect(var3.length);
        field2436.position(0);
        field2436.put(var3);
        field2436.flip();
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "()V", line = 169)
    public static void method950() {
        field2432 = null;
        field2431 = null;
        field2433 = null;
        field2436 = null;
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "()V", line = 180)
    public static final void method951() {
        field2435 = class231.field4085;
        method949();
        method948();
        method946();
    }
}
