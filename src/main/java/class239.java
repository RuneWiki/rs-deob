import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class239 {

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public int field3669;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field3665;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "B")
    public byte field3674;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3689 = new String[] { method2065(method2064("od\u000f<+")), method2065(method2064("od\u000fAjtdUC+")), method2065(method2064("od\u000f?+")), method2065(method2064("od\u000f>+")) };

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "Ljca;")
    public static class715 field3676 = new class715(0);

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "[I")
    public static int[] field3685 = new int[2048];

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Lsa;")
    public static class214 field3686;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lsa;")
    public static class214 field3687 = field3686 = new class214(false);

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Lwc;")
    public static class71 field3688 = new class71();

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public int field3664;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Lui;")
    public class239 field3678;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "Lwt;")
    public static class328 field3682;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lmj;")
    public static class683 field3684;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZI)Lui;")
    public final class239 method2061(int arg0, int arg1, boolean arg2, int arg3) {
        try {
            if (!arg2) {
                this.field3667 = -61;
            }
            field3673++;
            return new class239(this.field3668, arg3, arg1, arg0, this.field3674);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3689[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static void method2062(byte arg0) {
        try {
            field3682 = null;
            field3685 = null;
            int var1 = 58 % ((13 - arg0) / 43);
            field3686 = null;
            field3676 = null;
            field3684 = null;
            field3688 = null;
            field3687 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3689[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Lnka;")
    public final class309 method2063(boolean arg0) {
        try {
            field3672++;
            return arg0 ? null : class534.method3983(this.field3668, -30534);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3689[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIB)V")
    public class239(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            this.field3669 = arg3;
            this.field3668 = arg0;
            this.field3670 = arg2;
            this.field3665 = arg1;
            this.field3674 = arg4;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3689[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2064(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2065(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
