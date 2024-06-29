import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class61 {

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Lld;")
    private class118 field1047;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lsg;")
    private class34 field1048;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Lsg;")
    private class34 field1052;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1039;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1042;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "[B")
    private byte[] field1041;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "[B")
    private byte[] field1046;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "[B")
    private byte[] field1049;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "[I")
    private int[] field1040;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "[I")
    private int[] field1043;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "[I")
    private int[] field1044;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "[I")
    private int[] field1050;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([I)V", line = 9)
    public final void method468(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field1050[this.field1038++] = arg0[0];
            this.field1050[this.field1038++] = arg0[var2];
            this.field1050[this.field1038++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()V", line = 31)
    public final void method469() {
        GL var1 = class271.field4641;
        if (class271.field4634) {
            this.field1048.method246();
            var1.glInterleavedArrays(10787, 16, 0L);
            class271.field4661 = false;
            this.field1052.method248();
            var1.glDrawElements(4, this.field1038, 5125, 0L);
            return;
        }
        if (class271.field4634) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field1042);
        class271.field4661 = false;
        var1.glDrawElements(4, this.field1038, 5125, this.field1039);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()V", line = 56)
    public final void method470() {
        class47 var1 = new class47(this.field1038 * 4);
        class47 var2 = new class47(this.field1045 * 16);
        if (class271.field4657) {
            for (int var3 = 0; var3 < this.field1045; var3++) {
                var2.method332(this.field1046[var3], 122);
                var2.method332(this.field1041[var3], 118);
                var2.method332(this.field1049[var3], 125);
                var2.method332(255, 78);
                var2.method384((byte) 108, (float) this.field1044[var3]);
                var2.method384((byte) 108, (float) this.field1040[var3]);
                var2.method384((byte) 108, (float) this.field1043[var3]);
            }
            for (int var4 = 0; var4 < this.field1038; var4++) {
                var1.method387(this.field1050[var4], 86);
            }
        } else {
            for (int var5 = 0; var5 < this.field1045; var5++) {
                var2.method332(this.field1046[var5], 91);
                var2.method332(this.field1041[var5], 71);
                var2.method332(this.field1049[var5], 72);
                var2.method332(255, 104);
                var2.method340((float) this.field1044[var5], -1489617032);
                var2.method340((float) this.field1040[var5], -1489617032);
                var2.method340((float) this.field1043[var5], -1489617032);
            }
            for (int var6 = 0; var6 < this.field1038; var6++) {
                var1.method382((byte) 1, this.field1050[var6]);
            }
        }
        if (class271.field4634) {
            this.field1048 = new class34();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field860);
            this.field1048.method244(var7);
            this.field1052 = new class34();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field860);
            this.field1052.method245(var8);
        } else {
            this.field1042 = ByteBuffer.allocateDirect(var2.field857);
            this.field1042.put(var2.field860);
            this.field1042.flip();
            this.field1039 = ByteBuffer.allocateDirect(var1.field857);
            this.field1039.put(var1.field860);
            this.field1039.flip();
        }
        this.field1044 = null;
        this.field1040 = null;
        this.field1043 = null;
        this.field1046 = null;
        this.field1041 = null;
        this.field1049 = null;
        this.field1050 = null;
        this.field1047 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ls;IIIFFF)I", line = 142)
    public final int method471(class266 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class101 var10 = (class101) this.field1047.method810((byte) -89, var8);
            if (var10 != null) {
                return var10.field1627;
            }
        }
        int var11 = arg0.field4588;
        float var12 = (float) (arg0.field4583 - arg1);
        float var13 = (float) (arg0.field4589 - arg2);
        float var14 = (float) (arg0.field4578 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4565 << 7) + 64);
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
        this.field1046[this.field1045] = (byte) var24;
        this.field1041[this.field1045] = (byte) var25;
        this.field1049[this.field1045] = (byte) var26;
        this.field1044[this.field1045] = arg1;
        this.field1040[this.field1045] = arg2;
        this.field1043[this.field1045] = arg3;
        this.field1047.method805(new class101(this.field1045), var8, 113);
        return this.field1045++;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "()V", line = 212)
    public final void method472() {
        this.field1050 = new int[this.field1051];
        this.field1044 = new int[this.field1037];
        this.field1040 = new int[this.field1037];
        this.field1043 = new int[this.field1037];
        this.field1046 = new byte[this.field1037];
        this.field1041 = new byte[this.field1037];
        this.field1049 = new byte[this.field1037];
        this.field1047 = new class118(class272.method1993(this.field1037, 120));
    }
}
