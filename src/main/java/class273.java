import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class273 extends class272 {

    @OriginalMember(owner = "client!st", name = "x", descriptor = "Lrs;")
    public class428 field3971;

    @OriginalMember(owner = "client!st", name = "A", descriptor = "[Lue;")
    public static class141[] field3974 = new class141[8];

    @OriginalMember(owner = "client!st", name = "E", descriptor = "[I")
    public static int[] field3977;

    @OriginalMember(owner = "client!st", name = "y", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!st", name = "z", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!st", name = "C", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!st", name = "D", descriptor = "[Ltr;")
    public static class176[] field3976;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILb;IIZI)V")
    public static final void method1674(int arg0, class201 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        client.field2623 = arg1;
        class256.field3761 = arg4;
        class222.field3376 = arg0;
        class405.field5701 = arg5;
        class206.field3157 = arg3;
        if (arg2 < 108) {
            method1674(-86, (class201) null, -113, -9, true, 43);
        }
        class327.field4741 = 1;
        field3972++;
        class70.field883 = 10000;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lrs;)V")
    public class273(class428 arg0) {
        this.field3971 = arg0;
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V")
    public static final void method1675(boolean arg0) {
        class451.field6237 = class37.field488.field1793 + class37.field488.field1785 + 2;
        class118.field1487 = new String[500];
        field3975++;
        class485.field6829 = class252.field3717.field1793 + class252.field3717.field1785 + 2;
        if (arg0) {
            for (int var1 = 0; var1 < class118.field1487.length; var1++) {
                class118.field1487[var1] = "";
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(B)V")
    public static void method1676(byte arg0) {
        field3974 = null;
        if (arg0 == -78) {
            field3977 = null;
            field3976 = null;
        }
    }

    static {
        new class112("", 73);
        field3977 = new int[1000];
    }
}
