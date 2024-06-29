import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class190 {

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "[[I")
    public static int[][] field2587 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2584 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field2586;

    static {
        new class206((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1087(boolean arg0) {
        field2587 = null;
        if (!arg0) {
            method1088((class296) null, (byte) -32, 99);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqg;BI)V", line = 21)
    public static final void method1088(class296 arg0, byte arg1, int arg2) {
        field2583++;
        if (arg1 != 73) {
            field2584 = -55;
        }
        class106.field1595 = false;
        class151.field2133 = 0;
        class402.method2438(arg0, -1);
        class228.method1277(88, arg0);
        if (class106.field1595) {
            System.out.println("---endgpp---");
        }
        if (arg0.field456 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field456 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lwm;I)V", line = 47)
    public static final void method1089(class364 arg0, int arg1) {
        field2581++;
        int var2 = class2.field40;
        int var3 = class94.field1390;
        int var4 = class97.field1419;
        int var5 = class103.field1491;
        int var6 = -10660793;
        arg0.method2222(var5, var2, var3, var6, 116, var4);
        arg0.method2222(16, var2 + 1, var3 + 1, -16777216, 116, var4 - 2);
        arg0.method2219(-16385, var3 + 18, var2 - -1, var5 - 19, -16777216, var4 + -2);
        class93.field1366.method2124(var2 + 3, -1, var3 + 14, var6, (byte) -6, class13.field180.method1176(class110.field1676, (byte) -122));
        int var7 = class34.field523.method1916((byte) -21);
        int var8 = class34.field523.method1925(50);
        int var9 = 0;
        if (arg1 <= 40) {
            field2582 = 122;
        }
        for (class395 var10 = (class395) class450.field6121.method652((byte) 37); var10 != null; var10 = (class395) class450.field6121.method653(13)) {
            int var11 = (class475.field6540 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && var2 + var4 > var7 && var8 > (var11 - 13) && var8 < var11 + 3 && var10.field5470) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class346.method2135(var10.field5469, -14)) {
                var13 = class175.field2385.method1557((int) var10.field5480, 21992).field5960;
            } else if (var10.field5478 != -1) {
                var13 = class175.field2385.method1557(var10.field5478, 21992).field5960;
            } else if (class215.method1218(var10.field5469, -6)) {
                class121 var14 = class221.field2941[(int) var10.field5480];
                if (var14 != null) {
                    class429 var15 = var14.field1780;
                    if (var15.field5824 != null) {
                        var15 = var15.method2531(class38.field562, 112);
                    }
                    if (var15 != null) {
                        var13 = var15.field5843;
                    }
                }
            } else if (class294.method1649((byte) 119, var10.field5469)) {
                Object var16 = null;
                class88 var17;
                if (var10.field5469 == 1010) {
                    var17 = class1.field23.method935((int) var10.field5480, (byte) 100);
                } else {
                    var17 = class1.field23.method935((int) (var10.field5480 >>> 32 & 0x7FFFFFFFL), (byte) 112);
                }
                if (var17.field1269 != null) {
                    var17 = var17.method574(79, class38.field562);
                }
                if (var17 != null) {
                    var13 = var17.field1275;
                }
            }
            String var18 = class293.method1640((byte) 90, var10);
            if (var13 != null) {
                var18 = var18 + class279.method1573((byte) -50, var13);
            }
            class93.field1366.method2128(class143.field2061, class467.field6465, var2 + 3, var18, var11, 75, 0, var12);
            if (var10.field5468) {
                class274.field3629.method836((var2 + class392.field5448.method2145(var18, 13938)) + 5, var11 + -12);
            }
            var9++;
        }
        class266.method1501(class94.field1390, -115, class2.field40, class103.field1491, class97.field1419);
    }
}
