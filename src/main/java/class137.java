import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class137 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "Z")
    public boolean field2205 = true;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    private int field2210 = -1;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    private int field2206;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "[B")
    private static byte[] field2207 = new byte[16384];

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Leh;")
    private class40 field2208;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Leh;")
    private class40 field2211;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2204;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2209;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([[III)V", line = 8)
    public final void method906(int[][] arg0, int arg1, int arg2) {
        class3 var4 = new class3(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class264.field4297) {
                    var4.method28((float) var6 / 8.0F, 10894);
                    var4.method28((float) var5 / 8.0F, 10894);
                    var4.method28((float) (var6 * 128), 10894);
                    var4.method28((float) arg0[arg1 + var6][arg2 + var5], 10894);
                    var4.method28((float) (var5 * 128), 10894);
                } else {
                    var4.method44(19679, (float) var6 / 8.0F);
                    var4.method44(19679, (float) var5 / 8.0F);
                    var4.method44(19679, (float) (var6 * 128));
                    var4.method44(19679, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method44(19679, (float) (var5 * 128));
                }
            }
        }
        if (class264.field4314) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field101, 0, var4.field44);
            this.field2208 = new class40();
            this.field2208.method315(var7);
        } else {
            this.field2204 = ByteBuffer.allocateDirect(var4.field44).order(ByteOrder.nativeOrder());
            this.field2204.put(var4.field101, 0, var4.field44);
            this.field2204.flip();
        }
        class3 var8 = new class3(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class264.field4297) {
                    var8.method26((var9 + 1) * 9 + var10, 90);
                    var8.method26(var9 * 9 + var10, 16);
                    var8.method26(var9 * 9 + var10 + 1, 29);
                    var8.method26((var9 + 1) * 9 + var10, 26);
                    var8.method26(var9 * 9 + var10 + 1, 60);
                    var8.method26((var9 + 1) * 9 + var10 + 1, 70);
                } else {
                    var8.method38(true, (var9 + 1) * 9 + var10);
                    var8.method38(true, var9 * 9 + var10);
                    var8.method38(true, var9 * 9 + var10 + 1);
                    var8.method38(true, (var9 + 1) * 9 + var10);
                    var8.method38(true, var9 * 9 + var10 + 1);
                    var8.method38(true, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class264.field4314) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field101, 0, var8.field44);
            this.field2211 = new class40();
            this.field2211.method318(var11);
        } else {
            this.field2209 = ByteBuffer.allocateDirect(var8.field44).order(ByteOrder.nativeOrder());
            this.field2209.put(var8.field101, 0, var8.field44);
            this.field2209.flip();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 110)
    public final void method907() {
        GL var1 = class264.field4313;
        class264.method1722(this.field2206);
        if (this.field2208 == null) {
            if (class264.field4314) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2204);
            class264.field4292 = false;
        } else {
            this.field2208.method316();
            var1.glInterleavedArrays(10791, 20, 0L);
            class264.field4292 = false;
        }
        if (this.field2211 == null) {
            if (class264.field4314) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2209);
        } else {
            this.field2211.method314();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lve;II)Z", line = 148)
    public final boolean method908(class33 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field474;
        int var5 = arg0.field1243;
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
        if (this.field2210 == var7) {
            return false;
        }
        this.field2210 = var7;
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
                    field2207[var11++] = (byte) (var14 * 17);
                } else {
                    field2207[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class264.field4313;
        ByteBuffer var16 = ByteBuffer.wrap(field2207);
        var16.limit(16384);
        class264.method1722(this.field2206);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()V", line = 235)
    public static void method909() {
        field2207 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 245)
    public class137() {
        GL var1 = class264.field4313;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2206 = var2[0];
        class143.field2279 += 16384;
        class264.method1722(this.field2206);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
