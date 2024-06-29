import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class42 {

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Z")
    public boolean field518 = true;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    private int field521 = -1;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[B")
    private static byte[] field520 = new byte[16384];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lie;")
    private class47 field514;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lie;")
    private class47 field519;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field515;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field516;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V", line = 8)
    public final void method230() {
        GL var1 = class90.field1390;
        class90.method617(this.field517);
        if (this.field514 == null) {
            if (class90.field1383) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field515);
            class90.field1366 = false;
        } else {
            this.field514.method255();
            var1.glInterleavedArrays(10791, 20, 0L);
            class90.field1366 = false;
        }
        if (this.field519 == null) {
            if (class90.field1383) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field516);
        } else {
            this.field519.method253();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V", line = 40)
    public static void method231() {
        field520 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([[III)V", line = 44)
    public final void method232(int[][] arg0, int arg1, int arg2) {
        class153 var4 = new class153(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class90.field1369) {
                    var4.method1098(0, (float) var6 / 8.0F);
                    var4.method1098(0, (float) var5 / 8.0F);
                    var4.method1098(0, (float) (var6 * 128));
                    var4.method1098(0, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1098(0, (float) (var5 * 128));
                } else {
                    var4.method1070((byte) -113, (float) var6 / 8.0F);
                    var4.method1070((byte) -117, (float) var5 / 8.0F);
                    var4.method1070((byte) -121, (float) (var6 * 128));
                    var4.method1070((byte) -108, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1070((byte) -122, (float) (var5 * 128));
                }
            }
        }
        if (class90.field1383) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field2359, 0, var4.field2367);
            this.field514 = new class47();
            this.field514.method252(var7);
        } else {
            this.field515 = ByteBuffer.allocateDirect(var4.field2367).order(ByteOrder.nativeOrder());
            this.field515.put(var4.field2359, 0, var4.field2367);
            this.field515.flip();
        }
        class153 var8 = new class153(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class90.field1369) {
                    var8.method1045((var9 + 1) * 9 + var10, (byte) 78);
                    var8.method1045(var9 * 9 + var10, (byte) 94);
                    var8.method1045(var9 * 9 + var10 + 1, (byte) 27);
                    var8.method1045((var9 + 1) * 9 + var10, (byte) 103);
                    var8.method1045(var9 * 9 + var10 + 1, (byte) 43);
                    var8.method1045((var9 + 1) * 9 + var10 + 1, (byte) 65);
                } else {
                    var8.method1057(false, (var9 + 1) * 9 + var10);
                    var8.method1057(false, var9 * 9 + var10);
                    var8.method1057(false, var9 * 9 + var10 + 1);
                    var8.method1057(false, (var9 + 1) * 9 + var10);
                    var8.method1057(false, var9 * 9 + var10 + 1);
                    var8.method1057(false, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class90.field1383) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field2359, 0, var8.field2367);
            this.field519 = new class47();
            this.field519.method254(var11);
        } else {
            this.field516 = ByteBuffer.allocateDirect(var8.field2367).order(ByteOrder.nativeOrder());
            this.field516.put(var8.field2359, 0, var8.field2367);
            this.field516.flip();
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lgk;II)Z", line = 148)
    public final boolean method233(class265 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field4472;
        int var5 = arg0.field3139;
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
        if (this.field521 == var7) {
            return false;
        }
        this.field521 = var7;
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
                    field520[var11++] = (byte) (var14 * 17);
                } else {
                    field520[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class90.field1390;
        ByteBuffer var16 = ByteBuffer.wrap(field520);
        var16.limit(16384);
        class90.method617(this.field517);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 245)
    public class42() {
        GL var1 = class90.field1390;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field517 = var2[0];
        class7.field89 += 16384;
        class90.method617(this.field517);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
