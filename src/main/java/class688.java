import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class688 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field9584 = 0;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field9586 = 0;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)Z")
    public static final boolean method3867(int arg0, int arg1, int arg2) {
        field9585++;
        if (arg1 != 0) {
            method3867(-38, -125, -10);
        }
        if (class278.method1640(arg0, arg2, -2933)) {
            return class517.method3004(arg0, arg2, 9) | (arg0 & 0xB000) != 0 | class730.method4072(true, arg2, arg0) ? true : (class374.method2149(1, arg0, arg2) | class436.method2487(arg0, true, arg2)) & (arg2 & 0x37) == 0;
        } else {
            return false;
        }
    }
}
