import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class136 {

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2242 = "Loaded sprites";

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2238 = 0;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2237 = "Close";

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Ldd;")
    public static class91 field2239 = new class91(5000);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Laj;")
    public static class151 field2246;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "[[B")
    public static byte[][] field2244;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field2246 = null;
        field2239 = null;
        field2242 = null;
        field2244 = null;
        if (arg0 != -782085064) {
            method1010(58);
        }
        field2237 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[B)V")
    public static final void method1008(int arg0, byte[] arg1) {
        field2236++;
        class249 var2 = new class249(arg1);
        var2.field4160 = arg1.length - 2;
        class206.field3317 = var2.method1821((byte) 51);
        class49.field842 = new int[class206.field3317];
        class140.field2307 = new boolean[class206.field3317];
        class43.field656 = new int[class206.field3317];
        class297.field4859 = new int[class206.field3317];
        class73.field1283 = new int[class206.field3317];
        class289.field4758 = new byte[class206.field3317][];
        class149.field2465 = new byte[class206.field3317][];
        var2.field4160 = arg1.length - (class206.field3317 * 8) - 7;
        if (arg0 >= -119) {
            return;
        }
        class134.field2214 = var2.method1821((byte) 51);
        class253.field4293 = var2.method1821((byte) 51);
        int var3 = (var2.method1802((byte) 92) & 0xFF) + 1;
        for (int var4 = 0; var4 < class206.field3317; var4++) {
            class49.field842[var4] = var2.method1821((byte) 51);
        }
        for (int var5 = 0; var5 < class206.field3317; var5++) {
            class73.field1283[var5] = var2.method1821((byte) 51);
        }
        for (int var6 = 0; var6 < class206.field3317; var6++) {
            class297.field4859[var6] = var2.method1821((byte) 51);
        }
        for (int var7 = 0; var7 < class206.field3317; var7++) {
            class43.field656[var7] = var2.method1821((byte) 51);
        }
        var2.field4160 = arg1.length - ((var3 - 1) * 3) - (class206.field3317 * 8) - 7;
        class185.field2952 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class185.field2952[var8] = var2.method1812((byte) 52);
            if (class185.field2952[var8] == 0) {
                class185.field2952[var8] = 1;
            }
        }
        var2.field4160 = 0;
        for (int var9 = 0; var9 < class206.field3317; var9++) {
            int var10 = class297.field4859[var9];
            int var11 = class43.field656[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class289.field4758[var9] = var13;
            boolean var15 = false;
            class149.field2465[var9] = var14;
            int var16 = var2.method1802((byte) -103);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method1768(95);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method1768(111);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var17 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var18 >= var10) {
                                break label92;
                            }
                            for (int var19 = 0; var19 < var11; var19++) {
                                byte var20 = var14[var18 + (var10 * var19)] = var2.method1768(127);
                                var15 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var13[var10 * var21 + var17] = var2.method1768(99);
                    }
                    var17++;
                }
            }
            class140.field2307[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)Z")
    public static final boolean method1009(int arg0, int arg1, int arg2) {
        int var3 = class313.field5031[arg0][arg1][arg2];
        if (-class265.field4430 == var3) {
            return false;
        } else if (class265.field4430 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class61.method422(var4 + 1, class245.field4123[arg0][arg1][arg2], var5 + 1) && class61.method422(var4 + 128 - 1, class245.field4123[arg0][arg1 + 1][arg2], var5 + 1) && class61.method422(var4 + 128 - 1, class245.field4123[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class61.method422(var4 + 1, class245.field4123[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class313.field5031[arg0][arg1][arg2] = class265.field4430;
                return true;
            } else {
                class313.field5031[arg0][arg1][arg2] = -class265.field4430;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Lbj;")
    public static final class92 method1010(int arg0) {
        field2240++;
        byte[] var1 = class289.field4758[0];
        int var2 = 98 % ((6 - arg0) / 35);
        int var3 = class43.field656[0] * class297.field4859[0];
        int[] var4 = new int[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = class185.field2952[class15.method84(255, var1[var5])];
        }
        class92 var6 = new class92(class134.field2214, class253.field4293, class49.field842[0], class73.field1283[0], class297.field4859[0], class43.field656[0], var4);
        class155.method1175(-104);
        return var6;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Z")
    public static final boolean method1011(boolean arg0) {
        if (arg0) {
            field2237 = null;
        }
        field2241++;
        return class243.field4075;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIILic;III)Lmd;")
    public static final class273 method1012(boolean arg0, int arg1, int arg2, class284 arg3, int arg4, int arg5, int arg6) {
        field2243++;
        int var8 = arg2 + (arg0 ? 65536 : 0) - (-(arg1 << 19) + -(arg4 << 17));
        long var9 = (long) arg6 * 3147483667L + (long) var8 * 3849834839L;
        class273 var11 = (class273) class228.field3853.method99(var9, true);
        if (var11 != null) {
            return var11;
        } else if (arg5 >= -27) {
            return null;
        } else {
            class128.field2142 = false;
            class273 var12 = class195.method1393(arg6, false, false, arg4, arg0, arg1, (byte) -121, arg2, arg3);
            if (var12 != null && !class128.field2142) {
                class228.field3853.method100(var9, var12, 114);
            }
            return var12;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIB)Leb;")
    public static final class36 method1013(int arg0, int arg1, byte arg2) {
        field2247++;
        class36 var3 = (class36) class278.field4624.method987(-104, (long) arg0 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class36(arg0, arg1);
            class278.field4624.method986(var3.field2213, true, var3);
        }
        if (arg2 != -90) {
            field2245 = -74;
        }
        return var3;
    }
}
