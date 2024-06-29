import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class289 {

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "[I")
    public static int[] field3650 = new int[1];

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "Lcga;")
    public static class449 field3653 = new class449(76, 0);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "Lqj;")
    public static class476 field3651;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBLji;)V", line = 3)
    public static final void method1734(int arg0, byte arg1, class572 arg2) {
        if (arg1 != -46) {
            field3654 = -121;
        }
        field3649++;
        if (class509.field6374 == null) {
            return;
        }
        try {
            class509.field6374.method656(-553161560, 0L);
            class509.field6374.method654(arg2.field7318, 24, (byte) -127, arg0);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)I", line = 24)
    public static int method1735(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILjava/lang/String;)V", line = 31)
    public static final void method1736(int arg0, String arg1) {
        field3652++;
        if (!class37.field542) {
            return;
        }
        boolean var2 = false;
        int var3 = class149.field1788;
        int[] var4 = class95.field1239;
        for (int var5 = arg0; var5 < var3; var5++) {
            class365 var6 = class132.field1601[var4[var5]];
            if (var6 != null && class67.field815 != var6 && var6.field4673 != null && var6.field4673.equalsIgnoreCase(arg1)) {
                class24.field272++;
                class124 var7 = class336.method1924(class564.field7045, class636.field8620, (byte) 91);
                var7.field1516.method3080((byte) -59, class194.field2290);
                var7.field1516.method3073(1520, class168.field1978);
                var7.field1516.method3053(true, 0);
                var7.field1516.method3051(true, var4[var5]);
                var7.field1516.method3067(1370571624, class112.field1383);
                class197.method1156((byte) 90, var7);
                var2 = true;
                class472.method2565(-2, true, var6.method210(false), var6.field508[0], false, 0, 0, var6.method210(false), var6.field511[0]);
                break;
            }
        }
        if (!var2) {
            class252.method1521(4, class671.field9135.method3726((byte) 78, class71.field912) + arg1, true);
        }
        if (class37.field542) {
            class167.method1012(118);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V", line = 88)
    public static void method1737(byte arg0) {
        field3651 = null;
        field3653 = null;
        if (arg0 >= 10) {
            field3650 = null;
        }
    }
}
