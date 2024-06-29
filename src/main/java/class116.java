import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class116 {

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    private int field1822 = -1;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "Z")
    public boolean field1825 = true;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    private int field1827;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "[B")
    private static byte[] field1823 = new byte[16384];

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lde;")
    private class236 field1824;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Lde;")
    private class236 field1826;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1821;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1828;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "()V", line = 8)
    public final void method889() {
        GL var1 = class73.field1051;
        class73.method537(this.field1827);
        if (this.field1826 == null) {
            if (class73.field1066) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field1828);
            class73.field1059 = false;
        } else {
            this.field1826.method1644();
            var1.glInterleavedArrays(10791, 20, 0L);
            class73.field1059 = false;
        }
        if (this.field1824 == null) {
            if (class73.field1066) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field1821);
        } else {
            this.field1824.method1646();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "()V", line = 41)
    public static void method890() {
        field1823 = null;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 245)
    public class116() {
        GL var1 = class73.field1051;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1827 = var2[0];
        class80.field1186 += 16384;
        class73.method537(this.field1827);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lhk;II)Z", line = 53)
    public final boolean method891(class42 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field603;
        int var5 = arg0.field5047;
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
        if (this.field1822 == var7) {
            return false;
        }
        this.field1822 = var7;
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
                    field1823[var11++] = (byte) (var14 * 17);
                } else {
                    field1823[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class73.field1051;
        ByteBuffer var16 = ByteBuffer.wrap(field1823);
        var16.limit(16384);
        class73.method537(this.field1827);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([[III)V", line = 138)
    public final void method892(int[][] arg0, int arg1, int arg2) {
        class254 var4 = new class254(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class73.field1075) {
                    var4.method1779((byte) 3, (float) var6 / 8.0F);
                    var4.method1779((byte) -41, (float) var5 / 8.0F);
                    var4.method1779((byte) 111, (float) (var6 * 128));
                    var4.method1779((byte) 111, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1779((byte) -107, (float) (var5 * 128));
                } else {
                    var4.method1757(114, (float) var6 / 8.0F);
                    var4.method1757(-34, (float) var5 / 8.0F);
                    var4.method1757(97, (float) (var6 * 128));
                    var4.method1757(110, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1757(-73, (float) (var5 * 128));
                }
            }
        }
        if (class73.field1066) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field3840, 0, var4.field3866);
            this.field1826 = new class236();
            this.field1826.method1643(var7);
        } else {
            this.field1828 = ByteBuffer.allocateDirect(var4.field3866).order(ByteOrder.nativeOrder());
            this.field1828.put(var4.field3840, 0, var4.field3866);
            this.field1828.flip();
        }
        class254 var8 = new class254(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class73.field1075) {
                    var8.method1773((var9 + 1) * 9 + var10, false);
                    var8.method1773(var9 * 9 + var10, false);
                    var8.method1773(var9 * 9 + var10 + 1, false);
                    var8.method1773((var9 + 1) * 9 + var10, false);
                    var8.method1773(var9 * 9 + var10 + 1, false);
                    var8.method1773((var9 + 1) * 9 + var10 + 1, false);
                } else {
                    var8.method1772((var9 + 1) * 9 + var10, (byte) 118);
                    var8.method1772(var9 * 9 + var10, (byte) 109);
                    var8.method1772(var9 * 9 + var10 + 1, (byte) 118);
                    var8.method1772((var9 + 1) * 9 + var10, (byte) 120);
                    var8.method1772(var9 * 9 + var10 + 1, (byte) 110);
                    var8.method1772((var9 + 1) * 9 + var10 + 1, (byte) 112);
                }
            }
        }
        if (class73.field1066) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field3840, 0, var8.field3866);
            this.field1824 = new class236();
            this.field1824.method1647(var11);
        } else {
            this.field1821 = ByteBuffer.allocateDirect(var8.field3866).order(ByteOrder.nativeOrder());
            this.field1821.put(var8.field3840, 0, var8.field3866);
            this.field1821.flip();
        }
    }
}
