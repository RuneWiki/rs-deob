import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class173 {

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public int field2757 = 128;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public int field2764 = 128;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public int field2755;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLuq;)V")
    public final void method1313(boolean arg0, class173 arg1) {
        this.field2763 = arg1.field2763;
        this.field2756 = arg1.field2756;
        if (!arg0) {
            return;
        }
        this.field2760 = arg1.field2760;
        this.field2764 = arg1.field2764;
        this.field2757 = arg1.field2757;
        this.field2755 = arg1.field2755;
        field2758++;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZLqj;)V")
    public static final void method1314(boolean arg0, class537 arg1) {
        class561.field7952.method3594((byte) 109, arg1);
        field2765++;
        arg1.field7301 = arg1.field7295.field1442;
        arg1.field7295.field1442 = 0;
        if (arg0) {
            field2759 = 83;
        }
        class741.field10226 += arg1.field7301;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
    public static final void method1315(boolean arg0) {
        if (!arg0) {
            method1315(true);
        }
        if (class89.field1277 != null) {
            class89.field1277.method2708((byte) 96);
        }
        field2762++;
        if (class100.field1622 != null) {
            class100.field1622.method2708((byte) 96);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(Z)Luq;")
    public final class173 method1316(boolean arg0) {
        field2761++;
        if (!arg0) {
            this.field2763 = 46;
        }
        return new class173(this.field2756, this.field2764, this.field2757, this.field2763, this.field2755, this.field2760);
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(I)V")
    public class173(int arg0) {
        this.field2756 = arg0;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(IIIIII)V")
    private class173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2760 = arg5;
        this.field2757 = arg2;
        this.field2764 = arg1;
        this.field2756 = arg0;
        this.field2763 = arg3;
        this.field2755 = arg4;
    }
}
