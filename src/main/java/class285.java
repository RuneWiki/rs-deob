import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class285 {

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public int field4050;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field4053 = 0;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field4052 = 0;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Lol;")
    public class285 field4054;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Lql;")
    public class738 field4046;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static final void method1823(int arg0) {
        if (arg0 == 0) {
            class729.field10214.method489(class310.field4391, class37.field376, class55.field763);
            field4056++;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Lfl;")
    public final class741 method1824(int arg0) {
        field4057++;
        int var2 = -47 % ((arg0 + 46) / 39);
        return class658.method3799(this.field4050, true);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)Lol;")
    public final class285 method1825(int arg0, int arg1) {
        if (arg1 == 2806) {
            field4051++;
            return new class285(this.field4050, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(II)V")
    public class285(int arg0, int arg1) {
        this.field4050 = arg0;
        this.field4055 = arg1;
    }
}
