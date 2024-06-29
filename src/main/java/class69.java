import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class69 {

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1146 = "";

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Z")
    public static boolean field1139 = false;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1148 = "Ok";

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "[I")
    public static int[] field1151 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "S")
    public short field1147;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Z")
    public boolean field1142;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Z")
    public boolean field1143;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
    public boolean field1149;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Z")
    public boolean field1150;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method479(int arg0) {
        field1151 = null;
        field1148 = null;
        field1146 = null;
        if (arg0 < 8) {
            method480((byte) 58);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Llk;")
    public static final class189 method480(byte arg0) {
        if (arg0 != -5) {
            return null;
        }
        field1141++;
        try {
            return (class189) Class.forName("kl").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
