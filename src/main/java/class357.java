import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class357 {

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public int field5193;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5200 = new String[] { method2862(method2861("+\u0012FQ{")), method2862(method2861("+\u0012FT{")), method2862(method2861("+\u0012FP{")), method2862(method2861("+\u0012FW{")), method2862(method2861("+\u0012Fa<\u0010\b\u001a|=$T")), method2862(method2861("+\u0012FV{")), method2862(method2861("+\u0012F):-\u0015\u001c+{")) };

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "[I")
    public static int[] field5192 = new int[25];

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field5197 = 500;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 3)
    public static final void method2856(int arg0) {
        try {
            field5194++;
            class14.field182++;
            class274 var1 = class375.method2969((byte) 1, class218.field3184, class60.field916.field11100);
            var1.field3885.method5114(255, class680.method4883(-105));
            var1.field3885.method5138((byte) -121, class391.field5700);
            var1.field3885.method5138((byte) -118, class711.field9998);
            var1.field3885.method5114(255, class451.field6612.field9132.method2747(3));
            class60.field916.method5608(var1, 29867);
            if (arg0 != -31902) {
                method2857(-127);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5200[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "toString", descriptor = "()Ljava/lang/String;", line = 21)
    public final String toString() {
        try {
            field5196++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5200[4] + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 37)
    public static void method2857(int arg0) {
        try {
            field5192 = null;
            int var1 = 99 % ((89 - arg0) / 36);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5200[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZ)Z", line = 47)
    public static final boolean method2858(int arg0, boolean arg1) {
        try {
            field5198++;
            if (arg1) {
                field5192 = null;
            }
            return (-arg0 & arg0) == arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5200[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)Ldka;", line = 61)
    public static final class294 method2859(int arg0) {
        try {
            field5195++;
            if (arg0 <= 22) {
                field5192 = null;
            }
            class294 var1 = (class294) class713.field10085.method3932((byte) -115);
            if (var1 != null) {
                var1.method4294(0);
                var1.method4911(118);
                return var1;
            }
            class294 var2;
            do {
                var2 = (class294) class290.field4097.method3932((byte) -105);
                if (var2 == null) {
                    return null;
                }
                if (var2.method2375(19) > class614.method4531(-59)) {
                    return null;
                }
                var2.method4294(0);
                var2.method4911(117);
            } while ((Long.MIN_VALUE & var2.field9630) == 0L);
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5200[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V", line = 103)
    public static final void method2860(int arg0, int arg1, int arg2) {
        try {
            field5199++;
            if (arg2 != 25) {
                field5197 = -98;
            }
            class294 var3 = class146.method1261((long) arg1, arg2 ^ 0x44, 1);
            var3.method2378(-89);
            var3.field4133 = arg0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5200[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(II)V", line = 120)
    public class357(int arg0, int arg1) {
        try {
            this.field5193 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5200[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2861(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2862(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
