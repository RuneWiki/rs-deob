import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class405 {

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5884 = new String[] { method3175(method3174("\u000f;.'")), method3175(method3174("\u00158l\n\u001e")), method3175(method3174("\u001a`leK")), method3175(method3174("\u00158l\t\u001e")), method3175(method3174("\u00158l\b\u001e")) };

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "Lsb;")
    public static class261 field5880 = new class261(14, -1);

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field5883 = 0;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Lkl;")
    public static class740 field5882 = new class740();

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Lht;")
    public static class792 field5878;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V", line = 3)
    public static void method3171(int arg0) {
        try {
            field5878 = null;
            field5882 = null;
            if (arg0 != 10) {
                method3172(-45, 43, null, -48, 90, -89, 72, 58, -5, null, 22, 50, -39);
            }
            field5880 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5884[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II[[[BIIIIIILha;III)V", line = 17)
    public static final void method3172(int arg0, int arg1, byte[][][] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class18 arg9, int arg10, int arg11, int arg12) {
        try {
            field5881++;
            if (arg6 != 0 && arg1 != 0) {
                if (arg6 == 9) {
                    arg6 = 1;
                    arg8 = arg8 + 1 & 0x3;
                }
                if (arg6 == 10) {
                    arg6 = 1;
                    arg8 = arg8 + 3 & 0x3;
                }
                if (arg6 == 11) {
                    arg6 = 8;
                    arg8 = arg8 + 3 & 0x3;
                }
                arg9.method190(arg10, arg4, arg11, arg7, arg3, arg5, arg2[arg6 - 1][arg8], arg1, arg0);
                if (arg12 != 1) {
                    method3172(-68, -31, null, 82, -13, 96, 8, -26, -63, null, 17, -115, 51);
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field5884[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5884[0] : field5884[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field5884[0] : field5884[2]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;II)V", line = 50)
    public static final void method3173(String arg0, int arg1, String arg2, String arg3, byte arg4, String arg5, String arg6, int arg7, int arg8) {
        try {
            field5879++;
            if (arg4 > -65) {
                method3172(-83, -53, null, 36, -34, 49, 40, -109, 47, null, -52, 105, -125);
            }
            class425 var9 = class783.field11301[99];
            for (int var10 = 99; var10 > 0; var10--) {
                class783.field11301[var10] = class783.field11301[var10 - 1];
            }
            if (var9 == null) {
                var9 = new class425(arg1, arg8, arg6, arg2, arg0, arg5, arg7, arg3);
            } else {
                var9.method3297(arg0, arg8, arg7, arg6, arg3, arg1, arg5, arg2, (byte) 52);
            }
            class783.field11301[0] = var9;
            class446.field6563++;
            class273.field3873 = class522.field7612;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field5884[1] + (arg0 == null ? field5884[0] : field5884[2]) + ',' + arg1 + ',' + (arg2 == null ? field5884[0] : field5884[2]) + ',' + (arg3 == null ? field5884[0] : field5884[2]) + ',' + arg4 + ',' + (arg5 == null ? field5884[0] : field5884[2]) + ',' + (arg6 == null ? field5884[0] : field5884[2]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3174(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3175(char[] arg0) {
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
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
