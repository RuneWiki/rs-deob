import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class173 {

    @OriginalMember(owner = "client!gia", name = "e", descriptor = "I")
    public int field2287;

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2292 = new String[] { method1460(method1459("\\~P8~\u0013")), method1460(method1459("@9\u001f8@")), method1460(method1459("Ub]z")), method1460(method1459("\\~P8\u0001RyXb\u0003\u0013")), method1460(method1459("\\~P8\u007f\u0013")), method1460(method1459("\\~P8|\u0013")), method1460(method1459("\\~P8ITDEdTUp\u0019")) };

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "[[[Z")
    public static boolean[][][] field2290;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1456(int arg0) {
        try {
            field2288++;
            if (arg0 != -30013) {
                field2290 = null;
            }
            if (class230.field3333 != null) {
                class515[] var1 = class230.field3333;
                for (int var2 = 0; var2 < var1.length; var2++) {
                    class515 var3 = var1[var2];
                    var3.method806(31428);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2292[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(I)I", line = 33)
    public final int method1457(int arg0) {
        try {
            if (arg0 != 28687) {
                field2290 = null;
            }
            field2291++;
            return this.field2287;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field2292[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gia", name = "toString", descriptor = "()Ljava/lang/String;", line = 45)
    public final String toString() {
        try {
            field2289++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2292[6] + ')');
        }
    }

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "(I)V", line = 57)
    public static void method1458(int arg0) {
        try {
            field2290 = null;
            if (arg0 <= 119) {
                field2290 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2292[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 66)
    public class173(String arg0, int arg1) {
        try {
            this.field2287 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2292[3] + (arg0 == null ? field2292[2] : field2292[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1459(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1460(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 22;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
