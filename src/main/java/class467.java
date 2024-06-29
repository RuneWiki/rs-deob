import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class467 {

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Lpg;")
    public static class492 field6801 = new class492(60, 6);

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[I")
    public static int[] field6806 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "F")
    public static float field6808;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "J")
    public long field6799;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Lns;")
    public static class438 field6807;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lvg;")
    public class467 field6797;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Lvg;")
    public class467 field6803;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "[[[J")
    public static long[][][] field6805;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public final void method2785(byte arg0) {
        field6798++;
        if (this.field6803 == null) {
            return;
        }
        this.field6803.field6797 = this.field6797;
        this.field6797.field6803 = this.field6803;
        this.field6797 = null;
        this.field6803 = null;
        if (arg0 != -120) {
            field6806 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIILqa;)V")
    public static final void method2786(byte arg0, int arg1, int arg2, class496 arg3) {
        field6800++;
        if (arg1 < 0 || arg2 < 0 || class101.field1454 == 0 || class426.field6345 == 0) {
            return;
        }
        arg3.method1127(class320.field4910, class74.field1000, class101.field1454, class426.field6345);
        arg3.method1046(class286.field4273, class320.field4912, class101.field1454, class426.field6345);
        if (arg0 >= -59) {
            field6808 = -1.4835815F;
        }
        class23 var4 = arg3.method1092();
        var4.method184(class406.field6135, class169.field2463, class163.field2388, class327.field5010, class216.field2997, class199.field2806);
        arg3.method1064(var4);
        if (class204.field2871 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg3.method1035();
            int var8 = (arg1 - class320.field4910) * var7 / class101.field1454;
            int var9 = (arg2 - class74.field1000) * var7 / class426.field6345;
            int var10 = arg3.method1069();
            int var11 = (arg1 - class320.field4910) * var10 / class101.field1454;
            int var12 = (arg2 - class74.field1000) * var10 / class426.field6345;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method176(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method176(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class96.field1403 && var22 < class485.field7122) {
                    int var23 = class339.field5365.field2210;
                    if (var23 < 3 && (class129.field1816[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class204.field2871[var23].method853(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = (class339.field5365.method2091(-15245) - 1 << 6) + var19 >> 7;
                        var6 = (class339.field5365.method2091(-15245) - 1 << 6) + var21 >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class500.field7455 && (class303.field4468 & 0x40) != 0) {
                    class499 var24 = class458.method2757(class186.field2616, false, class126.field1798);
                    if (var24 == null) {
                        class457.method2749(-1);
                    } else {
                        class294.method1898(-1, var5, 0L, false, class261.field3635, true, class266.field3714, " ->", var6, -1, 58);
                    }
                } else {
                    if (class393.field5983 == class259.field3610) {
                        class294.method1898(-1, var5, 0L, false, -1, true, class25.field410.method2335((byte) -100, class288.field4292), "", var6, -1, 20);
                    }
                    class294.method1898(-1, var5, 0L, false, class456.field6697, true, class454.field6673, "", var6, -1, 48);
                    class498.field7269++;
                }
            }
        }
        class380 var25 = class404.field6112;
        for (class507 var26 = (class507) var25.method2358((byte) 107); var26 != null; var26 = (class507) var25.method2363(31844)) {
            if (class339.field5365.field2210 == var26.field7544 && var26.method3026(124, arg2, arg3, arg1)) {
                if (var26.field7548 instanceof class322) {
                    class322 var27 = (class322) var26.field7548;
                    int var28 = var27.method2091(-15245);
                    if ((var28 & 0x1) == 0 && (var27.field2217 & 0x7F) == 0 && (var27.field2215 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field2217 & 0x7F) == 64 && (var27.field2215 & 0x7F) == 64) {
                        int var29 = var27.field2217 - (var27.method2091(-15245) - 1 << 6);
                        int var30 = var27.field2215 - (var27.method2091(-15245) - 1 << 6);
                        for (int var31 = 0; var31 < class25.field411; var31++) {
                            class194 var38 = class151.field2174[class259.field3609[var31]];
                            if (var38 != null && class405.field6116 != var38.field5289 && var38.field5310) {
                                int var39 = var38.field2217 - (var38.field2768.field5083 - 1 << 6);
                                int var40 = var38.field2215 - (var38.field2768.field5083 - 1 << 6);
                                if (var39 >= var29 && var38.field2768.field5083 <= (var27.method2091(-15245) - (var39 - var29 >> 7)) && var30 <= var40 && var38.field2768.field5083 <= (var27.method2091(-15245) - (var40 - var30 >> 7))) {
                                    class120.method772((byte) 106, class339.field5365.field2210 != var26.field7544, var38);
                                    var38.field5289 = class405.field6116;
                                }
                            }
                        }
                        int var32 = class442.field6574;
                        int[] var33 = class320.field4896;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class322 var35 = class439.field6539[var33[var34]];
                            if (var35 != null && class405.field6116 != var35.field5289 && var27 != var35 && var35.field5310) {
                                int var36 = var35.field2217 - (var35.method2091(-15245) - 1 << 6);
                                int var37 = var35.field2215 - (var35.method2091(-15245) - 1 << 6);
                                if (var29 <= var36 && var35.method2091(-15245) <= (var27.method2091(-15245) - (var36 - var29 >> 7)) && var37 >= var30 && var35.method2091(-15245) <= var27.method2091(-15245) - (var37 - var30 >> 7)) {
                                    class69.method478(var35, class339.field5365.field2210 != var26.field7544, -379);
                                    var35.field5289 = class405.field6116;
                                }
                            }
                        }
                    }
                    if (class405.field6116 == var27.field5289) {
                        continue;
                    }
                    class69.method478(var27, class339.field5365.field2210 != var26.field7544, -379);
                    var27.field5289 = class405.field6116;
                }
                if (var26.field7548 instanceof class194) {
                    class194 var41 = (class194) var26.field7548;
                    if (var41.field2768 != null) {
                        if ((var41.field2768.field5083 & 0x1) == 0 && (var41.field2217 & 0x7F) == 0 && (var41.field2215 & 0x7F) == 0 || (var41.field2768.field5083 & 0x1) == 1 && (var41.field2217 & 0x7F) == 64 && (var41.field2215 & 0x7F) == 64) {
                            int var42 = var41.field2217 - (var41.field2768.field5083 - 1 << 6);
                            int var43 = var41.field2215 - (var41.field2768.field5083 - 1 << 6);
                            for (int var44 = 0; var44 < class25.field411; var44++) {
                                class194 var51 = class151.field2174[class259.field3609[var44]];
                                if (var51 != null && class405.field6116 != var51.field5289 && var41 != var51 && var51.field5310) {
                                    int var52 = var51.field2217 - (var51.field2768.field5083 - 1 << 6);
                                    int var53 = var51.field2215 - (var51.field2768.field5083 - 1 << 6);
                                    if (var52 >= var42 && var51.field2768.field5083 <= var41.field2768.field5083 - (var52 - var42 >> 7) && var43 <= var53 && var41.field2768.field5083 - (var53 - var43 >> 7) >= var51.field2768.field5083) {
                                        class120.method772((byte) 108, class339.field5365.field2210 != var26.field7544, var51);
                                        var51.field5289 = class405.field6116;
                                    }
                                }
                            }
                            int var45 = class442.field6574;
                            int[] var46 = class320.field4896;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class322 var48 = class439.field6539[var46[var47]];
                                if (var48 != null && class405.field6116 != var48.field5289 && var48.field5310) {
                                    int var49 = var48.field2217 - (var48.method2091(-15245) - 1 << 6);
                                    int var50 = var48.field2215 - (var48.method2091(-15245) - 1 << 6);
                                    if (var49 >= var42 && var48.method2091(-15245) <= (var41.field2768.field5083 - (var49 - var42 >> 7)) && var50 >= var43 && var48.method2091(-15245) <= var41.field2768.field5083 - (var50 - var43 >> 7)) {
                                        class69.method478(var48, class339.field5365.field2210 != var26.field7544, -379);
                                        var48.field5289 = class405.field6116;
                                    }
                                }
                            }
                        }
                        if (class405.field6116 == var41.field5289) {
                            continue;
                        }
                        class120.method772((byte) 106, class339.field5365.field2210 != var26.field7544, var41);
                        var41.field5289 = class405.field6116;
                    }
                }
                if (var26.field7548 instanceof class459) {
                    class481 var54 = (class481) class392.field5964.method943((long) (var26.field7543 | var26.field7550 << 14 | var26.field7544 << 28), -1);
                    if (var54 != null) {
                        for (class251 var55 = (class251) var54.field7021.method1968(-31872); var55 != null; var55 = (class251) var54.field7021.method1964(true)) {
                            class61 var56 = class84.field1154.method2451(-1, var55.field3476);
                            if (!class500.field7455) {
                                if (class339.field5365.field2210 == var26.field7544) {
                                    String[] var57 = var56.field869;
                                    for (int var58 = 4; var58 >= 0; var58--) {
                                        if (var57 != null && var57[var58] != null) {
                                            byte var59 = 0;
                                            if (var58 == 0) {
                                                var59 = 59;
                                            }
                                            int var60 = class286.field4260;
                                            if (var58 == 1) {
                                                var59 = 49;
                                            }
                                            if (var58 == 2) {
                                                var59 = 57;
                                            }
                                            if (var58 == 3) {
                                                var59 = 5;
                                            }
                                            if (var58 == 4) {
                                                var59 = 19;
                                            }
                                            if (var56.field849 == var58) {
                                                var60 = var56.field831;
                                            }
                                            if (var56.field835 == var58) {
                                                var60 = var56.field874;
                                            }
                                            class294.method1898(-1, var26.field7543, (long) var55.field3476, false, var60, true, var57[var58], "<col=ff9040>" + var56.field827, var26.field7550, -1, var59);
                                            class321.field4923++;
                                        }
                                    }
                                }
                                class294.method1898(-1, var26.field7543, (long) var55.field3476, class339.field5365.field2210 != var26.field7544, class107.field1517, true, class179.field2549.method2335((byte) -100, class288.field4292), "<col=ff9040>" + var56.field827, var26.field7550, -1, 1004);
                                class91.field1279++;
                            } else if (class339.field5365.field2210 == var26.field7544) {
                                class109 var61 = class57.field764 == -1 ? null : class209.field2960.method3083(class57.field764, 109);
                                if ((class303.field4468 & 0x1) != 0 && (var61 == null || var56.method416(-16777215, var61.field1532, class57.field764) != var61.field1532)) {
                                    class322.field4940++;
                                    class294.method1898(-1, var26.field7543, (long) var55.field3476, false, class261.field3635, true, class266.field3714, class509.field7572 + " -> <col=ff9040>" + var56.field827, var26.field7550, -1, 18);
                                }
                            }
                        }
                    }
                }
                if (var26.field7548 instanceof class196) {
                    class196 var62 = (class196) var26.field7548;
                    class130 var63 = class56.field755.method2031(124, var62.method50(25707));
                    if (var63.field1823 != null) {
                        var63 = var63.method832((byte) -123, class36.field583);
                    }
                    if (var63 != null) {
                        if (!class500.field7455) {
                            if (class339.field5365.field2210 == var26.field7544) {
                                String[] var65 = var63.field1883;
                                if (var65 != null) {
                                    for (int var66 = 4; var66 >= 0; var66--) {
                                        if (var65[var66] != null) {
                                            short var67 = 0;
                                            int var68 = class286.field4260;
                                            if (var66 == 0) {
                                                var67 = 11;
                                            }
                                            if (var66 == 1) {
                                                var67 = 51;
                                            }
                                            if (var66 == 2) {
                                                var67 = 6;
                                            }
                                            if (var66 == 3) {
                                                var67 = 25;
                                            }
                                            if (var63.field1873 == var66) {
                                                var68 = var63.field1904;
                                            }
                                            if (var66 == 4) {
                                                var67 = 1007;
                                            }
                                            if (var63.field1846 == var66) {
                                                var68 = var63.field1875;
                                            }
                                            class514.field7623++;
                                            class294.method1898(-1, var26.field7543, class100.method681(var26.field7543, var26.field7550, var62, -29243), false, var68, true, var65[var66], "<col=00ffff>" + var63.field1878, var26.field7550, -1, var67);
                                        }
                                    }
                                }
                            }
                            class20.field303++;
                            class294.method1898(-1, var26.field7543, (long) var63.field1826, class339.field5365.field2210 != var26.field7544, class107.field1517, true, class179.field2549.method2335((byte) -100, class288.field4292), "<col=00ffff>" + var63.field1878, var26.field7550, -1, 1006);
                        } else if (class339.field5365.field2210 == var26.field7544) {
                            class109 var64 = class57.field764 == -1 ? null : class209.field2960.method3083(class57.field764, 55);
                            if ((class303.field4468 & 0x4) != 0 && (var64 == null || var63.method827(var64.field1532, 119, class57.field764) != var64.field1532)) {
                                class294.method1898(-1, var26.field7543, class100.method681(var26.field7543, var26.field7550, var62, -29243), false, class261.field3635, true, class266.field3714, class509.field7572 + " -> <col=00ffff>" + var63.field1878, var26.field7550, -1, 4);
                                class81.field1083++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V")
    public static void method2787(boolean arg0) {
        if (arg0) {
            method2787(true);
        }
        field6805 = null;
        field6807 = null;
        field6801 = null;
        field6806 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Z")
    public final boolean method2788(int arg0) {
        field6802++;
        if (this.field6803 == null) {
            return false;
        } else {
            if (arg0 > -123) {
                field6806 = null;
            }
            return true;
        }
    }
}
