import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class233 extends class182 {

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "[I")
    private int[] field3810 = new int[257];

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "I")
    public static int field3818 = -1;

    @OriginalMember(owner = "client!eo", name = "T", descriptor = "Z")
    public static boolean field3821 = false;

    @OriginalMember(owner = "client!eo", name = "U", descriptor = "I")
    public static int field3822 = 0;

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "Z")
    public static boolean field3817 = false;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!eo", name = "L", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!eo", name = "S", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!eo", name = "V", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!eo", name = "W", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!eo", name = "X", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "[Lre;")
    public static class308[] field3811;

    @OriginalMember(owner = "client!eo", name = "Y", descriptor = "[[I")
    private int[][] field3826;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V", line = 4)
    private final void method1620(byte arg0, int arg1) {
        field3813++;
        if (arg0 != 4) {
            field3817 = true;
        }
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field3826 = new int[2][4];
            this.field3826[0][3] = 0;
            this.field3826[0][1] = 0;
            this.field3826[1][1] = 4096;
            this.field3826[1][3] = 4096;
            this.field3826[0][0] = 0;
            this.field3826[1][0] = 4096;
            this.field3826[0][2] = 0;
            this.field3826[1][2] = 4096;
        } else if (arg1 == 2) {
            this.field3826 = new int[8][4];
            this.field3826[0][1] = 2650;
            this.field3826[0][0] = 0;
            this.field3826[1][0] = 2867;
            this.field3826[0][2] = 2602;
            this.field3826[1][1] = 2313;
            this.field3826[2][1] = 2618;
            this.field3826[3][1] = 2296;
            this.field3826[4][1] = 2072;
            this.field3826[5][1] = 2730;
            this.field3826[0][3] = 2361;
            this.field3826[1][3] = 1558;
            this.field3826[2][3] = 1413;
            this.field3826[6][1] = 2232;
            this.field3826[1][2] = 1799;
            this.field3826[2][2] = 1734;
            this.field3826[2][0] = 3072;
            this.field3826[7][1] = 1686;
            this.field3826[3][0] = 3276;
            this.field3826[3][3] = 947;
            this.field3826[4][0] = 3481;
            this.field3826[4][3] = 722;
            this.field3826[3][2] = 1220;
            this.field3826[5][0] = 3686;
            this.field3826[6][0] = 3891;
            this.field3826[4][2] = 963;
            this.field3826[5][3] = 1766;
            this.field3826[7][0] = 4096;
            this.field3826[6][3] = 915;
            this.field3826[5][2] = 2152;
            this.field3826[6][2] = 1060;
            this.field3826[7][2] = 1413;
            this.field3826[7][3] = 1140;
        } else if (arg1 == 3) {
            this.field3826 = new int[7][4];
            this.field3826[0][1] = 0;
            this.field3826[0][3] = 4096;
            this.field3826[0][2] = 0;
            this.field3826[1][2] = 4096;
            this.field3826[0][0] = 0;
            this.field3826[1][3] = 4096;
            this.field3826[1][0] = 663;
            this.field3826[2][2] = 4096;
            this.field3826[1][1] = 0;
            this.field3826[2][3] = 0;
            this.field3826[3][3] = 0;
            this.field3826[2][0] = 1363;
            this.field3826[3][0] = 2048;
            this.field3826[4][0] = 2727;
            this.field3826[5][0] = 3411;
            this.field3826[4][3] = 0;
            this.field3826[2][1] = 0;
            this.field3826[6][0] = 4096;
            this.field3826[3][1] = 4096;
            this.field3826[3][2] = 4096;
            this.field3826[4][1] = 4096;
            this.field3826[4][2] = 0;
            this.field3826[5][3] = 4096;
            this.field3826[6][3] = 4096;
            this.field3826[5][2] = 0;
            this.field3826[6][2] = 0;
            this.field3826[5][1] = 4096;
            this.field3826[6][1] = 0;
        } else if (arg1 == 4) {
            this.field3826 = new int[6][4];
            this.field3826[0][1] = 0;
            this.field3826[1][1] = 0;
            this.field3826[0][0] = 0;
            this.field3826[2][1] = 0;
            this.field3826[0][3] = 0;
            this.field3826[0][2] = 0;
            this.field3826[1][2] = 0;
            this.field3826[3][1] = 0;
            this.field3826[1][3] = 1493;
            this.field3826[1][0] = 1843;
            this.field3826[2][0] = 2457;
            this.field3826[2][2] = 0;
            this.field3826[2][3] = 2939;
            this.field3826[3][2] = 1124;
            this.field3826[4][2] = 3084;
            this.field3826[3][3] = 3565;
            this.field3826[5][2] = 4096;
            this.field3826[4][1] = 546;
            this.field3826[5][1] = 4096;
            this.field3826[4][3] = 4031;
            this.field3826[3][0] = 2781;
            this.field3826[4][0] = 3481;
            this.field3826[5][0] = 4096;
            this.field3826[5][3] = 4096;
        } else if (arg1 == 5) {
            this.field3826 = new int[16][4];
            this.field3826[0][3] = 321;
            this.field3826[0][2] = 192;
            this.field3826[0][1] = 80;
            this.field3826[0][0] = 0;
            this.field3826[1][1] = 321;
            this.field3826[1][0] = 155;
            this.field3826[2][0] = 389;
            this.field3826[2][1] = 578;
            this.field3826[3][0] = 671;
            this.field3826[4][0] = 897;
            this.field3826[1][3] = 562;
            this.field3826[3][1] = 947;
            this.field3826[4][1] = 1285;
            this.field3826[5][1] = 1525;
            this.field3826[2][3] = 803;
            this.field3826[3][3] = 1140;
            this.field3826[4][3] = 1509;
            this.field3826[5][0] = 1175;
            this.field3826[6][0] = 1368;
            this.field3826[5][3] = 1413;
            this.field3826[7][0] = 1507;
            this.field3826[6][1] = 1734;
            this.field3826[8][0] = 1736;
            this.field3826[7][1] = 1413;
            this.field3826[6][3] = 1333;
            this.field3826[9][0] = 2088;
            this.field3826[1][2] = 449;
            this.field3826[10][0] = 2355;
            this.field3826[11][0] = 2691;
            this.field3826[7][3] = 1702;
            this.field3826[8][3] = 2056;
            this.field3826[12][0] = 3031;
            this.field3826[13][0] = 3522;
            this.field3826[9][3] = 2666;
            this.field3826[14][0] = 3727;
            this.field3826[10][3] = 3276;
            this.field3826[8][1] = 1108;
            this.field3826[2][2] = 690;
            this.field3826[15][0] = 4096;
            this.field3826[11][3] = 3228;
            this.field3826[12][3] = 3196;
            this.field3826[13][3] = 3019;
            this.field3826[14][3] = 3228;
            this.field3826[15][3] = 2746;
            this.field3826[9][1] = 1766;
            this.field3826[10][1] = 2409;
            this.field3826[11][1] = 3116;
            this.field3826[12][1] = 3806;
            this.field3826[3][2] = 995;
            this.field3826[4][2] = 1397;
            this.field3826[13][1] = 3437;
            this.field3826[14][1] = 3116;
            this.field3826[15][1] = 2377;
            this.field3826[5][2] = 1429;
            this.field3826[6][2] = 1461;
            this.field3826[7][2] = 1525;
            this.field3826[8][2] = 1590;
            this.field3826[9][2] = 2056;
            this.field3826[10][2] = 2586;
            this.field3826[11][2] = 3148;
            this.field3826[12][2] = 3710;
            this.field3826[13][2] = 3421;
            this.field3826[14][2] = 3148;
            this.field3826[15][2] = 2505;
        } else if (arg1 == 6) {
            this.field3826 = new int[4][4];
            this.field3826[0][2] = 4096;
            this.field3826[0][1] = 0;
            this.field3826[0][0] = 2048;
            this.field3826[1][1] = 4096;
            this.field3826[1][2] = 4096;
            this.field3826[2][1] = 4096;
            this.field3826[0][3] = 0;
            this.field3826[1][3] = 0;
            this.field3826[1][0] = 2867;
            this.field3826[2][3] = 0;
            this.field3826[3][1] = 4096;
            this.field3826[3][3] = 0;
            this.field3826[2][2] = 4096;
            this.field3826[3][2] = 0;
            this.field3826[2][0] = 3276;
            this.field3826[3][0] = 4096;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "(I)V", line = 258)
    public static final void method1621(int arg0) {
        field3816++;
        int var1 = class137.field2340;
        int var2 = class278.field4528;
        int var3 = class351.field5616;
        int var4 = 126 % ((-arg0 - 49) / 32);
        int var5 = class232.field3802 - 3;
        byte var6 = 20;
        if (class156.field2639 == null || class71.field1300 == null) {
            if (class99.field1828.method1401(class9.field279, -2689) && class99.field1828.method1401(class56.field1098, -2689)) {
                class156.field2639 = class216.method1504(class99.field1828, (byte) -113, 0, class9.field279);
                class71.field1300 = class216.method1504(class99.field1828, (byte) -51, 0, class56.field1098);
                if (class241.field4016) {
                    if (class156.field2639 instanceof class183) {
                        class156.field2639 = new class313((class288) class156.field2639);
                    } else {
                        class156.field2639 = new class265((class288) class156.field2639);
                    }
                    if (class71.field1300 instanceof class183) {
                        class71.field1300 = new class313((class288) class71.field1300);
                    } else {
                        class71.field1300 = new class265((class288) class71.field1300);
                    }
                }
            } else if (class241.field4016) {
                class337.method2380(var1, var3, var2, var6, class255.field4176, 256 - class240.field3990);
            } else {
                class270.method1890(var1, var3, var2, var6, class255.field4176, 256 - class240.field3990);
            }
        }
        if (class156.field2639 != null && class71.field1300 != null) {
            int var7 = (var2 - (class71.field1300.field1353 * 2)) / class156.field2639.field1353;
            for (int var8 = 0; var8 < var7; var8++) {
                class156.field2639.method568(class156.field2639.field1353 * var8 + class71.field1300.field1353 + var1, var3);
            }
            class71.field1300.method568(var1, var3);
            class71.field1300.method575(var1 + var2 - class71.field1300.field1353, var3);
        }
        class332.field5297.method619(class20.field518, var1 + 3, var3 + 14, class10.field294, -1);
        if (class241.field4016) {
            class337.method2380(var1, var3 + var6, var2, var5 - var6, class255.field4176, 256 - class240.field3990);
        } else {
            class270.method1890(var1, var3 + var6, var2, var5 - var6, class255.field4176, 256 - class240.field3990);
        }
        int var9 = class73.field1339;
        int var10 = class26.field662;
        for (int var11 = 0; var11 < class137.field2343; var11++) {
            int var12 = var3 + var6 - (-13 - (class137.field2343 + -1 - var11) * 15);
            if (var9 > var1 && var9 < var1 + var2 && (var12 - 13) < var10 && (var12 + 3) > var10) {
                if (class241.field4016) {
                    class337.method2380(var1, var12 - 12, var2, 15, class291.field4713, 256 - class276.field4496);
                } else {
                    class270.method1890(var1, var12 - 12, var2, 15, class291.field4713, 256 - class276.field4496);
                }
            }
        }
        if ((class114.field2066 == null || class15.field450 == null || class220.field3652 == null) && class99.field1828.method1401(class108.field1994, -2689) && class99.field1828.method1401(class222.field3666, -2689) && class99.field1828.method1401(class71.field1297, -2689)) {
            class114.field2066 = class216.method1504(class99.field1828, (byte) -73, 0, class108.field1994);
            class15.field450 = class216.method1504(class99.field1828, (byte) -53, 0, class222.field3666);
            class220.field3652 = class216.method1504(class99.field1828, (byte) -103, 0, class71.field1297);
            if (class241.field4016) {
                if ((class114.field2066 instanceof class183)) {
                    class114.field2066 = new class313((class288) class114.field2066);
                } else {
                    class114.field2066 = new class265((class288) class114.field2066);
                }
                if (class15.field450 instanceof class183) {
                    class15.field450 = new class313((class288) class15.field450);
                } else {
                    class15.field450 = new class265((class288) class15.field450);
                }
                if ((class220.field3652 instanceof class183)) {
                    class220.field3652 = new class313((class288) class220.field3652);
                } else {
                    class220.field3652 = new class265((class288) class220.field3652);
                }
            }
        }
        if (class114.field2066 != null && class15.field450 != null && class220.field3652 != null) {
            int var13 = (var2 - (class220.field3652.field1353 * 2)) / class114.field2066.field1353;
            for (int var14 = 0; var14 < var13; var14++) {
                class114.field2066.method568(class114.field2066.field1353 * var14 + class220.field3652.field1353 + var1, -class114.field2066.field1356 + var3 - -var5);
            }
            int var15 = (var5 - var6 - class220.field3652.field1356) / class15.field450.field1356;
            for (int var16 = 0; var16 < var15; var16++) {
                class15.field450.method568(var1, class15.field450.field1356 * var16 + var3 + var6);
                class15.field450.method575(var1 + var2 - class15.field450.field1353, class15.field450.field1356 * var16 + (var3 - -var6));
            }
            class220.field3652.method568(var1, var5 + var3 - class220.field3652.field1356);
            class220.field3652.method575(var2 + var1 - class220.field3652.field1353, var3 + var5 + -class220.field3652.field1356);
        }
        for (int var17 = 0; var17 < class137.field2343; var17++) {
            int var18 = (class137.field2343 - var17 - 1) * 15 + var3 + var6 + 13;
            int var19 = class10.field294;
            if (var9 > var1 && var9 < (var1 + var2) && (var18 - 13) < var10 && (var18 + 3) > var10) {
                var19 = class353.field5638;
            }
            class332.field5297.method619(class142.method972(var17, (byte) 37), var1 + 3, var18, var19, 0);
        }
        class192.method1331(class137.field2340, -18359, class232.field3802, class351.field5616, class278.field4528);
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V", line = 435)
    public class233() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)[[I", line = 441)
    public final int[][] method122(int arg0, int arg1) {
        if (arg1 != 4944) {
            field3811 = (class308[]) null;
        }
        int[][] var3 = this.field3152.method1953(arg0, 91);
        field3823++;
        if (this.field3152.field4493) {
            int[] var4 = this.method1292(arg0, 0, arg1 ^ 0xFFFFECC6);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            for (int var8 = 0; var8 < class26.field672; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3810[var9];
                var7[var8] = class83.method613(4080, var10 >> 12);
                var5[var8] = class83.method613(var10, 65280) >> 4;
                var6[var8] = class83.method613(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLoe;)Lng;", line = 491)
    public static final class182 method1622(byte arg0, class146 arg1) {
        arg1.method1005((byte) 122);
        int var2 = arg1.method1005((byte) 122);
        class182 var3 = class133.method940(var2, 118);
        field3815++;
        var3.field3164 = arg1.method1005((byte) 122);
        int var4 = arg1.method1005((byte) 122);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1005((byte) 122);
            var3.method126(arg1, var6, (byte) 60);
        }
        if (arg0 <= 43) {
            field3822 = -35;
        }
        var3.method163(100);
        return var3;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILl;Loi;)Lwl;", line = 528)
    public static final class102 method1623(int arg0, class328 arg1, class352 arg2) {
        int var3 = -100 / ((arg0 + 19) / 54);
        field3820++;
        long var4 = ((long) arg2.field5636 << 32) + ((long) arg2.field5621 << 56) + (long) (arg2.field5620 - -(arg2.field5633 + 1 << 16));
        class102 var6 = (class102) arg1.method2344(-1, var4);
        if (var6 == null) {
            var6 = new class102(arg2.field5633, (float) arg2.field5620, true, false, arg2.field5636);
            arg1.method2337(var6, 709, var4);
        }
        return var6;
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V", line = 546)
    public static final void method1624(byte arg0) {
        class292.field4729.method895(128);
        class200.field3357.method895(128);
        if (arg0 <= 19) {
            field3817 = true;
        }
        class11.field352.method895(128);
        field3814++;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Loe;IB)V", line = 569)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            int var4 = arg0.method1005((byte) 122);
            if (var4 == 0) {
                this.field3826 = new int[arg0.method1005((byte) 122)][4];
                for (int var5 = 0; var5 < this.field3826.length; var5++) {
                    this.field3826[var5][0] = arg0.method989(arg2 + 67);
                    this.field3826[var5][1] = arg0.method1005((byte) 122) << 4;
                    this.field3826[var5][2] = arg0.method1005((byte) 122) << 4;
                    this.field3826[var5][3] = arg0.method1005((byte) 122) << 4;
                }
            } else {
                this.method1620((byte) 4, var4);
            }
        }
        if (arg2 == 60) {
            field3819++;
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V", line = 623)
    private final void method1625(byte arg0) {
        field3812++;
        int var2 = this.field3826.length;
        int var3 = 91 / ((-arg0 - 53) / 58);
        if (var2 <= 0) {
            return;
        }
        for (int var4 = 0; var4 < 257; var4++) {
            int var5 = 0;
            int var6 = var4 << 4;
            for (int var7 = 0; var7 < var2 && this.field3826[var7][0] <= var6; var7++) {
                var5++;
            }
            int var9;
            int var10;
            int var11;
            if (var2 > var5) {
                int[] var8 = this.field3826[var5];
                if (var5 <= 0) {
                    var9 = var8[3];
                    var10 = var8[2];
                    var11 = var8[1];
                } else {
                    int[] var12 = this.field3826[var5 - 1];
                    int var13 = (var6 - var12[0] << 12) / (var8[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var11 = var8[1] * var13 + var12[1] * var14 >> 12;
                    var10 = var8[2] * var13 + var12[2] * var14 >> 12;
                    var9 = var8[3] * var13 + var12[3] * var14 >> 12;
                }
            } else {
                int[] var15 = this.field3826[var2 - 1];
                var11 = var15[1];
                var9 = var15[3];
                var10 = var15[2];
            }
            int var16 = var10 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var9 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var18 = var11 >> 4;
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            this.field3810[var4] = class287.method2034(class287.method2034(var18 << 16, var16 << 8), var17);
        }
    }

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)V", line = 730)
    public final void method163(int arg0) {
        if (this.field3826 == null) {
            this.method1620((byte) 4, 1);
        }
        field3825++;
        this.method1625((byte) -126);
        if (arg0 != 100) {
            this.field3810 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(B)V", line = 752)
    public static void method1626(byte arg0) {
        field3811 = null;
        if (arg0 >= -81) {
            method1626((byte) 94);
        }
    }
}
