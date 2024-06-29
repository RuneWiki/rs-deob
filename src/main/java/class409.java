import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class409 {

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6540 = new String[] { method3287(method3286("vK\u0005.e")), method3287(method3286("vK\u0005,e")), method3287(method3286("vK\u0005)e")), method3287(method3286("`\t\u0005C0")), method3287(method3286("vK\u0005/e")), method3287(method3286("uRG\u0001")), method3287(method3286("vK\u0005(e")) };

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "[Z")
    public static boolean[] field6533 = new boolean[200];

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Lvn;")
    public static class330 field6536 = new class330(47, 3);

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "F")
    public static float field6539;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3281(int arg0, byte arg1, int arg2) {
        try {
            field6538++;
            if (((arg0 & 0x10000) != 0 | class319.method2736((byte) 86, arg0, arg2)) || class359.method2972(arg0, arg2, -1298)) {
                return true;
            } else {
                if (arg1 <= 10) {
                    field6536 = null;
                }
                return (arg2 & 0x37) == 0 && class553.method4098(-7851, arg0, arg2);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6540[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method3282(int arg0) {
        try {
            field6533 = null;
            if (arg0 == 0) {
                field6536 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6540[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
    public static final void method3283(int arg0, int arg1) {
        try {
            class42.field477 = arg0;
            class193.field3048 = arg1;
            field6535++;
            class683.field9892 = class185.field2948;
            class442.method3466(true, "", 2116, class748.field11039.equals(""), class748.field11039);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6540[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)Z")
    public static final boolean method3284(boolean arg0) {
        try {
            if (arg0) {
                field6533 = null;
            }
            field6534++;
            return class315.field5127 >= 1;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6540[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILeg;)Leg;")
    public static final class114 method3285(int arg0, class114 arg1) {
        try {
            field6537++;
            if (arg0 == -3064) {
                class114 var2 = arg1 == null ? new class114() : new class114(arg1);
                var2.method1110(128, 9, -43);
                return var2;
            } else {
                return null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6540[4] + arg0 + ',' + (arg1 == null ? field6540[5] : field6540[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3286(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3287(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 27;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
