import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class101 extends class354 {

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
    private int field1613 = 0;

    @OriginalMember(owner = "client!ho", name = "P", descriptor = "I")
    private int field1618 = 2048;

    @OriginalMember(owner = "client!ho", name = "V", descriptor = "I")
    private int field1624 = 10;

    @OriginalMember(owner = "client!ho", name = "T", descriptor = "Z")
    public static boolean field1622 = false;

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    public static int field1612 = 0;

    @OriginalMember(owner = "client!ho", name = "W", descriptor = "Z")
    public static boolean field1625 = false;

    @OriginalMember(owner = "client!ho", name = "U", descriptor = "[I")
    public static int[] field1623 = new int[1024];

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ho", name = "M", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ho", name = "N", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ho", name = "O", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ho", name = "R", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ho", name = "Q", descriptor = "[I")
    private int[] field1619;

    @OriginalMember(owner = "client!ho", name = "S", descriptor = "[I")
    private int[] field1621;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V", line = 5)
    public final void method771(boolean arg0) {
        this.method776(120);
        ++field1617;
        if (arg0) {
            field1620 = -82;
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V", line = 147)
    public class101() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)[I", line = 31)
    public final int[] method253(int arg0, byte arg1) {
        ++field1616;
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            int var4 = class278.field4009[arg0];
            if (~this.field1613 != -1) {
                for (int var5 = 0; var5 < class404.field5952; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class154.field2358[var5];
                    int var9 = this.field1613;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var4 + -4096 + var8 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field1624 < ~var10; ++var10) {
                        if (~this.field1621[var10] >= ~var6 && ~var6 > ~this.field1621[var10 + 1]) {
                            if (~var6 > ~this.field1619[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~var12 > ~this.field1624; ++var12) {
                    if (~var4 <= ~this.field1621[var12] && var4 < this.field1621[var12 + 1]) {
                        if (this.field1619[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class486.method2900(var3, 0, class404.field5952, var11);
            }
        }
        if (arg1 != -95) {
            this.method776(3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILti;I)V", line = 150)
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (arg0 != 15180) {
            this.method253(-44, (byte) -98);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1613 = arg1.method1918((byte) -112);
                }
            } else {
                this.field1618 = arg1.method1868(arg0 + -15180);
            }
        } else {
            this.field1624 = arg1.method1918((byte) 77);
        }
        ++field1610;
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V", line = 209)
    private final void method776(int arg0) {
        if (arg0 <= 9) {
            this.field1618 = -54;
        }
        ++field1611;
        int var2 = 0;
        this.field1621 = new int[this.field1624 - -1];
        this.field1619 = new int[this.field1624 + 1];
        int var3 = 4096 / this.field1624;
        int var4 = this.field1618 * var3 >> 12;
        for (int var5 = 0; this.field1624 > var5; ++var5) {
            this.field1621[var5] = var2;
            this.field1619[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field1621[this.field1624] = 4096;
        this.field1619[this.field1624] = 4096 - -this.field1619[0];
    }

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V", line = 240)
    public static void method777(int arg0) {
        field1623 = null;
        if (arg0 >= -40) {
            method777(-44);
        }
    }
}
