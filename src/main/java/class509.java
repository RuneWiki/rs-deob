import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class509 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Z")
    public static boolean field6784 = true;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Lvga;")
    public static class86 field6780;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 15)
    public static void method2853(int arg0) {
        if (arg0 >= -103) {
            field6780 = null;
        }
        field6780 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 32)
    public static final void method2854(String arg0, byte arg1) {
        if (arg1 != -105) {
            field6780 = null;
        }
        field6783++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class496.method2797(arg0, true);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < client.field4355; var3++) {
            String var4 = class549.field7252[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class496.method2797(var4, true);
            if (var5 != null && var5.equals(var2)) {
                client.field4355--;
                for (int var6 = var3; var6 < client.field4355; var6++) {
                    class549.field7252[var6] = class549.field7252[var6 + 1];
                    class238.field3361[var6] = class238.field3361[var6 + 1];
                    class458.field6255[var6] = class458.field6255[var6 + 1];
                    class88.field1077[var6] = class88.field1077[var6 + 1];
                    class575.field7555[var6] = class575.field7555[var6 + 1];
                    class661.field8720[var6] = class661.field8720[var6 + 1];
                }
                class568.field7467++;
                class241.field3387 = class691.field9630;
                class583 var7 = class381.method2246(arg1 ^ 0xFFFFFF96, class128.field2105, class635.field8449);
                var7.field7637.method3823(-89, class419.method2429(true, arg0));
                var7.field7637.method3795(arg0, (byte) -84);
                class42.method309(var7, arg1 ^ 0xFFFFFF97);
                return;
            }
        }
    }
}
