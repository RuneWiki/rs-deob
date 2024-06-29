import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class334 extends class86 {

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "Lub;")
    public class18 field4219 = new class18();

    @OriginalMember(owner = "client!qq", name = "J", descriptor = "Liq;")
    public class432 field4223 = new class432();

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "Lgj;")
    private class450 field4206;

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "[I")
    public static int[] field4208 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    public static int field4216 = 50;

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "[I")
    public static int[] field4212 = new int[field4216];

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "[I")
    public static int[] field4204 = new int[field4216];

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field4217 = new String[field4216];

    @OriginalMember(owner = "client!qq", name = "I", descriptor = "[I")
    public static int[] field4222 = new int[field4216];

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "[I")
    public static int[] field4214 = new int[field4216];

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "[I")
    public static int[] field4221 = new int[field4216];

    @OriginalMember(owner = "client!qq", name = "K", descriptor = "[I")
    public static int[] field4224 = new int[field4216];

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "[I")
    public static int[] field4218;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZILrt;)V")
    private final void method1929(boolean arg0, int arg1, class152 arg2) {
        if ((this.field4206.field6479[arg2.field1906] & 0x4) != 0 && arg2.field1904 < 0) {
            int var4 = this.field4206.field6496[arg2.field1906] / class94.field1140;
            int var5 = (var4 + 1048575 - arg2.field1917) / var4;
            arg2.field1917 = arg2.field1917 + (arg1 * var4) & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field4206.field6456[arg2.field1906] == 0) {
                    arg2.field1913 = class393.method2245(arg2.field1910, arg2.field1913.method2236(), arg2.field1913.method2232(), arg2.field1913.method2262());
                } else {
                    arg2.field1913 = class393.method2245(arg2.field1910, arg2.field1913.method2236(), 0, arg2.field1913.method2262());
                    this.field4206.method2680(arg2.field1912.field4529[arg2.field1918] < 0, (byte) 75, arg2);
                }
                if (arg2.field1912.field4529[arg2.field1918] < 0) {
                    arg2.field1913.method2246(-1);
                }
                arg1 = arg2.field1917 / var4;
            }
        }
        field4215++;
        if (arg0) {
            field4214 = null;
        }
        arg2.field1913.method688(arg1);
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V")
    public static void method1930(int arg0) {
        field4212 = null;
        field4222 = null;
        field4224 = null;
        if (arg0 <= 44) {
            field4208 = null;
        }
        field4214 = null;
        field4218 = null;
        field4204 = null;
        field4221 = null;
        field4217 = null;
        field4208 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBLid;IZII)V")
    public static final void method1931(int arg0, byte arg1, class415 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field4220++;
        if (class189.field2475 >= 50 || arg2 == null || arg2.field5903 == null || arg5 >= arg2.field5903.length || arg2.field5903[arg5] == null) {
            return;
        }
        int var7 = arg2.field5903[arg5][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        if (arg2.field5903[arg5].length > 1) {
            int var10 = (int) (Math.random() * (double) arg2.field5903[arg5].length);
            if (var10 > 0) {
                var8 = arg2.field5903[arg5][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg4) {
                class377.method2142(0, 0, var9, var8, 255);
            }
        } else if (class407.field5817.field3630 != 0) {
            if (arg1 < 84) {
                method1931(30, (byte) 28, null, -38, false, 107, 39);
            }
            int var12 = arg0 - 64 >> 7;
            int var13 = arg6 - 64 >> 7;
            class466.field6728[class189.field2475++] = new class212((byte) 1, var8, var9, 0, 255, (arg3 << 24) + (var12 << 16) - (-(var13 << 8) + -var11));
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lfh;I)Ljava/lang/String;")
    public static final String method1932(class463 arg0, int arg1) {
        if (arg1 == 28462) {
            field4202++;
            return class462.method2723(true, 32767, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[ILrt;III)V")
    private final void method1933(int arg0, int[] arg1, class152 arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -1) {
            method1930(120);
        }
        field4211++;
        if ((this.field4206.field6479[arg2.field1906] & 0x4) != 0 && arg2.field1904 < 0) {
            int var7 = this.field4206.field6496[arg2.field1906] / class94.field1140;
            while (true) {
                int var8 = (1048575 - (arg2.field1917 - var7)) / var7;
                if (arg4 < var8) {
                    arg2.field1917 += arg4 * var7;
                    break;
                }
                arg2.field1913.method693(arg1, arg5, var8);
                arg2.field1917 += var7 * var8 - 1048576;
                arg5 += var8;
                arg4 -= var8;
                int var9 = class94.field1140 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class393 var11 = arg2.field1913;
                if (this.field4206.field6456[arg2.field1906] == 0) {
                    arg2.field1913 = class393.method2245(arg2.field1910, var11.method2236(), var11.method2232(), var11.method2262());
                } else {
                    arg2.field1913 = class393.method2245(arg2.field1910, var11.method2236(), 0, var11.method2262());
                    this.field4206.method2680(arg2.field1912.field4529[arg2.field1918] < 0, (byte) 71, arg2);
                    arg2.field1913.method2251(var9, var11.method2232());
                }
                if (arg2.field1912.field4529[arg2.field1918] < 0) {
                    arg2.field1913.method2246(-1);
                }
                var11.method2239(var9);
                var11.method693(arg1, arg5, arg3 - arg5);
                if (var11.method2257()) {
                    this.field4223.method2530(var11);
                }
            }
        }
        arg2.field1913.method693(arg1, arg5, arg4);
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "()I")
    public final int method691() {
        field4207++;
        return 0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([III)V")
    public final void method693(int[] arg0, int arg1, int arg2) {
        field4213++;
        this.field4223.method693(arg0, arg1, arg2);
        for (class152 var4 = (class152) this.field4219.method153(0); var4 != null; var4 = (class152) this.field4219.method161(-104)) {
            if (!this.field4206.method2670(var4, -1231185848)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1908) {
                        this.method1933(-1, arg0, var4, var6 + var5, var5, var6);
                        var4.field1908 -= var5;
                        break;
                    }
                    this.method1933(-1, arg0, var4, var5 + var6, var4.field1908, var6);
                    var5 -= var4.field1908;
                    var6 += var4.field1908;
                } while (!this.field4206.method2665(var4, arg0, var5, -102, var6));
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public final void method688(int arg0) {
        field4203++;
        this.field4223.method688(arg0);
        for (class152 var2 = (class152) this.field4219.method153(0); var2 != null; var2 = (class152) this.field4219.method161(-44)) {
            if (!this.field4206.method2670(var2, -1231185848)) {
                int var3 = arg0;
                do {
                    if (var2.field1908 >= var3) {
                        this.method1929(false, var3, var2);
                        var2.field1908 -= var3;
                        break;
                    }
                    this.method1929(false, var2.field1908, var2);
                    var3 -= var2.field1908;
                } while (!this.field4206.method2665(var2, null, var3, -104, 0));
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "()Lhu;")
    public final class86 method692() {
        field4205++;
        class152 var1;
        do {
            var1 = (class152) this.field4219.method161(-46);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1913 == null);
        return var1.field1913;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "()Lhu;")
    public final class86 method689() {
        field4210++;
        class152 var1 = (class152) this.field4219.method153(0);
        if (var1 == null) {
            return null;
        } else if (var1.field1913 == null) {
            return this.method692();
        } else {
            return var1.field1913;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lgj;)V")
    public class334(class450 arg0) {
        this.field4206 = arg0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIII[Lhd;I)V")
    public static final void method1934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class523[] arg8, int arg9) {
        if (arg2 != -4063) {
            method1934(109, -10, 120, -11, -71, 119, 90, 100, null, 40);
        }
        field4209++;
        class33.field416.method330(arg0, arg9, arg6, arg3);
        for (int var10 = 0; var10 < arg8.length; var10++) {
            class523 var11 = arg8[var10];
            if (var11 != null && (var11.field7673 == arg4 || arg4 == -1412584499 && class233.field2985 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class463.field6651[class65.field840].setBounds(var11.field7623 + arg5, var11.field7660 + arg1, var11.field7617, var11.field7574);
                    var12 = class65.field840++;
                } else {
                    var12 = arg7;
                }
                var11.field7626 = class163.field2065;
                var11.field7621 = var12;
                if (!client.method1238(var11)) {
                    if (var11.field7650 != 0) {
                        class110.method811(14230, var11);
                    }
                    int var13 = var11.field7623 + arg5;
                    int var14 = var11.field7660 + arg1;
                    int var15 = var11.field7678;
                    if (class191.field2480 && (client.method1226(var11).field942 != 0 || var11.field7632 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class233.field2985 == var11) {
                        if (arg4 != -1412584499 && (class474.field6872 == var11.field7669 || class506.field7287 == var11.field7669)) {
                            class448.field6410 = arg1;
                            class42.field522 = arg8;
                            class519.field7505 = arg5;
                            continue;
                        }
                        if (class178.field2358 && class382.field5029) {
                            int var16 = class204.field2664.method1333(arg2 + 4070);
                            int var17 = class204.field2664.method1337(69);
                            int var18 = var16 - class452.field6531;
                            int var19 = var17 - class501.field7242;
                            if (var18 < class368.field4764) {
                                var18 = class368.field4764;
                            }
                            if ((class368.field4764 + class177.field2338.field7617) < (var11.field7617 + var18)) {
                                var18 = class368.field4764 + class177.field2338.field7617 - var11.field7617;
                            }
                            if (var19 < class266.field3371) {
                                var19 = class266.field3371;
                            }
                            var13 = var18;
                            if ((class266.field3371 + class177.field2338.field7574) < (var11.field7574 + var19)) {
                                var19 = class177.field2338.field7574 + class266.field3371 - var11.field7574;
                            }
                            var14 = var19;
                        }
                        if (class506.field7287 == var11.field7669) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field7632 == 2) {
                        var25 = arg3;
                        var23 = arg0;
                        var22 = arg9;
                        var24 = arg6;
                    } else {
                        int var20 = var11.field7617 + var13;
                        int var21 = var11.field7574 + var14;
                        var22 = var14 > arg9 ? var14 : arg9;
                        var23 = var13 <= arg0 ? arg0 : var13;
                        if (var11.field7632 == 9) {
                            var20++;
                            var21++;
                        }
                        var24 = var20 < arg6 ? var20 : arg6;
                        var25 = arg3 > var21 ? var21 : arg3;
                    }
                    if (var23 < var24 && var22 < var25) {
                        if (var11.field7650 != 0) {
                            if (class256.field3257 == var11.field7650 || class214.field2755 == var11.field7650) {
                                class113.method821(var13, 600, var14, class214.field2755 == var11.field7650, var11.field7574, var11.field7617);
                                class229.field2928[var12] = true;
                                class33.field416.method330(arg0, arg9, arg6, arg3);
                                continue;
                            }
                            if (class322.field4091 == var11.field7650) {
                                if (var11.method3122(true, class33.field416) != null) {
                                    class139.method946(113);
                                    class72.method632(class33.field416, var11, 710017550, var14, var13);
                                    class324.field4108[var12] = true;
                                    class33.field416.method330(arg0, arg9, arg6, arg3);
                                }
                                continue;
                            }
                            if (class379.field4997 == var11.field7650) {
                                if (var11.method3122(true, class33.field416) != null) {
                                    class199.method1256(var13, var11, var14, arg2 ^ 0xFFFFF05E);
                                    class324.field4108[var12] = true;
                                    class33.field416.method330(arg0, arg9, arg6, arg3);
                                }
                                continue;
                            }
                            if (class493.field7170 == var11.field7650) {
                                class60.method555(class79.field1024, class33.field416, var11.field7574, var11.field7617, var14, var13, 127);
                                class229.field2928[var12] = true;
                                class33.field416.method330(arg0, arg9, arg6, arg3);
                                continue;
                            }
                            if (class279.field3518 == var11.field7650) {
                                class34.method250(class33.field416, var13, var14, var11.field7574, var11.field7617, (byte) 36);
                                class229.field2928[var12] = true;
                                class33.field416.method330(arg0, arg9, arg6, arg3);
                                continue;
                            }
                            if (class493.field7177 == var11.field7650) {
                                if (!class394.field5285 && !class404.field5752) {
                                    continue;
                                }
                                int var26 = var13 + var11.field7617;
                                int var27 = var14 + 15;
                                if (class394.field5285) {
                                    class460.field6579.method1863("Fps:" + class189.field2474, var27, -256, (byte) -105, var26, -1);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class460.field6579.method1863("Mem:" + var29 + "k", var27, var30, (byte) -29, var26, -1);
                                    var27 += 15;
                                    class460.field6579.method1863("In:" + class25.field369 + "B/s Out:" + class397.field5698 + "B/s", var27, -256, (byte) -88, var26, -1);
                                    var27 += 15;
                                    int var31 = class33.field416.method286() / 1024;
                                    class460.field6579.method1863("Offheap:" + var31 + "k", var27, var31 > 65536 ? -65536 : -256, (byte) -22, var26, -1);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 30; var35++) {
                                        var32 += class122.field1639[var35].method494(arg2 + 4061);
                                        var33 += class122.field1639[var35].method497((byte) 1);
                                        var34 += class122.field1639[var35].method493((byte) -63);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class144.method968((long) var37, 0, 2, true, false) + "% (" + var36 + "%)";
                                    class143.field1843.method1863(var38, var27, -256, (byte) -108, var26, -1);
                                    var27 += 12;
                                }
                                if (class347.field4460 > 0) {
                                    class143.field1843.method1863("Particles: " + class308.field3934 + " / " + class347.field4460, var27, -256, (byte) -39, var26, -1);
                                }
                                var27 += 12;
                                if (class404.field5752) {
                                    class143.field1843.method1863("Polys: " + class33.field416.method367() + " Models: " + class33.field416.method298(), var27, -256, (byte) -34, var26, -1);
                                    var27 += 12;
                                    class143.field1843.method1863("Ls: " + class147.field1867 + " La: " + class490.field7139 + " NPC: " + class277.field3502 + " Pl: " + class462.field6611, var27, -256, (byte) -27, var26, -1);
                                    var27 += 12;
                                    class319.method1879(-5689);
                                }
                                class229.field2928[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field7632 == 0) {
                            if (class109.field1475 == var11.field7650 && class33.field416.method304()) {
                                class33.field416.method375(var13, var14, var11.field7617, var11.field7574);
                            }
                            method1934(var23, var14 - var11.field7659, -4063, var25, var11.field7723, var13 - var11.field7636, var24, var12, arg8, var22);
                            if (var11.field7717 != null) {
                                method1934(var23, var14 - var11.field7659, -4063, var25, var11.field7723, var13 - var11.field7636, var24, var12, var11.field7717, var22);
                            }
                            class175 var39 = (class175) class397.field5684.method2022(arg2 ^ 0xFDE, (long) var11.field7723);
                            if (var39 != null) {
                                class384.method2174(var22, var25, var39.field2279, var14, var24, var12, var23, var13, (byte) 86);
                            }
                            if (class109.field1475 == var11.field7650 && class33.field416.method304()) {
                                class33.field416.method272();
                                class325.field4123 = true;
                            }
                            class33.field416.method330(arg0, arg9, arg6, arg3);
                        }
                        if (class508.field7311[var12] || class42.field519 > 1) {
                            if (var11.field7632 == 3) {
                                if (var15 == 0) {
                                    if (var11.field7716) {
                                        class33.field416.method308(var13, var14, var11.field7617, var11.field7574, var11.field7699, 0);
                                    } else {
                                        class33.field416.method303(var13, var14, var11.field7617, var11.field7574, var11.field7699, 0);
                                    }
                                } else if (var11.field7716) {
                                    class33.field416.method308(var13, var14, var11.field7617, var11.field7574, var11.field7699 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class33.field416.method303(var13, var14, var11.field7617, var11.field7574, 255 - (var15 & 0xFF) << 24 | var11.field7699 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field7632 == 4) {
                                class316 var40 = var11.method3115(class33.field416, -114);
                                if (var40 != null) {
                                    int var41 = var11.field7699;
                                    String var42 = var11.field7728;
                                    if (var11.field7567 != -1) {
                                        class9 var43 = class376.field4949.method624((byte) -127, var11.field7567);
                                        var42 = var43.field140;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field138 == 1 || var11.field7609 != 1) && var11.field7609 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class64.method575(var11.field7609, 0);
                                        }
                                    }
                                    if (class466.field6723 == var11) {
                                        var42 = class446.field6392.method1936(-26539, class11.field177);
                                        var41 = var11.field7699;
                                    }
                                    if (class468.field6765) {
                                        class33.field416.method334(var13, var14, var13 + var11.field7617, var14 - -var11.field7574);
                                    }
                                    var40.method1854(var13, var11.field7600 ? 255 - (var15 & 0xFF) << 24 : -1, null, var11.field7617, var11.field7590, 0, var11.field7576, 255 - (var15 & 0xFF) << 24 | var41, var11.field7637, 0, var11.field7574, null, var42, var14, 1, var11.field7681, class6.field61);
                                    if (class468.field6765) {
                                        class33.field416.method330(arg0, arg9, arg6, arg3);
                                    }
                                } else if (class209.field2707) {
                                    class136.method935(var11, -125);
                                }
                            } else if (var11.field7632 == 5) {
                                if (var11.field7730 >= 0) {
                                    var11.method3112(-127, class456.field6572, class375.field4840).method2031(class33.field416, var11.field7680 << 3, var11.field7574, 16334, var13, 0, var14, var11.field7617, var11.field7701 << 3, 0);
                                } else {
                                    class16 var45;
                                    if (var11.field7567 == -1) {
                                        var45 = var11.method3118(-1, class33.field416);
                                    } else {
                                        class442 var44 = var11.field7721 ? class23.field336.field2823 : null;
                                        var45 = class376.field4949.method616(var11.field7692 | 0xFF000000, var11.field7609, var11.field7616, 125, var44, class33.field416, var11.field7567, var11.field7633);
                                    }
                                    if (var45 != null) {
                                        int var46 = var45.method148();
                                        int var47 = var45.method131();
                                        int var48 = 255 - (var15 & 0xFF) << 24 | (var11.field7699 == 0 ? 16777215 : var11.field7699 & 0xFFFFFF);
                                        if (var11.field7732) {
                                            class33.field416.method334(var13, var14, var11.field7617 + var13, var11.field7574 + var14);
                                            if (var11.field7597 != 0) {
                                                int var49 = (var11.field7617 + var46 - 1) / var46;
                                                int var50 = (var47 + var11.field7574 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        if (var11.field7699 == 0) {
                                                            var45.method140((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field7597);
                                                        } else {
                                                            var45.method141((float) var46 / 2.0F + (float) (var13 + (var46 * var51)), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field7597, 0, var48, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field7699 == 0 && var15 == 0) {
                                                var45.method142(var13, var14, var11.field7617, var11.field7574);
                                            } else {
                                                var45.method143(var13, var14, var11.field7617, var11.field7574, 0, var48, 1);
                                            }
                                            class33.field416.method330(arg0, arg9, arg6, arg3);
                                        } else if (var11.field7699 == 0 && var15 == 0) {
                                            if (var11.field7597 != 0) {
                                                var45.method140((float) var11.field7617 / 2.0F + (float) var13, (float) var11.field7574 / 2.0F + (float) var14, var11.field7617 * 4096 / var46, var11.field7597);
                                            } else if (var11.field7617 == var46 && var11.field7574 == var47) {
                                                var45.method130(var13, var14);
                                            } else {
                                                var45.method128(var13, var14, var11.field7617, var11.field7574);
                                            }
                                        } else if (var11.field7597 != 0) {
                                            var45.method141((float) var11.field7617 / 2.0F + (float) var13, (float) var11.field7574 / 2.0F + (float) var14, var11.field7617 * 4096 / var46, var11.field7597, 0, var48, 1);
                                        } else if (var11.field7617 == var46 && var11.field7574 == var47) {
                                            var45.method139(var13, var14, 0, var48, 1);
                                        } else {
                                            var45.method135(var13, var14, var11.field7617, var11.field7574, 0, var48, 1);
                                        }
                                    } else if (class209.field2707) {
                                        class136.method935(var11, arg2 ^ 0xFA2);
                                    }
                                }
                            } else if (var11.field7632 == 6) {
                                class69.method611((byte) 92);
                                class474 var53 = null;
                                int var54 = 0;
                                if (var11.field7567 != -1) {
                                    class9 var55 = class376.field4949.method624((byte) -121, var11.field7567);
                                    if (var55 != null) {
                                        class9 var56 = var55.method52(var11.field7609, 0);
                                        class415 var57 = var11.field7703 == -1 ? null : class404.field5756.method557(var11.field7703, 15);
                                        class442 var58 = var11.field7721 ? class23.field336.field2823 : null;
                                        var53 = var56.method49((byte) 20, class33.field416, var11.field7627, 2048, var11.field7691, var57, var11.field7698, var58, 1);
                                        if (var53 == null) {
                                            class136.method935(var11, -126);
                                        } else {
                                            var54 = -var53.method418() >> 1;
                                        }
                                    }
                                } else if (var11.field7580 == 5) {
                                    int var63 = var11.field7689;
                                    if (var63 >= 0 && var63 < 2048) {
                                        class223 var64 = class387.field5107[var63];
                                        class415 var65 = var11.field7703 == -1 ? null : class404.field5756.method557(var11.field7703, 15);
                                        if (var64 != null && (class66.field858 == var63 || class11.method85(var64.field2852, 0) == var11.field7588)) {
                                            var53 = var64.field2823.method2607(-1, var11.field7698, 2048, null, null, var11.field7691, class33.field416, true, 0, var65, 0, class491.field7160, class390.field5244, var11.field7627, class327.field4134, class404.field5756, class376.field4949, false, class360.field4654);
                                        }
                                    }
                                } else if (var11.field7580 == 8 || var11.field7580 == 9) {
                                    class529 var60 = class290.method1705(0, false, var11.field7689);
                                    class415 var61 = var11.field7703 == -1 ? null : class404.field5756.method557(var11.field7703, 15);
                                    if (var60 != null) {
                                        class442 var62 = var11.field7721 ? class23.field336.field2823 : null;
                                        var53 = var60.method3141(var11.field7588, var62, (byte) 23, var11.field7627, class33.field416, var11.field7580 == 9, var11.field7691, var11.field7698, 2048, var61);
                                    }
                                } else if (var11.field7703 == -1) {
                                    var53 = var11.method3119(class404.field5756, -1, -1, class327.field4134, class491.field7160, class33.field416, class360.field4654, class23.field336.field2823, 2048, -1, class376.field4949, 0, null, class390.field5244);
                                    if (var53 == null && class209.field2707) {
                                        class136.method935(var11, -126);
                                    }
                                } else {
                                    class415 var59 = class404.field5756.method557(var11.field7703, 15);
                                    var53 = var11.method3119(class404.field5756, -1, var11.field7691, class327.field4134, class491.field7160, class33.field416, class360.field4654, class23.field336.field2823, 2048, var11.field7698, class376.field4949, var11.field7627, var59, class390.field5244);
                                    if (var53 == null && class209.field2707) {
                                        class136.method935(var11, -126);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field7622 <= 0) {
                                        var66 = 512;
                                    } else {
                                        var66 = (var11.field7617 << 9) / var11.field7622;
                                    }
                                    int var67;
                                    if (var11.field7639 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var11.field7574 << 9) / var11.field7639;
                                    }
                                    int var68 = (var11.field7645 * var66 >> 9) + var11.field7617 / 2 + var13;
                                    int var69 = (var11.field7668 * var67 >> 9) + var11.field7574 / 2 + var14;
                                    class208.field2695.method223();
                                    class33.field416.method287(class208.field2695);
                                    class33.field416.method355(var68, var69, var66, var67);
                                    class33.field416.method338((float) (var11.field7683 << 0), var11.field7608 ? (float) (var11.field7566 << 0) : (float) (var11.field7566 << 0) * 1.5F);
                                    if (arg4 == -1412584499 || class325.field4123) {
                                        class33.field416.method318();
                                        class33.field416.method365();
                                        class33.field416.method330(arg0, arg9, arg6, arg3);
                                        class325.field4123 = false;
                                    }
                                    if (var11.field7618) {
                                        class33.field416.method280(false);
                                    }
                                    int var70 = (var11.field7674 << 0) * class36.field443[var11.field7620 << 3] >> 15;
                                    int var71 = (var11.field7674 << 0) * class36.field478[var11.field7620 << 3] >> 15;
                                    class293.field3753.method225(-var11.field7690 << 3);
                                    class293.field3753.method226(var11.field7586 << 3);
                                    class293.field3753.method231(var11.field7603 << 0, (var11.field7688 << 0) + var70 + var54, var71 - -(var11.field7688 << 0));
                                    class293.field3753.method234(var11.field7620 << 3);
                                    if (class468.field6765) {
                                        class33.field416.method334(var13, var14, var11.field7617 + var13, var11.field7574 + var14);
                                    }
                                    if (var11.field7608) {
                                        var53.method413(class293.field3753, null, var11.field7674 << 0, 1);
                                    } else {
                                        var53.method415(class293.field3753, null, 1);
                                    }
                                    if (class468.field6765) {
                                        class33.field416.method330(arg0, arg9, arg6, arg3);
                                    }
                                    if (var11.field7618) {
                                        class33.field416.method280(true);
                                    }
                                    class33.field416.method338(0.0F, 0.0F);
                                }
                            } else if (var11.field7632 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field7607) {
                                    var75 = var14;
                                    var72 = var11.field7617 + var13;
                                    var74 = var11.field7574 + var14;
                                    var73 = var13;
                                } else {
                                    var72 = var13 + var11.field7617;
                                    var73 = var13;
                                    var74 = var14;
                                    var75 = var11.field7574 + var14;
                                }
                                if (var11.field7671 == 1) {
                                    class33.field416.method269(var73, var74, var72, var75, var11.field7699, 0);
                                } else {
                                    class33.field416.method337(var73, var74, var72, var75, var11.field7699, var11.field7671, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
