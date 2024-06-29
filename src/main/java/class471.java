import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class471 {

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public int field6810 = 128;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public int field6804 = 128;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field6802;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field6798;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public int field6811;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public int field6809;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Liu;")
    public static class390 field6801 = new class390(34, 15);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field6799;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public int field6803;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public int field6805;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public int field6812;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Loa;Z)V", line = 5)
    public final void method2753(class471 arg0, boolean arg1) {
        this.field6809 = arg0.field6809;
        this.field6804 = arg0.field6804;
        this.field6810 = arg0.field6810;
        field6807++;
        this.field6798 = arg0.field6798;
        if (!arg1) {
            method2755(-72, -35, -18, null, 1.7503285F, 85, 7, 66, 3, 77);
        }
        this.field6811 = arg0.field6811;
        this.field6802 = arg0.field6802;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)Loa;", line = 21)
    public final class471 method2754(byte arg0) {
        field6800++;
        if (arg0 != -82) {
            this.field6805 = -46;
        }
        return new class471(this.field6802, this.field6804, this.field6810, this.field6809, this.field6811, this.field6798);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[FFIIIII)V", line = 45)
    public static final void method2755(int arg0, int arg1, int arg2, float[] arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg7 - arg0;
        int var11 = arg5 - arg1;
        field6806++;
        int var12 = arg6 - arg9;
        int var13 = 28 / ((arg8 - 57) / 55);
        float var14 = arg3[2] * (float) var11 + arg3[0] * (float) var10 + arg3[1] * (float) var12;
        float var15 = arg3[5] * (float) var11 + arg3[4] * (float) var12 + arg3[3] * (float) var10;
        float var16 = arg3[8] * (float) var11 + arg3[7] * (float) var12 + arg3[6] * (float) var10;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var15 / var17)) / 3.1415927F + arg4 + 0.5F;
        if (arg2 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg2 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg2 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        class337.field4910 = var18;
        class336.field4874 = var19;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V", line = 105)
    public class471(int arg0) {
        this.field6802 = arg0;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIII)V", line = 112)
    private class471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6804 = arg1;
        this.field6798 = arg5;
        this.field6811 = arg4;
        this.field6809 = arg3;
        this.field6802 = arg0;
        this.field6810 = arg2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 125)
    public static void method2756(int arg0) {
        if (arg0 == 128) {
            field6801 = null;
        }
    }
}
