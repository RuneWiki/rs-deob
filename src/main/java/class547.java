import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class547 {

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lgw;")
    private class690 field7598 = new class690(64);

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public int field7605 = 0;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Luu;")
    private class237 field7599;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public int field7595;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "Lst;")
    public static class335 field7603 = new class335(37, 7);

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "Lwn;")
    public static class585 field7604 = new class585("", 10);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method3236(int arg0) {
        field7604 = null;
        field7603 = null;
        if (arg0 != 5) {
            field7604 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
    public final void method3237(int arg0, int arg1) {
        field7600++;
        class690 var3 = this.field7598;
        synchronized (this.field7598) {
            this.field7598.method3896(arg0 - 6, arg1);
        }
        if (arg0 != 7) {
            this.method3240(-15, 92);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public final void method3238(byte arg0) {
        class690 var2 = this.field7598;
        synchronized (this.field7598) {
            this.field7598.method3906(-103);
            int var3 = -26 % ((arg0 + 25) / 48);
        }
        field7597++;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public final void method3239(boolean arg0) {
        if (!arg0) {
            method3236(29);
        }
        field7601++;
        class690 var2 = this.field7598;
        synchronized (this.field7598) {
            this.field7598.method3902(0);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)Lbe;")
    public final class230 method3240(int arg0, int arg1) {
        field7602++;
        class690 var3 = this.field7598;
        class230 var4;
        synchronized (this.field7598) {
            var4 = (class230) this.field7598.method3898((byte) -42, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 > -85) {
            return null;
        } else {
            class237 var5 = this.field7599;
            byte[] var6;
            synchronized (this.field7599) {
                var6 = this.field7599.method1572(4, 0, arg0);
            }
            class230 var7 = new class230();
            var7.field3110 = arg0;
            var7.field3123 = this;
            if (var6 != null) {
                var7.method1368(0, new class63(var6));
            }
            var7.method1367(0);
            class690 var8 = this.field7598;
            synchronized (this.field7598) {
                this.field7598.method3899(-60, var7, (long) arg0);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIFIFF)[F")
    public static final float[] method3241(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, float arg6, float arg7) {
        field7596++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[0] = var10;
        float var12 = 1.0F - var10;
        var8[4] = 1.0F;
        var8[6] = -var11;
        int var13 = -30 % ((arg0 - 80) / 35);
        var8[1] = 0.0F;
        var8[5] = 0.0F;
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        var8[2] = var11;
        var8[8] = var10;
        float[] var14 = new float[9];
        float var15 = 1.0F;
        float var16 = 0.0F;
        float var17 = (float) arg1 / 32767.0F;
        float var18 = -((float) Math.sqrt((double) (1.0F - var17 * var17)));
        float var19 = 1.0F - var17;
        float var20 = (float) Math.sqrt((double) (arg2 * arg2 + arg5 * arg5));
        if (var20 == 0.0F && var17 == 0.0F) {
            var9 = var8;
        } else {
            if (var20 != 0.0F) {
                var16 = (float) arg5 / var20;
                var15 = (float) (-arg2) / var20;
            }
            var14[0] = var15 * var15 * var19 + var17;
            var14[4] = var17;
            var14[5] = var15 * var18;
            var14[7] = -var15 * var18;
            var14[8] = var16 * var16 * var19 + var17;
            var14[2] = var15 * var16 * var19;
            var14[3] = -var16 * var18;
            var14[6] = var15 * var16 * var19;
            var14[1] = var16 * var18;
            var9[0] = var8[2] * var14[6] + var8[0] * var14[0] + var8[1] * var14[3];
            var9[1] = var8[2] * var14[7] + var8[0] * var14[1] + var8[1] * var14[4];
            var9[2] = var8[2] * var14[8] + var8[1] * var14[5] + var8[0] * var14[2];
            var9[3] = var8[5] * var14[6] + var8[4] * var14[3] + var8[3] * var14[0];
            var9[4] = var8[5] * var14[7] + var8[4] * var14[4] + var8[3] * var14[1];
            var9[5] = var8[5] * var14[8] + var8[3] * var14[2] + var8[4] * var14[5];
            var9[6] = var8[8] * var14[6] + var8[6] * var14[0] + var8[7] * var14[3];
            var9[7] = var8[8] * var14[7] + var8[6] * var14[1] + var8[7] * var14[4];
            var9[8] = var8[8] * var14[8] + var8[6] * var14[2] + var8[7] * var14[5];
        }
        var9[8] *= arg4;
        var9[5] *= arg6;
        var9[3] *= arg6;
        var9[2] *= arg7;
        var9[4] *= arg6;
        var9[6] *= arg4;
        var9[1] *= arg7;
        var9[0] *= arg7;
        var9[7] *= arg4;
        return var9;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lgp;ILuu;)V")
    public class547(class553 arg0, int arg1, class237 arg2) {
        this.field7599 = arg2;
        this.field7595 = this.field7599.method1597(4, 0);
    }
}
