import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class40 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field614 = -1;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "[I")
    public static int[] field613 = null;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field617 = -1;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "[I")
    public static int[] field618 = null;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field612;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field615;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Z")
    public static boolean field616;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "()V", line = 7)
    public static final void method271() {
        field616 = class154.field2473;
        if (field615 == null) {
            class305 var0 = new class305();
            byte[] var1;
            if (field616) {
                var1 = var0.method2086(128, 128, 32);
            } else {
                var1 = var0.method2086(64, 64, 64);
            }
            field615 = ByteBuffer.allocateDirect(var1.length);
            field615.position(0);
            field615.put(var1);
            field615.flip();
        }
        if (field612 == null) {
            class172 var2 = new class172();
            byte[] var3;
            if (field616) {
                var3 = var2.method1232(128, 128, 32);
            } else {
                var3 = var2.method1232(64, 64, 64);
            }
            field612 = ByteBuffer.allocateDirect(var3.length);
            field612.position(0);
            field612.put(var3);
            field612.flip();
        }
        method275();
        method273();
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "()V", line = 44)
    public static void method272() {
        field613 = null;
        field618 = null;
        field615 = null;
        field612 = null;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "()V", line = 51)
    private static final void method273() {
        GL var0 = class154.field2479;
        if (field616) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field612.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field612);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field614 = var1[0];
            class79.field1326 += field612.limit() * 2;
            return;
        }
        field618 = new int[64];
        var0.glGenTextures(64, field618, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class154.method1141(field618[var2]);
            field612.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field612);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class79.field1326 += field612.limit() * 2;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "()V", line = 96)
    public static final void method274() {
        if (field617 != -1) {
            GL var0 = class154.field2479;
            int[] var1 = new int[] { field617 };
            var0.glDeleteTextures(1, var1, 0);
            field617 = -1;
            class79.field1326 -= field615.limit() * 2;
        }
        if (field613 != null) {
            GL var2 = class154.field2479;
            var2.glDeleteTextures(64, field613, 0);
            field613 = null;
            class79.field1326 -= field615.limit() * 2;
        }
        if (field614 != -1) {
            GL var3 = class154.field2479;
            int[] var4 = new int[] { field614 };
            var3.glDeleteTextures(1, var4, 0);
            field614 = -1;
            class79.field1326 -= field612.limit() * 2;
        }
        if (field618 != null) {
            GL var5 = class154.field2479;
            var5.glDeleteTextures(64, field618, 0);
            field618 = null;
            class79.field1326 -= field612.limit() * 2;
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "()V", line = 145)
    private static final void method275() {
        GL var0 = class154.field2479;
        if (field616) {
            int[] var1 = new int[1];
            var0.glGenTextures(1, var1, 0);
            var0.glBindTexture(32879, var1[0]);
            field615.position(0);
            var0.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, field615);
            var0.glTexParameteri(32879, 10241, 9729);
            var0.glTexParameteri(32879, 10240, 9729);
            field617 = var1[0];
            class79.field1326 += field615.limit() * 2;
            return;
        }
        field613 = new int[64];
        var0.glGenTextures(64, field613, 0);
        for (int var2 = 0; var2 < 64; var2++) {
            class154.method1141(field613[var2]);
            field615.position(var2 * 64 * 64 * 2);
            var0.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, field615);
            var0.glTexParameteri(3553, 10241, 9729);
            var0.glTexParameteri(3553, 10240, 9729);
        }
        class79.field1326 += field615.limit() * 2;
    }
}
