import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class class369 {

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5347 = new String[] { method2927(method2926("q~\u000fR3")), method2927(method2926("q~\u000f\\3")), method2927(method2926("leMy")), method2927(method2926("y>\u000f;f")), method2927(method2926("hqFasg\u007fSt")), method2927(method2926("qg\u0012q")), method2927(method2926("hqFrw")), method2927(method2926("hqByr`")), method2927(method2926("fuUtrnc")), method2927(method2926("q~\u000f]3")), method2927(method2926("hqFqc")), method2927(method2926("jeGsvc~")), method2927(method2926("hqFxrqs")), method2927(method2926("jg\u0012q")) };

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "[I")
    public static int[] field5341 = new int[32];

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field5339 = 0;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Z")
    public static boolean field5346 = false;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "Z")
    public static boolean field5344 = true;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "[I")
    public static int[] field5345 = new int[5];

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "F")
    public static float field5342;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
    public static void method2923(int arg0) {
        try {
            field5341 = null;
            field5345 = null;
            if (arg0 >= -59) {
                method2925(null, (byte) -26);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5347[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)I")
    public static final int method2924(int arg0) {
        try {
            field5340++;
            if (class642.field9153 == 0) {
                class403.field5836.method3160(116, new class145(field5347[7]));
                if (class403.field5836.method3162((byte) -121).method1252(-91) != 100) {
                    return 1;
                }
                if (!((class145) class403.field5836.method3162((byte) -121)).method1251(303)) {
                    class572.field8287.method5452((byte) 48);
                }
                class642.field9153 = 1;
            }
            if (class642.field9153 == 1) {
                class551.field8046 = class403.method3158(9);
                class403.field5833.method3160(-67, new class635(class551.field8050));
                class403.field5843.method3160(-69, new class145(field5347[6]));
                class403.field5844.method3160(102, new class145(field5347[10]));
                class403.field5845.method3160(-101, new class145(field5347[12]));
                class403.field5846.method3160(88, new class145(field5347[5]));
                class403.field5847.method3160(77, new class145(field5347[13]));
                class403.field5848.method3160(arg0 ^ 0xFFFFDD05, new class145(field5347[4]));
                class403.field5849.method3160(67, new class635(class194.field2701));
                class403.field5850.method3160(arg0 ^ 0x22DA, new class635(class164.field2118));
                class403.field5851.method3160(68, new class635(class217.field3180));
                class403.field5852.method3160(108, new class635(class343.field4991));
                class403.field5853.method3160(arg0 - 8745, new class635(class234.field3375));
                class403.field5854.method3160(arg0 - 8778, new class635(class347.field5047));
                class403.field5855.method3160(-51, new class635(class691.field9674));
                class403.field5856.method3160(-106, new class635(class493.field7240));
                class403.field5857.method3160(124, new class635(class776.field11061));
                class403.field5858.method3160(-77, new class635(class430.field6237));
                class403.field5859.method3160(arg0 - 8748, new class635(class130.field1620));
                class403.field5860.method3160(arg0 - 8770, new class635(class151.field1929));
                class403.field5861.method3160(91, new class635(class765.field10939));
                class403.field5862.method3160(87, new class635(class353.field5121));
                class403.field5863.method3160(-128, new class169(class489.field7167, field5347[11]));
                class403.field5864.method3160(arg0 ^ 0x22D0, new class635(class767.field10953));
                class403.field5865.method3160(79, new class635(class788.field11371));
                class403.field5866.method3160(-95, new class635(class151.field1933));
                class403.field5867.method3160(-87, new class777(class622.field8890, field5347[8]));
                for (int var1 = 0; var1 < class551.field8046.length; var1++) {
                    if (class551.field8046[var1].method3162((byte) -121) == null) {
                        throw new RuntimeException();
                    }
                }
                int var2 = 0;
                class403[] var3 = class551.field8046;
                for (int var4 = 0; var4 < var3.length; var4++) {
                    class403 var5 = var3[var4];
                    int var6 = var5.method3159(false);
                    int var7 = var5.method3162((byte) -121).method1252(27);
                    var2 += var6 * var7 / 100;
                }
                class26.field312 = var2;
                class642.field9153 = 2;
            }
            if (class551.field8046 == null) {
                return 100;
            }
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            if (arg0 != 8851) {
                method2923(62);
            }
            class403[] var11 = class551.field8046;
            for (int var12 = 0; var12 < var11.length; var12++) {
                class403 var13 = var11[var12];
                int var14 = var13.method3159(false);
                int var15 = var13.method3162((byte) -121).method1252(102);
                var9 += var14 * var15 / 100;
                var8 += var14;
                if (var15 < 100) {
                    var10 = false;
                }
            }
            if (var10) {
                if (!((class145) class403.field5845.method3162((byte) -121)).method1251(303)) {
                    class572.field8287.method5446(26393);
                }
                if (!((class145) class403.field5848.method3162((byte) -121)).method1251(303)) {
                    class76.field1088 = class572.field8287.method5448(-1);
                }
                class551.field8046 = null;
            }
            int var16 = var9 - class26.field312;
            int var17 = var8 - class26.field312;
            int var18 = var17 > 0 ? var16 * 100 / var17 : 100;
            if (!var10 && var18 > 99) {
                var18 = 99;
            }
            return var18;
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field5347[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljc;B)Lrea;")
    public static final class721 method2925(class711 arg0, byte arg1) {
        try {
            int var2 = -22 / ((arg1 + 66) / 51);
            field5343++;
            return new class721(arg0.method5087((byte) -26), arg0.method5087((byte) -26), arg0.method5087((byte) -26), arg0.method5087((byte) -26), arg0.method5085(true), arg0.method5085(true), arg0.method5128(0));
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5347[1] + (arg0 == null ? field5347[2] : field5347[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2926(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2927(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
