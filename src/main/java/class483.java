import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class483 extends class417 {

    @OriginalMember(owner = "client!iga", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field7337;

    @OriginalMember(owner = "client!iga", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field7338 = new String[] { method3685(method3684("g6zO{&")), method3685(method3684("g6zO\u0005g?r\u0015\u0007&")), method3685(method3684("`$w\r")), method3685(method3684("u\u007f5OD")), method3685(method3684("g6zO}&")), method3685(method3684("g6zO|&")) };

    @OriginalMember(owner = "client!iga", name = "H", descriptor = "[I")
    public static int[] field7333 = new int[25];

    @OriginalMember(owner = "client!iga", name = "E", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!iga", name = "G", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!iga", name = "D", descriptor = "[[Z")
    public static boolean[][] field7334;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method3155(int arg0) {
        try {
            field7336++;
            if (arg0 <= 121) {
                this.field7337 = null;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7338[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 17)
    public class483(Object arg0, int arg1) {
        super(arg1);
        try {
            this.field7337 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7338[1] + (arg0 == null ? field7338[2] : field7338[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(Z)V", line = 30)
    public static void method3682(boolean arg0) {
        try {
            field7333 = null;
            if (!arg0) {
                field7333 = null;
            }
            field7334 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7338[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(III)V", line = 42)
    public static final void method3683(int arg0, int arg1, int arg2) {
        boolean var3 = class85.field1280[0][arg1][arg2] != null && class85.field1280[0][arg1][arg2].field4681 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class85.field1280[var4][arg1][arg2] == null) {
                class290 var5 = class85.field1280[var4][arg1][arg2] = new class290(var4);
                if (var3) {
                    var5.field4674++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 62)
    public final Object method3154(int arg0) {
        try {
            field7335++;
            return arg0 == -4850 ? this.field7337 : null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7338[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3684(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3685(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
