import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class634 {

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9247 = new String[] { method4677(method4676("C\\r+N")), method4677(method4676("C\\r(N")) };

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field9241 = 0;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field9239 = -1;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Luu;")
    public static class301 field9242 = new class301();

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public int field9243;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field9244;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public int field9245;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
    public static final void method4674(byte arg0) {
        try {
            class429.field6309 = 1;
            field9240++;
            if (arg0 != -79) {
                method4674((byte) -22);
            }
            class591.field8684 = -1;
            class28.method193(class76.field872.equals(""), true, 1, "", class76.field872);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9247[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method4675(byte arg0) {
        try {
            if (arg0 != -59) {
                method4674((byte) -78);
            }
            field9242 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9247[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4676(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4677(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
