import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class233 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Lik;")
    private class17 field3288;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lhb;")
    private class305 field3283;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lhb;")
    private class305 field3295;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3293;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3296;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "[B")
    private byte[] field3287;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "[B")
    private byte[] field3292;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "[B")
    private byte[] field3298;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
    private int[] field3285;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
    private int[] field3289;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "[I")
    private int[] field3290;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "[I")
    private int[] field3291;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()V", line = 7)
    public final void method1606() {
        this.field3291 = new int[this.field3297];
        this.field3290 = new int[this.field3294];
        this.field3285 = new int[this.field3294];
        this.field3289 = new int[this.field3294];
        this.field3292 = new byte[this.field3294];
        this.field3298 = new byte[this.field3294];
        this.field3287 = new byte[this.field3294];
        this.field3288 = new class17(class110.method804(this.field3294, (byte) 72));
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([I)V", line = 21)
    public final void method1607(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field3291[this.field3284++] = arg0[0];
            this.field3291[this.field3284++] = arg0[var2];
            this.field3291[this.field3284++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()V", line = 36)
    public final void method1608() {
        GL var1 = class67.field899;
        if (class67.field914) {
            this.field3295.method2076();
            var1.glInterleavedArrays(10787, 16, 0L);
            class67.field917 = false;
            this.field3283.method2077();
            var1.glDrawElements(4, this.field3284, 5125, 0L);
            return;
        }
        if (class67.field914) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field3296);
        class67.field917 = false;
        var1.glDrawElements(4, this.field3284, 5125, this.field3293);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lre;IIIFFF)I", line = 68)
    public final int method1609(class270 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class336 var10 = (class336) this.field3288.method111(-106, var8);
            if (var10 != null) {
                return var10.field5063;
            }
        }
        int var11 = arg0.field4016;
        float var12 = (float) (arg0.field4025 - arg1);
        float var13 = (float) (arg0.field4000 - arg2);
        float var14 = (float) (arg0.field4008 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4026 << 7) + 64);
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
        this.field3292[this.field3286] = (byte) var24;
        this.field3298[this.field3286] = (byte) var25;
        this.field3287[this.field3286] = (byte) var26;
        this.field3290[this.field3286] = arg1;
        this.field3285[this.field3286] = arg2;
        this.field3289[this.field3286] = arg3;
        this.field3288.method120(var8, new class336(this.field3286), -22851);
        return this.field3286++;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()V", line = 137)
    public final void method1610() {
        class316 var1 = new class316(this.field3284 * 4);
        class316 var2 = new class316(this.field3286 * 16);
        if (class67.field916) {
            for (int var3 = 0; var3 < this.field3286; var3++) {
                var2.method2184((byte) 89, this.field3292[var3]);
                var2.method2184((byte) 89, this.field3298[var3]);
                var2.method2184((byte) 89, this.field3287[var3]);
                var2.method2184((byte) 89, 255);
                var2.method2213(-1, (float) this.field3290[var3]);
                var2.method2213(-1, (float) this.field3285[var3]);
                var2.method2213(-1, (float) this.field3289[var3]);
            }
            for (int var4 = 0; var4 < this.field3284; var4++) {
                var1.method2188(255, this.field3291[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field3286; var5++) {
                var2.method2184((byte) 89, this.field3292[var5]);
                var2.method2184((byte) 89, this.field3298[var5]);
                var2.method2184((byte) 89, this.field3287[var5]);
                var2.method2184((byte) 89, 255);
                var2.method2171(-1365938680, (float) this.field3290[var5]);
                var2.method2171(-1365938680, (float) this.field3285[var5]);
                var2.method2171(-1365938680, (float) this.field3289[var5]);
            }
            for (int var6 = 0; var6 < this.field3284; var6++) {
                var1.method2155(this.field3291[var6], -115);
            }
        }
        if (class67.field914) {
            this.field3295 = new class305();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field4798);
            this.field3295.method2075(var7);
            this.field3283 = new class305();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field4798);
            this.field3283.method2074(var8);
        } else {
            this.field3296 = ByteBuffer.allocateDirect(var2.field4777);
            this.field3296.put(var2.field4798);
            this.field3296.flip();
            this.field3293 = ByteBuffer.allocateDirect(var1.field4777);
            this.field3293.put(var1.field4798);
            this.field3293.flip();
        }
        this.field3290 = null;
        this.field3285 = null;
        this.field3289 = null;
        this.field3292 = null;
        this.field3298 = null;
        this.field3287 = null;
        this.field3291 = null;
        this.field3288 = null;
    }
}
