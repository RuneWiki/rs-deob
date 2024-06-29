import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class208 {

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "B")
    public byte field3250;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "Z")
    public boolean field3246;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "I")
    public int field3255;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "S")
    public short field3252;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "S")
    public short field3253;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "S")
    public short field3245;

    @OriginalMember(owner = "client!wfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3257 = new String[] { method1882(method1881("NvH~v\u0011")), method1882(method1881("NvH~u\u0011")), method1882(method1881("NvH~\bP~@$\n\u0011")) };

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "[I")
    public static int[] field3248 = new int[3];

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZIZI)I", line = 15)
    public static final int method1879(boolean arg0, int arg1, boolean arg2, int arg3) {
        try {
            if (!arg0) {
                field3248 = null;
            }
            field3256++;
            class454 var4 = class173.method1596(arg2, 13510, arg1);
            if (var4 == null) {
                return 0;
            } else if (arg3 >= 0 && arg3 < var4.field7013.length) {
                return var4.field7013[arg3];
            } else {
                return 0;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3257[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V", line = 36)
    public static void method1880(int arg0) {
        try {
            if (arg0 >= -5) {
                field3248 = null;
            }
            field3248 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3257[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 51)
    public class208(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        try {
            this.field3251 = arg2;
            this.field3250 = (byte) arg8;
            this.field3246 = arg10;
            this.field3255 = arg0;
            this.field3254 = arg1;
            this.field3247 = arg11;
            this.field3252 = (short) arg4;
            this.field3249 = arg3;
            this.field3253 = (short) arg5;
            this.field3245 = (short) arg6;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field3257[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!wfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1881(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1882(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
