import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class131 {

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    private int field2108 = -1;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Z")
    public boolean field2109 = true;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    private int field2110;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[B")
    private static byte[] field2111 = new byte[16384];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lll;")
    private class158 field2104;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lll;")
    private class158 field2106;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2105;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2107;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V", line = 6)
    public static void method997() {
        field2111 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lnb;II)Z", line = 12)
    public final boolean method998(class315 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field4925;
        int var5 = arg0.field4264;
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
        if (this.field2108 == var7) {
            return false;
        }
        this.field2108 = var7;
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
                    field2111[var11++] = (byte) (var14 * 17);
                } else {
                    field2111[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class265.field4099;
        ByteBuffer var16 = ByteBuffer.wrap(field2111);
        var16.limit(16384);
        class265.method1889(this.field2110);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 106)
    public class131() {
        GL var1 = class265.field4099;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2110 = var2[0];
        class214.field3410 += 16384;
        class265.method1889(this.field2110);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([[III)V", line = 126)
    public final void method999(int[][] arg0, int arg1, int arg2) {
        class101 var4 = new class101(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class265.field4109) {
                    var4.method744((float) var6 / 8.0F, (byte) -85);
                    var4.method744((float) var5 / 8.0F, (byte) -85);
                    var4.method744((float) (var6 * 128), (byte) -85);
                    var4.method744((float) arg0[arg1 + var6][arg2 + var5], (byte) -85);
                    var4.method744((float) (var5 * 128), (byte) -85);
                } else {
                    var4.method765(-1, (float) var6 / 8.0F);
                    var4.method765(-1, (float) var5 / 8.0F);
                    var4.method765(-1, (float) (var6 * 128));
                    var4.method765(-1, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method765(-1, (float) (var5 * 128));
                }
            }
        }
        if (class265.field4111) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field1661, 0, var4.field1667);
            this.field2106 = new class158();
            this.field2106.method1185(var7);
        } else {
            this.field2107 = ByteBuffer.allocateDirect(var4.field1667).order(ByteOrder.nativeOrder());
            this.field2107.put(var4.field1661, 0, var4.field1667);
            this.field2107.flip();
        }
        class101 var8 = new class101(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class265.field4109) {
                    var8.method784(76, (var9 + 1) * 9 + var10);
                    var8.method784(97, var9 * 9 + var10);
                    var8.method784(76, var9 * 9 + var10 + 1);
                    var8.method784(-73, (var9 + 1) * 9 + var10);
                    var8.method784(-74, var9 * 9 + var10 + 1);
                    var8.method784(109, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method725((var9 + 1) * 9 + var10, false);
                    var8.method725(var9 * 9 + var10, false);
                    var8.method725(var9 * 9 + var10 + 1, false);
                    var8.method725((var9 + 1) * 9 + var10, false);
                    var8.method725(var9 * 9 + var10 + 1, false);
                    var8.method725((var9 + 1) * 9 + var10 + 1, false);
                }
            }
        }
        if (class265.field4111) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field1661, 0, var8.field1667);
            this.field2104 = new class158();
            this.field2104.method1187(var11);
        } else {
            this.field2105 = ByteBuffer.allocateDirect(var8.field1667).order(ByteOrder.nativeOrder());
            this.field2105.put(var8.field1661, 0, var8.field1667);
            this.field2105.flip();
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()V", line = 228)
    public final void method1000() {
        GL var1 = class265.field4099;
        class265.method1889(this.field2110);
        if (this.field2106 == null) {
            if (class265.field4111) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2107);
            class265.field4108 = false;
        } else {
            this.field2106.method1184();
            var1.glInterleavedArrays(10791, 20, 0L);
            class265.field4108 = false;
        }
        if (this.field2104 == null) {
            if (class265.field4111) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2105);
        } else {
            this.field2104.method1186();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }
}
