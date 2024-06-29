import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class39 {

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field460 = new String[] { method266(method265("wYW\u0019Z")), method266(method265("b\u0002\u0015[")), method266(method265("y\u0013Wu\u000f")), method266(method265("y\u0013WCH_\u0003\u000b^Ik_")), method266(method265("y\u0013Wt\u000f")), method266(method265("y\u0013Ws\u000f")), method266(method265("y\u0013Wv\u000f")) };

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lud;")
    public static class39 field453 = new class39();

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Lud;")
    public static class39 field454 = new class39();

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Lud;")
    public static class39 field455 = new class39();

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lud;")
    public static class39 field456 = new class39();

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[I")
    public static int[] field458 = new int[4];

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Z")
    public static boolean field457 = false;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lwia;")
    public static class790 field459 = new class790(7, 7);

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[S)[S", line = 3)
    public static final short[] method261(int arg0, int arg1, short[] arg2) {
        try {
            field451++;
            short[] var3 = new short[arg0];
            class467.method3552(arg2, 0, var3, arg1, arg0);
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field460[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field460[1] : field460[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 17)
    public static void method262(byte arg0) {
        try {
            field454 = null;
            field456 = null;
            field458 = null;
            field453 = null;
            field455 = null;
            if (arg0 > 120) {
                field459 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field460[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILic;)V", line = 36)
    public static final void method263(int arg0, class726 arg1) {
        try {
            if (arg0 > 76) {
                field452++;
                class142 var2 = (class142) class761.field11026.method977((long) arg1.field3780, 1);
                if (var2 != null) {
                    if (var2.field1700 != null) {
                        class594.field8714.method4980(var2.field1700);
                        var2.field1700 = null;
                    }
                    var2.method1824(1);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field460[4] + arg0 + ',' + (arg1 == null ? field460[1] : field460[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;", line = 63)
    public final String toString() {
        try {
            field449++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field460[3] + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIII)Z", line = 71)
    public static final boolean method264(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field450++;
            if (arg0 + arg4 > arg3 && arg0 < (arg3 + arg7)) {
                if (arg6 != 0) {
                    field459 = null;
                }
                return (arg1 + arg5) > arg8 && (arg2 + arg8) > arg1;
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field460[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method265(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method266(char[] arg0) {
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
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
