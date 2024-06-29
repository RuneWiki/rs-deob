import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class190 {

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
    public boolean field3001 = true;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    private int field2999 = -1;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "[B")
    private static byte[] field2998 = new byte[16384];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lpj;")
    private class182 field2996;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "Lpj;")
    private class182 field3002;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2997;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3003;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Leg;II)Z", line = 7)
    public final boolean method1259(class300 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field5195;
        int var5 = arg0.field3746;
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
        if (this.field2999 == var7) {
            return false;
        }
        this.field2999 = var7;
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
                    field2998[var11++] = (byte) (var14 * 17);
                } else {
                    field2998[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class217.field3551;
        ByteBuffer var16 = ByteBuffer.wrap(field2998);
        var16.limit(16384);
        class217.method1457(this.field3000);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "()V", line = 92)
    public static void method1260() {
        field2998 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([[III)V", line = 97)
    public final void method1261(int[][] arg0, int arg1, int arg2) {
        class291 var4 = new class291(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class217.field3537) {
                    var4.method1987((float) var6 / 8.0F, (byte) 85);
                    var4.method1987((float) var5 / 8.0F, (byte) 85);
                    var4.method1987((float) (var6 * 128), (byte) 85);
                    var4.method1987((float) arg0[arg1 + var6][arg2 + var5], (byte) 85);
                    var4.method1987((float) (var5 * 128), (byte) 85);
                } else {
                    var4.method1970((float) var6 / 8.0F, 65536);
                    var4.method1970((float) var5 / 8.0F, 65536);
                    var4.method1970((float) (var6 * 128), 65536);
                    var4.method1970((float) arg0[arg1 + var6][arg2 + var5], 65536);
                    var4.method1970((float) (var5 * 128), 65536);
                }
            }
        }
        if (class217.field3526) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field4950, 0, var4.field4946);
            this.field2996 = new class182();
            this.field2996.method1210(var7);
        } else {
            this.field2997 = ByteBuffer.allocateDirect(var4.field4946).order(ByteOrder.nativeOrder());
            this.field2997.put(var4.field4950, 0, var4.field4946);
            this.field2997.flip();
        }
        class291 var8 = new class291(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class217.field3537) {
                    var8.method1967((var9 + 1) * 9 + var10, -1303690792);
                    var8.method1967(var9 * 9 + var10, -1303690792);
                    var8.method1967(var9 * 9 + var10 + 1, -1303690792);
                    var8.method1967((var9 + 1) * 9 + var10, -1303690792);
                    var8.method1967(var9 * 9 + var10 + 1, -1303690792);
                    var8.method1967((var9 + 1) * 9 + var10 + 1, -1303690792);
                } else {
                    var8.method1998((var9 + 1) * 9 + var10, (byte) 106);
                    var8.method1998(var9 * 9 + var10, (byte) 116);
                    var8.method1998(var9 * 9 + var10 + 1, (byte) -46);
                    var8.method1998((var9 + 1) * 9 + var10, (byte) 114);
                    var8.method1998(var9 * 9 + var10 + 1, (byte) 105);
                    var8.method1998((var9 + 1) * 9 + var10 + 1, (byte) 118);
                }
            }
        }
        if (class217.field3526) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field4950, 0, var8.field4946);
            this.field3002 = new class182();
            this.field3002.method1209(var11);
        } else {
            this.field3003 = ByteBuffer.allocateDirect(var8.field4946).order(ByteOrder.nativeOrder());
            this.field3003.put(var8.field4950, 0, var8.field4946);
            this.field3003.flip();
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()V", line = 200)
    public final void method1262() {
        GL var1 = class217.field3551;
        class217.method1457(this.field3000);
        if (this.field2996 == null) {
            if (class217.field3526) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2997);
            class217.field3534 = false;
        } else {
            this.field2996.method1208();
            var1.glInterleavedArrays(10791, 20, 0L);
            class217.field3534 = false;
        }
        if (this.field3002 == null) {
            if (class217.field3526) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3003);
        } else {
            this.field3002.method1211();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 245)
    public class190() {
        GL var1 = class217.field3551;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3000 = var2[0];
        class207.field3385 += 16384;
        class217.method1457(this.field3000);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
