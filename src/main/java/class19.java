import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class19 {

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public int field257;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Lfd;")
    private class306 field258;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Lfd;")
    private class306 field268;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Lcd;")
    private class69 field260;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field266;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field270;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "[B")
    private byte[] field255;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "[B")
    private byte[] field259;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "[B")
    private byte[] field265;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "[I")
    private int[] field256;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "[I")
    private int[] field261;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "[I")
    private int[] field264;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "[I")
    private int[] field269;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "()V", line = 13)
    public final void method101() {
        this.field269 = new int[this.field267];
        this.field264 = new int[this.field263];
        this.field256 = new int[this.field263];
        this.field261 = new int[this.field263];
        this.field265 = new byte[this.field263];
        this.field255 = new byte[this.field263];
        this.field259 = new byte[this.field263];
        this.field260 = new class69(class120.method843(-87, this.field263));
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lhm;IIIFFF)I", line = 24)
    public final int method102(class48 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class174 var10 = (class174) this.field260.method451(var8, (byte) 100);
            if (var10 != null) {
                return var10.field2881;
            }
        }
        int var11 = arg0.field662;
        float var12 = (float) (arg0.field678 - arg1);
        float var13 = (float) (arg0.field682 - arg2);
        float var14 = (float) (arg0.field657 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field665 << 7) + 64);
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
        this.field265[this.field257] = (byte) var24;
        this.field255[this.field257] = (byte) var25;
        this.field259[this.field257] = (byte) var26;
        this.field264[this.field257] = arg1;
        this.field256[this.field257] = arg2;
        this.field261[this.field257] = arg3;
        this.field260.method461(9, var8, new class174(this.field257));
        return this.field257++;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "()V", line = 95)
    public final void method103() {
        GL var1 = class232.field3716;
        if (class232.field3700) {
            this.field258.method2177();
            var1.glInterleavedArrays(10787, 16, 0L);
            class232.field3689 = false;
            this.field268.method2173();
            var1.glDrawElements(4, this.field262, 5125, 0L);
            return;
        }
        if (class232.field3700) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field270);
        class232.field3689 = false;
        var1.glDrawElements(4, this.field262, 5125, this.field266);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([I)V", line = 121)
    public final void method104(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field269[this.field262++] = arg0[0];
            this.field269[this.field262++] = arg0[var2];
            this.field269[this.field262++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "()V", line = 136)
    public final void method105() {
        class44 var1 = new class44(this.field262 * 4);
        class44 var2 = new class44(this.field257 * 16);
        if (class232.field3718) {
            for (int var3 = 0; var3 < this.field257; var3++) {
                var2.method257(-2, this.field265[var3]);
                var2.method257(-2, this.field255[var3]);
                var2.method257(-2, this.field259[var3]);
                var2.method257(-2, 255);
                var2.method230(-125, (float) this.field264[var3]);
                var2.method230(-124, (float) this.field256[var3]);
                var2.method230(-121, (float) this.field261[var3]);
            }
            for (int var4 = 0; var4 < this.field262; var4++) {
                var1.method283((byte) -51, this.field269[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field257; var5++) {
                var2.method257(-2, this.field265[var5]);
                var2.method257(-2, this.field255[var5]);
                var2.method257(-2, this.field259[var5]);
                var2.method257(-2, 255);
                var2.method252(7284, (float) this.field264[var5]);
                var2.method252(7284, (float) this.field256[var5]);
                var2.method252(7284, (float) this.field261[var5]);
            }
            for (int var6 = 0; var6 < this.field262; var6++) {
                var1.method258(this.field269[var6], (byte) 40);
            }
        }
        if (class232.field3700) {
            this.field258 = new class306();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field573);
            this.field258.method2175(var7);
            this.field268 = new class306();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field573);
            this.field268.method2174(var8);
        } else {
            this.field270 = ByteBuffer.allocateDirect(var2.field586);
            this.field270.put(var2.field573);
            this.field270.flip();
            this.field266 = ByteBuffer.allocateDirect(var1.field586);
            this.field266.put(var1.field573);
            this.field266.flip();
        }
        this.field264 = null;
        this.field256 = null;
        this.field261 = null;
        this.field265 = null;
        this.field255 = null;
        this.field259 = null;
        this.field269 = null;
        this.field260 = null;
    }
}
