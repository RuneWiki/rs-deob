import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("RVCZOCZG")
public class class52 extends class63 {

    @OriginalMember(owner = "RVCZOCZG", name = "q", descriptor = "I")
    private int field1397 = -533;

    @OriginalMember(owner = "RVCZOCZG", name = "C", descriptor = "Z")
    public boolean field1409 = false;

    @OriginalMember(owner = "RVCZOCZG", name = "K", descriptor = "I")
    private int field1417 = 6;

    @OriginalMember(owner = "RVCZOCZG", name = "y", descriptor = "LFULHVSIU;")
    private class21 field1405;

    @OriginalMember(owner = "RVCZOCZG", name = "x", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "RVCZOCZG", name = "r", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "RVCZOCZG", name = "s", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "RVCZOCZG", name = "t", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "RVCZOCZG", name = "o", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "RVCZOCZG", name = "p", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "RVCZOCZG", name = "l", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "RVCZOCZG", name = "m", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "RVCZOCZG", name = "n", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "RVCZOCZG", name = "u", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "RVCZOCZG", name = "z", descriptor = "D")
    private double field1406;

    @OriginalMember(owner = "RVCZOCZG", name = "D", descriptor = "D")
    public double field1410;

    @OriginalMember(owner = "RVCZOCZG", name = "E", descriptor = "D")
    public double field1411;

    @OriginalMember(owner = "RVCZOCZG", name = "F", descriptor = "D")
    public double field1412;

    @OriginalMember(owner = "RVCZOCZG", name = "G", descriptor = "D")
    private double field1413;

    @OriginalMember(owner = "RVCZOCZG", name = "H", descriptor = "D")
    private double field1414;

    @OriginalMember(owner = "RVCZOCZG", name = "I", descriptor = "D")
    private double field1415;

    @OriginalMember(owner = "RVCZOCZG", name = "J", descriptor = "D")
    private double field1416;

    @OriginalMember(owner = "RVCZOCZG", name = "v", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "RVCZOCZG", name = "w", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "RVCZOCZG", name = "A", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "RVCZOCZG", name = "B", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "RVCZOCZG", name = "a", descriptor = "(IIIII)V")
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1409) {
            double var6 = (double) (arg0 - this.field1398);
            double var8 = (double) (arg1 - this.field1399);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1410 = (double) this.field1393 * var6 / var10 + (double) this.field1398;
            this.field1411 = (double) this.field1393 * var8 / var10 + (double) this.field1399;
            this.field1412 = this.field1400;
        }
        double var12 = (double) (this.field1396 + 1 - arg3);
        this.field1413 = ((double) arg0 - this.field1410) / var12;
        if (arg4 != -17407) {
            this.field1417 = -147;
        }
        this.field1414 = ((double) arg1 - this.field1411) / var12;
        this.field1415 = Math.sqrt(this.field1414 * this.field1414 + this.field1413 * this.field1413);
        if (!this.field1409) {
            this.field1416 = -this.field1415 * Math.tan((double) this.field1392 * 0.02454369D);
        }
        this.field1406 = ((double) arg2 - this.field1412 - this.field1416 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "RVCZOCZG", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1405 = class21.field703[arg5];
        this.field1404 = arg1;
        this.field1398 = arg2;
        this.field1399 = arg11;
        if (arg4 >= 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        this.field1400 = arg3;
        this.field1395 = arg0;
        this.field1396 = arg8;
        this.field1392 = arg7;
        this.field1393 = arg10;
        this.field1394 = arg9;
        this.field1401 = arg6;
        this.field1409 = false;
    }

    @OriginalMember(owner = "RVCZOCZG", name = "a", descriptor = "(II)V")
    public final void method459(int arg0, int arg1) {
        this.field1409 = true;
        this.field1410 += (double) arg0 * this.field1413;
        this.field1411 += (double) arg0 * this.field1414;
        if (arg1 != 0) {
            return;
        }
        this.field1412 += this.field1406 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1416;
        this.field1416 += (double) arg0 * this.field1406;
        this.field1407 = (int) (Math.atan2(this.field1413, this.field1414) * 325.949D) + 1024 & 0x7FF;
        this.field1408 = (int) (Math.atan2(this.field1416, this.field1415) * 325.949D) & 0x7FF;
        if (this.field1405.field707 == null) {
            return;
        }
        this.field1403 += arg0;
        while (this.field1403 > this.field1405.field707.method415(this.field1402, (byte) 6)) {
            this.field1403 -= this.field1405.field707.method415(this.field1402, (byte) 6) + 1;
            this.field1402++;
            if (this.field1402 >= this.field1405.field707.field1159) {
                this.field1402 = 0;
            }
        }
    }

    @OriginalMember(owner = "RVCZOCZG", name = "a", descriptor = "(I)LKPUOCBCE;")
    public final class35 method11(int arg0) {
        class35 var2 = this.field1405.method231();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (arg0 != 8) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (this.field1405.field707 != null) {
            var3 = this.field1405.field707.field1160[this.field1402];
        }
        class35 var5 = new class35(class71.method585(var3, 2), false, var2, true, 271);
        if (var3 != -1) {
            var5.method386(9);
            var5.method387(var3, -599);
            var5.field1042 = null;
            var5.field1041 = null;
        }
        if (this.field1405.field710 != 128 || this.field1405.field711 != 128) {
            var5.method395(-49478, this.field1405.field710, this.field1405.field711, this.field1405.field710);
        }
        var5.method391(this.field1397, this.field1408);
        var5.method396(this.field1405.field713 + 64, this.field1405.field714 + 850, -30, -50, -30, true);
        return var5;
    }
}
