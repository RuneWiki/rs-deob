import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class205 extends class99 {

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "Z")
    public static boolean field3512 = true;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "Lr;")
    public static class66 field3510 = class93.method641(43, "leuchten1:");

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "Lqc;")
    public static class245 field3511 = new class245(260);

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "[Ldh;")
    public static class265[] field3515;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(IB)Lig;")
    public static final class190 method1328(int arg0, byte arg1) {
        ++field3513;
        class190 var2 = (class190) class83.field1607.method1617(14366, (long) arg0);
        if (arg1 != -128) {
            return null;
        } else if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class88.field1712.method135(arg0, arg1 + 128, 1);
            class190 var4 = new class190();
            if (var3 != null) {
                var4.method1248(arg1 ^ -128, arg0, new class249(var3));
            }
            class83.field1607.method1615(var4, 119, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
    public static void method1329(byte arg0) {
        field3515 = null;
        if (arg0 != -47) {
            field3511 = null;
        }
        field3511 = null;
        field3510 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field3508;
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int var4 = class19.field261[arg1];
            for (int var5 = 0; ~var5 > ~class199.field3432; ++var5) {
                var3[var5] = this.method1330(-113, var4, class10.field120[var5]) % 4096;
            }
        }
        return arg0 != -61 ? null : var3;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(III)I")
    private final int method1330(int arg0, int arg1, int arg2) {
        ++field3514;
        int var4 = arg1 * 57 + arg2;
        int var5 = -69 % ((arg0 - 4) / 40);
        int var6 = var4 ^ var4 << 1;
        return -((Integer.MAX_VALUE & (var6 * var6 * 15731 + 789221) * var6 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)I")
    public static final int method1331(boolean arg0, int arg1) {
        ++field3509;
        long var2 = class3.method13(17161);
        class151 var4 = arg0 ? (class151) class60.field1017.method1382(-32642) : (class151) class60.field1017.method1386((byte) -118);
        int var5 = 78 / ((-52 - arg1) / 58);
        while (var4 != null) {
            if ((var4.field2708 & 4611686018427387903L) < var2) {
                if ((4611686018427387904L & var4.field2708) != 0L) {
                    int var6 = (int) var4.field1560;
                    class89.field1726[var6] = class214.field3678[var6];
                    var4.method560(-17554);
                    return var6;
                }
                var4.method560(-17554);
            }
            var4 = (class151) class60.field1017.method1386((byte) -108);
        }
        return -1;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class205() {
        super(0, true);
    }
}
