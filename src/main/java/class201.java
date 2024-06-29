import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class201 {

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[Lsj;")
    public static class208[] field3241 = new class208[0];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "J")
    public static long field3240;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method1415(int arg0) {
        field3241 = null;
        if (arg0 != 1) {
            method1416(-44);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static final void method1416(int arg0) {
        field3238++;
        class202 var1 = (class202) class181.field2881.method309(0);
        if (arg0 != -6150) {
            return;
        }
        while (var1 != null) {
            class265 var2 = var1.field3244;
            if (class182.field2898 != var2.field4423 || var2.field4424) {
                var1.method993(32);
            } else if (class275.field4598 >= var2.field4427) {
                var2.method1875(6514, class19.field356);
                if (var2.field4424) {
                    var1.method993(32);
                } else {
                    class115.method885(var2.field4423, var2.field4434, var2.field4435, var2.field4437, 60, var2, 0, -1L, false);
                }
            }
            var1 = (class202) class181.field2881.method312((byte) 126);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public static final void method1417(int arg0, int arg1, int arg2) {
        class253.field4282 = class148.field2434 + class148.field2437 - (arg2 + 1);
        int var3 = -16 / ((arg1 + 60) / 37);
        field3239++;
        class306.field4951 = arg0 - class148.field2438;
    }
}
