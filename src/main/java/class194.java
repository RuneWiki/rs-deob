import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class194 extends class337 {

    @OriginalMember(owner = "client!rk", name = "yc", descriptor = "I")
    public int field2747 = -1;

    @OriginalMember(owner = "client!rk", name = "Dc", descriptor = "I")
    public int field2752 = -1;

    @OriginalMember(owner = "client!rk", name = "Rc", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!rk", name = "Sc", descriptor = "Lpg;")
    public static class492 field2767;

    @OriginalMember(owner = "client!rk", name = "wc", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!rk", name = "xc", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!rk", name = "zc", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!rk", name = "Ac", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!rk", name = "Bc", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!rk", name = "Cc", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!rk", name = "Ec", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!rk", name = "Fc", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!rk", name = "Gc", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!rk", name = "Hc", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!rk", name = "Ic", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!rk", name = "Jc", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!rk", name = "Kc", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!rk", name = "Lc", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!rk", name = "Mc", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!rk", name = "Nc", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!rk", name = "Oc", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!rk", name = "Pc", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!rk", name = "Qc", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!rk", name = "Tc", descriptor = "Lul;")
    public class329 field2768;

    static {
        new class375("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field2766 = 0;
        field2767 = new class492(2, -2);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lul;I)V", line = 4)
    public final void method1364(class329 arg0, int arg1) {
        ++field2761;
        int var3 = -44 % ((arg1 - 13) / 35);
        this.field2768 = arg0;
        if (super.field5345 != null) {
            super.field5345.method865();
        }
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V", line = 21)
    public final void method57(int arg0) {
        ++field2745;
        if (arg0 == -5077) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)V", line = 32)
    public static final void method1365(byte arg0) {
        ++field2764;
        class423.field6309.method655(true, 5);
        class398.field6048.method1688(1, 5);
        class75.field1012.method3028(5, false);
        class56.field755.method2029(5, false);
        class410.field6175.method1213((byte) -128, 5);
        class84.field1154.method2450(5, (byte) 61);
        class260.field3621.method1932((byte) 125, 5);
        class275.field3826.method109((byte) 28, 5);
        class144.field2075.method651(5, 103);
        class513.field7614.method101(5, (byte) 17);
        class186.field2620.method2679(4172, 5);
        class237.field3377.method354((byte) 103, 5);
        class471.field6878.method321(5, 3);
        class209.field2960.method3082(5, (byte) 91);
        class525.field7770.method270(false, 5);
        class296.field4391.method386(5, (byte) -110);
        class496.field7258.method1680(5, true);
        class64.field896.method2769(5, -1);
        if (arg0 < 104) {
            method1368((Object) null, 17, (class469) null);
        }
        class31.field473.method678((byte) 101, 5);
        class128.field1812.method2667(-110, 5);
        class443.method2671(5, (byte) -60);
        class432.method2588(50, (byte) 95);
        class148.method981(5, (byte) 105);
        class189.method1326(5, (byte) -18);
        class224.field3158.method1016(5, (byte) 120);
        class302.field4450.method1016(5, (byte) 127);
        class209.field2947.method1016(5, (byte) 121);
        class130.field1894.method1016(5, (byte) 125);
        class291.field4339.method1016(5, (byte) 126);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIILqa;)Z", line = 71)
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field2754;
        if (this.field2768 != null && this.method1370(arg3, 131072, 50)) {
            class23 var5 = arg3.method1088();
            int var6 = super.field5319.method2101(-90);
            var5.method175(var6);
            var5.method177(super.field2217, super.field2222, super.field2215);
            boolean var7 = false;
            for (int var8 = 0; var8 < super.field5346.length; ++var8) {
                if (super.field5346[var8] != null && super.field5346[var8].method310(arg0, arg2, var5, ~this.field2768.field5083 == -2)) {
                    var7 = true;
                    break;
                }
            }
            super.field5346[0] = super.field5346[1] = super.field5346[2] = super.field5346[arg1] = null;
            return var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIZI)V", line = 107)
    public final void method1366(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        super.field2210 = (byte) arg1;
        ++field2749;
        if (~super.field5240 != 0 && ~class260.field3621.method1934(arg5 + -31770, super.field5240).field3739 == -2) {
            super.field5240 = -1;
        }
        if (arg5 != 31883) {
            this.method51((class496) null, 40);
        }
        if (~super.field5304 != 0) {
            class372 var7 = class275.field3826.method108(super.field5304, 0);
            if (var7.field5723 && var7.field5705 != -1 && class260.field3621.method1934(arg5 + -31765, var7.field5705).field3739 == 1) {
                super.field5304 = -1;
            }
        }
        if (super.field5260 != -1) {
            class372 var8 = class275.field3826.method108(super.field5260, arg5 + -31883);
            if (var8.field5723 && ~var8.field5705 != 0 && ~class260.field3621.method1934(121, var8.field5705).field3739 == -2) {
                super.field5260 = -1;
            }
        }
        if (!arg4) {
            int var9 = -super.field5339[0] + arg3;
            int var10 = arg2 - super.field5344[0];
            if (~var9 <= 7 && ~var9 >= -9 && ~var10 <= 7 && var10 <= 8) {
                if (~super.field5343 > -10) {
                    ++super.field5343;
                }
                for (int var11 = super.field5343; var11 > 0; --var11) {
                    super.field5339[var11] = super.field5339[var11 + -1];
                    super.field5344[var11] = super.field5344[var11 + -1];
                    super.field5340[var11] = super.field5340[var11 + -1];
                }
                super.field5339[0] = arg3;
                super.field5344[0] = arg2;
                super.field5340[0] = 1;
                return;
            }
        }
        super.field5339[0] = arg3;
        super.field5342 = 0;
        super.field5343 = 0;
        super.field5338 = 0;
        super.field5344[0] = arg2;
        super.field2215 = (super.field5344[0] << 7) + (arg0 << 6);
        super.field2217 = (super.field5339[0] << 7) + (arg0 << 6);
        if (super.field5345 != null) {
            super.field5345.method865();
        }
    }

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "(I)Z", line = 184)
    private final boolean method1367(int arg0) {
        ++field2759;
        return arg0 != 5 ? true : this.field2768.field5088;
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(B)I", line = 195)
    public final int method779(byte arg0) {
        if (arg0 != 9) {
            method1365((byte) 35);
        }
        ++field2748;
        return super.field5278;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lqa;I)Lpj;", line = 206)
    public final class507 method51(class496 arg0, int arg1) {
        ++field2760;
        if (this.field2768 != null && this.method1370(arg0, 2048, 72)) {
            class23 var3 = arg0.method1088();
            int var4 = super.field5319.method2101(-92);
            var3.method175(var4);
            var3.method177(super.field2217, super.field2222, super.field2215);
            class219 var5 = this.method2181(0);
            class329 var6 = this.field2768.field5068 == null ? this.field2768 : this.field2768.method2125(class36.field583, false);
            if (class96.field1399.field5222 && var6.field5092 && var5.field3025) {
                class270 var7 = super.field5240 != -1 && ~super.field5301 == -1 ? class260.field3621.method1934(122, super.field5240) : null;
                class270 var8 = super.field5253 == -1 || super.field5294 && var7 != null ? null : class260.field3621.method1934(127, super.field5253);
                class201 var9 = class455.method2739(var8 == null ? var7 : var8, (byte) -1, this.field2768.field5083, this.field2768.field5038 & 65535, super.field5323, super.field5276, 65535 & this.field2768.field5052, super.field5346[0], super.field5290, var4, var8 != null ? super.field5246 : super.field5269, this.field2768.field5048 & 255, arg0, super.field5284, this.field2768.field5079 & 255);
                if (var9 != null) {
                    float var10 = arg0.method1115();
                    float var11 = arg0.method1104();
                    arg0.method1144(false);
                    arg0.method1087(var10, var11 + -150.0F);
                    var9.method318(var3, (class159) null, 0);
                    arg0.method1087(var10, var11);
                    arg0.method1144(true);
                }
            }
            class507 var12 = null;
            if (this.method1367(5)) {
                var12 = class82.method527(super.field5346.length, 1761171873);
            }
            if (super.field5345 == null) {
                arg0.method1062(super.field5346, var3, var12 == null ? null : var12.field7549, 0);
            } else {
                class258 var13 = super.field5345.method870();
                arg0.method1078(super.field5346, var13, var3, var12 == null ? null : var12.field7549, 0);
            }
            if (arg1 != -150) {
                field2766 = 10;
            }
            this.method2183(arg0, super.field5346, (byte) 122, false);
            if (super.field5346[2] != null) {
                if (~var4 != -1) {
                    super.field5346[2].method290(var4);
                }
                super.field5346[2].method307(super.field2217 - super.field5341.field6139, -super.field5341.field6146 + super.field2222, -super.field5341.field6131 + super.field2215);
            }
            super.field5346[0] = super.field5346[1] = super.field5346[2] = super.field5346[3] = null;
            super.field5251 = class527.field7787;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "(I)Z", line = 282)
    public final boolean method49(int arg0) {
        ++field2751;
        if (arg0 != 7) {
            method1368((Object) null, -31, (class469) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/Object;ILhu;)V", line = 308)
    public static final void method1368(Object arg0, int arg1, class469 arg2) {
        ++field2753;
        if (arg2.field6849 != null) {
            for (int var3 = 0; var3 < 50 && arg2.field6849.peekEvent() != null; ++var3) {
                class106.method710(1L, (byte) 6);
            }
            if (arg0 != null) {
                arg2.field6849.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
            if (arg1 < 44) {
                field2766 = 34;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V", line = 333)
    public final void method1369(int arg0, int arg1, int arg2) {
        ++field2762;
        int var4 = super.field5339[0];
        int var5 = super.field5344[0];
        if (~arg0 == -1) {
            ++var5;
        }
        if (arg0 == arg1) {
            ++var5;
            ++var4;
        }
        if (~arg0 == -3) {
            ++var4;
        }
        if (arg0 == 3) {
            --var5;
            ++var4;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (~arg0 == -6) {
            --var5;
            --var4;
        }
        if (~arg0 == -7) {
            --var4;
        }
        if (~super.field5240 != 0 && class260.field3621.method1934(122, super.field5240).field3739 == 1) {
            super.field5240 = -1;
        }
        if (~arg0 == -8) {
            ++var5;
            --var4;
        }
        if (super.field5304 != -1) {
            class372 var6 = class275.field3826.method108(super.field5304, 0);
            if (var6.field5723 && ~var6.field5705 != 0 && ~class260.field3621.method1934(121, var6.field5705).field3739 == -2) {
                super.field5304 = -1;
            }
        }
        if (~super.field5260 != 0) {
            class372 var7 = class275.field3826.method108(super.field5260, 0);
            if (var7.field5723 && var7.field5705 != -1 && class260.field3621.method1934(arg1 + 116, var7.field5705).field3739 == 1) {
                super.field5260 = -1;
            }
        }
        if (~super.field5343 > -10) {
            ++super.field5343;
        }
        for (int var8 = super.field5343; ~var8 < -1; --var8) {
            super.field5339[var8] = super.field5339[var8 + -1];
            super.field5344[var8] = super.field5344[var8 + -1];
            super.field5340[var8] = super.field5340[var8 + -1];
        }
        super.field5339[0] = var4;
        super.field5344[0] = var5;
        super.field5340[0] = (byte) arg2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lqa;II)Z", line = 423)
    private final boolean method1370(class496 arg0, int arg1, int arg2) {
        ++field2756;
        int var4 = arg1;
        class219 var5 = this.method2181(0);
        class270 var6 = super.field5240 != -1 && super.field5301 == 0 ? class260.field3621.method1934(119, super.field5240) : null;
        class270 var7 = ~super.field5253 == 0 || super.field5294 && var6 != null ? null : class260.field3621.method1934(123, super.field5253);
        int var8 = -117 % ((-40 - arg2) / 40);
        int var9 = var5.field3031;
        int var10 = var5.field3032;
        if (~var9 != -1 || var10 != 0 || var5.field3043 != 0 || ~var5.field3046 != -1) {
            arg1 |= 7;
        }
        boolean var11 = ~super.field5252 != -1 && ~super.field5250 >= ~class405.field6116 && ~class405.field6116 > ~super.field5297;
        if (var11) {
            arg1 |= 524288;
        }
        class201 var12 = super.field5346[0] = this.field2768.method2123(class186.field2620, super.field5266, super.field5269, arg1, super.field5256, var6, super.field5246, super.field5314, class260.field3621, -11601, super.field5288, var7, class36.field583, arg0, super.field5265);
        if (var12 == null) {
            return false;
        } else {
            super.field5278 = var12.method306();
            this.method2177((byte) 48, var12);
            int var13 = super.field5319.method2101(-104);
            if (~var9 == -1 && var10 == 0) {
                this.method2185(-1741536337, this.method2091(-15245) << 7, 0, this.method2091(-15245) << 7, 0, var13);
            } else {
                this.method2185(-1741536337, var9, var5.field3055, var10, var5.field3069, var13);
                if (super.field5290 != 0) {
                    super.field5346[0].method293(super.field5290);
                }
                if (super.field5323 != 0) {
                    super.field5346[0].method287(super.field5323);
                }
                if (super.field5276 != 0) {
                    super.field5346[0].method307(0, super.field5276, 0);
                }
            }
            if (var11) {
                var12.method278(super.field5241, super.field5267, super.field5299, super.field5252 & 255);
            }
            if (~super.field5304 != 0 && super.field5258 != -1) {
                class372 var14 = class275.field3826.method108(super.field5304, 0);
                boolean var15 = var14.field5721 == 3 && (var9 != 0 || ~var10 != -1);
                int var16 = var4;
                if (!var15) {
                    if (super.field5259 != 0) {
                        var16 = var4 | 5;
                    }
                    if (~super.field5261 != -1) {
                        var16 |= 2;
                    }
                } else {
                    var16 = var4 | 7;
                }
                class201 var17 = super.field5346[1] = var14.method2331(0, super.field5302, super.field5258, var16, super.field5321, arg0, class260.field3621);
                if (var17 != null) {
                    if (~super.field5261 != -1) {
                        var17.method307(0, -super.field5261 << 0, 0);
                    }
                    if (super.field5259 != 0) {
                        var17.method290(super.field5259 * 2048);
                    }
                    if (var15) {
                        if (~super.field5290 != -1) {
                            var17.method293(super.field5290);
                        }
                        if (~super.field5323 != -1) {
                            var17.method287(super.field5323);
                        }
                        if (~super.field5276 != -1) {
                            var17.method307(0, super.field5276, 0);
                        }
                    }
                }
            } else {
                super.field5346[1] = null;
            }
            if (super.field5260 != -1 && ~super.field5308 != 0) {
                class372 var18 = class275.field3826.method108(super.field5260, 0);
                boolean var19 = ~var18.field5721 == -4 && (~var9 != -1 || ~var10 != -1);
                int var20 = var4;
                if (!var19) {
                    if (super.field5243 != 0) {
                        var20 = var4 | 5;
                    }
                    if (~super.field5309 != -1) {
                        var20 |= 2;
                    }
                } else {
                    var20 = var4 | 7;
                }
                class201 var21 = super.field5346[3] = var18.method2330(arg0, super.field5313, (byte) 84, super.field5279, var20, super.field5308, class260.field3621);
                if (var21 != null) {
                    if (super.field5309 != 0) {
                        var21.method307(0, -super.field5309 << 0, 0);
                    }
                    if (super.field5243 != 0) {
                        var21.method290(super.field5243 * 2048);
                    }
                    if (var19) {
                        if (super.field5290 != 0) {
                            var21.method293(super.field5290);
                        }
                        if (~super.field5323 != -1) {
                            var21.method287(super.field5323);
                        }
                        if (~super.field5276 != -1) {
                            var21.method307(0, super.field5276, 0);
                        }
                    }
                }
            } else {
                super.field5346[3] = null;
            }
            super.field5346[2] = null;
            if (super.field5341 != null) {
                if (~super.field5341.field6125 < ~class405.field6116) {
                    if (super.field5341.field6137 <= class405.field6116) {
                        class201 var22 = super.field5341.method2478((byte) -35, arg0, var4 | 7);
                        if (var22 != null) {
                            var22.method307(-super.field2217 + super.field5341.field6139, -super.field2222 + super.field5341.field6146, super.field5341.field6131 - super.field2215);
                            if (~var13 != -1) {
                                var22.method290(var13);
                            }
                            super.field5346[2] = var22;
                        }
                    }
                } else {
                    super.field5341 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "(I)Z", line = 613)
    public final boolean method1371(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field2758;
            return this.field2768 != null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(BLqa;)V", line = 628)
    public final void method62(byte arg0, class496 arg1) {
        ++field2757;
        if (this.field2768 != null) {
            if (arg0 != -126) {
                method1368((Object) null, -119, (class469) null);
            }
            if (super.field5336 || this.method1370(arg1, 0, arg0 + 1)) {
                this.method2183(arg1, super.field5346, (byte) 122, super.field5336);
                super.field5346[0] = super.field5346[1] = super.field5346[2] = super.field5346[3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "(I)I", line = 654)
    public final int method1372(int arg0) {
        ++field2750;
        if (this.field2768.field5068 != null) {
            class329 var2 = this.field2768.method2125(class36.field583, false);
            if (var2 != null && var2.field5087 != -1) {
                return var2.field5087;
            }
        }
        if (arg0 >= -74) {
            return -65;
        } else {
            return ~this.field2768.field5087 != 0 ? this.field2768.field5087 : super.method1372(-77);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lqv;BLqa;IZII)V", line = 675)
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field2765;
        if (arg1 != 118) {
            this.method61((class49) null, (byte) 125, (class496) null, 3, true, 94, -41);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "(I)V", line = 686)
    public static void method1373(int arg0) {
        if (arg0 < 1) {
            field2767 = null;
        }
        field2767 = null;
    }

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "(I)I", line = 699)
    public final int method1374(int arg0) {
        ++field2746;
        if (this.field2768.field5068 != null) {
            class329 var2 = this.field2768.method2125(class36.field583, false);
            if (var2 != null && var2.field5110 != -1) {
                return var2.field5110;
            }
        }
        int var3 = -106 / ((arg0 - -63) / 50);
        return this.field2768.field5110;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)I", line = 718)
    public final int method1375(int arg0) {
        ++field2755;
        if (this.field2768.field5068 != null) {
            class329 var2 = this.field2768.method2125(class36.field583, false);
            if (var2 != null && var2.field5073 != -1) {
                return var2.field5073;
            }
        }
        return arg0 != 7 ? -58 : this.field2768.field5073;
    }
}
