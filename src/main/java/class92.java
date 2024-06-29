import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class92 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "Lha;")
    public static class46 field1712 = class271.method1828("k", -46);

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1715 = 500;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "Lha;")
    public static class46 field1720 = class271.method1828(" )2> <col=00ffff>", -46);

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Lha;")
    private static class46 field1723 = class271.method1828("Prepared sound engine", -46);

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lha;")
    public static class46 field1718 = field1723;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "B")
    public static byte field1724;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Lpi;")
    public static class181 field1721;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "[I")
    public static int[] field1717;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "[I")
    public static int[] field1719;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
    public static int[] field1722;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method717(byte arg0) {
        field1720 = null;
        field1718 = null;
        field1719 = null;
        field1712 = null;
        field1722 = null;
        field1717 = null;
        if (arg0 > -86) {
            method718((int[][]) null, false);
        }
        field1723 = null;
        field1721 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([[IZ)V")
    public static final void method718(int[][] arg0, boolean arg1) {
        class6.field100 = arg0;
        if (!arg1) {
            method719(89, 95, -76);
        }
        field1713++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)Lsi;")
    public static final class52 method719(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class52 var4 = var3.field3598;
            var3.field3598 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BLha;Lha;IILha;)V")
    public static final void method720(byte arg0, class46 arg1, class46 arg2, int arg3, int arg4, class46 arg5) {
        field1714++;
        int var6 = 99;
        if (arg0 != 79) {
            return;
        }
        while (var6 > 0) {
            class155.field2745[var6] = class155.field2745[var6 - 1];
            class113.field2148[var6] = class113.field2148[var6 - 1];
            class233.field4054[var6] = class233.field4054[var6 - 1];
            class2.field32[var6] = class2.field32[var6 - 1];
            class43.field723[var6] = class43.field723[var6 - 1];
            var6--;
        }
        class155.field2745[0] = arg3;
        class43.field723[0] = arg4;
        class29.field574++;
        class126.field2316 = class86.field1635;
        class113.field2148[0] = arg1;
        class233.field4054[0] = arg5;
        class2.field32[0] = arg2;
    }
}
