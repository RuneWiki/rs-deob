import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class521 extends class666 {

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field7469 = 0;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "Lcea;")
    public static class196 field7461 = new class196();

    @OriginalMember(owner = "client!fe", name = "P", descriptor = "[S")
    public static short[] field7470 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    public static int field7460;

    @OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "[Lso;")
    private class429[] field7466;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;ILfa;IILep;Led;IIIZLta;)V", line = 3)
    public static final void method2968(String arg0, int arg1, class213 arg2, int arg3, int arg4, class382 arg5, class645 arg6, int arg7, int arg8, int arg9, boolean arg10, class195 arg11) {
        ++field7464;
        int var12;
        if (class5.field41 != 4) {
            var12 = 16383 & (int) class90.field1041 - -class628.field8908;
        } else {
            var12 = (int) class90.field1041 & 16383;
        }
        int var13 = 10 + Math.max(arg5.field5035 / 2, arg5.field4958 / 2);
        int var14 = arg9 * arg9 - -(arg4 * arg4);
        if (~var14 >= ~(var13 * var13)) {
            int var15 = class285.field3655[var12];
            int var16 = class285.field3656[var12];
            if (~class5.field41 != -5) {
                var15 = var15 * 256 / (class599.field8520 + 256);
                var16 = var16 * 256 / (class599.field8520 + 256);
            }
            int var17 = arg4 * var15 + arg9 * var16 >> 14;
            int var18 = arg4 * var16 + -(arg9 * var15) >> 14;
            int var19 = arg6.method3617(0, arg0, 100, (class458[]) null);
            int var20 = arg6.method3625(100, arg0, -1, (class458[]) null, 0);
            int var21 = var17 - var19 / 2;
            if (-arg5.field5035 <= var21 && arg5.field5035 >= var21 && ~(-arg5.field4958) >= ~var18 && ~arg5.field4958 <= ~var18) {
                arg11.method1127(arg8, arg5.field4958 / 2 + arg7 + -var18 - var20 + -arg1, 0, arg2, arg7, 0, 50, 1, arg5.field5035 / 2 + var21 - -arg8, arg3, 0, arg0, var19, (class458[]) null, arg10, (int[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I", line = 50)
    public final int[] method122(int arg0, int arg1) {
        ++field7467;
        int[] var3 = super.field9466.method1811(arg1, 11);
        if (arg0 >= -21) {
            method2971(81);
        }
        if (super.field9466.field4172) {
            this.method2969(super.field9466.method1806(true), 67);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([[II)V", line = 72)
    private final void method2969(int[][] arg0, int arg1) {
        if (arg1 > 66) {
            ++field7459;
            int var3 = class501.field7222;
            int var4 = class567.field8041;
            class236.method1369(true, arg0);
            class24.method115(class515.field7357, 0, (byte) 107, class507.field7299, 0);
            if (this.field7466 != null) {
                for (int var5 = 0; ~this.field7466.length < ~var5; ++var5) {
                    class429 var6 = this.field7466[var5];
                    int var7 = var6.field5686;
                    int var8 = var6.field5688;
                    if (var7 < 0) {
                        if (~var8 <= -1) {
                            var6.method55(var3, var4, (byte) 119);
                        }
                    } else if (~var8 <= -1) {
                        var6.method57(var3, (byte) -122, var4);
                    } else {
                        var6.method54(var3, (byte) 104, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V", line = 122)
    public class521() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V", line = 127)
    public static final void method2970(int arg0, int arg1) {
        if (arg0 != 256) {
            method2971(78);
        }
        ++field7463;
        class557.field7950 = arg1;
        class358.field4702.method3687((byte) -10);
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)V", line = 141)
    public static void method2971(int arg0) {
        if (arg0 <= 83) {
            method2968((String) null, 97, (class213) null, 9, -123, (class382) null, (class645) null, 46, -108, -68, false, (class195) null);
        }
        field7461 = null;
        field7470 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[[I", line = 152)
    public final int[][] method1251(int arg0, byte arg1) {
        if (arg1 != 98) {
            this.field7466 = null;
        }
        ++field7462;
        int[][] var3 = super.field9471.method3639(96, arg0);
        if (super.field9471.field9180) {
            int var4 = class501.field7222;
            int var5 = class567.field8041;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field9471.method3642((byte) -97);
            this.method2969(var6, 118);
            for (int var8 = 0; class567.field8041 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class501.field7222; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class203.method1246(var15 << 4, 4080);
                    var12[var14] = class203.method1246(var15, 65280) >> 4;
                    var11[var14] = class203.method1246(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)V", line = 216)
    public static final void method2972(int arg0) {
        if (arg0 > -98) {
            field7469 = 44;
        }
        ++field7465;
        for (int var1 = 0; var1 < class479.field7037; ++var1) {
            class561 var2 = class259.field3301[var1];
            boolean var3 = false;
            if (var2.field7969 != null) {
                if (!var2.field7969.method1520(-19)) {
                    var3 = true;
                }
            } else {
                --var2.field7977;
                if (var2.field7977 >= (!var2.method3160(false) ? -10 : -1500)) {
                    if (var2.field7979 == 1 && var2.field7975 == null) {
                        var2.field7975 = class34.method187(class581.field8259, var2.field7974, 0);
                        if (var2.field7975 == null) {
                            continue;
                        }
                        var2.field7977 += var2.field7975.method189();
                    } else if (var2.method3160(false) && (var2.field7973 == null || var2.field7976 == null)) {
                        if (var2.field7973 == null) {
                            var2.field7973 = class297.method1689(class194.field2332, var2.field7974);
                        }
                        if (var2.field7973 == null) {
                            continue;
                        }
                        if (var2.field7976 == null) {
                            var2.field7976 = var2.field7973.method1690(new int[] { 22050 });
                            if (var2.field7976 == null) {
                                continue;
                            }
                        }
                    }
                    if (~var2.field7977 > -1) {
                        int var4;
                        if (var2.field7972 == 0) {
                            var4 = var2.field7970 * (var2.field7979 == 3 ? class601.field8530.field2875 : class601.field8530.field2841) >> 8;
                        } else {
                            int var5 = var2.field7972 >> 24 & 3;
                            if (class377.field4914.field4638 != var5) {
                                var4 = 0;
                            } else {
                                int var6 = var2.field7972 << 9 & 130560;
                                int var7 = var2.field7972 >> 16 & 255;
                                int var8 = (var7 << 9) + 256 + -class377.field4914.field4641;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field7972 >> 8 & 255;
                                int var10 = (var9 << 9) + -class377.field4914.field4647 + 256;
                                if (~var10 > -1) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + -512 + var10;
                                if (var6 < var11) {
                                    var2.field7977 = -99999;
                                    continue;
                                }
                                if (~var11 > -1) {
                                    var11 = 0;
                                }
                                var4 = (var6 - var11) * class601.field8530.field2877 * var2.field7970 / var6 >> 8;
                            }
                        }
                        if (~var4 < -1) {
                            class298 var12 = null;
                            if (var2.field7979 == 1) {
                                var12 = var2.field7975.method186().method1691(class607.field8572);
                            } else if (var2.method3160(false)) {
                                var12 = var2.field7976;
                            }
                            class159 var13 = var2.field7969 = class159.method928(var12, 100, var4);
                            var13.method941(var2.field7967 + -1);
                            class424.field5641.method2847(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            }
            if (var3) {
                --class479.field7037;
                for (int var14 = var1; class479.field7037 > var14; ++var14) {
                    class259.field3301[var14] = class259.field3301[var14 + 1];
                }
                --var1;
            }
        }
        if (class548.field7834 && !class210.method1265(0)) {
            if (class601.field8530.field2866 != 0 && ~class80.field832 != 0) {
                class613.method3424(68, class403.field5364, false, 0, class601.field8530.field2866, class80.field832);
            }
            class548.field7834 = false;
        } else if (class601.field8530.field2866 != 0 && class80.field832 != -1 && !class210.method1265(0)) {
            ++class9.field93;
            class480.method2802(class92.field1048, 16751);
            class334.field4314.method2554(class80.field832, 255);
            class80.field832 = -1;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILiaa;Z)V", line = 390)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (arg2) {
            ++field7468;
            if (~arg0 != -1) {
                if (~arg0 == -2) {
                    super.field9465 = arg1.method2541(77) == 1;
                    return;
                }
            } else {
                this.field7466 = new class429[arg1.method2541(48)];
                for (int var4 = 0; ~this.field7466.length < ~var4; ++var4) {
                    int var5 = arg1.method2541(33);
                    if (var5 != 0) {
                        if (~var5 != -2) {
                            if (var5 != 2) {
                                if (~var5 == -4) {
                                    this.field7466[var4] = class163.method992(arg1, (byte) -45);
                                }
                            } else {
                                this.field7466[var4] = class376.method2065(arg1, -8);
                            }
                        } else {
                            this.field7466[var4] = class555.method3129(-27077, arg1);
                        }
                    } else {
                        this.field7466[var4] = class21.method84((byte) -117, arg1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)Z", line = 465)
    public static final boolean method2973(int arg0, int arg1) {
        if (arg0 != 7) {
            field7469 = -26;
        }
        ++field7458;
        return arg1 == 7 || ~arg1 == -9 || arg1 == 9;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Z", line = 477)
    public static final boolean method2974(byte arg0, int arg1) {
        if (arg0 < 78) {
            return false;
        } else {
            ++field7460;
            return ~arg1 == -4 || arg1 == 5 || ~arg1 == -7;
        }
    }
}
