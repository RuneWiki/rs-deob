import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class626 {

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    private int field8843 = -1;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Z")
    private boolean field8842 = false;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    private int field8844 = -1;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "I")
    private int field8849 = -1;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Z")
    private boolean field8839 = false;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    private int field8852 = 0;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "I")
    private int field8848 = 0;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public int field8837;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "B")
    private byte field8835;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public int field8846;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "B")
    private byte field8845;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lpn;")
    private class692 field8818;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public int field8854;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Z")
    private boolean field8824;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lhga;")
    public static class158 field8823 = new class158(26, 4);

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    private int field8822;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    private int field8825;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    private int field8831;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field8833;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
    private int field8850;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!fb", name = "N", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lqg;")
    private class428 field8820;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Liu;")
    public class536 field8836;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "Lha;")
    private class54 field8851;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lda;")
    private class55 field8829;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[Z")
    private boolean[] field8821;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)V")
    public static final void method3644(byte arg0, int arg1) {
        field8832++;
        class413 var2 = class674.method3852(14, arg1, 124);
        if (arg0 < -126) {
            var2.method2634(1065768928);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
    private final void method3645(int arg0, int arg1) {
        field8856++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class698 var5 = class213.field3537.method94(this.field8854, (byte) -42);
            class698 var6 = var5;
            if (var5.field9826 != null) {
                var5 = var5.method3934(class539.field7869, -30);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field9787 != null) {
                if (this.field8820 != null && var5.method3936(-101, this.field8820.field6529)) {
                    return;
                }
                var3 = var5.method3931(-28);
                if (this.field8843 != var5.field9825) {
                    var4 = var5.field9836;
                }
            } else if (var5.field9803 == -1) {
                if (var6 != null && var6.field9787 != null) {
                    if (this.field8820 != null && var6.method3936(-119, this.field8820.field6529)) {
                        return;
                    }
                    var3 = var6.method3931(-43);
                    if (this.field8843 != var6.field9825) {
                        var4 = var6.field9836;
                    }
                } else if (var6 != null && var6.field9803 != -1 && this.field8843 != var6.field9825) {
                    var3 = var6.field9803;
                    var4 = var6.field9836;
                }
            } else if (this.field8843 != var5.field9825) {
                var3 = var5.field9803;
                var4 = var5.field9836;
            }
        }
        if (var3 == -1) {
            this.field8820 = null;
            return;
        }
        this.field8829 = null;
        if (this.field8820 == null || this.field8820.field6529 != var3) {
            this.field8820 = class636.field8942.method2872((byte) 11, var3);
        } else if (this.field8820.field6513 == 0) {
            return;
        }
        if (this.field8820.field6521 == null) {
            this.field8820 = null;
            return;
        }
        if (var4) {
            this.field8850 = (int) ((double) this.field8820.field6521.length * Math.random());
            this.field8822 = (int) (Math.random() * (double) this.field8820.field6532[this.field8850]) + 1;
        } else {
            this.field8822 = 1;
            this.field8850 = 0;
        }
        this.field8825 = this.field8850 + 1;
        if (arg1 > this.field8825 || this.field8820.field6521.length <= this.field8825) {
            this.field8825 = -1;
        }
        this.field8831 = class562.field8084 - this.field8822;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lda;IIIZLr;IBLq;)V")
    public final void method3646(class55 arg0, int arg1, int arg2, int arg3, boolean arg4, class167 arg5, int arg6, byte arg7, class393 arg8) {
        field8817++;
        if (arg7 >= -97) {
            this.field8845 = -54;
        }
        class406[] var10 = arg0.method599();
        class192[] var11 = arg0.method652();
        if ((this.field8836 == null || this.field8836.field7839) && (var10 != null || var11 != null)) {
            class698 var12 = class213.field3537.method94(this.field8854, (byte) -42);
            if (var12.field9826 != null) {
                var12 = var12.method3934(class539.field7869, -74);
            }
            if (var12 != null) {
                this.field8836 = class536.method3249(class562.field8084, true);
            }
        }
        if (this.field8836 == null) {
            return;
        }
        arg0.method601(arg8);
        if (arg4) {
            this.field8836.method3257(arg5, (long) class562.field8084, var10, var11, false);
        } else {
            this.field8836.method3261((long) class562.field8084);
        }
        this.field8836.method3259(this.field8835, arg1, arg6, arg2, arg3);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lr;ZZII)Lda;")
    public final class55 method3647(class167 arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field8853++;
        class698 var6 = class213.field3537.method94(this.field8854, (byte) -42);
        if (var6.field9826 != null) {
            var6 = var6.method3934(class539.field7869, arg3 ^ 0x54);
        }
        if (var6 == null) {
            this.method3652((byte) 71, arg0);
            this.field8843 = -1;
            this.field8844 = -1;
            this.field8849 = -1;
            return null;
        }
        if (!this.field8839 && this.field8843 != var6.field9825) {
            this.field8829 = null;
            this.method3645(-1, 0);
        }
        this.method3649(-62, this.field8818);
        if (arg2) {
            boolean var7 = arg2 & this.field8824 & class17.field282.method2133(true, class497.field7259) != 0;
            arg2 = var7 & (this.field8844 != var6.field9825 || this.field8820 != null && class17.field282.method2133(true, class497.field7259) >= 2 && (this.field8850 != this.field8849 || (this.field8820.field6536 || class436.field6656) && this.field8850 != this.field8825));
        }
        if (arg1 && !arg2) {
            this.field8843 = var6.field9825;
            return null;
        }
        if (arg2) {
            class143.method1214(this.field8851, this.field8845, this.field8818.field9696, this.field8818.field9705, this.field8821);
            this.field8844 = -1;
            this.field8849 = -1;
        }
        class37 var8 = class587.field8346[this.field8845];
        class37 var9;
        if (this.field8842) {
            var9 = class491.field7187[0];
        } else {
            var9 = this.field8845 >= 3 ? null : class587.field8346[this.field8845 + 1];
        }
        if (arg3 != -1) {
            this.method3657((byte) -83);
        }
        class55 var10 = null;
        if (this.field8820 != null) {
            if (arg2) {
                arg4 |= 0x40000;
            }
            var10 = var6.method3937(this.field8846 == 11 ? 10 : this.field8846, this.field8846 == 11 ? this.field8837 + 4 : this.field8837, arg4, var9, this.field8820, this.field8818.field9705, var8, this.field8822, var8.method477(arg3, this.field8818.field9705, this.field8818.field9696), this.field8825, this.field8850, 126, this.field8818.field9696, arg0);
            if (var10 == null) {
                this.field8848 = 0;
                this.field8852 = 0;
                this.field8821 = null;
                this.field8851 = null;
            } else {
                if (arg2) {
                    if (this.field8821 == null) {
                        this.field8821 = new boolean[4];
                    }
                    this.field8851 = var10.method643(this.field8851);
                    class458.method2871(this.field8851, this.field8845, this.field8818.field9696, this.field8818.field9705, this.field8821);
                    this.field8844 = var6.field9825;
                    this.field8849 = this.field8850;
                }
                this.field8852 = var10.method623();
                this.field8848 = var10.method612();
            }
            this.field8829 = null;
        } else if (this.field8829 != null && (arg4 & this.field8829.method651()) == arg4 && this.field8843 == var6.field9825) {
            var10 = this.field8829;
        } else {
            if (this.field8829 != null) {
                arg4 |= this.field8829.method651();
            }
            class564 var11 = var6.method3933(this.field8818.field9696, var8, arg0, arg4, var9, this.field8846 == 11 ? this.field8837 + 4 : this.field8837, -1, arg2, var8.method477(-1, this.field8818.field9705, this.field8818.field9696), this.field8846 == 11 ? 10 : this.field8846, this.field8818.field9705);
            if (var11 == null) {
                this.field8821 = null;
                this.field8852 = 0;
                this.field8851 = null;
                this.field8848 = 0;
                this.field8829 = null;
            } else {
                var10 = var11.field8102;
                this.field8829 = var11.field8102;
                if (arg2) {
                    this.field8821 = null;
                    this.field8851 = var11.field8103;
                    class458.method2871(this.field8851, this.field8845, this.field8818.field9696, this.field8818.field9705, null);
                    this.field8844 = var6.field9825;
                    this.field8849 = -1;
                }
                this.field8852 = var10.method623();
                this.field8848 = var10.method612();
            }
        }
        this.field8843 = var6.field9825;
        return var10;
    }

    @OriginalMember(owner = "client!fb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field8836 != null) {
            this.field8836.method3251();
        }
        field8828++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLr;)V")
    public final void method3648(byte arg0, class167 arg1) {
        if (arg0 > -81) {
            this.method3657((byte) -55);
        }
        field8830++;
        this.method3647(arg1, true, true, -1, 262144);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILpn;)V")
    private final void method3649(int arg0, class692 arg1) {
        if (arg0 > -47) {
            this.field8851 = null;
        }
        field8838++;
        label92: while (true) {
            if (this.field8820 == null) {
                if (this.field8839) {
                    return;
                }
                this.method3645(-1, 0);
                if (this.field8820 == null) {
                    return;
                }
            }
            int var3 = class562.field8084 - this.field8831;
            if (var3 > 100 && this.field8820.field6510 > 0) {
                int var4 = this.field8820.field6521.length - this.field8820.field6510;
                while (this.field8850 < var4 && this.field8820.field6532[this.field8850] < var3) {
                    var3 -= this.field8820.field6532[this.field8850];
                    this.field8850++;
                }
                if (this.field8850 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field8820.field6521.length; var6++) {
                        var5 += this.field8820.field6532[var6];
                    }
                    var3 %= var5;
                }
                this.field8825 = this.field8850 + 1;
                if (this.field8825 >= this.field8820.field6521.length) {
                    this.field8825 -= this.field8820.field6510;
                    if (this.field8825 < 0 || this.field8820.field6521.length <= this.field8825) {
                        this.field8825 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field8820.field6532[this.field8850] >= var3) {
                            this.field8822 = var3;
                            this.field8831 = class562.field8084 - var3;
                            return;
                        }
                        class216.method1622(this.field8850, arg1, (byte) -27, this.field8820);
                        var3 -= this.field8820.field6532[this.field8850];
                        this.field8850++;
                        if (this.field8850 >= this.field8820.field6521.length) {
                            this.field8850 -= this.field8820.field6510;
                            if (this.field8850 < 0 || this.field8850 >= this.field8820.field6521.length) {
                                this.field8820 = null;
                                continue label92;
                            }
                        }
                        this.field8825 = this.field8850 + 1;
                    } while (this.field8825 < this.field8820.field6521.length);
                    this.field8825 -= this.field8820.field6510;
                } while (this.field8825 >= 0 && this.field8825 < this.field8820.field6521.length);
                this.field8825 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method3650(boolean arg0, String arg1, int arg2) {
        field8847++;
        if (arg1 == null) {
            return;
        }
        if (class51.field691 >= 100) {
            class307.method2122(4, class122.field2011.method1091(class135.field2206, 1), (byte) 114);
            return;
        }
        String var3 = class321.method2179(-2081246228, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class51.field691; var4++) {
            String var10 = class321.method2179(-2081246228, class478.field7077[var4]);
            if (var10 != null && var10.equals(var3)) {
                class307.method2122(4, arg1 + class122.field2012.method1091(class135.field2206, 1), (byte) 118);
                return;
            }
            if (class333.field5455[var4] != null) {
                String var11 = class321.method2179(-2081246228, class333.field5455[var4]);
                if (var11 != null && var11.equals(var3)) {
                    class307.method2122(4, arg1 + class122.field2012.method1091(class135.field2206, 1), (byte) 104);
                    return;
                }
            }
        }
        int var5 = 123 % ((-arg2 - 10) / 39);
        for (int var6 = 0; var6 < class204.field3334; var6++) {
            String var8 = class321.method2179(-2081246228, class527.field7700[var6]);
            if (var8 != null && var8.equals(var3)) {
                class307.method2122(4, class122.field2017.method1091(class135.field2206, 1) + arg1 + class122.field2018.method1091(class135.field2206, 1), (byte) 105);
                return;
            }
            if (class20.field328[var6] != null) {
                String var9 = class321.method2179(-2081246228, class20.field328[var6]);
                if (var9 != null && var9.equals(var3)) {
                    class307.method2122(4, class122.field2017.method1091(class135.field2206, 1) + arg1 + class122.field2018.method1091(class135.field2206, 1), (byte) 120);
                    return;
                }
            }
        }
        if (class321.method2179(-2081246228, class567.field8141.field4792).equals(var3)) {
            class307.method2122(4, class122.field2014.method1091(class135.field2206, 1), (byte) 110);
            return;
        }
        class392.field6126++;
        class165 var7 = class271.method1917(class420.field6424, (byte) -47, class248.field3954);
        var7.field2776.method65(class516.method3125(119, arg1) + 1, -77);
        var7.field2776.method28(arg1, 0);
        var7.field2776.method65(arg0 ? 1 : 0, -77);
        class642.method3726(-684096285, var7);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
    public final int method3651(int arg0) {
        field8826++;
        if (arg0 != 30556) {
            this.field8836 = null;
        }
        return this.field8848;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(BLr;)V")
    public final void method3652(byte arg0, class167 arg1) {
        if (this.field8851 != null) {
            class143.method1214(this.field8851, this.field8845, this.field8818.field9696, this.field8818.field9705, this.field8821);
            this.field8851 = null;
            this.field8821 = null;
        }
        field8819++;
        if (arg0 != 71) {
            this.method3648((byte) -28, null);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method3653(byte arg0) {
        if (arg0 >= -12) {
            method3656(101, 88, -72);
        }
        field8823 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)I")
    public final int method3654(int arg0) {
        field8840++;
        int var2 = 8 % ((arg0 - 44) / 51);
        return this.field8852;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)I")
    public static final int method3655(int arg0, int arg1, int arg2, int arg3) {
        field8834++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        }
        int var5 = -82 % ((17 - arg1) / 53);
        if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Lpca;")
    public static final class665 method3656(int arg0, int arg1, int arg2) {
        field8827++;
        if (arg0 != 28613) {
            field8823 = null;
        }
        class665 var3 = class326.method2197(false, arg1);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field9296 == null || arg2 >= var3.field9296.length) {
            return null;
        } else {
            return var3.field9296[arg2];
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)Z")
    public final boolean method3657(byte arg0) {
        if (arg0 >= -103) {
            method3655(88, -8, -38, 58);
        }
        field8833++;
        return this.field8824;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V")
    public final void method3658(int arg0, int arg1) {
        this.field8839 = true;
        field8841++;
        this.method3645(arg1, 0);
        if (arg0 < 112) {
            this.method3648((byte) 0, null);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lr;Llr;IIIILpn;ZI)V")
    public class626(class167 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, class692 arg6, boolean arg7, int arg8) {
        this.field8837 = arg3;
        this.field8835 = (byte) arg4;
        this.field8846 = arg2;
        this.field8845 = (byte) arg5;
        this.field8842 = arg7;
        this.field8818 = arg6;
        this.field8854 = arg1.field9825;
        this.field8824 = arg0.method262() && arg1.field9812 && !this.field8842;
        if (arg8 != -1) {
            this.field8839 = true;
        }
        this.method3645(arg8, 0);
    }
}
