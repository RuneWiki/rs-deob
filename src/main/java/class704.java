import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class704 {

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lbt;")
    private class48 field9909;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lbt;")
    private class48 field9912;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field9904 = -1;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field9906 = 2;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[Z")
    public static boolean[] field9908 = new boolean[100];

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "[Lem;")
    public static class239[] field9914 = new class239[100];

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lqia;")
    private class23 field9902;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "[I")
    public static int[] field9907;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "[Ls;")
    public static class296[] field9910;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static final void method4004(int arg0) {
        field9903++;
        for (int var1 = 0; var1 < class707.field9936; var1++) {
            class228 var3 = class415.field5422[var1];
            boolean var4 = false;
            if (var3.field2699 == null) {
                var3.field2702--;
                if (var3.field2702 >= (var3.method1410((byte) -89) ? -1500 : -10)) {
                    if (var3.field2693 == 1 && var3.field2694 == null) {
                        var3.field2694 = class420.method2506(class257.field3050, var3.field2698, 0);
                        if (var3.field2694 == null) {
                            continue;
                        }
                        var3.field2702 += var3.field2694.method2507();
                    } else if (var3.method1410((byte) -127) && (var3.field2691 == null || var3.field2697 == null)) {
                        if (var3.field2691 == null) {
                            var3.field2691 = class527.method3152(class709.field9956, var3.field2698);
                        }
                        if (var3.field2691 == null) {
                            continue;
                        }
                        if (var3.field2697 == null) {
                            var3.field2697 = var3.field2691.method3148(new int[] { 22050 });
                            if (var3.field2697 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field2702 < 0) {
                        int var5 = 8192;
                        int var6;
                        if (var3.field2692 == 0) {
                            var6 = var3.field2705 * (var3.field2693 == 3 ? class118.field1503.field10637.method1581(arg0 - 65459) : class118.field1503.field10666.method1581(arg0 - 65459)) >> 2;
                        } else {
                            int var7 = (var3.field2692 & 0x3B755BC) >> 24;
                            if (class300.field3596.field808 == var7) {
                                int var8 = var3.field2692 & 0xFF << 9;
                                int var9 = class300.field3596.method1665(1720746760) << 8;
                                int var10 = var3.field2692 >> 16 & 0xFF;
                                int var11 = (var10 << 9) - (-var9 - 256) - class300.field3596.field823;
                                int var12 = (var3.field2692 & 0xFFB3) >> 8;
                                int var13 = (var12 << 9) + 256 - (-var9 + class300.field3596.field813);
                                int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                if (var8 < var14) {
                                    var3.field2702 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var6 = class118.field1503.field10661.method1581(0) * (var8 - var14) * var3.field2705 / var8 >> 2;
                                if (var3.field2703 != null && var3.field2703 instanceof class712) {
                                    class712 var15 = (class712) var3.field2703;
                                    short var16 = var15.field9997;
                                    short var17 = var15.field9994;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = -class111.field1405 - ((int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 >= 4096) {
                                        var19 = 16384;
                                    } else {
                                        var19 = (8192 - var14) / 4096 + 8192;
                                    }
                                    var5 = (16384 - var19 >> 1) + var18 * var19 / 8192;
                                }
                            } else {
                                var6 = 0;
                            }
                        }
                        if (var6 > 0) {
                            class242 var20 = null;
                            if (var3.field2693 == 1) {
                                var20 = var3.field2694.method2509().method1462(class555.field7727);
                            } else if (var3.method1410((byte) -86)) {
                                var20 = var3.field2697;
                            }
                            class80 var21 = var3.field2699 = class80.method725(var20, var3.field2700, var6, var5);
                            var21.method747(var3.field2695 - 1);
                            class783.field10811.method3258(var21);
                        }
                    }
                } else {
                    var4 = true;
                }
            } else if (!var3.field2699.method2221(8763)) {
                var4 = true;
            }
            if (var4) {
                class707.field9936--;
                for (int var22 = var1; var22 < class707.field9936; var22++) {
                    class415.field5422[var22] = class415.field5422[var22 + 1];
                }
                var1--;
            }
        }
        if (arg0 != 65459) {
            field9907 = null;
        }
        if (class52.field712 && !class728.method4115((byte) 121)) {
            if (class118.field1503.field10668.method1581(0) != 0 && class36.field542 != -1) {
                if (class604.field8150 == null) {
                    class227.method1391(class599.field8106, 0, (byte) -107, class118.field1503.field10668.method1581(0), false, class36.field542);
                } else {
                    class362.method2116(class118.field1503.field10668.method1581(0), (byte) 20, class36.field542, 0, class599.field8106, class604.field8150, false);
                }
            }
            class52.field712 = false;
            class604.field8150 = null;
        } else if (class118.field1503.field10668.method1581(arg0 ^ 0xFFB3) != 0 && class36.field542 != -1 && !class728.method4115((byte) 108)) {
            class299.field3571++;
            class336 var2 = class512.method3076(class191.field2288, class591.field8030, (byte) 114);
            var2.field4150.method2391(arg0 - 65572, class36.field542);
            class578.method3334(arg0 - 65455, var2);
            class36.field542 = -1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static void method4005(int arg0) {
        field9908 = null;
        field9910 = null;
        field9914 = null;
        if (arg0 == 8192) {
            field9907 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lbaa;I)Lg;")
    public final class167 method4006(class549 arg0, int arg1) {
        field9911++;
        if (arg0 == null) {
            return null;
        }
        class251 var3 = arg0.method94(arg1 - 1972391689);
        if (class66.field895 == var3) {
            return new class200((class463) arg0);
        } else if (class434.field5732 == var3) {
            return new class655(this.method4007(true), (class554) arg0);
        } else if (class354.field4404 == var3) {
            return new class783(this.field9909, (class332) arg0);
        } else if (class491.field6846 == var3) {
            return new class93(this.field9909, (class424) arg0);
        } else if (class435.field5743 == var3) {
            return new class357(this.field9909, this.field9912, (class519) arg0);
        } else if (class308.field3823 == var3) {
            return new class71(this.field9909, this.field9912, (class226) arg0);
        } else {
            if (arg1 != 1972392713) {
                this.field9912 = null;
            }
            if (class535.field7537 == var3) {
                return new class150(this.field9909, this.field9912, (class99) arg0);
            } else if (class198.field2358 == var3) {
                return new class526(this.field9909, this.field9912, (class580) arg0);
            } else if (class215.field2537 == var3) {
                return new class102(this.field9909, (class665) arg0);
            } else if (class179.field2196 == var3) {
                return new class719(this.field9909, this.field9912, (class2) arg0);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lbt;Lbt;)V")
    public class704(class48 arg0, class48 arg1) {
        this.field9909 = arg0;
        this.field9912 = arg1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)Lqia;")
    private final class23 method4007(boolean arg0) {
        if (!arg0) {
            this.field9909 = null;
        }
        field9905++;
        if (this.field9902 == null) {
            this.field9902 = new class23();
        }
        return this.field9902;
    }
}
