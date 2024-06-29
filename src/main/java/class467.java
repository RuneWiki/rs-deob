import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class467 extends class140 {

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "Z")
    private boolean field6969 = false;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    private int field6973 = -32768;

    @OriginalMember(owner = "client!bl", name = "cb", descriptor = "I")
    private int field6988 = -1;

    @OriginalMember(owner = "client!bl", name = "Z", descriptor = "I")
    private int field6985 = 0;

    @OriginalMember(owner = "client!bl", name = "mb", descriptor = "I")
    private int field6998 = 0;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public int field6971;

    @OriginalMember(owner = "client!bl", name = "ib", descriptor = "I")
    private int field6994;

    @OriginalMember(owner = "client!bl", name = "hb", descriptor = "I")
    public int field6993;

    @OriginalMember(owner = "client!bl", name = "bb", descriptor = "I")
    public int field6987;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public int field6957;

    @OriginalMember(owner = "client!bl", name = "ab", descriptor = "Z")
    private boolean field6986;

    @OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
    private int field6981;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    private int field6960;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    private int field6967;

    @OriginalMember(owner = "client!bl", name = "lb", descriptor = "Lvr;")
    private class91 field6997;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public static int field6963 = 0;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "D")
    private double field6961;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "D")
    private double field6964;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "D")
    private double field6965;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "D")
    private double field6976;

    @OriginalMember(owner = "client!bl", name = "U", descriptor = "D")
    private double field6980;

    @OriginalMember(owner = "client!bl", name = "db", descriptor = "D")
    private double field6989;

    @OriginalMember(owner = "client!bl", name = "nb", descriptor = "D")
    private double field6999;

    @OriginalMember(owner = "client!bl", name = "ob", descriptor = "D")
    private double field7000;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    private int field6956;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!bl", name = "S", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!bl", name = "T", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!bl", name = "W", descriptor = "I")
    public static int field6982;

    @OriginalMember(owner = "client!bl", name = "Y", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!bl", name = "fb", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!bl", name = "gb", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!bl", name = "jb", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!bl", name = "kb", descriptor = "I")
    private int field6996;

    @OriginalMember(owner = "client!bl", name = "X", descriptor = "Luu;")
    public static class191 field6983;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "Ljg;")
    private class228 field6975;

    @OriginalMember(owner = "client!bl", name = "eb", descriptor = "Z")
    public static boolean field6990;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method2805(int arg0) {
        field6983 = null;
        if (arg0 != 0) {
            field6963 = 109;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZI)V")
    public final void method2806(boolean arg0, int arg1) {
        ++field6982;
        this.field6980 += (double) arg1 * this.field6999;
        if (arg0) {
            this.field6975 = null;
        }
        this.field6969 = true;
        this.field6964 += (double) arg1 * this.field6976;
        if (this.field6986) {
            this.field6989 = (double) (class352.method2264(-109, super.field1866, (int) this.field6964, (int) this.field6980) - this.field6994);
        } else if (~this.field6960 != 0) {
            this.field6989 += this.field6965 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field7000;
            this.field7000 += (double) arg1 * this.field6965;
        } else {
            this.field6989 += (double) arg1 * this.field7000;
        }
        this.field6956 = 16383 & (int) (Math.atan2(this.field6999, this.field6976) * 2607.5945876176133D) + 8192;
        this.field6996 = (int) (2607.5945876176133D * Math.atan2(this.field7000, this.field6961)) & 16383;
        if (this.field6997 != null) {
            this.field6985 += arg1;
            while (true) {
                do {
                    do {
                        if (~this.field6997.field1313[this.field6998] <= ~this.field6985) {
                            return;
                        }
                        this.field6985 -= this.field6997.field1313[this.field6998];
                        ++this.field6998;
                        if (this.field6998 >= this.field6997.field1315.length) {
                            this.field6998 -= this.field6997.field1325;
                            if (this.field6998 < 0 || ~this.field6997.field1315.length >= ~this.field6998) {
                                this.field6998 = 0;
                            }
                        }
                        this.field6988 = this.field6998 - -1;
                    } while (this.field6997.field1315.length > this.field6988);
                    this.field6988 -= this.field6997.field1325;
                } while (~this.field6988 <= -1 && this.field6997.field1315.length > this.field6988);
                this.field6988 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V")
    public final void method2807(byte arg0) {
        if (arg0 != -23) {
            this.field6961 = 1.857032378121703D;
        }
        if (this.field6975 != null) {
            this.field6975.method1526();
        }
        ++field6970;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)I")
    public final int method174(byte arg0) {
        if (arg0 > -126) {
            this.field6967 = 59;
        }
        ++field6992;
        return this.field6973;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIILqa;)Z")
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        ++field6968;
        return arg0 <= 121;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2808(int arg0, String arg1) {
        ++field6959;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg1.length();
            while (~var2 > ~var3 && class203.method1375((byte) 80, arg1.charAt(var2))) {
                ++var2;
            }
            while (var2 < var3 && class203.method1375((byte) 102, arg1.charAt(var3 + -1))) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (var4 >= 1 && ~var4 >= -13) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; var3 > var6; ++var6) {
                    char var7 = arg1.charAt(var6);
                    if (class2.method5(arg0 + -75, var7)) {
                        char var8 = class357.method2290(21820, var7);
                        if (~var8 != -1) {
                            var5.append(var8);
                        }
                    }
                }
                if (~var5.length() == arg0) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)Z")
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            field6983 = null;
        }
        ++field6978;
        return false;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(ZLqa;)V")
    public final void method135(boolean arg0, class165 arg1) {
        ++field6979;
        class334 var3 = this.method2809(0, arg1, (byte) 116);
        if (var3 != null) {
            if (!arg0) {
                class14 var4 = arg1.method751();
                var4.method145(this.field6996);
                var4.method153(this.field6956);
                var4.method146((int) this.field6980, (int) this.field6989, (int) this.field6964);
                this.field6973 = var3.method77();
                this.method2810(arg1, (byte) 21, var3);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V")
    public final void method175(int arg0) {
        ++field6977;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILqa;B)Lka;")
    private final class334 method2809(int arg0, class165 arg1, byte arg2) {
        if (arg2 != 116) {
            return null;
        } else {
            ++field6962;
            class11 var4 = class239.field3360.method2836((byte) 13, this.field6967);
            return var4.method110(arg1, this.field6998, this.field6985, arg0, this.field6988, class201.field2707, (byte) 79);
        }
    }

    @OriginalMember(owner = "client!bl", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field6975 != null) {
            this.field6975.method1526();
        }
        ++field6984;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, -arg4 + class352.method2264(-112, arg1, arg3, arg2), arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field6971 = arg9;
        this.field6994 = arg4;
        this.field6993 = arg5;
        this.field6969 = false;
        this.field6987 = arg10;
        this.field6957 = arg6;
        this.field6986 = arg11;
        this.field6981 = arg8;
        this.field6960 = arg7;
        this.field6967 = arg0;
        int var13 = class239.field3360.method2836((byte) -122, this.field6967).field192;
        if (~var13 == 0) {
            this.field6997 = null;
        } else {
            this.field6997 = class201.field2707.method489(104, var13);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILqa;)Lou;")
    public final class437 method136(int arg0, class165 arg1) {
        ++field6991;
        class334 var3 = this.method2809(2048, arg1, (byte) 116);
        if (var3 == null) {
            return null;
        } else {
            class14 var4 = arg1.method751();
            var4.method145(this.field6996);
            var4.method153(this.field6956);
            if (arg0 != 0) {
                field6983 = null;
            }
            var4.method146((int) this.field6980, (int) this.field6989, (int) this.field6964);
            if (this.field6975 != null) {
                class137 var5 = this.field6975.method1533();
                arg1.method840(var3, var5, var4, (class302) null, 0);
            } else {
                var3.method53(var4, (class302) null, 0);
            }
            this.field6973 = var3.method77();
            this.method2810(arg1, (byte) 21, var3);
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILa;IIILqa;Z)V")
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        ++field6974;
        if (arg2 <= -4) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lqa;BLka;)V")
    private final void method2810(class165 arg0, byte arg1, class334 arg2) {
        ++field6995;
        class392[] var4 = arg2.method72();
        class531[] var5 = arg2.method87();
        if ((this.field6975 == null || this.field6975.field3237) && (var4 != null || var5 != null)) {
            this.field6975 = new class228(class393.field6017);
        }
        if (arg1 == 21) {
            if (this.field6975 != null) {
                this.field6975.method1531(arg0, (long) class393.field6017, var4, var5, false);
                this.field6975.method1530(super.field1866, super.field1868, super.field1871, super.field1863, super.field1874);
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
    public final void method938(byte arg0) {
        super.field1868 = super.field1871 = (short) ((int) (this.field6980 / 128.0D));
        if (arg0 == -47) {
            ++field6958;
            super.field1863 = super.field1874 = (short) ((int) (this.field6964 / 128.0D));
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[S)[S")
    public static final short[] method2811(int arg0, short[] arg1) {
        ++field6972;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class192.method1303(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
    public final void method2812(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field6966;
        if (!this.field6969) {
            double var6 = (double) (arg4 - super.field1867);
            double var8 = (double) (-super.field1862 + arg1);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field6980 = (double) this.field6981 * var6 / var10 + (double) super.field1867;
            this.field6964 = (double) this.field6981 * var8 / var10 + (double) super.field1862;
            if (this.field6986) {
                this.field6989 = (double) (class352.method2264(-97, super.field1866, (int) this.field6964, (int) this.field6980) - this.field6994);
            } else {
                this.field6989 = (double) super.field1873;
            }
        }
        double var12 = (double) (this.field6957 + 1 - arg3);
        this.field6999 = ((double) arg4 + -this.field6980) / var12;
        this.field6976 = ((double) arg1 - this.field6964) / var12;
        if (arg0 <= 126) {
            this.method2810((class165) null, (byte) 109, (class334) null);
        }
        this.field6961 = Math.sqrt(this.field6999 * this.field6999 + this.field6976 * this.field6976);
        if (this.field6960 == -1) {
            this.field7000 = ((double) arg2 - this.field6989) / var12;
        } else {
            if (!this.field6969) {
                this.field7000 = -this.field6961 * Math.tan((double) this.field6960 * 0.02454369D);
            }
            this.field6965 = ((double) arg2 + -this.field6989 - this.field7000 * var12) * 2.0D / (var12 * var12);
        }
    }
}
