import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class546 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 7)
    public static final void method3283(boolean arg0, String arg1) {
        field7934++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class136.method973(10149, arg1);
        if (!arg0) {
            method3284(null, false);
        }
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class365.field5352; var3++) {
            String var4 = class716.field10113[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class136.method973(10149, var4);
            if (var5 != null && var5.equals(var2)) {
                class365.field5352--;
                for (int var6 = var3; var6 < class365.field5352; var6++) {
                    class716.field10113[var6] = class716.field10113[var6 + 1];
                    class11.field101[var6] = class11.field101[var6 + 1];
                    class751.field10462[var6] = class751.field10462[var6 + 1];
                    class667.field9525[var6] = class667.field9525[var6 + 1];
                    class363.field5308[var6] = class363.field5308[var6 + 1];
                }
                class530.field7726++;
                class363.field5307 = class152.field2225;
                class88 var7 = class448.method2741((byte) 108, class640.field9108, class583.field8319);
                var7.field1260.method2881(class231.method1605((byte) 44, arg1), (byte) 125);
                var7.field1260.method2902(arg1, false);
                class523.method3183(var7, (byte) 31);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lsl;Z)Lqo;", line = 72)
    public static final class642 method3284(class479 arg0, boolean arg1) {
        field7933++;
        if (!arg1) {
            method3284(null, true);
        }
        return new class642(arg0.method2870(-11395), arg0.method2870(-11395), arg0.method2870(-11395), arg0.method2870(-11395), arg0.method2865(255), arg0.method2865(255), arg0.method2886(true));
    }
}
