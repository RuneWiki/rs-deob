import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class98 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[Lre;")
    public static class446[] field1400;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field1399;

    static {
        new class422("", 76);
        field1400 = new class446[2048];
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 19)
    public static void method763(int arg0) {
        field1400 = null;
        if (arg0 != -16762) {
            field1400 = null;
        }
    }
}
