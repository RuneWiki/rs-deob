import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class127 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1958 = 0;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1959 = 0;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "[[I")
    public static int[][] field1966 = new int[5][5000];

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Ln;")
    public static class282 field1967 = new class282(64);

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Lna;")
    public static class26 field1968 = class69.method505("leuchten3:", (byte) -122);

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field1969 = 0;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Lna;")
    public static class26 field1970 = class69.method505("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3", (byte) -124);

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field1971 = 1;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lna;")
    public static class26 field1972 = class69.method505("n", (byte) -124);

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 13)
    public static void method866(int arg0) {
        field1967 = null;
        field1970 = null;
        field1968 = null;
        field1966 = (int[][]) null;
        field1972 = null;
        if (arg0 != 0) {
            field1967 = (class282) null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)I", line = 41)
    public static final int method867(int arg0, boolean arg1) {
        field1964++;
        return arg1 ? -81 : arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V", line = 116)
    public static final void method868(int arg0) {
        field1961++;
        if (arg0 != 22683) {
            method866(43);
        }
        field1967.method1986((byte) -100);
        class67.field1056.method1986((byte) -105);
        class94.field1543.method1986((byte) -101);
        class307.field5292.method1986((byte) -119);
    }
}
