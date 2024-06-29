import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class172 {

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    private int field2802 = -1;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "Z")
    public boolean field2806 = true;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    private int field2804;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[B")
    private static byte[] field2803 = new byte[16384];

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Ltl;")
    private class257 field2799;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Ltl;")
    private class257 field2800;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2801;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2805;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([[III)V", line = 7)
    public final void method1234(int[][] arg0, int arg1, int arg2) {
        class112 var4 = new class112(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class166.field2642) {
                    var4.method770(false, (float) var6 / 8.0F);
                    var4.method770(false, (float) var5 / 8.0F);
                    var4.method770(false, (float) (var6 * 128));
                    var4.method770(false, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method770(false, (float) (var5 * 128));
                } else {
                    var4.method812(-17216, (float) var6 / 8.0F);
                    var4.method812(-17216, (float) var5 / 8.0F);
                    var4.method812(-17216, (float) (var6 * 128));
                    var4.method812(-17216, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method812(-17216, (float) (var5 * 128));
                }
            }
        }
        if (class166.field2622) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field1607, 0, var4.field1640);
            this.field2799 = new class257();
            this.field2799.method1821(var7);
        } else {
            this.field2805 = ByteBuffer.allocateDirect(var4.field1640).order(ByteOrder.nativeOrder());
            this.field2805.put(var4.field1607, 0, var4.field1640);
            this.field2805.flip();
        }
        class112 var8 = new class112(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class166.field2642) {
                    var8.method787(853918096, (var9 + 1) * 9 + var10);
                    var8.method787(853918096, var9 * 9 + var10);
                    var8.method787(853918096, var9 * 9 + var10 + 1);
                    var8.method787(853918096, (var9 + 1) * 9 + var10);
                    var8.method787(853918096, var9 * 9 + var10 + 1);
                    var8.method787(853918096, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method804(true, (var9 + 1) * 9 + var10);
                    var8.method804(true, var9 * 9 + var10);
                    var8.method804(true, var9 * 9 + var10 + 1);
                    var8.method804(true, (var9 + 1) * 9 + var10);
                    var8.method804(true, var9 * 9 + var10 + 1);
                    var8.method804(true, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class166.field2622) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field1607, 0, var8.field1640);
            this.field2800 = new class257();
            this.field2800.method1822(var11);
        } else {
            this.field2801 = ByteBuffer.allocateDirect(var8.field1640).order(ByteOrder.nativeOrder());
            this.field2801.put(var8.field1607, 0, var8.field1640);
            this.field2801.flip();
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()V", line = 112)
    public static void method1235() {
        field2803 = null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()V", line = 116)
    public final void method1236() {
        GL var1 = class166.field2648;
        class166.method1182(this.field2804);
        if (this.field2799 == null) {
            if (class166.field2622) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field2805);
            class166.field2652 = false;
        } else {
            this.field2799.method1823();
            var1.glInterleavedArrays(10791, 20, 0L);
            class166.field2652 = false;
        }
        if (this.field2800 == null) {
            if (class166.field2622) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field2801);
        } else {
            this.field2800.method1824();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lka;II)Z", line = 153)
    public final boolean method1237(class279 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field4561;
        int var5 = arg0.field5306;
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
        if (this.field2802 == var7) {
            return false;
        }
        this.field2802 = var7;
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
                    field2803[var11++] = (byte) (var14 * 17);
                } else {
                    field2803[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class166.field2648;
        ByteBuffer var16 = ByteBuffer.wrap(field2803);
        var16.limit(16384);
        class166.method1182(this.field2804);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V", line = 245)
    public class172() {
        GL var1 = class166.field2648;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field2804 = var2[0];
        class103.field1457 += 16384;
        class166.method1182(this.field2804);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }
}
