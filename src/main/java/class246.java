import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class246 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
    public static int[] field3721 = null;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3722 = -1;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3724 = -1;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "[I")
    public static int[] field3726 = null;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3725;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3727;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Z")
    public static boolean field3723;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V", line = 7)
    public static final void method1768() {
        if (field3727 == null) {
            class302 var0 = new class302();
            byte[] var1 = var0.method2124(64, 64, 64);
            field3727 = ByteBuffer.allocateDirect(var1.length);
            field3727.position(0);
            field3727.put(var1);
            field3727.flip();
        }
        if (field3725 != null) {
            return;
        }
        class87 var2 = new class87();
        byte[] var3 = var2.method515(64, 64, 64);
        field3725 = ByteBuffer.allocateDirect(var3.length);
        field3725.position(0);
        field3725.put(var3);
        field3725.flip();
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "()V", line = 34)
    public static void method1769() {
        field3721 = null;
        field3726 = null;
        field3727 = null;
        field3725 = null;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "()V", line = 42)
    public static final void method1770() {
        if (field3724 != -1) {
            GL var0 = class250.field3818;
            int[] var1 = new int[] { field3724 };
            var0.glDeleteTextures(1, var1, 0);
            field3724 = -1;
            class266.field4196 -= field3727.limit() * 2;
        }
        if (field3721 != null) {
            GL var2 = class250.field3818;
            var2.glDeleteTextures(64, field3721, 0);
            field3721 = null;
            class266.field4196 -= field3727.limit() * 2;
        }
        if (field3722 != -1) {
            GL var3 = class250.field3818;
            int[] var4 = new int[] { field3722 };
            var3.glDeleteTextures(1, var4, 0);
            field3722 = -1;
            class266.field4196 -= field3725.limit() * 2;
        }
        if (field3726 != null) {
            GL var5 = class250.field3818;
            var5.glDeleteTextures(64, field3726, 0);
            field3726 = null;
            class266.field4196 -= field3725.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "()V", line = 90)
    private static final void method1771() {
        GL var0 = class250.field3818;
        if (field3723) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3727.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3727);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3724 = var1[0];
            class266.field4196 += field3727.limit() * 2;
            return;
        }
        field3721 = new int[64];
        var0.glGenTextures(64, field3721, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class250.method1806(field3721[var2]);
            field3727.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3727);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class266.field4196 += field3727.limit() * 2;
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "()V", line = 132)
    private static final void method1772() {
        GL var0 = class250.field3818;
        if (field3723) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3725.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3725);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3722 = var1[0];
            class266.field4196 += field3725.limit() * 2;
            return;
        }
        field3726 = new int[64];
        var0.glGenTextures(64, field3726, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class250.method1806(field3726[var2]);
            field3725.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3725);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class266.field4196 += field3725.limit() * 2;
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "()V", line = 177)
    public static final void method1773() {
        field3723 = class250.field3821;
        method1768();
        method1771();
        method1772();
    }
}
