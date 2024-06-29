import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class10 extends class568 {

    @OriginalMember(owner = "client!sja", name = "x", descriptor = "Z")
    public boolean field117 = false;

    @OriginalMember(owner = "client!sja", name = "v", descriptor = "Z")
    public boolean field122 = true;

    @OriginalMember(owner = "client!sja", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field126 = new String[] { method79(method78("z\u000bsJ")), method79(method78("oP1\bj")), method79(method78("g\u0014~\bV<")), method79(method78("g\u0014~\bU<")) };

    @OriginalMember(owner = "client!sja", name = "l", descriptor = "I")
    public static int field115 = -1;

    @OriginalMember(owner = "client!sja", name = "z", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!sja", name = "A", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "client!sja", name = "q", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!sja", name = "o", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!sja", name = "t", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!sja", name = "w", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!sja", name = "s", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "client!sja", name = "u", descriptor = "I")
    public int field119;

    @OriginalMember(owner = "client!sja", name = "r", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!sja", name = "n", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!sja", name = "p", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!sja", name = "B", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!sja", name = "y", descriptor = "I")
    public int field125;

    @OriginalMember(owner = "client!sja", name = "m", descriptor = "Ldq;")
    public class729 field118;

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(IIBI[BI[BII)V", line = 19)
    public static final void method76(int arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        try {
            field121++;
            int var9 = -(arg1 >> 2);
            if (arg2 > 44) {
                int var15 = -(arg1 & 0x3);
                for (int var10 = -arg3; var10 < 0; var10++) {
                    int var10001;
                    for (int var11 = var9; var11 < 0; var11++) {
                        var10001 = arg5++;
                        arg6[var10001] = (byte) (arg6[var10001] - arg4[arg7++]);
                        int var16 = arg5++;
                        arg6[var16] = (byte) (arg6[var16] - arg4[arg7++]);
                        int var17 = arg5++;
                        arg6[var17] = (byte) (arg6[var17] - arg4[arg7++]);
                        int var18 = arg5++;
                        arg6[var18] = (byte) (arg6[var18] - arg4[arg7++]);
                    }
                    for (int var12 = var15; var12 < 0; var12++) {
                        var10001 = arg5++;
                        arg6[var10001] = (byte) (arg6[var10001] - arg4[arg7++]);
                    }
                    arg5 += arg8;
                    arg7 += arg0;
                }
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field126[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field126[0] : field126[1]) + ',' + arg5 + ',' + (arg6 == null ? field126[0] : field126[1]) + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "a", descriptor = "(BLjava/lang/String;)I", line = 65)
    public static final int method77(byte arg0, String arg1) {
        try {
            field113++;
            if (arg1 == null) {
                return -1;
            }
            if (arg0 != 100) {
                method77((byte) -56, null);
            }
            for (int var2 = 0; var2 < class198.field3145; var2++) {
                if (arg1.equalsIgnoreCase(class129.field1846[var2])) {
                    return var2;
                }
            }
            return -1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field126[2] + arg0 + ',' + (arg1 == null ? field126[0] : field126[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!sja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method78(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method79(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
