import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class35 {

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field569 = 0;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Lgi;")
    public static class164 field566;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lkc;")
    public static class301 field564;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method257(int arg0) {
        if (arg0 == 95) {
            field566 = null;
            field564 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V")
    public static final void method258(String arg0, String arg1, int arg2, String arg3, int arg4, int arg5) {
        field565++;
        for (int var6 = 99; var6 > 0; var6--) {
            class232.field3633[var6] = class232.field3633[var6 - 1];
            class12.field240[var6] = class12.field240[var6 - 1];
            class232.field3627[var6] = class232.field3627[var6 - 1];
            class186.field3065[var6] = class186.field3065[var6 - 1];
            class310.field5018[var6] = class310.field5018[var6 - 1];
        }
        if (arg5 != -1) {
            method258((String) null, (String) null, -99, (String) null, 15, 15);
        }
        class12.field240[0] = arg3;
        class232.field3627[0] = arg0;
        class232.field3633[0] = arg4;
        class310.field5018[0] = arg2;
        class186.field3065[0] = arg1;
        class240.field3747++;
        class244.field3869 = class68.field1083;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lrg;I)Z")
    public static final boolean method259(class248 arg0, int arg1) {
        field563++;
        if (arg0.field4020 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field4020.length; var2++) {
            int var3 = class188.method1327(1110088615, var2, arg0);
            int var4 = arg0.field3966[var2];
            if (arg0.field4020[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field4020[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field4020[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg1 != -4) {
            field567 = 2;
        }
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(JB)V")
    public static final void method260(long arg0, byte arg1) {
        class311.field5027.field4458 = 0;
        field570++;
        class311.field5027.method1865(21, -128);
        class311.field5027.method1840((byte) 47, arg0);
        class31.field530 = 0;
        class112.field1719 = 1;
        class24.field444 = -3;
        class72.field1150 = 0;
        if (arg1 != -50) {
            method261(-42);
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public static final void method261(int arg0) {
        if (arg0 < 92) {
            field566 = null;
        }
        field568++;
        class146.field2336.method1876((byte) 126);
        class50.field727.method1876((byte) 122);
    }
}
