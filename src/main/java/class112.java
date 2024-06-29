import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class112 extends class105 {

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    private int field1956 = 0;

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
    private int field1968 = 0;

    @OriginalMember(owner = "client!cl", name = "fb", descriptor = "I")
    private int field1972 = 0;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field1957 = 0;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "[I")
    public static int[] field1955 = new int[2000];

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "Z")
    public static boolean field1964 = false;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "Lvf;")
    public static class265 field1962 = class87.method582(-46, "");

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    private int field1959;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    private int field1960;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    private int field1961;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    private int field1965;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!cl", name = "db", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!cl", name = "eb", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!cl", name = "gb", descriptor = "I")
    private int field1973;

    @OriginalMember(owner = "client!cl", name = "hb", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!cl", name = "ib", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!cl", name = "jb", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!cl", name = "kb", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!cl", name = "lb", descriptor = "I")
    private int field1978;

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "[Lvf;")
    public static class265[] field1967;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILgk;I)V")
    public static final void method737(int arg0, int arg1, int arg2, class6 arg3, int arg4) {
        if (field1957 >= 3) {
            class35.method299(arg0, arg4, 0, arg3.field202, arg3.field173);
        } else {
            ((class88) class143.field2657).method595(arg0, arg4, arg3.field89, arg3.field84, class143.field2657.field1896 / 2, class143.field2657.field1904 / 2, class79.field1500, 256, arg3.field202, arg3.field173);
        }
        class80.field1516[arg1] = true;
        if (arg2 >= -68) {
            method738(-73, (class184) null);
        }
        ++field1958;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILwj;)V")
    public static final void method738(int arg0, class184 arg1) {
        class265.field4656 = arg1;
        if (arg0 != 12170) {
            field1967 = null;
        }
        ++field1963;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class112() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        ++field1977;
        int[][] var3 = super.field1870.method569((byte) 58, arg0);
        if (arg1 > -110) {
            field1966 = 121;
        }
        if (super.field1870.field1567) {
            int[][] var4 = this.method702((byte) 94, arg0, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class94.field1668; ++var11) {
                this.method739(-26, var7[var11], var6[var11], var5[var11]);
                this.field1973 += this.field1956;
                this.field1965 += this.field1972;
                while (~this.field1973 > -1) {
                    this.field1973 += 4096;
                }
                if (this.field1965 < 0) {
                    this.field1965 = 0;
                }
                while (this.field1973 > 4096) {
                    this.field1973 -= 4096;
                }
                this.field1978 += this.field1968;
                if (~this.field1965 < -4097) {
                    this.field1965 = 4096;
                }
                if (this.field1978 < 0) {
                    this.field1978 = 0;
                }
                if (this.field1978 > 4096) {
                    this.field1978 = 4096;
                }
                this.method742(this.field1965, this.field1973, this.field1978, 0);
                var8[var11] = this.field1959;
                var10[var11] = this.field1960;
                var9[var11] = this.field1961;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)V")
    private final void method739(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -24 / ((65 - arg0) / 54);
        int var6 = arg1 >= arg2 ? arg1 : arg2;
        int var7 = var6 >= arg3 ? var6 : arg3;
        ++field1970;
        int var8 = ~arg1 >= ~arg2 ? arg1 : arg2;
        int var9 = ~var8 >= ~arg3 ? var8 : arg3;
        this.field1978 = (var9 - -var7) / 2;
        int var10 = -var9 + var7;
        if (this.field1978 > 0 && this.field1978 < 4096) {
            this.field1965 = (var10 << 12) / (this.field1978 > 2048 ? -(this.field1978 * 2) + 8192 : this.field1978 * 2);
        } else {
            this.field1965 = 0;
        }
        if (~var10 >= -1) {
            this.field1973 = 0;
        } else {
            int var11 = (-arg2 + var7 << 12) / var10;
            int var12 = (var7 - arg1 << 12) / var10;
            int var13 = (-arg3 + var7 << 12) / var10;
            if (~arg2 == ~var7) {
                this.field1973 = arg1 == var9 ? 20480 - -var13 : -var12 + 4096;
            } else if (~arg1 != ~var7) {
                this.field1973 = arg2 != var9 ? -var11 + 20480 : var12 + 12288;
            } else {
                this.field1973 = arg3 == var9 ? var11 + 4096 : 12288 - var13;
            }
            this.field1973 /= 6;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public static final void method740(byte arg0) {
        class190 var1 = class94.field1673;
        synchronized (class94.field1673) {
            if (arg0 != 21) {
                method741(26, (class265) null);
            }
            ++class116.field2049;
            class176.field3138 = class211.field3799;
            if (class72.field1388 >= 0) {
                while (class72.field1388 != class147.field2751) {
                    int var2 = class176.field3144[class147.field2751];
                    class147.field2751 = class147.field2751 + 1 & 127;
                    if (var2 >= 0) {
                        class69.field1311[var2] = true;
                    } else {
                        class69.field1311[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; ++var3) {
                    class69.field1311[var3] = false;
                }
                class72.field1388 = class147.field2751;
            }
            class211.field3799 = class254.field4369;
        }
        ++field1974;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILvf;)V")
    public static final void method741(int arg0, class265 arg1) {
        ++field1969;
        class145.method1007(false, arg0 + -18009);
        if (arg0 != 18188) {
            field1967 = null;
        }
        class17.method122(arg1, -3);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 != 255) {
            this.method18(16, (byte) -39);
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field1968 = (arg2.method929((byte) -3) << 12) / 100;
                }
            } else {
                this.field1972 = (arg2.method929((byte) -3) << 12) / 100;
            }
        } else {
            this.field1956 = arg2.method894(-105);
        }
        ++field1971;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIII)V")
    private final void method742(int arg0, int arg1, int arg2, int arg3) {
        ++field1975;
        if (arg3 != 0) {
            this.method739(67, -100, 16, -11);
        }
        int var5 = ~arg2 < -2049 ? -(arg0 * arg2 >> 12) + arg0 + arg2 : (arg0 + 4096) * arg2 >> 12;
        if (~var5 >= -1) {
            this.field1959 = this.field1960 = this.field1961 = arg2;
        } else {
            int var6 = arg2 - -arg2 + -var5;
            int var7 = (-var6 + var5 << 12) / var5;
            int var8 = arg1 * 6;
            int var9 = var8 >> 12;
            int var10 = -(var9 << 12) + var8;
            int var12 = var7 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var6 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field1959 = var5;
                                    this.field1960 = var6;
                                    this.field1961 = var15;
                                }
                            } else {
                                this.field1959 = var14;
                                this.field1960 = var6;
                                this.field1961 = var5;
                            }
                        } else {
                            this.field1960 = var15;
                            this.field1961 = var5;
                            this.field1959 = var6;
                        }
                    } else {
                        this.field1961 = var14;
                        this.field1960 = var5;
                        this.field1959 = var6;
                    }
                } else {
                    this.field1961 = var6;
                    this.field1959 = var15;
                    this.field1960 = var5;
                }
            } else {
                this.field1961 = var6;
                this.field1960 = var14;
                this.field1959 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
    public static void method743(int arg0) {
        field1962 = null;
        field1967 = null;
        if (arg0 != 4096) {
            method743(-82);
        }
        field1955 = null;
    }
}
