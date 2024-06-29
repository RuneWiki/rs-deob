import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class57 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field728 = -1;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "[I")
    public static int[] field734 = null;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "[I")
    public static int[] field729 = null;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field731 = -1;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field730;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field733;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Z")
    public static boolean field732;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()V", line = 13)
    public static void method428() {
        field729 = null;
        field734 = null;
        field733 = null;
        field730 = null;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()V", line = 22)
    public static final void method429() {
        field732 = class47.field620;
        method433();
        method430();
        method431();
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()V", line = 29)
    private static final void method430() {
        GL var0 = class47.field592;
        if (field732) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field733.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field733);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field731 = var1[0];
            class298.field4318 += field733.limit() * 2;
            return;
        }
        field729 = new int[64];
        var0.glGenTextures(64, field729, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class47.method357(field729[var2]);
            field733.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field733);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class298.field4318 += field733.limit() * 2;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "()V", line = 68)
    private static final void method431() {
        GL var0 = class47.field592;
        if (field732) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field730.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field730);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field728 = var1[0];
            class298.field4318 += field730.limit() * 2;
            return;
        }
        field734 = new int[64];
        var0.glGenTextures(64, field734, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class47.method357(field734[var2]);
            field730.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field730);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class298.field4318 += field730.limit() * 2;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "()V", line = 111)
    public static final void method432() {
        if (field731 != -1) {
            GL var0 = class47.field592;
            int[] var1 = new int[] { field731 };
            var0.glDeleteTextures(1, var1, 0);
            field731 = -1;
            class298.field4318 -= field733.limit() * 2;
        }
        if (field729 != null) {
            GL var2 = class47.field592;
            var2.glDeleteTextures(64, field729, 0);
            field729 = null;
            class298.field4318 -= field733.limit() * 2;
        }
        if (field728 != -1) {
            GL var3 = class47.field592;
            int[] var4 = new int[] { field728 };
            var3.glDeleteTextures(1, var4, 0);
            field728 = -1;
            class298.field4318 -= field730.limit() * 2;
        }
        if (field734 != null) {
            GL var5 = class47.field592;
            var5.glDeleteTextures(64, field734, 0);
            field734 = null;
            class298.field4318 -= field730.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "()V", line = 160)
    public static final void method433() {
        if (field733 == null) {
            class147 var0 = new class147();
            byte[] var1 = var0.method1135(64, 64, 64);
            field733 = ByteBuffer.allocateDirect(var1.length);
            field733.position(0);
            field733.put(var1);
            field733.flip();
        }
        if (field730 != null) {
            return;
        }
        class79 var2 = new class79();
        byte[] var3 = var2.method561(64, 64, 64);
        field730 = ByteBuffer.allocateDirect(var3.length);
        field730.position(0);
        field730.put(var3);
        field730.flip();
    }
}
