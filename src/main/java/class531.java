import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class531 {

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7801 = new String[] { method4021(method4020("l)'\u0004v&")), method4021(method4020("l)'\u0004q&")), method4021(method4020("l)'\u0004p&")), method4021(method4020("l)'\u0004s&")), method4021(method4020("`8*F")), method4021(method4020("uch\u0004O")) };

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "[I")
    public static int[] field7798 = new int[3];

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "Lhaa;")
    public static class89 field7799;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V", line = 5)
    public static final void method4016(byte arg0) {
        try {
            if (arg0 != 82) {
                method4018(-18, -60, 49);
            }
            class618.field9078.method1559(0);
            field7800++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7801[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V", line = 18)
    public static void method4017(byte arg0) {
        try {
            field7799 = null;
            field7798 = null;
            if (arg0 != 124) {
                method4017((byte) -8);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7801[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(III)Z", line = 32)
    public static final boolean method4018(int arg0, int arg1, int arg2) {
        try {
            if (arg0 == 3) {
                field7796++;
                return (class616.method4572(arg1, -1, arg2) | class660.method4842((byte) 75, arg1, arg2) | class58.method429(arg2, arg1, arg0 + 821)) & class109.method956(-107, arg2, arg1);
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7801[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lha;B)V", line = 43)
    public static final void method4019(class66 arg0, byte arg1) {
        try {
            if (arg1 < 3) {
                method4017((byte) 59);
            }
            field7797++;
            if (class216.field3297) {
                class8.method56(1, arg0);
            } else {
                class526.method3979(-105, arg0);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7801[3] + (arg0 == null ? field7801[4] : field7801[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4020(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4021(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
