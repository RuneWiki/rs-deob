import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class156 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Loh;")
    public static class263 field2800 = class253.method1681(-121, "blinken1:");

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Loh;")
    public static class263 field2804 = class253.method1681(-127, "loginscreen");

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Z")
    public static boolean field2806 = false;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field2808 = 0;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "[Loh;")
    public static class263[] field2811 = new class263[500];

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Ltf;")
    public static class104 field2803;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "Lue;")
    public static class86 field2807;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1020(byte arg0) {
        field2803 = null;
        if (arg0 != -107) {
            method1022(-33, (class263) null);
        }
        field2807 = null;
        field2804 = null;
        field2800 = null;
        field2811 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Z")
    public static final boolean method1021(int arg0) {
        if (arg0 != 222) {
            method1021(61);
        }
        field2805++;
        try {
            return class239.method1596((byte) 127);
        } catch (IOException var4) {
            class108.method722(arg0 ^ 0x92A6A916);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class252.field4386 + "," + class131.field2403 + "," + class272.field4790 + " - " + class36.field826 + "," + (class229.field4018.field4714[0] + class93.field1844) + "," + (class142.field2596 + class229.field4018.field4713[0]) + " - ";
            for (int var3 = 0; class36.field826 > var3 && var3 < 50; var3++) {
                var2 = var2 + class189.field3394.field3469[var3] + ",";
            }
            class137.method899(var5, var2, 46);
            class164.method1083((byte) -124);
            return true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILoh;)V")
    public static final void method1022(int arg0, class263 arg1) {
        field2801++;
        int var2 = -87 / ((arg0 + 28) / 60);
        for (class184 var3 = (class184) class195.field3534.method1878(true); var3 != null; var3 = (class184) class195.field3534.method1881(109)) {
            if (var3.field3321.method1788(-26006, arg1)) {
                class230.field4033 = var3;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lnj;III)V")
    public static final void method1023(class139 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class254.field4425) {
            class2 var4 = class18.field417[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field52 != null && var4.field52.field3002.method905()) {
                arg0.method909(var4.field52.field3002, 128, 0, 0, true);
            }
        }
        if (arg3 < class254.field4425) {
            class2 var5 = class18.field417[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field52 != null && var5.field52.field3002.method905()) {
                arg0.method909(var5.field52.field3002, 0, 0, 128, true);
            }
        }
        if (arg2 < class254.field4425 && arg3 < class85.field1678) {
            class2 var6 = class18.field417[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field52 != null && var6.field52.field3002.method905()) {
                arg0.method909(var6.field52.field3002, 128, 0, 128, true);
            }
        }
        if (arg2 < class254.field4425 && arg3 > 0) {
            class2 var7 = class18.field417[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field52 != null && var7.field52.field3002.method905()) {
                arg0.method909(var7.field52.field3002, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static final void method1024(int arg0) {
        field2809++;
        if (arg0 >= -21) {
            field2811 = null;
        }
        if (class262.field4563.toLowerCase().indexOf("microsoft") != -1) {
            class75.field1551[223] = 28;
            class75.field1551[220] = 74;
            class75.field1551[221] = 43;
            class75.field1551[219] = 42;
            class75.field1551[191] = 73;
            class75.field1551[192] = 58;
            class75.field1551[222] = 59;
            class75.field1551[187] = 27;
            class75.field1551[188] = 71;
            class75.field1551[190] = 72;
            class75.field1551[189] = 26;
            class75.field1551[186] = 57;
            return;
        }
        class75.field1551[59] = 57;
        class75.field1551[93] = 43;
        class75.field1551[92] = 74;
        class75.field1551[47] = 73;
        class75.field1551[46] = 72;
        if (class262.field4566 == null) {
            class75.field1551[222] = 59;
            class75.field1551[192] = 58;
        } else {
            class75.field1551[520] = 59;
            class75.field1551[222] = 58;
            class75.field1551[192] = 28;
        }
        class75.field1551[61] = 27;
        class75.field1551[91] = 42;
        class75.field1551[44] = 71;
        class75.field1551[45] = 26;
    }
}
