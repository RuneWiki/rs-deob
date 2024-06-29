import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class182 extends class184 {

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "[I")
    public static int[] field3346 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field3334 = -1;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "Lsf;")
    public static class108 field3353 = class140.method973(255, "details");

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "[[[Laj;")
    public static class1[][][] field3333 = new class1[4][104][104];

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field3351 = 0;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public static int field3342 = -1;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "Lsf;")
    private static class108 field3343 = class140.method973(255, "Created gameworld");

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "Lsf;")
    public static class108 field3345 = field3343;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public int field3332;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public int field3338;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "[I")
    public int[] field3341;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "[I")
    public int[] field3350;

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "[I")
    public int[] field3356;

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "[Lpg;")
    public class205[] field3352;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "[Lpg;")
    public class205[] field3354;

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "[Lal;")
    public static class326[] field3349;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "[[I")
    public static int[][] field3355;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "[[[B")
    public byte[][][] field3340;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "[[[B")
    public static byte[][][] field3357;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lec;I)V", line = 18)
    public static final void method1315(class40 arg0, int arg1) {
        if (arg0.field550 != null) {
            arg0.field550.field454 = 0;
        }
        arg0.field552 = false;
        if (arg1 == 0) {
            for (class40 var2 = arg0.method270(); var2 != null; var2 = arg0.method276()) {
                method1315(var2, arg1);
            }
            field3344++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V", line = 41)
    public static final void method1316(boolean arg0, int arg1) {
        if (class95.field1513.field4452 >> 7 == client.field4538 && (class95.field1513.field4457 >> 7) == class269.field4723) {
            client.field4538 = 0;
        }
        int var2 = class43.field569;
        field3337++;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = arg1; var3 < var2; var3++) {
            long var4;
            class51 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class95.field1513;
            } else {
                var4 = (long) class194.field3511[var3] << 32;
                var6 = class96.field1558[class194.field3511[var3]];
            }
            if (var6 != null && var6.method319(true)) {
                var6.field722 = false;
                int var7 = var6.field4457 >> 7;
                int var8 = var6.field4452 >> 7;
                if ((class287.field5018 && class43.field569 > 200 || class43.field569 > 50) && !arg0 && var6.field4472 == var6.field4455) {
                    var6.field722 = true;
                }
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var6.field746 == null || class116.field2000 < var6.field729 || var6.field742 <= class116.field2000) {
                        if (var6.method363((byte) -92) == 1 && (var6.field4452 & 0x7F) == 64 && (var6.field4457 & 0x7F) == 64) {
                            if (class160.field2882[var8][var7] == class278.field4886) {
                                continue;
                            }
                            class160.field2882[var8][var7] = class278.field4886;
                        }
                        var6.field4464 = class45.method321(-96, var6.field4457, var6.field4452, class295.field5159);
                        class146.method1018(class295.field5159, var6.field4452, var6.field4457, var6.field4464, var6.method363((byte) 71) * 64 + 60 - 64, var6, var6.field4518, var4, var6.field4479);
                    } else {
                        var6.field722 = false;
                        var6.field4464 = class45.method321(arg1 - 24, var6.field4457, var6.field4452, class295.field5159);
                        class281.method2027(class295.field5159, var6.field4452, var6.field4457, var6.field4464, var6, var6.field4518, var4, var6.field751, var6.field738, var6.field750, var6.field758);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lik;I)V", line = 123)
    public static final void method1317(class262 arg0, int arg1) {
        field3348++;
        class147.field2637 = arg0.method1887(-1, class36.field511);
        class72.field1091 = arg0.method1887(arg1 ^ 0xFFFFFF97, class156.field2801);
        class175.field3190 = arg0.method1887(-1, class210.field3761);
        class239.field4166 = arg0.method1887(arg1 - 105, class166.field2994);
        class266.field4683 = arg0.method1887(arg1 - 105, class116.field1999);
        class213.field3790 = arg0.method1887(-1, class143.field2528);
        class109.field1916 = arg0.method1887(-1, class170.field3053);
        class96.field1539 = arg0.method1887(-1, class284.field4976);
        class5.field65 = arg0.method1887(arg1 - 105, class132.field2269);
        class247.field4270 = arg0.method1887(-1, class206.field3697);
        class184.field3384 = arg0.method1887(-1, class166.field2986);
        class140.field2471 = arg0.method1887(-1, class210.field3750);
        class211.field3771 = arg0.method1887(-1, class157.field2839);
        class68.field1057 = arg0.method1887(-1, class298.field5185);
        class291.field5085 = arg0.method1887(-1, class256.field4504);
        class144.field2544 = arg0.method1887(arg1 ^ 0xFFFFFF97, class246.field4260);
        class240.field4174 = arg0.method1887(arg1 - 105, class261.field4595);
        if (arg1 != 104) {
            field3333 = (class1[][][]) ((class1[][][]) null);
        }
        class242.field4197 = arg0.method1887(-1, class1.field13);
        class69.field1063 = arg0.method1887(-1, class234.field4139);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V", line = 179)
    public static final void method1318(byte arg0) {
        if (arg0 != -41) {
            return;
        }
        field3347++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class169.method1174(-55, var1, var2, class99.field1759, true, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 216)
    public static void method1319(int arg0) {
        field3343 = null;
        field3346 = null;
        field3353 = null;
        field3357 = (byte[][][]) null;
        field3349 = null;
        field3333 = (class1[][][]) null;
        if (arg0 == 0) {
            field3355 = (int[][]) null;
            field3345 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIZI)V", line = 257)
    public static final void method1320(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class120 var5 = class248.method1704(8, 40, arg1);
        field3339++;
        var5.method844((byte) -28);
        var5.field2067 = arg4;
        var5.field2055 = arg0;
        if (arg3) {
            field3346 = (int[]) null;
        }
        var5.field2066 = arg2;
    }
}
