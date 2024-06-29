import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class40 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    private int field565 = -1;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Z")
    public boolean field566 = true;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "[B")
    private static byte[] field571 = new byte[16384];

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lhk;")
    private class66 field568;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lhk;")
    private class66 field572;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field567;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field570;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V", line = 9)
    public final void method309() {
        GL var1 = class257.field4409;
        class257.method1736(this.field569);
        if (this.field568 == null) {
            if (class257.field4393) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field567);
            class257.field4406 = false;
        } else {
            this.field568.method506();
            var1.glInterleavedArrays(10791, 20, 0L);
            class257.field4406 = false;
        }
        if (this.field572 == null) {
            if (class257.field4393) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field570);
        } else {
            this.field572.method507();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()V", line = 41)
    public static void method310() {
        field571 = null;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 245)
    public class40() {
        GL var1 = class257.field4409;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field569 = var2[0];
        class196.field3442 += 16384;
        class257.method1736(this.field569);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([[III)V", line = 56)
    public final void method311(int[][] arg0, int arg1, int arg2) {
        class235 var4 = new class235(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class257.field4402) {
                    var4.method1579((float) var6 / 8.0F, -1890);
                    var4.method1579((float) var5 / 8.0F, -1890);
                    var4.method1579((float) (var6 * 128), -1890);
                    var4.method1579((float) arg0[arg1 + var6][arg2 + var5], -1890);
                    var4.method1579((float) (var5 * 128), -1890);
                } else {
                    var4.method1581((byte) 120, (float) var6 / 8.0F);
                    var4.method1581((byte) -70, (float) var5 / 8.0F);
                    var4.method1581((byte) 118, (float) (var6 * 128));
                    var4.method1581((byte) 117, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1581((byte) 126, (float) (var5 * 128));
                }
            }
        }
        if (class257.field4393) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field4066, 0, var4.field4051);
            this.field568 = new class66();
            this.field568.method505(var7);
        } else {
            this.field567 = ByteBuffer.allocateDirect(var4.field4051).order(ByteOrder.nativeOrder());
            this.field567.put(var4.field4066, 0, var4.field4051);
            this.field567.flip();
        }
        class235 var8 = new class235(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class257.field4402) {
                    var8.method1577(true, (var9 + 1) * 9 + var10);
                    var8.method1577(true, var9 * 9 + var10);
                    var8.method1577(true, var9 * 9 + var10 + 1);
                    var8.method1577(true, (var9 + 1) * 9 + var10);
                    var8.method1577(true, var9 * 9 + var10 + 1);
                    var8.method1577(true, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method1616((var9 + 1) * 9 + var10, (byte) 46);
                    var8.method1616(var9 * 9 + var10, (byte) 46);
                    var8.method1616(var9 * 9 + var10 + 1, (byte) 46);
                    var8.method1616((var9 + 1) * 9 + var10, (byte) 46);
                    var8.method1616(var9 * 9 + var10 + 1, (byte) 46);
                    var8.method1616((var9 + 1) * 9 + var10 + 1, (byte) 46);
                }
            }
        }
        if (class257.field4393) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field4066, 0, var8.field4051);
            this.field572 = new class66();
            this.field572.method504(var11);
        } else {
            this.field570 = ByteBuffer.allocateDirect(var8.field4051).order(ByteOrder.nativeOrder());
            this.field570.put(var8.field4066, 0, var8.field4051);
            this.field570.flip();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lvi;II)Z", line = 158)
    public final boolean method312(class129 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field2281;
        int var5 = arg0.field1950;
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
        if (this.field565 == var7) {
            return false;
        }
        this.field565 = var7;
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
                    field571[var11++] = (byte) (var14 * 17);
                } else {
                    field571[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class257.field4409;
        ByteBuffer var16 = ByteBuffer.wrap(field571);
        var16.limit(16384);
        class257.method1736(this.field569);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }
}
