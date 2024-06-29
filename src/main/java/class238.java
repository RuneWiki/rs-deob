import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class238 {

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public int field3807;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "Lsc;")
    private class259 field3810;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Lvi;")
    private class6 field3796;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Lvi;")
    private class6 field3800;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3801;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3806;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[B")
    private byte[] field3798;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "[B")
    private byte[] field3804;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[B")
    private byte[] field3808;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    private int[] field3797;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "[I")
    private int[] field3799;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
    private int[] field3802;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "[I")
    private int[] field3803;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lgi;IIIFFF)I", line = 6)
    public final int method1588(class215 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class188 var10 = (class188) this.field3810.method1827(var8, 0);
            if (var10 != null) {
                return var10.field2961;
            }
        }
        int var11 = arg0.field3374;
        float var12 = (float) (arg0.field3362 - arg1);
        float var13 = (float) (arg0.field3354 - arg2);
        float var14 = (float) (arg0.field3369 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3355 << 7) + 64);
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
        this.field3808[this.field3807] = (byte) var24;
        this.field3798[this.field3807] = (byte) var25;
        this.field3804[this.field3807] = (byte) var26;
        this.field3799[this.field3807] = arg1;
        this.field3803[this.field3807] = arg2;
        this.field3802[this.field3807] = arg3;
        this.field3810.method1826(1, new class188(this.field3807), var8);
        return this.field3807++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V", line = 75)
    public final void method1589() {
        class82 var1 = new class82(this.field3809 * 4);
        class82 var2 = new class82(this.field3807 * 16);
        if (class255.field4167) {
            for (int var3 = 0; var3 < this.field3807; var3++) {
                var2.method591((byte) -53, this.field3808[var3]);
                var2.method591((byte) -7, this.field3798[var3]);
                var2.method591((byte) -126, this.field3804[var3]);
                var2.method591((byte) -13, 255);
                var2.method640(881, (float) this.field3799[var3]);
                var2.method640(881, (float) this.field3803[var3]);
                var2.method640(881, (float) this.field3802[var3]);
            }
            for (int var4 = 0; var4 < this.field3809; var4++) {
                var1.method577(-122, this.field3797[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field3807; var5++) {
                var2.method591((byte) -105, this.field3808[var5]);
                var2.method591((byte) -103, this.field3798[var5]);
                var2.method591((byte) -28, this.field3804[var5]);
                var2.method591((byte) -111, 255);
                var2.method601((float) this.field3799[var5], (byte) 102);
                var2.method601((float) this.field3803[var5], (byte) 89);
                var2.method601((float) this.field3802[var5], (byte) 122);
            }
            for (int var6 = 0; var6 < this.field3809; var6++) {
                var1.method596(this.field3797[var6], 55);
            }
        }
        if (class255.field4190) {
            this.field3796 = new class6();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field1280);
            this.field3796.method42(var7);
            this.field3800 = new class6();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field1280);
            this.field3800.method40(var8);
        } else {
            this.field3801 = ByteBuffer.allocateDirect(var2.field1301);
            this.field3801.put(var2.field1280);
            this.field3801.flip();
            this.field3806 = ByteBuffer.allocateDirect(var1.field1301);
            this.field3806.put(var1.field1280);
            this.field3806.flip();
        }
        this.field3799 = null;
        this.field3803 = null;
        this.field3802 = null;
        this.field3808 = null;
        this.field3798 = null;
        this.field3804 = null;
        this.field3797 = null;
        this.field3810 = null;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()V", line = 160)
    public final void method1590() {
        this.field3797 = new int[this.field3805];
        this.field3799 = new int[this.field3811];
        this.field3803 = new int[this.field3811];
        this.field3802 = new int[this.field3811];
        this.field3808 = new byte[this.field3811];
        this.field3798 = new byte[this.field3811];
        this.field3804 = new byte[this.field3811];
        this.field3810 = new class259(class313.method2175((byte) 70, this.field3811));
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "()V", line = 171)
    public final void method1591() {
        GL var1 = class255.field4181;
        if (class255.field4190) {
            this.field3796.method39();
            var1.glInterleavedArrays(10787, 16, 0L);
            class255.field4175 = false;
            this.field3800.method41();
            var1.glDrawElements(4, this.field3809, 5125, 0L);
            return;
        }
        if (class255.field4190) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field3801);
        class255.field4175 = false;
        var1.glDrawElements(4, this.field3809, 5125, this.field3806);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([I)V", line = 205)
    public final void method1592(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field3797[this.field3809++] = arg0[0];
            this.field3797[this.field3809++] = arg0[var2];
            this.field3797[this.field3809++] = arg0[var2 + 1];
        }
    }
}
