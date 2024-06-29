import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class480 extends class589 {

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field6742 = 1338;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "Lvba;")
    public static class45 field6741 = new class45();

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "Ljb;")
    public static class519 field6747 = new class519(59, 6);

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
    public int field6738;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public int field6743;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
    public int field6744;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
    public int field6746;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "J")
    public static long field6748;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "Lqba;")
    public class425 field6739;

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "Lob;")
    public static class768 field6740;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2830(int arg0, boolean arg1) {
        if (!arg1) {
            method2831(77);
        }
        field6737++;
        if (arg0 == 25 || arg0 == 53 || arg0 == 6 || arg0 == 60 || arg0 == 1008) {
            return true;
        } else {
            return arg0 == 4 || arg0 == 1012;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
    public static void method2831(int arg0) {
        if (arg0 <= 95) {
            field6742 = -104;
        }
        field6741 = null;
        field6747 = null;
        field6740 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2832(int arg0, int arg1, byte arg2) {
        int var3 = 101 / ((arg2 + 23) / 33);
        field6745++;
        return (arg0 & 0x180) != 0;
    }
}
