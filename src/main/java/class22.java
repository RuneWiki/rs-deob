import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class22 {

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "Lbf;")
    private class209 field386;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Lwk;")
    private class54 field379;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "Lwk;")
    private class54 field384;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field377;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field378;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "[B")
    private byte[] field375;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "[B")
    private byte[] field376;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "[B")
    private byte[] field382;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "[I")
    private int[] field385;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "[I")
    private int[] field388;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "[I")
    private int[] field389;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "[I")
    private int[] field390;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V", line = 5)
    public final void method177() {
        this.field389 = new int[this.field380];
        this.field388 = new int[this.field387];
        this.field385 = new int[this.field387];
        this.field390 = new int[this.field387];
        this.field375 = new byte[this.field387];
        this.field376 = new byte[this.field387];
        this.field382 = new byte[this.field387];
        this.field386 = new class209(class275.method1871(this.field387, 1110164296));
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([I)V", line = 18)
    public final void method178(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field389[this.field381++] = arg0[0];
            this.field389[this.field381++] = arg0[var2];
            this.field389[this.field381++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lke;IIIFFF)I", line = 34)
    public final int method179(class239 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class276 var10 = (class276) this.field386.method1372(false, var8);
            if (var10 != null) {
                return var10.field4703;
            }
        }
        int var11 = arg0.field3965;
        float var12 = (float) (arg0.field3944 - arg1);
        float var13 = (float) (arg0.field3966 - arg2);
        float var14 = (float) (arg0.field3958 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3946 << 7) + 64);
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
        this.field375[this.field383] = (byte) var24;
        this.field376[this.field383] = (byte) var25;
        this.field382[this.field383] = (byte) var26;
        this.field388[this.field383] = arg1;
        this.field385[this.field383] = arg2;
        this.field390[this.field383] = arg3;
        this.field386.method1376(var8, -1, new class276(this.field383));
        return this.field383++;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()V", line = 103)
    public final void method180() {
        GL var1 = class45.field688;
        if (class45.field674) {
            this.field379.method414();
            var1.glInterleavedArrays(10787, 16, 0L);
            class45.field671 = false;
            this.field384.method418();
            var1.glDrawElements(4, this.field381, 5125, 0L);
            return;
        }
        if (class45.field674) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field377);
        class45.field671 = false;
        var1.glDrawElements(4, this.field381, 5125, this.field378);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "()V", line = 136)
    public final void method181() {
        class221 var1 = new class221(this.field381 * 4);
        class221 var2 = new class221(this.field383 * 16);
        if (class45.field675) {
            for (int var3 = 0; var3 < this.field383; var3++) {
                var2.method1542(-126, this.field375[var3]);
                var2.method1542(-70, this.field376[var3]);
                var2.method1542(-112, this.field382[var3]);
                var2.method1542(-116, 255);
                var2.method1538(false, (float) this.field388[var3]);
                var2.method1538(false, (float) this.field385[var3]);
                var2.method1538(false, (float) this.field390[var3]);
            }
            for (int var4 = 0; var4 < this.field381; var4++) {
                var1.method1513(this.field389[var4], false);
            }
        } else {
            for (int var5 = 0; var5 < this.field383; var5++) {
                var2.method1542(-83, this.field375[var5]);
                var2.method1542(-69, this.field376[var5]);
                var2.method1542(-72, this.field382[var5]);
                var2.method1542(-109, 255);
                var2.method1558(-119, (float) this.field388[var5]);
                var2.method1558(-74, (float) this.field385[var5]);
                var2.method1558(-128, (float) this.field390[var5]);
            }
            for (int var6 = 0; var6 < this.field381; var6++) {
                var1.method1511(this.field389[var6], (byte) 118);
            }
        }
        if (class45.field674) {
            this.field379 = new class54();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field3617);
            this.field379.method415(var7);
            this.field384 = new class54();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field3617);
            this.field384.method417(var8);
        } else {
            this.field377 = ByteBuffer.allocateDirect(var2.field3610);
            this.field377.put(var2.field3617);
            this.field377.flip();
            this.field378 = ByteBuffer.allocateDirect(var1.field3610);
            this.field378.put(var1.field3617);
            this.field378.flip();
        }
        this.field388 = null;
        this.field385 = null;
        this.field390 = null;
        this.field375 = null;
        this.field376 = null;
        this.field382 = null;
        this.field389 = null;
        this.field386 = null;
    }
}
