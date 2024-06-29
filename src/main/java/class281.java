import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class281 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public int field4447;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public int field4451;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public int field4459;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Lme;")
    private class206 field4454;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Lme;")
    private class206 field4455;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Ltm;")
    private class79 field4450;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4449;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4452;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[B")
    private byte[] field4446;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "[B")
    private byte[] field4457;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "[B")
    private byte[] field4460;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "[I")
    private int[] field4453;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "[I")
    private int[] field4456;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "[I")
    private int[] field4458;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "[I")
    private int[] field4461;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([I)V", line = 11)
    public final void method1917(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field4453[this.field4447++] = arg0[0];
            this.field4453[this.field4447++] = arg0[var2];
            this.field4453[this.field4447++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lqb;IIIFFF)I", line = 32)
    public final int method1918(class114 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class142 var10 = (class142) this.field4450.method732(var8, true);
            if (var10 != null) {
                return var10.field2601;
            }
        }
        int var11 = arg0.field1902;
        float var12 = (float) (arg0.field1906 - arg1);
        float var13 = (float) (arg0.field1922 - arg2);
        float var14 = (float) (arg0.field1920 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field1913 << 7) + 64);
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
        this.field4446[this.field4459] = (byte) var24;
        this.field4460[this.field4459] = (byte) var25;
        this.field4457[this.field4459] = (byte) var26;
        this.field4456[this.field4459] = arg1;
        this.field4458[this.field4459] = arg2;
        this.field4461[this.field4459] = arg3;
        this.field4450.method725(var8, new class142(this.field4459), 1);
        return this.field4459++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()V", line = 101)
    public final void method1919() {
        GL var1 = class43.field651;
        if (class43.field674) {
            this.field4455.method1539();
            var1.glInterleavedArrays(10787, 16, 0L);
            class43.field668 = false;
            this.field4454.method1541();
            var1.glDrawElements(4, this.field4447, 5125, 0L);
            return;
        }
        if (class43.field674) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field4449);
        class43.field668 = false;
        var1.glDrawElements(4, this.field4447, 5125, this.field4452);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()V", line = 126)
    public final void method1920() {
        class336 var1 = new class336(this.field4447 * 4);
        class336 var2 = new class336(this.field4459 * 16);
        if (class43.field639) {
            for (int var3 = 0; var3 < this.field4459; var3++) {
                var2.method2370(this.field4446[var3], (byte) -20);
                var2.method2370(this.field4460[var3], (byte) -20);
                var2.method2370(this.field4457[var3], (byte) -20);
                var2.method2370(255, (byte) -20);
                var2.method2353((float) this.field4456[var3], (byte) 94);
                var2.method2353((float) this.field4458[var3], (byte) 54);
                var2.method2353((float) this.field4461[var3], (byte) 64);
            }
            for (int var4 = 0; var4 < this.field4447; var4++) {
                var1.method2320(-6128, this.field4453[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field4459; var5++) {
                var2.method2370(this.field4446[var5], (byte) -20);
                var2.method2370(this.field4460[var5], (byte) -20);
                var2.method2370(this.field4457[var5], (byte) -20);
                var2.method2370(255, (byte) -20);
                var2.method2341((float) this.field4456[var5], 21536);
                var2.method2341((float) this.field4458[var5], 21536);
                var2.method2341((float) this.field4461[var5], 21536);
            }
            for (int var6 = 0; var6 < this.field4447; var6++) {
                var1.method2357(this.field4453[var6], (byte) -72);
            }
        }
        if (class43.field674) {
            this.field4455 = new class206();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field5342);
            this.field4455.method1538(var7);
            this.field4454 = new class206();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field5342);
            this.field4454.method1540(var8);
        } else {
            this.field4449 = ByteBuffer.allocateDirect(var2.field5353);
            this.field4449.put(var2.field5342);
            this.field4449.flip();
            this.field4452 = ByteBuffer.allocateDirect(var1.field5353);
            this.field4452.put(var1.field5342);
            this.field4452.flip();
        }
        this.field4456 = null;
        this.field4458 = null;
        this.field4461 = null;
        this.field4446 = null;
        this.field4460 = null;
        this.field4457 = null;
        this.field4453 = null;
        this.field4450 = null;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()V", line = 212)
    public final void method1921() {
        this.field4453 = new int[this.field4451];
        this.field4456 = new int[this.field4448];
        this.field4458 = new int[this.field4448];
        this.field4461 = new int[this.field4448];
        this.field4446 = new byte[this.field4448];
        this.field4460 = new byte[this.field4448];
        this.field4457 = new byte[this.field4448];
        this.field4450 = new class79(class168.method1318(this.field4448, false));
    }
}
