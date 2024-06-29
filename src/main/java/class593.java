import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public abstract class class593 {

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Ljj;")
    public class334 field8530;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8535 = new String[] { method4378(method4377("[D\u0000(~")), method4378(method4377("[D\u0000)~")), method4378(method4377("Z^B\u000e")), method4378(method4377("[D\u0000^?ZBZ\\~")), method4378(method4377("O\u0005\u0000L+")), method4378(method4377("[D\u0000,~")), method4378(method4377("[D\u0000/~")), method4378(method4377("[D\u00003~")), method4378(method4377("[D\u0000.~")) };

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field8532;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field8533;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIB)V")
    public abstract void method463(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZ)V")
    public abstract void method454(int arg0, boolean arg1);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IBLah;)V")
    public abstract void method452(int arg0, byte arg1, class764 arg2);

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)V")
    public void method3256(int arg0) {
        try {
            if (arg0 != 16934) {
                this.method1470(107);
            }
            field8528++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8535[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Z")
    public abstract boolean method458(int arg0);

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)V")
    public void method1470(int arg0) {
        try {
            field8533++;
            if (arg0 <= 71) {
                this.field8530 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8535[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BZ)V")
    public abstract void method460(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
    public abstract void method455(int arg0);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
    public void method1471(boolean arg0) {
        try {
            field8532++;
            if (arg0) {
                this.field8530 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8535[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "(I)V")
    public void method1473(int arg0) {
        try {
            field8529++;
            int var2 = 116 / ((50 - arg0) / 62);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8535[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "(I)V")
    public void method456(int arg0) {
        try {
            if (arg0 == 30824) {
                field8531++;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8535[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
    public void method1472(int arg0) {
        try {
            field8534++;
            if (arg0 != -5405) {
                this.method454(-65, true);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8535[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ljj;)V")
    public class593(class334 arg0) {
        try {
            this.field8530 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8535[3] + (arg0 == null ? field8535[2] : field8535[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4377(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x56);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4378(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 46;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
