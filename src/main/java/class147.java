import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class147 extends class130 {

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lqj;")
    public static class196 field2316 = class80.method502("Lade Sprites )2 ", -48);

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "Lqj;")
    public static class196 field2326 = class80.method502("", -48);

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "J")
    public long field2327;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Lmb;")
    public class147 field2321;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "Lmb;")
    public class147 field2324;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Lub;")
    public static class43 field2329;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lra;")
    public static class69 field2317;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIJ)Lqj;")
    public static final class196 method916(boolean arg0, int arg1, int arg2, long arg3) {
        field2320++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        int var5 = 1;
        long var6 = arg3 / (long) arg2;
        while (var6 != 0L) {
            var6 /= arg2;
            var5++;
        }
        int var8 = var5;
        if (arg3 < 0L || arg0) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg3 < 0L) {
            var9[0] = 45;
        } else if (arg0) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg3 % (long) arg2);
            arg3 /= arg2;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class196 var11 = new class196();
        if (arg1 != 24120) {
            field2329 = null;
        }
        var11.field3459 = var8;
        var11.field3448 = var9;
        return var11;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)V")
    public static final void method917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2318++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg0 * arg0;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = (var6 + 1) * var16;
        int var18 = (arg5 - 1) * var15;
        int var19 = ((var6 << 1) + 3) * var10;
        int var20 = ((arg5 << 1) - 3) * var11;
        if (class93.field1361 <= arg1 && arg1 <= class23.field291) {
            int var21 = class186.method1217(class188.field3296, class95.field1388, arg3 + arg0, 18291);
            int var22 = class186.method1217(class188.field3296, class95.field1388, arg3 - arg0, 18291);
            class25.method147(arg4, 7, var22, class95.field1380[arg1], var21);
        }
        if (arg2 != 1454204322) {
            return;
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var19;
                    var14 += var17;
                    var17 += var16;
                    var19 += var16;
                }
            }
            var7--;
            int var23 = arg1 - var7;
            if (var14 < 0) {
                var14 += var17;
                var17 += var16;
                var6++;
                var13 += var19;
                var19 += var16;
            }
            var14 += -var20;
            var20 -= var15;
            int var24 = arg1 + var7;
            var13 += -var18;
            var18 -= var15;
            if (class93.field1361 <= var24 && class23.field291 >= var23) {
                int var25 = class186.method1217(class188.field3296, class95.field1388, arg3 + var6, 18291);
                int var26 = class186.method1217(class188.field3296, class95.field1388, arg3 - var6, 18291);
                if (var23 >= class93.field1361) {
                    class25.method147(arg4, 7, var26, class95.field1380[var23], var25);
                }
                if (class23.field291 >= var24) {
                    class25.method147(arg4, 7, var26, class95.field1380[var24], var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILai;Z)V")
    public static final void method918(int arg0, class77 arg1, boolean arg2) {
        if (class50.field595 != null) {
            try {
                class50.field595.method481(true);
            } catch (Exception var8) {
            }
            class50.field595 = null;
        }
        class50.field595 = arg1;
        class244.method1666(arg2, 1517387372);
        class252.field4456 = 0;
        field2322++;
        class132.field1888 = null;
        class253.field4481 = null;
        if (arg0 >= -122) {
            method918(4, null, true);
        }
        class27.field339.field699 = 0;
        while (true) {
            class182 var3 = (class182) class45.field534.method1554(6539);
            if (var3 == null) {
                while (true) {
                    class182 var4 = (class182) class203.field3656.method1554(6539);
                    if (var4 == null) {
                        if (class76.field1098 != 0) {
                            try {
                                class56 var5 = new class56(4);
                                var5.method329((byte) 22, 4);
                                var5.method329((byte) 89, class76.field1098);
                                var5.method310(0, -69);
                                class50.field595.method484(var5.field693, 4, 0, 3);
                            } catch (IOException var7) {
                                try {
                                    class50.field595.method481(true);
                                } catch (Exception var6) {
                                }
                                class50.field595 = null;
                                class165.field2686++;
                            }
                        }
                        class169.field2852 = 0;
                        class64.field888 = class183.method1195((byte) 125);
                        return;
                    }
                    class234.field4154.method35((byte) 125, var4);
                    class105.field1518.method1552(var4, var4.field1850, 0);
                    class8.field84--;
                    class192.field3366++;
                }
            }
            class236.field4196.method1552(var3, var3.field1850, 0);
            class72.field1045--;
            class45.field542++;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method919(int arg0) {
        field2329 = null;
        field2316 = null;
        field2326 = null;
        field2317 = null;
        if (arg0 != 0) {
            method919(114);
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public final void method920(int arg0) {
        field2328++;
        if (this.field2321 == null) {
            return;
        }
        this.field2321.field2324 = this.field2324;
        this.field2324.field2321 = this.field2321;
        this.field2321 = null;
        if (arg0 == -2) {
            this.field2324 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z[Lbh;I)V")
    public static final void method921(boolean arg0, class153[] arg1, int arg2) {
        if (!arg0) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class88.field1300[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class88.field1300[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg1[var6].method957(var4, var5, -110);
                            }
                        }
                    }
                }
            }
            class80.field1154 += (int) (Math.random() * 5.0D) - 2;
            class40.field458 += (int) (Math.random() * 5.0D) - 2;
            if (class80.field1154 < -16) {
                class80.field1154 = -16;
            }
            if (class40.field458 < -8) {
                class40.field458 = -8;
            }
            if (class80.field1154 > 16) {
                class80.field1154 = 16;
            }
            if (class40.field458 > 8) {
                class40.field458 = 8;
            }
        }
        byte var7;
        if (arg0) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class40.field458 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int[][] var10 = new int[104][104];
        int var11 = -88 % ((arg2 - 29) / 35);
        int var12 = class80.field1154 >> 1;
        field2319++;
        for (int var13 = 0; var13 < var7; var13++) {
            byte[][] var56 = class45.field538[var13];
            int var57 = (int) Math.sqrt(5100.0D);
            int var58 = var57 * 768 >> 8;
            for (int var59 = 1; var59 < 103; var59++) {
                for (int var107 = 1; var107 < 103; var107++) {
                    int var108 = class42.field480[var13][var107 + 1][var59] - class42.field480[var13][var107 - 1][var59];
                    int var109 = class42.field480[var13][var107][var59 + 1] - class42.field480[var13][var107][var59 - 1];
                    byte var110 = 74;
                    int var111 = (int) Math.sqrt((double) (var109 * var109 + var108 * var108 + 65536));
                    int var112 = (var108 << 8) / var111;
                    int var113 = -65536 / var111;
                    int var114 = (var109 << 8) / var111;
                    int var115 = (var56[var107][var59 + 1] >> 3) + (var56[var107 - 1][var59] >> 2) + (var56[var107][var59 + -1] >> 2) + (var56[var107 + 1][var59] >> 3) + (var56[var107][var59] >> 1);
                    int var116 = (var114 * -50 + var112 * -50 + var113 * -10) / var58 + var110;
                    var10[var107][var59] = var116 - var115;
                }
            }
            for (int var60 = 0; var60 < 104; var60++) {
                class258.field4524[var60] = 0;
                class18.field206[var60] = 0;
                class172.field2902[var60] = 0;
                class152.field2451[var60] = 0;
                class18.field211[var60] = 0;
            }
            for (int var61 = -5; var61 < 104; var61++) {
                for (int var92 = 0; var92 < 104; var92++) {
                    int var101 = var61 + 5;
                    int var10002;
                    if (var101 < 104) {
                        int var102 = class150.field2415[var13][var101][var92] & 0xFF;
                        if (var102 > 0) {
                            class25 var103 = class223.method1511(var102 - 1, (byte) -19);
                            class258.field4524[var92] += var103.field314;
                            class18.field206[var92] += var103.field322;
                            class172.field2902[var92] += var103.field328;
                            class152.field2451[var92] += var103.field318;
                            var10002 = class18.field211[var92]++;
                        }
                    }
                    int var104 = var61 - 5;
                    if (var104 >= 0) {
                        int var105 = class150.field2415[var13][var104][var92] & 0xFF;
                        if (var105 > 0) {
                            class25 var106 = class223.method1511(var105 - 1, (byte) -19);
                            class258.field4524[var92] -= var106.field314;
                            class18.field206[var92] -= var106.field322;
                            class172.field2902[var92] -= var106.field328;
                            class152.field2451[var92] -= var106.field318;
                            var10002 = class18.field211[var92]--;
                        }
                    }
                }
                if (var61 >= 0) {
                    int var93 = 0;
                    int var94 = 0;
                    int var95 = 0;
                    int var96 = 0;
                    int var97 = 0;
                    for (int var98 = -5; var98 < 104; var98++) {
                        int var99 = var98 + 5;
                        if (var99 < 104) {
                            var93 += class18.field206[var99];
                            var97 += class18.field211[var99];
                            var95 += class258.field4524[var99];
                            var96 += class152.field2451[var99];
                            var94 += class172.field2902[var99];
                        }
                        int var100 = var98 - 5;
                        if (var100 >= 0) {
                            var95 -= class258.field4524[var100];
                            var96 -= class152.field2451[var100];
                            var93 -= class18.field206[var100];
                            var94 -= class172.field2902[var100];
                            var97 -= class18.field211[var100];
                        }
                        if (var98 >= 0 && var97 > 0) {
                            var9[var61][var98] = class189.method1231(var94 / var97, var93 / var97, (byte) -76, var95 * 256 / var96);
                        }
                    }
                }
            }
            for (int var62 = 1; var62 < 103; var62++) {
                for (int var65 = 1; var65 < 103; var65++) {
                    if (arg0 || class9.method37(0) || (class88.field1300[0][var62][var65] & 0x2) != 0 || (class88.field1300[var13][var62][var65] & 0x10) == 0 && class180.method1181(11647, var13, var65, var62) == class67.field948) {
                        if (class101.field1447 > var13) {
                            class101.field1447 = var13;
                        }
                        int var66 = class150.field2415[var13][var62][var65] & 0xFF;
                        int var67 = class87.field1287[var13][var62][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class42.field480[var13][var62][var65];
                            int var69 = class42.field480[var13][var62 + 1][var65 + 1];
                            int var70 = class42.field480[var13][var62 + 1][var65];
                            int var71 = class42.field480[var13][var62][var65 + 1];
                            if (var13 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class195.field3433[var13][var62][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class84.method527(-103, var67 - 1).field187) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var70 && var68 == var69 && var68 == var71) {
                                    class225.field4038[var13][var62][var65] = class1.method6(class225.field4038[var13][var62][var65], 2340);
                                }
                            }
                            int var73;
                            int var76;
                            if (var66 > 0) {
                                var73 = var9[var62][var65];
                                int var74 = (var73 & 0x7F) + var12;
                                if (var74 < 0) {
                                    var74 = 0;
                                } else if (var74 > 127) {
                                    var74 = 127;
                                }
                                int var75 = (var73 + var8 & 0xFC00) + (var73 & 0x380) + var74;
                                var76 = class15.field165[class168.method1089((byte) -88, var75, 96)];
                            } else {
                                var76 = 0;
                                var73 = -1;
                            }
                            int var77 = var10[var62][var65];
                            int var78 = var10[var62 + 1][var65];
                            int var79 = var10[var62 + 1][var65 + 1];
                            int var80 = var10[var62][var65 + 1];
                            if (var67 == 0) {
                                class81.method506(var13, var62, var65, 0, 0, -1, var68, var70, var69, var71, class168.method1089((byte) -88, var73, var77), class168.method1089((byte) -88, var73, var78), class168.method1089((byte) -88, var73, var79), class168.method1089((byte) -88, var73, var80), 0, 0, 0, 0, var76, 0);
                            } else {
                                int var81 = class195.field3433[var13][var62][var65] + 1;
                                byte var82 = class10.field107[var13][var62][var65];
                                class17 var83 = class84.method527(103, var67 - 1);
                                int var84 = var83.field197;
                                if (var84 >= 0 && !class15.field171.method1202(206, var84)) {
                                    var84 = -1;
                                }
                                int var85;
                                int var86;
                                if (var84 >= 0) {
                                    var85 = class15.field165[class144.method891(96, 126, class15.field171.method1203(-79, var84))];
                                    var86 = -1;
                                } else if (var83.field190 == -1) {
                                    var86 = -2;
                                    var85 = 0;
                                } else {
                                    var86 = var83.field190;
                                    int var87 = (var86 & 0x7F) + var12;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 127) {
                                        var87 = 127;
                                    }
                                    int var88 = (var8 + var86 & 0xFC00) + (var86 & 0x380) + var87;
                                    var85 = class15.field165[class144.method891(96, 126, var88)];
                                }
                                if (var83.field201 >= 0) {
                                    int var89 = var83.field201;
                                    int var90 = (var89 & 0x7F) + var12;
                                    if (var90 < 0) {
                                        var90 = 0;
                                    } else if (var90 > 127) {
                                        var90 = 127;
                                    }
                                    int var91 = (var89 + var8 & 0xFC00) + (var89 & 0x380) + var90;
                                    var85 = class15.field165[class144.method891(96, 126, var91)];
                                }
                                class81.method506(var13, var62, var65, var81, var82, var84, var68, var70, var69, var71, class168.method1089((byte) -88, var73, var77), class168.method1089((byte) -88, var73, var78), class168.method1089((byte) -88, var73, var79), class168.method1089((byte) -88, var73, var80), class144.method891(var77, 126, var86), class144.method891(var78, 126, var86), class144.method891(var79, 126, var86), class144.method891(var80, 126, var86), var76, var85);
                            }
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var63 = 1; var63 < 103; var63++) {
                    for (int var64 = 1; var64 < 103; var64++) {
                        if ((class88.field1300[0][var64][var63] & 0x2) == 0) {
                            class225.method1522(var13, var64, var63, class180.method1181(11647, var13, var63, var64));
                        } else {
                            class225.method1522(var13, var64, var63, 0);
                        }
                    }
                }
            }
            class150.field2415[var13] = null;
            class87.field1287[var13] = null;
            class195.field3433[var13] = null;
            class10.field107[var13] = null;
            class45.field538[var13] = null;
        }
        class28.method157(-50, -10, -50);
        if (arg0) {
            return;
        }
        for (int var14 = 0; var14 < 104; var14++) {
            for (int var55 = 0; var55 < 104; var55++) {
                if ((class88.field1300[1][var14][var55] & 0x2) == 2) {
                    class157.method992(var14, var55);
                }
            }
        }
        int var15 = 1;
        int var16 = 2;
        int var17 = 4;
        for (int var18 = 0; var18 < 4; var18++) {
            if (var18 > 0) {
                var15 <<= 0x3;
                var16 <<= 0x3;
                var17 <<= 0x3;
            }
            for (int var19 = 0; var19 <= var18; var19++) {
                for (int var20 = 0; var20 <= 104; var20++) {
                    for (int var21 = 0; var21 <= 104; var21++) {
                        if ((class225.field4038[var19][var21][var20] & var15) != 0) {
                            int var22;
                            for (var22 = var20; var22 > 0 && (class225.field4038[var19][var21][var22 - 1] & var15) != 0; var22--) {
                            }
                            int var23;
                            for (var23 = var20; var23 < 104 && (class225.field4038[var19][var21][var23 + 1] & var15) != 0; var23++) {
                            }
                            int var24;
                            label374: for (var24 = var19; var24 > 0; var24--) {
                                for (int var25 = var22; var25 <= var23; var25++) {
                                    if ((var15 & class225.field4038[var24 - 1][var21][var25]) == 0) {
                                        break label374;
                                    }
                                }
                            }
                            int var26;
                            label362: for (var26 = var19; var26 < var18; var26++) {
                                for (int var27 = var22; var27 <= var23; var27++) {
                                    if ((var15 & class225.field4038[var26 + 1][var21][var27]) == 0) {
                                        break label362;
                                    }
                                }
                            }
                            int var28 = (var23 + 1 - var22) * (var26 + 1 + -var24);
                            if (var28 >= 8) {
                                short var29 = 240;
                                int var30 = class42.field480[var26][var21][var22] - var29;
                                int var31 = class42.field480[var24][var21][var22];
                                class1.method4(var18, 1, var21 * 128, var21 * 128, var22 * 128, var23 * 128 + 128, var30, var31);
                                for (int var32 = var24; var32 <= var26; var32++) {
                                    for (int var33 = var22; var33 <= var23; var33++) {
                                        class225.field4038[var32][var21][var33] = class65.method409(class225.field4038[var32][var21][var33], ~var15);
                                    }
                                }
                            }
                        }
                        if ((class225.field4038[var19][var21][var20] & var16) != 0) {
                            int var34;
                            for (var34 = var21; var34 > 0 && (var16 & class225.field4038[var19][var34 - 1][var20]) != 0; var34--) {
                            }
                            int var35 = var19;
                            int var36;
                            for (var36 = var21; var36 < 104 && (class225.field4038[var19][var36 + 1][var20] & var16) != 0; var36++) {
                            }
                            int var37 = var19;
                            label429: while (var35 > 0) {
                                for (int var38 = var34; var38 <= var36; var38++) {
                                    if ((class225.field4038[var35 - 1][var38][var20] & var16) == 0) {
                                        break label429;
                                    }
                                }
                                var35--;
                            }
                            label418: while (var37 < var18) {
                                for (int var39 = var34; var39 <= var36; var39++) {
                                    if ((var16 & class225.field4038[var37 + 1][var39][var20]) == 0) {
                                        break label418;
                                    }
                                }
                                var37++;
                            }
                            int var40 = (var37 + 1 - var35) * (-var34 + var36 + 1);
                            if (var40 >= 8) {
                                short var41 = 240;
                                int var42 = class42.field480[var35][var34][var20];
                                int var43 = class42.field480[var37][var34][var20] - var41;
                                class1.method4(var18, 2, var34 * 128, var36 * 128 + 128, var20 * 128, var20 * 128, var43, var42);
                                for (int var44 = var35; var44 <= var37; var44++) {
                                    for (int var45 = var34; var45 <= var36; var45++) {
                                        class225.field4038[var44][var45][var20] = class65.method409(class225.field4038[var44][var45][var20], ~var16);
                                    }
                                }
                            }
                        }
                        if ((var17 & class225.field4038[var19][var21][var20]) != 0) {
                            int var46 = var21;
                            int var47 = var21;
                            int var48 = var20;
                            int var49 = var20;
                            while (var48 > 0 && (var17 & class225.field4038[var19][var21][var48 - 1]) != 0) {
                                var48--;
                            }
                            while (var49 < 104 && (var17 & class225.field4038[var19][var21][var49 + 1]) != 0) {
                                var49++;
                            }
                            label484: while (var46 > 0) {
                                for (int var50 = var48; var50 <= var49; var50++) {
                                    if ((var17 & class225.field4038[var19][var46 - 1][var50]) == 0) {
                                        break label484;
                                    }
                                }
                                var46--;
                            }
                            label473: while (var47 < 104) {
                                for (int var51 = var48; var51 <= var49; var51++) {
                                    if ((class225.field4038[var19][var47 + 1][var51] & var17) == 0) {
                                        break label473;
                                    }
                                }
                                var47++;
                            }
                            if ((var49 + 1 - var48) * (var47 + 1 + -var46) >= 4) {
                                int var52 = class42.field480[var19][var46][var48];
                                class1.method4(var18, 4, var46 * 128, var47 * 128 + 128, var48 * 128, var49 * 128 + 128, var52, var52);
                                for (int var53 = var46; var53 <= var47; var53++) {
                                    for (int var54 = var48; var54 <= var49; var54++) {
                                        class225.field4038[var19][var53][var54] = class65.method409(class225.field4038[var19][var53][var54], ~var17);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
