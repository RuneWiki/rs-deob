import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class668 implements class285 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public int field9709;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9710 = new String[] { method4920(method4919("&}eQ_")), method4920(method4919("&}eW_")), method4920(method4919("&}eP_")), method4920(method4919("&}e/\u001e:s?-_")), method4920(method4919("&}eR_")) };

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "[I")
    public static int[] field9706 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field9704;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field9705;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZI)Lso;", line = 5)
    public static final class495 method4916(int arg0, boolean arg1, int arg2) {
        try {
            field9708++;
            if (arg2 == 3) {
                long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
                return (class495) class143.field1719.method977(var3, arg2 - 2);
            } else {
                return null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9710[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)Z", line = 21)
    public static final boolean method4917(byte arg0, int arg1) {
        try {
            if (arg0 != 85) {
                method4916(-104, true, -104);
            }
            field9707++;
            return arg1 == 0 || arg1 == 2;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9710[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 33)
    public static void method4918(byte arg0) {
        try {
            field9706 = null;
            int var1 = -50 % ((arg0 - 12) / 49);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9710[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Lvaa;", line = 43)
    public final class494 method1226(int arg0) {
        try {
            int var2 = -91 / ((57 - arg0) / 61);
            field9705++;
            return class494.field7099;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9710[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V", line = 57)
    public class668(int arg0) {
        try {
            this.field9709 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9710[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4919(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4920(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
