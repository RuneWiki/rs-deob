import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class210 {

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public int field3051 = 2048;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public int field3054 = 2048;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public int field3056 = 0;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public int field3052 = 0;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3063 = new String[] { method1780(method1779("n\" aL")), method1780(method1779("{yb#")), method1780(method1779("|~ \f\u0019")), method1780(method1779("|~ \r\u0019")), method1780(method1779("|~ \u000e\u0019")) };

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field3055 = 0;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "Lsb;")
    public static class261 field3049 = new class261(96, 1);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "Z")
    public static boolean field3059 = false;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "Lhh;")
    public static class250 field3057 = new class250(3);

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field3062 = 0;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "F")
    public static float field3060;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "[Lrfa;")
    public static class202[] field3050;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjc;)V", line = 4)
    public final void method1776(int arg0, class711 arg1) {
        try {
            field3053++;
            while (true) {
                int var3 = arg1.method5128(0);
                if (var3 == 0) {
                    if (arg0 <= 2) {
                        field3061 = 40;
                        return;
                    } else {
                        return;
                    }
                }
                this.method1778(var3, 88, arg1);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3063[3] + arg0 + ',' + (arg1 == null ? field3063[1] : field3063[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 26)
    public static void method1777(int arg0) {
        try {
            if (arg0 >= -25) {
                field3059 = false;
            }
            field3050 = null;
            field3057 = null;
            field3049 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3063[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILjc;)V", line = 45)
    private final void method1778(int arg0, int arg1, class711 arg2) {
        try {
            if (arg0 == 1) {
                this.field3056 = arg2.method5128(0);
            } else if (arg0 == 2) {
                this.field3051 = arg2.method5116((byte) -109);
            } else if (arg0 == 3) {
                this.field3054 = arg2.method5116((byte) -112);
            } else if (arg0 == 4) {
                this.field3052 = arg2.method5087((byte) -26);
            }
            int var4 = -103 / ((arg1 + 46) / 63);
            field3058++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3063[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3063[1] : field3063[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1779(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1780(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
