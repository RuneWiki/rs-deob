import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class64 extends class623 {

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "Lar;")
    public class561 field863;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "Lus;")
    public static class328 field866 = new class328(73, -1);

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public static final void method487(int arg0) {
        field864++;
        class241.method1500(class458.field6407, true, (long) class266.field3368);
        if (class638.field8834 != -1) {
            class737.method4131(0, class638.field8834);
        }
        for (int var1 = 0; var1 < class48.field702; var1++) {
            if (class709.field9971[var1]) {
                class6.field69[var1] = true;
            }
            class595.field8265[var1] = class709.field9971[var1];
            class709.field9971[var1] = false;
        }
        class62.field843 = class266.field3368;
        if (class638.field8834 != -1) {
            class48.field702 = 0;
            class106.method725(-8);
        }
        class458.field6407.method59();
        class208.method1277((byte) 102, class458.field6407);
        int var2 = class315.method1845((byte) 26);
        if (~var2 == arg0) {
            var2 = class105.field1289;
        }
        if (var2 == -1) {
            var2 = class137.field1636;
        }
        class419.method2492(var2, arg0 ^ 0xFFFF9E98);
        class591.field8232 = 0;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lar;)V")
    public class64(class561 arg0) {
        this.field863 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
    public static void method488(byte arg0) {
        field866 = null;
        if (arg0 != 52) {
            method488((byte) 59);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)Z")
    public static final boolean method489(byte arg0, int arg1) {
        field865++;
        if (arg0 <= 123) {
            method488((byte) -121);
        }
        return arg1 == 10 || arg1 == 11 || arg1 == 12;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(B)Z")
    public static final boolean method490(byte arg0) {
        if (arg0 < 10) {
            field866 = null;
        }
        field862++;
        return class423.field6011;
    }
}
