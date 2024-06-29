import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class90 extends class72 {

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "[Lqa;")
    public class98[] field2157;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "Lae;")
    private static class6 field2144 = class64.method474(114, "wave2:");

    @OriginalMember(owner = "client!od", name = "S", descriptor = "Lae;")
    public static class6 field2147 = field2144;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "Lae;")
    public static class6 field2148 = class64.method474(108, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!od", name = "W", descriptor = "Lae;")
    public static class6 field2151 = class64.method474(122, "Menge eingeben:");

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "Z")
    public static boolean field2159 = false;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "Lbd;")
    public static class12 field2152 = new class12(64);

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "[Lh;")
    public static class47[] field2160 = new class47[4];

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "Lae;")
    public static class6 field2161 = class64.method474(119, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lbb;ILbb;)V", line = 6)
    public static final void method756(class9 arg0, int arg1, class9 arg2) {
        field2149++;
        class133.field3249.method941(10);
        if (class59.field1295 == 0 || class59.field1295 == 5) {
            byte var3 = 20;
            int var4 = 82 - var3;
            arg2.method88(class75.field1704, 180, 74 - var3, 16777215);
            class74.method582(28, var4, 304, 34, 9179409);
            class74.method582(29, var4 + 1, 302, 32, 0);
            class74.method579(30, var4 + 2, class78.field1899 * 3, 30, 9179409);
            class74.method579(class78.field1899 * 3 + 30, var4 - -2, 300 - class78.field1899 * 3, 30, 0);
            arg2.method88(class102.field2416, 180, 105 - var3, 16777215);
        }
        if (class59.field1295 == 20) {
            class108.field2600.method1036(0, 0);
            byte var5 = 40;
            arg2.method95(class102.field2414, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg2.method95(class102.field2389, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg2.method95(class102.field2392, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg2.method94(class85.method731(new class6[] { class21.field510, class102.field2390 }, 14569), 90, var22, 16777215, true);
            int var24 = var22 + 15;
            arg2.method94(class85.method731(new class6[] { class95.field2232, class102.field2399.method45(arg1 ^ 0xE9C081BB) }, 14569), 92, var24, 16777215, true);
            int var26 = var24 + 15;
        }
        if (class59.field1295 == 10) {
            class108.field2600.method1036(0, 0);
            if (class18.field340 == 0) {
                byte var13 = 100;
                byte var14 = 120;
                byte var15 = 80;
                arg2.method95(class65.field1417, 180, var15, 16776960, true);
                int var35 = var15 + 30;
                class126.field3085.method1036(var13 - 73, var14 - 20);
                arg2.method84(class51.field1152, var13 - 73, var14 - 20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 260;
                class126.field3085.method1036(var16 - 73, var14 + -20);
                arg2.method84(class89.field2123, var16 - 73, var14 - 20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class18.field340 == 2) {
                byte var6 = 40;
                arg2.method95(class102.field2414, 180, var6, 16776960, true);
                int var23 = var6 + 15;
                arg2.method95(class102.field2389, 180, var23, 16776960, true);
                byte var7 = 100;
                short var8 = 150;
                int var25 = var23 + 15;
                arg2.method95(class102.field2392, 180, var25, 16776960, true);
                int var27 = var25 + 15;
                int var28 = var27 + 10;
                arg2.method94(class85.method731(new class6[] { class21.field510, class102.field2390, class5.field61 % 40 < 20 & class79.field1923 == 0 ? class92.field2201 : class102.field2400 }, 14569), 90, var28, 16777215, true);
                int var29 = var28 + 15;
                arg2.method94(class85.method731(new class6[] { class95.field2232, class102.field2399.method45(arg1 + 373260683), class79.field1923 == 1 & class5.field61 % 40 < 20 ? class92.field2201 : class102.field2400 }, arg1 + 42189), 92, var29, 16777215, true);
                int var30 = var29 + 15;
                class126.field3085.method1036(var7 - 73, var8 + -20);
                arg2.method95(class89.field2122, var7, var8 + 5, 16777215, true);
                short var9 = 260;
                class126.field3085.method1036(var9 - 73, var8 + -20);
                arg2.method95(class66.field1468, var9, var8 + 5, 16777215, true);
            } else if (class18.field340 == 3) {
                byte var10 = 65;
                arg2.method95(class85.field2063, 180, 40, 16776960, true);
                short var11 = 150;
                arg2.method95(class137.field3332, 180, var10, 16777215, true);
                int var31 = var10 + 15;
                short var12 = 180;
                arg2.method95(class7.field160, 180, var31, 16777215, true);
                int var32 = var31 + 15;
                arg2.method95(class20.field409, 180, var32, 16777215, true);
                int var33 = var32 + 15;
                arg2.method95(class59.field1279, 180, var33, 16777215, true);
                class126.field3085.method1036(var12 - 73, var11 + -20);
                int var34 = var33 + 15;
                arg2.method95(class66.field1468, var12, var11 + 5, 16777215, true);
            }
        }
        class8.method82((byte) -115);
        try {
            Graphics var17 = class70.field1564.getGraphics();
            class133.field3249.method1(-69, var17, 202, 171);
            class59.field1281.method1(arg1 + 27574, var17, 0, 0);
            class135.field3294.method1(arg1 ^ 0x6BBB, var17, 637, 0);
            if (arg1 != -27620) {
                method759(null, 51, -50, 92, 6, -45, -40, null, 24, 91);
            }
            if (class32.field772) {
                class32.field772 = false;
                class43.field980.method1(-116, var17, 128, 0);
                class121.field2996.method1(-100, var17, 202, 371);
                client.field462.method1(-98, var17, 0, 265);
                class66.field1462.method1(-42, var17, 562, 265);
                class20.field428.method1(arg1 ^ 0x6BBA, var17, 128, 171);
                class56.field1227.method1(-63, var17, 562, 171);
            }
        } catch (Exception var18) {
            class70.field1564.repaint();
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Z", line = 159)
    public final boolean method757(int arg0, byte arg1) {
        if (arg1 != 52) {
            this.method757(-118, (byte) -121);
        }
        field2158++;
        return this.field2157[arg0].field2320;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lbf;Lbf;IZ)V", line = 201)
    public class90(class14 arg0, class14 arg1, int arg2, boolean arg3) {
        class95 var5 = new class95();
        int var6 = arg0.method153(arg2, (byte) -4);
        this.field2157 = new class98[var6];
        int[] var7 = arg0.method141(-1, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method160(30605, arg2, var7[var8]);
            class125 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class125 var12 = (class125) var5.method798(false); var12 != null; var12 = (class125) var5.method792((byte) -87)) {
                if (var12.field3053 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method149((byte) -120, 0, var11);
                } else {
                    var13 = arg1.method149((byte) -116, var11, 0);
                }
                var10 = new class125(var11, var13);
                var5.method785((byte) -76, var10);
            }
            this.field2157[var7[var8]] = new class98(var9, var10);
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V", line = 261)
    public static void method758(int arg0) {
        field2151 = null;
        field2160 = null;
        field2147 = null;
        field2161 = null;
        if (arg0 != 18051) {
            field2154 = 1;
        }
        field2148 = null;
        field2144 = null;
        field2152 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lh;IIIIIILl;II)V", line = 277)
    public static final void method759(class47 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class71 arg7, int arg8, int arg9) {
        int var10 = class137.field3331[arg4][arg1][arg9];
        field2145++;
        int var11 = class137.field3331[arg4][arg1 + 1][arg9];
        int var12 = class137.field3331[arg4][arg1 + 1][arg9 + 1];
        int var13 = class137.field3331[arg4][arg1][arg9 + 1];
        int var14 = var11 + var12 + var10 + var13 >> 2;
        class107 var15 = class80.method687(arg5, (byte) 115);
        if (arg8 > -96) {
            method760((byte) 39, null, null, null);
        }
        int var16 = (arg5 << 14) + (arg9 << 7) + arg1 + 1073741824;
        int var17 = (arg2 << 6) + arg6;
        if (var15.field2566 == 1) {
            var17 += 256;
        }
        if (var15.field2537 == 0) {
            var16 += Integer.MIN_VALUE;
        }
        if (arg6 == 22) {
            class42 var18;
            if (var15.field2535 == -1 && var15.field2559 == null) {
                var18 = var15.method909(66, 22, var10, arg2, var13, var12, var11);
            } else {
                var18 = new class46(arg5, 22, arg2, var10, var11, var12, var13, var15.field2535, true, null);
            }
            arg7.method546(arg3, arg1, arg9, var14, var18, var16, var17);
            if (var15.field2522 && var15.field2537 == 1) {
                arg0.method383((byte) -85, arg9, arg1);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class42 var38;
            if (var15.field2535 == -1 && var15.field2559 == null) {
                var38 = var15.method909(66, 10, var10, arg2, var13, var12, var11);
            } else {
                var38 = new class46(arg5, 10, arg2, var10, var11, var12, var13, var15.field2535, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg2 == 1 || arg2 == 3) {
                    var40 = var15.field2546;
                    var39 = var15.field2516;
                } else {
                    var39 = var15.field2546;
                    var40 = var15.field2516;
                }
                int var41 = 0;
                if (arg6 == 11) {
                    var41 += 256;
                }
                arg7.method548(arg3, arg1, arg9, var14, var40, var39, var38, var41, var16, var17);
            }
            if (var15.field2522) {
                arg0.method381(var15.field2547, arg1, var15.field2516, (byte) -54, arg9, var15.field2546, arg2);
            }
        } else if (arg6 >= 12) {
            class42 var19;
            if (var15.field2535 == -1 && var15.field2559 == null) {
                var19 = var15.method909(66, arg6, var10, arg2, var13, var12, var11);
            } else {
                var19 = new class46(arg5, arg6, arg2, var10, var11, var12, var13, var15.field2535, true, null);
            }
            arg7.method548(arg3, arg1, arg9, var14, 1, 1, var19, 0, var16, var17);
            if (var15.field2522) {
                arg0.method381(var15.field2547, arg1, var15.field2516, (byte) -54, arg9, var15.field2546, arg2);
            }
        } else if (arg6 == 0) {
            class42 var20;
            if (var15.field2535 == -1 && var15.field2559 == null) {
                var20 = var15.method909(66, 0, var10, arg2, var13, var12, var11);
            } else {
                var20 = new class46(arg5, 0, arg2, var10, var11, var12, var13, var15.field2535, true, null);
            }
            arg7.method570(arg3, arg1, arg9, var14, var20, null, class121.field2860[arg2], 0, var16, var17);
            if (var15.field2522) {
                arg0.method379(arg1, 16384, var15.field2547, arg9, arg2, arg6);
            }
        } else if (arg6 == 1) {
            class42 var21;
            if (var15.field2535 == -1 && var15.field2559 == null) {
                var21 = var15.method909(66, 1, var10, arg2, var13, var12, var11);
            } else {
                var21 = new class46(arg5, 1, arg2, var10, var11, var12, var13, var15.field2535, true, null);
            }
            arg7.method570(arg3, arg1, arg9, var14, var21, null, class35.field820[arg2], 0, var16, var17);
            if (var15.field2522) {
                arg0.method379(arg1, 16384, var15.field2547, arg9, arg2, arg6);
            }
        } else if (arg6 == 2) {
            int var22 = arg2 + 1 & 0x3;
            class42 var23;
            class42 var24;
            if (var15.field2535 == -1 && var15.field2559 == null) {
                var23 = var15.method909(66, 2, var10, arg2 + 4, var13, var12, var11);
                var24 = var15.method909(66, 2, var10, var22, var13, var12, var11);
            } else {
                var23 = new class46(arg5, 2, arg2 + 4, var10, var11, var12, var13, var15.field2535, true, null);
                var24 = new class46(arg5, 2, var22, var10, var11, var12, var13, var15.field2535, true, null);
            }
            arg7.method570(arg3, arg1, arg9, var14, var23, var24, class121.field2860[arg2], class121.field2860[var22], var16, var17);
            if (var15.field2522) {
                arg0.method379(arg1, 16384, var15.field2547, arg9, arg2, arg6);
            }
        } else if (arg6 == 3) {
            class42 var25;
            if (var15.field2535 == -1 && var15.field2559 == null) {
                var25 = var15.method909(66, 3, var10, arg2, var13, var12, var11);
            } else {
                var25 = new class46(arg5, 3, arg2, var10, var11, var12, var13, var15.field2535, true, null);
            }
            arg7.method570(arg3, arg1, arg9, var14, var25, null, class35.field820[arg2], 0, var16, var17);
            if (var15.field2522) {
                arg0.method379(arg1, 16384, var15.field2547, arg9, arg2, arg6);
            }
        } else if (arg6 == 9) {
            class42 var26;
            if (var15.field2535 == -1 && var15.field2559 == null) {
                var26 = var15.method909(66, arg6, var10, arg2, var13, var12, var11);
            } else {
                var26 = new class46(arg5, arg6, arg2, var10, var11, var12, var13, var15.field2535, true, null);
            }
            arg7.method548(arg3, arg1, arg9, var14, 1, 1, var26, 0, var16, var17);
            if (var15.field2522) {
                arg0.method381(var15.field2547, arg1, var15.field2516, (byte) -54, arg9, var15.field2546, arg2);
            }
        } else {
            if (var15.field2549) {
                if (arg2 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg2 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg2 == 3) {
                    int var28 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var28;
                }
            }
            if (arg6 == 4) {
                class42 var31;
                if (var15.field2535 == -1 && var15.field2559 == null) {
                    var31 = var15.method909(66, 4, var10, 0, var13, var12, var11);
                } else {
                    var31 = new class46(arg5, 4, 0, var10, var11, var12, var13, var15.field2535, true, null);
                }
                arg7.method530(arg3, arg1, arg9, var14, var31, class121.field2860[arg2], arg2 * 512, 0, 0, var16, var17);
            } else if (arg6 == 5) {
                int var32 = arg7.method544(arg3, arg1, arg9);
                int var33 = 16;
                if (var32 > 0) {
                    var33 = class80.method687(var32 >> 14 & 0x7FFF, (byte) 124).field2532;
                }
                class42 var34;
                if (var15.field2535 == -1 && var15.field2559 == null) {
                    var34 = var15.method909(66, 4, var10, 0, var13, var12, var11);
                } else {
                    var34 = new class46(arg5, 4, 0, var10, var11, var12, var13, var15.field2535, true, null);
                }
                arg7.method530(arg3, arg1, arg9, var14, var34, class121.field2860[arg2], arg2 * 512, class105.field2491[arg2] * var33, class104.field2471[arg2] * var33, var16, var17);
            } else if (arg6 == 6) {
                class42 var35;
                if (var15.field2535 == -1 && var15.field2559 == null) {
                    var35 = var15.method909(66, 4, var10, 0, var13, var12, var11);
                } else {
                    var35 = new class46(arg5, 4, 0, var10, var11, var12, var13, var15.field2535, true, null);
                }
                arg7.method530(arg3, arg1, arg9, var14, var35, 256, arg2, 0, 0, var16, var17);
            } else if (arg6 == 7) {
                class42 var36;
                if (var15.field2535 == -1 && var15.field2559 == null) {
                    var36 = var15.method909(66, 4, var10, 0, var13, var12, var11);
                } else {
                    var36 = new class46(arg5, 4, 0, var10, var11, var12, var13, var15.field2535, true, null);
                }
                arg7.method530(arg3, arg1, arg9, var14, var36, 512, arg2, 0, 0, var16, var17);
            } else if (arg6 == 8) {
                class42 var37;
                if (var15.field2535 == -1 && var15.field2559 == null) {
                    var37 = var15.method909(66, 4, var10, 0, var13, var12, var11);
                } else {
                    var37 = new class46(arg5, 4, 0, var10, var11, var12, var13, var15.field2535, true, null);
                }
                arg7.method530(arg3, arg1, arg9, var14, var37, 768, arg2, 0, 0, var16, var17);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLbf;Lae;Lae;)[Lva;", line = 583)
    public static final class128[] method760(byte arg0, class14 arg1, class6 arg2, class6 arg3) {
        field2146++;
        int var4 = -103 % ((-arg0 - 16) / 60);
        int var5 = arg1.method158(arg3, (byte) 30);
        int var6 = arg1.method138(100, var5, arg2);
        return class92.method768(0, var5, var6, arg1);
    }
}
