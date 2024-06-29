import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[I")
    public static int[] field29 = new int[4096];

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lqk;")
    public static class207 field37;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lqk;")
    public static class207 field39;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lqk;")
    public static class207 field36;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lbf;")
    public static class199 field38;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lqk;")
    private static class207 field40;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lqk;")
    public static class207 field41;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lll;")
    public static class205 field35;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLv;)Lvd;")
    public static final class4 method7(byte arg0, class149 arg1) {
        if (arg0 < 33) {
            field29 = null;
        }
        field28++;
        return new class4(arg1.method1075(65536), arg1.method1075(65536), arg1.method1075(65536), arg1.method1075(65536), arg1.method1065((byte) 82), arg1.method1065((byte) 99), arg1.method1045((byte) -46));
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field40 = null;
        field37 = null;
        field41 = null;
        if (arg0 != -20) {
            return;
        }
        field35 = null;
        field39 = null;
        field38 = null;
        field36 = null;
        field29 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ)I")
    public static final int method9(int arg0, int arg1, boolean arg2) {
        int var3 = arg1 + (arg0 * 57);
        field33++;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        if (!arg2) {
            method8((byte) -106);
        }
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V")
    public static final void method10(byte arg0, int arg1) {
        class231.field4239.method1383(-8052, arg1);
        if (arg0 == -35) {
            field32++;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public static final void method11(int arg0, int arg1) {
        if (arg0 == 30767) {
            class159.field2813 = 1000 / arg1;
            field31++;
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field29[var0] = class119.method850(var0, 2160);
        }
        field37 = class24.method212(255, " ");
        field39 = class24.method212(255, "(U (X");
        field36 = class24.method212(255, "clignotant3:");
        field38 = new class199(64);
        field40 = class24.method212(255, "Connecting to update server");
        field41 = field40;
    }
}
