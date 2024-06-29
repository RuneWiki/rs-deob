import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class124 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public int field2141;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public int field2146;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lo;")
    private class199 field2143;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lt;")
    private class245 field2152;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lt;")
    private class245 field2153;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2142;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2149;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "[B")
    private byte[] field2150;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[B")
    private byte[] field2151;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "[B")
    private byte[] field2155;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
    private int[] field2140;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
    private int[] field2145;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
    private int[] field2148;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "[I")
    private int[] field2154;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "()V", line = 8)
    public final void method933() {
        this.field2154 = new int[this.field2144];
        this.field2145 = new int[this.field2147];
        this.field2140 = new int[this.field2147];
        this.field2148 = new int[this.field2147];
        this.field2150 = new byte[this.field2147];
        this.field2155 = new byte[this.field2147];
        this.field2151 = new byte[this.field2147];
        this.field2143 = new class199(class151.method1130(73, this.field2147));
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([I)V", line = 22)
    public final void method934(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field2154[this.field2146++] = arg0[0];
            this.field2154[this.field2146++] = arg0[var2];
            this.field2154[this.field2146++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "()V", line = 35)
    public final void method935() {
        GL var1 = class21.field377;
        if (class21.field367) {
            this.field2152.method1738();
            var1.glInterleavedArrays(10787, 16, 0L);
            class21.field360 = false;
            this.field2153.method1734();
            var1.glDrawElements(4, this.field2146, 5125, 0L);
            return;
        }
        if (class21.field367) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field2149);
        class21.field360 = false;
        var1.glDrawElements(4, this.field2146, 5125, this.field2142);
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "()V", line = 61)
    public final void method936() {
        class26 var1 = new class26(this.field2146 * 4);
        class26 var2 = new class26(this.field2141 * 16);
        if (class21.field349) {
            for (int var3 = 0; var3 < this.field2141; var3++) {
                var2.method218(this.field2150[var3], -19914);
                var2.method218(this.field2155[var3], -19914);
                var2.method218(this.field2151[var3], -19914);
                var2.method218(255, -19914);
                var2.method227((float) this.field2145[var3], 27);
                var2.method227((float) this.field2140[var3], 107);
                var2.method227((float) this.field2148[var3], 22);
            }
            for (int var4 = 0; var4 < this.field2146; var4++) {
                var1.method239((byte) 99, this.field2154[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field2141; var5++) {
                var2.method218(this.field2150[var5], -19914);
                var2.method218(this.field2155[var5], -19914);
                var2.method218(this.field2151[var5], -19914);
                var2.method218(255, -19914);
                var2.method214(124, (float) this.field2145[var5]);
                var2.method214(123, (float) this.field2140[var5]);
                var2.method214(123, (float) this.field2148[var5]);
            }
            for (int var6 = 0; var6 < this.field2146; var6++) {
                var1.method248((byte) 111, this.field2154[var6]);
            }
        }
        if (class21.field367) {
            this.field2152 = new class245();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field472);
            this.field2152.method1736(var7);
            this.field2153 = new class245();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field472);
            this.field2153.method1737(var8);
        } else {
            this.field2149 = ByteBuffer.allocateDirect(var2.field478);
            this.field2149.put(var2.field472);
            this.field2149.flip();
            this.field2142 = ByteBuffer.allocateDirect(var1.field478);
            this.field2142.put(var1.field472);
            this.field2142.flip();
        }
        this.field2145 = null;
        this.field2140 = null;
        this.field2148 = null;
        this.field2150 = null;
        this.field2155 = null;
        this.field2151 = null;
        this.field2154 = null;
        this.field2143 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lrg;IIIFFF)I", line = 146)
    public final int method937(class90 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class270 var10 = (class270) this.field2143.method1405((byte) 115, var8);
            if (var10 != null) {
                return var10.field4483;
            }
        }
        int var11 = arg0.field1619;
        float var12 = (float) (arg0.field1641 - arg1);
        float var13 = (float) (arg0.field1626 - arg2);
        float var14 = (float) (arg0.field1614 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field1628 << 7) + 64);
        float var21 = 1.0F - var20 * var20;
        if (var21 < 0.0F) {
            var21 = 0.0F;
        }
        float var22 = arg6 * var19 + arg4 * var17 + arg5 * var18;
        if (var22 < 0.0F) {
            var22 = 0.0F;
        }
        float var23 = var21 * var22 * 2.0F;
        if (var23 > 1.0F) {
            var23 = 1.0F;
        }
        int var24 = (int) ((float) (var11 >> 16 & 0xFF) * var23);
        if (var24 > 255) {
            var24 = 255;
        }
        int var25 = (int) ((float) (var11 >> 8 & 0xFF) * var23);
        if (var25 > 255) {
            var25 = 255;
        }
        int var26 = (int) ((float) (var11 & 0xFF) * var23);
        if (var26 > 255) {
            var26 = 255;
        }
        this.field2150[this.field2141] = (byte) var24;
        this.field2155[this.field2141] = (byte) var25;
        this.field2151[this.field2141] = (byte) var26;
        this.field2145[this.field2141] = arg1;
        this.field2140[this.field2141] = arg2;
        this.field2148[this.field2141] = arg3;
        this.field2143.method1396(-19928, var8, new class270(this.field2141));
        return this.field2141++;
    }
}
