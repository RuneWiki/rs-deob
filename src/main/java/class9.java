import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class9 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[I")
    public static int[] field112 = null;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field111 = -1;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field115 = -1;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[I")
    public static int[] field113 = null;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field114;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field117;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Z")
    public static boolean field116;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()V", line = 8)
    private static final void method56() {
        GL var0 = class99.field1682;
        if (field116) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field117.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field117);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field111 = var1[0];
            class274.field4578 += field117.limit() * 2;
            return;
        }
        field113 = new int[64];
        var0.glGenTextures(64, field113, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class99.method749(field113[var2]);
            field117.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field117);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class274.field4578 += field117.limit() * 2;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "()V", line = 45)
    private static final void method57() {
        GL var0 = class99.field1682;
        if (field116) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field114.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field114);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field115 = var1[0];
            class274.field4578 += field114.limit() * 2;
            return;
        }
        field112 = new int[64];
        var0.glGenTextures(64, field112, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class99.method749(field112[var2]);
            field114.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field114);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class274.field4578 += field114.limit() * 2;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "()V", line = 82)
    public static void method58() {
        field113 = null;
        field112 = null;
        field117 = null;
        field114 = null;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "()V", line = 101)
    public static final void method59() {
        if (field111 != -1) {
            GL var0 = class99.field1682;
            int[] var1 = new int[] { field111 };
            var0.glDeleteTextures(1, var1, 0);
            field111 = -1;
            class274.field4578 -= field117.limit() * 2;
        }
        if (field113 != null) {
            GL var2 = class99.field1682;
            var2.glDeleteTextures(64, field113, 0);
            field113 = null;
            class274.field4578 -= field117.limit() * 2;
        }
        if (field115 != -1) {
            GL var3 = class99.field1682;
            int[] var4 = new int[] { field115 };
            var3.glDeleteTextures(1, var4, 0);
            field115 = -1;
            class274.field4578 -= field114.limit() * 2;
        }
        if (field112 != null) {
            GL var5 = class99.field1682;
            var5.glDeleteTextures(64, field112, 0);
            field112 = null;
            class274.field4578 -= field114.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "()V", line = 147)
    public static final void method60() {
        if (field117 == null) {
            class278 var0 = new class278();
            byte[] var1 = var0.method1915(64, 64, 64);
            field117 = ByteBuffer.allocateDirect(var1.length);
            field117.position(0);
            field117.put(var1);
            field117.flip();
        }
        if (field114 != null) {
            return;
        }
        class3 var2 = new class3();
        byte[] var3 = var2.method18(64, 64, 64);
        field114 = ByteBuffer.allocateDirect(var3.length);
        field114.position(0);
        field114.put(var3);
        field114.flip();
    }

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "()V", line = 176)
    public static final void method61() {
        field116 = class99.field1668;
        method60();
        method56();
        method57();
    }
}
