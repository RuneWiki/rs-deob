import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class93 {

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public int field1483 = 8;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public int field1490 = 16777215;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "[Log;")
    public static class241[] field1486 = new class241[0];

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[[S")
    public static short[][] field1480 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Lgi;")
    public static class164 field1492;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "Z")
    public boolean field1475;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[I")
    public static int[] field1474;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "[[B")
    public static byte[][] field1487;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static final void method646(byte arg0) {
        int var1 = 0;
        field1482++;
        if (arg0 < 73) {
            return;
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class221.method1504(class307.field4991, true, 113, var1, var2, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public static void method647(boolean arg0) {
        field1492 = null;
        field1480 = null;
        field1487 = null;
        if (!arg0) {
            field1474 = null;
            field1486 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILgi;I)Lrk;")
    public static final class292 method648(int arg0, class164 arg1, int arg2) {
        field1479++;
        if (class85.method604(arg1, arg2, false)) {
            return arg0 == 128 ? class259.method1743(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lfj;IB)V")
    public final void method649(class274 arg0, int arg1, byte arg2) {
        field1489++;
        while (true) {
            int var4 = arg0.method1849(arg2 + 171);
            if (var4 == 0) {
                if (arg2 == 84) {
                    return;
                } else {
                    method647(false);
                    return;
                }
            }
            this.method650(arg1, var4, arg0, -21845);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILfj;I)V")
    private final void method650(int arg0, int arg1, class274 arg2, int arg3) {
        if (arg3 != -21845) {
            return;
        }
        if (arg1 == 1) {
            this.field1483 = arg2.method1837(arg3 + 22097);
        } else if (arg1 == 2) {
            this.field1475 = true;
        } else if (arg1 == 3) {
            this.field1473 = arg2.method1847(-404);
            this.field1478 = arg2.method1847(-404);
            this.field1484 = arg2.method1847(arg3 ^ 0x54C7);
        } else if (arg1 == 4) {
            this.field1476 = arg2.method1849(255);
        } else if (arg1 == 5) {
            this.field1481 = arg2.method1837(252);
        } else if (arg1 == 6) {
            this.field1490 = arg2.method1812(true);
        }
        field1488++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLfj;)V")
    public static final void method651(boolean arg0, class274 arg1) {
        for (int var2 = 0; var2 < class65.field1043; var2++) {
            int var3 = arg1.method1863((byte) 26);
            int var4 = arg1.method1837(252);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class120.field1898[var3] != null) {
                class120.field1898[var3].field3601 = var4;
            }
        }
        if (!arg0) {
            field1491++;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)I")
    public static final int method652(int arg0, byte arg1) {
        if (arg1 == -104) {
            field1472++;
            return arg0 == 16711935 ? -1 : class36.method263(arg0, -229);
        } else {
            return -93;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method653(int arg0, Throwable arg1) throws IOException {
        field1485++;
        String var3;
        if (arg1 instanceof class195) {
            class195 var2 = (class195) arg1;
            arg1 = var2.field3162;
            var3 = var2.field3159 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg0 != -15575) {
            field1486 = null;
        }
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
    public static final void method654(byte arg0) {
        field1493++;
        int var1 = class159.field2596;
        int var2 = class229.field3597;
        int var3 = class128.field2059;
        int var4 = class120.field1904 - 3;
        byte var5 = 20;
        if (class125.field2011 == null || class233.field3646 == null) {
            if (class118.field1844.method1168(arg0 + 72, class78.field1262) && class118.field1844.method1168(0, class57.field826)) {
                class125.field2011 = class124.method854((byte) -78, class78.field1262, 0, class118.field1844);
                class233.field3646 = class124.method854((byte) -44, class57.field826, 0, class118.field1844);
            } else {
                class94.method668(var3, var2, var1, var5, class101.field1583, 256 - class280.field4564);
            }
        }
        if (class125.field2011 != null && class233.field3646 != null) {
            int var6 = (var1 - (class233.field3646.field4784 * 2)) / class125.field2011.field4784;
            for (int var7 = 0; var7 < var6; var7++) {
                class125.field2011.method451(class125.field2011.field4784 * var7 + class233.field3646.field4784 + var3, var2);
            }
            class233.field3646.method451(var3, var2);
            class233.field3646.method445(var3 + var1 - class233.field3646.field4784, var2);
        }
        class170.field2792.method505(class123.field1958, var3 + 3, var2 + 14, class189.field3101, -1);
        class94.method668(var3, var2 + var5, var1, var4 - var5, class101.field1583, 256 - class280.field4564);
        if (arg0 != -72) {
            return;
        }
        int var8 = class287.field4640;
        int var9 = class55.field797;
        for (int var10 = 0; var10 < class291.field4776; var10++) {
            int var18 = (class291.field4776 - var10 - 1) * 15 + var2 - (-var5 + -13);
            if (var8 > var3 && var1 + var3 > var8 && var9 > (var18 - 13) && var9 < var18 + 3) {
                class94.method668(var3, var18 - 12, var1, 15, class168.field2762, 256 - class26.field471);
            }
        }
        if ((class169.field2780 == null || class280.field4553 == null || class45.field668 == null) && class118.field1844.method1168(arg0 ^ 0xFFFFFFB8, class290.field4735) && class118.field1844.method1168(0, class54.field791) && class118.field1844.method1168(0, class65.field1054)) {
            class169.field2780 = class124.method854((byte) -57, class290.field4735, 0, class118.field1844);
            class280.field4553 = class124.method854((byte) -3, class54.field791, 0, class118.field1844);
            class45.field668 = class124.method854((byte) 104, class65.field1054, 0, class118.field1844);
        }
        if (class169.field2780 != null && class280.field4553 != null && class45.field668 != null) {
            int var11 = (var1 - class45.field668.field4784 * 2) / class169.field2780.field4784;
            for (int var12 = 0; var12 < var11; var12++) {
                class169.field2780.method451(class45.field668.field4784 + var3 + (class169.field2780.field4784 * var12), var2 - class169.field2780.field4780 + var4);
            }
            int var13 = (var4 - class45.field668.field4780 - var5) / class280.field4553.field4780;
            for (int var14 = 0; var14 < var13; var14++) {
                class280.field4553.method451(var3, var2 + var5 + (class280.field4553.field4780 * var14));
                class280.field4553.method445(var1 + var3 - class280.field4553.field4784, class280.field4553.field4780 * var14 + var5 + var2);
            }
            class45.field668.method451(var3, var2 + var4 - class45.field668.field4780);
            class45.field668.method445(var1 + var3 - class45.field668.field4784, -class45.field668.field4780 + var4 + var2);
        }
        for (int var15 = 0; var15 < class291.field4776; var15++) {
            int var16 = (class291.field4776 - var15 - 1) * 15 + var2 + var5 + 13;
            int var17 = class189.field3101;
            if (var3 < var8 && var8 < (var1 + var3) && var16 - 13 < var9 && var9 < var16 + 3) {
                var17 = class244.field3871;
            }
            class170.field2792.method505(class292.method2016(var15, 72), var3 + 3, var16, var17, 0);
        }
        class304.method2071(class120.field1904, class128.field2059, class159.field2596, arg0 ^ 0xFFFFFFB8, class229.field3597);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIZIII)V")
    public static final void method655(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1477++;
        if (!arg4 && class296.field4824 == arg1 && class311.field5030 == arg6 && class87.field1367 == arg0 || class143.method981(22351)) {
            return;
        }
        class311.field5030 = arg6;
        class296.field4824 = arg1;
        class87.field1367 = arg0;
        if (class143.method981(22351)) {
            class87.field1367 = 0;
        }
        if (arg2) {
            class143.method983(28, 16590);
        } else {
            class143.method983(25, 16590);
        }
        class247.method1671(class115.field1755, true, -436);
        if (arg7 <= 31) {
            return;
        }
        int var8 = class145.field2327;
        class145.field2327 = (arg6 - 6) * 8;
        int var9 = class75.field1211;
        class75.field1211 = arg1 * 8 - 48;
        class144.field2318 = class262.method1764(class296.field4824 * 8, class311.field5030 * 8);
        int var10 = class75.field1211 - var9;
        class68.field1092 = null;
        int var11 = class75.field1211;
        int var12 = class145.field2327 - var8;
        int var13 = class145.field2327;
        if (arg2) {
            class91.field1439 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class104 var33 = class131.field2113[var17];
                if (var33 != null) {
                    var33.field929 -= var12 * 128;
                    var33.field994 -= var10 * 128;
                    if (var33.field994 >= 0 && var33.field994 <= 13184 && var33.field929 >= 0 && var33.field929 <= 13184) {
                        for (int var34 = 0; var34 < 10; var34++) {
                            var33.field965[var34] -= var10;
                            var33.field956[var34] -= var12;
                        }
                        class34.field556[class91.field1439++] = var17;
                    } else {
                        class131.field2113[var17].method743((class242) null, (byte) -124);
                        class131.field2113[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class104 var15 = class131.field2113[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field965[var16] -= var10;
                        var15.field956[var16] -= var12;
                    }
                    var15.field929 -= var12 * 128;
                    var15.field994 -= var10 * 128;
                }
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class12 var31 = class28.field494[var18];
            if (var31 != null) {
                for (int var32 = 0; var32 < 10; var32++) {
                    var31.field965[var32] -= var10;
                    var31.field956[var32] -= var12;
                }
                var31.field929 -= var12 * 128;
                var31.field994 -= var10 * 128;
            }
        }
        class214.field3389 = arg0;
        byte var19 = 0;
        class217.field3408.method97(false, 512, arg3, arg5);
        byte var20 = 104;
        byte var21 = 1;
        if (var10 < 0) {
            var21 = -1;
            var19 = 103;
            var20 = -1;
        }
        byte var22 = 104;
        byte var23 = 1;
        byte var24 = 0;
        if (var12 < 0) {
            var24 = 103;
            var22 = -1;
            var23 = -1;
        }
        for (int var25 = var19; var25 != var20; var25 += var21) {
            for (int var27 = var24; var27 != var22; var27 += var23) {
                int var28 = var12 + var27;
                int var29 = var10 + var25;
                for (int var30 = 0; var30 < 4; var30++) {
                    if (var29 >= 0 && var28 >= 0 && var29 < 104 && var28 < 104) {
                        class296.field4827[var30][var25][var27] = class296.field4827[var30][var29][var28];
                    } else {
                        class296.field4827[var30][var25][var27] = null;
                    }
                }
            }
        }
        for (class127 var26 = (class127) class148.field2366.method1553(true); var26 != null; var26 = (class127) class148.field2366.method1551(0)) {
            var26.field2024 -= var12;
            var26.field2035 -= var10;
            if (var26.field2035 < 0 || var26.field2024 < 0 || var26.field2035 >= 104 || var26.field2024 >= 104) {
                var26.method952((byte) 72);
            }
        }
        class162.field2647 = 0;
        if (class35.field569 != 0) {
            class35.field569 -= var10;
            class164.field2690 -= var12;
        }
        if (arg2) {
            class272.field4377 -= var12;
            class135.field2182 -= var12;
            class135.field2184 -= var10 * 128;
            class123.field1960 -= var12 * 128;
            class8.field176 -= var10;
            class90.field1414 -= var10;
        } else {
            class231.field3613 = 1;
        }
        class214.method1470(-1);
        class127.field2023.method1549(0);
        class173.field2894.method1549(0);
        class181.method1279();
    }
}
