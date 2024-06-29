import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class141 {

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Z")
    public static boolean field1957 = true;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1958 = "Loading config - ";

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[Lgj;")
    public static class240[] field1962 = new class240[14];

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field1963 = 0;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1960;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIILhc;)[Lke;")
    public static final class110[] method948(int arg0, int arg1, int arg2, class235 arg3) {
        int var4 = 102 / ((8 - arg2) / 41);
        field1959++;
        return class57.method351(arg3, arg1, arg0, (byte) 110) ? class270.method1784((byte) 61) : null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method949(byte arg0) {
        field1960 = null;
        field1958 = null;
        field1962 = null;
        if (arg0 != 91) {
            field1963 = -124;
        }
    }
}
