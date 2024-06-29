import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class8 {

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    private int field294 = -1;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public int field295;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "Lgi;")
    public static class156 field292;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "[I")
    public int[] field298;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public static void method132(byte arg0) {
        if (arg0 >= -41) {
            method136(3);
        }
        field292 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)V")
    public static final void method133(boolean arg0, int arg1) {
        ++field297;
        if (arg0) {
            if (class157.field2548 != -1) {
                class194.method1322(true, class157.field2548);
            }
            for (class258 var2 = (class258) class128.field2062.method1404(101); var2 != null; var2 = (class258) class128.field2062.method1412(-85)) {
                class66.method461(-27002, true, var2);
            }
            class157.field2548 = -1;
            class128.field2062 = new class204(8);
            class128.method908((byte) -86);
            class157.field2548 = class119.field1946;
            class271.method1836(false, -121);
            class253.method1720(22023);
            class183.method1242(class157.field2548, arg1 + -2);
        }
        class67.field1111 = -1;
        if (arg1 != 2) {
            method139((class213) null, 49, false);
        }
        class198.method1344(class189.field3062, arg1 + -3);
        class167.field2655 = new class33();
        class167.field2655.field3341 = 3000;
        class167.field2655.field3389 = 3000;
        class258.method1763((byte) -53, class222.field3687);
        class1.method5(10, arg1 + 123);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILqh;)V")
    public static final void method134(int arg0, class201 arg1) {
        ++field296;
        if (!class194.field3107) {
            class2.method20();
            class77.field1242 = class215.method1473((byte) 122, class43.field790, arg1);
            int var2 = class279.field4423;
            int var3 = var2 * 956 / 503;
            class77.field1242.method327((-var3 + class84.field1326) / 2, 0, var3, var2);
            class96.field1574 = class70.method505(114, arg1, class24.field402);
            if (arg0 <= 104) {
                field292 = null;
            }
            class96.field1574.method1592(class84.field1326 / 2 + -(class96.field1574.field3744 / 2), 18);
            class194.field3107 = true;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I")
    public final int method58(byte arg0) {
        if (arg0 != 112) {
            method132((byte) 119);
        }
        ++field293;
        return this.field294;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[[I")
    public int[][] method65(int arg0, byte arg1) {
        int var3 = -106 % ((arg1 - -48) / 46);
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470 && this.method137(-88)) {
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int var8 = this.field286 * (class259.field4118 != this.field295 ? this.field295 * arg0 / class259.field4118 : arg0);
            if (~class231.field3798 == ~this.field286) {
                for (int var9 = 0; var9 < class231.field3798; ++var9) {
                    int var10 = this.field298[var8++];
                    var6[var9] = class202.method1393(255, var10) << 4;
                    var7[var9] = class202.method1393(var10, 65280) >> 4;
                    var5[var9] = class202.method1393(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; var11 < class231.field3798; ++var11) {
                    int var12 = this.field286 * var11 / class231.field3798;
                    int var13 = this.field298[var8 + var12];
                    var6[var11] = class202.method1393(4080, var13 << 4);
                    var7[var11] = class202.method1393(4080, var13 >> 4);
                    var5[var11] = class202.method1393(16711680, var13) >> 12;
                }
            }
        }
        ++field288;
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class17() {
        super(0, false);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 < 62) {
            this.field286 = -115;
        }
        ++field287;
        if (arg2 == 0) {
            this.field294 = arg1.method1521((byte) 113);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(II)V")
    public static final void method135(int arg0, int arg1) {
        ++field290;
        if (arg0 != 1) {
            field292 = null;
        }
        class196.field3126.method476(false, arg1);
        class51.field892.method476(false, arg1);
        class198.field3161.method476(false, arg1);
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static final void method136(int arg0) {
        ++field283;
        while (~class67.field1103.method537(8, class115.field1912) <= -28) {
            int var1 = class67.field1103.method540(15, 882786883);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class137.field2260[var1] == null) {
                var2 = true;
                class137.field2260[var1] = new class15();
            }
            class15 var3 = class137.field2260[var1];
            class221.field3648[class141.field2287++] = var1;
            var3.field3376 = class222.field3682;
            if (var3.field258 != null && var3.field258.method779(-110)) {
                class96.method710(29933, var3);
            }
            int var4 = class199.field3184[class67.field1103.method540(3, 882786883)];
            if (var2) {
                var3.field3322 = var3.field3320 = var4;
            }
            int var5 = class67.field1103.method540(5, 882786883);
            int var6 = class67.field1103.method540(1, 882786883);
            var3.method114(class204.method1402((byte) 77, class67.field1103.method540(14, 882786883)), (byte) 105);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class67.field1103.method540(5, 882786883);
            if (~var7 < -16) {
                var7 -= 32;
            }
            int var8 = class67.field1103.method540(1, 882786883);
            if (var8 == 1) {
                class106.field1701[class43.field802++] = var1;
            }
            var3.method1438(var3.field258.field1731, (byte) -105);
            var3.field3362 = var3.field258.field1749;
            var3.field3349 = var3.field258.field1769;
            if (~var3.field3362 == -1) {
                var3.field3320 = 0;
            }
            var3.method1430(class167.field2655.field3321[0] + var5, var3.method278(0), class167.field2655.field3340[0] + var7, (byte) 86, var6 == 1);
            if (var3.field258.method779(-95)) {
                class39.method345(var3.field3340[0], (class33) null, 0, class250.field3980, var3, var3.field3321[0], (class135) null, false);
            }
        }
        class67.field1103.method539(-119);
        if (arg0 < 60) {
            field292 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)Z")
    public final boolean method137(int arg0) {
        ++field285;
        if (arg0 > -50) {
            this.method64((byte) -71, (class221) null, -12);
        }
        if (this.field298 != null) {
            return true;
        } else if (this.field294 >= 0) {
            class37 var2 = ~class199.field3174 > -1 ? class105.method761(this.field294, class157.field2545, (byte) -82) : class56.method421(class199.field3174, -17364, this.field294, class157.field2545);
            var2.method323();
            this.field286 = var2.field3873;
            this.field295 = var2.field3864;
            this.field298 = var2.field723;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
    public static final void method138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class255.field4055 = arg2;
        class9.field128 = arg3;
        class51.field896 = arg4;
        int var5 = -1 % ((arg0 - 22) / 50);
        ++field299;
        class161.field2561 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lsh;IZ)V")
    public static final void method139(class213 arg0, int arg1, boolean arg2) {
        Object[] var3 = arg0.field3477;
        ++field291;
        int var4 = (Integer) var3[0];
        class19 var5 = class229.method1607(var4, 6771);
        if (var5 != null) {
            class199.field3166 = 0;
            if (arg2) {
                method134(-63, (class201) null);
            }
            int var6 = 0;
            int var7 = 0;
            int[] var8 = var5.field318;
            byte var9 = -1;
            int[] var10 = var5.field333;
            int var11 = -1;
            try {
                class4.field49 = new String[var5.field317];
                class9.field124 = new int[var5.field330];
                int var12 = 0;
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; ++var14) {
                    if (!(var3[var14] instanceof Integer)) {
                        if (var3[var14] instanceof String) {
                            String var15 = (String) var3[var14];
                            if (var15.equals("event_opbase")) {
                                var15 = arg0.field3488;
                            }
                            class4.field49[var12++] = var15;
                        }
                    } else {
                        int var16 = (Integer) var3[var14];
                        if (var16 == -2147483647) {
                            var16 = arg0.field3491;
                        }
                        if (~var16 == 2147483645) {
                            var16 = arg0.field3487;
                        }
                        if (var16 == -2147483645) {
                            var16 = arg0.field3480 == null ? -1 : arg0.field3480.field648;
                        }
                        if (~var16 == 2147483643) {
                            var16 = arg0.field3475;
                        }
                        if (var16 == -2147483643) {
                            var16 = arg0.field3480 != null ? arg0.field3480.field661 : -1;
                        }
                        if (~var16 == 2147483641) {
                            var16 = arg0.field3485 == null ? -1 : arg0.field3485.field648;
                        }
                        if (var16 == -2147483641) {
                            var16 = arg0.field3485 == null ? -1 : arg0.field3485.field661;
                        }
                        if (~var16 == 2147483639) {
                            var16 = arg0.field3479;
                        }
                        if (~var16 == 2147483638) {
                            var16 = arg0.field3483;
                        }
                        class9.field124[var13++] = var16;
                    }
                }
                int var17 = 0;
                label3906: while (true) {
                    ++var17;
                    if (~arg1 > ~var17) {
                        throw new RuntimeException("slow");
                    }
                    ++var11;
                    int var496 = var8[var11];
                    if (var496 < 100) {
                        if (~var496 == -1) {
                            class10.field141[var6++] = var10[var11];
                            continue;
                        }
                        if (var496 == 1) {
                            int var18 = var10[var11];
                            class10.field141[var6++] = class82.field1289[var18];
                            continue;
                        }
                        if (var496 == 2) {
                            int var19 = var10[var11];
                            --var6;
                            class71.method506(var19, (byte) 32, class10.field141[var6]);
                            continue;
                        }
                        if (~var496 == -4) {
                            class78.field1248[var7++] = var5.field323[var11];
                            continue;
                        }
                        if (~var496 == -7) {
                            var11 += var10[var11];
                            continue;
                        }
                        if (var496 == 7) {
                            var6 -= 2;
                            if (~class10.field141[var6 + 1] != ~class10.field141[var6]) {
                                var11 += var10[var11];
                            }
                            continue;
                        }
                        if (var496 == 8) {
                            var6 -= 2;
                            if (~class10.field141[var6 - -1] == ~class10.field141[var6]) {
                                var11 += var10[var11];
                            }
                            continue;
                        }
                        if (~var496 == -10) {
                            var6 -= 2;
                            if (class10.field141[var6 - -1] > class10.field141[var6]) {
                                var11 += var10[var11];
                            }
                            continue;
                        }
                        if (var496 == 10) {
                            var6 -= 2;
                            if (~class10.field141[var6] < ~class10.field141[var6 + 1]) {
                                var11 += var10[var11];
                            }
                            continue;
                        }
                        if (var496 == 21) {
                            if (class199.field3166 == 0) {
                                return;
                            }
                            class32 var20 = class83.field1305[--class199.field3166];
                            var5 = var20.field494;
                            var11 = var20.field499;
                            class4.field49 = var20.field493;
                            var8 = var5.field318;
                            class9.field124 = var20.field495;
                            var10 = var5.field333;
                            continue;
                        }
                        if (var496 == 25) {
                            int var21 = var10[var11];
                            class10.field141[var6++] = class168.method1155(var21, 119);
                            continue;
                        }
                        if (~var496 == -28) {
                            int var22 = var10[var11];
                            --var6;
                            class127.method905(class10.field141[var6], 0, var22);
                            continue;
                        }
                        if (~var496 == -32) {
                            var6 -= 2;
                            if (class10.field141[var6 + 1] >= class10.field141[var6]) {
                                var11 += var10[var11];
                            }
                            continue;
                        }
                        if (var496 == 32) {
                            var6 -= 2;
                            if (~class10.field141[var6 + 1] >= ~class10.field141[var6]) {
                                var11 += var10[var11];
                            }
                            continue;
                        }
                        if (var496 == 33) {
                            class10.field141[var6++] = class9.field124[var10[var11]];
                            continue;
                        }
                        int var10001;
                        if (~var496 == -35) {
                            var10001 = var10[var11];
                            --var6;
                            class9.field124[var10001] = class10.field141[var6];
                            continue;
                        }
                        if (~var496 == -36) {
                            class78.field1248[var7++] = class4.field49[var10[var11]];
                            continue;
                        }
                        if (~var496 == -37) {
                            var10001 = var10[var11];
                            --var7;
                            class4.field49[var10001] = class78.field1248[var7];
                            continue;
                        }
                        if (~var496 == -38) {
                            int var23 = var10[var11];
                            var7 -= var23;
                            String var24 = class227.method1601(var7, var23, class78.field1248, true);
                            class78.field1248[var7++] = var24;
                            continue;
                        }
                        if (~var496 == -39) {
                            --var6;
                            continue;
                        }
                        if (~var496 == -40) {
                            --var7;
                            continue;
                        }
                        if (~var496 == -41) {
                            int var25 = var10[var11];
                            class19 var26 = class229.method1607(var25, 6771);
                            int[] var27 = new int[var26.field330];
                            String[] var28 = new String[var26.field317];
                            for (int var29 = 0; ~var26.field324 < ~var29; ++var29) {
                                var27[var29] = class10.field141[var6 + var29 + -var26.field324];
                            }
                            for (int var30 = 0; ~var26.field319 < ~var30; ++var30) {
                                var28[var30] = class78.field1248[var7 + var30 + -var26.field319];
                            }
                            var7 -= var26.field319;
                            var6 -= var26.field324;
                            class32 var31 = new class32();
                            var31.field494 = var5;
                            var31.field495 = class9.field124;
                            var31.field493 = class4.field49;
                            var31.field499 = var11;
                            if (~class83.field1305.length >= ~class199.field3166) {
                                throw new RuntimeException();
                            }
                            class83.field1305[class199.field3166++] = var31;
                            class9.field124 = var27;
                            var11 = -1;
                            var5 = var26;
                            var8 = var26.field318;
                            class4.field49 = var28;
                            var10 = var26.field333;
                            continue;
                        }
                        if (~var496 == -43) {
                            class10.field141[var6++] = class174.field2731[var10[var11]];
                            continue;
                        }
                        if (~var496 == -44) {
                            int var32 = var10[var11];
                            --var6;
                            class174.field2731[var32] = class10.field141[var6];
                            class97.method718(var32, 2);
                            continue;
                        }
                        if (~var496 == -45) {
                            int var33 = var10[var11] & 65535;
                            int var34 = var10[var11] >> 16;
                            --var6;
                            int var35 = class10.field141[var6];
                            if (~var35 <= -1 && ~var35 >= -5001) {
                                class203.field3252[var34] = var35;
                                byte var36 = -1;
                                if (var33 == 105) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (var37 >= var35) {
                                        continue label3906;
                                    }
                                    class200.field3196[var34][var37] = var36;
                                    ++var37;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (~var496 == -46) {
                            --var6;
                            int var38 = class10.field141[var6];
                            int var39 = var10[var11];
                            if (var38 >= 0 && ~class203.field3252[var39] < ~var38) {
                                class10.field141[var6++] = class200.field3196[var39][var38];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (~var496 == -47) {
                            int var40 = var10[var11];
                            var6 -= 2;
                            int var41 = class10.field141[var6];
                            if (var41 >= 0 && var41 < class203.field3252[var40]) {
                                class200.field3196[var40][var41] = class10.field141[var6 - -1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var496 == 47) {
                            String var42 = class57.field969[var10[var11]];
                            if (var42 == null) {
                                var42 = "null";
                            }
                            class78.field1248[var7++] = var42;
                            continue;
                        }
                        if (var496 == 48) {
                            int var43 = var10[var11];
                            --var7;
                            class57.field969[var43] = class78.field1248[var7];
                            class100.method736((byte) 110, var43);
                            continue;
                        }
                        if (~var496 == -52) {
                            class204 var44 = var5.field320[var10[var11]];
                            --var6;
                            class10 var45 = (class10) var44.method1400((long) class10.field141[var6], !arg2);
                            if (var45 != null) {
                                var11 += var45.field143;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (var10[var11] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    if (var496 < 300) {
                        if (~var496 == -101) {
                            var6 -= 3;
                            int var47 = class10.field141[var6];
                            int var48 = class10.field141[var6 + 1];
                            int var49 = class10.field141[var6 + 2];
                            if (~var48 == -1) {
                                throw new RuntimeException();
                            }
                            class36 var50 = class64.method455(var47, 592427152);
                            if (var50.field658 == null) {
                                var50.field658 = new class36[var49 + 1];
                            }
                            if (var49 >= var50.field658.length) {
                                class36[] var51 = new class36[var49 + 1];
                                for (int var52 = 0; var52 < var50.field658.length; ++var52) {
                                    var51[var52] = var50.field658[var52];
                                }
                                var50.field658 = var51;
                            }
                            if (var49 > 0 && var50.field658[var49 + -1] == null) {
                                throw new RuntimeException("Gap at:" + (var49 - 1));
                            }
                            class36 var53 = new class36();
                            var53.field661 = var49;
                            var53.field597 = true;
                            var53.field709 = var48;
                            var53.field632 = var53.field648 = var50.field648;
                            var50.field658[var49] = var53;
                            if (var46) {
                                class48.field852 = var53;
                            } else {
                                class113.field1887 = var53;
                            }
                            class280.method1886(var50, 32);
                            continue;
                        }
                        if (~var496 == -102) {
                            class36 var54 = !var46 ? class113.field1887 : class48.field852;
                            if (var54.field661 == -1) {
                                if (!var46) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class36 var55 = class64.method455(var54.field648, 592427152);
                            var55.field658[var54.field661] = null;
                            class280.method1886(var55, 32);
                            continue;
                        }
                        if (~var496 == -103) {
                            --var6;
                            class36 var56 = class64.method455(class10.field141[var6], 592427152);
                            var56.field658 = null;
                            class280.method1886(var56, 32);
                            continue;
                        }
                        if (~var496 == -201) {
                            var6 -= 2;
                            int var57 = class10.field141[var6];
                            int var58 = class10.field141[var6 + 1];
                            class36 var59 = class230.method1612(1, var58, var57);
                            if (var59 != null && var58 != -1) {
                                class10.field141[var6++] = 1;
                                if (!var46) {
                                    class113.field1887 = var59;
                                } else {
                                    class48.field852 = var59;
                                }
                                continue;
                            }
                            class10.field141[var6++] = 0;
                            continue;
                        }
                        if (var496 == 201) {
                            --var6;
                            int var60 = class10.field141[var6];
                            class36 var61 = class64.method455(var60, 592427152);
                            if (var61 != null) {
                                class10.field141[var6++] = 1;
                                if (var46) {
                                    class48.field852 = var61;
                                } else {
                                    class113.field1887 = var61;
                                }
                            } else {
                                class10.field141[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var496 < 500) {
                        if (~var496 == -404) {
                            var6 -= 2;
                            int var484 = class10.field141[var6 - -1];
                            int var485 = class10.field141[var6];
                            for (int var486 = 0; ~class219.field3584.length < ~var486; ++var486) {
                                if (class219.field3584[var486] == var485) {
                                    class167.field2655.field528.method800(var484, var486, (byte) -16);
                                    continue label3906;
                                }
                            }
                            int var487 = 0;
                            while (true) {
                                if (var487 >= class43.field799.length) {
                                    continue label3906;
                                }
                                if (~class43.field799[var487] == ~var485) {
                                    class167.field2655.field528.method800(var484, var487, (byte) -16);
                                    continue label3906;
                                }
                                ++var487;
                            }
                        }
                        if (~var496 == -405) {
                            var6 -= 2;
                            int var488 = class10.field141[var6 + 1];
                            int var489 = class10.field141[var6];
                            class167.field2655.field528.method805(5, var489, var488);
                            continue;
                        }
                        if (~var496 == -411) {
                            --var6;
                            boolean var490 = ~class10.field141[var6] != -1;
                            class167.field2655.field528.method804(var490, (byte) 46);
                            continue;
                        }
                    } else if ((var496 < 1000 || ~var496 <= -1101) && (var496 < 2000 || var496 >= 2100)) {
                        if (var496 >= 1100 && var496 < 1200 || var496 >= 2100 && var496 < 2200) {
                            class36 var68;
                            if (var496 < 2000) {
                                var68 = var46 ? class48.field852 : class113.field1887;
                            } else {
                                var496 -= 1000;
                                --var6;
                                var68 = class64.method455(class10.field141[var6], 592427152);
                            }
                            if (var496 == 1100) {
                                var6 -= 2;
                                var68.field630 = class10.field141[var6];
                                if (-var68.field642 + var68.field674 < var68.field630) {
                                    var68.field630 = -var68.field642 + var68.field674;
                                }
                                if (~var68.field630 > -1) {
                                    var68.field630 = 0;
                                }
                                var68.field571 = class10.field141[var6 + 1];
                                if (~var68.field571 < ~(var68.field602 - var68.field676)) {
                                    var68.field571 = -var68.field676 + var68.field602;
                                }
                                if (var68.field571 < 0) {
                                    var68.field571 = 0;
                                }
                                class280.method1886(var68, 32);
                                if (~var68.field661 == 0) {
                                    class185.method1262(-113, var68.field648);
                                }
                                continue;
                            }
                            if (var496 == 1101) {
                                --var6;
                                var68.field710 = class10.field141[var6];
                                class280.method1886(var68, 32);
                                if (~var68.field661 == 0) {
                                    class49.method388(64, var68.field648);
                                }
                                continue;
                            }
                            if (~var496 == -1103) {
                                --var6;
                                var68.field605 = ~class10.field141[var6] == -2;
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (~var496 == -1104) {
                                --var6;
                                var68.field640 = class10.field141[var6];
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (~var496 == -1105) {
                                --var6;
                                var68.field691 = class10.field141[var6];
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (var496 == 1105) {
                                --var6;
                                var68.field561 = class10.field141[var6];
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (var496 == 1106) {
                                --var6;
                                var68.field704 = class10.field141[var6];
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (~var496 == -1108) {
                                --var6;
                                var68.field686 = ~class10.field141[var6] == -2;
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (var496 == 1108) {
                                var68.field565 = 1;
                                --var6;
                                var68.field598 = class10.field141[var6];
                                class280.method1886(var68, 32);
                                if (~var68.field661 == 0) {
                                    class51.method395(-25266, var68.field648);
                                }
                                continue;
                            }
                            if (~var496 == -1110) {
                                var6 -= 6;
                                var68.field619 = class10.field141[var6];
                                var68.field652 = class10.field141[var6 - -1];
                                var68.field647 = class10.field141[var6 + 2];
                                var68.field567 = class10.field141[var6 + 3];
                                var68.field668 = class10.field141[var6 + 4];
                                var68.field702 = class10.field141[var6 + 5];
                                class280.method1886(var68, 32);
                                if (~var68.field661 == 0) {
                                    class190.method1297(var68.field648, 110);
                                    class122.method879(var68.field648, 25186);
                                }
                                continue;
                            }
                            if (~var496 == -1111) {
                                --var6;
                                int var69 = class10.field141[var6];
                                if (~var68.field664 != ~var69) {
                                    var68.field664 = var69;
                                    var68.field635 = 0;
                                    var68.field683 = 0;
                                    var68.field689 = 1;
                                    class280.method1886(var68, 32);
                                }
                                if (~var68.field661 == 0) {
                                    class145.method991(var68.field648, 125);
                                }
                                continue;
                            }
                            if (var496 == 1111) {
                                --var6;
                                var68.field685 = ~class10.field141[var6] == -2;
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (var496 == 1112) {
                                --var7;
                                String var70 = class78.field1248[var7];
                                if (!var70.equals(var68.field595)) {
                                    var68.field595 = var70;
                                    class280.method1886(var68, 32);
                                }
                                if (~var68.field661 == 0) {
                                    class211.method1455(var68.field648, !arg2);
                                }
                                continue;
                            }
                            if (~var496 == -1114) {
                                --var6;
                                var68.field699 = class10.field141[var6];
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (var496 == 1114) {
                                var6 -= 3;
                                var68.field603 = class10.field141[var6];
                                var68.field625 = class10.field141[var6 + 1];
                                var68.field613 = class10.field141[var6 - -2];
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (~var496 == -1116) {
                                --var6;
                                var68.field596 = ~class10.field141[var6] == -2;
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (var496 == 1116) {
                                --var6;
                                var68.field564 = class10.field141[var6];
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (~var496 == -1118) {
                                --var6;
                                var68.field666 = class10.field141[var6];
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (var496 == 1118) {
                                --var6;
                                var68.field588 = ~class10.field141[var6] == -2;
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (var496 == 1119) {
                                --var6;
                                var68.field712 = ~class10.field141[var6] == -2;
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (~var496 == -1121) {
                                var6 -= 2;
                                var68.field674 = class10.field141[var6];
                                var68.field602 = class10.field141[var6 - -1];
                                class280.method1886(var68, 32);
                                if (var68.field709 == 0) {
                                    class195.method1330(var68, -1104623792, false);
                                }
                                continue;
                            }
                            if (~var496 == -1122) {
                                var6 -= 2;
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (~var496 == -1123) {
                                --var6;
                                var68.field557 = ~class10.field141[var6] == -2;
                                class280.method1886(var68, 32);
                                continue;
                            }
                            if (~var496 == -1124) {
                                --var6;
                                var68.field702 = class10.field141[var6];
                                class280.method1886(var68, 32);
                                if (var68.field661 == -1) {
                                    class190.method1297(var68.field648, -30);
                                }
                                continue;
                            }
                        } else if (~var496 <= -1201 && var496 < 1300 || ~var496 <= -2201 && var496 < 2300) {
                            class36 var480;
                            if (~var496 > -2001) {
                                var480 = !var46 ? class113.field1887 : class48.field852;
                            } else {
                                var496 -= 1000;
                                --var6;
                                var480 = class64.method455(class10.field141[var6], 592427152);
                            }
                            class280.method1886(var480, 32);
                            if (~var496 == -1201 || var496 == 1205) {
                                var6 -= 2;
                                int var481 = class10.field141[var6];
                                int var482 = class10.field141[var6 - -1];
                                if (~var480.field661 == 0) {
                                    class124.method895(-127, var480.field648);
                                    class190.method1297(var480.field648, -128);
                                    class122.method879(var480.field648, 25186);
                                }
                                if (var481 == -1) {
                                    var480.field598 = -1;
                                    var480.field583 = -1;
                                    var480.field565 = 1;
                                } else {
                                    var480.field583 = var481;
                                    var480.field655 = var482;
                                    class12 var483 = class83.method595(var481, -77);
                                    var480.field647 = var483.field216;
                                    var480.field652 = var483.field161;
                                    var480.field619 = var483.field202;
                                    var480.field668 = var483.field184;
                                    var480.field702 = var483.field200;
                                    var480.field567 = var483.field178;
                                    if (~var480.field610 < -1) {
                                        var480.field702 = var480.field702 * 32 / var480.field610;
                                    } else if (var480.field711 > 0) {
                                        var480.field702 = var480.field702 * 32 / var480.field711;
                                    }
                                    if (~var496 == -1206) {
                                        var480.field636 = false;
                                    } else {
                                        var480.field636 = true;
                                    }
                                }
                                continue;
                            }
                            if (~var496 == -1202) {
                                var480.field565 = 2;
                                --var6;
                                var480.field598 = class10.field141[var6];
                                if (var480.field661 == -1) {
                                    class51.method395(-25266, var480.field648);
                                }
                                continue;
                            }
                            if (var496 == 1202) {
                                var480.field565 = 3;
                                var480.field598 = class167.field2655.field528.method799(16482);
                                if (~var480.field661 == 0) {
                                    class51.method395(-25266, var480.field648);
                                }
                                continue;
                            }
                            if (var496 == 1203) {
                                var480.field565 = 6;
                                --var6;
                                var480.field598 = class10.field141[var6];
                                if (var480.field661 == -1) {
                                    class51.method395(-25266, var480.field648);
                                }
                                continue;
                            }
                            if (var496 == 1204) {
                                var480.field565 = 5;
                                --var6;
                                var480.field598 = class10.field141[var6];
                                if (var480.field661 == -1) {
                                    class51.method395(-25266, var480.field648);
                                }
                                continue;
                            }
                        } else if (~var496 <= -1301 && ~var496 > -1401 || var496 >= 2300 && ~var496 > -2401) {
                            class36 var474;
                            if (var496 >= 2000) {
                                var496 -= 1000;
                                --var6;
                                var474 = class64.method455(class10.field141[var6], 592427152);
                            } else {
                                var474 = !var46 ? class113.field1887 : class48.field852;
                            }
                            if (var496 == 1300) {
                                --var6;
                                int var475 = -1 + class10.field141[var6];
                                if (var475 >= 0 && var475 <= 9) {
                                    --var7;
                                    var474.method299(1, class78.field1248[var7], var475);
                                    continue;
                                }
                                --var7;
                                continue;
                            }
                            if (var496 == 1301) {
                                var6 -= 2;
                                int var476 = class10.field141[var6];
                                int var477 = class10.field141[var6 + 1];
                                var474.field600 = class230.method1612(1, var477, var476);
                                continue;
                            }
                            if (~var496 == -1303) {
                                --var6;
                                var474.field644 = class10.field141[var6] == 1;
                                continue;
                            }
                            if (var496 == 1303) {
                                --var6;
                                var474.field612 = class10.field141[var6];
                                continue;
                            }
                            if (~var496 == -1305) {
                                --var6;
                                var474.field574 = class10.field141[var6];
                                continue;
                            }
                            if (~var496 == -1306) {
                                --var7;
                                var474.field671 = class78.field1248[var7];
                                continue;
                            }
                            if (var496 == 1306) {
                                --var7;
                                var474.field566 = class78.field1248[var7];
                                continue;
                            }
                            if (var496 == 1307) {
                                var474.field663 = null;
                                continue;
                            }
                            if (~var496 == -1309) {
                                --var6;
                                var474.field682 = class10.field141[var6];
                                --var6;
                                var474.field608 = class10.field141[var6];
                                continue;
                            }
                            if (var496 == 1309) {
                                --var6;
                                int var478 = class10.field141[var6];
                                --var6;
                                int var479 = class10.field141[var6];
                                if (var479 >= 1 && ~var479 >= -11) {
                                    var474.method302(var478, var479 - 1, (byte) -128);
                                }
                                continue;
                            }
                        } else {
                            if (var496 >= 1400 && ~var496 > -1501 || var496 >= 2400 && var496 < 2500) {
                                class36 var71;
                                if (~var496 > -2001) {
                                    var71 = !var46 ? class113.field1887 : class48.field852;
                                } else {
                                    var496 -= 1000;
                                    --var6;
                                    var71 = class64.method455(class10.field141[var6], 592427152);
                                }
                                --var7;
                                String var72 = class78.field1248[var7];
                                int[] var73 = null;
                                if (~var72.length() < -1 && ~var72.charAt(var72.length() - 1) == -90) {
                                    --var6;
                                    int var74 = class10.field141[var6];
                                    if (var74 > 0) {
                                        var73 = new int[var74];
                                        while (~(var74--) < -1) {
                                            --var6;
                                            var73[var74] = class10.field141[var6];
                                        }
                                    }
                                    var72 = var72.substring(0, -1 + var72.length());
                                }
                                Object[] var75 = new Object[var72.length() + 1];
                                for (int var76 = var75.length + -1; var76 >= 1; --var76) {
                                    if (~var72.charAt(var76 + -1) != -116) {
                                        --var6;
                                        var75[var76] = new Integer(class10.field141[var6]);
                                    } else {
                                        --var7;
                                        var75[var76] = class78.field1248[var7];
                                    }
                                }
                                --var6;
                                int var77 = class10.field141[var6];
                                if (~var77 == 0) {
                                    var75 = null;
                                } else {
                                    var75[0] = new Integer(var77);
                                }
                                if (var496 != 1400) {
                                    if (~var496 == -1402) {
                                        var71.field701 = var75;
                                    } else if (~var496 == -1403) {
                                        var71.field687 = var75;
                                    } else if (var496 != 1403) {
                                        if (var496 == 1404) {
                                            var71.field643 = var75;
                                        } else if (~var496 == -1406) {
                                            var71.field679 = var75;
                                        } else if (~var496 != -1407) {
                                            if (~var496 == -1408) {
                                                var71.field646 = var75;
                                                var71.field677 = var73;
                                            } else if (~var496 == -1409) {
                                                var71.field675 = var75;
                                            } else if (var496 != 1409) {
                                                if (~var496 == -1411) {
                                                    var71.field703 = var75;
                                                } else if (var496 != 1411) {
                                                    if (~var496 == -1413) {
                                                        var71.field716 = var75;
                                                    } else if (var496 != 1414) {
                                                        if (~var496 != -1416) {
                                                            if (~var496 != -1417) {
                                                                if (~var496 == -1418) {
                                                                    var71.field616 = var75;
                                                                } else if (var496 == 1418) {
                                                                    var71.field577 = var75;
                                                                } else if (~var496 == -1420) {
                                                                    var71.field618 = var75;
                                                                } else if (var496 != 1420) {
                                                                    if (var496 != 1421) {
                                                                        if (~var496 == -1423) {
                                                                            var71.field624 = var75;
                                                                        } else if (var496 == 1423) {
                                                                            var71.field620 = var75;
                                                                        } else if (~var496 != -1425) {
                                                                            if (var496 != 1425) {
                                                                                if (~var496 != -1427) {
                                                                                    if (var496 != 1427) {
                                                                                        if (var496 != 1428) {
                                                                                            if (var496 == 1429) {
                                                                                                var71.field629 = var73;
                                                                                                var71.field713 = var75;
                                                                                            }
                                                                                        } else {
                                                                                            var71.field622 = var73;
                                                                                            var71.field562 = var75;
                                                                                        }
                                                                                    } else {
                                                                                        var71.field609 = var75;
                                                                                    }
                                                                                } else {
                                                                                    var71.field554 = var75;
                                                                                }
                                                                            } else {
                                                                                var71.field614 = var75;
                                                                            }
                                                                        } else {
                                                                            var71.field688 = var75;
                                                                        }
                                                                    } else {
                                                                        var71.field627 = var75;
                                                                    }
                                                                } else {
                                                                    var71.field615 = var75;
                                                                }
                                                            } else {
                                                                var71.field592 = var75;
                                                            }
                                                        } else {
                                                            var71.field623 = var75;
                                                            var71.field680 = var73;
                                                        }
                                                    } else {
                                                        var71.field696 = var73;
                                                        var71.field582 = var75;
                                                    }
                                                } else {
                                                    var71.field581 = var75;
                                                }
                                            } else {
                                                var71.field672 = var75;
                                            }
                                        } else {
                                            var71.field657 = var75;
                                        }
                                    } else {
                                        var71.field665 = var75;
                                    }
                                } else {
                                    var71.field697 = var75;
                                }
                                var71.field626 = true;
                                continue;
                            }
                            if (~var496 > -1601) {
                                class36 var78 = !var46 ? class113.field1887 : class48.field852;
                                if (var496 == 1500) {
                                    class10.field141[var6++] = var78.field606;
                                    continue;
                                }
                                if (var496 == 1501) {
                                    class10.field141[var6++] = var78.field607;
                                    continue;
                                }
                                if (~var496 == -1503) {
                                    class10.field141[var6++] = var78.field642;
                                    continue;
                                }
                                if (~var496 == -1504) {
                                    class10.field141[var6++] = var78.field676;
                                    continue;
                                }
                                if (~var496 == -1505) {
                                    class10.field141[var6++] = var78.field667 ? 1 : 0;
                                    continue;
                                }
                                if (var496 == 1505) {
                                    class10.field141[var6++] = var78.field632;
                                    continue;
                                }
                            } else if (var496 < 1700) {
                                class36 var79 = !var46 ? class113.field1887 : class48.field852;
                                if (var496 == 1600) {
                                    class10.field141[var6++] = var79.field630;
                                    continue;
                                }
                                if (var496 == 1601) {
                                    class10.field141[var6++] = var79.field571;
                                    continue;
                                }
                                if (var496 == 1602) {
                                    class78.field1248[var7++] = var79.field595;
                                    continue;
                                }
                                if (~var496 == -1604) {
                                    class10.field141[var6++] = var79.field674;
                                    continue;
                                }
                                if (var496 == 1604) {
                                    class10.field141[var6++] = var79.field602;
                                    continue;
                                }
                                if (var496 == 1605) {
                                    class10.field141[var6++] = var79.field702;
                                    continue;
                                }
                                if (~var496 == -1607) {
                                    class10.field141[var6++] = var79.field647;
                                    continue;
                                }
                                if (var496 == 1607) {
                                    class10.field141[var6++] = var79.field668;
                                    continue;
                                }
                                if (var496 == 1608) {
                                    class10.field141[var6++] = var79.field567;
                                    continue;
                                }
                                if (var496 == 1609) {
                                    class10.field141[var6++] = var79.field640;
                                    continue;
                                }
                                if (~var496 == -1611) {
                                    class10.field141[var6++] = var79.field619;
                                    continue;
                                }
                                if (~var496 == -1612) {
                                    class10.field141[var6++] = var79.field652;
                                    continue;
                                }
                                if (~var496 == -1613) {
                                    class10.field141[var6++] = var79.field561;
                                    continue;
                                }
                            } else if (var496 >= 1800) {
                                if (var496 >= 1900) {
                                    if (~var496 <= -2601) {
                                        if (~var496 <= -2701) {
                                            if (~var496 > -2801) {
                                                if (~var496 == -2701) {
                                                    --var6;
                                                    class36 var80 = class64.method455(class10.field141[var6], 592427152);
                                                    class10.field141[var6++] = var80.field583;
                                                    continue;
                                                }
                                                if (~var496 == -2702) {
                                                    --var6;
                                                    class36 var81 = class64.method455(class10.field141[var6], 592427152);
                                                    if (~var81.field583 == 0) {
                                                        class10.field141[var6++] = 0;
                                                    } else {
                                                        class10.field141[var6++] = var81.field655;
                                                    }
                                                    continue;
                                                }
                                                if (var496 == 2702) {
                                                    --var6;
                                                    int var82 = class10.field141[var6];
                                                    class258 var83 = (class258) class128.field2062.method1400((long) var82, true);
                                                    if (var83 == null) {
                                                        class10.field141[var6++] = 0;
                                                    } else {
                                                        class10.field141[var6++] = 1;
                                                    }
                                                    continue;
                                                }
                                                if (~var496 == -2704) {
                                                    --var6;
                                                    class36 var84 = class64.method455(class10.field141[var6], 592427152);
                                                    if (var84.field658 == null) {
                                                        class10.field141[var6++] = 0;
                                                        continue;
                                                    }
                                                    int var85 = var84.field658.length;
                                                    for (int var86 = 0; ~var84.field658.length < ~var86; ++var86) {
                                                        if (var84.field658[var86] == null) {
                                                            var85 = var86;
                                                            break;
                                                        }
                                                    }
                                                    class10.field141[var6++] = var85;
                                                    continue;
                                                }
                                                if (var496 == 2704 || var496 == 2705) {
                                                    var6 -= 2;
                                                    int var87 = class10.field141[var6];
                                                    int var88 = class10.field141[var6 + 1];
                                                    class258 var89 = (class258) class128.field2062.method1400((long) var87, !arg2);
                                                    if (var89 != null && ~var89.field4100 == ~var88) {
                                                        class10.field141[var6++] = 1;
                                                    } else {
                                                        class10.field141[var6++] = 0;
                                                    }
                                                    continue;
                                                }
                                            } else if (~var496 > -2901) {
                                                --var6;
                                                class36 var90 = class64.method455(class10.field141[var6], 592427152);
                                                if (~var496 == -2801) {
                                                    class10.field141[var6++] = client.method1093(var90).method606(1596737886);
                                                    continue;
                                                }
                                                if (var496 == 2801) {
                                                    --var6;
                                                    int var91 = class10.field141[var6];
                                                    int var497 = var91 - 1;
                                                    if (var90.field663 != null && ~var497 > ~var90.field663.length && var90.field663[var497] != null) {
                                                        class78.field1248[var7++] = var90.field663[var497];
                                                        continue;
                                                    }
                                                    class78.field1248[var7++] = "";
                                                    continue;
                                                }
                                                if (~var496 == -2803) {
                                                    if (var90.field671 == null) {
                                                        class78.field1248[var7++] = "";
                                                    } else {
                                                        class78.field1248[var7++] = var90.field671;
                                                    }
                                                    continue;
                                                }
                                            } else if (var496 < 3200) {
                                                if (var496 == 3100) {
                                                    --var7;
                                                    String var92 = class78.field1248[var7];
                                                    class226.method1588("", 0, (byte) -103, var92);
                                                    continue;
                                                }
                                                if (var496 == 3101) {
                                                    var6 -= 2;
                                                    class139.method965(class167.field2655, class10.field141[var6 + 1], class10.field141[var6], (byte) -58);
                                                    continue;
                                                }
                                                if (var496 == 3103) {
                                                    class273.method1845((byte) -99);
                                                    continue;
                                                }
                                                if (~var496 == -3105) {
                                                    ++class92.field1518;
                                                    --var7;
                                                    String var93 = class78.field1248[var7];
                                                    int var94 = 0;
                                                    if (class167.method1149(var93, 16013)) {
                                                        var94 = class184.method1245(var93, 10);
                                                    }
                                                    class68.field1113.method534((byte) 87, 54);
                                                    class68.field1113.method1529((byte) 121, var94);
                                                    continue;
                                                }
                                                if (~var496 == -3106) {
                                                    --var7;
                                                    String var95 = class78.field1248[var7];
                                                    ++class29.field455;
                                                    class68.field1113.method534((byte) 98, 216);
                                                    class68.field1113.method1502((byte) -92, class74.method522((byte) -98, var95));
                                                    continue;
                                                }
                                                if (~var496 == -3107) {
                                                    ++class277.field4367;
                                                    --var7;
                                                    String var96 = class78.field1248[var7];
                                                    class68.field1113.method534((byte) 77, 219);
                                                    class68.field1113.method1548(-494964184, var96.length() + 1);
                                                    class68.field1113.method1563(var96, 124);
                                                    continue;
                                                }
                                                if (~var496 == -3108) {
                                                    --var6;
                                                    int var97 = class10.field141[var6];
                                                    --var7;
                                                    String var98 = class78.field1248[var7];
                                                    class61.method438(var98, var97, 0);
                                                    continue;
                                                }
                                                if (var496 == 3108) {
                                                    var6 -= 3;
                                                    int var99 = class10.field141[var6 - -1];
                                                    int var100 = class10.field141[var6];
                                                    int var101 = class10.field141[var6 + 2];
                                                    class36 var102 = class64.method455(var101, 592427152);
                                                    class47.method381(var99, var102, var100, (byte) 18);
                                                    continue;
                                                }
                                                if (~var496 == -3110) {
                                                    var6 -= 2;
                                                    int var103 = class10.field141[var6];
                                                    int var104 = class10.field141[var6 - -1];
                                                    class36 var105 = var46 ? class48.field852 : class113.field1887;
                                                    class47.method381(var104, var105, var103, (byte) 18);
                                                    continue;
                                                }
                                                if (~var496 == -3111) {
                                                    ++class288.field4551;
                                                    --var6;
                                                    int var106 = class10.field141[var6];
                                                    class68.field1113.method534((byte) 110, 41);
                                                    class68.field1113.method1554(var106, (byte) 89);
                                                    continue;
                                                }
                                            } else if (var496 < 3300) {
                                                if (~var496 == -3201) {
                                                    var6 -= 3;
                                                    class212.method1460(class10.field141[var6 - -2], -44, class10.field141[var6 + 1], class10.field141[var6]);
                                                    continue;
                                                }
                                                if (var496 == 3201) {
                                                    --var6;
                                                    class235.method1637(class10.field141[var6], (byte) -128);
                                                    continue;
                                                }
                                                if (~var496 == -3203) {
                                                    var6 -= 2;
                                                    class220.method1498(class10.field141[var6 + 1], 0, class10.field141[var6]);
                                                    continue;
                                                }
                                            } else if (var496 < 3400) {
                                                if (var496 == 3300) {
                                                    class10.field141[var6++] = class222.field3682;
                                                    continue;
                                                }
                                                if (var496 == 3301) {
                                                    var6 -= 2;
                                                    int var107 = class10.field141[var6];
                                                    int var108 = class10.field141[var6 + 1];
                                                    class10.field141[var6++] = class238.method1653(var107, -1, var108);
                                                    continue;
                                                }
                                                if (var496 == 3302) {
                                                    var6 -= 2;
                                                    int var109 = class10.field141[var6];
                                                    int var110 = class10.field141[var6 - -1];
                                                    class10.field141[var6++] = class9.method70(var109, 11594, var110);
                                                    continue;
                                                }
                                                if (~var496 == -3304) {
                                                    var6 -= 2;
                                                    int var111 = class10.field141[var6 + 1];
                                                    int var112 = class10.field141[var6];
                                                    class10.field141[var6++] = class100.method737(var111, -35, var112);
                                                    continue;
                                                }
                                                if (var496 == 3304) {
                                                    --var6;
                                                    int var113 = class10.field141[var6];
                                                    class10.field141[var6++] = class105.method759(true, var113).field3919;
                                                    continue;
                                                }
                                                if (~var496 == -3306) {
                                                    --var6;
                                                    int var114 = class10.field141[var6];
                                                    class10.field141[var6++] = class235.field3834[var114];
                                                    continue;
                                                }
                                                if (~var496 == -3307) {
                                                    --var6;
                                                    int var115 = class10.field141[var6];
                                                    class10.field141[var6++] = class189.field3064[var115];
                                                    continue;
                                                }
                                                if (var496 == 3307) {
                                                    --var6;
                                                    int var116 = class10.field141[var6];
                                                    class10.field141[var6++] = class167.field2660[var116];
                                                    continue;
                                                }
                                                if (var496 == 3308) {
                                                    int var117 = class250.field3980;
                                                    int var118 = (class167.field2655.field3389 >> 7) + class50.field884;
                                                    int var119 = (class167.field2655.field3341 >> 7) - -class214.field3501;
                                                    class10.field141[var6++] = (var117 << 28) - -(var118 << 14) + var119;
                                                    continue;
                                                }
                                                if (var496 == 3309) {
                                                    --var6;
                                                    int var120 = class10.field141[var6];
                                                    class10.field141[var6++] = class202.method1393(268425721, var120) >> 14;
                                                    continue;
                                                }
                                                if (~var496 == -3311) {
                                                    --var6;
                                                    int var121 = class10.field141[var6];
                                                    class10.field141[var6++] = var121 >> 28;
                                                    continue;
                                                }
                                                if (~var496 == -3312) {
                                                    --var6;
                                                    int var122 = class10.field141[var6];
                                                    class10.field141[var6++] = class202.method1393(16383, var122);
                                                    continue;
                                                }
                                                if (var496 == 3312) {
                                                    class10.field141[var6++] = class1.field31 ? 1 : 0;
                                                    continue;
                                                }
                                                if (var496 == 3313) {
                                                    var6 -= 2;
                                                    int var123 = class10.field141[var6] + 32768;
                                                    int var124 = class10.field141[var6 + 1];
                                                    class10.field141[var6++] = class238.method1653(var123, -1, var124);
                                                    continue;
                                                }
                                                if (var496 == 3314) {
                                                    var6 -= 2;
                                                    int var125 = class10.field141[var6] + 32768;
                                                    int var126 = class10.field141[var6 + 1];
                                                    class10.field141[var6++] = class9.method70(var125, 11594, var126);
                                                    continue;
                                                }
                                                if (var496 == 3315) {
                                                    var6 -= 2;
                                                    int var127 = class10.field141[var6 + 1];
                                                    int var128 = class10.field141[var6] + 32768;
                                                    class10.field141[var6++] = class100.method737(var127, -35, var128);
                                                    continue;
                                                }
                                                if (var496 == 3316) {
                                                    if (class144.field2313 < 2) {
                                                        class10.field141[var6++] = 0;
                                                    } else {
                                                        class10.field141[var6++] = class144.field2313;
                                                    }
                                                    continue;
                                                }
                                                if (~var496 == -3318) {
                                                    class10.field141[var6++] = class234.field3820;
                                                    continue;
                                                }
                                                if (var496 == 3318) {
                                                    class10.field141[var6++] = class4.field46;
                                                    continue;
                                                }
                                                if (~var496 == -3322) {
                                                    class10.field141[var6++] = class107.field1762;
                                                    continue;
                                                }
                                                if (~var496 == -3323) {
                                                    class10.field141[var6++] = class168.field2669;
                                                    continue;
                                                }
                                                if (~var496 == -3324) {
                                                    if (class229.field3783 >= 5 && ~class229.field3783 >= -10) {
                                                        class10.field141[var6++] = 1;
                                                        continue;
                                                    }
                                                    class10.field141[var6++] = 0;
                                                    continue;
                                                }
                                                if (var496 == 3324) {
                                                    if (class229.field3783 >= 5 && class229.field3783 <= 9) {
                                                        class10.field141[var6++] = class229.field3783;
                                                        continue;
                                                    }
                                                    class10.field141[var6++] = 0;
                                                    continue;
                                                }
                                                if (var496 == 3325) {
                                                    class10.field141[var6++] = class95.field1560 ? 1 : 0;
                                                    continue;
                                                }
                                                if (~var496 == -3327) {
                                                    class10.field141[var6++] = class167.field2655.field519;
                                                    continue;
                                                }
                                                if (var496 == 3327) {
                                                    class10.field141[var6++] = !class167.field2655.field528.field1809 ? 0 : 1;
                                                    continue;
                                                }
                                                if (var496 == 3328) {
                                                    class10.field141[var6++] = class215.field3516 && !class74.field1201 ? 1 : 0;
                                                    continue;
                                                }
                                                if (var496 == 3329) {
                                                    class10.field141[var6++] = !class9.field134 ? 0 : 1;
                                                    continue;
                                                }
                                                if (~var496 == -3331) {
                                                    --var6;
                                                    int var129 = class10.field141[var6];
                                                    class10.field141[var6++] = class136.method960(var129, (byte) 127);
                                                    continue;
                                                }
                                                if (var496 == 3331) {
                                                    var6 -= 2;
                                                    int var130 = class10.field141[var6 + 1];
                                                    int var131 = class10.field141[var6];
                                                    class10.field141[var6++] = class247.method1696(var130, false, (byte) -96, var131);
                                                    continue;
                                                }
                                                if (~var496 == -3333) {
                                                    var6 -= 2;
                                                    int var132 = class10.field141[var6];
                                                    int var133 = class10.field141[var6 - -1];
                                                    class10.field141[var6++] = class247.method1696(var133, true, (byte) -116, var132);
                                                    continue;
                                                }
                                                if (var496 == 3333) {
                                                    class10.field141[var6++] = class285.field4513;
                                                    continue;
                                                }
                                                if (var496 == 3335) {
                                                    class10.field141[var6++] = class135.field2192;
                                                    continue;
                                                }
                                                if (~var496 == -3337) {
                                                    var6 -= 4;
                                                    int var134 = class10.field141[var6];
                                                    int var135 = class10.field141[var6 - -1];
                                                    int var136 = class10.field141[var6 + 2];
                                                    int var137 = (var135 << 14) + var134;
                                                    int var138 = (var136 << 28) + var137;
                                                    int var139 = class10.field141[var6 + 3];
                                                    int var140 = var138 + var139;
                                                    class10.field141[var6++] = var140;
                                                    continue;
                                                }
                                                if (var496 == 3337) {
                                                    class10.field141[var6++] = class54.field926;
                                                    continue;
                                                }
                                            } else if (~var496 <= -3501) {
                                                if (var496 < 3700) {
                                                    if (var496 == 3600) {
                                                        if (class182.field2867 == 0) {
                                                            class10.field141[var6++] = -2;
                                                        } else if (~class182.field2867 == -2) {
                                                            class10.field141[var6++] = -1;
                                                        } else {
                                                            class10.field141[var6++] = class239.field3875;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var496 == -3602) {
                                                        --var6;
                                                        int var141 = class10.field141[var6];
                                                        if (~class182.field2867 == -3 && var141 < class239.field3875) {
                                                            class78.field1248[var7++] = class86.field1379[var141];
                                                            continue;
                                                        }
                                                        class78.field1248[var7++] = "";
                                                        continue;
                                                    }
                                                    if (~var496 == -3603) {
                                                        --var6;
                                                        int var142 = class10.field141[var6];
                                                        if (class182.field2867 == 2 && class239.field3875 > var142) {
                                                            class10.field141[var6++] = class141.field2288[var142];
                                                            continue;
                                                        }
                                                        class10.field141[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (var496 == 3603) {
                                                        --var6;
                                                        int var143 = class10.field141[var6];
                                                        if (class182.field2867 == 2 && ~class239.field3875 < ~var143) {
                                                            class10.field141[var6++] = class137.field2263[var143];
                                                            continue;
                                                        }
                                                        class10.field141[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (var496 == 3604) {
                                                        --var7;
                                                        String var144 = class78.field1248[var7];
                                                        --var6;
                                                        int var145 = class10.field141[var6];
                                                        class68.method471(-109, var145, var144);
                                                        continue;
                                                    }
                                                    if (~var496 == -3606) {
                                                        --var7;
                                                        String var146 = class78.field1248[var7];
                                                        class61.method440(-9935, class74.method522((byte) -75, var146));
                                                        continue;
                                                    }
                                                    if (~var496 == -3607) {
                                                        --var7;
                                                        String var147 = class78.field1248[var7];
                                                        class64.method450(-5666, class74.method522((byte) -100, var147));
                                                        continue;
                                                    }
                                                    if (var496 == 3607) {
                                                        --var7;
                                                        String var148 = class78.field1248[var7];
                                                        class128.method910((byte) -71, class74.method522((byte) -111, var148));
                                                        continue;
                                                    }
                                                    if (var496 == 3608) {
                                                        --var7;
                                                        String var149 = class78.field1248[var7];
                                                        class222.method1568(1, class74.method522((byte) -105, var149));
                                                        continue;
                                                    }
                                                    if (~var496 == -3610) {
                                                        --var7;
                                                        String var150 = class78.field1248[var7];
                                                        if (var150.startsWith("<img=0>") || var150.startsWith("<img=1>")) {
                                                            var150 = var150.substring(7);
                                                        }
                                                        class10.field141[var6++] = class133.method936(2513, var150) ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (var496 == 3610) {
                                                        --var6;
                                                        int var151 = class10.field141[var6];
                                                        if (class182.field2867 == 2 && ~var151 > ~class239.field3875) {
                                                            class78.field1248[var7++] = class239.field3878[var151];
                                                            continue;
                                                        }
                                                        class78.field1248[var7++] = "";
                                                        continue;
                                                    }
                                                    if (var496 == 3611) {
                                                        if (class197.field3145 == null) {
                                                            class78.field1248[var7++] = "";
                                                        } else {
                                                            class78.field1248[var7++] = class121.method875(false, class197.field3145);
                                                        }
                                                        continue;
                                                    }
                                                    if (var496 == 3612) {
                                                        if (class197.field3145 == null) {
                                                            class10.field141[var6++] = 0;
                                                        } else {
                                                            class10.field141[var6++] = class206.field3301;
                                                        }
                                                        continue;
                                                    }
                                                    if (~var496 == -3614) {
                                                        --var6;
                                                        int var152 = class10.field141[var6];
                                                        if (class197.field3145 != null && ~class206.field3301 < ~var152) {
                                                            class78.field1248[var7++] = class121.method875(false, class110.field1819[var152].field1386);
                                                            continue;
                                                        }
                                                        class78.field1248[var7++] = "";
                                                        continue;
                                                    }
                                                    if (var496 == 3614) {
                                                        --var6;
                                                        int var153 = class10.field141[var6];
                                                        if (class197.field3145 != null && var153 < class206.field3301) {
                                                            class10.field141[var6++] = class110.field1819[var153].field1387;
                                                            continue;
                                                        }
                                                        class10.field141[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (var496 == 3615) {
                                                        --var6;
                                                        int var154 = class10.field141[var6];
                                                        if (class197.field3145 != null && ~var154 > ~class206.field3301) {
                                                            class10.field141[var6++] = class110.field1819[var154].field1389;
                                                            continue;
                                                        }
                                                        class10.field141[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (~var496 == -3617) {
                                                        class10.field141[var6++] = class252.field4004;
                                                        continue;
                                                    }
                                                    if (~var496 == -3618) {
                                                        --var7;
                                                        String var155 = class78.field1248[var7];
                                                        class149.method1024(var155, true);
                                                        continue;
                                                    }
                                                    if (var496 == 3618) {
                                                        class10.field141[var6++] = class36.field552;
                                                        continue;
                                                    }
                                                    if (var496 == 3619) {
                                                        --var7;
                                                        String var156 = class78.field1248[var7];
                                                        class221.method1540(-232896392, class74.method522((byte) -118, var156));
                                                        continue;
                                                    }
                                                    if (~var496 == -3621) {
                                                        class231.method1622(20);
                                                        continue;
                                                    }
                                                    if (~var496 == -3622) {
                                                        if (class182.field2867 != 0) {
                                                            class10.field141[var6++] = class185.field2910;
                                                        } else {
                                                            class10.field141[var6++] = -1;
                                                        }
                                                        continue;
                                                    }
                                                    if (var496 == 3622) {
                                                        --var6;
                                                        int var157 = class10.field141[var6];
                                                        if (~class182.field2867 != -1 && class185.field2910 > var157) {
                                                            class78.field1248[var7++] = class118.method862(true, class183.field2884[var157]);
                                                            continue;
                                                        }
                                                        class78.field1248[var7++] = "";
                                                        continue;
                                                    }
                                                    if (var496 == 3623) {
                                                        --var7;
                                                        String var158 = class78.field1248[var7];
                                                        if (var158.startsWith("<img=0>") || var158.startsWith("<img=1>")) {
                                                            var158 = var158.substring(7);
                                                        }
                                                        class10.field141[var6++] = !class112.method814(var158, (byte) -113) ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var496 == 3624) {
                                                        --var6;
                                                        int var159 = class10.field141[var6];
                                                        if (class110.field1819 != null && var159 < class206.field3301 && class110.field1819[var159].field1386.equalsIgnoreCase(class167.field2655.field525)) {
                                                            class10.field141[var6++] = 1;
                                                            continue;
                                                        }
                                                        class10.field141[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (~var496 == -3626) {
                                                        if (class135.field2226 != null) {
                                                            class78.field1248[var7++] = class121.method875(false, class135.field2226);
                                                        } else {
                                                            class78.field1248[var7++] = "";
                                                        }
                                                        continue;
                                                    }
                                                    if (var496 == 3626) {
                                                        --var6;
                                                        int var160 = class10.field141[var6];
                                                        if (class197.field3145 != null && ~var160 > ~class206.field3301) {
                                                            class78.field1248[var7++] = class110.field1819[var160].field1382;
                                                            continue;
                                                        }
                                                        class78.field1248[var7++] = "";
                                                        continue;
                                                    }
                                                    if (var496 == 3627) {
                                                        --var6;
                                                        int var161 = class10.field141[var6];
                                                        if (class182.field2867 == 2 && var161 >= 0 && var161 < class239.field3875) {
                                                            class10.field141[var6++] = class197.field3132[var161] ? 1 : 0;
                                                            continue;
                                                        }
                                                        class10.field141[var6++] = 0;
                                                        continue;
                                                    }
                                                    if (~var496 == -3629) {
                                                        --var7;
                                                        String var162 = class78.field1248[var7];
                                                        if (var162.startsWith("<img=0>") || var162.startsWith("<img=1>")) {
                                                            var162 = var162.substring(7);
                                                        }
                                                        class10.field141[var6++] = class63.method445(var162, -19136);
                                                        continue;
                                                    }
                                                    if (var496 == 3629) {
                                                        class10.field141[var6++] = class254.field4043;
                                                        continue;
                                                    }
                                                } else if (~var496 <= -4001) {
                                                    if (var496 >= 4100) {
                                                        if (~var496 > -4201) {
                                                            if (var496 == 4100) {
                                                                --var7;
                                                                String var163 = class78.field1248[var7];
                                                                --var6;
                                                                int var164 = class10.field141[var6];
                                                                class78.field1248[var7++] = var163 + var164;
                                                                continue;
                                                            }
                                                            if (var496 == 4101) {
                                                                var7 -= 2;
                                                                String var165 = class78.field1248[var7];
                                                                String var166 = class78.field1248[var7 + 1];
                                                                class78.field1248[var7++] = var165 + var166;
                                                                continue;
                                                            }
                                                            if (var496 == 4102) {
                                                                --var7;
                                                                String var167 = class78.field1248[var7];
                                                                --var6;
                                                                int var168 = class10.field141[var6];
                                                                class78.field1248[var7++] = var167 + class56.method417(true, var168, -3530);
                                                                continue;
                                                            }
                                                            if (var496 == 4103) {
                                                                --var7;
                                                                String var169 = class78.field1248[var7];
                                                                class78.field1248[var7++] = var169.toLowerCase();
                                                                continue;
                                                            }
                                                            if (~var496 == -4105) {
                                                                --var6;
                                                                int var170 = class10.field141[var6];
                                                                long var171 = ((long) var170 + 11745L) * 86400000L;
                                                                class67.field1107.setTime(new Date(var171));
                                                                int var173 = class67.field1107.get(5);
                                                                int var174 = class67.field1107.get(2);
                                                                int var175 = class67.field1107.get(1);
                                                                class78.field1248[var7++] = var173 + "-" + class98.field1604[var174] + "-" + var175;
                                                                continue;
                                                            }
                                                            if (~var496 == -4106) {
                                                                var7 -= 2;
                                                                String var176 = class78.field1248[var7];
                                                                String var177 = class78.field1248[var7 + 1];
                                                                if (class167.field2655.field528 != null && class167.field2655.field528.field1809) {
                                                                    class78.field1248[var7++] = var177;
                                                                    continue;
                                                                }
                                                                class78.field1248[var7++] = var176;
                                                                continue;
                                                            }
                                                            if (var496 == 4106) {
                                                                --var6;
                                                                int var178 = class10.field141[var6];
                                                                class78.field1248[var7++] = Integer.toString(var178);
                                                                continue;
                                                            }
                                                            if (~var496 == -4108) {
                                                                var7 -= 2;
                                                                class10.field141[var6++] = class91.method689(class55.method411(class78.field1248[var7], class78.field1248[var7 + 1], class135.field2192, (byte) -56), 0);
                                                                continue;
                                                            }
                                                            if (var496 == 4108) {
                                                                --var7;
                                                                String var179 = class78.field1248[var7];
                                                                var6 -= 2;
                                                                int var180 = class10.field141[var6 + 1];
                                                                int var181 = class10.field141[var6];
                                                                class10.field141[var6++] = class175.method1190(var180, -94).method1810(var179, var181);
                                                                continue;
                                                            }
                                                            if (~var496 == -4110) {
                                                                var6 -= 2;
                                                                --var7;
                                                                String var182 = class78.field1248[var7];
                                                                int var183 = class10.field141[var6 + 1];
                                                                int var184 = class10.field141[var6];
                                                                class10.field141[var6++] = class175.method1190(var183, -79).method1814(var182, var184);
                                                                continue;
                                                            }
                                                            if (~var496 == -4111) {
                                                                var7 -= 2;
                                                                String var185 = class78.field1248[var7];
                                                                String var186 = class78.field1248[var7 - -1];
                                                                --var6;
                                                                if (~class10.field141[var6] != -2) {
                                                                    class78.field1248[var7++] = var186;
                                                                } else {
                                                                    class78.field1248[var7++] = var185;
                                                                }
                                                                continue;
                                                            }
                                                            if (~var496 == -4112) {
                                                                --var7;
                                                                String var187 = class78.field1248[var7];
                                                                class78.field1248[var7++] = class269.method1819(var187);
                                                                continue;
                                                            }
                                                            if (var496 == 4112) {
                                                                --var6;
                                                                int var188 = class10.field141[var6];
                                                                --var7;
                                                                String var189 = class78.field1248[var7];
                                                                if (var188 == -1) {
                                                                    throw new RuntimeException("null char");
                                                                }
                                                                class78.field1248[var7++] = var189 + (char) var188;
                                                                continue;
                                                            }
                                                            if (~var496 == -4114) {
                                                                --var6;
                                                                int var190 = class10.field141[var6];
                                                                class10.field141[var6++] = class9.method72((byte) 107, (char) var190) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var496 == -4115) {
                                                                --var6;
                                                                int var191 = class10.field141[var6];
                                                                class10.field141[var6++] = class131.method927((byte) 80, (char) var191) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var496 == -4116) {
                                                                --var6;
                                                                int var192 = class10.field141[var6];
                                                                class10.field141[var6++] = class231.method1618((byte) 123, (char) var192) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (var496 == 4116) {
                                                                --var6;
                                                                int var193 = class10.field141[var6];
                                                                class10.field141[var6++] = class253.method1725(false, (char) var193) ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (var496 == 4117) {
                                                                --var7;
                                                                String var194 = class78.field1248[var7];
                                                                if (var194 != null) {
                                                                    class10.field141[var6++] = var194.length();
                                                                } else {
                                                                    class10.field141[var6++] = 0;
                                                                }
                                                                continue;
                                                            }
                                                            if (var496 == 4118) {
                                                                var6 -= 2;
                                                                --var7;
                                                                String var195 = class78.field1248[var7];
                                                                int var196 = class10.field141[var6];
                                                                int var197 = class10.field141[var6 + 1];
                                                                class78.field1248[var7++] = var195.substring(var196, var197);
                                                                continue;
                                                            }
                                                            if (var496 == 4119) {
                                                                --var7;
                                                                String var198 = class78.field1248[var7];
                                                                boolean var199 = false;
                                                                StringBuffer var200 = new StringBuffer(var198.length());
                                                                for (int var201 = 0; var201 < var198.length(); ++var201) {
                                                                    char var202 = var198.charAt(var201);
                                                                    if (~var202 == -61) {
                                                                        var199 = true;
                                                                    } else if (var202 == '>') {
                                                                        var199 = false;
                                                                    } else if (!var199) {
                                                                        var200.append(var202);
                                                                    }
                                                                }
                                                                class78.field1248[var7++] = var200.toString();
                                                                continue;
                                                            }
                                                            if (var496 == 4120) {
                                                                var6 -= 2;
                                                                int var203 = class10.field141[var6];
                                                                --var7;
                                                                String var204 = class78.field1248[var7];
                                                                int var205 = class10.field141[var6 + 1];
                                                                class10.field141[var6++] = var204.indexOf(var203, var205);
                                                                continue;
                                                            }
                                                            if (var496 == 4121) {
                                                                var7 -= 2;
                                                                --var6;
                                                                int var206 = class10.field141[var6];
                                                                String var207 = class78.field1248[var7];
                                                                String var208 = class78.field1248[var7 + 1];
                                                                class10.field141[var6++] = var207.indexOf(var208, var206);
                                                                continue;
                                                            }
                                                            if (~var496 == -4123) {
                                                                --var6;
                                                                int var209 = class10.field141[var6];
                                                                class10.field141[var6++] = Character.toLowerCase((char) var209);
                                                                continue;
                                                            }
                                                            if (~var496 == -4124) {
                                                                --var6;
                                                                int var210 = class10.field141[var6];
                                                                class10.field141[var6++] = Character.toUpperCase((char) var210);
                                                                continue;
                                                            }
                                                            if (var496 == 4124) {
                                                                --var6;
                                                                boolean var211 = class10.field141[var6] != 0;
                                                                --var6;
                                                                int var212 = class10.field141[var6];
                                                                class78.field1248[var7++] = class236.method1642(var211, 10, (long) var212, class135.field2192, 0);
                                                                continue;
                                                            }
                                                        } else if (var496 < 4300) {
                                                            if (var496 == 4200) {
                                                                --var6;
                                                                int var213 = class10.field141[var6];
                                                                class78.field1248[var7++] = class83.method595(var213, -64).field174;
                                                                continue;
                                                            }
                                                            if (~var496 == -4202) {
                                                                var6 -= 2;
                                                                int var214 = class10.field141[var6];
                                                                int var215 = class10.field141[var6 - -1];
                                                                class12 var216 = class83.method595(var214, -120);
                                                                if (var215 >= 1 && var215 <= 5 && var216.field165[var215 - 1] != null) {
                                                                    class78.field1248[var7++] = var216.field165[var215 + -1];
                                                                    continue;
                                                                }
                                                                class78.field1248[var7++] = "";
                                                                continue;
                                                            }
                                                            if (~var496 == -4203) {
                                                                var6 -= 2;
                                                                int var217 = class10.field141[var6];
                                                                int var218 = class10.field141[var6 + 1];
                                                                class12 var219 = class83.method595(var217, -97);
                                                                if (var218 >= 1 && var218 <= 5 && var219.field222[var218 - 1] != null) {
                                                                    class78.field1248[var7++] = var219.field222[var218 + -1];
                                                                    continue;
                                                                }
                                                                class78.field1248[var7++] = "";
                                                                continue;
                                                            }
                                                            if (~var496 == -4204) {
                                                                --var6;
                                                                int var220 = class10.field141[var6];
                                                                class10.field141[var6++] = class83.method595(var220, -116).field213;
                                                                continue;
                                                            }
                                                            if (~var496 == -4205) {
                                                                --var6;
                                                                int var221 = class10.field141[var6];
                                                                class10.field141[var6++] = ~class83.method595(var221, -127).field223 == -2 ? 1 : 0;
                                                                continue;
                                                            }
                                                            if (~var496 == -4206) {
                                                                --var6;
                                                                int var222 = class10.field141[var6];
                                                                class12 var223 = class83.method595(var222, -65);
                                                                if (~var223.field206 == 0 && var223.field232 >= 0) {
                                                                    class10.field141[var6++] = var223.field232;
                                                                    continue;
                                                                }
                                                                class10.field141[var6++] = var222;
                                                                continue;
                                                            }
                                                            if (var496 == 4206) {
                                                                --var6;
                                                                int var224 = class10.field141[var6];
                                                                class12 var225 = class83.method595(var224, -86);
                                                                if (~var225.field206 <= -1 && ~var225.field232 <= -1) {
                                                                    class10.field141[var6++] = var225.field232;
                                                                    continue;
                                                                }
                                                                class10.field141[var6++] = var224;
                                                                continue;
                                                            }
                                                            if (~var496 == -4208) {
                                                                --var6;
                                                                int var226 = class10.field141[var6];
                                                                class10.field141[var6++] = !class83.method595(var226, -78).field203 ? 0 : 1;
                                                                continue;
                                                            }
                                                            if (var496 == 4208) {
                                                                var6 -= 2;
                                                                int var227 = class10.field141[var6 + 1];
                                                                int var228 = class10.field141[var6];
                                                                class39 var229 = class87.method632(var227, 118);
                                                                if (var229.method342(115)) {
                                                                    class78.field1248[var7++] = class83.method595(var228, -60).method85(var229.field728, 0, var227);
                                                                } else {
                                                                    class10.field141[var6++] = class83.method595(var228, -83).method94(var229.field735, (byte) -92, var227);
                                                                }
                                                                continue;
                                                            }
                                                            if (var496 == 4210) {
                                                                --var6;
                                                                int var230 = class10.field141[var6];
                                                                --var7;
                                                                String var231 = class78.field1248[var7];
                                                                class211.method1454(0, var231, var230 == 1);
                                                                class10.field141[var6++] = class71.field1165;
                                                                continue;
                                                            }
                                                            if (~var496 == -4212) {
                                                                if (class231.field3804 != null && class71.field1165 > class197.field3150) {
                                                                    class10.field141[var6++] = class202.method1393(65535, class231.field3804[class197.field3150++]);
                                                                    continue;
                                                                }
                                                                class10.field141[var6++] = -1;
                                                                continue;
                                                            }
                                                            if (~var496 == -4213) {
                                                                class197.field3150 = 0;
                                                                continue;
                                                            }
                                                        } else if (~var496 <= -4401) {
                                                            if (~var496 > -4501) {
                                                                if (~var496 == -4401) {
                                                                    var6 -= 2;
                                                                    int var232 = class10.field141[var6];
                                                                    int var233 = class10.field141[var6 - -1];
                                                                    class39 var234 = class87.method632(var233, 92);
                                                                    if (var234.method342(115)) {
                                                                        class78.field1248[var7++] = class209.method1447(var232, -6653).method942((byte) -67, var233, var234.field728);
                                                                    } else {
                                                                        class10.field141[var6++] = class209.method1447(var232, -6653).method949(var233, 0, var234.field735);
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (~var496 <= -4601) {
                                                                if (var496 < 5100) {
                                                                    if (~var496 == -5001) {
                                                                        class10.field141[var6++] = class154.field2483;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5002) {
                                                                        var6 -= 3;
                                                                        ++class90.field1490;
                                                                        class154.field2483 = class10.field141[var6];
                                                                        class118.field1943 = class10.field141[var6 + 1];
                                                                        class177.field2794 = class10.field141[var6 + 2];
                                                                        class68.field1113.method534((byte) 117, 93);
                                                                        class68.field1113.method1548(-494964184, class154.field2483);
                                                                        class68.field1113.method1548(-494964184, class118.field1943);
                                                                        class68.field1113.method1548(-494964184, class177.field2794);
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5003) {
                                                                        var6 -= 2;
                                                                        ++class126.field2026;
                                                                        --var7;
                                                                        String var235 = class78.field1248[var7];
                                                                        int var236 = class10.field141[var6];
                                                                        int var237 = class10.field141[var6 + 1];
                                                                        class68.field1113.method534((byte) -98, 196);
                                                                        class68.field1113.method1502((byte) -119, class74.method522((byte) -83, var235));
                                                                        class68.field1113.method1548(-494964184, var236 + -1);
                                                                        class68.field1113.method1548(-494964184, var237);
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5003) {
                                                                        --var6;
                                                                        int var238 = class10.field141[var6];
                                                                        String var239 = null;
                                                                        if (var238 < 100) {
                                                                            var239 = class211.field3445[var238];
                                                                        }
                                                                        if (var239 == null) {
                                                                            var239 = "";
                                                                        }
                                                                        class78.field1248[var7++] = var239;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5005) {
                                                                        --var6;
                                                                        int var240 = class10.field141[var6];
                                                                        int var241 = -1;
                                                                        if (~var240 > -101 && class211.field3445[var240] != null) {
                                                                            var241 = class254.field4042[var240];
                                                                        }
                                                                        class10.field141[var6++] = var241;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5006) {
                                                                        class10.field141[var6++] = class118.field1943;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5009) {
                                                                        --var7;
                                                                        String var242 = class78.field1248[var7];
                                                                        if (var242.startsWith("::")) {
                                                                            class115.method851(126, var242);
                                                                            continue;
                                                                        }
                                                                        if (class144.field2313 == 0 && (class215.field3516 && !class74.field1201 || class9.field134)) {
                                                                            continue;
                                                                        }
                                                                        ++class287.field4540;
                                                                        String var243 = var242.toLowerCase();
                                                                        byte var244 = 0;
                                                                        byte var245 = 0;
                                                                        if (var243.startsWith(class219.field3579)) {
                                                                            var242 = var242.substring(class219.field3579.length());
                                                                            var245 = 0;
                                                                        } else if (var243.startsWith(class6.field70)) {
                                                                            var245 = 1;
                                                                            var242 = var242.substring(class6.field70.length());
                                                                        } else if (!var243.startsWith(class216.field3523)) {
                                                                            if (!var243.startsWith(class168.field2661)) {
                                                                                if (var243.startsWith(class210.field3434)) {
                                                                                    var245 = 4;
                                                                                    var242 = var242.substring(class210.field3434.length());
                                                                                } else if (!var243.startsWith(class61.field1000)) {
                                                                                    if (var243.startsWith(class20.field352)) {
                                                                                        var242 = var242.substring(class20.field352.length());
                                                                                        var245 = 6;
                                                                                    } else if (var243.startsWith(class285.field4515)) {
                                                                                        var242 = var242.substring(class285.field4515.length());
                                                                                        var245 = 7;
                                                                                    } else if (!var243.startsWith(class200.field3192)) {
                                                                                        if (!var243.startsWith(class199.field3183)) {
                                                                                            if (var243.startsWith(class7.field92)) {
                                                                                                var242 = var242.substring(class7.field92.length());
                                                                                                var245 = 10;
                                                                                            } else if (var243.startsWith(class241.field3902)) {
                                                                                                var242 = var242.substring(class241.field3902.length());
                                                                                                var245 = 11;
                                                                                            } else if (class135.field2192 != 0) {
                                                                                                if (var243.startsWith(class91.field1496)) {
                                                                                                    var245 = 0;
                                                                                                    var242 = var242.substring(class91.field1496.length());
                                                                                                } else if (!var243.startsWith(class113.field1886)) {
                                                                                                    if (var243.startsWith(class173.field2722)) {
                                                                                                        var242 = var242.substring(class173.field2722.length());
                                                                                                        var245 = 2;
                                                                                                    } else if (!var243.startsWith(class61.field997)) {
                                                                                                        if (!var243.startsWith(class175.field2735)) {
                                                                                                            if (var243.startsWith(class197.field3151)) {
                                                                                                                var245 = 5;
                                                                                                                var242 = var242.substring(class197.field3151.length());
                                                                                                            } else if (!var243.startsWith(class68.field1130)) {
                                                                                                                if (!var243.startsWith(class72.field1169)) {
                                                                                                                    if (!var243.startsWith(class248.field3969)) {
                                                                                                                        if (!var243.startsWith(class135.field2194)) {
                                                                                                                            if (!var243.startsWith(class164.field2600)) {
                                                                                                                                if (var243.startsWith(class113.field1890)) {
                                                                                                                                    var242 = var242.substring(class113.field1890.length());
                                                                                                                                    var245 = 11;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var245 = 10;
                                                                                                                                var242 = var242.substring(class164.field2600.length());
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var242 = var242.substring(class135.field2194.length());
                                                                                                                            var245 = 9;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var245 = 8;
                                                                                                                        var242 = var242.substring(class248.field3969.length());
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var242 = var242.substring(class72.field1169.length());
                                                                                                                    var245 = 7;
                                                                                                                }
                                                                                                            } else {
                                                                                                                var242 = var242.substring(class68.field1130.length());
                                                                                                                var245 = 6;
                                                                                                            }
                                                                                                        } else {
                                                                                                            var245 = 4;
                                                                                                            var242 = var242.substring(class175.field2735.length());
                                                                                                        }
                                                                                                    } else {
                                                                                                        var245 = 3;
                                                                                                        var242 = var242.substring(class61.field997.length());
                                                                                                    }
                                                                                                } else {
                                                                                                    var245 = 1;
                                                                                                    var242 = var242.substring(class113.field1886.length());
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var245 = 9;
                                                                                            var242 = var242.substring(class199.field3183.length());
                                                                                        }
                                                                                    } else {
                                                                                        var245 = 8;
                                                                                        var242 = var242.substring(class200.field3192.length());
                                                                                    }
                                                                                } else {
                                                                                    var245 = 5;
                                                                                    var242 = var242.substring(class61.field1000.length());
                                                                                }
                                                                            } else {
                                                                                var242 = var242.substring(class168.field2661.length());
                                                                                var245 = 3;
                                                                            }
                                                                        } else {
                                                                            var242 = var242.substring(class216.field3523.length());
                                                                            var245 = 2;
                                                                        }
                                                                        String var246 = var242.toLowerCase();
                                                                        if (!var246.startsWith(class123.field2003)) {
                                                                            if (var246.startsWith(class4.field45)) {
                                                                                var242 = var242.substring(class4.field45.length());
                                                                                var244 = 2;
                                                                            } else if (var246.startsWith(class41.field776)) {
                                                                                var244 = 3;
                                                                                var242 = var242.substring(class41.field776.length());
                                                                            } else if (var246.startsWith(class211.field3448)) {
                                                                                var242 = var242.substring(class211.field3448.length());
                                                                                var244 = 4;
                                                                            } else if (var246.startsWith(class95.field1563)) {
                                                                                var244 = 5;
                                                                                var242 = var242.substring(class95.field1563.length());
                                                                            } else if (class135.field2192 != 0) {
                                                                                if (var246.startsWith(class100.field1644)) {
                                                                                    var242 = var242.substring(class100.field1644.length());
                                                                                    var244 = 1;
                                                                                } else if (var246.startsWith(class153.field2467)) {
                                                                                    var242 = var242.substring(class153.field2467.length());
                                                                                    var244 = 2;
                                                                                } else if (!var246.startsWith(class6.field78)) {
                                                                                    if (!var246.startsWith(class19.field334)) {
                                                                                        if (var246.startsWith(class148.field2362)) {
                                                                                            var244 = 5;
                                                                                            var242 = var242.substring(class148.field2362.length());
                                                                                        }
                                                                                    } else {
                                                                                        var242 = var242.substring(class19.field334.length());
                                                                                        var244 = 4;
                                                                                    }
                                                                                } else {
                                                                                    var242 = var242.substring(class6.field78.length());
                                                                                    var244 = 3;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            var242 = var242.substring(class123.field2003.length());
                                                                            var244 = 1;
                                                                        }
                                                                        class68.field1113.method534((byte) 80, 125);
                                                                        class68.field1113.method1548(-494964184, 0);
                                                                        int var247 = class68.field1113.field3655;
                                                                        class68.field1113.method1548(-494964184, var245);
                                                                        class68.field1113.method1548(-494964184, var244);
                                                                        class112.method826((byte) -56, class68.field1113, var242);
                                                                        class68.field1113.method1509((byte) 115, class68.field1113.field3655 - var247);
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5010) {
                                                                        var7 -= 2;
                                                                        String var248 = class78.field1248[var7];
                                                                        String var249 = class78.field1248[var7 - -1];
                                                                        if (~class144.field2313 != -1 || (!class215.field3516 || class74.field1201) && !class9.field134) {
                                                                            ++class225.field3716;
                                                                            class68.field1113.method534((byte) -107, 98);
                                                                            class68.field1113.method1548(-494964184, 0);
                                                                            int var250 = class68.field1113.field3655;
                                                                            class68.field1113.method1502((byte) -46, class74.method522((byte) -103, var248));
                                                                            class112.method826((byte) -56, class68.field1113, var249);
                                                                            class68.field1113.method1509((byte) -6, class68.field1113.field3655 - var250);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5010) {
                                                                        --var6;
                                                                        int var251 = class10.field141[var6];
                                                                        String var252 = null;
                                                                        if (var251 < 100) {
                                                                            var252 = class245.field3929[var251];
                                                                        }
                                                                        if (var252 == null) {
                                                                            var252 = "";
                                                                        }
                                                                        class78.field1248[var7++] = var252;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5012) {
                                                                        --var6;
                                                                        int var253 = class10.field141[var6];
                                                                        String var254 = null;
                                                                        if (var253 < 100) {
                                                                            var254 = class64.field1076[var253];
                                                                        }
                                                                        if (var254 == null) {
                                                                            var254 = "";
                                                                        }
                                                                        class78.field1248[var7++] = var254;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5013) {
                                                                        --var6;
                                                                        int var255 = class10.field141[var6];
                                                                        int var256 = -1;
                                                                        if (~var255 > -101) {
                                                                            var256 = class209.field3424[var255];
                                                                        }
                                                                        class10.field141[var6++] = var256;
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5015) {
                                                                        String var257;
                                                                        if (class167.field2655 != null && class167.field2655.field525 != null) {
                                                                            var257 = class167.field2655.method284(0);
                                                                        } else {
                                                                            var257 = class219.field3581;
                                                                        }
                                                                        class78.field1248[var7++] = var257;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5017) {
                                                                        class10.field141[var6++] = class177.field2794;
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5017) {
                                                                        class10.field141[var6++] = class136.field2245;
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5050) {
                                                                        --var6;
                                                                        int var258 = class10.field141[var6];
                                                                        class78.field1248[var7++] = class99.method727(var258, 32767).field3945;
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5051) {
                                                                        --var6;
                                                                        int var259 = class10.field141[var6];
                                                                        class247 var260 = class99.method727(var259, 32767);
                                                                        if (var260.field3943 == null) {
                                                                            class10.field141[var6++] = 0;
                                                                        } else {
                                                                            class10.field141[var6++] = var260.field3943.length;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5052) {
                                                                        var6 -= 2;
                                                                        int var261 = class10.field141[var6];
                                                                        int var262 = class10.field141[var6 + 1];
                                                                        class247 var263 = class99.method727(var261, 32767);
                                                                        int var264 = var263.field3943[var262];
                                                                        class10.field141[var6++] = var264;
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5053) {
                                                                        --var6;
                                                                        int var265 = class10.field141[var6];
                                                                        class247 var266 = class99.method727(var265, 32767);
                                                                        if (var266.field3935 != null) {
                                                                            class10.field141[var6++] = var266.field3935.length;
                                                                        } else {
                                                                            class10.field141[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5055) {
                                                                        var6 -= 2;
                                                                        int var267 = class10.field141[var6];
                                                                        int var268 = class10.field141[var6 + 1];
                                                                        class10.field141[var6++] = class99.method727(var267, 32767).field3935[var268];
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5056) {
                                                                        --var6;
                                                                        int var269 = class10.field141[var6];
                                                                        class78.field1248[var7++] = class223.method1572((byte) 100, var269).method792((byte) -117);
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5056) {
                                                                        --var6;
                                                                        int var270 = class10.field141[var6];
                                                                        class108 var271 = class223.method1572((byte) 103, var270);
                                                                        if (var271.field1791 != null) {
                                                                            class10.field141[var6++] = var271.field1791.length;
                                                                        } else {
                                                                            class10.field141[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5058) {
                                                                        var6 -= 2;
                                                                        int var272 = class10.field141[var6];
                                                                        int var273 = class10.field141[var6 - -1];
                                                                        class10.field141[var6++] = class223.method1572((byte) 106, var272).field1791[var273];
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5058) {
                                                                        class188.field3040 = new class250();
                                                                        --var6;
                                                                        class188.field3040.field3976 = class10.field141[var6];
                                                                        class188.field3040.field3978 = class223.method1572((byte) 94, class188.field3040.field3976);
                                                                        class188.field3040.field3975 = new int[class188.field3040.field3978.method796((byte) -124)];
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5060) {
                                                                        class68.field1113.method534((byte) 27, 244);
                                                                        class68.field1113.method1548(-494964184, 0);
                                                                        int var274 = class68.field1113.field3655;
                                                                        class68.field1113.method1548(-494964184, 0);
                                                                        class68.field1113.method1554(class188.field3040.field3976, (byte) 89);
                                                                        ++class189.field3058;
                                                                        class188.field3040.field3978.method794(-1, class188.field3040.field3975, class68.field1113);
                                                                        class68.field1113.method1509((byte) -58, class68.field1113.field3655 - var274);
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5060) {
                                                                        --var7;
                                                                        String var275 = class78.field1248[var7];
                                                                        class68.field1113.method534((byte) -97, 12);
                                                                        ++class70.field1155;
                                                                        class68.field1113.method1548(-494964184, 0);
                                                                        int var276 = class68.field1113.field3655;
                                                                        class68.field1113.method1502((byte) -128, class74.method522((byte) -93, var275));
                                                                        class68.field1113.method1554(class188.field3040.field3976, (byte) 89);
                                                                        class188.field3040.field3978.method794(-1, class188.field3040.field3975, class68.field1113);
                                                                        class68.field1113.method1509((byte) -44, class68.field1113.field3655 - var276);
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5061) {
                                                                        class68.field1113.method534((byte) -120, 244);
                                                                        class68.field1113.method1548(-494964184, 0);
                                                                        ++class189.field3058;
                                                                        int var277 = class68.field1113.field3655;
                                                                        class68.field1113.method1548(-494964184, 1);
                                                                        class68.field1113.method1554(class188.field3040.field3976, (byte) 89);
                                                                        class188.field3040.field3978.method794(-1, class188.field3040.field3975, class68.field1113);
                                                                        class68.field1113.method1509((byte) 109, -var277 + class68.field1113.field3655);
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5062) {
                                                                        var6 -= 2;
                                                                        int var278 = class10.field141[var6];
                                                                        int var279 = class10.field141[var6 + 1];
                                                                        class10.field141[var6++] = class99.method727(var278, 32767).field3939[var279];
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5064) {
                                                                        var6 -= 2;
                                                                        int var280 = class10.field141[var6 - -1];
                                                                        int var281 = class10.field141[var6];
                                                                        class10.field141[var6++] = class99.method727(var281, 32767).field3941[var280];
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5064) {
                                                                        var6 -= 2;
                                                                        int var282 = class10.field141[var6];
                                                                        int var283 = class10.field141[var6 + 1];
                                                                        if (~var283 != 0) {
                                                                            class10.field141[var6++] = class99.method727(var282, 32767).method1695((char) var283, -115);
                                                                        } else {
                                                                            class10.field141[var6++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5065) {
                                                                        var6 -= 2;
                                                                        int var284 = class10.field141[var6 + 1];
                                                                        int var285 = class10.field141[var6];
                                                                        if (~var284 != 0) {
                                                                            class10.field141[var6++] = class99.method727(var285, 32767).method1697((char) var284, 0);
                                                                        } else {
                                                                            class10.field141[var6++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5066) {
                                                                        --var6;
                                                                        int var286 = class10.field141[var6];
                                                                        class10.field141[var6++] = class223.method1572((byte) 124, var286).method796((byte) -124);
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5067) {
                                                                        var6 -= 2;
                                                                        int var287 = class10.field141[var6];
                                                                        int var288 = class10.field141[var6 + 1];
                                                                        int var289 = class223.method1572((byte) 120, var287).method788(0, var288);
                                                                        class10.field141[var6++] = var289;
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5068) {
                                                                        var6 -= 2;
                                                                        int var290 = class10.field141[var6];
                                                                        int var291 = class10.field141[var6 + 1];
                                                                        class188.field3040.field3975[var290] = var291;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5070) {
                                                                        var6 -= 2;
                                                                        int var292 = class10.field141[var6];
                                                                        int var293 = class10.field141[var6 + 1];
                                                                        class188.field3040.field3975[var292] = var293;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5071) {
                                                                        var6 -= 3;
                                                                        int var294 = class10.field141[var6 - -1];
                                                                        int var295 = class10.field141[var6];
                                                                        int var296 = class10.field141[var6 + 2];
                                                                        class108 var297 = class223.method1572((byte) 92, var295);
                                                                        if (~var297.method788(0, var294) != -1) {
                                                                            throw new RuntimeException("bad command");
                                                                        }
                                                                        class10.field141[var6++] = var297.method787(var294, (byte) -21, var296);
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5072) {
                                                                        --var7;
                                                                        String var298 = class78.field1248[var7];
                                                                        --var6;
                                                                        boolean var299 = class10.field141[var6] == 1;
                                                                        class125.method898(var298, (byte) -115, var299);
                                                                        class10.field141[var6++] = class71.field1165;
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5072) {
                                                                        if (class231.field3804 != null && ~class197.field3150 > ~class71.field1165) {
                                                                            class10.field141[var6++] = class202.method1393(class231.field3804[class197.field3150++], 65535);
                                                                            continue;
                                                                        }
                                                                        class10.field141[var6++] = -1;
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5073) {
                                                                        class197.field3150 = 0;
                                                                        continue;
                                                                    }
                                                                } else if (var496 < 5200) {
                                                                    if (var496 == 5100) {
                                                                        if (class73.field1193[86]) {
                                                                            class10.field141[var6++] = 1;
                                                                        } else {
                                                                            class10.field141[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5101) {
                                                                        if (class73.field1193[82]) {
                                                                            class10.field141[var6++] = 1;
                                                                        } else {
                                                                            class10.field141[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5103) {
                                                                        if (class73.field1193[81]) {
                                                                            class10.field141[var6++] = 1;
                                                                        } else {
                                                                            class10.field141[var6++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                } else if (~var496 <= -5301) {
                                                                    if (~var496 > -5401) {
                                                                        if (~var496 == -5301) {
                                                                            var6 -= 2;
                                                                            class10.field141[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5302) {
                                                                            continue;
                                                                        }
                                                                        if (var496 == 5302) {
                                                                            class10.field141[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5304) {
                                                                            --var6;
                                                                            class10.field141[var6++] = 0;
                                                                            class10.field141[var6++] = 0;
                                                                            continue;
                                                                        }
                                                                        if (var496 == 5305) {
                                                                            byte var300 = -1;
                                                                            class10.field141[var6++] = var300;
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5307) {
                                                                            class10.field141[var6++] = class259.method1764(0);
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5308) {
                                                                            --var6;
                                                                            int var301 = class10.field141[var6];
                                                                            if (~var301 > -1 || var301 > 2) {
                                                                                var301 = 0;
                                                                            }
                                                                            class285.method1917(-1, var301, -1, -1, false);
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5309) {
                                                                            class10.field141[var6++] = class282.field4463;
                                                                            continue;
                                                                        }
                                                                        if (var496 == 5309) {
                                                                            --var6;
                                                                            int var302 = class10.field141[var6];
                                                                            if (var302 < 0 || var302 > 2) {
                                                                                var302 = 0;
                                                                            }
                                                                            class282.field4463 = var302;
                                                                            class257.method1755(class105.field1684, false);
                                                                            continue;
                                                                        }
                                                                    } else if (var496 >= 5500) {
                                                                        if (var496 >= 5600) {
                                                                            if (~var496 > -5701) {
                                                                                if (var496 == 5600) {
                                                                                    var7 -= 2;
                                                                                    String var303 = class78.field1248[var7];
                                                                                    --var6;
                                                                                    int var304 = class10.field141[var6];
                                                                                    String var305 = class78.field1248[var7 - -1];
                                                                                    if (~class273.field4336 == -11 && class224.field3707 == 0 && class85.field1352 == 0 && class138.field2264 == 0 && class162.field2587 == 0) {
                                                                                        class28.method244(var303, var304, var305, -24905);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 5601) {
                                                                                    class75.method525(-102);
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -5603) {
                                                                                    if (~class85.field1352 == -1) {
                                                                                        class33.field515 = -2;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -5604) {
                                                                                    var6 -= 4;
                                                                                    if (class273.field4336 == 10 && ~class224.field3707 == -1 && class85.field1352 == 0 && class138.field2264 == 0 && ~class162.field2587 == -1) {
                                                                                        class231.method1623(class10.field141[var6 + 1], class10.field141[var6], (byte) -64, class10.field141[var6 + 3], class10.field141[var6 - -2]);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -5605) {
                                                                                    --var7;
                                                                                    if (class273.field4336 == 10 && ~class224.field3707 == -1 && class85.field1352 == 0 && class138.field2264 == 0 && ~class162.field2587 == -1) {
                                                                                        class164.method1130((byte) -95, class74.method522((byte) -113, class78.field1248[var7]));
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 5605) {
                                                                                    var6 -= 7;
                                                                                    var7 -= 3;
                                                                                    if (class273.field4336 == 10 && ~class224.field3707 == -1 && ~class85.field1352 == -1 && class138.field2264 == 0 && class162.field2587 == 0) {
                                                                                        class148.method1018(class10.field141[var6 + 2], class78.field1248[var7 - -2], 0, class78.field1248[var7 - -1], ~class10.field141[var6 + 5] == -2, class74.method522((byte) -66, class78.field1248[var7]), class10.field141[var6 + 6] == 1, class10.field141[var6], ~class10.field141[var6 - -4] == -2, class10.field141[var6 - -1], class10.field141[var6 + 3]);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 5606) {
                                                                                    if (~class138.field2264 == -1) {
                                                                                        class145.field2330 = -2;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 5607) {
                                                                                    class10.field141[var6++] = class33.field515;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -5609) {
                                                                                    class10.field141[var6++] = client.field2521;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 5609) {
                                                                                    class10.field141[var6++] = class145.field2330;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -5611) {
                                                                                    for (int var306 = 0; ~var306 > -6; ++var306) {
                                                                                        class78.field1248[var7++] = ~var306 > ~class103.field1677.length ? class121.method875(false, class103.field1677[var306]) : "";
                                                                                    }
                                                                                    class103.field1677 = null;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -5612) {
                                                                                    class10.field141[var6++] = class212.field3456;
                                                                                    continue;
                                                                                }
                                                                            } else if (~var496 > -6101) {
                                                                                if (var496 == 6001) {
                                                                                    --var6;
                                                                                    int var307 = class10.field141[var6];
                                                                                    if (~var307 > -2) {
                                                                                        var307 = 1;
                                                                                    }
                                                                                    if (~var307 < -5) {
                                                                                        var307 = 4;
                                                                                    }
                                                                                    class20.field342 = var307;
                                                                                    if (class20.field342 == 1) {
                                                                                        class69.method487(0.9F);
                                                                                    }
                                                                                    if (class20.field342 == 2) {
                                                                                        class69.method487(0.8F);
                                                                                    }
                                                                                    if (~class20.field342 == -4) {
                                                                                        class69.method487(0.7F);
                                                                                    }
                                                                                    if (class20.field342 == 4) {
                                                                                        class69.method487(0.6F);
                                                                                    }
                                                                                    class205.method1419((byte) 99);
                                                                                    class257.method1755(class105.field1684, arg2);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6002) {
                                                                                    --var6;
                                                                                    class205.method1417(class10.field141[var6] == 1, -10681);
                                                                                    class109.method798((byte) -128);
                                                                                    class226.method1591(false);
                                                                                    class169.method1163(-127);
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6004) {
                                                                                    --var6;
                                                                                    class229.field3785 = class10.field141[var6] == 1;
                                                                                    class169.method1163(-127);
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6006) {
                                                                                    --var6;
                                                                                    class22.field361 = class10.field141[var6] == 1;
                                                                                    class226.method1591(arg2);
                                                                                    class257.method1755(class105.field1684, arg2);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6007) {
                                                                                    --var6;
                                                                                    class284.field4487 = ~class10.field141[var6] == -2;
                                                                                    ((class273) class69.field1140).method1846(!class284.field4487, 121);
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6007) {
                                                                                    --var6;
                                                                                    class51.field893 = ~class10.field141[var6] == -2;
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6009) {
                                                                                    --var6;
                                                                                    class79.field1269 = ~class10.field141[var6] == -2;
                                                                                    class257.method1755(class105.field1684, arg2);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6009) {
                                                                                    --var6;
                                                                                    class281.field4459 = class10.field141[var6] == 1;
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6010) {
                                                                                    --var6;
                                                                                    class78.field1254 = class10.field141[var6] == 1;
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6012) {
                                                                                    --var6;
                                                                                    int var308 = class10.field141[var6];
                                                                                    if (~var308 > -1 || var308 > 2) {
                                                                                        var308 = 0;
                                                                                    }
                                                                                    class97.field1575 = var308;
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6012) {
                                                                                    --var6;
                                                                                    class169.field2671 = class10.field141[var6] == 1;
                                                                                    if (class20.field342 == 1) {
                                                                                        class69.method487(0.9F);
                                                                                    }
                                                                                    if (~class20.field342 == -3) {
                                                                                        class69.method487(0.8F);
                                                                                    }
                                                                                    if (class20.field342 == 3) {
                                                                                        class69.method487(0.7F);
                                                                                    }
                                                                                    if (~class20.field342 == -5) {
                                                                                        class69.method487(0.6F);
                                                                                    }
                                                                                    class226.method1591(false);
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6015) {
                                                                                    --var6;
                                                                                    class236.field3851 = ~class10.field141[var6] == -2;
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6016) {
                                                                                    --var6;
                                                                                    class107.field1776 = ~class10.field141[var6] == -2;
                                                                                    class257.method1755(class105.field1684, arg2);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6017) {
                                                                                    --var6;
                                                                                    int var309 = class10.field141[var6];
                                                                                    if (~var309 > -1 || var309 > 2) {
                                                                                        var309 = 0;
                                                                                    }
                                                                                    class64.field1073 = var309;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6018) {
                                                                                    --var6;
                                                                                    class260.field4139 = class10.field141[var6] == 1;
                                                                                    class129.method918(-1990);
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6018) {
                                                                                    --var6;
                                                                                    int var310 = class10.field141[var6];
                                                                                    if (var310 < 0) {
                                                                                        var310 = 0;
                                                                                    }
                                                                                    if (~var310 < -128) {
                                                                                        var310 = 127;
                                                                                    }
                                                                                    class94.field1550 = var310;
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6020) {
                                                                                    --var6;
                                                                                    int var311 = class10.field141[var6];
                                                                                    if (~var311 > -1) {
                                                                                        var311 = 0;
                                                                                    }
                                                                                    if (~var311 < -256) {
                                                                                        var311 = 255;
                                                                                    }
                                                                                    if (~class284.field4480 != ~var311) {
                                                                                        if (class284.field4480 == 0 && class148.field2389 != -1) {
                                                                                            class254.method1727(0, false, var311, class148.field2389, class168.field2665, 10905);
                                                                                            class98.field1601 = false;
                                                                                        } else if (~var311 == -1) {
                                                                                            class153.method1063((byte) -11);
                                                                                            class98.field1601 = false;
                                                                                        } else {
                                                                                            class193.method1312(true, var311);
                                                                                        }
                                                                                        class284.field4480 = var311;
                                                                                    }
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6020) {
                                                                                    --var6;
                                                                                    int var312 = class10.field141[var6];
                                                                                    if (var312 < 0) {
                                                                                        var312 = 0;
                                                                                    }
                                                                                    if (var312 > 127) {
                                                                                        var312 = 127;
                                                                                    }
                                                                                    class107.field1745 = var312;
                                                                                    class257.method1755(class105.field1684, arg2);
                                                                                    class221.field3679 = false;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6022) {
                                                                                    --var6;
                                                                                    class266.field4217 = ~class10.field141[var6] == -2;
                                                                                    class169.method1163(-127);
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6024) {
                                                                                    --var6;
                                                                                    int var313 = class10.field141[var6];
                                                                                    if (~var313 > -1) {
                                                                                        var313 = 0;
                                                                                    }
                                                                                    if (var313 > 2) {
                                                                                        var313 = 2;
                                                                                    }
                                                                                    boolean var314 = false;
                                                                                    if (~class4.field44 > -97) {
                                                                                        var314 = true;
                                                                                        var313 = 0;
                                                                                    }
                                                                                    class130.method922(var313);
                                                                                    class257.method1755(class105.field1684, arg2);
                                                                                    class221.field3679 = false;
                                                                                    class10.field141[var6++] = var314 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6025) {
                                                                                    --var6;
                                                                                    int var315 = class10.field141[var6];
                                                                                    if (~var315 > -1 || var315 > 2) {
                                                                                        var315 = 0;
                                                                                    }
                                                                                    class252.field4018 = var315;
                                                                                    class257.method1755(class105.field1684, false);
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6028) {
                                                                                    --var6;
                                                                                    class22.field379 = class10.field141[var6] != 0;
                                                                                    class257.method1755(class105.field1684, arg2);
                                                                                    continue;
                                                                                }
                                                                            } else if (~var496 > -6201) {
                                                                                if (var496 == 6101) {
                                                                                    class10.field141[var6++] = class20.field342;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6102) {
                                                                                    class10.field141[var6++] = class257.method1757(-5) ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6103) {
                                                                                    class10.field141[var6++] = !class229.field3785 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6106) {
                                                                                    class10.field141[var6++] = !class22.field361 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6107) {
                                                                                    class10.field141[var6++] = class284.field4487 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6108) {
                                                                                    class10.field141[var6++] = !class51.field893 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6109) {
                                                                                    class10.field141[var6++] = !class79.field1269 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6110) {
                                                                                    class10.field141[var6++] = class281.field4459 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6111) {
                                                                                    class10.field141[var6++] = !class78.field1254 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6112) {
                                                                                    class10.field141[var6++] = class97.field1575;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6113) {
                                                                                    class10.field141[var6++] = class169.field2671 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6114) {
                                                                                    class10.field141[var6++] = class236.field3851 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6116) {
                                                                                    class10.field141[var6++] = !class107.field1776 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6116) {
                                                                                    class10.field141[var6++] = class64.field1073;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6117) {
                                                                                    class10.field141[var6++] = !class260.field4139 ? 0 : 1;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6118) {
                                                                                    class10.field141[var6++] = class94.field1550;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6119) {
                                                                                    class10.field141[var6++] = class284.field4480;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6121) {
                                                                                    class10.field141[var6++] = class107.field1745;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6121) {
                                                                                    class10.field141[var6++] = 0;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6124) {
                                                                                    class10.field141[var6++] = class130.method924();
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6125) {
                                                                                    class10.field141[var6++] = class252.field4018;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6129) {
                                                                                    class10.field141[var6++] = class22.field379 ? 1 : 0;
                                                                                    continue;
                                                                                }
                                                                            } else if (~var496 <= -6301) {
                                                                                if (var496 < 6400) {
                                                                                    if (~var496 == -6301) {
                                                                                        class10.field141[var6++] = (int) (class276.method1861((byte) 122) / 60000L);
                                                                                        continue;
                                                                                    }
                                                                                    if (var496 == 6301) {
                                                                                        class10.field141[var6++] = (int) (class276.method1861((byte) 122) / 86400000L) + -11745;
                                                                                        continue;
                                                                                    }
                                                                                    if (~var496 == -6303) {
                                                                                        var6 -= 3;
                                                                                        int var316 = class10.field141[var6];
                                                                                        int var317 = class10.field141[var6 + 1];
                                                                                        int var318 = class10.field141[var6 + 2];
                                                                                        class67.field1107.clear();
                                                                                        class67.field1107.set(11, 12);
                                                                                        class67.field1107.set(var318, var317, var316);
                                                                                        class10.field141[var6++] = -11745 + (int) (class67.field1107.getTime().getTime() / 86400000L);
                                                                                        continue;
                                                                                    }
                                                                                    if (var496 == 6303) {
                                                                                        class67.field1107.clear();
                                                                                        class67.field1107.setTime(new Date(class276.method1861((byte) 122)));
                                                                                        class10.field141[var6++] = class67.field1107.get(1);
                                                                                        continue;
                                                                                    }
                                                                                    if (~var496 == -6305) {
                                                                                        --var6;
                                                                                        int var319 = class10.field141[var6];
                                                                                        boolean var320 = true;
                                                                                        if (~var319 <= -1) {
                                                                                            if (var319 >= 1582) {
                                                                                                if (var319 % 4 == 0) {
                                                                                                    if (~(var319 % 100) == -1) {
                                                                                                        if (~(var319 % 400) != -1) {
                                                                                                            var320 = false;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var320 = true;
                                                                                                    }
                                                                                                } else {
                                                                                                    var320 = false;
                                                                                                }
                                                                                            } else {
                                                                                                var320 = var319 % 4 == 0;
                                                                                            }
                                                                                        } else {
                                                                                            var320 = ~((var319 + 1) % 4) == -1;
                                                                                        }
                                                                                        class10.field141[var6++] = !var320 ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                } else if (var496 >= 6500) {
                                                                                    if (~var496 <= -6601) {
                                                                                        if (~var496 > -6701) {
                                                                                            if (var496 == 6600) {
                                                                                                --var6;
                                                                                                class235.field3836 = class10.field141[var6] == 1;
                                                                                                class257.method1755(class105.field1684, false);
                                                                                                continue;
                                                                                            }
                                                                                            if (~var496 == -6602) {
                                                                                                class10.field141[var6++] = !class235.field3836 ? 0 : 1;
                                                                                                continue;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (var496 == 6500) {
                                                                                            if (class273.field4336 == 10 && class224.field3707 == 0 && class85.field1352 == 0 && class138.field2264 == 0) {
                                                                                                class10.field141[var6++] = class92.method692((byte) -124) == -1 ? 0 : 1;
                                                                                                continue;
                                                                                            }
                                                                                            class10.field141[var6++] = 1;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var496 == -6502) {
                                                                                            class78 var321 = class123.method886(-87);
                                                                                            if (var321 == null) {
                                                                                                class10.field141[var6++] = -1;
                                                                                                class10.field141[var6++] = 0;
                                                                                                class78.field1248[var7++] = "";
                                                                                                class10.field141[var6++] = 0;
                                                                                                class78.field1248[var7++] = "";
                                                                                                class10.field141[var6++] = 0;
                                                                                            } else {
                                                                                                class10.field141[var6++] = var321.field1249;
                                                                                                class10.field141[var6++] = var321.field1506;
                                                                                                class78.field1248[var7++] = var321.field1250;
                                                                                                class30 var322 = var321.method545(-2648);
                                                                                                class10.field141[var6++] = var322.field477;
                                                                                                class78.field1248[var7++] = var322.field478;
                                                                                                class10.field141[var6++] = var321.field1500;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var496 == -6503) {
                                                                                            class78 var323 = class12.method92((byte) -42);
                                                                                            if (var323 == null) {
                                                                                                class10.field141[var6++] = -1;
                                                                                                class10.field141[var6++] = 0;
                                                                                                class78.field1248[var7++] = "";
                                                                                                class10.field141[var6++] = 0;
                                                                                                class78.field1248[var7++] = "";
                                                                                                class10.field141[var6++] = 0;
                                                                                            } else {
                                                                                                class10.field141[var6++] = var323.field1249;
                                                                                                class10.field141[var6++] = var323.field1506;
                                                                                                class78.field1248[var7++] = var323.field1250;
                                                                                                class30 var324 = var323.method545(-2648);
                                                                                                class10.field141[var6++] = var324.field477;
                                                                                                class78.field1248[var7++] = var324.field478;
                                                                                                class10.field141[var6++] = var323.field1500;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var496 == -6504) {
                                                                                            --var6;
                                                                                            int var325 = class10.field141[var6];
                                                                                            if (~class273.field4336 == -11 && class224.field3707 == 0 && class85.field1352 == 0 && class138.field2264 == 0) {
                                                                                                class10.field141[var6++] = !class170.method1173(var325, (byte) 62) ? 0 : 1;
                                                                                                continue;
                                                                                            }
                                                                                            class10.field141[var6++] = 0;
                                                                                            continue;
                                                                                        }
                                                                                        if (~var496 == -6505) {
                                                                                            --var6;
                                                                                            class235.field3831 = class10.field141[var6];
                                                                                            class257.method1755(class105.field1684, false);
                                                                                            continue;
                                                                                        }
                                                                                        if (~var496 == -6506) {
                                                                                            class10.field141[var6++] = class235.field3831;
                                                                                            continue;
                                                                                        }
                                                                                        if (var496 == 6506) {
                                                                                            --var6;
                                                                                            int var326 = class10.field141[var6];
                                                                                            class78 var327 = class136.method958(17771, var326);
                                                                                            if (var327 != null) {
                                                                                                class10.field141[var6++] = var327.field1506;
                                                                                                class78.field1248[var7++] = var327.field1250;
                                                                                                class30 var328 = var327.method545(-2648);
                                                                                                class10.field141[var6++] = var328.field477;
                                                                                                class78.field1248[var7++] = var328.field478;
                                                                                                class10.field141[var6++] = var327.field1500;
                                                                                            } else {
                                                                                                class10.field141[var6++] = -1;
                                                                                                class78.field1248[var7++] = "";
                                                                                                class10.field141[var6++] = 0;
                                                                                                class78.field1248[var7++] = "";
                                                                                                class10.field141[var6++] = 0;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        if (~var496 == -6508) {
                                                                                            var6 -= 4;
                                                                                            int var329 = class10.field141[var6 - -2];
                                                                                            boolean var330 = ~class10.field141[var6 + 1] == -2;
                                                                                            int var331 = class10.field141[var6];
                                                                                            boolean var332 = ~class10.field141[var6 + 3] == -2;
                                                                                            class169.method1160(var330, var329, var332, var331, (byte) -103);
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (var496 == 6405) {
                                                                                        class10.field141[var6++] = !class30.method254(107) ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                    if (var496 == 6406) {
                                                                                        class10.field141[var6++] = !class162.method1123(4626) ? 0 : 1;
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (~var496 == -6201) {
                                                                                    var6 -= 2;
                                                                                    class210.field3431 = (short) class10.field141[var6];
                                                                                    if (class210.field3431 <= 0) {
                                                                                        class210.field3431 = 256;
                                                                                    }
                                                                                    class5.field64 = (short) class10.field141[var6 + 1];
                                                                                    if (~class5.field64 >= -1) {
                                                                                        class5.field64 = 205;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6201) {
                                                                                    var6 -= 2;
                                                                                    class138.field2267 = (short) class10.field141[var6];
                                                                                    if (class138.field2267 <= 0) {
                                                                                        class138.field2267 = 256;
                                                                                    }
                                                                                    class44.field808 = (short) class10.field141[var6 + 1];
                                                                                    if (class44.field808 <= 0) {
                                                                                        class44.field808 = 320;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6202) {
                                                                                    var6 -= 4;
                                                                                    class278.field4373 = (short) class10.field141[var6];
                                                                                    if (~class278.field4373 >= -1) {
                                                                                        class278.field4373 = 1;
                                                                                    }
                                                                                    class29.field467 = (short) class10.field141[var6 - -1];
                                                                                    if (class29.field467 > 0) {
                                                                                        if (class29.field467 < class278.field4373) {
                                                                                            class29.field467 = class278.field4373;
                                                                                        }
                                                                                    } else {
                                                                                        class29.field467 = 32767;
                                                                                    }
                                                                                    class56.field965 = (short) class10.field141[var6 - -2];
                                                                                    if (~class56.field965 >= -1) {
                                                                                        class56.field965 = 1;
                                                                                    }
                                                                                    class45.field825 = (short) class10.field141[var6 + 3];
                                                                                    if (~class45.field825 < -1) {
                                                                                        if (~class56.field965 < ~class45.field825) {
                                                                                            class45.field825 = class56.field965;
                                                                                        }
                                                                                    } else {
                                                                                        class45.field825 = 32767;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6204) {
                                                                                    class117.method858(class277.field4360.field676, 0, class277.field4360.field642, false, false, 0);
                                                                                    class10.field141[var6++] = class227.field3754;
                                                                                    class10.field141[var6++] = class168.field2663;
                                                                                    continue;
                                                                                }
                                                                                if (var496 == 6204) {
                                                                                    class10.field141[var6++] = class138.field2267;
                                                                                    class10.field141[var6++] = class44.field808;
                                                                                    continue;
                                                                                }
                                                                                if (~var496 == -6206) {
                                                                                    class10.field141[var6++] = class210.field3431;
                                                                                    class10.field141[var6++] = class5.field64;
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (~var496 == -5501) {
                                                                                var6 -= 4;
                                                                                int var333 = class10.field141[var6 + 2];
                                                                                int var334 = class10.field141[var6 + 1];
                                                                                int var335 = class10.field141[var6];
                                                                                int var336 = class10.field141[var6 + 3];
                                                                                class14.method113(false, var333, var334, (16383 & var335) + -class214.field3501, ((var335 & 268424119) >> 14) + -class50.field884, 100, var336);
                                                                                continue;
                                                                            }
                                                                            if (var496 == 5501) {
                                                                                var6 -= 4;
                                                                                int var337 = class10.field141[var6];
                                                                                int var338 = class10.field141[var6 + 1];
                                                                                int var339 = class10.field141[var6 - -2];
                                                                                int var340 = class10.field141[var6 + 3];
                                                                                class202.method1390(var339, var338, var340, ((var337 & 268421410) >> 14) + -class50.field884, (byte) -90, (var337 & 16383) + -class214.field3501);
                                                                                continue;
                                                                            }
                                                                            if (~var496 == -5503) {
                                                                                var6 -= 6;
                                                                                int var341 = class10.field141[var6];
                                                                                if (~var341 <= -3) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class7.field89 = var341;
                                                                                int var342 = class10.field141[var6 + 1];
                                                                                if (var342 + 1 >= class289.field4576[class7.field89].length >> 1) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class48.field856 = 0;
                                                                                class156.field2540 = var342;
                                                                                class28.field449 = class10.field141[var6 + 2];
                                                                                class224.field3705 = class10.field141[var6 + 3];
                                                                                int var343 = class10.field141[var6 + 4];
                                                                                if (var343 >= 2) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class184.field2898 = var343;
                                                                                int var344 = class10.field141[var6 + 5];
                                                                                if (~(class289.field4576[class184.field2898].length >> 1) >= ~(var344 - -1)) {
                                                                                    throw new RuntimeException();
                                                                                }
                                                                                class103.field1676 = var344;
                                                                                class229.field3786 = 3;
                                                                                continue;
                                                                            }
                                                                            if (var496 == 5503) {
                                                                                class96.method713(0);
                                                                                continue;
                                                                            }
                                                                            if (~var496 == -5505) {
                                                                                var6 -= 2;
                                                                                class199.field3186 = class10.field141[var6];
                                                                                class122.field1985 = class10.field141[var6 + 1];
                                                                                if (class229.field3786 == 2) {
                                                                                    class202.field3242 = class122.field1985;
                                                                                    class200.field3187 = class199.field3186;
                                                                                }
                                                                                class96.method712((byte) -128);
                                                                                continue;
                                                                            }
                                                                            if (~var496 == -5506) {
                                                                                class10.field141[var6++] = class199.field3186;
                                                                                continue;
                                                                            }
                                                                            if (var496 == 5506) {
                                                                                class10.field141[var6++] = class122.field1985;
                                                                                continue;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        if (var496 == 5400) {
                                                                            var7 -= 2;
                                                                            ++class24.field403;
                                                                            String var345 = class78.field1248[var7];
                                                                            --var6;
                                                                            int var346 = class10.field141[var6];
                                                                            String var347 = class78.field1248[var7 + 1];
                                                                            class68.field1113.method534((byte) -108, 87);
                                                                            class68.field1113.method1548(-494964184, 1 + class193.method1313(8, var345) + class193.method1313(103, var347));
                                                                            class68.field1113.method1563(var345, 104);
                                                                            class68.field1113.method1563(var347, 103);
                                                                            class68.field1113.method1548(-494964184, var346);
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5402) {
                                                                            var6 -= 2;
                                                                            class43.field796[class10.field141[var6]] = (short) class207.method1428(class10.field141[var6 + 1], (byte) 98);
                                                                            class181.method1227(1502);
                                                                            class205.method1419((byte) 99);
                                                                            class24.method224(26364);
                                                                            class49.method389(12099);
                                                                            class253.method1720(22023);
                                                                            continue;
                                                                        }
                                                                        if (var496 == 5405) {
                                                                            var6 -= 2;
                                                                            int var348 = class10.field141[var6 - -1];
                                                                            int var349 = class10.field141[var6];
                                                                            if (~var349 <= -1 && ~var349 > -3) {
                                                                                class289.field4576[var349] = new int[var348 << 1][4];
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var496 == 5406) {
                                                                            var6 -= 7;
                                                                            int var350 = class10.field141[var6 + 2];
                                                                            int var351 = class10.field141[var6 + 1] << 1;
                                                                            int var352 = class10.field141[var6];
                                                                            int var353 = class10.field141[var6 + 3];
                                                                            int var354 = class10.field141[var6 - -4];
                                                                            int var355 = class10.field141[var6 + 5];
                                                                            int var356 = class10.field141[var6 + 6];
                                                                            if (var352 >= 0 && var352 < 2 && class289.field4576[var352] != null && var351 >= 0 && class289.field4576[var352].length > var351) {
                                                                                class289.field4576[var352][var351] = new int[] { (class202.method1393(var350, 268424833) >> 14) * 128, var353, 128 * class202.method1393(var350, 16383), var356 };
                                                                                class289.field4576[var352][var351 + 1] = new int[] { class202.method1393(16383, var354 >> 14) * 128, var355, 128 * class202.method1393(var354, 16383) };
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5408) {
                                                                            --var6;
                                                                            int var357 = class289.field4576[class10.field141[var6]].length >> 1;
                                                                            class10.field141[var6++] = var357;
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5412) {
                                                                            if (class110.field1811 != null) {
                                                                                System.exit(0);
                                                                            } else {
                                                                                class287.method1930(class216.method1479(2000), (byte) -101, false);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5420) {
                                                                            String var358 = "";
                                                                            if (class98.field1619 != null) {
                                                                                if (class98.field1619.field2594 == null) {
                                                                                    var358 = class203.method1394(-1608752296, class98.field1619.field2592);
                                                                                } else {
                                                                                    var358 = (String) class98.field1619.field2594;
                                                                                }
                                                                            }
                                                                            class78.field1248[var7++] = var358;
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5421) {
                                                                            class10.field141[var6++] = class165.field2609 != 3 ? 0 : 1;
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5422) {
                                                                            --var7;
                                                                            String var359 = class78.field1248[var7];
                                                                            --var6;
                                                                            boolean var360 = class10.field141[var6] == 1;
                                                                            String var361 = class216.method1479(2000) + var359;
                                                                            if (class110.field1811 != null || var360 && ~class165.field2609 != -4 && class165.field2624.startsWith("win") && !class148.field2388) {
                                                                                class110.field1807 = var360;
                                                                                class155.field2510 = var361;
                                                                                class5.field68 = class105.field1684.method1139(var361, -111);
                                                                                continue;
                                                                            }
                                                                            class287.method1930(var361, (byte) -109, var360);
                                                                            continue;
                                                                        }
                                                                        if (var496 == 5422) {
                                                                            var7 -= 2;
                                                                            String var362 = class78.field1248[var7 + 1];
                                                                            String var363 = class78.field1248[var7];
                                                                            --var6;
                                                                            int var364 = class10.field141[var6];
                                                                            if (var363.length() > 0) {
                                                                                if (class241.field3896 == null) {
                                                                                    class241.field3896 = new String[class121.field1971[class111.field1837]];
                                                                                }
                                                                                class241.field3896[var364] = var363;
                                                                            }
                                                                            if (~var362.length() < -1) {
                                                                                if (class108.field1788 == null) {
                                                                                    class108.field1788 = new String[class121.field1971[class111.field1837]];
                                                                                }
                                                                                class108.field1788[var364] = var362;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (var496 == 5423) {
                                                                            --var7;
                                                                            System.out.println(class78.field1248[var7]);
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5425) {
                                                                            var6 -= 11;
                                                                            class264.field4214 = class10.field141[var6];
                                                                            class109.field1799 = class10.field141[var6 + 1];
                                                                            class90.field1488 = class10.field141[var6 + 2];
                                                                            class106.field1700 = class10.field141[var6 + 3];
                                                                            class8.field94 = class10.field141[var6 - -4];
                                                                            class240.field3885 = class10.field141[var6 + 5];
                                                                            class213.field3490 = class10.field141[var6 + 6];
                                                                            class194.field3106 = class10.field141[var6 + 7];
                                                                            class155.field2508 = class10.field141[var6 + 8];
                                                                            class142.field2300 = class10.field141[var6 + 9];
                                                                            class14.field248 = class10.field141[var6 + 10];
                                                                            class222.field3687.method1353(-60, class8.field94);
                                                                            class222.field3687.method1353(-11, class240.field3885);
                                                                            class222.field3687.method1353(-88, class213.field3490);
                                                                            class222.field3687.method1353(-81, class194.field3106);
                                                                            class222.field3687.method1353(-40, class155.field2508);
                                                                            class240.field3892 = true;
                                                                            continue;
                                                                        }
                                                                        if (var496 == 5425) {
                                                                            class29.method253(0);
                                                                            class240.field3892 = false;
                                                                            continue;
                                                                        }
                                                                        if (~var496 == -5427) {
                                                                            --var6;
                                                                            class189.field3062 = class10.field141[var6];
                                                                            continue;
                                                                        }
                                                                        if (var496 == 5427) {
                                                                            var6 -= 2;
                                                                            class89.field1414 = class10.field141[var6];
                                                                            class24.field397 = class10.field141[var6 + 1];
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (~var496 == -5201) {
                                                                        --var6;
                                                                        method140(class10.field141[var6], -76);
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5202) {
                                                                        class10.field141[var6++] = class271.method1835((byte) -70);
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5203) {
                                                                        --var6;
                                                                        class173.method1186(class10.field141[var6], (byte) 31);
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5204) {
                                                                        --var7;
                                                                        class281.method1897((byte) 112, class78.field1248[var7]);
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5204) {
                                                                        class78.field1248[var7 + -1] = class120.method873(class78.field1248[var7 + -1], (byte) -55);
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5205) {
                                                                        --var7;
                                                                        class210.method1450(-3591, class78.field1248[var7]);
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5207) {
                                                                        --var6;
                                                                        int var365 = class10.field141[var6];
                                                                        class55 var366 = class43.method359(1, 16383 & var365, var365 >> 14 & 16383);
                                                                        if (var366 != null) {
                                                                            class78.field1248[var7++] = var366.field930;
                                                                        } else {
                                                                            class78.field1248[var7++] = "";
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5208) {
                                                                        --var7;
                                                                        class55 var367 = class254.method1731(class78.field1248[var7], 127);
                                                                        if (var367 != null && var367.field947 != null) {
                                                                            class78.field1248[var7++] = var367.field947;
                                                                            continue;
                                                                        }
                                                                        class78.field1248[var7++] = "";
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5209) {
                                                                        class10.field141[var6++] = class120.field1958;
                                                                        class10.field141[var6++] = class19.field322;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5210) {
                                                                        class10.field141[var6++] = class28.field448 + class161.field2568;
                                                                        class10.field141[var6++] = class210.field3428 + -1 + class223.field3692 - class126.field2046;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5211) {
                                                                        class55 var368 = class12.method96(21617);
                                                                        if (var368 == null) {
                                                                            class10.field141[var6++] = 0;
                                                                            class10.field141[var6++] = 0;
                                                                        } else {
                                                                            class10.field141[var6++] = var368.field936 * 64;
                                                                            class10.field141[var6++] = var368.field938 * 64;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5212) {
                                                                        class55 var369 = class12.method96(21617);
                                                                        if (var369 == null) {
                                                                            class10.field141[var6++] = 0;
                                                                            class10.field141[var6++] = 0;
                                                                        } else {
                                                                            class10.field141[var6++] = -var369.field935 + var369.field934;
                                                                            class10.field141[var6++] = -var369.field948 + var369.field933;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5213) {
                                                                        int var370 = class197.method1340(86);
                                                                        int var371 = 0;
                                                                        String var372;
                                                                        if (~var370 == 0) {
                                                                            var372 = "";
                                                                        } else {
                                                                            var372 = class153.field2479.field266[var370];
                                                                            var371 = class153.field2479.method124((byte) -64, var370);
                                                                        }
                                                                        String var373 = class154.method1070("<br>", (byte) 55, var372, " ");
                                                                        class78.field1248[var7++] = var373;
                                                                        class10.field141[var6++] = var371;
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5213) {
                                                                        int var374 = class231.method1616(-1);
                                                                        int var375 = 0;
                                                                        String var376;
                                                                        if (var374 == -1) {
                                                                            var376 = "";
                                                                        } else {
                                                                            var376 = class153.field2479.field266[var374];
                                                                            var375 = class153.field2479.method124((byte) -121, var374);
                                                                        }
                                                                        String var377 = class154.method1070("<br>", (byte) 55, var376, " ");
                                                                        class78.field1248[var7++] = var377;
                                                                        class10.field141[var6++] = var375;
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5215) {
                                                                        --var6;
                                                                        int var378 = class10.field141[var6];
                                                                        class167.method1154(var378 >> 14 & 16383, (byte) 93, var378 & 16383);
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5215) {
                                                                        --var7;
                                                                        String var379 = class78.field1248[var7];
                                                                        boolean var380 = false;
                                                                        --var6;
                                                                        int var381 = class10.field141[var6];
                                                                        class106 var382 = class185.method1258((var381 & 268433902) >> 14, var381 & 16383, 250);
                                                                        for (class55 var383 = (class55) var382.method766((byte) -127); var383 != null; var383 = (class55) var382.method764((byte) -82)) {
                                                                            if (var383.field930.equalsIgnoreCase(var379)) {
                                                                                var380 = true;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (!var380) {
                                                                            class10.field141[var6++] = 0;
                                                                        } else {
                                                                            class10.field141[var6++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5217) {
                                                                        --var6;
                                                                        int var384 = class10.field141[var6];
                                                                        class277.method1864((byte) -120, var384);
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5218) {
                                                                        --var6;
                                                                        int var385 = class10.field141[var6];
                                                                        if (!class101.method742((byte) 70, var385)) {
                                                                            class10.field141[var6++] = 0;
                                                                        } else {
                                                                            class10.field141[var6++] = 1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5219) {
                                                                        class55 var386 = class12.method96(21617);
                                                                        if (var386 != null) {
                                                                            class10.field141[var6++] = var386.field941;
                                                                        } else {
                                                                            class10.field141[var6++] = -1;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var496 == -5220) {
                                                                        --var7;
                                                                        class244.method1677(class78.field1248[var7], 121);
                                                                        continue;
                                                                    }
                                                                    if (var496 == 5220) {
                                                                        class10.field141[var6++] = ~class139.field2278 != -101 ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                }
                                                            } else if (var496 == 4500) {
                                                                var6 -= 2;
                                                                int var387 = class10.field141[var6];
                                                                int var388 = class10.field141[var6 + 1];
                                                                class39 var389 = class87.method632(var388, 97);
                                                                if (!var389.method342(115)) {
                                                                    class10.field141[var6++] = class68.method473((byte) 127, var387).method585(122, var389.field735, var388);
                                                                } else {
                                                                    class78.field1248[var7++] = class68.method473((byte) 103, var387).method590(var388, var389.field728, (byte) -107);
                                                                }
                                                                continue;
                                                            }
                                                        } else if (~var496 == -4301) {
                                                            var6 -= 2;
                                                            int var390 = class10.field141[var6];
                                                            int var391 = class10.field141[var6 + 1];
                                                            class39 var392 = class87.method632(var391, 111);
                                                            if (var392.method342(115)) {
                                                                class78.field1248[var7++] = class204.method1402((byte) 77, var390).method781(101, var392.field728, var391);
                                                            } else {
                                                                class10.field141[var6++] = class204.method1402((byte) 77, var390).method783(var391, (byte) 43, var392.field735);
                                                            }
                                                            continue;
                                                        }
                                                    } else {
                                                        if (var496 == 4000) {
                                                            var6 -= 2;
                                                            int var393 = class10.field141[var6];
                                                            int var394 = class10.field141[var6 + 1];
                                                            class10.field141[var6++] = var393 + var394;
                                                            continue;
                                                        }
                                                        if (~var496 == -4002) {
                                                            var6 -= 2;
                                                            int var395 = class10.field141[var6 + 1];
                                                            int var396 = class10.field141[var6];
                                                            class10.field141[var6++] = -var395 + var396;
                                                            continue;
                                                        }
                                                        if (~var496 == -4003) {
                                                            var6 -= 2;
                                                            int var397 = class10.field141[var6];
                                                            int var398 = class10.field141[var6 + 1];
                                                            class10.field141[var6++] = var397 * var398;
                                                            continue;
                                                        }
                                                        if (~var496 == -4004) {
                                                            var6 -= 2;
                                                            int var399 = class10.field141[var6];
                                                            int var400 = class10.field141[var6 + 1];
                                                            class10.field141[var6++] = var399 / var400;
                                                            continue;
                                                        }
                                                        if (var496 == 4004) {
                                                            --var6;
                                                            int var401 = class10.field141[var6];
                                                            class10.field141[var6++] = (int) (Math.random() * (double) var401);
                                                            continue;
                                                        }
                                                        if (var496 == 4005) {
                                                            --var6;
                                                            int var402 = class10.field141[var6];
                                                            class10.field141[var6++] = (int) ((double) (var402 + 1) * Math.random());
                                                            continue;
                                                        }
                                                        if (~var496 == -4007) {
                                                            var6 -= 5;
                                                            int var403 = class10.field141[var6];
                                                            int var404 = class10.field141[var6 + 2];
                                                            int var405 = class10.field141[var6 + 3];
                                                            int var406 = class10.field141[var6 + 1];
                                                            int var407 = class10.field141[var6 + 4];
                                                            class10.field141[var6++] = (-var403 + var406) * (-var404 + var407) / (var405 - var404) + var403;
                                                            continue;
                                                        }
                                                        if (~var496 == -4008) {
                                                            var6 -= 2;
                                                            long var408 = (long) class10.field141[var6 + 1];
                                                            long var410 = (long) class10.field141[var6];
                                                            class10.field141[var6++] = (int) (var408 * var410 / 100L + var410);
                                                            continue;
                                                        }
                                                        if (var496 == 4008) {
                                                            var6 -= 2;
                                                            int var412 = class10.field141[var6 - -1];
                                                            int var413 = class10.field141[var6];
                                                            class10.field141[var6++] = class220.method1495(var413, 1 << var412);
                                                            continue;
                                                        }
                                                        if (~var496 == -4010) {
                                                            var6 -= 2;
                                                            int var414 = class10.field141[var6];
                                                            int var415 = class10.field141[var6 + 1];
                                                            class10.field141[var6++] = class202.method1393(-(1 << var415) + -1, var414);
                                                            continue;
                                                        }
                                                        if (var496 == 4010) {
                                                            var6 -= 2;
                                                            int var416 = class10.field141[var6 + 1];
                                                            int var417 = class10.field141[var6];
                                                            class10.field141[var6++] = class202.method1393(1 << var416, var417) != 0 ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (~var496 == -4012) {
                                                            var6 -= 2;
                                                            int var418 = class10.field141[var6];
                                                            int var419 = class10.field141[var6 + 1];
                                                            class10.field141[var6++] = var418 % var419;
                                                            continue;
                                                        }
                                                        if (var496 == 4012) {
                                                            var6 -= 2;
                                                            int var420 = class10.field141[var6];
                                                            int var421 = class10.field141[var6 + 1];
                                                            if (~var420 != -1) {
                                                                class10.field141[var6++] = (int) Math.pow((double) var420, (double) var421);
                                                            } else {
                                                                class10.field141[var6++] = 0;
                                                            }
                                                            continue;
                                                        }
                                                        if (var496 == 4013) {
                                                            var6 -= 2;
                                                            int var422 = class10.field141[var6];
                                                            int var423 = class10.field141[var6 + 1];
                                                            if (var422 == 0) {
                                                                class10.field141[var6++] = 0;
                                                            } else if (var423 != 0) {
                                                                class10.field141[var6++] = (int) Math.pow((double) var422, 1.0D / (double) var423);
                                                            } else {
                                                                class10.field141[var6++] = Integer.MAX_VALUE;
                                                            }
                                                            continue;
                                                        }
                                                        if (~var496 == -4015) {
                                                            var6 -= 2;
                                                            int var424 = class10.field141[var6];
                                                            int var425 = class10.field141[var6 + 1];
                                                            class10.field141[var6++] = class202.method1393(var425, var424);
                                                            continue;
                                                        }
                                                        if (~var496 == -4016) {
                                                            var6 -= 2;
                                                            int var426 = class10.field141[var6];
                                                            int var427 = class10.field141[var6 + 1];
                                                            class10.field141[var6++] = class220.method1495(var427, var426);
                                                            continue;
                                                        }
                                                        if (var496 == 4016) {
                                                            var6 -= 2;
                                                            int var428 = class10.field141[var6 - -1];
                                                            int var429 = class10.field141[var6];
                                                            class10.field141[var6++] = ~var429 > ~var428 ? var429 : var428;
                                                            continue;
                                                        }
                                                        if (var496 == 4017) {
                                                            var6 -= 2;
                                                            int var430 = class10.field141[var6];
                                                            int var431 = class10.field141[var6 + 1];
                                                            class10.field141[var6++] = var430 <= var431 ? var431 : var430;
                                                            continue;
                                                        }
                                                        if (~var496 == -4019) {
                                                            var6 -= 3;
                                                            long var432 = (long) class10.field141[var6];
                                                            long var434 = (long) class10.field141[var6 + 1];
                                                            long var436 = (long) class10.field141[var6 + 2];
                                                            class10.field141[var6++] = (int) (var432 * var436 / var434);
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    if (~var496 == -3904) {
                                                        --var6;
                                                        int var438 = class10.field141[var6];
                                                        class10.field141[var6++] = class260.field4140[var438].method1025(-8);
                                                        continue;
                                                    }
                                                    if (~var496 == -3905) {
                                                        --var6;
                                                        int var439 = class10.field141[var6];
                                                        class10.field141[var6++] = class260.field4140[var439].field2405;
                                                        continue;
                                                    }
                                                    if (~var496 == -3906) {
                                                        --var6;
                                                        int var440 = class10.field141[var6];
                                                        class10.field141[var6++] = class260.field4140[var440].field2401;
                                                        continue;
                                                    }
                                                    if (var496 == 3906) {
                                                        --var6;
                                                        int var441 = class10.field141[var6];
                                                        class10.field141[var6++] = class260.field4140[var441].field2393;
                                                        continue;
                                                    }
                                                    if (~var496 == -3908) {
                                                        --var6;
                                                        int var442 = class10.field141[var6];
                                                        class10.field141[var6++] = class260.field4140[var442].field2406;
                                                        continue;
                                                    }
                                                    if (var496 == 3908) {
                                                        --var6;
                                                        int var443 = class10.field141[var6];
                                                        class10.field141[var6++] = class260.field4140[var443].field2397;
                                                        continue;
                                                    }
                                                    if (var496 == 3910) {
                                                        --var6;
                                                        int var444 = class10.field141[var6];
                                                        int var445 = class260.field4140[var444].method1023(7);
                                                        class10.field141[var6++] = var445 != 0 ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (var496 == 3911) {
                                                        --var6;
                                                        int var446 = class10.field141[var6];
                                                        int var447 = class260.field4140[var446].method1023(7);
                                                        class10.field141[var6++] = var447 == 2 ? 1 : 0;
                                                        continue;
                                                    }
                                                    if (var496 == 3912) {
                                                        --var6;
                                                        int var448 = class10.field141[var6];
                                                        int var449 = class260.field4140[var448].method1023(7);
                                                        class10.field141[var6++] = ~var449 != -6 ? 0 : 1;
                                                        continue;
                                                    }
                                                    if (~var496 == -3914) {
                                                        --var6;
                                                        int var450 = class10.field141[var6];
                                                        int var451 = class260.field4140[var450].method1023(7);
                                                        class10.field141[var6++] = ~var451 != -2 ? 0 : 1;
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                if (var496 == 3400) {
                                                    var6 -= 2;
                                                    int var452 = class10.field141[var6];
                                                    int var453 = class10.field141[var6 + 1];
                                                    class85 var454 = class190.method1296(true, var452);
                                                    class78.field1248[var7++] = var454.method618(var453, (byte) 119);
                                                    continue;
                                                }
                                                if (~var496 == -3409) {
                                                    var6 -= 4;
                                                    int var455 = class10.field141[var6];
                                                    int var456 = class10.field141[var6 + 1];
                                                    int var457 = class10.field141[var6 + 2];
                                                    int var458 = class10.field141[var6 - -3];
                                                    class85 var459 = class190.method1296(!arg2, var457);
                                                    if (var459.field1330 == var455 && var459.field1343 == var456) {
                                                        if (var456 == 115) {
                                                            class78.field1248[var7++] = var459.method618(var458, (byte) 119);
                                                        } else {
                                                            class10.field141[var6++] = var459.method624(var458, -1);
                                                        }
                                                        continue;
                                                    }
                                                    throw new RuntimeException("C3408-1");
                                                }
                                                if (~var496 == -3410) {
                                                    var6 -= 3;
                                                    int var460 = class10.field141[var6];
                                                    int var461 = class10.field141[var6 + 1];
                                                    int var462 = class10.field141[var6 + 2];
                                                    if (~var461 == 0) {
                                                        throw new RuntimeException("C3409-2");
                                                    }
                                                    class85 var463 = class190.method1296(!arg2, var461);
                                                    if (var463.field1343 != var460) {
                                                        throw new RuntimeException("C3409-1");
                                                    }
                                                    class10.field141[var6++] = var463.method617(var462, 15612) ? 1 : 0;
                                                    continue;
                                                }
                                                if (~var496 == -3411) {
                                                    --var6;
                                                    int var464 = class10.field141[var6];
                                                    --var7;
                                                    String var465 = class78.field1248[var7];
                                                    if (~var464 == 0) {
                                                        throw new RuntimeException("C3410-2");
                                                    }
                                                    class85 var466 = class190.method1296(true, var464);
                                                    if (~var466.field1343 != -116) {
                                                        throw new RuntimeException("C3410-1");
                                                    }
                                                    class10.field141[var6++] = !var466.method619(5406, var465) ? 0 : 1;
                                                    continue;
                                                }
                                                if (var496 == 3411) {
                                                    --var6;
                                                    int var467 = class10.field141[var6];
                                                    class85 var468 = class190.method1296(true, var467);
                                                    class10.field141[var6++] = var468.field1350.method1403(true);
                                                    continue;
                                                }
                                            }
                                        } else {
                                            --var6;
                                            class36 var469 = class64.method455(class10.field141[var6], 592427152);
                                            if (~var496 == -2601) {
                                                class10.field141[var6++] = var469.field630;
                                                continue;
                                            }
                                            if (var496 == 2601) {
                                                class10.field141[var6++] = var469.field571;
                                                continue;
                                            }
                                            if (var496 == 2602) {
                                                class78.field1248[var7++] = var469.field595;
                                                continue;
                                            }
                                            if (var496 == 2603) {
                                                class10.field141[var6++] = var469.field674;
                                                continue;
                                            }
                                            if (var496 == 2604) {
                                                class10.field141[var6++] = var469.field602;
                                                continue;
                                            }
                                            if (var496 == 2605) {
                                                class10.field141[var6++] = var469.field702;
                                                continue;
                                            }
                                            if (~var496 == -2607) {
                                                class10.field141[var6++] = var469.field647;
                                                continue;
                                            }
                                            if (~var496 == -2608) {
                                                class10.field141[var6++] = var469.field668;
                                                continue;
                                            }
                                            if (~var496 == -2609) {
                                                class10.field141[var6++] = var469.field567;
                                                continue;
                                            }
                                            if (~var496 == -2610) {
                                                class10.field141[var6++] = var469.field640;
                                                continue;
                                            }
                                            if (~var496 == -2611) {
                                                class10.field141[var6++] = var469.field619;
                                                continue;
                                            }
                                            if (~var496 == -2612) {
                                                class10.field141[var6++] = var469.field652;
                                                continue;
                                            }
                                            if (~var496 == -2613) {
                                                class10.field141[var6++] = var469.field561;
                                                continue;
                                            }
                                        }
                                    } else {
                                        --var6;
                                        class36 var470 = class64.method455(class10.field141[var6], 592427152);
                                        if (var496 == 2500) {
                                            class10.field141[var6++] = var470.field606;
                                            continue;
                                        }
                                        if (var496 == 2501) {
                                            class10.field141[var6++] = var470.field607;
                                            continue;
                                        }
                                        if (~var496 == -2503) {
                                            class10.field141[var6++] = var470.field642;
                                            continue;
                                        }
                                        if (var496 == 2503) {
                                            class10.field141[var6++] = var470.field676;
                                            continue;
                                        }
                                        if (var496 == 2504) {
                                            class10.field141[var6++] = var470.field667 ? 1 : 0;
                                            continue;
                                        }
                                        if (var496 == 2505) {
                                            class10.field141[var6++] = var470.field632;
                                            continue;
                                        }
                                    }
                                } else {
                                    class36 var471 = var46 ? class48.field852 : class113.field1887;
                                    if (~var496 == -1801) {
                                        class10.field141[var6++] = client.method1093(var471).method606(1596737886);
                                        continue;
                                    }
                                    if (var496 == 1801) {
                                        --var6;
                                        int var472 = class10.field141[var6];
                                        int var498 = var472 - 1;
                                        if (var471.field663 != null && var471.field663.length > var498 && var471.field663[var498] != null) {
                                            class78.field1248[var7++] = var471.field663[var498];
                                            continue;
                                        }
                                        class78.field1248[var7++] = "";
                                        continue;
                                    }
                                    if (~var496 == -1803) {
                                        if (var471.field671 == null) {
                                            class78.field1248[var7++] = "";
                                        } else {
                                            class78.field1248[var7++] = var471.field671;
                                        }
                                        continue;
                                    }
                                }
                            } else {
                                class36 var473 = !var46 ? class113.field1887 : class48.field852;
                                if (~var496 == -1701) {
                                    class10.field141[var6++] = var473.field583;
                                    continue;
                                }
                                if (var496 == 1701) {
                                    if (var473.field583 == -1) {
                                        class10.field141[var6++] = 0;
                                    } else {
                                        class10.field141[var6++] = var473.field655;
                                    }
                                    continue;
                                }
                                if (~var496 == -1703) {
                                    class10.field141[var6++] = var473.field661;
                                    continue;
                                }
                            }
                        }
                    } else {
                        class36 var62;
                        if (var496 >= 2000) {
                            --var6;
                            var62 = class64.method455(class10.field141[var6], 592427152);
                            var496 -= 1000;
                        } else {
                            var62 = !var46 ? class113.field1887 : class48.field852;
                        }
                        if (var496 == 1000) {
                            var6 -= 4;
                            var62.field695 = class10.field141[var6];
                            var62.field631 = class10.field141[var6 - -1];
                            int var63 = class10.field141[var6 - -3];
                            int var64 = class10.field141[var6 + 2];
                            if (~var63 > -1) {
                                var63 = 0;
                            } else if (~var63 < -6) {
                                var63 = 5;
                            }
                            if (~var64 > -1) {
                                var64 = 0;
                            } else if (~var64 < -6) {
                                var64 = 5;
                            }
                            var62.field604 = (byte) var64;
                            var62.field719 = (byte) var63;
                            class280.method1886(var62, 32);
                            class270.method1829(var62, -127);
                            if (var62.field661 == -1) {
                                class79.method554((byte) -113, var62.field648);
                            }
                            continue;
                        }
                        if (~var496 == -1002) {
                            var6 -= 4;
                            var62.field711 = class10.field141[var6];
                            var62.field556 = class10.field141[var6 - -1];
                            var62.field593 = 0;
                            var62.field610 = 0;
                            int var65 = class10.field141[var6 + 2];
                            int var66 = class10.field141[var6 - -3];
                            if (~var65 > -1) {
                                var65 = 0;
                            } else if (~var65 < -5) {
                                var65 = 4;
                            }
                            if (~var66 <= -1) {
                                if (~var66 < -5) {
                                    var66 = 4;
                                }
                            } else {
                                var66 = 0;
                            }
                            var62.field601 = (byte) var66;
                            var62.field660 = (byte) var65;
                            class280.method1886(var62, 32);
                            class270.method1829(var62, 68);
                            if (~var62.field709 == -1) {
                                class195.method1330(var62, -1104623792, false);
                            }
                            continue;
                        }
                        if (~var496 == -1004) {
                            --var6;
                            boolean var67 = class10.field141[var6] == 1;
                            if (var62.field667 != var67) {
                                var62.field667 = var67;
                                class280.method1886(var62, 32);
                            }
                            if (~var62.field661 == 0) {
                                class42.method357(var62.field648, 45);
                            }
                            continue;
                        }
                        if (~var496 == -1005) {
                            var6 -= 2;
                            var62.field578 = class10.field141[var6];
                            var62.field568 = class10.field141[var6 + 1];
                            class280.method1886(var62, 32);
                            class270.method1829(var62, -24);
                            if (~var62.field709 == -1) {
                                class195.method1330(var62, -1104623792, false);
                            }
                            continue;
                        }
                        if (~var496 == -1006) {
                            --var6;
                            var62.field717 = class10.field141[var6] == 1;
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            } catch (Exception var495) {
                if (var5.field326 == null) {
                    if (~class205.field3287 != -1) {
                        class226.method1588("", 0, (byte) -29, "Clientscript error - check log for details");
                    }
                    class178.method1211("CS2 - scr:" + var5.field3247 + " op:" + var9, -116, var495);
                } else {
                    StringBuffer var492 = new StringBuffer(30);
                    var492.append("%0a - in: ").append(var5.field326);
                    for (int var493 = class199.field3166 + -1; var493 >= 0; --var493) {
                        var492.append("%0a - via: ").append(class83.field1305[var493].field494.field326);
                    }
                    if (var9 == 40) {
                        int var494 = var10[var11];
                        var492.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var494));
                    }
                    if (class205.field3287 != 0) {
                        class226.method1588("", 0, (byte) -84, "Clientscript error in: " + var5.field326);
                    }
                    class178.method1211("CS2 - scr:" + var5.field3247 + " op:" + var9 + var492.toString(), -128, var495);
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(II)V")
    private static final void method140(int arg0, int arg1) {
        ++field284;
        class129.field2090 = -1;
        if (~arg0 != -38) {
            if (~arg0 == -51) {
                class28.field445 = 4.0F;
            } else if (~arg0 != -76) {
                if (~arg0 != -101) {
                    if (~arg0 == -201) {
                        class28.field445 = 16.0F;
                    }
                } else {
                    class28.field445 = 8.0F;
                }
            } else {
                class28.field445 = 6.0F;
            }
        } else {
            class28.field445 = 3.0F;
        }
        class129.field2090 = -1;
        if (arg1 != -76) {
            method139((class213) null, 39, false);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public final void method59(byte arg0) {
        if (arg0 < -73) {
            ++field300;
            super.method59((byte) -111);
            this.field298 = null;
        }
    }
}
