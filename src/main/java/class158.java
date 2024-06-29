import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class158 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field2813;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lrj;")
    private class254 field2826;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lre;")
    private class259 field2815;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Lre;")
    private class259 field2818;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2817;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2824;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "[B")
    private byte[] field2812;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[B")
    private byte[] field2819;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "[B")
    private byte[] field2827;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "[I")
    private int[] field2816;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "[I")
    private int[] field2820;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "[I")
    private int[] field2821;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "[I")
    private int[] field2822;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lsm;IIIFFF)I", line = 12)
    public final int method1171(class118 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class6 var10 = (class6) this.field2826.method1744((byte) 124, var8);
            if (var10 != null) {
                return var10.field94;
            }
        }
        int var11 = arg0.field2091;
        float var12 = (float) (arg0.field2096 - arg1);
        float var13 = (float) (arg0.field2079 - arg2);
        float var14 = (float) (arg0.field2092 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field2082 << 7) + 64);
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
        this.field2827[this.field2823] = (byte) var24;
        this.field2812[this.field2823] = (byte) var25;
        this.field2819[this.field2823] = (byte) var26;
        this.field2821[this.field2823] = arg1;
        this.field2820[this.field2823] = arg2;
        this.field2816[this.field2823] = arg3;
        this.field2826.method1749(true, new class6(this.field2823), var8);
        return this.field2823++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()V", line = 82)
    public final void method1172() {
        this.field2822 = new int[this.field2825];
        this.field2821 = new int[this.field2814];
        this.field2820 = new int[this.field2814];
        this.field2816 = new int[this.field2814];
        this.field2827 = new byte[this.field2814];
        this.field2812 = new byte[this.field2814];
        this.field2819 = new byte[this.field2814];
        this.field2826 = new class254(class124.method859((byte) -112, this.field2814));
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()V", line = 101)
    public final void method1173() {
        class41 var1 = new class41(this.field2813 * 4);
        class41 var2 = new class41(this.field2823 * 16);
        if (class253.field4331) {
            for (int var3 = 0; var3 < this.field2823; var3++) {
                var2.method308(this.field2827[var3], -2);
                var2.method308(this.field2812[var3], -2);
                var2.method308(this.field2819[var3], -2);
                var2.method308(255, -2);
                var2.method316((float) this.field2821[var3], -1244406608);
                var2.method316((float) this.field2820[var3], -1244406608);
                var2.method316((float) this.field2816[var3], -1244406608);
            }
            for (int var4 = 0; var4 < this.field2813; var4++) {
                var1.method365((byte) -32, this.field2822[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field2823; var5++) {
                var2.method308(this.field2827[var5], -2);
                var2.method308(this.field2812[var5], -2);
                var2.method308(this.field2819[var5], -2);
                var2.method308(255, -2);
                var2.method320(false, (float) this.field2821[var5]);
                var2.method320(false, (float) this.field2820[var5]);
                var2.method320(false, (float) this.field2816[var5]);
            }
            for (int var6 = 0; var6 < this.field2813; var6++) {
                var1.method325(true, this.field2822[var6]);
            }
        }
        if (class253.field4304) {
            this.field2815 = new class259();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field772);
            this.field2815.method1822(var7);
            this.field2818 = new class259();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field772);
            this.field2818.method1823(var8);
        } else {
            this.field2824 = ByteBuffer.allocateDirect(var2.field738);
            this.field2824.put(var2.field772);
            this.field2824.flip();
            this.field2817 = ByteBuffer.allocateDirect(var1.field738);
            this.field2817.put(var1.field772);
            this.field2817.flip();
        }
        this.field2821 = null;
        this.field2820 = null;
        this.field2816 = null;
        this.field2827 = null;
        this.field2812 = null;
        this.field2819 = null;
        this.field2822 = null;
        this.field2826 = null;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()V", line = 188)
    public final void method1174() {
        GL var1 = class253.field4319;
        if (class253.field4304) {
            this.field2815.method1821();
            var1.glInterleavedArrays(10787, 16, 0L);
            class253.field4300 = false;
            this.field2818.method1820();
            var1.glDrawElements(4, this.field2813, 5125, 0L);
            return;
        }
        if (class253.field4304) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field2824);
        class253.field4300 = false;
        var1.glDrawElements(4, this.field2813, 5125, this.field2817);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([I)V", line = 214)
    public final void method1175(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field2822[this.field2813++] = arg0[0];
            this.field2822[this.field2813++] = arg0[var2];
            this.field2822[this.field2813++] = arg0[var2 + 1];
        }
    }
}
