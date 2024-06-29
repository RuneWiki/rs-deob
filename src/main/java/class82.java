import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class82 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
    public boolean field1582 = true;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    private int field1588 = -1;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[B")
    private static byte[] field1583 = new byte[16384];

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Lle;")
    private class231 field1587;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lle;")
    private class231 field1589;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1584;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1586;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V", line = 8)
    public static void method586() {
        field1583 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lmg;II)Z", line = 13)
    public final boolean method587(class113 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field1984;
        int var5 = arg0.field1968;
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
        if (this.field1588 == var7) {
            return false;
        }
        this.field1588 = var7;
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
                    field1583[var11++] = (byte) (var14 * 17);
                } else {
                    field1583[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class249.field3898;
        ByteBuffer var16 = ByteBuffer.wrap(field1583);
        var16.limit(16384);
        class249.method1689(this.field1585);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 245)
    public class82() {
        GL var1 = class249.field3898;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1585 = var2[0];
        class258.field4014 += 16384;
        class249.method1689(this.field1585);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()V", line = 106)
    public final void method588() {
        GL var1 = class249.field3898;
        class249.method1689(this.field1585);
        if (this.field1587 == null) {
            if (class249.field3877) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field1584);
            class249.field3876 = false;
        } else {
            this.field1587.method1529();
            var1.glInterleavedArrays(10791, 20, 0L);
            class249.field3876 = false;
        }
        if (this.field1589 == null) {
            if (class249.field3877) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field1586);
        } else {
            this.field1589.method1531();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([[III)V", line = 142)
    public final void method589(int[][] arg0, int arg1, int arg2) {
        class202 var4 = new class202(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class249.field3916) {
                    var4.method1328(27700, (float) var6 / 8.0F);
                    var4.method1328(27700, (float) var5 / 8.0F);
                    var4.method1328(27700, (float) (var6 * 128));
                    var4.method1328(27700, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1328(27700, (float) (var5 * 128));
                } else {
                    var4.method1301((float) var6 / 8.0F, false);
                    var4.method1301((float) var5 / 8.0F, false);
                    var4.method1301((float) (var6 * 128), false);
                    var4.method1301((float) arg0[arg1 + var6][arg2 + var5], false);
                    var4.method1301((float) (var5 * 128), false);
                }
            }
        }
        if (class249.field3877) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field3273, 0, var4.field3249);
            this.field1587 = new class231();
            this.field1587.method1532(var7);
        } else {
            this.field1584 = ByteBuffer.allocateDirect(var4.field3249).order(ByteOrder.nativeOrder());
            this.field1584.put(var4.field3273, 0, var4.field3249);
            this.field1584.flip();
        }
        class202 var8 = new class202(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class249.field3916) {
                    var8.method1359(16705, (var9 + 1) * 9 + var10);
                    var8.method1359(16705, var9 * 9 + var10);
                    var8.method1359(16705, var9 * 9 + var10 + 1);
                    var8.method1359(16705, (var9 + 1) * 9 + var10);
                    var8.method1359(16705, var9 * 9 + var10 + 1);
                    var8.method1359(16705, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method1348((var9 + 1) * 9 + var10, true);
                    var8.method1348(var9 * 9 + var10, true);
                    var8.method1348(var9 * 9 + var10 + 1, true);
                    var8.method1348((var9 + 1) * 9 + var10, true);
                    var8.method1348(var9 * 9 + var10 + 1, true);
                    var8.method1348((var9 + 1) * 9 + var10 + 1, true);
                }
            }
        }
        if (class249.field3877) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field3273, 0, var8.field3249);
            this.field1589 = new class231();
            this.field1589.method1530(var11);
        } else {
            this.field1586 = ByteBuffer.allocateDirect(var8.field3249).order(ByteOrder.nativeOrder());
            this.field1586.put(var8.field3273, 0, var8.field3249);
            this.field1586.flip();
        }
    }
}
