import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class275 extends class49 {

    @OriginalMember(owner = "client!hk", name = "sc", descriptor = "[Lbl;")
    public static class282[] field4435 = new class282[50];

    @OriginalMember(owner = "client!hk", name = "vc", descriptor = "[I")
    public static int[] field4438 = new int[32];

    @OriginalMember(owner = "client!hk", name = "nc", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!hk", name = "oc", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!hk", name = "pc", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!hk", name = "qc", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!hk", name = "rc", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!hk", name = "tc", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!hk", name = "uc", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!hk", name = "xc", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!hk", name = "yc", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!hk", name = "zc", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!hk", name = "Ac", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!hk", name = "Bc", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!hk", name = "Cc", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!hk", name = "wc", descriptor = "Lte;")
    public class265 field4439;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
    public static final void method1852(int arg0) {
        boolean var1 = false;
        int var2 = -4 / ((arg0 - 34) / 59);
        ++field4436;
        while (!var1) {
            var1 = true;
            for (int var3 = 0; ~var3 > ~(class202.field3248 + -1); ++var3) {
                if (~class23.field291[var3] > -1001 && class23.field291[var3 + 1] > 1000) {
                    var1 = false;
                    String var4 = class162.field2633[var3];
                    class162.field2633[var3] = class162.field2633[var3 - -1];
                    class162.field2633[var3 - -1] = var4;
                    String var5 = class152.field2464[var3];
                    class152.field2464[var3] = class152.field2464[var3 + 1];
                    class152.field2464[var3 + 1] = var5;
                    int var6 = class270.field4368[var3];
                    class270.field4368[var3] = class270.field4368[var3 - -1];
                    class270.field4368[var3 - -1] = var6;
                    int var7 = class23.field284[var3];
                    class23.field284[var3] = class23.field284[var3 + 1];
                    class23.field284[var3 + 1] = var7;
                    int var8 = class3.field36[var3];
                    class3.field36[var3] = class3.field36[var3 - -1];
                    class3.field36[var3 + 1] = var8;
                    short var9 = class23.field291[var3];
                    class23.field291[var3] = class23.field291[var3 + 1];
                    class23.field291[var3 + 1] = var9;
                    long var10 = class109.field1892[var3];
                    class109.field1892[var3] = class109.field1892[var3 - -1];
                    class109.field1892[var3 + 1] = var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIIII)V")
    public static final void method1853(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class238.field3807 > -101) {
            class130.method901(arg3 + 1901432569);
        }
        class63.method494(arg2, arg4, arg0 + arg2, arg4 - -arg1);
        ++field4433;
        if (class238.field3807 < 100) {
            int var5 = arg0 / 2 + arg2;
            byte var6 = 20;
            int var7 = -var6 + arg4 - (-(arg1 / 2) + 18);
            class63.method507(arg2, arg4, arg0, arg1, 0);
            class63.method510(var5 + -152, var7, 304, 34, 9179409);
            class63.method510(var5 + -151, var7 - -1, 302, 32, 0);
            class63.method507(var5 - 150, var7 + 2, class238.field3807 * 3, 30, 9179409);
            class63.method507(class238.field3807 * 3 + var5 - 150, var7 + 2, -(class238.field3807 * 3) + 300, 30, 0);
            class283.field4524.method1137(class283.field4509, var5, var6 + var7, 16777215, -1);
        } else {
            class16.field196 = -((int) ((float) arg0 / class130.field2168)) + class122.field2048;
            class194.field3131 = (int) ((float) (arg1 * 2) / class130.field2168);
            class44.field533 = -((int) ((float) arg1 / class130.field2168)) + class266.field4320;
            class224.field3560 = (int) ((float) (arg0 * 2) / class130.field2168);
            int var8 = class122.field2048 - (int) ((float) arg0 / class130.field2168);
            int var9 = (int) ((float) arg0 / class130.field2168) + class122.field2048;
            int var10 = (int) ((float) arg1 / class130.field2168) + class266.field4320;
            int var11 = -((int) ((float) arg1 / class130.field2168)) + class266.field4320;
            class196.method1325(arg0 + arg2, var8, arg2, arg4 - -arg1, arg4, var10, 0, var9, var11);
            class281.method1883(arg4, 0, var8, var11, arg2, var9, arg0 + arg2, var10, arg1 + arg4, class294.field4662);
            class188.method1286(var9, var11, arg4, arg1 + arg4, arg2, var8, var10, arg0 + arg2, 28734);
            if (arg3 != 29677) {
                field4438 = null;
            }
            if (class11.field156 > 0) {
                --class129.field2165;
                if (class129.field2165 == 0) {
                    --class11.field156;
                    class129.field2165 = 20;
                }
            }
            if (class279.field4470) {
                int var12 = arg2 - (-arg0 + 5);
                int var13 = arg1 - 8 + arg4;
                int var14 = 16776960;
                class58.field809.method1118("Fps:" + class130.field2179, var12, var13, 16776960, -1);
                int var17 = var13 - 15;
                Runtime var15 = Runtime.getRuntime();
                int var16 = (int) ((var15.totalMemory() + -var15.freeMemory()) / 1024L);
                if (~var16 < -65537) {
                    var14 = 16711680;
                }
                class58.field809.method1118("Mem:" + var16 + "k", var12, var17, var14, -1);
                var13 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lhi;I)Lrl;")
    public static final class174 method1854(class264 arg0, int arg1) {
        if (arg1 != 9179409) {
            field4435 = null;
        }
        ++field4442;
        class174 var2 = new class174();
        var2.field2810 = arg0.method1777(arg1 ^ -9179509);
        var2.field2806 = class266.method1805((byte) -42, var2.field2810);
        return var2;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V")
    public final void method74(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4432;
        if (this.field4439 != null) {
            ;
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(III)Z")
    public static final boolean method1855(int arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg1 != 4) {
            return false;
        } else {
            if (arg2 >= 5 && arg2 <= 8) {
                arg2 = 4;
            }
            ++field4440;
            class94 var3 = class119.method842(125, arg0);
            return var3.method654(true, arg2);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()I")
    public final int method88() {
        ++field4437;
        return super.field677;
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)I")
    public final int method390(int arg0) {
        ++field4444;
        if (this.field4439.field4271 != null) {
            class265 var2 = this.field4439.method1794(-8159);
            if (var2 != null && ~var2.field4250 != 0) {
                return var2.field4250;
            }
        }
        int var3 = -51 / ((arg0 - -42) / 40);
        return super.field631;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZI)I")
    public static final int method1856(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1858(103);
        }
        ++field4445;
        class204 var3 = (class204) class78.field1067.method457((long) arg0, (byte) -115);
        if (var3 == null) {
            return 0;
        } else {
            return ~arg2 <= -1 && var3.field3274.length > arg2 ? var3.field3274[arg2] : 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lte;I)V")
    public final void method1857(class265 arg0, int arg1) {
        ++field4434;
        this.field4439 = arg0;
        if (arg1 != 7324) {
            this.field4439 = null;
        }
        if (super.field669 != null) {
            super.field669.method30();
        }
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
    public static void method1858(int arg0) {
        if (arg0 <= -43) {
            field4435 = null;
            field4438 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIIJILqc;)V")
    public final void method85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class4 arg10) {
        ++field4441;
        if (this.field4439 != null) {
            class21 var13 = ~super.field672 != 0 && super.field642 == 0 ? class267.method1812((byte) 89, super.field672) : null;
            class21 var14 = ~super.field659 == 0 || super.field659 == this.method375(0).field2862 && var13 != null ? null : class267.method1812((byte) 89, super.field659);
            class13 var15 = this.field4439.method1800(super.field658, 1, super.field623, super.field668, var14, super.field667, super.field609, super.field681, super.field654, var13);
            if (var15 != null) {
                super.field677 = var15.method88();
                class265 var16 = this.field4439;
                if (var16.field4271 != null) {
                    var16 = var16.method1794(-8159);
                }
                if (class22.field270 && var16.field4285) {
                    class13 var17 = class200.method1347(this.field4439.field4260, super.field613, var14 == null ? super.field681 : super.field609, this.field4439.field4267, this.field4439.field4262, var14 != null ? var14 : var13, 6, this.field4439.field4279, var15, super.field643, super.field614, super.field616, arg0, this.field4439.field4291);
                    var17.method85(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field669);
                }
                this.method388((byte) 106, var15);
                this.method378(arg0, var15, (byte) -73);
                class13 var18 = null;
                if (~super.field634 != 0 && ~super.field694 != 0) {
                    class66 var19 = class271.method1826(super.field634, (byte) 119);
                    var18 = var19.method526(super.field694, super.field686, false, super.field615);
                    if (var18 != null) {
                        var18.method76(0, -super.field661, 0);
                        if (var19.field927) {
                            if (class179.field2895 != 0) {
                                var18.method91(class179.field2895);
                            }
                            if (~class102.field1541 != -1) {
                                var18.method93(class102.field1541);
                            }
                            if (class222.field3533 != 0) {
                                var18.method76(0, class222.field3533, 0);
                            }
                        }
                    }
                }
                if (var18 != null) {
                    var15 = ((class90) var15).method642(var18);
                }
                if (~this.field4439.field4262 == -2) {
                    var15.field169 = true;
                }
                var15.method85(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field669);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field4431;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)Z")
    public final boolean method376(int arg0) {
        ++field4443;
        if (this.field4439 == null) {
            return false;
        } else {
            if (arg0 != -11127) {
                this.method390(28);
            }
            return true;
        }
    }
}
