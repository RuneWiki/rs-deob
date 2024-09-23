import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("KJLDUSCX")
public class class28 extends class66 {

    @OriginalMember(owner = "KJLDUSCX", name = "n", descriptor = "Z")
    public boolean field930 = false;

    @OriginalMember(owner = "KJLDUSCX", name = "B", descriptor = "Z")
    private boolean field944 = false;

    @OriginalMember(owner = "KJLDUSCX", name = "x", descriptor = "LNGIGHQOG;")
    private class37 field940;

    @OriginalMember(owner = "KJLDUSCX", name = "w", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "KJLDUSCX", name = "C", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "KJLDUSCX", name = "D", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "KJLDUSCX", name = "E", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "KJLDUSCX", name = "l", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "KJLDUSCX", name = "m", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "KJLDUSCX", name = "y", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "KJLDUSCX", name = "z", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "KJLDUSCX", name = "A", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "KJLDUSCX", name = "F", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "KJLDUSCX", name = "o", descriptor = "D")
    private double field931;

    @OriginalMember(owner = "KJLDUSCX", name = "p", descriptor = "D")
    private double field932;

    @OriginalMember(owner = "KJLDUSCX", name = "q", descriptor = "D")
    private double field933;

    @OriginalMember(owner = "KJLDUSCX", name = "r", descriptor = "D")
    private double field934;

    @OriginalMember(owner = "KJLDUSCX", name = "s", descriptor = "D")
    public double field935;

    @OriginalMember(owner = "KJLDUSCX", name = "t", descriptor = "D")
    public double field936;

    @OriginalMember(owner = "KJLDUSCX", name = "u", descriptor = "D")
    public double field937;

    @OriginalMember(owner = "KJLDUSCX", name = "v", descriptor = "D")
    private double field938;

    @OriginalMember(owner = "KJLDUSCX", name = "G", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "KJLDUSCX", name = "H", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "KJLDUSCX", name = "I", descriptor = "I")
    private int field951;

    @OriginalMember(owner = "KJLDUSCX", name = "J", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "KJLDUSCX", name = "a", descriptor = "(ZI)V")
    public final void method302(boolean arg0, int arg1) {
        this.field930 = true;
        this.field935 += (double) arg1 * this.field931;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field936 += (double) arg1 * this.field932;
        this.field937 += this.field938 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field934;
        this.field934 += (double) arg1 * this.field938;
        this.field949 = (int) (Math.atan2(this.field931, this.field932) * 325.949D) + 1024 & 0x7FF;
        this.field950 = (int) (Math.atan2(this.field934, this.field933) * 325.949D) & 0x7FF;
        if (this.field940.field1141 == null) {
            return;
        }
        this.field952 += arg1;
        while (this.field952 > this.field940.field1141.method598(this.field951, -818)) {
            this.field952 -= this.field940.field1141.method598(this.field951, -818) + 1;
            this.field951++;
            if (this.field951 >= this.field940.field1141.field1728) {
                this.field951 = 0;
            }
        }
    }

    @OriginalMember(owner = "KJLDUSCX", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class28(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field940 = class37.field1137[arg10];
        this.field939 = arg5;
        this.field945 = arg8;
        this.field946 = arg3;
        this.field947 = arg9;
        this.field928 = arg0;
        int var13 = 93 / arg11;
        this.field929 = arg7;
        this.field941 = arg6;
        this.field942 = arg4;
        this.field943 = arg2;
        this.field948 = arg1;
        this.field930 = false;
    }

    @OriginalMember(owner = "KJLDUSCX", name = "a", descriptor = "(B)LSNMMQNPZ;")
    public final class55 method175(byte arg0) {
        if (arg0 != 5) {
            this.field944 = !this.field944;
        }
        class55 var2 = this.field940.method351();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field940.field1141 != null) {
            var3 = this.field940.field1141.field1729[this.field951];
        }
        class55 var4 = new class55(var2, 707, false, true, class39.method356((byte) 68, var3));
        if (var3 != -1) {
            var4.method425(false);
            var4.method426(var3, (byte) 1);
            var4.field1370 = null;
            var4.field1369 = null;
        }
        if (this.field940.field1144 != 128 || this.field940.field1145 != 128) {
            var4.method434(2985, this.field940.field1144, this.field940.field1144, this.field940.field1145);
        }
        var4.method430(this.field950, 132);
        var4.method435(this.field940.field1147 + 64, this.field940.field1148 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "KJLDUSCX", name = "a", descriptor = "(IIIII)V")
    public final void method303(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field930) {
            double var6 = (double) (arg2 - this.field945);
            double var8 = (double) (arg4 - this.field946);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field935 = (double) this.field942 * var6 / var10 + (double) this.field945;
            this.field936 = (double) this.field942 * var8 / var10 + (double) this.field946;
            this.field937 = this.field947;
        }
        double var12 = (double) (this.field929 + 1 - arg0);
        this.field931 = ((double) arg2 - this.field935) / var12;
        this.field932 = ((double) arg4 - this.field936) / var12;
        this.field933 = Math.sqrt(this.field932 * this.field932 + this.field931 * this.field931);
        if (!this.field930) {
            this.field934 = -this.field933 * Math.tan((double) this.field941 * 0.02454369D);
        }
        this.field938 = ((double) arg3 - this.field937 - this.field934 * var12) * 2.0D / (var12 * var12);
        if (arg1 >= 0) {
            ;
        }
    }
}
