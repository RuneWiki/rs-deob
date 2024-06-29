import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class254 {

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field3673 = -1;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "[Llr;")
    public static class312[] field3674;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)J")
    public static final synchronized long method1619(boolean arg0) {
        field3671++;
        if (!arg0) {
            method1620((byte) -87, null, -62);
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class619.field8832) {
            class482.field6885 += class619.field8832 - var1;
        }
        class619.field8832 = var1;
        return class482.field6885 + var1;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLpi;I)Z")
    public static final boolean method1620(byte arg0, class302 arg1, int arg2) {
        field3672++;
        class28.field398.method169(arg1.field4239[arg2], arg1.field4226[arg2], arg1.field4238[arg2], class490.field7032);
        int var3 = class490.field7032[2];
        if (arg0 != 42) {
            method1622(true);
        }
        if (var3 < 50) {
            return false;
        } else {
            arg1.field4237[arg2] = (short) (class490.field7032[0] * class314.field4356 / var3 + class520.field7673);
            arg1.field4229[arg2] = (short) (class490.field7032[1] * class452.field6505 / var3 + class683.field9717);
            arg1.field4230[arg2] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lvo;I)V")
    public static final void method1621(class345 arg0, int arg1) {
        if (arg1 != -51) {
            method1621(null, 69);
        }
        field3668++;
        class263.field3787 = arg0;
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(Z)V")
    public static void method1622(boolean arg0) {
        field3674 = null;
        if (arg0) {
            field3674 = null;
        }
    }
}
