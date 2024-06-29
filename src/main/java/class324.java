import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class324 extends class120 {

    @OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "Lpt;")
    public static class529 field4136 = new class529();

    @OriginalMember(owner = "client!vv", name = "x", descriptor = "Luw;")
    public static class416 field4143 = new class416("LIVE", 0);

    @OriginalMember(owner = "client!vv", name = "y", descriptor = "I")
    public static int field4144 = 0;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "Ljs;")
    public static class330 field4141;

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lkda;Lcu;IIIIIIIIII)V", line = 5)
    public class324(class388 arg0, class219 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field4142 = arg11;
        this.field4135 = arg10;
    }

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "(I)V", line = 17)
    public static final void method1930(int arg0) {
        if (class673.field9546 != null) {
            class673.field9546.method336(-123);
            class199.field2352 = null;
            class673.field9546 = null;
        }
        field4137++;
        if (arg0 >= -77) {
            method1932();
        }
    }

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "(I)V", line = 35)
    public static void method1931(int arg0) {
        field4141 = null;
        field4143 = null;
        field4136 = null;
        if (arg0 <= 74) {
            field4136 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "()V", line = 51)
    public static final void method1932() {
        for (int var0 = class351.field4526; var0 < class723.field10134; var0++) {
            for (int var1 = 0; var1 < class284.field3473; var1++) {
                for (int var2 = 0; var2 < class151.field1664; var2++) {
                    class691 var3 = class638.field9170[var0][var1][var2];
                    if (var3 != null) {
                        class492 var4 = var3.field9728;
                        class492 var5 = var3.field9725;
                        if (var4 != null && var4.method991(-116)) {
                            class646.method3686(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method991(-59)) {
                                class646.method3686(var5, var0, var1, var2, 1, 1);
                                var5.method987(false, class563.field8026, var4, 0, 0, 0, 0);
                                var5.method982(2);
                            }
                            var4.method982(2);
                        }
                        for (class398 var6 = var3.field9739; var6 != null; var6 = var6.field5451) {
                            class340 var8 = var6.field5449;
                            if (var8 != null && var8.method991(126)) {
                                class646.method3686(var8, var0, var1, var2, var8.field4390 + 1 - var8.field4395, var8.field4402 - var8.field4387 + 1);
                                var8.method982(2);
                            }
                        }
                        class188 var7 = var3.field9736;
                        if (var7 != null && var7.method991(117)) {
                            class613.method3467(var7, var0, var1, var2);
                            var7.method982(2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Z)V", line = 126)
    public static final void method1933(boolean arg0) {
        field4139++;
        int[] var1 = new int[class361.field4643.field1614];
        int var2 = 0;
        for (int var3 = 0; var3 < class361.field4643.field1614; var3++) {
            class431 var5 = class361.field4643.method912((byte) 1, var3);
            if (var5.field6255 >= 0 || var5.field6272 >= 0) {
                var1[var2++] = var3;
            }
        }
        if (!arg0) {
            method1930(-13);
        }
        class582.field8221 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class582.field8221[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)Lhs;", line = 162)
    public final class325 method777(int arg0) {
        field4140++;
        return arg0 >= -8 ? null : class371.field4742;
    }
}
