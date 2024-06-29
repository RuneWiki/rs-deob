import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class184 {

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Z")
    public boolean field2859 = true;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    private int field2861 = -1;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    private int field2862;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[B")
    private static byte[] field2858 = new byte[16384];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lvj;")
    private class205 field2857;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Lvj;")
    private class205 field2863;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2860;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2864;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([[III)V", line = 7)
    public final void method1273(int[][] arg0, int arg1, int arg2) {
        class313 var4 = new class313(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class245.field3895) {
                    var4.method2252((float) var6 / 8.0F, false);
                    var4.method2252((float) var5 / 8.0F, false);
                    var4.method2252((float) (var6 * 128), false);
                    var4.method2252((float) arg0[arg1 + var6][arg2 + var5], false);
                    var4.method2252((float) (var5 * 128), false);
                } else {
                    var4.method2219((float) var6 / 8.0F, (byte) -126);
                    var4.method2219((float) var5 / 8.0F, (byte) -126);
                    var4.method2219((float) (var6 * 128), (byte) -127);
                    var4.method2219((float) arg0[arg1 + var6][arg2 + var5], (byte) -127);
                    var4.method2219((float) (var5 * 128), (byte) -128);
                }
            }
        }
        if (class245.field3869) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field5124, 0, var4.field5137);
            this.field2863 = new class205();
            this.field2863.method1396(var7);
        } else {
            this.field2864 = ByteBuffer.allocateDirect(var4.field5137).order(ByteOrder.nativeOrder());
            this.field2864.put(var4.field5124, 0, var4.field5137);
            this.field2864.flip();
        }
        class313 var8 = new class313(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class245.field3895) {
                    var8.method2222((var9 + 1) * 9 + var10, 255);
                    var8.method2222(var9 * 9 + var10, 255);
                    var8.method2222(var9 * 9 + var10 + 1, 255);
                    var8.method2222((var9 + 1) * 9 + var10, 255);
                    var8.method2222(var9 * 9 + var10 + 1, 255);
                    var8.method2222((var9 + 1) * 9 + var10 + 1, 255);
                } else {
                    var8.method2210((byte) -123, (var9 + 1) * 9 + var10);
                    var8.method2210((byte) 84, var9 * 9 + var10);
                    var8.method2210((byte) -7, var9 * 9 + var10 + 1);
                    var8.method2210((byte) 86, (var9 + 1) * 9 + var10);
                    var8.method2210((byte) -120, var9 * 9 + var10 + 1);
                    var8.method2210((byte) -118, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class245.field3869) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field5124, 0, var8.field5137);
            this.field2857 = new class205();
            this.field2857.method1399(var11);
        } else {
            this.field2860 = ByteBuffer.allocateDirect(var8.field5137).order(ByteOrder.nativeOrder());
            this.field2860.put(var8.field5124, 0, var8.field5137);
            this.field2860.flip();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V", line = 109)
    public final void method1274() {
        GL var1 = class245.field3884;
        class245.method1729(this.field2862);
        if (this.field2863 == null) {
            if (class245.field3869) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2864);
            class245.field3877 = false;
        } else {
            this.field2863.method1397();
            var1.glInterleavedArrays(10791, 20, 0L);
            class245.field3877 = false;
        }
        if (this.field2857 == null) {
            if (class245.field3869) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2860);
        } else {
            this.field2857.method1398();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 245)
    public class184() {
        GL var1 = class245.field3884;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2862 = var2[0];
        class173.field2704 += 16384;
        class245.method1729(this.field2862);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V", line = 154)
    public static void method1275() {
        field2858 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lfo;II)Z", line = 158)
    public final boolean method1276(class239 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field3776;
        int var5 = arg0.field2915;
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
        if (this.field2861 == var7) {
            return false;
        }
        this.field2861 = var7;
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
                    field2858[var11++] = (byte) (var14 * 17);
                } else {
                    field2858[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class245.field3884;
        ByteBuffer var16 = ByteBuffer.wrap(field2858);
        var16.limit(16384);
        class245.method1729(this.field2862);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }
}
