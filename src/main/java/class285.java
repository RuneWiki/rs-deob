import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class285 extends class116 {

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    private int field3934 = -1;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    private int field3951 = 0;

    @OriginalMember(owner = "client!lg", name = "ib", descriptor = "I")
    private int field3970 = 0;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    private int field3941 = -32768;

    @OriginalMember(owner = "client!lg", name = "kb", descriptor = "Z")
    private boolean field3972 = false;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    public int field3931;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    private int field3958;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
    private int field3957;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    private int field3954;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Z")
    private boolean field3936;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    private int field3944;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "Lvf;")
    private class104 field3964;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "[[I")
    public static int[][] field3962 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public static int field3961 = -1;

    @OriginalMember(owner = "client!lg", name = "gb", descriptor = "J")
    public static long field3968 = 0L;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "Lwj;")
    public static class270 field3939 = new class270(89, 8);

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "D")
    private double field3932;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "D")
    private double field3935;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "D")
    private double field3942;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "D")
    private double field3947;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "D")
    private double field3949;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "D")
    private double field3960;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "D")
    private double field3963;

    @OriginalMember(owner = "client!lg", name = "jb", descriptor = "D")
    private double field3971;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    private int field3938;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    private int field3956;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!lg", name = "hb", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!lg", name = "lb", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!lg", name = "mb", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Lbq;")
    private class190 field3930;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLya;I)Lt;", line = 4)
    private final class471 method1693(boolean arg0, class38 arg1, int arg2) {
        ++field3959;
        if (arg0) {
            method1695((byte) -100);
        }
        class398 var4 = class27.field357.method1479(this.field3958, (byte) -122);
        return var4.method2391(this.field3934, class222.field3168, arg2, this.field3970, this.field3951, arg1, 10061);
    }

    @OriginalMember(owner = "client!lg", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() {
        if (this.field3930 != null) {
            this.field3930.method1197();
        }
        ++field3969;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V", line = 31)
    public class285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class242.method1465(107, arg1, arg3, arg2) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field3931 = arg6;
        this.field3958 = arg0;
        this.field3933 = arg5;
        this.field3957 = arg7;
        this.field3954 = arg8;
        this.field3936 = arg11;
        this.field3937 = arg9;
        this.field3944 = arg4;
        this.field3972 = false;
        this.field3943 = arg10;
        int var13 = class27.field357.method1479(this.field3958, (byte) -114).field5824;
        if (~var13 == 0) {
            this.field3964 = null;
        } else {
            this.field3964 = class222.field3168.method126(-69, var13);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)I", line = 55)
    public final int method792(boolean arg0) {
        if (!arg0) {
            return 106;
        } else {
            ++field3966;
            return this.field3941;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lga;Ljava/awt/Canvas;BLdr;I)Lya;", line = 67)
    public static final class38 method1694(class277 arg0, Canvas arg1, byte arg2, class504 arg3, int arg4) {
        if (arg2 != 24) {
            method1695((byte) -107);
        }
        ++field3965;
        return new class163(arg4, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V", line = 82)
    public static void method1695(byte arg0) {
        int var1 = 88 / ((-77 - arg0) / 36);
        field3939 = null;
        field3962 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lya;IZLij;III)V", line = 93)
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            this.field3932 = 0.33269214524378177D;
        }
        ++field3946;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILya;I)Z", line = 105)
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        ++field3974;
        if (!arg0) {
            this.method498((class38) null, 105, true, (class291) null, -5, 20, 29);
        }
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBII)V", line = 117)
    public final void method1696(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (!this.field3972) {
            double var6 = (double) (arg0 - super.field1732);
            double var8 = (double) (arg1 - super.field1735);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3960 = (double) this.field3954 * var6 / var10 + (double) super.field1732;
            this.field3947 = (double) this.field3954 * var8 / var10 + (double) super.field1735;
            if (!this.field3936) {
                this.field3963 = (double) super.field1734;
            } else {
                this.field3963 = (double) (class242.method1465(119, super.field1738, (int) this.field3947, (int) this.field3960) - this.field3944);
            }
        }
        if (arg2 < 109) {
            this.field3971 = -0.08521709671515136D;
        }
        ++field3929;
        double var12 = (double) (1 - arg3 + this.field3931);
        this.field3932 = ((double) arg1 + -this.field3947) / var12;
        this.field3942 = ((double) arg0 + -this.field3960) / var12;
        this.field3971 = Math.sqrt(this.field3942 * this.field3942 + this.field3932 * this.field3932);
        if (~this.field3957 != 0) {
            if (!this.field3972) {
                this.field3935 = -this.field3971 * Math.tan((double) this.field3957 * 0.02454369D);
            }
            this.field3949 = ((double) arg4 + -this.field3963 + -(this.field3935 * var12)) * 2.0D / (var12 * var12);
        } else {
            this.field3935 = ((double) arg4 + -this.field3963) / var12;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lya;BLt;)V", line = 159)
    private final void method1697(class38 arg0, byte arg1, class471 arg2) {
        ++field3945;
        class521[] var4 = arg2.method406();
        class169[] var5 = arg2.method374();
        if (arg1 < 29) {
            this.field3963 = 0.5659579528607078D;
        }
        if ((this.field3930 == null || this.field3930.field2732) && (var4 != null || var5 != null)) {
            this.field3930 = new class190(class441.field6516);
        }
        if (this.field3930 != null) {
            this.field3930.method1188(arg0, (long) class441.field6516, var4, var5, false);
            this.field3930.method1190(super.field1738, super.field1729, super.field1736, super.field1730, super.field1742);
        }
    }

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "(I)V", line = 190)
    public final void method610(int arg0) {
        ++field3955;
        super.field1729 = super.field1736 = (short) ((int) (this.field3960 / 128.0D));
        if (arg0 == 7) {
            super.field1730 = super.field1742 = (short) ((int) (this.field3947 / 128.0D));
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I", line = 212)
    public static final int method1698(int arg0, int arg1) {
        if (arg0 >= -59) {
            field3961 = 114;
        }
        ++field3953;
        int var2 = 0;
        if (arg1 < 0 || ~arg1 <= -65537) {
            var2 += 16;
            arg1 >>>= 16;
        }
        if (~arg1 <= -257) {
            var2 += 8;
            arg1 >>>= 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 1;
            ++var2;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(ILya;)V", line = 261)
    public final void method493(int arg0, class38 arg1) {
        ++field3973;
        class471 var3 = this.method1693(false, arg1, 0);
        if (arg0 >= -114) {
            this.field3943 = 50;
        }
        if (var3 != null) {
            class122 var4 = arg1.method280();
            var4.method183(this.field3956);
            var4.method181(this.field3938);
            var4.method188((int) this.field3960, (int) this.field3963, (int) this.field3947);
            this.field3941 = var3.method380();
            this.method1697(arg1, (byte) 69, var3);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 284)
    public final void method1699(int arg0) {
        ++field3952;
        if (arg0 < 59) {
            this.method1700(-3, true);
        }
        if (this.field3930 != null) {
            this.field3930.method1197();
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lya;B)Lmf;", line = 299)
    public final class289 method484(class38 arg0, byte arg1) {
        if (arg1 < 111) {
            this.method498((class38) null, -33, true, (class291) null, 50, 66, 102);
        }
        ++field3967;
        class471 var3 = this.method1693(false, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class122 var4 = arg0.method280();
            var4.method183(this.field3956);
            var4.method181(this.field3938);
            var4.method188((int) this.field3960, (int) this.field3963, (int) this.field3947);
            if (this.field3930 == null) {
                var3.method397(var4, (class387) null, 0);
            } else {
                class523 var5 = this.field3930.method1193();
                arg0.method312(var3, var5, var4, (class387) null, 0);
            }
            this.field3941 = var3.method380();
            this.method1697(arg0, (byte) 55, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)Z", line = 332)
    public final boolean method492(int arg0) {
        ++field3950;
        if (arg0 != -1) {
            this.field3970 = -2;
        }
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V", line = 344)
    public final void method1700(int arg0, boolean arg1) {
        this.field3972 = true;
        this.field3947 += (double) arg0 * this.field3932;
        this.field3960 += (double) arg0 * this.field3942;
        ++field3948;
        if (!arg1) {
            if (!this.field3936) {
                if (this.field3957 == -1) {
                    this.field3963 += (double) arg0 * this.field3935;
                } else {
                    this.field3963 += this.field3949 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3935;
                    this.field3935 += (double) arg0 * this.field3949;
                }
            } else {
                this.field3963 = (double) (class242.method1465(93, super.field1738, (int) this.field3947, (int) this.field3960) + -this.field3944);
            }
            this.field3938 = 8192 + (int) (Math.atan2(this.field3942, this.field3932) * 2607.5945876176133D) & 16383;
            this.field3956 = (int) (Math.atan2(this.field3935, this.field3971) * 2607.5945876176133D) & 16383;
            if (this.field3964 != null) {
                this.field3951 += arg0;
                while (true) {
                    do {
                        do {
                            if (this.field3964.field1575[this.field3970] >= this.field3951) {
                                return;
                            }
                            this.field3951 -= this.field3964.field1575[this.field3970];
                            ++this.field3970;
                            if (this.field3964.field1551.length <= this.field3970) {
                                this.field3970 -= this.field3964.field1567;
                                if (this.field3970 < 0 || this.field3964.field1551.length <= this.field3970) {
                                    this.field3970 = 0;
                                }
                            }
                            this.field3934 = this.field3970 + 1;
                        } while (~this.field3934 > ~this.field3964.field1551.length);
                        this.field3934 -= this.field3964.field1567;
                    } while (this.field3934 >= 0 && ~this.field3964.field1551.length < ~this.field3934);
                    this.field3934 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "(I)V", line = 418)
    public final void method495(int arg0) {
        if (arg0 < -104) {
            ++field3940;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 453)
    public static final void method1701(int arg0) {
        if (class33.field438 != null) {
            class33.field438.method2839(-20828);
            class33.field438 = null;
        }
        ++field3928;
        class142.method959(-21808);
        class117.method830();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class82.field1229[var1].method945((byte) 66);
        }
        class96.method706(-4701, false);
        System.gc();
        class2.method6(21689, 2);
        class486.field7122 = false;
        class173.field2570 = -1;
        class371.method2226(true, arg0 + 24741);
        class38.field474 = 0;
        class434.field6363 = 0;
        class403.field5918 = 0;
        class14.field204 = 0;
        class510.field7566 = 0;
        for (int var2 = 0; ~var2 > ~class218.field3046.length; ++var2) {
            class218.field3046[var2] = null;
        }
        class129.method893(127);
        for (int var3 = 0; ~var3 > -2049; ++var3) {
            class12.field182[var3] = null;
        }
        class275.field3772 = 0;
        for (int var4 = 0; var4 < 32768; ++var4) {
            class378.field5533[var4] = null;
        }
        class36.field457.method1490(true);
        class146.method977(61);
        class28.field363 = 0;
        class421.field6166.method929(true);
        class98.method720(true);
        class457.method2683(arg0 ^ arg0);
        class227.method1411(35044, true);
        try {
            class390.method2298("loggedout", class202.field2840.field7425, (byte) 80);
        } catch (Throwable var5) {
        }
        class349.field5098 = null;
        class203.field2852 = 0L;
    }
}
