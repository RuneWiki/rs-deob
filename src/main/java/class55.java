import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("QPFVLDSR")
public class class55 extends class12 {

    @OriginalMember(owner = "QPFVLDSR", name = "v", descriptor = "Z")
    public boolean field1396 = false;

    @OriginalMember(owner = "QPFVLDSR", name = "w", descriptor = "Z")
    private boolean field1397 = true;

    @OriginalMember(owner = "QPFVLDSR", name = "G", descriptor = "LBRGDZOWQ;")
    private class4 field1407;

    @OriginalMember(owner = "QPFVLDSR", name = "H", descriptor = "I")
    public int field1408;

    @OriginalMember(owner = "QPFVLDSR", name = "I", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "QPFVLDSR", name = "J", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "QPFVLDSR", name = "K", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "QPFVLDSR", name = "t", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "QPFVLDSR", name = "u", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "QPFVLDSR", name = "n", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "QPFVLDSR", name = "o", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "QPFVLDSR", name = "p", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "QPFVLDSR", name = "L", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "QPFVLDSR", name = "s", descriptor = "D")
    private double field1393;

    @OriginalMember(owner = "QPFVLDSR", name = "x", descriptor = "D")
    public double field1398;

    @OriginalMember(owner = "QPFVLDSR", name = "y", descriptor = "D")
    public double field1399;

    @OriginalMember(owner = "QPFVLDSR", name = "z", descriptor = "D")
    public double field1400;

    @OriginalMember(owner = "QPFVLDSR", name = "A", descriptor = "D")
    private double field1401;

    @OriginalMember(owner = "QPFVLDSR", name = "B", descriptor = "D")
    private double field1402;

    @OriginalMember(owner = "QPFVLDSR", name = "C", descriptor = "D")
    private double field1403;

    @OriginalMember(owner = "QPFVLDSR", name = "D", descriptor = "D")
    private double field1404;

    @OriginalMember(owner = "QPFVLDSR", name = "q", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "QPFVLDSR", name = "r", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "QPFVLDSR", name = "E", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "QPFVLDSR", name = "F", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "QPFVLDSR", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1407 = class4.field15[arg0];
        this.field1408 = arg8;
        this.field1409 = arg1;
        this.field1410 = arg3;
        this.field1411 = arg2;
        this.field1394 = arg11;
        this.field1395 = arg9;
        while (arg4 >= 0) {
            this.field1397 = !this.field1397;
        }
        this.field1388 = arg7;
        this.field1389 = arg10;
        this.field1390 = arg5;
        this.field1412 = arg6;
        this.field1396 = false;
    }

    @OriginalMember(owner = "QPFVLDSR", name = "a", descriptor = "(I)LLFTMDGKK;")
    public final class37 method1(int arg0) {
        class37 var2 = this.field1407.method11();
        if (arg0 != 0) {
            throw new NullPointerException();
        } else if (var2 == null) {
            return null;
        } else {
            int var3 = -1;
            if (this.field1407.field19 != null) {
                var3 = this.field1407.field19.field818[this.field1405];
            }
            class37 var4 = new class37(class7.method17(var3, false), true, var2, false, false);
            if (var3 != -1) {
                var4.method348(false);
                var4.method349(var3, (byte) 89);
                var4.field999 = null;
                var4.field998 = null;
            }
            if (this.field1407.field22 != 128 || this.field1407.field23 != 128) {
                var4.method357(5, this.field1407.field23, this.field1407.field22, this.field1407.field22);
            }
            var4.method353(0, this.field1392);
            var4.method358(this.field1407.field25 + 64, this.field1407.field26 + 850, -30, -50, -30, true);
            return var4;
        }
    }

    @OriginalMember(owner = "QPFVLDSR", name = "a", descriptor = "(ZI)V")
    public final void method489(boolean arg0, int arg1) {
        this.field1396 = true;
        this.field1398 += (double) arg1 * this.field1401;
        this.field1399 += (double) arg1 * this.field1402;
        if (!arg0) {
            return;
        }
        this.field1400 += this.field1393 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1404;
        this.field1404 += (double) arg1 * this.field1393;
        this.field1391 = (int) (Math.atan2(this.field1401, this.field1402) * 325.949D) + 1024 & 0x7FF;
        this.field1392 = (int) (Math.atan2(this.field1404, this.field1403) * 325.949D) & 0x7FF;
        if (this.field1407.field19 == null) {
            return;
        }
        this.field1406 += arg1;
        while (this.field1406 > this.field1407.field19.method322((byte) 5, this.field1405)) {
            this.field1406 -= this.field1407.field19.method322((byte) 5, this.field1405) + 1;
            this.field1405++;
            if (this.field1405 >= this.field1407.field19.field817) {
                this.field1405 = 0;
            }
        }
    }

    @OriginalMember(owner = "QPFVLDSR", name = "a", descriptor = "(IIIBI)V")
    public final void method490(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (!this.field1396) {
            double var6 = (double) (arg1 - this.field1409);
            double var8 = (double) (arg0 - this.field1410);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1398 = (double) this.field1389 * var6 / var10 + (double) this.field1409;
            this.field1399 = (double) this.field1389 * var8 / var10 + (double) this.field1410;
            this.field1400 = this.field1411;
        }
        double var12 = (double) (this.field1395 + 1 - arg2);
        if (arg3 != 9) {
            return;
        }
        boolean var14 = false;
        this.field1401 = ((double) arg1 - this.field1398) / var12;
        this.field1402 = ((double) arg0 - this.field1399) / var12;
        this.field1403 = Math.sqrt(this.field1402 * this.field1402 + this.field1401 * this.field1401);
        if (!this.field1396) {
            this.field1404 = -this.field1403 * Math.tan((double) this.field1388 * 0.02454369D);
        }
        this.field1393 = ((double) arg4 - this.field1400 - this.field1404 * var12) * 2.0D / (var12 * var12);
    }
}
