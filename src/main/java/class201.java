import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class201 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public int field3159;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public int field3160;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public int field3171;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lsa;")
    private class110 field3163;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Lll;")
    private class158 field3170;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Lll;")
    private class158 field3173;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3162;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3167;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[B")
    private byte[] field3164;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "[B")
    private byte[] field3169;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "[B")
    private byte[] field3172;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[I")
    private int[] field3158;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[I")
    private int[] field3161;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[I")
    private int[] field3165;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "[I")
    private int[] field3166;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()V", line = 7)
    public final void method1458() {
        this.field3165 = new int[this.field3159];
        this.field3166 = new int[this.field3171];
        this.field3161 = new int[this.field3171];
        this.field3158 = new int[this.field3171];
        this.field3172 = new byte[this.field3171];
        this.field3164 = new byte[this.field3171];
        this.field3169 = new byte[this.field3171];
        this.field3163 = new class110(class210.method1532(-1429694904, this.field3171));
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "()V", line = 22)
    public final void method1459() {
        class101 var1 = new class101(this.field3168 * 4);
        class101 var2 = new class101(this.field3160 * 16);
        if (class265.field4109) {
            for (int var3 = 0; var3 < this.field3160; var3++) {
                var2.method772((byte) -103, this.field3172[var3]);
                var2.method772((byte) -117, this.field3164[var3]);
                var2.method772((byte) -115, this.field3169[var3]);
                var2.method772((byte) -116, 255);
                var2.method744((float) this.field3166[var3], (byte) -85);
                var2.method744((float) this.field3161[var3], (byte) -85);
                var2.method744((float) this.field3158[var3], (byte) -85);
            }
            for (int var4 = 0; var4 < this.field3168; var4++) {
                var1.method784(-49, this.field3165[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field3160; var5++) {
                var2.method772((byte) -84, this.field3172[var5]);
                var2.method772((byte) -118, this.field3164[var5]);
                var2.method772((byte) -126, this.field3169[var5]);
                var2.method772((byte) -85, 255);
                var2.method765(-1, (float) this.field3166[var5]);
                var2.method765(-1, (float) this.field3161[var5]);
                var2.method765(-1, (float) this.field3158[var5]);
            }
            for (int var6 = 0; var6 < this.field3168; var6++) {
                var1.method725(this.field3165[var6], false);
            }
        }
        if (class265.field4111) {
            this.field3173 = new class158();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field1661);
            this.field3173.method1185(var7);
            this.field3170 = new class158();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field1661);
            this.field3170.method1187(var8);
        } else {
            this.field3167 = ByteBuffer.allocateDirect(var2.field1667);
            this.field3167.put(var2.field1661);
            this.field3167.flip();
            this.field3162 = ByteBuffer.allocateDirect(var1.field1667);
            this.field3162.put(var1.field1661);
            this.field3162.flip();
        }
        this.field3166 = null;
        this.field3161 = null;
        this.field3158 = null;
        this.field3172 = null;
        this.field3164 = null;
        this.field3169 = null;
        this.field3165 = null;
        this.field3163 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lc;IIIFFF)I", line = 107)
    public final int method1460(class306 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class250 var10 = (class250) this.field3163.method833(false, var8);
            if (var10 != null) {
                return var10.field3858;
            }
        }
        int var11 = arg0.field4812;
        float var12 = (float) (arg0.field4816 - arg1);
        float var13 = (float) (arg0.field4810 - arg2);
        float var14 = (float) (arg0.field4792 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4802 << 7) + 64);
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
        this.field3172[this.field3160] = (byte) var24;
        this.field3164[this.field3160] = (byte) var25;
        this.field3169[this.field3160] = (byte) var26;
        this.field3166[this.field3160] = arg1;
        this.field3161[this.field3160] = arg2;
        this.field3158[this.field3160] = arg3;
        this.field3163.method845(new class250(this.field3160), (byte) 93, var8);
        return this.field3160++;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "()V", line = 181)
    public final void method1461() {
        GL var1 = class265.field4099;
        if (class265.field4111) {
            this.field3173.method1184();
            var1.glInterleavedArrays(10787, 16, 0L);
            class265.field4108 = false;
            this.field3170.method1186();
            var1.glDrawElements(4, this.field3168, 5125, 0L);
            return;
        }
        if (class265.field4111) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field3167);
        class265.field4108 = false;
        var1.glDrawElements(4, this.field3168, 5125, this.field3162);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([I)V", line = 211)
    public final void method1462(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field3165[this.field3168++] = arg0[0];
            this.field3165[this.field3168++] = arg0[var2];
            this.field3165[this.field3168++] = arg0[var2 + 1];
        }
    }
}
