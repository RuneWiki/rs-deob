import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class261 {

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public int field3447 = 0;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public int field3461 = 0;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "Z")
    private boolean field3464 = false;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "S")
    public static short field3448 = 32767;

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "[I")
    public static int[] field3465 = new int[1000];

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Lff;")
    public static class9 field3450 = new class9(30, -1);

    @OriginalMember(owner = "client!bp", name = "w", descriptor = "Lcu;")
    public static class145 field3468 = new class145(50, 0);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public int field3446;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public int field3449;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public int field3453;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!bp", name = "x", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!bp", name = "y", descriptor = "I")
    private int field3470;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "J")
    public long field3460;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bp", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field3471;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lmd;Z)V")
    public final void method1573(class379 arg0, boolean arg1) {
        field3466++;
        while (true) {
            int var3 = arg0.method2238(255);
            if (var3 == 0) {
                if (arg1) {
                    return;
                } else {
                    this.field3464 = false;
                    return;
                }
            }
            this.method1579(arg0, var3, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lqa;B)V")
    public static final void method1574(class162 arg0, byte arg1) {
        field3452++;
        int var2 = class232.field3126;
        int var3 = class462.field6398;
        int var4 = class381.field5207;
        int var5 = class522.field7714;
        int var6 = -10660793;
        arg0.method1093(var5, var2, var3, 3, var4, var6);
        arg0.method1093(16, var2 + 1, var3 + 1, 3, var4 - 2, -16777216);
        arg0.method1099(var2 + 1, var4 - 2, var3 + 18, -16777216, true, var5 - 19);
        class219.field2961.method2816(class388.field5275.method1764(class489.field6789, false), true, var3 + 14, var6, var2 + 3, -1);
        int var7 = class267.field3526.method1302(-4362);
        if (arg1 != 55) {
            method1578((byte) -71);
        }
        int var8 = class267.field3526.method1297(true);
        int var9 = 0;
        for (class39 var10 = (class39) class415.field5733.method1672((byte) -112); var10 != null; var10 = (class39) class415.field5733.method1668(-1)) {
            int var11 = (class412.field5693 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < (var2 + var4) && var8 > var11 - 13 && var8 < var11 + 3 && var10.field592) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class54.method401(var10.field590, false)) {
                var13 = class127.field1852.method2390(75, (int) var10.field596).field6693;
            } else if (var10.field591 != -1) {
                var13 = class127.field1852.method2390(96, var10.field591).field6693;
            } else if (class195.method1246((byte) -53, var10.field590)) {
                class117 var16 = class291.field3822[(int) var10.field596];
                if (var16 != null) {
                    class506 var17 = var16.field1661;
                    if (var17.field6971 != null) {
                        var17 = var17.method2885(arg1 + 39, class301.field3980);
                    }
                    if (var17 != null) {
                        var13 = var17.field6989;
                    }
                }
            } else if (class298.method1745(var10.field590, -60)) {
                Object var14 = null;
                class1 var15;
                if (var10.field590 == 1012) {
                    var15 = class402.field5388.method1994(arg1 ^ 0xFFFFBC45, (int) var10.field596);
                } else {
                    var15 = class402.field5388.method1994(-17294, (int) (var10.field596 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field58 != null) {
                    var15 = var15.method17(class301.field3980, -89);
                }
                if (var15 != null) {
                    var13 = var15.field73;
                }
            }
            String var18 = class493.method2836(var10, (byte) -92);
            if (var13 != null) {
                var18 = var18 + class379.method2205(var13, 62);
            }
            class219.field2961.method2817(var2 + 3, var11, class9.field220, var12, 0, class294.field3843, arg1 - 55, var18);
            var9++;
            if (var10.field601) {
                class413.field5714.method3109(var2 + class173.field2525.method2455((byte) 126, var18) + 5, var11 - 12);
            }
        }
        class411.method2374(class381.field5207, class462.field6398, (byte) -32, class522.field7714, class232.field3126);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public static final void method1575(byte arg0) {
        field3462++;
        if (class297.field3882 != null) {
            return;
        }
        Container var1;
        if (class273.field3572 == null) {
            var1 = class389.field5281.field2917;
        } else {
            var1 = class273.field3572;
        }
        class184.field2617 = var1.getSize().width;
        class445.field6092 = var1.getSize().height;
        if (class273.field3572 == var1) {
            Insets var2 = class273.field3572.getInsets();
            class184.field2617 -= var2.right + var2.left;
            class445.field6092 -= var2.top + var2.bottom;
        }
        if (class170.method1136((byte) 91) == 1) {
            class175.field2555 = class310.field4079;
            class269.field3539 = 0;
            class149.field2132 = class61.field949;
            class224.field3023 = (class184.field2617 - class61.field949) / 2;
        } else if (class199.field2765 < 96 && class166.field2414 == 0) {
            int var3 = class184.field2617 <= 1024 ? class184.field2617 : 1024;
            int var4 = class445.field6092 > 768 ? 768 : class445.field6092;
            class149.field2132 = var3;
            class224.field3023 = (class184.field2617 - var3) / 2;
            class175.field2555 = var4;
            class269.field3539 = 0;
        } else {
            class149.field2132 = class184.field2617;
            class269.field3539 = 0;
            class175.field2555 = class445.field6092;
            class224.field3023 = 0;
        }
        if (class281.field3698 != class168.field2433) {
            boolean var10000;
            if (class149.field2132 < 1024 && class175.field2555 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class518.field7663.setSize(class149.field2132, class175.field2555);
        if (class370.field4984 != null) {
            class370.field4984.method595(class518.field7663);
        }
        if (class273.field3572 == var1) {
            Insets var5 = class273.field3572.getInsets();
            class518.field7663.setLocation(var5.left + class224.field3023, class269.field3539 + var5.top);
        } else {
            class518.field7663.setLocation(class224.field3023, class269.field3539);
        }
        if (class474.field6555 != -1) {
            class329.method1899(11153, true);
        }
        class124.method909(3545);
        if (arg0 != 63) {
            method1577(null, (byte) 94, null);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLch;)V")
    public static final void method1576(boolean arg0, class322 arg1) {
        field3454++;
        if (!arg0) {
            method1577(null, (byte) 55, null);
        }
        if (class497.field6886 == null) {
            return;
        }
        class338 var2 = null;
        if (arg1.field4215 == 0) {
            var2 = (class338) class234.method1453(arg1.field4222, arg1.field4224, arg1.field4228);
        }
        if (arg1.field4215 == 1) {
            var2 = (class338) class463.method2642(arg1.field4222, arg1.field4224, arg1.field4228);
        }
        if (arg1.field4215 == 2) {
            var2 = (class338) class504.method2874(arg1.field4222, arg1.field4224, arg1.field4228, field3471 == null ? (field3471 = method1581("np")) : field3471);
        }
        if (arg1.field4215 == 3) {
            var2 = (class338) class466.method2648(arg1.field4222, arg1.field4224, arg1.field4228);
        }
        if (var2 == null) {
            arg1.field4219 = 0;
            arg1.field4214 = 0;
            arg1.field4213 = -1;
        } else {
            arg1.field4213 = var2.method347((byte) -87);
            arg1.field4219 = var2.method345(-1736);
            arg1.field4214 = var2.method344(-4534);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "([JB[I)V")
    public static final void method1577(long[] arg0, byte arg1, int[] arg2) {
        if (arg1 == -43) {
            field3456++;
            class379.method2225(arg0, arg0.length - 1, (byte) -110, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
    public static void method1578(byte arg0) {
        field3465 = null;
        field3468 = null;
        if (arg0 < 117) {
            method1577(null, (byte) 70, null);
        }
        field3450 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lmd;IB)V")
    private final void method1579(class379 arg0, int arg1, byte arg2) {
        if (arg2 >= -72) {
            return;
        }
        field3451++;
        if (arg1 == 1) {
            this.field3470 = arg0.method2212((byte) 83);
        } else if (arg1 == 2) {
            arg0.method2238(255);
        } else if (arg1 == 3) {
            this.field3467 = arg0.method2232((byte) 124);
            this.field3463 = arg0.method2232((byte) 127);
            this.field3459 = arg0.method2232((byte) 124);
        } else if (arg1 == 4) {
            this.field3446 = arg0.method2238(255);
            this.field3449 = arg0.method2232((byte) 126);
        } else if (arg1 == 6) {
            this.field3457 = arg0.method2238(255);
        } else if (arg1 == 8) {
            this.field3447 = 1;
        } else if (arg1 == 9) {
            this.field3461 = 1;
        } else if (arg1 == 10) {
            this.field3464 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public final void method1580(int arg0) {
        this.field3469 = class305.field4022[this.field3470 << 3];
        field3458++;
        this.field3453 = (int) Math.sqrt((double) (this.field3467 * this.field3467 + this.field3463 * this.field3463 + this.field3459 * this.field3459));
        if (this.field3449 == arg0) {
            this.field3449 = 1;
        }
        if (this.field3446 == 0) {
            this.field3460 = 2147483647L;
        } else if (this.field3446 == 1) {
            this.field3460 = (this.field3453 * 8 / this.field3449);
            this.field3460 *= this.field3460;
        } else if (this.field3446 == 2) {
            this.field3460 = (this.field3453 * 8 / this.field3449);
        }
        if (this.field3464) {
            this.field3453 *= -1;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1581(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class304("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }
}
