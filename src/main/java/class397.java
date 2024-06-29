import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class397 {

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    private int field5821 = -32768;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    private int field5810 = -1;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "Z")
    private boolean field5844 = false;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "Z")
    private boolean field5846 = false;

    @OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
    private int field5853 = -1;

    @OriginalMember(owner = "client!cp", name = "E", descriptor = "B")
    private byte field5840;

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    private int field5842;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    private int field5824;

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public int field5834;

    @OriginalMember(owner = "client!cp", name = "F", descriptor = "I")
    public int field5841;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "B")
    private byte field5817;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public int field5827;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "Z")
    private boolean field5835;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field5812 = 0;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5815 = "Allocated memory";

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "Lfg;")
    public static class18 field5823 = new class18(128);

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
    public static int field5849 = 0;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field5820;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    private int field5830;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
    private int field5832;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
    private int field5836;

    @OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
    private int field5837;

    @OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!cp", name = "D", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!cp", name = "S", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "Lrc;")
    private class100 field5852;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Lsr;")
    private class135 field5814;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "Ldp;")
    public static class174 field5848;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "Lbq;")
    private class51 field5819;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "Lbl;")
    public class54 field5813;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "[Z")
    private boolean[] field5847;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZLja;IIZBI)Lrc;", line = 4)
    public final class100 method2522(boolean arg0, class90 arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        field5850++;
        class45 var8 = class451.method2812(47, this.field5841);
        if (var8.field681 != null) {
            var8 = var8.method369(80);
        }
        if (var8 == null) {
            this.method2523(-17547, arg1);
            this.field5853 = this.field5832;
            this.field5810 = -1;
            return null;
        }
        if (!this.field5846 && this.field5810 != var8.field733) {
            this.field5852 = null;
            this.method2529(-1, 89);
        }
        this.method2524(arg6, (byte) -80, arg2);
        boolean var9 = arg0 & this.field5835 & class238.field3438 != 0;
        boolean var10 = var9 & (this.field5810 != var8.field733 || (this.field5853 != this.field5832 || this.field5819 != null && (this.field5819.field819 || class221.field3301) && this.field5836 != this.field5832) && class238.field3438 >= 2);
        if (arg4 && !var10) {
            this.field5810 = var8.field733;
            this.field5853 = this.field5832;
            return null;
        }
        if (var10) {
            class50.method395(this.field5814, this.field5840, this.field5824, this.field5842, this.field5847);
        }
        class126 var11 = class50.field816[this.field5840];
        if (arg5 > -25) {
            method2534(-102);
        }
        class126 var12;
        if (this.field5844) {
            var12 = class311.field4527[0];
        } else {
            var12 = this.field5840 < 3 ? class50.field816[this.field5840 + 1] : null;
        }
        class100 var13 = null;
        if (this.field5819 != null) {
            if (var10) {
                arg3 |= 0x20000;
            }
            var13 = var8.method366(this.field5819, this.field5842, arg1, this.field5824, var11.method809(this.field5824, this.field5842), var11, -1, this.field5827 == 11 ? 10 : this.field5827, var12, this.field5827 == 11 ? this.field5834 + 4 : this.field5834, this.field5836, this.field5830, this.field5832, arg3);
            if (var13 == null) {
                this.field5821 = 0;
                this.field5814 = null;
                this.field5847 = null;
            } else {
                if (var10) {
                    if (this.field5847 == null) {
                        this.field5847 = new boolean[4];
                    }
                    this.field5814 = var13.method568(this.field5814);
                    class365.method2332(this.field5814, this.field5840, arg2, arg6, this.field5847);
                }
                this.field5821 = var13.method541();
            }
            this.field5852 = null;
        } else if (this.field5852 != null && arg3 == (arg3 & this.field5852.method560()) && this.field5810 == var8.field733) {
            var13 = this.field5852;
        } else {
            if (this.field5852 != null) {
                arg3 |= this.field5852.method560();
            }
            class209 var14 = var8.method361(-183837885, ~this.field5827 == -12 ? 10 : this.field5827, arg1, var10, var11.method809(this.field5824, this.field5842), var12, this.field5824, this.field5827 == 11 ? this.field5834 + 4 : this.field5834, arg3, var11, this.field5842);
            if (var14 == null) {
                this.field5814 = null;
                this.field5847 = null;
                this.field5852 = null;
                this.field5821 = 0;
            } else {
                var13 = var14.field3048;
                this.field5852 = var14.field3048;
                if (var10) {
                    this.field5814 = var14.field3046;
                    this.field5847 = null;
                    class365.method2332(this.field5814, this.field5840, arg2, arg6, (boolean[]) null);
                }
                this.field5821 = var13.method541();
            }
        }
        this.field5824 = arg2;
        this.field5810 = var8.field733;
        this.field5842 = arg6;
        this.field5853 = this.field5832;
        return var13;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILja;)V", line = 130)
    public final void method2523(int arg0, class90 arg1) {
        if (this.field5814 != null) {
            class50.method395(this.field5814, this.field5840, this.field5824, this.field5842, this.field5847);
            this.field5814 = null;
            this.field5847 = null;
        }
        field5818++;
        if (arg0 != -17547) {
            this.field5844 = false;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IBI)V", line = 149)
    private final void method2524(int arg0, byte arg1, int arg2) {
        if (arg1 != -80) {
            this.field5844 = true;
        }
        field5831++;
        label92: while (true) {
            if (this.field5819 == null) {
                if (this.field5846) {
                    return;
                }
                this.method2529(-1, 83);
                if (this.field5819 == null) {
                    return;
                }
            }
            int var4 = class267.field4002 - this.field5837;
            if (var4 > 100 && this.field5819.field838 > 0) {
                int var5 = this.field5819.field835.length - this.field5819.field838;
                while (var5 > this.field5832 && this.field5819.field845[this.field5832] < var4) {
                    var4 -= this.field5819.field845[this.field5832];
                    this.field5832++;
                }
                if (this.field5832 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5819.field835.length; var7++) {
                        var6 += this.field5819.field845[var7];
                    }
                    var4 %= var6;
                }
                this.field5836 = this.field5832 + 1;
                if (this.field5819.field835.length <= this.field5836) {
                    this.field5836 -= this.field5819.field838;
                    if (this.field5836 < 0 || this.field5819.field835.length <= this.field5836) {
                        this.field5836 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field5819.field845[this.field5832] >= var4) {
                            this.field5837 = class267.field4002 - var4;
                            this.field5830 = var4;
                            return;
                        }
                        class50.method399(this.field5832, arg0, (byte) 96, this.field5819, arg2, false);
                        var4 -= this.field5819.field845[this.field5832];
                        this.field5832++;
                        if (this.field5832 >= this.field5819.field835.length) {
                            this.field5832 -= this.field5819.field838;
                            if (this.field5832 < 0 || this.field5832 >= this.field5819.field835.length) {
                                this.field5819 = null;
                                continue label92;
                            }
                        }
                        this.field5836 = this.field5832 + 1;
                    } while (this.field5836 < this.field5819.field835.length);
                    this.field5836 -= this.field5819.field838;
                } while (this.field5836 >= 0 && this.field5836 < this.field5819.field835.length);
                this.field5836 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILja;ZILrc;ZII)V", line = 255)
    public final void method2525(int arg0, class90 arg1, boolean arg2, int arg3, class100 arg4, boolean arg5, int arg6, int arg7) {
        field5825++;
        if (arg2) {
            return;
        }
        class383[] var9 = arg4.method542();
        class354[] var10 = arg4.method547();
        if ((this.field5813 == null || this.field5813.field864) && (var9 != null || var10 != null)) {
            class45 var11 = class451.method2812(86, this.field5841);
            if (var11.field681 != null) {
                var11 = var11.method369(98);
            }
            if (var11 != null) {
                this.field5813 = new class54(class267.field4002);
            }
        }
        if (this.field5813 == null) {
            return;
        }
        if (arg5) {
            this.field5813.method424(arg1, (long) class267.field4002, var9, var10, false);
        } else {
            this.field5813.method432((long) class267.field4002);
        }
        this.field5813.method429(this.field5817, arg6, arg0, arg3, arg7);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V", line = 293)
    public static final void method2526(int arg0) {
        if (arg0 != -1) {
            method2533((class181) null, (class174) null, (byte) -125);
        }
        class334.field4787 = new class22();
        field5816++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lja;I)V", line = 305)
    public final void method2527(class90 arg0, int arg1) {
        this.method2522(true, arg0, this.field5824, 131072, true, (byte) -107, this.field5842);
        int var3 = 28 / ((54 - arg1) / 54);
        field5822++;
    }

    @OriginalMember(owner = "client!cp", name = "finalize", descriptor = "()V", line = 315)
    protected final void finalize() {
        field5811++;
        if (this.field5813 != null) {
            this.field5813.method431();
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V", line = 326)
    public final void method2528(int arg0, int arg1) {
        if (arg1 != 4) {
            this.method2525(115, (class90) null, true, -53, (class100) null, true, 76, -63);
        }
        this.field5846 = true;
        field5854++;
        this.method2529(arg0, 91);
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)V", line = 338)
    private final void method2529(int arg0, int arg1) {
        field5828++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class45 var5 = class451.method2812(109, this.field5841);
            class45 var6 = var5;
            if (var5.field681 != null) {
                var5 = var5.method369(68);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field732 != null) {
                if (this.field5819 != null && var5.method365(this.field5819.field844, (byte) -102)) {
                    return;
                }
                var3 = var5.method364((byte) -117);
                if (this.field5810 != var5.field733) {
                    var4 = var5.field688;
                }
            } else if (var5.field715 == -1) {
                if (var6 != null && var6.field732 != null) {
                    if (this.field5819 != null && var6.method365(this.field5819.field844, (byte) -102)) {
                        return;
                    }
                    var3 = var6.method364((byte) -70);
                    if (this.field5810 != var6.field733) {
                        var4 = var6.field688;
                    }
                } else if (var6 != null && var6.field715 != -1 && this.field5810 != var6.field733) {
                    var4 = var6.field688;
                    var3 = var6.field715;
                }
            } else if (this.field5810 != var5.field733) {
                var4 = var5.field688;
                var3 = var5.field715;
            }
        }
        if (var3 == -1) {
            this.field5819 = null;
            return;
        }
        this.field5852 = null;
        if (arg1 < 81) {
            method2531(65, -21);
        }
        if (this.field5819 == null || this.field5819.field844 != var3) {
            this.field5819 = class113.method974(var3, (byte) -85);
        } else if (this.field5819.field817 == 0) {
            return;
        }
        if (this.field5819.field835 == null) {
            this.field5819 = null;
            return;
        }
        if (var4) {
            this.field5832 = (int) ((double) this.field5819.field835.length * Math.random());
            this.field5830 = (int) (Math.random() * (double) this.field5819.field845[this.field5832]) + 1;
        } else {
            this.field5832 = 0;
            this.field5830 = 1;
        }
        this.field5836 = this.field5832 + 1;
        if (this.field5836 < 0 || this.field5836 >= this.field5819.field835.length) {
            this.field5836 = -1;
        }
        this.field5837 = class267.field4002 - this.field5830;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZI)V", line = 462)
    public static final void method2530(int arg0, boolean arg1, int arg2) {
        field5839++;
        if (arg1) {
            class221 var3 = class447.method2795(7, (byte) -49, arg0);
            var3.method1692(0);
            var3.field3297 = arg2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(II)I", line = 485)
    public static final int method2531(int arg0, int arg1) {
        field5851++;
        if (arg0 < 64) {
            field5843 = 48;
        }
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lja;Lfb;IIIIIIZI)V", line = 617)
    public class397(class90 arg0, class45 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field5840 = (byte) arg5;
        this.field5842 = arg7;
        this.field5824 = arg6;
        this.field5834 = arg3;
        this.field5841 = arg1.field733;
        this.field5844 = arg8;
        this.field5817 = (byte) arg4;
        this.field5827 = arg2;
        this.field5835 = arg0.method730() && arg1.field728 && !this.field5844;
        if (arg9 != -1) {
            this.field5846 = true;
        }
        this.method2529(arg9, 82);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V", line = 503)
    public static final void method2532(byte arg0) {
        class376.field5322.method112(0);
        int var1 = 20 % ((arg0 - 4) / 36);
        field5838++;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lcj;Ldp;B)V", line = 513)
    public static final void method2533(class181 arg0, class174 arg1, byte arg2) {
        field5845++;
        if (arg2 > -35) {
            field5823 = null;
        }
        class369.field5239 = arg0;
        class33.field464 = arg1;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V", line = 527)
    public static void method2534(int arg0) {
        field5815 = null;
        field5848 = null;
        if (arg0 == 11) {
            field5823 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)I", line = 560)
    public final int method2535(byte arg0) {
        if (arg0 == 88) {
            field5826++;
            return this.field5821;
        } else {
            return 18;
        }
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)Z", line = 573)
    public final boolean method2536(int arg0) {
        field5820++;
        if (arg0 != 16426) {
            this.field5852 = null;
        }
        return this.field5835;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)V", line = 602)
    public static final void method2537(byte arg0, int arg1) {
        field5829++;
        class46.field747 = new class18(arg1);
        if (arg0 >= -9) {
            field5843 = -109;
        }
    }
}
