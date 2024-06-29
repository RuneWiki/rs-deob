import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lrd;")
    private static class117 field953 = class95.method812("Members object", (byte) 8);

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static volatile int field958 = 0;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field947 = 0;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field955 = 0;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Lrd;")
    private static class117 field966 = class95.method812("::noclip", (byte) 8);

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Lrd;")
    public static class117 field971 = field953;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lrd;")
    private static class117 field952 = class95.method812("Offline", (byte) 8);

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "[[B")
    public static byte[][] field972 = new byte[50][];

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "Z")
    public static boolean field969 = false;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Lrd;")
    public static class117 field964 = field952;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lmb;")
    public static class85 field951 = new class85(64);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    private int field949;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "J")
    private long field945;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "J")
    private long field973;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lge;")
    public static class47 field944;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Z")
    public boolean field948;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    private int[] field946;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "[I")
    private int[] field963;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static final void method369(int arg0) {
        field959++;
        while (true) {
            label391: do {
                while (class144.method1148(-29057)) {
                    if (class121.field2977 != -1 && class135.field3224 == class121.field2977) {
                        if (class94.field2351 == 85 && class134.field3202.method954(90) > 0) {
                            class134.field3202 = class134.field3202.method963(class134.field3202.method954(-34) - 1, 0, (byte) -127);
                        }
                        continue label391;
                    }
                    if (class36.field1058) {
                        if (class94.field2351 == 85 && class134.field3216.method954(-106) > 0) {
                            class134.field3216 = class134.field3216.method963(class134.field3216.method954(88) - 1, 0, (byte) -127);
                            class18.field458 = true;
                        }
                        if (class33.method391((byte) 117, class147.field3601) && class134.field3216.method954(-58) < 80) {
                            class134.field3216 = class134.field3216.method961(class147.field3601, true);
                            class18.field458 = true;
                        }
                        if (class94.field2351 == 84) {
                            class18.field458 = true;
                            class36.field1058 = false;
                            if (class57.field1584 == 1) {
                                long var10 = class134.field3216.method966(74);
                                class108.method889(var10, 1);
                            }
                            if (class57.field1584 == 2 && class5.field119 > 0) {
                                long var12 = class134.field3216.method966(51);
                                class43.method480(false, var12);
                            }
                            if (class57.field1584 == 3 && class134.field3216.method954(arg0 ^ 0xFFFFFF8C) > 0) {
                                class25.field754.method739(false, 157);
                                class25.field754.method162(0, -23339);
                                int var14 = class25.field754.field314;
                                class17.field408++;
                                class25.field754.method163(-26, class16.field381);
                                class148.method1193(class134.field3216, 0, class25.field754);
                                class25.field754.method148((byte) -69, class25.field754.field314 - var14);
                                if (class42.field1202 == 2) {
                                    class115.field2812 = true;
                                    class42.field1202 = 1;
                                    class25.field754.method739(false, 51);
                                    class25.field754.method162(class18.field462, -23339);
                                    class25.field754.method162(class42.field1202, -23339);
                                    class71.field1976++;
                                    class25.field754.method162(class77.field2095, arg0 ^ 0x5B3E);
                                }
                            }
                            if (class57.field1584 == 4 && class109.field2739 < 100) {
                                long var15 = class134.field3216.method966(88);
                                class49.method542(var15, 0);
                            }
                            if (class57.field1584 == 5 && class109.field2739 > 0) {
                                long var17 = class134.field3216.method966(arg0 + 79);
                                class53.method581(arg0 ^ 0xFFFFFF90, var17);
                            }
                        }
                    } else if (class80.field2142 == 1) {
                        if (class94.field2351 == 85 && class134.field3209.method954(-96) > 0) {
                            class134.field3209 = class134.field3209.method963(class134.field3209.method954(107) - 1, 0, (byte) -127);
                            class18.field458 = true;
                        }
                        if (class58.method603(false, class147.field3601) && class134.field3209.method954(98) < 10) {
                            class134.field3209 = class134.field3209.method961(class147.field3601, true);
                            class18.field458 = true;
                        }
                        if (class94.field2351 == 84) {
                            if (class134.field3209.method954(99) > 0) {
                                class40.field1147++;
                                int var1 = 0;
                                if (class134.field3209.method950(arg0 + 16046)) {
                                    var1 = class134.field3209.method939((byte) 21);
                                }
                                class25.field754.method739(false, 144);
                                class25.field754.method124(var1, 0);
                            }
                            class18.field458 = true;
                            class80.field2142 = 0;
                        }
                    } else if (class80.field2142 == 2) {
                        if (class94.field2351 == 85 && class134.field3209.method954(-54) > 0) {
                            class134.field3209 = class134.field3209.method963(class134.field3209.method954(-73) - 1, 0, (byte) -127);
                            class18.field458 = true;
                        }
                        if ((class117.method955((byte) 122, class147.field3601) || class147.field3601 == 32) && class134.field3209.method954(90) < 12) {
                            class134.field3209 = class134.field3209.method961(class147.field3601, true);
                            class18.field458 = true;
                        }
                        if (class94.field2351 == 84) {
                            if (class134.field3209.method954(-33) > 0) {
                                class109.field2714++;
                                class25.field754.method739(false, 143);
                                class25.field754.method163(-74, class134.field3209.method966(arg0 + 82));
                            }
                            class80.field2142 = 0;
                            class18.field458 = true;
                        }
                    } else if (class80.field2142 == 3) {
                        if (class94.field2351 == 85 && class134.field3209.method954(arg0 ^ 0xFFFFFFBA) > 0) {
                            class134.field3209 = class134.field3209.method963(class134.field3209.method954(-114) - 1, 0, (byte) -127);
                            class18.field458 = true;
                        }
                        if (class33.method391((byte) 124, class147.field3601) && class134.field3209.method954(-69) < 40) {
                            class134.field3209 = class134.field3209.method961(class147.field3601, true);
                            class18.field458 = true;
                        }
                    } else if (class80.field2142 == 4) {
                        if (class94.field2351 == 85 && class134.field3209.method954(117) > 0) {
                            class134.field3209 = class134.field3209.method963(class134.field3209.method954(124) - 1, 0, (byte) -127);
                            class18.field458 = true;
                        }
                        if ((class33.method391((byte) 120, class147.field3601) || class147.field3601 == 32) && class134.field3209.method954(arg0 ^ 0x2D) < 80) {
                            class134.field3209 = class134.field3209.method961(class147.field3601, true);
                            class18.field458 = true;
                        }
                        if (class94.field2351 == 84) {
                            if (class134.field3209.method954(-48) > 0) {
                                class25.field754.method739(false, 173);
                                class124.field2992++;
                                class25.field754.method162(class134.field3209.method954(96) + 1, -23339);
                                class25.field754.method147(arg0 ^ 0x60, class134.field3209);
                            }
                            class80.field2142 = 0;
                            class18.field458 = true;
                        }
                    } else if (class56.field1553 == -1 && class17.field428 == -1) {
                        if (class148.field3633 != 0 || class24.field676 > 1) {
                            class53.method578(-19817);
                        }
                        if (class94.field2351 == 85 && class134.field3199.method954(arg0 + 108) > 0) {
                            class134.field3199 = class134.field3199.method963(class134.field3199.method954(95) - 1, 0, (byte) -127);
                            class18.field458 = true;
                        }
                        if (class33.method391((byte) 120, class147.field3601) && class134.field3199.method954(-67) < 80) {
                            class134.field3199 = class134.field3199.method961(class147.field3601, true);
                            class18.field458 = true;
                        }
                        if (class94.field2351 == 84 && class134.field3199.method954(arg0 ^ 0xFFFFFFA7) > 0) {
                            if (class148.field3633 != 0 || class24.field676 > 1) {
                                class136.field3274[class53.field1494++] = class134.field3199;
                                class102.field2576 = -1;
                                if (class53.field1494 >= 20) {
                                    class53.field1494 = 0;
                                }
                            }
                            if (class24.field676 == 2) {
                                if (class134.field3199.method962(class7.field169, true)) {
                                    System.gc();
                                }
                                if (class134.field3199.method962(class127.field3030, true)) {
                                    class100.method850(112);
                                }
                                if (class134.field3199.method962(class6.field149, true)) {
                                    field969 = true;
                                }
                                if (class134.field3199.method962(class68.field1929, true)) {
                                    field969 = false;
                                }
                                if (class134.field3199.method962(field966, true)) {
                                    for (int var2 = 0; var2 < 4; var2++) {
                                        for (int var3 = 1; var3 < 103; var3++) {
                                            for (int var4 = 1; var4 < 103; var4++) {
                                                class18.field461[var2].field1455[var3][var4] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class134.field3199.method962(class101.field2524, true) && class148.field3633 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class134.field3199.method962(class39.field1127, true)) {
                                    class73.field2037 = true;
                                }
                            }
                            if (class134.field3199.method946((byte) 83, class67.field1883)) {
                                class25.field754.method739(false, 45);
                                class25.field754.method162(class134.field3199.method954(arg0 ^ 0x4A) - 1, -23339);
                                class87.field2266++;
                                class25.field754.method147(-84, class134.field3199.method949(2, arg0 ^ -21));
                            } else {
                                byte var5 = 0;
                                class33.field985++;
                                byte var6 = 0;
                                class117 var7 = class134.field3199.method972(120);
                                if (var7.method946((byte) 83, class41.field1186)) {
                                    class134.field3199 = class134.field3199.method949(class41.field1186.method954(78), arg0 ^ 0xFFFFFFEB);
                                    var5 = 0;
                                } else if (var7.method946((byte) 83, class63.field1801)) {
                                    var5 = 1;
                                    class134.field3199 = class134.field3199.method949(class63.field1801.method954(-75), 0);
                                } else if (var7.method946((byte) 83, class96.field2415)) {
                                    class134.field3199 = class134.field3199.method949(class96.field2415.method954(-33), 0);
                                    var5 = 2;
                                } else if (var7.method946((byte) 83, class56.field1568)) {
                                    var5 = 3;
                                    class134.field3199 = class134.field3199.method949(class56.field1568.method954(92), arg0 ^ 0xFFFFFFEB);
                                } else if (var7.method946((byte) 83, class27.field797)) {
                                    class134.field3199 = class134.field3199.method949(class27.field797.method954(-61), 0);
                                    var5 = 4;
                                } else if (var7.method946((byte) 83, class71.field1987)) {
                                    class134.field3199 = class134.field3199.method949(class71.field1987.method954(110), 0);
                                    var5 = 5;
                                } else if (var7.method946((byte) 83, class94.field2358)) {
                                    class134.field3199 = class134.field3199.method949(class94.field2358.method954(arg0 ^ 0x29), 0);
                                    var5 = 6;
                                } else if (var7.method946((byte) 83, class109.field2715)) {
                                    class134.field3199 = class134.field3199.method949(class109.field2715.method954(-73), 0);
                                    var5 = 7;
                                } else if (var7.method946((byte) 83, class67.field1888)) {
                                    var5 = 8;
                                    class134.field3199 = class134.field3199.method949(class67.field1888.method954(-37), 0);
                                } else if (var7.method946((byte) 83, class13.field250)) {
                                    class134.field3199 = class134.field3199.method949(class13.field250.method954(66), arg0 ^ 0xFFFFFFEB);
                                    var5 = 9;
                                } else if (var7.method946((byte) 83, class40.field1167)) {
                                    var5 = 10;
                                    class134.field3199 = class134.field3199.method949(class40.field1167.method954(-43), 0);
                                } else if (var7.method946((byte) 83, class46.field1313)) {
                                    var5 = 11;
                                    class134.field3199 = class134.field3199.method949(class46.field1313.method954(-38), arg0 ^ 0xFFFFFFEB);
                                } else if (class72.field2022 != 0) {
                                    if (var7.method946((byte) 83, class41.field1193)) {
                                        class134.field3199 = class134.field3199.method949(class41.field1193.method954(-124), 0);
                                        var5 = 0;
                                    } else if (var7.method946((byte) 83, class63.field1796)) {
                                        class134.field3199 = class134.field3199.method949(class63.field1796.method954(108), 0);
                                        var5 = 1;
                                    } else if (var7.method946((byte) 83, class96.field2398)) {
                                        var5 = 2;
                                        class134.field3199 = class134.field3199.method949(class96.field2398.method954(-122), 0);
                                    } else if (var7.method946((byte) 83, class56.field1571)) {
                                        class134.field3199 = class134.field3199.method949(class56.field1571.method954(-81), arg0 ^ 0xFFFFFFEB);
                                        var5 = 3;
                                    } else if (var7.method946((byte) 83, class27.field811)) {
                                        class134.field3199 = class134.field3199.method949(class27.field811.method954(126), 0);
                                        var5 = 4;
                                    } else if (var7.method946((byte) 83, class71.field1982)) {
                                        var5 = 5;
                                        class134.field3199 = class134.field3199.method949(class71.field1982.method954(arg0 ^ 0xFFFFFF98), arg0 + 21);
                                    } else if (var7.method946((byte) 83, class94.field2356)) {
                                        class134.field3199 = class134.field3199.method949(class94.field2356.method954(102), 0);
                                        var5 = 6;
                                    } else if (var7.method946((byte) 83, class109.field2729)) {
                                        class134.field3199 = class134.field3199.method949(class109.field2729.method954(arg0 - 30), 0);
                                        var5 = 7;
                                    } else if (var7.method946((byte) 83, class67.field1884)) {
                                        var5 = 8;
                                        class134.field3199 = class134.field3199.method949(class67.field1884.method954(-72), 0);
                                    } else if (var7.method946((byte) 83, class13.field260)) {
                                        class134.field3199 = class134.field3199.method949(class13.field260.method954(-92), 0);
                                        var5 = 9;
                                    } else if (var7.method946((byte) 83, class40.field1166)) {
                                        var5 = 10;
                                        class134.field3199 = class134.field3199.method949(class40.field1166.method954(arg0 - 13), 0);
                                    } else if (var7.method946((byte) 83, class46.field1293)) {
                                        class134.field3199 = class134.field3199.method949(class46.field1293.method954(-67), 0);
                                        var5 = 11;
                                    }
                                }
                                class117 var8 = class134.field3199.method972(-41);
                                if (var8.method946((byte) 83, class7.field179)) {
                                    var6 = 1;
                                    class134.field3199 = class134.field3199.method949(class7.field179.method954(-41), 0);
                                } else if (var8.method946((byte) 83, class101.field2545)) {
                                    var6 = 2;
                                    class134.field3199 = class134.field3199.method949(class101.field2545.method954(111), 0);
                                } else if (var8.method946((byte) 83, class16.field374)) {
                                    var6 = 3;
                                    class134.field3199 = class134.field3199.method949(class16.field374.method954(arg0 ^ 0xFFFFFF94), arg0 + 21);
                                } else if (var8.method946((byte) 83, class2.field30)) {
                                    var6 = 4;
                                    class134.field3199 = class134.field3199.method949(class2.field30.method954(121), 0);
                                } else if (var8.method946((byte) 83, class2.field49)) {
                                    var6 = 5;
                                    class134.field3199 = class134.field3199.method949(class2.field49.method954(arg0 ^ 0x23), 0);
                                } else if (class72.field2022 != 0) {
                                    if (var8.method946((byte) 83, class7.field177)) {
                                        var6 = 1;
                                        class134.field3199 = class134.field3199.method949(class7.field177.method954(arg0 ^ 0xFFFFFF94), 0);
                                    } else if (var8.method946((byte) 83, class101.field2543)) {
                                        class134.field3199 = class134.field3199.method949(class101.field2543.method954(arg0 ^ 0x66), arg0 ^ 0xFFFFFFEB);
                                        var6 = 2;
                                    } else if (var8.method946((byte) 83, class16.field371)) {
                                        var6 = 3;
                                        class134.field3199 = class134.field3199.method949(class16.field371.method954(88), 0);
                                    } else if (var8.method946((byte) 83, class2.field38)) {
                                        class134.field3199 = class134.field3199.method949(class2.field38.method954(-61), 0);
                                        var6 = 4;
                                    } else if (var8.method946((byte) 83, class2.field32)) {
                                        class134.field3199 = class134.field3199.method949(class2.field32.method954(-65), arg0 + 21);
                                        var6 = 5;
                                    }
                                }
                                class25.field754.method739(false, 136);
                                class25.field754.method162(0, -23339);
                                int var9 = class25.field754.field314;
                                class25.field754.method162(var5, -23339);
                                class25.field754.method162(var6, arg0 - 23318);
                                class148.method1193(class134.field3199, 0, class25.field754);
                                class25.field754.method148((byte) -127, class25.field754.field314 - var9);
                                if (class18.field462 == 2) {
                                    class18.field462 = 3;
                                    class71.field1976++;
                                    class115.field2812 = true;
                                    class25.field754.method739(false, 51);
                                    class25.field754.method162(class18.field462, -23339);
                                    class25.field754.method162(class42.field1202, -23339);
                                    class25.field754.method162(class77.field2095, -23339);
                                }
                            }
                            class18.field458 = true;
                            class134.field3199 = class134.field3215;
                        }
                    }
                }
                if (arg0 != -21) {
                    field952 = null;
                    return;
                }
                return;
            } while (!class117.method955((byte) 102, class147.field3601) && class147.field3601 != 32);
            if (class134.field3202.method954(arg0 ^ 0x31) < 12) {
                class134.field3202 = class134.field3202.method961(class147.field3601, true);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILgd;Lgd;I)Ldf;")
    public final class28 method370(byte arg0, int arg1, class46 arg2, class46 arg3, int arg4) {
        field957++;
        if (this.field949 != -1) {
            return class45.method492(this.field949, (byte) 52).method189(25071, arg1, arg3, arg2, arg4);
        }
        long var6 = this.field945;
        int[] var8 = this.field946;
        if (arg2 != null && (arg2.field1312 >= 0 || arg2.field1288 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field946[var9];
            }
            if (arg2.field1312 >= 0) {
                var6 += arg2.field1312 - this.field946[5] << 8;
                var8[5] = arg2.field1312;
            }
            if (arg2.field1288 >= 0) {
                var6 += arg2.field1288 - this.field946[3] << 16;
                var8[3] = arg2.field1288;
            }
        }
        class28 var10 = (class28) class119.field2924.method774(var6, 329);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class104.method859(var21 - 256, (byte) 76).method826(0)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class108.method887(-1, var21 - 512).method550(101, this.field948)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field973 != -1L) {
                    var10 = (class28) class119.field2924.method774(this.field973, 329);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class11[] var13 = new class11[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class11 var19 = class104.method859(var18 - 256, (byte) -126).method825(18489);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class11 var20 = class108.method887(-1, var18 - 512).method551(11525, this.field948);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class11 var16 = new class11(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field963[var17] != 0) {
                        var16.method96(class101.field2539[var17][0], class101.field2539[var17][this.field963[var17]]);
                        if (var17 == 1) {
                            var16.method96(class56.field1557[0], class56.field1557[this.field963[var17]]);
                        }
                    }
                }
                var10 = var16.method78(64, 850, -30, -50, -30);
                class119.field2924.method773(var6, (byte) -17, var10);
                this.field973 = var6;
            }
        }
        int var22 = 113 / ((arg0 + 37) / 45);
        if (arg2 == null && arg3 == null) {
            return var10;
        }
        class28 var23;
        if (arg2 != null && arg3 != null) {
            var23 = arg2.method495(var10, arg4, 65535, arg1, arg3);
        } else if (arg2 == null) {
            var23 = arg3.method504(arg1, var10, -80);
        } else {
            var23 = arg2.method504(arg4, var10, -100);
        }
        return var23;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILbf;)V")
    public final void method371(int arg0, class14 arg1) {
        int var3 = -11 / ((2 - arg0) / 36);
        arg1.method162(this.field948 ? 1 : 0, -23339);
        field961++;
        for (int var4 = 0; var4 < 7; var4++) {
            int var6 = this.field946[class127.field3042[var4]];
            if (var6 == 0) {
                arg1.method162(-1, -23339);
            } else {
                arg1.method162(var6 - 256, -23339);
            }
        }
        for (int var5 = 0; var5 < 5; var5++) {
            arg1.method162(this.field963[var5], -23339);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZ)V")
    public final void method372(int arg0, int arg1, boolean arg2) {
        field956++;
        if (arg0 == 1 && this.field948) {
            return;
        }
        int var4 = this.field946[class127.field3042[arg0]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class96 var5;
        do {
            if (arg2) {
                var4++;
                if (var4 >= class16.field372) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class16.field372 - 1;
                }
            }
            var5 = class104.method859(var4, (byte) 26);
        } while (var5 == null || var5.field2405 || var5.field2406 != (this.field948 ? 7 : 0) + arg0);
        if (arg1 != -19419) {
            this.method379(23);
        }
        this.field946[class127.field3042[arg0]] = var4 + 256;
        this.method377(4576);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[I[IZI)V")
    public final void method373(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4) {
        int var6 = 55 / ((48 - arg0) / 41);
        field970++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var7 = 0; var7 < 7; var7++) {
                for (int var8 = 0; var8 < class16.field372; var8++) {
                    class96 var9 = class104.method859(var8, (byte) -121);
                    if (var9 != null && !var9.field2405 && var9.field2406 == (arg3 ? 7 : 0) + var7) {
                        arg1[class127.field3042[var7]] = var8 + 256;
                        break;
                    }
                }
            }
        }
        this.field948 = arg3;
        this.field946 = arg1;
        this.field949 = arg4;
        this.field963 = arg2;
        this.method377(4576);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public static final void method374(int arg0) {
        if (arg0 >= -20) {
            return;
        }
        field965++;
        for (class120 var1 = (class120) class96.field2397.method3(false); var1 != null; var1 = (class120) class96.field2397.method14(127)) {
            if (var1.field2944 != null) {
                var1.method985(0);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lge;ILge;)V")
    public static final void method375(class47 arg0, int arg1, class47 arg2) {
        int var3 = -72 % ((68 - arg1) / 34);
        field968++;
        class33.field983 = arg2;
        class124.field3007 = arg0;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public static final void method376(int arg0) {
        if (arg0 != 4) {
            field972 = null;
        }
        field960++;
        if (class21.field605 != null) {
            class21.field605.method755(-2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    private final void method377(int arg0) {
        field943++;
        if (arg0 != 4576) {
            this.method377(-121);
        }
        int var2 = this.field946[5];
        int var3 = this.field946[9];
        this.field946[5] = var3;
        this.field946[9] = var2;
        long var4 = this.field945;
        this.field945 = 0L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field945 <<= 0x4;
            if (this.field946[var6] >= 256) {
                this.field945 += this.field946[var6] - 256;
            }
        }
        if (this.field946[0] >= 256) {
            this.field945 += this.field946[0] - 256 >> 4;
        }
        if (this.field946[1] >= 256) {
            this.field945 += this.field946[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field945 <<= 0x3;
            this.field945 += this.field963[var7];
        }
        this.field946[9] = var3;
        this.field946[5] = var2;
        this.field945 <<= 0x1;
        this.field945 += this.field948 ? 1 : 0;
        if (var4 != 0L && this.field945 != var4) {
            class119.field2924.method770(20, var4);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)V")
    public final void method378(boolean arg0, int arg1) {
        if (arg1 == -1) {
            field962++;
            if (this.field948 != arg0) {
                this.method373(-94, null, this.field963, arg0, -1);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)I")
    public final int method379(int arg0) {
        if (arg0 == -1221765009) {
            field967++;
            return this.field949 == -1 ? (this.field963[4] << 20) + (this.field963[0] << 25) + (this.field946[11] << 5) + (this.field946[8] << 10) + this.field946[1] + (this.field946[0] << 15) : class45.method492(this.field949, (byte) 52).field425 + 305419896;
        } else {
            return -59;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Lbc;")
    public final class11 method380(byte arg0) {
        field942++;
        if (this.field949 != -1) {
            return class45.method492(this.field949, (byte) 52).method192((byte) 67);
        }
        boolean var2 = false;
        if (arg0 != -124) {
            return null;
        }
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field946[var3];
            if (var12 >= 256 && var12 < 512 && !class104.method859(var12 - 256, (byte) 108).method819((byte) 78)) {
                var2 = true;
            }
            if (var12 >= 512 && !class108.method887(-1, var12 - 512).method546(-119, this.field948)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class11[] var4 = new class11[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field946[var6];
            if (var9 >= 256 && var9 < 512) {
                class11 var10 = class104.method859(var9 - 256, (byte) 70).method822(arg0 ^ 0x47);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class11 var11 = class108.method887(arg0 ^ 0x7B, var9 - 512).method556(this.field948, true);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class11 var7 = new class11(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field963[var8] != 0) {
                var7.method96(class101.field2539[var8][0], class101.field2539[var8][this.field963[var8]]);
                if (var8 == 1) {
                    var7.method96(class56.field1557[0], class56.field1557[this.field963[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZII)V")
    public final void method381(boolean arg0, int arg1, int arg2) {
        field950++;
        int var4 = this.field963[arg1];
        if (arg2 < 4) {
            field951 = null;
        }
        if (arg0) {
            var4++;
            if (class101.field2539[arg1].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class101.field2539[arg1].length - 1;
            }
        }
        this.field963[arg1] = var4;
        this.method377(4576);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZILm;)V")
    public static final void method382(boolean arg0, int arg1, class83 arg2) {
        if (class21.field605 != null) {
            try {
                class21.field605.method755(-2);
            } catch (Exception var8) {
            }
            class21.field605 = null;
        }
        field954++;
        class21.field605 = arg2;
        class59.method606(4096, arg0);
        class68.field1907 = arg1;
        class58.field1595 = null;
        class141.field3357.field314 = 0;
        class90.field2315 = null;
        while (true) {
            class138 var3 = (class138) class27.field790.method25(false);
            if (var3 == null) {
                while (true) {
                    class138 var4 = (class138) class22.field648.method25(false);
                    if (var4 == null) {
                        if (class33.field988 != 0) {
                            try {
                                class14 var5 = new class14(4);
                                var5.method162(4, -23339);
                                var5.method162(class33.field988, arg1 ^ 0xFFFFA4D5);
                                var5.method164(arg1 ^ 0x4DA5, 0);
                                class21.field605.method754(0, (byte) 92, 4, var5.field326);
                            } catch (IOException var7) {
                                try {
                                    class21.field605.method755(arg1 ^ 0xFFFFFFFE);
                                } catch (Exception var6) {
                                }
                                class21.field605 = null;
                                class74.field2070++;
                            }
                        }
                        class47.field1349 = 0;
                        class93.field2338 = class105.method875((byte) -80);
                        return;
                    }
                    class136.field3267.method899(var4, arg1 + 6995);
                    class2.field56.method18(var4, var4.field2048, -1);
                    class116.field2834++;
                    class132.field3173--;
                }
            }
            class35.field1036.method18(var3, var3.field2048, -1);
            class86.field2243++;
            class116.field2837--;
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
    public static void method383(int arg0) {
        field944 = null;
        field971 = null;
        field964 = null;
        if (arg0 != 0) {
            field971 = null;
        }
        field951 = null;
        field952 = null;
        field972 = null;
        field953 = null;
        field966 = null;
    }
}
