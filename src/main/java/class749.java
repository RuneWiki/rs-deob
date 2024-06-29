import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public abstract class class749 extends class420 {

    @OriginalMember(owner = "client!dr", name = "K", descriptor = "S")
    public short field10900;

    @OriginalMember(owner = "client!dr", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field10907 = new String[] { method5452(method5451("!e8Ic+~bK\"")), method5452(method5451(">98[w")), method5452(method5451("!e87\"")), method5452(method5451("+bz\u0019")), method5452(method5451("!e8'\"")), method5452(method5451("!e84\"")), method5452(method5451("!e8:\"")), method5452(method5451("!e86\"")) };

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "[I")
    public static int[] field10899 = new int[4];

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "Lum;")
    public static class550 field10903 = new class550("", 18);

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "[I")
    public static int[] field10904 = new int[1000];

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "Lef;")
    public static class513 field10905 = new class513();

    @OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
    public static int field10897;

    @OriginalMember(owner = "client!dr", name = "J", descriptor = "I")
    public static int field10898;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
    public static int field10901;

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
    public static int field10902;

    @OriginalMember(owner = "client!dr", name = "I", descriptor = "[I")
    public static int[] field10906;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(ILha;)Z", line = 5)
    public final boolean method631(int arg0, class66 arg1) {
        try {
            if (arg0 != -10204) {
                return false;
            } else {
                ++field10902;
                return class56.method418(super.field6211 >> class602.field8828, super.field6205, arg0 ^ -10151, super.field6197 >> class602.field8828);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10907[2] + arg0 + ',' + (arg1 != null ? field10907[1] : field10907[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "(B)V", line = 16)
    public static void method5449(byte arg0) {
        try {
            field10899 = null;
            if (arg0 >= 72) {
                field10906 = null;
                field10904 = null;
                field10905 = null;
                field10903 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10907[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([Luf;Z)I", line = 30)
    public final int method630(class471[] arg0, boolean arg1) {
        try {
            ++field10901;
            if (!arg1) {
                this.method631(-107, (class66) null);
            }
            return this.method3252(arg0, super.field6197 >> class602.field8828, super.field6211 >> class602.field8828, (byte) 73);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10907[5] + (arg0 != null ? field10907[1] : field10907[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lha;ZIZ)Lda;", line = 43)
    public static final class67 method5450(class66 arg0, boolean arg1, int arg2, boolean arg3) {
        try {
            if (arg3) {
                field10903 = null;
            }
            ++field10897;
            class12 var4 = class311.method2627(-2130806110, arg2, arg0, arg1);
            return var4 == null ? null : var4.field147;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10907[6] + (arg0 != null ? field10907[1] : field10907[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "(I)Z", line = 64)
    public final boolean method629(int arg0) {
        try {
            ++field10898;
            return arg0 != 0 ? false : class91.field1038[(super.field6197 >> class602.field8828) - class247.field3811 + class396.field5921][(super.field6211 >> class602.field8828) + -class5.field52 + class396.field5921];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10907[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIII)V", line = 77)
    public class749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            super.field6200 = (byte) arg3;
            super.field6205 = (byte) arg4;
            super.field6199 = arg1;
            super.field6197 = arg0;
            super.field6211 = arg2;
            this.field10900 = (short) arg5;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10907[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5451(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5452(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
