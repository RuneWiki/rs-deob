import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class245 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3646 = -1;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "[I")
    public static int[] field3650 = null;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[I")
    public static int[] field3651 = null;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field3648 = -1;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3649;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3652;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Z")
    public static boolean field3647;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V", line = 7)
    private static final void method1797() {
        GL var0 = class141.field2025;
        if (field3647) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3649.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3649);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3648 = var1[0];
            class305.field4570 += field3649.limit() * 2;
            return;
        }
        field3651 = new int[64];
        var0.glGenTextures(64, field3651, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class141.method1000(field3651[var2]);
            field3649.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3649);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class305.field4570 += field3649.limit() * 2;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "()V", line = 43)
    public static final void method1798() {
        field3647 = class141.field2012;
        method1799();
        method1800();
        method1797();
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "()V", line = 58)
    public static final void method1799() {
        if (field3652 == null) {
            class295 var0 = new class295();
            byte[] var1 = var0.method2107(64, 64, 64);
            field3652 = ByteBuffer.allocateDirect(var1.length);
            field3652.position(0);
            field3652.put(var1);
            field3652.flip();
        }
        if (field3649 != null) {
            return;
        }
        class113 var2 = new class113();
        byte[] var3 = var2.method856(64, 64, 64);
        field3649 = ByteBuffer.allocateDirect(var3.length);
        field3649.position(0);
        field3649.put(var3);
        field3649.flip();
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "()V", line = 85)
    private static final void method1800() {
        GL var0 = class141.field2025;
        if (field3647) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3652.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3652);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3646 = var1[0];
            class305.field4570 += field3652.limit() * 2;
            return;
        }
        field3650 = new int[64];
        var0.glGenTextures(64, field3650, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class141.method1000(field3650[var2]);
            field3652.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3652);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class305.field4570 += field3652.limit() * 2;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "()V", line = 122)
    public static void method1801() {
        field3650 = null;
        field3651 = null;
        field3652 = null;
        field3649 = null;
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "()V", line = 144)
    public static final void method1802() {
        if (field3646 != -1) {
            GL var0 = class141.field2025;
            int[] var1 = new int[] { field3646 };
            var0.glDeleteTextures(1, var1, 0);
            field3646 = -1;
            class305.field4570 -= field3652.limit() * 2;
        }
        if (field3650 != null) {
            GL var2 = class141.field2025;
            var2.glDeleteTextures(64, field3650, 0);
            field3650 = null;
            class305.field4570 -= field3652.limit() * 2;
        }
        if (field3648 != -1) {
            GL var3 = class141.field2025;
            int[] var4 = new int[] { field3648 };
            var3.glDeleteTextures(1, var4, 0);
            field3648 = -1;
            class305.field4570 -= field3649.limit() * 2;
        }
        if (field3651 != null) {
            GL var5 = class141.field2025;
            var5.glDeleteTextures(64, field3651, 0);
            field3651 = null;
            class305.field4570 -= field3649.limit() * 2;
        }
    }
}
