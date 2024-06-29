import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class202 extends class89 {

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    private int field3609 = 2048;

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "I")
    private int field3611 = 0;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "I")
    private int field3619 = 4096;

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
    private int field3620 = 12288;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
    private int field3621 = 8192;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    private int field3618 = 0;

    @OriginalMember(owner = "client!bi", name = "ib", descriptor = "I")
    private int field3625 = 2048;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "Lha;")
    public static class46 field3608 = class271.method1828(")3", -46);

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "Lha;")
    public static class46 field3612 = class271.method1828("0(U", -46);

    @OriginalMember(owner = "client!bi", name = "lb", descriptor = "Lha;")
    public static class46 field3628 = class271.method1828("Wordpack geladen)3", -46);

    @OriginalMember(owner = "client!bi", name = "jb", descriptor = "Lha;")
    public static class46 field3626 = class271.method1828("M", -46);

    @OriginalMember(owner = "client!bi", name = "hb", descriptor = "Lha;")
    private static class46 field3624 = class271.method1828(" x ", -46);

    @OriginalMember(owner = "client!bi", name = "ob", descriptor = "Lha;")
    private static class46 field3631 = class271.method1828("Examine", -46);

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "Lha;")
    public static class46 field3622 = field3631;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!bi", name = "kb", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!bi", name = "nb", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!bi", name = "mb", descriptor = "[Lmb;")
    public static class119[] field3629;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        ++field3615;
        if (arg0) {
            class49.method365((byte) 127);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIILj;IJ)Z")
    public static final boolean method1430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class139 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class120.method955(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int var3 = -97 / ((arg1 - 51) / 44);
        int[] var4 = super.field1688.method936(1, arg0);
        ++field3627;
        if (super.field1688.field2200) {
            int var5 = class87.field1652[arg0] + -2048;
            for (int var6 = 0; ~class241.field4284 < ~var6; ++var6) {
                int var7 = this.field3611 + var5;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = this.field3625 + var5;
                int var10 = ~var8 >= -2049 ? var8 : var8 - 4096;
                int var11 = class259.field4523[var6] + -2048;
                int var12 = var11 - -this.field3609;
                int var13 = var12 < -2048 ? var12 + 4096 : var12;
                int var14 = var13 > 2048 ? var13 + -4096 : var13;
                int var15 = var11 - -this.field3618;
                int var16 = var15 < -2048 ? var15 + 4096 : var15;
                int var17 = var9 < -2048 ? var9 - -4096 : var9;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                int var19 = var16 <= 2048 ? var16 : var16 + -4096;
                var4[var6] = !this.method1433(var14, var10, (byte) 41) && !this.method1435(var18, -49, var19) ? 0 : 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public static void method1431(int arg0) {
        field3624 = null;
        if (arg0 != 100000) {
            method1431(-76);
        }
        field3612 = null;
        field3622 = null;
        field3608 = null;
        field3629 = null;
        field3626 = null;
        field3631 = null;
        field3628 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field3621 = arg0.method545((byte) 92);
                                }
                            } else {
                                this.field3619 = arg0.method545((byte) -127);
                            }
                        } else {
                            this.field3620 = arg0.method545((byte) 94);
                        }
                    } else {
                        this.field3625 = arg0.method545((byte) 127);
                    }
                } else {
                    this.field3618 = arg0.method545((byte) -70);
                }
            } else {
                this.field3611 = arg0.method545((byte) -125);
            }
        } else {
            this.field3609 = arg0.method545((byte) -110);
        }
        ++field3614;
        if (arg1 != -641641492) {
            field3608 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZJ)V")
    public static final void method1432(boolean arg0, long arg1) {
        ++field3616;
        if (~arg1 != -1L) {
            if (!arg0) {
                for (int var3 = 0; ~var3 > ~class42.field714; ++var3) {
                    if (~class29.field562[var3] == ~arg1) {
                        --class42.field714;
                        for (int var4 = var3; ~var4 > ~class42.field714; ++var4) {
                            class29.field562[var4] = class29.field562[var4 + 1];
                            class221.field3891[var4] = class221.field3891[var4 + 1];
                        }
                        ++class208.field3734;
                        class14.field219 = class86.field1635;
                        class58.field967.method285((byte) -90, 43);
                        class58.field967.method578((byte) -120, arg1);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIB)Z")
    private final boolean method1433(int arg0, int arg1, byte arg2) {
        ++field3617;
        if (arg2 != 41) {
            field3629 = null;
        }
        int var4 = (-arg0 + arg1) * this.field3620 >> 12;
        int var5 = class142.field2594[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field3620;
        int var7 = (var6 << 12) / this.field3621;
        int var8 = this.field3619 * var7 >> 12;
        return var8 > arg0 - -arg1 && ~(-var8) > ~(arg0 + arg1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V")
    public static final void method1434(int arg0, boolean arg1) {
        ++field3623;
        if (arg0 >= 0) {
            int var2 = class4.field69[arg0];
            int var3 = class215.field3807[arg0];
            int var4 = (int) class31.field590[arg0];
            int var5 = class270.field4706[arg0];
            long var6 = class31.field590[arg0];
            if (~var3 <= -2001) {
                var3 -= 2000;
            }
            if (var3 == 20) {
                ++class71.field1238;
                class58.field967.method285((byte) -90, 46);
                class58.field967.method546((byte) 125, var4);
                class58.field967.method575(var2, 119);
                class58.field967.method547((byte) -67, var5);
                class194.field3488 = 0;
                class5.field81 = class13.method73(1506528624, var2);
                class119.field2235 = var5;
            }
            if (~var3 == -23) {
                class58.field967.method285((byte) -90, 141);
                ++class1.field12;
                class58.field967.method575(var2, 127);
                class58.field967.method546((byte) 104, var5);
                class58.field967.method546((byte) 124, var4);
                class194.field3488 = 0;
                class5.field81 = class13.method73(1506528624, var2);
                class119.field2235 = var5;
            }
            if (var3 == 29) {
                ++class176.field3164;
                boolean var8 = class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 0, 0, 0, false, 0);
                if (!var8) {
                    class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 1, 0, 0, false, 1);
                }
                class126.field2313 = 2;
                class78.field1493 = class100.field1850;
                class58.field964 = 0;
                class277.field4821 = class143.field2607;
                class58.field967.method285((byte) -90, 246);
                class58.field967.method547((byte) -67, var4);
                class58.field967.method547((byte) -67, class29.field567 + var5);
                class58.field967.method587(class222.field3903, -32389656);
                class58.field967.method590(class20.field265, 69);
                class58.field967.method547((byte) -67, class84.field1608);
                class58.field967.method546((byte) 97, class77.field1432 + var2);
            }
            if (var3 == 57) {
                ++class215.field3808;
                boolean var10 = class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 0, 0, 0, false, 0);
                if (!var10) {
                    class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 1, 0, 0, false, 1);
                }
                class78.field1493 = class100.field1850;
                class126.field2313 = 2;
                class277.field4821 = class143.field2607;
                class58.field964 = 0;
                class58.field967.method285((byte) -90, 242);
                class58.field967.method582(-39, class29.field567 + var5);
                class58.field967.method582(116, var4);
                class58.field967.method582(43, var2 - -class77.field1432);
            }
            if (~var3 == -49) {
                class26 var12 = class2.field29[var4];
                if (var12 != null) {
                    ++class124.field2283;
                    class112.method916(0, -10543, class277.field4824.field2523[0], var12.field2517[0], class277.field4824.field2517[0], var12.field2523[0], 2, 1, 0, 0, false, 1);
                    class58.field964 = 0;
                    class78.field1493 = class100.field1850;
                    class277.field4821 = class143.field2607;
                    class126.field2313 = 2;
                    class58.field967.method285((byte) -90, 194);
                    class58.field967.method587(class222.field3903, -32389656);
                    class58.field967.method581(true, class20.field265);
                    class58.field967.method546((byte) 102, class84.field1608);
                    class58.field967.method546((byte) 125, var4);
                }
            }
            if (~var3 == -37) {
                ++class176.field3159;
                boolean var13 = class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 0, 0, 0, false, 0);
                if (!var13) {
                    class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 1, 0, 0, false, 1);
                }
                class126.field2313 = 2;
                class78.field1493 = class100.field1850;
                class58.field964 = 0;
                class277.field4821 = class143.field2607;
                class58.field967.method285((byte) -90, 220);
                class58.field967.method587(class29.field567 + var5, -32389656);
                class58.field967.method582(-99, class77.field1432 + var2);
                class58.field967.method582(-114, var4);
            }
            if (~var3 == -29) {
                class81 var15 = class1.field6[var4];
                if (var15 != null) {
                    ++class200.field3574;
                    class112.method916(0, -10543, class277.field4824.field2523[0], var15.field2517[0], class277.field4824.field2517[0], var15.field2523[0], 2, 1, 0, 0, false, 1);
                    class78.field1493 = class100.field1850;
                    class126.field2313 = 2;
                    class277.field4821 = class143.field2607;
                    class58.field964 = 0;
                    class58.field967.method285((byte) -90, 56);
                    class58.field967.method582(6, var4);
                }
            }
            if (~var3 == -13 && class244.method1670((byte) 109, var2, var6, var5)) {
                class58.field967.method285((byte) -90, 254);
                class58.field967.method547((byte) -67, class275.field4793);
                class58.field967.method546((byte) 116, class29.field567 + var5);
                ++class220.field3872;
                class58.field967.method546((byte) 101, var2 - -class77.field1432);
                class58.field967.method544(class194.field3477, (byte) -104);
                class58.field967.method547((byte) -67, Integer.MAX_VALUE & (int) (var6 >>> 32));
            }
            if (~var3 == -50) {
                class26 var16 = class2.field29[var4];
                if (var16 != null) {
                    ++class167.field2941;
                    class112.method916(0, -10543, class277.field4824.field2523[0], var16.field2517[0], class277.field4824.field2517[0], var16.field2523[0], 2, 1, 0, 0, false, 1);
                    class78.field1493 = class100.field1850;
                    class126.field2313 = 2;
                    class58.field964 = 0;
                    class277.field4821 = class143.field2607;
                    class58.field967.method285((byte) -90, 137);
                    class58.field967.method587(var4, -32389656);
                }
            }
            if (~var3 == -12) {
                class81 var17 = class1.field6[var4];
                if (var17 != null) {
                    class112.method916(0, -10543, class277.field4824.field2523[0], var17.field2517[0], class277.field4824.field2517[0], var17.field2523[0], 2, 1, 0, 0, false, 1);
                    class58.field964 = 0;
                    ++class208.field3730;
                    class126.field2313 = 2;
                    class277.field4821 = class143.field2607;
                    class78.field1493 = class100.field1850;
                    class58.field967.method285((byte) -90, 172);
                    class58.field967.method547((byte) -67, var4);
                }
            }
            if (var3 == 13) {
                class244.method1670((byte) -71, var2, var6, var5);
                class58.field967.method285((byte) -90, 191);
                class58.field967.method582(124, var5 - -class29.field567);
                ++class242.field4299;
                class58.field967.method547((byte) -67, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class58.field967.method587(class77.field1432 + var2, -32389656);
            }
            if (var3 == 19) {
                ++class103.field1865;
                boolean var18 = class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 0, 0, 0, false, 0);
                if (!var18) {
                    class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 1, 0, 0, false, 1);
                }
                class126.field2313 = 2;
                class277.field4821 = class143.field2607;
                class58.field964 = 0;
                class78.field1493 = class100.field1850;
                class58.field967.method285((byte) -90, 214);
                class58.field967.method582(115, var2 - -class77.field1432);
                class58.field967.method587(class29.field567 + var5, -32389656);
                class58.field967.method582(-10, var4);
            }
            if (~var3 == -19) {
                class198.method1414(51);
            }
            if (~var3 == -24) {
                ++class129.field2370;
                class244.method1670((byte) -7, var2, var6, var5);
                class58.field967.method285((byte) -90, 105);
                class58.field967.method546((byte) 125, var5 - -class29.field567);
                class58.field967.method587(class77.field1432 + var2, -32389656);
                class58.field967.method587((int) (var6 >>> 32) & Integer.MAX_VALUE, -32389656);
            }
            if (~var3 == -40) {
                class58.field967.method285((byte) -90, 230);
                ++class219.field3866;
                class58.field967.method546((byte) 97, var5);
                class58.field967.method582(113, var4);
                class58.field967.method581(true, var2);
                class194.field3488 = 0;
                class5.field81 = class13.method73(1506528624, var2);
                class119.field2235 = var5;
            }
            if (var3 == 47) {
                class81 var20 = class1.field6[var4];
                if (var20 != null) {
                    class112.method916(0, -10543, class277.field4824.field2523[0], var20.field2517[0], class277.field4824.field2517[0], var20.field2523[0], 2, 1, 0, 0, false, 1);
                    class126.field2313 = 2;
                    class78.field1493 = class100.field1850;
                    ++class115.field2174;
                    class58.field964 = 0;
                    class277.field4821 = class143.field2607;
                    class58.field967.method285((byte) -90, 41);
                    class58.field967.method587(var4, -32389656);
                }
            }
            if (var3 == 3 || var3 == 1005) {
                class61.method417(199959756, var4, var2, var5, class162.field2855[arg0]);
            }
            if (var3 == 24) {
                class24 var21 = class108.method841(var2, var5, -1);
                if (var21 != null) {
                    class20.method103(-56);
                    class46.method310(var5, var2, (byte) -120, class189.method1370(client.method1811(var21), false));
                    class31.field585 = 0;
                    class64.field1083 = class57.method394(108, var21);
                    if (class64.field1083 == null) {
                        class64.field1083 = class264.field4594;
                    }
                    if (var21.field480) {
                        class16.field232 = class109.method855(0, new class46[] { var21.field389, class39.field686 });
                        return;
                    }
                    class16.field232 = class109.method855(0, new class46[] { class273.field4769, var21.field472, class39.field686 });
                }
            } else {
                if (var3 == 1006) {
                    class277.field4821 = class143.field2607;
                    class126.field2313 = 2;
                    class58.field964 = 0;
                    ++class51.field884;
                    class78.field1493 = class100.field1850;
                    class58.field967.method285((byte) -90, 147);
                    class58.field967.method547((byte) -67, var4);
                }
                if (var3 == 1 && class244.method1670((byte) -36, var2, var6, var5)) {
                    class58.field967.method285((byte) -90, 77);
                    class58.field967.method544(class20.field265, (byte) -104);
                    ++class134.field2416;
                    class58.field967.method587(class77.field1432 + var2, -32389656);
                    class58.field967.method546((byte) 107, var5 - -class29.field567);
                    class58.field967.method546((byte) 99, class84.field1608);
                    class58.field967.method547((byte) -67, class222.field3903);
                    class58.field967.method546((byte) 104, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                }
                if (var3 == 32) {
                    ++class149.field2667;
                    class58.field967.method285((byte) -90, 102);
                    class58.field967.method547((byte) -67, class222.field3903);
                    class58.field967.method582(-25, var4);
                    class58.field967.method547((byte) -67, class84.field1608);
                    class58.field967.method575(class20.field265, 120);
                    class58.field967.method590(var2, 47);
                    class58.field967.method587(var5, -32389656);
                    class194.field3488 = 0;
                    class5.field81 = class13.method73(1506528624, var2);
                    class119.field2235 = var5;
                }
                if (var3 == 40) {
                    class81 var22 = class1.field6[var4];
                    if (var22 != null) {
                        ++class254.field4458;
                        class112.method916(0, -10543, class277.field4824.field2523[0], var22.field2517[0], class277.field4824.field2517[0], var22.field2523[0], 2, 1, 0, 0, false, 1);
                        class126.field2313 = 2;
                        class277.field4821 = class143.field2607;
                        class78.field1493 = class100.field1850;
                        class58.field964 = 0;
                        class58.field967.method285((byte) -90, 142);
                        class58.field967.method582(119, var4);
                        class58.field967.method547((byte) -67, class84.field1608);
                        class58.field967.method587(class222.field3903, -32389656);
                        class58.field967.method581(true, class20.field265);
                    }
                }
                if (~var3 == -22) {
                    class26 var23 = class2.field29[var4];
                    if (var23 != null) {
                        class112.method916(0, -10543, class277.field4824.field2523[0], var23.field2517[0], class277.field4824.field2517[0], var23.field2523[0], 2, 1, 0, 0, false, 1);
                        class78.field1493 = class100.field1850;
                        class126.field2313 = 2;
                        ++class63.field1061;
                        class58.field964 = 0;
                        class277.field4821 = class143.field2607;
                        class58.field967.method285((byte) -90, 217);
                        class58.field967.method546((byte) 106, var4);
                    }
                }
                if (var3 == 37) {
                    boolean var24 = class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 0, 0, 0, false, 0);
                    if (!var24) {
                        class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 1, 0, 0, false, 1);
                    }
                    class58.field964 = 0;
                    class78.field1493 = class100.field1850;
                    class277.field4821 = class143.field2607;
                    class126.field2313 = 2;
                    ++class277.field4832;
                    class58.field967.method285((byte) -90, 116);
                    class58.field967.method590(class194.field3477, 48);
                    class58.field967.method582(-31, class275.field4793);
                    class58.field967.method582(121, var4);
                    class58.field967.method587(class29.field567 + var5, -32389656);
                    class58.field967.method547((byte) -67, class77.field1432 + var2);
                }
                if (var3 == 59) {
                    ++class46.field782;
                    class58.field967.method285((byte) -90, 4);
                    class58.field967.method582(-19, var5);
                    class58.field967.method546((byte) 101, var4);
                    class58.field967.method590(var2, 31);
                    class194.field3488 = 0;
                    class5.field81 = class13.method73(1506528624, var2);
                    class119.field2235 = var5;
                }
                if (var3 == 7) {
                    class26 var26 = class2.field29[var4];
                    if (var26 != null) {
                        ++class199.field3559;
                        class112.method916(0, -10543, class277.field4824.field2523[0], var26.field2517[0], class277.field4824.field2517[0], var26.field2523[0], 2, 1, 0, 0, false, 1);
                        class58.field964 = 0;
                        class78.field1493 = class100.field1850;
                        class126.field2313 = 2;
                        class277.field4821 = class143.field2607;
                        class58.field967.method285((byte) -90, 164);
                        class58.field967.method547((byte) -67, var4);
                        class58.field967.method582(-69, class275.field4793);
                        class58.field967.method581(true, class194.field3477);
                    }
                }
                if (~var3 == -42) {
                    class81 var27 = class1.field6[var4];
                    if (var27 != null) {
                        ++class193.field3468;
                        class112.method916(0, -10543, class277.field4824.field2523[0], var27.field2517[0], class277.field4824.field2517[0], var27.field2523[0], 2, 1, 0, 0, false, 1);
                        class126.field2313 = 2;
                        class78.field1493 = class100.field1850;
                        class277.field4821 = class143.field2607;
                        class58.field964 = 0;
                        class58.field967.method285((byte) -90, 247);
                        class58.field967.method582(118, var4);
                    }
                }
                if (~var3 == -36) {
                    class81 var28 = class1.field6[var4];
                    if (var28 != null) {
                        ++class6.field92;
                        class112.method916(0, -10543, class277.field4824.field2523[0], var28.field2517[0], class277.field4824.field2517[0], var28.field2523[0], 2, 1, 0, 0, false, 1);
                        class126.field2313 = 2;
                        class78.field1493 = class100.field1850;
                        class58.field964 = 0;
                        class277.field4821 = class143.field2607;
                        class58.field967.method285((byte) -90, 1);
                        class58.field967.method587(var4, -32389656);
                    }
                }
                if (~var3 == -3) {
                    class58.field967.method285((byte) -90, 36);
                    ++class220.field3868;
                    class58.field967.method546((byte) 102, var5);
                    class58.field967.method590(var2, 86);
                    class58.field967.method547((byte) -67, var4);
                    class194.field3488 = 0;
                    class5.field81 = class13.method73(1506528624, var2);
                    class119.field2235 = var5;
                }
                if (~var3 == -9) {
                    class20.method103(-125);
                    class24 var29 = class13.method73(1506528624, var2);
                    class222.field3903 = var5;
                    class84.field1608 = var4;
                    class31.field585 = 1;
                    class20.field265 = var2;
                    class226.method1549(false, var29);
                    class32.field606 = class109.method855(0, new class46[] { class95.field1776, class80.method633(var4, 0).field1213, class39.field686 });
                    if (class32.field606 == null) {
                        class32.field606 = class194.field3478;
                    }
                } else {
                    if (~var3 == -11) {
                        class81 var30 = class1.field6[var4];
                        if (var30 != null) {
                            class112.method916(0, -10543, class277.field4824.field2523[0], var30.field2517[0], class277.field4824.field2517[0], var30.field2523[0], 2, 1, 0, 0, false, 1);
                            class58.field964 = 0;
                            class126.field2313 = 2;
                            ++class251.field4427;
                            class78.field1493 = class100.field1850;
                            class277.field4821 = class143.field2607;
                            class58.field967.method285((byte) -90, 187);
                            class58.field967.method587(var4, -32389656);
                        }
                    }
                    if (var3 == 30) {
                        class58.field967.method285((byte) -90, 193);
                        ++class63.field1063;
                        class58.field967.method544(var2, (byte) -104);
                        class58.field967.method547((byte) -67, var4);
                        class58.field967.method546((byte) 103, var5);
                        class194.field3488 = 0;
                        class5.field81 = class13.method73(1506528624, var2);
                        class119.field2235 = var5;
                    }
                    if (~var3 == -35) {
                        class58.field967.method285((byte) -90, 229);
                        ++class203.field3638;
                        class58.field967.method581(true, var2);
                        class24 var31 = class13.method73(1506528624, var2);
                        if (var31.field456 != null && ~var31.field456[0][0] == -6) {
                            int var32 = var31.field456[0][1];
                            if (~class29.field568[var32] != ~var31.field370[0]) {
                                class29.field568[var32] = var31.field370[0];
                                class52.method379(var32, 800);
                            }
                        }
                    }
                    if (~var3 == -27) {
                        class81 var33 = class1.field6[var4];
                        if (var33 != null) {
                            ++class93.field1757;
                            class112.method916(0, -10543, class277.field4824.field2523[0], var33.field2517[0], class277.field4824.field2517[0], var33.field2523[0], 2, 1, 0, 0, false, 1);
                            class126.field2313 = 2;
                            class58.field964 = 0;
                            class277.field4821 = class143.field2607;
                            class78.field1493 = class100.field1850;
                            class58.field967.method285((byte) -90, 216);
                            class58.field967.method547((byte) -67, var4);
                        }
                    }
                    if (~var3 == -1008) {
                        class24 var34 = class13.method73(1506528624, var2);
                        if (var34 != null && var34.field483[var5] >= 100000) {
                            class155.method1136(102, class85.field1613, 0, class109.method855(0, new class46[] { class115.method932(false, var34.field483[var5]), field3624, class80.method633(var4, 0).field1213 }));
                        } else {
                            ++class264.field4591;
                            class58.field967.method285((byte) -90, 163);
                            class58.field967.method546((byte) 103, var4);
                        }
                        class194.field3488 = 0;
                        class5.field81 = class13.method73(1506528624, var2);
                        class119.field2235 = var5;
                    }
                    if (var3 == 42) {
                        class81 var35 = class1.field6[var4];
                        if (var35 != null) {
                            class112.method916(0, -10543, class277.field4824.field2523[0], var35.field2517[0], class277.field4824.field2517[0], var35.field2523[0], 2, 1, 0, 0, false, 1);
                            class126.field2313 = 2;
                            ++class26.field523;
                            class277.field4821 = class143.field2607;
                            class58.field964 = 0;
                            class78.field1493 = class100.field1850;
                            class58.field967.method285((byte) -90, 90);
                            class58.field967.method546((byte) 114, var4);
                            class58.field967.method590(class194.field3477, 113);
                            class58.field967.method582(-46, class275.field4793);
                        }
                    }
                    if (~var3 == -1004) {
                        ++class13.field205;
                        class244.method1670((byte) 123, var2, var6, var5);
                        class58.field967.method285((byte) -90, 23);
                        class58.field967.method587(Integer.MAX_VALUE & (int) (var6 >>> 32), -32389656);
                        class58.field967.method582(44, class77.field1432 + var2);
                        class58.field967.method587(class29.field567 + var5, -32389656);
                    }
                    if (~var3 == -1003) {
                        class126.field2313 = 2;
                        ++class264.field4591;
                        class78.field1493 = class100.field1850;
                        class277.field4821 = class143.field2607;
                        class58.field964 = 0;
                        class58.field967.method285((byte) -90, 163);
                        class58.field967.method546((byte) 122, var4);
                    }
                    if (~var3 == -32 && class1.field13 == null) {
                        class237.method1628(var2, 241, var5);
                        class1.field13 = class108.method841(var2, var5, -1);
                        class226.method1549(false, class1.field13);
                    }
                    if (~var3 == -1002) {
                        class126.field2313 = 2;
                        class78.field1493 = class100.field1850;
                        class58.field964 = 0;
                        class277.field4821 = class143.field2607;
                        class26 var36 = class2.field29[var4];
                        if (var36 != null) {
                            class78 var37 = var36.field511;
                            if (var37.field1448 != null) {
                                var37 = var37.method620(-17713);
                            }
                            if (var37 != null) {
                                ++class250.field4419;
                                class58.field967.method285((byte) -90, 111);
                                class58.field967.method546((byte) 108, var37.field1445);
                            }
                        }
                    }
                    if (var3 == 4) {
                        class244.method1670((byte) 123, var2, var6, var5);
                        ++class103.field1871;
                        class58.field967.method285((byte) -90, 26);
                        class58.field967.method546((byte) 118, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                        class58.field967.method547((byte) -67, var2 - -class77.field1432);
                        class58.field967.method547((byte) -67, class29.field567 + var5);
                    }
                    if (var3 == 33) {
                        class26 var38 = class2.field29[var4];
                        if (var38 != null) {
                            class112.method916(0, -10543, class277.field4824.field2523[0], var38.field2517[0], class277.field4824.field2517[0], var38.field2523[0], 2, 1, 0, 0, false, 1);
                            ++class242.field4306;
                            class277.field4821 = class143.field2607;
                            class78.field1493 = class100.field1850;
                            class126.field2313 = 2;
                            class58.field964 = 0;
                            class58.field967.method285((byte) -90, 181);
                            class58.field967.method546((byte) 104, var4);
                        }
                    }
                    if (~var3 == -59) {
                        class244.method1670((byte) 98, var2, var6, var5);
                        ++class150.field2676;
                        class58.field967.method285((byte) -90, 106);
                        class58.field967.method587(class29.field567 + var5, -32389656);
                        class58.field967.method587(Integer.MAX_VALUE & (int) (var6 >>> 32), -32389656);
                        class58.field967.method547((byte) -67, class77.field1432 + var2);
                    }
                    if (var3 == 45) {
                        class26 var39 = class2.field29[var4];
                        if (var39 != null) {
                            ++class249.field4398;
                            class112.method916(0, -10543, class277.field4824.field2523[0], var39.field2517[0], class277.field4824.field2517[0], var39.field2523[0], 2, 1, 0, 0, false, 1);
                            class78.field1493 = class100.field1850;
                            class58.field964 = 0;
                            class277.field4821 = class143.field2607;
                            class126.field2313 = 2;
                            class58.field967.method285((byte) -90, 189);
                            class58.field967.method582(13, var4);
                        }
                    }
                    if (~var3 == -51) {
                        class58.field967.method285((byte) -90, 173);
                        ++class140.field2502;
                        class58.field967.method575(var2, 118);
                        class58.field967.method582(30, var4);
                        class58.field967.method587(var5, -32389656);
                        class194.field3488 = 0;
                        class5.field81 = class13.method73(1506528624, var2);
                        class119.field2235 = var5;
                    }
                    if (~var3 == -6) {
                        ++class87.field1654;
                        class58.field967.method285((byte) -90, 206);
                        class58.field967.method581(true, var2);
                        class58.field967.method582(10, var5);
                        class58.field967.method547((byte) -67, var4);
                        class194.field3488 = 0;
                        class5.field81 = class13.method73(1506528624, var2);
                        class119.field2235 = var5;
                    }
                    if (var3 == 46) {
                        ++class102.field1855;
                        class58.field967.method285((byte) -90, 22);
                        class58.field967.method544(class194.field3477, (byte) -104);
                        class58.field967.method546((byte) 118, class275.field4793);
                        class58.field967.method581(true, var2);
                        class58.field967.method546((byte) 125, var4);
                        class58.field967.method587(var5, -32389656);
                        class194.field3488 = 0;
                        class5.field81 = class13.method73(1506528624, var2);
                        class119.field2235 = var5;
                    }
                    if (var3 == 6) {
                        class205.method1455(class135.field2450, var5, var2);
                    }
                    if (~var3 == -16) {
                        class83.field1591 = true;
                        class205.method1455(class135.field2450, var5, var2);
                    }
                    if (var3 == 51) {
                        boolean var40 = true;
                        class24 var41 = class13.method73(1506528624, var2);
                        if (~var41.field407 < -1) {
                            var40 = class86.method674((byte) -63, var41);
                        }
                        if (var40) {
                            class58.field967.method285((byte) -90, 229);
                            class58.field967.method581(arg1, var2);
                            ++class203.field3638;
                        }
                    }
                    if (!arg1) {
                        field3631 = null;
                    }
                    if (var3 == 14) {
                        ++class34.field627;
                        boolean var42 = class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 0, 0, 0, false, 0);
                        if (!var42) {
                            class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 1, 0, 0, false, 1);
                        }
                        class277.field4821 = class143.field2607;
                        class126.field2313 = 2;
                        class78.field1493 = class100.field1850;
                        class58.field964 = 0;
                        class58.field967.method285((byte) -90, 83);
                        class58.field967.method547((byte) -67, class29.field567 + var5);
                        class58.field967.method582(9, var4);
                        class58.field967.method546((byte) 113, class77.field1432 + var2);
                    }
                    if (~var3 == -17) {
                        class58.field967.method285((byte) -90, 138);
                        class58.field967.method587(var4, -32389656);
                        ++class216.field3827;
                        class58.field967.method581(true, var2);
                        class58.field967.method587(var5, -32389656);
                        class194.field3488 = 0;
                        class5.field81 = class13.method73(1506528624, var2);
                        class119.field2235 = var5;
                    }
                    if (var3 == 25) {
                        class26 var44 = class2.field29[var4];
                        if (var44 != null) {
                            class112.method916(0, -10543, class277.field4824.field2523[0], var44.field2517[0], class277.field4824.field2517[0], var44.field2523[0], 2, 1, 0, 0, false, 1);
                            class126.field2313 = 2;
                            class58.field964 = 0;
                            class78.field1493 = class100.field1850;
                            class277.field4821 = class143.field2607;
                            class58.field967.method285((byte) -90, 221);
                            class58.field967.method582(127, var4);
                            ++class130.field2378;
                        }
                    }
                    if (var3 == 9) {
                        ++class220.field3876;
                        boolean var45 = class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 0, 0, 0, false, 0);
                        if (!var45) {
                            class112.method916(0, -10543, class277.field4824.field2523[0], var2, class277.field4824.field2517[0], var5, 2, 1, 0, 0, false, 1);
                        }
                        class126.field2313 = 2;
                        class78.field1493 = class100.field1850;
                        class58.field964 = 0;
                        class277.field4821 = class143.field2607;
                        class58.field967.method285((byte) -90, 177);
                        class58.field967.method547((byte) -67, var4);
                        class58.field967.method587(class77.field1432 + var2, -32389656);
                        class58.field967.method547((byte) -67, class29.field567 + var5);
                    }
                    if (~var3 == -45) {
                        class81 var47 = class1.field6[var4];
                        if (var47 != null) {
                            ++class15.field221;
                            class112.method916(0, -10543, class277.field4824.field2523[0], var47.field2517[0], class277.field4824.field2517[0], var47.field2523[0], 2, 1, 0, 0, false, 1);
                            class58.field964 = 0;
                            class277.field4821 = class143.field2607;
                            class78.field1493 = class100.field1850;
                            class126.field2313 = 2;
                            class58.field967.method285((byte) -90, 232);
                            class58.field967.method582(126, var4);
                        }
                    }
                    if (var3 == 38) {
                        ++class100.field1843;
                        class58.field967.method285((byte) -90, 126);
                        class58.field967.method582(-14, var4);
                        class58.field967.method587(var5, -32389656);
                        class58.field967.method590(var2, 28);
                        class194.field3488 = 0;
                        class5.field81 = class13.method73(1506528624, var2);
                        class119.field2235 = var5;
                    }
                    if (~var3 == -18) {
                        class58.field967.method285((byte) -90, 107);
                        class58.field967.method590(var2, 12);
                        ++class176.field3167;
                        class58.field967.method587(var5, -32389656);
                        class58.field967.method546((byte) 110, class275.field4793);
                        class58.field967.method544(class194.field3477, (byte) -104);
                    }
                    if (var3 == 43) {
                        class58.field967.method285((byte) -90, 229);
                        ++class203.field3638;
                        class58.field967.method581(arg1, var2);
                        class24 var48 = class13.method73(1506528624, var2);
                        if (var48.field456 != null && var48.field456[0][0] == 5) {
                            int var49 = var48.field456[0][1];
                            class29.field568[var49] = -class29.field568[var49] + 1;
                            class52.method379(var49, 800);
                        }
                    }
                    if (class31.field585 != 0) {
                        class31.field585 = 0;
                        class226.method1549(false, class13.method73(1506528624, class20.field265));
                    }
                    if (class187.field3339) {
                        class20.method103(-98);
                    }
                    if (class5.field81 != null && class194.field3488 == 0) {
                        class226.method1549(false, class5.field81);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class202() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)Z")
    private final boolean method1435(int arg0, int arg1, int arg2) {
        if (arg1 != -49) {
            this.field3625 = 13;
        }
        ++field3610;
        int var4 = (arg0 + arg2) * this.field3620 >> 12;
        int var5 = class142.field2594[(1047972 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3620;
        int var7 = (var6 << 12) / this.field3621;
        int var8 = this.field3619 * var7 >> 12;
        return ~var8 < ~(arg0 - arg2) && ~(-arg2 + arg0) < ~(-var8);
    }
}
