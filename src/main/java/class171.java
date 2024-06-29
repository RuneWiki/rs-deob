import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class171 {

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public int field2467;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public int field2470;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Lch;")
    private class115 field2459;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lch;")
    private class115 field2469;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "Ls;")
    private class196 field2474;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2464;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2465;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[B")
    private byte[] field2468;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[B")
    private byte[] field2472;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[B")
    private byte[] field2473;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "[I")
    private int[] field2461;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "[I")
    private int[] field2462;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
    private int[] field2463;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[I")
    private int[] field2471;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V", line = 9)
    public final void method1201() {
        this.field2461 = new int[this.field2467];
        this.field2463 = new int[this.field2470];
        this.field2471 = new int[this.field2470];
        this.field2462 = new int[this.field2470];
        this.field2468 = new byte[this.field2470];
        this.field2472 = new byte[this.field2470];
        this.field2473 = new byte[this.field2470];
        this.field2474 = new class196(class344.method2409(this.field2470, -24724));
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([I)V", line = 21)
    public final void method1202(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field2461[this.field2466++] = arg0[0];
            this.field2461[this.field2466++] = arg0[var2];
            this.field2461[this.field2466++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ltm;IIIFFF)I", line = 36)
    public final int method1203(class277 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class35 var10 = (class35) this.field2474.method1405(var8, false);
            if (var10 != null) {
                return var10.field515;
            }
        }
        int var11 = arg0.field4213;
        float var12 = (float) (arg0.field4222 - arg1);
        float var13 = (float) (arg0.field4224 - arg2);
        float var14 = (float) (arg0.field4208 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4225 << 7) + 64);
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
        this.field2468[this.field2460] = (byte) var24;
        this.field2472[this.field2460] = (byte) var25;
        this.field2473[this.field2460] = (byte) var26;
        this.field2463[this.field2460] = arg1;
        this.field2471[this.field2460] = arg2;
        this.field2462[this.field2460] = arg3;
        this.field2474.method1400(var8, 105, new class35(this.field2460));
        return this.field2460++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()V", line = 109)
    public final void method1204() {
        class190 var1 = new class190(this.field2466 * 4);
        class190 var2 = new class190(this.field2460 * 16);
        if (class141.field2056) {
            for (int var3 = 0; var3 < this.field2460; var3++) {
                var2.method1355((byte) -110, this.field2468[var3]);
                var2.method1355((byte) -118, this.field2472[var3]);
                var2.method1355((byte) -120, this.field2473[var3]);
                var2.method1355((byte) -109, 255);
                var2.method1328((byte) 87, (float) this.field2463[var3]);
                var2.method1328((byte) 70, (float) this.field2471[var3]);
                var2.method1328((byte) 114, (float) this.field2462[var3]);
            }
            for (int var4 = 0; var4 < this.field2466; var4++) {
                var1.method1354(this.field2461[var4], (byte) -10);
            }
        } else {
            for (int var5 = 0; var5 < this.field2460; var5++) {
                var2.method1355((byte) -116, this.field2468[var5]);
                var2.method1355((byte) -120, this.field2472[var5]);
                var2.method1355((byte) -119, this.field2473[var5]);
                var2.method1355((byte) -125, 255);
                var2.method1318((float) this.field2463[var5], (byte) -39);
                var2.method1318((float) this.field2471[var5], (byte) -39);
                var2.method1318((float) this.field2462[var5], (byte) -39);
            }
            for (int var6 = 0; var6 < this.field2466; var6++) {
                var1.method1335(this.field2461[var6], 840118768);
            }
        }
        if (class141.field2032) {
            this.field2469 = new class115();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field2718);
            this.field2469.method864(var7);
            this.field2459 = new class115();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field2718);
            this.field2459.method860(var8);
        } else {
            this.field2464 = ByteBuffer.allocateDirect(var2.field2776);
            this.field2464.put(var2.field2718);
            this.field2464.flip();
            this.field2465 = ByteBuffer.allocateDirect(var1.field2776);
            this.field2465.put(var1.field2718);
            this.field2465.flip();
        }
        this.field2463 = null;
        this.field2471 = null;
        this.field2462 = null;
        this.field2468 = null;
        this.field2472 = null;
        this.field2473 = null;
        this.field2461 = null;
        this.field2474 = null;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "()V", line = 198)
    public final void method1205() {
        GL var1 = class141.field2025;
        if (class141.field2032) {
            this.field2469.method861();
            var1.glInterleavedArrays(10787, 16, 0L);
            class141.field2051 = false;
            this.field2459.method863();
            var1.glDrawElements(4, this.field2466, 5125, 0L);
            return;
        }
        if (class141.field2032) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field2464);
        class141.field2051 = false;
        var1.glDrawElements(4, this.field2466, 5125, this.field2465);
    }
}
