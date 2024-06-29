import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class9 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lmk;")
    private class288 field341;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lmk;")
    private class288 field348;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lcd;")
    private class69 field350;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field340;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field346;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[B")
    private byte[] field344;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[B")
    private byte[] field345;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[B")
    private byte[] field355;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
    private int[] field347;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
    private int[] field349;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
    private int[] field351;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
    private int[] field352;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V", line = 7)
    public final void method65() {
        GL var1 = class97.field1801;
        if (class97.field1814) {
            this.field348.method2058();
            var1.glInterleavedArrays(10787, 16, 0L);
            class97.field1834 = false;
            this.field341.method2056();
            var1.glDrawElements(4, this.field354, 5125, 0L);
            return;
        }
        if (class97.field1814) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field340);
        class97.field1834 = false;
        var1.glDrawElements(4, this.field354, 5125, this.field346);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V", line = 33)
    public final void method66() {
        class53 var1 = new class53(this.field354 * 4);
        class53 var2 = new class53(this.field342 * 16);
        if (class97.field1808) {
            for (int var3 = 0; var3 < this.field342; var3++) {
                var2.method464(this.field344[var3], false);
                var2.method464(this.field345[var3], false);
                var2.method464(this.field355[var3], false);
                var2.method464(255, false);
                var2.method451((byte) -105, (float) this.field349[var3]);
                var2.method451((byte) -104, (float) this.field352[var3]);
                var2.method451((byte) -115, (float) this.field347[var3]);
            }
            for (int var4 = 0; var4 < this.field354; var4++) {
                var1.method444((byte) 46, this.field351[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field342; var5++) {
                var2.method464(this.field344[var5], false);
                var2.method464(this.field345[var5], false);
                var2.method464(this.field355[var5], false);
                var2.method464(255, false);
                var2.method459(false, (float) this.field349[var5]);
                var2.method459(false, (float) this.field352[var5]);
                var2.method459(false, (float) this.field347[var5]);
            }
            for (int var6 = 0; var6 < this.field354; var6++) {
                var1.method484((byte) -103, this.field351[var6]);
            }
        }
        if (class97.field1814) {
            this.field348 = new class288();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field1168);
            this.field348.method2055(var7);
            this.field341 = new class288();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field1168);
            this.field341.method2054(var8);
        } else {
            this.field340 = ByteBuffer.allocateDirect(var2.field1142);
            this.field340.put(var2.field1168);
            this.field340.flip();
            this.field346 = ByteBuffer.allocateDirect(var1.field1142);
            this.field346.put(var1.field1168);
            this.field346.flip();
        }
        this.field349 = null;
        this.field352 = null;
        this.field347 = null;
        this.field344 = null;
        this.field345 = null;
        this.field355 = null;
        this.field351 = null;
        this.field350 = null;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()V", line = 117)
    public final void method67() {
        this.field351 = new int[this.field343];
        this.field349 = new int[this.field353];
        this.field352 = new int[this.field353];
        this.field347 = new int[this.field353];
        this.field344 = new byte[this.field353];
        this.field345 = new byte[this.field353];
        this.field355 = new byte[this.field353];
        this.field350 = new class69(class189.method1440(1, this.field353));
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([I)V", line = 140)
    public final void method68(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field351[this.field354++] = arg0[0];
            this.field351[this.field354++] = arg0[var2];
            this.field351[this.field354++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lsg;IIIFFF)I", line = 154)
    public final int method69(class37 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class91 var10 = (class91) this.field350.method610(var8, -1);
            if (var10 != null) {
                return var10.field1714;
            }
        }
        int var11 = arg0.field818;
        float var12 = (float) (arg0.field843 - arg1);
        float var13 = (float) (arg0.field837 - arg2);
        float var14 = (float) (arg0.field814 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field836 << 7) + 64);
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
        this.field344[this.field342] = (byte) var24;
        this.field345[this.field342] = (byte) var25;
        this.field355[this.field342] = (byte) var26;
        this.field349[this.field342] = arg1;
        this.field352[this.field342] = arg2;
        this.field347[this.field342] = arg3;
        this.field350.method612(false, new class91(this.field342), var8);
        return this.field342++;
    }
}
