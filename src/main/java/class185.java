import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class185 {

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "Lvm;")
    private class124 field2494 = null;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "Z")
    private boolean field2495;

    @OriginalMember(owner = "client!ir", name = "O", descriptor = "Lqa;")
    private class219 field2520;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public int field2501;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "[I")
    public static int[] field2482 = new int[256];

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "Lm;")
    public static class242 field2502 = new class242();

    @OriginalMember(owner = "client!ir", name = "W", descriptor = "I")
    public static volatile int field2527 = 0;

    @OriginalMember(owner = "client!ir", name = "V", descriptor = "Luc;")
    public static class51 field2526 = new class51(64);

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ir", name = "P", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ir", name = "Q", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!ir", name = "R", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!ir", name = "T", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!ir", name = "U", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ir", name = "X", descriptor = "Ltj;")
    public static class298 field2528;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "[Ljava/lang/Object;")
    private Object[] field2488;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2504;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I", line = 10)
    public final int method1199(int arg0) {
        if (arg0 > -95) {
            return 88;
        }
        field2499++;
        if (!this.method1228(true)) {
            throw new IllegalStateException("");
        }
        return this.field2494.field1607;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Z", line = 24)
    public final boolean method1200(int arg0, int arg1) {
        field2507++;
        if (!this.method1209(arg0, 126)) {
            return false;
        } else if (this.field2488[arg0] == null) {
            this.method1201(arg0, (byte) 72);
            int var3 = 94 % ((-arg1 - 33) / 32);
            return this.field2488[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IB)V", line = 47)
    private final void method1201(int arg0, byte arg1) {
        if (arg1 < 2) {
            this.field2495 = true;
        }
        if (this.field2495) {
            this.field2488[arg0] = this.field2520.method1437(arg0, 2);
        } else {
            this.field2488[arg0] = class123.method878(this.field2520.method1437(arg0, 2), (byte) 124, false);
        }
        field2481++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZI)Z", line = 64)
    private final boolean method1202(int arg0, boolean arg1, int arg2) {
        field2480++;
        if (!this.method1228(true)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field2494.field1610.length && arg2 < this.field2494.field1610[arg0]) {
            return arg1 ? true : true;
        } else if (class209.field2846) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILtj;)V", line = 96)
    public static final void method1203(int arg0, class298 arg1) {
        field2487++;
        if (arg0 > -103) {
            return;
        }
        int var2 = class184.field2469;
        int var3 = class341.field5066;
        int var4 = class389.field5694;
        int var5 = class145.field1858 - 3;
        byte var6 = 20;
        if (class431.field6266 == null || class147.field1880 == null) {
            if (class118.field1532.method1205((byte) -48, class118.field1536) && class118.field1532.method1205((byte) -48, class209.field2845)) {
                class431.field6266 = arg1.method463(class10.method88(class118.field1532, class118.field1536, 0), true);
                class10 var7 = class10.method88(class118.field1532, class209.field2845, 0);
                class147.field1880 = arg1.method463(var7, true);
                var7.method89();
                class57.field864 = arg1.method463(var7, true);
            } else {
                arg1.method435(var2, var3, var4, var6, class301.field4542 | 255 - class278.field4083 << 24, 1);
            }
        }
        if (class431.field6266 != null && class147.field1880 != null) {
            int var8 = (var4 - class147.field1880.method208() * 2) / class431.field6266.method208();
            for (int var9 = 0; var9 < var8; var9++) {
                class431.field6266.method2070(var2 + class147.field1880.method208() + (class431.field6266.method208() * var9), var3);
            }
            class147.field1880.method2070(var2, var3);
            class57.field864.method2070(var2 + var4 - class57.field864.method208(), var3);
        }
        class199.field2756.method907(class337.field4983, false, -1, var3 + 14, class176.field2384 | 0xFF000000, var2 + 3);
        arg1.method435(var2, var3 + var6, var4, var5 - var6, -class278.field4083 + 255 << 24 | class301.field4542, 1);
        int var10 = class277.field4060;
        int var11 = class217.field3032;
        for (int var12 = 0; var12 < class402.field5874; var12++) {
            int var26 = (class402.field5874 - var12 - 1) * 16 + var6 + var3 + 13;
            if (var10 > var2 && var2 + var4 > var10 && var26 - 13 < var11 && var26 + 3 > var11) {
                arg1.method435(var2, var26 - 12, var4, 16, class165.field2236 | 255 - class212.field2915 << 24, 1);
            }
        }
        if ((class190.field2644 == null || class430.field6247 == null || class271.field3997 == null) && class118.field1532.method1205((byte) -48, class15.field250) && class118.field1532.method1205((byte) -48, class236.field3295) && class118.field1532.method1205((byte) -48, class73.field1031)) {
            class10 var13 = class10.method88(class118.field1532, class236.field3295, 0);
            class430.field6247 = arg1.method463(var13, true);
            var13.method89();
            class420.field6111 = arg1.method463(var13, true);
            class190.field2644 = arg1.method463(class10.method88(class118.field1532, class15.field250, 0), true);
            class10 var14 = class10.method88(class118.field1532, class73.field1031, 0);
            class271.field3997 = arg1.method463(var14, true);
            var14.method89();
            class281.field4135 = arg1.method463(var14, true);
        }
        if (class190.field2644 != null && class430.field6247 != null && class271.field3997 != null) {
            int var15 = (var4 - class271.field3997.method208() * 2) / class190.field2644.method208();
            for (int var16 = 0; var16 < var15; var16++) {
                class190.field2644.method2070(var2 + class271.field3997.method208() + (class190.field2644.method208() * var16), var3 + var5 + -class190.field2644.method202());
            }
            int var17 = (var5 - (var6 + class271.field3997.method202())) / class430.field6247.method202();
            for (int var18 = 0; var18 < var17; var18++) {
                class430.field6247.method2070(var2, class430.field6247.method202() * var18 + (var3 + var6));
                class420.field6111.method2070(var4 + (var2 - class420.field6111.method208()), var18 * class430.field6247.method202() + var3 + var6);
            }
            class271.field3997.method2070(var2, var5 + (var3 - class271.field3997.method202()));
            class281.field4135.method2070(var2 + var4 - class271.field3997.method208(), -class271.field3997.method202() + var3 - -var5);
        }
        int var19 = 0;
        for (class138 var20 = (class138) class186.field2547.method1575(0); var20 != null; var20 = (class138) class186.field2547.method1573((byte) -128)) {
            int var21 = (class402.field5874 - var19 - 1) * 16 + (var3 + var6 + 13);
            int var22 = class176.field2384 | 0xFF000000;
            if (var2 < var10 && var10 < (var2 + var4) && var11 > var21 - 13 && (var21 + 3) > var11) {
                var22 = class387.field5663 | 0xFF000000;
            }
            int[] var23 = null;
            if (class267.method1784(var20.field1777, (byte) -107)) {
                var23 = class129.method915(127, (int) var20.field1780).field2026;
            } else if (class386.method2504((byte) 127, var20.field1777)) {
                class163 var24 = class388.field5670[(int) var20.field1780];
                if (var24 != null) {
                    var23 = var24.field2206.field2596;
                }
            } else if (class246.method1608(-49, var20.field1777)) {
                if (var20.field1777 == 1011) {
                    var23 = class372.method2447((int) var20.field1780, (byte) 81).field2911;
                } else {
                    var23 = class372.method2447((int) (var20.field1780 >>> 32 & 0x7FFFFFFFL), (byte) -109).field2911;
                }
            }
            String var25 = class84.method687(var20, -1);
            if (var23 != null) {
                var25 = var25 + class368.method2426(var23, 112);
            }
            var19++;
            class199.field2756.method904(var2 + 3, class424.field6180, 0, -47, var22, class407.field5923, var21, var25);
        }
        class51.method369(class389.field5694, (byte) -108, class341.field5066, class184.field2469, class145.field1858);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILkg;BI)V", line = 271)
    public static final void method1204(int arg0, class317 arg1, byte arg2, int arg3) {
        if (arg1.field2148 == arg3 && arg3 != -1) {
            class233 var4 = class73.method597(arg3, -1);
            int var5 = var4.field3239;
            if (var5 == 1) {
                arg1.field2132 = 0;
                arg1.field2161 = 1;
                arg1.field2144 = 0;
                arg1.field2173 = 0;
                arg1.field2151 = arg0;
                class379.method2476(arg1.field2144, false, class383.field5609 == arg1, arg1.field5930, var4, arg1.field5921);
            }
            if (var5 == 2) {
                arg1.field2173 = 0;
            }
        } else if (arg3 == -1 || arg1.field2148 == -1 || class73.method597(arg3, -1).field3250 >= class73.method597(arg1.field2148, -1).field3250) {
            arg1.field2198 = arg1.field2202;
            arg1.field2148 = arg3;
            arg1.field2151 = arg0;
            arg1.field2132 = 0;
            arg1.field2173 = 0;
            arg1.field2161 = 1;
            arg1.field2144 = 0;
            if (arg1.field2148 != -1) {
                class379.method2476(arg1.field2144, false, class383.field5609 == arg1, arg1.field5930, class73.method597(arg1.field2148, -1), arg1.field5921);
            }
        }
        int var6 = 121 % ((arg2 + 6) / 33);
        field2483++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BI)Z", line = 324)
    public final boolean method1205(byte arg0, int arg1) {
        if (arg0 != -48) {
            this.method1235(75, false, -106);
        }
        field2508++;
        if (!this.method1228(true)) {
            return false;
        } else if (this.field2494.field1610.length == 1) {
            return this.method1214((byte) -111, 0, arg1);
        } else if (!this.method1209(arg1, 126)) {
            return false;
        } else if (this.field2494.field1610[arg1] == 1) {
            return this.method1214((byte) -111, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B", line = 350)
    public final byte[] method1206(String arg0, int arg1, String arg2) {
        field2515++;
        if (!this.method1228(true)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        if (arg1 != 0) {
            method1237((String) null, true, -47);
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field2494.field1597.method2516(class161.method1082(var4, -24735), 100);
        if (this.method1209(var6, 127)) {
            int var7 = this.field2494.field1600[var6].method2516(class161.method1082(var5, -24735), 112);
            return this.method1235(var6, false, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)I", line = 375)
    public final int method1207(int arg0) {
        field2492++;
        if (!this.method1228(true)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2488.length; var4++) {
            if (this.field2494.field1598[var4] > 0) {
                var3 += this.method1213(arg0 ^ 0xFFFFFFE8, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            if (arg0 != -3) {
                this.method1201(82, (byte) 97);
            }
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(IB)[I", line = 416)
    public final int[] method1208(int arg0, byte arg1) {
        if (arg1 <= 55) {
            this.field2504 = null;
        }
        field2517++;
        if (!this.method1209(arg0, 127)) {
            return null;
        }
        int[] var3 = this.field2494.field1606[arg0];
        if (var3 == null) {
            var3 = new int[this.field2494.field1598[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)Z", line = 444)
    private final boolean method1209(int arg0, int arg1) {
        field2486++;
        if (!this.method1228(true)) {
            return false;
        } else if (arg0 >= 0 && this.field2494.field1610.length > arg0 && this.field2494.field1610[arg0] != 0) {
            if (arg1 < 125) {
                this.method1214((byte) -21, -73, 69);
            }
            return true;
        } else if (class209.field2846) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lqa;ZI)V", line = 1511)
    public class185(class219 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field2495 = arg1;
        this.field2520 = arg0;
        this.field2501 = arg2;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZIZ)V", line = 475)
    public final void method1210(boolean arg0, int arg1, boolean arg2) {
        field2514++;
        if (!this.method1228(true)) {
            return;
        }
        if (arg1 != 13) {
            this.field2504 = null;
        }
        if (arg0) {
            this.field2494.field1597 = null;
            this.field2494.field1604 = null;
        }
        if (arg2) {
            this.field2494.field1605 = null;
            this.field2494.field1600 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V", line = 500)
    public final void method1211(int arg0) {
        field2516++;
        if (this.field2504 != null) {
            for (int var2 = 0; var2 < this.field2504.length; var2++) {
                this.field2504[var2] = null;
            }
        }
        if (arg0 != 0) {
            this.field2488 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V", line = 521)
    public static final void method1212(int arg0) {
        if (arg0 != -2) {
            method1212(-111);
        }
        for (int var1 = 0; var1 < class236.field3301; var1++) {
            int var10002 = class329.field4850[var1]--;
            if (class329.field4850[var1] >= -10) {
                class374 var3 = class337.field4985[var1];
                if (var3 == null) {
                    var3 = class374.method2455(class14.field228, class195.field2704[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class329.field4850[var1] += var3.method2458();
                    class337.field4985[var1] = var3;
                }
                if (class329.field4850[var1] < 0) {
                    int var10;
                    if (class163.field2224[var1] == 0) {
                        var10 = class129.field1683[var1] * class227.field3128 >> 8;
                    } else {
                        int var4 = (class163.field2224[var1] & 0xFF) * 128;
                        int var5 = (class163.field2224[var1] & 0xFFF6FC) >> 16;
                        int var6 = var5 * 128 - (class383.field5609.field5921 - 64);
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class163.field2224[var1] & 0xFF2B) >> 8;
                        int var8 = var7 * 128 + 64 - class383.field5609.field5930;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var9 > var4) {
                            class329.field4850[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class129.field1683[var1] * class389.field5692 / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class151 var11 = var3.method2457().method1032(class322.field4798);
                        class260 var12 = class260.method1724(var11, 100, var10);
                        var12.method1740(class388.field5674[var1] - 1);
                        class40.field602.method248(var12);
                    }
                    class329.field4850[var1] = -100;
                }
            } else {
                class236.field3301--;
                for (int var2 = var1; var2 < class236.field3301; var2++) {
                    class195.field2704[var2] = class195.field2704[var2 + 1];
                    class337.field4985[var2] = class337.field4985[var2 + 1];
                    class388.field5674[var2] = class388.field5674[var2 + 1];
                    class329.field4850[var2] = class329.field4850[var2 + 1];
                    class163.field2224[var2] = class163.field2224[var2 + 1];
                    class129.field1683[var2] = class129.field1683[var2 + 1];
                }
                var1--;
            }
        }
        field2500++;
        if (class60.field919 && !class368.method2424(false)) {
            if (class154.field1961 != 0 && class400.field5855 != -1) {
                class232.method1510(class154.field1961, -10668, false, 0, class388.field5677, class400.field5855);
            }
            class60.field919 = false;
        } else if (class154.field1961 != 0 && class400.field5855 != -1 && !class368.method2424(false)) {
            class140.field1797.method1833(-20379, 210);
            class193.field2686++;
            class140.field1797.method2240((byte) -88, class400.field5855);
            class400.field5855 = -1;
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)I", line = 653)
    private final int method1213(int arg0, int arg1) {
        field2525++;
        int var3 = 95 / ((arg0 - 77) / 41);
        if (this.method1209(arg1, 126)) {
            return this.field2488[arg1] == null ? this.field2520.method1436(arg1, -23) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BII)Z", line = 676)
    public final boolean method1214(byte arg0, int arg1, int arg2) {
        field2490++;
        if (!this.method1202(arg1, false, arg2)) {
            return false;
        } else if (this.field2504[arg1] != null && this.field2504[arg1][arg2] != null) {
            return true;
        } else if (this.field2488[arg1] == null) {
            this.method1201(arg1, (byte) 113);
            if (this.field2488[arg1] == null) {
                if (arg0 != -111) {
                    this.method1221(32, 41);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZLsj;)V", line = 701)
    public static final void method1215(int arg0, boolean arg1, class248 arg2) {
        if (arg0 != -1) {
            return;
        }
        field2503++;
        int var3 = arg2.field3591 == 0 ? arg2.field3531 : arg2.field3591;
        int var4 = arg2.field3568 == 0 ? arg2.field3564 : arg2.field3568;
        class51.method365(arg2.field3636, var4, var3, arg1, -162, class4.field71[arg2.field3636 >> 16]);
        if (arg2.field3528 != null) {
            class51.method365(arg2.field3636, var4, var3, arg1, -162, arg2.field3528);
        }
        class28 var5 = (class28) class242.field3402.method2826(false, (long) arg2.field3636);
        if (var5 != null) {
            class232.method1504(true, var5.field482, var4, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(II)I", line = 726)
    public final int method1216(int arg0, int arg1) {
        field2524++;
        if (!this.method1228(true)) {
            return -1;
        }
        int var3 = this.field2494.field1597.method2516(arg1, 112);
        if (this.method1209(var3, arg0 + 126)) {
            return arg0 == 0 ? var3 : -118;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)V", line = 752)
    public static final void method1217(int arg0) {
        class51 var1 = field2526;
        synchronized (field2526) {
            field2526.method366(94);
        }
        if (arg0 != 15184) {
            field2527 = 111;
        }
        field2522++;
    }

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)V", line = 769)
    public static void method1218(int arg0) {
        field2528 = null;
        int var1 = 100 % ((7 - arg0) / 51);
        field2482 = null;
        field2502 = null;
        field2526 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjava/lang/String;)V", line = 784)
    public final void method1219(int arg0, String arg1) {
        field2513++;
        if (this.method1228(true) && arg0 >= 8) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2494.field1597.method2516(class161.method1082(var3, -24735), 121);
            this.method1221(-78, var4);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 801)
    public final int method1220(String arg0, int arg1) {
        field2523++;
        if (!this.method1228(true)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 == 0) {
            int var4 = this.field2494.field1597.method2516(class161.method1082(var3, -24735), arg1 + 101);
            return this.method1209(var4, arg1 + 126) ? var4 : -1;
        } else {
            return 115;
        }
    }

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "(II)V", line = 822)
    private final void method1221(int arg0, int arg1) {
        field2521++;
        this.field2520.method1438(arg1, 1217);
        int var3 = -117 / ((-arg0 - 20) / 57);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)I", line = 834)
    public final int method1222(boolean arg0) {
        field2510++;
        return this.method1228(arg0) ? this.field2494.field1610.length : -1;
    }

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "(II)V", line = 846)
    public final void method1223(int arg0, int arg1) {
        field2509++;
        if (!this.method1209(arg0, 126)) {
            return;
        }
        if (this.field2504 != null) {
            this.field2504[arg0] = null;
        }
        if (arg1 != 128) {
            field2482 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(ILjava/lang/String;)Z", line = 863)
    public final boolean method1224(int arg0, String arg1) {
        field2493++;
        if (!this.method1228(true)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2494.field1597.method2516(class161.method1082(var3, -24735), -77);
        if (var4 < 0) {
            return false;
        } else {
            if (arg0 <= 47) {
                this.method1232((int[]) null, -116, 75, 73);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(IB)I", line = 886)
    public final int method1225(int arg0, byte arg1) {
        field2484++;
        if (this.method1209(arg0, 126)) {
            return arg1 == 27 ? this.field2494.field1610[arg0] : -14;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([IIII)[B", line = 903)
    public final byte[] method1226(int[] arg0, int arg1, int arg2, int arg3) {
        field2506++;
        if (!this.method1202(arg3, false, arg1)) {
            return null;
        }
        if (arg2 != -3738) {
            this.method1205((byte) 44, 104);
        }
        if (this.field2504[arg3] == null || this.field2504[arg3][arg1] == null) {
            boolean var5 = this.method1232(arg0, arg3, arg1, 120);
            if (!var5) {
                this.method1201(arg3, (byte) 91);
                boolean var6 = this.method1232(arg0, arg3, arg1, 97);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class114.method843(false, 0, this.field2504[arg3][arg1]);
        if (this.field2501 == 1) {
            this.field2504[arg3][arg1] = null;
            if (this.field2494.field1610[arg3] == 1) {
                this.field2504[arg3] = null;
            }
        } else if (this.field2501 == 2) {
            this.field2504[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "(I)Z", line = 952)
    public final boolean method1227(int arg0) {
        field2519++;
        if (!this.method1228(true)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 != 30698) {
            method1203(-83, (class298) null);
        }
        for (int var3 = 0; var3 < this.field2494.field1609.length; var3++) {
            int var4 = this.field2494.field1609[var3];
            if (this.field2488[var4] == null) {
                this.method1201(var4, (byte) 116);
                if (this.field2488[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)Z", line = 988)
    private final boolean method1228(boolean arg0) {
        if (!arg0) {
            this.method1228(false);
        }
        field2498++;
        if (this.field2494 == null) {
            this.field2494 = this.field2520.method1435(-106);
            if (this.field2494 == null) {
                return false;
            }
            this.field2488 = new Object[this.field2494.field1599];
            this.field2504 = new Object[this.field2494.field1599][];
        }
        return true;
    }

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)V", line = 1012)
    private final void method1229(int arg0) {
        if (this.field2488 != null) {
            for (int var2 = 0; var2 < this.field2488.length; var2++) {
                this.field2488[var2] = null;
            }
        }
        if (arg0 == 30) {
            field2518++;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 1034)
    public final boolean method1230(String arg0, byte arg1, String arg2) {
        field2512++;
        if (arg1 != 8) {
            field2526 = null;
        }
        if (!this.method1228(true)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field2494.field1597.method2516(class161.method1082(var4, -24735), 109);
        if (this.method1209(var6, 126)) {
            int var7 = this.field2494.field1600[var6].method2516(class161.method1082(var5, -24735), arg1 - 129);
            return this.method1214((byte) -111, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;Lde;II)Lvc;", line = 1057)
    public static final class225 method1231(String arg0, class364 arg1, int arg2, int arg3) {
        if (arg2 != 15196) {
            field2528 = null;
        }
        field2497++;
        if (arg3 == 0) {
            return arg1.method2401(125, arg0);
        } else if (arg3 == 1) {
            try {
                class177.method1171(arg1.field5381, -6069, "openjs", new Object[] { (new URL(arg1.field5381.getCodeBase(), arg0)).toString() });
                class225 var4 = new class225();
                var4.field3104 = 1;
                return var4;
            } catch (Throwable var10) {
                class225 var5 = new class225();
                var5.field3104 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                arg1.field5381.getAppletContext().showDocument(new URL(arg1.field5381.getCodeBase(), arg0), "_blank");
                class225 var6 = new class225();
                var6.field3104 = 1;
                return var6;
            } catch (Exception var11) {
                class225 var7 = new class225();
                var7.field3104 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class177.method1170(123, "loggedout", arg1.field5381);
            } catch (Throwable var13) {
            }
            try {
                arg1.field5381.getAppletContext().showDocument(new URL(arg1.field5381.getCodeBase(), arg0), "_top");
                class225 var8 = new class225();
                var8.field3104 = 1;
                return var8;
            } catch (Exception var12) {
                class225 var9 = new class225();
                var9.field3104 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "([IIII)Z", line = 1142)
    private final boolean method1232(int[] arg0, int arg1, int arg2, int arg3) {
        field2485++;
        if (!this.method1209(arg1, 127)) {
            return false;
        } else if (this.field2488[arg1] == null) {
            return false;
        } else {
            int var5 = this.field2494.field1598[arg1];
            int[] var6 = this.field2494.field1606[arg1];
            if (this.field2504[arg1] == null) {
                this.field2504[arg1] = new Object[this.field2494.field1610[arg1]];
            }
            if (arg3 <= 65) {
                this.method1236((String) null, (byte) 26);
            }
            Object[] var7 = this.field2504[arg1];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var11 = class114.method843(false, 0, this.field2488[arg1]);
            } else {
                var11 = class114.method843(true, 0, this.field2488[arg1]);
                class341 var12 = new class341(var11);
                var12.method2222(arg0, var12.field5042.length, 5, 255);
            }
            byte[] var13;
            try {
                var13 = class407.method2577(var11, 1);
            } catch (RuntimeException var49) {
                throw class136.method966(var49, "T3 - " + (arg0 != null) + "," + arg1 + "," + var11.length + "," + class30.method242(var11, 0, var11.length) + "," + class30.method242(var11, 0, var11.length - 2) + "," + this.field2494.field1615[arg1] + "," + this.field2494.field1607);
            }
            if (this.field2495) {
                this.field2488[arg1] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field2501 == 0) {
                    var7[var48] = class123.method878(var13, (byte) 124, false);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field2501 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var32 * 4 * var5;
                class341 var34 = new class341(var13);
                int var35 = 0;
                int var36 = 0;
                var34.field5049 = var33;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method2232(-16);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg2 == var40) {
                            var35 += var38;
                            var36 = var40;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field5049 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method2232(123);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg2 == var47) {
                            class206.method1359(var13, var43, var41, var42, var45);
                            var42 += var45;
                        }
                        var43 += var45;
                    }
                }
                var7[var36] = var41;
            } else {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var16 * 4 * var5;
                class341 var18 = new class341(var13);
                int[] var19 = new int[var5];
                var18.field5049 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method2232(114);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field5049 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method2232(95);
                        class206.method1359(var13, var25, var23[var28], var19[var28], var27);
                        var19[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field2501 == 0) {
                        var7[var30] = class123.method878(var23[var29], (byte) 124, false);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 1426)
    public final boolean method1233(byte arg0, String arg1) {
        field2491++;
        int var3 = -71 / ((-arg0 - 89) / 37);
        if (this.method1228(true)) {
            String var4 = arg1.toLowerCase();
            int var5 = this.field2494.field1597.method2516(class161.method1082(var4, -24735), 112);
            return this.method1200(var5, -65);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(IB)[B", line = 1448)
    public final byte[] method1234(int arg0, byte arg1) {
        field2505++;
        if (!this.method1228(true)) {
            return null;
        } else if (this.field2494.field1610.length == 1) {
            return this.method1235(0, false, arg0);
        } else if (arg1 != 76) {
            return null;
        } else if (!this.method1209(arg0, 126)) {
            return null;
        } else if (this.field2494.field1610[arg0] == 1) {
            return this.method1235(arg0, false, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(IZI)[B", line = 1476)
    public final byte[] method1235(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field2501 = -46;
        }
        field2489++;
        return this.method1226((int[]) null, arg2, -3738, arg0);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 1493)
    public final int method1236(String arg0, byte arg1) {
        if (arg1 != 84) {
            return 73;
        }
        field2496++;
        if (this.method1228(true)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field2494.field1597.method2516(class161.method1082(var3, -24735), -24);
            return this.method1213(-85, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 1525)
    public static final void method1237(String arg0, boolean arg1, int arg2) {
        if (arg2 > -116) {
            return;
        }
        field2511++;
        if (class72.field1026 == 0 && class7.field93 < 2) {
            return;
        }
        try {
            if (arg0.equalsIgnoreCase("fpson")) {
                class169.field2287 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                class169.field2287 = false;
            }
            if (arg0.equalsIgnoreCase("cleartext")) {
                class354.field5254.method48(22754);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                class294.method1994(16956);
                for (int var3 = 0; var3 < 10; var3++) {
                    System.gc();
                }
                Runtime var4 = Runtime.getRuntime();
                int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
                class17.method129("mem=" + var5 + "k", (byte) -5);
            }
            if (arg0.equalsIgnoreCase("compact")) {
                class294.method1994(16956);
                for (int var6 = 0; var6 < 10; var6++) {
                    System.gc();
                }
                Runtime var7 = Runtime.getRuntime();
                int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class17.method129("Memory before cleanup=" + var8 + "k", (byte) -5);
                class116.method849((byte) -114);
                class294.method1994(16956);
                for (int var9 = 0; var9 < 10; var9++) {
                    System.gc();
                }
                int var10 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
                class17.method129("Memory after cleanup=" + var10 + "k", (byte) -5);
            }
            if (arg0.equalsIgnoreCase("pcachesize")) {
                class17.method129("Number of player models in cache:" + class439.method2746((byte) 92), (byte) -5);
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                class11.method91((byte) -63);
            }
            if (arg0.equalsIgnoreCase("clientjs5drop")) {
                class305.field4565.method356(true);
            }
            if (arg0.equalsIgnoreCase("serverjs5drop")) {
                class305.field4565.method354((byte) 127);
            }
            if (arg0.equalsIgnoreCase("breakcon")) {
                class63.field948.method2400(-120);
                class290.field4380.method2363(-974);
                class305.field4565.method362((byte) 96);
            }
            if (arg0.equalsIgnoreCase("rebuild")) {
                class194.method1289(-3664);
                class403.method2571(-1);
            }
            if (arg0.equalsIgnoreCase("wm1")) {
                class246.method1611(-43, false, 1, -1, -1);
            }
            if (arg0.equalsIgnoreCase("wm2")) {
                class246.method1611(-43, false, 2, -1, -1);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class246.method1611(-43, false, 3, 768, 1024);
            }
            if (arg0.equalsIgnoreCase("tk0")) {
                class169.method1127((byte) -88, 0);
                class325.field4817 = 0;
                class212.method1398(-44, class63.field948);
                class113.field1470 = false;
            }
            if (arg0.equalsIgnoreCase("tk1")) {
                class169.method1127((byte) -102, 1);
                class325.field4817 = 1;
                class212.method1398(-32, class63.field948);
                class113.field1470 = false;
            }
            if (arg0.equalsIgnoreCase("tk2")) {
                class169.method1127((byte) -127, 2);
                class325.field4817 = 2;
                class212.method1398(-47, class63.field948);
                class113.field1470 = false;
            }
            if (arg0.equalsIgnoreCase("tk3")) {
                class169.method1127((byte) -56, 3);
            }
            if (arg0.equalsIgnoreCase("ot")) {
                class423.field6169 = !class423.field6169;
                class212.method1398(-59, class63.field948);
                class113.field1470 = false;
                class194.method1289(-3664);
            }
            if (arg0.equalsIgnoreCase("gb")) {
                class257.field3775 = !class257.field3775;
                class212.method1398(-120, class63.field948);
                class113.field1470 = false;
                class194.method1289(-3664);
            }
            if (arg0.startsWith("shadows ")) {
                class330.field4863 = class212.method1392(true, arg0.substring(8));
                class212.method1398(-121, class63.field948);
                class113.field1470 = false;
                class194.method1289(-3664);
            }
            if (arg0.startsWith("setba")) {
                class249.field3681 = class212.method1392(true, arg0.substring(6));
                class212.method1398(-115, class63.field948);
                class113.field1470 = false;
            }
            if (arg0.startsWith("setparticles")) {
                class199.method1313(100, class212.method1392(true, arg0.substring(13)));
                class212.method1398(-38, class63.field948);
                class113.field1470 = false;
            }
            if (arg0.startsWith("fps ") && class72.field1026 != 0) {
                class333.method2180(class212.method1392(true, arg0.substring(4)), -17498);
            }
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("rect_debug")) {
                class7.field105 = class212.method1392(true, arg0.substring(10).trim());
                class17.method129("rect_debug=" + class7.field105, (byte) -5);
            }
            if (arg0.equalsIgnoreCase("qa_op_test")) {
                class126.field1649 = true;
            }
            if (arg0.equalsIgnoreCase("clipcomponents")) {
                class256.field3740 = !class256.field3740;
                class17.method129("clipcomponents=" + class256.field3740, (byte) -5);
            }
            if (arg0.startsWith("bloom")) {
                boolean var11 = class126.field1647.method498();
                if (!class390.method2518(!var11, -106)) {
                    class17.method129("Failed to enable bloom", (byte) -5);
                } else if (var11) {
                    class17.method129("Bloom disabled", (byte) -5);
                } else {
                    class17.method129("Bloom enabled", (byte) -5);
                }
            }
            if (arg0.equalsIgnoreCase("tween")) {
                if (class361.field5345) {
                    class361.field5345 = false;
                    class17.method129("Forced tweening disabled.", (byte) -5);
                } else {
                    class361.field5345 = true;
                    class17.method129("Forced tweening ENABLED!", (byte) -5);
                }
            }
            if (arg0.equalsIgnoreCase("shiftclick")) {
                if (class396.field5779) {
                    class17.method129("Shift-click disabled.", (byte) -5);
                    class396.field5779 = false;
                } else {
                    class17.method129("Shift-click ENABLED!", (byte) -5);
                    class396.field5779 = true;
                }
            }
            if (arg0.equalsIgnoreCase("getcgcoord")) {
                class17.method129("x:" + (class383.field5609.field5921 >> 7) + " z:" + (class383.field5609.field5930 >> 7), (byte) -5);
            }
            if (arg0.equalsIgnoreCase("getheight")) {
                class17.method129("Height: " + class266.field3950[class268.field3973].method722(class383.field5609.field5921 >> 7, class383.field5609.field5930 >> 7), (byte) -5);
            }
            if (arg0.equalsIgnoreCase("resetminimap")) {
                class118.field1532.method1229(30);
                class118.field1532.method1211(0);
                class236.method1533(126);
                class403.method2571(-1);
            }
            if (arg0.startsWith("mc")) {
                if (class126.field1647.method442()) {
                    int var12 = Integer.parseInt(arg0.substring(3));
                    if (var12 < 1) {
                        var12 = 1;
                    } else if (var12 > 4) {
                        var12 = 4;
                    }
                    class334.field4918 = var12;
                    class126.field1647.method492(class334.field4918);
                    class126.field1647.method527(0);
                    class17.method129("Render cores now: " + class334.field4918, (byte) -5);
                } else {
                    class17.method129("Current toolkit doesn't support multiple cores", (byte) -5);
                }
            }
            if (arg0.startsWith("cachespace")) {
                class17.method129("I(s): " + class136.field1761.method370(-113) + "/" + class136.field1761.method377(63), (byte) -5);
                class17.method129("I(m): " + class244.field3423.method370(-124) + "/" + class244.field3423.method377(51), (byte) -5);
                class17.method129("O(s): " + class444.field6413.method1426((byte) 94) + "/" + class444.field6413.method1419((byte) -98), (byte) -5);
            }
            if (arg0.equalsIgnoreCase("getcamerapos")) {
                class17.method129("Pos: " + class268.field3973 + "," + ((class326.field4829 >> 7) + class236.field3292 >> 6) + "," + ((class279.field4099 >> 7) + class90.field1223 >> 6) + "," + ((class326.field4829 >> 7) + class236.field3292 & 0x3F) + "," + ((class279.field4099 >> 7) + class90.field1223 & 0x3F) + " Height: " + (class248.method1621(class326.field4829, class279.field4099, -13853, class268.field3973) - class289.field4331), (byte) -5);
                class17.method129("Look: " + class268.field3973 + "," + (class236.field3292 + class191.field2662 >> 6) + "," + (class90.field1223 + class424.field6192 >> 6) + "," + (class191.field2662 + class236.field3292 & 0x3F) + "," + (class424.field6192 + class90.field1223 & 0x3F) + " Height: " + (class248.method1621(class191.field2662, class424.field6192, -13853, class268.field3973) - class393.field5720), (byte) -5);
            }
            if (arg0.equals("showocc")) {
                class246.field3464 = !class246.field3464;
                class194.method1289(-3664);
            }
            if (arg0.equals("renderprofile") || arg0.equals("rp")) {
                class329.field4849 = !class329.field4849;
                class126.field1647.method502(class329.field4849);
                class415.method2619(true);
            }
            if (arg0.equals("nonpcs")) {
                class289.field4335 = !class289.field4335;
            }
            if (arg0.equals("autoworld")) {
                class269.method1796((byte) 60);
            }
            if (arg0.equals("heap")) {
                class17.method129("Heap: " + class393.field5727 + "MB", (byte) -5);
            }
            if (arg0.equals("savevarcs")) {
                class322.method2119((byte) -74);
            }
            if (arg0.equals("scramblevarcs")) {
                for (int var13 = 0; var13 < class216.field3014.length; var13++) {
                    if (class28.field476[var13]) {
                        class216.field3014[var13] = (int) (Math.random() * 99999.0D);
                        if (Math.random() > 0.5D) {
                            class216.field3014[var13] *= -1;
                        }
                    }
                }
                class322.method2119((byte) -125);
            }
            if (arg0.equals("showcolmap")) {
                class325.field4808 = true;
                class403.method2571(-1);
            }
            if (arg0.equals("hidecolmap")) {
                class325.field4808 = false;
                class403.method2571(-1);
            }
            if (arg0.equals("resetcache")) {
                class452.method2808(0);
            }
            if (arg0.equals("profilecpu")) {
                class17.method129(class119.method865(1) + "ms", (byte) -5);
            }
            if (class381.field5579 == 30) {
                class261.field3837++;
                class140.field1797.method1833(-20379, 3);
                class140.field1797.method2204(arg0.length() + 2, 8);
                class140.field1797.method2204(arg1 ? 1 : 0, 8);
                class140.field1797.method2214(arg0, -69);
                return;
            }
        } catch (Exception var14) {
            class17.method129("Whoops, something went wrong.", (byte) -5);
            return;
        }
    }
}
