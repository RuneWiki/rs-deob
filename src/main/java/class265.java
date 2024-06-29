import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class265 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lug;")
    public class325 field3561;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "Lsj;")
    public class73 field3562;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[Lsa;")
    public static class411[] field3566;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public static void method1705(boolean arg0) {
        if (!arg0) {
            field3566 = null;
        }
        field3566 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)Lg;")
    public static final class434 method1706(boolean arg0, int arg1) {
        field3560++;
        class410 var2 = class244.field3375;
        class434 var3;
        synchronized (class244.field3375) {
            var3 = (class434) class244.field3375.method2537(-66, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        if (arg0) {
            field3565 = -94;
        }
        byte[] var4 = class64.field977.method2633(arg1, -1, 32);
        class434 var5 = new class434();
        if (var4 != null) {
            var5.method2688(new class289(var4), 114);
        }
        var5.method2687(-7);
        class410 var6 = class244.field3375;
        synchronized (class244.field3375) {
            class244.field3375.method2542(var5, (byte) -100, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIBIIZ)V")
    public static final void method1707(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 < 14) {
            method1705(true);
        }
        field3564++;
        class183.field2659 = arg5;
        class419.field5870 = arg0;
        class361.field4910 = arg2;
        class325.field4416 = arg1;
        class303.field4108 = arg4;
        if (arg6 && class419.field5870 >= 100) {
            class356.field4842 = class361.field4910 * 128 + 64;
            class374.field5261 = class325.field4416 * 128 + 64;
            class443.field6389 = class22.method281(1, class69.field1046, class374.field5261, class356.field4842) - class303.field4108;
        }
        class184.field2675 = 2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lrk;I)V")
    public static final void method1708(class427 arg0, int arg1) {
        field3563++;
        if (arg1 == 32) {
            class177.field2616 = arg0;
        }
    }
}
