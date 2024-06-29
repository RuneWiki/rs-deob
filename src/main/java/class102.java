import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class102 {

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public int field2565 = 0;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public int field2566 = 0;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field2569 = 0;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lpd;")
    public static class94 field2567 = class28.method249(-87, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lpd;")
    public static class94 field2568 = class28.method249(126, " )2>");

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lpd;")
    private static class94 field2571 = class28.method249(-80, "Walk here");

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lpd;")
    public static class94 field2575 = field2571;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field2584 = -1;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field2581 = 0;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lte;")
    public static class119 field2564 = new class119();

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public static int field2586 = 0;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "Lpd;")
    public static class94 field2589 = class28.method249(74, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "Lpd;")
    public static class94 field2585 = class28.method249(94, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "[I")
    public static int[] field2590 = new int[4000];

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public static int field2591 = -1;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "Z")
    public static boolean field2592 = true;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "Lpd;")
    private static class94 field2593 = class28.method249(57, "wishes to duel with you)3");

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "Lpd;")
    public static class94 field2587 = field2593;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public int field2563;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Ltc;")
    public static class116 field2579;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lbe;")
    public class12 field2576;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Ljava/awt/Image;")
    public static Image field2572;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 19)
    public static final void method762(byte arg0) {
        field2582++;
        class14 var1 = (class14) class1.field40.method895(-14156);
        if (arg0 > -83) {
            field2591 = 78;
        }
        while (var1 != null) {
            if (class64.field1589 != var1.field354 || class26.field699 > var1.field359) {
                var1.method1074((byte) -28);
            } else if (var1.field368 <= class26.field699) {
                if (var1.field338 > 0) {
                    class80 var2 = class28.field803[var1.field338 - 1];
                    if (var2 != null && var2.field177 >= 0 && var2.field177 < 13312 && var2.field222 >= 0 && var2.field222 < 13312) {
                        var1.method85(class25.method226(var1.field354, var2.field222, var2.field177, (byte) -72) - var1.field349, 12575, class26.field699, var2.field222, var2.field177);
                    }
                }
                if (var1.field338 < 0) {
                    int var3 = -var1.field338 - 1;
                    class89 var4;
                    if (class30.field860 == var3) {
                        var4 = class80.field2044;
                    } else {
                        var4 = class85.field2138[var3];
                    }
                    if (var4 != null && var4.field177 >= 0 && var4.field177 < 13312 && var4.field222 >= 0 && var4.field222 < 13312) {
                        var1.method85(class25.method226(var1.field354, var4.field222, var4.field177, (byte) -103) - var1.field349, 12575, class26.field699, var4.field222, var4.field177);
                    }
                }
                var1.method82(1024, class66.field1620);
                class64.field1585.method177(class64.field1589, (int) var1.field365, (int) var1.field373, (int) var1.field350, 60, var1, var1.field372, -1, false);
            }
            var1 = (class14) class1.field40.method893(true);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lgd;", line = 78)
    public static final class40 method763(Throwable arg0, String arg1) {
        field2570++;
        class40 var2;
        if (arg0 instanceof class40) {
            var2 = (class40) arg0;
            var2.field1030 = var2.field1030 + ' ' + arg1;
        } else {
            var2 = new class40(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 141)
    public static void method764(int arg0) {
        field2587 = null;
        field2572 = null;
        field2585 = null;
        field2571 = null;
        field2590 = null;
        if (arg0 != 1024) {
            method766(79);
        }
        field2579 = null;
        field2564 = null;
        field2589 = null;
        field2567 = null;
        field2575 = null;
        field2593 = null;
        field2568 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIII)I", line = 170)
    public static final int method765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 0x3;
        if (arg3 != -14058) {
            return 124;
        }
        field2588++;
        if ((arg0 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg1;
            arg1 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 1 + 7 - arg2 - arg6;
        } else {
            return 1 + 7 - arg1 - arg4;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 229)
    public static final void method766(int arg0) {
        field2583++;
        short var1 = 256;
        if (arg0 > -36) {
            method762((byte) -19);
        }
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class26.field703[var2 + (var1 - 2 << 7)] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 124.0D) + 2;
            int var15 = (int) (Math.random() * 128.0D) + 128;
            int var16 = (var15 << 7) + var14;
            class26.field703[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = (var4 << 7) + var12;
                class76.field1852[var13] = (class26.field703[var13 + 1] + class26.field703[var13 - 1] + class26.field703[var13 + 128] + class26.field703[var13 + -128]) / 4;
            }
        }
        class82.field2090 += 128;
        if (class41.field1045.length < class82.field2090) {
            class82.field2090 -= class41.field1045.length;
            int var5 = (int) (Math.random() * 12.0D);
            class1.method4(class2.field68[var5], 0);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = var9 + (var6 << 7);
                int var11 = class76.field1852[var10 + 128] - class41.field1045[class82.field2090 + var10 & class41.field1045.length + -1] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class26.field703[var10] = var11;
            }
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class112.field2826[var7] = class112.field2826[var7 + 1];
        }
        class112.field2826[var1 - 1] = (int) (Math.sin((double) class26.field699 / 14.0D) * 16.0D + Math.sin((double) class26.field699 / 15.0D) * 14.0D + Math.sin((double) class26.field699 / 16.0D) * 12.0D);
        if (class1.field20 > 0) {
            class1.field20 -= 4;
        }
        if (class37.field954 > 0) {
            class37.field954 -= 4;
        }
        if (class1.field20 != 0 || class37.field954 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 1) {
            class37.field954 = 1024;
        }
        if (var8 == 0) {
            class1.field20 = 1024;
            return;
        }
    }
}
