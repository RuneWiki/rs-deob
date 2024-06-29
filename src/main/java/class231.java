import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class231 extends class61 {

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public int field4022;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field4017 = 0;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field4013 = 0;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public static int field4018 = 0;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Leb;")
    public static class230 field4016 = class68.method589(0, "<col=80ff00>");

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public static int field4020 = 127;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "Leb;")
    public static class230 field4021 = class68.method589(0, ")4p=");

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "Lkk;")
    public static class223 field4023;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static void method1637(int arg0) {
        field4016 = null;
        if (arg0 >= -16) {
            field4014 = 23;
        }
        field4023 = null;
        field4021 = null;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(II)V")
    public class231(int arg0, int arg1) {
        this.field4015 = arg1;
        this.field4022 = arg0;
    }
}
