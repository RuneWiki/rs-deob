import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class425 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5986 = new String[8];

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "B")
    public byte field5993;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public int field5989;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Ljava/lang/String;")
    public String field5987;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Ljava/lang/String;")
    public String field5988;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Ljava/lang/String;")
    public String field5991;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Ljava/lang/String;")
    public String field5992;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
    public static int[] field5990;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method2413(byte arg0) {
        field5986 = null;
        if (arg0 != -31) {
            field5986 = null;
        }
        field5990 = null;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Lws;")
    public static final class326 method2414(byte arg0) {
        if (arg0 != 105) {
            return null;
        }
        field5985++;
        try {
            return (class326) Class.forName("rr").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
