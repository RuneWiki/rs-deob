import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class223 {

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    private int field3486 = -1;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Z")
    public boolean field3488 = true;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    private int field3483;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[B")
    private static byte[] field3482 = new byte[16384];

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Led;")
    private class296 field3484;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Led;")
    private class296 field3485;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3481;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3487;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 6)
    public static void method1592() {
        field3482 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lom;II)Z", line = 10)
    public final boolean method1593(class70 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field1021;
        int var5 = arg0.field4579;
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
        if (this.field3486 == var7) {
            return false;
        }
        this.field3486 = var7;
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
                    field3482[var11++] = (byte) (var14 * 17);
                } else {
                    field3482[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class36.field518;
        ByteBuffer var16 = ByteBuffer.wrap(field3482);
        var16.limit(16384);
        class36.method310(this.field3483);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V", line = 96)
    public final void method1594() {
        GL var1 = class36.field518;
        class36.method310(this.field3483);
        if (this.field3485 == null) {
            if (class36.field529) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field3487);
            class36.field525 = false;
        } else {
            this.field3485.method2088();
            var1.glInterleavedArrays(10791, 20, 0L);
            class36.field525 = false;
        }
        if (this.field3484 == null) {
            if (class36.field529) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3481);
        } else {
            this.field3484.method2087();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([[III)V", line = 136)
    public final void method1595(int[][] arg0, int arg1, int arg2) {
        class35 var4 = new class35(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class36.field510) {
                    var4.method274((byte) 28, (float) var6 / 8.0F);
                    var4.method274((byte) 28, (float) var5 / 8.0F);
                    var4.method274((byte) 28, (float) (var6 * 128));
                    var4.method274((byte) 28, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method274((byte) 28, (float) (var5 * 128));
                } else {
                    var4.method297((float) var6 / 8.0F, -11926);
                    var4.method297((float) var5 / 8.0F, -11926);
                    var4.method297((float) (var6 * 128), -11926);
                    var4.method297((float) arg0[arg1 + var6][arg2 + var5], -11926);
                    var4.method297((float) (var5 * 128), -11926);
                }
            }
        }
        if (class36.field529) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field437, 0, var4.field455);
            this.field3485 = new class296();
            this.field3485.method2089(var7);
        } else {
            this.field3487 = ByteBuffer.allocateDirect(var4.field455).order(ByteOrder.nativeOrder());
            this.field3487.put(var4.field437, 0, var4.field455);
            this.field3487.flip();
        }
        class35 var8 = new class35(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class36.field510) {
                    var8.method259(-15195, (var9 + 1) * 9 + var10);
                    var8.method259(-15195, var9 * 9 + var10);
                    var8.method259(-15195, var9 * 9 + var10 + 1);
                    var8.method259(-15195, (var9 + 1) * 9 + var10);
                    var8.method259(-15195, var9 * 9 + var10 + 1);
                    var8.method259(-15195, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method276((var9 + 1) * 9 + var10, false);
                    var8.method276(var9 * 9 + var10, false);
                    var8.method276(var9 * 9 + var10 + 1, false);
                    var8.method276((var9 + 1) * 9 + var10, false);
                    var8.method276(var9 * 9 + var10 + 1, false);
                    var8.method276((var9 + 1) * 9 + var10 + 1, false);
                }
            }
        }
        if (class36.field529) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field437, 0, var8.field455);
            this.field3484 = new class296();
            this.field3484.method2086(var11);
        } else {
            this.field3481 = ByteBuffer.allocateDirect(var8.field455).order(ByteOrder.nativeOrder());
            this.field3481.put(var8.field437, 0, var8.field455);
            this.field3481.flip();
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V", line = 245)
    public class223() {
        GL var1 = class36.field518;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3483 = var2[0];
        class166.field2499 += 16384;
        class36.method310(this.field3483);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
