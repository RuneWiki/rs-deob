import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class101 extends class51 {

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    private int field1801 = -1;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Z")
    private boolean field1806 = true;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    private int field1802 = -1;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    private int field1819 = -32768;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Lel;")
    private class232 field1820 = null;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    private int field1798 = 0;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    private int field1814 = 0;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    private int field1817 = 0;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    private int field1799;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    private int field1816;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    private int field1797;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    private int field1821;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    private int field1812;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    private int field1818;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lkd;")
    private class117 field1804;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    private int field1822;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    private int field1815;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Z")
    public static boolean field1803 = false;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "Lke;")
    public static class256 field1796 = class316.method2202("Lade Titelbild )2 ", 27626);

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "Lke;")
    public static class256 field1810 = class316.method2202("d-Broulement:", 27626);

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "J")
    public static volatile long field1824 = 0L;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "Lfk;")
    private class283 field1811;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 18)
    public final void method725(boolean arg0) {
        if (this.field1820 != null) {
            class123.method847(this.field1820, this.field1798, this.field1817, this.field1814);
        }
        field1827++;
        if (arg0) {
            field1796 = (class256) null;
        }
        this.field1802 = -1;
        this.field1801 = -1;
        this.field1820 = null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 35)
    public static void method726(int arg0) {
        field1796 = null;
        field1810 = null;
        if (arg0 != 1) {
            field1824 = 43L;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V", line = 50)
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1809++;
        if (class253.field4323) {
            this.method729(true, -2);
        } else {
            this.method730(6430, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(IIIIIIIZLmc;)V", line = 594)
    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class51 arg8) {
        this.field1799 = arg0;
        this.field1816 = arg3;
        this.field1797 = arg2;
        this.field1821 = arg5;
        this.field1812 = arg4;
        this.field1818 = arg1;
        if (class253.field4323 && arg8 != null) {
            if (arg8 instanceof class101) {
                ((class101) arg8).method725(false);
            } else {
                class273 var10 = class271.method1871(122, this.field1799);
                if (var10.field4664 != null) {
                    var10 = var10.method1887(-73);
                }
                if (var10 != null) {
                    class203.method1442(0, var10, this.field1797, this.field1818, 63, 0, this.field1821, this.field1812, this.field1816);
                }
            }
        }
        if (arg6 != -1) {
            this.field1804 = class250.method1682(arg6, true);
            this.field1822 = 0;
            this.field1815 = class45.field840 - 1;
            if (this.field1804.field2062 == 0 && arg8 != null && arg8 instanceof class101) {
                class101 var11 = (class101) arg8;
                if (this.field1804 == var11.field1804) {
                    this.field1822 = var11.field1822;
                    this.field1815 = var11.field1815;
                    return;
                }
            }
            if (arg7 && this.field1804.field2044 != -1) {
                this.field1822 = (int) (Math.random() * (double) this.field1804.field2040.length);
                this.field1815 -= (int) ((double) this.field1804.field2064[this.field1822] * Math.random());
            }
        }
        if (class253.field4323 && arg8 != null) {
            this.method729(true, -2);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIIIIJILfk;)V", line = 79)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class283 arg10) {
        field1828++;
        class51 var13 = this.method733(true);
        if (var13 != null) {
            var13.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1811);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)V", line = 94)
    public static final void method727(int arg0, int arg1, int arg2) {
        field1805++;
        class52.field959 = class163.field2889[arg1][arg2].field1100;
        class225.field3920 = class163.field2889[arg1][arg2].field1097;
        if (arg0 >= -43) {
            method728(-115, (class4) null, -57, -105, 94, -45);
        }
        class130.field2278 = class163.field2889[arg1][arg2].field1101;
        class169.method1230((float) class52.field959, (float) class225.field3920, (float) class130.field2278);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILff;IIII)Ljava/awt/Frame;", line = 116)
    public static final Frame method728(int arg0, class4 arg1, int arg2, int arg3, int arg4, int arg5) {
        field1808++;
        if (!arg1.method19(125)) {
            return null;
        }
        if (arg2 == 0) {
            class317[] var6 = class148.method1076(arg1, -1124806526);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field5462 == arg4 && var6[var8].field5465 == arg5 && (arg3 == 0 || var6[var8].field5464 == arg3) && (!var7 || arg2 < var6[var8].field5457)) {
                    var7 = true;
                    arg2 = var6[var8].field5457;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class82 var9 = arg1.method27(arg2, arg3, arg5, arg4, false);
        while (var9.field1500 == 0) {
            class46.method381(10L, -122);
        }
        Frame var10 = (Frame) var9.field1499;
        int var11 = -35 % ((45 - arg0) / 32);
        if (var10 == null) {
            return null;
        } else if (var9.field1500 == 2) {
            class51.method405(arg1, var10, -4);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)Lmc;", line = 187)
    private final class51 method729(boolean arg0, int arg1) {
        field1826++;
        boolean var3 = class72.field1329 != class118.field2090;
        class273 var4 = class271.method1871(126, this.field1799);
        if (var4.field4664 != null) {
            var4 = var4.method1887(-73);
        }
        if (var4 == null) {
            if (class253.field4323 && !var3) {
                this.method725(false);
            }
            return null;
        }
        int var5 = this.field1797 & 0x3;
        int var6;
        int var7;
        if (~var5 == arg1 || var5 == 3) {
            var7 = var4.field4711;
            var6 = var4.field4662;
        } else {
            var6 = var4.field4711;
            var7 = var4.field4662;
        }
        int var8 = (var7 >> 1) + this.field1812;
        int var9 = (var7 + 1 >> 1) + this.field1812;
        int var10 = (var6 >> 1) + this.field1821;
        int var11 = (var6 + 1 >> 1) + this.field1821;
        this.method730(6430, var8 * 128, var10 * 128);
        boolean var12 = !var3 && var4.field4714 && (this.field1802 != var4.field4684 || this.field1822 != this.field1801 && class17.field241 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class118.field2090[this.field1816];
        int var14 = var13[var8][var10] + var13[var9][var10] + var13[var8][var11] + var13[var9][var11] >> 2;
        int var15 = (this.field1812 << 7) + (var7 << 6);
        int[][] var16 = (int[][]) null;
        if (var3) {
            var16 = class72.field1329[0];
        } else if (this.field1816 < 3) {
            var16 = class118.field2090[this.field1816 + 1];
        }
        int var17 = (this.field1821 << 7) + (var6 << 6);
        if (class253.field4323 && var12) {
            class123.method847(this.field1820, this.field1798, this.field1817, this.field1814);
        }
        boolean var18 = this.field1820 == null;
        class196 var19;
        if (this.field1804 == null) {
            var19 = var4.method1882(false, var12, var18 ? class237.field4035 : this.field1820, var16, var17, var15, false, var14, this.field1818, var13, this.field1797);
        } else {
            var19 = var4.method1888(var12, var14, this.field1797, var15, this.field1822, var13, this.field1818, var16, var17, var18 ? class237.field4035 : this.field1820, this.field1804, 15519);
        }
        if (var19 == null) {
            return null;
        }
        if (class253.field4323 && var12) {
            if (var18) {
                class237.field4035 = var19.field3595;
            }
            int var20 = 0;
            if (this.field1816 != 0) {
                int[][] var21 = class118.field2090[0];
                var20 = var14 - (var21[var9][var10] + var21[var9][var11] + var21[var8][var10] + var21[var8][var11] >> 2);
            }
            class232 var22 = var19.field3595;
            if (this.field1806 && class123.method850(var22, var15, var20, var17)) {
                this.field1806 = false;
            }
            if (!this.field1806) {
                class123.method841(var22, var15, var20, var17);
                this.field1820 = var22;
                this.field1798 = var15;
                this.field1817 = var20;
                this.field1814 = var17;
                if (var18) {
                    class237.field4035 = null;
                }
            }
            this.field1801 = this.field1822;
            this.field1802 = var4.field4684;
        }
        return var19.field3589;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(III)V", line = 318)
    private final void method730(int arg0, int arg1, int arg2) {
        if (this.field1804 != null) {
            int var4 = class45.field840 - this.field1815;
            if (var4 > 100 && this.field1804.field2044 > 0) {
                int var5 = this.field1804.field2040.length - this.field1804.field2044;
                while (this.field1822 < var5 && this.field1804.field2064[this.field1822] < var4) {
                    var4 -= this.field1804.field2064[this.field1822];
                    this.field1822++;
                }
                if (var5 <= this.field1822) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1804.field2040.length; var7++) {
                        var6 += this.field1804.field2064[var7];
                    }
                    var4 %= var6;
                }
            }
            label64: {
                do {
                    do {
                        if (var4 <= this.field1804.field2064[this.field1822]) {
                            break label64;
                        }
                        class49.method391(arg1, false, arg2, this.field1822, this.field1804, -11067);
                        var4 -= this.field1804.field2064[this.field1822];
                        this.field1822++;
                    } while (this.field1822 < this.field1804.field2040.length);
                    this.field1822 -= this.field1804.field2044;
                } while (this.field1822 >= 0 && this.field1804.field2040.length > this.field1822);
                this.field1804 = null;
            }
            this.field1815 = class45.field840 - var4;
        }
        if (arg0 == 6430) {
            field1813++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIZ)I", line = 387)
    public static final int method731(int arg0, int arg1, int arg2, boolean arg3) {
        field1823++;
        if (arg3) {
            return arg2 <= arg1 ? (arg1 > arg0 ? arg0 : arg1) : arg2;
        } else {
            return 73;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "()I", line = 400)
    public final int method154() {
        field1825++;
        return this.field1819;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(III)Z", line = 415)
    public static final boolean method732(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class237.field4040; var3++) {
            class171 var4 = class204.field3708[var3];
            if (var4.field3041 == 1) {
                int var5 = var4.field3030 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3026 * var5 >> 8) + var4.field3049;
                    int var7 = (var4.field3048 * var5 >> 8) + var4.field3047;
                    int var8 = (var4.field3046 * var5 >> 8) + var4.field3040;
                    int var9 = (var4.field3037 * var5 >> 8) + var4.field3031;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3041 == 2) {
                int var10 = arg0 - var4.field3030;
                if (var10 > 0) {
                    int var11 = (var4.field3026 * var10 >> 8) + var4.field3049;
                    int var12 = (var4.field3048 * var10 >> 8) + var4.field3047;
                    int var13 = (var4.field3046 * var10 >> 8) + var4.field3040;
                    int var14 = (var4.field3037 * var10 >> 8) + var4.field3031;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3041 == 3) {
                int var15 = var4.field3049 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3028 * var15 >> 8) + var4.field3030;
                    int var17 = (var4.field3033 * var15 >> 8) + var4.field3039;
                    int var18 = (var4.field3046 * var15 >> 8) + var4.field3040;
                    int var19 = (var4.field3037 * var15 >> 8) + var4.field3031;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3041 == 4) {
                int var20 = arg2 - var4.field3049;
                if (var20 > 0) {
                    int var21 = (var4.field3028 * var20 >> 8) + var4.field3030;
                    int var22 = (var4.field3033 * var20 >> 8) + var4.field3039;
                    int var23 = (var4.field3046 * var20 >> 8) + var4.field3040;
                    int var24 = (var4.field3037 * var20 >> 8) + var4.field3031;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3041 == 5) {
                int var25 = arg1 - var4.field3040;
                if (var25 > 0) {
                    int var26 = (var4.field3028 * var25 >> 8) + var4.field3030;
                    int var27 = (var4.field3033 * var25 >> 8) + var4.field3039;
                    int var28 = (var4.field3026 * var25 >> 8) + var4.field3049;
                    int var29 = (var4.field3048 * var25 >> 8) + var4.field3047;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V", line = 559)
    protected final void finalize() {
        field1800++;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)Lmc;", line = 572)
    private final class51 method733(boolean arg0) {
        if (!arg0) {
            this.field1802 = 119;
        }
        field1807++;
        return this.method729(false, -2);
    }
}
