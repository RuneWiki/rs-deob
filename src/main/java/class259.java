import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class259 {

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public int field3720;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public int field3722;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public int field3717;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Lkn;")
    public static class737 field3721 = new class737(5, 16);

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1746(int arg0) {
        field3716++;
        if (arg0 != 16) {
            field3721 = null;
        }
        if (class297.field4175 != null) {
            class297.field4175.method3173(true);
        }
        if (class603.field8276 != null) {
            class603.field8276.method3173(true);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Lpd;", line = 31)
    public final class259 method1747(int arg0, int arg1) {
        if (arg0 != 5) {
            this.method1747(82, -25);
        }
        field3718++;
        return new class259(this.field3717, arg1, this.field3720, this.field3722);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIII)V", line = 41)
    public class259(int arg0, int arg1, int arg2, int arg3) {
        this.field3720 = arg2;
        this.field3719 = arg1;
        this.field3722 = arg3;
        this.field3717 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 52)
    public static void method1748(byte arg0) {
        field3721 = null;
        if (arg0 != 85) {
            method1748((byte) 121);
        }
    }
}
