import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class57 extends class64 {

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Lid;")
    public class149 field1002;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field1003 = 0;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "Lid;")
    public static class149 field1006 = class60.method382("Verbindung abgebrochen)3", (byte) 20);

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field1005 = 127;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field1004 = 128;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    public static final void method354(int arg0, int arg1) {
        field1007++;
        class216 var2 = class139.method972(arg1, false, 9);
        var2.method1457(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class57() {
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lid;I)V")
    public class57(class149 arg0, int arg1) {
        this.field1002 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lid;B)V")
    public static final void method355(class149 arg0, byte arg1) {
        field1008++;
        int var2 = class254.method1751(arg0, arg1 - 78);
        if (arg1 == 77 && var2 != -1) {
            class101.method721(-5402, class168.field3120.field4969[var2], class168.field3120.field4970[var2]);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method356(int arg0) {
        int var1 = 46 / ((44 - arg0) / 50);
        field1006 = null;
    }
}
