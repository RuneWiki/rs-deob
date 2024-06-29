import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class594 {

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field8592 = method4355(method4354("\u0012\u001fc\ny"));

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lhl;")
    public static class556 field8588 = new class556(137, 2);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "[I")
    public static int[] field8590 = new int[2048];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lhl;")
    public static class556 field8591 = new class556(120, 17);

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[Lbl;")
    public static class678[] field8589;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 4)
    public static void method4352(boolean arg0) {
        try {
            field8589 = null;
            field8590 = null;
            field8591 = null;
            if (arg0) {
                field8591 = null;
            }
            field8588 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8592 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Lpba;", line = 21)
    public static final class350 method4353(int arg0, int arg1, int arg2) {
        class290 var3 = class85.field1280[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4678;
    }

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4354(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4355(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
