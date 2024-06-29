import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RGPDRBLW")
public class class46 extends class44 {

    @OriginalMember(owner = "client!RGPDRBLW", name = "t", descriptor = "I")
    private int field1304 = 8;

    @OriginalMember(owner = "client!RGPDRBLW", name = "y", descriptor = "Z")
    public boolean field1309 = false;

    @OriginalMember(owner = "client!RGPDRBLW", name = "A", descriptor = "Z")
    private boolean field1311 = false;

    @OriginalMember(owner = "client!RGPDRBLW", name = "N", descriptor = "LMHWTJCHJ;")
    private class37 field1324;

    @OriginalMember(owner = "client!RGPDRBLW", name = "E", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!RGPDRBLW", name = "F", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!RGPDRBLW", name = "G", descriptor = "I")
    public int field1317;

    @OriginalMember(owner = "client!RGPDRBLW", name = "H", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!RGPDRBLW", name = "p", descriptor = "I")
    public int field1300;

    @OriginalMember(owner = "client!RGPDRBLW", name = "q", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!RGPDRBLW", name = "B", descriptor = "I")
    public int field1312;

    @OriginalMember(owner = "client!RGPDRBLW", name = "C", descriptor = "I")
    public int field1313;

    @OriginalMember(owner = "client!RGPDRBLW", name = "D", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!RGPDRBLW", name = "I", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!RGPDRBLW", name = "u", descriptor = "D")
    private double field1305;

    @OriginalMember(owner = "client!RGPDRBLW", name = "v", descriptor = "D")
    private double field1306;

    @OriginalMember(owner = "client!RGPDRBLW", name = "w", descriptor = "D")
    private double field1307;

    @OriginalMember(owner = "client!RGPDRBLW", name = "x", descriptor = "D")
    private double field1308;

    @OriginalMember(owner = "client!RGPDRBLW", name = "J", descriptor = "D")
    private double field1320;

    @OriginalMember(owner = "client!RGPDRBLW", name = "K", descriptor = "D")
    public double field1321;

    @OriginalMember(owner = "client!RGPDRBLW", name = "L", descriptor = "D")
    public double field1322;

    @OriginalMember(owner = "client!RGPDRBLW", name = "M", descriptor = "D")
    public double field1323;

    @OriginalMember(owner = "client!RGPDRBLW", name = "n", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!RGPDRBLW", name = "o", descriptor = "I")
    public int field1299;

    @OriginalMember(owner = "client!RGPDRBLW", name = "r", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!RGPDRBLW", name = "s", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client!RGPDRBLW", name = "z", descriptor = "I")
    private int field1310;

    @OriginalMember(owner = "client!RGPDRBLW", name = "a", descriptor = "(B)LRMLAXPMV;")
    public final class47 method344(byte arg0) {
        if (arg0 != 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class47 var3 = this.field1324.method367();
        if (var3 == null) {
            return null;
        }
        int var4 = -1;
        if (this.field1324.field995 != null) {
            var4 = this.field1324.field995.field889[this.field1302];
        }
        class47 var5 = new class47(var3, class67.method586(true, var4), true, false, true);
        if (var4 != -1) {
            var5.method473(8);
            var5.method474(-770, var4);
            var5.field1368 = null;
            var5.field1367 = null;
        }
        if (this.field1324.field998 != 128 || this.field1324.field999 != 128) {
            var5.method482(this.field1324.field999, this.field1324.field998, this.field1324.field998, this.field1310);
        }
        var5.method478(340, this.field1299);
        var5.method483(this.field1324.field1001 + 64, this.field1324.field1002 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "client!RGPDRBLW", name = "<init>", descriptor = "(IIIIIIIIIIBI)V")
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11) {
        this.field1324 = class37.field991[arg1];
        if (arg10 != 42) {
            this.field1311 = !this.field1311;
        }
        this.field1315 = arg4;
        this.field1316 = arg5;
        this.field1317 = arg11;
        this.field1318 = arg7;
        this.field1300 = arg0;
        this.field1301 = arg8;
        this.field1312 = arg2;
        this.field1313 = arg3;
        this.field1314 = arg9;
        this.field1319 = arg6;
        this.field1309 = false;
    }

    @OriginalMember(owner = "client!RGPDRBLW", name = "a", descriptor = "(IIIIB)V")
    public final void method460(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field1309) {
            double var6 = (double) (arg1 - this.field1316);
            double var8 = (double) (arg2 - this.field1317);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1321 = (double) this.field1313 * var6 / var10 + (double) this.field1316;
            this.field1322 = (double) this.field1313 * var8 / var10 + (double) this.field1317;
            this.field1323 = this.field1318;
        }
        double var12 = (double) (this.field1301 + 1 - arg3);
        if (arg4 != 48) {
            return;
        }
        this.field1305 = ((double) arg1 - this.field1321) / var12;
        this.field1306 = ((double) arg2 - this.field1322) / var12;
        this.field1307 = Math.sqrt(this.field1306 * this.field1306 + this.field1305 * this.field1305);
        if (!this.field1309) {
            this.field1308 = -this.field1307 * Math.tan((double) this.field1312 * 0.02454369D);
        }
        this.field1320 = ((double) arg0 - this.field1323 - this.field1308 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!RGPDRBLW", name = "a", descriptor = "(IB)V")
    public final void method461(int arg0, byte arg1) {
        this.field1309 = true;
        this.field1321 += (double) arg0 * this.field1305;
        this.field1322 += (double) arg0 * this.field1306;
        this.field1323 += this.field1320 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1308;
        this.field1308 += (double) arg0 * this.field1320;
        this.field1298 = (int) (Math.atan2(this.field1305, this.field1306) * 325.949D) + 1024 & 0x7FF;
        if (arg1 == 4) {
            boolean var3 = false;
        } else {
            this.field1310 = -22;
        }
        this.field1299 = (int) (Math.atan2(this.field1308, this.field1307) * 325.949D) & 0x7FF;
        if (this.field1324.field995 == null) {
            return;
        }
        this.field1303 += arg0;
        while (this.field1303 > this.field1324.field995.method342(this.field1302, this.field1304)) {
            this.field1303 -= this.field1324.field995.method342(this.field1302, this.field1304);
            this.field1302++;
            if (this.field1302 >= this.field1324.field995.field888) {
                this.field1302 = 0;
            }
        }
    }
}
