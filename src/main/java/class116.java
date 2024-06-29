import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class116 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public int field2119;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field2120;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public int field2123;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Ldh;")
    private class159 field2118;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lul;")
    private class39 field2121;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lul;")
    private class39 field2130;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2122;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2127;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "[B")
    private byte[] field2125;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "[B")
    private byte[] field2126;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "[B")
    private byte[] field2133;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "[I")
    private int[] field2124;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "[I")
    private int[] field2128;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "[I")
    private int[] field2129;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "[I")
    private int[] field2132;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lgj;IIIFFF)I", line = 16)
    public final int method824(class220 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class84 var10 = (class84) this.field2118.method1151(var8, 0);
            if (var10 != null) {
                return var10.field1552;
            }
        }
        int var11 = arg0.field3741;
        float var12 = (float) (arg0.field3730 - arg1);
        float var13 = (float) (arg0.field3744 - arg2);
        float var14 = (float) (arg0.field3734 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3716 << 7) + 64);
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
        this.field2126[this.field2119] = (byte) var24;
        this.field2133[this.field2119] = (byte) var25;
        this.field2125[this.field2119] = (byte) var26;
        this.field2124[this.field2119] = arg1;
        this.field2129[this.field2119] = arg2;
        this.field2128[this.field2119] = arg3;
        this.field2118.method1149(new class84(this.field2119), var8, -62);
        return this.field2119++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V", line = 86)
    public final void method825() {
        GL var1 = class123.field2212;
        if (class123.field2227) {
            this.field2121.method301();
            var1.glInterleavedArrays(10787, 16, 0L);
            class123.field2219 = false;
            this.field2130.method303();
            var1.glDrawElements(4, this.field2131, 5125, 0L);
            return;
        }
        if (class123.field2227) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field2122);
        class123.field2219 = false;
        var1.glDrawElements(4, this.field2131, 5125, this.field2127);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([I)V", line = 114)
    public final void method826(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field2132[this.field2131++] = arg0[0];
            this.field2132[this.field2131++] = arg0[var2];
            this.field2132[this.field2131++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()V", line = 126)
    public final void method827() {
        class13 var1 = new class13(this.field2131 * 4);
        class13 var2 = new class13(this.field2119 * 16);
        if (class123.field2221) {
            for (int var3 = 0; var3 < this.field2119; var3++) {
                var2.method130(-1, this.field2126[var3]);
                var2.method130(-1, this.field2133[var3]);
                var2.method130(-1, this.field2125[var3]);
                var2.method130(-1, 255);
                var2.method141((float) this.field2124[var3], -1731515408);
                var2.method141((float) this.field2129[var3], -1731515408);
                var2.method141((float) this.field2128[var3], -1731515408);
            }
            for (int var4 = 0; var4 < this.field2131; var4++) {
                var1.method128((byte) 123, this.field2132[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field2119; var5++) {
                var2.method130(-1, this.field2126[var5]);
                var2.method130(-1, this.field2133[var5]);
                var2.method130(-1, this.field2125[var5]);
                var2.method130(-1, 255);
                var2.method106((float) this.field2124[var5], true);
                var2.method106((float) this.field2129[var5], true);
                var2.method106((float) this.field2128[var5], true);
            }
            for (int var6 = 0; var6 < this.field2131; var6++) {
                var1.method137(this.field2132[var6], (byte) 114);
            }
        }
        if (class123.field2227) {
            this.field2121 = new class39();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field254);
            this.field2121.method305(var7);
            this.field2130 = new class39();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field254);
            this.field2130.method302(var8);
        } else {
            this.field2122 = ByteBuffer.allocateDirect(var2.field281);
            this.field2122.put(var2.field254);
            this.field2122.flip();
            this.field2127 = ByteBuffer.allocateDirect(var1.field281);
            this.field2127.put(var1.field254);
            this.field2127.flip();
        }
        this.field2124 = null;
        this.field2129 = null;
        this.field2128 = null;
        this.field2126 = null;
        this.field2133 = null;
        this.field2125 = null;
        this.field2132 = null;
        this.field2118 = null;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "()V", line = 211)
    public final void method828() {
        this.field2132 = new int[this.field2120];
        this.field2124 = new int[this.field2123];
        this.field2129 = new int[this.field2123];
        this.field2128 = new int[this.field2123];
        this.field2126 = new byte[this.field2123];
        this.field2133 = new byte[this.field2123];
        this.field2125 = new byte[this.field2123];
        this.field2118 = new class159(class143.method1013((byte) 106, this.field2123));
    }
}
