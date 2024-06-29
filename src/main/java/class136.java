import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class136 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public int field2241;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public int field2245;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public int field2247;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Ljh;")
    private class225 field2244;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "Ljh;")
    private class225 field2250;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "Leh;")
    private class94 field2256;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2248;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2253;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "[B")
    private byte[] field2243;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "[B")
    private byte[] field2254;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "[B")
    private byte[] field2255;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "[I")
    private int[] field2242;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
    private int[] field2249;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "[I")
    private int[] field2251;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "[I")
    private int[] field2252;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "()V", line = 9)
    public final void method991() {
        GL var1 = class55.field812;
        if (class55.field798) {
            this.field2244.method1548();
            var1.glInterleavedArrays(10787, 16, 0L);
            class55.field823 = false;
            this.field2250.method1552();
            var1.glDrawElements(4, this.field2241, 5125, 0L);
            return;
        }
        if (class55.field798) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field2253);
        class55.field823 = false;
        var1.glDrawElements(4, this.field2241, 5125, this.field2248);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "()V", line = 34)
    public final void method992() {
        this.field2252 = new int[this.field2246];
        this.field2251 = new int[this.field2247];
        this.field2242 = new int[this.field2247];
        this.field2249 = new int[this.field2247];
        this.field2243 = new byte[this.field2247];
        this.field2255 = new byte[this.field2247];
        this.field2254 = new byte[this.field2247];
        this.field2256 = new class94(class43.method293(true, this.field2247));
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Luf;IIIFFF)I", line = 46)
    public final int method993(class211 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class174 var10 = (class174) this.field2256.method685(var8, 128);
            if (var10 != null) {
                return var10.field2851;
            }
        }
        int var11 = arg0.field3455;
        float var12 = (float) (arg0.field3443 - arg1);
        float var13 = (float) (arg0.field3461 - arg2);
        float var14 = (float) (arg0.field3441 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3433 << 7) + 64);
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
        this.field2243[this.field2245] = (byte) var24;
        this.field2255[this.field2245] = (byte) var25;
        this.field2254[this.field2245] = (byte) var26;
        this.field2251[this.field2245] = arg1;
        this.field2242[this.field2245] = arg2;
        this.field2249[this.field2245] = arg3;
        this.field2256.method694(new class174(this.field2245), (byte) -90, var8);
        return this.field2245++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([I)V", line = 116)
    public final void method994(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field2252[this.field2241++] = arg0[0];
            this.field2252[this.field2241++] = arg0[var2];
            this.field2252[this.field2241++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "()V", line = 130)
    public final void method995() {
        class170 var1 = new class170(this.field2241 * 4);
        class170 var2 = new class170(this.field2245 * 16);
        if (class55.field819) {
            for (int var3 = 0; var3 < this.field2245; var3++) {
                var2.method1219(this.field2243[var3], true);
                var2.method1219(this.field2255[var3], true);
                var2.method1219(this.field2254[var3], true);
                var2.method1219(255, true);
                var2.method1230((byte) 126, (float) this.field2251[var3]);
                var2.method1230((byte) 105, (float) this.field2242[var3]);
                var2.method1230((byte) 124, (float) this.field2249[var3]);
            }
            for (int var4 = 0; var4 < this.field2241; var4++) {
                var1.method1213(-1, this.field2252[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field2245; var5++) {
                var2.method1219(this.field2243[var5], true);
                var2.method1219(this.field2255[var5], true);
                var2.method1219(this.field2254[var5], true);
                var2.method1219(255, true);
                var2.method1252((float) this.field2251[var5], -106);
                var2.method1252((float) this.field2242[var5], 116);
                var2.method1252((float) this.field2249[var5], 122);
            }
            for (int var6 = 0; var6 < this.field2241; var6++) {
                var1.method1225(this.field2252[var6], true);
            }
        }
        if (class55.field798) {
            this.field2244 = new class225();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field2758);
            this.field2244.method1550(var7);
            this.field2250 = new class225();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field2758);
            this.field2250.method1549(var8);
        } else {
            this.field2253 = ByteBuffer.allocateDirect(var2.field2787);
            this.field2253.put(var2.field2758);
            this.field2253.flip();
            this.field2248 = ByteBuffer.allocateDirect(var1.field2787);
            this.field2248.put(var1.field2758);
            this.field2248.flip();
        }
        this.field2251 = null;
        this.field2242 = null;
        this.field2249 = null;
        this.field2243 = null;
        this.field2255 = null;
        this.field2254 = null;
        this.field2252 = null;
        this.field2256 = null;
    }
}
