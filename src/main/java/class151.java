import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class151 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2426 = 500;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 7)
    public static final String method978(byte arg0, String arg1, String arg2, String arg3) {
        field2425++;
        if (arg0 == -42) {
            for (int var4 = arg2.indexOf(arg3); var4 != -1; var4 = arg2.indexOf(arg3, arg1.length() + var4)) {
                arg2 = arg2.substring(0, var4) + arg1 + arg2.substring(arg3.length() + var4);
            }
            return arg2;
        } else {
            return null;
        }
    }
}
