import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class457 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field6679 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field6680 = new String[100];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lof;")
    public static class438 field6678 = new class438("LOCAL", 4);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 22)
    public static void method2691(int arg0) {
        if (arg0 == 100) {
            field6678 = null;
            field6680 = null;
        }
    }
}
