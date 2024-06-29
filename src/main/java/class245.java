import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class245 extends class636 {

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    private int field3245;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    private int field3246;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    private int field3249;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    private int field3244;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    private int field3242;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    private int field3251;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Luca;")
    private class287 field3243;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Lmv;")
    public static class295 field3247;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "Leg;")
    private class364 field3250;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static void method1496(int arg0) {
        field3247 = null;
        if (arg0 != 8226) {
            method1500(76);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([BIILjava/lang/String;IB)I")
    public static final int method1497(byte[] arg0, int arg1, int arg2, String arg3, int arg4, byte arg5) {
        field3248++;
        if (arg5 != -122) {
            return 36;
        }
        int var6 = arg4 - arg1;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg2 + var7] = -97;
            } else {
                arg0[arg2 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Leg;")
    public final class364 method1498(int arg0) {
        field3241++;
        if (this.field3250 == null) {
            class694.field9789[1] = this.field3245;
            class694.field9789[4] = this.field3249;
            class694.field9789[0] = this.field3246;
            class694.field9789[5] = this.field3251;
            class694.field9789[2] = this.field3244;
            class694.field9789[3] = this.field3242;
            class615 var2 = this.field3243.field1491;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method956(class694.field9789[var5], 15925)) {
                    return null;
                }
                class457 var7 = var2.method955(-1330, class694.field9789[var5]);
                int var8 = var7.field6610 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field6605 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class461.field6638[var6] = var2.method958(1.0F, var4, -17786, false, var4, class694.field9789[var6]);
            }
            this.field3250 = new class364(this.field3243, 6407, var4, var3, class461.field6638);
        }
        if (arg0 > -35) {
            method1499(-17);
        }
        return this.field3250;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
    public static final void method1499(int arg0) {
        class2.field15.method2471(true);
        field3240++;
        class547.field8069.method2786(14778);
        class177.field2477.method3576((byte) -116);
        class60.field965.method2599(-106);
        class563.field8235.method1090((byte) 78);
        class259.field3355.method2391(105);
        class203.field2769.method2973(-1);
        class134.field1945.method3083((byte) -51);
        class449.field6504.method1963((byte) -50);
        class683.field9635.method1381(16);
        class547.field8070.method409(true);
        class652.field9331.method229((byte) 65);
        class189.field2572.method2755(99);
        class586.field8507.method1453((byte) -92);
        class141.field2041.method1507(-1);
        class251.field3294.method380(1564433289);
        class274.field3588.method179((byte) -69);
        class342.field5068.method2765(31);
        class252.field3301.method745(true);
        class503.field7119.method61(false);
        class162.method1147((byte) -120);
        class205.method1320(0);
        class151.method1074(true);
        class51.method303((byte) 69);
        if (class280.field3708 != class215.field2882) {
            for (int var1 = 0; var1 < class102.field1535.length; var1++) {
                class102.field1535[var1] = null;
            }
            class412.field6120 = 0;
        }
        class102.method731(80);
        class236.method1455(1);
        class189.method1248((byte) 105);
        class605.method3451((byte) -122);
        class251.method1519(0);
        class195.field2634.method3890(-1);
        class332.field4821.method656();
        class573.method3293((byte) 102);
        class117.method868(-74);
        class282.field3772.method1829(0);
        class197.field2702.method1829(0);
        class223.field2947.method1829(0);
        class97.field1483.method1829(0);
        class148.field2100.method1829(0);
        class43.field625.method1829(0);
        class18.field360.method1829(0);
        class638.field9171.method1829(0);
        class595.field8616.method1829(0);
        class510.field7199.method1829(0);
        class288.field4178.method1829(0);
        class251.field3297.method1829(0);
        class587.field8518.method1829(0);
        class283.field3785.method1829(0);
        class674.field9509.method1829(0);
        class657.field9379.method1829(0);
        class554.field8140.method1829(0);
        class654.field9365.method1829(0);
        class425.field6216.method1829(0);
        class394.field5968.method1829(0);
        class224.field2958.method1829(0);
        class56.field878.method1829(0);
        if (arg0 >= -64) {
            field3247 = null;
        }
        class49.field777.method1829(0);
        class326.field4732.method1829(0);
        class537.field7867.method1829(0);
        class51.field797.method1829(0);
        class683.field9637.method1829(0);
        class583.field8473.method1829(0);
        class259.field3360.method1829(0);
        class280.field3711.method1829(0);
        class223.field2951.method1829(0);
        class466.field6715.method1829(0);
        class86.field1341.method3890(-1);
        class218.field2908.method3890(-1);
        class630.field9122.method3890(-1);
        class693.field9788.method3890(-1);
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
    public static final void method1500(int arg0) {
        class470.method2709(-127);
        field3252++;
        class413.method2520(false);
        int var1 = -28 % ((-arg0 - 60) / 33);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Luca;IIIIII)V")
    public class245(class287 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3245 = arg2;
        this.field3246 = arg1;
        this.field3249 = arg5;
        this.field3244 = arg3;
        this.field3242 = arg4;
        this.field3251 = arg6;
        this.field3243 = arg0;
    }
}
