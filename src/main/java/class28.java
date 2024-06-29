import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class28 {

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Z")
    public boolean field357 = true;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    private int field355 = -1;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "[B")
    private static byte[] field353 = new byte[16384];

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lcb;")
    private class34 field354;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Lcb;")
    private class34 field358;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field359;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field360;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([[III)V", line = 14)
    public final void method169(int[][] arg0, int arg1, int arg2) {
        class92 var4 = new class92(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class154.field2468) {
                    var4.method701(12327, (float) var6 / 8.0F);
                    var4.method701(12327, (float) var5 / 8.0F);
                    var4.method701(12327, (float) (var6 * 128));
                    var4.method701(12327, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method701(12327, (float) (var5 * 128));
                } else {
                    var4.method735((float) var6 / 8.0F, -3);
                    var4.method735((float) var5 / 8.0F, -3);
                    var4.method735((float) (var6 * 128), -3);
                    var4.method735((float) arg0[arg1 + var6][arg2 + var5], -3);
                    var4.method735((float) (var5 * 128), -3);
                }
            }
        }
        if (class154.field2461) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field1495, 0, var4.field1476);
            this.field354 = new class34();
            this.field354.method220(var7);
        } else {
            this.field360 = ByteBuffer.allocateDirect(var4.field1476).order(ByteOrder.nativeOrder());
            this.field360.put(var4.field1495, 0, var4.field1476);
            this.field360.flip();
        }
        class92 var8 = new class92(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class154.field2468) {
                    var8.method712((var9 + 1) * 9 + var10, 114);
                    var8.method712(var9 * 9 + var10, -40);
                    var8.method712(var9 * 9 + var10 + 1, 115);
                    var8.method712((var9 + 1) * 9 + var10, -73);
                    var8.method712(var9 * 9 + var10 + 1, 11);
                    var8.method712((var9 + 1) * 9 + var10 + 1, -64);
                } else {
                    var8.method715(true, (var9 + 1) * 9 + var10);
                    var8.method715(true, var9 * 9 + var10);
                    var8.method715(true, var9 * 9 + var10 + 1);
                    var8.method715(true, (var9 + 1) * 9 + var10);
                    var8.method715(true, var9 * 9 + var10 + 1);
                    var8.method715(true, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class154.field2461) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field1495, 0, var8.field1476);
            this.field358 = new class34();
            this.field358.method222(var11);
        } else {
            this.field359 = ByteBuffer.allocateDirect(var8.field1476).order(ByteOrder.nativeOrder());
            this.field359.put(var8.field1495, 0, var8.field1476);
            this.field359.flip();
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V", line = 116)
    public final void method170() {
        GL var1 = class154.field2479;
        class154.method1141(this.field356);
        if (this.field354 == null) {
            if (class154.field2461) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field360);
            class154.field2478 = false;
        } else {
            this.field354.method221();
            var1.glInterleavedArrays(10791, 20, 0L);
            class154.field2478 = false;
        }
        if (this.field358 == null) {
            if (class154.field2461) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field359);
        } else {
            this.field358.method224();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 245)
    public class28() {
        GL var1 = class154.field2479;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field356 = var2[0];
        class79.field1326 += 16384;
        class154.method1141(this.field356);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lfd;II)Z", line = 153)
    public final boolean method171(class61 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field880;
        int var5 = arg0.field276;
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
        if (this.field355 == var7) {
            return false;
        }
        this.field355 = var7;
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
                    field353[var11++] = (byte) (var14 * 17);
                } else {
                    field353[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class154.field2479;
        ByteBuffer var16 = ByteBuffer.wrap(field353);
        var16.limit(16384);
        class154.method1141(this.field356);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()V", line = 237)
    public static void method172() {
        field353 = null;
    }
}
