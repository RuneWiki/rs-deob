import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class736 extends Exception {

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Loo;")
    public static class652 field10159 = new class652(4);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 3)
    public static void method4100(int arg0) {
        field10159 = null;
        if (arg0 < 1) {
            method4101(false, null, '\r');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLjava/lang/String;C)I", line = 18)
    public static final int method4101(boolean arg0, String arg1, char arg2) {
        field10158++;
        int var3 = 0;
        if (!arg0) {
            field10159 = null;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg1.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }
}
