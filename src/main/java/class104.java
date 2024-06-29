import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class104 {

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
    public static int[] field2459 = new int[99];

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Lae;")
    public static class6 field2463;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Lae;")
    private static class6 field2461;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lae;")
    private static class6 field2464;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lae;")
    public static class6 field2460;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lae;")
    public static class6 field2466;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "Lae;")
    public static class6 field2465;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lbd;")
    public static class12 field2462;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lae;")
    public static class6 field2468;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lae;")
    private static class6 field2467;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Lae;")
    public static class6 field2473;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lae;")
    public static class6 field2470;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Lae;")
    public static class6 field2474;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[I")
    public static int[] field2471;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "[I")
    public static int[] field2476;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "[I")
    public static int[] field2477;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2459[var1] = var0 / 4;
        }
        field2463 = class64.method474(110, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");
        field2461 = class64.method474(115, "wave:");
        field2464 = class64.method474(122, " ");
        field2460 = field2464;
        field2466 = class64.method474(109, "@cr2@");
        field2465 = field2461;
        field2462 = new class12(64);
        field2468 = class64.method474(106, "Das ist eine Mitglieder)2Welt(Q");
        field2467 = class64.method474(109, "Your profile will be transferred in:");
        field2469 = -1;
        field2473 = class64.method474(108, "m-Ochte sich mit Ihnen duellieren)3");
        field2470 = class64.method474(108, "Classic");
        field2474 = field2467;
        field2471 = new int[] { 0, -1, 0, 1 };
        field2475 = 0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 8)
    public static final void method878(int arg0, Component arg1) {
        field2458++;
        arg1.removeMouseListener(class136.field3309);
        if (arg0 != -15828) {
            field2467 = null;
        }
        arg1.removeMouseMotionListener(class136.field3309);
        arg1.removeFocusListener(class136.field3309);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V", line = 27)
    public static void method879(byte arg0) {
        field2465 = null;
        field2470 = null;
        field2476 = null;
        field2460 = null;
        field2462 = null;
        field2473 = null;
        int var1 = -63 / ((arg0 + 31) / 56);
        field2471 = null;
        field2459 = null;
        field2468 = null;
        field2467 = null;
        field2477 = null;
        field2474 = null;
        field2466 = null;
        field2461 = null;
        field2463 = null;
        field2464 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 58)
    public static final void method880(int arg0) {
        int var1 = 11 / ((3 - arg0) / 46);
        field2457++;
        class85.field2051.method932(-18967);
        int var2 = class85.field2051.method939(8, -13873);
        if (var2 < class138.field3365) {
            for (int var3 = var2; var3 < class138.field3365; var3++) {
                class43.field994[class69.field1523++] = class42.field967[var3];
            }
        }
        if (class138.field3365 < var2) {
            throw new RuntimeException("gnpov1");
        }
        class138.field3365 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = class42.field967[var4];
            class2 var6 = class49.field1097[var5];
            int var7 = class85.field2051.method939(1, -13873);
            if (var7 == 0) {
                class42.field967[class138.field3365++] = var5;
                var6.field1770 = class5.field61;
            } else {
                int var8 = class85.field2051.method939(2, -13873);
                if (var8 == 0) {
                    class42.field967[class138.field3365++] = var5;
                    var6.field1770 = class5.field61;
                    class87.field2081[class92.field2205++] = var5;
                } else if (var8 == 1) {
                    class42.field967[class138.field3365++] = var5;
                    var6.field1770 = class5.field61;
                    int var9 = class85.field2051.method939(3, -13873);
                    var6.method616(-1, var9, false);
                    int var10 = class85.field2051.method939(1, -13873);
                    if (var10 == 1) {
                        class87.field2081[class92.field2205++] = var5;
                    }
                } else if (var8 == 2) {
                    class42.field967[class138.field3365++] = var5;
                    var6.field1770 = class5.field61;
                    int var11 = class85.field2051.method939(3, -13873);
                    var6.method616(-1, var11, true);
                    int var12 = class85.field2051.method939(3, -13873);
                    var6.method616(-1, var12, true);
                    int var13 = class85.field2051.method939(1, -13873);
                    if (var13 == 1) {
                        class87.field2081[class92.field2205++] = var5;
                    }
                } else if (var8 == 3) {
                    class43.field994[class69.field1523++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZ)V", line = 213)
    public static final void method881(boolean arg0, boolean arg1) {
        class70.field1570++;
        field2453++;
        if (arg1) {
            method882(-121, 57, 95);
        }
        if (class70.field1570 < 50 && !arg0) {
            return;
        }
        class70.field1570 = 0;
        if (class121.field2997 || class67.field1491 == null) {
            return;
        }
        class60.field1306++;
        class111.field2660.method938((byte) 63, 86);
        try {
            class67.field1491.method211(-1, class111.field2660.field1858, class111.field2660.field1821, 0);
            class111.field2660.field1821 = 0;
        } catch (IOException var2) {
            class121.field2997 = true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Z", line = 267)
    public static final boolean method882(int arg0, int arg1, int arg2) {
        field2456++;
        if (arg1 == 0 && class51.field1144 == arg0) {
            return true;
        } else if (arg1 == arg2 && class96.field2294 == arg0) {
            return true;
        } else {
            return (arg1 == 2 || arg1 == 3) && class118.field2807 == arg0;
        }
    }
}
