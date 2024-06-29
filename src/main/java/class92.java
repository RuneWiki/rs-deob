import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class92 extends class42 {

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
    private int field2187 = 0;

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "Lad;")
    private static class5 field2183 = class88.method674("Connecting to update server", -81);

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "Lad;")
    private static class5 field2181 = class88.method674("Enter name of player to delete from list", 81);

    @OriginalMember(owner = "client!pb", name = "sb", descriptor = "Lad;")
    public static class5 field2197 = class88.method674("l", -69);

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "Lad;")
    private static class5 field2188 = class88.method674("Try again in 60 secs)3)3)3", -62);

    @OriginalMember(owner = "client!pb", name = "qb", descriptor = "Lad;")
    public static class5 field2195 = field2188;

    @OriginalMember(owner = "client!pb", name = "xb", descriptor = "Lad;")
    public static class5 field2202 = class88.method674("backvmid2", 97);

    @OriginalMember(owner = "client!pb", name = "rb", descriptor = "I")
    public static int field2196 = 0;

    @OriginalMember(owner = "client!pb", name = "ob", descriptor = "Lad;")
    public static class5 field2193 = class88.method674("null", 15);

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "Lad;")
    public static class5 field2184 = field2181;

    @OriginalMember(owner = "client!pb", name = "ub", descriptor = "Lad;")
    public static class5 field2199 = class88.method674("oder benutzen Sie eine andere Welt)3", 63);

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "Lad;")
    public static class5 field2191 = field2183;

    @OriginalMember(owner = "client!pb", name = "Ab", descriptor = "I")
    public static int field2205 = 0;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "Lad;")
    private static class5 field2182 = class88.method674("Loading friend list", 49);

    @OriginalMember(owner = "client!pb", name = "vb", descriptor = "Lad;")
    public static class5 field2200 = field2182;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!pb", name = "pb", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!pb", name = "tb", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!pb", name = "wb", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!pb", name = "yb", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!pb", name = "zb", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!pb", name = "Bb", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!pb", name = "Cb", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!pb", name = "Db", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!pb", name = "Eb", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V", line = 14)
    private final void method700(int arg0, int arg1) {
        field2185++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        int var5 = -55 / ((-arg1 - 56) / 61);
        double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var8 = (double) (arg0 & 0xFF) / 256.0D;
        double var10 = var3;
        double var12 = var3;
        double var14 = 0.0D;
        if (var3 > var6) {
            var12 = var6;
        }
        if (var6 > var3) {
            var10 = var6;
        }
        if (var8 > var10) {
            var10 = var8;
        }
        if (var8 < var12) {
            var12 = var8;
        }
        double var16 = (var10 + var12) / 2.0D;
        this.field2204 = (int) (var16 * 256.0D);
        double var18 = 0.0D;
        if (this.field2204 < 0) {
            this.field2204 = 0;
        } else if (this.field2204 > 255) {
            this.field2204 = 255;
        }
        if (var10 != var12) {
            if (var16 < 0.5D) {
                var18 = (var10 - var12) / (var10 + var12);
            }
            if (var3 == var10) {
                var14 = (var6 - var8) / (var10 - var12);
            } else if (var6 == var10) {
                var14 = (var8 - var3) / (var10 - var12) + 2.0D;
            } else if (var8 == var10) {
                var14 = (var3 - var6) / (var10 - var12) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var18 = (var10 - var12) / (2.0D - var10 - var12);
            }
        }
        this.field2206 = (int) (var18 * 256.0D);
        if (this.field2206 < 0) {
            this.field2206 = 0;
        } else if (this.field2206 > 255) {
            this.field2206 = 255;
        }
        if (var16 > 0.5D) {
            this.field2208 = (int) ((1.0D - var16) * var18 * 512.0D);
        } else {
            this.field2208 = (int) (var16 * var18 * 512.0D);
        }
        double var20 = var14 / 6.0D;
        if (this.field2208 < 1) {
            this.field2208 = 1;
        }
        this.field2192 = (int) ((double) this.field2208 * var20);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)V", line = 103)
    public static final void method701(byte arg0, int arg1) {
        class110.field2755 = arg1;
        field2194++;
        if (arg0 != -109) {
            method702((byte) -87, -116);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)V", line = 135)
    public static final void method702(byte arg0, int arg1) {
        field2186++;
        int[] var2 = class5.field208.field3014;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        if (arg0 < 111) {
            return;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class12.field371[arg1][var21][var5] & 0x18) == 0) {
                    class42.field1065.method768(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class12.field371[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class42.field1065.method768(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class5.field208.method967();
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (10 - ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - ((int) (Math.random() * 20.0D)) - 238);
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class12.field371[arg1][var19][var8] & 0x18) == 0) {
                    class96.method734(var7, var6, (byte) 99, arg1, var19, var8);
                }
                if (arg1 < 3 && (class12.field371[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class96.method734(var7, var6, (byte) 99, arg1 + 1, var19, var8);
                }
            }
        }
        class77.field1821 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class42.field1065.method772(class54.field1344, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class42.method357(var12, (byte) -42).field1678;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class13.field387[class54.field1344].field1418;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x1280108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var9 + 3 > var14 && (var16[var14 + 1][var15] & 0x1280180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x1280102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x1280120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class135.field3260[class77.field1821] = class18.field480[var13];
                        class69.field1631[class77.field1821] = var14;
                        class128.field3047[class77.field1821] = var15;
                        class77.field1821++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILgb;II)V", line = 289)
    private final void method703(int arg0, class39 arg1, int arg2, int arg3) {
        if (arg0 != -28132) {
            this.method700(119, 110);
        }
        field2209++;
        if (arg2 == 1) {
            this.field2187 = arg1.method342(-4);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILgb;)V", line = 305)
    public final void method704(int arg0, int arg1, class39 arg2) {
        while (true) {
            int var4 = arg2.method330(-30864);
            if (var4 == 0) {
                field2198++;
                if (arg1 != -25176) {
                    this.field2204 = -105;
                    return;
                }
                return;
            }
            this.method703(-28132, arg2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V", line = 327)
    public static final void method705(int arg0) {
        class35.method270(false);
        field2207++;
        if (class7.field267 == 2) {
            byte[] var1 = class95.field2258.field3028;
            int[] var2 = class55.field1380;
            int var3 = var1.length;
            for (int var4 = 0; var4 < var3; var4++) {
                if (var1[var4] == 0) {
                    var2[var4] = 0;
                }
            }
            class12.field355.method970(0, 0, 33, 33, 25, 25, class131.field3177, 256, class33.field814, class74.field1779);
            class128.method989(550);
            return;
        }
        int var5 = class131.field3177 + class133.field3220 & 0x7FF;
        int var6 = 464 - class82.field1932.field120 / 32;
        int var7 = class82.field1932.field112 / 32 + 48;
        class5.field208.method970(25, 5, arg0, 151, var7, var6, var5, class102.field2476 + 256, class104.field2523, class4.field141);
        for (int var8 = 0; var8 < class77.field1821; var8++) {
            int var38 = class128.field3047[var8] * 4 + 2 - class82.field1932.field120 / 32;
            int var39 = class69.field1631[var8] * 4 + 2 - class82.field1932.field112 / 32;
            class100.method800(var38, class135.field3260[var8], var39, (byte) 72);
        }
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var34 = 0; var34 < 104; var34++) {
                class23 var35 = class22.field559[class54.field1344][var9][var34];
                if (var35 != null) {
                    int var36 = var9 * 4 + 2 - class82.field1932.field112 / 32;
                    int var37 = var34 * 4 + 2 - class82.field1932.field120 / 32;
                    class100.method800(var37, class35.field876[0], var36, (byte) 92);
                }
            }
        }
        for (int var10 = 0; var10 < class33.field790; var10++) {
            class61 var30 = class103.field2504[class25.field611[var10]];
            if (var30 != null && var30.method23((byte) -81)) {
                class118 var31 = var30.field1498;
                if (var31.field2895 != null) {
                    var31 = var31.method933(11840);
                }
                if (var31 != null && var31.field2939 && var31.field2913) {
                    int var32 = var30.field120 / 32 - class82.field1932.field120 / 32;
                    int var33 = var30.field112 / 32 - class82.field1932.field112 / 32;
                    class100.method800(var32, class35.field876[1], var33, (byte) 65);
                }
            }
        }
        for (int var11 = 0; var11 < class12.field348; var11++) {
            class112 var22 = class7.field251[class105.field2577[var11]];
            if (var22 != null && var22.method23((byte) -117)) {
                int var23 = var22.field112 / 32 - class82.field1932.field112 / 32;
                int var24 = var22.field120 / 32 - class82.field1932.field120 / 32;
                long var25 = var22.field2801.method64((byte) 100);
                boolean var27 = false;
                for (int var28 = 0; var28 < class100.field2437; var28++) {
                    if (class35.field892[var28] == var25 && class40.field1040[var28] != 0) {
                        var27 = true;
                        break;
                    }
                }
                boolean var29 = false;
                if (class82.field1932.field2813 != 0 && var22.field2813 != 0 && class82.field1932.field2813 == var22.field2813) {
                    var29 = true;
                }
                if (var27) {
                    class100.method800(var24, class35.field876[3], var23, (byte) 107);
                } else if (var29) {
                    class100.method800(var24, class35.field876[4], var23, (byte) -68);
                } else {
                    class100.method800(var24, class35.field876[2], var23, (byte) -94);
                }
            }
        }
        if (class95.field2242 != 0 && class69.field1636 % 20 < 10) {
            if (class95.field2242 == 1 && class23.field576 >= 0 && class103.field2504.length > class23.field576) {
                class61 var12 = class103.field2504[class23.field576];
                if (var12 != null) {
                    int var13 = var12.field112 / 32 - class82.field1932.field112 / 32;
                    int var14 = var12.field120 / 32 - class82.field1932.field120 / 32;
                    class59.method480(var14, var13, false, class23.field592[1]);
                }
            }
            if (class95.field2242 == 2) {
                int var15 = (client.field483 - class47.field1235) * 4 + 2 - class82.field1932.field112 / 32;
                int var16 = (class4.field142 - class106.field2659) * 4 + 2 - class82.field1932.field120 / 32;
                class59.method480(var16, var15, false, class23.field592[1]);
            }
            if (class95.field2242 == 10 && class40.field1021 >= 0 && class40.field1021 < class7.field251.length) {
                class112 var17 = class7.field251[class40.field1021];
                if (var17 != null) {
                    int var18 = var17.field120 / 32 - class82.field1932.field120 / 32;
                    int var19 = var17.field112 / 32 - class82.field1932.field112 / 32;
                    class59.method480(var18, var19, false, class23.field592[1]);
                }
            }
        }
        if (class35.field883 != 0) {
            int var20 = class35.field883 * 4 + 2 - class82.field1932.field112 / 32;
            int var21 = class120.field2990 * 4 + 2 - class82.field1932.field120 / 32;
            class100.method800(var21, class23.field592[0], var20, (byte) 88);
        }
        class55.method443(97, 78, 3, 3, 16777215);
        class12.field355.method970(0, 0, 33, 33, 25, 25, class131.field3177, 256, class33.field814, class74.field1779);
        class128.method989(550);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V", line = 528)
    public static void method706(boolean arg0) {
        field2182 = null;
        field2199 = null;
        if (!arg0) {
            return;
        }
        field2184 = null;
        field2181 = null;
        field2197 = null;
        field2202 = null;
        field2191 = null;
        field2200 = null;
        field2183 = null;
        field2195 = null;
        field2188 = null;
        field2193 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[Lad;ZI)Lad;", line = 588)
    public static final class5 method707(int arg0, class5[] arg1, boolean arg2, int arg3) {
        int var4 = 0;
        field2201++;
        int var5 = 0;
        if (!arg2) {
            return null;
        }
        while (arg3 > var5) {
            if (arg1[arg0 + var5] == null) {
                arg1[arg0 + var5] = class49.field1278;
            }
            var4 += arg1[arg0 + var5].field183;
            var5++;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class5 var10 = arg1[arg0 + var8];
            class29.method239(var10.field164, 0, var6, var7, var10.field183);
            var7 += var10.field183;
        }
        class5 var9 = new class5();
        var9.field183 = var4;
        var9.field164 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(Z)V", line = 642)
    public final void method708(boolean arg0) {
        if (!arg0) {
            this.method700(this.field2187, 26);
            field2189++;
        }
    }
}
