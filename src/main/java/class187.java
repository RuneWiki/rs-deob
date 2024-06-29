import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class187 {

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "[B")
    public byte[] field2520 = new byte[18002];

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "[[I")
    public int[][] field2546 = new int[6][258];

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "[I")
    public int[] field2545 = new int[256];

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "[I")
    public int[] field2537 = new int[6];

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "[I")
    public int[] field2549 = new int[257];

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[[I")
    public int[][] field2524 = new int[6][258];

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "[Z")
    public boolean[] field2539 = new boolean[16];

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "[I")
    public int[] field2544 = new int[16];

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public int field2526 = 0;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "[B")
    public byte[] field2540 = new byte[4096];

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public int field2554 = 0;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "[[I")
    public int[][] field2534 = new int[6][258];

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "[[B")
    public byte[][] field2553 = new byte[6][258];

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "[Z")
    public boolean[] field2552 = new boolean[256];

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "[B")
    public byte[] field2557 = new byte[256];

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "[B")
    public byte[] field2547 = new byte[18002];

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "[Z")
    public static boolean[] field2528 = new boolean[100];

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2522 = 0;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "Z")
    public static boolean field2558;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "B")
    public byte field2519;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public int field2521;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public int field2538;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public int field2542;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public int field2555;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "[B")
    public byte[] field2523;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "[B")
    public byte[] field2532;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)V")
    public static final void method1210(byte arg0, int arg1) {
        if (arg0 >= -89) {
            field2528 = null;
        }
        class347.field4737 = 1;
        field2535++;
        class290.field4063 = arg1;
        class130.field1832 = null;
        class247.field3487 = 0;
        class106.field1473 = -1;
        class388.field5578 = false;
        class113.field1636 = -1;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIIZ[[[Ljd;I)Z")
    public static final boolean method1211(byte arg0, int arg1, int arg2, boolean arg3, class125[][][] arg4, int arg5) {
        field2550++;
        byte var6 = arg3 ? 1 : (byte) (class70.field1025 & 0xFF);
        if (class222.field3108[class142.field2034][arg5][arg1] == var6) {
            return false;
        } else if ((class368.field5193[class142.field2034][arg5][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class273.field3793[var7] = arg5;
            int var35 = var7 + 1;
            class360.field4966[var7] = arg1;
            class222.field3108[class142.field2034][arg5][arg1] = var6;
            while (var35 != var8) {
                int var9 = class273.field3793[var8] & 0xFFFF;
                int var10 = class273.field3793[var8] >> 16 & 0xFF;
                int var11 = class273.field3793[var8] >> 24 & 0xFF;
                int var12 = class360.field4966[var8] & 0xFFFF;
                int var13 = (class360.field4966[var8] & 0xFF8027) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class368.field5193[class142.field2034][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class142.field2034 + 1; var16 <= 3; var16++) {
                    if ((class368.field5193[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field1756 != null) {
                                int var20 = class453.method2818(var10, false);
                                if (arg4[var16][var9][var12].field1756.field523 == var20 || arg4[var16][var9][var12].field1761 != null && arg4[var16][var9][var12].field1761.field523 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class453.method2818(var11, false);
                                    if (arg4[var16][var9][var12].field1756.field523 == var21 || arg4[var16][var9][var12].field1761 != null && arg4[var16][var9][var12].field1761.field523 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class453.method2818(var13, false);
                                    if (arg4[var16][var9][var12].field1756.field523 == var22 || arg4[var16][var9][var12].field1761 != null && arg4[var16][var9][var12].field1761.field523 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class125 var23 = arg4[var16][var9][var12];
                            if (var23.field1749 != null) {
                                for (class123 var24 = var23.field1749; var24 != null; var24 = var24.field1711) {
                                    class447 var25 = var24.field1709;
                                    if (var25 instanceof class193) {
                                        class193 var26 = (class193) var25;
                                        int var27 = var26.method684(-13726);
                                        int var28 = var26.method672(17011);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class125 var30 = arg4[var16][var9][var12];
                        if (var30 != null && var30.field1749 != null) {
                            for (class123 var31 = var30.field1749; var31 != null; var31 = var31.field1711) {
                                class447 var32 = var31.field1709;
                                if (var32.field6272 != var32.field6261 || var32.field6264 != var32.field6258) {
                                    for (int var33 = var32.field6261; var33 <= var32.field6272; var33++) {
                                        for (int var34 = var32.field6258; var34 <= var32.field6264; var34++) {
                                            class222.field3108[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class222.field3108[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class375.field5354[class142.field2034 + 1].method737(var9, var12);
                    if (var17 > class116.field1672[arg2]) {
                        class116.field1672[arg2] = var17;
                    }
                    int var18 = var9 << 7;
                    int var19 = var12 << 7;
                    if (class304.field4203[arg2] > var18) {
                        class304.field4203[arg2] = var18;
                    } else if (class69.field1021[arg2] < var18) {
                        class69.field1021[arg2] = var18;
                    }
                    if (var19 < class164.field2269[arg2]) {
                        class164.field2269[arg2] = var19;
                    } else if (class159.field2235[arg2] < var19) {
                        class159.field2235[arg2] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class222.field3108[class142.field2034][var9 - 1][var12] != var6) {
                        class273.field3793[var35] = class393.method2487(-754974720, class393.method2487(1179648, var9 - 1));
                        class360.field4966[var35] = class393.method2487(1245184, var12);
                        class222.field3108[class142.field2034][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class290.field4061) {
                        if (var9 - 1 >= 0 && class222.field3108[class142.field2034][var9 - 1][var12] != var6 && (class368.field5193[class142.field2034][var9][var12] & 0x4) == 0 && (class368.field5193[class142.field2034][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class273.field3793[var35] = class393.method2487(class393.method2487(var9 - 1, 1179648), 1375731712);
                            class360.field4966[var35] = class393.method2487(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class222.field3108[class142.field2034][var9 - 1][var12] = var6;
                        }
                        if (class222.field3108[class142.field2034][var9][var12] != var6) {
                            class273.field3793[var35] = class393.method2487(class393.method2487(var9, 5373952), 318767104);
                            class360.field4966[var35] = class393.method2487(5439488, var12);
                            class222.field3108[class142.field2034][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class211.field2954 && class222.field3108[class142.field2034][var9 + 1][var12] != var6 && (class368.field5193[class142.field2034][var9][var12] & 0x4) == 0 && (class368.field5193[class142.field2034][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class273.field3793[var35] = class393.method2487(class393.method2487(5373952, var9 + 1), -1845493760);
                            class360.field4966[var35] = class393.method2487(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class222.field3108[class142.field2034][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class211.field2954 && class222.field3108[class142.field2034][var9 + 1][var12] != var6) {
                        class273.field3793[var35] = class393.method2487(1392508928, class393.method2487(var9 + 1, 9568256));
                        class360.field4966[var35] = class393.method2487(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class222.field3108[class142.field2034][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class222.field3108[class142.field2034][var9 - 1][var12] != var6 && (class368.field5193[class142.field2034][var9][var12] & 0x4) == 0 && (class368.field5193[class142.field2034][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class273.field3793[var35] = class393.method2487(class393.method2487(var9 - 1, 13762560), 301989888);
                            class360.field4966[var35] = class393.method2487(var12, 13828096);
                            class222.field3108[class142.field2034][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class222.field3108[class142.field2034][var9][var12] != var6) {
                            class273.field3793[var35] = class393.method2487(-1828716544, class393.method2487(13762560, var9));
                            class360.field4966[var35] = class393.method2487(var12, 13828096);
                            class222.field3108[class142.field2034][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class211.field2954 && class222.field3108[class142.field2034][var9 + 1][var12] != var6 && (class368.field5193[class142.field2034][var9][var12] & 0x4) == 0 && (class368.field5193[class142.field2034][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class273.field3793[var35] = class393.method2487(class393.method2487(var9 + 1, 9568256), -771751936);
                            class360.field4966[var35] = class393.method2487(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class222.field3108[class142.field2034][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class116.field1672[arg2] != -1000000) {
                class116.field1672[arg2] += 10;
                class304.field4203[arg2] -= 50;
                class69.field1021[arg2] += 50;
                class159.field2235[arg2] += 50;
                class164.field2269[arg2] -= 50;
            }
            if (arg0 <= 63) {
                field2522 = 124;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    public static final void method1212(int arg0, int arg1) {
        field2531++;
        class131 var2 = class406.field5774;
        synchronized (class406.field5774) {
            class406.field5774.method901(arg1, 12223);
        }
        class131 var3 = class158.field2222;
        synchronized (class158.field2222) {
            class158.field2222.method901(arg1, arg0 + 11966);
            if (arg0 != 257) {
                method1210((byte) 126, 33);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method1213(boolean arg0, int arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field2530++;
        short[] var4 = new short[arg1];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        int var7 = (arg0 ? class347.field4748 : class357.field4883) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class318 var11 = class54.method443(var8, false);
            if (var11.field4349 && var11.method2053(0).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class75.field1076 = -1;
                    class33.field519 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class304.field4202 = 0;
        class75.field1076 = var5;
        class33.field519 = var4;
        String[] var9 = new String[class75.field1076];
        for (int var10 = 0; var10 < class75.field1076; var10++) {
            var9[var10] = class54.method443(var4[var10], false).method2053(0);
        }
        class15.method237(class33.field519, var9, 0);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method1214(byte arg0) {
        field2528 = null;
        if (arg0 != -97) {
            method1214((byte) -36);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)V")
    public static final void method1215(byte arg0, int arg1) {
        field2536++;
        class159.field2235 = new int[arg1];
        class164.field2269 = new int[arg1];
        class116.field1672 = new int[arg1];
        class304.field4203 = new int[arg1];
        class69.field1021 = new int[arg1];
        if (arg0 <= 101) {
            field2559 = -86;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIZILuo;Luo;ZLnj;Lai;)Lsg;")
    public static final class226 method1216(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class345 arg7, class345 arg8, boolean arg9, class133 arg10, class357 arg11) {
        field2527++;
        class226 var12 = class212.method1396(arg8, arg4, arg1, arg10, (byte) 92, arg2, arg6, arg3);
        if (var12 != null) {
            return var12;
        }
        class360 var13 = class51.method433((byte) 87, arg3);
        if (arg2 > 1 && var13.field4964 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (var13.field4959[var15] <= arg2 && var13.field4959[var15] != 0) {
                    var14 = var13.field4964[var15];
                }
            }
            if (var14 != -1) {
                var13 = class51.method433((byte) 87, var14);
            }
        }
        class223 var16 = class121.method823(0, false, class108.field1560, var13.field4952);
        if (var16 == null) {
            return null;
        }
        if (var13.field4917 != null) {
            for (int var17 = 0; var17 < var13.field4917.length; var17++) {
                if (var13.field4928 == null || var13.field4928.length <= var17) {
                    var16.method1491(-59, var13.field4917[var17], var13.field4903[var17]);
                } else {
                    var16.method1491(-109, var13.field4917[var17], class307.field4236[var13.field4928[var17] & 0xFF]);
                }
            }
        }
        if (var13.field4944 != null) {
            for (int var18 = 0; var18 < var13.field4944.length; var18++) {
                var16.method1482(var13.field4944[var18], 113, var13.field4941[var18]);
            }
        }
        if (arg10 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (arg10.field1893[var19] < class157.field2219[var19].length) {
                    var16.method1491(arg0 - 113, class192.field2639[var19], class157.field2219[var19][arg10.field1893[var19]]);
                }
                if (class447.field6275[var19].length > arg10.field1893[var19]) {
                    var16.method1491(arg0 - 72, class432.field6112[var19], class447.field6275[var19][arg10.field1893[var19]]);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field4924 != 128 || var13.field4908 != 128 || var13.field4946 != 128) {
            var20 |= 0x7;
            var21 = true;
        }
        class394 var22 = arg7.method62(var16, var20, 0, var13.field4939 + 64, var13.field4905 + 768);
        if (!var22.method1468()) {
            return null;
        }
        if (var21) {
            var22.method1415(var13.field4924, var13.field4908, var13.field4946);
        }
        class226 var23 = null;
        if (var13.field4963 != -1) {
            var23 = method1216(1, 0, 10, var13.field4961, 1, true, 0, arg7, arg8, true, arg10, arg11);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field4921 != -1) {
            var23 = method1216(1, 0, arg2, var13.field4937, arg4, false, arg6, arg7, arg8, true, arg10, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field4967;
        if (arg5) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg4 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        arg7.method63(16, 16, 512, 512);
        class417 var25 = arg7.method101();
        var25.method693();
        arg7.method126(var25);
        arg7.method90(1.0F);
        arg7.method67(16777215, 1.0F, (float) arg0, -50.0F, -10.0F, -50.0F);
        class417 var26 = arg7.method84();
        var26.method700(-var13.field4940 << 3);
        var26.method704(var13.field4960 << 3);
        var26.method696(var13.field4932, (class133.field1913[var13.field4956 << 3] * var24 >> 15) + var13.field4919 - (var22.method1443() / 2), (class133.field1908[var13.field4956 << 3] * var24 >> 15) + var13.field4919);
        var26.method695(var13.field4956 << 3);
        int var27 = arg7.method49();
        int var28 = arg7.method85();
        arg7.method47(50, Integer.MAX_VALUE);
        arg7.method135();
        arg7.method143();
        arg7.method56(0, 0, 36, 32, 0, 0);
        var22.method1416(var26, (class84) null, 1);
        arg7.method47(var27, var28);
        int[] var29 = arg7.method142(0, 0, 36, 32);
        if (arg4 >= 1) {
            var29 = class1.method4(var29, -16777215, (byte) 72);
            if (arg4 >= 2) {
                var29 = class1.method4(var29, -1, (byte) 41);
            }
        }
        if (arg6 != 0) {
            class388.method2459(var29, 101, arg6);
        }
        arg7.method128(var29, 0, 36, 36, 32).method1501(0, 0);
        if (var13.field4963 != -1) {
            var23.method1501(0, 0);
        } else if (var13.field4921 != -1) {
            var23.method1501(0, 0);
        }
        if (arg1 == 1 || arg1 == 2 && (var13.field4958 == 1 || arg2 != 1) && arg2 != -1) {
            arg11.method2286(-16777215, 9, class284.method1855((byte) -50, arg2), 0, -256, (byte) -111);
        }
        int[] var30 = arg7.method142(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class393.method2487(var30[var31], -16777216);
            }
        }
        class226 var32;
        if (arg9) {
            var32 = arg7.method128(var30, 0, 36, 36, 32);
        } else {
            var32 = arg8.method128(var30, 0, 36, 36, 32);
        }
        if (!arg9) {
            class439 var33 = new class439();
            var33.field6180 = arg6;
            var33.field6177 = arg1;
            var33.field6174 = arg10 != null;
            var33.field6173 = arg4;
            var33.field6175 = arg2;
            var33.field6178 = arg3;
            var33.field6172 = arg8.field4704;
            class63.field867.method2612(var32, var33, (byte) -23);
        }
        return var32;
    }

    static {
        new class442("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field2559 = 0;
        field2558 = true;
    }
}
