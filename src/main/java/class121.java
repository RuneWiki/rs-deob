import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class121 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    private int field2144 = -1;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Z")
    public boolean field2148 = true;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    private int field2146;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "[B")
    private static byte[] field2147 = new byte[16384];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lkf;")
    private class249 field2143;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lkf;")
    private class249 field2149;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2145;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2150;

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 245)
    public class121() {
        GL var1 = class241.field4012;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2146 = var2[0];
        class239.field3975 += 16384;
        class241.method1687(this.field2146);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([[III)V", line = 18)
    public final void method877(int[][] arg0, int arg1, int arg2) {
        class146 var4 = new class146(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class241.field4007) {
                    var4.method1006((byte) 109, (float) var6 / 8.0F);
                    var4.method1006((byte) 120, (float) var5 / 8.0F);
                    var4.method1006((byte) 113, (float) (var6 * 128));
                    var4.method1006((byte) 116, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1006((byte) 114, (float) (var5 * 128));
                } else {
                    var4.method1001(-112, (float) var6 / 8.0F);
                    var4.method1001(-41, (float) var5 / 8.0F);
                    var4.method1001(-65, (float) (var6 * 128));
                    var4.method1001(-89, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1001(-89, (float) (var5 * 128));
                }
            }
        }
        if (class241.field4020) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field2496, 0, var4.field2435);
            this.field2143 = new class249();
            this.field2143.method1756(var7);
        } else {
            this.field2150 = ByteBuffer.allocateDirect(var4.field2435).order(ByteOrder.nativeOrder());
            this.field2150.put(var4.field2496, 0, var4.field2435);
            this.field2150.flip();
        }
        class146 var8 = new class146(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class241.field4007) {
                    var8.method1045((byte) -38, (var9 + 1) * 9 + var10);
                    var8.method1045((byte) -94, var9 * 9 + var10);
                    var8.method1045((byte) 125, var9 * 9 + var10 + 1);
                    var8.method1045((byte) 119, (var9 + 1) * 9 + var10);
                    var8.method1045((byte) 116, var9 * 9 + var10 + 1);
                    var8.method1045((byte) -110, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method1040((byte) -127, (var9 + 1) * 9 + var10);
                    var8.method1040((byte) -108, var9 * 9 + var10);
                    var8.method1040((byte) -127, var9 * 9 + var10 + 1);
                    var8.method1040((byte) -113, (var9 + 1) * 9 + var10);
                    var8.method1040((byte) -126, var9 * 9 + var10 + 1);
                    var8.method1040((byte) -108, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class241.field4020) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field2496, 0, var8.field2435);
            this.field2149 = new class249();
            this.field2149.method1752(var11);
        } else {
            this.field2145 = ByteBuffer.allocateDirect(var8.field2435).order(ByteOrder.nativeOrder());
            this.field2145.put(var8.field2496, 0, var8.field2435);
            this.field2145.flip();
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V", line = 121)
    public final void method878() {
        GL var1 = class241.field4012;
        class241.method1687(this.field2146);
        if (this.field2143 == null) {
            if (class241.field4020) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2150);
            class241.field4027 = false;
        } else {
            this.field2143.method1755();
            var1.glInterleavedArrays(10791, 20, 0L);
            class241.field4027 = false;
        }
        if (this.field2149 == null) {
            if (class241.field4020) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2145);
        } else {
            this.field2149.method1753();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lka;II)Z", line = 159)
    public final boolean method879(class211 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field3507;
        int var5 = arg0.field5229;
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
        if (this.field2144 == var7) {
            return false;
        }
        this.field2144 = var7;
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
                    field2147[var11++] = (byte) (var14 * 17);
                } else {
                    field2147[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class241.field4012;
        ByteBuffer var16 = ByteBuffer.wrap(field2147);
        var16.limit(16384);
        class241.method1687(this.field2146);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V", line = 243)
    public static void method880() {
        field2147 = null;
    }
}
