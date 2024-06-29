import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class282 extends class131 {

    @OriginalMember(owner = "client!gia", name = "x", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!gia", name = "y", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!gia", name = "w", descriptor = "I")
    public int field4585;

    @OriginalMember(owner = "client!gia", name = "A", descriptor = "I")
    public int field4580;

    @OriginalMember(owner = "client!gia", name = "t", descriptor = "I")
    public int field4584;

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!gia", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field4588 = new String[] { method2410(method2409("xED \u000b7")), method2410(method2409("xED \r7")), method2410(method2409("qYIb")), method2410(method2409("xED uvBLzw7")), method2410(method2409("d\u0002\u000b 4")) };

    @OriginalMember(owner = "client!gia", name = "v", descriptor = "[F")
    public static float[] field4582 = new float[16];

    @OriginalMember(owner = "client!gia", name = "u", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(Z)Lwh;", line = 9)
    public class155 method989(boolean arg0) {
        try {
            field4583++;
            if (arg0) {
                method2408((byte) 70);
            }
            return class484.field7347;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4588[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Ljk;Ltda;IIIIIIIIIIIII)V", line = 23)
    public class282(class662 arg0, class666 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        try {
            this.field4586 = arg14;
            this.field4587 = arg9;
            this.field4585 = arg11;
            this.field4580 = arg10;
            this.field4584 = arg12;
            this.field4581 = arg13;
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field4588[3] + (arg0 == null ? field4588[2] : field4588[4]) + ',' + (arg1 == null ? field4588[2] : field4588[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
        }
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(B)V", line = 41)
    public static void method2408(byte arg0) {
        try {
            if (arg0 != -8) {
                field4582 = null;
            }
            field4582 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4588[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2409(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2410(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
