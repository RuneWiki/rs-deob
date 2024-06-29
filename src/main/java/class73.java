import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class73 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "[I")
    public static int[] field1279 = null;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "[I")
    public static int[] field1282 = null;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field1285 = -1;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field1284 = -1;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1280;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1281;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "Z")
    public static boolean field1283;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()V", line = 9)
    private static final void method486() {
        GL var0 = class167.field2806;
        if (field1283) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1281.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field1281);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1285 = var1[0];
            class101.field1720 += field1281.limit() * 2;
            return;
        }
        field1282 = new int[64];
        var0.glGenTextures(64, field1282, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class167.method1033(field1282[var2]);
            field1281.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1281);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class101.field1720 += field1281.limit() * 2;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "()V", line = 54)
    public static final void method487() {
        field1283 = class167.field2801;
        if (field1281 == null) {
            class8 var0 = new class8();
            byte[] var1;
            if (field1283) {
                var1 = var0.method49(128, 128, 32);
            } else {
                var1 = var0.method49(64, 64, 64);
            }
            field1281 = ByteBuffer.allocateDirect(var1.length);
            field1281.position(0);
            field1281.put(var1);
            field1281.flip();
        }
        if (field1280 == null) {
            class43 var2 = new class43();
            byte[] var3;
            if (field1283) {
                var3 = var2.method262(128, 128, 32);
            } else {
                var3 = var2.method262(64, 64, 64);
            }
            field1280 = ByteBuffer.allocateDirect(var3.length);
            field1280.position(0);
            field1280.put(var3);
            field1280.flip();
        }
        method486();
        method488();
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "()V", line = 92)
    private static final void method488() {
        GL var0 = class167.field2806;
        if (field1283) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field1280.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field1280);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field1284 = var1[0];
            class101.field1720 += field1280.limit() * 2;
            return;
        }
        field1279 = new int[64];
        var0.glGenTextures(64, field1279, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class167.method1033(field1279[var2]);
            field1280.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field1280);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class101.field1720 += field1280.limit() * 2;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "()V", line = 129)
    public static final void method489() {
        if (field1285 != -1) {
            GL var0 = class167.field2806;
            int[] var1 = new int[] { field1285 };
            var0.glDeleteTextures(1, var1, 0);
            field1285 = -1;
            class101.field1720 -= field1281.limit() * 2;
        }
        if (field1282 != null) {
            GL var2 = class167.field2806;
            var2.glDeleteTextures(64, field1282, 0);
            field1282 = null;
            class101.field1720 -= field1281.limit() * 2;
        }
        if (field1284 != -1) {
            GL var3 = class167.field2806;
            int[] var4 = new int[] { field1284 };
            var3.glDeleteTextures(1, var4, 0);
            field1284 = -1;
            class101.field1720 -= field1280.limit() * 2;
        }
        if (field1279 != null) {
            GL var5 = class167.field2806;
            var5.glDeleteTextures(64, field1279, 0);
            field1279 = null;
            class101.field1720 -= field1280.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "()V", line = 171)
    public static void method490() {
        field1282 = null;
        field1279 = null;
        field1281 = null;
        field1280 = null;
    }
}
