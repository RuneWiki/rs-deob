import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class161 extends class51 {

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "I")
    private int field3249 = 4096;

    @OriginalMember(owner = "client!rg", name = "nb", descriptor = "I")
    private int field3261 = 0;

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "Led;")
    public static class43 field3250 = class191.method1219("mapmarker", false);

    @OriginalMember(owner = "client!rg", name = "eb", descriptor = "Led;")
    public static class43 field3252 = class191.method1219("Lade)3)3)3", false);

    @OriginalMember(owner = "client!rg", name = "hb", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!rg", name = "kb", descriptor = "Led;")
    private static class43 field3258 = class191.method1219("flash2:", false);

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "[[S")
    public static short[][] field3248 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!rg", name = "fb", descriptor = "Led;")
    public static class43 field3253 = field3258;

    @OriginalMember(owner = "client!rg", name = "gb", descriptor = "I")
    public static int field3254 = 0;

    @OriginalMember(owner = "client!rg", name = "mb", descriptor = "Led;")
    public static class43 field3260 = class191.method1219(":clan:", false);

    @OriginalMember(owner = "client!rg", name = "jb", descriptor = "Led;")
    public static class43 field3257 = field3258;

    @OriginalMember(owner = "client!rg", name = "lb", descriptor = "I")
    public static int field3259 = 0;

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!rg", name = "ob", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!rg", name = "pb", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!rg", name = "ib", descriptor = "[[[I")
    public static int[][][] field3256;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field3251;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field3249 = arg0.method555(-1113627096);
            }
        } else {
            this.field3261 = arg0.method555(-1113627096);
        }
        if (arg1 != 0) {
            method1015(-108);
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    public static final void method1014(int arg0) {
        ++field3262;
        class125 var1 = (class125) class54.field1081.method753(arg0 + -30810);
        if (arg0 != 4107) {
            field3258 = null;
        }
        while (var1 != null) {
            if (~class93.field1839 == ~var1.field2492 && !var1.field2483) {
                if (~client.field559 <= ~var1.field2487) {
                    var1.method806(class65.field1325, arg0 ^ 8717);
                    if (var1.field2483) {
                        var1.method417(121);
                    } else {
                        class137.field2842.method1154(var1.field2492, var1.field2477, var1.field2484, var1.field2478, 60, var1, 0, -1, false);
                    }
                }
            } else {
                var1.method417(-2);
            }
            var1 = (class125) class54.field1081.method755((byte) 124);
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public static void method1015(int arg0) {
        field3258 = null;
        field3257 = null;
        field3256 = null;
        if (arg0 != -26417) {
            method1015(-124);
        }
        field3250 = null;
        field3248 = null;
        field3253 = null;
        field3260 = null;
        field3252 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BIIII)V")
    public static final void method1016(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg1; ~var5 >= ~(arg1 - -arg2); ++var5) {
            for (int var7 = arg3; var7 <= arg3 + arg4; ++var7) {
                if (~var7 <= -1 && var7 < 104 && var5 >= 0 && ~var5 > -105) {
                    class67.field1351[0][var7][var5] = 127;
                    if (~arg3 == ~var7 && ~var7 < -1) {
                        class158.field3203[0][var7][var5] = class158.field3203[0][var7 + -1][var5];
                    }
                    if (arg3 + arg4 == var7 && var7 < 103) {
                        class158.field3203[0][var7][var5] = class158.field3203[0][var7 - -1][var5];
                    }
                    if (~arg1 == ~var5 && var5 > 0) {
                        class158.field3203[0][var7][var5] = class158.field3203[0][var7][var5 + -1];
                    }
                    if (~(arg1 + arg2) == ~var5 && ~var5 > -104) {
                        class158.field3203[0][var7][var5] = class158.field3203[0][var7][var5 + 1];
                    }
                }
            }
        }
        int var6 = 38 / ((-71 - arg0) / 42);
        ++field3263;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            field3255 = 104;
        }
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int[] var4 = this.method314(0, (byte) -74, arg1);
            for (int var5 = 0; class122.field2442 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field3261 && ~var6 >= ~this.field3249 ? 4096 : 0;
            }
        }
        ++field3247;
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class161() {
        super(1, true);
    }
}
