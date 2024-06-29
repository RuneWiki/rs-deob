import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class173 {

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public int field2972;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "Lej;")
    private class46 field2967;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lej;")
    private class46 field2979;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Loe;")
    private class79 field2969;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2974;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2978;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[B")
    private byte[] field2968;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "[B")
    private byte[] field2975;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "[B")
    private byte[] field2980;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[I")
    private int[] field2971;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "[I")
    private int[] field2973;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[I")
    private int[] field2981;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "[I")
    private int[] field2982;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "()V", line = 8)
    public final void method1217() {
        class153 var1 = new class153(this.field2977 * 4);
        class153 var2 = new class153(this.field2972 * 16);
        if (class147.field2482) {
            for (int var3 = 0; var3 < this.field2972; var3++) {
                var2.method1075(this.field2975[var3], -1);
                var2.method1075(this.field2980[var3], -1);
                var2.method1075(this.field2968[var3], -1);
                var2.method1075(255, -1);
                var2.method1047((float) this.field2981[var3], -48);
                var2.method1047((float) this.field2971[var3], -64);
                var2.method1047((float) this.field2973[var3], -116);
            }
            for (int var4 = 0; var4 < this.field2977; var4++) {
                var1.method1065(178808912, this.field2982[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field2972; var5++) {
                var2.method1075(this.field2975[var5], -1);
                var2.method1075(this.field2980[var5], -1);
                var2.method1075(this.field2968[var5], -1);
                var2.method1075(255, -1);
                var2.method1081((float) this.field2981[var5], true);
                var2.method1081((float) this.field2971[var5], true);
                var2.method1081((float) this.field2973[var5], true);
            }
            for (int var6 = 0; var6 < this.field2977; var6++) {
                var1.method1063(this.field2982[var6], 4);
            }
        }
        if (class147.field2510) {
            this.field2979 = new class46();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field2598);
            this.field2979.method338(var7);
            this.field2967 = new class46();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field2598);
            this.field2967.method336(var8);
        } else {
            this.field2974 = ByteBuffer.allocateDirect(var2.field2611);
            this.field2974.put(var2.field2598);
            this.field2974.flip();
            this.field2978 = ByteBuffer.allocateDirect(var1.field2611);
            this.field2978.put(var1.field2598);
            this.field2978.flip();
        }
        this.field2981 = null;
        this.field2971 = null;
        this.field2973 = null;
        this.field2975 = null;
        this.field2980 = null;
        this.field2968 = null;
        this.field2982 = null;
        this.field2969 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lqf;IIIFFF)I", line = 93)
    public final int method1218(class300 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class259 var10 = (class259) this.field2969.method507(var8, 602425312);
            if (var10 != null) {
                return var10.field4431;
            }
        }
        int var11 = arg0.field5117;
        float var12 = (float) (arg0.field5101 - arg1);
        float var13 = (float) (arg0.field5118 - arg2);
        float var14 = (float) (arg0.field5105 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field5106 << 7) + 64);
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
        this.field2975[this.field2972] = (byte) var24;
        this.field2980[this.field2972] = (byte) var25;
        this.field2968[this.field2972] = (byte) var26;
        this.field2981[this.field2972] = arg1;
        this.field2971[this.field2972] = arg2;
        this.field2973[this.field2972] = arg3;
        this.field2969.method503(var8, -78, new class259(this.field2972));
        return this.field2972++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([I)V", line = 171)
    public final void method1219(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field2982[this.field2977++] = arg0[0];
            this.field2982[this.field2977++] = arg0[var2];
            this.field2982[this.field2977++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "()V", line = 191)
    public final void method1220() {
        GL var1 = class147.field2479;
        if (class147.field2510) {
            this.field2979.method337();
            var1.glInterleavedArrays(10787, 16, 0L);
            class147.field2493 = false;
            this.field2967.method335();
            var1.glDrawElements(4, this.field2977, 5125, 0L);
            return;
        }
        if (class147.field2510) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field2974);
        class147.field2493 = false;
        var1.glDrawElements(4, this.field2977, 5125, this.field2978);
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "()V", line = 215)
    public final void method1221() {
        this.field2982 = new int[this.field2976];
        this.field2981 = new int[this.field2970];
        this.field2971 = new int[this.field2970];
        this.field2973 = new int[this.field2970];
        this.field2975 = new byte[this.field2970];
        this.field2980 = new byte[this.field2970];
        this.field2968 = new byte[this.field2970];
        this.field2969 = new class79(class135.method922(21793, this.field2970));
    }
}
