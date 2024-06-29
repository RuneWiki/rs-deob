import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class103 extends class93 {

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    private int field2116 = 8192;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    private int field2109 = 0;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    private int field2115 = 12288;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    private int field2112 = 2048;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    private int field2114 = 0;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    private int field2121 = 4096;

    @OriginalMember(owner = "client!ke", name = "jb", descriptor = "I")
    private int field2126 = 2048;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "[I")
    public static int[] field2117 = new int[256];

    @OriginalMember(owner = "client!ke", name = "lb", descriptor = "Ljd;")
    public static class92 field2128;

    @OriginalMember(owner = "client!ke", name = "kb", descriptor = "Z")
    public static boolean field2127;

    @OriginalMember(owner = "client!ke", name = "nb", descriptor = "Ljd;")
    public static class92 field2130;

    @OriginalMember(owner = "client!ke", name = "pb", descriptor = "[S")
    public static short[] field2132;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "Ljd;")
    private static class92 field2125;

    @OriginalMember(owner = "client!ke", name = "qb", descriptor = "Ljd;")
    public static class92 field2133;

    @OriginalMember(owner = "client!ke", name = "mb", descriptor = "Ljd;")
    public static class92 field2129;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!ke", name = "ob", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)Z")
    private final boolean method705(int arg0, int arg1, int arg2) {
        ++field2113;
        int var4 = (arg1 - arg0) * this.field2115 >> 12;
        int var5 = class26.field598[(var4 * 255 & 1047400) >> 12];
        int var6 = (var5 << 12) / this.field2115;
        int var7 = (var6 << 12) / this.field2116;
        if (arg2 < 28) {
            this.field2115 = 26;
        }
        int var8 = this.field2121 * var7 >> 12;
        return var8 > arg0 + arg1 && ~(-var8) > ~(arg0 - -arg1);
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
    public static void method706(int arg0) {
        field2133 = null;
        field2117 = null;
        field2130 = null;
        if (arg0 != 1417644076) {
            method709(-88, (class1) null);
        }
        field2129 = null;
        field2132 = null;
        field2125 = null;
        field2128 = null;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        if (arg0 == -85) {
            class107.method738((byte) -20);
            ++field2131;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)V")
    public static final void method707(int arg0, int arg1, int arg2, int arg3) {
        ++field2118;
        if (~arg2 <= -129 && arg3 >= 128 && arg2 <= 13056 && ~arg3 >= -13057) {
            int var4 = -arg1 + class118.method804(arg2, class81.field1639, arg3, 0);
            int var5 = var4 - class124.field2511;
            int var6 = arg3 - class151.field2991;
            int var7 = arg2 - class132.field2645;
            int var8 = class194.field3803[class18.field451];
            int var9 = class194.field3787[class18.field451];
            int var10 = class194.field3787[class4.field268];
            int var11 = class194.field3803[class4.field268];
            if (arg0 != -1) {
                method706(108);
            }
            int var12 = var6 * var10 + var7 * var11 >> 16;
            int var13 = var6 * var11 + -(var7 * var10) >> 16;
            int var15 = var5 * var8 + -(var9 * var13) >> 16;
            int var16 = var5 * var9 + var8 * var13 >> 16;
            if (var16 < 50) {
                class185.field3498 = -1;
                class53.field1109 = -1;
            } else {
                class53.field1109 = (var15 << 9) / var16 + 167;
                class185.field3498 = (var12 << 9) / var16 + 256;
            }
        } else {
            class53.field1109 = -1;
            class185.field3498 = -1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class103() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(BII)Z")
    private final boolean method708(byte arg0, int arg1, int arg2) {
        ++field2120;
        if (arg0 != -38) {
            this.method705(-49, -83, 101);
        }
        int var4 = (arg1 + arg2) * this.field2115 >> 12;
        int var5 = class26.field598[(var4 * 255 & 1048407) >> 12];
        int var6 = (var5 << 12) / this.field2115;
        int var7 = (var6 << 12) / this.field2116;
        int var8 = this.field2121 * var7 >> 12;
        return ~(-arg2 + arg1) > ~var8 && -var8 < -arg2 + arg1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field2110;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field2116 = arg1.method442(-21351);
                                }
                            } else {
                                this.field2121 = arg1.method442(arg2 + -21351);
                            }
                        } else {
                            this.field2115 = arg1.method442(-21351);
                        }
                    } else {
                        this.field2126 = arg1.method442(-21351);
                    }
                } else {
                    this.field2114 = arg1.method442(-21351);
                }
            } else {
                this.field2109 = arg1.method442(-21351);
            }
        } else {
            this.field2112 = arg1.method442(arg2 + -21351);
        }
        if (arg2 != 0) {
            this.field2112 = -57;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILa;)Z")
    public static final boolean method709(int arg0, class1 arg1) {
        ++field2122;
        if (arg0 != 0) {
            return true;
        } else {
            if (class133.field2694) {
                if (~class114.method766(92, arg1) != -1) {
                    return false;
                }
                if (arg1.field10 == 0) {
                    return false;
                }
            }
            return arg1.field76;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field2111;
        int[] var3 = super.field1887.method916(arg0, -18);
        int var4 = 35 % ((67 - arg1) / 42);
        if (super.field1887.field2757) {
            int var5 = class166.field3271[arg0] + -2048;
            for (int var6 = 0; var6 < class150.field2985; ++var6) {
                int var7 = class75.field1574[var6] + -2048;
                int var8 = var7 - -this.field2112;
                int var9 = ~var8 <= 2047 ? var8 : var8 + 4096;
                int var10 = ~var9 < -2049 ? var9 + -4096 : var9;
                int var11 = this.field2109 + var5;
                int var12 = var11 >= -2048 ? var11 : var11 - -4096;
                int var13 = var12 <= 2048 ? var12 : var12 + -4096;
                int var14 = this.field2114 + var7;
                int var15 = var5 - -this.field2126;
                int var16 = ~var14 <= 2047 ? var14 : var14 + 4096;
                int var17 = var15 >= -2048 ? var15 : var15 + 4096;
                int var18 = ~var16 >= -2049 ? var16 : var16 + -4096;
                int var19 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var6] = !this.method705(var10, var13, 42) && !this.method708((byte) -38, var19, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(1 & var1) == -2) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field2117[var0] = var1;
        }
        field2128 = class202.method1325((byte) 90, "hint_headicons");
        field2127 = false;
        field2130 = class202.method1325((byte) 90, "sl_stars");
        field2132 = new short[] { 33, 58, 20, 5, 28, 42, 24, 26 };
        field2125 = class202.method1325((byte) 90, "red:");
        field2133 = field2125;
        field2129 = field2125;
    }
}
