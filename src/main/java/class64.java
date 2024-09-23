import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WFUJSESJ")
public class class64 extends class4 {

    @OriginalMember(owner = "WFUJSESJ", name = "r", descriptor = "Z")
    private boolean field1600 = false;

    @OriginalMember(owner = "WFUJSESJ", name = "x", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "WFUJSESJ", name = "y", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "WFUJSESJ", name = "z", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "WFUJSESJ", name = "n", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "WFUJSESJ", name = "o", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "WFUJSESJ", name = "p", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "WFUJSESJ", name = "q", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "WFUJSESJ", name = "u", descriptor = "LBZONLWPM;")
    private class5 field1603;

    @OriginalMember(owner = "WFUJSESJ", name = "m", descriptor = "I")
    private int field1595;

    @OriginalMember(owner = "WFUJSESJ", name = "t", descriptor = "I")
    private int field1602;

    @OriginalMember(owner = "WFUJSESJ", name = "v", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "WFUJSESJ", name = "w", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "WFUJSESJ", name = "l", descriptor = "[I")
    public int[] field1594;

    @OriginalMember(owner = "WFUJSESJ", name = "s", descriptor = "Lclient;")
    public static client field1601;

    @OriginalMember(owner = "WFUJSESJ", name = "<init>", descriptor = "(IIIIIIZIII)V")
    public class64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        this.field1606 = arg4;
        if (arg8 != 18451) {
            this.field1600 = !this.field1600;
        }
        this.field1607 = arg5;
        this.field1608 = arg2;
        this.field1596 = arg1;
        this.field1597 = arg3;
        this.field1598 = arg7;
        this.field1599 = arg9;
        if (arg0 != -1) {
            this.field1603 = class5.field67[arg0];
            this.field1595 = 0;
            this.field1602 = client.field147;
            if (arg6 && this.field1603.field72 != -1) {
                this.field1595 = (int) (Math.random() * (double) this.field1603.field68);
                this.field1602 -= (int) (Math.random() * (double) this.field1603.method27(this.field1595, (byte) -127));
            }
        }
        class27 var11 = class27.method326(this.field1606);
        this.field1604 = var11.field840;
        this.field1605 = var11.field856;
        this.field1594 = var11.field825;
    }

    @OriginalMember(owner = "WFUJSESJ", name = "a", descriptor = "(I)LIGXVZOHI;")
    public final class32 method25(int arg0) {
        if (arg0 != 47492) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field1603 != null) {
            int var3 = client.field147 - this.field1602;
            if (var3 > 100 && this.field1603.field72 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field1603.method27(this.field1595, (byte) -127)) {
                            break label44;
                        }
                        var3 -= this.field1603.method27(this.field1595, (byte) -127);
                        this.field1595++;
                    } while (this.field1595 < this.field1603.field68);
                    this.field1595 -= this.field1603.field72;
                } while (this.field1595 >= 0 && this.field1595 < this.field1603.field68);
                this.field1603 = null;
            }
            this.field1602 = client.field147 - var3;
            if (this.field1603 != null) {
                var2 = this.field1603.field69[this.field1595];
            }
        }
        class27 var4;
        if (this.field1594 == null) {
            var4 = class27.method326(this.field1606);
        } else {
            var4 = this.method556(-485);
        }
        return var4 == null ? null : var4.method321(this.field1607, this.field1608, this.field1596, this.field1597, this.field1598, this.field1599, var2);
    }

    @OriginalMember(owner = "WFUJSESJ", name = "b", descriptor = "(I)LHGKOLOPU;")
    public final class27 method556(int arg0) {
        int var2 = -1;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        if (this.field1604 != -1) {
            class16 var3 = class16.field724[this.field1604];
            int var4 = var3.field726;
            int var5 = var3.field727;
            int var6 = var3.field728;
            int var7 = client.field446[var6 - var5];
            var2 = field1601.field115[var4] >> var5 & var7;
        } else if (this.field1605 != -1) {
            var2 = field1601.field115[this.field1605];
        }
        return var2 < 0 || var2 >= this.field1594.length || this.field1594[var2] == -1 ? null : class27.method326(this.field1594[var2]);
    }
}
