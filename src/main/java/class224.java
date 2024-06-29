import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class224 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[I")
    public static int[] field3694 = null;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3695 = -1;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3697 = -1;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "[I")
    public static int[] field3699 = null;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3696;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3698;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Z")
    public static boolean field3693;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()V", line = 7)
    private static final void method1588() {
        GL var0 = class45.field688;
        if (field3693) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3696.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field3696);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3697 = var1[0];
            class36.field574 += field3696.limit() * 2;
            return;
        }
        field3694 = new int[64];
        var0.glGenTextures(64, field3694, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class45.method321(field3694[var2]);
            field3696.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3696);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class36.field574 += field3696.limit() * 2;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "()V", line = 43)
    public static final void method1589() {
        field3693 = class45.field690;
        if (field3696 == null) {
            class94 var0 = new class94();
            byte[] var1;
            if (field3693) {
                var1 = var0.method611(128, 128, 32);
            } else {
                var1 = var0.method611(64, 64, 64);
            }
            field3696 = ByteBuffer.allocateDirect(var1.length);
            field3696.position(0);
            field3696.put(var1);
            field3696.flip();
        }
        if (field3698 == null) {
            class143 var2 = new class143();
            byte[] var3;
            if (field3693) {
                var3 = var2.method912(128, 128, 32);
            } else {
                var3 = var2.method912(64, 64, 64);
            }
            field3698 = ByteBuffer.allocateDirect(var3.length);
            field3698.position(0);
            field3698.put(var3);
            field3698.flip();
        }
        method1588();
        method1590();
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "()V", line = 81)
    private static final void method1590() {
        GL var0 = class45.field688;
        if (field3693) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3698.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field3698);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3695 = var1[0];
            class36.field574 += field3698.limit() * 2;
            return;
        }
        field3699 = new int[64];
        var0.glGenTextures(64, field3699, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class45.method321(field3699[var2]);
            field3698.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3698);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class36.field574 += field3698.limit() * 2;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "()V", line = 119)
    public static void method1591() {
        field3694 = null;
        field3699 = null;
        field3696 = null;
        field3698 = null;
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "()V", line = 128)
    public static final void method1592() {
        if (field3697 != -1) {
            GL var0 = class45.field688;
            int[] var1 = new int[] { field3697 };
            var0.glDeleteTextures(1, var1, 0);
            field3697 = -1;
            class36.field574 -= field3696.limit() * 2;
        }
        if (field3694 != null) {
            GL var2 = class45.field688;
            var2.glDeleteTextures(64, field3694, 0);
            field3694 = null;
            class36.field574 -= field3696.limit() * 2;
        }
        if (field3695 != -1) {
            GL var3 = class45.field688;
            int[] var4 = new int[] { field3695 };
            var3.glDeleteTextures(1, var4, 0);
            field3695 = -1;
            class36.field574 -= field3698.limit() * 2;
        }
        if (field3699 != null) {
            GL var5 = class45.field688;
            var5.glDeleteTextures(64, field3699, 0);
            field3699 = null;
            class36.field574 -= field3698.limit() * 2;
        }
    }
}
