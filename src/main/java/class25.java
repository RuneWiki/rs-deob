import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class25 {

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public int field439 = -1;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Ldc;")
    public static class37 field428 = class185.method1233((byte) 86, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Lsg;")
    public static class203 field432 = new class203();

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public int field437;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLmf;)Z")
    public static final boolean method171(boolean arg0, class136 arg1) {
        field426++;
        if (class168.field3198) {
            if (class107.method699(arg1, 74) != 0) {
                return false;
            }
            if (arg1.field2513 == 0) {
                return false;
            }
        }
        return arg0 ? arg1.field2645 : false;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
    public static void method172(byte arg0) {
        if (arg0 < 116) {
            field432 = null;
        }
        field432 = null;
        field428 = null;
    }
}
