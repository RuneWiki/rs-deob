import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class63 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1008 = new String[500];

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1009 = null;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field1011 = 127;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1012 = " has logged in.";

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field1010 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Luf;")
    public static class176 field1013;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method501(byte arg0) {
        field1013 = null;
        if (arg0 == -105) {
            field1012 = null;
            field1009 = null;
            field1008 = null;
        }
    }
}
