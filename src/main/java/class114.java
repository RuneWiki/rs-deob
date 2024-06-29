import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class114 {

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Z")
    public boolean field1622 = true;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    private int field1621 = -1;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "[B")
    private static byte[] field1623 = new byte[16384];

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Lhl;")
    private class71 field1616;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Lhl;")
    private class71 field1620;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1617;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1619;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ltb;II)Z", line = 7)
    public final boolean method779(class234 arg0, int arg1, int arg2) {
        byte[] var4 = arg0.field3410;
        int var5 = arg0.field4743;
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
        if (this.field1621 == var7) {
            return false;
        }
        this.field1621 = var7;
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
                    field1623[var11++] = (byte) (var14 * 17);
                } else {
                    field1623[var11++] = 68;
                }
                var10++;
            }
            var10 += var5 - 128;
        }
        GL var15 = class250.field3818;
        ByteBuffer var16 = ByteBuffer.wrap(field1623);
        var16.limit(16384);
        class250.method1806(this.field1618);
        var15.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, var16);
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()V", line = 96)
    public final void method780() {
        GL var1 = class250.field3818;
        class250.method1806(this.field1618);
        if (this.field1616 == null) {
            if (class250.field3809) {
                var1.glBindBufferARB(34962, 0);
            }
            var1.glInterleavedArrays(10791, 20, this.field1617);
            class250.field3815 = false;
        } else {
            this.field1616.method436();
            var1.glInterleavedArrays(10791, 20, 0L);
            class250.field3815 = false;
        }
        if (this.field1620 == null) {
            if (class250.field3809) {
                var1.glBindBufferARB(34963, 0);
            }
            var1.glDrawElements(4, 384, 5125, this.field1619);
        } else {
            this.field1620.method435();
            var1.glDrawElements(4, 384, 5125, 0L);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 137)
    public class114() {
        GL var1 = class250.field3818;
        int[] var2 = new int[1];
        var1.glGenTextures(1, var2, 0);
        this.field1618 = var2[0];
        class266.field4196 += 16384;
        class250.method1806(this.field1618);
        var1.glTexParameteri(3553, 10241, 9729);
        var1.glTexParameteri(3553, 10240, 9729);
        var1.glTexParameteri(3553, 10242, 33071);
        var1.glTexParameteri(3553, 10243, 33071);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()V", line = 155)
    public static void method781() {
        field1623 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "([[III)V", line = 159)
    public final void method782(int[][] arg0, int arg1, int arg2) {
        class107 var4 = new class107(1620);
        for (int var5 = 0; var5 <= 8; var5++) {
            for (int var6 = 0; var6 <= 8; var6++) {
                if (class250.field3825) {
                    var4.method673(32166, (float) var6 / 8.0F);
                    var4.method673(32166, (float) var5 / 8.0F);
                    var4.method673(32166, (float) (var6 * 128));
                    var4.method673(32166, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method673(32166, (float) (var5 * 128));
                } else {
                    var4.method682(105, (float) var6 / 8.0F);
                    var4.method682(-111, (float) var5 / 8.0F);
                    var4.method682(-90, (float) (var6 * 128));
                    var4.method682(48, (float) arg0[arg1 + var6][arg2 + var5]);
                    var4.method682(48, (float) (var5 * 128));
                }
            }
        }
        if (class250.field3809) {
            ByteBuffer var7 = ByteBuffer.wrap(var4.field1388, 0, var4.field1400);
            this.field1616 = new class71();
            this.field1616.method432(var7);
        } else {
            this.field1617 = ByteBuffer.allocateDirect(var4.field1400).order(ByteOrder.nativeOrder());
            this.field1617.put(var4.field1388, 0, var4.field1400);
            this.field1617.flip();
        }
        class107 var8 = new class107(1536);
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 8; var10++) {
                if (class250.field3825) {
                    var8.method641(1773202520, (var9 + 1) * 9 + var10);
                    var8.method641(1773202520, var9 * 9 + var10);
                    var8.method641(1773202520, var9 * 9 + var10 + 1);
                    var8.method641(1773202520, (var9 + 1) * 9 + var10);
                    var8.method641(1773202520, var9 * 9 + var10 + 1);
                    var8.method641(1773202520, (var9 + 1) * 9 + var10 + 1);
                } else {
                    var8.method635(-16082, (var9 + 1) * 9 + var10);
                    var8.method635(-16082, var9 * 9 + var10);
                    var8.method635(-16082, var9 * 9 + var10 + 1);
                    var8.method635(-16082, (var9 + 1) * 9 + var10);
                    var8.method635(-16082, var9 * 9 + var10 + 1);
                    var8.method635(-16082, (var9 + 1) * 9 + var10 + 1);
                }
            }
        }
        if (class250.field3809) {
            ByteBuffer var11 = ByteBuffer.wrap(var8.field1388, 0, var8.field1400);
            this.field1620 = new class71();
            this.field1620.method433(var11);
        } else {
            this.field1619 = ByteBuffer.allocateDirect(var8.field1400).order(ByteOrder.nativeOrder());
            this.field1619.put(var8.field1388, 0, var8.field1400);
            this.field1619.flip();
        }
    }
}
