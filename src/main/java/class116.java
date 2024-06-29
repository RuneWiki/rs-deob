import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class116 extends class37 {

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field2518 = 0;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field2517 = 0;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "Lo;")
    public static class84 field2515 = class15.method124("k", 255);

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    public static int field2525 = -1;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Lo;")
    public static class84 field2530 = class15.method124("Feb", 255);

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "[I")
    public static int[] field2531 = new int[1000];

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "[I")
    public static int[] field2532 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Z")
    public static boolean field2529 = false;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "Lo;")
    public static class84 field2524 = class15.method124("K", 255);

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "[J")
    public static long[] field2520 = new long[32];

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Lo;")
    public static class84 field2533 = class15.method124("headicons_hint", 255);

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field2538 = 0;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Leb;")
    public static class27 field2514 = new class27(8);

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "Lo;")
    public static class84 field2540 = class15.method124(")1", 255);

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Lo;")
    public static class84 field2542 = class15.method124(":", 255);

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "Lob;")
    public static class86 field2541;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Lqb;")
    public static class96 field2534;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "Lqb;")
    public static class96 field2539;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "Z")
    public static boolean field2513;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "[I")
    public int[] field2523;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "[I")
    public int[] field2526;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "[I")
    public int[] field2535;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "[I")
    public static int[] field2543;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "[Lqd;")
    public class98[] field2519;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "[Lqd;")
    public class98[] field2537;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "[[[B")
    public byte[][][] field2527;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Z", line = 17)
    public static final boolean method890(int arg0) {
        if (arg0 != -14465) {
            method891((byte) 29);
        }
        field2516++;
        class61 var1 = class85.field1929;
        synchronized (class85.field1929) {
            if (class54.field1118 == class24.field401) {
                return false;
            } else {
                class44.field899 = class107.field2269[class54.field1118];
                class5.field84 = class122.field2732[class54.field1118];
                class54.field1118 = class54.field1118 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V", line = 37)
    public static void method891(byte arg0) {
        field2534 = null;
        field2542 = null;
        field2524 = null;
        field2540 = null;
        field2541 = null;
        field2515 = null;
        field2514 = null;
        field2530 = null;
        field2533 = null;
        field2531 = null;
        field2539 = null;
        field2520 = null;
        int var1 = 117 / ((31 - arg0) / 53);
        field2543 = null;
        field2532 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([Lo;III)Lo;", line = 69)
    public static final class84 method892(class84[] arg0, int arg1, int arg2, int arg3) {
        field2528++;
        int var4 = 0;
        int var5 = 0;
        if (arg2 != 8526) {
            method890(-48);
        }
        while (arg3 > var5) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class75.field1557;
            }
            var4 += arg0[arg1 + var5].field1906;
            var5++;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class84 var10 = arg0[arg1 + var8];
            class68.method518(var10.field1869, 0, var6, var7, var10.field1906);
            var7 += var10.field1906;
        }
        class84 var9 = new class84();
        var9.field1869 = var6;
        var9.field1906 = var4;
        return var9;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z", line = 120)
    public static final boolean method893(int arg0, int arg1, int arg2) {
        field2521++;
        if (arg1 < 40) {
            field2539 = null;
        }
        if (arg0 == 0 && class48.field1003 == arg2) {
            return true;
        } else if (arg0 == 1 && class115.field2509 == arg2) {
            return true;
        } else {
            return (arg0 == 2 || arg0 == 3) && class69.field1477 == arg2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILsd;[BI[Lfb;)V", line = 176)
    public static final void method894(int arg0, int arg1, class108 arg2, byte[] arg3, int arg4, class33[] arg5) {
        field2536++;
        class27 var6 = new class27(arg3);
        int var7 = -1;
        while (true) {
            int var8 = var6.method221(true);
            if (var8 == 0) {
                if (arg4 >= -95) {
                    field2520 = null;
                    return;
                }
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method221(true);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var6.method231(255);
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = var9 >> 6 & 0x3F;
                int var17 = arg1 + var16;
                int var18 = arg0 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var12;
                    if ((class73.field1544[1][var17][var18] & 0x2) == 2) {
                        var19 = var12 - 1;
                    }
                    class33 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg5[var19];
                    }
                    class101.method765(var12, var7, var17, (byte) -61, var20, var15, var14, arg2, var18);
                }
            }
        }
    }
}
