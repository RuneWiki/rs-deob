import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class233 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public int field3934;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lsi;")
    private class237 field3935;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "Lgb;")
    private class83 field3941;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Lgb;")
    private class83 field3943;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3932;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3942;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[B")
    private byte[] field3930;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "[B")
    private byte[] field3937;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "[B")
    private byte[] field3940;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "[I")
    private int[] field3931;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[I")
    private int[] field3936;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "[I")
    private int[] field3938;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "[I")
    private int[] field3944;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V", line = 7)
    public final void method1586() {
        GL var1 = class56.field848;
        if (class56.field855) {
            this.field3943.method588();
            var1.glInterleavedArrays(10787, 16, 0L);
            class56.field865 = false;
            this.field3941.method587();
            var1.glDrawElements(4, this.field3929, 5125, 0L);
            return;
        }
        if (class56.field855) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field3942);
        class56.field865 = false;
        var1.glDrawElements(4, this.field3929, 5125, this.field3932);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lod;IIIFFF)I", line = 33)
    public final int method1587(class209 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class27 var10 = (class27) this.field3935.method1631(false, var8);
            if (var10 != null) {
                return var10.field383;
            }
        }
        int var11 = arg0.field3564;
        float var12 = (float) (arg0.field3577 - arg1);
        float var13 = (float) (arg0.field3567 - arg2);
        float var14 = (float) (arg0.field3570 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3587 << 7) + 64);
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
        this.field3930[this.field3934] = (byte) var24;
        this.field3940[this.field3934] = (byte) var25;
        this.field3937[this.field3934] = (byte) var26;
        this.field3936[this.field3934] = arg1;
        this.field3931[this.field3934] = arg2;
        this.field3938[this.field3934] = arg3;
        this.field3935.method1636(11311, new class27(this.field3934), var8);
        return this.field3934++;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()V", line = 103)
    public final void method1588() {
        this.field3944 = new int[this.field3933];
        this.field3936 = new int[this.field3939];
        this.field3931 = new int[this.field3939];
        this.field3938 = new int[this.field3939];
        this.field3930 = new byte[this.field3939];
        this.field3940 = new byte[this.field3939];
        this.field3937 = new byte[this.field3939];
        this.field3935 = new class237(class301.method2026(this.field3939, false));
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([I)V", line = 116)
    public final void method1589(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field3944[this.field3929++] = arg0[0];
            this.field3944[this.field3929++] = arg0[var2];
            this.field3944[this.field3929++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()V", line = 130)
    public final void method1590() {
        class134 var1 = new class134(this.field3929 * 4);
        class134 var2 = new class134(this.field3934 * 16);
        if (class56.field845) {
            for (int var3 = 0; var3 < this.field3934; var3++) {
                var2.method933(-3, this.field3930[var3]);
                var2.method933(-3, this.field3940[var3]);
                var2.method933(-3, this.field3937[var3]);
                var2.method933(-3, 255);
                var2.method956((float) this.field3936[var3], false);
                var2.method956((float) this.field3931[var3], false);
                var2.method956((float) this.field3938[var3], false);
            }
            for (int var4 = 0; var4 < this.field3929; var4++) {
                var1.method947(this.field3944[var4], (byte) 121);
            }
        } else {
            for (int var5 = 0; var5 < this.field3934; var5++) {
                var2.method933(-3, this.field3930[var5]);
                var2.method933(-3, this.field3940[var5]);
                var2.method933(-3, this.field3937[var5]);
                var2.method933(-3, 255);
                var2.method940((float) this.field3936[var5], 967648728);
                var2.method940((float) this.field3931[var5], 967648728);
                var2.method940((float) this.field3938[var5], 967648728);
            }
            for (int var6 = 0; var6 < this.field3929; var6++) {
                var1.method941(-116, this.field3944[var6]);
            }
        }
        if (class56.field855) {
            this.field3943 = new class83();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field2282);
            this.field3943.method585(var7);
            this.field3941 = new class83();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field2282);
            this.field3941.method586(var8);
        } else {
            this.field3942 = ByteBuffer.allocateDirect(var2.field2299);
            this.field3942.put(var2.field2282);
            this.field3942.flip();
            this.field3932 = ByteBuffer.allocateDirect(var1.field2299);
            this.field3932.put(var1.field2282);
            this.field3932.flip();
        }
        this.field3936 = null;
        this.field3931 = null;
        this.field3938 = null;
        this.field3930 = null;
        this.field3940 = null;
        this.field3937 = null;
        this.field3944 = null;
        this.field3935 = null;
    }
}
