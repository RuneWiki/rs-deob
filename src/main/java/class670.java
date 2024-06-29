import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class670 extends class497 {

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field9432;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[I")
    public static int[] field9423;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILil;I)V")
    public final void method158(int arg0, class7 arg1, int arg2) {
        super.field6867.method1653((byte) 104, arg1);
        if (arg0 != 9) {
            field9427 = 93;
        }
        ++field9433;
        super.field6867.method1589(-4, arg2);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
    public final void method162(int arg0, int arg1, int arg2) {
        if (arg0 < 122) {
            field9425 = 98;
        }
        ++field9428;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ldfa;B)V")
    public static final void method3726(class176 arg0, byte arg1) {
        arg0.field2347 = null;
        ++field9424;
        int var2 = arg0.field2345.length;
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            arg0.field2345[var3].field6126 = false;
        }
        class15[] var4 = class90.field1244;
        synchronized (class90.field1244) {
            if (arg1 < 58) {
                method3726((class176) null, (byte) -71);
            }
            if (~var2 > ~class90.field1244.length && ~class303.field4362[var2] > -201) {
                class90.field1244[var2].method106(arg0, (byte) 119);
                int var10002 = class303.field4362[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
    public final void method161(int arg0) {
        if (arg0 == -1756) {
            super.field6867.method1632(false, false);
            ++field9422;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(ZZ)V")
    public final void method163(boolean arg0, boolean arg1) {
        super.field6867.method1632(true, arg1);
        ++field9426;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
    public final void method164(int arg0, boolean arg1) {
        ++field9432;
        if (arg0 != 0) {
            field9425 = -41;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Z")
    public final boolean method157(int arg0) {
        if (arg0 != -6808) {
            this.method164(119, false);
        }
        ++field9431;
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public static void method3727(int arg0) {
        if (arg0 != 2) {
            field9427 = 120;
        }
        field9423 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lha;ILor;II)V")
    public static final void method3728(class65 arg0, int arg1, class668 arg2, int arg3, int arg4) {
        ++field9429;
        class514 var5 = arg2.method3697(arg4 ^ arg4, arg0);
        if (var5 != null) {
            arg0.method456(arg1, arg3, arg2.field9282 + arg1, arg3 - -arg2.field9297);
            if (class227.field3104 != 2 && ~class227.field3104 != -6 && class267.field3939 != null) {
                int var6;
                int var7;
                int var8;
                int var9;
                if (~class502.field6938 == -5) {
                    var6 = class500.field6902;
                    var7 = 4096;
                    var8 = class734.field10175;
                    var9 = (int) (-class135.field1974) & 16383;
                } else {
                    var8 = class551.field7456.field2259;
                    var6 = class551.field7456.field2257;
                    var7 = 4096 - class299.field4334 * 16;
                    var9 = 16383 & (int) (-class135.field1974) + class594.field8116;
                }
                int var10 = var6 / 128 + -((class597.field8132 - 104) * 2) + 48;
                int var11 = -(var8 / 128) + 48 - (-(class628.field8800 * 4) - -((class628.field8800 + -104) * 2));
                class267.field3939.method1103((float) arg2.field9282 / 2.0F + (float) arg1, (float) arg2.field9297 / 2.0F + (float) arg3, (float) var10, (float) var11, var7, var9 << 2, var5, arg1, arg3);
                for (class119 var12 = (class119) class234.field3170.method2551((byte) -108); var12 != null; var12 = (class119) class234.field3170.method2542(-121)) {
                    int var58 = var12.field1725;
                    int var59 = ((class217.field2906.field7065[var58] & 268424898) >> 14) + -class121.field1765;
                    int var60 = (16383 & class217.field2906.field7065[var58]) - class230.field3147;
                    int var61 = var59 * 4 - -2 - var6 / 128;
                    int var62 = var60 * 4 + 2 + -(var8 / 128);
                    class450.method2687(arg4 + 245, var61, var5, arg0, var62, arg3, arg2, arg1, class217.field2906.field7066[var58]);
                }
                for (int var13 = 0; class747.field10302 > var13; ++var13) {
                    int var55 = class126.field1901[var13] * 4 - -2 + -(var6 / 128);
                    int var56 = class775.field10670[var13] * 4 + -(var8 / 128) + 2;
                    class589 var57 = class350.field5132.method3732((byte) 95, class788.field10850[var13]);
                    if (var57.field7865 != null) {
                        var57 = var57.method3290(1, class382.field5602);
                        if (var57 == null || ~var57.field7878 == 0) {
                            continue;
                        }
                    }
                    class450.method2687(255, var55, var5, arg0, var56, arg3, arg2, arg1, var57.field7878);
                }
                for (class193 var14 = (class193) class558.field7516.method3960(0); var14 != null; var14 = (class193) class558.field7516.method3955((byte) 105)) {
                    int var50 = (int) (var14.field1409 >> 28 & 3L);
                    if (~class170.field2272 == ~var50) {
                        int var51 = (int) (var14.field1409 & 16383L) + -class121.field1765;
                        int var52 = (int) (16383L & var14.field1409 >> 14) + -class230.field3147;
                        int var53 = var51 * 4 + 2 + -(var6 / 128);
                        int var54 = var52 * 4 + 2 + -(var8 / 128);
                        class546.method3105(var53, var54, arg3, arg2, var5, class370.field5368[0], arg1, arg4 ^ 8);
                    }
                }
                for (int var15 = 0; class688.field9678 > var15; ++var15) {
                    class174 var45 = (class174) class234.field3169.method3953((long) class382.field5588[var15], 14);
                    if (var45 != null) {
                        class192 var46 = var45.field2336;
                        if (var46.method1322(arg4 + -11) && class551.field7456.field2250 == var46.field2250) {
                            class220 var47 = var46.field2577;
                            if (var47 != null && var47.field2995 != null) {
                                var47 = var47.method1449(class382.field5602, -1);
                            }
                            if (var47 != null && var47.field2982 && var47.field2958) {
                                int var48 = var46.field2257 / 128 + -(var6 / 128);
                                int var49 = var46.field2259 / 128 - var8 / 128;
                                if (~var47.field2954 == 0) {
                                    class546.method3105(var48, var49, arg3, arg2, var5, class370.field5368[1], arg1, 2);
                                } else {
                                    class450.method2687(arg4 ^ 245, var48, var5, arg0, var49, arg3, arg2, arg1, var47.field2954);
                                }
                            }
                        }
                    }
                }
                int var16 = class571.field7608;
                int[] var17 = class79.field1136;
                for (int var18 = 0; ~var18 > ~var16; ++var18) {
                    class73 var37 = class599.field8149[var17[var18]];
                    if (var37 != null && var37.method648(-1) && !var37.field1039 && class551.field7456 != var37 && ~class551.field7456.field2250 == ~var37.field2250) {
                        int var38 = var37.field2257 / 128 + -(var6 / 128);
                        int var39 = var37.field2259 / 128 + -(var8 / 128);
                        boolean var40 = false;
                        for (int var41 = 0; var41 < class671.field9452; ++var41) {
                            if (var37.field1020.equals(class42.field653[var41]) && ~class65.field924[var41] != -1) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; ~var43 > ~class587.field7825; ++var43) {
                            if (var37.field1020.equals(class39.field598[var43].field8289)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (~class551.field7456.field1058 != -1 && var37.field1058 != 0 && class551.field7456.field1058 == var37.field1058) {
                            var44 = true;
                        }
                        if (var37.field1046) {
                            class546.method3105(var38, var39, arg3, arg2, var5, class370.field5368[6], arg1, 2);
                        } else if (var44) {
                            class546.method3105(var38, var39, arg3, arg2, var5, class370.field5368[4], arg1, arg4 ^ 8);
                        } else if (var37.field1052) {
                            class546.method3105(var38, var39, arg3, arg2, var5, class370.field5368[7], arg1, arg4 + -8);
                        } else if (var40) {
                            class546.method3105(var38, var39, arg3, arg2, var5, class370.field5368[3], arg1, arg4 + -8);
                        } else if (var42) {
                            class546.method3105(var38, var39, arg3, arg2, var5, class370.field5368[5], arg1, 2);
                        } else {
                            class546.method3105(var38, var39, arg3, arg2, var5, class370.field5368[2], arg1, 2);
                        }
                    }
                }
                class553[] var19 = class581.field7771;
                for (int var20 = 0; var20 < var19.length; ++var20) {
                    class553 var23 = var19[var20];
                    if (var23 != null && ~var23.field7465 != -1 && ~(class100.field1401 % 20) > -11) {
                        if (~var23.field7465 == -2) {
                            class174 var24 = (class174) class234.field3169.method3953((long) var23.field7467, 14);
                            if (var24 != null) {
                                class192 var25 = var24.field2336;
                                int var26 = var25.field2257 / 128 - var6 / 128;
                                int var27 = var25.field2259 / 128 + -(var8 / 128);
                                class498.method2878(arg2, arg3, 360000L, (byte) 115, var26, var23.field7468, arg1, var5, var27);
                            }
                        }
                        if (var23.field7465 == 2) {
                            int var28 = var23.field7469 / 128 + -(var6 / 128);
                            int var29 = var23.field7464 / 128 + -(var8 / 128);
                            long var30 = (long) (var23.field7461 << 7);
                            long var32 = var30 * var30;
                            class498.method2878(arg2, arg3, var32, (byte) 115, var28, var23.field7468, arg1, var5, var29);
                        }
                        if (var23.field7465 == 10 && var23.field7467 >= 0 && ~class599.field8149.length < ~var23.field7467) {
                            class73 var34 = class599.field8149[var23.field7467];
                            if (var34 != null) {
                                int var35 = var34.field2257 / 128 + -(var6 / 128);
                                int var36 = var34.field2259 / 128 - var8 / 128;
                                class498.method2878(arg2, arg3, 360000L, (byte) 115, var35, var23.field7468, arg1, var5, var36);
                            }
                        }
                    }
                }
                if (class502.field6938 != 4) {
                    if (class779.field10689 != 0) {
                        int var21 = -(var6 / 128) + (class779.field10689 * 4 - 2 + 2 - -(class551.field7456.method655(-128) * 2));
                        int var22 = 2 + class692.field9714 * 4 - var8 / 128 + 2 * (class551.field7456.method655(-125) + -1);
                        class546.method3105(var21, var22, arg3, arg2, var5, class493.field6829[class768.field10595 ? 1 : 0], arg1, arg4 ^ 8);
                    }
                    if (!class551.field7456.field1039) {
                        arg0.method462(-5, 3, arg3 - (-(arg2.field9297 / 2) + 1), 3, arg1 - -(arg2.field9282 / 2) + -1, -1);
                        return;
                    }
                }
            } else {
                arg0.method518(-16777216, var5, arg1, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Ldia;)V")
    public class670(class246 arg0) {
        super(arg0);
    }
}
