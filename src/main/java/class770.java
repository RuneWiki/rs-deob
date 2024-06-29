import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class770 {

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public int field10608;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Lkn;")
    public static class770 field10610 = new class770(1);

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "Lkn;")
    public static class770 field10612 = new class770(2);

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "Lkn;")
    public static class770 field10613 = new class770(4);

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "Lkn;")
    public static class770 field10614 = new class770(1);

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Lkn;")
    public static class770 field10615 = new class770(2);

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Lkn;")
    public static class770 field10616 = new class770(4);

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "Lkn;")
    public static class770 field10617 = new class770(2);

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Lkn;")
    public static class770 field10618 = new class770(4);

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "Lpa;")
    public static class387 field10619 = new class387(8);

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "[I")
    public static int[] field10621 = new int[1];

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field10622 = 0;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field10607;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field10609;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field10611;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "Lcb;")
    public static class544 field10620;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(FFIIIFZI)[F")
    public static final float[] method4235(float arg0, float arg1, int arg2, int arg3, int arg4, float arg5, boolean arg6, int arg7) {
        field10611++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg7 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg7 * 0.024543693F));
        var8[7] = 0.0F;
        var8[3] = 0.0F;
        var8[0] = var10;
        var8[8] = var10;
        var8[2] = var11;
        var8[5] = 0.0F;
        var8[1] = 0.0F;
        var8[6] = -var11;
        float var12 = 1.0F - var10;
        var8[4] = 1.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg3 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4));
        if (arg6) {
            return null;
        }
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var15 = (float) arg4 / var19;
                var14 = (float) (-arg2) / var19;
            }
            var13[3] = -var15 * var18;
            var13[7] = -var14 * var18;
            var13[5] = var14 * var18;
            var13[0] = var14 * var14 * var17 + var16;
            var13[8] = var15 * var15 * var17 + var16;
            var13[1] = var15 * var18;
            var13[2] = var14 * var15 * var17;
            var13[4] = var16;
            var13[6] = var14 * var15 * var17;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[4] * var13[5] + var8[3] * var13[2];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[0] *= arg1;
        var9[1] *= arg1;
        var9[4] *= arg5;
        var9[7] *= arg0;
        var9[6] *= arg0;
        var9[5] *= arg5;
        var9[3] *= arg5;
        var9[2] *= arg1;
        var9[8] *= arg0;
        return var9;
    }

    @OriginalMember(owner = "client!kn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10609++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
    public static final void method4236(int arg0, int arg1) {
        if (arg1 != 1) {
            field10620 = null;
        }
        field10607++;
        class542 var2 = (class542) class622.field8773.method380((byte) -3, (long) arg0);
        if (var2 != null) {
            var2.field7597.method4260(125);
            class737.method4131(var2.field7598, var2.field7594, false);
            var2.method3117((byte) -122);
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(I)V")
    private class770(int arg0) {
        this.field10608 = arg0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static void method4237(int arg0) {
        field10610 = null;
        field10615 = null;
        field10613 = null;
        field10619 = null;
        field10618 = null;
        field10620 = null;
        field10616 = null;
        field10612 = null;
        field10617 = null;
        if (arg0 <= 103) {
            method4237(47);
        }
        field10621 = null;
        field10614 = null;
    }
}
