import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class11 {

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public int field118;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lrl;")
    private class207 field122;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Lrl;")
    private class207 field124;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lol;")
    private class246 field129;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field115;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field120;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[B")
    private byte[] field117;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "[B")
    private byte[] field123;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "[B")
    private byte[] field127;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "[I")
    private int[] field116;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "[I")
    private int[] field121;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "[I")
    private int[] field128;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
    private int[] field130;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V", line = 6)
    public final void method63() {
        GL var1 = class186.field2990;
        if (class186.field3027) {
            this.field124.method1517();
            var1.glInterleavedArrays(10787, 16, 0L);
            class186.field2987 = false;
            this.field122.method1516();
            var1.glDrawElements(4, this.field125, 5125, 0L);
            return;
        }
        if (class186.field3027) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field120);
        class186.field2987 = false;
        var1.glDrawElements(4, this.field125, 5125, this.field115);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([I)V", line = 40)
    public final void method64(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field128[this.field125++] = arg0[0];
            this.field128[this.field125++] = arg0[var2];
            this.field128[this.field125++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lmm;IIIFFF)I", line = 53)
    public final int method65(class272 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class310 var10 = (class310) this.field129.method1743(var8, (byte) -114);
            if (var10 != null) {
                return var10.field4844;
            }
        }
        int var11 = arg0.field4329;
        float var12 = (float) (arg0.field4325 - arg1);
        float var13 = (float) (arg0.field4312 - arg2);
        float var14 = (float) (arg0.field4317 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4324 << 7) + 64);
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
        this.field123[this.field126] = (byte) var24;
        this.field117[this.field126] = (byte) var25;
        this.field127[this.field126] = (byte) var26;
        this.field121[this.field126] = arg1;
        this.field130[this.field126] = arg2;
        this.field116[this.field126] = arg3;
        this.field129.method1750(new class310(this.field126), (byte) 119, var8);
        return this.field126++;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()V", line = 127)
    public final void method66() {
        this.field128 = new int[this.field119];
        this.field121 = new int[this.field118];
        this.field130 = new int[this.field118];
        this.field116 = new int[this.field118];
        this.field123 = new byte[this.field118];
        this.field117 = new byte[this.field118];
        this.field127 = new byte[this.field118];
        this.field129 = new class246(class290.method2032(94, this.field118));
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "()V", line = 138)
    public final void method67() {
        class192 var1 = new class192(this.field125 * 4);
        class192 var2 = new class192(this.field126 * 16);
        if (class186.field3014) {
            for (int var3 = 0; var3 < this.field126; var3++) {
                var2.method1365(-32769, this.field123[var3]);
                var2.method1365(-32769, this.field117[var3]);
                var2.method1365(-32769, this.field127[var3]);
                var2.method1365(-32769, 255);
                var2.method1345(31252, (float) this.field121[var3]);
                var2.method1345(31252, (float) this.field130[var3]);
                var2.method1345(31252, (float) this.field116[var3]);
            }
            for (int var4 = 0; var4 < this.field125; var4++) {
                var1.method1350(this.field128[var4], -54);
            }
        } else {
            for (int var5 = 0; var5 < this.field126; var5++) {
                var2.method1365(-32769, this.field123[var5]);
                var2.method1365(-32769, this.field117[var5]);
                var2.method1365(-32769, this.field127[var5]);
                var2.method1365(-32769, 255);
                var2.method1373(63, (float) this.field121[var5]);
                var2.method1373(75, (float) this.field130[var5]);
                var2.method1373(87, (float) this.field116[var5]);
            }
            for (int var6 = 0; var6 < this.field125; var6++) {
                var1.method1400(this.field128[var6], (byte) -95);
            }
        }
        if (class186.field3027) {
            this.field124 = new class207();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field3128);
            this.field124.method1518(var7);
            this.field122 = new class207();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field3128);
            this.field122.method1514(var8);
        } else {
            this.field120 = ByteBuffer.allocateDirect(var2.field3129);
            this.field120.put(var2.field3128);
            this.field120.flip();
            this.field115 = ByteBuffer.allocateDirect(var1.field3129);
            this.field115.put(var1.field3128);
            this.field115.flip();
        }
        this.field121 = null;
        this.field130 = null;
        this.field116 = null;
        this.field123 = null;
        this.field117 = null;
        this.field127 = null;
        this.field128 = null;
        this.field129 = null;
    }
}
