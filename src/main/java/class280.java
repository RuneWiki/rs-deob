import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class280 extends class157 {

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    private int field4392;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    private int field4394;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    private int field4384;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    private int field4393;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    private int field4383;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
    private int field4390;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    private int field4387;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    private int field4397;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4386 = "Loaded update list";

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4379 = "Opened title screen";

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "[Z")
    public static boolean[] field4378 = new boolean[100];

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 5)
    public static void method1970(int arg0) {
        field4386 = null;
        field4379 = null;
        field4378 = null;
        if (arg0 != -1) {
            method1973(true);
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(III)V", line = 18)
    public final void method144(int arg0, int arg1, int arg2) {
        field4391++;
        if (arg1 != 1) {
            field4379 = (String) null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLtk;)V", line = 28)
    public static final void method1971(byte arg0, class266 arg1) {
        if (class75.field1156 == arg1.field4050) {
            field4378[arg1.field4091] = true;
        }
        field4381++;
        if (arg0 != 101) {
            method1972(104, -86, (byte) -70, -116, -43);
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(III)V", line = 45)
    public final void method142(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field4387 = 5;
        }
        field4385++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIBII)V", line = 58)
    public static final void method1972(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg2 != 107) {
            method1973(true);
        }
        while (var5 < class288.field4545) {
            if (class301.field4798[var5] + class277.field4356[var5] > arg0 && class277.field4356[var5] < arg0 + arg4 && class211.field3315[var5] + class11.field250[var5] > arg1 && class11.field250[var5] < (arg1 + arg3)) {
                class282.field4415[var5] = true;
            }
            var5++;
        }
        field4382++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 80)
    public static final void method1973(boolean arg0) {
        if (arg0) {
            method1975(118, -109);
        }
        field4388++;
        class337.field5212.method2282((byte) -124);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 93)
    public class280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4392 = arg1;
        this.field4394 = arg7;
        this.field4384 = arg2;
        this.field4393 = arg3;
        this.field4383 = arg0;
        this.field4390 = arg6;
        this.field4387 = arg5;
        this.field4397 = arg4;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)I", line = 111)
    public static final int method1974(int arg0, int arg1) {
        field4389++;
        int var2 = -2 / ((arg0 + 35) / 44);
        int var3 = arg1 & 0x3F;
        int var4 = (arg1 & 0xED) >> 6;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V", line = 184)
    public final void method141(int arg0, int arg1, int arg2) {
        field4395++;
        int var4 = this.field4383 * arg0 >> 12;
        int var5 = this.field4392 * arg2 >> 12;
        int var6 = this.field4384 * arg0 >> 12;
        int var7 = this.field4397 * arg0 >> 12;
        int var8 = this.field4393 * arg2 >> 12;
        int var9 = this.field4390 * arg0 >> 12;
        int var10 = this.field4387 * arg2 >> 12;
        int var11 = 21 / ((-arg1 - 24) / 60);
        int var12 = this.field4394 * arg2 >> 12;
        class102.method828(var4, var7, this.field2573, var8, var12, var10, -36, var9, var5, var6);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)V", line = 209)
    public static final void method1975(int arg0, int arg1) {
        class332.field5182.method2285(arg0, (byte) -3);
        field4380++;
        if (arg1 != 12551) {
            method1973(true);
        }
    }
}
