import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class257 extends class108 implements class534 {

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "Lmu;")
    public class201 field3813;

    @OriginalMember(owner = "client!wu", name = "D", descriptor = "Z")
    private boolean field3815;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!wu", name = "E", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!wu", name = "F", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!wu", name = "G", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!wu", name = "J", descriptor = "Lem;")
    private class154 field3820;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)I", line = 3)
    public final int method559(byte arg0) {
        if (arg0 < 3) {
            this.field3815 = false;
        }
        ++field3803;
        return this.field3813.field3066;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I", line = 14)
    public final int method560(int arg0) {
        ++field3808;
        if (arg0 != -29863) {
            method1661((class463) null, -34, 67, (class167) null, (class528) null, -8);
        }
        return this.field3813.field3090;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lqa;I)V", line = 25)
    public final void method551(class167 arg0, int arg1) {
        this.field3813.method1364(arg0, (byte) 79);
        ++field3805;
        if (arg1 < 62) {
            this.field3813 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V", line = 37)
    public final void method548(int arg0) {
        ++field3810;
        int var2 = 39 / ((-37 - arg0) / 34);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILqa;ZLee;Z)V", line = 50)
    public final void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6) {
        ++field3814;
        if (arg4) {
            this.method551((class167) null, 47);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lqa;B)V", line = 61)
    public final void method552(class167 arg0, byte arg1) {
        if (arg1 > -119) {
            this.method548(-20);
        }
        ++field3802;
        class336 var3 = this.field3813.method1361(262144, true, arg0, 106, super.field1617, true, super.field1620);
        if (var3 != null) {
            int var4 = super.field1620 >> 7;
            int var5 = super.field1617 >> 7;
            this.field3813.method1365(var3, var4, false, var5, var4, var5, arg0, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)V", line = 83)
    public final void method549(boolean arg0) {
        if (!arg0) {
            ++field3819;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lqa;Lku;IIIIIZII)V", line = 95)
    public class257(class167 arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field3943, arg1.field3909, arg1.field3939);
        this.field3813 = new class201(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field3815 = arg1.field3872 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLqa;)V", line = 105)
    public final void method557(byte arg0, class167 arg1) {
        this.field3813.method1362(arg1, -12);
        ++field3812;
        int var3 = -7 / ((arg0 - 13) / 59);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILqa;I)Lka;", line = 115)
    public final class336 method550(int arg0, class167 arg1, int arg2) {
        ++field3809;
        return arg0 != -14322 ? null : this.field3813.method1361(arg2, false, arg1, 97, 0, false, 0);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B[I[I[ILsg;)V", line = 126)
    public static final void method1660(byte arg0, int[] arg1, int[] arg2, int[] arg3, class279 arg4) {
        ++field3818;
        int var5 = 0;
        int var6 = 100 / ((-21 - arg0) / 62);
        while (var5 < arg2.length) {
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            int var9 = arg1[var5];
            int var10 = 0;
            while (~var8 != -1 && ~arg4.field313.length < ~var10) {
                if ((var8 & 1) != 0) {
                    if (var7 == -1) {
                        arg4.field313[var10] = null;
                    } else {
                        class183 var11 = class96.field1526.method2717(-122, var7);
                        int var12 = var11.field2687;
                        class490 var13 = arg4.field313[var10];
                        if (var13 != null) {
                            if (~var13.field7066 == ~var7) {
                                if (var12 == 0) {
                                    var13 = arg4.field313[var10] = null;
                                } else if (var12 != 1) {
                                    if (~var12 == -3) {
                                        var13.field7063 = 0;
                                    }
                                } else {
                                    var13.field7063 = 0;
                                    var13.field7061 = 0;
                                    var13.field7065 = var9;
                                    var13.field7067 = 0;
                                    var13.field7062 = 1;
                                    class511.method2983(arg4.field6961, 0, arg4.field6965, -64, false, var11, arg4.field6956);
                                }
                            } else if (~var11.field2688 <= ~class96.field1526.method2717(-94, var13.field7066).field2688) {
                                var13 = arg4.field313[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class490 var14 = arg4.field313[var10] = new class490();
                            var14.field7061 = 0;
                            var14.field7063 = 0;
                            var14.field7067 = 0;
                            var14.field7062 = 1;
                            var14.field7066 = var7;
                            var14.field7065 = var9;
                            class511.method2983(arg4.field6961, 0, arg4.field6965, -64, false, var11, arg4.field6956);
                        }
                    }
                }
                ++var10;
                var8 >>>= 1;
            }
            ++var5;
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)Z", line = 221)
    public final boolean method547(int arg0) {
        int var2 = 104 / ((-73 - arg0) / 39);
        ++field3804;
        return this.field3813.method1366(-20486);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILqa;)Lnj;", line = 237)
    public final class166 method554(int arg0, class167 arg1) {
        ++field3811;
        class336 var3 = this.field3813.method1361(2048, true, arg1, 94, super.field1617, false, super.field1620);
        if (var3 == null) {
            return null;
        } else {
            class15 var4 = arg1.method312();
            var4.method47(super.field1620, super.field1624, super.field1617);
            class166 var5 = null;
            if (this.field3815) {
                var5 = class392.method2363(3317, 1);
            }
            if (this.field3813.field3070 == null) {
                var3.method1142(var4, var5 == null ? null : var5.field2497[0], 0);
            } else {
                class300 var6 = this.field3813.field3070.method819();
                arg1.method332(var3, var6, var4, var5 != null ? var5.field2497[0] : null, 0);
            }
            if (this.field3820 != null) {
                class192.method1311(super.field1620, arg0 + 94, super.field1624, var3, this.field3820, super.field1617);
            } else {
                this.field3820 = class332.method2104(super.field1624, var3, super.field1617, super.field1620, -108);
            }
            int var7 = super.field1620 >> 7;
            int var8 = super.field1617 >> 7;
            if (arg0 != 0) {
                this.method561((byte) 111);
            }
            this.field3813.method1365(var3, var7, true, var8, var7, var8, arg1, (byte) 25);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)Z", line = 284)
    public final boolean method556(int arg0) {
        if (arg0 != -1) {
            this.field3820 = null;
        }
        ++field3817;
        return false;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)I", line = 296)
    public final int method561(byte arg0) {
        if (arg0 != -85) {
            return 30;
        } else {
            ++field3807;
            return this.field3813.field3089;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(Lqa;B)Lem;", line = 310)
    public final class154 method562(class167 arg0, byte arg1) {
        if (arg1 >= -117) {
            this.method553(-101, -79, 93, (class167) null);
        }
        ++field3806;
        return this.field3820;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILqa;)Z", line = 322)
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        if (arg2 < 42) {
            return true;
        } else {
            ++field3816;
            class336 var5 = this.field3813.method1361(131072, false, arg3, 91, super.field1617, false, super.field1620);
            if (var5 == null) {
                return false;
            } else {
                class15 var6 = arg3.method312();
                var6.method47(super.field1620, super.field1624, super.field1617);
                return var5.method1131(arg1, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lrg;IILqa;Lau;I)Z", line = 341)
    public static final boolean method1661(class463 arg0, int arg1, int arg2, class167 arg3, class528 arg4, int arg5) {
        ++field3801;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field6697 != null) {
            var7 = (-class382.field5477 + arg0.field6714 - -arg4.field7714) * (class382.field5473 - class382.field5480) / (-class382.field5477 + class382.field5466) + class382.field5480;
            var8 = class382.field5484 - (arg0.field6733 + arg4.field7719 + -class382.field5478) * (-class382.field5482 + class382.field5484) / (-class382.field5478 + class382.field5481);
            var6 = (arg4.field7714 - class382.field5477 + arg0.field6694) * (-class382.field5480 + class382.field5473) / (-class382.field5477 + class382.field5466) + class382.field5480;
            var9 = class382.field5484 - (arg0.field6702 - (-arg4.field7719 - -class382.field5478)) * (class382.field5484 - class382.field5482) / (class382.field5481 - class382.field5478);
        }
        class343 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (~arg0.field6711 != 0) {
            if (arg4.field7724 && ~arg0.field6716 != 0) {
                var10 = arg0.method2747(arg3, (byte) 98, true);
            } else {
                var10 = arg0.method2747(arg3, (byte) -78, false);
            }
            if (var10 != null) {
                var11 = arg4.field7717 + -(1 + var10.method376() >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg4.field7717 + (1 + var10.method376() >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg4.field7720 + -(1 + var10.method374() >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg4.field7720 - -(1 + var10.method374() >> 1);
                if (~var9 > ~var14) {
                    var9 = var14;
                }
            }
        }
        class456 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg0.field6700 != null) {
            var15 = class287.method1840(arg0.field6731, -118);
            if (var15 != null) {
                var16 = class199.field3053.method870((int[]) null, 8611, arg0.field6700, class230.field3448, (class343[]) null);
                int var23 = arg4.field7720;
                if (var10 != null) {
                    var17 = var23 - ((var10.method374() >> 1) + var16 * var15.method2710());
                } else {
                    var17 = var23 - var16 * var15.method2708() / 2;
                }
                for (int var24 = 0; var24 < var16; ++var24) {
                    String var25 = class230.field3448[var24];
                    if (~(var16 - 1) < ~var24) {
                        var25 = var25.substring(0, -4 + var25.length());
                    }
                    int var26 = var15.method2713(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg4.field7717 + arg2 + -(var18 / 2);
                if (~var19 > ~var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg4.field7717 + arg2;
                var21 = arg5 + var17;
                if (~var7 > ~var20) {
                    var7 = var20;
                }
                if (~var21 > ~var8) {
                    var8 = var21;
                }
                var22 = arg5 + (var17 - -(var15.method2710() * var16));
                if (~var22 < ~var9) {
                    var9 = var22;
                }
            }
        }
        if (var7 >= class382.field5480 && class382.field5473 >= var6 && ~var9 <= ~class382.field5482 && class382.field5484 >= var8) {
            if (arg0.field6697 != null) {
                int[] var27 = new int[arg0.field6697.length];
                for (int var28 = 0; ~(var27.length / 2) < ~var28; ++var28) {
                    int var30 = arg0.field6697[var28 * 2] + arg4.field7714;
                    int var31 = arg0.field6697[var28 * 2 + 1] - -arg4.field7719;
                    var27[var28 * 2] = (-class382.field5480 + class382.field5473) * (-class382.field5477 + var30) / (-class382.field5477 + class382.field5466) + class382.field5480;
                    var27[var28 * 2 - -1] = class382.field5484 - (class382.field5484 - class382.field5482) * (var31 - class382.field5478) / (-class382.field5478 + class382.field5481);
                }
                class151.method1070(arg3, var27, arg0.field6722);
                for (int var29 = 0; ~var29 > ~(var27.length / 2 - 1); ++var29) {
                    arg3.method1195(var27[var29 * 2 - -1], var27[(var29 + 1) * 2], -1, var27[var29 * 2], var27[(var29 - -1) * 2 + 1], arg0.field6689);
                }
                arg3.method1195(var27[var27.length + -1], var27[0], -1, var27[var27.length + -2], var27[1], arg0.field6689);
            }
            if (var10 != null) {
                if (~class288.field4266 < -1 && (~class238.field3599 != 0 && class238.field3599 == arg4.field7723 || ~class356.field5183 != 0 && ~class356.field5183 == ~arg0.field6712)) {
                    int var32;
                    if (class446.field6368 > 50) {
                        var32 = (-class446.field6368 + 100) * 2;
                    } else {
                        var32 = class446.field6368 * 2;
                    }
                    int var33 = 16776960 | var32 << 24;
                    arg3.method1201(arg4.field7717, 7 + var10.method378() / 2, 6565, var33, arg4.field7720);
                    arg3.method1201(arg4.field7717, var10.method378() / 2 + 5, 6565, var33, arg4.field7720);
                    arg3.method1201(arg4.field7717, 3 + var10.method378() / 2, 6565, var33, arg4.field7720);
                    arg3.method1201(arg4.field7717, 1 + var10.method378() / 2, 6565, var33, arg4.field7720);
                    arg3.method1201(arg4.field7717, var10.method378() / 2, 6565, var33, arg4.field7720);
                }
                var10.method2175(arg4.field7717 - (var10.method376() >> 1), arg4.field7720 + -(var10.method374() >> 1));
            }
            if (arg1 >= -55) {
                method1660((byte) 70, (int[]) null, (int[]) null, (int[]) null, (class279) null);
            }
            if (arg0.field6700 != null && var15 != null) {
                class333.method2111(var16, arg0, var18, arg3, var17, 0, arg4, var15);
            }
            if (~arg0.field6711 != 0 || arg0.field6700 != null) {
                class185 var34 = new class185(arg4);
                var34.field2729 = var19;
                var34.field2737 = var20;
                var34.field2739 = var13;
                var34.field2733 = var22;
                var34.field2734 = var21;
                var34.field2740 = var11;
                var34.field2742 = var14;
                var34.field2732 = var12;
                class241.field3617.method866((byte) 10, var34);
            }
            return false;
        } else {
            return true;
        }
    }
}
