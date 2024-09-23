import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OPRNYJBH")
public class class36 extends class4 {

    @OriginalMember(owner = "OPRNYJBH", name = "u", descriptor = "Z")
    private boolean field1021 = false;

    @OriginalMember(owner = "OPRNYJBH", name = "E", descriptor = "Z")
    private boolean field1031 = true;

    @OriginalMember(owner = "OPRNYJBH", name = "I", descriptor = "Z")
    private boolean field1035 = true;

    @OriginalMember(owner = "OPRNYJBH", name = "J", descriptor = "Z")
    public boolean field1036 = false;

    @OriginalMember(owner = "OPRNYJBH", name = "t", descriptor = "LCIVOPMKV;")
    private class9 field1020;

    @OriginalMember(owner = "OPRNYJBH", name = "s", descriptor = "I")
    public int field1019;

    @OriginalMember(owner = "OPRNYJBH", name = "A", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "OPRNYJBH", name = "B", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "OPRNYJBH", name = "C", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "OPRNYJBH", name = "F", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "OPRNYJBH", name = "G", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "OPRNYJBH", name = "n", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "OPRNYJBH", name = "o", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "OPRNYJBH", name = "p", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "OPRNYJBH", name = "D", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "OPRNYJBH", name = "v", descriptor = "D")
    public double field1022;

    @OriginalMember(owner = "OPRNYJBH", name = "w", descriptor = "D")
    public double field1023;

    @OriginalMember(owner = "OPRNYJBH", name = "x", descriptor = "D")
    public double field1024;

    @OriginalMember(owner = "OPRNYJBH", name = "K", descriptor = "D")
    private double field1037;

    @OriginalMember(owner = "OPRNYJBH", name = "L", descriptor = "D")
    private double field1038;

    @OriginalMember(owner = "OPRNYJBH", name = "M", descriptor = "D")
    private double field1039;

    @OriginalMember(owner = "OPRNYJBH", name = "N", descriptor = "D")
    private double field1040;

    @OriginalMember(owner = "OPRNYJBH", name = "O", descriptor = "D")
    private double field1041;

    @OriginalMember(owner = "OPRNYJBH", name = "q", descriptor = "I")
    private int field1017;

    @OriginalMember(owner = "OPRNYJBH", name = "r", descriptor = "I")
    private int field1018;

    @OriginalMember(owner = "OPRNYJBH", name = "y", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "OPRNYJBH", name = "z", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "OPRNYJBH", name = "H", descriptor = "I")
    private int field1034;

    @OriginalMember(owner = "OPRNYJBH", name = "a", descriptor = "(Z)LYABPKWWG;")
    public final class67 method16(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        class67 var2 = this.field1020.method32();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.field1020.field140 != null) {
            var3 = this.field1020.field140.field1707[this.field1017];
        }
        class67 var4 = new class67(660, var2, class22.method219(var3, true), true, false);
        if (var3 != -1) {
            var4.method555((byte) 45);
            var4.method556(598, var3);
            var4.field1647 = null;
            var4.field1646 = null;
        }
        if (this.field1020.field143 != 128 || this.field1020.field144 != 128) {
            var4.method564(this.field1020.field144, this.field1020.field143, (byte) -46, this.field1020.field143);
        }
        var4.method560(false, this.field1026);
        var4.method565(this.field1020.field146 + 64, this.field1020.field147 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "OPRNYJBH", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public class36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.field1020 = class9.field136[arg11];
        this.field1019 = arg5;
        this.field1027 = arg8;
        this.field1028 = arg6;
        this.field1029 = arg4;
        this.field1032 = arg1;
        this.field1033 = arg10;
        this.field1014 = arg2;
        if (arg3 < 2 || arg3 > 2) {
            this.field1031 = !this.field1031;
        }
        this.field1015 = arg0;
        this.field1016 = arg9;
        this.field1030 = arg7;
        this.field1036 = false;
    }

    @OriginalMember(owner = "OPRNYJBH", name = "a", descriptor = "(IIIII)V")
    public final void method376(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field1036) {
            double var6 = (double) (arg0 - this.field1027);
            double var8 = (double) (arg1 - this.field1028);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1022 = (double) this.field1015 * var6 / var10 + (double) this.field1027;
            this.field1023 = (double) this.field1015 * var8 / var10 + (double) this.field1028;
            this.field1024 = this.field1029;
        }
        double var12 = (double) (this.field1033 + 1 - arg3);
        this.field1038 = ((double) arg0 - this.field1022) / var12;
        this.field1039 = ((double) arg1 - this.field1023) / var12;
        this.field1040 = Math.sqrt(this.field1039 * this.field1039 + this.field1038 * this.field1038);
        if (arg2 < 8 || arg2 > 8) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        if (!this.field1036) {
            this.field1041 = -this.field1040 * Math.tan((double) this.field1014 * 0.02454369D);
        }
        this.field1037 = ((double) arg4 - this.field1024 - this.field1041 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "OPRNYJBH", name = "a", descriptor = "(ZI)V")
    public final void method377(boolean arg0, int arg1) {
        this.field1036 = true;
        this.field1022 += (double) arg1 * this.field1038;
        this.field1023 += (double) arg1 * this.field1039;
        if (arg0) {
            this.field1034 = 431;
        }
        this.field1024 += this.field1037 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field1041;
        this.field1041 += (double) arg1 * this.field1037;
        this.field1025 = (int) (Math.atan2(this.field1038, this.field1039) * 325.949D) + 1024 & 0x7FF;
        this.field1026 = (int) (Math.atan2(this.field1041, this.field1040) * 325.949D) & 0x7FF;
        if (this.field1020.field140 == null) {
            return;
        }
        this.field1018 += arg1;
        while (this.field1018 > this.field1020.field140.method591(0, this.field1017)) {
            this.field1018 -= this.field1020.field140.method591(0, this.field1017) + 1;
            this.field1017++;
            if (this.field1017 >= this.field1020.field140.field1706) {
                this.field1017 = 0;
            }
        }
    }
}
