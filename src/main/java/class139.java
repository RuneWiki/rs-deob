import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class139 extends class51 {

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    private int field2878 = 8192;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
    private int field2879 = 2048;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    private int field2886 = 0;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
    private int field2883 = 0;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    private int field2881 = 2048;

    @OriginalMember(owner = "client!pc", name = "sb", descriptor = "I")
    private int field2891 = 12288;

    @OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
    private int field2892 = 4096;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "[Lsf;")
    public static class169[] field2872 = new class169[4];

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "Led;")
    public static class43 field2876 = class191.method1219("jlv", false);

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "Led;")
    public static class43 field2873 = class191.method1219(")1", false);

    @OriginalMember(owner = "client!pc", name = "ub", descriptor = "Led;")
    private static class43 field2893 = class191.method1219("white:", false);

    @OriginalMember(owner = "client!pc", name = "pb", descriptor = "Led;")
    public static class43 field2888 = field2893;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "Led;")
    public static class43 field2875 = field2893;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!pc", name = "ob", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!pc", name = "qb", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!pc", name = "rb", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        class159.method999((byte) 13);
        ++field2880;
        if (arg0 >= -83) {
            this.field2883 = 119;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            return null;
        } else {
            int[] var3 = super.field1025.method39(arg1, (byte) 39);
            ++field2874;
            if (super.field1025.field154) {
                int var4 = class40.field771[arg1] + -2048;
                for (int var5 = 0; ~var5 > ~class122.field2442; ++var5) {
                    int var6 = class95.field1855[var5] + -2048;
                    int var7 = this.field2879 + var6;
                    int var8 = var7 < -2048 ? var7 + 4096 : var7;
                    int var9 = var4 - -this.field2883;
                    int var10 = ~var9 <= 2047 ? var9 : var9 + 4096;
                    int var11 = ~var10 < -2049 ? var10 - 4096 : var10;
                    int var12 = var8 > 2048 ? var8 - 4096 : var8;
                    int var13 = this.field2886 + var6;
                    int var14 = this.field2881 + var4;
                    int var15 = ~var13 > 2047 ? var13 + 4096 : var13;
                    int var16 = var14 < -2048 ? var14 + 4096 : var14;
                    int var17 = var16 > 2048 ? var16 + -4096 : var16;
                    int var18 = ~var15 >= -2049 ? var15 : var15 + -4096;
                    var3[var5] = !this.method896(-128, var11, var12) && !this.method895(var18, var17, (byte) 76) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Z")
    public static final boolean method894(int arg0, int arg1) {
        if (arg0 != 9873) {
            return true;
        } else {
            ++field2877;
            return ~((arg1 & 3474463) >> 21) != -1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIB)Z")
    private final boolean method895(int arg0, int arg1, byte arg2) {
        ++field2887;
        int var4 = 26 % ((arg2 - -27) / 57);
        int var5 = (arg0 + arg1) * this.field2891 >> 12;
        int var6 = class122.field2451[var5 * 255 >> 12 & 255];
        int var7 = (var6 << 12) / this.field2891;
        int var8 = (var7 << 12) / this.field2878;
        int var9 = this.field2892 * var8 >> 12;
        return ~(-arg0 + arg1) > ~var9 && -arg0 + arg1 > -var9;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(III)Z")
    private final boolean method896(int arg0, int arg1, int arg2) {
        ++field2885;
        if (arg0 > -126) {
            return true;
        } else {
            int var4 = (-arg2 + arg1) * this.field2891 >> 12;
            int var5 = class122.field2451[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field2891;
            int var7 = (var6 << 12) / this.field2878;
            int var8 = this.field2892 * var7 >> 12;
            return var8 > arg2 - -arg1 && ~(arg1 + arg2) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method27(-83, 104);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field2878 = arg0.method555(arg1 ^ -1113627096);
                                }
                            } else {
                                this.field2892 = arg0.method555(-1113627096);
                            }
                        } else {
                            this.field2891 = arg0.method555(-1113627096);
                        }
                    } else {
                        this.field2881 = arg0.method555(-1113627096);
                    }
                } else {
                    this.field2886 = arg0.method555(-1113627096);
                }
            } else {
                this.field2883 = arg0.method555(-1113627096);
            }
        } else {
            this.field2879 = arg0.method555(arg1 + -1113627096);
        }
        ++field2882;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(Z)V")
    public static void method897(boolean arg0) {
        field2875 = null;
        field2893 = null;
        field2873 = null;
        field2872 = null;
        field2888 = null;
        if (arg0) {
            field2888 = null;
        }
        field2876 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class139() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lpb;I)V")
    public static final void method898(class138 arg0, int arg1) {
        if (arg1 == -1399461812) {
            ++field2884;
            int var2 = 0;
            if (arg0.field2858 == 0) {
                var2 = class137.field2842.method1113(arg0.field2864, arg0.field2870, arg0.field2867);
            }
            if (~arg0.field2858 == -2) {
                var2 = class137.field2842.method1127(arg0.field2864, arg0.field2870, arg0.field2867);
            }
            if (arg0.field2858 == 2) {
                var2 = class137.field2842.method1137(arg0.field2864, arg0.field2870, arg0.field2867);
            }
            if (arg0.field2858 == 3) {
                var2 = class137.field2842.method1136(arg0.field2864, arg0.field2870, arg0.field2867);
            }
            int var3 = -1;
            int var4 = 0;
            int var5 = 0;
            if (var2 != 0) {
                int var6 = class137.field2842.method1125(arg0.field2864, arg0.field2870, arg0.field2867, var2);
                var5 = 3 & var6 >> 6;
                var4 = var6 & 31;
                var3 = (var2 & 536857396) >> 14;
            }
            arg0.field2853 = var4;
            arg0.field2869 = var5;
            arg0.field2857 = var3;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)V")
    public static final void method899(boolean arg0, int arg1) {
        class173.field3459 = 1000 / arg1;
        ++field2889;
        if (arg0) {
            method899(true, -91);
        }
    }
}
