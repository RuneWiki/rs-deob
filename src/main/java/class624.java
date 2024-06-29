import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class624 {

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9002 = new String[] { method4557(method4556("q\t- -6")), method4557(method4556("eBb \u0011")), method4557(method4556("p\u0019 b")), method4557(method4556("q\t- /6")), method4557(method4556("q\t- .6")) };

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public static int field8999 = 0;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "[Lsh;")
    public static class74[] field9000;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ltga;I)[Lpf;")
    public static final class609[] method4553(class61 arg0, int arg1) {
        try {
            field8998++;
            if (!arg0.method633(0)) {
                return new class609[0];
            }
            if (arg1 != -256) {
                field9000 = null;
            }
            class218 var2 = arg0.method641(1);
            while (var2.field3402 == 0) {
                class524.method3918(-4, 10L);
            }
            if (var2.field3402 == 2) {
                return new class609[0];
            }
            int[] var3 = (int[]) var2.field3407;
            class609[] var4 = new class609[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class609 var6 = new class609();
                var4[var5] = var6;
                var6.field8774 = var3[var5 << 2];
                var6.field8767 = var3[(var5 << 2) + 1];
                var6.field8769 = var3[(var5 << 2) + 2];
                var6.field8772 = var3[(var5 << 2) + 3];
            }
            return var4;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field9002[0] + (arg0 == null ? field9002[2] : field9002[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
    public static void method4554(byte arg0) {
        try {
            if (arg0 < 55) {
                method4555(38);
            }
            field9000 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9002[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
    public static final void method4555(int arg0) {
        try {
            field9001++;
            for (int var1 = arg0; var1 < class224.field3519.length; var1++) {
                for (int var2 = 0; var2 < class224.field3519[0].length; var2++) {
                    for (int var3 = 0; var3 < class224.field3519[0][0].length; var3++) {
                        class224.field3519[var1][var2][var3] = 0;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9002[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4556(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4557(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 14;
                    break;
                default:
                    var10005 = 108;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
