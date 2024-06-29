import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class63 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Lic;")
    private class329 field793;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Llk;")
    private class34 field786;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Llk;")
    private class34 field790;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field781;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field783;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[B")
    private byte[] field784;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[B")
    private byte[] field785;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "[B")
    private byte[] field794;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[I")
    private int[] field788;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[I")
    private int[] field789;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[I")
    private int[] field792;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "[I")
    private int[] field795;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([I)V", line = 16)
    public final void method460(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field789[this.field791++] = arg0[0];
            this.field789[this.field791++] = arg0[var2];
            this.field789[this.field791++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V", line = 27)
    public final void method461() {
        this.field789 = new int[this.field782];
        this.field795 = new int[this.field780];
        this.field792 = new int[this.field780];
        this.field788 = new int[this.field780];
        this.field784 = new byte[this.field780];
        this.field785 = new byte[this.field780];
        this.field794 = new byte[this.field780];
        this.field793 = new class329(class262.method1805(this.field780, (byte) 88));
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "()V", line = 38)
    public final void method462() {
        GL var1 = class47.field592;
        if (class47.field618) {
            this.field786.method220();
            var1.glInterleavedArrays(10787, 16, 0L);
            class47.field619 = false;
            this.field790.method219();
            var1.glDrawElements(4, this.field791, 5125, 0L);
            return;
        }
        if (class47.field618) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field781);
        class47.field619 = false;
        var1.glDrawElements(4, this.field791, 5125, this.field783);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "()V", line = 69)
    public final void method463() {
        class299 var1 = new class299(this.field791 * 4);
        class299 var2 = new class299(this.field787 * 16);
        if (class47.field593) {
            for (int var3 = 0; var3 < this.field787; var3++) {
                var2.method2048(this.field784[var3], 121);
                var2.method2048(this.field785[var3], 70);
                var2.method2048(this.field794[var3], 76);
                var2.method2048(255, 62);
                var2.method2071(true, (float) this.field795[var3]);
                var2.method2071(true, (float) this.field792[var3]);
                var2.method2071(true, (float) this.field788[var3]);
            }
            for (int var4 = 0; var4 < this.field791; var4++) {
                var1.method2084(true, this.field789[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field787; var5++) {
                var2.method2048(this.field784[var5], 95);
                var2.method2048(this.field785[var5], 74);
                var2.method2048(this.field794[var5], 68);
                var2.method2048(255, 84);
                var2.method2099((float) this.field795[var5], -2503);
                var2.method2099((float) this.field792[var5], -2503);
                var2.method2099((float) this.field788[var5], -2503);
            }
            for (int var6 = 0; var6 < this.field791; var6++) {
                var1.method2066(this.field789[var6], false);
            }
        }
        if (class47.field618) {
            this.field786 = new class34();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field4350);
            this.field786.method218(var7);
            this.field790 = new class34();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field4350);
            this.field790.method217(var8);
        } else {
            this.field781 = ByteBuffer.allocateDirect(var2.field4351);
            this.field781.put(var2.field4350);
            this.field781.flip();
            this.field783 = ByteBuffer.allocateDirect(var1.field4351);
            this.field783.put(var1.field4350);
            this.field783.flip();
        }
        this.field795 = null;
        this.field792 = null;
        this.field788 = null;
        this.field784 = null;
        this.field785 = null;
        this.field794 = null;
        this.field789 = null;
        this.field793 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lem;IIIFFF)I", line = 154)
    public final int method464(class339 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class7 var10 = (class7) this.field793.method2279(var8, -118);
            if (var10 != null) {
                return var10.field67;
            }
        }
        int var11 = arg0.field5283;
        float var12 = (float) (arg0.field5309 - arg1);
        float var13 = (float) (arg0.field5284 - arg2);
        float var14 = (float) (arg0.field5282 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field5278 << 7) + 64);
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
        this.field784[this.field787] = (byte) var24;
        this.field785[this.field787] = (byte) var25;
        this.field794[this.field787] = (byte) var26;
        this.field795[this.field787] = arg1;
        this.field792[this.field787] = arg2;
        this.field788[this.field787] = arg3;
        this.field793.method2275(new class7(this.field787), 97, var8);
        return this.field787++;
    }
}
