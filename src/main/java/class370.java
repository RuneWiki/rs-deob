import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class370 {

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    private int field5579;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "[Lbk;")
    private class90[] field5564;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Lsh;")
    public static class472 field5571 = new class472(50, 10);

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Lct;")
    public static class285 field5573 = new class285(28, 3);

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field5576 = 0;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lsl;")
    public static class422 field5577 = new class422("", 12);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "J")
    private long field5569;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lbk;")
    private class90 field5567;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "[I")
    public static int[] field5578;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lbk;")
    public final class90 method2287(int arg0) {
        field5566++;
        if (this.field5567 == null) {
            return null;
        }
        class90 var2 = this.field5564[(int) ((long) (this.field5579 - 1) & this.field5569)];
        if (arg0 <= 116) {
            this.method2291(-35L, true, (class90) null);
        }
        while (this.field5567 != var2) {
            if (this.field5567.field1255 == this.field5569) {
                class90 var3 = this.field5567;
                this.field5567 = this.field5567.field1253;
                return var3;
            }
            this.field5567 = this.field5567.field1253;
        }
        this.field5567 = null;
        return null;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static final void method2288(int arg0) {
        class488.field6847 = arg0;
        class106.field1483 = -1;
        class37.field492 = -1;
        field5575++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)Lbk;")
    public final class90 method2289(int arg0, long arg1) {
        field5572++;
        this.field5569 = arg1;
        class90 var4 = this.field5564[(int) (arg1 & (long) (this.field5579 - 1))];
        for (this.field5567 = var4.field1253; this.field5567 != var4; this.field5567 = this.field5567.field1253) {
            if (this.field5567.field1255 == arg1) {
                class90 var5 = this.field5567;
                this.field5567 = this.field5567.field1253;
                return var5;
            }
        }
        this.field5567 = null;
        return arg0 == 0 ? null : null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)V")
    public static final void method2290(int arg0, byte arg1) {
        field5565++;
        class186 var2 = class275.method1789(arg0, (byte) 123, 3);
        var2.method1279((byte) -65);
        if (arg1 != 9) {
            field5571 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(JZLbk;)V")
    public final void method2291(long arg0, boolean arg1, class90 arg2) {
        field5574++;
        if (arg2.field1252 != null) {
            arg2.method701(-13);
        }
        class90 var5 = this.field5564[(int) ((long) (this.field5579 - 1) & arg0)];
        arg2.field1252 = var5.field1252;
        arg2.field1253 = var5;
        arg2.field1252.field1253 = arg2;
        if (arg1) {
            field5576 = -105;
        }
        arg2.field1253.field1252 = arg2;
        arg2.field1255 = arg0;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
    public static final void method2292(int arg0) {
        if (class147.field2072 > 0) {
            class147.field2072--;
        }
        field5568++;
        if (class32.field422 > 1) {
            class32.field422--;
            class273.field4162 = class12.field169;
        }
        if (class143.field2039) {
            class143.field2039 = false;
            class4.method31((byte) 114);
            return;
        }
        if (!class166.field2335) {
            class281.method1809(true);
        }
        for (int var1 = 0; var1 < 100 && class204.method1391(-6115); var1++) {
        }
        if (class316.field4752 != 30) {
            return;
        }
        class119.method848(class48.field689.method1821(true), class230.field3390, (byte) 54);
        if (class3.field64 == null) {
            if (class435.method2539(-10659) >= class51.field741) {
                class3.field64 = class279.field4229.method605(class150.field2110, 16236);
            }
        } else if (class3.field64.field5096 != -1) {
            class378.method2320(class88.field1238, (byte) 119);
            class230.field3390.method2592(class3.field64.field5096, (byte) -114);
            class3.field64 = null;
            class51.field741 = class435.method2539(-10659) + 30000L;
        }
        if (class260.field3872 != null || class186.field2821 < (class435.method2539(-10659) - 2000L)) {
            boolean var2 = false;
            int var3 = class230.field3390.field6315;
            for (class131 var4 = (class131) class269.field3973.method2456(32101); var4 != null && class230.field3390.field6315 - var3 < 240; var4 = (class131) class269.field3973.method2461(301)) {
                var4.method283(2);
                int var5 = var4.method907(-52);
                if (var5 < 0) {
                    var5 = 0;
                } else if (var5 > 65534) {
                    var5 = 65534;
                }
                int var6 = var4.method912(-14721);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                boolean var7 = false;
                if (var4.method907(-68) == -1 && var4.method912(-14721) == -1) {
                    var7 = true;
                    var5 = -1;
                    var6 = -1;
                }
                if (class64.field882 != var6 || class128.field1778 != var5) {
                    if (!var2) {
                        class465.field6551++;
                        class378.method2320(class115.field1606, (byte) 119);
                        class230.field3390.method2619((byte) 18, 0);
                        var2 = true;
                        var3 = class230.field3390.field6315;
                    }
                    int var8 = var6 - class64.field882;
                    class64.field882 = var6;
                    int var9 = var5 - class128.field1778;
                    class128.field1778 = var5;
                    int var10 = (int) ((var4.method910(11195) - class186.field2821) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var9 += 32;
                        var8 += 32;
                        class230.field3390.method2592((var10 << 12) + (var8 << 6) + var9, (byte) -126);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        var9 += 128;
                        class230.field3390.method2619((byte) -127, var10 + 128);
                        var8 += 128;
                        class230.field3390.method2592((var8 << 8) + var9, (byte) -123);
                    } else if (var10 >= 32) {
                        class230.field3390.method2592(var10 + 57344, (byte) -126);
                        if (var7) {
                            class230.field3390.method2596((byte) -100, Integer.MIN_VALUE);
                        } else {
                            class230.field3390.method2596((byte) -43, var6 | var5 << 16);
                        }
                    } else {
                        class230.field3390.method2619((byte) -27, var10 + 192);
                        if (var7) {
                            class230.field3390.method2596((byte) -30, Integer.MIN_VALUE);
                        } else {
                            class230.field3390.method2596((byte) -78, var5 << 16 | var6);
                        }
                    }
                    class186.field2821 = var4.method910(11195);
                }
            }
            if (var2) {
                class230.field3390.method2603(class230.field3390.field6315 - var3, -24420);
            }
        }
        if (class260.field3872 != null) {
            long var11 = (class260.field3872.method910(11195) - class275.field4184) / 50L;
            class275.field4184 = class260.field3872.method910(11195);
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            int var13 = class260.field3872.method907(-65);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = class260.field3872.method912(-14721);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (class260.field3872.method911((byte) 64) == 2) {
                var15 = 1;
            }
            int var16 = (int) var11;
            class487.field6838++;
            class378.method2320(class281.field4242, (byte) 119);
            class230.field3390.method2624((byte) -3, var16 | var15 << 15);
            class230.field3390.method2627(var14 | var13 << 16, true);
        }
        if (class336.field5032 > 0) {
            int var17 = 0;
            for (int var18 = 0; var18 < class336.field5032; var18++) {
                if (class164.field2281[var18].method897(73)) {
                    var17++;
                }
            }
            if (var17 > 0) {
                class394.field5803++;
                class378.method2320(class346.field5285, (byte) 119);
                if (var17 > 75) {
                    var17 = 75;
                }
                class230.field3390.method2619((byte) 84, var17 * 3);
                for (int var19 = 0; var19 < class336.field5032; var19++) {
                    class293 var20 = class164.field2281[var19];
                    if (var20.method897(-116)) {
                        long var21 = (var20.method893((byte) 75) - class188.field2873) / 50L;
                        class188.field2873 = var20.method893((byte) 75);
                        if (var21 > 65535L) {
                            var21 = 65535L;
                        }
                        class230.field3390.method2619((byte) -119, var20.method892(-1));
                        class230.field3390.method2592((int) var21, (byte) -114);
                    }
                }
            }
        }
        if (class468.field6586 > 0) {
            class468.field6586--;
        }
        if (class380.field5645 && class468.field6586 <= 0) {
            class115.field1598++;
            class468.field6586 = 20;
            class380.field5645 = false;
            class378.method2320(class235.field3429, (byte) 119);
            class230.field3390.method2593(-63, (int) class412.field5953 >> 3);
            class230.field3390.method2592((int) class384.field5682 >> 3, (byte) -97);
        }
        if (class78.field1104 && !class115.field1597) {
            class75.field1054++;
            class115.field1597 = true;
            class378.method2320(class357.field5424, (byte) 119);
            class230.field3390.method2619((byte) -123, 1);
        }
        if (!class78.field1104 && class115.field1597) {
            class75.field1054++;
            class115.field1597 = false;
            class378.method2320(class357.field5424, (byte) 119);
            class230.field3390.method2619((byte) -120, 0);
        }
        if (!class332.field4975) {
            class388.field5715++;
            class378.method2320(class170.field2416, (byte) 119);
            class230.field3390.method2619((byte) 39, 0);
            int var23 = class230.field3390.field6315;
            class446 var24 = class337.field5038.method2210(1);
            class230.field3390.method2606(0, var24.field6315, var24.field6316, (byte) 0);
            class230.field3390.method2603(class230.field3390.field6315 - var23, -24420);
            class332.field4975 = true;
        }
        if (class170.field2427 != null) {
            if (class469.field6596 == 2) {
                class363.method2234(0);
            } else if (class469.field6596 == 3) {
                class287.method1834(0);
            }
        }
        if (class46.field664) {
            class46.field664 = false;
        } else {
            class83.field1182 /= 2.0F;
        }
        if (class170.field2422) {
            class170.field2422 = false;
        } else {
            class266.field3955 /= 2.0F;
        }
        class373.method2310(121);
        if (class316.field4752 != 30) {
            return;
        }
        class53.method384(22717);
        class324.method1996(1);
        class357.method2199(123);
        class439.method2552(104);
        class352.field5365++;
        if (class352.field5365 > 750) {
            class4.method31((byte) 90);
            return;
        }
        class82.method674((byte) -127);
        class473.method2757(-82);
        class297.method1859((byte) 121);
        for (int var25 = class315.field4736.method16(true, 88); var25 != -1; var25 = class315.field4736.method16(false, 125)) {
            class321.method1973(var25, (byte) 25);
            class255.field3788[class412.method2463(class161.field2228++, 31)] = var25;
        }
        for (class186 var26 = class432.method2532(1); var26 != null; var26 = class432.method2532(1)) {
            int var27 = var26.method1283(false);
            int var28 = var26.method1280(30471);
            if (var27 == 1) {
                class156.field2170[var28] = var26.field2829;
                class95.field1349 |= class12.field158[var28];
                class85.field1222[class412.method2463(class453.field6443++, 31)] = var28;
            } else if (var27 == 2) {
                class315.field4740[var28] = var26.field2825;
                class351.field5351[class412.method2463(class469.field6608++, 31)] = var28;
            } else if (var27 == 3) {
                class178 var29 = class493.method2885(var28, 65535);
                if (!var26.field2825.equals(var29.field2629)) {
                    var29.field2629 = var26.field2825;
                    class205.method1396(90, var29);
                }
            } else if (var27 == 4) {
                class178 var47 = class493.method2885(var28, 65535);
                int var48 = var26.field2829;
                int var49 = var26.field2819;
                int var50 = var26.field2813;
                if (var47.field2584 != var48 || var47.field2572 != var49 || var47.field2564 != var50) {
                    var47.field2584 = var48;
                    var47.field2564 = var50;
                    var47.field2572 = var49;
                    class205.method1396(83, var47);
                }
            } else if (var27 == 5) {
                class178 var30 = class493.method2885(var28, 65535);
                if (var26.field2829 != var30.field2616 || var26.field2829 == -1) {
                    var30.field2535 = 0;
                    var30.field2616 = var26.field2829;
                    var30.field2563 = 1;
                    var30.field2568 = 0;
                    class205.method1396(125, var30);
                }
            } else if (var27 == 6) {
                int var41 = var26.field2829;
                int var42 = (var41 & 0x7CC2) >> 10;
                int var43 = var41 >> 5 & 0x1F;
                int var44 = var41 & 0x1F;
                int var45 = (var44 << 3) + (var42 << 19) + (var43 << 11);
                class178 var46 = class493.method2885(var28, 65535);
                if (var46.field2625 != var45) {
                    var46.field2625 = var45;
                    class205.method1396(92, var46);
                }
            } else if (var27 == 7) {
                class178 var31 = class493.method2885(var28, 65535);
                boolean var32 = var26.field2829 == 1;
                if (var32 != var31.field2539) {
                    var31.field2539 = var32;
                    class205.method1396(95, var31);
                }
            } else if (var27 == 8) {
                class178 var33 = class493.method2885(var28, 65535);
                if (var26.field2829 != var33.field2516 || var26.field2819 != var33.field2656 || var26.field2813 != var33.field2583) {
                    var33.field2516 = var26.field2829;
                    var33.field2656 = var26.field2819;
                    var33.field2583 = var26.field2813;
                    if (var33.field2605 != -1) {
                        if (var33.field2598 > 0) {
                            var33.field2583 = var33.field2583 * 32 / var33.field2598;
                        } else if (var33.field2641 > 0) {
                            var33.field2583 = var33.field2583 * 32 / var33.field2641;
                        }
                    }
                    class205.method1396(127, var33);
                }
            } else if (var27 == 9) {
                class178 var40 = class493.method2885(var28, 65535);
                if (var26.field2829 != var40.field2605 || var26.field2819 != var40.field2652) {
                    var40.field2605 = var26.field2829;
                    var40.field2652 = var26.field2819;
                    class205.method1396(125, var40);
                }
            } else if (var27 == 10) {
                class178 var39 = class493.method2885(var28, 65535);
                if (var26.field2829 != var39.field2651 || var26.field2819 != var39.field2515 || var26.field2813 != var39.field2667) {
                    var39.field2651 = var26.field2829;
                    var39.field2515 = var26.field2819;
                    var39.field2667 = var26.field2813;
                    class205.method1396(77, var39);
                }
            } else if (var27 == 11) {
                class178 var34 = class493.method2885(var28, 65535);
                var34.field2648 = var34.field2615 = var26.field2819;
                var34.field2581 = 0;
                var34.field2579 = 0;
                var34.field2593 = var34.field2518 = var26.field2829;
                class205.method1396(124, var34);
            } else if (var27 == 12) {
                class178 var35 = class493.method2885(var28, 65535);
                int var36 = var26.field2829;
                if (var35 != null && var35.field2655 == 0) {
                    if (var36 > var35.field2601 - var35.field2589) {
                        var36 = var35.field2601 - var35.field2589;
                    }
                    if (var36 < 0) {
                        var36 = 0;
                    }
                    if (var35.field2620 != var36) {
                        var35.field2620 = var36;
                        class205.method1396(80, var35);
                    }
                }
            } else if (var27 == 14) {
                class178 var37 = class493.method2885(var28, 65535);
                var37.field2559 = var26.field2829;
            } else if (var27 == 15) {
                class105.field1482 = true;
                class106.field1483 = var26.field2819;
                class37.field492 = var26.field2829;
            } else if (var27 == 16) {
                class178 var38 = class493.method2885(var28, 65535);
                var38.field2643 = var26.field2829;
            }
        }
        class269.field3987++;
        if (class27.field357 != 0) {
            class432.field6142 += 20;
            if (class432.field6142 >= 400) {
                class27.field357 = 0;
            }
        }
        if (class315.field4735 != null) {
            class19.field253++;
            if (class19.field253 >= 15) {
                class205.method1396(107, class315.field4735);
                class315.field4735 = null;
            }
        }
        class310.field4692 = false;
        class330.field4954 = null;
        class360.field5458 = false;
        class349.field5313 = null;
        class142.method979(-1, -1, (class178) null, -1);
        class408.method2440((byte) 72, -1, (class178) null, -1);
        class20.method189(-6260);
        class12.field169++;
        if (class180.field2681) {
            class378.method2320(class466.field6565, (byte) 119);
            class443.field6256++;
            class230.field3390.method2627(class275.field4191 << 14 | class452.field6415 << 28 | class21.field260, true);
            class180.field2681 = false;
        }
        while (true) {
            class415 var51;
            class178 var52;
            class178 var53;
            do {
                var51 = (class415) class36.field471.method2457((byte) 75);
                if (var51 == null) {
                    while (true) {
                        class415 var54;
                        class178 var55;
                        class178 var56;
                        do {
                            var54 = (class415) class466.field6560.method2457((byte) 75);
                            if (var54 == null) {
                                while (true) {
                                    class415 var57;
                                    class178 var58;
                                    class178 var59;
                                    do {
                                        var57 = (class415) class352.field5362.method2457((byte) 75);
                                        if (var57 == null) {
                                            if (class330.field4954 == null) {
                                                class346.field5284 = 0;
                                            }
                                            if (class100.field1419 != null) {
                                                class310.method1927(24600);
                                            }
                                            if (class465.field6556 > 0 && class296.field4445.method1100(false, 82) && class296.field4445.method1100(false, 81) && class340.field5095 != 0) {
                                                int var60 = class472.field6622.field4545 - class340.field5095;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class422.method2491(class68.field922 + class472.field6622.field4675[0], var60, class472.field6622.field4674[0] + class468.field6588, 0);
                                            }
                                            class87.method692((byte) -58);
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class462.field6510[var61]++;
                                            }
                                            if (class95.field1349 && (class435.method2539(-10659) - 60000L) > class198.field2990) {
                                                class92.method715(false);
                                            }
                                            class336.field5033++;
                                            int var62 = 20 % ((arg0 + 57) / 62);
                                            if (class336.field5033 > 500) {
                                                class336.field5033 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x2) == 2) {
                                                    class324.field4869 += class36.field470;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class423.field6058 += class140.field2005;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class465.field6555 += class51.field743;
                                                }
                                            }
                                            if (class423.field6058 < -50) {
                                                class140.field2005 = 2;
                                            }
                                            if (class324.field4869 < -55) {
                                                class36.field470 = 2;
                                            }
                                            if (class423.field6058 > 50) {
                                                class140.field2005 = -2;
                                            }
                                            if (class465.field6555 < -40) {
                                                class51.field743 = 1;
                                            }
                                            if (class324.field4869 > 55) {
                                                class36.field470 = -2;
                                            }
                                            if (class465.field6555 > 40) {
                                                class51.field743 = -1;
                                            }
                                            class163.field2266++;
                                            if (class163.field2266 > 500) {
                                                class163.field2266 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class347.field5291 += class426.field6092;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class358.field5437 += class479.field6739;
                                                }
                                            }
                                            if (class347.field5291 < -60) {
                                                class426.field6092 = 2;
                                            }
                                            if (class358.field5437 < -20) {
                                                class479.field6739 = 1;
                                            }
                                            if (class347.field5291 > 60) {
                                                class426.field6092 = -2;
                                            }
                                            if (class358.field5437 > 10) {
                                                class479.field6739 = -1;
                                            }
                                            class90.field1257++;
                                            if (class90.field1257 > 50) {
                                                class210.field3155++;
                                                class378.method2320(class334.field4986, (byte) 119);
                                            }
                                            if (class290.field4405) {
                                                class21.method192(3);
                                                class290.field4405 = false;
                                            }
                                            try {
                                                if (class27.field335 != null && class230.field3390.field6315 > 0) {
                                                    class269.field3985 += class230.field3390.field6315;
                                                    class27.field335.method1000(30000, 0, class230.field3390.field6315, class230.field3390.field6316);
                                                    class90.field1257 = 0;
                                                    class230.field3390.field6315 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class4.method31((byte) 96);
                                                return;
                                            }
                                        }
                                        var58 = var57.field5990;
                                        if (var58.field2534 < 0) {
                                            break;
                                        }
                                        var59 = class493.method2885(var58.field2580, 65535);
                                    } while (var59 == null || var59.field2548 == null || var58.field2534 >= var59.field2548.length || var59.field2548[var58.field2534] != var58);
                                    class477.method2797(var57);
                                }
                            }
                            var55 = var54.field5990;
                            if (var55.field2534 < 0) {
                                break;
                            }
                            var56 = class493.method2885(var55.field2580, 65535);
                        } while (var56 == null || var56.field2548 == null || var55.field2534 >= var56.field2548.length || var56.field2548[var55.field2534] != var55);
                        class477.method2797(var54);
                    }
                }
                var52 = var51.field5990;
                if (var52.field2534 < 0) {
                    break;
                }
                var53 = class493.method2885(var52.field2580, 65535);
            } while (var53 == null || var53.field2548 == null || var52.field2534 >= var53.field2548.length || var53.field2548[var52.field2534] != var52);
            class477.method2797(var51);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILil;IIII)V")
    public static final void method2293(int arg0, class43 arg1, int arg2, int arg3, int arg4, int arg5) {
        field5570++;
        if (arg1.field589 == -1 && arg1.field597 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class337.field5038.field3934 * arg1.field592 >> 8;
        if (arg1.field594 < arg3) {
            var6 += arg3 - arg1.field594;
        } else if (arg3 < arg1.field583) {
            var6 += arg1.field583 - arg3;
        }
        if (arg1.field577 < arg5) {
            var6 += arg5 - arg1.field577;
        } else if (arg5 < arg1.field585) {
            var6 += arg1.field585 - arg5;
        }
        if (arg1.field574 == 0 || var6 - 64 > arg1.field574 || class337.field5038.field3934 == 0 || arg1.field575 != arg0) {
            if (arg1.field580 != null) {
                class452.field6419.method2415(arg1.field580);
                arg1.field580 = null;
            }
            if (arg1.field584 != null) {
                class452.field6419.method2415(arg1.field584);
                arg1.field584 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field574 - var6) * var7 / arg1.field574;
        if (arg4 != 8048) {
            return;
        }
        if (arg1.field580 != null) {
            arg1.field580.method73(var8);
        } else if (arg1.field589 >= 0) {
            class54 var9 = class54.method388(class163.field2261, arg1.field589, 0);
            if (var9 != null) {
                class328 var10 = var9.method390().method2015(class424.field6071);
                class7 var11 = class7.method77(var10, 100, var8);
                var11.method59(-1);
                class452.field6419.method2418(var11);
                arg1.field580 = var11;
            }
        }
        if (arg1.field584 != null) {
            arg1.field584.method73(var8);
            if (arg1.field584.method282(77)) {
                return;
            }
            arg1.field584 = null;
        } else if (arg1.field597 != null && (arg1.field587 -= arg2) <= 0) {
            int var12 = (int) (Math.random() * (double) arg1.field597.length);
            class54 var13 = class54.method388(class163.field2261, arg1.field597[var12], 0);
            if (var13 != null) {
                class328 var14 = var13.method390().method2015(class424.field6071);
                class7 var15 = class7.method77(var14, 100, var8);
                var15.method59(0);
                class452.field6419.method2418(var15);
                arg1.field587 = (int) ((double) (arg1.field578 - arg1.field581) * Math.random()) + arg1.field581;
                arg1.field584 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
    public static final void method2294(int arg0, int arg1, int arg2) {
        class337 var3 = class170.field2427[arg0][arg1][arg2];
        if (var3 != null && var3.field5063 != null) {
            var3.field5063 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method2295(byte arg0) {
        field5573 = null;
        field5577 = null;
        if (arg0 < 27) {
            field5573 = null;
        }
        field5571 = null;
        field5578 = null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(I)V")
    public class370(int arg0) {
        this.field5579 = arg0;
        this.field5564 = new class90[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class90 var3 = this.field5564[var2] = new class90();
            var3.field1252 = var3;
            var3.field1253 = var3;
        }
    }
}
