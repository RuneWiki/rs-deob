import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class24 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public int field359;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Ltd;")
    private class192 field351;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lmc;")
    private class52 field355;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Lmc;")
    private class52 field358;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field357;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field361;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[B")
    private byte[] field352;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "[B")
    private byte[] field364;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "[B")
    private byte[] field365;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[I")
    private int[] field354;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "[I")
    private int[] field356;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
    private int[] field360;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "[I")
    private int[] field362;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lpe;IIIFFF)I", line = 6)
    public final int method161(class266 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class261 var10 = (class261) this.field351.method1320(var8, 13002);
            if (var10 != null) {
                return var10.field3954;
            }
        }
        int var11 = arg0.field4069;
        float var12 = (float) (arg0.field4088 - arg1);
        float var13 = (float) (arg0.field4092 - arg2);
        float var14 = (float) (arg0.field4074 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4098 << 7) + 64);
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
        this.field364[this.field353] = (byte) var24;
        this.field352[this.field353] = (byte) var25;
        this.field365[this.field353] = (byte) var26;
        this.field354[this.field353] = arg1;
        this.field362[this.field353] = arg2;
        this.field360[this.field353] = arg3;
        this.field351.method1319(126, var8, new class261(this.field353));
        return this.field353++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([I)V", line = 80)
    public final void method162(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field356[this.field350++] = arg0[0];
            this.field356[this.field350++] = arg0[var2];
            this.field356[this.field350++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V", line = 97)
    public final void method163() {
        class263 var1 = new class263(this.field350 * 4);
        class263 var2 = new class263(this.field353 * 16);
        if (class117.field1811) {
            for (int var3 = 0; var3 < this.field353; var3++) {
                var2.method1813(-128, this.field364[var3]);
                var2.method1813(19, this.field352[var3]);
                var2.method1813(-81, this.field365[var3]);
                var2.method1813(-90, 255);
                var2.method1811((float) this.field354[var3], false);
                var2.method1811((float) this.field362[var3], false);
                var2.method1811((float) this.field360[var3], false);
            }
            for (int var4 = 0; var4 < this.field350; var4++) {
                var1.method1815(79, this.field356[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field353; var5++) {
                var2.method1813(-101, this.field364[var5]);
                var2.method1813(-112, this.field352[var5]);
                var2.method1813(-113, this.field365[var5]);
                var2.method1813(-111, 255);
                var2.method1821((float) this.field354[var5], -124);
                var2.method1821((float) this.field362[var5], -114);
                var2.method1821((float) this.field360[var5], -105);
            }
            for (int var6 = 0; var6 < this.field350; var6++) {
                var1.method1829(this.field356[var6], 3);
            }
        }
        if (class117.field1802) {
            this.field355 = new class52();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field3986);
            this.field355.method348(var7);
            this.field358 = new class52();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field3986);
            this.field358.method347(var8);
        } else {
            this.field357 = ByteBuffer.allocateDirect(var2.field4025);
            this.field357.put(var2.field3986);
            this.field357.flip();
            this.field361 = ByteBuffer.allocateDirect(var1.field4025);
            this.field361.put(var1.field3986);
            this.field361.flip();
        }
        this.field354 = null;
        this.field362 = null;
        this.field360 = null;
        this.field364 = null;
        this.field352 = null;
        this.field365 = null;
        this.field356 = null;
        this.field351 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "()V", line = 182)
    public final void method164() {
        GL var1 = class117.field1801;
        if (class117.field1802) {
            this.field355.method345();
            var1.glInterleavedArrays(10787, 16, 0L);
            class117.field1797 = false;
            this.field358.method346();
            var1.glDrawElements(4, this.field350, 5125, 0L);
            return;
        }
        if (class117.field1802) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field357);
        class117.field1797 = false;
        var1.glDrawElements(4, this.field350, 5125, this.field361);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "()V", line = 209)
    public final void method165() {
        this.field356 = new int[this.field359];
        this.field354 = new int[this.field363];
        this.field362 = new int[this.field363];
        this.field360 = new int[this.field363];
        this.field364 = new byte[this.field363];
        this.field352 = new byte[this.field363];
        this.field365 = new byte[this.field363];
        this.field351 = new class192(class104.method731(this.field363, -69));
    }
}
