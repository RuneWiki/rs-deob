import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class257 extends class115 {

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public static int field4487 = 0;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "Lui;")
    public static class236 field4492 = new class236(4096);

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "Lqe;")
    public static class168 field4494 = class66.method448("", 85);

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "[I")
    public static int[] field4495 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "[S")
    public static short[] field4496 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)Lmj;")
    public static final class129 method1713(int arg0, int arg1) {
        if (arg1 <= 125) {
            return null;
        } else {
            int var2 = arg0 >> 16;
            ++field4486;
            int var3 = arg0 & 65535;
            if (class108.field1741[var2] == null || class108.field1741[var2][var3] == null) {
                boolean var4 = class97.method636(var2, -127);
                if (!var4) {
                    return null;
                }
            }
            return class108.field1741[var2][var3];
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field4489;
        if (arg1 < 11) {
            field4492 = null;
        }
        int[][] var3 = super.field1882.method1242(arg0, -121);
        if (super.field1882.field3344) {
            int[][] var4 = this.method789(0, (byte) -124, arg0);
            int[] var5 = var4[2];
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class130.field2297; ++var11) {
                var6[var11] = -var10[var11] + 4096;
                var7[var11] = -var8[var11] + 4096;
                var9[var11] = -var5[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "(I)V")
    public static void method1714(int arg0) {
        int var1 = 44 % ((21 - arg0) / 44);
        field4492 = null;
        field4494 = null;
        field4495 = null;
        field4496 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class47.field620 = 0;
        ++field4490;
        for (int var7 = -1; ~var7 > ~(class82.field1244 + class132.field2322); ++var7) {
            class18 var23;
            if (var7 != -1) {
                if (var7 < class132.field2322) {
                    var23 = class104.field1677[class115.field1868[var7]];
                } else {
                    var23 = class229.field3898[class51.field690[var7 - class132.field2322]];
                }
            } else {
                var23 = class7.field85;
            }
            if (var23 != null && var23.method87(-1570135920)) {
                if (var23 instanceof class222) {
                    class180 var24 = ((class222) var23).field3814;
                    if (var24.field3206 != null) {
                        var24 = var24.method1192(-1);
                    }
                    if (var24 == null) {
                        continue;
                    }
                }
                if (~var7 <= ~class132.field2322) {
                    class180 var30 = ((class222) var23).field3814;
                    if (var30.field3206 != null) {
                        var30 = var30.method1192(-1);
                    }
                    if (var30.field3210 >= 0 && class26.field311.length > var30.field3210) {
                        class32.method210(113, var23.method97(-84) + 15, arg5 >> 1, arg2 >> 1, arg1, var23, arg0);
                        if (class178.field3123 > -1) {
                            class26.field311[var30.field3210].method73(class178.field3123 + arg4 + -12, class59.field812 + -30 + arg3);
                        }
                    }
                    class246[] var31 = class44.field579;
                    for (int var32 = 0; var32 < var31.length; ++var32) {
                        class246 var34 = var31[var32];
                        if (var34 != null && var34.field4269 == 1 && class51.field690[-class132.field2322 + var7] == var34.field4260 && ~(class133.field2326 % 20) > -11) {
                            class32.method210(106, 15 + var23.method97(arg6 + -24250), arg5 >> 1, arg2 >> 1, arg1, var23, arg0);
                            if (~class178.field3123 < 0) {
                                class87.field1356[var34.field4259].method73(arg4 - (-class178.field3123 + 12), class59.field812 + arg3 + -28);
                            }
                        }
                    }
                } else {
                    int var25 = 30;
                    class121 var26 = (class121) var23;
                    if (~var26.field1990 != 0 || var26.field2008 != -1) {
                        class32.method210(121, var23.method97(-83) + 15, arg5 >> 1, arg2 >> 1, arg1, var23, arg0);
                        if (class178.field3123 > -1) {
                            if (var26.field1990 != -1) {
                                class158.field2733[var26.field1990].method73(class178.field3123 - 12 + arg4, -var25 + class59.field812 + arg3);
                                var25 += 25;
                            }
                            if (~var26.field2008 != 0) {
                                class26.field311[var26.field2008].method73(class178.field3123 + -12 + arg4, -var25 + class59.field812 + arg3);
                                var25 += 25;
                            }
                        }
                    }
                    if (~var7 <= -1) {
                        class246[] var27 = class44.field579;
                        for (int var28 = 0; ~var27.length < ~var28; ++var28) {
                            class246 var29 = var27[var28];
                            if (var29 != null && ~var29.field4269 == -11 && class115.field1868[var7] == var29.field4260) {
                                class32.method210(arg6 ^ 24149, var23.method97(-98) - -15, arg5 >> 1, arg2 >> 1, arg1, var23, arg0);
                                if (~class178.field3123 < 0) {
                                    class87.field1356[var29.field4259].method73(arg4 - -class178.field3123 + -12, arg3 - -class59.field812 - var25);
                                }
                            }
                        }
                    }
                }
                if (var23.field227 != null && (var7 >= class132.field2322 || class21.field251 == 0 || class21.field251 == 3 || class21.field251 == 1 && class252.method1661(-125, ((class121) var23).field2000))) {
                    class32.method210(107, var23.method97(-116), arg5 >> 1, arg2 >> 1, arg1, var23, arg0);
                    if (class178.field3123 > -1 && ~class47.field620 > ~class51.field700) {
                        class51.field696[class47.field620] = class123.field2028.method922(var23.field227) / 2;
                        class51.field695[class47.field620] = class123.field2028.field2393;
                        class51.field689[class47.field620] = class178.field3123;
                        class51.field692[class47.field620] = class59.field812;
                        class51.field693[class47.field620] = var23.field215;
                        class51.field691[class47.field620] = var23.field173;
                        class51.field694[class47.field620] = var23.field185;
                        class51.field688[class47.field620] = var23.field227;
                        ++class47.field620;
                    }
                }
                if (~var23.field191 < ~class133.field2326) {
                    class32.method210(116, var23.method97(-111) + 15, arg5 >> 1, arg2 >> 1, arg1, var23, arg0);
                    if (class178.field3123 > -1) {
                        class216.method1405(class178.field3123 + arg4 + -15, class59.field812 + -3 + arg3, var23.field199, 5, 65280);
                        class216.method1405(class178.field3123 + arg4 + -15 - -var23.field199, class59.field812 + -3 + arg3, 30 - var23.field199, 5, 16711680);
                    }
                }
                for (int var33 = 0; ~var33 > -5; ++var33) {
                    if (~class133.field2326 > ~var23.field226[var33]) {
                        class32.method210(110, var23.method97(-103) / 2, arg5 >> 1, arg2 >> 1, arg1, var23, arg0);
                        if (~class178.field3123 < 0) {
                            if (~var33 == -2) {
                                class59.field812 -= 20;
                            }
                            if (~var33 == -3) {
                                class178.field3123 -= 15;
                                class59.field812 -= 10;
                            }
                            if (~var33 == -4) {
                                class59.field812 -= 10;
                                class178.field3123 += 15;
                            }
                            class255.field4424[var23.field222[var33]].method73(arg4 + -12 + class178.field3123, arg3 - 12 + class59.field812);
                            class166.field2832.method925(class128.method867((byte) 78, var23.field163[var33]), class178.field3123 + arg4 - 1, arg3 + 3 - -class59.field812, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg6 != 24124) {
            field4492 = null;
        }
        for (int var8 = 0; ~var8 > ~class47.field620; ++var8) {
            int var9 = class51.field692[var8];
            int var10 = class51.field689[var8];
            int var11 = class51.field696[var8];
            int var12 = class51.field695[var8];
            boolean var13 = true;
            while (var13) {
                var13 = false;
                for (int var22 = 0; ~var22 > ~var8; ++var22) {
                    if (~(class51.field692[var22] - class51.field695[var22]) > ~(var9 + 2) && ~(class51.field692[var22] + 2) < ~(-var12 + var9) && -var11 + var10 < class51.field696[var22] + class51.field689[var22] && var10 + var11 > class51.field689[var22] - class51.field696[var22] && ~var9 < ~(class51.field692[var22] + -class51.field695[var22])) {
                        var13 = true;
                        var9 = class51.field692[var22] + -class51.field695[var22];
                    }
                }
            }
            class178.field3123 = class51.field689[var8];
            class59.field812 = class51.field692[var8] = var9;
            class168 var14 = class51.field688[var8];
            if (class42.field554 != 0) {
                class123.field2028.method925(var14, class178.field3123 + arg4, class59.field812 + arg3, 16776960, 0);
            } else {
                int var15 = 16776960;
                if (class51.field693[var8] < 6) {
                    var15 = class36.field449[class51.field693[var8]];
                }
                if (~class51.field693[var8] == -7) {
                    var15 = class237.field4073 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class51.field693[var8] == 7) {
                    var15 = class237.field4073 % 20 >= 10 ? 65535 : 255;
                }
                if (class51.field693[var8] == 8) {
                    var15 = ~(class237.field4073 % 20) > -11 ? 45056 : 8454016;
                }
                if (class51.field693[var8] == 9) {
                    int var16 = -class51.field694[var8] + 150;
                    if (var16 < 50) {
                        var15 = 16711680 - -(var16 * 1280);
                    } else if (~var16 <= -101) {
                        if (var16 < 150) {
                            var15 = var16 * 5 - 500 + 65280;
                        }
                    } else {
                        var15 = 16776960 - (var16 + -50) * 327680;
                    }
                }
                if (~class51.field693[var8] == -11) {
                    int var17 = -class51.field694[var8] + 150;
                    if (~var17 > -51) {
                        var15 = var17 * 5 + 16711680;
                    } else if (~var17 > -101) {
                        var15 = 16711935 - (var17 + -50) * 327680;
                    } else if (~var17 > -151) {
                        var15 = -(var17 * 5) + 255 - -500 + (-32768000 - -(var17 * 327680));
                    }
                }
                if (class51.field693[var8] == 11) {
                    int var18 = -class51.field694[var8] + 150;
                    if (var18 >= 50) {
                        if (~var18 > -101) {
                            var15 = var18 * 327685 + -16318970;
                        } else if (var18 < 150) {
                            var15 = -((var18 - 100) * 327680) + 16777215;
                        }
                    } else {
                        var15 = 16777215 - var18 * 327685;
                    }
                }
                if (~class51.field691[var8] == -1) {
                    class123.field2028.method925(var14, arg4 - -class178.field3123, class59.field812 + arg3, var15, 0);
                }
                if (class51.field691[var8] == 1) {
                    class123.field2028.method938(var14, class178.field3123 + arg4, class59.field812 + arg3, var15, 0, class237.field4073);
                }
                if (class51.field691[var8] == 2) {
                    class123.field2028.method935(var14, class178.field3123 + arg4, class59.field812 + arg3, var15, 0, class237.field4073);
                }
                if (~class51.field691[var8] == -4) {
                    class123.field2028.method921(var14, class178.field3123 + arg4, class59.field812 + arg3, var15, 0, class237.field4073, -class51.field694[var8] + 150);
                }
                if (~class51.field691[var8] == -5) {
                    int var19 = (-class51.field694[var8] + 150) * (100 + class123.field2028.method922(var14)) / 150;
                    class216.method1408(class178.field3123 + arg4 + -50, arg3, class178.field3123 + arg4 + 50, arg2 + arg3);
                    class123.field2028.method941(var14, class178.field3123 - -50 + arg4 - var19, class59.field812 + arg3, var15, 0);
                    class216.method1403(arg4, arg3, arg4 + arg5, arg2 + arg3);
                }
                if (class51.field691[var8] == 5) {
                    int var20 = -class51.field694[var8] + 150;
                    class216.method1408(arg4, -class123.field2028.field2393 + arg3 - (-class59.field812 + 1), arg4 + arg5, class59.field812 + arg3 + 5);
                    int var21 = 0;
                    if (var20 >= 25) {
                        if (~var20 < -126) {
                            var21 = var20 + -125;
                        }
                    } else {
                        var21 = var20 + -25;
                    }
                    class123.field2028.method925(var14, class178.field3123 + arg4, arg3 + var21 + class59.field812, var15, 0);
                    class216.method1403(arg4, arg3, arg4 - -arg5, arg3 - -arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILog;B)V")
    public static final void method1716(int arg0, class18 arg1, byte arg2) {
        ++field4491;
        if (arg2 == 71) {
            if (arg1.field214 > class133.field2326) {
                class185.method1209(arg1, (byte) -114);
            } else if (arg1.field209 < class133.field2326) {
                class120.method818(-14187, arg1);
            } else {
                class133.method896(arg1, (byte) 127);
            }
            if (~arg1.field190 > -129 || ~arg1.field166 > -129 || arg1.field190 >= 13184 || arg1.field166 >= 13184) {
                arg1.field198 = -1;
                arg1.field166 = arg1.field219[0] * 128 + arg1.field171 * 64;
                arg1.field216 = -1;
                arg1.field190 = arg1.field206[0] * 128 - -(arg1.field171 * 64);
                arg1.field214 = 0;
                arg1.field209 = 0;
                arg1.method96((byte) -116);
            }
            if (class7.field85 == arg1 && (arg1.field190 < 1536 || ~arg1.field166 > -1537 || arg1.field190 >= 11776 || arg1.field166 >= 11776)) {
                arg1.field209 = 0;
                arg1.field216 = -1;
                arg1.field198 = -1;
                arg1.field214 = 0;
                arg1.field166 = arg1.field219[0] * 128 + arg1.field171 * 64;
                arg1.field190 = arg1.field206[0] * 128 + arg1.field171 * 64;
                arg1.method96((byte) -96);
            }
            class198.method1273(arg1, (byte) -25);
            class71.method483(-22690, arg1);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field4493;
        int[] var3 = super.field1872.method182((byte) -118, arg0);
        if (arg1 < 37) {
            field4494 = null;
        }
        if (super.field1872.field341) {
            int[] var4 = this.method792(0, 0, arg0);
            for (int var5 = 0; var5 < class130.field2297; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class257() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field4488;
        if (arg0 == 107) {
            if (arg2 == 0) {
                super.field1879 = ~arg1.method758(true) == -2;
            }
        }
    }
}
