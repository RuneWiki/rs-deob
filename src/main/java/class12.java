import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class12 {

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    private int field123 = -1;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Z")
    public boolean field121 = true;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[B")
    private static byte[] field122 = new byte[16384];

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lhb;")
    private class305 field124;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Lhb;")
    private class305 field126;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field125;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field128;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()V", line = 7)
    public final void method68() {
        GL var1 = class67.field899;
        class67.method479(this.field127);
        if (this.field126 == null) {
            if (class67.field914) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field128);
            class67.field917 = false;
        } else {
            this.field126.method2076();
            var1.glInterleavedArrays(10791, 20, 0L);
            class67.field917 = false;
        }
        if (this.field124 == null) {
            if (class67.field914) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field125);
        } else {
            this.field124.method2077();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ltj;II)Z", line = 41)
    public final boolean method69(class258 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field3809;
        int var5 = arg0.field28;
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
        if (this.field123 == var7) {
            return false;
        }
        this.field123 = var7;
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
                    field122[var11++] = (byte) (var14 * 17);
                } else {
                    field122[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class67.field899;
        ByteBuffer var16 = ByteBuffer.wrap(field122);
        var16.limit(16384);
        class67.method479(this.field127);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V", line = 127)
    public static void method70() {
        field122 = null;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 245)
    public class12() {
        GL var1 = class67.field899;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field127 = var2[0];
        class180.field2412 += 16384;
        class67.method479(this.field127);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([[III)V", line = 139)
    public final void method71(int[][] arg0, int arg1, int arg2) {
        class316 var4 = new class316(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class67.field916) {
                    var4.method2213(-1, (float) var6 / 8.0F);
                    var4.method2213(-1, (float) var5 / 8.0F);
                    var4.method2213(-1, (float) (var6 * 128));
                    var4.method2213(-1, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method2213(-1, (float) (var5 * 128));
                } else {
                    var4.method2171(-1365938680, (float) var6 / 8.0F);
                    var4.method2171(-1365938680, (float) var5 / 8.0F);
                    var4.method2171(-1365938680, (float) (var6 * 128));
                    var4.method2171(-1365938680, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method2171(-1365938680, (float) (var5 * 128));
                }
            }
        }
        if (class67.field914) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field4798, 0, var4.field4777);
            this.field126 = new class305();
            this.field126.method2075(var7);
        } else {
            this.field128 = ByteBuffer.allocateDirect(var4.field4777).order(ByteOrder.nativeOrder());
            this.field128.put(var4.field4798, 0, var4.field4777);
            this.field128.flip();
        }
        class316 var8 = new class316(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class67.field916) {
                    var8.method2188(255, (var9 + 1) * 9 + var10);
                    var8.method2188(255, var9 * 9 + var10);
                    var8.method2188(255, var9 * 9 + var10 + 1);
                    var8.method2188(255, (var9 + 1) * 9 + var10);
                    var8.method2188(255, var9 * 9 + var10 + 1);
                    var8.method2188(255, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method2155((var9 + 1) * 9 + var10, -118);
                    var8.method2155(var9 * 9 + var10, -118);
                    var8.method2155(var9 * 9 + var10 + 1, -106);
                    var8.method2155((var9 + 1) * 9 + var10, -125);
                    var8.method2155(var9 * 9 + var10 + 1, -127);
                    var8.method2155((var9 + 1) * 9 + var10 + 1, -127);
                }
            }
        }
        if (class67.field914) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field4798, 0, var8.field4777);
            this.field124 = new class305();
            this.field124.method2074(var11);
        } else {
            this.field125 = ByteBuffer.allocateDirect(var8.field4777).order(ByteOrder.nativeOrder());
            this.field125.put(var8.field4798, 0, var8.field4777);
            this.field125.flip();
        }
    }
}
