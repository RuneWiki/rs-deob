import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class149 {

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[I")
    public static int[] field2741 = new int[50];

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Llc;")
    public static class143 field2745 = class66.method374("RuneScape wird geladen )2 bitte warten)3)3)3", -1);

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Llc;")
    public static class143 field2749 = class66.method374(":", -1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public int field2750;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lmk;")
    public static class255 field2739;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)I")
    public static final int method965(int arg0, byte arg1) {
        if (arg1 != 21) {
            field2739 = null;
        }
        field2748++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILmg;B)V")
    public static final void method966(int arg0, class134 arg1, byte arg2) {
        field2746++;
        if (arg2 >= -100) {
            field2740 = -4;
        }
        while (true) {
            class144 var3 = (class144) class79.field1429.method1294(false);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2573; var5++) {
                if (var3.field2575[var5] != null) {
                    if (var3.field2575[var5].field3241 == 2) {
                        var3.field2581[var5] = -5;
                    }
                    if (var3.field2575[var5].field3241 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2591[var5] != null) {
                    if (var3.field2591[var5].field3241 == 2) {
                        var3.field2581[var5] = -6;
                    }
                    if (var3.field2591[var5].field3241 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method799(103, arg0);
            arg1.method1276(844519173, 0);
            int var6 = arg1.field3487;
            arg1.method1280(-116, var3.field2585);
            for (int var7 = 0; var7 < var3.field2573; var7++) {
                if (var3.field2581[var7] == 0) {
                    try {
                        int var8 = var3.field2578[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2575[var7].field3239;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1276(844519173, 0);
                            arg1.method1280(-118, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2575[var7].field3239;
                            var13.setInt((Object) null, var3.field2582[var7]);
                            arg1.method1276(844519173, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2575[var7].field3239;
                            int var12 = var11.getModifiers();
                            arg1.method1276(844519173, 0);
                            arg1.method1280(-127, var12);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2591[var7].field3239;
                            byte[][] var15 = var3.field2574[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method1276(844519173, 0);
                            } else if ((var19 instanceof Number)) {
                                arg1.method1276(844519173, 1);
                                arg1.method1243(((Number) var19).longValue(), 82);
                            } else if ((var19 instanceof class143)) {
                                arg1.method1276(844519173, 2);
                                arg1.method1255((class143) var19, (byte) 0);
                            } else {
                                arg1.method1276(844519173, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2591[var7].field3239;
                            int var21 = var20.getModifiers();
                            arg1.method1276(844519173, 0);
                            arg1.method1280(-114, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method1276(844519173, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method1276(844519173, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method1276(844519173, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method1276(844519173, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method1276(844519173, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method1276(844519173, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method1276(844519173, -16);
                    } catch (SecurityException var29) {
                        arg1.method1276(844519173, -17);
                    } catch (IOException var30) {
                        arg1.method1276(844519173, -18);
                    } catch (NullPointerException var31) {
                        arg1.method1276(844519173, -19);
                    } catch (Exception var32) {
                        arg1.method1276(844519173, -20);
                    } catch (Throwable var33) {
                        arg1.method1276(844519173, -21);
                    }
                } else {
                    arg1.method1276(844519173, var3.field2581[var7]);
                }
            }
            arg1.method1286(1161846856, var6);
            arg1.method1263(0, arg1.field3487 - var6);
            var3.method349(0);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILh;I)V")
    private final void method967(int arg0, class190 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2750 = arg1.method1275(128);
            this.field2737 = arg1.method1265(114);
            this.field2738 = arg1.method1265(125);
        }
        field2743++;
        if (arg0 != -969277712) {
            field2749 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIII[Lvh;)V")
    public static final void method968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class43[] arg9) {
        field2742++;
        class260.method1738(arg8, arg0, arg7, arg2);
        class196.method1353();
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class43 var12 = arg9[var10];
            if (var12 != null && (var12.field789 == arg6 || arg6 == -1412584499 && class50.field996 == var12)) {
                int var13;
                if (arg5 == -1) {
                    class255.field4572[class128.field2260] = var12.field873 + arg1;
                    class176.field3151[class128.field2260] = var12.field748 + arg3;
                    class133.field2330[class128.field2260] = var12.field735;
                    class237.field4306[class128.field2260] = var12.field831;
                    var13 = class128.field2260++;
                } else {
                    var13 = arg5;
                }
                var12.field863 = var13;
                var12.field744 = class146.field2635;
                if (!var12.field786 || !client.method1505(var12)) {
                    if (var12.field862 > 0) {
                        class271.method1790(var12, false);
                    }
                    int var14 = var12.field873 + arg1;
                    int var15 = var12.field818;
                    int var16 = var12.field748 + arg3;
                    if (class184.field3341 && (client.method1514(var12) != 0 || var12.field769 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class50.field996 == var12) {
                        if (arg6 != -1412584499 && !var12.field767) {
                            class76.field1419 = arg9;
                            class237.field4304 = arg1;
                            class271.field4840 = arg3;
                            continue;
                        }
                        if (!var12.field767) {
                            var15 = 128;
                        }
                        if (class39.field672 && class176.field3144) {
                            int var17 = class235.field4292;
                            int var18 = var17 - class10.field212;
                            int var19 = class158.field2859;
                            int var20 = var19 - class185.field3369;
                            if (var18 < class79.field1432) {
                                var18 = class79.field1432;
                            }
                            if ((class79.field1432 + class129.field2278.field735) < (var12.field735 + var18)) {
                                var18 = class129.field2278.field735 + class79.field1432 - var12.field735;
                            }
                            if (class140.field2440 > var20) {
                                var20 = class140.field2440;
                            }
                            var14 = var18;
                            if ((var12.field831 + var20) > (class140.field2440 + class129.field2278.field831)) {
                                var20 = class140.field2440 + class129.field2278.field831 - var12.field831;
                            }
                            var16 = var20;
                        }
                    }
                    int var21;
                    int var22;
                    int var25;
                    int var26;
                    if (var12.field769 == 2) {
                        var25 = arg7;
                        var26 = arg2;
                        var21 = arg0;
                        var22 = arg8;
                    } else {
                        var21 = var16 <= arg0 ? arg0 : var16;
                        var22 = arg8 < var14 ? var14 : arg8;
                        int var23 = var14 + var12.field735;
                        int var24 = var12.field831 + var16;
                        if (var12.field769 == 9) {
                            var23++;
                            var24++;
                        }
                        var25 = var23 < arg7 ? var23 : arg7;
                        var26 = var24 < arg2 ? var24 : arg2;
                    }
                    if (!var12.field786 || var22 < var25 && var21 < var26) {
                        if (var12.field862 != 0) {
                            if (var12.field862 == 1337) {
                                class9.field185 = var12;
                                class18.field320 = var14;
                                class195.field3614 = var16;
                                class95.method557(var16, var12.field735, 3848, var12.field831, var12.field862 == 1403, var14);
                                class260.method1738(arg8, arg0, arg7, arg2);
                                continue;
                            }
                            if (var12.field862 == 1338) {
                                if (!var12.method270((byte) -125)) {
                                    continue;
                                }
                                class172.method1127(var13, var14, var12, (byte) -77, var16);
                                class260.method1738(arg8, arg0, arg7, arg2);
                                if (class155.field2794 != 0 && class155.field2794 != 3 || class139.field2415 || var22 > class251.field4522 || var21 > class12.field233 || class251.field4522 >= var25 || var26 <= class12.field233) {
                                    continue;
                                }
                                int var27 = class251.field4522 - var14;
                                int var28 = class12.field233 - var16;
                                int var29 = var12.field779[var28];
                                if (var27 < var29 || var29 + var12.field826[var28] < var27) {
                                    continue;
                                }
                                int var30 = var28 - var12.field831 / 2;
                                int var31 = var27 - var12.field735 / 2;
                                int var32 = class184.field3339 + class137.field2400 & 0x7FF;
                                int var33 = class196.field3635[var32];
                                int var34 = class196.field3630[var32];
                                int var35 = (class230.field4211 + 256) * var33 >> 8;
                                int var36 = (class230.field4211 + 256) * var34 >> 8;
                                int var37 = var30 * var36 - (var31 * var35) >> 11;
                                int var38 = var30 * var35 + var31 * var36 >> 11;
                                int var39 = class229.field4195.field4108 - var37 >> 7;
                                int var40 = class229.field4195.field4178 + var38 >> 7;
                                if (class71.field1351 && (class106.field1864 & 0x40) != 0) {
                                    class43 var41 = class185.method1211(-126, class58.field1113, class254.field4564);
                                    if (var41 == null) {
                                        class7.method49(22461);
                                    } else {
                                        class75.method432((short) 12, class55.field1067, var40, true, class179.field3204, var39, 1L);
                                    }
                                    continue;
                                }
                                if (class153.field2764 == 1) {
                                    class75.method432((short) 50, class64.field1210, var40, true, class21.field342, var39, 1L);
                                }
                                class75.method432((short) 46, class33.field556, var40, true, class21.field342, var39, 1L);
                                continue;
                            }
                            if (var12.field862 == 1339) {
                                if (var12.method270((byte) -122)) {
                                    class107.method649(var14, var16, var13, var12, true);
                                    class260.method1738(arg8, arg0, arg7, arg2);
                                }
                                continue;
                            }
                            if (var12.field862 == 1400) {
                                class29.method197(var12.field735, (byte) 118, var16, var14, var12.field831);
                                class69.field1323[var13] = true;
                                class136.field2384[var13] = true;
                                class260.method1738(arg8, arg0, arg7, arg2);
                                continue;
                            }
                            if (var12.field862 == 1401) {
                                class277.method1820(var14, var16, var12.field735, var12.field831, (byte) 127);
                                class69.field1323[var13] = true;
                                class136.field2384[var13] = true;
                                class260.method1738(arg8, arg0, arg7, arg2);
                                continue;
                            }
                            if (var12.field862 == 1402) {
                                class178.method1171(65280, var14, var16);
                                class69.field1323[var13] = true;
                                class136.field2384[var13] = true;
                                continue;
                            }
                            if (var12.field862 == 1405) {
                                if (!class194.field3593) {
                                    continue;
                                }
                                int var42 = var12.field735 + var14;
                                int var43 = var16 + 15;
                                class134.field2341.method1320(class25.method179(0, new class143[] { class51.field1017, class274.method1806(class250.field4507, true) }), var42, var43, 16776960, -1);
                                int var131 = var43 + 15;
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                int var46 = 0;
                                int var47 = 0;
                                int var48 = 0;
                                int var49 = 16776960;
                                if (var45 > 65536) {
                                    var49 = 16711680;
                                }
                                class134.field2341.method1320(class25.method179(0, new class143[] { class171.field3066, class274.method1806(var45, true), class201.field3674 }), var42, var131, var49, -1);
                                var43 = var131 + 15;
                                int var50 = 16776960;
                                for (int var51 = 0; var51 < 28; var51++) {
                                    var46 += class136.field2395[var51].method928(80);
                                    var47 += class136.field2395[var51].method939(127);
                                    var48 += class136.field2395[var51].method931(-20324);
                                }
                                int var52 = var48 * 100 / var46;
                                int var53 = var47 * 10000 / var46;
                                class143 var54 = class25.method179(0, new class143[] { class44.field893, class247.method1635(104, 0, true, 2, (long) var53), class86.field1581, class274.method1806(var52, true), class132.field2322 });
                                class256.field4608.method1320(var54, var42, var43, var50, -1);
                                var43 += 12;
                                if (class125.field2200 > 0) {
                                    class256.field4608.method1320(class25.method179(0, new class143[] { class263.field4691, class274.method1806(class125.field2191, true), class252.field4545, class274.method1806(class125.field2200, true) }), var42, var43, var50, -1);
                                }
                                var43 += 12;
                                class69.field1323[var13] = true;
                                class136.field2384[var13] = true;
                                continue;
                            }
                            if (var12.field862 == 1406) {
                                class75.field1398 = var16;
                                class165.field2964 = var14;
                                class272.field4856 = var12;
                                continue;
                            }
                        }
                        if (!class139.field2415) {
                            if (var12.field769 == 0 && var12.field726 && class251.field4522 >= var22 && var21 <= class12.field233 && var25 > class251.field4522 && class12.field233 < var26 && !class184.field3341) {
                                class122.field2147[0] = 1004;
                                class132.field2319[0] = class234.field4264;
                                class257.field4625 = 1;
                                class136.field2382[0] = class21.field342;
                            }
                            if (class251.field4522 >= var22 && class12.field233 >= var21 && var25 > class251.field4522 && var26 > class12.field233) {
                                class264.method1760(52, class251.field4522 - var14, -var16 + class12.field233, var12);
                            }
                        }
                        if (var12.field769 == 0) {
                            if (!var12.field786 && client.method1505(var12) && class126.field2230 != var12) {
                                continue;
                            }
                            if (!var12.field786) {
                                if ((var12.field732 - var12.field831) < var12.field882) {
                                    var12.field882 = var12.field732 - var12.field831;
                                }
                                if (var12.field882 < 0) {
                                    var12.field882 = 0;
                                }
                            }
                            method968(var21, var14 - var12.field879, var26, var16 - var12.field882, -82, var13, var12.field722, var25, var22, arg9);
                            if (var12.field885 != null) {
                                method968(var21, var14 - var12.field879, var26, var16 - var12.field882, 85, var13, var12.field722, var25, var22, var12.field885);
                            }
                            class163 var55 = (class163) class212.field3942.method1824((long) var12.field722, 0);
                            if (var55 != null) {
                                if (var55.field2921 == 0 && !class139.field2415 && class251.field4522 >= var22 && var21 <= class12.field233 && class251.field4522 < var25 && var26 > class12.field233 && !class184.field3341) {
                                    class122.field2147[0] = 1004;
                                    class257.field4625 = 1;
                                    class132.field2319[0] = class234.field4264;
                                    class136.field2382[0] = class21.field342;
                                }
                                class101.method601(var21, var26, var16, var13, var22, 80, var55.field2929, var14, var25);
                            }
                            class260.method1738(arg8, arg0, arg7, arg2);
                            class196.method1353();
                        }
                        if (class136.field2391[var13] || class57.field1109 > 1) {
                            if (var12.field769 == 0 && !var12.field786 && var12.field732 > var12.field831) {
                                class83.method478(var16, 44, var12.field732, var12.field735 + var14, var12.field882, var12.field831);
                            }
                            if (var12.field769 != 1) {
                                if (var12.field769 == 2) {
                                    int var56 = 0;
                                    for (int var57 = 0; var57 < var12.field809; var57++) {
                                        for (int var58 = 0; var58 < var12.field739; var58++) {
                                            int var59 = (var12.field791 + 32) * var58 + var14;
                                            int var60 = (var12.field871 + 32) * var57 + var16;
                                            if (var56 < 20) {
                                                var60 += var12.field731[var56];
                                                var59 += var12.field850[var56];
                                            }
                                            if (var12.field737[var56] > 0) {
                                                boolean var62 = false;
                                                boolean var63 = false;
                                                int var64 = var12.field737[var56] - 1;
                                                if ((var59 + 32) > arg8 && arg7 > var59 && var60 + 32 > arg0 && var60 < arg2 || class165.field2966 == var12 && class15.field269 == var56) {
                                                    class230 var65;
                                                    if (class175.field3132 == 1 && class162.field2912 == var56 && class179.field3198 == var12.field722) {
                                                        var65 = class70.method405(var12.field764, 2, (byte) -42, var64, var12.field889[var56], 0);
                                                    } else {
                                                        var65 = class70.method405(var12.field764, 1, (byte) -42, var64, var12.field889[var56], 3153952);
                                                    }
                                                    if (class196.field3643) {
                                                        class69.field1323[var13] = true;
                                                    }
                                                    if (var65 == null) {
                                                        class141.method844((byte) 44, var12);
                                                    } else if (class165.field2966 == var12 && class15.field269 == var56) {
                                                        int var66 = class158.field2859 - class40.field685;
                                                        int var67 = class235.field4292 - class56.field1085;
                                                        if (var67 < 5 && var67 > -5) {
                                                            var67 = 0;
                                                        }
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (class71.field1342 < 5) {
                                                            var66 = 0;
                                                            var67 = 0;
                                                        }
                                                        var65.method1051(var59 + var67, var60 + var66, 128);
                                                        if (arg6 != -1) {
                                                            class43 var68 = arg9[arg6 & 0xFFFF];
                                                            int var69 = class260.field4657;
                                                            int var70 = class260.field4653;
                                                            if (var70 > var60 + var66 && var68.field882 > 0) {
                                                                int var71 = (var70 - var66 - var60) * class128.field2252 / 3;
                                                                if ((class128.field2252 * 10) < var71) {
                                                                    var71 = class128.field2252 * 10;
                                                                }
                                                                if (var68.field882 < var71) {
                                                                    var71 = var68.field882;
                                                                }
                                                                class40.field685 += var71;
                                                                var68.field882 -= var71;
                                                                class141.method844((byte) -122, var68);
                                                            }
                                                            if ((var60 - (-var66 - 32)) > var69 && (var68.field732 - var68.field831) > var68.field882) {
                                                                int var72 = (var66 + var60 + 32 - var69) * class128.field2252 / 3;
                                                                if ((class128.field2252 * 10) < var72) {
                                                                    var72 = class128.field2252 * 10;
                                                                }
                                                                if (var68.field732 - var68.field831 - var68.field882 < var72) {
                                                                    var72 = var68.field732 - var68.field831 - var68.field882;
                                                                }
                                                                var68.field882 += var72;
                                                                class40.field685 -= var72;
                                                                class141.method844((byte) -45, var68);
                                                            }
                                                        }
                                                    } else if (class283.field4994 == var12 && class3.field41 == var56) {
                                                        var65.method1051(var59, var60, 128);
                                                    } else {
                                                        var65.method1058(var59, var60);
                                                    }
                                                }
                                            } else if (var12.field778 != null && var56 < 20) {
                                                class230 var61 = var12.method272(var56, 10456);
                                                if (var61 != null) {
                                                    var61.method1058(var59, var60);
                                                } else if (class219.field3992) {
                                                    class141.method844((byte) 108, var12);
                                                }
                                            }
                                            var56++;
                                        }
                                    }
                                } else if (var12.field769 == 3) {
                                    int var73;
                                    if (class195.method1341(var12, 124)) {
                                        var73 = var12.field819;
                                        if (class126.field2230 == var12 && var12.field738 != 0) {
                                            var73 = var12.field738;
                                        }
                                    } else {
                                        var73 = var12.field773;
                                        if (class126.field2230 == var12 && var12.field837 != 0) {
                                            var73 = var12.field837;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var12.field725) {
                                            class260.method1726(var14, var16, var12.field735, var12.field831, var73);
                                        } else {
                                            class260.method1729(var14, var16, var12.field735, var12.field831, var73);
                                        }
                                    } else if (var12.field725) {
                                        class260.method1728(var14, var16, var12.field735, var12.field831, var73, 256 - (var15 & 0xFF));
                                    } else {
                                        class260.method1722(var14, var16, var12.field735, var12.field831, var73, 256 - (var15 & 0xFF));
                                    }
                                } else if (var12.field769 == 4) {
                                    class193 var74 = var12.method262(class9.field171, 122);
                                    if (var74 != null) {
                                        class143 var75 = var12.field723;
                                        int var76;
                                        if (class195.method1341(var12, 126)) {
                                            var76 = var12.field819;
                                            if (class126.field2230 == var12 && var12.field738 != 0) {
                                                var76 = var12.field738;
                                            }
                                            if (var12.field878.method913((byte) 45) > 0) {
                                                var75 = var12.field878;
                                            }
                                        } else {
                                            var76 = var12.field773;
                                            if (class126.field2230 == var12 && var12.field837 != 0) {
                                                var76 = var12.field837;
                                            }
                                        }
                                        if (var12.field786 && var12.field851 != -1) {
                                            class148 var77 = class262.method1743(var12.field851, 17366);
                                            var75 = var77.field2681;
                                            if (var75 == null) {
                                                var75 = class248.field4453;
                                            }
                                            if ((var77.field2693 == 1 || var12.field801 != 1) && var12.field801 != -1) {
                                                var75 = class25.method179(0, new class143[] { class245.field4390, var75, class247.field4428, class64.method367(var12.field801, -4) });
                                            }
                                        }
                                        if (class281.field4937 == var12) {
                                            var75 = class274.field4874;
                                            var76 = var12.field773;
                                        }
                                        if (!var12.field786) {
                                            var75 = class59.method343(var12, var75, true);
                                        }
                                        var74.method1315(var75, var14, var16, var12.field735, var12.field831, var76, var12.field814 ? 0 : -1, var12.field753, var12.field868, var12.field838);
                                    } else if (class219.field3992) {
                                        class141.method844((byte) -125, var12);
                                    }
                                } else if (var12.field769 == 5) {
                                    if (var12.field786) {
                                        class230 var78;
                                        if (var12.field851 == -1) {
                                            var78 = var12.method263((byte) 97, false);
                                        } else {
                                            var78 = class70.method405(var12.field764, var12.field806, (byte) -42, var12.field851, var12.field801, var12.field784);
                                        }
                                        if (var78 != null) {
                                            int var79 = var78.field4209;
                                            int var80 = var78.field4206;
                                            if (var12.field749) {
                                                int var82 = (var12.field831 + var80 - 1) / var80;
                                                int var83 = (var12.field735 - (1 - var79)) / var79;
                                                class260.method1717(var14, var16, var14 + var12.field735, var12.field831 + var16);
                                                for (int var84 = 0; var84 < var83; var84++) {
                                                    for (int var85 = 0; var85 < var82; var85++) {
                                                        if (var12.field734 != 0) {
                                                            var78.method1567(4096, var12.field734, var79 / 2 + var79 * var84 + var14, (byte) -121, var80 / 2 + var80 * var85 + var16);
                                                        } else if (var15 == 0) {
                                                            var78.method1058(var79 * var84 + var14, var16 - -(var80 * var85));
                                                        } else {
                                                            var78.method1051(var14 + (var79 * var84), var80 * var85 + var16, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class260.method1738(arg8, arg0, arg7, arg2);
                                            } else {
                                                int var81 = var12.field735 * 4096 / var79;
                                                if (var12.field734 != 0) {
                                                    var78.method1567(var81, var12.field734, var12.field735 / 2 + var14, (byte) -128, var16 + (var12.field831 / 2));
                                                } else if (var15 != 0) {
                                                    var78.method1046(var14, var16, var12.field735, var12.field831, 256 - (var15 & 0xFF));
                                                } else if (var12.field735 == var79 && var12.field831 == var80) {
                                                    var78.method1058(var14, var16);
                                                } else {
                                                    var78.method1065(var14, var16, var12.field735, var12.field831);
                                                }
                                            }
                                        } else if (class219.field3992) {
                                            class141.method844((byte) 30, var12);
                                        }
                                    } else {
                                        class230 var86 = var12.method263((byte) 97, class195.method1341(var12, 125));
                                        if (var86 != null) {
                                            var86.method1058(var14, var16);
                                        } else if (class219.field3992) {
                                            class141.method844((byte) 45, var12);
                                        }
                                    }
                                } else if (var12.field769 == 6) {
                                    boolean var87 = class195.method1341(var12, 127);
                                    int var88;
                                    if (var87) {
                                        var88 = var12.field758;
                                    } else {
                                        var88 = var12.field853;
                                    }
                                    int var89 = 0;
                                    class150 var90 = null;
                                    if (var12.field851 != -1) {
                                        class148 var95 = class262.method1743(var12.field851, 17366);
                                        if (var95 != null) {
                                            class148 var96 = var95.method960((byte) -89, var12.field801);
                                            class104 var97 = var88 == -1 ? null : class164.method1081(var88, -21331);
                                            var90 = var96.method955(var12.field884, var97, 1, (byte) -20);
                                            if (var90 == null) {
                                                class141.method844((byte) -7, var12);
                                            } else {
                                                var89 = -var90.method166() / 2;
                                            }
                                        }
                                    } else if (var12.field785 == 5) {
                                        if (var12.field755 == -1) {
                                            var90 = class168.field2997.method680(-1, -1, -1, (class104) null, (class104) null);
                                        } else {
                                            int var92 = var12.field755 & 0x7FF;
                                            if (class134.field2352 == var92) {
                                                var92 = 2047;
                                            }
                                            class32 var93 = class6.field97[var92];
                                            class104 var94 = var88 == -1 ? null : class164.method1081(var88, -21331);
                                            if (var93 != null && ((int) var93.field518.method874(7) << 11) == (var12.field755 & 0xFFFFF800)) {
                                                var90 = var93.field516.method680(var12.field884, 0, -1, var94, (class104) null);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var90 = var12.method266(var87, (class104) null, (byte) 104, -1, class229.field4195.field516);
                                        if (var90 == null && class219.field3992) {
                                            class141.method844((byte) -123, var12);
                                        }
                                    } else {
                                        class104 var91 = class164.method1081(var88, -21331);
                                        var90 = var12.method266(var87, var91, (byte) 104, var12.field884, class229.field4195.field516);
                                        if (var90 == null && class219.field3992) {
                                            class141.method844((byte) -119, var12);
                                        }
                                    }
                                    if (var90 != null) {
                                        int var98;
                                        if (var12.field880 <= 0) {
                                            var98 = 256;
                                        } else {
                                            var98 = (var12.field831 << 8) / var12.field880;
                                        }
                                        int var99;
                                        if (var12.field829 > 0) {
                                            var99 = (var12.field735 << 8) / var12.field829;
                                        } else {
                                            var99 = 256;
                                        }
                                        int var100 = (var12.field857 * var98 >> 8) + var12.field831 / 2 + var16;
                                        int var101 = (var12.field756 * var99 >> 8) + var12.field735 / 2 + var14;
                                        class196.method1367(var101, var100);
                                        int var102 = class196.field3635[var12.field854] * var12.field869 >> 16;
                                        int var103 = class196.field3630[var12.field854] * var12.field869 >> 16;
                                        if (!var12.field786) {
                                            var90.method987(0, var12.field830, 0, var12.field854, 0, var102, var103, -1L);
                                        } else if (var12.field843) {
                                            ((class183) var90).method1195(0, var12.field830, var12.field757, var12.field854, var12.field808, var89 + var102 + var12.field860, var12.field860 + var103, var12.field869);
                                        } else {
                                            var90.method987(0, var12.field830, var12.field757, var12.field854, var12.field808, var89 + var102 + var12.field860, var12.field860 + var103, -1L);
                                        }
                                        class196.method1357();
                                    }
                                } else {
                                    if (var12.field769 == 7) {
                                        class193 var104 = var12.method262(class9.field171, 110);
                                        if (var104 == null) {
                                            if (class219.field3992) {
                                                class141.method844((byte) -19, var12);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var12.field809; var106++) {
                                            for (int var107 = 0; var107 < var12.field739; var107++) {
                                                if (var12.field737[var105] > 0) {
                                                    class148 var108 = class262.method1743(var12.field737[var105] - 1, 17366);
                                                    class143 var109;
                                                    if (var108.field2693 != 1 && var12.field889[var105] == 1) {
                                                        var109 = class25.method179(0, new class143[] { class245.field4390, var108.field2681, class218.field3987 });
                                                    } else {
                                                        var109 = class25.method179(0, new class143[] { class245.field4390, var108.field2681, class247.field4428, class64.method367(var12.field889[var105], -4) });
                                                    }
                                                    int var110 = var14 + ((var12.field791 + 115) * var107);
                                                    int var111 = (var12.field871 + 12) * var106 + var16;
                                                    if (var12.field753 == 0) {
                                                        var104.method1319(var109, var110, var111, var12.field773, var12.field814 ? 0 : -1);
                                                    } else if (var12.field753 == 1) {
                                                        var104.method1325(var109, var110 + 57, var111, var12.field773, var12.field814 ? 0 : -1);
                                                    } else {
                                                        var104.method1320(var109, var110 + 115 - 1, var111, var12.field773, var12.field814 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var12.field769 == 8 && class169.field3017 == var12 && class117.field2091 == class113.field1982) {
                                        int var112 = 0;
                                        int var113 = 0;
                                        class193 var114 = class134.field2341;
                                        class143 var115 = var12.field723;
                                        class143 var116 = class59.method343(var12, var115, true);
                                        while (var116.method913((byte) 45) > 0) {
                                            int var124 = var116.method891(-31978, class239.field4319);
                                            class143 var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = class21.field342;
                                            } else {
                                                var125 = var116.method896(var124, 0, false);
                                                var116 = var116.method863(var124 + 4, -161);
                                            }
                                            int var126 = var114.method1308(var125);
                                            if (var126 > var112) {
                                                var112 = var126;
                                            }
                                            var113 += var114.field3574 + 1;
                                        }
                                        var112 += 6;
                                        var113 += 7;
                                        int var117 = var14 + var12.field735 - var112 - 5;
                                        if (var117 < (var14 + 5)) {
                                            var117 = var14 + 5;
                                        }
                                        if (var117 + var112 > arg7) {
                                            var117 = arg7 - var112;
                                        }
                                        int var118 = var12.field831 + var16 + 5;
                                        if (arg2 < var118 + var113) {
                                            var118 = arg2 - var113;
                                        }
                                        class260.method1726(var117, var118, var112, var113, 16777120);
                                        class260.method1729(var117, var118, var112, var113, 0);
                                        class143 var119 = var12.field723;
                                        int var120 = var114.field3574 + var118 + 2;
                                        class143 var121 = class59.method343(var12, var119, true);
                                        while (var121.method913((byte) 45) > 0) {
                                            int var122 = var121.method891(-31978, class239.field4319);
                                            class143 var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = class21.field342;
                                            } else {
                                                var123 = var121.method896(var122, 0, false);
                                                var121 = var121.method863(var122 + 4, -161);
                                            }
                                            var114.method1319(var123, var117 + 3, var120, 0, -1);
                                            var120 += var114.field3574 + 1;
                                        }
                                    }
                                    if (var12.field769 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var12.field771) {
                                            var129 = var16 + var12.field831;
                                            var130 = var12.field735 + var14;
                                            var128 = var14;
                                            var127 = var16;
                                        } else {
                                            var127 = var12.field831 + var16;
                                            var128 = var14;
                                            var129 = var16;
                                            var130 = var12.field735 + var14;
                                        }
                                        if (var12.field793 == 1) {
                                            class260.method1736(var128, var129, var130, var127, var12.field773);
                                        } else {
                                            class260.method1727(var128, var129, var130, var127, var12.field773, var12.field793);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int var11 = 16 / ((-arg4 - 8) / 33);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILh;)V")
    public final void method969(int arg0, class190 arg1) {
        field2747++;
        while (true) {
            int var3 = arg1.method1265(115);
            if (var3 == 0) {
                int var4 = -87 % ((8 - arg0) / 33);
                return;
            }
            this.method967(-969277712, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method970(int arg0) {
        field2745 = null;
        int var1 = -73 / ((-arg0 - 64) / 59);
        field2741 = null;
        field2739 = null;
        field2749 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
    public static final void method971(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class176.field3159; var3++) {
            for (int var4 = 0; var4 < class36.field621; var4++) {
                for (int var5 = 0; var5 < class56.field1091; var5++) {
                    class120 var6 = class7.field122[var3][var4][var5];
                    if (var6 != null) {
                        class57 var7 = var6.field2131;
                        if (var7 != null && var7.field1105.method315()) {
                            class88.method505(var7.field1105, var3, var4, var5, 1, 1);
                            if (var7.field1099 != null && var7.field1099.method315()) {
                                class88.method505(var7.field1099, var3, var4, var5, 1, 1);
                                var7.field1105.method311(var7.field1099, 0, 0, 0, false);
                                var7.field1099 = var7.field1099.method312(arg0, arg1, arg2);
                            }
                            var7.field1105 = var7.field1105.method312(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2134; var8++) {
                            class211 var10 = var6.field2144[var8];
                            if (var10 != null && var10.field3916.method315()) {
                                class88.method505(var10.field3916, var3, var4, var5, var10.field3933 + 1 - var10.field3931, var10.field3918 - var10.field3919 + 1);
                                var10.field3916 = var10.field3916.method312(arg0, arg1, arg2);
                            }
                        }
                        class140 var9 = var6.field2129;
                        if (var9 != null && var9.field2445.method315()) {
                            class122.method741(var9.field2445, var3, var4, var5);
                            var9.field2445 = var9.field2445.method312(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
