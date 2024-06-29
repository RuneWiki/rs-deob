import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class220 {

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public int field3578;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Lie;")
    private class47 field3576;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "Lie;")
    private class47 field3580;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "Lkb;")
    private class80 field3581;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3573;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3583;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "[B")
    private byte[] field3571;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[B")
    private byte[] field3572;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "[B")
    private byte[] field3574;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "[I")
    private int[] field3568;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "[I")
    private int[] field3577;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "[I")
    private int[] field3579;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "[I")
    private int[] field3582;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V", line = 6)
    public final void method1519() {
        this.field3579 = new int[this.field3570];
        this.field3577 = new int[this.field3569];
        this.field3582 = new int[this.field3569];
        this.field3568 = new int[this.field3569];
        this.field3571 = new byte[this.field3569];
        this.field3572 = new byte[this.field3569];
        this.field3574 = new byte[this.field3569];
        this.field3581 = new class80(class180.method1294(true, this.field3569));
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()V", line = 21)
    public final void method1520() {
        GL var1 = class90.field1390;
        if (class90.field1383) {
            this.field3576.method255();
            var1.glInterleavedArrays(10787, 16, 0L);
            class90.field1366 = false;
            this.field3580.method253();
            var1.glDrawElements(4, this.field3575, 5125, 0L);
            return;
        }
        if (class90.field1383) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field3573);
        class90.field1366 = false;
        var1.glDrawElements(4, this.field3575, 5125, this.field3583);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()V", line = 46)
    public final void method1521() {
        class153 var1 = new class153(this.field3575 * 4);
        class153 var2 = new class153(this.field3578 * 16);
        if (class90.field1369) {
            for (int var3 = 0; var3 < this.field3578; var3++) {
                var2.method1095(this.field3571[var3], -60);
                var2.method1095(this.field3572[var3], -98);
                var2.method1095(this.field3574[var3], -67);
                var2.method1095(255, -81);
                var2.method1098(0, (float) this.field3577[var3]);
                var2.method1098(0, (float) this.field3582[var3]);
                var2.method1098(0, (float) this.field3568[var3]);
            }
            for (int var4 = 0; var4 < this.field3575; var4++) {
                var1.method1045(this.field3579[var4], (byte) 18);
            }
        } else {
            for (int var5 = 0; var5 < this.field3578; var5++) {
                var2.method1095(this.field3571[var5], -73);
                var2.method1095(this.field3572[var5], -31);
                var2.method1095(this.field3574[var5], -117);
                var2.method1095(255, -64);
                var2.method1070((byte) -111, (float) this.field3577[var5]);
                var2.method1070((byte) -114, (float) this.field3582[var5]);
                var2.method1070((byte) -116, (float) this.field3568[var5]);
            }
            for (int var6 = 0; var6 < this.field3575; var6++) {
                var1.method1057(false, this.field3579[var6]);
            }
        }
        if (class90.field1383) {
            this.field3576 = new class47();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field2359);
            this.field3576.method252(var7);
            this.field3580 = new class47();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field2359);
            this.field3580.method254(var8);
        } else {
            this.field3573 = ByteBuffer.allocateDirect(var2.field2367);
            this.field3573.put(var2.field2359);
            this.field3573.flip();
            this.field3583 = ByteBuffer.allocateDirect(var1.field2367);
            this.field3583.put(var1.field2359);
            this.field3583.flip();
        }
        this.field3577 = null;
        this.field3582 = null;
        this.field3568 = null;
        this.field3571 = null;
        this.field3572 = null;
        this.field3574 = null;
        this.field3579 = null;
        this.field3581 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Llf;IIIFFF)I", line = 131)
    public final int method1522(class291 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class69 var10 = (class69) this.field3581.method493(var8, 116);
            if (var10 != null) {
                return var10.field919;
            }
        }
        int var11 = arg0.field4904;
        float var12 = (float) (arg0.field4905 - arg1);
        float var13 = (float) (arg0.field4902 - arg2);
        float var14 = (float) (arg0.field4909 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4893 << 7) + 64);
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
        this.field3571[this.field3578] = (byte) var24;
        this.field3572[this.field3578] = (byte) var25;
        this.field3574[this.field3578] = (byte) var26;
        this.field3577[this.field3578] = arg1;
        this.field3582[this.field3578] = arg2;
        this.field3568[this.field3578] = arg3;
        this.field3581.method490(new class69(this.field3578), var8, true);
        return this.field3578++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([I)V", line = 204)
    public final void method1523(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field3579[this.field3575++] = arg0[0];
            this.field3579[this.field3575++] = arg0[var2];
            this.field3579[this.field3575++] = arg0[var2 + 1];
        }
    }
}
