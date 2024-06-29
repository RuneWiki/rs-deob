import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class173 {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Z")
    public static boolean field3032 = true;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Lsb;")
    private static class98 field3033 = class47.method368("Loaded wordpack", 0);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lsb;")
    public static class98 field3028 = field3033;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lvf;")
    public static class48 field3031 = new class48();

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Lsb;")
    public static class98 field3036 = class47.method368("sl_arrows", 0);

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "[[B")
    public static byte[][] field3034 = new byte[1000][];

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3035 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1219(byte arg0) {
        field3034 = null;
        field3031 = null;
        field3033 = null;
        field3035 = null;
        field3036 = null;
        if (arg0 != 123) {
            method1219((byte) -128);
        }
        field3028 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)I")
    public static final int method1220(int arg0, byte arg1) {
        field3029++;
        if (arg1 > -79) {
            method1219((byte) 116);
        }
        return arg0 >>> 7;
    }
}
