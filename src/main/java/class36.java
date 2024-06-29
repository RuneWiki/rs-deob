import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class118 {

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public int field989 = 0;

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "Lfc;")
    public class39 field995 = class30.field851;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static volatile int field976 = 0;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "Lfc;")
    public static class39 field987 = class90.method774("Sie befinden sich in einem Mitglieder)2Gebiet(Q", -99);

    @OriginalMember(owner = "client!f", name = "db", descriptor = "Lfc;")
    private static class39 field990 = class90.method774("Select a world", -120);

    @OriginalMember(owner = "client!f", name = "R", descriptor = "Lfc;")
    public static class39 field978 = field990;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "Lfc;")
    public static class39 field983 = class90.method774("(U5", -96);

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Lfc;")
    public static class39 field973 = class90.method774("Sichtbare Karte vorbereitet)3", -80);

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "Lfc;")
    public static class39 field988 = class90.method774("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", -92);

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field980 = 0;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "[I")
    public int[] field974;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "[I")
    public int[] field985;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "[Lfc;")
    public class39[] field975;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lob;Z)V", line = 37)
    public static final void method413(class99 arg0, boolean arg1) {
        field993++;
        int var2 = arg0.field2406 >> 16;
        if (class37.field1008 == var2 || class126.field3203 == var2) {
            class128.field3242 = true;
        }
        if (arg1) {
            method415((byte) 73);
        }
        if (class37.field1018 == var2 || class25.field740[class104.field2633] == var2) {
            class104.field2638 = true;
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V", line = 61)
    public static final void method414(int arg0) {
        class97.field2297.method691(-106);
        field982++;
        int var1 = -23 / ((-arg0 - 71) / 35);
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V", line = 74)
    public static void method415(byte arg0) {
        field983 = null;
        field978 = null;
        field990 = null;
        if (arg0 == 113) {
            field973 = null;
            field987 = null;
            field988 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILdc;I)V", line = 92)
    private final void method416(int arg0, class25 arg1, int arg2) {
        field994++;
        if (arg2 == 1) {
            this.field991 = arg1.method322((byte) -50);
        } else if (arg2 == 2) {
            this.field981 = arg1.method322((byte) -50);
        } else if (arg2 == 3) {
            this.field995 = arg1.method304(-128);
        } else if (arg2 == 4) {
            this.field977 = arg1.method313((byte) 67);
        } else if (arg2 == 5) {
            this.field989 = arg1.method301(-4853);
            this.field974 = new int[this.field989];
            this.field975 = new class39[this.field989];
            for (int var4 = 0; var4 < this.field989; var4++) {
                this.field974[var4] = arg1.method313((byte) -99);
                this.field975[var4] = arg1.method304(-126);
            }
        } else if (arg2 == 6) {
            this.field989 = arg1.method301(arg0 ^ 0x2D2E);
            this.field974 = new int[this.field989];
            this.field985 = new int[this.field989];
            for (int var5 = 0; var5 < this.field989; var5++) {
                this.field974[var5] = arg1.method313((byte) 40);
                this.field985[var5] = arg1.method313((byte) -103);
            }
        }
        if (arg0 != -16347) {
            field983 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V", line = 171)
    public static final void method417(int arg0, byte arg1) {
        class77.field1751 = arg0;
        if (arg1 <= 111) {
            field983 = null;
        }
        field986++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ldc;B)V", line = 186)
    public final void method418(class25 arg0, byte arg1) {
        field984++;
        if (arg1 != -86) {
            return;
        }
        while (true) {
            int var3 = arg0.method322((byte) -50);
            if (var3 == 0) {
                return;
            }
            this.method416(-16347, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V", line = 210)
    public static final void method419(byte arg0) {
        class118.field3090 = 0;
        field992++;
        for (int var1 = -1; var1 < class15.field416 + class111.field2871; var1++) {
            class111 var18;
            if (var1 == -1) {
                var18 = class94.field2197;
            } else if (class111.field2871 > var1) {
                var18 = class101.field2525[class31.field862[var1]];
            } else {
                var18 = class118.field3092[class121.field3176[var1 - class111.field2871]];
            }
            if (var18 != null && var18.method979(18)) {
                if (var18 instanceof class121) {
                    class96 var19 = ((class121) var18).field3163;
                    if (var19.field2243 != null) {
                        var19 = var19.method812(-128);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class111.field2871 <= var1) {
                    class96 var22 = ((class121) var18).field3163;
                    if (var22.field2243 != null) {
                        var22 = var22.method812(arg0 - 147);
                    }
                    if (var22.field2247 >= 0 && class50.field1263.length > var22.field2247) {
                        class68.method647((byte) 126, var18.field2923 + 15, var18);
                        if (class14.field370 > -1) {
                            class50.field1263[var22.field2247].method116(class14.field370 - 12, class61.field1506 + -30);
                        }
                    }
                    if (class3.field84 == 1 && class121.field3176[var1 - class111.field2871] == class134.field3378 && class70.field1654 % 20 < 10) {
                        class68.method647((byte) 126, var18.field2923 + 15, var18);
                        if (class14.field370 > -1) {
                            class139.field3511[0].method116(class14.field370 - 12, class61.field1506 + -28);
                        }
                    }
                } else {
                    class142 var20 = (class142) var18;
                    int var21 = 30;
                    if (var20.field3552 != -1 || var20.field3587 != -1) {
                        class68.method647((byte) 126, var18.field2923 + 15, var18);
                        if (class14.field370 > -1) {
                            if (var20.field3552 != -1) {
                                class72.field1690[var20.field3552].method116(class14.field370 - 12, -var21 + class61.field1506);
                                var21 += 25;
                            }
                            if (var20.field3587 != -1) {
                                class50.field1263[var20.field3587].method116(class14.field370 - 12, -var21 + class61.field1506);
                                var21 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class3.field84 == 10 && class31.field862[var1] == class76.field1740) {
                        class68.method647((byte) 126, var18.field2923 + 15, var18);
                        if (class14.field370 > -1) {
                            class139.field3511[1].method116(class14.field370 - 12, -var21 + class61.field1506);
                        }
                    }
                }
                if (var18.field2925 != null && (class111.field2871 <= var1 || class94.field2203 == 0 || class94.field2203 == 3 || class94.field2203 == 1 && class35.method399(((class142) var18).field3575, 124))) {
                    class68.method647((byte) 126, var18.field2923, var18);
                    if (class14.field370 > -1 && class118.field3090 < class86.field1950) {
                        class86.field1936[class118.field3090] = class96.field2224.method707(var18.field2925) / 2;
                        class86.field1926[class118.field3090] = class96.field2224.field1879;
                        class86.field1922[class118.field3090] = class14.field370;
                        class86.field1949[class118.field3090] = class61.field1506;
                        class86.field1937[class118.field3090] = var18.field2921;
                        class86.field1943[class118.field3090] = var18.field2905;
                        class86.field1939[class118.field3090] = var18.field2856;
                        class86.field1930[class118.field3090] = var18.field2925;
                        class118.field3090++;
                    }
                }
                if (var18.field2876 > class70.field1654) {
                    class68.method647((byte) 126, var18.field2923 + 15, var18);
                    if (class14.field370 > -1) {
                        int var23 = var18.field2859 * 30 / var18.field2857;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class152.method1209(class14.field370 - 15, class61.field1506 + -3, var23, 5, 65280);
                        class152.method1209(class14.field370 + var23 - 15, class61.field1506 - 3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var18.field2897[var24] > class70.field1654) {
                        class68.method647((byte) 126, var18.field2923 / 2, var18);
                        if (class14.field370 > -1) {
                            if (var24 == 1) {
                                class61.field1506 -= 20;
                            }
                            if (var24 == 2) {
                                class61.field1506 -= 10;
                                class14.field370 -= 15;
                            }
                            if (var24 == 3) {
                                class61.field1506 -= 10;
                                class14.field370 += 15;
                            }
                            class112.field2938[var18.field2895[var24]].method116(class14.field370 - 12, class61.field1506 - 12);
                            class54.field1367.method720(class86.method734(var18.field2912[var24], 2218), class14.field370 - 1, class61.field1506 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class118.field3090; var2++) {
            int var3 = class86.field1949[var2];
            int var4 = class86.field1922[var2];
            int var5 = class86.field1926[var2];
            boolean var6 = true;
            int var7 = class86.field1936[var2];
            while (var6) {
                var6 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class86.field1949[var17] - class86.field1926[var17] < var3 + 2 && var3 - var5 < class86.field1949[var17] + 2 && class86.field1936[var17] + class86.field1922[var17] > -var7 + var4 && class86.field1922[var17] - class86.field1936[var17] < var4 + var7 && var3 > class86.field1949[var17] - class86.field1926[var17]) {
                        var3 = class86.field1949[var17] - class86.field1926[var17];
                        var6 = true;
                    }
                }
            }
            class14.field370 = class86.field1922[var2];
            class61.field1506 = class86.field1949[var2] = var3;
            class39 var8 = class86.field1930[var2];
            if (class30.field861 == 0) {
                int var9 = 16776960;
                if (class86.field1937[var2] < 6) {
                    var9 = class35.field948[class86.field1937[var2]];
                }
                if (class86.field1937[var2] == 6) {
                    var9 = class147.field3662 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class86.field1937[var2] == 7) {
                    var9 = class147.field3662 % 20 < 10 ? 255 : 65535;
                }
                if (class86.field1937[var2] == 8) {
                    var9 = class147.field3662 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class86.field1937[var2] == 9) {
                    int var10 = 150 - class86.field1939[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class86.field1937[var2] == 10) {
                    int var11 = 150 - class86.field1939[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var9 = (var11 - 100) * 327680 + 255 - (var11 - 100) * 5;
                    }
                }
                if (class86.field1937[var2] == 11) {
                    int var12 = 150 - class86.field1939[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = (var12 - 50) * 327685 + 65280;
                    } else if (var12 < 150) {
                        var9 = 49545215 - var12 * 327680;
                    }
                }
                if (class86.field1943[var2] == 0) {
                    class96.field2224.method720(var8, class14.field370, class61.field1506, var9, 0);
                }
                if (class86.field1943[var2] == 1) {
                    class96.field2224.method711(var8, class14.field370, class61.field1506, var9, 0, class147.field3662);
                }
                if (class86.field1943[var2] == 2) {
                    class96.field2224.method710(var8, class14.field370, class61.field1506, var9, 0, class147.field3662);
                }
                if (class86.field1943[var2] == 3) {
                    class96.field2224.method713(var8, class14.field370, class61.field1506, var9, 0, class147.field3662, 150 - class86.field1939[var2]);
                }
                if (class86.field1943[var2] == 4) {
                    int var13 = class96.field2224.method707(var8);
                    int var14 = (150 - class86.field1939[var2]) * (var13 + 100) / 150;
                    class152.method1216(class14.field370 - 50, 0, class14.field370 + 50, 334);
                    class96.field2224.method700(var8, class14.field370 + 50 - var14, class61.field1506, var9, 0);
                    class152.method1220();
                }
                if (class86.field1943[var2] == 5) {
                    int var15 = 150 - class86.field1939[var2];
                    class152.method1216(0, class61.field1506 - class96.field2224.field1879 - 1, 512, class61.field1506 + 5);
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class96.field2224.method720(var8, class14.field370, class61.field1506 + var16, var9, 0);
                    class152.method1220();
                }
            } else {
                class96.field2224.method720(var8, class14.field370, class61.field1506, 16776960, 0);
            }
        }
        if (arg0 != 20) {
            field990 = null;
        }
    }
}
