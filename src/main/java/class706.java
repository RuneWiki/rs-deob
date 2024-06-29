import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class706 {

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9875 = new String[] { method5066(method5065("+[\n%S")), method5066(method5065("+[\n\u0012\u0014\rXV\u000f\u00159\u0004")), method5066(method5065("0YH\n")), method5066(method5065("%\u0002\nH\u0006")), method5066(method5065("+[\n'S")), method5066(method5065("+[\n$S")) };

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "Luw;")
    public static class706 field9867 = new class706();

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "Luw;")
    public static class706 field9869 = new class706();

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "Luw;")
    public static class706 field9870 = new class706();

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "Luw;")
    public static class706 field9871 = new class706();

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "Z")
    public static boolean field9872 = false;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
    public static int field9873 = 0;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "Z")
    public static volatile boolean field9874 = false;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)Lwt;", line = 6)
    public static final class9 method5062(int arg0, int arg1) {
        try {
            field9864++;
            class9 var2 = (class9) class768.field10968.method2053(0, (long) arg1);
            if (var2 != null) {
                return var2;
            }
            byte[] var3 = class12.field167.method512(arg1, 0, (byte) -23);
            class9 var4 = new class9();
            if (var3 != null) {
                var4.method64(new class711(var3), (byte) 115, arg1);
            }
            if (arg0 < 118) {
                field9873 = 86;
            }
            class768.field10968.method2051((long) arg1, var4, 93);
            return var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9875[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V", line = 31)
    public static void method5063(int arg0) {
        try {
            field9867 = null;
            field9869 = null;
            field9870 = null;
            if (arg0 != 0) {
                field9867 = null;
            }
            field9871 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9875[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZILjava/lang/Object;)[B", line = 48)
    public static final byte[] method5064(boolean arg0, int arg1, Object arg2) {
        try {
            field9866++;
            if (arg2 == null) {
                return null;
            } else if (arg2 instanceof byte[]) {
                byte[] var3 = (byte[]) arg2;
                return arg0 ? class526.method3995(var3, false) : var3;
            } else {
                int var4 = 29 % ((55 - arg1) / 51);
                if (!arg2 instanceof class76) {
                    throw new IllegalArgumentException();
                }
                class76 var5 = (class76) arg2;
                return var5.method539((byte) 68);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9875[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9875[2] : field9875[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "toString", descriptor = "()Ljava/lang/String;", line = 89)
    public final String toString() {
        try {
            field9868++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9875[1] + ')');
        }
    }

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5065(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5066(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
