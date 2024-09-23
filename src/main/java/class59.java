import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VGUAJUPX")
public class class59 extends class1 {

    @OriginalMember(owner = "VGUAJUPX", name = "x", descriptor = "I")
    private int field1400 = -723;

    @OriginalMember(owner = "VGUAJUPX", name = "E", descriptor = "Z")
    public boolean field1407 = false;

    @OriginalMember(owner = "VGUAJUPX", name = "J", descriptor = "Z")
    private boolean field1412 = false;

    @OriginalMember(owner = "VGUAJUPX", name = "p", descriptor = "LOQOGSGFM;")
    private class37 field1392;

    @OriginalMember(owner = "VGUAJUPX", name = "u", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "VGUAJUPX", name = "q", descriptor = "I")
    public int field1393;

    @OriginalMember(owner = "VGUAJUPX", name = "r", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "VGUAJUPX", name = "s", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "VGUAJUPX", name = "z", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "VGUAJUPX", name = "A", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "VGUAJUPX", name = "B", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "VGUAJUPX", name = "C", descriptor = "I")
    public int field1405;

    @OriginalMember(owner = "VGUAJUPX", name = "D", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "VGUAJUPX", name = "t", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "VGUAJUPX", name = "k", descriptor = "D")
    public double field1387;

    @OriginalMember(owner = "VGUAJUPX", name = "l", descriptor = "D")
    public double field1388;

    @OriginalMember(owner = "VGUAJUPX", name = "m", descriptor = "D")
    public double field1389;

    @OriginalMember(owner = "VGUAJUPX", name = "y", descriptor = "D")
    private double field1401;

    @OriginalMember(owner = "VGUAJUPX", name = "F", descriptor = "D")
    private double field1408;

    @OriginalMember(owner = "VGUAJUPX", name = "G", descriptor = "D")
    private double field1409;

    @OriginalMember(owner = "VGUAJUPX", name = "H", descriptor = "D")
    private double field1410;

    @OriginalMember(owner = "VGUAJUPX", name = "I", descriptor = "D")
    private double field1411;

    @OriginalMember(owner = "VGUAJUPX", name = "n", descriptor = "I")
    public int field1390;

    @OriginalMember(owner = "VGUAJUPX", name = "o", descriptor = "I")
    public int field1391;

    @OriginalMember(owner = "VGUAJUPX", name = "v", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "VGUAJUPX", name = "w", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "VGUAJUPX", name = "K", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "VGUAJUPX", name = "a", descriptor = "(IIIII)V")
    public final void method507(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1407) {
            double var6 = (double) (arg3 - this.field1393);
            double var8 = (double) (arg0 - this.field1394);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1387 = (double) this.field1405 * var6 / var10 + (double) this.field1393;
            this.field1388 = (double) this.field1405 * var8 / var10 + (double) this.field1394;
            this.field1389 = this.field1395;
        }
        double var12 = (double) (this.field1403 + 1 - arg4);
        this.field1408 = ((double) arg3 - this.field1387) / var12;
        this.field1409 = ((double) arg0 - this.field1388) / var12;
        int var14 = 27 / arg1;
        this.field1410 = Math.sqrt(this.field1409 * this.field1409 + this.field1408 * this.field1408);
        if (!this.field1407) {
            this.field1411 = -this.field1410 * Math.tan((double) this.field1404 * 0.02454369D);
        }
        this.field1401 = ((double) arg2 - this.field1389 - this.field1411 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "VGUAJUPX", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg9 >= 0) {
            throw new NullPointerException();
        }
        this.field1392 = class37.field970[arg4];
        this.field1397 = arg1;
        this.field1393 = arg7;
        this.field1394 = arg11;
        this.field1395 = arg10;
        this.field1402 = arg8;
        this.field1403 = arg3;
        this.field1404 = arg6;
        this.field1405 = arg5;
        this.field1406 = arg0;
        this.field1396 = arg2;
        this.field1407 = false;
    }

    @OriginalMember(owner = "VGUAJUPX", name = "a", descriptor = "(II)V")
    public final void method508(int arg0, int arg1) {
        this.field1407 = true;
        this.field1387 += (double) arg0 * this.field1408;
        this.field1388 += (double) arg0 * this.field1409;
        this.field1389 += this.field1401 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1411;
        this.field1411 += (double) arg0 * this.field1401;
        this.field1390 = (int) (Math.atan2(this.field1408, this.field1409) * 325.949D) + 1024 & 0x7FF;
        int var3 = 18 / arg1;
        this.field1391 = (int) (Math.atan2(this.field1411, this.field1410) * 325.949D) & 0x7FF;
        if (this.field1392.field974 == null) {
            return;
        }
        this.field1399 += arg0;
        while (this.field1399 > this.field1392.field974.method251(this.field1400, this.field1398)) {
            this.field1399 -= this.field1392.field974.method251(this.field1400, this.field1398) + 1;
            this.field1398++;
            if (this.field1398 >= this.field1392.field974.field762) {
                this.field1398 = 0;
            }
        }
    }

    @OriginalMember(owner = "VGUAJUPX", name = "a", descriptor = "(Z)LYYHPBDED;")
    public final class70 method2(boolean arg0) {
        class70 var2 = this.field1392.method366();
        if (!arg0) {
            this.field1412 = !this.field1412;
        }
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1392.field974 != null) {
            var3 = this.field1392.field974.field763[this.field1398];
        }
        class70 var4 = new class70(false, var2, (byte) -15, true, class60.method513(3, var3));
        if (var3 != -1) {
            var4.method558(895);
            var4.method559(var3, -682);
            var4.field1603 = null;
            var4.field1602 = null;
        }
        if (this.field1392.field977 != 128 || this.field1392.field978 != 128) {
            var4.method567(this.field1413, this.field1392.field978, this.field1392.field977, this.field1392.field977);
        }
        var4.method563(this.field1391, (byte) -3);
        var4.method568(this.field1392.field980 + 64, this.field1392.field981 + 850, -30, -50, -30, true);
        return var4;
    }
}
