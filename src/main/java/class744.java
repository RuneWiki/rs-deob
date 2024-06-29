import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class744 {

    @OriginalMember(owner = "client!si", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10569 = new String[] { method5392(method5391("{\\54\f")), method5392(method5391("{\\51\f")), method5392(method5391("{\\52\f")) };

    @OriginalMember(owner = "client!si", name = "a", descriptor = "[I")
    public static int[] field10566 = new int[4];

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
    public static int[] field10567 = new int[500];

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field10565;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field10568;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public static final void method5387(int arg0) {
        try {
            class775.field11056 = class520.field7584.field2062 + class520.field7584.field2071 + 2;
            class789.field11405 = new String[500];
            class324.field4417 = class84.field1185.field2071 + class84.field1185.field2062 + 2;
            field10568++;
            for (int var1 = 0; var1 < class789.field11405.length; var1++) {
                class789.field11405[var1] = "";
            }
            class11.method74(class537.field7826.method4068((byte) -37, class405.field5883), (byte) -127);
            if (arg0 != 1) {
                method5387(101);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10569[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)I")
    public static final int method5388(byte arg0) {
        try {
            field10565++;
            byte var1;
            if (class342.field4980 < 96) {
                class479.method3708(true, 97);
                var1 = 1;
            } else {
                int var2 = class319.method2531(9714);
                if (var2 <= 100) {
                    class162.method1372((byte) -114);
                    var1 = 4;
                } else if (var2 <= 500) {
                    var1 = 3;
                    class90.method887(250);
                } else if (var2 > 1000) {
                    var1 = 1;
                    class479.method3708(true, 63);
                } else {
                    var1 = 2;
                    class450.method3490(45);
                }
            }
            if (class451.field6612.field9134.method4717(3) != 0) {
                class451.field6612.method4681(0, class451.field6612.field9137, (byte) -111);
                class279.method2271(7, false, 0);
            }
            class536.method4064(10);
            int var3 = 120 % ((57 - arg0) / 37);
            return var1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10569[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method5389(int arg0) {
        try {
            field10566 = null;
            if (arg0 <= 11) {
                method5390(null, 109, 58, -116);
            }
            field10567 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10569[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lrfa;III)V")
    public static final void method5390(class202 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class508.field7455) {
            class621 var4 = class608.field8715[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field8850 != null && var4.field8850.method46(-108)) {
                arg0.method40(0, (byte) 55, 0, var4.field8850, true, class768.field10975, class531.field7699);
            }
        }
        if (arg3 < class508.field7455) {
            class621 var5 = class608.field8715[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field8850 != null && var5.field8850.method46(-127)) {
                arg0.method40(class768.field10975, (byte) -107, 0, var5.field8850, true, 0, class531.field7699);
            }
        }
        if (arg2 < class508.field7455 && arg3 < class700.field9795) {
            class621 var6 = class608.field8715[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field8850 != null && var6.field8850.method46(-115)) {
                arg0.method40(class768.field10975, (byte) 114, 0, var6.field8850, true, class768.field10975, class531.field7699);
            }
        }
        if (arg2 < class508.field7455 && arg3 > 0) {
            class621 var7 = class608.field8715[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field8850 != null && var7.field8850.method46(-101)) {
                arg0.method40(-class768.field10975, (byte) 66, 0, var7.field8850, true, class768.field10975, class531.field7699);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5391(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!si", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5392(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
