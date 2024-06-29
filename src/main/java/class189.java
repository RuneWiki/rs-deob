import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class189 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lt;")
    private class239 field3233;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Ln;")
    private class268 field3229;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Ln;")
    private class268 field3230;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3232;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3234;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[B")
    private byte[] field3225;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[B")
    private byte[] field3228;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[B")
    private byte[] field3236;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "[I")
    private int[] field3231;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "[I")
    private int[] field3237;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "[I")
    private int[] field3239;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "[I")
    private int[] field3240;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()V", line = 6)
    public final void method1231() {
        this.field3239 = new int[this.field3227];
        this.field3237 = new int[this.field3226];
        this.field3240 = new int[this.field3226];
        this.field3231 = new int[this.field3226];
        this.field3236 = new byte[this.field3226];
        this.field3225 = new byte[this.field3226];
        this.field3228 = new byte[this.field3226];
        this.field3233 = new class239(class53.method336(-1753429918, this.field3226));
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()V", line = 18)
    public final void method1232() {
        class229 var1 = new class229(this.field3238 * 4);
        class229 var2 = new class229(this.field3235 * 16);
        if (class167.field2795) {
            for (int var3 = 0; var3 < this.field3235; var3++) {
                var2.method1499(true, this.field3236[var3]);
                var2.method1499(true, this.field3225[var3]);
                var2.method1499(true, this.field3228[var3]);
                var2.method1499(true, 255);
                var2.method1519((float) this.field3237[var3], -1161532440);
                var2.method1519((float) this.field3240[var3], -1161532440);
                var2.method1519((float) this.field3231[var3], -1161532440);
            }
            for (int var4 = 0; var4 < this.field3238; var4++) {
                var1.method1515(this.field3239[var4], 65);
            }
        } else {
            for (int var5 = 0; var5 < this.field3235; var5++) {
                var2.method1499(true, this.field3236[var5]);
                var2.method1499(true, this.field3225[var5]);
                var2.method1499(true, this.field3228[var5]);
                var2.method1499(true, 255);
                var2.method1531((byte) 58, (float) this.field3237[var5]);
                var2.method1531((byte) 58, (float) this.field3240[var5]);
                var2.method1531((byte) 58, (float) this.field3231[var5]);
            }
            for (int var6 = 0; var6 < this.field3238; var6++) {
                var1.method1517(69, this.field3239[var6]);
            }
        }
        if (class167.field2792) {
            this.field3229 = new class268();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field3879);
            this.field3229.method1806(var7);
            this.field3230 = new class268();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field3879);
            this.field3230.method1804(var8);
        } else {
            this.field3232 = ByteBuffer.allocateDirect(var2.field3905);
            this.field3232.put(var2.field3879);
            this.field3232.flip();
            this.field3234 = ByteBuffer.allocateDirect(var1.field3905);
            this.field3234.put(var1.field3879);
            this.field3234.flip();
        }
        this.field3237 = null;
        this.field3240 = null;
        this.field3231 = null;
        this.field3236 = null;
        this.field3225 = null;
        this.field3228 = null;
        this.field3239 = null;
        this.field3233 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Llg;IIIFFF)I", line = 106)
    public final int method1233(class115 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class119 var10 = (class119) this.field3233.method1612(var8, 97);
            if (var10 != null) {
                return var10.field1998;
            }
        }
        int var11 = arg0.field1920;
        float var12 = (float) (arg0.field1936 - arg1);
        float var13 = (float) (arg0.field1923 - arg2);
        float var14 = (float) (arg0.field1947 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field1929 << 7) + 64);
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
        this.field3236[this.field3235] = (byte) var24;
        this.field3225[this.field3235] = (byte) var25;
        this.field3228[this.field3235] = (byte) var26;
        this.field3237[this.field3235] = arg1;
        this.field3240[this.field3235] = arg2;
        this.field3231[this.field3235] = arg3;
        this.field3233.method1611(new class119(this.field3235), -1, var8);
        return this.field3235++;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "()V", line = 182)
    public final void method1234() {
        GL var1 = class167.field2806;
        if (class167.field2792) {
            this.field3229.method1803();
            var1.glInterleavedArrays(10787, 16, 0L);
            class167.field2778 = false;
            this.field3230.method1807();
            var1.glDrawElements(4, this.field3238, 5125, 0L);
            return;
        }
        if (class167.field2792) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field3232);
        class167.field2778 = false;
        var1.glDrawElements(4, this.field3238, 5125, this.field3234);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([I)V", line = 209)
    public final void method1235(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field3239[this.field3238++] = arg0[0];
            this.field3239[this.field3238++] = arg0[var2];
            this.field3239[this.field3238++] = arg0[var2 + 1];
        }
    }
}
