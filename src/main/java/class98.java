import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class98 extends class117 {

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    private int field1563 = 1024;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    private int field1565 = 8;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    private int field1572 = 204;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    private int field1575 = 409;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    private int field1578 = 81;

    @OriginalMember(owner = "client!s", name = "ab", descriptor = "I")
    private int field1580 = 0;

    @OriginalMember(owner = "client!s", name = "bb", descriptor = "I")
    private int field1581 = 1024;

    @OriginalMember(owner = "client!s", name = "db", descriptor = "I")
    private int field1583 = 4;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1568 = " from your friend list first.";

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field1567 = -1;

    @OriginalMember(owner = "client!s", name = "fb", descriptor = "I")
    public static int field1585 = 0;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    private int field1569;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!s", name = "cb", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!s", name = "eb", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!s", name = "gb", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!s", name = "Z", descriptor = "Ldk;")
    public static class251 field1579;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "[I")
    private int[] field1577;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "[[I")
    private int[][] field1562;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "[[I")
    private int[][] field1574;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "(I)V")
    private final void method670(int arg0) {
        ++field1571;
        Random var2 = new Random((long) this.field1565);
        this.field1586 = 4096 / this.field1565;
        this.field1577 = new int[this.field1565 + 1];
        this.field1569 = this.field1578 / 2;
        this.field1562 = new int[this.field1565][this.field1583];
        int var3 = this.field1586 / 2;
        this.field1577[0] = 0;
        this.field1574 = new int[this.field1565][this.field1583 + 1];
        this.field1570 = 4096 / this.field1583;
        if (arg0 != -1612016788) {
            this.method64(99);
        }
        int var4 = this.field1570 / 2;
        for (int var5 = 0; ~this.field1565 < ~var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1586;
                int var7 = (-2048 + class67.method469(0, 4096, var2)) * this.field1572 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field1577[var5] = this.field1577[var5 - 1] + var8;
            }
            this.field1574[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field1583; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1570;
                    int var11 = (-2048 + class67.method469(0, 4096, var2)) * this.field1575 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field1574[var5][var9] = this.field1574[var5][var9 + -1] + var12;
                }
                this.field1562[var5][var9] = this.field1581 > 0 ? 4096 + -class67.method469(0, this.field1581, var2) : 4096;
            }
            this.field1574[var5][this.field1583] = 4096;
        }
        this.field1577[this.field1565] = 4096;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = super.field1883.method531(arg1, (byte) 78);
        if (arg0 != 2) {
            this.method670(95);
        }
        if (super.field1883.field1313) {
            int var4 = 0;
            int var5;
            for (var5 = class173.field2835[arg1] + this.field1580; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field1565 > var4 && ~this.field1577[var4] >= ~var5) {
                ++var4;
            }
            int var6 = this.field1577[var4];
            int var7 = var4 + -1;
            int var8 = this.field1577[var4 + -1];
            boolean var9 = (1 & var4) == 0;
            if (~(var8 - -this.field1569) > ~var5 && var5 < var6 - this.field1569) {
                for (int var10 = 0; class168.field2737 > var10; ++var10) {
                    int var11 = !var9 ? -this.field1563 : this.field1563;
                    int var12;
                    for (var12 = (this.field1570 * var11 >> 12) + class243.field3869[var10]; ~var12 > -1; var12 += 4096) {
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    int var13;
                    for (var13 = 0; ~this.field1583 < ~var13 && this.field1574[var7][var13] <= var12; ++var13) {
                    }
                    int var14 = var13 + -1;
                    int var15 = this.field1574[var7][var14];
                    int var16 = this.field1574[var7][var13];
                    if (~(var15 - -this.field1569) > ~var12 && ~var12 > ~(-this.field1569 + var16)) {
                        var3[var10] = this.field1562[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class157.method1070(var3, 0, class168.field2737, 0);
            }
        }
        ++field1576;
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field1564;
        if (arg1 != 255) {
            this.field1563 = 113;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field1581 = arg0.method1142(-18970);
                                    }
                                } else {
                                    this.field1578 = arg0.method1142(arg1 + -19225);
                                }
                            } else {
                                this.field1580 = arg0.method1142(arg1 + -19225);
                            }
                        } else {
                            this.field1563 = arg0.method1142(-18970);
                        }
                    } else {
                        this.field1572 = arg0.method1142(-18970);
                    }
                } else {
                    this.field1575 = arg0.method1142(-18970);
                }
            } else {
                this.field1565 = arg0.method1133((byte) 53);
            }
        } else {
            this.field1583 = arg0.method1133((byte) 53);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
    public static void method671(byte arg0) {
        field1579 = null;
        if (arg0 == 32) {
            field1568 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (arg0 != 1) {
            field1585 = -12;
        }
        ++field1566;
        this.method670(-1612016788);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(II)I")
    public static int method672(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }
}
