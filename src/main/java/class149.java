import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class149 {

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "[I")
    public int[] field2514;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "[I")
    public int[] field2509;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public static int field2510 = -1;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field2511 = 0;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "[Lf;")
    public static class257[] field2517;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILr;)V")
    public static final void method1133(int arg0, class98 arg1) {
        field2513++;
        if (arg0 != -17266) {
            field2511 = 69;
        }
        if (class511.field7605 != class103.field1708.field3158 && class541.field7946 != null && class24.method233((byte) -114, class103.field1708.field3158, arg1)) {
            class511.field7605 = class103.field1708.field3158;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lph;Z)V")
    public static final void method1134(class699 arg0, boolean arg1) {
        class33.field471.method3904(arg0, 0);
        field2518++;
        arg0.field9901 = arg0.field9908.field6710;
        arg0.field9908.field6710 = 0;
        if (!arg1) {
            field2517 = null;
        }
        class29.field404 += arg0.field9901;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
    public static void method1135(byte arg0) {
        if (arg0 < -81) {
            field2517 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
    public static final void method1136(boolean arg0) {
        field2516++;
        class344.field4826.method646((byte) 103, 5);
        class621.field8844.method1866(128, 5);
        class235.field3484.method3029(3, 5);
        class14.field224.method2828(-4, 5);
        class564.field8259.method3742(5, (byte) -126);
        class430.field6132.method51(5, -2);
        class480.field6871.method1420(5, (byte) -28);
        class554.field8108.method594((byte) -51, 5);
        class56.field781.method3298(5, (byte) 127);
        class545.field8005.method2893(0, 5);
        class625.field8919.method978(5, (byte) 121);
        class304.field4255.method2842(5, 75);
        class624.field8902.method1500(5, -18518);
        class237.field3504.method1553(5, 103);
        class659.field9287.method2877(5, (byte) -79);
        class104.field1715.method3253(5, -67);
        class111.field1777.method507((byte) -43, 5);
        class27.field385.method569(5, !arg0);
        class329.field4559.method2243(5, -127);
        class667.field9380.method3180((byte) 76, 5);
        class117.method946(5, arg0);
        class10.method56(-31, 50);
        class331.method1967(50, -21);
        class400.method2432(5, (byte) -116);
        class468.method2763(5, true);
        class43.field583.method939(28093, 5);
        class696.field9884.method939(28093, 5);
        class477.field6838.method939(28093, 5);
        class527.field7721.method939(28093, 5);
        class362.field5042.method939(28093, 5);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method1137(int arg0, String arg1) {
        field2515++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 36 / ((28 - arg0) / 49);
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var3[var5] = (byte) var6;
            } else if (var6 == '€') {
                var3[var5] = -128;
            } else if (var6 == '‚') {
                var3[var5] = -126;
            } else if (var6 == 'ƒ') {
                var3[var5] = -125;
            } else if (var6 == '„') {
                var3[var5] = -124;
            } else if (var6 == '…') {
                var3[var5] = -123;
            } else if (var6 == '†') {
                var3[var5] = -122;
            } else if (var6 == '‡') {
                var3[var5] = -121;
            } else if (var6 == 'ˆ') {
                var3[var5] = -120;
            } else if (var6 == '‰') {
                var3[var5] = -119;
            } else if (var6 == 'Š') {
                var3[var5] = -118;
            } else if (var6 == '‹') {
                var3[var5] = -117;
            } else if (var6 == 'Œ') {
                var3[var5] = -116;
            } else if (var6 == 'Ž') {
                var3[var5] = -114;
            } else if (var6 == '‘') {
                var3[var5] = -111;
            } else if (var6 == '’') {
                var3[var5] = -110;
            } else if (var6 == '“') {
                var3[var5] = -109;
            } else if (var6 == '”') {
                var3[var5] = -108;
            } else if (var6 == '•') {
                var3[var5] = -107;
            } else if (var6 == '–') {
                var3[var5] = -106;
            } else if (var6 == '—') {
                var3[var5] = -105;
            } else if (var6 == '˜') {
                var3[var5] = -104;
            } else if (var6 == '™') {
                var3[var5] = -103;
            } else if (var6 == 'š') {
                var3[var5] = -102;
            } else if (var6 == '›') {
                var3[var5] = -101;
            } else if (var6 == 'œ') {
                var3[var5] = -100;
            } else if (var6 == 'ž') {
                var3[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var3[var5] = -97;
            } else {
                var3[var5] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
    public class149(int arg0) {
        this.field2512 = arg0;
        this.field2514 = new int[this.field2512];
        this.field2509 = new int[this.field2512];
    }
}
