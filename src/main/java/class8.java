import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CAXQGHNZ")
public class class8 extends class64 {

    @OriginalMember(owner = "CAXQGHNZ", name = "t", descriptor = "I")
    private int field152 = -712;

    @OriginalMember(owner = "CAXQGHNZ", name = "v", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "CAXQGHNZ", name = "w", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "CAXQGHNZ", name = "x", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "CAXQGHNZ", name = "n", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "CAXQGHNZ", name = "o", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "CAXQGHNZ", name = "p", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "CAXQGHNZ", name = "q", descriptor = "I")
    private int field149;

    @OriginalMember(owner = "CAXQGHNZ", name = "z", descriptor = "LCGWBYVFN;")
    private class9 field158;

    @OriginalMember(owner = "CAXQGHNZ", name = "u", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "CAXQGHNZ", name = "y", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "CAXQGHNZ", name = "l", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "CAXQGHNZ", name = "m", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "CAXQGHNZ", name = "r", descriptor = "[I")
    public int[] field150;

    @OriginalMember(owner = "CAXQGHNZ", name = "s", descriptor = "Lclient;")
    public static client field151;

    @OriginalMember(owner = "CAXQGHNZ", name = "a", descriptor = "(Z)LOIBEFFXI;")
    public final class39 method2(boolean arg0) {
        if (arg0) {
            this.field152 = -288;
        }
        int var2 = -1;
        if (this.field158 != null) {
            int var3 = client.field345 - this.field157;
            if (var3 > 100 && this.field158.field168 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field158.method23((byte) 2, this.field153)) {
                            break label44;
                        }
                        var3 -= this.field158.method23((byte) 2, this.field153);
                        this.field153++;
                    } while (this.field153 < this.field158.field164);
                    this.field153 -= this.field158.field168;
                } while (this.field153 >= 0 && this.field153 < this.field158.field164);
                this.field158 = null;
            }
            this.field157 = client.field345 - var3;
            if (this.field158 != null) {
                var2 = this.field158.field165[this.field153];
            }
        }
        class48 var4;
        if (this.field150 == null) {
            var4 = class48.method410(this.field154);
        } else {
            var4 = this.method21(3);
        }
        return var4 == null ? null : var4.method405(this.field155, this.field156, this.field146, this.field147, this.field148, this.field149, var2);
    }

    @OriginalMember(owner = "CAXQGHNZ", name = "<init>", descriptor = "(IIIZIIIIII)V")
    public class8(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field154 = arg5;
        this.field155 = arg2;
        this.field156 = arg0;
        this.field146 = arg6;
        this.field147 = arg7;
        this.field148 = arg1;
        this.field149 = arg8;
        if (arg4 != -1) {
            this.field158 = class9.field163[arg4];
            this.field153 = 0;
            this.field157 = client.field345;
            if (arg3 && this.field158.field168 != -1) {
                this.field153 = (int) (Math.random() * (double) this.field158.field164);
                this.field157 -= (int) (Math.random() * (double) this.field158.method23((byte) 2, this.field153));
            }
        }
        class48 var11 = class48.method410(this.field154);
        if (arg9 != 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        this.field144 = var11.field1263;
        this.field145 = var11.field1260;
        this.field150 = var11.field1251;
    }

    @OriginalMember(owner = "CAXQGHNZ", name = "a", descriptor = "(I)LSHDUUMNW;")
    public final class48 method21(int arg0) {
        if (arg0 < 3 || arg0 > 3) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = -1;
        if (this.field144 != -1) {
            class50 var4 = class50.field1300[this.field144];
            int var5 = var4.field1302;
            int var6 = var4.field1303;
            int var7 = var4.field1304;
            int var8 = client.field421[var7 - var6];
            var3 = field151.field631[var5] >> var6 & var8;
        } else if (this.field145 != -1) {
            var3 = field151.field631[this.field145];
        }
        return var3 < 0 || var3 >= this.field150.length || this.field150[var3] == -1 ? null : class48.method410(this.field150[var3]);
    }
}
