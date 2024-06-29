import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class106 extends class541 {

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1535 = new String[] { method993(method992("\u0004 sb]I")), method993(method992("\u0004 sb^I")), method993(method992("\u001aj<bb")), method993(method992("\u000f1~ ")), method993(method992("\u0004 sb#\b*{8!I")), method993(method992("\u0004 sb\\I")) };

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "[[I")
    public static int[][] field1529 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "Lmp;")
    public static class796 field1528 = new class796(method993(method992("6\u0010[")), method993(method992("\u000e\"t%|\u0004")), method993(method992(">3f%")), 5);

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)V", line = 5)
    public static void method990(int arg0) {
        try {
            if (arg0 == 2) {
                field1529 = null;
                field1528 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1535[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)V", line = 16)
    public static final void method991(int arg0, int arg1) {
        try {
            class640.field9178.method294(arg1, arg0 ^ 0xFFFFFD8E);
            if (arg0 != 4) {
                method991(-26, -88);
            }
            field1533++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1535[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(ILjk;Ltda;III)V", line = 33)
    public class106(int arg0, class662 arg1, class666 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field1530 = arg5;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1535[4] + arg0 + ',' + (arg1 == null ? field1535[3] : field1535[2]) + ',' + (arg2 == null ? field1535[3] : field1535[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)Lwh;", line = 42)
    public final class155 method989(boolean arg0) {
        try {
            field1532++;
            return arg0 ? null : class663.field9444;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1535[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method992(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method993(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 31;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
