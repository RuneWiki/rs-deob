import java.awt.Graphics;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class117 extends class144 {

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    private int field1633 = 81;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
    private int field1639 = 8;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    private int field1634 = 1024;

    @OriginalMember(owner = "client!aj", name = "Z", descriptor = "I")
    private int field1648 = 0;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    private int field1632 = 409;

    @OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
    private int field1643 = 204;

    @OriginalMember(owner = "client!aj", name = "hb", descriptor = "I")
    private int field1656 = 1024;

    @OriginalMember(owner = "client!aj", name = "jb", descriptor = "I")
    private int field1658 = 4;

    @OriginalMember(owner = "client!aj", name = "T", descriptor = "Z")
    public static boolean field1642 = false;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    private int field1636;

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!aj", name = "bb", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!aj", name = "cb", descriptor = "I")
    private int field1651;

    @OriginalMember(owner = "client!aj", name = "eb", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!aj", name = "fb", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!aj", name = "gb", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!aj", name = "ib", descriptor = "I")
    private int field1657;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "Ltb;")
    public static class185 field1637;

    @OriginalMember(owner = "client!aj", name = "W", descriptor = "Lbc;")
    public static class282 field1645;

    @OriginalMember(owner = "client!aj", name = "db", descriptor = "[I")
    private int[] field1652;

    @OriginalMember(owner = "client!aj", name = "R", descriptor = "[[I")
    private int[][] field1640;

    @OriginalMember(owner = "client!aj", name = "X", descriptor = "[[I")
    private int[][] field1646;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field1656 = arg1.method1380(true);
                                    }
                                } else {
                                    this.field1633 = arg1.method1380(true);
                                }
                            } else {
                                this.field1648 = arg1.method1380(true);
                            }
                        } else {
                            this.field1634 = arg1.method1380(true);
                        }
                    } else {
                        this.field1643 = arg1.method1380(true);
                    }
                } else {
                    this.field1632 = arg1.method1380(true);
                }
            } else {
                this.field1639 = arg1.method1407(arg2 + -20522);
            }
        } else {
            this.field1658 = arg1.method1407(123);
        }
        ++field1649;
        if (arg2 != 20630) {
            this.field1640 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lag;")
    public static final class197 method752(Throwable arg0, String arg1) {
        ++field1638;
        class197 var2;
        if (arg0 instanceof class197) {
            var2 = (class197) arg0;
            var2.field2803 = var2.field2803 + ' ' + arg1;
        } else {
            var2 = new class197(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lbc;I)V")
    public static final void method753(class282 arg0, int arg1) {
        class97.field1294 = arg0;
        if (arg1 < -116) {
            ++field1641;
            class48.field554 = class97.field1294.method1874((byte) 18, 16);
        }
    }

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "(I)V")
    private final void method754(int arg0) {
        ++field1647;
        Random var2 = new Random((long) this.field1639);
        this.field1640 = new int[this.field1639][this.field1658 - -1];
        this.field1651 = 4096 / this.field1658;
        this.field1646 = new int[this.field1639][this.field1658];
        this.field1657 = 4096 / this.field1639;
        this.field1636 = this.field1633 / 2;
        this.field1652 = new int[this.field1639 - -1];
        int var3 = this.field1651 / 2;
        this.field1652[0] = 0;
        int var4 = this.field1657 / 2;
        int var5 = 0;
        if (arg0 == 29603) {
            while (~this.field1639 < ~var5) {
                if (var5 > 0) {
                    int var6 = this.field1657;
                    int var7 = (class198.method1277((byte) 37, 4096, var2) + -2048) * this.field1643 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field1652[var5] = this.field1652[var5 + -1] - -var8;
                }
                this.field1640[var5][0] = 0;
                for (int var9 = 0; this.field1658 > var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field1651;
                        int var11 = (class198.method1277((byte) 37, 4096, var2) + -2048) * this.field1632 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field1640[var5][var9] = this.field1640[var5][var9 + -1] + var12;
                    }
                    this.field1646[var5][var9] = ~this.field1656 >= -1 ? 4096 : 4096 + -class198.method1277((byte) 37, this.field1656, var2);
                }
                this.field1640[var5][this.field1658] = 4096;
                ++var5;
            }
            this.field1652[this.field1639] = 4096;
        }
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        this.method754(29603);
        ++field1631;
        if (arg0 > -109) {
            this.field1646 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field1644;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int var4 = 0;
            int var5;
            for (var5 = class143.field2045[arg0] + this.field1648; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field1639 && ~this.field1652[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field1652[var4];
            int var9 = this.field1652[var4 + -1];
            if (~(this.field1636 + var9) > ~var5 && ~(-this.field1636 + var8) < ~var5) {
                for (int var10 = 0; class104.field1411 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field1634 : -this.field1634;
                    int var13;
                    for (var13 = class87.field1178[var10] - -(this.field1651 * var12 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field1658 && var13 >= this.field1640[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field1640[var6][var14];
                    int var16 = this.field1640[var6][var11];
                    if (var13 > var15 - -this.field1636 && ~(-this.field1636 + var16) < ~var13) {
                        var3[var10] = this.field1646[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class194.method1261(var3, 0, class104.field1411, 0);
            }
        }
        if (arg1 != 255) {
            this.method12(45, 40);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method755(int arg0, boolean arg1, String arg2) {
        ++field1635;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = 6 - -var3;
        int var6 = class204.field2904.method520(arg2, 250);
        int var7 = 13 * class204.field2904.method544(arg2, 250);
        class155.method1018(var4 - var3, -var3 + var5, var3 + var6 - -var3, var3 + var7 + var3, 0);
        class155.method1020(-var3 + var4, -var3 + var5, var3 + var6 + var3, var3 + var7 - -var3, arg0);
        class204.field2904.method526(arg2, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class9.method66(var3 + var6 + var3, var3 + var7 + var3, -var3 + var4, -35, -var3 + var5);
        if (!arg1) {
            class220.method1433(arg0 + -16777215, var7, var6, var4, var5);
        } else {
            try {
                Graphics var8 = class181.field2574.getGraphics();
                class74.field890.method149(0, 0, var8, -117);
            } catch (Exception var9) {
                class181.field2574.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(II)V")
    public static final void method756(int arg0, int arg1) {
        ++field1655;
        if (arg0 > -41) {
            method757(-67);
        }
        class234.field3376.method62(-17, arg1);
    }

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "(I)V")
    public static void method757(int arg0) {
        field1645 = null;
        field1637 = null;
        if (arg0 != 409) {
            method756(-84, 53);
        }
    }
}
