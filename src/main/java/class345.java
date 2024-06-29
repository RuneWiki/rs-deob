import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class345 {

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4681 = "cyan:";

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 3)
    public static void method2185(int arg0) {
        if (arg0 != 0) {
            method2187(105);
        }
        field4681 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)Lam;", line = 21)
    public static final class287 method2186(int arg0, byte arg1) {
        field4679++;
        class287 var2 = (class287) class42.field636.method361((long) arg0, (byte) 68);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class177.field2616.method2633(arg0, -1, 11);
        if (arg1 < 38) {
            method2187(-87);
        }
        class287 var4 = new class287();
        if (var3 != null) {
            var4.method1812(new class289(var3), (byte) -57);
        }
        class42.field636.method360(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V", line = 46)
    public static final void method2187(int arg0) {
        class213.field2966 = arg0;
        for (int var1 = 0; var1 < class368.field5054; var1++) {
            for (int var2 = 0; var2 < class16.field190; var2++) {
                if (class118.field1653[arg0][var1][var2] == null) {
                    class118.field1653[arg0][var1][var2] = new class224(arg0, var1, var2);
                }
            }
        }
    }
}
