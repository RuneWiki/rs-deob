import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class63 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lkf;")
    private class249 field1211;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lkf;")
    private class249 field1221;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Ll;")
    private class328 field1212;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1216;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1218;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[B")
    private byte[] field1217;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "[B")
    private byte[] field1224;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "[B")
    private byte[] field1225;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[I")
    private int[] field1213;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "[I")
    private int[] field1219;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "[I")
    private int[] field1220;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "[I")
    private int[] field1222;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "()V", line = 13)
    public final void method509() {
        class146 var1 = new class146(this.field1223 * 4);
        class146 var2 = new class146(this.field1226 * 16);
        if (class241.field4007) {
            for (int var3 = 0; var3 < this.field1226; var3++) {
                var2.method1027(this.field1224[var3], -20374);
                var2.method1027(this.field1217[var3], -20374);
                var2.method1027(this.field1225[var3], -20374);
                var2.method1027(255, -20374);
                var2.method1006((byte) 122, (float) this.field1219[var3]);
                var2.method1006((byte) 127, (float) this.field1222[var3]);
                var2.method1006((byte) 119, (float) this.field1220[var3]);
            }
            for (int var4 = 0; var4 < this.field1223; var4++) {
                var1.method1045((byte) 1, this.field1213[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field1226; var5++) {
                var2.method1027(this.field1224[var5], -20374);
                var2.method1027(this.field1217[var5], -20374);
                var2.method1027(this.field1225[var5], -20374);
                var2.method1027(255, -20374);
                var2.method1001(-63, (float) this.field1219[var5]);
                var2.method1001(-38, (float) this.field1222[var5]);
                var2.method1001(-107, (float) this.field1220[var5]);
            }
            for (int var6 = 0; var6 < this.field1223; var6++) {
                var1.method1040((byte) -120, this.field1213[var6]);
            }
        }
        if (class241.field4020) {
            this.field1211 = new class249();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field2496);
            this.field1211.method1756(var7);
            this.field1221 = new class249();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field2496);
            this.field1221.method1752(var8);
        } else {
            this.field1218 = ByteBuffer.allocateDirect(var2.field2435);
            this.field1218.put(var2.field2496);
            this.field1218.flip();
            this.field1216 = ByteBuffer.allocateDirect(var1.field2435);
            this.field1216.put(var1.field2496);
            this.field1216.flip();
        }
        this.field1219 = null;
        this.field1222 = null;
        this.field1220 = null;
        this.field1224 = null;
        this.field1217 = null;
        this.field1225 = null;
        this.field1213 = null;
        this.field1212 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([I)V", line = 104)
    public final void method510(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field1213[this.field1223++] = arg0[0];
            this.field1213[this.field1223++] = arg0[var2];
            this.field1213[this.field1223++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "()V", line = 115)
    public final void method511() {
        this.field1213 = new int[this.field1215];
        this.field1219 = new int[this.field1214];
        this.field1222 = new int[this.field1214];
        this.field1220 = new int[this.field1214];
        this.field1224 = new byte[this.field1214];
        this.field1217 = new byte[this.field1214];
        this.field1225 = new byte[this.field1214];
        this.field1212 = new class328(class311.method2264(this.field1214, (byte) -62));
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lsd;IIIFFF)I", line = 127)
    public final int method512(class33 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class111 var10 = (class111) this.field1212.method2344(-1, var8);
            if (var10 != null) {
                return var10.field2030;
            }
        }
        int var11 = arg0.field748;
        float var12 = (float) (arg0.field750 - arg1);
        float var13 = (float) (arg0.field737 - arg2);
        float var14 = (float) (arg0.field733 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field723 << 7) + 64);
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
        this.field1224[this.field1226] = (byte) var24;
        this.field1217[this.field1226] = (byte) var25;
        this.field1225[this.field1226] = (byte) var26;
        this.field1219[this.field1226] = arg1;
        this.field1222[this.field1226] = arg2;
        this.field1220[this.field1226] = arg3;
        this.field1212.method2337(new class111(this.field1226), 709, var8);
        return this.field1226++;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "()V", line = 196)
    public final void method513() {
        GL var1 = class241.field4012;
        if (class241.field4020) {
            this.field1211.method1755();
            var1.glInterleavedArrays(10787, 16, 0L);
            class241.field4027 = false;
            this.field1221.method1753();
            var1.glDrawElements(4, this.field1223, 5125, 0L);
            return;
        }
        if (class241.field4020) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field1218);
        class241.field4027 = false;
        var1.glDrawElements(4, this.field1223, 5125, this.field1216);
    }
}
