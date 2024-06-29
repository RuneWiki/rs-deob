import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class159 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public int field2539;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Lvh;")
    private class212 field2533;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Leh;")
    private class40 field2531;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "Leh;")
    private class40 field2538;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2534;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2537;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[B")
    private byte[] field2528;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[B")
    private byte[] field2532;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "[B")
    private byte[] field2535;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[I")
    private int[] field2524;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[I")
    private int[] field2527;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
    private int[] field2529;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[I")
    private int[] field2536;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ltg;IIIFFF)I", line = 6)
    public final int method1015(class243 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class204 var10 = (class204) this.field2533.method1329((byte) 90, var8);
            if (var10 != null) {
                return var10.field3230;
            }
        }
        int var11 = arg0.field3927;
        float var12 = (float) (arg0.field3929 - arg1);
        float var13 = (float) (arg0.field3903 - arg2);
        float var14 = (float) (arg0.field3906 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3923 << 7) + 64);
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
        this.field2532[this.field2539] = (byte) var24;
        this.field2528[this.field2539] = (byte) var25;
        this.field2535[this.field2539] = (byte) var26;
        this.field2527[this.field2539] = arg1;
        this.field2524[this.field2539] = arg2;
        this.field2536[this.field2539] = arg3;
        this.field2533.method1326(var8, (byte) -122, new class204(this.field2539));
        return this.field2539++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "([I)V", line = 83)
    public final void method1016(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field2529[this.field2525++] = arg0[0];
            this.field2529[this.field2525++] = arg0[var2];
            this.field2529[this.field2525++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V", line = 94)
    public final void method1017() {
        this.field2529 = new int[this.field2530];
        this.field2527 = new int[this.field2526];
        this.field2524 = new int[this.field2526];
        this.field2536 = new int[this.field2526];
        this.field2532 = new byte[this.field2526];
        this.field2528 = new byte[this.field2526];
        this.field2535 = new byte[this.field2526];
        this.field2533 = new class212(class140.method925(this.field2526, (byte) 124));
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "()V", line = 108)
    public final void method1018() {
        GL var1 = class264.field4313;
        if (class264.field4314) {
            this.field2538.method316();
            var1.glInterleavedArrays(10787, 16, 0L);
            class264.field4292 = false;
            this.field2531.method314();
            var1.glDrawElements(4, this.field2525, 5125, 0L);
            return;
        }
        if (class264.field4314) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field2534);
        class264.field4292 = false;
        var1.glDrawElements(4, this.field2525, 5125, this.field2537);
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "()V", line = 138)
    public final void method1019() {
        class3 var1 = new class3(this.field2525 * 4);
        class3 var2 = new class3(this.field2539 * 16);
        if (class264.field4297) {
            for (int var3 = 0; var3 < this.field2539; var3++) {
                var2.method32(this.field2532[var3], (byte) -99);
                var2.method32(this.field2528[var3], (byte) -99);
                var2.method32(this.field2535[var3], (byte) -99);
                var2.method32(255, (byte) -99);
                var2.method28((float) this.field2527[var3], 10894);
                var2.method28((float) this.field2524[var3], 10894);
                var2.method28((float) this.field2536[var3], 10894);
            }
            for (int var4 = 0; var4 < this.field2525; var4++) {
                var1.method26(this.field2529[var4], 62);
            }
        } else {
            for (int var5 = 0; var5 < this.field2539; var5++) {
                var2.method32(this.field2532[var5], (byte) -99);
                var2.method32(this.field2528[var5], (byte) -99);
                var2.method32(this.field2535[var5], (byte) -99);
                var2.method32(255, (byte) -99);
                var2.method44(19679, (float) this.field2527[var5]);
                var2.method44(19679, (float) this.field2524[var5]);
                var2.method44(19679, (float) this.field2536[var5]);
            }
            for (int var6 = 0; var6 < this.field2525; var6++) {
                var1.method38(true, this.field2529[var6]);
            }
        }
        if (class264.field4314) {
            this.field2538 = new class40();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field101);
            this.field2538.method315(var7);
            this.field2531 = new class40();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field101);
            this.field2531.method318(var8);
        } else {
            this.field2534 = ByteBuffer.allocateDirect(var2.field44);
            this.field2534.put(var2.field101);
            this.field2534.flip();
            this.field2537 = ByteBuffer.allocateDirect(var1.field44);
            this.field2537.put(var1.field101);
            this.field2537.flip();
        }
        this.field2527 = null;
        this.field2524 = null;
        this.field2536 = null;
        this.field2532 = null;
        this.field2528 = null;
        this.field2535 = null;
        this.field2529 = null;
        this.field2533 = null;
    }
}
