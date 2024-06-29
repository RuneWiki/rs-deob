import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class124 extends class157 {

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    private int field2419 = 1;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
    private int field2423 = 0;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    private int field2425 = 0;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "Lcc;")
    public static class209 field2416 = class95.method669(118, "blinken3:");

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "Lcc;")
    private static class209 field2426 = class95.method669(90, "Use");

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "Lcc;")
    public static class209 field2417 = field2426;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "Lsj;")
    public static class49 field2422;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "[Lkb;")
    public static class53[] field2420;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        ++field2418;
        if (arg0 != -98) {
            field2422 = null;
        }
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (super.field2879.field3363) {
            int var4 = class129.field2479[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; var6 < class226.field4124; ++var6) {
                int var7 = class50.field987[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (~this.field2423 == -1) {
                    var9 = (-var4 + var7) * this.field2419;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field2419 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field2425 == 0) {
                    var12 = class223.field4073[(4089 & var12) >> 4] + 4096 >> 1;
                } else if (this.field2425 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIZI)V")
    public static final void method901(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++class5.field73;
        if (!arg4) {
            class67.method490(1, true);
            class70.method513(true, -2);
            class67.method490(1, false);
        }
        ++field2415;
        class70.method513(false, -2);
        if (!arg4) {
            class147.method1024((byte) -127);
        }
        class73.method524((byte) 97);
        class221.field4018 = arg1;
        class221.field4013 = arg0;
        if (arg5 > -26) {
            method903(-8, 15, -100);
        }
        if (~class16.field334 == -2) {
            int var6 = class28.field496;
            if (class229.field4162 / 256 > var6) {
                var6 = class229.field4162 / 256;
            }
            int var7 = class253.field4565 + class122.field2400 & 2047;
            if (class131.field2509[4] && ~(class49.field977[4] + 128) < ~var6) {
                var6 = class49.field977[4] + 128;
            }
            class69.method509(var6, class94.method661(class223.field4069.field1534, 19452, class99.field1937, class223.field4069.field1571) - 50, arg3, class137.field2562, var7, class85.field1684, 600 - -(var6 * 3), 2048);
        }
        int var8 = class60.field1213;
        int var9 = class183.field3312;
        int var10 = class103.field1990;
        int var11 = class182.field3304;
        int var12 = class179.field3256;
        for (int var13 = 0; var13 < 5; ++var13) {
            if (class131.field2509[var13]) {
                int var19 = (int) ((double) (-class171.field3128[var13]) + (double) (class171.field3128[var13] * 2 + 1) * Math.random() + Math.sin((double) class205.field3671[var13] / 100.0D * (double) class9.field178[var13]) * (double) class49.field977[var13]);
                if (var13 == 2) {
                    class103.field1990 += var19;
                }
                if (~var13 == -1) {
                    class60.field1213 += var19;
                }
                if (var13 == 4) {
                    class182.field3304 += var19;
                    if (class182.field3304 < 128) {
                        class182.field3304 = 128;
                    }
                    if (~class182.field3304 < -384) {
                        class182.field3304 = 383;
                    }
                }
                if (var13 == 1) {
                    class183.field3312 += var19;
                }
                if (var13 == 3) {
                    class179.field3256 = class179.field3256 + var19 & 2047;
                }
            }
        }
        class95.method672(-2885);
        class4.method32(arg0, arg1, arg0 - -arg2, arg1 + arg3);
        class15.method129();
        if (!class244.field4418 && ~class231.field4200 <= ~arg0 && ~class231.field4200 > ~(arg0 + arg2) && ~class56.field1161 <= ~arg1 && ~(arg1 - -arg3) < ~class56.field1161) {
            class274.field4859 = 0;
            int var14 = class154.field2806;
            class72.field1364 = true;
            int var15 = class47.field909;
            int var16 = class138.field2592;
            int var17 = class134.field2547;
            class185.field3329 = (var16 - var17) * (-arg1 + class56.field1161) / arg3 + var17;
            class202.field3636 = (-arg0 + class231.field4200) * (-var14 + var15) / arg2 + var14;
        } else {
            class274.field4859 = 0;
            class72.field1364 = false;
        }
        class117.method831(-413981948);
        byte var18 = ~class192.method1319((byte) -24) != -3 ? 1 : (byte) class5.field73;
        class4.method39(arg0, arg1, arg2, arg3, 0);
        class201.method1380(class60.field1213, class183.field3312, class103.field1990, class182.field3304, class179.field3256, class272.field4820, class88.field1747, class21.field402, class80.field1490, class191.field3457, class118.field2366, class99.field1937 + 1, var18, class223.field4069.field1571 >> 7, class223.field4069.field1534 >> 7);
        class117.method831(-413981948);
        class237.method1641();
        class216.method1513(256, 256, (byte) 21, arg2, arg0, arg3, arg1);
        class195.method1342(arg3, arg1, arg0, 256, 256, 7771, arg2);
        ((class279) class15.field271).method1886(class122.field2402, 2);
        class65.method479(arg0, arg1, arg3, arg2, -117);
        class182.field3304 = var11;
        class183.field3312 = var9;
        class179.field3256 = var12;
        class60.field1213 = var8;
        class103.field1990 = var10;
        if (class72.field1383 && ~class265.field4759.method1383(false) == -1) {
            class72.field1383 = false;
        }
        if (class72.field1383) {
            class4.method39(arg0, arg1, arg2, arg3, 0);
            class164.method1133(false, (byte) 51, class198.field3544);
        }
        if (!arg4 && !class72.field1383 && !class244.field4418 && ~class231.field4200 <= ~arg0 && ~class231.field4200 > ~(arg0 + arg2) && ~arg1 >= ~class56.field1161 && ~class56.field1161 > ~(arg1 + arg3)) {
            class83.method601(arg1, class231.field4200, arg0, arg3, arg2, -48, class56.field1161);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIILtf;ZIIIB)V")
    public static final void method902(int arg0, int arg1, int arg2, class106 arg3, boolean arg4, int arg5, int arg6, int arg7, byte arg8) {
        ++field2421;
        if (arg2 >= 0 && arg2 < 104 && ~arg0 <= -1 && arg0 < 104) {
            if (!arg4) {
                class285.field5023[arg7][arg2][arg0] = 0;
            }
            while (true) {
                int var9 = arg3.method774((byte) 108);
                if (~var9 == -1) {
                    if (arg4) {
                        class271.field4803[0][arg2][arg0] = class38.field656[0][arg2][arg0];
                    } else if (~arg7 != -1) {
                        class271.field4803[arg7][arg2][arg0] = class271.field4803[arg7 + -1][arg2][arg0] + -240;
                    } else {
                        class271.field4803[0][arg2][arg0] = 8 * -class162.method1118(arg2 + 932731 - -arg1, (byte) -128, arg0 + arg6 + 556238);
                    }
                    break;
                }
                if (~var9 == -2) {
                    int var10 = arg3.method774((byte) 126);
                    if (!arg4) {
                        if (~var10 == -2) {
                            var10 = 0;
                        }
                        if (arg7 != 0) {
                            class271.field4803[arg7][arg2][arg0] = class271.field4803[arg7 + -1][arg2][arg0] + -(var10 * 8);
                        } else {
                            class271.field4803[0][arg2][arg0] = -var10 * 8;
                        }
                    } else {
                        class271.field4803[0][arg2][arg0] = var10 * 8 + class38.field656[0][arg2][arg0];
                    }
                    break;
                }
                if (~var9 >= -50) {
                    class47.field914[arg7][arg2][arg0] = arg3.method777(104);
                    class14.field266[arg7][arg2][arg0] = (byte) ((var9 + -2) / 4);
                    class44.field868[arg7][arg2][arg0] = (byte) class27.method220(arg5 + var9 + -2, 3);
                } else if (~var9 >= -82) {
                    if (!arg4) {
                        class285.field5023[arg7][arg2][arg0] = (byte) (var9 + -49);
                    }
                } else {
                    class284.field5009[arg7][arg2][arg0] = (byte) (var9 + -81);
                }
            }
        } else {
            while (true) {
                int var11 = arg3.method774((byte) 83);
                if (var11 == 0) {
                    break;
                }
                if (~var11 == -2) {
                    arg3.method774((byte) 107);
                    break;
                }
                if (~var11 >= -50) {
                    arg3.method774((byte) 114);
                }
            }
        }
        if (arg8 > -29) {
            field2420 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field2419 = arg2.method774((byte) 73);
                }
            } else {
                this.field2425 = arg2.method774((byte) 125);
            }
        } else {
            this.field2423 = arg2.method774((byte) 77);
        }
        if (arg1 >= -29) {
            this.method3((byte) 25);
        }
        ++field2427;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class124() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(III)V")
    public static final void method903(int arg0, int arg1, int arg2) {
        ++field2429;
        int var3 = arg2--;
        if (var3 > 25) {
            var3 = 25;
        }
        int var4 = class265.field4756[arg2];
        int var5 = class195.field3499[arg2];
        if (arg1 == 0) {
            ++class88.field1743;
            class84.field1677.method287((byte) 122, 80);
            class84.field1677.method773(arg0 + -27333, var3 + 3 + var3);
        }
        if (~arg1 == -2) {
            class84.field1677.method287((byte) 121, 62);
            ++class54.field1065;
            class84.field1677.method773(arg0 ^ -18725, var3 - -var3 + 14 - -3);
        }
        if (arg1 == 2) {
            ++class278.field4891;
            class84.field1677.method287((byte) 120, 165);
            class84.field1677.method773(-6385, var3 + 3 + var3);
        }
        class84.field1677.method767(-1, class174.field3178 + var5);
        class84.field1677.method767(-1, var4 - -class245.field4444);
        class84.field1677.method739(-12, !class228.field4153[82] ? 0 : 1);
        if (arg0 != 20948) {
            method903(-14, 120, 23);
        }
        class181.field3283 = class195.field3499[0];
        class102.field1959 = class265.field4756[0];
        for (int var6 = 1; var3 > var6; ++var6) {
            --arg2;
            class84.field1677.method730(-97, class195.field3499[arg2] + -var5);
            class84.field1677.method773(-6385, class265.field4756[arg2] + -var4);
        }
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V")
    public static void method904(int arg0) {
        field2417 = null;
        field2426 = null;
        field2420 = null;
        field2416 = null;
        if (arg0 != -4096) {
            field2420 = null;
        }
        field2422 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        ++field2424;
        class257.method1773(0);
        int var2 = 88 % ((-51 - arg0) / 52);
    }
}
