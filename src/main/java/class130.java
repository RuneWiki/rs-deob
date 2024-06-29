import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class130 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1923 = 50;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1922 = new String[100];

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1924 = 64;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[I")
    public static int[] field1921;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 6)
    public static void method888(byte arg0) {
        field1921 = null;
        field1922 = null;
        if (arg0 <= 63) {
            field1920 = -64;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V", line = 26)
    public static final void method889(boolean arg0) {
        field1919++;
        if (arg0) {
            class218.field3501.method1623(1);
        }
    }
}
