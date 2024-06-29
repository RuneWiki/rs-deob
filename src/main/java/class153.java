import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class153 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Z")
    public boolean field2341 = true;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    private int field2343 = -1;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[B")
    private static byte[] field2346 = new byte[16384];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lrl;")
    private class207 field2339;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lrl;")
    private class207 field2340;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2342;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2344;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 242)
    public class153() {
        GL var1 = class186.field2990;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2345 = var2[0];
        class275.field4358 += 16384;
        class186.method1288(this.field2345);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lag;II)Z", line = 18)
    public final boolean method1065(class123 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field1853;
        int var5 = arg0.field4037;
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
        if (this.field2343 == var7) {
            return false;
        }
        this.field2343 = var7;
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
                    field2346[var11++] = (byte) (var14 * 17);
                } else {
                    field2346[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class186.field2990;
        ByteBuffer var16 = ByteBuffer.wrap(field2346);
        var16.limit(16384);
        class186.method1288(this.field2345);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "([[III)V", line = 103)
    public final void method1066(int[][] arg0, int arg1, int arg2) {
        class192 var4 = new class192(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class186.field3014) {
                    var4.method1345(31252, (float) var6 / 8.0F);
                    var4.method1345(31252, (float) var5 / 8.0F);
                    var4.method1345(31252, (float) (var6 * 128));
                    var4.method1345(31252, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1345(31252, (float) (var5 * 128));
                } else {
                    var4.method1373(59, (float) var6 / 8.0F);
                    var4.method1373(75, (float) var5 / 8.0F);
                    var4.method1373(81, (float) (var6 * 128));
                    var4.method1373(108, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1373(86, (float) (var5 * 128));
                }
            }
        }
        if (class186.field3027) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field3128, 0, var4.field3129);
            this.field2339 = new class207();
            this.field2339.method1518(var7);
        } else {
            this.field2344 = ByteBuffer.allocateDirect(var4.field3129).order(ByteOrder.nativeOrder());
            this.field2344.put(var4.field3128, 0, var4.field3129);
            this.field2344.flip();
        }
        class192 var8 = new class192(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class186.field3014) {
                    var8.method1350((var9 + 1) * 9 + var10, -82);
                    var8.method1350(var9 * 9 + var10, -106);
                    var8.method1350(var9 * 9 + var10 + 1, -57);
                    var8.method1350((var9 + 1) * 9 + var10, -107);
                    var8.method1350(var9 * 9 + var10 + 1, -94);
                    var8.method1350((var9 + 1) * 9 + var10 + 1, -91);
                } else {
                    var8.method1400((var9 + 1) * 9 + var10, (byte) -107);
                    var8.method1400(var9 * 9 + var10, (byte) -69);
                    var8.method1400(var9 * 9 + var10 + 1, (byte) -75);
                    var8.method1400((var9 + 1) * 9 + var10, (byte) -108);
                    var8.method1400(var9 * 9 + var10 + 1, (byte) -89);
                    var8.method1400((var9 + 1) * 9 + var10 + 1, (byte) -93);
                }
            }
        }
        if (class186.field3027) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field3128, 0, var8.field3129);
            this.field2340 = new class207();
            this.field2340.method1514(var11);
        } else {
            this.field2342 = ByteBuffer.allocateDirect(var8.field3129).order(ByteOrder.nativeOrder());
            this.field2342.put(var8.field3128, 0, var8.field3129);
            this.field2342.flip();
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V", line = 206)
    public final void method1067() {
        GL var1 = class186.field2990;
        class186.method1288(this.field2345);
        if (this.field2339 == null) {
            if (class186.field3027) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2344);
            class186.field2987 = false;
        } else {
            this.field2339.method1517();
            var1.glInterleavedArrays(10791, 20, 0L);
            class186.field2987 = false;
        }
        if (this.field2340 == null) {
            if (class186.field3027) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2342);
        } else {
            this.field2340.method1516();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()V", line = 240)
    public static void method1068() {
        field2346 = null;
    }
}
