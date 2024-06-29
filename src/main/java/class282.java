import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class282 implements class589 {

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3977 = new String[] { method2297(method2296("`:q9m")), method2297(method2296("`:q;m")), method2297(method2296("i#3\u0016")), method2297(method2296("|xqT8")), method2297(method2296("`:q>m")), method2297(method2296("`:q8m")) };

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field3970 = 0;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Lmv;")
    public static class125 field3972 = new class125(88, 15);

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Z")
    public static boolean field3975 = false;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "[[I")
    public static int[][] field3976 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Lui;")
    public static class251 field3973 = new class251(8);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "F")
    public static float field3969;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([IIJLhj;)Ljava/lang/String;", line = 3)
    public final String method2292(int[] arg0, int arg1, long arg2, class671 arg3) {
        try {
            field3968++;
            if (class274.field3886 == arg3) {
                class798 var6 = class634.field8994.method5381((byte) -85, arg0[0]);
                return var6.method5760((int) arg2, (byte) -28);
            } else if (class647.field9200 == arg3 || class62.field944 == arg3) {
                class371 var7 = class153.field1955.method3237((int) arg2, 0);
                return var7.field5421;
            } else if (class533.field7720 == arg3 || class1.field20 == arg3 || class185.field2395 == arg3) {
                return class634.field8994.method5381((byte) -59, arg0[0]).method5760((int) arg2, (byte) -28);
            } else {
                if (arg1 != 0) {
                    field3970 = -24;
                }
                return null;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3977[1] + (arg0 == null ? field3977[2] : field3977[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3977[2] : field3977[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 37)
    public static void method2293(int arg0) {
        try {
            if (arg0 != 6) {
                method2295((byte) 81);
            }
            field3972 = null;
            field3976 = null;
            field3973 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3977[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILft;)[Lsha;", line = 50)
    public static final class189[] method2294(int arg0, class188 arg1) {
        try {
            field3966++;
            if (!arg1.method1574(true)) {
                return new class189[0];
            }
            class328 var2 = arg1.method1579(65535);
            while (var2.field4486 == 0) {
                class449.method3474(20817, 10L);
            }
            if (var2.field4486 == 2) {
                return new class189[0];
            }
            if (arg0 <= 93) {
                method2293(9);
            }
            int[] var3 = (int[]) var2.field4487;
            class189[] var4 = new class189[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class189 var6 = new class189();
                var4[var5] = var6;
                var6.field2514 = var3[var5 << 2];
                var6.field2519 = var3[(var5 << 2) + 1];
                var6.field2511 = var3[(var5 << 2) + 2];
                var6.field2512 = var3[(var5 << 2) + 3];
            }
            return var4;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3977[5] + arg0 + ',' + (arg1 == null ? field3977[2] : field3977[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Liga;", line = 99)
    public static final class353 method2295(byte arg0) {
        try {
            field3971++;
            if (class534.field7732 == null || class533.field7719 == null) {
                return null;
            }
            class533.field7719.method2698(19770, class534.field7732);
            int var1 = 91 / ((-arg0 - 2) / 39);
            class353 var2 = (class353) class533.field7719.method2703((byte) 32);
            if (var2 == null) {
                return null;
            } else {
                class475 var3 = class534.field7725.method2508(var2.field5108, false);
                return var3 != null && var3.field7005 && var3.method3672((byte) -109, class534.field7728) ? var2 : class665.method4798(true);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3977[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2296(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2297(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 86;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
