import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public abstract class class395 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lpw;")
    public static class89 field5023 = new class89(2);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
    public static void method2247(boolean arg0) {
        field5023 = null;
        if (!arg0) {
            field5023 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLka;)Lka;")
    public abstract class206 method2248(byte arg0, class206 arg1);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)Z")
    public static final boolean method2249(int arg0, int arg1, int arg2) {
        field5022++;
        if (arg2 < 66) {
            field5023 = null;
        }
        return class353.method2027(arg0, arg1, (byte) 88) || class337.method1932(-1, arg0, arg1);
    }
}
