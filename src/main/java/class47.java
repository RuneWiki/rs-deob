import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QGPCEBJK")
public class class47 extends class66 {

    @OriginalMember(owner = "QGPCEBJK", name = "v", descriptor = "Z")
    private boolean field1283 = false;

    @OriginalMember(owner = "QGPCEBJK", name = "w", descriptor = "B")
    private byte field1284 = 29;

    @OriginalMember(owner = "QGPCEBJK", name = "x", descriptor = "Z")
    public boolean field1285 = false;

    @OriginalMember(owner = "QGPCEBJK", name = "H", descriptor = "LTGIKVGNH;")
    private class55 field1295;

    @OriginalMember(owner = "QGPCEBJK", name = "t", descriptor = "I")
    public int field1281;

    @OriginalMember(owner = "QGPCEBJK", name = "m", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "QGPCEBJK", name = "n", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "QGPCEBJK", name = "o", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "QGPCEBJK", name = "I", descriptor = "I")
    public int field1296;

    @OriginalMember(owner = "QGPCEBJK", name = "J", descriptor = "I")
    public int field1297;

    @OriginalMember(owner = "QGPCEBJK", name = "y", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "QGPCEBJK", name = "z", descriptor = "I")
    public int field1287;

    @OriginalMember(owner = "QGPCEBJK", name = "A", descriptor = "I")
    public int field1288;

    @OriginalMember(owner = "QGPCEBJK", name = "p", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "QGPCEBJK", name = "q", descriptor = "D")
    public double field1278;

    @OriginalMember(owner = "QGPCEBJK", name = "r", descriptor = "D")
    public double field1279;

    @OriginalMember(owner = "QGPCEBJK", name = "s", descriptor = "D")
    public double field1280;

    @OriginalMember(owner = "QGPCEBJK", name = "u", descriptor = "D")
    private double field1282;

    @OriginalMember(owner = "QGPCEBJK", name = "B", descriptor = "D")
    private double field1289;

    @OriginalMember(owner = "QGPCEBJK", name = "C", descriptor = "D")
    private double field1290;

    @OriginalMember(owner = "QGPCEBJK", name = "D", descriptor = "D")
    private double field1291;

    @OriginalMember(owner = "QGPCEBJK", name = "E", descriptor = "D")
    private double field1292;

    @OriginalMember(owner = "QGPCEBJK", name = "k", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "QGPCEBJK", name = "l", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "QGPCEBJK", name = "F", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "QGPCEBJK", name = "G", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "QGPCEBJK", name = "a", descriptor = "(I)LKBEXSZSN;")
    public final class31 method28(int arg0) {
        class31 var2 = this.field1295.method461();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1295.field1371 != null) {
            var3 = this.field1295.field1371.field1186[this.field1272];
        }
        class31 var4 = new class31(false, 777, class25.method309(var3, false), var2, true);
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        if (var3 != -1) {
            var4.method346(311);
            var4.method347(-486, var3);
            var4.field1032 = null;
            var4.field1031 = null;
        }
        if (this.field1295.field1374 != 128 || this.field1295.field1375 != 128) {
            var4.method355(this.field1284, this.field1295.field1374, this.field1295.field1375, this.field1295.field1374);
        }
        var4.method351(this.field1294, -336);
        var4.method356(this.field1295.field1377 + 64, this.field1295.field1378 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "QGPCEBJK", name = "a", descriptor = "(IIZII)V")
    public final void method437(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field1285) {
            double var6 = (double) (arg3 - this.field1274);
            double var8 = (double) (arg0 - this.field1275);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1278 = (double) this.field1287 * var6 / var10 + (double) this.field1274;
            this.field1279 = (double) this.field1287 * var8 / var10 + (double) this.field1275;
            this.field1280 = this.field1276;
        }
        double var12 = (double) (this.field1297 + 1 - arg1);
        this.field1289 = ((double) arg3 - this.field1278) / var12;
        if (arg2) {
            this.field1283 = !this.field1283;
        }
        this.field1290 = ((double) arg0 - this.field1279) / var12;
        this.field1291 = Math.sqrt(this.field1290 * this.field1290 + this.field1289 * this.field1289);
        if (!this.field1285) {
            this.field1292 = -this.field1291 * Math.tan((double) this.field1286 * 0.02454369D);
        }
        this.field1282 = ((double) arg4 - this.field1280 - this.field1292 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "QGPCEBJK", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1295 = class55.field1367[arg11];
        this.field1281 = arg5;
        this.field1274 = arg7;
        this.field1275 = arg10;
        this.field1276 = arg9;
        this.field1296 = arg8;
        this.field1297 = arg1;
        this.field1286 = arg2;
        this.field1287 = arg4;
        this.field1288 = arg3;
        this.field1277 = arg0;
        this.field1285 = false;
        int var13 = 95 / arg6;
    }

    @OriginalMember(owner = "QGPCEBJK", name = "a", descriptor = "(II)V")
    public final void method438(int arg0, int arg1) {
        this.field1285 = true;
        this.field1278 += (double) arg1 * this.field1289;
        this.field1279 += (double) arg1 * this.field1290;
        this.field1280 += this.field1282 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1292;
        this.field1292 += (double) arg1 * this.field1282;
        if (arg0 != 0) {
            return;
        }
        this.field1293 = (int) (Math.atan2(this.field1289, this.field1290) * 325.949D) + 1024 & 0x7FF;
        this.field1294 = (int) (Math.atan2(this.field1292, this.field1291) * 325.949D) & 0x7FF;
        if (this.field1295.field1371 == null) {
            return;
        }
        this.field1273 += arg1;
        while (this.field1273 > this.field1295.field1371.method413(this.field1272, false)) {
            this.field1273 -= this.field1295.field1371.method413(this.field1272, false) + 1;
            this.field1272++;
            if (this.field1272 >= this.field1295.field1371.field1185) {
                this.field1272 = 0;
            }
        }
    }
}
