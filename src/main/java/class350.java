import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class350 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public int field5576;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public int field5578;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public int field5580;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Lqb;")
    private class117 field5575;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lan;")
    private class354 field5582;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Lan;")
    private class354 field5585;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5579;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5588;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "[B")
    private byte[] field5577;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "[B")
    private byte[] field5581;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "[B")
    private byte[] field5587;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "[I")
    private int[] field5574;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "[I")
    private int[] field5583;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "[I")
    private int[] field5584;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "[I")
    private int[] field5586;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()V", line = 7)
    public final void method2427() {
        this.field5586 = new int[this.field5580];
        this.field5574 = new int[this.field5589];
        this.field5583 = new int[this.field5589];
        this.field5584 = new int[this.field5589];
        this.field5581 = new byte[this.field5589];
        this.field5577 = new byte[this.field5589];
        this.field5587 = new byte[this.field5589];
        this.field5575 = new class117(class226.method1571(true, this.field5589));
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()V", line = 21)
    public final void method2428() {
        class143 var1 = new class143(this.field5576 * 4);
        class143 var2 = new class143(this.field5578 * 16);
        if (class272.field4318) {
            for (int var3 = 0; var3 < this.field5578; var3++) {
                var2.method1055(this.field5581[var3], 98);
                var2.method1055(this.field5577[var3], 127);
                var2.method1055(this.field5587[var3], 95);
                var2.method1055(255, 123);
                var2.method1053((byte) 120, (float) this.field5574[var3]);
                var2.method1053((byte) 97, (float) this.field5583[var3]);
                var2.method1053((byte) 124, (float) this.field5584[var3]);
            }
            for (int var4 = 0; var4 < this.field5576; var4++) {
                var1.method1052(this.field5586[var4], false);
            }
        } else {
            for (int var5 = 0; var5 < this.field5578; var5++) {
                var2.method1055(this.field5581[var5], 106);
                var2.method1055(this.field5577[var5], 92);
                var2.method1055(this.field5587[var5], 114);
                var2.method1055(255, 95);
                var2.method1060((byte) 47, (float) this.field5574[var5]);
                var2.method1060((byte) 47, (float) this.field5583[var5]);
                var2.method1060((byte) 47, (float) this.field5584[var5]);
            }
            for (int var6 = 0; var6 < this.field5576; var6++) {
                var1.method1012(this.field5586[var6], -11);
            }
        }
        if (class272.field4302) {
            this.field5582 = new class354();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field2260);
            this.field5582.method2446(var7);
            this.field5585 = new class354();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field2260);
            this.field5585.method2450(var8);
        } else {
            this.field5588 = ByteBuffer.allocateDirect(var2.field2295);
            this.field5588.put(var2.field2260);
            this.field5588.flip();
            this.field5579 = ByteBuffer.allocateDirect(var1.field2295);
            this.field5579.put(var1.field2260);
            this.field5579.flip();
        }
        this.field5574 = null;
        this.field5583 = null;
        this.field5584 = null;
        this.field5581 = null;
        this.field5577 = null;
        this.field5587 = null;
        this.field5586 = null;
        this.field5575 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lh;IIIFFF)I", line = 111)
    public final int method2429(class244 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class305 var10 = (class305) this.field5575.method770(var8, 102);
            if (var10 != null) {
                return var10.field4748;
            }
        }
        int var11 = arg0.field3818;
        float var12 = (float) (arg0.field3839 - arg1);
        float var13 = (float) (arg0.field3823 - arg2);
        float var14 = (float) (arg0.field3841 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3835 << 7) + 64);
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
        this.field5581[this.field5578] = (byte) var24;
        this.field5577[this.field5578] = (byte) var25;
        this.field5587[this.field5578] = (byte) var26;
        this.field5574[this.field5578] = arg1;
        this.field5583[this.field5578] = arg2;
        this.field5584[this.field5578] = arg3;
        this.field5575.method764(24369, new class305(this.field5578), var8);
        return this.field5578++;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "()V", line = 181)
    public final void method2430() {
        GL var1 = class272.field4310;
        if (class272.field4302) {
            this.field5582.method2447();
            var1.glInterleavedArrays(10787, 16, 0L);
            class272.field4307 = false;
            this.field5585.method2449();
            var1.glDrawElements(4, this.field5576, 5125, 0L);
            return;
        }
        if (class272.field4302) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field5588);
        class272.field4307 = false;
        var1.glDrawElements(4, this.field5576, 5125, this.field5579);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([I)V", line = 207)
    public final void method2431(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field5586[this.field5576++] = arg0[0];
            this.field5586[this.field5576++] = arg0[var2];
            this.field5586[this.field5576++] = arg0[var2 + 1];
        }
    }
}
