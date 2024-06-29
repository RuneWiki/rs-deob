import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class266 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4247 = 100;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Loh;")
    public static class281 field4246 = new class281(100);

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4250 = "skill: ";

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1798(int arg0) {
        field4246 = null;
        field4250 = null;
        if (arg0 != 100) {
            method1799((byte) 41, (String) null, (String) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1799(byte arg0, String arg1, String arg2, String arg3) {
        if (arg0 > -94) {
            field4250 = null;
        }
        field4248++;
        for (int var4 = arg3.indexOf(arg1); var4 != -1; var4 = arg3.indexOf(arg1, var4 + arg2.length())) {
            arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(arg1.length() + var4);
        }
        return arg3;
    }
}
