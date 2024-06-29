import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class31 {

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Lpc;")
    private class216 field380;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "Lpc;")
    private class216 field387;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Ljf;")
    private class227 field392;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field383;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field391;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "[B")
    private byte[] field381;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "[B")
    private byte[] field384;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "[B")
    private byte[] field390;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "[I")
    private int[] field378;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "[I")
    private int[] field382;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "[I")
    private int[] field388;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "[I")
    private int[] field393;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lwi;IIIFFF)I", line = 6)
    public final int method230(class310 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class27 var10 = (class27) this.field392.method1558(var8, false);
            if (var10 != null) {
                return var10.field344;
            }
        }
        int var11 = arg0.field4918;
        float var12 = (float) (arg0.field4925 - arg1);
        float var13 = (float) (arg0.field4906 - arg2);
        float var14 = (float) (arg0.field4913 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4893 << 7) + 64);
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
        this.field384[this.field389] = (byte) var24;
        this.field390[this.field389] = (byte) var25;
        this.field381[this.field389] = (byte) var26;
        this.field378[this.field389] = arg1;
        this.field388[this.field389] = arg2;
        this.field382[this.field389] = arg3;
        this.field392.method1550(new class27(this.field389), var8, (byte) 63);
        return this.field389++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "()V", line = 82)
    public final void method231() {
        this.field393 = new int[this.field379];
        this.field378 = new int[this.field386];
        this.field388 = new int[this.field386];
        this.field382 = new int[this.field386];
        this.field384 = new byte[this.field386];
        this.field390 = new byte[this.field386];
        this.field381 = new byte[this.field386];
        this.field392 = new class227(class47.method330((byte) 89, this.field386));
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "()V", line = 93)
    public final void method232() {
        GL var1 = class333.field5160;
        if (class333.field5188) {
            this.field387.method1446();
            var1.glInterleavedArrays(10787, 16, 0L);
            class333.field5186 = false;
            this.field380.method1444();
            var1.glDrawElements(4, this.field385, 5125, 0L);
            return;
        }
        if (class333.field5188) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field383);
        class333.field5186 = false;
        var1.glDrawElements(4, this.field385, 5125, this.field391);
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "()V", line = 118)
    public final void method233() {
        class303 var1 = new class303(this.field385 * 4);
        class303 var2 = new class303(this.field389 * 16);
        if (class333.field5170) {
            for (int var3 = 0; var3 < this.field389; var3++) {
                var2.method2034(-111, this.field384[var3]);
                var2.method2034(-80, this.field390[var3]);
                var2.method2034(-20, this.field381[var3]);
                var2.method2034(-41, 255);
                var2.method2046((float) this.field378[var3], 0);
                var2.method2046((float) this.field388[var3], 0);
                var2.method2046((float) this.field382[var3], 0);
            }
            for (int var4 = 0; var4 < this.field385; var4++) {
                var1.method2013(this.field393[var4], -78);
            }
        } else {
            for (int var5 = 0; var5 < this.field389; var5++) {
                var2.method2034(-39, this.field384[var5]);
                var2.method2034(-45, this.field390[var5]);
                var2.method2034(-66, this.field381[var5]);
                var2.method2034(-99, 255);
                var2.method2056(113, (float) this.field378[var5]);
                var2.method2056(122, (float) this.field388[var5]);
                var2.method2056(103, (float) this.field382[var5]);
            }
            for (int var6 = 0; var6 < this.field385; var6++) {
                var1.method1993((byte) 7, this.field393[var6]);
            }
        }
        if (class333.field5188) {
            this.field387 = new class216();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field4716);
            this.field387.method1442(var7);
            this.field380 = new class216();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field4716);
            this.field380.method1445(var8);
        } else {
            this.field383 = ByteBuffer.allocateDirect(var2.field4679);
            this.field383.put(var2.field4716);
            this.field383.flip();
            this.field391 = ByteBuffer.allocateDirect(var1.field4679);
            this.field391.put(var1.field4716);
            this.field391.flip();
        }
        this.field378 = null;
        this.field388 = null;
        this.field382 = null;
        this.field384 = null;
        this.field390 = null;
        this.field381 = null;
        this.field393 = null;
        this.field392 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([I)V", line = 210)
    public final void method234(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field393[this.field385++] = arg0[0];
            this.field393[this.field385++] = arg0[var2];
            this.field393[this.field385++] = arg0[var2 + 1];
        }
    }
}
