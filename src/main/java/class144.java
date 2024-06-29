import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class144 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public int field2457 = -1;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
    private int[] field2458 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Z")
    public boolean field2473 = false;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Lmh;")
    public static class128 field2452 = class22.method156(125, " <col=ffff00>");

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field2456 = 0;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lmh;")
    public static class128 field2459 = class22.method156(122, "::wm3");

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lem;")
    public static class10 field2462;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Lwf;")
    public static class54 field2465;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lwf;")
    public static class54 field2470;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "[I")
    private int[] field2468;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "[Lpm;")
    public static class96[] field2472;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
    private short[] field2460;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[S")
    private short[] field2463;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "[S")
    private short[] field2467;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "[S")
    private short[] field2475;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "[[I")
    public static int[][] field2461;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method957(int arg0) {
        field2464++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2458[var3] != -1 && !class129.field2241.method2164(-2, 0, this.field2458[var3])) {
                var2 = false;
            }
        }
        int var4 = 89 / ((14 - arg0) / 38);
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V", line = 31)
    public static final void method958(byte arg0, int arg1) {
        field2455++;
        if (arg1 == -1 || !class9.field201[arg1]) {
            return;
        }
        int var2 = 114 % ((arg0 - 60) / 50);
        class194.field3357.method2153(-1, arg1);
        if (class200.field3508[arg1] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class200.field3508[arg1].length; var4++) {
            if (class200.field3508[arg1][var4] != null) {
                if (class200.field3508[arg1][var4].field288 == 2) {
                    var3 = false;
                } else {
                    class200.field3508[arg1][var4] = null;
                }
            }
        }
        if (var3) {
            class200.field3508[arg1] = null;
        }
        class9.field201[arg1] = false;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILvd;)V", line = 82)
    public static final void method959(int arg0, class127 arg1) {
        field2466++;
        short var2 = 256;
        if (arg0 != 14649) {
            method964((class128) null, -92);
        }
        for (int var3 = 0; var3 < class121.field2052.length; var3++) {
            class121.field2052[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var2);
            class121.field2052[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var2 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class75.field1408[var9] = (class121.field2052[var9 + 1] + class121.field2052[var9 - 1] + class121.field2052[var9 + -128] + class121.field2052[var9 + 128]) / 4;
                }
            }
            int[] var10 = class121.field2052;
            class121.field2052 = class75.field1408;
            class75.field1408 = var10;
        }
        if (arg1 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1.field2610; var12++) {
            for (int var13 = 0; var13 < arg1.field2625; var13++) {
                if (arg1.field2163[var11++] != 0) {
                    int var14 = var13 + arg1.field2626 + 16;
                    int var15 = var12 + arg1.field2615 + 16;
                    int var16 = (var15 << 7) + var14;
                    class121.field2052[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V", line = 195)
    public static void method960(byte arg0) {
        field2462 = null;
        field2452 = null;
        field2461 = (int[][]) null;
        field2465 = null;
        field2472 = null;
        field2459 = null;
        field2470 = null;
        if (arg0 >= -115) {
            method964((class128) null, -102);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lbg;B)V", line = 211)
    public final void method961(class194 arg0, byte arg1) {
        field2454++;
        while (true) {
            int var3 = arg0.method1325(7627);
            if (var3 == 0) {
                if (arg1 != 81) {
                    field2456 = 68;
                }
                return;
            }
            this.method962(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZLbg;)V", line = 233)
    private final void method962(int arg0, boolean arg1, class194 arg2) {
        field2453++;
        if (!arg1) {
            method960((byte) -63);
        }
        if (arg0 == 1) {
            this.field2457 = arg2.method1325(7627);
        } else if (arg0 == 2) {
            int var8 = arg2.method1325(7627);
            this.field2468 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2468[var9] = arg2.method1308(-100);
            }
        } else if (arg0 == 3) {
            this.field2473 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method1325(7627);
            this.field2460 = new short[var4];
            this.field2475 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2475[var5] = (short) arg2.method1308(-21);
                this.field2460[var5] = (short) arg2.method1308(-114);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method1325(7627);
            this.field2467 = new short[var6];
            this.field2463 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2463[var7] = (short) arg2.method1308(-78);
                this.field2467[var7] = (short) arg2.method1308(-70);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field2458[arg0 - 60] = arg2.method1308(-127);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Z", line = 315)
    public final boolean method963(byte arg0) {
        field2471++;
        if (this.field2468 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2468.length; var3++) {
            if (!class129.field2241.method2164(-2, 0, this.field2468[var3])) {
                var2 = false;
            }
        }
        if (arg0 >= -123) {
            field2470 = (class54) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lmh;I)V", line = 340)
    public static final void method964(class128 arg0, int arg1) {
        field2469++;
        class88.method547(-1741557305);
        class106.method653(arg0, 63);
        if (arg1 != 480) {
            field2465 = (class54) null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Lig;", line = 368)
    public final class168 method965(int arg0) {
        field2476++;
        class168[] var2 = new class168[5];
        int var3 = arg0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2458[var4] != -1) {
                var2[var3++] = class168.method1106(class129.field2241, this.field2458[var4], 0);
            }
        }
        class168 var5 = new class168(var2, var3);
        if (this.field2475 != null) {
            for (int var6 = 0; var6 < this.field2475.length; var6++) {
                var5.method1107(this.field2475[var6], this.field2460[var6]);
            }
        }
        if (this.field2463 != null) {
            for (int var7 = 0; var7 < this.field2463.length; var7++) {
                var5.method1108(this.field2463[var7], this.field2467[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)Lig;", line = 422)
    public final class168 method966(int arg0) {
        field2474++;
        if (this.field2468 == null) {
            return null;
        }
        class168[] var2 = new class168[this.field2468.length];
        for (int var3 = arg0; var3 < this.field2468.length; var3++) {
            var2[var3] = class168.method1106(class129.field2241, this.field2468[var3], 0);
        }
        class168 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class168(var2, var2.length);
        }
        if (this.field2475 != null) {
            for (int var5 = 0; var5 < this.field2475.length; var5++) {
                var4.method1107(this.field2475[var5], this.field2460[var5]);
            }
        }
        if (this.field2463 != null) {
            for (int var6 = 0; var6 < this.field2463.length; var6++) {
                var4.method1108(this.field2463[var6], this.field2467[var6]);
            }
        }
        return var4;
    }
}
