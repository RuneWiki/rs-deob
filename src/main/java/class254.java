import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class254 {

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Z")
    public boolean field4047 = true;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    private int field4045 = -1;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    private int field4043;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[B")
    private static byte[] field4048 = new byte[16384];

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lfd;")
    private class306 field4044;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lfd;")
    private class306 field4050;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4046;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4049;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V", line = 7)
    public final void method1824() {
        GL var1 = class232.field3716;
        class232.method1662(this.field4043);
        if (this.field4050 == null) {
            if (class232.field3700) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field4049);
            class232.field3689 = false;
        } else {
            this.field4050.method2177();
            var1.glInterleavedArrays(10791, 20, 0L);
            class232.field3689 = false;
        }
        if (this.field4044 == null) {
            if (class232.field3700) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field4046);
        } else {
            this.field4044.method2173();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([[III)V", line = 42)
    public final void method1825(int[][] arg0, int arg1, int arg2) {
        class44 var4 = new class44(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class232.field3718) {
                    var4.method230(-124, (float) var6 / 8.0F);
                    var4.method230(-121, (float) var5 / 8.0F);
                    var4.method230(-128, (float) (var6 * 128));
                    var4.method230(-124, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method230(-125, (float) (var5 * 128));
                } else {
                    var4.method252(7284, (float) var6 / 8.0F);
                    var4.method252(7284, (float) var5 / 8.0F);
                    var4.method252(7284, (float) (var6 * 128));
                    var4.method252(7284, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method252(7284, (float) (var5 * 128));
                }
            }
        }
        if (class232.field3700) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field573, 0, var4.field586);
            this.field4050 = new class306();
            this.field4050.method2175(var7);
        } else {
            this.field4049 = ByteBuffer.allocateDirect(var4.field586).order(ByteOrder.nativeOrder());
            this.field4049.put(var4.field573, 0, var4.field586);
            this.field4049.flip();
        }
        class44 var8 = new class44(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class232.field3718) {
                    var8.method283((byte) -51, (var9 + 1) * 9 + var10);
                    var8.method283((byte) -51, var9 * 9 + var10);
                    var8.method283((byte) -51, var9 * 9 + var10 + 1);
                    var8.method283((byte) -51, (var9 + 1) * 9 + var10);
                    var8.method283((byte) -51, var9 * 9 + var10 + 1);
                    var8.method283((byte) -51, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method258((var9 + 1) * 9 + var10, (byte) 40);
                    var8.method258(var9 * 9 + var10, (byte) 40);
                    var8.method258(var9 * 9 + var10 + 1, (byte) 40);
                    var8.method258((var9 + 1) * 9 + var10, (byte) 40);
                    var8.method258(var9 * 9 + var10 + 1, (byte) 40);
                    var8.method258((var9 + 1) * 9 + var10 + 1, (byte) 40);
                }
            }
        }
        if (class232.field3700) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field573, 0, var8.field586);
            this.field4044 = new class306();
            this.field4044.method2174(var11);
        } else {
            this.field4046 = ByteBuffer.allocateDirect(var8.field586).order(ByteOrder.nativeOrder());
            this.field4046.put(var8.field573, 0, var8.field586);
            this.field4046.flip();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lrg;II)Z", line = 145)
    public final boolean method1826(class326 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field5044;
        int var5 = arg0.field4163;
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
        if (this.field4045 == var7) {
            return false;
        }
        this.field4045 = var7;
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
                    field4048[var11++] = (byte) (var14 * 17);
                } else {
                    field4048[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class232.field3716;
        ByteBuffer var16 = ByteBuffer.wrap(field4048);
        var16.limit(16384);
        class232.method1662(this.field4043);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()V", line = 231)
    public static void method1827() {
        field4048 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 245)
    public class254() {
        GL var1 = class232.field3716;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field4043 = var2[0];
        class230.field3663 += 16384;
        class232.method1662(this.field4043);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
