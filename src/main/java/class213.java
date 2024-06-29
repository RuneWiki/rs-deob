import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class213 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Ldg;")
    public static class276 field3820 = new class276(64);

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lvf;")
    public static class265 field3823 = class87.method582(-46, "headicons_pk");

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Lfl;")
    public static class192 field3822;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static final void method1451(byte arg0) {
        class43.field948++;
        class55.field1133.method1863(true, 164);
        field3821++;
        class55.field1133.method903((byte) 36, class232.method1565((byte) 72));
        class55.field1133.method921(111, class26.field706);
        class55.field1133.method921(112, class50.field1053);
        if (arg0 < 54) {
            method1451((byte) 40);
        }
        class55.field1133.method903((byte) 36, class243.field4246);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
    public static void method1452(byte arg0) {
        field3820 = null;
        field3823 = null;
        field3822 = null;
        int var1 = -67 % ((arg0 + 47) / 41);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lgk;I)Lgk;")
    public static final class6 method1453(class6 arg0, int arg1) {
        field3818++;
        class6 var2 = client.method1481(arg0);
        if (var2 == null) {
            var2 = arg0.field179;
        }
        int var3 = 41 / ((arg1 - 55) / 56);
        return var2;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
    public static final void method1454(int arg0, int arg1) {
        if (arg0 == -10520) {
            class178 var2 = class188.method1282(arg1, 8, 261360480);
            field3819++;
            var2.method1160(115);
        }
    }
}
