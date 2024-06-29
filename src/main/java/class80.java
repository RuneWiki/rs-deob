import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class80 extends class11 {

    @OriginalMember(owner = "client!nb", name = "Fc", descriptor = "Lv;")
    public static class122 field2084 = class55.method425(-123, "redstone1");

    @OriginalMember(owner = "client!nb", name = "Lc", descriptor = "I")
    public static int field2090 = 0;

    @OriginalMember(owner = "client!nb", name = "Oc", descriptor = "Z")
    public static boolean field2093 = false;

    @OriginalMember(owner = "client!nb", name = "Nc", descriptor = "Lv;")
    public static class122 field2092 = class55.method425(-84, "null");

    @OriginalMember(owner = "client!nb", name = "Gc", descriptor = "[I")
    public static int[] field2085 = new int[128];

    @OriginalMember(owner = "client!nb", name = "Jc", descriptor = "I")
    public static int field2088 = 0;

    @OriginalMember(owner = "client!nb", name = "Ic", descriptor = "Lkd;")
    public static class64 field2087 = new class64(new byte[5000]);

    @OriginalMember(owner = "client!nb", name = "Vc", descriptor = "Lv;")
    private static class122 field2100 = class55.method425(-52, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!nb", name = "Sc", descriptor = "Lv;")
    private static class122 field2097 = class55.method425(-115, "Loaded wordpack");

    @OriginalMember(owner = "client!nb", name = "Wc", descriptor = "Lv;")
    public static class122 field2101 = field2100;

    @OriginalMember(owner = "client!nb", name = "Rc", descriptor = "Lv;")
    public static class122 field2096 = class55.method425(-62, "Cabbage");

    @OriginalMember(owner = "client!nb", name = "Tc", descriptor = "Lv;")
    public static class122 field2098 = field2097;

    @OriginalMember(owner = "client!nb", name = "Uc", descriptor = "I")
    public static int field2099 = 0;

    @OriginalMember(owner = "client!nb", name = "Qc", descriptor = "I")
    public static volatile int field2095 = 0;

    @OriginalMember(owner = "client!nb", name = "Xc", descriptor = "I")
    public static int field2102 = 0;

    @OriginalMember(owner = "client!nb", name = "Ec", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!nb", name = "Hc", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!nb", name = "Mc", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!nb", name = "Pc", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!nb", name = "Kc", descriptor = "Ldb;")
    public class21 field2089;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Llb;", line = 11)
    public final class68 method424(boolean arg0) {
        ++field2086;
        if (this.field2089 == null) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            class89 var2 = ~super.field324 != 0 && ~super.field292 == -1 ? class51.method401(-30325, super.field324) : null;
            class89 var3 = super.field305 == -1 || super.field305 == super.field297 && var2 != null ? null : class51.method401(-30325, super.field305);
            class68 var4 = this.field2089.method225(var2, 88, super.field301, super.field278, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method565();
                super.field300 = var4.field1548;
                if (super.field315 != -1 && ~super.field326 != 0) {
                    class68 var5 = class126.method999((byte) 88, super.field315).method868(super.field326, (byte) -42);
                    if (var5 != null) {
                        var5.method559(0, -super.field286, 0);
                        class68[] var6 = new class68[] { var4, var5 };
                        var4 = new class68(var6, 2, true);
                    }
                }
                if (~this.field2089.field540 == -2) {
                    var4.field1748 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(B)I", line = 55)
    public static final int method663(byte arg0) {
        ++field2094;
        if (arg0 >= -109) {
            method664((byte) -60);
        }
        return field2095++;
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)Z", line = 84)
    public final boolean method112(byte arg0) {
        ++field2091;
        if (arg0 <= 73) {
            field2099 = -76;
        }
        return this.field2089 != null;
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(B)V", line = 107)
    public static void method664(byte arg0) {
        field2084 = null;
        field2087 = null;
        field2101 = null;
        field2100 = null;
        field2096 = null;
        field2097 = null;
        field2085 = null;
        field2092 = null;
        field2098 = null;
        if (arg0 < 123) {
            method664((byte) 69);
        }
    }
}
