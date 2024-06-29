import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class25 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    private int field518 = -1;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    private int field527 = 0;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Lcb;")
    private class22 field526 = new class22();

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Z")
    public boolean field532 = false;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    private int field529;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[Lwc;")
    private class201[] field531;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[[[I")
    private int[][][] field520;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lsg;")
    public static class169 field519 = class165.method1060("Benutzen Sie bitte eine andere Welt)3", 1536);

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static volatile int field521 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lob;")
    public static class128 field524;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[[I")
    public final int[][] method177(int arg0, int arg1) {
        if (arg0 != 1193) {
            return null;
        }
        field528++;
        if (this.field529 == this.field522) {
            this.field532 = this.field531[arg1] == null;
            this.field531[arg1] = class129.field2403;
            return this.field520[arg1];
        } else if (this.field529 == 1) {
            this.field532 = this.field518 != arg1;
            this.field518 = arg1;
            return this.field520[0];
        } else {
            class201 var3 = this.field531[arg1];
            if (this.field532 = var3 == null) {
                if (this.field529 > this.field527) {
                    var3 = new class201(arg1, this.field527);
                    this.field527++;
                } else {
                    class201 var4 = (class201) this.field526.method147(arg0 + 4440);
                    var3 = new class201(arg1, var4.field3920);
                    this.field531[var4.field3922] = null;
                    var4.method1213(9104);
                }
                this.field531[arg1] = var3;
            }
            this.field526.method148(var3, true);
            return this.field520[var3.field3920];
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public final void method178(int arg0) {
        field517++;
        for (int var2 = arg0; var2 < this.field529; var2++) {
            this.field520[var2][0] = null;
            this.field520[var2][1] = null;
            this.field520[var2][2] = null;
            this.field520[var2] = null;
        }
        this.field520 = null;
        this.field531 = null;
        this.field526.method155(0);
        this.field526 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method179(byte arg0) {
        field524 = null;
        if (arg0 <= 82) {
            method181(null, 112, (byte) 99, -11);
        }
        field519 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    private static final void method180(int arg0) {
        field523++;
        int var1 = -78 % ((-arg0 - 27) / 43);
        for (int var2 = 0; var2 < class103.field1886; var2++) {
            int var10002 = class158.field3031[var2]--;
            if (class158.field3031[var2] >= -10) {
                class166 var4 = class51.field894[var2];
                if (var4 == null) {
                    var4 = class166.method1066(class62.field1143, class118.field2200[var2], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class158.field3031[var2] += var4.method1065();
                    class51.field894[var2] = var4;
                }
                if (class158.field3031[var2] < 0) {
                    int var5;
                    if (class90.field1640[var2] == 0) {
                        var5 = class32.field676;
                    } else {
                        int var6 = (class90.field1640[var2] & 0xFF) * 128;
                        int var7 = class90.field1640[var2] >> 16 & 0xFF;
                        int var8 = class90.field1640[var2] >> 8 & 0xFF;
                        int var9 = var7 * 128 + 64 - class4.field79.field3698;
                        int var10 = var8 * 128 + 64 - class4.field79.field3679;
                        if (var10 < 0) {
                            var10 = -var10;
                        }
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var11 = var10 + var9 - 128;
                        if (var6 < var11) {
                            class158.field3031[var2] = -100;
                            continue;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        var5 = (var6 - var11) * class20.field435 / var6;
                    }
                    if (var5 > 0) {
                        class83 var12 = var4.method1064().method499(class172.field3319);
                        class108 var13 = class108.method636(var12, 100, var5);
                        var13.method651(class66.field1245[var2] - 1);
                        class175.field3425.method1296(var13);
                    }
                    class158.field3031[var2] = -100;
                }
            } else {
                class103.field1886--;
                for (int var3 = var2; var3 < class103.field1886; var3++) {
                    class118.field2200[var3] = class118.field2200[var3 + 1];
                    class51.field894[var3] = class51.field894[var3 + 1];
                    class66.field1245[var3] = class66.field1245[var3 + 1];
                    class158.field3031[var3] = class158.field3031[var3 + 1];
                    class90.field1640[var3] = class90.field1640[var3 + 1];
                }
                var2--;
            }
        }
        if (class8.field216 && !class93.method544((byte) 76)) {
            if (class137.field2554 != 0 && class114.field2086 != -1) {
                class65.method409(class201.field3923, 0, -20801, false, class137.field2554, class114.field2086);
            }
            class8.field216 = false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lke;IBI)[Lgd;")
    public static final class59[] method181(class95 arg0, int arg1, byte arg2, int arg3) {
        field530++;
        if (arg2 > -61) {
            field524 = null;
        }
        return class174.method1166(arg3, arg1, false, arg0) ? class154.method1010(-25083) : null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public static final void method182(byte arg0) {
        if (class70.field1320 > 0) {
            class70.field1320--;
        }
        field525++;
        if (class105.field1933 > 1) {
            class105.field1933--;
        }
        if (class171.field3308) {
            class171.field3308 = false;
            class132.method863((byte) -128);
            return;
        }
        for (int var1 = 0; var1 < 100 && class195.method1288(-123); var1++) {
        }
        if (class111.field2031 != 30) {
            return;
        }
        class179.method1191(155, (byte) -84, class141.field2621);
        Object var2 = class62.field1150.field1575;
        synchronized (class62.field1150.field1575) {
            if (!class196.field3859) {
                class62.field1150.field1586 = 0;
            } else if (class56.field1040 != 0 || class62.field1150.field1586 >= 40) {
                class135.field2521++;
                class141.field2621.method1024(93, (byte) -94);
                class141.field2621.method821(0, 64);
                int var3 = class141.field2621.field2346;
                int var4 = 0;
                for (int var5 = 0; class62.field1150.field1586 > var5 && class141.field2621.field2346 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class62.field1150.field1589[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var7 = class62.field1150.field1588[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class62.field1150.field1589[var5] == -1 && class62.field1150.field1588[var5] == -1) {
                        var8 = 524287;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class188.field3649 != var7 || class149.field2754 != var6) {
                        int var9 = var7 - class188.field3649;
                        int var10 = var6 - class149.field2754;
                        class188.field3649 = var7;
                        class149.field2754 = var6;
                        if (class60.field1121 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class141.field2621.method801((class60.field1121 << 12) + (var9 << 6) + var10, (byte) 87);
                            class60.field1121 = 0;
                        } else if (class60.field1121 < 8) {
                            class141.field2621.method792((byte) 108, (class60.field1121 << 19) + var8 + 8388608);
                            class60.field1121 = 0;
                        } else {
                            class141.field2621.method802((byte) 64, (class60.field1121 << 19) + var8 - 1073741824);
                            class60.field1121 = 0;
                        }
                    } else if (class60.field1121 < 2047) {
                        class60.field1121++;
                    }
                }
                class141.field2621.method803(class141.field2621.field2346 - var3, arg0 ^ 0xE388E7F6);
                if (var4 >= class62.field1150.field1586) {
                    class62.field1150.field1586 = 0;
                } else {
                    class62.field1150.field1586 -= var4;
                    for (int var11 = 0; var11 < class62.field1150.field1586; var11++) {
                        class62.field1150.field1588[var11] = class62.field1150.field1588[var4 + var11];
                        class62.field1150.field1589[var11] = class62.field1150.field1589[var11 + var4];
                    }
                }
            }
        }
        if (class56.field1040 != 0) {
            class199.field3894++;
            long var12 = (class131.field2433 - class172.field3326) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            int var14 = class178.field3480;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 764) {
                var14 = 764;
            }
            class172.field3326 = class131.field2433;
            byte var15 = 0;
            if (class56.field1040 == 2) {
                var15 = 1;
            }
            int var16 = class42.field796;
            class141.field2621.method1024(110, (byte) -94);
            int var17 = (int) var12;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 502) {
                var16 = 502;
            }
            int var18 = var16 * 765 + var14;
            class141.field2621.method802((byte) 64, (var15 << 19) + (var17 << 20) + var18);
        }
        if (class165.field3158[96] || class165.field3158[97] || class165.field3158[98] || class165.field3158[99]) {
            class191.field3769 = true;
        }
        if (class121.field2224 > 0) {
            class121.field2224--;
        }
        if (class191.field3769 && class121.field2224 <= 0) {
            class29.field601++;
            class121.field2224 = 20;
            class191.field3769 = false;
            class141.field2621.method1024(8, (byte) -94);
            class141.field2621.method801(class29.field600, (byte) 87);
            class141.field2621.method801(class165.field3157, (byte) 87);
        }
        if (class45.field839 && !class95.field1812) {
            class95.field1812 = true;
            class99.field1849++;
            class141.field2621.method1024(255, (byte) -94);
            class141.field2621.method821(1, 64);
        }
        if (!class45.field839 && class95.field1812) {
            class95.field1812 = false;
            class141.field2621.method1024(255, (byte) -94);
            class99.field1849++;
            class141.field2621.method821(0, 64);
        }
        class87.method516(-64);
        if (class111.field2031 != 30) {
            return;
        }
        class3.method24(-1);
        method180(23);
        class46.field853++;
        if (class46.field853 > 750) {
            class132.method863((byte) -128);
            return;
        }
        class90.method527(54);
        class140.method932((byte) 85);
        class141.method936(-113);
        class149.field2756++;
        if (class2.field47 != 0) {
            class107.field1964 += 20;
            if (class107.field1964 >= 400) {
                class2.field47 = 0;
            }
        }
        if (class128.field2398 != null) {
            class95.field1807++;
            if (class95.field1807 >= 15) {
                class64.method404(99, class128.field2398);
                class128.field2398 = null;
            }
        }
        if (class171.field3307 != null) {
            class64.method404(126, class171.field3307);
            class49.field880++;
            if (class22.field459 > class150.field2792 + 5 || class22.field459 < class150.field2792 - 5 || class150.field2806 > class69.field1292 + 5 || class69.field1292 - 5 > class150.field2806) {
                class26.field544 = true;
            }
            if (class32.field684 == 0) {
                if (class26.field544 && class49.field880 >= 5) {
                    if (class171.field3307 == class158.field3019 && class65.field1211 != class141.field2619) {
                        byte var19 = 0;
                        class150 var20 = class171.field3307;
                        if (class67.field1253 == 1 && var20.field2872 == 206) {
                            var19 = 1;
                        }
                        if (var20.field2782[class65.field1211] <= 0) {
                            var19 = 0;
                        }
                        class147.field2706++;
                        if (class89.method523(-79, class70.method436(var20, arg0 + 109))) {
                            int var23 = class141.field2619;
                            int var24 = class65.field1211;
                            var20.field2782[var24] = var20.field2782[var23];
                            var20.field2870[var24] = var20.field2870[var23];
                            var20.field2782[var23] = -1;
                            var20.field2870[var23] = 0;
                        } else if (var19 == 1) {
                            int var21 = class141.field2619;
                            int var22 = class65.field1211;
                            while (var21 != var22) {
                                if (var21 > var22) {
                                    var20.method991(var21 - 1, var21, -75);
                                    var21--;
                                } else if (var21 < var22) {
                                    var20.method991(var21 + 1, var21, 110);
                                    var21++;
                                }
                            }
                        } else {
                            var20.method991(class65.field1211, class141.field2619, -112);
                        }
                        class141.field2621.method1024(252, (byte) -94);
                        class141.field2621.method828((byte) -61, class141.field2619);
                        class141.field2621.method774(93, class171.field3307.field2878);
                        class141.field2621.method828((byte) -61, class65.field1211);
                        class141.field2621.method787(var19, 128);
                    }
                } else if ((class112.field2054 == 1 || class149.method977(class20.field436 - 1, 47)) && class20.field436 > 2) {
                    class91.method534((byte) -91);
                } else if (class20.field436 > 0) {
                    class60.method375((byte) 17, class20.field436 - 1);
                }
                class95.field1807 = 10;
                class171.field3307 = null;
                class56.field1040 = 0;
            }
        }
        class126.field2304 = null;
        class56.field1024 = false;
        class150 var25 = class129.field2419;
        class129.field2419 = null;
        class150 var26 = class9.field236;
        class63.field1169 = false;
        class9.field236 = null;
        for (class32.field679 = 0; class197.method1293(false) && class32.field679 < 128; class32.field679++) {
            class54.field991[class32.field679] = class60.field1119;
            class107.field1961[class32.field679] = class35.field702;
        }
        class125.method768(0, 0, 503, (byte) -88, class106.field1943, 0, 0, 765);
        class58.field1078++;
        while (true) {
            class200 var27;
            class150 var28;
            class150 var29;
            do {
                var27 = (class200) class87.field1601.method150(arg0 ^ 0xFFFFFFE6);
                if (var27 == null) {
                    while (true) {
                        class200 var30;
                        class150 var31;
                        class150 var32;
                        do {
                            var30 = (class200) class199.field3890.method150(arg0 ^ 0xFFFFFFE6);
                            if (var30 == null) {
                                while (true) {
                                    class200 var33;
                                    class150 var34;
                                    class150 var35;
                                    do {
                                        var33 = (class200) class190.field3753.method150(8);
                                        if (var33 == null) {
                                            if (class37.field726 != null) {
                                                class126.method771(-2);
                                            }
                                            if (class133.field2456 != -1) {
                                                int var36 = class133.field2461;
                                                int var37 = class133.field2456;
                                                boolean var38 = class161.method1037(true, -17868, class4.field79.field3734[0], var37, 0, 0, class4.field79.field3729[0], 0, 0, 0, var36, 0);
                                                if (var38) {
                                                    class121.field2229 = class42.field796;
                                                    class65.field1205 = class178.field3480;
                                                    class2.field47 = 1;
                                                    class107.field1964 = 0;
                                                }
                                                class133.field2456 = -1;
                                            }
                                            class143.method948((byte) 84);
                                            if (class129.field2419 != var25) {
                                                if (var25 != null) {
                                                    class64.method404(111, var25);
                                                }
                                                if (class129.field2419 != null) {
                                                    class64.method404(108, class129.field2419);
                                                }
                                            }
                                            if (class9.field236 != var26 && class204.field3991 == class129.field2409) {
                                                if (var26 != null) {
                                                    class64.method404(92, var26);
                                                }
                                                if (class9.field236 != null) {
                                                    class64.method404(arg0 ^ 0xFFFFFFB3, class9.field236);
                                                }
                                            }
                                            if (class9.field236 == null) {
                                                if (class129.field2409 > 0) {
                                                    class129.field2409--;
                                                }
                                            } else if (class204.field3991 > class129.field2409) {
                                                class129.field2409++;
                                                if (class204.field3991 == class129.field2409) {
                                                    class64.method404(119, class9.field236);
                                                }
                                            }
                                            class28.method191(false);
                                            if (arg0 != -18) {
                                                return;
                                            }
                                            if (class17.field406) {
                                                class125.method769(arg0 - 66);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class136.field2540[var39]++;
                                            }
                                            int var40 = class106.method625(arg0 + 20);
                                            int var41 = class120.method751(-26506);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class70.field1320 = 250;
                                                class99.field1859++;
                                                class91.method533(4000, (byte) 37);
                                                class141.field2621.method1024(190, (byte) -94);
                                            }
                                            class137.field2558++;
                                            class192.field3788++;
                                            class164.field3143++;
                                            if (class192.field3788 > 500) {
                                                class192.field3788 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x2) == 2) {
                                                    class6.field115 += class155.field2979;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class171.field3302 += class118.field2194;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class4.field89 += class55.field1012;
                                                }
                                            }
                                            if (class4.field89 < -50) {
                                                class55.field1012 = 2;
                                            }
                                            if (class6.field115 < -55) {
                                                class155.field2979 = 2;
                                            }
                                            if (class6.field115 > 55) {
                                                class155.field2979 = -2;
                                            }
                                            if (class171.field3302 < -40) {
                                                class118.field2194 = 1;
                                            }
                                            if (class164.field3143 > 500) {
                                                class164.field3143 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x2) == 2) {
                                                    class148.field2744 += class6.field134;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class182.field3546 += class162.field3115;
                                                }
                                            }
                                            if (class148.field2744 < -20) {
                                                class6.field134 = 1;
                                            }
                                            if (class171.field3302 > 40) {
                                                class118.field2194 = -1;
                                            }
                                            if (class4.field89 > 50) {
                                                class55.field1012 = -2;
                                            }
                                            if (class148.field2744 > 10) {
                                                class6.field134 = -1;
                                            }
                                            if (class182.field3546 < -60) {
                                                class162.field3115 = 2;
                                            }
                                            if (class182.field3546 > 60) {
                                                class162.field3115 = -2;
                                            }
                                            if (class137.field2558 > 50) {
                                                class169.field3245++;
                                                class141.field2621.method1024(46, (byte) -94);
                                            }
                                            try {
                                                if (class2.field37 != null && class141.field2621.field2346 > 0) {
                                                    class2.field37.method361(0, class141.field2621.field2346, -1, class141.field2621.field2325);
                                                    class137.field2558 = 0;
                                                    class141.field2621.field2346 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class132.method863((byte) -127);
                                                return;
                                            }
                                        }
                                        var34 = var33.field3907;
                                        if (var34.field2850 < 0) {
                                            break;
                                        }
                                        var35 = class62.method385((byte) 41, var34.field2893);
                                    } while (var35 == null || var35.field2784 == null || var34.field2850 >= var35.field2784.length || var35.field2784[var34.field2850] != var34);
                                    class172.method1147(-19955, var33);
                                }
                            }
                            var31 = var30.field3907;
                            if (var31.field2850 < 0) {
                                break;
                            }
                            var32 = class62.method385((byte) 41, var31.field2893);
                        } while (var32 == null || var32.field2784 == null || var32.field2784.length <= var31.field2850 || var32.field2784[var31.field2850] != var31);
                        class172.method1147(-19955, var30);
                    }
                }
                var28 = var27.field3907;
                if (var28.field2850 < 0) {
                    break;
                }
                var29 = class62.method385((byte) 41, var28.field2893);
            } while (var29 == null || var29.field2784 == null || var28.field2850 >= var29.field2784.length || var29.field2784[var28.field2850] != var28);
            class172.method1147(arg0 - 19937, var27);
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(III)V")
    public class25(int arg0, int arg1, int arg2) {
        this.field529 = arg0;
        this.field531 = new class201[arg1];
        this.field520 = new int[arg0][3][arg2];
        this.field522 = arg1;
    }
}
