import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class79 {

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    private int field1314 = -1;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Z")
    public boolean field1315 = true;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    private int field1313;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[B")
    private static byte[] field1308 = new byte[16384];

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lbm;")
    private class140 field1310;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lbm;")
    private class140 field1311;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1309;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1312;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lcl;II)Z", line = 7)
    public final boolean method591(class32 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field541;
        int var5 = arg0.field3621;
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
        if (this.field1314 == var7) {
            return false;
        }
        this.field1314 = var7;
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
                    field1308[var11++] = (byte) (var14 * 17);
                } else {
                    field1308[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class99.field1682;
        ByteBuffer var16 = ByteBuffer.wrap(field1308);
        var16.limit(16384);
        class99.method749(this.field1313);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([[III)V", line = 93)
    public final void method592(int[][] arg0, int arg1, int arg2) {
        class164 var4 = new class164(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class99.field1678) {
                    var4.method1195(126, (float) var6 / 8.0F);
                    var4.method1195(116, (float) var5 / 8.0F);
                    var4.method1195(117, (float) (var6 * 128));
                    var4.method1195(118, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1195(112, (float) (var5 * 128));
                } else {
                    var4.method1158((float) var6 / 8.0F, (byte) 17);
                    var4.method1158((float) var5 / 8.0F, (byte) -115);
                    var4.method1158((float) (var6 * 128), (byte) -118);
                    var4.method1158((float) arg0[arg1 + var6][arg2 + var5], (byte) -124);
                    var4.method1158((float) (var5 * 128), (byte) 116);
                }
            }
        }
        if (class99.field1689) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field2668, 0, var4.field2670);
            this.field1310 = new class140();
            this.field1310.method1011(var7);
        } else {
            this.field1309 = ByteBuffer.allocateDirect(var4.field2670).order(ByteOrder.nativeOrder());
            this.field1309.put(var4.field2668, 0, var4.field2670);
            this.field1309.flip();
        }
        class164 var8 = new class164(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class99.field1678) {
                    var8.method1168((var9 + 1) * 9 + var10, (byte) -95);
                    var8.method1168(var9 * 9 + var10, (byte) -114);
                    var8.method1168(var9 * 9 + var10 + 1, (byte) -101);
                    var8.method1168((var9 + 1) * 9 + var10, (byte) -61);
                    var8.method1168(var9 * 9 + var10 + 1, (byte) -124);
                    var8.method1168((var9 + 1) * 9 + var10 + 1, (byte) -61);
                } else {
                    var8.method1152((var9 + 1) * 9 + var10, (byte) 98);
                    var8.method1152(var9 * 9 + var10, (byte) 98);
                    var8.method1152(var9 * 9 + var10 + 1, (byte) 98);
                    var8.method1152((var9 + 1) * 9 + var10, (byte) 98);
                    var8.method1152(var9 * 9 + var10 + 1, (byte) 98);
                    var8.method1152((var9 + 1) * 9 + var10 + 1, (byte) 98);
                }
            }
        }
        if (class99.field1689) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field2668, 0, var8.field2670);
            this.field1311 = new class140();
            this.field1311.method1007(var11);
        } else {
            this.field1312 = ByteBuffer.allocateDirect(var8.field2670).order(ByteOrder.nativeOrder());
            this.field1312.put(var8.field2668, 0, var8.field2670);
            this.field1312.flip();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()V", line = 198)
    public static void method593() {
        field1308 = null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V", line = 204)
    public final void method594() {
        GL var1 = class99.field1682;
        class99.method749(this.field1313);
        if (this.field1310 == null) {
            if (class99.field1689) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field1309);
            class99.field1669 = false;
        } else {
            this.field1310.method1008();
            var1.glInterleavedArrays(10791, 20, 0L);
            class99.field1669 = false;
        }
        if (this.field1311 == null) {
            if (class99.field1689) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field1312);
        } else {
            this.field1311.method1010();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 245)
    public class79() {
        GL var1 = class99.field1682;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1313 = var2[0];
        class274.field4578 += 16384;
        class99.method749(this.field1313);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
