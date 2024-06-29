import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class414 {

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Lffa;")
    private class197 field6092;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "J")
    public long field6097;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6098 = new String[] { method3214(method3213("6C*{5/Hht&$\u0001")), method3214(method3213("6C*_t")), method3214(method3213("6C*\\t")), method3214(method3213("6C*!5/@p#t")), method3214(method3213("/\\hq")), method3214(method3213(":\u0007*3!")) };

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lel;")
    public static class573 field6093 = new class573(38, 6);

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Lel;")
    public static class573 field6096 = new class573(75, 10);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            field6095++;
            this.field6092.method1742(this.field6097, (byte) 96);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6098[0] + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3211(boolean arg0, int arg1, int arg2) {
        try {
            field6094++;
            if (arg0) {
                field6093 = null;
            }
            return (arg1 & 0x10) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6098[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public static void method3212(int arg0) {
        try {
            field6096 = null;
            field6093 = null;
            if (arg0 <= 61) {
                method3212(-90);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6098[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lffa;JI)V")
    public class414(class197 arg0, long arg1, int arg2) {
        try {
            this.field6092 = arg0;
            this.field6097 = arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6098[3] + (arg0 == null ? field6098[4] : field6098[5]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3213(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3214(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
