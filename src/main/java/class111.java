import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class111 {

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lbd;")
    private class12 field2672 = new class12(256);

    @OriginalMember(owner = "client!q", name = "C", descriptor = "Lkb;")
    private class71 field2695;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "Lkb;")
    private class71 field2690;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2668 = 0;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
    public static int[] field2670 = new int[4000];

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Laf;")
    public static class7 field2678 = class48.method406(40, "sl_flags");

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Laf;")
    public static class7 field2679 = class48.method406(40, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2681 = 0;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Laf;")
    public static class7 field2675 = class48.method406(40, "blaugr-Un:");

    @OriginalMember(owner = "client!q", name = "p", descriptor = "Z")
    public static boolean field2682 = true;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "[Lrd;")
    public static class122[] field2688 = new class122[2048];

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Z")
    public static boolean field2683 = false;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
    public static boolean field2680 = false;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Laf;")
    public static class7 field2693 = class48.method406(40, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!q", name = "B", descriptor = "Laf;")
    public static class7 field2694 = class48.method406(40, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!q", name = "w", descriptor = "Laf;")
    public static class7 field2689 = class48.method406(40, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2667 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "J")
    public static long field2677;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Lbd;")
    public static class12 field2692;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lkc;")
    public static class72 field2674;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "[Lfd;")
    public static class40[] field2687;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "[[[I")
    public static int[][][] field2697;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZIIII)V")
    public static final void method877(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2673++;
        int var5 = arg3;
        if (!arg0) {
            return;
        }
        while (var5 <= arg2 + arg3) {
            for (int var6 = arg4; var6 <= arg1 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class127.field3057[0][var6][var5] = 127;
                    if (arg4 == var6 && var6 > 0) {
                        class108.field2636[0][var6][var5] = class108.field2636[0][var6 - 1][var5];
                    }
                    if (arg4 + arg1 == var6 && var6 < 103) {
                        class108.field2636[0][var6][var5] = class108.field2636[0][var6 + 1][var5];
                    }
                    if (arg3 == var5 && var5 > 0) {
                        class108.field2636[0][var6][var5] = class108.field2636[0][var6][var5 - 1];
                    }
                    if (arg3 + arg2 == var5 && var5 < 103) {
                        class108.field2636[0][var6][var5] = class108.field2636[0][var6][var5 + 1];
                    }
                }
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "([IZII)Lvb;")
    private final class146 method878(int[] arg0, boolean arg1, int arg2, int arg3) {
        int var5 = (arg3 >>> 12 | (arg3 & 0xA0000FFF) << 4) ^ arg2;
        field2691++;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class146 var9 = (class146) this.field2672.method126(var7, (byte) 108);
        if (var9 != null) {
            return var9;
        }
        if (!arg1) {
            this.field2690 = null;
        }
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        class61 var10 = class61.method515(this.field2690, arg3, arg2);
        if (var10 == null) {
            return null;
        }
        class146 var11 = var10.method517();
        this.field2672.method130(118, var11, var7);
        if (arg0 != null) {
            arg0[0] -= var11.field3441.length;
        }
        return var11;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lja;I)V")
    public static final void method879(class63 arg0, int arg1) {
        if (arg0.field1406 != null) {
            arg0.field1406.field1426 = 0;
        }
        arg0.field1409 = false;
        field2676++;
        for (class63 var2 = arg0.method7(); var2 != null; var2 = arg0.method4()) {
            method879(var2, -62);
        }
        int var3 = -61 % ((-arg1 - 4) / 49);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
    public static final void method880(int arg0, int arg1) {
        field2696++;
        if (class108.field2634 == arg1) {
            return;
        }
        if (class108.field2634 == 0) {
            class71.method561(arg0 ^ 0xFFFFFF9E);
        }
        if (arg1 == 20 || arg1 == 40) {
            class80.field1848 = 0;
            class136.field3237 = 0;
            class115.field2743 = 0;
        }
        if (arg0 != arg1 && arg1 != 40 && class74.field1720 != null) {
            class74.field1720.method1172((byte) 10);
            class74.field1720 = null;
        }
        if (class108.field2634 == 25) {
            class57.field1371 = 1;
            class105.field2574 = 0;
            class13.field331 = 0;
            class11.field290 = 1;
            class147.field3466 = 0;
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class57.method468(class127.field3060, arg0 - 107, class13.field324, class71.field1554);
        } else {
            class57.method467((byte) 87);
        }
        class108.field2634 = arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[II)Lvb;")
    public final class146 method881(int arg0, int[] arg1, int arg2) {
        field2684++;
        if (arg0 != 0) {
            field2667 = 35;
        }
        if (this.field2690.method582(true) == 1) {
            return this.method878(arg1, true, arg2, 0);
        } else if (this.field2690.method562((byte) -125, arg2) == 1) {
            return this.method878(arg1, true, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)Lvb;")
    private final class146 method882(int arg0, int arg1, int arg2, int[] arg3) {
        field2686++;
        int var5 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x20000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        if (arg2 < 55) {
            method877(false, -84, 42, -14, -66);
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class146 var9 = (class146) this.field2672.method126(var7, (byte) -93);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class36 var10 = class36.method322(this.field2695, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class146 var11 = var10.method326();
            this.field2672.method130(96, var11, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field3441.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II[I)Lvb;")
    public final class146 method883(int arg0, int arg1, int[] arg2) {
        field2669++;
        if (this.field2695.method582(true) == 1) {
            return this.method882(0, arg1, 98, arg2);
        } else if (arg0 != -1224257596) {
            return null;
        } else if (this.field2695.method562((byte) 116, arg1) == 1) {
            return this.method882(arg1, 0, 103, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static void method884(byte arg0) {
        field2687 = null;
        field2689 = null;
        field2697 = null;
        field2679 = null;
        field2688 = null;
        field2692 = null;
        field2694 = null;
        field2670 = null;
        field2674 = null;
        if (arg0 <= -55) {
            field2678 = null;
            field2675 = null;
            field2693 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lkb;Lkb;)V")
    public class111(class71 arg0, class71 arg1) {
        this.field2695 = arg1;
        this.field2690 = arg0;
    }
}
