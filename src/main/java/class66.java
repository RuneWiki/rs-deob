import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YRZVGTOF")
public class class66 extends class57 {

    @OriginalMember(owner = "YRZVGTOF", name = "s", descriptor = "Z")
    private boolean field1654 = true;

    @OriginalMember(owner = "YRZVGTOF", name = "u", descriptor = "I")
    private int field1656 = -479;

    @OriginalMember(owner = "YRZVGTOF", name = "z", descriptor = "I")
    private int field1661 = 40410;

    @OriginalMember(owner = "YRZVGTOF", name = "v", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "YRZVGTOF", name = "w", descriptor = "I")
    private int field1658;

    @OriginalMember(owner = "YRZVGTOF", name = "x", descriptor = "I")
    private int field1659;

    @OriginalMember(owner = "YRZVGTOF", name = "m", descriptor = "I")
    private int field1648;

    @OriginalMember(owner = "YRZVGTOF", name = "n", descriptor = "I")
    private int field1649;

    @OriginalMember(owner = "YRZVGTOF", name = "o", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "YRZVGTOF", name = "p", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "YRZVGTOF", name = "t", descriptor = "LKIZBPSHZ;")
    private class29 field1655;

    @OriginalMember(owner = "YRZVGTOF", name = "q", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "YRZVGTOF", name = "y", descriptor = "I")
    private int field1660;

    @OriginalMember(owner = "YRZVGTOF", name = "A", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "YRZVGTOF", name = "B", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "YRZVGTOF", name = "r", descriptor = "[I")
    public int[] field1653;

    @OriginalMember(owner = "YRZVGTOF", name = "C", descriptor = "Lclient;")
    public static client field1664;

    @OriginalMember(owner = "YRZVGTOF", name = "a", descriptor = "(Z)LPOJFANDE;")
    public final class43 method54(boolean arg0) {
        int var2 = -1;
        if (this.field1655 != null) {
            int var3 = client.field525 - this.field1660;
            if (var3 > 100 && this.field1655.field1019 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field1655.method364(this.field1661, this.field1652)) {
                            break label45;
                        }
                        var3 -= this.field1655.method364(this.field1661, this.field1652);
                        this.field1652++;
                    } while (this.field1652 < this.field1655.field1015);
                    this.field1652 -= this.field1655.field1019;
                } while (this.field1652 >= 0 && this.field1652 < this.field1655.field1015);
                this.field1655 = null;
            }
            this.field1660 = client.field525 - var3;
            if (this.field1655 != null) {
                var2 = this.field1655.field1016[this.field1652];
            }
        }
        if (!arg0) {
            throw new NullPointerException();
        }
        class7 var4;
        if (this.field1653 == null) {
            var4 = class7.method219(this.field1657);
        } else {
            var4 = this.method575(true);
        }
        return var4 == null ? null : var4.method217(this.field1658, this.field1659, this.field1648, this.field1649, this.field1650, this.field1651, var2);
    }

    @OriginalMember(owner = "YRZVGTOF", name = "b", descriptor = "(Z)LCSTFGNEK;")
    public final class7 method575(boolean arg0) {
        if (!arg0) {
            this.field1656 = 214;
        }
        int var2 = -1;
        if (this.field1662 != -1) {
            class18 var3 = class18.field798[this.field1662];
            int var4 = var3.field800;
            int var5 = var3.field801;
            int var6 = var3.field802;
            int var7 = client.field225[var6 - var5];
            var2 = field1664.field373[var4] >> var5 & var7;
        } else if (this.field1663 != -1) {
            var2 = field1664.field373[this.field1663];
        }
        return var2 < 0 || var2 >= this.field1653.length || this.field1653[var2] == -1 ? null : class7.method219(this.field1653[var2]);
    }

    @OriginalMember(owner = "YRZVGTOF", name = "<init>", descriptor = "(IIZIIIIZII)V")
    public class66(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        this.field1657 = arg6;
        this.field1658 = arg1;
        this.field1659 = arg4;
        this.field1648 = arg5;
        if (!arg2) {
            throw new NullPointerException();
        }
        this.field1649 = arg8;
        this.field1650 = arg3;
        this.field1651 = arg9;
        if (arg0 != -1) {
            this.field1655 = class29.field1014[arg0];
            this.field1652 = 0;
            this.field1660 = client.field525;
            if (arg7 && this.field1655.field1019 != -1) {
                this.field1652 = (int) (Math.random() * (double) this.field1655.field1015);
                this.field1660 -= (int) (Math.random() * (double) this.field1655.method364(this.field1661, this.field1652));
            }
        }
        class7 var11 = class7.method219(this.field1657);
        this.field1662 = var11.field566;
        this.field1663 = var11.field606;
        this.field1653 = var11.field609;
    }
}
