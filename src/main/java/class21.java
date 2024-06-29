import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class21 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field250;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lfk;")
    private class144 field260;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lhk;")
    private class66 field246;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "Lhk;")
    private class66 field261;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field255;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field258;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[B")
    private byte[] field248;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[B")
    private byte[] field252;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "[B")
    private byte[] field253;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
    private int[] field247;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "[I")
    private int[] field254;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "[I")
    private int[] field256;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
    private int[] field259;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 11)
    public final void method136() {
        class235 var1 = new class235(this.field249 * 4);
        class235 var2 = new class235(this.field257 * 16);
        if (class257.field4402) {
            for (int var3 = 0; var3 < this.field257; var3++) {
                var2.method1598(this.field248[var3], 27052);
                var2.method1598(this.field253[var3], 27052);
                var2.method1598(this.field252[var3], 27052);
                var2.method1598(255, 27052);
                var2.method1579((float) this.field256[var3], -1890);
                var2.method1579((float) this.field247[var3], -1890);
                var2.method1579((float) this.field254[var3], -1890);
            }
            for (int var4 = 0; var4 < this.field249; var4++) {
                var1.method1577(true, this.field259[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field257; var5++) {
                var2.method1598(this.field248[var5], 27052);
                var2.method1598(this.field253[var5], 27052);
                var2.method1598(this.field252[var5], 27052);
                var2.method1598(255, 27052);
                var2.method1581((byte) -56, (float) this.field256[var5]);
                var2.method1581((byte) -23, (float) this.field247[var5]);
                var2.method1581((byte) 17, (float) this.field254[var5]);
            }
            for (int var6 = 0; var6 < this.field249; var6++) {
                var1.method1616(this.field259[var6], (byte) 46);
            }
        }
        if (class257.field4393) {
            this.field246 = new class66();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field4066);
            this.field246.method505(var7);
            this.field261 = new class66();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field4066);
            this.field261.method504(var8);
        } else {
            this.field258 = ByteBuffer.allocateDirect(var2.field4051);
            this.field258.put(var2.field4066);
            this.field258.flip();
            this.field255 = ByteBuffer.allocateDirect(var1.field4051);
            this.field255.put(var1.field4066);
            this.field255.flip();
        }
        this.field256 = null;
        this.field247 = null;
        this.field254 = null;
        this.field248 = null;
        this.field253 = null;
        this.field252 = null;
        this.field259 = null;
        this.field260 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V", line = 96)
    public final void method137() {
        this.field259 = new int[this.field250];
        this.field256 = new int[this.field251];
        this.field247 = new int[this.field251];
        this.field254 = new int[this.field251];
        this.field248 = new byte[this.field251];
        this.field253 = new byte[this.field251];
        this.field252 = new byte[this.field251];
        this.field260 = new class144(class286.method2014(this.field251, 783135696));
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([I)V", line = 113)
    public final void method138(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field259[this.field249++] = arg0[0];
            this.field259[this.field249++] = arg0[var2];
            this.field259[this.field249++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbg;IIIFFF)I", line = 126)
    public final int method139(class284 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class119 var10 = (class119) this.field260.method986(var8, 0);
            if (var10 != null) {
                return var10.field2107;
            }
        }
        int var11 = arg0.field4899;
        float var12 = (float) (arg0.field4877 - arg1);
        float var13 = (float) (arg0.field4883 - arg2);
        float var14 = (float) (arg0.field4892 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4874 << 7) + 64);
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
        this.field248[this.field257] = (byte) var24;
        this.field253[this.field257] = (byte) var25;
        this.field252[this.field257] = (byte) var26;
        this.field256[this.field257] = arg1;
        this.field247[this.field257] = arg2;
        this.field254[this.field257] = arg3;
        this.field260.method984((byte) -104, new class119(this.field257), var8);
        return this.field257++;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V", line = 199)
    public final void method140() {
        GL var1 = class257.field4409;
        if (class257.field4393) {
            this.field246.method506();
            var1.glInterleavedArrays(10787, 16, 0L);
            class257.field4406 = false;
            this.field261.method507();
            var1.glDrawElements(4, this.field249, 5125, 0L);
            return;
        }
        if (class257.field4393) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field258);
        class257.field4406 = false;
        var1.glDrawElements(4, this.field249, 5125, this.field255);
    }
}
