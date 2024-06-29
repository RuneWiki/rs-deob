import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class533 {

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public int field7713;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public int field7714;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public int field7718;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public int field7716;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7721 = new String[] { method4032(method4031("\u000fxY]_")), method4032(method4031("\u000fxY#\u001e\u0016}\u0003!_")), method4032(method4031("\u000fxY^_")) };

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "Lmv;")
    public static class125 field7717 = new class125(4, 2);

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Lhw;")
    public static class336 field7719 = new class336();

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Lhj;")
    public static class671 field7720 = new class671(6, 0, 4, 2);

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lwl;")
    public final class533 method4029(int arg0, int arg1) {
        try {
            field7715++;
            if (arg1 != 6) {
                method4030(-26);
            }
            return new class533(this.field7713, arg0, this.field7714, this.field7716);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7721[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public static void method4030(int arg0) {
        try {
            field7719 = null;
            field7720 = null;
            field7717 = null;
            if (arg0 != 6) {
                field7712 = 84;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7721[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(IIII)V")
    public class533(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field7713 = arg0;
            this.field7714 = arg2;
            this.field7718 = arg1;
            this.field7716 = arg3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7721[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4031(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4032(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 120;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
