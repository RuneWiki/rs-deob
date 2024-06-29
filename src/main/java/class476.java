import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class476 {

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "Lim;")
    public static class353 field6705 = new class353(90, 7);

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field6707 = -1;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
    public static void method2700(int arg0) {
        if (arg0 == -1296190135) {
            field6705 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2701(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6706++;
        int var7 = 116 % ((arg0 - 58) / 46);
        for (class263 var8 = (class263) class374.field5215.method1876((byte) 119); var8 != null; var8 = (class263) class374.field5215.method1877(0)) {
            if (class7.field61 >= var8.field3353) {
                var8.method3394(false);
            } else {
                class627.method3626(arg2, arg6, arg1 >> 1, true, var8.field3358 * 2, var8.field3355, (var8.field3359 << 9) + 256, arg3 >> 1, (var8.field3351 << 9) + 256);
                class95.field1282.method1618(var8.field3361 | 0xFF000000, 0, class155.field2011[1] + arg5, (byte) -125, arg4 + class155.field2011[0], var8.field3352);
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Z")
    public static final boolean method2702(int arg0, int arg1) {
        field6708++;
        if (arg0 != 503866593) {
            field6705 = null;
        }
        for (class245 var2 = (class245) class57.field760.method3188((byte) -100); var2 != null; var2 = (class245) class57.field760.method3182((byte) -100)) {
            if (class17.method77(-30195, var2.field3094) && (long) arg1 == var2.field3099) {
                return true;
            }
        }
        return false;
    }
}
