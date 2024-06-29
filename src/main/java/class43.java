import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QIFJGOLN")
public class class43 extends class68 {

    @OriginalMember(owner = "client!QIFJGOLN", name = "t", descriptor = "Z")
    public boolean field1208 = false;

    @OriginalMember(owner = "client!QIFJGOLN", name = "u", descriptor = "LJXKRPXFX;")
    private class24 field1209;

    @OriginalMember(owner = "client!QIFJGOLN", name = "D", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "client!QIFJGOLN", name = "x", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "client!QIFJGOLN", name = "y", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!QIFJGOLN", name = "z", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!QIFJGOLN", name = "B", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!QIFJGOLN", name = "C", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!QIFJGOLN", name = "p", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!QIFJGOLN", name = "q", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!QIFJGOLN", name = "r", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!QIFJGOLN", name = "A", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!QIFJGOLN", name = "l", descriptor = "D")
    private double field1200;

    @OriginalMember(owner = "client!QIFJGOLN", name = "m", descriptor = "D")
    private double field1201;

    @OriginalMember(owner = "client!QIFJGOLN", name = "n", descriptor = "D")
    private double field1202;

    @OriginalMember(owner = "client!QIFJGOLN", name = "o", descriptor = "D")
    private double field1203;

    @OriginalMember(owner = "client!QIFJGOLN", name = "s", descriptor = "D")
    private double field1207;

    @OriginalMember(owner = "client!QIFJGOLN", name = "G", descriptor = "D")
    public double field1221;

    @OriginalMember(owner = "client!QIFJGOLN", name = "H", descriptor = "D")
    public double field1222;

    @OriginalMember(owner = "client!QIFJGOLN", name = "I", descriptor = "D")
    public double field1223;

    @OriginalMember(owner = "client!QIFJGOLN", name = "v", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!QIFJGOLN", name = "w", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!QIFJGOLN", name = "E", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client!QIFJGOLN", name = "F", descriptor = "I")
    private int field1220;

    @OriginalMember(owner = "client!QIFJGOLN", name = "a", descriptor = "(IIIBI)V")
    public final void method427(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -90) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (!this.field1208) {
            double var7 = (double) (arg2 - this.field1212);
            double var9 = (double) (arg4 - this.field1213);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field1221 = (double) this.field1205 * var7 / var11 + (double) this.field1212;
            this.field1222 = (double) this.field1205 * var9 / var11 + (double) this.field1213;
            this.field1223 = this.field1214;
        }
        double var13 = (double) (this.field1217 + 1 - arg1);
        this.field1200 = ((double) arg2 - this.field1221) / var13;
        this.field1201 = ((double) arg4 - this.field1222) / var13;
        this.field1202 = Math.sqrt(this.field1201 * this.field1201 + this.field1200 * this.field1200);
        if (!this.field1208) {
            this.field1203 = -this.field1202 * Math.tan((double) this.field1204 * 0.02454369D);
        }
        this.field1207 = ((double) arg0 - this.field1223 - this.field1203 * var13) * 2.0D / (var13 * var13);
    }

    @OriginalMember(owner = "client!QIFJGOLN", name = "a", descriptor = "(II)V")
    public final void method428(int arg0, int arg1) {
        this.field1208 = true;
        this.field1221 += (double) arg0 * this.field1200;
        this.field1222 += (double) arg0 * this.field1201;
        this.field1223 += this.field1207 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1203;
        this.field1203 += (double) arg0 * this.field1207;
        this.field1210 = (int) (Math.atan2(this.field1200, this.field1201) * 325.949D) + 1024 & 0x7FF;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1211 = (int) (Math.atan2(this.field1203, this.field1202) * 325.949D) & 0x7FF;
        if (this.field1209.field763 == null) {
            return;
        }
        this.field1220 += arg0;
        while (this.field1220 > this.field1209.field763.method405(-251, this.field1219)) {
            this.field1220 -= this.field1209.field763.method405(-251, this.field1219);
            this.field1219++;
            if (this.field1219 >= this.field1209.field763.field1114) {
                this.field1219 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!QIFJGOLN", name = "<init>", descriptor = "(IIIIZIIIIIII)V")
    public class43(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1209 = class24.field759[arg7];
        if (arg4) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        this.field1218 = arg11;
        this.field1212 = arg2;
        this.field1213 = arg3;
        this.field1214 = arg0;
        this.field1216 = arg1;
        this.field1217 = arg9;
        this.field1204 = arg5;
        this.field1205 = arg6;
        this.field1206 = arg8;
        this.field1215 = arg10;
        this.field1208 = false;
    }

    @OriginalMember(owner = "client!QIFJGOLN", name = "a", descriptor = "(B)LKUGNQTGL;")
    public final class28 method40(byte arg0) {
        class28 var2 = this.field1209.method308();
        if (arg0 == 0) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2 == null) {
            return null;
        }
        int var5 = -1;
        if (this.field1209.field763 != null) {
            var5 = this.field1209.field763.field1115[this.field1219];
        }
        class28 var6 = new class28(var2, false, true, class53.method455(true, var5), 584);
        if (var5 != -1) {
            var6.method337(4);
            var6.method338(false, var5);
            var6.field849 = null;
            var6.field848 = null;
        }
        if (this.field1209.field766 != 128 || this.field1209.field767 != 128) {
            var6.method346(this.field1209.field766, this.field1209.field766, -480, this.field1209.field767);
        }
        var6.method342(this.field1211, false);
        var6.method347(this.field1209.field769 + 64, this.field1209.field770 + 850, -30, -50, -30, true);
        return var6;
    }
}
