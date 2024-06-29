import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class708 {

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9890 = new String[] { method5072(method5071("v\u0019\u001c\u0019\u0017")), method5072(method5071("a\u000b^=\u001f")) };

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method5070(int arg0, int arg1, int arg2, int arg3) {
        try {
            field9889++;
            String var4 = field9890[1] + arg0 + "," + (arg1 >> 6) + "," + (arg3 >> 6) + "," + (arg1 & 0x3F) + "," + (arg3 & 0x3F);
            int var5 = 100 / ((7 - arg2) / 53);
            System.out.println(var4);
            class782.method5623(true, var4, -1937106807, false);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field9890[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5071(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5072(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
