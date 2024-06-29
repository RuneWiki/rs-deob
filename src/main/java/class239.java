import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public abstract class class239 {

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "Lwn;")
    public static class674 field3285;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V", line = 15)
    public static void method1493(byte arg0) {
        field3285 = null;
        if (arg0 >= -40) {
            field3285 = null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IBII[FFIIII)V", line = 27)
    public static final void method1495(int arg0, byte arg1, int arg2, int arg3, float[] arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg9 - arg3;
        int var11 = arg7 - arg6;
        int var12 = arg8 - arg0;
        field3280++;
        float var13 = arg4[2] * (float) var10 + arg4[0] * (float) var11 + arg4[1] * (float) var12;
        if (arg1 >= -81) {
            field3285 = null;
        }
        float var14 = arg4[5] * (float) var10 + arg4[3] * (float) var11 + arg4[4] * (float) var12;
        float var15 = arg4[8] * (float) var10 + arg4[7] * (float) var12 + arg4[6] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg5 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg2 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg2 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg2 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class265.field3584 = var17;
        class369.field4972 = var18;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Z)V", line = 81)
    public static final void method1497(boolean arg0) {
        class76.field1004 = new class199(8);
        field3281++;
        class60.field672 = 0;
        for (class646 var1 = (class646) class589.field8271.method3898((byte) -38); var1 != null; var1 = (class646) class589.field8271.method3902(true)) {
            var1.method3609();
        }
        if (arg0) {
            field3283 = 83;
        }
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(I)V", line = 103)
    public static final void method1498(int arg0) {
        class494.method2789(125);
        field3282++;
        class610.field8463 = null;
        if (arg0 == 1) {
            field3285 = null;
            class187.field2718 = null;
            class284.field3907 = null;
            class405.field5678 = null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)Z", line = 123)
    public final boolean method1500(int arg0) {
        if (arg0 != 0) {
            field3285 = null;
        }
        field3284++;
        return this.method1490(-3) || this.method1501(arg0 + 127) || this.method1496((byte) -123);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public abstract void method1489(int arg0);

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)Z")
    public abstract boolean method1490(int arg0);

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)I")
    public abstract int method1491(byte arg0);

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)Lbs;")
    public abstract class639 method1492(byte arg0);

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "(B)V")
    public abstract void method1494(byte arg0);

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "(B)Z")
    public abstract boolean method1496(byte arg0);

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)I")
    public abstract int method1499(int arg0);

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "(I)Z")
    public abstract boolean method1501(int arg0);
}
