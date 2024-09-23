import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QOQPOLAC")
public class class51 extends class39 {

    @OriginalMember(owner = "QOQPOLAC", name = "s", descriptor = "I")
    private int field1241 = 1;

    @OriginalMember(owner = "QOQPOLAC", name = "E", descriptor = "Z")
    private boolean field1253 = true;

    @OriginalMember(owner = "QOQPOLAC", name = "I", descriptor = "I")
    private int field1257 = -39282;

    @OriginalMember(owner = "QOQPOLAC", name = "M", descriptor = "Z")
    public boolean field1261 = false;

    @OriginalMember(owner = "QOQPOLAC", name = "z", descriptor = "LVSBOWDVL;")
    private class66 field1248;

    @OriginalMember(owner = "QOQPOLAC", name = "F", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "QOQPOLAC", name = "t", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "QOQPOLAC", name = "u", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "QOQPOLAC", name = "v", descriptor = "I")
    public int field1244;

    @OriginalMember(owner = "QOQPOLAC", name = "q", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "QOQPOLAC", name = "r", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "QOQPOLAC", name = "m", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "QOQPOLAC", name = "n", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "QOQPOLAC", name = "o", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "QOQPOLAC", name = "w", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "QOQPOLAC", name = "p", descriptor = "D")
    private double field1238;

    @OriginalMember(owner = "QOQPOLAC", name = "A", descriptor = "D")
    private double field1249;

    @OriginalMember(owner = "QOQPOLAC", name = "B", descriptor = "D")
    private double field1250;

    @OriginalMember(owner = "QOQPOLAC", name = "C", descriptor = "D")
    private double field1251;

    @OriginalMember(owner = "QOQPOLAC", name = "D", descriptor = "D")
    private double field1252;

    @OriginalMember(owner = "QOQPOLAC", name = "J", descriptor = "D")
    public double field1258;

    @OriginalMember(owner = "QOQPOLAC", name = "K", descriptor = "D")
    public double field1259;

    @OriginalMember(owner = "QOQPOLAC", name = "L", descriptor = "D")
    public double field1260;

    @OriginalMember(owner = "QOQPOLAC", name = "x", descriptor = "I")
    public int field1246;

    @OriginalMember(owner = "QOQPOLAC", name = "y", descriptor = "I")
    public int field1247;

    @OriginalMember(owner = "QOQPOLAC", name = "G", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "QOQPOLAC", name = "H", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "QOQPOLAC", name = "a", descriptor = "(IIIII)V")
    public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0) {
            this.field1241 = -175;
        }
        if (!this.field1261) {
            double var6 = (double) (arg0 - this.field1242);
            double var8 = (double) (arg1 - this.field1243);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1258 = (double) this.field1236 * var6 / var10 + (double) this.field1242;
            this.field1259 = (double) this.field1236 * var8 / var10 + (double) this.field1243;
            this.field1260 = this.field1244;
        }
        double var12 = (double) (this.field1240 + 1 - arg4);
        this.field1249 = ((double) arg0 - this.field1258) / var12;
        this.field1250 = ((double) arg1 - this.field1259) / var12;
        this.field1251 = Math.sqrt(this.field1250 * this.field1250 + this.field1249 * this.field1249);
        if (!this.field1261) {
            this.field1252 = -this.field1251 * Math.tan((double) this.field1235 * 0.02454369D);
        }
        this.field1238 = ((double) arg3 - this.field1260 - this.field1252 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "QOQPOLAC", name = "a", descriptor = "(I)LFUTAQMCE;")
    public final class19 method2(int arg0) {
        if (this.field1257 != arg0) {
            this.field1253 = !this.field1253;
        }
        class19 var2 = this.field1248.method519();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1248.field1609 != null) {
            var3 = this.field1248.field1609.field819[this.field1255];
        }
        class19 var4 = new class19(var2, false, (byte) 2, true, class55.method428(4, var3));
        if (var3 != -1) {
            var4.method257(284);
            var4.method258(var3, 4);
            var4.field765 = null;
            var4.field764 = null;
        }
        if (this.field1248.field1612 != 128 || this.field1248.field1613 != 128) {
            var4.method266(this.field1248.field1612, this.field1248.field1613, this.field1248.field1612, -9317);
        }
        var4.method262(this.field1247, 0);
        var4.method267(this.field1248.field1615 + 64, this.field1248.field1616 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "QOQPOLAC", name = "<init>", descriptor = "(IIIIIIIIIZII)V")
    public class51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        this.field1248 = class66.field1605[arg3];
        this.field1254 = arg7;
        if (!arg9) {
            throw new NullPointerException();
        }
        this.field1242 = arg11;
        this.field1243 = arg10;
        this.field1244 = arg4;
        this.field1239 = arg2;
        this.field1240 = arg6;
        this.field1235 = arg1;
        this.field1236 = arg0;
        this.field1237 = arg5;
        this.field1245 = arg8;
        this.field1261 = false;
    }

    @OriginalMember(owner = "QOQPOLAC", name = "a", descriptor = "(IZ)V")
    public final void method404(int arg0, boolean arg1) {
        this.field1261 = true;
        this.field1258 += (double) arg0 * this.field1249;
        this.field1259 += (double) arg0 * this.field1250;
        this.field1260 += this.field1238 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1252;
        this.field1252 += (double) arg0 * this.field1238;
        if (!arg1) {
            this.field1241 = -99;
        }
        this.field1246 = (int) (Math.atan2(this.field1249, this.field1250) * 325.949D) + 1024 & 0x7FF;
        this.field1247 = (int) (Math.atan2(this.field1252, this.field1251) * 325.949D) & 0x7FF;
        if (this.field1248.field1609 == null) {
            return;
        }
        this.field1256 += arg0;
        while (this.field1256 > this.field1248.field1609.method277((byte) 110, this.field1255)) {
            this.field1256 -= this.field1248.field1609.method277((byte) 110, this.field1255) + 1;
            this.field1255++;
            if (this.field1255 >= this.field1248.field1609.field818) {
                this.field1255 = 0;
            }
        }
    }
}
