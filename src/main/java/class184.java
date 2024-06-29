import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class184 extends class300 {

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    private int field2897 = 8;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    private int field2888 = 409;

    @OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
    private int field2908 = 1024;

    @OriginalMember(owner = "client!rl", name = "cb", descriptor = "I")
    private int field2911 = 204;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
    private int field2891 = 4;

    @OriginalMember(owner = "client!rl", name = "gb", descriptor = "I")
    private int field2915 = 81;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "I")
    private int field2904 = 0;

    @OriginalMember(owner = "client!rl", name = "fb", descriptor = "I")
    private int field2914 = 1024;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field2899 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    public static int field2895 = 0;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!rl", name = "ab", descriptor = "I")
    private int field2909;

    @OriginalMember(owner = "client!rl", name = "bb", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!rl", name = "db", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!rl", name = "eb", descriptor = "I")
    private int field2913;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "[I")
    private int[] field2905;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "[[I")
    private int[][] field2898;

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "[[I")
    private int[][] field2906;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "[[[Lda;")
    public static class113[][][] field2892;

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
    public class184() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg1 > -43) {
            this.method144(-119);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field2914 = arg0.method1186((byte) -97);
                                    }
                                } else {
                                    this.field2915 = arg0.method1186((byte) -60);
                                }
                            } else {
                                this.field2904 = arg0.method1186((byte) -98);
                            }
                        } else {
                            this.field2908 = arg0.method1186((byte) -69);
                        }
                    } else {
                        this.field2911 = arg0.method1186((byte) -106);
                    }
                } else {
                    this.field2888 = arg0.method1186((byte) -78);
                }
            } else {
                this.field2897 = arg0.method1218(-23);
            }
        } else {
            this.field2891 = arg0.method1218(-83);
        }
        ++field2903;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
    private final void method1300(boolean arg0) {
        if (arg0) {
            Random var2 = new Random((long) this.field2897);
            this.field2894 = this.field2915 / 2;
            this.field2898 = new int[this.field2897][this.field2891];
            this.field2909 = 4096 / this.field2891;
            this.field2906 = new int[this.field2897][this.field2891 + 1];
            int var3 = this.field2909 / 2;
            this.field2905 = new int[this.field2897 + 1];
            this.field2913 = 4096 / this.field2897;
            ++field2893;
            this.field2905[0] = 0;
            int var4 = this.field2913 / 2;
            for (int var5 = 0; var5 < this.field2897; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field2913;
                    int var7 = (class19.method108(var2, 4096, 26329) + -2048) * this.field2911 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field2905[var5] = this.field2905[var5 + -1] + var8;
                }
                this.field2906[var5][0] = 0;
                for (int var9 = 0; ~var9 > ~this.field2891; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field2909;
                        int var11 = (-2048 + class19.method108(var2, 4096, 26329)) * this.field2888 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field2906[var5][var9] = this.field2906[var5][var9 - 1] - -var12;
                    }
                    this.field2898[var5][var9] = this.field2914 <= 0 ? 4096 : -class19.method108(var2, this.field2914, 26329) + 4096;
                }
                this.field2906[var5][this.field2891] = 4096;
            }
            this.field2905[this.field2897] = 4096;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lvl;Lvl;IZ)V")
    public static final void method1301(class73 arg0, class73 arg1, int arg2, boolean arg3) {
        ++field2896;
        class284.field4610 = arg0;
        if (arg2 >= -50) {
            field2892 = null;
        }
        class110.field1585 = arg1;
        class124.field1788 = arg3;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2912;
        if (arg5 != 0) {
            method1304(-28, -55);
        }
        int var7 = class196.method1369(class60.field882, arg1, true, class115.field1678);
        int var8 = class196.method1369(class60.field882, arg3, true, class115.field1678);
        int var9 = class196.method1369(class187.field2938, arg2, true, class56.field816);
        int var10 = class196.method1369(class187.field2938, arg6, true, class56.field816);
        int var11 = class196.method1369(class60.field882, arg1 + arg4, true, class115.field1678);
        int var12 = class196.method1369(class60.field882, arg3 - arg4, true, class115.field1678);
        for (int var13 = var7; ~var13 > ~var11; ++var13) {
            class16.method97(arg5 ^ -7, class78.field1180[var13], var10, arg0, var9);
        }
        for (int var14 = var8; var14 > var12; --var14) {
            class16.method97(-7, class78.field1180[var14], var10, arg0, var9);
        }
        int var15 = class196.method1369(class187.field2938, arg2 + arg4, true, class56.field816);
        int var16 = class196.method1369(class187.field2938, -arg4 + arg6, true, class56.field816);
        for (int var17 = var11; var12 >= var17; ++var17) {
            int[] var18 = class78.field1180[var17];
            class16.method97(arg5 ^ -7, var18, var15, arg0, var9);
            class16.method97(-7, var18, var10, arg0, var16);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BI[Lji;IZI)V")
    public static final void method1303(byte[] arg0, int arg1, class99[] arg2, int arg3, boolean arg4, int arg5) {
        class170 var6 = new class170(arg0);
        ++field2901;
        int var7 = -1;
        while (true) {
            int var8 = var6.method1201(523003696);
            if (var8 == 0) {
                if (arg5 != 4096) {
                    method1302(-40, -17, 100, -24, 8, 123, 19);
                    return;
                }
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1162(arg5 + -4225);
                if (~var10 == -1) {
                    break;
                }
                var9 += var10 + -1;
                int var11 = var9 & 63;
                int var12 = var6.method1218(67);
                int var13 = var9 >> 12;
                int var14 = (4076 & var9) >> 6;
                int var15 = var12 >> 2;
                int var16 = var12 & 3;
                int var17 = arg3 + var14;
                int var18 = var11 - -arg1;
                if (~var17 < -1 && ~var18 < -1 && ~var17 > -104 && var18 < 103) {
                    class99 var19 = null;
                    if (!arg4) {
                        int var20 = var13;
                        if ((2 & class74.field1121[1][var17][var18]) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class291.method1980(arg4, var13, var18, !arg4, var7, var13, var19, var16, var15, var17, 17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(II)V")
    public static final void method1304(int arg0, int arg1) {
        ++field2889;
        class181 var2 = class95.method652(arg1, (byte) 34, arg0);
        var2.method1283(192);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
    public static void method1305(boolean arg0) {
        field2899 = null;
        if (!arg0) {
            method1303((byte[]) null, -4, (class99[]) null, 113, false, -68);
        }
        field2892 = null;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V")
    public final void method144(int arg0) {
        this.method1300(true);
        if (arg0 >= 126) {
            ++field2902;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        if (arg1 != -957953300) {
            return null;
        } else {
            int[] var3 = super.field4797.method217(arg0, true);
            ++field2910;
            if (super.field4797.field470) {
                int var4 = 0;
                int var5;
                for (var5 = class235.field3797[arg0] + this.field2904; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (~this.field2897 < ~var4 && var5 >= this.field2905[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(1 & var4) == -1;
                int var8 = this.field2905[var4];
                int var9 = this.field2905[var4 + -1];
                if (~(this.field2894 + var9) > ~var5 && var8 - this.field2894 > var5) {
                    for (int var10 = 0; ~class180.field2826 < ~var10; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field2908 : this.field2908;
                        int var13;
                        for (var13 = class5.field73[var10] - -(this.field2909 * var12 >> 12); var13 < 0; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (~var11 > ~this.field2891 && ~var13 <= ~this.field2906[var6][var11]) {
                            ++var11;
                        }
                        int var14 = this.field2906[var6][var11];
                        int var15 = var11 - 1;
                        int var16 = this.field2906[var6][var15];
                        if (~(this.field2894 + var16) > ~var13 && var13 < -this.field2894 + var14) {
                            var3[var10] = this.field2898[var6][var15];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class103.method695(var3, 0, class180.field2826, 0);
                }
            }
            return var3;
        }
    }
}
