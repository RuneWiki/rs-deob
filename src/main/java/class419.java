import java.awt.Canvas;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class419 extends class185 {

    @OriginalMember(owner = "client!rd", name = "Kc", descriptor = "I")
    public static int field5806 = 0;

    @OriginalMember(owner = "client!rd", name = "Vc", descriptor = "I")
    public static int field5817 = 999999;

    @OriginalMember(owner = "client!rd", name = "ad", descriptor = "[I")
    public static int[] field5822 = new int[5];

    @OriginalMember(owner = "client!rd", name = "Ac", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!rd", name = "Bc", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!rd", name = "Cc", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!rd", name = "Dc", descriptor = "I")
    public static int field5799;

    @OriginalMember(owner = "client!rd", name = "Ec", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!rd", name = "Fc", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!rd", name = "Gc", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!rd", name = "Hc", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!rd", name = "Ic", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!rd", name = "Jc", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!rd", name = "Mc", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!rd", name = "Nc", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!rd", name = "Oc", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!rd", name = "Pc", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!rd", name = "Qc", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!rd", name = "Rc", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!rd", name = "Sc", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!rd", name = "Tc", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!rd", name = "Uc", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!rd", name = "Xc", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!rd", name = "Zc", descriptor = "I")
    public static int field5821;

    @OriginalMember(owner = "client!rd", name = "Lc", descriptor = "Ljr;")
    public class233 field5807;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rd", name = "bd", descriptor = "Ljava/lang/Class;")
    public static Class field5823;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rd", name = "cd", descriptor = "Ljava/lang/Class;")
    public static Class field5824;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rd", name = "dd", descriptor = "Ljava/lang/Class;")
    public static Class field5825;

    @OriginalMember(owner = "client!rd", name = "Wc", descriptor = "[Lti;")
    public static class5[] field5818;

    @OriginalMember(owner = "client!rd", name = "Yc", descriptor = "[S")
    public static short[] field5820;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lea;I)V")
    public final void method707(class58 arg0, int arg1) {
        ++field5805;
        if (arg1 >= -99) {
            this.method699(-71, -89, (class58) null, (class216) null, false, 78, 97);
        }
        if (this.field5807 != null) {
            if (super.field2670 || this.method2592(0, arg0, -115)) {
                this.method1282(0, super.field2670, super.field2657, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)I")
    public final int method1293(int arg0) {
        if (arg0 != -3) {
            this.method697(-94);
        }
        ++field5803;
        if (this.field5807.field3327 != null) {
            class233 var2 = this.field5807.method1524((byte) 107);
            if (var2 != null && var2.field3287 != -1) {
                return var2.field3287;
            }
        }
        return this.field5807.field3287;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I")
    public final int method1281(int arg0) {
        ++field5796;
        if (arg0 != 0) {
            field5801 = 41;
        }
        if (this.field5807.field3327 != null) {
            class233 var2 = this.field5807.method1524((byte) 96);
            if (var2 != null && var2.field3316 != -1) {
                return var2.field3316;
            }
        }
        return ~this.field5807.field3316 == 0 ? super.method1281(0) : this.field5807.field3316;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
    public final void method2583(int arg0, int arg1, int arg2) {
        ++field5811;
        int var4 = super.field2662[0];
        int var5 = super.field2659[0];
        if (~arg1 == -1) {
            ++var5;
        }
        if (arg1 == 1) {
            ++var5;
            ++var4;
        }
        if (~arg1 == -3) {
            ++var4;
        }
        if (arg1 == 3) {
            --var5;
            ++var4;
        }
        if (~arg1 == -5) {
            --var5;
        }
        if (~arg1 == -6) {
            --var5;
            --var4;
        }
        if (~arg1 == -7) {
            --var4;
        }
        if (~super.field2619 != arg2 && ~class408.method2521((byte) -112, super.field2619).field1149 == -2) {
            super.field2619 = -1;
        }
        if (~arg1 == -8) {
            ++var5;
            --var4;
        }
        if (super.field2636 != -1) {
            class344 var6 = class186.method1296(super.field2636, false);
            if (var6.field4650 && ~var6.field4648 != 0 && class408.method2521((byte) -112, var6.field4648).field1149 == 1) {
                super.field2636 = -1;
            }
        }
        if (super.field2654 < 9) {
            ++super.field2654;
        }
        for (int var7 = super.field2654; var7 > 0; --var7) {
            super.field2662[var7] = super.field2662[var7 + -1];
            super.field2659[var7] = super.field2659[var7 + -1];
            super.field2663[var7] = super.field2663[var7 + -1];
        }
        super.field2662[0] = var4;
        super.field2663[0] = (byte) arg0;
        super.field2659[0] = var5;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lij;I)V")
    public static final void method2584(class316 arg0, int arg1) {
        if (arg1 != -1) {
            field5822 = null;
        }
        class29.field406 = 0;
        class21.field271 = 0;
        ++field5797;
        class337.field4558 = new class399();
        class55.field724 = new class308[1024];
        class309.method1868(arg0, 35);
        class24.method150((byte) -81, arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lne;ILgf;Ljava/awt/Canvas;IB)Lea;")
    public static final class58 method2585(class76 arg0, int arg1, class202 arg2, Canvas arg3, int arg4, byte arg5) {
        ++field5816;
        try {
            if (arg5 != -89) {
                field5818 = null;
            }
            Class var6 = Class.forName("mm");
            Constructor var7 = var6.getConstructor(field5823 != null ? field5823 : (field5823 = method2594("java.awt.Canvas")), field5824 != null ? field5824 : (field5824 = method2594("gf")), Integer.TYPE, Integer.TYPE, field5825 != null ? field5825 : (field5825 = method2594("ne")));
            return (class58) var7.newInstance(arg3, arg2, new Integer(arg1), new Integer(arg4), arg0);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Z")
    public final boolean method697(int arg0) {
        ++field5804;
        if (arg0 <= 115) {
            this.method2591(-8);
        }
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljr;I)V")
    public final void method2586(class233 arg0, int arg1) {
        ++field5808;
        this.field5807 = arg0;
        if (super.field2658 != null) {
            super.field2658.method1557();
        }
        if (arg1 != -8) {
            this.method696(-90, (class58) null);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2587(int arg0, String arg1) {
        ++field5819;
        if (arg1 != null) {
            if ((~class353.field4751 > -101 || class311.field4221) && ~class353.field4751 > -201) {
                String var2 = class68.method547((byte) 46, arg1);
                if (var2 != null) {
                    for (int var3 = 0; var3 < class353.field4751; ++var3) {
                        String var7 = class68.method547((byte) 46, class196.field2851[var3]);
                        if (var7 != null && var7.equals(var2)) {
                            client.method1640(115, arg1 + class233.field3270.method2313((byte) -125, class445.field6241));
                            return;
                        }
                        if (class328.field4461[var3] != null) {
                            String var8 = class68.method547((byte) 46, class328.field4461[var3]);
                            if (var8 != null && var8.equals(var2)) {
                                client.method1640(-105, arg1 + class233.field3270.method2313((byte) -91, class445.field6241));
                                return;
                            }
                        }
                    }
                    for (int var4 = 0; class42.field541 > var4; ++var4) {
                        String var5 = class68.method547((byte) 46, class32.field443[var4]);
                        if (var5 != null && var5.equals(var2)) {
                            client.method1640(arg0 ^ 7144, class140.field2043.method2313((byte) -98, class445.field6241) + arg1 + class323.field4389.method2313((byte) -89, class445.field6241));
                            return;
                        }
                        if (class394.field5478[var4] != null) {
                            String var6 = class68.method547((byte) 46, class394.field5478[var4]);
                            if (var6 != null && var6.equals(var2)) {
                                client.method1640(123, class140.field2043.method2313((byte) -98, class445.field6241) + arg1 + class323.field4389.method2313((byte) -68, class445.field6241));
                                return;
                            }
                        }
                    }
                    if (class68.method547((byte) 46, class359.field4970.field5869).equals(var2)) {
                        client.method1640(-19, class84.field1179.method2313((byte) -77, class445.field6241));
                    } else {
                        class88.field1232.method1151(25, (byte) 111);
                        ++class30.field415;
                        class88.field1232.method2280(class82.method662(arg0 + 19336, arg1), arg0 + 1537853555);
                        if (arg0 == -7147) {
                            class88.field1232.method2285(arg1, (byte) -97);
                        }
                    }
                }
            } else {
                client.method1640(arg0 + 7138, class63.field848.method2313((byte) -94, class445.field6241));
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILea;Lac;ZII)V")
    public final void method699(int arg0, int arg1, class58 arg2, class216 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 == 22546) {
            ++field5798;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)I")
    public final int method23(int arg0) {
        ++field5799;
        if (arg0 > -84) {
            field5818 = null;
        }
        return super.field2601;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(ILea;)Lms;")
    public final class450 method696(int arg0, class58 arg1) {
        ++field5813;
        if (this.field5807 != null && this.method2592(1024, arg1, 7)) {
            class309 var3 = arg1.method210();
            int var4 = super.field2609.method129(2);
            var3.method1870(var4);
            var3.method1869(super.field40, super.field45, super.field44);
            class60 var5 = this.method1283((byte) -69);
            class233 var6 = this.field5807.field3327 != null ? this.field5807.method1524((byte) -76) : this.field5807;
            if (class404.field5593 && var6.field3311 && var5.field805) {
                class83 var7 = super.field2619 != -1 && super.field2617 == 0 ? class408.method2521((byte) 72, super.field2619) : null;
                class83 var8 = super.field2587 == -1 || super.field2597 && var7 != null ? null : class408.method2521((byte) 26, super.field2587);
                class116 var9 = class155.method1131(var4, this.field5807.field3278, super.field2657[0], var8 != null ? var8 : var7, super.field2595, false, super.field2650, super.field2594, var8 == null ? super.field2593 : super.field2621, arg1, 65535 & this.field5807.field3285, 65535 & this.field5807.field3308, this.field5807.field3306 & 255, super.field2596, 255 & this.field5807.field3300);
                if (var9 != null) {
                    float var10 = arg1.method268();
                    float var11 = arg1.method188();
                    arg1.method235(false);
                    arg1.method180(var10, var11 + -150.0F);
                    var9.method896(var3, (class153) null, 0);
                    arg1.method180(var10, var11);
                    arg1.method235(true);
                }
            }
            class450 var12 = null;
            if (this.method2590(arg0)) {
                var12 = class61.method494(-63, super.field2657.length);
            }
            if (super.field2658 != null) {
                class174 var13 = super.field2658.method1552();
                arg1.method225(super.field2657, var13, var3, var12 != null ? var12.field6451 : null, 0);
            } else {
                arg1.method167(super.field2657, var3, var12 == null ? null : var12.field6451, 0);
            }
            this.method1282(0, false, super.field2657, arg1);
            if (super.field2657[2] != null) {
                if (~var4 != -1) {
                    super.field2657[2].method867(var4);
                }
                super.field2657[2].method882(-super.field2665 + super.field40, super.field45 - super.field2672, -super.field2660 + super.field44);
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "(I)V")
    public static void method2588(int arg0) {
        if (arg0 == 2) {
            field5822 = null;
            field5820 = null;
            field5818 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IZ)V")
    public static final void method2589(int arg0, boolean arg1) {
        ++field5809;
        class140.method1025(arg0 ^ 255);
        if (class98.field1383 == 30 || ~class98.field1383 == -26) {
            ++class388.field5401;
            if (class388.field5401 >= 50 || arg1) {
                class388.field5401 = arg0;
                if (!class251.field3502 && class398.field5513 != null) {
                    ++class35.field472;
                    class88.field1232.method1151(57, (byte) 120);
                    try {
                        class398.field5513.method1328(0, class88.field1232.field5076, class88.field1232.field5048, 3);
                        class88.field1232.field5048 = 0;
                    } catch (IOException var2) {
                        class251.field3502 = true;
                    }
                }
                class140.method1025(arg0 ^ 255);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "(I)Z")
    private final boolean method2590(int arg0) {
        if (arg0 != 0) {
            method2593(1, (byte) 45);
        }
        ++field5815;
        return this.field5807.field3275;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZILea;I)Z")
    public final boolean method710(boolean arg0, int arg1, class58 arg2, int arg3) {
        if (!arg0) {
            this.method699(-11, -70, (class58) null, (class216) null, false, 54, 115);
        }
        ++field5812;
        if (this.field5807 != null && this.method2592(65536, arg2, -100)) {
            class309 var5 = arg2.method210();
            int var6 = super.field2609.method129(2);
            var5.method1870(var6);
            var5.method1869(super.field40, super.field45, super.field44);
            for (int var7 = 0; var7 < super.field2657.length; ++var7) {
                if (super.field2657[var7] != null && super.field2657[var7].method898(arg3, arg1, var5, this.field5807.field3278 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public final void method702(byte arg0) {
        if (arg0 == 46) {
            ++field5821;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "(I)Z")
    public final boolean method2591(int arg0) {
        if (arg0 != -1) {
            this.method699(9, 117, (class58) null, (class216) null, true, -29, -19);
        }
        ++field5810;
        return this.field5807 != null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILea;I)Z")
    private final boolean method2592(int arg0, class58 arg1, int arg2) {
        ++field5800;
        int var4 = arg0;
        class60 var5 = this.method1283((byte) 113);
        class83 var6 = super.field2619 != -1 && super.field2617 == 0 ? class408.method2521((byte) 3, super.field2619) : null;
        class83 var7 = ~super.field2587 == 0 || super.field2597 && var6 != null ? null : class408.method2521((byte) -120, super.field2587);
        int var8 = var5.field799;
        int var9 = var5.field766;
        if (~var8 != -1 || var9 != 0 || var5.field777 != 0 || ~var5.field813 != -1) {
            arg0 |= 7;
        }
        class116 var10 = super.field2657[0] = this.field5807.method1529(arg0, var7, arg1, super.field2626, super.field2588, (byte) 113, super.field2593, super.field2620, super.field2621, super.field2648, var6, super.field2634);
        if (var10 == null) {
            return false;
        } else {
            super.field2601 = var10.method889();
            this.method1295((byte) -53, var10);
            int var11 = super.field2609.method129(2);
            int var12 = 27 % ((arg2 - -55) / 34);
            super.field2650 = 0;
            super.field2596 = 0;
            super.field2594 = 0;
            if (var8 == 0 && ~var9 == -1) {
                this.method1294(this.method1285(-66) << 7, var11, (byte) -109, this.method1285(-87) << 7);
            } else {
                this.method1294(var8, var11, (byte) -125, var9);
                if (super.field2596 != 0) {
                    super.field2657[0].method910(super.field2596);
                }
                if (~super.field2650 != -1) {
                    super.field2657[0].method873(super.field2650);
                }
                if (super.field2594 != 0) {
                    super.field2657[0].method882(0, super.field2594, 0);
                }
            }
            super.field2657[1] = null;
            if (super.field2636 != -1 && super.field2643 != -1) {
                class344 var13 = class186.method1296(super.field2636, false);
                class116 var14 = var13.method2088(super.field2643, super.field2599, (byte) 55, arg1, var4 | (!var13.field4639 ? 2 : 7), super.field2584);
                if (var14 != null) {
                    var14.method882(0, -super.field2605, 0);
                    if (var13.field4639 && (var8 != 0 || ~var9 != -1)) {
                        if (~super.field2596 != -1) {
                            var14.method910(super.field2596);
                        }
                        if (super.field2650 != 0) {
                            var14.method873(super.field2650);
                        }
                        if (super.field2594 != 0) {
                            var14.method882(0, super.field2594, 0);
                        }
                    }
                    super.field2657[1] = var14;
                }
            }
            super.field2657[2] = null;
            if (super.field2656 != null) {
                if (class246.field3467 >= super.field2667) {
                    super.field2656 = null;
                }
                if (class246.field3467 >= super.field2673 && class246.field3467 < super.field2667) {
                    class116 var15 = super.field2656.method705(arg1, (byte) -63, 7 | var4);
                    if (var15 != null) {
                        var15.method882(-super.field40 + super.field2665, super.field2672 - super.field45, super.field2660 - super.field44);
                        if (~var11 != -1) {
                            var15.method867(var11);
                        }
                        super.field2657[2] = var15;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)I")
    public final int method1279(byte arg0) {
        int var2 = -29 / ((-82 - arg0) / 33);
        ++field5814;
        if (this.field5807.field3327 != null) {
            class233 var3 = this.field5807.method1524((byte) 9);
            if (var3 != null && ~var3.field3334 != 0) {
                return var3.field3334;
            }
        }
        return this.field5807.field3334;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V")
    public static final void method2593(int arg0, byte arg1) {
        ++field5802;
        class367.field5097.method2531(arg0, 112);
        if (arg1 != 30) {
            field5817 = -8;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2594(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
