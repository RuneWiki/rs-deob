import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lu;")
    private static class135 field1961 = class87.method676((byte) -92, "To");

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lu;")
    public static class135 field1967 = class87.method676((byte) -121, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lu;")
    private static class135 field1969 = class87.method676((byte) -60, "This computers address has been blocked");

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lu;")
    public static class135 field1966 = field1969;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "Lu;")
    public static class135 field1962 = class87.method676((byte) -57, "title)3jpg");

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1963 = 0;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lu;")
    public static class135 field1971 = field1961;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lu;")
    public static class135 field1964 = class87.method676((byte) -42, "(U5");

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field1975 = 0;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Lu;")
    private static class135 field1974 = class87.method676((byte) -118, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lu;")
    private static class135 field1978 = class87.method676((byte) -94, "Your account has been disabled)3");

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field1977 = 0;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lu;")
    public static class135 field1968 = field1974;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lu;")
    public static class135 field1972 = field1978;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Lre;")
    public static class122 field1973;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lg;")
    public static class43 field1976;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method644(int arg0) {
        field1964 = null;
        field1962 = null;
        field1973 = null;
        if (arg0 != 0) {
            method644(-68);
        }
        field1968 = null;
        field1974 = null;
        field1978 = null;
        field1966 = null;
        field1976 = null;
        field1972 = null;
        field1967 = null;
        field1971 = null;
        field1961 = null;
        field1969 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static final void method645(byte arg0) {
        field1970++;
        try {
            if (arg0 <= -6) {
                Graphics var1 = class59.field1484.getGraphics();
                class126.field3008.method94(-17740, 4, var1, 4);
            }
        } catch (Exception var2) {
            class59.field1484.repaint();
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public static final void method646(int arg0) {
        try {
            Graphics var1 = class59.field1484.getGraphics();
            class94.field2269.method94(-17740, 205, var1, 553);
        } catch (Exception var2) {
            class59.field1484.repaint();
        }
        if (arg0 == 4) {
            field1965++;
        }
    }
}
