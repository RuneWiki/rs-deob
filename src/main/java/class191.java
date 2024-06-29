import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class191 {

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3019 = new String[] { method1778(method1777("6>X~Oh")), method1778(method1777("6>X~Lh")), method1778(method1777("6>X~Mh")) };

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "Lvn;")
    public static class330 field3013 = new class330(3, 7);

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "Lhl;")
    public static class556 field3016 = new class556(99, 9);

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "F")
    public static float field3018;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIB)Z", line = 6)
    public static final boolean method1774(int arg0, int arg1, byte arg2) {
        try {
            int var3 = -72 % ((60 - arg2) / 53);
            field3015++;
            return (arg1 & 0x800) != 0 | class363.method3007(arg1, -68, arg0) || class157.method1412(arg1, arg0, (byte) 126);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3019[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V", line = 19)
    public static void method1775(byte arg0) {
        try {
            field3013 = null;
            if (arg0 <= 68) {
                method1776(86);
            }
            field3016 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3019[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V", line = 39)
    public static final void method1776(int arg0) {
        try {
            if (class315.field5127 == 3) {
                class302.method2598(4, arg0 + 10461);
            } else if (class315.field5127 == 7) {
                class302.method2598(8, -3);
            } else if (class315.field5127 == 9) {
                class302.method2598(10, arg0 + 10461);
            } else if (class315.field5127 == 11) {
                class302.method2598(12, -3);
            }
            field3014++;
            if (arg0 != -10464) {
                field3013 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3019[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1777(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xE);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1778(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 57;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
