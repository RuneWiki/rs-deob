import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class206 {

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Z")
    public boolean field3122 = true;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    private int field3121 = -1;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    private int field3118;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "[B")
    private static byte[] field3119 = new byte[16384];

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Lan;")
    private class354 field3115;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lan;")
    private class354 field3117;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3116;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3120;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V", line = 6)
    public static void method1440() {
        field3119 = null;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()V", line = 21)
    public final void method1441() {
        GL var1 = class272.field4310;
        class272.method1965(this.field3118);
        if (this.field3115 == null) {
            if (class272.field4302) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field3120);
            class272.field4307 = false;
        } else {
            this.field3115.method2447();
            var1.glInterleavedArrays(10791, 20, 0L);
            class272.field4307 = false;
        }
        if (this.field3117 == null) {
            if (class272.field4302) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3116);
        } else {
            this.field3117.method2449();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([[III)V", line = 54)
    public final void method1442(int[][] arg0, int arg1, int arg2) {
        class143 var4 = new class143(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class272.field4318) {
                    var4.method1053((byte) 103, (float) var6 / 8.0F);
                    var4.method1053((byte) 115, (float) var5 / 8.0F);
                    var4.method1053((byte) 122, (float) (var6 * 128));
                    var4.method1053((byte) 106, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1053((byte) 95, (float) (var5 * 128));
                } else {
                    var4.method1060((byte) 47, (float) var6 / 8.0F);
                    var4.method1060((byte) 47, (float) var5 / 8.0F);
                    var4.method1060((byte) 47, (float) (var6 * 128));
                    var4.method1060((byte) 47, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1060((byte) 47, (float) (var5 * 128));
                }
            }
        }
        if (class272.field4302) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field2260, 0, var4.field2295);
            this.field3115 = new class354();
            this.field3115.method2446(var7);
        } else {
            this.field3120 = ByteBuffer.allocateDirect(var4.field2295).order(ByteOrder.nativeOrder());
            this.field3120.put(var4.field2260, 0, var4.field2295);
            this.field3120.flip();
        }
        class143 var8 = new class143(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class272.field4318) {
                    var8.method1052((var9 + 1) * 9 + var10, false);
                    var8.method1052(var9 * 9 + var10, false);
                    var8.method1052(var9 * 9 + var10 + 1, false);
                    var8.method1052((var9 + 1) * 9 + var10, false);
                    var8.method1052(var9 * 9 + var10 + 1, false);
                    var8.method1052((var9 + 1) * 9 + var10 + 1, false);
                } else {
                    var8.method1012((var9 + 1) * 9 + var10, -11);
                    var8.method1012(var9 * 9 + var10, -11);
                    var8.method1012(var9 * 9 + var10 + 1, -11);
                    var8.method1012((var9 + 1) * 9 + var10, -11);
                    var8.method1012(var9 * 9 + var10 + 1, -11);
                    var8.method1012((var9 + 1) * 9 + var10 + 1, -11);
                }
            }
        }
        if (class272.field4302) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field2260, 0, var8.field2295);
            this.field3117 = new class354();
            this.field3117.method2450(var11);
        } else {
            this.field3116 = ByteBuffer.allocateDirect(var8.field2295).order(ByteOrder.nativeOrder());
            this.field3116.put(var8.field2260, 0, var8.field2295);
            this.field3116.flip();
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lfe;II)Z", line = 156)
    public final boolean method1443(class270 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field4255;
        int var5 = arg0.field2366;
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
        if (this.field3121 == var7) {
            return false;
        }
        this.field3121 = var7;
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
                    field3119[var11++] = (byte) (var14 * 17);
                } else {
                    field3119[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class272.field4310;
        ByteBuffer var16 = ByteBuffer.wrap(field3119);
        var16.limit(16384);
        class272.method1965(this.field3118);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 245)
    public class206() {
        GL var1 = class272.field4310;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3118 = var2[0];
        class1.field2 += 16384;
        class272.method1965(this.field3118);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
