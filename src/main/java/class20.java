import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class20 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lbd;")
    private static class162 field318 = class17.method142(0, "purple:");

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lbd;")
    public static class162 field326 = field318;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "S")
    public static short field317 = 256;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lbd;")
    public static class162 field328 = class17.method142(0, "T");

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lbd;")
    public static class162 field329 = field318;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lpc;")
    public class87 field320;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "[I")
    public int[] field327;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 4)
    public static void method178(byte arg0) {
        field328 = null;
        field318 = null;
        if (arg0 > 0) {
            field326 = null;
            field329 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Z", line = 19)
    public static final boolean method179(int arg0, int arg1) {
        field323++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg0 < ~arg1 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILsi;III)V", line = 52)
    public static final void method180(int arg0, class311 arg1, int arg2, int arg3, int arg4) {
        field325++;
        if (arg0 != -10583) {
            field329 = (class162) null;
        }
        for (class64 var5 = (class64) class149.field2678.method169(-121); var5 != null; var5 = (class64) class149.field2678.method165((byte) -101)) {
            if (var5.field1011 == arg2 && (arg3 * 128) == var5.field1006 && (arg4 * 128) == var5.field1021 && var5.field1017.field5219 == arg1.field5219) {
                if (var5.field1003 != null) {
                    class313.field5290.method449(var5.field1003);
                    var5.field1003 = null;
                }
                if (var5.field1016 != null) {
                    class313.field5290.method449(var5.field1016);
                    var5.field1016 = null;
                }
                var5.method1183(false);
                return;
            }
        }
    }
}
