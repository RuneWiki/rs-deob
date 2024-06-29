import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class47 extends class38 {

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "[J")
    private long[] field996 = new long[10];

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    private int field1003 = 256;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    private int field999 = 1;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    private int field1008 = 0;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "J")
    private long field1006 = class97.method599(5);

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "Lrd;")
    public static class173 field1004 = class133.method843("null", 76);

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Lrd;")
    private static class173 field1007 = class133.method843("Malformed login packet)3", -99);

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Lrd;")
    public static class173 field1002 = field1007;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)Z")
    public static final boolean method326(int arg0, int arg1, int arg2, int arg3) {
        if (class212.method1394(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class89.method570(var4 + 1, class124.field2328[arg0][arg1][arg2] + arg3, var5 + 1) && class89.method570(var4 + 128 - 1, class124.field2328[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class89.method570(var4 + 128 - 1, class124.field2328[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class89.method570(var4 + 1, class124.field2328[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lrd;BLrd;Lbc;)[Lsa;")
    public static final class180[] method327(class173 arg0, byte arg1, class173 arg2, class14 arg3) {
        field997++;
        if (arg1 != 96) {
            field1002 = null;
        }
        int var4 = arg3.method135(arg2, 123);
        int var5 = arg3.method117(arg0, (byte) 37, var4);
        return class144.method908(var4, 4413, arg3, var5);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIZIIII)V")
    public static final void method328(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        field998++;
        class189 var10 = null;
        for (class189 var11 = (class189) class108.field2017.method915(-1); var11 != null; var11 = (class189) class108.field2017.method910((byte) 88)) {
            if (var11.field3691 == arg3 && var11.field3707 == arg9 && var11.field3681 == arg7 && var11.field3694 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (!arg5) {
            return;
        }
        if (var10 == null) {
            var10 = new class189();
            var10.field3694 = arg6;
            var10.field3691 = arg3;
            var10.field3707 = arg9;
            var10.field3681 = arg7;
            class164.method1054(true, var10);
            class108.field2017.method920(!arg5, var10);
        }
        var10.field3698 = arg0;
        var10.field3704 = arg4;
        var10.field3701 = arg2;
        var10.field3699 = arg1;
        var10.field3700 = arg8;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public final void method283(byte arg0) {
        if (arg0 == 13) {
            field1001++;
            for (int var2 = 0; var2 < 10; var2++) {
                this.field996[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method329(int arg0) {
        if (arg0 != 1) {
            method331(null, (byte) 29);
        }
        field1002 = null;
        field1004 = null;
        field1007 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILrd;Lrd;Lrd;)V")
    public static final void method330(int arg0, class173 arg1, class173 arg2, class173 arg3) {
        class87.field1698 = arg2;
        class87.field1694 = arg3;
        class87.field1693 = arg1;
        if (arg0 < 22) {
            method330(16, null, null, null);
        }
        field1005++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lrc;B)V")
    public static final void method331(class172 arg0, byte arg1) {
        field995++;
        if (class24.field526) {
            class66.method415(arg0, -2394);
            return;
        }
        if (class120.field2208 == 1 && class41.field849 >= 715 && class23.field493 >= 453) {
            class147.field2816 = !class147.field2816;
            if (class147.field2816) {
                class214.method1408((byte) -74);
            } else {
                class103.method642(false, class114.field2106, false, 255, 0, class107.field1990);
            }
        }
        if (class24.field525 == 5) {
            return;
        }
        class121.field2258++;
        if (class24.field525 != 10) {
            return;
        }
        if (class96.field1770 != 2 && class48.field1013 == 0) {
            if (class120.field2208 == 1) {
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 5;
                byte var5 = 35;
                if (var4 <= class41.field849 && class41.field849 <= var3 + var4 && class23.field493 >= var2 && class23.field493 <= var2 + var5) {
                    class74.method455(arg1 - 78);
                    return;
                }
            }
            if (class80.field1583 != null) {
                class74.method455(-86);
            }
        }
        int var6 = class41.field849;
        if (arg1 != 7) {
            method331(null, (byte) -1);
        }
        int var7 = class23.field493;
        int var8 = class120.field2208;
        if (class183.field3601 == 0) {
            short var17 = 302;
            short var18 = 291;
            boolean var19 = false;
            if (var8 == 1 && var6 >= var17 - 75 && var17 + 75 >= var6 && var18 - 20 <= var7 && var18 + 20 >= var7) {
                class43.field879 = 0;
                class183.field3601 = 3;
            }
            short var20 = 462;
            if (class105.field1970 != 0) {
                while (class73.method452(-26290)) {
                    if (class122.field2300 == 84) {
                        var19 = true;
                        break;
                    }
                }
            }
            if (var19 || var8 == 1 && var20 - 75 <= var6 && var6 <= var20 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                class87.field1694 = class203.field3965;
                class43.field879 = 0;
                class183.field3601 = 2;
                class87.field1693 = class63.field1230;
                class87.field1698 = class203.field3977;
            }
        } else if (class183.field3601 == 2) {
            short var11 = 231;
            short var12 = 321;
            int var21 = var11 + 30;
            if (var8 == 1 && var7 >= var21 - 15 && var7 < var21) {
                class43.field879 = 0;
            }
            short var13 = 302;
            var21 += 15;
            if (var8 == 1 && var21 - 15 <= var7 && var7 < var21) {
                class43.field879 = 1;
            }
            var21 += 15;
            if (var8 == 1 && var13 - 75 <= var6 && var6 <= var13 + 75 && var12 - 20 <= var7 && var12 + 20 >= var7) {
                class87.field1686 = class87.field1686.method1159(0).method1142(-98);
                if (class87.field1686.method1153((byte) -128) == 0) {
                    method330(116, class28.field591, class203.field3929, class203.field3947);
                    return;
                }
                if (class87.field1699.method1153((byte) -128) == 0) {
                    method330(104, class54.field1087, class203.field3942, class203.field3930);
                    return;
                }
                method330(114, class145.field2704, class203.field3970, class203.field3969);
                class148.method978(20, 8780);
                return;
            }
            short var14 = 462;
            if (var8 == 1 && var6 >= var14 - 75 && var14 + 75 >= var6 && var7 >= var12 - 20 && var12 + 20 >= var7) {
                class87.field1686 = class87.field1688;
                class183.field3601 = 0;
                class87.field1699 = class87.field1688;
            }
            while (true) {
                while (class73.method452(-26290)) {
                    boolean var15 = false;
                    for (int var16 = 0; class153.field2905.method1153((byte) -127) > var16; var16++) {
                        if (class135.field2554 == class153.field2905.method1147(arg1 + 7021, var16)) {
                            var15 = true;
                            break;
                        }
                    }
                    if (class43.field879 == 0) {
                        if (class122.field2300 == 85 && class87.field1686.method1153((byte) -128) > 0) {
                            class87.field1686 = class87.field1686.method1155(0, class87.field1686.method1153((byte) -128) - 1, (byte) 99);
                        }
                        if (class122.field2300 == 84 || class122.field2300 == 80) {
                            class43.field879 = 1;
                        }
                        if (var15 && class87.field1686.method1153((byte) -128) < 12) {
                            class87.field1686 = class87.field1686.method1125(66, class135.field2554);
                        }
                    } else if (class43.field879 == 1) {
                        if (class122.field2300 == 85 && class87.field1699.method1153((byte) -128) > 0) {
                            class87.field1699 = class87.field1699.method1155(0, class87.field1699.method1153((byte) -128) - 1, (byte) 101);
                        }
                        if (class122.field2300 == 84 || class122.field2300 == 80) {
                            class43.field879 = 0;
                        }
                        if (class105.field1970 != 0 && class122.field2300 == 84) {
                            class87.field1686 = class87.field1686.method1159(0).method1142(arg1 - 105);
                            if (class87.field1686.method1153((byte) -128) == 0) {
                                method330(87, class28.field591, class203.field3929, class203.field3947);
                                return;
                            }
                            if (class87.field1699.method1153((byte) -128) == 0) {
                                method330(arg1 + 120, class54.field1087, class203.field3942, class203.field3930);
                                return;
                            }
                            method330(arg1 ^ 0x60, class145.field2704, class203.field3970, class203.field3969);
                            class148.method978(20, 8780);
                            return;
                        }
                        if (var15 && class87.field1699.method1153((byte) -127) < 20) {
                            class87.field1699 = class87.field1699.method1125(102, class135.field2554);
                        }
                    }
                }
                return;
            }
        } else if (class183.field3601 == 3) {
            short var9 = 382;
            short var10 = 321;
            if (var8 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var10 - 20 <= var7 && var7 <= var10 + 20) {
                class183.field3601 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII)I")
    public final int method286(boolean arg0, int arg1, int arg2) {
        field1000++;
        int var4 = this.field999;
        int var5 = this.field1003;
        this.field999 = 1;
        this.field1003 = 300;
        this.field1006 = class97.method599(5);
        if (this.field996[this.field1010] == 0L) {
            this.field999 = var4;
            this.field1003 = var5;
        } else if (this.field996[this.field1010] < this.field1006) {
            this.field1003 = (int) ((long) (arg1 * 2560) / (this.field1006 - this.field996[this.field1010]));
        }
        if (this.field1003 < 25) {
            this.field1003 = 25;
        }
        if (this.field1003 > 256) {
            this.field1003 = 256;
            this.field999 = (int) ((long) arg1 - (this.field1006 - this.field996[this.field1010]) / 10L);
        }
        if (this.field999 > arg1) {
            this.field999 = arg1;
        }
        this.field996[this.field1010] = this.field1006;
        this.field1010 = (this.field1010 + 1) % 10;
        if (this.field999 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field996[var6] != 0L) {
                    this.field996[var6] -= -((long) this.field999);
                }
            }
        }
        if (this.field999 < arg2) {
            this.field999 = arg2;
        }
        class151.method996(12121, (long) this.field999);
        int var7 = 0;
        while (this.field1008 < 256) {
            this.field1008 += this.field1003;
            var7++;
        }
        this.field1008 &= 0xFF;
        if (!arg0) {
            this.field1003 = -18;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class47() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field996[var1] = this.field1006;
        }
    }
}
