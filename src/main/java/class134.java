import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class134 {

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "Lao;")
    public static class188 field2065 = new class188(39, 6);

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field2067 = 0;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field2069 = 0;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static void method990(int arg0) {
        field2065 = null;
        if (arg0 != 1) {
            field2066 = 17;
        }
    }
}
