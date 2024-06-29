import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class54 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field910 = new String[100];

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field911 = -1;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 7)
    public static void method445(int arg0) {
        field910 = null;
        if (arg0 != 239811558) {
            method445(-57);
        }
    }
}
