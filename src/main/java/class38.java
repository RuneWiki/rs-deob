import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LQMHWDJZ")
public class class38 extends class21 {

    @OriginalMember(owner = "LQMHWDJZ", name = "q", descriptor = "Z")
    public boolean field1122 = false;

    @OriginalMember(owner = "LQMHWDJZ", name = "E", descriptor = "I")
    private int field1136 = -22136;

    @OriginalMember(owner = "LQMHWDJZ", name = "G", descriptor = "B")
    private byte field1138 = -15;

    @OriginalMember(owner = "LQMHWDJZ", name = "H", descriptor = "Z")
    private boolean field1139 = false;

    @OriginalMember(owner = "LQMHWDJZ", name = "I", descriptor = "Z")
    private boolean field1140 = false;

    @OriginalMember(owner = "LQMHWDJZ", name = "p", descriptor = "LUIVLSYQW;")
    private class57 field1121;

    @OriginalMember(owner = "LQMHWDJZ", name = "m", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "LQMHWDJZ", name = "t", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "LQMHWDJZ", name = "u", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "LQMHWDJZ", name = "v", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "LQMHWDJZ", name = "r", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "LQMHWDJZ", name = "s", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "LQMHWDJZ", name = "L", descriptor = "I")
    public int field1143;

    @OriginalMember(owner = "LQMHWDJZ", name = "M", descriptor = "I")
    public int field1144;

    @OriginalMember(owner = "LQMHWDJZ", name = "N", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "LQMHWDJZ", name = "w", descriptor = "I")
    public int field1128;

    @OriginalMember(owner = "LQMHWDJZ", name = "x", descriptor = "D")
    private double field1129;

    @OriginalMember(owner = "LQMHWDJZ", name = "y", descriptor = "D")
    private double field1130;

    @OriginalMember(owner = "LQMHWDJZ", name = "z", descriptor = "D")
    private double field1131;

    @OriginalMember(owner = "LQMHWDJZ", name = "A", descriptor = "D")
    private double field1132;

    @OriginalMember(owner = "LQMHWDJZ", name = "B", descriptor = "D")
    public double field1133;

    @OriginalMember(owner = "LQMHWDJZ", name = "C", descriptor = "D")
    public double field1134;

    @OriginalMember(owner = "LQMHWDJZ", name = "D", descriptor = "D")
    public double field1135;

    @OriginalMember(owner = "LQMHWDJZ", name = "F", descriptor = "D")
    private double field1137;

    @OriginalMember(owner = "LQMHWDJZ", name = "n", descriptor = "I")
    private int field1119;

    @OriginalMember(owner = "LQMHWDJZ", name = "o", descriptor = "I")
    private int field1120;

    @OriginalMember(owner = "LQMHWDJZ", name = "J", descriptor = "I")
    public int field1141;

    @OriginalMember(owner = "LQMHWDJZ", name = "K", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "LQMHWDJZ", name = "a", descriptor = "(IIIIB)V")
    public final void method458(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field1122) {
            double var6 = (double) (arg2 - this.field1125);
            double var8 = (double) (arg0 - this.field1126);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1133 = (double) this.field1144 * var6 / var10 + (double) this.field1125;
            this.field1134 = (double) this.field1144 * var8 / var10 + (double) this.field1126;
            this.field1135 = this.field1127;
        }
        double var12 = (double) (this.field1124 + 1 - arg3);
        this.field1129 = ((double) arg2 - this.field1133) / var12;
        this.field1130 = ((double) arg0 - this.field1134) / var12;
        if (this.field1138 != arg4) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        this.field1131 = Math.sqrt(this.field1130 * this.field1130 + this.field1129 * this.field1129);
        if (!this.field1122) {
            this.field1132 = -this.field1131 * Math.tan((double) this.field1143 * 0.02454369D);
        }
        this.field1137 = ((double) arg1 - this.field1135 - this.field1132 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "LQMHWDJZ", name = "a", descriptor = "(ZI)V")
    public final void method459(boolean arg0, int arg1) {
        this.field1122 = true;
        this.field1133 += (double) arg1 * this.field1129;
        this.field1134 += (double) arg1 * this.field1130;
        this.field1135 += this.field1137 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1132;
        this.field1132 += (double) arg1 * this.field1137;
        this.field1141 = (int) (Math.atan2(this.field1129, this.field1130) * 325.949D) + 1024 & 0x7FF;
        if (arg0) {
            return;
        }
        this.field1142 = (int) (Math.atan2(this.field1132, this.field1131) * 325.949D) & 0x7FF;
        if (this.field1121.field1388 == null) {
            return;
        }
        this.field1120 += arg1;
        while (this.field1120 > this.field1121.field1388.method566(this.field1119, (byte) 2)) {
            this.field1120 -= this.field1121.field1388.method566(this.field1119, (byte) 2) + 1;
            this.field1119++;
            if (this.field1119 >= this.field1121.field1388.field1609) {
                this.field1119 = 0;
            }
        }
    }

    @OriginalMember(owner = "LQMHWDJZ", name = "<init>", descriptor = "(IIZIIIIIIIII)V")
    public class38(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1121 = class57.field1384[arg0];
        this.field1118 = arg1;
        this.field1125 = arg8;
        this.field1126 = arg9;
        this.field1127 = arg3;
        this.field1123 = arg6;
        this.field1124 = arg7;
        this.field1143 = arg11;
        this.field1144 = arg10;
        if (arg2) {
            throw new NullPointerException();
        }
        this.field1145 = arg4;
        this.field1128 = arg5;
        this.field1122 = false;
    }

    @OriginalMember(owner = "LQMHWDJZ", name = "a", descriptor = "(I)LHEQROJXW;")
    public final class27 method1(int arg0) {
        class27 var2 = this.field1121.method539();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1121.field1388 != null) {
            var3 = this.field1121.field1388.field1610[this.field1119];
        }
        class27 var4 = new class27(-167, false, true, class56.method536(var3, 9643), var2);
        if (var3 != -1) {
            var4.method329(true);
            var4.method330(var3, 0);
            var4.field882 = null;
            var4.field881 = null;
        }
        if (this.field1121.field1391 != 128 || this.field1121.field1392 != 128) {
            var4.method338(this.field1121.field1392, 24701, this.field1121.field1391, this.field1121.field1391);
        }
        var4.method334(this.field1140, this.field1142);
        if (arg0 != 8) {
            this.field1136 = 201;
        }
        var4.method339(this.field1121.field1394 + 64, this.field1121.field1395 + 850, -30, -50, -30, true);
        return var4;
    }
}
