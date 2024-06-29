import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class79 {

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field896 = new String[] { method694(method693("Vy)f")), method694(method693("C\"k$\u001e")), method694(method693("Vm$$\"\u0010")) };

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Ltf;I)V", line = 13)
    public static final void method692(class310 arg0, int arg1) {
        try {
            arg0.field4915 = null;
            field895++;
            int var2 = arg0.field4918.length;
            for (int var3 = arg1; var3 < var2; var3++) {
                arg0.field4918[var3].field5492 = false;
            }
            class614[] var4 = class504.field7310;
            synchronized (class504.field7310) {
                if (var2 < class504.field7310.length && class217.field3326[var2] < 200) {
                    class504.field7310[var2].method4541((byte) 124, arg0);
                    int var10002 = class217.field3326[var2]++;
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field896[2] + (arg0 == null ? field896[0] : field896[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method693(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method694(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
