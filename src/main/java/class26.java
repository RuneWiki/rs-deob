import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IKYTXJCI")
public class class26 extends class53 {

    @OriginalMember(owner = "IKYTXJCI", name = "r", descriptor = "I")
    private int field842 = 4;

    @OriginalMember(owner = "IKYTXJCI", name = "o", descriptor = "I")
    private int field839;

    @OriginalMember(owner = "IKYTXJCI", name = "p", descriptor = "I")
    private int field840;

    @OriginalMember(owner = "IKYTXJCI", name = "q", descriptor = "I")
    private int field841;

    @OriginalMember(owner = "IKYTXJCI", name = "u", descriptor = "I")
    private int field845;

    @OriginalMember(owner = "IKYTXJCI", name = "v", descriptor = "I")
    private int field846;

    @OriginalMember(owner = "IKYTXJCI", name = "w", descriptor = "I")
    private int field847;

    @OriginalMember(owner = "IKYTXJCI", name = "x", descriptor = "I")
    private int field848;

    @OriginalMember(owner = "IKYTXJCI", name = "y", descriptor = "LHZCWGKOF;")
    private class24 field849;

    @OriginalMember(owner = "IKYTXJCI", name = "t", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "IKYTXJCI", name = "s", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "IKYTXJCI", name = "m", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "IKYTXJCI", name = "n", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "IKYTXJCI", name = "z", descriptor = "[I")
    public int[] field850;

    @OriginalMember(owner = "IKYTXJCI", name = "l", descriptor = "Lclient;")
    public static client field836;

    @OriginalMember(owner = "IKYTXJCI", name = "a", descriptor = "(I)LDHQCHKXN;")
    public final class13 method233(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field837 != -1) {
            class30 var3 = class30.field953[this.field837];
            int var4 = var3.field955;
            int var5 = var3.field956;
            int var6 = var3.field957;
            int var7 = client.field197[var6 - var5];
            var2 = field836.field374[var4] >> var5 & var7;
        } else if (this.field838 != -1) {
            var2 = field836.field374[this.field838];
        }
        return var2 < 0 || var2 >= this.field850.length || this.field850[var2] == -1 ? null : class13.method194(this.field850[var2]);
    }

    @OriginalMember(owner = "IKYTXJCI", name = "a", descriptor = "(Z)LITSMSHJO;")
    public final class27 method2(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field849 != null) {
            int var3 = client.field330 - this.field843;
            if (var3 > 100 && this.field849.field818 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field849.method227(956, this.field844)) {
                            break label44;
                        }
                        var3 -= this.field849.method227(956, this.field844);
                        this.field844++;
                    } while (this.field844 < this.field849.field814);
                    this.field844 -= this.field849.field818;
                } while (this.field844 >= 0 && this.field844 < this.field849.field814);
                this.field849 = null;
            }
            this.field843 = client.field330 - var3;
            if (this.field849 != null) {
                var2 = this.field849.field815[this.field844];
            }
        }
        class13 var4;
        if (this.field850 == null) {
            var4 = class13.method194(this.field839);
        } else {
            var4 = this.method233(-814);
        }
        return var4 == null ? null : var4.method191(this.field840, this.field841, this.field845, this.field846, this.field847, this.field848, var2);
    }

    @OriginalMember(owner = "IKYTXJCI", name = "<init>", descriptor = "(IIIIZIIIII)V")
    public class26(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field839 = arg5;
        this.field840 = arg6;
        this.field841 = arg1;
        this.field845 = arg2;
        this.field846 = arg0;
        this.field847 = arg7;
        this.field848 = arg8;
        if (arg9 != -1) {
            this.field849 = class24.field813[arg9];
            this.field844 = 0;
            this.field843 = client.field330;
            if (arg4 && this.field849.field818 != -1) {
                this.field844 = (int) (Math.random() * (double) this.field849.field814);
                this.field843 -= (int) (Math.random() * (double) this.field849.method227(956, this.field844));
            }
        }
        class13 var11 = class13.method194(this.field839);
        if (arg3 != -23440) {
            this.field842 = 311;
        }
        this.field837 = var11.field650;
        this.field838 = var11.field671;
        this.field850 = var11.field682;
    }
}
