import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class66 extends class459 {

    @OriginalMember(owner = "client!mia", name = "x", descriptor = "[[S")
    public short[][] field904;

    @OriginalMember(owner = "client!mia", name = "v", descriptor = "D")
    public double field905;

    @OriginalMember(owner = "client!mia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field906 = new String[] { method698(method697("\u0001:a,^")), method698(method697("\u0017}.,\u001f\u0013z&v\u001dR")), method698(method697("\u0014a#n")), method698(method697("\u0017}.,aR")), method698(method697("\u0017}.,bR")) };

    @OriginalMember(owner = "client!mia", name = "y", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!mia", name = "w", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)J")
    public final long method695(int arg0) {
        try {
            field903++;
            if (arg0 != -12131) {
                this.field905 = 0.05003744228968683D;
            }
            return (long) (this.field904[0].length | this.field904.length << 0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field906[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(IZLeg;IIBLgda;)V")
    public static final void method696(int arg0, boolean arg1, class114 arg2, int arg3, int arg4, byte arg5, class58 arg6) {
        try {
            class347.method2901(arg1, arg6, (byte) 125, arg4, arg0, arg3);
            field902++;
            class550.field8070 = arg2;
            int var7 = -91 / ((-arg5 - 10) / 52);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field906[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field906[2] : field906[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field906[2] : field906[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "([[SD)V")
    public class66(short[][] arg0, double arg1) {
        try {
            this.field904 = arg0;
            this.field905 = arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field906[1] + (arg0 == null ? field906[2] : field906[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method697(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method698(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
