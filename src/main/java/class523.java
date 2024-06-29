import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class523 {

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "Lpk;")
    public class133 field7740 = new class133();

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Z")
    public boolean field7743 = false;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field7738 = 1;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "[I")
    public static int[] field7741 = new int[64];

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public int field7742;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public int field7744;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "Lmg;")
    public static class101 field7739;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Z")
    public static final boolean method3110(int arg0, int arg1, int arg2) {
        if (arg0 == 32) {
            field7737++;
            return (arg2 & 0x20) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static void method3111(int arg0) {
        field7741 = null;
        int var1 = 91 / ((-arg0 - 19) / 57);
        field7739 = null;
    }
}
