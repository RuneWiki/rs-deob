import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class168 extends class43 {

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    private int field3065 = 0;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    private int field3060 = 0;

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "I")
    private int field3084 = 0;

    @OriginalMember(owner = "client!pe", name = "jb", descriptor = "Lmb;")
    private static class132 field3075 = class166.method1092("flash2:", 118);

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "Lmb;")
    public static class132 field3063 = field3075;

    @OriginalMember(owner = "client!pe", name = "kb", descriptor = "Lmb;")
    public static class132 field3076 = field3075;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Lmb;")
    private static class132 field3062 = class166.method1092("Login server offline)3", 114);

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "Lmb;")
    private static class132 field3078 = class166.method1092("You are standing in a members)2only area)3", 118);

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "Z")
    public static boolean field3068 = false;

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "Lmb;")
    public static class132 field3074 = field3078;

    @OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
    public static int field3083 = 100;

    @OriginalMember(owner = "client!pe", name = "ub", descriptor = "Lmb;")
    public static class132 field3086 = field3062;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    private int field3061;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    private int field3064;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
    private int field3069;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "I")
    private int field3073;

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!pe", name = "qb", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!pe", name = "lb", descriptor = "Loc;")
    public static class155 field3077;

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "Loc;")
    public static class155 field3079;

    @OriginalMember(owner = "client!pe", name = "tb", descriptor = "Lpb;")
    public static class165 field3085;

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class168() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
    private final void method1098(int arg0, int arg1, int arg2, int arg3) {
        ++field3081;
        int var5 = ~arg0 <= ~arg1 ? arg0 : arg1;
        if (arg3 != 64) {
            this.field3084 = 98;
        }
        int var6 = var5 >= arg2 ? var5 : arg2;
        int var7 = ~arg0 < ~arg1 ? arg1 : arg0;
        int var8 = var7 > arg2 ? arg2 : var7;
        int var9 = -var8 + var6;
        if (var9 > 0) {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (arg1 != var6) {
                if (arg0 != var6) {
                    this.field3059 = ~arg1 != ~var8 ? -var10 + 20480 : var11 + 12288;
                } else {
                    this.field3059 = arg2 == var8 ? var10 + 4096 : -var12 + 12288;
                }
            } else {
                this.field3059 = arg0 != var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field3059 /= 6;
        } else {
            this.field3059 = 0;
        }
        this.field3064 = (var8 - -var6) / 2;
        if (this.field3064 > 0 && ~this.field3064 > -4097) {
            this.field3073 = (var9 << 12) / (~this.field3064 >= -2049 ? this.field3064 * 2 : -(this.field3064 * 2) + 8192);
        } else {
            this.field3073 = 0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1099(int arg0, int arg1, int arg2, long arg3) {
        class169 var5 = class101.field1900[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3098 != null && var5.field3098.field3439 == arg3) {
            return true;
        } else if (var5.field3099 != null && var5.field3099.field4022 == arg3) {
            return true;
        } else if (var5.field3100 != null && var5.field3100.field210 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3096; ++var6) {
                if (var5.field3103[var6].field1355 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)V")
    public static void method1100(int arg0) {
        field3074 = null;
        field3077 = null;
        field3076 = null;
        field3085 = null;
        field3079 = null;
        field3075 = null;
        field3078 = null;
        field3086 = null;
        field3062 = null;
        if (arg0 != -29808) {
            field3074 = null;
        }
        field3063 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILwb;IZII)V")
    public static final void method1101(int arg0, class236 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field3070;
        if (class91.field1602 < 50) {
            if (arg1.field4258 != null && arg0 < arg1.field4258.length) {
                int var6 = arg1.field4258[arg0];
                if (~var6 != -1) {
                    int var7 = 7 & var6 >> 4;
                    if (arg5 == 1497181864) {
                        int var8 = var6 >> 8;
                        int var9 = var6 & 15;
                        if (var9 == 0) {
                            if (arg3) {
                                class216.method1347(var8, var7, 0, 0);
                            }
                        } else if (~class89.field1567 != -1) {
                            int var10 = (arg2 - 64) / 128;
                            int var11 = (arg4 - 64) / 128;
                            class59.field1010[class91.field1602] = var8;
                            class62.field1044[class91.field1602] = var7;
                            class118.field2242[class91.field1602] = 0;
                            class138.field2594[class91.field1602] = null;
                            class122.field2273[class91.field1602] = (var10 << 16) + (var11 << 8) + var9;
                            ++class91.field1602;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[[I")
    public final int[][] method203(int arg0, int arg1) {
        ++field3071;
        if (arg0 != -1893) {
            field3085 = null;
        }
        int[][] var3 = super.field764.method1350((byte) 125, arg1);
        if (super.field764.field3960) {
            int[][] var4 = this.method301(arg1, (byte) -92, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class131.field2427 < ~var11; ++var11) {
                this.method1098(var5[var11], var6[var11], var7[var11], 64);
                this.field3059 += this.field3065;
                this.field3073 += this.field3084;
                this.field3064 += this.field3060;
                while (~this.field3059 > -1) {
                    this.field3059 += 4096;
                }
                while (this.field3059 > 4096) {
                    this.field3059 -= 4096;
                }
                if (~this.field3064 > -1) {
                    this.field3064 = 0;
                }
                if (~this.field3073 > -1) {
                    this.field3073 = 0;
                }
                if (~this.field3064 < -4097) {
                    this.field3064 = 4096;
                }
                if (~this.field3073 < -4097) {
                    this.field3073 = 4096;
                }
                this.method1102(this.field3059, arg0 + 33678, this.field3064, this.field3073);
                var8[var11] = this.field3061;
                var9[var11] = this.field3069;
                var10[var11] = this.field3080;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIII)V")
    private final void method1102(int arg0, int arg1, int arg2, int arg3) {
        ++field3067;
        int var5 = ~arg2 >= -2049 ? (4096 - -arg3) * arg2 >> 12 : arg2 + arg3 + -(arg2 * arg3 >> 12);
        if (var5 > 0) {
            int var6 = arg0 * 6;
            int var7 = arg2 + arg2 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var7 - -var13;
            if (var9 != 0) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field3069 = var7;
                                    this.field3080 = var14;
                                    this.field3061 = var5;
                                }
                            } else {
                                this.field3069 = var7;
                                this.field3061 = var15;
                                this.field3080 = var5;
                            }
                        } else {
                            this.field3069 = var14;
                            this.field3080 = var5;
                            this.field3061 = var7;
                        }
                    } else {
                        this.field3080 = var15;
                        this.field3061 = var7;
                        this.field3069 = var5;
                    }
                } else {
                    this.field3069 = var5;
                    this.field3061 = var14;
                    this.field3080 = var7;
                }
            } else {
                this.field3061 = var5;
                this.field3080 = var7;
                this.field3069 = var15;
            }
        } else {
            this.field3061 = this.field3069 = this.field3080 = arg2;
        }
        if (arg1 != 31785) {
            this.method1098(-126, 4, 32, 91);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        ++field3066;
        if (arg1 != -73) {
            method1101(46, (class236) null, -28, true, 21, 89);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field3060 = (arg2.method734(true) << 12) / 100;
                }
            } else {
                this.field3084 = (arg2.method734(true) << 12) / 100;
            }
        } else {
            this.field3065 = arg2.method750(65280);
        }
    }
}
