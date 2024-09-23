import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IRBOJPFQ")
public class class27 extends class44 {

    @OriginalMember(owner = "IRBOJPFQ", name = "v", descriptor = "Z")
    public boolean field911 = false;

    @OriginalMember(owner = "IRBOJPFQ", name = "z", descriptor = "Z")
    private boolean field915 = false;

    @OriginalMember(owner = "IRBOJPFQ", name = "A", descriptor = "B")
    private byte field916 = 1;

    @OriginalMember(owner = "IRBOJPFQ", name = "M", descriptor = "I")
    private int field928 = -17838;

    @OriginalMember(owner = "IRBOJPFQ", name = "N", descriptor = "Z")
    private boolean field929 = false;

    @OriginalMember(owner = "IRBOJPFQ", name = "u", descriptor = "LXHDTVZNY;")
    private class64 field910;

    @OriginalMember(owner = "IRBOJPFQ", name = "m", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "IRBOJPFQ", name = "B", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "IRBOJPFQ", name = "C", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "IRBOJPFQ", name = "D", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "IRBOJPFQ", name = "w", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "IRBOJPFQ", name = "x", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "IRBOJPFQ", name = "J", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "IRBOJPFQ", name = "K", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "IRBOJPFQ", name = "L", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "IRBOJPFQ", name = "E", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "IRBOJPFQ", name = "r", descriptor = "D")
    public double field907;

    @OriginalMember(owner = "IRBOJPFQ", name = "s", descriptor = "D")
    public double field908;

    @OriginalMember(owner = "IRBOJPFQ", name = "t", descriptor = "D")
    public double field909;

    @OriginalMember(owner = "IRBOJPFQ", name = "y", descriptor = "D")
    private double field914;

    @OriginalMember(owner = "IRBOJPFQ", name = "F", descriptor = "D")
    private double field921;

    @OriginalMember(owner = "IRBOJPFQ", name = "G", descriptor = "D")
    private double field922;

    @OriginalMember(owner = "IRBOJPFQ", name = "H", descriptor = "D")
    private double field923;

    @OriginalMember(owner = "IRBOJPFQ", name = "I", descriptor = "D")
    private double field924;

    @OriginalMember(owner = "IRBOJPFQ", name = "l", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "IRBOJPFQ", name = "n", descriptor = "I")
    public int field903;

    @OriginalMember(owner = "IRBOJPFQ", name = "o", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "IRBOJPFQ", name = "p", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "IRBOJPFQ", name = "q", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "IRBOJPFQ", name = "a", descriptor = "(IIZII)V")
    public final void method339(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field911) {
            double var6 = (double) (arg1 - this.field917);
            double var8 = (double) (arg0 - this.field918);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field907 = (double) this.field926 * var6 / var10 + (double) this.field917;
            this.field908 = (double) this.field926 * var8 / var10 + (double) this.field918;
            this.field909 = this.field919;
        }
        double var12 = (double) (this.field913 + 1 - arg4);
        this.field921 = ((double) arg1 - this.field907) / var12;
        if (arg2) {
            return;
        }
        this.field922 = ((double) arg0 - this.field908) / var12;
        this.field923 = Math.sqrt(this.field922 * this.field922 + this.field921 * this.field921);
        if (!this.field911) {
            this.field924 = -this.field923 * Math.tan((double) this.field925 * 0.02454369D);
        }
        this.field914 = ((double) arg3 - this.field909 - this.field924 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "IRBOJPFQ", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (this.field928 != arg4) {
            this.field928 = -401;
        }
        this.field910 = class64.field1620[arg10];
        this.field902 = arg9;
        this.field917 = arg7;
        this.field918 = arg6;
        this.field919 = arg0;
        this.field912 = arg1;
        this.field913 = arg2;
        this.field925 = arg3;
        this.field926 = arg5;
        this.field927 = arg8;
        this.field920 = arg11;
        this.field911 = false;
    }

    @OriginalMember(owner = "IRBOJPFQ", name = "a", descriptor = "(I)LVHYCWIPJ;")
    public final class53 method217(int arg0) {
        class53 var2 = this.field910.method579();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        if (this.field910.field1624 != null) {
            var3 = this.field910.field1624.field1540[this.field905];
        }
        class53 var4 = new class53((byte) 9, class51.method489(var3, this.field916), true, false, var2);
        if (var3 != -1) {
            var4.method507(0);
            var4.method508(999, var3);
            var4.field1411 = null;
            var4.field1410 = null;
        }
        if (this.field910.field1627 != 128 || this.field910.field1628 != 128) {
            var4.method516(this.field929, this.field910.field1627, this.field910.field1627, this.field910.field1628);
        }
        var4.method512(this.field901, this.field904);
        var4.method517(this.field910.field1630 + 64, this.field910.field1631 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "IRBOJPFQ", name = "a", descriptor = "(ZI)V")
    public final void method340(boolean arg0, int arg1) {
        this.field911 = true;
        this.field907 += (double) arg1 * this.field921;
        if (!arg0) {
            this.field915 = !this.field915;
        }
        this.field908 += (double) arg1 * this.field922;
        this.field909 += this.field914 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field924;
        this.field924 += (double) arg1 * this.field914;
        this.field903 = (int) (Math.atan2(this.field921, this.field922) * 325.949D) + 1024 & 0x7FF;
        this.field904 = (int) (Math.atan2(this.field924, this.field923) * 325.949D) & 0x7FF;
        if (this.field910.field1624 == null) {
            return;
        }
        this.field906 += arg1;
        while (this.field906 > this.field910.field1624.method549(this.field905, 0)) {
            this.field906 -= this.field910.field1624.method549(this.field905, 0) + 1;
            this.field905++;
            if (this.field905 >= this.field910.field1624.field1539) {
                this.field905 = 0;
            }
        }
    }
}
