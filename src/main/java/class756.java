import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class756 {

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field10528;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public int field10527;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public int field10533;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field10532 = 0;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field10531 = 1;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field10534 = 0;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field10530;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Lac;")
    public static class712 field10535;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "[I")
    public static int[] field10529;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZII)Z", line = 11)
    public static final boolean method4204(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field10529 = null;
        }
        field10530++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 31)
    public static void method4205(int arg0) {
        if (arg0 > -79) {
            field10534 = -70;
        }
        field10529 = null;
        field10535 = null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(III)V", line = 48)
    public class756(int arg0, int arg1, int arg2) {
        this.field10528 = arg0;
        this.field10527 = arg2;
        this.field10533 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)V")
    public abstract void method1902(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
    public abstract void method1897(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
    public abstract void method1903(byte arg0, int arg1, int arg2);
}
