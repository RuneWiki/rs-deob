import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class class224 implements class346 {

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lri;")
    private class97 field3606;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Lri;")
    public class97 field3612;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lrc;")
    public class499 field3611;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "[I")
    public static int[] field3608 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    private int field3614;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "J")
    private long field3617;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Lla;")
    private class418 field3615;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "[[Lpt;")
    public static class491[][] field3610;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZIII)V")
    public abstract void method582(boolean arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)I")
    public final int method1645(boolean arg0) {
        if (!arg0) {
            return 41;
        }
        field3609++;
        int var2 = class204.field3327.method2930((byte) -36);
        int var3 = var2 * 100;
        if (this.field3614 == var2 && var2 != 0) {
            int var4 = class204.field3327.method2934(-5144);
            if (var2 < var4) {
                long var5 = this.field3617 - class204.field3327.method2931(0);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class112.method1033(-11752) - this.field3617) * 10000L;
                    if (var9 < var7) {
                        var3 = (int) (var9 * 100L * (long) (var4 - var2) / var7 + (long) (var2 * 100));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field3614 = var2;
            this.field3617 = class112.method1033(-11752);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static final void method1646(int arg0) {
        if (arg0 <= 99) {
            method1648(-46, -9, 6, null);
        }
        field3613++;
        class524.field7648.method569(0);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZIZ)V")
    public abstract void method583(int arg0, boolean arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public static void method1647(byte arg0) {
        field3610 = null;
        if (arg0 != 42) {
            method1650((byte) 40, -5, null, -48, null);
        }
        field3608 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public void method587(int arg0) {
        field3616++;
        class632 var2 = class597.method3482(32, this.field3611.field7324, this.field3606);
        if (arg0 != 22478) {
            this.field3617 = -41L;
        }
        this.field3615 = class627.field8857.method347(var2, class284.method2028(this.field3612, this.field3611.field7324), true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z")
    public boolean method585(byte arg0) {
        if (arg0 < 119) {
            this.field3612 = null;
        }
        field3607++;
        boolean var2 = true;
        if (!this.field3612.method942(0, this.field3611.field7324)) {
            var2 = false;
        }
        if (!this.field3606.method942(0, this.field3611.field7324)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)V")
    public final void method1066(boolean arg0, int arg1) {
        field3603++;
        int var3 = this.field3611.field7323.method1799(arg1 + 5596, this.field3611.field7317, class585.field8333) + this.field3611.field7318;
        if (arg1 != -5506) {
            field3610 = null;
        }
        int var4 = this.field3611.field7322.method2550(this.field3611.field7316, true, class95.field1487) + this.field3611.field7314;
        this.method583(var3, true, var4, arg0);
        this.method582(arg0, var3, 0, var4);
        String var5 = class204.field3327.method2928((byte) -77);
        if ((class112.method1033(-11752) - this.field3617) > 10000L) {
            var5 = var5 + " (" + class204.field3327.method2929(0).method3899(arg1 + 5605) + ")";
        }
        this.field3615.method2654(this.field3611.field7316 / 2 + var4 + this.field3611.field7319 + 4, -1, this.field3611.field7321, var5, this.field3611.field7317 / 2 + var3, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1648(int arg0, int arg1, int arg2, Class arg3) {
        class252 var4 = class454.field6818[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class531 var5 = var4.field4026; var5 != null; var5 = var5.field7736) {
            class459 var6 = var5.field7739;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6865 == arg1 && var6.field6869 == arg2) {
                class663.method3803(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1649(int arg0, String arg1, int arg2) {
        field3605++;
        if (arg0 == 0) {
            class627.field8857 = class167.method1350(class17.field282.field4846 * 2, class271.field4377, 0, class48.field645, class28.field436, 124);
            if (arg1 != null) {
                class627.field8857.method121(0);
                class632 var3 = class613.method3567((byte) -123, 0, class51.field682, class666.field9430);
                class418 var4 = class627.field8857.method347(var3, class284.method2018(class158.field2699, class666.field9430, 0), true);
                class502.method3057(-9629);
                class420.method2683(var4, -31593, arg1, class627.field8857, var3, true);
            }
        } else {
            class167 var5 = null;
            if (arg1 != null) {
                var5 = class167.method1350(0, class271.field4377, 0, class48.field645, class28.field436, 105);
                var5.method121(0);
                class632 var6 = class613.method3567((byte) 66, 0, class51.field682, class666.field9430);
                class418 var7 = var5.method347(var6, class284.method2018(class158.field2699, class666.field9430, 0), true);
                class502.method3057(-9629);
                class420.method2683(var7, -31593, arg1, var5, var6, true);
            }
            try {
                class627.field8857 = class167.method1350(class17.field282.field4846 * 2, class271.field4377, arg0, class48.field645, class28.field436, -101);
                if (arg1 != null) {
                    var5.method121(0);
                    class632 var8 = class613.method3567((byte) 112, 0, class51.field682, class666.field9430);
                    class418 var9 = var5.method347(var8, class284.method2018(class158.field2699, class666.field9430, 0), true);
                    class502.method3057(-9629);
                    class420.method2683(var9, -31593, arg1, var5, var8, true);
                }
                if (class627.field8857.method307()) {
                    boolean var10 = true;
                    try {
                        var10 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var14) {
                    }
                    class493 var11;
                    if (var10) {
                        var11 = class627.field8857.method290(146800640);
                    } else {
                        var11 = class627.field8857.method290(104857600);
                    }
                    class627.field8857.method277(var11);
                }
            } catch (Throwable var15) {
                arg0 = 0;
                class627.field8857 = class167.method1350(0, class271.field4377, 0, class48.field645, class28.field436, -53);
            }
            if (var5 != null) {
                try {
                    var5.method1349(1);
                } catch (Throwable var13) {
                }
            }
        }
        class497.field7259 = arg0;
        class226.method1657(false);
        class627.field8857.method328(32);
        class183.field3093 = class627.field8857.method272();
        class240.field3805 = class627.field8857.method272();
        class415.method2642((byte) 126);
        class627.field8857.method300(!class17.field282.field4873);
        if (class627.field8857.method319()) {
            class500.method3050(class17.field282.field4891, -17699);
        }
        class406.method2602(class417.field6374 >> 3, class275.field4426 >> 3, -61, class627.field8857);
        class338.method2317(104);
        class644.field9057 = false;
        class311.field4901 = true;
        class576.field8217 = null;
        int var12 = 30 / ((arg2 - 7) / 53);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI[Ljava/lang/Object;I[I)V")
    public static final void method1650(byte arg0, int arg1, Object[] arg2, int arg3, int[] arg4) {
        field3604++;
        if (arg0 <= 12) {
            field3610 = null;
        }
        if (arg3 >= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg3;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var7;
        Object var8 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg3; var10 < arg1; var10++) {
            if (arg4[var10] < (var10 & var9) + var7) {
                int var11 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6] = var11;
                Object var12 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6++] = var12;
            }
        }
        arg4[arg1] = arg4[var6];
        arg4[var6] = var7;
        arg2[arg1] = arg2[var6];
        arg2[var6] = var8;
        method1650((byte) 77, var6 - 1, arg2, arg3, arg4);
        method1650((byte) 69, arg1, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lri;Lri;Lrc;)V")
    public class224(class97 arg0, class97 arg1, class499 arg2) {
        this.field3606 = arg1;
        this.field3612 = arg0;
        this.field3611 = arg2;
    }
}
