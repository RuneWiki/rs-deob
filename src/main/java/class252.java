import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class252 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "[I")
    public static int[] field3710 = null;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field3712 = -1;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "[I")
    public static int[] field3713 = null;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field3714 = -1;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3711;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3715;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Z")
    public static boolean field3709;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "()V", line = 5)
    public static final void method1743() {
        field3709 = class162.field2643;
        method1748();
        method1747();
        method1746();
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "()V", line = 11)
    public static void method1744() {
        field3713 = null;
        field3710 = null;
        field3715 = null;
        field3711 = null;
    }

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "()V", line = 30)
    public static final void method1745() {
        if (field3712 != -1) {
            GL var0 = class162.field2654;
            int[] var1 = new int[] { field3712 };
            var0.glDeleteTextures(1, var1, 0);
            field3712 = -1;
            class177.field2820 -= field3715.limit() * 2;
        }
        if (field3713 != null) {
            GL var2 = class162.field2654;
            var2.glDeleteTextures(64, field3713, 0);
            field3713 = null;
            class177.field2820 -= field3715.limit() * 2;
        }
        if (field3714 != -1) {
            GL var3 = class162.field2654;
            int[] var4 = new int[] { field3714 };
            var3.glDeleteTextures(1, var4, 0);
            field3714 = -1;
            class177.field2820 -= field3711.limit() * 2;
        }
        if (field3710 != null) {
            GL var5 = class162.field2654;
            var5.glDeleteTextures(64, field3710, 0);
            field3710 = null;
            class177.field2820 -= field3711.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "()V", line = 73)
    private static final void method1746() {
        GL var0 = class162.field2654;
        if (field3709) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3711.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3711);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3714 = var1[0];
            class177.field2820 += field3711.limit() * 2;
            return;
        }
        field3710 = new int[64];
        var0.glGenTextures(64, field3710, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class162.method1219(field3710[var2]);
            field3711.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3711);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class177.field2820 += field3711.limit() * 2;
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "()V", line = 114)
    private static final void method1747() {
        GL var0 = class162.field2654;
        if (field3709) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field3715.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field3715);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field3712 = var1[0];
            class177.field2820 += field3715.limit() * 2;
            return;
        }
        field3713 = new int[64];
        var0.glGenTextures(64, field3713, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class162.method1219(field3713[var2]);
            field3715.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field3715);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class177.field2820 += field3715.limit() * 2;
    }

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "()V", line = 152)
    public static final void method1748() {
        if (field3715 == null) {
            class283 var0 = new class283();
            byte[] var1 = var0.method1986(64, 64, 64);
            field3715 = ByteBuffer.allocateDirect(var1.length);
            field3715.position(0);
            field3715.put(var1);
            field3715.flip();
        }
        if (field3711 != null) {
            return;
        }
        class254 var2 = new class254();
        byte[] var3 = var2.method1758(64, 64, 64);
        field3711 = ByteBuffer.allocateDirect(var3.length);
        field3711.position(0);
        field3711.put(var3);
        field3711.flip();
    }
}
