import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class159 extends class152 {

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "I")
    private int field2879 = 2048;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    private int field2872 = 10;

    @OriginalMember(owner = "client!ba", name = "nb", descriptor = "I")
    private int field2880 = 0;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "[I")
    public static int[] field2860 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "[[B")
    public static byte[][] field2870 = new byte[1000][];

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field2866 = 255;

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "Lce;")
    private static class126 field2873 = class206.method1445(-7923, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lce;")
    public static class126 field2869 = field2873;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ba", name = "ob", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ba", name = "pb", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "Lsg;")
    public static class164 field2864;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "Lcc;")
    public static class313 field2863;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "[I")
    private int[] field2867;

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "[I")
    private int[] field2877;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "[Lta;")
    public static class82[] field2865;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(B)V", line = 17)
    public static final void method1167(byte arg0) {
        field2861++;
        if (class314.field5394 || class194.field3305 == 2) {
            return;
        }
        try {
            int var1 = -20 / ((46 - arg0) / 55);
            class212.field3615.method844(class19.field260, (byte) -64);
        } catch (Throwable var3) {
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 36)
    public class159() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZI)[I", line = 44)
    public final int[] method6(boolean arg0, int arg1) {
        field2874++;
        if (!arg0) {
            this.field2867 = (int[]) null;
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int var4 = class122.field2038[arg1];
            if (this.field2880 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field2872; var12++) {
                    if (this.field2867[var12] <= var4 && this.field2867[var12 + 1] > var4) {
                        if (this.field2877[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class230.method1565(var3, 0, class244.field4133, var11);
            } else {
                for (int var5 = 0; var5 < class244.field4133; var5++) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class29.field406[var5];
                    int var9 = this.field2880;
                    if (var9 == 1) {
                        var6 = var8;
                    } else if (var9 == 2) {
                        var6 = (var4 + var8 - 4096 >> 1) + 2048;
                    } else if (var9 == 3) {
                        var6 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field2872; var10++) {
                        if (var6 >= this.field2867[var10] && var6 < this.field2867[var10 + 1]) {
                            if (var6 < this.field2877[var10]) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(B)V", line = 159)
    public static void method1168(byte arg0) {
        field2864 = null;
        field2860 = null;
        field2863 = null;
        field2869 = null;
        field2873 = null;
        if (arg0 < 83) {
            method1167((byte) 34);
        }
        field2870 = (byte[][]) null;
        field2865 = null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V", line = 175)
    private final void method1169(boolean arg0) {
        field2862++;
        this.field2877 = new int[this.field2872 + 1];
        int var2 = 0;
        this.field2867 = new int[this.field2872 + 1];
        int var3 = 4096 / this.field2872;
        if (!arg0) {
            field2865 = (class82[]) null;
        }
        int var4 = this.field2879 * var3 >> 12;
        for (int var5 = 0; var5 < this.field2872; var5++) {
            this.field2867[var5] = var2;
            this.field2877[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2867[this.field2872] = 4096;
        this.field2877[this.field2872] = this.field2877[0] + 4096;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIII)V", line = 210)
    public static final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class117.field1975 = arg5;
        class237.field4000 = arg2;
        class167.field2969 = arg1;
        class85.field1350 = arg0;
        if (arg4 != 48) {
            field2873 = (class126) null;
        }
        class120.field2019 = arg3;
        field2876++;
    }

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)V", line = 232)
    public static final void method1171(int arg0) {
        field2875++;
        if (class134.field2320 == null) {
            return;
        }
        if (class300.field4975 < 10) {
            if (!field2863.method2161(class134.field2320.field3859, -51)) {
                class300.field4975 = class165.field2942.method2159((byte) -62, class134.field2320.field3859) / 10;
                return;
            }
            class240.method1644((byte) 67);
            class300.field4975 = 10;
        }
        if (class300.field4975 == 10) {
            if (class134.field2320.field3874 == 37) {
                class232.field3896 = 3.0F;
                class15.field200 = 3.0F;
            } else if (class134.field2320.field3874 == 50) {
                class232.field3896 = 4.0F;
                class15.field200 = 4.0F;
            } else if (class134.field2320.field3874 == 75) {
                class232.field3896 = 6.0F;
                class15.field200 = 6.0F;
            } else if (class134.field2320.field3874 == 100) {
                class232.field3896 = 8.0F;
                class15.field200 = 8.0F;
            } else if (class134.field2320.field3874 == 200) {
                class232.field3896 = 16.0F;
                class15.field200 = 16.0F;
            } else {
                class232.field3896 = 8.0F;
                class15.field200 = 8.0F;
            }
            class306.field5140 = class134.field2320.field3862 >> 6 << 6;
            class143.field2602 = (class134.field2320.field3866 >> 6 << 6) + 64 - class306.field5140;
            class220.field3702 = class134.field2320.field3871 >> 6 << 6;
            class36.field521 = (class134.field2320.field3853 >> 6 << 6) + 64 - class220.field3702;
            int var1 = (class286.field4744.field2461 >> 7) + class58.field914 - class220.field3702;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class143.field2602 - class138.field2473 - ((class286.field4744.field2487 >> 7) - class306.field5140) - 1;
            int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
            if (var2 >= 0 && class36.field521 > var2 && var4 >= 0 && class143.field2602 > var4) {
                class139.field2522 = var2;
                class253.field4249 = var4;
            } else {
                class139.field2522 = class134.field2320.field3867 * 64 - class220.field3702;
                class253.field4249 = class306.field5140 + class143.field2602 - (class134.field2320.field3865 * 64) - 1;
            }
            class245.method1686(false);
            int var5 = class172.field3045 >> 2 << 10;
            int var6 = class200.field3409 >> 1;
            int var7 = class36.field521 >> 6;
            class300.field4972 = new int[class53.field806 + 1];
            int var8 = class143.field2602 >> 6;
            class283.field4710 = new int[var7][var8][];
            class64.field1079 = new int[var7][var8][];
            class260.field4361 = new byte[var7][var8][];
            class1.field10 = new byte[var7][var8][];
            class273.field4599 = new byte[var7][var8][];
            class48.field748 = new byte[var7][var8][];
            class13.field183 = new short[var7][var8][];
            class264.field4400 = new byte[var7][var8][];
            class84.method591(var6, false, var5);
            class300.field4975 = 20;
        } else if (class300.field4975 == 20) {
            class17.method93((byte) -128, new class134(field2863.method2157((byte) -57, class134.field2320.field3859, class241.field4086)));
            class300.field4975 = 30;
            class318.method2211(true, arg0 - 27894);
            class9.method55(0);
        } else if (class300.field4975 == 30) {
            class87.method614(new class134(field2863.method2157((byte) -57, class134.field2320.field3859, class130.field2231)), (byte) -126);
            class300.field4975 = 40;
            class9.method55(0);
        } else if (class300.field4975 == 40) {
            class289.method1917(new class134(field2863.method2157((byte) -57, class134.field2320.field3859, class46.field720)), 18);
            class300.field4975 = 50;
            class9.method55(arg0 - 27944);
        } else if (class300.field4975 == 50) {
            class176.method1274(arg0 ^ 0x6D11, new class134(field2863.method2157((byte) -57, class134.field2320.field3859, class23.field336)));
            class300.field4975 = 60;
            class318.method2211(true, 50);
            class9.method55(0);
        } else if (class300.field4975 == 60) {
            if (field2863.method2167(class12.method69(new class126[] { class134.field2320.field3859, class200.field3406 }, (byte) 122), (byte) -120)) {
                if (!field2863.method2161(class12.method69(new class126[] { class134.field2320.field3859, class200.field3406 }, (byte) 118), 91)) {
                    return;
                }
                class228.field3852 = class195.method1376((byte) -17, class12.method69(new class126[] { class134.field2320.field3859, class200.field3406 }, (byte) 118), field2863);
            } else {
                class228.field3852 = new class57(0);
            }
            class300.field4975 = 70;
            class9.method55(arg0 ^ 0x6D28);
        } else if (class300.field4975 == 70) {
            class202.field3456 = new class164(11, true, class24.field342);
            class300.field4975 = 73;
            class318.method2211(true, 50);
            class9.method55(0);
        } else if (class300.field4975 == 73) {
            class228.field3844 = new class164(12, true, class24.field342);
            class300.field4975 = 76;
            class318.method2211(true, 50);
            class9.method55(0);
        } else if (arg0 == 27944) {
            if (class300.field4975 == 76) {
                class55.field833 = new class164(14, true, class24.field342);
                class300.field4975 = 79;
                class318.method2211(true, 50);
                class9.method55(0);
            } else if (class300.field4975 == 79) {
                class289.field4797 = new class164(17, true, class24.field342);
                class300.field4975 = 82;
                class318.method2211(true, 50);
                class9.method55(0);
            } else if (class300.field4975 == 82) {
                class294.field4898 = new class164(19, true, class24.field342);
                class300.field4975 = 85;
                class318.method2211(true, arg0 - 27894);
                class9.method55(arg0 ^ 0x6D28);
            } else if (class300.field4975 == 85) {
                class55.field829 = new class164(22, true, class24.field342);
                class300.field4975 = 88;
                class318.method2211(true, 50);
                class9.method55(0);
            } else if (class300.field4975 == 88) {
                field2864 = new class164(26, true, class24.field342);
                class300.field4975 = 91;
                class318.method2211(true, 50);
                class9.method55(0);
            } else {
                class39.field630 = new class164(30, true, class24.field342);
                class300.field4975 = 100;
                class318.method2211(true, 50);
                class9.method55(0);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILbb;)V", line = 474)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field2868++;
        if (arg0 != 8) {
            method1172((byte) -86, -77, 0, (class112) null);
        }
        if (arg1 == 0) {
            this.field2872 = arg2.method948(arg0 - 132);
        } else if (arg1 == 1) {
            this.field2879 = arg2.method942(true);
        } else if (arg1 == 2) {
            this.field2880 = arg2.method948(-125);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIILwd;)V", line = 531)
    public static final void method1172(byte arg0, int arg1, int arg2, class112 arg3) {
        if (arg3.field1786 == 1) {
            class202.field3449++;
            class224.method1536(class224.field3772, arg3.field1813, -128, 0, (short) 45, 0L, -1, arg3.field1833);
        }
        if (arg3.field1786 == 2 && !class313.field5371) {
            class126 var4 = class318.method2212(137, arg3);
            if (var4 != null) {
                class162.field2916++;
                class224.method1536(class12.method69(new class126[] { class21.field281, arg3.field1762 }, (byte) 118), var4, arg0 ^ 0xFFFFFF8C, -1, (short) 48, 0L, -1, arg3.field1833);
            }
        }
        if (arg3.field1786 == 3) {
            class224.method1536(class224.field3772, class293.field4871, -128, 0, (short) 31, 0L, -1, arg3.field1833);
            class138.field2468++;
        }
        field2882++;
        if (arg0 != 6) {
            return;
        }
        if (arg3.field1786 == 4) {
            class224.method1536(class224.field3772, arg3.field1813, arg0 - 122, 0, (short) 16, 0L, -1, arg3.field1833);
            class286.field4758++;
        }
        if (arg3.field1786 == 5) {
            class224.method1536(class224.field3772, arg3.field1813, arg0 - 134, 0, (short) 21, 0L, -1, arg3.field1833);
            class262.field4385++;
        }
        if (arg3.field1786 == 6 && class64.field1084 == null) {
            class152.field2778++;
            class224.method1536(class224.field3772, arg3.field1813, -124, -1, (short) 57, 0L, -1, arg3.field1833);
        }
        if (arg3.field1780 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field1850; var6++) {
                for (int var7 = 0; var7 < arg3.field1831; var7++) {
                    int var8 = (arg3.field1888 + 32) * var7;
                    int var9 = (arg3.field1754 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field1859[var5];
                        var8 += arg3.field1771[var5];
                    }
                    if (var8 <= arg1 && arg2 >= var9 && arg1 < var8 + 32 && (var9 + 32) > arg2) {
                        class58.field898 = arg3;
                        class317.field5431 = var5;
                        if (arg3.field1849[var5] > 0) {
                            class137 var10 = class68.method498(23, arg3.field1849[var5] - 1);
                            if (class257.field4316 == 1 && class176.method1278(client.method804(arg3), false)) {
                                if (class251.field4207 != arg3.field1833 || class24.field352 != var5) {
                                    class224.method1536(class12.method69(new class126[] { class279.field4640, class25.field357, var10.field2396 }, (byte) 119), class286.field4731, -114, var5, (short) 42, (long) var10.field2431, -1, arg3.field1833);
                                    class162.field2918++;
                                }
                            } else if (!class313.field5371 || !class176.method1278(client.method804(arg3), false)) {
                                class285.field4725++;
                                class126[] var11 = var10.field2405;
                                if (class91.field1447) {
                                    var11 = class190.method1361(var11, 0);
                                }
                                if (class176.method1278(client.method804(arg3), false)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class52.field791++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 35;
                                            } else {
                                                var13 = 18;
                                            }
                                            class224.method1536(class12.method69(new class126[] { class99.field1598, var10.field2396 }, (byte) 115), var11[var12], arg0 - 124, var5, var13, (long) var10.field2431, -1, arg3.field1833);
                                        }
                                    }
                                }
                                if (class318.method2215(-1, client.method804(arg3))) {
                                    class41.field654++;
                                    class224.method1536(class12.method69(new class126[] { class99.field1598, var10.field2396 }, (byte) 127), class286.field4731, -124, var5, (short) 20, (long) var10.field2431, class96.field1538, arg3.field1833);
                                }
                                if (class176.method1278(client.method804(arg3), false) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class283.field4713++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 19;
                                            }
                                            if (var14 == 1) {
                                                var15 = 58;
                                            }
                                            if (var14 == 2) {
                                                var15 = 44;
                                            }
                                            class224.method1536(class12.method69(new class126[] { class99.field1598, var10.field2396 }, (byte) 126), var11[var14], -116, var5, var15, (long) var10.field2431, -1, arg3.field1833);
                                        }
                                    }
                                }
                                class126[] var16 = arg3.field1870;
                                if (class91.field1447) {
                                    var16 = class190.method1361(var16, 0);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class151.field2763++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 33;
                                            }
                                            if (var17 == 1) {
                                                var18 = 39;
                                            }
                                            if (var17 == 2) {
                                                var18 = 10;
                                            }
                                            if (var17 == 3) {
                                                var18 = 22;
                                            }
                                            if (var17 == 4) {
                                                var18 = 49;
                                            }
                                            class224.method1536(class12.method69(new class126[] { class99.field1598, var10.field2396 }, (byte) 115), var16[var17], -128, var5, var18, (long) var10.field2431, -1, arg3.field1833);
                                        }
                                    }
                                }
                                class224.method1536(class12.method69(new class126[] { class99.field1598, var10.field2396 }, (byte) 121), class207.field3547, arg0 ^ 0xFFFFFF8A, var5, (short) 1001, (long) var10.field2431, class265.field4442, arg3.field1833);
                            } else if ((class9.field105 & 0x10) == 16) {
                                class224.method1536(class12.method69(new class126[] { class187.field3236, class25.field357, var10.field2396 }, (byte) 120), class85.field1345, arg0 ^ 0xFFFFFF85, var5, (short) 37, (long) var10.field2431, -1, arg3.field1833);
                                class254.field4272++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field1916) {
            return;
        }
        if (!class313.field5371) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class126 var20 = class130.method909(arg3, var19, 128);
                if (var20 != null) {
                    class224.method1536(arg3.field1894, var20, -116, arg3.field1875, (short) 1005, (long) (var19 + 1), class33.method183(arg3, -9680, var19), arg3.field1833);
                    class182.field3167++;
                }
            }
            class126 var21 = class318.method2212(137, arg3);
            if (var21 != null) {
                class162.field2916++;
                class224.method1536(arg3.field1894, var21, -113, arg3.field1875, (short) 48, 0L, -1, arg3.field1833);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class126 var23 = class130.method909(arg3, var22, 128);
                if (var23 != null) {
                    class182.field3167++;
                    class224.method1536(arg3.field1894, var23, -113, arg3.field1875, (short) 41, (long) (var22 + 1), class33.method183(arg3, -9680, var22), arg3.field1833);
                }
            }
            if (class36.method197((byte) -104, client.method804(arg3))) {
                class224.method1536(class224.field3772, class95.field1514, -122, arg3.field1875, (short) 57, 0L, -1, arg3.field1833);
                class152.field2778++;
            }
        } else if (class157.method1142(-32, client.method804(arg3)) && (class9.field105 & 0x20) == 32) {
            class224.method1536(class12.method69(new class126[] { class187.field3236, class93.field1451, arg3.field1894 }, (byte) 118), class85.field1345, arg0 - 119, arg3.field1875, (short) 36, 0L, -1, arg3.field1833);
            class290.field4806++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V", line = 854)
    public final void method2(byte arg0) {
        field2859++;
        this.method1169(true);
        int var2 = -110 / ((arg0 - 2) / 37);
    }
}
