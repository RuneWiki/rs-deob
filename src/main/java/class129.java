import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class129 extends class110 {

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    public int field3113 = 0;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "Lmb;")
    public static class84 field3101 = class79.method672(true, "b12_full");

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "[[I")
    public static int[][] field3111 = new int[104][104];

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field3102 = 0;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "Lmb;")
    public static class84 field3114 = class79.method672(true, "blinken3:");

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    public static volatile int field3119 = 0;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "Lmb;")
    private static class84 field3110 = class79.method672(true, " has logged in)3");

    @OriginalMember(owner = "client!te", name = "U", descriptor = "Lmb;")
    public static class84 field3103 = class79.method672(true, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "Lmb;")
    public static class84 field3118 = field3110;

    @OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "Lr;")
    public static class112 field3121;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "Lsd;")
    public static class122 field3104;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Lsd;")
    public static class122 field3108;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "[I")
    public static int[] field3106;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public static void method1049(int arg0) {
        field3106 = null;
        field3104 = null;
        field3110 = null;
        field3111 = null;
        field3103 = null;
        field3121 = null;
        field3118 = null;
        field3114 = null;
        field3108 = null;
        if (arg0 > -62) {
            method1051(-7, 102, null, 42, -90, -27, null);
        }
        field3101 = null;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)V")
    public static final void method1050(boolean arg0) {
        if (class107.field2598 != null) {
            class95 var1 = class107.field2598;
            synchronized (class107.field2598) {
                class107.field2598 = null;
            }
        }
        if (!arg0) {
            field3109 = -71;
        }
        field3107++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILmb;IIILmb;)V")
    public static final void method1051(int arg0, int arg1, class84 arg2, int arg3, int arg4, int arg5, class84 arg6) {
        if (arg3 != 16711680) {
            field3109 = 7;
        }
        field3116++;
        if (class20.field429 >= 500) {
            return;
        }
        if (arg2.method718(-93) <= 0) {
            class46.field994[class20.field429] = arg6;
        } else {
            class46.field994[class20.field429] = class51.method408(new class84[] { arg6, class91.field2280, arg2 }, 101);
        }
        class2.field38[class20.field429] = arg1;
        class123.field2972[class20.field429] = arg5;
        client.field462[class20.field429] = arg0;
        class46.field998[class20.field429] = arg4;
        class20.field429++;
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public static final void method1052(int arg0) {
        field3117++;
        class2.method11(36);
        if (class84.field2100 == 1) {
            class117.field2788[class36.field781 / 100].method928(class6.field113 - 8 - 4, class106.field2567 - 4 + -8);
        }
        if (class84.field2100 == 2) {
            class117.field2788[class36.field781 / 100 + 4].method928(class6.field113 - 4 - 8, class106.field2567 + -8 - 4);
        }
        if (client.field493 != -1) {
            class36.method276(client.field493, true);
            class66.method598(0, 334, 512, 4, client.field493, false, 0);
        }
        if (class79.field1958 != -1) {
            class36.method276(class79.field1958, true);
            class66.method598(0, 334, 512, 0, class79.field1958, false, 0);
        }
        class16.method111((byte) 74);
        if (!class2.field42) {
            class49.method351(57);
            class47.method347(10172);
        } else if (class117.field2784 == 0) {
            class20.method131((byte) -103);
        }
        if (arg0 < 105) {
            return;
        }
        if (class143.field3430 == 1) {
            class98.field2415.method928(472, 296);
        }
        if (class63.field1569) {
            byte var1 = 20;
            short var2 = 507;
            class95.field2364.method203(class51.method408(new class84[] { class111.field2677, class93.method787(22245, class83.field2048) }, -79), var2, var1, 16776960);
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            int var9 = var1 + 15;
            int var5 = 16776960;
            if (var4 > 32768 && class124.field3012) {
                var5 = 16711680;
            }
            if (var4 > 65536 && !class124.field3012) {
                var5 = 16711680;
            }
            class95.field2364.method203(class51.method408(new class84[] { class109.field2643, class93.method787(22245, var4), class111.field2671 }, 101), var2, var9, var5);
            var9 += 15;
            if (class106.field2565) {
                class95.field2364.method203(class123.field2964, var2, var9, 16711680);
                class106.field2565 = false;
                var9 += 15;
            }
            if (class97.field2409) {
                class95.field2364.method203(class70.field1703, var2, var9, 16711680);
                class97.field2409 = false;
                var9 += 15;
            }
            if (class94.field2335) {
                class95.field2364.method203(class38.field846, var2, var9, 16711680);
                var9 += 15;
                class94.field2335 = false;
            }
        }
        if (class68.field1644 == 0) {
            return;
        }
        int var6 = class68.field1644 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 >= 10) {
            class95.field2364.method205(class51.method408(new class84[] { class146.field3589, class93.method787(22245, var7), class72.field1774, class93.method787(22245, var8) }, 116), 4, 329, 16776960);
        } else {
            class95.field2364.method205(class51.method408(new class84[] { class146.field3589, class93.method787(22245, var7), class109.field2623, class93.method787(22245, var8) }, -53), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lhb;B)V")
    public final void method1053(class51 arg0, byte arg1) {
        field3105++;
        while (true) {
            int var3 = arg0.method373(25094);
            if (var3 == 0) {
                if (arg1 >= -54) {
                    field3118 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1055(arg0, var3, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1054(int arg0, Component arg1) {
        field3122++;
        Method var2 = class147.field3619;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        int var3 = 28 % ((26 - arg0) / 37);
        arg1.addKeyListener(class107.field2598);
        arg1.addFocusListener(class107.field2598);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lhb;IB)V")
    private final void method1055(class51 arg0, int arg1, byte arg2) {
        field3112++;
        int var4 = 103 / ((27 - arg2) / 44);
        if (arg1 == 2) {
            this.field3113 = arg0.method383(-2056200760);
        }
    }
}
