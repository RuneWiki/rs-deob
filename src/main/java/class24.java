import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class24 extends class69 {

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public int field456 = 0;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public int field472 = -1;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    public static int field462 = 0;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "Lmc;")
    public static class75 field458 = class30.method234(true, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field467 = 0;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field478 = -1;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "[I")
    public static int[] field479 = new int[128];

    @OriginalMember(owner = "client!de", name = "I", descriptor = "Lmc;")
    public static class75 field469 = class30.method234(true, "@cr2@");

    @OriginalMember(owner = "client!de", name = "V", descriptor = "Lmc;")
    private static class75 field480 = class30.method234(true, "Walk here");

    @OriginalMember(owner = "client!de", name = "X", descriptor = "[[B")
    public static byte[][] field482 = new byte[1000][];

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "Lmc;")
    public static class75 field483 = field480;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "Lja;")
    public static class55 field471;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "Lja;")
    public static class55 field474;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)I", line = 5)
    public static final int method165(byte arg0) {
        field477++;
        return arg0 > -48 ? -6 : 19;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 60)
    public static void method166(int arg0) {
        field480 = null;
        field474 = null;
        field458 = null;
        field479 = null;
        if (arg0 < 39) {
            method168(59, 69, -23, -66, 29, 17);
        }
        field471 = null;
        field482 = null;
        field483 = null;
        field469 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIIII)V", line = 99)
    public static final void method167(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field459++;
        for (class100 var5 = (class100) class90.field2210.method248(32); var5 != null; var5 = (class100) class90.field2210.method252(71)) {
            if (var5.field2574 != -1 || var5.field2578 != null) {
                int var6 = 0;
                if (arg1 > var5.field2579) {
                    var6 += arg1 - var5.field2579;
                } else if (arg1 < var5.field2566) {
                    var6 += var5.field2566 - arg1;
                }
                if (var5.field2569 < arg2) {
                    var6 += arg2 - var5.field2569;
                } else if (arg2 < var5.field2571) {
                    var6 += var5.field2571 - arg2;
                }
                if (var6 - 64 > var5.field2598 || class75.field1893 == 0 || var5.field2572 != arg4) {
                    if (var5.field2577 != null) {
                        class110.field2792.method868(var5.field2577);
                        var5.field2577 = null;
                    }
                    if (var5.field2582 != null) {
                        class110.field2792.method868(var5.field2582);
                        var5.field2582 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field2598 - var6) * class75.field1893 / var5.field2598;
                    if (var5.field2577 != null) {
                        var5.field2577.method975(var7);
                    } else if (var5.field2574 >= 0) {
                        class4 var8 = class4.method21(class10.field223, var5.field2574, 0);
                        if (var8 != null) {
                            class77 var9 = var8.method20().method664(class34.field792);
                            class123 var10 = class123.method968(var9, 100, var7);
                            var10.method976(-1);
                            class110.field2792.method865(var10);
                            var5.field2577 = var10;
                        }
                    }
                    if (var5.field2582 != null) {
                        var5.field2582.method975(var7);
                        if (!var5.field2582.method967()) {
                            var5.field2582 = null;
                        }
                    } else if (var5.field2578 != null && (var5.field2575 -= arg3) <= 0) {
                        int var11 = (int) ((double) var5.field2578.length * Math.random());
                        class4 var12 = class4.method21(class10.field223, var5.field2578[var11], 0);
                        if (var12 != null) {
                            class77 var13 = var12.method20().method664(class34.field792);
                            class123 var14 = class123.method968(var13, 100, var7);
                            var14.method976(0);
                            class110.field2792.method865(var14);
                            var5.field2582 = var14;
                            var5.field2575 = (int) (Math.random() * (double) (var5.field2565 - var5.field2570)) + var5.field2570;
                        }
                    }
                }
            }
        }
        if (!arg0) {
            method166(-71);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V", line = 236)
    public static final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field463++;
        class26.field524[0].method687(arg3, arg5);
        class26.field524[1].method687(arg3, arg5 + arg4 - 16);
        class66.method569(arg3, arg5 + 16, 16, arg4 - 32, class79.field2007);
        int var6 = (arg4 - 32) * arg4 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg0 / (arg1 - arg4);
        class66.method569(arg3, var7 + arg5 + 16, 16, var6, class97.field2444);
        class66.method576(arg3, arg5 + var7 + 16, var6, class68.field1730);
        class66.method576(arg3 + 1, var7 + 16 + arg5, var6, class68.field1730);
        class66.method580(arg3, var7 + arg5 + 16, 16, class68.field1730);
        class66.method580(arg3, arg5 + var7 + 17, 16, class68.field1730);
        class66.method576(arg3 + 15, arg5 + 16 + var7, var6, class117.field2901);
        if (arg2 <= 38) {
            method168(-54, 127, -86, -98, 67, 2);
        }
        class66.method576(arg3 + 14, 17 - -var7 + arg5, var6 - 1, class117.field2901);
        class66.method580(arg3, arg5 + var7 + var6 + 15, 16, class117.field2901);
        class66.method580(arg3 + 1, arg5 + var6 - (-14 - var7), 15, class117.field2901);
    }
}
