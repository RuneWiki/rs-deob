import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class335 {

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Lffa;")
    private class197 field5231;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "J")
    public long field5237;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5238 = new String[] { method2807(method2806("E8\u0005cz")), method2807(method2806("Hu\u0005qnP\u007f_s/")), method2807(method2806("PcG!")), method2807(method2806("Hu\u0005\f/")), method2807(method2806("Hu\u0005+nPwG$}[>")) };

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5229 = null;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "Lrt;")
    public static class239 field5233 = new class239();

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
    public static boolean field5235 = false;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[I")
    public static int[] field5230;

    @OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            field5234++;
            this.field5231.method1742(this.field5237, (byte) 97);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5238[4] + ')');
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method2805(int arg0) {
        try {
            field5230 = null;
            field5233 = null;
            field5229 = null;
            if (arg0 != -17189) {
                field5229 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5238[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lffa;J[Lwj;)V")
    public class335(class197 arg0, long arg1, class414[] arg2) {
        try {
            this.field5231 = arg0;
            this.field5237 = arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5238[1] + (arg0 == null ? field5238[2] : field5238[0]) + ',' + arg1 + ',' + (arg2 == null ? field5238[2] : field5238[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2806(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2807(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 22;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
