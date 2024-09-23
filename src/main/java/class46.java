import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QJBDGANU")
public class class46 extends class57 {

    @OriginalMember(owner = "QJBDGANU", name = "u", descriptor = "Z")
    private boolean field1366 = true;

    @OriginalMember(owner = "QJBDGANU", name = "v", descriptor = "Z")
    public boolean field1367 = false;

    @OriginalMember(owner = "QJBDGANU", name = "B", descriptor = "I")
    private int field1373 = 40410;

    @OriginalMember(owner = "QJBDGANU", name = "F", descriptor = "I")
    private int field1377 = 559;

    @OriginalMember(owner = "QJBDGANU", name = "t", descriptor = "LBUIWQSXJ;")
    private class6 field1365;

    @OriginalMember(owner = "QJBDGANU", name = "O", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "QJBDGANU", name = "w", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "QJBDGANU", name = "x", descriptor = "I")
    public int field1369;

    @OriginalMember(owner = "QJBDGANU", name = "y", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "QJBDGANU", name = "G", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "QJBDGANU", name = "H", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "QJBDGANU", name = "C", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "QJBDGANU", name = "D", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "QJBDGANU", name = "E", descriptor = "I")
    public int field1376;

    @OriginalMember(owner = "QJBDGANU", name = "z", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "QJBDGANU", name = "r", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "QJBDGANU", name = "m", descriptor = "D")
    public double field1359;

    @OriginalMember(owner = "QJBDGANU", name = "n", descriptor = "D")
    public double field1360;

    @OriginalMember(owner = "QJBDGANU", name = "o", descriptor = "D")
    public double field1361;

    @OriginalMember(owner = "QJBDGANU", name = "A", descriptor = "D")
    private double field1372;

    @OriginalMember(owner = "QJBDGANU", name = "I", descriptor = "D")
    private double field1380;

    @OriginalMember(owner = "QJBDGANU", name = "J", descriptor = "D")
    private double field1381;

    @OriginalMember(owner = "QJBDGANU", name = "K", descriptor = "D")
    private double field1382;

    @OriginalMember(owner = "QJBDGANU", name = "L", descriptor = "D")
    private double field1383;

    @OriginalMember(owner = "QJBDGANU", name = "p", descriptor = "I")
    private int field1362;

    @OriginalMember(owner = "QJBDGANU", name = "q", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "QJBDGANU", name = "M", descriptor = "I")
    public int field1384;

    @OriginalMember(owner = "QJBDGANU", name = "N", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "QJBDGANU", name = "<init>", descriptor = "(IIIIBIIIIIII)V")
    public class46(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1365 = class6.field49[arg5];
        this.field1386 = arg3;
        this.field1368 = arg6;
        this.field1369 = arg9;
        this.field1370 = arg0;
        this.field1378 = arg2;
        this.field1379 = arg1;
        this.field1374 = arg7;
        this.field1375 = arg8;
        this.field1376 = arg11;
        this.field1371 = arg10;
        if (arg4 != -115) {
            this.field1364 = 117;
        }
        this.field1367 = false;
    }

    @OriginalMember(owner = "QJBDGANU", name = "a", descriptor = "(Z)LPOJFANDE;")
    public final class43 method54(boolean arg0) {
        class43 var2 = this.field1365.method62();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1365.field53 != null) {
            var3 = this.field1365.field53.field1016[this.field1362];
        }
        class43 var4 = new class43(class21.method287(var3, -13619), true, false, -785, var2);
        if (!arg0) {
            this.field1366 = !this.field1366;
        }
        if (var3 != -1) {
            var4.method467(0);
            var4.method468(var3, 19066);
            var4.field1310 = null;
            var4.field1309 = null;
        }
        if (this.field1365.field56 != 128 || this.field1365.field57 != 128) {
            var4.method476(this.field1365.field57, true, this.field1365.field56, this.field1365.field56);
        }
        var4.method472(this.field1385, 80);
        var4.method477(this.field1365.field59 + 64, this.field1365.field60 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "QJBDGANU", name = "a", descriptor = "(ZI)V")
    public final void method489(boolean arg0, int arg1) {
        this.field1367 = true;
        this.field1359 += (double) arg1 * this.field1380;
        this.field1360 += (double) arg1 * this.field1381;
        this.field1361 += this.field1372 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1383;
        this.field1383 += (double) arg1 * this.field1372;
        this.field1384 = (int) (Math.atan2(this.field1380, this.field1381) * 325.949D) + 1024 & 0x7FF;
        this.field1385 = (int) (Math.atan2(this.field1383, this.field1382) * 325.949D) & 0x7FF;
        if (!arg0) {
            this.field1364 = 430;
        }
        if (this.field1365.field53 == null) {
            return;
        }
        this.field1363 += arg1;
        while (this.field1363 > this.field1365.field53.method364(this.field1373, this.field1362)) {
            this.field1363 -= this.field1365.field53.method364(this.field1373, this.field1362) + 1;
            this.field1362++;
            if (this.field1362 >= this.field1365.field53.field1015) {
                this.field1362 = 0;
            }
        }
    }

    @OriginalMember(owner = "QJBDGANU", name = "a", descriptor = "(IIBII)V")
    public final void method490(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (!this.field1367) {
            double var6 = (double) (arg4 - this.field1368);
            double var8 = (double) (arg1 - this.field1369);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1359 = (double) this.field1375 * var6 / var10 + (double) this.field1368;
            this.field1360 = (double) this.field1375 * var8 / var10 + (double) this.field1369;
            this.field1361 = this.field1370;
        }
        double var12 = (double) (this.field1379 + 1 - arg0);
        this.field1380 = ((double) arg4 - this.field1359) / var12;
        if (arg2 != -41) {
            this.field1377 = -385;
        }
        this.field1381 = ((double) arg1 - this.field1360) / var12;
        this.field1382 = Math.sqrt(this.field1381 * this.field1381 + this.field1380 * this.field1380);
        if (!this.field1367) {
            this.field1383 = -this.field1382 * Math.tan((double) this.field1374 * 0.02454369D);
        }
        this.field1372 = ((double) arg3 - this.field1361 - this.field1383 * var12) * 2.0D / (var12 * var12);
    }
}
