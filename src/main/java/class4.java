import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field42 = new String[] { method30(method29("tL4G")), method30(method29("a\u0017v\u0005y")), method30(method29("|Mvj,")) };

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;I)V")
    public static final void method28(byte arg0, String arg1, String arg2, int arg3) {
        try {
            class429.field6309 = 2;
            class591.field8684 = arg3;
            if (arg0 == 78) {
                field41++;
                class28.method193(false, false, 1, arg1, arg2);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field42[2] + arg0 + ',' + (arg1 == null ? field42[0] : field42[1]) + ',' + (arg2 == null ? field42[0] : field42[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method29(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ft", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method30(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 43;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
