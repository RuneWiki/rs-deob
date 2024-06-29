import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class612 implements class34 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Ljava/lang/String;")
    private String field8803;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lgda;")
    private class58 field8805;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8809 = new String[] { method4457(method4456("9BS\u007f8")), method4457(method4456(">S\u0011Q")), method4457(method4456("+\bS\u0013m")), method4457(method4456("9BS\u0001y>O\t\u00038")), method4457(method4456("9BS|8")), method4457(method4456("9BSy8")) };

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lega;")
    public static class742 field8798 = new class742();

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field8802 = 0;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[I")
    public static int[] field8800 = new int[120];

    @OriginalMember(owner = "client!id", name = "c", descriptor = "D")
    public static double field8804;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Ljk;")
    public static class662 field8808;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field8800[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 7)
    public static void method4455(int arg0) {
        try {
            if (arg0 != 100) {
                method4455(123);
            }
            field8800 = null;
            field8798 = null;
            field8808 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8809[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lil;", line = 23)
    public final class7 method345(int arg0) {
        try {
            field8807++;
            int var2 = -64 % ((arg0 + 55) / 60);
            return class7.field78;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8809[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lgda;Ljava/lang/String;)V", line = 41)
    public class612(class58 arg0, String arg1) {
        try {
            this.field8803 = arg1;
            this.field8805 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8809[3] + (arg0 == null ? field8809[1] : field8809[2]) + ',' + (arg1 == null ? field8809[1] : field8809[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I", line = 50)
    public final int method346(byte arg0) {
        try {
            field8799++;
            if (arg0 <= 31) {
                return -84;
            } else if (this.field8805.method603(this.field8803, 0)) {
                return 100;
            } else {
                return 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8809[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!id", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4456(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!id", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4457(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 61;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
