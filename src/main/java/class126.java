import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class126 {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "J")
    public static long field2024 = 0L;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2037 = 0;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2045 = "Take";

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field2023;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field2028;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public int field2032;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public int field2048;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Lrc;")
    public static class67 field2044;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    public static int[] field2022;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILac;I)V")
    public static final void method900(int arg0, int arg1, int arg2, class135 arg3, int arg4) {
        if (arg0 != 0) {
            return;
        }
        field2040++;
        for (class97 var5 = (class97) class247.field3937.method843(arg0 ^ 0x47); var5 != null; var5 = (class97) class247.field3937.method852((byte) 123)) {
            if (var5.field1588 == arg2 && (arg1 * 128) == var5.field1579 && (arg4 * 128) == var5.field1586 && var5.field1598.field2173 == arg3.field2173) {
                if (var5.field1596 != null) {
                    class195.field3123.method1707(var5.field1596);
                    var5.field1596 = null;
                }
                if (var5.field1595 != null) {
                    class195.field3123.method1707(var5.field1595);
                    var5.field1595 = null;
                }
                var5.method1388(-109);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static void method901(boolean arg0) {
        field2044 = null;
        field2022 = null;
        field2045 = null;
        if (!arg0) {
            field2045 = null;
        }
    }
}
