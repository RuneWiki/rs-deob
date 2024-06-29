import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class165 extends class304 {

    @OriginalMember(owner = "client!om", name = "T", descriptor = "I")
    private int field2671 = -1;

    @OriginalMember(owner = "client!om", name = "W", descriptor = "I")
    public static int field2674 = 2;

    @OriginalMember(owner = "client!om", name = "gb", descriptor = "I")
    public static int field2684 = 0;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "I")
    private int field2670;

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!om", name = "X", descriptor = "I")
    private int field2675;

    @OriginalMember(owner = "client!om", name = "Y", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!om", name = "Z", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!om", name = "ab", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!om", name = "cb", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!om", name = "db", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!om", name = "eb", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!om", name = "fb", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!om", name = "hb", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!om", name = "ib", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "[I")
    public static int[] field2668;

    @OriginalMember(owner = "client!om", name = "bb", descriptor = "[I")
    private int[] field2679;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(B)Z", line = 9)
    private final boolean method1248(byte arg0) {
        field2672++;
        if (arg0 != -41) {
            return false;
        } else if (this.field2679 != null) {
            return true;
        } else if (this.field2671 >= 0) {
            int var2 = class218.field3333;
            int var3 = class109.field1648;
            int var4 = class5.field66.method679((byte) -74, this.field2671).field962 ? 64 : 128;
            this.field2679 = class5.field66.method677(true, 1.0F, var4, var4, false, this.field2671);
            this.field2675 = var4;
            this.field2670 = var4;
            class5.method38(var2, var3, 927531564);
            return this.field2679 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)I", line = 39)
    public final int method1249(byte arg0) {
        int var2 = -12 / ((26 - arg0) / 48);
        field2676++;
        return this.field2671;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V", line = 48)
    public final void method1250(int arg0) {
        field2686++;
        if (arg0 <= -99) {
            super.method1250(-100);
            this.field2679 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V", line = 61)
    public static final void method1251(int arg0, byte arg1) {
        int var2 = -103 / ((8 - arg1) / 41);
        field2680++;
        class163.field2649 = (class262) class224.field3418.method1716(-1, (long) arg0);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[[I", line = 71)
    public final int[][] method75(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1249((byte) 53);
        }
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820 && this.method1248((byte) -41)) {
            int var4 = (class109.field1648 == this.field2670 ? arg0 : this.field2670 * arg0 / class109.field1648) * this.field2675;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class218.field3333 == this.field2675) {
                for (int var8 = 0; var8 < class218.field3333; var8++) {
                    int var9 = this.field2679[var4++];
                    var7[var8] = class149.method1117(4080, var9 << 4);
                    var6[var8] = class149.method1117(65280, var9) >> 4;
                    var5[var8] = class149.method1117(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class218.field3333; var10++) {
                    int var11 = this.field2675 * var10 / class218.field3333;
                    int var12 = this.field2679[var4 + var11];
                    var7[var10] = class149.method1117(4080, var12 << 4);
                    var6[var10] = class149.method1117(65280, var12) >> 4;
                    var5[var10] = class149.method1117(4080, var12 >> 12);
                }
            }
        }
        field2678++;
        return var3;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V", line = 138)
    public class165() {
        super(0, false);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZII)I", line = 147)
    public static final int method1252(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2681++;
        if (class25.field276) {
            class25.field276 = false;
            arg0 = 1000000;
        }
        if (arg2) {
            return 65;
        }
        class61 var5 = class258.field3966[arg4][arg1];
        int var6 = var5.field807;
        float var7 = ((float) arg3 * 0.1F + 0.7F) * var5.field816;
        float var8 = var5.field804;
        int var9 = var5.field809;
        float var10 = var5.field813;
        int var11 = var5.field799;
        if (!class67.field972) {
            var11 = 0;
        }
        class256 var12 = var5.field812;
        float var13 = var5.field811;
        float var14 = var5.field805;
        float var15 = var5.field800;
        if (class226.field3463 != var6 || class292.field4488 != var7 || class3.field36 != var8 || class250.field3770 != var10 || class263.field4051 != var9 || class163.field2640 != var11 || class141.field2160 != var12 || class210.field3204 != var14 || class159.field2415 != var15 || class101.field1462 != var13) {
            class331.field5115 = class65.field950;
            class216.field3313 = class52.field706;
            class248.field3748 = class106.field1541;
            class243.field3700 = class101.field1452;
            class94.field1326 = class132.field2021;
            class154.field2338 = class240.field3666;
            class79.field1159 = class133.field2026;
            class226.field3453 = class300.field4615;
            class262.field4029 = class144.field2206;
            class121.field1865 = class130.field2000;
            if (class27.field302 == null || class27.field302 == class243.field3700) {
                class27.field302 = new class256();
            }
            class292.field4488 = var7;
            class101.field1462 = var13;
            class263.field4051 = var9;
            class226.field3463 = var6;
            class3.field36 = var8;
            class210.field3204 = var14;
            class163.field2640 = var11;
            class159.field2415 = var15;
            class232.field3533 = 0;
            class141.field2160 = var12;
            class250.field3770 = var10;
        }
        if (class232.field3533 < 65536) {
            class232.field3533 += arg0 * 250;
            if (class232.field3533 < 65536) {
                int var16 = 65536 - class232.field3533 >> 8;
                int var17 = class232.field3533 >> 8;
                class132.field2021 = ((class94.field1326 & 0xFF00) * var16 + (class263.field4051 & 0xFF00) * var17 & 0xFF0000) + ((class94.field1326 & 0xFF00FF) * var16 + (class263.field4051 & 0xFF00FF) * var17 & 0xFF00FF00) >> 8;
                class106.field1541 = class248.field3748 * var16 + class163.field2640 * var17 >> 8;
                float var18 = (float) (65536 - class232.field3533) / 65536.0F;
                class133.field2026 = ((class79.field1159 & 0xFF00FF) * var16 + ((class226.field3463 & 0xFF00FF) * var17) & 0xFF00FF00) + ((class79.field1159 & 0xFF00) * var16 + (class226.field3463 & 0xFF00) * var17 & 0xFF0000) >> 8;
                float var19 = (float) class232.field3533 / 65536.0F;
                class240.field3666 = class159.field2415 * var19 + class154.field2338 * var18;
                class144.field2206 = class292.field4488 * var19 + class262.field4029 * var18;
                class52.field706 = class216.field3313 * var18 + class210.field3204 * var19;
                class65.field950 = class331.field5115 * var18 + class3.field36 * var19;
                class300.field4615 = class226.field3453 * var18 + class101.field1462 * var19;
                class130.field2000 = class250.field3770 * var19 + class121.field1865 * var18;
                if (class243.field3700 != class141.field2160) {
                    if (class243.field3700 == null || class141.field2160 == null) {
                        class101.field1452 = null;
                    } else {
                        class101.field1452 = class27.field302.method1799(class243.field3700, class141.field2160, (float) class232.field3533 / 65536.0F);
                    }
                }
            } else {
                class232.field3533 = 65536;
                class65.field950 = class3.field36;
                class144.field2206 = class292.field4488;
                class243.field3700 = null;
                class52.field706 = class210.field3204;
                class240.field3666 = class159.field2415;
                class133.field2026 = class226.field3463;
                class101.field1452 = class141.field2160;
                class132.field2021 = class263.field4051;
                class106.field1541 = class163.field2640;
                class130.field2000 = class250.field3770;
                class300.field4615 = class101.field1462;
            }
        }
        return class132.field2021;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lwm;II)V", line = 278)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg2 != -2828) {
            this.field2679 = (int[]) null;
        }
        if (arg1 == 0) {
            this.field2671 = arg0.method1755(false);
        }
        field2669++;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)Z", line = 296)
    public static final boolean method1253(int arg0, int arg1, int arg2, int arg3) {
        if (class257.method1812(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class120.method909(var4 + 1, class203.field3111[arg0][arg1][arg2] + arg3, var5 + 1) && class120.method909(var4 + 128 - 1, class203.field3111[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class120.method909(var4 + 128 - 1, class203.field3111[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class120.method909(var4 + 1, class203.field3111[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLjd;)V", line = 312)
    public static final void method1254(byte arg0, class95 arg1) {
        field2683++;
        class31.field371 = arg1;
        int var2 = -42 % ((arg0 - 34) / 56);
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(B)V", line = 322)
    public static void method1255(byte arg0) {
        field2668 = null;
        if (arg0 >= -16) {
            field2684 = 113;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V", line = 332)
    public static final void method1256(byte arg0, int arg1) {
        class32.field393--;
        field2677++;
        if (class32.field393 == arg1) {
            return;
        }
        class126.method941(class204.field3122, arg1 + 1, class204.field3122, arg1, class32.field393 - arg1);
        class126.method941(class311.field4832, arg1 + 1, class311.field4832, arg1, class32.field393 - arg1);
        class126.method944(class336.field5229, arg1 + 1, class336.field5229, arg1, class32.field393 - arg1);
        class126.method945(class118.field1843, arg1 + 1, class118.field1843, arg1, class32.field393 - arg1);
        if (arg0 == 94) {
            class126.method949(class115.field1805, arg1 + 1, class115.field1805, arg1, class32.field393 - arg1);
            class126.method944(class25.field290, arg1 + 1, class25.field290, arg1, class32.field393 - arg1);
            class126.method944(class323.field4993, arg1 + 1, class323.field4993, arg1, class32.field393 - arg1);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lwm;I)V", line = 357)
    public static final void method1257(class254 arg0, int arg1) {
        field2682++;
        int var2 = arg0.method1730(false);
        class60.field795 = new class309[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class60.field795[var3] = new class309();
            class60.field795[var3].field4816 = arg0.method1730(false);
            class60.field795[var3].field4818 = arg0.method1742(-2097152);
        }
        class41.field591 = arg0.method1730(false);
        if (arg1 < 78) {
            field2684 = -103;
        }
        class320.field4957 = arg0.method1730(false);
        class338.field5253 = arg0.method1730(false);
        class84.field1229 = new class163[class320.field4957 + 1 - class41.field591];
        for (int var4 = 0; var4 < class338.field5253; var4++) {
            int var5 = arg0.method1730(false);
            class163 var6 = class84.field1229[var5] = new class163();
            var6.field2730 = arg0.method1774((byte) 18);
            var6.field2736 = arg0.method1741(-32769);
            var6.field2647 = class41.field591 + var5;
            var6.field2639 = arg0.method1742(-2097152);
            var6.field2638 = arg0.method1742(-2097152);
        }
        class151.field2293 = arg0.method1741(-32769);
        class132.field2012 = true;
    }
}
