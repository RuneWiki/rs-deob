import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class179 extends class338 {

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    private int field2245;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public int field2238;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    private int field2239;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "I")
    private int field2248;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field2232;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    private int field2240;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public int field2231;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "Lnn;")
    public static class230 field2246 = new class230();

    @OriginalMember(owner = "client!m", name = "C", descriptor = "Z")
    public static boolean field2247 = false;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "Ldj;")
    public static class304 field2244;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "[Lh;")
    public static class427[] field2250;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V")
    public static final void method940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2242++;
        for (int var6 = arg0; var6 < arg0 + arg4; var6++) {
            for (int var10 = arg2; var10 < (arg1 + arg2); var10++) {
                if (var10 >= 0 && var10 < class315.field4214 && var6 >= 0 && class340.field4549 > var6) {
                    class432.field6340[arg5][var10][var6] = arg5 > 0 ? class432.field6340[arg5 - 1][var10][var6] - 240 : 0;
                }
            }
        }
        int var7 = 8 / ((arg3 + 54) / 48);
        if (arg2 > 0 && class315.field4214 > arg2) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg4; var8++) {
                if (var8 >= 0 && class340.field4549 > var8) {
                    class432.field6340[arg5][arg2][var8] = class432.field6340[arg5][arg2 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < class340.field4549) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg1); var9++) {
                if (var9 >= 0 && class315.field4214 > var9) {
                    class432.field6340[arg5][var9][arg0] = class432.field6340[arg5][var9][arg0 - 1];
                }
            }
        }
        if (arg2 < 0 || arg0 < 0 || class315.field4214 <= arg2 || arg0 >= class340.field4549) {
            return;
        }
        if (arg5 != 0) {
            if (arg2 > 0 && class432.field6340[arg5][arg2 - 1][arg0] != class432.field6340[arg5 - 1][arg2 - 1][arg0]) {
                class432.field6340[arg5][arg2][arg0] = class432.field6340[arg5][arg2 - 1][arg0];
                return;
            }
            if (arg0 > 0 && class432.field6340[arg5][arg2][arg0 - 1] != class432.field6340[arg5 - 1][arg2][arg0 - 1]) {
                class432.field6340[arg5][arg2][arg0] = class432.field6340[arg5][arg2][arg0 - 1];
                return;
            }
            if (arg2 > 0 && arg0 > 0 && class432.field6340[arg5 - 1][arg2 - 1][arg0 - 1] != class432.field6340[arg5][arg2 - 1][arg0 - 1]) {
                class432.field6340[arg5][arg2][arg0] = class432.field6340[arg5][arg2 - 1][arg0 - 1];
                return;
            }
            return;
        }
        if (arg2 > 0 && class432.field6340[arg5][arg2 - 1][arg0] != 0) {
            class432.field6340[arg5][arg2][arg0] = class432.field6340[arg5][arg2 - 1][arg0];
            return;
        }
        if (arg0 > 0 && class432.field6340[arg5][arg2][arg0 - 1] != 0) {
            class432.field6340[arg5][arg2][arg0] = class432.field6340[arg5][arg2][arg0 - 1];
            return;
        }
        if (arg2 > 0 && arg0 > 0 && class432.field6340[arg5][arg2 - 1][arg0 - 1] != 0) {
            class432.field6340[arg5][arg2][arg0] = class432.field6340[arg5][arg2 - 1][arg0 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method941(String arg0, int arg1, int arg2) {
        class328.field4376++;
        class281.field3857.method295(20579, arg1);
        field2251++;
        class281.field3857.method1386(-222840624, class75.method426(28555, arg0) + 1);
        class281.field3857.method1343(arg0, 22608);
        class281.field3857.method1388(arg1 + 31255, arg2);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)Z")
    public final boolean method942(int arg0, int arg1, int arg2, int arg3) {
        field2235++;
        if (arg2 != -1) {
            method940(49, 5, -92, 74, -27, -79);
        }
        return this.field2245 == arg0 && this.field2239 <= arg3 && this.field2248 >= arg3 && this.field2233 <= arg1 && arg1 <= this.field2240;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Z")
    public final boolean method943(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.field2238 = 0;
        }
        field2243++;
        return this.field2239 <= arg1 && this.field2248 >= arg1 && arg2 >= this.field2233 && this.field2240 >= arg2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI[II)V")
    public final void method944(byte arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = arg3 - (this.field2231 - this.field2239);
        arg2[0] = this.field2245;
        int var5 = 124 % ((52 - arg0) / 52);
        arg2[2] = arg1 - (this.field2232 - this.field2233);
        field2234++;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(III)Z")
    public final boolean method945(int arg0, int arg1, int arg2) {
        field2237++;
        int var4 = -44 / ((arg0 + 66) / 38);
        return arg2 >= this.field2231 && this.field2238 >= arg2 && this.field2232 <= arg1 && arg1 <= this.field2249;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method946(byte arg0) {
        field2244 = null;
        field2250 = null;
        field2246 = null;
        if (arg0 != -43) {
            field2247 = false;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBIIIII)I")
    public static final int method947(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2236++;
        int var7 = arg5 & 0x3;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 1 + 7 - arg4 - arg2;
        } else if (var7 == 2) {
            return 8 - arg6 - arg3;
        } else if (arg1 > -2) {
            return 114;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[II)V")
    public final void method948(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = arg3 + this.field2231 - this.field2239;
        field2241++;
        arg2[2] = this.field2232 + arg1 - this.field2233;
        arg2[0] = arg0;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2245 = arg0;
        this.field2238 = arg7;
        this.field2239 = arg1;
        this.field2248 = arg3;
        this.field2232 = arg6;
        this.field2233 = arg2;
        this.field2240 = arg4;
        this.field2231 = arg5;
        this.field2249 = arg8;
    }
}
