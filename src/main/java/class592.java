import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class592 extends class651 {

    @OriginalMember(owner = "client!es", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8527 = new String[] { method4376(method4375("P\u0005\u0013\\p")), method4376(method4375("P\u0005\u0013^p")), method4376(method4375("P\u0005\u0013]p")) };

    @OriginalMember(owner = "client!es", name = "l", descriptor = "Llf;")
    public static class260 field8525 = new class260(0, 8);

    @OriginalMember(owner = "client!es", name = "j", descriptor = "Llf;")
    public static class260 field8526 = new class260(1, 3);

    @OriginalMember(owner = "client!es", name = "n", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "Les;")
    public class592 field8521;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "Les;")
    public class592 field8523;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V")
    public static void method4372(byte arg0) {
        try {
            field8526 = null;
            int var1 = -103 % ((65 - arg0) / 49);
            field8525 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8527[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)Z")
    public static final boolean method4373(boolean arg0) {
        try {
            field8522++;
            if (class536.field7772 == null) {
                return false;
            }
            if (!arg0) {
                method4373(true);
            }
            if (class536.field7772.field3311 >= 2000) {
                class536.field7772.field3311 -= 2000;
            }
            return class536.field7772.field3311 == 1007;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8527[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
    public final void method4374(byte arg0) {
        try {
            field8524++;
            if (arg0 >= 55 && this.field8521 != null) {
                this.field8521.field8523 = this.field8523;
                this.field8523.field8521 = this.field8521;
                this.field8523 = null;
                this.field8521 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8527[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!es", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4375(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!es", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4376(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
