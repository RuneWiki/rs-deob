import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class44 extends class232 {

    @OriginalMember(owner = "client!gja", name = "q", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!gja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field641 = new String[] { method484(method483(",z\u001b\u007f\u0003c")), method484(method483(",z\u001b\u007f\u0001c")), method484(method483("%e\u0016=")), method484(method483("0>T\u007f=")), method484(method483(",z\u001b\u007f|\"~\u0013%~c")) };

    @OriginalMember(owner = "client!gja", name = "p", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!gja", name = "o", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!gja", name = "m", descriptor = "Ljka;")
    public static class228 field639;

    @OriginalMember(owner = "client!gja", name = "n", descriptor = "Lwca;")
    public static class486 field636;

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "(I)V", line = 4)
    public static void method481(int arg0) {
        try {
            field636 = null;
            field639 = null;
            if (arg0 <= 34) {
                method481(79);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field641[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)Luu;", line = 17)
    public final class240 method482(int arg0) {
        try {
            if (arg0 != 0) {
                this.method482(-21);
            }
            field638++;
            return class76.field1085;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field641[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(ILrj;Lmq;III)V", line = 30)
    public class44(int arg0, class252 arg1, class657 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field637 = arg5;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field641[4] + arg0 + ',' + (arg1 == null ? field641[2] : field641[3]) + ',' + (arg2 == null ? field641[2] : field641[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method483(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method484(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 122;
                    break;
                case 3:
                    var10005 = 81;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
