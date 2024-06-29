import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class650 extends class756 {

    @OriginalMember(owner = "client!lha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9411 = new String[] { method4775(method4774("/!h%")), method4775(method4774("-<eg\u0006i")), method4775(method4774(":z*g9")), method4775(method4774("-<eg\u0007i")) };

    @OriginalMember(owner = "client!lha", name = "t", descriptor = "B")
    private byte field9405;

    @OriginalMember(owner = "client!lha", name = "q", descriptor = "B")
    private byte field9407;

    @OriginalMember(owner = "client!lha", name = "n", descriptor = "B")
    private byte field9408;

    @OriginalMember(owner = "client!lha", name = "o", descriptor = "B")
    private byte field9409;

    @OriginalMember(owner = "client!lha", name = "s", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!lha", name = "v", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!lha", name = "r", descriptor = "I")
    public static int field9406;

    @OriginalMember(owner = "client!lha", name = "u", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!lha", name = "p", descriptor = "Z")
    private boolean field9402;

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lkp;I)V")
    public final void method41(class514 arg0, int arg1) {
        try {
            arg0.field7433 = this.field9409;
            arg0.field7427 = this.field9407;
            if (arg1 == 9893) {
                field9406++;
                arg0.field7405 = this.field9402;
                arg0.field7435 = this.field9405;
                arg0.field7412 = this.field9408;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9411[3] + (arg0 == null ? field9411[0] : field9411[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lha", name = "a", descriptor = "(BLib;)V")
    public final void method38(byte arg0, class163 arg1) {
        try {
            this.field9402 = arg1.method1455((byte) 62) == 1;
            field9403++;
            this.field9408 = arg1.method1414(1);
            this.field9405 = arg1.method1414(1);
            this.field9407 = arg1.method1414(1);
            this.field9409 = arg1.method1414(1);
            if (arg0 < 32) {
                this.field9407 = 87;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9411[1] + arg0 + ',' + (arg1 == null ? field9411[0] : field9411[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!lha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4774(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4775(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 68;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
