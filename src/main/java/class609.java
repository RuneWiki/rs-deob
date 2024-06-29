import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class609 {

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8775 = new String[] { method4446(method4445("LU\u0011\u0016")), method4446(method4445("Y\u000eST\u0013")), method4446(method4445("RFS;F")), method4446(method4445("RFS8F")), method4446(method4445("RFS9F")) };

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
    public static int[] field8770 = new int[1000];

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public int field8767;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public int field8769;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public int field8772;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field8773;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public int field8774;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Lke;")
    public static class625 field8766;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[[[Lgf;")
    public static class290[][][] field8771;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLwq;)Lnt;")
    public static final class232 method4442(byte arg0, class176 arg1) {
        try {
            arg1.method1645((byte) -114);
            field8765++;
            int var2 = arg1.method1645((byte) -80);
            class232 var3 = class650.method4740(var2, (byte) -112);
            if (arg0 != 42) {
                field8766 = null;
            }
            var3.field3597 = arg1.method1645((byte) -82);
            int var4 = arg1.method1645((byte) -126);
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1645((byte) -86);
                var3.method63(117, arg1, var6);
            }
            var3.method67((byte) 126);
            return var3;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field8775[4] + arg0 + ',' + (arg1 == null ? field8775[0] : field8775[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method4443(int arg0) {
        try {
            field8766 = null;
            if (arg0 != 1000) {
                method4443(30);
            }
            field8771 = null;
            field8770 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8775[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lgda;B)V")
    public static final void method4444(class58 arg0, byte arg1) {
        try {
            if (arg1 == -94) {
                class683.field9895 = arg0;
                field8768++;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8775[2] + (arg0 == null ? field8775[0] : field8775[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4445(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4446(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 34;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
