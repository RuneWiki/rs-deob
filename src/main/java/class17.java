import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class17 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lfc;")
    public static class39 field479 = class90.method774("Art", -128);

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lfc;")
    private static class39 field481 = class90.method774("Please try again)3", -111);

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Lfc;")
    private static class39 field483 = class90.method774("Bad session id)3", -80);

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lfc;")
    public static class39 field491 = field483;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "[I")
    public static int[] field494 = new int[25];

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lfc;")
    private static class39 field487 = class90.method774(" has logged out)3", -79);

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lfc;")
    public static class39 field488 = field481;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lfc;")
    public static class39 field489 = field487;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Llf;")
    public static class82 field492;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)Lid;", line = 24)
    public static final class60 method206(int arg0, byte arg1) {
        if (arg1 != 83) {
            method212(null, (byte) -54, null);
        }
        field493++;
        class60 var2 = (class60) class50.field1259.method931(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class60 var3 = class62.method610(class132.field3343, 1442206280, false, class110.field2842, arg0);
        if (var3 != null) {
            class50.field1259.method934(0, var3, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 58)
    public static void method207(int arg0) {
        field494 = null;
        field489 = null;
        field483 = null;
        field492 = null;
        field488 = null;
        field479 = null;
        field487 = null;
        if (arg0 == 3754) {
            field481 = null;
            field491 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V", line = 80)
    public static final void method208(byte arg0) {
        field480++;
        if (arg0 < 1) {
            field494 = null;
        }
        if (class126.field3207 < 2 && class92.field2146 == 0 && !class97.field2313) {
            return;
        }
        class39 var1;
        if (class92.field2146 == 1 && class126.field3207 < 2) {
            var1 = class137.method1111(new class39[] { class50.field1267, class38.field1030, class76.field1741, class136.field3394 }, (byte) -123);
        } else if (class97.field2313 && class126.field3207 < 2) {
            var1 = class137.method1111(new class39[] { class96.field2232, class38.field1030, class103.field2591, class136.field3394 }, (byte) 102);
        } else {
            var1 = class97.field2315[class126.field3207 - 1];
        }
        if (class126.field3207 > 2) {
            var1 = class137.method1111(new class39[] { var1, class44.field1188, class86.method734(class126.field3207 - 2, 2218), class7.field232 }, (byte) -78);
        }
        class96.field2224.method712(var1, 4, 15, 16777215, 0, class70.field1654 / 1000);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V", line = 121)
    public static final void method209(byte arg0) {
        field485++;
        class39.field1065.method390((byte) -127);
        int var1 = class39.field1065.method396(1, (byte) 103);
        int var2 = 104 % ((51 - arg0) / 54);
        if (var1 == 0) {
            return;
        }
        int var3 = class39.field1065.method396(2, (byte) 123);
        if (var3 == 0) {
            class98.field2328[class68.field1626++] = 2047;
        } else if (var3 == 1) {
            int var4 = class39.field1065.method396(3, (byte) 116);
            class94.field2197.method973((byte) 110, false, var4);
            int var5 = class39.field1065.method396(1, (byte) 113);
            if (var5 == 1) {
                class98.field2328[class68.field1626++] = 2047;
            }
        } else if (var3 == 2) {
            int var6 = class39.field1065.method396(3, (byte) 122);
            class94.field2197.method973((byte) 117, true, var6);
            int var7 = class39.field1065.method396(3, (byte) 124);
            class94.field2197.method973((byte) 119, true, var7);
            int var8 = class39.field1065.method396(1, (byte) 102);
            if (var8 == 1) {
                class98.field2328[class68.field1626++] = 2047;
            }
        } else if (var3 == 3) {
            int var9 = class39.field1065.method396(1, (byte) 120);
            if (var9 == 1) {
                class98.field2328[class68.field1626++] = 2047;
            }
            class24.field661 = class39.field1065.method396(2, (byte) 113);
            int var10 = class39.field1065.method396(7, (byte) 120);
            int var11 = class39.field1065.method396(1, (byte) 98);
            int var12 = class39.field1065.method396(7, (byte) 104);
            class94.field2197.method975(var10, var11 == 1, 100, var12);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILfc;)V", line = 193)
    public static final void method210(int arg0, class39 arg1) {
        field495++;
        if (arg1 == null || arg1.method437(arg0 ^ 0xFFFFFFA3) == 0) {
            class80.field1809 = 0;
            return;
        }
        class39 var2 = arg1;
        class39[] var3 = new class39[100];
        int var4 = arg0;
        while (true) {
            int var5 = var2.method476(29, 32);
            if (var5 == -1) {
                class39 var6 = var2.method448((byte) -127);
                if (var6.method437(-44) > 0) {
                    var3[var4++] = var6.method452(true);
                }
                class80.field1809 = 0;
                label47: for (int var7 = 0; var7 < class65.field1562; var7++) {
                    class109 var8 = class37.method421(true, var7);
                    if (var8.field2772 == -1 && var8.field2787 != null) {
                        class39 var9 = var8.field2787.method452(true);
                        for (int var10 = 0; var10 < var4; var10++) {
                            if (var9.method471(var3[var10], (byte) -62) == -1) {
                                continue label47;
                            }
                        }
                        class103.field2579[class80.field1809] = var9;
                        class34.field905[class80.field1809] = var7;
                        class80.field1809++;
                        if (class80.field1809 >= class103.field2579.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class39 var11 = var2.method456(0, 0, var5).method448((byte) -127);
            if (var11.method437(120) > 0) {
                var3[var4++] = var11.method452(true);
            }
            var2 = var2.method469(var5 + 1, (byte) -116);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIII)V", line = 283)
    public static final void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field486++;
        if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
            if (class74.field1705 && class24.field661 != arg0) {
                return;
            }
            boolean var8 = true;
            boolean var9 = false;
            int var10 = 0;
            boolean var11 = false;
            if (arg1 == 0) {
                var10 = class139.field3503.method48(arg0, arg5, arg6);
            }
            if (arg1 == 1) {
                var10 = class139.field3503.method50(arg0, arg5, arg6);
            }
            if (arg1 == 2) {
                var10 = class139.field3503.method46(arg0, arg5, arg6);
            }
            if (arg1 == 3) {
                var10 = class139.field3503.method76(arg0, arg5, arg6);
            }
            if (var10 != 0) {
                int var12 = var10 >> 14 & 0x7FFF;
                int var13 = class139.field3503.method43(arg0, arg5, arg6, var10);
                int var14 = var13 & 0x1F;
                int var15 = var13 >> 6 & 0x3;
                if (arg1 == 0) {
                    class139.field3503.method59(arg0, arg5, arg6);
                    class35 var16 = class90.method776(var12, -117);
                    if (var16.field953 != 0) {
                        class117.field3077[arg0].method863(arg5, var14, var16.field945, 124, arg6, var15);
                    }
                }
                if (arg1 == 1) {
                    class139.field3503.method67(arg0, arg5, arg6);
                }
                if (arg1 == 2) {
                    class139.field3503.method61(arg0, arg5, arg6);
                    class35 var17 = class90.method776(var12, -118);
                    if (arg5 + var17.field912 > 103 || arg6 + var17.field912 > 103 || arg5 + var17.field930 > 103 || var17.field930 + arg6 > 103) {
                        return;
                    }
                    if (var17.field953 != 0) {
                        class117.field3077[arg0].method871(var17.field912, var17.field945, var17.field930, arg6, arg5, var15, (byte) -125);
                    }
                }
                if (arg1 == 3) {
                    class139.field3503.method44(arg0, arg5, arg6);
                    class35 var18 = class90.method776(var12, -123);
                    if (var18.field953 == 1) {
                        class117.field3077[arg0].method866(95, arg6, arg5);
                    }
                }
            }
            if (arg2 >= 0) {
                int var19 = arg0;
                if (arg0 < 3 && (class137.field3424[1][arg5][arg6] & 0x2) == 2) {
                    var19 = arg0 + 1;
                }
                class97.method815(arg5, 127, arg3, class139.field3503, arg0, arg4, arg6, var19, arg2, class117.field3077[arg0]);
            }
        }
        if (arg7 >= -14) {
            field488 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lma;BLma;)V", line = 380)
    public static final void method212(class84 arg0, byte arg1, class84 arg2) {
        field490++;
        if (class108.field2718) {
            class88.method749(arg2, arg0, (byte) -71);
            return;
        }
        if (class56.field1409 == 0 || class56.field1409 == 5) {
            byte var3 = 20;
            arg0.method720(class35.field965, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class152.method1212(230, var4, 304, 34, 9179409);
            class152.method1212(231, var4 + 1, 302, 32, 0);
            class152.method1209(232, var4 + 2, class127.field3226 * 3, 30, 9179409);
            class152.method1209(class127.field3226 * 3 + 232, var4 - -2, 300 - class127.field3226 * 3, 30, 0);
            arg0.method720(class93.field2178, 382, 276 - var3, 16777215, -1);
        }
        if (class56.field1409 == 20) {
            short var5 = 211;
            class127.field3232.method1155(382 - class127.field3232.field3543 / 2, -(class127.field3232.field3546 / 2) + 271);
            arg0.method720(class93.field2182, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg0.method720(class93.field2186, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg0.method720(class93.field2187, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg0.method700(class137.method1111(new class39[] { class145.field3625, class84.method708(class93.field2180) }, (byte) -76), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg0.method700(class137.method1111(new class39[] { class96.field2248, class93.field2174.method468((byte) -115) }, (byte) -110), 274, var28, 16777215, 0);
            int var29 = var28 + 15;
        }
        if (class56.field1409 == 10) {
            class127.field3232.method1155(202, 171);
            if (class57.field1413 == 0) {
                short var6 = 251;
                arg0.method720(class124.field3182, 382, var6, 16776960, 0);
                int var27 = var6 + 30;
                short var7 = 291;
                short var8 = 302;
                class86.field1957.method1155(var8 - 73, var7 - 20);
                arg0.method699(class137.field3435, var8 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                short var9 = 462;
                class86.field1957.method1155(var9 - 73, var7 + -20);
                arg0.method699(class127.field3215, var9 - 73, var7 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class57.field1413 == 2) {
                short var10 = 302;
                short var11 = 211;
                arg0.method720(class93.field2182, 382, var11, 16776960, 0);
                int var30 = var11 + 15;
                short var12 = 321;
                arg0.method720(class93.field2186, 382, var30, 16776960, 0);
                int var31 = var30 + 15;
                arg0.method720(class93.field2187, 382, var31, 16776960, 0);
                int var32 = var31 + 15;
                int var33 = var32 + 10;
                arg0.method700(class137.method1111(new class39[] { class145.field3625, class84.method708(class93.field2180), class121.field3171 == 0 & class70.field1654 % 40 < 20 ? class18.field510 : class93.field2175 }, (byte) -92), 272, var33, 16777215, 0);
                int var34 = var33 + 15;
                arg0.method700(class137.method1111(new class39[] { class96.field2248, class93.field2174.method468((byte) -115), class121.field3171 == 1 & class70.field1654 % 40 < 20 ? class18.field510 : class93.field2175 }, (byte) -107), 274, var34, 16777215, 0);
                int var35 = var34 + 15;
                class86.field1957.method1155(var10 - 73, var12 + -20);
                arg0.method720(class60.field1461, var10, var12 + 5, 16777215, 0);
                short var13 = 462;
                class86.field1957.method1155(var13 - 73, var12 + -20);
                arg0.method720(class43.field1187, var13, var12 + 5, 16777215, 0);
            } else if (class57.field1413 == 3) {
                short var14 = 382;
                short var15 = 236;
                short var16 = 321;
                arg0.method720(class128.field3283, 382, 211, 16776960, 0);
                arg0.method720(class93.field2188, 382, var15, 16777215, 0);
                int var36 = var15 + 15;
                arg0.method720(class132.field3341, 382, var36, 16777215, 0);
                int var37 = var36 + 15;
                arg0.method720(class131.field3297, 382, var37, 16777215, 0);
                int var38 = var37 + 15;
                arg0.method720(class147.field3672, 382, var38, 16777215, 0);
                int var39 = var38 + 15;
                class86.field1957.method1155(var14 - 73, var16 + -20);
                arg0.method720(class43.field1187, var14, var16 + 5, 16777215, 0);
            }
        }
        if (class42.field1147 > 0) {
            class71.method655(class42.field1147, 18588);
            class42.field1147 = 0;
        }
        class3.method25(arg1 + 23);
        class151.field3750[class50.field1282 ? 1 : 0].method1155(725, 463);
        if (class56.field1409 > 5 && class93.field2173 != 2 && class38.field1037 == 0) {
            if (class27.field764 == null) {
                class27.field764 = class29.method359(arg1 ^ 0xFFFFFFA9, class93.field2175, class27.field781, class128.field3272);
            } else {
                short var17 = 463;
                byte var18 = 100;
                byte var19 = 5;
                class27.field764.method1155(var19, var17);
                byte var20 = 35;
                arg0.method720(class137.method1111(new class39[] { class101.field2519, class68.field1623, class86.method734(class56.field1404, 2218) }, (byte) 100), var19 + var18 / 2, var20 / 2 + var17 + -2, 16777215, 0);
                if (class71.field1670 == null) {
                    arg2.method720(class16.field460, var18 / 2 + var19, var20 / 2 + var17 - -12, 16777215, 0);
                } else {
                    arg2.method720(class108.field2712, var18 / 2 + var19, var17 - (-(var20 / 2) - 12), 16777215, 0);
                }
            }
        }
        try {
            if (arg1 == 49) {
                Graphics var21 = class140.field3523.getGraphics();
                class101.field2530.method129(var21, 0, 0, (byte) -125);
            }
        } catch (Exception var22) {
            class140.field3523.repaint();
        }
    }
}
