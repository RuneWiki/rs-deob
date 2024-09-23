import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IJDLXEFP")
public class class26 extends class62 {

    @OriginalMember(owner = "IJDLXEFP", name = "p", descriptor = "I")
    private int field898 = -551;

    @OriginalMember(owner = "IJDLXEFP", name = "y", descriptor = "Z")
    public boolean field907 = false;

    @OriginalMember(owner = "IJDLXEFP", name = "J", descriptor = "LHTWOTIWO;")
    private class23 field918;

    @OriginalMember(owner = "IJDLXEFP", name = "I", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "IJDLXEFP", name = "l", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "IJDLXEFP", name = "m", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "IJDLXEFP", name = "n", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "IJDLXEFP", name = "D", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "IJDLXEFP", name = "E", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "IJDLXEFP", name = "F", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "IJDLXEFP", name = "G", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "IJDLXEFP", name = "H", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "IJDLXEFP", name = "o", descriptor = "I")
    public int field897;

    @OriginalMember(owner = "IJDLXEFP", name = "q", descriptor = "D")
    private double field899;

    @OriginalMember(owner = "IJDLXEFP", name = "r", descriptor = "D")
    private double field900;

    @OriginalMember(owner = "IJDLXEFP", name = "s", descriptor = "D")
    private double field901;

    @OriginalMember(owner = "IJDLXEFP", name = "t", descriptor = "D")
    private double field902;

    @OriginalMember(owner = "IJDLXEFP", name = "u", descriptor = "D")
    private double field903;

    @OriginalMember(owner = "IJDLXEFP", name = "v", descriptor = "D")
    public double field904;

    @OriginalMember(owner = "IJDLXEFP", name = "w", descriptor = "D")
    public double field905;

    @OriginalMember(owner = "IJDLXEFP", name = "x", descriptor = "D")
    public double field906;

    @OriginalMember(owner = "IJDLXEFP", name = "z", descriptor = "I")
    public int field908;

    @OriginalMember(owner = "IJDLXEFP", name = "A", descriptor = "I")
    public int field909;

    @OriginalMember(owner = "IJDLXEFP", name = "B", descriptor = "I")
    private int field910;

    @OriginalMember(owner = "IJDLXEFP", name = "C", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "IJDLXEFP", name = "a", descriptor = "(I)LPSGMMDJS;")
    public final class45 method196(int arg0) {
        class45 var2 = this.field918.method251();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field918.field870 != null) {
            var3 = this.field918.field870.field658[this.field910];
        }
        class45 var4 = new class45(var2, -42752, class3.method5((byte) 2, var3), true, false);
        if (arg0 != 27243) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (var3 != -1) {
            var4.method417(true);
            var4.method418(0, var3);
            var4.field1182 = null;
            var4.field1181 = null;
        }
        if (this.field918.field873 != 128 || this.field918.field874 != 128) {
            var4.method426(this.field918.field874, this.field918.field873, this.field918.field873, 34836);
        }
        var4.method422(this.field909, (byte) -67);
        var4.method427(this.field918.field876 + 64, this.field918.field877 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "IJDLXEFP", name = "<init>", descriptor = "(IIIIIIIIZIII)V")
    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        this.field918 = class23.field866[arg7];
        this.field917 = arg9;
        this.field894 = arg4;
        this.field895 = arg0;
        this.field896 = arg3;
        if (!arg8) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        this.field912 = arg6;
        this.field913 = arg11;
        this.field914 = arg1;
        this.field915 = arg5;
        this.field916 = arg10;
        this.field897 = arg2;
        this.field907 = false;
    }

    @OriginalMember(owner = "IJDLXEFP", name = "a", descriptor = "(II)V")
    public final void method252(int arg0, int arg1) {
        this.field907 = true;
        this.field904 += (double) arg0 * this.field900;
        this.field905 += (double) arg0 * this.field901;
        this.field906 += this.field899 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field903;
        this.field903 += (double) arg0 * this.field899;
        this.field908 = (int) (Math.atan2(this.field900, this.field901) * 325.949D) + 1024 & 0x7FF;
        this.field909 = (int) (Math.atan2(this.field903, this.field902) * 325.949D) & 0x7FF;
        while (arg1 >= 0) {
            this.field898 = 158;
        }
        if (this.field918.field870 == null) {
            return;
        }
        this.field911 += arg0;
        while (this.field911 > this.field918.field870.method215(this.field910, 0)) {
            this.field911 -= this.field918.field870.method215(this.field910, 0) + 1;
            this.field910++;
            if (this.field910 >= this.field918.field870.field657) {
                this.field910 = 0;
            }
        }
    }

    @OriginalMember(owner = "IJDLXEFP", name = "a", descriptor = "(IBIII)V")
    public final void method253(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -51) {
            return;
        }
        if (!this.field907) {
            double var6 = (double) (arg0 - this.field894);
            double var8 = (double) (arg2 - this.field895);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field904 = (double) this.field915 * var6 / var10 + (double) this.field894;
            this.field905 = (double) this.field915 * var8 / var10 + (double) this.field895;
            this.field906 = this.field896;
        }
        double var12 = (double) (this.field913 + 1 - arg3);
        this.field900 = ((double) arg0 - this.field904) / var12;
        this.field901 = ((double) arg2 - this.field905) / var12;
        this.field902 = Math.sqrt(this.field901 * this.field901 + this.field900 * this.field900);
        if (!this.field907) {
            this.field903 = -this.field902 * Math.tan((double) this.field914 * 0.02454369D);
        }
        this.field899 = ((double) arg4 - this.field906 - this.field903 * var12) * 2.0D / (var12 * var12);
    }
}
