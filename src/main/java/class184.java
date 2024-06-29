import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class184 {

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Leg;")
    public static class37 field3098 = class174.method1167("Lade Wordpack )2 ", -126);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lpe;")
    public static class237 field3097;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method1229(int arg0) {
        field3094++;
        class286.field5043.method1409(107);
        int var1 = -45 / ((59 - arg0) / 35);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static final void method1230(byte arg0) {
        field3095++;
        if (class276.field4899 && arg0 == -123) {
            class181.field3019 = null;
            class276.field4899 = false;
            class47.field734 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field3097 = null;
        field3098 = null;
        if (arg0 != 1) {
            field3098 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V")
    public static final void method1232(byte arg0, int arg1) {
        field3100++;
        if (arg0 != -94) {
            method1230((byte) -122);
        }
        class274 var2 = class166.method1116(9, arg1, true);
        var2.method1840(10000);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z")
    public static final boolean method1233(int arg0, int arg1) {
        class203.field3476 = arg0 + arg1 & 0xFFFF;
        field3096++;
        class218.field3746 = true;
        return true;
    }
}
