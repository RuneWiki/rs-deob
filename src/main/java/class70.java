import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class70 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "Lmi;")
    public static class408 field965 = new class408();

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field967 = -1;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lwe;")
    public static class24 field966 = new class24(64);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Lfi;")
    public static class165 field968;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZLjava/lang/String;ZLud;Z)V")
    public static final void method442(boolean arg0, String arg1, boolean arg2, class2 arg3, boolean arg4) {
        field964++;
        if (arg0) {
            method442(true, (String) null, true, (class2) null, true);
        }
        if (!arg4) {
            class11.method80(arg1, arg3, (byte) -57, 3);
            return;
        }
        if (class2.field17.startsWith("win") && class2.field22 != 3) {
            String var5 = null;
            if (arg3.field29 != null) {
                var5 = arg3.field29.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class296 var6 = class11.method80(arg1, arg3, (byte) -86, 0);
                class161.field2101 = arg3;
                class190.field2652 = var6;
                class313.field4478 = arg1;
                return;
            }
        }
        if (class2.field17.startsWith("mac")) {
            String var7 = null;
            if (arg3.field29 != null) {
                var7 = arg3.field29.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg2) {
                class11.method80(arg1, arg3, (byte) -70, 1);
                return;
            }
        }
        class11.method80(arg1, arg3, (byte) -60, 2);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method443(byte arg0) {
        field965 = null;
        field966 = null;
        field968 = null;
        int var1 = 26 % ((-arg0 - 13) / 56);
    }
}
