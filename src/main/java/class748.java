import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class748 {

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10667 = new String[] { method5420(method5419("BlD`?")), method5420(method5419("BlDa?")), method5420(method5419("BlDc?")) };

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field10664 = -2;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "[Lem;")
    public static class339[] field10666 = new class339[2048];

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field10663;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field10665;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static void method5416(byte arg0) {
        try {
            if (arg0 != -22) {
                method5418(-43, 15, (byte) -14);
            }
            field10666 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10667[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method5417(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            if (arg0 != -52) {
                field10664 = -93;
            }
            field10665++;
            if (arg6 >= 1 && arg7 >= 1 && class625.field8929 - 2 >= arg6 && arg7 <= (class14.field187 - 2)) {
                int var9 = arg8;
                if (arg8 < 3 && class23.method275(arg0 + 53, arg6, arg7)) {
                    var9 = arg8 + 1;
                }
                if (class451.field6612.field9089.method5427(3) == 0 && !class676.method4844(arg7, true, arg6, class475.field6973, var9)) {
                    return;
                }
                if (class608.field8715 == null) {
                    return;
                }
                class334.field4579.method5728(-158987223, arg8, arg7, class195.field2919[arg8], arg6, arg5, class236.field3418);
                if (arg2 >= 0) {
                    int var10 = class451.field6612.field9091.method3900(3);
                    class451.field6612.method4681(1, class451.field6612.field9091, (byte) -111);
                    class334.field4579.method5720(var9, class195.field2919[arg8], class236.field3418, arg6, arg8, arg3, (byte) -84, arg2, arg4, arg1, arg7);
                    class451.field6612.method4681(var10, class451.field6612.field9091, (byte) -111);
                    return;
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field10667[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIB)I")
    public static final int method5418(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 != 17) {
                field10664 = 58;
            }
            field10663++;
            int var3 = class8.method56(arg0 + 91923, 4, arg1 + 45365, arg2 ^ 0x10) + (class8.method56(arg0 + 37821, 2, arg1 + 10294, 1) - 128 >> 1) + (class8.method56(arg0, 1, arg1, 1) + -128 >> 2) - 128;
            int var4 = (int) ((double) var3 * 0.3D) + 35;
            if (var4 < 10) {
                var4 = 10;
            } else if (var4 > 60) {
                var4 = 60;
            }
            return var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10667[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5419(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5420(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 106;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
