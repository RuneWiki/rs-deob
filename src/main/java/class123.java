import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class123 extends class268 {

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Z")
    private boolean field1723 = false;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    private int field1709 = -1;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Lge;")
    private class72 field1719 = null;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    private int field1727 = -32768;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    private int field1720 = -1;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    private int field1708;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    private int field1735;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    private int field1725;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    private int field1732;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lgj;")
    private class240 field1712;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    private int field1706;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    private int field1721;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "[I")
    public static int[] field1728 = new int[14];

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1733 = "glow2:";

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "[I")
    public static int[] field1713 = new int[100];

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Lnl;")
    private class97 field1714;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "[[[B")
    public static byte[][][] field1716;

    @OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1737++;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lsa;")
    public final class268 method805(int arg0) {
        if (arg0 != 100) {
            this.method120(95, 38, -47, 100, -30, 121, 100, 10, -87L, -35, (class97) null);
        }
        field1731++;
        return this.method808((byte) -6, false);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lhc;Ljava/lang/String;B)Lwl;")
    public static final class172 method806(class235 arg0, String arg1, byte arg2) {
        int var3 = arg0.method1568(arg1, -7551);
        field1734++;
        if (var3 == -1) {
            return new class172(0);
        }
        int[] var4 = arg0.method1567((byte) 119, var3);
        class172 var5 = new class172(var4.length);
        for (int var6 = 0; var6 < var5.field2393; var6++) {
            class224 var7 = new class224(arg0.method1576(-115, var3, var4[var6]));
            var5.field2395[var6] = var7.method1455(class283.method1897(arg2, 18));
            var5.field2392[var6] = var7.method1437((byte) -121);
            var5.field2386[var6] = var7.method1483((byte) 46);
            var5.field2394[var6] = var7.method1483((byte) 46);
        }
        return arg2 == 104 ? var5 : null;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public static void method807(int arg0) {
        field1728 = null;
        field1716 = null;
        if (arg0 == 0) {
            field1713 = null;
            field1733 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
    public final void method170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method812((byte) 115, arg4, arg3);
        field1710++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()I")
    public final int method106() {
        field1722++;
        return this.field1727;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIJILnl;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class97 arg10) {
        field1707++;
        class268 var13 = this.method805(100);
        if (var13 != null) {
            var13.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1714);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BZ)Lsa;")
    private final class268 method808(byte arg0, boolean arg1) {
        boolean var3 = class200.field2788 != class137.field1924;
        field1729++;
        class111 var4 = class76.method489(this.field1725, arg0 + 39);
        int var5 = var4.field1559;
        if (var4.field1597 != null) {
            var4 = var4.method726((byte) -116);
        }
        if (var4 == null) {
            return null;
        }
        if (class124.field1746 != 0 && this.field1723 && (this.field1712 == null || this.field1712 != null && this.field1712.field3676 != var4.field1559)) {
            int var6 = var4.field1559;
            if (var4.field1559 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field1712 = null;
            } else {
                this.field1712 = class132.method905(true, var6);
            }
            if (this.field1712 != null) {
                if (var4.field1585 && this.field1712.field3682 != -1) {
                    this.field1706 = (int) ((double) this.field1712.field3665.length * Math.random());
                    this.field1721 -= (int) (Math.random() * (double) this.field1712.field3673[this.field1706]);
                } else {
                    this.field1706 = 0;
                    this.field1721 = class52.field740 - 1;
                }
            }
        }
        if (arg0 != -6) {
            this.field1721 = -85;
        }
        int var7 = this.field1732 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field1598;
            var9 = var4.field1582;
        } else {
            var8 = var4.field1582;
            var9 = var4.field1598;
        }
        int var10 = (var8 >> 1) + this.field1735;
        int var11 = (var9 >> 1) + this.field1738;
        int var12 = (var8 + 1 >> 1) + this.field1735;
        int var13 = this.field1738 + (var9 + 1 >> 1);
        this.method812((byte) 115, var11 * 128, var10 * 128);
        boolean var14 = !var3 && var4.field1610 && (this.field1709 != var4.field1579 || (this.field1720 != this.field1706 || this.field1712 != null && (this.field1712.field3675 || class169.field2350) && this.field1730 != this.field1706) && class213.field3211 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class200.field2788[this.field1708];
        int var16 = var15[var10][var11] + var15[var10][var13] + var15[var12][var13] + var15[var12][var11] >> 2;
        int var17 = (this.field1738 << 7) + (var9 << 6);
        int var18 = (this.field1735 << 7) + (var8 << 6);
        int[][] var19 = null;
        boolean var20 = this.field1719 == null;
        if (var3) {
            var19 = class137.field1924[0];
        } else if (this.field1708 < 3) {
            var19 = class200.field2788[this.field1708 + 1];
        }
        class120 var21;
        if (this.field1712 == null) {
            var21 = var4.method723(this.field1736, false, var15, var20 ? class213.field3200 : this.field1719, var16, this.field1732, var17, arg0 ^ 0x45, var18, var19, var14);
        } else {
            var21 = var4.method727(var18, var19, this.field1718, var14, (byte) 96, var17, this.field1712, var15, this.field1736, this.field1706, var20 ? class213.field3200 : this.field1719, var16, this.field1730, this.field1732);
        }
        return var21 == null ? null : var21.field1686;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public static final int method809(int arg0, int arg1) {
        field1726++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg0 != -18779) {
            return 93;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I")
    public static final int method810(int arg0) {
        field1724++;
        if (arg0 > -95) {
            method810(109);
        }
        return 6;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)V")
    public static final void method811(int arg0, int arg1, int arg2) {
        if (class89.field1248 != arg2) {
            class215.field3231 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class215.field3231[var3] = (var3 << 12) / arg2;
            }
            class224.field3337 = arg2 * 32;
            class173.field2411 = arg2 - 1;
            class89.field1248 = arg2;
        }
        if (arg0 != -1) {
            method810(-97);
        }
        field1717++;
        if (class62.field861 == arg1) {
            return;
        }
        if (class89.field1248 == arg1) {
            class127.field1794 = class215.field3231;
        } else {
            class127.field1794 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class127.field1794[var4] = (var4 << 12) / arg1;
            }
        }
        class62.field861 = arg1;
        class17.field184 = arg1 - 1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BII)V")
    private final void method812(byte arg0, int arg1, int arg2) {
        field1715++;
        if (arg0 != 115) {
            method809(-53, 124);
        }
        if (this.field1712 == null) {
            return;
        }
        int var4 = class52.field740 - this.field1721;
        if (var4 > 100 && this.field1712.field3682 > 0) {
            int var5 = this.field1712.field3665.length - this.field1712.field3682;
            while (this.field1706 < var5 && var4 > this.field1712.field3673[this.field1706]) {
                var4 -= this.field1712.field3673[this.field1706];
                this.field1706++;
            }
            if (var5 <= this.field1706) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field1712.field3665.length; var7++) {
                    var6 += this.field1712.field3673[var7];
                }
                var4 %= var6;
            }
            this.field1730 = this.field1706 + 1;
            if (this.field1712.field3665.length <= this.field1730) {
                this.field1730 -= this.field1712.field3682;
                if (this.field1730 < 0 || this.field1730 >= this.field1712.field3665.length) {
                    this.field1730 = -1;
                }
            }
        }
        while (var4 > this.field1712.field3673[this.field1706]) {
            class116.method781(arg1, 236, arg2, false, this.field1706, this.field1712);
            var4 -= this.field1712.field3673[this.field1706];
            this.field1706++;
            if (this.field1706 >= this.field1712.field3665.length) {
                this.field1706 -= this.field1712.field3682;
                if (this.field1706 < 0 || this.field1706 >= this.field1712.field3665.length) {
                    this.field1712 = null;
                    break;
                }
            }
            this.field1730 = this.field1706 + 1;
            if (this.field1712.field3665.length <= this.field1730) {
                this.field1730 -= this.field1712.field3682;
                if (this.field1730 < 0 || this.field1730 >= this.field1712.field3665.length) {
                    this.field1730 = -1;
                }
            }
        }
        this.field1721 = class52.field740 - var4;
        this.field1718 = var4;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(IIIIIIIZLsa;)V")
    public class123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class268 arg8) {
        this.field1708 = arg3;
        this.field1738 = arg5;
        this.field1735 = arg4;
        this.field1725 = arg0;
        this.field1736 = arg1;
        this.field1732 = arg2;
        if (arg6 != -1) {
            this.field1712 = class132.method905(true, arg6);
            this.field1706 = 0;
            if (this.field1712.field3665.length > 1) {
                this.field1730 = 1;
            } else {
                this.field1730 = 0;
            }
            this.field1721 = class52.field740 - 1;
            this.field1718 = 1;
            if (this.field1712.field3674 == 0 && arg8 != null && arg8 instanceof class123) {
                class123 var10 = (class123) arg8;
                if (this.field1712 == var10.field1712) {
                    this.field1730 = var10.field1730;
                    this.field1721 = var10.field1721;
                    this.field1718 = var10.field1718;
                    this.field1706 = var10.field1706;
                    return;
                }
            }
            if (arg7 && this.field1712.field3682 != -1) {
                this.field1706 = (int) ((double) this.field1712.field3665.length * Math.random());
                this.field1730 = this.field1706 + 1;
                if (this.field1712.field3665.length <= this.field1730) {
                    this.field1730 -= this.field1712.field3682;
                    if (this.field1730 < 0 || this.field1730 >= this.field1712.field3665.length) {
                        this.field1730 = -1;
                    }
                }
                this.field1718 = ((int) (Math.random() * (double) this.field1712.field3673[this.field1706])) + 1;
                this.field1721 = class52.field740 - this.field1718;
            }
        }
        if (arg8 == null) {
            class111 var11 = class76.method489(this.field1725, 42);
            if (var11.field1597 != null) {
                this.field1723 = true;
                return;
            }
        }
    }
}
