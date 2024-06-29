import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class263 {

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4281 = new String[] { method2292(method2291("<\u0006\u001el3")), method2292(method2291("!\u0001\\C")), method2292(method2291("<\u0006\u001en3")), method2292(method2291("4Z\u001e\u0001f")), method2292(method2291("<\u0006\u001em3")) };

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "[[Ljava/lang/String;")
    public static String[][] field4276 = new String[][] { { method2292(method2291("\u0005\u0015^")), method2292(method2291("\t\u0011R")), method2292(method2291("\u0002\u0015B")), method2292(method2291("\u000e\u0004B")), method2292(method2291("\u0002\u0015I")), method2292(method2291("\u0005\u0001^")), method2292(method2291("\u0005\u0001\\")), method2292(method2291("\u000e\u0001W")), method2292(method2291("\u001c\u0011@")), method2292(method2291("\u0000\u0017D")), method2292(method2291("\u0001\u001bF")), method2292(method2291("\u000b\u0011S")) }, { method2292(method2291("\u0005\u0015^")), method2292(method2291("\t\u0011R")), method2292(method2291("\u0002\u0090B")), method2292(method2291("\u000e\u0004B")), method2292(method2291("\u0002\u0015Y")), method2292(method2291("\u0005\u0001^")), method2292(method2291("\u0005\u0001\\")), method2292(method2291("\u000e\u0001W")), method2292(method2291("\u001c\u0011@")), method2292(method2291("\u0000\u001fD")), method2292(method2291("\u0001\u001bF")), method2292(method2291("\u000b\u0011J")) }, { method2292(method2291("%\u0015^")), method2292(method2291(")\u009dF")), method2292(method2291("\"\u0015B\\")), method2292(method2291(".\u0002B")), method2292(method2291("\"\u0015Y")), method2292(method2291("%\u0001YA")), method2292(method2291("%\u0001YC")), method2292(method2291(".\u001bË[")), method2292(method2291("<\u0011@[")), method2292(method2291(" \u0017D")), method2292(method2291("!\u001bF")), method2292(method2291("+\u009dS")) }, { method2292(method2291("%\u0015^")), method2292(method2291(")\u0011F")), method2292(method2291("\"\u0015B")), method2292(method2291(".\u0016B")), method2292(method2291("\"\u0015Y")), method2292(method2291("%\u0001^")), method2292(method2291("%\u0001\\")), method2292(method2291(".\u0013_")), method2292(method2291("<\u0011D")), method2292(method2291(" \u0001D")), method2292(method2291("!\u001bF")), method2292(method2291("+\u0011J")) }, { method2292(method2291("%\u0015^")), method2292(method2291(")\u0011R")), method2292(method2291("\"\u0006D")), method2292(method2291(".\u0004B")), method2292(method2291("\"\u0011Y")), method2292(method2291("%\u0001^")), method2292(method2291("%\u0001\\")), method2292(method2291(".\u0001W")), method2292(method2291("<\u0011@")), method2292(method2291(" \u001fD")), method2292(method2291("!\u001bF")), method2292(method2291("+\u0011S")) } };

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "[I")
    public static int[] field4278 = new int[1024];

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field4275 = 0;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lac;Lac;B)V", line = 5)
    public static final void method2288(class568 arg0, class568 arg1, byte arg2) {
        try {
            if (arg1.field8246 != null) {
                arg1.method4173(-1);
            }
            field4277++;
            int var3 = 91 / ((22 - arg2) / 50);
            arg1.field8249 = arg0;
            arg1.field8246 = arg0.field8246;
            arg1.field8246.field8249 = arg1;
            arg1.field8249.field8246 = arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4281[4] + (arg0 == null ? field4281[1] : field4281[3]) + ',' + (arg1 == null ? field4281[1] : field4281[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIILha;III)V", line = 23)
    public static final void method2289(int arg0, int arg1, int arg2, int arg3, class63 arg4, int arg5, int arg6, int arg7) {
        try {
            class761.field11182 = arg4;
            field4280++;
            class102.field1499 = class761.field11182.method257();
            class135.field1910 = class761.field11182.method257();
            class595.field8594 = class761.field11182.method257();
            class537.field7888 = 0;
            class431.field6774 = arg5;
            class433.field6791 = arg3;
            class742.field10924 = arg7;
            class184.field2931 = 1;
            class765.field11214 = null;
            class574.field8297 = arg0;
            class667.field9483 = arg2;
            class244.method2105(arg1, arg6, arg0 - 57);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field4281[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field4281[1] : field4281[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V", line = 46)
    public static void method2290(byte arg0) {
        try {
            if (arg0 != -127) {
                method2289(-104, -11, 50, 56, null, -49, -102, 37);
            }
            field4276 = null;
            field4278 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4281[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2291(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2292(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 79;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
