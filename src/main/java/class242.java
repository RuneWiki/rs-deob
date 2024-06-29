import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class242 extends class98 {

    @OriginalMember(owner = "client!og", name = "L", descriptor = "Loa;")
    public static class262 field4202 = new class262();

    @OriginalMember(owner = "client!og", name = "R", descriptor = "[Ltf;")
    public static class106[] field4208 = new class106[27];

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "Lmb;")
    public class96 field4199;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "Lclient;")
    public static client field4209;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "[I")
    public int[] field4196;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "[I")
    public int[] field4198;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "[I")
    public int[] field4200;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "[I")
    public int[] field4204;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "[Lmj;")
    public static class246[] field4206;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I")
    public final int method1699(int arg0, int arg1) {
        field4201++;
        if (this.field4204 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4204.length; var3++) {
            if (this.field4200[var3] == arg0) {
                return this.field4204[var3];
            }
        }
        if (arg1 != -1) {
            this.method1704((byte) -115, (class239) null, 113);
        }
        return -1;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)I")
    public final int method1700(int arg0, int arg1) {
        if (arg0 != 32768) {
            this.field4200 = null;
        }
        field4195++;
        if (this.field4196 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4196.length; var3++) {
            if (this.field4198[var3] == arg1) {
                return this.field4196[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public static void method1701(int arg0) {
        field4206 = null;
        field4209 = null;
        if (arg0 > 39) {
            field4208 = null;
            field4202 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(B)V")
    public static final void method1702(byte arg0) {
        class170.field2979 = class157.field2733;
        class26.field440 = class195.field3352;
        class22.field383 = class31.field485;
        class73.field1251 = class219.field3742;
        class188.field3289 = class141.field2528;
        class45.field770 = class56.field989;
        class215.field3690 = class62.field1062;
        class43.field731 = class273.field4748;
        class258.field4473 = class247.field4284;
        class219.field3754 = class169.field2967;
        class230.field3959 = class37.field641;
        class52.field902 = class168.field2955;
        class9.field158 = class39.field677;
        class3.field59 = class62.field1056;
        class7.field131 = class52.field901;
        class23.field402 = class132.field2374;
        class170.field2984 = class157.field2733;
        class206.field3532 = class107.field1872;
        class260.field4551 = class60.field1042;
        class168.field2953 = class277.field4844;
        class151.field2655 = class235.field4025;
        class127.field2329 = class227.field3866;
        class206.field3538 = class89.field1492;
        class130.field2350 = class36.field625;
        class121.field2233 = class146.field2590;
        class272.field4735 = class138.field2480;
        class44.field762 = class100.field1682;
        class17.field251 = class117.field2174;
        class136.field2435 = class151.field2667;
        class75.field1296 = class149.field2623;
        class171.field2997 = class15.field235;
        class46.field791 = class218.field3736;
        class274.field4787 = class147.field2612;
        class103.field1742 = class109.field2024;
        class29.field481 = class277.field4843;
        class3.field27 = class193.field3342;
        class202.field3501 = class56.field969;
        class56.field976 = class21.field356;
        class24.field417 = class153.field2685;
        class70.field1210 = class224.field3818;
        class52.field917 = class156.field2730;
        class139.field2484 = class235.field4034;
        class97.field1650 = class239.field4103;
        class20.field338 = class128.field2333;
        class272.field4737 = class138.field2480;
        class135.field2428 = class98.field1671;
        class175.field3042 = class244.field4242;
        field4193++;
        class120.field2225 = class19.field304;
        class68.field1173 = class20.field326;
        class89.field1467 = class268.field4669;
        class224.field3807 = class185.field3216;
        class62.field1055 = class32.field509;
        class121.field2231 = class146.field2590;
        class49.field864 = class193.field3338;
        class169.field2975 = class273.field4743;
        class78.field1327 = class153.field2696;
        class219.field3746 = class101.field1731;
        class189.field3308 = class236.field4043;
        class80.field1370 = class202.field3500;
        class178.field3079 = class198.field3446;
        class118.field2193 = class68.field1185;
        class54.field945 = class86.field1449;
        class270.field4710 = class36.field613;
        if (arg0 != 94) {
            field4209 = null;
        }
        class100.field1691 = class11.field194;
        class156.field2725 = class41.field706;
        class53.field933 = class271.field4715;
        class213.field3675 = class7.field141;
        class245.field4261 = class169.field2972;
        class244.field4236 = class11.field192;
        class180.field3108 = class27.field461;
        class20.field334 = class231.field3973;
        class68.field1186 = class202.field3493;
        class21.field363 = class71.field1219;
        class241.field4186 = class226.field3850;
        class26.field443 = class165.field2923;
        class85.field1445 = class14.field223;
        class34.field601 = class150.field2636;
        class89.field1471 = class99.field1681;
        class77.field1313 = class32.field506;
        class197.field3438 = class67.field1155;
        class145.field2576 = class106.field1805;
        class82.field1383 = class122.field2249;
        class10.field173 = class165.field2925;
        class212.field3656 = class20.field329;
        class71.field1217 = class97.field1644;
        class21.field360 = class64.field1107;
        class169.field2965 = class229.field3938;
        class247.field4283 = class37.field636;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
    public final void method1703(int arg0) {
        if (this.field4204 != null) {
            for (int var2 = 0; var2 < this.field4204.length; var2++) {
                this.field4204[var2] = class45.method348(this.field4204[var2], 32768);
            }
        }
        int var3 = 100 / ((66 - arg0) / 57);
        field4194++;
        if (this.field4196 != null) {
            for (int var4 = 0; var4 < this.field4196.length; var4++) {
                this.field4196[var4] = class45.method348(this.field4196[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLrg;I)V")
    private final void method1704(byte arg0, class239 arg1, int arg2) {
        if (arg0 != 35) {
            return;
        }
        field4197++;
        if (arg2 == 1) {
            this.field4199 = arg1.method1634(-95);
        } else if (arg2 == 2) {
            int var4 = arg1.method1651(4139);
            this.field4198 = new int[var4];
            this.field4196 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4196[var5] = arg1.method1663((byte) -55);
                int var6 = arg1.method1651(4139);
                if (var6 == 0) {
                    this.field4198[var5] = -1;
                } else {
                    this.field4198[var5] = var6;
                }
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg1.method1651(4139);
            this.field4200 = new int[var7];
            this.field4204 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4204[var8] = arg1.method1663((byte) -53);
                int var9 = arg1.method1651(4139);
                if (var9 == 0) {
                    this.field4200[var8] = -1;
                } else {
                    this.field4200[var8] = var9;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBI)V")
    public static final void method1705(int arg0, byte arg1, int arg2) {
        field4205++;
        class43 var3 = class270.method1847(arg0, -10277, 6);
        var3.method333(-126);
        if (arg1 < 71) {
            method1707(51, true);
        }
        var3.field740 = arg2;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLrg;)V")
    public final void method1706(boolean arg0, class239 arg1) {
        field4192++;
        if (!arg0) {
            this.method1699(-45, -40);
        }
        while (true) {
            int var3 = arg1.method1651(4139);
            if (var3 == 0) {
                return;
            }
            this.method1704((byte) 35, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)I")
    public static final int method1707(int arg0, boolean arg1) {
        if (!arg1) {
            field4206 = null;
        }
        field4203++;
        return arg0 & 0xFF;
    }
}
