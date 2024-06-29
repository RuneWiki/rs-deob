import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 extends class140 {

    @OriginalMember(owner = "client!gf", name = "qc", descriptor = "I")
    private int field1116 = 0;

    @OriginalMember(owner = "client!gf", name = "ac", descriptor = "Z")
    private boolean field1100 = false;

    @OriginalMember(owner = "client!gf", name = "Dc", descriptor = "I")
    private int field1129 = 0;

    @OriginalMember(owner = "client!gf", name = "kc", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!gf", name = "Cc", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client!gf", name = "nc", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!gf", name = "rc", descriptor = "I")
    private int field1117;

    @OriginalMember(owner = "client!gf", name = "yc", descriptor = "I")
    private int field1124;

    @OriginalMember(owner = "client!gf", name = "wc", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!gf", name = "uc", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!gf", name = "fc", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!gf", name = "xc", descriptor = "I")
    private int field1123;

    @OriginalMember(owner = "client!gf", name = "lc", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client!gf", name = "Fc", descriptor = "I")
    private int field1131;

    @OriginalMember(owner = "client!gf", name = "Bc", descriptor = "Lbd;")
    private class12 field1127;

    @OriginalMember(owner = "client!gf", name = "Vb", descriptor = "I")
    public static int field1095 = 0;

    @OriginalMember(owner = "client!gf", name = "gc", descriptor = "Lja;")
    public static class62 field1106 = class30.method243(43, "Spieler");

    @OriginalMember(owner = "client!gf", name = "pc", descriptor = "Lja;")
    public static class62 field1115 = class30.method243(43, "Einloggen");

    @OriginalMember(owner = "client!gf", name = "vc", descriptor = "Lja;")
    public static class62 field1121 = class30.method243(43, ")3");

    @OriginalMember(owner = "client!gf", name = "dc", descriptor = "[I")
    public static int[] field1103 = new int[4000];

    @OriginalMember(owner = "client!gf", name = "tc", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!gf", name = "sc", descriptor = "Lja;")
    private static class62 field1118 = class30.method243(43, "scroll:");

    @OriginalMember(owner = "client!gf", name = "Gc", descriptor = "Lja;")
    public static class62 field1132 = field1118;

    @OriginalMember(owner = "client!gf", name = "jc", descriptor = "Lja;")
    public static class62 field1109 = field1118;

    @OriginalMember(owner = "client!gf", name = "Yb", descriptor = "D")
    public double field1098;

    @OriginalMember(owner = "client!gf", name = "Zb", descriptor = "D")
    public double field1099;

    @OriginalMember(owner = "client!gf", name = "hc", descriptor = "D")
    public double field1107;

    @OriginalMember(owner = "client!gf", name = "ic", descriptor = "D")
    private double field1108;

    @OriginalMember(owner = "client!gf", name = "oc", descriptor = "D")
    private double field1114;

    @OriginalMember(owner = "client!gf", name = "zc", descriptor = "D")
    private double field1125;

    @OriginalMember(owner = "client!gf", name = "Ec", descriptor = "D")
    private double field1130;

    @OriginalMember(owner = "client!gf", name = "Ic", descriptor = "D")
    private double field1134;

    @OriginalMember(owner = "client!gf", name = "Wb", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!gf", name = "Xb", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!gf", name = "bc", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!gf", name = "cc", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!gf", name = "ec", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!gf", name = "mc", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!gf", name = "Ac", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!gf", name = "Hc", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(B)Lvb;")
    public final class145 method321(byte arg0) {
        if (arg0 != 3) {
            return null;
        }
        class120 var2 = class38.method289(this.field1131, 2116);
        field1112++;
        class145 var3 = var2.method961(this.field1116, arg0 - 34);
        if (var3 == null) {
            return null;
        } else {
            var3.method1157(this.field1133);
            return var3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
    public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1100) {
            double var6 = (double) (arg1 - this.field1123);
            double var8 = (double) (arg4 - this.field1124);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1098 = this.field1111;
            this.field1099 = (double) this.field1128 * var8 / var10 + (double) this.field1124;
            this.field1107 = (double) this.field1128 * var6 / var10 + (double) this.field1123;
        }
        if (arg2 != -5203) {
            return;
        }
        double var12 = (double) (this.field1120 + 1 - arg0);
        this.field1114 = ((double) arg4 - this.field1099) / var12;
        field1097++;
        this.field1125 = ((double) arg1 - this.field1107) / var12;
        this.field1134 = Math.sqrt(this.field1125 * this.field1125 + this.field1114 * this.field1114);
        if (!this.field1100) {
            this.field1130 = -this.field1134 * Math.tan((double) this.field1117 * 0.02454369D);
        }
        this.field1108 = ((double) arg3 - this.field1098 - this.field1130 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(B)V")
    public static void method341(byte arg0) {
        field1132 = null;
        field1121 = null;
        field1115 = null;
        field1103 = null;
        field1118 = null;
        field1106 = null;
        field1109 = null;
        if (arg0 > -91) {
            field1118 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)V")
    public final void method342(byte arg0, int arg1) {
        if (arg0 > -114) {
            this.method340(-26, 93, 11, -119, 92);
        }
        this.field1099 += (double) arg1 * this.field1114;
        this.field1107 += (double) arg1 * this.field1125;
        this.field1098 += this.field1108 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1130;
        this.field1100 = true;
        field1101++;
        this.field1130 += (double) arg1 * this.field1108;
        this.field1104 = (int) (Math.atan2(this.field1125, this.field1114) * 325.949D) + 1024 & 0x7FF;
        this.field1133 = (int) (Math.atan2(this.field1130, this.field1134) * 325.949D) & 0x7FF;
        if (this.field1127 == null) {
            return;
        }
        this.field1129 += arg1;
        while (true) {
            do {
                do {
                    if (this.field1127.field280[this.field1116] >= this.field1129) {
                        return;
                    }
                    this.field1129 -= this.field1127.field280[this.field1116];
                    this.field1116++;
                } while (this.field1127.field263.length > this.field1116);
                this.field1116 -= this.field1127.field273;
            } while (this.field1116 >= 0 && this.field1127.field263.length > this.field1116);
            this.field1116 = 0;
        }
    }

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
    public static final void method343(int arg0) {
        field1096++;
        if (~class52.field1192 < arg0) {
            class32.method251(arg0);
        } else {
            class62.method473((byte) 49, 40);
            class50.field1147 = class59.field1444;
            class59.field1444 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1110 = arg1;
        this.field1128 = arg8;
        this.field1100 = false;
        this.field1113 = arg9;
        this.field1117 = arg7;
        this.field1124 = arg3;
        this.field1122 = arg10;
        this.field1120 = arg6;
        this.field1105 = arg5;
        this.field1123 = arg2;
        this.field1111 = arg4;
        this.field1131 = arg0;
        int var12 = class38.method289(this.field1131, 2116).field2743;
        if (var12 == -1) {
            this.field1127 = null;
        } else {
            this.field1127 = class141.method1121(var12, -24732);
        }
    }
}
