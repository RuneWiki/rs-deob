import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class166 {

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "[I")
    private int[] field3026;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[I")
    private int[] field3017;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lh;")
    private class260 field3020;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lh;")
    private class260 field3019;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "[Lh;")
    private class260[] field3016;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field3027 = 1;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lsb;")
    public static class216 field3015 = new class216(64);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Lnk;")
    public static class125 field3023;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Z")
    public static final boolean method1090(byte arg0, int arg1) {
        int var2 = 93 % ((arg0 + 57) / 62);
        field3018++;
        if (class244.field4311[arg1]) {
            return true;
        } else if (class24.field683.method585((byte) -128, arg1)) {
            int var3 = class24.field683.method587((byte) 115, arg1);
            if (var3 == 0) {
                class244.field4311[arg1] = true;
                return true;
            }
            if (class164.field2974[arg1] == null) {
                class164.field2974[arg1] = new class21[var3];
            }
            for (int var4 = 0; var4 < var3; var4++) {
                if (class164.field2974[arg1][var4] == null) {
                    byte[] var5 = class24.field683.method596(114, arg1, var4);
                    if (var5 != null) {
                        class164.field2974[arg1][var4] = new class21();
                        class164.field2974[arg1][var4].field537 = (arg1 << 16) + var4;
                        if (var5[0] == -1) {
                            class164.field2974[arg1][var4].method155(new class194(var5), 536870912);
                        } else {
                            class164.field2974[arg1][var4].method161(new class194(var5), -41);
                        }
                    }
                }
            }
            class244.field4311[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method1091(byte arg0) {
        field3025++;
        class220.method1508(class268.field4724, (byte) -77);
        class94.field1847++;
        if (class157.field2816 && class108.field2039) {
            int var1 = class136.field2492;
            int var2 = var1 - class49.field1058;
            if (var2 < class73.field1525) {
                var2 = class73.field1525;
            }
            if (arg0 < 99) {
                method1095(-51);
            }
            if ((class268.field4724.field539 + var2) > (class73.field1525 + class253.field4404.field539)) {
                var2 = class73.field1525 + class253.field4404.field539 - class268.field4724.field539;
            }
            int var3 = class252.field4380;
            int var4 = var2 - class158.field2877;
            int var5 = var3 - class207.field3754;
            if (class236.field4128 > var5) {
                var5 = class236.field4128;
            }
            int var6 = class268.field4724.field590;
            if (class236.field4128 + class253.field4404.field479 < var5 - -class268.field4724.field479) {
                var5 = class236.field4128 + class253.field4404.field479 - class268.field4724.field479;
            }
            int var7 = var5 - class32.field792;
            if (class94.field1847 > class268.field4724.field505 && (var4 > var6 || var4 < -var6 || var7 > var6 || var7 < (-var6))) {
                class111.field2084 = true;
            }
            int var8 = class253.field4404.field530 + var5 - class236.field4128;
            int var9 = class253.field4404.field591 + var2 - class73.field1525;
            if (class268.field4724.field584 != null && class111.field2084) {
                class116 var10 = new class116();
                var10.field2173 = class268.field4724.field584;
                var10.field2165 = var8;
                var10.field2172 = var9;
                var10.field2166 = class268.field4724;
                class182.method1211(var10, 119);
            }
            if (class11.field247 == 0) {
                if (class111.field2084) {
                    if (class268.field4724.field527 != null) {
                        class116 var11 = new class116();
                        var11.field2168 = class240.field4216;
                        var11.field2165 = var8;
                        var11.field2172 = var9;
                        var11.field2173 = class268.field4724.field527;
                        var11.field2166 = class268.field4724;
                        class182.method1211(var11, 124);
                    }
                    if (class240.field4216 != null && client.method1002(class268.field4724) != null) {
                        class215.field3818++;
                        class154.field2792.method1516(121, 171);
                        class154.field2792.method1290(class240.field4216.field537, -104);
                        class154.field2792.method1292(class268.field4724.field537, 10776);
                        class154.field2792.method1276(class240.field4216.field470, -125);
                        class154.field2792.method1325(false, class268.field4724.field470);
                    }
                } else if ((class188.field3376 == 1 || class61.method376(false, class252.field4384 - 1)) && class252.field4384 > 2) {
                    class27.method186((byte) -97);
                } else if (class252.field4384 > 0) {
                    class238.method1588((byte) 111);
                }
                class268.field4724 = null;
            }
        } else if (class94.field1847 > 1) {
            class268.field4724 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIILpc;)V")
    public static final void method1092(byte arg0, int arg1, int arg2, class21 arg3) {
        if (arg3.field619 == 1) {
            class119.method769(0, 0L, true, arg3.field537, (short) 35, class20.field459, arg3.field581);
            class18.field408++;
        }
        field3029++;
        if (arg3.field619 == 2 && !class130.field2387) {
            class263 var4 = class237.method1585(arg3, false);
            if (var4 != null) {
                class119.method769(-1, 0L, true, arg3.field537, (short) 20, class124.method797(-80, new class263[] { class218.field3870, arg3.field566 }), var4);
                class60.field1241++;
            }
        }
        if (arg3.field619 == 3) {
            class119.method769(0, 0L, true, arg3.field537, (short) 22, class20.field459, class16.field371);
            class232.field4055++;
        }
        if (arg0 < 54) {
            field3024 = -53;
        }
        if (arg3.field619 == 4) {
            class119.method769(0, 0L, true, arg3.field537, (short) 10, class20.field459, arg3.field581);
            class111.field2090++;
        }
        if (arg3.field619 == 5) {
            class119.method769(0, 0L, true, arg3.field537, (short) 41, class20.field459, arg3.field581);
            class37.field860++;
        }
        if (arg3.field619 == 6 && class113.field2121 == null) {
            class119.method769(-1, 0L, true, arg3.field537, (short) 5, class20.field459, arg3.field581);
            class187.field3371++;
        }
        if (arg3.field519 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field541; var6++) {
                for (int var7 = 0; var7 < arg3.field491; var7++) {
                    int var8 = (arg3.field494 + 32) * var7;
                    int var9 = (arg3.field542 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg3.field612[var5];
                        var8 += arg3.field504[var5];
                    }
                    if (var8 <= arg1 && var9 <= arg2 && arg1 < (var8 + 32) && (var9 + 32) > arg2) {
                        class64.field1288 = var5;
                        class259.field4485 = arg3;
                        if (arg3.field469[var5] > 0) {
                            class72 var10 = class92.method649(-32508, arg3.field469[var5] - 1);
                            if (class49.field1060 == 1 && class202.method1400(1, client.method1005(arg3))) {
                                if (class46.field1006 != arg3.field537 || class121.field2247 != var5) {
                                    class276.field4830++;
                                    class119.method769(var5, (long) var10.field1497, true, arg3.field537, (short) 11, class124.method797(-90, new class263[] { class236.field4127, class176.field3171, var10.field1467 }), class152.field2739);
                                }
                            } else if (!class130.field2387 || !class202.method1400(1, client.method1005(arg3))) {
                                field3028++;
                                class263[] var11 = var10.field1502;
                                if (class125.field2306) {
                                    var11 = class82.method551(var11, 24526);
                                }
                                if (class202.method1400(1, client.method1005(arg3))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class114.field2129++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 36;
                                            } else {
                                                var13 = 13;
                                            }
                                            class119.method769(var5, (long) var10.field1497, true, arg3.field537, var13, class124.method797(-118, new class263[] { class61.field1244, var10.field1467 }), var11[var12]);
                                        } else if (var12 == 4) {
                                            class134.field2458++;
                                            class119.method769(var5, (long) var10.field1497, true, arg3.field537, (short) 13, class124.method797(-43, new class263[] { class61.field1244, var10.field1467 }), class43.field934);
                                        }
                                    }
                                }
                                if (class70.method449(client.method1005(arg3), 4595)) {
                                    class191.field3430++;
                                    class119.method769(var5, (long) var10.field1497, true, arg3.field537, (short) 34, class124.method797(-45, new class263[] { class61.field1244, var10.field1467 }), class152.field2739);
                                }
                                if (class202.method1400(1, client.method1005(arg3)) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            byte var15 = 0;
                                            class267.field4677++;
                                            if (var14 == 0) {
                                                var15 = 28;
                                            }
                                            if (var14 == 1) {
                                                var15 = 19;
                                            }
                                            if (var14 == 2) {
                                                var15 = 17;
                                            }
                                            class119.method769(var5, (long) var10.field1497, true, arg3.field537, var15, class124.method797(-59, new class263[] { class61.field1244, var10.field1467 }), var11[var14]);
                                        }
                                    }
                                }
                                class263[] var16 = arg3.field529;
                                if (class125.field2306) {
                                    var16 = class82.method551(var16, 24526);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            class228.field4013++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 59;
                                            }
                                            if (var17 == 1) {
                                                var18 = 16;
                                            }
                                            if (var17 == 2) {
                                                var18 = 26;
                                            }
                                            if (var17 == 3) {
                                                var18 = 32;
                                            }
                                            if (var17 == 4) {
                                                var18 = 45;
                                            }
                                            class119.method769(var5, (long) var10.field1497, true, arg3.field537, var18, class124.method797(-59, new class263[] { class61.field1244, var10.field1467 }), var16[var17]);
                                        }
                                    }
                                }
                                class119.method769(var5, (long) var10.field1497, true, arg3.field537, (short) 1004, class124.method797(-54, new class263[] { class61.field1244, var10.field1467 }), class162.field2958);
                            } else if ((class5.field108 & 0x10) == 16) {
                                class120.field2232++;
                                class119.method769(var5, (long) var10.field1497, true, arg3.field537, (short) 31, class124.method797(-83, new class263[] { class39.field875, class176.field3171, var10.field1467 }), class151.field2727);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field573) {
            return;
        }
        if (!class130.field2387) {
            for (int var19 = 9; var19 >= 5; var19--) {
                class263 var23 = class237.method1587(var19, false, arg3);
                if (var23 != null) {
                    class119.method769(arg3.field470, (long) (var19 + 1), true, arg3.field537, (short) 1007, arg3.field477, var23);
                    class14.field353++;
                }
            }
            class263 var20 = class237.method1585(arg3, false);
            if (var20 != null) {
                class60.field1241++;
                class119.method769(arg3.field470, 0L, true, arg3.field537, (short) 20, arg3.field477, var20);
            }
            for (int var21 = 4; var21 >= 0; var21--) {
                class263 var22 = class237.method1587(var21, false, arg3);
                if (var22 != null) {
                    class119.method769(arg3.field470, (long) (var21 + 1), true, arg3.field537, (short) 43, arg3.field477, var22);
                    class14.field353++;
                }
            }
            if (class165.method1088(client.method1005(arg3), true)) {
                class119.method769(arg3.field470, 0L, true, arg3.field537, (short) 5, class20.field459, class169.field3107);
                class187.field3371++;
                return;
            }
            return;
        }
        if (class15.method113(-19, client.method1005(arg3)) && (class5.field108 & 0x20) == 32) {
            class119.method769(arg3.field470, 0L, true, arg3.field537, (short) 38, class124.method797(-70, new class263[] { class39.field875, class20.field464, arg3.field477 }), class151.field2727);
            class9.field208++;
            return;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZZDLhc;Lue;IZ)[I")
    public final int[] method1093(int arg0, boolean arg1, boolean arg2, double arg3, class221 arg4, class86 arg5, int arg6, boolean arg7) {
        class243.method1648(255, arg3);
        class90.field1781 = arg4;
        field3030++;
        class23.field674 = arg5;
        class44.method273(arg0, 4269, arg6);
        int[] var10 = new int[arg0 * arg6];
        for (int var11 = 0; var11 < this.field3016.length; var11++) {
            this.field3016[var11].method1714(arg6, arg0, -94);
        }
        int var12;
        byte var13;
        int var14;
        if (arg7) {
            var12 = -1;
            var13 = -1;
            var14 = arg0 - 1;
        } else {
            var12 = arg0;
            var14 = 0;
            var13 = 1;
        }
        int var15 = 0;
        int var16 = 0;
        if (arg1) {
            this.field3016 = null;
        }
        while (arg6 > var16) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3020.field4505) {
                int[] var22 = this.field3020.method17(var16, 255);
                var19 = var22;
                var20 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field3020.method174(var16, 5);
                var19 = var18[2];
                var20 = var18[0];
                var21 = var18[1];
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var21[var23] >> 4;
                int var26 = var19[var23] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class66.field1349[var24];
                int var28 = class66.field1349[var25];
                int var29 = class66.field1349[var26];
                var10[var15++] = (var27 << 16) + (var28 << 8) + var29;
                if (arg2) {
                    var15 += arg0 - 1;
                }
            }
            var16++;
        }
        for (int var17 = 0; var17 < this.field3016.length; var17++) {
            this.field3016[var17].method453((byte) -120);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[Loh;II[S)V")
    public static final void method1094(int arg0, class263[] arg1, int arg2, int arg3, short[] arg4) {
        field3022++;
        if (arg0 != -11564) {
            method1094(-37, (class263[]) null, 84, 74, (short[]) null);
        }
        if (arg2 >= arg3) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        class263 var6 = arg1[var5];
        int var7 = arg2;
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var6;
        short var8 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var8;
        for (int var9 = arg2; var9 < arg3; var9++) {
            if (var6 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].method1748((byte) -33, var6)) {
                class263 var10 = arg1[var9];
                arg1[var9] = arg1[var7];
                arg1[var7] = var10;
                short var11 = arg4[var9];
                arg4[var9] = arg4[var7];
                arg4[var7++] = var11;
            }
        }
        arg1[arg3] = arg1[var7];
        arg1[var7] = var6;
        arg4[arg3] = arg4[var7];
        arg4[var7] = var8;
        method1094(arg0, arg1, arg2, var7 - 1, arg4);
        method1094(-11564, arg1, var7 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1095(int arg0) {
        field3015 = null;
        if (arg0 <= 95) {
            method1097(26, 71, -97, 27, false, 125, (class267) null);
        }
        field3023 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lhc;BLue;)Z")
    public final boolean method1096(class221 arg0, byte arg1, class86 arg2) {
        field3031++;
        if (class232.field4063 <= 0) {
            for (int var4 = 0; var4 < this.field3026.length; var4++) {
                if (!arg2.method602(this.field3026[var4], 0)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3026.length; var5++) {
                if (!arg2.method597(this.field3026[var5], (byte) -113, class232.field4063)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3017.length; var6++) {
            if (!arg0.method61(-126, this.field3017[var6])) {
                return false;
            }
        }
        int var7 = 41 % ((arg1 + 89) / 32);
        return true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIZILah;)V")
    public static final void method1097(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class267 arg6) {
        field3021++;
        class120.method775(arg6.field4688, arg6.field4705, arg0, 4, arg5, arg2, arg3, arg1);
        if (!arg4) {
            method1091((byte) -53);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class166() {
        this.field3026 = new int[0];
        this.field3017 = new int[0];
        this.field3020 = new class78();
        this.field3020.field4507 = 1;
        this.field3019 = new class78();
        this.field3019.field4507 = 1;
        this.field3016 = new class260[] { this.field3020, this.field3019 };
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lsi;)V")
    public class166(class194 arg0) {
        int var2 = arg0.method1301(-8317);
        int var3 = 0;
        this.field3016 = new class260[var2];
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class260 var16 = class5.method32((byte) -117, arg0);
            if (var16.method1544(98) >= 0) {
                var3++;
            }
            if (var16.method454(2) >= 0) {
                var5++;
            }
            int var17 = var16.field4517.length;
            var4[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var4[var6][var18] = arg0.method1301(-8317);
            }
            this.field3016[var6] = var16;
        }
        this.field3026 = new int[var3];
        int var7 = 0;
        this.field3017 = new int[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class260 var11 = this.field3016[var9];
            int var12 = var11.field4517.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4517[var13] = this.field3016[var4[var9][var13]];
            }
            int var14 = var11.method1544(125);
            int var15 = var11.method454(2);
            if (var14 > 0) {
                this.field3026[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3017[var8++] = var15;
            }
            var4[var9] = null;
        }
        Object var10 = null;
        this.field3020 = this.field3016[arg0.method1301(-8317)];
        this.field3019 = this.field3016[arg0.method1301(-8317)];
    }
}
