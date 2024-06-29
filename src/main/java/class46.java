import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class46 extends class249 {

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "Lke;")
    public static class256 field845 = class316.method2202("Cabbage", 27626);

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "Lke;")
    public static class256 field847 = class316.method2202("details", 27626);

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "Lke;")
    public static class256 field844 = class316.method2202("", 27626);

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "Lke;")
    public static class256 field846 = class316.method2202("Bitte entfernen Sie ", 27626);

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "Lke;")
    public static class256 field853 = field844;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "Lke;")
    public static class256 field849 = field844;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "Lke;")
    public static class256 field855 = class316.method2202("_labels", 27626);

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "Lke;")
    private static class256 field852 = class316.method2202("M", 27626);

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "Lke;")
    public static class256 field851 = field852;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "Lke;")
    public static class256 field848 = field852;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V", line = 17)
    public static void method380(byte arg0) {
        if (arg0 != -59) {
            field853 = (class256) null;
        }
        field849 = null;
        field845 = null;
        field847 = null;
        field846 = null;
        field852 = null;
        field851 = null;
        field844 = null;
        field853 = null;
        field855 = null;
        field848 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(JI)V", line = 50)
    public static final void method381(long arg0, int arg1) {
        int var3 = -124 / ((arg1 + 29) / 59);
        field850++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class243.method1638(arg0 - 1L, false);
            class243.method1638(1L, false);
        } else {
            class243.method1638(arg0, false);
        }
    }
}
