import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class49 {

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field700 = -1;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field702 = -1;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
    public static int[] field703 = null;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "[I")
    public static int[] field704 = null;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field698;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field701;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Z")
    public static boolean field699;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V", line = 7)
    private static final void method336() {
        GL var0 = class333.field5160;
        if (field699) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field701.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field701);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field700 = var1[0];
            class301.field4648 += field701.limit() * 2;
            return;
        }
        field704 = new int[64];
        var0.glGenTextures(64, field704, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class333.method2282(field704[var2]);
            field701.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field701);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class301.field4648 += field701.limit() * 2;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()V", line = 44)
    public static final void method337() {
        if (field702 != -1) {
            GL var0 = class333.field5160;
            int[] var1 = new int[] { field702 };
            var0.glDeleteTextures(1, var1, 0);
            field702 = -1;
            class301.field4648 -= field698.limit() * 2;
        }
        if (field703 != null) {
            GL var2 = class333.field5160;
            var2.glDeleteTextures(64, field703, 0);
            field703 = null;
            class301.field4648 -= field698.limit() * 2;
        }
        if (field700 != -1) {
            GL var3 = class333.field5160;
            int[] var4 = new int[] { field700 };
            var3.glDeleteTextures(1, var4, 0);
            field700 = -1;
            class301.field4648 -= field701.limit() * 2;
        }
        if (field704 != null) {
            GL var5 = class333.field5160;
            var5.glDeleteTextures(64, field704, 0);
            field704 = null;
            class301.field4648 -= field701.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "()V", line = 86)
    public static final void method338() {
        field699 = class333.field5184;
        method339();
        method340();
        method336();
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "()V", line = 93)
    public static final void method339() {
        if (field698 == null) {
            class119 var0 = new class119();
            byte[] var1 = var0.method813(64, 64, 64);
            field698 = ByteBuffer.allocateDirect(var1.length);
            field698.position(0);
            field698.put(var1);
            field698.flip();
        }
        if (field701 != null) {
            return;
        }
        class21 var2 = new class21();
        byte[] var3 = var2.method165(64, 64, 64);
        field701 = ByteBuffer.allocateDirect(var3.length);
        field701.position(0);
        field701.put(var3);
        field701.flip();
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "()V", line = 122)
    private static final void method340() {
        GL var0 = class333.field5160;
        if (field699) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field698.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field698);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field702 = var1[0];
            class301.field4648 += field698.limit() * 2;
            return;
        }
        field703 = new int[64];
        var0.glGenTextures(64, field703, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class333.method2282(field703[var2]);
            field698.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field698);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class301.field4648 += field698.limit() * 2;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "()V", line = 158)
    public static void method341() {
        field703 = null;
        field704 = null;
        field698 = null;
        field701 = null;
    }
}
