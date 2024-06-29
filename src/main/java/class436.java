import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class436 {

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Luf;")
    public static class380 field5815 = new class380(4);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "[Lf;")
    public static class532[] field5813;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIZ)Z", line = 3)
    public static final boolean method2467(int arg0, int arg1, boolean arg2) {
        field5811++;
        if (arg2) {
            return true;
        } else {
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V", line = 20)
    public static void method2468(byte arg0) {
        field5813 = null;
        field5815 = null;
        if (arg0 != 38) {
            method2469((byte) -89, null, null, null, null);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLlfa;Lga;Lga;Lga;)Z", line = 31)
    public static final boolean method2469(byte arg0, class51 arg1, class332 arg2, class332 arg3, class332 arg4) {
        field5816++;
        if (arg0 != 109) {
            return false;
        }
        class215.field2828 = arg3;
        class25.field318 = arg2;
        class174.field2475 = arg4;
        class16.field217 = arg1;
        return true;
    }
}
