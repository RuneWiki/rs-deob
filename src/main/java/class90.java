import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class90 extends class512 {

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    private int field1486 = 1024;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    private int field1493 = 0;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    private int field1497 = 1024;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    private int field1496 = 409;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    private int field1499 = 81;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    private int field1490 = 8;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "I")
    private int field1504 = 4;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    private int field1502 = 204;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field1488 = 0;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field1500 = -1;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "Lvv;")
    public static class313 field1494 = new class313(95, 8);

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "[I")
    private int[] field1505;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "[[I")
    private int[][] field1487;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "[[I")
    private int[][] field1491;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V", line = 5)
    private final void method630(int arg0) {
        ++field1498;
        Random var2 = new Random((long) this.field1490);
        this.field1489 = this.field1499 / 2;
        this.field1501 = 4096 / this.field1504;
        this.field1495 = 4096 / this.field1490;
        int var3 = this.field1501 / 2;
        int var4 = this.field1495 / 2;
        this.field1505 = new int[this.field1490 - -1];
        this.field1487 = new int[this.field1490][this.field1504 + 1];
        this.field1491 = new int[this.field1490][this.field1504];
        this.field1505[0] = 0;
        if (arg0 != 7923) {
            this.method75(25, (byte) 109);
        }
        for (int var5 = 0; ~this.field1490 < ~var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field1495;
                int var7 = (class235.method1620(var2, 4096, false) - 2048) * this.field1502 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1505[var5] = this.field1505[var5 + -1] + var8;
            }
            this.field1487[var5][0] = 0;
            for (int var9 = 0; ~this.field1504 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1501;
                    int var11 = (class235.method1620(var2, 4096, false) + -2048) * this.field1496 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1487[var5][var9] = this.field1487[var5][var9 + -1] - -var12;
                }
                this.field1491[var5][var9] = ~this.field1486 < -1 ? -class235.method1620(var2, this.field1486, false) + 4096 : 4096;
            }
            this.field1487[var5][this.field1504] = 4096;
        }
        this.field1505[this.field1490] = 4096;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 70)
    public class90() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)V", line = 80)
    public static void method631(boolean arg0) {
        field1494 = null;
        if (!arg0) {
            method631(false);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[I", line = 94)
    public final int[] method75(int arg0, byte arg1) {
        ++field1492;
        int var3 = 115 % ((arg1 - 43) / 48);
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int var5 = 0;
            int var6;
            for (var6 = class412.field6233[arg0] + this.field1493; var6 < 0; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (var5 < this.field1490 && ~this.field1505[var5] >= ~var6) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = (1 & var5) == 0;
            int var9 = this.field1505[var5];
            int var10 = this.field1505[var5 + -1];
            if (~var6 < ~(this.field1489 + var10) && var6 < -this.field1489 + var9) {
                for (int var11 = 0; class402.field6113 > var11; ++var11) {
                    int var12 = var8 ? this.field1497 : -this.field1497;
                    int var13 = 0;
                    int var14;
                    for (var14 = (this.field1501 * var12 >> 12) + class276.field4540[var11]; var14 < 0; var14 += 4096) {
                    }
                    while (~var14 < -4097) {
                        var14 -= 4096;
                    }
                    while (this.field1504 > var13 && ~var14 <= ~this.field1487[var7][var13]) {
                        ++var13;
                    }
                    int var15 = var13 + -1;
                    int var16 = this.field1487[var7][var15];
                    int var17 = this.field1487[var7][var13];
                    if (~(this.field1489 + var16) > ~var14 && var14 < -this.field1489 + var17) {
                        var4[var11] = this.field1491[var7][var15];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class85.method607(var4, 0, class402.field6113, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V", line = 204)
    public final void method74(int arg0) {
        if (arg0 == 12388) {
            this.method630(7923);
            ++field1503;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILia;)V", line = 221)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (!arg0) {
            this.method71(false, 76, (class23) null);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 == -8) {
                                        this.field1486 = arg2.method132(96);
                                    }
                                } else {
                                    this.field1499 = arg2.method132(43);
                                }
                            } else {
                                this.field1493 = arg2.method132(25);
                            }
                        } else {
                            this.field1497 = arg2.method132(116);
                        }
                    } else {
                        this.field1502 = arg2.method132(96);
                    }
                } else {
                    this.field1496 = arg2.method132(55);
                }
            } else {
                this.field1490 = arg2.method126((byte) -72);
            }
        } else {
            this.field1504 = arg2.method126((byte) -124);
        }
        ++field1506;
    }
}
