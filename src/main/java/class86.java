import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class86 extends class21 {

    @OriginalMember(owner = "client!haa", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field1287;

    @OriginalMember(owner = "client!haa", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field1289 = new String[] { method860(method859(";(5\u0015\u0007{")), method860(method859(";(5\u0015\u0004{")), method860(method859(";(5\u0015\u0006{")), method860(method859("=<8W")), method860(method859("(gz\u00158")), method860(method859(";(5\u0015y:'=O{{")) };

    @OriginalMember(owner = "client!haa", name = "D", descriptor = "[I")
    public static int[] field1288 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!haa", name = "B", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!haa", name = "E", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(B)Z")
    public final boolean method138(byte arg0) {
        try {
            if (arg0 == 101) {
                field1286++;
                return false;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1289[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "c", descriptor = "(I)V")
    public static void method858(int arg0) {
        try {
            if (arg0 != 0) {
                field1288 = null;
            }
            field1288 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1289[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lnba;Ljava/lang/Object;I)V")
    public class86(class314 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        try {
            this.field1287 = arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1289[5] + (arg0 == null ? field1289[3] : field1289[4]) + ',' + (arg1 == null ? field1289[3] : field1289[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method139(boolean arg0) {
        try {
            if (arg0) {
                field1285++;
                return this.field1287;
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1289[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method859(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!haa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method860(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 84;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
