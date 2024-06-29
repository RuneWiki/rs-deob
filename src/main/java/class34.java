import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class34 {

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public static int field480 = -1;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "Lvh;")
    public static class125 field478 = new class125(73, -1);

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "B")
    public byte field483;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "Ljava/lang/String;")
    public String field479;

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "Ljava/lang/String;")
    public String field482;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "Ljava/lang/String;")
    public String field485;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "Ljava/lang/String;")
    public String field486;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)Z")
    public static final boolean method299(int arg0, int arg1, int arg2) {
        if (arg2 > -75) {
            return true;
        } else {
            field484++;
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
    public static void method300(int arg0) {
        if (arg0 != -13937) {
            method300(107);
        }
        field478 = null;
    }
}
