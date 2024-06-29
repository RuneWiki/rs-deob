import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class248 implements class389 {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Lvo;")
    private class345 field3607;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Lju;")
    private class352 field3605;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field3608 = 0;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lf;")
    private class257 field3604;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lpa;")
    public static class587 field3610;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
    public static int method1593(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public final void method343(int arg0) {
        if (arg0 <= -29) {
            field3603++;
            this.field3604 = class699.method3926(this.field3605.field4944, (byte) 59, this.field3607);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static final void method1594(byte arg0) {
        class580.field8512.method950((byte) -5);
        field3606++;
        int var1 = -58 % ((arg0 + 63) / 43);
        class638.field9056.method950((byte) -125);
        class477.field6828.method950((byte) -126);
        class241.field3538.method950((byte) 114);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZZ)V")
    public final void method344(boolean arg0, boolean arg1) {
        if (arg1) {
            int var3 = class465.field6689 <= class570.field8333 ? class570.field8333 : class465.field6689;
            int var4 = class597.field8633 <= class140.field2349 ? class140.field2349 : class597.field8633;
            int var5 = this.field3604.method11();
            int var6 = this.field3604.method9();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var8 = var4 * var5 / var6;
                var9 = var4;
                var10 = 0;
                var7 = (var3 - var8) / 2;
            }
            this.field3604.method1634(var7, var10, var8, var9);
        }
        field3611++;
        if (arg0) {
            this.field3604 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method1595(byte arg0) {
        field3610 = null;
        if (arg0 >= -42) {
            field3610 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lvo;Lju;)V")
    public class248(class345 arg0, class352 arg1) {
        this.field3607 = arg0;
        this.field3605 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Z")
    public final boolean method348(int arg0) {
        if (arg0 != 21378) {
            this.method348(-112);
        }
        field3609++;
        return this.field3607.method2077(0, this.field3605.field4944);
    }
}
