import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class58 {

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "Lqe;")
    public static class469 field799 = new class469(12, 8);

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "Lmia;")
    public static class63 field800 = new class63(42, -1);

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lr;III[Z)V", line = 4)
    public static final void method405(class183 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class582.field8287 == class46.field568) {
            return;
        }
        int var5 = class531.field7566[arg1].method1786(arg3, (byte) 113, arg2);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class280 var7 = class531.field7566[var6];
                if (var7 != null) {
                    var7.method963(arg0, arg2, var5 - var7.method1786(arg3, (byte) 113, arg2), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(BIILsca;Z)V", line = 32)
    public static final void method406(byte arg0, int arg1, int arg2, class46 arg3, boolean arg4) {
        if (arg0 != 31) {
            field800 = null;
        }
        field798++;
        int var5 = arg3.field549;
        int var6 = arg3.field574;
        if (arg3.field565 == 0) {
            arg3.field549 = arg3.field665;
        } else if (arg3.field565 == 1) {
            arg3.field549 = arg1 - arg3.field665;
        } else if (arg3.field565 == 2) {
            arg3.field549 = arg3.field665 * arg1 >> 14;
        }
        if (arg3.field571 == 0) {
            arg3.field574 = arg3.field658;
        } else if (arg3.field571 == 1) {
            arg3.field574 = arg2 - arg3.field658;
        } else if (arg3.field571 == 2) {
            arg3.field574 = arg3.field658 * arg2 >> 14;
        }
        if (arg3.field565 == 4) {
            arg3.field549 = arg3.field640 * arg3.field574 / arg3.field533;
        }
        if (arg3.field571 == 4) {
            arg3.field574 = arg3.field549 * arg3.field533 / arg3.field640;
        }
        if (class501.field7119 && (client.method1886(arg3).field3393 != 0 || arg3.field577 == 0)) {
            if (arg3.field574 < 5 && arg3.field549 < 5) {
                arg3.field574 = 5;
                arg3.field549 = 5;
            } else {
                if (arg3.field574 <= 0) {
                    arg3.field574 = 5;
                }
                if (arg3.field549 <= 0) {
                    arg3.field549 = 5;
                }
            }
        }
        if (class476.field6917 == arg3.field521) {
            class171.field2663 = arg3;
        }
        if (arg4 && arg3.field668 != null && arg3.field549 != var5 || arg3.field574 != var6) {
            class177 var7 = new class177();
            var7.field2743 = arg3;
            var7.field2737 = arg3.field668;
            class150.field2337.method1203(var7, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)V", line = 112)
    public static void method407(int arg0) {
        field799 = null;
        field800 = null;
        if (arg0 != 12) {
            field800 = null;
        }
    }
}
