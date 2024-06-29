import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class279 extends class694 {

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3941 = new String[] { method2278(method2277("~*/\u0000@")), method2278(method2277("b.m+")), method2278(method2277("~*/\u0004@")), method2278(method2277("wu/i\u0015")), method2278(method2277("~*/\u000f@")), method2278(method2277("~*/\u0001@")), method2278(method2277("~*/\u0003@")), method2278(method2277("~*/\u000e@")), method2278(method2277("~*/\u0002@")) };

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "Lsb;")
    public static class261 field3935 = new class261(44, 7);

    @OriginalMember(owner = "client!rq", name = "r", descriptor = "I")
    public static int field3936 = -1;

    @OriginalMember(owner = "client!rq", name = "u", descriptor = "[[Ljava/lang/String;")
    public static String[][] field3938 = new String[][] { { method2278(method2277("Aj")), method2278(method2277("Ai")), method2278(method2277("_j")), "F" }, { method2278(method2277("Aj")), method2278(method2277("Ai")), method2278(method2277("Ah")), method2278(method2277("_j")), method2278(method2277("_i")), "F" }, { method2278(method2277("Aj")), method2278(method2277("Ai")), method2278(method2277("Ah")), method2278(method2277("Ao")), method2278(method2277("_j")), method2278(method2277("_i")), method2278(method2277("_h")), "F" } };

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "Llf;")
    public static class260 field3939 = new class260(2, 5);

    @OriginalMember(owner = "client!rq", name = "v", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!rq", name = "t", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!rq", name = "s", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!rq", name = "w", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljc;I)Lvm;")
    public static final class778 method2270(class711 arg0, int arg1) {
        try {
            if (arg1 != -53) {
                return null;
            }
            field3933++;
            class742 var2 = class404.method3168(arg0, (byte) -86);
            int var3 = arg0.method5113(18443);
            int var4 = arg0.method5113(18443);
            int var5 = arg0.method5116((byte) -116);
            return new class778(var2.field10540, var2.field10539, var2.field10542, var2.field10547, var2.field10543, var2.field10541, var2.field10544, var2.field10545, var2.field10548, var3, var4, var5);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3941[2] + (arg0 == null ? field3941[1] : field3941[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IZI)V")
    public static final void method2271(int arg0, boolean arg1, int arg2) {
        try {
            if (arg0 != 7) {
                method2272(-4, 73, null, 34, null, -60, 121, 100, -61, 115, -123, -42);
            }
            class625.method4585(10, class537.field7842.method4068((byte) -94, class405.field5883), arg2, arg1);
            field3931++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3941[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILrj;ILmq;IIIIIII)V")
    public static final void method2272(int arg0, int arg1, class252 arg2, int arg3, class657 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            class57.field808 = arg1;
            class293.field4122 = arg4;
            class398.field5796 = null;
            class216.field3156 = arg11;
            class551.field8045 = arg3;
            class604.field8660 = arg2;
            if (arg7 >= -71) {
                field3936 = 14;
            }
            class711.field10002 = arg0;
            class372.field5448 = arg8;
            class757.field10823 = arg9;
            class36.field446 = null;
            class738.field10504 = arg5;
            class606.field8684 = arg10;
            class381.field5553 = arg6;
            class583.field8421 = null;
            field3932++;
            class649.method4728(-117);
            class371.field5360 = true;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field3941[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3941[1] : field3941[3]) + ',' + arg3 + ',' + (arg4 == null ? field3941[1] : field3941[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BI)V")
    public static final void method2273(byte arg0, int arg1) {
        try {
            field3940++;
            class692.field9680 = arg1;
            class251 var2 = class270.field3827;
            synchronized (class270.field3827) {
                int var3 = -47 % ((-arg0 - 25) / 46);
                class270.field3827.method2043(false);
            }
            class251 var4 = class391.field5710;
            synchronized (class391.field5710) {
                class391.field5710.method2043(false);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3941[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IB)Z")
    public static final boolean method2274(int arg0, byte arg1) {
        try {
            field3934++;
            if (arg0 == 57 || arg0 == 52 || arg0 == 16 || arg0 == 2 || arg0 == 18 || arg0 == 1008) {
                return true;
            } else if (arg1 == -120) {
                return arg0 == 47;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3941[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)V")
    public static void method2275(boolean arg0) {
        try {
            if (!arg0) {
                field3936 = -49;
            }
            field3935 = null;
            field3938 = null;
            field3939 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3941[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZII)Law;")
    public static final class375 method2276(boolean arg0, int arg1, int arg2) {
        try {
            if (arg1 != 0) {
                field3935 = null;
            }
            field3937++;
            long var3 = (long) (arg2 | (arg0 ? Integer.MIN_VALUE : 0));
            return (class375) class191.field2530.method3693(false, var3);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3941[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2277(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2278(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
