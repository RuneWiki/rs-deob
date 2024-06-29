import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class2 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    private int field9 = -1;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "Z")
    public boolean field12 = true;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[B")
    private static byte[] field10 = new byte[16384];

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Llk;")
    private class34 field11;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Llk;")
    private class34 field14;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field13;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field15;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lfe;II)Z", line = 8)
    public final boolean method5(class153 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field2140;
        int var5 = arg0.field2024;
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
        if (this.field9 == var7) {
            return false;
        }
        this.field9 = var7;
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
                    field10[var11++] = (byte) (var14 * 17);
                } else {
                    field10[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class47.field592;
        ByteBuffer var16 = ByteBuffer.wrap(field10);
        var16.limit(16384);
        class47.method357(this.field8);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()V", line = 95)
    public final void method6() {
        GL var1 = class47.field592;
        class47.method357(this.field8);
        if (this.field14 == null) {
            if (class47.field618) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field13);
            class47.field619 = false;
        } else {
            this.field14.method220();
            var1.glInterleavedArrays(10791, 20, 0L);
            class47.field619 = false;
        }
        if (this.field11 == null) {
            if (class47.field618) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field15);
        } else {
            this.field11.method219();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([[III)V", line = 132)
    public final void method7(int[][] arg0, int arg1, int arg2) {
        class299 var4 = new class299(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class47.field593) {
                    var4.method2071(true, (float) var6 / 8.0F);
                    var4.method2071(true, (float) var5 / 8.0F);
                    var4.method2071(true, (float) (var6 * 128));
                    var4.method2071(true, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method2071(true, (float) (var5 * 128));
                } else {
                    var4.method2099((float) var6 / 8.0F, -2503);
                    var4.method2099((float) var5 / 8.0F, -2503);
                    var4.method2099((float) (var6 * 128), -2503);
                    var4.method2099((float) arg0[arg1 + var6][arg2 + var5], -2503);
                    var4.method2099((float) (var5 * 128), -2503);
                }
            }
        }
        if (class47.field618) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field4350, 0, var4.field4351);
            this.field14 = new class34();
            this.field14.method218(var7);
        } else {
            this.field13 = ByteBuffer.allocateDirect(var4.field4351).order(ByteOrder.nativeOrder());
            this.field13.put(var4.field4350, 0, var4.field4351);
            this.field13.flip();
        }
        class299 var8 = new class299(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class47.field593) {
                    var8.method2084(true, (var9 + 1) * 9 + var10);
                    var8.method2084(true, var9 * 9 + var10);
                    var8.method2084(true, var9 * 9 + var10 + 1);
                    var8.method2084(true, (var9 + 1) * 9 + var10);
                    var8.method2084(true, var9 * 9 + var10 + 1);
                    var8.method2084(true, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method2066((var9 + 1) * 9 + var10, false);
                    var8.method2066(var9 * 9 + var10, false);
                    var8.method2066(var9 * 9 + var10 + 1, false);
                    var8.method2066((var9 + 1) * 9 + var10, false);
                    var8.method2066(var9 * 9 + var10 + 1, false);
                    var8.method2066((var9 + 1) * 9 + var10 + 1, false);
                }
            }
        }
        if (class47.field618) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field4350, 0, var8.field4351);
            this.field11 = new class34();
            this.field11.method217(var11);
        } else {
            this.field15 = ByteBuffer.allocateDirect(var8.field4351).order(ByteOrder.nativeOrder());
            this.field15.put(var8.field4350, 0, var8.field4351);
            this.field15.flip();
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V", line = 245)
    public class2() {
        GL var1 = class47.field592;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field8 = var2[0];
        class298.field4318 += 16384;
        class47.method357(this.field8);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V", line = 243)
    public static void method8() {
        field10 = null;
    }
}
