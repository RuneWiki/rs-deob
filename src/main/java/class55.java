import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class55 {

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Z")
    public boolean field1011 = true;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    private int field1012 = -1;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "[B")
    private static byte[] field1010 = new byte[16384];

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Lre;")
    private class259 field1006;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Lre;")
    private class259 field1007;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1009;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1013;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V", line = 7)
    public static void method437() {
        field1010 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lel;II)Z", line = 14)
    public final boolean method438(class232 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field3980;
        int var5 = arg0.field5015;
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
        if (this.field1012 == var7) {
            return false;
        }
        this.field1012 = var7;
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
                    field1010[var11++] = (byte) (var14 * 17);
                } else {
                    field1010[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class253.field4319;
        ByteBuffer var16 = ByteBuffer.wrap(field1010);
        var16.limit(16384);
        class253.method1714(this.field1008);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V", line = 101)
    public final void method439() {
        GL var1 = class253.field4319;
        class253.method1714(this.field1008);
        if (this.field1007 == null) {
            if (class253.field4304) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field1009);
            class253.field4300 = false;
        } else {
            this.field1007.method1821();
            var1.glInterleavedArrays(10791, 20, 0L);
            class253.field4300 = false;
        }
        if (this.field1006 == null) {
            if (class253.field4304) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field1013);
        } else {
            this.field1006.method1820();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 143)
    public class55() {
        GL var1 = class253.field4319;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1008 = var2[0];
        class221.field3869 += 16384;
        class253.method1714(this.field1008);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([[III)V", line = 159)
    public final void method440(int[][] arg0, int arg1, int arg2) {
        class41 var4 = new class41(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class253.field4331) {
                    var4.method316((float) var6 / 8.0F, -1244406608);
                    var4.method316((float) var5 / 8.0F, -1244406608);
                    var4.method316((float) (var6 * 128), -1244406608);
                    var4.method316((float) arg0[arg1 + var6][arg2 + var5], -1244406608);
                    var4.method316((float) (var5 * 128), -1244406608);
                } else {
                    var4.method320(false, (float) var6 / 8.0F);
                    var4.method320(false, (float) var5 / 8.0F);
                    var4.method320(false, (float) (var6 * 128));
                    var4.method320(false, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method320(false, (float) (var5 * 128));
                }
            }
        }
        if (class253.field4304) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field772, 0, var4.field738);
            this.field1007 = new class259();
            this.field1007.method1822(var7);
        } else {
            this.field1009 = ByteBuffer.allocateDirect(var4.field738).order(ByteOrder.nativeOrder());
            this.field1009.put(var4.field772, 0, var4.field738);
            this.field1009.flip();
        }
        class41 var8 = new class41(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class253.field4331) {
                    var8.method365((byte) -32, (var9 + 1) * 9 + var10);
                    var8.method365((byte) -32, var9 * 9 + var10);
                    var8.method365((byte) -32, var9 * 9 + var10 + 1);
                    var8.method365((byte) -32, (var9 + 1) * 9 + var10);
                    var8.method365((byte) -32, var9 * 9 + var10 + 1);
                    var8.method365((byte) -32, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method325(true, (var9 + 1) * 9 + var10);
                    var8.method325(true, var9 * 9 + var10);
                    var8.method325(true, var9 * 9 + var10 + 1);
                    var8.method325(true, (var9 + 1) * 9 + var10);
                    var8.method325(true, var9 * 9 + var10 + 1);
                    var8.method325(true, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class253.field4304) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field772, 0, var8.field738);
            this.field1006 = new class259();
            this.field1006.method1823(var11);
        } else {
            this.field1013 = ByteBuffer.allocateDirect(var8.field738).order(ByteOrder.nativeOrder());
            this.field1013.put(var8.field772, 0, var8.field738);
            this.field1013.flip();
        }
    }
}
