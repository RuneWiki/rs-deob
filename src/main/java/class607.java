import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class607 extends class384 {

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "F")
    private float field8631 = 0.0F;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Lwt;")
    private class309 field8630;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field8625 = 0;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field8623 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field8628;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB)V")
    public final void method30(boolean arg0, byte arg1) {
        ++field8628;
        if (arg1 < 78) {
            method3443((class691[][][]) null, -111, false, 102, (byte) -51, 59);
        }
        super.field5349.method2242(-88, class94.field989, class372.field4752);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Z")
    public final boolean method26(int arg0) {
        ++field8626;
        if (arg0 != 13326) {
            this.field8630 = null;
        }
        return this.field8630.method1845((byte) -42);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
    public final void method526(byte arg0) {
        if (~super.field5349.method2276(-16504) == -1) {
            class427 var2 = super.field5349.method2258(125);
            super.field5349.method2217(1, 93);
            class427 var3 = super.field5349.method2224((byte) 23);
            var3.method1028(var2);
            var3.method2672(0.125F, 1.0F, 24002, 0.125F);
            var3.method2666(this.field8631, 0.0F, 0.0F, (byte) -115);
            super.field5349.method2226(class235.field2799, -123);
            super.field5349.method2217(0, 108);
        }
        if (arg0 > -45) {
            this.field8631 = 0.8127199F;
        }
        ++field8629;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lln;Lwt;)V")
    public class607(class377 arg0, class309 arg1) {
        super(arg0);
        this.field8630 = arg1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public final void method31(byte arg0) {
        ++field8634;
        super.field5349.method2217(1, 48);
        super.field5349.method2242(-102, class372.field4752, class372.field4752);
        super.field5349.method2264(0, class424.field6157, (byte) 60);
        super.field5349.method2268(0, 69, class424.field6157);
        super.field5349.method2252(1, 0);
        super.field5349.method2207((byte) -61, (class596) null);
        super.field5349.method2217(0, 67);
        if (arg0 <= -18) {
            super.field5349.method2268(0, 26, class424.field6157);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
    public final void method24(boolean arg0, int arg1) {
        ++field8627;
        super.field5349.method2217(1, 102);
        super.field5349.method2242(arg1 ^ 44, class94.field989, class360.field4624);
        super.field5349.method2318((byte) 38, false, true, 0, class424.field6157);
        super.field5349.method2268(0, 102, class324.field4136);
        super.field5349.method2252(0, arg1 + 1);
        super.field5349.method2217(0, 102);
        super.field5349.method2257(-16777216, arg1 + -551);
        super.field5349.method2268(0, 63, class58.field582);
        if (arg1 != -1) {
            method3443((class691[][][]) null, 29, true, 8, (byte) -114, -91);
        }
        this.method526((byte) -112);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([[[Lcj;IZIBI)Z")
    public static final boolean method3443(class691[][][] arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        ++field8633;
        int var6 = 46 % ((arg4 - -60) / 44);
        byte var7 = arg2 ? 1 : (byte) (class188.field2231 & 255);
        if (~class637.field9155[class122.field1278][arg5][arg3] == ~var7) {
            return false;
        } else if (~(class100.field1043[class122.field1278][arg5][arg3] & 4) == -1) {
            return false;
        } else {
            byte var8 = 0;
            class605.field8612[var8] = arg5;
            int var9 = 0;
            int var36 = var8 + 1;
            class538.field7774[var8] = arg3;
            class637.field9155[class122.field1278][arg5][arg3] = var7;
            while (var36 != var9) {
                int var10 = class605.field8612[var9] & 65535;
                int var11 = class605.field8612[var9] >> 16 & 255;
                int var12 = 255 & class605.field8612[var9] >> 24;
                int var13 = class538.field7774[var9] & 65535;
                int var14 = (class538.field7774[var9] & 16760370) >> 16;
                var9 = 4095 & var9 + 1;
                boolean var15 = false;
                if ((4 & class100.field1043[class122.field1278][var10][var13]) == 0) {
                    var15 = true;
                }
                boolean var16 = false;
                label233: for (int var17 = class122.field1278 + 1; ~var17 >= -4; ++var17) {
                    if ((class100.field1043[var17][var10][var13] & 8) == 0) {
                        if (var15 && arg0[var17][var10][var13] != null) {
                            if (arg0[var17][var10][var13].field9728 != null) {
                                int var21 = class470.method2842(var11, false);
                                if (arg0[var17][var10][var13].field9728.field6996 == var21 || arg0[var17][var10][var13].field9725 != null && arg0[var17][var10][var13].field9725.field6996 == var21) {
                                    continue;
                                }
                                if (~var12 != -1) {
                                    int var22 = class470.method2842(var12, false);
                                    if (arg0[var17][var10][var13].field9728.field6996 == var22 || arg0[var17][var10][var13].field9725 != null && arg0[var17][var10][var13].field9725.field6996 == var22) {
                                        continue;
                                    }
                                }
                                if (~var14 != -1) {
                                    int var23 = class470.method2842(var14, false);
                                    if (arg0[var17][var10][var13].field9728.field6996 == var23 || arg0[var17][var10][var13].field9725 != null && ~arg0[var17][var10][var13].field9725.field6996 == ~var23) {
                                        continue;
                                    }
                                }
                            }
                            class691 var24 = arg0[var17][var10][var13];
                            if (var24.field9739 != null) {
                                for (class398 var25 = var24.field9739; var25 != null; var25 = var25.field5451) {
                                    class340 var26 = var25.field5449;
                                    if (var26 instanceof class281) {
                                        class281 var27 = (class281) var26;
                                        int var28 = var27.method1236((byte) -78);
                                        int var29 = var27.method1243((byte) 117);
                                        if (var28 == 21) {
                                            var28 = 19;
                                        }
                                        int var30 = var29 << 6 | var28;
                                        if (var11 == var30 || ~var12 != -1 && ~var12 == ~var30 || ~var14 != -1 && var14 == var30) {
                                            continue label233;
                                        }
                                    }
                                }
                            }
                        }
                        class691 var31 = arg0[var17][var10][var13];
                        if (var31 != null && var31.field9739 != null) {
                            for (class398 var32 = var31.field9739; var32 != null; var32 = var32.field5451) {
                                class340 var33 = var32.field5449;
                                if (~var33.field4395 != ~var33.field4390 || var33.field4402 != var33.field4387) {
                                    for (int var34 = var33.field4395; ~var33.field4390 <= ~var34; ++var34) {
                                        for (int var35 = var33.field4387; ~var33.field4402 <= ~var35; ++var35) {
                                            class637.field9155[var17][var34][var35] = var7;
                                        }
                                    }
                                }
                            }
                        }
                        class637.field9155[var17][var10][var13] = var7;
                        var16 = true;
                    }
                }
                if (var16) {
                    int var18 = class504.field7120[class122.field1278 + 1].method1671(var13, var10, (byte) 55);
                    if (~class11.field91[arg1] > ~var18) {
                        class11.field91[arg1] = var18;
                    }
                    int var19 = var10 << 9;
                    if (~class169.field1892[arg1] < ~var19) {
                        class169.field1892[arg1] = var19;
                    } else if (var19 > class368.field4706[arg1]) {
                        class368.field4706[arg1] = var19;
                    }
                    int var20 = var13 << 9;
                    if (~class200.field2371[arg1] >= ~var20) {
                        if (var20 > class219.field2538[arg1]) {
                            class219.field2538[arg1] = var20;
                        }
                    } else {
                        class200.field2371[arg1] = var20;
                    }
                }
                if (!var15) {
                    if (~var10 <= -2 && class637.field9155[class122.field1278][var10 + -1][var13] != var7) {
                        class605.field8612[var36] = class695.method3919(-754974720, class695.method3919(var10 + -1, 1179648));
                        class538.field7774[var36] = class695.method3919(var13, 1245184);
                        class637.field9155[class122.field1278][var10 + -1][var13] = var7;
                        var36 = 4095 & var36 + 1;
                    }
                    ++var13;
                    if (class153.field1677 > var13) {
                        if (var10 + -1 >= 0 && class637.field9155[class122.field1278][var10 + -1][var13] != var7 && ~(4 & class100.field1043[class122.field1278][var10][var13]) == -1 && ~(4 & class100.field1043[class122.field1278][var10 - 1][var13 - 1]) == -1) {
                            class605.field8612[var36] = class695.method3919(class695.method3919(1179648, var10 + -1), 1375731712);
                            class538.field7774[var36] = class695.method3919(1245184, var13);
                            class637.field9155[class122.field1278][var10 + -1][var13] = var7;
                            var36 = var36 - -1 & 4095;
                        }
                        if (class637.field9155[class122.field1278][var10][var13] != var7) {
                            class605.field8612[var36] = class695.method3919(class695.method3919(5373952, var10), 318767104);
                            class538.field7774[var36] = class695.method3919(var13, 5439488);
                            class637.field9155[class122.field1278][var10][var13] = var7;
                            var36 = 4095 & var36 + 1;
                        }
                        if (~class489.field6976 < ~(var10 - -1) && class637.field9155[class122.field1278][var10 - -1][var13] != var7 && (class100.field1043[class122.field1278][var10][var13] & 4) == 0 && (4 & class100.field1043[class122.field1278][var10 - -1][var13 + -1]) == 0) {
                            class605.field8612[var36] = class695.method3919(-1845493760, class695.method3919(5373952, var10 - -1));
                            class538.field7774[var36] = class695.method3919(5439488, var13);
                            class637.field9155[class122.field1278][var10 + 1][var13] = var7;
                            var36 = 4095 & var36 + 1;
                        }
                    }
                    --var13;
                    if (class489.field6976 > var10 + 1 && ~class637.field9155[class122.field1278][var10 + 1][var13] != ~var7) {
                        class605.field8612[var36] = class695.method3919(1392508928, class695.method3919(9568256, var10 + 1));
                        class538.field7774[var36] = class695.method3919(9633792, var13);
                        var36 = var36 - -1 & 4095;
                        class637.field9155[class122.field1278][var10 + 1][var13] = var7;
                    }
                    --var13;
                    if (~var13 <= -1) {
                        if (~(var10 + -1) <= -1 && ~class637.field9155[class122.field1278][var10 + -1][var13] != ~var7 && (4 & class100.field1043[class122.field1278][var10][var13]) == 0 && ~(class100.field1043[class122.field1278][var10 + -1][var13 + 1] & 4) == -1) {
                            class605.field8612[var36] = class695.method3919(class695.method3919(13762560, var10 + -1), 301989888);
                            class538.field7774[var36] = class695.method3919(var13, 13828096);
                            class637.field9155[class122.field1278][var10 + -1][var13] = var7;
                            var36 = 4095 & var36 + 1;
                        }
                        if (class637.field9155[class122.field1278][var10][var13] != var7) {
                            class605.field8612[var36] = class695.method3919(class695.method3919(13762560, var10), -1828716544);
                            class538.field7774[var36] = class695.method3919(var13, 13828096);
                            var36 = 4095 & var36 + 1;
                            class637.field9155[class122.field1278][var10][var13] = var7;
                        }
                        if (~(var10 - -1) > ~class489.field6976 && ~class637.field9155[class122.field1278][var10 + 1][var13] != ~var7 && (4 & class100.field1043[class122.field1278][var10][var13]) == 0 && ~(4 & class100.field1043[class122.field1278][var10 + 1][var13 + 1]) == -1) {
                            class605.field8612[var36] = class695.method3919(-771751936, class695.method3919(9568256, var10 - -1));
                            class538.field7774[var36] = class695.method3919(9633792, var13);
                            class637.field9155[class122.field1278][var10 + 1][var13] = var7;
                            var36 = 4095 & var36 + 1;
                        }
                    }
                }
            }
            if (~class11.field91[arg1] != 999999) {
                class11.field91[arg1] += 40;
                class169.field1892[arg1] -= 512;
                class368.field4706[arg1] += 512;
                class219.field2538[arg1] += 512;
                class200.field2371[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)V")
    public final void method32(int arg0, int arg1, boolean arg2) {
        ++field8624;
        super.field5349.method2217(1, 55);
        if ((arg0 & 128) == 0) {
            if ((arg1 & 1) == 1) {
                if (!this.field8630.field3849) {
                    int var4 = super.field5349.field5152 % 4000 * 16 / 4000;
                    super.field5349.method2207((byte) -61, this.field8630.field3843[var4]);
                } else {
                    this.field8631 = (float) (super.field5349.field5152 % 4000) / 4000.0F;
                    super.field5349.method2207((byte) -61, this.field8630.field3846);
                }
            } else if (this.field8630.field3849) {
                super.field5349.method2207((byte) -61, this.field8630.field3846);
            } else {
                super.field5349.method2207((byte) -61, this.field8630.field3843[0]);
            }
        } else {
            super.field5349.method2207((byte) -61, (class596) null);
        }
        super.field5349.method2217(0, 112);
        if (!arg2) {
            field8625 = 25;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lke;BI)V")
    public final void method27(class596 arg0, byte arg1, int arg2) {
        if (arg1 == 123) {
            super.field5349.method2207((byte) -61, arg0);
            ++field8632;
        }
    }
}
