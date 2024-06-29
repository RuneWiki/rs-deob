import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class166 {

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    private int field2853 = -1;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Z")
    public boolean field2854 = true;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    private int field2851;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[B")
    private static byte[] field2855 = new byte[16384];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lph;")
    private class79 field2849;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lph;")
    private class79 field2856;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2850;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2852;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([[III)V", line = 8)
    public final void method1135(int[][] arg0, int arg1, int arg2) {
        class14 var4 = new class14(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class108.field1911) {
                    var4.method130(false, (float) var6 / 8.0F);
                    var4.method130(false, (float) var5 / 8.0F);
                    var4.method130(false, (float) (var6 * 128));
                    var4.method130(false, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method130(false, (float) (var5 * 128));
                } else {
                    var4.method91((float) var6 / 8.0F, (byte) -85);
                    var4.method91((float) var5 / 8.0F, (byte) 97);
                    var4.method91((float) (var6 * 128), (byte) -42);
                    var4.method91((float) arg0[arg1 + var6][arg2 + var5], (byte) -64);
                    var4.method91((float) (var5 * 128), (byte) -59);
                }
            }
        }
        if (class108.field1904) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field174, 0, var4.field195);
            this.field2849 = new class79();
            this.field2849.method563(var7);
        } else {
            this.field2850 = ByteBuffer.allocateDirect(var4.field195).order(ByteOrder.nativeOrder());
            this.field2850.put(var4.field174, 0, var4.field195);
            this.field2850.flip();
        }
        class14 var8 = new class14(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class108.field1911) {
                    var8.method100((var9 + 1) * 9 + var10, 65280);
                    var8.method100(var9 * 9 + var10, 65280);
                    var8.method100(var9 * 9 + var10 + 1, 65280);
                    var8.method100((var9 + 1) * 9 + var10, 65280);
                    var8.method100(var9 * 9 + var10 + 1, 65280);
                    var8.method100((var9 + 1) * 9 + var10 + 1, 65280);
                } else {
                    var8.method89((byte) 94, (var9 + 1) * 9 + var10);
                    var8.method89((byte) 94, var9 * 9 + var10);
                    var8.method89((byte) 94, var9 * 9 + var10 + 1);
                    var8.method89((byte) 94, (var9 + 1) * 9 + var10);
                    var8.method89((byte) 94, var9 * 9 + var10 + 1);
                    var8.method89((byte) 94, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class108.field1904) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field174, 0, var8.field195);
            this.field2856 = new class79();
            this.field2856.method561(var11);
        } else {
            this.field2852 = ByteBuffer.allocateDirect(var8.field195).order(ByteOrder.nativeOrder());
            this.field2852.put(var8.field174, 0, var8.field195);
            this.field2852.flip();
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V", line = 110)
    public static void method1136() {
        field2855 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V", line = 114)
    public final void method1137() {
        GL var1 = class108.field1899;
        class108.method736(this.field2851);
        if (this.field2849 == null) {
            if (class108.field1904) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2850);
            class108.field1917 = false;
        } else {
            this.field2849.method564();
            var1.glInterleavedArrays(10791, 20, 0L);
            class108.field1917 = false;
        }
        if (this.field2856 == null) {
            if (class108.field1904) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2852);
        } else {
            this.field2856.method562();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 245)
    public class166() {
        GL var1 = class108.field1899;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2851 = var2[0];
        class263.field4549 += 16384;
        class108.method736(this.field2851);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lrm;II)Z", line = 156)
    public final boolean method1138(class248 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field4376;
        int var5 = arg0.field2294;
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
        if (this.field2853 == var7) {
            return false;
        }
        this.field2853 = var7;
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
                    field2855[var11++] = (byte) (var14 * 17);
                } else {
                    field2855[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class108.field1899;
        ByteBuffer var16 = ByteBuffer.wrap(field2855);
        var16.limit(16384);
        class108.method736(this.field2851);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }
}
