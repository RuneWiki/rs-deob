import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class373 {

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5453 = new String[100];

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "Loe;")
    public static class127 field5452 = new class127(58, -1);

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V", line = 9)
    public static void method2249(boolean arg0) {
        field5452 = null;
        if (arg0) {
            field5453 = null;
        }
    }
}
