import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class92 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field1747 = -1;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "[I")
    public static int[] field1752 = new int[2];

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "[Lia;")
    public static class257[] field1757 = new class257[500];

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "[Lqe;")
    public static class197[] field1758 = new class197[32768];

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "[[I")
    public static int[][] field1750 = new int[104][104];

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lia;")
    public static class257 field1751 = class28.method234(-123, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lia;")
    public static class257 field1756 = class28.method234(125, "(U0a )2 in: ");

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Lia;")
    private static class257 field1759 = class28.method234(83, "Examine");

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Lia;")
    public static class257 field1753 = field1759;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Lak;")
    public static class190 field1754;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Llf;")
    public static class240 field1748;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method679(int arg0) {
        field1752 = null;
        field1753 = null;
        field1750 = null;
        field1748 = null;
        field1751 = null;
        field1756 = null;
        if (arg0 < 120) {
            field1747 = 56;
        }
        field1757 = null;
        field1754 = null;
        field1758 = null;
        field1759 = null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method680(int arg0) {
        class64.field1301.method431(arg0 ^ 0x31A3);
        field1755++;
        class80.field1562.method989(-11937);
        if (arg0 == 104) {
            class203.field3486.method989(-11937);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BLmb;Lmb;)I")
    public static final int method681(byte arg0, class178 arg1, class178 arg2) {
        if (arg0 != 7) {
            return 37;
        }
        int var3 = 0;
        if (arg1.method1207(class50.field1109, (byte) 114)) {
            var3++;
        }
        if (arg1.method1207(class203.field3495, (byte) 124)) {
            var3++;
        }
        if (arg1.method1207(class248.field4293, (byte) -60)) {
            var3++;
        }
        if (arg2.method1207(class50.field1109, (byte) 97)) {
            var3++;
        }
        field1761++;
        if (arg2.method1207(class203.field3495, (byte) -79)) {
            var3++;
        }
        if (arg2.method1207(class248.field4293, (byte) -77)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Ld;")
    public static final class198 method682(boolean arg0, int arg1) {
        field1760++;
        class198 var2 = (class198) class187.field3246.method836(-126, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class151.field2605.method1197(class3.method45((byte) -50, arg1), class256.method1665((byte) 81, arg1), -2);
        class198 var4 = new class198();
        var4.field3347 = arg1;
        if (!arg0) {
            return null;
        }
        if (var3 != null) {
            var4.method1330(new class152(var3), -107);
        }
        var4.method1326((byte) 122);
        class187.field3246.method832(var4, (long) arg1, 0);
        return var4;
    }
}
