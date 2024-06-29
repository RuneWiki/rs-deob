import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class155 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field2979 = 2;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[I")
    public static int[] field2978 = new int[500];

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lsg;")
    private static class169 field2980 = class165.method1060("The server is being updated)3", 1536);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lsg;")
    public static class169 field2982 = field2980;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field2981 = 0;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lsg;")
    public static class169 field2986 = class165.method1060("Sie befinden sich in einem Mitglieder)2Gebiet(Q", 1536);

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2983 = -1;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static void method1011(byte arg0) {
        if (arg0 >= 119) {
            field2986 = null;
            field2980 = null;
            field2982 = null;
            field2978 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static final void method1012(int arg0) {
        if (arg0 >= -21) {
            method1012(45);
        }
        field2984++;
        class105.field1925 = false;
        class133.field2478 = false;
    }
}
