import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class121 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Ldc;")
    public static class37 field2160 = class185.method1233((byte) 86, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field2162 = 0;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "Ldc;")
    public static class37 field2166 = class185.method1233((byte) 86, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lji;")
    public static class106 field2167;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)I")
    public static final int method826(int arg0, boolean arg1) {
        field2163++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (!arg1) {
            field2160 = null;
        }
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method827(byte arg0) {
        field2160 = null;
        field2166 = null;
        int var1 = -47 / ((arg0 - 63) / 52);
        field2167 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLre;)V")
    public static final void method828(byte arg0, class190 arg1) {
        field2161++;
        if (arg1.field3461 == 0) {
            return;
        }
        if (arg1.field3517 != -1 && arg1.field3517 < 32768) {
            class66 var2 = class70.field1262[arg1.field3517];
            if (var2 != null) {
                int var3 = arg1.field3505 - var2.field3505;
                int var4 = arg1.field3490 - var2.field3490;
                if (var3 != 0 || var4 != 0) {
                    arg1.field3513 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3517 >= 32768) {
            int var5 = arg1.field3517 - 32768;
            if (class75.field1324 == var5) {
                var5 = 2047;
            }
            class123 var6 = class8.field107[var5];
            if (var6 != null) {
                int var7 = arg1.field3505 - var6.field3505;
                int var8 = arg1.field3490 - var6.field3490;
                if (var7 != 0 || var8 != 0) {
                    arg1.field3513 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field3479 != 0 || arg1.field3523 != 0) && (arg1.field3491 == 0 || arg1.field3463 > 0)) {
            int var9 = arg1.field3499 * 64 + arg1.field3505 - (-class99.field1735 + arg1.field3479 + -class99.field1735) * 64 - 64;
            int var10 = arg1.field3499 * 64 + arg1.field3490 - (arg1.field3523 - class124.field2212 - class124.field2212) * 64 - 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field3513 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field3523 = 0;
            arg1.field3479 = 0;
        }
        if (arg0 >= -36) {
            field2167 = null;
        }
        int var11 = arg1.field3513 - arg1.field3511 & 0x7FF;
        if (var11 == 0) {
            arg1.field3475 = 0;
            return;
        }
        arg1.field3475++;
        if (var11 <= 1024) {
            arg1.field3511 += arg1.field3461;
            boolean var12 = true;
            if (arg1.field3461 > var11 || var11 > 2048 - arg1.field3461) {
                var12 = false;
                arg1.field3511 = arg1.field3513;
            }
            if (arg1.field3466 == arg1.field3465 && (arg1.field3475 > 25 || var12)) {
                if (arg1.field3522 == -1) {
                    arg1.field3465 = arg1.field3472;
                } else {
                    arg1.field3465 = arg1.field3522;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field3511 -= arg1.field3461;
            if (var11 < arg1.field3461 || 2048 - arg1.field3461 < var11) {
                var13 = false;
                arg1.field3511 = arg1.field3513;
            }
            if (arg1.field3466 == arg1.field3465 && (arg1.field3475 > 25 || var13)) {
                if (arg1.field3484 == -1) {
                    arg1.field3465 = arg1.field3472;
                } else {
                    arg1.field3465 = arg1.field3484;
                }
            }
        }
        arg1.field3511 &= 0x7FF;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIII)V")
    public static final void method829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2170++;
        int var6 = arg1;
        int var7 = 0;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var9 + var11;
        int var14 = ((arg1 << 1) - 3) * var10;
        if (arg0 >= class198.field3697 && class199.field3712 >= arg0) {
            int var15 = class196.method1308(arg4 + 81, class29.field536, arg3 + arg5, class82.field1458);
            int var16 = class196.method1308(88, class29.field536, arg3 - arg5, class82.field1458);
            class29.method242(var15, (byte) -30, arg2, class11.field156[arg0], var16);
        }
        int var17 = ((var7 << 1) + arg4) * var11;
        int var18 = var9 << 2;
        int var19 = var8 << 2;
        int var20 = (arg1 - 1) * var18;
        int var21 = (var7 + 1) * var19;
        int var22 = var8 - (var12 - 1) * var10;
        while (var6 > 0) {
            var6--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var22 += var21;
                    var7++;
                    var17 += var19;
                    var21 += var19;
                }
            }
            int var23 = arg0 - var6;
            if (var22 < 0) {
                var13 += var17;
                var7++;
                var22 += var21;
                var21 += var19;
                var17 += var19;
            }
            var13 += -var20;
            var22 += -var14;
            int var24 = arg0 + var6;
            var14 -= var18;
            if (var24 >= class198.field3697 && var23 <= class199.field3712) {
                int var25 = class196.method1308(arg4 ^ 0x39, class29.field536, arg3 + var7, class82.field1458);
                int var26 = class196.method1308(65, class29.field536, arg3 - var7, class82.field1458);
                if (var23 >= class198.field3697) {
                    class29.method242(var25, (byte) -30, arg2, class11.field156[var23], var26);
                }
                if (var24 <= class199.field3712) {
                    class29.method242(var25, (byte) -30, arg2, class11.field156[var24], var26);
                }
            }
            var20 -= var18;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method830(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2168++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg4 - arg3;
        int var12 = arg7 - arg3;
        int var13 = arg7 * arg7;
        int var14 = var12 * var12;
        int var15 = var11 * var11;
        int var16 = arg4 * arg4;
        int var17 = var13 << 1;
        if (!arg1) {
            field2166 = null;
        }
        int var18 = var16 << 1;
        int var19 = var14 << 1;
        int var20 = arg7 << 1;
        int var21 = (1 - var20) * var16 + var17;
        int var22 = var15 << 1;
        int var23 = var12 << 1;
        int var24 = (1 - var23) * var15 + var19;
        int var25 = var14 - (var23 - 1) * var22;
        int var26 = var13 - (var20 - 1) * var18;
        int var27 = var16 << 2;
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var14 << 2;
        int var31 = var17 * 3;
        int var32 = (var20 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var23 - 3) * var22;
        int var35 = var30;
        int var36 = (arg7 - 1) * var27;
        int var37 = var28;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class11.field156[arg5];
        class29.method242(arg2 - var11, (byte) -30, arg0, var39, arg2 - arg4);
        class29.method242(arg2 + var11, (byte) -30, arg6, var39, arg2 - var11);
        class29.method242(arg2 + arg4, (byte) -30, arg0, var39, arg2 + var11);
        while (var9 > 0) {
            if (var21 < 0) {
                while (var21 < 0) {
                    var8++;
                    var21 += var31;
                    var31 += var28;
                    var26 += var37;
                    var37 += var28;
                }
            }
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var10++;
                        var24 += var33;
                        var25 += var35;
                        var33 += var30;
                        var35 += var30;
                    }
                }
                if (var25 < 0) {
                    var10++;
                    var25 += var35;
                    var24 += var33;
                    var35 += var30;
                    var33 += var30;
                }
                var25 += -var34;
                var34 -= var29;
                var24 += -var38;
                var38 -= var29;
            }
            if (var26 < 0) {
                var8++;
                var26 += var37;
                var21 += var31;
                var31 += var28;
                var37 += var28;
            }
            int var41 = arg2 + var8;
            var9--;
            int var42 = arg2 - var8;
            int var43 = arg5 - var9;
            int var44 = arg5 + var9;
            if (var40) {
                int var45 = arg2 - var10;
                int var46 = arg2 + var10;
                class29.method242(var45, (byte) -30, arg0, class11.field156[var43], var42);
                class29.method242(var46, (byte) -30, arg6, class11.field156[var43], var45);
                class29.method242(var41, (byte) -30, arg0, class11.field156[var43], var46);
                class29.method242(var45, (byte) -30, arg0, class11.field156[var44], var42);
                class29.method242(var46, (byte) -30, arg6, class11.field156[var44], var45);
                class29.method242(var41, (byte) -30, arg0, class11.field156[var44], var46);
            } else {
                class29.method242(var41, (byte) -30, arg0, class11.field156[var43], var42);
                class29.method242(var41, (byte) -30, arg0, class11.field156[var44], var42);
            }
            var26 += -var32;
            var32 -= var27;
            var21 += -var36;
            var36 -= var27;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIII)V")
    public static final void method831(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2169++;
        if (arg0) {
            return;
        }
        if (arg2 < arg3) {
            class29.method242(arg3, (byte) -30, arg1, class11.field156[arg4], arg2);
        } else {
            class29.method242(arg2, (byte) -30, arg1, class11.field156[arg4], arg3);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method832(int arg0) {
        field2164++;
        if (class77.field1359 > 1) {
            class77.field1359--;
            class198.field3693 = class112.field1963;
        }
        if (class195.field3650 > 0) {
            class195.field3650--;
        }
        if (class41.field846) {
            class41.field846 = false;
            class101.method665(-35);
            return;
        }
        for (int var1 = 0; var1 < 100 && class174.method1176(-51); var1++) {
        }
        if (class109.field1891 != 30) {
            return;
        }
        class7.method50(class49.field970, 120, (byte) 35);
        Object var2 = class245.field4476.field4086;
        synchronized (class245.field4476.field4086) {
            if (!class193.field3603) {
                class245.field4476.field4092 = 0;
            } else if (class97.field1698 != 0 || class245.field4476.field4092 >= 40) {
                class49.field970.method1503(43, 2976);
                class89.field1550++;
                class49.field970.method214((byte) 104, 0);
                int var3 = class49.field970.field526;
                int var4 = 0;
                for (int var5 = 0; var5 < class245.field4476.field4092 && class49.field970.field526 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class245.field4476.field4094[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class245.field4476.field4091[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class245.field4476.field4094[var5] == -1 && class245.field4476.field4091[var5] == -1) {
                        var8 = 524287;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class153.field2912 != var7 || class209.field3925 != var6) {
                        int var9 = var7 - class153.field2912;
                        int var10 = var6 - class209.field3925;
                        class153.field2912 = var7;
                        class209.field3925 = var6;
                        if (class152.field2872 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class49.field970.method197((class152.field2872 << 12) + (var9 << 6) + var10, (byte) 51);
                            class152.field2872 = 0;
                        } else if (class152.field2872 < 8) {
                            class49.field970.method211(-483923896, (class152.field2872 << 19) + var8 + 8388608);
                            class152.field2872 = 0;
                        } else {
                            class49.field970.method183((class152.field2872 << 19) + var8 - 1073741824, arg0 + 852610674);
                            class152.field2872 = 0;
                        }
                    } else if (class152.field2872 < 2047) {
                        class152.field2872++;
                    }
                }
                class49.field970.method231((byte) 21, class49.field970.field526 - var3);
                if (var4 >= class245.field4476.field4092) {
                    class245.field4476.field4092 = 0;
                } else {
                    class245.field4476.field4092 -= var4;
                    for (int var11 = 0; var11 < class245.field4476.field4092; var11++) {
                        class245.field4476.field4091[var11] = class245.field4476.field4091[var4 + var11];
                        class245.field4476.field4094[var11] = class245.field4476.field4094[var11 + var4];
                    }
                }
            }
        }
        if (class97.field1698 != 0) {
            class204.field3777++;
            long var12 = (class139.field2702 - class19.field319) / 50L;
            class19.field319 = class139.field2702;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            int var14 = class205.field3805;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 764) {
                var14 = 764;
            }
            int var15 = class200.field3745;
            byte var16 = 0;
            if (class97.field1698 == 2) {
                var16 = 1;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var17 = (int) var12;
            class49.field970.method1503(192, arg0 + 1990508026);
            int var18 = var15 * 765 + var14;
            class49.field970.method193((byte) -75, (var16 << 19) + ((var17 << 20) + var18));
        }
        if (class229.field4204[96] || class229.field4204[97] || class229.field4204[98] || class229.field4204[99]) {
            class244.field4474 = true;
        }
        if (class9.field125 > 0) {
            class9.field125--;
        }
        if (class244.field4474 && class9.field125 <= 0) {
            class13.field176++;
            class244.field4474 = false;
            class9.field125 = 20;
            class49.field970.method1503(183, 2976);
            class49.field970.method197(class242.field4445, (byte) 51);
            class49.field970.method181(class82.field1454, -1371695448);
        }
        if (class224.field4155 && !class9.field120) {
            class9.field120 = true;
            class138.field2688++;
            class49.field970.method1503(32, 2976);
            class49.field970.method214((byte) 111, 1);
        }
        if (!class224.field4155 && class9.field120) {
            class9.field120 = false;
            class49.field970.method1503(32, 2976);
            class49.field970.method214((byte) 111, 0);
            class138.field2688++;
        }
        class5.method38(arg0 ^ 0x76A4B231);
        if (class109.field1891 != 30) {
            return;
        }
        class183.method1227(30797);
        class20.method135(125);
        class135.field2502++;
        if (class135.field2502 > 750) {
            class101.method665(122);
            return;
        }
        class115.method805((byte) -102);
        class174.method1177(arg0 + 1990505144);
        class11.method74(0);
        if (class139.field2694 != null) {
            class41.method362((byte) -124);
        }
        class201.field3749++;
        if (class49.field981 != 0) {
            class115.field2060 += 20;
            if (class115.field2060 >= 400) {
                class49.field981 = 0;
            }
        }
        if (class72.field1282 != null) {
            class243.field4453++;
            if (class243.field4453 >= 15) {
                class210.method1395((byte) 29, class72.field1282);
                class72.field1282 = null;
            }
        }
        if (class115.field2052 != null) {
            class210.method1395((byte) 29, class115.field2052);
            class236.field4298++;
            if (class166.field3180 + 5 < class80.field1416 || class80.field1416 < class166.field3180 - 5 || class235.field4271 > class243.field4463 + 5 || class243.field4463 - 5 > class235.field4271) {
                class217.field4059 = true;
            }
            if (class20.field334 == 0) {
                if (class217.field4059 && class236.field4298 >= 5) {
                    if (class217.field4054 == class115.field2052 && class204.field3790 != class109.field1896) {
                        class158.field2998++;
                        byte var19 = 0;
                        class136 var20 = class115.field2052;
                        if (class168.field3201 == 1 && var20.field2659 == 206) {
                            var19 = 1;
                        }
                        if (var20.field2538[class109.field1896] <= 0) {
                            var19 = 0;
                        }
                        if (class18.method122(class107.method699(var20, 51), -128)) {
                            int var21 = class204.field3790;
                            int var22 = class109.field1896;
                            var20.field2538[var22] = var20.field2538[var21];
                            var20.field2657[var22] = var20.field2657[var21];
                            var20.field2538[var21] = -1;
                            var20.field2657[var21] = 0;
                        } else if (var19 == 1) {
                            int var23 = class109.field1896;
                            int var24 = class204.field3790;
                            while (var23 != var24) {
                                if (var23 < var24) {
                                    var20.method943(arg0 + 1990505087, var24 + -1, var24);
                                    var24--;
                                } else if (var24 < var23) {
                                    var20.method943(108, var24 + 1, var24);
                                    var24++;
                                }
                            }
                        } else {
                            var20.method943(12, class109.field1896, class204.field3790);
                        }
                        class49.field970.method1503(178, 2976);
                        class49.field970.method197(class204.field3790, (byte) 51);
                        class49.field970.method199(class115.field2052.field2608, (byte) 66);
                        class49.field970.method214((byte) 109, var19);
                        class49.field970.method181(class109.field1896, -1371695448);
                    }
                } else if ((class215.field4009 == 1 || class209.method1390((byte) 113, class97.field1701 - 1)) && class97.field1701 > 2) {
                    class85.method577(false);
                } else if (class97.field1701 > 0) {
                    class156.method1057((byte) -82, class97.field1701 - 1);
                }
                class97.field1698 = 0;
                class115.field2052 = null;
                class243.field4453 = 10;
            }
        }
        class190.field3480 = 0;
        class245.field4479 = false;
        if (arg0 != -1990505050) {
            method829(-112, 7, -103, -128, -62, 62);
        }
        class200.field3741 = null;
        class163.field3100 = false;
        class136 var25 = class99.field1736;
        class99.field1736 = null;
        class136 var26 = class212.field3964;
        class212.field3964 = null;
        while (class44.method388(arg0 ^ 0x895B2C10) && class190.field3480 < 128) {
            class51.field1033[class190.field3480] = class198.field3700;
            class39.field815[class190.field3480] = class118.field2107;
            class190.field3480++;
        }
        class139.field2694 = null;
        if (class149.field2828 != -1) {
            class61.method459(class115.field2063, class149.field2828, 0, arg0 ^ 0x895B4DC2, 0, 0, 0, class103.field1770);
        }
        class112.field1963++;
        while (true) {
            class51 var27;
            class136 var28;
            class136 var29;
            do {
                var27 = (class51) class25.field432.method1337(116);
                if (var27 == null) {
                    while (true) {
                        class51 var30;
                        class136 var31;
                        class136 var32;
                        do {
                            var30 = (class51) class13.field186.method1337(arg0 ^ 0x76A4B20B);
                            if (var30 == null) {
                                while (true) {
                                    class51 var33;
                                    class136 var34;
                                    class136 var35;
                                    do {
                                        var33 = (class51) class63.field1154.method1337(-75);
                                        if (var33 == null) {
                                            if (class29.field544 && class139.field2694 == null) {
                                                class29.field544 = false;
                                            }
                                            if (class56.field1073 != null) {
                                                class37.method302((byte) 29);
                                            }
                                            if (class110.field1920 != -1) {
                                                int var36 = class110.field1920;
                                                int var37 = class112.field1969;
                                                boolean var38 = class14.method91(0, var37, 0, var36, true, false, 0, 0, class238.field4382.field3494[0], 0, class238.field4382.field3525[0], 0);
                                                if (var38) {
                                                    class49.field981 = 1;
                                                    class128.field2412 = class200.field3745;
                                                    class115.field2060 = 0;
                                                    class161.field3035 = class205.field3805;
                                                }
                                                class110.field1920 = -1;
                                            }
                                            class68.method493(false);
                                            if (class99.field1736 != var25) {
                                                if (var25 != null) {
                                                    class210.method1395((byte) 29, var25);
                                                }
                                                if (class99.field1736 != null) {
                                                    class210.method1395((byte) 29, class99.field1736);
                                                }
                                            }
                                            if (class212.field3964 != var26 && class238.field4381 == class129.field2424) {
                                                if (var26 != null) {
                                                    class210.method1395((byte) 29, var26);
                                                }
                                                if (class212.field3964 != null) {
                                                    class210.method1395((byte) 29, class212.field3964);
                                                }
                                            }
                                            if (class212.field3964 == null) {
                                                if (class238.field4381 > 0) {
                                                    class238.field4381--;
                                                }
                                            } else if (class238.field4381 < class129.field2424) {
                                                class238.field4381++;
                                                if (class238.field4381 == class129.field2424) {
                                                    class210.method1395((byte) 29, class212.field3964);
                                                }
                                            }
                                            class78.method537(true);
                                            if (class28.field499) {
                                                class125.method861((byte) 111);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class80.field1418[var39]++;
                                            }
                                            int var40 = class37.method345(-157);
                                            int var41 = class62.method470(true);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class195.field3650 = 250;
                                                class86.field1510++;
                                                class17.method119(arg0 + 923841154, 4000);
                                                class49.field970.method1503(35, 2976);
                                            }
                                            class232.field4239++;
                                            class20.field339++;
                                            class13.field175++;
                                            if (class20.field339 > 500) {
                                                class20.field339 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x1) == 1) {
                                                    class209.field3923 += class155.field2915;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class239.field4385 += class11.field154;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class8.field98 += class164.field3115;
                                                }
                                            }
                                            if (class13.field175 > 500) {
                                                class13.field175 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x2) == 2) {
                                                    class123.field2208 += class168.field3207;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class91.field1571 += class212.field3960;
                                                }
                                            }
                                            if (class239.field4385 < -55) {
                                                class11.field154 = 2;
                                            }
                                            if (class239.field4385 > 55) {
                                                class11.field154 = -2;
                                            }
                                            if (class209.field3923 < -50) {
                                                class155.field2915 = 2;
                                            }
                                            if (class209.field3923 > 50) {
                                                class155.field2915 = -2;
                                            }
                                            if (class91.field1571 < -60) {
                                                class212.field3960 = 2;
                                            }
                                            if (class8.field98 < -40) {
                                                class164.field3115 = 1;
                                            }
                                            if (class123.field2208 < -20) {
                                                class168.field3207 = 1;
                                            }
                                            if (class91.field1571 > 60) {
                                                class212.field3960 = -2;
                                            }
                                            if (class123.field2208 > 10) {
                                                class168.field3207 = -1;
                                            }
                                            if (class8.field98 > 40) {
                                                class164.field3115 = -1;
                                            }
                                            if (class232.field4239 > 50) {
                                                class135.field2497++;
                                                class49.field970.method1503(56, 2976);
                                            }
                                            try {
                                                if (class180.field3352 != null && class49.field970.field526 > 0) {
                                                    class180.field3352.method558(30000, class49.field970.field526, 0, class49.field970.field502);
                                                    class232.field4239 = 0;
                                                    class49.field970.field526 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class101.method665(-11);
                                                return;
                                            }
                                        }
                                        var34 = var33.field1031;
                                        if (var34.field2515 < 0) {
                                            break;
                                        }
                                        var35 = class180.method1200(var34.field2566, (byte) 111);
                                    } while (var35 == null || var35.field2641 == null || var35.field2641.length <= var34.field2515 || var35.field2641[var34.field2515] != var34);
                                    class210.method1397(var33, (byte) -101);
                                }
                            }
                            var31 = var30.field1031;
                            if (var31.field2515 < 0) {
                                break;
                            }
                            var32 = class180.method1200(var31.field2566, (byte) 111);
                        } while (var32 == null || var32.field2641 == null || var31.field2515 >= var32.field2641.length || var32.field2641[var31.field2515] != var31);
                        class210.method1397(var30, (byte) -126);
                    }
                }
                var28 = var27.field1031;
                if (var28.field2515 < 0) {
                    break;
                }
                var29 = class180.method1200(var28.field2566, (byte) 111);
            } while (var29 == null || var29.field2641 == null || var28.field2515 >= var29.field2641.length || var29.field2641[var28.field2515] != var28);
            class210.method1397(var27, (byte) -118);
        }
    }
}
