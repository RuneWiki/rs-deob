import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class278 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field4764 = -1;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field4767 = -1;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "[I")
    public static int[] field4766 = null;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[I")
    public static int[] field4768 = null;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4765;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field4770;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "Z")
    public static boolean field4769;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V", line = 8)
    public static final void method1948() {
        if (field4767 != -1) {
            GL var0 = class55.field812;
            int[] var1 = new int[] { field4767 };
            var0.glDeleteTextures(1, var1, 0);
            field4767 = -1;
            class104.field1711 -= field4765.limit() * 2;
        }
        if (field4766 != null) {
            GL var2 = class55.field812;
            var2.glDeleteTextures(64, field4766, 0);
            field4766 = null;
            class104.field1711 -= field4765.limit() * 2;
        }
        if (field4764 != -1) {
            GL var3 = class55.field812;
            int[] var4 = new int[] { field4764 };
            var3.glDeleteTextures(1, var4, 0);
            field4764 = -1;
            class104.field1711 -= field4770.limit() * 2;
        }
        if (field4768 != null) {
            GL var5 = class55.field812;
            var5.glDeleteTextures(64, field4768, 0);
            field4768 = null;
            class104.field1711 -= field4770.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V", line = 50)
    public static final void method1949() {
        if (field4765 == null) {
            class106 var0 = new class106();
            byte[] var1 = var0.method800(64, 64, 64);
            field4765 = ByteBuffer.allocateDirect(var1.length);
            field4765.position(0);
            field4765.put(var1);
            field4765.flip();
        }
        if (field4770 != null) {
            return;
        }
        class48 var2 = new class48();
        byte[] var3 = var2.method353(64, 64, 64);
        field4770 = ByteBuffer.allocateDirect(var3.length);
        field4770.position(0);
        field4770.put(var3);
        field4770.flip();
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "()V", line = 78)
    private static final void method1950() {
        GL var0 = class55.field812;
        if (field4769) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field4770.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field4770);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field4764 = var1[0];
            class104.field1711 += field4770.limit() * 2;
            return;
        }
        field4768 = new int[64];
        var0.glGenTextures(64, field4768, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class55.method407(field4768[var2]);
            field4770.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field4770);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class104.field1711 += field4770.limit() * 2;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "()V", line = 114)
    public static void method1951() {
        field4766 = null;
        field4768 = null;
        field4765 = null;
        field4770 = null;
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "()V", line = 134)
    private static final void method1952() {
        GL var0 = class55.field812;
        if (field4769) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field4765.position(0);
            var0.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, field4765);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field4767 = var1[0];
            class104.field1711 += field4765.limit() * 2;
            return;
        }
        field4766 = new int[64];
        var0.glGenTextures(64, field4766, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class55.method407(field4766[var2]);
            field4765.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field4765);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class104.field1711 += field4765.limit() * 2;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "()V", line = 179)
    public static final void method1953() {
        field4769 = class55.field827;
        method1949();
        method1952();
        method1950();
    }
}
