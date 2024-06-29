import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class186 {

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
    public static int[] field3291 = new int[2000];

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field3290 = -1;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Lqk;")
    public static class207 field3293 = class24.method212(255, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "Luh;")
    public static class100 field3292;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static void method1299(int arg0) {
        if (arg0 != -1) {
            method1299(58);
        }
        field3293 = null;
        field3292 = null;
        field3291 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
    public static final void method1300(int arg0, int arg1) {
        field3289++;
        class268.field4751--;
        if (class268.field4751 == arg1) {
            return;
        }
        class274.method1859(class110.field1926, arg1 + 1, class110.field1926, arg1, class268.field4751 - arg1);
        class274.method1859(class12.field167, arg1 + 1, class12.field167, arg1, class268.field4751 - arg1);
        class274.method1861(class131.field2273, arg1 + 1, class131.field2273, arg1, class268.field4751 - arg1);
        class274.method1858(class82.field1494, arg1 + 1, class82.field1494, arg1, class268.field4751 - arg1);
        class274.method1856(class282.field4960, arg1 + 1, class282.field4960, arg1, class268.field4751 - arg1);
        class274.method1861(class85.field1551, arg1 + 1, class85.field1551, arg1, class268.field4751 - arg1);
        class274.method1861(class199.field3505, arg1 + 1, class199.field3505, arg1, class268.field4751 - arg1);
        if (arg0 < 17) {
            field3290 = 95;
        }
    }
}
