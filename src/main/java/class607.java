import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class607 extends class381 {

    @OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
    public int field8767 = 0;

    @OriginalMember(owner = "client!rp", name = "n", descriptor = "Lom;")
    private class351 field8771;

    @OriginalMember(owner = "client!rp", name = "r", descriptor = "I")
    public int field8775;

    @OriginalMember(owner = "client!rp", name = "C", descriptor = "[I")
    private int[] field8786;

    @OriginalMember(owner = "client!rp", name = "m", descriptor = "I")
    public int field8770;

    @OriginalMember(owner = "client!rp", name = "p", descriptor = "Lum;")
    private class528 field8773;

    @OriginalMember(owner = "client!rp", name = "o", descriptor = "F")
    public float field8772;

    @OriginalMember(owner = "client!rp", name = "B", descriptor = "I")
    public int field8785;

    @OriginalMember(owner = "client!rp", name = "x", descriptor = "I")
    public int field8781;

    @OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!rp", name = "s", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!rp", name = "y", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!rp", name = "z", descriptor = "I")
    public static int field8783;

    @OriginalMember(owner = "client!rp", name = "A", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!rp", name = "D", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!rp", name = "u", descriptor = "Lega;")
    private class184 field8778;

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "Lut;")
    public static class616 field8765;

    @OriginalMember(owner = "client!rp", name = "l", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8769;

    @OriginalMember(owner = "client!rp", name = "q", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8774;

    @OriginalMember(owner = "client!rp", name = "w", descriptor = "[[I")
    public static int[][] field8780;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)V")
    public final void method3465(int arg0, int arg1, int arg2, int arg3) {
        field8787++;
        this.field8786[this.field8771.field9628 * arg3 + arg0] = class151.method1076(this.field8786[this.field8771.field9628 * arg3 + arg0], 0x1 << arg2);
        if (arg1 == -11800) {
            this.field8767++;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
    public final void method3466(int arg0, int arg1) {
        if (arg0 >= -55) {
            method3470(-42, -43, 85, (byte) -63, null, 92);
        }
        field8776++;
        this.field8769.method2078(arg1 * 4 + 3);
        this.field8769.method2082(-1);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
    public static final void method3467(int arg0) {
        field8784++;
        if (class149.field2111 > 1) {
            class149.field2111--;
            class608.field8809 = class351.field5215;
        }
        if (class87.field1347) {
            class87.field1347 = false;
            class102.method728((byte) -37);
            return;
        }
        if (!class683.field9638) {
            class542.method3187(-42);
        }
        for (int var1 = 0; var1 < 100 && class217.method1371((byte) -73); var1++) {
        }
        if (class264.field3451 != 10) {
            return;
        }
        while (class124.method895((byte) -37)) {
            class654 var2 = class631.method3628(class104.field1549, (byte) -51, class357.field5280);
            var2.field9358.method3110(0, 68);
            int var3 = var2.field9358.field7956;
            class172.method1193((byte) 30, var2.field9358);
            var2.field9358.method3142(var2.field9358.field7956 - var3, true);
            class444.method2623(115, var2);
        }
        if (class464.field6701 == null) {
            if (class141.field2040 <= class60.method371(false)) {
                class464.field6701 = class23.field434.method2118(class684.field9654.field1527, true);
            }
        } else if (class464.field6701.field2321 != -1) {
            class654 var4 = class631.method3628(class409.field6096, (byte) -51, class357.field5280);
            var4.field9358.method3162(-2003712696, class464.field6701.field2321);
            class444.method2623(125, var4);
            class464.field6701 = null;
            class141.field2040 = class60.method371(false) + 30000L;
        }
        class147 var5 = (class147) class430.field6262.method1904(false);
        if (var5 != null || class291.field4280 < class60.method371(false) - 2000L) {
            class654 var6 = null;
            int var7 = 0;
            for (class147 var8 = (class147) class373.field5510.method1904(false); var8 != null && (var6 == null || (var6.field9358.field7956 - var7) < 240); var8 = (class147) class373.field5510.method1901(107)) {
                var8.method2360((byte) 66);
                int var9 = var8.method475(-2);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method478(0);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class656.field9374 != var10 || class335.field4879 != var9) {
                    if (var6 == null) {
                        class233.field3078++;
                        var6 = class631.method3628(class234.field3089, (byte) -51, class357.field5280);
                        var6.field9358.method3110(0, 120);
                        var7 = var6.field9358.field7956;
                    }
                    int var11 = var10 - class656.field9374;
                    class656.field9374 = var10;
                    int var12 = var9 - class335.field4879;
                    class335.field4879 = var9;
                    int var13 = (int) ((var8.method477((byte) 55) - class291.field4280) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field9358.method3162(-2003712696, (var11 << 6) + (var13 << 12) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var12 += 128;
                        var11 += 128;
                        var6.field9358.method3110(var13 + 128, 123);
                        var6.field9358.method3162(-2003712696, (var11 << 8) + var12);
                    } else if (var13 < 32) {
                        var6.field9358.method3110(var13 + 192, 94);
                        if (var10 == 1 || var9 == -1) {
                            var6.field9358.method3146(Integer.MIN_VALUE, 82);
                        } else {
                            var6.field9358.method3146(var9 << 16 | var10, -100);
                        }
                    } else {
                        var6.field9358.method3162(-2003712696, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field9358.method3146(Integer.MIN_VALUE, 91);
                        } else {
                            var6.field9358.method3146(var9 << 16 | var10, 84);
                        }
                    }
                    class291.field4280 = var8.method477((byte) 55);
                }
            }
            if (var6 != null) {
                var6.field9358.method3142(var6.field9358.field7956 - var7, true);
                class444.method2623(118, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method477((byte) 55) - class454.field6558) / 50L;
            class454.field6558 = var5.method477((byte) 55);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method475(-2);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method478(0);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method479((byte) 41) == 2) {
                var18 = 1;
            }
            class221.field2940++;
            int var19 = (int) var14;
            class654 var20 = class631.method3628(class61.field977, (byte) -51, class357.field5280);
            var20.field9358.method3143(var18 << 15 | var19, (byte) 72);
            var20.field9358.method3171(var17 | var16 << 16, (byte) -55);
            class444.method2623(122, var20);
        }
        if (class417.field6162 > 0) {
            class268.field3494++;
            class654 var21 = class631.method3628(class553.field8127, (byte) -51, class357.field5280);
            var21.field9358.method3110(class417.field6162 * 3, 60);
            for (int var22 = 0; var22 < class417.field6162; var22++) {
                class439 var23 = class640.field9188[var22];
                long var24 = (var23.method2603(-46) - class10.field268) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class10.field268 = var23.method2603(-114);
                var21.field9358.method3110(var23.method2606(true), 105);
                var21.field9358.method3162(-2003712696, (int) var24);
            }
            class444.method2623(123, var21);
        }
        if (class102.field1534 > 0) {
            class102.field1534--;
        }
        if (class567.field8268 && class102.field1534 <= 0) {
            class102.field1534 = 20;
            class567.field8268 = false;
            class90.field1379++;
            class654 var26 = class631.method3628(class529.field7807, (byte) -51, class357.field5280);
            var26.field9358.method3162(-2003712696, (int) class528.field7602 >> 3);
            var26.field9358.method3143((int) class311.field4589 >> 3, (byte) 72);
            class444.method2623(127, var26);
        }
        if (class399.field6015 != class696.field9809) {
            class399.field6015 = class696.field9809;
            class331.field4818++;
            class654 var27 = class631.method3628(class278.field3613, (byte) -51, class357.field5280);
            var27.field9358.method3110(class696.field9809 ? 1 : 0, 102);
            class444.method2623(127, var27);
        }
        if (!class326.field4730) {
            class139.field2023++;
            class654 var28 = class631.method3628(class57.field927, (byte) -51, class357.field5280);
            var28.field9358.method3110(0, 59);
            int var29 = var28.field9358.field7956;
            class540 var30 = new class540(class415.method2528(-1));
            class335.field4872.method3787(-104, var30);
            var28.field9358.method3149(0, var30.field7952, var30.field7956, -109);
            var28.field9358.method3142(var28.field9358.field7956 - var29, true);
            class444.method2623(126, var28);
            class326.field4730 = true;
        }
        if (class603.field8695 != null) {
            if (class684.field9659 == 2) {
                class160.method1137(1000);
            } else if (class684.field9659 == 3) {
                class519.method2933((byte) 79);
            }
        }
        if (class500.field7079) {
            class500.field7079 = false;
        } else {
            class682.field9632 /= 2.0F;
        }
        if (class408.field6089) {
            class408.field6089 = false;
        } else {
            class457.field6595 /= 2.0F;
        }
        class606.method3454(11);
        if (class264.field3451 != 10) {
            return;
        }
        class351.method2180(-17040);
        class272.method1625((byte) -38);
        class364.method2235((byte) 1);
        class47.field746++;
        if (class47.field746 > 750) {
            class102.method728((byte) -96);
            return;
        }
        class54.method325(828);
        class117.method865(-24);
        if (arg0 >= -34) {
            return;
        }
        class319.method1975(-10636);
        for (int var31 = class308.field4545.method3392(true, -1); var31 != -1; var31 = class308.field4545.method3392(false, -1)) {
            class212.method1342(-100, var31);
            class456.field6573[class425.method2563(31, class572.field8306++)] = var31;
        }
        for (class489 var32 = class283.method1677(2); var32 != null; var32 = class283.method1677(2)) {
            int var33 = var32.method2793((byte) 12);
            int var34 = var32.method2792((byte) 114);
            if (var33 == 1) {
                class653.field9351[var34] = var32.field6952;
                class347.field5135 |= class338.field4914[var34];
                class23.field437[class425.method2563(31, class309.field4563++)] = var34;
            } else if (var33 == 2) {
                class298.field4380[var34] = var32.field6939;
                class454.field6554[class425.method2563(class32.field538++, 31)] = var34;
            } else if (var33 == 3) {
                class5 var57 = class705.method3944(var34, (byte) 109);
                if (!var32.field6939.equals(var57.field162)) {
                    var57.field162 = var32.field6939;
                    class284.method1679(var57, -13);
                }
            } else if (var33 == 4) {
                class5 var53 = class705.method3944(var34, (byte) 121);
                int var54 = var32.field6952;
                int var55 = var32.field6942;
                int var56 = var32.field6945;
                if (var53.field142 != var54 || var53.field105 != var55 || var53.field185 != var56) {
                    var53.field185 = var56;
                    var53.field142 = var54;
                    var53.field105 = var55;
                    class284.method1679(var53, -119);
                }
            } else if (var33 == 5) {
                class5 var51 = class705.method3944(var34, (byte) 118);
                if (var32.field6952 != var51.field51 || var32.field6952 == -1) {
                    var51.field69 = 0;
                    var51.field115 = 1;
                    var51.field56 = 0;
                    var51.field51 = var32.field6952;
                    class47 var52 = var51.field51 == -1 ? null : class203.field2769.method2971(-78, var51.field51);
                    if (var52 != null) {
                        class196.method1283(var52, 7, var51.field56);
                    }
                    class284.method1679(var51, -75);
                }
            } else if (var33 == 6) {
                int var35 = var32.field6952;
                int var36 = (var35 & 0x7C12) >> 10;
                int var37 = var35 >> 5 & 0x1F;
                int var38 = var35 & 0x1F;
                int var39 = (var38 << 3) + (var36 << 19) + (var37 << 11);
                class5 var40 = class705.method3944(var34, (byte) 106);
                if (var40.field147 != var39) {
                    var40.field147 = var39;
                    class284.method1679(var40, -101);
                }
            } else if (var33 == 7) {
                class5 var49 = class705.method3944(var34, (byte) 117);
                boolean var50 = var32.field6952 == 1;
                if (var49.field173 != var50) {
                    var49.field173 = var50;
                    class284.method1679(var49, -81);
                }
            } else if (var33 == 8) {
                class5 var48 = class705.method3944(var34, (byte) 108);
                if (var32.field6952 != var48.field164 || var32.field6942 != var48.field54 || var32.field6945 != var48.field138) {
                    var48.field138 = var32.field6945;
                    var48.field164 = var32.field6952;
                    var48.field54 = var32.field6942;
                    if (var48.field59 != -1) {
                        if (var48.field141 > 0) {
                            var48.field138 = var48.field138 * 32 / var48.field141;
                        } else if (var48.field178 > 0) {
                            var48.field138 = var48.field138 * 32 / var48.field178;
                        }
                    }
                    class284.method1679(var48, -105);
                }
            } else if (var33 == 9) {
                class5 var41 = class705.method3944(var34, (byte) 107);
                if (var32.field6952 != var41.field59 || var32.field6942 != var41.field108) {
                    var41.field108 = var32.field6942;
                    var41.field59 = var32.field6952;
                    class284.method1679(var41, -32);
                }
            } else if (var33 == 10) {
                class5 var42 = class705.method3944(var34, (byte) 126);
                if (var32.field6952 != var42.field49 || var32.field6942 != var42.field125 || var32.field6945 != var42.field137) {
                    var42.field49 = var32.field6952;
                    var42.field125 = var32.field6942;
                    var42.field137 = var32.field6945;
                    class284.method1679(var42, -8);
                }
            } else if (var33 == 11) {
                class5 var43 = class705.method3944(var34, (byte) 107);
                var43.field170 = 0;
                var43.field148 = 0;
                var43.field150 = var43.field122 = var32.field6942;
                var43.field80 = var43.field84 = var32.field6952;
                class284.method1679(var43, -22);
            } else if (var33 == 12) {
                class5 var46 = class705.method3944(var34, (byte) 113);
                int var47 = var32.field6952;
                if (var46 != null && var46.field172 == 0) {
                    if (var47 > (var46.field120 - var46.field76)) {
                        var47 = var46.field120 - var46.field76;
                    }
                    if (var47 < 0) {
                        var47 = 0;
                    }
                    if (var46.field196 != var47) {
                        var46.field196 = var47;
                        class284.method1679(var46, -23);
                    }
                }
            } else if (var33 == 14) {
                class5 var45 = class705.method3944(var34, (byte) 121);
                var45.field132 = var32.field6952;
            } else if (var33 == 15) {
                class338.field4905 = true;
                class338.field4907 = var32.field6942;
                class373.field5521 = var32.field6952;
            } else if (var33 == 16) {
                class5 var44 = class705.method3944(var34, (byte) 108);
                var44.field157 = var32.field6952;
            }
        }
        class255.field3319++;
        if (class36.field566 != 0) {
            class216.field2892 += 20;
            if (class216.field2892 >= 400) {
                class36.field566 = 0;
            }
        }
        if (class661.field9418 != null) {
            class422.field6199++;
            if (class422.field6199 >= 15) {
                class284.method1679(class661.field9418, -53);
                class661.field9418 = null;
            }
        }
        class603.field8716 = false;
        class574.field8343 = null;
        class361.field5296 = false;
        class403.field6050 = null;
        class569.method3276(-1, null, true, -1);
        class436.method2591(null, -1, (byte) -85, -1);
        if (!class240.field3164) {
            class222.field2943 = -1;
        }
        class492.method2811(true);
        class351.field5215++;
        if (class625.field9043) {
            class22.field413++;
            class654 var58 = class631.method3628(class374.field5527, (byte) -51, class357.field5280);
            var58.field9358.method3126(2124924176, class59.field961 << 28 | class609.field8810 << 14 | class330.field4793);
            class444.method2623(120, var58);
            class625.field9043 = false;
        }
        while (true) {
            class303 var59;
            class5 var60;
            class5 var61;
            do {
                var59 = (class303) class296.field4361.method1902(127);
                if (var59 == null) {
                    while (true) {
                        class303 var62;
                        class5 var63;
                        class5 var64;
                        do {
                            var62 = (class303) class389.field5826.method1902(102);
                            if (var62 == null) {
                                while (true) {
                                    class303 var65;
                                    class5 var66;
                                    class5 var67;
                                    do {
                                        var65 = (class303) class625.field9038.method1902(119);
                                        if (var65 == null) {
                                            if (class574.field8343 == null) {
                                                class393.field5949 = 0;
                                            }
                                            if (class188.field2561 != null) {
                                                class636.method3637(false);
                                            }
                                            if (class248.field3272 > 0 && class18.field362.method1609(82, -27453) && class18.field362.method1609(81, -27453) && class623.field9013 != 0) {
                                                int var68 = class321.field4681.field7905 - class623.field9013;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class164.method1160(82, class321.field4681.field7430[0] + class397.field6005, var68, class321.field4681.field7429[0] + class403.field6049);
                                            }
                                            class704.method3943((byte) 127);
                                            for (int var69 = 0; var69 < 5; var69++) {
                                                int var10002 = class264.field3453[var69]++;
                                            }
                                            if (class347.field5135 && class624.field9017 < class60.method371(false) - 60000L) {
                                                class177.method1206((byte) -112);
                                            }
                                            for (class592 var70 = (class592) class688.field9715.method2370(-26173); var70 != null; var70 = (class592) class688.field9715.method2369((byte) 127)) {
                                                if ((class60.method371(false) / 1000L - 5L) > ((long) var70.field8593)) {
                                                    if (var70.field8594 > 0) {
                                                        class46.method275("", 5, var70.field8597 + class279.field3644.method1654(109, class262.field3401), "", 255, "", 0);
                                                    }
                                                    if (var70.field8594 == 0) {
                                                        class46.method275("", 5, var70.field8597 + class279.field3645.method1654(124, class262.field3401), "", 255, "", 0);
                                                    }
                                                    var70.method300((byte) 61);
                                                }
                                            }
                                            class227.field3020++;
                                            if (class227.field3020 > 500) {
                                                class227.field3020 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x2) == 2) {
                                                    class49.field772 += class526.field7481;
                                                }
                                                if ((var71 & 0x1) == 1) {
                                                    class623.field9011 += class243.field3221;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    class91.field1395 += class388.field5805;
                                                }
                                            }
                                            if (class623.field9011 < -50) {
                                                class243.field3221 = 2;
                                            }
                                            if (class49.field772 < -55) {
                                                class526.field7481 = 2;
                                            }
                                            if (class623.field9011 > 50) {
                                                class243.field3221 = -2;
                                            }
                                            if (class91.field1395 < -40) {
                                                class388.field5805 = 1;
                                            }
                                            if (class49.field772 > 55) {
                                                class526.field7481 = -2;
                                            }
                                            class510.field7196++;
                                            if (class91.field1395 > 40) {
                                                class388.field5805 = -1;
                                            }
                                            if (class510.field7196 > 500) {
                                                class510.field7196 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x2) == 2) {
                                                    class697.field9826 += class356.field5260;
                                                }
                                                if ((var72 & 0x1) == 1) {
                                                    class53.field817 += class66.field1052;
                                                }
                                            }
                                            if (class53.field817 < -60) {
                                                class66.field1052 = 2;
                                            }
                                            if (class697.field9826 < -20) {
                                                class356.field5260 = 1;
                                            }
                                            if (class53.field817 > 60) {
                                                class66.field1052 = -2;
                                            }
                                            if (class697.field9826 > 10) {
                                                class356.field5260 = -1;
                                            }
                                            class227.field3021++;
                                            if (class227.field3021 > 50) {
                                                class577.field8379++;
                                                class654 var73 = class631.method3628(class688.field9716, (byte) -51, class357.field5280);
                                                class444.method2623(121, var73);
                                            }
                                            if (class538.field7907) {
                                                class302.method1900(true);
                                                class538.field7907 = false;
                                            }
                                            try {
                                                class220.method1385(true);
                                                return;
                                            } catch (IOException var74) {
                                                class102.method728((byte) -112);
                                                return;
                                            }
                                        }
                                        var66 = var65.field4499;
                                        if (var66.field53 < 0) {
                                            break;
                                        }
                                        var67 = class705.method3944(var66.field87, (byte) 117);
                                    } while (var67 == null || var67.field109 == null || var66.field53 >= var67.field109.length || var67.field109[var66.field53] != var66);
                                    class195.method1270(var65);
                                }
                            }
                            var63 = var62.field4499;
                            if (var63.field53 < 0) {
                                break;
                            }
                            var64 = class705.method3944(var63.field87, (byte) 121);
                        } while (var64 == null || var64.field109 == null || var63.field53 >= var64.field109.length || var64.field109[var63.field53] != var63);
                        class195.method1270(var62);
                    }
                }
                var60 = var59.field4499;
                if (var60.field53 < 0) {
                    break;
                }
                var61 = class705.method3944(var60.field87, (byte) 124);
            } while (var61 == null || var61.field109 == null || var60.field53 >= var61.field109.length || var61.field109[var60.field53] != var60);
            class195.method1270(var59);
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)V")
    public final void method3468(int arg0, int arg1) {
        this.field8769.method2084();
        field8777++;
        this.field8778 = this.field8773.method806(arg1 + 6, false);
        this.field8778.method1228(-27648, 4, this.field8774, arg0 * arg1);
        this.field8774 = null;
        this.field8769 = null;
    }

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(II)V")
    public final void method3469(int arg0, int arg1) {
        field8768++;
        this.field8774 = this.field8773.method2996(true, arg1 * 4, 84);
        this.field8769 = new Stream(this.field8774, arg0, arg1 * 4);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIBLqv;I)V")
    public static final void method3470(int arg0, int arg1, int arg2, byte arg3, class65 arg4, int arg5) {
        field8782++;
        if (arg4.field1039 == -1 && arg4.field1030 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class335.field4872.field9507 * arg4.field1016 >> 8;
        if (arg2 > arg4.field1033) {
            var6 += arg2 - arg4.field1033;
        } else if (arg4.field1020 > arg2) {
            var6 += arg4.field1020 - arg2;
        }
        if (arg4.field1035 < arg5) {
            var6 += arg5 - arg4.field1035;
        } else if (arg5 < arg4.field1027) {
            var6 += arg4.field1027 - arg5;
        }
        if (arg4.field1010 == 0 || arg4.field1010 < (var6 - 256) || class335.field4872.field9507 == 0 || arg4.field1029 != arg1) {
            if (arg4.field1034 != null) {
                class556.field8166.method2205(arg4.field1034);
                arg4.field1014 = null;
                arg4.field1019 = null;
                arg4.field1034 = null;
            }
            if (arg4.field1036 != null) {
                class556.field8166.method2205(arg4.field1036);
                arg4.field1036 = null;
                arg4.field1021 = null;
                arg4.field1037 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg4.field1010 - var6) * var7 / arg4.field1010;
        if (arg3 != -79) {
            field8780 = null;
        }
        class321.field4681.method422((byte) 114);
        int var9 = 8192;
        int var10 = (arg4.field1033 + arg4.field1020) / 2 - arg2;
        int var11 = (arg4.field1035 + arg4.field1027) / 2 - arg5;
        if (var10 != 0 || var11 != 0) {
            int var12 = -class481.field6886 - ((int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) + 4096) & 0x3FFF;
            if (var12 > 8192) {
                var12 = 16384 - var12;
            }
            int var13;
            if (var6 <= 0) {
                var13 = 8192;
            } else if (var6 < 4096) {
                var13 = (var6 * 8192 / 4096) + 8192;
            } else {
                var13 = 16384;
            }
            var9 = (16384 - var13 >> 1) + var12 * var13 / 8192;
        }
        if (arg4.field1034 != null) {
            arg4.field1034.method538(var8);
            arg4.field1034.method543(var9);
        } else if (arg4.field1039 >= 0) {
            int var14 = arg4.field1017 == 256 && arg4.field1028 == 256 ? 256 : class595.method3384(arg4.field1028, arg4.field1017, (byte) -123);
            if (arg4.field1012) {
                if (arg4.field1019 == null) {
                    arg4.field1019 = class137.method975(class674.field9509, arg4.field1039);
                }
                if (arg4.field1019 != null) {
                    if (arg4.field1014 == null) {
                        arg4.field1014 = arg4.field1019.method974(new int[] { 22050 });
                    }
                    if (arg4.field1014 != null) {
                        class93 var15 = class93.method537(arg4.field1014, var14, var8 << 6, var9);
                        var15.method558(-1);
                        class556.field8166.method2206(var15);
                        arg4.field1034 = var15;
                    }
                }
            } else {
                class482 var16 = class482.method2762(class148.field2100, arg4.field1039, 0);
                if (var16 != null) {
                    class396 var17 = var16.method2761().method2465(class592.field8600);
                    class93 var18 = class93.method537(var17, var14, var8 << 6, var9);
                    var18.method558(-1);
                    class556.field8166.method2206(var18);
                    arg4.field1034 = var18;
                }
            }
        }
        if (arg4.field1036 != null) {
            arg4.field1036.method538(var8);
            arg4.field1036.method543(var9);
            if (arg4.field1036.method2359(arg3 + 1578141339)) {
                return;
            }
            arg4.field1036 = null;
            arg4.field1021 = null;
            arg4.field1037 = null;
        } else if (arg4.field1030 != null && (arg4.field1023 -= arg0) <= 0) {
            int var19 = arg4.field1017 == 256 && arg4.field1028 == 256 ? 256 : arg4.field1028 + (int) (Math.random() * (double) (arg4.field1017 - arg4.field1028));
            if (!arg4.field1008) {
                int var20 = (int) (Math.random() * (double) arg4.field1030.length);
                class482 var21 = class482.method2762(class148.field2100, arg4.field1030[var20], 0);
                if (var21 != null) {
                    class396 var22 = var21.method2761().method2465(class592.field8600);
                    class93 var23 = class93.method537(var22, var19, var8 << 6, var9);
                    var23.method558(0);
                    class556.field8166.method2206(var23);
                    arg4.field1036 = var23;
                    arg4.field1023 = arg4.field1042 + (int) (Math.random() * (double) (arg4.field1011 - arg4.field1042));
                    return;
                }
                return;
            }
            if (arg4.field1021 == null) {
                int var24 = (int) (Math.random() * (double) arg4.field1030.length);
                arg4.field1021 = class137.method975(class674.field9509, arg4.field1030[var24]);
            }
            if (arg4.field1021 != null) {
                if (arg4.field1037 == null) {
                    arg4.field1037 = arg4.field1021.method974(new int[] { 22050 });
                }
                if (arg4.field1037 != null) {
                    class93 var25 = class93.method537(arg4.field1037, var19, var8 << 6, var9);
                    var25.method558(0);
                    class556.field8166.method2206(var25);
                    arg4.field1023 = arg4.field1042 + (int) ((double) (arg4.field1011 - arg4.field1042) * Math.random());
                    arg4.field1036 = var25;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)V")
    public static void method3471(int arg0) {
        field8780 = null;
        field8765 = null;
        if (arg0 != 541404965) {
            method3471(71);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II[I)V")
    public final void method3472(int arg0, int arg1, int[] arg2) {
        field8779++;
        class532 var4 = this.field8773.method3007(2, this.field8767 * 3);
        Buffer var5 = var4.method985((byte) 60, true);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field8773.method3038(-10641, var5);
        if (arg1 >= -81) {
            return;
        }
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method2077()) {
            label98: for (int var18 = 0; var18 < arg0; var18++) {
                int var20 = arg2[var18];
                int var21 = this.field8786[var20];
                short[] var22 = this.field8771.field5213[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label98;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    var6.method2083(var26);
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            label123: for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = arg2[var10];
                int var12 = this.field8786[var11];
                short[] var13 = this.field8771.field5213[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var13.length) {
                                continue label123;
                            }
                            if ((var12 & 0x1 << var14++) == 0) {
                                var15 += 3;
                            } else {
                                var7++;
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    var6.method2080(var17);
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method2084();
        if (!var4.method986(true) || var7 <= 0) {
            return;
        }
        this.field8773.method3058((this.field8771.field5218 & 0x8) != 0, this.field8785, (byte) -117, (this.field8771.field5218 & 0x7) != 0);
        if (this.field8773.field7756) {
            this.field8773.method657(Integer.MAX_VALUE, this.field8775, this.field8770, this.field8781);
        }
        class300 var19 = this.field8773.method3032(-30);
        var19.method1867(1.0F / this.field8772, 1.0F, 1.0F / this.field8772, -106);
        this.field8773.method3045(-114, class635.field9152);
        this.field8773.method754(this.field8778, 1, 27910);
        this.field8773.method811(this.field8771.field5233, (byte) 91);
        this.field8773.method756(0, var9 + 1 - var8, 11897, class433.field6280, var7, var4, var8);
        this.field8773.method3003(1);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(FBIII)V")
    public final void method3473(float arg0, byte arg1, int arg2, int arg3, int arg4) {
        field8783++;
        if (this.field8785 != -1) {
            class457 var6 = this.field8773.field1491.method955(-1330, this.field8785);
            int var7 = var6.field6603 & 0xFF;
            if (var7 != 0 && var6.field6600 != 4) {
                int var8;
                if (arg4 < 0) {
                    var8 = 0;
                } else if (arg4 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg4 * 131586;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((var8 & 0xFF00FF) * var7 + ((arg3 & 0xFF00FF) * var10) & 0xFF00FF00) + ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field6611 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg3 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var13 & 0xFF00) + (var14 >> 8) + (var12 & 0xFF00 << 8);
            }
        }
        if (arg0 != 1.0F) {
            int var15 = (arg3 & 0xFF5DB7) >> 16;
            int var16 = arg3 >> 8 & 0xFF;
            int var17 = arg3 & 0xFF;
            int var18 = (int) ((float) var15 * arg0);
            int var19 = (int) ((float) var16 * arg0);
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            int var20 = (int) ((float) var17 * arg0);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var18 << 16 | var19 << 8 | var20;
        }
        int var21 = -19 % ((24 - arg1) / 40);
        this.field8769.method2078(arg2 * 4);
        if (this.field8773.field7764 == 0) {
            this.field8769.method2082((byte) arg3);
            this.field8769.method2082((byte) (arg3 >> 8));
            this.field8769.method2082((byte) (arg3 >> 16));
        } else {
            this.field8769.method2082((byte) (arg3 >> 16));
            this.field8769.method2082((byte) (arg3 >> 8));
            this.field8769.method2082((byte) arg3);
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lom;IIIII)V")
    public class607(class351 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8771 = arg0;
        this.field8775 = arg3;
        this.field8786 = new int[this.field8771.field9630 * this.field8771.field9628];
        this.field8770 = arg4;
        this.field8773 = this.field8771.field5212;
        this.field8772 = arg2;
        this.field8785 = arg1;
        this.field8781 = arg5;
    }
}
