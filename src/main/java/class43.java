import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class43 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public int field683;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public int field684;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "Lpj;")
    private class182 field688;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "Lpj;")
    private class182 field698;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Lol;")
    private class231 field690;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field691;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field692;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[B")
    private byte[] field686;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[B")
    private byte[] field689;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "[B")
    private byte[] field695;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
    private int[] field685;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "[I")
    private int[] field694;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "[I")
    private int[] field696;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "[I")
    private int[] field697;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "()V", line = 13)
    public final void method297() {
        class291 var1 = new class291(this.field683 * 4);
        class291 var2 = new class291(this.field687 * 16);
        if (class217.field3537) {
            for (int var3 = 0; var3 < this.field687; var3++) {
                var2.method1980(false, this.field689[var3]);
                var2.method1980(false, this.field686[var3]);
                var2.method1980(false, this.field695[var3]);
                var2.method1980(false, 255);
                var2.method1987((float) this.field685[var3], (byte) 85);
                var2.method1987((float) this.field696[var3], (byte) 85);
                var2.method1987((float) this.field697[var3], (byte) 85);
            }
            for (int var4 = 0; var4 < this.field683; var4++) {
                var1.method1967(this.field694[var4], -1303690792);
            }
        } else {
            for (int var5 = 0; var5 < this.field687; var5++) {
                var2.method1980(false, this.field689[var5]);
                var2.method1980(false, this.field686[var5]);
                var2.method1980(false, this.field695[var5]);
                var2.method1980(false, 255);
                var2.method1970((float) this.field685[var5], 65536);
                var2.method1970((float) this.field696[var5], 65536);
                var2.method1970((float) this.field697[var5], 65536);
            }
            for (int var6 = 0; var6 < this.field683; var6++) {
                var1.method1998(this.field694[var6], (byte) 121);
            }
        }
        if (class217.field3526) {
            this.field688 = new class182();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field4950);
            this.field688.method1210(var7);
            this.field698 = new class182();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field4950);
            this.field698.method1209(var8);
        } else {
            this.field691 = ByteBuffer.allocateDirect(var2.field4946);
            this.field691.put(var2.field4950);
            this.field691.flip();
            this.field692 = ByteBuffer.allocateDirect(var1.field4946);
            this.field692.put(var1.field4950);
            this.field692.flip();
        }
        this.field685 = null;
        this.field696 = null;
        this.field697 = null;
        this.field689 = null;
        this.field686 = null;
        this.field695 = null;
        this.field694 = null;
        this.field690 = null;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "()V", line = 98)
    public final void method298() {
        this.field694 = new int[this.field684];
        this.field685 = new int[this.field693];
        this.field696 = new int[this.field693];
        this.field697 = new int[this.field693];
        this.field689 = new byte[this.field693];
        this.field686 = new byte[this.field693];
        this.field695 = new byte[this.field693];
        this.field690 = new class231(class270.method1847(this.field693, 96));
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([I)V", line = 113)
    public final void method299(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field694[this.field683++] = arg0[0];
            this.field694[this.field683++] = arg0[var2];
            this.field694[this.field683++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "()V", line = 125)
    public final void method300() {
        GL var1 = class217.field3551;
        if (class217.field3526) {
            this.field688.method1208();
            var1.glInterleavedArrays(10787, 16, 0L);
            class217.field3534 = false;
            this.field698.method1211();
            var1.glDrawElements(4, this.field683, 5125, 0L);
            return;
        }
        if (class217.field3526) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field691);
        class217.field3534 = false;
        var1.glDrawElements(4, this.field683, 5125, this.field692);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lvb;IIIFFF)I", line = 150)
    public final int method301(class54 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class114 var10 = (class114) this.field690.method1586(var8, -84);
            if (var10 != null) {
                return var10.field1616;
            }
        }
        int var11 = arg0.field829;
        float var12 = (float) (arg0.field838 - arg1);
        float var13 = (float) (arg0.field849 - arg2);
        float var14 = (float) (arg0.field848 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field854 << 7) + 64);
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
        this.field689[this.field687] = (byte) var24;
        this.field686[this.field687] = (byte) var25;
        this.field695[this.field687] = (byte) var26;
        this.field685[this.field687] = arg1;
        this.field696[this.field687] = arg2;
        this.field697[this.field687] = arg3;
        this.field690.method1593(var8, new class114(this.field687), 27497);
        return this.field687++;
    }
}
