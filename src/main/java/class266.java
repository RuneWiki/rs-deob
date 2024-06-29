import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class266 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public int field4446;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public int field4450;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public int field4452;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public int field4454;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Lvl;")
    private class164 field4458;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lbk;")
    private class53 field4445;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lbk;")
    private class53 field4457;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4448;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4455;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[B")
    private byte[] field4447;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "[B")
    private byte[] field4449;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[B")
    private byte[] field4460;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "[I")
    private int[] field4451;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "[I")
    private int[] field4453;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "[I")
    private int[] field4456;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
    private int[] field4459;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V", line = 12)
    public final void method2020() {
        GL var1 = class42.field627;
        if (class42.field645) {
            this.field4445.method422();
            var1.glInterleavedArrays(10787, 16, 0L);
            class42.field620 = false;
            this.field4457.method423();
            var1.glDrawElements(4, this.field4450, 5125, 0L);
            return;
        }
        if (class42.field645) {
            var1.glBindBufferARB(34962, 0);
            var1.glBindBufferARB(34963, 0);
        }
        var1.glInterleavedArrays(10787, 16, this.field4448);
        class42.field620 = false;
        var1.glDrawElements(4, this.field4450, 5125, this.field4455);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "()V", line = 37)
    public final void method2021() {
        class227 var1 = new class227(this.field4450 * 4);
        class227 var2 = new class227(this.field4446 * 16);
        if (class42.field625) {
            for (int var3 = 0; var3 < this.field4446; var3++) {
                var2.method1712(this.field4460[var3], -85);
                var2.method1712(this.field4447[var3], -126);
                var2.method1712(this.field4449[var3], -118);
                var2.method1712(255, -88);
                var2.method1713(false, (float) this.field4451[var3]);
                var2.method1713(false, (float) this.field4459[var3]);
                var2.method1713(false, (float) this.field4453[var3]);
            }
            for (int var4 = 0; var4 < this.field4450; var4++) {
                var1.method1757(this.field4456[var4], -102);
            }
        } else {
            for (int var5 = 0; var5 < this.field4446; var5++) {
                var2.method1712(this.field4460[var5], -84);
                var2.method1712(this.field4447[var5], -63);
                var2.method1712(this.field4449[var5], -58);
                var2.method1712(255, -56);
                var2.method1738((float) this.field4451[var5], (byte) -39);
                var2.method1738((float) this.field4459[var5], (byte) -39);
                var2.method1738((float) this.field4453[var5], (byte) -39);
            }
            for (int var6 = 0; var6 < this.field4450; var6++) {
                var1.method1754(false, this.field4456[var6]);
            }
        }
        if (class42.field645) {
            this.field4445 = new class53();
            ByteBuffer var7 = ByteBuffer.wrap(var2.field3793);
            this.field4445.method421(var7);
            this.field4457 = new class53();
            ByteBuffer var8 = ByteBuffer.wrap(var1.field3793);
            this.field4457.method419(var8);
        } else {
            this.field4448 = ByteBuffer.allocateDirect(var2.field3760);
            this.field4448.put(var2.field3793);
            this.field4448.flip();
            this.field4455 = ByteBuffer.allocateDirect(var1.field3760);
            this.field4455.put(var1.field3793);
            this.field4455.flip();
        }
        this.field4451 = null;
        this.field4459 = null;
        this.field4453 = null;
        this.field4460 = null;
        this.field4447 = null;
        this.field4449 = null;
        this.field4456 = null;
        this.field4458 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([I)V", line = 129)
    public final void method2022(int[] arg0) {
        for (int var2 = 1; var2 < arg0.length - 1; var2++) {
            this.field4456[this.field4450++] = arg0[0];
            this.field4456[this.field4450++] = arg0[var2];
            this.field4456[this.field4450++] = arg0[var2 + 1];
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()V", line = 140)
    public final void method2023() {
        this.field4456 = new int[this.field4454];
        this.field4451 = new int[this.field4452];
        this.field4459 = new int[this.field4452];
        this.field4453 = new int[this.field4452];
        this.field4460 = new byte[this.field4452];
        this.field4447 = new byte[this.field4452];
        this.field4449 = new byte[this.field4452];
        this.field4458 = new class164(class206.method1575(this.field4452, (byte) 99));
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lfn;IIIFFF)I", line = 152)
    public final int method2024(class314 arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        long var8 = 0L;
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) ((arg3 << 16) + arg1);
            class301 var10 = (class301) this.field4458.method1268(-117, var8);
            if (var10 != null) {
                return var10.field4846;
            }
        }
        int var11 = arg0.field4997;
        float var12 = (float) (arg0.field5008 - arg1);
        float var13 = (float) (arg0.field5002 - arg2);
        float var14 = (float) (arg0.field4999 - arg3);
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = 1.0F / var15;
        float var17 = var12 * var16;
        float var18 = var13 * var16;
        float var19 = var14 * var16;
        float var20 = var15 / (float) ((arg0.field4993 << 7) + 64);
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
        this.field4460[this.field4446] = (byte) var24;
        this.field4447[this.field4446] = (byte) var25;
        this.field4449[this.field4446] = (byte) var26;
        this.field4451[this.field4446] = arg1;
        this.field4459[this.field4446] = arg2;
        this.field4453[this.field4446] = arg3;
        this.field4458.method1273(1, var8, new class301(this.field4446));
        return this.field4446++;
    }
}
