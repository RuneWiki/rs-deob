import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class281 extends class687 {

    @OriginalMember(owner = "client!te", name = "t", descriptor = "[B")
    public byte[] field3959;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field3965 = new String[] { method2291(method2290("hh\u0012\u0003\u000e")), method2291(method2290("hh\u0012\u0007\u000e")), method2291(method2290("rxP*")), method2291(method2290("g#\u0012h[")), method2291(method2290("hh\u0012\u0002\u000e")), method2291(method2290("hh\u0012zOrdHx\u000e")), method2291(method2290("hh\u0012\u0005\u000e")), method2291(method2290("hh\u0012\u0004\u000e")) };

    @OriginalMember(owner = "client!te", name = "u", descriptor = "[Z")
    public static boolean[] field3963 = new boolean[8];

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILha;IIILvo;)V", line = 3)
    public static final void method2285(int arg0, class18 arg1, int arg2, int arg3, int arg4, class782 arg5) {
        try {
            for (int var6 = 7; var6 >= 0; var6--) {
                for (int var7 = 127; var7 >= 0; var7--) {
                    class445.method3458(true, (byte) 33, false);
                    int var8 = (var6 & 0x7) << 7 | (arg0 & 0x3F) << 10 | var7 & 0x7F;
                    int var9 = class360.field5233[var8];
                    class485.method3742(false, true, -18448);
                    arg1.method237((arg5.field11295 * var7 >> 7) + arg4, ((-var6 + 7) * arg5.field11244 >> 3) + arg2, (arg5.field11295 >> 7) + 1, (arg5.field11244 >> 3) + 1, var9, 0);
                }
            }
            if (arg3 != 8) {
                method2287(true);
            }
            field3964++;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field3965[1] + arg0 + ',' + (arg1 == null ? field3965[2] : field3965[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field3965[2] : field3965[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)V", line = 36)
    public static final void method2286(int arg0, byte arg1) {
        try {
            field3958++;
            class294 var2 = class146.method1261((long) arg0, 79, 9);
            if (arg1 != 51) {
                field3963 = null;
            }
            var2.method2376(-118);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3965[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V", line = 55)
    public static final void method2287(boolean arg0) {
        try {
            class83.method819();
            field3961++;
            if (!arg0) {
                field3963 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3965[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([B)V", line = 65)
    public class281(byte[] arg0) {
        try {
            this.field3959 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3965[5] + (arg0 == null ? field3965[2] : field3965[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 76)
    public static void method2288(byte arg0) {
        try {
            field3963 = null;
            if (arg0 != 42) {
                field3962 = 43;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3965[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lvo;III)V", line = 91)
    public static final void method2289(class782 arg0, int arg1, int arg2, int arg3) {
        try {
            field3960++;
            if (arg2 >= -39) {
                field3963 = null;
            }
            class276.field3894 = arg3;
            class234.field3384 = arg0;
            class263.field3723 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3965[6] + (arg0 == null ? field3965[2] : field3965[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!te", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2290(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!te", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2291(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
