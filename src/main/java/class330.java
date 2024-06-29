import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class330 {

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public int field5394;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public int field5395;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public int field5398;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field5400;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Lvj;")
    private class205 field5399;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Lvj;")
    private class205 field5402;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lil;")
    private class4 field5390;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5396;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5401;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "[B")
    private byte[] field5389;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "[B")
    private byte[] field5397;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "[B")
    private byte[] field5403;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
    private int[] field5391;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[I")
    private int[] field5392;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "[I")
    private int[] field5393;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "[I")
    private int[] field5404;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "()V", line = 9)
    public final void method2353() {
        GL var1 = class245.field3884;
        if (class245.field3869) {
            this.field5402.method1397();
            var1.glInterleavedArrays(10787, 16, 0L);
            class245.field3877 = false;
            this.field5399.method1398();
            var1.glDrawElements(4, this.field5400, 5125, 0L);
            return;
        }
        if (class245.field3869) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field5401);
        class245.field3877 = false;
        var1.glDrawElements(4, this.field5400, 5125, this.field5396);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "()V", line = 35)
    public final void method2354() {
        class313 var1 = new class313(this.field5400 * 4);
        class313 var2 = new class313(this.field5394 * 16);
        if (class245.field3895) {
            for (int var3 = 0; var3 < this.field5394; var3++) {
                var2.method2193(this.field5403[var3], false);
                var2.method2193(this.field5389[var3], false);
                var2.method2193(this.field5397[var3], false);
                var2.method2193(255, false);
                var2.method2252((float) this.field5393[var3], false);
                var2.method2252((float) this.field5392[var3], false);
                var2.method2252((float) this.field5391[var3], false);
            }
            for (int var4 = 0; var4 < this.field5400; var4++) {
                var1.method2222(this.field5404[var4], 255);
            }
        } else {
            for (int var5 = 0; var5 < this.field5394; var5++) {
                var2.method2193(this.field5403[var5], false);
                var2.method2193(this.field5389[var5], false);
                var2.method2193(this.field5397[var5], false);
                var2.method2193(255, false);
                var2.method2219((float) this.field5393[var5], (byte) -125);
                var2.method2219((float) this.field5392[var5], (byte) -126);
                var2.method2219((float) this.field5391[var5], (byte) -127);
            }
            for (int var6 = 0; var6 < this.field5400; var6++) {
                var1.method2210((byte) -112, this.field5404[var6]);
            }
        }
        if (class245.field3869) {
            this.field5402 = new class205();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field5124);
            this.field5402.method1396(var7);
            this.field5399 = new class205();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field5124);
            this.field5399.method1399(var8);
        } else {
            this.field5401 = ByteBuffer.allocateDirect(var2.field5137);
            this.field5401.put(var2.field5124);
            this.field5401.flip();
            this.field5396 = ByteBuffer.allocateDirect(var1.field5137);
            this.field5396.put(var1.field5124);
            this.field5396.flip();
        }
        this.field5393 = null;
        this.field5392 = null;
        this.field5391 = null;
        this.field5403 = null;
        this.field5389 = null;
        this.field5397 = null;
        this.field5404 = null;
        this.field5390 = null;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "()V", line = 124)
    public final void method2355() {
        this.field5404 = new int[this.field5395];
        this.field5393 = new int[this.field5398];
        this.field5392 = new int[this.field5398];
        this.field5391 = new int[this.field5398];
        this.field5403 = new byte[this.field5398];
        this.field5389 = new byte[this.field5398];
        this.field5397 = new byte[this.field5398];
        this.field5390 = new class4(class329.method2347(this.field5398, (byte) -96));
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lni;IIIFFF)I", line = 135)
    public final int method2356(class241 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class94 var10 = (class94) this.field5390.method29(var8, 103);
            if (var10 != null) {
                return var10.field1373;
            }
        }
        int var11 = arg0.field3799;
        float var12 = (float) (arg0.field3783 - arg1);
        float var13 = (float) (arg0.field3800 - arg2);
        float var14 = (float) (arg0.field3807 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3806 << 7) + 64);
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
        this.field5403[this.field5394] = (byte) var24;
        this.field5389[this.field5394] = (byte) var25;
        this.field5397[this.field5394] = (byte) var26;
        this.field5393[this.field5394] = arg1;
        this.field5392[this.field5394] = arg2;
        this.field5391[this.field5394] = arg3;
        this.field5390.method37(false, new class94(this.field5394), var8);
        return this.field5394++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([I)V", line = 205)
    public final void method2357(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field5404[this.field5400++] = arg0[0];
            this.field5404[this.field5400++] = arg0[var2];
            this.field5404[this.field5400++] = arg0[var2 + 1];
        }
    }
}
