import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class226 {

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Z")
    public boolean field3780 = true;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    private int field3776 = -1;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[B")
    private static byte[] field3781 = new byte[16384];

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lwa;")
    private class75 field3777;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lwa;")
    private class75 field3783;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3778;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3779;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([[III)V", line = 7)
    public final void method1627(int[][] arg0, int arg1, int arg2) {
        class94 var4 = new class94(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class117.field2135) {
                    var4.method710((float) var6 / 8.0F, -98);
                    var4.method710((float) var5 / 8.0F, -106);
                    var4.method710((float) (var6 * 128), -117);
                    var4.method710((float) arg0[arg1 + var6][arg2 + var5], -103);
                    var4.method710((float) (var5 * 128), -125);
                } else {
                    var4.method733(128, (float) var6 / 8.0F);
                    var4.method733(128, (float) var5 / 8.0F);
                    var4.method733(128, (float) (var6 * 128));
                    var4.method733(128, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method733(128, (float) (var5 * 128));
                }
            }
        }
        if (class117.field2145) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field1681, 0, var4.field1653);
            this.field3777 = new class75();
            this.field3777.method534(var7);
        } else {
            this.field3779 = ByteBuffer.allocateDirect(var4.field1653).order(ByteOrder.nativeOrder());
            this.field3779.put(var4.field1681, 0, var4.field1653);
            this.field3779.flip();
        }
        class94 var8 = new class94(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class117.field2135) {
                    var8.method730(false, (var9 + 1) * 9 + var10);
                    var8.method730(false, var9 * 9 + var10);
                    var8.method730(false, var9 * 9 + var10 + 1);
                    var8.method730(false, (var9 + 1) * 9 + var10);
                    var8.method730(false, var9 * 9 + var10 + 1);
                    var8.method730(false, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method718((byte) -98, (var9 + 1) * 9 + var10);
                    var8.method718((byte) -112, var9 * 9 + var10);
                    var8.method718((byte) -107, var9 * 9 + var10 + 1);
                    var8.method718((byte) -114, (var9 + 1) * 9 + var10);
                    var8.method718((byte) -120, var9 * 9 + var10 + 1);
                    var8.method718((byte) -83, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class117.field2145) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field1681, 0, var8.field1653);
            this.field3783 = new class75();
            this.field3783.method537(var11);
        } else {
            this.field3778 = ByteBuffer.allocateDirect(var8.field1653).order(ByteOrder.nativeOrder());
            this.field3778.put(var8.field1681, 0, var8.field1653);
            this.field3778.flip();
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V", line = 245)
    public class226() {
        GL var1 = class117.field2143;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3782 = var2[0];
        class41.field658 += 16384;
        class117.method939(this.field3782);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lpm;II)Z", line = 122)
    public final boolean method1628(class99 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field1789;
        int var5 = arg0.field556;
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
        if (this.field3776 == var7) {
            return false;
        }
        this.field3776 = var7;
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
                    field3781[var11++] = (byte) (var14 * 17);
                } else {
                    field3781[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class117.field2143;
        ByteBuffer var16 = ByteBuffer.wrap(field3781);
        var16.limit(16384);
        class117.method939(this.field3782);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V", line = 207)
    public final void method1629() {
        GL var1 = class117.field2143;
        class117.method939(this.field3782);
        if (this.field3777 == null) {
            if (class117.field2145) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field3779);
            class117.field2154 = false;
        } else {
            this.field3777.method536();
            var1.glInterleavedArrays(10791, 20, 0L);
            class117.field2154 = false;
        }
        if (this.field3783 == null) {
            if (class117.field2145) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3778);
        } else {
            this.field3783.method533();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()V", line = 243)
    public static void method1630() {
        field3781 = null;
    }
}
