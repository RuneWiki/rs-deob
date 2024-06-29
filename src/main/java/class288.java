import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class288 extends class478 {

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    private int field3920 = 0;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
    private int field3924 = -32768;

    @OriginalMember(owner = "client!ao", name = "eb", descriptor = "I")
    private int field3941 = 0;

    @OriginalMember(owner = "client!ao", name = "pb", descriptor = "Z")
    private boolean field3952 = false;

    @OriginalMember(owner = "client!ao", name = "nb", descriptor = "I")
    private int field3950 = -1;

    @OriginalMember(owner = "client!ao", name = "gb", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    private int field3921;

    @OriginalMember(owner = "client!ao", name = "lb", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!ao", name = "fb", descriptor = "I")
    private int field3942;

    @OriginalMember(owner = "client!ao", name = "X", descriptor = "I")
    private int field3934;

    @OriginalMember(owner = "client!ao", name = "mb", descriptor = "I")
    public int field3949;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "I")
    public int field3917;

    @OriginalMember(owner = "client!ao", name = "kb", descriptor = "Lqg;")
    private class372 field3947;

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "D")
    private double field3929;

    @OriginalMember(owner = "client!ao", name = "V", descriptor = "D")
    private double field3932;

    @OriginalMember(owner = "client!ao", name = "W", descriptor = "D")
    private double field3933;

    @OriginalMember(owner = "client!ao", name = "Y", descriptor = "D")
    private double field3935;

    @OriginalMember(owner = "client!ao", name = "ab", descriptor = "D")
    private double field3937;

    @OriginalMember(owner = "client!ao", name = "bb", descriptor = "D")
    private double field3938;

    @OriginalMember(owner = "client!ao", name = "ib", descriptor = "D")
    private double field3945;

    @OriginalMember(owner = "client!ao", name = "ub", descriptor = "D")
    private double field3957;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!ao", name = "U", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ao", name = "Z", descriptor = "I")
    private int field3936;

    @OriginalMember(owner = "client!ao", name = "cb", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!ao", name = "db", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!ao", name = "hb", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!ao", name = "jb", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!ao", name = "ob", descriptor = "I")
    private int field3951;

    @OriginalMember(owner = "client!ao", name = "qb", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!ao", name = "rb", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!ao", name = "sb", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ao", name = "tb", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "Lm;")
    private class83 field3928;

    static {
        new class112("Select", "Auswählen", "Sélectionner", "Selecionar");
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)I", line = 4)
    public final int method205(byte arg0) {
        ++field3918;
        if (arg0 != 114) {
            this.field3941 = -123;
        }
        return this.field3924;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(ZI)V", line = 15)
    public static final void method1771(boolean arg0, int arg1) {
        class272.field3758 = arg1;
        ++field3925;
        if (arg0) {
            class235.field3326.method656(125);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Z)V", line = 27)
    public static final void method1772(boolean arg0) {
        for (int var1 = 0; class345.field4718 > var1; ++var1) {
            int var10002 = class189.field2715[var1]--;
            if (class189.field2715[var1] >= -10) {
                class89 var3 = class400.field5593[var1];
                if (var3 == null) {
                    var3 = class89.method607(class464.field6523, class325.field4478[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class189.field2715[var1] += var3.method608();
                    class400.field5593[var1] = var3;
                }
                if (~class189.field2715[var1] > -1) {
                    int var4;
                    if (~class468.field6565[var1] == -1) {
                        var4 = class197.field2835[var1] * class256.field3582 >> 8;
                    } else {
                        int var5 = (class468.field6565[var1] & 54049689) >> 24;
                        if (~class2.field21.field6766 != ~var5) {
                            var4 = 0;
                        } else {
                            int var6 = (class468.field6565[var1] & 255) * 128;
                            int var7 = 255 & class468.field6565[var1] >> 16;
                            int var8 = var7 * 128 + 64 + -class2.field21.field6765;
                            if (~var8 > -1) {
                                var8 = -var8;
                            }
                            int var9 = (65321 & class468.field6565[var1]) >> 8;
                            int var10 = var9 * 128 + 64 - class2.field21.field6746;
                            if (~var10 > -1) {
                                var10 = -var10;
                            }
                            int var11 = var8 + var10 + -128;
                            if (var11 > var6) {
                                class189.field2715[var1] = -100;
                                continue;
                            }
                            if (var11 < 0) {
                                var11 = 0;
                            }
                            var4 = class197.field2835[var1] * class491.field6932 * (-var11 + var6) / var6 >> 8;
                        }
                    }
                    if (~var4 < -1) {
                        class144 var12 = var3.method609().method884(class240.field3383);
                        class263 var13 = class263.method1631(var12, 100, var4);
                        var13.method1640(class317.field4304[var1] + -1);
                        class386.field5445.method1315(var13);
                    }
                    class189.field2715[var1] = -100;
                }
            } else {
                --class345.field4718;
                for (int var2 = var1; ~class345.field4718 < ~var2; ++var2) {
                    class325.field4478[var2] = class325.field4478[var2 + 1];
                    class400.field5593[var2] = class400.field5593[var2 + 1];
                    class317.field4304[var2] = class317.field4304[var2 + 1];
                    class189.field2715[var2] = class189.field2715[var2 + 1];
                    class468.field6565[var2] = class468.field6565[var2 - -1];
                    class197.field2835[var2] = class197.field2835[var2 + 1];
                }
                --var1;
            }
        }
        if (arg0) {
            field3955 = -61;
        }
        ++field3926;
        if (class7.field122 && !class59.method439((byte) 113)) {
            if (~class47.field766 != -1 && ~class282.field3867 != 0) {
                class2.method8(class47.field766, false, class282.field3867, class101.field1440, 0, (byte) 81);
            }
            class7.field122 = false;
        } else if (~class47.field766 != -1 && class282.field3867 != -1 && !class59.method439((byte) 112)) {
            ++class275.field3803;
            class131.method793(class8.field172, -68);
            class366.field5214.method2481(class282.field3867, true);
            class282.field3867 = -1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V", line = 165)
    public final void method1773(int arg0) {
        ++field3923;
        if (arg0 != 255) {
            this.field3951 = 113;
        }
        if (this.field3928 != null) {
            this.field3928.method573();
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(II)V", line = 184)
    public final void method1774(int arg0, int arg1) {
        ++field3931;
        this.field3952 = true;
        if (arg0 > -72) {
            this.field3936 = -42;
        }
        this.field3957 += (double) arg1 * this.field3938;
        this.field3933 += (double) arg1 * this.field3935;
        if (this.field3942 != -1) {
            this.field3932 += this.field3937 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field3945;
            this.field3945 += (double) arg1 * this.field3937;
        } else {
            this.field3932 += (double) arg1 * this.field3945;
        }
        this.field3951 = (int) (Math.atan2(this.field3935, this.field3938) * 2607.5945876176133D) + 8192 & 16383;
        this.field3936 = (int) (Math.atan2(this.field3945, this.field3929) * 2607.5945876176133D) & 16383;
        if (this.field3947 != null) {
            this.field3920 += arg1;
            while (true) {
                do {
                    do {
                        if (this.field3947.field5283[this.field3941] >= this.field3920) {
                            return;
                        }
                        this.field3920 -= this.field3947.field5283[this.field3941];
                        ++this.field3941;
                        if (~this.field3941 <= ~this.field3947.field5278.length) {
                            this.field3941 -= this.field3947.field5251;
                            if (~this.field3941 > -1 || this.field3941 >= this.field3947.field5278.length) {
                                this.field3941 = 0;
                            }
                        }
                        this.field3950 = this.field3941 - -1;
                    } while (~this.field3950 > ~this.field3947.field5278.length);
                    this.field3950 -= this.field3947.field5251;
                } while (this.field3950 >= 0 && ~this.field3950 > ~this.field3947.field5278.length);
                this.field3950 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)Z", line = 241)
    public final boolean method195(int arg0) {
        if (arg0 < 91) {
            this.field3938 = -0.38484117164096854D;
        }
        ++field3930;
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(Lkm;I)V", line = 254)
    public final void method197(class487 arg0, int arg1) {
        int var3 = 120 % ((64 - arg1) / 59);
        ++field3939;
        class232 var4 = this.method1775(arg0, 40133520, 0);
        if (var4 != null) {
            class250 var5 = arg0.method1105();
            var5.method1379(this.field3936);
            var5.method1378(this.field3951);
            var5.method1380((int) this.field3933, (int) this.field3932, (int) this.field3957);
            this.field3924 = var4.method55();
            this.method1776(var4, true, arg0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lkm;II)Lab;", line = 280)
    private final class232 method1775(class487 arg0, int arg1, int arg2) {
        ++field3956;
        if (arg1 != 40133520) {
            this.method202((byte) 3);
        }
        class321 var4 = class163.field2348.method548(this.field3921, (byte) -115);
        return var4.method1931(false, class31.field505, arg0, arg2, this.field3941, this.field3950, this.field3920);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)V", line = 293)
    public final void method510(byte arg0) {
        super.field6753 = super.field6751 = (short) ((int) (this.field3933 / 128.0D));
        ++field3946;
        super.field6747 = super.field6749 = (short) ((int) (this.field3957 / 128.0D));
        int var2 = -32 % ((27 - arg0) / 63);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILkm;IZILkj;B)V", line = 304)
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        if (arg6 != 59) {
            this.method193((class487) null, 52);
        }
        ++field3919;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lab;ZLkm;)V", line = 323)
    private final void method1776(class232 arg0, boolean arg1, class487 arg2) {
        ++field3944;
        class356[] var4 = arg0.method40();
        class309[] var5 = arg0.method25();
        if (!arg1) {
            this.field3935 = 0.4780675962104562D;
        }
        if ((this.field3928 == null || this.field3928.field1241) && (var4 != null || var5 != null)) {
            this.field3928 = new class83(class356.field4972);
        }
        if (this.field3928 != null) {
            this.field3928.method576(arg2, (long) class356.field4972, var4, var5, false);
            this.field3928.method572(super.field6766, super.field6753, super.field6751, super.field6747, super.field6749);
        }
    }

    @OriginalMember(owner = "client!ao", name = "finalize", descriptor = "()V", line = 348)
    protected final void finalize() {
        if (this.field3928 != null) {
            this.field3928.method573();
        }
        ++field3953;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 453)
    public class288(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field3943 = arg9;
        this.field3921 = arg0;
        this.field3952 = false;
        this.field3948 = arg10;
        this.field3942 = arg7;
        this.field3934 = arg8;
        this.field3949 = arg6;
        this.field3917 = arg5;
        int var12 = class163.field2348.method548(this.field3921, (byte) -119).field4391;
        if (var12 == -1) {
            this.field3947 = null;
        } else {
            this.field3947 = class31.field505.method950(true, var12);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIZII)V", line = 363)
    public final void method1777(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!this.field3952) {
            double var6 = (double) (-super.field6765 + arg0);
            double var8 = (double) (-super.field6746 + arg1);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3933 = (double) this.field3934 * var6 / var10 + (double) super.field6765;
            this.field3957 = (double) this.field3934 * var8 / var10 + (double) super.field6746;
            this.field3932 = (double) super.field6755;
        }
        ++field3940;
        double var12 = (double) (this.field3949 + 1 + -arg4);
        this.field3935 = ((double) arg0 + -this.field3933) / var12;
        if (!arg2) {
            this.method1774(-59, -123);
        }
        this.field3938 = ((double) arg1 + -this.field3957) / var12;
        this.field3929 = Math.sqrt(this.field3938 * this.field3938 + this.field3935 * this.field3935);
        if (this.field3942 != -1) {
            if (!this.field3952) {
                this.field3945 = -this.field3929 * Math.tan((double) this.field3942 * 0.02454369D);
            }
            this.field3937 = ((double) arg3 + -this.field3932 + -(this.field3945 * var12)) * 2.0D / (var12 * var12);
        } else {
            this.field3945 = ((double) arg3 + -this.field3932) / var12;
        }
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(Lkm;I)Lto;", line = 417)
    public final class370 method193(class487 arg0, int arg1) {
        ++field3927;
        class232 var3 = this.method1775(arg0, 40133520, 1024);
        if (var3 == null) {
            return null;
        } else {
            class250 var4 = arg0.method1105();
            var4.method1379(this.field3936);
            var4.method1378(this.field3951);
            if (arg1 >= -6) {
                this.field3945 = 0.22130895628513708D;
            }
            var4.method1380((int) this.field3933, (int) this.field3932, (int) this.field3957);
            if (this.field3928 != null) {
                class473 var5 = this.field3928.method567();
                arg0.method1063(var3, var5, var4, (class219) null, 0);
            } else {
                var3.method41(var4, (class219) null, 0);
            }
            this.field3924 = var3.method55();
            this.method1776(var3, true, arg0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lkm;BII)Z", line = 478)
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 123) {
            this.method1774(-45, -18);
        }
        ++field3922;
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 491)
    public final void method202(byte arg0) {
        if (arg0 < 42) {
            this.field3945 = 1.266247056414139D;
        }
        ++field3954;
        throw new IllegalStateException();
    }
}
