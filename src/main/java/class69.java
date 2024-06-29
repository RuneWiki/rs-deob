import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class69 {

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Z")
    public boolean field1059 = true;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    private int field1054 = -1;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    private int field1057;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "[B")
    private static byte[] field1053 = new byte[16384];

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lib;")
    private class35 field1056;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lib;")
    private class35 field1058;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1055;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1060;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lkk;II)Z", line = 8)
    public final boolean method667(class77 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field1124;
        int var5 = arg0.field3827;
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
        if (this.field1054 == var7) {
            return false;
        }
        this.field1054 = var7;
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
                    field1053[var11++] = (byte) (var14 * 17);
                } else {
                    field1053[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class240.field3771;
        ByteBuffer var16 = ByteBuffer.wrap(field1053);
        var16.limit(16384);
        class240.method1786(this.field1057);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 95)
    public static void method668() {
        field1053 = null;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V", line = 102)
    public final void method669() {
        GL var1 = class240.field3771;
        class240.method1786(this.field1057);
        if (this.field1056 == null) {
            if (class240.field3764) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field1060);
            class240.field3740 = false;
        } else {
            this.field1056.method358();
            var1.glInterleavedArrays(10791, 20, 0L);
            class240.field3740 = false;
        }
        if (this.field1058 == null) {
            if (class240.field3764) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field1055);
        } else {
            this.field1058.method360();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 245)
    public class69() {
        GL var1 = class240.field3771;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1057 = var2[0];
        class28.field459 += 16384;
        class240.method1786(this.field1057);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([[III)V", line = 141)
    public final void method670(int[][] arg0, int arg1, int arg2) {
        class25 var4 = new class25(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class240.field3757) {
                    var4.method299((float) var6 / 8.0F, -891392056);
                    var4.method299((float) var5 / 8.0F, -891392056);
                    var4.method299((float) (var6 * 128), -891392056);
                    var4.method299((float) arg0[arg1 + var6][arg2 + var5], -891392056);
                    var4.method299((float) (var5 * 128), -891392056);
                } else {
                    var4.method300((byte) -30, (float) var6 / 8.0F);
                    var4.method300((byte) -30, (float) var5 / 8.0F);
                    var4.method300((byte) -30, (float) (var6 * 128));
                    var4.method300((byte) -30, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method300((byte) -30, (float) (var5 * 128));
                }
            }
        }
        if (class240.field3764) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field448, 0, var4.field397);
            this.field1056 = new class35();
            this.field1056.method359(var7);
        } else {
            this.field1060 = ByteBuffer.allocateDirect(var4.field397).order(ByteOrder.nativeOrder());
            this.field1060.put(var4.field448, 0, var4.field397);
            this.field1060.flip();
        }
        class25 var8 = new class25(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class240.field3757) {
                    var8.method310(66, (var9 + 1) * 9 + var10);
                    var8.method310(54, var9 * 9 + var10);
                    var8.method310(124, var9 * 9 + var10 + 1);
                    var8.method310(46, (var9 + 1) * 9 + var10);
                    var8.method310(56, var9 * 9 + var10 + 1);
                    var8.method310(97, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method288(true, (var9 + 1) * 9 + var10);
                    var8.method288(true, var9 * 9 + var10);
                    var8.method288(true, var9 * 9 + var10 + 1);
                    var8.method288(true, (var9 + 1) * 9 + var10);
                    var8.method288(true, var9 * 9 + var10 + 1);
                    var8.method288(true, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class240.field3764) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field448, 0, var8.field397);
            this.field1058 = new class35();
            this.field1058.method362(var11);
        } else {
            this.field1055 = ByteBuffer.allocateDirect(var8.field397).order(ByteOrder.nativeOrder());
            this.field1055.put(var8.field448, 0, var8.field397);
            this.field1055.flip();
        }
    }
}
