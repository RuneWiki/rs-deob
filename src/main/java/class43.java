import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class43 {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[I")
    public static int[] field636 = null;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field638 = -1;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "[I")
    public static int[] field637 = null;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field639 = -1;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field640;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field641;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "Z")
    public static boolean field635;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()V", line = 6)
    private static final void method330() {
        GL var0 = class245.field3884;
        if (field635) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field641.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field641);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field638 = var1[0];
            class173.field2704 += field641.limit() * 2;
            return;
        }
        field637 = new int[64];
        var0.glGenTextures(64, field637, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class245.method1729(field637[var2]);
            field641.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field641);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class173.field2704 += field641.limit() * 2;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "()V", line = 46)
    public static final void method331() {
        field635 = class245.field3885;
        method334();
        method333();
        method330();
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "()V", line = 52)
    public static void method332() {
        field636 = null;
        field637 = null;
        field640 = null;
        field641 = null;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "()V", line = 72)
    private static final void method333() {
        GL var0 = class245.field3884;
        if (field635) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field640.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field640);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field639 = var1[0];
            class173.field2704 += field640.limit() * 2;
            return;
        }
        field636 = new int[64];
        var0.glGenTextures(64, field636, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class245.method1729(field636[var2]);
            field640.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field640);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class173.field2704 += field640.limit() * 2;
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "()V", line = 111)
    public static final void method334() {
        if (field640 == null) {
            class331 var0 = new class331();
            byte[] var1 = var0.method2358(64, 64, 64);
            field640 = ByteBuffer.allocateDirect(var1.length);
            field640.position(0);
            field640.put(var1);
            field640.flip();
        }
        if (field641 != null) {
            return;
        }
        class66 var2 = new class66();
        byte[] var3 = var2.method459(64, 64, 64);
        field641 = ByteBuffer.allocateDirect(var3.length);
        field641.position(0);
        field641.put(var3);
        field641.flip();
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "()V", line = 144)
    public static final void method335() {
        if (field639 != -1) {
            GL var0 = class245.field3884;
            int[] var1 = new int[] { field639 };
            var0.glDeleteTextures(1, var1, 0);
            field639 = -1;
            class173.field2704 -= field640.limit() * 2;
        }
        if (field636 != null) {
            GL var2 = class245.field3884;
            var2.glDeleteTextures(64, field636, 0);
            field636 = null;
            class173.field2704 -= field640.limit() * 2;
        }
        if (field638 != -1) {
            GL var3 = class245.field3884;
            int[] var4 = new int[] { field638 };
            var3.glDeleteTextures(1, var4, 0);
            field638 = -1;
            class173.field2704 -= field641.limit() * 2;
        }
        if (field637 != null) {
            GL var5 = class245.field3884;
            var5.glDeleteTextures(64, field637, 0);
            field637 = null;
            class173.field2704 -= field641.limit() * 2;
        }
    }
}
