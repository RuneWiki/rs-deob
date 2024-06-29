import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class186 extends class214 {

    @OriginalMember(owner = "client!ed", name = "nb", descriptor = "[B")
    public static byte[] field2822 = new byte[32896];

    @OriginalMember(owner = "client!ed", name = "ob", descriptor = "[I")
    public static int[] field2823;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ed", name = "lb", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ed", name = "mb", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!ed", name = "pb", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ed", name = "sb", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "Lpf;")
    public static class294 field2816;

    @OriginalMember(owner = "client!ed", name = "qb", descriptor = "Lpf;")
    public static class294 field2825;

    @OriginalMember(owner = "client!ed", name = "rb", descriptor = "[[B")
    public static byte[][] field2826;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
    public static final void method1153(int arg0, int arg1, int arg2) {
        if (arg1 != 26226) {
            method1157(-119);
        }
        for (int var3 = 0; var3 < class107.field1672; ++var3) {
            class102 var4 = class116.method745(var3, false);
            if (var4 != null) {
                int var5 = var4.field1605;
                if (var5 >= 0 && !class249.field3775.method1307(arg1 ^ 26253, var5)) {
                    var5 = -1;
                }
                int var9;
                if (~var4.field1603 <= -1) {
                    int var6 = var4.field1603;
                    int var7 = (127 & var6) + arg0;
                    if (~var7 <= -1) {
                        if (var7 > 127) {
                            var7 = 127;
                        }
                    } else {
                        var7 = 0;
                    }
                    int var8 = (64512 & arg2 + var6) + var7 - -(896 & var6);
                    var9 = class249.field3766[class151.method912(61, 96, var8)];
                } else if (var5 < 0) {
                    if (~var4.field1595 != 0) {
                        int var10 = var4.field1595;
                        int var11 = (127 & var10) + arg0;
                        if (var11 >= 0) {
                            if (~var11 < -128) {
                                var11 = 127;
                            }
                        } else {
                            var11 = 0;
                        }
                        int var12 = (64512 & arg2 + var10) - -(var10 & 896) - -var11;
                        var9 = class249.field3766[class151.method912(120, 96, var12)];
                    } else {
                        var9 = -1;
                    }
                } else {
                    var9 = class249.field3766[class151.method912(arg1 + -26099, 96, class249.field3775.method1308(var5, -8604))];
                }
                class290.field4579[var3 + 1] = var9;
            }
        }
        ++field2820;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(II)Z")
    public static final boolean method1154(int arg0, int arg1) {
        ++field2827;
        return ~arg1 <= arg0 && ~class217.field3259.length < ~arg1 ? class217.field3259[arg1] : false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
    public static final byte[] method1155(int arg0, Object arg1, boolean arg2) {
        ++field2819;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class187.method1169(false, var3) : var3;
        } else if (arg0 != 0) {
            return null;
        } else if (arg1 instanceof class210) {
            class210 var4 = (class210) arg1;
            return var4.method813(false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1156(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field2821;
        if (class114.field1738 == 0) {
            int var7 = class133.field1949;
            int var8 = class148.field2150;
            int var9 = class243.field3643;
            int var10 = class86.field1380;
            int var11 = (var8 - var7) * (-arg4 + arg6) / arg1 - -var7;
            int var12 = (-arg3 + arg2) * (-var9 + var10) / arg0 - -var9;
            if (class153.field2305 && (class206.field3092 & 64) != 0) {
                class289 var13 = class66.method450(class116.field1763, 0, class162.field2482);
                if (var13 != null) {
                    client.method957(class289.field4390, var11, (short) 35, 0, 0L, var12, class48.field770, " ->");
                } else {
                    class226.method1444(-128);
                }
            } else {
                ++class282.field4213;
                if (class166.field2554 == 1) {
                    client.method957(-1, var11, (short) 21, 0, 0L, var12, class191.field2938, "");
                }
                client.method957(-1, var11, (short) 16, 0, 0L, var12, class213.field3189, "");
            }
        }
        if (arg5 != -93) {
            method1154(-119, 15);
        }
        long var14 = -1L;
        for (int var16 = 0; ~class162.field2485 < ~var16; ++var16) {
            long var17 = class210.field3155[var16];
            int var19 = 127 & (int) var17;
            int var20 = (16344 & (int) var17) >> 7;
            int var21 = (int) var17 >> 29 & 3;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (~var14 != ~var17) {
                var14 = var17;
                if (~var21 == -3 && class99.method638(class99.field1557, var19, var20, var17)) {
                    class288 var23 = class274.method1816(64, var22);
                    if (var23.field4336 != null) {
                        var23 = var23.method1906((byte) -117);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (~class114.field1738 != -2) {
                        if (!class153.field2305) {
                            String[] var24 = var23.field4369;
                            ++class236.field3552;
                            if (class71.field1131) {
                                var24 = class10.method46(false, var24);
                            }
                            if (var24 != null) {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24[var25] != null) {
                                        short var26 = 0;
                                        if (~var25 == -1) {
                                            var26 = 44;
                                        }
                                        if (~var25 == -2) {
                                            var26 = 33;
                                        }
                                        if (~var25 == -3) {
                                            var26 = 51;
                                        }
                                        if (var25 == 3) {
                                            var26 = 19;
                                        }
                                        if (~var25 == -5) {
                                            var26 = 1002;
                                        }
                                        int var27 = -1;
                                        ++class292.field4594;
                                        if (var23.field4374 == var25) {
                                            var27 = var23.field4349;
                                        }
                                        if (var23.field4327 == var25) {
                                            var27 = var23.field4351;
                                        }
                                        client.method957(var27, var19, var26, 0, var17, var20, var24[var25], "<col=00ffff>" + var23.field4306);
                                    }
                                }
                            }
                            client.method957(class116.field1766, var19, (short) 1004, 0, (long) var23.field4323, var20, class67.field1068, "<col=00ffff>" + var23.field4306);
                        } else {
                            class144 var28 = ~class233.field3510 != 0 ? class24.method155(class233.field3510, (byte) -33) : null;
                            if (~(4 & class206.field3092) != -1 && (var28 == null || ~var23.method1894(class233.field3510, (byte) -111, var28.field2107) != ~var28.field2107)) {
                                client.method957(class289.field4390, var19, (short) 48, 0, var17, var20, class48.field770, class210.field3163 + " -> <col=00ffff>" + var23.field4306);
                                ++class200.field3038;
                            }
                        }
                    } else {
                        client.method957(class84.field1337, var19, (short) 24, 0, var17, var20, class251.field3817, class241.field3624 + " -> <col=00ffff>" + var23.field4306);
                        ++class143.field2100;
                    }
                }
                if (~var21 == -2) {
                    class61 var29 = class18.field220[var22];
                    if ((1 & var29.field959.field1148) == 0 && ~(var29.field2251 & 127) == -1 && ~(127 & var29.field2234) == -1 || ~(1 & var29.field959.field1148) == -2 && ~(var29.field2251 & 127) == -65 && ~(var29.field2234 & 127) == -65) {
                        int var30 = -((var29.field959.field1148 - 1) * 64) + var29.field2251;
                        int var31 = -(var29.field959.field1148 * 64) - (-64 - var29.field2234);
                        for (int var32 = 0; ~class24.field295 < ~var32; ++var32) {
                            class61 var37 = class18.field220[class169.field2586[var32]];
                            if (var37 != null && !var37.field2265 && var29 != var37 && var37.field2263) {
                                int var38 = -((var37.field959.field1148 + -1) * 64) + var37.field2251;
                                int var39 = -((var37.field959.field1148 + -1) * 64) + var37.field2234;
                                if (var38 >= var30 && -(-var30 + var38 >> 7) + var29.field959.field1148 >= var37.field959.field1148 && var39 >= var31 && var37.field959.field1148 <= -(-var31 + var39 >> 7) + var29.field959.field1148) {
                                    class2.method7(arg5 + 103, var19, var20, var37.field959, class169.field2586[var32]);
                                    var37.field2265 = true;
                                }
                            }
                        }
                        for (int var33 = 0; ~var33 > ~class141.field2069; ++var33) {
                            class107 var34 = class96.field1521[class58.field918[var33]];
                            if (var34 != null && !var34.field2265 && var34.field2263) {
                                int var35 = var34.field2251 - 64 * (-1 + var34.method676(-30217));
                                int var36 = var34.field2234 - 64 * (-1 + var34.method676(-30217));
                                if (var30 <= var35 && ~var34.method676(-30217) >= ~(-(-var30 + var35 >> 7) + var29.field959.field1148) && ~var36 <= ~var31 && var34.method676(arg5 + -30124) <= -(-var31 + var36 >> 7) + var29.field959.field1148) {
                                    class4.method16(class58.field918[var33], 47, var20, var19, var34);
                                    var34.field2265 = true;
                                }
                            }
                        }
                    }
                    if (var29.field2265) {
                        continue;
                    }
                    class2.method7(arg5 ^ -87, var19, var20, var29.field959, var22);
                    var29.field2265 = true;
                }
                if (~var21 == -1) {
                    class107 var40 = class96.field1521[var22];
                    if ((127 & var40.field2251) == 64 && ~(127 & var40.field2234) == -65) {
                        int var41 = var40.field2251 - (var40.method676(arg5 + -30124) - 1) * 64;
                        int var42 = var40.field2234 - -64 - var40.method676(-30217) * 64;
                        for (int var43 = 0; var43 < class24.field295; ++var43) {
                            class61 var48 = class18.field220[class169.field2586[var43]];
                            if (var48 != null && !var48.field2265 && var48.field2263) {
                                int var49 = var48.field2251 + 64 + -(var48.field959.field1148 * 64);
                                int var50 = -((var48.field959.field1148 + -1) * 64) + var48.field2234;
                                if (var49 >= var41 && ~var48.field959.field1148 >= ~(var40.method676(-30217) + -(-var41 + var49 >> 7)) && ~var42 >= ~var50 && var48.field959.field1148 <= var40.method676(-30217) + -(-var42 + var50 >> 7)) {
                                    class2.method7(arg5 ^ -87, var19, var20, var48.field959, class169.field2586[var43]);
                                    var48.field2265 = true;
                                }
                            }
                        }
                        for (int var44 = 0; class141.field2069 > var44; ++var44) {
                            class107 var45 = class96.field1521[class58.field918[var44]];
                            if (var45 != null && !var45.field2265 && var40 != var45 && var45.field2263) {
                                int var46 = var45.field2251 - 64 * (var45.method676(-30217) - 1);
                                int var47 = var45.field2234 - (-64 + 64 * var45.method676(arg5 + -30124));
                                if (var41 <= var46 && var45.method676(-30217) <= -(-var41 + var46 >> 7) + var40.method676(arg5 + -30124) && var42 <= var47 && var45.method676(arg5 ^ 30292) <= var40.method676(-30217) - (-var42 + var47 >> 7)) {
                                    class4.method16(class58.field918[var44], 107, var20, var19, var45);
                                    var45.field2265 = true;
                                }
                            }
                        }
                    }
                    if (var40.field2265) {
                        continue;
                    }
                    class4.method16(var22, 121, var20, var19, var40);
                    var40.field2265 = true;
                }
                if (var21 == 3) {
                    class159 var51 = class251.field3816[class99.field1557][var19][var20];
                    if (var51 != null) {
                        for (class146 var52 = (class146) var51.method991(104); var52 != null; var52 = (class146) var51.method984((byte) -17)) {
                            int var53 = var52.field2128.field3577;
                            class43 var54 = class160.method999(var53, 0);
                            if (class114.field1738 == 1) {
                                client.method957(class84.field1337, var19, (short) 40, 0, (long) var53, var20, class251.field3817, class241.field3624 + " -> <col=ff9040>" + var54.field626);
                                ++class194.field2963;
                            } else if (class153.field2305) {
                                class144 var59 = class233.field3510 == -1 ? null : class24.method155(class233.field3510, (byte) -33);
                                if ((class206.field3092 & 1) != 0 && (var59 == null || ~var54.method288(4, class233.field3510, var59.field2107) != ~var59.field2107)) {
                                    ++client.field2388;
                                    client.method957(class289.field4390, var19, (short) 31, arg5 + 93, (long) var53, var20, class48.field770, class210.field3163 + " -> <col=ff9040>" + var54.field626);
                                }
                            } else {
                                ++class231.field3483;
                                String[] var55 = var54.field682;
                                if (class71.field1131) {
                                    var55 = class10.method46(false, var55);
                                }
                                for (int var56 = 4; ~var56 <= -1; --var56) {
                                    if (var55 != null && var55[var56] != null) {
                                        byte var57 = 0;
                                        if (~var56 == -1) {
                                            var57 = 30;
                                        }
                                        ++class217.field3265;
                                        if (var56 == 1) {
                                            var57 = 3;
                                        }
                                        int var58 = -1;
                                        if (var56 == 2) {
                                            var57 = 57;
                                        }
                                        if (~var54.field692 == ~var56) {
                                            var58 = var54.field669;
                                        }
                                        if (~var56 == -4) {
                                            var57 = 4;
                                        }
                                        if (var56 == 4) {
                                            var57 = 36;
                                        }
                                        if (var54.field684 == var56) {
                                            var58 = var54.field645;
                                        }
                                        client.method957(var58, var19, var57, arg5 + 93, (long) var53, var20, var55[var56], "<col=ff9040>" + var54.field626);
                                    }
                                }
                                client.method957(class116.field1766, var19, (short) 1005, arg5 + 93, (long) var53, var20, class67.field1068, "<col=ff9040>" + var54.field626);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "(I)V")
    public static void method1157(int arg0) {
        field2816 = null;
        field2823 = null;
        field2825 = null;
        field2822 = null;
        field2826 = null;
        if (arg0 < 88) {
            field2823 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBIIIIZ)V")
    public static final void method1158(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg1 == 107) {
            class113.field1734 = arg4;
            class40.field595 = arg2;
            class187.field2836 = arg3;
            class57.field904 = arg0;
            ++field2818;
            class23.field283 = arg5;
            if (arg6 && ~class113.field1734 <= -101) {
                class47.field763 = class40.field595 * 128 + 64;
                class128.field1922 = class187.field2836 * 128 + 64;
                class213.field3184 = class183.method1139(class99.field1557, class47.field763, class128.field1922, (byte) 117) - class57.field904;
            }
            class253.field3837 = 2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field2824;
            int[][] var3 = super.field2802.method753(1, arg1);
            if (super.field2802.field1807 && this.method1369(119)) {
                int[] var4 = var3[0];
                int var5 = arg1 % super.field3200 * super.field3200;
                int[] var6 = var3[2];
                int[] var7 = var3[1];
                for (int var8 = 0; ~var8 > ~class174.field2648; ++var8) {
                    int var9 = super.field3199[var8 % super.field3202 + var5];
                    var6[var8] = class94.method598(var9 << 4, 4080);
                    var7[var8] = class94.method598(var9, 65280) >> 4;
                    var4[var8] = class94.method598(var9, 16711680) >> 12;
                }
            }
            return var3;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var1 <= ~var2; ++var2) {
                field2822[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 - -65535) / 65535.0F))));
            }
        }
        field2823 = new int[2500];
    }
}
