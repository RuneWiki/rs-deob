import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class80 implements class355 {

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "Lbk;")
    private class349 field1040;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "J")
    public static long field1039 = 0L;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "Lhd;")
    public static class694 field1036 = new class694(16);

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
    public static int field1043 = -1;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "(I)V", line = 3)
    public static void method615(int arg0) {
        field1036 = null;
        if (arg0 <= 113) {
            field1042 = -115;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V", line = 15)
    public final void method518(int arg0) {
        field1038++;
        if (arg0 != -841) {
            method615(-70);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZB)V", line = 29)
    public final void method513(boolean arg0, byte arg1) {
        if (arg1 < 57) {
            field1043 = -111;
        }
        if (arg0) {
            class309.field3898.method475(0, 0, class309.field3890, class491.field6129, this.field1040.field4481, 0);
        }
        field1041++;
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)Z", line = 43)
    public final boolean method516(int arg0) {
        field1037++;
        return arg0 == -6191;
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lbk;)V", line = 55)
    public class80(class349 arg0) {
        this.field1040 = arg0;
    }
}
