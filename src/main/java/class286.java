import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class286 {

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "[I")
    private int[] field4431;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "[B")
    private byte[] field4423;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "[I")
    private int[] field4432;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "[I")
    public static int[] field4430 = new int[128];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([[[B[[F[[F[[I[[B[[I[[B[[I[[[I[[FI[[I[[B[[IB[[B)[Lml;", line = 4)
    public static final class16[] method1929(byte[][][] arg0, float[][] arg1, float[][] arg2, int[][] arg3, byte[][] arg4, int[][] arg5, byte[][] arg6, int[][] arg7, int[][][] arg8, float[][] arg9, int arg10, int[][] arg11, byte[][] arg12, int[][] arg13, byte arg14, byte[][] arg15) {
        field4425++;
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                int var19 = 0;
                if (arg8 != null) {
                    int var20 = arg8[arg10][var17 >> 3][var18 >> 3];
                    var19 = var20 >> 1 & 0x3;
                }
                boolean var21 = false;
                byte var22;
                if (var19 == 0) {
                    var22 = arg6[var17][var18];
                    if (var22 == 0) {
                        var22 = arg6[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg6[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg6[var17 - 1][var18 - 1];
                    }
                } else if (var19 == 1) {
                    var22 = arg6[var17][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg6[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg6[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg6[var17 - 1][var18];
                    }
                } else if (var19 == 2) {
                    var22 = arg6[var17 - 1][var18 - 1];
                    if (var22 == 0) {
                        var22 = arg6[var17][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg6[var17 - 1][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg6[var17][var18];
                    }
                } else {
                    var22 = arg6[var17 - 1][var18];
                    if (var22 == 0) {
                        var22 = arg6[var17 - 1][var18 - 1];
                    }
                    if (var22 == 0) {
                        var22 = arg6[var17][var18];
                    }
                    if (var22 == 0) {
                        var22 = arg6[var17][var18 - 1];
                    }
                }
                if (var22 != 0) {
                    class177 var23 = class179.method1127(false, (var22 & 0xFF) - 1);
                    var16[var17][var18] = (var23.field2848 + 1 << 16) + var23.field2851;
                }
            }
        }
        class39 var24 = new class39(128);
        for (int var25 = 1; var25 <= 102; var25++) {
            for (int var26 = 1; var26 <= 102; var26++) {
                if (arg6[var25][var26] != 0) {
                    int[] var27;
                    if (arg15[var25][var26] == 0) {
                        var27 = class81.field1577[0];
                    } else {
                        var27 = class118.field2051[arg4[var25][var26]];
                        if (var27.length == 0) {
                            continue;
                        }
                    }
                    int var28 = var16[var25][var26];
                    int var29 = 0;
                    int var30 = var16[var25 + 1][var26];
                    if (arg3 != null) {
                        var29 = arg3[var25][var26] & 0xFFFFFF;
                    }
                    int var31 = var16[var25 + 1][var26 + 1];
                    long var32 = (long) var29 | (long) var28 << 32;
                    long var34 = (long) var29 | (long) var30 << 32;
                    long var36 = (long) var31 << 32 | (long) var29;
                    int var38 = var27.length / 2;
                    int var39 = var16[var25][var26 + 1];
                    class16 var40 = (class16) var24.method303(var32, (byte) 127);
                    if (var40 == null) {
                        var40 = new class16((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg11 != null, var29);
                        var24.method310(var32, var40, 25357);
                    }
                    var40.field284++;
                    var40.field293 += var38;
                    if (var32 != var34) {
                        class16 var41 = (class16) var24.method303(var34, (byte) 123);
                        if (var41 == null) {
                            var41 = new class16((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg11 != null, var29);
                            var24.method310(var34, var41, 25357);
                        }
                        var41.field284++;
                        var41.field293 += var38;
                    }
                    if (var32 != var36 && var34 != var36) {
                        class16 var42 = (class16) var24.method303(var36, (byte) 106);
                        if (var42 == null) {
                            var42 = new class16((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg11 != null, var29);
                            var24.method310(var36, var42, 25357);
                        }
                        var42.field284++;
                        var42.field293 += var38;
                    }
                    long var43 = (long) var29 | (long) var39 << 32;
                    if (var32 != var43 && var34 != var43 && var36 != var43) {
                        class16 var45 = (class16) var24.method303(var43, (byte) 101);
                        if (var45 == null) {
                            var45 = new class16((var39 >> 16) - 1, (float) (var39 & 0xFFFF), false, arg11 != null, var29);
                            var24.method310(var43, var45, arg14 + 25336);
                        }
                        var45.field293 += var38;
                        var45.field284++;
                    }
                }
            }
        }
        for (class16 var46 = (class16) var24.method306(0); var46 != null; var46 = (class16) var24.method300(arg14 - 20)) {
            var46.method114();
        }
        if (arg14 != 21) {
            field4428 = -85;
        }
        for (int var47 = 1; var47 <= 102; var47++) {
            for (int var48 = 1; var48 <= 102; var48++) {
                byte var49 = arg6[var47][var48];
                if (var49 != 0) {
                    int var50;
                    if ((arg0[arg10][var47][var48] & 0x8) != 0) {
                        var50 = 0;
                    } else if ((arg0[1][var47][var48] & 0x2) == 2 && arg10 > 0) {
                        var50 = arg10 - 1;
                    } else {
                        var50 = arg10;
                    }
                    int var51 = 0;
                    int var52 = 128;
                    if (arg3 != null) {
                        var51 = arg3[var47][var48] & 0xFFFFFF;
                        var52 = arg3[var47][var48] >>> 24 << 3;
                    }
                    boolean[] var53 = null;
                    int[] var54;
                    byte var55;
                    if (arg15[var47][var48] == 0) {
                        var54 = class81.field1577[0];
                        byte var56 = 0;
                        int var57 = var56 + (arg6[var47 - 1][var48 - 1] == var49 ? 1 : -1);
                        byte var58 = 0;
                        byte var59 = 0;
                        int var60 = var59 + (arg6[var47 + 1][var48 - 1] == var49 ? 1 : -1);
                        if (arg6[var47][var48 - 1] == var49) {
                            var60++;
                            var57++;
                        } else {
                            var60--;
                            var57--;
                        }
                        byte var61 = 0;
                        int var62 = var58 + (arg6[var47 + 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg6[var47 + 1][var48] == var49) {
                            var60++;
                            var62++;
                        } else {
                            var62--;
                            var60--;
                        }
                        int var63 = var61 + (arg6[var47 - 1][var48 + 1] == var49 ? 1 : -1);
                        if (arg6[var47][var48 + 1] == var49) {
                            var63++;
                            var62++;
                        } else {
                            var63--;
                            var62--;
                        }
                        if (arg6[var47 - 1][var48] == var49) {
                            var63++;
                            var57++;
                        } else {
                            var63--;
                            var57--;
                        }
                        int var64 = var57 - var62;
                        int var65 = var60 - var63;
                        if (var65 < 0) {
                            var65 = -var65;
                        }
                        if (var64 < 0) {
                            var64 = -var64;
                        }
                        var55 = (byte) (var64 < var65 ? 1 : 0);
                        arg12[var47][var48] = var55;
                    } else {
                        var54 = class118.field2051[arg4[var47][var48]];
                        var55 = arg12[var47][var48];
                        var53 = class38.field735[arg4[var47][var48]];
                        if (var54.length == 0) {
                            continue;
                        }
                    }
                    int var66 = var16[var47][var48];
                    int var67 = var16[var47 + 1][var48];
                    int var68 = var16[var47 + 1][var48 + 1];
                    int var69 = var16[var47][var48 + 1];
                    long var70 = (long) var66 << 32 | (long) var51;
                    long var72 = (long) var51 | (long) var67 << 32;
                    long var74 = (long) var51 | (long) var68 << 32;
                    long var76 = (long) var51 | (long) var69 << 32;
                    int var78 = arg7[var47][var48];
                    int var79 = arg7[var47 + 1][var48 + 1];
                    int var80 = arg7[var47 + 1][var48];
                    int var81 = arg5[var47 + 1][var48];
                    int var82 = arg7[var47][var48 + 1];
                    int var83 = arg5[var47][var48];
                    int var84 = arg5[var47][var48 + 1];
                    int var85 = arg5[var47 + 1][var48 + 1];
                    int var86 = (var66 >> 16) - 1;
                    int var87 = (var67 >> 16) - 1;
                    int var88 = (var68 >> 16) - 1;
                    class16 var89 = (class16) var24.method303(var70, (byte) 108);
                    int var90 = (var69 >> 16) - 1;
                    class148.method971(arg11, var69 >= var66, var89, class174.method1095(var79, var85, 14327, var86), class174.method1095(var78, var83, 14327, var86), arg1, class174.method1095(var80, var81, 14327, var86), var48, var47, var66 <= var66, var55, class174.method1095(var82, var84, 14327, var86), var53, var52, var54, var66 <= var68, var67 >= var66, arg2, var50, 0, arg9, arg13);
                    if (var70 != var72) {
                        class16 var91 = (class16) var24.method303(var72, (byte) 111);
                        class148.method971(arg11, var69 >= var67, var91, class174.method1095(var79, var85, 14327, var87), class174.method1095(var78, var83, 14327, var87), arg1, class174.method1095(var80, var81, arg14 + 14306, var87), var48, var47, var66 >= var67, var55, class174.method1095(var82, var84, 14327, var87), var53, var52, var54, var68 >= var67, var67 >= var67, arg2, var50, 0, arg9, arg13);
                    }
                    if (var70 != var74 && var72 != var74) {
                        class16 var92 = (class16) var24.method303(var74, (byte) 122);
                        class148.method971(arg11, var68 <= var69, var92, class174.method1095(var79, var85, 14327, var88), class174.method1095(var78, var83, 14327, var88), arg1, class174.method1095(var80, var81, 14327, var88), var48, var47, var66 >= var68, var55, class174.method1095(var82, var84, 14327, var88), var53, var52, var54, var68 >= var68, var67 >= var68, arg2, var50, 0, arg9, arg13);
                    }
                    if (var70 != var76 && var72 != var76 && var74 != var76) {
                        class16 var93 = (class16) var24.method303(var76, (byte) 125);
                        class148.method971(arg11, var69 <= var69, var93, class174.method1095(var79, var85, arg14 + 14306, var90), class174.method1095(var78, var83, arg14 + 14306, var90), arg1, class174.method1095(var80, var81, 14327, var90), var48, var47, var66 >= var69, var55, class174.method1095(var82, var84, 14327, var90), var53, var52, var54, var69 <= var68, var69 <= var67, arg2, var50, 0, arg9, arg13);
                    }
                }
            }
        }
        for (class16 var94 = (class16) var24.method306(0); var94 != null; var94 = (class16) var24.method300(1)) {
            if (var94.field287 == 0) {
                var94.method278((byte) -105);
            } else {
                var94.method120();
            }
        }
        int var95 = var24.method304(-119);
        class16[] var96 = new class16[var95];
        var24.method301((byte) 42, var96);
        long[] var97 = new long[var95];
        for (int var98 = 0; var98 < var95; var98++) {
            var97[var98] = var96[var98].field702;
        }
        class200.method1280(var96, 2, var97);
        return var96;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 457)
    public static void method1930(int arg0) {
        field4430 = null;
        int var1 = -82 % ((44 - arg0) / 57);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 466)
    public static final void method1931(int arg0) {
        field4422++;
        if (arg0 != -1) {
            field4428 = 82;
        }
        class6.field133.method1877(-29702);
        class28.field533.method1877(-29702);
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V", line = 483)
    public static final void method1932(int arg0) {
        for (int var1 = arg0; var1 < class285.field4417; var1++) {
            int var2 = class131.field2226[var1];
            class255 var3 = class8.field179[var2];
            if (var3 != null) {
                class72.method557(var3, 0, var3.field3991.field882);
            }
        }
        field4427++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB[BI[B)I", line = 507)
    public final int method1933(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, byte[] arg5) {
        int var7 = arg0 + arg1;
        int var8 = 0;
        field4421++;
        int var9 = arg4 << 3;
        if (arg2 != 35) {
            this.field4431 = (int[]) null;
        }
        while (var7 > arg1) {
            int var10 = arg3[arg1] & 0xFF;
            int var11 = this.field4431[var10];
            byte var12 = this.field4423[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var8 = class212.method1434(var16, var11 >>> var17));
            if (var13 < var15) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var8 = var11 >>> var14);
                        if (var15 > var13) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 583)
    public static final void method1934(byte arg0) {
        class35.field699.method1884(-22054);
        int var1 = -120 / ((arg0 + 34) / 42);
        class151.field2463.method1884(-22054);
        field4419++;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V", line = 600)
    public static final void method1935(int arg0) {
        field4429++;
        if (~class175.field2813 == arg0) {
            return;
        }
        try {
            if (++class45.field935 > 1500) {
                if (class177.field2860 != null) {
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                }
                if (class171.field2765 >= 1) {
                    class157.field2565 = -5;
                    class175.field2813 = 0;
                    return;
                }
                class45.field935 = 0;
                class175.field2813 = 1;
                class171.field2765++;
                if (class267.field4119 == class151.field2469) {
                    class151.field2469 = class97.field1722;
                } else {
                    class151.field2469 = class267.field4119;
                }
            }
            if (class175.field2813 == 1) {
                class28.field541 = class177.field2849.method806(class305.field4624, class151.field2469, -27289);
                class175.field2813 = 2;
            }
            if (class175.field2813 == 2) {
                if (class28.field541.field1852 == 2) {
                    throw new IOException();
                }
                if (class28.field541.field1852 != 1) {
                    return;
                }
                class177.field2860 = new class87((Socket) class28.field541.field1853, class177.field2849);
                class28.field541 = null;
                class177.field2860.method611((byte) 60, 0, class14.field263.field3273, class14.field263.field3249);
                if (class41.field797 != null) {
                    class41.field797.method1497(arg0 ^ 0x6B);
                }
                if (class328.field5033 != null) {
                    class328.field5033.method1497(-116);
                }
                int var1 = class177.field2860.method616((byte) -40);
                if (class41.field797 != null) {
                    class41.field797.method1497(120);
                }
                if (class328.field5033 != null) {
                    class328.field5033.method1497(arg0 + 93);
                }
                if (var1 != 101) {
                    class175.field2813 = 0;
                    class157.field2565 = var1;
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                    return;
                }
                class175.field2813 = 3;
            }
            if (class175.field2813 == 3) {
                if (class177.field2860.method608(arg0 ^ 0x45) < 2) {
                    return;
                }
                int var2 = class177.field2860.method616((byte) -80) << 8 | class177.field2860.method616((byte) -37);
                class168.method1063(var2, arg0 + 1);
                if (class109.field1940 == -1) {
                    class157.field2565 = 6;
                    class175.field2813 = 0;
                    class177.field2860.method607((byte) -76);
                    class177.field2860 = null;
                    return;
                }
                class175.field2813 = 0;
                class177.field2860.method607((byte) -76);
                class177.field2860 = null;
                class148.method970((byte) 114);
                return;
            }
        } catch (IOException var4) {
            if (class177.field2860 != null) {
                class177.field2860.method607((byte) -76);
                class177.field2860 = null;
            }
            if (class171.field2765 < 1) {
                class45.field935 = 0;
                class171.field2765++;
                if (class267.field4119 == class151.field2469) {
                    class151.field2469 = class97.field1722;
                } else {
                    class151.field2469 = class267.field4119;
                }
                class175.field2813 = 1;
            } else {
                class157.field2565 = -4;
                class175.field2813 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V", line = 746)
    public static final void method1936(int arg0) {
        int var1 = class112.field1966;
        field4426++;
        int var2 = class343.field5328;
        int var3 = class42.field813;
        byte var4 = 20;
        int var5 = class187.field3033 - 3;
        if (class132.field2236 == null || class75.field1527 == null) {
            if (class154.field2514.method2051(arg0 - 97, class335.field5136) && class154.field2514.method2051(arg0 - 87, class2.field36)) {
                class132.field2236 = class90.method619(-67, class154.field2514, class335.field5136, 0);
                class75.field1527 = class90.method619(-94, class154.field2514, class2.field36, 0);
                if (class249.field3893) {
                    if ((class132.field2236 instanceof class300)) {
                        class132.field2236 = new class98((class206) class132.field2236);
                    } else {
                        class132.field2236 = new class137((class206) class132.field2236);
                    }
                    if (class75.field1527 instanceof class300) {
                        class75.field1527 = new class98((class206) class75.field1527);
                    } else {
                        class75.field1527 = new class137((class206) class75.field1527);
                    }
                }
            } else if (class249.field3893) {
                class115.method763(var1, var2, var3, var4, class183.field2935, 256 - class208.field3365);
            } else {
                class270.method1801(var1, var2, var3, var4, class183.field2935, 256 - class208.field3365);
            }
        }
        if (class132.field2236 != null && class75.field1527 != null) {
            int var6 = (var3 - (class75.field1527.field4377 * 2)) / class132.field2236.field4377;
            for (int var7 = 0; var7 < var6; var7++) {
                class132.field2236.method901(var1 - (-class75.field1527.field4377 - class132.field2236.field4377 * var7), var2);
            }
            class75.field1527.method901(var1, var2);
            class75.field1527.method896(var3 + var1 - class75.field1527.field4377, var2);
        }
        class214.field3428.method2120(class330.field5059, var1 + 3, var2 + 14, class46.field955, -1);
        if (class249.field3893) {
            class115.method763(var1, var2 + var4, var3, var5 - var4, class183.field2935, 256 - class208.field3365);
        } else {
            class270.method1801(var1, var2 + var4, var3, var5 - var4, class183.field2935, 256 - class208.field3365);
        }
        int var8 = class120.field2083;
        int var9 = class9.field196;
        for (int var10 = 0; var10 < class48.field999; var10++) {
            int var11 = var4 + (class48.field999 - var10 - 1) * 15 + var2 + 13;
            if (var8 > var1 && var8 < var1 + var3 && var9 > (var11 - 13) && (var11 + 3) > var9) {
                if (class249.field3893) {
                    class115.method763(var1, var11 - 12, var3, 15, class172.field2769, 256 - class106.field1829);
                } else {
                    class270.method1801(var1, var11 - 12, var3, 15, class172.field2769, 256 - class106.field1829);
                }
            }
        }
        if ((class170.field2745 == null || class120.field2087 == null || class162.field2618 == null) && class154.field2514.method2051(101, class327.field5006) && class154.field2514.method2051(-124, class326.field4979) && class154.field2514.method2051(-101, class263.field4092)) {
            class170.field2745 = class90.method619(108, class154.field2514, class327.field5006, 0);
            class120.field2087 = class90.method619(-106, class154.field2514, class326.field4979, 0);
            class162.field2618 = class90.method619(103, class154.field2514, class263.field4092, 0);
            if (class249.field3893) {
                if (class170.field2745 instanceof class300) {
                    class170.field2745 = new class98((class206) class170.field2745);
                } else {
                    class170.field2745 = new class137((class206) class170.field2745);
                }
                if (class120.field2087 instanceof class300) {
                    class120.field2087 = new class98((class206) class120.field2087);
                } else {
                    class120.field2087 = new class137((class206) class120.field2087);
                }
                if ((class162.field2618 instanceof class300)) {
                    class162.field2618 = new class98((class206) class162.field2618);
                } else {
                    class162.field2618 = new class137((class206) class162.field2618);
                }
            }
        }
        if (class170.field2745 != null && class120.field2087 != null && class162.field2618 != null) {
            int var12 = (var3 - class162.field2618.field4377 * 2) / class170.field2745.field4377;
            for (int var13 = 0; var13 < var12; var13++) {
                class170.field2745.method901(class162.field2618.field4377 + var1 + (class170.field2745.field4377 * var13), var2 + var5 - class170.field2745.field4383);
            }
            int var14 = (var5 - class162.field2618.field4383 - var4) / class120.field2087.field4383;
            for (int var15 = 0; var15 < var14; var15++) {
                class120.field2087.method901(var1, class120.field2087.field4383 * var15 + var2 + var4);
                class120.field2087.method896(var1 + var3 - class120.field2087.field4377, var2 - -(class120.field2087.field4383 * var15) + var4);
            }
            class162.field2618.method901(var1, var2 + var5 - class162.field2618.field4383);
            class162.field2618.method896(var1 + var3 - class162.field2618.field4377, -class162.field2618.field4383 + var5 + var2);
        }
        for (int var16 = 0; var16 < class48.field999; var16++) {
            int var17 = class46.field955;
            int var18 = (class48.field999 - var16 - 1) * 15 + var2 + var4 + 13;
            if (var8 > var1 && var8 < (var1 + var3) && (var18 - 13) < var9 && var9 < var18 + 3) {
                var17 = class177.field2852;
            }
            class214.field3428.method2120(class50.method377(arg0 - 17401, var16), var1 + 3, var18, var17, 0);
        }
        if (arg0 == -13) {
            class328.method2273(class42.field813, (byte) 126, class343.field5328, class187.field3033, class112.field1966);
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V", line = 925)
    public class286(byte[] arg0) {
        int var2 = arg0.length;
        this.field4431 = new int[var2];
        this.field4423 = arg0;
        int var3 = 0;
        this.field4432 = new int[8];
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field4431[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class212.method1434(var12, var11);
                    }
                    var9 = var7 | var8;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field4432[var14] == 0) {
                            this.field4432[var14] = var3;
                        }
                        var14 = this.field4432[var14];
                    }
                    if (this.field4432.length <= var14) {
                        int[] var17 = new int[this.field4432.length * 2];
                        for (int var18 = 0; var18 < this.field4432.length; var18++) {
                            var17[var18] = this.field4432[var18];
                        }
                        this.field4432 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
                this.field4432[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BIII[BI)I", line = 1049)
    public final int method1937(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field4418++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg2 + arg5;
        if (arg3 >= -115) {
            field4428 = -62;
        }
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field4432[var8];
            }
            int var11;
            if ((var11 = this.field4432[var8]) < 0) {
                arg0[arg2++] = (byte) (~var11);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4432[var8];
            }
            int var12;
            if ((var12 = this.field4432[var8]) < 0) {
                arg0[arg2++] = (byte) (~var12);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4432[var8];
            }
            int var13;
            if ((var13 = this.field4432[var8]) < 0) {
                arg0[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4432[var8];
            }
            int var14;
            if ((var14 = this.field4432[var8]) < 0) {
                arg0[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4432[var8];
            }
            int var15;
            if ((var15 = this.field4432[var8]) < 0) {
                arg0[arg2++] = (byte) (~var15);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4432[var8];
            }
            int var16;
            if ((var16 = this.field4432[var8]) < 0) {
                arg0[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4432[var8];
            }
            int var17;
            if ((var17 = this.field4432[var8]) < 0) {
                arg0[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4432[var8];
            }
            int var18;
            if ((var18 = this.field4432[var8]) < 0) {
                arg0[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }
}
