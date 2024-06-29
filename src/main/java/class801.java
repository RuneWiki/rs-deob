import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class801 extends class687 {

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Ljava/lang/String;")
    public String field11650;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "Ldp;")
    public class514 field11651;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field11659 = new String[] { method5780(method5779("Ti\u001b\u0002q")), method5780(method5779("Ti\u001b\u0004q")), method5780(method5779("XsY,")), method5780(method5779("M(\u001bn$")), method5780(method5779("Ti\u001b|0XoA~q")), method5780(method5779("Ti\u001b\u0005q")), method5780(method5779("Ti\u001b\u0003q")), method5780(method5779("Ti\u001b\u0001q")) };

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "[C")
    private static char[] field11649 = new char[64];

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "I")
    public static int field11652;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "Loba;")
    public static class739 field11657;

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "I")
    public static int field11658;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
    public static int field11648;

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
    public int field11653;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "I")
    public static int field11654;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field11655;

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
    public static int field11656;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field11649[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field11649[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field11649[var2] = (char) (var2 + 48 - 52);
        }
        field11649[62] = '*';
        field11649[63] = '-';
        field11652 = -1;
        field11657 = new class739();
        field11658 = 0;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLjka;)Z", line = 3)
    public final boolean method5774(byte arg0, class228 arg1) {
        try {
            field11648++;
            boolean var3 = true;
            arg1.method4911(119);
            for (class228 var4 = (class228) this.field11651.method3932((byte) -114); var4 != null; var4 = (class228) this.field11651.method3939((byte) -75)) {
                if (class269.method2206(arg1.field3311, var4.field3311, (byte) -122)) {
                    class52.method559((byte) 91, arg1, var4);
                    this.field11653++;
                    if (var3) {
                        return false;
                    }
                    return true;
                }
                var3 = false;
            }
            if (arg0 != 52) {
                field11652 = 17;
            }
            this.field11651.method3937(true, arg1);
            this.field11653++;
            return var3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field11659[5] + arg0 + ',' + (arg1 == null ? field11659[2] : field11659[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)I", line = 37)
    public final int method5775(int arg0) {
        try {
            if (arg0 <= 73) {
                this.field11653 = -22;
            }
            field11654++;
            return this.field11651.field7555.field9626 == this.field11651.field7555 ? -1 : ((class228) this.field11651.field7555.field9626).field3311;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11659[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 79)
    public static void method5776(int arg0) {
        try {
            field11657 = null;
            field11649 = null;
            if (arg0 != -52) {
                method5776(121);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11659[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjka;)Z", line = 92)
    public final boolean method5777(int arg0, class228 arg1) {
        try {
            field11655++;
            int var3 = this.method5775(104);
            if (arg0 != 4118) {
                return true;
            }
            arg1.method4911(arg0 ^ 0x1069);
            this.field11653--;
            if (this.field11653 != 0) {
                return this.method5775(arg0 ^ 0x1043) != var3;
            }
            this.method4294(0);
            this.method4911(arg0 ^ 0x106C);
            class17.field221--;
            class721.field10264.method2051(arg1.field3303, this, 93);
            return false;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11659[6] + arg0 + ',' + (arg1 == null ? field11659[2] : field11659[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 117)
    public class801(String arg0) {
        try {
            this.field11650 = arg0;
            this.field11651 = new class514();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11659[4] + (arg0 == null ? field11659[2] : field11659[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIIIBI)Z", line = 127)
    public static final boolean method5778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        try {
            field11656++;
            if (arg7 < 113) {
                field11649 = null;
            }
            if (arg1 < arg4 + arg8 && arg4 < (arg0 + arg1)) {
                return arg5 + arg6 > arg2 && arg6 < arg2 + arg3;
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field11659[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5779(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5780(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
