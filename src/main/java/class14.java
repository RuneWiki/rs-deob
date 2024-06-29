import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 extends class20 {

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "Z")
    public static boolean field267 = false;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "Lsc;")
    private static class128 field269 = class129.method1017(false, "Unable to connect)3");

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "Lsc;")
    public static class128 field264 = field269;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "[I")
    public static int[] field277 = new int[2000];

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "Z")
    public static boolean field278 = false;

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "Lsc;")
    private static class128 field279 = class129.method1017(false, "Use");

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "Lsc;")
    public static class128 field273 = field279;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "Lsc;")
    public static class128 field280 = class129.method1017(false, "Einloggen");

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field275 = 10;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "Lsc;")
    public static class128 field281 = field269;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "Ljava/util/Calendar;")
    public static Calendar field276 = Calendar.getInstance();

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static int field282 = 0;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "B")
    public static byte field283 = 0;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "Lrb;")
    public static class120 field284 = new class120(260);

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Lsc;")
    public class128 field265;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)Lnc;")
    public static final class93 method145(boolean arg0, int arg1) {
        class93 var2 = (class93) class153.field3516.method917((long) arg1, -1);
        field274++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class54.field1198.method1023(arg1, 8, (byte) -35);
        if (arg0) {
            method149(true, 26, null);
        }
        class93 var4 = new class93();
        if (var3 != null) {
            var4.method727(new class86(var3), -1);
        }
        class153.field3516.method913((long) arg1, var4, (byte) 87);
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(BLhe;)Z")
    public static final boolean method146(byte arg0, class54 arg1) {
        int var2 = arg1.field1078;
        field271++;
        if (var2 == 205) {
            class12.field193 = 250;
            return true;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class135.field3182.method538(var3, var4 == 1, -119);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class135.field3182.method537(var5, 28160, var6 == 1);
        }
        if (var2 == 324) {
            class135.field3182.method539(83, false);
        }
        if (var2 == 325) {
            class135.field3182.method539(-91, true);
        }
        if (arg0 < 117) {
            method150(true);
        }
        if (var2 == 326) {
            class152.field3502.method507(-105, 186);
            class31.field607++;
            class135.field3182.method540(3070, class152.field3502);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
    public static void method147(int arg0) {
        field276 = null;
        field273 = null;
        field281 = null;
        field279 = null;
        field269 = null;
        field280 = null;
        field277 = null;
        field284 = null;
        field264 = null;
        int var1 = -11 / ((arg0 + 76) / 37);
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public static final void method148(int arg0) {
        field270++;
        if (arg0 != 43) {
            method149(true, -62, null);
        }
        if (class10.field173.toLowerCase().indexOf("microsoft") != -1) {
            class2.field22[220] = 74;
            class2.field22[190] = 72;
            class2.field22[189] = 26;
            class2.field22[222] = 59;
            class2.field22[187] = 27;
            class2.field22[186] = 57;
            class2.field22[188] = 71;
            class2.field22[219] = 42;
            class2.field22[191] = 73;
            class2.field22[192] = 58;
            class2.field22[223] = 28;
            class2.field22[221] = 43;
            return;
        }
        if (class10.field166 == null) {
            class2.field22[192] = 58;
            class2.field22[222] = 59;
        } else {
            class2.field22[192] = 28;
            class2.field22[222] = 58;
            class2.field22[520] = 59;
        }
        class2.field22[45] = 26;
        class2.field22[46] = 72;
        class2.field22[93] = 43;
        class2.field22[47] = 73;
        class2.field22[61] = 27;
        class2.field22[92] = 74;
        class2.field22[59] = 57;
        class2.field22[44] = 71;
        class2.field22[91] = 42;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZILmc;)Lsc;")
    public static final class128 method149(boolean arg0, int arg1, class86 arg2) {
        field268++;
        try {
            if (!arg0) {
                field282 = 86;
            }
            class128 var3 = new class128();
            var3.field2920 = arg2.method636((byte) 109);
            if (arg1 < var3.field2920) {
                var3.field2920 = arg1;
            }
            var3.field2893 = new byte[var3.field2920];
            arg2.field1924 += class147.field3403.method960(var3.field2893, arg2.field1924, 0, var3.field2920, arg2.field1920, (byte) 106);
            return var3;
        } catch (Exception var4) {
            return class111.field2498;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static final void method150(boolean arg0) {
        field272++;
        class112.field2540.method919((byte) -104);
        if (!arg0) {
            field280 = null;
        }
    }
}
