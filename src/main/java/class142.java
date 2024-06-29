import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class142 extends class278 {

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    private int field2018 = 2048;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    private int field2024 = 0;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    private int field2023 = 8192;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    private int field2017 = 12288;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "I")
    private int field2025 = 4096;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "I")
    private int field2027 = 2048;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    private int field2016 = 0;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field2015 = new String[100];

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "Ljm;")
    public static class485 field2030 = new class485(48, 4);

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "Z")
    public static boolean field2033 = true;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field2031 = Boolean.FALSE;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lcs;")
    public static class225 field2032 = new class225();

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V", line = 5)
    public static void method916(boolean arg0) {
        field2030 = null;
        if (arg0) {
            field2032 = null;
            field2015 = null;
            field2031 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([Lss;II)V", line = 18)
    public static final void method917(class295[] arg0, int arg1, int arg2) {
        for (int var3 = arg2; ~var3 > ~arg0.length; ++var3) {
            class295 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3984 == 0) {
                    if (var4.field4050 != null) {
                        method917(var4.field4050, arg1, 0);
                    }
                    class14 var5 = (class14) class269.field3690.method979((byte) 28, (long) var4.field4073);
                    if (var5 != null) {
                        class368.method2131(arg1, var5.field167, false);
                    }
                }
                if (~arg1 == -1 && var4.field4011 != null) {
                    class44 var6 = new class44();
                    var6.field613 = var4;
                    var6.field612 = var4.field4011;
                    class475.method2798(var6);
                }
                if (~arg1 == -2 && var4.field4067 != null) {
                    if (var4.field3936 >= 0) {
                        class295 var7 = class339.method1882((byte) 122, var4.field4073);
                        if (var7 == null || var7.field4050 == null || ~var7.field4050.length >= ~var4.field3936 || var7.field4050[var4.field3936] != var4) {
                            continue;
                        }
                    }
                    class44 var8 = new class44();
                    var8.field612 = var4.field4067;
                    var8.field613 = var4;
                    class475.method2798(var8);
                }
            }
        }
        ++field2029;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII[B)V", line = 85)
    public static final void method918(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg3 != 18414) {
            field2030 = null;
        }
        ++field2021;
        if (arg0 > arg1) {
            int var6 = arg0 - arg1 >> 2;
            int var7 = arg1 + arg2;
            while (true) {
                --var6;
                if (var6 < 0) {
                    int var8 = 3 & -arg1 + arg0;
                    while (true) {
                        --var8;
                        if (var8 < 0) {
                            return;
                        }
                        arg5[var7++] = 1;
                    }
                }
                arg5[var7++] = 1;
                arg5[var7++] = 1;
                arg5[var7++] = 1;
                arg5[var7++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)[I", line = 115)
    public final int[] method208(int arg0, int arg1) {
        if (arg0 != -9) {
            this.field2023 = -90;
        }
        ++field2019;
        int[] var3 = super.field3750.method256(arg1, arg0 ^ 30366);
        if (super.field3750.field554) {
            int var4 = class454.field6637[arg1] + -2048;
            for (int var5 = 0; var5 < class507.field7456; ++var5) {
                int var6 = class192.field2736[var5] + -2048;
                int var7 = this.field2018 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = this.field2016 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field2024;
                int var14 = var13 < -2048 ? var13 - -4096 : var13;
                int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var16 = this.field2027 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method920(1046438, var12, var9) && !this.method919(2073163820, var15, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 315)
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Llh;II)V", line = 171)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field2023 = arg0.method2062((byte) 14);
                                }
                            } else {
                                this.field2025 = arg0.method2062((byte) 14);
                            }
                        } else {
                            this.field2017 = arg0.method2062((byte) 14);
                        }
                    } else {
                        this.field2027 = arg0.method2062((byte) 14);
                    }
                } else {
                    this.field2024 = arg0.method2062((byte) 14);
                }
            } else {
                this.field2016 = arg0.method2062((byte) 14);
            }
        } else {
            this.field2018 = arg0.method2062((byte) 14);
        }
        if (arg1 != -30446) {
            this.field2024 = 117;
        }
        ++field2028;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V", line = 266)
    public final void method207(int arg0) {
        if (arg0 != 2) {
            this.method208(114, -65);
        }
        class99.method664((byte) -69);
        ++field2022;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)Z", line = 277)
    private final boolean method919(int arg0, int arg1, int arg2) {
        if (arg0 != 2073163820) {
            return true;
        } else {
            ++field2020;
            int var4 = (arg1 + arg2) * this.field2017 >> 12;
            int var5 = class441.field6422[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field2017;
            int var7 = (var6 << 12) / this.field2023;
            int var8 = this.field2025 * var7 >> 12;
            return ~var8 < ~(-arg1 + arg2) && ~(-var8) > ~(-arg1 + arg2);
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)Z", line = 300)
    private final boolean method920(int arg0, int arg1, int arg2) {
        ++field2026;
        int var4 = (-arg2 + arg1) * this.field2017 >> 12;
        int var5 = class441.field6422[(arg0 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field2017;
        int var7 = (var6 << 12) / this.field2023;
        int var8 = this.field2025 * var7 >> 12;
        return arg1 + arg2 < var8 && ~(-var8) > ~(arg1 + arg2);
    }
}
