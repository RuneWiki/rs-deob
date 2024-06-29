import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class214 extends class117 {

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "I")
    private int field3900 = 0;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "I")
    private int field3895 = 0;

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "I")
    private int field3913 = 0;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "Lmi;")
    public static class128 field3897 = new class128();

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "Lqc;")
    public static class258 field3909 = new class258(32);

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
    public static int field3910 = -1;

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    private int field3898;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "I")
    private int field3901;

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    private int field3903;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
    private int field3907;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
    private int field3908;

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "I")
    private int field3912;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "[I")
    public static int[] field3911;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public static final void method1521(int arg0) {
        ++field3894;
        if (arg0 > -52) {
            field3897 = null;
        }
        try {
            if (class50.field836 == null) {
                class50.field836 = new class151(class169.field3090, class145.method1101(0, new class163[] { class43.method325((byte) 100), class123.field2352 }).method1184(-13));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class50.field836 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    private final void method1522(int arg0, int arg1, int arg2, int arg3) {
        ++field3906;
        int var5 = ~arg3 <= ~arg2 ? arg3 : arg2;
        int var6 = ~arg3 >= ~arg2 ? arg3 : arg2;
        int var7 = var5 < arg1 ? arg1 : var5;
        int var8 = -22 % ((62 - arg0) / 61);
        int var9 = ~var6 >= ~arg1 ? var6 : arg1;
        this.field3907 = (var9 - -var7) / 2;
        int var10 = -var9 + var7;
        if (this.field3907 > 0 && ~this.field3907 > -4097) {
            this.field3912 = (var10 << 12) / (~this.field3907 >= -2049 ? this.field3907 * 2 : -(this.field3907 * 2) + 8192);
        } else {
            this.field3912 = 0;
        }
        if (var10 > 0) {
            int var11 = (-arg3 + var7 << 12) / var10;
            int var12 = (var7 - arg1 << 12) / var10;
            int var13 = (-arg2 + var7 << 12) / var10;
            if (~arg2 == ~var7) {
                this.field3898 = arg3 == var9 ? var12 + 20480 : -var11 + 4096;
            } else if (arg3 != var7) {
                this.field3898 = ~arg2 == ~var9 ? var11 + 12288 : 20480 - var13;
            } else {
                this.field3898 = ~arg1 == ~var9 ? var13 + 4096 : 12288 - var12;
            }
            this.field3898 /= 6;
        } else {
            this.field3898 = 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        if (arg0 != 0) {
            this.field3898 = -37;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field3900 = (arg2.method635(-121) << 12) / 100;
                }
            } else {
                this.field3913 = (arg2.method635(arg0 + -76) << 12) / 100;
            }
        } else {
            this.field3895 = arg2.method647(true);
        }
        ++field3899;
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "(I)V")
    public static void method1523(int arg0) {
        field3911 = null;
        if (arg0 == -3) {
            field3897 = null;
            field3909 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIII)V")
    private final void method1524(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 > 2048 ? -(arg0 * arg2 >> 12) + arg2 + arg0 : (arg2 + 4096) * arg0 >> 12;
        if (arg3 == 2) {
            if (~var5 < -1) {
                int var6 = arg1 * 6;
                int var7 = arg0 - var5 + arg0;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var5 - var13;
                int var15 = var7 + var13;
                if (var9 != 0) {
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 != 3) {
                                if (var9 != 4) {
                                    if (~var9 == -6) {
                                        this.field3901 = var5;
                                        this.field3903 = var7;
                                        this.field3908 = var14;
                                    }
                                } else {
                                    this.field3903 = var7;
                                    this.field3901 = var15;
                                    this.field3908 = var5;
                                }
                            } else {
                                this.field3901 = var7;
                                this.field3903 = var14;
                                this.field3908 = var5;
                            }
                        } else {
                            this.field3908 = var15;
                            this.field3903 = var5;
                            this.field3901 = var7;
                        }
                    } else {
                        this.field3901 = var14;
                        this.field3908 = var7;
                        this.field3903 = var5;
                    }
                } else {
                    this.field3901 = var5;
                    this.field3908 = var7;
                    this.field3903 = var15;
                }
            } else {
                this.field3901 = this.field3903 = this.field3908 = arg0;
            }
            ++field3893;
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(B)V")
    public static final void method1525(byte arg0) {
        ++field3896;
        if (class50.field836 != null) {
            try {
                int var1 = -110 / ((-76 - arg0) / 46);
                byte[] var2 = class50.field836.method1125((byte) 23);
                if (var2 != null) {
                    class81 var3 = new class81(var2);
                    class33.field513 = var3.method658(-79);
                    class144.field2722 = new class223[class33.field513];
                    for (int var4 = 0; var4 < class33.field513; ++var4) {
                        class223 var5 = class144.field2722[var4] = new class223();
                        int var6 = var3.method658(115);
                        var5.field4065 = var6 & 32767;
                        var5.field4056 = ~(var6 & 32768) != -1;
                        var5.field4063 = var3.method605(true);
                        var5.field4061 = var3.method647(true);
                        var5.field4054 = var4;
                        int var7 = var3.method658(-120);
                        var5.field4053 = class135.method1056(var7, 20);
                    }
                    class192.method1408(-1, class144.field2722.length + -1, class144.field2722, 0);
                    class50.field836 = null;
                }
            } catch (Exception var9) {
                var9.printStackTrace();
                class50.field836 = null;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
    public class214() {
        super(1, false);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method90(int arg0, boolean arg1) {
        if (!arg1) {
            method1525((byte) -83);
        }
        ++field3902;
        int[][] var3 = super.field2228.method1304(arg0, (byte) 90);
        if (super.field2228.field3221) {
            int[][] var4 = this.method931(arg0, 125, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class143.field2702; ++var11) {
                this.method1522(-112, var10[var11], var5[var11], var6[var11]);
                this.field3912 += this.field3913;
                if (~this.field3912 > -1) {
                    this.field3912 = 0;
                }
                this.field3907 += this.field3900;
                if (~this.field3907 > -1) {
                    this.field3907 = 0;
                }
                for (this.field3898 += this.field3895; ~this.field3898 > -1; this.field3898 += 4096) {
                }
                while (~this.field3898 < -4097) {
                    this.field3898 -= 4096;
                }
                if (~this.field3907 < -4097) {
                    this.field3907 = 4096;
                }
                if (this.field3912 > 4096) {
                    this.field3912 = 4096;
                }
                this.method1524(this.field3907, this.field3898, this.field3912, 2);
                var8[var11] = this.field3901;
                var7[var11] = this.field3903;
                var9[var11] = this.field3908;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)V")
    public static final void method1526(byte arg0, int arg1, int arg2) {
        if (arg0 != -6) {
            field3897 = null;
        }
        long var3 = (long) ((arg1 << 16) + arg2);
        class46 var5 = (class46) class130.field2528.method1743(var3, false);
        ++field3905;
        if (var5 != null) {
            class20.field314.method467(var5, true);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIII)V")
    public static final void method1527(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -18) {
            method1525((byte) 67);
        }
        int var6 = class221.method1561(class182.field3344, (byte) -42, arg0, class201.field3593);
        int var7 = class221.method1561(class182.field3344, (byte) -42, arg3, class201.field3593);
        int var8 = class221.method1561(class127.field2465, (byte) -42, arg5, class252.field4407);
        ++field3904;
        int var9 = class221.method1561(class127.field2465, (byte) -42, arg4, class252.field4407);
        for (int var10 = var6; ~var10 >= ~var7; ++var10) {
            class227.method1585(var8, (byte) -66, arg2, class85.field1605[var10], var9);
        }
    }
}
