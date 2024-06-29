import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class class346 {

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "Z")
    public static boolean field4332 = false;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "Z")
    public static boolean field4335 = false;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "Lkq;")
    public static class620 field4334;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method2056(byte arg0, int arg1);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2057(String arg0, byte arg1) {
        field4333++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class87.method803(arg0, false);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg1 != -5) {
            method2057(null, (byte) 90);
        }
        while (class60.field803 > var3) {
            String var4 = class86.field1151[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class87.method803(var4, false);
            if (var5 != null && var5.equals(var2)) {
                class60.field803--;
                for (int var6 = var3; var6 < class60.field803; var6++) {
                    class86.field1151[var6] = class86.field1151[var6 + 1];
                    class645.field8786[var6] = class645.field8786[var6 + 1];
                    class115.field1457[var6] = class115.field1457[var6 + 1];
                    class641.field8755[var6] = class641.field8755[var6 + 1];
                    class119.field1515[var6] = class119.field1515[var6 + 1];
                }
                class462.field6489 = class87.field1156;
                class616.field8282++;
                class336 var7 = class512.method3076(class385.field4924, class591.field8030, (byte) 82);
                var7.field4150.method2353(78, class615.method3482(arg0, 1));
                var7.field4150.method2388(255, arg0);
                class578.method3334(4, var7);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)Lkd;")
    public abstract class298 method2058(byte arg0);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)I")
    public abstract int method2059(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(ZI)V")
    public abstract void method2060(boolean arg0, int arg1);

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
    public static void method2061(boolean arg0) {
        if (!arg0) {
            field4334 = null;
        }
    }
}
