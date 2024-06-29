import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class127 {

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Z")
    public static boolean field2758 = false;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Ldd;")
    private static class35 field2752 = class180.method1196((byte) 126, " from your friend list first)3");

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Ldd;")
    public static class35 field2753 = field2752;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Ldd;")
    private static class35 field2759 = class180.method1196((byte) 126, "Unable to connect)3");

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Ldd;")
    public static class35 field2749 = field2759;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Ldd;")
    public static class35 field2760 = field2759;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public int field2750;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "J")
    public long field2747;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Llc;")
    public class110 field2751;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lag;")
    public static class8 field2757;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method889(int arg0) {
        field2753 = null;
        field2760 = null;
        field2752 = null;
        field2749 = null;
        if (arg0 == -591) {
            field2757 = null;
            field2759 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lag;Lag;Lsc;BLag;)Z")
    public static final boolean method890(class8 arg0, class8 arg1, class173 arg2, byte arg3, class8 arg4) {
        class22.field455 = arg1;
        class122.field2691 = arg4;
        class191.field3852 = arg0;
        if (arg3 == -76) {
            class83.field1920 = arg2;
            field2756++;
            return true;
        } else {
            return false;
        }
    }
}
