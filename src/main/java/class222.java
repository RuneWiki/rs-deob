import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class222 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field3547 = 0;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static final void method1495(int arg0) {
        if (~class80.field1325 != arg0) {
            class108.method804(class80.field1325, -1, -1, arg0 - 120);
            class80.field1325 = -1;
        }
        field3548++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    public static final void method1496(int arg0, int arg1) {
        field3551++;
        if (arg0 != -1) {
            field3547 = -69;
        }
        class224.field3572.method1163(arg1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V")
    public static final void method1497(int arg0, byte arg1) {
        field3549++;
        class23 var2 = class91.method694(arg0, 2, 121);
        int var3 = 77 / ((arg1 - 59) / 46);
        var2.method183(-118);
    }
}
