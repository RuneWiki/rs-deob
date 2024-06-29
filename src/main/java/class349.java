import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class class349 extends class46 {

    @OriginalMember(owner = "client!js", name = "v", descriptor = "I")
    public int field5391;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5396 = new String[] { method2871(method2870("\n`\u0010'4")), method2871(method2870("\n`\u0010Qu\u000ezJS4")), method2871(method2870("\n`\u0010$4")), method2871(method2870("\n`\u0010%4")) };

    @OriginalMember(owner = "client!js", name = "s", descriptor = "Lvha;")
    public static class713 field5393 = new class713(6, -1);

    @OriginalMember(owner = "client!js", name = "u", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 7)
    public static final void method2867(int arg0) {
        try {
            field5394++;
            class601.field8821.method1559(arg0 ^ arg0);
            class417.field6157.method1559(arg0 - 6);
            class38.field446.method1559(0);
            class356.field5473.method1559(arg0 ^ 0x6);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5396[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V", line = 18)
    public static void method2868(int arg0) {
        try {
            if (arg0 == 779) {
                field5393 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5396[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(B)[Lvea;", line = 28)
    public static final class288[] method2869(byte arg0) {
        try {
            if (arg0 > -9) {
                method2869((byte) 38);
            }
            field5392++;
            return new class288[] { class234.field3524, class255.field3952, class115.field1372 };
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5396[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V", line = 38)
    public class349(int arg0) {
        try {
            this.field5391 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5396[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)Z")
    public abstract boolean method390(boolean arg0);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method389(boolean arg0);

    @OriginalMember(owner = "client!js", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2870(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!js", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2871(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 28;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
