import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class186 {

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Z")
    public boolean field3102 = true;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    private int field3105 = -1;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    private int field3103;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "[B")
    private static byte[] field3098 = new byte[16384];

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lsg;")
    private class34 field3099;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Lsg;")
    private class34 field3100;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3101;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3104;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()V", line = 11)
    public final void method1453() {
        GL var1 = class271.field4641;
        class271.method1978(this.field3103);
        if (this.field3099 == null) {
            if (class271.field4634) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field3101);
            class271.field4661 = false;
        } else {
            this.field3099.method246();
            var1.glInterleavedArrays(10791, 20, 0L);
            class271.field4661 = false;
        }
        if (this.field3100 == null) {
            if (class271.field4634) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3104);
        } else {
            this.field3100.method248();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lan;II)Z", line = 45)
    public final boolean method1454(class315 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field5355;
        int var5 = arg0.field480;
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
        if (this.field3105 == var7) {
            return false;
        }
        this.field3105 = var7;
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
                    field3098[var11++] = (byte) (var14 * 17);
                } else {
                    field3098[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class271.field4641;
        ByteBuffer var16 = ByteBuffer.wrap(field3098);
        var16.limit(16384);
        class271.method1978(this.field3103);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([[III)V", line = 132)
    public final void method1455(int[][] arg0, int arg1, int arg2) {
        class47 var4 = new class47(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class271.field4657) {
                    var4.method384((byte) 108, (float) var6 / 8.0F);
                    var4.method384((byte) 108, (float) var5 / 8.0F);
                    var4.method384((byte) 108, (float) (var6 * 128));
                    var4.method384((byte) 108, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method384((byte) 108, (float) (var5 * 128));
                } else {
                    var4.method340((float) var6 / 8.0F, -1489617032);
                    var4.method340((float) var5 / 8.0F, -1489617032);
                    var4.method340((float) (var6 * 128), -1489617032);
                    var4.method340((float) arg0[arg1 + var6][arg2 + var5], -1489617032);
                    var4.method340((float) (var5 * 128), -1489617032);
                }
            }
        }
        if (class271.field4634) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field860, 0, var4.field857);
            this.field3099 = new class34();
            this.field3099.method244(var7);
        } else {
            this.field3101 = ByteBuffer.allocateDirect(var4.field857).order(ByteOrder.nativeOrder());
            this.field3101.put(var4.field860, 0, var4.field857);
            this.field3101.flip();
        }
        class47 var8 = new class47(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class271.field4657) {
                    var8.method387((var9 + 1) * 9 + var10, 86);
                    var8.method387(var9 * 9 + var10, 78);
                    var8.method387(var9 * 9 + var10 + 1, 92);
                    var8.method387((var9 + 1) * 9 + var10, 118);
                    var8.method387(var9 * 9 + var10 + 1, 92);
                    var8.method387((var9 + 1) * 9 + var10 + 1, 99);
                } else {
                    var8.method382((byte) 1, (var9 + 1) * 9 + var10);
                    var8.method382((byte) 1, var9 * 9 + var10);
                    var8.method382((byte) 1, var9 * 9 + var10 + 1);
                    var8.method382((byte) 1, (var9 + 1) * 9 + var10);
                    var8.method382((byte) 1, var9 * 9 + var10 + 1);
                    var8.method382((byte) 1, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class271.field4634) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field860, 0, var8.field857);
            this.field3100 = new class34();
            this.field3100.method245(var11);
        } else {
            this.field3104 = ByteBuffer.allocateDirect(var8.field857).order(ByteOrder.nativeOrder());
            this.field3104.put(var8.field860, 0, var8.field857);
            this.field3104.flip();
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 245)
    public class186() {
        GL var1 = class271.field4641;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3103 = var2[0];
        class68.field1130 += 16384;
        class271.method1978(this.field3103);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()V", line = 240)
    public static void method1456() {
        field3098 = null;
    }
}
