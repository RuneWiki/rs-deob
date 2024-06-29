import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class119 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lqd;")
    public static class173 field1904 = new class173(8);

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1907 = -1;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
    public static int[] field1909 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!i", name = "h", descriptor = "Z")
    public static boolean field1908 = false;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1911 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZBIZ)Ldk;")
    public static final class251 method840(boolean arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        int var5 = 104 % ((-arg2 - 71) / 39);
        class25 var6 = null;
        if (class227.field3665 != null) {
            var6 = new class25(arg3, class227.field3665, class253.field4074[arg3], 1000000);
        }
        class296.field4735[arg3] = class198.field3191.method1225(arg3, -29, var6, class78.field1293);
        if (arg1) {
            class296.field4735[arg3].method207(95);
        }
        field1912++;
        return new class251(class296.field4735[arg3], arg4, arg0);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public static final void method841(int arg0, int arg1) {
        field1906++;
        class78.field1297.method1262(arg1, 2736);
        class130.field2039.method1262(arg1, 2736);
        class53.field896.method1262(arg1, 2736);
        if (arg0 != -3016) {
            field1911 = -5;
        }
        class90.field1471.method1262(arg1, 2736);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method842(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class195.field3155[var1] = false;
        }
        class13.field139 = -1;
        class120.field1919 = 5;
        class161.field2551 = 0;
        field1905++;
        if (arg0 < 50) {
            method843(-42, (byte) 24);
        }
        class299.field4796 = 0;
        class264.field4238 = -1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
    public static final void method843(int arg0, byte arg1) {
        if (arg1 == 59) {
            field1902++;
            class198.field3184.method1262(arg0, 2736);
            class104.field1665.method1262(arg0, 2736);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public static void method844(boolean arg0) {
        field1909 = null;
        field1904 = null;
        if (arg0) {
            method841(-74, -27);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)V")
    public static final void method845(boolean arg0, int arg1) {
        for (class107 var2 = (class107) class237.field3809.method1643((byte) 101); var2 != null; var2 = (class107) class237.field3809.method1642((byte) 87)) {
            if (var2.field1699 != null) {
                class6.field68.method1594(var2.field1699);
                var2.field1699 = null;
            }
            if (var2.field1715 != null) {
                class6.field68.method1594(var2.field1715);
                var2.field1715 = null;
            }
            var2.method913(-3542);
        }
        int var3 = -111 % ((arg1 + 21) / 61);
        if (arg0) {
            for (class107 var4 = (class107) class267.field4298.method1643((byte) 112); var4 != null; var4 = (class107) class267.field4298.method1642((byte) 111)) {
                if (var4.field1699 != null) {
                    class6.field68.method1594(var4.field1699);
                    var4.field1699 = null;
                }
                var4.method913(-3542);
            }
            for (class107 var5 = (class107) class234.field3763.method1063(-117); var5 != null; var5 = (class107) class234.field3763.method1055(18178)) {
                if (var5.field1699 != null) {
                    class6.field68.method1594(var5.field1699);
                    var5.field1699 = null;
                }
                var5.method913(-3542);
            }
        }
        field1901++;
    }
}
