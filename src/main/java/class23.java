import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class23 {

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    private int field379 = -1;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Z")
    public boolean field383 = true;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "[B")
    private static byte[] field381 = new byte[16384];

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "Lul;")
    private class39 field380;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lul;")
    private class39 field385;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field378;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field384;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lnm;II)Z", line = 7)
    public final boolean method215(class176 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field3012;
        int var5 = arg0.field3008;
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
        if (this.field379 == var7) {
            return false;
        }
        this.field379 = var7;
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
                    field381[var11++] = (byte) (var14 * 17);
                } else {
                    field381[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class123.field2212;
        ByteBuffer var16 = ByteBuffer.wrap(field381);
        var16.limit(16384);
        class123.method867(this.field382);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()V", line = 92)
    public final void method216() {
        GL var1 = class123.field2212;
        class123.method867(this.field382);
        if (this.field385 == null) {
            if (class123.field2227) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field378);
            class123.field2219 = false;
        } else {
            this.field385.method301();
            var1.glInterleavedArrays(10791, 20, 0L);
            class123.field2219 = false;
        }
        if (this.field380 == null) {
            if (class123.field2227) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field384);
        } else {
            this.field380.method303();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V", line = 245)
    public class23() {
        GL var1 = class123.field2212;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field382 = var2[0];
        class285.field4891 += 16384;
        class123.method867(this.field382);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([[III)V", line = 136)
    public final void method217(int[][] arg0, int arg1, int arg2) {
        class13 var4 = new class13(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class123.field2221) {
                    var4.method141((float) var6 / 8.0F, -1731515408);
                    var4.method141((float) var5 / 8.0F, -1731515408);
                    var4.method141((float) (var6 * 128), -1731515408);
                    var4.method141((float) arg0[arg1 + var6][arg2 + var5], -1731515408);
                    var4.method141((float) (var5 * 128), -1731515408);
                } else {
                    var4.method106((float) var6 / 8.0F, true);
                    var4.method106((float) var5 / 8.0F, true);
                    var4.method106((float) (var6 * 128), true);
                    var4.method106((float) arg0[arg1 + var6][arg2 + var5], true);
                    var4.method106((float) (var5 * 128), true);
                }
            }
        }
        if (class123.field2227) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field254, 0, var4.field281);
            this.field385 = new class39();
            this.field385.method305(var7);
        } else {
            this.field378 = ByteBuffer.allocateDirect(var4.field281).order(ByteOrder.nativeOrder());
            this.field378.put(var4.field254, 0, var4.field281);
            this.field378.flip();
        }
        class13 var8 = new class13(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class123.field2221) {
                    var8.method128((byte) -38, (var9 + 1) * 9 + var10);
                    var8.method128((byte) -38, var9 * 9 + var10);
                    var8.method128((byte) 115, var9 * 9 + var10 + 1);
                    var8.method128((byte) 108, (var9 + 1) * 9 + var10);
                    var8.method128((byte) -88, var9 * 9 + var10 + 1);
                    var8.method128((byte) 123, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method137((var9 + 1) * 9 + var10, (byte) 55);
                    var8.method137(var9 * 9 + var10, (byte) 120);
                    var8.method137(var9 * 9 + var10 + 1, (byte) 122);
                    var8.method137((var9 + 1) * 9 + var10, (byte) 60);
                    var8.method137(var9 * 9 + var10 + 1, (byte) 112);
                    var8.method137((var9 + 1) * 9 + var10 + 1, (byte) -20);
                }
            }
        }
        if (class123.field2227) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field254, 0, var8.field281);
            this.field380 = new class39();
            this.field380.method302(var11);
        } else {
            this.field384 = ByteBuffer.allocateDirect(var8.field281).order(ByteOrder.nativeOrder());
            this.field384.put(var8.field254, 0, var8.field281);
            this.field384.flip();
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()V", line = 239)
    public static void method218() {
        field381 = null;
    }
}
