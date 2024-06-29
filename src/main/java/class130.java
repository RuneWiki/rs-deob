import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class130 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Lbe;")
    private class235 field2343;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lwa;")
    private class75 field2339;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lwa;")
    private class75 field2346;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2347;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2350;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "[B")
    private byte[] field2349;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "[B")
    private byte[] field2352;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[B")
    private byte[] field2354;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    private int[] field2341;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
    private int[] field2342;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "[I")
    private int[] field2348;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[I")
    private int[] field2351;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V", line = 6)
    public final void method1040() {
        this.field2342 = new int[this.field2340];
        this.field2348 = new int[this.field2345];
        this.field2351 = new int[this.field2345];
        this.field2341 = new int[this.field2345];
        this.field2349 = new byte[this.field2345];
        this.field2352 = new byte[this.field2345];
        this.field2354 = new byte[this.field2345];
        this.field2343 = new class235(class237.method1678(this.field2345, -31981));
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()V", line = 20)
    public final void method1041() {
        GL var1 = class117.field2143;
        if (class117.field2145) {
            this.field2346.method536();
            var1.glInterleavedArrays(10787, 16, 0L);
            class117.field2154 = false;
            this.field2339.method533();
            var1.glDrawElements(4, this.field2344, 5125, 0L);
            return;
        }
        if (class117.field2145) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field2350);
        class117.field2154 = false;
        var1.glDrawElements(4, this.field2344, 5125, this.field2347);
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()V", line = 51)
    public final void method1042() {
        class94 var1 = new class94(this.field2344 * 4);
        class94 var2 = new class94(this.field2353 * 16);
        if (class117.field2135) {
            for (int var3 = 0; var3 < this.field2353; var3++) {
                var2.method753(this.field2349[var3], true);
                var2.method753(this.field2352[var3], true);
                var2.method753(this.field2354[var3], true);
                var2.method753(255, true);
                var2.method710((float) this.field2348[var3], -114);
                var2.method710((float) this.field2351[var3], -124);
                var2.method710((float) this.field2341[var3], -119);
            }
            for (int var4 = 0; var4 < this.field2344; var4++) {
                var1.method730(false, this.field2342[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field2353; var5++) {
                var2.method753(this.field2349[var5], true);
                var2.method753(this.field2352[var5], true);
                var2.method753(this.field2354[var5], true);
                var2.method753(255, true);
                var2.method733(128, (float) this.field2348[var5]);
                var2.method733(128, (float) this.field2351[var5]);
                var2.method733(128, (float) this.field2341[var5]);
            }
            for (int var6 = 0; var6 < this.field2344; var6++) {
                var1.method718((byte) -84, this.field2342[var6]);
            }
        }
        if (class117.field2145) {
            this.field2346 = new class75();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field1681);
            this.field2346.method534(var7);
            this.field2339 = new class75();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field1681);
            this.field2339.method537(var8);
        } else {
            this.field2350 = ByteBuffer.allocateDirect(var2.field1653);
            this.field2350.put(var2.field1681);
            this.field2350.flip();
            this.field2347 = ByteBuffer.allocateDirect(var1.field1653);
            this.field2347.put(var1.field1681);
            this.field2347.flip();
        }
        this.field2348 = null;
        this.field2351 = null;
        this.field2341 = null;
        this.field2349 = null;
        this.field2352 = null;
        this.field2354 = null;
        this.field2342 = null;
        this.field2343 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V", line = 137)
    public final void method1043(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field2342[this.field2344++] = arg0[0];
            this.field2342[this.field2344++] = arg0[var2];
            this.field2342[this.field2344++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Laa;IIIFFF)I", line = 153)
    public final int method1044(class196 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class188 var10 = (class188) this.field2343.method1672(var8, 19760);
            if (var10 != null) {
                return var10.field3237;
            }
        }
        int var11 = arg0.field3336;
        float var12 = (float) (arg0.field3334 - arg1);
        float var13 = (float) (arg0.field3352 - arg2);
        float var14 = (float) (arg0.field3335 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3349 << 7) + 64);
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
        this.field2349[this.field2353] = (byte) var24;
        this.field2352[this.field2353] = (byte) var25;
        this.field2354[this.field2353] = (byte) var26;
        this.field2348[this.field2353] = arg1;
        this.field2351[this.field2353] = arg2;
        this.field2341[this.field2353] = arg3;
        this.field2343.method1674(new class188(this.field2353), false, var8);
        return this.field2353++;
    }
}
