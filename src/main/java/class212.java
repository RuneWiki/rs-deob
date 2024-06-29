import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class212 extends class751 {

    @OriginalMember(owner = "client!tw", name = "r", descriptor = "I")
    private int field3354 = 0;

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3358 = new String[] { method1916(method1915("xh*\u0001\"")), method1916(method1915("xh*\u0006\"")), method1916(method1915("xh*\u0000\"")) };

    @OriginalMember(owner = "client!tw", name = "p", descriptor = "[I")
    public static int[] field3355 = new int[6];

    @OriginalMember(owner = "client!tw", name = "s", descriptor = "Lsa;")
    public static class214 field3353 = new class214(true);

    @OriginalMember(owner = "client!tw", name = "o", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!tw", name = "q", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lgda;Leda;)V")
    public class212(class58 arg0, class106 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZZ)V")
    public final void method1618(boolean arg0, boolean arg1) {
        try {
            ++field3357;
            if (!arg0) {
                method1914(-124, -114, false, -24, 39);
            }
            int var3 = super.field11055.field7974.method4806(class696.field10028, super.field11060.method26(), -48) - -super.field11055.field7971;
            int var4 = super.field11055.field7973.method4833(super.field11060.method12(), class518.field7672, (byte) 84) + super.field11055.field7970;
            super.field11060.method1004((float) (super.field11060.method26() / 2 + var3), (float) (super.field11060.method12() / 2 + var4), 4096, this.field3354);
            this.field3354 += ((class106) super.field11055).field1530;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3358[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
    public static void method1913(int arg0) {
        try {
            if (arg0 != -21614) {
                field3355 = null;
            }
            field3353 = null;
            field3355 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3358[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIZII)V")
    public static final void method1914(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        try {
            ++field3356;
            if (!arg2) {
                field3353 = null;
            }
            if (~arg1 < ~arg0) {
                class545.method4051(arg0, arg4, arg1, class193.field3047[arg3], -116);
            } else {
                class545.method4051(arg1, arg4, arg0, class193.field3047[arg3], -124);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3358[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1915(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1916(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
