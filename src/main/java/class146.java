import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class146 {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    private int field2623 = -1;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    private int field2632 = 0;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field2621 = 0;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "J")
    public static long field2626 = 0L;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Leb;")
    public static class230 field2636 = class68.method589(0, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Leb;")
    public static class230 field2637 = class68.method589(0, "p11_full");

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[Leb;")
    public static class230[] field2627 = new class230[100];

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field2638 = 0;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lv;")
    public static class147 field2634 = new class147(260);

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field2639 = -2;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public int field2620;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public int field2625;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2629;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static final void method1111(byte arg0) {
        class116.field2088.method1124(0);
        field2618++;
        if (arg0 >= -99) {
            field2637 = null;
        }
        class46.field806.method1124(0);
        class213.field3686.method1124(0);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lfk;BI)V")
    public final void method1112(class14 arg0, byte arg1, int arg2) {
        if (arg1 < 49) {
            return;
        }
        field2624++;
        while (true) {
            int var4 = arg0.method200(255);
            if (var4 == 0) {
                return;
            }
            this.method1117(arg2, var4, 91, arg0);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static void method1113(int arg0) {
        field2634 = null;
        field2627 = null;
        if (arg0 == 21903) {
            field2636 = null;
            field2637 = null;
            field2629 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
    private final void method1114(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF3B50) >> 16) / 256.0D;
        field2635++;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = 0.0D;
        double var11 = 0.0D;
        double var13 = var5;
        double var15 = var5;
        if (var5 < var3) {
            var13 = var3;
        }
        if (var13 < var7) {
            var13 = var7;
        }
        if (var3 < var5) {
            var15 = var3;
        }
        if (var15 > var7) {
            var15 = var7;
        }
        double var17 = (var13 + var15) / 2.0D;
        int var19 = -51 / ((8 - arg1) / 49);
        if (var13 != var15) {
            if (var5 == var13) {
                var9 = (var3 - var7) / (var13 - var15);
            } else if (var3 == var13) {
                var9 = (var7 - var5) / (var13 - var15) + 2.0D;
            } else if (var7 == var13) {
                var9 = (var5 - var3) / (var13 - var15) + 4.0D;
            }
            if (var17 < 0.5D) {
                var11 = (var13 - var15) / (var13 + var15);
            }
            if (var17 >= 0.5D) {
                var11 = (var13 - var15) / (2.0D - var13 - var15);
            }
        }
        this.field2625 = (int) (var11 * 256.0D);
        if (this.field2625 < 0) {
            this.field2625 = 0;
        } else if (this.field2625 > 255) {
            this.field2625 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field2630 = (int) ((1.0D - var17) * var11 * 512.0D);
        } else {
            this.field2630 = (int) (var11 * var17 * 512.0D);
        }
        if (this.field2630 < 1) {
            this.field2630 = 1;
        }
        double var20 = var9 / 6.0D;
        this.field2633 = (int) (var17 * 256.0D);
        if (this.field2633 < 0) {
            this.field2633 = 0;
        } else if (this.field2633 > 255) {
            this.field2633 = 255;
        }
        this.field2620 = (int) ((double) this.field2630 * var20);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BZ)V")
    public static final void method1115(byte arg0, boolean arg1) {
        if (arg0 <= 31) {
            field2629 = null;
        }
        field2631++;
        if (arg1 != class114.field2038) {
            class114.field2038 = arg1;
            class9.method88(-113);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIZIIII)V")
    public static final void method1116(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field2617++;
        if (arg4 == 3) {
            method1116(true, arg1, true, -50, class190.field3354, -1, -1);
            return;
        }
        Container var7;
        if (class108.field1952 != null) {
            var7 = class108.field1952;
        } else if (class267.field4736 == null) {
            var7 = class184.field3228.field2320;
        } else {
            var7 = class267.field4736;
        }
        class141.field2536 = var7.getSize().width;
        class169.field2983 = var7.getSize().height;
        if (class267.field4736 == var7) {
            Insets var8 = class267.field4736.getInsets();
            class141.field2536 -= var8.right + var8.left;
            class169.field2983 -= var8.top + var8.bottom;
        }
        if (arg4 < 2) {
            class180.field3155 = 765;
            class259.field4588 = 0;
            class267.field4745 = (class141.field2536 - 765) / 2;
            class135.field2434 = 503;
        } else {
            class259.field4588 = 0;
            class267.field4745 = 0;
            class180.field3155 = class141.field2536;
            class135.field2434 = class169.field2983;
        }
        if (arg0) {
            class97.method819(-30020, class14.field307);
            class154.method1176(-6392, class14.field307);
            if (class204.field3604 != null) {
                class204.field3604.method115(-8050, class14.field307);
            }
            class29.field536.method47(20008);
            class116.method924(class14.field307, 113);
            class236.method1660(class14.field307, -26);
            if (class204.field3604 != null) {
                class204.field3604.method114(class14.field307, 13);
            }
        } else {
            class14.field307.setSize(class180.field3155, class135.field2434);
            if (class267.field4736 == var7) {
                Insets var9 = class267.field4736.getInsets();
                class14.field307.setLocation(class267.field4745 + var9.left, class259.field4588 + var9.top);
            } else {
                class14.field307.setLocation(class267.field4745, class259.field4588);
            }
        }
        if (arg4 > 0) {
            method1116(true, arg1, true, -123, 0, -1, -1);
            return;
        }
        if (class263.field4679 != -1) {
            class175.method1279(true, (byte) 101);
        }
        if (class30.field556 != null && (class57.field1057 == 30 || class57.field1057 == 25)) {
            class271.method1853(true);
        }
        if (arg3 > -42) {
            method1119((byte) -61);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class71.field1300[var10] = true;
        }
        class245.field4330 = true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILfk;)V")
    private final void method1117(int arg0, int arg1, int arg2, class14 arg3) {
        if (arg2 <= 69) {
            this.field2632 = 119;
        }
        if (arg1 == 1) {
            this.field2632 = arg3.method190(-25267);
            this.method1114(this.field2632, 68);
        } else if (arg1 == 2) {
            this.field2623 = arg3.method161(4);
            if (this.field2623 == 65535) {
                this.field2623 = -1;
            }
        } else if (arg1 == 3) {
            arg3.method161(4);
        }
        field2622++;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
    public static final void method1118(int arg0, int arg1) {
        if (arg0 < -94) {
            field2619++;
            class243.field4169.method1121(0, arg1);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static final void method1119(byte arg0) {
        if (arg0 != -48) {
            method1113(116);
        }
        class34.field641 &= 0x7FF;
        if (class71.field1298 < 128) {
            class71.field1298 = 128;
        }
        if (class71.field1298 > 383) {
            class71.field1298 = 383;
        }
        int var1 = class80.field1457 >> 7;
        field2628++;
        int var2 = class88.field1530 >> 7;
        int var3 = class37.method333(class88.field1530, 1637367879, class124.field2174, class80.field1457);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class124.field2174;
                    if (var7 < 3 && (class79.field1435[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var3 - class106.field1912[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (field2638 < var9) {
            field2638 += (var9 - field2638) / 24;
        } else if (field2638 > var9) {
            field2638 += (var9 - field2638) / 80;
        }
    }
}
