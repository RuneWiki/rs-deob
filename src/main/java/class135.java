import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class135 extends class50 {

    @OriginalMember(owner = "client!tc", name = "tb", descriptor = "I")
    private int field3058;

    @OriginalMember(owner = "client!tc", name = "nb", descriptor = "I")
    private int field3052;

    @OriginalMember(owner = "client!tc", name = "zb", descriptor = "I")
    private int field3064;

    @OriginalMember(owner = "client!tc", name = "pb", descriptor = "I")
    private int field3054;

    @OriginalMember(owner = "client!tc", name = "rb", descriptor = "I")
    private int field3056;

    @OriginalMember(owner = "client!tc", name = "qb", descriptor = "I")
    private int field3055;

    @OriginalMember(owner = "client!tc", name = "yb", descriptor = "I")
    private int field3063;

    @OriginalMember(owner = "client!tc", name = "sb", descriptor = "Lgd;")
    private class46 field3057;

    @OriginalMember(owner = "client!tc", name = "lb", descriptor = "I")
    private int field3050;

    @OriginalMember(owner = "client!tc", name = "ub", descriptor = "I")
    private int field3059;

    @OriginalMember(owner = "client!tc", name = "wb", descriptor = "Lid;")
    public static class60 field3061 = class11.method72("blaugr-Un:", (byte) -49);

    @OriginalMember(owner = "client!tc", name = "xb", descriptor = "Lof;")
    public static class103 field3062 = new class103(new byte[5000]);

    @OriginalMember(owner = "client!tc", name = "Db", descriptor = "Lid;")
    private static class60 field3068 = class11.method72("Press (Wrecover a locked account(W on front page)3", (byte) 103);

    @OriginalMember(owner = "client!tc", name = "Bb", descriptor = "[I")
    public static int[] field3066 = new int[128];

    @OriginalMember(owner = "client!tc", name = "Fb", descriptor = "Lid;")
    public static class60 field3070 = class11.method72("::clientdrop", (byte) 92);

    @OriginalMember(owner = "client!tc", name = "Cb", descriptor = "Z")
    public static boolean field3067 = false;

    @OriginalMember(owner = "client!tc", name = "Hb", descriptor = "[I")
    public static int[] field3072 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tc", name = "Eb", descriptor = "Lid;")
    public static class60 field3069 = field3068;

    @OriginalMember(owner = "client!tc", name = "mb", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!tc", name = "ob", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!tc", name = "vb", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!tc", name = "Ib", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!tc", name = "Jb", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!tc", name = "Gb", descriptor = "Lpa;")
    public static class105 field3071;

    @OriginalMember(owner = "client!tc", name = "Ab", descriptor = "Lae;")
    public static class6 field3065;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILef;)V")
    public static final void method1057(int arg0, class35 arg1) {
        if (class82.field2065 == arg1.field845 || arg1.field806 == -1 || arg1.field842 != 0 || arg1.field811 + 1 > class44.method344(arg1.field806, (byte) -53).field1196[arg1.field858]) {
            int var2 = arg1.field845 - arg1.field851;
            int var3 = class82.field2065 - arg1.field851;
            int var4 = arg1.field872 * 64 + arg1.field818 * 128;
            int var5 = arg1.field882 * 128 + arg1.field872 * 64;
            arg1.field854 = ((var2 - var3) * var4 + var3 * var5) / var2;
            int var6 = arg1.field835 * 128 + arg1.field872 * 64;
            int var7 = arg1.field819 * 128 + arg1.field872 * 64;
            arg1.field828 = ((var2 - var3) * var6 + var3 * var7) / var2;
        }
        field3060++;
        arg1.field836 = 0;
        if (arg1.field862 == 0) {
            arg1.field822 = 1024;
        }
        if (arg1.field862 == 1) {
            arg1.field822 = 1536;
        }
        if (arg0 != 28701) {
            return;
        }
        if (arg1.field862 == 2) {
            arg1.field822 = 0;
        }
        if (arg1.field862 == 3) {
            arg1.field822 = 512;
        }
        arg1.field864 = arg1.field822;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIILof;I)V")
    public static final void method1058(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class103 arg6, int arg7) {
        field3051++;
        if (arg5 < 11) {
            field3067 = false;
        }
        if (arg4 < 0 || arg4 >= 104 || arg2 < 0 || arg2 >= 104) {
            while (true) {
                int var10 = arg6.method829((byte) 84);
                if (var10 == 0) {
                    return;
                }
                if (var10 == 1) {
                    arg6.method829((byte) -120);
                    return;
                }
                if (var10 <= 49) {
                    arg6.method829((byte) -128);
                }
            }
        }
        class124.field2869[arg7][arg4][arg2] = 0;
        while (true) {
            int var8 = arg6.method829((byte) -123);
            if (var8 == 0) {
                if (arg7 == 0) {
                    class113.field2711[0][arg4][arg2] = -class69.method517(48, arg2 + arg3 + 556238, 932731 - -arg4 + arg1) * 8;
                    return;
                } else {
                    class113.field2711[arg7][arg4][arg2] = class113.field2711[arg7 - 1][arg4][arg2] - 240;
                    return;
                }
            }
            if (var8 == 1) {
                int var9 = arg6.method829((byte) -116);
                if (var9 == 1) {
                    var9 = 0;
                }
                if (arg7 != 0) {
                    class113.field2711[arg7][arg4][arg2] = class113.field2711[arg7 - 1][arg4][arg2] - var9 * 8;
                    return;
                }
                class113.field2711[0][arg4][arg2] = -var9 * 8;
                return;
            }
            if (var8 <= 49) {
                class22.field520[arg7][arg4][arg2] = arg6.method843(true);
                class8.field117[arg7][arg4][arg2] = (byte) ((var8 - 2) / 4);
                class18.field458[arg7][arg4][arg2] = (byte) class80.method680(3, arg0 + var8 - 2);
            } else if (var8 <= 81) {
                class124.field2869[arg7][arg4][arg2] = (byte) (var8 - 49);
            } else {
                class152.field3417[arg7][arg4][arg2] = (byte) (var8 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)Lka;")
    public final class70 method1(int arg0) {
        field3053++;
        if (this.field3057 != null) {
            int var2 = class82.field2065 - this.field3059;
            if (var2 > 100 && this.field3057.field1209 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (this.field3057.field1196[this.field3050] >= var2) {
                            break label38;
                        }
                        var2 -= this.field3057.field1196[this.field3050];
                        this.field3050++;
                    } while (this.field3050 < this.field3057.field1218.length);
                    this.field3050 -= this.field3057.field1209;
                } while (this.field3050 >= 0 && this.field3050 < this.field3057.field1218.length);
                this.field3057 = null;
            }
            this.field3059 = class82.field2065 - var2;
        }
        class148 var3 = class31.method238(-29628, this.field3058);
        int var4 = -128 % ((arg0 + 1) / 43);
        if (var3.field3364 != null) {
            var3 = var3.method1124(-11);
        }
        return var3 == null ? null : var3.method1129(this.field3063, this.field3054, this.field3057, this.field3056, this.field3052, (byte) 90, this.field3050, this.field3055, this.field3064);
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
    public static void method1059(int arg0) {
        field3066 = null;
        if (arg0 < 70) {
            field3068 = null;
        }
        field3061 = null;
        field3062 = null;
        field3069 = null;
        field3065 = null;
        field3068 = null;
        field3072 = null;
        field3071 = null;
        field3070 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIIIIIZLha;)V")
    public class135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class50 arg9) {
        this.field3058 = arg0;
        this.field3052 = arg6;
        this.field3064 = arg1;
        this.field3054 = arg2;
        this.field3056 = arg4;
        this.field3055 = arg3;
        this.field3063 = arg5;
        if (arg7 != -1) {
            this.field3057 = class44.method344(arg7, (byte) -83);
            this.field3050 = 0;
            this.field3059 = class82.field2065 - 1;
            if (this.field3057.field1208 == 0 && arg9 != null && arg9 instanceof class135) {
                class135 var11 = (class135) arg9;
                if (this.field3057 == var11.field3057) {
                    this.field3059 = var11.field3059;
                    this.field3050 = var11.field3050;
                    return;
                }
            }
            if (arg8 && this.field3057.field1209 != -1) {
                this.field3050 = (int) (Math.random() * (double) this.field3057.field1218.length);
                this.field3059 -= (int) ((double) this.field3057.field1196[this.field3050] * Math.random());
                return;
            }
        }
    }
}
