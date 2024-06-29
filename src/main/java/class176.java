import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class176 {

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public int field3076;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Lui;")
    private class268 field3072;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Lph;")
    private class79 field3064;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Lph;")
    private class79 field3074;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3070;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3073;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[B")
    private byte[] field3068;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "[B")
    private byte[] field3071;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "[B")
    private byte[] field3075;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[I")
    private int[] field3062;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "[I")
    private int[] field3066;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[I")
    private int[] field3067;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "[I")
    private int[] field3077;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()V", line = 6)
    public final void method1190() {
        GL var1 = class108.field1899;
        if (class108.field1904) {
            this.field3064.method564();
            var1.glInterleavedArrays(10787, 16, 0L);
            class108.field1917 = false;
            this.field3074.method562();
            var1.glDrawElements(4, this.field3069, 5125, 0L);
            return;
        }
        if (class108.field1904) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field3070);
        class108.field1917 = false;
        var1.glDrawElements(4, this.field3069, 5125, this.field3073);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "()V", line = 34)
    public final void method1191() {
        class14 var1 = new class14(this.field3069 * 4);
        class14 var2 = new class14(this.field3063 * 16);
        if (class108.field1911) {
            for (int var3 = 0; var3 < this.field3063; var3++) {
                var2.method140(this.field3071[var3], (byte) 75);
                var2.method140(this.field3068[var3], (byte) 75);
                var2.method140(this.field3075[var3], (byte) 75);
                var2.method140(255, (byte) 75);
                var2.method130(false, (float) this.field3077[var3]);
                var2.method130(false, (float) this.field3067[var3]);
                var2.method130(false, (float) this.field3062[var3]);
            }
            for (int var4 = 0; var4 < this.field3069; var4++) {
                var1.method100(this.field3066[var4], 65280);
            }
        } else {
            for (int var5 = 0; var5 < this.field3063; var5++) {
                var2.method140(this.field3071[var5], (byte) 75);
                var2.method140(this.field3068[var5], (byte) 75);
                var2.method140(this.field3075[var5], (byte) 75);
                var2.method140(255, (byte) 75);
                var2.method91((float) this.field3077[var5], (byte) 111);
                var2.method91((float) this.field3067[var5], (byte) 92);
                var2.method91((float) this.field3062[var5], (byte) -105);
            }
            for (int var6 = 0; var6 < this.field3069; var6++) {
                var1.method89((byte) 94, this.field3066[var6]);
            }
        }
        if (class108.field1904) {
            this.field3064 = new class79();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field174);
            this.field3064.method563(var7);
            this.field3074 = new class79();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field174);
            this.field3074.method561(var8);
        } else {
            this.field3070 = ByteBuffer.allocateDirect(var2.field195);
            this.field3070.put(var2.field174);
            this.field3070.flip();
            this.field3073 = ByteBuffer.allocateDirect(var1.field195);
            this.field3073.put(var1.field174);
            this.field3073.flip();
        }
        this.field3077 = null;
        this.field3067 = null;
        this.field3062 = null;
        this.field3071 = null;
        this.field3068 = null;
        this.field3075 = null;
        this.field3066 = null;
        this.field3072 = null;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "()V", line = 120)
    public final void method1192() {
        this.field3066 = new int[this.field3065];
        this.field3077 = new int[this.field3076];
        this.field3067 = new int[this.field3076];
        this.field3062 = new int[this.field3076];
        this.field3071 = new byte[this.field3076];
        this.field3068 = new byte[this.field3076];
        this.field3075 = new byte[this.field3076];
        this.field3072 = new class268(class5.method28(-84, this.field3076));
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ldb;IIIFFF)I", line = 131)
    public final int method1193(class186 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class93 var10 = (class93) this.field3072.method1890(var8, -110);
            if (var10 != null) {
                return var10.field1678;
            }
        }
        int var11 = arg0.field3258;
        float var12 = (float) (arg0.field3266 - arg1);
        float var13 = (float) (arg0.field3254 - arg2);
        float var14 = (float) (arg0.field3253 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3263 << 7) + 64);
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
        this.field3071[this.field3063] = (byte) var24;
        this.field3068[this.field3063] = (byte) var25;
        this.field3075[this.field3063] = (byte) var26;
        this.field3077[this.field3063] = arg1;
        this.field3067[this.field3063] = arg2;
        this.field3062[this.field3063] = arg3;
        this.field3072.method1885(var8, new class93(this.field3063), (byte) -112);
        return this.field3063++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([I)V", line = 204)
    public final void method1194(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field3066[this.field3069++] = arg0[0];
            this.field3066[this.field3069++] = arg0[var2];
            this.field3066[this.field3069++] = arg0[var2 + 1];
        }
    }
}
