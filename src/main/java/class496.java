import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class496 {

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public int field7279;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7288 = new String[] { method3820(method3819("[`cG0gz?Z1S&")), method3820(method3819("[`c\u000f6Zg9\rw")), method3820(method3819("[`cpw")), method3820(method3819("[`cqw")) };

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Lon;")
    public static class496 field7276 = new class496(1);

    @OriginalMember(owner = "client!on", name = "j", descriptor = "Lon;")
    public static class496 field7278 = new class496(2);

    @OriginalMember(owner = "client!on", name = "h", descriptor = "Lon;")
    public static class496 field7280 = new class496(4);

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Lon;")
    public static class496 field7281 = new class496(1);

    @OriginalMember(owner = "client!on", name = "l", descriptor = "Lon;")
    public static class496 field7282 = new class496(2);

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Lon;")
    public static class496 field7283 = new class496(4);

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Lon;")
    public static class496 field7284 = new class496(2);

    @OriginalMember(owner = "client!on", name = "c", descriptor = "Lon;")
    public static class496 field7285 = new class496(4);

    @OriginalMember(owner = "client!on", name = "g", descriptor = "Lofa;")
    public static class139 field7287 = new class139(1);

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Lrw;")
    public static class331 field7286;

    @OriginalMember(owner = "client!on", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        try {
            field7275++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7288[0] + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I", line = 13)
    public static final int method3816(int arg0, int arg1) {
        return class727.field10425 == null ? 0 : class727.field10425[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 18)
    public static void method3817(int arg0) {
        try {
            field7282 = null;
            field7280 = null;
            field7287 = null;
            field7284 = null;
            field7278 = null;
            field7281 = null;
            field7286 = null;
            if (arg0 != 27805) {
                method3818(-24, 32, -116);
            }
            field7276 = null;
            field7285 = null;
            field7283 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7288[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Z", line = 43)
    public static final boolean method3818(int arg0, int arg1, int arg2) {
        try {
            if (arg1 > -104) {
                method3817(91);
            }
            field7277++;
            return (arg0 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7288[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(I)V", line = 56)
    private class496(int arg0) {
        try {
            this.field7279 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7288[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!on", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3819(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!on", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3820(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
