import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public abstract class class483 {

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "Lfr;")
    public static class497 field7130 = new class497();

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "D")
    public static double field7132 = -1.0D;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "Z")
    public static boolean field7133 = false;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "Lga;")
    public static class243 field7131;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
    public abstract void method1877(boolean arg0);

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    public static void method2883(int arg0) {
        field7130 = null;
        if (arg0 == 14307) {
            field7131 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
    public abstract void method1880(int arg0);

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)Las;")
    public abstract class18 method1881(boolean arg0);

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2884(int arg0, int arg1, byte arg2) {
        if (arg2 != -113) {
            field7131 = null;
        }
        field7134++;
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZ)Z")
    public abstract boolean method1879(int arg0, boolean arg1);
}
