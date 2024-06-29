import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class235 {

    @OriginalMember(owner = "client!q", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3399 = new String[] { method1950(method1949("x\u0014l\u0016")), method1950(method1949("x\u0014m\u0016")), method1950(method1949("x\u0014n\u0016")) };

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    public static int[] field3396 = new int[25];

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public int field3387;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public int field3397;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "[B")
    public byte[] field3386;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "[B")
    public byte[] field3388;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)Z")
    public static final boolean method1946(int arg0, int arg1, int arg2) {
        try {
            if (arg0 != 1) {
                method1948(-105, (byte) 38);
            }
            field3389++;
            return class506.method3866(arg1, arg2, -12) || class459.method3529(arg1, arg2, -8707);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3399[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method1947(int arg0) {
        try {
            field3396 = null;
            if (arg0 != 2537) {
                method1946(-128, -22, -51);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3399[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
    public static final void method1948(int arg0, byte arg1) {
        try {
            class238.field3445 = null;
            class760.field10848 = 0;
            class11.field150 = -1;
            class430.field6242 = null;
            class713.field10110 = arg0;
            class443.field6543 = -1;
            if (arg1 >= -16) {
                field3396 = null;
            }
            class385.field5631 = 1;
            field3398++;
            class189.field2517 = false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3399[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!q", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1949(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!q", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1950(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
