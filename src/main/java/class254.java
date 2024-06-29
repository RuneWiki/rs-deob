import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class254 {

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Z")
    public boolean field4347 = true;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    private int field4351 = -1;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    private int field4352;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "[B")
    private static byte[] field4346 = new byte[16384];

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Lwk;")
    private class54 field4348;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Lwk;")
    private class54 field4350;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4349;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4353;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([[III)V", line = 9)
    public final void method1777(int[][] arg0, int arg1, int arg2) {
        class221 var4 = new class221(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class45.field675) {
                    var4.method1538(false, (float) var6 / 8.0F);
                    var4.method1538(false, (float) var5 / 8.0F);
                    var4.method1538(false, (float) (var6 * 128));
                    var4.method1538(false, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1538(false, (float) (var5 * 128));
                } else {
                    var4.method1558(-110, (float) var6 / 8.0F);
                    var4.method1558(-121, (float) var5 / 8.0F);
                    var4.method1558(-77, (float) (var6 * 128));
                    var4.method1558(-92, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method1558(-90, (float) (var5 * 128));
                }
            }
        }
        if (class45.field674) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field3617, 0, var4.field3610);
            this.field4350 = new class54();
            this.field4350.method415(var7);
        } else {
            this.field4349 = ByteBuffer.allocateDirect(var4.field3610).order(ByteOrder.nativeOrder());
            this.field4349.put(var4.field3617, 0, var4.field3610);
            this.field4349.flip();
        }
        class221 var8 = new class221(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class45.field675) {
                    var8.method1513((var9 + 1) * 9 + var10, false);
                    var8.method1513(var9 * 9 + var10, false);
                    var8.method1513(var9 * 9 + var10 + 1, false);
                    var8.method1513((var9 + 1) * 9 + var10, false);
                    var8.method1513(var9 * 9 + var10 + 1, false);
                    var8.method1513((var9 + 1) * 9 + var10 + 1, false);
                } else {
                    var8.method1511((var9 + 1) * 9 + var10, (byte) 108);
                    var8.method1511(var9 * 9 + var10, (byte) 96);
                    var8.method1511(var9 * 9 + var10 + 1, (byte) 106);
                    var8.method1511((var9 + 1) * 9 + var10, (byte) 108);
                    var8.method1511(var9 * 9 + var10 + 1, (byte) 101);
                    var8.method1511((var9 + 1) * 9 + var10 + 1, (byte) 108);
                }
            }
        }
        if (class45.field674) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field3617, 0, var8.field3610);
            this.field4348 = new class54();
            this.field4348.method417(var11);
        } else {
            this.field4353 = ByteBuffer.allocateDirect(var8.field3610).order(ByteOrder.nativeOrder());
            this.field4353.put(var8.field3617, 0, var8.field3610);
            this.field4353.flip();
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()V", line = 110)
    public static void method1778() {
        field4346 = null;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 160)
    public class254() {
        GL var1 = class45.field688;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field4352 = var2[0];
        class36.field574 += 16384;
        class45.method321(this.field4352);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()V", line = 119)
    public final void method1779() {
        GL var1 = class45.field688;
        class45.method321(this.field4352);
        if (this.field4350 == null) {
            if (class45.field674) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field4349);
            class45.field671 = false;
        } else {
            this.field4350.method414();
            var1.glInterleavedArrays(10791, 20, 0L);
            class45.field671 = false;
        }
        if (this.field4348 == null) {
            if (class45.field674) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field4353);
        } else {
            this.field4348.method418();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lla;II)Z", line = 176)
    public final boolean method1780(class178 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field2704;
        int var5 = arg0.field1163;
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
        if (this.field4351 == var7) {
            return false;
        }
        this.field4351 = var7;
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
                    field4346[var11++] = (byte) (var14 * 17);
                } else {
                    field4346[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class45.field688;
        ByteBuffer var16 = ByteBuffer.wrap(field4346);
        var16.limit(16384);
        class45.method321(this.field4352);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }
}
