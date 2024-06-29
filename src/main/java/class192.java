import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class192 {

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "[I")
    public static int[] field2256 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "[I")
    public static int[] field2257;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V")
    public static void method1184(boolean arg0) {
        field2257 = null;
        field2256 = null;
        if (arg0) {
            field2253 = 77;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)Z")
    public static final boolean method1185(int arg0, int arg1) {
        field2258++;
        if (class184.field2135[arg1]) {
            return true;
        } else if (class365.field4965.method1813(arg0 + 3201, arg1)) {
            int var2 = class365.field4965.method1821(93, arg1);
            if (var2 == 0) {
                class184.field2135[arg1] = true;
                return true;
            }
            if (class362.field4903[arg1] == null) {
                class362.field4903[arg1] = new class453[var2];
            }
            int var3 = 0;
            if (arg0 != -3201) {
                method1184(true);
            }
            while (var2 > var3) {
                if (class362.field4903[arg1][var3] == null) {
                    byte[] var4 = class365.field4965.method1794(5860, arg1, var3);
                    if (var4 != null) {
                        class453 var5 = class362.field4903[arg1][var3] = new class453();
                        var5.field6475 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2806(new class242(var4), 29996);
                    }
                }
                var3++;
            }
            class184.field2135[arg1] = true;
            return true;
        } else {
            return false;
        }
    }
}
