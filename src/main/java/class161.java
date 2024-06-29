import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class161 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "F")
    public static float field2096;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "[Ll;")
    public static class315[] field2097;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method1078(int arg0) {
        if (arg0 >= -124) {
            method1080((class185) null, (class185) null, (class392) null, -44);
        }
        field2097 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static final void method1079(int arg0) {
        class51 var1 = class163.field2221;
        synchronized (class163.field2221) {
            class163.field2221.method372(121);
        }
        field2100++;
        class51 var2 = class142.field1807;
        synchronized (class142.field1807) {
            if (arg0 != -37) {
                field2096 = 0.70989F;
            }
            class142.field1807.method372(arg0 ^ 0xFFFFFFA1);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lir;Lir;Lqj;I)V")
    public static final void method1080(class185 arg0, class185 arg1, class392 arg2, int arg3) {
        if (arg3 != 36) {
            method1080((class185) null, (class185) null, (class392) null, -86);
        }
        class212.field2889 = arg1;
        field2098++;
        class248.field3551 = arg2;
        class154.field1965 = arg0;
        if (class212.field2889 != null) {
            class93.field1267 = class212.field2889.method1225(1, (byte) 27);
        }
        if (class154.field1965 != null) {
            class125.field1621 = class154.field1965.method1225(1, (byte) 27);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([IZI)V")
    public static final void method1081(int[] arg0, boolean arg1, int arg2) {
        field2095++;
        int var3 = 31;
        if (arg1) {
            field2097 = null;
        }
        while (var3 > 0) {
            int var4 = var3 * 36;
            for (int var5 = 35; var5 > 0; var5--) {
                if (arg0[var5 + var4] == 0 && arg0[var4 + var5 - 37] != 0) {
                    arg0[var4 + var5] = arg2;
                }
            }
            var3--;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1082(String arg0, int arg1) {
        field2102++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class245.method1594(arg0.charAt(var4), true) - var3;
        }
        if (arg1 != -24735) {
            field2096 = -0.94974715F;
        }
        return var3;
    }
}
