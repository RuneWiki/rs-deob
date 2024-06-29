import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class243 {

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public int field3878;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public int field3884;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public int field3888;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Ltl;")
    private class257 field3875;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Ltl;")
    private class257 field3879;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lfl;")
    private class86 field3886;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3874;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3885;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[B")
    private byte[] field3876;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[B")
    private byte[] field3877;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[B")
    private byte[] field3881;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
    private int[] field3880;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "[I")
    private int[] field3882;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "[I")
    private int[] field3883;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "[I")
    private int[] field3887;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V", line = 8)
    public final void method1737() {
        GL var1 = class166.field2648;
        if (class166.field2622) {
            this.field3875.method1823();
            var1.glInterleavedArrays(10787, 16, 0L);
            class166.field2652 = false;
            this.field3879.method1824();
            var1.glDrawElements(4, this.field3884, 5125, 0L);
            return;
        }
        if (class166.field2622) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field3885);
        class166.field2652 = false;
        var1.glDrawElements(4, this.field3884, 5125, this.field3874);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([I)V", line = 35)
    public final void method1738(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field3883[this.field3884++] = arg0[0];
            this.field3883[this.field3884++] = arg0[var2];
            this.field3883[this.field3884++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()V", line = 51)
    public final void method1739() {
        this.field3883 = new int[this.field3889];
        this.field3887 = new int[this.field3878];
        this.field3882 = new int[this.field3878];
        this.field3880 = new int[this.field3878];
        this.field3881 = new byte[this.field3878];
        this.field3877 = new byte[this.field3878];
        this.field3876 = new byte[this.field3878];
        this.field3886 = new class86(class110.method746(this.field3878, -705295902));
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lwa;IIIFFF)I", line = 62)
    public final int method1740(class297 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class55 var10 = (class55) this.field3886.method617(var8, false);
            if (var10 != null) {
                return var10.field804;
            }
        }
        int var11 = arg0.field4810;
        float var12 = (float) (arg0.field4803 - arg1);
        float var13 = (float) (arg0.field4795 - arg2);
        float var14 = (float) (arg0.field4808 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4816 << 7) + 64);
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
        this.field3881[this.field3888] = (byte) var24;
        this.field3877[this.field3888] = (byte) var25;
        this.field3876[this.field3888] = (byte) var26;
        this.field3887[this.field3888] = arg1;
        this.field3882[this.field3888] = arg2;
        this.field3880[this.field3888] = arg3;
        this.field3886.method610(106, new class55(this.field3888), var8);
        return this.field3888++;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V", line = 132)
    public final void method1741() {
        class112 var1 = new class112(this.field3884 * 4);
        class112 var2 = new class112(this.field3888 * 16);
        if (class166.field2642) {
            for (int var3 = 0; var3 < this.field3888; var3++) {
                var2.method797(this.field3881[var3], -22096);
                var2.method797(this.field3877[var3], -22096);
                var2.method797(this.field3876[var3], -22096);
                var2.method797(255, -22096);
                var2.method770(false, (float) this.field3887[var3]);
                var2.method770(false, (float) this.field3882[var3]);
                var2.method770(false, (float) this.field3880[var3]);
            }
            for (int var4 = 0; var4 < this.field3884; var4++) {
                var1.method787(853918096, this.field3883[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field3888; var5++) {
                var2.method797(this.field3881[var5], -22096);
                var2.method797(this.field3877[var5], -22096);
                var2.method797(this.field3876[var5], -22096);
                var2.method797(255, -22096);
                var2.method812(-17216, (float) this.field3887[var5]);
                var2.method812(-17216, (float) this.field3882[var5]);
                var2.method812(-17216, (float) this.field3880[var5]);
            }
            for (int var6 = 0; var6 < this.field3884; var6++) {
                var1.method804(true, this.field3883[var6]);
            }
        }
        if (class166.field2622) {
            this.field3875 = new class257();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field1607);
            this.field3875.method1821(var7);
            this.field3879 = new class257();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field1607);
            this.field3879.method1822(var8);
        } else {
            this.field3885 = ByteBuffer.allocateDirect(var2.field1640);
            this.field3885.put(var2.field1607);
            this.field3885.flip();
            this.field3874 = ByteBuffer.allocateDirect(var1.field1640);
            this.field3874.put(var1.field1607);
            this.field3874.flip();
        }
        this.field3887 = null;
        this.field3882 = null;
        this.field3880 = null;
        this.field3881 = null;
        this.field3877 = null;
        this.field3876 = null;
        this.field3883 = null;
        this.field3886 = null;
    }
}
