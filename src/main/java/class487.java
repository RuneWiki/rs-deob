import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class487 extends class471 {

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field7017 = new String[] { method3702(method3701("Rq()n")), method3702(method3701("Rq(/n")), method3702(method3701("M|g")), method3702(method3701("Rq(*n")), method3702(method3701("Rq((n")) };

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)Lsi;")
    public static final class585 method3699(byte arg0) {
        try {
            ++field7016;
            try {
                return arg0 < 117 ? null : (class585) Class.forName(field7017[2]).newInstance();
            } catch (Throwable var2) {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7017[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FB)V")
    public final void method1835(float arg0, byte arg1) {
        try {
            super.field6838 = arg0;
            if (arg1 == -20) {
                ++field7014;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7017[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
    public final void method1836(int arg0, int arg1, int arg2, int arg3) {
        try {
            ++field7015;
            super.field6837 = arg3;
            super.field6846 = arg2;
            if (arg0 < -50) {
                super.field6839 = arg1;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field7017[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIIF)V")
    public class487(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3700(int arg0, byte arg1, int arg2) {
        try {
            ++field7013;
            return arg1 <= 58 ? false : (24 & arg2) != 0 | ~(arg2 & 544) == -545;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7017[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3701(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3702(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 22;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 70;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
