import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class133 extends class731 {

    @OriginalMember(owner = "client!ju", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field1900 = new String[] { method1259(method1258("VG1@{")), method1259(method1258("VG1C{")), method1259(method1258("VG1E{")), method1259(method1258("RGse")), method1259(method1258("G\u001c1'.")), method1259(method1258("VG1G{")), method1259(method1258("VG1D{")), method1259(method1258("VG1B{")) };

    @OriginalMember(owner = "client!ju", name = "L", descriptor = "I")
    public static int field1893 = 0;

    @OriginalMember(owner = "client!ju", name = "G", descriptor = "Ljava/lang/String;")
    public static String field1890 = null;

    @OriginalMember(owner = "client!ju", name = "B", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ju", name = "F", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ju", name = "K", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ju", name = "I", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ju", name = "D", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ju", name = "E", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ju", name = "H", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ju", name = "J", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lwq;Z)Luca;")
    public static final class540 method1252(class176 arg0, boolean arg1) {
        try {
            ++field1897;
            return arg1 ? null : new class540(arg0.method1657(97), arg0.method1657(91), arg0.method1657(120), arg0.method1657(119), arg0.method1685(arg1), arg0.method1685(false), arg0.method1645((byte) -120));
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1900[2] + (arg0 != null ? field1900[4] : field1900[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(IIIIIF)V")
    public class133(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)Z")
    public static final boolean method1253(int arg0, int arg1, int arg2) {
        try {
            ++field1895;
            return arg1 >= -88 ? true : class344.method2887(arg2, -30958, arg0) & class114.method1130(-115, arg0, arg2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1900[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)V")
    public final void method1254(int arg0, int arg1, int arg2, int arg3) {
        try {
            super.field10712 = arg3;
            super.field10706 = arg2;
            super.field10709 = arg0;
            if (arg1 != 64) {
                method1256((byte) -27);
            }
            ++field1898;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1900[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILka;ZLrga;II)V")
    public static final void method1255(int arg0, class499 arg1, boolean arg2, class250 arg3, int arg4, int arg5) {
        try {
            ++field1889;
            if (arg1 != null) {
                if (!arg2) {
                    method1252((class176) null, false);
                }
                arg3.method2126(arg5, arg1.method422(), arg1.method417(), arg0, arg1.method388(), arg1.method438(), arg1.method434(), arg1.method400(), arg4, arg1.method396(), 0);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1900[7] + arg0 + ',' + (arg1 != null ? field1900[4] : field1900[3]) + ',' + arg2 + ',' + (arg3 != null ? field1900[4] : field1900[3]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)V")
    public static void method1256(byte arg0) {
        try {
            field1890 = null;
            if (arg0 != -74) {
                method1255(2, (class499) null, true, (class250) null, -37, -27);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1900[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BF)V")
    public final void method1257(byte arg0, float arg1) {
        try {
            ++field1891;
            if (arg0 != 86) {
                method1256((byte) -105);
            }
            super.field10714 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1900[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1258(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 83);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1259(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 9;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
