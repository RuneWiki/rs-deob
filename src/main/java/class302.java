import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class302 {

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    private int field4709 = -1;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Z")
    public boolean field4711 = true;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    private int field4708;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[B")
    private static byte[] field4710 = new byte[16384];

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Lmg;")
    private class113 field4713;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lmg;")
    private class113 field4714;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4707;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4712;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([[III)V", line = 7)
    public final void method2056(int[][] arg0, int arg1, int arg2) {
        class166 var4 = new class166(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class94.field1512) {
                    var4.method1160(1, (float) var6 / 8.0F);
                    var4.method1160(1, (float) var5 / 8.0F);
                    var4.method1160(1, (float) (var6 * 128));
                    var4.method1160(1, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1160(1, (float) (var5 * 128));
                } else {
                    var4.method1144((byte) -119, (float) var6 / 8.0F);
                    var4.method1144((byte) -108, (float) var5 / 8.0F);
                    var4.method1144((byte) -102, (float) (var6 * 128));
                    var4.method1144((byte) -110, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1144((byte) -104, (float) (var5 * 128));
                }
            }
        }
        if (class94.field1507) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field2500, 0, var4.field2532);
            this.field4714 = new class113();
            this.field4714.method841(var7);
        } else {
            this.field4712 = ByteBuffer.allocateDirect(var4.field2532).order(ByteOrder.nativeOrder());
            this.field4712.put(var4.field2500, 0, var4.field2532);
            this.field4712.flip();
        }
        class166 var8 = new class166(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class94.field1512) {
                    var8.method1174((byte) -32, (var9 + 1) * 9 + var10);
                    var8.method1174((byte) -32, var9 * 9 + var10);
                    var8.method1174((byte) -32, var9 * 9 + var10 + 1);
                    var8.method1174((byte) -32, (var9 + 1) * 9 + var10);
                    var8.method1174((byte) -32, var9 * 9 + var10 + 1);
                    var8.method1174((byte) -32, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method1169((var9 + 1) * 9 + var10, 30148);
                    var8.method1169(var9 * 9 + var10, 30148);
                    var8.method1169(var9 * 9 + var10 + 1, 30148);
                    var8.method1169((var9 + 1) * 9 + var10, 30148);
                    var8.method1169(var9 * 9 + var10 + 1, 30148);
                    var8.method1169((var9 + 1) * 9 + var10 + 1, 30148);
                }
            }
        }
        if (class94.field1507) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field2500, 0, var8.field2532);
            this.field4713 = new class113();
            this.field4713.method839(var11);
        } else {
            this.field4707 = ByteBuffer.allocateDirect(var8.field2532).order(ByteOrder.nativeOrder());
            this.field4707.put(var8.field2500, 0, var8.field2532);
            this.field4707.flip();
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 242)
    public class302() {
        GL var1 = class94.field1473;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field4708 = var2[0];
        class198.field2961 += 16384;
        class94.method698(this.field4708);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lin;II)Z", line = 117)
    public final boolean method2057(class168 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field2555;
        int var5 = arg0.field3972;
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
        if (this.field4709 == var7) {
            return false;
        }
        this.field4709 = var7;
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
                    field4710[var11++] = (byte) (var14 * 17);
                } else {
                    field4710[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class94.field1473;
        ByteBuffer var16 = ByteBuffer.wrap(field4710);
        var16.limit(16384);
        class94.method698(this.field4708);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V", line = 211)
    public final void method2058() {
        GL var1 = class94.field1473;
        class94.method698(this.field4708);
        if (this.field4714 == null) {
            if (class94.field1507) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field4712);
            class94.field1520 = false;
        } else {
            this.field4714.method837();
            var1.glInterleavedArrays(10791, 20, 0L);
            class94.field1520 = false;
        }
        if (this.field4713 == null) {
            if (class94.field1507) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field4707);
        } else {
            this.field4713.method840();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "()V", line = 257)
    public static void method2059() {
        field4710 = null;
    }
}
