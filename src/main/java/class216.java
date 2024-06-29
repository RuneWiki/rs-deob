import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class216 {

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public int field3405;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Led;")
    private class296 field3403;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "Led;")
    private class296 field3404;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lhj;")
    private class29 field3417;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3412;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3416;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[B")
    private byte[] field3402;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[B")
    private byte[] field3410;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "[B")
    private byte[] field3411;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "[I")
    private int[] field3406;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "[I")
    private int[] field3407;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[I")
    private int[] field3408;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "[I")
    private int[] field3413;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "()V", line = 8)
    public final void method1547() {
        this.field3413 = new int[this.field3415];
        this.field3407 = new int[this.field3409];
        this.field3406 = new int[this.field3409];
        this.field3408 = new int[this.field3409];
        this.field3410 = new byte[this.field3409];
        this.field3411 = new byte[this.field3409];
        this.field3402 = new byte[this.field3409];
        this.field3417 = new class29(class230.method1638((byte) 119, this.field3409));
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "()V", line = 20)
    public final void method1548() {
        class35 var1 = new class35(this.field3414 * 4);
        class35 var2 = new class35(this.field3405 * 16);
        if (class36.field510) {
            for (int var3 = 0; var3 < this.field3405; var3++) {
                var2.method262((byte) 81, this.field3410[var3]);
                var2.method262((byte) 81, this.field3411[var3]);
                var2.method262((byte) 81, this.field3402[var3]);
                var2.method262((byte) 81, 255);
                var2.method274((byte) 28, (float) this.field3407[var3]);
                var2.method274((byte) 28, (float) this.field3406[var3]);
                var2.method274((byte) 28, (float) this.field3408[var3]);
            }
            for (int var4 = 0; var4 < this.field3414; var4++) {
                var1.method259(-15195, this.field3413[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field3405; var5++) {
                var2.method262((byte) 81, this.field3410[var5]);
                var2.method262((byte) 81, this.field3411[var5]);
                var2.method262((byte) 81, this.field3402[var5]);
                var2.method262((byte) 81, 255);
                var2.method297((float) this.field3407[var5], -11926);
                var2.method297((float) this.field3406[var5], -11926);
                var2.method297((float) this.field3408[var5], -11926);
            }
            for (int var6 = 0; var6 < this.field3414; var6++) {
                var1.method276(this.field3413[var6], false);
            }
        }
        if (class36.field529) {
            this.field3403 = new class296();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field437);
            this.field3403.method2089(var7);
            this.field3404 = new class296();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field437);
            this.field3404.method2086(var8);
        } else {
            this.field3416 = ByteBuffer.allocateDirect(var2.field455);
            this.field3416.put(var2.field437);
            this.field3416.flip();
            this.field3412 = ByteBuffer.allocateDirect(var1.field455);
            this.field3412.put(var1.field437);
            this.field3412.flip();
        }
        this.field3407 = null;
        this.field3406 = null;
        this.field3408 = null;
        this.field3410 = null;
        this.field3411 = null;
        this.field3402 = null;
        this.field3413 = null;
        this.field3417 = null;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "()V", line = 105)
    public final void method1549() {
        GL var1 = class36.field518;
        if (class36.field529) {
            this.field3403.method2088();
            var1.glInterleavedArrays(10787, 16, 0L);
            class36.field525 = false;
            this.field3404.method2087();
            var1.glDrawElements(4, this.field3414, 5125, 0L);
            return;
        }
        if (class36.field529) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field3416);
        class36.field525 = false;
        var1.glDrawElements(4, this.field3414, 5125, this.field3412);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lcj;IIIFFF)I", line = 136)
    public final int method1550(class318 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class181 var10 = (class181) this.field3417.method203(1710, var8);
            if (var10 != null) {
                return var10.field2713;
            }
        }
        int var11 = arg0.field4954;
        float var12 = (float) (arg0.field4931 - arg1);
        float var13 = (float) (arg0.field4935 - arg2);
        float var14 = (float) (arg0.field4952 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4941 << 7) + 64);
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
        this.field3410[this.field3405] = (byte) var24;
        this.field3411[this.field3405] = (byte) var25;
        this.field3402[this.field3405] = (byte) var26;
        this.field3407[this.field3405] = arg1;
        this.field3406[this.field3405] = arg2;
        this.field3408[this.field3405] = arg3;
        this.field3417.method208(new class181(this.field3405), var8, 0);
        return this.field3405++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([I)V", line = 212)
    public final void method1551(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field3413[this.field3414++] = arg0[0];
            this.field3413[this.field3414++] = arg0[var2];
            this.field3413[this.field3414++] = arg0[var2 + 1];
        }
    }
}
