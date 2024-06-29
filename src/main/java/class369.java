import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class369 extends class123 {

    @OriginalMember(owner = "client!tl", name = "eb", descriptor = "[J")
    public static long[] field5211 = new long[100];

    @OriginalMember(owner = "client!tl", name = "db", descriptor = "[Ljf;")
    public static class118[] field5210 = new class118[6];

    @OriginalMember(owner = "client!tl", name = "ib", descriptor = "[S")
    public static short[] field5215 = new short[256];

    @OriginalMember(owner = "client!tl", name = "fb", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!tl", name = "hb", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!tl", name = "jb", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!tl", name = "kb", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!tl", name = "gb", descriptor = "[[[B")
    public static byte[][][] field5213;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lae;IILnc;III[[[B[I[I[I[I[IIBIIZ)V", line = 5)
    public static final void method2349(class134 arg0, int arg1, int arg2, class18 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class36.field422 = arg0;
        class432.field6220 = arg1;
        class382.field5377 = arg3;
        class263.field3752 = class36.field422.method602() > 0;
        class444.field6379 = arg4 >> 7;
        class137.field1706 = arg6 >> 7;
        class113.field1380 = arg4;
        class54.field655 = arg6;
        class295.field4116 = arg5;
        class216.field3050 = class444.field6379 - class76.field898;
        if (class216.field3050 < 0) {
            class123.field1502 = -class216.field3050;
            class216.field3050 = 0;
        } else {
            class123.field1502 = 0;
        }
        class380.field5349 = class137.field1706 - class76.field898;
        if (class380.field5349 < 0) {
            class210.field2996 = -class380.field5349;
            class380.field5349 = 0;
        } else {
            class210.field2996 = 0;
        }
        class50.field605 = class76.field898 + class444.field6379;
        if (class50.field605 > class415.field5953) {
            class50.field605 = class415.field5953;
        }
        class161.field2129 = class76.field898 + class137.field1706;
        if (class161.field2129 > class299.field4190) {
            class161.field2129 = class299.field4190;
        }
        for (int var18 = 0; var18 < class76.field898 + class76.field898 + 2; ++var18) {
            for (int var23 = 0; var23 < class76.field898 + class76.field898 + 2; ++var23) {
                int var24 = class444.field6379 - class76.field898 + var18;
                int var25 = class137.field1706 - class76.field898 + var23;
                if (var24 >= 0 && var25 >= 0 && var24 < class415.field5953 && var25 < class299.field4190) {
                    int var26 = var24 << 7;
                    int var27 = var25 << 7;
                    int var28 = class98.field1191[3].method328(var24, var25) - 1000;
                    int var29 = class399.field5693 != null ? class399.field5693[0].method328(var24, var25) + 128 : class98.field1191[0].method328(var24, var25) + 128;
                    class337.field4793[var18][var23] = class36.field422.method636(var26, var28, var27, var26, var29, var27);
                } else {
                    class337.field4793[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class76.field898 + class76.field898 + 1; ++var19) {
            for (int var22 = 0; var22 < class76.field898 + class76.field898 + 1; ++var22) {
                class29.field357[var19][var22] = class337.field4793[var19][var22] || class337.field4793[var19 + 1][var22] || class337.field4793[var19][var22 + 1] || class337.field4793[var19 + 1][var22 + 1];
            }
        }
        class204.field2933 = arg8;
        class258.field3697 = arg9;
        class247.field3532 = arg10;
        class152.field1874 = arg11;
        class123.field1511 = arg12;
        class135.method832();
        class64.method365(12044);
        for (class186 var20 = (class186) class134.field1615.method2509((byte) 51); var20 != null; var20 = (class186) class134.field1615.method2515(0)) {
            var20.method2635(-13388);
            class174.method1194(var20, -17173);
        }
        if (class263.field3752) {
            for (int var21 = 0; var21 < class75.field886; ++var21) {
                class266.field3800[var21].method89(116, arg1, arg17);
            }
        }
        if (arg2 > 1) {
            class36.field422.method684(0);
            if (class144.field1782 == null || class144.field1782 instanceof class183) {
                class144.field1782 = new class447();
            }
        } else if (class144.field1782 == null || class144.field1782 instanceof class447) {
            class144.field1782 = new class183();
        }
        class144.field1782.method206(arg2, 0);
        class144.field1782.method201(0);
        if (class370.field5218 != null) {
            class203.method1350(true);
            class144.field1782.method208(22, -93);
            class331.method2138(arg2, (byte[][][]) null, 0, (byte) 0, arg15, arg16);
            class144.field1782.method201(0);
            class144.field1782.method208(23, -113);
            class203.method1350(false);
        }
        class331.method2138(arg2, arg7, arg13, arg14, arg15, arg16);
        class144.field1782.method201(0);
        class144.field1782.method207(3575);
        class144.field1782.method201(0);
        if (arg2 > 1) {
            class36.field422.method618(0);
        }
        class36.field422.method677(0, (class397[]) null);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)V", line = 162)
    public static final void method2350(int arg0, int arg1, int arg2, int arg3) {
        class193 var4 = class250.field3570[arg0][arg1][arg2];
        if (var4 != null) {
            class48 var5 = var4.field2788;
            class48 var6 = var4.field2786;
            if (var5 != null) {
                var5.field567 = var5.field567 * arg3 / 16;
                var5.field578 = var5.field578 * arg3 / 16;
            }
            if (var6 != null) {
                var6.field567 = var6.field567 * arg3 / 16;
                var6.field578 = var6.field578 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BII)Luc;", line = 185)
    public static final class20 method2351(byte arg0, int arg1, int arg2) {
        ++field5216;
        if (arg0 <= 67) {
            method2352(-128, (class236) null);
        }
        class20 var3 = (class20) class182.field2485.method1888((long) arg1 << 32 | (long) arg2, (byte) -30);
        if (var3 == null) {
            var3 = new class20(arg1, arg2);
            class182.field2485.method1886(var3, var3.field5855, 1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILdg;)V", line = 204)
    public static final void method2352(int arg0, class236 arg1) {
        ++field5212;
        if (~(arg1.field3364.length + -arg1.field3320) <= -2) {
            int var2 = arg1.method1574(-40);
            if (var2 >= 0 && var2 <= 15) {
                byte var3;
                if (~var2 != -16) {
                    if (~var2 == -15) {
                        var3 = 36;
                    } else if (var2 != 13) {
                        if (~var2 != -13) {
                            if (~var2 == -12) {
                                var3 = 33;
                            } else if (~var2 == -11) {
                                var3 = 32;
                            } else if (var2 == 9) {
                                var3 = 31;
                            } else if (~var2 == -9) {
                                var3 = 30;
                            } else if (var2 == 7) {
                                var3 = 29;
                            } else if (var2 == 6) {
                                var3 = 28;
                            } else if (~var2 == -6) {
                                var3 = 28;
                            } else if (var2 != 4) {
                                if (var2 != 3) {
                                    if (~var2 != -3) {
                                        if (~var2 == -2) {
                                            var3 = 23;
                                        } else {
                                            var3 = 19;
                                        }
                                    } else {
                                        var3 = 22;
                                    }
                                } else {
                                    var3 = 23;
                                }
                            } else {
                                var3 = 24;
                            }
                        } else {
                            var3 = 34;
                        }
                    } else {
                        var3 = 35;
                    }
                } else {
                    var3 = 37;
                }
                if (arg1.field3364.length + -arg1.field3320 >= var3) {
                    class23.field289 = arg1.method1574(-111);
                    if (~class23.field289 <= -2) {
                        if (~class23.field289 < -5) {
                            class23.field289 = 4;
                        }
                    } else {
                        class23.field289 = 1;
                    }
                    class332.method2148((byte) 105, ~arg1.method1574(-50) == -2);
                    class286.field4013 = ~arg1.method1574(-3) == -2;
                    class332.field4706 = arg1.method1574(arg0 ^ 5663) == 1;
                    class271.field3838 = ~arg1.method1574(arg0 ^ 5681) == -2;
                    class347.field4921 = arg1.method1574(arg0 + 5650) == 1 ? 1 : 0;
                    class414.field5947 = ~arg1.method1574(-114) == -2;
                    class20.field265 = arg1.method1574(-91) == 1;
                    class33.field381 = ~arg1.method1574(-92) == -2;
                    class141.field1739 = arg1.method1574(-42);
                    if (class141.field1739 > 2) {
                        class141.field1739 = 2;
                    }
                    if (var2 < 2) {
                        class272.field3859 = ~arg1.method1574(-86) == -2;
                        arg1.method1574(-98);
                    } else {
                        class272.field3859 = arg1.method1574(arg0 ^ 5738) == 1;
                    }
                    class254.field3656 = arg1.method1574(-18) == 1;
                    class18.field210 = arg1.method1574(arg0 + 5668) == 1;
                    class148.field1815 = arg1.method1574(arg0 ^ 5727);
                    if (~class148.field1815 < -3) {
                        class148.field1815 = 2;
                    }
                    class408.field5877 = class148.field1815;
                    class94.field1134 = arg1.method1574(-54) == 1;
                    class401.field5730 = arg1.method1574(-80);
                    if (class401.field5730 > 127) {
                        class401.field5730 = 127;
                    }
                    class334.field4729 = arg1.method1574(arg0 ^ 5714);
                    class355.field4999 = arg1.method1574(-22);
                    if (~class355.field4999 < -128) {
                        class355.field4999 = 127;
                    }
                    if (~var2 <= -2) {
                        class374.field5256 = arg1.method1617((byte) 48);
                        class388.field5479 = arg1.method1617((byte) 48);
                    }
                    if (var2 >= 3 && var2 < 6) {
                        arg1.method1574(-47);
                    }
                    if (arg0 != -5707) {
                        field5215 = null;
                    }
                    if (~var2 <= -5) {
                        int var4 = arg1.method1574(-8);
                        if (~var4 > -1 || var4 > 2) {
                            var4 = 0;
                        }
                        if (~class268.field3812 > -97) {
                            var4 = 0;
                        }
                        class366.method2339(var4, true);
                    }
                    if (~var2 <= -6) {
                        class140.field1735 = arg1.method1597(3641);
                    }
                    int var5 = 0;
                    if (var2 >= 6) {
                        class249.field3558 = var5 = arg1.method1574(-54);
                    }
                    if (~class249.field3558 != -2 && class249.field3558 != 2) {
                        class249.field3558 = 2;
                    }
                    if (~var2 <= -8) {
                        class77.field906 = ~arg1.method1574(-13) == -2;
                    }
                    if (~var2 <= -9) {
                        class374.field5254 = arg1.method1574(-94) == 1;
                    }
                    if (var2 >= 9) {
                        class433.field6227 = arg1.method1574(-51);
                    }
                    if (~class433.field6227 > -1 || ~class433.field6227 < ~class341.method2188(110, class268.field3812)) {
                        class433.field6227 = 0;
                    }
                    if (var2 >= 10) {
                        class212.field3020 = ~arg1.method1574(arg0 ^ 5694) != -1;
                    }
                    if (~var2 <= -12) {
                        class156.field1916 = ~arg1.method1574(arg0 ^ 5755) != -1;
                    }
                    if (~var2 <= -13) {
                        class347.field4921 = arg1.method1574(-37);
                    }
                    if (class347.field4921 < 0 || class347.field4921 > 2) {
                        class347.field4921 = 1;
                    }
                    if (~var2 <= -14) {
                        class222.field3117 = ~arg1.method1574(-115) == -2;
                    }
                    if (~var2 <= -15) {
                        class140.field1736 = arg1.method1574(-78);
                    } else if (var5 != 0) {
                        class140.field1736 = 1;
                    } else {
                        class140.field1736 = 2;
                    }
                    if (class140.field1736 < 0 || class140.field1736 > 3) {
                        class140.field1736 = 2;
                    }
                    if (~var2 <= -16) {
                        class223.field3135 = arg1.method1574(-108);
                        if (~class223.field3135 > -1 || class223.field3135 > 4) {
                            class223.field3135 = class180.field2471 == 1 ? 2 : 4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)V", line = 435)
    public static void method2353(int arg0) {
        if (arg0 != 15) {
            field5210 = null;
        }
        field5215 = null;
        field5213 = null;
        field5210 = null;
        field5211 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)[[I", line = 467)
    public final int[][] method194(int arg0, int arg1) {
        ++field5214;
        int[][] var3 = super.field1184.method185((byte) -48, arg0);
        if (super.field1184.field332 && this.method782(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field1510 * super.field1510;
            for (int var8 = 0; ~var8 > ~class268.field3811; ++var8) {
                int var9 = super.field1513[var8 % super.field1506 + var7];
                var6[var8] = class33.method210(var9 << 4, 4080);
                var5[var8] = class33.method210(var9, 65280) >> 4;
                var4[var8] = class33.method210(4080, var9 >> 12);
            }
        }
        int var10 = -81 % ((60 - arg1) / 43);
        return var3;
    }
}
