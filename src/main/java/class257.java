import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class257 extends class651 {

    @OriginalMember(owner = "client!jia", name = "l", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!jia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3677 = new String[] { method2149(method2148("Kd\n\n\u007f\t")), method2149(method2148("Kd\n\n\u0002Hc\u0002P\u0000\t")), method2149(method2148("Kd\n\n|\t")) };

    @OriginalMember(owner = "client!jia", name = "k", descriptor = "[I")
    public static int[] field3673 = new int[1];

    @OriginalMember(owner = "client!jia", name = "j", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!jia", name = "m", descriptor = "Z")
    public static boolean field3676;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V")
    public static final void method2146(byte arg0) {
        try {
            field3674++;
            class153.field1957.method2047(arg0 + 11809);
            class207.field3023.method2047(11914);
            class140.field1821.method2047(11914);
            if (arg0 == 105) {
                class229.field3321.method2047(11914);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3677[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V")
    public static void method2147(int arg0) {
        try {
            field3673 = null;
            if (arg0 != 1) {
                field3673 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3677[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(I)V")
    public class257(int arg0) {
        try {
            this.field3675 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3677[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2148(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2149(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
