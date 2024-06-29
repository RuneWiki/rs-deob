import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class219 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Z")
    public boolean field3651 = true;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    private int field3654 = -1;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    private int field3652;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[B")
    private static byte[] field3656 = new byte[16384];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lt;")
    private class245 field3650;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lt;")
    private class245 field3653;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3655;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3657;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V", line = 8)
    public final void method1536() {
        GL var1 = class21.field377;
        class21.method140(this.field3652);
        if (this.field3650 == null) {
            if (class21.field367) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field3655);
            class21.field360 = false;
        } else {
            this.field3650.method1738();
            var1.glInterleavedArrays(10791, 20, 0L);
            class21.field360 = false;
        }
        if (this.field3653 == null) {
            if (class21.field367) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3657);
        } else {
            this.field3653.method1734();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()V", line = 42)
    public static void method1537() {
        field3656 = null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 245)
    public class219() {
        GL var1 = class21.field377;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3652 = var2[0];
        class136.field2303 += 16384;
        class21.method140(this.field3652);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lda;II)Z", line = 55)
    public final boolean method1538(class114 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field1976;
        int var5 = arg0.field4116;
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
        if (this.field3654 == var7) {
            return false;
        }
        this.field3654 = var7;
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
                    field3656[var11++] = (byte) (var14 * 17);
                } else {
                    field3656[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class21.field377;
        ByteBuffer var16 = ByteBuffer.wrap(field3656);
        var16.limit(16384);
        class21.method140(this.field3652);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([[III)V", line = 145)
    public final void method1539(int[][] arg0, int arg1, int arg2) {
        class26 var4 = new class26(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class21.field349) {
                    var4.method227((float) var6 / 8.0F, 73);
                    var4.method227((float) var5 / 8.0F, -89);
                    var4.method227((float) (var6 * 128), 86);
                    var4.method227((float) arg0[arg1 + var6][arg2 + var5], -94);
                    var4.method227((float) (var5 * 128), -113);
                } else {
                    var4.method214(127, (float) var6 / 8.0F);
                    var4.method214(123, (float) var5 / 8.0F);
                    var4.method214(127, (float) (var6 * 128));
                    var4.method214(124, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method214(125, (float) (var5 * 128));
                }
            }
        }
        if (class21.field367) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field472, 0, var4.field478);
            this.field3650 = new class245();
            this.field3650.method1736(var7);
        } else {
            this.field3655 = ByteBuffer.allocateDirect(var4.field478).order(ByteOrder.nativeOrder());
            this.field3655.put(var4.field472, 0, var4.field478);
            this.field3655.flip();
        }
        class26 var8 = new class26(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class21.field349) {
                    var8.method239((byte) 95, (var9 + 1) * 9 + var10);
                    var8.method239((byte) 117, var9 * 9 + var10);
                    var8.method239((byte) 94, var9 * 9 + var10 + 1);
                    var8.method239((byte) 121, (var9 + 1) * 9 + var10);
                    var8.method239((byte) 98, var9 * 9 + var10 + 1);
                    var8.method239((byte) -32, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method248((byte) 117, (var9 + 1) * 9 + var10);
                    var8.method248((byte) 118, var9 * 9 + var10);
                    var8.method248((byte) 121, var9 * 9 + var10 + 1);
                    var8.method248((byte) 119, (var9 + 1) * 9 + var10);
                    var8.method248((byte) 117, var9 * 9 + var10 + 1);
                    var8.method248((byte) 111, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class21.field367) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field472, 0, var8.field478);
            this.field3653 = new class245();
            this.field3653.method1737(var11);
        } else {
            this.field3657 = ByteBuffer.allocateDirect(var8.field478).order(ByteOrder.nativeOrder());
            this.field3657.put(var8.field472, 0, var8.field478);
            this.field3657.flip();
        }
    }
}
