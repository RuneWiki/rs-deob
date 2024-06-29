import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class192 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Lvd;")
    private class126 field3200;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lsl;")
    private class92 field3195;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lsl;")
    private class92 field3196;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3187;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3202;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[B")
    private byte[] field3191;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[B")
    private byte[] field3197;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "[B")
    private byte[] field3199;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "[I")
    private int[] field3190;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[I")
    private int[] field3192;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[I")
    private int[] field3194;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[I")
    private int[] field3198;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "()V", line = 13)
    public final void method1445() {
        class60 var1 = new class60(this.field3189 * 4);
        class60 var2 = new class60(this.field3201 * 16);
        if (class47.field749) {
            for (int var3 = 0; var3 < this.field3201; var3++) {
                var2.method518(105, this.field3197[var3]);
                var2.method518(124, this.field3199[var3]);
                var2.method518(101, this.field3191[var3]);
                var2.method518(121, 255);
                var2.method521((float) this.field3198[var3], (byte) 98);
                var2.method521((float) this.field3190[var3], (byte) 98);
                var2.method521((float) this.field3194[var3], (byte) 98);
            }
            for (int var4 = 0; var4 < this.field3189; var4++) {
                var1.method510(this.field3192[var4], 89);
            }
        } else {
            for (int var5 = 0; var5 < this.field3201; var5++) {
                var2.method518(127, this.field3197[var5]);
                var2.method518(119, this.field3199[var5]);
                var2.method518(113, this.field3191[var5]);
                var2.method518(100, 255);
                var2.method475(-19674, (float) this.field3198[var5]);
                var2.method475(-19674, (float) this.field3190[var5]);
                var2.method475(-19674, (float) this.field3194[var5]);
            }
            for (int var6 = 0; var6 < this.field3189; var6++) {
                var1.method528((byte) 104, this.field3192[var6]);
            }
        }
        if (class47.field768) {
            this.field3196 = new class92();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field997);
            this.field3196.method720(var7);
            this.field3195 = new class92();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field997);
            this.field3195.method718(var8);
        } else {
            this.field3202 = ByteBuffer.allocateDirect(var2.field1012);
            this.field3202.put(var2.field997);
            this.field3202.flip();
            this.field3187 = ByteBuffer.allocateDirect(var1.field1012);
            this.field3187.put(var1.field997);
            this.field3187.flip();
        }
        this.field3198 = null;
        this.field3190 = null;
        this.field3194 = null;
        this.field3197 = null;
        this.field3199 = null;
        this.field3191 = null;
        this.field3192 = null;
        this.field3200 = null;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "()V", line = 100)
    public final void method1446() {
        this.field3192 = new int[this.field3193];
        this.field3198 = new int[this.field3188];
        this.field3190 = new int[this.field3188];
        this.field3194 = new int[this.field3188];
        this.field3197 = new byte[this.field3188];
        this.field3199 = new byte[this.field3188];
        this.field3191 = new byte[this.field3188];
        this.field3200 = new class126(class118.method904(1440830960, this.field3188));
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([I)V", line = 113)
    public final void method1447(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field3192[this.field3189++] = arg0[0];
            this.field3192[this.field3189++] = arg0[var2];
            this.field3192[this.field3189++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "()V", line = 128)
    public final void method1448() {
        GL var1 = class47.field739;
        if (class47.field768) {
            this.field3196.method722();
            var1.glInterleavedArrays(10787, 16, 0L);
            class47.field752 = false;
            this.field3195.method719();
            var1.glDrawElements(4, this.field3189, 5125, 0L);
            return;
        }
        if (class47.field768) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field3202);
        class47.field752 = false;
        var1.glDrawElements(4, this.field3189, 5125, this.field3187);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lsa;IIIFFF)I", line = 154)
    public final int method1449(class102 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class8 var10 = (class8) this.field3200.method1007(var8, -17004);
            if (var10 != null) {
                return var10.field109;
            }
        }
        int var11 = arg0.field1720;
        float var12 = (float) (arg0.field1730 - arg1);
        float var13 = (float) (arg0.field1736 - arg2);
        float var14 = (float) (arg0.field1719 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field1717 << 7) + 64);
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
        this.field3197[this.field3201] = (byte) var24;
        this.field3199[this.field3201] = (byte) var25;
        this.field3191[this.field3201] = (byte) var26;
        this.field3198[this.field3201] = arg1;
        this.field3190[this.field3201] = arg2;
        this.field3194[this.field3201] = arg3;
        this.field3200.method1004((byte) 73, var8, new class8(this.field3201));
        return this.field3201++;
    }
}
