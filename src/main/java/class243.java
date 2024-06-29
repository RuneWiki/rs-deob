import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class243 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "[Lwp;")
    public static class245[] field3243 = new class245[4];

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Lwg;")
    public static class282 field3242;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Lhs;")
    public static class420 field3241;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 10)
    public static void method1458(int arg0) {
        field3243 = null;
        field3242 = null;
        if (arg0 == 10) {
            field3241 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;", line = 24)
    public static final String[] method1459(String arg0, char arg1, int arg2) {
        field3240++;
        int var3 = class438.method2756(arg1, (byte) 67, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = arg2; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIILjava/lang/Class;)Lva;", line = 58)
    public static final class55 method1460(int arg0, int arg1, int arg2, Class arg3) {
        class254 var4 = class213.field2852[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class328 var5 = var4.field3515; var5 != null; var5 = var5.field4783) {
            class55 var6 = var5.field4785;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field743 == arg1 && var6.field726 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
