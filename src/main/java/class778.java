import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class778 extends class742 {

    @OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
    public int field11084;

    @OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
    public int field11085;

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11086 = new String[] { method5601(method5600("0\u000f(")), method5601(method5600("w\u0017a^u0L")), method5601(method5600("3\u0002'")), method5601(method5600("q\u0016yB")), method5601(method5600("0\u0013(")), method5601(method5600("0\t")), method5601(method5600("3\f")), method5601(method5600("0\u0002(")), method5601(method5600("dM;\u00002")), method5601(method5600("i\u000e;og")), method5601(method5600("@\u0010pB)")), method5601(method5600("i\u000e;\u0012&q\na\u0010g")), method5601(method5600("i\u000e;lg")), method5601(method5600("i\u000e;mg")) };

    @OriginalMember(owner = "client!vm", name = "q", descriptor = "Z")
    public static boolean field11082 = false;

    @OriginalMember(owner = "client!vm", name = "s", descriptor = "[[I")
    public static int[][] field11080 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
    public static int field11081;

    @OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
    public static int field11083;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
    public static void method5598(byte arg0) {
        try {
            if (arg0 > -120) {
                field11080 = null;
            }
            field11080 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11086[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Luu;")
    public final class240 method482(int arg0) {
        try {
            field11081++;
            if (arg0 != 0) {
                field11080 = null;
            }
            return class112.field1447;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11086[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lrj;Lmq;IIIIIIIIII)V")
    public class778(class252 arg0, class657 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        try {
            this.field11084 = arg10;
            this.field11085 = arg11;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field11086[11] + (arg0 == null ? field11086[3] : field11086[8]) + ',' + (arg1 == null ? field11086[3] : field11086[8]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILjava/lang/String;)Z")
    public static final boolean method5599(int arg0, int arg1, String arg2) {
        try {
            field11083++;
            if (class651.field9249.field2479) {
                class467.field6812 = new class792();
                class467.field6812.field11524 = arg0;
                class467.field6812.field11516 = arg2;
                if (class398.field5793 != class35.field426) {
                    class467.field6812.field11518 = class467.field6812.field11524 + 50000;
                    class467.field6812.field11525 = class467.field6812.field11524 + 40000;
                }
                for (int var3 = 0; var3 < class390.field5689.length; var3++) {
                    if (arg0 == class390.field5689[var3].field10431) {
                        class451.field6613 = class390.field5689[var3].field4965;
                    }
                }
                return true;
            }
            String var4 = "";
            if (class398.field5793 != class35.field426) {
                var4 = ":" + (arg0 + 7000);
            }
            String var5 = "";
            if (class269.field3808 != null) {
                var5 = field11086[4] + class269.field3808;
            }
            String var6 = field11086[1] + arg2 + var4 + field11086[0] + class405.field5883 + field11086[7] + class713.field10069 + var5 + field11086[5] + (class104.field1371 ? "1" : "0") + field11086[6] + (class369.field5346 ? "1" : "0") + field11086[2];
            try {
                if (arg1 != 24611) {
                    field11082 = true;
                }
                class572.field8287.getAppletContext().showDocument(new URL(var6), field11086[10]);
                return true;
            } catch (Exception var8) {
                return false;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field11086[9] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11086[3] : field11086[8]) + ')');
        }
    }

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5600(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5601(char[] arg0) {
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
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
