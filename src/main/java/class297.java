import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class297 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public int field3856 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    private int field3868 = -1;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public int field3873 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    private int field3877 = -1;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Z")
    public boolean field3863 = false;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    private int field3864 = -1;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public int field3857 = 0;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public int field3879 = -1;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    private int field3876 = -1;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public int field3859 = -1;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public int field3862 = -1;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "[Ljava/lang/String;")
    public String[] field3889 = new String[5];

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
    public int field3887 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Z")
    public boolean field3869 = true;

    @OriginalMember(owner = "client!bl", name = "Q", descriptor = "Z")
    public boolean field3896 = true;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public int field3888 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public int field3890 = -1;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    private int field3891 = -1;

    @OriginalMember(owner = "client!bl", name = "R", descriptor = "Z")
    public boolean field3897 = true;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "Z")
    public static boolean field3894 = false;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public int field3861;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    private int field3871;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    private int field3874;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    private int field3886;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
    public int field3893;

    @OriginalMember(owner = "client!bl", name = "P", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "Lso;")
    public class256 field3865;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Lba;")
    private class607 field3860;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "Ljava/lang/String;")
    public String field3866;

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "Ljava/lang/String;")
    public String field3872;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "[I")
    public int[] field3858;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLtv;)Z")
    public final boolean method1822(byte arg0, class361 arg1) {
        field3855++;
        int var3;
        if (this.field3877 == -1) {
            if (this.field3891 == -1) {
                return true;
            }
            var3 = arg1.method2236(2, this.field3891);
        } else {
            var3 = arg1.method2235(this.field3877, -99);
        }
        if (var3 < this.field3886 || var3 > this.field3885) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field3868 == -1) {
            if (this.field3876 == -1) {
                return true;
            }
            var5 = arg1.method2236(2, this.field3876);
        } else {
            var5 = arg1.method2235(this.field3868, -40);
        }
        if (var5 >= this.field3874 && this.field3871 >= var5) {
            int var6 = 107 / ((arg0 + 32) / 33);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLqa;)Lha;")
    public final class116 method1823(byte arg0, class167 arg1) {
        field3875++;
        class116 var3 = (class116) this.field3865.field3185.method323((long) (arg1.field2115 << 29 | 0x20000 | this.field3864), -19814);
        if (var3 != null) {
            return var3;
        }
        this.field3865.field3184.method2042((byte) -80, this.field3864);
        if (arg0 != -62) {
            this.method1827(1);
        }
        class295 var4 = class295.method1806(this.field3865.field3184, this.field3864, 0);
        if (var4 != null) {
            var3 = arg1.method916(var4, true);
            this.field3865.field3185.method316((long) (arg1.field2115 << 29 | 0x20000 | this.field3864), (byte) -126, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method1824(int arg0, String arg1, int arg2) {
        field3895++;
        if (arg2 != 15825) {
            return null;
        } else if (this.field3860 == null) {
            return arg1;
        } else {
            class63 var4 = (class63) this.field3860.method3476((long) arg0, (byte) 28);
            return var4 == null ? arg1 : var4.field862;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBI)I")
    public final int method1825(int arg0, byte arg1, int arg2) {
        field3870++;
        if (this.field3860 == null) {
            return arg2;
        }
        class147 var4 = (class147) this.field3860.method3476((long) arg0, (byte) 28);
        if (arg1 == 38) {
            return var4 == null ? arg2 : var4.field1902;
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILge;)V")
    public final void method1826(int arg0, class551 arg1) {
        if (arg0 != 0) {
            this.method1829(-115, 115, null);
        }
        field3884++;
        while (true) {
            int var3 = arg1.method3045(-125);
            if (var3 == 0) {
                return;
            }
            this.method1829(-128, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public final void method1827(int arg0) {
        if (this.field3858 != null) {
            for (int var2 = 0; var2 < this.field3858.length; var2 += 2) {
                if (this.field3856 > this.field3858[var2]) {
                    this.field3856 = this.field3858[var2];
                } else if (this.field3873 < this.field3858[var2]) {
                    this.field3873 = this.field3858[var2];
                }
                if (this.field3887 > this.field3858[var2 + 1]) {
                    this.field3887 = this.field3858[var2 + 1];
                } else if (this.field3858[var2 + 1] > this.field3888) {
                    this.field3888 = this.field3858[var2 + 1];
                }
            }
        }
        field3881++;
        if (arg0 != 1) {
            this.method1822((byte) 125, null);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lqa;ZB)Lha;")
    public final class116 method1828(class167 arg0, boolean arg1, byte arg2) {
        if (arg2 > -127) {
            this.field3896 = true;
        }
        field3878++;
        int var4 = arg1 ? this.field3890 : this.field3862;
        int var5 = arg0.field2115 << 29 | var4;
        class116 var6 = (class116) this.field3865.field3185.method323((long) var5, -19814);
        if (var6 != null) {
            return var6;
        } else if (this.field3865.field3184.method2042((byte) -80, var4)) {
            class295 var7 = class295.method1806(this.field3865.field3184, var4, 0);
            if (var7 != null) {
                var6 = arg0.method916(var7, true);
                this.field3865.field3185.method316((long) var5, (byte) -126, var6);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILge;)V")
    private final void method1829(int arg0, int arg1, class551 arg2) {
        field3880++;
        int var4 = 22 % ((-arg0 - 72) / 36);
        if (arg1 == 1) {
            this.field3862 = arg2.method3090(-98);
        } else if (arg1 == 2) {
            this.field3890 = arg2.method3090(-99);
        } else if (arg1 == 3) {
            this.field3872 = arg2.method3077(-20739);
        } else if (arg1 == 4) {
            this.field3861 = arg2.method3043((byte) 49);
        } else if (arg1 == 5) {
            this.field3879 = arg2.method3043((byte) 49);
        } else if (arg1 == 6) {
            this.field3857 = arg2.method3045(-125);
        } else if (arg1 == 7) {
            int var13 = arg2.method3045(-128);
            if ((var13 & 0x2) == 2) {
                this.field3863 = true;
            }
            if ((var13 & 0x1) == 0) {
                this.field3869 = false;
                return;
            }
        } else if (arg1 == 8) {
            this.field3896 = arg2.method3045(-125) == 1;
            return;
        } else if (arg1 == 9) {
            this.field3891 = arg2.method3090(-86);
            if (this.field3891 == 65535) {
                this.field3891 = -1;
            }
            this.field3877 = arg2.method3090(-84);
            if (this.field3877 == 65535) {
                this.field3877 = -1;
            }
            this.field3886 = arg2.method3048(-4);
            this.field3885 = arg2.method3048(-4);
            return;
        } else if (arg1 < 10 || arg1 > 14) {
            if (arg1 != 15) {
                if (arg1 == 16) {
                    this.field3897 = false;
                    return;
                }
                if (arg1 != 17) {
                    if (arg1 != 18) {
                        if (arg1 != 19) {
                            if (arg1 != 20) {
                                if (arg1 == 21) {
                                    this.field3892 = arg2.method3048(-4);
                                } else if (arg1 == 22) {
                                    this.field3867 = arg2.method3048(-4);
                                    return;
                                } else if (arg1 == 249) {
                                    int var7 = arg2.method3045(-126);
                                    if (this.field3860 == null) {
                                        int var8 = class468.method2685(var7, false);
                                        this.field3860 = new class607(var8);
                                    }
                                    for (int var9 = 0; var9 < var7; var9++) {
                                        boolean var10 = arg2.method3045(-127) == 1;
                                        int var11 = arg2.method3043((byte) 49);
                                        class108 var12;
                                        if (var10) {
                                            var12 = new class63(arg2.method3077(-20739));
                                        } else {
                                            var12 = new class147(arg2.method3048(-4));
                                        }
                                        this.field3860.method3475(-119, var12, (long) var11);
                                    }
                                    return;
                                }
                                return;
                            }
                            this.field3876 = arg2.method3090(-116);
                            if (this.field3876 == 65535) {
                                this.field3876 = -1;
                            }
                            this.field3868 = arg2.method3090(-72);
                            if (this.field3868 == 65535) {
                                this.field3868 = -1;
                            }
                            this.field3874 = arg2.method3048(-4);
                            this.field3871 = arg2.method3048(-4);
                            return;
                        }
                        this.field3859 = arg2.method3090(-79);
                        return;
                    }
                    this.field3864 = arg2.method3090(-114);
                    return;
                }
                this.field3866 = arg2.method3077(-20739);
                return;
            }
            int var5 = arg2.method3045(-128);
            this.field3858 = new int[var5 * 2];
            for (int var6 = 0; var6 < (var5 * 2); var6++) {
                this.field3858[var6] = arg2.method3087(true);
            }
            this.field3883 = arg2.method3048(-4);
            this.field3893 = arg2.method3048(-4);
            return;
        } else {
            this.field3889[arg1 - 10] = arg2.method3077(-20739);
            return;
        }
    }
}
