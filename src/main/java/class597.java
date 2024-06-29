import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class597 extends class349 {

    @OriginalMember(owner = "client!wca", name = "D", descriptor = "Lcb;")
    public static class318 field8168 = new class318(39, 0);

    @OriginalMember(owner = "client!wca", name = "H", descriptor = "I")
    public static int field8172 = 0;

    @OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!wca", name = "E", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!wca", name = "F", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!wca", name = "G", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        int var3 = 100 % ((arg0 - 56) / 41);
        field8169++;
        return class29.field283;
    }

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "(B)V")
    public static void method3306(byte arg0) {
        if (arg0 < 32) {
            field8168 = null;
        }
        field8168 = null;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3307(int arg0, String arg1) {
        field8170++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class303.method1825(arg1, 1);
        if (var2 == null || arg0 > -16) {
            return;
        }
        for (int var3 = 0; var3 < class110.field1323; var3++) {
            String var4 = class320.field4711[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class303.method1825(var4, 1);
            if (var5 != null && var5.equals(var2)) {
                class110.field1323--;
                for (int var6 = var3; var6 < class110.field1323; var6++) {
                    class320.field4711[var6] = class320.field4711[var6 + 1];
                    class248.field3335[var6] = class248.field3335[var6 + 1];
                    class314.field4515[var6] = class314.field4515[var6 + 1];
                    class383.field5573[var6] = class383.field5573[var6 + 1];
                    class47.field647[var6] = class47.field647[var6 + 1];
                    class598.field8189[var6] = class598.field8189[var6 + 1];
                }
                class309.field4142 = class141.field1800;
                class103.field1252++;
                class389.method2326((byte) 118, class49.field661);
                class253.field3491.method951((byte) -82, class500.method2820(1, arg1));
                class253.field3491.method905(arg1, -34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
    public class597() {
        super(0, true);
    }
}
