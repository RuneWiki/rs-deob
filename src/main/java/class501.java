import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public abstract class class501 {

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field7248 = method3780(method3779("BIX~\u0000"));

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "[I")
    public static int[] field7247 = new int[4];

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
    public abstract void method2387(int arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "()Lqq;")
    public abstract class501 method2379();

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V")
    public abstract void method2366(int arg0);

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(III[I)V")
    public abstract void method2392(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V")
    public abstract void method2369(int arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIII)V")
    public abstract void method2365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(III[I)V")
    public abstract void method2393(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public abstract void method2386(int arg0);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
    public static void method3778(int arg0) {
        try {
            field7247 = null;
            if (arg0 != 4) {
                method3778(-22);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7248 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
    public abstract void method2391(int arg0);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(III)V")
    public abstract void method2389(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([I)V")
    public abstract void method2381(int[] arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[I)V")
    public abstract void method2380(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)V")
    public abstract void method2375(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lqq;)V")
    public abstract void method2377(class501 arg0);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "()V")
    public abstract void method2383();

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)V")
    public abstract void method2371(int arg0);

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3779(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3780(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 118;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
