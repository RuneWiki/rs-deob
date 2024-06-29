import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class353 extends Exception {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Lea;")
    public static class547 field4710 = new class547(117, 0);

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[C")
    public static char[] field4713 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Llga;")
    public static class712 field4714 = new class712(45, 15);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lpg;")
    public static class733 field4715;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method2046(byte arg0) {
        field4710 = null;
        field4715 = null;
        field4714 = null;
        field4713 = null;
        if (arg0 > -117) {
            field4712 = 109;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static final void method2047(byte arg0) {
        field4711++;
        if (class436.field6123) {
            return;
        }
        class249.field3236 = true;
        class285.field3771 += (12.0F - class285.field3771) / 2.0F;
        class436.field6123 = true;
        if (arg0 != -87) {
            method2047((byte) -86);
        }
    }
}
