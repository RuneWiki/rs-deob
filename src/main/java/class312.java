import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class312 {

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
    private int field3859 = 0;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    private int field3854 = 0;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    private int field3862 = -1;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Z")
    private boolean field3851 = false;

    @OriginalMember(owner = "client!rv", name = "M", descriptor = "I")
    private int field3885 = -1;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "Z")
    private boolean field3858 = false;

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "I")
    private int field3874 = -1;

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "I")
    private int field3880;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    private int field3857;

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "I")
    public int field3875;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public int field3866;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "B")
    private byte field3855;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public int field3848;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "B")
    private byte field3868;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "Z")
    private boolean field3873;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3853 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "Lsb;")
    public static class305 field3877 = new class305(44, 0);

    @OriginalMember(owner = "client!rv", name = "N", descriptor = "Lqh;")
    public static class320 field3886 = new class320("stellardawn", 1);

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "F")
    public static float field3870;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    private int field3860;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    private int field3863;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    private int field3864;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
    private int field3876;

    @OriginalMember(owner = "client!rv", name = "I", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!rv", name = "K", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!rv", name = "L", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "Lha;")
    private class120 field3871;

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "Llb;")
    private class257 field3878;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "Lwca;")
    public class339 field3865;

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "Lda;")
    private class473 field3879;

    @OriginalMember(owner = "client!rv", name = "O", descriptor = "[Z")
    private boolean[] field3887;

    @OriginalMember(owner = "client!rv", name = "J", descriptor = "[[[J")
    public static long[][][] field3882;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V", line = 4)
    private final void method1785(int arg0, int arg1) {
        field3856++;
        if (arg0 != 23006) {
            this.field3851 = false;
        }
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class638 var5 = class364.field4891.method2134(this.field3866, true);
            class638 var6 = var5;
            if (var5.field8974 != null) {
                var5 = var5.method3597(-1, class628.field8859);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field9066 != null) {
                if (this.field3878 != null && var5.method3585(true, this.field3878.field3207)) {
                    return;
                }
                var3 = var5.method3594(-1);
                if (this.field3874 != var5.field9021) {
                    var4 = var5.field9062;
                }
            } else if (var5.field8986 == -1) {
                if (var6 != null && var6.field9066 != null) {
                    if (this.field3878 != null && var6.method3585(true, this.field3878.field3207)) {
                        return;
                    }
                    var3 = var6.method3594(-1);
                    if (this.field3874 != var6.field9021) {
                        var4 = var6.field9062;
                    }
                } else if (var6 != null && var6.field8986 != -1 && this.field3874 != var6.field9021) {
                    var4 = var6.field9062;
                    var3 = var6.field8986;
                }
            } else if (this.field3874 != var5.field9021) {
                var3 = var5.field8986;
                var4 = var5.field9062;
            }
        }
        if (var3 == -1) {
            this.field3878 = null;
            return;
        }
        this.field3879 = null;
        if (this.field3878 == null || this.field3878.field3207 != var3) {
            this.field3878 = class265.field3301.method3043(var3, -8191);
        } else if (this.field3878.field3220 == 0) {
            return;
        }
        if (this.field3878.field3218 == null) {
            this.field3878 = null;
            return;
        }
        if (var4) {
            this.field3864 = (int) ((double) this.field3878.field3218.length * Math.random());
            this.field3876 = (int) (Math.random() * (double) this.field3878.field3235[this.field3864]) + 1;
        } else {
            this.field3876 = 1;
            this.field3864 = 0;
        }
        this.field3860 = this.field3864 + 1;
        if (this.field3860 < 0 || this.field3878.field3218.length <= this.field3860) {
            this.field3860 = -1;
        }
        this.field3863 = class678.field9539 - this.field3876;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLr;IZIII)Lda;", line = 125)
    public final class473 method1786(boolean arg0, class564 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3883++;
        class638 var8 = class364.field4891.method2134(this.field3866, true);
        if (var8.field8974 != null) {
            var8 = var8.method3597(-1, class628.field8859);
        }
        if (var8 == null) {
            this.method1790((byte) 98, arg1);
            this.field3874 = -1;
            this.field3885 = -1;
            this.field3862 = -1;
            return null;
        }
        if (!this.field3851 && this.field3874 != var8.field9021) {
            this.field3879 = null;
            this.method1785(23006, -1);
        }
        this.method1788(-76, arg2, arg6);
        if (arg0) {
            boolean var9 = arg0 & this.field3873 & class639.field9075.method2720((byte) -126, class430.field6109) != 0;
            arg0 = var9 & (this.field3885 != var8.field9021 || this.field3878 != null && class639.field9075.method2720((byte) -102, class430.field6109) >= 2 && (this.field3864 != this.field3862 || (this.field3878.field3222 || class510.field7317) && this.field3864 != this.field3860));
        }
        if (arg3 && !arg0) {
            this.field3874 = var8.field9021;
            return null;
        }
        if (arg0) {
            class249.method1467(this.field3871, this.field3868, this.field3857, this.field3880, this.field3887);
            this.field3862 = -1;
            this.field3885 = -1;
        }
        class274 var10 = class156.field1743[this.field3868];
        if (arg4 != -14283) {
            this.field3848 = 16;
        }
        class274 var11;
        if (this.field3858) {
            var11 = class385.field5193[0];
        } else {
            var11 = this.field3868 >= 3 ? null : class156.field1743[this.field3868 + 1];
        }
        class473 var12 = null;
        if (this.field3878 != null) {
            if (arg0) {
                arg5 |= 0x40000;
            }
            var12 = var8.method3595(var10, arg5, this.field3878, var11, 91, arg1, this.field3875 == 11 ? this.field3848 + 4 : this.field3848, var10.method1610(this.field3857, 100, this.field3880), this.field3876, this.field3860, this.field3875 == 11 ? 10 : this.field3875, this.field3864, this.field3880, this.field3857);
            if (var12 == null) {
                this.field3887 = null;
                this.field3871 = null;
                this.field3859 = 0;
                this.field3854 = 0;
            } else {
                if (arg0) {
                    if (this.field3887 == null) {
                        this.field3887 = new boolean[4];
                    }
                    this.field3871 = var12.method1874(this.field3871);
                    class254.method1500(this.field3871, this.field3868, arg6, arg2, this.field3887);
                    this.field3885 = var8.field9021;
                    this.field3862 = this.field3864;
                }
                this.field3859 = var12.method1869();
                this.field3854 = var12.method1868();
            }
            this.field3879 = null;
        } else if (this.field3879 != null && (this.field3879.method1861() & arg5) == arg5 && this.field3874 == var8.field9021) {
            var12 = this.field3879;
        } else {
            if (this.field3879 != null) {
                arg5 |= this.field3879.method1861();
            }
            class65 var13 = var8.method3584(this.field3857, var10.method1610(this.field3857, 120, this.field3880), arg1, this.field3880, var10, arg5, this.field3875 == 11 ? 10 : this.field3875, (byte) -91, arg0, this.field3875 == 11 ? this.field3848 + 4 : this.field3848, var11);
            if (var13 == null) {
                this.field3871 = null;
                this.field3879 = null;
                this.field3859 = 0;
                this.field3854 = 0;
                this.field3887 = null;
            } else {
                var12 = var13.field665;
                this.field3879 = var13.field665;
                if (arg0) {
                    this.field3871 = var13.field664;
                    this.field3887 = null;
                    class254.method1500(this.field3871, this.field3868, arg6, arg2, null);
                    this.field3862 = -1;
                    this.field3885 = var8.field9021;
                }
                this.field3859 = var12.method1869();
                this.field3854 = var12.method1868();
            }
        }
        this.field3874 = var8.field9021;
        this.field3880 = arg2;
        this.field3857 = arg6;
        return var12;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)Z", line = 265)
    public final boolean method1787(boolean arg0) {
        field3849++;
        if (!arg0) {
            this.method1786(true, null, -116, false, 118, 48, 97);
        }
        return this.field3873;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)V", line = 280)
    private final void method1788(int arg0, int arg1, int arg2) {
        if (arg0 >= -20) {
            this.method1785(-68, 28);
        }
        field3867++;
        label92: while (true) {
            if (this.field3878 == null) {
                if (this.field3851) {
                    return;
                }
                this.method1785(23006, -1);
                if (this.field3878 == null) {
                    return;
                }
            }
            int var4 = class678.field9539 - this.field3863;
            if (var4 > 100 && this.field3878.field3205 > 0) {
                int var5 = this.field3878.field3218.length - this.field3878.field3205;
                while (var5 > this.field3864 && this.field3878.field3235[this.field3864] < var4) {
                    var4 -= this.field3878.field3235[this.field3864];
                    this.field3864++;
                }
                if (this.field3864 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3878.field3218.length; var7++) {
                        var6 += this.field3878.field3235[var7];
                    }
                    var4 %= var6;
                }
                this.field3860 = this.field3864 + 1;
                if (this.field3878.field3218.length <= this.field3860) {
                    this.field3860 -= this.field3878.field3205;
                    if (this.field3860 < 0 || this.field3860 >= this.field3878.field3218.length) {
                        this.field3860 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field3878.field3235[this.field3864] >= var4) {
                            this.field3876 = var4;
                            this.field3863 = class678.field9539 - var4;
                            return;
                        }
                        class635.method3570((byte) -106, false, arg2, this.field3878, this.field3855, arg1, this.field3864);
                        var4 -= this.field3878.field3235[this.field3864];
                        this.field3864++;
                        if (this.field3878.field3218.length <= this.field3864) {
                            this.field3864 -= this.field3878.field3205;
                            if (this.field3864 < 0 || this.field3878.field3218.length <= this.field3864) {
                                this.field3878 = null;
                                continue label92;
                            }
                        }
                        this.field3860 = this.field3864 + 1;
                    } while (this.field3860 < this.field3878.field3218.length);
                    this.field3860 -= this.field3878.field3205;
                } while (this.field3860 >= 0 && this.field3878.field3218.length > this.field3860);
                this.field3860 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V", line = 389)
    protected final void finalize() {
        field3861++;
        if (this.field3865 != null) {
            this.field3865.method1954();
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V", line = 400)
    public final void method1789(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field3880 = -27;
        }
        this.field3851 = true;
        field3850++;
        this.method1785(arg1 + 23006, arg0);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLr;)V", line = 416)
    public final void method1790(byte arg0, class564 arg1) {
        if (arg0 < 47) {
            return;
        }
        field3852++;
        if (this.field3871 != null) {
            class249.method1467(this.field3871, this.field3868, this.field3857, this.field3880, this.field3887);
            this.field3887 = null;
            this.field3871 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)I", line = 435)
    public final int method1791(byte arg0) {
        field3881++;
        if (arg0 != 68) {
            this.method1788(2, -46, 117);
        }
        return this.field3859;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lr;Lqp;IIIIIIZI)V", line = 565)
    public class312(class564 arg0, class638 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field3880 = arg7;
        this.field3857 = arg6;
        this.field3875 = arg2;
        this.field3866 = arg1.field9021;
        this.field3855 = (byte) arg4;
        this.field3858 = arg8;
        this.field3848 = arg3;
        this.field3868 = (byte) arg5;
        this.field3873 = arg0.method972() && arg1.field9067 && !this.field3858;
        if (arg9 != -1) {
            this.field3851 = true;
        }
        this.method1785(23006, arg9);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(Z)V", line = 457)
    public static void method1792(boolean arg0) {
        field3877 = null;
        field3886 = null;
        field3882 = null;
        field3853 = null;
        if (arg0) {
            field3877 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I", line = 474)
    public final int method1793(int arg0) {
        field3869++;
        return arg0 == -1 ? this.field3854 : 94;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZIIILq;BLda;ILr;)V", line = 502)
    public final void method1794(boolean arg0, int arg1, int arg2, int arg3, class490 arg4, byte arg5, class473 arg6, int arg7, class564 arg8) {
        field3872++;
        int var10 = 99 % ((14 - arg5) / 63);
        class93[] var11 = arg6.method1910();
        class667[] var12 = arg6.method1897();
        if ((this.field3865 == null || this.field3865.field4270) && (var11 != null || var12 != null)) {
            class638 var13 = class364.field4891.method2134(this.field3866, true);
            if (var13.field8974 != null) {
                var13 = var13.method3597(-1, class628.field8859);
            }
            if (var13 != null) {
                this.field3865 = class339.method1950(class678.field9539, true);
            }
        }
        if (this.field3865 == null) {
            return;
        }
        arg6.method1891(arg4);
        if (arg0) {
            this.field3865.method1960(arg8, (long) class678.field9539, var11, var12, false);
        } else {
            this.field3865.method1962((long) class678.field9539);
        }
        this.field3865.method1949(this.field3855, arg1, arg3, arg2, arg7);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lr;I)V", line = 541)
    public final void method1795(class564 arg0, int arg1) {
        field3884++;
        int var3 = 6 % ((arg1 - 42) / 43);
        this.method1786(true, arg0, this.field3880, true, -14283, 262144, this.field3857);
    }
}
