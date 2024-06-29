import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class137 {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Lwca;")
    private class708 field1928;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1931 = new String[] { method1279(method1278("@Vo\"p")), method1279(method1278("@Vo p")), method1279(method1278("@Vo#p")), method1279(method1278("FK-\r")), method1279(method1278("S\u0010oO%")), method1279(method1278("@Vo]1FW5_p")) };

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lvn;")
    public static class330 field1926 = new class330(57, 12);

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1930 = 0;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lrba;")
    private class459 field1924;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Lrba;")
    public final class459 method1275(byte arg0) {
        try {
            field1929++;
            class459 var2 = this.field1928.field10193.field7074;
            if (this.field1928.field10193 == var2) {
                this.field1924 = null;
                return null;
            }
            this.field1924 = var2.field7074;
            if (arg0 != 76) {
                this.method1275((byte) -111);
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1931[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static void method1276(int arg0) {
        try {
            field1926 = null;
            if (arg0 != 57) {
                field1926 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1931[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class137() {
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Lrba;")
    public final class459 method1277(int arg0) {
        try {
            field1927++;
            if (arg0 != 57) {
                return null;
            }
            class459 var2 = this.field1924;
            if (this.field1928.field10193 == var2) {
                this.field1924 = null;
                return null;
            } else {
                this.field1924 = var2.field7074;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1931[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lwca;)V")
    public class137(class708 arg0) {
        try {
            this.field1928 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1931[5] + (arg0 == null ? field1931[3] : field1931[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1278(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1279(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 65;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
