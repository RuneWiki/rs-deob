import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class500 {

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    private int field6788 = 0;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Z")
    private boolean field6791 = false;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    private int field6798 = -1;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "Z")
    private boolean field6819 = false;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    private int field6812 = -1;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    private int field6811 = 0;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    private int field6822 = -1;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "B")
    private byte field6801;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "Lvv;")
    private class295 field6809;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public int field6800;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public int field6804;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "B")
    private byte field6796;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public int field6799;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "Z")
    private boolean field6817;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "Z")
    public static boolean field6795 = false;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    private int field6789;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field6794;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    private int field6806;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    private int field6816;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    private int field6818;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "Lks;")
    private class403 field6813;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "Lha;")
    private class54 field6824;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Lda;")
    private class55 field6803;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Loa;")
    public class646 field6790;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "[Z")
    private boolean[] field6823;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILvv;)V")
    private final void method2800(int arg0, class295 arg1) {
        if (arg0 != 1) {
            return;
        }
        field6794++;
        label92: while (true) {
            if (this.field6813 == null) {
                if (this.field6791) {
                    return;
                }
                this.method2807(-1, -1);
                if (this.field6813 == null) {
                    return;
                }
            }
            int var3 = class186.field2697 - this.field6818;
            if (var3 > 100 && this.field6813.field5643 > 0) {
                int var4 = this.field6813.field5667.length - this.field6813.field5643;
                while (var4 > this.field6816 && this.field6813.field5646[this.field6816] < var3) {
                    var3 -= this.field6813.field5646[this.field6816];
                    this.field6816++;
                }
                if (var4 <= this.field6816) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field6813.field5667.length; var6++) {
                        var5 += this.field6813.field5646[var6];
                    }
                    var3 %= var5;
                }
                this.field6806 = this.field6816 + 1;
                if (this.field6806 >= this.field6813.field5667.length) {
                    this.field6806 -= this.field6813.field5643;
                    if (this.field6806 < 0 || this.field6813.field5667.length <= this.field6806) {
                        this.field6806 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field6813.field5646[this.field6816] >= var3) {
                            this.field6789 = var3;
                            this.field6818 = class186.field2697 - var3;
                            return;
                        }
                        class234.method1476(arg1, this.field6813, this.field6816, (byte) -7);
                        var3 -= this.field6813.field5646[this.field6816];
                        this.field6816++;
                        if (this.field6816 >= this.field6813.field5667.length) {
                            this.field6816 -= this.field6813.field5643;
                            if (this.field6816 < 0 || this.field6813.field5667.length <= this.field6816) {
                                this.field6813 = null;
                                continue label92;
                            }
                        }
                        this.field6806 = this.field6816 + 1;
                    } while (this.field6806 < this.field6813.field5667.length);
                    this.field6806 -= this.field6813.field5643;
                } while (this.field6806 >= 0 && this.field6806 < this.field6813.field5667.length);
                this.field6806 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lr;B)V")
    public final void method2801(class166 arg0, byte arg1) {
        field6792++;
        int var3 = -118 / ((arg1 + 46) / 63);
        this.method2804(true, -113, 262144, arg0, true);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)I")
    public final int method2802(int arg0) {
        if (arg0 != 0) {
            this.method2804(false, 22, 64, null, true);
        }
        field6802++;
        return this.field6788;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZILda;Lr;IILq;IZ)V")
    public final void method2803(boolean arg0, int arg1, class55 arg2, class166 arg3, int arg4, int arg5, class392 arg6, int arg7, boolean arg8) {
        field6821++;
        class369[] var10 = arg2.method451();
        class357[] var11 = arg2.method429();
        if (arg8) {
            this.field6813 = null;
        }
        if ((this.field6790 == null || this.field6790.field8923) && (var10 != null || var11 != null)) {
            class301 var12 = class475.field6543.method2685(this.field6800, -92);
            if (var12.field4113 != null) {
                var12 = var12.method1833(-105, class578.field8156);
            }
            if (var12 != null) {
                this.field6790 = class646.method3603(class186.field2697, true);
            }
        }
        if (this.field6790 == null) {
            return;
        }
        arg2.method460(arg6);
        if (arg0) {
            this.field6790.method3601(arg3, (long) class186.field2697, var10, var11, false);
        } else {
            this.field6790.method3605((long) class186.field2697);
        }
        this.field6790.method3610(this.field6796, arg5, arg4, arg1, arg7);
    }

    @OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field6805++;
        if (this.field6790 != null) {
            this.field6790.method3604();
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZIILr;Z)Lda;")
    public final class55 method2804(boolean arg0, int arg1, int arg2, class166 arg3, boolean arg4) {
        field6810++;
        class301 var6 = class475.field6543.method2685(this.field6800, -112);
        if (var6.field4113 != null) {
            var6 = var6.method1833(-113, class578.field8156);
        }
        if (var6 == null) {
            this.method2805(arg3, -108);
            this.field6798 = -1;
            this.field6822 = -1;
            this.field6812 = -1;
            return null;
        }
        if (!this.field6791 && this.field6812 != var6.field4131) {
            this.field6803 = null;
            this.method2807(-1, -1);
        }
        this.method2800(1, this.field6809);
        if (arg0) {
            boolean var7 = arg0 & this.field6817 & class366.field4875.method3770(class503.field6917, true) != 0;
            arg0 = var7 & (this.field6798 != var6.field4131 || this.field6813 != null && class366.field4875.method3770(class503.field6917, true) >= 2 && (this.field6822 != this.field6816 || (this.field6813.field5664 || class553.field7458) && this.field6816 != this.field6806));
        }
        if (arg4 && !arg0) {
            this.field6812 = var6.field4131;
            return null;
        }
        if (arg0) {
            class403.method2350(this.field6824, this.field6801, this.field6809.field4042, this.field6809.field4047, this.field6823);
            this.field6822 = -1;
            this.field6798 = -1;
        }
        int var8 = -126 / ((78 - arg1) / 38);
        class37 var9 = class409.field5812[this.field6801];
        class37 var10;
        if (this.field6819) {
            var10 = class497.field6766[0];
        } else {
            var10 = this.field6801 < 3 ? class409.field5812[this.field6801 + 1] : null;
        }
        class55 var11 = null;
        if (this.field6813 != null) {
            if (arg0) {
                arg2 |= 0x40000;
            }
            var11 = var6.method1823(this.field6799 == 11 ? this.field6804 + 4 : this.field6804, this.field6816, arg2, this.field6806, var9, var9.method331(this.field6809.field4047, (byte) 50, this.field6809.field4042), this.field6789, this.field6799 == 11 ? 10 : this.field6799, 3, this.field6809.field4042, this.field6809.field4047, var10, this.field6813, arg3);
            if (var11 == null) {
                this.field6811 = 0;
                this.field6823 = null;
                this.field6788 = 0;
                this.field6824 = null;
            } else {
                if (arg0) {
                    if (this.field6823 == null) {
                        this.field6823 = new boolean[4];
                    }
                    this.field6824 = var11.method414(this.field6824);
                    class482.method2706(this.field6824, this.field6801, this.field6809.field4042, this.field6809.field4047, this.field6823);
                    this.field6798 = var6.field4131;
                    this.field6822 = this.field6816;
                }
                this.field6811 = var11.method463();
                this.field6788 = var11.method426();
            }
            this.field6803 = null;
        } else if (this.field6803 != null && (this.field6803.method422() & arg2) == arg2 && this.field6812 == var6.field4131) {
            var11 = this.field6803;
        } else {
            if (this.field6803 != null) {
                arg2 |= this.field6803.method422();
            }
            class604 var12 = var6.method1826(this.field6809.field4042, 11553, this.field6809.field4047, var10, arg0, arg2, arg3, var9, this.field6799 == 11 ? 10 : this.field6799, var9.method331(this.field6809.field4047, (byte) 50, this.field6809.field4042), this.field6799 == 11 ? this.field6804 + 4 : this.field6804);
            if (var12 == null) {
                this.field6823 = null;
                this.field6811 = 0;
                this.field6803 = null;
                this.field6788 = 0;
                this.field6824 = null;
            } else {
                var11 = var12.field8408;
                this.field6803 = var12.field8408;
                if (arg0) {
                    this.field6824 = var12.field8406;
                    this.field6823 = null;
                    class482.method2706(this.field6824, this.field6801, this.field6809.field4042, this.field6809.field4047, null);
                    this.field6798 = var6.field4131;
                    this.field6822 = -1;
                }
                this.field6811 = var11.method463();
                this.field6788 = var11.method426();
            }
        }
        this.field6812 = var6.field4131;
        return var11;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lr;I)V")
    public final void method2805(class166 arg0, int arg1) {
        if (arg1 > -105) {
            return;
        }
        if (this.field6824 != null) {
            class403.method2350(this.field6824, this.field6801, this.field6809.field4042, this.field6809.field4047, this.field6823);
            this.field6824 = null;
            this.field6823 = null;
        }
        field6807++;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I")
    public final int method2806(int arg0) {
        if (arg0 >= -68) {
            this.method2804(false, -118, -34, null, true);
        }
        field6793++;
        return this.field6811;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
    private final void method2807(int arg0, int arg1) {
        field6820++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class301 var5 = class475.field6543.method2685(this.field6800, -61);
            class301 var6 = var5;
            if (var5.field4113 != null) {
                var5 = var5.method1833(-94, class578.field8156);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4141 != null) {
                if (this.field6813 != null && var5.method1836(arg1 ^ 0x16, this.field6813.field5658)) {
                    return;
                }
                var3 = var5.method1822(90);
                if (this.field6812 != var5.field4131) {
                    var4 = var5.field4158;
                }
            } else if (var5.field4173 == -1) {
                if (var6 != null && var6.field4141 != null) {
                    if (this.field6813 != null && var6.method1836(-50, this.field6813.field5658)) {
                        return;
                    }
                    var3 = var6.method1822(114);
                    if (this.field6812 != var6.field4131) {
                        var4 = var6.field4158;
                    }
                } else if (var6 != null && var6.field4173 != -1 && this.field6812 != var6.field4131) {
                    var3 = var6.field4173;
                    var4 = var6.field4158;
                }
            } else if (this.field6812 != var5.field4131) {
                var3 = var5.field4173;
                var4 = var5.field4158;
            }
        }
        if (var3 == -1) {
            this.field6813 = null;
            return;
        }
        this.field6803 = null;
        if (this.field6813 == null || this.field6813.field5658 != var3) {
            this.field6813 = class192.field2727.method3090(89, var3);
        } else if (this.field6813.field5660 == 0) {
            return;
        }
        if (this.field6813.field5667 == null) {
            this.field6813 = null;
            return;
        }
        if (var4) {
            this.field6816 = (int) ((double) this.field6813.field5667.length * Math.random());
            this.field6789 = ((int) (Math.random() * (double) this.field6813.field5646[this.field6816])) + 1;
        } else {
            this.field6816 = 0;
            this.field6789 = 1;
        }
        this.field6806 = this.field6816 + 1;
        if (~this.field6806 > arg1 || this.field6806 >= this.field6813.field5667.length) {
            this.field6806 = -1;
        }
        this.field6818 = class186.field2697 - this.field6789;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
    public final void method2808(int arg0, byte arg1) {
        this.field6791 = true;
        if (arg1 != 1) {
            this.field6790 = null;
        }
        field6808++;
        this.method2807(arg0, -1);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBLls;)V")
    public static final void method2809(int arg0, byte arg1, class124 arg2) {
        field6815++;
        int var3 = -1;
        int var4 = 0;
        if (arg1 >= -73) {
            method2809(81, (byte) 10, null);
        }
        if (arg2.field1770 > class186.field2697) {
            class661.method3723(-20994, arg2);
        } else if (class186.field2697 <= arg2.field1751) {
            class428.method2460(arg2, (byte) -22);
        } else {
            class647.method3619(arg2, (byte) 67, false);
            var4 = class549.field7423;
            var3 = class477.field6580;
        }
        if (arg2.field4042 < 512 || arg2.field4047 < 512 || arg2.field4042 >= (class401.field5620 * 512 - 512) || class257.field3508 * 512 - 512 <= arg2.field4047) {
            var3 = -1;
            arg2.field1751 = 0;
            arg2.field1779 = -1;
            arg2.field1753 = -1;
            arg2.field1724 = -1;
            var4 = 0;
            arg2.field1735 = null;
            arg2.field1770 = 0;
            arg2.field4042 = arg2.field1807[0] * 512 + arg2.method881(-123) * 256;
            arg2.field4047 = arg2.field1801[0] * 512 + (arg2.method881(-121) * 256);
            arg2.method889(false);
        }
        if (class143.field2063 == arg2 && (arg2.field4042 < 6144 || arg2.field4047 < 6144 || (class401.field5620 * 512 - 6144) <= arg2.field4042 || arg2.field4047 >= ((class257.field3508 - 12) * 512))) {
            arg2.field1753 = -1;
            arg2.field1735 = null;
            arg2.field1751 = 0;
            var3 = -1;
            var4 = 0;
            arg2.field1779 = -1;
            arg2.field1724 = -1;
            arg2.field1770 = 0;
            arg2.field4042 = arg2.field1807[0] * 512 + (arg2.method881(-108) * 256);
            arg2.field4047 = arg2.field1801[0] * 512 + arg2.method881(-108) * 256;
            arg2.method889(false);
        }
        int var5 = class437.method2499(104, arg2);
        class332.method1963(arg2, -1);
        class455.method2593(var4, arg2, var3, var5, 0);
        class487.method2765((byte) -87, var3, arg2);
        class254.method1569(arg2, true);
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)Z")
    public final boolean method2810(int arg0) {
        field6797++;
        if (arg0 != 256) {
            this.field6798 = -58;
        }
        return this.field6817;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lr;Ljs;IIIILvv;ZI)V")
    public class500(class166 arg0, class301 arg1, int arg2, int arg3, int arg4, int arg5, class295 arg6, boolean arg7, int arg8) {
        this.field6801 = (byte) arg5;
        this.field6809 = arg6;
        this.field6800 = arg1.field4131;
        this.field6804 = arg3;
        this.field6819 = arg7;
        this.field6796 = (byte) arg4;
        this.field6799 = arg2;
        this.field6817 = arg0.method94() && arg1.field4128 && !this.field6819;
        if (arg8 != -1) {
            this.field6791 = true;
        }
        this.method2807(arg8, -1);
    }
}
