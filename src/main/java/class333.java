import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class333 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[I")
    public static int[] field5100 = null;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field5103 = -1;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
    public static int[] field5105 = null;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field5104 = -1;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5101;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field5102;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Z")
    public static boolean field5106;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 8)
    public static final void method2344() {
        if (field5104 != -1) {
            GL var0 = class240.field3771;
            int[] var1 = new int[] { field5104 };
            var0.glDeleteTextures(1, var1, 0);
            field5104 = -1;
            class28.field459 -= field5101.limit() * 2;
        }
        if (field5100 != null) {
            GL var2 = class240.field3771;
            var2.glDeleteTextures(64, field5100, 0);
            field5100 = null;
            class28.field459 -= field5101.limit() * 2;
        }
        if (field5103 != -1) {
            GL var3 = class240.field3771;
            int[] var4 = new int[] { field5103 };
            var3.glDeleteTextures(1, var4, 0);
            field5103 = -1;
            class28.field459 -= field5102.limit() * 2;
        }
        if (field5105 != null) {
            GL var5 = class240.field3771;
            var5.glDeleteTextures(64, field5105, 0);
            field5105 = null;
            class28.field459 -= field5102.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()V", line = 51)
    private static final void method2345() {
        GL var0 = class240.field3771;
        if (field5106) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field5102.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field5102);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field5103 = var1[0];
            class28.field459 += field5102.limit() * 2;
            return;
        }
        field5105 = new int[64];
        var0.glGenTextures(64, field5105, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class240.method1786(field5105[var2]);
            field5102.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field5102);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class28.field459 += field5102.limit() * 2;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "()V", line = 96)
    public static final void method2346() {
        field5106 = class240.field3762;
        method2349();
        method2347();
        method2345();
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "()V", line = 104)
    private static final void method2347() {
        GL var0 = class240.field3771;
        if (field5106) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field5101.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field5101);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field5104 = var1[0];
            class28.field459 += field5101.limit() * 2;
            return;
        }
        field5100 = new int[64];
        var0.glGenTextures(64, field5100, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class240.method1786(field5100[var2]);
            field5101.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field5101);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class28.field459 += field5101.limit() * 2;
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "()V", line = 148)
    public static void method2348() {
        field5100 = null;
        field5105 = null;
        field5101 = null;
        field5102 = null;
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "()V", line = 154)
    public static final void method2349() {
        if (field5101 == null) {
            class30 var0 = new class30();
            byte[] var1 = var0.method333(64, 64, 64);
            field5101 = ByteBuffer.allocateDirect(var1.length);
            field5101.position(0);
            field5101.put(var1);
            field5101.flip();
        }
        if (field5102 != null) {
            return;
        }
        class132 var2 = new class132();
        byte[] var3 = var2.method1133(64, 64, 64);
        field5102 = ByteBuffer.allocateDirect(var3.length);
        field5102.position(0);
        field5102.put(var3);
        field5102.flip();
    }
}
