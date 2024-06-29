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

@OriginalClass("client!cf")
public abstract class class235 {

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Leg;")
    public static class37 field4047 = class174.method1167(")3runescape)3com)4l=", 59);

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
    public static int[] field4055 = new int[50];

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[I")
    public static int[] field4048 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field4056 = -2;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Ljl;")
    public static class101 field4049;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[[S")
    public static short[][] field4050;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBLgj;)V")
    public static final void method1611(int arg0, byte arg1, class247 arg2) {
        if (arg1 < 86) {
            method1615(103);
        }
        field4053++;
        while (true) {
            class230 var3 = (class230) class117.field1987.method1566(-3);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3938; var5++) {
                if (var3.field3937[var5] != null) {
                    if (var3.field3937[var5].field4488 == 2) {
                        var3.field3939[var5] = -5;
                    }
                    if (var3.field3937[var5].field4488 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3933[var5] != null) {
                    if (var3.field3933[var5].field4488 == 2) {
                        var3.field3939[var5] = -6;
                    }
                    if (var3.field3933[var5].field4488 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method1697(arg0, 123);
            arg2.method1292(0, (byte) -64);
            int var6 = arg2.field3169;
            arg2.method1272(27862, var3.field3945);
            for (int var7 = 0; var7 < var3.field3938; var7++) {
                if (var3.field3939[var7] == 0) {
                    try {
                        int var8 = var3.field3940[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3937[var7].field4483;
                            int var13 = var12.getInt((Object) null);
                            arg2.method1292(0, (byte) -64);
                            arg2.method1272(27862, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3937[var7].field4483;
                            var11.setInt((Object) null, var3.field3941[var7]);
                            arg2.method1292(0, (byte) -64);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field3937[var7].field4483;
                            int var10 = var9.getModifiers();
                            arg2.method1292(0, (byte) -64);
                            arg2.method1272(27862, var10);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field3933[var7].field4483;
                            byte[][] var15 = var3.field3942[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg2.method1292(0, (byte) -64);
                            } else if ((var19 instanceof Number)) {
                                arg2.method1292(1, (byte) -64);
                                arg2.method1256(((Number) var19).longValue(), (byte) 84);
                            } else if ((var19 instanceof class37)) {
                                arg2.method1292(2, (byte) -64);
                                arg2.method1289((class37) var19, -66);
                            } else {
                                arg2.method1292(4, (byte) -64);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field3933[var7].field4483;
                            int var21 = var20.getModifiers();
                            arg2.method1292(0, (byte) -64);
                            arg2.method1272(27862, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1292(-10, (byte) -64);
                    } catch (InvalidClassException var23) {
                        arg2.method1292(-11, (byte) -64);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1292(-12, (byte) -64);
                    } catch (OptionalDataException var25) {
                        arg2.method1292(-13, (byte) -64);
                    } catch (IllegalAccessException var26) {
                        arg2.method1292(-14, (byte) -64);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1292(-15, (byte) -64);
                    } catch (InvocationTargetException var28) {
                        arg2.method1292(-16, (byte) -64);
                    } catch (SecurityException var29) {
                        arg2.method1292(-17, (byte) -64);
                    } catch (IOException var30) {
                        arg2.method1292(-18, (byte) -64);
                    } catch (NullPointerException var31) {
                        arg2.method1292(-19, (byte) -64);
                    } catch (Exception var32) {
                        arg2.method1292(-20, (byte) -64);
                    } catch (Throwable var33) {
                        arg2.method1292(-21, (byte) -64);
                    }
                } else {
                    arg2.method1292(var3.field3939[var7], (byte) -64);
                }
            }
            arg2.method1297((byte) 33, var6);
            arg2.method1296(252, arg2.field3169 - var6);
            var3.method441(16773377);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)Leg;")
    public static final class37 method1612(int arg0, boolean arg1) {
        field4051++;
        class37 var2 = new class37();
        var2.field599 = new byte[arg0];
        var2.field576 = 0;
        if (arg1) {
            method1613(-51, (byte) -53);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
    public static final void method1613(int arg0, byte arg1) {
        if (class62.field1014 == null) {
            class62.field1014 = new byte[4][104][104];
        }
        field4054++;
        for (int var2 = arg0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class62.field1014[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public abstract void method480(int arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([Laf;ZB)V")
    public static final void method1614(class165[] arg0, boolean arg1, byte arg2) {
        field4052++;
        if (!arg1) {
            for (int var3 = 0; var3 < 4; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    for (int var5 = 0; var5 < 104; var5++) {
                        if ((class241.field4312[var3][var4][var5] & 0x1) == 1) {
                            int var6 = var3;
                            if ((class241.field4312[1][var4][var5] & 0x2) == 2) {
                                var6 = var3 - 1;
                            }
                            if (var6 >= 0) {
                                arg0[var6].method1100(-122, var5, var4);
                            }
                        }
                    }
                }
            }
            class186.field3114 += (int) (Math.random() * 5.0D) - 2;
            if (class186.field3114 < -16) {
                class186.field3114 = -16;
            }
            class223.field3832 += (int) (Math.random() * 5.0D) - 2;
            if (class223.field3832 < -8) {
                class223.field3832 = -8;
            }
            if (class223.field3832 > 8) {
                class223.field3832 = 8;
            }
            if (class186.field3114 > 16) {
                class186.field3114 = 16;
            }
        }
        byte var7;
        if (arg1) {
            var7 = 1;
        } else {
            var7 = 4;
        }
        int var8 = class223.field3832 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int var10 = class186.field3114 >> 1;
        int[][] var11 = new int[104][104];
        if (arg2 != 93) {
            return;
        }
        for (int var12 = 0; var12 < var7; var12++) {
            byte[][] var51 = class10.field173[var12];
            int var52 = (int) Math.sqrt(5100.0D);
            int var53 = var52 * 768 >> 8;
            for (int var54 = 1; var54 < 103; var54++) {
                for (int var100 = 1; var100 < 103; var100++) {
                    byte var101 = 74;
                    int var102 = class218.field3754[var12][var100 + 1][var54] - class218.field3754[var12][var100 - 1][var54];
                    int var103 = class218.field3754[var12][var100][var54 + 1] - class218.field3754[var12][var100][var54 - 1];
                    int var104 = (int) Math.sqrt((double) (var102 * var102 + (var103 * var103) + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = (var103 << 8) / var104;
                    int var107 = (var51[var100 - 1][var54] >> 2) + (var51[var100 + 1][var54] >> 3) + (var51[var100][var54 + -1] >> 2) + (var51[var100][var54 - -1] >> 3) + (var51[var100][var54] >> 1);
                    int var108 = -65536 / var104;
                    int var109 = (var106 * -50 + var105 * -50 + var108 * -10) / var53 + var101;
                    var11[var100][var54] = var109 - var107;
                }
            }
            for (int var55 = 0; var55 < 104; var55++) {
                class61.field1004[var55] = 0;
                class191.field3287[var55] = 0;
                class108.field1715[var55] = 0;
                class222.field3820[var55] = 0;
                class109.field1778[var55] = 0;
            }
            for (int var56 = -5; var56 < 104; var56++) {
                for (int var85 = 0; var85 < 104; var85++) {
                    int var94 = var56 + 5;
                    int var10002;
                    if (var94 < 104) {
                        int var95 = class174.field2910[var12][var94][var85] & 0xFF;
                        if (var95 > 0) {
                            class185 var96 = class289.method1942(var95 - 1, 4);
                            class61.field1004[var85] += var96.field3109;
                            class191.field3287[var85] += var96.field3104;
                            class108.field1715[var85] += var96.field3101;
                            class222.field3820[var85] += var96.field3103;
                            var10002 = class109.field1778[var85]++;
                        }
                    }
                    int var97 = var56 - 5;
                    if (var97 >= 0) {
                        int var98 = class174.field2910[var12][var97][var85] & 0xFF;
                        if (var98 > 0) {
                            class185 var99 = class289.method1942(var98 - 1, 4);
                            class61.field1004[var85] -= var99.field3109;
                            class191.field3287[var85] -= var99.field3104;
                            class108.field1715[var85] -= var99.field3101;
                            class222.field3820[var85] -= var99.field3103;
                            var10002 = class109.field1778[var85]--;
                        }
                    }
                }
                if (var56 >= 0) {
                    int var86 = 0;
                    int var87 = 0;
                    int var88 = 0;
                    int var89 = 0;
                    int var90 = 0;
                    for (int var91 = -5; var91 < 104; var91++) {
                        int var92 = var91 - 5;
                        int var93 = var91 + 5;
                        if (var93 < 104) {
                            var90 += class222.field3820[var93];
                            var89 += class109.field1778[var93];
                            var87 += class108.field1715[var93];
                            var88 += class61.field1004[var93];
                            var86 += class191.field3287[var93];
                        }
                        if (var92 >= 0) {
                            var89 -= class109.field1778[var92];
                            var87 -= class108.field1715[var92];
                            var88 -= class61.field1004[var92];
                            var86 -= class191.field3287[var92];
                            var90 -= class222.field3820[var92];
                        }
                        if (var91 >= 0 && var89 > 0) {
                            var9[var56][var91] = class171.method1149(var88 * 256 / var90, 192, var87 / var89, var86 / var89);
                        }
                    }
                }
            }
            for (int var57 = 1; var57 < 103; var57++) {
                for (int var58 = 1; var58 < 103; var58++) {
                    if (arg1 || class72.method492(-2001) || (class241.field4312[0][var57][var58] & 0x2) != 0 || (class241.field4312[var12][var57][var58] & 0x10) == 0 && class188.method1304(var12, var58, (byte) -93, var57) == class73.field1149) {
                        if (var12 < class271.field4758) {
                            class271.field4758 = var12;
                        }
                        int var59 = class174.field2910[var12][var57][var58] & 0xFF;
                        int var60 = class265.field4657[var12][var57][var58] & 0xFF;
                        if (var59 > 0 || var60 > 0) {
                            int var61 = class218.field3754[var12][var57][var58];
                            int var62 = class218.field3754[var12][var57 + 1][var58];
                            int var63 = class218.field3754[var12][var57 + 1][var58 + 1];
                            int var64 = class218.field3754[var12][var57][var58 + 1];
                            if (var12 > 0) {
                                boolean var65 = true;
                                if (var59 == 0 && class30.field432[var12][var57][var58] != 0) {
                                    var65 = false;
                                }
                                if (var60 > 0 && !class152.method1037(var60 - 1, arg2 + -89).field1840) {
                                    var65 = false;
                                }
                                if (var65 && var61 == var62 && var61 == var63 && var61 == var64) {
                                    class228.field3925[var12][var57][var58] = class94.method617(class228.field3925[var12][var57][var58], 4);
                                }
                            }
                            int var66;
                            int var67;
                            if (var59 <= 0) {
                                var66 = 0;
                                var67 = -1;
                            } else {
                                var67 = var9[var57][var58];
                                int var68 = (var67 & 0x7F) + var10;
                                if (var68 < 0) {
                                    var68 = 0;
                                } else if (var68 > 127) {
                                    var68 = 127;
                                }
                                int var69 = (var8 + var67 & 0xFC00) - (-(var67 & 0x380) - var68);
                                var66 = class76.field1183[class7.method43(var69, 96, (byte) -99)];
                            }
                            int var70 = var11[var57][var58];
                            int var71 = var11[var57 + 1][var58 + 1];
                            int var72 = var11[var57 + 1][var58];
                            int var73 = var11[var57][var58 + 1];
                            if (var60 == 0) {
                                class127.method905(var12, var57, var58, 0, 0, -1, var61, var62, var63, var64, class7.method43(var67, var70, (byte) -126), class7.method43(var67, var72, (byte) -108), class7.method43(var67, var71, (byte) -117), class7.method43(var67, var73, (byte) -83), 0, 0, 0, 0, var66, 0);
                            } else {
                                int var74 = class30.field432[var12][var57][var58] + 1;
                                byte var75 = client.field1894[var12][var57][var58];
                                class110 var76 = class152.method1037(var60 - 1, 4);
                                int var77 = var76.field1843;
                                if (var77 >= 0 && !class76.field1196.method708(true, var77)) {
                                    var77 = -1;
                                }
                                int var78;
                                int var81;
                                if (var77 >= 0) {
                                    var78 = -1;
                                    var81 = class76.field1183[class263.method1779(96, -120, class76.field1196.method717(0, var77))];
                                } else if (var76.field1846 == -1) {
                                    var78 = -2;
                                    var81 = 0;
                                } else {
                                    var78 = var76.field1846;
                                    int var79 = (var78 & 0x7F) + var10;
                                    if (var79 < 0) {
                                        var79 = 0;
                                    } else if (var79 > 127) {
                                        var79 = 127;
                                    }
                                    int var80 = (var78 + var8 & 0xFC00) + var79 + (var78 & 0x380);
                                    var81 = class76.field1183[class263.method1779(96, -116, var80)];
                                }
                                if (var76.field1839 >= 0) {
                                    int var82 = var76.field1839;
                                    int var83 = (var82 & 0x7F) + var10;
                                    if (var83 < 0) {
                                        var83 = 0;
                                    } else if (var83 > 127) {
                                        var83 = 127;
                                    }
                                    int var84 = (var8 + var82 & 0xFC00) + (var82 & 0x380) + var83;
                                    var81 = class76.field1183[class263.method1779(96, -117, var84)];
                                }
                                class127.method905(var12, var57, var58, var74, var75, var77, var61, var62, var63, var64, class7.method43(var67, var70, (byte) -94), class7.method43(var67, var72, (byte) -78), class7.method43(var67, var71, (byte) -110), class7.method43(var67, var73, (byte) -104), class263.method1779(var70, -117, var78), class263.method1779(var72, -117, var78), class263.method1779(var71, -116, var78), class263.method1779(var73, arg2 - 212, var78), var66, var81);
                            }
                        }
                    }
                }
            }
            class174.field2910[var12] = null;
            class265.field4657[var12] = null;
            class30.field432[var12] = null;
            client.field1894[var12] = null;
            class10.field173[var12] = null;
        }
        class117.method835(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var50 = 0; var50 < 104; var50++) {
                if ((class241.field4312[1][var13][var50] & 0x2) == 2) {
                    class126.method902(var13, var50);
                }
            }
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 <= 104; var15++) {
                for (int var16 = 0; var16 <= 104; var16++) {
                    if ((class228.field3925[var14][var16][var15] & 0x1) != 0) {
                        int var17 = var15;
                        int var18 = var14;
                        int var19;
                        for (var19 = var15; var19 > 0 && (class228.field3925[var14][var16][var19 - 1] & 0x1) != 0; var19--) {
                        }
                        while (var17 < 104 && (class228.field3925[var14][var16][var17 + 1] & 0x1) != 0) {
                            var17++;
                        }
                        label352: while (var18 > 0) {
                            for (int var20 = var19; var20 <= var17; var20++) {
                                if ((class228.field3925[var18 - 1][var16][var20] & 0x1) == 0) {
                                    break label352;
                                }
                            }
                            var18--;
                        }
                        int var21;
                        label340: for (var21 = var14; var21 < 3; var21++) {
                            for (int var22 = var19; var22 <= var17; var22++) {
                                if ((class228.field3925[var21 + 1][var16][var22] & 0x1) == 0) {
                                    break label340;
                                }
                            }
                        }
                        int var23 = (var21 - (var18 - 1)) * (var17 + 1 - var19);
                        if (var23 >= 8) {
                            short var24 = 240;
                            int var25 = class218.field3754[var21][var16][var19] - var24;
                            int var26 = class218.field3754[var18][var16][var19];
                            class111.method779(1, var16 * 128, var16 * 128, var19 * 128, var17 * 128 + 128, var25, var26);
                            for (int var27 = var18; var27 <= var21; var27++) {
                                for (int var28 = var19; var28 <= var17; var28++) {
                                    class228.field3925[var27][var16][var28] = class96.method626(class228.field3925[var27][var16][var28], -2);
                                }
                            }
                        }
                    }
                    if ((class228.field3925[var14][var16][var15] & 0x2) != 0) {
                        int var29;
                        for (var29 = var16; var29 > 0 && (class228.field3925[var14][var29 - 1][var15] & 0x2) != 0; var29--) {
                        }
                        int var30 = var14;
                        int var31 = var16;
                        int var32 = var14;
                        while (var31 < 104 && (class228.field3925[var14][var31 + 1][var15] & 0x2) != 0) {
                            var31++;
                        }
                        label405: while (var30 > 0) {
                            for (int var33 = var29; var33 <= var31; var33++) {
                                if ((class228.field3925[var30 - 1][var33][var15] & 0x2) == 0) {
                                    break label405;
                                }
                            }
                            var30--;
                        }
                        label394: while (var32 < 3) {
                            for (int var34 = var29; var34 <= var31; var34++) {
                                if ((class228.field3925[var32 + 1][var34][var15] & 0x2) == 0) {
                                    break label394;
                                }
                            }
                            var32++;
                        }
                        int var35 = (var32 + 1 - var30) * (var31 + 1 - var29);
                        if (var35 >= 8) {
                            short var36 = 240;
                            int var37 = class218.field3754[var32][var29][var15] - var36;
                            int var38 = class218.field3754[var30][var29][var15];
                            class111.method779(2, var29 * 128, var31 * 128 + 128, var15 * 128, var15 * 128, var37, var38);
                            for (int var39 = var30; var39 <= var32; var39++) {
                                for (int var40 = var29; var40 <= var31; var40++) {
                                    class228.field3925[var39][var40][var15] = class96.method626(class228.field3925[var39][var40][var15], -3);
                                }
                            }
                        }
                    }
                    if ((class228.field3925[var14][var16][var15] & 0x4) != 0) {
                        int var41 = var16;
                        int var42 = var16;
                        int var43 = var15;
                        int var44 = var15;
                        while (var43 > 0 && (class228.field3925[var14][var16][var43 - 1] & 0x4) != 0) {
                            var43--;
                        }
                        while (var44 < 104 && (class228.field3925[var14][var16][var44 + 1] & 0x4) != 0) {
                            var44++;
                        }
                        label459: while (var41 > 0) {
                            for (int var45 = var43; var45 <= var44; var45++) {
                                if ((class228.field3925[var14][var41 - 1][var45] & 0x4) == 0) {
                                    break label459;
                                }
                            }
                            var41--;
                        }
                        label448: while (var42 < 104) {
                            for (int var46 = var43; var46 <= var44; var46++) {
                                if ((class228.field3925[var14][var42 + 1][var46] & 0x4) == 0) {
                                    break label448;
                                }
                            }
                            var42++;
                        }
                        if (((var42 + 1 - var41) * (var44 + 1 - var43)) >= 4) {
                            int var47 = class218.field3754[var14][var41][var43];
                            class111.method779(4, var41 * 128, var42 * 128 + 128, var43 * 128, var44 * 128 + 128, var47, var47);
                            for (int var48 = var41; var48 <= var42; var48++) {
                                for (int var49 = var43; var49 <= var44; var49++) {
                                    class228.field3925[var14][var48][var49] = class96.method626(class228.field3925[var14][var48][var49], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static void method1615(int arg0) {
        field4050 = null;
        if (arg0 != -14869) {
            field4055 = null;
        }
        field4047 = null;
        field4055 = null;
        field4049 = null;
        field4048 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)I")
    public abstract int method481(int arg0, byte arg1, int arg2);
}
