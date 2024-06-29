import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class412 extends class476 {

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[I")
    public int[] field5866 = new int[1];

    @OriginalMember(owner = "client!of", name = "n", descriptor = "[I")
    public int[] field5865 = new int[] { -1 };

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lhi;")
    public static class45 field5860 = new class45(1, -1);

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lhi;")
    public static class45 field5870 = new class45(35, 4);

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Lhi;")
    public static class45 field5871 = new class45(75, 3);

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Lrb;")
    public static class283 field5873 = new class283(101, 7);

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Lro;")
    public static class126 field5862;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "Lml;")
    public static class27 field5875;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I[II[IZ)J", line = 6)
    private final long method2419(int arg0, int[] arg1, int arg2, int[] arg3, boolean arg4) {
        field5863++;
        long[] var6 = class403.field5763;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)];
        long var11 = var6[(int) (((long) arg2 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        if (arg0 != -28557) {
            return -11L;
        }
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3[var13] >> 24)) & 0xFFL)];
            long var19 = var6[(int) (((long) (arg3[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg3[var13] >> 8)) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg3[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg1[var14]) & 0xFFL)];
            }
        }
        return var6[(int) ((var11 ^ (long) (arg4 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V", line = 52)
    public static final void method2420(int arg0, int arg1, int arg2) {
        if (arg2 != -27626) {
            field5873 = null;
        }
        field5867++;
        if (class202.field2931 == 1) {
            class304.method1755((byte) 120, class366.field5256, arg0, arg1);
        } else if (class202.field2931 == 2) {
            class151.method1094(23053, arg1, arg0);
        }
        class366.field5256 = null;
        class202.field2931 = 0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZIB)Ljava/lang/String;", line = 78)
    public static final String method2421(int arg0, boolean arg1, int arg2, byte arg3) {
        field5869++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg2 >= 0) {
            int var4 = 2;
            if (arg3 != 56) {
                return null;
            }
            int var5 = arg2 / arg0;
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg0;
                int var9 = var8 - arg0 * arg2;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 129)
    public static final void method2422(int arg0) {
        class151.method1093(class294.field3967, 124);
        field5861++;
        class105.field1718++;
        if (class360.field5176 && class141.field2101) {
            if (arg0 >= -2) {
                method2422(-128);
            }
            int var1 = class113.field1820.method55((byte) -37);
            int var2 = class113.field1820.method62((byte) 93);
            int var3 = var2 - class399.field5728;
            int var4 = var1 - class108.field1755;
            if (var4 < class336.field4895) {
                var4 = class336.field4895;
            }
            if (var3 < class311.field4223) {
                var3 = class311.field4223;
            }
            if ((class336.field4895 + class250.field3411.field6470) < (class294.field3967.field6470 + var4)) {
                var4 = class336.field4895 - (class294.field3967.field6470 - class250.field3411.field6470);
            }
            if (class294.field3967.field6453 + var3 > class311.field4223 + class250.field3411.field6453) {
                var3 = class250.field3411.field6453 + class311.field4223 - class294.field3967.field6453;
            }
            int var5 = var4 + class250.field3411.field6443 - class336.field4895;
            int var6 = var3 + class250.field3411.field6451 - class311.field4223;
            if (class113.field1820.method60((byte) -78)) {
                if (class294.field3967.field6497 < class105.field1718) {
                    int var8 = var4 - class402.field5751;
                    int var9 = var3 - class172.field2601;
                    if (class294.field3967.field6455 < var8 || var8 < -class294.field3967.field6455 || var9 > class294.field3967.field6455 || (-class294.field3967.field6455) > var9) {
                        class75.field1058 = true;
                    }
                }
                if (class294.field3967.field6390 != null && class75.field1058) {
                    class414 var10 = new class414();
                    var10.field5900 = class294.field3967.field6390;
                    var10.field5896 = class294.field3967;
                    var10.field5898 = var6;
                    var10.field5897 = var5;
                    class47.method313(var10);
                }
            } else {
                if (class75.field1058) {
                    class319.method1893(126);
                    if (class294.field3967.field6543 != null) {
                        class414 var7 = new class414();
                        var7.field5896 = class294.field3967;
                        var7.field5899 = class151.field2332;
                        var7.field5897 = var5;
                        var7.field5900 = class294.field3967.field6543;
                        var7.field5898 = var6;
                        class47.method313(var7);
                    }
                    if (class151.field2332 != null && client.method3061(class294.field3967) != null) {
                        class329.method1941(class151.field2332, class294.field3967, 117);
                    }
                } else if ((class419.field6074 == 1 || class248.method1485((byte) 46)) && class527.field7690 > 2) {
                    method2420(class399.field5728 + class172.field2601, class402.field5751 + class108.field1755, -27626);
                } else if (class325.method1929(true)) {
                    method2420(class399.field5728 + class172.field2601, class402.field5751 + class108.field1755, -27626);
                }
                class294.field3967 = null;
            }
        } else if (class105.field1718 > 1) {
            class294.field3967 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII[Lat;ZIIII)V", line = 246)
    public static final void method2423(int arg0, int arg1, int arg2, int arg3, class444[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        class275.field3737.method511(arg8, arg6, arg7, arg9);
        field5864++;
        int var10 = 0;
        if (arg5) {
            return;
        }
        while (arg4.length > var10) {
            class444 var11 = arg4[var10];
            if (var11 != null && (var11.field6515 == arg0 || arg0 == -1412584499 && class294.field3967 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class428.field6209[class293.field3963].setBounds(var11.field6500 + arg1, var11.field6418 + arg2, var11.field6470, var11.field6453);
                    var12 = class293.field3963++;
                } else {
                    var12 = arg3;
                }
                var11.field6397 = var12;
                var11.field6482 = class28.field417;
                if (!client.method3054(var11)) {
                    label568: {
                        if (var11.field6384 != 0) {
                            class281.method1623(5, var11);
                        }
                        int var13 = var11.field6500 + arg1;
                        int var14 = var11.field6418 + arg2;
                        int var15 = var11.field6396;
                        if (class181.field2693 && (client.method3067(var11).field6217 != 0 || var11.field6477 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class294.field3967 == var11) {
                            if (arg0 != -1412584499 && (class39.field580 == var11.field6495 || class207.field2968 == var11.field6495)) {
                                class312.field4239 = arg1;
                                class331.field4509 = arg2;
                                class116.field1840 = arg4;
                                break label568;
                            }
                            if (class75.field1058 && class141.field2101) {
                                int var16 = class113.field1820.method55((byte) -37);
                                int var17 = class113.field1820.method62((byte) 85);
                                int var18 = var16 - class108.field1755;
                                int var19 = var17 - class399.field5728;
                                if (class336.field4895 > var18) {
                                    var18 = class336.field4895;
                                }
                                if (var11.field6470 + var18 > class336.field4895 + class250.field3411.field6470) {
                                    var18 = class336.field4895 + class250.field3411.field6470 - var11.field6470;
                                }
                                if (class311.field4223 > var19) {
                                    var19 = class311.field4223;
                                }
                                if (class311.field4223 + class250.field3411.field6453 < var11.field6453 + var19) {
                                    var19 = class311.field4223 + class250.field3411.field6453 - var11.field6453;
                                }
                                var13 = var18;
                                var14 = var19;
                            }
                            if (class207.field2968 == var11.field6495) {
                                var15 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field6477 == 2) {
                            var20 = arg9;
                            var21 = arg8;
                            var22 = arg6;
                            var23 = arg7;
                        } else {
                            int var24 = var13 + var11.field6470;
                            int var25 = var11.field6453 + var14;
                            var22 = var14 > arg6 ? var14 : arg6;
                            var21 = arg8 < var13 ? var13 : arg8;
                            if (var11.field6477 == 9) {
                                var24++;
                                var25++;
                            }
                            var23 = arg7 <= var24 ? arg7 : var24;
                            var20 = arg9 <= var25 ? arg9 : var25;
                        }
                        if (var23 > var21 && var22 < var20) {
                            label592: {
                                if (var11.field6384 != 0) {
                                    if (class454.field6634 == var11.field6384 || class282.field3835 == var11.field6384) {
                                        class433.method2569(var11.field6470, var13, var14, class282.field3835 == var11.field6384, (byte) 83, var11.field6453);
                                        class428.field6214[var12] = true;
                                        class275.field3737.method511(arg8, arg6, arg7, arg9);
                                        break label592;
                                    }
                                    if (class294.field3971 == var11.field6384) {
                                        if (var11.method2619(17042, class275.field3737) != null) {
                                            class287.method1649(841283500);
                                            class156.method1120(class275.field3737, (byte) 63, var14, var11, var13);
                                            class259.field3517[var12] = true;
                                            class275.field3737.method511(arg8, arg6, arg7, arg9);
                                        }
                                        break label592;
                                    }
                                    if (class72.field1028 == var11.field6384) {
                                        if (var11.method2619(17042, class275.field3737) != null) {
                                            class65.method427(var13, var14, 422, var11);
                                            class259.field3517[var12] = true;
                                            class275.field3737.method511(arg8, arg6, arg7, arg9);
                                        }
                                        break label592;
                                    }
                                    if (class434.field6294 == var11.field6384) {
                                        class327.method1937(var13, -101, var14, var11.field6470, var11.field6453, class275.field3737, class239.field3307);
                                        class428.field6214[var12] = true;
                                        class275.field3737.method511(arg8, arg6, arg7, arg9);
                                        break label592;
                                    }
                                    if (class23.field314 == var11.field6384) {
                                        class317.method1824(false, var11.field6470, var13, var14, var11.field6453, class275.field3737);
                                        class428.field6214[var12] = true;
                                        class275.field3737.method511(arg8, arg6, arg7, arg9);
                                        break label592;
                                    }
                                    if (class525.field7674 == var11.field6384) {
                                        if (!class407.field5770 && !class250.field3417) {
                                            break label592;
                                        }
                                        int var26 = var11.field6470 + var13;
                                        int var27 = var14 + 15;
                                        if (class407.field5770) {
                                            int var28 = -256;
                                            if (class244.field3350 < 20) {
                                                var28 = -65536;
                                            }
                                            class331.field4510.method1775((byte) -120, -1, "Fps:" + class244.field3350, var26, var27, var28);
                                            var27 += 15;
                                            Runtime var29 = Runtime.getRuntime();
                                            int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            int var31 = -256;
                                            if (var30 > 65536) {
                                                var31 = -65536;
                                            }
                                            class331.field4510.method1775((byte) 102, -1, "Mem:" + var30 + "k", var26, var27, var31);
                                            var27 += 15;
                                            class331.field4510.method1775((byte) 112, -1, "In:" + class506.field7405 + "B/s Out:" + class228.field3202 + "B/s", var26, var27, -256);
                                            var27 += 15;
                                            int var32 = class275.field3737.method473() / 1024;
                                            class331.field4510.method1775((byte) 83, -1, "Offheap:" + var32 + "k", var26, var27, var32 > 65536 ? -65536 : -256);
                                            var27 += 15;
                                            int var33 = 0;
                                            int var34 = 0;
                                            int var35 = 0;
                                            for (int var36 = 0; var36 < 30; var36++) {
                                                var33 += class285.field3865[var36].method2409(127);
                                                var34 += class285.field3865[var36].method2410(0);
                                                var35 += class285.field3865[var36].method2404(-31419);
                                            }
                                            int var37 = var35 * 100 / var33;
                                            int var38 = var34 * 10000 / var33;
                                            String var39 = "Cache:" + class443.method2613(0, true, true, 2, (long) var38) + "% (" + var37 + "%)";
                                            class347.field4988.method1775((byte) 97, -1, var39, var26, var27, -256);
                                            var27 += 12;
                                        }
                                        if (class197.field2894 > 0) {
                                            class347.field4988.method1775((byte) -116, -1, "Particles: " + class228.field3203 + " / " + class197.field2894, var26, var27, -256);
                                        }
                                        var27 += 12;
                                        if (class250.field3417) {
                                            class347.field4988.method1775((byte) -125, -1, "Polys: " + class275.field3737.method507() + " Models: " + class275.field3737.method470(), var26, var27, -256);
                                            var27 += 12;
                                            class347.field4988.method1775((byte) -115, -1, "Ls: " + class270.field3644 + " La: " + class522.field7650 + " NPC: " + class144.field2131 + " Pl: " + class121.field1880, var26, var27, -256);
                                            var27 += 12;
                                            class197.method1298(26575);
                                        }
                                        class428.field6214[var12] = true;
                                        break label592;
                                    }
                                }
                                if (var11.field6477 == 0) {
                                    if (class223.field3147 == var11.field6384 && class275.field3737.method549()) {
                                        class275.field3737.method474(var13, var14, var11.field6470, var11.field6453);
                                    }
                                    method2423(var11.field6469, var13 - var11.field6443, -var11.field6451 + var14, var12, arg4, arg5, var22, var23, var21, var20);
                                    if (var11.field6491 != null) {
                                        method2423(var11.field6469, var13 - var11.field6443, -var11.field6451 + var14, var12, var11.field6491, arg5, var22, var23, var21, var20);
                                    }
                                    class91 var40 = (class91) class425.field6168.method1592((byte) -25, (long) var11.field6469);
                                    if (var40 != null) {
                                        class259.method1539(var23, var20, 127, var40.field1460, var13, var12, var22, var14, var21);
                                    }
                                    if (class223.field3147 == var11.field6384 && class275.field3737.method549()) {
                                        class275.field3737.method485();
                                        class416.field6038 = true;
                                    }
                                    class275.field3737.method511(arg8, arg6, arg7, arg9);
                                }
                                if (class225.field3178[var12] || class482.field6960 > 1) {
                                    if (var11.field6477 == 3) {
                                        if (var15 == 0) {
                                            if (var11.field6440) {
                                                class275.field3737.method508(var13, var14, var11.field6470, var11.field6453, var11.field6480, 0);
                                            } else {
                                                class275.field3737.method527(var13, var14, var11.field6470, var11.field6453, var11.field6480, 0);
                                            }
                                        } else if (var11.field6440) {
                                            class275.field3737.method508(var13, var14, var11.field6470, var11.field6453, var11.field6480 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                        } else {
                                            class275.field3737.method527(var13, var14, var11.field6470, var11.field6453, 255 - (var15 & 0xFF) << 24 | var11.field6480 & 0xFFFFFF, 1);
                                        }
                                    } else if (var11.field6477 == 4) {
                                        class306 var41 = var11.method2629(-1951184432, class275.field3737);
                                        if (var41 != null) {
                                            int var42 = var11.field6480;
                                            String var43 = var11.field6527;
                                            if (var11.field6481 != -1) {
                                                class297 var44 = class534.field7872.method3089(var11.field6481, -24);
                                                var43 = var44.field4068;
                                                if (var43 == null) {
                                                    var43 = "null";
                                                }
                                                if ((var44.field4044 == 1 || var11.field6475 != 1) && var11.field6475 != -1) {
                                                    var43 = "<col=ff9040>" + var43 + "</col> x" + class248.method1481((byte) -91, var11.field6475);
                                                }
                                            }
                                            if (class389.field5616 == var11) {
                                                var43 = class148.field2271.method1126(class486.field6998, (byte) -19);
                                                var42 = var11.field6480;
                                            }
                                            if (class282.field3834) {
                                                class275.field3737.method515(var13, var14, var11.field6470 + var13, var11.field6453 + var14);
                                            }
                                            var41.method1762(0, class409.field5790, var43, var11.field6544 ? 255 - (var15 & 0xFF) << 24 : -1, -61, var11.field6419, null, 255 - (var15 & 0xFF) << 24 | var42, var13, var11.field6496, null, var11.field6453, var14, var11.field6431, var11.field6408, var11.field6470, 0);
                                            if (class282.field3834) {
                                                class275.field3737.method511(arg8, arg6, arg7, arg9);
                                            }
                                        } else if (class84.field1292) {
                                            class151.method1093(var11, 118);
                                        }
                                    } else if (var11.field6477 == 5) {
                                        if (var11.field6539 >= 0) {
                                            var11.method2615(class90.field1454, -101, class215.field3058).method844(var13, -4926, var14, var11.field6450 << 3, class275.field3737, var11.field6513 << 3, 0, var11.field6470, 0, var11.field6453);
                                        } else {
                                            class359 var46;
                                            if (var11.field6481 == -1) {
                                                var46 = var11.method2625(class275.field3737, -11557);
                                            } else {
                                                class291 var45 = var11.field6501 ? class81.field1158.field7015 : null;
                                                var46 = class534.field7872.method3084(class275.field3737, var45, (byte) -4, var11.field6466, var11.field6463, var11.field6475, var11.field6481, var11.field6400 | 0xFF000000);
                                            }
                                            if (var46 != null) {
                                                int var47 = var46.method204();
                                                int var48 = var46.method207();
                                                int var49 = 255 - (var15 & 0xFF) << 24 | (var11.field6480 == 0 ? 16777215 : var11.field6480 & 0xFFFFFF);
                                                if (var11.field6524) {
                                                    class275.field3737.method515(var13, var14, var11.field6470 + var13, var11.field6453 + var14);
                                                    if (var11.field6446 != 0) {
                                                        int var50 = (var47 + var11.field6470 - 1) / var47;
                                                        int var51 = (var11.field6453 + var48 - 1) / var48;
                                                        for (int var52 = 0; var52 < var50; var52++) {
                                                            for (int var53 = 0; var53 < var51; var53++) {
                                                                if (var11.field6480 == 0) {
                                                                    var46.method2146((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var48 * var53 + var14), 4096, var11.field6446);
                                                                } else {
                                                                    var46.method2143((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var48 * var53 + var14), 4096, var11.field6446, 0, var49, 1);
                                                                }
                                                            }
                                                        }
                                                    } else if (var11.field6480 == 0 && var15 == 0) {
                                                        var46.method2141(var13, var14, var11.field6470, var11.field6453);
                                                    } else {
                                                        var46.method211(var13, var14, var11.field6470, var11.field6453, 0, var49, 1);
                                                    }
                                                    class275.field3737.method511(arg8, arg6, arg7, arg9);
                                                } else if (var11.field6480 == 0 && var15 == 0) {
                                                    if (var11.field6446 != 0) {
                                                        var46.method2146((float) var11.field6470 / 2.0F + (float) var13, (float) var11.field6453 / 2.0F + (float) var14, var11.field6470 * 4096 / var47, var11.field6446);
                                                    } else if (var11.field6470 == var47 && var11.field6453 == var48) {
                                                        var46.method2142(var13, var14);
                                                    } else {
                                                        var46.method2140(var13, var14, var11.field6470, var11.field6453);
                                                    }
                                                } else if (var11.field6446 != 0) {
                                                    var46.method2143((float) var11.field6470 / 2.0F + (float) var13, (float) var11.field6453 / 2.0F + (float) var14, var11.field6470 * 4096 / var47, var11.field6446, 0, var49, 1);
                                                } else if (var11.field6470 == var47 && var11.field6453 == var48) {
                                                    var46.method215(var13, var14, 0, var49, 1);
                                                } else {
                                                    var46.method206(var13, var14, var11.field6470, var11.field6453, 0, var49, 1);
                                                }
                                            } else if (class84.field1292) {
                                                class151.method1093(var11, 113);
                                            }
                                        }
                                    } else if (var11.field6477 == 6) {
                                        class154.method1110(-65);
                                        class285 var54 = null;
                                        int var55 = 0;
                                        if (var11.field6481 != -1) {
                                            class297 var56 = class534.field7872.method3089(var11.field6481, -115);
                                            if (var56 != null) {
                                                class297 var57 = var56.method1735(false, var11.field6475);
                                                class55 var58 = var11.field6442 == -1 ? null : class50.field716.method831(var11.field6442, (byte) 54);
                                                class291 var59 = var11.field6501 ? class81.field1158.field7015 : null;
                                                var54 = var57.method1723(2048, var11.field6492, class275.field3737, var59, var11.field6484, var11.field6479, false, 1, var58);
                                                if (var54 == null) {
                                                    class151.method1093(var11, 124);
                                                } else {
                                                    var55 = -var54.method670() >> 1;
                                                }
                                            }
                                        } else if (var11.field6493 == 5) {
                                            int var60 = var11.field6486;
                                            if (var60 >= 0 && var60 < 2048) {
                                                class487 var61 = class45.field642[var60];
                                                class55 var62 = var11.field6442 == -1 ? null : class50.field716.method831(var11.field6442, (byte) 54);
                                                if (var61 != null && (class484.field6972 == var60 || class213.method1346(var61.field7036, 1573621477) == var11.field6414)) {
                                                    var54 = var61.field7015.method1688(class244.field3344, var11.field6492, 2048, -5, null, 0, var62, class309.field4200, null, var11.field6479, class438.field6318, class233.field3248, true, -1, 0, class50.field716, class275.field3737, class534.field7872, var11.field6484);
                                                }
                                            }
                                        } else if (var11.field6493 == 8 || var11.field6493 == 9) {
                                            class412 var64 = class379.method2261(3597, false, var11.field6486);
                                            class55 var65 = var11.field6442 == -1 ? null : class50.field716.method831(var11.field6442, (byte) 54);
                                            if (var64 != null) {
                                                class291 var66 = var11.field6501 ? class81.field1158.field7015 : null;
                                                var54 = var64.method2426(var65, var66, 2048, var11.field6484, var11.field6492, class275.field3737, var11.field6493 == 9, (byte) 99, var11.field6479, var11.field6414);
                                            }
                                        } else if (var11.field6442 == -1) {
                                            var54 = var11.method2628(class534.field7872, -1, 0, null, class81.field1158.field7015, class233.field3248, class50.field716, 2048, class244.field3344, -1, class438.field6318, -1, class275.field3737, class309.field4200);
                                            if (var54 == null && class84.field1292) {
                                                class151.method1093(var11, 109);
                                            }
                                        } else {
                                            class55 var63 = class50.field716.method831(var11.field6442, (byte) 54);
                                            var54 = var11.method2628(class534.field7872, -1, var11.field6492, var63, class81.field1158.field7015, class233.field3248, class50.field716, 2048, class244.field3344, var11.field6479, class438.field6318, var11.field6484, class275.field3737, class309.field4200);
                                            if (var54 == null && class84.field1292) {
                                                class151.method1093(var11, 113);
                                            }
                                        }
                                        if (var54 != null) {
                                            int var67;
                                            if (var11.field6411 <= 0) {
                                                var67 = 512;
                                            } else {
                                                var67 = (var11.field6470 << 9) / var11.field6411;
                                            }
                                            int var68;
                                            if (var11.field6423 <= 0) {
                                                var68 = 512;
                                            } else {
                                                var68 = (var11.field6453 << 9) / var11.field6423;
                                            }
                                            int var69 = var11.field6470 / 2 + (var11.field6498 * var67 >> 9) + var13;
                                            int var70 = var11.field6453 / 2 + (var11.field6499 * var68 >> 9) + var14;
                                            class14.field146.method954();
                                            class275.field3737.method548(class14.field146);
                                            class275.field3737.method471(var69, var70, var67, var68);
                                            class275.field3737.method462((float) (var11.field6537 << 0), var11.field6546 ? (float) (var11.field6542 << 0) : (float) (var11.field6542 << 0) * 1.5F);
                                            if (arg0 == -1412584499 || class416.field6038) {
                                                class275.field3737.method477();
                                                class275.field3737.method532();
                                                class275.field3737.method511(arg8, arg6, arg7, arg9);
                                                class416.field6038 = false;
                                            }
                                            if (var11.field6424) {
                                                class275.field3737.method528(false);
                                            }
                                            int var71 = (var11.field6526 << 0) * class51.field743[var11.field6538 << 3] >> 15;
                                            int var72 = (var11.field6526 << 0) * class51.field731[var11.field6538 << 3] >> 15;
                                            class374.field5384.method950(-var11.field6472 << 3);
                                            class374.field5384.method949(var11.field6490 << 3);
                                            class374.field5384.method948(var11.field6447 << 0, (var11.field6420 << 0) + var71 + var55, var72 - -(var11.field6420 << 0));
                                            class374.field5384.method940(var11.field6538 << 3);
                                            if (class282.field3834) {
                                                class275.field3737.method515(var13, var14, var11.field6470 + var13, var14 - -var11.field6453);
                                            }
                                            if (var11.field6546) {
                                                var54.method666(class374.field5384, null, var11.field6526 << 0, 1);
                                            } else {
                                                var54.method701(class374.field5384, null, 1);
                                            }
                                            if (class282.field3834) {
                                                class275.field3737.method511(arg8, arg6, arg7, arg9);
                                            }
                                            if (var11.field6424) {
                                                class275.field3737.method528(true);
                                            }
                                            class275.field3737.method462(0.0F, 0.0F);
                                        }
                                    } else if (var11.field6477 == 9) {
                                        int var73;
                                        int var74;
                                        int var75;
                                        int var76;
                                        if (var11.field6429) {
                                            var73 = var14;
                                            var74 = var11.field6453 + var14;
                                            var75 = var11.field6470 + var13;
                                            var76 = var13;
                                        } else {
                                            var76 = var13;
                                            var74 = var14;
                                            var75 = var11.field6470 + var13;
                                            var73 = var14 + var11.field6453;
                                        }
                                        if (var11.field6454 == 1) {
                                            class275.field3737.method552(var76, var74, var75, var73, var11.field6480, 0);
                                        } else {
                                            class275.field3737.method509(var76, var74, var75, var73, var11.field6480, var11.field6454, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V", line = 907)
    public static void method2424(byte arg0) {
        field5873 = null;
        field5860 = null;
        field5875 = null;
        field5870 = null;
        field5862 = null;
        field5871 = null;
        if (arg0 >= -66) {
            field5870 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(III)Z", line = 922)
    public static final boolean method2425(int arg0, int arg1, int arg2) {
        field5872++;
        if (arg1 > -100) {
            field5875 = null;
        }
        return class4.method28(arg2, -20179, arg0) | (arg2 & 0x40000) != 0 || class391.method2317(true, arg2, arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljp;Lur;IIILza;ZBII)Le;", line = 936)
    private final class285 method2426(class55 arg0, class291 arg1, int arg2, int arg3, int arg4, class295 arg5, boolean arg6, byte arg7, int arg8, int arg9) {
        field5868++;
        class285 var11 = null;
        int var12 = arg2;
        class495 var13 = null;
        if (arg9 != -1) {
            var13 = class438.field6318.method2058(-66, arg9);
        }
        int[] var14 = this.field5865;
        if (var13 != null && var13.field7168 != null) {
            var14 = new int[var13.field7168.length];
            for (int var15 = 0; var15 < var13.field7168.length; var15++) {
                int var16 = var13.field7168[var15];
                if (var16 >= 0 && this.field5865.length > var16) {
                    var14[var15] = this.field5865[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        if (arg7 <= 31) {
            field5873 = null;
        }
        int var22 = -1;
        int var23 = 0;
        class420 var24 = null;
        class420 var25 = null;
        if (arg0 != null) {
            int var26 = arg0.field796[arg3];
            var12 = arg2 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class50.field716.method827(var27, (byte) -125);
            if (var24 != null) {
                var18 |= var24.method2484(var21, -525275000);
                var17 |= var24.method2481(var21, -9);
                var20 |= var24.method2485((byte) 115, var21);
                var19 |= arg0.field794;
            }
            if ((arg0.field798 || class434.field6286) && arg8 != -1 && arg0.field796.length > arg8) {
                var23 = arg0.field788[arg3];
                int var28 = arg0.field796[arg8];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class50.field716.method827(var22 >>> 16, (byte) -124);
                }
                if (var25 != null) {
                    var18 |= var25.method2484(var22, -525275000);
                    var17 |= var25.method2481(var22, -128);
                    var20 |= var25.method2485((byte) -56, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method2419(-28557, arg1 == null ? null : arg1.field3943, arg9, var14, arg6);
        if (class125.field1920 != null) {
            var11 = (class285) class125.field1920.method2767(var30, 0);
        }
        if (var11 == null || arg5.method459(var11.method671(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method525(var12, var11.method671());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class534.field7872.method3089(var14[var34], 113).method1737(arg6, true)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class496[] var35 = new class496[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class534.field7872.method3089(var14[var36], 113).method1725(-63, arg6);
                }
            }
            if (var13 != null && var13.field7197 != null) {
                for (int var37 = 0; var37 < var13.field7197.length; var37++) {
                    if (var13.field7197[var37] != null && var35[var37] != null) {
                        int var38 = var13.field7197[var37][0];
                        int var39 = var13.field7197[var37][1];
                        int var40 = var13.field7197[var37][2];
                        int var41 = var13.field7197[var37][3];
                        int var42 = var13.field7197[var37][4];
                        int var43 = var13.field7197[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method2947(var41, (byte) -69, var43, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method2940(var38, var40, var39, -3009);
                        }
                    }
                }
            }
            if (arg1 != null) {
                var32 = var12 | 0x4000;
            }
            class496 var44 = new class496(var35, var35.length);
            var11 = arg5.method501(var44, var32, class70.field1018, 64, 850);
            if (arg1 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class74.field1050[var45].length > arg1.field3943[var45]) {
                        var11.method667(class176.field2651[var45], class74.field1050[var45][arg1.field3943[var45]]);
                    }
                    if (arg1.field3943[var45] < class4.field68[var45].length) {
                        var11.method667(class533.field7846[var45], class4.field68[var45][arg1.field3943[var45]]);
                    }
                }
            }
            if (class125.field1920 != null) {
                var11.method711(var12);
                class125.field1920.method2777(-1025, var11, var30);
            }
        }
        if (arg0 == null || var24 == null) {
            return var11;
        } else {
            class285 var46 = var11.method697((byte) 1, var12, true);
            var46.method1641(var25, arg4 - 1, var22, 0, var24, (byte) 112, var23, var21, arg0.field794);
            return var46;
        }
    }
}
