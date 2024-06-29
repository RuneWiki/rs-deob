import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class752 extends class122 {

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    private int field10940;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    private int field10937;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
    private int field10943;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    private int field10939;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    private int field10935;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    private int field10949;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "I")
    private int field10936;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    private int field10941;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field10951 = new String[] { method5469(method5468("`.K'w")), method5469(method5468("`.K&w")), method5469(method5468("`.K w")), method5469(method5468("`.K!w")), method5469(method5468("`.K%w")), method5469(method5468("`.KX6y)\u0011Zw")) };

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "[B")
    public static byte[] field10946 = null;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "Lwia;")
    public static class790 field10947 = new class790(11, 16);

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "Z")
    public static boolean field10948 = false;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public static int field10942;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field10944;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field10945;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public static int field10950;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "[I")
    public static int[] field10938;

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        try {
            this.field10940 = arg5;
            this.field10937 = arg4;
            this.field10943 = arg3;
            this.field10939 = arg1;
            this.field10935 = arg2;
            this.field10949 = arg6;
            this.field10936 = arg0;
            this.field10941 = arg7;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field10951[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZII)V")
    public final void method1061(boolean arg0, int arg1, int arg2) {
        try {
            if (arg0) {
                this.method1056(-68, 32, (byte) 7);
            }
            ++field10950;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10951[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
    public final void method1062(int arg0, int arg1, int arg2) {
        try {
            ++field10945;
            if (arg0 < 0) {
                method5467(-106);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10951[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIB)V")
    public final void method1056(int arg0, int arg1, byte arg2) {
        try {
            ++field10944;
            int var4 = this.field10936 * arg1 >> 12;
            if (arg2 < 59) {
                field10946 = null;
            }
            int var5 = this.field10939 * arg0 >> 12;
            int var6 = this.field10935 * arg1 >> 12;
            int var7 = this.field10943 * arg0 >> 12;
            int var8 = this.field10937 * arg1 >> 12;
            int var9 = this.field10940 * arg0 >> 12;
            int var10 = this.field10949 * arg1 >> 12;
            int var11 = this.field10941 * arg0 >> 12;
            class548.method4130(super.field1434, var5, var4, var6, var7, 11, var9, var8, var10, var11);
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field10951[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
    public static void method5466(int arg0) {
        try {
            field10938 = null;
            if (arg0 != -1982613620) {
                field10938 = null;
            }
            field10946 = null;
            field10947 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10951[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)Z")
    public static final boolean method5467(int arg0) {
        try {
            ++field10942;
            if (arg0 > -70) {
                return false;
            } else {
                return ~class84.field940 != -1;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10951[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5468(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 95);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5469(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 95;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
