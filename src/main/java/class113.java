import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class113 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1615 = new String[100];

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1625 = 0;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public int field1620;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lmj;IIIIIIZ)V")
    public static final void method719(class152 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2115.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2115[var9] - class272.field4343;
            int var23 = arg0.field2107[var9] - class191.field2892;
            int var24 = arg0.field2113[var9] - class107.field1525;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2110 != null) {
                class152.field2121[var9] = var25;
                class152.field2111[var9] = var28;
                class152.field2120[var9] = var29;
            }
            class152.field2106[var9] = (var25 << 9) / var29 + class118.field1702;
            class152.field2116[var9] = (var28 << 9) / var29 + class118.field1705;
        }
        class118.field1704 = 0;
        int var10 = arg0.field2124.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2124[var11];
            int var13 = arg0.field2114[var11];
            int var14 = arg0.field2109[var11];
            int var15 = class152.field2106[var12];
            int var16 = class152.field2106[var13];
            int var17 = class152.field2106[var14];
            int var18 = class152.field2116[var12];
            int var19 = class152.field2116[var13];
            int var20 = class152.field2116[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class108.field1545 && class178.method1130(class295.field4705 + class118.field1702, class89.field1287 + class118.field1705, var18, var19, var20, var15, var16, var17)) {
                    class275.field4360 = arg5;
                    class249.field3889 = arg6;
                }
                if (!arg7) {
                    class118.field1694 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class118.field1703 || var16 > class118.field1703 || var17 > class118.field1703) {
                        class118.field1694 = true;
                    }
                    if (arg0.field2110 == null || arg0.field2110[var11] == -1) {
                        if (arg0.field2108[var11] != 12345678) {
                            class118.method753(var18, var19, var20, var15, var16, var17, arg0.field2108[var11], arg0.field2117[var11], arg0.field2103[var11]);
                        }
                    } else if (!class78.field1087) {
                        int var21 = class118.field1696.method560(arg0.field2110[var11], 65535);
                        class118.method753(var18, var19, var20, var15, var16, var17, class30.method189(var21, arg0.field2108[var11]), class30.method189(var21, arg0.field2117[var11]), class30.method189(var21, arg0.field2103[var11]));
                    } else if (arg0.field2119) {
                        class118.method755(var18, var19, var20, var15, var16, var17, arg0.field2108[var11], arg0.field2117[var11], arg0.field2103[var11], class152.field2121[0], class152.field2121[1], class152.field2121[3], class152.field2111[0], class152.field2111[1], class152.field2111[3], class152.field2120[0], class152.field2120[1], class152.field2120[3], arg0.field2110[var11]);
                    } else {
                        class118.method755(var18, var19, var20, var15, var16, var17, arg0.field2108[var11], arg0.field2117[var11], arg0.field2103[var11], class152.field2121[var12], class152.field2121[var13], class152.field2121[var14], class152.field2111[var12], class152.field2111[var13], class152.field2111[var14], class152.field2120[var12], class152.field2120[var13], class152.field2120[var14], arg0.field2110[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method720(byte arg0) {
        int var1 = -31 % ((22 - arg0) / 33);
        field1615 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1621++;
        int var8 = arg7;
        int var9 = arg2 - arg0;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg7 - arg0;
        int var13 = arg2 * arg2;
        int var14 = var12 * var12;
        int var15 = var9 * var9;
        int var16 = arg7 * arg7;
        int var17 = var16 << 1;
        int var18 = var13 << 1;
        int var19 = var14 << 1;
        int var20 = var15 << 1;
        int var21 = var12 << 1;
        int var22 = arg7 << 1;
        int var23 = (1 - var22) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var20);
        int var25 = (1 - var21) * var15 + var19;
        int var26 = var13 << 2;
        int var27 = var16 - ((var22 - 1) * var18);
        int var28 = var15 << 2;
        int var29 = var16 << 2;
        int var30 = var14 << 2;
        int var31 = var17 * 3;
        int var32 = (var22 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = var29;
        int var35 = (var21 - 3) * var20;
        if (arg1 > -27) {
            field1615 = null;
        }
        int var36 = (arg7 - 1) * var26;
        int var37 = var30;
        if (arg4 >= class271.field4322 && class311.field5001 >= arg4) {
            int[] var38 = class247.field3876[arg4];
            int var39 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg5 - arg2);
            int var40 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg2 + arg5);
            int var41 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg5 - var9);
            int var42 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg5 + var9);
            class129.method822(var38, var39, -2426, arg3, var41);
            class129.method822(var38, var41, -2426, arg6, var42);
            class129.method822(var38, var42, -2426, arg3, var40);
        }
        int var43 = (var12 - 1) * var28;
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var27 += var34;
                    var31 += var29;
                    var34 += var29;
                    var11++;
                }
            }
            if (var27 < 0) {
                var23 += var31;
                var11++;
                var27 += var34;
                var31 += var29;
                var34 += var29;
            }
            var27 += -var32;
            var32 -= var26;
            boolean var44 = var8 <= var12;
            var8--;
            var23 += -var36;
            var36 -= var26;
            int var45 = arg4 + var8;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var24 += var37;
                        var25 += var33;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var24 < 0) {
                    var10++;
                    var24 += var37;
                    var25 += var33;
                    var33 += var30;
                    var37 += var30;
                }
                var24 += -var35;
                var25 += -var43;
                var43 -= var28;
                var35 -= var28;
            }
            int var46 = arg4 - var8;
            if (class271.field4322 <= var45 && class311.field5001 >= var46) {
                int var47 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg5 + var11);
                int var48 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg5 - var11);
                if (var44) {
                    int var49 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg5 + var10);
                    int var50 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg5 - var10);
                    if (class271.field4322 <= var46) {
                        int[] var51 = class247.field3876[var46];
                        class129.method822(var51, var48, -2426, arg3, var50);
                        class129.method822(var51, var50, -2426, arg6, var49);
                        class129.method822(var51, var49, -2426, arg3, var47);
                    }
                    if (class311.field5001 >= var45) {
                        int[] var52 = class247.field3876[var45];
                        class129.method822(var52, var48, -2426, arg3, var50);
                        class129.method822(var52, var50, -2426, arg6, var49);
                        class129.method822(var52, var49, -2426, arg3, var47);
                    }
                } else {
                    if (class271.field4322 <= var46) {
                        class129.method822(class247.field3876[var46], var48, -2426, arg3, var47);
                    }
                    if (class311.field5001 >= var45) {
                        class129.method822(class247.field3876[var45], var48, -2426, arg3, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method722(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = 0;
        class288.method1926(arg0, 4096);
        field1616++;
        int var8 = arg0;
        int var9 = arg0 - arg6;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg0;
        if (arg5 != 112) {
            return;
        }
        int var11 = var9;
        int var12 = -1;
        int var13 = -1;
        int var14 = -var9;
        int var15 = arg1 - var9;
        int[] var16 = class247.field3876[arg4];
        class129.method822(var16, arg1 - arg0, arg5 ^ 0xFFFFF6F6, arg3, var15);
        int var17 = arg1 + var9;
        class129.method822(var16, var15, -2426, arg2, var17);
        class129.method822(var16, var17, -2426, arg3, arg0 + arg1);
        while (var7 < var8) {
            var13 += 2;
            var12 += 2;
            var14 += var13;
            var10 += var12;
            if (var14 >= 0 && var11 >= 1) {
                class14.field226[var11] = var7;
                var11--;
                var14 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                if (var8 >= var9) {
                    int[] var18 = class247.field3876[arg4 + var8];
                    int[] var19 = class247.field3876[arg4 - var8];
                    int var20 = arg1 - var7;
                    int var21 = arg1 + var7;
                    class129.method822(var18, var20, -2426, arg3, var21);
                    class129.method822(var19, var20, arg5 - 2538, arg3, var21);
                } else {
                    int[] var22 = class247.field3876[arg4 - var8];
                    int var23 = class14.field226[var8];
                    int[] var24 = class247.field3876[arg4 + var8];
                    int var25 = arg1 + var23;
                    int var26 = arg1 + var7;
                    int var27 = arg1 - var7;
                    int var28 = arg1 - var23;
                    class129.method822(var24, var27, arg5 ^ 0xFFFFF6F6, arg3, var28);
                    class129.method822(var24, var28, arg5 ^ 0xFFFFF6F6, arg2, var25);
                    class129.method822(var24, var25, -2426, arg3, var26);
                    class129.method822(var22, var27, -2426, arg3, var28);
                    class129.method822(var22, var28, -2426, arg2, var25);
                    class129.method822(var22, var25, -2426, arg3, var26);
                }
            }
            int[] var29 = class247.field3876[arg4 + var7];
            int[] var30 = class247.field3876[arg4 - var7];
            int var31 = arg1 + var8;
            int var32 = arg1 - var8;
            if (var9 <= var7) {
                class129.method822(var29, var32, -2426, arg3, var31);
                class129.method822(var30, var32, arg5 - 2538, arg3, var31);
            } else {
                int var33 = var11 < var7 ? class14.field226[var7] : var11;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class129.method822(var29, var32, -2426, arg3, var35);
                class129.method822(var29, var35, arg5 ^ 0xFFFFF6F6, arg2, var34);
                class129.method822(var29, var34, -2426, arg3, var31);
                class129.method822(var30, var32, arg5 ^ 0xFFFFF6F6, arg3, var35);
                class129.method822(var30, var35, -2426, arg2, var34);
                class129.method822(var30, var34, arg5 ^ 0xFFFFF6F6, arg3, var31);
            }
        }
    }
}
