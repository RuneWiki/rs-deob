import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class189 {

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Ll;")
    private class312 field2969;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Ll;")
    private class312 field2972;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "Lpd;")
    private class3 field2973;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2959;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2968;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "[B")
    private byte[] field2961;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[B")
    private byte[] field2963;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "[B")
    private byte[] field2965;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "[I")
    private int[] field2964;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[I")
    private int[] field2967;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "[I")
    private int[] field2970;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "[I")
    private int[] field2971;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "()V", line = 8)
    public final void method1362() {
        GL var1 = class162.field2654;
        if (class162.field2639) {
            this.field2969.method2199();
            var1.glInterleavedArrays(10787, 16, 0L);
            class162.field2614 = false;
            this.field2972.method2200();
            var1.glDrawElements(4, this.field2960, 5125, 0L);
            return;
        }
        if (class162.field2639) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field2968);
        class162.field2614 = false;
        var1.glDrawElements(4, this.field2960, 5125, this.field2959);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([I)V", line = 34)
    public final void method1363(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field2970[this.field2960++] = arg0[0];
            this.field2970[this.field2960++] = arg0[var2];
            this.field2970[this.field2960++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "()V", line = 51)
    public final void method1364() {
        this.field2970 = new int[this.field2966];
        this.field2971 = new int[this.field2962];
        this.field2967 = new int[this.field2962];
        this.field2964 = new int[this.field2962];
        this.field2963 = new byte[this.field2962];
        this.field2961 = new byte[this.field2962];
        this.field2965 = new byte[this.field2962];
        this.field2973 = new class3(class319.method2255(1, this.field2962));
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lck;IIIFFF)I", line = 69)
    public final int method1365(class253 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class304 var10 = (class304) this.field2973.method79(var8, (byte) 0);
            if (var10 != null) {
                return var10.field4844;
            }
        }
        int var11 = arg0.field3728;
        float var12 = (float) (arg0.field3725 - arg1);
        float var13 = (float) (arg0.field3723 - arg2);
        float var14 = (float) (arg0.field3747 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3746 << 7) + 64);
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
        this.field2963[this.field2974] = (byte) var24;
        this.field2961[this.field2974] = (byte) var25;
        this.field2965[this.field2974] = (byte) var26;
        this.field2971[this.field2974] = arg1;
        this.field2967[this.field2974] = arg2;
        this.field2964[this.field2974] = arg3;
        this.field2973.method75(new class304(this.field2974), -1, var8);
        return this.field2974++;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "()V", line = 138)
    public final void method1366() {
        class1 var1 = new class1(this.field2960 * 4);
        class1 var2 = new class1(this.field2974 * 16);
        if (class162.field2624) {
            for (int var3 = 0; var3 < this.field2974; var3++) {
                var2.method21(-99, this.field2963[var3]);
                var2.method21(121, this.field2961[var3]);
                var2.method21(102, this.field2965[var3]);
                var2.method21(85, 255);
                var2.method64((float) this.field2971[var3], (byte) 41);
                var2.method64((float) this.field2967[var3], (byte) 41);
                var2.method64((float) this.field2964[var3], (byte) 41);
            }
            for (int var4 = 0; var4 < this.field2960; var4++) {
                var1.method11(this.field2970[var4], 31932);
            }
        } else {
            for (int var5 = 0; var5 < this.field2974; var5++) {
                var2.method21(30, this.field2963[var5]);
                var2.method21(-124, this.field2961[var5]);
                var2.method21(-115, this.field2965[var5]);
                var2.method21(-94, 255);
                var2.method5(15852, (float) this.field2971[var5]);
                var2.method5(15852, (float) this.field2967[var5]);
                var2.method5(15852, (float) this.field2964[var5]);
            }
            for (int var6 = 0; var6 < this.field2960; var6++) {
                var1.method13(true, this.field2970[var6]);
            }
        }
        if (class162.field2639) {
            this.field2969 = new class312();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field34);
            this.field2969.method2202(var7);
            this.field2972 = new class312();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field34);
            this.field2972.method2201(var8);
        } else {
            this.field2968 = ByteBuffer.allocateDirect(var2.field48);
            this.field2968.put(var2.field34);
            this.field2968.flip();
            this.field2959 = ByteBuffer.allocateDirect(var1.field48);
            this.field2959.put(var1.field34);
            this.field2959.flip();
        }
        this.field2971 = null;
        this.field2967 = null;
        this.field2964 = null;
        this.field2963 = null;
        this.field2961 = null;
        this.field2965 = null;
        this.field2970 = null;
        this.field2973 = null;
    }
}
