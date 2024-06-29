import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class441 extends class423 {

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "Z")
    private boolean field6849 = false;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    private int field6855 = -32768;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    private int field6827 = 0;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    private int field6857 = 0;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    private int field6837 = -1;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "Z")
    private boolean field6864;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public int field6834;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    public int field6854;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    private int field6840;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int field6829;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    private int field6858;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
    public int field6868;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    private int field6865;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    private int field6835;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Lhg;")
    private class363 field6842;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "J")
    public static long field6850 = 0L;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "D")
    private double field6828;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "D")
    private double field6831;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "D")
    private double field6836;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "D")
    private double field6839;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "D")
    private double field6843;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "D")
    private double field6847;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "D")
    private double field6851;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "D")
    private double field6852;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field6841;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    private int field6844;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    private int field6863;

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lbn;")
    private class356 field6826;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILza;IZBILbm;)V")
    public final void method938(int arg0, class497 arg1, int arg2, boolean arg3, byte arg4, int arg5, class484 arg6) {
        ++field6862;
        int var8 = -52 % ((arg4 - 27) / 32);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
    public final void method2793(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field6849) {
            double var6 = (double) (-super.field6417 + arg2);
            double var8 = (double) (-super.field6410 + arg3);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field6839 = (double) this.field6840 * var8 / var10 + (double) super.field6410;
            this.field6831 = (double) this.field6840 * var6 / var10 + (double) super.field6417;
            if (!this.field6864) {
                this.field6851 = (double) super.field6412;
            } else {
                this.field6851 = (double) (class532.method3165(super.field6419, (int) this.field6831, false, (int) this.field6839) + -this.field6858);
            }
        }
        ++field6841;
        double var12 = (double) (-arg0 + this.field6854 + arg4);
        this.field6847 = ((double) arg2 - this.field6831) / var12;
        this.field6828 = ((double) arg3 - this.field6839) / var12;
        this.field6843 = Math.sqrt(this.field6847 * this.field6847 + this.field6828 * this.field6828);
        if (~this.field6835 != 0) {
            if (!this.field6849) {
                this.field6852 = -this.field6843 * Math.tan((double) this.field6835 * 0.02454369D);
            }
            this.field6836 = ((double) arg1 - this.field6851 + -(this.field6852 * var12)) * 2.0D / (var12 * var12);
        } else {
            this.field6852 = ((double) arg1 + -this.field6851) / var12;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILe;Lza;)V")
    private final void method2794(int arg0, class536 arg1, class497 arg2) {
        ++field6848;
        class293[] var4 = arg1.method292();
        class100[] var5 = arg1.method326();
        if ((this.field6826 == null || this.field6826.field5518) && (var4 != null || var5 != null)) {
            this.field6826 = new class356(class88.field1278);
        }
        if (this.field6826 != null) {
            this.field6826.method2352(arg2, (long) class88.field1278, var4, var5, false);
            this.field6826.method2349(super.field6419, super.field6423, super.field6420, super.field6424, super.field6418);
        }
        if (arg0 != 16383) {
            this.method2795(-111);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        if (arg1 != 32689) {
            this.finalize();
        }
        ++field6830;
        return false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public final void method2795(int arg0) {
        if (arg0 != 9828) {
            this.field6840 = 26;
        }
        if (this.field6826 != null) {
            this.field6826.method2356();
        }
        ++field6832;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)I")
    public final int method1596(boolean arg0) {
        ++field6861;
        return !arg0 ? -14 : this.field6855;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)Z")
    public final boolean method936(boolean arg0) {
        if (arg0) {
            this.method938(35, (class497) null, -90, true, (byte) 22, -72, (class484) null);
        }
        ++field6853;
        return false;
    }

    @OriginalMember(owner = "client!pd", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field6845;
        if (this.field6826 != null) {
            this.field6826.method2356();
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILza;)Le;")
    private final class536 method2796(int arg0, int arg1, class497 arg2) {
        ++field6867;
        class279 var4 = class85.field1242.method1972((byte) -58, this.field6865);
        if (arg1 >= -31) {
            method2798((class407) null, (byte) 84, 26, 46, 35, 101);
        }
        return var4.method1878(arg2, this.field6857, arg0, this.field6837, (byte) -38, class388.field5915, this.field6827);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
    public final void method2797(int arg0, byte arg1) {
        this.field6831 += (double) arg0 * this.field6847;
        this.field6849 = true;
        ++field6856;
        this.field6839 += (double) arg0 * this.field6828;
        if (arg1 <= -19) {
            if (this.field6864) {
                this.field6851 = (double) (class532.method3165(super.field6419, (int) this.field6831, false, (int) this.field6839) - this.field6858);
            } else if (this.field6835 != -1) {
                this.field6851 += this.field6836 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field6852;
                this.field6852 += (double) arg0 * this.field6836;
            } else {
                this.field6851 += (double) arg0 * this.field6852;
            }
            this.field6844 = 16383 & 8192 + (int) (2607.5945876176133D * Math.atan2(this.field6847, this.field6828));
            this.field6863 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field6852, this.field6843));
            if (this.field6842 != null) {
                this.field6857 += arg0;
                while (true) {
                    do {
                        do {
                            if (~this.field6842.field5599[this.field6827] <= ~this.field6857) {
                                return;
                            }
                            this.field6857 -= this.field6842.field5599[this.field6827];
                            ++this.field6827;
                            if (this.field6827 >= this.field6842.field5623.length) {
                                this.field6827 -= this.field6842.field5617;
                                if (~this.field6827 > -1 || this.field6827 >= this.field6842.field5623.length) {
                                    this.field6827 = 0;
                                }
                            }
                            this.field6837 = this.field6827 - -1;
                        } while (this.field6837 < this.field6842.field5623.length);
                        this.field6837 -= this.field6842.field5617;
                    } while (this.field6837 >= 0 && ~this.field6842.field5623.length < ~this.field6837);
                    this.field6837 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public final void method423(int arg0) {
        super.field6424 = super.field6418 = (short) ((int) (this.field6839 / 128.0D));
        super.field6423 = super.field6420 = (short) ((int) (this.field6831 / 128.0D));
        if (arg0 > -116) {
            field6850 = -115L;
        }
        ++field6846;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        ++field6833;
        if (arg0 == -1) {
            class536 var3 = this.method2796(0, -81, arg1);
            if (var3 != null) {
                class205 var4 = arg1.method1231();
                var4.method155(this.field6863);
                var4.method160(this.field6844);
                var4.method163((int) this.field6831, (int) this.field6851, (int) this.field6839);
                this.field6855 = var3.method305();
                this.method2794(arg0 ^ -16384, var3, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        if (arg0 != 2) {
            this.method423(-41);
        }
        ++field6866;
        class536 var3 = this.method2796(2048, arg0 + -95, arg1);
        if (var3 == null) {
            return null;
        } else {
            class205 var4 = arg1.method1231();
            var4.method155(this.field6863);
            var4.method160(this.field6844);
            var4.method163((int) this.field6831, (int) this.field6851, (int) this.field6839);
            if (this.field6826 != null) {
                class519 var5 = this.field6826.method2354();
                arg1.method1291(var3, var5, var4, (class182) null, 0);
            } else {
                var3.method295(var4, (class182) null, 0);
            }
            this.field6855 = var3.method305();
            this.method2794(arg0 + 16381, var3, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
    public final void method934(int arg0) {
        ++field6838;
        if (arg0 != 287) {
            this.field6831 = 3.013029302430007D;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class532.method3165(arg1, arg2, false, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field6864 = arg11;
        this.field6834 = arg10;
        this.field6854 = arg6;
        this.field6840 = arg8;
        this.field6829 = arg5;
        this.field6849 = false;
        this.field6858 = arg4;
        this.field6868 = arg9;
        this.field6865 = arg0;
        this.field6835 = arg7;
        int var13 = class85.field1242.method1972((byte) -58, this.field6865).field4398;
        if (~var13 != 0) {
            this.field6842 = class388.field5915.method1703(var13, -12536);
        } else {
            this.field6842 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lar;BIIII)V")
    public static final void method2798(class407 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6859;
        if (arg0.field6162 != -1 || arg0.field6161 != null) {
            int var6 = 0;
            int var7 = class141.field1911.field6100 * arg0.field6143 >> 8;
            if (arg0.field6163 < arg3) {
                var6 += -arg0.field6163 + arg3;
            } else if (arg3 < arg0.field6155) {
                var6 += arg0.field6155 - arg3;
            }
            if (arg0.field6147 < arg5) {
                var6 += -arg0.field6147 + arg5;
            } else if (~arg5 > ~arg0.field6160) {
                var6 += -arg5 + arg0.field6160;
            }
            int var8 = 44 % ((arg1 - 62) / 45);
            if (~arg0.field6154 != -1 && ~arg0.field6154 <= ~(var6 + -64) && ~class141.field1911.field6100 != -1 && ~arg0.field6159 == ~arg2) {
                var6 -= 64;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var9 = (arg0.field6154 - var6) * var7 / arg0.field6154;
                if (arg0.field6148 == null) {
                    if (arg0.field6162 >= 0) {
                        class230 var10 = class230.method1647(class300.field4717, arg0.field6162, 0);
                        if (var10 != null) {
                            class391 var11 = var10.method1646().method2497(class73.field1105);
                            class394 var12 = class394.method2524(var11, 100, var9);
                            var12.method2521(-1);
                            class411.field6231.method480(var12);
                            arg0.field6148 = var12;
                        }
                    }
                } else {
                    arg0.field6148.method2531(var9);
                }
                if (arg0.field6144 == null) {
                    if (arg0.field6161 != null && ~(arg0.field6151 -= arg4) >= -1) {
                        int var13 = (int) ((double) arg0.field6161.length * Math.random());
                        class230 var14 = class230.method1647(class300.field4717, arg0.field6161[var13], 0);
                        if (var14 != null) {
                            class391 var15 = var14.method1646().method2497(class73.field1105);
                            class394 var16 = class394.method2524(var15, 100, var9);
                            var16.method2521(0);
                            class411.field6231.method480(var16);
                            arg0.field6144 = var16;
                            arg0.field6151 = arg0.field6146 + (int) ((double) (arg0.field6164 - arg0.field6146) * Math.random());
                            return;
                        }
                    }
                } else {
                    arg0.field6144.method2531(var9);
                    if (arg0.field6144.method3147(100)) {
                        return;
                    }
                    arg0.field6144 = null;
                }
            } else {
                if (arg0.field6148 != null) {
                    class411.field6231.method482(arg0.field6148);
                    arg0.field6148 = null;
                }
                if (arg0.field6144 != null) {
                    class411.field6231.method482(arg0.field6144);
                    arg0.field6144 = null;
                }
            }
        }
    }
}
