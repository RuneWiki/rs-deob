import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class314 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    private int field4979 = -1;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Z")
    public boolean field4978 = true;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    private int field4980;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[B")
    private static byte[] field4977 = new byte[16384];

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lme;")
    private class206 field4975;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Lme;")
    private class206 field4976;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4974;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4981;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lta;II)Z", line = 7)
    public final boolean method2163(class217 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field3623;
        int var5 = arg0.field4054;
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
        if (this.field4979 == var7) {
            return false;
        }
        this.field4979 = var7;
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
                    field4977[var11++] = (byte) (var14 * 17);
                } else {
                    field4977[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class43.field651;
        ByteBuffer var16 = ByteBuffer.wrap(field4977);
        var16.limit(16384);
        class43.method390(this.field4980);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V", line = 94)
    public static void method2164() {
        field4977 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([[III)V", line = 98)
    public final void method2165(int[][] arg0, int arg1, int arg2) {
        class336 var4 = new class336(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class43.field639) {
                    var4.method2353((float) var6 / 8.0F, (byte) 124);
                    var4.method2353((float) var5 / 8.0F, (byte) 55);
                    var4.method2353((float) (var6 * 128), (byte) 108);
                    var4.method2353((float) arg0[arg1 + var6][arg2 + var5], (byte) 106);
                    var4.method2353((float) (var5 * 128), (byte) 50);
                } else {
                    var4.method2341((float) var6 / 8.0F, 21536);
                    var4.method2341((float) var5 / 8.0F, 21536);
                    var4.method2341((float) (var6 * 128), 21536);
                    var4.method2341((float) arg0[arg1 + var6][arg2 + var5], 21536);
                    var4.method2341((float) (var5 * 128), 21536);
                }
            }
        }
        if (class43.field674) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field5342, 0, var4.field5353);
            this.field4976 = new class206();
            this.field4976.method1538(var7);
        } else {
            this.field4974 = ByteBuffer.allocateDirect(var4.field5353).order(ByteOrder.nativeOrder());
            this.field4974.put(var4.field5342, 0, var4.field5353);
            this.field4974.flip();
        }
        class336 var8 = new class336(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class43.field639) {
                    var8.method2320(-6128, (var9 + 1) * 9 + var10);
                    var8.method2320(-6128, var9 * 9 + var10);
                    var8.method2320(-6128, var9 * 9 + var10 + 1);
                    var8.method2320(-6128, (var9 + 1) * 9 + var10);
                    var8.method2320(-6128, var9 * 9 + var10 + 1);
                    var8.method2320(-6128, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method2357((var9 + 1) * 9 + var10, (byte) -72);
                    var8.method2357(var9 * 9 + var10, (byte) -72);
                    var8.method2357(var9 * 9 + var10 + 1, (byte) -72);
                    var8.method2357((var9 + 1) * 9 + var10, (byte) -72);
                    var8.method2357(var9 * 9 + var10 + 1, (byte) -72);
                    var8.method2357((var9 + 1) * 9 + var10 + 1, (byte) -72);
                }
            }
        }
        if (class43.field674) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field5342, 0, var8.field5353);
            this.field4975 = new class206();
            this.field4975.method1540(var11);
        } else {
            this.field4981 = ByteBuffer.allocateDirect(var8.field5353).order(ByteOrder.nativeOrder());
            this.field4981.put(var8.field5342, 0, var8.field5353);
            this.field4981.flip();
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "()V", line = 200)
    public final void method2166() {
        GL var1 = class43.field651;
        class43.method390(this.field4980);
        if (this.field4976 == null) {
            if (class43.field674) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field4974);
            class43.field668 = false;
        } else {
            this.field4976.method1539();
            var1.glInterleavedArrays(10791, 20, 0L);
            class43.field668 = false;
        }
        if (this.field4975 == null) {
            if (class43.field674) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field4981);
        } else {
            this.field4975.method1541();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 245)
    public class314() {
        GL var1 = class43.field651;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field4980 = var2[0];
        class151.field2671 += 16384;
        class43.method390(this.field4980);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
