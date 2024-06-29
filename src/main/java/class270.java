import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class270 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Z")
    public boolean field4639 = true;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    private int field4640 = -1;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    private int field4641;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[B")
    private static byte[] field4638 = new byte[16384];

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lhj;")
    private class28 field4636;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Lhj;")
    private class28 field4637;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4642;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4643;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V", line = 10)
    public final void method1876() {
        GL var1 = class281.field4839;
        class281.method1953(this.field4641);
        if (this.field4636 == null) {
            if (class281.field4820) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field4642);
            class281.field4845 = false;
        } else {
            this.field4636.method154();
            var1.glInterleavedArrays(10791, 20, 0L);
            class281.field4845 = false;
        }
        if (this.field4637 == null) {
            if (class281.field4820) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field4643);
        } else {
            this.field4637.method155();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V", line = 43)
    public static void method1877() {
        field4638 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ldm;II)Z", line = 49)
    public final boolean method1878(class273 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field4696;
        int var5 = arg0.field70;
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
        if (this.field4640 == var7) {
            return false;
        }
        this.field4640 = var7;
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
                    field4638[var11++] = (byte) (var14 * 17);
                } else {
                    field4638[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class281.field4839;
        ByteBuffer var16 = ByteBuffer.wrap(field4638);
        var16.limit(16384);
        class281.method1953(this.field4641);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 245)
    public class270() {
        GL var1 = class281.field4839;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field4641 = var2[0];
        class139.field2326 += 16384;
        class281.method1953(this.field4641);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([[III)V", line = 138)
    public final void method1879(int[][] arg0, int arg1, int arg2) {
        class70 var4 = new class70(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class281.field4816) {
                    var4.method428((float) var6 / 8.0F, (byte) -125);
                    var4.method428((float) var5 / 8.0F, (byte) -128);
                    var4.method428((float) (var6 * 128), (byte) -122);
                    var4.method428((float) arg0[arg1 + var6][arg2 + var5], (byte) -128);
                    var4.method428((float) (var5 * 128), (byte) -127);
                } else {
                    var4.method475((byte) -61, (float) var6 / 8.0F);
                    var4.method475((byte) -61, (float) var5 / 8.0F);
                    var4.method475((byte) -61, (float) (var6 * 128));
                    var4.method475((byte) -61, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method475((byte) -61, (float) (var5 * 128));
                }
            }
        }
        if (class281.field4820) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field1066, 0, var4.field1068);
            this.field4636 = new class28();
            this.field4636.method156(var7);
        } else {
            this.field4642 = ByteBuffer.allocateDirect(var4.field1068).order(ByteOrder.nativeOrder());
            this.field4642.put(var4.field1066, 0, var4.field1068);
            this.field4642.flip();
        }
        class70 var8 = new class70(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class281.field4816) {
                    var8.method436((var9 + 1) * 9 + var10, -18820);
                    var8.method436(var9 * 9 + var10, -18820);
                    var8.method436(var9 * 9 + var10 + 1, -18820);
                    var8.method436((var9 + 1) * 9 + var10, -18820);
                    var8.method436(var9 * 9 + var10 + 1, -18820);
                    var8.method436((var9 + 1) * 9 + var10 + 1, -18820);
                } else {
                    var8.method450((var9 + 1) * 9 + var10, -49);
                    var8.method450(var9 * 9 + var10, 121);
                    var8.method450(var9 * 9 + var10 + 1, 120);
                    var8.method450((var9 + 1) * 9 + var10, 118);
                    var8.method450(var9 * 9 + var10 + 1, 121);
                    var8.method450((var9 + 1) * 9 + var10 + 1, -56);
                }
            }
        }
        if (class281.field4820) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field1066, 0, var8.field1068);
            this.field4637 = new class28();
            this.field4637.method152(var11);
        } else {
            this.field4643 = ByteBuffer.allocateDirect(var8.field1068).order(ByteOrder.nativeOrder());
            this.field4643.put(var8.field1066, 0, var8.field1068);
            this.field4643.flip();
        }
    }
}
