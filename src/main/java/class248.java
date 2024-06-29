import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class248 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
    public static int[] field3940 = new int[128];

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3941 = "";

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field3947 = -2;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[I")
    public static int[] field3944 = new int[128];

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "[I")
    public static int[] field3942 = new int[2];

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3949 = "flash2:";

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Z")
    public static boolean field3946;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILma;)Lda;")
    public static final class198 method1727(int arg0, class202 arg1) {
        field3951++;
        arg1.method1420((byte) 0);
        int var2 = arg1.method1420((byte) 0);
        class198 var3 = class221.method1551(false, var2);
        var3.field3142 = arg1.method1420((byte) 0);
        int var4 = arg1.method1420((byte) 0);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method1420((byte) 0);
            var3.method52(127, arg1, var6);
        }
        var3.method142((byte) 108);
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static final void method1728(int arg0) {
        class93.field1411.method145(-98);
        if (arg0 != -12649) {
            method1729(-29, (String) null, (String) null, (String) null);
        }
        field3953++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1729(int arg0, String arg1, String arg2, String arg3) {
        field3948++;
        if (arg0 > -39) {
            return null;
        } else {
            for (int var4 = arg2.indexOf(arg1); var4 != -1; var4 = arg2.indexOf(arg1, var4 + arg3.length())) {
                arg2 = arg2.substring(0, var4) + arg3 + arg2.substring(arg1.length() + var4);
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method1730(int arg0) {
        field3954++;
        String var1;
        if (class29.field367 == 1 && class18.field251 < 2) {
            var1 = class18.field250 + class106.field1645 + class43.field602 + " ->";
        } else if (class70.field1017 && class18.field251 < 2) {
            var1 = class70.field1019 + class106.field1645 + class265.field4368 + " ->";
        } else if (class253.field4019 && class3.field26[81] && class18.field251 > 2) {
            var1 = class11.method60(0, class18.field251 - 2);
        } else {
            var1 = class11.method60(0, class18.field251 - 1);
        }
        if (arg0 < class18.field251) {
            var1 = var1 + "<col=ffffff> / " + (class18.field251 - 2) + class115.field1729;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1731(String arg0, int arg1) {
        field3945++;
        if (arg0 == null) {
            return;
        }
        String var2 = class304.method2088(arg0, 2);
        if (var2 == null) {
            return;
        }
        if (arg1 < 124) {
            field3941 = null;
        }
        for (int var3 = 0; var3 < class20.field270; var3++) {
            String var4 = class304.method2088(class143.field2257[var3], 2);
            if (var4 != null && var4.equals(var2)) {
                class20.field270--;
                class3.field24++;
                for (int var5 = var3; var5 < class20.field270; var5++) {
                    class143.field2257[var5] = class143.field2257[var5 + 1];
                    class296.field4876[var5] = class296.field4876[var5 + 1];
                    class6.field53[var5] = class6.field53[var5 + 1];
                }
                class287.field4783 = class40.field502;
                class276.field4572.method1391(0, 126);
                class276.field4572.method1446((byte) 93, class187.method1270((byte) -66, arg0));
                class276.field4572.method1409(arg0, (byte) 77);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method1732(byte arg0) {
        field3942 = null;
        field3949 = null;
        field3941 = null;
        field3944 = null;
        field3940 = null;
        if (arg0 != 63) {
            method1731((String) null, 16);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLgj;)V")
    public static final void method1733(boolean arg0, class255 arg1) {
        class238 var2 = null;
        field3943++;
        try {
            class54 var3 = arg1.method1781("runescape", 0);
            while (var3.field725 == 0) {
                class96.method614(0, 1L);
            }
            if (var3.field725 == 1) {
                var2 = (class238) var3.field723;
                class202 var4 = class64.method414((byte) -84);
                var2.method1662(var4.field3272, 0, -7751, var4.field3234);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1660((byte) -103);
            }
        } catch (Exception var5) {
        }
        if (arg0) {
            method1729(125, (String) null, (String) null, (String) null);
        }
    }
}
