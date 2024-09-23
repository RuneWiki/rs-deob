import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XWNQXFLX")
public class class66 extends class44 {

    @OriginalMember(owner = "XWNQXFLX", name = "t", descriptor = "I")
    private int field1650;

    @OriginalMember(owner = "XWNQXFLX", name = "u", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "XWNQXFLX", name = "v", descriptor = "I")
    private int field1652;

    @OriginalMember(owner = "XWNQXFLX", name = "m", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "XWNQXFLX", name = "n", descriptor = "I")
    private int field1644;

    @OriginalMember(owner = "XWNQXFLX", name = "o", descriptor = "I")
    private int field1645;

    @OriginalMember(owner = "XWNQXFLX", name = "p", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "XWNQXFLX", name = "y", descriptor = "LWLHKAARP;")
    private class59 field1655;

    @OriginalMember(owner = "XWNQXFLX", name = "l", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "XWNQXFLX", name = "w", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "XWNQXFLX", name = "q", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "XWNQXFLX", name = "r", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "XWNQXFLX", name = "s", descriptor = "[I")
    public int[] field1649;

    @OriginalMember(owner = "XWNQXFLX", name = "x", descriptor = "Lclient;")
    public static client field1654;

    @OriginalMember(owner = "XWNQXFLX", name = "b", descriptor = "(I)LRFUKTMBK;")
    public final class48 method582(int arg0) {
        int var2 = 48 / arg0;
        int var3 = -1;
        if (this.field1647 != -1) {
            class72 var4 = class72.field1710[this.field1647];
            int var5 = var4.field1712;
            int var6 = var4.field1713;
            int var7 = var4.field1714;
            int var8 = client.field569[var7 - var6];
            var3 = field1654.field492[var5] >> var6 & var8;
        } else if (this.field1648 != -1) {
            var3 = field1654.field492[this.field1648];
        }
        return var3 < 0 || var3 >= this.field1649.length || this.field1649[var3] == -1 ? null : class48.method472(this.field1649[var3]);
    }

    @OriginalMember(owner = "XWNQXFLX", name = "<init>", descriptor = "(IIIIIZIIII)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1650 = arg9;
        this.field1651 = arg0;
        this.field1652 = arg7;
        this.field1643 = arg2;
        this.field1644 = arg1;
        this.field1645 = arg3;
        this.field1646 = arg8;
        int var11 = 74 / arg4;
        if (arg6 != -1) {
            this.field1655 = class59.field1538[arg6];
            this.field1642 = 0;
            this.field1653 = client.field332;
            if (arg5 && this.field1655.field1543 != -1) {
                this.field1642 = (int) (Math.random() * (double) this.field1655.field1539);
                this.field1653 -= (int) (Math.random() * (double) this.field1655.method549(this.field1642, 0));
            }
        }
        class48 var12 = class48.method472(this.field1650);
        this.field1647 = var12.field1234;
        this.field1648 = var12.field1210;
        this.field1649 = var12.field1232;
    }

    @OriginalMember(owner = "XWNQXFLX", name = "a", descriptor = "(I)LVHYCWIPJ;")
    public final class53 method217(int arg0) {
        int var2 = -1;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1655 != null) {
            int var4 = client.field332 - this.field1653;
            if (var4 > 100 && this.field1655.field1543 > 0) {
                var4 = 100;
            }
            label46: {
                do {
                    do {
                        if (var4 <= this.field1655.method549(this.field1642, 0)) {
                            break label46;
                        }
                        var4 -= this.field1655.method549(this.field1642, 0);
                        this.field1642++;
                    } while (this.field1642 < this.field1655.field1539);
                    this.field1642 -= this.field1655.field1543;
                } while (this.field1642 >= 0 && this.field1642 < this.field1655.field1539);
                this.field1655 = null;
            }
            this.field1653 = client.field332 - var4;
            if (this.field1655 != null) {
                var2 = this.field1655.field1540[this.field1642];
            }
        }
        class48 var5;
        if (this.field1649 == null) {
            var5 = class48.method472(this.field1650);
        } else {
            var5 = this.method582(841);
        }
        return var5 == null ? null : var5.method462(this.field1651, this.field1652, this.field1643, this.field1644, this.field1645, this.field1646, var2);
    }
}
