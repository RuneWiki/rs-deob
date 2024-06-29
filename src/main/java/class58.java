import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class58 {

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Lcb;")
    private class34 field847;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "Lcb;")
    private class34 field856;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "Led;")
    private class49 field859;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field851;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field860;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "[B")
    private byte[] field846;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "[B")
    private byte[] field848;

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "[B")
    private byte[] field855;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "[I")
    private int[] field849;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "[I")
    private int[] field857;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "[I")
    private int[] field858;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "[I")
    private int[] field861;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V", line = 14)
    public final void method378() {
        class92 var1 = new class92(this.field854 * 4);
        class92 var2 = new class92(this.field853 * 16);
        if (class154.field2468) {
            for (int var3 = 0; var3 < this.field853; var3++) {
                var2.method717(1, this.field855[var3]);
                var2.method717(1, this.field848[var3]);
                var2.method717(1, this.field846[var3]);
                var2.method717(1, 255);
                var2.method701(12327, (float) this.field858[var3]);
                var2.method701(12327, (float) this.field857[var3]);
                var2.method701(12327, (float) this.field849[var3]);
            }
            for (int var4 = 0; var4 < this.field854; var4++) {
                var1.method712(this.field861[var4], -47);
            }
        } else {
            for (int var5 = 0; var5 < this.field853; var5++) {
                var2.method717(1, this.field855[var5]);
                var2.method717(1, this.field848[var5]);
                var2.method717(1, this.field846[var5]);
                var2.method717(1, 255);
                var2.method735((float) this.field858[var5], -3);
                var2.method735((float) this.field857[var5], -3);
                var2.method735((float) this.field849[var5], -3);
            }
            for (int var6 = 0; var6 < this.field854; var6++) {
                var1.method715(true, this.field861[var6]);
            }
        }
        if (class154.field2461) {
            this.field856 = new class34();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field1495);
            this.field856.method220(var7);
            this.field847 = new class34();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field1495);
            this.field847.method222(var8);
        } else {
            this.field860 = ByteBuffer.allocateDirect(var2.field1476);
            this.field860.put(var2.field1495);
            this.field860.flip();
            this.field851 = ByteBuffer.allocateDirect(var1.field1476);
            this.field851.put(var1.field1495);
            this.field851.flip();
        }
        this.field858 = null;
        this.field857 = null;
        this.field849 = null;
        this.field855 = null;
        this.field848 = null;
        this.field846 = null;
        this.field861 = null;
        this.field859 = null;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()V", line = 99)
    public final void method379() {
        this.field861 = new int[this.field852];
        this.field858 = new int[this.field850];
        this.field857 = new int[this.field850];
        this.field849 = new int[this.field850];
        this.field855 = new byte[this.field850];
        this.field848 = new byte[this.field850];
        this.field846 = new byte[this.field850];
        this.field859 = new class49(class229.method1622(true, this.field850));
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "([I)V", line = 112)
    public final void method380(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field861[this.field854++] = arg0[0];
            this.field861[this.field854++] = arg0[var2];
            this.field861[this.field854++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lqe;IIIFFF)I", line = 126)
    public final int method381(class292 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class173 var10 = (class173) this.field859.method311((byte) 114, var8);
            if (var10 != null) {
                return var10.field2796;
            }
        }
        int var11 = arg0.field4966;
        float var12 = (float) (arg0.field4962 - arg1);
        float var13 = (float) (arg0.field4973 - arg2);
        float var14 = (float) (arg0.field4959 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4961 << 7) + 64);
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
        this.field855[this.field853] = (byte) var24;
        this.field848[this.field853] = (byte) var25;
        this.field846[this.field853] = (byte) var26;
        this.field858[this.field853] = arg1;
        this.field857[this.field853] = arg2;
        this.field849[this.field853] = arg3;
        this.field859.method309(new class173(this.field853), var8, 1);
        return this.field853++;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()V", line = 201)
    public final void method382() {
        GL var1 = class154.field2479;
        if (class154.field2461) {
            this.field856.method221();
            var1.glInterleavedArrays(10787, 16, 0L);
            class154.field2478 = false;
            this.field847.method224();
            var1.glDrawElements(4, this.field854, 5125, 0L);
            return;
        }
        if (class154.field2461) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field860);
        class154.field2478 = false;
        var1.glDrawElements(4, this.field854, 5125, this.field851);
    }
}
