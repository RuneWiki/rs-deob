import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class50 {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    private int field711 = -1;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    private int field717 = 0;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Lmg;")
    private class530 field719 = new class530();

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "Z")
    public boolean field726 = false;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    private int field720;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    private int field724;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "[[[I")
    private int[][][] field722;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "[Liu;")
    private class429[] field723;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "[I")
    public static int[] field713 = new int[1000];

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Lmg;")
    public static class530 field708 = new class530();

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "Lvv;")
    public static class531 field725 = new class531();

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "Lrb;")
    public static class283 field727 = new class283(35, -2);

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "Lec;")
    public static class109 field716;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public final void method332(int arg0) {
        field709++;
        for (int var2 = 0; var2 < this.field720; var2++) {
            this.field722[var2][0] = null;
            this.field722[var2][1] = null;
            this.field722[var2][2] = null;
            this.field722[var2] = null;
        }
        this.field722 = null;
        this.field723 = null;
        this.field719.method3143(true);
        this.field719 = null;
        if (arg0 != 1) {
            this.method332(12);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public static void method333(int arg0) {
        field708 = null;
        field716 = null;
        field725 = null;
        field727 = null;
        if (arg0 != 30) {
            field714 = 57;
        }
        field713 = null;
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)[[[I")
    public final int[][][] method334(int arg0) {
        if (arg0 != -4324) {
            return null;
        }
        field712++;
        if (this.field724 != this.field720) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field720; var2++) {
            this.field723[var2] = class447.field6565;
        }
        return this.field722;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lza;IIZ)V")
    public static final void method335(class295 arg0, int arg1, int arg2, boolean arg3) {
        field710++;
        if (arg2 < 0 || arg1 < 0 || class219.field3097 == 0 || class429.field6225 == 0) {
            return;
        }
        arg0.method471(class256.field3488, class68.field977, class219.field3097, class429.field6225);
        arg0.method511(class414.field5910, class246.field3359, class219.field3097, class429.field6225);
        class512 var4 = arg0.method489();
        var4.method943(class487.field7049, class385.field5527, class267.field3596, class508.field7418, class438.field6315, class504.field7376);
        arg0.method548(var4);
        if (class348.field5000 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg0.method520();
            int var8 = (arg2 - class256.field3488) * var7 / class219.field3097;
            int var9 = (arg1 - class68.field977) * var7 / class429.field6225;
            int var10 = arg0.method464();
            int var11 = (arg2 - class256.field3488) * var10 / class219.field3097;
            int var12 = (arg1 - class68.field977) * var10 / class429.field6225;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method941(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method941(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class9.field111 && var22 < class192.field2809) {
                    int var23 = class81.field1158.field6279;
                    if (var23 < 3 && (class27.field379[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class348.field5000[var23].method79(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class81.field1158.method116(8569) - 1 << 6) >> 7;
                        var6 = var21 + (class81.field1158.method116(8569) - 1 << 6) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class375.field5390 && (class107.field1737 & 0x40) != 0) {
                    class444 var24 = class222.method1381(class478.field6914, class478.field6916, -111);
                    if (var24 == null) {
                        class319.method1893(-75);
                    } else {
                        class193.method1274(var5, class87.field1409, true, class484.field6965, " ->", -1, var6, 59, false, true, 0L);
                    }
                } else {
                    if (class308.field4192 == class152.field2343) {
                        class193.method1274(var5, class2.field34.method1126(class486.field6998, (byte) -19), true, -1, "", -1, var6, 50, false, true, 0L);
                    }
                    class36.field553++;
                    class193.method1274(var5, class76.field1078, true, class347.field4989, "", -1, var6, 10, false, true, 0L);
                }
            }
        }
        class439 var25 = class116.field1835;
        if (arg3) {
            return;
        }
        for (class121 var26 = (class121) var25.method2600((byte) 125); var26 != null; var26 = (class121) var25.method2601(117)) {
            if ((class214.field3053 || class81.field1158.field6279 == var26.field1879) && var26.method888(arg1, 31, arg2, arg0)) {
                if (var26.field1881 instanceof class487) {
                    class487 var27 = (class487) var26.field1881;
                    int var28 = var27.method116(8569);
                    if ((var28 & 0x1) == 0 && (var27.field6284 & 0x7F) == 0 && (var27.field6287 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field6284 & 0x7F) == 64 && (var27.field6287 & 0x7F) == 64) {
                        int var29 = var27.field6284 - (var27.method116(8569) - 1 << 6);
                        int var30 = var27.field6287 - (var27.method116(8569) - 1 << 6);
                        for (int var31 = 0; var31 < class273.field3692; var31++) {
                            class326 var38 = (class326) class281.field3826.method1592((byte) -25, (long) class159.field2416[var31]);
                            if (var38 != null) {
                                class209 var39 = var38.field4455;
                                if (class28.field417 != var39.field243 && var39.field213) {
                                    int var40 = var39.field6284 - (var39.field2976.field1228 - 1 << 6);
                                    int var41 = var39.field6287 - (var39.field2976.field1228 - 1 << 6);
                                    if (var29 <= var40 && var39.field2976.field1228 <= (var27.method116(8569) - (var40 - var29 >> 7)) && var30 <= var41 && var39.field2976.field1228 <= var27.method116(8569) - (var41 - var30 >> 7)) {
                                        class371.method2215(0, var39, class81.field1158.field6279 != var26.field1879);
                                        var39.field243 = class28.field417;
                                    }
                                }
                            }
                        }
                        int var32 = class210.field3001;
                        int[] var33 = class169.field2570;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class487 var35 = class45.field642[var33[var34]];
                            if (var35 != null && class28.field417 != var35.field243 && var27 != var35 && var35.field213) {
                                int var36 = var35.field6284 - (var35.method116(8569) - 1 << 6);
                                int var37 = var35.field6287 - (var35.method116(8569) - 1 << 6);
                                if (var29 <= var36 && var35.method116(8569) <= var27.method116(8569) - (var36 - var29 >> 7) && var30 <= var37 && var35.method116(8569) <= (var27.method116(8569) - (var37 - var30 >> 7))) {
                                    class292.method1694(true, var35, class81.field1158.field6279 != var26.field1879);
                                    var35.field243 = class28.field417;
                                }
                            }
                        }
                    }
                    if (class28.field417 == var27.field243) {
                        continue;
                    }
                    class292.method1694(!arg3, var27, class81.field1158.field6279 != var26.field1879);
                    var27.field243 = class28.field417;
                }
                if (var26.field1881 instanceof class209) {
                    class209 var42 = (class209) var26.field1881;
                    if (var42.field2976 != null) {
                        if ((var42.field2976.field1228 & 0x1) == 0 && (var42.field6284 & 0x7F) == 0 && (var42.field6287 & 0x7F) == 0 || (var42.field2976.field1228 & 0x1) == 1 && (var42.field6284 & 0x7F) == 64 && (var42.field6287 & 0x7F) == 64) {
                            int var43 = var42.field6284 - (var42.field2976.field1228 - 1 << 6);
                            int var44 = var42.field6287 - (var42.field2976.field1228 - 1 << 6);
                            for (int var45 = 0; var45 < class273.field3692; var45++) {
                                class326 var52 = (class326) class281.field3826.method1592((byte) -25, (long) class159.field2416[var45]);
                                if (var52 != null) {
                                    class209 var53 = var52.field4455;
                                    if (class28.field417 != var53.field243 && var42 != var53 && var53.field213) {
                                        int var54 = var53.field6284 - (var53.field2976.field1228 - 1 << 6);
                                        int var55 = var53.field6287 - (var53.field2976.field1228 - 1 << 6);
                                        if (var54 >= var43 && var53.field2976.field1228 <= (var42.field2976.field1228 - (var54 - var43 >> 7)) && var44 <= var55 && var53.field2976.field1228 <= var42.field2976.field1228 - (var55 - var44 >> 7)) {
                                            class371.method2215(0, var53, class81.field1158.field6279 != var26.field1879);
                                            var53.field243 = class28.field417;
                                        }
                                    }
                                }
                            }
                            int var46 = class210.field3001;
                            int[] var47 = class169.field2570;
                            for (int var48 = 0; var48 < var46; var48++) {
                                class487 var49 = class45.field642[var47[var48]];
                                if (var49 != null && class28.field417 != var49.field243 && var49.field213) {
                                    int var50 = var49.field6284 - (var49.method116(8569) - 1 << 6);
                                    int var51 = var49.field6287 - (var49.method116(8569) - 1 << 6);
                                    if (var50 >= var43 && var49.method116(8569) <= (var42.field2976.field1228 - (var50 - var43 >> 7)) && var51 >= var44 && var49.method116(8569) <= (var42.field2976.field1228 - (var51 - var44 >> 7))) {
                                        class292.method1694(true, var49, class81.field1158.field6279 != var26.field1879);
                                        var49.field243 = class28.field417;
                                    }
                                }
                            }
                        }
                        if (class28.field417 == var42.field243) {
                            continue;
                        }
                        class371.method2215(0, var42, class81.field1158.field6279 != var26.field1879);
                        var42.field243 = class28.field417;
                    }
                }
                if (var26.field1881 instanceof class222) {
                    int var56 = class110.field1775 + var26.field1885;
                    int var57 = class399.field5727 + var26.field1887;
                    class292 var58 = (class292) class484.field6966.method1592((byte) -25, (long) (var57 << 14 | var26.field1879 << 28 | var56));
                    if (var58 != null) {
                        for (class170 var59 = (class170) var58.field3957.method3145(0); var59 != null; var59 = (class170) var58.field3957.method3142(0)) {
                            class297 var60 = class534.field7872.method3089(var59.field2586, 15);
                            if (!class375.field5390) {
                                if (class81.field1158.field6279 == var26.field1879) {
                                    String[] var61 = var60.field4039;
                                    for (int var62 = 4; var62 >= 0; var62--) {
                                        if (var61 != null && var61[var62] != null) {
                                            byte var63 = 0;
                                            if (var62 == 0) {
                                                var63 = 20;
                                            }
                                            int var64 = class153.field2359;
                                            if (var62 == 1) {
                                                var63 = 30;
                                            }
                                            if (var62 == 2) {
                                                var63 = 47;
                                            }
                                            if (var62 == 3) {
                                                var63 = 44;
                                            }
                                            if (var62 == 4) {
                                                var63 = 48;
                                            }
                                            if (var60.field4067 == var62) {
                                                var64 = var60.field4030;
                                            }
                                            if (var60.field4042 == var62) {
                                                var64 = var60.field4040;
                                            }
                                            class291.field3938++;
                                            class193.method1274(var26.field1885, var61[var62], true, var64, "<col=ff9040>" + var60.field4068, -1, var26.field1887, var63, false, true, (long) var59.field2586);
                                        }
                                    }
                                }
                                class193.method1274(var26.field1885, class309.field4196.method1126(class486.field6998, (byte) -19), true, class480.field6947, "<col=ff9040>" + var60.field4068, -1, var26.field1887, 1006, class81.field1158.field6279 != var26.field1879, true, (long) var59.field2586);
                                class22.field310++;
                            } else if (class81.field1158.field6279 == var26.field1879) {
                                class145 var65 = class284.field3850 == -1 ? null : class365.field5241.method2181((byte) 127, class284.field3850);
                                if ((class107.field1737 & 0x1) != 0 && (var65 == null || var60.method1730(var65.field2140, class284.field3850, (byte) -72) != var65.field2140)) {
                                    class193.method1274(var26.field1885, class87.field1409, true, class484.field6965, class476.field6886 + " -> <col=ff9040>" + var60.field4068, -1, var26.field1887, 51, false, true, (long) var59.field2586);
                                    class281.field3825++;
                                }
                            }
                        }
                    }
                }
                if (var26.field1881 instanceof class303) {
                    class303 var66 = (class303) var26.field1881;
                    class103 var67 = class452.field6629.method603((byte) 122, var66.method170((byte) -66));
                    if (var67.field1613 != null) {
                        var67 = var67.method795(-31036, class309.field4200);
                    }
                    if (var67 != null) {
                        if (!class375.field5390) {
                            if (class81.field1158.field6279 == var26.field1879) {
                                String[] var69 = var67.field1615;
                                if (var69 != null) {
                                    for (int var70 = 4; var70 >= 0; var70--) {
                                        if (var69[var70] != null) {
                                            short var71 = 0;
                                            if (var70 == 0) {
                                                var71 = 15;
                                            }
                                            int var72 = class153.field2359;
                                            if (var70 == 1) {
                                                var71 = 17;
                                            }
                                            if (var70 == 2) {
                                                var71 = 46;
                                            }
                                            if (var70 == 3) {
                                                var71 = 5;
                                            }
                                            if (var67.field1673 == var70) {
                                                var72 = var67.field1685;
                                            }
                                            if (var70 == 4) {
                                                var71 = 1007;
                                            }
                                            if (var67.field1633 == var70) {
                                                var72 = var67.field1699;
                                            }
                                            class144.field2133++;
                                            class193.method1274(var26.field1885, var69[var70], true, var72, "<col=00ffff>" + var67.field1654, -1, var26.field1887, var71, false, true, class257.method1530(var26.field1885, var66, (byte) 93, var26.field1887));
                                        }
                                    }
                                }
                            }
                            class116.field1841++;
                            class193.method1274(var26.field1885, class309.field4196.method1126(class486.field6998, (byte) -19), true, class480.field6947, "<col=00ffff>" + var67.field1654, -1, var26.field1887, 1009, class81.field1158.field6279 != var26.field1879, true, (long) var67.field1646);
                        } else if (class81.field1158.field6279 == var26.field1879) {
                            class145 var68 = class284.field3850 == -1 ? null : class365.field5241.method2181((byte) 108, class284.field3850);
                            if ((class107.field1737 & 0x4) != 0 && (var68 == null || var67.method804(class284.field3850, 30052, var68.field2140) != var68.field2140)) {
                                class193.method1274(var26.field1885, class87.field1409, true, class484.field6965, class476.field6886 + " -> <col=00ffff>" + var67.field1654, -1, var26.field1887, 2, false, !arg3, class257.method1530(var26.field1885, var66, (byte) 98, var26.field1887));
                                class434.field6285++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
    public static final void method336(int arg0) {
        if (arg0 == -20439) {
            field718++;
            class443.field6380.method1012((byte) 106);
            class135.field2056 = null;
            class87.field1418 = 1;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)[[I")
    public final int[][] method337(int arg0, byte arg1) {
        field715++;
        if (arg1 != 75) {
            method338(119, (byte) -14);
        }
        if (this.field724 == this.field720) {
            this.field726 = this.field723[arg0] == null;
            this.field723[arg0] = class447.field6565;
            return this.field722[arg0];
        } else if (this.field720 == 1) {
            this.field726 = this.field711 != arg0;
            this.field711 = arg0;
            return this.field722[0];
        } else {
            class429 var3 = this.field723[arg0];
            if (var3 == null) {
                this.field726 = true;
                if (this.field720 <= this.field717) {
                    class429 var4 = (class429) this.field719.method3145(arg1 ^ 0x4B);
                    var3 = new class429(arg0, var4.field6228);
                    this.field723[var4.field6226] = null;
                    var4.method2791((byte) 112);
                } else {
                    var3 = new class429(arg0, this.field717);
                    this.field717++;
                }
                this.field723[arg0] = var3;
            } else {
                this.field726 = false;
            }
            this.field719.method3141(69, var3);
            return this.field722[var3.field6228];
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(IB)I")
    public static final int method338(int arg0, byte arg1) {
        if (arg1 != -41) {
            field727 = null;
        }
        field721++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(III)V")
    public class50(int arg0, int arg1, int arg2) {
        this.field720 = arg0;
        this.field724 = arg1;
        this.field722 = new int[this.field720][3][arg2];
        this.field723 = new class429[this.field724];
    }
}
