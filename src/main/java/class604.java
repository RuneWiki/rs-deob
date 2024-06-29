import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class604 extends class183 {

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "I")
    public int field8856 = -1;

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8862 = new String[] { method4482(method4481("a_%o\"")), method4482(method4481("a_%`\"")), method4482(method4481("a_%n\"")), method4482(method4481("s\u0004%\u0007w")), method4482(method4481("f_gE")), method4482(method4481("a_%a\"")) };

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "S")
    public static short field8858 = 32767;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field8861 = 765;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "F")
    public static float field8853;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "I")
    public int field8860;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "Lla;")
    public static class476 field8851;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "Lfs;")
    public static class581 field8852;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "Ljava/lang/String;")
    public String field8850;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "Ljava/lang/String;")
    public String field8855;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)Lpja;", line = 6)
    public final class43 method4477(int arg0) {
        try {
            if (arg0 > -3) {
                field8861 = -50;
            }
            ++field8854;
            return class717.field10398[super.field2525];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8862[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IZI)Z", line = 22)
    public static final boolean method4478(int arg0, boolean arg1, int arg2) {
        try {
            if (!arg1) {
                field8851 = null;
            }
            ++field8859;
            return class118.method1037(arg2, (byte) 29, arg0) || class547.method4125(arg2, arg0, (byte) 121);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8862[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 42)
    public static final int method4479(boolean arg0, String arg1) {
        try {
            ++field8857;
            if (arg1 == null) {
                return -1;
            } else {
                for (int var2 = 0; var2 < class588.field8654; ++var2) {
                    if (arg1.equalsIgnoreCase(class754.field10971[var2])) {
                        return var2;
                    }
                }
                if (arg0) {
                    field8851 = null;
                }
                return -1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8862[5] + arg0 + ',' + (arg1 != null ? field8862[3] : field8862[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(B)V", line = 72)
    public static void method4480(byte arg0) {
        try {
            if (arg0 > 126) {
                field8852 = null;
                field8851 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8862[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4481(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4482(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
