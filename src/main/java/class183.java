import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class183 extends class252 {

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
    private int field3121 = 4096;

    @OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
    private int field3118 = 4096;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "[I")
    private int[] field3124 = new int[3];

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "I")
    private int field3127 = 4096;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
    private int field3125 = 409;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "Ljd;")
    public static class85 field3114 = class221.method1499("<br>(X", (byte) -58);

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "[I")
    public static int[] field3117 = new int[200];

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
    public static int field3128 = 0;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "Ljd;")
    public static class85 field3126 = class221.method1499("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) -91);

    @OriginalMember(owner = "client!ma", name = "kb", descriptor = "[I")
    public static int[] field3130 = new int[2000];

    @OriginalMember(owner = "client!ma", name = "ab", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3120 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ma", name = "nb", descriptor = "Ljd;")
    private static class85 field3133 = class221.method1499("", (byte) -55);

    @OriginalMember(owner = "client!ma", name = "mb", descriptor = "Ljd;")
    public static class85 field3132 = field3133;

    @OriginalMember(owner = "client!ma", name = "pb", descriptor = "Ljd;")
    public static class85 field3135 = class221.method1499("Spielwelt erstellt)3", (byte) 121);

    @OriginalMember(owner = "client!ma", name = "ob", descriptor = "Z")
    public static boolean field3134 = false;

    @OriginalMember(owner = "client!ma", name = "qb", descriptor = "Lsb;")
    public static class214 field3136 = new class214(64);

    @OriginalMember(owner = "client!ma", name = "sb", descriptor = "[Lje;")
    public static class178[] field3138 = new class178[27];

    @OriginalMember(owner = "client!ma", name = "T", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ma", name = "rb", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ma", name = "lb", descriptor = "Lfg;")
    public static class12 field3131;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        ++field3113;
        int[][] var3 = super.field4350.method155(arg0, false);
        if (arg1 != -123) {
            field3131 = null;
        }
        if (super.field4350.field338) {
            int[][] var4 = this.method1737(0, 3, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class5.field63; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field3124[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var13 > this.field3125) {
                    var9[var11] = var12;
                    var10[var11] = var6[var11];
                    var8[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3124[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field3125) {
                        var9[var11] = var12;
                        var10[var11] = var14;
                        var8[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3124[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field3125) {
                            var9[var11] = var12;
                            var10[var11] = var14;
                            var8[var11] = var16;
                        } else {
                            var9[var11] = this.field3127 * var12 >> 12;
                            var10[var11] = this.field3118 * var14 >> 12;
                            var8[var11] = this.field3121 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lge;Lge;B)I")
    public static final int method1254(class68 arg0, class68 arg1, byte arg2) {
        ++field3119;
        int var3 = 0;
        if (arg1.method468(true, class263.field4686)) {
            ++var3;
        }
        if (arg2 != 48) {
            return 43;
        } else {
            if (arg1.method468(true, class234.field4050)) {
                ++var3;
            }
            if (arg1.method468(true, class108.field1899)) {
                ++var3;
            }
            if (arg0.method468(true, class263.field4686)) {
                ++var3;
            }
            if (arg0.method468(true, class234.field4050)) {
                ++var3;
            }
            if (arg0.method468(true, class108.field1899)) {
                ++var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)Lme;")
    public static final class213 method1255(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field3646; ++var4) {
                class213 var5 = var3.field3650[var4];
                if ((var5.field3728 >> 29 & 3L) == 2L && var5.field3731 == arg1 && var5.field3729 == arg2) {
                    class104.method721(var5);
                    return var5;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            int var5 = arg0.method1691(arg2 + 19487);
                            this.field3124[0] = class135.method899(16711680, var5) << 4;
                            this.field3124[2] = class135.method899(var5, 255) >> 12;
                            this.field3124[1] = class135.method899(var5, 65280) >> 4;
                        }
                    } else {
                        this.field3127 = arg0.method1694((byte) -100);
                    }
                } else {
                    this.field3118 = arg0.method1694((byte) -100);
                }
            } else {
                this.field3121 = arg0.method1694((byte) -100);
            }
        } else {
            this.field3125 = arg0.method1694((byte) -100);
        }
        if (arg2 != -99) {
            field3126 = null;
        }
        ++field3116;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
    public static final void method1256(boolean arg0) {
        int var1 = (class22.field308.field1042 >> 7) + class244.field4172;
        ++field3122;
        if (arg0) {
            method1256(false);
        }
        class61.field1113 = 0;
        int var2 = (class22.field308.field1027 >> 7) + class213.field3742;
        if (~var1 <= -3054 && ~var1 >= -3157 && ~var2 <= -3057 && var2 <= 3136) {
            class61.field1113 = 1;
        }
        if (~var1 <= -3073 && ~var1 >= -3119 && var2 >= 9492 && ~var2 >= -9536) {
            class61.field1113 = 1;
        }
        if (class61.field1113 == 1 && ~var1 <= -3140 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class61.field1113 = 0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLb;)V")
    public static final void method1257(byte arg0, class81 arg1) {
        ++field3123;
        class155 var2 = null;
        try {
            class69 var3 = arg1.method554((byte) 73, "runescape");
            while (~var3.field1296 == -1) {
                class190.method1311(1L, 1);
            }
            if (arg0 != -71) {
                return;
            }
            if (~var3.field1296 == -2) {
                var2 = (class155) var3.field1292;
                class247 var4 = class219.method1492(-58);
                var2.method1016(0, var4.field4238, 1, var4.field4224);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1018(true);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
    public static void method1258(byte arg0) {
        field3130 = null;
        if (arg0 <= 48) {
            method1260(54, 15, 95, (int[]) null, -5);
        }
        field3136 = null;
        field3135 = null;
        field3133 = null;
        field3132 = null;
        field3126 = null;
        field3120 = null;
        field3138 = null;
        field3131 = null;
        field3117 = null;
        field3114 = null;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V")
    public static final void method1259(byte arg0) {
        if (arg0 <= 16) {
            method1257((byte) 92, (class81) null);
        }
        ++field3115;
        class51.field895 = 0;
        class241.field4151 = 0;
        class75.method531(116);
        class112.method763(124);
        class206.method1412(17236);
        for (int var1 = 0; ~var1 > ~class51.field895; ++var1) {
            int var3 = class5.field61[var1];
            if (~class151.field2555 != ~class194.field3320[var3].field1009) {
                if (class194.field3320[var3].field247.method1801(-126)) {
                    class154.method1011(class194.field3320[var3], (byte) 91);
                }
                class194.field3320[var3].field247 = null;
                class194.field3320[var3] = null;
            }
        }
        if (~class85.field1593 != ~class189.field3249.field4224) {
            throw new RuntimeException("gnp1 pos:" + class189.field3249.field4224 + " psize:" + class85.field1593);
        } else {
            for (int var2 = 0; class44.field775 > var2; ++var2) {
                if (class194.field3320[class137.field2380[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class44.field775);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[II)V")
    public static final void method1260(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        --arg1;
        int var14 = arg4 - 1;
        int var5 = var14 + -7;
        ++field3129;
        while (~arg1 > ~var5) {
            int var7 = arg1 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg1 = var13 + 1;
            arg3[arg1] = arg0;
        }
        int var6 = 125 % ((arg2 - -67) / 35);
        while (arg1 < var14) {
            ++arg1;
            arg3[arg1] = arg0;
        }
    }
}
