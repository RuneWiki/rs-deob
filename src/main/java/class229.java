import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class229 extends class202 {

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Lr;")
    public class39 field4020;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "Loh;")
    private static class263 field4016 = class253.method1681(-125, "Started 3d Library");

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Loh;")
    public static class263 field4017 = field4016;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Loh;")
    public static class263 field4021 = class253.method1681(-117, "m");

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Loh;")
    public static class263 field4015 = class253.method1681(-120, "http:)4)4");

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Ldg;")
    public static class137 field4018;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)V")
    public static final void method1550(int arg0, boolean arg1) {
        field4019++;
        if (arg1 == class158.field2858) {
            return;
        }
        class158.field2858 = arg1;
        if (arg0 != -4183) {
            field4017 = null;
        }
        class157.method1025((byte) 115);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lue;Z)V")
    public static final void method1551(class86 arg0, boolean arg1) {
        class11.field248 = arg0;
        field4023++;
        if (arg1) {
            field4016 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V")
    public static void method1552(byte arg0) {
        field4015 = null;
        field4016 = null;
        if (arg0 < 8) {
            method1550(75, false);
        }
        field4018 = null;
        field4021 = null;
        field4017 = null;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lr;)V")
    public class229(class39 arg0) {
        this.field4020 = arg0;
    }
}
