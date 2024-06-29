import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class182 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Z")
    public boolean field2625 = true;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    private int field2624 = -1;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    private int field2626;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[B")
    private static byte[] field2620 = new byte[16384];

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lch;")
    private class115 field2621;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Lch;")
    private class115 field2622;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2623;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2627;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([[III)V", line = 7)
    public final void method1261(int[][] arg0, int arg1, int arg2) {
        class190 var4 = new class190(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class141.field2056) {
                    var4.method1328((byte) 78, (float) var6 / 8.0F);
                    var4.method1328((byte) 101, (float) var5 / 8.0F);
                    var4.method1328((byte) 59, (float) (var6 * 128));
                    var4.method1328((byte) 62, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1328((byte) 121, (float) (var5 * 128));
                } else {
                    var4.method1318((float) var6 / 8.0F, (byte) -39);
                    var4.method1318((float) var5 / 8.0F, (byte) -39);
                    var4.method1318((float) (var6 * 128), (byte) -39);
                    var4.method1318((float) arg0[arg1 + var6][arg2 + var5], (byte) -39);
                    var4.method1318((float) (var5 * 128), (byte) -39);
                }
            }
        }
        if (class141.field2032) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field2718, 0, var4.field2776);
            this.field2621 = new class115();
            this.field2621.method864(var7);
        } else {
            this.field2623 = ByteBuffer.allocateDirect(var4.field2776).order(ByteOrder.nativeOrder());
            this.field2623.put(var4.field2718, 0, var4.field2776);
            this.field2623.flip();
        }
        class190 var8 = new class190(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class141.field2056) {
                    var8.method1354((var9 + 1) * 9 + var10, (byte) 121);
                    var8.method1354(var9 * 9 + var10, (byte) 120);
                    var8.method1354(var9 * 9 + var10 + 1, (byte) 125);
                    var8.method1354((var9 + 1) * 9 + var10, (byte) -53);
                    var8.method1354(var9 * 9 + var10 + 1, (byte) 114);
                    var8.method1354((var9 + 1) * 9 + var10 + 1, (byte) -8);
                } else {
                    var8.method1335((var9 + 1) * 9 + var10, 840118768);
                    var8.method1335(var9 * 9 + var10, 840118768);
                    var8.method1335(var9 * 9 + var10 + 1, 840118768);
                    var8.method1335((var9 + 1) * 9 + var10, 840118768);
                    var8.method1335(var9 * 9 + var10 + 1, 840118768);
                    var8.method1335((var9 + 1) * 9 + var10 + 1, 840118768);
                }
            }
        }
        if (class141.field2032) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field2718, 0, var8.field2776);
            this.field2622 = new class115();
            this.field2622.method860(var11);
        } else {
            this.field2627 = ByteBuffer.allocateDirect(var8.field2776).order(ByteOrder.nativeOrder());
            this.field2627.put(var8.field2718, 0, var8.field2776);
            this.field2627.flip();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V", line = 112)
    public final void method1262() {
        GL var1 = class141.field2025;
        class141.method1000(this.field2626);
        if (this.field2621 == null) {
            if (class141.field2032) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2623);
            class141.field2051 = false;
        } else {
            this.field2621.method861();
            var1.glInterleavedArrays(10791, 20, 0L);
            class141.field2051 = false;
        }
        if (this.field2622 == null) {
            if (class141.field2032) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2627);
        } else {
            this.field2622.method863();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lwi;II)Z", line = 148)
    public final boolean method1263(class234 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field3528;
        int var5 = arg0.field3715;
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
        if (this.field2624 == var7) {
            return false;
        }
        this.field2624 = var7;
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
                    field2620[var11++] = (byte) (var14 * 17);
                } else {
                    field2620[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class141.field2025;
        ByteBuffer var16 = ByteBuffer.wrap(field2620);
        var16.limit(16384);
        class141.method1000(this.field2626);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()V", line = 233)
    public static void method1264() {
        field2620 = null;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V", line = 245)
    public class182() {
        GL var1 = class141.field2025;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2626 = var2[0];
        class305.field4570 += 16384;
        class141.method1000(this.field2626);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
