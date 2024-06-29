import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ODNHGUWK")
public class class39 extends class53 {

    @OriginalMember(owner = "client!ODNHGUWK", name = "n", descriptor = "Z")
    public boolean field1198 = false;

    @OriginalMember(owner = "client!ODNHGUWK", name = "z", descriptor = "Z")
    private boolean field1210 = true;

    @OriginalMember(owner = "client!ODNHGUWK", name = "J", descriptor = "I")
    private int field1220 = -462;

    @OriginalMember(owner = "client!ODNHGUWK", name = "A", descriptor = "LBZLQCUPI;")
    private class4 field1211;

    @OriginalMember(owner = "client!ODNHGUWK", name = "B", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "client!ODNHGUWK", name = "s", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!ODNHGUWK", name = "t", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!ODNHGUWK", name = "u", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!ODNHGUWK", name = "C", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!ODNHGUWK", name = "D", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!ODNHGUWK", name = "E", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!ODNHGUWK", name = "F", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!ODNHGUWK", name = "G", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!ODNHGUWK", name = "v", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!ODNHGUWK", name = "k", descriptor = "D")
    public double field1195;

    @OriginalMember(owner = "client!ODNHGUWK", name = "l", descriptor = "D")
    public double field1196;

    @OriginalMember(owner = "client!ODNHGUWK", name = "m", descriptor = "D")
    public double field1197;

    @OriginalMember(owner = "client!ODNHGUWK", name = "o", descriptor = "D")
    private double field1199;

    @OriginalMember(owner = "client!ODNHGUWK", name = "p", descriptor = "D")
    private double field1200;

    @OriginalMember(owner = "client!ODNHGUWK", name = "q", descriptor = "D")
    private double field1201;

    @OriginalMember(owner = "client!ODNHGUWK", name = "r", descriptor = "D")
    private double field1202;

    @OriginalMember(owner = "client!ODNHGUWK", name = "w", descriptor = "D")
    private double field1207;

    @OriginalMember(owner = "client!ODNHGUWK", name = "x", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!ODNHGUWK", name = "y", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!ODNHGUWK", name = "H", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client!ODNHGUWK", name = "I", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client!ODNHGUWK", name = "a", descriptor = "(IIIZI)V")
    public final void method438(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!this.field1198) {
            double var6 = (double) (arg1 - this.field1203);
            double var8 = (double) (arg0 - this.field1204);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1195 = (double) this.field1216 * var6 / var10 + (double) this.field1203;
            this.field1196 = (double) this.field1216 * var8 / var10 + (double) this.field1204;
            this.field1197 = this.field1205;
        }
        double var12 = (double) (this.field1214 + 1 - arg4);
        this.field1199 = ((double) arg1 - this.field1195) / var12;
        this.field1200 = ((double) arg0 - this.field1196) / var12;
        if (arg3) {
            this.field1220 = -378;
        }
        this.field1201 = Math.sqrt(this.field1200 * this.field1200 + this.field1199 * this.field1199);
        if (!this.field1198) {
            this.field1202 = -this.field1201 * Math.tan((double) this.field1215 * 0.02454369D);
        }
        this.field1207 = ((double) arg2 - this.field1197 - this.field1202 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!ODNHGUWK", name = "<init>", descriptor = "(IIIIIBIIIIII)V")
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg5 != 5) {
            throw new NullPointerException();
        }
        boolean var13 = false;
        this.field1211 = class4.field43[arg3];
        this.field1212 = arg0;
        this.field1203 = arg1;
        this.field1204 = arg7;
        this.field1205 = arg6;
        this.field1213 = arg4;
        this.field1214 = arg8;
        this.field1215 = arg9;
        this.field1216 = arg11;
        this.field1217 = arg10;
        this.field1206 = arg2;
        this.field1198 = false;
    }

    @OriginalMember(owner = "client!ODNHGUWK", name = "a", descriptor = "(II)V")
    public final void method439(int arg0, int arg1) {
        this.field1198 = true;
        if (arg1 != 0) {
            return;
        }
        this.field1195 += (double) arg0 * this.field1199;
        this.field1196 += (double) arg0 * this.field1200;
        this.field1197 += this.field1207 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1202;
        this.field1202 += (double) arg0 * this.field1207;
        this.field1208 = (int) (Math.atan2(this.field1199, this.field1200) * 325.949D) + 1024 & 0x7FF;
        this.field1209 = (int) (Math.atan2(this.field1202, this.field1201) * 325.949D) & 0x7FF;
        if (this.field1211.field47 == null) {
            return;
        }
        this.field1219 += arg0;
        while (this.field1219 > this.field1211.field47.method252(this.field1218, -26977)) {
            this.field1219 -= this.field1211.field47.method252(this.field1218, -26977) + 1;
            this.field1218++;
            if (this.field1218 >= this.field1211.field47.field838) {
                this.field1218 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ODNHGUWK", name = "a", descriptor = "(B)LCYPZUKMB;")
    public final class8 method2(byte arg0) {
        class8 var2 = this.field1211.method9();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1211.field47 != null) {
            var3 = this.field1211.field47.field839[this.field1218];
        }
        class8 var4 = new class8(class46.method469(var3, true), var2, false, false, true);
        if (var3 != -1) {
            var4.method203(166);
            var4.method204(257, var3);
            var4.field651 = null;
            var4.field650 = null;
        }
        if (this.field1211.field50 != 128 || this.field1211.field51 != 128) {
            var4.method212(this.field1211.field50, -39776, this.field1211.field51, this.field1211.field50);
        }
        var4.method208(this.field1209, 5419);
        if (arg0 != -99) {
            this.field1210 = !this.field1210;
        }
        var4.method213(this.field1211.field53 + 64, this.field1211.field54 + 850, -30, -50, -30, true);
        return var4;
    }
}
