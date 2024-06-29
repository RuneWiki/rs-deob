import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class187 {

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public int field3000 = 128;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public int field3002 = 128;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public int field2994;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lwm;")
    public static class399 field2998 = new class399(4);

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Ls;")
    public static class186 field3004 = new class186(25, 8);

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Los;")
    public static class309 field3006 = new class309("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)Lkd;")
    public final class187 method1273(boolean arg0) {
        field3005++;
        if (!arg0) {
            method1276((byte) 28);
        }
        return new class187(this.field2995, this.field3000, this.field3002, this.field2994, this.field2997, this.field3001);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lnn;B)V")
    public static final void method1274(class289 arg0, byte arg1) {
        for (int var2 = 0; var2 < class373.field5470; var2++) {
            int var3 = arg0.method1825((byte) -114);
            int var4 = arg0.method1841((byte) -124);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class324.field4933[var3] != null) {
                class324.field4933[var3].field5237 = var4;
            }
        }
        field2999++;
        if (arg1 != -85) {
            field2998 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method1275(int arg0) {
        field2998 = null;
        field3006 = null;
        field3004 = null;
        if (arg0 != 81) {
            method1277(12, -78, -24);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
    public static final void method1276(byte arg0) {
        field3003++;
        if (class483.field7115 > 1) {
            class483.field7115--;
            class509.field7423 = class112.field2032;
        }
        if (class43.field593 > 0) {
            class43.field593--;
        }
        if (class270.field4095) {
            class270.field4095 = false;
            class479.method2856((byte) 114);
            return;
        }
        if (!class76.field1543) {
            class76.method686(arg0 ^ 0x43);
        }
        for (int var1 = 0; var1 < 100 && class435.method2607((byte) 55); var1++) {
        }
        if (class466.field6932 != 9) {
            return;
        }
        class48.method466(-81, class335.field5062, class509.field7416.method1152(10196));
        if (class535.field7859 == null) {
            if (class516.field7485 <= class423.method2578(-19698)) {
                class535.field7859 = class502.field7343.method113(class444.field6606.field3826, 21146);
            }
        } else if (class535.field7859.field1948 != -1) {
            class459.method2765(class155.field2524, (byte) 87);
            class335.field5062.method1865(class535.field7859.field1948, arg0 + 812856229);
            class535.field7859 = null;
            class516.field7485 = class423.method2578(arg0 ^ 0xFFFFB34D) + 30000L;
        }
        class356 var2 = (class356) class293.field4478.method1892(arg0 ^ 0x28);
        if (var2 != null || class423.method2578(-19698) - 2000L > client.field3218) {
            boolean var3 = false;
            int var4 = class335.field5062.field4399;
            for (class356 var5 = (class356) class79.field1575.method1892(114); var5 != null && (class335.field5062.field4399 - var4) < 240; var5 = (class356) class79.field1575.method1893((byte) -2)) {
                var5.method1676(true);
                int var6 = var5.method54(false);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method52(arg0 ^ 0xFFFFFF87);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method54(false) == -1 && var5.method52(-102) == -1) {
                    var8 = true;
                    var6 = -1;
                    var7 = -1;
                }
                if (class185.field2979 != var7 || class280.field4231 != var6) {
                    if (!var3) {
                        class496.field7284++;
                        class459.method2765(class103.field1954, (byte) 87);
                        class335.field5062.method1814(0, true);
                        var3 = true;
                        var4 = class335.field5062.field4399;
                    }
                    int var9 = var7 - class185.field2979;
                    class185.field2979 = var7;
                    int var10 = var6 - class280.field4231;
                    class280.field4231 = var6;
                    int var11 = (int) ((var5.method53(877163852) - client.field3218) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var9 += 32;
                        var10 += 32;
                        class335.field5062.method1865((var9 << 6) + (var11 << 12) + var10, 812856296);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var10 += 128;
                        class335.field5062.method1814(var11 + 128, true);
                        var9 += 128;
                        class335.field5062.method1865((var9 << 8) + var10, 812856296);
                    } else if (var11 >= 32) {
                        class335.field5062.method1865(var11 + 57344, arg0 ^ 0x307333AB);
                        if (var8) {
                            class335.field5062.method1862((byte) -115, Integer.MIN_VALUE);
                        } else {
                            class335.field5062.method1862((byte) -115, var6 << 16 | var7);
                        }
                    } else {
                        class335.field5062.method1814(var11 + 192, true);
                        if (var8) {
                            class335.field5062.method1862((byte) -115, Integer.MIN_VALUE);
                        } else {
                            class335.field5062.method1862((byte) -115, var7 | var6 << 16);
                        }
                    }
                    client.field3218 = var5.method53(877163852);
                }
            }
            if (var3) {
                class335.field5062.method1828(false, class335.field5062.field4399 - var4);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method53(877163852) - class500.field7335) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class500.field7335 = var2.method53(877163852);
            int var14 = var2.method54(false);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method52(arg0 ^ 0xFFFFFF80);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method50(arg0 ^ 0x4B) == 2) {
                var16 = 1;
            }
            class459.method2765(class438.field6510, (byte) 87);
            int var17 = (int) var12;
            class416.field6271++;
            class335.field5062.method1879(var15 | var14 << 16, arg0 - 329997075);
            class335.field5062.method1875((byte) 42, var17 | var16 << 15);
        }
        if (class76.field1540 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class76.field1540; var19++) {
                if (class137.field2300[var19].method1920(4096)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                if (var18 > 75) {
                    var18 = 75;
                }
                class75.field1535++;
                class459.method2765(class211.field3374, (byte) 87);
                class335.field5062.method1814(var18 * 3, true);
                for (int var20 = 0; var20 < class76.field1540; var20++) {
                    class477 var21 = class137.field2300[var20];
                    if (var21.method1920(4096)) {
                        long var22 = (var21.method1919(0) - class151.field2491) / 50L;
                        class151.field2491 = var21.method1919(arg0 - 67);
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class335.field5062.method1814(var21.method1923(false), true);
                        class335.field5062.method1865((int) var22, 812856296);
                    }
                }
            }
        }
        if (class216.field3416 > 0) {
            class216.field3416--;
        }
        if (class23.field339 && class216.field3416 <= 0) {
            class23.field339 = false;
            class471.field6988++;
            class216.field3416 = 20;
            class459.method2765(class439.field6513, (byte) 87);
            class335.field5062.method1853((int) class113.field2041 >> 3, 72);
            class335.field5062.method1875((byte) 25, (int) class525.field7631 >> 3);
        }
        if (class97.field1896 && !class327.field4948) {
            class284.field4278++;
            class327.field4948 = true;
            class459.method2765(class441.field6557, (byte) 87);
            class335.field5062.method1814(1, true);
        }
        if (!class97.field1896 && class327.field4948) {
            class327.field4948 = false;
            class284.field4278++;
            class459.method2765(class441.field6557, (byte) 87);
            class335.field5062.method1814(0, true);
        }
        if (!class1.field46) {
            class82.field1723++;
            class459.method2765(class273.field4147, (byte) 87);
            class335.field5062.method1814(0, true);
            int var24 = class335.field5062.field4399;
            class289 var25 = class186.field2990.method1782(arg0 - 66);
            class335.field5062.method1813(var25.field4399, 0, var25.field4408, 9262);
            class335.field5062.method1828(false, class335.field5062.field4399 - var24);
            class1.field46 = true;
        }
        if (class518.field7511 != null) {
            if (class510.field7435 == 2) {
                class87.method803(-26657);
            } else if (class510.field7435 == 3) {
                class78.method699(-65536);
            }
        }
        if (class285.field4285) {
            class285.field4285 = false;
        } else {
            class301.field4539 /= 2.0F;
        }
        if (class207.field3321) {
            class207.field3321 = false;
        } else {
            class435.field6475 /= 2.0F;
        }
        class440.method2622(true);
        if (class466.field6932 != 9) {
            return;
        }
        class119.method965(arg0 + 3376);
        class308.method1973(true);
        class485.method2905((byte) 39);
        class88.method807(arg0 ^ 0x7FC3);
        class255.field3906++;
        if (class255.field3906 > 750) {
            class479.method2856((byte) -45);
            return;
        }
        class206.method1412(-1487);
        class421.method2574(-126);
        class260.method1669(-106);
        for (int var26 = class402.field6080.method94(true, true); var26 != -1; var26 = class402.field6080.method94(false, true)) {
            class133.method1016(var26, (byte) -103);
            class246.field3796[class490.method2960(class46.field969++, 31)] = var26;
        }
        for (class18 var27 = class354.method2189(100); var27 != null; var27 = class354.method2189(100)) {
            int var28 = var27.method116(false);
            int var29 = var27.method119(93);
            if (var28 == 1) {
                class81.field1675[var29] = var27.field283;
                class166.field2690 |= class68.field1377[var29];
                class533.field7747[class490.method2960(class448.field6671++, 31)] = var29;
            } else if (var28 == 2) {
                class77.field1555[var29] = var27.field301;
                class80.field1599[class490.method2960(31, class202.field3261++)] = var29;
            } else if (var28 == 3) {
                class388 var30 = class271.method1716(27411, var29);
                if (!var27.field301.equals(var30.field5725)) {
                    var30.field5725 = var27.field301;
                    class429.method2587(var30, (byte) -63);
                }
            } else if (var28 == 4) {
                class388 var48 = class271.method1716(27411, var29);
                int var49 = var27.field283;
                int var50 = var27.field291;
                int var51 = var27.field284;
                if (var48.field5785 != var49 || var48.field5794 != var50 || var48.field5779 != var51) {
                    var48.field5785 = var49;
                    var48.field5794 = var50;
                    var48.field5779 = var51;
                    class429.method2587(var48, (byte) -63);
                }
            } else if (var28 == 5) {
                class388 var31 = class271.method1716(27411, var29);
                if (var27.field283 != var31.field5737 || var27.field283 == -1) {
                    var31.field5737 = var27.field283;
                    var31.field5678 = 1;
                    var31.field5672 = 0;
                    var31.field5747 = 0;
                    class429.method2587(var31, (byte) -63);
                }
            } else if (var28 == 6) {
                int var42 = var27.field283;
                int var43 = (var42 & 0x7FF0) >> 10;
                int var44 = (var42 & 0x3E7) >> 5;
                int var45 = var42 & 0x1F;
                int var46 = (var45 << 3) + (var43 << 19) + (var44 << 11);
                class388 var47 = class271.method1716(arg0 ^ 0x6B50, var29);
                if (var47.field5674 != var46) {
                    var47.field5674 = var46;
                    class429.method2587(var47, (byte) -63);
                }
            } else if (var28 == 7) {
                class388 var32 = class271.method1716(27411, var29);
                boolean var33 = var27.field283 == 1;
                if (var32.field5736 != var33) {
                    var32.field5736 = var33;
                    class429.method2587(var32, (byte) -63);
                }
            } else if (var28 == 8) {
                class388 var41 = class271.method1716(27411, var29);
                if (var27.field283 != var41.field5675 || var27.field291 != var41.field5716 || var27.field284 != var41.field5719) {
                    var41.field5716 = var27.field291;
                    var41.field5675 = var27.field283;
                    var41.field5719 = var27.field284;
                    if (var41.field5688 != -1) {
                        if (var41.field5751 > 0) {
                            var41.field5719 = var41.field5719 * 32 / var41.field5751;
                        } else if (var41.field5820 > 0) {
                            var41.field5719 = var41.field5719 * 32 / var41.field5820;
                        }
                    }
                    class429.method2587(var41, (byte) -63);
                }
            } else if (var28 == 9) {
                class388 var40 = class271.method1716(27411, var29);
                if (var27.field283 != var40.field5688 || var27.field291 != var40.field5776) {
                    var40.field5776 = var27.field291;
                    var40.field5688 = var27.field283;
                    class429.method2587(var40, (byte) -63);
                }
            } else if (var28 == 10) {
                class388 var39 = class271.method1716(27411, var29);
                if (var27.field283 != var39.field5684 || var27.field291 != var39.field5708 || var27.field284 != var39.field5696) {
                    var39.field5696 = var27.field284;
                    var39.field5684 = var27.field283;
                    var39.field5708 = var27.field291;
                    class429.method2587(var39, (byte) -63);
                }
            } else if (var28 == 11) {
                class388 var34 = class271.method1716(27411, var29);
                var34.field5789 = 0;
                var34.field5701 = var34.field5757 = var27.field283;
                var34.field5710 = 0;
                var34.field5778 = var34.field5726 = var27.field291;
                class429.method2587(var34, (byte) -63);
            } else if (var28 == 12) {
                class388 var37 = class271.method1716(27411, var29);
                int var38 = var27.field283;
                if (var37 != null && var37.field5784 == 0) {
                    if (var38 > var37.field5758 - var37.field5712) {
                        var38 = var37.field5758 - var37.field5712;
                    }
                    if (var38 < 0) {
                        var38 = 0;
                    }
                    if (var37.field5740 != var38) {
                        var37.field5740 = var38;
                        class429.method2587(var37, (byte) -63);
                    }
                }
            } else if (var28 == 14) {
                class388 var35 = class271.method1716(27411, var29);
                var35.field5795 = var27.field283;
            } else if (var28 == 15) {
                class127.field2172 = var27.field283;
                class471.field6986 = true;
                class205.field3284 = var27.field291;
            } else if (var28 == 16) {
                class388 var36 = class271.method1716(27411, var29);
                var36.field5689 = var27.field283;
            }
        }
        class5.field97++;
        if (class61.field1262 != 0) {
            class108.field1991 += 20;
            if (class108.field1991 >= 400) {
                class61.field1262 = 0;
            }
        }
        if (class237.field3645 != null) {
            class220.field3453++;
            if (class220.field3453 >= 15) {
                class429.method2587(class237.field3645, (byte) -63);
                class237.field3645 = null;
            }
        }
        class235.field3629 = null;
        class488.field7186 = false;
        class67.field1371 = null;
        class208.field3329 = false;
        class208.method1427(-1, 29000, -1, null);
        class360.method2215(-1, null, -1, (byte) -42);
        if (!class233.field3597) {
            class271.field4116 = -1;
        }
        class475.method2841(arg0 - 166);
        class112.field2032++;
        if (class368.field5393) {
            class459.method2765(class134.field2253, (byte) 87);
            class124.field2146++;
            class335.field5062.method1862((byte) -115, class442.field6559 | class308.field4680 << 14 | class447.field6661 << 28);
            class368.field5393 = false;
        }
        while (true) {
            class322 var52;
            class388 var53;
            class388 var54;
            do {
                var52 = (class322) class260.field3968.method1894((byte) -70);
                if (var52 == null) {
                    while (true) {
                        class322 var55;
                        class388 var56;
                        class388 var57;
                        do {
                            var55 = (class322) class177.field2863.method1894((byte) -97);
                            if (var55 == null) {
                                while (true) {
                                    class322 var58;
                                    class388 var59;
                                    class388 var60;
                                    do {
                                        var58 = (class322) class212.field3376.method1894((byte) -71);
                                        if (var58 == null) {
                                            if (class67.field1371 == null) {
                                                class218.field3435 = 0;
                                            }
                                            if (class253.field3885 != null) {
                                                class292.method1903((byte) 116);
                                            }
                                            if (class239.field3706 > 0 && class179.field2912.method1458(100, 82) && class179.field2912.method1458(100, 81) && class80.field1592 != 0) {
                                                int var61 = class15.field266.field6084 - class80.field1592;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class127.method1001(class15.field266.field7870[0] + class212.field3378, class496.field7292 - -class15.field266.field7866[0], 63, var61);
                                            }
                                            class452.method2698(true);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class447.field6648[var62]++;
                                            }
                                            if (class166.field2690 && class423.method2578(-19698) - 60000L > class404.field6098) {
                                                class177.method1213(arg0 ^ 0x42);
                                            }
                                            for (class257 var63 = (class257) class441.field6536.method533((byte) -61); var63 != null; var63 = (class257) class441.field6536.method536(87)) {
                                                if (((long) var63.field3941) < (class423.method2578(arg0 ^ -19635) / 1000L - 5L)) {
                                                    if (var63.field3943 > 0) {
                                                        class492.method2969("", 0, var63.field3938 + class20.field317.method1977(class146.field2452, -61), "", arg0 - 67, 5);
                                                    }
                                                    if (var63.field3943 == 0) {
                                                        class492.method2969("", 0, var63.field3938 + class204.field3271.method1977(class146.field2452, -118), "", 0, 5);
                                                    }
                                                    var63.method2352((byte) 102);
                                                }
                                            }
                                            class460.field6853++;
                                            if (class460.field6853 > 500) {
                                                class460.field6853 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x1) == 1) {
                                                    class407.field6171 += class249.field3847;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class243.field3765 += class316.field4798;
                                                }
                                                if ((var64 & 0x4) == 4) {
                                                    class496.field7276 += class69.field1393;
                                                }
                                            }
                                            if (class407.field6171 < -50) {
                                                class249.field3847 = 2;
                                            }
                                            if (class243.field3765 < -55) {
                                                class316.field4798 = 2;
                                            }
                                            if (class407.field6171 > 50) {
                                                class249.field3847 = -2;
                                            }
                                            if (class243.field3765 > 55) {
                                                class316.field4798 = -2;
                                            }
                                            if (class496.field7276 < -40) {
                                                class69.field1393 = 1;
                                            }
                                            if (class496.field7276 > 40) {
                                                class69.field1393 = -1;
                                            }
                                            class63.field1294++;
                                            if (class63.field1294 > 500) {
                                                class63.field1294 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class1.field49 += class35.field541;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class60.field1242 += class471.field6991;
                                                }
                                            }
                                            if (class1.field49 < -60) {
                                                class35.field541 = 2;
                                            }
                                            if (class60.field1242 < -20) {
                                                class471.field6991 = 1;
                                            }
                                            if (arg0 != 67) {
                                                method1275(-18);
                                            }
                                            if (class1.field49 > 60) {
                                                class35.field541 = -2;
                                            }
                                            class322.field4919++;
                                            if (class60.field1242 > 10) {
                                                class471.field6991 = -1;
                                            }
                                            if (class322.field4919 > 50) {
                                                class459.method2765(class317.field4802, (byte) 87);
                                                class327.field4965++;
                                            }
                                            if (class238.field3678) {
                                                class171.method1193(arg0 ^ 0xA);
                                                class238.field3678 = false;
                                            }
                                            try {
                                                if (class216.field3417 != null && class335.field5062.field4399 > 0) {
                                                    class433.field6445 += class335.field5062.field4399;
                                                    class216.field3417.method2329(0, class335.field5062.field4399, 3, class335.field5062.field4408);
                                                    class335.field5062.field4399 = 0;
                                                    class322.field4919 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class479.method2856((byte) 102);
                                                return;
                                            }
                                        }
                                        var59 = var58.field4918;
                                        if (var59.field5777 < 0) {
                                            break;
                                        }
                                        var60 = class271.method1716(27411, var59.field5728);
                                    } while (var60 == null || var60.field5819 == null || var60.field5819.length <= var59.field5777 || var60.field5819[var59.field5777] != var59);
                                    class495.method2982(var58);
                                }
                            }
                            var56 = var55.field4918;
                            if (var56.field5777 < 0) {
                                break;
                            }
                            var57 = class271.method1716(27411, var56.field5728);
                        } while (var57 == null || var57.field5819 == null || var57.field5819.length <= var56.field5777 || var57.field5819[var56.field5777] != var56);
                        class495.method2982(var55);
                    }
                }
                var53 = var52.field4918;
                if (var53.field5777 < 0) {
                    break;
                }
                var54 = class271.method1716(27411, var53.field5728);
            } while (var54 == null || var54.field5819 == null || var54.field5819.length <= var53.field5777 || var54.field5819[var53.field5777] != var53);
            class495.method2982(var52);
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
    public class187(int arg0) {
        this.field2995 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
    public static final void method1277(int arg0, int arg1, int arg2) {
        if (arg2 != -3816) {
            method1275(-47);
        }
        field3007++;
        if (class1.method16(arg0, 1465669104)) {
            class286.method1797((byte) -128, class419.field6326[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILkd;)V")
    public final void method1278(int arg0, class187 arg1) {
        this.field2995 = arg1.field2995;
        field2996++;
        this.field3001 = arg1.field3001;
        this.field3002 = arg1.field3002;
        this.field2994 = arg1.field2994;
        if (arg0 != -2) {
            this.method1273(true);
        }
        this.field3000 = arg1.field3000;
        this.field2997 = arg1.field2997;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIII)V")
    private class187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2997 = arg4;
        this.field3001 = arg5;
        this.field3002 = arg2;
        this.field2994 = arg3;
        this.field3000 = arg1;
        this.field2995 = arg0;
    }
}
