import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class215 {

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    private int field3354 = -1;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Z")
    public boolean field3349 = true;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    private int field3352;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[B")
    private static byte[] field3351 = new byte[16384];

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Ll;")
    private class312 field3348;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Ll;")
    private class312 field3353;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3347;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3350;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V", line = 8)
    public final void method1558() {
        GL var1 = class162.field2654;
        class162.method1219(this.field3352);
        if (this.field3348 == null) {
            if (class162.field2639) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field3347);
            class162.field2614 = false;
        } else {
            this.field3348.method2199();
            var1.glInterleavedArrays(10791, 20, 0L);
            class162.field2614 = false;
        }
        if (this.field3353 == null) {
            if (class162.field2639) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3350);
        } else {
            this.field3353.method2200();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()V", line = 40)
    public static void method1559() {
        field3351 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([[III)V", line = 49)
    public final void method1560(int[][] arg0, int arg1, int arg2) {
        class1 var4 = new class1(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class162.field2624) {
                    var4.method64((float) var6 / 8.0F, (byte) 41);
                    var4.method64((float) var5 / 8.0F, (byte) 41);
                    var4.method64((float) (var6 * 128), (byte) 41);
                    var4.method64((float) arg0[arg1 + var6][arg2 + var5], (byte) 41);
                    var4.method64((float) (var5 * 128), (byte) 41);
                } else {
                    var4.method5(15852, (float) var6 / 8.0F);
                    var4.method5(15852, (float) var5 / 8.0F);
                    var4.method5(15852, (float) (var6 * 128));
                    var4.method5(15852, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method5(15852, (float) (var5 * 128));
                }
            }
        }
        if (class162.field2639) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field34, 0, var4.field48);
            this.field3348 = new class312();
            this.field3348.method2202(var7);
        } else {
            this.field3347 = ByteBuffer.allocateDirect(var4.field48).order(ByteOrder.nativeOrder());
            this.field3347.put(var4.field34, 0, var4.field48);
            this.field3347.flip();
        }
        class1 var8 = new class1(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class162.field2624) {
                    var8.method11((var9 + 1) * 9 + var10, 31932);
                    var8.method11(var9 * 9 + var10, 31932);
                    var8.method11(var9 * 9 + var10 + 1, 31932);
                    var8.method11((var9 + 1) * 9 + var10, 31932);
                    var8.method11(var9 * 9 + var10 + 1, 31932);
                    var8.method11((var9 + 1) * 9 + var10 + 1, 31932);
                } else {
                    var8.method13(true, (var9 + 1) * 9 + var10);
                    var8.method13(true, var9 * 9 + var10);
                    var8.method13(true, var9 * 9 + var10 + 1);
                    var8.method13(true, (var9 + 1) * 9 + var10);
                    var8.method13(true, var9 * 9 + var10 + 1);
                    var8.method13(true, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class162.field2639) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field34, 0, var8.field48);
            this.field3353 = new class312();
            this.field3353.method2201(var11);
        } else {
            this.field3350 = ByteBuffer.allocateDirect(var8.field48).order(ByteOrder.nativeOrder());
            this.field3350.put(var8.field34, 0, var8.field48);
            this.field3350.flip();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lwk;II)Z", line = 156)
    public final boolean method1561(class186 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field2939;
        int var5 = arg0.field3065;
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
        if (this.field3354 == var7) {
            return false;
        }
        this.field3354 = var7;
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
                    field3351[var11++] = (byte) (var14 * 17);
                } else {
                    field3351[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class162.field2654;
        ByteBuffer var16 = ByteBuffer.wrap(field3351);
        var16.limit(16384);
        class162.method1219(this.field3352);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 245)
    public class215() {
        GL var1 = class162.field2654;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3352 = var2[0];
        class177.field2820 += 16384;
        class162.method1219(this.field3352);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
