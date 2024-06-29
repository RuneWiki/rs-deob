import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class482 extends class210 {

    @OriginalMember(owner = "client!lu", name = "gb", descriptor = "I")
    private int field6972 = -1;

    @OriginalMember(owner = "client!lu", name = "hb", descriptor = "I")
    private int field6973 = 0;

    @OriginalMember(owner = "client!lu", name = "eb", descriptor = "I")
    private int field6970 = 0;

    @OriginalMember(owner = "client!lu", name = "cb", descriptor = "Z")
    private boolean field6968 = false;

    @OriginalMember(owner = "client!lu", name = "lb", descriptor = "I")
    private int field6977 = -32768;

    @OriginalMember(owner = "client!lu", name = "Q", descriptor = "I")
    public int field6957;

    @OriginalMember(owner = "client!lu", name = "R", descriptor = "Z")
    private boolean field6958;

    @OriginalMember(owner = "client!lu", name = "P", descriptor = "I")
    public int field6956;

    @OriginalMember(owner = "client!lu", name = "J", descriptor = "I")
    public int field6950;

    @OriginalMember(owner = "client!lu", name = "bb", descriptor = "I")
    private int field6967;

    @OriginalMember(owner = "client!lu", name = "qb", descriptor = "I")
    public int field6982;

    @OriginalMember(owner = "client!lu", name = "S", descriptor = "I")
    private int field6959;

    @OriginalMember(owner = "client!lu", name = "I", descriptor = "I")
    private int field6949;

    @OriginalMember(owner = "client!lu", name = "H", descriptor = "I")
    private int field6948;

    @OriginalMember(owner = "client!lu", name = "db", descriptor = "Ljl;")
    private class168 field6969;

    @OriginalMember(owner = "client!lu", name = "M", descriptor = "J")
    public static long field6953 = 0L;

    @OriginalMember(owner = "client!lu", name = "sb", descriptor = "[I")
    public static int[] field6984 = new int[8];

    @OriginalMember(owner = "client!lu", name = "Z", descriptor = "I")
    public static int field6965 = 999999;

    @OriginalMember(owner = "client!lu", name = "N", descriptor = "Liu;")
    public static class390 field6954 = new class390(20, -1);

    @OriginalMember(owner = "client!lu", name = "vb", descriptor = "Lae;")
    public static class156 field6987 = new class156(new byte[5000]);

    @OriginalMember(owner = "client!lu", name = "B", descriptor = "D")
    private double field6942;

    @OriginalMember(owner = "client!lu", name = "L", descriptor = "D")
    private double field6952;

    @OriginalMember(owner = "client!lu", name = "O", descriptor = "D")
    private double field6955;

    @OriginalMember(owner = "client!lu", name = "V", descriptor = "D")
    private double field6961;

    @OriginalMember(owner = "client!lu", name = "Y", descriptor = "D")
    private double field6964;

    @OriginalMember(owner = "client!lu", name = "mb", descriptor = "D")
    private double field6978;

    @OriginalMember(owner = "client!lu", name = "ob", descriptor = "D")
    private double field6980;

    @OriginalMember(owner = "client!lu", name = "pb", descriptor = "D")
    private double field6981;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!lu", name = "D", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!lu", name = "E", descriptor = "I")
    private int field6945;

    @OriginalMember(owner = "client!lu", name = "F", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!lu", name = "G", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!lu", name = "U", descriptor = "I")
    public static int field6960;

    @OriginalMember(owner = "client!lu", name = "W", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!lu", name = "X", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!lu", name = "ab", descriptor = "I")
    private int field6966;

    @OriginalMember(owner = "client!lu", name = "fb", descriptor = "I")
    public static int field6971;

    @OriginalMember(owner = "client!lu", name = "ib", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!lu", name = "jb", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!lu", name = "kb", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!lu", name = "nb", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!lu", name = "rb", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!lu", name = "tb", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!lu", name = "ub", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!lu", name = "wb", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!lu", name = "K", descriptor = "Lko;")
    private class332 field6951;

    @OriginalMember(owner = "client!lu", name = "xb", descriptor = "Lmo;")
    public static class507 field6989;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IZIII)V", line = 8)
    public final void method2804(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field6971;
        if (!arg1) {
            if (!this.field6968) {
                double var6 = (double) (-super.field2959 + arg4);
                double var8 = (double) (arg3 - super.field2966);
                double var10 = Math.sqrt(var6 * var6 + var8 * var8);
                this.field6980 = (double) this.field6959 * var6 / var10 + (double) super.field2959;
                this.field6952 = (double) this.field6959 * var8 / var10 + (double) super.field2966;
                if (!this.field6958) {
                    this.field6981 = (double) super.field2970;
                } else {
                    this.field6981 = (double) (class103.method620(super.field2956, (int) this.field6952, (byte) 20, (int) this.field6980) - this.field6949);
                }
            }
            double var12 = (double) (-arg0 + this.field6956 + 1);
            this.field6961 = ((double) arg4 + -this.field6980) / var12;
            this.field6978 = ((double) arg3 - this.field6952) / var12;
            this.field6955 = Math.sqrt(this.field6978 * this.field6978 + this.field6961 * this.field6961);
            if (this.field6948 == -1) {
                this.field6964 = ((double) arg2 - this.field6981) / var12;
            } else {
                if (!this.field6968) {
                    this.field6964 = -this.field6955 * Math.tan((double) this.field6948 * 0.02454369D);
                }
                this.field6942 = ((double) arg2 + -this.field6981 + -(this.field6964 * var12)) * 2.0D / (var12 * var12);
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 55)
    public static final void method2805(int arg0) {
        ++field6946;
        int var1 = class276.field3953;
        int[] var2 = class330.field4790;
        for (int var3 = 0; var1 > var3; ++var3) {
            class313 var7 = class262.field3742[var2[var3]];
            if (var7 != null && ~var7.field4184 < -1) {
                --var7.field4184;
                if (var7.field4184 == 0) {
                    var7.field4246 = null;
                }
            }
        }
        if (arg0 < 92) {
            field6984 = null;
        }
        for (int var4 = 0; var4 < class339.field4942; ++var4) {
            int var5 = class263.field3749[var4];
            class139 var6 = class504.field7697[var5];
            if (var6 != null && var6.field4184 > 0) {
                --var6.field4184;
                if (~var6.field4184 == -1) {
                    var6.field4246 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)I", line = 108)
    public final int method724(byte arg0) {
        ++field6947;
        if (arg0 >= -30) {
            this.method719(41, 27, 59, (class250) null, -45, true, (class134) null);
        }
        return this.field6977;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Leq;I)V", line = 128)
    public final void method361(class134 arg0, int arg1) {
        ++field6983;
        class327 var3 = this.method2810(0, arg1 ^ 8199, arg0);
        if (var3 != null) {
            class33 var4 = arg0.method830();
            var4.method267(this.field6945);
            var4.method279(this.field6966);
            var4.method275((int) this.field6980, (int) this.field6981, (int) this.field6952);
            if (arg1 != -1) {
                this.field6958 = false;
            }
            this.field6977 = var3.method195();
            this.method2809(var3, arg0, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIILbp;IZLeq;)V", line = 151)
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        ++field6963;
        if (arg2 == -1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Leq;Z)Lgl;", line = 167)
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field6962;
        class327 var3 = this.method2810(2048, -8200, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1) {
                field6965 = -72;
            }
            class33 var4 = arg0.method830();
            var4.method267(this.field6945);
            var4.method279(this.field6966);
            var4.method275((int) this.field6980, (int) this.field6981, (int) this.field6952);
            if (this.field6951 == null) {
                var3.method191(var4, (class299) null, 0);
            } else {
                class191 var5 = this.field6951.method2005();
                arg0.method787(var3, var5, var4, (class299) null, 0);
            }
            this.field6977 = var3.method195();
            this.method2809(var3, arg0, (byte) -98);
            return null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)Z", line = 204)
    public final boolean method723(int arg0) {
        if (arg0 != 17774) {
            this.method365(88, (class134) null, (byte) -47, 11);
        }
        ++field6986;
        return false;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILeq;BI)Z", line = 219)
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        int var5 = 76 % ((-23 - arg2) / 38);
        ++field6944;
        return false;
    }

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "(I)V", line = 234)
    public final void method1295(int arg0) {
        if (arg0 >= 6) {
            ++field6979;
            super.field2975 = super.field2957 = (short) ((int) (this.field6952 / 128.0D));
            super.field2972 = super.field2962 = (short) ((int) (this.field6980 / 128.0D));
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V", line = 247)
    public static void method2806(byte arg0) {
        field6954 = null;
        int var1 = 97 % ((-48 - arg0) / 60);
        field6989 = null;
        field6987 = null;
        field6984 = null;
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V", line = 387)
    public class482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, class103.method620(arg1, arg3, (byte) 20, arg2) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field6957 = arg5;
        this.field6958 = arg11;
        this.field6968 = false;
        this.field6956 = arg6;
        this.field6950 = arg10;
        this.field6967 = arg0;
        this.field6982 = arg9;
        this.field6959 = arg8;
        this.field6949 = arg4;
        this.field6948 = arg7;
        int var13 = class53.field820.method2427(this.field6967, -17773).field5501;
        if (var13 != -1) {
            this.field6969 = class286.field4083.method2602(-24462, var13);
        } else {
            this.field6969 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)V", line = 266)
    public final void method2807(int arg0, int arg1) {
        this.field6980 += (double) arg0 * this.field6961;
        this.field6952 += (double) arg0 * this.field6978;
        this.field6968 = true;
        ++field6988;
        if (this.field6958) {
            this.field6981 = (double) (class103.method620(super.field2956, (int) this.field6952, (byte) 20, (int) this.field6980) + -this.field6949);
        } else if (this.field6948 != -1) {
            this.field6981 += this.field6942 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field6964;
            this.field6964 += (double) arg0 * this.field6942;
        } else {
            this.field6981 += (double) arg0 * this.field6964;
        }
        this.field6966 = 16383 & (int) (Math.atan2(this.field6961, this.field6978) * 2607.5945876176133D) + 8192;
        this.field6945 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field6964, this.field6955));
        if (this.field6969 != null) {
            this.field6970 += arg0;
            label48: while (true) {
                do {
                    do {
                        if (~this.field6969.field2205[this.field6973] <= ~this.field6970) {
                            break label48;
                        }
                        this.field6970 -= this.field6969.field2205[this.field6973];
                        ++this.field6973;
                        if (~this.field6973 <= ~this.field6969.field2219.length) {
                            this.field6973 -= this.field6969.field2210;
                            if (this.field6973 < 0 || ~this.field6973 <= ~this.field6969.field2219.length) {
                                this.field6973 = 0;
                            }
                        }
                        this.field6972 = this.field6973 + 1;
                    } while (~this.field6969.field2219.length < ~this.field6972);
                    this.field6972 -= this.field6969.field2210;
                } while (this.field6972 >= 0 && this.field6969.field2219.length > this.field6972);
                this.field6972 = -1;
            }
        }
        if (arg1 != 0) {
            this.method365(65, (class134) null, (byte) 20, 102);
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V", line = 329)
    public final void method722(int arg0) {
        ++field6976;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V", line = 348)
    public final void method2808(byte arg0) {
        if (this.field6951 != null) {
            this.field6951.method2007();
        }
        if (arg0 >= -119) {
            this.field6966 = 83;
        }
        ++field6985;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lva;Leq;B)V", line = 364)
    private final void method2809(class327 arg0, class134 arg1, byte arg2) {
        ++field6975;
        class56[] var4 = arg0.method203();
        if (arg2 >= -28) {
            this.method719(-25, 21, 73, (class250) null, -20, false, (class134) null);
        }
        class339[] var5 = arg0.method185();
        if ((this.field6951 == null || this.field6951.field4820) && (var4 != null || var5 != null)) {
            this.field6951 = new class332(class263.field3748);
        }
        if (this.field6951 != null) {
            this.field6951.method2003(arg1, (long) class263.field3748, var4, var5, false);
            this.field6951.method2010(super.field2956, super.field2972, super.field2962, super.field2975, super.field2957);
        }
    }

    @OriginalMember(owner = "client!lu", name = "finalize", descriptor = "()V", line = 423)
    protected final void finalize() {
        ++field6960;
        if (this.field6951 != null) {
            this.field6951.method2007();
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILeq;)Lva;", line = 433)
    private final class327 method2810(int arg0, int arg1, class134 arg2) {
        ++field6974;
        class366 var4 = class53.field820.method2427(this.field6967, -17773);
        if (arg1 != -8200) {
            this.field6966 = -46;
        }
        return var4.method2238(class286.field4083, (byte) -59, this.field6973, this.field6970, arg2, arg0, this.field6972);
    }
}
