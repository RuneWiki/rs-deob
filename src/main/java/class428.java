import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class428 {

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "[[Ljava/lang/String;")
    public static String[][] field5975 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "Lee;")
    public static class506 field5976;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "[Lvs;")
    public static class532[] field5974;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V", line = 8)
    public static void method2577(byte arg0) {
        field5975 = null;
        field5976 = null;
        field5974 = null;
        if (arg0 != 91) {
            field5975 = null;
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method2578(int arg0, int arg1, int arg2) {
        if (arg0 > -44) {
            method2578(24, -42, 110);
        }
        field5977++;
        return (arg2 & 0x800) != 0;
    }
}
