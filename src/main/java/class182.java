import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class182 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Lok;")
    public static class146 field3043 = class235.method1724(-12908, "<br>");

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Lok;")
    private static class146 field3042 = class235.method1724(-12908, "Loaded config");

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Lok;")
    public static class146 field3050 = field3042;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field3045 = 0;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lfd;")
    public static class237 field3046 = new class237(0, 0);

    @OriginalMember(owner = "client!me", name = "k", descriptor = "[J")
    public static long[] field3052 = new long[100];

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field3053 = 0;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Llc;")
    public static class160 field3054 = new class160();

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Loh;")
    public static class15 field3047;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Loh;")
    public static class15 field3049;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lqh;")
    public static class293 field3051;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 8)
    public static void method1440(int arg0) {
        field3047 = null;
        field3054 = null;
        field3051 = null;
        field3049 = null;
        field3050 = null;
        int var1 = 0 % ((arg0 - 19) / 40);
        field3043 = null;
        field3046 = null;
        field3042 = null;
        field3052 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 35)
    public static final void method1441(int arg0) {
        field3048++;
        if (class248.method1813((byte) -35) != 2) {
            return;
        }
        byte var1 = (byte) (class260.field4321 - 4 & 0xFF);
        int var2 = class260.field4321 % 104;
        for (int var3 = arg0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class300.field5075[var3][var2][var4] = var1;
            }
        }
        if (class203.field3387 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class85.field1353[var5] = -1000000;
            class28.field484[var5] = 1000000;
            class248.field4136[var5] = 0;
            class27.field464[var5] = 1000000;
            class232.field3878[var5] = 0;
        }
        if (class302.field5172 != 1) {
            int var6 = class19.method141(class107.field1742, class203.field3387, class161.field2719, arg0 + 124);
            if (var6 - class151.field2572 < 800 && (class46.field775[class203.field3387][class107.field1742 >> 7][class161.field2719 >> 7] & 0x4) != 0) {
                class104.method709(class107.field1742 >> 7, 1, 999999, class203.field3382, false, class161.field2719 >> 7);
            }
            return;
        }
        if ((class46.field775[class203.field3387][class102.field1639.field5409 >> 7][class102.field1639.field5380 >> 7] & 0x4) != 0) {
            class104.method709(class102.field1639.field5409 >> 7, 0, 999999, class203.field3382, false, class102.field1639.field5380 >> 7);
        }
        if (class63.field1088 >= 310) {
            return;
        }
        int var7 = class107.field1742 >> 7;
        int var8 = class161.field2719 >> 7;
        int var9 = class102.field1639.field5409 >> 7;
        int var10 = class102.field1639.field5380 >> 7;
        int var11;
        if (var9 > var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        int var12;
        if (var8 < var10) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        if (var12 >= var11) {
            int var15 = 32768;
            int var16 = var11 * 65536 / var12;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class46.field775[class203.field3387][var7][var8] & 0x4) != 0) {
                    class104.method709(var7, 1, 999999, class203.field3382, false, var8);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    if (var7 < var9) {
                        var7++;
                    } else if (var9 < var7) {
                        var7--;
                    }
                    var15 -= 65536;
                    if ((class46.field775[class203.field3387][var7][var8] & 0x4) != 0) {
                        class104.method709(var7, 1, arg0 + 999999, class203.field3382, false, var8);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var11;
        int var14 = 32768;
        while (var7 != var9) {
            if (var7 < var9) {
                var7++;
            } else if (var7 > var9) {
                var7--;
            }
            if ((class46.field775[class203.field3387][var7][var8] & 0x4) != 0) {
                class104.method709(var7, 1, 999999, class203.field3382, false, var8);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var10 > var8) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class46.field775[class203.field3387][var7][var8] & 0x4) != 0) {
                    class104.method709(var7, 1, 999999, class203.field3382, false, var8);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)V", line = 232)
    public static final void method1442(int arg0, int arg1, byte arg2) {
        class202.field3372[arg1] = arg0;
        class239 var3 = (class239) class127.field2060.method810((byte) -123, (long) arg1);
        field3044++;
        if (var3 == null) {
            class239 var4 = new class239(4611686018427387905L);
            class127.field2060.method805(var4, (long) arg1, 101);
        } else if (var3.field3981 != 4611686018427387905L) {
            var3.field3981 = class67.method501(-109) + 500L | 0x4000000000000000L;
        }
        if (arg2 != -93) {
            method1442(-16, 91, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lse;Z)V", line = 259)
    public static final void method1443(class11 arg0, boolean arg1) {
        class167.field2825.method1258(0, arg0);
        while (true) {
            class11 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class11[][] var7;
            class11 var78;
            do {
                class11 var77;
                do {
                    class11 var76;
                    do {
                        class11 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class11) class167.field2825.method1254(0);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field224);
                                            var3 = var2.field215;
                                            var4 = var2.field229;
                                            var5 = var2.field209;
                                            var6 = var2.field206;
                                            var7 = class203.field3382[var5];
                                            float var8 = 0.0F;
                                            if (class271.field4640) {
                                                if (class297.field5051 == class174.field2914) {
                                                    int var9 = class160.field2707[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class225.field3756 != var10) {
                                                        class225.field3756 = var10;
                                                        class40.method282(var10, 5000);
                                                        class231.method1693(class51.method416(-116));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class175.field2937 != var11) {
                                                        class175.field2937 = var11;
                                                        class180.method1412(var11, -75);
                                                    }
                                                    int var12 = class300.field5082[0][var3 + 1][var4] + class300.field5082[0][var3][var4] + class300.field5082[0][var3][var4 + 1] + class300.field5082[0][var3 + 1][var4 + 1] >> 2;
                                                    class140.method1033(-var12, 3, -5);
                                                    var8 = 201.5F;
                                                    class271.method1979(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class271.method1979(var8);
                                                }
                                            }
                                            if (!var2.field207) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class11 var13 = class203.field3382[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field224) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class106.field1703 && var3 > class218.field3611) {
                                                    class11 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field224 && (var14.field207 || (var2.field221 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class106.field1703 && var3 < class43.field740 - 1) {
                                                    class11 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field224 && (var15.field207 || (var2.field221 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class175.field2932 && var4 > class189.field3129) {
                                                    class11 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field224 && (var16.field207 || (var2.field221 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class175.field2932 && var4 < class36.field664 - 1) {
                                                    class11 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field224 && (var17.field207 || (var2.field221 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field207 = false;
                                            if (var2.field208 != null) {
                                                class11 var18 = var2.field208;
                                                if (class271.field4640) {
                                                    class271.method1979(201.5F - (float) (var18.field206 + 1) * 50.0F);
                                                }
                                                if (var18.field222 == null) {
                                                    if (var18.field210 != null) {
                                                        if (class26.method173(0, var3, var4)) {
                                                            class126.method866(var18.field210, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var3, var4, true);
                                                        } else {
                                                            class126.method866(var18.field210, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class26.method173(0, var3, var4)) {
                                                    class60.method464(var18.field222, 0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var3, var4, true);
                                                } else {
                                                    class60.method464(var18.field222, 0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var3, var4, false);
                                                }
                                                class278 var19 = var18.field212;
                                                if (var19 != null) {
                                                    if (class271.field4640) {
                                                        if ((var19.field4773 & var2.field211) == 0) {
                                                            class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                        } else {
                                                            class53.method435(var19.field4773, class82.field1311, class298.field5066, class287.field4923, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field4779.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var19.field4782 - class82.field1311, var19.field4775 - class298.field5066, var19.field4777 - class287.field4923, var19.field4780, var5, (class284) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field218; var20++) {
                                                    class311 var21 = var18.field217[var20];
                                                    if (var21 != null) {
                                                        if (class271.field4640) {
                                                            class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                        }
                                                        var21.field5300.method326(var21.field5291, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var21.field5301 - class82.field1311, var21.field5288 - class298.field5066, var21.field5290 - class287.field4923, var21.field5289, var5, (class284) null);
                                                    }
                                                }
                                                if (class271.field4640) {
                                                    class271.method1979(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field222 == null) {
                                                if (var2.field210 != null) {
                                                    if (class26.method173(var6, var3, var4)) {
                                                        class126.method866(var2.field210, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class126.method866(var2.field210, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var3, var4, false);
                                                    }
                                                }
                                            } else if (class26.method173(var6, var3, var4)) {
                                                class60.method464(var2.field222, var6, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field222.field3577 != 12345678 || class143.field2385 && var5 <= class262.field4354) {
                                                    class60.method464(var2.field222, var6, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class164 var23 = var2.field205;
                                                if (var23 != null && (var23.field2787 & 0x80000000L) != 0L) {
                                                    if (class271.field4640 && var23.field2783) {
                                                        class271.method1979(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class271.field4640) {
                                                        class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                    }
                                                    var23.field2785.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var23.field2773 - class82.field1311, var23.field2781 - class298.field5066, var23.field2782 - class287.field4923, var23.field2787, var5, (class284) null);
                                                    if (class271.field4640 && var23.field2783) {
                                                        class271.method1979(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class278 var26 = var2.field212;
                                            class19 var27 = var2.field223;
                                            if (var26 != null || var27 != null) {
                                                if (class106.field1703 == var3) {
                                                    var24++;
                                                } else if (class106.field1703 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class175.field2932 == var4) {
                                                    var24 += 3;
                                                } else if (class175.field2932 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class190.field3139[var24];
                                                var2.field211 = class50.field896[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field4773 & class309.field5250[var24]) == 0) {
                                                    var2.field227 = 0;
                                                } else if (var26.field4773 == 16) {
                                                    var2.field227 = 3;
                                                    var2.field219 = class175.field2929[var24];
                                                    var2.field204 = 3 - var2.field219;
                                                } else if (var26.field4773 == 32) {
                                                    var2.field227 = 6;
                                                    var2.field219 = class99.field1607[var24];
                                                    var2.field204 = 6 - var2.field219;
                                                } else if (var26.field4773 == 64) {
                                                    var2.field227 = 12;
                                                    var2.field219 = client.field4087[var24];
                                                    var2.field204 = 12 - var2.field219;
                                                } else {
                                                    var2.field227 = 9;
                                                    var2.field219 = class305.field5222[var24];
                                                    var2.field204 = 9 - var2.field219;
                                                }
                                                if ((var26.field4773 & var25) != 0 && !class164.method1276(var6, var3, var4, var26.field4773)) {
                                                    if (class271.field4640) {
                                                        class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                    }
                                                    var26.field4779.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var26.field4782 - class82.field1311, var26.field4775 - class298.field5066, var26.field4777 - class287.field4923, var26.field4780, var5, (class284) null);
                                                }
                                                if ((var26.field4765 & var25) != 0 && !class164.method1276(var6, var3, var4, var26.field4765)) {
                                                    if (class271.field4640) {
                                                        class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                    }
                                                    var26.field4774.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var26.field4782 - class82.field1311, var26.field4775 - class298.field5066, var26.field4777 - class287.field4923, var26.field4780, var5, (class284) null);
                                                }
                                            }
                                            if (var27 != null && !class248.method1812(var6, var3, var4, var27.field371.method325())) {
                                                if (class271.field4640) {
                                                    class271.method1979(var8 - 0.5F);
                                                }
                                                if ((var27.field377 & var25) != 0) {
                                                    if (class271.field4640) {
                                                        class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                    }
                                                    var27.field371.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var27.field379 + var27.field366 - class82.field1311, var27.field370 - class298.field5066, var27.field375 + var27.field369 - class287.field4923, var27.field364, var5, (class284) null);
                                                } else if (var27.field377 == 256) {
                                                    int var28 = var27.field379 - class82.field1311;
                                                    int var29 = var27.field370 - class298.field5066;
                                                    int var30 = var27.field375 - class287.field4923;
                                                    int var31 = var27.field376;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class271.field4640) {
                                                            class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                        }
                                                        var27.field371.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var27.field366 + var28, var29, var27.field369 + var30, var27.field364, var5, (class284) null);
                                                    } else if (var27.field373 != null) {
                                                        if (class271.field4640) {
                                                            class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                        }
                                                        var27.field373.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var28, var29, var30, var27.field364, var5, (class284) null);
                                                    }
                                                }
                                                if (class271.field4640) {
                                                    class271.method1979(var8);
                                                }
                                            }
                                            if (var22) {
                                                class164 var34 = var2.field205;
                                                if (var34 != null && (var34.field2787 & 0x80000000L) == 0L) {
                                                    if (class271.field4640 && var34.field2783) {
                                                        class271.method1979(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class271.field4640) {
                                                        class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                    }
                                                    var34.field2785.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var34.field2773 - class82.field1311, var34.field2781 - class298.field5066, var34.field2782 - class287.field4923, var34.field2787, var5, (class284) null);
                                                    if (class271.field4640 && var34.field2783) {
                                                        class271.method1979(var8);
                                                    }
                                                }
                                                class241 var35 = var2.field213;
                                                if (var35 != null && var35.field3999 == 0) {
                                                    if (class271.field4640) {
                                                        class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                    }
                                                    if (var35.field4002 != null) {
                                                        var35.field4002.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var35.field4006 - class82.field1311, var35.field4005 - class298.field5066, var35.field4000 - class287.field4923, var35.field4012, var5, (class284) null);
                                                    }
                                                    if (var35.field4011 != null) {
                                                        var35.field4011.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var35.field4006 - class82.field1311, var35.field4005 - class298.field5066, var35.field4000 - class287.field4923, var35.field4012, var5, (class284) null);
                                                    }
                                                    if (var35.field4007 != null) {
                                                        var35.field4007.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var35.field4006 - class82.field1311, var35.field4005 - class298.field5066, var35.field4000 - class287.field4923, var35.field4012, var5, (class284) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field221;
                                            if (var36 != 0) {
                                                if (var3 < class106.field1703 && (var36 & 0x4) != 0) {
                                                    class11 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field224) {
                                                        class167.field2825.method1258(0, var37);
                                                    }
                                                }
                                                if (var4 < class175.field2932 && (var36 & 0x2) != 0) {
                                                    class11 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field224) {
                                                        class167.field2825.method1258(0, var38);
                                                    }
                                                }
                                                if (var3 > class106.field1703 && (var36 & 0x1) != 0) {
                                                    class11 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field224) {
                                                        class167.field2825.method1258(0, var39);
                                                    }
                                                }
                                                if (var4 > class175.field2932 && (var36 & 0x8) != 0) {
                                                    class11 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field224) {
                                                        class167.field2825.method1258(0, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field227 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field218; var42++) {
                                                if (class40.field725 != var2.field217[var42].field5293 && (var2.field214[var42] & var2.field227) == var2.field219) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class278 var43 = var2.field212;
                                                if (!class164.method1276(var6, var3, var4, var43.field4773)) {
                                                    if (class271.field4640) {
                                                        label882: {
                                                            if ((var43.field4780 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field4782 - class82.field1311;
                                                                int var45 = var43.field4777 - class287.field4923;
                                                                int var46 = (int) (var43.field4780 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class192.field3168 - 1) {
                                                                        class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class189.field3124 - 1 && var4 < class192.field3168 - 1) {
                                                                        class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class189.field3124 - 1 && var4 > 0) {
                                                                        class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field4779.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var43.field4782 - class82.field1311, var43.field4775 - class298.field5066, var43.field4777 - class287.field4923, var43.field4780, var5, (class284) null);
                                                }
                                                var2.field227 = 0;
                                            }
                                        }
                                        if (!var2.field220) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field218;
                                            var2.field220 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class311 var50 = var2.field217[var49];
                                                if (class40.field725 != var50.field5293) {
                                                    for (int var51 = var50.field5296; var51 <= var50.field5302; var51++) {
                                                        for (int var52 = var50.field5294; var52 <= var50.field5299; var52++) {
                                                            class11 var53 = var7[var51][var52];
                                                            if (var53.field207) {
                                                                var2.field220 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field227 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field5296) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field5302) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field5294) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field5299) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field227) == var2.field204) {
                                                                    var2.field220 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class60.field1022[var48++] = var50;
                                                    int var55 = class106.field1703 - var50.field5296;
                                                    int var56 = var50.field5302 - class106.field1703;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class175.field2932 - var50.field5294;
                                                    int var58 = var50.field5299 - class175.field2932;
                                                    if (var58 > var57) {
                                                        var50.field5287 = var55 + var58;
                                                    } else {
                                                        var50.field5287 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class311 var62 = class60.field1022[var61];
                                                    if (class40.field725 != var62.field5293) {
                                                        if (var62.field5287 > var59) {
                                                            var59 = var62.field5287;
                                                            var60 = var61;
                                                        } else if (var62.field5287 == var59) {
                                                            int var63 = var62.field5301 - class82.field1311;
                                                            int var64 = var62.field5290 - class287.field4923;
                                                            int var65 = class60.field1022[var60].field5301 - class82.field1311;
                                                            int var66 = class60.field1022[var60].field5290 - class287.field4923;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class311 var67 = class60.field1022[var60];
                                                var67.field5293 = class40.field725;
                                                if (!class262.method1898(var6, var67.field5296, var67.field5302, var67.field5294, var67.field5299, var67.field5300.method325())) {
                                                    if (class271.field4640) {
                                                        if ((var67.field5289 & 0xFC000L) == 147456L) {
                                                            class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                                                            int var68 = var67.field5301 - class82.field1311;
                                                            int var69 = var67.field5290 - class287.field4923;
                                                            int var70 = (int) (var67.field5289 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class53.method441(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class53.method441(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class53.method441(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class53.method441(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class53.method429(class82.field1311, class298.field5066, class287.field4923, var5, var67.field5296, var67.field5294, var67.field5302, var67.field5299);
                                                        }
                                                    }
                                                    var67.field5300.method326(var67.field5291, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var67.field5301 - class82.field1311, var67.field5288 - class298.field5066, var67.field5290 - class287.field4923, var67.field5289, var5, (class284) null);
                                                }
                                                for (int var71 = var67.field5296; var71 <= var67.field5302; var71++) {
                                                    for (int var72 = var67.field5294; var72 <= var67.field5299; var72++) {
                                                        class11 var73 = var7[var71][var72];
                                                        if (var73.field227 != 0) {
                                                            class167.field2825.method1258(0, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field224) {
                                                            class167.field2825.method1258(0, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field220) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field220 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field224);
                            } while (var2.field227 != 0);
                            if (var3 > class106.field1703 || var3 <= class218.field3611) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field224);
                        if (var3 < class106.field1703 || var3 >= class43.field740 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field224);
                    if (var4 > class175.field2932 || var4 <= class189.field3129) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field224);
                if (var4 < class175.field2932 || var4 >= class36.field664 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field224);
            var2.field224 = false;
            class46.field817--;
            class241 var79 = var2.field213;
            if (var79 != null && var79.field3999 != 0) {
                if (class271.field4640) {
                    class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                }
                if (var79.field4002 != null) {
                    var79.field4002.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var79.field4006 - class82.field1311, var79.field4005 - class298.field5066 - var79.field3999, var79.field4000 - class287.field4923, var79.field4012, var5, (class284) null);
                }
                if (var79.field4011 != null) {
                    var79.field4011.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var79.field4006 - class82.field1311, var79.field4005 - class298.field5066 - var79.field3999, var79.field4000 - class287.field4923, var79.field4012, var5, (class284) null);
                }
                if (var79.field4007 != null) {
                    var79.field4007.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var79.field4006 - class82.field1311, var79.field4005 - class298.field5066 - var79.field3999, var79.field4000 - class287.field4923, var79.field4012, var5, (class284) null);
                }
            }
            if (var2.field211 != 0) {
                class19 var80 = var2.field223;
                if (var80 != null && !class248.method1812(var6, var3, var4, var80.field371.method325())) {
                    if ((var80.field377 & var2.field211) != 0) {
                        if (class271.field4640) {
                            class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                        }
                        var80.field371.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var80.field379 + var80.field366 - class82.field1311, var80.field370 - class298.field5066, var80.field375 + var80.field369 - class287.field4923, var80.field364, var5, (class284) null);
                    } else if (var80.field377 == 256) {
                        int var81 = var80.field379 - class82.field1311;
                        int var82 = var80.field370 - class298.field5066;
                        int var83 = var80.field375 - class287.field4923;
                        int var84 = var80.field376;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class271.field4640) {
                                class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                            }
                            var80.field371.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var80.field366 + var81, var82, var80.field369 + var83, var80.field364, var5, (class284) null);
                        } else if (var80.field373 != null) {
                            if (class271.field4640) {
                                class53.method438(class82.field1311, class298.field5066, class287.field4923, var5, var3, var4);
                            }
                            var80.field373.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var81, var82, var83, var80.field364, var5, (class284) null);
                        }
                    }
                }
                class278 var87 = var2.field212;
                if (var87 != null) {
                    if ((var87.field4765 & var2.field211) != 0 && !class164.method1276(var6, var3, var4, var87.field4765)) {
                        if (class271.field4640) {
                            class53.method435(var87.field4765, class82.field1311, class298.field5066, class287.field4923, var6, var3, var4);
                        }
                        var87.field4774.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var87.field4782 - class82.field1311, var87.field4775 - class298.field5066, var87.field4777 - class287.field4923, var87.field4780, var5, (class284) null);
                    }
                    if ((var87.field4773 & var2.field211) != 0 && !class164.method1276(var6, var3, var4, var87.field4773)) {
                        if (class271.field4640) {
                            class53.method435(var87.field4773, class82.field1311, class298.field5066, class287.field4923, var6, var3, var4);
                        }
                        var87.field4779.method326(0, class180.field3020, class138.field2295, class293.field4978, class72.field1175, var87.field4782 - class82.field1311, var87.field4775 - class298.field5066, var87.field4777 - class287.field4923, var87.field4780, var5, (class284) null);
                    }
                }
            }
            if (var5 < class161.field2732 - 1) {
                class11 var88 = class203.field3382[var5 + 1][var3][var4];
                if (var88 != null && var88.field224) {
                    class167.field2825.method1258(0, var88);
                }
            }
            if (var3 < class106.field1703) {
                class11 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field224) {
                    class167.field2825.method1258(0, var89);
                }
            }
            if (var4 < class175.field2932) {
                class11 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field224) {
                    class167.field2825.method1258(0, var90);
                }
            }
            if (var3 > class106.field1703) {
                class11 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field224) {
                    class167.field2825.method1258(0, var91);
                }
            }
            if (var4 > class175.field2932) {
                class11 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field224) {
                    class167.field2825.method1258(0, var92);
                }
            }
        }
    }
}
