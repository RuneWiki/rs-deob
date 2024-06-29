import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class213 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Z")
    public static boolean field2980 = false;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field2982 = 0;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field2983 = 0;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lcc;")
    public static class339 field2977 = new class339();

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "F")
    public static float field2978;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lbf;IZIII)V", line = 14)
    public static final void method1423(class328 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2981++;
        if (arg0.field4458 == -1 && arg0.field4463 == null) {
            return;
        }
        int var6 = 0;
        if (arg2) {
            return;
        }
        int var7 = class336.field4540 * arg0.field4464 >> 8;
        if (arg4 > arg0.field4451) {
            var6 += arg4 - arg0.field4451;
        } else if (arg0.field4466 > arg4) {
            var6 += arg0.field4466 - arg4;
        }
        if (arg3 > arg0.field4459) {
            var6 += arg3 - arg0.field4459;
        } else if (arg0.field4467 > arg3) {
            var6 += arg0.field4467 - arg3;
        }
        if (arg0.field4470 == 0 || arg0.field4470 < var6 - 64 || class336.field4540 == 0 || arg0.field4447 != arg5) {
            if (arg0.field4452 != null) {
                class48.field616.method1128(arg0.field4452);
                arg0.field4452 = null;
            }
            if (arg0.field4460 != null) {
                class48.field616.method1128(arg0.field4460);
                arg0.field4460 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg0.field4470 - var6) * var7 / arg0.field4470;
        if (arg0.field4452 != null) {
            arg0.field4452.method1085(var8);
        } else if (arg0.field4458 >= 0) {
            class201 var9 = class201.method1384(class62.field841, arg0.field4458, 0);
            if (var9 != null) {
                class224 var10 = var9.method1383().method1470(class383.field5269);
                class148 var11 = class148.method1087(var10, 100, var8);
                var11.method1097(-1);
                class48.field616.method1127(var11);
                arg0.field4452 = var11;
            }
        }
        if (arg0.field4460 != null) {
            arg0.field4460.method1085(var8);
            if (!arg0.field4460.method1887(114)) {
                arg0.field4460 = null;
            }
        } else if (arg0.field4463 != null && (arg0.field4465 -= arg1) <= 0) {
            int var12 = (int) (Math.random() * (double) arg0.field4463.length);
            class201 var13 = class201.method1384(class62.field841, arg0.field4463[var12], 0);
            if (var13 != null) {
                class224 var14 = var13.method1383().method1470(class383.field5269);
                class148 var15 = class148.method1087(var14, 100, var8);
                var15.method1097(0);
                class48.field616.method1127(var15);
                arg0.field4460 = var15;
                arg0.field4465 = arg0.field4471 + ((int) ((double) (arg0.field4449 - arg0.field4471) * Math.random()));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 143)
    public static final void method1424(int arg0) {
        field2979++;
        if (class80.field1116.length() == 0) {
            return;
        }
        class125.method953("--> " + class80.field1116, true);
        class60.method480(false, 0, class80.field1116);
        if (arg0 < -61) {
            class432.field6121 = 0;
            class317.field4311 = 0;
            class80.field1116 = "";
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 176)
    public static void method1425(boolean arg0) {
        field2977 = null;
        if (arg0) {
            field2980 = false;
        }
    }
}
