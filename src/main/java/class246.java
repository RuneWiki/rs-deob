import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class246 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Z")
    public boolean field4262 = true;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    private int field4264 = -1;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    private int field4261;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "[B")
    private static byte[] field4267 = new byte[16384];

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "Lej;")
    private class46 field4263;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Lej;")
    private class46 field4268;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4265;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4266;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()V", line = 7)
    public static void method1759() {
        field4267 = null;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()V", line = 16)
    public final void method1760() {
        GL var1 = class147.field2479;
        class147.method1002(this.field4261);
        if (this.field4268 == null) {
            if (class147.field2510) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field4265);
            class147.field2493 = false;
        } else {
            this.field4268.method337();
            var1.glInterleavedArrays(10791, 20, 0L);
            class147.field2493 = false;
        }
        if (this.field4263 == null) {
            if (class147.field2510) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field4266);
        } else {
            this.field4263.method335();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 245)
    public class246() {
        GL var1 = class147.field2479;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field4261 = var2[0];
        class6.field50 += 16384;
        class147.method1002(this.field4261);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "([[III)V", line = 54)
    public final void method1761(int[][] arg0, int arg1, int arg2) {
        class153 var4 = new class153(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class147.field2482) {
                    var4.method1047((float) var6 / 8.0F, -48);
                    var4.method1047((float) var5 / 8.0F, -91);
                    var4.method1047((float) (var6 * 128), -110);
                    var4.method1047((float) arg0[arg1 + var6][arg2 + var5], -103);
                    var4.method1047((float) (var5 * 128), -111);
                } else {
                    var4.method1081((float) var6 / 8.0F, true);
                    var4.method1081((float) var5 / 8.0F, true);
                    var4.method1081((float) (var6 * 128), true);
                    var4.method1081((float) arg0[arg1 + var6][arg2 + var5], true);
                    var4.method1081((float) (var5 * 128), true);
                }
            }
        }
        if (class147.field2510) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field2598, 0, var4.field2611);
            this.field4268 = new class46();
            this.field4268.method338(var7);
        } else {
            this.field4265 = ByteBuffer.allocateDirect(var4.field2611).order(ByteOrder.nativeOrder());
            this.field4265.put(var4.field2598, 0, var4.field2611);
            this.field4265.flip();
        }
        class153 var8 = new class153(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class147.field2482) {
                    var8.method1065(178808912, (var9 + 1) * 9 + var10);
                    var8.method1065(178808912, var9 * 9 + var10);
                    var8.method1065(178808912, var9 * 9 + var10 + 1);
                    var8.method1065(178808912, (var9 + 1) * 9 + var10);
                    var8.method1065(178808912, var9 * 9 + var10 + 1);
                    var8.method1065(178808912, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method1063((var9 + 1) * 9 + var10, 4);
                    var8.method1063(var9 * 9 + var10, 4);
                    var8.method1063(var9 * 9 + var10 + 1, 4);
                    var8.method1063((var9 + 1) * 9 + var10, 4);
                    var8.method1063(var9 * 9 + var10 + 1, 4);
                    var8.method1063((var9 + 1) * 9 + var10 + 1, 4);
                }
            }
        }
        if (class147.field2510) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field2598, 0, var8.field2611);
            this.field4263 = new class46();
            this.field4263.method336(var11);
        } else {
            this.field4266 = ByteBuffer.allocateDirect(var8.field2611).order(ByteOrder.nativeOrder());
            this.field4266.put(var8.field2598, 0, var8.field2611);
            this.field4266.flip();
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lti;II)Z", line = 159)
    public final boolean method1762(class186 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field3139;
        int var5 = arg0.field3711;
        int var6 = (arg2 * 128 + 1) * var5 + arg1 * 128 + 1;
        int var7 = 0;
        for (int var8 = -128; var8 < 0; var8++) {
            var7 = (var7 << 8) - var7;
            for (int var9 = -128; var9 < 0; var9++) {
                if (var4[var6++] != 0) {
                    var7++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4264 == var7) {
            return false;
        }
        this.field4264 = var7;
        int var10 = (arg2 * 128 + 1) * var5 + arg1 * 128 + 1;
        int var11 = 0;
        for (int var12 = -128; var12 < 0; var12++) {
            for (int var13 = -128; var13 < 0; var13++) {
                if (var4[var10] == 0) {
                    int var14 = 0;
                    if (var4[var10 - 1] != 0) {
                        var14++;
                    }
                    if (var4[var10 + 1] != 0) {
                        var14++;
                    }
                    if (var4[var10 - var5] != 0) {
                        var14++;
                    }
                    if (var4[var5 + var10] != 0) {
                        var14++;
                    }
                    field4267[var11++] = (byte) (var14 * 17);
                } else {
                    field4267[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class147.field2479;
        ByteBuffer var16 = ByteBuffer.wrap(field4267);
        var16.limit(16384);
        class147.method1002(this.field4261);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }
}
