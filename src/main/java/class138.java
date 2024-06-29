import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class138 {

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[Lbk;")
    public static class211[] field1965 = new class211[2048];

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[C")
    public static char[] field1966 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "[I")
    public static int[] field1968 = new int[1000];

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public int field1962;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 6)
    public static final void method823(byte arg0) {
        field1969++;
        class331 var1 = class369.field5408;
        synchronized (class369.field5408) {
            class369.field5408.method2043(-45);
            int var2 = 8 % ((arg0 + 64) / 53);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIZIBIII)Z", line = 23)
    public static final boolean method824(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        field1957++;
        int var11 = class70.method412(arg8, -64, class390.field5715.method786((byte) 70), arg4, arg6, arg2, class54.field613[class410.field5931], arg9, arg10, arg3, arg1, arg5, class193.field2635, arg0, class382.field5614);
        if (var11 < 1) {
            return false;
        }
        class450.field6576 = class193.field2635[var11 - 1];
        int var12 = 1 % ((-arg7 - 31) / 63);
        class435.field6384 = class382.field5614[var11 - 1];
        class196.field2658 = false;
        class196.method1249(106);
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 44)
    public static void method825(int arg0) {
        field1966 = null;
        if (arg0 > -86) {
            method824(-93, -43, -71, 66, 104, false, -109, (byte) 24, 125, 56, -16);
        }
        field1965 = null;
        field1968 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIILtc;IILen;)V", line = 60)
    public static final void method826(boolean arg0, int arg1, int arg2, class196 arg3, int arg4, int arg5, class174 arg6) {
        field1958++;
        if (arg0) {
            class51.field589.method90((class38.field389 - class51.field589.method52()) / 2, (class222.field3039 - class51.field589.method47()) / 2);
            class32.field302.method90((class38.field389 - class32.field302.method52()) / 2, 18);
        }
        arg3.method1253(119, class222.field3039 / 2 - 26, -1, ~class136.field1912 == -2 ? class180.field2473 : class171.field2394, arg5, class38.field389 / 2);
        int var7 = class222.field3039 / 2 - 18;
        arg6.method958(class38.field389 / 2 - 152, var7, 304, 34, arg1, 0);
        arg6.method958(class38.field389 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg6.method995(class38.field389 / 2 - 150, var7 + 2, class155.field2206 * 3, 30, arg4, 0);
        arg6.method995(class38.field389 / 2 + ((class155.field2206 * 3) - 150), var7 + 2, 300 - (class155.field2206 * 3), 30, 0, 0);
        if (arg2 != -32530) {
            field1968 = null;
        }
        arg3.method1253(121, class222.field3039 / 2 + 4, -1, class132.field1813, arg5, class38.field389 / 2);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V", line = 100)
    public static final void method827(int arg0, byte arg1) {
        field1964++;
        int var2 = 36 / ((33 - arg1) / 53);
        class348 var3 = class385.method2464(5, 1302, arg0);
        var3.method2214((byte) 121);
    }
}
