import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class676 extends class206 implements class462 {

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9808 = new String[] { method4965(method4964("mZ\u0004\tk")), method4965(method4964("mZ\u0004\u000bk")), method4965(method4964("mZ\u0004\u000fk")), method4965(method4964("mZ\u0004\fk")), method4965(method4964("mZ\u0004\bk")), method4965(method4964("mZ\u0004\u000ek")) };

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field9793 = -1;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field9797 = 100;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field9805 = 0;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field9807 = 0;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "C")
    public char field9802;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public int field9794;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public int field9796;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field9798;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public int field9806;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "J")
    public long field9795;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)J", line = 8)
    public final long method3519(int arg0) {
        try {
            field9801++;
            return arg0 == -4881 ? this.field9795 : 9L;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9808[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BIIII)V", line = 19)
    public static final void method4963(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if ((arg3 - arg2) >= class200.field3119 && field9797 >= arg2 + arg3 && field9807 <= arg4 - arg2 && class381.field5786 >= arg2 + arg4) {
                class448.method3453(arg2, arg1, arg4, (byte) -116, arg3);
            } else {
                class544.method4109(arg3, arg4, 0, arg1, arg2);
            }
            field9804++;
            int var5 = 14 / ((55 - arg0) / 58);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9808[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)C", line = 46)
    public final char method3516(int arg0) {
        try {
            if (arg0 != 13112) {
                this.field9794 = 104;
            }
            field9803++;
            return this.field9802;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9808[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I", line = 58)
    public final int method3518(int arg0) {
        try {
            int var2 = 117 / ((30 - arg0) / 62);
            field9800++;
            return this.field9796;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9808[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I", line = 73)
    public final int method3517(byte arg0) {
        try {
            field9798++;
            int var2 = 22 / ((54 - arg0) / 42);
            return this.field9794;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9808[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)I", line = 84)
    public final int method3520(byte arg0) {
        try {
            field9799++;
            int var2 = 100 % ((arg0 - 15) / 33);
            return this.field9806;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9808[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4964(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4965(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
