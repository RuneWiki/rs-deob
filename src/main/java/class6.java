import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DYEBQOMK")
public class class6 extends class66 {

    @OriginalMember(owner = "DYEBQOMK", name = "m", descriptor = "B")
    private byte field661 = 41;

    @OriginalMember(owner = "DYEBQOMK", name = "n", descriptor = "I")
    private int field662 = 9;

    @OriginalMember(owner = "DYEBQOMK", name = "u", descriptor = "Z")
    private boolean field669 = false;

    @OriginalMember(owner = "DYEBQOMK", name = "x", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "DYEBQOMK", name = "w", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "DYEBQOMK", name = "y", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "DYEBQOMK", name = "z", descriptor = "I")
    private int field674;

    @OriginalMember(owner = "DYEBQOMK", name = "q", descriptor = "I")
    private int field665;

    @OriginalMember(owner = "DYEBQOMK", name = "r", descriptor = "I")
    private int field666;

    @OriginalMember(owner = "DYEBQOMK", name = "s", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "DYEBQOMK", name = "t", descriptor = "I")
    private int field668;

    @OriginalMember(owner = "DYEBQOMK", name = "C", descriptor = "LPNPNYEVW;")
    private class42 field677;

    @OriginalMember(owner = "DYEBQOMK", name = "l", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "DYEBQOMK", name = "o", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "DYEBQOMK", name = "A", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "DYEBQOMK", name = "B", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "DYEBQOMK", name = "p", descriptor = "[I")
    public int[] field664;

    @OriginalMember(owner = "DYEBQOMK", name = "v", descriptor = "Lclient;")
    public static client field670;

    @OriginalMember(owner = "DYEBQOMK", name = "a", descriptor = "(B)LNRKXAGEB;")
    public final class37 method186(byte arg0) {
        if (this.field661 != arg0) {
            this.field669 = !this.field669;
        }
        int var2 = -1;
        if (this.field675 != -1) {
            class39 var3 = class39.field1195[this.field675];
            int var4 = var3.field1197;
            int var5 = var3.field1198;
            int var6 = var3.field1199;
            int var7 = client.field405[var6 - var5];
            var2 = field670.field134[var4] >> var5 & var7;
        } else if (this.field676 != -1) {
            var2 = field670.field134[this.field676];
        }
        return var2 < 0 || var2 >= this.field664.length || this.field664[var2] == -1 ? null : class37.method400(this.field664[var2]);
    }

    @OriginalMember(owner = "DYEBQOMK", name = "<init>", descriptor = "(IIZIIIIZII)V")
    public class6(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        this.field672 = arg9;
        if (!arg7) {
            this.field671 = 418;
        }
        this.field673 = arg6;
        this.field674 = arg5;
        this.field665 = arg0;
        this.field666 = arg8;
        this.field667 = arg4;
        this.field668 = arg3;
        if (arg1 != -1) {
            this.field677 = class42.field1219[arg1];
            this.field660 = 0;
            this.field663 = client.field505;
            if (arg2 && this.field677.field1224 != -1) {
                this.field660 = (int) (Math.random() * (double) this.field677.field1220);
                this.field663 -= (int) (Math.random() * (double) this.field677.method427(this.field660, this.field662));
            }
        }
        class37 var11 = class37.method400(this.field672);
        this.field675 = var11.field1164;
        this.field676 = var11.field1140;
        this.field664 = var11.field1156;
    }

    @OriginalMember(owner = "DYEBQOMK", name = "a", descriptor = "(Z)LCSGBDGDY;")
    public final class4 method187(boolean arg0) {
        if (!arg0) {
            this.field669 = !this.field669;
        }
        int var2 = -1;
        if (this.field677 != null) {
            int var3 = client.field505 - this.field663;
            if (var3 > 100 && this.field677.field1224 > 0) {
                var3 = 100;
            }
            label49: {
                do {
                    do {
                        if (var3 <= this.field677.method427(this.field660, this.field662)) {
                            break label49;
                        }
                        var3 -= this.field677.method427(this.field660, this.field662);
                        this.field660++;
                    } while (this.field660 < this.field677.field1220);
                    this.field660 -= this.field677.field1224;
                } while (this.field660 >= 0 && this.field660 < this.field677.field1220);
                this.field677 = null;
            }
            this.field663 = client.field505 - var3;
            if (this.field677 != null) {
                var2 = this.field677.field1221[this.field660];
            }
        }
        class37 var4;
        if (this.field664 == null) {
            var4 = class37.method400(this.field672);
        } else {
            var4 = this.method186((byte) 41);
        }
        return var4 == null ? null : var4.method408(this.field673, this.field674, this.field665, this.field666, this.field667, this.field668, var2);
    }
}
