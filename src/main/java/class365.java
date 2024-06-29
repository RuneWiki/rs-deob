import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class365 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[Lvc;")
    public static class291[] field5738 = new class291[128];

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2421(int arg0) {
        field5740++;
        int var1 = 0;
        if (arg0 >= -104) {
            method2421(-57);
        }
        for (int var2 = 0; var2 < class275.field4426; var2++) {
            for (int var3 = 0; var3 < class417.field6374; var3++) {
                if (class210.method1596(class454.field6818, var1, true, var2, var3, 512)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)Ldu;", line = 43)
    public static final class326 method2422(byte arg0, int arg1) {
        field5739++;
        class326 var2 = (class326) class197.field3235.method560(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class314.field4939.method926(0, -128, arg1);
        if (arg0 < 109) {
            return null;
        }
        class326 var4 = new class326();
        if (var3 != null) {
            var4.method2200(new class6(var3), -25524, arg1);
        }
        class197.field3235.method559(var4, (long) arg1, 0);
        return var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V", line = 68)
    public static void method2423(boolean arg0) {
        field5738 = null;
        if (!arg0) {
            method2422((byte) 2, 52);
        }
    }
}
