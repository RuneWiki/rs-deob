import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class357 {

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lep;")
    public static class146 field5232 = new class146();

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field5234 = 3;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public static final void method2342(boolean arg0) {
        field5233++;
        if (class310.field4436 != null) {
            class411 var1 = class310.field4436;
            synchronized (class310.field4436) {
                class310.field4436 = null;
            }
        }
        if (!arg0) {
            method2344(false);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILqj;I)Lm;")
    public static final class180 method2343(int arg0, int arg1, class238 arg2, int arg3) {
        field5235++;
        byte[] var4 = arg2.method1472(arg1, arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            if (arg3 != 1) {
                method2345(29);
            }
            return new class180(var4);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
    public static void method2344(boolean arg0) {
        if (arg0) {
            field5232 = null;
        }
        field5232 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Z")
    public static final boolean method2345(int arg0) {
        field5231++;
        if (arg0 != 0) {
            field5234 = 88;
        }
        return class447.field6506;
    }
}
