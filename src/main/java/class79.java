import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class79 extends class330 {

    @OriginalMember(owner = "client!fu", name = "D", descriptor = "Z")
    private boolean field886 = true;

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "Z")
    private boolean field892 = true;

    @OriginalMember(owner = "client!fu", name = "I", descriptor = "Lkj;")
    public static class85 field891 = class778.method4289(true);

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!fu", name = "C", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fu", name = "E", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fu", name = "F", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!fu", name = "G", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!fu", name = "H", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field890;
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field4630.method2475(arg0, 30011);
            if (super.field4630.field5704) {
                int[] var4 = this.method2084(0, this.field892 ? -arg0 + class385.field5505 : arg0, (byte) 17);
                if (this.field886) {
                    for (int var5 = 0; ~class80.field901 < ~var5; ++var5) {
                        var3[var5] = var4[-var5 + class639.field8988];
                    }
                } else {
                    class335.method2124(var4, 0, var3, 0, class80.field901);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field887;
        int var4 = 120 / ((arg2 - -41) / 42);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field4636 = ~arg0.method3013(-93) == -2;
                }
            } else {
                this.field892 = arg0.method3013(-127) == 1;
            }
        } else {
            this.field886 = ~arg0.method3013(-102) == -2;
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
    public static final void method566(int arg0) {
        ++field888;
        if (arg0 == 21532) {
            for (int var1 = 0; class70.field770 > var1; ++var1) {
                class22 var3 = class7.field40[var1];
                boolean var4 = false;
                if (var3.field195 != null) {
                    if (!var3.field195.method529((byte) 46)) {
                        var4 = true;
                    }
                } else {
                    --var3.field196;
                    if (~var3.field196 <= ~(var3.method92(-40) ? -1500 : -10)) {
                        if (var3.field185 == 1 && var3.field186 == null) {
                            var3.field186 = class307.method1998(class406.field5726, var3.field191, 0);
                            if (var3.field186 == null) {
                                continue;
                            }
                            var3.field196 += var3.field186.method1996();
                        } else if (var3.method92(arg0 ^ -21509) && (var3.field188 == null || var3.field194 == null)) {
                            if (var3.field188 == null) {
                                var3.field188 = class622.method3580(class102.field1184, var3.field191);
                            }
                            if (var3.field188 == null) {
                                continue;
                            }
                            if (var3.field194 == null) {
                                var3.field194 = var3.field188.method3582(new int[] { 22050 });
                                if (var3.field194 == null) {
                                    continue;
                                }
                            }
                        }
                        if (~var3.field196 > -1) {
                            int var5 = 8192;
                            int var6;
                            if (var3.field198 == 0) {
                                var6 = var3.field187 * (~var3.field185 == -4 ? class688.field9602.field8535.method1981((byte) -98) : class688.field9602.field8548.method1981((byte) -98)) >> 2;
                            } else {
                                int var7 = (var3.field198 & 65001298) >> 24;
                                if (~class724.field10031.field3467 != ~var7) {
                                    var6 = 0;
                                } else {
                                    int var8 = var3.field198 << 9 & 130560;
                                    int var9 = class724.field10031.method3744(1) << 8;
                                    int var10 = (var3.field198 & 16725255) >> 16;
                                    int var11 = (var10 << 9) - (-var9 + -256) + -class724.field10031.field3470;
                                    int var12 = 255 & var3.field198 >> 8;
                                    int var13 = (var12 << 9) + 256 + -class724.field10031.field3460 + var9;
                                    int var14 = Math.abs(var11) - -Math.abs(var13) + -512;
                                    if (~var14 < ~var8) {
                                        var3.field196 = -99999;
                                        continue;
                                    }
                                    if (var14 < 0) {
                                        var14 = 0;
                                    }
                                    var6 = (-var14 + var8) * class688.field9602.field8496.method1981((byte) -98) * var3.field187 / var8 >> 2;
                                    if (var3.field190 != null && var3.field190 instanceof class253) {
                                        class253 var15 = (class253) var3.field190;
                                        short var16 = var15.field3758;
                                        short var17 = var15.field3745;
                                    }
                                    if (var11 != 0 || var13 != 0) {
                                        int var18 = 16383 & -4096 + (-class326.field4589 - (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D));
                                        if (~var18 < -8193) {
                                            var18 = -var18 + 16384;
                                        }
                                        int var19;
                                        if (var14 <= 0) {
                                            var19 = 8192;
                                        } else if (~var14 <= -4097) {
                                            var19 = 16384;
                                        } else {
                                            var19 = 8192 - -((-var14 + 8192) / 4096);
                                        }
                                        var5 = (-var19 + 16384 >> 1) + var18 * var19 / 8192;
                                    }
                                }
                            }
                            if (var6 > 0) {
                                class348 var20 = null;
                                if (var3.field185 == 1) {
                                    var20 = var3.field186.method1995().method2196(class413.field5782);
                                } else if (var3.method92(121)) {
                                    var20 = var3.field194;
                                }
                                class168 var21 = var3.field195 = class168.method1076(var20, var3.field197, var6, var5);
                                var21.method1056(var3.field189 - 1);
                                class44.field468.method2510(var21);
                            }
                        }
                    } else {
                        var4 = true;
                    }
                }
                if (var4) {
                    --class70.field770;
                    for (int var22 = var1; class70.field770 > var22; ++var22) {
                        class7.field40[var22] = class7.field40[var22 + 1];
                    }
                    --var1;
                }
            }
            if (class15.field90 && !class637.method3659(1)) {
                if (~class688.field9602.field8505.method1981((byte) -98) != -1 && class4.field22 != -1) {
                    if (class278.field3998 == null) {
                        class707.method3988(0, (byte) -98, class688.field9602.field8505.method1981((byte) -98), class4.field22, false, class456.field6372);
                    } else {
                        class580.method3401(false, (byte) -105, class688.field9602.field8505.method1981((byte) -98), class456.field6372, 0, class4.field22, class278.field3998);
                    }
                }
                class15.field90 = false;
                class278.field3998 = null;
            } else if (class688.field9602.field8505.method1981((byte) -98) != 0 && class4.field22 != -1 && !class637.method3659(1)) {
                ++class560.field7882;
                class116 var2 = class248.method1672(class84.field1023, class422.field5862, -20647);
                var2.field1575.method3003(class4.field22, -23061);
                class443.method2655(0, var2);
                class4.field22 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)[[I")
    public final int[][] method537(int arg0, int arg1) {
        ++field885;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (arg0 != 0) {
            field893 = -122;
        }
        if (super.field4621.field3510) {
            int[][] var4 = this.method2082(!this.field892 ? arg1 : -arg1 + class385.field5505, 0, 126);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field886) {
                for (int var11 = 0; class80.field901 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; var12 < class80.field901; ++var12) {
                    var8[var12] = var5[class639.field8988 - var12];
                    var9[var12] = var6[-var12 + class639.field8988];
                    var10[var12] = var7[-var12 + class639.field8988];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
    public class79() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(Z)V")
    public static void method567(boolean arg0) {
        if (arg0) {
            field891 = null;
        }
    }
}
