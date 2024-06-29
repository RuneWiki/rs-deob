import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class111 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public int field1566;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Llb;")
    private class224 field1580;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lhl;")
    private class71 field1572;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lhl;")
    private class71 field1579;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1574;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1575;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[B")
    private byte[] field1565;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "[B")
    private byte[] field1568;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[B")
    private byte[] field1578;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    private int[] field1570;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[I")
    private int[] field1571;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
    private int[] field1576;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[I")
    private int[] field1577;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V", line = 7)
    public final void method759() {
        class107 var1 = new class107(this.field1573 * 4);
        class107 var2 = new class107(this.field1569 * 16);
        if (class250.field3825) {
            for (int var3 = 0; var3 < this.field1569; var3++) {
                var2.method648(this.field1568[var3], (byte) 38);
                var2.method648(this.field1578[var3], (byte) 38);
                var2.method648(this.field1565[var3], (byte) 38);
                var2.method648(255, (byte) 38);
                var2.method673(32166, (float) this.field1570[var3]);
                var2.method673(32166, (float) this.field1577[var3]);
                var2.method673(32166, (float) this.field1576[var3]);
            }
            for (int var4 = 0; var4 < this.field1573; var4++) {
                var1.method641(1773202520, this.field1571[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field1569; var5++) {
                var2.method648(this.field1568[var5], (byte) 38);
                var2.method648(this.field1578[var5], (byte) 38);
                var2.method648(this.field1565[var5], (byte) 38);
                var2.method648(255, (byte) 38);
                var2.method682(63, (float) this.field1570[var5]);
                var2.method682(-113, (float) this.field1577[var5]);
                var2.method682(-119, (float) this.field1576[var5]);
            }
            for (int var6 = 0; var6 < this.field1573; var6++) {
                var1.method635(-16082, this.field1571[var6]);
            }
        }
        if (class250.field3809) {
            this.field1572 = new class71();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field1388);
            this.field1572.method432(var7);
            this.field1579 = new class71();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field1388);
            this.field1579.method433(var8);
        } else {
            this.field1575 = ByteBuffer.allocateDirect(var2.field1400);
            this.field1575.put(var2.field1388);
            this.field1575.flip();
            this.field1574 = ByteBuffer.allocateDirect(var1.field1400);
            this.field1574.put(var1.field1388);
            this.field1574.flip();
        }
        this.field1570 = null;
        this.field1577 = null;
        this.field1576 = null;
        this.field1568 = null;
        this.field1578 = null;
        this.field1565 = null;
        this.field1571 = null;
        this.field1580 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([I)V", line = 94)
    public final void method760(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field1571[this.field1573++] = arg0[0];
            this.field1571[this.field1573++] = arg0[var2];
            this.field1571[this.field1573++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()V", line = 109)
    public final void method761() {
        GL var1 = class250.field3818;
        if (class250.field3809) {
            this.field1572.method436();
            var1.glInterleavedArrays(10787, 16, 0L);
            class250.field3815 = false;
            this.field1579.method435();
            var1.glDrawElements(4, this.field1573, 5125, 0L);
            return;
        }
        if (class250.field3809) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field1575);
        class250.field3815 = false;
        var1.glDrawElements(4, this.field1573, 5125, this.field1574);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lsj;IIIFFF)I", line = 141)
    public final int method762(class62 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class172 var10 = (class172) this.field1580.method1537(var8, -22708);
            if (var10 != null) {
                return var10.field2483;
            }
        }
        int var11 = arg0.field771;
        float var12 = (float) (arg0.field759 - arg1);
        float var13 = (float) (arg0.field758 - arg2);
        float var14 = (float) (arg0.field764 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field777 << 7) + 64);
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
        this.field1568[this.field1569] = (byte) var24;
        this.field1578[this.field1569] = (byte) var25;
        this.field1565[this.field1569] = (byte) var26;
        this.field1570[this.field1569] = arg1;
        this.field1577[this.field1569] = arg2;
        this.field1576[this.field1569] = arg3;
        this.field1580.method1541(false, new class172(this.field1569), var8);
        return this.field1569++;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()V", line = 209)
    public final void method763() {
        this.field1571 = new int[this.field1566];
        this.field1570 = new int[this.field1567];
        this.field1577 = new int[this.field1567];
        this.field1576 = new int[this.field1567];
        this.field1568 = new byte[this.field1567];
        this.field1578 = new byte[this.field1567];
        this.field1565 = new byte[this.field1567];
        this.field1580 = new class224(class258.method1873(this.field1567, 832520144));
    }
}
