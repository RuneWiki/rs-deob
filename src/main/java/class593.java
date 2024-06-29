import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class593 {

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8711 = new String[] { method4420(method4419("IQ")), method4420(method4419("MUh<y")), method4420(method4419("IP")), method4420(method4419("MUh>y")), method4420(method4419("MUh=y")) };

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[[I")
    public static int[][] field8706 = new int[6][];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field8707 = 0;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lkia;")
    public static class646 field8704 = new class646(method4420(method4419("ur\u0012=\u0014h}")), method4420(method4419("SZ \u00162Y")), method4420(method4419("cU(\u000b3YH'")), 6);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field8709 = 0;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Lel;")
    public static class573 field8710 = new class573(99, 6);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public static final void method4416(byte arg0) {
        try {
            class104.field1209 = 0;
            field8705++;
            int var1 = class430.field6332.method1431(62);
            int var2 = class430.field6332.method1444(97);
            int var3 = class430.field6332.method1444(8);
            boolean var4 = class430.field6332.method1455((byte) 62) == 1;
            class121.method1052(0);
            class460.method3507(false, var1);
            int var5 = (class476.field6930 - class430.field6332.field2201) / 16;
            class28.field350 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    class28.field350[var6][var7] = class430.field6332.method1453((byte) 97);
                }
            }
            class274.field4140 = new byte[var5][];
            class416.field6135 = new int[var5];
            class752.field10938 = new int[var5];
            if (arg0 >= -44) {
                method4416((byte) -20);
            }
            class754.field10979 = new byte[var5][];
            class516.field7461 = new int[var5];
            class694.field10133 = new int[var5];
            class88.field993 = null;
            class106.field1223 = null;
            class608.field8893 = new byte[var5][];
            class301.field4726 = new int[var5];
            class530.field7791 = new byte[var5][];
            int var8 = 0;
            for (int var9 = (var3 - (class648.field9378 >> 4)) / 8; var9 <= (((class648.field9378 >> 4) + var3) / 8); var9++) {
                for (int var10 = (var2 - (class659.field9506 >> 4)) / 8; var10 <= (((class659.field9506 >> 4) + var2) / 8); var10++) {
                    class752.field10938[var8] = (var9 << 8) + var10;
                    class694.field10133[var8] = class550.field8195.method3627("m" + var9 + "_" + var10, -128);
                    class301.field4726[var8] = class550.field8195.method3627("l" + var9 + "_" + var10, 32);
                    class516.field7461[var8] = class550.field8195.method3627(field8711[0] + var9 + "_" + var10, 111);
                    class416.field6135[var8] = class550.field8195.method3627(field8711[2] + var9 + "_" + var10, -103);
                    var8++;
                }
            }
            class353.method2891(0, var2, var4, 11, var3);
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field8711[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method4417(byte arg0) {
        try {
            field8706 = null;
            field8704 = null;
            int var1 = -33 / ((arg0 - 2) / 63);
            field8710 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8711[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method4418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field8708++;
            if (class334.method2801(arg6, 0)) {
                int var10 = 0;
                int var11 = 0;
                int var12 = arg0;
                int var13 = 0;
                int var14 = 0;
                if (class235.field3549) {
                    var10 = class472.field6855;
                    var12 = class717.field10372;
                    var14 = class547.field8168;
                    var11 = class726.field10498;
                    var13 = class125.field1471;
                    class547.field8168 = 1;
                }
                if (class769.field11137[arg6] == null) {
                    class726.method5288(class683.field9897[arg6], arg3, arg4, arg8, arg7, -1, 102, arg7 < 0, arg1, arg2, arg5);
                } else {
                    class726.method5288(class769.field11137[arg6], arg3, arg4, arg8, arg7, -1, 98, arg7 < 0, arg1, arg2, arg5);
                }
                if (class235.field3549) {
                    if (arg7 >= 0 && class547.field8168 == 2) {
                        class758.method5495((byte) 50, class125.field1471, class726.field10498, class717.field10372, class472.field6855);
                    }
                    class547.field8168 = var14;
                    class717.field10372 = var12;
                    class726.field10498 = var11;
                    class472.field6855 = var10;
                    class125.field1471 = var13;
                }
            } else if (arg7 == -1) {
                for (int var9 = 0; var9 < 100; var9++) {
                    class26.field321[var9] = true;
                }
            } else {
                class26.field321[arg7] = true;
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field8711[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4419(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x51);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4420(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 81;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
