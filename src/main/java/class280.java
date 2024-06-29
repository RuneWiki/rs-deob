import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class280 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public int field4833;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public int field4843;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public int field4846;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "Loe;")
    private class120 field4840;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "Lam;")
    private class244 field4837;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Lam;")
    private class244 field4841;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4845;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4847;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[B")
    private byte[] field4834;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "[B")
    private byte[] field4836;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "[B")
    private byte[] field4838;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "[I")
    private int[] field4835;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "[I")
    private int[] field4839;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "[I")
    private int[] field4842;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "[I")
    private int[] field4848;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V", line = 10)
    public final void method1955() {
        this.field4835 = new int[this.field4846];
        this.field4839 = new int[this.field4843];
        this.field4842 = new int[this.field4843];
        this.field4848 = new int[this.field4843];
        this.field4836 = new byte[this.field4843];
        this.field4834 = new byte[this.field4843];
        this.field4838 = new byte[this.field4843];
        this.field4840 = new class120(class58.method383((byte) -124, this.field4843));
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()V", line = 24)
    public final void method1956() {
        class194 var1 = new class194(this.field4844 * 4);
        class194 var2 = new class194(this.field4833 * 16);
        if (class247.field4235) {
            for (int var3 = 0; var3 < this.field4833; var3++) {
                var2.method1352(7528, this.field4836[var3]);
                var2.method1352(7528, this.field4834[var3]);
                var2.method1352(7528, this.field4838[var3]);
                var2.method1352(7528, 255);
                var2.method1328(24180, (float) this.field4839[var3]);
                var2.method1328(24180, (float) this.field4842[var3]);
                var2.method1328(24180, (float) this.field4848[var3]);
            }
            for (int var4 = 0; var4 < this.field4844; var4++) {
                var1.method1337(-58, this.field4835[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field4833; var5++) {
                var2.method1352(7528, this.field4836[var5]);
                var2.method1352(7528, this.field4834[var5]);
                var2.method1352(7528, this.field4838[var5]);
                var2.method1352(7528, 255);
                var2.method1302((float) this.field4839[var5], -550459832);
                var2.method1302((float) this.field4842[var5], -550459832);
                var2.method1302((float) this.field4848[var5], -550459832);
            }
            for (int var6 = 0; var6 < this.field4844; var6++) {
                var1.method1333(this.field4835[var6], (byte) -49);
            }
        }
        if (class247.field4248) {
            this.field4841 = new class244();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field3417);
            this.field4841.method1662(var7);
            this.field4837 = new class244();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field3417);
            this.field4837.method1664(var8);
        } else {
            this.field4847 = ByteBuffer.allocateDirect(var2.field3380);
            this.field4847.put(var2.field3417);
            this.field4847.flip();
            this.field4845 = ByteBuffer.allocateDirect(var1.field3380);
            this.field4845.put(var1.field3417);
            this.field4845.flip();
        }
        this.field4839 = null;
        this.field4842 = null;
        this.field4848 = null;
        this.field4836 = null;
        this.field4834 = null;
        this.field4838 = null;
        this.field4835 = null;
        this.field4840 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([I)V", line = 114)
    public final void method1957(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field4835[this.field4844++] = arg0[0];
            this.field4835[this.field4844++] = arg0[var2];
            this.field4835[this.field4844++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "()V", line = 126)
    public final void method1958() {
        GL var1 = class247.field4253;
        if (class247.field4248) {
            this.field4841.method1661();
            var1.glInterleavedArrays(10787, 16, 0L);
            class247.field4233 = false;
            this.field4837.method1660();
            var1.glDrawElements(4, this.field4844, 5125, 0L);
            return;
        }
        if (class247.field4248) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field4847);
        class247.field4233 = false;
        var1.glDrawElements(4, this.field4844, 5125, this.field4845);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lwc;IIIFFF)I", line = 151)
    public final int method1959(class97 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class155 var10 = (class155) this.field4840.method728(false, var8);
            if (var10 != null) {
                return var10.field2672;
            }
        }
        int var11 = arg0.field1681;
        float var12 = (float) (arg0.field1657 - arg1);
        float var13 = (float) (arg0.field1651 - arg2);
        float var14 = (float) (arg0.field1660 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field1646 << 7) + 64);
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
        this.field4836[this.field4833] = (byte) var24;
        this.field4834[this.field4833] = (byte) var25;
        this.field4838[this.field4833] = (byte) var26;
        this.field4839[this.field4833] = arg1;
        this.field4842[this.field4833] = arg2;
        this.field4848[this.field4833] = arg3;
        this.field4840.method730(new class155(this.field4833), var8, (byte) 127);
        return this.field4833++;
    }
}
