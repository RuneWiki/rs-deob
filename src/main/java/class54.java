import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TCHKSJJL")
public class class54 extends class3 {

    @OriginalMember(owner = "client!TCHKSJJL", name = "w", descriptor = "Z")
    public boolean field1412 = false;

    @OriginalMember(owner = "client!TCHKSJJL", name = "D", descriptor = "I")
    private int field1419 = 17935;

    @OriginalMember(owner = "client!TCHKSJJL", name = "I", descriptor = "Z")
    private boolean field1424 = true;

    @OriginalMember(owner = "client!TCHKSJJL", name = "C", descriptor = "LJEPDVFCL;")
    private class29 field1418;

    @OriginalMember(owner = "client!TCHKSJJL", name = "p", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "client!TCHKSJJL", name = "E", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!TCHKSJJL", name = "F", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!TCHKSJJL", name = "G", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!TCHKSJJL", name = "K", descriptor = "I")
    public int field1426;

    @OriginalMember(owner = "client!TCHKSJJL", name = "L", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!TCHKSJJL", name = "m", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!TCHKSJJL", name = "n", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!TCHKSJJL", name = "o", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!TCHKSJJL", name = "H", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!TCHKSJJL", name = "s", descriptor = "D")
    private double field1408;

    @OriginalMember(owner = "client!TCHKSJJL", name = "t", descriptor = "D")
    private double field1409;

    @OriginalMember(owner = "client!TCHKSJJL", name = "u", descriptor = "D")
    private double field1410;

    @OriginalMember(owner = "client!TCHKSJJL", name = "v", descriptor = "D")
    private double field1411;

    @OriginalMember(owner = "client!TCHKSJJL", name = "x", descriptor = "D")
    public double field1413;

    @OriginalMember(owner = "client!TCHKSJJL", name = "y", descriptor = "D")
    public double field1414;

    @OriginalMember(owner = "client!TCHKSJJL", name = "z", descriptor = "D")
    public double field1415;

    @OriginalMember(owner = "client!TCHKSJJL", name = "J", descriptor = "D")
    private double field1425;

    @OriginalMember(owner = "client!TCHKSJJL", name = "q", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!TCHKSJJL", name = "r", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!TCHKSJJL", name = "A", descriptor = "I")
    public int field1416;

    @OriginalMember(owner = "client!TCHKSJJL", name = "B", descriptor = "I")
    public int field1417;

    @OriginalMember(owner = "client!TCHKSJJL", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1418 = class29.field932[arg3];
        this.field1405 = arg1;
        this.field1420 = arg6;
        this.field1421 = arg4;
        this.field1422 = arg0;
        this.field1426 = arg11;
        this.field1427 = arg2;
        this.field1402 = arg8;
        this.field1403 = arg5;
        this.field1404 = arg10;
        this.field1423 = arg9;
        this.field1412 = false;
        if (arg7 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!TCHKSJJL", name = "a", descriptor = "(IIIII)V")
    public final void method499(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (!this.field1412) {
            double var7 = (double) (arg0 - this.field1420);
            double var9 = (double) (arg1 - this.field1421);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field1413 = (double) this.field1403 * var7 / var11 + (double) this.field1420;
            this.field1414 = (double) this.field1403 * var9 / var11 + (double) this.field1421;
            this.field1415 = this.field1422;
        }
        double var13 = (double) (this.field1427 + 1 - arg4);
        this.field1408 = ((double) arg0 - this.field1413) / var13;
        this.field1409 = ((double) arg1 - this.field1414) / var13;
        this.field1410 = Math.sqrt(this.field1409 * this.field1409 + this.field1408 * this.field1408);
        if (!this.field1412) {
            this.field1411 = -this.field1410 * Math.tan((double) this.field1402 * 0.02454369D);
        }
        this.field1425 = ((double) arg3 - this.field1415 - this.field1411 * var13) * 2.0D / (var13 * var13);
    }

    @OriginalMember(owner = "client!TCHKSJJL", name = "a", descriptor = "(IB)V")
    public final void method500(int arg0, byte arg1) {
        this.field1412 = true;
        this.field1413 += (double) arg0 * this.field1408;
        if (arg1 != 9) {
            this.field1419 = -194;
        }
        this.field1414 += (double) arg0 * this.field1409;
        this.field1415 += this.field1425 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1411;
        this.field1411 += (double) arg0 * this.field1425;
        this.field1416 = (int) (Math.atan2(this.field1408, this.field1409) * 325.949D) + 1024 & 0x7FF;
        this.field1417 = (int) (Math.atan2(this.field1411, this.field1410) * 325.949D) & 0x7FF;
        if (this.field1418.field936 == null) {
            return;
        }
        this.field1407 += arg0;
        while (this.field1407 > this.field1418.field936.method583(this.field1406, (byte) 9)) {
            this.field1407 -= this.field1418.field936.method583(this.field1406, (byte) 9) + 1;
            this.field1406++;
            if (this.field1406 >= this.field1418.field936.field1667) {
                this.field1406 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!TCHKSJJL", name = "a", descriptor = "(Z)LGCSAWSJV;")
    public final class16 method8(boolean arg0) {
        class16 var2 = this.field1418.method332();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1418.field936 != null) {
            var3 = this.field1418.field936.field1668[this.field1406];
        }
        class16 var4 = new class16(0, var2, true, class48.method436(this.field1424, var3), false);
        if (var3 != -1) {
            var4.method267(-12404);
            var4.method268((byte) 81, var3);
            var4.field746 = null;
            var4.field745 = null;
        }
        if (this.field1418.field939 != 128 || this.field1418.field940 != 128) {
            var4.method276(this.field1418.field939, this.field1418.field939, this.field1418.field940, (byte) -79);
        }
        var4.method272(this.field1417, -901);
        var4.method277(this.field1418.field942 + 64, this.field1418.field943 + 850, -30, -50, -30, true);
        if (arg0) {
            throw new NullPointerException();
        }
        return var4;
    }
}
