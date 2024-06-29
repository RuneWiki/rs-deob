import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class72 extends class341 {

    @OriginalMember(owner = "client!a", name = "u", descriptor = "[I")
    public static int[] field1204 = new int[100];

    @OriginalMember(owner = "client!a", name = "w", descriptor = "Lfg;")
    public static class18 field1206 = new class18(4);

    @OriginalMember(owner = "client!a", name = "y", descriptor = "Z")
    public static boolean field1208 = false;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1210 = "Face here";

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Z")
    public static boolean field1209 = false;

    @OriginalMember(owner = "client!a", name = "v", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIILug;II)V", line = 7)
    public static final void method577(int arg0, int arg1, int arg2, class324 arg3, int arg4, int arg5) {
        field1205++;
        if (arg3.field4669 == -1 && arg3.field4666 == null) {
            return;
        }
        int var6 = 0;
        if (arg3.field4677 < arg5) {
            var6 += arg5 - arg3.field4677;
        } else if (arg5 < arg3.field4675) {
            var6 += arg3.field4675 - arg5;
        }
        int var7 = class151.field2315 * arg3.field4684 >> 8;
        if (arg4 != 24038) {
            field1208 = true;
        }
        if (arg1 > arg3.field4682) {
            var6 += arg1 - arg3.field4682;
        } else if (arg3.field4691 > arg1) {
            var6 += arg3.field4691 - arg1;
        }
        if (arg3.field4664 == 0 || arg3.field4664 < (var6 - 64) || class151.field2315 == 0 || arg3.field4688 != arg0) {
            if (arg3.field4690 != null) {
                class220.field3275.method511(arg3.field4690);
                arg3.field4690 = null;
            }
            if (arg3.field4679 != null) {
                class220.field3275.method511(arg3.field4679);
                arg3.field4679 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field4664 - var6) * var7 / arg3.field4664;
        if (arg3.field4690 != null) {
            arg3.field4690.method177(var8);
        } else if (arg3.field4669 >= 0) {
            class116 var9 = class116.method986(class176.field2622, arg3.field4669, 0);
            if (var9 != null) {
                class201 var10 = var9.method987().method1524(class416.field6016);
                class24 var11 = class24.method202(var10, 100, var8);
                var11.method184(-1);
                class220.field3275.method513(var11);
                arg3.field4690 = var11;
            }
        }
        if (arg3.field4679 != null) {
            arg3.field4679.method177(var8);
            if (!arg3.field4679.method252(-88)) {
                arg3.field4679 = null;
            }
        } else if (arg3.field4666 != null && (arg3.field4680 -= arg2) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field4666.length);
            class116 var13 = class116.method986(class176.field2622, arg3.field4666[var12], 0);
            if (var13 != null) {
                class201 var14 = var13.method987().method1524(class416.field6016);
                class24 var15 = class24.method202(var14, 100, var8);
                var15.method184(0);
                class220.field3275.method513(var15);
                arg3.field4679 = var15;
                arg3.field4680 = (int) ((double) (arg3.field4681 - arg3.field4687) * Math.random()) + arg3.field4687;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V", line = 140)
    public static void method578(int arg0) {
        field1206 = null;
        if (arg0 >= 92) {
            field1210 = null;
            field1204 = null;
        }
    }
}
