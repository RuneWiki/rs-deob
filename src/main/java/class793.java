import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class793 implements class245 {

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public int field11540;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public int field11542;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public int field11529;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public int field11535;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public int field11531;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public int field11538;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public int field11534;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public int field11528;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "Lmq;")
    public class657 field11536;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Z")
    public boolean field11537;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Lrj;")
    public class252 field11532;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11544 = new String[] { method5719(method5718("dQ\n\u001b")), method5719(method5718("q\nHY\t")), method5719(method5718("kWHK\u001ddM\u0012I\\")), method5719(method5718("kWH6\\")), method5719(method5718("kWH4\\")), method5719(method5718("kWH5\\")) };

    @OriginalMember(owner = "client!as", name = "b", descriptor = "Z")
    public static boolean field11533 = true;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "I")
    public static int field11530;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field11539;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field11541;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field11543;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;", line = 17)
    public static final String[] method5716(char arg0, String arg1, int arg2) {
        try {
            field11541++;
            int var3 = class795.method5736((byte) -58, arg0, arg1);
            String[] var4 = new String[var3 + 1];
            int var5 = 0;
            int var6 = 0;
            if (arg2 >= -20) {
                field11530 = -14;
            }
            for (int var7 = 0; var7 < var3; var7++) {
                int var8;
                for (var8 = var6; arg1.charAt(var8) != arg0; var8++) {
                }
                var4[var5++] = arg1.substring(var6, var8);
                var6 = var8 + 1;
            }
            var4[var3] = arg1.substring(var6);
            return var4;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field11544[3] + arg0 + ',' + (arg1 == null ? field11544[0] : field11544[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Luu;", line = 59)
    public final class240 method482(int arg0) {
        try {
            field11543++;
            return arg0 == 0 ? class80.field1126 : null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11544[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIZ)Z", line = 71)
    public static final boolean method5717(int arg0, int arg1, boolean arg2) {
        try {
            field11539++;
            if (!arg2) {
                method5717(17, 11, true);
            }
            return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11544[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(ILrj;Lmq;IIIIIIIZ)V", line = 84)
    public class793(int arg0, class252 arg1, class657 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        try {
            this.field11540 = arg0;
            this.field11542 = arg7;
            this.field11529 = arg8;
            this.field11535 = arg3;
            this.field11531 = arg4;
            this.field11538 = arg5;
            this.field11534 = arg6;
            this.field11528 = arg9;
            this.field11536 = arg2;
            this.field11537 = arg10;
            this.field11532 = arg1;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field11544[2] + arg0 + ',' + (arg1 == null ? field11544[0] : field11544[1]) + ',' + (arg2 == null ? field11544[0] : field11544[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!as", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5718(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x74);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!as", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5719(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 116;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
