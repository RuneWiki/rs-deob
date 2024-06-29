import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class597 implements class102 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field8585;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public int field8582;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[F")
    public float[] field8583;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8588 = new String[] { method4409(method4408("<#uXt")), method4409(method4408("<#u[t")), method4409(method4408("<#u^t")), method4409(method4408("2':")), method4409(method4408("<#u&5:)/$t")), method4409(method4408("<#uYt")) };

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field8584 = 0;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
    public static int[] field8586 = new int[8];

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method4404(int arg0) {
        try {
            if (arg0 == -19350) {
                field8586 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8588[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z")
    public static final boolean method4405(int arg0, int arg1, int arg2) {
        try {
            int var3 = 45 % ((arg1 - 54) / 58);
            field8587++;
            return (arg2 & 0x37) != 0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8588[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lci;")
    public static final class49 method4406(int arg0) {
        try {
            field8581++;
            try {
                return arg0 == 55 ? (class49) Class.forName(field8588[3]).getDeclaredConstructor().newInstance() : null;
            } catch (Throwable var2) {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8588[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V")
    public class597(int arg0, int arg1) {
        try {
            this.field8585 = arg0;
            this.field8582 = arg1;
            this.field8583 = new float[arg0 * arg1];
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8588[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(JJ)J")
    public static long method4407(long arg0, long arg1) {
        try {
            return arg0 | arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8588[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4408(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4409(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
