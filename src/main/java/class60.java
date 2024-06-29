import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class60 extends class326 {

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    private int field881 = 4096;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "J")
    public static long field878 = 0L;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "Ljava/lang/String;")
    public static String field892 = "Checking for updates - ";

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "Ljava/lang/String;")
    public static String field880 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!wk", name = "Z", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "Lug;")
    public static class253 field877;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIB)I", line = 4)
    public static final int method493(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 20) {
            field885 = -35;
        }
        field889++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(III)Lof;", line = 27)
    public static final class283 method494(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class283 var4 = var3.field1779;
            var3.field1779 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V", line = 39)
    public static final void method495(int arg0) {
        field879++;
        if (arg0 <= 105) {
            field880 = (String) null;
        }
        Container var1;
        if (class134.field1966 != null) {
            var1 = class134.field1966;
        } else if (class184.field2976 == null) {
            var1 = class42.field581.field2181;
        } else {
            var1 = class184.field2976;
        }
        class287.field4434 = var1.getSize().width;
        class333.field5181 = var1.getSize().height;
        if (class184.field2976 == var1) {
            Insets var2 = class184.field2976.getInsets();
            class287.field4434 -= var2.right + var2.left;
            class333.field5181 -= var2.top + var2.bottom;
        }
        if (class113.method800((byte) -117) >= 2) {
            class95.field1258 = class333.field5181;
            class333.field5186 = 0;
            class127.field1841 = class287.field4434;
            class200.field3208 = 0;
        } else {
            class333.field5186 = (class287.field4434 - 765) / 2;
            class95.field1258 = 503;
            class200.field3208 = 0;
            class127.field1841 = 765;
        }
        if (class109.field1458) {
            class109.method742(class127.field1841, class95.field1258);
        }
        class116.field1615.setSize(class127.field1841, class95.field1258);
        if (class184.field2976 == var1) {
            Insets var3 = class184.field2976.getInsets();
            class116.field1615.setLocation(var3.left + class333.field5186, var3.top - -class200.field3208);
        } else {
            class116.field1615.setLocation(class333.field5186, class200.field3208);
        }
        if (class147.field2321 != -1) {
            class197.method1462(true, (byte) -50);
        }
        class271.method1915((byte) -83);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B[Lun;Lug;)V", line = 105)
    public static final void method496(byte arg0, class190[] arg1, class253 arg2) {
        field886++;
        class292.field4525 = arg2;
        class248.field3908 = arg1;
        class342.field5320 = new boolean[class248.field3908.length];
        class283.field4383.method2165((byte) -103);
        int var3 = class292.field4525.method1808(-1, "details");
        int[] var4 = class292.field4525.method1842((byte) 27, var3);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class283.field4383.method2161(class120.method861(-128, var4[var5], new class6(class292.field4525.method1813(var4[var5], var3, true))), (long) var4[var5], -1);
        }
        if (arg0 <= 91) {
            method497(46);
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V", line = 468)
    public class60() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V", line = 137)
    public static void method497(int arg0) {
        field892 = null;
        if (arg0 < 14) {
            field878 = -78L;
        }
        field877 = null;
        field880 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLvl;)V", line = 154)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field884++;
        if (arg0 == 0) {
            this.field881 = arg2.method39((byte) 86);
        }
        if (arg1) {
            field882 = 14;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)[I", line = 170)
    public final int[] method103(int arg0, int arg1) {
        if (arg0 >= -25) {
            return (int[]) null;
        }
        field890++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int[] var4 = this.method2287(0, arg1 - 1 & class29.field427, -3896);
            int[] var5 = this.method2287(0, arg1, -3896);
            int[] var6 = this.method2287(0, class29.field427 & arg1 + 1, -3896);
            for (int var7 = 0; var7 < class166.field2731; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field881;
                int var9 = (var5[var7 + 1 & class215.field3397] - var5[var7 - 1 & class215.field3397]) * this.field881;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 - (-var13 - 4096)) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lvl;I)V", line = 229)
    public static final void method498(class6 arg0, int arg1) {
        field894++;
        int var2 = class6.field113 >> 1;
        int var3 = class46.field609 >> 2 << 10;
        byte[][] var4 = new byte[class251.field3959][class340.field5301];
        while (arg0.field111 < arg0.field115.length) {
            int var5 = 0;
            int var6 = 0;
            boolean var7 = false;
            if (arg0.method58(-288140008) == 1) {
                var5 = arg0.method58(-288140008);
                var7 = true;
                var6 = arg0.method58(-288140008);
            }
            int var8 = arg0.method58(-288140008);
            int var9 = arg0.method58(-288140008);
            int var10 = var8 * 64 - field885;
            int var11 = class4.field42 + class340.field5301 - var9 * 64 - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && class251.field3959 > var10 + 63 && class340.field5301 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var7 || var12 >= var5 * 8 && (var5 * 8 + 8) > var12 && var14 >= var6 * 8 && var14 < (var6 * 8 + 8)) {
                            var13[var11 - var14] = arg0.method83((byte) -108);
                        }
                    }
                }
            } else if (var7) {
                arg0.field111 += 64;
            } else {
                arg0.field111 += 4096;
            }
        }
        int var15 = 5 / ((55 - arg1) / 51);
        int var16 = class340.field5301;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int var20 = class251.field3959;
        int[] var21 = new int[var16];
        int[] var22 = new int[var16];
        for (int var23 = -5; var23 < var20; var23++) {
            for (int var24 = 0; var24 < var16; var24++) {
                int var25 = var23 + 5;
                int var10002;
                if (var20 > var25) {
                    int var26 = var4[var25][var24] & 0xFF;
                    if (var26 > 0) {
                        class146 var27 = class182.method1337(var26 - 1, (byte) 114);
                        var17[var24] += var27.field2307;
                        var19[var24] += var27.field2309;
                        var18[var24] += var27.field2311;
                        var22[var24] += var27.field2300;
                        var10002 = var21[var24]++;
                    }
                }
                int var28 = var23 - 5;
                if (var28 >= 0) {
                    int var29 = var4[var28][var24] & 0xFF;
                    if (var29 > 0) {
                        class146 var30 = class182.method1337(var29 - 1, (byte) 76);
                        var17[var24] -= var30.field2307;
                        var19[var24] -= var30.field2309;
                        var18[var24] -= var30.field2311;
                        var22[var24] -= var30.field2300;
                        var10002 = var21[var24]--;
                    }
                }
            }
            if (var23 >= 0) {
                int[][] var31 = class232.field3629[var23 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                int var36 = 0;
                for (int var37 = -5; var37 < var16; var37++) {
                    int var38 = var37 + 5;
                    if (var16 > var38) {
                        var32 += var18[var38];
                        var33 += var17[var38];
                        var35 += var22[var38];
                        var34 += var19[var38];
                        var36 += var21[var38];
                    }
                    int var39 = var37 - 5;
                    if (var39 >= 0) {
                        var32 -= var18[var39];
                        var33 -= var17[var39];
                        var34 -= var19[var39];
                        var36 -= var21[var39];
                        var35 -= var22[var39];
                    }
                    if (var37 >= 0 && var36 > 0) {
                        int[] var40 = var31[var37 >> 6];
                        int var41 = var35 == 0 ? 0 : class48.method368(var32 / var36, var33 * 256 / var35, var34 / var36, 119);
                        if (var4[var23][var37] != 0) {
                            if (var40 == null) {
                                var40 = var31[var37 >> 6] = new int[4096];
                            }
                            int var42 = (var41 & 0x7F) + var2;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 > 127) {
                                var42 = 127;
                            }
                            int var43 = (var3 + var41 & 0xFC00) - (-(var41 & 0x380) - var42);
                            var40[class333.method2319(var23, 63) + class333.method2319(4032, var37 << 6)] = class31.field461[class314.method2191(96, 13813, var43)];
                        } else if (var40 != null) {
                            var40[class333.method2319(63, var23) + class333.method2319(var37 << 6, 4032)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)Z", line = 454)
    public static final boolean method499(int arg0, int arg1) {
        class246.field3841 = arg1 + 1 & 0xFFFF;
        class82.field1125 = true;
        if (arg0 != 0) {
            field877 = (class253) null;
        }
        field891++;
        return true;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[Lqd;Z[[[I)V", line = 477)
    public static final void method500(int arg0, class200[] arg1, boolean arg2, int[][][] arg3) {
        field883++;
        byte var4;
        if (arg2) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg2) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class134.field1969[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class134.field1969[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1472(var7, false, var6);
                            }
                        }
                    }
                }
            }
            class65.field935 += (int) (Math.random() * 5.0D) - 2;
            class181.field2935 += (int) (Math.random() * 5.0D) - 2;
            if (class65.field935 < -16) {
                class65.field935 = -16;
            }
            if (class65.field935 > 16) {
                class65.field935 = 16;
            }
            if (class181.field2935 < -8) {
                class181.field2935 = -8;
            }
            if (class181.field2935 > 8) {
                class181.field2935 = 8;
            }
        }
        int var9 = class181.field2935 >> 2 << 10;
        int var10 = class65.field935 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        if (arg0 <= 31) {
            method499(-94, -106);
        }
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class24.field360[var13];
            if (!class109.field1458) {
                int var15 = (int) Math.sqrt(5100.0D);
                int var16 = var15 * 768 >> 8;
                for (int var17 = 1; var17 < 103; var17++) {
                    for (int var18 = 1; var18 < 103; var18++) {
                        byte var19 = 74;
                        int var20 = class172.field2843[var13][var18 + 1][var17] - class172.field2843[var13][var18 - 1][var17];
                        int var21 = class172.field2843[var13][var18][var17 + 1] - class172.field2843[var13][var18][var17 - 1];
                        int var22 = (int) Math.sqrt((double) (var20 * var20 + (var21 * var21) + 65536));
                        int var23 = (var20 << 8) / var22;
                        int var24 = -65536 / var22;
                        int var25 = (var21 << 8) / var22;
                        int var26 = (var24 * -10 + var23 * -50 + var25 * -50) / var16 + var19;
                        int var27 = (var14[var18][var17] >> 1) + (var14[var18][var17 + 1] >> 3) + (var14[var18][var17 + -1] >> 2) + (var14[var18 - -1][var17] >> 3) + (var14[var18 + -1][var17] >> 2);
                        var12[var18][var17] = var26 - var27;
                    }
                }
            } else if (class220.field3482) {
                for (int var44 = 1; var44 < 103; var44++) {
                    for (int var45 = 1; var45 < 103; var45++) {
                        int var46 = (var14[var45][var44 + 1] >> 3) + (var14[var45][var44] >> 1) + (var14[var45][var44 + -1] >> 2) + (var14[var45 - -1][var44] >> 3) + (var14[var45 - 1][var44] >> 2);
                        byte var47 = 74;
                        var12[var45][var44] = var47 - var46;
                    }
                }
            } else {
                int var28 = (int) class115.field1609[0];
                int var29 = (int) class115.field1609[1];
                int var30 = (int) class115.field1609[2];
                int var31 = (int) Math.sqrt((double) (var28 * var28 + var29 * var29 + var30 * var30));
                int var32 = var31 * 1024 >> 8;
                for (int var33 = 1; var33 < 103; var33++) {
                    for (int var34 = 1; var34 < 103; var34++) {
                        byte var35 = 96;
                        int var36 = class172.field2843[var13][var34 + 1][var33] - class172.field2843[var13][var34 - 1][var33];
                        int var37 = class172.field2843[var13][var34][var33 + 1] - class172.field2843[var13][var34][var33 - 1];
                        int var38 = (int) Math.sqrt((double) (var37 * var37 + var36 * var36 + 65536));
                        int var39 = (var36 << 8) / var38;
                        int var40 = -65536 / var38;
                        int var41 = (var37 << 8) / var38;
                        int var42 = (var30 * var41 + var28 * var39 + var29 * var40) / var32 + var35;
                        int var43 = (var14[var34][var33] >> 1) + (var14[var34 + 1][var33] >> 3) + (var14[var34 + -1][var33] >> 2) - (-(var14[var34][var33 + -1] >> 2) + -(var14[var34][var33 + 1] >> 3));
                        var12[var34][var33] = var42 - ((int) ((float) var43 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class39.field550[var48] = 0;
                class63.field922[var48] = 0;
                class135.field1979[var48] = 0;
                class253.field3964[var48] = 0;
                class329.field5151[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class66.field943[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class146 var53 = class182.method1337(var52 - 1, (byte) 79);
                            class39.field550[var50] += var53.field2307;
                            class63.field922[var50] += var53.field2309;
                            class135.field1979[var50] += var53.field2311;
                            class253.field3964[var50] += var53.field2300;
                            var10002 = class329.field5151[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class66.field943[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class146 var56 = class182.method1337(var55 - 1, (byte) 82);
                            class39.field550[var50] -= var56.field2307;
                            class63.field922[var50] -= var56.field2309;
                            class135.field1979[var50] -= var56.field2311;
                            class253.field3964[var50] -= var56.field2300;
                            var10002 = class329.field5151[var50]--;
                        }
                    }
                }
                if (var49 >= 0) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 104; var62++) {
                        int var63 = var62 - 5;
                        int var64 = var62 + 5;
                        if (var64 < 104) {
                            var57 += class39.field550[var64];
                            var60 += class329.field5151[var64];
                            var59 += class63.field922[var64];
                            var61 += class253.field3964[var64];
                            var58 += class135.field1979[var64];
                        }
                        if (var63 >= 0) {
                            var59 -= class63.field922[var63];
                            var58 -= class135.field1979[var63];
                            var57 -= class39.field550[var63];
                            var60 -= class329.field5151[var63];
                            var61 -= class253.field3964[var63];
                        }
                        if (var62 >= 0 && var60 > 0) {
                            var11[var49][var62] = class48.method368(var58 / var60, var57 * 256 / var61, var59 / var60, 21);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label768: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg2 || class154.method1119((byte) 16) || (class134.field1969[0][var65][var66] & 0x2) != 0 || (class134.field1969[var13][var65][var66] & 0x10) == 0 && class102.method708(var66, var65, var13, (byte) -27) == class130.field1925) {
                        if (class85.field1154 > var13) {
                            class85.field1154 = var13;
                        }
                        int var67 = class314.field4919[var13][var65][var66] & 0xFF;
                        int var68 = class66.field943[var13][var65][var66] & 0xFF;
                        if (var68 > 0 || var67 > 0) {
                            int var69 = class172.field2843[var13][var65 + 1][var66];
                            int var70 = class172.field2843[var13][var65][var66];
                            int var71 = class172.field2843[var13][var65 + 1][var66 + 1];
                            int var72 = class172.field2843[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var68 == 0 && class70.field974[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var67 > 0 && !class238.method1703(29555, var67 - 1).field182) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var70 == var71 && var70 == var72) {
                                    class175.field2868[var13][var65][var66] = class214.method1562(class175.field2868[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var77;
                            if (var68 > 0) {
                                var74 = var11[var65][var66];
                                int var75 = (var74 & 0x7F) + var10;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var9 + var74 & 0xFC00) + (var74 & 0x380) + var75;
                                var77 = class31.field461[class314.method2191(96, 13813, var76)];
                            } else {
                                var77 = 0;
                                var74 = -1;
                            }
                            int var78 = var12[var65][var66];
                            int var79 = var12[var65 + 1][var66];
                            int var80 = var12[var65 + 1][var66 + 1];
                            int var81 = var12[var65][var66 + 1];
                            if (var67 == 0) {
                                class94.method674(var13, var65, var66, 0, 0, -1, var70, var69, var71, var72, class314.method2191(var78, 13813, var74), class314.method2191(var79, 13813, var74), class314.method2191(var80, 13813, var74), class314.method2191(var81, 13813, var74), 0, 0, 0, 0, var77, 0);
                                if (class109.field1458 && var13 > 0 && var74 != -1 && class182.method1337(var68 - 1, (byte) 92).field2299) {
                                    class8.method107(0, 0, true, false, var65, var66, var70 - class172.field2843[0][var65][var66], -class172.field2843[0][var65 + 1][var66] + var69, var71 - class172.field2843[0][var65 + 1][var66 + 1], -class172.field2843[0][var65][var66 + 1] + var72);
                                }
                                if (class109.field1458 && !arg2 && class193.field3070 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= var65 + 1; var82++) {
                                        for (int var83 = var66 - 1; var83 <= var66 + 1; var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class314.field4919[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class10 var85 = class238.method1703(29555, var84 - 1);
                                                    if (var85.field184 != -1 && class144.method1071(-59, class31.field466.method453(255, var85.field184))) {
                                                        class193.field3070[var65][var66] = (var85.field175 << 24) + var85.field190;
                                                        continue label768;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var86 = class70.field974[var13][var65][var66] + 1;
                                byte var87 = class263.field4114[var13][var65][var66];
                                class10 var88 = class238.method1703(29555, var67 - 1);
                                if (class109.field1458 && !arg2 && class193.field3070 != null && var13 == 0) {
                                    if (var88.field184 != -1 && class144.method1071(-111, class31.field466.method453(255, var88.field184))) {
                                        class193.field3070[var65][var66] = (var88.field175 << 24) + var88.field190;
                                    } else {
                                        label749: for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                            for (int var90 = var66 - 1; var90 <= var66 + 1; var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class314.field4919[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class10 var92 = class238.method1703(29555, var91 - 1);
                                                        if (var92.field184 != -1 && class144.method1071(-98, class31.field466.method453(255, var92.field184))) {
                                                            class193.field3070[var65][var66] = (var92.field175 << 24) + var92.field190;
                                                            break label749;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field184;
                                if (var93 >= 0 && !class31.field466.method465(true, var93)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var95;
                                if (var93 >= 0) {
                                    var94 = class31.field461[class275.method1933(96, -1, class31.field466.method458(17701, var93))];
                                    var95 = -1;
                                } else if (var88.field180 == -1) {
                                    var94 = 0;
                                    var95 = -2;
                                } else {
                                    var95 = var88.field180;
                                    int var96 = (var95 & 0x7F) + var10;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var95 + var9 & 0xFC00) + (var95 & 0x380) + var96;
                                    var94 = class31.field461[class275.method1933(96, -1, var97)];
                                }
                                if (var88.field176 >= 0) {
                                    int var98 = var88.field176;
                                    int var99 = (var98 & 0x7F) + var10;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var98 & 0x380) + (var9 + var98 & 0xFC00) + var99;
                                    var94 = class31.field461[class275.method1933(96, -1, var100)];
                                }
                                class94.method674(var13, var65, var66, var86, var87, var93, var70, var69, var71, var72, class314.method2191(var78, 13813, var74), class314.method2191(var79, 13813, var74), class314.method2191(var80, 13813, var74), class314.method2191(var81, 13813, var74), class275.method1933(var78, -1, var95), class275.method1933(var79, -1, var95), class275.method1933(var80, -1, var95), class275.method1933(var81, -1, var95), var77, var94);
                                if (class109.field1458 && var13 > 0) {
                                    class8.method107(var86, var87, var95 == -2 || !var88.field174, var74 == -1 || !class182.method1337(var68 - 1, (byte) 109).field2299, var65, var66, var70 - class172.field2843[0][var65][var66], var69 - class172.field2843[0][var65 + 1][var66], var71 - class172.field2843[0][var65 + 1][var66 + 1], var72 - class172.field2843[0][var65][var66 + 1]);
                                }
                            }
                        }
                    }
                }
            }
            if (class109.field1458) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                int[][] var103 = class172.field2843[var13];
                float[][] var104 = new float[105][105];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg2) {
                            class247[] var115 = class107.method735(class18.field294[0], class134.field1969, class263.field4114[var13], var102, class66.field943[var13], class193.field3070, var12, var104, arg3, class70.field974[var13], var11, var13, 0, class314.field4919[var13], var101, class172.field2843[var13]);
                            class91.method663(var13, var115);
                            break;
                        }
                        class247[] var110 = class107.method735((int[][]) null, class134.field1969, class263.field4114[var13], var102, class66.field943[var13], (int[][]) null, var12, var104, arg3, class70.field974[var13], var11, var13, 51, class314.field4919[var13], var101, class172.field2843[var13]);
                        class247[] var111 = class195.method1442(class134.field1969, class172.field2843[var13], (byte) 101, class70.field974[var13], var12, var101, var102, var104, class263.field4114[var13], var13, class314.field4919[var13], class66.field943[var13]);
                        class247[] var112 = new class247[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var110.length + var114] = var111[var114];
                        }
                        class91.method663(var13, var112);
                        class36.method314(class70.field974[var13], class314.field4919[var13], class176.field2892, var101, class172.field2843[var13], var13, (byte) 37, class176.field2891, var102, class66.field943[var13], class263.field4114[var13], var104);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var103[var106][var105 + 1] - var103[var106][var105 - 1];
                        int var108 = var103[var106 + 1][var105] - var103[var106 - 1][var105];
                        float var109 = (float) Math.sqrt((double) (var108 * var108 + var107 * var107 + 65536));
                        var102[var106][var105] = (float) var108 / var109;
                        var101[var106][var105] = -256.0F / var109;
                        var104[var106][var105] = (float) var107 / var109;
                    }
                    var105++;
                }
            }
            class66.field943[var13] = (byte[][]) null;
            class314.field4919[var13] = (byte[][]) null;
            class70.field974[var13] = (byte[][]) null;
            class263.field4114[var13] = (byte[][]) null;
            class24.field360[var13] = (byte[][]) null;
        }
        class279.method1958(-50, -10, -50);
        if (arg2) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class134.field1969[1][var116][var117] & 0x2) == 2) {
                    class61.method505(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class175.field2868[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 > 0 && (class175.field2868[var118][var120][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122 = var118;
                        int var123 = var119;
                        int var124 = var118;
                        while (var123 < 104 && (class175.field2868[var118][var120][var123 + 1] & 0x1) != 0) {
                            var123++;
                        }
                        label451: while (var124 > 0) {
                            for (int var125 = var121; var125 <= var123; var125++) {
                                if ((class175.field2868[var124 - 1][var120][var125] & 0x1) == 0) {
                                    break label451;
                                }
                            }
                            var124--;
                        }
                        label440: while (var122 < 3) {
                            for (int var126 = var121; var126 <= var123; var126++) {
                                if ((class175.field2868[var122 + 1][var120][var126] & 0x1) == 0) {
                                    break label440;
                                }
                            }
                            var122++;
                        }
                        int var127 = (var123 + 1 - var121) * (var122 + 1 - var124);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class172.field2843[var124][var120][var121];
                            int var130 = class172.field2843[var122][var120][var121] - var128;
                            class94.method676(1, var120 * 128, var120 * 128, var121 * 128, var123 * 128 + 128, var130, var129);
                            for (int var131 = var124; var131 <= var122; var131++) {
                                for (int var132 = var121; var132 <= var123; var132++) {
                                    class175.field2868[var131][var120][var132] = class333.method2319(class175.field2868[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class175.field2868[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134;
                        for (var134 = var120; var134 > 0 && (class175.field2868[var118][var134 - 1][var119] & 0x2) != 0; var134--) {
                        }
                        while (var133 < 104 && (class175.field2868[var118][var133 + 1][var119] & 0x2) != 0) {
                            var133++;
                        }
                        int var135 = var118;
                        int var136 = var118;
                        label505: while (var135 > 0) {
                            for (int var137 = var134; var137 <= var133; var137++) {
                                if ((class175.field2868[var135 - 1][var137][var119] & 0x2) == 0) {
                                    break label505;
                                }
                            }
                            var135--;
                        }
                        label494: while (var136 < 3) {
                            for (int var138 = var134; var138 <= var133; var138++) {
                                if ((class175.field2868[var136 + 1][var138][var119] & 0x2) == 0) {
                                    break label494;
                                }
                            }
                            var136++;
                        }
                        int var139 = (var133 + 1 - var134) * (var136 + 1 - var135);
                        if (var139 >= 8) {
                            int var140 = class172.field2843[var135][var134][var119];
                            short var141 = 240;
                            int var142 = class172.field2843[var136][var134][var119] - var141;
                            class94.method676(2, var134 * 128, var133 * 128 + 128, var119 * 128, var119 * 128, var142, var140);
                            for (int var143 = var135; var143 <= var136; var143++) {
                                for (int var144 = var134; var144 <= var133; var144++) {
                                    class175.field2868[var143][var144][var119] = class333.method2319(class175.field2868[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class175.field2868[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147;
                        for (var147 = var119; var147 < 104 && (class175.field2868[var118][var120][var147 + 1] & 0x4) != 0; var147++) {
                        }
                        int var148;
                        for (var148 = var119; var148 > 0 && (class175.field2868[var118][var120][var148 - 1] & 0x4) != 0; var148--) {
                        }
                        label559: while (var145 > 0) {
                            for (int var149 = var148; var149 <= var147; var149++) {
                                if ((class175.field2868[var118][var145 - 1][var149] & 0x4) == 0) {
                                    break label559;
                                }
                            }
                            var145--;
                        }
                        label548: while (var146 < 104) {
                            for (int var150 = var148; var150 <= var147; var150++) {
                                if ((class175.field2868[var118][var146 + 1][var150] & 0x4) == 0) {
                                    break label548;
                                }
                            }
                            var146++;
                        }
                        if ((var146 + 1 - var145) * (var147 + 1 - var148) >= 4) {
                            int var151 = class172.field2843[var118][var145][var148];
                            class94.method676(4, var145 * 128, var146 * 128 + 128, var148 * 128, var147 * 128 + 128, var151, var151);
                            for (int var152 = var145; var152 <= var146; var152++) {
                                for (int var153 = var148; var153 <= var147; var153++) {
                                    class175.field2868[var118][var152][var153] = class333.method2319(class175.field2868[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
