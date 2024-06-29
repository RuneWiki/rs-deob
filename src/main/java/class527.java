import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class527 {

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "Lbm;")
    public static class637 field6860 = new class637();

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method2811(String arg0, String arg1, boolean arg2, String arg3) {
        field6859++;
        for (int var4 = arg1.indexOf(arg0); var4 != -1; var4 = arg1.indexOf(arg0, var4 + arg3.length())) {
            arg1 = arg1.substring(0, var4) + arg3 + arg1.substring(var4 + arg0.length());
        }
        if (!arg2) {
            method2811(null, null, false, null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
    public static void method2812(int arg0) {
        if (arg0 != 0) {
            field6860 = null;
        }
        field6860 = null;
    }
}
