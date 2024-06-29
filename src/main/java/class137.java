import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class137 {

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lfg;")
    public static class18 field2190 = new class18(16);

    @OriginalMember(owner = "client!od", name = "v", descriptor = "[I")
    public static int[] field2197 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public int field2177;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public int field2179;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public int field2183;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public int field2184;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public int field2186;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "Ldp;")
    public static class174 field2200;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field2192;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIBZ)V")
    public static final void method1118(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field2178++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class409.field5963 + ((class28.field411 - class409.field5963) * var6 / 100);
        if (class39.field606 > var7) {
            var7 = class39.field606;
        } else if (class110.field1794 < var7) {
            var7 = class110.field1794;
        }
        int var8 = var7 * 512 * arg3 / (arg0 * 334);
        if (var8 < class102.field1585) {
            short var12 = class102.field1585;
            var7 = arg0 * 334 * var12 / (arg3 * 512);
            if (var7 > class110.field1794) {
                var7 = class110.field1794;
                int var13 = arg3 * 512 * var7 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg5) {
                    class73.field1235.method751();
                    class73.field1235.method736(arg3, (byte) -40, -16777216, var14, arg2, arg1);
                    class73.field1235.method736(arg3, (byte) -40, -16777216, var14, arg2 + arg0 - var14, arg1);
                }
                arg0 -= var14 * 2;
                arg2 += var14;
            }
        } else if (var8 > class260.field3919) {
            short var9 = class260.field3919;
            var7 = arg0 * var9 * 334 / (arg3 * 512);
            if (var7 < class39.field606) {
                var7 = class39.field606;
                int var10 = arg0 * var9 * 334 / (var7 * 512);
                int var11 = (arg3 - var10) / 2;
                if (arg5) {
                    class73.field1235.method751();
                    class73.field1235.method736(var11, (byte) -40, -16777216, arg0, arg2, arg1);
                    class73.field1235.method736(var11, (byte) -40, -16777216, arg0, arg2, arg1 + arg3 - var11);
                }
                arg1 += var11;
                arg3 -= var11 * 2;
            }
        }
        int var15 = -127 % ((-arg4 - 71) / 40);
        class394.field5755 = (short) arg0;
        class133.field2137 = arg3 * var7 / 334;
        class444.field6451 = (short) arg3;
        class390.field5617 = arg2;
        class150.field2297 = arg1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
    public static final void method1119(int arg0, byte arg1) {
        if (arg1 < 23) {
            field2197 = null;
        }
        field2181++;
        class284 var2 = class23.field350;
        synchronized (class23.field350) {
            class275.field4134 = arg0;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILdp;)I")
    public static final int method1120(int arg0, class174 arg1) {
        if (arg0 != -7907) {
            field2197 = null;
        }
        field2182++;
        int var2 = 0;
        if (arg1.method1348(255, class285.field4278)) {
            var2++;
        }
        if (arg1.method1348(255, class176.field2616)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method1121(byte arg0) {
        if (arg0 < 124) {
            method1119(-89, (byte) -92);
        }
        field2190 = null;
        field2192 = null;
        field2197 = null;
        field2200 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    public static final void method1122(int arg0, int arg1) {
        field2188++;
        if (arg0 == -1 || !class297.field4392[arg0]) {
            return;
        }
        class311.field4535.method1341(arg0, 0);
        if (class45.field710[arg0] == null) {
            return;
        }
        boolean var2 = true;
        int var3 = -72 % ((arg1 + 35) / 34);
        for (int var4 = 0; var4 < class45.field710[arg0].length; var4++) {
            if (class45.field710[arg0][var4] != null) {
                if (class45.field710[arg0][var4].field3793 == 2) {
                    var2 = false;
                } else {
                    class45.field710[arg0][var4] = null;
                }
            }
        }
        if (var2) {
            class45.field710[arg0] = null;
        }
        class297.field4392[arg0] = false;
    }
}
