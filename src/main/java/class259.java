import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class259 extends class298 {

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "Lss;")
    public static class140 field3734 = new class140(0, 3);

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field3742;

    static {
        new class40("Use", "Benutzen", "Utiliser", "Usar");
        new class40("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BII)I", line = 4)
    public static final int method1587(byte arg0, int arg1, int arg2) {
        ++field3735;
        int var3 = arg2 >>> 24;
        int var4 = -var3 + 255;
        if (arg0 > -16) {
            method1591(-36, (byte) 7, (class331) null);
        }
        int var5 = ((16711935 & arg2) * var3 & -16711936 | 16711680 & (65280 & arg2) * var3) >>> 8;
        return ((16711680 & (65280 & arg1) * var4 | -16711936 & (16711935 & arg1) * var4) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)I", line = 23)
    public static final int method1588(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3738;
        if (arg0 != 16383) {
            return 31;
        } else {
            int var5 = arg3 & 15;
            int var6 = var5 >= 8 ? arg4 : arg2;
            int var7 = var5 >= 4 ? (~var5 != -13 && ~var5 != -15 ? arg1 : arg2) : arg4;
            return ((var5 & 1) == 0 ? var6 : -var6) + (~(var5 & 2) != -1 ? -var7 : var7);
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V", line = 41)
    public static void method1589(int arg0) {
        if (arg0 == -1) {
            field3734 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Llp;ZIZ)V", line = 54)
    public static final void method1590(class68 arg0, boolean arg1, int arg2, boolean arg3) {
        ++field3739;
        if (arg2 == -364) {
            int var4 = arg0.field850;
            int var5 = (int) arg0.field1776;
            arg0.method702((byte) -114);
            if (arg3) {
                class423.method2520((byte) -112, var4);
            }
            class314.method1943((byte) -74, var4);
            class256 var6 = class399.method2387(var5, -1857167024);
            if (var6 != null) {
                class398.method2383(var6, 76);
            }
            class460.method2712((byte) -123);
            if (!arg1 && class57.field725 != -1) {
                class340.method2065(0, 1, class57.field725);
            }
            class464 var7 = new class464(class369.field5270);
            for (class68 var8 = (class68) var7.method2731(0); var8 != null; var8 = (class68) var7.method2728(arg2 ^ 363)) {
                if (!var8.method698(true)) {
                    var8 = (class68) var7.method2731(arg2 ^ -364);
                    if (var8 == null) {
                        return;
                    }
                }
                if (var8.field844 == 3) {
                    int var9 = (int) var8.field1776;
                    if (~(var9 >>> 16) == ~var4) {
                        method1590(var8, arg1, -364, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLve;)V", line = 114)
    public static final void method1591(int arg0, byte arg1, class331 arg2) {
        ++field3741;
        boolean var3 = ~arg2.method2017(-57, 1) == -2;
        if (var3) {
            class450.field6373[class468.field6579++] = arg0;
        }
        int var4 = arg2.method2017(-53, 2);
        class198 var5 = class46.field596[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field2720 = -1;
            } else if (~class61.field760 == ~arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class138.field1671[arg0] = (var5.field2536[0] + class349.field5023 >> 6) + (var5.field2539[0] + class93.field1163 >> 6 << 14) + (var5.field994 << 28);
                if (var5.field2747 == -1) {
                    class456.field6431[arg0] = var5.field2470.method1116((byte) 122);
                } else {
                    class456.field6431[arg0] = var5.field2747;
                }
                class210.field2904[arg0] = var5.field2511;
                if (var5.field2737 > 0) {
                    class208.method1154(false, var5);
                }
                class46.field596[arg0] = null;
                if (~arg2.method2017(-105, 1) != -1) {
                    class373.method2253(arg2, arg0, -22575);
                }
            }
        } else if (~var4 == -2) {
            int var6 = arg2.method2017(-98, 3);
            int var7 = var5.field2539[0];
            int var8 = var5.field2536[0];
            if (~var6 == -1) {
                --var8;
                --var7;
            } else if (var6 == 1) {
                --var8;
            } else if (var6 != 2) {
                if (~var6 == -4) {
                    --var7;
                } else if (var6 == 4) {
                    ++var7;
                } else if (var6 != 5) {
                    if (var6 == 6) {
                        ++var8;
                    } else if (~var6 == -8) {
                        ++var7;
                        ++var8;
                    }
                } else {
                    --var7;
                    ++var8;
                }
            } else {
                --var8;
                ++var7;
            }
            if (var3) {
                var5.field2729 = var8;
                var5.field2720 = var7;
            } else {
                var5.field2720 = -1;
                var5.method1077(var7, -120, var8, class188.field2556[arg0]);
            }
        } else if (var4 == 2) {
            int var9 = arg2.method2017(-81, 4);
            int var10 = var5.field2539[0];
            int var11 = var5.field2536[0];
            if (~var9 == -1) {
                var11 -= 2;
                var10 -= 2;
            } else if (~var9 == -2) {
                --var10;
                var11 -= 2;
            } else if (var9 == 2) {
                var11 -= 2;
            } else if (var9 == 3) {
                var11 -= 2;
                ++var10;
            } else if (var9 != 4) {
                if (~var9 == -6) {
                    --var11;
                    var10 -= 2;
                } else if (~var9 == -7) {
                    --var11;
                    var10 += 2;
                } else if (var9 == 7) {
                    var10 -= 2;
                } else if (var9 == 8) {
                    var10 += 2;
                } else if (var9 != 9) {
                    if (var9 == 10) {
                        ++var11;
                        var10 += 2;
                    } else if (~var9 == -12) {
                        var10 -= 2;
                        var11 += 2;
                    } else if (~var9 == -13) {
                        --var10;
                        var11 += 2;
                    } else if (var9 == 13) {
                        var11 += 2;
                    } else if (~var9 != -15) {
                        if (~var9 == -16) {
                            var11 += 2;
                            var10 += 2;
                        }
                    } else {
                        var11 += 2;
                        ++var10;
                    }
                } else {
                    var10 -= 2;
                    ++var11;
                }
            } else {
                var11 -= 2;
                var10 += 2;
            }
            if (!var3) {
                var5.field2720 = -1;
                var5.method1077(var10, -115, var11, class188.field2556[arg0]);
            } else {
                var5.field2720 = var10;
                var5.field2729 = var11;
            }
        } else {
            int var12 = arg2.method2017(-33, 1);
            if (~var12 == -1) {
                int var13 = arg2.method2017(-11, 12);
                int var14 = var13 >> 10;
                int var15 = 31 & var13 >> 5;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 31;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field2539[0] + var15;
                int var18 = var5.field2536[0] + var16;
                if (var3) {
                    var5.field2720 = var17;
                    var5.field2729 = var18;
                } else {
                    var5.field2720 = -1;
                    var5.method1077(var17, -124, var18, class188.field2556[arg0]);
                }
                var5.field994 = (byte) (3 & var5.field994 + var14);
                if (class61.field760 == arg0) {
                    class100.field1217 = var5.field994;
                }
            } else {
                int var19 = arg2.method2017(-22, 30);
                int var20 = var19 >> 28;
                int var21 = var19 >> 14 & 16383;
                if (arg1 > 0) {
                    field3734 = null;
                }
                int var22 = var19 & 16383;
                int var23 = (16383 & var5.field2539[0] - -class93.field1163 + var21) + -class93.field1163;
                int var24 = (16383 & var5.field2536[0] + class349.field5023 + var22) + -class349.field5023;
                if (!var3) {
                    var5.field2720 = -1;
                    var5.method1077(var23, 44, var24, class188.field2556[arg0]);
                } else {
                    var5.field2720 = var23;
                    var5.field2729 = var24;
                }
                var5.field994 = (byte) (3 & var5.field994 + var20);
                if (~class61.field760 == ~arg0) {
                    class100.field1217 = var5.field994;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 434)
    public class259() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)[I", line = 441)
    public final int[] method13(int arg0, boolean arg1) {
        ++field3736;
        if (!arg1) {
            field3734 = null;
        }
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            int[][] var4 = this.method1878(0, arg0, 127);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class158.field1877; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)V", line = 491)
    public static final void method1592(int arg0, int arg1, int arg2) {
        ++class475.field6665;
        class244.method1332((byte) -113, class490.field6928);
        ++field3740;
        class230.field3185.method889(true, arg2);
        if (arg1 != 1) {
            method1588(30, 14, 26, -29, 88);
        }
        class230.field3185.method933((byte) -103, arg0);
    }
}
