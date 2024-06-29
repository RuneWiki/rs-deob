import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class262 extends class568 {

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public int field4265;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4274 = new String[] { method2287(method2286("+&g\u0012t")), method2287(method2286("+&gm5$*=ot")), method2287(method2286("+&g\u0015t")), method2287(method2286("+&g\u0014t")), method2287(method2286("+&g\u0013t")), method2287(method2286("+&g\u0010t")) };

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field4264 = 0;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lhl;")
    public static class556 field4270 = new class556(71, 6);

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[Lkt;")
    public static class165[] field4273 = new class165[8];

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Lmm;")
    public static class292 field4272 = new class292(method2287(method2286("\u001d\n\u0019")), 2);

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)I")
    public static final int method2281(int arg0, int arg1) {
        try {
            field4267++;
            if (arg1 <= 101) {
                field4272 = null;
            }
            return arg0 >>> 10;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4274[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static final void method2282(boolean arg0) {
        try {
            field4269++;
            class180.field2880 = arg0;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4274[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method2283(int arg0) {
        try {
            if (arg0 != 71) {
                method2282(false);
            }
            field4273 = null;
            field4270 = null;
            field4272 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4274[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(CB)Z")
    public static final boolean method2284(char arg0, byte arg1) {
        try {
            field4266++;
            if (arg0 >= ' ' && arg0 <= '~') {
                return true;
            }
            if (arg1 < 15) {
                field4264 = 27;
            }
            if (arg0 >= ' ' && arg0 <= 'ÿ') {
                return true;
            } else {
                return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4274[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)Lhu;")
    public static final class139 method2285(int arg0, int arg1) {
        try {
            field4268++;
            if (arg1 != 2) {
                method2281(56, 99);
            }
            return class392.field6247 && arg0 >= class697.field10041 && arg0 <= class737.field10792 ? class663.field9452[arg0 - class697.field10041] : null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4274[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V")
    public class262(int arg0, int arg1) {
        try {
            this.field4271 = arg0;
            this.field4265 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4274[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2286(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2287(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
