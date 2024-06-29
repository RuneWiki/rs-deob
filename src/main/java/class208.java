import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class208 {

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    private int field3146 = -1;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Z")
    public boolean field3150 = true;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    private int field3149;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "[B")
    private static byte[] field3145 = new byte[16384];

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lmc;")
    private class52 field3143;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Lmc;")
    private class52 field3147;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3144;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3148;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([[III)V", line = 10)
    public final void method1426(int[][] arg0, int arg1, int arg2) {
        class263 var4 = new class263(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class117.field1811) {
                    var4.method1811((float) var6 / 8.0F, false);
                    var4.method1811((float) var5 / 8.0F, false);
                    var4.method1811((float) (var6 * 128), false);
                    var4.method1811((float) arg0[arg1 + var6][arg2 + var5], false);
                    var4.method1811((float) (var5 * 128), false);
                } else {
                    var4.method1821((float) var6 / 8.0F, -105);
                    var4.method1821((float) var5 / 8.0F, -118);
                    var4.method1821((float) (var6 * 128), -113);
                    var4.method1821((float) arg0[arg1 + var6][arg2 + var5], -120);
                    var4.method1821((float) (var5 * 128), -103);
                }
            }
        }
        if (class117.field1802) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field3986, 0, var4.field4025);
            this.field3143 = new class52();
            this.field3143.method348(var7);
        } else {
            this.field3148 = ByteBuffer.allocateDirect(var4.field4025).order(ByteOrder.nativeOrder());
            this.field3148.put(var4.field3986, 0, var4.field4025);
            this.field3148.flip();
        }
        class263 var8 = new class263(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class117.field1811) {
                    var8.method1815(121, (var9 + 1) * 9 + var10);
                    var8.method1815(109, var9 * 9 + var10);
                    var8.method1815(125, var9 * 9 + var10 + 1);
                    var8.method1815(125, (var9 + 1) * 9 + var10);
                    var8.method1815(74, var9 * 9 + var10 + 1);
                    var8.method1815(118, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method1829((var9 + 1) * 9 + var10, 3);
                    var8.method1829(var9 * 9 + var10, 3);
                    var8.method1829(var9 * 9 + var10 + 1, 3);
                    var8.method1829((var9 + 1) * 9 + var10, 3);
                    var8.method1829(var9 * 9 + var10 + 1, 3);
                    var8.method1829((var9 + 1) * 9 + var10 + 1, 3);
                }
            }
        }
        if (class117.field1802) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field3986, 0, var8.field4025);
            this.field3147 = new class52();
            this.field3147.method347(var11);
        } else {
            this.field3144 = ByteBuffer.allocateDirect(var8.field4025).order(ByteOrder.nativeOrder());
            this.field3144.put(var8.field3986, 0, var8.field4025);
            this.field3144.flip();
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lpj;II)Z", line = 112)
    public final boolean method1427(class59 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field789;
        int var5 = arg0.field2350;
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
        if (this.field3146 == var7) {
            return false;
        }
        this.field3146 = var7;
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
                    field3145[var11++] = (byte) (var14 * 17);
                } else {
                    field3145[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class117.field1801;
        ByteBuffer var16 = ByteBuffer.wrap(field3145);
        var16.limit(16384);
        class117.method814(this.field3149);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V", line = 197)
    public final void method1428() {
        GL var1 = class117.field1801;
        class117.method814(this.field3149);
        if (this.field3143 == null) {
            if (class117.field1802) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field3148);
            class117.field1797 = false;
        } else {
            this.field3143.method345();
            var1.glInterleavedArrays(10791, 20, 0L);
            class117.field1797 = false;
        }
        if (this.field3147 == null) {
            if (class117.field1802) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field3144);
        } else {
            this.field3147.method346();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 245)
    public class208() {
        GL var1 = class117.field1801;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field3149 = var2[0];
        class174.field2592 += 16384;
        class117.method814(this.field3149);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()V", line = 239)
    public static void method1429() {
        field3145 = null;
    }
}
