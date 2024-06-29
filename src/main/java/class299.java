import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class299 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Lle;")
    private class231 field4540;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "Lle;")
    private class231 field4545;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Lsl;")
    private class39 field4538;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4535;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4537;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "[B")
    private byte[] field4541;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "[B")
    private byte[] field4543;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "[B")
    private byte[] field4544;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "[I")
    private int[] field4531;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "[I")
    private int[] field4533;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[I")
    private int[] field4534;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "[I")
    private int[] field4539;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "()V", line = 6)
    public final void method1991() {
        this.field4539 = new int[this.field4542];
        this.field4533 = new int[this.field4532];
        this.field4531 = new int[this.field4532];
        this.field4534 = new int[this.field4532];
        this.field4541 = new byte[this.field4532];
        this.field4544 = new byte[this.field4532];
        this.field4543 = new byte[this.field4532];
        this.field4538 = new class39(class226.method1510(27147, this.field4532));
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([I)V", line = 21)
    public final void method1992(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field4539[this.field4546++] = arg0[0];
            this.field4539[this.field4546++] = arg0[var2];
            this.field4539[this.field4546++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "()V", line = 38)
    public final void method1993() {
        class202 var1 = new class202(this.field4546 * 4);
        class202 var2 = new class202(this.field4536 * 16);
        if (class249.field3916) {
            for (int var3 = 0; var3 < this.field4536; var3++) {
                var2.method1311(this.field4541[var3], 10964);
                var2.method1311(this.field4544[var3], 10964);
                var2.method1311(this.field4543[var3], 10964);
                var2.method1311(255, 10964);
                var2.method1328(27700, (float) this.field4533[var3]);
                var2.method1328(27700, (float) this.field4531[var3]);
                var2.method1328(27700, (float) this.field4534[var3]);
            }
            for (int var4 = 0; var4 < this.field4546; var4++) {
                var1.method1359(16705, this.field4539[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field4536; var5++) {
                var2.method1311(this.field4541[var5], 10964);
                var2.method1311(this.field4544[var5], 10964);
                var2.method1311(this.field4543[var5], 10964);
                var2.method1311(255, 10964);
                var2.method1301((float) this.field4533[var5], false);
                var2.method1301((float) this.field4531[var5], false);
                var2.method1301((float) this.field4534[var5], false);
            }
            for (int var6 = 0; var6 < this.field4546; var6++) {
                var1.method1348(this.field4539[var6], true);
            }
        }
        if (class249.field3877) {
            this.field4545 = new class231();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field3273);
            this.field4545.method1532(var7);
            this.field4540 = new class231();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field3273);
            this.field4540.method1530(var8);
        } else {
            this.field4537 = ByteBuffer.allocateDirect(var2.field3249);
            this.field4537.put(var2.field3273);
            this.field4537.flip();
            this.field4535 = ByteBuffer.allocateDirect(var1.field3249);
            this.field4535.put(var1.field3273);
            this.field4535.flip();
        }
        this.field4533 = null;
        this.field4531 = null;
        this.field4534 = null;
        this.field4541 = null;
        this.field4544 = null;
        this.field4543 = null;
        this.field4539 = null;
        this.field4538 = null;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "()V", line = 125)
    public final void method1994() {
        GL var1 = class249.field3898;
        if (class249.field3877) {
            this.field4545.method1529();
            var1.glInterleavedArrays(10787, 16, 0L);
            class249.field3876 = false;
            this.field4540.method1531();
            var1.glDrawElements(4, this.field4546, 5125, 0L);
            return;
        }
        if (class249.field3877) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field4537);
        class249.field3876 = false;
        var1.glDrawElements(4, this.field4546, 5125, this.field4535);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lqk;IIIFFF)I", line = 152)
    public final int method1995(class1 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class166 var10 = (class166) this.field4538.method303(var8, (byte) 115);
            if (var10 != null) {
                return var10.field2682;
            }
        }
        int var11 = arg0.field6;
        float var12 = (float) (arg0.field5 - arg1);
        float var13 = (float) (arg0.field29 - arg2);
        float var14 = (float) (arg0.field11 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field9 << 7) + 64);
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
        this.field4541[this.field4536] = (byte) var24;
        this.field4544[this.field4536] = (byte) var25;
        this.field4543[this.field4536] = (byte) var26;
        this.field4533[this.field4536] = arg1;
        this.field4531[this.field4536] = arg2;
        this.field4534[this.field4536] = arg3;
        this.field4538.method310(var8, new class166(this.field4536), 25357);
        return this.field4536++;
    }
}
