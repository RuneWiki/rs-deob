import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class218 {

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    private int field3691 = -1;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Z")
    public boolean field3693 = true;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    private int field3692;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[B")
    private static byte[] field3694 = new byte[16384];

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Ln;")
    private class268 field3690;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Ln;")
    private class268 field3696;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3689;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3695;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V", line = 7)
    public static void method1434() {
        field3694 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lqb;II)Z", line = 12)
    public final boolean method1435(class95 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field1596;
        int var5 = arg0.field1464;
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
        if (this.field3691 == var7) {
            return false;
        }
        this.field3691 = var7;
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
                    field3694[var11++] = (byte) (var14 * 17);
                } else {
                    field3694[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class167.field2806;
        ByteBuffer var16 = ByteBuffer.wrap(field3694);
        var16.limit(16384);
        class167.method1033(this.field3692);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([[III)V", line = 100)
    public final void method1436(int[][] arg0, int arg1, int arg2) {
        class229 var4 = new class229(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class167.field2795) {
                    var4.method1519((float) var6 / 8.0F, -1161532440);
                    var4.method1519((float) var5 / 8.0F, -1161532440);
                    var4.method1519((float) (var6 * 128), -1161532440);
                    var4.method1519((float) arg0[arg1 + var6][arg2 + var5], -1161532440);
                    var4.method1519((float) (var5 * 128), -1161532440);
                } else {
                    var4.method1531((byte) 58, (float) var6 / 8.0F);
                    var4.method1531((byte) 58, (float) var5 / 8.0F);
                    var4.method1531((byte) 58, (float) (var6 * 128));
                    var4.method1531((byte) 58, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1531((byte) 58, (float) (var5 * 128));
                }
            }
        }
        if (class167.field2792) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field3879, 0, var4.field3905);
            this.field3696 = new class268();
            this.field3696.method1806(var7);
        } else {
            this.field3695 = ByteBuffer.allocateDirect(var4.field3905).order(ByteOrder.nativeOrder());
            this.field3695.put(var4.field3879, 0, var4.field3905);
            this.field3695.flip();
        }
        class229 var8 = new class229(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class167.field2795) {
                    var8.method1515((var9 + 1) * 9 + var10, 87);
                    var8.method1515(var9 * 9 + var10, 120);
                    var8.method1515(var9 * 9 + var10 + 1, 69);
                    var8.method1515((var9 + 1) * 9 + var10, 68);
                    var8.method1515(var9 * 9 + var10 + 1, 90);
                    var8.method1515((var9 + 1) * 9 + var10 + 1, 123);
                } else {
                    var8.method1517(113, (var9 + 1) * 9 + var10);
                    var8.method1517(88, var9 * 9 + var10);
                    var8.method1517(90, var9 * 9 + var10 + 1);
                    var8.method1517(84, (var9 + 1) * 9 + var10);
                    var8.method1517(90, var9 * 9 + var10 + 1);
                    var8.method1517(81, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class167.field2792) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field3879, 0, var8.field3905);
            this.field3690 = new class268();
            this.field3690.method1804(var11);
        } else {
            this.field3689 = ByteBuffer.allocateDirect(var8.field3905).order(ByteOrder.nativeOrder());
            this.field3689.put(var8.field3879, 0, var8.field3905);
            this.field3689.flip();
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 245)
    public class218() {
        GL var1 = class167.field2806;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3692 = var2[0];
        class101.field1720 += 16384;
        class167.method1033(this.field3692);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()V", line = 212)
    public final void method1437() {
        GL var1 = class167.field2806;
        class167.method1033(this.field3692);
        if (this.field3696 == null) {
            if (class167.field2792) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field3695);
            class167.field2778 = false;
        } else {
            this.field3696.method1803();
            var1.glInterleavedArrays(10791, 20, 0L);
            class167.field2778 = false;
        }
        if (this.field3690 == null) {
            if (class167.field2792) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3689);
        } else {
            this.field3690.method1807();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }
}
