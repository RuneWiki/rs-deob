import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class376 extends class40 {

    @OriginalMember(owner = "client!tq", name = "W", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!tq", name = "R", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!tq", name = "S", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!tq", name = "U", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "Lvj;")
    public static class256 field5351;

    @OriginalMember(owner = "client!tq", name = "V", descriptor = "[I")
    public static int[] field5361;

    @OriginalMember(owner = "client!tq", name = "Q", descriptor = "[Lvj;")
    public static class256[] field5356;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(III)V")
    private final void method2397(int arg0, int arg1, int arg2) {
        int var4 = -71 % ((arg2 - 7) / 44);
        ++field5357;
        int var5 = class9.field124[arg0];
        int var6 = class86.field1123[arg1];
        float var7 = (float) Math.atan2((double) (var5 + -2048), (double) (var6 + -2048));
        if ((double) var7 >= -3.141592653589793D && (double) var7 <= -2.356194490192345D) {
            class142.field2145 = arg1;
            class13.field202 = arg0;
        } else if ((double) var7 <= -1.5707963267948966D && (double) var7 >= -2.356194490192345D) {
            class13.field202 = arg1;
            class142.field2145 = arg0;
        } else if ((double) var7 <= -0.7853981633974483D && (double) var7 >= -1.5707963267948966D) {
            class142.field2145 = arg0;
            class13.field202 = -arg1 + class410.field5886;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class13.field202 = arg0;
            class142.field2145 = -arg1 + class440.field6297;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class142.field2145 = -arg1 + class440.field6297;
            class13.field202 = -arg0 + class410.field5886;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class13.field202 = -arg1 + class410.field5886;
            class142.field2145 = -arg0 + class440.field6297;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class142.field2145 = class440.field6297 - arg0;
            class13.field202 = arg1;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class142.field2145 = arg1;
            class13.field202 = -arg0 + class410.field5886;
        }
        class13.field202 &= class84.field1067;
        class142.field2145 &= class169.field2395;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method2398(int arg0, String arg1) {
        if (arg0 != 153949057) {
            return true;
        } else {
            ++field5353;
            return class289.method1968(5, true, arg1, 10);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IILlf;)V")
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field5359;
        if (arg1 < 79) {
            method2400(63);
        }
        if (~arg0 == -1) {
            super.field550 = ~arg2.method837(true) == -2;
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
    public class376() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)[[I")
    public final int[][] method112(int arg0, int arg1) {
        ++field5355;
        if (arg0 != 1) {
            field5356 = null;
        }
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class410.field5886; ++var7) {
                this.method2397(var7, arg1, -72);
                int[][] var8 = this.method261(0, 28552, class142.field2145);
                var4[var7] = var8[0][class13.field202];
                var5[var7] = var8[1][class13.field202];
                var6[var7] = var8[2][class13.field202];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method2399(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5350;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = -arg3 + arg1;
        int var12 = -arg3 + arg0;
        int var13 = arg1 * arg1;
        int var14 = arg0 * arg0;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 - -var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (-var22 + 1) * var15 + var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        if (arg2 < -112) {
            int var36 = (arg0 - 1) * var27;
            int var37 = var30;
            if (class245.field3659 <= arg6 && arg6 <= class240.field3547) {
                int[] var38 = class440.field6288[arg6];
                int var39 = class209.method1485(class231.field3415, 1667, class408.field5789, -arg1 + arg5);
                int var40 = class209.method1485(class231.field3415, 1667, class408.field5789, arg1 + arg5);
                int var41 = class209.method1485(class231.field3415, 1667, class408.field5789, arg5 - var11);
                int var42 = class209.method1485(class231.field3415, 1667, class408.field5789, arg5 + var11);
                class5.method17(var38, var41, arg4, (byte) 123, var39);
                class5.method17(var38, var42, arg7, (byte) 110, var41);
                class5.method17(var38, var40, arg4, (byte) 117, var42);
            }
            int var43 = (var12 + -1) * var29;
            while (~var9 < -1) {
                boolean var44 = var12 >= var9;
                if (~var23 > -1) {
                    while (~var23 > -1) {
                        var23 += var31;
                        var24 += var35;
                        var35 += var28;
                        ++var8;
                        var31 += var28;
                    }
                }
                if (var44) {
                    if (~var25 > -1) {
                        while (var25 < 0) {
                            var25 += var33;
                            var26 += var37;
                            var37 += var30;
                            ++var10;
                            var33 += var30;
                        }
                    }
                    if (var26 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        ++var10;
                        var37 += var30;
                    }
                    var25 += -var43;
                    var26 += -var34;
                    var43 -= var29;
                    var34 -= var29;
                }
                if (~var24 > -1) {
                    var23 += var31;
                    var24 += var35;
                    ++var8;
                    var31 += var28;
                    var35 += var28;
                }
                var24 += -var32;
                var23 += -var36;
                --var9;
                var36 -= var27;
                var32 -= var27;
                int var45 = -var9 + arg6;
                int var46 = arg6 + var9;
                if (~class245.field3659 >= ~var46 && ~var45 >= ~class240.field3547) {
                    int var47 = class209.method1485(class231.field3415, 1667, class408.field5789, arg5 + var8);
                    int var48 = class209.method1485(class231.field3415, 1667, class408.field5789, -var8 + arg5);
                    if (!var44) {
                        if (var45 >= class245.field3659) {
                            class5.method17(class440.field6288[var45], var47, arg4, (byte) 73, var48);
                        }
                        if (~class240.field3547 <= ~var46) {
                            class5.method17(class440.field6288[var46], var47, arg4, (byte) 81, var48);
                        }
                    } else {
                        int var49 = class209.method1485(class231.field3415, 1667, class408.field5789, arg5 - -var10);
                        int var50 = class209.method1485(class231.field3415, 1667, class408.field5789, arg5 - var10);
                        if (~var45 <= ~class245.field3659) {
                            int[] var51 = class440.field6288[var45];
                            class5.method17(var51, var50, arg4, (byte) 87, var48);
                            class5.method17(var51, var49, arg7, (byte) 124, var50);
                            class5.method17(var51, var47, arg4, (byte) 107, var49);
                        }
                        if (~var46 >= ~class240.field3547) {
                            int[] var52 = class440.field6288[var46];
                            class5.method17(var52, var50, arg4, (byte) 122, var48);
                            class5.method17(var52, var49, arg7, (byte) 97, var50);
                            class5.method17(var52, var47, arg4, (byte) 90, var49);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
    public static void method2400(int arg0) {
        if (arg0 != 0) {
            field5361 = null;
        }
        field5361 = null;
        field5351 = null;
        field5356 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)[I")
    public final int[] method44(byte arg0, int arg1) {
        ++field5358;
        if (arg0 >= -20) {
            this.method112(-63, 117);
        }
        int[] var3 = super.field551.method185(65280, arg1);
        if (super.field551.field441) {
            for (int var4 = 0; ~class410.field5886 < ~var4; ++var4) {
                this.method2397(var4, arg1, 110);
                int[] var5 = this.method266((byte) -116, class142.field2145, 0);
                var3[var4] = var5[class13.field202];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z[Ljava/lang/String;[S)V")
    public static final void method2401(boolean arg0, String[] arg1, short[] arg2) {
        ++field5352;
        if (arg0) {
            method2398(6, (String) null);
        }
        class96.method568(arg1.length + -1, arg2, 0, arg1, 0);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILpn;ILbi;ZLfa;II)V")
    public static final void method2402(int arg0, class446 arg1, int arg2, class282 arg3, boolean arg4, class128 arg5, int arg6, int arg7) {
        ++field5360;
        if (!arg4) {
            method2401(true, (String[]) null, (short[]) null);
        }
        class13 var8 = new class13();
        var8.field203 = arg2;
        var8.field181 = arg7 * 128;
        var8.field191 = arg0 * 128;
        if (arg3 == null) {
            if (arg1 == null) {
                if (arg5 != null) {
                    var8.field194 = arg5;
                    var8.field180 = (arg7 + arg5.method773((byte) 47)) * 128;
                    var8.field199 = (arg5.method773((byte) 52) + arg0) * 128;
                    var8.field188 = class6.method26(arg5, 9251);
                    var8.field192 = arg5.field1812;
                    var8.field195 = arg5.field1800 * 128;
                    class96.field1233.method1376(var8, (long) arg5.field4514, 67);
                    return;
                }
            } else {
                var8.field200 = arg1;
                class346 var11 = arg1.field6375;
                if (var11.field5023 != null) {
                    var8.field201 = true;
                    var11 = var11.method2273(-1);
                }
                if (var11 != null) {
                    var8.field199 = (arg0 - -var11.field5008) * 128;
                    var8.field180 = (var11.field5008 + arg7) * 128;
                    var8.field188 = class185.method1325((byte) -109, arg1);
                    var8.field195 = var11.field5026 * 128;
                    var8.field192 = var11.field4995;
                }
                class433.field6188.method2756(126, var8);
            }
        } else {
            var8.field182 = arg3;
            int var9 = arg3.field4090;
            int var10 = arg3.field4085;
            if (~arg6 == -2 || ~arg6 == -4) {
                var10 = arg3.field4090;
                var9 = arg3.field4085;
            }
            var8.field199 = (arg0 + var10) * 128;
            var8.field190 = arg3.field4035;
            var8.field180 = (arg7 + var9) * 128;
            var8.field192 = arg3.field4112;
            var8.field185 = arg3.field4106;
            var8.field188 = arg3.field4034;
            var8.field195 = arg3.field4110 * 128;
            var8.field193 = arg3.field4060;
            if (arg3.field4115 != null) {
                var8.field201 = true;
                var8.method71(arg4);
            }
            if (var8.field190 != null) {
                var8.field198 = (int) ((double) (var8.field185 - var8.field193) * Math.random()) + var8.field193;
            }
            class266.field3900.method2756(-62, var8);
        }
    }

    static {
        new class349("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
        field5362 = -1;
    }
}
