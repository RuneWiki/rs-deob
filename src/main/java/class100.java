import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class100 {

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Z")
    public boolean field1729 = true;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    private int field1732 = -1;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[B")
    private static byte[] field1733 = new byte[16384];

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lam;")
    private class244 field1734;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lam;")
    private class244 field1736;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1731;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1735;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([[III)V", line = 8)
    public final void method623(int[][] arg0, int arg1, int arg2) {
        class194 var4 = new class194(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class247.field4235) {
                    var4.method1328(24180, (float) var6 / 8.0F);
                    var4.method1328(24180, (float) var5 / 8.0F);
                    var4.method1328(24180, (float) (var6 * 128));
                    var4.method1328(24180, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1328(24180, (float) (var5 * 128));
                } else {
                    var4.method1302((float) var6 / 8.0F, -550459832);
                    var4.method1302((float) var5 / 8.0F, -550459832);
                    var4.method1302((float) (var6 * 128), -550459832);
                    var4.method1302((float) arg0[arg1 + var6][arg2 + var5], -550459832);
                    var4.method1302((float) (var5 * 128), -550459832);
                }
            }
        }
        if (class247.field4248) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field3417, 0, var4.field3380);
            this.field1734 = new class244();
            this.field1734.method1662(var7);
        } else {
            this.field1731 = ByteBuffer.allocateDirect(var4.field3380).order(ByteOrder.nativeOrder());
            this.field1731.put(var4.field3417, 0, var4.field3380);
            this.field1731.flip();
        }
        class194 var8 = new class194(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class247.field4235) {
                    var8.method1337(-89, (var9 + 1) * 9 + var10);
                    var8.method1337(-99, var9 * 9 + var10);
                    var8.method1337(-108, var9 * 9 + var10 + 1);
                    var8.method1337(-76, (var9 + 1) * 9 + var10);
                    var8.method1337(-57, var9 * 9 + var10 + 1);
                    var8.method1337(-128, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method1333((var9 + 1) * 9 + var10, (byte) -60);
                    var8.method1333(var9 * 9 + var10, (byte) 82);
                    var8.method1333(var9 * 9 + var10 + 1, (byte) -36);
                    var8.method1333((var9 + 1) * 9 + var10, (byte) -88);
                    var8.method1333(var9 * 9 + var10 + 1, (byte) 64);
                    var8.method1333((var9 + 1) * 9 + var10 + 1, (byte) 98);
                }
            }
        }
        if (class247.field4248) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field3417, 0, var8.field3380);
            this.field1736 = new class244();
            this.field1736.method1664(var11);
        } else {
            this.field1735 = ByteBuffer.allocateDirect(var8.field3380).order(ByteOrder.nativeOrder());
            this.field1735.put(var8.field3417, 0, var8.field3380);
            this.field1735.flip();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lvd;II)Z", line = 110)
    public final boolean method624(class127 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field2163;
        int var5 = arg0.field2625;
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
        if (this.field1732 == var7) {
            return false;
        }
        this.field1732 = var7;
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
                    field1733[var11++] = (byte) (var14 * 17);
                } else {
                    field1733[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class247.field4253;
        ByteBuffer var16 = ByteBuffer.wrap(field1733);
        var16.limit(16384);
        class247.method1691(this.field1730);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()V", line = 194)
    public static void method625() {
        field1733 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()V", line = 199)
    public final void method626() {
        GL var1 = class247.field4253;
        class247.method1691(this.field1730);
        if (this.field1734 == null) {
            if (class247.field4248) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field1731);
            class247.field4233 = false;
        } else {
            this.field1734.method1661();
            var1.glInterleavedArrays(10791, 20, 0L);
            class247.field4233 = false;
        }
        if (this.field1736 == null) {
            if (class247.field4248) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field1735);
        } else {
            this.field1736.method1660();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 245)
    public class100() {
        GL var1 = class247.field4253;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1730 = var2[0];
        class274.field4744 += 16384;
        class247.method1691(this.field1730);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
