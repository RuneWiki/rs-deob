import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public abstract class class756 extends class206 {

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field10989 = method5488(method5487("w\u001ce]2>"));

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
    public static int field10988 = 2;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    public static int field10986 = -1;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "F")
    public static float field10987;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "I")
    public static int field10985;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)V", line = 13)
    public static final void method5486(byte arg0) {
        try {
            if (class232.field3505 != null) {
                class232.field3505.method579((byte) -21);
                class528.field7672 = null;
                class232.field3505 = null;
            }
            field10985++;
            if (arg0 != -7) {
                method5486((byte) -54);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10989 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(BLib;)V")
    public abstract void method38(byte arg0, class163 arg1);

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lkp;I)V")
    public abstract void method41(class514 arg0, int arg1);

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5487(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5488(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 22;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
