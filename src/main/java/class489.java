import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class489 extends class144 {

    @OriginalMember(owner = "client!up", name = "H", descriptor = "I")
    private int field6982 = -1;

    @OriginalMember(owner = "client!up", name = "I", descriptor = "Z")
    private boolean field6983 = false;

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    private int field6985 = 0;

    @OriginalMember(owner = "client!up", name = "U", descriptor = "I")
    private int field6995 = 0;

    @OriginalMember(owner = "client!up", name = "cb", descriptor = "Z")
    private boolean field7003 = false;

    @OriginalMember(owner = "client!up", name = "xb", descriptor = "I")
    private int field7024 = 0;

    @OriginalMember(owner = "client!up", name = "pb", descriptor = "I")
    private int field7016 = 0;

    @OriginalMember(owner = "client!up", name = "yb", descriptor = "Z")
    private boolean field7025;

    @OriginalMember(owner = "client!up", name = "db", descriptor = "I")
    public int field7004;

    @OriginalMember(owner = "client!up", name = "V", descriptor = "I")
    private int field6996;

    @OriginalMember(owner = "client!up", name = "hb", descriptor = "I")
    public int field7008;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public int field6989;

    @OriginalMember(owner = "client!up", name = "Y", descriptor = "I")
    public int field6999;

    @OriginalMember(owner = "client!up", name = "ub", descriptor = "I")
    private int field7021;

    @OriginalMember(owner = "client!up", name = "qb", descriptor = "I")
    private int field7017;

    @OriginalMember(owner = "client!up", name = "tb", descriptor = "I")
    private int field7020;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "Lfo;")
    private class606 field6987;

    @OriginalMember(owner = "client!up", name = "ob", descriptor = "J")
    public static long field7015 = 0L;

    @OriginalMember(owner = "client!up", name = "L", descriptor = "D")
    private double field6986;

    @OriginalMember(owner = "client!up", name = "T", descriptor = "D")
    private double field6994;

    @OriginalMember(owner = "client!up", name = "X", descriptor = "D")
    private double field6998;

    @OriginalMember(owner = "client!up", name = "fb", descriptor = "D")
    private double field7006;

    @OriginalMember(owner = "client!up", name = "ib", descriptor = "D")
    private double field7009;

    @OriginalMember(owner = "client!up", name = "nb", descriptor = "D")
    private double field7014;

    @OriginalMember(owner = "client!up", name = "sb", descriptor = "D")
    private double field7019;

    @OriginalMember(owner = "client!up", name = "vb", descriptor = "D")
    private double field7022;

    @OriginalMember(owner = "client!up", name = "G", descriptor = "I")
    private int field6981;

    @OriginalMember(owner = "client!up", name = "J", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!up", name = "N", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
    private int field6991;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!up", name = "S", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!up", name = "W", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!up", name = "Z", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!up", name = "ab", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!up", name = "bb", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!up", name = "eb", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!up", name = "gb", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!up", name = "jb", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!up", name = "kb", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!up", name = "lb", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!up", name = "mb", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!up", name = "wb", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!up", name = "zb", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!up", name = "Ab", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!up", name = "rb", descriptor = "Lhda;")
    private class635 field7018;

    @OriginalMember(owner = "client!up", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field7018 != null) {
            this.field7018.method3584();
        }
        ++field7000;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lr;I)Lej;")
    public final class690 method627(class98 arg0, int arg1) {
        ++field7011;
        class397 var3 = this.method2859((byte) -108, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -7927) {
                this.method2857((byte) 65, -95);
            }
            class152 var4 = arg0.method777();
            var4.method165(this.field6981);
            var4.method170(this.field6991);
            var4.method158((int) this.field6998, (int) this.field7022, (int) this.field7006);
            this.method2858(var4, 0, var3, arg0);
            if (class372.field5162) {
                var3.method448(var4, (class299) null, class450.field6494, 0);
            } else {
                var3.method460(var4, (class299) null, 0);
            }
            if (this.field7018 != null) {
                class272 var5 = this.field7018.method3581();
                if (!class372.field5162) {
                    arg0.method737(var5);
                } else {
                    arg0.method799(var5, class450.field6494);
                }
            }
            this.field6983 = var3.method449();
            this.field7016 = var3.method478();
            this.field7024 = var3.method434();
            return null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BI)V")
    public final void method2857(byte arg0, int arg1) {
        ++field7027;
        this.field7003 = true;
        this.field7006 += (double) arg1 * this.field7009;
        this.field6998 += (double) arg1 * this.field7014;
        int var3 = -89 % ((-58 - arg0) / 39);
        if (this.field7025) {
            this.field7022 = (double) (class603.method3433((int) this.field7006, super.field3158, (int) this.field6998, -68) + -this.field6996);
        } else if (~this.field7017 == 0) {
            this.field7022 += (double) arg1 * this.field7019;
        } else {
            this.field7022 += this.field6986 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field7019;
            this.field7019 += (double) arg1 * this.field6986;
        }
        this.field6991 = 16383 & (int) (Math.atan2(this.field7014, this.field7009) * 2607.5945876176133D) - -8192;
        this.field6981 = (int) (Math.atan2(this.field7019, this.field6994) * 2607.5945876176133D) & 16383;
        if (this.field6987 != null) {
            this.field6985 += arg1;
            while (true) {
                do {
                    do {
                        if (this.field6985 <= this.field6987.field8699[this.field6995]) {
                            return;
                        }
                        this.field6985 -= this.field6987.field8699[this.field6995];
                        ++this.field6995;
                        if (this.field6995 >= this.field6987.field8707.length) {
                            this.field6995 -= this.field6987.field8721;
                            if (~this.field6995 > -1 || this.field6995 >= this.field6987.field8707.length) {
                                this.field6995 = 0;
                            }
                        }
                        this.field6982 = this.field6995 - -1;
                    } while (~this.field6982 > ~this.field6987.field8707.length);
                    this.field6982 -= this.field6987.field8721;
                } while (this.field6982 >= 0 && ~this.field6987.field8707.length < ~this.field6982);
                this.field6982 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(ILr;)Leh;")
    public final class203 method631(int arg0, class98 arg1) {
        ++field6997;
        if (arg0 != 1) {
            this.method634((byte) 116);
        }
        return null;
    }

    @OriginalMember(owner = "client!up", name = "j", descriptor = "(I)V")
    public final void method585(int arg0) {
        ++field7001;
        if (arg0 != 96) {
            this.field6985 = 9;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
    public class489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        super(arg1, arg2, arg3, -arg5 + class603.method3433(arg4, arg1, arg3, -46), arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
        this.field7025 = arg12;
        this.field7004 = arg7;
        this.field6996 = arg5;
        this.field7008 = arg10;
        this.field6989 = arg6;
        this.field6999 = arg11;
        this.field7021 = arg9;
        this.field7017 = arg8;
        this.field7003 = false;
        this.field7020 = arg0;
        int var14 = class554.field8108.method598(-14624, this.field7020).field1229;
        if (var14 == -1) {
            this.field6987 = null;
        } else {
            this.field6987 = class480.field6871.method1417(-3585, var14);
        }
    }

    @OriginalMember(owner = "client!up", name = "h", descriptor = "(I)Z")
    public final boolean method630(int arg0) {
        ++field6988;
        int var2 = 101 % ((-59 - arg0) / 44);
        return this.field6983;
    }

    @OriginalMember(owner = "client!up", name = "i", descriptor = "(I)I")
    public final int method626(int arg0) {
        ++field7023;
        return arg0 != -32768 ? 106 : this.field7016;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lq;ILda;Lr;)V")
    private final void method2858(class152 arg0, int arg1, class397 arg2, class98 arg3) {
        arg2.method471(arg0);
        ++field7026;
        class7[] var5 = arg2.method480();
        if (arg1 == 0) {
            class94[] var6 = arg2.method486();
            if ((this.field7018 == null || this.field7018.field8982) && (var5 != null || var6 != null)) {
                this.field7018 = class635.method3580(class148.field2508, true);
            }
            if (this.field7018 != null) {
                this.field7018.method3579(arg3, (long) class148.field2508, var5, var6, false);
                this.field7018.method3587(super.field3158, super.field2481, super.field2483, super.field2484, super.field2486);
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(ILr;)V")
    public final void method625(int arg0, class98 arg1) {
        ++field6990;
        class397 var3 = this.method2859((byte) -108, arg1, 0);
        if (var3 != null) {
            class152 var4 = arg1.method777();
            var4.method165(this.field6981);
            var4.method170(this.field6991);
            var4.method158((int) this.field6998, (int) this.field7022, (int) this.field7006);
            this.field7016 = var3.method478();
            this.field7024 = var3.method434();
            if (arg0 < 67) {
                this.method2859((byte) -93, (class98) null, -16);
            }
            this.method2858(var4, 0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
    public final int method634(byte arg0) {
        if (arg0 >= -102) {
            this.method2860(48, (byte) -34, -124, 64, 46);
        }
        ++field6992;
        return this.field7024;
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(Z)Z")
    public final boolean method633(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field6984;
            return false;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BLr;I)Lda;")
    private final class397 method2859(byte arg0, class98 arg1, int arg2) {
        ++field7010;
        class81 var4 = class554.field8108.method598(-14624, this.field7020);
        return arg0 != -108 ? null : var4.method617(this.field6995, arg2, class480.field6871, this.field6985, arg1, this.field6982, arg0 ^ -15645);
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IBIII)V")
    public final void method2860(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field7007;
        if (!this.field7003) {
            double var6 = (double) (-super.field3155 + arg3);
            double var8 = (double) (arg2 - super.field3154);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field7006 = (double) this.field7021 * var8 / var10 + (double) super.field3154;
            this.field6998 = (double) this.field7021 * var6 / var10 + (double) super.field3155;
            if (this.field7025) {
                this.field7022 = (double) (class603.method3433((int) this.field7006, super.field3158, (int) this.field6998, -69) - this.field6996);
            } else {
                this.field7022 = (double) super.field3160;
            }
        }
        double var12 = (double) (-arg0 + this.field7004 + 1);
        this.field7014 = ((double) arg3 + -this.field6998) / var12;
        this.field7009 = ((double) arg2 + -this.field7006) / var12;
        this.field6994 = Math.sqrt(this.field7014 * this.field7014 + this.field7009 * this.field7009);
        if (~this.field7017 != 0) {
            if (!this.field7003) {
                this.field7019 = -this.field6994 * Math.tan((double) this.field7017 * 0.02454369D);
            }
            this.field6986 = ((double) arg4 - this.field7022 - this.field7019 * var12) * 2.0D / (var12 * var12);
        } else {
            this.field7019 = ((double) arg4 + -this.field7022) / var12;
        }
        if (arg1 <= 77) {
            this.field6996 = -107;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IILr;B)Z")
    public final boolean method632(int arg0, int arg1, class98 arg2, byte arg3) {
        int var5 = 31 / ((-75 - arg3) / 40);
        ++field7002;
        return false;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lvj;IZLr;IIB)V")
    public final void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6) {
        if (arg6 < 22) {
            this.method2861(false);
        }
        ++field7013;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!up", name = "k", descriptor = "(I)V")
    public final void method1096(int arg0) {
        super.field2481 = super.field2483 = (short) ((int) (this.field6998 / 512.0D));
        int var2 = 120 / ((-63 - arg0) / 51);
        super.field2484 = super.field2486 = (short) ((int) (this.field7006 / 512.0D));
        ++field7012;
    }

    @OriginalMember(owner = "client!up", name = "g", descriptor = "(I)Z")
    public final boolean method592(int arg0) {
        ++field7005;
        if (arg0 != -15258) {
            this.method2860(-69, (byte) 83, 104, 71, 35);
        }
        return false;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public final void method2861(boolean arg0) {
        if (arg0) {
            this.field6996 = 19;
        }
        if (this.field7018 != null) {
            this.field7018.method3584();
        }
        ++field6993;
    }
}
