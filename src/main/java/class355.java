import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class355 implements class113 {

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "Lbi;")
    private class449 field4826;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Loq;")
    private class333 field4823;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lbi;")
    private class449 field4828;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4827 = 0;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Ldb;")
    public static class298 field4818 = new class298(45, 2);

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Ldb;")
    public static class298 field4829 = new class298(110, -1);

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field4830 = 0;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "B")
    public static byte field4824;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lta;")
    private class200 field4819;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V")
    public final void method912(boolean arg0, int arg1) {
        if (arg1 != -20667) {
            this.method911((byte) -104);
        }
        field4825++;
        if (arg0) {
            int var3 = this.field4823.field4563.method1358(0, this.field4823.field4566, class641.field8619) + this.field4823.field4575;
            int var4 = this.field4823.field4567.method3790(this.field4823.field4571, arg1 ^ 0xFFFFAF28, class305.field4229) + this.field4823.field4577;
            this.field4819.method1301(this.field4823.field4564, this.field4823.field4562, var4, (byte) 127, this.field4823.field4571, this.field4823.field4572, var3, this.field4823.field4574, 0, null, null, 0, this.field4823.field4566, this.field4823.field4569, this.field4823.field4565, null);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Z")
    public final boolean method913(int arg0) {
        field4822++;
        if (arg0 <= 13) {
            field4818 = null;
        }
        boolean var2 = true;
        if (!this.field4828.method2549(this.field4823.field4573, 3015)) {
            var2 = false;
        }
        if (!this.field4826.method2549(this.field4823.field4573, 3015)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
    public static final void method2103(byte arg0) {
        field4817++;
        class693.field9751.method3739(0);
        if (arg0 < 35) {
            field4818 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)V")
    public static final void method2104(byte arg0) {
        int var1 = 34 / ((28 - arg0) / 47);
        field4821++;
        int var2 = 0;
        for (int var3 = 0; var3 < class34.field530; var3++) {
            for (int var4 = 0; var4 < class34.field531; var4++) {
                if (class333.method1975(class703.field9899, var2, var4, false, true, var3)) {
                    var2++;
                }
                if (var2 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public final void method911(byte arg0) {
        if (arg0 == -13) {
            field4820++;
            class511 var2 = class154.method1084(this.field4826, (byte) 40, this.field4823.field4573);
            this.field4819 = class10.field197.method389(var2, class500.method2769(this.field4828, this.field4823.field4573), true);
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V")
    public static void method2105(int arg0) {
        field4818 = null;
        if (arg0 == 110) {
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lbi;Lbi;Loq;)V")
    public class355(class449 arg0, class449 arg1, class333 arg2) {
        this.field4826 = arg1;
        this.field4823 = arg2;
        this.field4828 = arg0;
    }
}
