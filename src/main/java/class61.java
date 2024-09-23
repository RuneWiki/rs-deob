import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WYAAPLJP")
public class class61 extends class71 {

    @OriginalMember(owner = "WYAAPLJP", name = "m", descriptor = "Z")
    private boolean field1594 = false;

    @OriginalMember(owner = "WYAAPLJP", name = "w", descriptor = "I")
    private int field1604;

    @OriginalMember(owner = "WYAAPLJP", name = "x", descriptor = "I")
    private int field1605;

    @OriginalMember(owner = "WYAAPLJP", name = "y", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "WYAAPLJP", name = "p", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "WYAAPLJP", name = "q", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "WYAAPLJP", name = "r", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "WYAAPLJP", name = "s", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "WYAAPLJP", name = "z", descriptor = "LVYCKCNXO;")
    private class58 field1607;

    @OriginalMember(owner = "WYAAPLJP", name = "t", descriptor = "I")
    private int field1601;

    @OriginalMember(owner = "WYAAPLJP", name = "l", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "WYAAPLJP", name = "u", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "WYAAPLJP", name = "v", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "WYAAPLJP", name = "o", descriptor = "[I")
    public int[] field1596;

    @OriginalMember(owner = "WYAAPLJP", name = "n", descriptor = "Lclient;")
    public static client field1595;

    @OriginalMember(owner = "WYAAPLJP", name = "b", descriptor = "(Z)LMKWUPJYP;")
    public final class28 method536(boolean arg0) {
        if (arg0) {
            this.field1594 = !this.field1594;
        }
        int var2 = -1;
        if (this.field1602 != -1) {
            class34 var3 = class34.field1182[this.field1602];
            int var4 = var3.field1184;
            int var5 = var3.field1185;
            int var6 = var3.field1186;
            int var7 = client.field182[var6 - var5];
            var2 = field1595.field539[var4] >> var5 & var7;
        } else if (this.field1603 != -1) {
            var2 = field1595.field539[this.field1603];
        }
        return var2 < 0 || var2 >= this.field1596.length || this.field1596[var2] == -1 ? null : class28.method365(this.field1596[var2]);
    }

    @OriginalMember(owner = "WYAAPLJP", name = "<init>", descriptor = "(IIZIIIIIII)V")
    public class61(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1604 = arg1;
        this.field1605 = arg7;
        this.field1606 = arg4;
        this.field1597 = arg6;
        this.field1598 = arg3;
        this.field1599 = arg0;
        this.field1600 = arg9;
        if (arg8 != -1) {
            this.field1607 = class58.field1560[arg8];
            this.field1601 = 0;
            this.field1593 = client.field419;
            if (arg2 && this.field1607.field1565 != -1) {
                this.field1601 = (int) (Math.random() * (double) this.field1607.field1561);
                this.field1593 -= (int) (Math.random() * (double) this.field1607.method525(0, this.field1601));
            }
        }
        class28 var11 = class28.method365(this.field1604);
        this.field1602 = var11.field1091;
        this.field1603 = var11.field1126;
        this.field1596 = var11.field1118;
        if (arg5 != 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "WYAAPLJP", name = "a", descriptor = "(Z)LOQIGXOFQ;")
    public final class35 method171(boolean arg0) {
        int var2 = -1;
        if (this.field1607 != null) {
            int var3 = client.field419 - this.field1593;
            if (var3 > 100 && this.field1607.field1565 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field1607.method525(0, this.field1601)) {
                            break label45;
                        }
                        var3 -= this.field1607.method525(0, this.field1601);
                        this.field1601++;
                    } while (this.field1601 < this.field1607.field1561);
                    this.field1601 -= this.field1607.field1565;
                } while (this.field1601 >= 0 && this.field1601 < this.field1607.field1561);
                this.field1607 = null;
            }
            this.field1593 = client.field419 - var3;
            if (this.field1607 != null) {
                var2 = this.field1607.field1562[this.field1601];
            }
        }
        class28 var4;
        if (this.field1596 == null) {
            var4 = class28.method365(this.field1604);
        } else {
            var4 = this.method536(this.field1594);
        }
        if (var4 == null) {
            return null;
        }
        class35 var5 = var4.method361(this.field1605, this.field1606, this.field1597, this.field1598, this.field1599, this.field1600, var2);
        if (arg0) {
            throw new NullPointerException();
        }
        return var5;
    }
}
