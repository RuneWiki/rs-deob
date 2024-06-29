import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 {

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field176 = new String[] { method112(method111("\u001e\u0010\u0003]z")), method112(method111("\u001e\u0010\u0003Xz")), method112(method111("\u001b\rAp")), method112(method111("\u001e\u0010\u0003_z")), method112(method111("\u000eV\u00032/")), method112(method111("\u001e\u0010\u0003^z")), method112(method111("\u001e\u0010\u0003Yz")) };

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lvh;")
    public static class379 field168 = new class379();

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
    public static int[] field171 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field172 = 0;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field175 = new String[100];

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Ld;")
    public static class158 field170;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "Ljm;")
    public static class720 field174;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[Lvu;")
    public static class356[] field165;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static void method106(boolean arg0) {
        try {
            if (!arg0) {
                field171 = null;
            }
            field170 = null;
            field168 = null;
            field171 = null;
            field174 = null;
            field175 = null;
            field165 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field176[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBIIZ)V")
    public static final void method107(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        try {
            field169++;
            if (class504.method3798(127, arg2)) {
                class226.method1986(arg4, 0, class309.field5028[arg2], -1, arg3, arg0);
                int var5 = -64 % ((arg1 + 30) / 47);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field176[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static final void method108(int arg0) {
        try {
            field167++;
            class476.method3643(class662.field9437, false, (long) class431.field6776);
            if (class317.field5175 != arg0) {
                class764.method5511(95, class317.field5175);
            }
            for (int var1 = 0; var1 < class313.field5119; var1++) {
                if (class178.field2871[var1]) {
                    class370.field5996[var1] = true;
                }
                class37.field424[var1] = class178.field2871[var1];
                class178.field2871[var1] = false;
            }
            class74.field1064 = class431.field6776;
            if (class317.field5175 != -1) {
                class313.field5119 = 0;
                class449.method3499((byte) -2);
            }
            class662.field9437.method227();
            class170.method1577(126, class662.field9437);
            int var2 = class728.method5282(3);
            if (var2 == -1) {
                var2 = class561.field8156;
            }
            if (var2 == -1) {
                var2 = class550.field8064;
            }
            class516.method3869((byte) -46, var2);
            class778.field11350 = 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field176[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILmj;)Lmj;")
    public static final class683 method109(int arg0, class683 arg1) {
        try {
            field166++;
            if (~arg1.field9764 != arg0) {
                return class200.method1826(true, arg1.field9764);
            }
            int var2 = arg1.field9774 >>> 16;
            class346 var3 = new class346(class632.field9082);
            for (class23 var4 = (class23) var3.method2893(arg0 ^ 0xFFFFAF69); var4 != null; var4 = (class23) var3.method2895(false)) {
                if (var4.field219 == var2) {
                    return class200.method1826(true, (int) var4.field8252);
                }
            }
            return null;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field176[3] + arg0 + ',' + (arg1 == null ? field176[2] : field176[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)V")
    public static final void method110(boolean arg0, int arg1) {
        try {
            field173++;
            class587.field8506++;
            class487 var2 = class618.method4519(59, class398.field6311, class185.field2948.field2659);
            class185.field2948.method1546(var2, 1);
            for (class23 var3 = (class23) class632.field9082.method735(arg1 ^ arg1); var3 != null; var3 = (class23) class632.field9082.method734((byte) -50)) {
                if (!var3.method4170(-119)) {
                    var3 = (class23) class632.field9082.method735(arg1 - 32);
                    if (var3 == null) {
                        break;
                    }
                }
                if (var3.field220 == 0) {
                    class52.method541(arg0, var3, true, (byte) -55);
                }
            }
            if (class145.field2053 != null) {
                class454.method3525((byte) 27, class145.field2053);
                class145.field2053 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field176[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method111(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method112(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 45;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
