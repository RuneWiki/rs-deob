import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class22 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lbg;")
    public static class19 field311 = new class19();

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lmb;")
    public static class132 field317 = class166.method1092(")2", 113);

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Lmb;")
    private static class132 field316 = class166.method1092("You can(Wt add yourself to your own ignore list)3", 120);

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Lmb;")
    public static class132 field314 = field316;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lj;")
    public static class98 field315;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)I")
    public static final int method148(int arg0, int arg1) {
        field312++;
        if (arg1 != 127) {
            method149((byte) -120);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static void method149(byte arg0) {
        field315 = null;
        field316 = null;
        if (arg0 != 69) {
            field317 = null;
        }
        field314 = null;
        field311 = null;
        field317 = null;
    }
}
