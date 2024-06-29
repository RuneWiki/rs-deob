import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class249 {

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public int field3774 = -1;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "[[I")
    public static int[][] field3776 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3769 = 0;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "S")
    public static short field3778 = 320;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Laj;")
    public class1 field3767;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "Lbh;")
    public static class288 field3777;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[I")
    public int[] field3775;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field3770;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 8)
    public static void method1786(int arg0) {
        field3777 = null;
        field3776 = (int[][]) null;
        if (arg0 != -17819) {
            field3776 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZJ)V", line = 19)
    public static final void method1787(boolean arg0, long arg1) {
        field3779++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class74.field954 < 100 || class14.field194) || class74.field954 >= 200) {
            class150.method1010(class149.field2063, 0, (byte) -59, "");
            return;
        }
        String var3 = class109.method743(arg1, 1);
        for (int var4 = 0; var4 < class74.field954; var4++) {
            if (class233.field3398[var4] == arg1) {
                class150.method1010(var3 + class152.field2094, 0, (byte) -59, "");
                return;
            }
        }
        for (int var5 = 0; var5 < class96.field1248; var5++) {
            if (class113.field1615[var5] == arg1) {
                class150.method1010(class279.field4327 + var3 + class226.field3226, 0, (byte) -59, "");
                return;
            }
        }
        if (var3.equals(class118.field1664.field1496)) {
            class150.method1010(class253.field3845, 0, (byte) -59, "");
            return;
        }
        class326.field4997++;
        class76.field965[class74.field954] = var3;
        class233.field3398[class74.field954] = arg1;
        class132.field1816[class74.field954] = 0;
        class330.field5039[class74.field954] = "";
        class296.field4619[class74.field954] = 0;
        class154.field2114[class74.field954] = arg0;
        class186.field2686 = class331.field5060;
        class74.field954++;
        class140.field1954.method573(115, 144);
        class140.field1954.method678(arg1, (byte) 105);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I", line = 88)
    public static final int method1788(int arg0, int arg1) {
        if (arg1 == 0) {
            field3772++;
            return arg0 >>> 7;
        } else {
            return 64;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIII)V", line = 104)
    public static final void method1789(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3768++;
        if (class158.field2179 == 1) {
            class243.field3658[class113.field1609 / 100].method531(class287.field4511 - 8, class311.field4821 + -8);
        }
        int var5 = 93 / ((arg4 - 51) / 48);
        if (class158.field2179 == 2) {
            class243.field3658[(class113.field1609 / 100) + 4].method531(class287.field4511 - 8, class311.field4821 + -8);
        }
        class291.method2072(-69);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I", line = 125)
    public static final int method1790(int arg0, int arg1, int arg2, int arg3) {
        field3773++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else if (arg3 == 100) {
            return 1023 - arg1;
        } else {
            return 4;
        }
    }
}
