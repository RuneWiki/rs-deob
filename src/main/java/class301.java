import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class301 extends class7 {

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    private int field5079 = 0;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    private int field5074 = 0;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    private int field5071 = -32768;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Z")
    public boolean field5073 = false;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public int field5088;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public int field5081;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public int field5072;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
    private int field5087;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public int field5090;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "Ldh;")
    private class157 field5070;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "Lbe;")
    private static class283 field5082 = class153.method941(126, "Loading textures )2 ");

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Lbe;")
    public static class283 field5075 = field5082;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "[I")
    public static int[] field5086 = new int[100];

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "Lbe;")
    private static class283 field5093 = class153.method941(13, "Choose Option");

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "Lbe;")
    public static class283 field5076 = field5093;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field5095 = -1;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "Lek;")
    public static class172 field5094;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "Lhh;")
    public static class198 field5089;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "[[[B")
    public static byte[][][] field5092;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Lhk;", line = 8)
    private final class289 method2037(int arg0) {
        field5083++;
        class169 var2 = class259.method1750((byte) 121, this.field5087);
        class289 var3;
        if (this.field5073) {
            var3 = var2.method1074(-1, arg0 + 22991);
        } else {
            var3 = var2.method1074(this.field5079, arg0 + 23002);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -22921) {
                this.field5087 = -4;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)V", line = 36)
    public final void method2038(byte arg0, int arg1) {
        field5085++;
        if (this.field5073) {
            return;
        }
        this.field5074 += arg1;
        int var3 = -71 / ((arg0 - 84) / 36);
        while (this.field5070.field2568[this.field5079] < this.field5074) {
            this.field5074 -= this.field5070.field2568[this.field5079];
            this.field5079++;
            if (this.field5079 >= this.field5070.field2578.length) {
                this.field5073 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "()I", line = 65)
    public final int method40() {
        field5078++;
        return this.field5071;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lrd;Z)V", line = 72)
    public static final void method2039(class160 arg0, boolean arg1) {
        class205.field3485.method1809(arg0, (byte) -127);
        while (true) {
            class160 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class160[][] var7;
            class160 var79;
            do {
                class160 var78;
                do {
                    class160 var77;
                    do {
                        class160 var76;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class160) class205.field3485.method1814(false);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2611);
                                            var3 = var2.field2620;
                                            var4 = var2.field2629;
                                            var5 = var2.field2630;
                                            var6 = var2.field2631;
                                            var7 = class86.field1459[var5];
                                            float var8 = 0.0F;
                                            float var13;
                                            if (class65.field890 == class228.field3834) {
                                                int var9 = class140.field2329[var3][var4];
                                                int var10 = var9 & 0xFFFFFF;
                                                if (class309.field5284 != var10) {
                                                    class309.field5284 = var10;
                                                    class137.method851(var10, (byte) 52);
                                                    class59.method388(class81.method529(-21663));
                                                }
                                                int var11 = var9 >>> 24 << 3;
                                                if (class3.field29 != var11) {
                                                    class3.field29 = var11;
                                                    class27.method184((byte) -115, var11);
                                                }
                                                int var12 = class1.field12[0][var3 + 1][var4] + class1.field12[0][var3][var4] + class1.field12[0][var3][var4 + 1] + class1.field12[0][var3 + 1][var4 + 1] >> 2;
                                                class284.method1954(-var12, (byte) -99, 3);
                                                var13 = 201.5F;
                                                class167.method1058(var13);
                                            } else {
                                                var13 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                class167.method1058(var13);
                                            }
                                            if (!var2.field2633) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class160 var14 = class86.field1459[var5 - 1][var3][var4];
                                                    if (var14 != null && var14.field2611) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class61.field844 && var3 > class90.field1518) {
                                                    class160 var15 = var7[var3 - 1][var4];
                                                    if (var15 != null && var15.field2611 && (var15.field2633 || (var2.field2609 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class61.field844 && var3 < class309.field5288 - 1) {
                                                    class160 var16 = var7[var3 + 1][var4];
                                                    if (var16 != null && var16.field2611 && (var16.field2633 || (var2.field2609 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class125.field2078 && var4 > class124.field2062) {
                                                    class160 var17 = var7[var3][var4 - 1];
                                                    if (var17 != null && var17.field2611 && (var17.field2633 || (var2.field2609 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class125.field2078 && var4 < class88.field1482 - 1) {
                                                    class160 var18 = var7[var3][var4 + 1];
                                                    if (var18 != null && var18.field2611 && (var18.field2633 || (var2.field2609 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2633 = false;
                                            if (var2.field2621 != null) {
                                                class160 var19 = var2.field2621;
                                                class167.method1058(201.5F - (float) (var19.field2631 + 1) * 50.0F);
                                                if (var19.field2634 == null) {
                                                    if (var19.field2638 != null) {
                                                        if (class196.method1262(0, var3, var4)) {
                                                            class119.method768(var19.field2638, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var3, var4, true);
                                                        } else {
                                                            class119.method768(var19.field2638, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class196.method1262(0, var3, var4)) {
                                                    class272.method1826(var19.field2634, 0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var3, var4, true);
                                                } else {
                                                    class272.method1826(var19.field2634, 0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var3, var4, false);
                                                }
                                                class197 var20 = var19.field2632;
                                                if (var20 != null) {
                                                    if ((var20.field3366 & var2.field2618) == 0) {
                                                        class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                    } else {
                                                        class17.method97(var20.field3366, class231.field3926, class232.field3930, class160.field2635, var6, var3, var4);
                                                    }
                                                    var20.field3375.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var20.field3365 - class231.field3926, var20.field3367 - class232.field3930, var20.field3363 - class160.field2635, var20.field3362);
                                                }
                                                for (int var21 = 0; var21 < var19.field2627; var21++) {
                                                    class26 var22 = var19.field2623[var21];
                                                    if (var22 != null) {
                                                        class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                        var22.field381.method41(var22.field382, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var22.field380 - class231.field3926, var22.field388 - class232.field3930, var22.field390 - class160.field2635, var22.field379);
                                                    }
                                                }
                                                class167.method1058(var13);
                                            }
                                            boolean var23 = false;
                                            if (var2.field2634 == null) {
                                                if (var2.field2638 != null) {
                                                    if (class196.method1262(var6, var3, var4)) {
                                                        class119.method768(var2.field2638, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var3, var4, true);
                                                    } else {
                                                        var23 = true;
                                                        class119.method768(var2.field2638, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var3, var4, false);
                                                    }
                                                }
                                            } else if (class196.method1262(var6, var3, var4)) {
                                                class272.method1826(var2.field2634, var6, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var3, var4, true);
                                            } else {
                                                var23 = true;
                                                if (var2.field2634.field2354 != 12345678 || class34.field511 && var5 <= class79.field1363) {
                                                    class272.method1826(var2.field2634, var6, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var3, var4, false);
                                                }
                                            }
                                            if (var23) {
                                                class110 var24 = var2.field2617;
                                                if (var24 != null && (var24.field1859 & 0x80000000L) != 0L) {
                                                    if (var24.field1869) {
                                                        class167.method1058(var13 + 50.0F - 1.5F);
                                                    }
                                                    class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                    var24.field1855.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var24.field1863 - class231.field3926, var24.field1862 - class232.field3930, var24.field1858 - class160.field2635, var24.field1859);
                                                    if (var24.field1869) {
                                                        class167.method1058(var13);
                                                    }
                                                }
                                            }
                                            int var25 = 0;
                                            int var26 = 0;
                                            class197 var27 = var2.field2632;
                                            class291 var28 = var2.field2642;
                                            if (var27 != null || var28 != null) {
                                                if (class61.field844 == var3) {
                                                    var25++;
                                                } else if (class61.field844 < var3) {
                                                    var25 += 2;
                                                }
                                                if (class125.field2078 == var4) {
                                                    var25 += 3;
                                                } else if (class125.field2078 > var4) {
                                                    var25 += 6;
                                                }
                                                var26 = class236.field3957[var25];
                                                var2.field2618 = class132.field2219[var25];
                                            }
                                            if (var27 != null) {
                                                if ((var27.field3366 & class103.field1746[var25]) == 0) {
                                                    var2.field2626 = 0;
                                                } else if (var27.field3366 == 16) {
                                                    var2.field2626 = 3;
                                                    var2.field2624 = class107.field1819[var25];
                                                    var2.field2641 = 3 - var2.field2624;
                                                } else if (var27.field3366 == 32) {
                                                    var2.field2626 = 6;
                                                    var2.field2624 = class142.field2368[var25];
                                                    var2.field2641 = 6 - var2.field2624;
                                                } else if (var27.field3366 == 64) {
                                                    var2.field2626 = 12;
                                                    var2.field2624 = class38.field552[var25];
                                                    var2.field2641 = 12 - var2.field2624;
                                                } else {
                                                    var2.field2626 = 9;
                                                    var2.field2624 = class125.field2071[var25];
                                                    var2.field2641 = 9 - var2.field2624;
                                                }
                                                if ((var27.field3366 & var26) != 0 && !class144.method904(var6, var3, var4, var27.field3366)) {
                                                    class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                    var27.field3375.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var27.field3365 - class231.field3926, var27.field3367 - class232.field3930, var27.field3363 - class160.field2635, var27.field3362);
                                                }
                                                if ((var27.field3377 & var26) != 0 && !class144.method904(var6, var3, var4, var27.field3377)) {
                                                    class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                    var27.field3376.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var27.field3365 - class231.field3926, var27.field3367 - class232.field3930, var27.field3363 - class160.field2635, var27.field3362);
                                                }
                                            }
                                            if (var28 != null && !class307.method2091(var6, var3, var4, var28.field4943.method40())) {
                                                class167.method1058(var13 - 0.5F);
                                                if ((var28.field4938 & var26) != 0) {
                                                    class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                    var28.field4943.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var28.field4942 + var28.field4929 - class231.field3926, var28.field4934 - class232.field3930, var28.field4935 + var28.field4944 - class160.field2635, var28.field4931);
                                                } else if (var28.field4938 == 256) {
                                                    int var29 = var28.field4942 - class231.field3926;
                                                    int var30 = var28.field4934 - class232.field3930;
                                                    int var31 = var28.field4935 - class160.field2635;
                                                    int var32 = var28.field4937;
                                                    int var33;
                                                    if (var32 == 1 || var32 == 2) {
                                                        var33 = -var29;
                                                    } else {
                                                        var33 = var29;
                                                    }
                                                    int var34;
                                                    if (var32 == 2 || var32 == 3) {
                                                        var34 = -var31;
                                                    } else {
                                                        var34 = var31;
                                                    }
                                                    if (var34 < var33) {
                                                        class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                        var28.field4943.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var28.field4929 + var29, var30, var28.field4944 + var31, var28.field4931);
                                                    } else if (var28.field4941 != null) {
                                                        class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                        var28.field4941.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var29, var30, var31, var28.field4931);
                                                    }
                                                }
                                                class167.method1058(var13);
                                            }
                                            if (var23) {
                                                class110 var35 = var2.field2617;
                                                if (var35 != null && (var35.field1859 & 0x80000000L) == 0L) {
                                                    if (var35.field1869) {
                                                        class167.method1058(var13 + 50.0F - 1.5F);
                                                    }
                                                    class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                    var35.field1855.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var35.field1863 - class231.field3926, var35.field1862 - class232.field3930, var35.field1858 - class160.field2635, var35.field1859);
                                                    if (var35.field1869) {
                                                        class167.method1058(var13);
                                                    }
                                                }
                                                class305 var36 = var2.field2616;
                                                if (var36 != null && var36.field5218 == 0) {
                                                    class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                    if (var36.field5205 != null) {
                                                        var36.field5205.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var36.field5231 - class231.field3926, var36.field5234 - class232.field3930, var36.field5222 - class160.field2635, var36.field5219);
                                                    }
                                                    if (var36.field5199 != null) {
                                                        var36.field5199.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var36.field5231 - class231.field3926, var36.field5234 - class232.field3930, var36.field5222 - class160.field2635, var36.field5219);
                                                    }
                                                    if (var36.field5230 != null) {
                                                        var36.field5230.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var36.field5231 - class231.field3926, var36.field5234 - class232.field3930, var36.field5222 - class160.field2635, var36.field5219);
                                                    }
                                                }
                                            }
                                            int var37 = var2.field2609;
                                            if (var37 != 0) {
                                                if (var3 < class61.field844 && (var37 & 0x4) != 0) {
                                                    class160 var38 = var7[var3 + 1][var4];
                                                    if (var38 != null && var38.field2611) {
                                                        class205.field3485.method1809(var38, (byte) -123);
                                                    }
                                                }
                                                if (var4 < class125.field2078 && (var37 & 0x2) != 0) {
                                                    class160 var39 = var7[var3][var4 + 1];
                                                    if (var39 != null && var39.field2611) {
                                                        class205.field3485.method1809(var39, (byte) -124);
                                                    }
                                                }
                                                if (var3 > class61.field844 && (var37 & 0x1) != 0) {
                                                    class160 var40 = var7[var3 - 1][var4];
                                                    if (var40 != null && var40.field2611) {
                                                        class205.field3485.method1809(var40, (byte) -120);
                                                    }
                                                }
                                                if (var4 > class125.field2078 && (var37 & 0x8) != 0) {
                                                    class160 var41 = var7[var3][var4 - 1];
                                                    if (var41 != null && var41.field2611) {
                                                        class205.field3485.method1809(var41, (byte) -128);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2626 != 0) {
                                            boolean var42 = true;
                                            for (int var43 = 0; var43 < var2.field2627; var43++) {
                                                if (class109.field1838 != var2.field2623[var43].field392 && (var2.field2628[var43] & var2.field2626) == var2.field2624) {
                                                    var42 = false;
                                                    break;
                                                }
                                            }
                                            if (var42) {
                                                class197 var44 = var2.field2632;
                                                if (!class144.method904(var6, var3, var4, var44.field3366)) {
                                                    label593: {
                                                        if ((var44.field3362 & 0xFC000L) == 16384L) {
                                                            int var45 = var44.field3365 - class231.field3926;
                                                            int var46 = var44.field3363 - class160.field2635;
                                                            int var47 = (int) (var44.field3362 >> 20 & 0x3L);
                                                            if (var47 == 0) {
                                                                var45 -= 64;
                                                                var46 += 64;
                                                                if (var46 < var45 && var3 > 0 && var4 < class76.field1325 - 1) {
                                                                    class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3 - 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 1) {
                                                                var45 += 64;
                                                                var46 += 64;
                                                                if (var46 < -var45 && var3 < class246.field4176 - 1 && var4 < class76.field1325 - 1) {
                                                                    class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3 + 1, var4 + 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 2) {
                                                                var45 += 64;
                                                                var46 -= 64;
                                                                if (var46 > var45 && var3 < class246.field4176 - 1 && var4 > 0) {
                                                                    class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3 + 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            } else if (var47 == 3) {
                                                                var45 -= 64;
                                                                var46 -= 64;
                                                                if (var46 > -var45 && var3 > 0 && var4 > 0) {
                                                                    class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3 - 1, var4 - 1);
                                                                    break label593;
                                                                }
                                                            }
                                                        }
                                                        class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                    }
                                                    var44.field3375.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var44.field3365 - class231.field3926, var44.field3367 - class232.field3930, var44.field3363 - class160.field2635, var44.field3362);
                                                }
                                                var2.field2626 = 0;
                                            }
                                        }
                                        if (!var2.field2640) {
                                            break;
                                        }
                                        try {
                                            int var48 = var2.field2627;
                                            var2.field2640 = false;
                                            int var49 = 0;
                                            label677: for (int var50 = 0; var50 < var48; var50++) {
                                                class26 var51 = var2.field2623[var50];
                                                if (class109.field1838 != var51.field392) {
                                                    for (int var52 = var51.field398; var52 <= var51.field395; var52++) {
                                                        for (int var53 = var51.field394; var53 <= var51.field378; var53++) {
                                                            class160 var54 = var7[var52][var53];
                                                            if (var54.field2633) {
                                                                var2.field2640 = true;
                                                                continue label677;
                                                            }
                                                            if (var54.field2626 != 0) {
                                                                int var55 = 0;
                                                                if (var52 > var51.field398) {
                                                                    var55++;
                                                                }
                                                                if (var52 < var51.field395) {
                                                                    var55 += 4;
                                                                }
                                                                if (var53 > var51.field394) {
                                                                    var55 += 8;
                                                                }
                                                                if (var53 < var51.field378) {
                                                                    var55 += 2;
                                                                }
                                                                if ((var55 & var54.field2626) == var2.field2641) {
                                                                    var2.field2640 = true;
                                                                    continue label677;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class202.field3459[var49++] = var51;
                                                    int var56 = class61.field844 - var51.field398;
                                                    int var57 = var51.field395 - class61.field844;
                                                    if (var57 > var56) {
                                                        var56 = var57;
                                                    }
                                                    int var58 = class125.field2078 - var51.field394;
                                                    int var59 = var51.field378 - class125.field2078;
                                                    if (var59 > var58) {
                                                        var51.field383 = var56 + var59;
                                                    } else {
                                                        var51.field383 = var56 + var58;
                                                    }
                                                }
                                            }
                                            while (var49 > 0) {
                                                int var60 = -50;
                                                int var61 = -1;
                                                for (int var62 = 0; var62 < var49; var62++) {
                                                    class26 var63 = class202.field3459[var62];
                                                    if (class109.field1838 != var63.field392) {
                                                        if (var63.field383 > var60) {
                                                            var60 = var63.field383;
                                                            var61 = var62;
                                                        } else if (var63.field383 == var60) {
                                                            int var64 = var63.field380 - class231.field3926;
                                                            int var65 = var63.field390 - class160.field2635;
                                                            int var66 = class202.field3459[var61].field380 - class231.field3926;
                                                            int var67 = class202.field3459[var61].field390 - class160.field2635;
                                                            if (var64 * var64 + var65 * var65 > var66 * var66 + var67 * var67) {
                                                                var61 = var62;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var61 == -1) {
                                                    break;
                                                }
                                                class26 var68 = class202.field3459[var61];
                                                var68.field392 = class109.field1838;
                                                if (!class299.method2023(var6, var68.field398, var68.field395, var68.field394, var68.field378, var68.field381.method40())) {
                                                    if ((var68.field379 & 0xFC000L) == 147456L) {
                                                        class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                                                        int var69 = var68.field380 - class231.field3926;
                                                        int var70 = var68.field390 - class160.field2635;
                                                        int var71 = (int) (var68.field379 >> 20 & 0x3L);
                                                        if (var71 == 1 || var71 == 3) {
                                                            if (var70 > -var69) {
                                                                class17.method93(var5, var3, var4 - 1, var3 - 1, var4);
                                                            } else {
                                                                class17.method93(var5, var3, var4 + 1, var3 + 1, var4);
                                                            }
                                                        } else if (var70 > var69) {
                                                            class17.method93(var5, var3, var4 - 1, var3 + 1, var4);
                                                        } else {
                                                            class17.method93(var5, var3, var4 + 1, var3 - 1, var4);
                                                        }
                                                    } else {
                                                        class17.method96(class231.field3926, class232.field3930, class160.field2635, var5, var68.field398, var68.field394, var68.field395, var68.field378);
                                                    }
                                                    var68.field381.method41(var68.field382, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var68.field380 - class231.field3926, var68.field388 - class232.field3930, var68.field390 - class160.field2635, var68.field379);
                                                }
                                                for (int var72 = var68.field398; var72 <= var68.field395; var72++) {
                                                    for (int var73 = var68.field394; var73 <= var68.field378; var73++) {
                                                        class160 var74 = var7[var72][var73];
                                                        if (var74.field2626 != 0) {
                                                            class205.field3485.method1809(var74, (byte) -126);
                                                        } else if ((var3 != var72 || var4 != var73) && var74.field2611) {
                                                            class205.field3485.method1809(var74, (byte) -127);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2640) {
                                                break;
                                            }
                                        } catch (Exception var94) {
                                            var2.field2640 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2611);
                            } while (var2.field2626 != 0);
                            if (var3 > class61.field844 || var3 <= class90.field1518) {
                                break;
                            }
                            var76 = var7[var3 - 1][var4];
                        } while (var76 != null && var76.field2611);
                        if (var3 < class61.field844 || var3 >= class309.field5288 - 1) {
                            break;
                        }
                        var77 = var7[var3 + 1][var4];
                    } while (var77 != null && var77.field2611);
                    if (var4 > class125.field2078 || var4 <= class124.field2062) {
                        break;
                    }
                    var78 = var7[var3][var4 - 1];
                } while (var78 != null && var78.field2611);
                if (var4 < class125.field2078 || var4 >= class88.field1482 - 1) {
                    break;
                }
                var79 = var7[var3][var4 + 1];
            } while (var79 != null && var79.field2611);
            var2.field2611 = false;
            class162.field2650--;
            class305 var80 = var2.field2616;
            if (var80 != null && var80.field5218 != 0) {
                class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                if (var80.field5205 != null) {
                    var80.field5205.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var80.field5231 - class231.field3926, var80.field5234 - class232.field3930 - var80.field5218, var80.field5222 - class160.field2635, var80.field5219);
                }
                if (var80.field5199 != null) {
                    var80.field5199.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var80.field5231 - class231.field3926, var80.field5234 - class232.field3930 - var80.field5218, var80.field5222 - class160.field2635, var80.field5219);
                }
                if (var80.field5230 != null) {
                    var80.field5230.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var80.field5231 - class231.field3926, var80.field5234 - class232.field3930 - var80.field5218, var80.field5222 - class160.field2635, var80.field5219);
                }
            }
            if (var2.field2618 != 0) {
                class291 var81 = var2.field2642;
                if (var81 != null && !class307.method2091(var6, var3, var4, var81.field4943.method40())) {
                    if ((var81.field4938 & var2.field2618) != 0) {
                        class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                        var81.field4943.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var81.field4942 + var81.field4929 - class231.field3926, var81.field4934 - class232.field3930, var81.field4935 + var81.field4944 - class160.field2635, var81.field4931);
                    } else if (var81.field4938 == 256) {
                        int var82 = var81.field4942 - class231.field3926;
                        int var83 = var81.field4934 - class232.field3930;
                        int var84 = var81.field4935 - class160.field2635;
                        int var85 = var81.field4937;
                        int var86;
                        if (var85 == 1 || var85 == 2) {
                            var86 = -var82;
                        } else {
                            var86 = var82;
                        }
                        int var87;
                        if (var85 == 2 || var85 == 3) {
                            var87 = -var84;
                        } else {
                            var87 = var84;
                        }
                        if (var87 >= var86) {
                            class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                            var81.field4943.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var81.field4929 + var82, var83, var81.field4944 + var84, var81.field4931);
                        } else if (var81.field4941 != null) {
                            class17.method100(class231.field3926, class232.field3930, class160.field2635, var5, var3, var4);
                            var81.field4941.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var82, var83, var84, var81.field4931);
                        }
                    }
                }
                class197 var88 = var2.field2632;
                if (var88 != null) {
                    if ((var88.field3377 & var2.field2618) != 0 && !class144.method904(var6, var3, var4, var88.field3377)) {
                        class17.method97(var88.field3377, class231.field3926, class232.field3930, class160.field2635, var6, var3, var4);
                        var88.field3376.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var88.field3365 - class231.field3926, var88.field3367 - class232.field3930, var88.field3363 - class160.field2635, var88.field3362);
                    }
                    if ((var88.field3366 & var2.field2618) != 0 && !class144.method904(var6, var3, var4, var88.field3366)) {
                        class17.method97(var88.field3366, class231.field3926, class232.field3930, class160.field2635, var6, var3, var4);
                        var88.field3375.method41(0, class256.field4317, class306.field5255, class137.field2283, class197.field3361, var88.field3365 - class231.field3926, var88.field3367 - class232.field3930, var88.field3363 - class160.field2635, var88.field3362);
                    }
                }
            }
            if (var5 < class221.field3716 - 1) {
                class160 var89 = class86.field1459[var5 + 1][var3][var4];
                if (var89 != null && var89.field2611) {
                    class205.field3485.method1809(var89, (byte) -122);
                }
            }
            if (var3 < class61.field844) {
                class160 var90 = var7[var3 + 1][var4];
                if (var90 != null && var90.field2611) {
                    class205.field3485.method1809(var90, (byte) -123);
                }
            }
            if (var4 < class125.field2078) {
                class160 var91 = var7[var3][var4 + 1];
                if (var91 != null && var91.field2611) {
                    class205.field3485.method1809(var91, (byte) -128);
                }
            }
            if (var3 > class61.field844) {
                class160 var92 = var7[var3 - 1][var4];
                if (var92 != null && var92.field2611) {
                    class205.field3485.method1809(var92, (byte) -122);
                }
            }
            if (var4 > class125.field2078) {
                class160 var93 = var7[var3][var4 - 1];
                if (var93 != null && var93.field2611) {
                    class205.field3485.method1809(var93, (byte) -125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIII)V", line = 1125)
    public class301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5088 = arg6 + arg5;
        this.field5091 = arg2;
        this.field5081 = arg3;
        this.field5072 = arg1;
        this.field5087 = arg0;
        this.field5090 = arg4;
        int var8 = class259.method1750((byte) 103, this.field5087).field2831;
        if (var8 == -1) {
            this.field5073 = true;
        } else {
            this.field5073 = false;
            this.field5070 = class132.method821(128, var8);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 1071)
    public static void method2040(int arg0) {
        field5092 = (byte[][][]) null;
        field5089 = null;
        field5076 = null;
        if (arg0 <= 7) {
            field5089 = (class198) null;
        }
        field5093 = null;
        field5086 = null;
        field5082 = null;
        field5094 = null;
        field5075 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIJ)V", line = 1100)
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field5084++;
        class289 var11 = this.method2037(-22921);
        if (var11 != null) {
            var11.method41(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field5071 = var11.method40();
        }
    }
}
