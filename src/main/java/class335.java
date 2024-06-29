import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class335 {

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5469 = new String[] { method2826(method2825("\u0002R:\u0003\u000e")), method2826(method2825("\u0019Xw3I\u0007^r5")), method2826(method2825("\u0002R:\u0000\u000e")) };

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "Lua;")
    public static class696 field5466 = new class696(1);

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "[Z")
    public static boolean[] field5467;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V", line = 5)
    public static void method2823(int arg0) {
        try {
            field5467 = null;
            if (arg0 != 12628) {
                method2823(-42);
            }
            field5466 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5469[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 23)
    public static final void method2824(byte arg0) {
        try {
            if (arg0 <= 28) {
                method2823(93);
            }
            field5468++;
            if (class61.field814.toLowerCase().indexOf(field5469[1]) == -1) {
                class156.field2162[44] = 71;
                class156.field2162[47] = 73;
                class156.field2162[61] = 27;
                class156.field2162[45] = 26;
                class156.field2162[92] = 74;
                class156.field2162[46] = 72;
                class156.field2162[91] = 42;
                if (class61.field813 == null) {
                    class156.field2162[192] = 58;
                    class156.field2162[222] = 59;
                } else {
                    class156.field2162[222] = 58;
                    class156.field2162[520] = 59;
                    class156.field2162[192] = 28;
                }
                class156.field2162[93] = 43;
                class156.field2162[59] = 57;
            } else {
                class156.field2162[189] = 26;
                class156.field2162[192] = 58;
                class156.field2162[223] = 28;
                class156.field2162[221] = 43;
                class156.field2162[188] = 71;
                class156.field2162[222] = 59;
                class156.field2162[187] = 27;
                class156.field2162[220] = 74;
                class156.field2162[191] = 73;
                class156.field2162[219] = 42;
                class156.field2162[186] = 57;
                class156.field2162[190] = 72;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5469[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2825(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2826(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
