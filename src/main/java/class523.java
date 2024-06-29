import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class523 {

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7648 = new String[] { method3968(method3967("(ze5J")), method3968(method3967("#=eZ\u001f")), method3968(method3967("6f'\u0018")), method3968(method3967("(ze6J")) };

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "[I")
    public static int[] field7644 = new int[1];

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public int field7641;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public int field7642;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public int field7645;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public int field7647;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lla;")
    public static class476 field7639;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Lil;")
    public static class7 field7643;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[S)[S", line = 14)
    public static final short[] method3965(int arg0, int arg1, short[] arg2) {
        try {
            field7640++;
            short[] var3 = new short[arg1];
            class467.method3552(arg2, 0, var3, arg0, arg1);
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7648[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field7648[2] : field7648[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 25)
    public static void method3966(boolean arg0) {
        try {
            if (!arg0) {
                method3965(122, 10, null);
            }
            field7639 = null;
            field7644 = null;
            field7643 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7648[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3967(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x62);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3968(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 98;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
