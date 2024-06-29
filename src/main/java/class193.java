import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class193 {

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    private int field3480 = -1;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Z")
    public boolean field3477 = true;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    private int field3478;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "[B")
    private static byte[] field3481 = new byte[16384];

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lmk;")
    private class288 field3475;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Lmk;")
    private class288 field3482;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3476;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3479;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V", line = 8)
    public final void method1453() {
        GL var1 = class97.field1801;
        class97.method803(this.field3478);
        if (this.field3482 == null) {
            if (class97.field1814) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field3479);
            class97.field1834 = false;
        } else {
            this.field3482.method2058();
            var1.glInterleavedArrays(10791, 20, 0L);
            class97.field1834 = false;
        }
        if (this.field3475 == null) {
            if (class97.field1814) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3476);
        } else {
            this.field3475.method2056();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lg;II)Z", line = 42)
    public final boolean method1454(class158 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field2891;
        int var5 = arg0.field1041;
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
        if (this.field3480 == var7) {
            return false;
        }
        this.field3480 = var7;
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
                    field3481[var11++] = (byte) (var14 * 17);
                } else {
                    field3481[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class97.field1801;
        ByteBuffer var16 = ByteBuffer.wrap(field3481);
        var16.limit(16384);
        class97.method803(this.field3478);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([[III)V", line = 130)
    public final void method1455(int[][] arg0, int arg1, int arg2) {
        class53 var4 = new class53(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class97.field1808) {
                    var4.method451((byte) -110, (float) var6 / 8.0F);
                    var4.method451((byte) 88, (float) var5 / 8.0F);
                    var4.method451((byte) 50, (float) (var6 * 128));
                    var4.method451((byte) 16, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method451((byte) -105, (float) (var5 * 128));
                } else {
                    var4.method459(false, (float) var6 / 8.0F);
                    var4.method459(false, (float) var5 / 8.0F);
                    var4.method459(false, (float) (var6 * 128));
                    var4.method459(false, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method459(false, (float) (var5 * 128));
                }
            }
        }
        if (class97.field1814) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field1168, 0, var4.field1142);
            this.field3482 = new class288();
            this.field3482.method2055(var7);
        } else {
            this.field3479 = ByteBuffer.allocateDirect(var4.field1142).order(ByteOrder.nativeOrder());
            this.field3479.put(var4.field1168, 0, var4.field1142);
            this.field3479.flip();
        }
        class53 var8 = new class53(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class97.field1808) {
                    var8.method444((byte) 46, (var9 + 1) * 9 + var10);
                    var8.method444((byte) 46, var9 * 9 + var10);
                    var8.method444((byte) 46, var9 * 9 + var10 + 1);
                    var8.method444((byte) 46, (var9 + 1) * 9 + var10);
                    var8.method444((byte) 46, var9 * 9 + var10 + 1);
                    var8.method444((byte) 46, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method484((byte) -61, (var9 + 1) * 9 + var10);
                    var8.method484((byte) -81, var9 * 9 + var10);
                    var8.method484((byte) -77, var9 * 9 + var10 + 1);
                    var8.method484((byte) -65, (var9 + 1) * 9 + var10);
                    var8.method484((byte) -64, var9 * 9 + var10 + 1);
                    var8.method484((byte) -93, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class97.field1814) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field1168, 0, var8.field1142);
            this.field3475 = new class288();
            this.field3475.method2054(var11);
        } else {
            this.field3476 = ByteBuffer.allocateDirect(var8.field1142).order(ByteOrder.nativeOrder());
            this.field3476.put(var8.field1168, 0, var8.field1142);
            this.field3476.flip();
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 245)
    public class193() {
        GL var1 = class97.field1801;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3478 = var2[0];
        class308.field5471 += 16384;
        class97.method803(this.field3478);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()V", line = 235)
    public static void method1456() {
        field3481 = null;
    }
}
