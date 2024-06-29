import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class336 {

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public int field5137;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public int field5138;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public int field5144;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lib;")
    private class35 field5132;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lib;")
    private class35 field5139;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lcn;")
    private class37 field5135;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5130;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5143;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "[B")
    private byte[] field5129;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "[B")
    private byte[] field5133;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "[B")
    private byte[] field5140;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[I")
    private int[] field5131;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
    private int[] field5134;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "[I")
    private int[] field5141;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "[I")
    private int[] field5142;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 6)
    public final void method2359() {
        this.field5131 = new int[this.field5138];
        this.field5142 = new int[this.field5137];
        this.field5141 = new int[this.field5137];
        this.field5134 = new int[this.field5137];
        this.field5140 = new byte[this.field5137];
        this.field5129 = new byte[this.field5137];
        this.field5133 = new byte[this.field5137];
        this.field5135 = new class37(class261.method1918(this.field5137, 22));
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 20)
    public final void method2360() {
        class25 var1 = new class25(this.field5136 * 4);
        class25 var2 = new class25(this.field5144 * 16);
        if (class240.field3757) {
            for (int var3 = 0; var3 < this.field5144; var3++) {
                var2.method273(0, this.field5140[var3]);
                var2.method273(0, this.field5129[var3]);
                var2.method273(0, this.field5133[var3]);
                var2.method273(0, 255);
                var2.method299((float) this.field5142[var3], -891392056);
                var2.method299((float) this.field5141[var3], -891392056);
                var2.method299((float) this.field5134[var3], -891392056);
            }
            for (int var4 = 0; var4 < this.field5136; var4++) {
                var1.method310(95, this.field5131[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field5144; var5++) {
                var2.method273(0, this.field5140[var5]);
                var2.method273(0, this.field5129[var5]);
                var2.method273(0, this.field5133[var5]);
                var2.method273(0, 255);
                var2.method300((byte) -30, (float) this.field5142[var5]);
                var2.method300((byte) -30, (float) this.field5141[var5]);
                var2.method300((byte) -30, (float) this.field5134[var5]);
            }
            for (int var6 = 0; var6 < this.field5136; var6++) {
                var1.method288(true, this.field5131[var6]);
            }
        }
        if (class240.field3764) {
            this.field5139 = new class35();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field448);
            this.field5139.method359(var7);
            this.field5132 = new class35();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field448);
            this.field5132.method362(var8);
        } else {
            this.field5143 = ByteBuffer.allocateDirect(var2.field397);
            this.field5143.put(var2.field448);
            this.field5143.flip();
            this.field5130 = ByteBuffer.allocateDirect(var1.field397);
            this.field5130.put(var1.field448);
            this.field5130.flip();
        }
        this.field5142 = null;
        this.field5141 = null;
        this.field5134 = null;
        this.field5140 = null;
        this.field5129 = null;
        this.field5133 = null;
        this.field5131 = null;
        this.field5135 = null;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()V", line = 106)
    public final void method2361() {
        GL var1 = class240.field3771;
        if (class240.field3764) {
            this.field5139.method358();
            var1.glInterleavedArrays(10787, 16, 0L);
            class240.field3740 = false;
            this.field5132.method360();
            var1.glDrawElements(4, this.field5136, 5125, 0L);
            return;
        }
        if (class240.field3764) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field5143);
        class240.field3740 = false;
        var1.glDrawElements(4, this.field5136, 5125, this.field5130);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljn;IIIFFF)I", line = 139)
    public final int method2362(class186 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class164 var10 = (class164) this.field5135.method370((byte) -120, var8);
            if (var10 != null) {
                return var10.field2610;
            }
        }
        int var11 = arg0.field2919;
        float var12 = (float) (arg0.field2909 - arg1);
        float var13 = (float) (arg0.field2913 - arg2);
        float var14 = (float) (arg0.field2924 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field2914 << 7) + 64);
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
        this.field5140[this.field5144] = (byte) var24;
        this.field5129[this.field5144] = (byte) var25;
        this.field5133[this.field5144] = (byte) var26;
        this.field5142[this.field5144] = arg1;
        this.field5141[this.field5144] = arg2;
        this.field5134[this.field5144] = arg3;
        this.field5135.method375(new class164(this.field5144), var8, 41);
        return this.field5144++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([I)V", line = 214)
    public final void method2363(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field5131[this.field5136++] = arg0[0];
            this.field5131[this.field5136++] = arg0[var2];
            this.field5131[this.field5136++] = arg0[var2 + 1];
        }
    }
}
