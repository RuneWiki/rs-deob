import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class51 extends class186 {

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    private int field671;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    private int field668;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field654 = "Loaded input handler";

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Z")
    public static boolean field658 = false;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Z")
    public static boolean field662 = false;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field667 = new String[100];

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "Lra;")
    public static class38 field672;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Z")
    public static final boolean method288(int arg0) {
        if (arg0 <= 66) {
            return true;
        } else {
            ++field670;
            if (class239.field3945) {
                try {
                    if ((Boolean) class277.method1848(class194.field3107.field609, 2795, "showingVideoAd")) {
                        return false;
                    }
                    return true;
                } catch (Throwable var1) {
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Z")
    public static final boolean method289(int arg0) {
        ++field663;
        return ~class190.field3070 != arg0 ? true : class67.field848.method1059(127);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)I")
    public static final int method290(int arg0, byte arg1) {
        ++field666;
        return arg1 != -11 ? 123 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BII)V")
    public final void method291(byte arg0, int arg1, int arg2) {
        ++field664;
        if (arg0 > -45) {
            method294((byte) 45);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(III)V")
    public final void method292(int arg0, int arg1, int arg2) {
        ++field657;
        int var4 = this.field668 * arg2 >> 12;
        if (arg0 != -6) {
            this.field668 = 64;
        }
        int var5 = this.field671 * arg2 >> 12;
        int var6 = this.field660 * arg1 >> 12;
        int var7 = this.field661 * arg1 >> 12;
        class184.method1285(var4, var6, -28062, var5, var7, super.field2970);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIB)V")
    public final void method293(int arg0, int arg1, byte arg2) {
        int var4 = 1 / ((arg2 - 90) / 34);
        ++field655;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public static final void method294(byte arg0) {
        ++field656;
        if (class47.field597 != null) {
            class47.field597.method158(8);
        }
        if (class128.field2048 != null) {
            class128.field2048.method158(arg0 + 135);
        }
        if (arg0 != -127) {
            field665 = -99;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(B)V")
    public static void method295(byte arg0) {
        if (arg0 <= 14) {
            method290(86, (byte) -37);
        }
        field654 = null;
        field667 = null;
        field672 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lpd;IILcg;)V")
    public static final void method296(class96 arg0, int arg1, int arg2, class48 arg3) {
        ++field669;
        class21 var4 = new class21();
        var4.field271 = arg0.method584(255);
        var4.field273 = arg0.method597(-1197332568);
        int var5 = 38 / ((-24 - arg1) / 55);
        var4.field268 = new byte[var4.field271][][];
        var4.field278 = new class243[var4.field271];
        var4.field267 = new int[var4.field271];
        var4.field281 = new int[var4.field271];
        var4.field272 = new class243[var4.field271];
        var4.field275 = new int[var4.field271];
        for (int var6 = 0; ~var4.field271 < ~var6; ++var6) {
            try {
                int var7 = arg0.method584(255);
                if (var7 != 0 && var7 != 1 && var7 != 2) {
                    if (var7 == 3 || ~var7 == -5) {
                        String var8 = arg0.method588(false);
                        String var9 = arg0.method588(false);
                        int var10 = arg0.method584(255);
                        String[] var11 = new String[var10];
                        for (int var12 = 0; ~var10 < ~var12; ++var12) {
                            var11[var12] = arg0.method588(false);
                        }
                        byte[][] var13 = new byte[var10][];
                        if (~var7 == -4) {
                            for (int var14 = 0; var10 > var14; ++var14) {
                                int var15 = arg0.method597(-1197332568);
                                var13[var14] = new byte[var15];
                                arg0.method596(32, var15, 0, var13[var14]);
                            }
                        }
                        var4.field275[var6] = var7;
                        Class[] var16 = new Class[var10];
                        for (int var17 = 0; var10 > var17; ++var17) {
                            var16[var17] = class246.method1709(var11[var17], 5);
                        }
                        var4.field272[var6] = arg3.method276(class246.method1709(var8, 5), var16, var9, -90);
                        var4.field268[var6] = var13;
                    }
                } else {
                    String var18 = arg0.method588(false);
                    String var19 = arg0.method588(false);
                    int var20 = 0;
                    if (~var7 == -2) {
                        var20 = arg0.method597(-1197332568);
                    }
                    var4.field275[var6] = var7;
                    var4.field267[var6] = var20;
                    var4.field278[var6] = arg3.method272(class246.method1709(var18, 5), 0, var19);
                }
            } catch (ClassNotFoundException var21) {
                var4.field281[var6] = -1;
            } catch (SecurityException var22) {
                var4.field281[var6] = -2;
            } catch (NullPointerException var23) {
                var4.field281[var6] = -3;
            } catch (Exception var24) {
                var4.field281[var6] = -4;
            } catch (Throwable var25) {
                var4.field281[var6] = -5;
            }
        }
        class154.field2383.method1803(var4, -1);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIII)V")
    public class51(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field671 = arg2;
        this.field668 = arg0;
        this.field660 = arg1;
        this.field661 = arg3;
    }
}
