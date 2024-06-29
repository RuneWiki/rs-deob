import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class130 extends class199 {

    @OriginalMember(owner = "client!fj", name = "T", descriptor = "Z")
    private boolean field1768 = true;

    @OriginalMember(owner = "client!fj", name = "bb", descriptor = "Z")
    private boolean field1776 = true;

    @OriginalMember(owner = "client!fj", name = "X", descriptor = "[Z")
    public static boolean[] field1772 = new boolean[200];

    @OriginalMember(owner = "client!fj", name = "Z", descriptor = "I")
    public static int field1774 = -1;

    @OriginalMember(owner = "client!fj", name = "ab", descriptor = "Lcc;")
    public static class327 field1775 = new class327(16);

    @OriginalMember(owner = "client!fj", name = "eb", descriptor = "I")
    public static int field1779 = 0;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!fj", name = "U", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!fj", name = "V", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!fj", name = "W", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!fj", name = "cb", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!fj", name = "db", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!fj", name = "fb", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!fj", name = "gb", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lwf;III)V", line = 7)
    public static final void method999(class333 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field5106 == 1) {
            class88.field1115++;
            class148.method1140(0L, 0, arg0.field5109, "", arg0.field5041, (short) 57, -1, (byte) -91);
        }
        field1780++;
        if (arg0.field5106 == 2 && !class276.field3954) {
            String var4 = class293.method2007((byte) 117, arg0);
            if (var4 != null) {
                class148.method1140(0L, -1, arg0.field5109, "<col=00ff00>" + arg0.field5089, var4, (short) 34, -1, (byte) 71);
                class311.field4579++;
            }
        }
        if (arg0.field5106 == 3) {
            class148.method1140(0L, 0, arg0.field5109, "", class273.field3909, (short) 7, -1, (byte) 46);
            class359.field5614++;
        }
        if (arg1 <= 78) {
            method1000(-53, 52, (class331) null);
        }
        if (arg0.field5106 == 4) {
            class148.method1140(0L, 0, arg0.field5109, "", arg0.field5041, (short) 18, -1, (byte) 68);
            class275.field3941++;
        }
        if (arg0.field5106 == 5) {
            class148.method1140(0L, 0, arg0.field5109, "", arg0.field5041, (short) 11, -1, (byte) -85);
            class352.field5494++;
        }
        if (arg0.field5106 == 6 && class215.field3038 == null) {
            class148.method1140(0L, -1, arg0.field5109, "", arg0.field5041, (short) 3, -1, (byte) -111);
            class16.field191++;
        }
        if (arg0.field5105 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field5173; var6++) {
                for (int var7 = 0; var7 < arg0.field5127; var7++) {
                    int var8 = (arg0.field5157 + 32) * var7;
                    int var9 = (arg0.field5193 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field5096[var5];
                        var8 += arg0.field5098[var5];
                    }
                    if (arg3 >= var8 && arg2 >= var9 && (var8 + 32) > arg3 && arg2 < (var9 + 32)) {
                        class283.field4029 = var5;
                        class304.field4450 = arg0;
                        if (arg0.field5088[var5] > 0) {
                            class142 var10 = client.method891(arg0);
                            class362 var11 = class172.method1265(arg0.field5088[var5] - 1, (byte) -127);
                            if (class339.field5304 == 1 && var10.method1109(500)) {
                                if (class104.field1357 != arg0.field5109 || class32.field372 != var5) {
                                    class315.field4640++;
                                    class148.method1140((long) var11.field5671, var5, arg0.field5109, class99.field1301 + " -> <col=ff9040>" + var11.field5674, class160.field2293, (short) 15, -1, (byte) -95);
                                }
                            } else if (class276.field3954 && var10.method1109(500)) {
                                class321 var12 = class25.field283 == -1 ? null : class89.method646(class25.field283, (byte) -124);
                                if ((class119.field1579 & 0x10) != 0 && (var12 == null || var11.method2526(class25.field283, 0, var12.field4714) != var12.field4714)) {
                                    class210.field2972++;
                                    class148.method1140((long) var11.field5671, var5, arg0.field5109, class339.field5277 + " -> <col=ff9040>" + var11.field5674, class351.field5485, (short) 50, class274.field3932, (byte) 18);
                                }
                            } else {
                                class54.field703++;
                                String[] var13 = var11.field5703;
                                if (class307.field4500) {
                                    var13 = class305.method2137(-6, var13);
                                }
                                if (var10.method1109(500)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 10;
                                            } else {
                                                var15 = 51;
                                            }
                                            class148.method1140((long) var11.field5671, var5, arg0.field5109, "<col=ff9040>" + var11.field5674, var13[var14], var15, -1, (byte) 106);
                                            class321.field4715++;
                                        }
                                    }
                                }
                                if (var10.method1102(119)) {
                                    class148.method1140((long) var11.field5671, var5, arg0.field5109, "<col=ff9040>" + var11.field5674, class160.field2293, (short) 9, class343.field5342, (byte) 95);
                                    class85.field1094++;
                                }
                                if (var10.method1109(500) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            byte var17 = 0;
                                            class353.field5515++;
                                            if (var16 == 0) {
                                                var17 = 58;
                                            }
                                            if (var16 == 1) {
                                                var17 = 35;
                                            }
                                            if (var16 == 2) {
                                                var17 = 17;
                                            }
                                            class148.method1140((long) var11.field5671, var5, arg0.field5109, "<col=ff9040>" + var11.field5674, var13[var16], var17, -1, (byte) 45);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field5169;
                                if (class307.field4500) {
                                    var18 = class305.method2137(-6, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class125.field1657++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 30;
                                            }
                                            if (var19 == 1) {
                                                var20 = 20;
                                            }
                                            if (var19 == 2) {
                                                var20 = 13;
                                            }
                                            if (var19 == 3) {
                                                var20 = 2;
                                            }
                                            if (var19 == 4) {
                                                var20 = 49;
                                            }
                                            class148.method1140((long) var11.field5671, var5, arg0.field5109, "<col=ff9040>" + var11.field5674, var18[var19], var20, -1, (byte) -113);
                                        }
                                    }
                                }
                                class148.method1140((long) var11.field5671, var5, arg0.field5109, "<col=ff9040>" + var11.field5674, class62.field778, (short) 1001, class251.field3685, (byte) -120);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field5154) {
            return;
        }
        if (!class276.field3954) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class262.method1807(var21, arg0, (byte) 35);
                if (var22 != null) {
                    class148.method1140((long) (var21 + 1), arg0.field5199, arg0.field5109, arg0.field5073, var22, (short) 1009, class270.method1844(arg0, var21, (byte) -25), (byte) -124);
                    class161.field2297++;
                }
            }
            String var23 = class293.method2007((byte) 126, arg0);
            if (var23 != null) {
                class148.method1140(0L, arg0.field5199, arg0.field5109, arg0.field5073, var23, (short) 34, -1, (byte) -61);
                class311.field4579++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class262.method1807(var24, arg0, (byte) 120);
                if (var25 != null) {
                    class148.method1140((long) (var24 + 1), arg0.field5199, arg0.field5109, arg0.field5073, var25, (short) 23, class270.method1844(arg0, var24, (byte) -35), (byte) 120);
                    class161.field2297++;
                }
            }
            if (client.method891(arg0).method1101((byte) -101)) {
                if (arg0.field5104 == null) {
                    class148.method1140(0L, arg0.field5199, arg0.field5109, "", class316.field4663, (short) 3, -1, (byte) -54);
                } else {
                    class148.method1140(0L, arg0.field5199, arg0.field5109, "", arg0.field5104, (short) 3, -1, (byte) -123);
                }
                class16.field191++;
            }
        } else if (client.method891(arg0).method1107(false) && (class119.field1579 & 0x20) != 0) {
            class148.method1140(0L, arg0.field5199, arg0.field5109, class339.field5277 + " -> " + arg0.field5073, class351.field5485, (short) 1, class274.field3932, (byte) -94);
            class89.field1123++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 470)
    public class130() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I", line = 342)
    public final int[] method190(int arg0, int arg1) {
        if (arg0 != -1735) {
            return (int[]) null;
        }
        int[] var3 = this.field2802.method2502(arg1, arg0 + 1615);
        if (this.field2802.field5637) {
            int[] var4 = this.method1467(-7764, this.field1768 ? class156.field2165 - arg1 : arg1, 0);
            if (this.field1776) {
                for (int var5 = 0; var5 < class95.field1235; var5++) {
                    var3[var5] = var4[class245.field3573 - var5];
                }
            } else {
                class87.method629(var4, 0, var3, 0, class95.field1235);
            }
        }
        field1767++;
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLfd;I)V", line = 389)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1776 = arg1.method2096((byte) -122) == 1;
        } else if (arg2 == 1) {
            this.field1768 = arg1.method2096((byte) -122) == 1;
        } else if (arg2 == 2) {
            this.field2795 = arg1.method2096((byte) -122) == 1;
        }
        if (arg0 == -43) {
            field1781++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILqc;)V", line = 422)
    public static final void method1000(int arg0, int arg1, class331 arg2) {
        field1771++;
        if (class313.field4603 < arg2.field4929) {
            class326.method2253(arg2, true);
        } else if (arg2.field4846 < class313.field4603) {
            class131.method1004(arg2, (byte) -49);
        } else {
            class75.method547(arg2, 0);
        }
        if (arg2.field4855 < 128 || arg2.field4893 < 128 || arg2.field4855 >= 13184 || arg2.field4893 >= 13184) {
            arg2.field4846 = 0;
            arg2.field4929 = 0;
            arg2.field4839 = -1;
            arg2.field4899 = -1;
            arg2.field4855 = arg2.field4842[0] * 128 + arg2.method1699(arg0 ^ 0x72D6) * 64;
            arg2.field4893 = arg2.field4936[0] * 128 + (arg2.method1699(-1) * 64);
            arg2.method2295(-31966);
        }
        if (class359.field5616 == arg2 && (arg2.field4855 < 1536 || arg2.field4893 < 1536 || arg2.field4855 >= 11776 || arg2.field4893 >= 11776)) {
            arg2.field4839 = -1;
            arg2.field4846 = 0;
            arg2.field4929 = 0;
            arg2.field4899 = -1;
            arg2.field4855 = arg2.field4842[0] * 128 + (arg2.method1699(-1) * 64);
            arg2.field4893 = arg2.field4936[0] * 128 + (arg2.method1699(-1) * 64);
            arg2.method2295(arg0 - 2567);
        }
        if (arg0 != -29399) {
            field1770 = -29;
        }
        class45.method318(126, arg2);
        class24.method160(-25431, arg2);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[[I", line = 491)
    public final int[][] method215(int arg0, int arg1) {
        if (arg1 != -29869) {
            return (int[][]) ((int[][]) null);
        }
        field1777++;
        int[][] var3 = this.field2796.method2187(arg0, -64);
        if (this.field2796.field4667) {
            int[][] var4 = this.method1459(0, this.field1768 ? class156.field2165 - arg0 : arg0, (byte) -51);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field1776) {
                for (int var11 = 0; var11 < class95.field1235; var11++) {
                    var7[var11] = var5[class245.field3573 - var11];
                    var9[var11] = var6[class245.field3573 - var11];
                    var10[var11] = var8[class245.field3573 - var11];
                }
            } else {
                for (int var12 = 0; var12 < class95.field1235; var12++) {
                    var7[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var8[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V", line = 559)
    public static void method1001(int arg0) {
        field1772 = null;
        if (arg0 == 23665) {
            field1775 = null;
        }
    }
}
