import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class35 {

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lbm;")
    private class140 field579;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lbm;")
    private class140 field581;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lfe;")
    private class97 field575;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field576;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field578;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "[B")
    private byte[] field573;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[B")
    private byte[] field580;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "[B")
    private byte[] field585;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[I")
    private int[] field574;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "[I")
    private int[] field577;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "[I")
    private int[] field582;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "[I")
    private int[] field583;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V", line = 11)
    public final void method284() {
        GL var1 = class99.field1682;
        if (class99.field1689) {
            this.field581.method1008();
            var1.glInterleavedArrays(10787, 16, 0L);
            class99.field1669 = false;
            this.field579.method1010();
            var1.glDrawElements(4, this.field588, 5125, 0L);
            return;
        }
        if (class99.field1689) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field576);
        class99.field1669 = false;
        var1.glDrawElements(4, this.field588, 5125, this.field578);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()V", line = 38)
    public final void method285() {
        this.field582 = new int[this.field587];
        this.field577 = new int[this.field584];
        this.field574 = new int[this.field584];
        this.field583 = new int[this.field584];
        this.field573 = new byte[this.field584];
        this.field585 = new byte[this.field584];
        this.field580 = new byte[this.field584];
        this.field575 = new class97(class303.method2049(this.field584, 2539));
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lla;IIIFFF)I", line = 49)
    public final int method286(class195 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class295 var10 = (class295) this.field575.method713(3365, var8);
            if (var10 != null) {
                return var10.field4829;
            }
        }
        int var11 = arg0.field3246;
        float var12 = (float) (arg0.field3244 - arg1);
        float var13 = (float) (arg0.field3261 - arg2);
        float var14 = (float) (arg0.field3263 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3264 << 7) + 64);
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
        this.field573[this.field586] = (byte) var24;
        this.field585[this.field586] = (byte) var25;
        this.field580[this.field586] = (byte) var26;
        this.field577[this.field586] = arg1;
        this.field574[this.field586] = arg2;
        this.field583[this.field586] = arg3;
        this.field575.method710(new class295(this.field586), (byte) -127, var8);
        return this.field586++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([I)V", line = 120)
    public final void method287(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field582[this.field588++] = arg0[0];
            this.field582[this.field588++] = arg0[var2];
            this.field582[this.field588++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()V", line = 133)
    public final void method288() {
        class164 var1 = new class164(this.field588 * 4);
        class164 var2 = new class164(this.field586 * 16);
        if (class99.field1678) {
            for (int var3 = 0; var3 < this.field586; var3++) {
                var2.method1188(-89, this.field573[var3]);
                var2.method1188(-74, this.field585[var3]);
                var2.method1188(-126, this.field580[var3]);
                var2.method1188(-92, 255);
                var2.method1195(99, (float) this.field577[var3]);
                var2.method1195(94, (float) this.field574[var3]);
                var2.method1195(112, (float) this.field583[var3]);
            }
            for (int var4 = 0; var4 < this.field588; var4++) {
                var1.method1168(this.field582[var4], (byte) -114);
            }
        } else {
            for (int var5 = 0; var5 < this.field586; var5++) {
                var2.method1188(-102, this.field573[var5]);
                var2.method1188(-120, this.field585[var5]);
                var2.method1188(-72, this.field580[var5]);
                var2.method1188(-82, 255);
                var2.method1158((float) this.field577[var5], (byte) 16);
                var2.method1158((float) this.field574[var5], (byte) -109);
                var2.method1158((float) this.field583[var5], (byte) 104);
            }
            for (int var6 = 0; var6 < this.field588; var6++) {
                var1.method1152(this.field582[var6], (byte) 98);
            }
        }
        if (class99.field1689) {
            this.field581 = new class140();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field2668);
            this.field581.method1011(var7);
            this.field579 = new class140();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field2668);
            this.field579.method1007(var8);
        } else {
            this.field576 = ByteBuffer.allocateDirect(var2.field2670);
            this.field576.put(var2.field2668);
            this.field576.flip();
            this.field578 = ByteBuffer.allocateDirect(var1.field2670);
            this.field578.put(var1.field2668);
            this.field578.flip();
        }
        this.field577 = null;
        this.field574 = null;
        this.field583 = null;
        this.field573 = null;
        this.field585 = null;
        this.field580 = null;
        this.field582 = null;
        this.field575 = null;
    }
}
