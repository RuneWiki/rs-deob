import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class421 extends class174 {

    @OriginalMember(owner = "client!mu", name = "jb", descriptor = "Lwq;")
    public class348 field6187;

    @OriginalMember(owner = "client!mu", name = "nb", descriptor = "I")
    public static int field6191 = -1;

    @OriginalMember(owner = "client!mu", name = "fb", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!mu", name = "hb", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!mu", name = "ib", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!mu", name = "kb", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!mu", name = "lb", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!mu", name = "mb", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!mu", name = "gb", descriptor = "Lgp;")
    public static class561 field6184;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(B)V")
    public static final void method2531(byte arg0) {
        ++field6186;
        if (class112.field1866 != -1 && ~class459.field6615 != 0) {
            int var1 = class606.field8625 - -((-class606.field8625 + class143.field2221) * class39.field522 >> 16);
            class39.field522 += var1;
            if (~class39.field522 > -65536) {
                class33.field444 = false;
                class559.field7927 = false;
            } else {
                class39.field522 = 65535;
                if (class33.field444) {
                    class559.field7927 = false;
                } else {
                    class559.field7927 = true;
                }
                class33.field444 = true;
            }
            float var2 = (float) class39.field522 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class557.field7877 * 2;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class128.field2097[class112.field1866][var4][var5] * 3;
                int var22 = class128.field2097[class112.field1866][var4 - -1][var5] * 3;
                int var23 = (class128.field2097[class112.field1866][var4 + 2][var5] - -class128.field2097[class112.field1866][var4 + 2][var5] - class128.field2097[class112.field1866][var4 - -3][var5]) * 3;
                int var24 = class128.field2097[class112.field1866][var4][var5];
                int var25 = -var21 + var22;
                int var26 = -(var22 * 2) + var21 + var23;
                int var27 = class128.field2097[class112.field1866][var4 + 2][var5] + var22 + -var24 + -var23;
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class448.field6535 = (int) var3[1] * -1;
            class216.field3274 = (int) var3[2] + -(class597.field8500 * 128);
            class545.field7584 = (int) var3[0] - class382.field5687 * 128;
            float[] var6 = new float[3];
            int var7 = class45.field635 * 2;
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class128.field2097[class459.field6615][var7][var8] * 3;
                int var15 = class128.field2097[class459.field6615][var7 + 1][var8] * 3;
                int var16 = (class128.field2097[class459.field6615][var7 - -2][var8] + -class128.field2097[class459.field6615][var7 + 3][var8] + class128.field2097[class459.field6615][var7 + 2][var8]) * 3;
                int var17 = class128.field2097[class459.field6615][var7][var8];
                int var18 = -var14 + var15;
                int var19 = var14 + var16 + -(var15 * 2);
                int var20 = class128.field2097[class459.field6615][var7 + 2][var8] - var17 + -var16 + var15;
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            float var9 = var6[0] + -var3[0];
            float var10 = (var6[1] - var3[1]) * -1.0F;
            float var11 = var6[2] - var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            if (arg0 != -66) {
                field6191 = 51;
            }
            class217.field3284 = (int) (2607.5945876176133D * Math.atan2((double) var10, var12)) & 16383;
            class265.field3862 = (int) (2607.5945876176133D * -Math.atan2((double) var9, (double) var11)) & 16383;
            class394.field5910 = class128.field2097[class112.field1866][var4][3] - -((class128.field2097[class112.field1866][var4 + 2][3] + -class128.field2097[class112.field1866][var4][3]) * class39.field522 >> 16);
        }
    }

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "(B)V")
    public static final void method2532(byte arg0) {
        if (class306.field4412 >= 0) {
            long var1 = class508.method2860(false);
            class306.field4412 = (int) ((long) class306.field4412 - (-class244.field3535 + var1));
            if (~class306.field4412 >= -1) {
                class592.field8417 = class594.field8437.field5192;
                class108.field1796 = class594.field8437.field5197;
                class306.field4412 = -1;
                class10.field100 = class594.field8437.field5188;
                class77.field1403 = class594.field8437.field5191;
                class258.field3756 = class594.field8437.field5180;
                class6.field55 = class594.field8437.field5195;
                class404.field6023 = class594.field8437.field5186;
                class215.field3261 = class594.field8437.field5187;
                class28.field371 = class594.field8437.field5185;
                class429.field6260 = class594.field8437.field5181;
            } else {
                int var3 = (class306.field4412 << 8) / class245.field3545;
                int var4 = -var3 + 255;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class592.field8417 = ((16711935 & class441.field6440) * var3 + (16711935 & class594.field8437.field5192) * var4 & -16711936) - -((class441.field6440 & 65280) * var3 + (class594.field8437.field5192 & 65280) * var4 & 16711680) >>> 8;
                class77.field1403 = ((class275.field4025 & 16711935) * var3 + (16711935 & class594.field8437.field5191) * var4 & -16711936) + ((class275.field4025 & 65280) * var3 + (class594.field8437.field5191 & 65280) * var4 & 16711680) >>> 8;
                class215.field3261 = (class594.field8437.field5187 - class519.field7207) * var6 + class519.field7207;
                class6.field55 = class501.field7031 * var3 - -(class594.field8437.field5195 * var4) >> 8;
                class10.field100 = (-class57.field808 + class594.field8437.field5188) * var6 + class57.field808;
                class258.field3756 = (-class401.field6003 + class594.field8437.field5180) * var6 + class401.field6003;
                class108.field1796 = (class594.field8437.field5197 - class579.field8256) * var6 + class579.field8256;
                class429.field6260 = (-class468.field6742 + class594.field8437.field5181) * var6 + class468.field6742;
                class404.field6023 = (-class12.field120 + class594.field8437.field5186) * var6 + class12.field120;
                if (class6.field59 != class594.field8437.field5185) {
                    class28.field371 = class134.field2161.method104(class6.field59, class594.field8437.field5185, var6, class28.field371);
                }
            }
            class244.field3535 = var1;
        }
        if (arg0 <= 97) {
            method2533((class261) null, (byte) -14, 6);
        }
        ++field6185;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Laj;BI)Z")
    public static final boolean method2533(class261 arg0, byte arg1, int arg2) {
        ++field6189;
        int var3 = arg0.method1660(arg1 + -116, 2);
        if (~var3 == -1) {
            if (~arg0.method1660(36, 1) != -1) {
                method2533(arg0, (byte) 123, arg2);
            }
            int var4 = arg0.method1660(-126, 6);
            int var5 = arg0.method1660(-127, 6);
            boolean var6 = ~arg0.method1660(arg1 + -249, 1) == -2;
            if (var6) {
                class291.field4212[class429.field6246++] = arg2;
            }
            if (class39.field536[arg2] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class537 var7 = class641.field9293[arg2];
                class400 var8 = class39.field536[arg2] = new class400();
                var8.field1555 = arg2;
                if (class514.field7115[arg2] != null) {
                    var8.method2448(class514.field7115[arg2], (byte) -67);
                }
                var8.method771(0, var7.field7491, true);
                var8.field1526 = var7.field7492;
                int var9 = var7.field7494;
                int var10 = var9 >> 28;
                int var11 = var9 >> 14 & 255;
                var8.field5977 = var7.field7490;
                int var12 = 255 & var9;
                var8.field1574[0] = class220.field3310[arg2];
                var8.field5116 = (byte) var10;
                var8.method2445((var11 << 6) + var4 + -class382.field5687, (var12 << 6) - (-var5 - -class597.field8500), (byte) 125);
                var8.field5950 = false;
                class641.field9293[arg2] = null;
                return true;
            }
        } else if (var3 == 1) {
            int var13 = arg0.method1660(31, 2);
            int var14 = class641.field9293[arg2].field7494;
            class641.field9293[arg2].field7494 = ((3 & (var14 >> 28) + var13) << 28) + (var14 & 268435455);
            return false;
        } else if (~var3 == -3) {
            int var15 = arg0.method1660(107, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 7;
            int var18 = class641.field9293[arg2].field7494;
            int var19 = (var18 >> 28) + var16 & 3;
            int var20 = (var18 & 4186610) >> 14;
            int var21 = 255 & var18;
            if (var17 == 0) {
                --var21;
                --var20;
            }
            if (~var17 == -2) {
                --var21;
            }
            if (~var17 == -3) {
                ++var20;
                --var21;
            }
            if (~var17 == -4) {
                --var20;
            }
            if (var17 == 4) {
                ++var20;
            }
            if (~var17 == -6) {
                --var20;
                ++var21;
            }
            if (var17 == 6) {
                ++var21;
            }
            if (~var17 == -8) {
                ++var20;
                ++var21;
            }
            class641.field9293[arg2].field7494 = (var19 << 28) - -(var20 << 14) + var21;
            return false;
        } else {
            if (arg1 != 123) {
                field6191 = 84;
            }
            int var22 = arg0.method1660(0, 18);
            int var23 = var22 >> 16;
            int var24 = (var22 & 65435) >> 8;
            int var25 = var22 & 255;
            int var26 = class641.field9293[arg2].field7494;
            int var27 = (var26 >> 28) + var23 & 3;
            int var28 = 255 & (var26 >> 14) + var24;
            int var29 = var26 - -var25 & 255;
            class641.field9293[arg2].field7494 = (var27 << 28) - (-(var28 << 14) + -var29);
            return false;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method2534(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6190;
        if (~arg3 <= -2 && arg5 >= 1 && class146.field2247 + -2 >= arg3 && ~arg5 >= ~(class66.field990 + -2)) {
            int var9 = arg2;
            if (arg2 < 3 && class402.method2455(arg5, arg3, arg4 + 31692)) {
                var9 = arg2 + 1;
            }
            if (!class202.field2854.method2628((byte) 68, class646.field9388) && !class85.method774(arg5, arg3, (byte) 51, class466.field6714, var9)) {
                return;
            }
            if (class277.field4051 == null) {
                return;
            }
            class406.field6026.method3226(arg6, class159.field2378, arg3, class268.field3916[arg2], arg2, arg5, 121);
            if (~arg7 <= -1) {
                boolean var10 = class202.field2854.field7902;
                class202.field2854.field7902 = true;
                class406.field6026.method3227(arg2, class159.field2378, arg5, arg3, arg0, (byte) 106, class268.field3916[arg2], arg7, arg1, var9, arg8);
                class202.field2854.field7902 = var10;
            }
        }
        if (arg4 != 13) {
            field6184 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
    public static void method2535(int arg0) {
        if (arg0 != -1625504893) {
            method2535(-114);
        }
        field6184 = null;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Ljca;)V")
    public class421(class45 arg0) {
        super(arg0);
        this.field6187 = new class348(arg0);
        super.field2558 = new class84(super.field2518);
        super.field2527 = new class84(super.field2518);
        super.field2551 = new class84(super.field2518);
        super.field2525 = new class84(super.field2518);
        super.field2552 = new class84(super.field2518);
        super.field2544 = new class84(super.field2518);
        super.field2526 = new class84(super.field2518);
        super.field2570 = new class84(super.field2518);
        super.field2548 = new class84(super.field2518);
        super.field2567 = new class84(super.field2518);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIIIIB[Loh;)V")
    public static final void method2536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, class549[] arg9) {
        class159.field2378.method615(arg3, arg7, arg1, arg5);
        ++field6183;
        for (int var10 = 0; ~arg9.length < ~var10; ++var10) {
            class549 var12 = arg9[var10];
            if (var12 != null && (var12.field7637 == arg4 || arg4 == -1412584499 && class311.field4557 == var12)) {
                int var13;
                if (~arg6 != 0) {
                    var13 = arg6;
                } else {
                    class514.field7113[class562.field8052].setBounds(var12.field7631 - -arg0, var12.field7687 - -arg2, var12.field7678, var12.field7776);
                    var13 = class562.field8052++;
                }
                var12.field7640 = var13;
                var12.field7688 = class310.field4553;
                if (!client.method3529(var12)) {
                    if (~var12.field7662 != -1) {
                        class366.method2208(var12, 256);
                    }
                    int var14 = var12.field7631 + arg0;
                    int var15 = var12.field7687 + arg2;
                    int var16 = var12.field7704;
                    if (class640.field9285 && (client.method3530(var12).field7595 != 0 || var12.field7749 == 0) && var16 > 127) {
                        var16 = 127;
                    }
                    if (class311.field4557 == var12) {
                        if (~arg4 != 1412584498 && (class365.field5176 == var12.field7627 || class167.field2442 == var12.field7627)) {
                            class105.field1757 = arg0;
                            class606.field8629 = arg2;
                            class222.field3345 = arg9;
                            continue;
                        }
                        if (class412.field6107 && class604.field8590) {
                            int var17 = class619.field8735.method1614((byte) -46);
                            int var18 = class619.field8735.method1607((byte) -78);
                            int var19 = var18 - class216.field3271;
                            int var20 = var17 - class641.field9292;
                            if (var20 < class560.field7943) {
                                var20 = class560.field7943;
                            }
                            if (~(class560.field7943 + class179.field2601.field7678) > ~(var12.field7678 + var20)) {
                                var20 = class560.field7943 + class179.field2601.field7678 + -var12.field7678;
                            }
                            if (~class409.field6068 < ~var19) {
                                var19 = class409.field6068;
                            }
                            if (var12.field7776 + var19 > class409.field6068 + class179.field2601.field7776) {
                                var19 = class179.field2601.field7776 - var12.field7776 + class409.field6068;
                            }
                            var14 = var20;
                            var15 = var19;
                        }
                        if (class167.field2442 == var12.field7627) {
                            var16 = 128;
                        }
                    }
                    int var23;
                    int var24;
                    int var25;
                    int var26;
                    if (var12.field7749 != 2) {
                        int var21 = var12.field7678 + var14;
                        int var22 = var12.field7776 + var15;
                        var23 = arg7 < var15 ? var15 : arg7;
                        if (~var12.field7749 == -10) {
                            ++var22;
                            ++var21;
                        }
                        var24 = arg3 >= var14 ? arg3 : var14;
                        var25 = arg5 > var22 ? var22 : arg5;
                        var26 = ~arg1 < ~var21 ? var21 : arg1;
                    } else {
                        var26 = arg1;
                        var24 = arg3;
                        var23 = arg7;
                        var25 = arg5;
                    }
                    if (~var26 < ~var24 && var25 > var23) {
                        if (var12.field7662 != 0) {
                            if (~class57.field821 == ~var12.field7662 || ~class190.field2719 == ~var12.field7662) {
                                class392.method2377(~class190.field2719 == ~var12.field7662, -88, var15, var12.field7776, var14, var12.field7678);
                                class509.field7067[var13] = true;
                                class159.field2378.method615(arg3, arg7, arg1, arg5);
                                continue;
                            }
                            if (class308.field4441 == var12.field7662) {
                                if (var12.method3086(class159.field2378, 67) != null) {
                                    class547.method3064((byte) -67);
                                    class595.method3396((byte) -97, class159.field2378, var14, var15, var12);
                                    class301.field4347[var13] = true;
                                    class159.field2378.method615(arg3, arg7, arg1, arg5);
                                }
                                continue;
                            }
                            if (~class235.field3468 == ~var12.field7662) {
                                if (var12.method3086(class159.field2378, 56) != null) {
                                    class547.method3059(var14, true, var12, var15);
                                    class301.field4347[var13] = true;
                                    class159.field2378.method615(arg3, arg7, arg1, arg5);
                                }
                                continue;
                            }
                            if (class70.field1320 == var12.field7662) {
                                class214.method1455(var15, var14, class227.field3390, (byte) -38, class159.field2378, var12.field7776, var12.field7678);
                                class509.field7067[var13] = true;
                                class159.field2378.method615(arg3, arg7, arg1, arg5);
                                continue;
                            }
                            if (class244.field3526 == var12.field7662) {
                                class39.method341(var12.field7678, false, var14, class159.field2378, var12.field7776, var15);
                                class509.field7067[var13] = true;
                                class159.field2378.method615(arg3, arg7, arg1, arg5);
                                continue;
                            }
                            if (~class626.field8824 == ~var12.field7662) {
                                if (!class201.field2844 && !class44.field614) {
                                    continue;
                                }
                                int var27 = var14 - -var12.field7678;
                                int var28 = var15 - -15;
                                if (class201.field2844) {
                                    int var29 = -256;
                                    if (~class437.field6388 > -21) {
                                        var29 = -65536;
                                    }
                                    class409.field6077.method1632(var28, -105, var27, "Fps:" + class437.field6388, var29, -1);
                                    var28 += 15;
                                    Runtime var30 = Runtime.getRuntime();
                                    int var31 = (int) ((var30.totalMemory() + -var30.freeMemory()) / 1024L);
                                    int var32 = -256;
                                    if (~var31 < -65537) {
                                        if (class311.field4555) {
                                            class77.method730((byte) -121);
                                            for (int var33 = 0; var33 < 10; ++var33) {
                                                System.gc();
                                            }
                                            var31 = (int) ((var30.totalMemory() + -var30.freeMemory()) / 1024L);
                                            if (var31 > 65536) {
                                                class83.method758((byte) 125, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                        var32 = -65536;
                                    }
                                    class409.field6077.method1632(var28, -128, var27, "Mem:" + var31 + "k", var32, -1);
                                    var28 += 15;
                                    class409.field6077.method1632(var28, -101, var27, "In:" + class575.field8186 + "B/s Out:" + class47.field662 + "B/s", -256, -1);
                                    var28 += 15;
                                    int var34 = class159.field2378.method565() / 1024;
                                    class409.field6077.method1632(var28, -114, var27, "Offheap:" + var34 + "k", var34 <= 65536 ? -256 : -65536, -1);
                                    var28 += 15;
                                    int var35 = 0;
                                    int var36 = 0;
                                    int var37 = 0;
                                    for (int var38 = 0; var38 < 32; ++var38) {
                                        var35 += class509.field7069[var38].method2988(99);
                                        var36 += class509.field7069[var38].method2982(10437);
                                        var37 += class509.field7069[var38].method2992((byte) 29);
                                    }
                                    int var39 = var37 * 100 / var35;
                                    int var40 = var36 * 10000 / var35;
                                    String var41 = "Cache:" + class261.method1657(true, (long) var40, 2, 10, 0) + "% (" + var39 + "%)";
                                    class380.field5593.method1632(var28, -102, var27, var41, -256, -1);
                                    var28 += 12;
                                }
                                if (class150.field2268 > 0) {
                                    class380.field5593.method1632(var28, -118, var27, "Particles: " + class101.field1736 + " / " + class150.field2268, -256, -1);
                                }
                                var28 += 12;
                                if (class44.field614) {
                                    class380.field5593.method1632(var28, -117, var27, "Polys: " + class159.field2378.method120() + " Models: " + class159.field2378.method604(), -256, -1);
                                    var28 += 12;
                                    class380.field5593.method1632(var28, -127, var27, "Ls: " + class565.field8082 + " La: " + class537.field7496 + " NPC: " + class623.field8789 + " Pl: " + class266.field3887, -256, -1);
                                    var28 += 12;
                                    class294.method1851((byte) -13);
                                }
                                class509.field7067[var13] = true;
                                continue;
                            }
                        }
                        if (~var12.field7749 == -1) {
                            if (class188.field2708 == var12.field7662 && class159.field2378.method157()) {
                                class159.field2378.method99(var14, var15, var12.field7678, var12.field7776);
                            }
                            method2536(-var12.field7676 + var14, var26, -var12.field7643 + var15, var24, var12.field7734, var25, var13, var23, (byte) -32, arg9);
                            if (var12.field7684 != null) {
                                method2536(-var12.field7676 + var14, var26, -var12.field7643 + var15, var24, var12.field7734, var25, var13, var23, (byte) 123, var12.field7684);
                            }
                            class553 var42 = (class553) class639.field9274.method740(0, (long) var12.field7734);
                            if (var42 != null) {
                                class87.method792(var13, 10211, var26, var23, var15, var25, var42.field7827, var24, var14);
                            }
                            if (class188.field2708 == var12.field7662 && class159.field2378.method157()) {
                                class159.field2378.method83();
                                class57.field810 = true;
                            }
                            class159.field2378.method615(arg3, arg7, arg1, arg5);
                        }
                        if (class141.field2208[var13] || class525.field7288 > 1) {
                            if (var12.field7749 == 3) {
                                if (var16 != 0) {
                                    if (var12.field7641) {
                                        class159.field2378.method653(var14, var15, var12.field7678, var12.field7776, 16777215 & var12.field7775 | -(255 & var16) + 255 << 24, 1);
                                    } else {
                                        class159.field2378.method638(var14, var15, var12.field7678, var12.field7776, 16777215 & var12.field7775 | 255 - (var16 & 255) << 24, 1);
                                    }
                                } else if (!var12.field7641) {
                                    class159.field2378.method638(var14, var15, var12.field7678, var12.field7776, var12.field7775, 0);
                                } else {
                                    class159.field2378.method653(var14, var15, var12.field7678, var12.field7776, var12.field7775, 0);
                                }
                            } else if (~var12.field7749 == -5) {
                                class259 var43 = var12.method3077(class159.field2378, (byte) -115);
                                if (var43 == null) {
                                    if (class149.field2263) {
                                        class412.method2497(var12, 82);
                                    }
                                } else {
                                    int var44 = var12.field7775;
                                    String var45 = var12.field7718;
                                    if (~var12.field7703 != 0) {
                                        class381 var46 = class611.field8684.method1621((byte) -89, var12.field7703);
                                        var45 = var46.field5658;
                                        if (var45 == null) {
                                            var45 = "null";
                                        }
                                        if ((var46.field5662 == 1 || ~var12.field7740 != -2) && ~var12.field7740 != 0) {
                                            var45 = "<col=ff9040>" + var45 + "</col> x" + class246.method1562(0, var12.field7740);
                                        }
                                    }
                                    if (class559.field7930 == var12) {
                                        var45 = class440.field6420.method3220(false, class538.field7500);
                                        var44 = var12.field7775;
                                    }
                                    if (class488.field6875) {
                                        class159.field2378.method581(var14, var15, var12.field7678 + var14, var12.field7776 + var15);
                                    }
                                    var43.method1646(0, !var12.field7698 ? -1 : -(255 & var16) + 255 << 24, (byte) -71, var45, var12.field7650, (int[]) null, class25.field351, var12.field7681, var12.field7776, 0, var15, var14, var12.field7653, var12.field7644, var44 | -(var16 & 255) + 255 << 24, var12.field7678, (class593) null);
                                    if (class488.field6875) {
                                        class159.field2378.method615(arg3, arg7, arg1, arg5);
                                    }
                                }
                            } else if (var12.field7749 == 5) {
                                if (~var12.field7771 <= -1) {
                                    var12.method3090(class92.field1638, class316.field4615, 16049).method1500(var15, 0, class159.field2378, var14, false, var12.field7630 << 3, var12.field7678, var12.field7776, 0, var12.field7766 << 3);
                                } else {
                                    class116 var48;
                                    if (~var12.field7703 != 0) {
                                        class525 var47 = var12.field7651 ? class644.field9367.field5984 : null;
                                        var48 = class611.field8684.method1626((byte) -127, var12.field7740, var12.field7699 | -16777216, class159.field2378, var12.field7642, var12.field7787, var47, var12.field7703);
                                    } else {
                                        var48 = var12.method3089((byte) 71, class159.field2378);
                                    }
                                    if (var48 == null) {
                                        if (class149.field2263) {
                                            class412.method2497(var12, 82);
                                        }
                                    } else {
                                        int var49 = var48.method955();
                                        int var50 = var48.method960();
                                        int var51 = (var12.field7775 == 0 ? 16777215 : var12.field7775 & 16777215) | -(var16 & 255) + 255 << 24;
                                        if (!var12.field7686) {
                                            if (~var12.field7775 == -1 && var16 == 0) {
                                                if (~var12.field7785 == -1) {
                                                    if (var12.field7678 == var49 && var12.field7776 == var50) {
                                                        var48.method953(var14, var15);
                                                    } else {
                                                        var48.method959(var14, var15, var12.field7678, var12.field7776);
                                                    }
                                                } else {
                                                    var48.method965((float) var12.field7678 / 2.0F + (float) var14, (float) var12.field7776 / 2.0F + (float) var15, var12.field7678 * 4096 / var49, var12.field7785);
                                                }
                                            } else if (~var12.field7785 == -1) {
                                                if (var12.field7678 == var49 && var12.field7776 == var50) {
                                                    var48.method668(var14, var15, 0, var51, 1);
                                                } else {
                                                    var48.method664(var14, var15, var12.field7678, var12.field7776, 0, var51, 1);
                                                }
                                            } else {
                                                var48.method954((float) var12.field7678 / 2.0F + (float) var14, (float) var12.field7776 / 2.0F + (float) var15, var12.field7678 * 4096 / var49, var12.field7785, 0, var51, 1);
                                            }
                                        } else {
                                            class159.field2378.method581(var14, var15, var14 - -var12.field7678, var12.field7776 + var15);
                                            if (~var12.field7785 != -1) {
                                                int var52 = (-1 - -var49 + var12.field7678) / var49;
                                                int var53 = (var12.field7776 - -var50 + -1) / var50;
                                                for (int var54 = 0; var54 < var52; ++var54) {
                                                    for (int var55 = 0; var55 < var53; ++var55) {
                                                        if (~var12.field7775 != -1) {
                                                            var48.method954((float) var49 / 2.0F + (float) (var49 * var54 + var14), (float) var50 / 2.0F + (float) (var50 * var55 + var15), 4096, var12.field7785, 0, var51, 1);
                                                        } else {
                                                            var48.method965((float) var49 / 2.0F + (float) (var14 - -(var49 * var54)), (float) var50 / 2.0F + (float) (var50 * var55 + var15), 4096, var12.field7785);
                                                        }
                                                    }
                                                }
                                            } else if (~var12.field7775 == -1 && var16 == 0) {
                                                var48.method956(var14, var15, var12.field7678, var12.field7776);
                                            } else {
                                                var48.method961(var14, var15, var12.field7678, var12.field7776, 0, var51, 1);
                                            }
                                            class159.field2378.method615(arg3, arg7, arg1, arg5);
                                        }
                                    }
                                }
                            } else if (~var12.field7749 != -7) {
                                if (var12.field7749 == 9) {
                                    int var75;
                                    int var76;
                                    int var77;
                                    int var78;
                                    if (!var12.field7680) {
                                        var75 = var15;
                                        var76 = var14;
                                        var77 = var12.field7776 + var15;
                                        var78 = var14 - -var12.field7678;
                                    } else {
                                        var75 = var15 - -var12.field7776;
                                        var77 = var15;
                                        var78 = var14 - -var12.field7678;
                                        var76 = var14;
                                    }
                                    if (var12.field7722 != 1) {
                                        class159.field2378.method393(var76, var75, var78, var77, var12.field7775, var12.field7722, 0);
                                    } else {
                                        class159.field2378.method628(var76, var75, var78, var77, var12.field7775, 0);
                                    }
                                }
                            } else {
                                class277.method1786((byte) 103);
                                class519 var56 = null;
                                int var57 = 0;
                                if (var12.field7703 == -1) {
                                    if (var12.field7763 == 5) {
                                        int var58 = var12.field7649;
                                        if (~var58 <= -1 && var58 < 2048) {
                                            class400 var59 = class39.field536[var58];
                                            class439 var60 = var12.field7705 != -1 ? class49.field739.method2297((byte) 126, var12.field7705) : null;
                                            if (var59 != null && (class323.field4670 == var58 || ~class616.method3492(var59.field5958, (byte) 112) == ~var12.field7696)) {
                                                var56 = var59.field5984.method2961(class401.field6001, -1, (byte) 70, class468.field6744, true, class611.field8684, 0, class49.field739, (class527[]) null, class469.field6760, class204.field2882, var60, var12.field7632, (class439) null, var12.field7712, class159.field2378, var12.field7664, 0, 2048);
                                            }
                                        }
                                    } else if (~var12.field7763 != -9 && ~var12.field7763 != -10) {
                                        if (~var12.field7705 != 0) {
                                            class439 var61 = class49.field739.method2297((byte) 107, var12.field7705);
                                            var56 = var12.method3078(class611.field8684, class204.field2882, var12.field7664, class468.field6744, class401.field6001, class49.field739, class469.field6760, var12.field7712, class159.field2378, (byte) 95, 2048, var12.field7632, class644.field9367.field5984, var61);
                                            if (var56 == null && class149.field2263) {
                                                class412.method2497(var12, 85);
                                            }
                                        } else {
                                            var56 = var12.method3078(class611.field8684, class204.field2882, 0, class468.field6744, class401.field6001, class49.field739, class469.field6760, -1, class159.field2378, (byte) 99, 2048, -1, class644.field9367.field5984, (class439) null);
                                            if (var56 == null && class149.field2263) {
                                                class412.method2497(var12, 117);
                                            }
                                        }
                                    } else {
                                        class217 var62 = class132.method1024(var12.field7649, 0, false);
                                        class439 var63 = ~var12.field7705 != 0 ? class49.field739.method2297((byte) 111, var12.field7705) : null;
                                        if (var62 != null) {
                                            class525 var64 = var12.field7651 ? class644.field9367.field5984 : null;
                                            var56 = var62.method1464(var12.field7712, var12.field7632, (byte) -103, var12.field7664, var63, class159.field2378, 2048, ~var12.field7763 == -10, var64, var12.field7696);
                                        }
                                    }
                                } else {
                                    class381 var65 = class611.field8684.method1621((byte) -82, var12.field7703);
                                    if (var65 != null) {
                                        class381 var66 = var65.method2324(113, var12.field7740);
                                        class439 var67 = ~var12.field7705 == 0 ? null : class49.field739.method2297((byte) 124, var12.field7705);
                                        class525 var68 = !var12.field7651 ? null : class644.field9367.field5984;
                                        var56 = var66.method2311(var12.field7664, var12.field7632, 1, class159.field2378, 2048, var67, true, var68, var12.field7712);
                                        if (var56 == null) {
                                            class412.method2497(var12, 100);
                                        } else {
                                            var57 = -var56.method1390() >> 1;
                                        }
                                    }
                                }
                                if (var56 != null) {
                                    int var69;
                                    if (var12.field7669 <= 0) {
                                        var69 = 512;
                                    } else {
                                        var69 = (var12.field7678 << 9) / var12.field7669;
                                    }
                                    int var70;
                                    if (~var12.field7655 < -1) {
                                        var70 = (var12.field7776 << 9) / var12.field7655;
                                    } else {
                                        var70 = 512;
                                    }
                                    int var71 = (var12.field7701 * var69 >> 9) + (var14 - -(var12.field7678 / 2));
                                    int var72 = var12.field7776 / 2 + var15 - -(var12.field7638 * var70 >> 9);
                                    class81.field1444.method883();
                                    class159.field2378.method587(class81.field1444);
                                    class159.field2378.method519(var71, var72, var69, var70);
                                    class159.field2378.method517((float) (var12.field7711 << 0), var12.field7656 ? (float) (var12.field7719 << 0) : (float) (var12.field7719 << 0) * 1.5F);
                                    if (~arg4 == 1412584498 || class57.field810) {
                                        class159.field2378.method657();
                                        class159.field2378.method142();
                                        class159.field2378.method615(arg3, arg7, arg1, arg5);
                                        class57.field810 = false;
                                    }
                                    if (var12.field7659) {
                                        class159.field2378.method621(false);
                                    }
                                    int var73 = (var12.field7716 << 0) * class285.field4154[var12.field7781 << 3] >> 15;
                                    int var74 = (var12.field7716 << 0) * class285.field4152[var12.field7781 << 3] >> 15;
                                    class373.field5401.method876(-var12.field7744 << 3);
                                    class373.field5401.method882(var12.field7660 << 3);
                                    class373.field5401.method877(var12.field7792 << 0, (var12.field7758 << 0) + var73 + var57, (var12.field7758 << 0) + var74);
                                    class373.field5401.method887(var12.field7781 << 3);
                                    if (class488.field6875) {
                                        class159.field2378.method581(var14, var15, var12.field7678 + var14, var12.field7776 + var15);
                                    }
                                    if (var12.field7656) {
                                        var56.method1374(class373.field5401, (class315) null, var12.field7716 << 0, 1);
                                    } else {
                                        var56.method1379(class373.field5401, (class315) null, 1);
                                    }
                                    if (class488.field6875) {
                                        class159.field2378.method615(arg3, arg7, arg1, arg5);
                                    }
                                    if (var12.field7659) {
                                        class159.field2378.method621(true);
                                    }
                                    class159.field2378.method517(0.0F, 0.0F);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var11 = -25 / ((66 - arg8) / 50);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    public final void method1197(byte arg0) {
        ++field6188;
        if (arg0 <= -100) {
            this.field6187 = new class348((class45) super.field2518);
        }
    }
}
