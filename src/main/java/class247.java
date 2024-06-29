import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class247 extends class472 {

    @OriginalMember(owner = "client!tr", name = "I", descriptor = "I")
    public static int field3699 = 0;

    @OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!tr", name = "J", descriptor = "I")
    public int field3700;

    @OriginalMember(owner = "client!tr", name = "M", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "Leg;")
    public class34 field3695;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "Lvq;")
    public static class357 field3693;

    @OriginalMember(owner = "client!tr", name = "L", descriptor = "Ljava/lang/String;")
    public String field3702;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "[I")
    public static int[] field3692;

    @OriginalMember(owner = "client!tr", name = "N", descriptor = "[I")
    public int[] field3704;

    @OriginalMember(owner = "client!tr", name = "P", descriptor = "[I")
    public int[] field3706;

    @OriginalMember(owner = "client!tr", name = "K", descriptor = "[Ldk;")
    public static class424[] field3701;

    @OriginalMember(owner = "client!tr", name = "O", descriptor = "[Lvg;")
    public class56[] field3705;

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field3694;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)V", line = 10)
    public static final void method1664(byte arg0) {
        field3697++;
        if (arg0 > 11) {
            class491.field7199 = true;
        }
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)V", line = 22)
    public static void method1665(byte arg0) {
        if (arg0 != 108) {
            method1664((byte) 58);
        }
        field3701 = null;
        field3693 = null;
        field3692 = null;
    }
}
