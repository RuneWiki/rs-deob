import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class119 {

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public int field2042;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public int field2045;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lid;")
    private static class149 field2031 = class60.method382("Jan", (byte) 85);

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lid;")
    public static class149 field2039 = class60.method382("Choisir une option", (byte) 115);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "[I")
    public static int[] field2032 = new int[4096];

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lid;")
    public static class149 field2036 = class60.method382("Mem:", (byte) 18);

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lid;")
    private static class149 field2044 = class60.method382("Jun", (byte) 75);

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Lid;")
    private static class149 field2043 = class60.method382("Sep", (byte) 13);

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lid;")
    private static class149 field2034 = class60.method382("Nov", (byte) 48);

    @OriginalMember(owner = "client!u", name = "p", descriptor = "Lid;")
    private static class149 field2046 = class60.method382("Jul", (byte) 126);

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "Lid;")
    private static class149 field2049 = class60.method382("Mar", (byte) 95);

    @OriginalMember(owner = "client!u", name = "r", descriptor = "[I")
    public static int[] field2048 = new int[50];

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Lid;")
    private static class149 field2050 = class60.method382("Aug", (byte) 72);

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lid;")
    private static class149 field2035 = class60.method382("Dec", (byte) 63);

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Lid;")
    private static class149 field2051 = class60.method382("May", (byte) 98);

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lid;")
    private static class149 field2040 = class60.method382("Apr", (byte) 103);

    @OriginalMember(owner = "client!u", name = "w", descriptor = "Lid;")
    private static class149 field2053 = class60.method382("Feb", (byte) 21);

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Lid;")
    private static class149 field2052 = class60.method382("Oct", (byte) 51);

    @OriginalMember(owner = "client!u", name = "g", descriptor = "[Lid;")
    public static class149[] field2037 = new class149[] { field2031, field2053, field2049, field2040, field2051, field2044, field2046, field2050, field2043, field2052, field2034, field2035 };

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)V")
    public abstract void method187(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILal;I)Lsi;")
    public static final class198 method820(int arg0, class230 arg1, int arg2) {
        if (arg2 <= 88) {
            return null;
        } else {
            field2033++;
            return class39.method226(arg1, arg0, 104) ? class269.method1873((byte) 120) : null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB)V")
    public abstract void method188(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(III)V")
    public class119(int arg0, int arg1, int arg2) {
        this.field2038 = arg1;
        this.field2042 = arg2;
        this.field2045 = arg0;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method821(byte arg0) {
        field2052 = null;
        field2040 = null;
        field2037 = null;
        field2044 = null;
        field2032 = null;
        field2031 = null;
        field2043 = null;
        field2034 = null;
        field2051 = null;
        field2049 = null;
        field2046 = null;
        field2039 = null;
        field2048 = null;
        field2036 = null;
        field2053 = null;
        field2035 = null;
        if (arg0 > -83) {
            field2051 = null;
        }
        field2050 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(BII)V")
    public abstract void method186(byte arg0, int arg1, int arg2);
}
