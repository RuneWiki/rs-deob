import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AAKFEJZP")
public class class1 extends class21 {

    @OriginalMember(owner = "client!AAKFEJZP", name = "z", descriptor = "I")
    private int field16 = 7;

    @OriginalMember(owner = "client!AAKFEJZP", name = "D", descriptor = "Z")
    public boolean field20 = false;

    @OriginalMember(owner = "client!AAKFEJZP", name = "J", descriptor = "Z")
    private boolean field26 = false;

    @OriginalMember(owner = "client!AAKFEJZP", name = "t", descriptor = "LRTDMFIDA;")
    private class50 field10;

    @OriginalMember(owner = "client!AAKFEJZP", name = "k", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "client!AAKFEJZP", name = "n", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "client!AAKFEJZP", name = "o", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!AAKFEJZP", name = "p", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!AAKFEJZP", name = "r", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!AAKFEJZP", name = "s", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!AAKFEJZP", name = "A", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!AAKFEJZP", name = "B", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!AAKFEJZP", name = "C", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!AAKFEJZP", name = "q", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!AAKFEJZP", name = "u", descriptor = "D")
    public double field11;

    @OriginalMember(owner = "client!AAKFEJZP", name = "v", descriptor = "D")
    public double field12;

    @OriginalMember(owner = "client!AAKFEJZP", name = "w", descriptor = "D")
    public double field13;

    @OriginalMember(owner = "client!AAKFEJZP", name = "E", descriptor = "D")
    private double field21;

    @OriginalMember(owner = "client!AAKFEJZP", name = "F", descriptor = "D")
    private double field22;

    @OriginalMember(owner = "client!AAKFEJZP", name = "G", descriptor = "D")
    private double field23;

    @OriginalMember(owner = "client!AAKFEJZP", name = "H", descriptor = "D")
    private double field24;

    @OriginalMember(owner = "client!AAKFEJZP", name = "I", descriptor = "D")
    private double field25;

    @OriginalMember(owner = "client!AAKFEJZP", name = "x", descriptor = "I")
    private int field14;

    @OriginalMember(owner = "client!AAKFEJZP", name = "y", descriptor = "I")
    private int field15;

    @OriginalMember(owner = "client!AAKFEJZP", name = "l", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!AAKFEJZP", name = "m", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!AAKFEJZP", name = "a", descriptor = "(ZI)V")
    public final void method1(boolean arg0, int arg1) {
        this.field20 = true;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field11 += (double) arg1 * this.field22;
        this.field12 += (double) arg1 * this.field23;
        this.field13 += this.field21 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field25;
        this.field25 += (double) arg1 * this.field21;
        this.field2 = (int) (Math.atan2(this.field22, this.field23) * 325.949D) + 1024 & 0x7FF;
        this.field3 = (int) (Math.atan2(this.field25, this.field24) * 325.949D) & 0x7FF;
        if (this.field10.field1358 == null) {
            return;
        }
        this.field15 += arg1;
        while (this.field15 > this.field10.field1358.method320(this.field14, (byte) 0)) {
            this.field15 -= this.field10.field1358.method320(this.field14, (byte) 0) + 1;
            this.field14++;
            if (this.field14 >= this.field10.field1358.field922) {
                this.field14 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!AAKFEJZP", name = "a", descriptor = "(Z)LIYSWJGDE;")
    public final class19 method2(boolean arg0) {
        if (!arg0) {
            this.field26 = !this.field26;
        }
        class19 var2 = this.field10.method448();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field10.field1358 != null) {
            var3 = this.field10.field1358.field923[this.field14];
        }
        class19 var4 = new class19(class45.method406(61, var3), var2, 946, true, false);
        if (var3 != -1) {
            var4.method280(true);
            var4.method281(true, var3);
            var4.field842 = null;
            var4.field841 = null;
        }
        if (this.field10.field1361 != 128 || this.field10.field1362 != 128) {
            var4.method289(this.field10.field1361, 471, this.field10.field1361, this.field10.field1362);
        }
        var4.method285(0, this.field3);
        var4.method290(this.field10.field1364 + 64, this.field10.field1365 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "client!AAKFEJZP", name = "<init>", descriptor = "(IIIIIIIBIIII)V")
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field10 = class50.field1354[arg8];
        this.field1 = arg2;
        this.field4 = arg3;
        this.field5 = arg9;
        this.field6 = arg1;
        this.field8 = arg0;
        this.field9 = arg11;
        this.field17 = arg10;
        this.field18 = arg4;
        this.field19 = arg5;
        this.field7 = arg6;
        if (arg7 != -108) {
            throw new NullPointerException();
        }
        this.field20 = false;
    }

    @OriginalMember(owner = "client!AAKFEJZP", name = "a", descriptor = "(IIIZI)V")
    public final void method3(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            this.field16 = -420;
        }
        if (!this.field20) {
            double var6 = (double) (arg0 - this.field4);
            double var8 = (double) (arg1 - this.field5);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field11 = (double) this.field18 * var6 / var10 + (double) this.field4;
            this.field12 = (double) this.field18 * var8 / var10 + (double) this.field5;
            this.field13 = this.field6;
        }
        double var12 = (double) (this.field9 + 1 - arg4);
        this.field22 = ((double) arg0 - this.field11) / var12;
        this.field23 = ((double) arg1 - this.field12) / var12;
        this.field24 = Math.sqrt(this.field23 * this.field23 + this.field22 * this.field22);
        if (!this.field20) {
            this.field25 = -this.field24 * Math.tan((double) this.field17 * 0.02454369D);
        }
        this.field21 = ((double) arg2 - this.field13 - this.field25 * var12) * 2.0D / (var12 * var12);
    }
}
