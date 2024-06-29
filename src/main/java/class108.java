import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class108 implements class106 {

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "Lp;")
    private class95 field2596 = new class95();

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    private int field2601 = 0;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    private int field2604 = 128;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "D")
    private double field2605 = 1.0D;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "Lbf;")
    private class14 field2602;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    private int field2603;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "[Ln;")
    private class83[] field2599;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field2591 = 0;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lae;")
    public static class6 field2587 = class64.method474(126, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lae;")
    public static class6 field2589 = class64.method474(107, "Wen m-Ochten Sie der Liste hinzuf-Ugen?");

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lae;")
    private static class6 field2581 = class64.method474(114, "scroll:");

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[[[B")
    public static byte[][][] field2582 = new byte[4][104][104];

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lae;")
    public static class6 field2584 = class64.method474(116, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Lae;")
    public static class6 field2593 = field2581;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lsd;")
    public static class114 field2586;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Lua;")
    public static class122 field2590;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lva;")
    public static class128 field2600;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lvb;")
    public static class129 field2577;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
    public static int[] field2598;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[Lva;")
    public static class128[] field2578;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "[Lva;")
    public static class128[] field2585;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method895(int arg0, int arg1) {
        if (arg1 != -9039) {
            method910((byte) -28);
        }
        field2583++;
        class83 var3 = this.field2599[arg0];
        if (var3 != null) {
            if (var3.field2028 != null) {
                this.field2596.method795(var3, -101);
                var3.field2031 = true;
                return var3.field2028;
            }
            boolean var4 = var3.method711(this.field2605, this.field2604, this.field2602);
            if (var4) {
                if (this.field2601 == 0) {
                    class83 var5 = (class83) this.field2596.method789(-117);
                    var5.method712();
                } else {
                    this.field2601--;
                }
                this.field2596.method795(var3, arg1 + 8959);
                var3.field2031 = true;
                return var3.field2028;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 61)
    public static void method910(byte arg0) {
        field2590 = null;
        field2581 = null;
        field2582 = null;
        field2598 = null;
        field2584 = null;
        if (arg0 < 36) {
            return;
        }
        field2600 = null;
        field2577 = null;
        field2578 = null;
        field2593 = null;
        field2587 = null;
        field2586 = null;
        field2589 = null;
        field2585 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 92)
    public static final void method911(int arg0) {
        field2580++;
        class59.field1277++;
        class111.field2660.method938((byte) 63, 70);
        if (arg0 != 31121) {
            field2578 = null;
        }
        if (class126.field3086 != -1) {
            class75.method605((byte) 126, class126.field3086);
            class126.field3086 = -1;
            class117.field2768 = true;
            class139.field3380 = true;
            class96.field2272 = -1;
        }
        if (class102.field2410 != -1) {
            class75.method605((byte) 122, class102.field2410);
            class102.field2410 = -1;
            class20.field427 = true;
            class96.field2272 = -1;
        }
        if (class72.field1649 != -1) {
            class75.method605((byte) 119, class72.field1649);
            class72.field1649 = -1;
            class139.method1122((byte) 40, 30);
        }
        if (class32.field801 != -1) {
            class75.method605((byte) -31, class32.field801);
            class32.field801 = -1;
        }
        if (class103.field2449 != -1) {
            class75.method605((byte) -75, class103.field2449);
            class96.field2272 = -1;
            class103.field2449 = -1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIZ)V", line = 150)
    public static final void method912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field2595++;
        if (arg7) {
            field2584 = null;
        }
        if (arg6 < 1 || arg3 < 1 || arg6 > 102 || arg3 > 102) {
            return;
        }
        if (class82.field2017 && class15.field305 != arg1) {
            return;
        }
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = 0;
        if (arg0 == 0) {
            var11 = class81.field1967.method544(arg1, arg6, arg3);
        }
        if (arg0 == 1) {
            var11 = class81.field1967.method528(arg1, arg6, arg3);
        }
        if (arg0 == 2) {
            var11 = class81.field1967.method549(arg1, arg6, arg3);
        }
        if (arg0 == 3) {
            var11 = class81.field1967.method569(arg1, arg6, arg3);
        }
        if (var11 != 0) {
            int var12 = var11 >> 14 & 0x7FFF;
            int var13 = class81.field1967.method524(arg1, arg6, arg3, var11);
            int var14 = var13 & 0x1F;
            int var15 = var13 >> 6 & 0x3;
            if (arg0 == 0) {
                class81.field1967.method545(arg1, arg6, arg3);
                class107 var16 = class80.method687(var12, (byte) 94);
                if (var16.field2522) {
                    class90.field2160[arg1].method376((byte) 40, var15, arg6, arg3, var14, var16.field2547);
                }
            }
            if (arg0 == 1) {
                class81.field1967.method531(arg1, arg6, arg3);
            }
            if (arg0 == 2) {
                class81.field1967.method563(arg1, arg6, arg3);
                class107 var17 = class80.method687(var12, (byte) 26);
                if (arg6 + var17.field2516 > 103 || arg3 + var17.field2516 > 103 || var17.field2546 + arg6 > 103 || arg3 + var17.field2546 > 103) {
                    return;
                }
                if (var17.field2522) {
                    class90.field2160[arg1].method372(var15, var17.field2546, arg3, arg6, (byte) -27, var17.field2547, var17.field2516);
                }
            }
            if (arg0 == 3) {
                class81.field1967.method529(arg1, arg6, arg3);
                class107 var18 = class80.method687(var12, (byte) 75);
                if (var18.field2522 && var18.field2537 == 1) {
                    class90.field2160[arg1].method377(arg6, arg3, (byte) 61);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg1;
        if (arg1 < 3 && (field2582[1][arg6][arg3] & 0x2) == 2) {
            var19 = arg1 + 1;
        }
        class90.method759(class90.field2160[arg1], arg6, arg2, arg1, var19, arg4, arg5, class81.field1967, -114, arg3);
        return;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)Lod;", line = 252)
    public static final class90 method913(byte arg0, int arg1) {
        field2597++;
        class90 var2 = (class90) class138.field3352.method128((byte) -80, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class90 var3 = class15.method164(arg1, class100.field2333, class68.field1508, 66, false);
        if (var3 != null) {
            class138.field3352.method130(var3, (long) arg1, (byte) -52);
        }
        if (arg0 <= 70) {
            method910((byte) -115);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Z", line = 274)
    public final boolean method897(int arg0, int arg1) {
        field2588++;
        if (arg0 == -11819) {
            return this.field2604 == 64;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 289)
    public final void method914(int arg0) {
        field2594++;
        for (int var2 = 0; var2 < this.field2599.length; var2++) {
            if (this.field2599[var2] != null) {
                this.field2599[var2].method712();
            }
        }
        int var3 = -72 / ((27 - arg0) / 37);
        this.field2596 = new class95();
        this.field2601 = this.field2603;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(DZ)V", line = 320)
    public final void method915(double arg0, boolean arg1) {
        field2575++;
        if (arg1) {
            field2582 = null;
        }
        this.field2605 = arg0;
        this.method914(66);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I", line = 339)
    public final int method894(int arg0, int arg1) {
        if (arg0 != 105) {
            this.method895(90, 89);
        }
        field2576++;
        return this.field2599[arg1] == null ? 0 : this.field2599[arg1].field2029;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)Z", line = 369)
    public final boolean method896(byte arg0, int arg1) {
        if (arg0 != -50) {
            this.field2602 = null;
        }
        field2592++;
        return this.field2599[arg1].field2026;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V", line = 389)
    public final void method916(int arg0, boolean arg1) {
        field2579++;
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < this.field2599.length; var3++) {
            class83 var4 = this.field2599[var3];
            if (var4 != null && var4.field2027 != 0 && var4.field2031) {
                var4.method713(arg0);
                var4.field2031 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lbf;Lbf;IDI)V", line = 433)
    public class108(class14 arg0, class14 arg1, int arg2, double arg3, int arg4) {
        this.field2602 = arg1;
        this.field2605 = arg3;
        this.field2604 = arg4;
        this.field2603 = arg2;
        this.field2601 = this.field2603;
        int[] var7 = arg0.method141(-1, 0);
        int var8 = var7.length;
        this.field2599 = new class83[arg0.method153(0, (byte) -4)];
        for (int var9 = 0; var9 < var8; var9++) {
            class77 var10 = new class77(arg0.method160(30605, 0, var7[var9]));
            this.field2599[var7[var9]] = new class83(var10);
        }
    }
}
