import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class168 {

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Z")
    public boolean field2714 = true;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    private int field2719 = -1;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    private int field2713;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[B")
    private static byte[] field2718 = new byte[16384];

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Ljh;")
    private class225 field2712;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Ljh;")
    private class225 field2717;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2715;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2716;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Llj;II)Z", line = 9)
    public final boolean method1186(class5 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field59;
        int var5 = arg0.field3162;
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
        if (this.field2719 == var7) {
            return false;
        }
        this.field2719 = var7;
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
                    field2718[var11++] = (byte) (var14 * 17);
                } else {
                    field2718[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class55.field812;
        ByteBuffer var16 = ByteBuffer.wrap(field2718);
        var16.limit(16384);
        class55.method407(this.field2713);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()V", line = 93)
    public static void method1187() {
        field2718 = null;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 245)
    public class168() {
        GL var1 = class55.field812;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2713 = var2[0];
        class104.field1711 += 16384;
        class55.method407(this.field2713);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()V", line = 104)
    public final void method1188() {
        GL var1 = class55.field812;
        class55.method407(this.field2713);
        if (this.field2712 == null) {
            if (class55.field798) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2715);
            class55.field823 = false;
        } else {
            this.field2712.method1548();
            var1.glInterleavedArrays(10791, 20, 0L);
            class55.field823 = false;
        }
        if (this.field2717 == null) {
            if (class55.field798) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2716);
        } else {
            this.field2717.method1552();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([[III)V", line = 137)
    public final void method1189(int[][] arg0, int arg1, int arg2) {
        class170 var4 = new class170(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class55.field819) {
                    var4.method1230((byte) 113, (float) var6 / 8.0F);
                    var4.method1230((byte) 113, (float) var5 / 8.0F);
                    var4.method1230((byte) 108, (float) (var6 * 128));
                    var4.method1230((byte) 95, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1230((byte) 105, (float) (var5 * 128));
                } else {
                    var4.method1252((float) var6 / 8.0F, -103);
                    var4.method1252((float) var5 / 8.0F, 100);
                    var4.method1252((float) (var6 * 128), -120);
                    var4.method1252((float) arg0[arg1 + var6][arg2 + var5], -83);
                    var4.method1252((float) (var5 * 128), -31);
                }
            }
        }
        if (class55.field798) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field2758, 0, var4.field2787);
            this.field2712 = new class225();
            this.field2712.method1550(var7);
        } else {
            this.field2715 = ByteBuffer.allocateDirect(var4.field2787).order(ByteOrder.nativeOrder());
            this.field2715.put(var4.field2758, 0, var4.field2787);
            this.field2715.flip();
        }
        class170 var8 = new class170(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class55.field819) {
                    var8.method1213(-1, (var9 + 1) * 9 + var10);
                    var8.method1213(-1, var9 * 9 + var10);
                    var8.method1213(-1, var9 * 9 + var10 + 1);
                    var8.method1213(-1, (var9 + 1) * 9 + var10);
                    var8.method1213(-1, var9 * 9 + var10 + 1);
                    var8.method1213(-1, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method1225((var9 + 1) * 9 + var10, true);
                    var8.method1225(var9 * 9 + var10, true);
                    var8.method1225(var9 * 9 + var10 + 1, true);
                    var8.method1225((var9 + 1) * 9 + var10, true);
                    var8.method1225(var9 * 9 + var10 + 1, true);
                    var8.method1225((var9 + 1) * 9 + var10 + 1, true);
                }
            }
        }
        if (class55.field798) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field2758, 0, var8.field2787);
            this.field2717 = new class225();
            this.field2717.method1549(var11);
        } else {
            this.field2716 = ByteBuffer.allocateDirect(var8.field2787).order(ByteOrder.nativeOrder());
            this.field2716.put(var8.field2758, 0, var8.field2787);
            this.field2716.flip();
        }
    }
}
