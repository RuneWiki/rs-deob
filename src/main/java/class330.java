import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class330 {

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    private int field5402;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public int field5400;

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5403 = new String[] { method2800(method2799("\u0017\u0002\u000eM\u00042\u0018RP\u0005\u0006D")), method2800(method2799("\u0017\u0002\u000e{C")), method2800(method2799("\u0017\u0002\u000e\u0005\u0002\u000f\u0005T\u0007C")), method2800(method2799("\u0017\u0002\u000exC")) };

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Lmk;")
    public static class59 field5401;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public static void method2797(byte arg0) {
        try {
            field5401 = null;
            if (arg0 > -76) {
                method2797((byte) 77);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5403[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)I")
    public final int method2798(byte arg0) {
        try {
            if (arg0 != -102) {
                this.field5402 = 112;
            }
            field5399++;
            return this.field5402;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5403[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field5398++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5403[0] + ')');
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(II)V")
    public class330(int arg0, int arg1) {
        try {
            this.field5402 = arg0;
            this.field5400 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5403[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2799(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2800(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 57;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
