import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class632 extends class568 {

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public int field9081;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public int field9077;

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
    public int field9080;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public int field9083;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "I")
    public int field9079;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "Z")
    public boolean field9075;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field9090 = new String[] { method4593(method4592("GI\u0006Hr")), method4593(method4592("GI\u000653FU\\7r")), method4593(method4592("GI\u0006Kr")), method4593(method4592("GI\u0006Jr")) };

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "Lqr;")
    public static class69 field9082 = new class69(8);

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "I")
    public static int field9086 = -2;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "Lvn;")
    public static class330 field9084 = new class330(55, 2);

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public static int field9087 = 0;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public static int field9088 = 0;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "Z")
    public static boolean field9089 = false;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "[Lhk;")
    public static class107[] field9085;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V", line = 5)
    public static final void method4589(int arg0) {
        try {
            if (arg0 == -19298) {
                field9078++;
                class358.method2969((byte) 104);
                class16.field177 = false;
                class481.method3669(class606.field8725, class209.field3290, class65.field897, class489.field7379, 0);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9090[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V", line = 21)
    public static final void method4590(int arg0) {
        try {
            field9076++;
            if (class409.method3284(false)) {
                if (class585.field8479 == null) {
                    class486.method3693(true);
                }
                class37.field427 = 0;
                class369.field5987 = true;
            }
            if (arg0 <= 82) {
                field9086 = 24;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9090[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 43)
    public static void method4591(int arg0) {
        try {
            field9085 = null;
            field9082 = null;
            field9084 = null;
            if (arg0 <= 105) {
                method4590(-47);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9090[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIIIIZ)V", line = 63)
    public class632(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            this.field9081 = arg0;
            this.field9077 = arg2;
            this.field9080 = arg1;
            this.field9083 = arg4;
            this.field9079 = arg3;
            this.field9075 = arg5;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field9090[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4592(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4593(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 40;
                    break;
                case 3:
                    var10005 = 9;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
