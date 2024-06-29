import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lhj;")
    private class28 field113;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lhj;")
    private class28 field114;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lff;")
    private class47 field124;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field110;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field120;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[B")
    private byte[] field111;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[B")
    private byte[] field115;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "[B")
    private byte[] field118;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
    private int[] field116;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
    private int[] field117;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
    private int[] field121;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
    private int[] field122;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([I)V", line = 7)
    public final void method42(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field117[this.field125++] = arg0[0];
            this.field117[this.field125++] = arg0[var2];
            this.field117[this.field125++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V", line = 20)
    public final void method43() {
        this.field117 = new int[this.field119];
        this.field116 = new int[this.field123];
        this.field122 = new int[this.field123];
        this.field121 = new int[this.field123];
        this.field111 = new byte[this.field123];
        this.field115 = new byte[this.field123];
        this.field118 = new byte[this.field123];
        this.field124 = new class47(class287.method2033(this.field123, -1410546649));
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V", line = 37)
    public final void method44() {
        GL var1 = class281.field4839;
        if (class281.field4820) {
            this.field113.method154();
            var1.glInterleavedArrays(10787, 16, 0L);
            class281.field4845 = false;
            this.field114.method155();
            var1.glDrawElements(4, this.field125, 5125, 0L);
            return;
        }
        if (class281.field4820) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field110);
        class281.field4845 = false;
        var1.glDrawElements(4, this.field125, 5125, this.field120);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()V", line = 65)
    public final void method45() {
        class70 var1 = new class70(this.field125 * 4);
        class70 var2 = new class70(this.field112 * 16);
        if (class281.field4816) {
            for (int var3 = 0; var3 < this.field112; var3++) {
                var2.method463(false, this.field111[var3]);
                var2.method463(false, this.field115[var3]);
                var2.method463(false, this.field118[var3]);
                var2.method463(false, 255);
                var2.method428((float) this.field116[var3], (byte) -123);
                var2.method428((float) this.field122[var3], (byte) -126);
                var2.method428((float) this.field121[var3], (byte) -127);
            }
            for (int var4 = 0; var4 < this.field125; var4++) {
                var1.method436(this.field117[var4], -18820);
            }
        } else {
            for (int var5 = 0; var5 < this.field112; var5++) {
                var2.method463(false, this.field111[var5]);
                var2.method463(false, this.field115[var5]);
                var2.method463(false, this.field118[var5]);
                var2.method463(false, 255);
                var2.method475((byte) -61, (float) this.field116[var5]);
                var2.method475((byte) -61, (float) this.field122[var5]);
                var2.method475((byte) -61, (float) this.field121[var5]);
            }
            for (int var6 = 0; var6 < this.field125; var6++) {
                var1.method450(this.field117[var6], 125);
            }
        }
        if (class281.field4820) {
            this.field113 = new class28();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field1066);
            this.field113.method156(var7);
            this.field114 = new class28();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field1066);
            this.field114.method152(var8);
        } else {
            this.field110 = ByteBuffer.allocateDirect(var2.field1068);
            this.field110.put(var2.field1066);
            this.field110.flip();
            this.field120 = ByteBuffer.allocateDirect(var1.field1068);
            this.field120.put(var1.field1066);
            this.field120.flip();
        }
        this.field116 = null;
        this.field122 = null;
        this.field121 = null;
        this.field111 = null;
        this.field115 = null;
        this.field118 = null;
        this.field117 = null;
        this.field124 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Laj;IIIFFF)I", line = 153)
    public final int method46(class1 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class172 var10 = (class172) this.field124.method280(var8, 29153);
            if (var10 != null) {
                return var10.field2849;
            }
        }
        int var11 = arg0.field3;
        float var12 = (float) (arg0.field1 - arg1);
        float var13 = (float) (arg0.field13 - arg2);
        float var14 = (float) (arg0.field16 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field14 << 7) + 64);
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
        this.field111[this.field112] = (byte) var24;
        this.field115[this.field112] = (byte) var25;
        this.field118[this.field112] = (byte) var26;
        this.field116[this.field112] = arg1;
        this.field122[this.field112] = arg2;
        this.field121[this.field112] = arg3;
        this.field124.method284(true, var8, new class172(this.field112));
        return this.field112++;
    }
}
