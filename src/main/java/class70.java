import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class70 {

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field1000;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public int field1003;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "Lde;")
    private class236 field1006;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lde;")
    private class236 field994;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Lii;")
    private class250 field1007;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field996;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field997;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "[B")
    private byte[] field1001;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[B")
    private byte[] field1005;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "[B")
    private byte[] field999;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "[I")
    private int[] field1002;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "[I")
    private int[] field1008;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "[I")
    private int[] field995;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[I")
    private int[] field998;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()V", line = 10)
    public final void method496() {
        GL var1 = class73.field1051;
        if (class73.field1066) {
            this.field994.method1644();
            var1.glInterleavedArrays(10787, 16, 0L);
            class73.field1059 = false;
            this.field1006.method1646();
            var1.glDrawElements(4, this.field1003, 5125, 0L);
            return;
        }
        if (class73.field1066) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field996);
        class73.field1059 = false;
        var1.glDrawElements(4, this.field1003, 5125, this.field997);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()V", line = 34)
    public final void method497() {
        this.field1002 = new int[this.field1004];
        this.field998 = new int[this.field1000];
        this.field1008 = new int[this.field1000];
        this.field995 = new int[this.field1000];
        this.field1005 = new byte[this.field1000];
        this.field999 = new byte[this.field1000];
        this.field1001 = new byte[this.field1000];
        this.field1007 = new class250(class312.method2135(984942384, this.field1000));
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([I)V", line = 50)
    public final void method498(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field1002[this.field1003++] = arg0[0];
            this.field1002[this.field1003++] = arg0[var2];
            this.field1002[this.field1003++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "()V", line = 64)
    public final void method499() {
        class254 var1 = new class254(this.field1003 * 4);
        class254 var2 = new class254(this.field993 * 16);
        if (class73.field1075) {
            for (int var3 = 0; var3 < this.field993; var3++) {
                var2.method1752(this.field1005[var3], -86);
                var2.method1752(this.field999[var3], -93);
                var2.method1752(this.field1001[var3], -91);
                var2.method1752(255, -97);
                var2.method1779((byte) 14, (float) this.field998[var3]);
                var2.method1779((byte) -34, (float) this.field1008[var3]);
                var2.method1779((byte) -109, (float) this.field995[var3]);
            }
            for (int var4 = 0; var4 < this.field1003; var4++) {
                var1.method1773(this.field1002[var4], false);
            }
        } else {
            for (int var5 = 0; var5 < this.field993; var5++) {
                var2.method1752(this.field1005[var5], -88);
                var2.method1752(this.field999[var5], -86);
                var2.method1752(this.field1001[var5], -112);
                var2.method1752(255, -120);
                var2.method1757(126, (float) this.field998[var5]);
                var2.method1757(-29, (float) this.field1008[var5]);
                var2.method1757(-100, (float) this.field995[var5]);
            }
            for (int var6 = 0; var6 < this.field1003; var6++) {
                var1.method1772(this.field1002[var6], (byte) 118);
            }
        }
        if (class73.field1066) {
            this.field994 = new class236();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field3840);
            this.field994.method1643(var7);
            this.field1006 = new class236();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field3840);
            this.field1006.method1647(var8);
        } else {
            this.field996 = ByteBuffer.allocateDirect(var2.field3866);
            this.field996.put(var2.field3840);
            this.field996.flip();
            this.field997 = ByteBuffer.allocateDirect(var1.field3866);
            this.field997.put(var1.field3840);
            this.field997.flip();
        }
        this.field998 = null;
        this.field1008 = null;
        this.field995 = null;
        this.field1005 = null;
        this.field999 = null;
        this.field1001 = null;
        this.field1002 = null;
        this.field1007 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lk;IIIFFF)I", line = 151)
    public final int method500(class255 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class293 var10 = (class293) this.field1007.method1716(-1, var8);
            if (var10 != null) {
                return var10.field4519;
            }
        }
        int var11 = arg0.field3887;
        float var12 = (float) (arg0.field3882 - arg1);
        float var13 = (float) (arg0.field3895 - arg2);
        float var14 = (float) (arg0.field3902 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field3908 << 7) + 64);
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
        this.field1005[this.field993] = (byte) var24;
        this.field999[this.field993] = (byte) var25;
        this.field1001[this.field993] = (byte) var26;
        this.field998[this.field993] = arg1;
        this.field1008[this.field993] = arg2;
        this.field995[this.field993] = arg3;
        this.field1007.method1708(var8, (byte) -79, new class293(this.field993));
        return this.field993++;
    }
}
