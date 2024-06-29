import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class444 {

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6553 = new String[] { method3457(method3456("-w\u000bb\u000b")), method3457(method3456("-w\u000ba\u000b")) };

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Llf;")
    public static class260 field6549 = new class260(10, 2);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field6552 = -1;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Llf;")
    public static class260 field6551 = new class260(5, 7);

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static void method3454(int arg0) {
        try {
            field6551 = null;
            int var1 = 96 / ((arg0 + 4) / 46);
            field6549 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6553[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)[Lsha;")
    public static final class189[] method3455(int arg0) {
        try {
            if (arg0 != 600) {
                field6551 = null;
            }
            if (class679.field9530 == null) {
                class189[] var1 = class282.method2294(124, class651.field9249);
                class189[] var2 = new class189[var1.length];
                int var3 = 0;
                int var4 = class451.field6612.field9090.method5665(3);
                label92: for (int var5 = 0; var5 < var1.length; var5++) {
                    class189 var6 = var1[var5];
                    if ((var6.field2511 <= 0 || var6.field2511 >= 24) && var6.field2514 >= 800 && var6.field2519 >= 600 && (var4 != 2 || var6.field2514 <= 800 && var6.field2519 <= 600) && (var4 != 1 || var6.field2514 <= 1024 && var6.field2519 <= 768)) {
                        for (int var7 = 0; var7 < var3; var7++) {
                            class189 var8 = var2[var7];
                            if (var6.field2514 == var8.field2514 && var6.field2519 == var8.field2519) {
                                if (var8.field2511 < var6.field2511) {
                                    var2[var7] = var6;
                                }
                                continue label92;
                            }
                        }
                        var2[var3] = var6;
                        var3++;
                    }
                }
                class679.field9530 = new class189[var3];
                class569.method4246(var2, 0, class679.field9530, 0, var3);
                int[] var9 = new int[class679.field9530.length];
                for (int var10 = 0; var10 < class679.field9530.length; var10++) {
                    class189 var11 = class679.field9530[var10];
                    var9[var10] = var11.field2519 * var11.field2514;
                }
                class216.method1816(0, var9, class679.field9530);
            }
            field6550++;
            return class679.field9530;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field6553[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3456(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3457(char[] arg0) {
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
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
