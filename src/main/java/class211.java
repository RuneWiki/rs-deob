import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class211 {

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Ler;")
    public static class157 field2971 = new class157(32);

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "[I")
    public static int[] field2972 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field2973 = 1406;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Lqi;")
    public static class466 field2976;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method1455(int arg0) {
        if (arg0 != 3) {
            method1457(-86, -127);
        }
        field2975++;
        for (class309 var1 = (class309) class255.field3530.method1970(64); var1 != null; var1 = (class309) class255.field3530.method1960(24)) {
            if (var1.field4626 == -1) {
                var1.field4631 = 0;
                if (var1.field4623 >= 0 && var1.field4636 >= 0 && class96.field1403 > var1.field4623 && class485.field7122 > var1.field4636) {
                    class109.method718(-1, var1);
                }
            } else {
                var1.method2785((byte) -120);
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static void method1456(boolean arg0) {
        field2971 = null;
        field2976 = null;
        field2972 = null;
        if (!arg0) {
            method1456(true);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)Ljb;")
    public static final class499 method1457(int arg0, int arg1) {
        field2970++;
        int var2 = arg0 >> 16;
        if (arg1 != 6687) {
            return null;
        }
        int var3 = arg0 & 0xFFFF;
        if (class59.field791[var2] == null || class59.field791[var2][var3] == null) {
            boolean var4 = class109.method719((byte) -120, var2);
            if (!var4) {
                return null;
            }
        }
        return class59.field791[var2][var3];
    }
}
