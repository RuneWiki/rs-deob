import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class549 extends class568 {

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "[B")
    public byte[] field8061;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8063 = new String[] { method4080(method4079("O<U\u001b%")), method4080(method4079("O<U\u0018%")), method4080(method4079("O \u00176")), method4080(method4079("Z{Utp")), method4080(method4079("O<UfdO<\u000fd%")) };

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Lvn;")
    public static class330 field8060 = new class330(78, 3);

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static final void method4077(byte arg0) {
        try {
            field8062++;
            for (class318 var1 = (class318) class239.field3688.method744(32); var1 != null; var1 = (class318) class239.field3688.method744(32)) {
                class537.method4010(false, var1);
            }
            int var2;
            int var3;
            if (class623.field8996.field6356.method4838(true) == 1) {
                var2 = 3;
                var3 = 0;
            } else {
                var2 = class262.field4264;
                var3 = class262.field4264;
            }
            if (arg0 != -78) {
                method4077((byte) 39);
            }
            client.method2702();
            for (int var4 = var3; var4 <= var2; var4++) {
                client.method2715();
                client.method2696(var4);
                client.method2698(var4);
            }
            client.method2697();
            client.method2703();
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8063[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([B)V")
    public class549(byte[] arg0) {
        try {
            this.field8061 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8063[4] + (arg0 == null ? field8063[2] : field8063[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method4078(int arg0) {
        try {
            if (arg0 != 78) {
                field8059 = -68;
            }
            field8060 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8063[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4079(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4080(char[] arg0) {
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
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
