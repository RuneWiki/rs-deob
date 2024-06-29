import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class152 {

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "Z")
    public boolean field2375 = true;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    private int field2381 = -1;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    private int field2377;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "[B")
    private static byte[] field2380 = new byte[16384];

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Lvi;")
    private class6 field2374;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "Lvi;")
    private class6 field2379;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2376;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2378;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([[III)V", line = 10)
    public final void method1033(int[][] arg0, int arg1, int arg2) {
        class82 var4 = new class82(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class255.field4167) {
                    var4.method640(881, (float) var6 / 8.0F);
                    var4.method640(881, (float) var5 / 8.0F);
                    var4.method640(881, (float) (var6 * 128));
                    var4.method640(881, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method640(881, (float) (var5 * 128));
                } else {
                    var4.method601((float) var6 / 8.0F, (byte) 104);
                    var4.method601((float) var5 / 8.0F, (byte) 65);
                    var4.method601((float) (var6 * 128), (byte) 106);
                    var4.method601((float) arg0[arg1 + var6][arg2 + var5], (byte) 79);
                    var4.method601((float) (var5 * 128), (byte) 124);
                }
            }
        }
        if (class255.field4190) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field1280, 0, var4.field1301);
            this.field2379 = new class6();
            this.field2379.method42(var7);
        } else {
            this.field2378 = ByteBuffer.allocateDirect(var4.field1301).order(ByteOrder.nativeOrder());
            this.field2378.put(var4.field1280, 0, var4.field1301);
            this.field2378.flip();
        }
        class82 var8 = new class82(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class255.field4167) {
                    var8.method577(-125, (var9 + 1) * 9 + var10);
                    var8.method577(-128, var9 * 9 + var10);
                    var8.method577(-128, var9 * 9 + var10 + 1);
                    var8.method577(-120, (var9 + 1) * 9 + var10);
                    var8.method577(-127, var9 * 9 + var10 + 1);
                    var8.method577(-122, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method596((var9 + 1) * 9 + var10, 109);
                    var8.method596(var9 * 9 + var10, 122);
                    var8.method596(var9 * 9 + var10 + 1, 67);
                    var8.method596((var9 + 1) * 9 + var10, 116);
                    var8.method596(var9 * 9 + var10 + 1, 90);
                    var8.method596((var9 + 1) * 9 + var10 + 1, 93);
                }
            }
        }
        if (class255.field4190) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field1280, 0, var8.field1301);
            this.field2374 = new class6();
            this.field2374.method40(var11);
        } else {
            this.field2376 = ByteBuffer.allocateDirect(var8.field1301).order(ByteOrder.nativeOrder());
            this.field2376.put(var8.field1280, 0, var8.field1301);
            this.field2376.flip();
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lek;II)Z", line = 112)
    public final boolean method1034(class183 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field2873;
        int var5 = arg0.field2341;
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
        if (this.field2381 == var7) {
            return false;
        }
        this.field2381 = var7;
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
                    field2380[var11++] = (byte) (var14 * 17);
                } else {
                    field2380[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class255.field4181;
        ByteBuffer var16 = ByteBuffer.wrap(field2380);
        var16.limit(16384);
        class255.method1790(this.field2377);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V", line = 197)
    public static void method1035() {
        field2380 = null;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()V", line = 203)
    public final void method1036() {
        GL var1 = class255.field4181;
        class255.method1790(this.field2377);
        if (this.field2379 == null) {
            if (class255.field4190) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2378);
            class255.field4175 = false;
        } else {
            this.field2379.method39();
            var1.glInterleavedArrays(10791, 20, 0L);
            class255.field4175 = false;
        }
        if (this.field2374 == null) {
            if (class255.field4190) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2376);
        } else {
            this.field2374.method41();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V", line = 245)
    public class152() {
        GL var1 = class255.field4181;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2377 = var2[0];
        class197.field3056 += 16384;
        class255.method1790(this.field2377);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
