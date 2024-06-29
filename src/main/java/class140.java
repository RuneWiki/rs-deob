import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class140 extends class51 {

    @OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
    private int field2902 = 1024;

    @OriginalMember(owner = "client!pd", name = "rb", descriptor = "I")
    private int field2912 = 1024;

    @OriginalMember(owner = "client!pd", name = "yb", descriptor = "I")
    private int field2919 = 0;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    private int field2894 = 409;

    @OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
    private int field2905 = 8;

    @OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
    private int field2907 = 4;

    @OriginalMember(owner = "client!pd", name = "Bb", descriptor = "I")
    private int field2922 = 81;

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
    private int field2897 = 204;

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "Led;")
    private static class43 field2909 = class191.method1219("Enter your username (V password)3", false);

    @OriginalMember(owner = "client!pd", name = "ib", descriptor = "Led;")
    public static class43 field2903 = field2909;

    @OriginalMember(owner = "client!pd", name = "jb", descriptor = "Led;")
    private static class43 field2904 = class191.method1219("slide:", false);

    @OriginalMember(owner = "client!pd", name = "xb", descriptor = "Led;")
    public static class43 field2918 = class191.method1219("Lade Schrifts-=tze )2 ", false);

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "Led;")
    public static class43 field2908 = field2904;

    @OriginalMember(owner = "client!pd", name = "fb", descriptor = "Led;")
    public static class43 field2900 = field2904;

    @OriginalMember(owner = "client!pd", name = "vb", descriptor = "Led;")
    public static class43 field2916 = class191.method1219("title_mute", false);

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    private int field2899;

    @OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
    private int field2906;

    @OriginalMember(owner = "client!pd", name = "sb", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!pd", name = "tb", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!pd", name = "ub", descriptor = "I")
    private int field2915;

    @OriginalMember(owner = "client!pd", name = "wb", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!pd", name = "zb", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!pd", name = "Ab", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!pd", name = "Cb", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!pd", name = "Db", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!pd", name = "qb", descriptor = "[I")
    private int[] field2911;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "[[I")
    private int[][] field2895;

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "[[I")
    private int[][] field2910;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILte;II[Lqh;[B)V")
    public static final void method900(int arg0, class177 arg1, int arg2, int arg3, class153[] arg4, byte[] arg5) {
        ++field2917;
        if (arg3 == 27158) {
            class89 var6 = new class89(arg5);
            int var7 = -1;
            while (true) {
                int var8 = var6.method533((byte) 75);
                if (var8 == 0) {
                    return;
                }
                var7 += var8;
                int var9 = 0;
                while (true) {
                    int var10 = var6.method533((byte) 75);
                    if (~var10 == -1) {
                        break;
                    }
                    var9 += var10 - 1;
                    int var11 = var9 & 63;
                    int var12 = var9 >> 6 & 63;
                    int var13 = var9 >> 12;
                    int var14 = var6.method538((byte) 109);
                    int var15 = var14 >> 2;
                    int var16 = arg0 + var12;
                    int var17 = var11 - -arg2;
                    int var18 = 3 & var14;
                    if (var16 > 0 && ~var17 < -1 && var16 < 103 && var17 < 103) {
                        int var19 = var13;
                        if (~(class15.field232[1][var16][var17] & 2) == -3) {
                            var19 = var13 - 1;
                        }
                        class153 var20 = null;
                        if (var19 >= 0) {
                            var20 = arg4[var19];
                        }
                        class205.method1325((byte) 121, var16, var20, var18, var17, var15, arg1, var13, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field2921;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field2912 = arg0.method555(-1113627096);
                                    }
                                } else {
                                    this.field2922 = arg0.method555(-1113627096);
                                }
                            } else {
                                this.field2919 = arg0.method555(-1113627096);
                            }
                        } else {
                            this.field2902 = arg0.method555(-1113627096);
                        }
                    } else {
                        this.field2897 = arg0.method555(-1113627096);
                    }
                } else {
                    this.field2894 = arg0.method555(-1113627096);
                }
            } else {
                this.field2905 = arg0.method538((byte) 108);
            }
        } else {
            this.field2907 = arg0.method538((byte) -85);
        }
        if (arg1 != 0) {
            this.field2905 = -93;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            return null;
        } else {
            ++field2901;
            int[] var3 = super.field1025.method39(arg1, (byte) 39);
            if (super.field1025.field154) {
                int var4 = 0;
                int var5;
                for (var5 = class40.field771[arg1] + this.field2919; ~var5 > -1; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (this.field2905 > var4 && ~var5 <= ~this.field2911[var4]) {
                    ++var4;
                }
                float var6 = (float) this.field2911[var4 + -1];
                float var7 = (float) this.field2911[var4];
                if ((float) this.field2915 + var6 < (float) var5 && var7 - (float) this.field2915 > (float) var5) {
                    for (int var8 = 0; ~var8 > ~class122.field2442; ++var8) {
                        int var9 = 0;
                        int var10 = var4 % 2 != 0 ? -this.field2902 : this.field2902;
                        int var11;
                        for (var11 = class95.field1855[var8] - -(this.field2899 * var10 >> 12); var11 < 0; var11 += 4096) {
                        }
                        while (var11 > 4096) {
                            var11 -= 4096;
                        }
                        while (~this.field2907 < ~var9 && ~this.field2895[var4 + -1][var9] >= ~var11) {
                            ++var9;
                        }
                        float var12 = (float) this.field2895[var4 + -1][var9 + -1];
                        float var13 = (float) this.field2895[var4 + -1][var9];
                        if ((float) this.field2915 + var12 < (float) var11 && (float) var11 < var13 - (float) this.field2915) {
                            var3[var8] = this.field2910[var4 - 1][var9 - 1];
                        } else {
                            var3[var8] = 0;
                        }
                    }
                } else {
                    class42.method233(var3, 0, class122.field2442, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
    public static void method901(int arg0) {
        field2908 = null;
        int var1 = 93 % ((-52 - arg0) / 56);
        field2918 = null;
        field2903 = null;
        field2916 = null;
        field2904 = null;
        field2909 = null;
        field2900 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class140() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field2913;
        if (arg0 > -83) {
            this.field2895 = null;
        }
        this.method902(19308);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    private final void method902(int arg0) {
        ++field2898;
        if (arg0 != 19308) {
            this.method27(58, -72);
        }
        Random var2 = new Random((long) this.field2905);
        this.field2911 = new int[this.field2905 + 1];
        this.field2911[0] = 0;
        this.field2915 = this.field2922 / 2;
        this.field2910 = new int[this.field2905][this.field2907];
        this.field2906 = 4096 / this.field2905;
        this.field2895 = new int[this.field2905][this.field2907 + 1];
        int var3 = this.field2906 / 2;
        this.field2899 = 4096 / this.field2907;
        int var4 = this.field2899 / 2;
        for (int var5 = 0; var5 < this.field2905; ++var5) {
            if (var5 > 0) {
                int var6 = this.field2906;
                int var7 = (class153.method970((byte) 57, var2, 4096) - 2048) * this.field2897 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field2911[var5] = this.field2911[var5 + -1] + var8;
            }
            this.field2895[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2907; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field2899;
                    int var11 = (-2048 + class153.method970((byte) 109, var2, 4096)) * this.field2894 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field2895[var5][var9] = this.field2895[var5][var9 - 1] + var12;
                }
                this.field2910[var5][var9] = ~this.field2912 < -1 ? -class153.method970((byte) 82, var2, this.field2912) + 4096 : 4096;
            }
            this.field2895[var5][this.field2907] = 4096;
        }
        this.field2911[this.field2905] = 4096;
    }
}
