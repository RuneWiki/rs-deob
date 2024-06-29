import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class328 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "Z")
    public boolean field5215 = true;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    private int field5222 = -1;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    private int field5216;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "[B")
    private static byte[] field5219 = new byte[16384];

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Lbk;")
    private class53 field5220;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Lbk;")
    private class53 field5221;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5217;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5218;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "()V", line = 9)
    public final void method2312() {
        GL var1 = class42.field627;
        class42.method273(this.field5216);
        if (this.field5220 == null) {
            if (class42.field645) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field5218);
            class42.field620 = false;
        } else {
            this.field5220.method422();
            var1.glInterleavedArrays(10791, 20, 0L);
            class42.field620 = false;
        }
        if (this.field5221 == null) {
            if (class42.field645) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field5217);
        } else {
            this.field5221.method423();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V", line = 245)
    public class328() {
        GL var1 = class42.field627;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field5216 = var2[0];
        class199.field3173 += 16384;
        class42.method273(this.field5216);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([[III)V", line = 49)
    public final void method2313(int[][] arg0, int arg1, int arg2) {
        class227 var4 = new class227(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class42.field625) {
                    var4.method1713(false, (float) var6 / 8.0F);
                    var4.method1713(false, (float) var5 / 8.0F);
                    var4.method1713(false, (float) (var6 * 128));
                    var4.method1713(false, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1713(false, (float) (var5 * 128));
                } else {
                    var4.method1738((float) var6 / 8.0F, (byte) -39);
                    var4.method1738((float) var5 / 8.0F, (byte) -39);
                    var4.method1738((float) (var6 * 128), (byte) -39);
                    var4.method1738((float) arg0[arg1 + var6][arg2 + var5], (byte) -39);
                    var4.method1738((float) (var5 * 128), (byte) -39);
                }
            }
        }
        if (class42.field645) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field3793, 0, var4.field3760);
            this.field5220 = new class53();
            this.field5220.method421(var7);
        } else {
            this.field5218 = ByteBuffer.allocateDirect(var4.field3760).order(ByteOrder.nativeOrder());
            this.field5218.put(var4.field3793, 0, var4.field3760);
            this.field5218.flip();
        }
        class227 var8 = new class227(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class42.field625) {
                    var8.method1757((var9 + 1) * 9 + var10, -100);
                    var8.method1757(var9 * 9 + var10, -111);
                    var8.method1757(var9 * 9 + var10 + 1, -126);
                    var8.method1757((var9 + 1) * 9 + var10, -125);
                    var8.method1757(var9 * 9 + var10 + 1, -103);
                    var8.method1757((var9 + 1) * 9 + var10 + 1, -99);
                } else {
                    var8.method1754(false, (var9 + 1) * 9 + var10);
                    var8.method1754(false, var9 * 9 + var10);
                    var8.method1754(false, var9 * 9 + var10 + 1);
                    var8.method1754(false, (var9 + 1) * 9 + var10);
                    var8.method1754(false, var9 * 9 + var10 + 1);
                    var8.method1754(false, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class42.field645) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field3793, 0, var8.field3760);
            this.field5221 = new class53();
            this.field5221.method419(var11);
        } else {
            this.field5217 = ByteBuffer.allocateDirect(var8.field3760).order(ByteOrder.nativeOrder());
            this.field5217.put(var8.field3793, 0, var8.field3760);
            this.field5217.flip();
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Llb;II)Z", line = 155)
    public final boolean method2314(class341 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field5444;
        int var5 = arg0.field4652;
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
        if (this.field5222 == var7) {
            return false;
        }
        this.field5222 = var7;
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
                    field5219[var11++] = (byte) (var14 * 17);
                } else {
                    field5219[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class42.field627;
        ByteBuffer var16 = ByteBuffer.wrap(field5219);
        var16.limit(16384);
        class42.method273(this.field5216);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "()V", line = 239)
    public static void method2315() {
        field5219 = null;
    }
}
