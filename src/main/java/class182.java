import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class182 {

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    private int field2786 = -1;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Z")
    public boolean field2785 = true;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    private int field2787;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[B")
    private static byte[] field2789 = new byte[16384];

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Lpc;")
    private class216 field2788;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lpc;")
    private class216 field2790;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2784;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2791;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "()V", line = 7)
    public final void method1256() {
        GL var1 = class333.field5160;
        class333.method2282(this.field2787);
        if (this.field2790 == null) {
            if (class333.field5188) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2784);
            class333.field5186 = false;
        } else {
            this.field2790.method1446();
            var1.glInterleavedArrays(10791, 20, 0L);
            class333.field5186 = false;
        }
        if (this.field2788 == null) {
            if (class333.field5188) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2791);
        } else {
            this.field2788.method1444();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([[III)V", line = 42)
    public final void method1257(int[][] arg0, int arg1, int arg2) {
        class303 var4 = new class303(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class333.field5170) {
                    var4.method2046((float) var6 / 8.0F, 0);
                    var4.method2046((float) var5 / 8.0F, 0);
                    var4.method2046((float) (var6 * 128), 0);
                    var4.method2046((float) arg0[arg1 + var6][arg2 + var5], 0);
                    var4.method2046((float) (var5 * 128), 0);
                } else {
                    var4.method2056(126, (float) var6 / 8.0F);
                    var4.method2056(125, (float) var5 / 8.0F);
                    var4.method2056(125, (float) (var6 * 128));
                    var4.method2056(107, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method2056(116, (float) (var5 * 128));
                }
            }
        }
        if (class333.field5188) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field4716, 0, var4.field4679);
            this.field2790 = new class216();
            this.field2790.method1442(var7);
        } else {
            this.field2784 = ByteBuffer.allocateDirect(var4.field4679).order(ByteOrder.nativeOrder());
            this.field2784.put(var4.field4716, 0, var4.field4679);
            this.field2784.flip();
        }
        class303 var8 = new class303(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class333.field5170) {
                    var8.method2013((var9 + 1) * 9 + var10, -66);
                    var8.method2013(var9 * 9 + var10, -67);
                    var8.method2013(var9 * 9 + var10 + 1, -54);
                    var8.method2013((var9 + 1) * 9 + var10, -52);
                    var8.method2013(var9 * 9 + var10 + 1, -77);
                    var8.method2013((var9 + 1) * 9 + var10 + 1, -85);
                } else {
                    var8.method1993((byte) 7, (var9 + 1) * 9 + var10);
                    var8.method1993((byte) 7, var9 * 9 + var10);
                    var8.method1993((byte) 7, var9 * 9 + var10 + 1);
                    var8.method1993((byte) 7, (var9 + 1) * 9 + var10);
                    var8.method1993((byte) 7, var9 * 9 + var10 + 1);
                    var8.method1993((byte) 7, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class333.field5188) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field4716, 0, var8.field4679);
            this.field2788 = new class216();
            this.field2788.method1445(var11);
        } else {
            this.field2791 = ByteBuffer.allocateDirect(var8.field4679).order(ByteOrder.nativeOrder());
            this.field2791.put(var8.field4716, 0, var8.field4679);
            this.field2791.flip();
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V", line = 245)
    public class182() {
        GL var1 = class333.field5160;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2787 = var2[0];
        class301.field4648 += 16384;
        class333.method2282(this.field2787);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lbd;II)Z", line = 149)
    public final boolean method1258(class20 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field268;
        int var5 = arg0.field1166;
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
        if (this.field2786 == var7) {
            return false;
        }
        this.field2786 = var7;
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
                    field2789[var11++] = (byte) (var14 * 17);
                } else {
                    field2789[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class333.field5160;
        ByteBuffer var16 = ByteBuffer.wrap(field2789);
        var16.limit(16384);
        class333.method2282(this.field2787);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "()V", line = 237)
    public static void method1259() {
        field2789 = null;
    }
}
