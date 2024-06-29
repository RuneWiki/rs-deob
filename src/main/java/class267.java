import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class267 extends class237 {

    @OriginalMember(owner = "client!jm", name = "G", descriptor = "I")
    private int field3949 = -1;

    @OriginalMember(owner = "client!jm", name = "T", descriptor = "I")
    private int field3960 = -32768;

    @OriginalMember(owner = "client!jm", name = "K", descriptor = "I")
    private int field3953 = 0;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "Z")
    private boolean field3938 = false;

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
    private int field3944 = 0;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
    private int field3940;

    @OriginalMember(owner = "client!jm", name = "N", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!jm", name = "hb", descriptor = "Z")
    private boolean field3974;

    @OriginalMember(owner = "client!jm", name = "ob", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!jm", name = "cb", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!jm", name = "V", descriptor = "I")
    private int field3962;

    @OriginalMember(owner = "client!jm", name = "P", descriptor = "I")
    private int field3957;

    @OriginalMember(owner = "client!jm", name = "H", descriptor = "I")
    public int field3950;

    @OriginalMember(owner = "client!jm", name = "I", descriptor = "I")
    private int field3951;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "Laba;")
    private class224 field3939;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "D")
    private double field3945;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "D")
    private double field3947;

    @OriginalMember(owner = "client!jm", name = "U", descriptor = "D")
    private double field3961;

    @OriginalMember(owner = "client!jm", name = "W", descriptor = "D")
    private double field3963;

    @OriginalMember(owner = "client!jm", name = "Y", descriptor = "D")
    private double field3965;

    @OriginalMember(owner = "client!jm", name = "ab", descriptor = "D")
    private double field3967;

    @OriginalMember(owner = "client!jm", name = "bb", descriptor = "D")
    private double field3968;

    @OriginalMember(owner = "client!jm", name = "jb", descriptor = "D")
    private double field3976;

    @OriginalMember(owner = "client!jm", name = "lb", descriptor = "F")
    public static float field3978;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    private int field3946;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!jm", name = "J", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!jm", name = "M", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!jm", name = "O", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!jm", name = "R", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!jm", name = "S", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!jm", name = "X", descriptor = "I")
    private int field3964;

    @OriginalMember(owner = "client!jm", name = "Z", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!jm", name = "db", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!jm", name = "eb", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!jm", name = "fb", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!jm", name = "gb", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!jm", name = "kb", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!jm", name = "mb", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!jm", name = "nb", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!jm", name = "ib", descriptor = "Lqv;")
    private class96 field3975;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lqa;Z)V")
    public final void method166(class167 arg0, boolean arg1) {
        ++field3971;
        class520 var3 = this.method1703(0, arg0, 8192);
        if (var3 != null) {
            class105 var4 = arg0.method1038();
            var4.method621(this.field3946);
            var4.method616(this.field3964);
            var4.method619((int) this.field3963, (int) this.field3976, (int) this.field3968);
            this.field3960 = var3.method1954();
            this.method1701(arg0, var3, (byte) 15);
            if (!arg1) {
                this.method165((byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "(B)V")
    public final void method504(byte arg0) {
        if (arg0 != -126) {
            this.field3939 = null;
        }
        super.field3469 = super.field3459 = (short) ((int) (this.field3963 / 128.0D));
        super.field3472 = super.field3462 = (short) ((int) (this.field3968 / 128.0D));
        ++field3952;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILqa;IIZLse;I)V")
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        if (arg2 != -4) {
            this.field3967 = -0.7879567012379374D;
        }
        ++field3972;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lqa;Lr;B)V")
    private final void method1701(class167 arg0, class520 arg1, byte arg2) {
        ++field3942;
        class26[] var4 = arg1.method1964();
        class200[] var5 = arg1.method1970();
        if ((this.field3975 == null || this.field3975.field1183) && (var4 != null || var5 != null)) {
            this.field3975 = class96.method552(class576.field8505);
        }
        if (arg2 != 15) {
            this.field3946 = -38;
        }
        if (this.field3975 != null) {
            this.field3975.method547(arg0, (long) class576.field8505, var4, var5, false);
            this.field3975.method557(super.field3457, super.field3469, super.field3459, super.field3472, super.field3462);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        if (arg3 != 77) {
            return false;
        } else {
            ++field3948;
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)Z")
    public final boolean method167(boolean arg0) {
        if (!arg0) {
            return true;
        } else {
            ++field3943;
            return false;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V")
    public final void method1702(int arg0, int arg1) {
        ++field3956;
        this.field3963 += (double) arg0 * this.field3961;
        if (arg1 != -25451) {
            this.field3950 = 126;
        }
        this.field3938 = true;
        this.field3968 += (double) arg0 * this.field3965;
        if (!this.field3974) {
            if (this.field3957 != -1) {
                this.field3976 += this.field3947 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field3945;
                this.field3945 += (double) arg0 * this.field3947;
            } else {
                this.field3976 += (double) arg0 * this.field3945;
            }
        } else {
            this.field3976 = (double) (class226.method1477(super.field3457, true, (int) this.field3963, (int) this.field3968) - this.field3951);
        }
        this.field3964 = 16383 & 8192 + (int) (2607.5945876176133D * Math.atan2(this.field3961, this.field3965));
        this.field3946 = (int) (2607.5945876176133D * Math.atan2(this.field3945, this.field3967)) & 16383;
        if (this.field3939 != null) {
            this.field3944 += arg0;
            while (true) {
                do {
                    do {
                        if (~this.field3944 >= ~this.field3939.field3307[this.field3953]) {
                            return;
                        }
                        this.field3944 -= this.field3939.field3307[this.field3953];
                        ++this.field3953;
                        if (~this.field3953 <= ~this.field3939.field3296.length) {
                            this.field3953 -= this.field3939.field3290;
                            if (this.field3953 < 0 || ~this.field3953 <= ~this.field3939.field3296.length) {
                                this.field3953 = 0;
                            }
                        }
                        this.field3949 = this.field3953 - -1;
                    } while (~this.field3939.field3296.length < ~this.field3949);
                    this.field3949 -= this.field3939.field3290;
                } while (this.field3949 >= 0 && ~this.field3949 > ~this.field3939.field3296.length);
                this.field3949 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILqa;I)Lr;")
    private final class520 method1703(int arg0, class167 arg1, int arg2) {
        ++field3979;
        if (arg2 != 8192) {
            this.field3965 = 0.5661905018329598D;
        }
        class465 var4 = class138.field1821.method2251(this.field3962, false);
        return var4.method2760(arg1, arg0, this.field3944, class470.field7205, this.field3953, (byte) -60, this.field3949);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)V")
    public final void method165(byte arg0) {
        ++field3977;
        if (arg0 != -33) {
            this.method504((byte) 92);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILqa;)Llb;")
    public final class239 method169(int arg0, class167 arg1) {
        ++field3958;
        class520 var3 = this.method1703(2048, arg1, 8192);
        if (arg0 != -911932384) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            class105 var4 = arg1.method1038();
            var4.method621(this.field3946);
            var4.method616(this.field3964);
            var4.method619((int) this.field3963, (int) this.field3976, (int) this.field3968);
            if (this.field3975 != null) {
                class510 var5 = this.field3975.method550();
                arg1.method1005(var3, var5, var4, (class525) null, 0);
            } else {
                var3.method1965(var4, (class525) null, 0);
            }
            this.field3960 = var3.method1954();
            this.method1701(arg1, var3, (byte) 15);
            return null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class226.method1477(arg1, true, arg2, arg3) + -arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field3940 = arg8;
        this.field3955 = arg10;
        this.field3974 = arg11;
        this.field3981 = arg9;
        this.field3938 = false;
        this.field3969 = arg6;
        this.field3962 = arg0;
        this.field3957 = arg7;
        this.field3950 = arg5;
        this.field3951 = arg4;
        int var13 = class138.field1821.method2251(this.field3962, false).field6708;
        if (~var13 != 0) {
            this.field3939 = class470.field7205.method3498(false, var13);
        } else {
            this.field3939 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1704(byte[] arg0, int arg1) {
        ++field3970;
        if (arg1 != 1282) {
            method1704((byte[]) null, 63);
        }
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class473.method2883(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public final void method1705(int arg0) {
        if (this.field3975 != null) {
            this.field3975.method556();
        }
        ++field3959;
        if (arg0 != 128) {
            this.method159(-37);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIBII)V")
    public final void method1706(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = -53 % ((-57 - arg2) / 53);
        ++field3966;
        if (!this.field3938) {
            double var7 = (double) (arg0 - super.field3464);
            double var9 = (double) (-super.field3463 + arg1);
            double var11 = Math.sqrt(var7 * var7 + var9 * var9);
            this.field3968 = (double) this.field3940 * var9 / var11 + (double) super.field3463;
            this.field3963 = (double) this.field3940 * var7 / var11 + (double) super.field3464;
            if (!this.field3974) {
                this.field3976 = (double) super.field3460;
            } else {
                this.field3976 = (double) (class226.method1477(super.field3457, true, (int) this.field3963, (int) this.field3968) - this.field3951);
            }
        }
        double var13 = (double) (-arg4 + this.field3969 - -1);
        this.field3961 = ((double) arg0 - this.field3963) / var13;
        this.field3965 = ((double) arg1 + -this.field3968) / var13;
        this.field3967 = Math.sqrt(this.field3965 * this.field3965 + this.field3961 * this.field3961);
        if (~this.field3957 != 0) {
            if (!this.field3938) {
                this.field3945 = -this.field3967 * Math.tan((double) this.field3957 * 0.02454369D);
            }
            this.field3947 = ((double) arg3 + -this.field3976 + -(this.field3945 * var13)) * 2.0D / (var13 * var13);
        } else {
            this.field3945 = ((double) arg3 - this.field3976) / var13;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLqa;)Led;")
    public final class115 method157(byte arg0, class167 arg1) {
        ++field3980;
        int var3 = 26 % ((14 - arg0) / 48);
        return null;
    }

    @OriginalMember(owner = "client!jm", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3975 != null) {
            this.field3975.method556();
        }
        ++field3954;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(BI)V")
    public static final void method1707(byte arg0, int arg1) {
        ++field3973;
        if (class159.method929(0, arg1)) {
            if (arg0 != -36) {
                field3978 = 0.36060336F;
            }
            class311[] var2 = class251.field3650[arg1];
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                class311 var4 = var2[var3];
                if (var4 != null) {
                    var4.field4542 = 0;
                    var4.field4516 = 1;
                    var4.field4613 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "(I)I")
    public final int method159(int arg0) {
        int var2 = 87 % ((arg0 - -30) / 50);
        ++field3941;
        return this.field3960;
    }
}
