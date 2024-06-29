import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class287 {

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4070 = new String[] { method2336(method2335("4i~T")), method2336(method2335("*{<y\u001c")), method2336(method2335("!2<\u0016I")), method2336(method2335("\u0019}pZU=y")), method2336(method2335("*{<z\u001c")) };

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lmv;")
    public static class125 field4067 = new class125(10, 16);

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "Lda;")
    public static class216 field4066;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 4)
    public static void method2333(int arg0) {
        try {
            field4067 = null;
            int var1 = 7 % ((arg0 + 26) / 54);
            field4066 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4070[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjc;I)Ljava/lang/String;", line = 19)
    public static final String method2334(int arg0, class711 arg1, int arg2) {
        try {
            field4068++;
            try {
                int var3 = arg1.method5090(-120);
                if (arg2 < var3) {
                    var3 = arg2;
                }
                byte[] var4 = new byte[var3];
                arg1.field9945 += class142.field1840.method4476(arg1.field9996, (byte) 94, var3, 0, var4, arg1.field9945);
                return class201.method1728(arg0, var3, -11887, var4);
            } catch (Exception var7) {
                return field4070[3];
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4070[1] + arg0 + ',' + (arg1 == null ? field4070[0] : field4070[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2335(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2336(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
