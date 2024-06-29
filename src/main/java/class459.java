import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class459 extends class568 {

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7082 = new String[] { method3561(method3560("c:>\u0005B9")), method3561(method3560("c:>\u0005C9")), method3561(method3560("c:>\u0005A9")) };

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "Lpe;")
    public static class636 field7079 = new class636(10, 2, 2, 0);

    @OriginalMember(owner = "client!rba", name = "o", descriptor = "Lak;")
    public static class369 field7080 = new class369();

    @OriginalMember(owner = "client!rba", name = "r", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!rba", name = "q", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!rba", name = "p", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!rba", name = "u", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!rba", name = "s", descriptor = "J")
    public long field7075;

    @OriginalMember(owner = "client!rba", name = "t", descriptor = "Lrba;")
    public class459 field7073;

    @OriginalMember(owner = "client!rba", name = "m", descriptor = "Lrba;")
    public class459 field7074;

    @OriginalMember(owner = "client!rba", name = "n", descriptor = "[I")
    public static int[] field7078;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)Z")
    public final boolean method3557(boolean arg0) {
        try {
            field7076++;
            if (this.field7073 == null) {
                return false;
            } else {
                if (!arg0) {
                    field7081 = -19;
                }
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7082[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
    public final void method3558(byte arg0) {
        try {
            field7072++;
            if (this.field7073 != null) {
                this.field7073.field7074 = this.field7074;
                this.field7074.field7073 = this.field7073;
                this.field7074 = null;
                this.field7073 = null;
                if (arg0 <= 52) {
                    method3559(18);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7082[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)V")
    public static void method3559(int arg0) {
        try {
            field7079 = null;
            field7078 = null;
            int var1 = 46 % ((41 - arg0) / 48);
            field7080 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7082[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3560(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3561(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
