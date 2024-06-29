import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class691 {

    @OriginalMember(owner = "client!jka", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field9965 = method5027(method5026("\u001aU#%=X"));

    @OriginalMember(owner = "client!jka", name = "c", descriptor = "J")
    public static long field9961 = -1L;

    @OriginalMember(owner = "client!jka", name = "b", descriptor = "I")
    public static int field9962 = 0;

    @OriginalMember(owner = "client!jka", name = "d", descriptor = "I")
    public static int field9964;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "Lbv;")
    public class322 field9963;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IZI)V", line = 19)
    public static final void method5025(int arg0, boolean arg1, int arg2) {
        try {
            field9964++;
            class328 var3 = arg1 ? class239.field3682 : class201.field3181;
            if (var3 != null && arg2 >= 0 && var3.field5381 > arg2) {
                class432 var4 = var3.field5376[arg2];
                if (var4.field6785 == -1) {
                    String var5 = var4.field6783;
                    class164 var6 = class193.method1785(false);
                    class487 var7 = class618.method4519(arg0 ^ 0x64, class242.field3718, var6.field2659);
                    var7.field7362.method1678(arg0 + class126.method1216(104, var5), 65280);
                    var7.field7362.method1678(arg1 ? 1 : 0, arg0 ^ 0xFF03);
                    var7.field7362.method1650((byte) -95, arg2);
                    var7.field7362.method1681(var5, arg0 + 23134);
                    var6.method1546(var7, 1);
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field9965 + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5026(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5027(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
