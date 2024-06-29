import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public abstract class class724 extends class299 {

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10467 = new String[] { method5279(method5278("$bGeH\u007f")), method5279(method5278("9rJ'")), method5279(method5278(",)\bet")), method5279(method5278("$bGeK\u007f")), method5279(method5278("$bGeM\u007f")) };

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "Lvaa;")
    public static class494 field10464 = new class494(7, 2);

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    public static int field10463;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "I")
    public static int field10465;

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
    public static int field10466;

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)Lrr;")
    public abstract class380 method4135(int arg0);

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILpda;)I")
    public static final int method5275(int arg0, class655 arg1) {
        try {
            field10465++;
            String var2 = class217.method1900(15, arg1);
            if (arg0 != 1) {
                method5277((byte) 3);
            }
            return class475.field6895.method4316(var2, class106.field1221, (byte) -78);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10467[3] + arg0 + ',' + (arg1 == null ? field10467[1] : field10467[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
    public static final void method5276(int arg0) {
        try {
            int var1 = -64 / ((arg0 + 34) / 39);
            class198.field3097.method584(class134.field1561, class289.field4305.field827.method3572(false) == 1 ? class616.field9054 + 256 << 2 : -1, 0);
            field10463++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10467[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
    public static void method5277(byte arg0) {
        try {
            field10464 = null;
            if (arg0 > -76) {
                field10466 = 55;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10467[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5278(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5279(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 87;
                    break;
                case 1:
                    var10005 = 7;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
