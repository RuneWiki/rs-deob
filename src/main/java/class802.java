import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class802 extends class505 {

    @OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
    private int field11661 = 0;

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11665 = new String[] { method5785(method5784("I\u000b]<U\u0003")), method5785(method5784("I\u000b]<R\u0003")), method5785(method5784("I\u000b]<S\u0003")), method5785(method5784("I\u000b]<T\u0003")) };

    @OriginalMember(owner = "client!bba", name = "p", descriptor = "I")
    public static int field11660;

    @OriginalMember(owner = "client!bba", name = "o", descriptor = "I")
    public static int field11662;

    @OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
    public static int field11663;

    @OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
    public static int field11664;

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Llga;Lgja;)V")
    public class802(class47 arg0, class44 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)V")
    public final void method801(int arg0, boolean arg1) {
        try {
            int var3 = 28 / ((arg0 - 15) / 60);
            ++field11664;
            int var4 = super.field7393.field3357.method2058(super.field7388.method1378(), class500.field7304, 0) - -super.field7393.field3353;
            int var5 = super.field7393.field3352.method4767(23467, super.field7388.method1380(), class791.field11507) - -super.field7393.field3349;
            super.field7388.method3076((float) (super.field7388.method1378() / 2 + var4), (float) (super.field7388.method1380() / 2 + var5), 4096, this.field11661);
            this.field11661 += ((class44) super.field7393).field637;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11665[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZIII)V")
    public static final void method5781(boolean arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 != 1012) {
                if (arg2 == 1011) {
                    class158.method1337(class551.field8048, arg1, arg3);
                } else if (arg2 == 1004) {
                    class158.method1337(class463.field6753, arg1, arg3);
                } else if (~arg2 == -1002) {
                    class158.method1337(class229.field3315, arg1, arg3);
                } else if (arg2 == 1010) {
                    class158.method1337(class505.field7395, arg1, arg3);
                }
            } else {
                class158.method1337(class276.field3897, arg1, arg3);
            }
            if (arg0) {
                ++field11660;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11665[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)V")
    public static final void method5782(int arg0, int arg1, int arg2) {
        try {
            ++field11663;
            if (arg2 >= 28) {
                class294 var3 = class146.method1261((long) arg0, 122, 16);
                var3.method2378(-57);
                var3.field4133 = arg1;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field11665[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IBI)V")
    public static final void method5783(int arg0, byte arg1, int arg2) {
        try {
            int var3 = -97 / ((76 - arg1) / 48);
            ++field11662;
            class294 var4 = class146.method1261((long) arg0, 67, 13);
            var4.method2378(-108);
            var4.field4133 = arg2;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field11665[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5784(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5785(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 31;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
