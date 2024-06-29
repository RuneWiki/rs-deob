import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!KTKZBCIU")
public class class35 extends class11 {

    @OriginalMember(owner = "client!KTKZBCIU", name = "G", descriptor = "Z")
    public boolean field1178 = false;

    @OriginalMember(owner = "client!KTKZBCIU", name = "H", descriptor = "Z")
    private boolean field1179 = true;

    @OriginalMember(owner = "client!KTKZBCIU", name = "l", descriptor = "LHTOEUNMD;")
    private class24 field1157;

    @OriginalMember(owner = "client!KTKZBCIU", name = "p", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!KTKZBCIU", name = "q", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!KTKZBCIU", name = "r", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!KTKZBCIU", name = "s", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!KTKZBCIU", name = "m", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "client!KTKZBCIU", name = "n", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!KTKZBCIU", name = "D", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!KTKZBCIU", name = "E", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!KTKZBCIU", name = "F", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!KTKZBCIU", name = "t", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!KTKZBCIU", name = "o", descriptor = "D")
    private double field1160;

    @OriginalMember(owner = "client!KTKZBCIU", name = "w", descriptor = "D")
    private double field1168;

    @OriginalMember(owner = "client!KTKZBCIU", name = "x", descriptor = "D")
    private double field1169;

    @OriginalMember(owner = "client!KTKZBCIU", name = "y", descriptor = "D")
    private double field1170;

    @OriginalMember(owner = "client!KTKZBCIU", name = "z", descriptor = "D")
    private double field1171;

    @OriginalMember(owner = "client!KTKZBCIU", name = "A", descriptor = "D")
    public double field1172;

    @OriginalMember(owner = "client!KTKZBCIU", name = "B", descriptor = "D")
    public double field1173;

    @OriginalMember(owner = "client!KTKZBCIU", name = "C", descriptor = "D")
    public double field1174;

    @OriginalMember(owner = "client!KTKZBCIU", name = "u", descriptor = "I")
    private int field1166;

    @OriginalMember(owner = "client!KTKZBCIU", name = "v", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client!KTKZBCIU", name = "I", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!KTKZBCIU", name = "J", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!KTKZBCIU", name = "a", descriptor = "(I)LOGORHYVW;")
    public final class45 method5(int arg0) {
        class45 var2 = this.field1157.method245();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1157.field868 != null) {
            var3 = this.field1157.field868.field1142[this.field1166];
        }
        class45 var4 = new class45(-18434, true, var2, class47.method467((byte) -39, var3), false);
        if (var3 != -1) {
            var4.method440(474);
            var4.method441((byte) 9, var3);
            var4.field1308 = null;
            var4.field1307 = null;
        }
        if (this.field1157.field871 != 128 || this.field1157.field872 != 128) {
            var4.method449(this.field1157.field871, 23590, this.field1157.field871, this.field1157.field872);
        }
        var4.method445((byte) 102, this.field1181);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        var4.method450(this.field1157.field874 + 64, this.field1157.field875 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "client!KTKZBCIU", name = "a", descriptor = "(IIIII)V")
    public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1178) {
            double var6 = (double) (arg2 - this.field1162);
            double var8 = (double) (arg0 - this.field1163);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1172 = (double) this.field1176 * var6 / var10 + (double) this.field1162;
            this.field1173 = (double) this.field1176 * var8 / var10 + (double) this.field1163;
            this.field1174 = this.field1164;
        }
        double var12 = (double) (this.field1159 + 1 - arg3);
        this.field1168 = ((double) arg2 - this.field1172) / var12;
        this.field1169 = ((double) arg0 - this.field1173) / var12;
        this.field1170 = Math.sqrt(this.field1169 * this.field1169 + this.field1168 * this.field1168);
        if (arg4 < 0) {
            if (!this.field1178) {
                this.field1171 = -this.field1170 * Math.tan((double) this.field1175 * 0.02454369D);
            }
            this.field1160 = ((double) arg1 - this.field1174 - this.field1171 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!KTKZBCIU", name = "a", descriptor = "(IZ)V")
    public final void method378(int arg0, boolean arg1) {
        this.field1178 = true;
        this.field1172 += (double) arg0 * this.field1168;
        this.field1173 += (double) arg0 * this.field1169;
        if (!arg1) {
            this.field1179 = !this.field1179;
        }
        this.field1174 += this.field1160 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1171;
        this.field1171 += (double) arg0 * this.field1160;
        this.field1180 = (int) (Math.atan2(this.field1168, this.field1169) * 325.949D) + 1024 & 0x7FF;
        this.field1181 = (int) (Math.atan2(this.field1171, this.field1170) * 325.949D) & 0x7FF;
        if (this.field1157.field868 == null) {
            return;
        }
        this.field1167 += arg0;
        while (this.field1167 > this.field1157.field868.method375((byte) -37, this.field1166)) {
            this.field1167 -= this.field1157.field868.method375((byte) -37, this.field1166) + 1;
            this.field1166++;
            if (this.field1166 >= this.field1157.field868.field1141) {
                this.field1166 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!KTKZBCIU", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1157 = class24.field864[arg1];
        this.field1161 = arg9;
        this.field1162 = arg7;
        this.field1163 = arg11;
        this.field1164 = arg0;
        this.field1158 = arg8;
        this.field1159 = arg3;
        this.field1175 = arg6;
        if (arg2 >= 0) {
            throw new NullPointerException();
        }
        this.field1176 = arg4;
        this.field1177 = arg10;
        this.field1165 = arg5;
        this.field1178 = false;
    }
}
