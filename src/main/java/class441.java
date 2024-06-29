import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class441 {

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public int field6520;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "Lrfa;")
    public class202 field6514;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public int field6519;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public int field6516;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public int field6515;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public int field6510;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public int field6513;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "B")
    public byte field6508;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6523 = new String[] { method3437(method3436("fxz2")), method3437(method3436("n{8b.fdb`o")), method3437(method3436("s#8p:")), method3437(method3436("n{8\u001do")), method3437(method3436("n{8\u001fo")), method3437(method3436("n{8\u001co")) };

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "Lsb;")
    public static class261 field6512 = new class261(28, 6);

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "Leia;")
    public class186 field6518;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "Lvfa;")
    public class313 field6522;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "Lwi;")
    public class373 field6509;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "Lhba;")
    public class93 field6511;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)V", line = 8)
    public static void method3433(byte arg0) {
        try {
            if (arg0 == 67) {
                field6512 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6523[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 20)
    public static final void method3434(String arg0, int arg1) {
        try {
            class273.field3877 = arg0;
            field6521++;
            class26.field326 = class273.field3877.length();
            int var2 = 49 / ((arg1 - 29) / 52);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6523[4] + (arg0 == null ? field6523[0] : field6523[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)Z", line = 36)
    public final boolean method3435(byte arg0) {
        try {
            field6517++;
            int var2 = 74 % ((arg0 - 12) / 36);
            return this.field6508 == 2 || this.field6508 == 3;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6523[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(BIIIIIILrfa;)V", line = 54)
    public class441(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class202 arg7) {
        try {
            this.field6520 = arg4;
            this.field6514 = arg7;
            this.field6519 = arg6;
            this.field6516 = arg1;
            this.field6515 = arg3;
            this.field6510 = arg2;
            this.field6513 = arg5;
            this.field6508 = arg0;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field6523[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field6523[0] : field6523[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3436(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x47);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3437(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 71;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
