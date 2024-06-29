import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class127 extends class50 {

    @OriginalMember(owner = "client!te", name = "rb", descriptor = "I")
    private int field3021 = 0;

    @OriginalMember(owner = "client!te", name = "Db", descriptor = "Z")
    public boolean field3033 = false;

    @OriginalMember(owner = "client!te", name = "Hb", descriptor = "I")
    private int field3037 = 0;

    @OriginalMember(owner = "client!te", name = "vb", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!te", name = "Bb", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!te", name = "Tb", descriptor = "I")
    private int field3049;

    @OriginalMember(owner = "client!te", name = "sb", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!te", name = "Fb", descriptor = "I")
    public int field3035;

    @OriginalMember(owner = "client!te", name = "wb", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!te", name = "Lb", descriptor = "Le;")
    private class29 field3041;

    @OriginalMember(owner = "client!te", name = "Cb", descriptor = "I")
    public static int field3032 = -1;

    @OriginalMember(owner = "client!te", name = "yb", descriptor = "[[B")
    public static byte[][] field3028 = new byte[250][];

    @OriginalMember(owner = "client!te", name = "tb", descriptor = "I")
    public static int field3023 = 0;

    @OriginalMember(owner = "client!te", name = "Ib", descriptor = "Lrd;")
    public static class114 field3038 = class84.method656("(U5", (byte) 114);

    @OriginalMember(owner = "client!te", name = "zb", descriptor = "[I")
    public static int[] field3029 = new int[128];

    @OriginalMember(owner = "client!te", name = "Ab", descriptor = "Lrd;")
    private static class114 field3030 = class84.method656("This world is full)3", (byte) 116);

    @OriginalMember(owner = "client!te", name = "Sb", descriptor = "Lrd;")
    private static class114 field3048 = class84.method656("Login", (byte) 127);

    @OriginalMember(owner = "client!te", name = "ub", descriptor = "Lrd;")
    public static class114 field3024 = field3048;

    @OriginalMember(owner = "client!te", name = "Wb", descriptor = "Lrd;")
    public static class114 field3052 = field3030;

    @OriginalMember(owner = "client!te", name = "Rb", descriptor = "Lrd;")
    public static class114 field3047 = class84.method656("und loggen sich dann erneut ein)3", (byte) 122);

    @OriginalMember(owner = "client!te", name = "xb", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!te", name = "Gb", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!te", name = "Jb", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!te", name = "Kb", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!te", name = "Mb", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!te", name = "Nb", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!te", name = "Ob", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!te", name = "Pb", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!te", name = "Eb", descriptor = "Lpb;")
    public static class100 field3034;

    @OriginalMember(owner = "client!te", name = "Qb", descriptor = "Lid;")
    public static class60 field3046;

    @OriginalMember(owner = "client!te", name = "Vb", descriptor = "Ljd;")
    public static class66 field3051;

    @OriginalMember(owner = "client!te", name = "Ub", descriptor = "Lmc;")
    public static class83 field3050;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
    public static final void method981(byte arg0) {
        class61.field1303.method1054(8, 240);
        if (class123.field2905 != -1) {
            class104.method800(class123.field2905, (byte) -90);
            class24.field460 = true;
            class20.field357 = -1;
            class103.field2410 = true;
            class123.field2905 = -1;
        }
        if (class123.field2899 != -1) {
            class104.method800(class123.field2899, (byte) -90);
            class140.field3335 = true;
            class20.field357 = -1;
            class123.field2899 = -1;
        }
        field3039++;
        class11.field174++;
        if (class34.field671 != -1) {
            class104.method800(class34.field671, (byte) -90);
            class34.field671 = -1;
            class12.method101(false, 30);
        }
        if (class56.field1188 != -1) {
            class104.method800(class56.field1188, (byte) -90);
            class56.field1188 = -1;
        }
        if (class117.field2747 != -1) {
            class104.method800(class117.field2747, (byte) -90);
            class20.field357 = -1;
            class117.field2747 = -1;
        }
        if (arg0 != 99) {
            method982((byte) 60);
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
    public static final void method982(byte arg0) {
        class123.field2891.method200(-115);
        if (arg0 < 126) {
            field3047 = null;
        }
        field3042++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
    public static final void method983(int arg0, boolean arg1) {
        if (arg0 != 12698) {
            return;
        }
        for (int var2 = 0; var2 < class77.field1765; var2++) {
            class8 var3 = class123.field2894[class16.field317[var2]];
            int var4 = (class16.field317[var2] << 14) + 536870912;
            if (var3 != null && var3.method66((byte) -122) && var3.field121.field2944 == arg1 && var3.field121.method970(3061)) {
                int var5 = var3.field756 >> 7;
                int var6 = var3.field712 >> 7;
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    if (var3.field735 == 1 && (var3.field712 & 0x7F) == 64 && (var3.field756 & 0x7F) == 64) {
                        if (class50.field1049[var6][var5] == class109.field2524) {
                            continue;
                        }
                        class50.field1049[var6][var5] = class109.field2524;
                    }
                    if (!var3.field121.field2938) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class101.field2325.method1014(class20.field346, var3.field712, var3.field756, class137.method1110(class20.field346, var3.field735 * 64 + var3.field712 - 64, (var3.field735 - 1) * 64 + var3.field756, (byte) 37), var3.field735 * 64 + 60 - 64, var3, var3.field700, var4, var3.field698);
                }
            }
        }
        field3045++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)V")
    public final void method984(byte arg0, int arg1) {
        field3027++;
        if (this.field3033) {
            return;
        }
        this.field3021 += arg1;
        if (arg0 < 62) {
            method986(-39);
        }
        while (this.field3021 > this.field3041.field605[this.field3037]) {
            this.field3021 -= this.field3041.field605[this.field3037];
            this.field3037++;
            if (this.field3037 >= this.field3041.field607.length) {
                this.field3033 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lpb;Lrd;Lrd;Z)Lhe;")
    public static final class54 method985(class100 arg0, class114 arg1, class114 arg2, boolean arg3) {
        field3043++;
        int var4 = arg0.method766(arg1, (byte) -111);
        if (!arg3) {
            method985(null, null, null, false);
        }
        int var5 = arg0.method752(arg2, -31757, var4);
        return class58.method424(arg0, var5, var4, -218);
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)Lue;")
    public final class133 method67(byte arg0) {
        if (arg0 >= -9) {
            field3038 = null;
        }
        field3036++;
        class62 var2 = class74.method606(true, this.field3049);
        class133 var3;
        if (this.field3033) {
            var3 = var2.method511(-1565796086, -1);
        } else {
            var3 = var2.method511(-1565796086, this.field3037);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public static void method986(int arg0) {
        field3029 = null;
        if (arg0 <= 12) {
            return;
        }
        field3052 = null;
        field3047 = null;
        field3048 = null;
        field3051 = null;
        field3030 = null;
        field3034 = null;
        field3046 = null;
        field3028 = null;
        field3038 = null;
        field3050 = null;
        field3024 = null;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIII)V")
    public class127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3025 = arg3;
        this.field3031 = arg1;
        this.field3049 = arg0;
        this.field3022 = arg4;
        this.field3035 = arg2;
        this.field3026 = arg5 + arg6;
        int var8 = class74.method606(true, this.field3049).field1332;
        if (var8 == -1) {
            this.field3033 = true;
        } else {
            this.field3033 = false;
            this.field3041 = class12.method97(var8, false);
        }
    }
}
